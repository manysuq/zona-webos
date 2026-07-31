package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p039C2.C0513S;
import p039C2.C0515a;
import p093F2.C1493m;
import p093F2.InterfaceC1479C;
import p093F2.InterfaceC1489i;
import p094F3.C1514h;
import p170J7.AbstractC2481A;
import p201L2.C3193c0;
import p273P2.C4042g;
import p273P2.InterfaceC4043h;
import p273P2.InterfaceC4049n;
import p273P2.InterfaceC4050o;
import p291Q2.C4524c;
import p291Q2.C4525d;
import p291Q2.C4528g;
import p291Q2.C4531j;
import p291Q2.C4535n;
import p291Q2.C4541t;
import p291Q2.InterfaceC4530i;
import p309R2.C4640a;
import p309R2.C4641b;
import p309R2.C4643d;
import p309R2.C4644e;
import p309R2.InterfaceC4649j;
import p362U1.C5268e;
import p453Z2.AbstractC6658a;
import p453Z2.C6663c0;
import p453Z2.C6676j;
import p453Z2.InterfaceC6640H;
import p453Z2.InterfaceC6641I;
import p453Z2.InterfaceC6694y;
import p453Z2.InterfaceC6695z;
import p535e3.C10739e;
import p535e3.C10742h;
import p535e3.C10745k;
import p535e3.C10747m;
import p535e3.InterfaceC10743i;
import p884z2.C20711q;
import p884z2.C20712r;
import p884z2.C20720z;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC6658a {

    /* JADX INFO: renamed from: h */
    public final InterfaceC4530i f26051h;

    /* JADX INFO: renamed from: i */
    public final C4524c f26052i;

    /* JADX INFO: renamed from: j */
    public final C6676j f26053j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC4050o f26054k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC10743i f26055l;

    /* JADX INFO: renamed from: m */
    public final boolean f26056m;

    /* JADX INFO: renamed from: n */
    public final int f26057n;

    /* JADX INFO: renamed from: o */
    public final C4641b f26058o;

    /* JADX INFO: renamed from: p */
    public final long f26059p;

    /* JADX INFO: renamed from: q */
    public C20711q.f f26060q;

    /* JADX INFO: renamed from: r */
    public InterfaceC1479C f26061r;

    /* JADX INFO: renamed from: s */
    public C20711q f26062s;

    static {
        C20712r.m25314a("media3.exoplayer.hls");
    }

    public HlsMediaSource(C20711q c20711q, C4524c c4524c, C4525d c4525d, C6676j c6676j, InterfaceC4050o interfaceC4050o, C10742h c10742h, C4641b c4641b, long j10, boolean z10, int i10) {
        this.f26062s = c20711q;
        this.f26060q = c20711q.f71091c;
        this.f26052i = c4524c;
        this.f26051h = c4525d;
        this.f26053j = c6676j;
        this.f26054k = interfaceC4050o;
        this.f26055l = c10742h;
        this.f26058o = c4641b;
        this.f26059p = j10;
        this.f26056m = z10;
        this.f26057n = i10;
    }

    /* JADX INFO: renamed from: v */
    public static C4644e.c m9457v(long j10, List list) {
        C4644e.c cVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4644e.c cVar2 = (C4644e.c) list.get(i10);
            long j11 = cVar2.f15639f;
            if (j11 > j10 || !cVar2.f15628m) {
                if (j11 > j10) {
                    break;
                }
            } else {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    @Override // p453Z2.AbstractC6658a, p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7452c(C20711q c20711q) {
        this.f26062s = c20711q;
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: e */
    public final synchronized C20711q mo7453e() {
        return this.f26062s;
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: f */
    public final InterfaceC6694y mo7454f(InterfaceC6695z.b bVar, C10739e c10739e, long j10) {
        InterfaceC6640H.a aVarM7523p = m7523p(bVar);
        InterfaceC4049n.a aVar = new InterfaceC4049n.a(this.f21904d.f13298c, 0, bVar);
        InterfaceC1479C interfaceC1479C = this.f26061r;
        C3193c0 c3193c0 = this.f21907g;
        C0515a.m1031g(c3193c0);
        return new C4535n(this.f26051h, this.f26058o, this.f26052i, interfaceC1479C, this.f26054k, aVar, this.f26055l, aVarM7523p, c10739e, this.f26053j, this.f26056m, this.f26057n, c3193c0);
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: i */
    public final void mo7455i(InterfaceC6694y interfaceC6694y) {
        C4535n c4535n = (C4535n) interfaceC6694y;
        c4535n.f15222c.mo5270f(c4535n);
        for (C4541t c4541t : c4535n.f15240u) {
            if (c4541t.f15260E) {
                for (C4541t.b bVar : c4541t.f15302w) {
                    bVar.m7498k();
                    InterfaceC4043h interfaceC4043h = bVar.f21877h;
                    if (interfaceC4043h != null) {
                        interfaceC4043h.mo4720d(bVar.f21874e);
                        bVar.f21877h = null;
                        bVar.f21876g = null;
                    }
                }
            }
            C4528g c4528g = c4541t.f15284e;
            c4528g.f15168g.mo5265a(c4528g.f15166e[c4528g.f15179r.mo12441q()]);
            c4528g.f15175n = null;
            c4541t.f15290k.m12820e(c4541t);
            c4541t.f15298s.removeCallbacksAndMessages(null);
            c4541t.f15264I = true;
            c4541t.f15299t.clear();
        }
        c4535n.f15237r = null;
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: l */
    public final void mo7456l() throws IOException {
        C4641b c4641b = this.f26058o;
        C10745k c10745k = c4641b.f15545h;
        if (c10745k != null) {
            c10745k.mo9332a();
        }
        Uri uri = c4641b.f15549l;
        if (uri != null) {
            c4641b.mo5266b(uri);
        }
    }

    @Override // p453Z2.AbstractC6658a
    /* JADX INFO: renamed from: s */
    public final void mo7457s(InterfaceC1479C interfaceC1479C) {
        this.f26061r = interfaceC1479C;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C3193c0 c3193c0 = this.f21907g;
        C0515a.m1031g(c3193c0);
        InterfaceC4050o interfaceC4050o = this.f26054k;
        interfaceC4050o.mo4735b(looperMyLooper, c3193c0);
        interfaceC4050o.prepare();
        InterfaceC6640H.a aVarM7523p = m7523p(null);
        C20711q.g gVar = mo7453e().f71090b;
        gVar.getClass();
        Uri uri = gVar.f71133a;
        C4641b c4641b = this.f26058o;
        c4641b.getClass();
        c4641b.f15546i = C0513S.m1011p(null);
        c4641b.f15544g = aVarM7523p;
        c4641b.f15547j = this;
        Map map = Collections.EMPTY_MAP;
        C0515a.m1032h(uri, "The uri must be set.");
        C10747m c10747m = new C10747m(c4641b.f15539b.f15157a.createDataSource(), new C1493m(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, c4641b.f15540c.mo5263a());
        C0515a.m1030f(c4641b.f15545h == null);
        C10745k c10745k = new C10745k("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c4641b.f15545h = c10745k;
        c10745k.m12821f(c10747m, c4641b, c4641b.f15541d.mo12813a(c10747m.f33388c));
    }

    @Override // p453Z2.AbstractC6658a
    /* JADX INFO: renamed from: u */
    public final void mo7458u() {
        C4641b c4641b = this.f26058o;
        c4641b.f15549l = null;
        c4641b.f15550m = null;
        c4641b.f15548k = null;
        c4641b.f15552o = -9223372036854775807L;
        c4641b.f15545h.m12820e(null);
        c4641b.f15545h = null;
        HashMap<Uri, C4641b.b> map = c4641b.f15542e;
        Iterator<C4641b.b> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().f15555c.m12820e(null);
        }
        c4641b.f15546i.removeCallbacksAndMessages(null);
        c4641b.f15546i = null;
        map.clear();
        this.f26054k.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m9458w(C4644e c4644e) {
        long j10;
        C6663c0 c6663c0;
        long j11;
        long jM982T;
        long j12;
        boolean z10 = c4644e.f15582p;
        boolean z11 = c4644e.f15573g;
        AbstractC2481A abstractC2481A = c4644e.f15584r;
        long j13 = c4644e.f15587u;
        long jM982T2 = c4644e.f15571e;
        int i10 = c4644e.f15570d;
        long j14 = c4644e.f15574h;
        long jM1002g0 = z10 ? C0513S.m1002g0(j14) : -9223372036854775807L;
        long j15 = (i10 == 2 || i10 == 1) ? jM1002g0 : -9223372036854775807L;
        C4641b c4641b = this.f26058o;
        c4641b.f15548k.getClass();
        C4531j c4531j = new C4531j();
        long j16 = 0;
        if (c4641b.f15551n) {
            C4644e.g gVar = c4644e.f15588v;
            long j17 = j14 - c4641b.f15552o;
            boolean z12 = c4644e.f15581o;
            long j18 = z12 ? j17 + j13 : -9223372036854775807L;
            long jM982T3 = c4644e.f15582p ? C0513S.m982T(C0513S.m967E(this.f26059p)) - (j14 + j13) : 0L;
            long j19 = this.f26060q.f71123a;
            if (j19 != -9223372036854775807L) {
                jM982T = C0513S.m982T(j19);
            } else {
                if (jM982T2 != -9223372036854775807L) {
                    j11 = j13 - jM982T2;
                } else {
                    j11 = gVar.f15649d;
                    if (j11 == -9223372036854775807L || c4644e.f15580n == -9223372036854775807L) {
                        j11 = gVar.f15648c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * c4644e.f15579m;
                        }
                    }
                }
                jM982T = j11 + jM982T3;
            }
            long j20 = j13 + jM982T3;
            long jM1005j = C0513S.m1005j(jM982T, jM982T3, j20);
            C20711q.f fVar = mo7453e().f71091c;
            boolean z13 = fVar.f71126d == -3.4028235E38f && fVar.f71127e == -3.4028235E38f && gVar.f15648c == -9223372036854775807L && gVar.f15649d == -9223372036854775807L;
            C20711q.f.a aVar = new C20711q.f.a();
            aVar.f71128a = C0513S.m1002g0(jM1005j);
            aVar.f71131d = z13 ? 1.0f : this.f26060q.f71126d;
            aVar.f71132e = z13 ? 1.0f : this.f26060q.f71127e;
            C20711q.f fVar2 = new C20711q.f(aVar);
            this.f26060q = fVar2;
            if (jM982T2 == -9223372036854775807L) {
                jM982T2 = j20 - C0513S.m982T(fVar2.f71123a);
            }
            if (z11) {
                j16 = jM982T2;
            } else {
                C4644e.c cVarM9457v = m9457v(jM982T2, c4644e.f15585s);
                if (cVarM9457v != null) {
                    j12 = cVarM9457v.f15639f;
                } else if (!abstractC2481A.isEmpty()) {
                    C4644e.e eVar = (C4644e.e) abstractC2481A.get(C0513S.m993c(abstractC2481A, Long.valueOf(jM982T2), true));
                    C4644e.c cVarM9457v2 = m9457v(jM982T2, eVar.f15634n);
                    j12 = cVarM9457v2 != null ? cVarM9457v2.f15639f : eVar.f15639f;
                }
                j16 = j12;
            }
            c6663c0 = new C6663c0(j15, jM1002g0, j18, c4644e.f15587u, j17, j16, true, !z12, i10 == 2 && c4644e.f15572f, c4531j, mo7453e(), this.f26060q);
        } else {
            if (jM982T2 == -9223372036854775807L || abstractC2481A.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && jM982T2 != j13) {
                    jM982T2 = ((C4644e.e) abstractC2481A.get(C0513S.m993c(abstractC2481A, Long.valueOf(jM982T2), true))).f15639f;
                }
                j10 = jM982T2;
            }
            long j21 = c4644e.f15587u;
            c6663c0 = new C6663c0(j15, jM1002g0, j21, j21, 0L, j10, true, false, true, c4531j, mo7453e(), null);
        }
        m7526t(c6663c0);
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class Factory implements InterfaceC6641I {

        /* JADX INFO: renamed from: a */
        public final C4524c f26063a;

        /* JADX INFO: renamed from: b */
        public C4525d f26064b;

        /* JADX INFO: renamed from: c */
        public C1514h f26065c;

        /* JADX INFO: renamed from: h */
        public final C4042g f26070h = new C4042g();

        /* JADX INFO: renamed from: e */
        public final C4640a f26067e = new C4640a();

        /* JADX INFO: renamed from: f */
        public final C5268e f26068f = C4641b.f15538p;

        /* JADX INFO: renamed from: i */
        public final C10742h f26071i = new C10742h();

        /* JADX INFO: renamed from: g */
        public final C6676j f26069g = new C6676j();

        /* JADX INFO: renamed from: k */
        public final int f26073k = 1;

        /* JADX INFO: renamed from: l */
        public final long f26074l = -9223372036854775807L;

        /* JADX INFO: renamed from: j */
        public final boolean f26072j = true;

        /* JADX INFO: renamed from: d */
        public boolean f26066d = true;

        public Factory(InterfaceC1489i.a aVar) {
            this.f26063a = new C4524c(aVar);
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6695z mo7475a(C20711q c20711q) {
            c20711q.f71090b.getClass();
            if (this.f26064b == null) {
                C4525d c4525d = new C4525d();
                c4525d.f15159a = new C1514h();
                this.f26064b = c4525d;
            }
            C1514h c1514h = this.f26065c;
            if (c1514h != null) {
                this.f26064b.f15159a = c1514h;
            }
            C4525d c4525d2 = this.f26064b;
            c4525d2.f15160b = this.f26066d;
            List<C20720z> list = c20711q.f71090b.f71137e;
            boolean zIsEmpty = list.isEmpty();
            C4640a c4640a = this.f26067e;
            InterfaceC4649j c4643d = c4640a;
            if (!zIsEmpty) {
                c4643d = new C4643d(c4640a, list);
            }
            InterfaceC4050o interfaceC4050oM4746b = this.f26070h.m4746b(c20711q);
            getClass();
            C4524c c4524c = this.f26063a;
            C10742h c10742h = this.f26071i;
            return new HlsMediaSource(c20711q, c4524c, c4525d2, this.f26069g, interfaceC4050oM4746b, c10742h, new C4641b(c4524c, c10742h, c4643d), this.f26074l, this.f26072j, this.f26073k);
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC6695z.a mo7476b(C1514h c1514h) {
            this.f26065c = c1514h;
            return this;
        }

        @Override // p453Z2.InterfaceC6695z.a
        @Deprecated
        /* JADX INFO: renamed from: c */
        public final InterfaceC6695z.a mo7477c(boolean z10) {
            this.f26066d = z10;
            return this;
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: d */
        public final InterfaceC6695z.a mo7478d() {
            return this;
        }
    }
}
