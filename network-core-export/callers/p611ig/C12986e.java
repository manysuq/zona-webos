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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p019B0.C0173B;
import p055D0.C0946M0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p194Kd.C2983a;
import p194Kd.C2993k;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p288Q.C4286K0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5929n;
import p410Wd.C5933r;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
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
import p658kf.C15877o;
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19285c2;

/* JADX INFO: renamed from: ig.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAgeRatingScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgeRatingScreenTv.kt\nru/zona/app/ui/tv/profile/settings/AgeRatingScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,102:1\n1282#2,6:103\n1282#2,6:109\n1282#2,6:192\n1282#2,6:245\n113#3:115\n113#3:153\n113#3:154\n113#3:155\n113#3:206\n113#3:207\n87#4:116\n84#4,9:117\n94#4:205\n87#4:208\n85#4,8:209\n94#4:255\n80#5,6:126\n87#5,3:141\n90#5,2:150\n80#5,6:165\n87#5,3:180\n90#5,2:189\n94#5:200\n94#5:204\n80#5,6:217\n87#5,3:232\n90#5,2:241\n94#5:254\n391#6,9:132\n400#6:152\n391#6,9:171\n400#6:191\n401#6,2:198\n401#6,2:202\n391#6,9:223\n400#6:243\n401#6,2:252\n4360#7,6:144\n4360#7,6:183\n4360#7,6:235\n99#8:156\n97#8,8:157\n106#8:201\n2068#9:244\n2069#9:251\n85#10:256\n*S KotlinDebug\n*F\n+ 1 AgeRatingScreenTv.kt\nru/zona/app/ui/tv/profile/settings/AgeRatingScreenTvKt\n*L\n41#1:103,6\n43#1:109,6\n67#1:192,6\n97#1:245,6\n51#1:115\n59#1:153\n62#1:154\n63#1:155\n89#1:206\n90#1:207\n47#1:116\n47#1:117,9\n47#1:205\n87#1:208\n87#1:209,8\n87#1:255\n47#1:126,6\n47#1:141,3\n47#1:150,2\n61#1:165,6\n61#1:180,3\n61#1:189,2\n61#1:200\n47#1:204\n87#1:217,6\n87#1:232,3\n87#1:241,2\n87#1:254\n47#1:132,9\n47#1:152\n61#1:171,9\n61#1:191\n61#1:198,2\n47#1:202,2\n87#1:223,9\n87#1:243\n87#1:252,2\n47#1:144,6\n61#1:183,6\n87#1:235,6\n61#1:156\n61#1:157,8\n61#1:201\n92#1:244\n92#1:251\n39#1:256\n*E\n"})
public final class C12986e {

    /* JADX INFO: renamed from: ig.e$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.settings.AgeRatingScreenTvKt$AgeRatingScreenTv$1$1", m18778f = "AgeRatingScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f43647j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f43647j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f43647j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f43647j);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m14725a(final C2983a c2983a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1407722892);
        int i11 = i10 | (c15688rMo18372i.mo18362N(c2983a) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(c2983a.m3705b().getSettings(), c15688rMo18372i, 0);
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
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
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
            C15518g1.m18129a(C16973X.m19466e((C16972W) C19285c2.f60100l.getValue(), c15688rMo18372i, 0), null, c0173b, c2983a.m3704a(), null, c15688rMo18372i, 384, 50);
            C1963W0.m2623a(C7482g.m8519d(aVar, 16), c15688rMo18372i);
            float f11 = 56;
            InterfaceC7507e interfaceC7507eM8515h2 = C7481f.m8515h(aVar, f11, 0.0f, f11, 0.0f, 10);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(28), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8515h2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            String str = ((C2993k) interfaceC15701v0M18246a.getValue()).f9881a;
            boolean z10 = (i11 & 14) == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == c21235a) {
                objMo18389z3 = new Function1() { // from class: ig.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        c2983a.m3705b().mo3699c((String) obj);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            m14726b(str, (Function1) objMo18389z3, c15688rMo18372i, 0);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60102m.getValue(), c15688rMo18372i, 0), C7482g.m8518c(aVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10933p, C3376c.f10937A, 0L, null, null, 0L, null, C18580v.m21028b(24), null, null, 16646142), c15688rMo18372i, 48, 0, 131068);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: ig.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C12986e.m14725a(this.f43642b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14726b(final String str, final Function1<? super String, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1509226811);
        int i11 = 32;
        int i12 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 19) != 18)) {
            InterfaceC7507e interfaceC7507eM8529n = C7482g.m8529n(InterfaceC7507e.a.f24548b, 388);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(12), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8529n, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            c15688rMo18372i.mo18363O(-1267606917);
            for (final C5933r c5933r : C5933r.f19655b) {
                String strM6807a = C5929n.m6807a(c5933r, c15688rMo18372i);
                String str2 = c5933r.f19656a;
                boolean zAreEqual = Intrinsics.areEqual(str2, str);
                boolean zMo18350B = ((i12 & 112) == i11) | c15688rMo18372i.mo18350B(c5933r);
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new Function0() { // from class: ig.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(c5933r.f19656a);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C15877o.m18674b(null, strM6807a, null, str2, 0L, false, zAreEqual, (Function0) objMo18389z, c15688rMo18372i, 0, 53);
                i12 = i12;
                i11 = 32;
            }
            c15688rMo18372i.m18410W(false);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, i10, function1) { // from class: ig.d

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f43645b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f43646c;

                {
                    this.f43646c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C12986e.m14726b(this.f43645b, this.f43646c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
