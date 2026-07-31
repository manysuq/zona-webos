package p814uf;

import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import p017Ag.C0144b;
import p035Bg.InterfaceC0458i;
import p035Bg.InterfaceC0460k;
import p089Eg.C1443c;
import p089Eg.C1446f;
import p107Fg.C1634b;
import p107Fg.C1637e;
import p179Jg.C2606B;
import p179Jg.C2616L;
import p179Jg.C2631j;
import p179Jg.C2636o;
import p179Jg.EnumC2623b;
import p179Jg.InterfaceC2640s;
import p269Og.AbstractC4005l0;
import p269Og.C3986c;
import p269Og.EnumC3994g;
import p374Ud.C5419l;
import p374Ud.C5429v;
import p770rf.C17944M;
import sg.C18204b;

/* JADX INFO: renamed from: uf.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C18530d implements InterfaceC2640s {

    /* JADX INFO: renamed from: f */
    public static final C1634b f57882f;

    /* JADX INFO: renamed from: a */
    public final C18204b f57883a;

    /* JADX INFO: renamed from: b */
    public final C5429v f57884b;

    /* JADX INFO: renamed from: c */
    public final C5419l f57885c;

    /* JADX INFO: renamed from: d */
    public final long f57886d;

    /* JADX INFO: renamed from: e */
    public final C1446f<String> f57887e = new C1446f<>();

    /* JADX INFO: renamed from: uf.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function2<C2636o, Continuation<? super C2606B>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C2636o c2636o, Continuation<? super C2606B> continuation) {
            return ((InterfaceC2640s) this.receiver).mo3381a(c2636o, continuation);
        }
    }

    /* JADX INFO: renamed from: uf.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.services.content.ContentApiWithCache", m18778f = "ContentApiWithCache.kt", m18779i = {0}, m18780l = {30}, m18781m = "getMovieOrSerialById", m18782n = {"params"}, m18783nl = {31}, m18784s = {"L$0"}, m18785v = 2)
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: j */
        public Object f57888j;

        /* JADX INFO: renamed from: k */
        public /* synthetic */ Object f57889k;

        /* JADX INFO: renamed from: m */
        public int f57891m;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57889k = obj;
            this.f57891m |= IntCompanionObject.MIN_VALUE;
            return C18530d.this.m20960e(null, this);
        }
    }

    /* JADX INFO: renamed from: uf.d$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function2<C2636o, Continuation<? super C2606B>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C2636o c2636o, Continuation<? super C2606B> continuation) {
            return ((InterfaceC2640s) this.receiver).mo3382b(c2636o, continuation);
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C18530d.class).getSimpleName();
        f57882f = new C1634b();
    }

    public C18530d(C18204b c18204b, C5429v c5429v, C5419l c5419l, long j10) {
        this.f57883a = c18204b;
        this.f57884b = c5429v;
        this.f57885c = c5419l;
        this.f57886d = j10;
    }

    @Override // p179Jg.InterfaceC2640s
    /* JADX INFO: renamed from: a */
    public final Object mo3381a(C2636o c2636o, Continuation<? super C2606B> continuation) {
        return m20959d(EnumC3994g.MOVIE, c2636o, this.f57885c, new a(2, this.f57883a, InterfaceC2640s.class, "getMovieIds", "getMovieIds(Lru/zona/content/api/GetPageParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), continuation);
    }

    @Override // p179Jg.InterfaceC2640s
    /* JADX INFO: renamed from: b */
    public final Object mo3382b(C2636o c2636o, Continuation<? super C2606B> continuation) {
        return m20959d(EnumC3994g.SERIAL, c2636o, this.f57885c, new c(2, this.f57883a, InterfaceC2640s.class, "getSerialIds", "getSerialIds(Lru/zona/content/api/GetPageParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), continuation);
    }

    @Override // p179Jg.InterfaceC2640s
    /* JADX INFO: renamed from: c */
    public final Object mo3383c(C3986c c3986c, C17944M.a.C21245a c21245a) {
        return this.f57883a.mo3383c(c3986c, c21245a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x017d  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ec A[PHI: r1 r2 r5 r6 r8 r9 r10 r11
      0x01ec: PHI (r1v8 java.util.List) = (r1v6 java.util.List), (r1v19 java.util.List) binds: [B:49:0x01e9, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r2v22 java.lang.Object) = (r2v21 java.lang.Object), (r2v1 java.lang.Object) binds: [B:49:0x01e9, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r5v11 Bg.k) = (r5v9 Bg.k), (r5v20 Bg.k) binds: [B:49:0x01e9, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r6v5 java.lang.String) = (r6v3 java.lang.String), (r6v9 java.lang.String) binds: [B:49:0x01e9, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r8v8 kotlin.jvm.functions.Function2) = (r8v6 kotlin.jvm.functions.Function2), (r8v12 kotlin.jvm.functions.Function2) binds: [B:49:0x01e9, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r9v6 ??) = (r9v11 ??), (r9v12 ??) binds: [B:49:0x01e9, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r10v6 Jg.o) = (r10v3 Jg.o), (r10v12 Jg.o) binds: [B:49:0x01e9, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r11v9 Og.g) = (r11v6 Og.g), (r11v16 Og.g) binds: [B:49:0x01e9, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0226 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [Ud.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, uf.k] */
    /* JADX INFO: renamed from: d */
    public final Object m20959d(EnumC3994g enumC3994g, C2636o c2636o, C5419l c5419l, Function2 function2, Continuation continuation) throws Throwable {
        C18529c c18529c;
        C2636o c2636o2;
        ?? r12;
        String str;
        Function2 function3;
        EnumC3994g enumC3994g2;
        String str2;
        Function2 function4;
        ?? r10;
        C2636o c2636o3;
        EnumC3994g enumC3994g3;
        List list;
        InterfaceC0460k interfaceC0460k;
        String str3;
        EnumC3994g enumC3994g4;
        C2636o c2636o4;
        ?? r13;
        Function2 function5;
        InterfaceC0458i data;
        long jM26976getInWholeMillisecondsimpl;
        Function2 function6;
        ?? r11;
        C2636o c2636o5;
        EnumC3994g enumC3994g5;
        ?? r14;
        C2606B c2606b;
        List<String> list2;
        if (continuation instanceof C18529c) {
            c18529c = (C18529c) continuation;
            int i10 = c18529c.f57881t;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c18529c.f57881t = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c18529c = new C18529c(this, continuation);
            }
        } else {
            c18529c = new C18529c(this, continuation);
        }
        Object objInvoke = c18529c.f57879r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c18529c.f57881t;
        C1634b c1634b = f57882f;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            String str4 = enumC3994g.f13137b + "|" + c2636o.hashCode();
            c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g);
            c2636o2 = c2636o;
            c18529c.f57872k = c2636o2;
            c18529c.f57873l = c5419l;
            c18529c.f57874m = function2;
            c18529c.f57875n = str4;
            c18529c.f57881t = 1;
            Object objM6149b = c5419l.m6149b(str4, c18529c);
            if (objM6149b != coroutine_suspended) {
                r12 = c5419l;
                str = str4;
                function3 = function2;
                enumC3994g2 = enumC3994g;
                objInvoke = objM6149b;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            str = (String) c18529c.f57875n;
            function3 = (Function2) c18529c.f57874m;
            InterfaceC18537k interfaceC18537k = (InterfaceC18537k) c18529c.f57873l;
            c2636o2 = (C2636o) c18529c.f57872k;
            enumC3994g2 = (EnumC3994g) c18529c.f57871j;
            ResultKt.throwOnFailure(objInvoke);
            r12 = interfaceC18537k;
        } else {
            if (i11 == 2) {
                list = (List) c18529c.f57877p;
                interfaceC0460k = (InterfaceC0460k) c18529c.f57876o;
                str3 = (String) c18529c.f57875n;
                function5 = (Function2) c18529c.f57874m;
                InterfaceC18537k interfaceC18537k2 = (InterfaceC18537k) c18529c.f57873l;
                c2636o4 = (C2636o) c18529c.f57872k;
                enumC3994g4 = (EnumC3994g) c18529c.f57871j;
                ResultKt.throwOnFailure(objInvoke);
                r13 = interfaceC18537k2;
                jM26976getInWholeMillisecondsimpl = Duration.m26976getInWholeMillisecondsimpl(this.f57886d) + interfaceC0460k.getData().mo814a();
                C0144b.f484a.getClass();
                if (jM26976getInWholeMillisecondsimpl < System.currentTimeMillis()) {
                    return new C2606B(list);
                }
                c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g4);
                c18529c.f57872k = c2636o4;
                c18529c.f57873l = r13;
                c18529c.f57874m = function5;
                c18529c.f57875n = str3;
                c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
                c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
                c18529c.f57881t = 3;
                c1634b.getClass();
                if (C1637e.m2263a(c1634b, "Cached ids is expired", new Object[0], c18529c) != coroutine_suspended) {
                    str2 = str3;
                    function6 = function5;
                    r11 = r13;
                    c2636o5 = c2636o4;
                    enumC3994g5 = enumC3994g4;
                    function4 = function6;
                    r10 = r11;
                    c2636o3 = c2636o5;
                    enumC3994g3 = enumC3994g5;
                    c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g3);
                    c18529c.f57872k = SpillingKt.nullOutSpilledVariable(c2636o3);
                    c18529c.f57873l = r10;
                    c18529c.f57874m = SpillingKt.nullOutSpilledVariable(function4);
                    c18529c.f57875n = str2;
                    c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
                    c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
                    c18529c.f57881t = 4;
                    objInvoke = function4.invoke(c2636o3, c18529c);
                    r14 = r10;
                    if (objInvoke != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 3) {
                list = (List) c18529c.f57877p;
                interfaceC0460k = (InterfaceC0460k) c18529c.f57876o;
                str2 = (String) c18529c.f57875n;
                function6 = (Function2) c18529c.f57874m;
                InterfaceC18537k interfaceC18537k3 = (InterfaceC18537k) c18529c.f57873l;
                c2636o5 = (C2636o) c18529c.f57872k;
                enumC3994g5 = (EnumC3994g) c18529c.f57871j;
                ResultKt.throwOnFailure(objInvoke);
                r11 = interfaceC18537k3;
                function4 = function6;
                r10 = r11;
                c2636o3 = c2636o5;
                enumC3994g3 = enumC3994g5;
                c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g3);
                c18529c.f57872k = SpillingKt.nullOutSpilledVariable(c2636o3);
                c18529c.f57873l = r10;
                c18529c.f57874m = SpillingKt.nullOutSpilledVariable(function4);
                c18529c.f57875n = str2;
                c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
                c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
                c18529c.f57881t = 4;
                objInvoke = function4.invoke(c2636o3, c18529c);
                r14 = r10;
                if (objInvoke != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2606B c2606b2 = c18529c.f57878q;
                ResultKt.throwOnFailure(objInvoke);
                return c2606b2;
            }
            list = (List) c18529c.f57877p;
            interfaceC0460k = (InterfaceC0460k) c18529c.f57876o;
            str2 = (String) c18529c.f57875n;
            function4 = (Function2) c18529c.f57874m;
            InterfaceC18537k interfaceC18537k4 = (InterfaceC18537k) c18529c.f57873l;
            c2636o3 = (C2636o) c18529c.f57872k;
            enumC3994g3 = (EnumC3994g) c18529c.f57871j;
            ResultKt.throwOnFailure(objInvoke);
            r14 = interfaceC18537k4;
        }
        c2606b = (C2606B) objInvoke;
        list2 = c2606b.f8750a;
        c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g3);
        c18529c.f57872k = SpillingKt.nullOutSpilledVariable(c2636o3);
        c18529c.f57873l = SpillingKt.nullOutSpilledVariable(r14);
        c18529c.f57874m = SpillingKt.nullOutSpilledVariable(function4);
        c18529c.f57875n = SpillingKt.nullOutSpilledVariable(str2);
        c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
        c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
        c18529c.f57878q = c2606b;
        c18529c.f57881t = 5;
        if (r14.mo6148a(str2, list2, c18529c) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return c2606b;
        InterfaceC0460k interfaceC0460k2 = (InterfaceC0460k) objInvoke;
        List list3 = (interfaceC0460k2 == null || (data = interfaceC0460k2.getData()) == null) ? null : (List) data.getData();
        if (list3 != null) {
            c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g2);
            c18529c.f57872k = c2636o2;
            c18529c.f57873l = r12;
            c18529c.f57874m = function3;
            c18529c.f57875n = str;
            c18529c.f57876o = interfaceC0460k2;
            c18529c.f57877p = list3;
            c18529c.f57881t = 2;
            c1634b.getClass();
            if (C1637e.m2263a(c1634b, "Cached ids is found", new Object[0], c18529c) != coroutine_suspended) {
                str3 = str;
                list = list3;
                enumC3994g4 = enumC3994g2;
                c2636o4 = c2636o2;
                r13 = r12;
                function5 = function3;
                interfaceC0460k = interfaceC0460k2;
                jM26976getInWholeMillisecondsimpl = Duration.m26976getInWholeMillisecondsimpl(this.f57886d) + interfaceC0460k.getData().mo814a();
                C0144b.f484a.getClass();
                if (jM26976getInWholeMillisecondsimpl < System.currentTimeMillis()) {
                    return new C2606B(list);
                }
                c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g4);
                c18529c.f57872k = c2636o4;
                c18529c.f57873l = r13;
                c18529c.f57874m = function5;
                c18529c.f57875n = str3;
                c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
                c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
                c18529c.f57881t = 3;
                c1634b.getClass();
                if (C1637e.m2263a(c1634b, "Cached ids is expired", new Object[0], c18529c) != coroutine_suspended) {
                    str2 = str3;
                    function6 = function5;
                    r11 = r13;
                    c2636o5 = c2636o4;
                    enumC3994g5 = enumC3994g4;
                    function4 = function6;
                    r10 = r11;
                    c2636o3 = c2636o5;
                    enumC3994g3 = enumC3994g5;
                    c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g3);
                    c18529c.f57872k = SpillingKt.nullOutSpilledVariable(c2636o3);
                    c18529c.f57873l = r10;
                    c18529c.f57874m = SpillingKt.nullOutSpilledVariable(function4);
                    c18529c.f57875n = str2;
                    c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
                    c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
                    c18529c.f57881t = 4;
                    objInvoke = function4.invoke(c2636o3, c18529c);
                    r14 = r10;
                    if (objInvoke != coroutine_suspended) {
                        c2606b = (C2606B) objInvoke;
                        list2 = c2606b.f8750a;
                        c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g3);
                        c18529c.f57872k = SpillingKt.nullOutSpilledVariable(c2636o3);
                        c18529c.f57873l = SpillingKt.nullOutSpilledVariable(r14);
                        c18529c.f57874m = SpillingKt.nullOutSpilledVariable(function4);
                        c18529c.f57875n = SpillingKt.nullOutSpilledVariable(str2);
                        c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
                        c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
                        c18529c.f57878q = c2606b;
                        c18529c.f57881t = 5;
                        if (r14.mo6148a(str2, list2, c18529c) == coroutine_suspended) {
                            return c2606b;
                        }
                    }
                }
            }
        } else {
            str2 = str;
            function4 = function3;
            r10 = r12;
            c2636o3 = c2636o2;
            enumC3994g3 = enumC3994g2;
            list = list3;
            interfaceC0460k = interfaceC0460k2;
            c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g3);
            c18529c.f57872k = SpillingKt.nullOutSpilledVariable(c2636o3);
            c18529c.f57873l = r10;
            c18529c.f57874m = SpillingKt.nullOutSpilledVariable(function4);
            c18529c.f57875n = str2;
            c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
            c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
            c18529c.f57881t = 4;
            objInvoke = function4.invoke(c2636o3, c18529c);
            r14 = r10;
            if (objInvoke != coroutine_suspended) {
                c2606b = (C2606B) objInvoke;
                list2 = c2606b.f8750a;
                c18529c.f57871j = SpillingKt.nullOutSpilledVariable(enumC3994g3);
                c18529c.f57872k = SpillingKt.nullOutSpilledVariable(c2636o3);
                c18529c.f57873l = SpillingKt.nullOutSpilledVariable(r14);
                c18529c.f57874m = SpillingKt.nullOutSpilledVariable(function4);
                c18529c.f57875n = SpillingKt.nullOutSpilledVariable(str2);
                c18529c.f57876o = SpillingKt.nullOutSpilledVariable(interfaceC0460k);
                c18529c.f57877p = SpillingKt.nullOutSpilledVariable(list);
                c18529c.f57878q = c2606b;
                c18529c.f57881t = 5;
                if (r14.mo6148a(str2, list2, c18529c) == coroutine_suspended) {
                    return c2606b;
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m20960e(C2631j c2631j, Continuation<? super C2616L> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f57891m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                bVar.f57891m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                bVar = new b((ContinuationImpl) continuation);
            }
        } else {
            bVar = new b((ContinuationImpl) continuation);
        }
        Object objM1983a = bVar.f57889k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f57891m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM1983a);
            String str = c2631j.f8837a;
            EnumC2623b enumC2623b = c2631j.f8838b;
            bVar.f57888j = SpillingKt.nullOutSpilledVariable(c2631j);
            bVar.f57891m = 1;
            objM1983a = C1443c.m1983a(this.f57887e, str, new C18531e(this, str, enumC2623b, null), bVar);
            if (objM1983a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM1983a);
        }
        return new C2616L(CollectionsKt.listOf((AbstractC4005l0) objM1983a));
    }
}
