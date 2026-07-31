package p321Re;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8158N;
import bf.C8166R0;
import bf.C8192d;
import bf.C8199f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import org.conscrypt.PSKKeyManager;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p158Id.InterfaceC2356a;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p304Qf.C4600a;
import p339Se.C4921n;
import p339Se.C4930w;
import p392Vd.EnumC5670a;
import p392Vd.EnumC5675f;
import p395Vg.C5701a;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5932q;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;

/* JADX INFO: renamed from: Re.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPriceBlockM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriceBlockM.kt\nru/zona/app/screens/profile/premium/price/PriceBlockMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,136:1\n1282#2,6:137\n1282#2,6:143\n1282#2,6:188\n1282#2,6:201\n1282#2,6:207\n1282#2,6:213\n1282#2,6:230\n1282#2,6:277\n113#3:149\n113#3:150\n113#3:199\n113#3:200\n113#3:236\n113#3:237\n113#3:275\n113#3:276\n87#4:151\n85#4,8:152\n94#4:198\n80#5,6:160\n87#5,3:175\n90#5,2:184\n94#5:197\n80#5,6:247\n87#5,3:262\n90#5,2:271\n94#5:286\n391#6,9:166\n400#6:186\n401#6,2:195\n391#6,9:253\n400#6:273\n401#6,2:284\n4360#7,6:178\n4360#7,6:265\n2068#8:187\n2069#8:194\n1739#8:219\n1814#8,3:220\n363#8,7:223\n2068#8:274\n2069#8:283\n99#9:238\n97#9,8:239\n106#9:287\n85#10:288\n85#10:289\n85#10:290\n85#10:291\n85#10:292\n*S KotlinDebug\n*F\n+ 1 PriceBlockM.kt\nru/zona/app/screens/profile/premium/price/PriceBlockMKt\n*L\n52#1:137,6\n59#1:143,6\n72#1:188,6\n88#1:201,6\n89#1:207,6\n90#1:213,6\n106#1:230,6\n132#1:277,6\n65#1:149\n66#1:150\n77#1:199\n83#1:200\n117#1:236\n118#1:237\n125#1:275\n126#1:276\n64#1:151\n64#1:152,8\n64#1:198\n64#1:160,6\n64#1:175,3\n64#1:184,2\n64#1:197\n116#1:247,6\n116#1:262,3\n116#1:271,2\n116#1:286\n64#1:166,9\n64#1:186\n64#1:195,2\n116#1:253,9\n116#1:273\n116#1:284,2\n64#1:178,6\n116#1:265,6\n68#1:187\n68#1:194\n104#1:219\n104#1:220,3\n105#1:223,7\n120#1:274\n120#1:283\n116#1:238\n116#1:239,8\n116#1:287\n36#1:288\n37#1:289\n38#1:290\n40#1:291\n41#1:292\n*E\n"})
public final class C4775g {

    /* JADX INFO: renamed from: Re.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Long, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l10) {
            ((InterfaceC2356a) this.receiver).mo3047e(l10.longValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.g$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<InterfaceC2356a.b, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2356a.b bVar) {
            ((InterfaceC2356a) this.receiver).mo3048f(bVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.g$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC2356a) this.receiver).mo3052j();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.g$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC2356a) this.receiver).mo3049g();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.g$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Long, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l10) {
            ((InterfaceC2356a) this.receiver).mo3053k(l10.longValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m5355a(final List<C5701a> list, final Long l10, final Function1<? super Long, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1718026810);
        int i12 = (c15688rMo18372i.mo18362N(list) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(l10) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 147) != 146)) {
            List<C5701a> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5701a) it.next()).f18758c);
            }
            Iterator<C5701a> it2 = list.iterator();
            int i13 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i11 = -1;
                    break;
                }
                long j10 = it2.next().f18756a;
                if (l10 != null && j10 == l10.longValue()) {
                    i11 = i13;
                    break;
                }
                i13++;
            }
            boolean z10 = ((i12 & 896) == 256) | ((i12 & 14) == 4);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new Function1() { // from class: Re.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        function1.invoke(Long.valueOf(((C5701a) list.get(((Integer) obj).intValue())).f18756a));
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C8166R0.m10136b(arrayList, i11, (Function1) objMo18389z, true, 0.0f, null, c15688rMo18372i, 3072, 48);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(list, l10, function1, i10) { // from class: Re.d

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f15976b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Long f15977c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function1 f15978d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4775g.m5355a(this.f15976b, this.f15977c, this.f15978d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m5356b(InterfaceC2356a interfaceC2356a, InterfaceC15676n interfaceC15676n, final int i10) {
        Long l10;
        boolean z10;
        int i11;
        InterfaceC15676n.a.C21235a c21235a;
        final InterfaceC2356a interfaceC2356a2 = interfaceC2356a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1508037316);
        int i12 = i10 | (c15688rMo18372i.mo18362N(interfaceC2356a2) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC2356a2.mo3044b(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC2356a2.getState(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a3 = C15585G1.m18246a(interfaceC2356a2.mo3045c(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a4 = C15585G1.m18246a(interfaceC2356a2.mo3046d(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a5 = C15585G1.m18246a(interfaceC2356a2.mo3050h(), c15688rMo18372i, 0);
            int iOrdinal = ((EnumC5670a) interfaceC15701v0M18246a.getValue()).ordinal();
            if (iOrdinal == 0) {
                c15688rMo18372i.mo18363O(-581367932);
                c15688rMo18372i.m18410W(false);
                Unit unit = Unit.INSTANCE;
            } else if (iOrdinal == 1) {
                c15688rMo18372i.mo18363O(-1819868072);
                C8192d.m10142a(0, c15688rMo18372i);
                c15688rMo18372i.m18410W(false);
                Unit unit2 = Unit.INSTANCE;
            } else if (iOrdinal == 2) {
                c15688rMo18372i.mo18363O(-581165812);
                List<C5701a> list = ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7682a;
                InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
                if (list == null) {
                    c15688rMo18372i.mo18363O(-581183762);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-581183761);
                    Long l11 = ((InterfaceC2356a.a) interfaceC15701v0M18246a3.getValue()).f7675a;
                    boolean z11 = (i12 & 14) == 4;
                    Object objMo18389z = c15688rMo18372i.mo18389z();
                    if (z11 || objMo18389z == c21235a2) {
                        l10 = l11;
                        a aVar = new a(1, interfaceC2356a2, InterfaceC2356a.class, "onCurrencySelected", "onCurrencySelected(J)V", 0);
                        c15688rMo18372i.mo18380q(aVar);
                        objMo18389z = aVar;
                    } else {
                        l10 = l11;
                    }
                    m5355a(list, l10, (Function1) ((KFunction) objMo18389z), c15688rMo18372i, 0);
                    Unit unit3 = Unit.INSTANCE;
                    c15688rMo18372i.m18410W(false);
                }
                if (((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7683b) {
                    c15688rMo18372i.mo18363O(-580904265);
                    InterfaceC2356a.b bVar = ((InterfaceC2356a.a) interfaceC15701v0M18246a3.getValue()).f7676b;
                    boolean z12 = (i12 & 14) == 4;
                    Object objMo18389z2 = c15688rMo18372i.mo18389z();
                    if (z12 || objMo18389z2 == c21235a2) {
                        interfaceC2356a2 = interfaceC2356a;
                        b bVar2 = new b(1, interfaceC2356a2, InterfaceC2356a.class, "onPriceFilterSelected", "onPriceFilterSelected(Lru/zona/app/components/profile/premium/price/IPremiumPriceComponent$PriceFilter;)V", 0);
                        c15688rMo18372i.mo18380q(bVar2);
                        objMo18389z2 = bVar2;
                    } else {
                        interfaceC2356a2 = interfaceC2356a;
                    }
                    m5357c(bVar, (Function1) ((KFunction) objMo18389z2), c15688rMo18372i, 0);
                    c15688rMo18372i.m18410W(false);
                } else {
                    interfaceC2356a2 = interfaceC2356a;
                    c15688rMo18372i.mo18363O(-580705338);
                    c15688rMo18372i.m18410W(false);
                }
                List list2 = (List) interfaceC15701v0M18246a4.getValue();
                if (list2 == null || list2.isEmpty()) {
                    z10 = false;
                    c15688rMo18372i.mo18363O(-579397882);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-580623157);
                    InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
                    InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar2, 0.0f, 16, 0.0f, 0.0f, 13);
                    float f10 = 8;
                    C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(f10), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
                    long j10 = c15688rMo18372i.f50813T;
                    int i13 = (int) (j10 ^ (j10 >>> 32));
                    InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
                    InterfaceC5799g.f19145s1.getClass();
                    C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
                    c15688rMo18372i.mo18353E();
                    if (c15688rMo18372i.f50812S) {
                        c15688rMo18372i.mo18355G(aVar3);
                    } else {
                        c15688rMo18372i.mo18378o();
                    }
                    C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
                    C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
                    InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                    if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                        C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                    List<C5932q> list3 = (List) interfaceC15701v0M18246a4.getValue();
                    if (list3 == null) {
                        c15688rMo18372i.mo18363O(-1607452398);
                        c15688rMo18372i.m18410W(false);
                    } else {
                        c15688rMo18372i.mo18363O(-1607452397);
                        for (final C5932q c5932q : list3) {
                            boolean zAreEqual = Intrinsics.areEqual(((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7684c, c5932q.f19643a);
                            boolean zMo18350B = ((i12 & 14) == 4) | c15688rMo18372i.mo18350B(c5932q);
                            Object objMo18389z3 = c15688rMo18372i.mo18389z();
                            if (zMo18350B || objMo18389z3 == c21235a2) {
                                objMo18389z3 = new Function0() { // from class: Re.a
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC2356a2.mo3051i(c5932q.f19643a);
                                        return Unit.INSTANCE;
                                    }
                                };
                                c15688rMo18372i.mo18380q(objMo18389z3);
                            }
                            C4930w.m5516d(c5932q, zAreEqual, (Function0) objMo18389z3, c15688rMo18372i, 0);
                        }
                        c15688rMo18372i.m18410W(false);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    c15688rMo18372i.m18410W(true);
                    C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59691d0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10912g, C3376c.f10953n, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
                    c15688rMo18372i = c15688rMo18372i;
                    C1963W0.m2623a(C7482g.m8519d(aVar2, 32), c15688rMo18372i);
                    List list4 = (List) interfaceC15701v0M18246a5.getValue();
                    boolean z13 = ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7685d;
                    EnumC5675f enumC5675f = ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7686e;
                    int i14 = i12 & 14;
                    boolean z14 = i14 == 4;
                    Object objMo18389z4 = c15688rMo18372i.mo18389z();
                    if (z14 || objMo18389z4 == c21235a2) {
                        i11 = 4;
                        c21235a = c21235a2;
                        c cVar = new c(0, interfaceC2356a2, InterfaceC2356a.class, "onLoginClicked", "onLoginClicked()V", 0);
                        c15688rMo18372i.mo18380q(cVar);
                        objMo18389z4 = cVar;
                    } else {
                        c21235a = c21235a2;
                        i11 = 4;
                    }
                    Function0 function0 = (Function0) ((KFunction) objMo18389z4);
                    boolean z15 = i14 == i11;
                    Object objMo18389z5 = c15688rMo18372i.mo18389z();
                    if (z15 || objMo18389z5 == c21235a) {
                        d dVar = new d(0, interfaceC2356a, InterfaceC2356a.class, "onConfirmClicked", "onConfirmClicked()V", 0);
                        c15688rMo18372i.mo18380q(dVar);
                        objMo18389z5 = dVar;
                    }
                    Function0 function1 = (Function0) ((KFunction) objMo18389z5);
                    boolean z16 = i14 == i11;
                    Object objMo18389z6 = c15688rMo18372i.mo18389z();
                    if (z16 || objMo18389z6 == c21235a) {
                        interfaceC2356a2 = interfaceC2356a;
                        objMo18389z6 = new e(1, interfaceC2356a2, InterfaceC2356a.class, "onPaymentMethodClicked", "onPaymentMethodClicked(J)V", 0);
                        c15688rMo18372i.mo18380q(objMo18389z6);
                    } else {
                        interfaceC2356a2 = interfaceC2356a;
                    }
                    z10 = false;
                    C4921n.m5511a(list4, z13, enumC5675f, function0, function1, (Function1) ((KFunction) objMo18389z6), c15688rMo18372i, 0);
                    c15688rMo18372i.m18410W(false);
                }
                c15688rMo18372i.m18410W(z10);
                Unit unit5 = Unit.INSTANCE;
            } else {
                if (iOrdinal != 3) {
                    c15688rMo18372i.mo18363O(-1819868517);
                    c15688rMo18372i.m18410W(false);
                    throw new NoWhenBranchMatchedException();
                }
                c15688rMo18372i.mo18363O(-1819866279);
                C8158N.m10133b(0, c15688rMo18372i);
                c15688rMo18372i.m18410W(false);
                Unit unit6 = Unit.INSTANCE;
            }
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Re.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4775g.m5356b(this.f15973b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5357c(final InterfaceC2356a.b bVar, final Function1<? super InterfaceC2356a.b, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1770720147);
        int i11 = 2;
        int i12 = (c15688rMo18372i.mo18368e(bVar.ordinal()) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        boolean z10 = true;
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 19) != 18)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar, 0.0f, 24, 0.0f, 0.0f, 13);
            InterfaceC7507e.a aVar2 = aVar;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(8), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            c15688rMo18372i.mo18363O(1241561683);
            for (final InterfaceC2356a.b bVar2 : InterfaceC2356a.b.f7679f) {
                long j11 = bVar2 == bVar ? C3376c.f10951l : C3376c.f10942c;
                long j12 = bVar2 == bVar ? C3376c.f10947h : C3376c.f10944e;
                InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(C7482g.m8519d(aVar2, 40), 90, 0.0f, i11);
                if (1.0f <= 0.0d) {
                    C2192a.m2845a("invalid weight; must be greater than zero");
                }
                InterfaceC7507e interfaceC7507eMo2665S0 = interfaceC7507eM8530o.mo2665S0(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), z10));
                String strM19466e = C16973X.m19466e(bVar2.f7680b, c15688rMo18372i, 0);
                InterfaceC7507e.a aVar4 = aVar2;
                long j13 = j11;
                C4600a c4600a = bVar2.f7681c;
                boolean zMo18368e = ((i12 & 112) == 32) | c15688rMo18372i.mo18368e(bVar2.ordinal());
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (zMo18368e || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new Function0() { // from class: Re.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(bVar2);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C8199f0.m10144a(interfaceC7507eMo2665S0, strM19466e, j13, j12, c4600a, false, (Function0) objMo18389z, c15688rMo18372i, 0, 32);
                i12 = i12;
                aVar2 = aVar4;
                i11 = 2;
                z10 = true;
            }
            c15688rMo18372i.m18410W(false);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function1, i10) { // from class: Re.f

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f15982c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4775g.m5357c(this.f15981b, this.f15982c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
