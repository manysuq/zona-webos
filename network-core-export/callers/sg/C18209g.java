package sg;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p179Jg.C2616L;
import p179Jg.C2631j;
import p179Jg.EnumC2623b;
import p269Og.AbstractC4005l0;
import p478aa.InterfaceC7059L;
import p814uf.C18534h;

/* JADX INFO: renamed from: sg.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.client.api.entity.impl.EntityService$getMovieOrSerialById$2", m18778f = "EntityService.kt", m18779i = {}, m18780l = {27}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {-1}, m18784s = {}, m18785v = 2)
public final class C18209g extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super AbstractC4005l0>, Object> {

    /* JADX INFO: renamed from: j */
    public int f56671j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C18208f f56672k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f56673l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ EnumC2623b f56674m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18209g(C18208f c18208f, String str, EnumC2623b enumC2623b, Continuation<? super C18209g> continuation) {
        super(2, continuation);
        this.f56672k = c18208f;
        this.f56673l = str;
        this.f56674m = enumC2623b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C18209g(this.f56672k, this.f56673l, this.f56674m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super AbstractC4005l0> continuation) {
        return ((C18209g) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f56671j;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C18534h c18534h = this.f56672k.f56661a;
            C2631j c2631j = new C2631j(this.f56673l, this.f56674m);
            this.f56671j = 1;
            obj = c18534h.f57899a.m20960e(c2631j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return CollectionsKt.first((List) ((C2616L) obj).f8769a);
    }
}
