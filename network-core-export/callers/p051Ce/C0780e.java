package p051Ce;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import p126H.C1956T;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p214Lf.C3376c;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5940y;
import p640jf.C15456E0;
import p640jf.C15536p0;
import p640jf.C15548v0;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15658h;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19285c2;
import p881z.C20541F0;
import td.InterfaceC18334a;

/* JADX INFO: renamed from: Ce.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPeriodFilterTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodFilterTv.kt\nru/zona/app/screens/filters/years/PeriodFilterTvKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,81:1\n1960#2,3:82\n2068#2:86\n2069#2:93\n1960#2,3:94\n85#3:85\n1282#4,6:87\n1282#4,6:137\n87#5:97\n83#5,10:98\n94#5:146\n80#6,6:108\n87#6,3:123\n90#6,2:132\n94#6:145\n391#7,9:114\n400#7:134\n401#7,2:143\n4360#8,6:126\n113#9:135\n113#9:136\n*S KotlinDebug\n*F\n+ 1 PeriodFilterTv.kt\nru/zona/app/screens/filters/years/PeriodFilterTvKt\n*L\n37#1:82,3\n56#1:86\n56#1:93\n66#1:94,3\n34#1:85\n60#1:87,6\n74#1:137,6\n47#1:97\n47#1:98,10\n47#1:146\n47#1:108,6\n47#1:123,3\n47#1:132,2\n47#1:145\n47#1:114,9\n47#1:134\n47#1:143,2\n47#1:126,6\n53#1:135\n54#1:136\n*E\n"})
public final class C0780e {

    /* JADX INFO: renamed from: Ce.e$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC18334a) this.receiver).mo20607b();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m1289a(final InterfaceC18334a interfaceC18334a, InterfaceC15676n interfaceC15676n, final int i10) {
        final String strM19466e;
        C5940y c5940y;
        Integer numValueOf;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(572503971);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC18334a) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC18334a.getState(), c15688rMo18372i, 0);
            List<C5940y> list = ((InterfaceC18334a.a) interfaceC15701v0M18246a.getValue()).f57073b;
            if ((list instanceof Collection) && list.isEmpty()) {
                c15688rMo18372i.mo18363O(420511731);
                String strM19466e2 = C16973X.m19466e((C16972W) C19101C4.f59646F.getValue(), c15688rMo18372i, 0);
                c5940y = ((InterfaceC18334a.a) interfaceC15701v0M18246a.getValue()).f57072a;
                if (c5940y != null) {
                    numValueOf = Integer.valueOf(c5940y.f19719a.getFirst());
                } else {
                    numValueOf = null;
                }
                C5940y c5940y2 = ((InterfaceC18334a.a) interfaceC15701v0M18246a.getValue()).f57072a;
                if (c5940y2 != null) {
                }
                strM19466e = strM19466e2 + numValueOf + "-" + (c5940y2 != null ? Integer.valueOf(c5940y2.f19719a.getLast()) : null);
                c15688rMo18372i.m18410W(false);
            } else {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        IntRange intRange = ((C5940y) it.next()).f19719a;
                        C5940y c5940y3 = ((InterfaceC18334a.a) interfaceC15701v0M18246a.getValue()).f57072a;
                        if (Intrinsics.areEqual(intRange, c5940y3 != null ? c5940y3.f19719a : null)) {
                            c15688rMo18372i.mo18363O(420509578);
                            strM19466e = C16973X.m19466e((C16972W) C19285c2.f60079a0.getValue(), c15688rMo18372i, 0);
                            c15688rMo18372i.m18410W(false);
                        }
                    } else {
                        c15688rMo18372i.mo18363O(420511731);
                        String strM19466e3 = C16973X.m19466e((C16972W) C19101C4.f59646F.getValue(), c15688rMo18372i, 0);
                        c5940y = ((InterfaceC18334a.a) interfaceC15701v0M18246a.getValue()).f57072a;
                        if (c5940y != null) {
                            numValueOf = Integer.valueOf(c5940y.f19719a.getFirst());
                        } else {
                            numValueOf = null;
                        }
                        C5940y c5940y4 = ((InterfaceC18334a.a) interfaceC15701v0M18246a.getValue()).f57072a;
                        strM19466e = strM19466e3 + numValueOf + "-" + (c5940y4 != null ? Integer.valueOf(c5940y4.f19719a.getLast()) : null);
                        c15688rMo18372i.m18410W(false);
                    }
                }
            }
            C15536p0.m18135a(C16973X.m19466e((C16972W) C19119E6.f59769d0.getValue(), c15688rMo18372i, 0), interfaceC18334a.mo20606a(), null, true, null, null, null, C18037u.m20404c(774652272, new Function2() { // from class: Ce.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, interfaceC15676n2);
                        InterfaceC5799g.f19145s1.getClass();
                        C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar2);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                        InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i12))) {
                            C1961V0.m2622a(i12, interfaceC15676n2, i12, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                        InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(C20541F0.m25138b(aVar, C20541F0.m25137a(interfaceC15676n2), true, false), C20541F0.m25137a(interfaceC15676n2), 14);
                        C1982e.i iVarM2645g = C1982e.m2645g(40);
                        C1982e.i iVarM2645g2 = C1982e.m2645g(8);
                        final String str = strM19466e;
                        final InterfaceC15701v0 interfaceC15701v0 = interfaceC15701v0M18246a;
                        final InterfaceC18334a interfaceC18334a2 = interfaceC18334a;
                        C1956T.m2616b(interfaceC7507eM25139c, iVarM2645g2, iVarM2645g, null, 6, 0, C18037u.m20404c(-2017270497, new Function3() { // from class: Ce.c
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                final InterfaceC18334a interfaceC18334a3;
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                boolean z10 = false;
                                if (interfaceC15676n3.mo18379p(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    interfaceC15676n3.mo18363O(-1566695748);
                                    InterfaceC15701v0 interfaceC15701v1 = interfaceC15701v0;
                                    Iterator<T> it2 = ((InterfaceC18334a.a) interfaceC15701v1.getValue()).f57073b.iterator();
                                    while (true) {
                                        boolean zHasNext = it2.hasNext();
                                        interfaceC18334a3 = interfaceC18334a2;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        final C5940y c5940y5 = (C5940y) it2.next();
                                        IntRange intRange2 = c5940y5.f19719a;
                                        String str2 = c5940y5.f19720b;
                                        if (str2 == null) {
                                            str2 = intRange2.getFirst() + "-" + intRange2.getLast();
                                        }
                                        C5940y c5940y6 = ((InterfaceC18334a.a) interfaceC15701v1.getValue()).f57072a;
                                        boolean zAreEqual = Intrinsics.areEqual(c5940y6 != null ? c5940y6.f19719a : null, c5940y5.f19719a);
                                        boolean zMo18350B = interfaceC15676n3.mo18350B(interfaceC18334a3) | interfaceC15676n3.mo18350B(c5940y5);
                                        Object objMo18389z = interfaceC15676n3.mo18389z();
                                        if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                                            objMo18389z = new Function0() { // from class: Ce.d
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    interfaceC18334a3.mo20609d(c5940y5);
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            interfaceC15676n3.mo18380q(objMo18389z);
                                        }
                                        C15548v0.m18138a(null, str2, zAreEqual, (Function0) objMo18389z, false, 0.0f, 0.0f, 0L, 0L, null, 0.0f, interfaceC15676n3, 24576, 4065);
                                    }
                                    interfaceC15676n3.mo18357I();
                                    List<C5940y> list2 = ((InterfaceC18334a.a) interfaceC15701v1.getValue()).f57073b;
                                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        Iterator<T> it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            IntRange intRange3 = ((C5940y) it3.next()).f19719a;
                                            C5940y c5940y7 = ((InterfaceC18334a.a) interfaceC15701v1.getValue()).f57072a;
                                            if (Intrinsics.areEqual(intRange3, c5940y7 != null ? c5940y7.f19719a : null)) {
                                                z10 = true;
                                                break;
                                            }
                                        }
                                    }
                                    C15548v0.m18138a(null, str, !z10, interfaceC18334a3.mo20608c(), false, 0.0f, 0.0f, 0L, 0L, null, 0.0f, interfaceC15676n3, 24576, 4065);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 1597872, 40);
                        if (1.0f <= 0.0d) {
                            C2192a.m2845a("invalid weight; must be greater than zero");
                        }
                        C1963W0.m2623a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), interfaceC15676n2);
                        boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC18334a2);
                        Object objMo18389z = interfaceC15676n2.mo18389z();
                        if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                            C0780e.a aVar3 = new C0780e.a(0, interfaceC18334a2, InterfaceC18334a.class, "resetYears", "resetYears()V", 0);
                            interfaceC15676n2.mo18380q(aVar3);
                            objMo18389z = aVar3;
                        }
                        C15456E0.m18110a(null, null, C16973X.m19466e((C16972W) C19140H5.f59893z.getValue(), interfaceC15676n2, 0), null, C4601b.m5213h(), false, (Function0) ((KFunction) objMo18389z), false, false, false, null, C3376c.f10944e, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, interfaceC15676n2, 0, 0, 522155);
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 100666368, 244);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ce.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C0780e.m1289a(this.f2790b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
