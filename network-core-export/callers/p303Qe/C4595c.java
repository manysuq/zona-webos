package p303Qe;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7477b;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
import p214Lf.C3374a;
import p214Lf.C3376c;
import p270P.C4025f;
import p361U0.InterfaceC5178F;
import p361U0.InterfaceC5208f;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p607i9.C12664j3;
import p607i9.C12736n3;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
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

/* JADX INFO: renamed from: Qe.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPremiumBannerM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumBannerM.kt\nru/zona/app/screens/profile/premium/PremiumBannerMKt\n+ 2 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,102:1\n15#2,7:103\n70#3:110\n67#3,9:111\n77#3:200\n80#4,6:120\n87#4,3:135\n90#4,2:144\n80#4,6:160\n87#4,3:175\n90#4,2:184\n94#4:194\n94#4:199\n391#5,9:126\n400#5:146\n391#5,9:166\n400#5:186\n401#5,2:192\n401#5,2:197\n4360#6,6:138\n4360#6,6:178\n113#7:147\n113#7:148\n113#7:149\n113#7:150\n113#7:187\n113#7:188\n113#7:189\n113#7:190\n113#7:191\n113#7:196\n87#8:151\n85#8,8:152\n94#8:195\n*S KotlinDebug\n*F\n+ 1 PremiumBannerM.kt\nru/zona/app/screens/profile/premium/PremiumBannerMKt\n*L\n49#1:103,7\n45#1:110\n45#1:111,9\n45#1:200\n45#1:120,6\n45#1:135,3\n45#1:144,2\n51#1:160,6\n51#1:175,3\n51#1:184,2\n51#1:194\n45#1:199\n45#1:126,9\n45#1:146\n51#1:166,9\n51#1:186\n51#1:192,2\n45#1:197,2\n45#1:138,6\n51#1:178,6\n55#1:147\n56#1:148\n59#1:149\n61#1:150\n68#1:187\n74#1:188\n78#1:189\n81#1:190\n83#1:191\n95#1:196\n51#1:151\n51#1:152,8\n51#1:195\n*E\n"})
public final class C4595c {

    /* JADX INFO: renamed from: Qe.c$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class a implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f15452b;

        public a(Function0 function0) {
            this.f15452b = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C4594b(this.f15452b), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m5202a(final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1084098416);
        int i11 = i10 | (c15688rMo18372i.mo18350B(function0) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            long j10 = C3376c.f10938B;
            C0926C0 c0926c0M1533a = AbstractC0984e0.a.m1533a(CollectionsKt.listOf((Object[]) new C0998l0[]{new C0998l0(j10), new C0998l0(C3376c.f10939C)}));
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(C7586d.m8700a(C7482g.m8518c(aVar, 1.0f), "test_tag_premium_banner"), C6138n1.f20157a, new a(function0));
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j11 = c15688rMo18372i.f50813T;
            int i12 = (int) (j11 ^ (j11 >>> 32));
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
            InterfaceC7507e interfaceC7507eM8521f = C7482g.m8521f(C7482g.m8518c(c7477b.mo2685c(aVar, c18863f), 1.0f), 217, 0.0f, 2);
            float f10 = 8;
            InterfaceC7507e interfaceC7507eM8486a = C7468a.m8486a(C0009h.m22a(interfaceC7507eM8521f, C4025f.m4709b(f10)), c0926c0M1533a, C4025f.m4709b(f10), 4);
            float f11 = 16;
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(interfaceC7507eM8486a, f11);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6640d, InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j12 = c15688rMo18372i.f50813T;
            int i13 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59680W.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10909d, c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, 4), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59678V.getValue(), c15688rMo18372i, 0), C7482g.m8518c(aVar, 0.5f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10916k, 0L, 0L, null, null, 0L, null, C18580v.m21028b(18), null, null, 16646143), c15688rMo18372i, 48, 0, 131068);
            C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59868m0.getValue(), c15688rMo18372i, 0), C7481f.m8512e(C7468a.m8487b(C0009h.m22a(aVar, C4025f.m4709b(f10)), C3376c.f10951l, C4025f.m4709b(f10)), 13, 11), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, new C11732N0(j10, C18580v.m21028b(13), new C16318q(500), 0L, 0, 0, C18580v.m21028b(14), 16646136), c15688rMo18372i, 0, 0, 131068);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            C18863f c18863f2 = InterfaceC18861d.a.f58755i;
            C20576b0.m25170a(C16999t.m19472a((C16987h) C19142I0.f59899E.getValue(), c15688rMo18372i, 0), "", c7477b.mo2685c(C7482g.m8519d(c7477b.mo2685c(aVar, c18863f2), 230), c18863f2), null, InterfaceC5208f.a.f17032c, 0.0f, null, c15688rMo18372i, 24624, 104);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Qe.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4595c.m5202a(this.f15450b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
