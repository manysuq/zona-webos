package p814uf;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import p017Ag.C0144b;
import p035Bg.InterfaceC0460k;
import p107Fg.C1634b;
import p107Fg.C1637e;
import p179Jg.C2616L;
import p179Jg.C2631j;
import p179Jg.EnumC2623b;
import p269Og.AbstractC4005l0;
import p374Ud.C5428u;
import p374Ud.C5429v;
import p478aa.C7101e0;
import p478aa.C7106g;
import p589ha.C11865c;
import p589ha.ExecutorC11864b;
import sg.C18204b;

/* JADX INFO: renamed from: uf.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.services.content.ContentApiWithCache$getMovieOrSerialByIdFromCache$2", m18778f = "ContentApiWithCache.kt", m18779i = {1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5}, m18780l = {57, 60, 64, 67, 70, 73}, m18781m = "invokeSuspend", m18782n = {"cachedItem", "cachedEntity", "cachedItem", "cachedEntity", "cachedItem", "cachedEntity", "cachedItem", "cachedEntity", "loadedEntity", "cachedItem", "cachedEntity", "e"}, m18783nl = {58, 61, 66, 69, 71, 74}, m18784s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, m18785v = 2)
public final class C18531e extends SuspendLambda implements Function2<String, Continuation<? super AbstractC4005l0>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f57892j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0460k f57893k;

    /* JADX INFO: renamed from: l */
    public Object f57894l;

    /* JADX INFO: renamed from: m */
    public int f57895m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C18530d f57896n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ String f57897o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ EnumC2623b f57898p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18531e(C18530d c18530d, String str, EnumC2623b enumC2623b, Continuation<? super C18531e> continuation) {
        super(2, continuation);
        this.f57896n = c18530d;
        this.f57897o = str;
        this.f57898p = enumC2623b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C18531e(this.f57896n, this.f57897o, this.f57898p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super AbstractC4005l0> continuation) {
        return ((C18531e) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad A[PHI: r1 r15
      0x00ad: PHI (r1v4 Bg.k) = (r1v2 Bg.k), (r1v5 Bg.k) binds: [B:30:0x00a9, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r15v5 uf.b) = (r15v4 uf.b), (r15v8 uf.b) binds: [B:30:0x00a9, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    /* JADX WARN: Code duplicated, block: B:49:0x015f A[Catch: Exception -> 0x0165, TRY_LEAVE, TryCatch #4 {Exception -> 0x0165, blocks: (B:46:0x014a, B:49:0x015f), top: B:76:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0100 A[EXC_TOP_SPLITTER, PHI: r1 r15
      0x0100: PHI (r1v6 Bg.k) = (r1v2 Bg.k), (r1v7 Bg.k) binds: [B:28:0x0080, B:38:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r15v9 uf.b) = (r15v4 uf.b), (r15v11 uf.b) binds: [B:28:0x0080, B:38:0x00f5] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0193, code lost:
    
        if (p107Fg.C1637e.m2266d(p814uf.C18530d.f57882f, p057D2.C1039b.m1629a("Load entity entityId:", r9, " is failed, e:", p053Cg.C0794f.m1297c(r0)), new java.lang.Object[0], r14) == r7) goto L63;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0082, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00c9, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        C18528b c18528b;
        InterfaceC0460k interfaceC0460k;
        C1634b c1634b;
        long jM26976getInWholeMillisecondsimpl;
        C1634b c1634b2;
        C18528b c18528b2;
        C18528b c18528b3;
        Object objM20535d;
        C18528b c18528b4;
        InterfaceC0460k interfaceC0460k2;
        AbstractC4005l0 abstractC4005l0;
        Object objM8048f;
        C18530d c18530d = this.f57896n;
        C5429v c5429v = c18530d.f57884b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f57895m;
        EnumC2623b enumC2623b = this.f57898p;
        String str = this.f57897o;
        switch (i10) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.f57895m = 1;
                obj = c5429v.m6150a(str, enumC2623b, this);
                if (obj != coroutine_suspended) {
                    c18528b = (C18528b) obj;
                    if (c18528b != null) {
                        interfaceC0460k = c18528b.f57869a;
                    } else {
                        interfaceC0460k = null;
                    }
                    if (interfaceC0460k != null) {
                        c1634b = C18530d.f57882f;
                        this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                        this.f57893k = interfaceC0460k;
                        this.f57895m = 2;
                        c1634b.getClass();
                        if (C1637e.m2263a(c1634b, "Cached entity " + str + " is found", new Object[0], this) != coroutine_suspended) {
                            jM26976getInWholeMillisecondsimpl = Duration.m26976getInWholeMillisecondsimpl(c18530d.f57886d) + interfaceC0460k.getData().mo814a();
                            C0144b.f484a.getClass();
                            if (jM26976getInWholeMillisecondsimpl >= System.currentTimeMillis()) {
                                return interfaceC0460k.getData().getData();
                            }
                            c1634b2 = C18530d.f57882f;
                            this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                            this.f57893k = interfaceC0460k;
                            this.f57895m = 3;
                            c1634b2.getClass();
                            if (C1637e.m2263a(c1634b2, "Cached entity " + str + " is expired", new Object[0], this) != coroutine_suspended) {
                                c18528b2 = c18528b;
                                c18528b = c18528b2;
                                try {
                                    C18204b c18204b = c18530d.f57883a;
                                    C2631j c2631j = new C2631j(str, enumC2623b);
                                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                                    this.f57893k = interfaceC0460k;
                                    this.f57895m = 4;
                                    c18204b.getClass();
                                    objM20535d = c18204b.m20535d("/getMovieOrSerialById", c2631j, C2616L.Companion.serializer(), this);
                                    if (objM20535d != coroutine_suspended) {
                                        c18528b4 = c18528b;
                                        obj = objM20535d;
                                        interfaceC0460k2 = interfaceC0460k;
                                        try {
                                            abstractC4005l0 = (AbstractC4005l0) CollectionsKt.first((List) ((C2616L) obj).f8769a);
                                            String id2 = abstractC4005l0.getId();
                                            this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b4);
                                            this.f57893k = interfaceC0460k2;
                                            this.f57894l = abstractC4005l0;
                                            this.f57895m = 5;
                                            try {
                                                C11865c c11865c = C7101e0.f23142a;
                                                objM8048f = C7106g.m8048f(ExecutorC11864b.f37309c, new C5428u(c5429v, id2, abstractC4005l0, enumC2623b, null), this);
                                                if (objM8048f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                    objM8048f = Unit.INSTANCE;
                                                    break;
                                                }
                                                if (objM8048f == coroutine_suspended) {
                                                    return abstractC4005l0;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                interfaceC0460k = interfaceC0460k2;
                                                c18528b3 = c18528b4;
                                                this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b3);
                                                this.f57893k = interfaceC0460k;
                                                this.f57894l = e;
                                                this.f57895m = 6;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    c18528b3 = c18528b;
                                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b3);
                                    this.f57893k = interfaceC0460k;
                                    this.f57894l = e;
                                    this.f57895m = 6;
                                }
                            }
                        }
                    } else {
                        C18204b c18204b2 = c18530d.f57883a;
                        C2631j c2631j2 = new C2631j(str, enumC2623b);
                        this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                        this.f57893k = interfaceC0460k;
                        this.f57895m = 4;
                        c18204b2.getClass();
                        objM20535d = c18204b2.m20535d("/getMovieOrSerialById", c2631j2, C2616L.Companion.serializer(), this);
                        if (objM20535d != coroutine_suspended) {
                            c18528b4 = c18528b;
                            obj = objM20535d;
                            interfaceC0460k2 = interfaceC0460k;
                            abstractC4005l0 = (AbstractC4005l0) CollectionsKt.first((List) ((C2616L) obj).f8769a);
                            String id3 = abstractC4005l0.getId();
                            this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b4);
                            this.f57893k = interfaceC0460k2;
                            this.f57894l = abstractC4005l0;
                            this.f57895m = 5;
                            C11865c c11865c2 = C7101e0.f23142a;
                            objM8048f = C7106g.m8048f(ExecutorC11864b.f37309c, new C5428u(c5429v, id3, abstractC4005l0, enumC2623b, null), this);
                            if (objM8048f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objM8048f = Unit.INSTANCE;
                                break;
                            }
                            if (objM8048f == coroutine_suspended) {
                                return abstractC4005l0;
                            }
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(obj);
                c18528b = (C18528b) obj;
                if (c18528b != null) {
                    interfaceC0460k = c18528b.f57869a;
                } else {
                    interfaceC0460k = null;
                }
                if (interfaceC0460k != null) {
                    c1634b = C18530d.f57882f;
                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                    this.f57893k = interfaceC0460k;
                    this.f57895m = 2;
                    c1634b.getClass();
                    if (C1637e.m2263a(c1634b, "Cached entity " + str + " is found", new Object[0], this) != coroutine_suspended) {
                        jM26976getInWholeMillisecondsimpl = Duration.m26976getInWholeMillisecondsimpl(c18530d.f57886d) + interfaceC0460k.getData().mo814a();
                        C0144b.f484a.getClass();
                        if (jM26976getInWholeMillisecondsimpl >= System.currentTimeMillis()) {
                            return interfaceC0460k.getData().getData();
                        }
                        c1634b2 = C18530d.f57882f;
                        this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                        this.f57893k = interfaceC0460k;
                        this.f57895m = 3;
                        c1634b2.getClass();
                        if (C1637e.m2263a(c1634b2, "Cached entity " + str + " is expired", new Object[0], this) != coroutine_suspended) {
                            c18528b2 = c18528b;
                            c18528b = c18528b2;
                            C18204b c18204b3 = c18530d.f57883a;
                            C2631j c2631j3 = new C2631j(str, enumC2623b);
                            this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                            this.f57893k = interfaceC0460k;
                            this.f57895m = 4;
                            c18204b3.getClass();
                            objM20535d = c18204b3.m20535d("/getMovieOrSerialById", c2631j3, C2616L.Companion.serializer(), this);
                            if (objM20535d != coroutine_suspended) {
                                c18528b4 = c18528b;
                                obj = objM20535d;
                                interfaceC0460k2 = interfaceC0460k;
                                abstractC4005l0 = (AbstractC4005l0) CollectionsKt.first((List) ((C2616L) obj).f8769a);
                                String id4 = abstractC4005l0.getId();
                                this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b4);
                                this.f57893k = interfaceC0460k2;
                                this.f57894l = abstractC4005l0;
                                this.f57895m = 5;
                                C11865c c11865c3 = C7101e0.f23142a;
                                objM8048f = C7106g.m8048f(ExecutorC11864b.f37309c, new C5428u(c5429v, id4, abstractC4005l0, enumC2623b, null), this);
                                if (objM8048f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objM8048f = Unit.INSTANCE;
                                    break;
                                }
                                if (objM8048f == coroutine_suspended) {
                                    return abstractC4005l0;
                                }
                            }
                        }
                    }
                } else {
                    C18204b c18204b4 = c18530d.f57883a;
                    C2631j c2631j4 = new C2631j(str, enumC2623b);
                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                    this.f57893k = interfaceC0460k;
                    this.f57895m = 4;
                    c18204b4.getClass();
                    objM20535d = c18204b4.m20535d("/getMovieOrSerialById", c2631j4, C2616L.Companion.serializer(), this);
                    if (objM20535d != coroutine_suspended) {
                        c18528b4 = c18528b;
                        obj = objM20535d;
                        interfaceC0460k2 = interfaceC0460k;
                        abstractC4005l0 = (AbstractC4005l0) CollectionsKt.first((List) ((C2616L) obj).f8769a);
                        String id5 = abstractC4005l0.getId();
                        this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b4);
                        this.f57893k = interfaceC0460k2;
                        this.f57894l = abstractC4005l0;
                        this.f57895m = 5;
                        C11865c c11865c4 = C7101e0.f23142a;
                        objM8048f = C7106g.m8048f(ExecutorC11864b.f37309c, new C5428u(c5429v, id5, abstractC4005l0, enumC2623b, null), this);
                        if (objM8048f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objM8048f = Unit.INSTANCE;
                            break;
                        }
                        if (objM8048f == coroutine_suspended) {
                            return abstractC4005l0;
                        }
                    }
                }
                return coroutine_suspended;
            case 2:
                interfaceC0460k = this.f57893k;
                C18528b c18528b5 = (C18528b) this.f57892j;
                ResultKt.throwOnFailure(obj);
                c18528b = c18528b5;
                jM26976getInWholeMillisecondsimpl = Duration.m26976getInWholeMillisecondsimpl(c18530d.f57886d) + interfaceC0460k.getData().mo814a();
                C0144b.f484a.getClass();
                if (jM26976getInWholeMillisecondsimpl >= System.currentTimeMillis()) {
                    return interfaceC0460k.getData().getData();
                }
                c1634b2 = C18530d.f57882f;
                this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                this.f57893k = interfaceC0460k;
                this.f57895m = 3;
                c1634b2.getClass();
                if (C1637e.m2263a(c1634b2, "Cached entity " + str + " is expired", new Object[0], this) != coroutine_suspended) {
                    c18528b2 = c18528b;
                    c18528b = c18528b2;
                    C18204b c18204b5 = c18530d.f57883a;
                    C2631j c2631j5 = new C2631j(str, enumC2623b);
                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                    this.f57893k = interfaceC0460k;
                    this.f57895m = 4;
                    c18204b5.getClass();
                    objM20535d = c18204b5.m20535d("/getMovieOrSerialById", c2631j5, C2616L.Companion.serializer(), this);
                    if (objM20535d != coroutine_suspended) {
                        c18528b4 = c18528b;
                        obj = objM20535d;
                        interfaceC0460k2 = interfaceC0460k;
                        abstractC4005l0 = (AbstractC4005l0) CollectionsKt.first((List) ((C2616L) obj).f8769a);
                        String id6 = abstractC4005l0.getId();
                        this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b4);
                        this.f57893k = interfaceC0460k2;
                        this.f57894l = abstractC4005l0;
                        this.f57895m = 5;
                        C11865c c11865c5 = C7101e0.f23142a;
                        objM8048f = C7106g.m8048f(ExecutorC11864b.f37309c, new C5428u(c5429v, id6, abstractC4005l0, enumC2623b, null), this);
                        if (objM8048f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objM8048f = Unit.INSTANCE;
                            break;
                        }
                        if (objM8048f == coroutine_suspended) {
                            return abstractC4005l0;
                        }
                    }
                }
                return coroutine_suspended;
            case 3:
                interfaceC0460k = this.f57893k;
                c18528b2 = (C18528b) this.f57892j;
                ResultKt.throwOnFailure(obj);
                c18528b = c18528b2;
                C18204b c18204b6 = c18530d.f57883a;
                C2631j c2631j6 = new C2631j(str, enumC2623b);
                this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b);
                this.f57893k = interfaceC0460k;
                this.f57895m = 4;
                c18204b6.getClass();
                objM20535d = c18204b6.m20535d("/getMovieOrSerialById", c2631j6, C2616L.Companion.serializer(), this);
                if (objM20535d != coroutine_suspended) {
                    c18528b4 = c18528b;
                    obj = objM20535d;
                    interfaceC0460k2 = interfaceC0460k;
                    abstractC4005l0 = (AbstractC4005l0) CollectionsKt.first((List) ((C2616L) obj).f8769a);
                    String id7 = abstractC4005l0.getId();
                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b4);
                    this.f57893k = interfaceC0460k2;
                    this.f57894l = abstractC4005l0;
                    this.f57895m = 5;
                    C11865c c11865c6 = C7101e0.f23142a;
                    objM8048f = C7106g.m8048f(ExecutorC11864b.f37309c, new C5428u(c5429v, id7, abstractC4005l0, enumC2623b, null), this);
                    if (objM8048f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM8048f = Unit.INSTANCE;
                        break;
                    }
                    if (objM8048f == coroutine_suspended) {
                        return abstractC4005l0;
                    }
                }
                return coroutine_suspended;
            case 4:
                interfaceC0460k = this.f57893k;
                C18528b c18528b6 = (C18528b) this.f57892j;
                try {
                    ResultKt.throwOnFailure(obj);
                    c18528b4 = c18528b6;
                    interfaceC0460k2 = interfaceC0460k;
                    abstractC4005l0 = (AbstractC4005l0) CollectionsKt.first((List) ((C2616L) obj).f8769a);
                    String id8 = abstractC4005l0.getId();
                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b4);
                    this.f57893k = interfaceC0460k2;
                    this.f57894l = abstractC4005l0;
                    this.f57895m = 5;
                    C11865c c11865c7 = C7101e0.f23142a;
                    objM8048f = C7106g.m8048f(ExecutorC11864b.f37309c, new C5428u(c5429v, id8, abstractC4005l0, enumC2623b, null), this);
                    if (objM8048f != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM8048f = Unit.INSTANCE;
                        break;
                    }
                    if (objM8048f == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return abstractC4005l0;
                } catch (Exception e13) {
                    e = e13;
                    c18528b3 = c18528b6;
                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b3);
                    this.f57893k = interfaceC0460k;
                    this.f57894l = e;
                    this.f57895m = 6;
                }
                break;
            case 5:
                AbstractC4005l0 abstractC4005l1 = (AbstractC4005l0) this.f57894l;
                interfaceC0460k = this.f57893k;
                c18528b3 = (C18528b) this.f57892j;
                try {
                    ResultKt.throwOnFailure(obj);
                    return abstractC4005l1;
                } catch (Exception e14) {
                    e = e14;
                    this.f57892j = SpillingKt.nullOutSpilledVariable(c18528b3);
                    this.f57893k = interfaceC0460k;
                    this.f57894l = e;
                    this.f57895m = 6;
                }
                break;
            case 6:
                e = (Exception) this.f57894l;
                interfaceC0460k = this.f57893k;
                ResultKt.throwOnFailure(obj);
                if (interfaceC0460k != null) {
                    return interfaceC0460k.getData().getData();
                }
                throw e;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
