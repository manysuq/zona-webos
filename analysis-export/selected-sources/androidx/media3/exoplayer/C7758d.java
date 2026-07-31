package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.C7758d;
import androidx.media3.exoplayer.image.ImageOutput;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p003A2.C0033e;
import p021B2.C0227c;
import p039C2.C0504I;
import p039C2.C0505J;
import p039C2.C0513S;
import p039C2.C0515a;
import p039C2.C0521g;
import p039C2.C0529o;
import p039C2.C0538x;
import p039C2.C0539y;
import p039C2.InterfaceC0535u;
import p170J7.AbstractC2481A;
import p170J7.AbstractC2485E;
import p170J7.AbstractC2517f0;
import p170J7.C2500U;
import p183K2.C2724H;
import p183K2.C2731K0;
import p183K2.C2732L;
import p183K2.C2737N0;
import p183K2.C2741P0;
import p183K2.C2746S0;
import p183K2.C2747T;
import p183K2.C2748T0;
import p183K2.C2752V0;
import p183K2.C2754W0;
import p183K2.C2756Y;
import p183K2.C2769f0;
import p183K2.C2772h;
import p183K2.C2774i;
import p183K2.C2783m0;
import p183K2.C2784n;
import p183K2.C2804x;
import p183K2.C2808z;
import p183K2.InterfaceC2744R0;
import p183K2.InterfaceC2797t0;
import p183K2.RunnableC2722G;
import p201L2.C3179Q;
import p201L2.C3189a0;
import p201L2.C3193c0;
import p201L2.InterfaceC3188a;
import p219M2.InterfaceC3497t;
import p453Z2.C6677j0;
import p453Z2.C6692w;
import p453Z2.InterfaceC6661b0;
import p453Z2.InterfaceC6695z;
import p517d3.AbstractC10331w;
import p517d3.C10322n;
import p517d3.C10332x;
import p517d3.InterfaceC10325q;
import p535e3.InterfaceC10737c;
import p570g3.InterfaceC11249J;
import p570g3.InterfaceC11270t;
import p570g3.InterfaceC11271u;
import p582h3.C11823l;
import p582h3.InterfaceC11812a;
import p884z2.AbstractC20686A;
import p884z2.AbstractC20700f;
import p884z2.C20689D;
import p884z2.C20690E;
import p884z2.C20694I;
import p884z2.C20698d;
import p884z2.C20704j;
import p884z2.C20707m;
import p884z2.C20708n;
import p884z2.C20709o;
import p884z2.C20711q;
import p884z2.C20712r;
import p884z2.C20713s;
import p884z2.C20714t;
import p884z2.C20717w;
import p884z2.C20718x;
import p884z2.InterfaceC20719y;

/* JADX INFO: renamed from: androidx.media3.exoplayer.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7758d extends AbstractC20700f implements ExoPlayer {

    /* JADX INFO: renamed from: A */
    public final b f25742A;

    /* JADX INFO: renamed from: B */
    public final C7755a f25743B;

    /* JADX INFO: renamed from: C */
    public final C2752V0 f25744C;

    /* JADX INFO: renamed from: D */
    public final C2754W0 f25745D;

    /* JADX INFO: renamed from: E */
    public final long f25746E;

    /* JADX INFO: renamed from: F */
    public final C0521g<Integer> f25747F;

    /* JADX INFO: renamed from: G */
    public int f25748G;

    /* JADX INFO: renamed from: H */
    public boolean f25749H;

    /* JADX INFO: renamed from: I */
    public int f25750I;

    /* JADX INFO: renamed from: J */
    public int f25751J;

    /* JADX INFO: renamed from: K */
    public boolean f25752K;

    /* JADX INFO: renamed from: L */
    public boolean f25753L;

    /* JADX INFO: renamed from: M */
    public AbstractC2485E<Integer> f25754M;

    /* JADX INFO: renamed from: N */
    public final C2746S0 f25755N;

    /* JADX INFO: renamed from: O */
    public InterfaceC6661b0 f25756O;

    /* JADX INFO: renamed from: P */
    public InterfaceC20719y.a f25757P;

    /* JADX INFO: renamed from: Q */
    public C20713s f25758Q;

    /* JADX INFO: renamed from: R */
    public Object f25759R;

    /* JADX INFO: renamed from: S */
    public Surface f25760S;

    /* JADX INFO: renamed from: T */
    public SurfaceHolder f25761T;

    /* JADX INFO: renamed from: U */
    public C11823l f25762U;

    /* JADX INFO: renamed from: V */
    public boolean f25763V;

    /* JADX INFO: renamed from: W */
    public TextureView f25764W;

    /* JADX INFO: renamed from: X */
    public final int f25765X;

    /* JADX INFO: renamed from: Y */
    public C0504I f25766Y;

    /* JADX INFO: renamed from: Z */
    public final C20698d f25767Z;

    /* JADX INFO: renamed from: a0 */
    public float f25768a0;

    /* JADX INFO: renamed from: b */
    public final C10332x f25769b;

    /* JADX INFO: renamed from: b0 */
    public boolean f25770b0;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20719y.a f25771c;

    /* JADX INFO: renamed from: c0 */
    public C0227c f25772c0;

    /* JADX INFO: renamed from: d */
    public final C0529o f25773d = new C0529o();

    /* JADX INFO: renamed from: d0 */
    public final boolean f25774d0;

    /* JADX INFO: renamed from: e */
    public final Context f25775e;

    /* JADX INFO: renamed from: e0 */
    public boolean f25776e0;

    /* JADX INFO: renamed from: f */
    public final C7758d f25777f;

    /* JADX INFO: renamed from: f0 */
    public final int f25778f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC7781n[] f25779g;

    /* JADX INFO: renamed from: g0 */
    public C20694I f25780g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC7781n[] f25781h;

    /* JADX INFO: renamed from: h0 */
    public C20713s f25782h0;

    /* JADX INFO: renamed from: i */
    public final AbstractC10331w f25783i;

    /* JADX INFO: renamed from: i0 */
    public C2731K0 f25784i0;

    /* JADX INFO: renamed from: j */
    public final InterfaceC0535u f25785j;

    /* JADX INFO: renamed from: j0 */
    public int f25786j0;

    /* JADX INFO: renamed from: k */
    public final C2732L f25787k;

    /* JADX INFO: renamed from: k0 */
    public long f25788k0;

    /* JADX INFO: renamed from: l */
    public final C7771e f25789l;

    /* JADX INFO: renamed from: m */
    public final C0538x<InterfaceC20719y.c> f25790m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArraySet<ExoPlayer.InterfaceC7752a> f25791n;

    /* JADX INFO: renamed from: o */
    public final AbstractC20686A.b f25792o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f25793p;

    /* JADX INFO: renamed from: q */
    public final boolean f25794q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6695z.a f25795r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC3188a f25796s;

    /* JADX INFO: renamed from: t */
    public final Looper f25797t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC10737c f25798u;

    /* JADX INFO: renamed from: v */
    public final long f25799v;

    /* JADX INFO: renamed from: w */
    public final long f25800w;

    /* JADX INFO: renamed from: x */
    public final long f25801x;

    /* JADX INFO: renamed from: y */
    public final C0505J f25802y;

    /* JADX INFO: renamed from: z */
    public final a f25803z;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b implements InterfaceC11271u, InterfaceC11812a, C7780m.b {

        /* JADX INFO: renamed from: b */
        public InterfaceC11271u f25805b;

        /* JADX INFO: renamed from: c */
        public InterfaceC11812a f25806c;

        /* JADX INFO: renamed from: d */
        public InterfaceC11271u f25807d;

        /* JADX INFO: renamed from: e */
        public InterfaceC11812a f25808e;

        @Override // p570g3.InterfaceC11271u
        /* JADX INFO: renamed from: b */
        public final void mo3494b(long j10, long j11, C20708n c20708n, MediaFormat mediaFormat) {
            long j12;
            long j13;
            C20708n c20708n2;
            MediaFormat mediaFormat2;
            InterfaceC11271u interfaceC11271u = this.f25807d;
            if (interfaceC11271u != null) {
                interfaceC11271u.mo3494b(j10, j11, c20708n, mediaFormat);
                mediaFormat2 = mediaFormat;
                c20708n2 = c20708n;
                j13 = j11;
                j12 = j10;
            } else {
                j12 = j10;
                j13 = j11;
                c20708n2 = c20708n;
                mediaFormat2 = mediaFormat;
            }
            InterfaceC11271u interfaceC11271u2 = this.f25805b;
            if (interfaceC11271u2 != null) {
                interfaceC11271u2.mo3494b(j12, j13, c20708n2, mediaFormat2);
            }
        }

        @Override // androidx.media3.exoplayer.C7780m.b
        public final void handleMessage(int i10, Object obj) {
            if (i10 == 7) {
                this.f25805b = (InterfaceC11271u) obj;
                return;
            }
            if (i10 == 8) {
                this.f25806c = (InterfaceC11812a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            C11823l c11823l = (C11823l) obj;
            if (c11823l == null) {
                this.f25807d = null;
                this.f25808e = null;
            } else {
                this.f25807d = c11823l.getVideoFrameMetadataListener();
                this.f25808e = c11823l.getCameraMotionListener();
            }
        }

        @Override // p582h3.InterfaceC11812a
        public final void onCameraMotion(long j10, float[] fArr) {
            InterfaceC11812a interfaceC11812a = this.f25808e;
            if (interfaceC11812a != null) {
                interfaceC11812a.onCameraMotion(j10, fArr);
            }
            InterfaceC11812a interfaceC11812a2 = this.f25806c;
            if (interfaceC11812a2 != null) {
                interfaceC11812a2.onCameraMotion(j10, fArr);
            }
        }

        @Override // p582h3.InterfaceC11812a
        public final void onCameraMotionReset() {
            InterfaceC11812a interfaceC11812a = this.f25808e;
            if (interfaceC11812a != null) {
                interfaceC11812a.onCameraMotionReset();
            }
            InterfaceC11812a interfaceC11812a2 = this.f25806c;
            if (interfaceC11812a2 != null) {
                interfaceC11812a2.onCameraMotionReset();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.d$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c implements InterfaceC2797t0 {

        /* JADX INFO: renamed from: a */
        public final Object f25809a;

        /* JADX INFO: renamed from: b */
        public AbstractC20686A f25810b;

        public c(Object obj, C6692w c6692w) {
            this.f25809a = obj;
            this.f25810b = c6692w.f22064o;
        }

        @Override // p183K2.InterfaceC2797t0
        /* JADX INFO: renamed from: a */
        public final AbstractC20686A mo3511a() {
            return this.f25810b;
        }

        @Override // p183K2.InterfaceC2797t0
        public final Object getUid() {
            return this.f25809a;
        }
    }

    static {
        C20712r.m25314a("media3.exoplayer");
    }

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
    @SuppressLint({"HandlerLeak"})
    public C7758d(ExoPlayer.C7753b c7753b) {
        try {
            C0539y.m1073e("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C0513S.f2002a + "]");
            Context context = c7753b.f25680a;
            C0505J c0505j = c7753b.f25681b;
            this.f25775e = context.getApplicationContext();
            c7753b.f25687h.getClass();
            this.f25796s = new C3179Q(c0505j);
            this.f25778f0 = c7753b.f25689j;
            this.f25767Z = c7753b.f25690k;
            this.f25765X = c7753b.f25692m;
            this.f25770b0 = false;
            this.f25746E = c7753b.f25701v;
            a aVar = new a();
            this.f25803z = aVar;
            this.f25742A = new b();
            Handler handler = new Handler(c7753b.f25688i);
            InterfaceC2744R0 interfaceC2744R0 = c7753b.f25682c.get();
            InterfaceC7781n[] interfaceC7781nArrMo3468a = interfaceC2744R0.mo3468a(handler, aVar, aVar, aVar, aVar);
            this.f25779g = interfaceC7781nArrMo3468a;
            C0515a.m1030f(interfaceC7781nArrMo3468a.length > 0);
            this.f25781h = new InterfaceC7781n[interfaceC7781nArrMo3468a.length];
            int i10 = 0;
            while (true) {
                InterfaceC7781n[] interfaceC7781nArr = this.f25781h;
                if (i10 >= interfaceC7781nArr.length) {
                    break;
                }
                interfaceC2744R0.mo3469b(this.f25779g[i10]);
                interfaceC7781nArr[i10] = null;
                i10++;
            }
            AbstractC10331w abstractC10331w = (AbstractC10331w) c7753b.f25684e.get();
            this.f25783i = abstractC10331w;
            this.f25795r = (InterfaceC6695z.a) c7753b.f25683d.get();
            InterfaceC10737c interfaceC10737c = (InterfaceC10737c) c7753b.f25686g.get();
            this.f25798u = interfaceC10737c;
            this.f25794q = c7753b.f25693n;
            C2748T0 c2748t0 = c7753b.f25694o;
            this.f25799v = c7753b.f25696q;
            this.f25800w = c7753b.f25697r;
            this.f25801x = c7753b.f25698s;
            this.f25755N = c7753b.f25695p;
            Looper looper = c7753b.f25688i;
            this.f25797t = looper;
            this.f25802y = c0505j;
            this.f25777f = this;
            this.f25790m = new C0538x<>(looper, c0505j, new C0538x.b() { // from class: K2.K
                @Override // p039C2.C0538x.b
                /* JADX INFO: renamed from: a */
                public final void mo1068a(Object obj, C20707m c20707m) {
                    ((InterfaceC20719y.c) obj).mo3825D(this.f9123b.f25777f, new InterfaceC20719y.b(c20707m));
                }
            });
            CopyOnWriteArraySet<ExoPlayer.InterfaceC7752a> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.f25791n = copyOnWriteArraySet;
            this.f25793p = new ArrayList();
            this.f25756O = new InterfaceC6661b0.a();
            InterfaceC7781n[] interfaceC7781nArr2 = this.f25779g;
            C10332x c10332x = new C10332x(new C2741P0[interfaceC7781nArr2.length], new InterfaceC10325q[interfaceC7781nArr2.length], C20690E.f70936b, null);
            this.f25769b = c10332x;
            this.f25792o = new AbstractC20686A.b();
            C20707m.a aVar2 = new C20707m.a();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int i11 = 0;
            for (int i12 = 20; i11 < i12; i12 = 20) {
                aVar2.m25300a(iArr[i11]);
                i11++;
            }
            if (abstractC10331w instanceof C10322n) {
                aVar2.m25300a(29);
            }
            C20707m c20707mM25301b = aVar2.m25301b();
            this.f25771c = new InterfaceC20719y.a(c20707mM25301b);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i13 = 0; i13 < c20707mM25301b.f71001a.size(); i13++) {
                int iM25299a = c20707mM25301b.m25299a(i13);
                C0515a.m1030f(!false);
                sparseBooleanArray.append(iM25299a, true);
            }
            C0515a.m1030f(!false);
            sparseBooleanArray.append(4, true);
            C0515a.m1030f(!false);
            sparseBooleanArray.append(10, true);
            C0515a.m1030f(!false);
            this.f25757P = new InterfaceC20719y.a(new C20707m(sparseBooleanArray));
            this.f25785j = c0505j.mo926a(looper, null);
            C2732L c2732l = new C2732L(this);
            this.f25787k = c2732l;
            this.f25784i0 = C2731K0.m3436k(c10332x);
            this.f25796s.mo3871r(this, looper);
            final C3193c0 c3193c0 = new C3193c0(c7753b.f25704y);
            C7771e c7771e = new C7771e(this.f25775e, this.f25779g, this.f25781h, abstractC10331w, c10332x, c7753b.f25685f.get(), interfaceC10737c, this.f25748G, this.f25749H, this.f25796s, c2748t0, c7753b.f25699t, c7753b.f25700u, looper, c0505j, c2732l, c3193c0, this.f25742A);
            InterfaceC0535u interfaceC0535u = c7771e.f25985i;
            this.f25789l = c7771e;
            Looper looper2 = c7771e.f25987k;
            this.f25768a0 = 1.0f;
            this.f25748G = 0;
            C20713s c20713s = C20713s.f71153D;
            this.f25758Q = c20713s;
            this.f25782h0 = c20713s;
            this.f25786j0 = -1;
            this.f25772c0 = C0227c.f761c;
            this.f25774d0 = true;
            mo9282h(this.f25796s);
            interfaceC10737c.mo12807g(new Handler(looper), this.f25796s);
            copyOnWriteArraySet.add(this.f25803z);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context2 = this.f25775e;
                final boolean z10 = c7753b.f25702w;
                c0505j.mo926a(c7771e.f25987k, null).mo936h(new Runnable() { // from class: K2.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        boolean z11 = z10;
                        C7758d c7758d = this;
                        C3193c0 c3193c1 = c3193c0;
                        C3189a0 c3189a0M3900p = C3189a0.m3900p(context3);
                        if (c3189a0M3900p == null) {
                            C0539y.m1074f("MediaMetricsService unavailable.");
                            return;
                        }
                        if (z11) {
                            c7758d.f25796s.mo3840S(c3189a0M3900p);
                        }
                        LogSessionId logSessionIdM3912r = c3189a0M3900p.m3912r();
                        synchronized (c3193c1) {
                            C3193c0.a aVar3 = c3193c1.f10368b;
                            aVar3.getClass();
                            aVar3.m3921a(logSessionIdM3912r);
                        }
                    }
                });
            }
            C0521g<Integer> c0521g = new C0521g<>(0, looper2, looper, c0505j, new C0521g.a() { // from class: K2.M
                @Override // p039C2.C0521g.a
                /* JADX INFO: renamed from: a */
                public final void mo1037a(Object obj, Object obj2) {
                    ((Integer) obj).getClass();
                    Integer num = (Integer) obj2;
                    final int iIntValue = num.intValue();
                    C7758d c7758d = this.f9150a;
                    c7758d.m9310y0();
                    c7758d.m9295p0(1, 10, num);
                    c7758d.m9295p0(2, 10, num);
                    c7758d.f25790m.m1066f(21, new C0538x.a() { // from class: K2.Q
                        @Override // p039C2.C0538x.a
                        public final void invoke(Object obj3) {
                            ((InterfaceC20719y.c) obj3).mo3875v(iIntValue);
                        }
                    });
                }
            });
            this.f25747F = c0521g;
            c0521g.m1035a(new Runnable() { // from class: K2.N
                /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Integer, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    C7758d c7758d = this.f9152b;
                    final C0521g<Integer> c0521g2 = c7758d.f25747F;
                    Context context3 = c7758d.f25775e;
                    String str = C0513S.f2002a;
                    final ?? ValueOf = Integer.valueOf(C0033e.m67b(context3).generateAudioSessionId());
                    c0521g2.f2030e = ValueOf;
                    Runnable runnable = new Runnable() { // from class: C2.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0521g c0521g3 = c0521g2;
                            if (c0521g3.f2031f == 0) {
                                c0521g3.m1036b(ValueOf);
                            }
                        }
                    };
                    InterfaceC0535u interfaceC0535u2 = c0521g2.f2027b;
                    if (interfaceC0535u2.getLooper().getThread().isAlive()) {
                        interfaceC0535u2.mo936h(runnable);
                    }
                }
            });
            C7755a c7755a = new C7755a(c7753b.f25680a, looper2, c7753b.f25688i, this.f25803z, c0505j);
            this.f25743B = c7755a;
            c7755a.m9224a();
            C2752V0 c2752v0 = new C2752V0();
            context.getApplicationContext();
            c0505j.mo926a(looper2, null);
            this.f25744C = c2752v0;
            C2754W0 c2754w0 = new C2754W0();
            context.getApplicationContext();
            c0505j.mo926a(looper2, null);
            this.f25745D = c2754w0;
            int i14 = C20704j.f70985e;
            this.f25780g0 = C20694I.f70945d;
            this.f25766Y = C0504I.f1987c;
            interfaceC0535u.mo934f(38, this.f25755N).m942b();
            interfaceC0535u.mo931c(this.f25767Z, 31, c7753b.f25691l ? 1 : 0, 0).m942b();
            m9295p0(1, 3, this.f25767Z);
            m9295p0(2, 4, Integer.valueOf(this.f25765X));
            m9295p0(2, 5, 0);
            m9295p0(1, 9, Boolean.valueOf(this.f25770b0));
            m9295p0(6, 8, this.f25742A);
            m9295p0(-1, 16, Integer.valueOf(this.f25778f0));
        } finally {
            this.f25773d.m1052e();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static long m9254i0(C2731K0 c2731k0) {
        AbstractC20686A.c cVar = new AbstractC20686A.c();
        AbstractC20686A.b bVar = new AbstractC20686A.b();
        c2731k0.f9125a.mo3482g(c2731k0.f9126b.f22080a, bVar);
        long j10 = c2731k0.f9127c;
        return j10 == -9223372036854775807L ? c2731k0.f9125a.mo3485m(bVar.f70864c, cVar, 0L).f70882l : bVar.f70866e + j10;
    }

    /* JADX INFO: renamed from: j0 */
    public static C2731K0 m9255j0(C2731K0 c2731k0, int i10) {
        C2731K0 c2731k0M3444h = c2731k0.m3444h(i10);
        return (i10 == 1 || i10 == 4) ? c2731k0M3444h.m3438b(false) : c2731k0M3444h;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: A */
    public final void mo9256A(final boolean z10) {
        m9310y0();
        if (this.f25749H != z10) {
            this.f25749H = z10;
            this.f25789l.f25985i.mo935g(12, z10 ? 1 : 0, 0).m942b();
            C0538x.a<InterfaceC20719y.c> aVar = new C0538x.a() { // from class: K2.J
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj) {
                    ((InterfaceC20719y.c) obj).mo3822A(z10);
                }
            };
            C0538x<InterfaceC20719y.c> c0538x = this.f25790m;
            c0538x.m1063c(9, aVar);
            m9304u0();
            c0538x.m1062b();
        }
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: B */
    public final long mo9257B() {
        m9310y0();
        return this.f25801x;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: C */
    public final void mo9258C() {
        boolean z10;
        int i10;
        Pair<Object, Long> pairM9287l0;
        m9310y0();
        ArrayList arrayList = this.f25793p;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        C2731K0 c2731k0 = this.f25784i0;
        int iM9283h0 = m9283h0(c2731k0);
        long jM9280f0 = m9280f0(c2731k0);
        AbstractC20686A abstractC20686A = c2731k0.f9125a;
        int size2 = arrayList.size();
        this.f25750I++;
        for (int i11 = iMin - 1; i11 >= 0; i11--) {
            arrayList.remove(i11);
        }
        this.f25756O = this.f25756O.mo7527a(iMin);
        C2737N0 c2737n0 = new C2737N0(arrayList, this.f25756O);
        if (abstractC20686A.m25225p() || c2737n0.m25225p()) {
            z10 = true;
            i10 = 0;
            boolean z11 = !abstractC20686A.m25225p() && c2737n0.m25225p();
            int i12 = z11 ? -1 : iM9283h0;
            if (z11) {
                jM9280f0 = -9223372036854775807L;
            }
            pairM9287l0 = m9287l0(c2737n0, i12, jM9280f0);
        } else {
            Pair<Object, Long> pairM25222i = abstractC20686A.m25222i(this.f70971a, this.f25792o, iM9283h0, C0513S.m982T(jM9280f0));
            Object obj = pairM25222i.first;
            if (c2737n0.mo3479b(obj) != -1) {
                pairM9287l0 = pairM25222i;
                z10 = true;
            } else {
                z10 = true;
                int iM9358T = C7771e.m9358T(this.f70971a, this.f25792o, this.f25748G, this.f25749H, obj, abstractC20686A, c2737n0);
                if (iM9358T != -1) {
                    AbstractC20686A.c cVar = this.f70971a;
                    c2737n0.mo3485m(iM9358T, cVar, 0L);
                    pairM9287l0 = m9287l0(c2737n0, iM9358T, C0513S.m1002g0(cVar.f70882l));
                } else {
                    pairM9287l0 = m9287l0(c2737n0, -1, -9223372036854775807L);
                }
            }
            i10 = 0;
        }
        C2731K0 c2731k0M9285k0 = m9285k0(c2731k0, c2737n0, pairM9287l0);
        int i13 = c2731k0M9285k0.f9129e;
        if (i13 != z10 && i13 != 4 && iMin > 0 && iMin == size2 && iM9283h0 >= c2731k0M9285k0.f9125a.mo3453o()) {
            c2731k0M9285k0 = m9255j0(c2731k0M9285k0, 4);
        }
        this.f25789l.f25985i.mo931c(this.f25756O, 20, i10, iMin).m942b();
        m9307w0(c2731k0M9285k0, 0, c2731k0M9285k0.f9126b.f22080a.equals(this.f25784i0.f9126b.f22080a) ^ z10, 4, m9281g0(c2731k0M9285k0), -1, false);
    }

    @Override // p884z2.AbstractC20700f, p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: E */
    public final int mo9259E() {
        m9310y0();
        if (this.f25784i0.f9125a.m25225p()) {
            return 0;
        }
        C2731K0 c2731k0 = this.f25784i0;
        return c2731k0.f9125a.mo3479b(c2731k0.f9126b.f22080a);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: F */
    public final void mo9260F(InterfaceC20719y.c cVar) {
        m9310y0();
        cVar.getClass();
        this.f25790m.m1065e(cVar);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: G */
    public final void mo9261G(TextureView textureView) {
        m9310y0();
        if (textureView == null || textureView != this.f25764W) {
            return;
        }
        m9277d0();
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: H */
    public final C20694I mo9262H() {
        m9310y0();
        return this.f25780g0;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: I */
    public final int mo9263I() {
        m9310y0();
        if (isPlayingAd()) {
            return this.f25784i0.f9126b.f22082c;
        }
        return -1;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: J */
    public final long mo9264J() {
        m9310y0();
        return this.f25800w;
    }

    @Override // p884z2.AbstractC20700f, p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: K */
    public final long mo9265K() {
        m9310y0();
        return m9280f0(this.f25784i0);
    }

    @Override // p884z2.AbstractC20700f, p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: L */
    public final long mo9266L() {
        m9310y0();
        if (!isPlayingAd()) {
            return mo9270P();
        }
        C2731K0 c2731k0 = this.f25784i0;
        return c2731k0.f9135k.equals(c2731k0.f9126b) ? C0513S.m1002g0(this.f25784i0.f9141q) : getDuration();
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: M */
    public final void mo9267M(final C20689D c20689d) {
        C20689D c20689dMo12461b;
        m9310y0();
        AbstractC10331w abstractC10331w = this.f25783i;
        abstractC10331w.getClass();
        if (abstractC10331w instanceof C10322n) {
            C20689D c20689dMo9303u = mo9303u();
            if (this.f25753L) {
                this.f25754M = c20689d.f70914t;
                AbstractC2485E<Integer> abstractC2485E = this.f25755N.f9175a;
                C20689D.b bVarMo12459a = c20689d.mo12459a();
                AbstractC2517f0<Integer> abstractC2517f0Mo3212j = abstractC2485E.iterator();
                while (abstractC2517f0Mo3212j.hasNext()) {
                    bVarMo12459a.mo12469k(abstractC2517f0Mo3212j.next().intValue(), true);
                }
                c20689dMo12461b = bVarMo12459a.mo12461b();
            } else {
                c20689dMo12461b = c20689d;
            }
            if (!c20689dMo12461b.equals(abstractC10331w.mo12448a())) {
                abstractC10331w.mo12452g(c20689dMo12461b);
            }
            if (c20689dMo9303u.equals(c20689d)) {
                return;
            }
            this.f25790m.m1066f(19, new C0538x.a() { // from class: K2.O
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj) {
                    ((InterfaceC20719y.c) obj).mo3836O(c20689d);
                }
            });
        }
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: N */
    public final int mo9268N() {
        m9310y0();
        int iM9283h0 = m9283h0(this.f25784i0);
        if (iM9283h0 == -1) {
            return 0;
        }
        return iM9283h0;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: O */
    public final boolean mo9269O() {
        m9310y0();
        return this.f25749H;
    }

    @Override // p884z2.AbstractC20700f, p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: P */
    public final long mo9270P() {
        m9310y0();
        if (this.f25784i0.f9125a.m25225p()) {
            return this.f25788k0;
        }
        C2731K0 c2731k0 = this.f25784i0;
        if (c2731k0.f9135k.f22083d != c2731k0.f9126b.f22083d) {
            return C0513S.m1002g0(c2731k0.f9125a.mo3485m(mo9268N(), this.f70971a, 0L).f70883m);
        }
        long j10 = c2731k0.f9141q;
        if (this.f25784i0.f9135k.m7559b()) {
            C2731K0 c2731k1 = this.f25784i0;
            AbstractC20686A.b bVarMo3482g = c2731k1.f9125a.mo3482g(c2731k1.f9135k.f22080a, this.f25792o);
            long jM25227b = bVarMo3482g.m25227b(this.f25784i0.f9135k.f22081b);
            j10 = jM25227b == Long.MIN_VALUE ? bVarMo3482g.f70865d : jM25227b;
        }
        C2731K0 c2731k2 = this.f25784i0;
        AbstractC20686A abstractC20686A = c2731k2.f9125a;
        Object obj = c2731k2.f9135k.f22080a;
        AbstractC20686A.b bVar = this.f25792o;
        abstractC20686A.mo3482g(obj, bVar);
        return C0513S.m1002g0(j10 + bVar.f70866e);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: Q */
    public final C20713s mo9271Q() {
        m9310y0();
        return this.f25758Q;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: R */
    public final void mo9218R(InterfaceC6695z interfaceC6695z) {
        m9310y0();
        List<InterfaceC6695z> listSingletonList = Collections.singletonList(interfaceC6695z);
        m9310y0();
        m9310y0();
        m9296q0(listSingletonList, -1, -9223372036854775807L, true);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: S */
    public final long mo9272S() {
        m9310y0();
        return this.f25799v;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: a */
    public final long mo9273a() {
        m9310y0();
        return C0513S.m1002g0(this.f25784i0.f9142r);
    }

    @Override // p884z2.AbstractC20700f
    /* JADX INFO: renamed from: a0 */
    public final void mo9274a0(int i10, long j10, boolean z10) {
        m9310y0();
        if (i10 == -1) {
            return;
        }
        C0515a.m1025a(i10 >= 0);
        AbstractC20686A abstractC20686A = this.f25784i0.f9125a;
        if (abstractC20686A.m25225p() || i10 < abstractC20686A.mo3453o()) {
            this.f25796s.mo3878y();
            this.f25750I++;
            if (isPlayingAd()) {
                C0539y.m1074f("seekTo ignored because an ad is playing");
                C7771e.e eVar = new C7771e.e(this.f25784i0);
                eVar.m9436a(1);
                C7758d c7758d = this.f25787k.f9145a;
                c7758d.f25785j.mo936h(new RunnableC2722G(0, c7758d, eVar));
                return;
            }
            C2731K0 c2731k0M3444h = this.f25784i0;
            int i11 = c2731k0M3444h.f9129e;
            if (i11 == 3 || (i11 == 4 && !abstractC20686A.m25225p())) {
                c2731k0M3444h = this.f25784i0.m3444h(2);
            }
            int iMo9268N = mo9268N();
            C2731K0 c2731k0M9285k0 = m9285k0(c2731k0M3444h, abstractC20686A, m9287l0(abstractC20686A, i10, j10));
            this.f25789l.f25985i.mo934f(3, new C7771e.g(abstractC20686A, i10, C0513S.m982T(j10))).m942b();
            m9307w0(c2731k0M9285k0, 0, true, 1, m9281g0(c2731k0M9285k0), iMo9268N, z10);
        }
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: b */
    public final void mo9275b(C20718x c20718x) {
        m9310y0();
        if (this.f25784i0.f9139o.equals(c20718x)) {
            return;
        }
        C2731K0 c2731k0M3443g = this.f25784i0.m3443g(c20718x);
        this.f25750I++;
        this.f25789l.f25985i.mo934f(4, c20718x).m942b();
        m9307w0(c2731k0M3443g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: c0 */
    public final C20713s m9276c0() {
        AbstractC20686A abstractC20686AMo9299s = mo9299s();
        if (abstractC20686AMo9299s.m25225p()) {
            return this.f25782h0;
        }
        C20711q c20711q = abstractC20686AMo9299s.mo3485m(mo9268N(), this.f70971a, 0L).f70873c;
        C20713s.a aVarM25315a = this.f25782h0.m25315a();
        C20713s c20713s = c20711q.f71092d;
        if (c20713s != null) {
            AbstractC2481A<String> abstractC2481A = c20713s.f71156C;
            byte[] bArr = c20713s.f71163g;
            CharSequence charSequence = c20713s.f71157a;
            if (charSequence != null) {
                aVarM25315a.f71185a = charSequence;
            }
            CharSequence charSequence2 = c20713s.f71158b;
            if (charSequence2 != null) {
                aVarM25315a.f71186b = charSequence2;
            }
            CharSequence charSequence3 = c20713s.f71159c;
            if (charSequence3 != null) {
                aVarM25315a.f71187c = charSequence3;
            }
            CharSequence charSequence4 = c20713s.f71160d;
            if (charSequence4 != null) {
                aVarM25315a.f71188d = charSequence4;
            }
            String str = c20713s.f71161e;
            if (str != null) {
                aVarM25315a.f71189e = str;
            }
            CharSequence charSequence5 = c20713s.f71162f;
            if (charSequence5 != null) {
                aVarM25315a.f71190f = charSequence5;
            }
            Uri uri = c20713s.f71165i;
            if (uri != null || bArr != null) {
                aVarM25315a.f71193i = uri;
                Integer num = c20713s.f71164h;
                aVarM25315a.f71191g = bArr == null ? null : (byte[]) bArr.clone();
                aVarM25315a.f71192h = num;
            }
            Integer num2 = c20713s.f71166j;
            if (num2 != null) {
                aVarM25315a.f71194j = num2;
            }
            Integer num3 = c20713s.f71167k;
            if (num3 != null) {
                aVarM25315a.f71195k = num3;
            }
            Integer num4 = c20713s.f71168l;
            if (num4 != null) {
                aVarM25315a.f71196l = num4;
            }
            Boolean bool = c20713s.f71169m;
            if (bool != null) {
                aVarM25315a.f71197m = bool;
            }
            Integer num5 = c20713s.f71170n;
            if (num5 != null) {
                aVarM25315a.f71198n = num5;
            }
            Integer num6 = c20713s.f71171o;
            if (num6 != null) {
                aVarM25315a.f71198n = num6;
            }
            Integer num7 = c20713s.f71172p;
            if (num7 != null) {
                aVarM25315a.f71199o = num7;
            }
            Integer num8 = c20713s.f71173q;
            if (num8 != null) {
                aVarM25315a.f71200p = num8;
            }
            Integer num9 = c20713s.f71174r;
            if (num9 != null) {
                aVarM25315a.f71201q = num9;
            }
            Integer num10 = c20713s.f71175s;
            if (num10 != null) {
                aVarM25315a.f71202r = num10;
            }
            Integer num11 = c20713s.f71176t;
            if (num11 != null) {
                aVarM25315a.f71203s = num11;
            }
            CharSequence charSequence6 = c20713s.f71177u;
            if (charSequence6 != null) {
                aVarM25315a.f71204t = charSequence6;
            }
            CharSequence charSequence7 = c20713s.f71178v;
            if (charSequence7 != null) {
                aVarM25315a.f71205u = charSequence7;
            }
            CharSequence charSequence8 = c20713s.f71179w;
            if (charSequence8 != null) {
                aVarM25315a.f71206v = charSequence8;
            }
            Integer num12 = c20713s.f71180x;
            if (num12 != null) {
                aVarM25315a.f71207w = num12;
            }
            Integer num13 = c20713s.f71181y;
            if (num13 != null) {
                aVarM25315a.f71208x = num13;
            }
            CharSequence charSequence9 = c20713s.f71182z;
            if (charSequence9 != null) {
                aVarM25315a.f71209y = charSequence9;
            }
            CharSequence charSequence10 = c20713s.f71154A;
            if (charSequence10 != null) {
                aVarM25315a.f71210z = charSequence10;
            }
            Integer num14 = c20713s.f71155B;
            if (num14 != null) {
                aVarM25315a.f71183A = num14;
            }
            if (!abstractC2481A.isEmpty()) {
                aVarM25315a.f71184B = AbstractC2481A.m3204n(abstractC2481A);
            }
        }
        return new C20713s(aVarM25315a);
    }

    @Override // p884z2.InterfaceC20719y
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        m9310y0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m9310y0();
        if (holder == null || holder != this.f25761T) {
            return;
        }
        m9277d0();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9277d0() {
        m9310y0();
        m9293o0();
        m9300s0(null);
        m9289m0(0, 0);
    }

    /* JADX INFO: renamed from: e0 */
    public final C7780m m9278e0(C7780m.b bVar) {
        int iM9283h0 = m9283h0(this.f25784i0);
        AbstractC20686A abstractC20686A = this.f25784i0.f9125a;
        int i10 = iM9283h0 == -1 ? 0 : iM9283h0;
        C0505J c0505j = this.f25802y;
        C7771e c7771e = this.f25789l;
        return new C7780m(c7771e, bVar, abstractC20686A, i10, c0505j, c7771e.f25987k);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: f */
    public final int mo9279f() {
        m9310y0();
        return this.f25784i0.f9129e;
    }

    /* JADX INFO: renamed from: f0 */
    public final long m9280f0(C2731K0 c2731k0) {
        InterfaceC6695z.b bVar = c2731k0.f9126b;
        long j10 = c2731k0.f9127c;
        AbstractC20686A abstractC20686A = c2731k0.f9125a;
        if (!bVar.m7559b()) {
            return C0513S.m1002g0(m9281g0(c2731k0));
        }
        Object obj = c2731k0.f9126b.f22080a;
        AbstractC20686A.b bVar2 = this.f25792o;
        abstractC20686A.mo3482g(obj, bVar2);
        if (j10 == -9223372036854775807L) {
            return C0513S.m1002g0(abstractC20686A.mo3485m(m9283h0(c2731k0), this.f70971a, 0L).f70882l);
        }
        return C0513S.m1002g0(j10) + C0513S.m1002g0(bVar2.f70866e);
    }

    /* JADX INFO: renamed from: g0 */
    public final long m9281g0(C2731K0 c2731k0) {
        if (c2731k0.f9125a.m25225p()) {
            return C0513S.m982T(this.f25788k0);
        }
        long jM3447l = c2731k0.f9140p ? c2731k0.m3447l() : c2731k0.f9143s;
        if (c2731k0.f9126b.m7559b()) {
            return jM3447l;
        }
        AbstractC20686A abstractC20686A = c2731k0.f9125a;
        Object obj = c2731k0.f9126b.f22080a;
        AbstractC20686A.b bVar = this.f25792o;
        abstractC20686A.mo3482g(obj, bVar);
        return jM3447l + bVar.f70866e;
    }

    @Override // p884z2.InterfaceC20719y
    public final long getCurrentPosition() {
        m9310y0();
        return C0513S.m1002g0(m9281g0(this.f25784i0));
    }

    @Override // p884z2.AbstractC20700f, p884z2.InterfaceC20719y
    public final long getDuration() {
        m9310y0();
        if (!isPlayingAd()) {
            return mo25271D();
        }
        C2731K0 c2731k0 = this.f25784i0;
        InterfaceC6695z.b bVar = c2731k0.f9126b;
        AbstractC20686A abstractC20686A = c2731k0.f9125a;
        Object obj = bVar.f22080a;
        AbstractC20686A.b bVar2 = this.f25792o;
        abstractC20686A.mo3482g(obj, bVar2);
        return C0513S.m1002g0(bVar2.m25226a(bVar.f22081b, bVar.f22082c));
    }

    @Override // p884z2.InterfaceC20719y
    public final C20718x getPlaybackParameters() {
        m9310y0();
        return this.f25784i0.f9139o;
    }

    @Override // p884z2.InterfaceC20719y
    public final float getVolume() {
        m9310y0();
        return this.f25768a0;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: h */
    public final void mo9282h(InterfaceC20719y.c cVar) {
        cVar.getClass();
        this.f25790m.m1061a(cVar);
    }

    /* JADX INFO: renamed from: h0 */
    public final int m9283h0(C2731K0 c2731k0) {
        return c2731k0.f9125a.m25225p() ? this.f25786j0 : c2731k0.f9125a.mo3482g(c2731k0.f9126b.f22080a, this.f25792o).f70864c;
    }

    @Override // p884z2.InterfaceC20719y
    public final boolean isPlayingAd() {
        m9310y0();
        return this.f25784i0.f9126b.m7559b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        m9310y0();
        return this.f25753L;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: k */
    public final void mo9284k(final int i10) {
        m9310y0();
        if (this.f25748G != i10) {
            this.f25748G = i10;
            this.f25789l.f25985i.mo935g(11, i10, 0).m942b();
            C0538x.a<InterfaceC20719y.c> aVar = new C0538x.a() { // from class: K2.I
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj) {
                    ((InterfaceC20719y.c) obj).mo3849a0(i10);
                }
            };
            C0538x<InterfaceC20719y.c> c0538x = this.f25790m;
            c0538x.m1063c(8, aVar);
            m9304u0();
            c0538x.m1062b();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final C2731K0 m9285k0(C2731K0 c2731k0, AbstractC20686A abstractC20686A, Pair<Object, Long> pair) {
        List<C20714t> list;
        C0515a.m1025a(abstractC20686A.m25225p() || pair != null);
        AbstractC20686A abstractC20686A2 = c2731k0.f9125a;
        long jM9280f0 = m9280f0(c2731k0);
        C2731K0 c2731k0M3446j = c2731k0.m3446j(abstractC20686A);
        if (abstractC20686A.m25225p()) {
            InterfaceC6695z.b bVar = C2731K0.f9124u;
            long jM982T = C0513S.m982T(this.f25788k0);
            C2731K0 c2731k0M3439c = c2731k0M3446j.m3440d(bVar, jM982T, jM982T, jM982T, 0L, C6677j0.f22008d, this.f25769b, C2500U.f8330f).m3439c(bVar);
            c2731k0M3439c.f9141q = c2731k0M3439c.f9143s;
            return c2731k0M3439c;
        }
        Object obj = c2731k0M3446j.f9126b.f22080a;
        boolean zEquals = obj.equals(pair.first);
        InterfaceC6695z.b bVar2 = !zEquals ? new InterfaceC6695z.b(pair.first) : c2731k0M3446j.f9126b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM982T2 = C0513S.m982T(jM9280f0);
        if (!abstractC20686A2.m25225p()) {
            jM982T2 -= abstractC20686A2.mo3482g(obj, this.f25792o).f70866e;
        }
        if (!zEquals || jLongValue < jM982T2) {
            InterfaceC6695z.b bVar3 = bVar2;
            C0515a.m1030f(!bVar3.m7559b());
            C6677j0 c6677j0 = !zEquals ? C6677j0.f22008d : c2731k0M3446j.f9132h;
            C10332x c10332x = !zEquals ? this.f25769b : c2731k0M3446j.f9133i;
            if (zEquals) {
                list = c2731k0M3446j.f9134j;
            } else {
                AbstractC2481A.b bVar4 = AbstractC2481A.f8293c;
                list = C2500U.f8330f;
            }
            C2731K0 c2731k0M3439c2 = c2731k0M3446j.m3440d(bVar3, jLongValue, jLongValue, jLongValue, 0L, c6677j0, c10332x, list).m3439c(bVar3);
            c2731k0M3439c2.f9141q = jLongValue;
            return c2731k0M3439c2;
        }
        if (jLongValue != jM982T2) {
            InterfaceC6695z.b bVar5 = bVar2;
            C0515a.m1030f(!bVar5.m7559b());
            long jMax = Math.max(0L, c2731k0M3446j.f9142r - (jLongValue - jM982T2));
            long j10 = c2731k0M3446j.f9141q;
            if (c2731k0M3446j.f9135k.equals(c2731k0M3446j.f9126b)) {
                j10 = jLongValue + jMax;
            }
            C2731K0 c2731k0M3440d = c2731k0M3446j.m3440d(bVar5, jLongValue, jLongValue, jLongValue, jMax, c2731k0M3446j.f9132h, c2731k0M3446j.f9133i, c2731k0M3446j.f9134j);
            c2731k0M3440d.f9141q = j10;
            return c2731k0M3440d;
        }
        int iMo3479b = abstractC20686A.mo3479b(c2731k0M3446j.f9135k.f22080a);
        if (iMo3479b != -1 && abstractC20686A.mo3451f(iMo3479b, this.f25792o, false).f70864c == abstractC20686A.mo3482g(bVar2.f22080a, this.f25792o).f70864c) {
            return c2731k0M3446j;
        }
        abstractC20686A.mo3482g(bVar2.f22080a, this.f25792o);
        long jM25226a = bVar2.m7559b() ? this.f25792o.m25226a(bVar2.f22081b, bVar2.f22082c) : this.f25792o.f70865d;
        InterfaceC6695z.b bVar6 = bVar2;
        C2731K0 c2731k0M3439c3 = c2731k0M3446j.m3440d(bVar6, c2731k0M3446j.f9143s, c2731k0M3446j.f9143s, c2731k0M3446j.f9128d, jM25226a - c2731k0M3446j.f9143s, c2731k0M3446j.f9132h, c2731k0M3446j.f9133i, c2731k0M3446j.f9134j).m3439c(bVar6);
        c2731k0M3439c3.f9141q = jM25226a;
        return c2731k0M3439c3;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: l */
    public final C20717w mo9286l() {
        m9310y0();
        return this.f25784i0.f9130f;
    }

    /* JADX INFO: renamed from: l0 */
    public final Pair<Object, Long> m9287l0(AbstractC20686A abstractC20686A, int i10, long j10) {
        if (abstractC20686A.m25225p()) {
            this.f25786j0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f25788k0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= abstractC20686A.mo3453o()) {
            i10 = abstractC20686A.mo3478a(this.f25749H);
            j10 = C0513S.m1002g0(abstractC20686A.mo3485m(i10, this.f70971a, 0L).f70882l);
        }
        return abstractC20686A.m25222i(this.f70971a, this.f25792o, i10, C0513S.m982T(j10));
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: m */
    public final int mo9288m() {
        m9310y0();
        return this.f25748G;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m9289m0(final int i10, final int i11) {
        C0504I c0504i = this.f25766Y;
        if (i10 == c0504i.f1988a && i11 == c0504i.f1989b) {
            return;
        }
        this.f25766Y = new C0504I(i10, i11);
        this.f25790m.m1066f(24, new C0538x.a() { // from class: K2.F
            @Override // p039C2.C0538x.a
            public final void invoke(Object obj) {
                ((InterfaceC20719y.c) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        m9295p0(2, 14, new C0504I(i10, i11));
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: n */
    public final C20690E mo9290n() {
        m9310y0();
        return this.f25784i0.f9133i.f32014d;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m9291n0() {
        String str;
        boolean zM1050c;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [AndroidXMedia3/1.8.0] [");
        sb2.append(C0513S.f2002a);
        sb2.append("] [");
        HashSet<String> hashSet = C20712r.f71151a;
        synchronized (C20712r.class) {
            str = C20712r.f71152b;
        }
        sb2.append(str);
        sb2.append("]");
        C0539y.m1073e(sb2.toString());
        m9310y0();
        this.f25743B.m9224a();
        this.f25744C.m3475a(false);
        this.f25745D.m3476a(false);
        C7771e c7771e = this.f25789l;
        if (c7771e.f25955J || !c7771e.f25987k.getThread().isAlive()) {
            zM1050c = true;
        } else {
            c7771e.f25955J = true;
            C0529o c0529o = new C0529o(c7771e.f25994r);
            c7771e.f25985i.mo934f(7, c0529o).m942b();
            zM1050c = c0529o.m1050c(c7771e.f25999w);
        }
        if (!zM1050c) {
            this.f25790m.m1066f(10, new C2724H());
        }
        this.f25790m.m1064d();
        this.f25785j.mo933e();
        this.f25798u.mo12805d(this.f25796s);
        C2731K0 c2731k0 = this.f25784i0;
        if (c2731k0.f9140p) {
            this.f25784i0 = c2731k0.m3437a();
        }
        C2731K0 c2731k0M9255j0 = m9255j0(this.f25784i0, 1);
        this.f25784i0 = c2731k0M9255j0;
        C2731K0 c2731k0M3439c = c2731k0M9255j0.m3439c(c2731k0M9255j0.f9126b);
        this.f25784i0 = c2731k0M3439c;
        c2731k0M3439c.f9141q = c2731k0M3439c.f9143s;
        this.f25784i0.f9142r = 0L;
        this.f25796s.release();
        m9293o0();
        Surface surface = this.f25760S;
        if (surface != null) {
            surface.release();
            this.f25760S = null;
        }
        this.f25772c0 = C0227c.f761c;
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: o */
    public final C0227c mo9292o() {
        m9310y0();
        return this.f25772c0;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m9293o0() {
        C11823l c11823l = this.f25762U;
        a aVar = this.f25803z;
        if (c11823l != null) {
            C7780m c7780mM9278e0 = m9278e0(this.f25742A);
            C0515a.m1030f(!c7780mM9278e0.f26135f);
            c7780mM9278e0.f26132c = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
            C0515a.m1030f(!c7780mM9278e0.f26135f);
            c7780mM9278e0.f26133d = null;
            c7780mM9278e0.m9473b();
            this.f25762U.f37135b.remove(aVar);
            this.f25762U = null;
        }
        TextureView textureView = this.f25764W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != aVar) {
                C0539y.m1074f("SurfaceTextureListener already unset or replaced.");
            } else {
                this.f25764W.setSurfaceTextureListener(null);
            }
            this.f25764W = null;
        }
        SurfaceHolder surfaceHolder = this.f25761T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(aVar);
            this.f25761T = null;
        }
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: p */
    public final int mo9294p() {
        m9310y0();
        if (isPlayingAd()) {
            return this.f25784i0.f9126b.f22081b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m9295p0(int i10, int i11, Object obj) {
        for (InterfaceC7781n interfaceC7781n : this.f25779g) {
            if (i10 == -1 || interfaceC7781n.mo9232m() == i10) {
                C7780m c7780mM9278e0 = m9278e0(interfaceC7781n);
                C0515a.m1030f(!c7780mM9278e0.f26135f);
                c7780mM9278e0.f26132c = i11;
                C0515a.m1030f(!c7780mM9278e0.f26135f);
                c7780mM9278e0.f26133d = obj;
                c7780mM9278e0.m9473b();
            }
        }
        for (InterfaceC7781n interfaceC7781n2 : this.f25781h) {
            if (interfaceC7781n2 != null && (i10 == -1 || interfaceC7781n2.mo9232m() == i10)) {
                C7780m c7780mM9278e1 = m9278e0(interfaceC7781n2);
                C0515a.m1030f(!c7780mM9278e1.f26135f);
                c7780mM9278e1.f26132c = i11;
                C0515a.m1030f(!c7780mM9278e1.f26135f);
                c7780mM9278e1.f26133d = obj;
                c7780mM9278e1.m9473b();
            }
        }
    }

    @Override // p884z2.InterfaceC20719y
    public final void prepare() {
        m9310y0();
        C2731K0 c2731k0 = this.f25784i0;
        if (c2731k0.f9129e != 1) {
            return;
        }
        C2731K0 c2731k0M3442f = c2731k0.m3442f(null);
        C2731K0 c2731k0M9255j0 = m9255j0(c2731k0M3442f, c2731k0M3442f.f9125a.m25225p() ? 4 : 2);
        this.f25750I++;
        this.f25789l.f25985i.mo932d(29).m942b();
        m9307w0(c2731k0M9255j0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX INFO: renamed from: q0 */
    public final void m9296q0(List<InterfaceC6695z> list, int i10, long j10, boolean z10) {
        long j11;
        int i11;
        int i12;
        C2731K0 c2731k0M9255j0;
        boolean z11;
        int iMo3478a = i10;
        int iM9283h0 = m9283h0(this.f25784i0);
        long currentPosition = getCurrentPosition();
        this.f25750I++;
        ArrayList arrayList = this.f25793p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i13 = size - 1; i13 >= 0; i13--) {
                arrayList.remove(i13);
            }
            this.f25756O = this.f25756O.mo7527a(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            C7775i.c cVar = new C7775i.c(list.get(i14), this.f25794q);
            arrayList2.add(cVar);
            arrayList.add(i14, new c(cVar.f26093b, cVar.f26092a));
        }
        this.f25756O = this.f25756O.mo7533g(arrayList2.size());
        C2737N0 c2737n0 = new C2737N0(arrayList, this.f25756O);
        boolean zM25225p = c2737n0.m25225p();
        int i15 = c2737n0.f9153e;
        if (!zM25225p && iMo3478a >= i15) {
            throw new C20709o();
        }
        if (!z10) {
            if (iMo3478a == -1) {
                i11 = iM9283h0;
                j11 = currentPosition;
            } else {
                j11 = j10;
            }
            C2731K0 c2731k0M9285k0 = m9285k0(this.f25784i0, c2737n0, m9287l0(c2737n0, i11, j11));
            i12 = c2731k0M9285k0.f9129e;
            if (i11 != -1 && i12 != 1) {
                if (!c2737n0.m25225p() || i11 >= i15) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
            }
            c2731k0M9255j0 = m9255j0(c2731k0M9285k0, i12);
            this.f25789l.f25985i.mo934f(17, new C7771e.b(arrayList2, this.f25756O, i11, C0513S.m982T(j11))).m942b();
            if (!this.f25784i0.f9126b.f22080a.equals(c2731k0M9255j0.f9126b.f22080a) || this.f25784i0.f9125a.m25225p()) {
                z11 = false;
            } else {
                z11 = true;
            }
            m9307w0(c2731k0M9255j0, 0, z11, 4, m9281g0(c2731k0M9255j0), -1, false);
        }
        iMo3478a = c2737n0.mo3478a(this.f25749H);
        j11 = -9223372036854775807L;
        i11 = iMo3478a;
        C2731K0 c2731k0M9285k1 = m9285k0(this.f25784i0, c2737n0, m9287l0(c2737n0, i11, j11));
        i12 = c2731k0M9285k1.f9129e;
        if (i11 != -1) {
            if (c2737n0.m25225p()) {
                i12 = 4;
            } else {
                i12 = 4;
            }
        }
        c2731k0M9255j0 = m9255j0(c2731k0M9285k1, i12);
        this.f25789l.f25985i.mo934f(17, new C7771e.b(arrayList2, this.f25756O, i11, C0513S.m982T(j11))).m942b();
        if (this.f25784i0.f9126b.f22080a.equals(c2731k0M9255j0.f9126b.f22080a)) {
            z11 = false;
        } else {
            z11 = false;
        }
        m9307w0(c2731k0M9255j0, 0, z11, 4, m9281g0(c2731k0M9255j0), -1, false);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: r */
    public final int mo9297r() {
        m9310y0();
        return this.f25784i0.f9138n;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m9298r0(SurfaceHolder surfaceHolder) {
        this.f25763V = false;
        this.f25761T = surfaceHolder;
        surfaceHolder.addCallback(this.f25803z);
        Surface surface = this.f25761T.getSurface();
        if (surface == null || !surface.isValid()) {
            m9289m0(0, 0);
        } else {
            Rect surfaceFrame = this.f25761T.getSurfaceFrame();
            m9289m0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: s */
    public final AbstractC20686A mo9299s() {
        m9310y0();
        return this.f25784i0.f9125a;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m9300s0(Object obj) {
        Object obj2 = this.f25759R;
        boolean zM1050c = true;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        long j10 = z10 ? this.f25746E : -9223372036854775807L;
        C7771e c7771e = this.f25789l;
        if (!c7771e.f25955J && c7771e.f25987k.getThread().isAlive()) {
            C0529o c0529o = new C0529o(c7771e.f25994r);
            c7771e.f25985i.mo934f(30, new Pair(obj, c0529o)).m942b();
            if (j10 != -9223372036854775807L) {
                zM1050c = c0529o.m1050c(j10);
            }
        }
        if (z10) {
            Object obj3 = this.f25759R;
            Surface surface = this.f25760S;
            if (obj3 == surface) {
                surface.release();
                this.f25760S = null;
            }
        }
        this.f25759R = obj;
        if (zM1050c) {
            return;
        }
        m9302t0(new C2784n(2, new C2783m0("Detaching surface timed out."), 1003));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m9310y0();
        m9295p0(4, 15, imageOutput);
    }

    @Override // p884z2.InterfaceC20719y
    public final void setPlayWhenReady(boolean z10) {
        m9310y0();
        m9305v0(1, z10);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z10) {
        C20689D c20689dMo12461b;
        m9310y0();
        if (z10 == this.f25753L) {
            return;
        }
        this.f25753L = z10;
        C2746S0 c2746s0 = this.f25755N;
        if (!c2746s0.f9175a.isEmpty()) {
            AbstractC10331w abstractC10331w = this.f25783i;
            abstractC10331w.getClass();
            if (abstractC10331w instanceof C10322n) {
                C20689D c20689dMo12448a = abstractC10331w.mo12448a();
                if (z10) {
                    this.f25754M = c20689dMo12448a.f70914t;
                    AbstractC2485E<Integer> abstractC2485E = c2746s0.f9175a;
                    C20689D.b bVarMo12459a = c20689dMo12448a.mo12459a();
                    AbstractC2517f0<Integer> abstractC2517f0Mo3212j = abstractC2485E.iterator();
                    while (abstractC2517f0Mo3212j.hasNext()) {
                        bVarMo12459a.mo12469k(abstractC2517f0Mo3212j.next().intValue(), true);
                    }
                    c20689dMo12461b = bVarMo12459a.mo12461b();
                } else {
                    c20689dMo12461b = c20689dMo12448a.mo12459a().mo12463e(this.f25754M).mo12461b();
                    this.f25754M = null;
                }
                if (!c20689dMo12461b.equals(c20689dMo12448a)) {
                    abstractC10331w.mo12452g(c20689dMo12461b);
                }
            }
        }
        this.f25789l.f25985i.mo934f(36, Boolean.valueOf(z10)).m942b();
        C2731K0 c2731k0 = this.f25784i0;
        m9305v0(c2731k0.f9137m, c2731k0.f9136l);
    }

    @Override // p884z2.InterfaceC20719y
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        m9310y0();
        if (surfaceView instanceof InterfaceC11270t) {
            m9293o0();
            m9300s0(surfaceView);
            m9298r0(surfaceView.getHolder());
            return;
        }
        boolean z10 = surfaceView instanceof C11823l;
        a aVar = this.f25803z;
        if (z10) {
            m9293o0();
            this.f25762U = (C11823l) surfaceView;
            C7780m c7780mM9278e0 = m9278e0(this.f25742A);
            C0515a.m1030f(!c7780mM9278e0.f26135f);
            c7780mM9278e0.f26132c = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
            C11823l c11823l = this.f25762U;
            C0515a.m1030f(true ^ c7780mM9278e0.f26135f);
            c7780mM9278e0.f26133d = c11823l;
            c7780mM9278e0.m9473b();
            this.f25762U.f37135b.add(aVar);
            m9300s0(this.f25762U.getVideoSurface());
            m9298r0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m9310y0();
        if (holder == null) {
            m9277d0();
            return;
        }
        m9293o0();
        this.f25763V = true;
        this.f25761T = holder;
        holder.addCallback(aVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            m9300s0(null);
            m9289m0(0, 0);
        } else {
            m9300s0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m9289m0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // p884z2.InterfaceC20719y
    public final void setVolume(float f10) {
        m9310y0();
        final float fM1003h = C0513S.m1003h(f10, 0.0f, 1.0f);
        if (this.f25768a0 == fM1003h) {
            return;
        }
        this.f25768a0 = fM1003h;
        this.f25789l.f25985i.mo934f(32, Float.valueOf(fM1003h)).m942b();
        this.f25790m.m1066f(22, new C0538x.a() { // from class: K2.E
            @Override // p039C2.C0538x.a
            public final void invoke(Object obj) {
                ((InterfaceC20719y.c) obj).onVolumeChanged(fM1003h);
            }
        });
    }

    @Override // p884z2.InterfaceC20719y
    public final void stop() {
        m9310y0();
        m9302t0(null);
        C2500U c2500u = C2500U.f8330f;
        long j10 = this.f25784i0.f9143s;
        this.f25772c0 = new C0227c(c2500u);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: t */
    public final Looper mo9301t() {
        return this.f25797t;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m9302t0(C2784n c2784n) {
        C2731K0 c2731k0 = this.f25784i0;
        C2731K0 c2731k0M3439c = c2731k0.m3439c(c2731k0.f9126b);
        c2731k0M3439c.f9141q = c2731k0M3439c.f9143s;
        c2731k0M3439c.f9142r = 0L;
        C2731K0 c2731k0M9255j0 = m9255j0(c2731k0M3439c, 1);
        if (c2784n != null) {
            c2731k0M9255j0 = c2731k0M9255j0.m3442f(c2784n);
        }
        this.f25750I++;
        this.f25789l.f25985i.mo932d(6).m942b();
        m9307w0(c2731k0M9255j0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: u */
    public final C20689D mo9303u() {
        m9310y0();
        C20689D c20689dMo12448a = this.f25783i.mo12448a();
        return this.f25753L ? c20689dMo12448a.mo12459a().mo12463e(this.f25754M).mo12461b() : c20689dMo12448a;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m9304u0() {
        InterfaceC20719y.a aVar = this.f25757P;
        InterfaceC20719y.a aVarM1016u = C0513S.m1016u(this.f25777f, this.f25771c);
        this.f25757P = aVarM1016u;
        if (aVarM1016u.equals(aVar)) {
            return;
        }
        this.f25790m.m1063c(13, new C0538x.a() { // from class: K2.P
            @Override // p039C2.C0538x.a
            public final void invoke(Object obj) {
                ((InterfaceC20719y.c) obj).mo3841T(this.f9161b.f25757P);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m9305v0(int i10, boolean z10) {
        int i11;
        if (this.f25753L) {
            i11 = 4;
        } else {
            i11 = (this.f25784i0.f9138n != 1 || z10) ? 0 : 1;
        }
        C2731K0 c2731k0M3437a = this.f25784i0;
        if (c2731k0M3437a.f9136l == z10 && c2731k0M3437a.f9138n == i11 && c2731k0M3437a.f9137m == i10) {
            return;
        }
        this.f25750I++;
        if (c2731k0M3437a.f9140p) {
            c2731k0M3437a = c2731k0M3437a.m3437a();
        }
        C2731K0 c2731k0M3441e = c2731k0M3437a.m3441e(i10, i11, z10);
        this.f25789l.f25985i.mo935g(1, z10 ? 1 : 0, i10 | (i11 << 4)).m942b();
        m9307w0(c2731k0M3441e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: w */
    public final void mo9306w(TextureView textureView) {
        m9310y0();
        if (textureView == null) {
            m9277d0();
            return;
        }
        m9293o0();
        this.f25764W = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C0539y.m1074f("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f25803z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m9300s0(null);
            m9289m0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m9300s0(surface);
            this.f25760S = surface;
            m9289m0(textureView.getWidth(), textureView.getHeight());
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m9307w0(final C2731K0 c2731k0, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        final C20711q c20711q;
        int i14;
        Object obj;
        C20711q c20711q2;
        Object obj2;
        int i15;
        long j11;
        long j12;
        long jM9254i0;
        long jM9254i1;
        Object obj3;
        C20711q c20711q3;
        Object obj4;
        int i16;
        C2731K0 c2731k1 = this.f25784i0;
        this.f25784i0 = c2731k0;
        boolean zEquals = c2731k1.f9125a.equals(c2731k0.f9125a);
        AbstractC20686A.c cVar = this.f70971a;
        AbstractC20686A.b bVar = this.f25792o;
        AbstractC20686A abstractC20686A = c2731k1.f9125a;
        InterfaceC6695z.b bVar2 = c2731k1.f9126b;
        AbstractC20686A abstractC20686A2 = c2731k0.f9125a;
        InterfaceC6695z.b bVar3 = c2731k0.f9126b;
        if (abstractC20686A2.m25225p() && abstractC20686A.m25225p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC20686A2.m25225p() != abstractC20686A.m25225p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!abstractC20686A.mo3485m(abstractC20686A.mo3482g(bVar2.f22080a, bVar).f70864c, cVar, 0L).f70871a.equals(abstractC20686A2.mo3485m(abstractC20686A2.mo3482g(bVar3.f22080a, bVar).f70864c, cVar, 0L).f70871a)) {
            if (z10 && i11 == 0) {
                i13 = 1;
            } else if (z10 && i11 == 1) {
                i13 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        } else if (z10 && i11 == 0 && bVar2.f22083d < bVar3.f22083d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z10 && i11 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            c20711q = c2731k0.f9125a.m25225p() ? null : c2731k0.f9125a.mo3485m(c2731k0.f9125a.mo3482g(c2731k0.f9126b.f22080a, this.f25792o).f70864c, this.f70971a, 0L).f70873c;
            this.f25782h0 = C20713s.f71153D;
        } else {
            c20711q = null;
        }
        if (zBooleanValue || !c2731k1.f9134j.equals(c2731k0.f9134j)) {
            C20713s.a aVarM25315a = this.f25782h0.m25315a();
            List<C20714t> list = c2731k0.f9134j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                C20714t c20714t = list.get(i17);
                int i18 = 0;
                while (true) {
                    C20714t.a[] aVarArr = c20714t.f71211a;
                    if (i18 < aVarArr.length) {
                        aVarArr[i18].mo1631b(aVarM25315a);
                        i18++;
                    }
                }
            }
            this.f25782h0 = new C20713s(aVarM25315a);
        }
        C20713s c20713sM9276c0 = m9276c0();
        boolean zEquals2 = c20713sM9276c0.equals(this.f25758Q);
        this.f25758Q = c20713sM9276c0;
        boolean z12 = c2731k1.f9136l != c2731k0.f9136l;
        boolean z13 = c2731k1.f9129e != c2731k0.f9129e;
        if (z13 || z12) {
            m9308x0();
        }
        boolean z14 = c2731k1.f9131g != c2731k0.f9131g;
        if (!zEquals) {
            this.f25790m.m1063c(0, new C0538x.a() { // from class: K2.S
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj5) {
                    ((InterfaceC20719y.c) obj5).onTimelineChanged(c2731k0.f9125a, i10);
                }
            });
        }
        if (z10) {
            AbstractC20686A.b bVar4 = new AbstractC20686A.b();
            if (c2731k1.f9125a.m25225p()) {
                i14 = i12;
                obj = null;
                c20711q2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = c2731k1.f9126b.f22080a;
                c2731k1.f9125a.mo3482g(obj5, bVar4);
                int i19 = bVar4.f70864c;
                int iMo3479b = c2731k1.f9125a.mo3479b(obj5);
                obj = c2731k1.f9125a.mo3485m(i19, this.f70971a, 0L).f70871a;
                c20711q2 = this.f70971a.f70873c;
                obj2 = obj5;
                i14 = i19;
                i15 = iMo3479b;
            }
            if (i11 == 0) {
                if (c2731k1.f9126b.m7559b()) {
                    InterfaceC6695z.b bVar5 = c2731k1.f9126b;
                    jM9254i0 = bVar4.m25226a(bVar5.f22081b, bVar5.f22082c);
                    jM9254i1 = m9254i0(c2731k1);
                } else {
                    if (c2731k1.f9126b.f22084e != -1) {
                        jM9254i0 = m9254i0(this.f25784i0);
                    } else {
                        j11 = bVar4.f70866e;
                        j12 = bVar4.f70865d;
                        jM9254i0 = j11 + j12;
                    }
                    jM9254i1 = jM9254i0;
                }
            } else if (c2731k1.f9126b.m7559b()) {
                jM9254i0 = c2731k1.f9143s;
                jM9254i1 = m9254i0(c2731k1);
            } else {
                j11 = bVar4.f70866e;
                j12 = c2731k1.f9143s;
                jM9254i0 = j11 + j12;
                jM9254i1 = jM9254i0;
            }
            long jM1002g0 = C0513S.m1002g0(jM9254i0);
            long jM1002g1 = C0513S.m1002g0(jM9254i1);
            InterfaceC6695z.b bVar6 = c2731k1.f9126b;
            final InterfaceC20719y.d dVar = new InterfaceC20719y.d(obj, i14, c20711q2, obj2, i15, jM1002g0, jM1002g1, bVar6.f22081b, bVar6.f22082c);
            AbstractC20686A.c cVar2 = this.f70971a;
            int iMo9268N = mo9268N();
            if (this.f25784i0.f9125a.m25225p()) {
                obj3 = null;
                c20711q3 = null;
                obj4 = null;
                i16 = -1;
            } else {
                C2731K0 c2731k2 = this.f25784i0;
                Object obj6 = c2731k2.f9126b.f22080a;
                c2731k2.f9125a.mo3482g(obj6, this.f25792o);
                int iMo3479b2 = this.f25784i0.f9125a.mo3479b(obj6);
                Object obj7 = this.f25784i0.f9125a.mo3485m(iMo9268N, cVar2, 0L).f70871a;
                c20711q3 = cVar2.f70873c;
                i16 = iMo3479b2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jM1002g2 = C0513S.m1002g0(j10);
            long jM1002g3 = this.f25784i0.f9126b.m7559b() ? C0513S.m1002g0(m9254i0(this.f25784i0)) : jM1002g2;
            InterfaceC6695z.b bVar7 = this.f25784i0.f9126b;
            final InterfaceC20719y.d dVar2 = new InterfaceC20719y.d(obj3, iMo9268N, c20711q3, obj4, i16, jM1002g2, jM1002g3, bVar7.f22081b, bVar7.f22082c);
            this.f25790m.m1063c(11, new C0538x.a() { // from class: K2.X
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    InterfaceC20719y.c cVar3 = (InterfaceC20719y.c) obj8;
                    cVar3.getClass();
                    cVar3.onPositionDiscontinuity(dVar, dVar2, i11);
                }
            });
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z13 = z13;
        }
        if (zBooleanValue) {
            this.f25790m.m1063c(1, new C0538x.a() { // from class: K2.w
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    ((InterfaceC20719y.c) obj8).mo3833L(c20711q, iIntValue);
                }
            });
        }
        if (c2731k1.f9130f != c2731k0.f9130f) {
            this.f25790m.m1063c(10, new C2804x(c2731k0, 0));
            if (c2731k0.f9130f != null) {
                this.f25790m.m1063c(10, new C0538x.a() { // from class: K2.y
                    @Override // p039C2.C0538x.a
                    public final void invoke(Object obj8) {
                        ((InterfaceC20719y.c) obj8).onPlayerError(c2731k0.f9130f);
                    }
                });
            }
        }
        C10332x c10332x = c2731k1.f9133i;
        C10332x c10332x2 = c2731k0.f9133i;
        if (c10332x != c10332x2) {
            this.f25783i.mo12476c(c10332x2.f32015e);
            this.f25790m.m1063c(2, new C2808z(c2731k0));
        }
        if (!zEquals2) {
            final C20713s c20713s = this.f25758Q;
            this.f25790m.m1063c(14, new C0538x.a() { // from class: K2.A
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    ((InterfaceC20719y.c) obj8).mo3873t(c20713s);
                }
            });
        }
        if (z14) {
            this.f25790m.m1063c(3, new C0538x.a() { // from class: K2.B
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    InterfaceC20719y.c cVar3 = (InterfaceC20719y.c) obj8;
                    C2731K0 c2731k3 = c2731k0;
                    boolean z15 = c2731k3.f9131g;
                    cVar3.getClass();
                    cVar3.onIsLoadingChanged(c2731k3.f9131g);
                }
            });
        }
        if (z13 || z12) {
            this.f25790m.m1063c(-1, new C0538x.a() { // from class: K2.C
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    C2731K0 c2731k3 = c2731k0;
                    ((InterfaceC20719y.c) obj8).onPlayerStateChanged(c2731k3.f9136l, c2731k3.f9129e);
                }
            });
        }
        if (z13) {
            this.f25790m.m1063c(4, new C0538x.a() { // from class: K2.D
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    ((InterfaceC20719y.c) obj8).onPlaybackStateChanged(c2731k0.f9129e);
                }
            });
        }
        if (z12 || c2731k1.f9137m != c2731k0.f9137m) {
            this.f25790m.m1063c(5, new C2747T(c2731k0));
        }
        if (c2731k1.f9138n != c2731k0.f9138n) {
            this.f25790m.m1063c(6, new C0538x.a() { // from class: K2.U
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    ((InterfaceC20719y.c) obj8).onPlaybackSuppressionReasonChanged(c2731k0.f9138n);
                }
            });
        }
        if (c2731k1.m3448m() != c2731k0.m3448m()) {
            this.f25790m.m1063c(7, new C0538x.a() { // from class: K2.V
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    ((InterfaceC20719y.c) obj8).onIsPlayingChanged(c2731k0.m3448m());
                }
            });
        }
        if (!c2731k1.f9139o.equals(c2731k0.f9139o)) {
            this.f25790m.m1063c(12, new C0538x.a() { // from class: K2.W
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj8) {
                    ((InterfaceC20719y.c) obj8).mo3835N(c2731k0.f9139o);
                }
            });
        }
        m9304u0();
        this.f25790m.m1062b();
        if (c2731k1.f9140p != c2731k0.f9140p) {
            Iterator<ExoPlayer.InterfaceC7752a> it = this.f25791n.iterator();
            while (it.hasNext()) {
                it.next().mo9219e();
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m9308x0() {
        int iMo9279f = mo9279f();
        C2754W0 c2754w0 = this.f25745D;
        C2752V0 c2752v0 = this.f25744C;
        boolean z10 = false;
        if (iMo9279f != 1) {
            if (iMo9279f == 2 || iMo9279f == 3) {
                m9310y0();
                boolean z11 = this.f25784i0.f9140p;
                if (mo9311z() && !z11) {
                    z10 = true;
                }
                c2752v0.m3475a(z10);
                c2754w0.m3476a(mo9311z());
                return;
            }
            if (iMo9279f != 4) {
                throw new IllegalStateException();
            }
        }
        c2752v0.m3475a(false);
        c2754w0.m3476a(false);
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: y */
    public final InterfaceC20719y.a mo9309y() {
        m9310y0();
        return this.f25757P;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m9310y0() {
        this.f25773d.m1049b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f25797t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = C0513S.f2002a;
            Locale locale = Locale.US;
            String strM3477a = C2756Y.m3477a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f25774d0) {
                throw new IllegalStateException(strM3477a);
            }
            C0539y.m1075g(strM3477a, this.f25776e0 ? null : new IllegalStateException());
            this.f25776e0 = true;
        }
    }

    @Override // p884z2.InterfaceC20719y
    /* JADX INFO: renamed from: z */
    public final boolean mo9311z() {
        m9310y0();
        return this.f25784i0.f9136l;
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class a implements InterfaceC11249J, InterfaceC3497t, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C11823l.b, C7755a.b, ExoPlayer.InterfaceC7752a {
        public a() {
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: a */
        public final void mo9312a(final C20694I c20694i) {
            C7758d c7758d = C7758d.this;
            c7758d.f25780g0 = c20694i;
            c7758d.f25790m.m1066f(25, new C0538x.a() { // from class: K2.e0
                @Override // p039C2.C0538x.a
                public final void invoke(Object obj) {
                    ((InterfaceC20719y.c) obj).mo3848a(c20694i);
                }
            });
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: b */
        public final void mo9313b(C2772h c2772h) {
            C7758d.this.f25796s.mo3850b(c2772h);
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: c */
        public final void mo9314c(String str) {
            C7758d.this.f25796s.mo3852c(str);
        }

        @Override // p582h3.C11823l.b
        /* JADX INFO: renamed from: d */
        public final void mo9315d(Surface surface) {
            C7758d.this.m9300s0(surface);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.InterfaceC7752a
        /* JADX INFO: renamed from: e */
        public final void mo9219e() {
            C7758d.this.m9308x0();
        }

        @Override // p582h3.C11823l.b
        /* JADX INFO: renamed from: f */
        public final void mo9316f() {
            C7758d.this.m9300s0(null);
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: h */
        public final void mo9317h(C20708n c20708n, C2774i c2774i) {
            C7758d.this.f25796s.mo3861h(c20708n, c2774i);
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: j */
        public final void mo9318j(Exception exc) {
            C7758d.this.f25796s.mo3863j(exc);
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: k */
        public final void mo9319k(long j10, Object obj) {
            C7758d c7758d = C7758d.this;
            c7758d.f25796s.mo3864k(j10, obj);
            if (c7758d.f25759R == obj) {
                c7758d.f25790m.m1066f(26, new C2769f0());
            }
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: l */
        public final void mo9320l(int i10, long j10) {
            C7758d.this.f25796s.mo3865l(i10, j10);
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: m */
        public final void mo9321m(C2772h c2772h) {
            C7758d.this.f25796s.mo3866m(c2772h);
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: n */
        public final void mo9322n(int i10, long j10) {
            C7758d.this.f25796s.mo3867n(i10, j10);
        }

        @Override // p570g3.InterfaceC11249J
        /* JADX INFO: renamed from: o */
        public final void mo9323o(long j10, long j11, String str) {
            C7758d.this.f25796s.mo3868o(j10, j11, str);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            Surface surface = new Surface(surfaceTexture);
            C7758d c7758d = C7758d.this;
            c7758d.m9300s0(surface);
            c7758d.f25760S = surface;
            c7758d.m9289m0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C7758d c7758d = C7758d.this;
            c7758d.m9300s0(null);
            c7758d.m9289m0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C7758d.this.m9289m0(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C7758d.this.m9289m0(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C7758d c7758d = C7758d.this;
            if (c7758d.f25763V) {
                c7758d.m9300s0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C7758d c7758d = C7758d.this;
            if (c7758d.f25763V) {
                c7758d.m9300s0(null);
            }
            c7758d.m9289m0(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
