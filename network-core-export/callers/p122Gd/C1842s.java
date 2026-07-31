package p122Gd;

import ch.C8484c;
import ch.C8485d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p017Ag.C0164v;
import p053Cg.C0794f;
import p430Xf.InterfaceC6332c;
import p480ah.InterfaceC7360f;
import p524da.C10454v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Gd.s */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.components.profile.login.LoginPasswordComponent$1", m18778f = "LoginPasswordComponent.kt", m18779i = {0}, m18780l = {39}, m18781m = "invokeSuspend", m18782n = {"state"}, m18783nl = {61}, m18784s = {"L$0"}, m18785v = 2)
public final class C1842s extends SuspendLambda implements Function2<InterfaceC7360f.a, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f6271j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f6272k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1843t f6273l;

    /* JADX INFO: renamed from: Gd.s$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.profile.login.LoginPasswordComponent$1$1", m18778f = "LoginPasswordComponent.kt", m18779i = {0, 0, 1, 1}, m18780l = {53, 54}, m18781m = "invokeSuspend", m18782n = {"e", "isBadPassword", "e", "isBadPassword"}, m18783nl = {54, 55}, m18784s = {"L$1", "Z$0", "L$1", "Z$0"}, m18785v = 2)
    @SourceDebugExtension({"SMAP\nLoginPasswordComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginPasswordComponent.kt\nru/zona/app/components/profile/login/LoginPasswordComponent$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,85:1\n230#2,5:86\n*S KotlinDebug\n*F\n+ 1 LoginPasswordComponent.kt\nru/zona/app/components/profile/login/LoginPasswordComponent$1$1\n*L\n44#1:86,5\n*E\n"})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public boolean f6274j;

        /* JADX INFO: renamed from: k */
        public C1843t f6275k;

        /* JADX INFO: renamed from: l */
        public Object f6276l;

        /* JADX INFO: renamed from: m */
        public InterfaceC6332c f6277m;

        /* JADX INFO: renamed from: n */
        public String f6278n;

        /* JADX INFO: renamed from: o */
        public int f6279o;

        /* JADX INFO: renamed from: p */
        public final /* synthetic */ InterfaceC7360f.a f6280p;

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C1843t f6281q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7360f.a aVar, C1843t c1843t, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f6280p = aVar;
            this.f6281q = c1843t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new a(this.f6280p, this.f6281q, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            Object value;
            String string;
            InterfaceC6332c interfaceC6332c;
            boolean z10;
            C1843t c1843t;
            InterfaceC6332c interfaceC6332c2;
            String str;
            C1843t c1843t2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f6279o;
            if (i10 != 0) {
                if (i10 == 1) {
                    boolean z11 = this.f6274j;
                    InterfaceC6332c interfaceC6332c3 = this.f6277m;
                    exc = (Exception) this.f6276l;
                    c1843t = this.f6275k;
                    ResultKt.throwOnFailure(obj);
                    interfaceC6332c = interfaceC6332c3;
                    z10 = z11;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = this.f6278n;
                    interfaceC6332c2 = this.f6277m;
                    c1843t2 = this.f6275k;
                    ResultKt.throwOnFailure(obj);
                }
                interfaceC6332c2.mo2537a(str, (String) obj, c1843t2.f6283c);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC7360f.a aVar = this.f6280p;
            C8484c c8484c = aVar.f23598b;
            exc = aVar.f23599c;
            boolean zM10354b = C8485d.m10354b(c8484c);
            C1843t c1843t3 = this.f6281q;
            if (zM10354b) {
                c1843t3.f6287g.invoke();
            } else {
                boolean zAreEqual = Intrinsics.areEqual("badPassword", exc != null ? C0794f.m1296b(exc) : null);
                C10454v0 c10454v0 = c1843t3.f6290j;
                do {
                    value = c10454v0.getValue();
                    InterfaceC1831h.a aVar2 = (InterfaceC1831h.a) value;
                    if (exc == null || (string = exc.toString()) == null) {
                        string = "";
                    }
                    aVar2.getClass();
                } while (!c10454v0.mo12533d(value, new InterfaceC1831h.a(string, !zAreEqual)));
                if (exc != null && !zAreEqual) {
                    InterfaceC6332c interfaceC6332c4 = c1843t3.f6285e;
                    C16972W c16972w = (C16972W) C19278b3.f60011q0.getValue();
                    this.f6275k = c1843t3;
                    this.f6276l = SpillingKt.nullOutSpilledVariable(exc);
                    this.f6277m = interfaceC6332c4;
                    this.f6274j = zAreEqual;
                    this.f6279o = 1;
                    Object objM19462a = C16973X.m19462a(c16972w, this);
                    if (objM19462a != coroutine_suspended) {
                        interfaceC6332c = interfaceC6332c4;
                        z10 = zAreEqual;
                        obj = objM19462a;
                        c1843t = c1843t3;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
            interfaceC6332c2 = interfaceC6332c;
            String str2 = (String) obj;
            C16972W c16972w2 = (C16972W) C19285c2.f60069T0.getValue();
            Object[] objArr = {c1843t.f6283c};
            this.f6275k = c1843t;
            this.f6276l = SpillingKt.nullOutSpilledVariable(exc);
            this.f6277m = interfaceC6332c2;
            this.f6278n = str2;
            this.f6274j = z10;
            this.f6279o = 2;
            Object objM19463b = C16973X.m19463b(c16972w2, objArr, this);
            if (objM19463b != coroutine_suspended) {
                str = str2;
                obj = objM19463b;
                c1843t2 = c1843t;
                interfaceC6332c2.mo2537a(str, (String) obj, c1843t2.f6283c);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842s(C1843t c1843t, Continuation<? super C1842s> continuation) {
        super(2, continuation);
        this.f6273l = c1843t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1842s c1842s = new C1842s(this.f6273l, continuation);
        c1842s.f6272k = obj;
        return c1842s;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC7360f.a aVar, Continuation<? super Unit> continuation) {
        return ((C1842s) create(aVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC7360f.a aVar = (InterfaceC7360f.a) this.f6272k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f6271j;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C1843t c1843t = this.f6273l;
            C0164v c0164v = c1843t.f6292l;
            a aVar2 = new a(aVar, c1843t, null);
            this.f6272k = SpillingKt.nullOutSpilledVariable(aVar);
            this.f6271j = 1;
            if (c0164v.m218a(aVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
