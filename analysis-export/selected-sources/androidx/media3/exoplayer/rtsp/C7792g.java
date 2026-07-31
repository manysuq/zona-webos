package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.media3.exoplayer.rtsp.C7788c;
import androidx.media3.exoplayer.rtsp.C7789d;
import androidx.media3.exoplayer.rtsp.C7789d.a;
import androidx.media3.exoplayer.rtsp.C7790e;
import androidx.media3.exoplayer.rtsp.C7791f;
import androidx.media3.exoplayer.rtsp.C7792g;
import androidx.media3.exoplayer.rtsp.C7793h;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p039C2.C0513S;
import p039C2.C0515a;
import p152I7.C2271e;
import p170J7.AbstractC2481A;
import p170J7.AbstractC2517f0;
import p170J7.C2482B;
import p170J7.C2500U;
import p170J7.C2501V;
import p224M7.C3512b;
import p535e3.C10745k;
import p623j$.util.DesugarCollections;
import p623j$.util.Objects;
import p884z2.C20716v;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7792g implements Closeable {

    /* JADX INFO: renamed from: h */
    public static final Charset f26230h = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: b */
    public final C7789d.b f26231b;

    /* JADX INFO: renamed from: c */
    public final C10745k f26232c = new C10745k("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: d */
    public final Map<Integer, a> f26233d = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e */
    public e f26234e;

    /* JADX INFO: renamed from: f */
    public Socket f26235f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f26236g;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface a {
        /* JADX INFO: renamed from: k */
        void mo9507k(byte[] bArr);
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.g$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final ArrayList f26237a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f26238b = 1;

        /* JADX INFO: renamed from: c */
        public long f26239c;

        /* JADX INFO: renamed from: b */
        public static byte[] m9508b(byte b10, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b10, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b11 = dataInputStream.readByte();
                bArr[1] = b11;
                byteArrayOutputStream.write(b11);
            }
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2481A<String> m9509a(byte[] bArr) throws C20716v {
            long j10;
            C0515a.m1025a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, C7792g.f26230h);
            ArrayList arrayList = this.f26237a;
            arrayList.add(str);
            int i10 = this.f26238b;
            if (i10 == 1) {
                if (!C7793h.f26247a.matcher(str).matches() && !C7793h.f26248b.matcher(str).matches()) {
                    return null;
                }
                this.f26238b = 2;
                return null;
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            try {
                Matcher matcher = C7793h.f26249c.matcher(str);
                if (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    j10 = Long.parseLong(strGroup);
                } else {
                    j10 = -1;
                }
                if (j10 != -1) {
                    this.f26239c = j10;
                }
                if (!str.isEmpty()) {
                    return null;
                }
                if (this.f26239c > 0) {
                    this.f26238b = 3;
                    return null;
                }
                AbstractC2481A<String> abstractC2481AM3204n = AbstractC2481A.m3204n(arrayList);
                arrayList.clear();
                this.f26238b = 1;
                this.f26239c = 0L;
                return abstractC2481AM3204n;
            } catch (NumberFormatException e10) {
                throw C20716v.m25337b(e10, str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.g$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class d implements C10745k.d {

        /* JADX INFO: renamed from: a */
        public final DataInputStream f26240a;

        /* JADX INFO: renamed from: b */
        public final c f26241b = new c();

        /* JADX INFO: renamed from: c */
        public volatile boolean f26242c;

        public d(InputStream inputStream) {
            this.f26240a = new DataInputStream(inputStream);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x009f  */
        @Override // p535e3.C10745k.d
        /* JADX INFO: renamed from: a */
        public final void mo5122a() throws IOException {
            String str;
            while (!this.f26242c) {
                byte b10 = this.f26240a.readByte();
                if (b10 == 36) {
                    int unsignedByte = this.f26240a.readUnsignedByte();
                    int unsignedShort = this.f26240a.readUnsignedShort();
                    byte[] bArr = new byte[unsignedShort];
                    this.f26240a.readFully(bArr, 0, unsignedShort);
                    a aVar = C7792g.this.f26233d.get(Integer.valueOf(unsignedByte));
                    if (aVar != null && !C7792g.this.f26236g) {
                        aVar.mo9507k(bArr);
                    }
                } else if (C7792g.this.f26236g) {
                    continue;
                } else {
                    final C7789d.b bVar = C7792g.this.f26231b;
                    c cVar = this.f26241b;
                    DataInputStream dataInputStream = this.f26240a;
                    cVar.getClass();
                    final AbstractC2481A<String> abstractC2481AM9509a = cVar.m9509a(c.m9508b(b10, dataInputStream));
                    while (abstractC2481AM9509a == null) {
                        if (cVar.f26238b == 3) {
                            long j10 = cVar.f26239c;
                            if (j10 <= 0) {
                                throw new IllegalStateException("Expects a greater than zero Content-Length.");
                            }
                            int iM4290b = C3512b.m4290b(j10);
                            C0515a.m1030f(iM4290b != -1);
                            byte[] bArr2 = new byte[iM4290b];
                            dataInputStream.readFully(bArr2, 0, iM4290b);
                            ArrayList arrayList = cVar.f26237a;
                            C0515a.m1030f(cVar.f26238b == 3);
                            if (iM4290b > 0) {
                                int i10 = iM4290b - 1;
                                if (bArr2[i10] == 10) {
                                    if (iM4290b > 1) {
                                        int i11 = iM4290b - 2;
                                        if (bArr2[i11] == 13) {
                                            str = new String(bArr2, 0, i11, C7792g.f26230h);
                                        } else {
                                            str = new String(bArr2, 0, i10, C7792g.f26230h);
                                        }
                                    } else {
                                        str = new String(bArr2, 0, i10, C7792g.f26230h);
                                    }
                                    arrayList.add(str);
                                    abstractC2481AM9509a = AbstractC2481A.m3204n(arrayList);
                                    cVar.f26237a.clear();
                                    cVar.f26238b = 1;
                                    cVar.f26239c = 0L;
                                }
                            }
                            throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                        }
                        abstractC2481AM9509a = cVar.m9509a(c.m9508b(dataInputStream.readByte(), dataInputStream));
                    }
                    bVar.f26186a.post(new Runnable() { // from class: X2.i
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str2;
                            C2500U c2500uM7015a;
                            C7789d.b bVar2 = bVar;
                            C7789d c7789d = C7789d.this;
                            c7789d.getClass();
                            C7789d.c cVar2 = c7789d.f26169h;
                            SparseArray<C6206r> sparseArray = c7789d.f26168g;
                            Pattern pattern = C7793h.f26248b;
                            AbstractC2481A abstractC2481A = abstractC2481AM9509a;
                            if (!pattern.matcher((CharSequence) abstractC2481A.get(0)).matches()) {
                                Matcher matcher = C7793h.f26247a.matcher((CharSequence) abstractC2481A.get(0));
                                C0515a.m1025a(matcher.matches());
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                C7793h.m9510a(strGroup);
                                String strGroup2 = matcher.group(2);
                                strGroup2.getClass();
                                Uri.parse(strGroup2);
                                int iIndexOf = abstractC2481A.indexOf("");
                                C0515a.m1025a(iIndexOf > 0);
                                List listSubList = abstractC2481A.subList(1, iIndexOf);
                                C7790e.a aVar2 = new C7790e.a();
                                aVar2.m9495b(listSubList);
                                C7790e c7790e = new C7790e(aVar2);
                                new C2271e(C7793h.f26254h).m2941b(abstractC2481A.subList(iIndexOf + 1, abstractC2481A.size()));
                                String strM9493b = c7790e.m9493b("CSeq");
                                strM9493b.getClass();
                                int i12 = Integer.parseInt(strM9493b);
                                C7789d c7789d2 = C7789d.this;
                                C6207s c6207s = new C6207s(405, new C7790e(new C7790e.a(c7789d2.f26165d, c7789d2.f26173l, i12)), "");
                                C7790e c7790e2 = c6207s.f20334b;
                                C0515a.m1025a(c7790e2.m9493b("CSeq") != null);
                                AbstractC2481A.a aVar3 = new AbstractC2481A.a();
                                int i13 = c6207s.f20333a;
                                if (i13 == 200) {
                                    str2 = "OK";
                                } else if (i13 == 461) {
                                    str2 = "Unsupported Transport";
                                } else if (i13 == 500) {
                                    str2 = "Internal Server Error";
                                } else if (i13 == 505) {
                                    str2 = "RTSP Version Not Supported";
                                } else if (i13 == 301) {
                                    str2 = "Move Permanently";
                                } else if (i13 == 302) {
                                    str2 = "Move Temporarily";
                                } else if (i13 == 400) {
                                    str2 = "Bad Request";
                                } else if (i13 == 401) {
                                    str2 = "Unauthorized";
                                } else if (i13 == 404) {
                                    str2 = "Not Found";
                                } else if (i13 != 405) {
                                    switch (i13) {
                                        case 454:
                                            str2 = "Session Not Found";
                                            break;
                                        case 455:
                                            str2 = "Method Not Valid In This State";
                                            break;
                                        case 456:
                                            str2 = "Header Field Not Valid";
                                            break;
                                        case 457:
                                            str2 = "Invalid Range";
                                            break;
                                        default:
                                            throw new IllegalArgumentException();
                                    }
                                } else {
                                    str2 = "Method Not Allowed";
                                }
                                String str3 = C0513S.f2002a;
                                Locale locale = Locale.US;
                                aVar3.m3326c("RTSP/1.0 " + i13 + " " + str2);
                                C2482B<String, String> c2482b = c7790e2.f26191a;
                                AbstractC2517f0<String> it = c2482b.f8307e.keySet().iterator();
                                while (it.hasNext()) {
                                    String next = it.next();
                                    AbstractC2481A abstractC2481AM3222d = c2482b.m3222d(next);
                                    for (int i14 = 0; i14 < abstractC2481AM3222d.size(); i14++) {
                                        aVar3.m3326c(String.format(Locale.US, "%s: %s", next, abstractC2481AM3222d.get(i14)));
                                    }
                                }
                                aVar3.m3326c("");
                                aVar3.m3326c(c6207s.f20335c);
                                c7789d2.f26171j.m9506b(aVar3.m3216f());
                                cVar2.f26188a = Math.max(cVar2.f26188a, i12 + 1);
                                return;
                            }
                            Matcher matcher2 = pattern.matcher((CharSequence) abstractC2481A.get(0));
                            C0515a.m1025a(matcher2.matches());
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            int i15 = Integer.parseInt(strGroup3);
                            int iIndexOf2 = abstractC2481A.indexOf("");
                            C0515a.m1025a(iIndexOf2 > 0);
                            List listSubList2 = abstractC2481A.subList(1, iIndexOf2);
                            C7790e.a aVar4 = new C7790e.a();
                            aVar4.m9495b(listSubList2);
                            C7790e c7790e3 = new C7790e(aVar4);
                            String strM2941b = new C2271e(C7793h.f26254h).m2941b(abstractC2481A.subList(iIndexOf2 + 1, abstractC2481A.size()));
                            String strM9493b2 = c7790e3.m9493b("CSeq");
                            strM9493b2.getClass();
                            int i16 = Integer.parseInt(strM9493b2);
                            C7791f.b bVar3 = c7789d.f26163b;
                            C6206r c6206r = sparseArray.get(i16);
                            if (c6206r == null) {
                                return;
                            }
                            sparseArray.remove(i16);
                            int i17 = c6206r.f20330b;
                            try {
                                try {
                                    if (i15 == 200) {
                                        switch (i17) {
                                            case 1:
                                            case 3:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 11:
                                            case 12:
                                                return;
                                            case 2:
                                                bVar2.m9487a(new C6198j(c7790e3, C6211w.m7017a(strM2941b)));
                                                return;
                                            case 4:
                                                AbstractC2481A abstractC2481AM3204n = AbstractC2481A.m3204n(C7793h.m9511b(c7790e3.m9493b("Public")));
                                                if (c7789d.f26175n != null) {
                                                    return;
                                                }
                                                if (!abstractC2481AM3204n.isEmpty() && !abstractC2481AM3204n.contains(2)) {
                                                    bVar3.m9503c("DESCRIBE not supported.", null);
                                                    return;
                                                }
                                                Uri uri = c7789d.f26170i;
                                                String str4 = c7789d.f26173l;
                                                cVar2.getClass();
                                                cVar2.m9491c(cVar2.m9489a(2, str4, C2501V.m3255g(1, new Object[]{"Accept", "application/sdp"}, null), uri));
                                                return;
                                            case 5:
                                                bVar2.m9488b();
                                                return;
                                            case 6:
                                                String strM9493b3 = c7790e3.m9493b("Range");
                                                C6208t c6208tM7014a = strM9493b3 == null ? C6208t.f20336c : C6208t.m7014a(strM9493b3);
                                                try {
                                                    String strM9493b4 = c7790e3.m9493b("RTP-Info");
                                                    if (strM9493b4 == null) {
                                                        AbstractC2481A.b bVar4 = AbstractC2481A.f8293c;
                                                        c2500uM7015a = C2500U.f8330f;
                                                    } else {
                                                        c2500uM7015a = C6209u.m7015a(c7789d.f26170i, strM9493b4);
                                                    }
                                                } catch (C20716v unused) {
                                                    AbstractC2481A.b bVar5 = AbstractC2481A.f8293c;
                                                    c2500uM7015a = C2500U.f8330f;
                                                }
                                                AbstractC2481A<C6209u> abstractC2481AM3204n2 = AbstractC2481A.m3204n(c2500uM7015a);
                                                int i18 = c7789d.f26177p;
                                                C0515a.m1030f(i18 == 1 || i18 == 2);
                                                c7789d.f26177p = 2;
                                                if (c7789d.f26175n == null) {
                                                    long j11 = c7789d.f26174m / 2;
                                                    C7789d.a aVar5 = c7789d.new a(j11);
                                                    c7789d.f26175n = aVar5;
                                                    if (!aVar5.f26184d) {
                                                        aVar5.f26184d = true;
                                                        aVar5.f26182b.postDelayed(aVar5, j11);
                                                    }
                                                }
                                                c7789d.f26181t = -9223372036854775807L;
                                                c7789d.f26164c.m9502b(C0513S.m982T(c6208tM7014a.f20338a), abstractC2481AM3204n2);
                                                return;
                                            case 10:
                                                String strM9493b5 = c7790e3.m9493b("Session");
                                                String strM9493b6 = c7790e3.m9493b("Transport");
                                                if (strM9493b5 == null || strM9493b6 == null) {
                                                    throw C20716v.m25337b(null, "Missing mandatory session or transport header");
                                                }
                                                C7793h.b bVarM9512c = C7793h.m9512c(strM9493b5);
                                                C0515a.m1030f(c7789d.f26177p != -1);
                                                c7789d.f26177p = 1;
                                                c7789d.f26173l = bVarM9512c.f26257a;
                                                c7789d.f26174m = bVarM9512c.f26258b;
                                                c7789d.m9483b();
                                                return;
                                            default:
                                                throw new IllegalStateException();
                                        }
                                    }
                                    if (i15 == 401) {
                                        if (c7789d.f26172k == null || c7789d.f26179r) {
                                            C7789d.m9482a(c7789d, new RtspMediaSource.C7784b(C7793h.m9516g(i17) + " " + i15));
                                            return;
                                        }
                                        AbstractC2481A abstractC2481AM3222d2 = c7790e3.f26191a.m3222d(C7790e.m9492a("WWW-Authenticate"));
                                        if (abstractC2481AM3222d2.isEmpty()) {
                                            throw C20716v.m25337b(null, "Missing WWW-Authenticate header in a 401 response.");
                                        }
                                        for (int i19 = 0; i19 < abstractC2481AM3222d2.size(); i19++) {
                                            C7788c c7788cM9514e = C7793h.m9514e((String) abstractC2481AM3222d2.get(i19));
                                            c7789d.f26176o = c7788cM9514e;
                                            if (c7788cM9514e.f26159a == 2) {
                                                break;
                                            }
                                        }
                                        cVar2.m9490b();
                                        c7789d.f26179r = true;
                                        return;
                                    }
                                    if (i15 == 461) {
                                        String str5 = C7793h.m9516g(i17) + " " + i15;
                                        String strM9493b7 = c6206r.f20331c.m9493b("Transport");
                                        strM9493b7.getClass();
                                        C7789d.m9482a(c7789d, (i17 != 10 || strM9493b7.contains("TCP")) ? new RtspMediaSource.C7784b(str5) : new RtspMediaSource.C7785c(str5));
                                        return;
                                    }
                                    if (i15 != 301 && i15 != 302) {
                                        C7789d.m9482a(c7789d, new RtspMediaSource.C7784b(C7793h.m9516g(i17) + " " + i15));
                                        return;
                                    }
                                    if (c7789d.f26177p != -1) {
                                        c7789d.f26177p = 0;
                                    }
                                    String strM9493b8 = c7790e3.m9493b("Location");
                                    if (strM9493b8 == null) {
                                        bVar3.m9503c("Redirection without new location.", null);
                                        return;
                                    }
                                    Uri uri2 = Uri.parse(strM9493b8);
                                    c7789d.f26170i = uri2;
                                    C7793h.a aVarM9513d = C7793h.m9513d(uri2);
                                    if (aVarM9513d != null) {
                                        c7789d.f26172k = aVarM9513d;
                                    }
                                    Uri uri3 = c7789d.f26170i;
                                    String str6 = c7789d.f26173l;
                                    cVar2.getClass();
                                    cVar2.m9491c(cVar2.m9489a(2, str6, C2501V.m3255g(1, new Object[]{"Accept", "application/sdp"}, null), uri3));
                                } catch (IllegalArgumentException e10) {
                                    e = e10;
                                    C7789d.m9482a(c7789d, new RtspMediaSource.C7784b(e));
                                }
                            } catch (C20716v e11) {
                                e = e11;
                                C7789d.m9482a(c7789d, new RtspMediaSource.C7784b(e));
                            }
                        }
                    });
                }
            }
        }

        @Override // p535e3.C10745k.d
        /* JADX INFO: renamed from: b */
        public final void mo5123b() {
            this.f26242c = true;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.g$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class e implements Closeable {

        /* JADX INFO: renamed from: b */
        public final OutputStream f26244b;

        /* JADX INFO: renamed from: c */
        public final HandlerThread f26245c;

        /* JADX INFO: renamed from: d */
        public final Handler f26246d;

        public e(C7792g c7792g, OutputStream outputStream) {
            this.f26244b = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f26245c = handlerThread;
            handlerThread.start();
            this.f26246d = new Handler(handlerThread.getLooper());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            final HandlerThread handlerThread = this.f26245c;
            Objects.requireNonNull(handlerThread);
            this.f26246d.post(new Runnable() { // from class: X2.p
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                handlerThread.join();
            } catch (InterruptedException unused) {
                handlerThread.interrupt();
            }
        }
    }

    public C7792g(C7789d.b bVar) {
        this.f26231b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9505a(Socket socket) {
        this.f26235f = socket;
        this.f26234e = new e(this, socket.getOutputStream());
        this.f26232c.m12821f(new d(socket.getInputStream()), new b(), 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m9506b(final C2500U c2500u) {
        C0515a.m1031g(this.f26234e);
        final e eVar = this.f26234e;
        eVar.getClass();
        final byte[] bytes = new C2271e(C7793h.f26254h).m2941b(c2500u).getBytes(f26230h);
        eVar.f26246d.post(new Runnable() { // from class: X2.q
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArr = bytes;
                C7792g.e eVar2 = eVar;
                eVar2.getClass();
                try {
                    eVar2.f26244b.write(bArr);
                } catch (Exception unused) {
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f26236g) {
            return;
        }
        try {
            e eVar = this.f26234e;
            if (eVar != null) {
                eVar.close();
            }
            this.f26232c.m12820e(null);
            Socket socket = this.f26235f;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f26236g = true;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.g$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class b implements C10745k.a<d> {
        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: l */
        public final /* bridge */ /* synthetic */ void mo5150l(C10745k.d dVar, long j10, long j11) {
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: n */
        public final C10745k.b mo5152n(C10745k.d dVar, long j10, long j11, IOException iOException, int i10) {
            return C10745k.f33368e;
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: o */
        public final /* bridge */ /* synthetic */ void mo5153o(C10745k.d dVar, long j10, long j11, boolean z10) {
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void mo5148j(C10745k.d dVar, long j10, long j11, int i10) {
        }
    }
}
