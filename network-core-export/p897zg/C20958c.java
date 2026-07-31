package p897zg;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import p011Aa.C0113z;
import p017Ag.C0160r;
import p017Ag.C0168z;
import p064D9.C1084f;
import p064D9.C1086h;
import p064D9.C1090l;
import p064D9.InterfaceC1091m;
import p100F9.AbstractC1563d;
import p100F9.C1572m;
import p154I9.C2299M;
import p154I9.C2316c;
import p154I9.C2335u;
import p154I9.C2336v;
import p179Jg.C2624c;
import p208L9.AbstractC3289n;
import p208L9.C3288m;
import p280P9.C4189a;
import p370U9.C5393a;
import p734p9.C17564c;
import p748q9.C17743g;
import p863xg.C19688d;
import p863xg.C19689e;
import p863xg.C19691g;
import p863xg.C19694j;
import p863xg.C19695k;
import p863xg.C19696l;
import p863xg.C19698n;
import p863xg.C19699o;
import p863xg.C19701q;
import va.InterfaceC18717b;
import va.InterfaceC18731p;

/* JADX INFO: renamed from: zg.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nApiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClient.kt\nru/zona/commons/api/http/ApiClient\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 5 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n*L\n1#1,111:1\n615#2:112\n391#2,3:113\n616#2,3:116\n394#2,3:119\n43#2:122\n615#2:133\n391#2,3:134\n616#2,2:137\n618#2:163\n394#2,3:164\n43#2:167\n162#3:123\n69#4:124\n84#4,8:125\n69#4:143\n84#4,8:144\n16#5,4:139\n22#5,11:152\n*S KotlinDebug\n*F\n+ 1 ApiClient.kt\nru/zona/commons/api/http/ApiClient\n*L\n26#1:112\n26#1:113,3\n26#1:116,3\n26#1:119,3\n26#1:122\n104#1:133\n104#1:134,3\n104#1:137,2\n104#1:163\n104#1:164,3\n104#1:167\n33#1:123\n33#1:124\n33#1:125,8\n105#1:143\n105#1:144,8\n105#1:139,4\n105#1:152,11\n*E\n"})
public final class C20958c {

    /* JADX INFO: renamed from: a */
    public final C17564c f71949a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20965j f71950b;

    /* JADX INFO: renamed from: c */
    public final long f71951c = 10000;

    /* JADX INFO: renamed from: zg.c$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.commons.api.http.ApiClient", m18778f = "ApiClient.kt", m18779i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m18780l = {59, 58}, m18781m = "doGet", m18782n = {"urlPath", "params", "paramsSerializer", "resultDeserializer", "queryParamsBuilder", "urlPath", "params", "paramsSerializer", "resultDeserializer", "queryParamsBuilder"}, m18783nl = {60, -1}, m18784s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, m18785v = 2)
    public static final class a<P, R> extends ContinuationImpl {

        /* JADX INFO: renamed from: j */
        public Object f71952j;

        /* JADX INFO: renamed from: k */
        public Object f71953k;

        /* JADX INFO: renamed from: l */
        public Object f71954l;

        /* JADX INFO: renamed from: m */
        public Object f71955m;

        /* JADX INFO: renamed from: n */
        public Object f71956n;

        /* JADX INFO: renamed from: o */
        public C17564c f71957o;

        /* JADX INFO: renamed from: p */
        public /* synthetic */ Object f71958p;

        /* JADX INFO: renamed from: r */
        public int f71960r;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71958p = obj;
            this.f71960r |= IntCompanionObject.MIN_VALUE;
            return C20958c.this.m25471b(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zg.c$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.commons.api.http.ApiClient", m18778f = "ApiClient.kt", m18779i = {0, 0, 0, 0, 1, 1, 1, 1}, m18780l = {84, 83}, m18781m = "doPostAndParse", m18782n = {"urlPath", "body", "bodySerializer", "resultDeserializer", "urlPath", "body", "bodySerializer", "resultDeserializer"}, m18783nl = {83, -1}, m18784s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, m18785v = 2)
    public static final class b<P, R> extends ContinuationImpl {

        /* JADX INFO: renamed from: j */
        public Object f71961j;

        /* JADX INFO: renamed from: k */
        public Object f71962k;

        /* JADX INFO: renamed from: l */
        public Object f71963l;

        /* JADX INFO: renamed from: m */
        public Object f71964m;

        /* JADX INFO: renamed from: n */
        public C17564c f71965n;

        /* JADX INFO: renamed from: o */
        public /* synthetic */ Object f71966o;

        /* JADX INFO: renamed from: q */
        public int f71968q;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71966o = obj;
            this.f71968q |= IntCompanionObject.MIN_VALUE;
            return C20958c.this.m25474e(null, null, null, null, this);
        }
    }

    public C20958c(C17564c c17564c, InterfaceC20965j interfaceC20965j) {
        this.f71949a = c17564c;
        this.f71950b = interfaceC20965j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m25470a(String str, ContinuationImpl continuationImpl) {
        C20956a c20956a;
        if (continuationImpl instanceof C20956a) {
            c20956a = (C20956a) continuationImpl;
            int i10 = c20956a.f71942m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c20956a.f71942m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c20956a = new C20956a(this, continuationImpl);
            }
        } else {
            c20956a = new C20956a(this, continuationImpl);
        }
        Object objMo25478b = c20956a.f71940k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c20956a.f71942m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objMo25478b);
            c20956a.f71939j = str;
            c20956a.f71942m = 1;
            objMo25478b = this.f71950b.mo25478b(c20956a);
            if (objMo25478b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c20956a.f71939j;
            ResultKt.throwOnFailure(objMo25478b);
        }
        return objMo25478b + str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final <P, R> Object m25471b(String str, P p10, InterfaceC18731p<? super P> interfaceC18731p, InterfaceC18717b<? extends R> interfaceC18717b, Continuation<? super R> continuation) {
        a aVar;
        C17564c c17564c;
        C19695k c19695k;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f71960r;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                aVar.f71960r = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f71958p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = aVar2.f71960r;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C19695k c19695k2 = new C19695k();
            C0113z c0113z = C0168z.f568a;
            c19695k2.f60807a.put("params", new C19694j(p10, interfaceC18731p, C0168z.f568a));
            c17564c = this.f71949a;
            aVar2.f71952j = SpillingKt.nullOutSpilledVariable(str);
            aVar2.f71953k = SpillingKt.nullOutSpilledVariable(p10);
            aVar2.f71954l = SpillingKt.nullOutSpilledVariable(interfaceC18731p);
            aVar2.f71955m = interfaceC18717b;
            aVar2.f71956n = c19695k2;
            aVar2.f71957o = c17564c;
            aVar2.f71960r = 1;
            Object objM25470a = m25470a(str, aVar2);
            if (objM25470a != coroutine_suspended) {
                c19695k = c19695k2;
                obj = objM25470a;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        C17564c c17564c2 = aVar2.f71957o;
        C19695k c19695k3 = (C19695k) aVar2.f71956n;
        interfaceC18717b = (InterfaceC18717b) aVar2.f71955m;
        interfaceC18731p = (InterfaceC18731p) aVar2.f71954l;
        Object obj2 = aVar2.f71953k;
        String str2 = (String) aVar2.f71952j;
        ResultKt.throwOnFailure(obj);
        c17564c = c17564c2;
        str = str2;
        c19695k = c19695k3;
        p10 = (P) obj2;
        InterfaceC18717b<? extends R> interfaceC18717b2 = interfaceC18717b;
        C0113z c0113z2 = C0168z.f568a;
        C0113z c0113z3 = C0168z.f568a;
        Long lBoxLong = Boxing.boxLong(this.f71951c);
        aVar2.f71952j = SpillingKt.nullOutSpilledVariable(str);
        aVar2.f71953k = SpillingKt.nullOutSpilledVariable(p10);
        aVar2.f71954l = SpillingKt.nullOutSpilledVariable(interfaceC18731p);
        aVar2.f71955m = SpillingKt.nullOutSpilledVariable(interfaceC18717b2);
        aVar2.f71956n = SpillingKt.nullOutSpilledVariable(c19695k);
        aVar2.f71957o = null;
        aVar2.f71960r = 2;
        Object objM21578c = C19691g.m21578c(c17564c, (String) obj, c19695k, interfaceC18717b2, c0113z3, lBoxLong, aVar2, 48);
        return objM21578c == coroutine_suspended ? coroutine_suspended : objM21578c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m25472c(String str, InterfaceC18717b interfaceC18717b, ContinuationImpl continuationImpl) {
        C20957b c20957b;
        C17564c c17564c;
        if (continuationImpl instanceof C20957b) {
            c20957b = (C20957b) continuationImpl;
            int i10 = c20957b.f71948o;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c20957b.f71948o = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c20957b = new C20957b(this, continuationImpl);
            }
        } else {
            c20957b = new C20957b(this, continuationImpl);
        }
        C20957b c20957b2 = c20957b;
        Object obj = c20957b2.f71946m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c20957b2.f71948o;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C17564c c17564c2 = this.f71949a;
            c20957b2.f71943j = SpillingKt.nullOutSpilledVariable(str);
            c20957b2.f71944k = interfaceC18717b;
            c20957b2.f71945l = c17564c2;
            c20957b2.f71948o = 1;
            Object objM25470a = m25470a(str, c20957b2);
            if (objM25470a != coroutine_suspended) {
                c17564c = c17564c2;
                obj = objM25470a;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        C17564c c17564c3 = c20957b2.f71945l;
        interfaceC18717b = (InterfaceC18717b) c20957b2.f71944k;
        String str2 = (String) c20957b2.f71943j;
        ResultKt.throwOnFailure(obj);
        c17564c = c17564c3;
        str = str2;
        InterfaceC18717b interfaceC18717b2 = interfaceC18717b;
        C19696l c19696l = C19696l.f60808a;
        C0113z c0113z = C0168z.f568a;
        C0113z c0113z2 = C0168z.f568a;
        Long lBoxLong = Boxing.boxLong(this.f71951c);
        c20957b2.f71943j = SpillingKt.nullOutSpilledVariable(str);
        c20957b2.f71944k = SpillingKt.nullOutSpilledVariable(interfaceC18717b2);
        c20957b2.f71945l = null;
        c20957b2.f71948o = 2;
        Object objM21578c = C19691g.m21578c(c17564c, (String) obj, c19696l, interfaceC18717b2, c0113z2, lBoxLong, c20957b2, 48);
        return objM21578c == coroutine_suspended ? coroutine_suspended : objM21578c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m25473d(String str, C2624c c2624c, InterfaceC18731p interfaceC18731p, ContinuationImpl continuationImpl) {
        C20959d c20959d;
        C17564c c17564c;
        String str2;
        Object obj;
        InterfaceC18731p interfaceC18731p2;
        if (continuationImpl instanceof C20959d) {
            c20959d = (C20959d) continuationImpl;
            int i10 = c20959d.f71975p;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c20959d.f71975p = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c20959d = new C20959d(this, continuationImpl);
            }
        } else {
            c20959d = new C20959d(this, continuationImpl);
        }
        C20959d c20959d2 = c20959d;
        Object obj2 = c20959d2.f71973n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c20959d2.f71975p;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj2);
            c17564c = this.f71949a;
            c20959d2.f71969j = SpillingKt.nullOutSpilledVariable(str);
            c20959d2.f71970k = c2624c;
            c20959d2.f71971l = interfaceC18731p;
            c20959d2.f71972m = c17564c;
            c20959d2.f71975p = 1;
            str2 = str;
            Object objM25470a = m25470a(str2, c20959d2);
            if (objM25470a != coroutine_suspended) {
                obj = c2624c;
                interfaceC18731p2 = interfaceC18731p;
                obj2 = objM25470a;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
            return obj2;
        }
        c17564c = c20959d2.f71972m;
        InterfaceC18731p interfaceC18731p3 = (InterfaceC18731p) c20959d2.f71971l;
        Object obj3 = c20959d2.f71970k;
        String str3 = (String) c20959d2.f71969j;
        ResultKt.throwOnFailure(obj2);
        interfaceC18731p2 = interfaceC18731p3;
        obj = obj3;
        str2 = str3;
        C17564c c17564c2 = c17564c;
        String str4 = (String) obj2;
        c20959d2.f71969j = SpillingKt.nullOutSpilledVariable(str2);
        c20959d2.f71970k = SpillingKt.nullOutSpilledVariable(obj);
        c20959d2.f71971l = SpillingKt.nullOutSpilledVariable(interfaceC18731p2);
        c20959d2.f71972m = null;
        c20959d2.f71975p = 2;
        Map mapEmptyMap = MapsKt.emptyMap();
        C0113z c0113z = C0168z.f568a;
        Object objM216c = C0160r.m216c("doPost", null, null, new C19688d(interfaceC18731p2, obj, C0168z.f568a, c17564c2, str4, mapEmptyMap, null), c20959d2, 30);
        return objM216c == coroutine_suspended ? coroutine_suspended : objM216c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: e */
    public final <P, R> Object m25474e(String str, P p10, InterfaceC18731p<? super P> interfaceC18731p, InterfaceC18717b<? extends R> interfaceC18717b, Continuation<? super R> continuation) {
        b bVar;
        C17564c c17564c;
        InterfaceC18731p<? super P> interfaceC18731p2;
        String str2;
        Object obj;
        InterfaceC18717b<? extends R> interfaceC18717b2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f71968q;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                bVar.f71968q = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object obj2 = bVar2.f71966o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = bVar2.f71968q;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj2);
            c17564c = this.f71949a;
            bVar2.f71961j = SpillingKt.nullOutSpilledVariable(str);
            bVar2.f71962k = p10;
            interfaceC18731p2 = interfaceC18731p;
            bVar2.f71963l = interfaceC18731p2;
            bVar2.f71964m = interfaceC18717b;
            bVar2.f71965n = c17564c;
            bVar2.f71968q = 1;
            str2 = str;
            Object objM25470a = m25470a(str2, bVar2);
            if (objM25470a != coroutine_suspended) {
                obj = p10;
                interfaceC18717b2 = interfaceC18717b;
                obj2 = objM25470a;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
            return obj2;
        }
        c17564c = bVar2.f71965n;
        InterfaceC18717b<? extends R> interfaceC18717b3 = (InterfaceC18717b) bVar2.f71964m;
        interfaceC18731p2 = (InterfaceC18731p) bVar2.f71963l;
        Object obj3 = bVar2.f71962k;
        String str3 = (String) bVar2.f71961j;
        ResultKt.throwOnFailure(obj2);
        interfaceC18717b2 = interfaceC18717b3;
        obj = obj3;
        str2 = str3;
        InterfaceC18731p<? super P> interfaceC18731p3 = interfaceC18731p2;
        C17564c c17564c2 = c17564c;
        String str4 = (String) obj2;
        bVar2.f71961j = SpillingKt.nullOutSpilledVariable(str2);
        bVar2.f71962k = SpillingKt.nullOutSpilledVariable(obj);
        bVar2.f71963l = SpillingKt.nullOutSpilledVariable(interfaceC18731p3);
        bVar2.f71964m = SpillingKt.nullOutSpilledVariable(interfaceC18717b2);
        bVar2.f71965n = null;
        bVar2.f71968q = 2;
        Map mapEmptyMap = MapsKt.emptyMap();
        C0113z c0113z = C0168z.f568a;
        Object objM216c = C0160r.m216c("doPostAndParse", null, null, new C19689e(c17564c2, str4, mapEmptyMap, obj, interfaceC18731p3, C0168z.f568a, interfaceC18717b2, null), bVar2, 30);
        return objM216c == coroutine_suspended ? coroutine_suspended : objM216c;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cb, code lost:
    
        if (r15 == r1) goto L47;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m25475f(String str, Object obj, C5393a c5393a, C5393a c5393a2, ContinuationImpl continuationImpl) throws C19699o {
        C20960e c20960e;
        String str2;
        C17564c c17564c;
        Object obj2;
        C5393a c5393a3;
        C5393a c5393a4;
        String str3;
        AbstractC1563d abstractC1563d;
        int i10;
        KType kTypeTypeOf;
        if (continuationImpl instanceof C20960e) {
            c20960e = (C20960e) continuationImpl;
            int i11 = c20960e.f71988v;
            if ((i11 & IntCompanionObject.MIN_VALUE) != 0) {
                c20960e.f71988v = i11 - IntCompanionObject.MIN_VALUE;
            } else {
                c20960e = new C20960e(this, continuationImpl);
            }
        } else {
            c20960e = new C20960e(this, continuationImpl);
        }
        Object objM2177c = c20960e.f71986t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c20960e.f71988v;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM2177c);
            c20960e.f71976j = SpillingKt.nullOutSpilledVariable(str);
            c20960e.f71977k = obj;
            c20960e.f71978l = c5393a;
            c20960e.f71979m = c5393a2;
            C17564c c17564c2 = this.f71949a;
            c20960e.f71980n = c17564c2;
            c20960e.f71988v = 1;
            Object objM25470a = m25470a(str, c20960e);
            if (objM25470a != coroutine_suspended) {
                str2 = str;
                c17564c = c17564c2;
                objM2177c = objM25470a;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c17564c = (C17564c) c20960e.f71980n;
            c5393a2 = (C5393a) c20960e.f71979m;
            c5393a = (C5393a) c20960e.f71978l;
            obj = c20960e.f71977k;
            str2 = (String) c20960e.f71976j;
            ResultKt.throwOnFailure(objM2177c);
        } else {
            if (i12 == 2) {
                c5393a4 = (C5393a) c20960e.f71979m;
                c5393a3 = (C5393a) c20960e.f71978l;
                obj2 = c20960e.f71977k;
                str3 = (String) c20960e.f71976j;
                ResultKt.throwOnFailure(objM2177c);
                abstractC1563d = (AbstractC1563d) objM2177c;
                i10 = abstractC1563d.mo2171g().f7625b;
                if (200 <= i10 || i10 >= 300) {
                    C17743g c17743gMo2167c = abstractC1563d.mo2167c();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C19698n.class);
                    try {
                        kTypeTypeOf = Reflection.typeOf(C19698n.class);
                    } catch (Throwable unused) {
                        kTypeTypeOf = null;
                    }
                    C5393a c5393a5 = new C5393a(orCreateKotlinClass, kTypeTypeOf);
                    c20960e.f71976j = SpillingKt.nullOutSpilledVariable(str3);
                    c20960e.f71977k = SpillingKt.nullOutSpilledVariable(obj2);
                    c20960e.f71978l = SpillingKt.nullOutSpilledVariable(c5393a3);
                    c20960e.f71979m = SpillingKt.nullOutSpilledVariable(c5393a4);
                    c20960e.f71980n = SpillingKt.nullOutSpilledVariable(abstractC1563d);
                    c20960e.f71981o = SpillingKt.nullOutSpilledVariable(abstractC1563d);
                    c20960e.f71982p = null;
                    c20960e.f71983q = null;
                    c20960e.f71984r = null;
                    c20960e.f71985s = null;
                    c20960e.f71988v = 4;
                    objM2177c = c17743gMo2167c.m20170a(c5393a5, c20960e);
                } else {
                    c20960e.f71976j = SpillingKt.nullOutSpilledVariable(str3);
                    c20960e.f71977k = SpillingKt.nullOutSpilledVariable(obj2);
                    c20960e.f71978l = SpillingKt.nullOutSpilledVariable(c5393a3);
                    c20960e.f71979m = SpillingKt.nullOutSpilledVariable(c5393a4);
                    c20960e.f71980n = SpillingKt.nullOutSpilledVariable(abstractC1563d);
                    c20960e.f71981o = null;
                    c20960e.f71982p = null;
                    c20960e.f71983q = null;
                    c20960e.f71984r = null;
                    c20960e.f71985s = null;
                    c20960e.f71988v = 3;
                    Object objM20170a = abstractC1563d.mo2167c().m20170a(c5393a4, c20960e);
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (objM20170a != coroutine_suspended) {
                        return objM20170a;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(objM2177c);
                return objM2177c;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM2177c);
        }
        if (objM2177c == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.zona.commons.api.ServerResponseError");
        }
        throw C19701q.m21582b((C19698n) objM2177c);
        String str4 = (String) objM2177c;
        C1084f c1084f = new C1084f();
        C2336v c2336v = C2336v.f7605c;
        c1084f.f3941b = c2336v;
        C4189a<InterfaceC1091m> c4189a = C1086h.f3953a;
        C2299M.m2976b(c1084f.f3940a, str4);
        C2335u.m3009d(c1084f, C2316c.a.f7581a);
        C4189a<C5393a> c4189a2 = C1090l.f3973a;
        c1084f.f3943d = obj == null ? C3288m.f10564a : obj;
        c1084f.m1723b(c5393a);
        c1084f.f3941b = c2336v;
        C1572m c1572m = new C1572m(c1084f, c17564c);
        c20960e.f71976j = SpillingKt.nullOutSpilledVariable(str2);
        c20960e.f71977k = SpillingKt.nullOutSpilledVariable(obj);
        c20960e.f71978l = SpillingKt.nullOutSpilledVariable(c5393a);
        c20960e.f71979m = c5393a2;
        c20960e.f71980n = SpillingKt.nullOutSpilledVariable(c17564c);
        c20960e.f71981o = SpillingKt.nullOutSpilledVariable(str4);
        c20960e.f71982p = SpillingKt.nullOutSpilledVariable(c17564c);
        c20960e.f71983q = SpillingKt.nullOutSpilledVariable(c1084f);
        c20960e.f71984r = SpillingKt.nullOutSpilledVariable(c17564c);
        c20960e.f71985s = SpillingKt.nullOutSpilledVariable(c1084f);
        c20960e.f71988v = 2;
        objM2177c = c1572m.m2177c(c20960e);
        if (objM2177c != coroutine_suspended) {
            C5393a c5393a6 = c5393a;
            obj2 = obj;
            c5393a3 = c5393a6;
            c5393a4 = c5393a2;
            str3 = str2;
            abstractC1563d = (AbstractC1563d) objM2177c;
            i10 = abstractC1563d.mo2171g().f7625b;
            if (200 <= i10) {
                C17743g c17743gMo2167c2 = abstractC1563d.mo2167c();
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(C19698n.class);
                kTypeTypeOf = Reflection.typeOf(C19698n.class);
                C5393a c5393a7 = new C5393a(orCreateKotlinClass2, kTypeTypeOf);
                c20960e.f71976j = SpillingKt.nullOutSpilledVariable(str3);
                c20960e.f71977k = SpillingKt.nullOutSpilledVariable(obj2);
                c20960e.f71978l = SpillingKt.nullOutSpilledVariable(c5393a3);
                c20960e.f71979m = SpillingKt.nullOutSpilledVariable(c5393a4);
                c20960e.f71980n = SpillingKt.nullOutSpilledVariable(abstractC1563d);
                c20960e.f71981o = SpillingKt.nullOutSpilledVariable(abstractC1563d);
                c20960e.f71982p = null;
                c20960e.f71983q = null;
                c20960e.f71984r = null;
                c20960e.f71985s = null;
                c20960e.f71988v = 4;
                objM2177c = c17743gMo2167c2.m20170a(c5393a7, c20960e);
            } else {
                C17743g c17743gMo2167c3 = abstractC1563d.mo2167c();
                KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(C19698n.class);
                kTypeTypeOf = Reflection.typeOf(C19698n.class);
                C5393a c5393a8 = new C5393a(orCreateKotlinClass3, kTypeTypeOf);
                c20960e.f71976j = SpillingKt.nullOutSpilledVariable(str3);
                c20960e.f71977k = SpillingKt.nullOutSpilledVariable(obj2);
                c20960e.f71978l = SpillingKt.nullOutSpilledVariable(c5393a3);
                c20960e.f71979m = SpillingKt.nullOutSpilledVariable(c5393a4);
                c20960e.f71980n = SpillingKt.nullOutSpilledVariable(abstractC1563d);
                c20960e.f71981o = SpillingKt.nullOutSpilledVariable(abstractC1563d);
                c20960e.f71982p = null;
                c20960e.f71983q = null;
                c20960e.f71984r = null;
                c20960e.f71985s = null;
                c20960e.f71988v = 4;
                objM2177c = c17743gMo2167c3.m20170a(c5393a8, c20960e);
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m25476g(String str, byte[] bArr, ContinuationImpl continuationImpl) {
        C20961f c20961f;
        String str2;
        C17564c c17564c;
        KType kTypeTypeOf;
        byte[] bArr2;
        String str3;
        KType kTypeTypeOf2;
        Object objM21581a;
        if (continuationImpl instanceof C20961f) {
            c20961f = (C20961f) continuationImpl;
            int i10 = c20961f.f71999t;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c20961f.f71999t = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c20961f = new C20961f(this, continuationImpl);
            }
        } else {
            c20961f = new C20961f(this, continuationImpl);
        }
        Object objM2177c = c20961f.f71997r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c20961f.f71999t;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM2177c);
            c20961f.f71989j = SpillingKt.nullOutSpilledVariable(str);
            c20961f.f71990k = bArr;
            C17564c c17564c2 = this.f71949a;
            c20961f.f71991l = c17564c2;
            c20961f.f71999t = 1;
            Object objM25470a = m25470a(str, c20961f);
            if (objM25470a != coroutine_suspended) {
                str2 = str;
                c17564c = c17564c2;
                objM2177c = objM25470a;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            c17564c = (C17564c) c20961f.f71991l;
            bArr = (byte[]) c20961f.f71990k;
            str2 = (String) c20961f.f71989j;
            ResultKt.throwOnFailure(objM2177c);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM2177c);
                return objM2177c;
            }
            bArr2 = (byte[]) c20961f.f71990k;
            str3 = (String) c20961f.f71989j;
            ResultKt.throwOnFailure(objM2177c);
        }
        c20961f.f71989j = SpillingKt.nullOutSpilledVariable(str3);
        c20961f.f71990k = SpillingKt.nullOutSpilledVariable(bArr2);
        c20961f.f71991l = null;
        c20961f.f71992m = null;
        c20961f.f71993n = null;
        c20961f.f71994o = null;
        c20961f.f71995p = null;
        c20961f.f71996q = null;
        c20961f.f71999t = 3;
        objM21581a = C19701q.m21581a((AbstractC1563d) objM2177c, c20961f);
        if (objM21581a != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM21581a;
        String str4 = (String) objM2177c;
        C1084f c1084f = new C1084f();
        c1084f.f3941b = C2336v.f7605c;
        C4189a<InterfaceC1091m> c4189a = C1086h.f3953a;
        C2299M.m2976b(c1084f.f3940a, str4);
        if (bArr == null) {
            c1084f.f3943d = C3288m.f10564a;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
            try {
                kTypeTypeOf2 = Reflection.typeOf(byte[].class);
            } catch (Throwable unused) {
                kTypeTypeOf2 = null;
            }
            c1084f.m1723b(new C5393a(orCreateKotlinClass, kTypeTypeOf2));
        } else if (bArr instanceof AbstractC3289n) {
            c1084f.f3943d = bArr;
            c1084f.m1723b(null);
        } else {
            c1084f.f3943d = bArr;
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(byte[].class);
            try {
                kTypeTypeOf = Reflection.typeOf(byte[].class);
            } catch (Throwable unused2) {
                kTypeTypeOf = null;
            }
            c1084f.m1723b(new C5393a(orCreateKotlinClass2, kTypeTypeOf));
        }
        c1084f.f3941b = C2336v.f7605c;
        C1572m c1572m = new C1572m(c1084f, c17564c);
        c20961f.f71989j = SpillingKt.nullOutSpilledVariable(str2);
        c20961f.f71990k = SpillingKt.nullOutSpilledVariable(bArr);
        c20961f.f71991l = SpillingKt.nullOutSpilledVariable(c17564c);
        c20961f.f71992m = SpillingKt.nullOutSpilledVariable(str4);
        c20961f.f71993n = SpillingKt.nullOutSpilledVariable(c17564c);
        c20961f.f71994o = SpillingKt.nullOutSpilledVariable(c1084f);
        c20961f.f71995p = SpillingKt.nullOutSpilledVariable(c17564c);
        c20961f.f71996q = SpillingKt.nullOutSpilledVariable(c1084f);
        c20961f.f71999t = 2;
        objM2177c = c1572m.m2177c(c20961f);
        if (objM2177c != coroutine_suspended) {
            bArr2 = bArr;
            str3 = str2;
            c20961f.f71989j = SpillingKt.nullOutSpilledVariable(str3);
            c20961f.f71990k = SpillingKt.nullOutSpilledVariable(bArr2);
            c20961f.f71991l = null;
            c20961f.f71992m = null;
            c20961f.f71993n = null;
            c20961f.f71994o = null;
            c20961f.f71995p = null;
            c20961f.f71996q = null;
            c20961f.f71999t = 3;
            objM21581a = C19701q.m21581a((AbstractC1563d) objM2177c, c20961f);
            if (objM21581a != coroutine_suspended) {
                return objM21581a;
            }
        }
        return coroutine_suspended;
    }
}
