package je;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.ranges.RangesKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p233Mg.C3561B;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p580h1.C11752c;
import p607i9.C12269M6;
import p640jf.C15456E0;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p830w0.InterfaceC18861d;
import p845wg.C19142I0;
import p845wg.C19278b3;
import ye.C20490h;

/* JADX INFO: renamed from: je.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFilterBarTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterBarTv.kt\nru/zona/app/screens/catalog/compositions/FilterBarTvKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,85:1\n113#2:86\n113#2:87\n113#2:124\n113#2:163\n113#2:164\n87#3:88\n85#3,8:89\n94#3:172\n80#4,6:97\n87#4,3:112\n90#4,2:121\n80#4,6:136\n87#4,3:151\n90#4,2:160\n94#4:167\n94#4:171\n391#5,9:103\n400#5:123\n391#5,9:142\n400#5:162\n401#5,2:165\n401#5,2:169\n4360#6,6:115\n4360#6,6:154\n99#7:125\n95#7,10:126\n106#7:168\n*S KotlinDebug\n*F\n+ 1 FilterBarTv.kt\nru/zona/app/screens/catalog/compositions/FilterBarTvKt\n*L\n38#1:86\n39#1:87\n42#1:124\n45#1:163\n56#1:164\n37#1:88\n37#1:89,8\n37#1:172\n37#1:97,6\n37#1:112,3\n37#1:121,2\n41#1:136,6\n41#1:151,3\n41#1:160,2\n41#1:167\n37#1:171\n37#1:103,9\n37#1:123\n41#1:142,9\n41#1:162\n41#1:165,2\n37#1:169,2\n37#1:115,6\n41#1:154,6\n41#1:125\n41#1:126,10\n41#1:168\n*E\n"})
public final class C15446g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public static final void m18106a(final boolean z10, C3561B c3561b, final C11752c c11752c, final Function0<Unit> function0, Function0<Unit> function1, final Function0<Unit> function2, boolean z11, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        C3561B c3561b2;
        int i12;
        Function0<Unit> function3;
        int i13;
        boolean z12;
        int i14;
        final C3561B c3561b3;
        final Function0<Unit> function4;
        final boolean z13;
        C15688r c15688r;
        Function0<Unit> function5;
        ?? r10;
        boolean z14;
        C3561B c3561b4;
        C15688r c15688r2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-57755581);
        int i15 = i10 | (c15688rMo18372i.mo18364a(z10) ? 4 : 2);
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 = i15 | 48;
            c3561b2 = c3561b;
        } else {
            c3561b2 = c3561b;
            i12 = i15 | (c15688rMo18372i.mo18350B(c3561b2) ? 32 : 16);
        }
        int i17 = i12 | (c15688rMo18372i.mo18362N(c11752c) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024);
        int i18 = i11 & 16;
        if (i18 != 0) {
            i13 = i17 | 24576;
            function3 = function1;
        } else {
            function3 = function1;
            i13 = i17 | (c15688rMo18372i.mo18350B(function3) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
        int i19 = i13 | (c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT);
        int i20 = i11 & 64;
        if (i20 != 0) {
            i14 = i19 | 1572864;
            z12 = z11;
        } else {
            z12 = z11;
            i14 = i19 | (c15688rMo18372i.mo18364a(z12) ? 1048576 : 524288);
        }
        int i21 = i14;
        if (c15688rMo18372i.mo18379p(i21 & 1, (i21 & 599187) != 599186)) {
            if (i16 != 0) {
                c3561b2 = null;
            }
            Function0<Unit> function6 = i18 != 0 ? null : function3;
            boolean z15 = i20 != 0 ? false : z12;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar, 0.0f, 24, 0.0f, 20, 5);
            float f10 = 16;
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(f10), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i22 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i22))) {
                C12269M6.m14188a(i22, c15688rMo18372i, i22, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(f10), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j11 = c15688rMo18372i.f50813T;
            int i23 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i23))) {
                C12269M6.m14188a(i23, c15688rMo18372i, i23, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            int i24 = i21 << 9;
            int i25 = i24 & 1879048192;
            C3561B c3561b5 = c3561b2;
            C15456E0.m18110a(C7482g.m8529n(aVar, 215), null, C16973X.m19466e((C16972W) C19278b3.f60004n.getValue(), c15688rMo18372i, 0), null, C4601b.m5212g(), z10, function0, z10, false, z15, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, ((i21 << 15) & 458752) | 6 | (i24 & 3670016) | ((i21 << 21) & 29360128) | i25, 0, 523530);
            boolean z16 = z15;
            C15688r c15688r3 = c15688rMo18372i;
            if (c3561b5 == null || function6 == null) {
                function5 = function6;
                r10 = 0;
                c15688r3.mo18363O(-1547751259);
                c15688r3.m18410W(false);
            } else {
                c15688r3.mo18363O(-1548055896);
                Function0<Unit> function7 = function6;
                C15456E0.m18110a(C7482g.m8530o(aVar, 230, 0.0f, 2), null, C20490h.m25107a(c3561b5, c15688r3), null, new C4600a((C16987h) C19142I0.f59909g.getValue(), null), false, function7, false, false, z16, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688r3, ((i21 << 6) & 3670016) | 6 | i25, 0, 523690);
                function5 = function7;
                r10 = 0;
                c15688r3.m18410W(false);
            }
            if (z10) {
                c15688r3.mo18363O(-1547689042);
                C15456E0.m18110a(null, null, C16973X.m19466e((C16972W) C19278b3.f60002m.getValue(), c15688r3, r10), null, C4601b.m5213h(), false, function2, false, false, z16, null, C3376c.f10944e, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688r3, ((i21 << 3) & 3670016) | i25, 0, 521643);
                c15688r3.m18410W(r10);
                z14 = true;
            } else {
                c15688r3.mo18363O(1058463896);
                if (1.0f <= 0.0d) {
                    C2192a.m2845a("invalid weight; must be greater than zero");
                }
                z14 = true;
                C1963W0.m2623a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), c15688r3);
                c15688r3.m18410W(r10);
            }
            c15688r3.m18410W(z14);
            if (!z10 || c11752c == null) {
                c3561b4 = c3561b5;
                c15688r3.mo18363O(631492809);
                c15688r3.m18410W(false);
                c15688r2 = c15688r3;
            } else {
                c15688r3.mo18363O(631277235);
                c3561b4 = c3561b5;
                C11565Q2.m13481c(c11752c, null, 0L, 0L, 0L, null, 0L, 2, false, 3, 0, null, null, C11732N0.m13585a(C3375b.f10930m, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r3, (i21 >> 6) & 14, 24960, 241662);
                C15688r c15688r4 = c15688r3;
                c15688r4.m18410W(false);
                c15688r2 = c15688r4;
            }
            c15688r2.m18410W(true);
            z13 = z16;
            c3561b3 = c3561b4;
            function4 = function5;
            c15688r = c15688r2;
        } else {
            C15688r c15688r5 = c15688rMo18372i;
            c15688r5.mo18356H();
            c3561b3 = c3561b2;
            function4 = function3;
            z13 = z12;
            c15688r = c15688r5;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, c3561b3, c11752c, function0, function4, function2, z13, i10, i11) { // from class: je.f

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f50133b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C3561B f50134c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C11752c f50135d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f50136e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f50137f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function0 f50138g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f50139h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ int f50140i;

                {
                    this.f50140i = i11;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C15446g.m18106a(this.f50133b, this.f50134c, this.f50135d, this.f50136e, this.f50137f, this.f50138g, this.f50139h, (InterfaceC15676n) obj, iM18294a, this.f50140i);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
