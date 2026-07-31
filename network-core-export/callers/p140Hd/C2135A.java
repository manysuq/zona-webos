package p140Hd;

import ch.C8485d;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mg.InterfaceC17049l;
import p048Cb.InterfaceC0706g;
import p053Cg.InterfaceC0790b;
import p054D.C0818L0;
import p086Ed.C1361Q;
import p086Ed.C1364S;
import p086Ed.C1366T;
import p086Ed.C1420u;
import p091F0.AbstractC1467g;
import p107Fg.C1634b;
import p114G5.C1719g;
import p114G5.InterfaceC1715c;
import p125Gg.EnumC1908p;
import p125Gg.InterfaceC1904l;
import p211Lc.C3326c;
import p211Lc.C3327d;
import p294Q5.C4567m;
import p294Q5.C4568n;
import p312R5.C4689n;
import p312R5.C4694s;
import p348T5.C4989b;
import p359Tg.C5162d;
import p359Tg.C5167i;
import p359Tg.InterfaceC5166h;
import p366U5.InterfaceC5372f;
import p384V5.InterfaceC5655c;
import p395Vg.C5703c;
import p395Vg.C5704d;
import p402W5.InterfaceC5862d;
import p420X5.C6224b;
import p438Y5.InterfaceC6450f;
import p478aa.C7101e0;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p480ah.InterfaceC7360f;
import p524da.C10408X;
import p524da.C10416c0;
import p524da.C10427i;
import p558fa.C11095d;
import p558fa.C11109r;
import p589ha.C11865c;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p879yf.InterfaceC20505a;
import ru.zona.app.android.MainActivity;
import va.InterfaceC18718c;

/* JADX INFO: renamed from: Hd.A */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPremiumRootComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumRootComponent.kt\nru/zona/app/components/profile/premium/PremiumRootComponent\n+ 2 SlotNavigatorExt.kt\ncom/arkivanov/decompose/router/slot/SlotNavigatorExtKt\n*L\n1#1,351:1\n27#2,7:352\n*S KotlinDebug\n*F\n+ 1 PremiumRootComponent.kt\nru/zona/app/components/profile/premium/PremiumRootComponent\n*L\n344#1:352,7\n*E\n"})
public final class C2135A implements InterfaceC2144d, InterfaceC1715c {

    /* JADX INFO: renamed from: u */
    public static final C1634b f7014u;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1715c f7015b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20505a f7016c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7360f f7017d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5166h f7018e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1904l<Long> f7019f;

    /* JADX INFO: renamed from: g */
    public final MainActivity.C18001b f7020g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0790b f7021h;

    /* JADX INFO: renamed from: i */
    public final C1361Q f7022i;

    /* JADX INFO: renamed from: j */
    public final C1364S f7023j;

    /* JADX INFO: renamed from: k */
    public final C1366T f7024k;

    /* JADX INFO: renamed from: l */
    public final C0818L0 f7025l;

    /* JADX INFO: renamed from: m */
    public final String f7026m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC0706g f7027n;

    /* JADX INFO: renamed from: o */
    public final C1420u f7028o;

    /* JADX INFO: renamed from: p */
    public final C11095d f7029p;

    /* JADX INFO: renamed from: q */
    public final C4568n f7030q;

    /* JADX INFO: renamed from: r */
    public final C4989b f7031r;

    /* JADX INFO: renamed from: s */
    public final C3326c f7032s;

    /* JADX INFO: renamed from: t */
    public final C4989b f7033t;

    /* JADX INFO: renamed from: Hd.A$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.profile.premium.PremiumRootComponent$navigateTo$1", m18778f = "PremiumRootComponent.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC2144d.b f7035k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2144d.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7035k = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C2135A.this.new a(this.f7035k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C2135A.this.f7032s.mo4063a(new C2166z(this.f7035k, 0), new C4694s());
            return Unit.INSTANCE;
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C2135A.class).getSimpleName();
        f7014u = new C1634b();
    }

    public C2135A(InterfaceC1715c interfaceC1715c, InterfaceC20505a interfaceC20505a, InterfaceC7360f interfaceC7360f, InterfaceC5166h interfaceC5166h, InterfaceC1904l interfaceC1904l, MainActivity.C18001b c18001b, InterfaceC17049l interfaceC17049l, C1361Q c1361q, C1364S c1364s, C1366T c1366t, C0818L0 c0818l0, String str, InterfaceC0706g interfaceC0706g, C1420u c1420u) {
        Object obj;
        Object eVar;
        this.f7015b = interfaceC1715c;
        this.f7016c = interfaceC20505a;
        this.f7017d = interfaceC7360f;
        this.f7018e = interfaceC5166h;
        this.f7019f = interfaceC1904l;
        this.f7020g = c18001b;
        this.f7021h = interfaceC17049l;
        this.f7022i = c1361q;
        this.f7023j = c1364s;
        this.f7024k = c1366t;
        this.f7025l = c0818l0;
        this.f7026m = str;
        this.f7027n = interfaceC0706g;
        this.f7028o = c1420u;
        C11095d c11095dM7048b = C6224b.m7048b(this);
        this.f7029p = c11095dM7048b;
        C4568n c4568n = new C4568n();
        this.f7030q = c4568n;
        this.f7031r = C4567m.m5181a(this, c4568n, InterfaceC2141a.b.Companion.serializer(), null, null, new Function2() { // from class: Hd.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                InterfaceC1715c interfaceC1715c2 = (InterfaceC1715c) obj3;
                final C2135A c2135a = this.f7109b;
                return new C2150j(interfaceC1715c2, (InterfaceC2141a.b) obj2, new C2162v(0, c2135a, C2135A.class, "dismissMessageBox", "dismissMessageBox()V", 0), new Function1() { // from class: Hd.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        C2135A c2135a2 = c2135a;
                        if (iIntValue == 2) {
                            c2135a2.f7025l.invoke();
                        } else {
                            c2135a2.f7030q.m5182a(C2163w.f7136b, new C2164x());
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
        }, 12);
        InterfaceC2144d.b.a aVar = InterfaceC2144d.b.Companion;
        C3326c c3326cM4065a = C3327d.m4065a(interfaceC0706g, aVar.serializer());
        this.f7032s = c3326cM4065a;
        InterfaceC18718c<InterfaceC2144d.b> interfaceC18718cSerializer = aVar.serializer();
        InterfaceC7360f.a value = interfaceC7360f.getState().getValue();
        InterfaceC5166h.a aVar2 = (InterfaceC5166h.a) interfaceC5166h.getState().f32389b.getValue();
        long jLongValue = ((Number) interfaceC1904l.getValue()).longValue();
        if (C8485d.m10354b(value.f23598b) && value.f23598b.f29040e) {
            EnumC1908p enumC1908p = aVar2.f16978b;
            if (enumC1908p == EnumC1908p.f6447b || enumC1908p == EnumC1908p.f6448c) {
                obj = InterfaceC2144d.b.C21022b.INSTANCE;
            } else {
                C5167i c5167i = aVar2.f16977a;
                if (C5704d.m6338b(c5167i.f16980a)) {
                    obj = InterfaceC2144d.b.c.INSTANCE;
                } else {
                    C5703c c5703c = c5167i.f16980a;
                    if (c5703c.f18772h) {
                        eVar = new InterfaceC2144d.b.d(c5167i);
                    } else {
                        long j10 = c5703c.f18777m;
                        Duration.Companion companion = Duration.INSTANCE;
                        if (Duration.m26976getInWholeMillisecondsimpl(DurationKt.toDuration(c5167i.f16982c, DurationUnit.SECONDS)) + j10 < jLongValue) {
                            obj = InterfaceC2144d.b.c.INSTANCE;
                        } else {
                            eVar = new InterfaceC2144d.b.e(c5167i);
                        }
                    }
                    obj = eVar;
                }
            }
        } else {
            obj = InterfaceC2144d.b.c.INSTANCE;
        }
        this.f7033t = C4689n.m5312b(this, c3326cM4065a, interfaceC18718cSerializer, obj, new C2159s(2, this, C2135A.class, "createChild", "createChild(Lru/zona/app/components/profile/premium/IPremiumRootComponent$Config;Lcom/arkivanov/decompose/ComponentContext;)Lru/zona/app/components/profile/premium/IPremiumRootComponent$Child;", 0));
        C10427i.m12549o(new C10416c0(interfaceC7360f.getState(), interfaceC5166h.getState(), new C2157q(this, null)), c11095dM7048b);
        C10427i.m12549o(new C10408X(interfaceC5166h.getState().f32389b.getValue(), C10427i.m12541g(interfaceC5166h.getState(), new C2153m()), new C2158r(this, null)), c11095dM7048b);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f4 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:35:0x00f0, B:37:0x00f4, B:40:0x0109, B:41:0x0110, B:32:0x00e8), top: B:73:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:35:0x00f0, B:37:0x00f4, B:40:0x0109, B:41:0x0110, B:32:0x00e8), top: B:73:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x013b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code duplicated, block: B:57:0x0177  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01db  */
    /* JADX WARN: Code duplicated, block: B:68:0x0211  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final Object m2804c(C2135A c2135a, String str, Function1 function1, Continuation continuation) {
        C2165y c2165y;
        String str2;
        Function1 function2;
        Object objM19462a;
        Exception exc;
        String str3;
        C5162d c5162d;
        String str4;
        Object objM19462a2;
        Exception exc2;
        Function1 function3;
        C2135A c2135a2;
        String str5;
        String str6;
        String strConcat;
        String str7;
        List listCreateListBuilder;
        Object objM19462a3;
        C2135A c2135a3;
        List list;
        List list2;
        String str8;
        String str9;
        List list3;
        String str10;
        int i10;
        String str11;
        String str12;
        C2135A c2135a4;
        List list4;
        int i11;
        C2135A c2135a5 = c2135a;
        String str13 = c2135a5.f7026m;
        if (continuation instanceof C2165y) {
            c2165y = (C2165y) continuation;
            int i12 = c2165y.f7149v;
            if ((i12 & IntCompanionObject.MIN_VALUE) != 0) {
                c2165y.f7149v = i12 - IntCompanionObject.MIN_VALUE;
            } else {
                c2165y = new C2165y(c2135a5, continuation);
            }
        } else {
            c2165y = new C2165y(c2135a5, continuation);
        }
        Object objInvoke = c2165y.f7147t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c2165y.f7149v;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            try {
                str2 = str;
                try {
                    c2135a5.f7027n.mo1245k(str2);
                    c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str2);
                    c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function1);
                    c2165y.f7149v = 1;
                    function2 = function1;
                    try {
                        objInvoke = function2.invoke(c2165y);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c5162d = (C5162d) objInvoke;
                        if (c5162d != null) {
                            throw new Exception("getOrderResult() returned null");
                        }
                        c2135a5.m2807d(new InterfaceC2144d.b.e(c5162d.f16970b));
                        c2135a5.f7020g.invoke(c5162d.f16969a);
                        return Unit.INSTANCE;
                    } catch (Exception e10) {
                        e = e10;
                        C16972W c16972w = (C16972W) C19285c2.f60073V0.getValue();
                        c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str2);
                        c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function2);
                        c2165y.f7139l = e;
                        c2165y.f7140m = c2135a5;
                        c2165y.f7149v = 2;
                        objM19462a = C16973X.m19462a(c16972w, c2165y);
                        if (objM19462a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        String str14 = str2;
                        exc = e;
                        objInvoke = objM19462a;
                        str3 = str14;
                        str4 = (String) objInvoke;
                        C16972W c16972w2 = (C16972W) C19278b3.f59982c.getValue();
                        c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str3);
                        c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function2);
                        c2165y.f7139l = exc;
                        c2165y.f7140m = c2135a5;
                        c2165y.f7141n = str4;
                        c2165y.f7149v = 3;
                        objM19462a2 = C16973X.m19462a(c16972w2, c2165y);
                        if (objM19462a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        exc2 = exc;
                        function3 = function2;
                        c2135a2 = c2135a5;
                        str5 = str4;
                        objInvoke = objM19462a2;
                        str6 = str3;
                        if (StringsKt.isBlank(str13)) {
                            strConcat = ".";
                        } else {
                            strConcat = " ".concat(str13);
                        }
                        str7 = objInvoke + strConcat;
                        listCreateListBuilder = CollectionsKt.createListBuilder();
                        C16972W c16972w3 = (C16972W) C19285c2.f60083c0.getValue();
                        c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str6);
                        c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
                        c2165y.f7139l = exc2;
                        c2165y.f7140m = listCreateListBuilder;
                        c2165y.f7141n = listCreateListBuilder;
                        c2165y.f7142o = listCreateListBuilder;
                        c2165y.f7143p = c2135a2;
                        c2165y.f7144q = str5;
                        c2165y.f7145r = str7;
                        c2165y.f7146s = 1;
                        c2165y.f7149v = 4;
                        objM19462a3 = C16973X.m19462a(c16972w3, c2165y);
                        if (objM19462a3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c2135a3 = c2135a2;
                        list = listCreateListBuilder;
                        list2 = list;
                        str8 = str7;
                        str9 = str6;
                        objInvoke = objM19462a3;
                        list3 = list2;
                        str10 = str5;
                        i10 = 1;
                        list.add(new InterfaceC2141a.a(i10, (String) objInvoke, true));
                        if (!StringsKt.isBlank(str13)) {
                            C16972W c16972w4 = (C16972W) C19140H5.f59834T0.getValue();
                            c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str9);
                            c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
                            c2165y.f7139l = exc2;
                            c2165y.f7140m = list2;
                            c2165y.f7141n = SpillingKt.nullOutSpilledVariable(list3);
                            c2165y.f7142o = list3;
                            c2165y.f7143p = c2135a3;
                            c2165y.f7144q = str10;
                            c2165y.f7145r = str8;
                            c2165y.f7146s = 2;
                            c2165y.f7149v = 5;
                            objInvoke = C16973X.m19462a(c16972w4, c2165y);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str11 = str8;
                            str12 = str10;
                            c2135a4 = c2135a3;
                            list4 = list2;
                            i11 = 2;
                            list3.add(new InterfaceC2141a.a(i11, (String) objInvoke, false));
                            c2135a3 = c2135a4;
                            list2 = list4;
                            str8 = str11;
                            str10 = str12;
                        }
                        Unit unit = Unit.INSTANCE;
                        InterfaceC2141a.b bVar = new InterfaceC2141a.b(str10, str8, CollectionsKt.build(list2));
                        C11095d c11095d = c2135a3.f7029p;
                        C11865c c11865c = C7101e0.f23142a;
                        C7106g.m8045c(c11095d, C11109r.f34545a.mo10090S0(), null, new C2136B(c2135a3, bVar, null), 2);
                        f7014u.getClass();
                    }
                } catch (Exception e11) {
                    e = e11;
                    function2 = function1;
                    C16972W c16972w5 = (C16972W) C19285c2.f60073V0.getValue();
                    c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str2);
                    c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function2);
                    c2165y.f7139l = e;
                    c2165y.f7140m = c2135a5;
                    c2165y.f7149v = 2;
                    objM19462a = C16973X.m19462a(c16972w5, c2165y);
                    if (objM19462a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String str15 = str2;
                    exc = e;
                    objInvoke = objM19462a;
                    str3 = str15;
                    str4 = (String) objInvoke;
                    C16972W c16972w6 = (C16972W) C19278b3.f59982c.getValue();
                    c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str3);
                    c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function2);
                    c2165y.f7139l = exc;
                    c2165y.f7140m = c2135a5;
                    c2165y.f7141n = str4;
                    c2165y.f7149v = 3;
                    objM19462a2 = C16973X.m19462a(c16972w6, c2165y);
                    if (objM19462a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    exc2 = exc;
                    function3 = function2;
                    c2135a2 = c2135a5;
                    str5 = str4;
                    objInvoke = objM19462a2;
                    str6 = str3;
                    if (StringsKt.isBlank(str13)) {
                        strConcat = ".";
                    } else {
                        strConcat = " ".concat(str13);
                    }
                    str7 = objInvoke + strConcat;
                    listCreateListBuilder = CollectionsKt.createListBuilder();
                    C16972W c16972w7 = (C16972W) C19285c2.f60083c0.getValue();
                    c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str6);
                    c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
                    c2165y.f7139l = exc2;
                    c2165y.f7140m = listCreateListBuilder;
                    c2165y.f7141n = listCreateListBuilder;
                    c2165y.f7142o = listCreateListBuilder;
                    c2165y.f7143p = c2135a2;
                    c2165y.f7144q = str5;
                    c2165y.f7145r = str7;
                    c2165y.f7146s = 1;
                    c2165y.f7149v = 4;
                    objM19462a3 = C16973X.m19462a(c16972w7, c2165y);
                    if (objM19462a3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c2135a3 = c2135a2;
                    list = listCreateListBuilder;
                    list2 = list;
                    str8 = str7;
                    str9 = str6;
                    objInvoke = objM19462a3;
                    list3 = list2;
                    str10 = str5;
                    i10 = 1;
                    list.add(new InterfaceC2141a.a(i10, (String) objInvoke, true));
                    if (!StringsKt.isBlank(str13)) {
                        C16972W c16972w8 = (C16972W) C19140H5.f59834T0.getValue();
                        c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str9);
                        c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
                        c2165y.f7139l = exc2;
                        c2165y.f7140m = list2;
                        c2165y.f7141n = SpillingKt.nullOutSpilledVariable(list3);
                        c2165y.f7142o = list3;
                        c2165y.f7143p = c2135a3;
                        c2165y.f7144q = str10;
                        c2165y.f7145r = str8;
                        c2165y.f7146s = 2;
                        c2165y.f7149v = 5;
                        objInvoke = C16973X.m19462a(c16972w8, c2165y);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str11 = str8;
                        str12 = str10;
                        c2135a4 = c2135a3;
                        list4 = list2;
                        i11 = 2;
                        list3.add(new InterfaceC2141a.a(i11, (String) objInvoke, false));
                        c2135a3 = c2135a4;
                        list2 = list4;
                        str8 = str11;
                        str10 = str12;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    InterfaceC2141a.b bVar2 = new InterfaceC2141a.b(str10, str8, CollectionsKt.build(list2));
                    C11095d c11095d2 = c2135a3.f7029p;
                    C11865c c11865c2 = C7101e0.f23142a;
                    C7106g.m8045c(c11095d2, C11109r.f34545a.mo10090S0(), null, new C2136B(c2135a3, bVar2, null), 2);
                    f7014u.getClass();
                    return Unit.INSTANCE;
                }
            } catch (Exception e12) {
                e = e12;
                str2 = str;
            }
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    c2135a5 = (C2135A) c2165y.f7140m;
                    exc = c2165y.f7139l;
                    function2 = (Function1) c2165y.f7138k;
                    str3 = (String) c2165y.f7137j;
                    ResultKt.throwOnFailure(objInvoke);
                    str4 = (String) objInvoke;
                    C16972W c16972w9 = (C16972W) C19278b3.f59982c.getValue();
                    c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str3);
                    c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function2);
                    c2165y.f7139l = exc;
                    c2165y.f7140m = c2135a5;
                    c2165y.f7141n = str4;
                    c2165y.f7149v = 3;
                    objM19462a2 = C16973X.m19462a(c16972w9, c2165y);
                    if (objM19462a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    exc2 = exc;
                    function3 = function2;
                    c2135a2 = c2135a5;
                    str5 = str4;
                    objInvoke = objM19462a2;
                } else if (i13 == 3) {
                    str5 = (String) c2165y.f7141n;
                    c2135a2 = (C2135A) c2165y.f7140m;
                    Exception exc3 = c2165y.f7139l;
                    Function1 function4 = (Function1) c2165y.f7138k;
                    str3 = (String) c2165y.f7137j;
                    ResultKt.throwOnFailure(objInvoke);
                    exc2 = exc3;
                    function3 = function4;
                } else {
                    if (i13 == 4) {
                        i10 = c2165y.f7146s;
                        str8 = c2165y.f7145r;
                        str10 = c2165y.f7144q;
                        c2135a3 = c2165y.f7143p;
                        List list5 = c2165y.f7142o;
                        List list6 = (List) c2165y.f7141n;
                        list2 = (List) c2165y.f7140m;
                        exc2 = c2165y.f7139l;
                        function3 = (Function1) c2165y.f7138k;
                        String str16 = (String) c2165y.f7137j;
                        ResultKt.throwOnFailure(objInvoke);
                        str9 = str16;
                        list3 = list6;
                        list = list5;
                        list.add(new InterfaceC2141a.a(i10, (String) objInvoke, true));
                        if (!StringsKt.isBlank(str13)) {
                            C16972W c16972w10 = (C16972W) C19140H5.f59834T0.getValue();
                            c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str9);
                            c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
                            c2165y.f7139l = exc2;
                            c2165y.f7140m = list2;
                            c2165y.f7141n = SpillingKt.nullOutSpilledVariable(list3);
                            c2165y.f7142o = list3;
                            c2165y.f7143p = c2135a3;
                            c2165y.f7144q = str10;
                            c2165y.f7145r = str8;
                            c2165y.f7146s = 2;
                            c2165y.f7149v = 5;
                            objInvoke = C16973X.m19462a(c16972w10, c2165y);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str11 = str8;
                            str12 = str10;
                            c2135a4 = c2135a3;
                            list4 = list2;
                            i11 = 2;
                        }
                        Unit unit3 = Unit.INSTANCE;
                        InterfaceC2141a.b bVar3 = new InterfaceC2141a.b(str10, str8, CollectionsKt.build(list2));
                        C11095d c11095d3 = c2135a3.f7029p;
                        C11865c c11865c3 = C7101e0.f23142a;
                        C7106g.m8045c(c11095d3, C11109r.f34545a.mo10090S0(), null, new C2136B(c2135a3, bVar3, null), 2);
                        f7014u.getClass();
                        return Unit.INSTANCE;
                    }
                    if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = c2165y.f7146s;
                    str11 = c2165y.f7145r;
                    str12 = c2165y.f7144q;
                    c2135a4 = c2165y.f7143p;
                    list3 = c2165y.f7142o;
                    list4 = (List) c2165y.f7140m;
                    ResultKt.throwOnFailure(objInvoke);
                }
                list3.add(new InterfaceC2141a.a(i11, (String) objInvoke, false));
                c2135a3 = c2135a4;
                list2 = list4;
                str8 = str11;
                str10 = str12;
                Unit unit4 = Unit.INSTANCE;
                InterfaceC2141a.b bVar4 = new InterfaceC2141a.b(str10, str8, CollectionsKt.build(list2));
                C11095d c11095d4 = c2135a3.f7029p;
                C11865c c11865c4 = C7101e0.f23142a;
                C7106g.m8045c(c11095d4, C11109r.f34545a.mo10090S0(), null, new C2136B(c2135a3, bVar4, null), 2);
                f7014u.getClass();
                return Unit.INSTANCE;
            }
            Function1 function5 = (Function1) c2165y.f7138k;
            String str17 = (String) c2165y.f7137j;
            try {
                ResultKt.throwOnFailure(objInvoke);
                c5162d = (C5162d) objInvoke;
                if (c5162d != null) {
                    throw new Exception("getOrderResult() returned null");
                }
                c2135a5.m2807d(new InterfaceC2144d.b.e(c5162d.f16970b));
                c2135a5.f7020g.invoke(c5162d.f16969a);
                return Unit.INSTANCE;
            } catch (Exception e13) {
                e = e13;
                function2 = function5;
                str2 = str17;
                C16972W c16972w11 = (C16972W) C19285c2.f60073V0.getValue();
                c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str2);
                c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function2);
                c2165y.f7139l = e;
                c2165y.f7140m = c2135a5;
                c2165y.f7149v = 2;
                objM19462a = C16973X.m19462a(c16972w11, c2165y);
                if (objM19462a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String str18 = str2;
                exc = e;
                objInvoke = objM19462a;
                str3 = str18;
                str4 = (String) objInvoke;
                C16972W c16972w12 = (C16972W) C19278b3.f59982c.getValue();
                c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str3);
                c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function2);
                c2165y.f7139l = exc;
                c2165y.f7140m = c2135a5;
                c2165y.f7141n = str4;
                c2165y.f7149v = 3;
                objM19462a2 = C16973X.m19462a(c16972w12, c2165y);
                if (objM19462a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                exc2 = exc;
                function3 = function2;
                c2135a2 = c2135a5;
                str5 = str4;
                objInvoke = objM19462a2;
                str6 = str3;
                if (StringsKt.isBlank(str13)) {
                    strConcat = ".";
                } else {
                    strConcat = " ".concat(str13);
                }
                str7 = objInvoke + strConcat;
                listCreateListBuilder = CollectionsKt.createListBuilder();
                C16972W c16972w13 = (C16972W) C19285c2.f60083c0.getValue();
                c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str6);
                c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
                c2165y.f7139l = exc2;
                c2165y.f7140m = listCreateListBuilder;
                c2165y.f7141n = listCreateListBuilder;
                c2165y.f7142o = listCreateListBuilder;
                c2165y.f7143p = c2135a2;
                c2165y.f7144q = str5;
                c2165y.f7145r = str7;
                c2165y.f7146s = 1;
                c2165y.f7149v = 4;
                objM19462a3 = C16973X.m19462a(c16972w13, c2165y);
                if (objM19462a3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c2135a3 = c2135a2;
                list = listCreateListBuilder;
                list2 = list;
                str8 = str7;
                str9 = str6;
                objInvoke = objM19462a3;
                list3 = list2;
                str10 = str5;
                i10 = 1;
                list.add(new InterfaceC2141a.a(i10, (String) objInvoke, true));
                if (!StringsKt.isBlank(str13)) {
                    C16972W c16972w14 = (C16972W) C19140H5.f59834T0.getValue();
                    c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str9);
                    c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
                    c2165y.f7139l = exc2;
                    c2165y.f7140m = list2;
                    c2165y.f7141n = SpillingKt.nullOutSpilledVariable(list3);
                    c2165y.f7142o = list3;
                    c2165y.f7143p = c2135a3;
                    c2165y.f7144q = str10;
                    c2165y.f7145r = str8;
                    c2165y.f7146s = 2;
                    c2165y.f7149v = 5;
                    objInvoke = C16973X.m19462a(c16972w14, c2165y);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str11 = str8;
                    str12 = str10;
                    c2135a4 = c2135a3;
                    list4 = list2;
                    i11 = 2;
                    list3.add(new InterfaceC2141a.a(i11, (String) objInvoke, false));
                    c2135a3 = c2135a4;
                    list2 = list4;
                    str8 = str11;
                    str10 = str12;
                }
                Unit unit5 = Unit.INSTANCE;
                InterfaceC2141a.b bVar5 = new InterfaceC2141a.b(str10, str8, CollectionsKt.build(list2));
                C11095d c11095d5 = c2135a3.f7029p;
                C11865c c11865c5 = C7101e0.f23142a;
                C7106g.m8045c(c11095d5, C11109r.f34545a.mo10090S0(), null, new C2136B(c2135a3, bVar5, null), 2);
                f7014u.getClass();
            }
        }
        str6 = str3;
        if (StringsKt.isBlank(str13)) {
            strConcat = ".";
        } else {
            strConcat = " ".concat(str13);
        }
        str7 = objInvoke + strConcat;
        listCreateListBuilder = CollectionsKt.createListBuilder();
        C16972W c16972w15 = (C16972W) C19285c2.f60083c0.getValue();
        c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str6);
        c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
        c2165y.f7139l = exc2;
        c2165y.f7140m = listCreateListBuilder;
        c2165y.f7141n = listCreateListBuilder;
        c2165y.f7142o = listCreateListBuilder;
        c2165y.f7143p = c2135a2;
        c2165y.f7144q = str5;
        c2165y.f7145r = str7;
        c2165y.f7146s = 1;
        c2165y.f7149v = 4;
        objM19462a3 = C16973X.m19462a(c16972w15, c2165y);
        if (objM19462a3 == coroutine_suspended) {
            return coroutine_suspended;
        }
        c2135a3 = c2135a2;
        list = listCreateListBuilder;
        list2 = list;
        str8 = str7;
        str9 = str6;
        objInvoke = objM19462a3;
        list3 = list2;
        str10 = str5;
        i10 = 1;
        list.add(new InterfaceC2141a.a(i10, (String) objInvoke, true));
        if (!StringsKt.isBlank(str13)) {
            C16972W c16972w16 = (C16972W) C19140H5.f59834T0.getValue();
            c2165y.f7137j = SpillingKt.nullOutSpilledVariable(str9);
            c2165y.f7138k = SpillingKt.nullOutSpilledVariable(function3);
            c2165y.f7139l = exc2;
            c2165y.f7140m = list2;
            c2165y.f7141n = SpillingKt.nullOutSpilledVariable(list3);
            c2165y.f7142o = list3;
            c2165y.f7143p = c2135a3;
            c2165y.f7144q = str10;
            c2165y.f7145r = str8;
            c2165y.f7146s = 2;
            c2165y.f7149v = 5;
            objInvoke = C16973X.m19462a(c16972w16, c2165y);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            str11 = str8;
            str12 = str10;
            c2135a4 = c2135a3;
            list4 = list2;
            i11 = 2;
            list3.add(new InterfaceC2141a.a(i11, (String) objInvoke, false));
            c2135a3 = c2135a4;
            list2 = list4;
            str8 = str11;
            str10 = str12;
        }
        Unit unit6 = Unit.INSTANCE;
        InterfaceC2141a.b bVar6 = new InterfaceC2141a.b(str10, str8, CollectionsKt.build(list2));
        C11095d c11095d6 = c2135a3.f7029p;
        C11865c c11865c6 = C7101e0.f23142a;
        C7106g.m8045c(c11095d6, C11109r.f34545a.mo10090S0(), null, new C2136B(c2135a3, bVar6, null), 2);
        f7014u.getClass();
        return Unit.INSTANCE;
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: K */
    public final InterfaceC5372f mo793K() {
        return this.f7015b.mo793K();
    }

    @Override // p140Hd.InterfaceC2144d
    /* JADX INFO: renamed from: a */
    public final AbstractC1467g mo2805a() {
        return this.f7033t;
    }

    @Override // p140Hd.InterfaceC2144d
    /* JADX INFO: renamed from: b */
    public final C4989b mo2806b() {
        return this.f7031r;
    }

    /* JADX INFO: renamed from: d */
    public final void m2807d(InterfaceC2144d.b bVar) {
        C11865c c11865c = C7101e0.f23142a;
        C7106g.m8045c(this.f7029p, C11109r.f34545a.mo10090S0(), null, new a(bVar, null), 2);
    }

    @Override // p114G5.InterfaceC1715c
    public final InterfaceC5862d getLifecycle() {
        return this.f7015b.getLifecycle();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: n */
    public final InterfaceC5655c mo795n() {
        return this.f7015b.mo795n();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: u */
    public final C1719g mo796u() {
        return this.f7015b.mo796u();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: x */
    public final InterfaceC6450f mo797x() {
        return this.f7015b.mo797x();
    }
}
