package p303Qe;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7477b;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.mozilla.classfile.ByteCode;
import p001A0.C0009h;
import p055D0.AbstractC0984e0;
import p055D0.C0926C0;
import p055D0.C0998l0;
import p090F.InterfaceC1457j;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p270P.C4025f;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p607i9.C12664j3;
import p607i9.C12736n3;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p689mb.C16999t;
import p817v1.C18580v;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19142I0;
import p881z.C20576b0;

/* JADX INFO: renamed from: Qe.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPremiumBannerTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumBannerTv.kt\nru/zona/app/screens/profile/premium/PremiumBannerTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,106:1\n1282#2,6:107\n1282#2,6:113\n1282#2,6:119\n15#3,7:125\n70#4:132\n67#4,9:133\n77#4:222\n80#5,6:142\n87#5,3:157\n90#5,2:166\n80#5,6:182\n87#5,3:197\n90#5,2:206\n94#5:216\n94#5:221\n391#6,9:148\n400#6:168\n391#6,9:188\n400#6:208\n401#6,2:214\n401#6,2:219\n4360#7,6:160\n4360#7,6:200\n113#8:169\n113#8:170\n113#8:171\n113#8:209\n113#8:210\n113#8:211\n113#8:212\n113#8:213\n113#8:218\n87#9:172\n84#9,9:173\n94#9:217\n85#10:223\n117#10,2:224\n85#10:226\n*S KotlinDebug\n*F\n+ 1 PremiumBannerTv.kt\nru/zona/app/screens/profile/premium/PremiumBannerTvKt\n*L\n44#1:107,6\n46#1:113,6\n59#1:119,6\n60#1:125,7\n55#1:132\n55#1:133,9\n55#1:222\n55#1:142,6\n55#1:157,3\n55#1:166,2\n62#1:182,6\n62#1:197,3\n62#1:206,2\n62#1:216\n55#1:221\n55#1:148,9\n55#1:168\n62#1:188,9\n62#1:208\n62#1:214,2\n55#1:219,2\n55#1:160,6\n62#1:200,6\n66#1:169\n69#1:170\n71#1:171\n74#1:209\n83#1:210\n87#1:211\n90#1:212\n92#1:213\n99#1:218\n62#1:172\n62#1:173,9\n62#1:217\n44#1:223\n44#1:224,2\n46#1:226\n*E\n"})
public final class C4599g {

    /* JADX INFO: renamed from: Qe.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class a implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f15458b;

        public a(Function0 function0) {
            this.f15458b = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C4598f(this.f15458b), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m5203a(Function0<Unit> function0, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1648262797);
        int i11 = i10 | (c15688rMo18372i.mo18350B(function0) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
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
                objMo18389z2 = C15585G1.m18250e(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? TuplesKt.m18695to(new C0998l0(C3376c.f10957r), new C0998l0(C3376c.f10951l)) : TuplesKt.m18695to(new C0998l0(C3376c.f10951l), new C0998l0(C3376c.f10938B)));
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
            C0926C0 c0926c0M1533a = AbstractC0984e0.a.m1533a(CollectionsKt.listOf((Object[]) new C0998l0[]{new C0998l0(C3376c.f10938B), new C0998l0(C3376c.f10939C)}));
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7482g.m8518c(aVar, 1.0f), "test_tag_premium_banner");
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new C4596d(0, interfaceC15701v0);
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(C7510a.m8576a(interfaceC7507eM8700a, (Function1) objMo18389z3), C6138n1.f20157a, new a(function0));
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8564a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            C18863f c18863f = InterfaceC18861d.a.f58753g;
            C7477b c7477b = C7477b.f24339a;
            float f10 = 16;
            float f11 = 24;
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7468a.m8486a(C0009h.m22a(C7482g.m8518c(c7477b.mo2685c(aVar, c18863f), 1.0f), C4025f.m4709b(f10)), c0926c0M1533a, C4025f.m4709b(f10), 4), f11, 20);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59681X.getValue(), c15688rMo18372i, 0), C7482g.m8530o(aVar, 0.0f, 290, 1), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, new C11732N0(C3376c.f10951l, C18580v.m21028b(28), new C16318q(900), 0L, 0, 0, C18580v.m21028b(28), 16646136), c15688rMo18372i, 48, 0, 131068);
            C1963W0.m2623a(C7482g.m8519d(aVar, 12), c15688rMo18372i);
            float f12 = 8;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59868m0.getValue(), c15688rMo18372i, 0), C7481f.m8512e(C7468a.m8487b(C0009h.m22a(aVar, C4025f.m4709b(f12)), ((C0998l0) ((Pair) interfaceC15701v1.getValue()).getFirst()).f3476a, C4025f.m4709b(f12)), f11, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10928k, ((C0998l0) ((Pair) interfaceC15701v1.getValue()).getSecond()).f3476a, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131068);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            C20576b0.m25170a(C16999t.m19472a((C16987h) C19142I0.f59900F.getValue(), c15688rMo18372i, 0), "", c7477b.mo2685c(C7482g.m8519d(aVar, ByteCode.FRETURN), InterfaceC18861d.a.f58755i), null, null, 0.0f, null, c15688rMo18372i, 48, 120);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C4597e(function0, i10, 0);
        }
    }
}
