package p595hg;

import androidx.compose.foundation.C7471d;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7512c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ne.C17229w;
import org.conscrypt.PSKKeyManager;
import p019B0.C0173B;
import p055D0.C0998l0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p163J0.C2431d;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p270P.C4025f;
import p303Qe.C4596d;
import p303Qe.C4597e;
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
import p644k0.InterfaceC15701v0;
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
import p881z.C20611t;

/* JADX INFO: renamed from: hg.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFeaturesTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeaturesTv.kt\nru/zona/app/ui/tv/profile/premium/FeaturesTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,158:1\n1282#2,6:159\n1282#2,6:165\n113#3:171\n113#3:172\n113#3:173\n113#3:215\n113#3:216\n113#3:217\n113#3:218\n113#3:219\n113#3:257\n113#3:258\n113#3:297\n87#4:174\n84#4,9:175\n94#4:214\n87#4:259\n83#4,10:260\n94#4:301\n80#5,6:184\n87#5,3:199\n90#5,2:208\n94#5:213\n80#5,6:230\n87#5,3:245\n90#5,2:254\n80#5,6:270\n87#5,3:285\n90#5,2:294\n94#5:300\n94#5:304\n391#6,9:190\n400#6,3:210\n391#6,9:236\n400#6:256\n391#6,9:276\n400#6:296\n401#6,2:298\n401#6,2:302\n4360#7,6:202\n4360#7,6:248\n4360#7,6:288\n99#8:220\n96#8,9:221\n106#8:305\n85#9:306\n117#9,2:307\n*S KotlinDebug\n*F\n+ 1 FeaturesTv.kt\nru/zona/app/ui/tv/profile/premium/FeaturesTvKt\n*L\n53#1:159,6\n60#1:165,6\n65#1:171\n66#1:172\n69#1:173\n83#1:215\n99#1:216\n107#1:217\n115#1:218\n132#1:219\n136#1:257\n142#1:258\n150#1:297\n55#1:174\n55#1:175,9\n55#1:214\n144#1:259\n144#1:260,10\n144#1:301\n55#1:184,6\n55#1:199,3\n55#1:208,2\n55#1:213\n130#1:230,6\n130#1:245,3\n130#1:254,2\n144#1:270,6\n144#1:285,3\n144#1:294,2\n144#1:300\n130#1:304\n55#1:190,9\n55#1:210,3\n130#1:236,9\n130#1:256\n144#1:276,9\n144#1:296\n144#1:298,2\n130#1:302,2\n55#1:202,6\n130#1:248,6\n144#1:288,6\n130#1:220\n130#1:221,9\n130#1:305\n53#1:306\n53#1:307,2\n*E\n"})
public final class C11918e {
    /* JADX INFO: renamed from: a */
    public static final void m13781a(final String str, final String str2, final C4600a c4600a, InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC7507e interfaceC7507e2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1514034706);
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18362N(str2) ? 32 : 16) | (c15688rMo18372i.mo18362N(c4600a) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 3072;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 1171) != 1170)) {
            float f10 = 4;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(C7481f.m8511d(aVar, f10), 1.0f);
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
            C11569S.m13483b(c4600a.m5204a(c15688rMo18372i), null, C7482g.m8525j(aVar, 20), C3376c.f10955p, c15688rMo18372i, 432, 0);
            C1963W0.m2623a(C7482g.m8529n(aVar, 8), c15688rMo18372i);
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
            C11565Q2.m13480b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10924g, 0L, 0L, null, null, 0L, null, C18580v.m21028b(20), null, null, 16646143), c15688rMo18372i, i11 & 14, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            C11565Q2.m13480b(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10934q, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, (i11 >> 3) & 14, 0, 131070);
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
            c15634y0M18412Y.f50634d = new Function2(str, str2, c4600a, interfaceC7507e2, i10) { // from class: hg.d

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f37455b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f37456c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C4600a f37457d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC7507e f37458e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11918e.m13781a(this.f37455b, this.f37456c, this.f37457d, this.f37458e, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13782b(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(771151473);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            float f10 = 16;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            String strM19466e = C16973X.m19466e((C16972W) C19278b3.f59963Q0.getValue(), c15688rMo18372i, 0);
            String strM19466e2 = C16973X.m19466e((C16972W) C19278b3.f59961P0.getValue(), c15688rMo18372i, 0);
            C2431d c2431d = C4601b.f15461a;
            m13781a(strM19466e, strM19466e2, new C4600a((C16987h) C19142I0.f59914l.getValue(), null), null, c15688rMo18372i, 0);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            m13781a(C16973X.m19466e((C16972W) C19278b3.f60008p.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19278b3.f60006o.getValue(), c15688rMo18372i, 0), new C4600a((C16987h) C19097C0.f59585a0.getValue(), null), null, c15688rMo18372i, 0);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            m13781a(C16973X.m19466e((C16972W) C19285c2.f60114s.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19285c2.f60112r.getValue(), c15688rMo18372i, 0), new C4600a((C16987h) C19097C0.f59586b.getValue(), null), null, c15688rMo18372i, 0);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59693e0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10931n, c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C11916c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m13783c(C0173B c0173b, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1361714784);
        if (c15688rMo18372i.mo18379p(i10 & 1, (i10 & 3) != 2)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C17229w.m19683a(C3376c.f10944e, c15688rMo18372i);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            InterfaceC7507e interfaceC7507eM8578a = InterfaceC7507e.a.f24548b;
            if (c0173b != null) {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(-1439837530);
                interfaceC7507eM8578a = C7512c.m8578a(interfaceC7507eM8578a, c0173b);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(552068856);
            }
            c15688rMo18372i.m18410W(false);
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new C4596d(1, interfaceC15701v0);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C20611t.m25195a(C7471d.m8495c(C7510a.m8576a(interfaceC7507eM8578a, (Function1) objMo18389z2), false, null, 3), 2, ((C0998l0) interfaceC15701v0.getValue()).f3476a, C4025f.m4709b(8)), 12);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i11 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59682Y.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10931n, c15688rMo18372i, 0, 0, 131070);
            c15688r = c15688rMo18372i;
            m13782b(0, c15688r);
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C4597e(c0173b, i10, 1);
        }
    }
}
