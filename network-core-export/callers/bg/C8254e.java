package bg;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p163J0.C2431d;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
import p579h0.C11569S;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19097C0;
import p845wg.C19101C4;
import p845wg.C19142I0;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: bg.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFeaturesM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeaturesM.kt\nru/zona/app/ui/profile/premium/FeaturesMKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,120:1\n113#2:121\n113#2:122\n113#2:123\n113#2:124\n113#2:125\n113#2:163\n113#2:164\n113#2:203\n99#3:126\n96#3,9:127\n106#3:211\n80#4,6:136\n87#4,3:151\n90#4,2:160\n80#4,6:176\n87#4,3:191\n90#4,2:200\n94#4:206\n94#4:210\n391#5,9:142\n400#5:162\n391#5,9:182\n400#5:202\n401#5,2:204\n401#5,2:208\n4360#6,6:154\n4360#6,6:194\n87#7:165\n83#7,10:166\n94#7:207\n*S KotlinDebug\n*F\n+ 1 FeaturesM.kt\nru/zona/app/ui/profile/premium/FeaturesMKt\n*L\n40#1:121\n68#1:122\n75#1:123\n82#1:124\n94#1:125\n98#1:163\n104#1:164\n112#1:203\n92#1:126\n92#1:127,9\n92#1:211\n92#1:136,6\n92#1:151,3\n92#1:160,2\n106#1:176,6\n106#1:191,3\n106#1:200,2\n106#1:206\n92#1:210\n92#1:142,9\n92#1:162\n106#1:182,9\n106#1:202\n106#1:204,2\n92#1:208,2\n92#1:154,6\n106#1:194,6\n106#1:165\n106#1:166,10\n106#1:207\n*E\n"})
public final class C8254e {
    /* JADX INFO: renamed from: a */
    public static final void m10156a(final String str, final String str2, final C4600a c4600a, InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC7507e interfaceC7507e2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(234649117);
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18362N(str2) ? 32 : 16) | (c15688rMo18372i.mo18362N(c4600a) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 3072;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 1171) != 1170)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(C7481f.m8511d(aVar, 8), 1.0f);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            C11569S.m13483b(c4600a.m5204a(c15688rMo18372i), null, C7482g.m8525j(aVar, 24), C3376c.f10955p, c15688rMo18372i, 432, 0);
            C1963W0.m2623a(C7482g.m8529n(aVar, 16), c15688rMo18372i);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar, c15688rMo18372i);
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
            C11565Q2.m13480b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10912g, 0L, 0L, null, null, 0L, null, C18580v.m21028b(18), null, null, 16646143), c15688rMo18372i, i11 & 14, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, 2), c15688rMo18372i);
            C11565Q2.m13480b(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10916k, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, (i11 >> 3) & 14, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
            interfaceC7507e2 = aVar;
        } else {
            c15688rMo18372i.mo18356H();
            interfaceC7507e2 = interfaceC7507e;
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, str2, c4600a, interfaceC7507e2, i10) { // from class: bg.d

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f28352b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f28353c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C4600a f28354d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC7507e f28355e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C8254e.m10156a(this.f28352b, this.f28353c, this.f28354d, this.f28355e, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10157b(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-981276942);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            float f10 = 8;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            String strM19466e = C16973X.m19466e((C16972W) C19278b3.f59963Q0.getValue(), c15688rMo18372i, 0);
            String strM19466e2 = C16973X.m19466e((C16972W) C19278b3.f59961P0.getValue(), c15688rMo18372i, 0);
            C2431d c2431d = C4601b.f15461a;
            m10156a(strM19466e, strM19466e2, new C4600a((C16987h) C19142I0.f59914l.getValue(), null), null, c15688rMo18372i, 0);
            m10156a(C16973X.m19466e((C16972W) C19278b3.f60008p.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19278b3.f60006o.getValue(), c15688rMo18372i, 0), new C4600a((C16987h) C19097C0.f59585a0.getValue(), null), null, c15688rMo18372i, 0);
            m10156a(C16973X.m19466e((C16972W) C19285c2.f60114s.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19285c2.f60112r.getValue(), c15688rMo18372i, 0), new C4600a((C16987h) C19097C0.f59586b.getValue(), null), null, c15688rMo18372i, 0);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            String strM19466e3 = C16973X.m19466e((C16972W) C19101C4.f59693e0.getValue(), c15688rMo18372i, 0);
            C11732N0 c11732n0 = C3374a.f10912g;
            C11565Q2.m13480b(strM19466e3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
            float f11 = 24;
            C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60094i.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
            C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688rMo18372i);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C8252c();
        }
    }
}
