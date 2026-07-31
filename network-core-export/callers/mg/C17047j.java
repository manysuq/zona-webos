package mg;

import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p478aa.InterfaceC7059L;
import p689mb.C16972W;
import p689mb.C16973X;

/* JADX INFO: renamed from: mg.j */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.utils.ExtensionsKt$notify$msg$1", m18778f = "Extensions.kt", m18779i = {}, m18780l = {28}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {-1}, m18784s = {}, m18785v = 2)
public final class C17047j extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: j */
    public int f53458j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C16972W f53459k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object[] f53460l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17047j(C16972W c16972w, Object[] objArr, Continuation<? super C17047j> continuation) {
        super(2, continuation);
        this.f53459k = c16972w;
        this.f53460l = objArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C17047j(this.f53459k, this.f53460l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super String> continuation) {
        return ((C17047j) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f53458j;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Object[] objArr = this.f53460l;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        this.f53458j = 1;
        Object objM19463b = C16973X.m19463b(this.f53459k, objArrCopyOf, this);
        return objM19463b == coroutine_suspended ? coroutine_suspended : objM19463b;
    }
}
