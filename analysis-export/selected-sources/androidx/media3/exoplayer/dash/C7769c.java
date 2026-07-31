package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import androidx.media3.exoplayer.C7773g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p004A3.C0041b;
import p039C2.C0513S;
import p039C2.C0515a;
import p040C3.C0546f;
import p076E3.C1267a;
import p093F2.C1493m;
import p093F2.C1502v;
import p093F2.InterfaceC1479C;
import p093F2.InterfaceC1489i;
import p094F3.C1514h;
import p094F3.C1521o;
import p170J7.AbstractC2481A;
import p170J7.C2501V;
import p183K2.C2748T0;
import p201L2.C3193c0;
import p237N2.C3606b;
import p237N2.C3612h;
import p237N2.C3613i;
import p237N2.InterfaceC3611g;
import p255O2.AbstractC3817j;
import p255O2.C3808a;
import p255O2.C3809b;
import p255O2.C3810c;
import p255O2.C3816i;
import p453Z2.C6660b;
import p487b3.AbstractC8007b;
import p487b3.AbstractC8010e;
import p487b3.AbstractC8018m;
import p487b3.C8009d;
import p487b3.C8012g;
import p487b3.C8015j;
import p487b3.C8017l;
import p487b3.C8020o;
import p487b3.InterfaceC8011f;
import p487b3.InterfaceC8019n;
import p517d3.InterfaceC10325q;
import p535e3.InterfaceC10743i;
import p535e3.InterfaceC10746l;
import p601i3.C12021g;
import p601i3.InterfaceC12030p;
import p623j$.util.Objects;
import p742q3.C17698a;
import p884z2.C20708n;
import p884z2.C20715u;

/* JADX INFO: renamed from: androidx.media3.exoplayer.dash.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7769c implements InterfaceC7767a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10746l f25905a;

    /* JADX INFO: renamed from: b */
    public final C3606b f25906b;

    /* JADX INFO: renamed from: c */
    public final int[] f25907c;

    /* JADX INFO: renamed from: d */
    public final int f25908d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1489i f25909e;

    /* JADX INFO: renamed from: f */
    public final long f25910f;

    /* JADX INFO: renamed from: g */
    public final int f25911g;

    /* JADX INFO: renamed from: h */
    public final C7770d.c f25912h;

    /* JADX INFO: renamed from: i */
    public final b[] f25913i;

    /* JADX INFO: renamed from: j */
    public InterfaceC10325q f25914j;

    /* JADX INFO: renamed from: k */
    public C3810c f25915k;

    /* JADX INFO: renamed from: l */
    public int f25916l;

    /* JADX INFO: renamed from: m */
    public C6660b f25917m;

    /* JADX INFO: renamed from: n */
    public boolean f25918n;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.c$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a implements InterfaceC7767a.a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1489i.a f25919a;

        /* JADX INFO: renamed from: b */
        public final int f25920b;

        /* JADX INFO: renamed from: c */
        public final C8009d.b f25921c;

        public a(InterfaceC1489i.a aVar) {
            C8009d.b bVar = new C8009d.b();
            bVar.f27595a = new C1514h();
            this.f25921c = bVar;
            this.f25919a = aVar;
            this.f25920b = 1;
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC7767a.a
        /* JADX INFO: renamed from: a */
        public final C7769c mo9335a(InterfaceC10746l interfaceC10746l, C3810c c3810c, C3606b c3606b, int i10, int[] iArr, InterfaceC10325q interfaceC10325q, int i11, long j10, boolean z10, ArrayList arrayList, C7770d.c cVar, InterfaceC1479C interfaceC1479C, C3193c0 c3193c0) {
            InterfaceC1489i interfaceC1489iCreateDataSource = this.f25919a.createDataSource();
            if (interfaceC1479C != null) {
                interfaceC1489iCreateDataSource.addTransferListener(interfaceC1479C);
            }
            return new C7769c(this.f25921c, interfaceC10746l, c3810c, c3606b, i10, iArr, interfaceC10325q, i11, interfaceC1489iCreateDataSource, j10, this.f25920b, z10, arrayList, cVar);
        }

        @Override // androidx.media3.exoplayer.dash.InterfaceC7767a.a
        /* JADX INFO: renamed from: b */
        public final C20708n mo9336b(C20708n c20708n) {
            C8009d.b bVar = this.f25921c;
            if (!bVar.f27596b || !bVar.f27595a.mo2076a(c20708n)) {
                return c20708n;
            }
            C20708n.a aVarM25303a = c20708n.m25303a();
            String str = c20708n.f71030k;
            aVarM25303a.f71072m = C20715u.m25334p("application/x-media3-cues");
            aVarM25303a.f71056K = bVar.f27595a.mo2077b(c20708n);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c20708n.f71033n);
            sb2.append(str != null ? " ".concat(str) : "");
            aVarM25303a.f71069j = sb2.toString();
            aVarM25303a.f71077r = LongCompanionObject.MAX_VALUE;
            return new C20708n(aVarM25303a);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.c$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8011f f25922a;

        /* JADX INFO: renamed from: b */
        public final AbstractC3817j f25923b;

        /* JADX INFO: renamed from: c */
        public final C3809b f25924c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC3611g f25925d;

        /* JADX INFO: renamed from: e */
        public final long f25926e;

        /* JADX INFO: renamed from: f */
        public final long f25927f;

        public b(long j10, AbstractC3817j abstractC3817j, C3809b c3809b, InterfaceC8011f interfaceC8011f, long j11, InterfaceC3611g interfaceC3611g) {
            this.f25926e = j10;
            this.f25923b = abstractC3817j;
            this.f25924c = c3809b;
            this.f25927f = j11;
            this.f25922a = interfaceC8011f;
            this.f25925d = interfaceC3611g;
        }

        /* JADX INFO: renamed from: a */
        public final b m9350a(long j10, AbstractC3817j abstractC3817j) throws C6660b {
            long jMo4353f;
            long jMo4353f2;
            InterfaceC3611g interfaceC3611gMo4551l = this.f25923b.mo4551l();
            InterfaceC3611g interfaceC3611gMo4551l2 = abstractC3817j.mo4551l();
            if (interfaceC3611gMo4551l == null) {
                return new b(j10, abstractC3817j, this.f25924c, this.f25922a, this.f25927f, interfaceC3611gMo4551l);
            }
            if (!interfaceC3611gMo4551l.mo4355h()) {
                return new b(j10, abstractC3817j, this.f25924c, this.f25922a, this.f25927f, interfaceC3611gMo4551l2);
            }
            long jMo4354g = interfaceC3611gMo4551l.mo4354g(j10);
            if (jMo4354g == 0) {
                return new b(j10, abstractC3817j, this.f25924c, this.f25922a, this.f25927f, interfaceC3611gMo4551l2);
            }
            C0515a.m1031g(interfaceC3611gMo4551l2);
            long jMo4356i = interfaceC3611gMo4551l.mo4356i();
            long jMo4348a = interfaceC3611gMo4551l.mo4348a(jMo4356i);
            long j11 = jMo4354g + jMo4356i;
            long j12 = j11 - 1;
            long jMo4349b = interfaceC3611gMo4551l.mo4349b(j12, j10) + interfaceC3611gMo4551l.mo4348a(j12);
            long jMo4356i2 = interfaceC3611gMo4551l2.mo4356i();
            long jMo4348a2 = interfaceC3611gMo4551l2.mo4348a(jMo4356i2);
            long j13 = this.f25927f;
            if (jMo4349b != jMo4348a2) {
                if (jMo4349b < jMo4348a2) {
                    throw new C6660b();
                }
                if (jMo4348a2 < jMo4348a) {
                    jMo4353f2 = j13 - (interfaceC3611gMo4551l2.mo4353f(jMo4348a, j10) - jMo4356i);
                } else {
                    jMo4353f = interfaceC3611gMo4551l.mo4353f(jMo4348a2, j10) - jMo4356i2;
                }
                return new b(j10, abstractC3817j, this.f25924c, this.f25922a, jMo4353f2, interfaceC3611gMo4551l2);
            }
            jMo4353f = j11 - jMo4356i2;
            jMo4353f2 = jMo4353f + j13;
            return new b(j10, abstractC3817j, this.f25924c, this.f25922a, jMo4353f2, interfaceC3611gMo4551l2);
        }

        /* JADX INFO: renamed from: b */
        public final long m9351b(long j10) {
            InterfaceC3611g interfaceC3611g = this.f25925d;
            C0515a.m1031g(interfaceC3611g);
            return interfaceC3611g.mo4350c(this.f25926e, j10) + this.f25927f;
        }

        /* JADX INFO: renamed from: c */
        public final long m9352c(long j10) {
            long jM9351b = m9351b(j10);
            InterfaceC3611g interfaceC3611g = this.f25925d;
            C0515a.m1031g(interfaceC3611g);
            return (interfaceC3611g.mo4357j(this.f25926e, j10) + jM9351b) - 1;
        }

        /* JADX INFO: renamed from: d */
        public final long m9353d() {
            InterfaceC3611g interfaceC3611g = this.f25925d;
            C0515a.m1031g(interfaceC3611g);
            return interfaceC3611g.mo4354g(this.f25926e);
        }

        /* JADX INFO: renamed from: e */
        public final long m9354e(long j10) {
            long jM9355f = m9355f(j10);
            InterfaceC3611g interfaceC3611g = this.f25925d;
            C0515a.m1031g(interfaceC3611g);
            return interfaceC3611g.mo4349b(j10 - this.f25927f, this.f25926e) + jM9355f;
        }

        /* JADX INFO: renamed from: f */
        public final long m9355f(long j10) {
            InterfaceC3611g interfaceC3611g = this.f25925d;
            C0515a.m1031g(interfaceC3611g);
            return interfaceC3611g.mo4348a(j10 - this.f25927f);
        }

        /* JADX INFO: renamed from: g */
        public final boolean m9356g(long j10, long j11) {
            InterfaceC3611g interfaceC3611g = this.f25925d;
            C0515a.m1031g(interfaceC3611g);
            return interfaceC3611g.mo4355h() || j11 == -9223372036854775807L || m9354e(j10) <= j11;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.c$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c extends AbstractC8007b {

        /* JADX INFO: renamed from: e */
        public final b f25928e;

        public c(b bVar, long j10, long j11) {
            super(j10, j11);
            this.f25928e = bVar;
        }

        @Override // p487b3.InterfaceC8019n
        /* JADX INFO: renamed from: a */
        public final long mo5115a() {
            m9970c();
            return this.f25928e.m9355f(this.f27576d);
        }

        @Override // p487b3.InterfaceC8019n
        /* JADX INFO: renamed from: b */
        public final long mo5116b() {
            m9970c();
            return this.f25928e.m9354e(this.f27576d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.dash.c, java.lang.Object] */
    public C7769c(C8009d.b bVar, InterfaceC10746l interfaceC10746l, C3810c c3810c, C3606b c3606b, int i10, int[] iArr, InterfaceC10325q interfaceC10325q, int i11, InterfaceC1489i interfaceC1489i, long j10, int i12, boolean z10, ArrayList arrayList, C7770d.c cVar) {
        AbstractC3817j abstractC3817j;
        b[] bVarArr;
        C20708n c20708n;
        InterfaceC12030p c0546f;
        C8009d c8009d;
        ?? obj = new Object();
        obj.f25905a = interfaceC10746l;
        obj.f25915k = c3810c;
        obj.f25906b = c3606b;
        obj.f25907c = iArr;
        obj.f25914j = interfaceC10325q;
        obj.f25908d = i11;
        obj.f25909e = interfaceC1489i;
        obj.f25916l = i10;
        obj.f25910f = j10;
        obj.f25911g = i12;
        C7770d.c cVar2 = cVar;
        obj.f25912h = cVar2;
        long jM4527d = c3810c.m4527d(i10);
        ArrayList<AbstractC3817j> arrayListM9348j = obj.m9348j();
        obj.f25913i = new b[interfaceC10325q.length()];
        int i13 = 0;
        int i14 = 0;
        C7769c c7769c = obj;
        while (i14 < c7769c.f25913i.length) {
            AbstractC3817j abstractC3817j2 = arrayListM9348j.get(interfaceC10325q.mo12435d(i14));
            C3809b c3809bM4347c = c3606b.m4347c(abstractC3817j2.f12465b);
            b[] bVarArr2 = c7769c.f25913i;
            C3809b c3809b = c3809bM4347c == null ? abstractC3817j2.f12465b.get(i13) : c3809bM4347c;
            C20708n c20708n2 = abstractC3817j2.f12464a;
            bVar.getClass();
            String str = c20708n2.f71032m;
            if (C20715u.m25332n(str)) {
                if (bVar.f27596b) {
                    c0546f = new C1521o(bVar.f27595a.mo2078c(c20708n2), c20708n2);
                } else {
                    c8009d = null;
                    abstractC3817j = abstractC3817j2;
                    bVarArr = bVarArr2;
                }
                C8009d c8009d2 = c8009d;
                long j11 = jM4527d;
                int i15 = i14;
                bVarArr[i15] = new b(j11, abstractC3817j, c3809b, c8009d2, 0L, abstractC3817j.mo4551l());
                i14 = i15 + 1;
                c7769c = this;
                cVar2 = cVar;
                jM4527d = j11;
                i13 = 0;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    abstractC3817j = abstractC3817j2;
                    c20708n = c20708n2;
                    bVarArr = bVarArr2;
                    c0546f = new C0041b(bVar.f27595a, bVar.f27596b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    c0546f = new C17698a(1);
                } else if (Objects.equals(str, "image/png")) {
                    c0546f = new C1267a();
                } else {
                    int i16 = z10 ? 4 : 0;
                    abstractC3817j = abstractC3817j2;
                    int i17 = bVar.f27596b ? i16 : i16 | 32;
                    bVarArr = bVarArr2;
                    c20708n = c20708n2;
                    c0546f = new C0546f(bVar.f27595a, i17, null, arrayList, cVar2);
                }
                c8009d = new C8009d(c0546f, i11, c20708n);
                C8009d c8009d3 = c8009d;
                long j12 = jM4527d;
                int i18 = i14;
                bVarArr[i18] = new b(j12, abstractC3817j, c3809b, c8009d3, 0L, abstractC3817j.mo4551l());
                i14 = i18 + 1;
                c7769c = this;
                cVar2 = cVar;
                jM4527d = j12;
                i13 = 0;
            }
            abstractC3817j = abstractC3817j2;
            c20708n = c20708n2;
            bVarArr = bVarArr2;
            c8009d = new C8009d(c0546f, i11, c20708n);
            C8009d c8009d4 = c8009d;
            long j13 = jM4527d;
            int i19 = i14;
            bVarArr[i19] = new b(j13, abstractC3817j, c3809b, c8009d4, 0L, abstractC3817j.mo4551l());
            i14 = i19 + 1;
            c7769c = this;
            cVar2 = cVar;
            jM4527d = j13;
            i13 = 0;
        }
    }

    @Override // p487b3.InterfaceC8014i
    /* JADX INFO: renamed from: a */
    public final void mo9341a() throws C6660b {
        C6660b c6660b = this.f25917m;
        if (c6660b != null) {
            throw c6660b;
        }
        this.f25905a.mo9332a();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    @Override // p487b3.InterfaceC8014i
    /* JADX INFO: renamed from: b */
    public final long mo9342b(long j10, C2748T0 c2748t0) {
        long jM9355f;
        for (b bVar : this.f25913i) {
            InterfaceC3611g interfaceC3611g = bVar.f25925d;
            long j11 = bVar.f25927f;
            InterfaceC3611g interfaceC3611g2 = bVar.f25925d;
            if (interfaceC3611g != null) {
                long jM9353d = bVar.m9353d();
                if (jM9353d != 0) {
                    C0515a.m1031g(interfaceC3611g2);
                    long jMo4353f = interfaceC3611g2.mo4353f(j10, bVar.f25926e) + j11;
                    long jM9355f2 = bVar.m9355f(jMo4353f);
                    if (jM9355f2 >= j10) {
                        jM9355f = jM9355f2;
                    } else {
                        if (jM9353d != -1) {
                            C0515a.m1031g(interfaceC3611g2);
                            if (jMo4353f >= ((interfaceC3611g2.mo4356i() + j11) + jM9353d) - 1) {
                                jM9355f = jM9355f2;
                            }
                        }
                        jM9355f = bVar.m9355f(jMo4353f + 1);
                    }
                    return c2748t0.m3470a(j10, jM9355f2, jM9355f);
                }
            }
        }
        return j10;
    }

    @Override // p487b3.InterfaceC8014i
    /* JADX INFO: renamed from: c */
    public final boolean mo9343c(long j10, AbstractC8010e abstractC8010e, List<? extends AbstractC8018m> list) {
        if (this.f25917m != null) {
            return false;
        }
        return this.f25914j.mo12439j(j10, abstractC8010e, list);
    }

    @Override // androidx.media3.exoplayer.dash.InterfaceC7767a
    /* JADX INFO: renamed from: d */
    public final void mo9333d(C3810c c3810c, int i10) {
        b[] bVarArr = this.f25913i;
        try {
            this.f25915k = c3810c;
            this.f25916l = i10;
            long jM4527d = c3810c.m4527d(i10);
            ArrayList<AbstractC3817j> arrayListM9348j = m9348j();
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                bVarArr[i11] = bVarArr[i11].m9350a(jM4527d, arrayListM9348j.get(this.f25914j.mo12435d(i11)));
            }
        } catch (C6660b e10) {
            this.f25917m = e10;
        }
    }

    @Override // androidx.media3.exoplayer.dash.InterfaceC7767a
    /* JADX INFO: renamed from: e */
    public final void mo9334e(InterfaceC10325q interfaceC10325q) {
        this.f25914j = interfaceC10325q;
    }

    @Override // p487b3.InterfaceC8014i
    /* JADX INFO: renamed from: f */
    public final void mo9344f(C7773g c7773g, long j10, List<? extends AbstractC8018m> list, C8012g c8012g) {
        long j11;
        long j12;
        List<? extends AbstractC8018m> list2;
        AbstractC8018m abstractC8018m;
        b[] bVarArr;
        long j13;
        long jMax;
        long j14;
        long jM1005j;
        int i10;
        AbstractC8010e c8015j;
        long jM1005j2;
        boolean z10;
        if (this.f25917m != null) {
            return;
        }
        long j15 = c7773g.f26027a;
        long j16 = j10 - j15;
        long jM982T = C0513S.m982T(this.f25915k.m4525b(this.f25916l).f12452b) + C0513S.m982T(this.f25915k.f12417a) + j10;
        C7770d.c cVar = this.f25912h;
        if (cVar != null) {
            C7770d c7770d = C7770d.this;
            C3810c c3810c = c7770d.f25934g;
            j12 = -9223372036854775807L;
            C7770d.b bVar = c7770d.f25930c;
            if (!c3810c.f12420d) {
                j11 = j15;
                z10 = false;
            } else if (c7770d.f25936i) {
                j11 = j15;
                z10 = true;
            } else {
                j11 = j15;
                Map.Entry<Long, Long> entryCeilingEntry = c7770d.f25933f.ceilingEntry(Long.valueOf(c3810c.f12424h));
                if (entryCeilingEntry == null || entryCeilingEntry.getValue().longValue() >= jM982T) {
                    z10 = false;
                } else {
                    long jLongValue = entryCeilingEntry.getKey().longValue();
                    DashMediaSource dashMediaSource = DashMediaSource.this;
                    long j17 = dashMediaSource.f25824N;
                    if (j17 == -9223372036854775807L || j17 < jLongValue) {
                        dashMediaSource.f25824N = jLongValue;
                    }
                    z10 = true;
                }
                if (z10 && c7770d.f25935h) {
                    c7770d.f25936i = true;
                    c7770d.f25935h = false;
                    DashMediaSource dashMediaSource2 = DashMediaSource.this;
                    dashMediaSource2.f25814D.removeCallbacks(dashMediaSource2.f25842w);
                    dashMediaSource2.m9326B();
                }
            }
            if (z10) {
                return;
            }
        } else {
            j11 = j15;
            j12 = -9223372036854775807L;
        }
        long jM982T2 = C0513S.m982T(C0513S.m967E(this.f25910f));
        C3810c c3810c2 = this.f25915k;
        long j18 = c3810c2.f12417a;
        long jM982T3 = j18 == j12 ? j12 : jM982T2 - C0513S.m982T(j18 + c3810c2.m4525b(this.f25916l).f12452b);
        if (list.isEmpty()) {
            list2 = list;
            abstractC8018m = null;
        } else {
            list2 = list;
            abstractC8018m = list2.get(list.size() - 1);
        }
        int length = this.f25914j.length();
        InterfaceC8019n[] interfaceC8019nArr = new InterfaceC8019n[length];
        int i11 = 0;
        while (true) {
            bVarArr = this.f25913i;
            if (i11 >= length) {
                break;
            }
            b bVar2 = bVarArr[i11];
            InterfaceC3611g interfaceC3611g = bVar2.f25925d;
            InterfaceC8019n.a aVar = InterfaceC8019n.f27651a;
            if (interfaceC3611g == null) {
                interfaceC8019nArr[i11] = aVar;
                jM982T3 = jM982T3;
            } else {
                long jM9351b = bVar2.m9351b(jM982T2);
                long jM9352c = bVar2.m9352c(jM982T2);
                if (abstractC8018m != null) {
                    jM1005j2 = abstractC8018m.mo9984c();
                } else {
                    InterfaceC3611g interfaceC3611g2 = bVar2.f25925d;
                    C0515a.m1031g(interfaceC3611g2);
                    jM1005j2 = C0513S.m1005j(interfaceC3611g2.mo4353f(j10, bVar2.f25926e) + bVar2.f25927f, jM9351b, jM9352c);
                }
                long j19 = jM1005j2;
                if (j19 < jM9351b) {
                    interfaceC8019nArr[i11] = aVar;
                } else {
                    interfaceC8019nArr[i11] = new c(m9349k(i11), j19, jM9352c);
                }
            }
            i11++;
            jM982T3 = jM982T3;
        }
        long j20 = jM982T3;
        if (!this.f25915k.f12420d || bVarArr[0].m9353d() == 0) {
            j16 = j16;
            j13 = 0;
            jMax = j12;
        } else {
            long jM9354e = bVarArr[0].m9354e(bVarArr[0].m9352c(jM982T2));
            C3810c c3810c3 = this.f25915k;
            long j21 = c3810c3.f12417a;
            long jMin = Math.min(j21 == j12 ? j12 : jM982T2 - C0513S.m982T(j21 + c3810c3.m4525b(this.f25916l).f12452b), jM9354e) - j11;
            j13 = 0;
            jMax = Math.max(0L, jMin);
        }
        long j22 = j13;
        this.f25914j.mo5119k(j11, j16, jMax, list2, interfaceC8019nArr);
        int iMo5117b = this.f25914j.mo5117b();
        SystemClock.elapsedRealtime();
        b bVarM9349k = m9349k(iMo5117b);
        long j23 = bVarM9349k.f25926e;
        long j24 = bVarM9349k.f25927f;
        InterfaceC3611g interfaceC3611g3 = bVarM9349k.f25925d;
        C3809b c3809b = bVarM9349k.f25924c;
        InterfaceC8011f interfaceC8011f = bVarM9349k.f25922a;
        AbstractC3817j abstractC3817j = bVarM9349k.f25923b;
        if (interfaceC8011f != null) {
            C3816i c3816i = interfaceC8011f.mo9974d() == null ? abstractC3817j.f12470g : null;
            C3816i c3816iMo4552m = interfaceC3611g3 == null ? abstractC3817j.mo4552m() : null;
            if (c3816i != null || c3816iMo4552m != null) {
                C20708n c20708nMo7451r = this.f25914j.mo7451r();
                int iMo5120s = this.f25914j.mo5120s();
                Object objMo5118g = this.f25914j.mo5118g();
                if (c3816i != null) {
                    C3816i c3816iM4549a = c3816i.m4549a(c3816iMo4552m, c3809b.f12413a);
                    if (c3816iM4549a != null) {
                        c3816i = c3816iM4549a;
                    }
                } else {
                    c3816iMo4552m.getClass();
                    c3816i = c3816iMo4552m;
                }
                c8012g.f27606a = new C8017l(this.f25909e, C3612h.m4358a(abstractC3817j, c3809b.f12413a, c3816i, 0, C2501V.f8333h), c20708nMo7451r, iMo5120s, objMo5118g, bVarM9349k.f25922a);
                return;
            }
        }
        C3810c c3810c4 = this.f25915k;
        boolean z11 = c3810c4.f12420d && this.f25916l == c3810c4.f12429m.size() + (-1);
        boolean z12 = (z11 && j23 == j12) ? false : true;
        if (bVarM9349k.m9353d() == j22) {
            c8012g.f27607b = z12;
            return;
        }
        long jM9351b2 = bVarM9349k.m9351b(jM982T2);
        long jM9352c2 = bVarM9349k.m9352c(jM982T2);
        if (z11) {
            long jM9354e2 = bVarM9349k.m9354e(jM9352c2);
            z12 &= (jM9354e2 - bVarM9349k.m9355f(jM9352c2)) + jM9354e2 >= j23;
        }
        if (abstractC8018m != null) {
            jM1005j = abstractC8018m.mo9984c();
            j14 = jM9352c2;
        } else {
            C0515a.m1031g(interfaceC3611g3);
            j14 = jM9352c2;
            jM1005j = C0513S.m1005j(interfaceC3611g3.mo4353f(j10, j23) + j24, jM9351b2, j14);
        }
        long j25 = jM1005j;
        if (j25 < jM9351b2) {
            this.f25917m = new C6660b();
            return;
        }
        if (j25 > j14 || (this.f25918n && j25 >= j14)) {
            c8012g.f27607b = z12;
            return;
        }
        if (z12 && bVarM9349k.m9355f(j25) >= j23) {
            c8012g.f27607b = true;
            return;
        }
        int iMin = (int) Math.min(this.f25911g, (j14 - j25) + 1);
        int i12 = (j23 > j12 ? 1 : (j23 == j12 ? 0 : -1));
        int i13 = 1;
        if (i12 != 0) {
            while (iMin > 1 && bVarM9349k.m9355f((((long) iMin) + j25) - 1) >= j23) {
                iMin--;
            }
        }
        long j26 = list.isEmpty() ? j10 : j12;
        C20708n c20708nMo7451r2 = this.f25914j.mo7451r();
        int iMo5120s2 = this.f25914j.mo5120s();
        Object objMo5118g2 = this.f25914j.mo5118g();
        long jM9355f = bVarM9349k.m9355f(j25);
        C0515a.m1031g(interfaceC3611g3);
        C3816i c3816iMo4352e = interfaceC3611g3.mo4352e(j25 - j24);
        InterfaceC1489i interfaceC1489i = this.f25909e;
        if (interfaceC8011f == null) {
            c8015j = new C8020o(interfaceC1489i, C3612h.m4358a(abstractC3817j, c3809b.f12413a, c3816iMo4352e, bVarM9349k.m9356g(j25, j20) ? 0 : 8, C2501V.f8333h), c20708nMo7451r2, iMo5120s2, objMo5118g2, jM9355f, bVarM9349k.m9354e(j25), j25, this.f25908d, c20708nMo7451r2);
        } else {
            C3816i c3816i2 = c3816iMo4352e;
            int i14 = 1;
            while (true) {
                i10 = i12;
                if (i13 >= iMin) {
                    break;
                }
                C0515a.m1031g(interfaceC3611g3);
                C3816i c3816iM4549a2 = c3816i2.m4549a(interfaceC3611g3.mo4352e((j25 + ((long) i13)) - j24), c3809b.f12413a);
                if (c3816iM4549a2 == null) {
                    break;
                }
                i14++;
                i13++;
                i12 = i10;
                c3816i2 = c3816iM4549a2;
            }
            long j27 = (j25 + ((long) i14)) - 1;
            long jM9354e3 = bVarM9349k.m9354e(j27);
            long j28 = (i10 == 0 || j23 > jM9354e3) ? j12 : j23;
            C1493m c1493mM4358a = C3612h.m4358a(abstractC3817j, c3809b.f12413a, c3816i2, bVarM9349k.m9356g(j27, j20) ? 0 : 8, C2501V.f8333h);
            long j29 = -abstractC3817j.f12466c;
            if (C20715u.m25331m(c20708nMo7451r2.f71033n)) {
                j29 += jM9355f;
            }
            c8015j = new C8015j(interfaceC1489i, c1493mM4358a, c20708nMo7451r2, iMo5120s2, objMo5118g2, jM9355f, jM9354e3, j26, j28, j25, i14, j29, bVarM9349k.f25922a);
        }
        c8012g.f27606a = c8015j;
    }

    @Override // p487b3.InterfaceC8014i
    /* JADX INFO: renamed from: g */
    public final void mo9345g(AbstractC8010e abstractC8010e) {
        if (abstractC8010e instanceof C8017l) {
            int iMo7449l = this.f25914j.mo7449l(((C8017l) abstractC8010e).f27600d);
            b[] bVarArr = this.f25913i;
            b bVar = bVarArr[iMo7449l];
            if (bVar.f25925d == null) {
                InterfaceC8011f interfaceC8011f = bVar.f25922a;
                C0515a.m1031g(interfaceC8011f);
                C12021g c12021gMo9973c = interfaceC8011f.mo9973c();
                if (c12021gMo9973c != null) {
                    AbstractC3817j abstractC3817j = bVar.f25923b;
                    bVarArr[iMo7449l] = new b(bVar.f25926e, abstractC3817j, bVar.f25924c, bVar.f25922a, bVar.f25927f, new C3613i(c12021gMo9973c, abstractC3817j.f12466c));
                }
            }
        }
        C7770d.c cVar = this.f25912h;
        if (cVar != null) {
            long j10 = cVar.f25943d;
            if (j10 == -9223372036854775807L || abstractC8010e.f27604h > j10) {
                cVar.f25943d = abstractC8010e.f27604h;
            }
            C7770d.this.f25935h = true;
        }
    }

    @Override // p487b3.InterfaceC8014i
    /* JADX INFO: renamed from: h */
    public final boolean mo9346h(AbstractC8010e abstractC8010e, boolean z10, InterfaceC10743i.c cVar, InterfaceC10743i interfaceC10743i) {
        InterfaceC10743i.b bVarMo12815c;
        long jMax;
        if (z10) {
            C7770d.c cVar2 = this.f25912h;
            if (cVar2 != null) {
                long j10 = cVar2.f25943d;
                boolean z11 = j10 != -9223372036854775807L && j10 < abstractC8010e.f27603g;
                C7770d c7770d = C7770d.this;
                if (c7770d.f25934g.f12420d) {
                    if (!c7770d.f25936i) {
                        if (z11) {
                            if (c7770d.f25935h) {
                                c7770d.f25936i = true;
                                c7770d.f25935h = false;
                                DashMediaSource dashMediaSource = DashMediaSource.this;
                                dashMediaSource.f25814D.removeCallbacks(dashMediaSource.f25842w);
                                dashMediaSource.m9326B();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z12 = this.f25915k.f12420d;
            b[] bVarArr = this.f25913i;
            if (!z12 && (abstractC8010e instanceof AbstractC8018m)) {
                IOException iOException = cVar.f33365a;
                if ((iOException instanceof C1502v) && ((C1502v) iOException).f5000e == 404) {
                    b bVar = bVarArr[this.f25914j.mo7449l(abstractC8010e.f27600d)];
                    long jM9353d = bVar.m9353d();
                    if (jM9353d != -1 && jM9353d != 0) {
                        InterfaceC3611g interfaceC3611g = bVar.f25925d;
                        C0515a.m1031g(interfaceC3611g);
                        if (((AbstractC8018m) abstractC8010e).mo9984c() > ((interfaceC3611g.mo4356i() + bVar.f25927f) + jM9353d) - 1) {
                            this.f25918n = true;
                            return true;
                        }
                    }
                }
            }
            b bVar2 = bVarArr[this.f25914j.mo7449l(abstractC8010e.f27600d)];
            AbstractC3817j abstractC3817j = bVar2.f25923b;
            C3809b c3809b = bVar2.f25924c;
            AbstractC2481A<C3809b> abstractC2481A = abstractC3817j.f12465b;
            C3606b c3606b = this.f25906b;
            C3809b c3809bM4347c = c3606b.m4347c(abstractC2481A);
            if (c3809bM4347c == null || c3809b.equals(c3809bM4347c)) {
                InterfaceC10325q interfaceC10325q = this.f25914j;
                AbstractC2481A<C3809b> abstractC2481A2 = bVar2.f25923b.f12465b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int length = interfaceC10325q.length();
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (interfaceC10325q.mo12434a(i11, jElapsedRealtime)) {
                        i10++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < abstractC2481A2.size(); i12++) {
                    hashSet.add(Integer.valueOf(abstractC2481A2.get(i12).f12415c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayListM4346a = c3606b.m4346a(abstractC2481A2);
                for (int i13 = 0; i13 < arrayListM4346a.size(); i13++) {
                    hashSet2.add(Integer.valueOf(((C3809b) arrayListM4346a.get(i13)).f12415c));
                }
                InterfaceC10743i.a aVar = new InterfaceC10743i.a(size, size - hashSet2.size(), length, i10);
                if ((aVar.m12816a(2) || aVar.m12816a(1)) && (bVarMo12815c = interfaceC10743i.mo12815c(aVar, cVar)) != null) {
                    long j11 = bVarMo12815c.f33364b;
                    int i14 = bVarMo12815c.f33363a;
                    if (aVar.m12816a(i14)) {
                        if (i14 == 2) {
                            InterfaceC10325q interfaceC10325q2 = this.f25914j;
                            return interfaceC10325q2.mo12436e(interfaceC10325q2.mo7449l(abstractC8010e.f27600d), j11);
                        }
                        if (i14 == 1) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j11;
                            String str = c3809b.f12414b;
                            HashMap map = c3606b.f11852a;
                            if (map.containsKey(str)) {
                                Long l10 = (Long) map.get(str);
                                String str2 = C0513S.f2002a;
                                jMax = Math.max(jElapsedRealtime2, l10.longValue());
                            } else {
                                jMax = jElapsedRealtime2;
                            }
                            map.put(str, Long.valueOf(jMax));
                            int i15 = c3809b.f12415c;
                            if (i15 != Integer.MIN_VALUE) {
                                Integer numValueOf = Integer.valueOf(i15);
                                HashMap map2 = c3606b.f11853b;
                                if (map2.containsKey(numValueOf)) {
                                    Long l11 = (Long) map2.get(numValueOf);
                                    String str3 = C0513S.f2002a;
                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l11.longValue());
                                }
                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p487b3.InterfaceC8014i
    /* JADX INFO: renamed from: i */
    public final int mo9347i(long j10, List<? extends AbstractC8018m> list) {
        return (this.f25917m != null || this.f25914j.length() < 2) ? list.size() : this.f25914j.mo12432p(j10, list);
    }

    @RequiresNonNull({"manifest", "adaptationSetIndices"})
    /* JADX INFO: renamed from: j */
    public final ArrayList<AbstractC3817j> m9348j() {
        List<C3808a> list = this.f25915k.m4525b(this.f25916l).f12453c;
        ArrayList<AbstractC3817j> arrayList = new ArrayList<>();
        for (int i10 : this.f25907c) {
            arrayList.addAll(list.get(i10).f12409c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final b m9349k(int i10) {
        b[] bVarArr = this.f25913i;
        b bVar = bVarArr[i10];
        C3809b c3809bM4347c = this.f25906b.m4347c(bVar.f25923b.f12465b);
        if (c3809bM4347c == null || c3809bM4347c.equals(bVar.f25924c)) {
            return bVar;
        }
        b bVar2 = new b(bVar.f25926e, bVar.f25923b, c3809bM4347c, bVar.f25922a, bVar.f25927f, bVar.f25925d);
        bVarArr[i10] = bVar2;
        return bVar2;
    }

    @Override // p487b3.InterfaceC8014i
    public final void release() {
        for (b bVar : this.f25913i) {
            InterfaceC8011f interfaceC8011f = bVar.f25922a;
            if (interfaceC8011f != null) {
                interfaceC8011f.release();
            }
        }
    }
}
