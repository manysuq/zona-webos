package p430Xf;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8136C;
import bf.C8245x0;
import cf.C8457f;
import ch.C8484c;
import ch.C8485d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p002A1.C0021a;
import p016Af.C0136e;
import p016Af.InterfaceC0135d;
import p055D0.C0946M0;
import p086Ed.InterfaceC1380a;
import p114G5.AbstractC1714b;
import p125Gg.EnumC1914v;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2008m1;
import p126H.C2032v;
import p126H.C2036x;
import p140Hd.InterfaceC2141a;
import p163J0.C2431d;
import p168J5.C2468d;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p270P.C4024e;
import p270P.C4025f;
import p285Pe.C4231b;
import p294Q5.C4555a;
import p303Qe.C4595c;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p359Tg.C5167i;
import p359Tg.InterfaceC5166h;
import p361U0.InterfaceC5178F;
import p395Vg.C5704d;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p446Yd.InterfaceC6570b;
import p480ah.InterfaceC7359e;
import p480ah.InterfaceC7360f;
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
import p689mb.C16999t;
import p817v1.C18566h;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19097C0;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19142I0;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20541F0;

/* JADX INFO: renamed from: Xf.q */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainProfileScreenM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainProfileScreenM.kt\nru/zona/app/ui/profile/MainProfileScreenMKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,349:1\n87#2:350\n84#2,9:351\n87#2:388\n84#2,9:389\n94#2:445\n94#2:449\n87#2:496\n83#2,10:497\n94#2:539\n87#2:540\n84#2,9:541\n94#2:583\n87#2:585\n85#2,8:586\n94#2:648\n87#2:652\n85#2,8:653\n94#2:747\n80#3,6:360\n87#3,3:375\n90#3,2:384\n80#3,6:398\n87#3,3:413\n90#3,2:422\n94#3:444\n94#3:448\n80#3,6:465\n87#3,3:480\n90#3,2:489\n94#3:494\n80#3,6:507\n87#3,3:522\n90#3,2:531\n94#3:538\n80#3,6:550\n87#3,3:565\n90#3,2:574\n94#3:582\n80#3,6:594\n87#3,3:609\n90#3,2:618\n94#3:647\n80#3,6:661\n87#3,3:676\n90#3,2:685\n80#3,6:699\n87#3,3:714\n90#3,2:723\n94#3:730\n94#3:746\n391#4,9:366\n400#4:386\n391#4,9:404\n400#4:424\n401#4,2:442\n401#4,2:446\n391#4,9:471\n400#4,3:491\n391#4,9:513\n400#4:533\n401#4,2:536\n391#4,9:556\n400#4:576\n401#4,2:580\n391#4,9:600\n400#4:620\n401#4,2:645\n391#4,9:667\n400#4:687\n391#4,9:705\n400#4:725\n401#4,2:728\n401#4,2:744\n4360#5,6:378\n4360#5,6:416\n4360#5,6:483\n4360#5,6:525\n4360#5,6:568\n4360#5,6:612\n4360#5,6:679\n4360#5,6:717\n113#6:387\n113#6:425\n113#6:432\n113#6:439\n113#6:440\n113#6:441\n113#6:450\n113#6:451\n113#6:452\n113#6:453\n113#6:454\n113#6:534\n113#6:535\n113#6:577\n113#6:578\n113#6:579\n113#6:584\n113#6:649\n113#6:650\n113#6:651\n113#6:726\n113#6:727\n1282#7,6:426\n1282#7,6:433\n1282#7,6:621\n1282#7,6:627\n1282#7,6:633\n1282#7,6:639\n1282#7,6:732\n1282#7,6:738\n70#8:455\n67#8,9:456\n77#8:495\n99#9:688\n95#9,10:689\n106#9:731\n85#10:748\n85#10:749\n85#10:750\n85#10:751\n85#10:752\n*S KotlinDebug\n*F\n+ 1 MainProfileScreenM.kt\nru/zona/app/ui/profile/MainProfileScreenMKt\n*L\n85#1:350\n85#1:351,9\n96#1:388\n96#1:389,9\n96#1:445\n85#1:449\n175#1:496\n175#1:497,10\n175#1:539\n208#1:540\n208#1:541,9\n208#1:583\n252#1:585\n252#1:586,8\n252#1:648\n308#1:652\n308#1:653,8\n308#1:747\n85#1:360,6\n85#1:375,3\n85#1:384,2\n96#1:398,6\n96#1:413,3\n96#1:422,2\n96#1:444\n85#1:448\n146#1:465,6\n146#1:480,3\n146#1:489,2\n146#1:494\n175#1:507,6\n175#1:522,3\n175#1:531,2\n175#1:538\n208#1:550,6\n208#1:565,3\n208#1:574,2\n208#1:582\n252#1:594,6\n252#1:609,3\n252#1:618,2\n252#1:647\n308#1:661,6\n308#1:676,3\n308#1:685,2\n315#1:699,6\n315#1:714,3\n315#1:723,2\n315#1:730\n308#1:746\n85#1:366,9\n85#1:386\n96#1:404,9\n96#1:424\n96#1:442,2\n85#1:446,2\n146#1:471,9\n146#1:491,3\n175#1:513,9\n175#1:533\n175#1:536,2\n208#1:556,9\n208#1:576\n208#1:580,2\n252#1:600,9\n252#1:620\n252#1:645,2\n308#1:667,9\n308#1:687\n315#1:705,9\n315#1:725\n315#1:728,2\n308#1:744,2\n85#1:378,6\n96#1:416,6\n146#1:483,6\n175#1:525,6\n208#1:568,6\n252#1:612,6\n308#1:679,6\n315#1:717,6\n99#1:387\n102#1:425\n108#1:432\n116#1:439\n120#1:440\n129#1:441\n151#1:450\n152#1:451\n153#1:452\n154#1:453\n158#1:454\n184#1:534\n191#1:535\n215#1:577\n218#1:578\n236#1:579\n256#1:584\n310#1:649\n312#1:650\n313#1:651\n317#1:726\n323#1:727\n104#1:426,6\n110#1:433,6\n277#1:621,6\n284#1:627,6\n291#1:633,6\n298#1:639,6\n338#1:732,6\n343#1:738,6\n146#1:455\n146#1:456,9\n146#1:495\n315#1:688\n315#1:689,10\n315#1:731\n81#1:748\n82#1:749\n83#1:750\n133#1:751\n251#1:752\n*E\n"})
public final class C6346q {

    /* JADX INFO: renamed from: Xf.q$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC0135d) this.receiver).mo199e();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public static final void m7123a(final C8484c c8484c, final boolean z10, Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        final Function0<Unit> function1;
        C15688r c15688r;
        ?? r10;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1440904084);
        int i11 = (c15688rMo18372i.mo18350B(c8484c) ? 4 : 2) | i10 | (c15688rMo18372i.mo18364a(z10) ? 32 : 16);
        if ((i10 & 384) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i12 = i11;
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 147) != 146)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7482g.m8518c(aVar, 1.0f), "test_tag_active_profile");
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58760n, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) ((j10 >>> 32) ^ j10);
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, c15688rMo18372i);
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
            float f10 = 56;
            int i14 = i12 & 14;
            C6329G.m7122a(c8484c, z10, C18566h.m20999a(f10, f10), c15688rMo18372i, i14 | 384 | (i12 & 112), 0);
            float f11 = 16;
            C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688rMo18372i);
            C4231b.m4954a(c8484c, c15688rMo18372i, i14);
            if (c8484c.f29040e) {
                r10 = 0;
                c15688rMo18372i.mo18363O(-374584148);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-374769621);
                r10 = 0;
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60091g0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10916k, C3376c.f10955p, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i.m18410W(false);
            }
            if (z10) {
                c15688rMo18372i.mo18363O(-374553303);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59695f0.getValue(), c15688rMo18372i, r10), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10916k, C3376c.f10955p, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i.m18410W(r10);
            } else {
                c15688rMo18372i.mo18363O(-374365908);
                c15688rMo18372i.m18410W(r10);
            }
            C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688rMo18372i);
            function1 = function0;
            C8245x0.m10154a(C7586d.m8700a(aVar, "test_tag_profile_management"), function1, C16973X.m19466e((C16972W) C19101C4.f59721s0.getValue(), c15688rMo18372i, r10), null, null, false, false, false, C3376c.f10944e, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, ((i12 >> 3) & 112) | 6, 0, 16120);
            C15688r c15688r2 = c15688rMo18372i;
            c15688r2.m18410W(true);
            c15688r = c15688r2;
        } else {
            function1 = function0;
            c15688rMo18372i.mo18356H();
            c15688r = c15688rMo18372i;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: Xf.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C6346q.m7123a(c8484c, z10, function1, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m7124b(final InterfaceC1380a interfaceC1380a, InterfaceC15676n interfaceC15676n, final int i10) {
        InterfaceC15676n.a.C21235a c21235a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1930144894);
        int i11 = i10 | (c15688rMo18372i.mo18362N(interfaceC1380a) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1380a.mo1976t().mo195a(), c15688rMo18372i, 0);
            InterfaceC7507e interfaceC7507eM8487b = C7468a.m8487b(C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), C3376c.f10940a, C0946M0.f3382a);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(8), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8487b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
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
            C8457f.m10341a(null, C16973X.m19466e((C16972W) C19285c2.f60124x.getValue(), c15688rMo18372i, 0), null, null, null, C4601b.m5206a(), interfaceC1380a.mo1975s(), 0.0f, 0L, false, false, c15688rMo18372i, 0, 1949);
            C8457f.m10341a(null, C16973X.m19466e((C16972W) C19101C4.f59668Q.getValue(), c15688rMo18372i, 0), null, null, null, C4601b.m5206a(), interfaceC1380a.mo1972p(), 0.0f, 0L, false, false, c15688rMo18372i, 0, 1949);
            C8457f.m10341a(null, C16973X.m19466e((C16972W) C19101C4.f59675T0.getValue(), c15688rMo18372i, 0), null, null, null, C4601b.m5225t(), interfaceC1380a.mo1974r(), 0.0f, 0L, false, false, c15688rMo18372i, 0, 1949);
            boolean zIsBlank = StringsKt.isBlank(interfaceC1380a.mo1965h());
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (zIsBlank) {
                c21235a = c21235a2;
                c15688rMo18372i.mo18363O(-1260140502);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1260359610);
                String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59776h.getValue(), c15688rMo18372i, 0);
                C4600a c4600aM5226u = C4601b.m5226u();
                boolean z10 = (i11 & 14) == 4;
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (z10 || objMo18389z == c21235a2) {
                    objMo18389z = new Function0() { // from class: Xf.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            interfaceC1380a.mo1978w();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                c21235a = c21235a2;
                C8457f.m10341a(null, strM19466e, null, null, null, c4600aM5226u, (Function0) objMo18389z, 0.0f, 0L, false, false, c15688rMo18372i, 0, 1949);
                c15688rMo18372i.m18410W(false);
            }
            if (StringsKt.isBlank(interfaceC1380a.mo1966i())) {
                c15688rMo18372i.mo18363O(-1259837942);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1260076270);
                String strM19466e2 = C16973X.m19466e((C16972W) C19119E6.f59760Y.getValue(), c15688rMo18372i, 0);
                C4600a c4600aM5226u2 = C4601b.m5226u();
                boolean z11 = (i11 & 14) == 4;
                Object objMo18389z2 = c15688rMo18372i.mo18389z();
                if (z11 || objMo18389z2 == c21235a) {
                    objMo18389z2 = new Function0() { // from class: Xf.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            interfaceC1380a.mo1969l();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z2);
                }
                C8457f.m10341a(null, strM19466e2, null, null, null, c4600aM5226u2, (Function0) objMo18389z2, 0.0f, 0L, false, false, c15688rMo18372i, 0, 1949);
                c15688rMo18372i.m18410W(false);
            }
            if (StringsKt.isBlank(interfaceC1380a.mo1970m())) {
                c15688rMo18372i.mo18363O(-1259539350);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1259781522);
                String strM43a = C0021a.m43a(C16973X.m19466e((C16972W) C19119E6.f59762a.getValue(), c15688rMo18372i, 0), " ", interfaceC1380a.mo1970m());
                C4600a c4600a = new C4600a((C16987h) C19097C0.f59572S.getValue(), null);
                boolean z12 = (i11 & 14) == 4;
                Object objMo18389z3 = c15688rMo18372i.mo18389z();
                if (z12 || objMo18389z3 == c21235a) {
                    objMo18389z3 = new Function0() { // from class: Xf.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            interfaceC1380a.mo1967j();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z3);
                }
                C8457f.m10341a(null, strM43a, null, null, null, c4600a, (Function0) objMo18389z3, 0.0f, 0L, false, false, c15688rMo18372i, 0, 1949);
                c15688rMo18372i.m18410W(false);
            }
            if (Intrinsics.areEqual(interfaceC1380a.mo1976t(), C0136e.f468a)) {
                c15688rMo18372i.mo18363O(-1259236790);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1259460052);
                String strM19466e3 = C16973X.m19466e((C16972W) C19140H5.f59844a0.getValue(), c15688rMo18372i, 0);
                boolean z13 = ((EnumC1914v) interfaceC15701v0M18246a.getValue()) == EnumC1914v.f6467c;
                InterfaceC0135d interfaceC0135dMo1976t = interfaceC1380a.mo1976t();
                boolean zMo18350B = c15688rMo18372i.mo18350B(interfaceC0135dMo1976t);
                Object objMo18389z4 = c15688rMo18372i.mo18389z();
                if (zMo18350B || objMo18389z4 == c21235a) {
                    objMo18389z4 = new a(0, interfaceC0135dMo1976t, InterfaceC0135d.class, "sendLog", "sendLog()V", 0);
                    c15688rMo18372i.mo18380q(objMo18389z4);
                }
                C8457f.m10341a(null, strM19466e3, null, null, null, null, (Function0) ((KFunction) objMo18389z4), 0.0f, 0L, z13, false, c15688rMo18372i, 0, 1469);
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Xf.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6346q.m7124b(this.f20777b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7125c(final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-394424535);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c15688rMo18372i.mo18350B(function0) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59723t0.getValue(), c15688rMo18372i, 0), C7482g.m8533r(C7482g.m8518c(aVar, 1.0f), InterfaceC18861d.a.f58760n, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10908c, c15688rMo18372i, 48, 0, 131068);
            C1963W0.m2623a(C7482g.m8519d(aVar, 8), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59717q0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10912g, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, 16), c15688rMo18372i);
            C8245x0.m10154a(C7586d.m8700a(aVar, "test_tag_auth_button"), function0, C16973X.m19466e((C16972W) C19278b3.f59976Y.getValue(), c15688rMo18372i, 0), null, null, false, false, false, C3376c.f10944e, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, ((i11 << 3) & 112) | 6, 0, 16120);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: Xf.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C6346q.m7125c(function0, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0128  */
    /* JADX WARN: Code duplicated, block: B:30:0x012c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0147  */
    /* JADX WARN: Code duplicated, block: B:38:0x0159  */
    /* JADX WARN: Code duplicated, block: B:40:0x016b  */
    /* JADX WARN: Code duplicated, block: B:41:0x016d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Code duplicated, block: B:47:0x0188  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x0262  */
    /* JADX WARN: Code duplicated, block: B:63:0x0267  */
    /* JADX WARN: Code duplicated, block: B:65:0x026a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0274  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m7126d(final InterfaceC1380a interfaceC1380a, InterfaceC6570b interfaceC6570b, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC6570b interfaceC6570b2;
        int i11;
        float f10;
        int i12;
        boolean z10;
        C5167i c5167i;
        AbstractC1714b.a<C, T> aVar;
        InterfaceC2141a interfaceC2141a;
        boolean z11;
        Object objMo18389z;
        boolean z12;
        Object objMo18389z2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1314609096);
        int i13 = i10 | (c15688rMo18372i.mo18362N(interfaceC1380a) ? 4 : 2) | (c15688rMo18372i.mo18362N(interfaceC6570b) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i13 & 1, (i13 & 19) != 18)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1380a.mo1963f().mo13180b().mo13172b().f23614b, c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC1380a.mo1963f().mo13180b().mo13171a(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a3 = C15585G1.m18246a(interfaceC1380a.mo1961d().getState(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(C7482g.m8517b(aVar2, 1.0f), C20541F0.m25137a(c15688rMo18372i), 14);
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar3 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar3, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i14 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM25139c, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                i11 = i13;
            } else {
                i11 = i13;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                C8484c c8484c = ((InterfaceC7360f.a) interfaceC15701v0M18246a2.getValue()).f23598b;
                C5167i c5167i2 = ((InterfaceC5166h.a) interfaceC15701v0M18246a3.getValue()).f16977a;
                m7128f(c8484c, C5704d.m6337a(c5167i2.f16980a, c5167i2.f16981b), interfaceC1380a.mo1977v(), interfaceC1380a.mo1964g(), c15688rMo18372i, 0);
                f10 = 16;
                InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8517b(aVar2, 1.0f), f10, 0.0f, 2);
                C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar3, c15688rMo18372i, 0);
                long j11 = c15688rMo18372i.f50813T;
                i12 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar4);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                    C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                z10 = ((InterfaceC7359e.a) interfaceC15701v0M18246a.getValue()).f23595a;
                InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                if (z10) {
                    c15688rMo18372i.mo18363O(1834796777);
                    C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
                    if ((i11 & 14) != 4) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    objMo18389z2 = c15688rMo18372i.mo18389z();
                    if (z12 || objMo18389z2 == c21235a) {
                        objMo18389z2 = new Function1() { // from class: Xf.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                interfaceC1380a.mo1968k(((Boolean) obj).booleanValue());
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z2);
                    }
                    m7127e((Function1) objMo18389z2, c15688rMo18372i, 0);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(1834939966);
                    c15688rMo18372i.m18410W(false);
                }
                c5167i = ((InterfaceC5166h.a) interfaceC15701v0M18246a3.getValue()).f16977a;
                if (C5704d.m6337a(c5167i.f16980a, c5167i.f16981b)) {
                    c15688rMo18372i.mo18363O(1835205822);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(1834998246);
                    C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
                    if ((i11 & 14) != 4) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    objMo18389z = c15688rMo18372i.mo18389z();
                    if (z11 || objMo18389z == c21235a) {
                        objMo18389z = new Function0() { // from class: Xf.h
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                InterfaceC1380a interfaceC1380a2 = interfaceC1380a;
                                interfaceC1380a2.mo1971o().invoke();
                                interfaceC1380a2.mo1960c().invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z);
                    }
                    C4595c.m5202a((Function0) objMo18389z, c15688rMo18372i, 0);
                    c15688rMo18372i.m18410W(false);
                }
                C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
                m7124b(interfaceC1380a, c15688rMo18372i, i11 & 14);
                C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
                interfaceC6570b2 = interfaceC6570b;
                interfaceC6570b2.mo7395a((i11 >> 3) & 14, c15688rMo18372i);
                C11565Q2.m13480b(C16973X.m19467f((C16972W) C19285c2.f60118u.getValue(), new Object[]{interfaceC1380a.mo1962e().f8790b}, c15688rMo18372i), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10914i, c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i = c15688rMo18372i;
                C1963W0.m2623a(C7482g.m8519d(aVar2, 24), c15688rMo18372i);
                c15688rMo18372i.m18410W(true);
                c15688rMo18372i.m18410W(true);
                aVar = ((C4555a) C2468d.m3195a(interfaceC1380a.mo1959b(), c15688rMo18372i, 0).getValue()).f15383a;
                if (aVar != 0) {
                    interfaceC2141a = (InterfaceC2141a) aVar.f5802b;
                } else {
                    interfaceC2141a = null;
                }
                if (interfaceC2141a == null) {
                    c15688rMo18372i.mo18363O(-2005909946);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-2005909945);
                    C8136C.m10121c(interfaceC2141a, c15688rMo18372i, 0);
                    Unit unit = Unit.INSTANCE;
                    c15688rMo18372i.m18410W(false);
                }
            }
            C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            C8484c c8484c2 = ((InterfaceC7360f.a) interfaceC15701v0M18246a2.getValue()).f23598b;
            C5167i c5167i3 = ((InterfaceC5166h.a) interfaceC15701v0M18246a3.getValue()).f16977a;
            m7128f(c8484c2, C5704d.m6337a(c5167i3.f16980a, c5167i3.f16981b), interfaceC1380a.mo1977v(), interfaceC1380a.mo1964g(), c15688rMo18372i, 0);
            f10 = 16;
            InterfaceC7507e interfaceC7507eM8513f2 = C7481f.m8513f(C7482g.m8517b(aVar2, 1.0f), f10, 0.0f, 2);
            C2036x c2036xM2689a3 = C2032v.m2689a(kVar, aVar3, c15688rMo18372i, 0);
            long j12 = c15688rMo18372i.f50813T;
            i12 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8513f2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
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
            z10 = ((InterfaceC7359e.a) interfaceC15701v0M18246a.getValue()).f23595a;
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (z10) {
                c15688rMo18372i.mo18363O(1834796777);
                C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
                if ((i11 & 14) != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                objMo18389z2 = c15688rMo18372i.mo18389z();
                if (z12) {
                    objMo18389z2 = new Function1() { // from class: Xf.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            interfaceC1380a.mo1968k(((Boolean) obj).booleanValue());
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z2);
                } else {
                    objMo18389z2 = new Function1() { // from class: Xf.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            interfaceC1380a.mo1968k(((Boolean) obj).booleanValue());
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z2);
                }
                m7127e((Function1) objMo18389z2, c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1834939966);
                c15688rMo18372i.m18410W(false);
            }
            c5167i = ((InterfaceC5166h.a) interfaceC15701v0M18246a3.getValue()).f16977a;
            if (C5704d.m6337a(c5167i.f16980a, c5167i.f16981b)) {
                c15688rMo18372i.mo18363O(1834998246);
                C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
                if ((i11 & 14) != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                objMo18389z = c15688rMo18372i.mo18389z();
                if (z11) {
                    objMo18389z = new Function0() { // from class: Xf.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC1380a interfaceC1380a2 = interfaceC1380a;
                            interfaceC1380a2.mo1971o().invoke();
                            interfaceC1380a2.mo1960c().invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                } else {
                    objMo18389z = new Function0() { // from class: Xf.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC1380a interfaceC1380a2 = interfaceC1380a;
                            interfaceC1380a2.mo1971o().invoke();
                            interfaceC1380a2.mo1960c().invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C4595c.m5202a((Function0) objMo18389z, c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1835205822);
                c15688rMo18372i.m18410W(false);
            }
            C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
            m7124b(interfaceC1380a, c15688rMo18372i, i11 & 14);
            C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
            interfaceC6570b2 = interfaceC6570b;
            interfaceC6570b2.mo7395a((i11 >> 3) & 14, c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19467f((C16972W) C19285c2.f60118u.getValue(), new Object[]{interfaceC1380a.mo1962e().f8790b}, c15688rMo18372i), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10914i, c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
            C1963W0.m2623a(C7482g.m8519d(aVar2, 24), c15688rMo18372i);
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
            aVar = ((C4555a) C2468d.m3195a(interfaceC1380a.mo1959b(), c15688rMo18372i, 0).getValue()).f15383a;
            if (aVar != 0) {
                interfaceC2141a = (InterfaceC2141a) aVar.f5802b;
            } else {
                interfaceC2141a = null;
            }
            if (interfaceC2141a == null) {
                c15688rMo18372i.mo18363O(-2005909946);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-2005909945);
                C8136C.m10121c(interfaceC2141a, c15688rMo18372i, 0);
                Unit unit2 = Unit.INSTANCE;
                c15688rMo18372i.m18410W(false);
            }
        } else {
            interfaceC6570b2 = interfaceC6570b;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(interfaceC6570b2, i10) { // from class: Xf.i

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC6570b f20773c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6346q.m7126d(this.f20772b, this.f20773c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m7127e(final Function1<? super Boolean, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-337307905);
        int i11 = i10 | (c15688rMo18372i.mo18350B(function1) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            float f10 = 8;
            C4024e c4024eM4709b = C4025f.m4709b(f10);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f11 = 24;
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7468a.m8487b(C0009h.m22a(aVar, c4024eM4709b), C3376c.f10944e, C0946M0.f3382a), f11);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(16), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar, f11);
            C2431d c2431d = C4601b.f15461a;
            C16987h c16987h = (C16987h) C19142I0.f59917o.getValue();
            c15688rMo18372i.mo18363O(279895816);
            C2431d c2431dM19473b = C16999t.m19473b(c16987h, c15688rMo18372i, 0);
            c15688rMo18372i.mo18357I();
            C11569S.m13483b(c2431dM19473b, null, interfaceC7507eM8525j, C3376c.f10951l, c15688rMo18372i, 432, 0);
            C1963W0.m2623a(C7482g.m8529n(aVar, f10), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60111q0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10908c, c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i.m18410W(true);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19119E6.f59764b.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10912g, c15688rMo18372i, 0, 0, 131070);
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(aVar, "test_tag_sync_my_button");
            int i14 = i11 & 14;
            boolean z10 = i14 == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (z10 || objMo18389z == c21235a) {
                objMo18389z = new Function0() { // from class: Xf.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C8245x0.m10154a(interfaceC7507eM8700a, (Function0) objMo18389z, C16973X.m19466e((C16972W) C19285c2.f60092h.getValue(), c15688rMo18372i, 0), null, null, false, false, false, 0L, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, 6, 0, 16376);
            boolean z11 = i14 == 4;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (z11 || objMo18389z2 == c21235a) {
                objMo18389z2 = new Function0() { // from class: Xf.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C8245x0.m10154a(null, (Function0) objMo18389z2, C16973X.m19466e((C16972W) C19101C4.f59684a.getValue(), c15688rMo18372i, 0), null, null, false, false, false, C3376c.f10945f, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, 0, 0, 16121);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Xf.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6346q.m7127e(this.f20764b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m7128f(final C8484c c8484c, final boolean z10, final Function0<Unit> function0, final Function0<Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-739683058);
        int i11 = (c15688rMo18372i.mo18350B(c8484c) ? 4 : 2) | i10 | (c15688rMo18372i.mo18364a(z10) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 1171) != 1170)) {
            float f10 = 0;
            float f11 = 8;
            InterfaceC7507e interfaceC7507eM2681a = C2008m1.m2681a(C7481f.m8512e(C7468a.m8487b(C0009h.m22a(C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), C4025f.m4710c(f10, f10, f11, f11)), C3376c.f10941b, C0946M0.f3382a), 16, 24));
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) ((j10 >>> 32) ^ j10);
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM2681a, c15688rMo18372i);
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
            if (C8485d.m10355c(c8484c)) {
                c15688rMo18372i.mo18363O(-352471846);
                m7125c(function0, c15688rMo18372i, (i11 >> 6) & 14);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-352398593);
                m7123a(c8484c, z10, function1, c15688rMo18372i, ((i11 >> 3) & 896) | (i11 & 126));
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, function0, function1, i10) { // from class: Xf.n

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f20779c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f20780d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f20781e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6346q.m7128f(this.f20778b, this.f20779c, this.f20780d, this.f20781e, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
