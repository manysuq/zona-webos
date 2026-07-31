package p159Ie;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p163J0.C2431d;
import p269Og.EnumC3994g;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p358Tf.C5128k0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
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
import p830w0.InterfaceC18861d;
import p843wd.InterfaceC19009W;
import p845wg.C19097C0;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p862xf.InterfaceC19677a;

/* JADX INFO: renamed from: Ie.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMovieCenterControlsM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MovieCenterControlsM.kt\nru/zona/app/screens/player/controls/movie/MovieCenterControlsMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,95:1\n1282#2,6:96\n113#3:102\n113#3:136\n113#3:137\n113#3:138\n113#3:139\n113#3:140\n99#4,6:103\n106#4:144\n80#5,6:109\n87#5,3:124\n90#5,2:133\n94#5:143\n391#6,9:115\n400#6:135\n401#6,2:141\n4360#7,6:127\n85#8:145\n*S KotlinDebug\n*F\n+ 1 MovieCenterControlsM.kt\nru/zona/app/screens/player/controls/movie/MovieCenterControlsMKt\n*L\n43#1:96,6\n49#1:102\n56#1:136\n64#1:137\n77#1:138\n85#1:139\n92#1:140\n47#1:103,6\n47#1:144\n47#1:109,6\n47#1:124,3\n47#1:133,2\n47#1:143\n47#1:115,9\n47#1:135\n47#1:141,2\n47#1:127,6\n43#1:145\n*E\n"})
public final class C2364b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m3056a(final InterfaceC19009W.b bVar, final InterfaceC19677a.a aVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, final Function0<Unit> function4, InterfaceC15676n interfaceC15676n, final int i10) {
        InterfaceC7507e interfaceC7507e;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1930897137);
        int i11 = i10 | (c15688rMo18372i.mo18350B(bVar) ? 4 : 2) | (c15688rMo18372i.mo18350B(aVar) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function3) ? 131072 : Parser.ARGC_LIMIT) | (c15688rMo18372i.mo18350B(function4) ? 1048576 : 524288);
        if (c15688rMo18372i.mo18379p(i11 & 1, (599187 & i11) != 599186)) {
            boolean z10 = (i11 & 14) == 4 || c15688rMo18372i.mo18362N(bVar);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = C15585G1.m18250e(Boolean.valueOf(bVar.f59292e instanceof InterfaceC19009W.c.C21257c));
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            boolean z11 = aVar.f60714a == EnumC3994g.SERIAL;
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(aVar2, 1.0f);
            C1982e.j jVar = C1982e.f6637a;
            float f10 = 32;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2646h(f10, InterfaceC18861d.a.f58760n), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
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
            C2431d c2431d = C4601b.f15461a;
            C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19140H5.f59811I.getValue(), c15688rMo18372i, 0), new C4600a((C16987h) C19097C0.f59579V0.getValue(), null), false, false, 0L, f10, function0, c15688rMo18372i, ((i11 << 18) & 234881024) | 12582912, 115);
            if (z11) {
                c15688rMo18372i.mo18363O(1552198926);
                C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19101C4.f59703j0.getValue(), c15688rMo18372i, 0), C4601b.m5223r(), false, aVar.f60717d, 0L, f10, function3, c15688rMo18372i, ((i11 << 9) & 234881024) | 12582912, 83);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1552463511);
                c15688rMo18372i.m18410W(false);
            }
            if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(-2068130071);
                InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(aVar2, "test_tag_pause_button");
                c15688rMo18372i.m18410W(false);
                c15688rMo18372i.m18410W(false);
                interfaceC7507e = interfaceC7507eM8700a;
            } else {
                c15688rMo18372i.mo18363O(552068856);
                c15688rMo18372i.m18410W(false);
                interfaceC7507e = aVar2;
            }
            C5128k0.m5617a(interfaceC7507e, null, C16973X.m19466e(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? (C16972W) C19101C4.f59730x.getValue() : (C16972W) C19101C4.f59652I.getValue(), c15688rMo18372i, 0), ((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C4601b.m5219n() : C4601b.m5221p(), false, false, 0L, f10, function1, c15688rMo18372i, ((i11 << 15) & 234881024) | 12582912, 114);
            if (z11) {
                c15688rMo18372i.mo18363O(1552939702);
                C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19278b3.f59951K0.getValue(), c15688rMo18372i, 0), C4601b.m5217l(), false, aVar.f60718e, 0L, f10, function4, c15688rMo18372i, ((i11 << 6) & 234881024) | 12582912, 83);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1553196599);
                c15688rMo18372i.m18410W(false);
            }
            C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19140H5.f59813J.getValue(), c15688rMo18372i, 0), new C4600a((C16987h) C19097C0.f59615p0.getValue(), null), false, false, 0L, f10, function2, c15688rMo18372i, ((i11 << 12) & 234881024) | 12582912, 115);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(aVar, function0, function1, function2, function3, function4, i10) { // from class: Ie.a

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC19677a.a f7752c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f7753d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f7754e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f7755f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function0 f7756g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ Function0 f7757h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(9);
                    C2364b.m3056a(this.f7751b, this.f7752c, this.f7753d, this.f7754e, this.f7755f, this.f7756g, this.f7757h, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
