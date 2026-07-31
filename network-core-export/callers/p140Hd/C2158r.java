package p140Hd;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import mg.C17044g;
import p359Tg.InterfaceC5166h;
import p395Vg.C5703c;
import p689mb.C16955E;
import p689mb.C16957G;
import p689mb.C16963M;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C17002w;
import p689mb.C17005z;
import p845wg.C19101C4;
import p845wg.C19156K0;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Hd.r */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.components.profile.premium.PremiumRootComponent$3", m18778f = "PremiumRootComponent.kt", m18779i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, m18780l = {127, 131, 128, 140}, m18781m = "invokeSuspend", m18782n = {"old", "new", "isNewOrderCreated", "monthsInOrder", "old", "new", "isNewOrderCreated", "monthsInOrder", "old", "new", "isNewOrderCreated", "monthsInOrder", "old", "new", "isNewOrderCreated", "monthsInOrder"}, m18783nl = {128, 130, 138, 141}, m18784s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, m18785v = 2)
public final class C2158r extends SuspendLambda implements Function3<InterfaceC5166h.a, InterfaceC5166h.a, Continuation<? super InterfaceC5166h.a>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f7118j;

    /* JADX INFO: renamed from: k */
    public Object f7119k;

    /* JADX INFO: renamed from: l */
    public String f7120l;

    /* JADX INFO: renamed from: m */
    public C16972W f7121m;

    /* JADX INFO: renamed from: n */
    public Object[] f7122n;

    /* JADX INFO: renamed from: o */
    public int f7123o;

    /* JADX INFO: renamed from: p */
    public int f7124p;

    /* JADX INFO: renamed from: q */
    public int f7125q;

    /* JADX INFO: renamed from: r */
    public int f7126r;

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f7127s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ InterfaceC5166h.a f7128t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C2135A f7129u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2158r(C2135A c2135a, Continuation<? super C2158r> continuation) {
        super(3, continuation);
        this.f7129u = c2135a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC5166h.a aVar, InterfaceC5166h.a aVar2, Continuation<? super InterfaceC5166h.a> continuation) {
        C2158r c2158r = new C2158r(this.f7129u, continuation);
        c2158r.f7127s = aVar;
        c2158r.f7128t = aVar2;
        return c2158r.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0141  */
    /* JADX WARN: Code duplicated, block: B:36:0x0144  */
    /* JADX WARN: Code duplicated, block: B:40:0x0176  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object objM19462a;
        int i10;
        int i11;
        Function1 function2;
        String str;
        C16972W c16972w;
        Object[] objArr;
        char c10;
        Object objM19474a;
        int i12;
        Object[] objArr2;
        int i13;
        int i14;
        long j10;
        Locale locale;
        String str2;
        Object objM19463b;
        Function1 function3;
        String str3;
        boolean z10;
        Object objM19462a2;
        int i15;
        InterfaceC5166h.a aVar = (InterfaceC5166h.a) this.f7127s;
        InterfaceC5166h.a aVar2 = this.f7128t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i16 = this.f7126r;
        C2135A c2135a = this.f7129u;
        if (i16 == 0) {
            ResultKt.throwOnFailure(obj);
            C5703c c5703c = aVar.f16977a.f16980a;
            long j11 = c5703c.f18765a;
            C5703c c5703c2 = aVar2.f16977a.f16980a;
            int i17 = (j11 == c5703c2.f18765a && !c5703c.f18772h && c5703c2.f18772h) ? 1 : 0;
            int i18 = c5703c2.f18768d / 30;
            if (i17 != 0) {
                c2135a.f7027n.mo1251q();
                function1 = c2135a.f7028o;
                C16972W c16972w2 = (C16972W) C19101C4.f59699h0.getValue();
                this.f7127s = SpillingKt.nullOutSpilledVariable(aVar);
                this.f7128t = aVar2;
                this.f7118j = function1;
                this.f7123o = i17;
                this.f7124p = i18;
                this.f7126r = 1;
                objM19462a = C16973X.m19462a(c16972w2, this);
                if (objM19462a != coroutine_suspended) {
                    i10 = i17;
                    i11 = i18;
                }
                return coroutine_suspended;
            }
            return aVar2;
        }
        if (i16 == 1) {
            i11 = this.f7124p;
            i10 = this.f7123o;
            function1 = (Function1) this.f7118j;
            ResultKt.throwOnFailure(obj);
            objM19462a = obj;
        } else {
            if (i16 == 2) {
                i14 = this.f7125q;
                int i19 = this.f7124p;
                i12 = this.f7123o;
                Object[] objArr3 = this.f7122n;
                c16972w = this.f7121m;
                str = this.f7120l;
                function2 = (Function1) this.f7119k;
                Object[] objArr4 = (Object[]) this.f7118j;
                ResultKt.throwOnFailure(obj);
                objArr2 = objArr3;
                c10 = 2;
                objArr = objArr4;
                i13 = i19;
                objM19474a = obj;
                objArr2[i14] = objM19474a;
                j10 = ((InterfaceC5166h.a) c2135a.f7018e.getState().f32389b.getValue()).f16977a.f16980a.f18771g;
                locale = C17044g.f53455a;
                if (j10 <= 0) {
                    str2 = "";
                } else {
                    str2 = new SimpleDateFormat("d MMMM yyyy", locale).format(new Date(j10));
                }
                objArr[c10] = str2;
                this.f7127s = SpillingKt.nullOutSpilledVariable(aVar);
                this.f7128t = aVar2;
                this.f7118j = function2;
                this.f7119k = str;
                this.f7120l = null;
                this.f7121m = null;
                this.f7122n = null;
                this.f7123o = i12;
                this.f7124p = i13;
                this.f7126r = 3;
                objM19463b = C16973X.m19463b(c16972w, objArr, this);
                if (objM19463b != coroutine_suspended) {
                    function3 = function2;
                    str3 = (String) objM19463b;
                    C16972W c16972w3 = (C16972W) C19285c2.f60083c0.getValue();
                    this.f7127s = SpillingKt.nullOutSpilledVariable(aVar);
                    this.f7128t = aVar2;
                    this.f7118j = function3;
                    this.f7119k = str;
                    this.f7120l = str3;
                    this.f7123o = i12;
                    this.f7124p = i13;
                    z10 = true;
                    this.f7125q = 1;
                    this.f7126r = 4;
                    objM19462a2 = C16973X.m19462a(c16972w3, this);
                    if (objM19462a2 != coroutine_suspended) {
                        i15 = 1;
                    }
                }
                return coroutine_suspended;
            }
            if (i16 == 3) {
                int i20 = this.f7124p;
                int i21 = this.f7123o;
                String str4 = (String) this.f7119k;
                Function1 function4 = (Function1) this.f7118j;
                ResultKt.throwOnFailure(obj);
                i13 = i20;
                i12 = i21;
                str = str4;
                function3 = function4;
                objM19463b = obj;
                str3 = (String) objM19463b;
                C16972W c16972w4 = (C16972W) C19285c2.f60083c0.getValue();
                this.f7127s = SpillingKt.nullOutSpilledVariable(aVar);
                this.f7128t = aVar2;
                this.f7118j = function3;
                this.f7119k = str;
                this.f7120l = str3;
                this.f7123o = i12;
                this.f7124p = i13;
                z10 = true;
                this.f7125q = 1;
                this.f7126r = 4;
                objM19462a2 = C16973X.m19462a(c16972w4, this);
                if (objM19462a2 != coroutine_suspended) {
                    i15 = 1;
                }
                return coroutine_suspended;
            }
            if (i16 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i22 = this.f7125q;
            String str5 = this.f7120l;
            String str6 = (String) this.f7119k;
            function3 = (Function1) this.f7118j;
            ResultKt.throwOnFailure(obj);
            objM19462a2 = obj;
            str = str6;
            str3 = str5;
            i15 = i22;
            z10 = true;
        }
        function3.invoke(new InterfaceC2141a.b(str, str3, CollectionsKt.listOf(new InterfaceC2141a.a(i15, (String) objM19462a2, z10))));
        return aVar2;
        function2 = function1;
        str = (String) objM19462a;
        c16972w = (C16972W) C19101C4.f59697g0.getValue();
        objArr = new Object[3];
        objArr[0] = Boxing.boxInt(i11);
        C17002w c17002w = (C17002w) C19156K0.f59929a.getValue();
        this.f7127s = SpillingKt.nullOutSpilledVariable(aVar);
        this.f7128t = aVar2;
        this.f7118j = objArr;
        this.f7119k = function2;
        this.f7120l = str;
        this.f7121m = c16972w;
        this.f7122n = objArr;
        this.f7123o = i10;
        this.f7124p = i11;
        this.f7125q = 1;
        this.f7126r = 2;
        c10 = 2;
        objM19474a = C17005z.m19474a(c17002w, i11, C16963M.f53209a, (C16955E) C16957G.f53203c.invoke(), this);
        if (objM19474a != coroutine_suspended) {
            i12 = i10;
            objArr2 = objArr;
            i13 = i11;
            i14 = 1;
            objArr2[i14] = objM19474a;
            j10 = ((InterfaceC5166h.a) c2135a.f7018e.getState().f32389b.getValue()).f16977a.f16980a.f18771g;
            locale = C17044g.f53455a;
            if (j10 <= 0) {
                str2 = "";
            } else {
                str2 = new SimpleDateFormat("d MMMM yyyy", locale).format(new Date(j10));
            }
            objArr[c10] = str2;
            this.f7127s = SpillingKt.nullOutSpilledVariable(aVar);
            this.f7128t = aVar2;
            this.f7118j = function2;
            this.f7119k = str;
            this.f7120l = null;
            this.f7121m = null;
            this.f7122n = null;
            this.f7123o = i12;
            this.f7124p = i13;
            this.f7126r = 3;
            objM19463b = C16973X.m19463b(c16972w, objArr, this);
            if (objM19463b != coroutine_suspended) {
                function3 = function2;
                str3 = (String) objM19463b;
                C16972W c16972w5 = (C16972W) C19285c2.f60083c0.getValue();
                this.f7127s = SpillingKt.nullOutSpilledVariable(aVar);
                this.f7128t = aVar2;
                this.f7118j = function3;
                this.f7119k = str;
                this.f7120l = str3;
                this.f7123o = i12;
                this.f7124p = i13;
                z10 = true;
                this.f7125q = 1;
                this.f7126r = 4;
                objM19462a2 = C16973X.m19462a(c16972w5, this);
                if (objM19462a2 != coroutine_suspended) {
                    i15 = 1;
                    function3.invoke(new InterfaceC2141a.b(str, str3, CollectionsKt.listOf(new InterfaceC2141a.a(i15, (String) objM19462a2, z10))));
                    return aVar2;
                }
            }
        }
        return coroutine_suspended;
    }
}
