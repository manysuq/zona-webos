package p611ig;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p019B0.C0173B;
import p034Bf.EnumC0448a;
import p055D0.C0946M0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p194Kd.C2992j;
import p194Kd.C2993k;
import p214Lf.C3376c;
import p288Q.C4286K0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p607i9.C12269M6;
import p640jf.C15496Z;
import p640jf.C15518g1;
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
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19285c2;

/* JADX INFO: renamed from: ig.m */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainSettingsScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSettingsScreenTv.kt\nru/zona/app/ui/tv/profile/settings/MainSettingsScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,94:1\n1282#2,6:95\n1282#2,6:101\n113#3:107\n113#3:145\n113#3:146\n113#3:147\n87#4:108\n84#4,9:109\n87#4:148\n85#4,8:149\n94#4:187\n94#4:191\n80#5,6:118\n87#5,3:133\n90#5,2:142\n80#5,6:157\n87#5,3:172\n90#5,2:181\n94#5:186\n94#5:190\n391#6,9:124\n400#6:144\n391#6,9:163\n400#6,3:183\n401#6,2:188\n4360#7,6:136\n4360#7,6:175\n85#8:192\n85#8:193\n*S KotlinDebug\n*F\n+ 1 MainSettingsScreenTv.kt\nru/zona/app/ui/tv/profile/settings/MainSettingsScreenTvKt\n*L\n41#1:95,6\n43#1:101,6\n51#1:107\n59#1:145\n62#1:146\n63#1:147\n47#1:108\n47#1:109,9\n61#1:148\n61#1:149,8\n61#1:187\n47#1:191\n47#1:118,6\n47#1:133,3\n47#1:142,2\n61#1:157,6\n61#1:172,3\n61#1:181,2\n61#1:186\n47#1:190\n47#1:124,9\n47#1:144\n61#1:163,9\n61#1:183,3\n47#1:188,2\n47#1:136,6\n61#1:175,6\n38#1:192\n39#1:193\n*E\n"})
public final class C12994m {

    /* JADX INFO: renamed from: ig.m$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.settings.MainSettingsScreenTvKt$MainSettingsScreenTv$1$1", m18778f = "MainSettingsScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f43655j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f43655j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f43655j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f43655j);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m14728a(final C2992j c2992j, InterfaceC15676n interfaceC15676n, final int i10) {
        String strM19466e;
        String strM19466e2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2041351330);
        int i11 = (c15688rMo18372i.mo18362N(c2992j) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(c2992j.m3712e().getSettings(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(c2992j.m3712e().mo3698b(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z2);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 20;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(C7468a.m8487b(C7482g.m8517b(aVar, 1.0f), C3376c.f10940a, C0946M0.f3382a), f10, 8, f10, 0.0f, 8);
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar2 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            C15518g1.m18129a(C16973X.m19466e((C16972W) C19140H5.f59852e0.getValue(), c15688rMo18372i, 0), null, c0173b, c2992j.m3708a(), null, c15688rMo18372i, 384, 50);
            C1963W0.m2623a(C7482g.m8519d(aVar, 16), c15688rMo18372i);
            float f11 = 56;
            InterfaceC7507e interfaceC7507eM8515h2 = C7481f.m8515h(aVar, f11, 0.0f, f11, 0.0f, 10);
            C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.m2645g(12), aVar2, c15688rMo18372i, 6);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8515h2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            String strM19466e3 = C16973X.m19466e((C16972W) C19119E6.f59792x.getValue(), c15688rMo18372i, 0);
            if (((C2993k) interfaceC15701v0M18246a.getValue()).f9882b) {
                c15688rMo18372i.mo18363O(1428113179);
                strM19466e = C16973X.m19466e((C16972W) C19119E6.f59744I.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1428203575);
                strM19466e = C16973X.m19466e((C16972W) C19101C4.f59686b.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            }
            String str = strM19466e;
            long j12 = C3376c.f10942c;
            C15496Z.m18124a(null, strM19466e3, 0L, null, null, str, j12, null, null, c2992j.m3711d(), false, c15688rMo18372i, 0, 0, 1437);
            C15496Z.m18124a(null, C16973X.m19466e((C16972W) C19285c2.f60100l.getValue(), c15688rMo18372i, 0), 0L, null, null, ((C2993k) interfaceC15701v0M18246a.getValue()).f9881a, j12, null, null, c2992j.m3709b(), false, c15688rMo18372i, 0, 0, 1437);
            String strM19466e4 = C16973X.m19466e((C16972W) C19285c2.f60124x.getValue(), c15688rMo18372i, 0);
            if (((EnumC0448a) interfaceC15701v0M18246a2.getValue()) == EnumC0448a.f1797d) {
                c15688rMo18372i.mo18363O(1428837339);
                strM19466e2 = C16973X.m19466e((C16972W) C19140H5.f59880s0.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1428927363);
                strM19466e2 = C16973X.m19466e((C16972W) C19119E6.f59791w.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            }
            C15496Z.m18124a(null, strM19466e4, 0L, null, null, strM19466e2, j12, null, null, c2992j.m3710c(), false, c15688rMo18372i, 0, 0, 1437);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: ig.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C12994m.m14728a(this.f43654b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
