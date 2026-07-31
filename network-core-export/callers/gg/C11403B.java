package gg;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p017Ag.C0154l;
import p017Ag.C0165w;
import p019B0.C0173B;
import p069De.EnumC1163i;
import p069De.InterfaceC1155a;
import p122Gd.InterfaceC1837n;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p214Lf.C3375b;
import p288Q.C4286K0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p450Z.C6625h;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p640jf.C15456E0;
import p640jf.C15509d1;
import p640jf.C15536p0;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15658h;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15612P1;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19285c2;

/* JADX INFO: renamed from: gg.B */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRegistrationPasswordScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegistrationPasswordScreenTv.kt\nru/zona/app/ui/tv/profile/login/RegistrationPasswordScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,113:1\n1282#2,6:114\n1282#2,6:120\n1282#2,6:126\n1282#2,6:132\n1282#2,6:217\n1282#2,6:223\n1282#2,6:235\n85#3:138\n85#3:139\n87#4:140\n84#4,9:141\n94#4:244\n80#5,6:150\n87#5,3:165\n90#5,2:174\n80#5,6:190\n87#5,3:205\n90#5,2:214\n94#5:231\n94#5:243\n391#6,9:156\n400#6:176\n391#6,9:196\n400#6:216\n401#6,2:229\n401#6,2:241\n4360#7,6:168\n4360#7,6:208\n113#8:177\n113#8:178\n113#8:179\n113#8:180\n113#8:233\n113#8:234\n99#9:181\n97#9,8:182\n106#9:232\n*S KotlinDebug\n*F\n+ 1 RegistrationPasswordScreenTv.kt\nru/zona/app/ui/tv/profile/login/RegistrationPasswordScreenTvKt\n*L\n47#1:114,6\n48#1:120,6\n49#1:126,6\n51#1:132,6\n75#1:217,6\n87#1:223,6\n106#1:235,6\n44#1:138\n45#1:139\n59#1:140\n59#1:141,9\n59#1:244\n59#1:150,6\n59#1:165,3\n59#1:174,2\n69#1:190,6\n69#1:205,3\n69#1:214,2\n69#1:231\n59#1:243\n59#1:156,9\n59#1:176\n69#1:196,9\n69#1:216\n69#1:229,2\n59#1:241,2\n59#1:168,6\n69#1:208,6\n60#1:177\n67#1:178\n70#1:179\n71#1:180\n98#1:233\n103#1:234\n69#1:181\n69#1:182,8\n69#1:232\n*E\n"})
public final class C11403B {

    /* JADX INFO: renamed from: gg.B$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.login.RegistrationPasswordScreenTvKt$RegistrationPasswordScreenTv$1$1", m18778f = "RegistrationPasswordScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f35491j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35491j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f35491j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f35491j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: gg.B$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1837n) this.receiver).mo2548e();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: gg.B$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1837n) this.receiver).mo2548e();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13423a(final InterfaceC1837n interfaceC1837n, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1896279356);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1837n) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1837n.getState(), c15688rMo18372i, 0);
            final InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC1837n.mo2545b().f562b, c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b = (C0173B) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b2 = (C0173B) objMo18389z2;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b3 = (C0173B) objMo18389z3;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z4);
            c15688r = c15688rMo18372i;
            C15536p0.m18135a(C16973X.m19466e((C16972W) C19140H5.f59843a.getValue(), c15688rMo18372i, 0), interfaceC1837n.mo2544a(), null, false, null, null, null, C18037u.m20404c(-231413423, new Function2() { // from class: gg.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Object bVar;
                    InterfaceC1837n interfaceC1837n2;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(aVar, "test_tag_register_info");
                        C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, interfaceC15676n2);
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
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, dVar);
                        InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, fVar);
                        InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i12))) {
                            C1961V0.m2622a(i12, interfaceC15676n2, i12, c21098a);
                        }
                        InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, eVar);
                        C1963W0.m2623a(C7482g.m8519d(aVar, 8), interfaceC15676n2);
                        C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59845b.getValue(), interfaceC15676n2, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, interfaceC15676n2, 0, 0, 131070);
                        float f10 = 24;
                        C1963W0.m2623a(C7482g.m8519d(aVar, f10), interfaceC15676n2);
                        InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(aVar, 0.0f, 824, 1);
                        C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(f10), InterfaceC18861d.a.f58756j, interfaceC15676n2, 6);
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
                            interfaceC15676n2.mo18355G(aVar2);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c1952q0M2608a, interfaceC15676n2, dVar);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n2, interfaceC15676n2, fVar);
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i13))) {
                            C1961V0.m2622a(i13, interfaceC15676n2, i13, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c2, interfaceC15676n2, eVar);
                        InterfaceC1837n interfaceC1837n3 = interfaceC1837n;
                        C6625h c6625hMo2550g = interfaceC1837n3.mo2550g();
                        boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC1837n3);
                        Object objMo18389z5 = interfaceC15676n2.mo18389z();
                        InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
                        if (zMo18350B || objMo18389z5 == c21235a2) {
                            interfaceC1837n2 = interfaceC1837n3;
                            bVar = new C11403B.b(0, interfaceC1837n2, InterfaceC1837n.class, "checkPass", "checkPass()Z", 8);
                            interfaceC15676n2.mo18380q(bVar);
                        } else {
                            bVar = objMo18389z5;
                            interfaceC1837n2 = interfaceC1837n3;
                        }
                        Function0 function0 = (Function0) bVar;
                        if (1.0f <= 0.0d) {
                            C2192a.m2845a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true);
                        String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60061P0.getValue(), interfaceC15676n2, 0);
                        InterfaceC1155a.a aVar3 = InterfaceC1155a.a.LOWERCASE;
                        InterfaceC1155a.b bVar2 = new InterfaceC1155a.b((EnumC1163i) null, aVar3, 5);
                        InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(aVar, c0173b);
                        InterfaceC1837n interfaceC1837n4 = interfaceC1837n2;
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        boolean z10 = !((InterfaceC1837n.a) interfaceC15612P1.getValue()).f6243c || ((InterfaceC1837n.a) interfaceC15612P1.getValue()).f6241a.length() == 0;
                        Lazy lazy = C19101C4.f59728w;
                        C15509d1.m18128a(c6625hMo2550g, function0, strM19466e, null, null, false, bVar2, 0, layoutWeightElement, interfaceC7507eM8578a, z10, true, C16973X.m19466e((C16972W) lazy.getValue(), interfaceC15676n2, 0), null, interfaceC15676n2, 0, 48, 8376);
                        C6625h c6625hMo2551h = interfaceC1837n4.mo2551h();
                        InterfaceC1837n interfaceC1837n5 = interfaceC1837n4;
                        boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC1837n5);
                        Object objMo18389z6 = interfaceC15676n2.mo18389z();
                        if (zMo18350B2 || objMo18389z6 == c21235a2) {
                            C11403B.c cVar = new C11403B.c(0, interfaceC1837n5, InterfaceC1837n.class, "checkPass", "checkPass()Z", 8);
                            interfaceC1837n5 = interfaceC1837n5;
                            interfaceC15676n2.mo18380q(cVar);
                            objMo18389z6 = cVar;
                        }
                        Function0 function1 = (Function0) objMo18389z6;
                        String strM19466e2 = C16973X.m19466e((C16972W) C19140H5.f59871o.getValue(), interfaceC15676n2, 0);
                        InterfaceC1155a.b bVar3 = new InterfaceC1155a.b((EnumC1163i) null, aVar3, 5);
                        if (1.0f <= 0.0d) {
                            C2192a.m2845a("invalid weight; must be greater than zero");
                        }
                        final InterfaceC1837n interfaceC1837n6 = interfaceC1837n5;
                        C15509d1.m18128a(c6625hMo2551h, function1, strM19466e2, null, null, false, bVar3, 0, new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), C7512c.m8578a(aVar, c0173b2), !((InterfaceC1837n.a) interfaceC15612P1.getValue()).f6243c || ((InterfaceC1837n.a) interfaceC15612P1.getValue()).f6241a.length() == 0, true, C16973X.m19466e((C16972W) lazy.getValue(), interfaceC15676n2, 0), null, interfaceC15676n2, 0, 48, 8376);
                        interfaceC15676n2.mo18381r();
                        C1963W0.m2623a(C7482g.m8519d(aVar, 12), interfaceC15676n2);
                        InterfaceC7507e interfaceC7507eM8529n = C7482g.m8529n(C7512c.m8578a(aVar, c0173b3), 400);
                        String strM19466e3 = C16973X.m19466e((C16972W) C19101C4.f59679V0.getValue(), interfaceC15676n2, 0);
                        boolean zMo18350B3 = interfaceC15676n2.mo18350B(interfaceC1837n6);
                        Object objMo18389z7 = interfaceC15676n2.mo18389z();
                        if (zMo18350B3 || objMo18389z7 == c21235a2) {
                            objMo18389z7 = new Function0() { // from class: gg.A
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    interfaceC1837n6.mo2549f();
                                    return Unit.INSTANCE;
                                }
                            };
                            interfaceC15676n2.mo18380q(objMo18389z7);
                        }
                        InterfaceC15612P1 interfaceC15612P2 = interfaceC15701v0M18246a2;
                        C15456E0.m18110a(interfaceC7507eM8529n, null, strM19466e3, null, null, false, (Function0) objMo18389z7, false, C0165w.m221c((C0154l) interfaceC15612P2.getValue()), false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, C0165w.m220b((C0154l) interfaceC15612P2.getValue()), null, interfaceC15676n2, 24576, 0, 392874);
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688r, 100663296, 252);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C11437z(interfaceC1837n, i10, 0);
        }
    }
}
