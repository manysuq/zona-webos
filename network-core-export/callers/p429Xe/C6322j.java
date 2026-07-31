package p429Xe;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import bf.C8245x0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import ne.C17229w;
import ne.C17230x;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p002A1.C0021a;
import p019B0.InterfaceC0179H;
import p055D0.C0946M0;
import p055D0.C0998l0;
import p090F.InterfaceC1457j;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p214Lf.C3374a;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p270P.C4025f;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p533e1.C10698F;
import p533e1.C10727t;
import p533e1.InterfaceC10701I;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p607i9.C12664j3;
import p607i9.C12736n3;
import p640jf.C15456E0;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19140H5;

/* JADX INFO: renamed from: Xe.j */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nQueryHistory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryHistory.kt\nru/zona/app/screens/search/compositions/QueryHistoryKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,149:1\n87#2:150\n84#2,9:151\n94#2:254\n87#2:257\n85#2,8:258\n94#2:377\n80#3,6:160\n87#3,3:175\n90#3,2:184\n80#3,6:200\n87#3,3:215\n90#3,2:224\n94#3:248\n94#3:253\n80#3,6:266\n87#3,3:281\n90#3,2:290\n80#3,6:312\n87#3,3:327\n90#3,2:336\n94#3:371\n94#3:376\n391#4,9:166\n400#4:186\n391#4,9:206\n400#4:226\n401#4,2:246\n401#4,2:251\n391#4,9:272\n400#4:292\n391#4,9:318\n400#4:338\n401#4,2:369\n401#4,2:374\n4360#5,6:178\n4360#5,6:218\n4360#5,6:284\n4360#5,6:330\n113#6:187\n113#6:189\n113#6:255\n113#6:256\n113#6:293\n113#6:301\n113#6:357\n113#6:358\n113#6:359\n113#6:360\n113#6:361\n113#6:362\n2068#7:188\n2069#7:250\n2068#7:294\n2069#7:373\n99#8:190\n96#8,9:191\n106#8:249\n99#8:302\n96#8,9:303\n106#8:372\n15#9,7:227\n1282#10,6:234\n1282#10,6:240\n1282#10,6:295\n1282#10,6:339\n1282#10,6:345\n1282#10,6:351\n1282#10,6:363\n85#11:378\n117#11,2:379\n*S KotlinDebug\n*F\n+ 1 QueryHistory.kt\nru/zona/app/screens/search/compositions/QueryHistoryKt\n*L\n51#1:150\n51#1:151,9\n51#1:254\n96#1:257\n96#1:258,8\n96#1:377\n51#1:160,6\n51#1:175,3\n51#1:184,2\n63#1:200,6\n63#1:215,3\n63#1:224,2\n63#1:248\n51#1:253\n96#1:266,6\n96#1:281,3\n96#1:290,2\n115#1:312,6\n115#1:327,3\n115#1:336,2\n115#1:371\n96#1:376\n51#1:166,9\n51#1:186\n63#1:206,9\n63#1:226\n63#1:246,2\n51#1:251,2\n96#1:272,9\n96#1:292\n115#1:318,9\n115#1:338\n115#1:369,2\n96#1:374,2\n51#1:178,6\n63#1:218,6\n96#1:284,6\n115#1:330,6\n57#1:187\n66#1:189\n99#1:255\n100#1:256\n103#1:293\n116#1:301\n128#1:357\n130#1:358\n136#1:359\n141#1:360\n143#1:361\n144#1:362\n61#1:188\n61#1:250\n112#1:294\n112#1:373\n63#1:190\n63#1:191,9\n63#1:249\n115#1:302\n115#1:303,9\n115#1:372\n71#1:227,7\n72#1:234,6\n81#1:240,6\n113#1:295,6\n121#1:339,6\n122#1:345,6\n123#1:351,6\n139#1:363,6\n113#1:378\n113#1:379,2\n*E\n"})
public final class C6322j {

    /* JADX INFO: renamed from: Xe.j$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class a implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f20747b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f20748c;

        public a(String str, Function1 function1) {
            this.f20747b = function1;
            this.f20748c = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C6321i(this.f20748c, this.f20747b), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m7119a(final List<String> list, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2045210023);
        int i11 = (c15688rMo18372i.mo18362N(list) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
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
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            float f10 = 16;
            float f11 = f10;
            InterfaceC7507e.a aVar3 = aVar;
            int i13 = i11;
            int i14 = 0;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59669Q0.getValue(), c15688rMo18372i, 0), C7481f.m8511d(C7482g.m8518c(aVar, 1.0f), f10), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10908c, c15688rMo18372i, 48, 0, 131068);
            c15688r = c15688rMo18372i;
            c15688r.mo18363O(-141006151);
            for (final String str : list) {
                String strM43a = C0021a.m43a(C16973X.m19466e((C16972W) C19101C4.f59651H0.getValue(), c15688r, i14), " ", str);
                InterfaceC7507e.a aVar4 = aVar3;
                float f12 = f11;
                InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7482g.m8518c(aVar4, 1.0f), f12);
                C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688r, i14);
                long j11 = c15688r.f50813T;
                int i15 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688r.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8511d, c15688r);
                InterfaceC5799g.f19145s1.getClass();
                C5753J.a aVar5 = InterfaceC5799g.a.f19147b;
                c15688r.mo18353E();
                if (c15688r.f50812S) {
                    c15688r.mo18355G(aVar5);
                } else {
                    c15688r.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a, c15688r, InterfaceC5799g.a.f19152g);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688r, InterfaceC5799g.a.f19151f);
                InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                if (c15688r.f50812S || !Intrinsics.areEqual(c15688r.mo18389z(), Integer.valueOf(i15))) {
                    C12269M6.m14188a(i15, c15688r, i15, c21098a2);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688r, InterfaceC5799g.a.f19149d);
                if (1.0f <= 0.0d) {
                    C2192a.m2845a("invalid weight; must be greater than zero");
                }
                InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), C6138n1.f20157a, new a(str, function1));
                boolean zMo18362N = c15688r.mo18362N(strM43a);
                Object objMo18389z = c15688r.mo18389z();
                InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                if (zMo18362N || objMo18389z == c21235a) {
                    objMo18389z = new C6318f(strM43a, 0);
                    c15688r.mo18380q(objMo18389z);
                }
                f11 = f12;
                C15688r c15688r2 = c15688r;
                C11565Q2.m13480b(str, C10727t.m12784b(interfaceC7507eM8564a, true, (Function1) objMo18389z), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10914i, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r2, 0, 0, 131068);
                String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59869n.getValue(), c15688r2, 0);
                C4600a c4600aM5210e = C4601b.m5210e();
                long j12 = C3376c.f10947h;
                int i16 = i13;
                boolean zMo18362N2 = ((i16 & 896) == 256) | c15688r2.mo18362N(str);
                Object objMo18389z2 = c15688r2.mo18389z();
                if (zMo18362N2 || objMo18389z2 == c21235a) {
                    objMo18389z2 = new Function0() { // from class: Xe.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(str);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(objMo18389z2);
                }
                C8245x0.m10155b(null, (Function0) objMo18389z2, strM19466e, c4600aM5210e, false, false, 0L, j12, 0.0f, c15688r2, 0, 753);
                c15688r = c15688r2;
                c15688r.m18410W(true);
                i14 = 0;
                aVar3 = aVar4;
                i13 = i16;
            }
            c15688r.m18410W(false);
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: Xe.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C6322j.m7119a(list, function1, function2, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m7120b(final List<String> list, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        final Function1<? super String, Unit> function3 = function1;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(199792624);
        int i11 = (c15688rMo18372i.mo18362N(list) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function3) ? 32 : 16) | (c15688rMo18372i.mo18350B(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8518c(aVar, 1.0f), f10, 0.0f, 2);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(12), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
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
            float f11 = 4;
            float f12 = f10;
            int i13 = i11;
            InterfaceC7507e.a aVar3 = aVar;
            int i14 = 0;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59669Q0.getValue(), c15688rMo18372i, 0), C7481f.m8515h(aVar, 0.0f, 0.0f, 0.0f, f11, 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, new C11732N0(C3376c.f10951l, C18580v.m21028b(24), new C16318q(900), 0L, 0, 0, C18580v.m21028b(32), 16646136), c15688rMo18372i, 48, 0, 131068);
            c15688r = c15688rMo18372i;
            c15688r.mo18363O(-903573048);
            for (final String str : list) {
                Object objMo18389z = c15688r.mo18389z();
                InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                if (objMo18389z == c21235a) {
                    objMo18389z = C17229w.m19683a(C3376c.f10965z, c15688r);
                }
                final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
                final String strM43a = C0021a.m43a(C16973X.m19466e((C16972W) C19101C4.f59651H0.getValue(), c15688r, i14), " ", str);
                InterfaceC7507e.a aVar4 = aVar3;
                InterfaceC7507e interfaceC7507eM8529n = C7482g.m8529n(aVar4, 380);
                C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58757k, c15688r, 48);
                long j11 = c15688r.f50813T;
                int i15 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688r.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8529n, c15688r);
                InterfaceC5799g.f19145s1.getClass();
                C5753J.a aVar5 = InterfaceC5799g.a.f19147b;
                c15688r.mo18353E();
                if (c15688r.f50812S) {
                    c15688r.mo18355G(aVar5);
                } else {
                    c15688r.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a, c15688r, InterfaceC5799g.a.f19152g);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688r, InterfaceC5799g.a.f19151f);
                InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                if (c15688r.f50812S || !Intrinsics.areEqual(c15688r.mo18389z(), Integer.valueOf(i15))) {
                    C12269M6.m14188a(i15, c15688r, i15, c21098a2);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688r, InterfaceC5799g.a.f19149d);
                Object objMo18389z2 = c15688r.mo18389z();
                if (objMo18389z2 == c21235a) {
                    objMo18389z2 = new Function1() { // from class: Xe.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            C17230x.m19684a(((InterfaceC0179H) obj).mo235a() ? C3376c.f10957r : C3376c.f10965z, interfaceC15701v0);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r.mo18380q(objMo18389z2);
                }
                InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(aVar4, (Function1) objMo18389z2);
                boolean zMo18362N = c15688r.mo18362N(str) | ((i13 & 112) == 32);
                Object objMo18389z3 = c15688r.mo18389z();
                if (zMo18362N || objMo18389z3 == c21235a) {
                    objMo18389z3 = new Function0() { // from class: Xe.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function3.invoke(str);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r.mo18380q(objMo18389z3);
                }
                InterfaceC7507e interfaceC7507eM8490c = C7470c.m8490c(15, interfaceC7507eM8576a, null, (Function0) objMo18389z3, false);
                boolean zMo18362N2 = c15688r.mo18362N(strM43a);
                Object objMo18389z4 = c15688r.mo18389z();
                if (zMo18362N2 || objMo18389z4 == c21235a) {
                    objMo18389z4 = new Function1() { // from class: Xe.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            InterfaceC10701I interfaceC10701I = (InterfaceC10701I) obj;
                            C10698F.m12770g(interfaceC10701I, 0);
                            C10698F.m12768e(interfaceC10701I, strM43a);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r.mo18380q(objMo18389z4);
                }
                InterfaceC7507e interfaceC7507eM12784b = C10727t.m12784b(interfaceC7507eM8490c, true, (Function1) objMo18389z4);
                if (1.0f <= 0.0d) {
                    C2192a.m2845a("invalid weight; must be greater than zero");
                }
                C15688r c15688r2 = c15688r;
                int i16 = i13;
                C11565Q2.m13480b(str, C7481f.m8512e(C7468a.m8487b(C0009h.m22a(interfaceC7507eM12784b.mo2665S0(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true)), C4025f.m4709b(f11)), ((C0998l0) interfaceC15701v0.getValue()).f3476a, C0946M0.f3382a), 24, 8), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, C3375b.f10932o, c15688r2, 0, 24960, 110588);
                float f13 = f12;
                C1963W0.m2623a(C7482g.m8529n(aVar4, f13), c15688r2);
                String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59869n.getValue(), c15688r2, 0);
                C4600a c4600aM5210e = C4601b.m5210e();
                long j12 = C3376c.f10965z;
                float f14 = 10;
                boolean zMo18362N3 = c15688r2.mo18362N(str) | ((i16 & 896) == 256);
                Object objMo18389z5 = c15688r2.mo18389z();
                if (zMo18362N3 || objMo18389z5 == c21235a) {
                    objMo18389z5 = new Function0() { // from class: Xe.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(str);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(objMo18389z5);
                }
                C15456E0.m18110a(null, null, null, strM19466e, c4600aM5210e, false, (Function0) objMo18389z5, false, false, false, null, j12, 0L, 0L, f13, f14, f14, false, null, c15688r2, 0, 1794048, 407463);
                c15688r = c15688r2;
                c15688r.m18410W(true);
                function3 = function1;
                aVar3 = aVar4;
                i13 = i16;
                f12 = f13;
                i14 = 0;
            }
            c15688r.m18410W(false);
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(list, i10, function1, function2) { // from class: Xe.e

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f20734b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f20735c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function1 f20736d;

                {
                    this.f20735c = function1;
                    this.f20736d = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6322j.m7120b(this.f20734b, this.f20735c, this.f20736d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
