package p430Xf;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import ch.C8485d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mg.C17040c;
import mg.C17055r;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p055D0.C0946M0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p163J0.C2431d;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p214Lf.C3377d;
import p270P.C4024e;
import p304Qf.C4601b;
import p361U0.InterfaceC5178F;
import p361U0.InterfaceC5208f;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p480ah.InterfaceC7360f;
import p524da.InterfaceC10452u0;
import p579h0.C11565Q2;
import p579h0.C11569S;
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

/* JADX INFO: renamed from: Xf.u */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nProfileMainMenuButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileMainMenuButton.kt\nru/zona/app/ui/profile/ProfileMainMenuButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,110:1\n1282#2,6:111\n113#3:117\n113#3:155\n113#3:156\n113#3:157\n113#3:158\n113#3:205\n87#4:118\n84#4,9:119\n94#4:203\n80#5,6:128\n87#5,3:143\n90#5,2:152\n80#5,6:169\n87#5,3:184\n90#5,2:193\n94#5:198\n94#5:202\n391#6,9:134\n400#6:154\n391#6,9:175\n400#6,3:195\n401#6,2:200\n4360#7,6:146\n4360#7,6:187\n70#8:159\n67#8,9:160\n77#8:199\n85#9:204\n*S KotlinDebug\n*F\n+ 1 ProfileMainMenuButton.kt\nru/zona/app/ui/profile/ProfileMainMenuButtonKt\n*L\n48#1:111,6\n49#1:117\n55#1:155\n71#1:156\n80#1:157\n81#1:158\n85#1:205\n46#1:118\n46#1:119,9\n46#1:203\n46#1:128,6\n46#1:143,3\n46#1:152,2\n78#1:169,6\n78#1:184,3\n78#1:193,2\n78#1:198\n46#1:202\n46#1:134,9\n46#1:154\n78#1:175,9\n78#1:195,3\n46#1:200,2\n46#1:146,6\n78#1:187,6\n78#1:159\n78#1:160,9\n78#1:199\n45#1:204\n*E\n"})
public final class C6350u {
    /* JADX WARN: Code duplicated, block: B:69:0x0211  */
    /* JADX WARN: Code duplicated, block: B:71:0x0215  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m7129a(final InterfaceC7507e interfaceC7507e, final InterfaceC10452u0 interfaceC10452u0, final boolean z10, final Function0 function0, InterfaceC15676n interfaceC15676n, final int i10) {
        boolean z11;
        int i11;
        long j10;
        C2431d c2431dM5205b;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-712643083);
        int i12 = i10 | (c15688rMo18372i.mo18362N(interfaceC7507e) ? 4 : 2) | (c15688rMo18372i.mo18362N(interfaceC10452u0) ? 32 : 16) | (c15688rMo18372i.mo18364a(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = i12 >> 3;
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC10452u0, c15688rMo18372i, i13 & 14);
            boolean z12 = (i12 & 7168) == 2048;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z12 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new Function0() { // from class: Xf.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7470c.m8490c(15, interfaceC7507e, null, (Function0) objMo18389z, false), 0.0f, 8, 1);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58760n, c15688rMo18372i, 48);
            long j11 = c15688rMo18372i.f50813T;
            int i14 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            boolean zM10355c = C8485d.m10355c(((InterfaceC7360f.a) interfaceC15701v0M18246a.getValue()).f23598b);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            if (zM10355c) {
                c15688rMo18372i.mo18363O(-998767186);
                InterfaceC7507e interfaceC7507eM8519d = C7482g.m8519d(aVar2, 24);
                if (z10) {
                    c15688rMo18372i.mo18363O(-998658810);
                    c2431dM5205b = C4601b.m5227v().m5204a(c15688rMo18372i);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-998592315);
                    c2431dM5205b = C4601b.m5227v().m5205b(0, c15688rMo18372i);
                    c15688rMo18372i.m18410W(false);
                }
                C11569S.m13483b(c2431dM5205b, null, interfaceC7507eM8519d, z10 ? C3376c.f10951l : C3376c.f10942c, c15688rMo18372i, 432, 0);
                c15688rMo18372i.m18410W(false);
            } else {
                if (StringsKt.isBlank(((InterfaceC7360f.a) interfaceC15701v0M18246a.getValue()).f23598b.f29037b)) {
                    c15688rMo18372i.mo18363O(-998243503);
                    C11569S.m13483b(C4601b.m5226u().m5204a(c15688rMo18372i), null, C7482g.m8519d(aVar2, 24), C3376c.f10951l, c15688rMo18372i, 432, 0);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-997996681);
                    InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(C7481f.m8511d(aVar2, 2), 20);
                    C4024e c4024e = C3377d.f10966a;
                    InterfaceC7507e interfaceC7507eM19499a = C17055r.m19499a(C7468a.m8487b(C0009h.m22a(interfaceC7507eM8525j, c4024e), C3376c.f10951l, C0946M0.f3382a), z10, new C6348s(), c15688rMo18372i, i13 & 112);
                    InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
                    long j12 = c15688rMo18372i.f50813T;
                    int i15 = (int) (j12 ^ (j12 >>> 32));
                    InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM19499a, c15688rMo18372i);
                    c15688rMo18372i.mo18353E();
                    if (c15688rMo18372i.f50812S) {
                        c15688rMo18372i.mo18355G(aVar);
                    } else {
                        c15688rMo18372i.mo18378o();
                    }
                    C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
                    C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                    if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                        C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                    z11 = true;
                    C17040c.m19494a(C0009h.m22a(C7482g.m8517b(aVar2, 1.0f), c4024e), ((InterfaceC7360f.a) interfaceC15701v0M18246a.getValue()).f23598b.f29038c, null, InterfaceC5208f.a.f17030a, false, 0.0f, null, c15688rMo18372i, 3072, 116);
                    c15688rMo18372i = c15688rMo18372i;
                    c15688rMo18372i.m18410W(true);
                    i11 = 0;
                    c15688rMo18372i.m18410W(false);
                }
                String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59715p0.getValue(), c15688rMo18372i, i11);
                C11732N0 c11732n0 = C3374a.f10917l;
                if (z10) {
                    j10 = C3376c.f10951l;
                } else {
                    j10 = C3376c.f10942c;
                }
                C15688r c15688r = c15688rMo18372i;
                C11565Q2.m13480b(strM19466e, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, j10, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r, 0, 0, 131070);
                c15688rMo18372i = c15688r;
                c15688rMo18372i.m18410W(z11);
            }
            z11 = true;
            i11 = 0;
            String strM19466e2 = C16973X.m19466e((C16972W) C19101C4.f59715p0.getValue(), c15688rMo18372i, i11);
            C11732N0 c11732n1 = C3374a.f10917l;
            if (z10) {
                j10 = C3376c.f10951l;
            } else {
                j10 = C3376c.f10942c;
            }
            C15688r c15688r2 = c15688rMo18372i;
            C11565Q2.m13480b(strM19466e2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n1, j10, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r2, 0, 0, 131070);
            c15688rMo18372i = c15688r2;
            c15688rMo18372i.m18410W(z11);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(interfaceC10452u0, z10, function0, i10) { // from class: Xf.t

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC10452u0 f20786c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f20787d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f20788e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6350u.m7129a(this.f20785b, this.f20786c, this.f20787d, this.f20788e, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
