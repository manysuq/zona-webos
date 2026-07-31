package p159Ie;

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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p019B0.C0173B;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p163J0.C2431d;
import p269Og.EnumC3994g;
import p288Q.C4286K0;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p358Tf.C5128k0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p607i9.C12269M6;
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
import p689mb.C16987h;
import p817v1.C18565g;
import p830w0.InterfaceC18861d;
import p843wd.InterfaceC19009W;
import p845wg.C19097C0;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p862xf.InterfaceC19677a;

/* JADX INFO: renamed from: Ie.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMovieCenterControlsTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MovieCenterControlsTv.kt\nru/zona/app/screens/player/controls/movie/MovieCenterControlsTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,103:1\n1282#2,6:104\n1282#2,6:110\n1282#2,6:116\n113#3:122\n113#3:156\n113#3:157\n113#3:158\n113#3:159\n113#3:160\n99#4,6:123\n106#4:164\n80#5,6:129\n87#5,3:144\n90#5,2:153\n94#5:163\n391#6,9:135\n400#6:155\n401#6,2:161\n4360#7,6:147\n85#8:165\n*S KotlinDebug\n*F\n+ 1 MovieCenterControlsTv.kt\nru/zona/app/screens/player/controls/movie/MovieCenterControlsTvKt\n*L\n47#1:104,6\n48#1:110,6\n52#1:116,6\n58#1:122\n64#1:156\n72#1:157\n80#1:158\n89#1:159\n96#1:160\n56#1:123,6\n56#1:164\n56#1:129,6\n56#1:144,3\n56#1:153,2\n56#1:163\n56#1:135,9\n56#1:155\n56#1:161,2\n56#1:147,6\n52#1:165\n*E\n"})
public final class C2366d {

    /* JADX INFO: renamed from: Ie.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.player.controls.movie.MovieCenterControlsTvKt$MovieCenterControlsTv$1$1", m18778f = "MovieCenterControlsTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f7765j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7765j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f7765j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f7765j);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: a */
    public static final void m3057a(final InterfaceC19009W.b bVar, final InterfaceC19677a.a aVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, final Function0<Unit> function4, InterfaceC15676n interfaceC15676n, final int i10) {
        InterfaceC7507e.a aVar2;
        ?? r10;
        InterfaceC7507e interfaceC7507e;
        String strM19466e;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1078831167);
        int i11 = i10 | (c15688rMo18372i.mo18350B(bVar) ? 4 : 2) | (c15688rMo18372i.mo18350B(aVar) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function3) ? 131072 : Parser.ARGC_LIMIT) | (c15688rMo18372i.mo18350B(function4) ? 1048576 : 524288);
        if (c15688rMo18372i.mo18379p(i11 & 1, (599187 & i11) != 599186)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            Object obj = InterfaceC15676n.a.f50781a;
            if (objMo18389z == obj) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == obj) {
                objMo18389z2 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z2);
            boolean z10 = (i11 & 14) == 4 || c15688rMo18372i.mo18362N(bVar);
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == obj) {
                objMo18389z3 = C15585G1.m18250e(Boolean.valueOf(bVar.f59292e instanceof InterfaceC19009W.c.C21257c));
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z3;
            boolean z11 = aVar.f60714a == EnumC3994g.SERIAL;
            InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(aVar3, 1.0f);
            C1982e.j jVar = C1982e.f6637a;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2646h(56, InterfaceC18861d.a.f58760n), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
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
            if (z11) {
                c15688rMo18372i.mo18363O(-1994333573);
                int i13 = (i11 >> 15) & 14;
                aVar2 = aVar3;
                r10 = 0;
                C5128k0.m5618b(null, null, C16973X.m19466e((C16972W) C19101C4.f59703j0.getValue(), c15688rMo18372i, 0), C4601b.m5223r(), new C18565g(48), null, false, aVar.f60717d, 0L, null, function3, c15688rMo18372i, 24576, i13, 867);
                c15688rMo18372i.m18410W(false);
            } else {
                aVar2 = aVar3;
                r10 = 0;
                c15688rMo18372i.mo18363O(-1994068027);
                c15688rMo18372i.m18410W(false);
            }
            C2431d c2431d = C4601b.f15461a;
            float f10 = 48;
            C5128k0.m5618b(null, null, C16973X.m19466e((C16972W) C19140H5.f59811I.getValue(), c15688rMo18372i, r10), new C4600a((C16987h) C19097C0.f59579V0.getValue(), null), new C18565g(f10), null, false, false, 0L, null, function0, c15688rMo18372i, 24576, (i11 >> 6) & 14, 995);
            if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(184305435);
                InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(aVar2, "test_tag_pause_button");
                c15688rMo18372i.m18410W(r10);
                c15688rMo18372i.m18410W(r10);
                interfaceC7507e = interfaceC7507eM8700a;
            } else {
                c15688rMo18372i.mo18363O(552068856);
                c15688rMo18372i.m18410W(r10);
                interfaceC7507e = aVar2;
            }
            C4600a c4600aM5219n = ((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C4601b.m5219n() : C4601b.m5221p();
            C0173B c0173b2 = StringsKt__StringsJVMKt.startsWith$default("Android", "Android", false, 2, null) ? c0173b : null;
            if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                c15688rMo18372i.mo18363O(74242685);
                strM19466e = C16973X.m19466e((C16972W) C19101C4.f59730x.getValue(), c15688rMo18372i, r10);
                c15688rMo18372i.m18410W(r10);
            } else {
                c15688rMo18372i.mo18363O(74244412);
                strM19466e = C16973X.m19466e((C16972W) C19101C4.f59652I.getValue(), c15688rMo18372i, r10);
                c15688rMo18372i.m18410W(r10);
            }
            C5128k0.m5618b(interfaceC7507e, null, strM19466e, c4600aM5219n, new C18565g(f10), null, false, false, 0L, c0173b2, function1, c15688rMo18372i, 24576, (i11 >> 9) & 14, 482);
            C5128k0.m5618b(null, null, C16973X.m19466e((C16972W) C19140H5.f59813J.getValue(), c15688rMo18372i, r10), new C4600a((C16987h) C19097C0.f59615p0.getValue(), null), new C18565g(f10), null, false, false, 0L, null, function2, c15688rMo18372i, 24576, (i11 >> 12) & 14, 995);
            if (z11) {
                c15688rMo18372i.mo18363O(-1993091837);
                C5128k0.m5618b(null, null, C16973X.m19466e((C16972W) C19278b3.f59951K0.getValue(), c15688rMo18372i, r10), C4601b.m5217l(), new C18565g(f10), null, false, aVar.f60718e, 0L, null, function4, c15688rMo18372i, 24576, (i11 >> 18) & 14, 867);
                c15688rMo18372i.m18410W(r10);
            } else {
                c15688rMo18372i.mo18363O(-1992833979);
                c15688rMo18372i.m18410W(r10);
            }
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(aVar, function0, function1, function2, function3, function4, i10) { // from class: Ie.c

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC19677a.a f7759c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f7760d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f7761e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f7762f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function0 f7763g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ Function0 f7764h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM18294a = C15636Z0.m18294a(9);
                    C2366d.m3057a(this.f7758b, this.f7759c, this.f7760d, this.f7761e, this.f7762f, this.f7763g, this.f7764h, (InterfaceC15676n) obj2, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
