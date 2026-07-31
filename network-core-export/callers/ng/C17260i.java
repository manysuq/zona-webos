package ng;

import android.content.Context;
import android.os.Build;
import androidx.compose.p481ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p034Bf.EnumC0448a;
import p107Fg.C1634b;
import p125Gg.EnumC1896d;
import p163J0.C2431d;
import p250Nf.C3765d;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p358Tf.C5128k0;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p817v1.C18565g;
import p845wg.C19097C0;
import p845wg.C19101C4;
import ru.zona.app.pip.C18005b;

/* JADX INFO: renamed from: ng.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPiPButton.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PiPButton.android.kt\nru/zona/app/utils/platform/PiPButton_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,39:1\n75#2:40\n75#2:41\n75#2:42\n1282#3,6:43\n1282#3,6:50\n113#4:49\n*S KotlinDebug\n*F\n+ 1 PiPButton.android.kt\nru/zona/app/utils/platform/PiPButton_androidKt\n*L\n21#1:40\n22#1:41\n23#1:42\n29#1:43,6\n35#1:50,6\n34#1:49\n*E\n"})
public final class C17260i {
    /* JADX INFO: renamed from: a */
    public static final void m19694a(final EnumC0448a enumC0448a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15634Y0 c15634y0M18412Y;
        Function2<? super InterfaceC15676n, ? super Integer, Unit> function2;
        boolean z10;
        boolean z11;
        boolean zHasSystemFeature;
        boolean z12;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(268769409);
        if (c15688rMo18372i.mo18379p(i10 & 1, (i10 & 3) != 2)) {
            if (Build.VERSION.SDK_INT < 26) {
                c15688rMo18372i.mo18363O(1090468065);
                c15688rMo18372i.m18410W(false);
                z10 = true;
            } else {
                c15688rMo18372i.mo18363O(589367497);
                z10 = c15688rMo18372i.mo18383t(C3765d.f12328a) == EnumC1896d.Tv;
                c15688rMo18372i.m18410W(false);
            }
            if (z10) {
                c15688rMo18372i.mo18363O(1090469677);
                c15688rMo18372i.m18410W(false);
                z11 = true;
            } else {
                c15688rMo18372i.mo18363O(589369161);
                z11 = c15688rMo18372i.mo18383t(C3765d.f12328a) == EnumC1896d.Pc;
                c15688rMo18372i.m18410W(false);
            }
            if (z11) {
                c15688rMo18372i.mo18363O(1090471289);
                c15688rMo18372i.m18410W(false);
                z12 = true;
            } else {
                c15688rMo18372i.mo18363O(589370860);
                C1634b c1634b = C18005b.f55989e;
                try {
                    zHasSystemFeature = ((Context) c15688rMo18372i.mo18383t(AndroidCompositionLocals_androidKt.f24864b)).getPackageManager().hasSystemFeature("android.software.picture_in_picture");
                } catch (Exception unused) {
                    C18005b.f55989e.getClass();
                    zHasSystemFeature = false;
                }
                z12 = !zHasSystemFeature;
                c15688rMo18372i.m18410W(false);
            }
            if (z12) {
                c15634y0M18412Y = c15688rMo18372i.m18412Y();
                if (c15634y0M18412Y == null) {
                    return;
                } else {
                    function2 = new Function2(i10) { // from class: ng.e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM18294a = C15636Z0.m18294a(7);
                            C17260i.m19694a(this.f54090b, (InterfaceC15676n) obj, iM18294a);
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                int iOrdinal = enumC0448a.ordinal();
                InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                if (iOrdinal == 0) {
                    c15688rMo18372i.mo18363O(1090985373);
                    C2431d c2431d = C4601b.f15461a;
                    C4600a c4600a = new C4600a((C16987h) C19097C0.f59565O0.getValue(), null);
                    String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59650H.getValue(), c15688rMo18372i, 0);
                    C18565g c18565g = new C18565g(20);
                    Object objMo18389z = c15688rMo18372i.mo18389z();
                    if (objMo18389z == c21235a) {
                        objMo18389z = new C17258g(0);
                        c15688rMo18372i.mo18380q(objMo18389z);
                    }
                    C5128k0.m5618b(null, null, strM19466e, c4600a, c18565g, null, false, false, 0L, null, (Function0) objMo18389z, c15688rMo18372i, 24576, 6, 995);
                    c15688rMo18372i = c15688rMo18372i;
                    c15688rMo18372i.m18410W(false);
                } else {
                    if (iOrdinal != 1) {
                        c15688rMo18372i.mo18363O(589374289);
                        c15688rMo18372i.m18410W(false);
                        throw new NoWhenBranchMatchedException();
                    }
                    c15688rMo18372i.mo18363O(1090766172);
                    C2431d c2431d2 = C4601b.f15461a;
                    C4600a c4600a2 = new C4600a((C16987h) C19097C0.f59565O0.getValue(), null);
                    String strM19466e2 = C16973X.m19466e((C16972W) C19101C4.f59650H.getValue(), c15688rMo18372i, 0);
                    Object objMo18389z2 = c15688rMo18372i.mo18389z();
                    if (objMo18389z2 == c21235a) {
                        objMo18389z2 = new C17257f(0);
                        c15688rMo18372i.mo18380q(objMo18389z2);
                    }
                    C5128k0.m5617a(null, null, strM19466e2, c4600a2, false, false, 0L, 0.0f, (Function0) objMo18389z2, c15688rMo18372i, 100663296, 243);
                    c15688rMo18372i.m18410W(false);
                }
            }
            c15634y0M18412Y.f50634d = function2;
        }
        c15688rMo18372i.mo18356H();
        c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            function2 = new Function2(i10) { // from class: ng.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(7);
                    C17260i.m19694a(this.f54093b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
            c15634y0M18412Y.f50634d = function2;
        }
    }
}
