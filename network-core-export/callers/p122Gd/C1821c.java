package p122Gd;

import ad.C7191I;
import ba.AbstractC8110g;
import ch.C8484c;
import ch.C8485d;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p017Ag.C0164v;
import p053Cg.C0794f;
import p086Ed.C1333C;
import p114G5.C1719g;
import p114G5.InterfaceC1715c;
import p366U5.InterfaceC5372f;
import p384V5.InterfaceC5655c;
import p402W5.InterfaceC5862d;
import p420X5.C6224b;
import p430Xf.InterfaceC6332c;
import p438Y5.InterfaceC6450f;
import p450Z.C6620c;
import p450Z.C6625h;
import p450Z.C6628k;
import p478aa.C7101e0;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p480ah.InterfaceC7360f;
import p524da.C10427i;
import p524da.C10428i0;
import p524da.C10454v0;
import p524da.C10456w0;
import p524da.InterfaceC10424g0;
import p524da.InterfaceC10444q0;
import p524da.InterfaceC10452u0;
import p558fa.C11095d;
import p558fa.C11109r;
import p589ha.C11865c;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Gd.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEmailComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailComponent.kt\nru/zona/app/components/profile/login/EmailComponent\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n49#2:150\n51#2:154\n45#3:151\n49#3:153\n105#4:152\n172#5,8:155\n172#5,8:173\n230#6,5:163\n230#6,5:168\n230#6,5:181\n1960#7,3:186\n1960#7,3:190\n1#8:189\n*S KotlinDebug\n*F\n+ 1 EmailComponent.kt\nru/zona/app/components/profile/login/EmailComponent\n*L\n55#1:150\n55#1:154\n55#1:151\n55#1:153\n55#1:152\n72#1:155,8\n128#1:173,8\n78#1:163,5\n88#1:168,5\n129#1:181,5\n134#1:186,3\n144#1:190,3\n*E\n"})
public final class C1821c implements InterfaceC1827f, InterfaceC1715c {

    /* JADX INFO: renamed from: o */
    public static final Regex f6113o = new Regex("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", RegexOption.IGNORE_CASE);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1715c f6114b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7360f f6115c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6332c f6116d;

    /* JADX INFO: renamed from: e */
    public final C1333C f6117e;

    /* JADX INFO: renamed from: f */
    public final C1794C f6118f;

    /* JADX INFO: renamed from: g */
    public final C1795D f6119g;

    /* JADX INFO: renamed from: h */
    public final C11095d f6120h;

    /* JADX INFO: renamed from: i */
    public final C10454v0 f6121i;

    /* JADX INFO: renamed from: j */
    public final C10428i0 f6122j;

    /* JADX INFO: renamed from: k */
    public final C6625h f6123k;

    /* JADX INFO: renamed from: l */
    public final C10428i0 f6124l;

    /* JADX INFO: renamed from: m */
    public final C0164v f6125m;

    /* JADX INFO: renamed from: n */
    public final C0164v f6126n;

    /* JADX INFO: renamed from: Gd.c$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.profile.login.EmailComponent$done$2", m18778f = "EmailComponent.kt", m18779i = {1, 2, 3, 3, 3}, m18780l = {93, 108, 109, 116}, m18781m = "invokeSuspend", m18782n = {"e", "e", "$this$update$iv", "prevValue$iv", "it"}, m18783nl = {103, 109, 107, 115}, m18784s = {"L$0", "L$0", "L$0", "L$1", "L$2"}, m18785v = 2)
    @SourceDebugExtension({"SMAP\nEmailComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailComponent.kt\nru/zona/app/components/profile/login/EmailComponent$done$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,149:1\n230#2,5:150\n230#2,5:155\n*S KotlinDebug\n*F\n+ 1 EmailComponent.kt\nru/zona/app/components/profile/login/EmailComponent$done$2\n*L\n105#1:150,5\n114#1:155,5\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f6127j;

        /* JADX INFO: renamed from: k */
        public Object f6128k;

        /* JADX INFO: renamed from: l */
        public Object f6129l;

        /* JADX INFO: renamed from: m */
        public InterfaceC1827f.a f6130m;

        /* JADX INFO: renamed from: n */
        public int f6131n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ boolean f6132o;

        /* JADX INFO: renamed from: p */
        public final /* synthetic */ C1821c f6133p;

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ boolean f6134q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ String f6135r;

        /* JADX INFO: renamed from: Gd.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @DebugMetadata(m18777c = "ru.zona.app.components.profile.login.EmailComponent$done$2$1", m18778f = "EmailComponent.kt", m18779i = {1}, m18780l = {94, 95}, m18781m = "invokeSuspend", m18782n = {"user"}, m18783nl = {95, 102}, m18784s = {"L$0"}, m18785v = 2)
        public static final class C21002a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: j */
            public Object f6136j;

            /* JADX INFO: renamed from: k */
            public int f6137k;

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ C1821c f6138l;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ String f6139m;

            /* JADX INFO: renamed from: Gd.c$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @DebugMetadata(m18777c = "ru.zona.app.components.profile.login.EmailComponent$done$2$1$1", m18778f = "EmailComponent.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
            public static final class C21003a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ C8484c f6140j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ C1821c f6141k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ String f6142l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C21003a(C8484c c8484c, C1821c c1821c, String str, Continuation<? super C21003a> continuation) {
                    super(2, continuation);
                    this.f6140j = c8484c;
                    this.f6141k = c1821c;
                    this.f6142l = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C21003a(this.f6140j, this.f6141k, this.f6142l, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
                    return ((C21003a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    boolean zM10355c = C8485d.m10355c(this.f6140j);
                    String str = this.f6142l;
                    C1821c c1821c = this.f6141k;
                    if (zM10355c) {
                        c1821c.f6119g.invoke(str);
                    } else {
                        c1821c.f6118f.invoke(str);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C21002a(C1821c c1821c, String str, Continuation<? super C21002a> continuation) {
                super(1, continuation);
                this.f6138l = c1821c;
                this.f6139m = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C21002a(this.f6138l, this.f6139m, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((C21002a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
            
                if (p478aa.C7106g.m8048f(r1, r5, r7) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f6137k;
                String str = this.f6139m;
                C1821c c1821c = this.f6138l;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC7360f interfaceC7360f = c1821c.f6115c;
                    this.f6137k = 1;
                    obj = interfaceC7360f.mo8170f(str, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
                C8484c c8484c = (C8484c) obj;
                C11865c c11865c = C7101e0.f23142a;
                AbstractC8110g abstractC8110g = C11109r.f34545a;
                C21003a c21003a = new C21003a(c8484c, c1821c, str, null);
                this.f6136j = SpillingKt.nullOutSpilledVariable(c8484c);
                this.f6137k = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, C1821c c1821c, boolean z11, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6132o = z10;
            this.f6133p = c1821c;
            this.f6134q = z11;
            this.f6135r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f6132o, this.f6133p, this.f6134q, this.f6135r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0120  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        
            if (r1.mo12533d(r3, p122Gd.InterfaceC1827f.a.m2542a(r0, false, (java.lang.String) r12, 1)) != false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
        
            if (r12.m218a(r3, r11) == r2) goto L47;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a3 -> B:30:0x00a6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            InterfaceC6332c interfaceC6332c;
            Object value;
            String str;
            Object objM19462a;
            String str2;
            String str3;
            InterfaceC1827f.a aVar;
            Object obj2;
            C1821c c1821c = this.f6133p;
            InterfaceC10424g0 interfaceC10424g0 = c1821c.f6121i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6131n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f6132o || !(((str3 = ((InterfaceC1827f.a) c1821c.f6124l.f32389b.getValue()).f6180b) == null || StringsKt.isBlank(str3)) && this.f6134q)) {
                        C0164v c0164v = c1821c.f6125m;
                        C21002a c21002a = new C21002a(c1821c, this.f6135r, null);
                        this.f6131n = 1;
                    } else {
                        Object value2 = interfaceC10424g0.getValue();
                        aVar = (InterfaceC1827f.a) value2;
                        C16972W c16972w = (C16972W) C19285c2.f60035C0.getValue();
                        this.f6127j = interfaceC10424g0;
                        this.f6128k = value2;
                        this.f6129l = SpillingKt.nullOutSpilledVariable(aVar);
                        this.f6130m = aVar;
                        this.f6131n = 4;
                        Object objM19462a2 = C16973X.m19462a(c16972w, this);
                        if (objM19462a2 != coroutine_suspended) {
                            obj2 = value2;
                            obj = objM19462a2;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        InterfaceC6332c interfaceC6332c2 = (InterfaceC6332c) this.f6128k;
                        Exception exc2 = (Exception) this.f6127j;
                        ResultKt.throwOnFailure(obj);
                        interfaceC6332c = interfaceC6332c2;
                        exc = exc2;
                        str = (String) obj;
                        C16972W c16972w2 = (C16972W) C19140H5.f59850d0.getValue();
                        this.f6127j = SpillingKt.nullOutSpilledVariable(exc);
                        this.f6128k = interfaceC6332c;
                        this.f6129l = str;
                        this.f6131n = 3;
                        objM19462a = C16973X.m19462a(c16972w2, this);
                        if (objM19462a != coroutine_suspended) {
                            str2 = str;
                            obj = objM19462a;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 == 3) {
                        str2 = (String) this.f6129l;
                        interfaceC6332c = (InterfaceC6332c) this.f6128k;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = this.f6130m;
                        Object obj3 = this.f6128k;
                        InterfaceC10424g0 interfaceC10424g1 = (InterfaceC10424g0) this.f6127j;
                        ResultKt.throwOnFailure(obj);
                        obj2 = obj3;
                        interfaceC10424g0 = interfaceC10424g1;
                    }
                    interfaceC6332c.mo2537a(str2, (String) obj, "");
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            } catch (Exception e10) {
                if (Intrinsics.areEqual("emailIsInvalid", C0794f.m1296b(e10))) {
                    do {
                        value = interfaceC10424g0.getValue();
                    } while (!interfaceC10424g0.mo12533d(value, InterfaceC1827f.a.m2542a((InterfaceC1827f.a) value, false, null, 2)));
                } else {
                    InterfaceC6332c interfaceC6332c3 = c1821c.f6116d;
                    C16972W c16972w3 = (C16972W) C19278b3.f59976Y.getValue();
                    this.f6127j = SpillingKt.nullOutSpilledVariable(e10);
                    this.f6128k = interfaceC6332c3;
                    this.f6131n = 2;
                    Object objM19462a3 = C16973X.m19462a(c16972w3, this);
                    if (objM19462a3 != coroutine_suspended) {
                        exc = e10;
                        obj = objM19462a3;
                        interfaceC6332c = interfaceC6332c3;
                        str = (String) obj;
                        C16972W c16972w4 = (C16972W) C19140H5.f59850d0.getValue();
                        this.f6127j = SpillingKt.nullOutSpilledVariable(exc);
                        this.f6128k = interfaceC6332c;
                        this.f6129l = str;
                        this.f6131n = 3;
                        objM19462a = C16973X.m19462a(c16972w4, this);
                        if (objM19462a != coroutine_suspended) {
                            str2 = str;
                            obj = objM19462a;
                            interfaceC6332c.mo2537a(str2, (String) obj, "");
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public C1821c(InterfaceC7360f interfaceC7360f, C1822c0 c1822c0, C1333C c1333c, C1794C c1794c, C1795D c1795d, C7191I c7191i, InterfaceC1715c interfaceC1715c) {
        this.f6114b = interfaceC1715c;
        this.f6115c = interfaceC7360f;
        this.f6116d = c1822c0;
        this.f6117e = c1333c;
        this.f6118f = c1794c;
        this.f6119g = c1795d;
        C11095d c11095dM7048b = C6224b.m7048b(this);
        this.f6120h = c11095dM7048b;
        InterfaceC6450f interfaceC6450fMo797x = interfaceC1715c.mo797x();
        InterfaceC1827f.a.b bVar = InterfaceC1827f.a.Companion;
        InterfaceC1827f.a aVar = (InterfaceC1827f.a) interfaceC6450fMo797x.mo7215d("EMAIL_COMPONENT_STATE", bVar.serializer());
        C10454v0 c10454v0M12580a = C10456w0.m12580a(aVar == null ? new InterfaceC1827f.a(0) : aVar);
        this.f6121i = c10454v0M12580a;
        this.f6122j = C10427i.m12550p(new C1823d(c7191i), c11095dM7048b, InterfaceC10444q0.a.f32464a, CollectionsKt.emptyList());
        this.f6123k = new C6625h(null, 3);
        this.f6124l = C10427i.m12535a(c10454v0M12580a);
        C0164v c0164v = new C0164v();
        this.f6125m = c0164v;
        this.f6126n = c0164v;
        interfaceC1715c.mo797x().mo7214c("EMAIL_COMPONENT_STATE", bVar.serializer(), new Function0() { // from class: Gd.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (InterfaceC1827f.a) this.f6112b.f6124l.f32389b.getValue();
            }
        });
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: K */
    public final InterfaceC5372f mo793K() {
        return this.f6114b.mo793K();
    }

    @Override // p122Gd.InterfaceC1827f
    /* JADX INFO: renamed from: a */
    public final Function0<Unit> mo2529a() {
        return this.f6117e;
    }

    @Override // p122Gd.InterfaceC1827f
    /* JADX INFO: renamed from: b */
    public final C0164v mo2530b() {
        return this.f6126n;
    }

    @Override // p122Gd.InterfaceC1827f
    /* JADX INFO: renamed from: c */
    public final C6625h mo2531c() {
        return this.f6123k;
    }

    @Override // p122Gd.InterfaceC1827f
    /* JADX INFO: renamed from: d */
    public final void mo2532d(String str) {
        C6625h c6625h = this.f6123k;
        C6620c c6620cM7431f = c6625h.m7431f();
        try {
            c6620cM7431f.m7420c(0, c6620cM7431f.f21686c.length(), str);
            c6625h.m7427b(c6620cM7431f);
            c6625h.m7430e(false);
            mo2536h();
        } catch (Throwable th) {
            c6625h.m7430e(false);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x015c A[LOOP:1: B:28:0x007e->B:76:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x015a A[SYNTHETIC] */
    @Override // p122Gd.InterfaceC1827f
    /* JADX INFO: renamed from: e */
    public final void mo2533e() {
        boolean z10;
        String strConcat;
        int length;
        int i10;
        boolean z11;
        C10454v0 c10454v0;
        Object value;
        String string = this.f6123k.m7428c().f21694d.toString();
        boolean zMatches = f6113o.matches(string);
        C10428i0 c10428i0 = this.f6122j;
        Iterable iterable = (Iterable) c10428i0.f32389b.getValue();
        int i11 = 1;
        char c10 = 0;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (StringsKt__StringsJVMKt.endsWith$default(string, (String) it.next(), false, 2, null)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(string, "@", "");
        if (strSubstringAfterLast.length() <= 0) {
            strSubstringAfterLast = null;
        }
        if (strSubstringAfterLast == null || (strConcat = "@".concat(strSubstringAfterLast)) == null) {
            strConcat = "";
        }
        Iterable iterable2 = (Iterable) c10428i0.f32389b.getValue();
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            z10 = z10;
            i10 = 2;
            z11 = false;
            break;
        }
        Iterator it2 = iterable2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z10 = z10;
                i10 = 2;
                z11 = false;
                break;
            }
            String str = (String) it2.next();
            if (Intrinsics.areEqual(strConcat, str)) {
                i10 = 2;
                length = 0;
            } else {
                if (strConcat.length() == 0) {
                    length = str.length();
                } else {
                    if (str.length() == 0) {
                        length = strConcat.length();
                    } else {
                        int length2 = strConcat.length() + i11;
                        int[][] iArr = new int[length2][];
                        for (int i12 = 0; i12 < length2; i12++) {
                            iArr[i12] = new int[str.length() + i11];
                        }
                        int length3 = strConcat.length();
                        if (length3 >= 0) {
                            int i13 = 0;
                            while (true) {
                                iArr[i13][c10] = i13;
                                if (i13 == length3) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        int length4 = str.length();
                        if (length4 >= 0) {
                            int i14 = 0;
                            while (true) {
                                iArr[c10][i14] = i14;
                                if (i14 == length4) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                        int length5 = strConcat.length();
                        if (i11 <= length5) {
                            int i15 = 1;
                            while (true) {
                                int length6 = str.length();
                                if (i11 <= length6) {
                                    int i16 = 1;
                                    while (true) {
                                        int i17 = i15 - 1;
                                        int i18 = i16 - 1;
                                        int i19 = strConcat.charAt(i17) == str.charAt(i18) ? 0 : 1;
                                        int[] iArr2 = iArr[i15];
                                        int[] iArr3 = iArr[i17];
                                        it2 = it2;
                                        z10 = z10;
                                        iArr2[i16] = Math.min(iArr3[i16] + 1, Math.min(iArr2[i18] + 1, iArr3[i18] + i19));
                                        if (i16 == length6) {
                                            break;
                                        }
                                        i16++;
                                        it2 = it2;
                                        z10 = z10;
                                    }
                                } else {
                                    it2 = it2;
                                    z10 = z10;
                                }
                                if (i15 == length5) {
                                    break;
                                }
                                i15++;
                                it2 = it2;
                                z10 = z10;
                                i11 = 1;
                            }
                        } else {
                            it2 = it2;
                            z10 = z10;
                        }
                        length = iArr[strConcat.length()][str.length()];
                        i10 = 2;
                    }
                    if (length <= i10) {
                        z11 = true;
                        break;
                    }
                    it2 = it2;
                    z10 = z10;
                    i11 = 1;
                    c10 = 0;
                }
                i10 = 2;
            }
            if (length <= i10) {
                z11 = true;
                break;
            }
            it2 = it2;
            z10 = z10;
            i11 = 1;
            c10 = 0;
        }
        do {
            c10454v0 = this.f6121i;
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, InterfaceC1827f.a.m2542a((InterfaceC1827f.a) value, zMatches, null, i10)));
        if (zMatches) {
            C7106g.m8045c(this.f6120h, null, null, new a(z10, this, z11, string, null), 3);
        }
    }

    @Override // p122Gd.InterfaceC1827f
    /* JADX INFO: renamed from: f */
    public final C10428i0 mo2534f() {
        return this.f6122j;
    }

    @Override // p122Gd.InterfaceC1827f
    /* JADX INFO: renamed from: g */
    public final void mo2535g(String str) {
        C10454v0 c10454v0;
        Object value;
        C6625h c6625h = this.f6123k;
        String str2 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(c6625h.m7428c().f21694d.toString(), new char[]{'@'}, false, 0, 6, (Object) null));
        if (str2 == null) {
            str2 = "";
        }
        String strM7436a = C6628k.m7436a(str2, str);
        boolean zMatches = f6113o.matches(strM7436a);
        C6620c c6620cM7431f = c6625h.m7431f();
        try {
            c6620cM7431f.m7420c(0, c6620cM7431f.f21686c.length(), strM7436a);
            c6625h.m7427b(c6620cM7431f);
            c6625h.m7430e(false);
            do {
                c10454v0 = this.f6121i;
                value = c10454v0.getValue();
                ((InterfaceC1827f.a) value).getClass();
            } while (!c10454v0.mo12533d(value, new InterfaceC1827f.a(zMatches, null)));
        } catch (Throwable th) {
            c6625h.m7430e(false);
            throw th;
        }
    }

    @Override // p114G5.InterfaceC1715c
    public final InterfaceC5862d getLifecycle() {
        return this.f6114b.getLifecycle();
    }

    @Override // p122Gd.InterfaceC1827f
    public final InterfaceC10452u0<InterfaceC1827f.a> getState() {
        return this.f6124l;
    }

    @Override // p122Gd.InterfaceC1827f
    /* JADX INFO: renamed from: h */
    public final void mo2536h() {
        C10454v0 c10454v0;
        Object value;
        String str = ((InterfaceC1827f.a) this.f6124l.f32389b.getValue()).f6180b;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        do {
            c10454v0 = this.f6121i;
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, InterfaceC1827f.a.m2542a((InterfaceC1827f.a) value, false, null, 1)));
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: n */
    public final InterfaceC5655c mo795n() {
        return this.f6114b.mo795n();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: u */
    public final C1719g mo796u() {
        return this.f6114b.mo796u();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: x */
    public final InterfaceC6450f mo797x() {
        return this.f6114b.mo797x();
    }
}
