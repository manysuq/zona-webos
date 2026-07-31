package p431Xg;

import io.ktor.utils.p621io.InterfaceC14757l;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p659io.CloseableKt;
import kotlin.p659io.encoding.Base64;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.mozilla.classfile.ByteCode;
import p064D9.C1084f;
import p064D9.C1086h;
import p064D9.InterfaceC1082d;
import p064D9.InterfaceC1091m;
import p082E9.C1321a;
import p100F9.AbstractC1563d;
import p100F9.C1567h;
import p100F9.C1572m;
import p102Fb.AbstractC1581a;
import p102Fb.C1586f;
import p102Fb.C1595o;
import p102Fb.C1596p;
import p102Fb.InterfaceC1592l;
import p154I9.C2290D;
import p154I9.C2291E;
import p154I9.C2292F;
import p154I9.C2299M;
import p154I9.C2336v;
import p154I9.InterfaceC2289C;
import p154I9.InterfaceC2326l;
import p192Kb.C2933Q;
import p192Kb.C2946c;
import p210Lb.C3321s;
import p280P9.C4188M;
import p280P9.C4189a;
import p298Q9.C4578c;
import p301Qc.C4582a;
import p449Yg.C6617k;
import p467Zg.C6844b;
import p478aa.C7061M;
import p478aa.C7081W0;
import p478aa.C7083X0;
import p478aa.C7101e0;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p479ab.C7152b;
import p558fa.C11095d;
import p589ha.C11865c;
import p589ha.ExecutorC11864b;
import p724p.C17490h;
import p734p9.C17564c;
import p768rc.C17887a;
import p825v9.C18668b0;
import p825v9.C18670c0;

/* JADX INFO: renamed from: Xg.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C6368g extends AbstractC1581a {

    /* JADX INFO: renamed from: b */
    public final InterfaceC6379r f20884b;

    /* JADX INFO: renamed from: c */
    public final C6387z f20885c;

    /* JADX INFO: renamed from: d */
    public final C4582a f20886d;

    /* JADX INFO: renamed from: e */
    public final Function2<Boolean, Boolean, C17564c> f20887e;

    /* JADX INFO: renamed from: f */
    public final C6617k f20888f;

    /* JADX INFO: renamed from: g */
    public final C6365d f20889g;

    /* JADX INFO: renamed from: h */
    public final C6844b f20890h;

    /* JADX INFO: renamed from: i */
    public final Lazy f20891i;

    /* JADX INFO: renamed from: j */
    public final C11095d f20892j;

    /* JADX INFO: renamed from: Xg.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.stream.api.http.HttpClientForApi$get$1$1", m18778f = "HttpClientForApi.kt", m18779i = {0, 0, 0, 0, 0, 0, 0, 1}, m18780l = {524, 114}, m18781m = "invokeSuspend", m18782n = {"$this$get$iv", "urlString$iv", "$this$get$iv$iv", "$this$get$iv$iv$iv", "builder$iv$iv$iv", "$this$request$iv$iv$iv$iv", "builder$iv$iv$iv$iv", "response"}, m18783nl = {523, 118}, m18784s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0"}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super C1586f>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f20893j;

        /* JADX INFO: renamed from: k */
        public Object f20894k;

        /* JADX INFO: renamed from: l */
        public Object f20895l;

        /* JADX INFO: renamed from: m */
        public Object f20896m;

        /* JADX INFO: renamed from: n */
        public Object f20897n;

        /* JADX INFO: renamed from: o */
        public Object f20898o;

        /* JADX INFO: renamed from: p */
        public Object f20899p;

        /* JADX INFO: renamed from: q */
        public int f20900q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ Map<String, String> f20901r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C17564c f20902s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ String f20903t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Map<String, List<String>> f20904u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C6368g f20905v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Integer f20906w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, String> map, C17564c c17564c, String str, Map<String, List<String>> map2, C6368g c6368g, Integer num, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f20901r = map;
            this.f20902s = c17564c;
            this.f20903t = str;
            this.f20904u = map2;
            this.f20905v = c6368g;
            this.f20906w = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f20901r, this.f20902s, this.f20903t, this.f20904u, this.f20905v, this.f20906w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super C1586f> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f20900q;
            String str = this.f20903t;
            Map<String, String> map = this.f20901r;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (map != null) {
                    map.remove("Disable-Redirect");
                }
                C1084f c1084f = new C1084f();
                C4189a<InterfaceC1091m> c4189a = C1086h.f3953a;
                C2299M.m2976b(c1084f.f3940a, str);
                if (map != null) {
                    C4188M.m4906b(c1084f.f3942c, map);
                }
                Integer num = this.f20906w;
                if (num != null) {
                    C18668b0 c18668b0 = C18668b0.f58158a;
                    C18670c0 c18670c0 = new C18670c0();
                    c18670c0.m21111c(Long.valueOf(((long) num.intValue()) * 1000));
                    c18670c0.m21110b(Long.valueOf(((long) num.intValue()) * 1000));
                    c18670c0.m21112d(Long.valueOf(((long) num.intValue()) * 1000));
                    Unit unit = Unit.INSTANCE;
                    c1084f.m1724c(c18668b0, c18670c0);
                }
                c1084f.f3941b = C2336v.f7604b;
                C17564c c17564c = this.f20902s;
                C1572m c1572m = new C1572m(c1084f, c17564c);
                this.f20893j = SpillingKt.nullOutSpilledVariable(c17564c);
                this.f20894k = SpillingKt.nullOutSpilledVariable(str);
                this.f20895l = SpillingKt.nullOutSpilledVariable(c17564c);
                this.f20896m = SpillingKt.nullOutSpilledVariable(c17564c);
                this.f20897n = SpillingKt.nullOutSpilledVariable(c1084f);
                this.f20898o = SpillingKt.nullOutSpilledVariable(c17564c);
                this.f20899p = SpillingKt.nullOutSpilledVariable(c1084f);
                this.f20900q = 1;
                obj = c1572m.m2177c(this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AbstractC1563d abstractC1563d = (AbstractC1563d) obj;
            Map<String, List<String>> map2 = this.f20904u;
            if (map2 != null) {
                map2.putAll(C4188M.m4907c(abstractC1563d.mo1721a()));
            }
            C6368g c6368g = this.f20905v;
            boolean zM7134s = C6368g.m7134s(c6368g, map);
            this.f20893j = SpillingKt.nullOutSpilledVariable(abstractC1563d);
            this.f20894k = null;
            this.f20895l = null;
            this.f20896m = null;
            this.f20897n = null;
            this.f20898o = null;
            this.f20899p = null;
            this.f20900q = 2;
            Object objM7133r = C6368g.m7133r(c6368g, str, abstractC1563d, zM7134s, this);
            return objM7133r == coroutine_suspended ? coroutine_suspended : objM7133r;
        }
    }

    /* JADX INFO: renamed from: Xg.g$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.stream.api.http.HttpClientForApi$post$2$1", m18778f = "HttpClientForApi.kt", m18779i = {0, 0, 0, 0, 0, 0, 1}, m18780l = {551, ByteCode.RET}, m18781m = "invokeSuspend", m18782n = {"$this$post$iv", "urlString$iv", "$this$post$iv$iv", "builder$iv$iv", "$this$request$iv$iv$iv", "builder$iv$iv$iv", "response"}, m18783nl = {550, ByteCode.LRETURN}, m18784s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0"}, m18785v = 2)
    public static final class b extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super C1586f>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f20907j;

        /* JADX INFO: renamed from: k */
        public Object f20908k;

        /* JADX INFO: renamed from: l */
        public Object f20909l;

        /* JADX INFO: renamed from: m */
        public Object f20910m;

        /* JADX INFO: renamed from: n */
        public Object f20911n;

        /* JADX INFO: renamed from: o */
        public Object f20912o;

        /* JADX INFO: renamed from: p */
        public int f20913p;

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C17564c f20914q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ String f20915r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Map<String, List<String>> f20916s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C6368g f20917t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Map<String, String> f20918u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Map<String, String> f20919v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C17564c c17564c, String str, Map<String, List<String>> map, C6368g c6368g, Map<String, String> map2, Map<String, String> map3, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f20914q = c17564c;
            this.f20915r = str;
            this.f20916s = map;
            this.f20917t = c6368g;
            this.f20918u = map2;
            this.f20919v = map3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f20914q, this.f20915r, this.f20916s, this.f20917t, this.f20918u, this.f20919v, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super C1586f> continuation) {
            return ((b) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f20913p;
            Map<String, String> map = this.f20918u;
            String str = this.f20915r;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C1084f c1084f = new C1084f();
                C2336v c2336v = C2336v.f7605c;
                c1084f.f3941b = c2336v;
                C4189a<InterfaceC1091m> c4189a = C1086h.f3953a;
                C2299M.m2976b(c1084f.f3940a, str);
                if (map != null) {
                    C4188M.m4906b(c1084f.f3942c, map);
                }
                InterfaceC2289C.a aVar = InterfaceC2289C.f7523b;
                C2290D c2290dM2962a = C2292F.m2962a();
                Map<String, String> map2 = this.f20919v;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        c2290dM2962a.mo2982c(entry.getKey(), entry.getValue());
                    }
                }
                Unit unit = Unit.INSTANCE;
                c1084f.f3943d = new C1321a(new C2291E(c2290dM2962a.f13941b, true));
                c1084f.m1723b(null);
                c1084f.f3941b = c2336v;
                C17564c c17564c = this.f20914q;
                C1572m c1572m = new C1572m(c1084f, c17564c);
                this.f20907j = SpillingKt.nullOutSpilledVariable(c17564c);
                this.f20908k = SpillingKt.nullOutSpilledVariable(str);
                this.f20909l = SpillingKt.nullOutSpilledVariable(c17564c);
                this.f20910m = SpillingKt.nullOutSpilledVariable(c1084f);
                this.f20911n = SpillingKt.nullOutSpilledVariable(c17564c);
                this.f20912o = SpillingKt.nullOutSpilledVariable(c1084f);
                this.f20913p = 1;
                obj = c1572m.m2177c(this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AbstractC1563d abstractC1563d = (AbstractC1563d) obj;
            Map<String, List<String>> map3 = this.f20916s;
            if (map3 != null) {
                map3.putAll(C4188M.m4907c(abstractC1563d.mo1721a()));
            }
            C6368g c6368g = this.f20917t;
            boolean zM7134s = C6368g.m7134s(c6368g, map);
            this.f20907j = SpillingKt.nullOutSpilledVariable(abstractC1563d);
            this.f20908k = null;
            this.f20909l = null;
            this.f20910m = null;
            this.f20911n = null;
            this.f20912o = null;
            this.f20913p = 2;
            Object objM7133r = C6368g.m7133r(c6368g, str, abstractC1563d, zM7134s, this);
            return objM7133r == coroutine_suspended ? coroutine_suspended : objM7133r;
        }
    }

    public C6368g(InterfaceC6379r interfaceC6379r, C6387z c6387z, C4582a c4582a, C6378q c6378q, Function2 function2, C6617k c6617k, C6365d c6365d, C6844b c6844b) {
        super(c6378q);
        this.f20884b = interfaceC6379r;
        this.f20885c = c6387z;
        this.f20886d = c4582a;
        this.f20887e = function2;
        this.f20888f = c6617k;
        this.f20889g = c6365d;
        this.f20890h = c6844b;
        this.f20891i = LazyKt.lazy(new Function0() { // from class: Xg.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                try {
                    C6387z c6387z2 = this.f20876b.f20885c;
                    c6387z2.getClass();
                    return (Map) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new C6383v(c6387z2, null));
                } catch (Exception unused) {
                    return MapsKt.emptyMap();
                }
            }
        });
        C7081W0 c7081w0M8017a = C7083X0.m8017a();
        C11865c c11865c = C7101e0.f23142a;
        this.f20892j = C7061M.m7996a(CoroutineContext.Element.DefaultImpls.plus(c7081w0M8017a, ExecutorC11864b.f37309c));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r12 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r12 == r1) goto L46;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7133r(C6368g c6368g, String str, AbstractC1563d abstractC1563d, boolean z10, ContinuationImpl continuationImpl) throws IOException {
        C6367f c6367f;
        String str2;
        Pair pair;
        byte[] bArr;
        String strM7135v;
        AbstractC1563d abstractC1563d2;
        if (continuationImpl instanceof C6367f) {
            c6367f = (C6367f) continuationImpl;
            int i10 = c6367f.f20883p;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c6367f.f20883p = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c6367f = new C6367f(c6368g, continuationImpl);
            }
        } else {
            c6367f = new C6367f(c6368g, continuationImpl);
        }
        Object objM7142z = c6367f.f20881n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c6367f.f20883p;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM7142z);
            if (abstractC1563d.mo2171g().f7625b >= 400) {
                throw new IOException(C17490h.m19873a(abstractC1563d.mo2171g().f7625b, "Server returned HTTP response code: "));
            }
            String str3 = abstractC1563d.mo1721a().get("Content-Encoding");
            if (!z10 || str3 == null) {
                c6367f.f20877j = str;
                c6367f.f20878k = abstractC1563d;
                c6367f.f20879l = SpillingKt.nullOutSpilledVariable(str3);
                c6367f.f20880m = z10;
                c6367f.f20883p = 3;
                Object objM2173a = C1567h.m2173a(abstractC1563d, c6367f);
                if (objM2173a != coroutine_suspended) {
                    objM7142z = objM2173a;
                    str2 = str3;
                    c6367f.f20877j = str;
                    c6367f.f20878k = abstractC1563d;
                    c6367f.f20879l = SpillingKt.nullOutSpilledVariable(str2);
                    c6367f.f20880m = z10;
                    c6367f.f20883p = 4;
                    objM7142z = C4578c.m5186a((InterfaceC14757l) objM7142z, Integer.MAX_VALUE, c6367f);
                    if (objM7142z != coroutine_suspended) {
                        abstractC1563d2 = abstractC1563d;
                        strM7135v = m7135v(abstractC1563d2.mo1721a());
                        abstractC1563d = abstractC1563d2;
                        bArr = (byte[]) objM7142z;
                    }
                }
            } else if (Intrinsics.areEqual(str3, "gzip")) {
                c6367f.f20877j = str;
                c6367f.f20878k = abstractC1563d;
                c6367f.f20879l = SpillingKt.nullOutSpilledVariable(str3);
                c6367f.f20880m = z10;
                c6367f.f20883p = 1;
                objM7142z = c6368g.m7136A(abstractC1563d, c6367f);
            } else {
                if (!Intrinsics.areEqual(str3, "br")) {
                    throw new IOException("Unknown content encoding: ".concat(str3));
                }
                c6367f.f20877j = str;
                c6367f.f20878k = abstractC1563d;
                c6367f.f20879l = SpillingKt.nullOutSpilledVariable(str3);
                c6367f.f20880m = z10;
                c6367f.f20883p = 2;
                objM7142z = c6368g.m7142z(abstractC1563d, c6367f);
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            abstractC1563d = c6367f.f20878k;
            str = c6367f.f20877j;
            ResultKt.throwOnFailure(objM7142z);
            pair = (Pair) objM7142z;
            bArr = (byte[]) pair.getFirst();
            strM7135v = (String) pair.getSecond();
        } else if (i11 != 2) {
            if (i11 == 3) {
                z10 = c6367f.f20880m;
                str2 = (String) c6367f.f20879l;
                abstractC1563d = c6367f.f20878k;
                str = c6367f.f20877j;
                ResultKt.throwOnFailure(objM7142z);
                c6367f.f20877j = str;
                c6367f.f20878k = abstractC1563d;
                c6367f.f20879l = SpillingKt.nullOutSpilledVariable(str2);
                c6367f.f20880m = z10;
                c6367f.f20883p = 4;
                objM7142z = C4578c.m5186a((InterfaceC14757l) objM7142z, Integer.MAX_VALUE, c6367f);
                if (objM7142z != coroutine_suspended) {
                    abstractC1563d2 = abstractC1563d;
                }
                return coroutine_suspended;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC1563d2 = c6367f.f20878k;
            str = c6367f.f20877j;
            ResultKt.throwOnFailure(objM7142z);
            strM7135v = m7135v(abstractC1563d2.mo1721a());
            abstractC1563d = abstractC1563d2;
            bArr = (byte[]) objM7142z;
        } else {
            abstractC1563d = c6367f.f20878k;
            str = c6367f.f20877j;
            ResultKt.throwOnFailure(objM7142z);
            pair = (Pair) objM7142z;
            bArr = (byte[]) pair.getFirst();
            strM7135v = (String) pair.getSecond();
        }
        String str4 = abstractC1563d.mo1721a().get("Location");
        if (str4 == null) {
            str4 = abstractC1563d.mo1721a().get("location");
        }
        InterfaceC1082d interfaceC1082d = abstractC1563d.mo2167c().f55250c;
        if (interfaceC1082d == null) {
            interfaceC1082d = null;
        }
        String str5 = interfaceC1082d.getUrl().f7559g;
        if (str4 == null) {
            str4 = !Intrinsics.areEqual(str, str5) ? str5 : null;
        }
        return new C1586f(bArr, strM7135v, str4);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m7134s(C6368g c6368g, Map map) {
        String str;
        c6368g.getClass();
        if (map == null || (str = (String) map.get("Accept-Encoding")) == null) {
            return false;
        }
        return StringsKt__StringsKt.contains$default(str, "gzip", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: v */
    public static String m7135v(InterfaceC2326l interfaceC2326l) {
        List<String> groupValues;
        String str;
        String str2 = interfaceC2326l.get("Content-Type");
        if (str2 == null) {
            str2 = "";
        }
        MatchResult matchResultFind$default = Regex.find$default(new Regex("charset=([^;]+)"), str2, 0, 2, null);
        return (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str = groupValues.get(1)) == null) ? "utf-8" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7136A(AbstractC1563d abstractC1563d, ContinuationImpl continuationImpl) {
        C6377p c6377p;
        if (continuationImpl instanceof C6377p) {
            c6377p = (C6377p) continuationImpl;
            int i10 = c6377p.f21004m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c6377p.f21004m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c6377p = new C6377p(this, continuationImpl);
            }
        } else {
            c6377p = new C6377p(this, continuationImpl);
        }
        Object objM2173a = c6377p.f21002k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c6377p.f21004m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM2173a);
            c6377p.f21001j = abstractC1563d;
            c6377p.f21004m = 1;
            objM2173a = C1567h.m2173a(abstractC1563d, c6377p);
            if (objM2173a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            abstractC1563d = c6377p.f21001j;
            ResultKt.throwOnFailure(objM2173a);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC1563d = c6377p.f21001j;
            ResultKt.throwOnFailure(objM2173a);
        }
        byte[] bArr = (byte[]) objM2173a;
        if (bArr.length == 0) {
            return TuplesKt.m18695to(bArr, m7135v(abstractC1563d.mo1721a()));
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArr2 = new byte[bArr.length];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i12 = gZIPInputStream.read(bArr2);
                if (i12 <= 0) {
                    Pair pairM18695to = TuplesKt.m18695to(byteArrayOutputStream.toByteArray(), m7135v(abstractC1563d.mo1721a()));
                    CloseableKt.closeFinally(gZIPInputStream, null);
                    return pairM18695to;
                }
                byteArrayOutputStream.write(bArr2, 0, i12);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(gZIPInputStream, th);
                throw th2;
            }
        }
        c6377p.f21001j = abstractC1563d;
        c6377p.f21004m = 2;
        objM2173a = C4578c.m5186a((InterfaceC14757l) objM2173a, Integer.MAX_VALUE, c6377p);
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: b */
    public final String mo2192b(String str) {
        return (Intrinsics.areEqual(str, C17887a.f55607d) || Intrinsics.areEqual(str, C2946c.f9754e)) ? this.f20884b.mo7143a() : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36";
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: c */
    public final String mo2193c() {
        try {
            return this.f20884b.mo7144b(C1596p.m2211a(this), mo2192b("mobilink"));
        } catch (Exception e10) {
            e10.printStackTrace();
            return String.valueOf(System.currentTimeMillis());
        }
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: d */
    public final C1586f mo2194d(String str, Map map, Map map2) {
        String string = C6361F.m7131a(map).toString();
        Function2<Boolean, Boolean, C17564c> function2 = this.f20887e;
        Boolean bool = Boolean.FALSE;
        C17564c c17564cInvoke = function2.invoke(bool, bool);
        try {
            C1586f c1586f = (C1586f) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new C6375n(c17564cInvoke, str, this, map2, string, null));
            CloseableKt.closeFinally(c17564cInvoke, null);
            return c1586f;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(c17564cInvoke, th);
                throw th2;
            }
        }
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: e */
    public final byte[] mo2195e(byte[] bArr) {
        return Base64.decode$default(Base64.INSTANCE, bArr, 0, 0, 6, (Object) null);
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: f */
    public final void mo2196f(String str, Map map, C1595o c1595o) {
        C7106g.m8045c(this.f20892j, null, null, new C6370i(this, str, map, c1595o, null), 3);
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: g */
    public final String mo2197g(String str) {
        return str == null ? "" : Base64.encode$default(Base64.INSTANCE, StringsKt.encodeToByteArray(str), 0, 0, 6, null);
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: h */
    public final void mo2198h(HashMap map, String str, Map map2, C3321s.a aVar, boolean z10) {
        C6387z c6387z = this.f20885c;
        c6387z.getClass();
        File file = new File(c6387z.f21036a.getCacheDir(), "localFiles");
        file.mkdir();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(file, str2)));
            try {
                bufferedWriter.write(str3);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedWriter, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedWriter, th);
                    throw th2;
                }
            }
        }
        c6387z.m7146b(new File(file, str).toURI().toURL().toExternalForm(), map2, aVar, z10 ? CollectionsKt.listOf(Pattern.compile(".*")) : CollectionsKt.emptyList());
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: i */
    public final C1586f mo2199i(String str, Map map, HashMap map2) {
        Function2<Boolean, Boolean, C17564c> function2 = this.f20887e;
        Boolean bool = Boolean.FALSE;
        C17564c c17564cInvoke = function2.invoke(bool, bool);
        try {
            C1586f c1586f = (C1586f) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new C6369h(c17564cInvoke, str, map2, this, map, null));
            CloseableKt.closeFinally(c17564cInvoke, null);
            return c1586f;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(c17564cInvoke, th);
                throw th2;
            }
        }
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: j */
    public final C1586f mo2200j(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m7138u(str, map, map2, false, null);
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: k */
    public final C1586f mo2201k(String str, HashMap map, String str2) {
        Function2<Boolean, Boolean, C17564c> function2 = this.f20887e;
        Boolean bool = Boolean.FALSE;
        C17564c c17564cInvoke = function2.invoke(bool, bool);
        try {
            C1586f c1586f = (C1586f) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new C6374m(c17564cInvoke, str, this, map, str2, null));
            CloseableKt.closeFinally(c17564cInvoke, null);
            return c1586f;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(c17564cInvoke, th);
                throw th2;
            }
        }
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: l */
    public final C1586f mo2202l(String str, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        Function2<Boolean, Boolean, C17564c> function2 = this.f20887e;
        Boolean bool = Boolean.FALSE;
        C17564c c17564cInvoke = function2.invoke(bool, bool);
        try {
            C1586f c1586f = (C1586f) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new b(c17564cInvoke, str, map3, this, map2, map, null));
            CloseableKt.closeFinally(c17564cInvoke, null);
            return c1586f;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(c17564cInvoke, th);
                throw th2;
            }
        }
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: m */
    public final String mo2203m(String str) {
        return new String(Base64.decode$default(Base64.INSTANCE, str, 0, 0, 6, (Object) null), Charsets.UTF_8);
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: n */
    public final String mo2204n(String str) {
        return this.f20889g.m7132a(str);
    }

    @Override // p102Fb.InterfaceC1590j
    /* JADX INFO: renamed from: o */
    public final byte[] mo2205o(byte[] bArr) {
        return Base64.encodeToByteArray$default(Base64.INSTANCE, bArr, 0, 0, 6, null);
    }

    /* JADX INFO: renamed from: t */
    public final C1586f m7137t(String str, Map map) {
        return m7138u(str, map, null, true, null);
    }

    /* JADX INFO: renamed from: u */
    public final C1586f m7138u(String str, Map<String, String> map, Map<String, List<String>> map2, boolean z10, Integer num) {
        String str2;
        boolean z11 = (map == null || (str2 = map.get("Disable-Redirect")) == null) ? false : Boolean.parseBoolean(str2);
        Map mutableMap = map != null ? MapsKt.toMutableMap(map) : null;
        C17564c c17564cInvoke = this.f20887e.invoke(Boolean.valueOf(z11), Boolean.valueOf(z10));
        try {
            C1586f c1586f = (C1586f) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new a(mutableMap, c17564cInvoke, str, map2, this, num, null));
            CloseableKt.closeFinally(c17564cInvoke, null);
            return c1586f;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(c17564cInvoke, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final Map<String, String> m7139w() {
        return (Map) this.f20891i.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final void m7140x(String str, Map<String, String> map, InterfaceC1592l interfaceC1592l, List<Pattern> list) {
        this.f20885c.m7146b(str, map, interfaceC1592l, list);
    }

    /* JADX INFO: renamed from: y */
    public final List m7141y(C2933Q c2933q) {
        return (List) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new C6371j(this, c2933q, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7142z(AbstractC1563d abstractC1563d, ContinuationImpl continuationImpl) {
        C6376o c6376o;
        if (continuationImpl instanceof C6376o) {
            c6376o = (C6376o) continuationImpl;
            int i10 = c6376o.f21000m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c6376o.f21000m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c6376o = new C6376o(this, continuationImpl);
            }
        } else {
            c6376o = new C6376o(this, continuationImpl);
        }
        Object objM2173a = c6376o.f20998k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c6376o.f21000m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM2173a);
            c6376o.f20997j = abstractC1563d;
            c6376o.f21000m = 1;
            objM2173a = C1567h.m2173a(abstractC1563d, c6376o);
            if (objM2173a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            abstractC1563d = c6376o.f20997j;
            ResultKt.throwOnFailure(objM2173a);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC1563d = c6376o.f20997j;
            ResultKt.throwOnFailure(objM2173a);
        }
        byte[] bArr = (byte[]) objM2173a;
        if (bArr.length == 0) {
            return TuplesKt.m18695to(bArr, m7135v(abstractC1563d.mo1721a()));
        }
        C7152b c7152b = new C7152b(new ByteArrayInputStream(bArr));
        try {
            byte[] bArr2 = new byte[bArr.length];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i12 = c7152b.read(bArr2);
                if (i12 <= 0) {
                    Pair pairM18695to = TuplesKt.m18695to(byteArrayOutputStream.toByteArray(), m7135v(abstractC1563d.mo1721a()));
                    CloseableKt.closeFinally(c7152b, null);
                    return pairM18695to;
                }
                byteArrayOutputStream.write(bArr2, 0, i12);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(c7152b, th);
                throw th2;
            }
        }
        c6376o.f20997j = abstractC1563d;
        c6376o.f21000m = 2;
        objM2173a = C4578c.m5186a((InterfaceC14757l) objM2173a, Integer.MAX_VALUE, c6376o);
    }
}
