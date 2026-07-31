package p863xg;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p011Aa.AbstractC0090c;
import p017Ag.C0160r;
import p017Ag.C0161s;
import p734p9.C17564c;
import va.InterfaceC18731p;

/* JADX INFO: renamed from: xg.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.commons.api.ClientKt$internalDoPost$2", m18778f = "Client.kt", m18779i = {0}, m18780l = {213}, m18781m = "invokeSuspend", m18782n = {"bodyJson"}, m18783nl = {220}, m18784s = {"L$0"}, m18785v = 2)
public final class C19688d extends SuspendLambda implements Function2<C0161s, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f60779j;

    /* JADX INFO: renamed from: k */
    public int f60780k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC18731p<Object> f60781l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f60782m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ AbstractC0090c f60783n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C17564c f60784o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ String f60785p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Map<String, String> f60786q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19688d(InterfaceC18731p interfaceC18731p, Object obj, AbstractC0090c abstractC0090c, C17564c c17564c, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.f60781l = interfaceC18731p;
        this.f60782m = obj;
        this.f60783n = abstractC0090c;
        this.f60784o = c17564c;
        this.f60785p = str;
        this.f60786q = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C19688d(this.f60781l, this.f60782m, this.f60783n, this.f60784o, this.f60785p, this.f60786q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0161s c0161s, Continuation<? super String> continuation) {
        return ((C19688d) create(c0161s, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f60780k;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC18731p<Object> interfaceC18731p = this.f60781l;
        String strMo162b = (interfaceC18731p == null || (obj2 = this.f60782m) == null) ? "" : this.f60783n.mo162b(obj2, interfaceC18731p);
        this.f60779j = SpillingKt.nullOutSpilledVariable(strMo162b);
        this.f60780k = 1;
        Object objM216c = C0160r.m216c("doPost", null, null, new C19687c(this.f60784o, this.f60785p, this.f60786q, strMo162b, null), this, 30);
        return objM216c == coroutine_suspended ? coroutine_suspended : objM216c;
    }
}
