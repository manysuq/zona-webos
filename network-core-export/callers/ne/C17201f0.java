package ne;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8150J;
import bf.C8245x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3376c;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p607i9.C12269M6;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;

/* JADX INFO: renamed from: ne.f0 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPlayButtonsGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayButtonsGroup.kt\nru/zona/app/screens/content/compositions/PlayButtonsGroupKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n113#2:69\n113#2:70\n113#2:71\n113#2:114\n113#2:115\n87#3:72\n85#3,8:73\n94#3:119\n80#4,6:81\n87#4,3:96\n90#4,2:105\n94#4:118\n391#5,9:87\n400#5:107\n401#5,2:116\n4360#6,6:99\n1282#7,6:108\n*S KotlinDebug\n*F\n+ 1 PlayButtonsGroup.kt\nru/zona/app/screens/content/compositions/PlayButtonsGroupKt\n*L\n31#1:69\n32#1:70\n33#1:71\n51#1:114\n59#1:115\n28#1:72\n28#1:73,8\n28#1:119\n28#1:81,6\n28#1:96,3\n28#1:105,2\n28#1:118\n28#1:87,9\n28#1:107\n28#1:116,2\n28#1:99,6\n37#1:108,6\n*E\n"})
public final class C17201f0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX INFO: renamed from: a */
    public static final void m19673a(final String str, final boolean z10, final boolean z11, final Function0<Unit> function0, final Function0<Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15634Y0 c15634y0M18412Y;
        Function2<? super InterfaceC15676n, ? super Integer, Unit> function2;
        boolean z12;
        C15688r c15688r2;
        ?? r10;
        C15688r c15688r3;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(655571831);
        int iM18418e0 = c15688rMo18372i.m18418e0();
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18364a(z10) ? 32 : 16) | (c15688rMo18372i.mo18364a(z11) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 9363) != 9362)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(C7481f.m8513f(C7482g.m8518c(aVar, 1.0f), f10, 0.0f, 2), 0.0f, 0.0f, 0.0f, f10, 7);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(8), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
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
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            c15688rMo18372i.mo18363O(-1447552444);
            if (z11) {
                c15688rMo18372i.mo18363O(-1447561869);
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new C17195c0(0);
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C8245x0.m10154a(null, (Function0) objMo18389z, "", null, null, false, false, true, 0L, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, 12583344, 0, 16249);
                c15688rMo18372i.m18415b0(iM18418e0);
                c15634y0M18412Y = c15688rMo18372i.m18412Y();
                if (c15634y0M18412Y == null) {
                    return;
                } else {
                    function2 = new Function2(str, z10, z11, function0, function1, i10) { // from class: ne.d0

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ String f53954b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ boolean f53955c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ boolean f53956d;

                        /* JADX INFO: renamed from: e */
                        public final /* synthetic */ Function0 f53957e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ Function0 f53958f;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM18294a = C15636Z0.m18294a(1);
                            C17201f0.m19673a(this.f53954b, this.f53955c, this.f53956d, this.f53957e, this.f53958f, (InterfaceC15676n) obj, iM18294a);
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                c15688rMo18372i.mo18363O(-1447406187);
                c15688rMo18372i.m18410W(false);
                if (function0 == null) {
                    c15688rMo18372i.mo18363O(-1447358169);
                    c15688rMo18372i.m18410W(false);
                    r10 = 0;
                } else {
                    c15688rMo18372i.mo18363O(-1447358168);
                    float f11 = 12;
                    C8245x0.m10154a(C7586d.m8700a(aVar, "test_tag_watch_content_button"), function0, str, null, C4601b.m5222q(), false, false, false, 0L, 0L, z10 ? C1982e.f6637a : C1982e.f6641e, f11, 0.0f, false, c15688rMo18372i, ((i11 >> 6) & 112) | 6 | ((i11 << 6) & 896), 48, 13288);
                    C15688r c15688r4 = c15688rMo18372i;
                    if (function1 == null) {
                        c15688r4.mo18363O(1638643953);
                        z12 = false;
                        c15688r4.m18410W(false);
                        c15688r2 = c15688r4;
                    } else {
                        c15688r4.mo18363O(1638643954);
                        C8245x0.m10154a(null, function1, C16973X.m19466e((C16972W) C19140H5.f59831S.getValue(), c15688r4, 0), null, C4601b.m5216k(), false, false, false, C3376c.f10944e, 0L, C1982e.f6637a, f11, 0.0f, false, c15688r4, (i11 >> 9) & 112, 54, 13033);
                        C15688r c15688r5 = c15688r4;
                        z12 = false;
                        c15688r5.m18410W(false);
                        Unit unit = Unit.INSTANCE;
                        c15688r2 = c15688r5;
                    }
                    c15688r2.m18410W(z12);
                    c15688r3 = c15688r2;
                    r10 = z12;
                }
                if (function0 == null) {
                    c15688r3 = c15688rMo18372i;
                    c15688r3.mo18363O(-877946621);
                    C8150J.m10125a(r10, c15688r3);
                } else {
                    c15688r3 = c15688rMo18372i;
                    c15688r3.mo18363O(-1446520331);
                }
                c15688r3.m18410W(r10);
                c15688r3.m18410W(r10);
                c15688r3.m18410W(true);
                c15688r = c15688r3;
            }
            c15634y0M18412Y.f50634d = function2;
        }
        c15688rMo18372i.mo18356H();
        c15688r = c15688rMo18372i;
        c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            function2 = new Function2(str, z10, z11, function0, function1, i10) { // from class: ne.e0

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f53961b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f53962c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f53963d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f53964e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f53965f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17201f0.m19673a(this.f53961b, this.f53962c, this.f53963d, this.f53964e, this.f53965f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
            c15634y0M18412Y.f50634d = function2;
        }
    }
}
