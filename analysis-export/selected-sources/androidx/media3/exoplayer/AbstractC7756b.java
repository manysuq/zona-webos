package androidx.media3.exoplayer;

import kotlin.jvm.internal.LongCompanionObject;
import p039C2.C0515a;
import p039C2.InterfaceC0522h;
import p165J2.C2457g;
import p183K2.C2741P0;
import p183K2.C2784n;
import p183K2.C2785n0;
import p183K2.InterfaceC2789p0;
import p201L2.C3193c0;
import p453Z2.InterfaceC6657Z;
import p453Z2.InterfaceC6695z;
import p623j$.util.Objects;
import p884z2.AbstractC20686A;
import p884z2.C20708n;

/* JADX INFO: renamed from: androidx.media3.exoplayer.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7756b implements InterfaceC7781n, InterfaceC7782o {

    /* JADX INFO: renamed from: c */
    public final int f25714c;

    /* JADX INFO: renamed from: e */
    public C2741P0 f25716e;

    /* JADX INFO: renamed from: f */
    public int f25717f;

    /* JADX INFO: renamed from: g */
    public C3193c0 f25718g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0522h f25719h;

    /* JADX INFO: renamed from: i */
    public int f25720i;

    /* JADX INFO: renamed from: j */
    public InterfaceC6657Z f25721j;

    /* JADX INFO: renamed from: k */
    public C20708n[] f25722k;

    /* JADX INFO: renamed from: l */
    public long f25723l;

    /* JADX INFO: renamed from: m */
    public long f25724m;

    /* JADX INFO: renamed from: o */
    public boolean f25726o;

    /* JADX INFO: renamed from: p */
    public boolean f25727p;

    /* JADX INFO: renamed from: r */
    public InterfaceC6695z.b f25729r;

    /* JADX INFO: renamed from: s */
    public InterfaceC7782o.a f25730s;

    /* JADX INFO: renamed from: b */
    public final Object f25713b = new Object();

    /* JADX INFO: renamed from: d */
    public final C2785n0 f25715d = new C2785n0();

    /* JADX INFO: renamed from: n */
    public long f25725n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: q */
    public AbstractC20686A f25728q = AbstractC20686A.f70861a;

    public AbstractC7756b(int i10) {
        this.f25714c = i10;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo4216A(long j10, boolean z10);

    /* JADX INFO: renamed from: G */
    public final int m9225G(C2785n0 c2785n0, C2457g c2457g, int i10) {
        InterfaceC6657Z interfaceC6657Z = this.f25721j;
        interfaceC6657Z.getClass();
        int iMo4361e = interfaceC6657Z.mo4361e(c2785n0, c2457g, i10);
        if (iMo4361e == -4) {
            if (c2457g.m3168f(4)) {
                this.f25725n = Long.MIN_VALUE;
                return this.f25726o ? -4 : -3;
            }
            long j10 = c2457g.f8196g + this.f25723l;
            c2457g.f8196g = j10;
            this.f25725n = Math.max(this.f25725n, j10);
            return iMo4361e;
        }
        if (iMo4361e == -5) {
            C20708n c20708n = c2785n0.f9275b;
            c20708n.getClass();
            long j11 = c20708n.f71038s;
            if (j11 != LongCompanionObject.MAX_VALUE) {
                C20708n.a aVarM25303a = c20708n.m25303a();
                aVarM25303a.f71077r = j11 + this.f25723l;
                c2785n0.f9275b = new C20708n(aVarM25303a);
            }
        }
        return iMo4361e;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    public final void disable() {
        C0515a.m1030f(this.f25720i == 1);
        this.f25715d.m3496a();
        this.f25720i = 0;
        this.f25721j = null;
        this.f25722k = null;
        this.f25726o = false;
        mo4241y();
        this.f25729r = null;
    }

    /* JADX INFO: renamed from: e */
    public int mo5948e() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: g */
    public final boolean mo9226g() {
        return this.f25725n == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    public final int getState() {
        return this.f25720i;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: i */
    public final void mo9228i() {
        this.f25726o = true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    public boolean isEnded() {
        return mo9226g();
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: j */
    public final void mo9229j(AbstractC20686A abstractC20686A) {
        if (Objects.equals(this.f25728q, abstractC20686A)) {
            return;
        }
        this.f25728q = abstractC20686A;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: k */
    public final void mo9230k() {
        InterfaceC6657Z interfaceC6657Z = this.f25721j;
        interfaceC6657Z.getClass();
        interfaceC6657Z.mo4359a();
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: l */
    public final boolean mo9231l() {
        return this.f25726o;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: m */
    public final int mo9232m() {
        return this.f25714c;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: n */
    public final void mo9233n(int i10, C3193c0 c3193c0, InterfaceC0522h interfaceC0522h) {
        this.f25717f = i10;
        this.f25718g = c3193c0;
        this.f25719h = interfaceC0522h;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: o */
    public final void mo9234o(C2741P0 c2741p0, C20708n[] c20708nArr, InterfaceC6657Z interfaceC6657Z, boolean z10, boolean z11, long j10, long j11, InterfaceC6695z.b bVar) {
        C0515a.m1030f(this.f25720i == 0);
        this.f25716e = c2741p0;
        this.f25729r = bVar;
        this.f25720i = 1;
        mo4242z(z10, z11);
        mo9235q(c20708nArr, interfaceC6657Z, j10, j11, bVar);
        this.f25726o = false;
        this.f25724m = j10;
        this.f25725n = j10;
        mo4216A(j10, z10);
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: p */
    public long mo5954p(long j10, long j11) {
        if (this.f25720i == 1) {
            return (isReady() || isEnded()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: q */
    public final void mo9235q(C20708n[] c20708nArr, InterfaceC6657Z interfaceC6657Z, long j10, long j11, InterfaceC6695z.b bVar) {
        C0515a.m1030f(!this.f25726o);
        this.f25721j = interfaceC6657Z;
        this.f25729r = bVar;
        if (this.f25725n == Long.MIN_VALUE) {
            this.f25725n = j10;
        }
        this.f25722k = c20708nArr;
        this.f25723l = j11;
        mo5538F(c20708nArr, j10, j11, bVar);
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    public final void release() {
        C0515a.m1030f(this.f25720i == 0);
        mo4218B();
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    public final void reset() {
        C0515a.m1030f(this.f25720i == 0);
        this.f25715d.m3496a();
        mo4219C();
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    public final void start() {
        C0515a.m1030f(this.f25720i == 1);
        this.f25720i = 2;
        mo4220D();
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    public final void stop() {
        C0515a.m1030f(this.f25720i == 2);
        this.f25720i = 1;
        mo4221E();
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: t */
    public final InterfaceC6657Z mo9237t() {
        return this.f25721j;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: u */
    public final long mo9238u() {
        return this.f25725n;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: v */
    public final void mo9239v(long j10) {
        this.f25726o = false;
        this.f25724m = j10;
        this.f25725n = j10;
        mo4216A(j10, false);
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: w */
    public InterfaceC2789p0 mo4240w() {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final C2784n m9240x(Exception exc, C20708n c20708n, boolean z10, int i10) {
        int iMo5543a;
        if (c20708n == null || this.f25727p) {
            iMo5543a = 4;
        } else {
            this.f25727p = true;
            try {
                iMo5543a = mo5543a(c20708n) & 7;
                this.f25727p = false;
            } catch (C2784n unused) {
                this.f25727p = false;
                iMo5543a = 4;
            } catch (Throwable th) {
                this.f25727p = false;
                throw th;
            }
        }
        return new C2784n(1, exc, i10, getName(), this.f25717f, c20708n, c20708n == null ? 4 : iMo5543a, this.f25729r, z10);
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo4241y();

    /* JADX INFO: renamed from: B */
    public void mo4218B() {
    }

    /* JADX INFO: renamed from: C */
    public void mo4219C() {
    }

    /* JADX INFO: renamed from: D */
    public void mo4220D() {
    }

    /* JADX INFO: renamed from: E */
    public void mo4221E() {
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void mo9227h() {
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: r */
    public final AbstractC7756b mo9236r() {
        return this;
    }

    @Override // androidx.media3.exoplayer.C7780m.b
    public void handleMessage(int i10, Object obj) {
    }

    @Override // androidx.media3.exoplayer.InterfaceC7781n
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void mo5957s(float f10, float f11) {
    }

    /* JADX INFO: renamed from: z */
    public void mo4242z(boolean z10, boolean z11) {
    }

    /* JADX INFO: renamed from: F */
    public void mo5538F(C20708n[] c20708nArr, long j10, long j11, InterfaceC6695z.b bVar) {
    }
}
