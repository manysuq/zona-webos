package p689mb;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: mb.Z */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "org.jetbrains.compose.resources.StringResourcesKt$stringResource$str$7$1", m18778f = "StringResources.kt", m18779i = {}, m18780l = {80}, m18781m = "invokeSuspend", m18782n = {}, m18784s = {})
public final class C16975Z extends SuspendLambda implements Function2<C16955E, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: j */
    public int f53232j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f53233k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C16972W f53234l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ ArrayList f53235m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC16962L f53236n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16975Z(C16972W c16972w, ArrayList arrayList, InterfaceC16962L interfaceC16962L, Continuation continuation) {
        super(2, continuation);
        this.f53234l = c16972w;
        this.f53235m = arrayList;
        this.f53236n = interfaceC16962L;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C16975Z c16975z = new C16975Z(this.f53234l, this.f53235m, this.f53236n, continuation);
        c16975z.f53233k = obj;
        return c16975z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C16955E c16955e, Continuation<? super String> continuation) {
        return ((C16975Z) create(c16955e, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f53232j;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C16955E c16955e = (C16955E) this.f53233k;
        this.f53232j = 1;
        Object objM19464c = C16973X.m19464c(this.f53234l, this.f53235m, this.f53236n, c16955e, this);
        return objM19464c == coroutine_suspended ? coroutine_suspended : objM19464c;
    }
}
