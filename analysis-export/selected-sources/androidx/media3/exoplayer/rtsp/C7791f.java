package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.C7773g;
import androidx.media3.exoplayer.rtsp.C7789d.b;
import androidx.media3.exoplayer.rtsp.C7791f;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import kotlin.jvm.internal.LongCompanionObject;
import p039C2.C0513S;
import p039C2.C0515a;
import p165J2.C2457g;
import p170J7.AbstractC2481A;
import p170J7.C2500U;
import p170J7.C2501V;
import p183K2.C2748T0;
import p183K2.C2785n0;
import p417X2.C6191c;
import p417X2.C6201m;
import p417X2.C6203o;
import p417X2.C6209u;
import p453Z2.C6656Y;
import p453Z2.C6677j0;
import p453Z2.InterfaceC6657Z;
import p453Z2.InterfaceC6694y;
import p517d3.InterfaceC10325q;
import p535e3.C10739e;
import p535e3.C10745k;
import p601i3.InterfaceC12005G;
import p601i3.InterfaceC12011M;
import p601i3.InterfaceC12032r;
import p724p.C17490h;
import p884z2.C20687B;
import p884z2.C20708n;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.f */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7791f implements InterfaceC6694y {

    /* JADX INFO: renamed from: b */
    public final C10739e f26193b;

    /* JADX INFO: renamed from: c */
    public final Handler f26194c = C0513S.m1011p(null);

    /* JADX INFO: renamed from: d */
    public final b f26195d;

    /* JADX INFO: renamed from: e */
    public final C7789d f26196e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f26197f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f26198g;

    /* JADX INFO: renamed from: h */
    public final RtspMediaSource.C7783a f26199h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC7786a.a f26200i;

    /* JADX INFO: renamed from: j */
    public InterfaceC6694y.a f26201j;

    /* JADX INFO: renamed from: k */
    public C2500U f26202k;

    /* JADX INFO: renamed from: l */
    public IOException f26203l;

    /* JADX INFO: renamed from: m */
    public RtspMediaSource.C7784b f26204m;

    /* JADX INFO: renamed from: n */
    public long f26205n;

    /* JADX INFO: renamed from: o */
    public long f26206o;

    /* JADX INFO: renamed from: p */
    public long f26207p;

    /* JADX INFO: renamed from: q */
    public boolean f26208q;

    /* JADX INFO: renamed from: r */
    public boolean f26209r;

    /* JADX INFO: renamed from: s */
    public boolean f26210s;

    /* JADX INFO: renamed from: t */
    public boolean f26211t;

    /* JADX INFO: renamed from: u */
    public boolean f26212u;

    /* JADX INFO: renamed from: v */
    public int f26213v;

    /* JADX INFO: renamed from: w */
    public boolean f26214w;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.f$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final C6203o f26218a;

        /* JADX INFO: renamed from: b */
        public final C7787b f26219b;

        /* JADX INFO: renamed from: c */
        public String f26220c;

        public c(C6203o c6203o, int i10, C6656Y c6656y, InterfaceC7786a.a aVar) {
            this.f26218a = c6203o;
            this.f26219b = new C7787b(i10, c6203o, new C6201m(this), C7791f.this.new a(c6656y), aVar);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.f$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final c f26222a;

        /* JADX INFO: renamed from: b */
        public final C10745k f26223b;

        /* JADX INFO: renamed from: c */
        public final C6656Y f26224c;

        /* JADX INFO: renamed from: d */
        public boolean f26225d;

        /* JADX INFO: renamed from: e */
        public boolean f26226e;

        public d(C6203o c6203o, int i10, InterfaceC7786a.a aVar) {
            this.f26223b = new C10745k(C17490h.m19873a(i10, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
            C6656Y c6656y = new C6656Y(C7791f.this.f26193b, null, null);
            this.f26224c = c6656y;
            this.f26222a = C7791f.this.new c(c6203o, i10, c6656y, aVar);
            c6656y.f21875f = C7791f.this.f26195d;
        }

        /* JADX INFO: renamed from: a */
        public final void m9504a() {
            if (this.f26225d) {
                return;
            }
            this.f26222a.f26219b.f26156j = true;
            this.f26225d = true;
            C7791f.m9496a(C7791f.this);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.f$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class e implements InterfaceC6657Z {

        /* JADX INFO: renamed from: b */
        public final int f26228b;

        public e(int i10) {
            this.f26228b = i10;
        }

        @Override // p453Z2.InterfaceC6657Z
        /* JADX INFO: renamed from: a */
        public final void mo4359a() throws RtspMediaSource.C7784b {
            RtspMediaSource.C7784b c7784b = C7791f.this.f26204m;
            if (c7784b != null) {
                throw c7784b;
            }
        }

        @Override // p453Z2.InterfaceC6657Z
        /* JADX INFO: renamed from: e */
        public final int mo4361e(C2785n0 c2785n0, C2457g c2457g, int i10) {
            C7791f c7791f = C7791f.this;
            if (c7791f.f26209r) {
                return -3;
            }
            d dVar = (d) c7791f.f26197f.get(this.f26228b);
            return dVar.f26224c.m7487C(c2785n0, c2457g, i10, dVar.f26225d);
        }

        @Override // p453Z2.InterfaceC6657Z
        /* JADX INFO: renamed from: h */
        public final int mo4362h(long j10) throws Throwable {
            C7791f c7791f = C7791f.this;
            if (c7791f.f26209r) {
                return -3;
            }
            d dVar = (d) c7791f.f26197f.get(this.f26228b);
            C6656Y c6656y = dVar.f26224c;
            int iM7508v = c6656y.m7508v(j10, dVar.f26225d);
            c6656y.m7493I(iM7508v);
            return iM7508v;
        }

        @Override // p453Z2.InterfaceC6657Z
        public final boolean isReady() {
            C7791f c7791f = C7791f.this;
            if (c7791f.f26209r) {
                return false;
            }
            d dVar = (d) c7791f.f26197f.get(this.f26228b);
            return dVar.f26224c.m7510x(dVar.f26225d);
        }
    }

    public C7791f(C10739e c10739e, InterfaceC7786a.a aVar, Uri uri, RtspMediaSource.C7783a c7783a, String str, SocketFactory socketFactory) {
        this.f26193b = c10739e;
        this.f26200i = aVar;
        this.f26199h = c7783a;
        b bVar = new b();
        this.f26195d = bVar;
        this.f26196e = new C7789d(bVar, bVar, str, uri, socketFactory);
        this.f26197f = new ArrayList();
        this.f26198g = new ArrayList();
        this.f26206o = -9223372036854775807L;
        this.f26205n = -9223372036854775807L;
        this.f26207p = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public static void m9496a(C7791f c7791f) {
        ArrayList arrayList = c7791f.f26197f;
        c7791f.f26208q = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c7791f.f26208q &= ((d) arrayList.get(i10)).f26225d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static void m9497e(C7791f c7791f) {
        ArrayList arrayList = c7791f.f26197f;
        if (c7791f.f26210s || c7791f.f26211t) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((d) arrayList.get(i10)).f26224c.m7509w() == null) {
                return;
            }
        }
        c7791f.f26211t = true;
        AbstractC2481A abstractC2481AM3204n = AbstractC2481A.m3204n(arrayList);
        AbstractC2481A.a aVar = new AbstractC2481A.a();
        for (int i11 = 0; i11 < abstractC2481AM3204n.size(); i11++) {
            C6656Y c6656y = ((d) abstractC2481AM3204n.get(i11)).f26224c;
            String string = Integer.toString(i11);
            C20708n c20708nM7509w = c6656y.m7509w();
            c20708nM7509w.getClass();
            aVar.m3326c(new C20687B(string, c20708nM7509w));
        }
        c7791f.f26202k = aVar.m3216f();
        InterfaceC6694y.a aVar2 = c7791f.f26201j;
        aVar2.getClass();
        aVar2.mo7447e(c7791f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static void m9498g(C7791f c7791f) {
        ArrayList arrayList = c7791f.f26198g;
        ArrayList arrayList2 = c7791f.f26197f;
        c7791f.f26214w = true;
        C7789d c7789d = c7791f.f26196e;
        c7789d.getClass();
        try {
            c7789d.close();
            C7792g c7792g = new C7792g(c7789d.new b());
            c7789d.f26171j = c7792g;
            c7792g.m9505a(c7789d.m9484c(c7789d.f26170i));
            c7789d.f26173l = null;
            c7789d.f26179r = false;
            c7789d.f26176o = null;
        } catch (IOException e10) {
            c7789d.f26164c.m9501a(new RtspMediaSource.C7784b(e10));
        }
        InterfaceC7786a.a aVarMo9480b = c7791f.f26200i.mo9480b();
        if (aVarMo9480b == null) {
            c7791f.f26204m = new RtspMediaSource.C7784b("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            d dVar = (d) arrayList2.get(i10);
            boolean z10 = dVar.f26225d;
            c cVar = dVar.f26222a;
            if (z10) {
                arrayList3.add(dVar);
            } else {
                d dVar2 = c7791f.new d(cVar.f26218a, i10, aVarMo9480b);
                arrayList3.add(dVar2);
                c cVar2 = dVar2.f26222a;
                dVar2.f26223b.m12821f(cVar2.f26219b, c7791f.f26195d, 0);
                if (arrayList.contains(cVar)) {
                    arrayList4.add(cVar2);
                }
            }
        }
        AbstractC2481A abstractC2481AM3204n = AbstractC2481A.m3204n(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.clear();
        arrayList.addAll(arrayList4);
        for (int i11 = 0; i11 < abstractC2481AM3204n.size(); i11++) {
            ((d) abstractC2481AM3204n.get(i11)).m9504a();
        }
    }

    @Override // p453Z2.InterfaceC6659a0
    /* JADX INFO: renamed from: c */
    public final boolean mo5133c(C7773g c7773g) {
        return isLoading();
    }

    @Override // p453Z2.InterfaceC6694y
    /* JADX INFO: renamed from: d */
    public final void mo5134d(InterfaceC6694y.a aVar, long j10) {
        C7789d c7789d = this.f26196e;
        this.f26201j = aVar;
        try {
            c7789d.getClass();
            try {
                c7789d.f26171j.m9505a(c7789d.m9484c(c7789d.f26170i));
                C7789d.c cVar = c7789d.f26169h;
                Uri uri = c7789d.f26170i;
                String str = c7789d.f26173l;
                cVar.getClass();
                cVar.m9491c(cVar.m9489a(4, str, C2501V.f8333h, uri));
            } catch (IOException e10) {
                C0513S.m1001g(c7789d.f26171j);
                throw e10;
            }
        } catch (IOException e11) {
            this.f26203l = e11;
            C0513S.m1001g(c7789d);
        }
    }

    @Override // p453Z2.InterfaceC6694y
    public final void discardBuffer(long j10, boolean z10) throws Throwable {
        if (m9499h()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26197f;
            if (i10 >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i10);
            if (!dVar.f26225d) {
                dVar.f26224c.m7497j(j10, z10, true);
            }
            i10++;
        }
    }

    @Override // p453Z2.InterfaceC6694y
    /* JADX INFO: renamed from: f */
    public final long mo5136f(InterfaceC10325q[] interfaceC10325qArr, boolean[] zArr, InterfaceC6657Z[] interfaceC6657ZArr, boolean[] zArr2, long j10) {
        ArrayList arrayList;
        for (int i10 = 0; i10 < interfaceC10325qArr.length; i10++) {
            if (interfaceC6657ZArr[i10] != null && (interfaceC10325qArr[i10] == null || !zArr[i10])) {
                interfaceC6657ZArr[i10] = null;
            }
        }
        ArrayList arrayList2 = this.f26198g;
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            int length = interfaceC10325qArr.length;
            arrayList = this.f26197f;
            if (i11 >= length) {
                break;
            }
            InterfaceC10325q interfaceC10325q = interfaceC10325qArr[i11];
            if (interfaceC10325q != null) {
                C20687B c20687bMo7450m = interfaceC10325q.mo7450m();
                C2500U c2500u = this.f26202k;
                c2500u.getClass();
                int iIndexOf = c2500u.indexOf(c20687bMo7450m);
                d dVar = (d) arrayList.get(iIndexOf);
                dVar.getClass();
                arrayList2.add(dVar.f26222a);
                if (this.f26202k.contains(c20687bMo7450m) && interfaceC6657ZArr[i11] == null) {
                    interfaceC6657ZArr[i11] = new e(iIndexOf);
                    zArr2[i11] = true;
                }
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            d dVar2 = (d) arrayList.get(i12);
            if (!arrayList2.contains(dVar2.f26222a)) {
                dVar2.m9504a();
            }
        }
        this.f26212u = true;
        if (j10 != 0) {
            this.f26205n = j10;
            this.f26206o = j10;
            this.f26207p = j10;
        }
        m9500i();
        return j10;
    }

    @Override // p453Z2.InterfaceC6659a0
    public final long getBufferedPositionUs() {
        if (!this.f26208q) {
            ArrayList arrayList = this.f26197f;
            if (!arrayList.isEmpty()) {
                long j10 = this.f26205n;
                if (j10 != -9223372036854775807L) {
                    return j10;
                }
                boolean z10 = true;
                long jMin = LongCompanionObject.MAX_VALUE;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    d dVar = (d) arrayList.get(i10);
                    if (!dVar.f26225d) {
                        jMin = Math.min(jMin, dVar.f26224c.m7503q());
                        z10 = false;
                    }
                }
                if (z10 || jMin == Long.MIN_VALUE) {
                    return 0L;
                }
                return jMin;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p453Z2.InterfaceC6659a0
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // p453Z2.InterfaceC6694y
    public final C6677j0 getTrackGroups() {
        C0515a.m1030f(this.f26211t);
        C2500U c2500u = this.f26202k;
        c2500u.getClass();
        return new C6677j0((C20687B[]) c2500u.toArray(new C20687B[0]));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m9499h() {
        return this.f26206o != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: i */
    public final void m9500i() {
        ArrayList arrayList;
        int i10 = 0;
        boolean z10 = true;
        while (true) {
            arrayList = this.f26198g;
            if (i10 >= arrayList.size()) {
                break;
            }
            z10 &= ((c) arrayList.get(i10)).f26220c != null;
            i10++;
        }
        if (z10 && this.f26212u) {
            C7789d c7789d = this.f26196e;
            c7789d.f26167f.addAll(arrayList);
            c7789d.m9483b();
        }
    }

    @Override // p453Z2.InterfaceC6659a0
    public final boolean isLoading() {
        if (this.f26208q) {
            return false;
        }
        int i10 = this.f26196e.f26177p;
        return i10 == 2 || i10 == 1;
    }

    @Override // p453Z2.InterfaceC6694y
    public final void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.f26203l;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // p453Z2.InterfaceC6694y
    public final long readDiscontinuity() {
        if (!this.f26209r) {
            return -9223372036854775807L;
        }
        this.f26209r = false;
        return 0L;
    }

    @Override // p453Z2.InterfaceC6694y
    public final long seekToUs(long j10) throws Throwable {
        if (getBufferedPositionUs() == 0 && !this.f26214w) {
            this.f26207p = j10;
            return j10;
        }
        discardBuffer(j10, false);
        this.f26205n = j10;
        if (m9499h()) {
            C7789d c7789d = this.f26196e;
            int i10 = c7789d.f26177p;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                this.f26206o = j10;
                c7789d.m9485l(j10);
                return j10;
            }
        } else {
            ArrayList arrayList = this.f26197f;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!((d) arrayList.get(i11)).f26224c.m7492H(j10, this.f26208q)) {
                    this.f26206o = j10;
                    if (this.f26208q) {
                        for (int i12 = 0; i12 < this.f26197f.size(); i12++) {
                            d dVar = (d) this.f26197f.get(i12);
                            C0515a.m1030f(dVar.f26225d);
                            dVar.f26225d = false;
                            m9496a(C7791f.this);
                            dVar.f26223b.m12821f(dVar.f26222a.f26219b, C7791f.this.f26195d, 0);
                        }
                        if (this.f26214w) {
                            this.f26196e.m9486m(C0513S.m1002g0(j10));
                        } else {
                            this.f26196e.m9485l(j10);
                        }
                    } else {
                        this.f26196e.m9485l(j10);
                    }
                    for (int i13 = 0; i13 < this.f26197f.size(); i13++) {
                        d dVar2 = (d) this.f26197f.get(i13);
                        if (!dVar2.f26225d) {
                            C6191c c6191c = dVar2.f26222a.f26219b.f26154h;
                            c6191c.getClass();
                            synchronized (c6191c.f20279e) {
                                c6191c.f20285k = true;
                            }
                            dVar2.f26224c.m7489E(false);
                            dVar2.f26224c.f21889t = j10;
                        }
                    }
                    break;
                }
            }
        }
        return j10;
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.f$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class a implements InterfaceC12032r {

        /* JADX INFO: renamed from: b */
        public final C6656Y f26215b;

        public a(C6656Y c6656y) {
            this.f26215b = c6656y;
        }

        @Override // p601i3.InterfaceC12032r
        /* JADX INFO: renamed from: e */
        public final void mo2090e() {
            final C7791f c7791f = C7791f.this;
            c7791f.f26194c.post(new Runnable() { // from class: X2.k
                @Override // java.lang.Runnable
                public final void run() {
                    C7791f.m9497e(c7791f);
                }
            });
        }

        @Override // p601i3.InterfaceC12032r
        /* JADX INFO: renamed from: h */
        public final InterfaceC12011M mo2091h(int i10, int i11) {
            return this.f26215b;
        }

        @Override // p601i3.InterfaceC12032r
        /* JADX INFO: renamed from: a */
        public final void mo2089a(InterfaceC12005G interfaceC12005G) {
        }
    }

    @Override // p453Z2.InterfaceC6659a0
    public final void reevaluateBuffer(long j10) {
    }

    @Override // p453Z2.InterfaceC6694y
    /* JADX INFO: renamed from: b */
    public final long mo5132b(long j10, C2748T0 c2748t0) {
        return j10;
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.f$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class b implements C10745k.a<C7787b>, C6656Y.c {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m9501a(RtspMediaSource.C7784b c7784b) {
            boolean z10 = c7784b instanceof RtspMediaSource.C7785c;
            C7791f c7791f = C7791f.this;
            if (!z10 || c7791f.f26214w) {
                c7791f.f26204m = c7784b;
            } else {
                C7791f.m9498g(c7791f);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m9502b(long j10, AbstractC2481A<C6209u> abstractC2481A) {
            C7787b c7787b;
            ArrayList arrayList = new ArrayList(abstractC2481A.size());
            for (int i10 = 0; i10 < abstractC2481A.size(); i10++) {
                String path = abstractC2481A.get(i10).f20342c.getPath();
                path.getClass();
                arrayList.add(path);
            }
            for (int i11 = 0; i11 < C7791f.this.f26198g.size(); i11++) {
                if (!arrayList.contains(((c) C7791f.this.f26198g.get(i11)).f26219b.f26148b.f20324b.getPath())) {
                    RtspMediaSource rtspMediaSource = RtspMediaSource.this;
                    rtspMediaSource.f26141m = false;
                    rtspMediaSource.m9474v();
                    if (C7791f.this.m9499h()) {
                        C7791f c7791f = C7791f.this;
                        c7791f.f26209r = true;
                        c7791f.f26206o = -9223372036854775807L;
                        c7791f.f26205n = -9223372036854775807L;
                        c7791f.f26207p = -9223372036854775807L;
                    }
                }
            }
            for (int i12 = 0; i12 < abstractC2481A.size(); i12++) {
                C6209u c6209u = abstractC2481A.get(i12);
                C7791f c7791f2 = C7791f.this;
                Uri uri = c6209u.f20342c;
                ArrayList arrayList2 = c7791f2.f26197f;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList2.size()) {
                        c7787b = null;
                        break;
                    }
                    if (!((d) arrayList2.get(i13)).f26225d) {
                        c cVar = ((d) arrayList2.get(i13)).f26222a;
                        if (cVar.f26219b.f26148b.f20324b.equals(uri)) {
                            c7787b = cVar.f26219b;
                            break;
                        }
                    }
                    i13++;
                }
                if (c7787b != null) {
                    long j11 = c6209u.f20340a;
                    if (j11 != -9223372036854775807L) {
                        C6191c c6191c = c7787b.f26154h;
                        c6191c.getClass();
                        if (!c6191c.f20282h) {
                            c7787b.f26154h.f20283i = j11;
                        }
                    }
                    int i14 = c6209u.f20341b;
                    C6191c c6191c2 = c7787b.f26154h;
                    c6191c2.getClass();
                    if (!c6191c2.f20282h) {
                        c7787b.f26154h.f20284j = i14;
                    }
                    if (C7791f.this.m9499h()) {
                        C7791f c7791f3 = C7791f.this;
                        if (c7791f3.f26206o == c7791f3.f26205n) {
                            long j12 = c6209u.f20340a;
                            c7787b.f26157k = j10;
                            c7787b.f26158l = j12;
                        }
                    }
                }
            }
            if (!C7791f.this.m9499h()) {
                C7791f c7791f4 = C7791f.this;
                long j13 = c7791f4.f26207p;
                if (j13 == -9223372036854775807L || !c7791f4.f26214w) {
                    return;
                }
                c7791f4.seekToUs(j13);
                C7791f.this.f26207p = -9223372036854775807L;
                return;
            }
            C7791f c7791f5 = C7791f.this;
            long j14 = c7791f5.f26206o;
            long j15 = c7791f5.f26205n;
            if (j14 == j15) {
                c7791f5.f26206o = -9223372036854775807L;
                c7791f5.f26205n = -9223372036854775807L;
            } else {
                c7791f5.f26206o = -9223372036854775807L;
                c7791f5.seekToUs(j15);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m9503c(String str, IOException iOException) {
            C7791f.this.f26203l = iOException == null ? new IOException(str) : new IOException(str, iOException);
        }

        @Override // p453Z2.C6656Y.c
        /* JADX INFO: renamed from: i */
        public final void mo5147i() {
            final C7791f c7791f = C7791f.this;
            c7791f.f26194c.post(new Runnable() { // from class: X2.l
                @Override // java.lang.Runnable
                public final void run() {
                    C7791f.m9497e(c7791f);
                }
            });
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: l */
        public final void mo5150l(C10745k.d dVar, long j10, long j11) {
            C7787b c7787b = (C7787b) dVar;
            C7791f c7791f = C7791f.this;
            long bufferedPositionUs = c7791f.getBufferedPositionUs();
            ArrayList arrayList = c7791f.f26197f;
            if (bufferedPositionUs == 0) {
                if (c7791f.f26214w) {
                    return;
                }
                C7791f.m9498g(c7791f);
                return;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar2 = (d) arrayList.get(i10);
                if (dVar2.f26222a.f26219b == c7787b) {
                    dVar2.m9504a();
                    break;
                }
            }
            c7791f.f26196e.f26177p = 1;
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: n */
        public final C10745k.b mo5152n(C10745k.d dVar, long j10, long j11, IOException iOException, int i10) {
            C7787b c7787b = (C7787b) dVar;
            C7791f c7791f = C7791f.this;
            if (!c7791f.f26211t) {
                c7791f.f26203l = iOException;
            } else if (iOException.getCause() instanceof BindException) {
                int i11 = c7791f.f26213v;
                c7791f.f26213v = i11 + 1;
                if (i11 < 3) {
                    return C10745k.f33367d;
                }
            } else {
                c7791f.f26204m = new RtspMediaSource.C7784b(c7787b.f26148b.f20324b.toString(), iOException);
            }
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
