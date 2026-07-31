package p464Zd;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p017Ag.C0161s;
import p102Fb.C1583c;
import p107Fg.C1634b;
import p125Gg.InterfaceC1903k;
import p431Xg.C6368g;
import ru.zona.app.android.App;

/* JADX INFO: renamed from: Zd.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.init.ServicesInitializer$initApiConfig$2", m18778f = "ServicesInitializer.kt", m18779i = {0, 1}, m18780l = {220, 231}, m18781m = "invokeSuspend", m18782n = {"cachedConfig", "e"}, m18783nl = {222, 233}, m18784s = {"L$0", "L$0"}, m18785v = 2)
public final class C6807e extends SuspendLambda implements Function2<C0161s, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f22386j;

    /* JADX INFO: renamed from: k */
    public int f22387k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1903k<String> f22388l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C6810h f22389m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6807e(InterfaceC1903k<String> interfaceC1903k, C6810h c6810h, Continuation<? super C6807e> continuation) {
        super(2, continuation);
        this.f22388l = interfaceC1903k;
        this.f22389m = c6810h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6807e(this.f22388l, this.f22389m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0161s c0161s, Continuation<? super Unit> continuation) {
        return ((C6807e) create(c0161s, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (p107Fg.C1637e.m2265c(r0, "Update config is failed", r10, r9) == r1) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String value;
        String strM2185d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f22387k;
        C6810h c6810h = this.f22389m;
        InterfaceC1903k<String> interfaceC1903k = this.f22388l;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            try {
                value = interfaceC1903k.getValue();
            } catch (Exception e10) {
                C6810h.f22397p.mo2260f("Load cached config is failed " + e10.getMessage(), new Object[0]);
                value = "";
            }
            if (value.length() == 0) {
                C6810h.f22397p.mo2258d("Using builtin config", new Object[0]);
                App.C17997a c17997a = c6810h.f22405h;
                this.f22386j = SpillingKt.nullOutSpilledVariable(value);
                this.f22387k = 1;
                obj = c17997a.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                C6810h.f22397p.mo2258d("Using cached config", new Object[0]);
            }
            C1583c c1583c = C1583c.f5189e;
            C6368g c6368g = c6810h.f22400c;
            c1583c.getClass();
            strM2185d = c1583c.m2185d(value, c6368g, new HashSet(), new ArrayList());
            if (strM2185d.length() > 0 && !Intrinsics.areEqual(strM2185d, value)) {
                C6810h.f22397p.mo2258d("Store new config to cache", new Object[0]);
                interfaceC1903k.setValue(strM2185d);
            }
            return Unit.INSTANCE;
            value = (String) obj;
            C1583c c1583c2 = C1583c.f5189e;
            C6368g c6368g2 = c6810h.f22400c;
            c1583c2.getClass();
            strM2185d = c1583c2.m2185d(value, c6368g2, new HashSet(), new ArrayList());
            if (strM2185d.length() > 0) {
                C6810h.f22397p.mo2258d("Store new config to cache", new Object[0]);
                interfaceC1903k.setValue(strM2185d);
            }
        } catch (Exception e11) {
            C1634b c1634b = C6810h.f22397p;
            this.f22386j = SpillingKt.nullOutSpilledVariable(e11);
            this.f22387k = 2;
        }
        return Unit.INSTANCE;
    }
}
