package p141He;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import p050Cd.InterfaceC0744f;
import p123Ge.C1857h;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p358Tf.C5128k0;
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
import p843wd.InterfaceC19009W;
import p845wg.C19285c2;

/* JADX INFO: renamed from: He.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nChannelBottomControls.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelBottomControls.kt\nru/zona/app/screens/player/controls/channel/ChannelBottomControlsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,65:1\n113#2:66\n113#2:67\n113#2:105\n113#2:106\n99#3,6:68\n106#3:104\n99#3,6:107\n106#3:143\n80#4,6:74\n87#4,3:89\n90#4,2:98\n94#4:103\n80#4,6:113\n87#4,3:128\n90#4,2:137\n94#4:142\n391#5,9:80\n400#5,3:100\n391#5,9:119\n400#5,3:139\n4360#6,6:92\n4360#6,6:131\n*S KotlinDebug\n*F\n+ 1 ChannelBottomControls.kt\nru/zona/app/screens/player/controls/channel/ChannelBottomControlsKt\n*L\n27#1:66\n28#1:67\n50#1:105\n51#1:106\n26#1:68,6\n26#1:104\n49#1:107,6\n49#1:143\n26#1:74,6\n26#1:89,3\n26#1:98,2\n26#1:103\n49#1:113,6\n49#1:128,3\n49#1:137,2\n49#1:142\n26#1:80,9\n26#1:100,3\n49#1:119,9\n49#1:139,3\n26#1:92,6\n49#1:131,6\n*E\n"})
public final class C2169c {
    /* JADX INFO: renamed from: a */
    public static final void m2819a(final InterfaceC19009W.b bVar, final Function0<Unit> function0, final Function0<Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(237091844);
        int i11 = i10 | (c15688rMo18372i.mo18350B(bVar) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), 12);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(4), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) ((j10 >>> 32) ^ j10);
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19285c2.f60036D.getValue(), c15688rMo18372i, 0), bVar.f59294g.f2725c, false, false, 0L, 0.0f, function0, c15688rMo18372i, (i11 << 21) & 234881024, 243);
            C1857h.m2562a(bVar.f59297j, function1, c15688rMo18372i, (i11 >> 3) & 112);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function0, function1, i10) { // from class: He.b

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f7156c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f7157d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(9);
                    C2169c.m2819a(this.f7155b, this.f7156c, this.f7157d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2820b(final InterfaceC19009W.b bVar, final Function0<Unit> function0, final Function0<Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(589525091);
        int i11 = i10 | (c15688rMo18372i.mo18350B(bVar) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), 24);
            C1982e.j jVar = C1982e.f6637a;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2646h(16, InterfaceC18861d.a.f58760n), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) ((j10 >>> 32) ^ j10);
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            int i13 = i11 >> 3;
            C1857h.m2563b(bVar.f59297j, function1, c15688rMo18372i, i13 & 112);
            InterfaceC0744f.a aVar2 = bVar.f59294g;
            C5128k0.m5618b(null, C16973X.m19466e(aVar2.f2724b, c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19285c2.f60036D.getValue(), c15688rMo18372i, 0), aVar2.f2725c, null, null, false, false, 0L, null, function0, c15688rMo18372i, 0, i13 & 14, 1009);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function0, function1, i10) { // from class: He.a

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f7153c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f7154d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(9);
                    C2169c.m2820b(this.f7152b, this.f7153c, this.f7154d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
