package p843wd;

import ad.C7271o1;
import ad.C7274p1;
import ad.InterfaceC7242f;
import ad.InterfaceC7245g;
import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mg.C17060w;
import mg.InterfaceC17049l;
import org.mozilla.javascript.ES6Iterator;
import p016Af.InterfaceC0134c;
import p017Ag.C0144b;
import p048Cb.C0703d;
import p048Cb.InterfaceC0706g;
import p050Cd.C0720L;
import p050Cd.C0721M;
import p050Cd.C0722N;
import p050Cd.C0723O;
import p050Cd.C0724P;
import p050Cd.C0725Q;
import p050Cd.C0726S;
import p050Cd.C0727T;
import p050Cd.C0728U;
import p050Cd.C0729V;
import p050Cd.C0730W;
import p050Cd.C0731X;
import p050Cd.C0732Y;
import p050Cd.C0733Z;
import p050Cd.C0735a0;
import p050Cd.C0773x;
import p050Cd.C0774y;
import p050Cd.InterfaceC0750i;
import p107Fg.C1634b;
import p114G5.C1716d;
import p114G5.C1719g;
import p114G5.InterfaceC1715c;
import p125Gg.EnumC1896d;
import p142Hf.C2182j;
import p142Hf.InterfaceC2178f;
import p142Hf.InterfaceC2179g;
import p192Kb.C2926J;
import p192Kb.C2965q;
import p192Kb.InterfaceC2930N;
import p198L.C3085S;
import p211Lc.C3324a;
import p269Og.C3974S;
import p269Og.C3986c;
import p269Og.EnumC3994g;
import p319Rc.C4725A;
import p319Rc.C4726B;
import p319Rc.C4737a;
import p339Se.C4931x;
import p359Tg.InterfaceC5166h;
import p366U5.C5368b;
import p366U5.C5369c;
import p366U5.InterfaceC5372f;
import p373Uc.C5405e;
import p384V5.InterfaceC5655c;
import p395Vg.C5704d;
import p402W5.InterfaceC5862d;
import p420X5.C6224b;
import p438Y5.InterfaceC6450f;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p514d0.C10213p;
import p514d0.C10214q;
import p524da.C10407W;
import p524da.C10427i;
import p524da.C10428i0;
import p524da.C10454v0;
import p524da.C10456w0;
import p524da.InterfaceC10444q0;
import p524da.InterfaceC10452u0;
import p532e0.C10678v;
import p558fa.C11095d;
import p565fh.InterfaceC11183h;
import p623j$.util.Objects;
import p676lg.C16438e;
import p676lg.C16440g;
import p689mb.C16972W;
import p689mb.C16973X;
import p770rf.C17967f;
import p770rf.InterfaceC17978p;
import p770rf.InterfaceC17981s;
import p770rf.InterfaceC17982t;
import p770rf.InterfaceC17984v;
import p770rf.InterfaceC17985w;
import p771rg.InterfaceC17991c;
import p771rg.InterfaceC17992d;
import p771rg.InterfaceC17996h;
import p828vf.InterfaceC18777t;
import p845wg.C19285c2;
import p862xf.C19684h;
import p862xf.InterfaceC19677a;

/* JADX INFO: renamed from: wd.B */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEntityPlayerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityPlayerComponent.kt\nru/zona/app/components/player/EntityPlayerComponent\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,641:1\n49#2:642\n51#2:646\n17#2:647\n19#2:651\n49#2:703\n51#2:707\n45#3:643\n49#3:645\n45#3:648\n49#3:650\n45#3:704\n49#3:706\n105#4:644\n105#4:649\n105#4:705\n230#5,5:652\n230#5,5:657\n230#5,5:662\n230#5,5:667\n230#5,5:672\n230#5,5:677\n230#5,5:682\n230#5,5:687\n230#5,5:692\n230#5,5:697\n230#5,5:708\n230#5,5:713\n189#6:702\n*S KotlinDebug\n*F\n+ 1 EntityPlayerComponent.kt\nru/zona/app/components/player/EntityPlayerComponent\n*L\n122#1:642\n122#1:646\n257#1:647\n257#1:651\n618#1:703\n618#1:707\n122#1:643\n122#1:645\n257#1:648\n257#1:650\n618#1:704\n618#1:706\n122#1:644\n257#1:649\n618#1:705\n426#1:652,5\n451#1:657,5\n457#1:662,5\n472#1:667,5\n501#1:672,5\n543#1:677,5\n547#1:682,5\n590#1:687,5\n594#1:692,5\n601#1:697,5\n197#1:708,5\n201#1:713,5\n610#1:702\n*E\n"})
public final class C18978B implements InterfaceC19004Q, InterfaceC19008V, InterfaceC1715c {

    /* JADX INFO: renamed from: I */
    public static final C1634b f59110I;

    /* JADX INFO: renamed from: J */
    public static final long f59111J;

    /* JADX INFO: renamed from: A */
    public final C19044p0 f59112A;

    /* JADX INFO: renamed from: B */
    public InterfaceC19006T f59113B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC2179g f59114C;

    /* JADX INFO: renamed from: D */
    public final C19032j0 f59115D;

    /* JADX INFO: renamed from: E */
    public final C19034k0 f59116E;

    /* JADX INFO: renamed from: F */
    public final C0720L f59117F;

    /* JADX INFO: renamed from: G */
    public final C5368b f59118G;

    /* JADX INFO: renamed from: H */
    public final C17060w f59119H;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1715c f59120b;

    /* JADX INFO: renamed from: c */
    public final EnumC1896d f59121c;

    /* JADX INFO: renamed from: d */
    public final C2182j f59122d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2179g f59123e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0706g f59124f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC19011Y f59125g;

    /* JADX INFO: renamed from: h */
    public final C4737a f59126h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC19677a f59127i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC7245g f59128j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17978p f59129k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17049l f59130l;

    /* JADX INFO: renamed from: m */
    public final C19062y0 f59131m;

    /* JADX INFO: renamed from: n */
    public final C4726B f59132n;

    /* JADX INFO: renamed from: o */
    public final C7271o1 f59133o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC17984v f59134p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC17985w f59135q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC11183h f59136r;

    /* JADX INFO: renamed from: s */
    public final C16438e f59137s;

    /* JADX INFO: renamed from: t */
    public final C11095d f59138t;

    /* JADX INFO: renamed from: u */
    public final C10454v0 f59139u;

    /* JADX INFO: renamed from: v */
    public final C10428i0 f59140v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC10452u0<InterfaceC19677a.a> f59141w;

    /* JADX INFO: renamed from: x */
    public final C10454v0 f59142x;

    /* JADX INFO: renamed from: y */
    public final C10428i0 f59143y;

    /* JADX INFO: renamed from: z */
    public final C10428i0 f59144z;

    /* JADX INFO: renamed from: wd.B$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.player.EntityPlayerComponent$castError$1", m18778f = "EntityPlayerComponent.kt", m18779i = {}, m18780l = {492}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {493}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public InterfaceC17049l f59145j;

        /* JADX INFO: renamed from: k */
        public int f59146k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C18978B f59147l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, C18978B c18978b) {
            super(2, continuation);
            this.f59147l = c18978b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(continuation, this.f59147l);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC17049l interfaceC17049l;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f59146k;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC17049l interfaceC17049l2 = this.f59147l.f59130l;
                C16972W c16972w = (C16972W) C19285c2.f60060P.getValue();
                this.f59145j = interfaceC17049l2;
                this.f59146k = 1;
                Object objM19462a = C16973X.m19462a(c16972w, this);
                if (objM19462a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC17049l = interfaceC17049l2;
                obj = objM19462a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC17049l = this.f59145j;
                ResultKt.throwOnFailure(obj);
            }
            interfaceC17049l.mo19497b((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: wd.B$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.player.EntityPlayerComponent$next$1", m18778f = "EntityPlayerComponent.kt", m18779i = {}, m18780l = {526}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {527}, m18784s = {}, m18785v = 2)
    public static final class b extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f59148j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C18978B f59149k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, C18978B c18978b) {
            super(2, continuation);
            this.f59149k = c18978b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(continuation, this.f59149k);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f59148j;
            C18978B c18978b = this.f59149k;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC19677a interfaceC19677a = c18978b.f59127i;
                this.f59148j = 1;
                obj = interfaceC19677a.mo21569a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C2182j c2182j = (C2182j) obj;
            if (c2182j != null) {
                c18978b.f59131m.invoke(c2182j);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: wd.B$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.player.EntityPlayerComponent$prev$1", m18778f = "EntityPlayerComponent.kt", m18779i = {}, m18780l = {515}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {516}, m18784s = {}, m18785v = 2)
    public static final class c extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f59150j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C18978B f59151k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Continuation continuation, C18978B c18978b) {
            super(2, continuation);
            this.f59151k = c18978b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(continuation, this.f59151k);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f59150j;
            C18978B c18978b = this.f59151k;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC19677a interfaceC19677a = c18978b.f59127i;
                this.f59150j = 1;
                obj = interfaceC19677a.mo21570b(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C2182j c2182j = (C2182j) obj;
            if (c2182j != null) {
                c18978b.f59131m.invoke(c2182j);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C18978B.class).getSimpleName();
        f59110I = new C1634b();
        Duration.Companion companion = Duration.INSTANCE;
        f59111J = DurationKt.toDuration(10, DurationUnit.SECONDS);
    }

    public C18978B(EnumC1896d enumC1896d, C2182j c2182j, InterfaceC2179g interfaceC2179g, InterfaceC0706g interfaceC0706g, C18987F0 c18987f0, C4737a c4737a, C19684h c19684h, InterfaceC0134c interfaceC0134c, InterfaceC17981s interfaceC17981s, InterfaceC7245g interfaceC7245g, InterfaceC17991c interfaceC17991c, InterfaceC17992d interfaceC17992d, InterfaceC17996h interfaceC17996h, InterfaceC17978p interfaceC17978p, InterfaceC17049l interfaceC17049l, C19062y0 c19062y0, C4725A c4725a, C4726B c4726b, C7271o1 c7271o1, InterfaceC17984v interfaceC17984v, C5405e c5405e, C16440g c16440g, InterfaceC17982t interfaceC17982t, InterfaceC17985w interfaceC17985w, InterfaceC11183h interfaceC11183h, InterfaceC18777t interfaceC18777t, InterfaceC7242f interfaceC7242f, C16438e c16438e, C7274p1 c7274p1, InterfaceC1715c interfaceC1715c) {
        Object value;
        C17967f c17967f = C17967f.f55883a;
        this.f59120b = interfaceC1715c;
        this.f59121c = enumC1896d;
        this.f59122d = c2182j;
        this.f59123e = interfaceC2179g;
        this.f59124f = interfaceC0706g;
        this.f59125g = c18987f0;
        this.f59126h = c4737a;
        this.f59127i = c19684h;
        this.f59128j = interfaceC7245g;
        this.f59129k = interfaceC17978p;
        this.f59130l = interfaceC17049l;
        this.f59131m = c19062y0;
        this.f59132n = c4726b;
        this.f59133o = c7271o1;
        this.f59134p = interfaceC17984v;
        this.f59135q = interfaceC17985w;
        this.f59136r = interfaceC11183h;
        this.f59137s = c16438e;
        C11095d c11095dM7048b = C6224b.m7048b(this);
        this.f59138t = c11095dM7048b;
        C10454v0 c10454v0M12580a = C10456w0.m12580a(m21321d((InterfaceC2178f.b) interfaceC2179g.getState().f32389b.getValue()));
        this.f59139u = c10454v0M12580a;
        C10428i0 c10428i0M12535a = C10427i.m12535a(c10454v0M12580a);
        this.f59140v = c10428i0M12535a;
        this.f59141w = c19684h.f60750f;
        long jLongValue = 0;
        if (!c2182j.f7217c) {
            C3986c c3986c = c2182j.f7215a;
            Long lMo6144c = interfaceC17984v.mo6144c(c3986c.f13105b, c3986c.f13106c == EnumC3994g.SERIAL ? c2182j.f7216b : null);
            if (lMo6144c != null) {
                jLongValue = lMo6144c.longValue();
            }
        }
        C10454v0 c10454v0M12580a2 = C10456w0.m12580a(Long.valueOf(jLongValue));
        this.f59142x = c10454v0M12580a2;
        this.f59143y = C10427i.m12550p(new C18992I(interfaceC11183h.mo13191i().getState(), this), c11095dM7048b, InterfaceC10444q0.a.f32464a, Boolean.FALSE);
        this.f59144z = C10427i.m12535a(c10454v0M12580a2);
        C19044p0 c19044p0 = new C19044p0();
        this.f59112A = c19044p0;
        this.f59113B = C19038m0.f59415b;
        this.f59114C = interfaceC2179g;
        C19032j0 c19032j0 = new C19032j0(c2182j, interfaceC0706g, c19044p0, interfaceC2179g, c10428i0M12535a);
        this.f59115D = c19032j0;
        this.f59116E = new C19034k0(CollectionsKt.listOf((Object[]) new InterfaceC19008V[]{this, new C18995J0(interfaceC2179g, c11095dM7048b), c19032j0}));
        int i10 = 1;
        this.f59117F = new C0720L(c2182j, interfaceC17991c, interfaceC17992d, interfaceC2179g, c10428i0M12535a, interfaceC0134c, interfaceC17981s, interfaceC17996h, c5405e, c16440g, interfaceC17982t, interfaceC17978p, interfaceC17049l, interfaceC0706g, new C10213p(this, i10), c4725a, new C19049s(this, 0), new C10214q(this, i10), new C0773x(this, 2), new C0774y(this, i10), new C18986F(1, this, C18978B.class, "setPlaybackSpeed", "setPlaybackSpeed(F)V", 0), new C18988G(0, this, C18978B.class, "toggleAutoSwitchNextEpisode", "toggleAutoSwitchNextEpisode()V", 0), new C3085S(this, i10), interfaceC18777t, interfaceC7242f, c16438e, c7274p1, C1716d.m2446a(this, "PlayerModalControlsComponent"));
        this.f59118G = C5369c.m6124a(28, new C4931x(this, 1));
        this.f59119H = new C17060w(c11095dM7048b, f59111J, new C18994J(null, this));
        C10454v0 c10454v0 = c18987f0.f59188e;
        do {
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, InterfaceC19011Y.c.m21367a((InterfaceC19011Y.c) value, null, new InterfaceC19011Y.b.d(((InterfaceC2178f.b) c18987f0.f59184a.getState().f32389b.getValue()).f7199d.size()), 1)));
        interfaceC1715c.getLifecycle().mo4368a(new C19055v(this));
        C7106g.m8045c(c11095dM7048b, null, null, new C19057w(null, this), 3);
        C10427i.m12549o(new C10407W(C10427i.m12541g(new C18990H(interfaceC2179g.getState()), new C19051t()), new C19059x(null, this)), c11095dM7048b);
        C10427i.m12549o(new C10407W(C10427i.m12541g(interfaceC2179g.getState(), new C19053u()), new C19061y(null, this)), c11095dM7048b);
        C7106g.m8045c(c11095dM7048b, null, null, new C19063z(null, this), 3);
        C10427i.m12549o(new C10407W(c10428i0M12535a, new C18976A(null, this)), c11095dM7048b);
        C10427i.m12549o(C10427i.m12551q(interfaceC2179g.getState(), new C18980C(null, this)), c11095dM7048b);
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: D */
    public final void mo21298D() {
        m21308R(InterfaceC19009W.c.b.f59301b);
        this.f59117F.f2630F.m5182a(new C0727T(InterfaceC0750i.b.e.INSTANCE), new C0728U());
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: E */
    public final void mo21299E() {
        m21308R(InterfaceC19009W.c.b.f59301b);
        this.f59117F.f2630F.m5182a(new C0723O(InterfaceC0750i.b.c.INSTANCE), new C0724P());
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: G */
    public final InterfaceC2178f mo21300G() {
        return this.f59114C;
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: I */
    public final void mo21301I() {
        f59110I.mo2258d("prev", new Object[0]);
        m21308R(InterfaceC19009W.c.b.f59302c);
        C7106g.m8045c(this.f59138t, null, null, new c(null, this), 3);
    }

    @Override // p843wd.InterfaceC19007U
    /* JADX INFO: renamed from: J */
    public final void mo21302J() {
        this.f59113B = C19038m0.f59415b;
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: K */
    public final InterfaceC5372f mo793K() {
        return this.f59120b.mo793K();
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: L */
    public final InterfaceC0750i mo21303L() {
        return this.f59117F;
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: M */
    public final void mo21304M(float f10) {
        long j10 = (long) f10;
        this.f59113B.mo21358d(j10);
        this.f59116E.mo21335p(j10);
        mo21322d0();
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: N */
    public final InterfaceC19008V mo21305N() {
        return this.f59116E;
    }

    @Override // p843wd.InterfaceC19007U
    /* JADX INFO: renamed from: O */
    public final void mo21306O(InterfaceC19006T interfaceC19006T) {
        this.f59113B = interfaceC19006T;
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: Q */
    public final void mo21307Q() {
        C10454v0 c10454v0;
        Object value;
        this.f59113B.mo21358d(0L);
        do {
            c10454v0 = this.f59139u;
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, InterfaceC19009W.b.m21365a((InterfaceC19009W.b) value, false, 0L, 0, null, null, null, 0.0f, false, true, null, false, 3583)));
    }

    /* JADX INFO: renamed from: R */
    public final void m21308R(InterfaceC19009W.c.b bVar) {
        StringBuilder sb2 = new StringBuilder("pauseWithInitiator(");
        InterfaceC19009W.c.b bVar2 = bVar;
        sb2.append(bVar2);
        sb2.append(")");
        f59110I.mo2258d(sb2.toString(), new Object[0]);
        C10454v0 c10454v0 = this.f59139u;
        if (((InterfaceC19009W.b) c10454v0.getValue()).f59292e instanceof InterfaceC19009W.c.C21257c) {
            while (true) {
                Object value = c10454v0.getValue();
                if (c10454v0.mo12533d(value, InterfaceC19009W.b.m21365a((InterfaceC19009W.b) value, false, 0L, 0, bVar2, null, null, 0.0f, false, false, null, false, 4079))) {
                    break;
                } else {
                    bVar2 = bVar;
                }
            }
        }
        this.f59113B.pause();
        m21325f();
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: S */
    public final void mo21309S() {
        m21308R(InterfaceC19009W.c.b.f59301b);
        this.f59117F.f2628D.m5182a(new C0721M(InterfaceC0750i.b.a.INSTANCE), new C0722N());
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: T */
    public final void mo21310T() {
        m21326f0(null);
        m21328g0(((InterfaceC19009W.b) this.f59139u.getValue()).f59292e instanceof InterfaceC19009W.c.C21257c);
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: U */
    public final boolean mo21311U() {
        C16438e c16438e = this.f59137s;
        return C5704d.m6337a(((InterfaceC5166h.a) c16438e.f52043a.getState().f32389b.getValue()).f16977a.f16980a, ((Number) c16438e.f52044b.getValue()).longValue());
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: V */
    public final void mo21312V() {
        m21308R(InterfaceC19009W.c.b.f59301b);
        this.f59117F.f2628D.m5182a(new C0731X(InterfaceC0750i.b.f.INSTANCE), new C0732Y());
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: W */
    public final void mo21313W(float f10) {
        mo21322d0();
        float f11 = ((InterfaceC19009W.b) this.f59140v.f32389b.getValue()).f59290c;
        long jFloatValue = (long) ((Number) RangesKt___RangesKt.coerceIn(Float.valueOf(((Number) this.f59144z.f32389b.getValue()).floatValue() + (((Number) RangesKt___RangesKt.coerceIn(Float.valueOf(f10), (ClosedFloatingPointRange<Float>) RangesKt.rangeTo(-1.0f, 1.0f))).floatValue() * f11)), (ClosedFloatingPointRange<Float>) RangesKt.rangeTo(0.0f, f11))).floatValue();
        this.f59113B.mo21358d(jFloatValue);
        this.f59116E.mo21335p(jFloatValue);
    }

    @Override // p843wd.InterfaceC19008V
    /* JADX INFO: renamed from: Y */
    public final void mo21314Y(EnumC19042o0 enumC19042o0) {
        InterfaceC2930N interfaceC2930N;
        C2926J c2926jMo3655a;
        int iOrdinal = enumC19042o0.ordinal();
        InterfaceC19011Y interfaceC19011Y = this.f59125g;
        C19044p0 c19044p0 = this.f59112A;
        if (iOrdinal == 1) {
            if (c19044p0.f59436a.get() > 0) {
                interfaceC19011Y.mo21347d();
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            AtomicLong atomicLong = c19044p0.f59436a;
            C0144b.f484a.getClass();
            atomicLong.set(System.currentTimeMillis());
            C19044p0.f59435b.mo2258d("Starting playback time " + atomicLong, new Object[0]);
            interfaceC19011Y.mo21346c();
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        if (this.f59141w.getValue().f60718e && ((InterfaceC19009W.b) this.f59140v.f32389b.getValue()).f59296i) {
            next();
            return;
        }
        C19032j0 c19032j0 = this.f59115D;
        InterfaceC0706g interfaceC0706g = c19032j0.f59397c;
        C2182j c2182j = c19032j0.f59396b;
        String str = c2182j.f7215a.f13105b;
        InterfaceC2178f.d dVar = ((InterfaceC2178f.b) c19032j0.f59399e.getState().f32389b.getValue()).f7197b;
        interfaceC0706g.mo1242h(str, (dVar == null || (interfaceC2930N = dVar.f7205a) == null || (c2926jMo3655a = interfaceC2930N.mo3655a()) == null) ? C0703d.f2601f : C3324a.m4061a(c2926jMo3655a), c2182j.f7215a.f13106c.f13137b);
    }

    @Override // p843wd.InterfaceC19008V
    /* JADX INFO: renamed from: Z */
    public final void mo21315Z(int i10) {
        C10454v0 c10454v0;
        Object value;
        if (((InterfaceC19009W.b) this.f59140v.f32389b.getValue()).f59289b) {
            do {
                c10454v0 = this.f59139u;
                value = c10454v0.getValue();
            } while (!c10454v0.mo12533d(value, InterfaceC19009W.b.m21365a((InterfaceC19009W.b) value, false, 0L, i10, null, null, null, 0.0f, false, false, null, false, 4087)));
        }
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: a */
    public final InterfaceC10452u0<InterfaceC19009W.b> mo21316a() {
        return this.f59140v;
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: a0 */
    public final boolean mo21317a0() {
        return this.f59120b.getLifecycle().getState() == InterfaceC5862d.b.f19324f && !((Boolean) this.f59117F.f2633I.f32389b.getValue()).booleanValue();
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: b */
    public final EnumC1896d mo21318b() {
        return this.f59121c;
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: c */
    public final InterfaceC10452u0<InterfaceC19677a.a> mo21319c() {
        return this.f59141w;
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: c0 */
    public final void mo21320c0() {
        m21308R(InterfaceC19009W.c.b.f59301b);
        this.f59117F.f2628D.m5182a(new C0725Q(InterfaceC0750i.b.d.INSTANCE), new C0726S());
    }

    @Override // p843wd.InterfaceC19009W
    public final void close() {
        this.f59123e.cancel();
        this.f59135q.mo5493a(false);
        this.f59133o.invoke();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC19009W.b m21321d(InterfaceC2178f.b bVar) {
        C2182j c2182j = bVar.f7196a;
        InterfaceC19009W.c.a aVar = InterfaceC19009W.c.a.f59300a;
        long j10 = this.f59122d.f7218d;
        InterfaceC7245g interfaceC7245g = this.f59128j;
        return new InterfaceC19009W.b(c2182j, aVar, interfaceC7245g.mo4654d(j10), interfaceC7245g.mo4653c(), 3694);
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: d0 */
    public final void mo21322d0() {
        C10454v0 c10454v0 = this.f59139u;
        if (!((InterfaceC19009W.b) c10454v0.getValue()).f59289b) {
            m21326f0(Boolean.TRUE);
        }
        if (((InterfaceC19009W.b) c10454v0.getValue()).f59292e instanceof InterfaceC19009W.c.C21257c) {
            m21328g0(((InterfaceC19009W.b) c10454v0.getValue()).f59292e instanceof InterfaceC19009W.c.C21257c);
        }
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: e */
    public final void mo21323e() {
        this.f59113B.mo21359e();
        mo21322d0();
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: e0 */
    public final C2182j mo21324e0() {
        return this.f59122d;
    }

    /* JADX INFO: renamed from: f */
    public final void m21325f() {
        C10454v0 c10454v0;
        Object value;
        do {
            c10454v0 = this.f59139u;
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, InterfaceC19009W.b.m21365a((InterfaceC19009W.b) value, false, 0L, 0, null, null, null, 0.0f, false, false, null, false, 3583)));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m21326f0(Boolean bool) {
        C10454v0 c10454v0;
        Object value;
        InterfaceC19009W.b bVar;
        boolean zBooleanValue;
        do {
            c10454v0 = this.f59139u;
            value = c10454v0.getValue();
            bVar = (InterfaceC19009W.b) value;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = !bVar.f59289b;
            }
        } while (!c10454v0.mo12533d(value, InterfaceC19009W.b.m21365a(bVar, zBooleanValue, 0L, 0, null, null, null, 0.0f, false, false, null, false, 4093)));
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: g */
    public final void mo21327g() {
        this.f59113B.mo21361g();
        mo21322d0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r3.isTouchExplorationEnabled() == false) goto L19;
     */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21328g0(boolean z10) {
        C17060w c17060w = this.f59119H;
        if (z10 && ((InterfaceC19009W.b) this.f59139u.getValue()).f59289b) {
            try {
                Object systemService = this.f59126h.f15903a.getSystemService("accessibility");
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                if (accessibilityManager != null) {
                    if (accessibilityManager.isEnabled()) {
                    }
                }
            } catch (Exception unused) {
                C4737a.f15902b.getClass();
            }
            c17060w.m19505a();
            return;
        }
        c17060w.m19506b();
    }

    @Override // p843wd.InterfaceC19009W
    public final InterfaceC10452u0<Long> getCurrentTime() {
        return this.f59144z;
    }

    @Override // p114G5.InterfaceC1715c
    public final InterfaceC5862d getLifecycle() {
        return this.f59120b.getLifecycle();
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: h */
    public final InterfaceC19011Y mo21329h() {
        return this.f59125g;
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: i */
    public final void mo21330i() {
        f59110I.mo2258d("pauseToggle", new Object[0]);
        this.f59113B.mo21362i();
        mo21322d0();
        m21325f();
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: j */
    public final void mo21331j() {
        this.f59136r.mo13184b(this.f59122d.f7215a);
    }

    @Override // p843wd.InterfaceC19009W
    /* JADX INFO: renamed from: k */
    public final InterfaceC0706g mo21332k() {
        return this.f59124f;
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: l */
    public final void mo21333l() {
        m21308R(InterfaceC19009W.c.b.f59301b);
        this.f59117F.f2628D.m5182a(new C0729V(new InterfaceC0750i.b.h(this.f59113B.mo21360f())), new C0730W());
    }

    @Override // p843wd.InterfaceC19008V
    /* JADX INFO: renamed from: m */
    public final void mo21334m(long j10) {
        C10454v0 c10454v0;
        Object value;
        do {
            c10454v0 = this.f59139u;
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, InterfaceC19009W.b.m21365a((InterfaceC19009W.b) value, false, j10, 0, null, null, null, 0.0f, false, false, null, false, 4091)));
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: n */
    public final InterfaceC5655c mo795n() {
        return this.f59120b.mo795n();
    }

    @Override // p843wd.InterfaceC19004Q
    public final void next() {
        f59110I.mo2258d(ES6Iterator.NEXT_METHOD, new Object[0]);
        m21308R(InterfaceC19009W.c.b.f59302c);
        C19032j0 c19032j0 = this.f59115D;
        InterfaceC0706g interfaceC0706g = c19032j0.f59397c;
        C2182j c2182j = c19032j0.f59396b;
        interfaceC0706g.mo1244j(C3324a.m4062b(c2182j), C3974S.m4698a(c2182j.f7216b));
        C7106g.m8045c(this.f59138t, null, null, new b(null, this), 3);
    }

    @Override // p843wd.InterfaceC19008V
    public final void onRenderedFirstFrame() {
        this.f59125g.mo21346c();
    }

    @Override // p843wd.InterfaceC19004Q
    public final void pause() {
        f59110I.mo2258d("pause", new Object[0]);
        this.f59113B.pause();
        mo21322d0();
        m21325f();
    }

    @Override // p843wd.InterfaceC19008V
    /* JADX INFO: renamed from: q */
    public final void mo21336q(InterfaceC2178f.d dVar, Exception exc) {
        Objects.toString(dVar);
        f59110I.getClass();
        this.f59125g.mo21348e();
        this.f59123e.mo2828c(this.f59122d, dVar, exc);
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: r */
    public final InterfaceC2179g mo21337r() {
        return this.f59123e;
    }

    @Override // p843wd.InterfaceC19004Q
    public final void resume() {
        f59110I.mo2258d("resume", new Object[0]);
        this.f59113B.resume();
        mo21322d0();
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: s */
    public final InterfaceC10452u0<Boolean> mo21338s() {
        return this.f59143y;
    }

    @Override // p843wd.InterfaceC19004Q
    public final void skip() {
        Object value;
        C10454v0 c10454v0 = this.f59139u;
        C2965q c2965q = ((InterfaceC19009W.b) c10454v0.getValue()).f59298k;
        if (c2965q != null) {
            long j10 = ((long) c2965q.f9820b) * ((long) 1000);
            this.f59113B.mo21358d(j10);
            this.f59116E.mo21335p(j10);
        }
        do {
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, InterfaceC19009W.b.m21365a((InterfaceC19009W.b) value, false, 0L, 0, null, null, null, 0.0f, false, false, null, false, 1023)));
    }

    @Override // p843wd.InterfaceC19008V
    /* JADX INFO: renamed from: t */
    public final void mo21339t(boolean z10) {
        Object value;
        C10454v0 c10454v0 = this.f59139u;
        if ((((InterfaceC19009W.b) c10454v0.getValue()).f59292e instanceof InterfaceC19009W.c.C21257c) != z10) {
            InterfaceC19009W.c cVar = z10 ? InterfaceC19009W.c.C21257c.f59304a : InterfaceC19009W.c.b.f59302c;
            do {
                value = c10454v0.getValue();
            } while (!c10454v0.mo12533d(value, InterfaceC19009W.b.m21365a((InterfaceC19009W.b) value, false, 0L, 0, cVar, null, null, 0.0f, false, false, null, false, 4079)));
        }
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: u */
    public final C1719g mo796u() {
        return this.f59120b.mo796u();
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: v */
    public final void mo21340v() {
        C7106g.m8045c(this.f59138t, null, null, new a(null, this), 3);
    }

    @Override // p843wd.InterfaceC19008V
    /* JADX INFO: renamed from: w */
    public final void mo21341w(long j10) {
        C10454v0 c10454v0 = this.f59142x;
        if (((Number) c10454v0.getValue()).longValue() != j10) {
            Long lValueOf = Long.valueOf(j10);
            c10454v0.getClass();
            c10454v0.m12579l(null, lValueOf);
        }
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: x */
    public final InterfaceC6450f mo797x() {
        return this.f59120b.mo797x();
    }

    @Override // p843wd.InterfaceC19004Q
    /* JADX INFO: renamed from: y */
    public final void mo21342y() {
        m21308R(InterfaceC19009W.c.b.f59301b);
        this.f59117F.f2630F.m5182a(new C0733Z(InterfaceC0750i.b.g.INSTANCE), new C0735a0());
    }

    @Override // p843wd.InterfaceC19008V
    /* JADX INFO: renamed from: z */
    public final void mo21343z(InterfaceC2930N interfaceC2930N) {
        m21326f0(Boolean.FALSE);
        AtomicLong atomicLong = this.f59112A.f59436a;
        long j10 = atomicLong.get();
        atomicLong.set(0L);
        C19044p0.f59435b.mo2258d(C10678v.m12741a(j10, "Reset time, oldValue:"), new Object[0]);
        this.f59125g.mo21344a(interfaceC2930N.mo3655a());
    }

    @Override // p843wd.InterfaceC19008V
    /* JADX INFO: renamed from: p */
    public final /* bridge */ void mo21335p(long j10) {
    }
}
