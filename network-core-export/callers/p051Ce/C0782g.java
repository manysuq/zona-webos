package p051Ce;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8190c0;
import bf.C8215k1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
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
import p845wg.C19119E6;
import p845wg.C19140H5;
import p881z.C20541F0;
import td.InterfaceC18335b;

/* JADX INFO: renamed from: Ce.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nYearsFilterM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearsFilterM.kt\nru/zona/app/screens/filters/years/YearsFilterMKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,62:1\n87#2:63\n84#2,9:64\n94#2:124\n80#3,6:73\n87#3,3:88\n90#3,2:97\n94#3:123\n391#4,9:79\n400#4:99\n401#4,2:121\n4360#5,6:91\n1282#6,6:100\n1282#6,6:107\n1282#6,6:115\n113#7:106\n113#7:113\n113#7:114\n85#8:125\n*S KotlinDebug\n*F\n+ 1 YearsFilterM.kt\nru/zona/app/screens/filters/years/YearsFilterMKt\n*L\n31#1:63\n31#1:64,9\n31#1:124\n31#1:73,6\n31#1:88,3\n31#1:97,2\n31#1:123\n31#1:79,9\n31#1:99\n31#1:121,2\n31#1:91,6\n41#1:100,6\n50#1:107,6\n58#1:115,6\n46#1:106\n52#1:113\n54#1:114\n29#1:125\n*E\n"})
public final class C0782g {

    /* JADX INFO: renamed from: Ce.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC18335b) this.receiver).mo20611b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ce.g$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            ((InterfaceC18335b) this.receiver).mo20612c(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ce.g$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            ((InterfaceC18335b) this.receiver).mo20613d(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m1290a(InterfaceC18335b interfaceC18335b, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        InterfaceC15676n.a.C21235a c21235a;
        InterfaceC7507e.a aVar;
        final InterfaceC18335b interfaceC18335b2 = interfaceC18335b;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1187683902);
        int i12 = (c15688rMo18372i.mo18362N(interfaceC18335b2) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC18335b2.getState(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(C7482g.m8517b(aVar2, 1.0f), C20541F0.m25137a(c15688rMo18372i), 14);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM25139c, c15688rMo18372i);
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
            String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59769d0.getValue(), c15688rMo18372i, 0);
            Function0<Unit> function0Mo20610a = interfaceC18335b2.mo20610a();
            String strM19466e2 = C16973X.m19466e((C16972W) C19140H5.f59893z.getValue(), c15688rMo18372i, 0);
            boolean z10 = ((InterfaceC18335b.a) interfaceC15701v0M18246a.getValue()).f57076c;
            int i14 = i12 & 14;
            boolean z11 = i14 == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (z11 || objMo18389z == c21235a2) {
                i11 = i14;
                c21235a = c21235a2;
                a aVar4 = new a(0, interfaceC18335b2, InterfaceC18335b.class, "resetYears", "resetYears()V", 0);
                c15688rMo18372i.mo18380q(aVar4);
                objMo18389z = aVar4;
            } else {
                i11 = i14;
                c21235a = c21235a2;
            }
            C8215k1.m10147a(strM19466e, function0Mo20610a, null, strM19466e2, null, z10, (Function0) ((KFunction) objMo18389z), 0L, 0L, c15688rMo18372i, 0, 916);
            c15688rMo18372i = c15688rMo18372i;
            if (((InterfaceC18335b.a) interfaceC15701v0M18246a.getValue()).f57075b == null || ((InterfaceC18335b.a) interfaceC15701v0M18246a.getValue()).f57074a == null) {
                interfaceC18335b2 = interfaceC18335b;
                c15688rMo18372i.mo18363O(-835489514);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-836172785);
                float f10 = 16;
                InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(aVar2, f10);
                String strM19466e3 = C16973X.m19466e((C16972W) C19119E6.f59765b0.getValue(), c15688rMo18372i, 0);
                List list = CollectionsKt.toList(((InterfaceC18335b.a) interfaceC15701v0M18246a.getValue()).f57075b);
                int iIntValue = ((InterfaceC18335b.a) interfaceC15701v0M18246a.getValue()).f57074a.getFirst().intValue();
                int i15 = i11;
                boolean z12 = i15 == 4;
                Object objMo18389z2 = c15688rMo18372i.mo18389z();
                InterfaceC15676n.a.C21235a c21235a3 = c21235a;
                if (z12 || objMo18389z2 == c21235a3) {
                    aVar = aVar2;
                    b bVar = new b(1, interfaceC18335b, InterfaceC18335b.class, "setSelectedYearFrom", "setSelectedYearFrom(I)V", 0);
                    c15688rMo18372i.mo18380q(bVar);
                    objMo18389z2 = bVar;
                } else {
                    aVar = aVar2;
                }
                C8190c0.m10141b(strM19466e3, interfaceC7507eM8511d, list, Integer.valueOf(iIntValue), (Function1) ((KFunction) objMo18389z2), c15688rMo18372i, 48);
                InterfaceC7507e.a aVar5 = aVar;
                C1963W0.m2623a(C7482g.m8519d(aVar5, f10), c15688rMo18372i);
                InterfaceC7507e interfaceC7507eM8511d2 = C7481f.m8511d(aVar5, f10);
                String strM19466e4 = C16973X.m19466e((C16972W) C19119E6.f59767c0.getValue(), c15688rMo18372i, 0);
                List list2 = CollectionsKt.toList(((InterfaceC18335b.a) interfaceC15701v0M18246a.getValue()).f57075b);
                int iIntValue2 = ((InterfaceC18335b.a) interfaceC15701v0M18246a.getValue()).f57074a.getSecond().intValue();
                boolean z13 = i15 == 4;
                Object objMo18389z3 = c15688rMo18372i.mo18389z();
                if (z13 || objMo18389z3 == c21235a3) {
                    interfaceC18335b2 = interfaceC18335b;
                    c cVar = new c(1, interfaceC18335b2, InterfaceC18335b.class, "setSelectedYearTo", "setSelectedYearTo(I)V", 0);
                    c15688rMo18372i.mo18380q(cVar);
                    objMo18389z3 = cVar;
                } else {
                    interfaceC18335b2 = interfaceC18335b;
                }
                C8190c0.m10141b(strM19466e4, interfaceC7507eM8511d2, list2, Integer.valueOf(iIntValue2), (Function1) ((KFunction) objMo18389z3), c15688rMo18372i, 48);
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ce.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C0782g.m1290a(this.f2796b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
