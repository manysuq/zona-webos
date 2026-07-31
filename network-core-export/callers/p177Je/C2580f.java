package p177Je;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p019B0.C0173B;
import p126H.C2000k;
import p288Q.C4286K0;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p358Tf.C5128k0;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18565g;
import p830w0.InterfaceC18861d;
import p843wd.InterfaceC19009W;
import p845wg.C19101C4;

/* JADX INFO: renamed from: Je.f */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSportCenterControls.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportCenterControls.kt\nru/zona/app/screens/player/controls/sport/SportCenterControlsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n1282#2,6:78\n1282#2,6:125\n1282#2,6:131\n1282#2,6:137\n70#3:84\n68#3,8:85\n77#3:124\n70#3:143\n68#3,8:144\n77#3:183\n80#4,6:93\n87#4,3:108\n90#4,2:117\n94#4:123\n80#4,6:152\n87#4,3:167\n90#4,2:176\n94#4:182\n391#5,9:99\n400#5:119\n401#5,2:121\n391#5,9:158\n400#5:178\n401#5,2:180\n4360#6,6:111\n4360#6,6:170\n113#7:120\n113#7:179\n85#8:184\n85#8:185\n*S KotlinDebug\n*F\n+ 1 SportCenterControls.kt\nru/zona/app/screens/player/controls/sport/SportCenterControlsKt\n*L\n31#1:78,6\n56#1:125,6\n59#1:131,6\n60#1:137,6\n34#1:84\n34#1:85,8\n34#1:124\n63#1:143\n63#1:144,8\n63#1:183\n34#1:93,6\n34#1:108,3\n34#1:117,2\n34#1:123\n63#1:152,6\n63#1:167,3\n63#1:176,2\n63#1:182\n34#1:99,9\n34#1:119\n34#1:121,2\n63#1:158,9\n63#1:178\n63#1:180,2\n34#1:111,6\n63#1:170,6\n42#1:120\n71#1:179\n31#1:184\n56#1:185\n*E\n"})
public final class C2580f {

    /* JADX INFO: renamed from: Je.f$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.player.controls.sport.SportCenterControlsKt$SportCenterControlsTv$1$1", m18778f = "SportCenterControls.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f8646j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8646j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f8646j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f8646j);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m3370a(final InterfaceC19009W.b bVar, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        C16972W c16972w;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2032913183);
        int i11 = (c15688rMo18372i.mo18350B(bVar) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function0) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            boolean z10 = (i11 & 14) == 4 || c15688rMo18372i.mo18362N(bVar);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = C15585G1.m18250e(Boolean.valueOf(bVar.f59292e instanceof InterfaceC19009W.c.C21257c));
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(InterfaceC7507e.a.f24548b, 1.0f);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
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
            C4600a c4600aM5219n = ((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C4601b.m5219n() : C4601b.m5221p();
            float f10 = 32;
            if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                c15688rMo18372i.mo18363O(1832462215);
                c16972w = (C16972W) C19101C4.f59730x.getValue();
            } else {
                c15688rMo18372i.mo18363O(1832463460);
                c16972w = (C16972W) C19101C4.f59652I.getValue();
            }
            String strM19466e = C16973X.m19466e(c16972w, c15688rMo18372i, 0);
            c15688rMo18372i.m18410W(false);
            C5128k0.m5617a(null, null, strM19466e, c4600aM5219n, false, false, 0L, f10, function0, c15688rMo18372i, ((i11 << 21) & 234881024) | 12582912, 115);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function0, i10) { // from class: Je.d

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f8643c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(9);
                    C2580f.m3370a(this.f8642b, this.f8643c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m3371b(final InterfaceC19009W.b bVar, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1814842538);
        int i11 = i10 | (c15688rMo18372i.mo18350B(bVar) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            boolean z10 = (i11 & 14) == 4 || c15688rMo18372i.mo18362N(bVar);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (z10 || objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.valueOf(bVar.f59292e instanceof InterfaceC19009W.c.C21257c));
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z2;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z3);
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(InterfaceC7507e.a.f24548b, 1.0f);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
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
            C5128k0.m5618b(null, null, C16973X.m19466e(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? (C16972W) C19101C4.f59730x.getValue() : (C16972W) C19101C4.f59652I.getValue(), c15688rMo18372i, 0), ((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C4601b.m5219n() : C4601b.m5221p(), new C18565g(48), null, false, false, 0L, c0173b, function0, c15688rMo18372i, 805330944, (i11 >> 3) & 14, 483);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function0, i10) { // from class: Je.e

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f8645c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(9);
                    C2580f.m3371b(this.f8644b, this.f8645c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
