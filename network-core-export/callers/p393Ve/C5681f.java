package p393Ve;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7512c;
import bf.C8194d1;
import bf.C8215k1;
import bf.C8245x0;
import cf.C8460i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mg.C17048k;
import p019B0.C0173B;
import p055D0.C0946M0;
import p126H.C1982e;
import p126H.C2008m1;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p230Md.InterfaceC3547a;
import p233Mg.C3573k;
import p288Q.C4286K0;
import p288Q.C4421q1;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
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
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p844we.C19069e;
import p845wg.C19140H5;
import p845wg.C19285c2;
import p881z.C20541F0;

/* JADX INFO: renamed from: Ve.f */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nReportContentPageM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportContentPageM.kt\nru/zona/app/screens/report/ReportContentPageMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,136:1\n1282#2,6:137\n1282#2,6:143\n1282#2,6:149\n1282#2,6:232\n1282#2,6:240\n1282#2,6:246\n1282#2,6:252\n1282#2,6:258\n1282#2,6:264\n1282#2,6:270\n1282#2,6:284\n87#3:155\n84#3,9:156\n87#3:194\n85#3,8:195\n94#3:279\n94#3:283\n80#4,6:165\n87#4,3:180\n90#4,2:189\n80#4,6:203\n87#4,3:218\n90#4,2:227\n94#4:278\n94#4:282\n391#5,9:171\n400#5:191\n391#5,9:209\n400#5:229\n401#5,2:276\n401#5,2:280\n4360#6,6:183\n4360#6,6:221\n113#7:192\n113#7:193\n113#7:230\n113#7:239\n2068#8:231\n2069#8:238\n85#9:290\n85#9:291\n85#9:292\n117#9,2:293\n*S KotlinDebug\n*F\n+ 1 ReportContentPageM.kt\nru/zona/app/screens/report/ReportContentPageMKt\n*L\n50#1:137,6\n51#1:143,6\n52#1:149,6\n81#1:232,6\n94#1:240,6\n97#1:246,6\n101#1:252,6\n109#1:258,6\n114#1:264,6\n121#1:270,6\n132#1:284,6\n54#1:155\n54#1:156,9\n65#1:194\n65#1:195,8\n65#1:279\n54#1:283\n54#1:165,6\n54#1:180,3\n54#1:189,2\n65#1:203,6\n65#1:218,3\n65#1:227,2\n65#1:278\n54#1:282\n54#1:171,9\n54#1:191\n65#1:209,9\n65#1:229\n65#1:276,2\n54#1:280,2\n54#1:183,6\n65#1:221,6\n68#1:192\n69#1:193\n72#1:230\n92#1:239\n77#1:231\n77#1:238\n47#1:290\n48#1:291\n50#1:292\n50#1:293,2\n*E\n"})
public final class C5681f {

    /* JADX INFO: renamed from: Ve.f$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            ((InterfaceC3547a) this.receiver).setDescription(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ve.f$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            ((InterfaceC3547a) this.receiver).mo4312d(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ve.f$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3547a) this.receiver).mo4318j();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ve.f$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3547a) this.receiver).mo4317i();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0385  */
    /* JADX WARN: Code duplicated, block: B:102:0x0387  */
    /* JADX WARN: Code duplicated, block: B:106:0x0390  */
    /* JADX WARN: Code duplicated, block: B:111:0x0404  */
    /* JADX WARN: Code duplicated, block: B:113:0x0414  */
    /* JADX WARN: Code duplicated, block: B:114:0x0421  */
    /* JADX WARN: Code duplicated, block: B:116:0x042d  */
    /* JADX WARN: Code duplicated, block: B:117:0x042f  */
    /* JADX WARN: Code duplicated, block: B:123:0x043d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0462  */
    /* JADX WARN: Code duplicated, block: B:34:0x014b  */
    /* JADX WARN: Code duplicated, block: B:35:0x014f  */
    /* JADX WARN: Code duplicated, block: B:40:0x016a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0180  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x01df  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0237  */
    /* JADX WARN: Code duplicated, block: B:61:0x0239  */
    /* JADX WARN: Code duplicated, block: B:67:0x0245  */
    /* JADX WARN: Code duplicated, block: B:70:0x0257  */
    /* JADX WARN: Code duplicated, block: B:71:0x0259  */
    /* JADX WARN: Code duplicated, block: B:77:0x026c  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0331  */
    /* JADX WARN: Code duplicated, block: B:94:0x0333  */
    /* JADX WARN: Code duplicated, block: B:98:0x033c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m6330a(final InterfaceC3547a interfaceC3547a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        int i11;
        C0173B c0173b;
        int i12;
        String str;
        C15688r c15688r2;
        int i13;
        boolean z10;
        Object objMo18389z;
        boolean z11;
        Object objMo18389z2;
        int i14;
        Object objMo18389z3;
        C15688r c15688r3;
        boolean z12;
        Object objMo18389z4;
        int i15;
        int i16;
        int i17;
        final InterfaceC3547a interfaceC3547a2;
        boolean z13;
        Object objMo18389z5;
        boolean z14;
        Object objMo18389z6;
        String str2;
        boolean z15;
        Object objMo18389z7;
        boolean z16;
        boolean z17;
        boolean zMo18350B;
        Object objMo18389z8;
        final C0173B c0173b2;
        final InterfaceC3547a interfaceC3547a3 = interfaceC3547a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-567664395);
        int i18 = i10 | (c15688rMo18372i.mo18362N(interfaceC3547a3) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i18 & 1, (i18 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC3547a3.getState(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC3547a3.mo4313e(), c15688rMo18372i, 0);
            Object objMo18389z9 = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z9 == c21235a) {
                objMo18389z9 = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z9);
            }
            Object objMo18389z10 = c15688rMo18372i.mo18389z();
            if (objMo18389z10 == c21235a) {
                objMo18389z10 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b3 = (C0173B) objMo18389z10;
            Object objMo18389z11 = c15688rMo18372i.mo18389z();
            if (objMo18389z11 == c21235a) {
                objMo18389z11 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b4 = (C0173B) objMo18389z11;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM2682b = C2008m1.m2682b(C2008m1.m2681a(C7468a.m8487b(C7482g.m8517b(aVar, 1.0f), C3376c.f10940a, C0946M0.f3382a)));
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar2 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i19 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM2682b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                i11 = i18;
            } else {
                i11 = i18;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i19))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                c0173b = c0173b3;
                C8215k1.m10147a(C16973X.m19466e((C16972W) C19140H5.f59877r.getValue(), c15688rMo18372i, 0), interfaceC3547a3.mo4309a(), null, null, null, false, null, 0L, 0L, c15688rMo18372i, 0, 1020);
                InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C20541F0.m25139c(aVar, C20541F0.m25137a(c15688rMo18372i), 14), 16);
                float f10 = 8;
                C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.m2645g(f10), aVar2, c15688rMo18372i, 6);
                long j11 = c15688rMo18372i.f50813T;
                i12 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar3);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                    C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(aVar, 0.0f, f10, 1);
                str = ((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11649a;
                if (str == null) {
                    str = "";
                }
                C11565Q2.m13480b(str, interfaceC7507eM8513f, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10912g, c15688rMo18372i, 48, 0, 131068);
                c15688r2 = c15688rMo18372i;
                c15688r2.mo18363O(-79324218);
                for (final C3573k c3573k : ((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11650b) {
                    String str3 = c3573k.f11733b;
                    boolean zAreEqual = Intrinsics.areEqual(((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11651c, c3573k);
                    if ((i11 & 14) != 4) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    zMo18350B = z17 | c15688r2.mo18350B(c3573k);
                    objMo18389z8 = c15688r2.mo18389z();
                    if (!zMo18350B || objMo18389z8 == c21235a) {
                        c0173b2 = c0173b;
                        objMo18389z8 = new Function0() { // from class: Ve.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                InterfaceC3547a interfaceC3547a4 = interfaceC3547a;
                                C3573k c3573k2 = c3573k;
                                interfaceC3547a4.mo4314f(c3573k2);
                                if (Intrinsics.areEqual(c3573k2, interfaceC3547a4.mo4315g())) {
                                    C0173B.m230b(c0173b2);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r2.mo18380q(objMo18389z8);
                    } else {
                        c0173b2 = c0173b;
                    }
                    C15688r c15688r4 = c15688r2;
                    c0173b = c0173b2;
                    C8460i.m10342a(null, str3, zAreEqual, (Function0) objMo18389z8, 0.0f, 0.0f, 0L, 0L, null, null, c15688r4, 0, 1009);
                    c15688r2 = c15688r4;
                }
                c15688r2.m18410W(false);
                InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(C7482g.m8521f(aVar, 136, 0.0f, 2), c0173b);
                i13 = i11 & 14;
                if (i13 != 4) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                objMo18389z = c15688r2.mo18389z();
                if (z10 || objMo18389z == c21235a) {
                    objMo18389z = new C5677b(interfaceC3547a, 0);
                    c15688r2.mo18380q(objMo18389z);
                }
                InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8578a, (Function1) objMo18389z);
                if (i13 != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                objMo18389z2 = c15688r2.mo18389z();
                if (!z11 || objMo18389z2 == c21235a) {
                    i14 = 0;
                    a aVar4 = new a(1, interfaceC3547a, InterfaceC3547a.class, "setDescription", "setDescription(Ljava/lang/String;)V", 0);
                    c15688r2.mo18380q(aVar4);
                    objMo18389z2 = aVar4;
                } else {
                    i14 = 0;
                }
                KFunction kFunction = (KFunction) objMo18389z2;
                String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59885v.getValue(), c15688r2, i14);
                String strM19495a = C17048k.m19495a(interfaceC3547a.getDescription());
                objMo18389z3 = c15688r2.mo18389z();
                if (objMo18389z3 == r2) {
                    objMo18389z3 = new Function1() { // from class: Ve.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            C0173B.m230b(c0173b4);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(objMo18389z3);
                }
                c15688r3 = c15688r2;
                C8194d1.m10143a(null, interfaceC7507eM8576a, (Function1) kFunction, strM19466e, strM19495a, false, false, false, new C4421q1(null, null, (Function1) objMo18389z3, null, 59), 6, null, null, null, c15688r3, 806879232, 7329);
                InterfaceC7507e interfaceC7507eM8578a2 = C7512c.m8578a(aVar, r36);
                if (i13 != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                objMo18389z4 = c15688r3.mo18389z();
                if (!z12 || objMo18389z4 == c21235a) {
                    i15 = i13;
                    i16 = 4;
                    i17 = 0;
                    interfaceC3547a2 = interfaceC3547a;
                    objMo18389z4 = new b(1, interfaceC3547a2, InterfaceC3547a.class, "setEmail", "setEmail(Ljava/lang/String;)V", 0);
                    c15688r3.mo18380q(objMo18389z4);
                } else {
                    i16 = 4;
                    i17 = 0;
                    i15 = i13;
                    interfaceC3547a2 = interfaceC3547a;
                }
                Function1 function1 = (Function1) ((KFunction) objMo18389z4);
                String strM19466e2 = C16973X.m19466e((C16972W) C19285c2.f60045H0.getValue(), c15688r3, i17);
                String strM19495a2 = C17048k.m19495a(interfaceC3547a2.mo4311c());
                if (i15 != i16) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                objMo18389z5 = c15688r3.mo18389z();
                if (z13 || objMo18389z5 == c21235a) {
                    objMo18389z5 = new Function1() { // from class: Ve.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            interfaceC3547a2.mo4318j();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r3.mo18380q(objMo18389z5);
                }
                C8194d1.m10143a(null, interfaceC7507eM8578a2, function1, strM19466e2, strM19495a2, false, false, false, new C4421q1(null, null, null, (Function1) objMo18389z5, 31), 4, null, null, null, c15688r3, 817889280, 7265);
                String strM19466e3 = C16973X.m19466e((C16972W) C19140H5.f59841Y.getValue(), c15688r3, 0);
                if (i15 != 4) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                objMo18389z6 = c15688r3.mo18389z();
                if (z14 || objMo18389z6 == r2) {
                    c cVar = new c(0, interfaceC3547a2, InterfaceC3547a.class, "sendReport", "sendReport()V", 0);
                    c15688r3.mo18380q(cVar);
                    objMo18389z6 = cVar;
                }
                C8245x0.m10154a(null, (Function0) ((KFunction) objMo18389z6), strM19466e3, null, null, false, ((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11652d, ((Boolean) interfaceC15701v0M18246a2.getValue()).booleanValue(), 0L, 0L, null, 0.0f, 0.0f, false, c15688r3, 0, 0, 16185);
                c15688r = c15688r3;
                c15688r.m18410W(true);
                c15688r.m18410W(true);
                if (Intrinsics.areEqual(((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11653e, Boolean.TRUE)) {
                    c15688r.mo18363O(-64536257);
                    str2 = ((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11654f;
                    if (str2 == null) {
                        c15688r.mo18363O(-2000623966);
                        c15688r.m18410W(false);
                        z16 = false;
                        interfaceC3547a3 = interfaceC3547a;
                    } else {
                        c15688r.mo18363O(-2000623965);
                        Function0<Unit> function0Mo4309a = interfaceC3547a.mo4309a();
                        if (i15 != 4) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        objMo18389z7 = c15688r.mo18389z();
                        if (!z15 || objMo18389z7 == r2) {
                            z16 = false;
                            interfaceC3547a3 = interfaceC3547a;
                            objMo18389z7 = new d(0, interfaceC3547a3, InterfaceC3547a.class, "openEmail", "openEmail()V", 0);
                            c15688r.mo18380q(objMo18389z7);
                        } else {
                            z16 = false;
                            interfaceC3547a3 = interfaceC3547a;
                        }
                        C19069e.m21375a(function0Mo4309a, str2, (Function0) ((KFunction) objMo18389z7), c15688r, z16 ? 1 : 0);
                        Unit unit = Unit.INSTANCE;
                        c15688r.m18410W(z16);
                    }
                    c15688r.m18410W(z16);
                } else {
                    interfaceC3547a3 = interfaceC3547a;
                    c15688r.mo18363O(-2000423891);
                    c15688r.m18410W(false);
                }
            }
            C12269M6.m14188a(i19, c15688rMo18372i, i19, c21098a);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            c0173b = c0173b3;
            C8215k1.m10147a(C16973X.m19466e((C16972W) C19140H5.f59877r.getValue(), c15688rMo18372i, 0), interfaceC3547a3.mo4309a(), null, null, null, false, null, 0L, 0L, c15688rMo18372i, 0, 1020);
            InterfaceC7507e interfaceC7507eM8511d2 = C7481f.m8511d(C20541F0.m25139c(aVar, C20541F0.m25137a(c15688rMo18372i), 14), 16);
            float f11 = 8;
            C2036x c2036xM2689a3 = C2032v.m2689a(C1982e.m2645g(f11), aVar2, c15688rMo18372i, 6);
            long j12 = c15688rMo18372i.f50813T;
            i12 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8511d2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a3, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            } else {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar2);
            InterfaceC7507e interfaceC7507eM8513f2 = C7481f.m8513f(aVar, 0.0f, f11, 1);
            str = ((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11649a;
            if (str == null) {
                str = "";
            }
            C11565Q2.m13480b(str, interfaceC7507eM8513f2, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10912g, c15688rMo18372i, 48, 0, 131068);
            c15688r2 = c15688rMo18372i;
            c15688r2.mo18363O(-79324218);
            while (r3.hasNext()) {
                String str4 = c3573k.f11733b;
                boolean zAreEqual2 = Intrinsics.areEqual(((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11651c, c3573k);
                if ((i11 & 14) != 4) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                zMo18350B = z17 | c15688r2.mo18350B(c3573k);
                objMo18389z8 = c15688r2.mo18389z();
                if (zMo18350B) {
                    c0173b2 = c0173b;
                    objMo18389z8 = new Function0() { // from class: Ve.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC3547a interfaceC3547a4 = interfaceC3547a;
                            C3573k c3573k2 = c3573k;
                            interfaceC3547a4.mo4314f(c3573k2);
                            if (Intrinsics.areEqual(c3573k2, interfaceC3547a4.mo4315g())) {
                                C0173B.m230b(c0173b2);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(objMo18389z8);
                } else {
                    c0173b2 = c0173b;
                    objMo18389z8 = new Function0() { // from class: Ve.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC3547a interfaceC3547a4 = interfaceC3547a;
                            C3573k c3573k2 = c3573k;
                            interfaceC3547a4.mo4314f(c3573k2);
                            if (Intrinsics.areEqual(c3573k2, interfaceC3547a4.mo4315g())) {
                                C0173B.m230b(c0173b2);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(objMo18389z8);
                }
                C15688r c15688r5 = c15688r2;
                c0173b = c0173b2;
                C8460i.m10342a(null, str4, zAreEqual2, (Function0) objMo18389z8, 0.0f, 0.0f, 0L, 0L, null, null, c15688r5, 0, 1009);
                c15688r2 = c15688r5;
            }
            c15688r2.m18410W(false);
            InterfaceC7507e interfaceC7507eM8578a3 = C7512c.m8578a(C7482g.m8521f(aVar, 136, 0.0f, 2), c0173b);
            i13 = i11 & 14;
            if (i13 != 4) {
                z10 = false;
            } else {
                z10 = true;
            }
            objMo18389z = c15688r2.mo18389z();
            if (z10) {
                objMo18389z = new C5677b(interfaceC3547a, 0);
                c15688r2.mo18380q(objMo18389z);
            } else {
                objMo18389z = new C5677b(interfaceC3547a, 0);
                c15688r2.mo18380q(objMo18389z);
            }
            InterfaceC7507e interfaceC7507eM8576a2 = C7510a.m8576a(interfaceC7507eM8578a3, (Function1) objMo18389z);
            if (i13 != 4) {
                z11 = false;
            } else {
                z11 = true;
            }
            objMo18389z2 = c15688r2.mo18389z();
            if (z11) {
                i14 = 0;
                a aVar5 = new a(1, interfaceC3547a, InterfaceC3547a.class, "setDescription", "setDescription(Ljava/lang/String;)V", 0);
                c15688r2.mo18380q(aVar5);
                objMo18389z2 = aVar5;
            } else {
                i14 = 0;
                a aVar6 = new a(1, interfaceC3547a, InterfaceC3547a.class, "setDescription", "setDescription(Ljava/lang/String;)V", 0);
                c15688r2.mo18380q(aVar6);
                objMo18389z2 = aVar6;
            }
            KFunction kFunction2 = (KFunction) objMo18389z2;
            String strM19466e4 = C16973X.m19466e((C16972W) C19140H5.f59885v.getValue(), c15688r2, i14);
            String strM19495a3 = C17048k.m19495a(interfaceC3547a.getDescription());
            objMo18389z3 = c15688r2.mo18389z();
            if (objMo18389z3 == r2) {
                objMo18389z3 = new Function1() { // from class: Ve.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C0173B.m230b(c0173b4);
                        return Unit.INSTANCE;
                    }
                };
                c15688r2.mo18380q(objMo18389z3);
            }
            c15688r3 = c15688r2;
            C8194d1.m10143a(null, interfaceC7507eM8576a2, (Function1) kFunction2, strM19466e4, strM19495a3, false, false, false, new C4421q1(null, null, (Function1) objMo18389z3, null, 59), 6, null, null, null, c15688r3, 806879232, 7329);
            InterfaceC7507e interfaceC7507eM8578a4 = C7512c.m8578a(aVar, r36);
            if (i13 != 4) {
                z12 = false;
            } else {
                z12 = true;
            }
            objMo18389z4 = c15688r3.mo18389z();
            if (z12) {
                i15 = i13;
                i16 = 4;
                i17 = 0;
                interfaceC3547a2 = interfaceC3547a;
                objMo18389z4 = new b(1, interfaceC3547a2, InterfaceC3547a.class, "setEmail", "setEmail(Ljava/lang/String;)V", 0);
                c15688r3.mo18380q(objMo18389z4);
            } else {
                i15 = i13;
                i16 = 4;
                i17 = 0;
                interfaceC3547a2 = interfaceC3547a;
                objMo18389z4 = new b(1, interfaceC3547a2, InterfaceC3547a.class, "setEmail", "setEmail(Ljava/lang/String;)V", 0);
                c15688r3.mo18380q(objMo18389z4);
            }
            Function1 function2 = (Function1) ((KFunction) objMo18389z4);
            String strM19466e5 = C16973X.m19466e((C16972W) C19285c2.f60045H0.getValue(), c15688r3, i17);
            String strM19495a4 = C17048k.m19495a(interfaceC3547a2.mo4311c());
            if (i15 != i16) {
                z13 = false;
            } else {
                z13 = true;
            }
            objMo18389z5 = c15688r3.mo18389z();
            if (z13) {
                objMo18389z5 = new Function1() { // from class: Ve.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC3547a2.mo4318j();
                        return Unit.INSTANCE;
                    }
                };
                c15688r3.mo18380q(objMo18389z5);
            } else {
                objMo18389z5 = new Function1() { // from class: Ve.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC3547a2.mo4318j();
                        return Unit.INSTANCE;
                    }
                };
                c15688r3.mo18380q(objMo18389z5);
            }
            C8194d1.m10143a(null, interfaceC7507eM8578a4, function2, strM19466e5, strM19495a4, false, false, false, new C4421q1(null, null, null, (Function1) objMo18389z5, 31), 4, null, null, null, c15688r3, 817889280, 7265);
            String strM19466e6 = C16973X.m19466e((C16972W) C19140H5.f59841Y.getValue(), c15688r3, 0);
            if (i15 != 4) {
                z14 = false;
            } else {
                z14 = true;
            }
            objMo18389z6 = c15688r3.mo18389z();
            if (z14) {
                c cVar2 = new c(0, interfaceC3547a2, InterfaceC3547a.class, "sendReport", "sendReport()V", 0);
                c15688r3.mo18380q(cVar2);
                objMo18389z6 = cVar2;
            } else {
                c cVar3 = new c(0, interfaceC3547a2, InterfaceC3547a.class, "sendReport", "sendReport()V", 0);
                c15688r3.mo18380q(cVar3);
                objMo18389z6 = cVar3;
            }
            C8245x0.m10154a(null, (Function0) ((KFunction) objMo18389z6), strM19466e6, null, null, false, ((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11652d, ((Boolean) interfaceC15701v0M18246a2.getValue()).booleanValue(), 0L, 0L, null, 0.0f, 0.0f, false, c15688r3, 0, 0, 16185);
            c15688r = c15688r3;
            c15688r.m18410W(true);
            c15688r.m18410W(true);
            if (Intrinsics.areEqual(((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11653e, Boolean.TRUE)) {
                c15688r.mo18363O(-64536257);
                str2 = ((InterfaceC3547a.a) interfaceC15701v0M18246a.getValue()).f11654f;
                if (str2 == null) {
                    c15688r.mo18363O(-2000623966);
                    c15688r.m18410W(false);
                    z16 = false;
                    interfaceC3547a3 = interfaceC3547a;
                } else {
                    c15688r.mo18363O(-2000623965);
                    Function0<Unit> function0Mo4309a2 = interfaceC3547a.mo4309a();
                    if (i15 != 4) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    objMo18389z7 = c15688r.mo18389z();
                    if (z15) {
                        z16 = false;
                        interfaceC3547a3 = interfaceC3547a;
                        objMo18389z7 = new d(0, interfaceC3547a3, InterfaceC3547a.class, "openEmail", "openEmail()V", 0);
                        c15688r.mo18380q(objMo18389z7);
                    } else {
                        z16 = false;
                        interfaceC3547a3 = interfaceC3547a;
                        objMo18389z7 = new d(0, interfaceC3547a3, InterfaceC3547a.class, "openEmail", "openEmail()V", 0);
                        c15688r.mo18380q(objMo18389z7);
                    }
                    C19069e.m21375a(function0Mo4309a2, str2, (Function0) ((KFunction) objMo18389z7), c15688r, z16 ? 1 : 0);
                    Unit unit2 = Unit.INSTANCE;
                    c15688r.m18410W(z16);
                }
                c15688r.m18410W(z16);
            } else {
                interfaceC3547a3 = interfaceC3547a;
                c15688r.mo18363O(-2000423891);
                c15688r.m18410W(false);
            }
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ve.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5681f.m6330a(this.f18716b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
