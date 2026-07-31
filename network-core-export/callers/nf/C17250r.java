package nf;

import ad.InterfaceC7239e;
import ad.InterfaceC7248h;
import af.C7315h;
import androidx.compose.animation.C7467b;
import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7479d;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.ZIndexElement;
import androidx.compose.p481ui.focus.C7513d;
import androidx.compose.p481ui.platform.C7586d;
import ke.C15855h;
import kg.C15881d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import mg.C17055r;
import org.conscrypt.PSKKeyManager;
import org.mozilla.classfile.ByteCode;
import p019B0.InterfaceC0179H;
import p055D0.C0946M0;
import p090F.InterfaceC1457j;
import p125Gg.EnumC1896d;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2008m1;
import p126H.C2032v;
import p126H.C2036x;
import p126H.EnumC2007m0;
import p144I.C2192a;
import p163J0.C2431d;
import p214Lf.C3376c;
import p250Nf.C3765d;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p338Sd.InterfaceC4901a;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p480ah.InterfaceC7360f;
import p579h0.C11569S;
import p607i9.C12269M6;
import p607i9.C12664j3;
import p607i9.C12736n3;
import p640jf.C15454D0;
import p641jg.C15561e;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15627V;
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
import p775s0.C18036t;
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

/* JADX INFO: renamed from: nf.r */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainSideMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSideMenu.kt\nru/zona/app/screens/ui/tv/menu/MainSideMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,270:1\n75#2:271\n75#2:272\n75#2:486\n70#3:273\n67#3,9:274\n70#3:317\n67#3,9:318\n77#3:363\n77#3:367\n80#4,6:283\n87#4,3:298\n90#4,2:307\n80#4,6:327\n87#4,3:342\n90#4,2:351\n94#4:362\n94#4:366\n80#4,6:378\n87#4,3:393\n90#4,2:402\n94#4:407\n80#4,6:419\n87#4,3:434\n90#4,2:443\n80#4,6:457\n87#4,3:472\n90#4,2:481\n80#4,6:504\n87#4,3:519\n90#4,2:528\n94#4:581\n94#4:585\n94#4:589\n391#5,9:289\n400#5:309\n391#5,9:333\n400#5:353\n401#5,2:360\n401#5,2:364\n391#5,9:384\n400#5,3:404\n391#5,9:425\n400#5:445\n391#5,9:463\n400#5:483\n391#5,9:510\n400#5:530\n401#5,2:579\n401#5,2:583\n401#5,2:587\n4360#6,6:301\n4360#6,6:345\n4360#6,6:396\n4360#6,6:437\n4360#6,6:475\n4360#6,6:522\n1282#7,6:310\n1282#7,6:354\n1282#7,6:487\n1282#7,6:531\n1282#7,6:537\n1282#7,6:543\n1282#7,6:549\n1282#7,6:555\n1282#7,6:561\n1282#7,6:567\n1282#7,6:573\n113#8:316\n113#8:446\n113#8:447\n113#8:484\n113#8:485\n113#8:493\n113#8:494\n113#8:591\n113#8:599\n113#8:605\n99#9:368\n96#9,9:369\n106#9:408\n87#10:409\n84#10,9:410\n87#10:448\n85#10,8:449\n87#10:495\n85#10,8:496\n94#10:582\n94#10:586\n94#10:590\n15#11,7:592\n85#12:600\n85#12:601\n85#12:602\n85#12:603\n85#12:604\n*S KotlinDebug\n*F\n+ 1 MainSideMenu.kt\nru/zona/app/screens/ui/tv/menu/MainSideMenuKt\n*L\n70#1:271\n71#1:272\n172#1:486\n94#1:273\n94#1:274,9\n106#1:317\n106#1:318,9\n106#1:363\n94#1:367\n94#1:283,6\n94#1:298,3\n94#1:307,2\n106#1:327,6\n106#1:342,3\n106#1:351,2\n106#1:362\n94#1:366\n126#1:378,6\n126#1:393,3\n126#1:402,2\n126#1:407\n149#1:419,6\n149#1:434,3\n149#1:443,2\n158#1:457,6\n158#1:472,3\n158#1:481,2\n177#1:504,6\n177#1:519,3\n177#1:528,2\n177#1:581\n158#1:585\n149#1:589\n94#1:289,9\n94#1:309\n106#1:333,9\n106#1:353\n106#1:360,2\n94#1:364,2\n126#1:384,9\n126#1:404,3\n149#1:425,9\n149#1:445\n158#1:463,9\n158#1:483\n177#1:510,9\n177#1:530\n177#1:579,2\n158#1:583,2\n149#1:587,2\n94#1:301,6\n106#1:345,6\n126#1:396,6\n149#1:437,6\n158#1:475,6\n177#1:522,6\n104#1:310,6\n114#1:354,6\n173#1:487,6\n186#1:531,6\n194#1:537,6\n201#1:543,6\n209#1:549,6\n217#1:555,6\n226#1:561,6\n233#1:567,6\n242#1:573,6\n109#1:316\n164#1:446\n165#1:447\n168#1:484\n170#1:485\n175#1:493\n179#1:494\n263#1:591\n265#1:599\n154#1:605\n126#1:368\n126#1:369,9\n126#1:408\n149#1:409\n149#1:410,9\n158#1:448\n158#1:449,8\n177#1:495\n177#1:496,8\n177#1:582\n158#1:586\n149#1:590\n264#1:592,7\n93#1:600\n144#1:601\n145#1:602\n146#1:603\n147#1:604\n*E\n"})
public final class C17250r {

    /* JADX INFO: renamed from: nf.r$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC7239e) this.receiver).mo8127o();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nf.r$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC7239e) this.receiver).mo8124k();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nf.r$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC7239e) this.receiver).mo8117d();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nf.r$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC7239e) this.receiver).mo8125l();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nf.r$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC7239e) this.receiver).mo8126m();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nf.r$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC7239e) this.receiver).mo8120g();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nf.r$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC7239e) this.receiver).mo8116c();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nf.r$h */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC7239e) this.receiver).mo8121h();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nf.r$i */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class i implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f54083b;

        public i(Function0 function0) {
            this.f54083b = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C17251s(this.f54083b), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /* JADX INFO: renamed from: a */
    public static final void m19688a(final InterfaceC7239e interfaceC7239e, InterfaceC4901a interfaceC4901a, final boolean z10, Function1<? super InterfaceC0179H, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        Function1<? super InterfaceC0179H, Unit> function2;
        int i12;
        final InterfaceC4901a interfaceC4901a2;
        final Function1<? super InterfaceC0179H, Unit> function3;
        C15688r c15688r;
        ?? r10;
        int i13;
        Object obj;
        int i14;
        C15688r c15688r2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1373909500);
        int i15 = (c15688rMo18372i.mo18362N(interfaceC7239e) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(interfaceC4901a) ? 32 : 16);
        if ((i10 & 384) == 0) {
            i15 |= c15688rMo18372i.mo18364a(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i16 = i11 & 8;
        if (i16 != 0) {
            i12 = i15 | 3072;
            function2 = function1;
        } else {
            function2 = function1;
            i12 = i15 | (c15688rMo18372i.mo18350B(function2) ? 2048 : 1024);
        }
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 1171) != 1170)) {
            Function1<? super InterfaceC0179H, Unit> function4 = i16 != 0 ? null : function2;
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC7239e.mo8115b(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC7239e.mo8114a(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a3 = C15585G1.m18246a(interfaceC7239e.mo8118e(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a4 = C15585G1.m18246a(interfaceC7239e.mo8123j(), c15688rMo18372i, 0);
            InterfaceC7507e interfaceC7507eM8485a = C7467b.m8485a(new ZIndexElement());
            int i17 = i12 >> 3;
            int i18 = i17 & 112;
            if (z10) {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(2029974809);
                EnumC2007m0 enumC2007m0 = EnumC2007m0.f6718b;
                interfaceC7507eM8485a = C7479d.m8504b(interfaceC7507eM8485a);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(552068856);
            }
            c15688rMo18372i.m18410W(false);
            if (z10) {
                c15688rMo18372i.mo18363O(552068856);
            } else {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(2024770391);
                interfaceC7507eM8485a = C7482g.m8529n(interfaceC7507eM8485a, 80);
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(false);
            InterfaceC7507e interfaceC7507eM8487b = C7468a.m8487b(interfaceC7507eM8485a.mo2665S0(C7482g.f24343b), C3376c.f10941b, C0946M0.f3382a);
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i19 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8487b, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i19))) {
                C12269M6.m14188a(i19, c15688rMo18372i, i19, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            int i20 = i12 >> 6;
            float f10 = 24;
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C2008m1.m2682b(C20541F0.m25139c(C17055r.m19502d(C7513d.m8579a(), function4, new C17242j(), c15688rMo18372i, i20 & 112), C20541F0.m25137a(c15688rMo18372i), 14)), 12, f10);
            float f11 = 16;
            C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.m2645g(f11), aVar, c15688rMo18372i, 6);
            Function1<? super InterfaceC0179H, Unit> function5 = function4;
            long j11 = c15688rMo18372i.f50813T;
            int i21 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i21))) {
                C12269M6.m14188a(i21, c15688rMo18372i, i21, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
            C15561e.m18140b(C7481f.m8513f(aVar3, f11, 0.0f, 2), z10, f10, 0L, c15688rMo18372i, i18 | 390, 8);
            Object objMo18383t = c15688rMo18372i.mo18383t(C3765d.f12328a);
            EnumC1896d enumC1896d = EnumC1896d.Tablet;
            Object obj2 = InterfaceC15676n.a.f50781a;
            if (objMo18383t == enumC1896d) {
                c15688rMo18372i.mo18363O(-357733893);
                boolean z11 = ((i12 & 896) == 256) | ((i12 & 14) == 4);
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (z11 || objMo18389z == obj2) {
                    objMo18389z = new Function0() { // from class: nf.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            interfaceC7239e.mo8119f(!z10);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                m19692e(z10, (Function0) objMo18389z, c15688rMo18372i, i20 & 14);
                r10 = 0;
                c15688rMo18372i.m18410W(false);
            } else {
                r10 = 0;
                c15688rMo18372i.mo18363O(-357634755);
                C15855h.m18664b(aVar3, 8, c15688rMo18372i, false);
            }
            InterfaceC7507e interfaceC7507eM8579a = C7513d.m8579a();
            C2036x c2036xM2689a3 = C2032v.m2689a(C1982e.m2645g(8), aVar, c15688rMo18372i, 6);
            long j12 = c15688rMo18372i.f50813T;
            int i22 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8579a, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a3, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i22))) {
                C12269M6.m14188a(i22, c15688rMo18372i, i22, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
            C4600a c4600aM5224s = C4601b.m5224s();
            String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59821N.getValue(), c15688rMo18372i, r10);
            boolean z12 = ((InterfaceC7248h.b) interfaceC15701v0M18246a.getValue()) instanceof InterfaceC7248h.b.q;
            int i23 = i12 & 14;
            boolean z13 = i23 == 4;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (z13 || objMo18389z2 == obj2) {
                i13 = i12;
                Object aVar4 = new a(0, interfaceC7239e, InterfaceC7239e.class, "gotoSearch", "gotoSearch()V", 0);
                c15688rMo18372i.mo18380q(aVar4);
                objMo18389z2 = aVar4;
            } else {
                i13 = i12;
            }
            int i24 = (i13 << 9) & 458752;
            int i25 = i24 | 1572864;
            C17241i.m19686a((Function0) ((KFunction) objMo18389z2), c4600aM5224s, null, strM19466e, z12, z10, "test_tag_nav_menu_search", false, c15688rMo18372i, i25, 132);
            C4600a c4600aM5215j = C4601b.m5215j();
            String strM19466e2 = C16973X.m19466e((C16972W) C19278b3.f60015s0.getValue(), c15688rMo18372i, r10);
            boolean z14 = ((InterfaceC7248h.b) interfaceC15701v0M18246a.getValue()) instanceof InterfaceC7248h.b.i;
            boolean z15 = i23 == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z15 || objMo18389z3 == obj2) {
                obj = obj2;
                i14 = i23;
                Object bVar = new b(0, interfaceC7239e, InterfaceC7239e.class, "gotoCollections", "gotoCollections()V", 0);
                c15688rMo18372i.mo18380q(bVar);
                objMo18389z3 = bVar;
            } else {
                i14 = i23;
                obj = obj2;
            }
            int i26 = i14;
            Object obj3 = obj;
            C17241i.m19686a((Function0) ((KFunction) objMo18389z3), c4600aM5215j, null, strM19466e2, z14, z10, null, false, c15688rMo18372i, i24, ByteCode.WIDE);
            C4600a c4600a = new C4600a((C16987h) C19097C0.f59547F0.getValue(), (C16987h) C19097C0.f59545E0.getValue());
            String strM19466e3 = C16973X.m19466e((C16972W) C19278b3.f60027y0.getValue(), c15688rMo18372i, r10);
            boolean z16 = ((InterfaceC7248h.b) interfaceC15701v0M18246a.getValue()) instanceof InterfaceC7248h.b.k;
            boolean z17 = i26 == 4;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (z17 || objMo18389z4 == obj3) {
                Object cVar = new c(0, interfaceC7239e, InterfaceC7239e.class, "gotoMovies", "gotoMovies()V", 0);
                c15688rMo18372i.mo18380q(cVar);
                objMo18389z4 = cVar;
            }
            C17241i.m19686a((Function0) ((KFunction) objMo18389z4), c4600a, null, strM19466e3, z16, z10, "test_tag_nav_menu_catalog", false, c15688rMo18372i, i25, 132);
            C4600a c4600a2 = new C4600a((C16987h) C19097C0.f59542D.getValue(), (C16987h) C19097C0.f59540C.getValue());
            String strM19466e4 = C16973X.m19466e((C16972W) C19140H5.f59848c0.getValue(), c15688rMo18372i, r10);
            boolean z18 = ((InterfaceC7248h.b) interfaceC15701v0M18246a.getValue()) instanceof InterfaceC7248h.b.s;
            boolean z19 = i26 == 4;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (z19 || objMo18389z5 == obj3) {
                Object dVar2 = new d(0, interfaceC7239e, InterfaceC7239e.class, "gotoSerials", "gotoSerials()V", 0);
                c15688rMo18372i.mo18380q(dVar2);
                objMo18389z5 = dVar2;
            }
            int i27 = i26;
            Object obj4 = obj3;
            int i28 = 4;
            C17241i.m19686a((Function0) ((KFunction) objMo18389z5), c4600a2, null, strM19466e4, z18, z10, null, false, c15688rMo18372i, i24, ByteCode.WIDE);
            C15688r c15688r3 = c15688rMo18372i;
            if (((Boolean) interfaceC15701v0M18246a3.getValue()).booleanValue()) {
                c15688r3.mo18363O(333957205);
                C4600a c4600a3 = new C4600a((C16987h) C19142I0.f59912j.getValue(), (C16987h) C19142I0.f59911i.getValue());
                String strM19466e5 = C16973X.m19466e((C16972W) C19140H5.f59812I0.getValue(), c15688r3, r10);
                boolean z20 = ((InterfaceC7248h.b) interfaceC15701v0M18246a.getValue()) instanceof InterfaceC7248h.b.u;
                boolean z21 = i27 == 4;
                Object objMo18389z6 = c15688r3.mo18389z();
                if (z21 || objMo18389z6 == obj4) {
                    Object eVar2 = new e(0, interfaceC7239e, InterfaceC7239e.class, "gotoSportCatalog", "gotoSportCatalog()V", 0);
                    c15688r3.mo18380q(eVar2);
                    objMo18389z6 = eVar2;
                }
                obj4 = obj4;
                i27 = i27;
                i28 = 4;
                C17241i.m19686a((Function0) ((KFunction) objMo18389z6), c4600a3, null, strM19466e5, z20, z10, null, ((Boolean) interfaceC15701v0M18246a4.getValue()).booleanValue(), c15688r3, i24, 68);
                C15688r c15688r4 = c15688r3;
                c15688r4.m18410W(r10);
                c15688r2 = c15688r4;
            } else {
                c15688r3.mo18363O(334358500);
                c15688r3.m18410W(r10);
                c15688r2 = c15688r3;
            }
            C4600a c4600a4 = new C4600a((C16987h) C19142I0.f59922t.getValue(), (C16987h) C19142I0.f59921s.getValue());
            String strM19466e6 = C16973X.m19466e((C16972W) C19119E6.f59790v.getValue(), c15688r2, r10);
            boolean z22 = ((InterfaceC7248h.b) interfaceC15701v0M18246a.getValue()) instanceof InterfaceC7248h.b.w;
            boolean z23 = i27 == i28;
            Object objMo18389z7 = c15688r2.mo18389z();
            if (z23 || objMo18389z7 == obj4) {
                Object fVar2 = new f(0, interfaceC7239e, InterfaceC7239e.class, "gotoTvChannels", "gotoTvChannels()V", 0);
                c15688r2.mo18380q(fVar2);
                objMo18389z7 = fVar2;
            }
            Function0 function0 = (Function0) ((KFunction) objMo18389z7);
            int i29 = i27;
            Object obj5 = obj4;
            C15688r c15688r5 = c15688r2;
            C17241i.m19686a(function0, c4600a4, null, strM19466e6, z22, z10, null, false, c15688r5, i24, ByteCode.WIDE);
            C4600a c4600a5 = new C4600a((C16987h) C19097C0.f59628w.getValue(), (C16987h) C19097C0.f59626v.getValue());
            String strM19466e7 = C16973X.m19466e((C16972W) C19278b3.f60029z0.getValue(), c15688r5, r10);
            boolean z24 = ((InterfaceC7248h.b) interfaceC15701v0M18246a.getValue()) instanceof InterfaceC7248h.b.l;
            boolean z25 = i29 == 4;
            Object objMo18389z8 = c15688r5.mo18389z();
            if (z25 || objMo18389z8 == obj5) {
                Object gVar = new g(0, interfaceC7239e, InterfaceC7239e.class, "gotoMy", "gotoMy()V", 0);
                c15688r5.mo18380q(gVar);
                objMo18389z8 = gVar;
            }
            C17241i.m19686a((Function0) ((KFunction) objMo18389z8), c4600a5, null, strM19466e7, z24, z10, "test_tag_nav_menu_my", false, c15688r5, i25, 132);
            C4600a c4600aM5227v = C4601b.m5227v();
            String str = ((InterfaceC7360f.a) interfaceC15701v0M18246a2.getValue()).f23598b.f29038c;
            String strM19466e8 = C16973X.m19466e((C16972W) C19101C4.f59715p0.getValue(), c15688r5, r10);
            boolean z26 = ((InterfaceC7248h.b) interfaceC15701v0M18246a.getValue()) instanceof InterfaceC7248h.b.n;
            boolean z27 = i29 == 4;
            Object objMo18389z9 = c15688r5.mo18389z();
            if (z27 || objMo18389z9 == obj5) {
                objMo18389z9 = new h(0, interfaceC7239e, InterfaceC7239e.class, "gotoProfile", "gotoProfile()V", 0);
                c15688r5.mo18380q(objMo18389z9);
            }
            C17241i.m19686a((Function0) ((KFunction) objMo18389z9), c4600aM5227v, str, strM19466e8, z26, z10, "test_tag_nav_menu_profile", false, c15688r5, i25, 128);
            C15688r c15688r6 = c15688r5;
            c15688r6.m18410W(true);
            c15688r6.m18410W(true);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            C1963W0.m2623a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), c15688r6);
            if (z10) {
                c15688r6.mo18363O(-659935167);
                interfaceC4901a2 = interfaceC4901a;
                C15881d.m18675a(interfaceC4901a2, (C16972W) C19285c2.f60039E0.getValue(), c15688r6, i17 & 14, r10);
                c15688r6.m18410W(r10);
            } else {
                interfaceC4901a2 = interfaceC4901a;
                c15688r6.mo18363O(-659851405);
                C15881d.m18676b(interfaceC4901a2, c15688r6, i17 & 14);
                c15688r6.m18410W(r10);
            }
            c15688r6.m18410W(true);
            function3 = function5;
            c15688r = c15688r6;
        } else {
            C15688r c15688r7 = c15688rMo18372i;
            interfaceC4901a2 = interfaceC4901a;
            c15688r7.mo18356H();
            function3 = function2;
            c15688r = c15688r7;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: nf.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    C17250r.m19688a(interfaceC7239e, interfaceC4901a2, z10, function3, (InterfaceC15676n) obj6, C15636Z0.m18294a(i10 | 1), i11);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m19689b(InterfaceC7239e interfaceC7239e, final InterfaceC4901a interfaceC4901a, final C18036t c18036t, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC7239e interfaceC7239e2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1049995171);
        int i11 = i10 | (c15688rMo18372i.mo18362N(interfaceC7239e) ? 4 : 2) | (c15688rMo18372i.mo18362N(interfaceC4901a) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC7239e.mo8122i(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7468a.m8487b(C7482g.m8517b(aVar, 1.0f), C3376c.f10940a, C0946M0.f3382a), "test_tag_nav_menu");
            C18863f c18863f = InterfaceC18861d.a.f58747a;
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(c18863f, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
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
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            boolean zBooleanValue = ((Boolean) interfaceC15701v0M18246a.getValue()).booleanValue();
            int i13 = i11 & 14;
            boolean z10 = i13 == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            boolean z11 = z10;
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (z11 || objMo18389z == c21235a) {
                objMo18389z = new C15454D0(interfaceC7239e, 1);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            m19688a(interfaceC7239e, interfaceC4901a, zBooleanValue, (Function1) objMo18389z, c15688rMo18372i, i11 & 126, 0);
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(C7482g.m8517b(aVar, 1.0f), 80, 0.0f, 0.0f, 0.0f, 14);
            InterfaceC5178F interfaceC5178FM2677d2 = C2000k.m2677d(c18863f, false);
            long j11 = c15688rMo18372i.f50813T;
            int i14 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            c18036t.invoke(c15688rMo18372i, 6);
            boolean zBooleanValue2 = ((Boolean) interfaceC15701v0M18246a.getValue()).booleanValue();
            boolean z12 = i13 == 4;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (z12 || objMo18389z2 == c21235a) {
                interfaceC7239e2 = interfaceC7239e;
                objMo18389z2 = new Function0() { // from class: nf.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        interfaceC7239e2.mo8119f(false);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
            } else {
                interfaceC7239e2 = interfaceC7239e;
            }
            C7315h.m8146a(zBooleanValue2, (Function0) objMo18389z2, 0.0f, c15688rMo18372i, 0);
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            interfaceC7239e2 = interfaceC7239e;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(interfaceC4901a, c18036t, i10) { // from class: nf.q

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC4901a f54081c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C18036t f54082d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(385);
                    C17250r.m19689b(this.f54080b, this.f54081c, this.f54082d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19690c(InterfaceC7239e interfaceC7239e, InterfaceC4901a interfaceC4901a, final C18036t c18036t, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC7239e interfaceC7239e2;
        final InterfaceC4901a interfaceC4901a2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1248544520);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC7239e) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(interfaceC4901a) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7468a.m8487b(C7482g.m8517b(InterfaceC7507e.a.f24548b, 1.0f), C3376c.f10940a, C0946M0.f3382a), "test_tag_nav_menu");
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
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
            interfaceC7239e2 = interfaceC7239e;
            interfaceC4901a2 = interfaceC4901a;
            m19688a(interfaceC7239e2, interfaceC4901a2, false, null, c15688rMo18372i, (i11 & 14) | 384 | (i11 & 112), 8);
            c18036t.invoke(c15688rMo18372i, 6);
            c15688rMo18372i.m18410W(true);
        } else {
            interfaceC7239e2 = interfaceC7239e;
            interfaceC4901a2 = interfaceC4901a;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(interfaceC4901a2, c18036t, i10) { // from class: nf.o

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC4901a f54077c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C18036t f54078d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(385);
                    C17250r.m19690c(this.f54076b, this.f54077c, this.f54078d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m19691d(final InterfaceC7239e interfaceC7239e, final InterfaceC4901a interfaceC4901a, final C18036t c18036t, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(869701218);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC7239e) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(interfaceC4901a) ? 32 : 16);
        boolean z10 = true;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            C15627V c15627v = C3765d.f12328a;
            if (c15688rMo18372i.mo18383t(c15627v) == EnumC1896d.Tv) {
                c15688rMo18372i.mo18363O(2026397317);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1735746034);
                z10 = c15688rMo18372i.mo18383t(c15627v) == EnumC1896d.Tablet;
                c15688rMo18372i.m18410W(false);
            }
            if (z10) {
                c15688rMo18372i.mo18363O(2026501922);
                m19689b(interfaceC7239e, interfaceC4901a, c18036t, c15688rMo18372i, i11 & 1022);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(2026664548);
                m19690c(interfaceC7239e, interfaceC4901a, c18036t, c15688rMo18372i, i11 & 1022);
                c15688rMo18372i.m18410W(false);
            }
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(interfaceC4901a, c18036t, i10) { // from class: nf.n

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC4901a f54074c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C18036t f54075d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(385);
                    C17250r.m19691d(this.f54073b, this.f54074c, this.f54075d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m19692e(final boolean z10, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C2431d c2431dM19473b;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1061827154);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? 32 : 16;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(C7503c.m8564a(C7481f.m8512e(InterfaceC7507e.a.f24548b, 16, 8), C6138n1.f20157a, new i(function0)), 24);
            if (z10) {
                c15688rMo18372i.mo18363O(-1786312074);
                C2431d c2431d = C4601b.f15461a;
                C16987h c16987h = (C16987h) C19097C0.f59537A0.getValue();
                c15688rMo18372i.mo18363O(279895816);
                c2431dM19473b = C16999t.m19473b(c16987h, c15688rMo18372i, 0);
                c15688rMo18372i.mo18357I();
            } else {
                c15688rMo18372i.mo18363O(-1786311209);
                C2431d c2431d2 = C4601b.f15461a;
                C16987h c16987h2 = (C16987h) C19097C0.f59537A0.getValue();
                C16987h c16987h3 = (C16987h) C19097C0.f59635z0.getValue();
                c15688rMo18372i.mo18363O(-690395191);
                if (c16987h3 != null) {
                    c15688rMo18372i.mo18363O(1035302691);
                    c2431dM19473b = C16999t.m19473b(c16987h3, c15688rMo18372i, 0);
                    c15688rMo18372i.mo18357I();
                } else {
                    c15688rMo18372i.mo18363O(1035354585);
                    c15688rMo18372i.mo18357I();
                    c15688rMo18372i.mo18363O(279895816);
                    c2431dM19473b = C16999t.m19473b(c16987h2, c15688rMo18372i, 0);
                    c15688rMo18372i.mo18357I();
                }
                c15688rMo18372i.mo18357I();
            }
            c15688rMo18372i.m18410W(false);
            C11569S.m13483b(c2431dM19473b, null, interfaceC7507eM8525j, C3376c.f10947h, c15688rMo18372i, 48, 0);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: nf.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C17250r.m19692e(z10, function0, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
