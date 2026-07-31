package p640jf;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.input.key.C7515a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import ne.C17213l0;
import ne.C17229w;
import org.conscrypt.PSKKeyManager;
import p019B0.C0173B;
import p019B0.InterfaceC0179H;
import p055D0.C0998l0;
import p069De.C1177w;
import p069De.EnumC1163i;
import p069De.InterfaceC1155a;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p144I.C2192a;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p214Lf.C3377d;
import p270P.C4024e;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6047N0;
import p415X0.InterfaceC6074W1;
import p450Z.C6625h;
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
import p817v1.C18579u;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;
import p881z.C20611t;

/* JADX INFO: renamed from: jf.K0 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nZonaSearchFieldTV.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZonaSearchFieldTV.kt\nru/zona/app/screens/ui/tv/ZonaSearchFieldTVKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n113#2:112\n113#2:113\n113#2:133\n123#2:134\n113#2:184\n123#2:185\n113#2:192\n113#2:193\n75#3:114\n1282#4,6:115\n1282#4,6:121\n1282#4,6:127\n1282#4,6:172\n1282#4,6:178\n1282#4,6:186\n1282#4,6:194\n99#5:135\n96#5,9:136\n106#5:203\n80#6,6:145\n87#6,3:160\n90#6,2:169\n94#6:202\n391#7,9:151\n400#7:171\n401#7,2:200\n4360#8,6:163\n85#9:204\n117#9,2:205\n85#9:207\n117#9,2:208\n85#9:210\n117#9,2:211\n*S KotlinDebug\n*F\n+ 1 ZonaSearchFieldTV.kt\nru/zona/app/screens/ui/tv/ZonaSearchFieldTVKt\n*L\n46#1:112\n47#1:113\n67#1:133\n69#1:134\n93#1:184\n96#1:185\n98#1:192\n99#1:193\n50#1:114\n51#1:115,6\n52#1:121,6\n55#1:127,6\n78#1:172,6\n79#1:178,6\n97#1:186,6\n100#1:194,6\n65#1:135\n65#1:136,9\n65#1:203\n65#1:145,6\n65#1:160,3\n65#1:169,2\n65#1:202\n65#1:151,9\n65#1:171\n65#1:200,2\n65#1:163,6\n51#1:204\n51#1:205,2\n52#1:207\n52#1:208,2\n55#1:210\n55#1:211,2\n*E\n"})
public final class C15468K0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m18111a(final C6625h c6625h, final Function0 function0, Function0 function1, final InterfaceC7507e interfaceC7507e, float f10, float f11, C0173B c0173b, InterfaceC15676n interfaceC15676n, final int i10) {
        final Function0 function2;
        final C0173B c0173b2;
        int i11;
        float f12;
        float f13;
        C0173B c0173b3;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1156290236);
        int i12 = i10 | (c15688rMo18372i.mo18362N(c6625h) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 745472;
        if (c15688rMo18372i.mo18379p(i12 & 1, (599187 & i12) != 599186)) {
            c15688rMo18372i.m18436z0();
            if ((i10 & 1) == 0 || c15688rMo18372i.m18420g0()) {
                i11 = i12 & (-3670017);
                f12 = 16;
                f13 = 14;
                c0173b3 = new C0173B();
            } else {
                c15688rMo18372i.mo18356H();
                f13 = f11;
                c0173b3 = c0173b;
                i11 = i12 & (-3670017);
                f12 = f10;
            }
            c15688rMo18372i.m18411X();
            InterfaceC6074W1 interfaceC6074W1 = (InterfaceC6074W1) c15688rMo18372i.mo18383t(C6047N0.f19932p);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            final InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
            C11732N0 c11732n0 = C3375b.f10928k;
            boolean zMo18364a = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue()) | c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v1.getValue()).booleanValue());
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (zMo18364a || objMo18389z3 == c21235a) {
                objMo18389z3 = C17229w.m19683a((((Boolean) interfaceC15701v0.getValue()).booleanValue() || ((Boolean) interfaceC15701v1.getValue()).booleanValue()) ? C3376c.f10957r : C3376c.f10945f, c15688rMo18372i);
            }
            f10 = f12;
            InterfaceC7507e interfaceC7507eM8521f = C7482g.m8521f(C7481f.m8512e(C20611t.m25195a(interfaceC7507e, 2, ((C0998l0) ((InterfaceC15701v0) objMo18389z3).getValue()).f3476a, C3377d.f10968c), f12, f13), C18579u.m21024c(c11732n0.f36910b.f36862c), 0.0f, 2);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58757k, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8521f, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            float f14 = f13;
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
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
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), c0173b3);
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = new Function1() { // from class: jf.F0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C17213l0.m19676a((InterfaceC0179H) obj, interfaceC15701v0);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8578a, (Function1) objMo18389z4);
            boolean zMo18362N = c15688rMo18372i.mo18362N(interfaceC6074W1);
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (zMo18362N || objMo18389z5 == c21235a) {
                objMo18389z5 = new C15466J0(interfaceC6074W1);
                c15688rMo18372i.mo18380q(objMo18389z5);
            }
            int i14 = i11;
            final C0173B c0173b4 = c0173b3;
            f11 = f14;
            C1177w.m1775c(c6625h, function0, C7515a.m8585a(interfaceC7507eM8576a, (Function1) objMo18389z5), C16973X.m19466e((C16972W) C19140H5.f59821N.getValue(), c15688rMo18372i, 0), c11732n0, null, false, false, new InterfaceC1155a.b(EnumC1163i.f4166e, (InterfaceC1155a.a) null, 6), 0, c15688rMo18372i, i14 & 126, 736);
            if (c6625h.m7428c().f21694d.length() > 0) {
                c15688rMo18372i.mo18363O(-1491530306);
                InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
                C1963W0.m2623a(C7482g.m8529n(aVar2, 16), c15688rMo18372i);
                InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar2, C18579u.m21024c(c11732n0.f36910b.f36862c));
                Object objMo18389z6 = c15688rMo18372i.mo18389z();
                if (objMo18389z6 == c21235a) {
                    objMo18389z6 = new Function1() { // from class: jf.G0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            C17213l0.m19676a((InterfaceC0179H) obj, interfaceC15701v1);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z6);
                }
                InterfaceC7507e interfaceC7507eM8576a2 = C7510a.m8576a(interfaceC7507eM8525j, (Function1) objMo18389z6);
                float f15 = 0;
                C4600a c4600aM5210e = C4601b.m5210e();
                long j11 = C3376c.f10965z;
                long j12 = C3376c.f10942c;
                C4024e c4024e = C3377d.f10967b;
                boolean zMo18362N2 = c15688rMo18372i.mo18362N(c0173b4) | ((i14 & 896) == 256);
                Object objMo18389z7 = c15688rMo18372i.mo18389z();
                if (zMo18362N2 || objMo18389z7 == c21235a) {
                    function2 = function1;
                    objMo18389z7 = new Function0() { // from class: jf.H0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke();
                            C0173B.m230b(c0173b4);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z7);
                } else {
                    function2 = function1;
                }
                C15456E0.m18110a(interfaceC7507eM8576a2, null, null, null, c4600aM5210e, false, (Function0) objMo18389z7, false, false, false, null, j11, 0L, j12, 0.0f, f15, f15, false, c4024e, c15688rMo18372i, 0, 1769472, 153518);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(false);
            } else {
                function2 = function1;
                c15688rMo18372i.mo18363O(-1490857606);
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(true);
            c0173b2 = c0173b4;
        } else {
            function2 = function1;
            c15688rMo18372i.mo18356H();
            c0173b2 = c0173b;
        }
        final float f16 = f10;
        final float f17 = f11;
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            final Function0 function3 = function2;
            c15634y0M18412Y.f50634d = new Function2(function0, function3, interfaceC7507e, f16, f17, c0173b2, i10) { // from class: jf.I0

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f50187c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f50188d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC7507e f50189e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ float f50190f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ float f50191g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0173B f50192h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(3073);
                    C15468K0.m18111a(this.f50186b, this.f50187c, this.f50188d, this.f50189e, this.f50190f, this.f50191g, this.f50192h, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
