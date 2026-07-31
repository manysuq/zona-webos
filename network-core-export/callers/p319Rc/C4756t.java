package p319Rc;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import mobi.zona.utils.CppUtil;
import p017Ag.C0156n;
import p064D9.C1084f;
import p064D9.C1086h;
import p064D9.InterfaceC1091m;
import p125Gg.C1918z;
import p154I9.C2327m;
import p280P9.C4189a;
import p301Qc.C4583b;
import p839w9.C18960g;

/* JADX INFO: renamed from: Rc.t */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.android.system.HttpClientFactory$createHttpClient$plugin$1$1", m18778f = "HttpClientFactory.kt", m18779i = {0}, m18780l = {31}, m18781m = "invokeSuspend", m18782n = {"request"}, m18783nl = {32}, m18784s = {"L$0"}, m18785v = 2)
public final class C4756t extends SuspendLambda implements Function4<C18960g, C1084f, Object, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f15934j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ C1084f f15935k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4740d f15936l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1918z f15937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4756t(C4740d c4740d, C1918z c1918z, Continuation continuation) {
        super(4, continuation);
        this.f15936l = c4740d;
        this.f15937m = c1918z;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(C18960g c18960g, C1084f c1084f, Object obj, Continuation<? super Unit> continuation) {
        C4756t c4756t = new C4756t(this.f15936l, this.f15937m, continuation);
        c4756t.f15935k = c1084f;
        return c4756t.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1084f c1084f = this.f15935k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f15934j;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            c1084f.f3942c.m4901g("User-Agent", C4583b.m5194b());
            this.f15935k = c1084f;
            this.f15934j = 1;
            if (this.f15936l.m5336b(c1084f, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C1918z c1918z = this.f15937m;
        C4189a<InterfaceC1091m> c4189a = C1086h.f3953a;
        C2327m c2327m = c1084f.f3942c;
        try {
            if (((Boolean) c1918z.f6477a.invoke()).booleanValue()) {
                c2327m.mo2982c("ld", C0156n.m213a(CppUtil.INSTANCE.m19547d()));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c2327m.mo2982c("ld", "e");
        }
        Unit unit = Unit.INSTANCE;
        return Unit.INSTANCE;
    }
}
