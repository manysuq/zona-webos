package androidx.media3.exoplayer;

import android.util.Pair;
import java.util.ArrayList;
import kotlin.jvm.internal.LongCompanionObject;
import p039C2.C0515a;
import p039C2.InterfaceC0535u;
import p170J7.AbstractC2481A;
import p183K2.C2779k0;
import p183K2.C2791q0;
import p183K2.C2793r0;
import p201L2.InterfaceC3188a;
import p453Z2.InterfaceC6695z;
import p884z2.AbstractC20686A;
import p884z2.C20696b;

/* JADX INFO: renamed from: androidx.media3.exoplayer.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7774h {

    /* JADX INFO: renamed from: c */
    public final InterfaceC3188a f26035c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0535u f26036d;

    /* JADX INFO: renamed from: e */
    public final C2779k0 f26037e;

    /* JADX INFO: renamed from: f */
    public long f26038f;

    /* JADX INFO: renamed from: g */
    public int f26039g;

    /* JADX INFO: renamed from: h */
    public boolean f26040h;

    /* JADX INFO: renamed from: j */
    public C2791q0 f26042j;

    /* JADX INFO: renamed from: k */
    public C2791q0 f26043k;

    /* JADX INFO: renamed from: l */
    public C2791q0 f26044l;

    /* JADX INFO: renamed from: m */
    public C2791q0 f26045m;

    /* JADX INFO: renamed from: n */
    public C2791q0 f26046n;

    /* JADX INFO: renamed from: o */
    public int f26047o;

    /* JADX INFO: renamed from: p */
    public Object f26048p;

    /* JADX INFO: renamed from: q */
    public long f26049q;

    /* JADX INFO: renamed from: i */
    public ExoPlayer.C7754c f26041i = ExoPlayer.C7754c.f25705a;

    /* JADX INFO: renamed from: a */
    public final AbstractC20686A.b f26033a = new AbstractC20686A.b();

    /* JADX INFO: renamed from: b */
    public final AbstractC20686A.c f26034b = new AbstractC20686A.c();

    /* JADX INFO: renamed from: r */
    public ArrayList f26050r = new ArrayList();

    public C7774h(InterfaceC3188a interfaceC3188a, InterfaceC0535u interfaceC0535u, C2779k0 c2779k0) {
        this.f26035c = interfaceC3188a;
        this.f26036d = interfaceC0535u;
        this.f26037e = c2779k0;
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC6695z.b m9437p(AbstractC20686A abstractC20686A, Object obj, long j10, long j11, AbstractC20686A.c cVar, AbstractC20686A.b bVar) {
        abstractC20686A.mo3482g(obj, bVar);
        abstractC20686A.m25224n(bVar.f70864c, cVar);
        abstractC20686A.mo3479b(obj);
        int i10 = bVar.f70868g.f70955b;
        if (i10 != 0) {
            if (i10 == 1) {
                bVar.m25229d(0);
            }
            bVar.f70868g.getClass();
            bVar.m25230e(0);
        }
        abstractC20686A.mo3482g(obj, bVar);
        int iM25253d = bVar.f70868g.m25253d(j10, bVar.f70865d);
        return iM25253d == -1 ? new InterfaceC6695z.b(bVar.f70868g.m25252c(j10, bVar.f70865d), j11, obj) : new InterfaceC6695z.b(obj, iM25253d, bVar.m25228c(iM25253d), j11, -1);
    }

    /* JADX INFO: renamed from: a */
    public final C2791q0 m9438a() {
        C2791q0 c2791q0 = this.f26042j;
        if (c2791q0 == null) {
            return null;
        }
        if (c2791q0 == this.f26043k) {
            this.f26043k = c2791q0.f9290m;
        }
        if (c2791q0 == this.f26044l) {
            this.f26044l = c2791q0.f9290m;
        }
        c2791q0.m3505i();
        int i10 = this.f26047o - 1;
        this.f26047o = i10;
        if (i10 == 0) {
            this.f26045m = null;
            C2791q0 c2791q1 = this.f26042j;
            this.f26048p = c2791q1.f9279b;
            this.f26049q = c2791q1.f9284g.f9295a.f22083d;
        }
        this.f26042j = this.f26042j.f9290m;
        m9449l();
        return this.f26042j;
    }

    /* JADX INFO: renamed from: b */
    public final void m9439b() {
        if (this.f26047o == 0) {
            return;
        }
        C2791q0 c2791q0 = this.f26042j;
        C0515a.m1031g(c2791q0);
        this.f26048p = c2791q0.f9279b;
        this.f26049q = c2791q0.f9284g.f9295a.f22083d;
        while (c2791q0 != null) {
            c2791q0.m3505i();
            c2791q0 = c2791q0.f9290m;
        }
        this.f26042j = null;
        this.f26045m = null;
        this.f26043k = null;
        this.f26044l = null;
        this.f26047o = 0;
        m9449l();
    }

    /* JADX INFO: renamed from: c */
    public final C2793r0 m9440c(AbstractC20686A abstractC20686A, C2791q0 c2791q0, long j10) {
        AbstractC20686A abstractC20686A2;
        Object obj;
        long j11;
        long j12;
        long j13;
        long jM9454r;
        C2793r0 c2793r0 = c2791q0.f9284g;
        long j14 = (c2791q0.f9293p + c2793r0.f9299e) - j10;
        if (c2793r0.f9302h) {
            C2793r0 c2793r1 = c2791q0.f9284g;
            InterfaceC6695z.b bVar = c2793r1.f9295a;
            long j15 = c2793r1.f9297c;
            int iM25221d = abstractC20686A.m25221d(abstractC20686A.mo3479b(bVar.f22080a), this.f26033a, this.f26034b, this.f26039g, this.f26040h);
            if (iM25221d != -1) {
                AbstractC20686A.b bVar2 = this.f26033a;
                int i10 = abstractC20686A.mo3451f(iM25221d, bVar2, true).f70864c;
                Object obj2 = bVar2.f70863b;
                obj2.getClass();
                long j16 = bVar.f22083d;
                if (abstractC20686A.mo3485m(i10, this.f26034b, 0L).f70884n == iM25221d) {
                    Pair<Object, Long> pairM25223j = abstractC20686A.m25223j(this.f26034b, this.f26033a, i10, -9223372036854775807L, Math.max(0L, j14));
                    if (pairM25223j != null) {
                        Object obj3 = pairM25223j.first;
                        long jLongValue = ((Long) pairM25223j.second).longValue();
                        C2791q0 c2791q1 = c2791q0.f9290m;
                        if (c2791q1 == null || !c2791q1.f9279b.equals(obj3)) {
                            jM9454r = m9454r(obj3);
                            if (jM9454r == -1) {
                                jM9454r = this.f26038f;
                                this.f26038f = 1 + jM9454r;
                            }
                        } else {
                            jM9454r = c2791q1.f9284g.f9295a.f22083d;
                        }
                        obj = obj3;
                        j11 = jLongValue;
                        j13 = jM9454r;
                        j12 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j11 = 0;
                    j12 = 0;
                    j13 = j16;
                }
                InterfaceC6695z.b bVarM9437p = m9437p(abstractC20686A, obj, j11, j13, this.f26034b, this.f26033a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    int i11 = abstractC20686A.mo3482g(bVar.f22080a, bVar2).f70868g.f70955b;
                    bVar2.f70868g.getClass();
                    if (i11 > 0) {
                        bVar2.m25230e(0);
                    }
                }
                return m9441d(abstractC20686A, bVarM9437p, j12, j11);
            }
            return null;
        }
        InterfaceC6695z.b bVar3 = c2793r0.f9295a;
        Object obj4 = bVar3.f22080a;
        int i12 = bVar3.f22084e;
        AbstractC20686A.b bVar4 = this.f26033a;
        abstractC20686A.mo3482g(obj4, bVar4);
        boolean z10 = c2793r0.f9301g;
        if (!bVar3.m7559b()) {
            if (i12 != -1) {
                bVar4.m25229d(i12);
            }
            int iM25228c = bVar4.m25228c(i12);
            bVar4.m25230e(i12);
            if (iM25228c != bVar4.f70868g.m25251b(i12).f70960b) {
                return m9442e(abstractC20686A, bVar3.f22080a, bVar3.f22084e, iM25228c, c2793r0.f9299e, bVar3.f22083d, z10);
            }
            abstractC20686A.mo3482g(obj4, bVar4);
            long jM25227b = bVar4.m25227b(i12);
            if (jM25227b == Long.MIN_VALUE) {
                jM25227b = bVar4.f70865d;
            } else {
                bVar4.f70868g.m25251b(i12).getClass();
            }
            return m9443f(abstractC20686A, bVar3.f22080a, jM25227b, c2793r0.f9299e, bVar3.f22083d, false);
        }
        int i13 = bVar3.f22081b;
        int i14 = bVar4.f70868g.m25251b(i13).f70960b;
        if (i14 == -1) {
            return null;
        }
        int iM25264b = bVar4.f70868g.m25251b(i13).m25264b(bVar3.f22082c);
        if (iM25264b < i14) {
            return m9442e(abstractC20686A, bVar3.f22080a, i13, iM25264b, c2793r0.f9297c, bVar3.f22083d, z10);
        }
        long jLongValue2 = c2793r0.f9297c;
        if (jLongValue2 == -9223372036854775807L) {
            Pair<Object, Long> pairM25223j2 = abstractC20686A.m25223j(this.f26034b, bVar4, bVar4.f70864c, -9223372036854775807L, Math.max(0L, j14));
            abstractC20686A2 = abstractC20686A;
            if (pairM25223j2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairM25223j2.second).longValue();
        } else {
            abstractC20686A2 = abstractC20686A;
        }
        int i15 = bVar3.f22081b;
        abstractC20686A2.mo3482g(obj4, bVar4);
        long jM25227b2 = bVar4.m25227b(i15);
        if (jM25227b2 == Long.MIN_VALUE) {
            jM25227b2 = bVar4.f70865d;
        } else {
            bVar4.f70868g.m25251b(i15).getClass();
        }
        return m9443f(abstractC20686A, bVar3.f22080a, Math.max(jM25227b2, jLongValue2), c2793r0.f9297c, bVar3.f22083d, z10);
    }

    /* JADX INFO: renamed from: d */
    public final C2793r0 m9441d(AbstractC20686A abstractC20686A, InterfaceC6695z.b bVar, long j10, long j11) {
        abstractC20686A.mo3482g(bVar.f22080a, this.f26033a);
        return bVar.m7559b() ? m9442e(abstractC20686A, bVar.f22080a, bVar.f22081b, bVar.f22082c, j10, bVar.f22083d, false) : m9443f(abstractC20686A, bVar.f22080a, j11, j10, bVar.f22083d, false);
    }

    /* JADX INFO: renamed from: e */
    public final C2793r0 m9442e(AbstractC20686A abstractC20686A, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        InterfaceC6695z.b bVar = new InterfaceC6695z.b(obj, i10, i11, j11, -1);
        AbstractC20686A.b bVar2 = this.f26033a;
        long jM25226a = abstractC20686A.mo3482g(obj, bVar2).m25226a(i10, i11);
        long jMax = i11 == bVar2.m25228c(i10) ? bVar2.f70868g.f70956c : 0L;
        bVar2.m25230e(i10);
        if (jM25226a != -9223372036854775807L && jMax >= jM25226a) {
            jMax = Math.max(0L, jM25226a - 1);
        }
        return new C2793r0(bVar, jMax, j10, -9223372036854775807L, jM25226a, z10, false, false, false, false);
    }

    /* JADX INFO: renamed from: f */
    public final C2793r0 m9443f(AbstractC20686A abstractC20686A, Object obj, long j10, long j11, long j12, boolean z10) {
        AbstractC20686A.b bVar = this.f26033a;
        abstractC20686A.mo3482g(obj, bVar);
        int iM25252c = bVar.f70868g.m25252c(j10, bVar.f70865d);
        boolean z11 = false;
        if (iM25252c != -1) {
            bVar.m25230e(iM25252c);
        } else if (bVar.f70868g.f70955b > 0) {
            bVar.m25230e(0);
        }
        InterfaceC6695z.b bVar2 = new InterfaceC6695z.b(iM25252c, j12, obj);
        if (!bVar2.m7559b() && iM25252c == -1) {
            z11 = true;
        }
        boolean zM9447j = m9447j(abstractC20686A, bVar2);
        boolean zM9446i = m9446i(abstractC20686A, bVar2, z11);
        if (iM25252c != -1) {
            bVar.m25230e(iM25252c);
        }
        if (iM25252c != -1) {
            bVar.m25229d(iM25252c);
        }
        long jM25227b = iM25252c != -1 ? bVar.m25227b(iM25252c) : -9223372036854775807L;
        long j13 = (jM25227b == -9223372036854775807L || jM25227b == Long.MIN_VALUE) ? bVar.f70865d : jM25227b;
        return new C2793r0(bVar2, (j13 == -9223372036854775807L || j10 < j13) ? j10 : Math.max(0L, j13 - ((long) 1)), j11, jM25227b, j13, z10, false, z11, zM9447j, zM9446i);
    }

    /* JADX INFO: renamed from: g */
    public final C2791q0 m9444g() {
        return this.f26044l;
    }

    /* JADX INFO: renamed from: h */
    public final C2793r0 m9445h(AbstractC20686A abstractC20686A, C2793r0 c2793r0) {
        long jM25226a;
        InterfaceC6695z.b bVar = c2793r0.f9295a;
        boolean zM7559b = bVar.m7559b();
        int i10 = bVar.f22084e;
        boolean z10 = !zM7559b && i10 == -1;
        int i11 = bVar.f22081b;
        boolean zM9447j = m9447j(abstractC20686A, bVar);
        boolean zM9446i = m9446i(abstractC20686A, bVar, z10);
        Object obj = bVar.f22080a;
        AbstractC20686A.b bVar2 = this.f26033a;
        abstractC20686A.mo3482g(obj, bVar2);
        long jM25227b = (bVar.m7559b() || i10 == -1) ? -9223372036854775807L : bVar2.m25227b(i10);
        if (bVar.m7559b()) {
            jM25226a = bVar2.m25226a(i11, bVar.f22082c);
        } else {
            jM25226a = (jM25227b == -9223372036854775807L || jM25227b == Long.MIN_VALUE) ? bVar2.f70865d : jM25227b;
        }
        if (bVar.m7559b()) {
            bVar2.m25230e(i11);
        } else if (i10 != -1) {
            bVar2.m25230e(i10);
        }
        return new C2793r0(bVar, c2793r0.f9296b, c2793r0.f9297c, jM25227b, jM25226a, c2793r0.f9300f, false, z10, zM9447j, zM9446i);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m9446i(AbstractC20686A abstractC20686A, InterfaceC6695z.b bVar, boolean z10) {
        int iMo3479b = abstractC20686A.mo3479b(bVar.f22080a);
        if (!abstractC20686A.mo3485m(abstractC20686A.mo3451f(iMo3479b, this.f26033a, false).f70864c, this.f26034b, 0L).f70879i) {
            if (abstractC20686A.m25221d(iMo3479b, this.f26033a, this.f26034b, this.f26039g, this.f26040h) == -1 && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m9447j(AbstractC20686A abstractC20686A, InterfaceC6695z.b bVar) {
        boolean z10 = !bVar.m7559b() && bVar.f22084e == -1;
        Object obj = bVar.f22080a;
        if (z10) {
            if (abstractC20686A.mo3485m(abstractC20686A.mo3482g(obj, this.f26033a).f70864c, this.f26034b, 0L).f70885o == abstractC20686A.mo3479b(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m9448k() {
        C2791q0 c2791q0 = this.f26046n;
        if (c2791q0 == null || c2791q0.m3504h()) {
            this.f26046n = null;
            for (int i10 = 0; i10 < this.f26050r.size(); i10++) {
                C2791q0 c2791q1 = (C2791q0) this.f26050r.get(i10);
                if (!c2791q1.m3504h()) {
                    this.f26046n = c2791q1;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9449l() {
        AbstractC2481A.b bVar = AbstractC2481A.f8293c;
        final AbstractC2481A.a aVar = new AbstractC2481A.a();
        for (C2791q0 c2791q0 = this.f26042j; c2791q0 != null; c2791q0 = c2791q0.f9290m) {
            aVar.m3326c(c2791q0.f9284g.f9295a);
        }
        C2791q0 c2791q1 = this.f26043k;
        final InterfaceC6695z.b bVar2 = c2791q1 == null ? null : c2791q1.f9284g.f9295a;
        this.f26036d.mo936h(new Runnable() { // from class: K2.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9305b.f26035c.mo3828G(aVar.m3216f(), bVar2);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Z2.a0, java.lang.Object] */
    /* JADX INFO: renamed from: m */
    public final void m9450m(long j10) {
        C2791q0 c2791q0 = this.f26045m;
        if (c2791q0 != null) {
            C0515a.m1030f(c2791q0.f9290m == null);
            if (c2791q0.f9282e) {
                c2791q0.f9278a.reevaluateBuffer(j10 - c2791q0.f9293p);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9451n(ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f26050r.size(); i10++) {
            ((C2791q0) this.f26050r.get(i10)).m3505i();
        }
        this.f26050r = arrayList;
        this.f26046n = null;
        m9448k();
    }

    /* JADX INFO: renamed from: o */
    public final int m9452o(C2791q0 c2791q0) {
        C0515a.m1031g(c2791q0);
        int i10 = 0;
        if (c2791q0.equals(this.f26045m)) {
            return 0;
        }
        this.f26045m = c2791q0;
        while (true) {
            c2791q0 = c2791q0.f9290m;
            if (c2791q0 == null) {
                break;
            }
            if (c2791q0 == this.f26043k) {
                C2791q0 c2791q1 = this.f26042j;
                this.f26043k = c2791q1;
                this.f26044l = c2791q1;
                i10 = 3;
            }
            if (c2791q0 == this.f26044l) {
                this.f26044l = this.f26043k;
                i10 |= 2;
            }
            c2791q0.m3505i();
            this.f26047o--;
        }
        C2791q0 c2791q2 = this.f26045m;
        c2791q2.getClass();
        if (c2791q2.f9290m != null) {
            c2791q2.m3498b();
            c2791q2.f9290m = null;
            c2791q2.m3499c();
        }
        m9449l();
        return i10;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC6695z.b m9453q(AbstractC20686A abstractC20686A, Object obj, long j10) {
        long jM9454r;
        int iMo3479b;
        Object obj2 = obj;
        AbstractC20686A.b bVar = this.f26033a;
        int i10 = abstractC20686A.mo3482g(obj2, bVar).f70864c;
        Object obj3 = this.f26048p;
        if (obj3 == null || (iMo3479b = abstractC20686A.mo3479b(obj3)) == -1 || abstractC20686A.mo3451f(iMo3479b, bVar, false).f70864c != i10) {
            C2791q0 c2791q0 = this.f26042j;
            while (true) {
                if (c2791q0 == null) {
                    C2791q0 c2791q1 = this.f26042j;
                    while (true) {
                        if (c2791q1 == null) {
                            jM9454r = m9454r(obj2);
                            if (jM9454r != -1) {
                                break;
                            }
                            jM9454r = this.f26038f;
                            this.f26038f = 1 + jM9454r;
                            if (this.f26042j != null) {
                                break;
                            }
                            this.f26048p = obj2;
                            this.f26049q = jM9454r;
                            break;
                        }
                        int iMo3479b2 = abstractC20686A.mo3479b(c2791q1.f9279b);
                        if (iMo3479b2 != -1 && abstractC20686A.mo3451f(iMo3479b2, bVar, false).f70864c == i10) {
                            jM9454r = c2791q1.f9284g.f9295a.f22083d;
                            break;
                        }
                        c2791q1 = c2791q1.f9290m;
                    }
                } else {
                    if (c2791q0.f9279b.equals(obj2)) {
                        jM9454r = c2791q0.f9284g.f9295a.f22083d;
                        break;
                    }
                    c2791q0 = c2791q0.f9290m;
                }
            }
        } else {
            jM9454r = this.f26049q;
        }
        abstractC20686A.mo3482g(obj2, bVar);
        int i11 = bVar.f70864c;
        AbstractC20686A.c cVar = this.f26034b;
        abstractC20686A.m25224n(i11, cVar);
        boolean z10 = false;
        for (int iMo3479b3 = abstractC20686A.mo3479b(obj); iMo3479b3 >= cVar.f70884n; iMo3479b3--) {
            abstractC20686A.mo3451f(iMo3479b3, bVar, true);
            C20696b c20696b = bVar.f70868g;
            boolean z11 = c20696b.f70955b > 0;
            z10 |= z11;
            long j11 = bVar.f70865d;
            if (c20696b.m25253d(j11, j11) != -1) {
                obj2 = bVar.f70863b;
                obj2.getClass();
            }
            if (z10 && (!z11 || bVar.f70865d != 0)) {
                break;
            }
        }
        return m9437p(abstractC20686A, obj2, j10, jM9454r, this.f26034b, this.f26033a);
    }

    /* JADX INFO: renamed from: r */
    public final long m9454r(Object obj) {
        for (int i10 = 0; i10 < this.f26050r.size(); i10++) {
            C2791q0 c2791q0 = (C2791q0) this.f26050r.get(i10);
            if (c2791q0.f9279b.equals(obj)) {
                return c2791q0.f9284g.f9295a.f22083d;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: s */
    public final int m9455s(AbstractC20686A abstractC20686A) {
        AbstractC20686A abstractC20686A2;
        C2791q0 c2791q0;
        C2791q0 c2791q1 = this.f26042j;
        if (c2791q1 == null) {
            return 0;
        }
        int iMo3479b = abstractC20686A.mo3479b(c2791q1.f9279b);
        while (true) {
            abstractC20686A2 = abstractC20686A;
            iMo3479b = abstractC20686A2.m25221d(iMo3479b, this.f26033a, this.f26034b, this.f26039g, this.f26040h);
            while (true) {
                c2791q1.getClass();
                c2791q0 = c2791q1.f9290m;
                if (c2791q0 == null || c2791q1.f9284g.f9302h) {
                    break;
                }
                c2791q1 = c2791q0;
            }
            if (iMo3479b == -1 || c2791q0 == null || abstractC20686A2.mo3479b(c2791q0.f9279b) != iMo3479b) {
                break;
            }
            c2791q1 = c2791q0;
            abstractC20686A = abstractC20686A2;
        }
        int iM9452o = m9452o(c2791q1);
        c2791q1.f9284g = m9445h(abstractC20686A2, c2791q1.f9284g);
        return iM9452o;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX INFO: renamed from: t */
    public final int m9456t(AbstractC20686A abstractC20686A, long j10, long j11, long j12) {
        C2793r0 c2793r0M9445h;
        boolean z10;
        C2791q0 c2791q0 = this.f26042j;
        C2791q0 c2791q1 = null;
        while (true) {
            int i10 = 0;
            if (c2791q0 == null) {
                return 0;
            }
            C2793r0 c2793r0 = c2791q0.f9284g;
            if (c2791q1 == null) {
                c2793r0M9445h = m9445h(abstractC20686A, c2793r0);
            } else {
                C2793r0 c2793r0M9440c = m9440c(abstractC20686A, c2791q1, j10);
                if (c2793r0M9440c == null || c2793r0.f9296b != c2793r0M9440c.f9296b || !c2793r0.f9295a.equals(c2793r0M9440c.f9295a)) {
                    return m9452o(c2791q1);
                }
                c2793r0M9445h = c2793r0M9440c;
            }
            long j13 = c2793r0M9445h.f9299e;
            long j14 = c2793r0.f9297c;
            long j15 = c2793r0.f9299e;
            c2791q0.f9284g = c2793r0M9445h.m3508a(j14);
            if (j15 != j13) {
                c2791q0.m3507k();
                long j16 = j13 == -9223372036854775807L ? LongCompanionObject.MAX_VALUE : j13 + c2791q0.f9293p;
                boolean z11 = c2791q0 == this.f26043k && !c2791q0.f9284g.f9301g && (j11 == Long.MIN_VALUE || j11 >= j16);
                boolean z12 = c2791q0 == this.f26044l && (j12 == Long.MIN_VALUE || j12 >= j16);
                int iM9452o = m9452o(c2791q0);
                if (iM9452o != 0) {
                    return iM9452o;
                }
                if (j15 == -9223372036854775807L && c2793r0.f9298d == Long.MIN_VALUE) {
                    long j17 = c2793r0M9445h.f9298d;
                    if (j17 == -9223372036854775807L || j17 == Long.MIN_VALUE) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                if (z11 && (j15 != -9223372036854775807L || z10)) {
                    i10 = 1;
                }
                return z12 ? i10 | 2 : i10;
            }
            c2791q1 = c2791q0;
            c2791q0 = c2791q0.f9290m;
        }
    }
}
