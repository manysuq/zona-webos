package ge;

import af.C7318k;
import androidx.compose.foundation.C7468a;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A0.C0009h;
import p019B0.C0173B;
import p055D0.C0946M0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p270P.C4025f;
import p288Q.C4286K0;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p579h0.C11658o0;
import p580h1.C11732N0;
import p607i9.C12269M6;
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
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19278b3;

/* JADX INFO: renamed from: ge.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nQrLoginTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrLoginTv.kt\nru/zona/app/screens/auth/qr/tv/QrLoginTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,118:1\n1282#2,6:119\n1282#2,6:125\n113#3:131\n113#3:132\n113#3:169\n113#3:170\n113#3:214\n113#3:253\n113#3:258\n113#3:259\n70#4:133\n68#4,8:134\n77#4:174\n80#5,6:142\n87#5,3:157\n90#5,2:166\n94#5:173\n80#5,6:187\n87#5,3:202\n90#5,2:211\n80#5,6:226\n87#5,3:241\n90#5,2:250\n94#5:256\n94#5:262\n391#6,9:148\n400#6:168\n401#6,2:171\n391#6,9:193\n400#6:213\n391#6,9:232\n400#6:252\n401#6,2:254\n401#6,2:260\n4360#7,6:160\n4360#7,6:205\n4360#7,6:244\n85#8:175\n87#9:176\n83#9,10:177\n94#9:263\n99#10:215\n95#10,10:216\n106#10:257\n*S KotlinDebug\n*F\n+ 1 QrLoginTv.kt\nru/zona/app/screens/auth/qr/tv/QrLoginTvKt\n*L\n46#1:119,6\n47#1:125,6\n95#1:131\n96#1:132\n102#1:169\n103#1:170\n68#1:214\n71#1:253\n80#1:258\n82#1:259\n93#1:133\n93#1:134,8\n93#1:174\n93#1:142,6\n93#1:157,3\n93#1:166,2\n93#1:173\n63#1:187,6\n63#1:202,3\n63#1:211,2\n69#1:226,6\n69#1:241,3\n69#1:250,2\n69#1:256\n63#1:262\n93#1:148,9\n93#1:168\n93#1:171,2\n63#1:193,9\n63#1:213\n69#1:232,9\n69#1:252\n69#1:254,2\n63#1:260,2\n93#1:160,6\n63#1:205,6\n69#1:244,6\n44#1:175\n63#1:176\n63#1:177,10\n63#1:263\n69#1:215\n69#1:216,10\n69#1:257\n*E\n"})
public final class C11386h {

    /* JADX INFO: renamed from: ge.h$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.auth.qr.tv.QrLoginTvKt$QrLoginTv$1$1", m18778f = "QrLoginTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f35460j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35460j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f35460j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f35460j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13417a(final Integer num, InterfaceC15676n interfaceC15676n, final int i10) {
        boolean z10;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2056063576);
        int i11 = (c15688rMo18372i.mo18362N(num) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 24;
            InterfaceC7507e interfaceC7507eM8487b = C7468a.m8487b(C0009h.m22a(C7482g.m8525j(aVar, 160), C4025f.m4709b(f10)), C3376c.f10944e, C0946M0.f3382a);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8487b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
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
            if (num == null) {
                c15688rMo18372i.mo18363O(887167931);
                C11658o0.m13516a(C7482g.m8525j(aVar, f10), C3376c.f10957r, 2, 0L, 0, 0.0f, c15688rMo18372i, 390, 56);
                c15688rMo18372i.m18410W(false);
                z10 = true;
            } else {
                c15688rMo18372i.mo18363O(887358612);
                z10 = true;
                C11565Q2.m13480b(String.valueOf(num.intValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, new C11732N0(C3376c.f10951l, C18580v.m21028b(60), new C16318q(900), 0L, 0, 0, 0L, 16777208), c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(z10);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, num) { // from class: ge.g

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Integer f35459b;

                {
                    this.f35459b = num;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11386h.m13417a(this.f35459b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13418b(final InterfaceC11379a interfaceC11379a, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(441105884);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC11379a) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC11379a.getState(), c15688rMo18372i, 0);
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
            C15536p0.m18135a(C16973X.m19466e((C16972W) C19101C4.f59729w0.getValue(), c15688rMo18372i, 0), interfaceC11379a.mo13415a(), null, false, C7512c.m8578a(InterfaceC7507e.a.f24548b, c0173b), null, null, C18037u.m20404c(-67170071, new Function2() { // from class: ge.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, interfaceC15676n2);
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
                        C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59727v0.getValue(), interfaceC15676n2, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10925h, interfaceC15676n2, 0, 0, 131070);
                        C1963W0.m2623a(C7482g.m8519d(aVar, 24), interfaceC15676n2);
                        C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, interfaceC15676n2, 0);
                        long jMo18375l2 = interfaceC15676n2.mo18375l();
                        int i13 = (int) (jMo18375l2 ^ (jMo18375l2 >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n2 = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar, interfaceC15676n2);
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
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        String str = ((InterfaceC11379a.a) interfaceC15612P1.getValue()).f35434a;
                        if (str == null) {
                            str = "";
                        }
                        C7318k.m8147a(str, null, null, 0L, 0.0f, interfaceC15676n2, 0, 30);
                        C1963W0.m2623a(C7482g.m8529n(aVar, 16), interfaceC15676n2);
                        C11386h.m13417a(((InterfaceC11379a.a) interfaceC15612P1.getValue()).f35435b, interfaceC15676n2, 0);
                        interfaceC15676n2.mo18381r();
                        C1963W0.m2623a(C7482g.m8519d(aVar, 32), interfaceC15676n2);
                        C15456E0.m18110a(C7482g.m8529n(aVar, 350), null, C16973X.m19466e((C16972W) C19278b3.f59987e0.getValue(), interfaceC15676n2, 0), null, null, false, interfaceC11379a.mo13416b(), false, false, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, interfaceC15676n2, 6, 0, 524218);
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
            c15634y0M18412Y.f50634d = new C11384f(interfaceC11379a, i10);
        }
    }
}
