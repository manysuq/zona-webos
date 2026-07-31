package p177Je;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import p050Cd.InterfaceC0744f;
import p123Ge.C1857h;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p304Qf.C4600a;
import p304Qf.C4601b;
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
import p845wg.C19101C4;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Je.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSportBottomContols.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportBottomContols.kt\nru/zona/app/screens/player/controls/sport/SportBottomContolsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,94:1\n113#2:95\n113#2:137\n113#2:138\n99#3:96\n96#3,9:97\n106#3:136\n99#3:139\n97#3,8:140\n106#3:178\n80#4,6:106\n87#4,3:121\n90#4,2:130\n94#4:135\n80#4,6:148\n87#4,3:163\n90#4,2:172\n94#4:177\n391#5,9:112\n400#5,3:132\n391#5,9:154\n400#5,3:174\n4360#6,6:124\n4360#6,6:166\n1282#7,6:179\n1282#7,6:185\n1282#7,6:191\n*S KotlinDebug\n*F\n+ 1 SportBottomContols.kt\nru/zona/app/screens/player/controls/sport/SportBottomContolsKt\n*L\n32#1:95\n62#1:137\n63#1:138\n31#1:96\n31#1:97,9\n31#1:136\n61#1:139\n61#1:140,8\n61#1:178\n31#1:106,6\n31#1:121,3\n31#1:130,2\n31#1:135\n61#1:148,6\n61#1:163,3\n61#1:172,2\n61#1:177\n31#1:112,9\n31#1:132,3\n61#1:154,9\n61#1:174,3\n31#1:124,6\n61#1:166,6\n90#1:179,6\n91#1:185,6\n92#1:191,6\n*E\n"})
public final class C2577c {
    /* JADX INFO: renamed from: a */
    public static final void m3368a(final boolean z10, final InterfaceC0744f.a aVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1385831382);
        int i11 = i10 | (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | (c15688rMo18372i.mo18368e(aVar.ordinal()) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 9363) != 9362)) {
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), 12);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58757k, c15688rMo18372i, 48);
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
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C4600a c4600aM5228w = C4601b.m5228w();
            Lazy lazy = C19101C4.f59731x0;
            C5128k0.m5617a(null, C16973X.m19466e((C16972W) lazy.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) lazy.getValue(), c15688rMo18372i, 0), c4600aM5228w, false, false, 0L, 0.0f, function2, c15688rMo18372i, (i11 << 12) & 234881024, 241);
            C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19285c2.f60036D.getValue(), c15688rMo18372i, 0), aVar.f2725c, false, false, 0L, 0.0f, function1, c15688rMo18372i, (i11 << 15) & 234881024, 243);
            C1857h.m2562a(z10, function0, c15688rMo18372i, (i11 & 14) | ((i11 >> 3) & 112));
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, aVar, function0, function1, function2, i10) { // from class: Je.b

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f8637b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC0744f.a f8638c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f8639d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f8640e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f8641f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C2577c.m3368a(this.f8637b, this.f8638c, this.f8639d, this.f8640e, this.f8641f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3369b(final boolean z10, final InterfaceC0744f.a aVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1178537517);
        int i11 = i10 | (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | (c15688rMo18372i.mo18368e(aVar.ordinal()) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 9363) != 9362)) {
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), 24);
            C1982e.j jVar = C1982e.f6637a;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2646h(16, InterfaceC18861d.a.f58760n), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
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
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C1857h.m2563b(z10, function0, c15688rMo18372i, (i11 & 14) | ((i11 >> 3) & 112));
            C4600a c4600aM5228w = C4601b.m5228w();
            Lazy lazy = C19101C4.f59731x0;
            C5128k0.m5618b(null, C16973X.m19466e((C16972W) lazy.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) lazy.getValue(), c15688rMo18372i, 0), c4600aM5228w, null, null, false, false, 0L, null, function2, c15688rMo18372i, 0, (i11 >> 12) & 14, 1009);
            C5128k0.m5618b(null, C16973X.m19466e(aVar.f2724b, c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19285c2.f60036D.getValue(), c15688rMo18372i, 0), aVar.f2725c, null, null, false, false, 0L, null, function1, c15688rMo18372i, 0, (i11 >> 9) & 14, 1009);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, aVar, function0, function1, function2, i10) { // from class: Je.a

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f8632b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC0744f.a f8633c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f8634d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f8635e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f8636f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C2577c.m3369b(this.f8632b, this.f8633c, this.f8634d, this.f8635e, this.f8636f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
