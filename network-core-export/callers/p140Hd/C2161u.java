package p140Hd;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import p107Fg.C1634b;
import p478aa.C7101e0;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p558fa.C11095d;
import p558fa.C11109r;
import p589ha.C11865c;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Hd.u */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.components.profile.premium.PremiumRootComponent$createChild$2$1", m18778f = "PremiumRootComponent.kt", m18779i = {}, m18780l = {291, 292, 296}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {292, 294, 297}, m18784s = {}, m18785v = 2)
public final class C2161u extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public C2135A f7130j;

    /* JADX INFO: renamed from: k */
    public String f7131k;

    /* JADX INFO: renamed from: l */
    public String f7132l;

    /* JADX INFO: renamed from: m */
    public int f7133m;

    /* JADX INFO: renamed from: n */
    public int f7134n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C2135A f7135o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2161u(C2135A c2135a, Continuation<? super C2161u> continuation) {
        super(2, continuation);
        this.f7135o = c2135a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C2161u(this.f7135o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
        return ((C2161u) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2135A c2135a;
        String str;
        C2135A c2135a2;
        String str2;
        Object objM19462a;
        String str3;
        String str4;
        int i10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f7134n;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C16972W c16972w = (C16972W) C19119E6.f59779k.getValue();
            c2135a = this.f7135o;
            this.f7130j = c2135a;
            this.f7134n = 1;
            obj = C16973X.m19462a(c16972w, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            c2135a = this.f7130j;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i11 == 2) {
                str = this.f7131k;
                c2135a2 = this.f7130j;
                ResultKt.throwOnFailure(obj);
                str2 = (String) obj;
                C16972W c16972w2 = (C16972W) C19285c2.f60083c0.getValue();
                this.f7130j = c2135a2;
                this.f7131k = str;
                this.f7132l = str2;
                this.f7133m = 1;
                this.f7134n = 3;
                objM19462a = C16973X.m19462a(c16972w2, this);
                if (objM19462a != coroutine_suspended) {
                    String str5 = str;
                    str3 = str2;
                    obj = objM19462a;
                    str4 = str5;
                    i10 = 1;
                }
                return coroutine_suspended;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f7133m;
            str3 = this.f7132l;
            str4 = this.f7131k;
            c2135a2 = this.f7130j;
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC2141a.b bVar = new InterfaceC2141a.b(str4, str3, CollectionsKt.listOf(new InterfaceC2141a.a(i10, (String) obj, true)));
        C1634b c1634b = C2135A.f7014u;
        C11095d c11095d = c2135a2.f7029p;
        C11865c c11865c = C7101e0.f23142a;
        C7106g.m8045c(c11095d, C11109r.f34545a.mo10090S0(), null, new C2136B(c2135a2, bVar, null), 2);
        return Unit.INSTANCE;
        String str6 = (String) obj;
        C16972W c16972w3 = (C16972W) C19101C4.f59636A.getValue();
        this.f7130j = c2135a;
        this.f7131k = str6;
        this.f7134n = 2;
        Object objM19462a2 = C16973X.m19462a(c16972w3, this);
        if (objM19462a2 != coroutine_suspended) {
            C2135A c2135a3 = c2135a;
            str = str6;
            obj = objM19462a2;
            c2135a2 = c2135a3;
            str2 = (String) obj;
            C16972W c16972w4 = (C16972W) C19285c2.f60083c0.getValue();
            this.f7130j = c2135a2;
            this.f7131k = str;
            this.f7132l = str2;
            this.f7133m = 1;
            this.f7134n = 3;
            objM19462a = C16973X.m19462a(c16972w4, this);
            if (objM19462a != coroutine_suspended) {
                String str7 = str;
                str3 = str2;
                obj = objM19462a;
                str4 = str7;
                i10 = 1;
                InterfaceC2141a.b bVar2 = new InterfaceC2141a.b(str4, str3, CollectionsKt.listOf(new InterfaceC2141a.a(i10, (String) obj, true)));
                C1634b c1634b2 = C2135A.f7014u;
                C11095d c11095d2 = c2135a2.f7029p;
                C11865c c11865c2 = C7101e0.f23142a;
                C7106g.m8045c(c11095d2, C11109r.f34545a.mo10090S0(), null, new C2136B(c2135a2, bVar2, null), 2);
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
