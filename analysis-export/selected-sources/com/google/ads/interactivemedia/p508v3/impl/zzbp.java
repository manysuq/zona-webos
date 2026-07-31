package com.google.ads.interactivemedia.p508v3.impl;

import com.google.ads.interactivemedia.p508v3.impl.data.zzbx;
import com.google.ads.interactivemedia.p508v3.impl.data.zzby;
import com.google.ads.interactivemedia.p508v3.impl.data.zzbz;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzbp implements zzbq {
    private zzbp() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00a8: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:169), block:B:42:0x00a8 */
    @Override // com.google.ads.interactivemedia.p508v3.impl.zzbq
    public final zzbz zza(zzby zzbyVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        IOException e10;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(zzbyVar.url()).openConnection();
                try {
                    httpURLConnection.setRequestProperty("User-Agent", zzbyVar.userAgent());
                    httpURLConnection.setConnectTimeout(zzbyVar.connectionTimeoutMs());
                    httpURLConnection.setReadTimeout(zzbyVar.readTimeoutMs());
                    if (zzbyVar.requestType() == zzbx.POST) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setChunkedStreamingMode(0);
                        String strContent = zzbyVar.content();
                        if (strContent != null) {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(strContent.getBytes(StandardCharsets.UTF_8));
                                outputStream.close();
                            } catch (Throwable th) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                        StringBuilder sb2 = new StringBuilder();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, StandardCharsets.UTF_8));
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        }
                        String string = sb2.toString();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        String contentType = httpURLConnection.getContentType();
                        httpURLConnection.disconnect();
                        return zzbz.forResponse(zzbyVar.mo10389id(), string, contentType);
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (IOException e11) {
                    e10 = e11;
                    zzbz zzbzVarForError = e10 instanceof SocketTimeoutException ? zzbz.forError(zzbyVar.mo10389id(), 101) : zzbz.forError(zzbyVar.mo10389id(), 100);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return zzbzVarForError;
                }
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection3 = httpURLConnection2;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                throw th;
            }
        } catch (IOException e12) {
            httpURLConnection = null;
            e10 = e12;
        } catch (Throwable th6) {
            th = th6;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
            throw th;
        }
    }

    public /* synthetic */ zzbp(zzbo zzboVar) {
    }
}
