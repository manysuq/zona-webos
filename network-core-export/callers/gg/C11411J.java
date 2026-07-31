package gg;

import androidx.compose.foundation.layout.C7479d;
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
import p017Ag.C0154l;
import p017Ag.C0165w;
import p019B0.C0173B;
import p086Ed.InterfaceC1406n;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p126H.EnumC2007m0;
import p214Lf.C3375b;
import p288Q.C4286K0;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p640jf.C15456E0;
import p640jf.C15536p0;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15658h;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15612P1;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: gg.J */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nWaitToConfirmScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitToConfirmScreenTv.kt\nru/zona/app/ui/tv/profile/login/WaitToConfirmScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,103:1\n1282#2,6:104\n1282#2,6:110\n1282#2,6:195\n1282#2,6:201\n85#3:116\n87#4:117\n83#4,10:118\n87#4:159\n85#4,8:160\n94#4:210\n94#4:214\n80#5,6:128\n87#5,3:143\n90#5,2:152\n80#5,6:168\n87#5,3:183\n90#5,2:192\n94#5:209\n94#5:213\n391#6,9:134\n400#6:154\n391#6,9:174\n400#6:194\n401#6,2:207\n401#6,2:211\n4360#7,6:146\n4360#7,6:186\n113#8:155\n113#8:156\n113#8:157\n113#8:158\n*S KotlinDebug\n*F\n+ 1 WaitToConfirmScreenTv.kt\nru/zona/app/ui/tv/profile/login/WaitToConfirmScreenTvKt\n*L\n42#1:104,6\n46#1:110,6\n75#1:195,6\n87#1:201,6\n40#1:116\n54#1:117\n54#1:118,10\n65#1:159\n65#1:160,8\n65#1:210\n54#1:214\n54#1:128,6\n54#1:143,3\n54#1:152,2\n65#1:168,6\n65#1:183,3\n65#1:192,2\n65#1:209\n54#1:213\n54#1:134,9\n54#1:154\n65#1:174,9\n65#1:194\n65#1:207,2\n54#1:211,2\n54#1:146,6\n65#1:186,6\n56#1:155\n63#1:156\n68#1:157\n69#1:158\n*E\n"})
public final class C11411J {

    /* JADX INFO: renamed from: gg.J$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.login.WaitToConfirmScreenTvKt$WaitToConfirmScreenTv$1$1", m18778f = "WaitToConfirmScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f35505j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35505j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f35505j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f35505j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13425a(final InterfaceC1406n interfaceC1406n, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1529553476);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1406n) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1406n.mo1953b().f562b, c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b = (C0173B) objMo18389z;
            final String strM19466e = C16973X.m19466e((C16972W) C19278b3.f59964R.getValue(), c15688rMo18372i, 0);
            Unit unit = Unit.INSTANCE;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z2);
            C15536p0.m18135a(C16973X.m19466e((C16972W) C19140H5.f59843a.getValue(), c15688rMo18372i, 0), interfaceC1406n.mo1952a(), null, false, null, null, null, C18037u.m20404c(-769675881, new Function2() { // from class: gg.F
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C1982e.k kVar = C1982e.f6639c;
                        C18863f.a aVar = InterfaceC18861d.a.f58759m;
                        C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar2, interfaceC15676n2);
                        InterfaceC5799g.f19145s1.getClass();
                        C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar3);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, dVar);
                        InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, fVar);
                        InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i12))) {
                            C1961V0.m2622a(i12, interfaceC15676n2, i12, c21098a);
                        }
                        InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, eVar);
                        C1963W0.m2623a(C7482g.m8519d(aVar2, 8), interfaceC15676n2);
                        C16972W c16972w = (C16972W) C19285c2.f60093h0.getValue();
                        final InterfaceC1406n interfaceC1406n2 = interfaceC1406n;
                        C11565Q2.m13480b(C16973X.m19467f(c16972w, new Object[]{interfaceC1406n2.mo1954c()}, interfaceC15676n2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, interfaceC15676n2, 0, 0, 131070);
                        C1963W0.m2623a(C7482g.m8519d(aVar2, 24), interfaceC15676n2);
                        EnumC2007m0 enumC2007m0 = EnumC2007m0.f6718b;
                        InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(C7479d.m8504b(aVar2), 400, 0.0f, 2);
                        C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.m2645g(16), aVar, interfaceC15676n2, 6);
                        long jMo18375l2 = interfaceC15676n2.mo18375l();
                        int i13 = (int) (jMo18375l2 ^ (jMo18375l2 >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n2 = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8530o, interfaceC15676n2);
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar3);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c2036xM2689a2, interfaceC15676n2, dVar);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n2, interfaceC15676n2, fVar);
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i13))) {
                            C1961V0.m2622a(i13, interfaceC15676n2, i13, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c2, interfaceC15676n2, eVar);
                        InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar2, 1.0f);
                        String strM19466e2 = C16973X.m19466e((C16972W) C19140H5.f59891y.getValue(), interfaceC15676n2, 0);
                        boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC1406n2);
                        final String str = strM19466e;
                        boolean zMo18362N = zMo18350B | interfaceC15676n2.mo18362N(str);
                        Object objMo18389z3 = interfaceC15676n2.mo18389z();
                        InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
                        if (zMo18362N || objMo18389z3 == c21235a2) {
                            objMo18389z3 = new Function0() { // from class: gg.H
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    InterfaceC1406n interfaceC1406n3 = interfaceC1406n2;
                                    interfaceC1406n3.mo1957f();
                                    interfaceC1406n3.mo1956e().mo19497b(str);
                                    return Unit.INSTANCE;
                                }
                            };
                            interfaceC15676n2.mo18380q(objMo18389z3);
                        }
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        C15456E0.m18110a(interfaceC7507eM8518c, null, strM19466e2, null, null, false, (Function0) objMo18389z3, false, C0165w.m221c((C0154l) interfaceC15612P1.getValue()), false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, C0165w.m220b((C0154l) interfaceC15612P1.getValue()), null, interfaceC15676n2, 24582, 0, 392874);
                        InterfaceC7507e interfaceC7507eM8518c2 = C7482g.m8518c(aVar2, 1.0f);
                        String strM19466e3 = C16973X.m19466e((C16972W) C19278b3.f59970U.getValue(), interfaceC15676n2, 0);
                        boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC1406n2);
                        Object objMo18389z4 = interfaceC15676n2.mo18389z();
                        if (zMo18350B2 || objMo18389z4 == c21235a2) {
                            objMo18389z4 = new Function0() { // from class: gg.I
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    interfaceC1406n2.mo1955d();
                                    return Unit.INSTANCE;
                                }
                            };
                            interfaceC15676n2.mo18380q(objMo18389z4);
                        }
                        C15456E0.m18110a(interfaceC7507eM8518c2, null, strM19466e3, null, null, false, (Function0) objMo18389z4, false, C0165w.m221c((C0154l) interfaceC15612P1.getValue()), false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, interfaceC15676n2, 24582, 0, 523946);
                        C15456E0.m18110a(C7482g.m8518c(aVar2, 1.0f), null, C16973X.m19466e((C16972W) C19119E6.f59783o.getValue(), interfaceC15676n2, 0), null, C4601b.m5215j(), false, interfaceC1406n2.mo1958g(), false, C0165w.m221c((C0154l) interfaceC15612P1.getValue()), false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, interfaceC15676n2, 6, 6, 522922);
                        interfaceC15676n2.mo18381r();
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 100663296, 252);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: gg.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11411J.m13425a(this.f35501b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
