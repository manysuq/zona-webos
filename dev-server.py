#!/usr/bin/env python3
import json
import os
import random
import ssl
import struct
import sys
import time
import urllib.error
import urllib.parse
import urllib.request
from http.server import SimpleHTTPRequestHandler, ThreadingHTTPServer

ROOT = os.path.dirname(os.path.abspath(__file__))
APK = os.path.join(ROOT, 'zona5.apk')
HOSTS = ('https://api1.mzona.net', 'https://apiw1.mzona.net')
MOD = 65521
_cache = {}


def zona_cookie(now_ms):
    day = now_ms // 86400000
    if day not in _cache:
        a, b = 1, 0
        with open(APK, 'rb') as source:
            while True:
                chunk = source.read(1024 * 1024)
                if not chunk:
                    break
                for value in chunk:
                    signed = value if value < 128 else value - 256
                    a = (a + ((signed + day) % 256)) % MOD
                    b = (b + a) % MOD
        _cache.clear()
        _cache[day] = ((b << 16) + a) & 0xffffffffffffffff
    checksum = _cache[day]
    seconds = (now_ms // 1000) & 0xffffffff
    mask = random.getrandbits(64)
    for bit in range(32):
        target = 1 << (bit * 2 + 1)
        if seconds & (1 << bit):
            mask |= target
        else:
            mask &= ~target
    mask &= ~0x100
    mask &= 0xffffffffffffffff
    return struct.pack('>QQ', mask, checksum ^ mask).hex()


class Handler(SimpleHTTPRequestHandler):
    def translate_path(self, path):
        original = super().translate_path(path)
        relative = os.path.relpath(original, os.getcwd())
        return os.path.join(ROOT, relative)

    def do_GET(self):
        parsed = urllib.parse.urlsplit(self.path)
        if parsed.path != '/zona-api':
            return super().do_GET()
        query = urllib.parse.parse_qs(parsed.query)
        endpoint = query.get('endpoint', [''])[0]
        params = query.get('params', ['{}'])[0]
        if not endpoint.startswith('/') or '..' in endpoint:
            return self.reply(400, b'{"message":"Invalid endpoint"}')
        now_ms = int(time.time() * 1000)
        cookie = zona_cookie(now_ms)
        errors = []
        for host in HOSTS:
            url = host + endpoint + '?' + urllib.parse.urlencode({
                'params': params,
                'client_time': str(now_ms),
            })
            request = urllib.request.Request(url, headers={
                'Accept': 'application/json',
                'Accept-Encoding': 'gzip',
                'Cookie': 's=' + cookie,
                'User-Agent': 'Mozilla/5.0 (Linux; Android 11; Android TV) Zona/3.0.65',
            })
            try:
                with urllib.request.urlopen(request, timeout=15, context=ssl.create_default_context()) as response:
                    return self.reply(response.status, response.read(), response.headers.get_content_type())
            except urllib.error.HTTPError as error:
                body = error.read()
                errors.append('%s: HTTP %s %s' % (host, error.code, body[:160].decode('utf-8', 'replace')))
            except Exception as error:
                errors.append('%s: %s' % (host, error))
        body = json.dumps({'message': 'Zona API request failed', 'details': errors}, ensure_ascii=False).encode('utf-8')
        self.reply(502, body)

    def reply(self, status, body, content_type='application/json'):
        self.send_response(status)
        self.send_header('Content-Type', content_type + ('; charset=utf-8' if content_type.startswith('text/') or content_type == 'application/json' else ''))
        self.send_header('Content-Length', str(len(body)))
        self.send_header('Cache-Control', 'no-store')
        self.end_headers()
        self.wfile.write(body)


if __name__ == '__main__':
    if not os.path.isfile(APK):
        raise SystemExit('zona5.apk not found next to dev-server.py')
    port = int(sys.argv[1]) if len(sys.argv) > 1 else 8080
    os.chdir(ROOT)
    print('Zona development server: http://127.0.0.1:%d' % port)
    ThreadingHTTPServer(('0.0.0.0', port), Handler).serve_forever()
