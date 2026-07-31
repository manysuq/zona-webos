package p123Ge;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C17055r;
import ne.C17229w;
import p001A0.C0009h;
import p019B0.InterfaceC0179H;
import p055D0.C0998l0;
import p090F.InterfaceC1457j;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p163J0.C2431d;
import p214Lf.C3374a;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p214Lf.C3377d;
import p270P.C4024e;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11565Q2;
import p607i9.C12269M6;
import p607i9.C12664j3;
import p607i9.C12736n3;
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
import p845wg.C19140H5;
import p881z.C20576b0;

/* JADX INFO: renamed from: Ge.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nInLiveStateButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InLiveStateButton.kt\nru/zona/app/screens/player/compositions/InLiveStateButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,102:1\n113#2:103\n113#2:148\n113#2:150\n113#2:167\n113#2:205\n113#2:206\n15#3,7:104\n15#3,7:227\n99#4:111\n96#4,9:112\n106#4:154\n99#4:168\n96#4,9:169\n106#4:210\n80#5,6:121\n87#5,3:136\n90#5,2:145\n94#5:153\n80#5,6:178\n87#5,3:193\n90#5,2:202\n94#5:209\n391#6,9:127\n400#6:147\n401#6,2:151\n391#6,9:184\n400#6:204\n401#6,2:207\n4360#7,6:139\n4360#7,6:196\n1#8:149\n1282#9,6:155\n1282#9,6:161\n1282#9,6:211\n1282#9,6:221\n85#10:217\n117#10,2:218\n85#10:220\n*S KotlinDebug\n*F\n+ 1 InLiveStateButton.kt\nru/zona/app/screens/player/compositions/InLiveStateButtonKt\n*L\n44#1:103\n49#1:148\n53#1:150\n75#1:167\n83#1:205\n87#1:206\n45#1:104,7\n78#1:227,7\n42#1:111\n42#1:112,9\n42#1:154\n71#1:168\n71#1:169,9\n71#1:210\n42#1:121,6\n42#1:136,3\n42#1:145,2\n42#1:153\n71#1:178,6\n71#1:193,3\n71#1:202,2\n71#1:209\n42#1:127,9\n42#1:147\n42#1:151,2\n71#1:184,9\n71#1:204\n71#1:207,2\n42#1:139,6\n71#1:196,6\n66#1:155,6\n67#1:161,6\n100#1:211,6\n77#1:221,6\n66#1:217\n66#1:218,2\n67#1:220\n*E\n"})
public final class C1857h {

    /* JADX INFO: renamed from: Ge.h$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class a implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f6314b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function0 f6315c;

        public a(boolean z10, Function0 function0) {
            this.f6314b = z10;
            this.f6315c = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C1856g(this.f6314b, this.f6315c), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX INFO: renamed from: Ge.h$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class b implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f6316b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function0 f6317c;

        public b(boolean z10, Function0 function0) {
            this.f6316b = z10;
            this.f6317c = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C1858i(this.f6316b, this.f6317c), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m2562a(final boolean z10, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C2431d c2431dM5205b;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(150591702);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? 32 : 16;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(C7481f.m8512e(aVar, 8, 10), C6138n1.f20157a, new a(z10, function0));
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58757k, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) ((j10 >>> 32) ^ j10);
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
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar, 12);
            c15688rMo18372i.mo18363O(-1466280955);
            C4600a c4600aM5208c = C4601b.m5208c();
            if (z10) {
                c15688rMo18372i.mo18363O(1174317782);
                c2431dM5205b = c4600aM5208c.m5204a(c15688rMo18372i);
            } else {
                c15688rMo18372i.mo18363O(1174318199);
                c2431dM5205b = c4600aM5208c.m5205b(0, c15688rMo18372i);
            }
            c15688rMo18372i.m18410W(false);
            C2431d c2431d = c2431dM5205b;
            c15688rMo18372i.m18410W(false);
            C20576b0.m25171b(c2431d, interfaceC7507eM8525j, null, c15688rMo18372i, 432, 120);
            C1963W0.m2623a(C7482g.m8529n(aVar, 4), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e(z10 ? (C16972W) C19101C4.f59708m.getValue() : (C16972W) C19140H5.f59807G.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10913h, c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: Ge.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C1857h.m2562a(z10, function0, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m2563b(final boolean z10, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C2431d c2431dM5205b;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(735458713);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | i10;
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
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            boolean zMo18364a = ((i11 & 14) == 4) | c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18364a || objMo18389z2 == c21235a) {
                objMo18389z2 = C17229w.m19683a(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10965z, c15688rMo18372i);
            }
            C4024e c4024e = C3377d.f10968c;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM19499a = C17055r.m19499a(C7481f.m8512e(C7468a.m8487b(C0009h.m22a(aVar, c4024e), ((C0998l0) ((InterfaceC15701v0) objMo18389z2).getValue()).f3476a, c4024e), 12, 8), !z10, new Function3() { // from class: Ge.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC7507e interfaceC7507e = (InterfaceC7507e) obj;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    ((Integer) obj3).getClass();
                    interfaceC15676n2.mo18363O(-1305359090);
                    Object objMo18389z3 = interfaceC15676n2.mo18389z();
                    if (objMo18389z3 == InterfaceC15676n.a.f50781a) {
                        final InterfaceC15701v0 interfaceC15701v1 = interfaceC15701v0;
                        objMo18389z3 = new Function1() { // from class: Ge.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                interfaceC15701v1.setValue(Boolean.valueOf(((InterfaceC0179H) obj4).mo236b()));
                                return Unit.INSTANCE;
                            }
                        };
                        interfaceC15676n2.mo18380q(objMo18389z3);
                    }
                    InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(C7510a.m8576a(interfaceC7507e, (Function1) objMo18389z3), C6138n1.f20157a, new C1857h.b(z10, function0));
                    interfaceC15676n2.mo18357I();
                    return interfaceC7507eM8564a;
                }
            }, c15688rMo18372i, 0);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58757k, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) ((j10 >>> 32) ^ j10);
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM19499a, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar, 14);
            c15688rMo18372i.mo18363O(1859470272);
            C4600a c4600aM5208c = C4601b.m5208c();
            if (z10) {
                c15688rMo18372i.mo18363O(2113743905);
                c2431dM5205b = c4600aM5208c.m5204a(c15688rMo18372i);
            } else {
                c15688rMo18372i.mo18363O(2113744322);
                c2431dM5205b = c4600aM5208c.m5205b(0, c15688rMo18372i);
            }
            c15688rMo18372i.m18410W(false);
            C2431d c2431d = c2431dM5205b;
            c15688rMo18372i.m18410W(false);
            C20576b0.m25171b(c2431d, interfaceC7507eM8525j, null, c15688rMo18372i, 432, 120);
            C1963W0.m2623a(C7482g.m8529n(aVar, 4), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e(z10 ? (C16972W) C19101C4.f59708m.getValue() : (C16972W) C19140H5.f59807G.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10928k, c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: Ge.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C1857h.m2563b(z10, function0, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
