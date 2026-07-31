package p844we;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mg.C17059v;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p055D0.C0946M0;
import p055D0.C0955R0;
import p090F.InterfaceC1457j;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p270P.C4025f;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p580h1.C11752c;
import p580h1.C11795x0;
import p580h1.InterfaceC11780q;
import p607i9.C12664j3;
import p607i9.C12736n3;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15658h;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p664l1.AbstractC16308g;
import p664l1.C16316o;
import p664l1.C16317p;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p706o1.C17285d;
import p775s0.C18037u;
import p776s1.C18043a;
import p776s1.C18051i;
import p776s1.C18056n;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p883z1.C20671l;

/* JADX INFO: renamed from: we.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMessageSentSuccessDialogM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageSentSuccessDialogM.kt\nru/zona/app/screens/dialog/report/MessageSentSuccessDialogMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n*L\n1#1,73:1\n1282#2,6:74\n113#3:80\n113#3:81\n113#3:82\n113#3:120\n113#3:158\n113#3:163\n113#3:209\n87#4:83\n84#4,9:84\n87#4:121\n84#4,9:122\n94#4:162\n94#4:217\n80#5,6:93\n87#5,3:108\n90#5,2:117\n80#5,6:131\n87#5,3:146\n90#5,2:155\n94#5:161\n80#5,6:175\n87#5,3:190\n90#5,2:199\n94#5:212\n94#5:216\n391#6,9:99\n400#6:119\n391#6,9:137\n400#6:157\n401#6,2:159\n391#6,9:181\n400#6:201\n401#6,2:210\n401#6,2:214\n4360#7,6:111\n4360#7,6:149\n4360#7,6:193\n99#8:164\n95#8,10:165\n106#8:213\n15#9,7:202\n*S KotlinDebug\n*F\n+ 1 MessageSentSuccessDialogM.kt\nru/zona/app/screens/dialog/report/MessageSentSuccessDialogMKt\n*L\n40#1:74,6\n47#1:80\n48#1:81\n50#1:82\n52#1:120\n54#1:158\n57#1:163\n68#1:209\n45#1:83\n45#1:84,9\n52#1:121\n52#1:122,9\n52#1:162\n45#1:217\n45#1:93,6\n45#1:108,3\n45#1:117,2\n52#1:131,6\n52#1:146,3\n52#1:155,2\n52#1:161\n58#1:175,6\n58#1:190,3\n58#1:199,2\n58#1:212\n45#1:216\n45#1:99,9\n45#1:119\n52#1:137,9\n52#1:157\n52#1:159,2\n58#1:181,9\n58#1:201\n58#1:210,2\n45#1:214,2\n45#1:111,6\n52#1:149,6\n58#1:193,6\n58#1:164\n58#1:165,10\n58#1:213\n67#1:202,7\n*E\n"})
public final class C19069e {

    /* JADX INFO: renamed from: we.e$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class a implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f59473b;

        public a(Function0 function0) {
            this.f59473b = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C19068d(this.f59473b), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m21375a(final Function0<Unit> function0, final String str, final Function0<Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(758119137);
        int i11 = (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(str) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            final String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59830R0.getValue(), c15688rMo18372i, 0);
            String strM19467f = C16973X.m19467f((C16972W) C19140H5.f59832S0.getValue(), new Object[]{str}, c15688rMo18372i);
            C11795x0 c11795x0 = new C11795x0(0L, 0L, (C16318q) null, (C16316o) null, (C16317p) null, (AbstractC16308g) null, (String) null, 0L, (C18043a) null, (C18056n) null, (C17285d) null, 0L, C18051i.f56284c, (C0955R0) null, 61439);
            boolean z10 = (i11 & 896) == 256;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new InterfaceC11780q() { // from class: we.a
                    @Override // p580h1.InterfaceC11780q
                    /* JADX INFO: renamed from: a */
                    public final void mo6331a() {
                        function1.invoke();
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final C11752c c11752cM19503a = C17059v.m19503a(strM19467f, str, c11795x0, (InterfaceC11780q) objMo18389z);
            final String upperCase = C16973X.m19466e((C16972W) C19278b3.f60022w.getValue(), c15688rMo18372i, 0).toUpperCase(Locale.ROOT);
            C20671l.m25216a(function0, null, C18037u.m20404c(1517886570, new Function2() { // from class: we.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float f10 = 8;
                        InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7468a.m8487b(C0009h.m22a(C7481f.m8511d(aVar, f10), C4025f.m4709b(f10)), C3376c.f10945f, C0946M0.f3382a), f10);
                        C1982e.k kVar = C1982e.f6639c;
                        C18863f.a aVar2 = InterfaceC18861d.a.f58759m;
                        C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar2, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, interfaceC15676n2);
                        InterfaceC5799g.f19145s1.getClass();
                        C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar3);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, dVar);
                        InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, fVar);
                        InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i12))) {
                            C1961V0.m2622a(i12, interfaceC15676n2, i12, c21098a);
                        }
                        InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, eVar);
                        float f11 = 16;
                        InterfaceC7507e interfaceC7507eM8511d2 = C7481f.m8511d(aVar, f11);
                        C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar2, interfaceC15676n2, 0);
                        long jMo18375l2 = interfaceC15676n2.mo18375l();
                        int i13 = (int) (jMo18375l2 ^ (jMo18375l2 >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n2 = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8511d2, interfaceC15676n2);
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar3);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c2036xM2689a2, interfaceC15676n2, dVar);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n2, interfaceC15676n2, fVar);
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i13))) {
                            C1961V0.m2622a(i13, interfaceC15676n2, i13, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c2, interfaceC15676n2, eVar);
                        C11565Q2.m13480b(strM19466e, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10908c, interfaceC15676n2, 0, 0, 131070);
                        C1963W0.m2623a(C7482g.m8519d(aVar, f11), interfaceC15676n2);
                        C11565Q2.m13481c(c11752cM19503a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, C3374a.f10912g, interfaceC15676n2, 0, 0, 262142);
                        interfaceC15676n2.mo18381r();
                        C1963W0.m2623a(C7482g.m8519d(aVar, f11), interfaceC15676n2);
                        C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, interfaceC15676n2, 0);
                        long jMo18375l3 = interfaceC15676n2.mo18375l();
                        int i14 = (int) (jMo18375l3 ^ (jMo18375l3 >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n3 = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar, interfaceC15676n2);
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar3);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c1952q0M2608a, interfaceC15676n2, dVar);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n3, interfaceC15676n2, fVar);
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i14))) {
                            C1961V0.m2622a(i14, interfaceC15676n2, i14, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c3, interfaceC15676n2, eVar);
                        if (1.0f <= 0.0d) {
                            C2192a.m2845a("invalid weight; must be greater than zero");
                        }
                        C1963W0.m2623a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), interfaceC15676n2);
                        C11565Q2.m13480b(upperCase, C7481f.m8512e(C7503c.m8564a(aVar, C6138n1.f20157a, new C19069e.a(function0)), f10, 10), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10916k, C3376c.f10957r, 0L, new C16318q(500), null, 0L, null, 0L, null, null, 16777210), interfaceC15676n2, 0, 0, 131068);
                        interfaceC15676n2.mo18381r();
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, (i11 & 14) | 384, 2);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, function1, i10) { // from class: we.c

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f59470c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f59471d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C19069e.m21375a(this.f59469b, this.f59470c, this.f59471d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
