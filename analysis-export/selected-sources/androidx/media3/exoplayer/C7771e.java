package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.exoplayer.C7771e;
import androidx.media3.exoplayer.C7780m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import p039C2.C0505J;
import p039C2.C0506K;
import p039C2.C0513S;
import p039C2.C0515a;
import p039C2.C0529o;
import p039C2.C0539y;
import p039C2.InterfaceC0522h;
import p039C2.InterfaceC0535u;
import p093F2.C1490j;
import p170J7.AbstractC2481A;
import p170J7.C2500U;
import p183K2.C2731K0;
import p183K2.C2732L;
import p183K2.C2733L0;
import p183K2.C2735M0;
import p183K2.C2737N0;
import p183K2.C2741P0;
import p183K2.C2743Q0;
import p183K2.C2746S0;
import p183K2.C2748T0;
import p183K2.C2750U0;
import p183K2.C2768f;
import p183K2.C2776j;
import p183K2.C2778k;
import p183K2.C2779k0;
import p183K2.C2784n;
import p183K2.C2791q0;
import p183K2.C2793r0;
import p183K2.InterfaceC2787o0;
import p183K2.InterfaceC2789p0;
import p183K2.RunnableC2722G;
import p201L2.C3193c0;
import p201L2.InterfaceC3188a;
import p273P2.InterfaceC4043h;
import p453Z2.C6660b;
import p453Z2.C6677j0;
import p453Z2.InterfaceC6657Z;
import p453Z2.InterfaceC6659a0;
import p453Z2.InterfaceC6661b0;
import p453Z2.InterfaceC6694y;
import p453Z2.InterfaceC6695z;
import p517d3.AbstractC10331w;
import p517d3.C10332x;
import p517d3.InterfaceC10325q;
import p535e3.C10739e;
import p535e3.C10741g;
import p535e3.InterfaceC10737c;
import p570g3.InterfaceC11271u;
import p623j$.util.Objects;
import p884z2.AbstractC20686A;
import p884z2.C20698d;
import p884z2.C20708n;
import p884z2.C20711q;
import p884z2.C20714t;
import p884z2.C20715u;
import p884z2.C20716v;
import p884z2.C20718x;

/* JADX INFO: renamed from: androidx.media3.exoplayer.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7771e implements Handler.Callback, InterfaceC6694y.a, C7780m.a, InterfaceC11271u {

    /* JADX INFO: renamed from: g0 */
    public static final long f25945g0 = C0513S.m1002g0(10000);

    /* JADX INFO: renamed from: A */
    public final boolean f25946A;

    /* JADX INFO: renamed from: B */
    public final C2768f f25947B;

    /* JADX INFO: renamed from: C */
    public C2748T0 f25948C;

    /* JADX INFO: renamed from: D */
    public C2746S0 f25949D;

    /* JADX INFO: renamed from: E */
    public boolean f25950E;

    /* JADX INFO: renamed from: F */
    public boolean f25951F;

    /* JADX INFO: renamed from: G */
    public g f25952G;

    /* JADX INFO: renamed from: H */
    public C2731K0 f25953H;

    /* JADX INFO: renamed from: I */
    public e f25954I;

    /* JADX INFO: renamed from: J */
    public boolean f25955J;

    /* JADX INFO: renamed from: K */
    public boolean f25956K;

    /* JADX INFO: renamed from: L */
    public boolean f25957L;

    /* JADX INFO: renamed from: M */
    public boolean f25958M;

    /* JADX INFO: renamed from: N */
    public long f25959N;

    /* JADX INFO: renamed from: O */
    public boolean f25960O;

    /* JADX INFO: renamed from: P */
    public int f25961P;

    /* JADX INFO: renamed from: Q */
    public boolean f25962Q;

    /* JADX INFO: renamed from: R */
    public boolean f25963R;

    /* JADX INFO: renamed from: S */
    public boolean f25964S;

    /* JADX INFO: renamed from: T */
    public boolean f25965T;

    /* JADX INFO: renamed from: U */
    public int f25966U;

    /* JADX INFO: renamed from: V */
    public g f25967V;

    /* JADX INFO: renamed from: W */
    public long f25968W;

    /* JADX INFO: renamed from: X */
    public long f25969X;

    /* JADX INFO: renamed from: Y */
    public int f25970Y;

    /* JADX INFO: renamed from: Z */
    public boolean f25971Z;

    /* JADX INFO: renamed from: a0 */
    public C2784n f25972a0;

    /* JADX INFO: renamed from: b */
    public final C2743Q0[] f25973b;

    /* JADX INFO: renamed from: b0 */
    public long f25974b0;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7782o[] f25975c;

    /* JADX INFO: renamed from: c0 */
    public ExoPlayer.C7754c f25976c0;

    /* JADX INFO: renamed from: d */
    public final boolean[] f25977d;

    /* JADX INFO: renamed from: d0 */
    public long f25978d0;

    /* JADX INFO: renamed from: e */
    public final AbstractC10331w f25979e;

    /* JADX INFO: renamed from: e0 */
    public boolean f25980e0;

    /* JADX INFO: renamed from: f */
    public final C10332x f25981f;

    /* JADX INFO: renamed from: f0 */
    public float f25982f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC7772f f25983g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC10737c f25984h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0535u f25985i;

    /* JADX INFO: renamed from: j */
    public final C2733L0 f25986j;

    /* JADX INFO: renamed from: k */
    public final Looper f25987k;

    /* JADX INFO: renamed from: l */
    public final AbstractC20686A.c f25988l;

    /* JADX INFO: renamed from: m */
    public final AbstractC20686A.b f25989m;

    /* JADX INFO: renamed from: n */
    public final long f25990n;

    /* JADX INFO: renamed from: o */
    public final boolean f25991o;

    /* JADX INFO: renamed from: p */
    public final C2778k f25992p;

    /* JADX INFO: renamed from: q */
    public final ArrayList<d> f25993q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0522h f25994r;

    /* JADX INFO: renamed from: s */
    public final C2732L f25995s;

    /* JADX INFO: renamed from: t */
    public final C7774h f25996t;

    /* JADX INFO: renamed from: u */
    public final C7775i f25997u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC2787o0 f25998v;

    /* JADX INFO: renamed from: w */
    public final long f25999w;

    /* JADX INFO: renamed from: x */
    public final C3193c0 f26000x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC3188a f26001y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC0535u f26002z;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class a implements InterfaceC7781n.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.InterfaceC7781n.a
        /* JADX INFO: renamed from: a */
        public final void mo9434a() {
            C7771e.this.f25964S = true;
        }

        @Override // androidx.media3.exoplayer.InterfaceC7781n.a
        /* JADX INFO: renamed from: b */
        public final void mo9435b() {
            C7771e c7771e = C7771e.this;
            if (c7771e.f25950E) {
                c7771e.f25949D.getClass();
            } else if (!c7771e.f25965T) {
                return;
            }
            c7771e.f25985i.mo939k(2);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final ArrayList f26004a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC6661b0 f26005b;

        /* JADX INFO: renamed from: c */
        public final int f26006c;

        /* JADX INFO: renamed from: d */
        public final long f26007d;

        public b() {
            throw null;
        }

        public b(ArrayList arrayList, InterfaceC6661b0 interfaceC6661b0, int i10, long j10) {
            this.f26004a = arrayList;
            this.f26005b = interfaceC6661b0;
            this.f26006c = i10;
            this.f26007d = j10;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class c {
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class d implements Comparable<d> {
        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            dVar.getClass();
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public boolean f26008a;

        /* JADX INFO: renamed from: b */
        public C2731K0 f26009b;

        /* JADX INFO: renamed from: c */
        public int f26010c;

        /* JADX INFO: renamed from: d */
        public boolean f26011d;

        /* JADX INFO: renamed from: e */
        public int f26012e;

        public e(C2731K0 c2731k0) {
            this.f26009b = c2731k0;
        }

        /* JADX INFO: renamed from: a */
        public final void m9436a(int i10) {
            this.f26008a |= i10 > 0;
            this.f26010c += i10;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6695z.b f26013a;

        /* JADX INFO: renamed from: b */
        public final long f26014b;

        /* JADX INFO: renamed from: c */
        public final long f26015c;

        /* JADX INFO: renamed from: d */
        public final boolean f26016d;

        /* JADX INFO: renamed from: e */
        public final boolean f26017e;

        /* JADX INFO: renamed from: f */
        public final boolean f26018f;

        public f(InterfaceC6695z.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f26013a = bVar;
            this.f26014b = j10;
            this.f26015c = j11;
            this.f26016d = z10;
            this.f26017e = z11;
            this.f26018f = z12;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final AbstractC20686A f26019a;

        /* JADX INFO: renamed from: b */
        public final int f26020b;

        /* JADX INFO: renamed from: c */
        public final long f26021c;

        public g(AbstractC20686A abstractC20686A, int i10, long j10) {
            this.f26019a = abstractC20686A;
            this.f26020b = i10;
            this.f26021c = j10;
        }
    }

    public C7771e(Context context, InterfaceC7781n[] interfaceC7781nArr, InterfaceC7781n[] interfaceC7781nArr2, AbstractC10331w abstractC10331w, C10332x c10332x, InterfaceC7772f interfaceC7772f, InterfaceC10737c interfaceC10737c, int i10, boolean z10, InterfaceC3188a interfaceC3188a, C2748T0 c2748t0, C2776j c2776j, long j10, Looper looper, C0505J c0505j, C2732L c2732l, C3193c0 c3193c0, final InterfaceC11271u interfaceC11271u) {
        ExoPlayer.C7754c c7754c = ExoPlayer.C7754c.f25705a;
        this.f25978d0 = -9223372036854775807L;
        this.f25995s = c2732l;
        this.f25979e = abstractC10331w;
        this.f25981f = c10332x;
        this.f25983g = interfaceC7772f;
        this.f25984h = interfaceC10737c;
        this.f25961P = i10;
        this.f25962Q = z10;
        this.f25948C = c2748t0;
        this.f25998v = c2776j;
        this.f25999w = j10;
        this.f25956K = false;
        this.f25994r = c0505j;
        this.f26000x = c3193c0;
        this.f25976c0 = c7754c;
        this.f26001y = interfaceC3188a;
        this.f25982f0 = 1.0f;
        this.f25949D = C2746S0.f9174b;
        this.f25974b0 = -9223372036854775807L;
        this.f25959N = -9223372036854775807L;
        this.f25990n = interfaceC7772f.mo9245d();
        this.f25991o = interfaceC7772f.mo9243b();
        AbstractC20686A.a aVar = AbstractC20686A.f70861a;
        C2731K0 c2731k0M3436k = C2731K0.m3436k(c10332x);
        this.f25953H = c2731k0M3436k;
        this.f25954I = new e(c2731k0M3436k);
        this.f25975c = new InterfaceC7782o[interfaceC7781nArr.length];
        this.f25977d = new boolean[interfaceC7781nArr.length];
        InterfaceC7782o.a aVarMo12449b = abstractC10331w.mo12449b();
        this.f25973b = new C2743Q0[interfaceC7781nArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < interfaceC7781nArr.length; i11++) {
            interfaceC7781nArr[i11].mo9233n(i11, c3193c0, c0505j);
            this.f25975c[i11] = interfaceC7781nArr[i11].mo9236r();
            if (aVarMo12449b != null) {
                AbstractC7756b abstractC7756b = (AbstractC7756b) this.f25975c[i11];
                synchronized (abstractC7756b.f25713b) {
                    abstractC7756b.f25730s = aVarMo12449b;
                }
            }
            InterfaceC7781n interfaceC7781n = interfaceC7781nArr2[i11];
            if (interfaceC7781n != null) {
                interfaceC7781n.mo9233n(i11, c3193c0, c0505j);
                z11 = true;
            }
            this.f25973b[i11] = new C2743Q0(interfaceC7781nArr[i11], interfaceC7781nArr2[i11], i11);
        }
        this.f25946A = z11;
        this.f25992p = new C2778k(this, c0505j);
        this.f25993q = new ArrayList<>();
        this.f25988l = new AbstractC20686A.c();
        this.f25989m = new AbstractC20686A.b();
        C0515a.m1030f(abstractC10331w.f32009a == null);
        abstractC10331w.f32009a = this;
        abstractC10331w.f32010b = interfaceC10737c;
        this.f25971Z = true;
        C0506K c0506kMo926a = c0505j.mo926a(looper, null);
        this.f26002z = c0506kMo926a;
        this.f25996t = new C7774h(interfaceC3188a, c0506kMo926a, new C2779k0(this));
        this.f25997u = new C7775i(this, interfaceC3188a, c0506kMo926a, c3193c0);
        C2733L0 c2733l0 = new C2733L0();
        this.f25986j = c2733l0;
        Looper looperM3449a = c2733l0.m3449a();
        this.f25987k = looperM3449a;
        C0506K c0506kMo926a2 = c0505j.mo926a(looperM3449a, this);
        this.f25985i = c0506kMo926a2;
        this.f25947B = new C2768f(context, looperM3449a, this);
        c0506kMo926a2.mo934f(35, new InterfaceC11271u() { // from class: K2.l0
            @Override // p570g3.InterfaceC11271u
            /* JADX INFO: renamed from: b */
            public final void mo3494b(long j11, long j12, C20708n c20708n, MediaFormat mediaFormat) {
                C7771e c7771e = this.f9265b;
                c7771e.getClass();
                interfaceC11271u.mo3494b(j11, j12, c20708n, mediaFormat);
                c7771e.mo3494b(j11, j12, c20708n, mediaFormat);
            }
        }).m942b();
    }

    /* JADX INFO: renamed from: S */
    public static Pair<Object, Long> m9357S(AbstractC20686A abstractC20686A, g gVar, boolean z10, int i10, boolean z11, AbstractC20686A.c cVar, AbstractC20686A.b bVar) {
        int iM9358T;
        AbstractC20686A abstractC20686A2 = gVar.f26019a;
        if (abstractC20686A.m25225p()) {
            return null;
        }
        AbstractC20686A abstractC20686A3 = abstractC20686A2.m25225p() ? abstractC20686A : abstractC20686A2;
        try {
            Pair<Object, Long> pairM25222i = abstractC20686A3.m25222i(cVar, bVar, gVar.f26020b, gVar.f26021c);
            if (!abstractC20686A.equals(abstractC20686A3)) {
                if (abstractC20686A.mo3479b(pairM25222i.first) == -1) {
                    if (!z10 || (iM9358T = m9358T(cVar, bVar, i10, z11, pairM25222i.first, abstractC20686A3, abstractC20686A)) == -1) {
                        return null;
                    }
                    return abstractC20686A.m25222i(cVar, bVar, iM9358T, -9223372036854775807L);
                }
                if (abstractC20686A3.mo3482g(pairM25222i.first, bVar).f70867f && abstractC20686A3.mo3485m(bVar.f70864c, cVar, 0L).f70884n == abstractC20686A3.mo3479b(pairM25222i.first)) {
                    return abstractC20686A.m25222i(cVar, bVar, abstractC20686A.mo3482g(pairM25222i.first, bVar).f70864c, gVar.f26021c);
                }
            }
            return pairM25222i;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: T */
    public static int m9358T(AbstractC20686A.c cVar, AbstractC20686A.b bVar, int i10, boolean z10, Object obj, AbstractC20686A abstractC20686A, AbstractC20686A abstractC20686A2) {
        AbstractC20686A abstractC20686A3 = abstractC20686A;
        Object obj2 = abstractC20686A3.mo3485m(abstractC20686A3.mo3482g(obj, bVar).f70864c, cVar, 0L).f70871a;
        for (int i11 = 0; i11 < abstractC20686A2.mo3453o(); i11++) {
            if (abstractC20686A2.mo3485m(i11, cVar, 0L).f70871a.equals(obj2)) {
                return i11;
            }
        }
        int iMo3479b = abstractC20686A3.mo3479b(obj);
        int iMo3452h = abstractC20686A3.mo3452h();
        int i12 = 0;
        int iMo3479b2 = -1;
        while (i12 < iMo3452h && iMo3479b2 == -1) {
            AbstractC20686A abstractC20686A4 = abstractC20686A3;
            int iM25221d = abstractC20686A4.m25221d(iMo3479b, bVar, cVar, i10, z10);
            if (iM25221d == -1) {
                break;
            }
            iMo3479b2 = abstractC20686A2.mo3479b(abstractC20686A4.mo3484l(iM25221d));
            i12++;
            abstractC20686A3 = abstractC20686A4;
            iMo3479b = iM25221d;
        }
        if (iMo3479b2 == -1) {
            return -1;
        }
        return abstractC20686A2.mo3451f(iMo3479b2, bVar, false).f70864c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Z2.a0, Z2.y, java.lang.Object] */
    /* JADX INFO: renamed from: z */
    public static boolean m9359z(C2791q0 c2791q0) {
        if (c2791q0 != null) {
            try {
                ?? r10 = c2791q0.f9278a;
                if (c2791q0.f9282e) {
                    for (InterfaceC6657Z interfaceC6657Z : c2791q0.f9280c) {
                        if (interfaceC6657Z != null) {
                            interfaceC6657Z.mo4359a();
                        }
                    }
                } else {
                    r10.maybeThrowPrepareError();
                }
                if ((!c2791q0.f9282e ? 0L : r10.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9360A(int i10, InterfaceC6695z.b bVar) {
        C7774h c7774h = this.f25996t;
        C2791q0 c2791q0 = c7774h.f26044l;
        if (c2791q0 != null && c2791q0.f9284g.f9295a.equals(bVar)) {
            C2743Q0 c2743q0 = this.f25973b[i10];
            C2791q0 c2791q1 = c7774h.f26044l;
            int i11 = c2743q0.f9169d;
            boolean z10 = (i11 == 2 || i11 == 4) && c2743q0.m3460c(c2791q1) == c2743q0.f9166a;
            boolean z11 = c2743q0.f9169d == 3 && c2743q0.m3460c(c2791q1) == c2743q0.f9168c;
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m9361A0(AbstractC20686A abstractC20686A, InterfaceC6695z.b bVar, AbstractC20686A abstractC20686A2, InterfaceC6695z.b bVar2, long j10, boolean z10) {
        boolean zM9418r0 = m9418r0(abstractC20686A, bVar);
        Object obj = bVar.f22080a;
        if (!zM9418r0) {
            C20718x c20718x = bVar.m7559b() ? C20718x.f71221d : this.f25953H.f9139o;
            C2778k c2778k = this.f25992p;
            if (c2778k.getPlaybackParameters().equals(c20718x)) {
                return;
            }
            this.f25985i.mo940l(16);
            c2778k.mo3472b(c20718x);
            m9429x(this.f25953H.f9139o, c20718x.f71222a, false, false);
            return;
        }
        AbstractC20686A.b bVar3 = this.f25989m;
        int i10 = abstractC20686A.mo3482g(obj, bVar3).f70864c;
        AbstractC20686A.c cVar = this.f25988l;
        abstractC20686A.m25224n(i10, cVar);
        C20711q.f fVar = cVar.f70880j;
        C2776j c2776j = (C2776j) this.f25998v;
        c2776j.getClass();
        c2776j.f9242c = C0513S.m982T(fVar.f71123a);
        c2776j.f9245f = C0513S.m982T(fVar.f71124b);
        c2776j.f9246g = C0513S.m982T(fVar.f71125c);
        float f10 = fVar.f71126d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        c2776j.f9249j = f10;
        float f11 = fVar.f71127e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        c2776j.f9248i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            c2776j.f9242c = -9223372036854775807L;
        }
        c2776j.m3492a();
        if (j10 != -9223372036854775807L) {
            c2776j.f9243d = m9407m(abstractC20686A, obj, j10);
            c2776j.m3492a();
            return;
        }
        if (!Objects.equals(!abstractC20686A2.m25225p() ? abstractC20686A2.mo3485m(abstractC20686A2.mo3482g(bVar2.f22080a, bVar3).f70864c, cVar, 0L).f70871a : null, cVar.f70871a) || z10) {
            c2776j.f9243d = -9223372036854775807L;
            c2776j.m3492a();
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m9362B() {
        C2791q0 c2791q0 = this.f25996t.f26042j;
        long j10 = c2791q0.f9284g.f9299e;
        if (c2791q0.f9282e) {
            return j10 == -9223372036854775807L || this.f25953H.f9143s < j10 || !m9416q0();
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m9363B0(boolean z10, boolean z11) {
        this.f25958M = z10;
        this.f25959N = (!z10 || z11) ? -9223372036854775807L : this.f25994r.elapsedRealtime();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [Z2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [Z2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Z2.a0, java.lang.Object] */
    /* JADX INFO: renamed from: C */
    public final void m9364C() {
        long j10;
        long j11;
        boolean zMo9248g;
        if (m9359z(this.f25996t.f26045m)) {
            C2791q0 c2791q0 = this.f25996t.f26045m;
            long jM9413p = m9413p(!c2791q0.f9282e ? 0L : c2791q0.f9278a.getNextLoadPositionUs());
            if (c2791q0 == this.f25996t.f26042j) {
                j10 = this.f25968W;
                j11 = c2791q0.f9293p;
            } else {
                j10 = this.f25968W - c2791q0.f9293p;
                j11 = c2791q0.f9284g.f9296b;
            }
            long j12 = j10 - j11;
            long j13 = m9418r0(this.f25953H.f9125a, c2791q0.f9284g.f9295a) ? ((C2776j) this.f25998v).f9247h : -9223372036854775807L;
            C3193c0 c3193c0 = this.f26000x;
            AbstractC20686A abstractC20686A = this.f25953H.f9125a;
            InterfaceC6695z.b bVar = c2791q0.f9284g.f9295a;
            float f10 = this.f25992p.getPlaybackParameters().f71222a;
            boolean z10 = this.f25953H.f9136l;
            InterfaceC7772f.a aVar = new InterfaceC7772f.a(c3193c0, abstractC20686A, bVar, j12, jM9413p, f10, this.f25958M, j13);
            zMo9248g = this.f25983g.mo9248g(aVar);
            C2791q0 c2791q1 = this.f25996t.f26042j;
            if (!zMo9248g && c2791q1.f9282e && jM9413p < 500000 && (this.f25990n > 0 || this.f25991o)) {
                c2791q1.f9278a.discardBuffer(this.f25953H.f9143s, false);
                zMo9248g = this.f25983g.mo9248g(aVar);
            }
        } else {
            zMo9248g = false;
        }
        this.f25960O = zMo9248g;
        if (zMo9248g) {
            C2791q0 c2791q2 = this.f25996t.f26045m;
            c2791q2.getClass();
            C7773g.a aVar2 = new C7773g.a();
            aVar2.f26030a = this.f25968W - c2791q2.f9293p;
            float f11 = this.f25992p.getPlaybackParameters().f71222a;
            C0515a.m1025a(f11 > 0.0f || f11 == -3.4028235E38f);
            aVar2.f26031b = f11;
            long j14 = this.f25959N;
            C0515a.m1025a(j14 >= 0 || j14 == -9223372036854775807L);
            aVar2.f26032c = j14;
            C7773g c7773g = new C7773g(aVar2);
            C0515a.m1030f(c2791q2.f9290m == null);
            c2791q2.f9278a.mo5133c(c7773g);
        }
        m9426v0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Z2.a0, Z2.y, java.lang.Object] */
    /* JADX INFO: renamed from: D */
    public final void m9365D() {
        C7774h c7774h = this.f25996t;
        c7774h.m9448k();
        C2791q0 c2791q0 = c7774h.f26046n;
        if (c2791q0 != null) {
            ?? r10 = c2791q0.f9278a;
            if ((!c2791q0.f9281d || c2791q0.f9282e) && !r10.isLoading()) {
                AbstractC20686A abstractC20686A = this.f25953H.f9125a;
                if (c2791q0.f9282e) {
                    r10.getBufferedPositionUs();
                }
                if (this.f25983g.mo9249h()) {
                    if (!c2791q0.f9281d) {
                        long j10 = c2791q0.f9284g.f9296b;
                        c2791q0.f9281d = true;
                        r10.mo5134d(this, j10);
                        return;
                    }
                    C7773g.a aVar = new C7773g.a();
                    aVar.f26030a = this.f25968W - c2791q0.f9293p;
                    float f10 = this.f25992p.getPlaybackParameters().f71222a;
                    C0515a.m1025a(f10 > 0.0f || f10 == -3.4028235E38f);
                    aVar.f26031b = f10;
                    long j11 = this.f25959N;
                    C0515a.m1025a(j11 >= 0 || j11 == -9223372036854775807L);
                    aVar.f26032c = j11;
                    C7773g c7773g = new C7773g(aVar);
                    C0515a.m1030f(c2791q0.f9290m == null);
                    r10.mo5133c(c7773g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m9366E() {
        e eVar = this.f25954I;
        C2731K0 c2731k0 = this.f25953H;
        boolean z10 = eVar.f26008a | (eVar.f26009b != c2731k0);
        eVar.f26008a = z10;
        eVar.f26009b = c2731k0;
        if (z10) {
            C7758d c7758d = this.f25995s.f9145a;
            c7758d.f25785j.mo936h(new RunnableC2722G(0, c7758d, eVar));
            this.f25954I = new e(this.f25953H);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m9367F(int i10) {
        C2743Q0 c2743q0 = this.f25973b[i10];
        try {
            C2791q0 c2791q0 = this.f25996t.f26042j;
            c2791q0.getClass();
            InterfaceC7781n interfaceC7781nM3460c = c2743q0.m3460c(c2791q0);
            interfaceC7781nM3460c.getClass();
            interfaceC7781nM3460c.mo9230k();
        } catch (IOException | RuntimeException e10) {
            int iMo9232m = c2743q0.f9166a.mo9232m();
            if (iMo9232m != 3 && iMo9232m != 5) {
                throw e10;
            }
            C10332x c10332x = this.f25996t.f26042j.f9292o;
            C0539y.m1072d("Disabling track due to error: " + C20708n.m25302c(c10332x.f32013c[i10].mo7451r()), e10);
            C10332x c10332x2 = new C10332x((C2741P0[]) c10332x.f32012b.clone(), (InterfaceC10325q[]) c10332x.f32013c.clone(), c10332x.f32014d, c10332x.f32015e);
            c10332x2.f32012b[i10] = null;
            c10332x2.f32013c[i10] = null;
            m9399i(i10);
            C2791q0 c2791q1 = this.f25996t.f26042j;
            c2791q1.m3497a(c10332x2, this.f25953H.f9143s, false, new boolean[c2791q1.f9287j.length]);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m9368G(final int i10, final boolean z10) {
        boolean[] zArr = this.f25977d;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f26002z.mo936h(new Runnable() { // from class: K2.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C7771e c7771e = this.f9237b;
                    InterfaceC3188a interfaceC3188a = c7771e.f26001y;
                    C2743Q0[] c2743q0Arr = c7771e.f25973b;
                    int i11 = i10;
                    interfaceC3188a.mo3845X(i11, c2743q0Arr[i11].f9166a.mo9232m(), z10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m9369H() throws Throwable {
        m9425v(this.f25997u.m9460b(), true);
    }

    /* JADX INFO: renamed from: I */
    public final void m9370I(c cVar) throws Throwable {
        this.f25954I.m9436a(1);
        cVar.getClass();
        C7775i c7775i = this.f25997u;
        C0515a.m1025a(c7775i.f26076b.size() >= 0);
        c7775i.f26084j = null;
        m9425v(c7775i.m9460b(), false);
    }

    /* JADX INFO: renamed from: J */
    public final void m9371J() {
        this.f25954I.m9436a(1);
        m9376O(false, false, false, true);
        this.f25983g.mo9250i(this.f26000x);
        m9408m0(this.f25953H.f9125a.m25225p() ? 4 : 2);
        C2731K0 c2731k0 = this.f25953H;
        boolean z10 = c2731k0.f9136l;
        m9432y0(this.f25947B.m3490d(c2731k0.f9129e, z10), c2731k0.f9138n, c2731k0.f9137m, z10);
        C10741g c10741gMo12804c = this.f25984h.mo12804c();
        C7775i c7775i = this.f25997u;
        ArrayList arrayList = c7775i.f26076b;
        C0515a.m1030f(!c7775i.f26085k);
        c7775i.f26086l = c10741gMo12804c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C7775i.c cVar = (C7775i.c) arrayList.get(i10);
            c7775i.m9463e(cVar);
            c7775i.f26081g.add(cVar);
        }
        c7775i.f26085k = true;
        this.f25985i.mo939k(2);
    }

    /* JADX INFO: renamed from: K */
    public final void m9372K(C0529o c0529o) {
        C2733L0 c2733l0 = this.f25986j;
        InterfaceC0535u interfaceC0535u = this.f25985i;
        try {
            m9376O(true, false, true, false);
            m9373L();
            this.f25983g.mo9246e(this.f26000x);
            C2768f c2768f = this.f25947B;
            c2768f.f9212c = null;
            c2768f.m3487a();
            c2768f.m3489c(0);
            this.f25979e.mo12450d();
            m9408m0(1);
        } finally {
            interfaceC0535u.mo933e();
            c2733l0.m3450b();
            c0529o.m1052e();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m9373L() {
        for (int i10 = 0; i10 < this.f25973b.length; i10++) {
            AbstractC7756b abstractC7756b = (AbstractC7756b) this.f25975c[i10];
            synchronized (abstractC7756b.f25713b) {
                abstractC7756b.f25730s = null;
            }
            C2743Q0 c2743q0 = this.f25973b[i10];
            c2743q0.f9166a.release();
            c2743q0.f9170e = false;
            InterfaceC7781n interfaceC7781n = c2743q0.f9168c;
            if (interfaceC7781n != null) {
                interfaceC7781n.release();
                c2743q0.f9171f = false;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m9374M(int i10, int i11, InterfaceC6661b0 interfaceC6661b0) throws Throwable {
        this.f25954I.m9436a(1);
        C7775i c7775i = this.f25997u;
        c7775i.getClass();
        C0515a.m1025a(i10 >= 0 && i10 <= i11 && i11 <= c7775i.f26076b.size());
        c7775i.f26084j = interfaceC6661b0;
        c7775i.m9465g(i10, i11);
        m9425v(c7775i.m9460b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    public final void m9375N() {
        int i10;
        float f10 = this.f25992p.getPlaybackParameters().f71222a;
        C7774h c7774h = this.f25996t;
        C2791q0 c2791q0 = c7774h.f26042j;
        C2791q0 c2791q1 = c7774h.f26043k;
        C10332x c10332x = null;
        C2791q0 c2791q2 = c2791q0;
        boolean z10 = true;
        while (c2791q2 != null && c2791q2.f9282e) {
            C2731K0 c2731k0 = this.f25953H;
            C10332x c10332xM3506j = c2791q2.m3506j(f10, c2731k0.f9125a, c2731k0.f9136l);
            C10332x c10332x2 = c2791q2 == this.f25996t.f26042j ? c10332xM3506j : c10332x;
            C10332x c10332x3 = c2791q2.f9292o;
            InterfaceC10325q[] interfaceC10325qArr = c10332xM3506j.f32013c;
            if (c10332x3 != null && c10332x3.f32013c.length == interfaceC10325qArr.length) {
                int i11 = 0;
                while (true) {
                    if (i11 >= interfaceC10325qArr.length) {
                        if (c2791q2 == c2791q1) {
                            z10 = false;
                        }
                        c2791q2 = c2791q2.f9290m;
                        c10332x = c10332x2;
                    } else if (c10332xM3506j.m12479a(c10332x3, i11)) {
                        i11++;
                    }
                }
            }
            if (!z10) {
                this.f25996t.m9452o(c2791q2);
                if (c2791q2.f9282e) {
                    long jMax = Math.max(c2791q2.f9284g.f9296b, this.f25968W - c2791q2.f9293p);
                    if (this.f25946A && m9393f() && this.f25996t.f26044l == c2791q2) {
                        m9397h();
                    }
                    i10 = 4;
                    c2791q2.m3497a(c10332xM3506j, jMax, false, new boolean[c2791q2.f9287j.length]);
                }
                m9423u(true);
                if (this.f25953H.f9129e != i10) {
                    m9364C();
                    m9433z0();
                    this.f25985i.mo939k(2);
                    return;
                }
                return;
            }
            C7774h c7774h2 = this.f25996t;
            C2791q0 c2791q3 = c7774h2.f26042j;
            boolean z11 = (c7774h2.m9452o(c2791q3) & 1) != 0;
            boolean[] zArr = new boolean[this.f25973b.length];
            c10332x2.getClass();
            long jM3497a = c2791q3.m3497a(c10332x2, this.f25953H.f9143s, z11, zArr);
            C2731K0 c2731k1 = this.f25953H;
            boolean z12 = (c2731k1.f9129e == 4 || jM3497a == c2731k1.f9143s) ? false : true;
            C2731K0 c2731k2 = this.f25953H;
            this.f25953H = m9431y(c2731k2.f9126b, jM3497a, c2731k2.f9127c, c2731k2.f9128d, z12, 5);
            if (z12) {
                m9378Q(jM3497a);
            }
            m9397h();
            boolean[] zArr2 = new boolean[this.f25973b.length];
            int i12 = 0;
            while (true) {
                C2743Q0[] c2743q0Arr = this.f25973b;
                if (i12 >= c2743q0Arr.length) {
                    break;
                }
                int iM3459b = c2743q0Arr[i12].m3459b();
                zArr2[i12] = this.f25973b[i12].m3463f();
                C2743Q0 c2743q0 = this.f25973b[i12];
                InterfaceC6657Z interfaceC6657Z = c2791q3.f9280c[i12];
                C2778k c2778k = this.f25992p;
                long j10 = this.f25968W;
                boolean z13 = zArr[i12];
                InterfaceC7781n interfaceC7781n = c2743q0.f9166a;
                if (C2743Q0.m3456g(interfaceC7781n)) {
                    if (interfaceC6657Z != interfaceC7781n.mo9237t()) {
                        c2743q0.m3458a(interfaceC7781n, c2778k);
                    } else if (z13) {
                        interfaceC7781n.mo9239v(j10);
                    }
                }
                InterfaceC7781n interfaceC7781n2 = c2743q0.f9168c;
                if (interfaceC7781n2 != null && C2743Q0.m3456g(interfaceC7781n2)) {
                    if (interfaceC6657Z != interfaceC7781n2.mo9237t()) {
                        c2743q0.m3458a(interfaceC7781n2, c2778k);
                    } else if (z13) {
                        interfaceC7781n2.mo9239v(j10);
                    }
                }
                if (iM3459b - this.f25973b[i12].m3459b() > 0) {
                    m9368G(i12, false);
                }
                this.f25966U -= iM3459b - this.f25973b[i12].m3459b();
                i12++;
            }
            m9405l(zArr2, this.f25968W);
            c2791q3.f9285h = true;
            i10 = 4;
            m9423u(true);
            if (this.f25953H.f9129e != i10) {
                m9364C();
                m9433z0();
                this.f25985i.mo939k(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX INFO: renamed from: O */
    public final void m9376O(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        long jLongValue;
        long j11;
        boolean z14;
        AbstractC20686A c2737n0;
        List list;
        this.f25985i.mo940l(2);
        this.f25951F = false;
        this.f25952G = null;
        this.f25972a0 = null;
        m9363B0(false, true);
        C2778k c2778k = this.f25992p;
        c2778k.f9260g = false;
        C2750U0 c2750u0 = c2778k.f9255b;
        if (c2750u0.f9183c) {
            c2750u0.m3471a(c2750u0.mo3474d());
            c2750u0.f9183c = false;
        }
        this.f25968W = 1000000000000L;
        for (int i10 = 0; i10 < this.f25973b.length; i10++) {
            try {
                m9399i(i10);
            } catch (C2784n e10) {
                e = e10;
                C0539y.m1072d("Disable failed.", e);
            } catch (RuntimeException e11) {
                e = e11;
                C0539y.m1072d("Disable failed.", e);
            }
        }
        this.f25978d0 = -9223372036854775807L;
        if (z10) {
            for (C2743Q0 c2743q0 : this.f25973b) {
                try {
                    c2743q0.m3466j();
                } catch (RuntimeException e12) {
                    C0539y.m1072d("Reset failed.", e12);
                }
            }
        }
        this.f25966U = 0;
        C2731K0 c2731k0 = this.f25953H;
        InterfaceC6695z.b bVar = c2731k0.f9126b;
        long j12 = c2731k0.f9143s;
        if (this.f25953H.f9126b.m7559b()) {
            j10 = this.f25953H.f9127c;
        } else {
            C2731K0 c2731k1 = this.f25953H;
            AbstractC20686A.b bVar2 = this.f25989m;
            InterfaceC6695z.b bVar3 = c2731k1.f9126b;
            AbstractC20686A abstractC20686A = c2731k1.f9125a;
            if (abstractC20686A.m25225p() || abstractC20686A.mo3482g(bVar3.f22080a, bVar2).f70867f) {
                j10 = this.f25953H.f9127c;
            } else {
                j10 = this.f25953H.f9143s;
            }
        }
        if (z11) {
            this.f25967V = null;
            Pair<InterfaceC6695z.b, Long> pairM9411o = m9411o(this.f25953H.f9125a);
            bVar = (InterfaceC6695z.b) pairM9411o.first;
            jLongValue = ((Long) pairM9411o.second).longValue();
            z14 = bVar.equals(this.f25953H.f9126b) ? false : true;
            j11 = -9223372036854775807L;
        } else {
            long j13 = j10;
            jLongValue = j12;
            j11 = j13;
            z14 = false;
        }
        this.f25996t.m9439b();
        this.f25960O = false;
        AbstractC20686A abstractC20686A2 = this.f25953H.f9125a;
        if (z12 && (abstractC20686A2 instanceof C2737N0)) {
            C2737N0 c2737n1 = (C2737N0) abstractC20686A2;
            InterfaceC6661b0 interfaceC6661b0 = this.f25997u.f26084j;
            AbstractC20686A[] abstractC20686AArr = c2737n1.f9157i;
            AbstractC20686A[] abstractC20686AArr2 = new AbstractC20686A[abstractC20686AArr.length];
            for (int i11 = 0; i11 < abstractC20686AArr.length; i11++) {
                abstractC20686AArr2[i11] = new C2735M0(abstractC20686AArr[i11]);
            }
            c2737n0 = new C2737N0(abstractC20686AArr2, c2737n1.f9158j, interfaceC6661b0);
            if (bVar.f22081b != -1) {
                c2737n0.mo3482g(bVar.f22080a, this.f25989m);
                int i12 = this.f25989m.f70864c;
                AbstractC20686A.c cVar = this.f25988l;
                c2737n0.mo3485m(i12, cVar, 0L);
                if (cVar.m25232a()) {
                    bVar = new InterfaceC6695z.b(bVar.f22080a, bVar.f22083d);
                }
            }
        } else {
            c2737n0 = abstractC20686A2;
        }
        C2731K0 c2731k2 = this.f25953H;
        int i13 = c2731k2.f9129e;
        C2784n c2784n = z13 ? null : c2731k2.f9130f;
        C6677j0 c6677j0 = z14 ? C6677j0.f22008d : c2731k2.f9132h;
        C10332x c10332x = z14 ? this.f25981f : c2731k2.f9133i;
        if (z14) {
            AbstractC2481A.b bVar4 = AbstractC2481A.f8293c;
            list = C2500U.f8330f;
        } else {
            list = c2731k2.f9134j;
        }
        this.f25953H = new C2731K0(c2737n0, bVar, j11, jLongValue, i13, c2784n, false, c6677j0, c10332x, list, bVar, c2731k2.f9136l, c2731k2.f9137m, c2731k2.f9138n, c2731k2.f9139o, jLongValue, 0L, jLongValue, 0L, false);
        if (z12) {
            C7774h c7774h = this.f25996t;
            if (!c7774h.f26050r.isEmpty()) {
                c7774h.m9451n(new ArrayList());
            }
            C7775i c7775i = this.f25997u;
            HashMap<C7775i.c, C7775i.b> map = c7775i.f26080f;
            for (C7775i.b bVar5 : map.values()) {
                try {
                    bVar5.f26089a.mo7514b(bVar5.f26090b);
                } catch (RuntimeException e13) {
                    C0539y.m1072d("Failed to release child source.", e13);
                }
                InterfaceC6695z interfaceC6695z = bVar5.f26089a;
                C7775i.a aVar = bVar5.f26091c;
                interfaceC6695z.mo7518j(aVar);
                bVar5.f26089a.mo7519k(aVar);
            }
            map.clear();
            c7775i.f26081g.clear();
            c7775i.f26085k = false;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m9377P() {
        C2791q0 c2791q0 = this.f25996t.f26042j;
        this.f25957L = c2791q0 != null && c2791q0.f9284g.f9303i && this.f25956K;
    }

    /* JADX INFO: renamed from: Q */
    public final void m9378Q(long j10) {
        C2791q0 c2791q0 = this.f25996t.f26042j;
        long j11 = j10 + (c2791q0 == null ? 1000000000000L : c2791q0.f9293p);
        this.f25968W = j11;
        this.f25992p.f9255b.m3471a(j11);
        for (C2743Q0 c2743q0 : this.f25973b) {
            long j12 = this.f25968W;
            InterfaceC7781n interfaceC7781nM3460c = c2743q0.m3460c(c2791q0);
            if (interfaceC7781nM3460c != null) {
                interfaceC7781nM3460c.mo9239v(j12);
            }
        }
        for (C2791q0 c2791q1 = r0.f26042j; c2791q1 != null; c2791q1 = c2791q1.f9290m) {
            for (InterfaceC10325q interfaceC10325q : c2791q1.f9292o.f32013c) {
                if (interfaceC10325q != null) {
                    interfaceC10325q.mo12437h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m9379R(AbstractC20686A abstractC20686A, AbstractC20686A abstractC20686A2) {
        if (abstractC20686A.m25225p() && abstractC20686A2.m25225p()) {
            return;
        }
        ArrayList<d> arrayList = this.f25993q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m9380U(long j10) {
        boolean z10 = this.f25950E;
        long jMin = 1000;
        long j11 = f25945g0;
        if (z10) {
            this.f25949D.getClass();
            jMin = this.f25953H.f9129e != 3 ? j11 : 1000L;
            for (C2743Q0 c2743q0 : this.f25973b) {
                long j12 = this.f25968W;
                long j13 = this.f25969X;
                InterfaceC7781n interfaceC7781n = c2743q0.f9168c;
                InterfaceC7781n interfaceC7781n2 = c2743q0.f9166a;
                long jMo5954p = C2743Q0.m3456g(interfaceC7781n2) ? interfaceC7781n2.mo5954p(j12, j13) : LongCompanionObject.MAX_VALUE;
                if (interfaceC7781n != null && interfaceC7781n.getState() != 0) {
                    jMo5954p = Math.min(jMo5954p, interfaceC7781n.mo5954p(j12, j13));
                }
                jMin = Math.min(jMin, C0513S.m1002g0(jMo5954p));
            }
            if (this.f25953H.m3448m()) {
                C2791q0 c2791q0 = this.f25996t.f26042j;
                C2791q0 c2791q1 = c2791q0 != null ? c2791q0.f9290m : null;
                if (c2791q1 != null) {
                    if ((C0513S.m982T(jMin) * this.f25953H.f9139o.f71222a) + this.f25968W >= c2791q1.m3501e()) {
                        jMin = Math.min(jMin, j11);
                    }
                }
            }
        } else if (this.f25953H.f9129e != 3 || m9416q0()) {
            jMin = j11;
        }
        this.f25985i.mo937i(j10 + jMin);
    }

    /* JADX INFO: renamed from: V */
    public final void m9381V(boolean z10) {
        InterfaceC6695z.b bVar = this.f25996t.f26042j.f9284g.f9295a;
        long jM9383X = m9383X(bVar, this.f25953H.f9143s, true, false);
        if (jM9383X != this.f25953H.f9143s) {
            C2731K0 c2731k0 = this.f25953H;
            this.f25953H = m9431y(bVar, jM9383X, c2731k0.f9127c, c2731k0.f9128d, z10, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:27:0x00a7, B:32:0x00b4, B:34:0x00ba, B:35:0x00bd, B:39:0x00d0, B:41:0x00d6, B:45:0x00de, B:49:0x00ec, B:50:0x00f1, B:52:0x00f9, B:54:0x010a, B:60:0x0118), top: B:111:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[Catch: all -> 0x00aa, TryCatch #4 {all -> 0x00aa, blocks: (B:27:0x00a7, B:32:0x00b4, B:34:0x00ba, B:35:0x00bd, B:39:0x00d0, B:41:0x00d6, B:45:0x00de, B:49:0x00ec, B:50:0x00f1, B:52:0x00f9, B:54:0x010a, B:60:0x0118), top: B:111:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[Catch: all -> 0x00aa, TryCatch #4 {all -> 0x00aa, blocks: (B:27:0x00a7, B:32:0x00b4, B:34:0x00ba, B:35:0x00bd, B:39:0x00d0, B:41:0x00d6, B:45:0x00de, B:49:0x00ec, B:50:0x00f1, B:52:0x00f9, B:54:0x010a, B:60:0x0118), top: B:111:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6 A[Catch: all -> 0x0176, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:25:0x009d, B:37:0x00c6), top: B:107:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:27:0x00a7, B:32:0x00b4, B:34:0x00ba, B:35:0x00bd, B:39:0x00d0, B:41:0x00d6, B:45:0x00de, B:49:0x00ec, B:50:0x00f1, B:52:0x00f9, B:54:0x010a, B:60:0x0118), top: B:111:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:67:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Type inference failed for: r0v30, types: [Z2.y, java.lang.Object] */
    /* JADX INFO: renamed from: W */
    public final void m9382W(g gVar, boolean z10) throws Throwable {
        long jLongValue;
        long j10;
        InterfaceC6695z.b bVarM9453q;
        long j11;
        boolean z11;
        long j12;
        long j13;
        long jMo5132b;
        boolean z12;
        C7774h c7774h;
        boolean z13;
        long jM9383X;
        boolean z14;
        InterfaceC6695z.b bVar;
        long j14;
        InterfaceC6695z.b bVar2;
        long j15;
        long j16;
        C2791q0 c2791q0;
        C2731K0 c2731k0;
        int i10;
        int i11;
        long j17;
        C7771e c7771e = this;
        c7771e.f25954I.m9436a(z10 ? 1 : 0);
        if (c7771e.f25951F) {
            c7771e.f25952G = gVar;
            return;
        }
        Pair<Object, Long> pairM9357S = m9357S(c7771e.f25953H.f9125a, gVar, true, c7771e.f25961P, c7771e.f25962Q, c7771e.f25988l, c7771e.f25989m);
        try {
            try {
                if (pairM9357S != null) {
                    Object obj = pairM9357S.first;
                    jLongValue = ((Long) pairM9357S.second).longValue();
                    j10 = gVar.f26021c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                    bVarM9453q = c7771e.f25996t.m9453q(c7771e.f25953H.f9125a, obj, jLongValue);
                    if (bVarM9453q.m7559b()) {
                        c7771e.f25953H.f9125a.mo3482g(bVarM9453q.f22080a, c7771e.f25989m);
                        jLongValue = c7771e.f25989m.m25228c(bVarM9453q.f22081b) == bVarM9453q.f22082c ? c7771e.f25989m.f70868g.f70956c : 0L;
                        z11 = true;
                    } else {
                        j11 = 0;
                        z11 = gVar.f26021c == -9223372036854775807L;
                    }
                    if (c7771e.f25953H.f9125a.m25225p()) {
                        if (pairM9357S == null) {
                            if (c7771e.f25953H.f9129e != 1) {
                                c7771e.m9408m0(4);
                            }
                            c7771e.m9376O(false, true, false, true);
                        } else {
                            if (bVarM9453q.equals(c7771e.f25953H.f9126b)) {
                                c2791q0 = c7771e.f25996t.f26042j;
                                if (c2791q0 == null && c2791q0.f9282e && jLongValue != j11) {
                                    ?? r10 = c2791q0.f9278a;
                                    long j18 = c7771e.f25988l.f70883m;
                                    if (c7771e.f25950E && j18 != -9223372036854775807L) {
                                        c7771e.f25949D.getClass();
                                    }
                                    jMo5132b = r10.mo5132b(jLongValue, c7771e.f25948C);
                                } else {
                                    jMo5132b = jLongValue;
                                }
                                if (C0513S.m1002g0(jMo5132b) != C0513S.m1002g0(c7771e.f25953H.f9143s) && ((i10 = (c2731k0 = c7771e.f25953H).f9129e) == 2 || i10 == 3)) {
                                    j16 = c2731k0.f9143s;
                                    i11 = 2;
                                    j17 = j16;
                                    z11 = z11;
                                    bVar2 = bVarM9453q;
                                    j15 = j10;
                                }
                            } else {
                                jMo5132b = jLongValue;
                            }
                            try {
                                c7771e.f25951F = c7771e.f25950E;
                                if (c7771e.f25953H.f9129e == 4) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                try {
                                    c7774h = c7771e.f25996t;
                                    if (c7774h.f26042j != c7774h.f26043k) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    jM9383X = c7771e.m9383X(bVarM9453q, jMo5132b, z13, z12);
                                    if (jLongValue != jM9383X) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    z11 |= z14;
                                    try {
                                        C2731K0 c2731k1 = c7771e.f25953H;
                                        bVar = bVarM9453q;
                                        try {
                                            AbstractC20686A abstractC20686A = c2731k1.f9125a;
                                            j14 = j10;
                                            try {
                                                c7771e.m9361A0(abstractC20686A, bVar, abstractC20686A, c2731k1.f9126b, j14, true);
                                                bVar2 = bVar;
                                                j15 = j14;
                                                j16 = jM9383X;
                                                i11 = 2;
                                                j17 = j16;
                                                c7771e = this;
                                            } catch (Throwable th) {
                                                th = th;
                                                bVarM9453q = bVar;
                                                j12 = j14;
                                                j13 = jM9383X;
                                                c7771e.f25953H = c7771e.m9431y(bVarM9453q, j13, j12, j13, z11, 2);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bVarM9453q = bVar;
                                            j12 = j10;
                                            j13 = jM9383X;
                                            c7771e.f25953H = c7771e.m9431y(bVarM9453q, j13, j12, j13, z11, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j12 = j10;
                                    j13 = jLongValue;
                                    c7771e.f25953H = c7771e.m9431y(bVarM9453q, j13, j12, j13, z11, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        c7771e.f25953H = c7771e.m9431y(bVar2, j16, j15, j17, z11, i11);
                        return;
                    }
                    c7771e.f25967V = gVar;
                    z11 = z11;
                    bVar2 = bVarM9453q;
                    j16 = jLongValue;
                    j15 = j10;
                    i11 = 2;
                    j17 = j16;
                    c7771e = this;
                    c7771e.f25953H = c7771e.m9431y(bVar2, j16, j15, j17, z11, i11);
                    return;
                }
                Pair<InterfaceC6695z.b, Long> pairM9411o = c7771e.m9411o(c7771e.f25953H.f9125a);
                bVarM9453q = (InterfaceC6695z.b) pairM9411o.first;
                jLongValue = ((Long) pairM9411o.second).longValue();
                z11 = !c7771e.f25953H.f9125a.m25225p();
                j10 = -9223372036854775807L;
                if (c7771e.f25953H.f9125a.m25225p()) {
                    if (pairM9357S == null) {
                        if (c7771e.f25953H.f9129e != 1) {
                            c7771e.m9408m0(4);
                        }
                        c7771e.m9376O(false, true, false, true);
                    } else {
                        if (bVarM9453q.equals(c7771e.f25953H.f9126b)) {
                            c2791q0 = c7771e.f25996t.f26042j;
                            if (c2791q0 == null) {
                                jMo5132b = jLongValue;
                            } else {
                                jMo5132b = jLongValue;
                            }
                            if (C0513S.m1002g0(jMo5132b) != C0513S.m1002g0(c7771e.f25953H.f9143s)) {
                            }
                        } else {
                            jMo5132b = jLongValue;
                        }
                        c7771e.f25951F = c7771e.f25950E;
                        if (c7771e.f25953H.f9129e == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c7774h = c7771e.f25996t;
                        if (c7774h.f26042j != c7774h.f26043k) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        jM9383X = c7771e.m9383X(bVarM9453q, jMo5132b, z13, z12);
                        if (jLongValue != jM9383X) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z11 |= z14;
                        C2731K0 c2731k2 = c7771e.f25953H;
                        bVar = bVarM9453q;
                        AbstractC20686A abstractC20686A2 = c2731k2.f9125a;
                        j14 = j10;
                        c7771e.m9361A0(abstractC20686A2, bVar, abstractC20686A2, c2731k2.f9126b, j14, true);
                        bVar2 = bVar;
                        j15 = j14;
                        j16 = jM9383X;
                        i11 = 2;
                        j17 = j16;
                        c7771e = this;
                    }
                    c7771e.f25953H = c7771e.m9431y(bVar2, j16, j15, j17, z11, i11);
                    return;
                }
                c7771e.f25967V = gVar;
                z11 = z11;
                bVar2 = bVarM9453q;
                j16 = jLongValue;
                j15 = j10;
                i11 = 2;
                j17 = j16;
                c7771e = this;
                c7771e.f25953H = c7771e.m9431y(bVar2, j16, j15, j17, z11, i11);
                return;
            } catch (Throwable th6) {
                th = th6;
                z11 = z11;
                bVarM9453q = bVarM9453q;
                j13 = jLongValue;
                j12 = j10;
            }
        } catch (Throwable th7) {
            th = th7;
            z11 = z11;
            bVarM9453q = bVarM9453q;
        }
        j11 = 0;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [Z2.y, java.lang.Object] */
    /* JADX INFO: renamed from: X */
    public final long m9383X(InterfaceC6695z.b bVar, long j10, boolean z10, boolean z11) {
        C2743Q0[] c2743q0Arr;
        m9424u0();
        m9363B0(false, true);
        if (z11 || this.f25953H.f9129e == 3) {
            m9408m0(2);
        }
        C7774h c7774h = this.f25996t;
        C2791q0 c2791q0 = c7774h.f26042j;
        C2791q0 c2791q1 = c2791q0;
        while (c2791q1 != null && !bVar.equals(c2791q1.f9284g.f9295a)) {
            c2791q1 = c2791q1.f9290m;
        }
        if (z10 || c2791q0 != c2791q1 || (c2791q1 != null && c2791q1.f9293p + j10 < 0)) {
            int i10 = 0;
            while (true) {
                c2743q0Arr = this.f25973b;
                if (i10 >= c2743q0Arr.length) {
                    break;
                }
                m9399i(i10);
                i10++;
            }
            this.f25978d0 = -9223372036854775807L;
            if (c2791q1 != null) {
                while (c7774h.f26042j != c2791q1) {
                    c7774h.m9438a();
                }
                c7774h.m9452o(c2791q1);
                c2791q1.f9293p = 1000000000000L;
                m9405l(new boolean[c2743q0Arr.length], c7774h.f26043k.m3501e());
                c2791q1.f9285h = true;
            }
        }
        m9397h();
        if (c2791q1 != null) {
            ?? r10 = c2791q1.f9278a;
            c7774h.m9452o(c2791q1);
            if (!c2791q1.f9282e) {
                c2791q1.f9284g = c2791q1.f9284g.m3509b(j10);
            } else if (c2791q1.f9283f) {
                j10 = r10.seekToUs(j10);
                r10.discardBuffer(j10 - this.f25990n, this.f25991o);
            }
            m9378Q(j10);
            m9364C();
        } else {
            c7774h.m9439b();
            m9378Q(j10);
        }
        m9423u(false);
        this.f25985i.mo939k(2);
        return j10;
    }

    /* JADX INFO: renamed from: Y */
    public final void m9384Y(C7780m c7780m) {
        c7780m.getClass();
        InterfaceC0535u interfaceC0535u = this.f25985i;
        if (c7780m.f26134e != this.f25987k) {
            interfaceC0535u.mo934f(15, c7780m).m942b();
            return;
        }
        synchronized (c7780m) {
        }
        try {
            c7780m.f26130a.handleMessage(c7780m.f26132c, c7780m.f26133d);
            c7780m.m9472a(true);
            int i10 = this.f25953H.f9129e;
            if (i10 == 3 || i10 == 2) {
                interfaceC0535u.mo939k(2);
            }
        } catch (Throwable th) {
            c7780m.m9472a(true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m9385Z(final C7780m c7780m) {
        Looper looper = c7780m.f26134e;
        if (looper.getThread().isAlive()) {
            this.f25994r.mo926a(looper, null).mo936h(new Runnable(this) { // from class: K2.j0
                @Override // java.lang.Runnable
                public final void run() {
                    C7780m c7780m2 = c7780m;
                    try {
                        synchronized (c7780m2) {
                        }
                        try {
                            c7780m2.f26130a.handleMessage(c7780m2.f26132c, c7780m2.f26133d);
                        } finally {
                            c7780m2.m9472a(true);
                        }
                    } catch (C2784n e10) {
                        C0539y.m1072d("Unexpected error delivering message on external thread.", e10);
                        throw new RuntimeException(e10);
                    }
                }
            });
        } else {
            C0539y.m1074f("Trying to send message on a dead thread.");
            c7780m.m9472a(false);
        }
    }

    @Override // p453Z2.InterfaceC6659a0.a
    /* JADX INFO: renamed from: a */
    public final void mo5138a(InterfaceC6659a0 interfaceC6659a0) {
        this.f25985i.mo934f(9, (InterfaceC6694y) interfaceC6659a0).m942b();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m9386a0(C20698d c20698d, boolean z10) {
        this.f25979e.mo12451f(c20698d);
        if (!z10) {
            c20698d = null;
        }
        C2768f c2768f = this.f25947B;
        if (!Objects.equals(c2768f.f9213d, c20698d)) {
            c2768f.f9213d = c20698d;
            int i10 = c20698d == null ? 0 : 1;
            c2768f.f9215f = i10;
            C0515a.m1026b(i10 == 1 || i10 == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        C2731K0 c2731k0 = this.f25953H;
        boolean z11 = c2731k0.f9136l;
        m9432y0(c2768f.m3490d(c2731k0.f9129e, z11), c2731k0.f9138n, c2731k0.f9137m, z11);
    }

    @Override // p570g3.InterfaceC11271u
    /* JADX INFO: renamed from: b */
    public final void mo3494b(long j10, long j11, C20708n c20708n, MediaFormat mediaFormat) {
        if (this.f25951F) {
            this.f25985i.mo932d(37).m942b();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m9387b0(boolean z10, C0529o c0529o) {
        if (this.f25963R != z10) {
            this.f25963R = z10;
            if (!z10) {
                for (C2743Q0 c2743q0 : this.f25973b) {
                    c2743q0.m3466j();
                }
            }
        }
        if (c0529o != null) {
            c0529o.m1052e();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9388c(b bVar, int i10) throws Throwable {
        this.f25954I.m9436a(1);
        C7775i c7775i = this.f25997u;
        if (i10 == -1) {
            i10 = c7775i.f26076b.size();
        }
        m9425v(c7775i.m9459a(i10, bVar.f26004a, bVar.f26005b), false);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9389c0(b bVar) throws Throwable {
        this.f25954I.m9436a(1);
        int i10 = bVar.f26006c;
        InterfaceC6661b0 interfaceC6661b0 = bVar.f26005b;
        ArrayList arrayList = bVar.f26004a;
        if (i10 != -1) {
            this.f25967V = new g(new C2737N0(arrayList, interfaceC6661b0), bVar.f26006c, bVar.f26007d);
        }
        C7775i c7775i = this.f25997u;
        ArrayList arrayList2 = c7775i.f26076b;
        c7775i.m9465g(0, arrayList2.size());
        m9425v(c7775i.m9459a(arrayList2.size(), arrayList, interfaceC6661b0), false);
    }

    /* JADX INFO: renamed from: d */
    public final void m9390d() {
        for (C2743Q0 c2743q0 : this.f25973b) {
            C2746S0 c2746s0 = this.f25950E ? this.f25949D : null;
            c2743q0.f9166a.handleMessage(18, c2746s0);
            InterfaceC7781n interfaceC7781n = c2743q0.f9168c;
            if (interfaceC7781n != null) {
                interfaceC7781n.handleMessage(18, c2746s0);
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9391d0(boolean z10) {
        this.f25956K = z10;
        m9377P();
        if (this.f25957L) {
            C7774h c7774h = this.f25996t;
            if (c7774h.f26043k != c7774h.f26042j) {
                m9381V(true);
                m9423u(false);
            }
        }
    }

    @Override // p453Z2.InterfaceC6694y.a
    /* JADX INFO: renamed from: e */
    public final void mo7447e(InterfaceC6694y interfaceC6694y) {
        this.f25985i.mo934f(8, interfaceC6694y).m942b();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m9392e0(C20718x c20718x) {
        this.f25985i.mo940l(16);
        C2778k c2778k = this.f25992p;
        c2778k.mo3472b(c20718x);
        C20718x playbackParameters = c2778k.getPlaybackParameters();
        m9429x(playbackParameters, playbackParameters.f71222a, true, true);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9393f() {
        if (!this.f25946A) {
            return false;
        }
        for (C2743Q0 c2743q0 : this.f25973b) {
            if (c2743q0.m3462e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m9394f0(ExoPlayer.C7754c c7754c) {
        this.f25976c0 = c7754c;
        AbstractC20686A abstractC20686A = this.f25953H.f9125a;
        C7774h c7774h = this.f25996t;
        c7774h.f26041i = c7754c;
        c7774h.f26041i.getClass();
        if (c7774h.f26050r.isEmpty()) {
            return;
        }
        c7774h.m9451n(new ArrayList());
    }

    /* JADX INFO: renamed from: g */
    public final void m9395g() {
        m9375N();
        m9381V(true);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m9396g0(int i10) {
        this.f25961P = i10;
        AbstractC20686A abstractC20686A = this.f25953H.f9125a;
        C7774h c7774h = this.f25996t;
        c7774h.f26039g = i10;
        int iM9455s = c7774h.m9455s(abstractC20686A);
        if ((iM9455s & 1) != 0) {
            m9381V(true);
        } else if ((iM9455s & 2) != 0) {
            m9397h();
        }
        m9423u(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m9397h() {
        InterfaceC7781n interfaceC7781n;
        if (this.f25946A && m9393f()) {
            for (C2743Q0 c2743q0 : this.f25973b) {
                int iM3459b = c2743q0.m3459b();
                if (c2743q0.m3462e()) {
                    int i10 = c2743q0.f9169d;
                    boolean z10 = i10 == 4 || i10 == 2;
                    int i11 = i10 != 4 ? 0 : 1;
                    if (z10) {
                        interfaceC7781n = c2743q0.f9166a;
                    } else {
                        interfaceC7781n = c2743q0.f9168c;
                        interfaceC7781n.getClass();
                    }
                    c2743q0.m3458a(interfaceC7781n, this.f25992p);
                    c2743q0.m3464h(z10);
                    c2743q0.f9169d = i11;
                }
                this.f25966U -= iM3459b - c2743q0.m3459b();
            }
            this.f25978d0 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m9398h0(boolean z10) throws Throwable {
        if (!z10) {
            this.f25951F = false;
            this.f25985i.mo940l(37);
            g gVar = this.f25952G;
            if (gVar != null) {
                m9382W(gVar, false);
                this.f25952G = null;
            }
        }
        this.f25950E = z10;
        m9390d();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i10;
        C2791q0 c2791q0;
        InterfaceC6695z.b bVar;
        C2791q0 c2791q1;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i12 = message.arg2;
                    this.f25954I.m9436a(1);
                    m9432y0(this.f25947B.m3490d(this.f25953H.f9129e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    m9401j();
                    break;
                case 3:
                    m9382W((g) message.obj, true);
                    break;
                case 4:
                    m9392e0((C20718x) message.obj);
                    break;
                case 5:
                    m9402j0((C2748T0) message.obj);
                    break;
                case 6:
                    m9422t0(false, true);
                    break;
                case 7:
                    m9372K((C0529o) message.obj);
                    return true;
                case 8:
                    m9427w((InterfaceC6694y) message.obj);
                    break;
                case 9:
                    m9419s((InterfaceC6694y) message.obj);
                    break;
                case 10:
                    m9375N();
                    break;
                case 11:
                    m9396g0(message.arg1);
                    break;
                case 12:
                    m9404k0(message.arg1 != 0);
                    break;
                case 13:
                    m9387b0(message.arg1 != 0, (C0529o) message.obj);
                    break;
                case 14:
                    m9384Y((C7780m) message.obj);
                    break;
                case 15:
                    m9385Z((C7780m) message.obj);
                    break;
                case 16:
                    C20718x c20718x = (C20718x) message.obj;
                    m9429x(c20718x, c20718x.f71222a, true, false);
                    break;
                case 17:
                    m9389c0((b) message.obj);
                    break;
                case 18:
                    m9388c((b) message.obj, message.arg1);
                    break;
                case 19:
                    m9370I((c) message.obj);
                    break;
                case 20:
                    m9374M(message.arg1, message.arg2, (InterfaceC6661b0) message.obj);
                    break;
                case 21:
                    m9406l0((InterfaceC6661b0) message.obj);
                    break;
                case 22:
                    m9369H();
                    break;
                case 23:
                    m9391d0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m9395g();
                    break;
                case 26:
                    m9375N();
                    m9381V(true);
                    break;
                case 27:
                    m9430x0(message.arg1, (List) message.obj, message.arg2);
                    break;
                case 28:
                    m9394f0((ExoPlayer.C7754c) message.obj);
                    break;
                case 29:
                    m9371J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m9412o0(pair.first, (C0529o) pair.second);
                    break;
                case 31:
                    m9386a0((C20698d) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    m9414p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    m9415q(message.arg1);
                    break;
                case 34:
                    m9417r();
                    break;
                case 35:
                    m9410n0((InterfaceC11271u) message.obj);
                    break;
                case 36:
                    m9398h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f25951F = false;
                    g gVar = this.f25952G;
                    if (gVar != null) {
                        m9382W(gVar, false);
                        this.f25952G = null;
                    }
                    break;
                case 38:
                    m9400i0((C2746S0) message.obj);
                    break;
            }
        } catch (C1490j e10) {
            m9421t(e10, e10.f4941b);
        } catch (C2784n e11) {
            e = e11;
            int i13 = e.f9267d;
            C7774h c7774h = this.f25996t;
            if (i13 == 1 && (c2791q1 = c7774h.f26043k) != null && e.f9272i == null) {
                e = e.m3495a(c2791q1.f9284g.f9295a);
            }
            int i14 = e.f9267d;
            InterfaceC0535u interfaceC0535u = this.f25985i;
            if (i14 == 1 && (bVar = e.f9272i) != null && m9360A(e.f9269f, bVar)) {
                this.f25980e0 = true;
                m9397h();
                C2791q0 c2791q0M9444g = c7774h.m9444g();
                C2791q0 c2791q2 = c7774h.f26042j;
                if (c2791q2 != c2791q0M9444g) {
                    while (c2791q2 != null) {
                        C2791q0 c2791q3 = c2791q2.f9290m;
                        if (c2791q3 == c2791q0M9444g) {
                            break;
                        }
                        c2791q2 = c2791q3;
                    }
                }
                c7774h.m9452o(c2791q2);
                if (this.f25953H.f9129e != 4) {
                    m9364C();
                    interfaceC0535u.mo939k(2);
                }
            } else {
                C2784n c2784n = this.f25972a0;
                if (c2784n != null) {
                    c2784n.addSuppressed(e);
                    e = this.f25972a0;
                }
                if (e.f9267d == 1 && c7774h.f26042j != c7774h.f26043k) {
                    while (true) {
                        c2791q0 = c7774h.f26042j;
                        if (c2791q0 == c7774h.f26043k) {
                            break;
                        }
                        c7774h.m9438a();
                    }
                    C0515a.m1028d(c2791q0);
                    m9366E();
                    C2793r0 c2793r0 = c2791q0.f9284g;
                    InterfaceC6695z.b bVar2 = c2793r0.f9295a;
                    long j10 = c2793r0.f9296b;
                    this.f25953H = m9431y(bVar2, j10, c2793r0.f9297c, j10, true, 0);
                }
                if (e.f9273j && (this.f25972a0 == null || (i10 = e.f71219b) == 5004 || i10 == 5003)) {
                    C0539y.m1075g("Recoverable renderer error", e);
                    if (this.f25972a0 == null) {
                        this.f25972a0 = e;
                    }
                    interfaceC0535u.mo929a(interfaceC0535u.mo934f(25, e));
                } else {
                    C0539y.m1072d("Playback error", e);
                    m9422t0(true, false);
                    this.f25953H = this.f25953H.m3442f(e);
                }
            }
        } catch (InterfaceC4043h.a e12) {
            m9421t(e12, e12.f13283b);
        } catch (C6660b e13) {
            m9421t(e13, 1002);
        } catch (RuntimeException e14) {
            C2784n c2784n2 = new C2784n(2, e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? 1004 : 1000);
            C0539y.m1072d("Playback error", c2784n2);
            m9422t0(true, false);
            this.f25953H = this.f25953H.m3442f(c2784n2);
        } catch (C20716v e15) {
            boolean z11 = e15.f71217b;
            int i15 = e15.f71218c;
            if (i15 == 1) {
                i11 = z11 ? 3001 : 3003;
            } else if (i15 == 4) {
                i11 = z11 ? 3002 : 3004;
            }
            m9421t(e15, i11);
        } catch (IOException e16) {
            m9421t(e16, 2000);
        }
        m9366E();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m9399i(int i10) {
        C2743Q0[] c2743q0Arr = this.f25973b;
        int iM3459b = c2743q0Arr[i10].m3459b();
        C2743Q0 c2743q0 = c2743q0Arr[i10];
        InterfaceC7781n interfaceC7781n = c2743q0.f9166a;
        C2778k c2778k = this.f25992p;
        c2743q0.m3458a(interfaceC7781n, c2778k);
        InterfaceC7781n interfaceC7781n2 = c2743q0.f9168c;
        if (interfaceC7781n2 != null) {
            boolean z10 = (interfaceC7781n2.getState() == 0 || c2743q0.f9169d == 3) ? false : true;
            c2743q0.m3458a(interfaceC7781n2, c2778k);
            c2743q0.m3464h(false);
            if (z10) {
                InterfaceC7781n interfaceC7781n3 = c2743q0.f9166a;
                interfaceC7781n2.getClass();
                interfaceC7781n2.handleMessage(17, interfaceC7781n3);
            }
        }
        c2743q0.f9169d = 0;
        m9368G(i10, false);
        this.f25966U -= iM3459b;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m9400i0(C2746S0 c2746s0) {
        this.f25949D = c2746s0;
        m9390d();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:199:0x0363  */
    /* JADX WARN: Code duplicated, block: B:201:0x0367  */
    /* JADX WARN: Code duplicated, block: B:210:0x0392  */
    /* JADX WARN: Code duplicated, block: B:238:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:319:0x050f  */
    /* JADX WARN: Code duplicated, block: B:409:0x0659  */
    /* JADX WARN: Code duplicated, block: B:450:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:452:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:454:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:455:0x06fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:456:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:457:0x0702  */
    /* JADX WARN: Code duplicated, block: B:459:0x0706  */
    /* JADX WARN: Code duplicated, block: B:460:0x070b  */
    /* JADX WARN: Code duplicated, block: B:462:0x0719  */
    /* JADX WARN: Code duplicated, block: B:463:0x0722  */
    /* JADX WARN: Code duplicated, block: B:466:0x072c  */
    /* JADX WARN: Code duplicated, block: B:469:0x0734  */
    /* JADX WARN: Code duplicated, block: B:472:0x073f  */
    /* JADX WARN: Code duplicated, block: B:475:0x0745  */
    /* JADX WARN: Code duplicated, block: B:477:0x0748 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:481:0x078c  */
    /* JADX WARN: Code duplicated, block: B:483:0x0799  */
    /* JADX WARN: Code duplicated, block: B:485:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:487:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:490:0x07be  */
    /* JADX WARN: Code duplicated, block: B:498:0x07db  */
    /* JADX WARN: Code duplicated, block: B:500:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:502:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:504:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:510:0x0801  */
    /* JADX WARN: Code duplicated, block: B:512:0x080c  */
    /* JADX WARN: Code duplicated, block: B:519:0x0820  */
    /* JADX WARN: Code duplicated, block: B:522:0x0826  */
    /* JADX WARN: Code duplicated, block: B:524:0x082e  */
    /* JADX WARN: Code duplicated, block: B:525:0x0830  */
    /* JADX WARN: Code duplicated, block: B:527:0x0833  */
    /* JADX WARN: Code duplicated, block: B:538:0x085a  */
    /* JADX WARN: Code duplicated, block: B:540:0x085d  */
    /* JADX WARN: Code duplicated, block: B:541:0x0865  */
    /* JADX WARN: Code duplicated, block: B:543:0x0870  */
    /* JADX WARN: Code duplicated, block: B:544:0x0879  */
    /* JADX WARN: Code duplicated, block: B:551:0x0897  */
    /* JADX WARN: Code duplicated, block: B:558:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:561:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:577:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:633:0x0839 A[EDGE_INSN: B:633:0x0839->B:529:0x0839 BREAK  A[LOOP:12: B:520:0x0821->B:528:0x0836], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0836 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:500:0x07e1, please report this as an issue */
    /* JADX WARN: Type inference failed for: r1v86, types: [Z2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v110, types: [Z2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Z2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [Z2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [Z2.y, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public final void m9401j() {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        C2731K0 c2731k0;
        C2791q0 c2791q0;
        C2776j c2776j;
        long j11;
        long j12;
        int i10;
        C7774h c7774h;
        C2791q0 c2791q1;
        long j13;
        C2791q0 c2791q2;
        boolean z14;
        boolean z15;
        boolean zMo9242a;
        C2750U0 c2750u0;
        boolean z16;
        boolean z17;
        C2731K0 c2731k1;
        int i11;
        int i12;
        C2743Q0[] c2743q0Arr;
        C2731K0 c2731k2;
        boolean z18;
        boolean z19;
        long j14;
        C2791q0 c2791q3;
        C2791q0 c2791q4;
        C2791q0 c2791q5;
        boolean z20;
        boolean z21;
        int length;
        int i13;
        InterfaceC7781n interfaceC7781n;
        boolean zM12480b;
        InterfaceC7781n interfaceC7781n2;
        InterfaceC7781n interfaceC7781n3;
        int i14;
        int i15;
        C2791q0 c2791q6;
        C2791q0 c2791q7;
        int i16;
        long jUptimeMillis = this.f25994r.uptimeMillis();
        this.f25985i.mo940l(2);
        long j15 = -9223372036854775807L;
        if (this.f25953H.f9125a.m25225p() || !this.f25997u.f26085k) {
            z10 = true;
        } else {
            this.f25996t.m9450m(this.f25968W);
            C7774h c7774h2 = this.f25996t;
            C2791q0 c2791q8 = c7774h2.f26045m;
            if (c2791q8 == null || (!c2791q8.f9284g.f9304j && c2791q8.m3503g() && c7774h2.f26045m.f9284g.f9299e != -9223372036854775807L && c7774h2.f26047o < 100)) {
                C7774h c7774h3 = this.f25996t;
                long j16 = this.f25968W;
                C2731K0 c2731k3 = this.f25953H;
                C2791q0 c2791q9 = c7774h3.f26045m;
                C2793r0 c2793r0M9441d = c2791q9 == null ? c7774h3.m9441d(c2731k3.f9125a, c2731k3.f9126b, c2731k3.f9127c, c2731k3.f9143s) : c7774h3.m9440c(c2731k3.f9125a, c2791q9, j16);
                if (c2793r0M9441d != null) {
                    C7774h c7774h4 = this.f25996t;
                    C2791q0 c2791q10 = c7774h4.f26045m;
                    long j17 = c2791q10 == null ? 1000000000000L : (c2791q10.f9293p + c2791q10.f9284g.f9299e) - c2793r0M9441d.f9296b;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= c7774h4.f26050r.size()) {
                            j14 = j15;
                            c2791q3 = null;
                            break;
                        }
                        C2793r0 c2793r0 = ((C2791q0) c7774h4.f26050r.get(i17)).f9284g;
                        long j18 = c2793r0.f9299e;
                        j14 = j15;
                        long j19 = c2793r0M9441d.f9299e;
                        if ((j18 == -9223372036854775807L || j18 == j19) && c2793r0.f9296b == c2793r0M9441d.f9296b && c2793r0.f9295a.equals(c2793r0M9441d.f9295a)) {
                            c2791q3 = (C2791q0) c7774h4.f26050r.remove(i17);
                            break;
                        } else {
                            i17++;
                            j15 = j14;
                        }
                    }
                    if (c2791q3 == null) {
                        C7771e c7771e = c7774h4.f26037e.f9261a;
                        InterfaceC7782o[] interfaceC7782oArr = c7771e.f25975c;
                        AbstractC10331w abstractC10331w = c7771e.f25979e;
                        C10739e c10739eMo9247f = c7771e.f25983g.mo9247f();
                        C7775i c7775i = c7771e.f25997u;
                        C10332x c10332x = c7771e.f25981f;
                        c7771e.f25976c0.getClass();
                        c2791q3 = new C2791q0(interfaceC7782oArr, j17, abstractC10331w, c10739eMo9247f, c7775i, c2793r0M9441d, c10332x);
                    } else {
                        c2791q3.f9284g = c2793r0M9441d;
                        c2791q3.f9293p = j17;
                    }
                    C2791q0 c2791q11 = c7774h4.f26045m;
                    if (c2791q11 == null) {
                        c7774h4.f26042j = c2791q3;
                        c7774h4.f26043k = c2791q3;
                        c7774h4.f26044l = c2791q3;
                    } else if (c2791q3 != c2791q11.f9290m) {
                        c2791q11.m3498b();
                        c2791q11.f9290m = c2791q3;
                        c2791q11.m3499c();
                    }
                    c7774h4.f26048p = null;
                    c7774h4.f26045m = c2791q3;
                    c7774h4.f26047o++;
                    c7774h4.m9449l();
                    if (!c2791q3.f9281d) {
                        long j20 = c2793r0M9441d.f9296b;
                        c2791q3.f9281d = true;
                        c2791q3.f9278a.mo5134d(this, j20);
                    } else if (c2791q3.f9282e) {
                        this.f25985i.mo934f(8, c2791q3.f9278a).m942b();
                    }
                    if (this.f25996t.f26042j == c2791q3) {
                        m9378Q(c2793r0M9441d.f9296b);
                    }
                    m9423u(false);
                } else {
                    j14 = -9223372036854775807L;
                }
            } else {
                j14 = -9223372036854775807L;
            }
            if (this.f25960O) {
                this.f25960O = m9359z(this.f25996t.f26045m);
                m9426v0();
            } else {
                m9364C();
            }
            C7774h c7774h5 = this.f25996t;
            if (!this.f25957L && this.f25946A && !this.f25980e0 && !m9393f() && (c2791q6 = c7774h5.f26044l) != null && c2791q6 == c7774h5.f26043k && (c2791q7 = c2791q6.f9290m) != null && c2791q7.f9282e) {
                c7774h5.f26044l = c2791q7;
                c7774h5.m9449l();
                C0515a.m1031g(c7774h5.f26044l);
                C2743Q0[] c2743q0Arr2 = this.f25973b;
                C2791q0 c2791q12 = c7774h5.f26044l;
                if (c2791q12 != null) {
                    C10332x c10332x2 = c2791q12.f9292o;
                    for (int i18 = 0; i18 < c2743q0Arr2.length; i18++) {
                        if (c10332x2.m12480b(i18)) {
                            C2743Q0 c2743q0 = c2743q0Arr2[i18];
                            if (c2743q0.f9168c != null && !c2743q0.m3462e()) {
                                C2743Q0 c2743q1 = c2743q0Arr2[i18];
                                C0515a.m1030f(!c2743q1.m3462e());
                                if (C2743Q0.m3456g(c2743q1.f9166a)) {
                                    i16 = 3;
                                } else {
                                    InterfaceC7781n interfaceC7781n4 = c2743q1.f9168c;
                                    i16 = (interfaceC7781n4 == null || interfaceC7781n4.getState() == 0) ? 2 : 4;
                                }
                                c2743q1.f9169d = i16;
                                m9403k(c2791q12, i18, false, c2791q12.m3501e());
                            }
                        }
                    }
                    if (m9393f()) {
                        this.f25978d0 = c2791q12.f9278a.readDiscontinuity();
                        if (!c2791q12.m3503g()) {
                            c7774h5.m9452o(c2791q12);
                            m9423u(false);
                            m9364C();
                        }
                    }
                }
            }
            boolean z22 = this.f25946A;
            C2743Q0[] c2743q0Arr3 = this.f25973b;
            C7774h c7774h6 = this.f25996t;
            C2791q0 c2791q13 = c7774h6.f26043k;
            if (c2791q13 != null) {
                if (c2791q13.f9290m == null || this.f25957L) {
                    if (c2791q13.f9284g.f9304j || this.f25957L) {
                        for (C2743Q0 c2743q2 : c2743q0Arr3) {
                            if (c2743q2.m3460c(c2791q13) != null) {
                                InterfaceC7781n interfaceC7781nM3460c = c2743q2.m3460c(c2791q13);
                                interfaceC7781nM3460c.getClass();
                                if (interfaceC7781nM3460c.mo9226g()) {
                                    long j21 = c2791q13.f9284g.f9299e;
                                    long j22 = (j21 == -9223372036854775807L || j21 == Long.MIN_VALUE) ? -9223372036854775807L : j21 + c2791q13.f9293p;
                                    InterfaceC7781n interfaceC7781nM3460c2 = c2743q2.m3460c(c2791q13);
                                    interfaceC7781nM3460c2.getClass();
                                    C2743Q0.m3457k(interfaceC7781nM3460c2, j22);
                                }
                            }
                        }
                    }
                } else if (c2791q13.f9282e) {
                    int i19 = 0;
                    while (true) {
                        if (i19 < c2743q0Arr3.length) {
                            C2743Q0 c2743q3 = c2743q0Arr3[i19];
                            if (!c2743q3.m3461d(c2791q13, c2743q3.f9166a) || !c2743q3.m3461d(c2791q13, c2743q3.f9168c)) {
                                break;
                            } else {
                                i19++;
                            }
                        } else {
                            if (m9393f() && c7774h6.f26044l == c7774h6.f26043k) {
                                break;
                            }
                            C2791q0 c2791q14 = c2791q13.f9290m;
                            if (!c2791q14.f9282e && this.f25968W < c2791q14.m3501e()) {
                                break;
                            }
                            C10332x c10332x3 = c2791q13.f9292o;
                            C2791q0 c2791q15 = c7774h6.f26044l;
                            C2791q0 c2791q16 = c7774h6.f26043k;
                            if (c2791q15 == c2791q16) {
                                C0515a.m1031g(c2791q16);
                                c7774h6.f26044l = c2791q16.f9290m;
                            }
                            C2791q0 c2791q17 = c7774h6.f26043k;
                            C0515a.m1031g(c2791q17);
                            c7774h6.f26043k = c2791q17.f9290m;
                            c7774h6.m9449l();
                            C2791q0 c2791q18 = c7774h6.f26043k;
                            C0515a.m1031g(c2791q18);
                            C10332x c10332x4 = c2791q18.f9292o;
                            AbstractC20686A abstractC20686A = this.f25953H.f9125a;
                            m9361A0(abstractC20686A, c2791q18.f9284g.f9295a, abstractC20686A, c2791q13.f9284g.f9295a, -9223372036854775807L, false);
                            if (!c2791q18.f9282e || ((!z22 || this.f25978d0 == j14) && c2791q18.f9278a.readDiscontinuity() == j14)) {
                                length = c2743q0Arr3.length;
                                i13 = 0;
                                while (i13 < length) {
                                    C2743Q0 c2743q4 = c2743q0Arr3[i13];
                                    long jM3501e = c2791q18.m3501e();
                                    interfaceC7781n = c2743q4.f9166a;
                                    int i20 = c2743q4.f9167b;
                                    zM12480b = c10332x3.m12480b(i20);
                                    boolean zM12480b2 = c10332x4.m12480b(i20);
                                    interfaceC7781n2 = c2743q4.f9168c;
                                    int i21 = length;
                                    if (interfaceC7781n2 != null || (i14 = c2743q4.f9169d) == 3 || (i14 == 0 && C2743Q0.m3456g(interfaceC7781n))) {
                                        interfaceC7781n3 = interfaceC7781n;
                                    } else {
                                        interfaceC7781n3 = interfaceC7781n2;
                                    }
                                    if (!zM12480b && !interfaceC7781n3.mo9231l()) {
                                        boolean z23 = interfaceC7781n.mo9232m() == -2;
                                        C2741P0 c2741p0 = c10332x3.f32012b[i20];
                                        C2741P0 c2741p1 = c10332x4.f32012b[i20];
                                        if (!zM12480b2 || !Objects.equals(c2741p1, c2741p0) || z23 || c2743q4.m3462e()) {
                                            C2743Q0.m3457k(interfaceC7781n3, jM3501e);
                                        }
                                    }
                                    i13++;
                                    length = i21;
                                }
                            } else {
                                this.f25978d0 = j14;
                                boolean z24 = z22 && !this.f25980e0;
                                if (z24) {
                                    for (int i22 = 0; i22 < c2743q0Arr3.length; i22++) {
                                        boolean zM12480b3 = c10332x4.m12480b(i22);
                                        InterfaceC10325q[] interfaceC10325qArr = c10332x4.f32013c;
                                        if (zM12480b3 && c2743q0Arr3[i22].f9166a.mo9232m() != -2 && !C20715u.m25319a(interfaceC10325qArr[i22].mo7451r().f71033n, interfaceC10325qArr[i22].mo7451r().f71030k) && !c2743q0Arr3[i22].m3462e()) {
                                            z24 = false;
                                            break;
                                        }
                                    }
                                }
                                if (z24) {
                                    length = c2743q0Arr3.length;
                                    i13 = 0;
                                    while (i13 < length) {
                                        C2743Q0 c2743q5 = c2743q0Arr3[i13];
                                        long jM3501e2 = c2791q18.m3501e();
                                        interfaceC7781n = c2743q5.f9166a;
                                        int i23 = c2743q5.f9167b;
                                        zM12480b = c10332x3.m12480b(i23);
                                        boolean zM12480b4 = c10332x4.m12480b(i23);
                                        interfaceC7781n2 = c2743q5.f9168c;
                                        int i24 = length;
                                        if (interfaceC7781n2 != null) {
                                            interfaceC7781n3 = interfaceC7781n;
                                        } else {
                                            interfaceC7781n3 = interfaceC7781n;
                                        }
                                        if (!zM12480b) {
                                        }
                                        i13++;
                                        length = i24;
                                    }
                                } else {
                                    long jM3501e3 = c2791q18.m3501e();
                                    for (C2743Q0 c2743q6 : c2743q0Arr3) {
                                        InterfaceC7781n interfaceC7781n5 = c2743q6.f9168c;
                                        InterfaceC7781n interfaceC7781n6 = c2743q6.f9166a;
                                        if (C2743Q0.m3456g(interfaceC7781n6) && (i15 = c2743q6.f9169d) != 4 && i15 != 2) {
                                            C2743Q0.m3457k(interfaceC7781n6, jM3501e3);
                                        }
                                        if (interfaceC7781n5 != null) {
                                            if ((interfaceC7781n5.getState() != 0) && c2743q6.f9169d != 3) {
                                                C2743Q0.m3457k(interfaceC7781n5, jM3501e3);
                                            }
                                        }
                                    }
                                    if (!c2791q18.m3503g()) {
                                        c7774h6.m9452o(c2791q18);
                                        m9423u(false);
                                        m9364C();
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            }
            C7774h c7774h7 = this.f25996t;
            C2791q0 c2791q19 = c7774h7.f26043k;
            if (c2791q19 == null || c7774h7.f26042j == c2791q19 || c2791q19.f9285h) {
                z10 = true;
            } else {
                C2743Q0[] c2743q0Arr4 = this.f25973b;
                C10332x c10332x5 = c2791q19.f9292o;
                boolean z25 = true;
                for (int i25 = 0; i25 < c2743q0Arr4.length; i25++) {
                    int iM3459b = c2743q0Arr4[i25].m3459b();
                    C2743Q0 c2743q7 = c2743q0Arr4[i25];
                    C2778k c2778k = this.f25992p;
                    int iM3465i = c2743q7.m3465i(c2743q7.f9166a, c2791q19, c10332x5, c2778k);
                    int iM3465i2 = c2743q7.m3465i(c2743q7.f9168c, c2791q19, c10332x5, c2778k);
                    if (iM3465i == 1) {
                        iM3465i = iM3465i2;
                    }
                    if ((iM3465i & 2) != 0 && (z21 = this.f25965T) && z21) {
                        this.f25965T = false;
                        if (this.f25953H.f9140p) {
                            this.f25985i.mo939k(2);
                        }
                    }
                    this.f25966U -= iM3459b - c2743q0Arr4[i25].m3459b();
                    z25 &= (iM3465i & 1) != 0;
                }
                z10 = true;
                if (z25) {
                    for (int i26 = 0; i26 < c2743q0Arr4.length; i26++) {
                        if (c10332x5.m12480b(i26)) {
                            if (!(c2743q0Arr4[i26].m3460c(c2791q19) != null)) {
                                m9403k(c2791q19, i26, false, c2791q19.m3501e());
                            }
                        }
                    }
                }
                if (z25) {
                    c7774h7.f26043k.f9285h = true;
                }
            }
            C2743Q0[] c2743q0Arr5 = this.f25973b;
            C7774h c7774h8 = this.f25996t;
            boolean z26 = false;
            while (m9416q0() && !this.f25957L && (c2791q4 = c7774h8.f26042j) != null && (c2791q5 = c2791q4.f9290m) != null && this.f25968W >= c2791q5.m3501e() && c2791q5.f9285h) {
                if (z26) {
                    m9366E();
                }
                this.f25980e0 = false;
                C2791q0 c2791q0M9438a = c7774h8.m9438a();
                c2791q0M9438a.getClass();
                if (this.f25953H.f9126b.f22080a.equals(c2791q0M9438a.f9284g.f9295a.f22080a)) {
                    InterfaceC6695z.b bVar = this.f25953H.f9126b;
                    if (bVar.f22081b == -1) {
                        InterfaceC6695z.b bVar2 = c2791q0M9438a.f9284g.f9295a;
                        if (bVar2.f22081b != -1 || bVar.f22084e == bVar2.f22084e) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                    } else {
                        z20 = false;
                    }
                } else {
                    z20 = false;
                }
                C2793r0 c2793r1 = c2791q0M9438a.f9284g;
                InterfaceC6695z.b bVar3 = c2793r1.f9295a;
                long j23 = c2793r1.f9296b;
                this.f25953H = m9431y(bVar3, j23, c2793r1.f9297c, j23, !z20, 0);
                m9377P();
                m9433z0();
                if (m9393f() && c2791q0M9438a == c7774h8.f26044l) {
                    for (C2743Q0 c2743q8 : c2743q0Arr5) {
                        int i27 = c2743q8.f9169d;
                        if (i27 == 3 || i27 == 4) {
                            boolean z27 = i27 == 4;
                            InterfaceC7781n interfaceC7781n7 = c2743q8.f9166a;
                            InterfaceC7781n interfaceC7781n8 = c2743q8.f9168c;
                            if (z27) {
                                interfaceC7781n8.getClass();
                                interfaceC7781n8.handleMessage(17, interfaceC7781n7);
                            } else {
                                interfaceC7781n8.getClass();
                                interfaceC7781n7.handleMessage(17, interfaceC7781n8);
                            }
                            c2743q8.f9169d = c2743q8.f9169d == 4 ? 0 : 1;
                        } else if (i27 == 2) {
                            c2743q8.f9169d = 0;
                        }
                    }
                }
                if (this.f25953H.f9129e == 3) {
                    m9420s0();
                }
                C10332x c10332x6 = c7774h8.f26042j.f9292o;
                for (int i28 = 0; i28 < c2743q0Arr5.length; i28++) {
                    if (c10332x6.m12480b(i28)) {
                        C2743Q0 c2743q9 = c2743q0Arr5[i28];
                        InterfaceC7781n interfaceC7781n9 = c2743q9.f9168c;
                        InterfaceC7781n interfaceC7781n10 = c2743q9.f9166a;
                        if (C2743Q0.m3456g(interfaceC7781n10)) {
                            interfaceC7781n10.mo9227h();
                        } else if (interfaceC7781n9 != null) {
                            if (interfaceC7781n9.getState() != 0) {
                                interfaceC7781n9.mo9227h();
                            }
                        }
                    }
                }
                z26 = true;
            }
            this.f25976c0.getClass();
        }
        int i29 = this.f25953H.f9129e;
        if (i29 == z10 || i29 == 4) {
            return;
        }
        C2791q0 c2791q20 = this.f25996t.f26042j;
        if (c2791q20 == null) {
            m9380U(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        m9433z0();
        if (c2791q20.f9282e) {
            this.f25969X = C0513S.m982T(this.f25994r.elapsedRealtime());
            c2791q20.f9278a.discardBuffer(this.f25953H.f9143s - this.f25990n, this.f25991o);
            z11 = true;
            int i30 = 0;
            z12 = true;
            while (true) {
                C2743Q0[] c2743q0Arr6 = this.f25973b;
                if (i30 >= c2743q0Arr6.length) {
                    break;
                }
                C2743Q0 c2743q10 = c2743q0Arr6[i30];
                if (c2743q10.m3459b() == 0) {
                    m9368G(i30, false);
                } else {
                    long j24 = this.f25968W;
                    long j25 = this.f25969X;
                    InterfaceC7781n interfaceC7781n11 = c2743q10.f9168c;
                    InterfaceC7781n interfaceC7781n12 = c2743q10.f9166a;
                    if (C2743Q0.m3456g(interfaceC7781n12)) {
                        interfaceC7781n12.mo5544f(j24, j25);
                    }
                    if (interfaceC7781n11 != null) {
                        if (interfaceC7781n11.getState() != 0) {
                            interfaceC7781n11.mo5544f(j24, j25);
                        }
                    }
                    if (z12) {
                        InterfaceC7781n interfaceC7781n13 = c2743q10.f9168c;
                        InterfaceC7781n interfaceC7781n14 = c2743q10.f9166a;
                        boolean zIsEnded = C2743Q0.m3456g(interfaceC7781n14) ? interfaceC7781n14.isEnded() : true;
                        if (interfaceC7781n13 != null) {
                            if (interfaceC7781n13.getState() != 0) {
                                zIsEnded &= interfaceC7781n13.isEnded();
                            }
                        }
                        if (zIsEnded) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                    } else {
                        z19 = false;
                    }
                    InterfaceC7781n interfaceC7781nM3460c3 = c2743q10.m3460c(c2791q20);
                    boolean z28 = interfaceC7781nM3460c3 == null || interfaceC7781nM3460c3.mo9226g() || interfaceC7781nM3460c3.isReady() || interfaceC7781nM3460c3.isEnded();
                    m9368G(i30, z28);
                    z11 = z11 && z28;
                    if (!z28) {
                        m9367F(i30);
                    }
                    z12 = z19;
                }
                i30++;
            }
        } else {
            c2791q20.f9278a.maybeThrowPrepareError();
            z11 = true;
            z12 = true;
        }
        long j26 = c2791q20.f9284g.f9299e;
        if (z12 && c2791q20.f9282e) {
            j10 = -9223372036854775807L;
            z13 = j26 == -9223372036854775807L || j26 <= this.f25953H.f9143s;
            if (z13 && this.f25957L) {
                this.f25957L = false;
                int i31 = this.f25953H.f9138n;
                this.f25954I.m9436a(0);
                m9432y0(this.f25947B.m3490d(this.f25953H.f9129e, false), i31, 5, false);
            }
            if (z13 || !c2791q20.f9284g.f9304j) {
                c2731k0 = this.f25953H;
                if (c2731k0.f9129e == 2) {
                    c7774h = this.f25996t;
                    if (this.f25966U == 0) {
                        zMo9242a = m9362B();
                    } else if (!z11) {
                        zMo9242a = false;
                    } else if (c2731k0.f9131g) {
                        c2791q1 = c7774h.f26042j;
                        if (m9418r0(c2731k0.f9125a, c2791q1.f9284g.f9295a)) {
                            j13 = ((C2776j) this.f25998v).f9247h;
                        } else {
                            j13 = j10;
                        }
                        c2791q2 = c7774h.f26045m;
                        if (c2791q2.m3503g() || !c2791q2.f9284g.f9304j) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (c2791q2.f9284g.f9295a.m7559b() || c2791q2.f9282e) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z14 || z15) {
                            zMo9242a = true;
                        } else {
                            long jM9413p = m9413p(c2791q2.m3500d());
                            InterfaceC7772f interfaceC7772f = this.f25983g;
                            C3193c0 c3193c0 = this.f26000x;
                            AbstractC20686A abstractC20686A2 = this.f25953H.f9125a;
                            InterfaceC6695z.b bVar4 = c2791q1.f9284g.f9295a;
                            long j27 = this.f25968W - c2791q1.f9293p;
                            float f10 = this.f25992p.getPlaybackParameters().f71222a;
                            boolean z29 = this.f25953H.f9136l;
                            zMo9242a = interfaceC7772f.mo9242a(new InterfaceC7772f.a(c3193c0, abstractC20686A2, bVar4, j27, jM9413p, f10, this.f25958M, j13));
                        }
                    } else {
                        zMo9242a = true;
                    }
                    if (zMo9242a) {
                        m9408m0(3);
                        this.f25972a0 = null;
                        if (m9416q0()) {
                            m9363B0(false, false);
                            C2778k c2778k2 = this.f25992p;
                            c2778k2.f9260g = z10;
                            c2750u0 = c2778k2.f9255b;
                            if (!c2750u0.f9183c) {
                                c2750u0.f9185e = c2750u0.f9182b.elapsedRealtime();
                                c2750u0.f9183c = z10;
                            }
                            m9420s0();
                        }
                    }
                } else {
                    j10 = j10;
                }
                if (this.f25953H.f9129e == 3 && (this.f25966U != 0 ? !z11 : !m9362B())) {
                    m9363B0(m9416q0(), false);
                    m9408m0(2);
                    if (this.f25958M) {
                        for (c2791q0 = this.f25996t.f26042j; c2791q0 != null; c2791q0 = c2791q0.f9290m) {
                            for (InterfaceC10325q interfaceC10325q : c2791q0.f9292o.f32013c) {
                                if (interfaceC10325q != null) {
                                    interfaceC10325q.mo12442t();
                                }
                            }
                        }
                        c2776j = (C2776j) this.f25998v;
                        j11 = c2776j.f9247h;
                        if (j11 != j10) {
                            long j28 = j11 + c2776j.f9241b;
                            c2776j.f9247h = j28;
                            j12 = c2776j.f9246g;
                            if (j12 != j10 && j28 > j12) {
                                c2776j.f9247h = j12;
                            }
                            c2776j.f9251l = j10;
                        }
                    }
                    m9424u0();
                }
            } else {
                m9408m0(4);
                m9424u0();
            }
            if (this.f25953H.f9129e == 2) {
                i12 = 0;
                while (true) {
                    c2743q0Arr = this.f25973b;
                    if (i12 < c2743q0Arr.length) {
                        break;
                    }
                    if (c2743q0Arr[i12].m3460c(c2791q20) != null) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        m9367F(i12);
                    }
                    i12++;
                }
                c2731k2 = this.f25953H;
                if (c2731k2.f9131g && c2731k2.f9142r < 500000 && m9359z(this.f25996t.f26045m) && m9416q0()) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } else {
                z16 = false;
            }
            if (!z16) {
                this.f25974b0 = -9223372036854775807L;
            } else if (this.f25974b0 == -9223372036854775807L) {
                this.f25974b0 = this.f25994r.elapsedRealtime();
            } else if (this.f25994r.elapsedRealtime() - this.f25974b0 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
            if (m9416q0() || this.f25953H.f9129e != 3) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (this.f25965T || !this.f25964S || !z17) {
                z10 = false;
            }
            c2731k1 = this.f25953H;
            if (c2731k1.f9140p != z10) {
                this.f25953H = c2731k1.m3445i(z10);
            }
            this.f25964S = false;
            if (!z10 && (i11 = this.f25953H.f9129e) != 4 && (z17 || i11 == 2 || (i11 == 3 && this.f25966U != 0))) {
                m9380U(jUptimeMillis);
            }
            Trace.endSection();
        }
        j10 = -9223372036854775807L;
        if (z13) {
            this.f25957L = false;
            int i32 = this.f25953H.f9138n;
            this.f25954I.m9436a(0);
            m9432y0(this.f25947B.m3490d(this.f25953H.f9129e, false), i32, 5, false);
        }
        if (z13) {
            c2731k0 = this.f25953H;
            if (c2731k0.f9129e == 2) {
                c7774h = this.f25996t;
                if (this.f25966U == 0) {
                    zMo9242a = m9362B();
                } else if (!z11) {
                    zMo9242a = false;
                } else if (c2731k0.f9131g) {
                    zMo9242a = true;
                } else {
                    c2791q1 = c7774h.f26042j;
                    if (m9418r0(c2731k0.f9125a, c2791q1.f9284g.f9295a)) {
                        j13 = ((C2776j) this.f25998v).f9247h;
                    } else {
                        j13 = j10;
                    }
                    c2791q2 = c7774h.f26045m;
                    if (c2791q2.m3503g()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (c2791q2.f9284g.f9295a.m7559b()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        zMo9242a = true;
                    } else {
                        zMo9242a = true;
                    }
                }
                if (zMo9242a) {
                    m9408m0(3);
                    this.f25972a0 = null;
                    if (m9416q0()) {
                        m9363B0(false, false);
                        C2778k c2778k3 = this.f25992p;
                        c2778k3.f9260g = z10;
                        c2750u0 = c2778k3.f9255b;
                        if (!c2750u0.f9183c) {
                            c2750u0.f9185e = c2750u0.f9182b.elapsedRealtime();
                            c2750u0.f9183c = z10;
                        }
                        m9420s0();
                    }
                }
            } else {
                j10 = j10;
            }
            if (this.f25953H.f9129e == 3) {
                m9363B0(m9416q0(), false);
                m9408m0(2);
                if (this.f25958M) {
                    while (c2791q0 != null) {
                        while (i10 < r4) {
                            if (interfaceC10325q != null) {
                                interfaceC10325q.mo12442t();
                            }
                        }
                    }
                    c2776j = (C2776j) this.f25998v;
                    j11 = c2776j.f9247h;
                    if (j11 != j10) {
                        long j29 = j11 + c2776j.f9241b;
                        c2776j.f9247h = j29;
                        j12 = c2776j.f9246g;
                        if (j12 != j10) {
                            c2776j.f9247h = j12;
                        }
                        c2776j.f9251l = j10;
                    }
                }
                m9424u0();
            }
        } else {
            c2731k0 = this.f25953H;
            if (c2731k0.f9129e == 2) {
                c7774h = this.f25996t;
                if (this.f25966U == 0) {
                    zMo9242a = m9362B();
                } else if (!z11) {
                    zMo9242a = false;
                } else if (c2731k0.f9131g) {
                    zMo9242a = true;
                } else {
                    c2791q1 = c7774h.f26042j;
                    if (m9418r0(c2731k0.f9125a, c2791q1.f9284g.f9295a)) {
                        j13 = ((C2776j) this.f25998v).f9247h;
                    } else {
                        j13 = j10;
                    }
                    c2791q2 = c7774h.f26045m;
                    if (c2791q2.m3503g()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (c2791q2.f9284g.f9295a.m7559b()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        zMo9242a = true;
                    } else {
                        zMo9242a = true;
                    }
                }
                if (zMo9242a) {
                    m9408m0(3);
                    this.f25972a0 = null;
                    if (m9416q0()) {
                        m9363B0(false, false);
                        C2778k c2778k4 = this.f25992p;
                        c2778k4.f9260g = z10;
                        c2750u0 = c2778k4.f9255b;
                        if (!c2750u0.f9183c) {
                            c2750u0.f9185e = c2750u0.f9182b.elapsedRealtime();
                            c2750u0.f9183c = z10;
                        }
                        m9420s0();
                    }
                }
            } else {
                j10 = j10;
            }
            if (this.f25953H.f9129e == 3) {
                m9363B0(m9416q0(), false);
                m9408m0(2);
                if (this.f25958M) {
                    while (c2791q0 != null) {
                        while (i10 < r4) {
                            if (interfaceC10325q != null) {
                                interfaceC10325q.mo12442t();
                            }
                        }
                    }
                    c2776j = (C2776j) this.f25998v;
                    j11 = c2776j.f9247h;
                    if (j11 != j10) {
                        long j210 = j11 + c2776j.f9241b;
                        c2776j.f9247h = j210;
                        j12 = c2776j.f9246g;
                        if (j12 != j10) {
                            c2776j.f9247h = j12;
                        }
                        c2776j.f9251l = j10;
                    }
                }
                m9424u0();
            }
        }
        if (this.f25953H.f9129e == 2) {
            i12 = 0;
            while (true) {
                c2743q0Arr = this.f25973b;
                if (i12 < c2743q0Arr.length) {
                    break;
                    break;
                }
                if (c2743q0Arr[i12].m3460c(c2791q20) != null) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    m9367F(i12);
                }
                i12++;
            }
            c2731k2 = this.f25953H;
            if (c2731k2.f9131g) {
                z16 = false;
            } else {
                z16 = false;
            }
        } else {
            z16 = false;
        }
        if (!z16) {
            this.f25974b0 = -9223372036854775807L;
        } else if (this.f25974b0 == -9223372036854775807L) {
            this.f25974b0 = this.f25994r.elapsedRealtime();
        } else if (this.f25994r.elapsedRealtime() - this.f25974b0 >= 4000) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        if (m9416q0()) {
            z17 = false;
        } else {
            z17 = false;
        }
        if (this.f25965T) {
            z10 = false;
        } else {
            z10 = false;
        }
        c2731k1 = this.f25953H;
        if (c2731k1.f9140p != z10) {
            this.f25953H = c2731k1.m3445i(z10);
        }
        this.f25964S = false;
        if (!z10) {
            m9380U(jUptimeMillis);
        }
        Trace.endSection();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m9402j0(C2748T0 c2748t0) {
        this.f25948C = c2748t0;
    }

    /* JADX INFO: renamed from: k */
    public final void m9403k(C2791q0 c2791q0, int i10, boolean z10, long j10) {
        C2743Q0 c2743q0 = this.f25973b[i10];
        if (c2743q0.m3463f()) {
            return;
        }
        boolean z11 = c2791q0 == this.f25996t.f26042j;
        C10332x c10332x = c2791q0.f9292o;
        C2741P0 c2741p0 = c10332x.f32012b[i10];
        InterfaceC10325q interfaceC10325q = c10332x.f32013c[i10];
        boolean z12 = m9416q0() && this.f25953H.f9129e == 3;
        boolean z13 = !z10 && z12;
        this.f25966U++;
        InterfaceC6657Z interfaceC6657Z = c2791q0.f9280c[i10];
        long j11 = c2791q0.f9293p;
        InterfaceC6695z.b bVar = c2791q0.f9284g.f9295a;
        InterfaceC7781n interfaceC7781n = c2743q0.f9168c;
        int length = interfaceC10325q != null ? interfaceC10325q.length() : 0;
        C20708n[] c20708nArr = new C20708n[length];
        for (int i11 = 0; i11 < length; i11++) {
            interfaceC10325q.getClass();
            c20708nArr[i11] = interfaceC10325q.mo7448c(i11);
        }
        int i12 = c2743q0.f9169d;
        C2778k c2778k = this.f25992p;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            c2743q0.f9170e = true;
            c2743q0.f9166a.mo9234o(c2741p0, c20708nArr, interfaceC6657Z, z13, z11, j10, j11, bVar);
            c2778k.m3493a(c2743q0.f9166a);
        } else {
            c2743q0.f9171f = true;
            interfaceC7781n.getClass();
            interfaceC7781n.mo9234o(c2741p0, c20708nArr, interfaceC6657Z, z13, z11, j10, j11, bVar);
            c2778k.m3493a(interfaceC7781n);
        }
        a aVar = new a();
        InterfaceC7781n interfaceC7781nM3460c = c2743q0.m3460c(c2791q0);
        interfaceC7781nM3460c.getClass();
        interfaceC7781nM3460c.handleMessage(11, aVar);
        if (z12 && z11) {
            c2743q0.m3467l();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m9404k0(boolean z10) {
        this.f25962Q = z10;
        AbstractC20686A abstractC20686A = this.f25953H.f9125a;
        C7774h c7774h = this.f25996t;
        c7774h.f26040h = z10;
        int iM9455s = c7774h.m9455s(abstractC20686A);
        if ((iM9455s & 1) != 0) {
            m9381V(true);
        } else if ((iM9455s & 2) != 0) {
            m9397h();
        }
        m9423u(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m9405l(boolean[] zArr, long j10) {
        C2743Q0[] c2743q0Arr;
        long j11;
        C2791q0 c2791q0 = this.f25996t.f26043k;
        C10332x c10332x = c2791q0.f9292o;
        int i10 = 0;
        while (true) {
            c2743q0Arr = this.f25973b;
            if (i10 >= c2743q0Arr.length) {
                break;
            }
            if (!c10332x.m12480b(i10)) {
                c2743q0Arr[i10].m3466j();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < c2743q0Arr.length) {
            if (c10332x.m12480b(i11) && c2743q0Arr[i11].m3460c(c2791q0) == null) {
                j11 = j10;
                m9403k(c2791q0, i11, zArr[i11], j11);
            } else {
                j11 = j10;
            }
            i11++;
            j10 = j11;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m9406l0(InterfaceC6661b0 interfaceC6661b0) throws Throwable {
        this.f25954I.m9436a(1);
        C7775i c7775i = this.f25997u;
        int size = c7775i.f26076b.size();
        if (interfaceC6661b0.getLength() != size) {
            interfaceC6661b0 = interfaceC6661b0.mo7531e().mo7533g(size);
        }
        c7775i.f26084j = interfaceC6661b0;
        m9425v(c7775i.m9460b(), false);
    }

    /* JADX INFO: renamed from: m */
    public final long m9407m(AbstractC20686A abstractC20686A, Object obj, long j10) {
        AbstractC20686A.b bVar = this.f25989m;
        int i10 = abstractC20686A.mo3482g(obj, bVar).f70864c;
        AbstractC20686A.c cVar = this.f25988l;
        abstractC20686A.m25224n(i10, cVar);
        if (cVar.f70876f != -9223372036854775807L && cVar.m25232a() && cVar.f70879i) {
            return C0513S.m982T(C0513S.m967E(cVar.f70877g) - cVar.f70876f) - (j10 + bVar.f70866e);
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m9408m0(int i10) {
        C2731K0 c2731k0 = this.f25953H;
        if (c2731k0.f9129e != i10) {
            if (i10 != 2) {
                this.f25974b0 = -9223372036854775807L;
            }
            if (i10 != 3 && c2731k0.f9140p) {
                this.f25953H = c2731k0.m3445i(false);
            }
            this.f25953H = this.f25953H.m3444h(i10);
        }
    }

    /* JADX INFO: renamed from: n */
    public final long m9409n(C2791q0 c2791q0) {
        if (c2791q0 == null) {
            return 0L;
        }
        long jMax = c2791q0.f9293p;
        if (!c2791q0.f9282e) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            C2743Q0[] c2743q0Arr = this.f25973b;
            if (i10 >= c2743q0Arr.length) {
                return jMax;
            }
            if (c2743q0Arr[i10].m3460c(c2791q0) != null) {
                InterfaceC7781n interfaceC7781nM3460c = c2743q0Arr[i10].m3460c(c2791q0);
                Objects.requireNonNull(interfaceC7781nM3460c);
                long jMo9238u = interfaceC7781nM3460c.mo9238u();
                if (jMo9238u == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jMo9238u, jMax);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m9410n0(InterfaceC11271u interfaceC11271u) {
        for (C2743Q0 c2743q0 : this.f25973b) {
            InterfaceC7781n interfaceC7781n = c2743q0.f9166a;
            if (interfaceC7781n.mo9232m() == 2) {
                interfaceC7781n.handleMessage(7, interfaceC11271u);
                InterfaceC7781n interfaceC7781n2 = c2743q0.f9168c;
                if (interfaceC7781n2 != null) {
                    interfaceC7781n2.handleMessage(7, interfaceC11271u);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final Pair<InterfaceC6695z.b, Long> m9411o(AbstractC20686A abstractC20686A) {
        if (abstractC20686A.m25225p()) {
            return Pair.create(C2731K0.f9124u, 0L);
        }
        Pair<Object, Long> pairM25222i = abstractC20686A.m25222i(this.f25988l, this.f25989m, abstractC20686A.mo3478a(this.f25962Q), -9223372036854775807L);
        InterfaceC6695z.b bVarM9453q = this.f25996t.m9453q(abstractC20686A, pairM25222i.first, 0L);
        long jLongValue = ((Long) pairM25222i.second).longValue();
        if (bVarM9453q.m7559b()) {
            Object obj = bVarM9453q.f22080a;
            AbstractC20686A.b bVar = this.f25989m;
            abstractC20686A.mo3482g(obj, bVar);
            jLongValue = bVarM9453q.f22082c == bVar.m25228c(bVarM9453q.f22081b) ? bVar.f70868g.f70956c : 0L;
        }
        return Pair.create(bVarM9453q, Long.valueOf(jLongValue));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m9412o0(Object obj, C0529o c0529o) {
        for (C2743Q0 c2743q0 : this.f25973b) {
            InterfaceC7781n interfaceC7781n = c2743q0.f9166a;
            if (interfaceC7781n.mo9232m() == 2) {
                int i10 = c2743q0.f9169d;
                if (i10 == 4 || i10 == 1) {
                    InterfaceC7781n interfaceC7781n2 = c2743q0.f9168c;
                    interfaceC7781n2.getClass();
                    interfaceC7781n2.handleMessage(1, obj);
                } else {
                    interfaceC7781n.handleMessage(1, obj);
                }
            }
        }
        int i11 = this.f25953H.f9129e;
        if (i11 == 3 || i11 == 2) {
            this.f25985i.mo939k(2);
        }
        if (c0529o != null) {
            c0529o.m1052e();
        }
    }

    /* JADX INFO: renamed from: p */
    public final long m9413p(long j10) {
        C2791q0 c2791q0 = this.f25996t.f26045m;
        if (c2791q0 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.f25968W - c2791q0.f9293p));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m9414p0(float f10) {
        this.f25982f0 = f10;
        float f11 = f10 * this.f25947B.f9216g;
        for (C2743Q0 c2743q0 : this.f25973b) {
            InterfaceC7781n interfaceC7781n = c2743q0.f9166a;
            if (interfaceC7781n.mo9232m() == 1) {
                interfaceC7781n.handleMessage(2, Float.valueOf(f11));
                InterfaceC7781n interfaceC7781n2 = c2743q0.f9168c;
                if (interfaceC7781n2 != null) {
                    interfaceC7781n2.handleMessage(2, Float.valueOf(f11));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m9415q(int i10) {
        C2731K0 c2731k0 = this.f25953H;
        m9432y0(i10, c2731k0.f9138n, c2731k0.f9137m, c2731k0.f9136l);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m9416q0() {
        C2731K0 c2731k0 = this.f25953H;
        return c2731k0.f9136l && c2731k0.f9138n == 0;
    }

    /* JADX INFO: renamed from: r */
    public final void m9417r() {
        m9414p0(this.f25982f0);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m9418r0(AbstractC20686A abstractC20686A, InterfaceC6695z.b bVar) {
        if (bVar.m7559b() || abstractC20686A.m25225p()) {
            return false;
        }
        int i10 = abstractC20686A.mo3482g(bVar.f22080a, this.f25989m).f70864c;
        AbstractC20686A.c cVar = this.f25988l;
        abstractC20686A.m25224n(i10, cVar);
        return cVar.m25232a() && cVar.f70879i && cVar.f70876f != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: s */
    public final void m9419s(InterfaceC6694y interfaceC6694y) {
        C7774h c7774h = this.f25996t;
        C2791q0 c2791q0 = c7774h.f26045m;
        if (c2791q0 != null && c2791q0.f9278a == interfaceC6694y) {
            c7774h.m9450m(this.f25968W);
            m9364C();
            return;
        }
        C2791q0 c2791q1 = c7774h.f26046n;
        if (c2791q1 == null || c2791q1.f9278a != interfaceC6694y) {
            return;
        }
        m9365D();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m9420s0() {
        C2791q0 c2791q0 = this.f25996t.f26042j;
        if (c2791q0 == null) {
            return;
        }
        C10332x c10332x = c2791q0.f9292o;
        int i10 = 0;
        while (true) {
            C2743Q0[] c2743q0Arr = this.f25973b;
            if (i10 >= c2743q0Arr.length) {
                return;
            }
            if (c10332x.m12480b(i10)) {
                c2743q0Arr[i10].m3467l();
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m9421t(IOException iOException, int i10) {
        C2784n c2784n = new C2784n(0, iOException, i10);
        C2791q0 c2791q0 = this.f25996t.f26042j;
        if (c2791q0 != null) {
            c2784n = c2784n.m3495a(c2791q0.f9284g.f9295a);
        }
        C0539y.m1072d("Playback error", c2784n);
        m9422t0(false, false);
        this.f25953H = this.f25953H.m3442f(c2784n);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m9422t0(boolean z10, boolean z11) {
        m9376O(z10 || !this.f25963R, false, true, false);
        this.f25954I.m9436a(z11 ? 1 : 0);
        this.f25983g.mo9251j(this.f26000x);
        this.f25947B.m3490d(1, this.f25953H.f9136l);
        m9408m0(1);
    }

    /* JADX INFO: renamed from: u */
    public final void m9423u(boolean z10) {
        C2791q0 c2791q0 = this.f25996t.f26045m;
        InterfaceC6695z.b bVar = c2791q0 == null ? this.f25953H.f9126b : c2791q0.f9284g.f9295a;
        boolean zEquals = this.f25953H.f9135k.equals(bVar);
        if (!zEquals) {
            this.f25953H = this.f25953H.m3439c(bVar);
        }
        C2731K0 c2731k0 = this.f25953H;
        c2731k0.f9141q = c2791q0 == null ? c2731k0.f9143s : c2791q0.m3500d();
        C2731K0 c2731k1 = this.f25953H;
        c2731k1.f9142r = m9413p(c2731k1.f9141q);
        if ((!zEquals || z10) && c2791q0 != null && c2791q0.f9282e) {
            m9428w0(c2791q0.f9284g.f9295a, c2791q0.f9291n, c2791q0.f9292o);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m9424u0() {
        C2778k c2778k = this.f25992p;
        c2778k.f9260g = false;
        C2750U0 c2750u0 = c2778k.f9255b;
        if (c2750u0.f9183c) {
            c2750u0.m3471a(c2750u0.mo3474d());
            c2750u0.f9183c = false;
        }
        for (C2743Q0 c2743q0 : this.f25973b) {
            InterfaceC7781n interfaceC7781n = c2743q0.f9168c;
            InterfaceC7781n interfaceC7781n2 = c2743q0.f9166a;
            if (C2743Q0.m3456g(interfaceC7781n2) && interfaceC7781n2.getState() == 2) {
                interfaceC7781n2.stop();
            }
            if (interfaceC7781n != null && interfaceC7781n.getState() != 0 && interfaceC7781n.getState() == 2) {
                interfaceC7781n.stop();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x0332  */
    /* JADX WARN: Code duplicated, block: B:196:0x0335  */
    /* JADX WARN: Code duplicated, block: B:201:0x034a  */
    /* JADX WARN: Code duplicated, block: B:203:0x0354 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x0368  */
    /* JADX WARN: Code duplicated, block: B:212:0x0373  */
    /* JADX WARN: Code duplicated, block: B:214:0x0378  */
    /* JADX WARN: Code duplicated, block: B:218:0x0398  */
    /* JADX WARN: Code duplicated, block: B:223:0x03af  */
    /* JADX WARN: Code duplicated, block: B:224:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:227:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:229:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:231:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:240:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:242:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:246:0x0413  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [z2.A] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [z2.A] */
    /* JADX WARN: Type inference failed for: r2v15, types: [K2.K0] */
    /* JADX WARN: Type inference failed for: r2v34, types: [androidx.media3.exoplayer.h] */
    /* JADX WARN: Type inference failed for: r35v0, types: [androidx.media3.exoplayer.e] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v23, types: [z2.A] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    public final void m9425v(AbstractC20686A abstractC20686A, boolean z10) throws Throwable {
        long jLongValue;
        AbstractC20686A abstractC20686A2;
        AbstractC20686A.c cVar;
        Object obj;
        int iMo3478a;
        long jM1005j;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        long j11;
        f fVar;
        int i10;
        long jLongValue2;
        boolean z15;
        boolean z16;
        boolean z17;
        ?? r11;
        InterfaceC6695z.b bVar;
        long j12;
        InterfaceC6695z.b bVar2;
        Object obj2;
        boolean z18;
        int i11;
        boolean z19;
        ?? r10;
        AbstractC20686A abstractC20686A3;
        C2791q0 c2791q0;
        long j13;
        InterfaceC6695z.b bVar3;
        Object obj3;
        boolean z20;
        int i12;
        C2731K0 c2731k0 = this.f25953H;
        g gVar = this.f25967V;
        C7774h c7774h = this.f25996t;
        int i13 = this.f25961P;
        boolean z21 = this.f25962Q;
        AbstractC20686A.c cVar2 = this.f25988l;
        AbstractC20686A.b bVar4 = this.f25989m;
        int i14 = 4;
        if (abstractC20686A.m25225p()) {
            jLongValue = 0;
            abstractC20686A2 = abstractC20686A;
            fVar = new f(C2731K0.f9124u, 0L, -9223372036854775807L, false, true, false);
        } else {
            InterfaceC6695z.b bVar5 = c2731k0.f9126b;
            Object obj4 = bVar5.f22080a;
            AbstractC20686A abstractC20686A4 = c2731k0.f9125a;
            boolean z22 = abstractC20686A4.m25225p() || abstractC20686A4.mo3482g(bVar5.f22080a, bVar4).f70867f;
            jLongValue = (c2731k0.f9126b.m7559b() || z22) ? c2731k0.f9127c : c2731k0.f9143s;
            if (gVar != null) {
                boolean z23 = false;
                abstractC20686A2 = abstractC20686A;
                Pair<Object, Long> pairM9357S = m9357S(abstractC20686A2, gVar, true, i13, z21, cVar2, bVar4);
                if (pairM9357S == null) {
                    iMo3478a = abstractC20686A2.mo3478a(z21);
                    obj = obj4;
                    jLongValue2 = jLongValue;
                    z17 = true;
                    z16 = false;
                } else {
                    if (gVar.f26021c == -9223372036854775807L) {
                        iMo3478a = abstractC20686A2.mo3482g(pairM9357S.first, bVar4).f70864c;
                        obj = obj4;
                        jLongValue2 = jLongValue;
                        z15 = false;
                    } else {
                        obj = pairM9357S.first;
                        jLongValue2 = ((Long) pairM9357S.second).longValue();
                        iMo3478a = -1;
                        z15 = true;
                    }
                    z23 = c2731k0.f9129e == 4;
                    z16 = z15;
                    z17 = false;
                }
                jLongValue = jLongValue2;
                cVar = cVar2;
                z12 = z17;
                z11 = z23;
                z13 = z16;
            } else {
                abstractC20686A2 = abstractC20686A;
                if (c2731k0.f9125a.m25225p()) {
                    iMo3478a = abstractC20686A2.mo3478a(z21);
                    cVar = cVar2;
                    obj = obj4;
                } else if (abstractC20686A2.mo3479b(obj4) == -1) {
                    int iM9358T = m9358T(cVar2, bVar4, i13, z21, obj, c2731k0.f9125a, abstractC20686A2);
                    cVar = cVar2;
                    if (iM9358T == -1) {
                        obj = obj4;
                        abstractC20686A2 = abstractC20686A2;
                        bVar4 = bVar4;
                        iM9358T = abstractC20686A2.mo3478a(z21);
                        z14 = true;
                    } else {
                        obj = obj4;
                        abstractC20686A2 = abstractC20686A2;
                        bVar4 = bVar4;
                        z14 = false;
                    }
                    iMo3478a = iM9358T;
                    z12 = z14;
                    jLongValue = jLongValue;
                    z11 = false;
                    z13 = false;
                } else {
                    cVar = cVar2;
                    if (jLongValue == -9223372036854775807L) {
                        obj = obj4;
                        iMo3478a = abstractC20686A2.mo3482g(obj, bVar4).f70864c;
                    } else if (z22) {
                        c2731k0.f9125a.mo3482g(bVar5.f22080a, bVar4);
                        if (c2731k0.f9125a.mo3485m(bVar4.f70864c, cVar, 0L).f70884n == c2731k0.f9125a.mo3479b(bVar5.f22080a)) {
                            Pair<Object, Long> pairM25222i = abstractC20686A2.m25222i(cVar, bVar4, abstractC20686A2.mo3482g(obj, bVar4).f70864c, jLongValue + bVar4.f70866e);
                            obj = pairM25222i.first;
                            jM1005j = ((Long) pairM25222i.second).longValue();
                        } else {
                            jM1005j = abstractC20686A2.mo3482g(obj, bVar4).f70865d != -9223372036854775807L ? C0513S.m1005j(jLongValue, 0L, bVar4.f70865d - 1) : jLongValue;
                        }
                        jLongValue = jM1005j;
                        iMo3478a = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        iMo3478a = -1;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                }
                z11 = false;
                z12 = false;
                z13 = false;
            }
            if (iMo3478a != -1) {
                Pair<Object, Long> pairM25222i2 = abstractC20686A2.m25222i(cVar, bVar4, iMo3478a, -9223372036854775807L);
                obj = pairM25222i2.first;
                jLongValue = ((Long) pairM25222i2.second).longValue();
                j11 = -9223372036854775807L;
                j10 = jLongValue;
            } else {
                j10 = jLongValue;
                j11 = j10;
            }
            InterfaceC6695z.b bVarM9453q = c7774h.m9453q(abstractC20686A2, obj, j10);
            int i15 = bVarM9453q.f22084e;
            boolean z24 = bVar5.f22080a.equals(obj) && !bVar5.m7559b() && !bVarM9453q.m7559b() && (i15 == -1 || ((i10 = bVar5.f22084e) != -1 && i15 >= i10));
            AbstractC20686A.b bVarMo3482g = abstractC20686A2.mo3482g(obj, bVar4);
            if (!z22 && jLongValue == j11) {
                Object obj5 = bVar5.f22080a;
                int i16 = bVar5.f22081b;
                if (obj5.equals(bVarM9453q.f22080a)) {
                    if (bVar5.m7559b()) {
                        bVarMo3482g.m25230e(i16);
                    }
                    if (bVarM9453q.m7559b()) {
                        bVarMo3482g.m25230e(bVarM9453q.f22081b);
                    }
                }
            }
            if (z24) {
                bVarM9453q = bVar5;
            }
            if (bVarM9453q.m7559b()) {
                if (bVarM9453q.equals(bVar5)) {
                    j10 = c2731k0.f9143s;
                } else {
                    abstractC20686A2.mo3482g(bVarM9453q.f22080a, bVar4);
                    j10 = bVarM9453q.f22082c == bVar4.m25228c(bVarM9453q.f22081b) ? bVar4.f70868g.f70956c : 0L;
                }
            }
            fVar = new f(bVarM9453q, j10, j11, z11, z12, z13);
        }
        InterfaceC6695z.b bVar6 = fVar.f26013a;
        long j14 = fVar.f26015c;
        boolean z25 = fVar.f26016d;
        long j15 = fVar.f26014b;
        boolean z26 = (this.f25953H.f9126b.equals(bVar6) && j15 == this.f25953H.f9143s) ? false : true;
        try {
            if (fVar.f26017e) {
                try {
                    z19 = true;
                    if (this.f25953H.f9129e != 1) {
                        m9408m0(4);
                    }
                    m9376O(false, false, false, true);
                } catch (Throwable th) {
                    th = th;
                    r11 = abstractC20686A2;
                    bVar = bVar6;
                    jLongValue = j15;
                    i14 = 2;
                }
            } else {
                z19 = true;
            }
            C2743Q0[] c2743q0Arr = this.f25973b;
            int length = c2743q0Arr.length;
            int i17 = 0;
            ?? r12 = z19;
            while (i17 < length) {
                C2743Q0 c2743q0 = c2743q0Arr[i17];
                c2743q0.f9166a.mo9229j(abstractC20686A2);
                InterfaceC7781n interfaceC7781n = c2743q0.f9168c;
                if (interfaceC7781n != null) {
                    interfaceC7781n.mo9229j(abstractC20686A2);
                }
                i17++;
                r12 = 1;
            }
            try {
                if (z26) {
                    r12 = abstractC20686A2;
                    jLongValue = j15;
                    i14 = 2;
                    if (r12.m25225p()) {
                        bVar = bVar6;
                    } else {
                        for (C2791q0 c2791q1 = this.f25996t.f26042j; c2791q1 != null; c2791q1 = c2791q1.f9290m) {
                            if (c2791q1.f9284g.f9295a.equals(bVar6)) {
                                c2791q1.f9284g = this.f25996t.m9445h(r12, c2791q1.f9284g);
                                c2791q1.m3507k();
                            }
                        }
                        try {
                            C7774h c7774h2 = this.f25996t;
                            bVar = bVar6;
                            try {
                                jLongValue = m9383X(bVar, jLongValue, c7774h2.f26042j != c7774h2.f26043k, z25);
                            } catch (Throwable th2) {
                                th = th2;
                                jLongValue = jLongValue;
                                r10 = r12;
                                r11 = r10;
                                C2731K0 c2731k1 = this.f25953H;
                                AbstractC20686A abstractC20686A5 = c2731k1.f9125a;
                                InterfaceC6695z.b bVar7 = c2731k1.f9126b;
                                if (fVar.f26018f) {
                                    j12 = jLongValue;
                                } else {
                                    j12 = -9223372036854775807L;
                                }
                                bVar2 = bVar;
                                m9361A0(r11, bVar2, abstractC20686A5, bVar7, j12, false);
                                if (z26) {
                                    C2731K0 c2731k2 = this.f25953H;
                                    obj2 = c2731k2.f9126b.f22080a;
                                    AbstractC20686A abstractC20686A6 = c2731k2.f9125a;
                                    if (z26) {
                                        z18 = false;
                                    } else {
                                        z18 = false;
                                    }
                                    long j16 = this.f25953H.f9128d;
                                    if (r11.mo3479b(obj2) == -1) {
                                        i11 = 4;
                                    } else {
                                        i11 = 3;
                                    }
                                    this.f25953H = m9431y(bVar2, jLongValue, j14, j16, z18, i11);
                                } else {
                                    C2731K0 c2731k3 = this.f25953H;
                                    obj2 = c2731k3.f9126b.f22080a;
                                    AbstractC20686A abstractC20686A7 = c2731k3.f9125a;
                                    if (z26) {
                                        z18 = false;
                                    } else {
                                        z18 = false;
                                    }
                                    long j17 = this.f25953H.f9128d;
                                    if (r11.mo3479b(obj2) == -1) {
                                        i11 = 4;
                                    } else {
                                        i11 = 3;
                                    }
                                    this.f25953H = m9431y(bVar2, jLongValue, j14, j17, z18, i11);
                                }
                                m9377P();
                                m9379R(r11, this.f25953H.f9125a);
                                this.f25953H = this.f25953H.m3446j(r11);
                                if (!r11.m25225p()) {
                                    this.f25967V = null;
                                }
                                m9423u(false);
                                this.f25985i.mo939k(i14);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bVar = bVar6;
                            r10 = r12;
                            r11 = r10;
                            C2731K0 c2731k4 = this.f25953H;
                            AbstractC20686A abstractC20686A8 = c2731k4.f9125a;
                            InterfaceC6695z.b bVar8 = c2731k4.f9126b;
                            if (fVar.f26018f) {
                                j12 = jLongValue;
                            } else {
                                j12 = -9223372036854775807L;
                            }
                            bVar2 = bVar;
                            m9361A0(r11, bVar2, abstractC20686A8, bVar8, j12, false);
                            if (z26) {
                                C2731K0 c2731k5 = this.f25953H;
                                obj2 = c2731k5.f9126b.f22080a;
                                AbstractC20686A abstractC20686A9 = c2731k5.f9125a;
                                if (z26) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                long j18 = this.f25953H.f9128d;
                                if (r11.mo3479b(obj2) == -1) {
                                    i11 = 4;
                                } else {
                                    i11 = 3;
                                }
                                this.f25953H = m9431y(bVar2, jLongValue, j14, j18, z18, i11);
                            } else {
                                C2731K0 c2731k6 = this.f25953H;
                                obj2 = c2731k6.f9126b.f22080a;
                                AbstractC20686A abstractC20686A10 = c2731k6.f9125a;
                                if (z26) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                long j19 = this.f25953H.f9128d;
                                if (r11.mo3479b(obj2) == -1) {
                                    i11 = 4;
                                } else {
                                    i11 = 3;
                                }
                                this.f25953H = m9431y(bVar2, jLongValue, j14, j19, z18, i11);
                            }
                            m9377P();
                            m9379R(r11, this.f25953H.f9125a);
                            this.f25953H = this.f25953H.m3446j(r11);
                            if (!r11.m25225p()) {
                                this.f25967V = null;
                            }
                            m9423u(false);
                            this.f25985i.mo939k(i14);
                            throw th;
                        }
                    }
                    C2731K0 c2731k7 = this.f25953H;
                    AbstractC20686A abstractC20686A11 = c2731k7.f9125a;
                    InterfaceC6695z.b bVar9 = c2731k7.f9126b;
                    if (fVar.f26018f) {
                        j13 = jLongValue;
                    } else {
                        j13 = -9223372036854775807L;
                    }
                    bVar3 = bVar;
                    m9361A0(abstractC20686A, bVar3, abstractC20686A11, bVar9, j13, false);
                    if (z26) {
                        C2731K0 c2731k8 = this.f25953H;
                        obj3 = c2731k8.f9126b.f22080a;
                        AbstractC20686A abstractC20686A12 = c2731k8.f9125a;
                        if (z26) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        long j20 = this.f25953H.f9128d;
                        if (abstractC20686A.mo3479b(obj3) == -1) {
                            i12 = 4;
                        } else {
                            i12 = 3;
                        }
                        this.f25953H = m9431y(bVar3, jLongValue, j14, j20, z20, i12);
                    } else {
                        C2731K0 c2731k9 = this.f25953H;
                        obj3 = c2731k9.f9126b.f22080a;
                        AbstractC20686A abstractC20686A13 = c2731k9.f9125a;
                        if (z26) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        long j21 = this.f25953H.f9128d;
                        if (abstractC20686A.mo3479b(obj3) == -1) {
                            i12 = 4;
                        } else {
                            i12 = 3;
                        }
                        this.f25953H = m9431y(bVar3, jLongValue, j14, j21, z20, i12);
                    }
                    m9377P();
                    m9379R(abstractC20686A, this.f25953H.f9125a);
                    this.f25953H = this.f25953H.m3446j(abstractC20686A);
                    if (!abstractC20686A.m25225p()) {
                        this.f25967V = null;
                    }
                    m9423u(false);
                    this.f25985i.mo939k(i14);
                    return;
                }
                try {
                    C2791q0 c2791q2 = this.f25996t.f26043k;
                    try {
                        jLongValue = j15;
                        try {
                            i14 = 2;
                            try {
                                int iM9456t = this.f25996t.m9456t(abstractC20686A, this.f25968W, c2791q2 == null ? 0L : m9409n(c2791q2), (!m9393f() || (c2791q0 = this.f25996t.f26044l) == null) ? 0L : m9409n(c2791q0));
                                if ((iM9456t & 1) != 0) {
                                    m9381V(false);
                                } else if ((iM9456t & 2) != 0) {
                                    m9397h();
                                }
                                bVar = bVar6;
                                C2731K0 c2731k10 = this.f25953H;
                                AbstractC20686A abstractC20686A14 = c2731k10.f9125a;
                                InterfaceC6695z.b bVar10 = c2731k10.f9126b;
                                if (fVar.f26018f) {
                                    j13 = jLongValue;
                                } else {
                                    j13 = -9223372036854775807L;
                                }
                                bVar3 = bVar;
                                m9361A0(abstractC20686A, bVar3, abstractC20686A14, bVar10, j13, false);
                                if (z26 || j14 != this.f25953H.f9127c) {
                                    C2731K0 c2731k11 = this.f25953H;
                                    obj3 = c2731k11.f9126b.f22080a;
                                    AbstractC20686A abstractC20686A15 = c2731k11.f9125a;
                                    if (z26 || !z10 || abstractC20686A15.m25225p() || abstractC20686A15.mo3482g(obj3, this.f25989m).f70867f) {
                                        z20 = false;
                                    } else {
                                        z20 = true;
                                    }
                                    long j22 = this.f25953H.f9128d;
                                    if (abstractC20686A.mo3479b(obj3) == -1) {
                                        i12 = 4;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.f25953H = m9431y(bVar3, jLongValue, j14, j22, z20, i12);
                                }
                                m9377P();
                                m9379R(abstractC20686A, this.f25953H.f9125a);
                                this.f25953H = this.f25953H.m3446j(abstractC20686A);
                                if (!abstractC20686A.m25225p()) {
                                    this.f25967V = null;
                                }
                                m9423u(false);
                                this.f25985i.mo939k(i14);
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                r12 = abstractC20686A;
                                bVar = bVar6;
                                r10 = r12;
                                r11 = r10;
                                C2731K0 c2731k12 = this.f25953H;
                                AbstractC20686A abstractC20686A16 = c2731k12.f9125a;
                                InterfaceC6695z.b bVar11 = c2731k12.f9126b;
                                if (fVar.f26018f) {
                                    j12 = jLongValue;
                                } else {
                                    j12 = -9223372036854775807L;
                                }
                                bVar2 = bVar;
                                m9361A0(r11, bVar2, abstractC20686A16, bVar11, j12, false);
                                if (z26) {
                                    C2731K0 c2731k13 = this.f25953H;
                                    obj2 = c2731k13.f9126b.f22080a;
                                    AbstractC20686A abstractC20686A17 = c2731k13.f9125a;
                                    if (z26) {
                                        z18 = false;
                                    } else {
                                        z18 = false;
                                    }
                                    long j110 = this.f25953H.f9128d;
                                    if (r11.mo3479b(obj2) == -1) {
                                        i11 = 4;
                                    } else {
                                        i11 = 3;
                                    }
                                    this.f25953H = m9431y(bVar2, jLongValue, j14, j110, z18, i11);
                                } else {
                                    C2731K0 c2731k14 = this.f25953H;
                                    obj2 = c2731k14.f9126b.f22080a;
                                    AbstractC20686A abstractC20686A18 = c2731k14.f9125a;
                                    if (z26) {
                                        z18 = false;
                                    } else {
                                        z18 = false;
                                    }
                                    long j111 = this.f25953H.f9128d;
                                    if (r11.mo3479b(obj2) == -1) {
                                        i11 = 4;
                                    } else {
                                        i11 = 3;
                                    }
                                    this.f25953H = m9431y(bVar2, jLongValue, j14, j111, z18, i11);
                                }
                                m9377P();
                                m9379R(r11, this.f25953H.f9125a);
                                this.f25953H = this.f25953H.m3446j(r11);
                                if (!r11.m25225p()) {
                                    this.f25967V = null;
                                }
                                m9423u(false);
                                this.f25985i.mo939k(i14);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r12 = abstractC20686A;
                            i14 = 2;
                            bVar = bVar6;
                            r10 = r12;
                            r11 = r10;
                            C2731K0 c2731k15 = this.f25953H;
                            AbstractC20686A abstractC20686A19 = c2731k15.f9125a;
                            InterfaceC6695z.b bVar12 = c2731k15.f9126b;
                            if (fVar.f26018f) {
                                j12 = jLongValue;
                            } else {
                                j12 = -9223372036854775807L;
                            }
                            bVar2 = bVar;
                            m9361A0(r11, bVar2, abstractC20686A19, bVar12, j12, false);
                            if (z26) {
                                C2731K0 c2731k16 = this.f25953H;
                                obj2 = c2731k16.f9126b.f22080a;
                                AbstractC20686A abstractC20686A110 = c2731k16.f9125a;
                                if (z26) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                long j112 = this.f25953H.f9128d;
                                if (r11.mo3479b(obj2) == -1) {
                                    i11 = 4;
                                } else {
                                    i11 = 3;
                                }
                                this.f25953H = m9431y(bVar2, jLongValue, j14, j112, z18, i11);
                            } else {
                                C2731K0 c2731k17 = this.f25953H;
                                obj2 = c2731k17.f9126b.f22080a;
                                AbstractC20686A abstractC20686A111 = c2731k17.f9125a;
                                if (z26) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                long j113 = this.f25953H.f9128d;
                                if (r11.mo3479b(obj2) == -1) {
                                    i11 = 4;
                                } else {
                                    i11 = 3;
                                }
                                this.f25953H = m9431y(bVar2, jLongValue, j14, j113, z18, i11);
                            }
                            m9377P();
                            m9379R(r11, this.f25953H.f9125a);
                            this.f25953H = this.f25953H.m3446j(r11);
                            if (!r11.m25225p()) {
                                this.f25967V = null;
                            }
                            m9423u(false);
                            this.f25985i.mo939k(i14);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        abstractC20686A3 = abstractC20686A;
                        jLongValue = j15;
                        r12 = abstractC20686A3;
                        i14 = 2;
                        bVar = bVar6;
                        r10 = r12;
                        r11 = r10;
                        C2731K0 c2731k18 = this.f25953H;
                        AbstractC20686A abstractC20686A112 = c2731k18.f9125a;
                        InterfaceC6695z.b bVar13 = c2731k18.f9126b;
                        if (fVar.f26018f) {
                            j12 = jLongValue;
                        } else {
                            j12 = -9223372036854775807L;
                        }
                        bVar2 = bVar;
                        m9361A0(r11, bVar2, abstractC20686A112, bVar13, j12, false);
                        if (z26) {
                            C2731K0 c2731k19 = this.f25953H;
                            obj2 = c2731k19.f9126b.f22080a;
                            AbstractC20686A abstractC20686A113 = c2731k19.f9125a;
                            if (z26) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            long j114 = this.f25953H.f9128d;
                            if (r11.mo3479b(obj2) == -1) {
                                i11 = 4;
                            } else {
                                i11 = 3;
                            }
                            this.f25953H = m9431y(bVar2, jLongValue, j14, j114, z18, i11);
                        } else {
                            C2731K0 c2731k110 = this.f25953H;
                            obj2 = c2731k110.f9126b.f22080a;
                            AbstractC20686A abstractC20686A114 = c2731k110.f9125a;
                            if (z26) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            long j115 = this.f25953H.f9128d;
                            if (r11.mo3479b(obj2) == -1) {
                                i11 = 4;
                            } else {
                                i11 = 3;
                            }
                            this.f25953H = m9431y(bVar2, jLongValue, j14, j115, z18, i11);
                        }
                        m9377P();
                        m9379R(r11, this.f25953H.f9125a);
                        this.f25953H = this.f25953H.m3446j(r11);
                        if (!r11.m25225p()) {
                            this.f25967V = null;
                        }
                        m9423u(false);
                        this.f25985i.mo939k(i14);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    abstractC20686A3 = abstractC20686A2;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
        C2731K0 c2731k111 = this.f25953H;
        AbstractC20686A abstractC20686A115 = c2731k111.f9125a;
        InterfaceC6695z.b bVar14 = c2731k111.f9126b;
        if (fVar.f26018f) {
            j12 = jLongValue;
        } else {
            j12 = -9223372036854775807L;
        }
        bVar2 = bVar;
        m9361A0(r11, bVar2, abstractC20686A115, bVar14, j12, false);
        if (z26 || j14 != this.f25953H.f9127c) {
            C2731K0 c2731k112 = this.f25953H;
            obj2 = c2731k112.f9126b.f22080a;
            AbstractC20686A abstractC20686A116 = c2731k112.f9125a;
            if (z26 || !z10 || abstractC20686A116.m25225p() || abstractC20686A116.mo3482g(obj2, this.f25989m).f70867f) {
                z18 = false;
            } else {
                z18 = true;
            }
            long j116 = this.f25953H.f9128d;
            if (r11.mo3479b(obj2) == -1) {
                i11 = 4;
            } else {
                i11 = 3;
            }
            this.f25953H = m9431y(bVar2, jLongValue, j14, j116, z18, i11);
        }
        m9377P();
        m9379R(r11, this.f25953H.f9125a);
        this.f25953H = this.f25953H.m3446j(r11);
        if (!r11.m25225p()) {
            this.f25967V = null;
        }
        m9423u(false);
        this.f25985i.mo939k(i14);
        throw th;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Z2.a0, java.lang.Object] */
    /* JADX INFO: renamed from: v0 */
    public final void m9426v0() {
        C2791q0 c2791q0 = this.f25996t.f26045m;
        boolean z10 = this.f25960O || (c2791q0 != null && c2791q0.f9278a.isLoading());
        C2731K0 c2731k0 = this.f25953H;
        if (z10 != c2731k0.f9131g) {
            this.f25953H = c2731k0.m3438b(z10);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9427w(InterfaceC6694y interfaceC6694y) {
        C2791q0 c2791q0;
        C7774h c7774h = this.f25996t;
        C2791q0 c2791q1 = c7774h.f26045m;
        C2778k c2778k = this.f25992p;
        if (c2791q1 != null && c2791q1.f9278a == interfaceC6694y) {
            c2791q1.getClass();
            if (!c2791q1.f9282e) {
                float f10 = c2778k.getPlaybackParameters().f71222a;
                C2731K0 c2731k0 = this.f25953H;
                c2791q1.m3502f(f10, c2731k0.f9125a, c2731k0.f9136l);
            }
            m9428w0(c2791q1.f9284g.f9295a, c2791q1.f9291n, c2791q1.f9292o);
            if (c2791q1 == c7774h.f26042j) {
                m9378Q(c2791q1.f9284g.f9296b);
                m9405l(new boolean[this.f25973b.length], c7774h.f26043k.m3501e());
                c2791q1.f9285h = true;
                C2731K0 c2731k1 = this.f25953H;
                InterfaceC6695z.b bVar = c2731k1.f9126b;
                long j10 = c2791q1.f9284g.f9296b;
                this.f25953H = m9431y(bVar, j10, c2731k1.f9127c, j10, false, 5);
            }
            m9364C();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= c7774h.f26050r.size()) {
                c2791q0 = null;
                break;
            }
            c2791q0 = (C2791q0) c7774h.f26050r.get(i10);
            if (c2791q0.f9278a == interfaceC6694y) {
                break;
            } else {
                i10++;
            }
        }
        if (c2791q0 != null) {
            C0515a.m1030f(true ^ c2791q0.f9282e);
            float f11 = c2778k.getPlaybackParameters().f71222a;
            C2731K0 c2731k2 = this.f25953H;
            c2791q0.m3502f(f11, c2731k2.f9125a, c2731k2.f9136l);
            C2791q0 c2791q2 = c7774h.f26046n;
            if (c2791q2 == null || c2791q2.f9278a != interfaceC6694y) {
                return;
            }
            m9365D();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m9428w0(InterfaceC6695z.b bVar, C6677j0 c6677j0, C10332x c10332x) {
        long j10;
        long j11;
        C7774h c7774h = this.f25996t;
        C2791q0 c2791q0 = c7774h.f26045m;
        c2791q0.getClass();
        if (c2791q0 == c7774h.f26042j) {
            j10 = this.f25968W;
            j11 = c2791q0.f9293p;
        } else {
            j10 = this.f25968W - c2791q0.f9293p;
            j11 = c2791q0.f9284g.f9296b;
        }
        long j12 = j10 - j11;
        long jM9413p = m9413p(c2791q0.m3500d());
        long j13 = m9418r0(this.f25953H.f9125a, c2791q0.f9284g.f9295a) ? ((C2776j) this.f25998v).f9247h : -9223372036854775807L;
        AbstractC20686A abstractC20686A = this.f25953H.f9125a;
        float f10 = this.f25992p.getPlaybackParameters().f71222a;
        boolean z10 = this.f25953H.f9136l;
        this.f25983g.mo9244c(new InterfaceC7772f.a(this.f26000x, abstractC20686A, bVar, j12, jM9413p, f10, this.f25958M, j13), c10332x.f32013c);
    }

    /* JADX INFO: renamed from: x */
    public final void m9429x(C20718x c20718x, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.f25954I.m9436a(1);
            }
            this.f25953H = this.f25953H.m3443g(c20718x);
        }
        float f11 = c20718x.f71222a;
        C2791q0 c2791q0 = this.f25996t.f26042j;
        while (true) {
            i10 = 0;
            if (c2791q0 == null) {
                break;
            }
            InterfaceC10325q[] interfaceC10325qArr = c2791q0.f9292o.f32013c;
            int length = interfaceC10325qArr.length;
            while (i10 < length) {
                InterfaceC10325q interfaceC10325q = interfaceC10325qArr[i10];
                if (interfaceC10325q != null) {
                    interfaceC10325q.mo12430f(f11);
                }
                i10++;
            }
            c2791q0 = c2791q0.f9290m;
        }
        C2743Q0[] c2743q0Arr = this.f25973b;
        int length2 = c2743q0Arr.length;
        while (i10 < length2) {
            C2743Q0 c2743q0 = c2743q0Arr[i10];
            float f12 = c20718x.f71222a;
            c2743q0.f9166a.mo5957s(f10, f12);
            InterfaceC7781n interfaceC7781n = c2743q0.f9168c;
            if (interfaceC7781n != null) {
                interfaceC7781n.mo5957s(f10, f12);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m9430x0(int i10, List list, int i11) throws Throwable {
        this.f25954I.m9436a(1);
        C7775i c7775i = this.f25997u;
        c7775i.getClass();
        ArrayList arrayList = c7775i.f26076b;
        C0515a.m1025a(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        C0515a.m1025a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((C7775i.c) arrayList.get(i12)).f26092a.mo7452c((C20711q) list.get(i12 - i10));
        }
        m9425v(c7775i.m9460b(), false);
    }

    /* JADX INFO: renamed from: y */
    public final C2731K0 m9431y(InterfaceC6695z.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        C2500U c2500uM3216f;
        boolean z11;
        this.f25971Z = (!this.f25971Z && j10 == this.f25953H.f9143s && bVar.equals(this.f25953H.f9126b)) ? false : true;
        m9377P();
        C2731K0 c2731k0 = this.f25953H;
        C6677j0 c6677j0 = c2731k0.f9132h;
        C10332x c10332x = c2731k0.f9133i;
        List<C20714t> list = c2731k0.f9134j;
        if (this.f25997u.f26085k) {
            C2791q0 c2791q0 = this.f25996t.f26042j;
            c6677j0 = c2791q0 == null ? C6677j0.f22008d : c2791q0.f9291n;
            c10332x = c2791q0 == null ? this.f25981f : c2791q0.f9292o;
            InterfaceC10325q[] interfaceC10325qArr = c10332x.f32013c;
            AbstractC2481A.a aVar = new AbstractC2481A.a();
            boolean z12 = false;
            for (InterfaceC10325q interfaceC10325q : interfaceC10325qArr) {
                if (interfaceC10325q != null) {
                    C20714t c20714t = interfaceC10325q.mo7448c(0).f71031l;
                    if (c20714t == null) {
                        aVar.m3326c(new C20714t(new C20714t.a[0]));
                    } else {
                        aVar.m3326c(c20714t);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                c2500uM3216f = aVar.m3216f();
            } else {
                AbstractC2481A.b bVar2 = AbstractC2481A.f8293c;
                c2500uM3216f = C2500U.f8330f;
            }
            list = c2500uM3216f;
            if (c2791q0 != null) {
                C2793r0 c2793r0 = c2791q0.f9284g;
                if (c2793r0.f9297c != j11) {
                    c2791q0.f9284g = c2793r0.m3508a(j11);
                }
            }
            C2743Q0[] c2743q0Arr = this.f25973b;
            C7774h c7774h = this.f25996t;
            C2791q0 c2791q1 = c7774h.f26042j;
            if (c2791q1 == c7774h.f26043k && c2791q1 != null) {
                C10332x c10332x2 = c2791q1.f9292o;
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    if (i11 >= c2743q0Arr.length) {
                        z11 = true;
                        break;
                    }
                    if (c10332x2.m12480b(i11)) {
                        if (c2743q0Arr[i11].f9166a.mo9232m() != 1) {
                            z11 = false;
                            break;
                        }
                        if (c10332x2.f32012b[i11].f9163a != 0) {
                            z13 = true;
                        }
                    }
                    i11++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.f25965T) {
                    this.f25965T = z14;
                    if (!z14 && this.f25953H.f9140p) {
                        this.f25985i.mo939k(2);
                    }
                }
            }
        } else if (!bVar.equals(c2731k0.f9126b)) {
            c6677j0 = C6677j0.f22008d;
            c10332x = this.f25981f;
            list = C2500U.f8330f;
        }
        C6677j0 c6677j1 = c6677j0;
        C10332x c10332x3 = c10332x;
        List<C20714t> list2 = list;
        if (z10) {
            e eVar = this.f25954I;
            if (!eVar.f26011d || eVar.f26012e == 5) {
                eVar.f26008a = true;
                eVar.f26011d = true;
                eVar.f26012e = i10;
            } else {
                C0515a.m1025a(i10 == 5);
            }
        }
        C2731K0 c2731k1 = this.f25953H;
        return c2731k1.m3440d(bVar, j10, j11, j12, m9413p(c2731k1.f9141q), c6677j1, c10332x3, list2);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m9432y0(int i10, int i11, int i12, boolean z10) {
        boolean z11 = z10 && i10 != -1;
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = 0;
        }
        C2731K0 c2731k0 = this.f25953H;
        if (c2731k0.f9136l == z11 && c2731k0.f9138n == i11 && c2731k0.f9137m == i12) {
            return;
        }
        this.f25953H = c2731k0.m3441e(i12, i11, z11);
        m9363B0(false, false);
        C7774h c7774h = this.f25996t;
        for (C2791q0 c2791q0 = c7774h.f26042j; c2791q0 != null; c2791q0 = c2791q0.f9290m) {
            for (InterfaceC10325q interfaceC10325q : c2791q0.f9292o.f32013c) {
                if (interfaceC10325q != null) {
                    interfaceC10325q.mo12440n(z11);
                }
            }
        }
        if (!m9416q0()) {
            m9424u0();
            m9433z0();
            C2731K0 c2731k1 = this.f25953H;
            if (c2731k1.f9140p) {
                this.f25953H = c2731k1.m3445i(false);
            }
            c7774h.m9450m(this.f25968W);
            return;
        }
        int i13 = this.f25953H.f9129e;
        InterfaceC0535u interfaceC0535u = this.f25985i;
        if (i13 != 3) {
            if (i13 == 2) {
                interfaceC0535u.mo939k(2);
                return;
            }
            return;
        }
        C2778k c2778k = this.f25992p;
        c2778k.f9260g = true;
        C2750U0 c2750u0 = c2778k.f9255b;
        if (!c2750u0.f9183c) {
            c2750u0.f9185e = c2750u0.f9182b.elapsedRealtime();
            c2750u0.f9183c = true;
        }
        m9420s0();
        interfaceC0535u.mo939k(2);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Type inference failed for: r2v22, types: [Z2.y, java.lang.Object] */
    /* JADX INFO: renamed from: z0 */
    public final void m9433z0() {
        long j10;
        C20718x playbackParameters;
        C2791q0 c2791q0 = this.f25996t.f26042j;
        if (c2791q0 == null) {
            return;
        }
        long discontinuity = c2791q0.f9282e ? c2791q0.f9278a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            if (!c2791q0.m3503g()) {
                this.f25996t.m9452o(c2791q0);
                m9423u(false);
                m9364C();
            }
            m9378Q(discontinuity);
            if (discontinuity != this.f25953H.f9143s) {
                C2731K0 c2731k0 = this.f25953H;
                j10 = -9223372036854775807L;
                this.f25953H = m9431y(c2731k0.f9126b, discontinuity, c2731k0.f9127c, discontinuity, true, 5);
            } else {
                j10 = -9223372036854775807L;
            }
        } else {
            j10 = -9223372036854775807L;
            C2778k c2778k = this.f25992p;
            boolean z10 = c2791q0 != this.f25996t.f26043k;
            C2750U0 c2750u0 = c2778k.f9255b;
            InterfaceC7781n interfaceC7781n = c2778k.f9257d;
            if (interfaceC7781n == null || interfaceC7781n.isEnded() || ((z10 && c2778k.f9257d.getState() != 2) || (!c2778k.f9257d.isReady() && (z10 || c2778k.f9257d.mo9226g())))) {
                c2778k.f9259f = true;
                if (c2778k.f9260g && !c2750u0.f9183c) {
                    c2750u0.f9185e = c2750u0.f9182b.elapsedRealtime();
                    c2750u0.f9183c = true;
                }
            } else {
                InterfaceC2789p0 interfaceC2789p0 = c2778k.f9258e;
                interfaceC2789p0.getClass();
                long jMo3474d = interfaceC2789p0.mo3474d();
                if (!c2778k.f9259f) {
                    c2750u0.m3471a(jMo3474d);
                    playbackParameters = interfaceC2789p0.getPlaybackParameters();
                    if (!playbackParameters.equals(c2750u0.f9186f)) {
                        c2750u0.mo3472b(playbackParameters);
                        c2778k.f9256c.f25985i.mo934f(16, playbackParameters).m942b();
                    }
                } else if (jMo3474d >= c2750u0.mo3474d()) {
                    c2778k.f9259f = false;
                    if (c2778k.f9260g && !c2750u0.f9183c) {
                        c2750u0.f9185e = c2750u0.f9182b.elapsedRealtime();
                        c2750u0.f9183c = true;
                    }
                    c2750u0.m3471a(jMo3474d);
                    playbackParameters = interfaceC2789p0.getPlaybackParameters();
                    if (!playbackParameters.equals(c2750u0.f9186f)) {
                        c2750u0.mo3472b(playbackParameters);
                        c2778k.f9256c.f25985i.mo934f(16, playbackParameters).m942b();
                    }
                } else if (c2750u0.f9183c) {
                    c2750u0.m3471a(c2750u0.mo3474d());
                    c2750u0.f9183c = false;
                }
            }
            long jMo3474d2 = c2778k.mo3474d();
            this.f25968W = jMo3474d2;
            long j11 = jMo3474d2 - c2791q0.f9293p;
            long j12 = this.f25953H.f9143s;
            if (!this.f25993q.isEmpty() && !this.f25953H.f9126b.m7559b()) {
                if (this.f25971Z) {
                    j12--;
                    this.f25971Z = false;
                }
                C2731K0 c2731k1 = this.f25953H;
                int iMo3479b = c2731k1.f9125a.mo3479b(c2731k1.f9126b.f22080a);
                int iMin = Math.min(this.f25970Y, this.f25993q.size());
                d dVar = iMin > 0 ? this.f25993q.get(iMin - 1) : null;
                while (dVar != null && (iMo3479b < 0 || (iMo3479b == 0 && 0 > j12))) {
                    int i10 = iMin - 1;
                    dVar = i10 > 0 ? this.f25993q.get(iMin - 2) : null;
                    iMin = i10;
                }
                if (iMin < this.f25993q.size()) {
                    this.f25993q.get(iMin);
                }
                this.f25970Y = iMin;
            }
            if (this.f25992p.mo3473c()) {
                boolean z11 = !this.f25954I.f26011d;
                C2731K0 c2731k2 = this.f25953H;
                this.f25953H = m9431y(c2731k2.f9126b, j11, c2731k2.f9127c, j11, z11, 6);
            } else {
                C2731K0 c2731k3 = this.f25953H;
                c2731k3.f9143s = j11;
                c2731k3.f9144t = SystemClock.elapsedRealtime();
            }
        }
        this.f25953H.f9141q = this.f25996t.f26045m.m3500d();
        C2731K0 c2731k4 = this.f25953H;
        c2731k4.f9142r = m9413p(c2731k4.f9141q);
        C2731K0 c2731k5 = this.f25953H;
        if (c2731k5.f9136l && c2731k5.f9129e == 3 && m9418r0(c2731k5.f9125a, c2731k5.f9126b)) {
            C2731K0 c2731k6 = this.f25953H;
            float f10 = 1.0f;
            if (c2731k6.f9139o.f71222a == 1.0f) {
                InterfaceC2787o0 interfaceC2787o0 = this.f25998v;
                long jM9407m = m9407m(c2731k6.f9125a, c2731k6.f9126b.f22080a, c2731k6.f9143s);
                long j13 = this.f25953H.f9142r;
                C2776j c2776j = (C2776j) interfaceC2787o0;
                if (c2776j.f9242c != j10) {
                    long j14 = jM9407m - j13;
                    long j15 = c2776j.f9252m;
                    if (j15 == j10) {
                        c2776j.f9252m = j14;
                        c2776j.f9253n = 0L;
                    } else {
                        long jMax = Math.max(j14, (long) ((j14 * 9.999871E-4f) + (j15 * 0.999f)));
                        c2776j.f9252m = jMax;
                        c2776j.f9253n = (long) ((9.999871E-4f * Math.abs(j14 - jMax)) + (c2776j.f9253n * 0.999f));
                    }
                    if (c2776j.f9251l == j10 || SystemClock.elapsedRealtime() - c2776j.f9251l >= 1000) {
                        c2776j.f9251l = SystemClock.elapsedRealtime();
                        long j16 = (c2776j.f9253n * 3) + c2776j.f9252m;
                        if (c2776j.f9247h > j16) {
                            float fM982T = C0513S.m982T(1000L);
                            long[] jArr = {j16, c2776j.f9244e, c2776j.f9247h - (((long) ((c2776j.f9250k - 1.0f) * fM982T)) + ((long) ((c2776j.f9248i - 1.0f) * fM982T)))};
                            long j17 = jArr[0];
                            for (int i11 = 1; i11 < 3; i11++) {
                                long j18 = jArr[i11];
                                if (j18 > j17) {
                                    j17 = j18;
                                }
                            }
                            c2776j.f9247h = j17;
                        } else {
                            long jM1005j = C0513S.m1005j(jM9407m - ((long) (Math.max(0.0f, c2776j.f9250k - 1.0f) / 1.0E-7f)), c2776j.f9247h, j16);
                            c2776j.f9247h = jM1005j;
                            long j19 = c2776j.f9246g;
                            if (j19 != j10 && jM1005j > j19) {
                                c2776j.f9247h = j19;
                            }
                        }
                        long j20 = jM9407m - c2776j.f9247h;
                        if (Math.abs(j20) < c2776j.f9240a) {
                            c2776j.f9250k = 1.0f;
                        } else {
                            c2776j.f9250k = C0513S.m1003h((1.0E-7f * j20) + 1.0f, c2776j.f9249j, c2776j.f9248i);
                        }
                        f10 = c2776j.f9250k;
                    } else {
                        f10 = c2776j.f9250k;
                    }
                }
                if (this.f25992p.getPlaybackParameters().f71222a != f10) {
                    C20718x c20718x = new C20718x(f10, this.f25953H.f9139o.f71223b);
                    this.f25985i.mo940l(16);
                    this.f25992p.mo3472b(c20718x);
                    m9429x(this.f25953H.f9139o, this.f25992p.getPlaybackParameters().f71222a, false, false);
                }
            }
        }
    }
}
