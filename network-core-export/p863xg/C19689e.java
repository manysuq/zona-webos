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
import org.mozilla.classfile.ByteCode;
import p011Aa.AbstractC0090c;
import p017Ag.C0160r;
import p017Ag.C0161s;
import p734p9.C17564c;
import va.InterfaceC18717b;
import va.InterfaceC18731p;

/* JADX INFO: renamed from: xg.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.commons.api.ClientKt$internalDoPostAndParse$2", m18778f = "Client.kt", m18779i = {1}, m18780l = {ByteCode.INVOKEVIRTUAL, ByteCode.CHECKCAST}, m18781m = "invokeSuspend", m18782n = {"response"}, m18783nl = {ByteCode.CHECKCAST, -1}, m18784s = {"L$0"}, m18785v = 2)
public final class C19689e extends SuspendLambda implements Function2<C0161s, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f60787j;

    /* JADX INFO: renamed from: k */
    public int f60788k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C17564c f60789l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ String f60790m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Map<String, String> f60791n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f60792o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC18731p<Object> f60793p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ AbstractC0090c f60794q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC18717b<Object> f60795r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19689e(C17564c c17564c, String str, Map map, Object obj, InterfaceC18731p interfaceC18731p, AbstractC0090c abstractC0090c, InterfaceC18717b interfaceC18717b, Continuation continuation) {
        super(2, continuation);
        this.f60789l = c17564c;
        this.f60790m = str;
        this.f60791n = map;
        this.f60792o = obj;
        this.f60793p = interfaceC18731p;
        this.f60794q = abstractC0090c;
        this.f60795r = interfaceC18717b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C19689e(this.f60789l, this.f60790m, this.f60791n, this.f60792o, this.f60793p, this.f60794q, this.f60795r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0161s c0161s, Continuation<Object> continuation) {
        return ((C19689e) create(c0161s, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C19689e c19689e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f60788k;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f60788k = 1;
            c19689e = this;
            obj = C0160r.m216c("doPost", null, null, new C19688d(this.f60793p, this.f60792o, this.f60794q, this.f60789l, this.f60790m, this.f60791n, null), c19689e, 30);
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
        c19689e = this;
        String str = (String) obj;
        c19689e.f60787j = SpillingKt.nullOutSpilledVariable(str);
        c19689e.f60788k = 2;
        Object objM21577b = C19691g.m21577b(c19689e.f60794q, c19689e.f60795r, str, this);
        return objM21577b == coroutine_suspended ? coroutine_suspended : objM21577b;
    }
}
