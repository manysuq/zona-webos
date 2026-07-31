package p033Be;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.C7471d;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7511b;
import androidx.compose.p481ui.focus.C7512c;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p019B0.C0173B;
import p019B0.InterfaceC0210t;
import p090F.C1458k;
import p090F.InterfaceC1457j;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p163J0.C2431d;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p214Lf.C3377d;
import p270P.C4024e;
import p288Q.C4286K0;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p533e1.C10727t;
import p579h0.C11507C0;
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
import p689mb.C16987h;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19097C0;
import p845wg.C19101C4;

/* JADX INFO: renamed from: Be.W */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRatingPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RatingPicker.kt\nru/zona/app/screens/filters/main/RatingPickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,215:1\n1282#2,6:216\n1282#2,6:222\n1282#2,6:228\n1282#2,6:234\n1282#2,6:278\n1282#2,6:325\n1282#2,6:333\n1282#2,6:380\n1282#2,6:390\n1282#2,6:396\n1282#2,6:402\n1282#2,6:408\n1282#2,6:414\n1282#2,6:420\n99#3:240\n96#3,9:241\n106#3:389\n80#4,6:250\n87#4,3:265\n90#4,2:274\n80#4,6:294\n87#4,3:309\n90#4,2:318\n94#4:323\n80#4,6:349\n87#4,3:364\n90#4,2:373\n94#4:378\n94#4:388\n80#4,6:435\n87#4,3:450\n90#4,2:459\n94#4:465\n391#5,9:256\n400#5:276\n391#5,9:300\n400#5,3:320\n391#5,9:355\n400#5,3:375\n401#5,2:386\n391#5,9:441\n400#5:461\n401#5,2:463\n4360#6,6:268\n4360#6,6:312\n4360#6,6:367\n4360#6,6:453\n113#7:277\n113#7:284\n113#7:331\n113#7:332\n113#7:339\n113#7:462\n70#8:285\n68#8,8:286\n77#8:324\n70#8:340\n68#8,8:341\n77#8:379\n70#8:426\n68#8,8:427\n77#8:466\n85#9:467\n117#9,2:468\n*S KotlinDebug\n*F\n+ 1 RatingPicker.kt\nru/zona/app/screens/filters/main/RatingPickerKt\n*L\n51#1:216,6\n52#1:222,6\n53#1:228,6\n54#1:234,6\n69#1:278,6\n92#1:325,6\n114#1:333,6\n137#1:380,6\n168#1:390,6\n170#1:396,6\n173#1:402,6\n176#1:408,6\n178#1:414,6\n181#1:420,6\n56#1:240\n56#1:241,9\n56#1:389\n56#1:250,6\n56#1:265,3\n56#1:274,2\n80#1:294,6\n80#1:309,3\n80#1:318,2\n80#1:323\n125#1:349,6\n125#1:364,3\n125#1:373,2\n125#1:378\n56#1:388\n174#1:435,6\n174#1:450,3\n174#1:459,2\n174#1:465\n56#1:256,9\n56#1:276\n80#1:300,9\n80#1:320,3\n125#1:355,9\n125#1:375,3\n56#1:386,2\n174#1:441,9\n174#1:461\n174#1:463,2\n56#1:268,6\n80#1:312,6\n125#1:367,6\n174#1:453,6\n65#1:277\n81#1:284\n103#1:331\n110#1:332\n126#1:339\n196#1:462\n80#1:285\n80#1:286,8\n80#1:324\n125#1:340\n125#1:341,8\n125#1:379\n174#1:426\n174#1:427,8\n174#1:466\n170#1:467\n170#1:468,2\n*E\n"})
public final class C0421W {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m804a(final C4600a c4600a, final Function0 function0, final boolean z10, C0173B c0173b, InterfaceC15676n interfaceC15676n, final int i10) {
        C0173B c0173b2;
        C15688r c15688r;
        char c10;
        long j10;
        long j11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(365256931);
        int i11 = i10 | (c15688rMo18372i.mo18362N(c4600a) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16) | (c15688rMo18372i.mo18364a(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 1171) != 1170)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new C1458k();
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            InterfaceC1457j interfaceC1457j = (InterfaceC1457j) objMo18389z2;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new C0417S();
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            c0173b2 = c0173b;
            InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(C10727t.m12784b(aVar, false, (Function1) objMo18389z3), c0173b2);
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                c10 = ' ';
                objMo18389z4 = new C0418T(interfaceC15701v0, 0);
                c15688rMo18372i.mo18380q(objMo18389z4);
            } else {
                c10 = ' ';
            }
            InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8578a, (Function1) objMo18389z4);
            boolean z11 = (i11 & 896) == 256;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (z11 || objMo18389z5 == c21235a) {
                objMo18389z5 = new Function1() { // from class: Be.U
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((InterfaceC0210t) obj).mo302c(z10);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z5);
            }
            InterfaceC7507e interfaceC7507eM8577a = C7511b.m8577a(interfaceC7507eM8576a, (Function1) objMo18389z5);
            C4024e c4024e = C3377d.f10967b;
            if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                j10 = C3376c.f10957r;
            } else {
                j10 = z10 ? C3376c.f10947h : C3376c.f10945f;
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(C0009h.m22a(C7468a.m8487b(interfaceC7507eM8577a, j10, c4024e), c4024e), interfaceC1457j, C11507C0.m13462a(0.0f, 7, 0L, false), z10, null, function0, 24);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
            long j12 = c15688rMo18372i.f50813T;
            int i12 = (int) (j12 ^ (j12 >>> c10));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8489b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar, 20);
            C2431d c2431dM5204a = c4600a.m5204a(c15688rMo18372i);
            if (((Boolean) interfaceC15701v0.getValue()).booleanValue() || z10) {
                j11 = C3376c.f10951l;
            } else {
                j11 = !z10 ? C3376c.f10943d : C3376c.f10942c;
            }
            c15688r = c15688rMo18372i;
            C11569S.m13483b(c2431dM5204a, null, interfaceC7507eM8525j, j11, c15688r, 432, 0);
            c15688r.m18410W(true);
        } else {
            c0173b2 = c0173b;
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            final C0173B c0173b3 = c0173b2;
            c15634y0M18412Y.f50634d = new Function2(function0, z10, c0173b3, i10) { // from class: Be.V

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f1748c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f1749d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0173B f1750e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(3073);
                    C0421W.m804a(this.f1747b, this.f1748c, this.f1749d, this.f1750e, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:104:0x030c  */
    /* JADX WARN: Code duplicated, block: B:105:0x030e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0372  */
    /* JADX WARN: Code duplicated, block: B:110:0x0376  */
    /* JADX WARN: Code duplicated, block: B:112:0x037a  */
    /* JADX WARN: Code duplicated, block: B:113:0x037c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0384  */
    /* JADX WARN: Code duplicated, block: B:119:0x0389  */
    /* JADX WARN: Code duplicated, block: B:120:0x0390  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:133:0x0400  */
    /* JADX WARN: Code duplicated, block: B:135:0x040e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0478  */
    /* JADX WARN: Code duplicated, block: B:142:0x047c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0480  */
    /* JADX WARN: Code duplicated, block: B:145:0x0482  */
    /* JADX WARN: Code duplicated, block: B:148:0x0491 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0497  */
    /* JADX WARN: Code duplicated, block: B:154:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:155:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:59:0x0192  */
    /* JADX WARN: Code duplicated, block: B:62:0x0199  */
    /* JADX WARN: Code duplicated, block: B:63:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01db  */
    /* JADX WARN: Code duplicated, block: B:76:0x020d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0217  */
    /* JADX WARN: Code duplicated, block: B:81:0x0229  */
    /* JADX WARN: Code duplicated, block: B:84:0x023c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0241  */
    /* JADX WARN: Code duplicated, block: B:90:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:92:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02df A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m805b(final ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2, final Function1 function1, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        final ClosedFloatingPointRange closedFloatingPointRange3;
        final Function1 function2;
        final ClosedFloatingPointRange closedFloatingPointRange4;
        int i12;
        final ClosedFloatingPointRange closedFloatingPointRangeRangeTo;
        InterfaceC5799g.a.f fVar;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        boolean zMo18362N;
        Object objMo18389z;
        final ClosedFloatingPointRange closedFloatingPointRange5;
        final C0173B c0173b;
        boolean z12;
        int i15;
        C5753J.a aVar;
        C5753J.a aVar2;
        InterfaceC5799g.a.C21098a c21098a;
        InterfaceC5799g.a.C21098a c21098a2;
        C5753J.a aVar3;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objMo18389z2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objMo18389z3;
        InterfaceC15676n.a.C21235a c21235a;
        final ClosedFloatingPointRange closedFloatingPointRange6;
        final C0173B c0173b2;
        boolean z20;
        int i16;
        boolean z21;
        boolean z22;
        boolean zMo18362N2;
        Object objMo18389z4;
        boolean z23;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-166100926);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18362N(closedFloatingPointRange) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            c15688rMo18372i.m18436z0();
            if ((i10 & 1) == 0 || c15688rMo18372i.m18420g0()) {
                i12 = i11 & (-113);
                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 10.0f);
            } else {
                c15688rMo18372i.mo18356H();
                i12 = i11 & (-113);
                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
            }
            c15688rMo18372i.m18411X();
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (objMo18389z5 == c21235a2) {
                objMo18389z5 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b3 = (C0173B) objMo18389z5;
            Object objMo18389z6 = c15688rMo18372i.mo18389z();
            if (objMo18389z6 == c21235a2) {
                objMo18389z6 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b4 = (C0173B) objMo18389z6;
            Object objMo18389z7 = c15688rMo18372i.mo18389z();
            if (objMo18389z7 == c21235a2) {
                objMo18389z7 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b5 = (C0173B) objMo18389z7;
            Object objMo18389z8 = c15688rMo18372i.mo18389z();
            if (objMo18389z8 == c21235a2) {
                objMo18389z8 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b6 = (C0173B) objMo18389z8;
            InterfaceC7507e.a aVar4 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8493a = C7471d.m8493a(aVar4);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58757k, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i17 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8493a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            int i18 = i12;
            C5753J.a aVar5 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar5);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar2);
            InterfaceC5799g.a.C21098a c21098a3 = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                fVar = fVar2;
            } else {
                fVar = fVar2;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i17))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59655J0.getValue(), c15688rMo18372i, 0);
                InterfaceC5799g.a.f fVar3 = fVar;
                C11732N0 c11732n0 = C3375b.f10927j;
                C11565Q2.m13480b(strM19466e, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                float f10 = 12;
                C1963W0.m2623a(C7482g.m8529n(aVar4, f10), c15688rMo18372i);
                C2431d c2431d = C4601b.f15461a;
                Lazy lazy = C19097C0.f59616q;
                C4600a c4600a = new C4600a((C16987h) lazy.getValue(), null);
                i13 = i18 & 14;
                if (i13 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i14 = i18 & 896;
                if (i14 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zMo18362N = z10 | z11 | c15688rMo18372i.mo18362N(closedFloatingPointRangeRangeTo);
                objMo18389z = c15688rMo18372i.mo18389z();
                if (!zMo18362N || objMo18389z == c21235a2) {
                    closedFloatingPointRange5 = closedFloatingPointRange;
                    c0173b = c0173b4;
                    objMo18389z = new Function0() { // from class: Be.M
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange7 = closedFloatingPointRange5;
                            float fFloatValue = ((Number) closedFloatingPointRange7.getStart()).floatValue() - 1;
                            function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange7.getEndInclusive()).floatValue()));
                            if (fFloatValue <= ((Number) closedFloatingPointRangeRangeTo.getStart()).floatValue()) {
                                C0173B.m230b(c0173b);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                } else {
                    closedFloatingPointRange5 = closedFloatingPointRange;
                    c0173b = c0173b4;
                }
                Function0 function0 = (Function0) objMo18389z;
                if (((Number) closedFloatingPointRange5.getStart()).floatValue() > ((Number) closedFloatingPointRangeRangeTo.getStart()).floatValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m804a(c4600a, function0, z12, c0173b3, c15688rMo18372i, 3072);
                float f11 = 40;
                InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(aVar4, f11, 0.0f, 2);
                C18863f c18863f = InterfaceC18861d.a.f58751e;
                InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(c18863f, false);
                long j11 = c15688rMo18372i.f50813T;
                i15 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8530o, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    aVar = aVar5;
                    c15688rMo18372i.mo18355G(aVar);
                } else {
                    aVar = aVar5;
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar3);
                if (c15688rMo18372i.f50812S) {
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar;
                    if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                        c21098a = c21098a3;
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                    c21098a2 = c21098a;
                    C0173B c0173b7 = c0173b;
                    ClosedFloatingPointRange closedFloatingPointRange7 = closedFloatingPointRangeRangeTo;
                    aVar3 = aVar2;
                    C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange5.getStart()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                    c15688rMo18372i.m18410W(true);
                    Lazy lazy2 = C19097C0.f59618r;
                    C4600a c4600a2 = new C4600a((C16987h) lazy2.getValue(), null);
                    if (i13 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i14 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | z13;
                    objMo18389z2 = c15688rMo18372i.mo18389z();
                    if (z15 || objMo18389z2 == c21235a2) {
                        objMo18389z2 = new Function0() { // from class: Be.N
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ClosedFloatingPointRange closedFloatingPointRange8 = closedFloatingPointRange;
                                float fFloatValue = ((Number) closedFloatingPointRange8.getStart()).floatValue() + 1;
                                function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange8.getEndInclusive()).floatValue()));
                                if (fFloatValue >= ((Number) closedFloatingPointRange8.getEndInclusive()).floatValue()) {
                                    C0173B.m230b(c0173b3);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z2);
                    }
                    Function0 function3 = (Function0) objMo18389z2;
                    if (((Number) closedFloatingPointRange.getStart()).floatValue() < ((Number) closedFloatingPointRange.getEndInclusive()).floatValue()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    m804a(c4600a2, function3, z16, c0173b7, c15688rMo18372i, 3072);
                    C1963W0.m2623a(C7482g.m8529n(aVar4, f10), c15688rMo18372i);
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59657K0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                    C1963W0.m2623a(C7482g.m8529n(aVar4, f10), c15688rMo18372i);
                    C4600a c4600a3 = new C4600a((C16987h) lazy.getValue(), null);
                    if (i13 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (i14 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objMo18389z3 = c15688rMo18372i.mo18389z();
                    if (z19) {
                        c21235a = c21235a2;
                    } else {
                        c21235a = c21235a2;
                        if (objMo18389z3 == c21235a) {
                            closedFloatingPointRange6 = closedFloatingPointRange;
                            c0173b2 = c0173b6;
                        }
                        Function0 function4 = (Function0) objMo18389z3;
                        if (((Number) closedFloatingPointRange6.getEndInclusive()).floatValue() > ((Number) closedFloatingPointRange6.getStart()).floatValue()) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        m804a(c4600a3, function4, z20, c0173b5, c15688rMo18372i, 3072);
                        InterfaceC7507e interfaceC7507eM8530o2 = C7482g.m8530o(aVar4, f11, 0.0f, 2);
                        InterfaceC5178F interfaceC5178FM2677d2 = C2000k.m2677d(c18863f, false);
                        long j12 = c15688rMo18372i.f50813T;
                        i16 = (int) (j12 ^ (j12 >>> 32));
                        InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
                        InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8530o2, c15688rMo18372i);
                        c15688rMo18372i.mo18353E();
                        if (c15688rMo18372i.f50812S) {
                            c15688rMo18372i.mo18355G(aVar3);
                        } else {
                            c15688rMo18372i.mo18378o();
                        }
                        C15623T1.m18280a(interfaceC5178FM2677d2, c15688rMo18372i, dVar);
                        C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar3);
                        if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i16))) {
                            C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
                        C0173B c0173b8 = c0173b2;
                        closedFloatingPointRange3 = closedFloatingPointRange;
                        C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange6.getEndInclusive()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                        c15688rMo18372i = c15688rMo18372i;
                        c15688rMo18372i.m18410W(true);
                        C4600a c4600a4 = new C4600a((C16987h) lazy2.getValue(), null);
                        if (i13 == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (i14 == 256) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        closedFloatingPointRange4 = closedFloatingPointRange7;
                        zMo18362N2 = z22 | z21 | c15688rMo18372i.mo18362N(closedFloatingPointRange4);
                        objMo18389z4 = c15688rMo18372i.mo18389z();
                        if (!zMo18362N2 || objMo18389z4 == c21235a) {
                            function2 = function1;
                            objMo18389z4 = new Function0() { // from class: Be.P
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ClosedFloatingPointRange closedFloatingPointRange8 = closedFloatingPointRange3;
                                    float fFloatValue = ((Number) closedFloatingPointRange8.getEndInclusive()).floatValue() + 1;
                                    function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange8.getStart()).floatValue(), fFloatValue));
                                    if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                        C0173B.m230b(c0173b5);
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688rMo18372i.mo18380q(objMo18389z4);
                        } else {
                            function2 = function1;
                        }
                        Function0 function5 = (Function0) objMo18389z4;
                        if (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() < ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        m804a(c4600a4, function5, z23, c0173b8, c15688rMo18372i, 3072);
                        c15688rMo18372i.m18410W(true);
                    }
                    closedFloatingPointRange6 = closedFloatingPointRange;
                    c0173b2 = c0173b6;
                    objMo18389z3 = new Function0() { // from class: Be.O
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange8 = closedFloatingPointRange6;
                            float fFloatValue = ((Number) closedFloatingPointRange8.getEndInclusive()).floatValue() - 1;
                            function1.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange8.getStart()).floatValue(), fFloatValue));
                            if (fFloatValue <= ((Number) closedFloatingPointRange8.getStart()).floatValue()) {
                                C0173B.m230b(c0173b2);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z3);
                    Function0 function6 = (Function0) objMo18389z3;
                    if (((Number) closedFloatingPointRange6.getEndInclusive()).floatValue() > ((Number) closedFloatingPointRange6.getStart()).floatValue()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    m804a(c4600a3, function6, z20, c0173b5, c15688rMo18372i, 3072);
                    InterfaceC7507e interfaceC7507eM8530o3 = C7482g.m8530o(aVar4, f11, 0.0f, 2);
                    InterfaceC5178F interfaceC5178FM2677d3 = C2000k.m2677d(c18863f, false);
                    long j13 = c15688rMo18372i.f50813T;
                    i16 = (int) (j13 ^ (j13 >>> 32));
                    InterfaceC15608O0 interfaceC15608O0M18405R4 = c15688rMo18372i.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(interfaceC7507eM8530o3, c15688rMo18372i);
                    c15688rMo18372i.mo18353E();
                    if (c15688rMo18372i.f50812S) {
                        c15688rMo18372i.mo18355G(aVar3);
                    } else {
                        c15688rMo18372i.mo18378o();
                    }
                    C15623T1.m18280a(interfaceC5178FM2677d3, c15688rMo18372i, dVar);
                    C15623T1.m18280a(interfaceC15608O0M18405R4, c15688rMo18372i, fVar3);
                    if (c15688rMo18372i.f50812S) {
                        C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                    } else {
                        C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c4, c15688rMo18372i, eVar);
                    C0173B c0173b9 = c0173b2;
                    closedFloatingPointRange3 = closedFloatingPointRange;
                    C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange6.getEndInclusive()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                    c15688rMo18372i = c15688rMo18372i;
                    c15688rMo18372i.m18410W(true);
                    C4600a c4600a5 = new C4600a((C16987h) lazy2.getValue(), null);
                    if (i13 == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (i14 == 256) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    closedFloatingPointRange4 = closedFloatingPointRange7;
                    zMo18362N2 = z22 | z21 | c15688rMo18372i.mo18362N(closedFloatingPointRange4);
                    objMo18389z4 = c15688rMo18372i.mo18389z();
                    if (zMo18362N2) {
                        function2 = function1;
                        objMo18389z4 = new Function0() { // from class: Be.P
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ClosedFloatingPointRange closedFloatingPointRange8 = closedFloatingPointRange3;
                                float fFloatValue = ((Number) closedFloatingPointRange8.getEndInclusive()).floatValue() + 1;
                                function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange8.getStart()).floatValue(), fFloatValue));
                                if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                    C0173B.m230b(c0173b5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z4);
                    } else {
                        function2 = function1;
                        objMo18389z4 = new Function0() { // from class: Be.P
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ClosedFloatingPointRange closedFloatingPointRange8 = closedFloatingPointRange3;
                                float fFloatValue = ((Number) closedFloatingPointRange8.getEndInclusive()).floatValue() + 1;
                                function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange8.getStart()).floatValue(), fFloatValue));
                                if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                    C0173B.m230b(c0173b5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z4);
                    }
                    Function0 function7 = (Function0) objMo18389z4;
                    if (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() < ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    m804a(c4600a5, function7, z23, c0173b9, c15688rMo18372i, 3072);
                    c15688rMo18372i.m18410W(true);
                }
                c21098a = c21098a3;
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                c21098a2 = c21098a;
                C0173B c0173b10 = c0173b;
                ClosedFloatingPointRange closedFloatingPointRange8 = closedFloatingPointRangeRangeTo;
                aVar3 = aVar2;
                C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange5.getStart()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i.m18410W(true);
                Lazy lazy3 = C19097C0.f59618r;
                C4600a c4600a6 = new C4600a((C16987h) lazy3.getValue(), null);
                if (i13 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i14 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objMo18389z2 = c15688rMo18372i.mo18389z();
                if (z15) {
                    objMo18389z2 = new Function0() { // from class: Be.N
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange;
                            float fFloatValue = ((Number) closedFloatingPointRange9.getStart()).floatValue() + 1;
                            function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue()));
                            if (fFloatValue >= ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b3);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z2);
                } else {
                    objMo18389z2 = new Function0() { // from class: Be.N
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange;
                            float fFloatValue = ((Number) closedFloatingPointRange9.getStart()).floatValue() + 1;
                            function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue()));
                            if (fFloatValue >= ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b3);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z2);
                }
                Function0 function8 = (Function0) objMo18389z2;
                if (((Number) closedFloatingPointRange.getStart()).floatValue() < ((Number) closedFloatingPointRange.getEndInclusive()).floatValue()) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                m804a(c4600a6, function8, z16, c0173b10, c15688rMo18372i, 3072);
                C1963W0.m2623a(C7482g.m8529n(aVar4, f10), c15688rMo18372i);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59657K0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8529n(aVar4, f10), c15688rMo18372i);
                C4600a c4600a7 = new C4600a((C16987h) lazy.getValue(), null);
                if (i13 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i14 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objMo18389z3 = c15688rMo18372i.mo18389z();
                if (z19) {
                    c21235a = c21235a2;
                    if (objMo18389z3 == c21235a) {
                        closedFloatingPointRange6 = closedFloatingPointRange;
                        c0173b2 = c0173b6;
                    }
                    Function0 function9 = (Function0) objMo18389z3;
                    if (((Number) closedFloatingPointRange6.getEndInclusive()).floatValue() > ((Number) closedFloatingPointRange6.getStart()).floatValue()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    m804a(c4600a7, function9, z20, c0173b5, c15688rMo18372i, 3072);
                    InterfaceC7507e interfaceC7507eM8530o4 = C7482g.m8530o(aVar4, f11, 0.0f, 2);
                    InterfaceC5178F interfaceC5178FM2677d4 = C2000k.m2677d(c18863f, false);
                    long j14 = c15688rMo18372i.f50813T;
                    i16 = (int) (j14 ^ (j14 >>> 32));
                    InterfaceC15608O0 interfaceC15608O0M18405R5 = c15688rMo18372i.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c5 = C7503c.m8566c(interfaceC7507eM8530o4, c15688rMo18372i);
                    c15688rMo18372i.mo18353E();
                    if (c15688rMo18372i.f50812S) {
                        c15688rMo18372i.mo18355G(aVar3);
                    } else {
                        c15688rMo18372i.mo18378o();
                    }
                    C15623T1.m18280a(interfaceC5178FM2677d4, c15688rMo18372i, dVar);
                    C15623T1.m18280a(interfaceC15608O0M18405R5, c15688rMo18372i, fVar3);
                    if (c15688rMo18372i.f50812S) {
                        C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                    } else {
                        C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c5, c15688rMo18372i, eVar);
                    C0173B c0173b11 = c0173b2;
                    closedFloatingPointRange3 = closedFloatingPointRange;
                    C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange6.getEndInclusive()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                    c15688rMo18372i = c15688rMo18372i;
                    c15688rMo18372i.m18410W(true);
                    C4600a c4600a8 = new C4600a((C16987h) lazy3.getValue(), null);
                    if (i13 == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (i14 == 256) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    closedFloatingPointRange4 = closedFloatingPointRange8;
                    zMo18362N2 = z22 | z21 | c15688rMo18372i.mo18362N(closedFloatingPointRange4);
                    objMo18389z4 = c15688rMo18372i.mo18389z();
                    if (zMo18362N2) {
                        function2 = function1;
                        objMo18389z4 = new Function0() { // from class: Be.P
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange3;
                                float fFloatValue = ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue() + 1;
                                function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange9.getStart()).floatValue(), fFloatValue));
                                if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                    C0173B.m230b(c0173b5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z4);
                    } else {
                        function2 = function1;
                        objMo18389z4 = new Function0() { // from class: Be.P
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange3;
                                float fFloatValue = ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue() + 1;
                                function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange9.getStart()).floatValue(), fFloatValue));
                                if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                    C0173B.m230b(c0173b5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z4);
                    }
                    Function0 function10 = (Function0) objMo18389z4;
                    if (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() < ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    m804a(c4600a8, function10, z23, c0173b11, c15688rMo18372i, 3072);
                    c15688rMo18372i.m18410W(true);
                } else {
                    c21235a = c21235a2;
                }
                closedFloatingPointRange6 = closedFloatingPointRange;
                c0173b2 = c0173b6;
                objMo18389z3 = new Function0() { // from class: Be.O
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange6;
                        float fFloatValue = ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue() - 1;
                        function1.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange9.getStart()).floatValue(), fFloatValue));
                        if (fFloatValue <= ((Number) closedFloatingPointRange9.getStart()).floatValue()) {
                            C0173B.m230b(c0173b2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
                Function0 function11 = (Function0) objMo18389z3;
                if (((Number) closedFloatingPointRange6.getEndInclusive()).floatValue() > ((Number) closedFloatingPointRange6.getStart()).floatValue()) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                m804a(c4600a7, function11, z20, c0173b5, c15688rMo18372i, 3072);
                InterfaceC7507e interfaceC7507eM8530o5 = C7482g.m8530o(aVar4, f11, 0.0f, 2);
                InterfaceC5178F interfaceC5178FM2677d5 = C2000k.m2677d(c18863f, false);
                long j15 = c15688rMo18372i.f50813T;
                i16 = (int) (j15 ^ (j15 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R6 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c6 = C7503c.m8566c(interfaceC7507eM8530o5, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar3);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d5, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R6, c15688rMo18372i, fVar3);
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                } else {
                    C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                }
                C15623T1.m18280a(interfaceC7507eM8566c6, c15688rMo18372i, eVar);
                C0173B c0173b12 = c0173b2;
                closedFloatingPointRange3 = closedFloatingPointRange;
                C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange6.getEndInclusive()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
                C4600a c4600a9 = new C4600a((C16987h) lazy3.getValue(), null);
                if (i13 == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (i14 == 256) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                closedFloatingPointRange4 = closedFloatingPointRange8;
                zMo18362N2 = z22 | z21 | c15688rMo18372i.mo18362N(closedFloatingPointRange4);
                objMo18389z4 = c15688rMo18372i.mo18389z();
                if (zMo18362N2) {
                    function2 = function1;
                    objMo18389z4 = new Function0() { // from class: Be.P
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange3;
                            float fFloatValue = ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue() + 1;
                            function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange9.getStart()).floatValue(), fFloatValue));
                            if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b5);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z4);
                } else {
                    function2 = function1;
                    objMo18389z4 = new Function0() { // from class: Be.P
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange3;
                            float fFloatValue = ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue() + 1;
                            function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange9.getStart()).floatValue(), fFloatValue));
                            if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b5);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z4);
                }
                Function0 function12 = (Function0) objMo18389z4;
                if (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() < ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                m804a(c4600a9, function12, z23, c0173b12, c15688rMo18372i, 3072);
                c15688rMo18372i.m18410W(true);
            }
            C12269M6.m14188a(i17, c15688rMo18372i, i17, c21098a3);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            String strM19466e2 = C16973X.m19466e((C16972W) C19101C4.f59655J0.getValue(), c15688rMo18372i, 0);
            InterfaceC5799g.a.f fVar4 = fVar;
            C11732N0 c11732n1 = C3375b.f10927j;
            C11565Q2.m13480b(strM19466e2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
            float f12 = 12;
            C1963W0.m2623a(C7482g.m8529n(aVar4, f12), c15688rMo18372i);
            C2431d c2431d2 = C4601b.f15461a;
            Lazy lazy4 = C19097C0.f59616q;
            C4600a c4600a10 = new C4600a((C16987h) lazy4.getValue(), null);
            i13 = i18 & 14;
            if (i13 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            i14 = i18 & 896;
            if (i14 == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            zMo18362N = z10 | z11 | c15688rMo18372i.mo18362N(closedFloatingPointRangeRangeTo);
            objMo18389z = c15688rMo18372i.mo18389z();
            if (zMo18362N) {
                closedFloatingPointRange5 = closedFloatingPointRange;
                c0173b = c0173b4;
                objMo18389z = new Function0() { // from class: Be.M
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange5;
                        float fFloatValue = ((Number) closedFloatingPointRange9.getStart()).floatValue() - 1;
                        function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue()));
                        if (fFloatValue <= ((Number) closedFloatingPointRangeRangeTo.getStart()).floatValue()) {
                            C0173B.m230b(c0173b);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            } else {
                closedFloatingPointRange5 = closedFloatingPointRange;
                c0173b = c0173b4;
                objMo18389z = new Function0() { // from class: Be.M
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRange5;
                        float fFloatValue = ((Number) closedFloatingPointRange9.getStart()).floatValue() - 1;
                        function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange9.getEndInclusive()).floatValue()));
                        if (fFloatValue <= ((Number) closedFloatingPointRangeRangeTo.getStart()).floatValue()) {
                            C0173B.m230b(c0173b);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            Function0 function13 = (Function0) objMo18389z;
            if (((Number) closedFloatingPointRange5.getStart()).floatValue() > ((Number) closedFloatingPointRangeRangeTo.getStart()).floatValue()) {
                z12 = true;
            } else {
                z12 = false;
            }
            m804a(c4600a10, function13, z12, c0173b3, c15688rMo18372i, 3072);
            float f13 = 40;
            InterfaceC7507e interfaceC7507eM8530o6 = C7482g.m8530o(aVar4, f13, 0.0f, 2);
            C18863f c18863f2 = InterfaceC18861d.a.f58751e;
            InterfaceC5178F interfaceC5178FM2677d6 = C2000k.m2677d(c18863f2, false);
            long j16 = c15688rMo18372i.f50813T;
            i15 = (int) (j16 ^ (j16 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R7 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c7 = C7503c.m8566c(interfaceC7507eM8530o6, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                aVar = aVar5;
                c15688rMo18372i.mo18355G(aVar);
            } else {
                aVar = aVar5;
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d6, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R7, c15688rMo18372i, fVar4);
            if (c15688rMo18372i.f50812S) {
                aVar2 = aVar;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                    c21098a = c21098a3;
                }
                C15623T1.m18280a(interfaceC7507eM8566c7, c15688rMo18372i, eVar2);
                c21098a2 = c21098a;
                C0173B c0173b13 = c0173b;
                ClosedFloatingPointRange closedFloatingPointRange9 = closedFloatingPointRangeRangeTo;
                aVar3 = aVar2;
                C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange5.getStart()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i.m18410W(true);
                Lazy lazy5 = C19097C0.f59618r;
                C4600a c4600a11 = new C4600a((C16987h) lazy5.getValue(), null);
                if (i13 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i14 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objMo18389z2 = c15688rMo18372i.mo18389z();
                if (z15) {
                    objMo18389z2 = new Function0() { // from class: Be.N
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange10 = closedFloatingPointRange;
                            float fFloatValue = ((Number) closedFloatingPointRange10.getStart()).floatValue() + 1;
                            function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue()));
                            if (fFloatValue >= ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b3);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z2);
                } else {
                    objMo18389z2 = new Function0() { // from class: Be.N
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange10 = closedFloatingPointRange;
                            float fFloatValue = ((Number) closedFloatingPointRange10.getStart()).floatValue() + 1;
                            function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue()));
                            if (fFloatValue >= ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b3);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z2);
                }
                Function0 function14 = (Function0) objMo18389z2;
                if (((Number) closedFloatingPointRange.getStart()).floatValue() < ((Number) closedFloatingPointRange.getEndInclusive()).floatValue()) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                m804a(c4600a11, function14, z16, c0173b13, c15688rMo18372i, 3072);
                C1963W0.m2623a(C7482g.m8529n(aVar4, f12), c15688rMo18372i);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59657K0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8529n(aVar4, f12), c15688rMo18372i);
                C4600a c4600a12 = new C4600a((C16987h) lazy4.getValue(), null);
                if (i13 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i14 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objMo18389z3 = c15688rMo18372i.mo18389z();
                if (z19) {
                    c21235a = c21235a2;
                    if (objMo18389z3 == c21235a) {
                        closedFloatingPointRange6 = closedFloatingPointRange;
                        c0173b2 = c0173b6;
                    }
                    Function0 function15 = (Function0) objMo18389z3;
                    if (((Number) closedFloatingPointRange6.getEndInclusive()).floatValue() > ((Number) closedFloatingPointRange6.getStart()).floatValue()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    m804a(c4600a12, function15, z20, c0173b5, c15688rMo18372i, 3072);
                    InterfaceC7507e interfaceC7507eM8530o7 = C7482g.m8530o(aVar4, f13, 0.0f, 2);
                    InterfaceC5178F interfaceC5178FM2677d7 = C2000k.m2677d(c18863f2, false);
                    long j17 = c15688rMo18372i.f50813T;
                    i16 = (int) (j17 ^ (j17 >>> 32));
                    InterfaceC15608O0 interfaceC15608O0M18405R8 = c15688rMo18372i.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c8 = C7503c.m8566c(interfaceC7507eM8530o7, c15688rMo18372i);
                    c15688rMo18372i.mo18353E();
                    if (c15688rMo18372i.f50812S) {
                        c15688rMo18372i.mo18355G(aVar3);
                    } else {
                        c15688rMo18372i.mo18378o();
                    }
                    C15623T1.m18280a(interfaceC5178FM2677d7, c15688rMo18372i, dVar);
                    C15623T1.m18280a(interfaceC15608O0M18405R8, c15688rMo18372i, fVar4);
                    if (c15688rMo18372i.f50812S) {
                        C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                    } else {
                        C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c8, c15688rMo18372i, eVar2);
                    C0173B c0173b14 = c0173b2;
                    closedFloatingPointRange3 = closedFloatingPointRange;
                    C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange6.getEndInclusive()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
                    c15688rMo18372i = c15688rMo18372i;
                    c15688rMo18372i.m18410W(true);
                    C4600a c4600a13 = new C4600a((C16987h) lazy5.getValue(), null);
                    if (i13 == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (i14 == 256) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    closedFloatingPointRange4 = closedFloatingPointRange9;
                    zMo18362N2 = z22 | z21 | c15688rMo18372i.mo18362N(closedFloatingPointRange4);
                    objMo18389z4 = c15688rMo18372i.mo18389z();
                    if (zMo18362N2) {
                        function2 = function1;
                        objMo18389z4 = new Function0() { // from class: Be.P
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ClosedFloatingPointRange closedFloatingPointRange10 = closedFloatingPointRange3;
                                float fFloatValue = ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue() + 1;
                                function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange10.getStart()).floatValue(), fFloatValue));
                                if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                    C0173B.m230b(c0173b5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z4);
                    } else {
                        function2 = function1;
                        objMo18389z4 = new Function0() { // from class: Be.P
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ClosedFloatingPointRange closedFloatingPointRange10 = closedFloatingPointRange3;
                                float fFloatValue = ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue() + 1;
                                function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange10.getStart()).floatValue(), fFloatValue));
                                if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                    C0173B.m230b(c0173b5);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z4);
                    }
                    Function0 function16 = (Function0) objMo18389z4;
                    if (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() < ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    m804a(c4600a13, function16, z23, c0173b14, c15688rMo18372i, 3072);
                    c15688rMo18372i.m18410W(true);
                } else {
                    c21235a = c21235a2;
                }
                closedFloatingPointRange6 = closedFloatingPointRange;
                c0173b2 = c0173b6;
                objMo18389z3 = new Function0() { // from class: Be.O
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange10 = closedFloatingPointRange6;
                        float fFloatValue = ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue() - 1;
                        function1.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange10.getStart()).floatValue(), fFloatValue));
                        if (fFloatValue <= ((Number) closedFloatingPointRange10.getStart()).floatValue()) {
                            C0173B.m230b(c0173b2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
                Function0 function17 = (Function0) objMo18389z3;
                if (((Number) closedFloatingPointRange6.getEndInclusive()).floatValue() > ((Number) closedFloatingPointRange6.getStart()).floatValue()) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                m804a(c4600a12, function17, z20, c0173b5, c15688rMo18372i, 3072);
                InterfaceC7507e interfaceC7507eM8530o8 = C7482g.m8530o(aVar4, f13, 0.0f, 2);
                InterfaceC5178F interfaceC5178FM2677d8 = C2000k.m2677d(c18863f2, false);
                long j18 = c15688rMo18372i.f50813T;
                i16 = (int) (j18 ^ (j18 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R9 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c9 = C7503c.m8566c(interfaceC7507eM8530o8, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar3);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d8, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R9, c15688rMo18372i, fVar4);
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                } else {
                    C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                }
                C15623T1.m18280a(interfaceC7507eM8566c9, c15688rMo18372i, eVar2);
                C0173B c0173b15 = c0173b2;
                closedFloatingPointRange3 = closedFloatingPointRange;
                C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange6.getEndInclusive()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
                C4600a c4600a14 = new C4600a((C16987h) lazy5.getValue(), null);
                if (i13 == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (i14 == 256) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                closedFloatingPointRange4 = closedFloatingPointRange9;
                zMo18362N2 = z22 | z21 | c15688rMo18372i.mo18362N(closedFloatingPointRange4);
                objMo18389z4 = c15688rMo18372i.mo18389z();
                if (zMo18362N2) {
                    function2 = function1;
                    objMo18389z4 = new Function0() { // from class: Be.P
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange10 = closedFloatingPointRange3;
                            float fFloatValue = ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue() + 1;
                            function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange10.getStart()).floatValue(), fFloatValue));
                            if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b5);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z4);
                } else {
                    function2 = function1;
                    objMo18389z4 = new Function0() { // from class: Be.P
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange10 = closedFloatingPointRange3;
                            float fFloatValue = ((Number) closedFloatingPointRange10.getEndInclusive()).floatValue() + 1;
                            function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange10.getStart()).floatValue(), fFloatValue));
                            if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b5);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z4);
                }
                Function0 function18 = (Function0) objMo18389z4;
                if (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() < ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                m804a(c4600a14, function18, z23, c0173b15, c15688rMo18372i, 3072);
                c15688rMo18372i.m18410W(true);
            } else {
                aVar2 = aVar;
            }
            c21098a = c21098a3;
            C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            C15623T1.m18280a(interfaceC7507eM8566c7, c15688rMo18372i, eVar2);
            c21098a2 = c21098a;
            C0173B c0173b16 = c0173b;
            ClosedFloatingPointRange closedFloatingPointRange10 = closedFloatingPointRangeRangeTo;
            aVar3 = aVar2;
            C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange5.getStart()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i.m18410W(true);
            Lazy lazy6 = C19097C0.f59618r;
            C4600a c4600a15 = new C4600a((C16987h) lazy6.getValue(), null);
            if (i13 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i14 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z13;
            objMo18389z2 = c15688rMo18372i.mo18389z();
            if (z15) {
                objMo18389z2 = new Function0() { // from class: Be.N
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange11 = closedFloatingPointRange;
                        float fFloatValue = ((Number) closedFloatingPointRange11.getStart()).floatValue() + 1;
                        function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue()));
                        if (fFloatValue >= ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue()) {
                            C0173B.m230b(c0173b3);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
            } else {
                objMo18389z2 = new Function0() { // from class: Be.N
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange11 = closedFloatingPointRange;
                        float fFloatValue = ((Number) closedFloatingPointRange11.getStart()).floatValue() + 1;
                        function1.invoke(RangesKt.rangeTo(fFloatValue, ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue()));
                        if (fFloatValue >= ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue()) {
                            C0173B.m230b(c0173b3);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            Function0 function19 = (Function0) objMo18389z2;
            if (((Number) closedFloatingPointRange.getStart()).floatValue() < ((Number) closedFloatingPointRange.getEndInclusive()).floatValue()) {
                z16 = true;
            } else {
                z16 = false;
            }
            m804a(c4600a15, function19, z16, c0173b16, c15688rMo18372i, 3072);
            C1963W0.m2623a(C7482g.m8529n(aVar4, f12), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59657K0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8529n(aVar4, f12), c15688rMo18372i);
            C4600a c4600a16 = new C4600a((C16987h) lazy4.getValue(), null);
            if (i13 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i14 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | z17;
            objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z19) {
                c21235a = c21235a2;
                if (objMo18389z3 == c21235a) {
                    closedFloatingPointRange6 = closedFloatingPointRange;
                    c0173b2 = c0173b6;
                }
                Function0 function110 = (Function0) objMo18389z3;
                if (((Number) closedFloatingPointRange6.getEndInclusive()).floatValue() > ((Number) closedFloatingPointRange6.getStart()).floatValue()) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                m804a(c4600a16, function110, z20, c0173b5, c15688rMo18372i, 3072);
                InterfaceC7507e interfaceC7507eM8530o9 = C7482g.m8530o(aVar4, f13, 0.0f, 2);
                InterfaceC5178F interfaceC5178FM2677d9 = C2000k.m2677d(c18863f2, false);
                long j19 = c15688rMo18372i.f50813T;
                i16 = (int) (j19 ^ (j19 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R10 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c10 = C7503c.m8566c(interfaceC7507eM8530o9, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar3);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d9, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R10, c15688rMo18372i, fVar4);
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                } else {
                    C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                }
                C15623T1.m18280a(interfaceC7507eM8566c10, c15688rMo18372i, eVar2);
                C0173B c0173b17 = c0173b2;
                closedFloatingPointRange3 = closedFloatingPointRange;
                C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange6.getEndInclusive()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
                C4600a c4600a17 = new C4600a((C16987h) lazy6.getValue(), null);
                if (i13 == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (i14 == 256) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                closedFloatingPointRange4 = closedFloatingPointRange10;
                zMo18362N2 = z22 | z21 | c15688rMo18372i.mo18362N(closedFloatingPointRange4);
                objMo18389z4 = c15688rMo18372i.mo18389z();
                if (zMo18362N2) {
                    function2 = function1;
                    objMo18389z4 = new Function0() { // from class: Be.P
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange11 = closedFloatingPointRange3;
                            float fFloatValue = ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue() + 1;
                            function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange11.getStart()).floatValue(), fFloatValue));
                            if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b5);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z4);
                } else {
                    function2 = function1;
                    objMo18389z4 = new Function0() { // from class: Be.P
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ClosedFloatingPointRange closedFloatingPointRange11 = closedFloatingPointRange3;
                            float fFloatValue = ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue() + 1;
                            function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange11.getStart()).floatValue(), fFloatValue));
                            if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                                C0173B.m230b(c0173b5);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z4);
                }
                Function0 function111 = (Function0) objMo18389z4;
                if (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() < ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                m804a(c4600a17, function111, z23, c0173b17, c15688rMo18372i, 3072);
                c15688rMo18372i.m18410W(true);
            } else {
                c21235a = c21235a2;
            }
            closedFloatingPointRange6 = closedFloatingPointRange;
            c0173b2 = c0173b6;
            objMo18389z3 = new Function0() { // from class: Be.O
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ClosedFloatingPointRange closedFloatingPointRange11 = closedFloatingPointRange6;
                    float fFloatValue = ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue() - 1;
                    function1.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange11.getStart()).floatValue(), fFloatValue));
                    if (fFloatValue <= ((Number) closedFloatingPointRange11.getStart()).floatValue()) {
                        C0173B.m230b(c0173b2);
                    }
                    return Unit.INSTANCE;
                }
            };
            c15688rMo18372i.mo18380q(objMo18389z3);
            Function0 function112 = (Function0) objMo18389z3;
            if (((Number) closedFloatingPointRange6.getEndInclusive()).floatValue() > ((Number) closedFloatingPointRange6.getStart()).floatValue()) {
                z20 = true;
            } else {
                z20 = false;
            }
            m804a(c4600a16, function112, z20, c0173b5, c15688rMo18372i, 3072);
            InterfaceC7507e interfaceC7507eM8530o10 = C7482g.m8530o(aVar4, f13, 0.0f, 2);
            InterfaceC5178F interfaceC5178FM2677d10 = C2000k.m2677d(c18863f2, false);
            long j110 = c15688rMo18372i.f50813T;
            i16 = (int) (j110 ^ (j110 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R11 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c11 = C7503c.m8566c(interfaceC7507eM8530o10, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d10, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R11, c15688rMo18372i, fVar4);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
            } else {
                C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
            }
            C15623T1.m18280a(interfaceC7507eM8566c11, c15688rMo18372i, eVar2);
            C0173B c0173b18 = c0173b2;
            closedFloatingPointRange3 = closedFloatingPointRange;
            C11565Q2.m13480b(String.valueOf((int) ((Number) closedFloatingPointRange6.getEndInclusive()).floatValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            C4600a c4600a18 = new C4600a((C16987h) lazy6.getValue(), null);
            if (i13 == 4) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (i14 == 256) {
                z22 = true;
            } else {
                z22 = false;
            }
            closedFloatingPointRange4 = closedFloatingPointRange10;
            zMo18362N2 = z22 | z21 | c15688rMo18372i.mo18362N(closedFloatingPointRange4);
            objMo18389z4 = c15688rMo18372i.mo18389z();
            if (zMo18362N2) {
                function2 = function1;
                objMo18389z4 = new Function0() { // from class: Be.P
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange11 = closedFloatingPointRange3;
                        float fFloatValue = ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue() + 1;
                        function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange11.getStart()).floatValue(), fFloatValue));
                        if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                            C0173B.m230b(c0173b5);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z4);
            } else {
                function2 = function1;
                objMo18389z4 = new Function0() { // from class: Be.P
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ClosedFloatingPointRange closedFloatingPointRange11 = closedFloatingPointRange3;
                        float fFloatValue = ((Number) closedFloatingPointRange11.getEndInclusive()).floatValue() + 1;
                        function2.invoke(RangesKt.rangeTo(((Number) closedFloatingPointRange11.getStart()).floatValue(), fFloatValue));
                        if (fFloatValue >= ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                            C0173B.m230b(c0173b5);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            Function0 function113 = (Function0) objMo18389z4;
            if (((Number) closedFloatingPointRange3.getEndInclusive()).floatValue() < ((Number) closedFloatingPointRange4.getEndInclusive()).floatValue()) {
                z23 = true;
            } else {
                z23 = false;
            }
            m804a(c4600a18, function113, z23, c0173b18, c15688rMo18372i, 3072);
            c15688rMo18372i.m18410W(true);
        } else {
            closedFloatingPointRange3 = closedFloatingPointRange;
            function2 = function1;
            c15688rMo18372i.mo18356H();
            closedFloatingPointRange4 = closedFloatingPointRange2;
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: Be.Q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C0421W.m805b(closedFloatingPointRange3, closedFloatingPointRange4, function2, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
