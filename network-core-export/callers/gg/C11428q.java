package gg;

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
import p055D0.C0946M0;
import p122Gd.C1825e;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p288Q.C4286K0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p607i9.C12269M6;
import p640jf.C15456E0;
import p640jf.C15518g1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: gg.q */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nErrorScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorScreenTv.kt\nru/zona/app/ui/tv/profile/login/ErrorScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,75:1\n1282#2,6:76\n1282#2,6:82\n113#3:88\n113#3:126\n113#3:127\n113#3:165\n113#3:166\n113#3:167\n87#4:89\n84#4,9:90\n87#4:128\n84#4,9:129\n94#4:171\n94#4:175\n80#5,6:99\n87#5,3:114\n90#5,2:123\n80#5,6:138\n87#5,3:153\n90#5,2:162\n94#5:170\n94#5:174\n391#6,9:105\n400#6:125\n391#6,9:144\n400#6:164\n401#6,2:168\n401#6,2:172\n4360#7,6:117\n4360#7,6:156\n*S KotlinDebug\n*F\n+ 1 ErrorScreenTv.kt\nru/zona/app/ui/tv/profile/login/ErrorScreenTvKt\n*L\n31#1:76,6\n33#1:82,6\n41#1:88\n48#1:126\n50#1:127\n57#1:165\n64#1:166\n67#1:167\n37#1:89\n37#1:90,9\n50#1:128\n50#1:129,9\n50#1:171\n37#1:175\n37#1:99,6\n37#1:114,3\n37#1:123,2\n50#1:138,6\n50#1:153,3\n50#1:162,2\n50#1:170\n37#1:174\n37#1:105,9\n37#1:125\n50#1:144,9\n50#1:164\n50#1:168,2\n37#1:172,2\n37#1:117,6\n50#1:156,6\n*E\n"})
public final class C11428q {

    /* JADX INFO: renamed from: gg.q$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.login.ErrorScreenTvKt$ErrorScreenTv$1$1", m18778f = "ErrorScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f35536j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35536j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f35536j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f35536j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13430a(final C1825e c1825e, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(384503820);
        int i11 = (c15688rMo18372i.mo18362N(c1825e) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
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
            C15518g1.m18129a(c1825e.m2540c(), null, null, c1825e.m2539b(), null, c15688rMo18372i, 0, 54);
            C1963W0.m2623a(C7482g.m8519d(aVar, 16), c15688rMo18372i);
            float f11 = 56;
            InterfaceC7507e interfaceC7507eM8515h2 = C7481f.m8515h(aVar, f11, 0.0f, f11, 0.0f, 10);
            C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
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
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60073V0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10919b, c15688rMo18372i, 0, 0, 131070);
            float f12 = 24;
            C1963W0.m2623a(C7482g.m8519d(aVar, f12), c15688rMo18372i);
            C11565Q2.m13480b(c1825e.m2538a(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, f12), c15688rMo18372i);
            C15456E0.m18110a(C7482g.m8529n(aVar, 400), null, C16973X.m19466e((C16972W) C19278b3.f60020v.getValue(), c15688rMo18372i, 0), null, null, false, c1825e.m2539b(), false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 6, 6, 523194);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: gg.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11428q.m13430a(this.f35535b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
