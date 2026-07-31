package p640jf;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ne.C17229w;
import p002A1.C0021a;
import p019B0.C0173B;
import p055D0.C0998l0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p229Mc.C3540k;
import p229Mc.C3541l;
import p270P.C4025f;
import p288Q.C4286K0;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p378V.C5497n;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p580h1.C11752c;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p776s1.C18050h;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20611t;

/* JADX INFO: renamed from: jf.L */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEmptyResultsTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyResultsTv.kt\nru/zona/app/screens/ui/tv/EmptyResultsTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,188:1\n1282#2,6:189\n1282#2,6:195\n1282#2,6:240\n1282#2,6:252\n1282#2,6:258\n1282#2,6:264\n113#3:201\n113#3:239\n113#3:246\n113#3:247\n113#3:277\n113#3:278\n113#3:320\n113#3:358\n113#3:359\n113#3:364\n113#3:365\n113#3:399\n87#4:202\n84#4,9:203\n94#4:251\n87#4:321\n84#4,9:322\n94#4:363\n87#4,6:366\n94#4:403\n80#5,6:212\n87#5,3:227\n90#5,2:236\n94#5:250\n80#5,6:289\n87#5,3:304\n90#5,2:313\n94#5:318\n80#5,6:331\n87#5,3:346\n90#5,2:355\n94#5:362\n80#5,6:372\n87#5,3:387\n90#5,2:396\n94#5:402\n391#6,9:218\n400#6:238\n401#6,2:248\n391#6,9:295\n400#6,3:315\n391#6,9:337\n400#6:357\n401#6,2:360\n391#6,9:378\n400#6:398\n401#6,2:400\n4360#7,6:230\n4360#7,6:307\n4360#7,6:349\n4360#7,6:390\n15#8,7:270\n99#9:279\n96#9,9:280\n106#9:319\n85#10:404\n117#10,2:405\n85#10:407\n*S KotlinDebug\n*F\n+ 1 EmptyResultsTv.kt\nru/zona/app/screens/ui/tv/EmptyResultsTvKt\n*L\n59#1:189,6\n61#1:195,6\n73#1:240,6\n100#1:252,6\n101#1:258,6\n106#1:264,6\n66#1:201\n69#1:239\n78#1:246\n86#1:247\n109#1:277\n113#1:278\n135#1:320\n143#1:358\n145#1:359\n166#1:364\n168#1:365\n176#1:399\n65#1:202\n65#1:203,9\n65#1:251\n132#1:321\n132#1:322,9\n132#1:363\n163#1:366,6\n163#1:403\n65#1:212,6\n65#1:227,3\n65#1:236,2\n65#1:250\n104#1:289,6\n104#1:304,3\n104#1:313,2\n104#1:318\n132#1:331,6\n132#1:346,3\n132#1:355,2\n132#1:362\n163#1:372,6\n163#1:387,3\n163#1:396,2\n163#1:402\n65#1:218,9\n65#1:238\n65#1:248,2\n104#1:295,9\n104#1:315,3\n132#1:337,9\n132#1:357\n132#1:360,2\n163#1:378,9\n163#1:398\n163#1:400,2\n65#1:230,6\n104#1:307,6\n132#1:349,6\n163#1:390,6\n107#1:270,7\n104#1:279\n104#1:280,9\n104#1:319\n100#1:404\n100#1:405,2\n101#1:407\n*E\n"})
public final class C15469L {

    /* JADX INFO: renamed from: jf.L$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.ui.tv.EmptyResultsTvKt$EmptyFilterChannelsResultTv$1$1", m18778f = "EmptyResultsTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f50194j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f50194j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f50194j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f50194j);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m18112a(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1740094705);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC7507e) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            boolean zMo18364a = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18364a || objMo18389z2 == c21235a) {
                objMo18389z2 = C17229w.m19683a(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10942c, c15688rMo18372i);
            }
            InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new C3540k(interfaceC15701v0, 2);
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C20611t.m25195a(C7503c.m8564a(C7510a.m8576a(interfaceC7507e, (Function1) objMo18389z3), C6138n1.f20157a, new C15467K()), 2, ((C0998l0) interfaceC15701v1.getValue()).f3476a, C4025f.m4708a()), 24, 14);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
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
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59973V0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10932o, ((C0998l0) interfaceC15701v1.getValue()).f3476a, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C3541l(interfaceC7507e, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m18113b(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1339787129);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            c15688r = c15688rMo18372i;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59688c.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10932o, c15688r, 0, 0, 131070);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C15457F();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m18114c(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1744057134);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            c15688r = c15688rMo18372i;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59959O0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10932o, c15688r, 0, 0, 131070);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C15453D();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m18115d(C11752c c11752c, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, int i10) {
        int i11;
        C15688r c15688r;
        InterfaceC7507e.a aVar;
        int i12;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(468631827);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c15688rMo18372i.mo18362N(c11752c) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? 32 : 16;
        }
        int i13 = i11;
        if (c15688rMo18372i.mo18379p(i13 & 1, (i13 & 19) != 18)) {
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
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar2, 0.0f, 32, 0.0f, 0.0f, 13);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i14 = (int) (j10 ^ (j10 >>> 32));
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
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC7507e interfaceC7507eM8529n = C7482g.m8529n(aVar2, 215);
            String strM19466e = C16973X.m19466e((C16972W) C19278b3.f60004n.getValue(), c15688rMo18372i, 0);
            C4600a c4600aM5212g = C4601b.m5212g();
            boolean z10 = (i13 & 112) == 32;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == c21235a) {
                objMo18389z3 = new Function0() { // from class: jf.E
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            C15456E0.m18110a(interfaceC7507eM8529n, null, strM19466e, null, c4600aM5212g, true, (Function0) objMo18389z3, false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 196614, 6, 523146);
            C15688r c15688r2 = c15688rMo18372i;
            if (c11752c == null || StringsKt.isBlank(c11752c)) {
                aVar = aVar2;
                i12 = 0;
                c15688r2.mo18363O(-1597977735);
                c15688r2.m18410W(false);
            } else {
                c15688r2.mo18363O(-1598182428);
                C1963W0.m2623a(C7482g.m8519d(aVar2, 16), c15688r2);
                aVar = aVar2;
                C11565Q2.m13481c(c11752c, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, C11732N0.m13585a(C3375b.f10930m, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r2, i13 & 14, 0, 262142);
                c15688r2 = c15688r2;
                i12 = 0;
                c15688r2.m18410W(false);
            }
            C1963W0.m2623a(C7482g.m8519d(aVar, 24), c15688r2);
            C15688r c15688r3 = c15688r2;
            C11565Q2.m13480b(C0021a.m43a(C16973X.m19466e((C16972W) C19285c2.f60047I0.getValue(), c15688r2, i12), " ", C16973X.m19466e((C16972W) C19285c2.f60049J0.getValue(), c15688r2, i12)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10932o, c15688r3, 0, 0, 131070);
            c15688r = c15688r3;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C5497n(c11752c, function0, i10, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m18116e(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1650270290);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            c15688r = c15688rMo18372i;
            C11565Q2.m13480b(C0021a.m43a(C16973X.m19466e((C16972W) C19285c2.f60047I0.getValue(), c15688rMo18372i, 0), " ", C16973X.m19466e((C16972W) C19285c2.f60049J0.getValue(), c15688rMo18372i, 0)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10932o, c15688r, 0, 0, 131070);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C15461H();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m18117f(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1528665548);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7482g.m8517b(aVar, 1.0f), 93, 120);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58760n, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i11 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59933B0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C3375b.f10918a, c15688rMo18372i, 0, 0, 130046);
            C1963W0.m2623a(C7482g.m8519d(aVar, 28), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59931A0.getValue(), c15688rMo18372i, 0), C7482g.m8529n(aVar, 714), 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C3375b.f10932o, c15688rMo18372i, 48, 0, 130044);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C15459G();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m18118g(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(698667857);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7482g.m8517b(aVar, 1.0f), 93, 120);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(28), InterfaceC18861d.a.f58760n, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i11 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60053L0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C3375b.f10918a, c15688rMo18372i, 0, 0, 130046);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60051K0.getValue(), c15688rMo18372i, 0), C7482g.m8529n(aVar, 714), 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C3375b.f10932o, c15688rMo18372i, 48, 0, 130044);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C15463I();
        }
    }
}
