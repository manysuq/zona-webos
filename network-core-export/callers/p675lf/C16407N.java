package p675lf;

import af.C7329v;
import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7476a;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ne.C17229w;
import p001A0.C0009h;
import p034Bf.EnumC0448a;
import p055D0.C0946M0;
import p055D0.C0998l0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p163J0.C2431d;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p269Og.EnumC3994g;
import p270P.C4025f;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
import p579h0.C11569S;
import p580h1.C11790v;
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
import p689mb.C16987h;
import p689mb.C16999t;
import p776s1.C18050h;
import p830w0.InterfaceC18861d;
import p845wg.C19097C0;
import p845wg.C19119E6;

/* JADX INFO: renamed from: lf.N */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMoreCardTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreCardTv.kt\nru/zona/app/screens/ui/tv/cards/MoreCardTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,71:1\n1282#2,6:72\n1282#2,6:78\n1282#2,6:86\n1282#2,6:92\n113#3:84\n113#3:85\n113#3:131\n113#3:132\n87#4,6:98\n94#4:136\n80#5,6:104\n87#5,3:119\n90#5,2:128\n94#5:135\n391#6,9:110\n400#6:130\n401#6,2:133\n4360#7,6:122\n85#8:137\n117#8,2:138\n85#8:140\n*S KotlinDebug\n*F\n+ 1 MoreCardTv.kt\nru/zona/app/screens/ui/tv/cards/MoreCardTvKt\n*L\n42#1:72,6\n43#1:78,6\n52#1:86,6\n53#1:92,6\n49#1:84\n51#1:85\n59#1:131\n64#1:132\n47#1:98,6\n47#1:136\n47#1:104,6\n47#1:119,3\n47#1:128,2\n47#1:135\n47#1:110,9\n47#1:130\n47#1:133,2\n47#1:122,6\n42#1:137\n42#1:138,2\n43#1:140\n*E\n"})
public final class C16407N {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m19063a(final EnumC3994g enumC3994g, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-585962517);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18368e(enumC3994g == null ? -1 : enumC3994g.ordinal()) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? 32 : 16;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            boolean zMo18364a = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18364a || objMo18389z2 == c21235a) {
                objMo18389z2 = C17229w.m19683a(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10944e, c15688rMo18372i);
            }
            InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
            float fM8152b = C7329v.m8152b(EnumC0448a.f1796c, enumC3994g, c15688rMo18372i, 4);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 8;
            InterfaceC7507e interfaceC7507eM22a = C0009h.m22a(C7476a.m8501a(C7482g.m8529n(aVar, fM8152b), C16429v.m19070d(enumC3994g)), C4025f.m4709b(f10));
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new C16405L(interfaceC15701v0, 0);
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM22a, (Function1) objMo18389z3);
            boolean z10 = (i11 & 112) == 32;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z4 == c21235a) {
                objMo18389z4 = new C11790v(function0, 1);
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            InterfaceC7507e interfaceC7507eM8487b = C7468a.m8487b(C7470c.m8490c(15, interfaceC7507eM8576a, null, (Function0) objMo18389z4, false), ((C0998l0) interfaceC15701v1.getValue()).f3476a, C0946M0.f3382a);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6641e, InterfaceC18861d.a.f58760n, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) ((j10 >>> 32) ^ j10);
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8487b, c15688rMo18372i);
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
            InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar, 28);
            C2431d c2431d = C4601b.f15461a;
            C16987h c16987h = (C16987h) C19097C0.f59594f.getValue();
            c15688rMo18372i.mo18363O(279895816);
            C2431d c2431dM19473b = C16999t.m19473b(c16987h, c15688rMo18372i, 0);
            c15688rMo18372i.mo18357I();
            C11569S.m13483b(c2431dM19473b, null, interfaceC7507eM8525j, C3376c.f10951l, c15688rMo18372i, 432, 0);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19119E6.f59743H.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C3375b.f10932o, c15688rMo18372i, 0, 0, 130046);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: lf.M
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C16407N.m19063a(enumC3994g, function0, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
