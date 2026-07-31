package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.media3.exoplayer.rtsp.C7791f.d;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import kotlin.time.DurationKt;
import org.mozilla.classfile.ByteCode;
import p039C2.C0513S;
import p039C2.C0515a;
import p152I7.C2268b;
import p170J7.AbstractC2481A;
import p170J7.C2482B;
import p170J7.C2486F;
import p170J7.C2500U;
import p170J7.C2501V;
import p170J7.C2521j;
import p417X2.C6189a;
import p417X2.C6198j;
import p417X2.C6203o;
import p417X2.C6206r;
import p417X2.C6208t;
import p884z2.C20716v;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7789d implements Closeable {

    /* JADX INFO: renamed from: b */
    public final C7791f.b f26163b;

    /* JADX INFO: renamed from: c */
    public final C7791f.b f26164c;

    /* JADX INFO: renamed from: d */
    public final String f26165d;

    /* JADX INFO: renamed from: e */
    public final SocketFactory f26166e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<C7791f.c> f26167f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g */
    public final SparseArray<C6206r> f26168g = new SparseArray<>();

    /* JADX INFO: renamed from: h */
    public final c f26169h = new c();

    /* JADX INFO: renamed from: i */
    public Uri f26170i;

    /* JADX INFO: renamed from: j */
    public C7792g f26171j;

    /* JADX INFO: renamed from: k */
    public C7793h.a f26172k;

    /* JADX INFO: renamed from: l */
    public String f26173l;

    /* JADX INFO: renamed from: m */
    public long f26174m;

    /* JADX INFO: renamed from: n */
    public a f26175n;

    /* JADX INFO: renamed from: o */
    public C7788c f26176o;

    /* JADX INFO: renamed from: p */
    public int f26177p;

    /* JADX INFO: renamed from: q */
    public boolean f26178q;

    /* JADX INFO: renamed from: r */
    public boolean f26179r;

    /* JADX INFO: renamed from: s */
    public boolean f26180s;

    /* JADX INFO: renamed from: t */
    public long f26181t;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class a implements Runnable, Closeable {

        /* JADX INFO: renamed from: b */
        public final Handler f26182b = C0513S.m1011p(null);

        /* JADX INFO: renamed from: c */
        public final long f26183c;

        /* JADX INFO: renamed from: d */
        public boolean f26184d;

        public a(long j10) {
            this.f26183c = j10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f26184d = false;
            this.f26182b.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7789d c7789d = C7789d.this;
            c cVar = c7789d.f26169h;
            Uri uri = c7789d.f26170i;
            String str = c7789d.f26173l;
            cVar.getClass();
            cVar.m9491c(cVar.m9489a(4, str, C2501V.f8333h, uri));
            this.f26182b.postDelayed(this, this.f26183c);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class b {

        /* JADX INFO: renamed from: a */
        public final Handler f26186a = C0513S.m1011p(null);

        public b() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:14:0x004d  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: a */
        public final void m9487a(C6198j c6198j) {
            C6208t c6208tM7014a = C6208t.f20336c;
            String str = c6198j.f20319b.f20343a.get("range");
            C7789d c7789d = C7789d.this;
            if (str != null) {
                try {
                    c6208tM7014a = C6208t.m7014a(str);
                } catch (C20716v e10) {
                    c7789d.f26163b.m9503c("SDP format error.", e10);
                    return;
                }
            }
            Uri uri = c7789d.f26170i;
            C7791f.b bVar = c7789d.f26163b;
            AbstractC2481A.a aVar = new AbstractC2481A.a();
            int i10 = 0;
            while (true) {
                C2500U c2500u = c6198j.f20319b.f20344b;
                byte b10 = 1;
                if (i10 >= c2500u.f8332e) {
                    C2500U c2500uM3216f = aVar.m3216f();
                    if (c2500uM3216f.isEmpty()) {
                        bVar.m9503c("No playable track.", null);
                        return;
                    }
                    bVar.getClass();
                    long j10 = c6208tM7014a.f20339b;
                    C7791f c7791f = C7791f.this;
                    for (int i11 = 0; i11 < c2500uM3216f.f8332e; i11++) {
                        C7791f.d dVar = c7791f.new d((C6203o) c2500uM3216f.get(i11), i11, c7791f.f26200i);
                        c7791f.f26197f.add(dVar);
                        dVar.f26223b.m12821f(dVar.f26222a.f26219b, c7791f.f26195d, 0);
                    }
                    RtspMediaSource rtspMediaSource = RtspMediaSource.this;
                    rtspMediaSource.f26140l = C0513S.m982T(j10 - c6208tM7014a.f20338a);
                    rtspMediaSource.f26141m = !(j10 == -9223372036854775807L);
                    rtspMediaSource.f26142n = j10 == -9223372036854775807L;
                    rtspMediaSource.f26143o = false;
                    rtspMediaSource.m9474v();
                    c7789d.f26178q = true;
                    return;
                }
                C6189a c6189a = (C6189a) c2500u.get(i10);
                String strM2938c = C2268b.m2938c(c6189a.f20258j.f20269b);
                strM2938c.getClass();
                switch (strM2938c.hashCode()) {
                    case -1922091719:
                        if (strM2938c.equals("MPEG4-GENERIC")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 2412:
                        if (!strM2938c.equals("L8")) {
                            b10 = -1;
                        }
                        break;
                    case 64593:
                        if (strM2938c.equals("AC3")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 64934:
                        if (strM2938c.equals("AMR")) {
                            b10 = 3;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 74609:
                        if (strM2938c.equals("L16")) {
                            b10 = 4;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 85182:
                        if (strM2938c.equals("VP8")) {
                            b10 = 5;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 85183:
                        if (strM2938c.equals("VP9")) {
                            b10 = 6;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 2194728:
                        if (strM2938c.equals("H264")) {
                            b10 = 7;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 2194729:
                        if (strM2938c.equals("H265")) {
                            b10 = 8;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 2433087:
                        if (strM2938c.equals("OPUS")) {
                            b10 = 9;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 2450119:
                        if (strM2938c.equals("PCMA")) {
                            b10 = 10;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 2450139:
                        if (strM2938c.equals("PCMU")) {
                            b10 = ByteCode.T_LONG;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1061166827:
                        if (strM2938c.equals("MP4A-LATM")) {
                            b10 = 12;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1934494802:
                        if (strM2938c.equals("AMR-WB")) {
                            b10 = 13;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1959269366:
                        if (strM2938c.equals("MP4V-ES")) {
                            b10 = 14;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 2137188397:
                        if (strM2938c.equals("H263-1998")) {
                            b10 = 15;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 2137209252:
                        if (strM2938c.equals("H263-2000")) {
                            b10 = 16;
                        } else {
                            b10 = -1;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        aVar.m3326c(new C6203o(c6198j.f20318a, c6189a, uri));
                        break;
                }
                i10++;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m9488b() {
            C7789d c7789d = C7789d.this;
            C0515a.m1030f(c7789d.f26177p == 2);
            c7789d.f26177p = 1;
            c7789d.f26180s = false;
            long j10 = c7789d.f26181t;
            if (j10 != -9223372036854775807L) {
                c7789d.m9486m(C0513S.m1002g0(j10));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.d$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class c {

        /* JADX INFO: renamed from: a */
        public int f26188a;

        /* JADX INFO: renamed from: b */
        public C6206r f26189b;

        public c() {
        }

        /* JADX INFO: renamed from: a */
        public final C6206r m9489a(int i10, String str, Map<String, String> map, Uri uri) {
            C7789d c7789d = C7789d.this;
            String str2 = c7789d.f26165d;
            int i11 = this.f26188a;
            this.f26188a = i11 + 1;
            C7790e.a aVar = new C7790e.a(str2, str, i11);
            if (c7789d.f26176o != null) {
                C0515a.m1031g(c7789d.f26172k);
                try {
                    aVar.m9494a("Authorization", c7789d.f26176o.m9481a(c7789d.f26172k, uri, i10));
                } catch (C20716v e10) {
                    C7789d.m9482a(c7789d, new RtspMediaSource.C7784b(e10));
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.m9494a(entry.getKey(), entry.getValue());
            }
            return new C6206r(uri, i10, new C7790e(aVar), "");
        }

        /* JADX INFO: renamed from: b */
        public final void m9490b() {
            C0515a.m1031g(this.f26189b);
            C2482B<String, String> c2482b = this.f26189b.f20331c.f26191a;
            HashMap map = new HashMap();
            for (String str : c2482b.f8307e.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    map.put(str, (String) C2486F.m3240b(c2482b.m3222d(str)));
                }
            }
            C6206r c6206r = this.f26189b;
            m9491c(m9489a(c6206r.f20330b, C7789d.this.f26173l, map, c6206r.f20329a));
        }

        /* JADX INFO: renamed from: c */
        public final void m9491c(C6206r c6206r) {
            String strM9493b = c6206r.f20331c.m9493b("CSeq");
            strM9493b.getClass();
            int i10 = Integer.parseInt(strM9493b);
            C7789d c7789d = C7789d.this;
            SparseArray<C6206r> sparseArray = c7789d.f26168g;
            C0515a.m1030f(sparseArray.get(i10) == null);
            sparseArray.append(i10, c6206r);
            c7789d.f26171j.m9506b(C7793h.m9515f(c6206r));
            this.f26189b = c6206r;
        }
    }

    public C7789d(C7791f.b bVar, C7791f.b bVar2, String str, Uri uri, SocketFactory socketFactory) {
        Uri uriBuild;
        this.f26163b = bVar;
        this.f26164c = bVar2;
        this.f26165d = str;
        this.f26166e = socketFactory;
        Pattern pattern = C7793h.f26247a;
        if (uri.getUserInfo() == null) {
            uriBuild = uri;
        } else {
            String encodedAuthority = uri.getEncodedAuthority();
            encodedAuthority.getClass();
            C0515a.m1025a(encodedAuthority.contains("@"));
            String str2 = C0513S.f2002a;
            uriBuild = uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
        }
        this.f26170i = uriBuild;
        this.f26171j = new C7792g(new b());
        this.f26174m = DurationKt.MILLIS_IN_MINUTE;
        this.f26172k = C7793h.m9513d(uri);
        this.f26181t = -9223372036854775807L;
        this.f26177p = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m9482a(C7789d c7789d, RtspMediaSource.C7784b c7784b) {
        if (c7789d.f26178q) {
            c7789d.f26164c.m9501a(c7784b);
            return;
        }
        C7791f.b bVar = c7789d.f26163b;
        String message = c7784b.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.m9503c(message, c7784b);
    }

    /* JADX INFO: renamed from: b */
    public final void m9483b() {
        long jM1002g0;
        C7791f.c cVarPollFirst = this.f26167f.pollFirst();
        if (cVarPollFirst == null) {
            C7791f c7791f = C7791f.this;
            long j10 = c7791f.f26206o;
            if (j10 != -9223372036854775807L) {
                jM1002g0 = C0513S.m1002g0(j10);
            } else {
                long j11 = c7791f.f26207p;
                jM1002g0 = j11 != -9223372036854775807L ? C0513S.m1002g0(j11) : 0L;
            }
            c7791f.f26196e.m9486m(jM1002g0);
            return;
        }
        Uri uri = cVarPollFirst.f26219b.f26148b.f20324b;
        C0515a.m1031g(cVarPollFirst.f26220c);
        String str = cVarPollFirst.f26220c;
        String str2 = this.f26173l;
        c cVar = this.f26169h;
        C7789d.this.f26177p = 0;
        C2521j.m3275a("Transport", str);
        cVar.m9491c(cVar.m9489a(10, str2, C2501V.m3255g(1, new Object[]{"Transport", str}, null), uri));
    }

    /* JADX INFO: renamed from: c */
    public final Socket m9484c(Uri uri) {
        C0515a.m1025a(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f26166e.createSocket(host, port);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f26175n;
        if (aVar != null) {
            aVar.close();
            this.f26175n = null;
            Uri uri = this.f26170i;
            String str = this.f26173l;
            str.getClass();
            c cVar = this.f26169h;
            C7789d c7789d = C7789d.this;
            int i10 = c7789d.f26177p;
            if (i10 != -1 && i10 != 0) {
                c7789d.f26177p = 0;
                cVar.m9491c(cVar.m9489a(12, str, C2501V.f8333h, uri));
            }
        }
        this.f26171j.close();
    }

    /* JADX INFO: renamed from: l */
    public final void m9485l(long j10) {
        if (this.f26177p == 2 && !this.f26180s) {
            Uri uri = this.f26170i;
            String str = this.f26173l;
            str.getClass();
            c cVar = this.f26169h;
            C7789d c7789d = C7789d.this;
            C0515a.m1030f(c7789d.f26177p == 2);
            cVar.m9491c(cVar.m9489a(5, str, C2501V.f8333h, uri));
            c7789d.f26180s = true;
        }
        this.f26181t = j10;
    }

    /* JADX INFO: renamed from: m */
    public final void m9486m(long j10) {
        Uri uri = this.f26170i;
        String str = this.f26173l;
        str.getClass();
        c cVar = this.f26169h;
        int i10 = C7789d.this.f26177p;
        C0515a.m1030f(i10 == 1 || i10 == 2);
        C6208t c6208t = C6208t.f20336c;
        Object[] objArr = {Double.valueOf(j10 / 1000.0d)};
        String str2 = C0513S.f2002a;
        cVar.m9491c(cVar.m9489a(6, str, C2501V.m3255g(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
