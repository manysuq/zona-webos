package p562fe;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8215k1;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mg.C17046i;
import p001A0.C0009h;
import p055D0.C0946M0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2008m1;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p270P.C4025f;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11565Q2;
import p579h0.C11658o0;
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
import p721og.C17363g;
import p830w0.InterfaceC18861d;
import p845wg.C19278b3;

/* JADX INFO: renamed from: fe.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCheckCodeByTvM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckCodeByTvM.kt\nru/zona/app/screens/auth/qr/mobile/CheckCodeByTvMKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,85:1\n87#2:86\n84#2,9:87\n94#2:184\n80#3,6:96\n87#3,3:111\n90#3,2:120\n80#3,6:140\n87#3,3:155\n90#3,2:164\n94#3:179\n94#3:183\n80#3,6:203\n87#3,3:218\n90#3,2:227\n94#3:232\n391#4,9:102\n400#4:122\n391#4,9:146\n400#4:166\n401#4,2:177\n401#4,2:181\n391#4,9:209\n400#4,3:229\n4360#5,6:114\n4360#5,6:158\n4360#5,6:221\n1282#6,6:123\n1282#6,6:170\n113#7:129\n113#7:130\n113#7:167\n113#7:168\n113#7:185\n113#7:186\n99#8:131\n97#8,8:132\n106#8:180\n2068#9:169\n2069#9:176\n15#10,7:187\n70#11:194\n68#11,8:195\n77#11:233\n85#12:234\n*S KotlinDebug\n*F\n+ 1 CheckCodeByTvM.kt\nru/zona/app/screens/auth/qr/mobile/CheckCodeByTvMKt\n*L\n31#1:86\n31#1:87,9\n31#1:184\n31#1:96,6\n31#1:111,3\n31#1:120,2\n44#1:140,6\n44#1:155,3\n44#1:164,2\n44#1:179\n31#1:183\n72#1:203,6\n72#1:218,3\n72#1:227,2\n72#1:232\n31#1:102,9\n31#1:122\n44#1:146,9\n44#1:166\n44#1:177,2\n31#1:181,2\n72#1:209,9\n72#1:229,3\n31#1:114,6\n44#1:158,6\n72#1:221,6\n37#1:123,6\n59#1:170,6\n40#1:129\n47#1:130\n52#1:167\n53#1:168\n74#1:185\n75#1:186\n44#1:131\n44#1:132,8\n44#1:180\n58#1:169\n58#1:176\n77#1:187,7\n72#1:194\n72#1:195,8\n72#1:233\n29#1:234\n*E\n"})
public final class C11143g {

    /* JADX INFO: renamed from: fe.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11144h) this.receiver).close();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m13157a(final InterfaceC11144h interfaceC11144h, InterfaceC15676n interfaceC15676n, final int i10) {
        InterfaceC15676n.a.C21235a c21235a;
        int i11;
        InterfaceC5799g.a.f fVar;
        InterfaceC5799g.a.C21098a c21098a;
        String str;
        InterfaceC15676n.a.C21235a c21235a2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-926319778);
        int i12 = (c15688rMo18372i.mo18362N(interfaceC11144h) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC11144h.mo13155a(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM2682b = C2008m1.m2682b(aVar);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM2682b, c15688rMo18372i);
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
            InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar2);
            InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a2);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            String strM19466e = C16973X.m19466e((C16972W) C19278b3.f60003m0.getValue(), c15688rMo18372i, 0);
            C4600a c4600aM5210e = C4601b.m5210e();
            int i14 = i12 & 14;
            boolean z10 = i14 == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a3 = InterfaceC15676n.a.f50781a;
            if (z10 || objMo18389z == c21235a3) {
                c21235a = c21235a3;
                i11 = i14;
                fVar = fVar2;
                c21098a = c21098a2;
                a aVar3 = new a(0, interfaceC11144h, InterfaceC11144h.class, "close", "close()V", 0);
                c15688rMo18372i.mo18380q(aVar3);
                objMo18389z = aVar3;
            } else {
                i11 = i14;
                fVar = fVar2;
                c21098a = c21098a2;
                c21235a = c21235a3;
            }
            C8215k1.m10147a(strM19466e, null, c4600aM5210e, null, null, false, (Function0) ((KFunction) objMo18389z), 0L, 0L, c15688rMo18372i, 0, 954);
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(aVar, 16);
            C16972W c16972w = (C16972W) C19278b3.f60005n0.getValue();
            C17363g c17363g = (C17363g) interfaceC15701v0M18246a.getValue();
            if (c17363g == null || (str = c17363g.f54356b) == null) {
                str = "";
            }
            C11565Q2.m13480b(C16973X.m19467f(c16972w, new Object[]{str}, c15688rMo18372i), interfaceC7507eM8511d, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10912g, c15688rMo18372i, 48, 0, 131068);
            c15688rMo18372i = c15688rMo18372i;
            InterfaceC7507e interfaceC7507eM8511d2 = C7481f.m8511d(C7482g.m8518c(aVar, 1.0f), 8);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6642f, InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j11 = c15688rMo18372i.f50813T;
            int i15 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8511d2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            C17363g c17363g2 = (C17363g) interfaceC15701v0M18246a.getValue();
            List<Integer> list = c17363g2 != null ? c17363g2.f54355a : null;
            if (list == null || list.isEmpty()) {
                c15688rMo18372i.mo18363O(-1439997899);
                C11658o0.m13516a(C7482g.m8525j(aVar, 24), C3376c.f10957r, 2, 0L, 0, 0.0f, c15688rMo18372i, 390, 56);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(false);
                Unit unit = Unit.INSTANCE;
            } else {
                c15688rMo18372i.mo18363O(-1439765368);
                C17363g c17363g3 = (C17363g) interfaceC15701v0M18246a.getValue();
                List<Integer> list2 = c17363g3 != null ? c17363g3.f54355a : null;
                if (list2 == null) {
                    c15688rMo18372i.mo18363O(-1439765369);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-1439765368);
                    c15688rMo18372i.mo18363O(-1986105503);
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        final int iIntValue = ((Number) it.next()).intValue();
                        String strValueOf = String.valueOf(iIntValue);
                        int i16 = i11;
                        boolean zMo18368e = c15688rMo18372i.mo18368e(iIntValue) | (i16 == 4);
                        Object objMo18389z2 = c15688rMo18372i.mo18389z();
                        if (zMo18368e) {
                            c21235a2 = c21235a;
                        } else {
                            c21235a2 = c21235a;
                            if (objMo18389z2 == c21235a2) {
                            }
                            m13158b(0, strValueOf, c15688rMo18372i, (Function0) objMo18389z2);
                            i11 = i16;
                            c21235a = c21235a2;
                        }
                        objMo18389z2 = new Function0() { // from class: fe.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                interfaceC11144h.mo13156b(iIntValue);
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z2);
                        m13158b(0, strValueOf, c15688rMo18372i, (Function0) objMo18389z2);
                        i11 = i16;
                        c21235a = c21235a2;
                    }
                    c15688rMo18372i.m18410W(false);
                    Unit unit2 = Unit.INSTANCE;
                    c15688rMo18372i.m18410W(false);
                }
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: fe.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11143g.m13157a(this.f34673b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13158b(final int i10, final String str, InterfaceC15676n interfaceC15676n, final Function0 function0) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-517352111);
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(C7468a.m8487b(C0009h.m22a(C7482g.m8525j(InterfaceC7507e.a.f24548b, 56), C4025f.m4709b(8)), C3376c.f10945f, C0946M0.f3382a), C6138n1.f20157a, new C17046i(function0));
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8564a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
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
            C11565Q2.m13480b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10909d, c15688rMo18372i, i11 & 14, 0, 131070);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, str, function0) { // from class: fe.f

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f34674b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f34675c;

                {
                    this.f34674b = str;
                    this.f34675c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C11143g.m13158b(C15636Z0.m18294a(1), this.f34674b, (InterfaceC15676n) obj, this.f34675c);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
