package p339Se;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import cf.C8457f;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p392Vd.EnumC5675f;
import p395Vg.C5705e;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p640jf.C15496Z;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;

/* JADX INFO: renamed from: Se.n */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPaymentMethods.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethods.kt\nru/zona/app/screens/profile/premium/price/compositions/PaymentMethodsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n113#2:117\n113#2:157\n113#2:169\n113#2:209\n87#3:118\n83#3,10:119\n94#3:168\n87#3:170\n83#3,10:171\n94#3:220\n80#4,6:129\n87#4,3:144\n90#4,2:153\n94#4:167\n80#4,6:181\n87#4,3:196\n90#4,2:205\n94#4:219\n391#5,9:135\n400#5:155\n401#5,2:165\n391#5,9:187\n400#5:207\n401#5,2:217\n4360#6,6:147\n4360#6,6:199\n2068#7:156\n2069#7:164\n2068#7:208\n2069#7:216\n1282#8,6:158\n1282#8,6:210\n*S KotlinDebug\n*F\n+ 1 PaymentMethods.kt\nru/zona/app/screens/profile/premium/price/compositions/PaymentMethodsKt\n*L\n46#1:117\n56#1:157\n91#1:169\n102#1:209\n45#1:118\n45#1:119,10\n45#1:168\n91#1:170\n91#1:171,10\n91#1:220\n45#1:129,6\n45#1:144,3\n45#1:153,2\n45#1:167\n91#1:181,6\n91#1:196,3\n91#1:205,2\n91#1:219\n45#1:135,9\n45#1:155\n45#1:165,2\n91#1:187,9\n91#1:207\n91#1:217,2\n45#1:147,6\n91#1:199,6\n52#1:156\n52#1:164\n99#1:208\n99#1:216\n61#1:158,6\n107#1:210,6\n*E\n"})
public final class C4921n {

    /* JADX INFO: renamed from: Se.n$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16427a;

        static {
            int[] iArr = new int[EnumC5675f.values().length];
            try {
                EnumC5675f enumC5675f = EnumC5675f.f18704b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC5675f enumC5675f2 = EnumC5675f.f18704b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC5675f enumC5675f3 = EnumC5675f.f18704b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16427a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX INFO: renamed from: a */
    public static final void m5511a(List<C5705e> list, boolean z10, EnumC5675f enumC5675f, Function0<Unit> function0, Function0<Unit> function1, final Function1<? super Long, Unit> function2, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        Object obj;
        C15688r c15688r2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-541184072);
        int i11 = i10 | (c15688rMo18372i.mo18362N(list) ? 4 : 2) | (c15688rMo18372i.mo18364a(z10) ? 32 : 16) | (c15688rMo18372i.mo18368e(enumC5675f == null ? -1 : enumC5675f.ordinal()) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT);
        if (c15688rMo18372i.mo18379p(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = enumC5675f != null ? a.f16427a[enumC5675f.ordinal()] : -1;
            if (i12 == 1) {
                C15688r c15688r3 = c15688rMo18372i;
                c15688r3.mo18363O(-386841005);
                C4916i.m5509a(function0, c15688r3, (i11 >> 9) & 14);
                c15688r3.m18410W(false);
                Unit unit = Unit.INSTANCE;
                c15688r = c15688r3;
            } else if (i12 == 2) {
                C15688r c15688r4 = c15688rMo18372i;
                c15688r4.mo18363O(-386839010);
                C4910c.m5506a(function1, c15688r4, (i11 >> 12) & 14);
                c15688r4.m18410W(false);
                Unit unit2 = Unit.INSTANCE;
                c15688r = c15688r4;
            } else if (i12 != 3) {
                c15688rMo18372i.mo18363O(894262408);
                c15688rMo18372i.m18410W(false);
                Unit unit3 = Unit.INSTANCE;
                c15688r = c15688rMo18372i;
            } else {
                c15688rMo18372i.mo18363O(893001948);
                C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(8), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
                long j10 = c15688rMo18372i.f50813T;
                int i13 = (int) (j10 ^ (j10 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, c15688rMo18372i);
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
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                    C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                boolean z11 = false;
                ?? r10 = 0;
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59642D.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10909d, c15688rMo18372i, 0, 0, 131070);
                C15688r c15688r5 = c15688rMo18372i;
                if (list == null) {
                    c15688r5.mo18363O(1839325905);
                    c15688r5.m18410W(false);
                    c15688r2 = c15688r5;
                } else {
                    c15688r5.mo18363O(1839325906);
                    for (final C5705e c5705e : list) {
                        if (c5705e == null) {
                            c15688r5.mo18363O(-1109290862);
                            c15688r5.m18410W(z11);
                        } else {
                            c15688r5.mo18363O(-1109290861);
                            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(aVar, "test_tag_payment_method_button");
                            float f10 = 16;
                            String str = c5705e.f18780b;
                            C11732N0 c11732n0M13585a = C11732N0.m13585a(C3374a.f10912g, 0L, 0L, null, null, 0L, null, C18580v.m21028b(18), null, null, 16646143);
                            String str2 = c5705e.f18781c;
                            C4600a c4600aM5206a = C4601b.m5206a();
                            boolean zMo18350B = ((458752 & i11) == 131072) | c15688r5.mo18350B(c5705e);
                            Object objMo18389z = c15688r5.mo18389z();
                            if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                                obj = objMo18389z;
                                Function0 function3 = new Function0() { // from class: Se.l
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(Long.valueOf(c5705e.f18779a));
                                        return Unit.INSTANCE;
                                    }
                                };
                                c15688r5.mo18380q(function3);
                                obj = function3;
                            }
                            obj = objMo18389z;
                            C15688r c15688r6 = c15688r5;
                            C8457f.m10341a(interfaceC7507eM8700a, str, c11732n0M13585a, str2, null, c4600aM5206a, (Function0) obj, f10, 0L, z10, false, c15688r6, ((i11 << 24) & 1879048192) | 12582918, 1296);
                            c15688r5 = c15688r6;
                            Unit unit4 = Unit.INSTANCE;
                            z11 = false;
                            c15688r5.m18410W(false);
                        }
                    }
                    c15688r5.m18410W(z11);
                    Unit unit5 = Unit.INSTANCE;
                    r10 = z11;
                    c15688r2 = c15688r5;
                }
                C15688r c15688r7 = c15688r2;
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59640C.getValue(), c15688r2, r10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10912g, C3376c.f10953n, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r7, 0, 0, 131070);
                C15688r c15688r8 = c15688r7;
                c15688r8.m18410W(true);
                c15688r8.m18410W(false);
                Unit unit6 = Unit.INSTANCE;
                c15688r = c15688r8;
            }
        } else {
            C15688r c15688r9 = c15688rMo18372i;
            c15688r9.mo18356H();
            c15688r = c15688r9;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C4920m(list, z10, enumC5675f, function0, function1, function2, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5512b(final List<C5705e> list, final boolean z10, final EnumC5675f enumC5675f, final Function0<Unit> function0, final Function0<Unit> function1, final Function1<? super Long, Unit> function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1781667185);
        int i11 = i10 | (c15688rMo18372i.mo18362N(list) ? 4 : 2) | (c15688rMo18372i.mo18364a(z10) ? 32 : 16) | (c15688rMo18372i.mo18368e(enumC5675f == null ? -1 : enumC5675f.ordinal()) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT);
        if (c15688rMo18372i.mo18379p(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = enumC5675f != null ? a.f16427a[enumC5675f.ordinal()] : -1;
            if (i12 == 1) {
                c15688r = c15688rMo18372i;
                c15688r.mo18363O(1509795723);
                C4916i.m5510b(function0, c15688r, (i11 >> 9) & 14);
                c15688r.m18410W(false);
                Unit unit = Unit.INSTANCE;
            } else if (i12 == 2) {
                c15688r = c15688rMo18372i;
                c15688r.mo18363O(1509797750);
                C4910c.m5507b(function1, c15688r, (i11 >> 12) & 14);
                c15688r.m18410W(false);
                Unit unit2 = Unit.INSTANCE;
            } else if (i12 != 3) {
                c15688rMo18372i.mo18363O(-439732655);
                c15688rMo18372i.m18410W(false);
                Unit unit3 = Unit.INSTANCE;
                c15688r = c15688rMo18372i;
            } else {
                c15688rMo18372i.mo18363O(-440805720);
                C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(8), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
                long j10 = c15688rMo18372i.f50813T;
                int i13 = (int) (j10 ^ (j10 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, c15688rMo18372i);
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
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                    C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59642D.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10921d, 0L, C18580v.m21028b(24), new C16318q(900), null, 0L, null, 0L, null, null, 16777209), c15688rMo18372i, 0, 0, 131070);
                c15688r = c15688rMo18372i;
                if (list == null) {
                    c15688r.mo18363O(-1162450440);
                    c15688r.m18410W(false);
                } else {
                    c15688r.mo18363O(-1162450439);
                    for (C5705e c5705e : list) {
                        if (c5705e == null) {
                            c15688r.mo18363O(1924248695);
                            c15688r.m18410W(false);
                        } else {
                            c15688r.mo18363O(1924248696);
                            InterfaceC7507e interfaceC7507eM8529n = C7482g.m8529n(aVar, 341);
                            String str = c5705e.f18780b;
                            C11732N0 c11732n0M13585a = C11732N0.m13585a(C3375b.f10922e, 0L, 0L, new C16318q(700), null, 0L, null, 0L, null, null, 16777211);
                            String str2 = c5705e.f18781c;
                            C4600a c4600aM5206a = C4601b.m5206a();
                            boolean zMo18350B = ((458752 & i11) == 131072) | c15688r.mo18350B(c5705e);
                            Object objMo18389z = c15688r.mo18389z();
                            if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                                objMo18389z = new C4917j(function2, c5705e, 0);
                                c15688r.mo18380q(objMo18389z);
                            }
                            C15688r c15688r2 = c15688r;
                            C15496Z.m18124a(interfaceC7507eM8529n, str, 0L, c11732n0M13585a, str2, null, 0L, null, c4600aM5206a, (Function0) objMo18389z, z10, c15688r2, 6, (i11 >> 3) & 14, 228);
                            c15688r = c15688r2;
                            Unit unit4 = Unit.INSTANCE;
                            c15688r.m18410W(false);
                        }
                    }
                    c15688r.m18410W(false);
                    Unit unit5 = Unit.INSTANCE;
                }
                c15688r.m18410W(true);
                c15688r.m18410W(false);
                Unit unit6 = Unit.INSTANCE;
            }
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(list, z10, enumC5675f, function0, function1, function2, i10) { // from class: Se.k

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f16412b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f16413c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ EnumC5675f f16414d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f16415e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f16416f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function1 f16417g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C4921n.m5512b(this.f16412b, this.f16413c, this.f16414d, this.f16415e, this.f16416f, this.f16417g, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
