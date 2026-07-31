package p375Ue;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
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
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p212Ld.InterfaceC3328a;
import p214Lf.C3375b;
import p288Q.C4286K0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p640jf.C15536p0;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15658h;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p658kf.C15877o;
import p689mb.C16973X;
import p775s0.C18037u;
import p830w0.InterfaceC18861d;
import p881z.C20541F0;

/* JADX INFO: renamed from: Ue.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSimpleSettingTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleSettingTv.kt\nru/zona/app/screens/profile/settings/simple/SimpleSettingTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1282#2,6:72\n1282#2,6:78\n1282#2,6:162\n85#3:84\n113#4:85\n113#4:86\n113#4:123\n113#4:124\n113#4:169\n99#5:87\n97#5,8:88\n106#5:177\n80#6,6:96\n87#6,3:111\n90#6,2:120\n80#6,6:134\n87#6,3:149\n90#6,2:158\n94#6:172\n94#6:176\n391#7,9:102\n400#7:122\n391#7,9:140\n400#7:160\n401#7,2:170\n401#7,2:174\n4360#8,6:114\n4360#8,6:152\n87#9:125\n85#9,8:126\n94#9:173\n2068#10:161\n2069#10:168\n*S KotlinDebug\n*F\n+ 1 SimpleSettingTv.kt\nru/zona/app/screens/profile/settings/simple/SimpleSettingTvKt\n*L\n35#1:72,6\n37#1:78,6\n60#1:162,6\n33#1:84\n47#1:85\n48#1:86\n53#1:123\n54#1:124\n63#1:169\n46#1:87\n46#1:88,8\n46#1:177\n46#1:96,6\n46#1:111,3\n46#1:120,2\n50#1:134,6\n50#1:149,3\n50#1:158,2\n50#1:172\n46#1:176\n46#1:102,9\n46#1:122\n50#1:140,9\n50#1:160\n50#1:170,2\n46#1:174,2\n46#1:114,6\n50#1:152,6\n50#1:125\n50#1:126,8\n50#1:173\n56#1:161\n56#1:168\n*E\n"})
public final class C5440g {

    /* JADX INFO: renamed from: Ue.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.profile.settings.simple.SimpleSettingTvKt$SimpleSettingTv$1$1", m18778f = "SimpleSettingTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f17857j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f17857j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f17857j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f17857j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> void m6155a(final InterfaceC3328a<T> interfaceC3328a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(2090770509);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC3328a) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC3328a.mo4071f(), c15688rMo18372i, 0);
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
            C15536p0.m18135a(C16973X.m19466e(interfaceC3328a.mo4069d(), c15688rMo18372i, 0), interfaceC3328a.mo4066a(), null, false, C7512c.m8578a(InterfaceC7507e.a.f24548b, c0173b), null, null, C18037u.m20404c(-208458848, new Function2() { // from class: Ue.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar, 0.0f, 8, 0.0f, 0.0f, 13);
                        C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(28), InterfaceC18861d.a.f58756j, interfaceC15676n2, 6);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, interfaceC15676n2);
                        InterfaceC5799g.f19145s1.getClass();
                        C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar2);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
                        C15623T1.m18280a(c1952q0M2608a, interfaceC15676n2, dVar);
                        InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, fVar);
                        InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i12))) {
                            C1961V0.m2622a(i12, interfaceC15676n2, i12, c21098a);
                        }
                        InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, eVar);
                        InterfaceC7507e interfaceC7507eM8529n = C7482g.m8529n(C20541F0.m25139c(aVar, C20541F0.m25137a(interfaceC15676n2), 14), 388);
                        C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(12), InterfaceC18861d.a.f58759m, interfaceC15676n2, 6);
                        long jMo18375l2 = interfaceC15676n2.mo18375l();
                        int i13 = (int) (jMo18375l2 ^ (jMo18375l2 >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n2 = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8529n, interfaceC15676n2);
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar2);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, dVar);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n2, interfaceC15676n2, fVar);
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i13))) {
                            C1961V0.m2622a(i13, interfaceC15676n2, i13, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c2, interfaceC15676n2, eVar);
                        interfaceC15676n2.mo18363O(-1662475616);
                        final InterfaceC3328a interfaceC3328a2 = interfaceC3328a;
                        for (final InterfaceC3328a.a aVar3 : interfaceC3328a2.mo4068c()) {
                            String str = aVar3.f10752a;
                            boolean zAreEqual = Intrinsics.areEqual(aVar3, (InterfaceC3328a.a) interfaceC15701v0M18246a.getValue());
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC3328a2) | interfaceC15676n2.mo18350B(aVar3);
                            Object objMo18389z3 = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z3 == InterfaceC15676n.a.f50781a) {
                                objMo18389z3 = new Function0() { // from class: Ue.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC3328a2.mo4067b(aVar3);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z3);
                            }
                            C15877o.m18674b(null, str, null, null, 0L, false, zAreEqual, (Function0) objMo18389z3, interfaceC15676n2, 0, 61);
                        }
                        interfaceC15676n2.mo18357I();
                        C1963W0.m2623a(C7482g.m8525j(aVar, 16), interfaceC15676n2);
                        interfaceC15676n2.mo18381r();
                        C11565Q2.m13480b(C16973X.m19466e(interfaceC3328a2.mo4070e(), interfaceC15676n2, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10931n, interfaceC15676n2, 0, 0, 131070);
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 100663296, 220);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ue.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5440g.m6155a(this.f17854b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
