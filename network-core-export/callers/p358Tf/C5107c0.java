package p358Tf;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p019B0.C0173B;
import p055D0.C0946M0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p288Q.C4286K0;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p607i9.C12269M6;
import p640jf.C15456E0;
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
import p776s1.C18050h;
import p830w0.InterfaceC18861d;
import p843wd.InterfaceC19005S;
import p845wg.C19119E6;
import p845wg.C19278b3;
import p862xf.InterfaceC19677a;

/* JADX INFO: renamed from: Tf.c0 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPlayerErrorScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerErrorScreenTv.kt\nru/zona/app/ui/player/PlayerErrorScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,94:1\n1282#2,6:95\n1282#2,6:101\n1282#2,6:144\n1282#2,6:265\n1282#2,6:273\n70#3:107\n67#3,9:108\n70#3:151\n68#3,8:152\n77#3:290\n77#3:294\n80#4,6:117\n87#4,3:132\n90#4,2:141\n80#4,6:160\n87#4,3:175\n90#4,2:184\n80#4,6:198\n87#4,3:213\n90#4,2:222\n80#4,6:237\n87#4,3:252\n90#4,2:261\n94#4:281\n94#4:285\n94#4:289\n94#4:293\n391#5,9:123\n400#5:143\n391#5,9:166\n400#5:186\n391#5,9:204\n400#5:224\n391#5,9:243\n400#5:263\n401#5,2:279\n401#5,2:283\n401#5,2:287\n401#5,2:291\n4360#6,6:135\n4360#6,6:178\n4360#6,6:216\n4360#6,6:255\n113#7:150\n113#7:225\n113#7:264\n113#7:271\n113#7:272\n87#8:187\n83#8,10:188\n94#8:286\n99#9:226\n95#9,10:227\n106#9:282\n85#10:295\n*S KotlinDebug\n*F\n+ 1 PlayerErrorScreenTv.kt\nru/zona/app/ui/player/PlayerErrorScreenTvKt\n*L\n40#1:95,6\n42#1:101,6\n55#1:144,6\n78#1:265,6\n87#1:273,6\n46#1:107\n46#1:108,9\n57#1:151\n57#1:152,8\n57#1:290\n46#1:294\n46#1:117,6\n46#1:132,3\n46#1:141,2\n57#1:160,6\n57#1:175,3\n57#1:184,2\n63#1:198,6\n63#1:213,3\n63#1:222,2\n74#1:237,6\n74#1:252,3\n74#1:261,2\n74#1:281\n63#1:285\n57#1:289\n46#1:293\n46#1:123,9\n46#1:143\n57#1:166,9\n57#1:186\n63#1:204,9\n63#1:224\n74#1:243,9\n74#1:263\n74#1:279,2\n63#1:283,2\n57#1:287,2\n46#1:291,2\n46#1:135,6\n57#1:178,6\n63#1:216,6\n74#1:255,6\n60#1:150\n72#1:225\n77#1:264\n82#1:271\n86#1:272\n63#1:187\n63#1:188,10\n63#1:286\n74#1:226\n74#1:227,10\n74#1:282\n39#1:295\n*E\n"})
public final class C5107c0 {

    /* JADX INFO: renamed from: Tf.c0$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.player.PlayerErrorScreenTvKt$PlayerErrorScreenTv$1$1", m18778f = "PlayerErrorScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f16874j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f16874j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f16874j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f16874j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Tf.c0$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC19005S) this.receiver).close();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m5606a(final InterfaceC19005S interfaceC19005S, InterfaceC15676n interfaceC15676n, final int i10) {
        InterfaceC5799g.a.C21098a c21098a;
        int i11;
        InterfaceC5799g.a.f fVar;
        InterfaceC5799g.a.C21098a c21098a2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(509854968);
        int i12 = i10 | (c15688rMo18372i.mo18362N(interfaceC19005S) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC19005S.mo21353c(), c15688rMo18372i, 0);
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
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7468a.m8487b(C7482g.m8517b(aVar, 1.0f), C3376c.f10940a, C0946M0.f3382a), "test_tag_error_loading");
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar2);
            InterfaceC5799g.a.C21098a c21098a3 = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a3);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            String str = ((InterfaceC19677a.a) interfaceC15701v0M18246a.getValue()).f60715b;
            String str2 = ((InterfaceC19677a.a) interfaceC15701v0M18246a.getValue()).f60716c;
            int i14 = i12 & 14;
            boolean z10 = i14 == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == c21235a) {
                c21098a = c21098a3;
                i11 = i14;
                fVar = fVar2;
                b bVar = new b(0, interfaceC19005S, InterfaceC19005S.class, "close", "close()V", 0);
                c15688rMo18372i.mo18380q(bVar);
                objMo18389z3 = bVar;
            } else {
                i11 = i14;
                fVar = fVar2;
                c21098a = c21098a3;
            }
            C5093W0.m5601b(str, str2, (Function0) ((KFunction) objMo18389z3), null, c15688rMo18372i, 0, 8);
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8517b(aVar, 1.0f), 76, 0.0f, 2);
            InterfaceC5178F interfaceC5178FM2677d2 = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
            long j11 = c15688rMo18372i.f50813T;
            int i15 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                c21098a2 = c21098a;
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a2);
            } else {
                c21098a2 = c21098a;
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58760n, c15688rMo18372i, 48);
            long j12 = c15688rMo18372i.f50813T;
            int i16 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i16))) {
                C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
            InterfaceC5799g.a.C21098a c21098a4 = c21098a2;
            InterfaceC5799g.a.f fVar3 = fVar;
            C11565Q2.m13480b(interfaceC19005S.getError(), null, 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C3375b.f10932o, c15688rMo18372i, 0, 0, 130046);
            C1963W0.m2623a(C7482g.m8519d(aVar, 20), c15688rMo18372i);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j13 = c15688rMo18372i.f50813T;
            int i17 = (int) (j13 ^ (j13 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R4 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(aVar, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R4, c15688rMo18372i, fVar3);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i17))) {
                C12269M6.m14188a(i17, c15688rMo18372i, i17, c21098a4);
            }
            C15623T1.m18280a(interfaceC7507eM8566c4, c15688rMo18372i, eVar);
            String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59786r.getValue(), c15688rMo18372i, 0);
            float f10 = 200;
            InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(aVar, f10, 0.0f, 2);
            int i18 = i11;
            boolean z11 = i18 == 4;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (z11 || objMo18389z4 == c21235a) {
                objMo18389z4 = new C5098Z(interfaceC19005S, 0);
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            C15456E0.m18110a(interfaceC7507eM8530o, null, strM19466e, null, null, false, (Function0) objMo18389z4, false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 6, 6, 523194);
            C1963W0.m2623a(C7482g.m8529n(aVar, 16), c15688rMo18372i);
            String strM19466e2 = C16973X.m19466e((C16972W) C19278b3.f60018u.getValue(), c15688rMo18372i, 0);
            InterfaceC7507e interfaceC7507eM8530o2 = C7482g.m8530o(aVar, f10, 0.0f, 2);
            boolean z12 = i18 == 4;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (z12 || objMo18389z5 == c21235a) {
                objMo18389z5 = new C5101a0(interfaceC19005S, 0);
                c15688rMo18372i.mo18380q(objMo18389z5);
            }
            C15456E0.m18110a(interfaceC7507eM8530o2, null, strM19466e2, null, null, false, (Function0) objMo18389z5, false, false, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 6, 0, 524218);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Tf.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5107c0.m5606a(this.f16864b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
