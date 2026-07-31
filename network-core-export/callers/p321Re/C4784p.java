package p321Re;

import androidx.compose.foundation.layout.C7479d;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p002A1.C0021a;
import p055D0.C0998l0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p126H.EnumC2007m0;
import p158Id.InterfaceC2356a;
import p186K5.C2871c;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p304Qf.C4600a;
import p339Se.C4907C;
import p339Se.C4913f;
import p339Se.C4921n;
import p392Vd.EnumC5670a;
import p392Vd.EnumC5675f;
import p395Vg.C5701a;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5932q;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p640jf.C15475O;
import p640jf.C15497Z0;
import p640jf.C15501b;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p658kf.C15873k;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18580v;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p881z.C20541F0;

/* JADX INFO: renamed from: Re.p */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPriceBlockTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriceBlockTv.kt\nru/zona/app/screens/profile/premium/price/PriceBlockTvKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,199:1\n113#2:200\n113#2:201\n113#2:256\n113#2:257\n113#2:338\n113#2:377\n113#2:430\n113#2:470\n113#2:471\n113#2:521\n87#3:202\n85#3,8:203\n87#3:258\n85#3,8:259\n94#3:316\n94#3:320\n87#3:339\n83#3,10:340\n94#3:429\n87#3:483\n83#3,10:484\n94#3:525\n80#4,6:211\n87#4,3:226\n90#4,2:235\n80#4,6:267\n87#4,3:282\n90#4,2:291\n94#4:315\n94#4:319\n80#4,6:350\n87#4,3:365\n90#4,2:374\n80#4,6:387\n87#4,3:402\n90#4,2:411\n94#4:424\n94#4:428\n80#4,6:442\n87#4,3:457\n90#4,2:466\n94#4:481\n80#4,6:494\n87#4,3:509\n90#4,2:518\n94#4:524\n391#5,9:217\n400#5:237\n391#5,9:273\n400#5:293\n401#5,2:313\n401#5,2:317\n391#5,9:356\n400#5:376\n391#5,9:393\n400#5:413\n401#5,2:422\n401#5,2:426\n391#5,9:448\n400#5:468\n401#5,2:479\n391#5,9:500\n400#5:520\n401#5,2:522\n4360#6,6:229\n4360#6,6:285\n4360#6,6:368\n4360#6,6:405\n4360#6,6:460\n4360#6,6:512\n1282#7,6:238\n1282#7,6:244\n1282#7,6:250\n1282#7,6:295\n1282#7,6:301\n1282#7,6:307\n1282#7,6:332\n1282#7,6:415\n1282#7,6:472\n1#8:294\n1739#9:321\n1814#9,3:322\n363#9,7:325\n2068#9:414\n2069#9:421\n2068#9:469\n2069#9:478\n99#10:378\n97#10,8:379\n106#10:425\n99#10:431\n95#10,10:432\n106#10:482\n85#11:526\n85#11:527\n85#11:528\n85#11:529\n85#11:530\n*S KotlinDebug\n*F\n+ 1 PriceBlockTv.kt\nru/zona/app/screens/profile/premium/price/PriceBlockTvKt\n*L\n53#1:200\n54#1:201\n81#1:256\n82#1:257\n125#1:338\n137#1:377\n161#1:430\n168#1:470\n169#1:471\n196#1:521\n52#1:202\n52#1:203,8\n80#1:258\n80#1:259,8\n80#1:316\n52#1:320\n125#1:339\n125#1:340,10\n125#1:429\n188#1:483\n188#1:484,10\n188#1:525\n52#1:211,6\n52#1:226,3\n52#1:235,2\n80#1:267,6\n80#1:282,3\n80#1:291,2\n80#1:315\n52#1:319\n125#1:350,6\n125#1:365,3\n125#1:374,2\n132#1:387,6\n132#1:402,3\n132#1:411,2\n132#1:424\n125#1:428\n160#1:442,6\n160#1:457,3\n160#1:466,2\n160#1:481\n188#1:494,6\n188#1:509,3\n188#1:518,2\n188#1:524\n52#1:217,9\n52#1:237\n80#1:273,9\n80#1:293\n80#1:313,2\n52#1:317,2\n125#1:356,9\n125#1:376\n132#1:393,9\n132#1:413\n132#1:422,2\n125#1:426,2\n160#1:448,9\n160#1:468\n160#1:479,2\n188#1:500,9\n188#1:520\n188#1:522,2\n52#1:229,6\n80#1:285,6\n125#1:368,6\n132#1:405,6\n160#1:460,6\n188#1:512,6\n65#1:238,6\n72#1:244,6\n76#1:250,6\n93#1:295,6\n94#1:301,6\n95#1:307,6\n112#1:332,6\n143#1:415,6\n171#1:472,6\n110#1:321\n110#1:322,3\n111#1:325,7\n139#1:414\n139#1:421\n163#1:469\n163#1:478\n132#1:378\n132#1:379,8\n132#1:425\n160#1:431\n160#1:432,10\n160#1:482\n45#1:526\n46#1:527\n47#1:528\n49#1:529\n50#1:530\n*E\n"})
public final class C4784p {

    /* JADX INFO: renamed from: Re.p$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Long, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l10) {
            ((InterfaceC2356a) this.receiver).mo3047e(l10.longValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.p$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<InterfaceC2356a.b, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2356a.b bVar) {
            ((InterfaceC2356a) this.receiver).mo3048f(bVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.p$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function1<C5932q.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5932q.a aVar) {
            ((InterfaceC2356a) this.receiver).mo3051i(aVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.p$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC2356a) this.receiver).mo3052j();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.p$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC2356a) this.receiver).mo3049g();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Re.p$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Long, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l10) {
            ((InterfaceC2356a) this.receiver).mo3053k(l10.longValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m5358a(final List<C5701a> list, final Long l10, final Function1<? super Long, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1710672743);
        int i11 = (c15688rMo18372i.mo18362N(list) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(l10) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            List<C5701a> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5701a) it.next()).f18758c);
            }
            Iterator<C5701a> it2 = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i12 = -1;
                    break;
                }
                long j10 = it2.next().f18756a;
                if (l10 != null && j10 == l10.longValue()) {
                    break;
                } else {
                    i12++;
                }
            }
            boolean z10 = ((i11 & 896) == 256) | ((i11 & 14) == 4);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new Function1() { // from class: Re.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        function1.invoke(Long.valueOf(((C5701a) list.get(((Integer) obj).intValue())).f18756a));
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C15497Z0.m18125a(arrayList, i12, (Function1) objMo18389z, c15688rMo18372i, 0);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(list, l10, function1, i10) { // from class: Re.j

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f15986b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Long f15987c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function1 f15988d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4784p.m5358a(this.f15986b, this.f15987c, this.f15988d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: b */
    public static final void m5359b(InterfaceC2356a interfaceC2356a, InterfaceC15676n interfaceC15676n, final int i10) {
        boolean z10;
        InterfaceC5799g.a.C21098a c21098a;
        Long l10;
        InterfaceC5799g.a.f fVar;
        InterfaceC15676n.a.C21235a c21235a;
        boolean z11;
        int i11;
        C5932q.a aVar;
        ?? r10;
        int i12;
        char c10;
        InterfaceC15676n.a.C21235a c21235a2;
        int i13;
        final InterfaceC2356a interfaceC2356a2 = interfaceC2356a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1373300406);
        int i14 = i10 | (c15688rMo18372i.mo18362N(interfaceC2356a2) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC2356a2.mo3044b(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC2356a2.getState(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a3 = C15585G1.m18246a(interfaceC2356a2.mo3045c(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a4 = C15585G1.m18246a(interfaceC2356a2.mo3046d(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a5 = C15585G1.m18246a(interfaceC2356a2.mo3050h(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar2, 56, 12, 0.0f, 80, 4);
            C1982e.i iVarM2645g = C1982e.m2645g(32);
            C18863f.a aVar3 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(iVarM2645g, aVar3, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i15 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar2);
            InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a2);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            int iOrdinal = ((EnumC5670a) interfaceC15701v0M18246a.getValue()).ordinal();
            if (iOrdinal == 0) {
                z10 = true;
                c15688rMo18372i.mo18363O(76920480);
                c15688rMo18372i.m18410W(false);
                Unit unit = Unit.INSTANCE;
            } else if (iOrdinal == 1) {
                z10 = true;
                c15688rMo18372i.mo18363O(279577149);
                C15501b.m18126a(0, c15688rMo18372i);
                c15688rMo18372i.m18410W(false);
                Unit unit2 = Unit.INSTANCE;
            } else if (iOrdinal == 2) {
                c15688rMo18372i.mo18363O(77133326);
                List<C5701a> list = ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7682a;
                InterfaceC15676n.a.C21235a c21235a3 = InterfaceC15676n.a.f50781a;
                if (list == null) {
                    c15688rMo18372i.mo18363O(77124242);
                    c15688rMo18372i.m18410W(false);
                    fVar = fVar2;
                    c21098a = c21098a2;
                    aVar4 = aVar4;
                    c21235a = c21235a3;
                    z11 = false;
                } else {
                    c15688rMo18372i.mo18363O(77124243);
                    Long l11 = ((InterfaceC2356a.a) interfaceC15701v0M18246a3.getValue()).f7675a;
                    boolean z12 = (i14 & 14) == 4;
                    Object objMo18389z = c15688rMo18372i.mo18389z();
                    if (z12 || objMo18389z == c21235a3) {
                        c21098a = c21098a2;
                        l10 = l11;
                        fVar = fVar2;
                        c21235a = c21235a3;
                        a aVar5 = new a(1, interfaceC2356a2, InterfaceC2356a.class, "onCurrencySelected", "onCurrencySelected(J)V", 0);
                        c15688rMo18372i.mo18380q(aVar5);
                        objMo18389z = aVar5;
                    } else {
                        l10 = l11;
                        fVar = fVar2;
                        c21098a = c21098a2;
                        c21235a = c21235a3;
                    }
                    z11 = false;
                    m5358a(list, l10, (Function1) ((KFunction) objMo18389z), c15688rMo18372i, 0);
                    Unit unit3 = Unit.INSTANCE;
                    c15688rMo18372i.m18410W(false);
                }
                List list2 = (List) interfaceC15701v0M18246a4.getValue();
                if (list2 == null) {
                    c15688rMo18372i.mo18363O(77425004);
                    c15688rMo18372i.m18410W(z11);
                    c21235a2 = c21235a;
                    r10 = 0;
                    i12 = 6;
                    c10 = ' ';
                } else {
                    c15688rMo18372i.mo18363O(77425005);
                    boolean z13 = ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7683b;
                    int i16 = i14 & 14;
                    boolean z14 = i16 == 4;
                    Object objMo18389z2 = c15688rMo18372i.mo18389z();
                    if (z14 || objMo18389z2 == c21235a) {
                        i11 = i16;
                        b bVar = new b(1, interfaceC2356a, InterfaceC2356a.class, "onPriceFilterSelected", "onPriceFilterSelected(Lru/zona/app/components/profile/premium/price/IPremiumPriceComponent$PriceFilter;)V", 0);
                        c15688rMo18372i.mo18380q(bVar);
                        objMo18389z2 = bVar;
                    } else {
                        i11 = i16;
                    }
                    Function1 function1 = (Function1) ((KFunction) objMo18389z2);
                    InterfaceC2356a.b bVar2 = ((InterfaceC2356a.a) interfaceC15701v0M18246a3.getValue()).f7676b;
                    C5932q.a aVar6 = ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7684c;
                    boolean z15 = i11 == 4;
                    Object objMo18389z3 = c15688rMo18372i.mo18389z();
                    if (z15 || objMo18389z3 == c21235a) {
                        aVar = aVar6;
                        c cVar = new c(1, interfaceC2356a, InterfaceC2356a.class, "onPriceSelected", "onPriceSelected(Lru/zona/app/data/model/PriceUI$ID;)V", 0);
                        c15688rMo18372i.mo18380q(cVar);
                        objMo18389z3 = cVar;
                    } else {
                        aVar = aVar6;
                    }
                    Function1 function2 = (Function1) ((KFunction) objMo18389z3);
                    r10 = 0;
                    i12 = 6;
                    c10 = ' ';
                    c21235a2 = c21235a;
                    m5362e(z13, function1, bVar2, list2, aVar, function2, c15688rMo18372i, 0);
                    Unit unit4 = Unit.INSTANCE;
                    c15688rMo18372i.m18410W(false);
                }
                InterfaceC7507e interfaceC7507eM8515h2 = C7481f.m8515h(aVar2, 0.0f, 0.0f, 40, 0.0f, 11);
                C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.m2645g(16), aVar3, c15688rMo18372i, i12);
                long j11 = c15688rMo18372i.f50813T;
                int i17 = (int) (j11 ^ (j11 >>> c10));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8515h2, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar4);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i17))) {
                    C12269M6.m14188a(i17, c15688rMo18372i, i17, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                List list3 = (List) interfaceC15701v0M18246a4.getValue();
                C5932q c5932q = null;
                Object obj = null;
                if (list3 != null) {
                    for (Object obj2 : list3) {
                        if (Intrinsics.areEqual(((C5932q) obj2).f19643a, ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7684c)) {
                            obj = obj2;
                            break;
                        }
                    }
                    c5932q = (C5932q) obj;
                }
                if (c5932q == null) {
                    c15688rMo18372i.mo18363O(1581681565);
                    c15688rMo18372i.m18410W(r10);
                } else {
                    c15688rMo18372i.mo18363O(1581681566);
                    if (c5932q.f19649g) {
                        c15688rMo18372i.mo18363O(366603018);
                        m5361d(c5932q.f19650h, c5932q.f19652j, c15688rMo18372i, r10);
                        c15688rMo18372i.m18410W(r10);
                    } else {
                        c15688rMo18372i.mo18363O(366705845);
                        c15688rMo18372i.m18410W(r10);
                    }
                    Unit unit5 = Unit.INSTANCE;
                    c15688rMo18372i.m18410W(r10);
                }
                List list4 = (List) interfaceC15701v0M18246a5.getValue();
                boolean z16 = ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7685d;
                EnumC5675f enumC5675f = ((InterfaceC2356a.c) interfaceC15701v0M18246a2.getValue()).f7686e;
                int i18 = i14 & 14;
                boolean z17 = i18 == 4;
                Object objMo18389z4 = c15688rMo18372i.mo18389z();
                if (z17 || objMo18389z4 == c21235a2) {
                    i13 = 4;
                    d dVar2 = new d(0, interfaceC2356a, InterfaceC2356a.class, "onLoginClicked", "onLoginClicked()V", 0);
                    c15688rMo18372i.mo18380q(dVar2);
                    objMo18389z4 = dVar2;
                } else {
                    i13 = 4;
                }
                Function0 function0 = (Function0) ((KFunction) objMo18389z4);
                boolean z18 = i18 == i13;
                Object objMo18389z5 = c15688rMo18372i.mo18389z();
                if (z18 || objMo18389z5 == c21235a2) {
                    e eVar2 = new e(0, interfaceC2356a, InterfaceC2356a.class, "onConfirmClicked", "onConfirmClicked()V", 0);
                    c15688rMo18372i.mo18380q(eVar2);
                    objMo18389z5 = eVar2;
                }
                Function0 function3 = (Function0) ((KFunction) objMo18389z5);
                boolean z19 = i18 == i13;
                Object objMo18389z6 = c15688rMo18372i.mo18389z();
                if (z19 || objMo18389z6 == c21235a2) {
                    interfaceC2356a2 = interfaceC2356a;
                    f fVar3 = new f(1, interfaceC2356a2, InterfaceC2356a.class, "onPaymentMethodClicked", "onPaymentMethodClicked(J)V", 0);
                    c15688rMo18372i.mo18380q(fVar3);
                    objMo18389z6 = fVar3;
                } else {
                    interfaceC2356a2 = interfaceC2356a;
                }
                z10 = true;
                C4921n.m5512b(list4, z16, enumC5675f, function0, function3, (Function1) ((KFunction) objMo18389z6), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(true);
                c15688rMo18372i.m18410W(false);
                Unit unit6 = Unit.INSTANCE;
            } else {
                if (iOrdinal != 3) {
                    c15688rMo18372i.mo18363O(279576336);
                    c15688rMo18372i.m18410W(false);
                    throw new NoWhenBranchMatchedException();
                }
                c15688rMo18372i.mo18363O(279579102);
                C15475O.m18121b(0, c15688rMo18372i);
                c15688rMo18372i.m18410W(false);
                Unit unit7 = Unit.INSTANCE;
                z10 = true;
            }
            c15688rMo18372i.m18410W(z10);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Re.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4784p.m5359b(this.f15983b, (InterfaceC15676n) obj3, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5360c(final InterfaceC2356a.b bVar, final Function1<? super InterfaceC2356a.b, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-933699476);
        int i11 = 2;
        int i12 = 32;
        int i13 = ((i10 & 6) == 0 ? (c15688rMo18372i.mo18368e(bVar.ordinal()) ? 4 : 2) | i10 : i10) | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        int i14 = 0;
        if (c15688rMo18372i.mo18379p(i13 & 1, (i13 & 19) != 18)) {
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(8), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i15 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            c15688rMo18372i.mo18363O(-538941719);
            for (final InterfaceC2356a.b bVar2 : InterfaceC2356a.b.f7679f) {
                long j11 = bVar2 == bVar ? C3376c.f10951l : C3376c.f10942c;
                long j12 = bVar2 == bVar ? C3376c.f10947h : C3376c.f10944e;
                InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(C7482g.m8519d(aVar, i12), 100, 0.0f, i11);
                String strM19466e = C16973X.m19466e(bVar2.f7680b, c15688rMo18372i, i14);
                C4600a c4600a = bVar2.f7681c;
                C11732N0 c11732n0 = C3375b.f10929l;
                List listListOf = CollectionsKt.listOf(new C0998l0(j12));
                boolean zMo18368e = ((i13 & 112) == i12) | c15688rMo18372i.mo18368e(bVar2.ordinal());
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (zMo18368e || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new Function0() { // from class: Re.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(bVar2);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C15688r c15688r2 = c15688rMo18372i;
                C15873k.m18672a(interfaceC7507eM8530o, (Function0) objMo18389z, c4600a, strM19466e, null, false, false, false, false, c11732n0, listListOf, j11, c15688r2, 1572870, 944);
                c15688rMo18372i = c15688r2;
                aVar = aVar;
                i11 = 2;
                i12 = 32;
                i14 = 0;
            }
            c15688r = c15688rMo18372i;
            c15688r.m18410W(false);
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: Re.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C4784p.m5360c(bVar, function1, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m5361d(String str, final String str2, InterfaceC15676n interfaceC15676n, final int i10) {
        final String str3;
        C15688r c15688r;
        Function2<? super InterfaceC15676n, ? super Integer, Unit> c2871c;
        C15634Y0 c15634y0M18412Y;
        String str4;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-653201581);
        int i11 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(str2) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            if (str2 == null || StringsKt.isBlank(str2)) {
                c15634y0M18412Y = c15688rMo18372i.m18412Y();
                if (c15634y0M18412Y == null) {
                    return;
                } else {
                    c2871c = new C2871c(str, str2, i10, 1);
                }
            } else {
                C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
                long j10 = c15688rMo18372i.f50813T;
                int i12 = (int) (j10 ^ (j10 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, c15688rMo18372i);
                InterfaceC5799g.f19145s1.getClass();
                C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
                C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
                InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                    C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59725u0.getValue(), c15688rMo18372i, 0);
                if (str == null) {
                    str4 = null;
                } else if (str.length() > 0) {
                    str4 = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
                } else {
                    str4 = str;
                }
                C11565Q2.m13480b(C0021a.m43a(strM19466e, " ", str4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10921d, 0L, C18580v.m21028b(24), new C16318q(900), null, 0L, null, 0L, null, null, 16777209), c15688rMo18372i, 0, 0, 131070);
                c15688r = c15688rMo18372i;
                C1963W0.m2623a(C7482g.m8519d(aVar, 16), c15688r);
                C4913f.m5508a(str2, c15688r, (i11 >> 3) & 14);
                c15688r.m18410W(true);
                str3 = str;
            }
            c15634y0M18412Y.f50634d = c2871c;
        }
        str3 = str;
        c15688r = c15688rMo18372i;
        c15688r.mo18356H();
        c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c2871c = new Function2(str3, str2, i10) { // from class: Re.k

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f15989b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f15990c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4784p.m5361d(this.f15989b, this.f15990c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
            c15634y0M18412Y.f50634d = c2871c;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m5362e(final boolean z10, final Function1<? super InterfaceC2356a.b, Unit> function1, final InterfaceC2356a.b bVar, final List<C5932q> list, final C5932q.a aVar, final Function1<? super C5932q.a, Unit> function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(824976545);
        int i11 = i10 | (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | (c15688rMo18372i.mo18350B(function1) ? 32 : 16) | (c15688rMo18372i.mo18368e(bVar.ordinal()) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18362N(list) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(aVar) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT);
        if (c15688rMo18372i.mo18379p(i11 & 1, (74899 & i11) != 74898)) {
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(16), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(InterfaceC7507e.a.f24548b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            if (z10) {
                c15688rMo18372i.mo18363O(-1298302809);
                m5360c(bVar, function1, c15688rMo18372i, ((i11 >> 6) & 14) | (i11 & 112));
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1298145205);
                c15688rMo18372i.m18410W(false);
            }
            InterfaceC7507e interfaceC7507eM25138b = C20541F0.m25138b(C7482g.m8518c(C7479d.m8503a(EnumC2007m0.f6719c), 1.0f), C20541F0.m25137a(c15688rMo18372i), true, false);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(8), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM25138b, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            c15688rMo18372i.mo18363O(513544904);
            for (final C5932q c5932q : list) {
                boolean zAreEqual = Intrinsics.areEqual(aVar, c5932q.f19643a);
                boolean zMo18350B = ((458752 & i11) == 131072) | c15688rMo18372i.mo18350B(c5932q);
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new Function0() { // from class: Re.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(c5932q.f19643a);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C4907C.m5505c(c5932q, zAreEqual, (Function0) objMo18389z, c15688rMo18372i, 0);
            }
            c15688rMo18372i.m18410W(false);
            c15688rMo18372i.m18410W(true);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59691d0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10934q, C3376c.f10953n, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, function1, bVar, list, aVar, function2, i10) { // from class: Re.m

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f15993b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f15994c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ InterfaceC2356a.b f15995d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ List f15996e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C5932q.a f15997f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function1 f15998g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4784p.m5362e(this.f15993b, this.f15994c, this.f15995d, this.f15996e, this.f15997f, this.f15998g, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
