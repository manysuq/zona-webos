package p595hg;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7471d;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import ne.C17229w;
import ne.C17230x;
import p019B0.C0173B;
import p019B0.InterfaceC0179H;
import p055D0.C0946M0;
import p055D0.C0998l0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p158Id.InterfaceC2356a;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p270P.C4025f;
import p288Q.C4286K0;
import p321Re.C4784p;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p640jf.C15518g1;
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
import p881z.C20541F0;
import p881z.C20557N0;
import p881z.C20611t;

/* JADX INFO: renamed from: hg.n */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPremiumMainScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumMainScreenTv.kt\nru/zona/app/ui/tv/profile/premium/PremiumMainScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,105:1\n1282#2,6:106\n1282#2,6:112\n1282#2,6:156\n1282#2,6:209\n1282#2,6:215\n113#3:118\n113#3:162\n113#3:163\n113#3:164\n113#3:221\n113#3:222\n113#3:223\n87#4:119\n84#4,9:120\n87#4:165\n85#4,8:166\n94#4:204\n94#4:208\n80#5,6:129\n87#5,3:144\n90#5,2:153\n80#5,6:174\n87#5,3:189\n90#5,2:198\n94#5:203\n94#5:207\n80#5,6:234\n87#5,3:249\n90#5,2:258\n94#5:263\n391#6,9:135\n400#6:155\n391#6,9:180\n400#6,3:200\n401#6,2:205\n391#6,9:240\n400#6,3:260\n4360#7,6:147\n4360#7,6:192\n4360#7,6:252\n70#8:224\n67#8,9:225\n77#8:264\n85#9:265\n117#9,2:266\n*S KotlinDebug\n*F\n+ 1 PremiumMainScreenTv.kt\nru/zona/app/ui/tv/profile/premium/PremiumMainScreenTvKt\n*L\n45#1:106,6\n47#1:112,6\n62#1:156,6\n84#1:209,6\n88#1:215,6\n58#1:118\n66#1:162\n71#1:163\n72#1:164\n93#1:221\n94#1:222\n97#1:223\n53#1:119\n53#1:120,9\n68#1:165\n68#1:166,8\n68#1:204\n53#1:208\n53#1:129,6\n53#1:144,3\n53#1:153,2\n68#1:174,6\n68#1:189,3\n68#1:198,2\n68#1:203\n53#1:207\n86#1:234,6\n86#1:249,3\n86#1:258,2\n86#1:263\n53#1:135,9\n53#1:155\n68#1:180,9\n68#1:200,3\n53#1:205,2\n86#1:240,9\n86#1:260,3\n53#1:147,6\n68#1:192,6\n86#1:252,6\n86#1:224\n86#1:225,9\n86#1:264\n84#1:265\n84#1:266,2\n*E\n"})
public final class C11927n {

    /* JADX INFO: renamed from: hg.n$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.premium.PremiumMainScreenTvKt$PremiumMainScreenTv$1$1", m18778f = "PremiumMainScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public /* synthetic */ Object f37478j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C0173B f37479k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37479k = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f37479k, continuation);
            aVar.f37478j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B c0173b = this.f37479k;
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m25596constructorimpl(Boxing.boxBoolean(C0173B.m230b(c0173b)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m25596constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: hg.n$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC2356a) this.receiver).mo3043a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m13785a(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-816176062);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C17229w.m19683a(C3376c.f10944e, c15688rMo18372i);
            }
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new Function1() { // from class: hg.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C17230x.m19684a(((InterfaceC0179H) obj).mo236b() ? C3376c.f10957r : C3376c.f10944e, interfaceC15701v0);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C20611t.m25195a(C7471d.m8495c(C7510a.m8576a(InterfaceC7507e.a.f24548b, (Function1) objMo18389z2), false, null, 3), 2, ((C0998l0) interfaceC15701v0.getValue()).f3476a, C4025f.m4709b(8)), 12);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j10 = c15688rMo18372i.f50813T;
            int i11 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59734z.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10931n, C3376c.f10951l, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C11926m();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13786b(InterfaceC2356a interfaceC2356a, InterfaceC15676n interfaceC15676n, final int i10) {
        InterfaceC5799g.a.C21098a c21098a;
        final InterfaceC2356a interfaceC2356a2 = interfaceC2356a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-209875882);
        int i11 = i10 | (c15688rMo18372i.mo18362N(interfaceC2356a2) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            C20557N0 c20557n0M25137a = C20541F0.m25137a(c15688rMo18372i);
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
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7481f.m8515h(C20541F0.m25139c(C7468a.m8487b(C7482g.m8517b(aVar, 1.0f), C3376c.f10940a, C0946M0.f3382a), c20557n0M25137a, 14), f10, 0.0f, f10, 0.0f, 10), "test_tag_scrollable_container");
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar2 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, c15688rMo18372i);
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
            InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a2);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            int i13 = i11 & 14;
            boolean z10 = i13 == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == c21235a) {
                c21098a = c21098a2;
                b bVar = new b(0, interfaceC2356a2, InterfaceC2356a.class, "onBackClicked", "onBackClicked()V", 0);
                c15688rMo18372i.mo18380q(bVar);
                objMo18389z3 = bVar;
            } else {
                c21098a = c21098a2;
            }
            InterfaceC5799g.a.C21098a c21098a3 = c21098a;
            C15518g1.m18129a(C16973X.m19466e((C16972W) C19101C4.f59695f0.getValue(), c15688rMo18372i, 0), null, null, (Function0) ((KFunction) objMo18389z3), null, c15688rMo18372i, 0, 54);
            C1963W0.m2623a(C7482g.m8519d(aVar, 16), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(C7482g.m8517b(aVar, 1.0f), 56, 0.0f, 40, 0.0f, 10);
            C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.m2645g(24), aVar2, c15688rMo18372i, 6);
            long j11 = c15688rMo18372i.f50813T;
            int i14 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a3);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            C11918e.m13783c(c0173b, c15688rMo18372i, 6);
            m13785a(0, c15688rMo18372i);
            c15688rMo18372i.m18410W(true);
            interfaceC2356a2 = interfaceC2356a;
            C4784p.m5359b(interfaceC2356a2, c15688rMo18372i, i13);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: hg.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11927n.m13786b(this.f37476b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
