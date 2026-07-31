package p393Ve;

import af.C7331x;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mg.C17059v;
import ne.C17213l0;
import org.conscrypt.PSKKeyManager;
import p019B0.C0173B;
import p019B0.InterfaceC0179H;
import p054D.C0802D0;
import p055D0.C0955R0;
import p069De.EnumC1163i;
import p069De.InterfaceC1155a;
import p105Fe.C1620e;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p230Md.InterfaceC3547a;
import p233Mg.C3573k;
import p250Nf.C3765d;
import p288Q.C4286K0;
import p362U1.C5243I;
import p362U1.C5269e0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p450Z.C6625h;
import p478aa.InterfaceC7059L;
import p524da.C10428i0;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p580h1.C11795x0;
import p580h1.InterfaceC11780q;
import p607i9.C12269M6;
import p640jf.C15456E0;
import p640jf.C15509d1;
import p640jf.C15536p0;
import p640jf.C15548v0;
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
import p664l1.AbstractC16308g;
import p664l1.C16316o;
import p664l1.C16317p;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p706o1.C17285d;
import p775s0.C18037u;
import p776s1.C18043a;
import p776s1.C18051i;
import p776s1.C18056n;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p846x.C19491I0;
import p846x.C19558o;
import p881z.C20541F0;
import p881z.C20557N0;

/* JADX INFO: renamed from: Ve.n */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nReportPageTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportPageTv.kt\nru/zona/app/screens/report/ReportPageTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n1282#2,6:215\n1282#2,6:221\n1282#2,6:227\n1282#2,6:233\n1282#2,6:239\n1282#2,6:245\n1282#2,6:251\n1282#2,6:257\n1282#2,6:301\n1282#2,6:307\n1282#2,6:313\n1282#2,6:335\n1282#2,6:378\n1282#2,6:384\n1282#2,6:393\n1282#2,6:400\n1282#2,6:407\n87#3:263\n83#3,10:264\n94#3:324\n87#3:342\n85#3,8:343\n94#3:417\n80#4,6:274\n87#4,3:289\n90#4,2:298\n94#4:323\n80#4,6:351\n87#4,3:366\n90#4,2:375\n94#4:416\n391#5,9:280\n400#5:300\n401#5,2:321\n391#5,9:357\n400#5:377\n401#5,2:414\n4360#6,6:292\n4360#6,6:369\n113#7:319\n113#7:320\n113#7:333\n113#7:334\n113#7:341\n113#7:390\n113#7:391\n113#7:392\n113#7:399\n113#7:406\n113#7:413\n85#8:325\n85#8:326\n85#8:327\n117#8,2:328\n85#8:330\n117#8,2:331\n*S KotlinDebug\n*F\n+ 1 ReportPageTv.kt\nru/zona/app/screens/report/ReportPageTvKt\n*L\n58#1:215,6\n59#1:221,6\n60#1:227,6\n61#1:233,6\n62#1:239,6\n67#1:245,6\n176#1:251,6\n178#1:257,6\n184#1:301,6\n186#1:307,6\n195#1:313,6\n108#1:335,6\n86#1:378,6\n89#1:384,6\n125#1:393,6\n134#1:400,6\n158#1:407,6\n182#1:263\n182#1:264,10\n182#1:324\n78#1:342\n78#1:343,8\n78#1:417\n182#1:274,6\n182#1:289,3\n182#1:298,2\n182#1:323\n78#1:351,6\n78#1:366,3\n78#1:375,2\n78#1:416\n182#1:280,9\n182#1:300\n182#1:321,2\n78#1:357,9\n78#1:377\n78#1:414,2\n182#1:292,6\n78#1:369,6\n205#1:319\n208#1:320\n115#1:333\n116#1:334\n80#1:341\n93#1:390\n101#1:391\n102#1:392\n132#1:399\n155#1:406\n163#1:413\n55#1:325\n56#1:326\n58#1:327\n58#1:328,2\n184#1:330\n184#1:331,2\n*E\n"})
public final class C5689n {

    /* JADX INFO: renamed from: Ve.n$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.report.ReportPageTvKt$ReportPageTv$1$1", m18778f = "ReportPageTv.kt", m18779i = {}, m18780l = {69}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {71}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f18738j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC15701v0 f18739k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C20557N0 f18740l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC15701v0 interfaceC15701v0, Continuation continuation, C20557N0 c20557n0) {
            super(2, continuation);
            this.f18739k = interfaceC15701v0;
            this.f18740l = c20557n0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f18739k, continuation, this.f18740l);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f18738j;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((Boolean) this.f18739k.getValue()).booleanValue()) {
                    C20557N0 c20557n0 = this.f18740l;
                    int iMo18238i = c20557n0.f70454d.mo18238i();
                    C19491I0 c19491i0M21436c = C19558o.m21436c(300, 6, null);
                    this.f18738j = 1;
                    Object objM1307a = C0802D0.m1307a(c20557n0, iMo18238i - c20557n0.f70451a.mo18238i(), c19491i0M21436c, this);
                    if (objM1307a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM1307a = Unit.INSTANCE;
                    }
                    if (objM1307a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ve.n$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3547a) this.receiver).mo4317i();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ve.n$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.report.ReportPageTvKt$ReportPageTv$2$1$2$1", m18778f = "ReportPageTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class c extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f18741j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0173B c0173b, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f18741j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f18741j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f18741j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ve.n$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3547a) this.receiver).mo4310b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ve.n$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3547a) this.receiver).mo4318j();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ve.n$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.report.ReportPageTvKt$ReportSentSuccess$1$1", m18778f = "ReportPageTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class f extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f18742j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0173B c0173b, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f18742j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f18742j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f18742j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m6332a(final InterfaceC3547a interfaceC3547a, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-503804363);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC3547a) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC3547a.getState(), c15688rMo18372i, 0);
            final InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC3547a.mo4313e(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b = (C0173B) objMo18389z2;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b2 = (C0173B) objMo18389z3;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b3 = (C0173B) objMo18389z4;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (objMo18389z5 == c21235a) {
                objMo18389z5 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b4 = (C0173B) objMo18389z5;
            Object objMo18389z6 = c15688rMo18372i.mo18389z();
            if (objMo18389z6 == c21235a) {
                objMo18389z6 = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z6);
            }
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z6;
            final View view = (View) c15688rMo18372i.mo18383t(AndroidCompositionLocals_androidKt.f24868f);
            final InterfaceC1155a interfaceC1155a = (InterfaceC1155a) c15688rMo18372i.mo18383t(C3765d.f12329b);
            boolean zMo18350B = c15688rMo18372i.mo18350B(view) | c15688rMo18372i.mo18350B(interfaceC1155a);
            Object objMo18389z7 = c15688rMo18372i.mo18389z();
            if (zMo18350B || objMo18389z7 == c21235a) {
                objMo18389z7 = new Function1() { // from class: mg.o
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, mg.n] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final View view2 = view;
                        final InterfaceC1155a interfaceC1155a2 = interfaceC1155a;
                        final InterfaceC15701v0 interfaceC15701v1 = interfaceC15701v0;
                        ?? r10 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: mg.n
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                C10428i0 c10428i0IsVisible;
                                C5269e0 c5269e0M5700h = C5243I.m5700h(view2);
                                boolean z10 = true;
                                boolean zMo5831q = c5269e0M5700h != null ? c5269e0M5700h.f17158a.mo5831q(8) : true;
                                InterfaceC1155a interfaceC1155a3 = interfaceC1155a2;
                                boolean z11 = (interfaceC1155a3 == null || (c10428i0IsVisible = interfaceC1155a3.isVisible()) == null || !((Boolean) c10428i0IsVisible.f32389b.getValue()).booleanValue()) ? false : true;
                                if (!zMo5831q && !z11) {
                                    z10 = false;
                                }
                                interfaceC15701v1.setValue(Boolean.valueOf(z10));
                            }
                        };
                        view2.getViewTreeObserver().addOnGlobalLayoutListener(r10);
                        return new C17053p(view2, r10);
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z7);
            }
            C15631X.m18284b(view, (Function1) objMo18389z7, c15688rMo18372i);
            final C20557N0 c20557n0M25137a = C20541F0.m25137a(c15688rMo18372i);
            T value = interfaceC15701v0.getValue();
            boolean zMo18362N = c15688rMo18372i.mo18362N(interfaceC15701v0) | c15688rMo18372i.mo18362N(c20557n0M25137a);
            Object objMo18389z8 = c15688rMo18372i.mo18389z();
            if (zMo18362N || objMo18389z8 == c21235a) {
                objMo18389z8 = new a(interfaceC15701v0, null, c20557n0M25137a);
                c15688rMo18372i.mo18380q(objMo18389z8);
            }
            C15631X.m18287e(value, c15688rMo18372i, (Function2) objMo18389z8);
            c15688r = c15688rMo18372i;
            C15536p0.m18135a(C16973X.m19466e((C16972W) C19140H5.f59877r.getValue(), c15688rMo18372i, 0), interfaceC3547a.mo4309a(), null, false, C7512c.m8578a(InterfaceC7507e.a.f24548b, c0173b4), null, null, C18037u.m20404c(919510216, new Function2() { // from class: Ve.k
                /* JADX WARN: Code duplicated, block: B:43:0x020b  */
                /* JADX WARN: Code duplicated, block: B:48:0x02c4  */
                /* JADX WARN: Code duplicated, block: B:51:0x032b  */
                /* JADX WARN: Code duplicated, block: B:52:0x0341  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n.a.C21235a c21235a2;
                    final InterfaceC3547a interfaceC3547a2;
                    boolean zMo18350B2;
                    Object objMo18389z9;
                    InterfaceC3547a interfaceC3547a3;
                    boolean zMo18350B3;
                    Object objMo18389z10;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(aVar, c20557n0M25137a, 14);
                        float f10 = 8;
                        C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(f10), InterfaceC18861d.a.f58759m, interfaceC15676n2, 6);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM25139c, interfaceC15676n2);
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
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                        InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i12))) {
                            C1961V0.m2622a(i12, interfaceC15676n2, i12, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                        final InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        boolean zAreEqual = Intrinsics.areEqual(((InterfaceC3547a.a) interfaceC15612P1.getValue()).f11653e, Boolean.TRUE);
                        final InterfaceC3547a interfaceC3547a4 = interfaceC3547a;
                        InterfaceC15676n.a.C21235a c21235a3 = InterfaceC15676n.a.f50781a;
                        if (zAreEqual) {
                            interfaceC15676n2.mo18363O(481453988);
                            Function0<Unit> function0Mo4309a = interfaceC3547a4.mo4309a();
                            String str = ((InterfaceC3547a.a) interfaceC15612P1.getValue()).f11654f;
                            boolean zMo18350B4 = interfaceC15676n2.mo18350B(interfaceC3547a4);
                            Object objMo18389z11 = interfaceC15676n2.mo18389z();
                            if (zMo18350B4 || objMo18389z11 == c21235a3) {
                                objMo18389z11 = new C5689n.b(0, interfaceC3547a4, InterfaceC3547a.class, "openEmail", "openEmail()V", 0);
                                interfaceC15676n2.mo18380q(objMo18389z11);
                            }
                            C5689n.m6333b(function0Mo4309a, str, (Function0) ((KFunction) objMo18389z11), interfaceC15676n2, 0);
                            interfaceC15676n2.mo18357I();
                        } else {
                            interfaceC15676n2.mo18363O(481794120);
                            Unit unit = Unit.INSTANCE;
                            Object objMo18389z12 = interfaceC15676n2.mo18389z();
                            if (objMo18389z12 == c21235a3) {
                                objMo18389z12 = new C5689n.c(c0173b4, null);
                                interfaceC15676n2.mo18380q(objMo18389z12);
                            }
                            C15631X.m18287e(unit, interfaceC15676n2, (Function2) objMo18389z12);
                            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar, 0.0f, 0.0f, 0.0f, f10, 7);
                            String str2 = ((InterfaceC3547a.a) interfaceC15612P1.getValue()).f11649a;
                            if (str2 == null) {
                                str2 = "";
                            }
                            C11732N0 c11732n0 = C3375b.f10931n;
                            C11565Q2.m13480b(str2, interfaceC7507eM8515h, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, interfaceC15676n2, 48, 0, 131068);
                            List<C3573k> list = ((InterfaceC3547a.a) interfaceC15612P1.getValue()).f11650b;
                            final C0173B c0173b5 = c0173b;
                            C7331x.m8153a(null, list, f10, f10, C18037u.m20404c(168287040, new Function3() { // from class: Ve.l
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    final C3573k c3573k = (C3573k) obj3;
                                    InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                    ((Integer) obj5).getClass();
                                    InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f);
                                    String str3 = c3573k.f11733b;
                                    boolean zAreEqual2 = Intrinsics.areEqual(((InterfaceC3547a.a) interfaceC15612P1.getValue()).f11651c, c3573k);
                                    float f11 = 24;
                                    float f12 = 16;
                                    long j10 = C3376c.f10945f;
                                    long j11 = C3376c.f10944e;
                                    C11732N0 c11732n1 = C3375b.f10926i;
                                    final InterfaceC3547a interfaceC3547a5 = interfaceC3547a4;
                                    boolean zMo18350B5 = interfaceC15676n3.mo18350B(interfaceC3547a5) | interfaceC15676n3.mo18350B(c3573k);
                                    Object objMo18389z13 = interfaceC15676n3.mo18389z();
                                    if (zMo18350B5 || objMo18389z13 == InterfaceC15676n.a.f50781a) {
                                        final C0173B c0173b6 = c0173b5;
                                        objMo18389z13 = new Function0() { // from class: Ve.j
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                InterfaceC3547a interfaceC3547a6 = interfaceC3547a5;
                                                C3573k c3573k2 = c3573k;
                                                interfaceC3547a6.mo4314f(c3573k2);
                                                if (Intrinsics.areEqual(c3573k2, interfaceC3547a6.mo4315g())) {
                                                    C0173B.m230b(c0173b6);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        interfaceC15676n3.mo18380q(objMo18389z13);
                                    }
                                    C15548v0.m18138a(interfaceC7507eM8518c, str3, zAreEqual2, (Function0) objMo18389z13, false, f11, f12, j11, j10, c11732n1, 0.0f, interfaceC15676n3, 1794054, 3072);
                                    return Unit.INSTANCE;
                                }
                            }, interfaceC15676n2), interfaceC15676n2, 224640, 1);
                            C6625h description = interfaceC3547a4.getDescription();
                            boolean zMo18350B5 = interfaceC15676n2.mo18350B(interfaceC3547a4);
                            Object objMo18389z13 = interfaceC15676n2.mo18389z();
                            if (zMo18350B5) {
                                c21235a2 = c21235a3;
                            } else {
                                c21235a2 = c21235a3;
                                if (objMo18389z13 != c21235a2) {
                                    interfaceC3547a2 = interfaceC3547a4;
                                }
                                Function0 function0 = (Function0) ((KFunction) objMo18389z13);
                                String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59885v.getValue(), interfaceC15676n2, 0);
                                long j10 = C3376c.f10942c;
                                C11732N0 c11732n0M13585a = C11732N0.m13585a(c11732n0, j10, 0L, null, null, 0L, null, 0L, null, null, 16777214);
                                InterfaceC1155a.b bVar = new InterfaceC1155a.b(EnumC1163i.f4166e, (InterfaceC1155a.a) null, 6);
                                InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(C7482g.m8519d(aVar, 80), c0173b5);
                                zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC3547a2);
                                objMo18389z9 = interfaceC15676n2.mo18389z();
                                if (zMo18350B2 || objMo18389z9 == c21235a2) {
                                    objMo18389z9 = new Function1() { // from class: Ve.m
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            if (((InterfaceC0179H) obj3).mo235a()) {
                                                interfaceC3547a2.mo4316h();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    interfaceC15676n2.mo18380q(objMo18389z9);
                                }
                                interfaceC3547a3 = interfaceC3547a2;
                                InterfaceC15676n.a.C21235a c21235a4 = c21235a2;
                                C15509d1.m18128a(description, function0, strM19466e, c11732n0M13585a, 200, true, bVar, 0, null, C7510a.m8576a(interfaceC7507eM8578a, (Function1) objMo18389z9), true, false, null, null, interfaceC15676n2, 221184, 6, 14720);
                                C15509d1.m18128a(interfaceC3547a3.mo4311c(), null, C16973X.m19466e((C16972W) C19285c2.f60045H0.getValue(), interfaceC15676n2, 0), C11732N0.m13585a(c11732n0, j10, 0L, null, null, 0L, null, 0L, null, null, 16777214), null, false, new InterfaceC1155a.b((EnumC1163i) null, InterfaceC1155a.a.LOWERCASE, 1), 0, null, C7512c.m8578a(aVar, c0173b2), true, false, null, null, interfaceC15676n2, 0, 6, 14770);
                                InterfaceC7507e interfaceC7507eM8578a2 = C7512c.m8578a(C7481f.m8515h(C7482g.m8518c(aVar, 1.0f), 0.0f, 0.0f, 0.0f, 38, 7), c0173b3);
                                String strM19466e2 = C16973X.m19466e((C16972W) C19140H5.f59841Y.getValue(), interfaceC15676n2, 0);
                                zMo18350B3 = interfaceC15676n2.mo18350B(interfaceC3547a3);
                                objMo18389z10 = interfaceC15676n2.mo18389z();
                                if (zMo18350B3 || objMo18389z10 == c21235a4) {
                                    objMo18389z10 = new C5689n.e(0, interfaceC3547a3, InterfaceC3547a.class, "sendReport", "sendReport()V", 0);
                                    interfaceC15676n2.mo18380q(objMo18389z10);
                                }
                                C15456E0.m18110a(interfaceC7507eM8578a2, null, strM19466e2, null, null, false, (Function0) ((KFunction) objMo18389z10), false, ((InterfaceC3547a.a) interfaceC15612P1.getValue()).f11652d, ((Boolean) interfaceC15701v0M18246a2.getValue()).booleanValue(), null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, interfaceC15676n2, 0, 0, 523450);
                                interfaceC15676n2 = interfaceC15676n2;
                                if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                                    interfaceC15676n2.mo18363O(485040905);
                                    C1963W0.m2623a(C7482g.m8519d(aVar, 140), interfaceC15676n2);
                                    interfaceC15676n2.mo18357I();
                                } else {
                                    interfaceC15676n2.mo18363O(485109136);
                                    interfaceC15676n2.mo18357I();
                                }
                                interfaceC15676n2.mo18357I();
                            }
                            objMo18389z13 = new C5689n.d(0, interfaceC3547a4, InterfaceC3547a.class, "onDescriptionChange", "onDescriptionChange()V", 0);
                            interfaceC3547a2 = interfaceC3547a4;
                            interfaceC15676n2.mo18380q(objMo18389z13);
                            Function0 function1 = (Function0) ((KFunction) objMo18389z13);
                            String strM19466e3 = C16973X.m19466e((C16972W) C19140H5.f59885v.getValue(), interfaceC15676n2, 0);
                            long j11 = C3376c.f10942c;
                            C11732N0 c11732n0M13585a2 = C11732N0.m13585a(c11732n0, j11, 0L, null, null, 0L, null, 0L, null, null, 16777214);
                            InterfaceC1155a.b bVar2 = new InterfaceC1155a.b(EnumC1163i.f4166e, (InterfaceC1155a.a) null, 6);
                            InterfaceC7507e interfaceC7507eM8578a3 = C7512c.m8578a(C7482g.m8519d(aVar, 80), c0173b5);
                            zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC3547a2);
                            objMo18389z9 = interfaceC15676n2.mo18389z();
                            if (zMo18350B2) {
                                objMo18389z9 = new Function1() { // from class: Ve.m
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        if (((InterfaceC0179H) obj3).mo235a()) {
                                            interfaceC3547a2.mo4316h();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z9);
                            } else {
                                objMo18389z9 = new Function1() { // from class: Ve.m
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        if (((InterfaceC0179H) obj3).mo235a()) {
                                            interfaceC3547a2.mo4316h();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z9);
                            }
                            interfaceC3547a3 = interfaceC3547a2;
                            InterfaceC15676n.a.C21235a c21235a5 = c21235a2;
                            C15509d1.m18128a(description, function1, strM19466e3, c11732n0M13585a2, 200, true, bVar2, 0, null, C7510a.m8576a(interfaceC7507eM8578a3, (Function1) objMo18389z9), true, false, null, null, interfaceC15676n2, 221184, 6, 14720);
                            C15509d1.m18128a(interfaceC3547a3.mo4311c(), null, C16973X.m19466e((C16972W) C19285c2.f60045H0.getValue(), interfaceC15676n2, 0), C11732N0.m13585a(c11732n0, j11, 0L, null, null, 0L, null, 0L, null, null, 16777214), null, false, new InterfaceC1155a.b((EnumC1163i) null, InterfaceC1155a.a.LOWERCASE, 1), 0, null, C7512c.m8578a(aVar, c0173b2), true, false, null, null, interfaceC15676n2, 0, 6, 14770);
                            InterfaceC7507e interfaceC7507eM8578a4 = C7512c.m8578a(C7481f.m8515h(C7482g.m8518c(aVar, 1.0f), 0.0f, 0.0f, 0.0f, 38, 7), c0173b3);
                            String strM19466e4 = C16973X.m19466e((C16972W) C19140H5.f59841Y.getValue(), interfaceC15676n2, 0);
                            zMo18350B3 = interfaceC15676n2.mo18350B(interfaceC3547a3);
                            objMo18389z10 = interfaceC15676n2.mo18389z();
                            if (zMo18350B3) {
                                objMo18389z10 = new C5689n.e(0, interfaceC3547a3, InterfaceC3547a.class, "sendReport", "sendReport()V", 0);
                                interfaceC15676n2.mo18380q(objMo18389z10);
                            } else {
                                objMo18389z10 = new C5689n.e(0, interfaceC3547a3, InterfaceC3547a.class, "sendReport", "sendReport()V", 0);
                                interfaceC15676n2.mo18380q(objMo18389z10);
                            }
                            C15456E0.m18110a(interfaceC7507eM8578a4, null, strM19466e4, null, null, false, (Function0) ((KFunction) objMo18389z10), false, ((InterfaceC3547a.a) interfaceC15612P1.getValue()).f11652d, ((Boolean) interfaceC15701v0M18246a2.getValue()).booleanValue(), null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, interfaceC15676n2, 0, 0, 523450);
                            interfaceC15676n2 = interfaceC15676n2;
                            if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                                interfaceC15676n2.mo18363O(485040905);
                                C1963W0.m2623a(C7482g.m8519d(aVar, 140), interfaceC15676n2);
                                interfaceC15676n2.mo18357I();
                            } else {
                                interfaceC15676n2.mo18363O(485109136);
                                interfaceC15676n2.mo18357I();
                            }
                            interfaceC15676n2.mo18357I();
                        }
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688r, 100663296, 220);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C1620e(interfaceC3547a, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m6333b(final Function0<Unit> function0, final String str, final Function0<Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        InterfaceC7507e.a aVar;
        int i11;
        C15688r c15688r2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1028207322);
        int i12 = i10 | (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | (c15688rMo18372i.mo18362N(str) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 147) != 146)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new f(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z2);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar2, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            if (str != null) {
                c15688rMo18372i.mo18363O(-1183173349);
                Object objMo18389z3 = c15688rMo18372i.mo18389z();
                if (objMo18389z3 == c21235a) {
                    objMo18389z3 = C15585G1.m18250e(Boolean.FALSE);
                    c15688rMo18372i.mo18380q(objMo18389z3);
                }
                final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z3;
                Object objMo18389z4 = c15688rMo18372i.mo18389z();
                if (objMo18389z4 == c21235a) {
                    objMo18389z4 = new Function1() { // from class: Ve.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            C17213l0.m19676a((InterfaceC0179H) obj, interfaceC15701v0);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z4);
                }
                InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(aVar2, (Function1) objMo18389z4);
                String strM19467f = C16973X.m19467f((C16972W) C19140H5.f59832S0.getValue(), new Object[]{str}, c15688rMo18372i);
                C11795x0 c11795x0M13638a = C11795x0.m13638a(new C11795x0(0L, 0L, (C16318q) null, (C16316o) null, (C16317p) null, (AbstractC16308g) null, (String) null, 0L, (C18043a) null, (C18056n) null, (C17285d) null, 0L, C18051i.f56284c, (C0955R0) null, 61439), ((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10951l, 65534);
                boolean z10 = (i12 & 896) == 256;
                Object objMo18389z5 = c15688rMo18372i.mo18389z();
                if (z10 || objMo18389z5 == c21235a) {
                    objMo18389z5 = new InterfaceC11780q() { // from class: Ve.h
                        @Override // p580h1.InterfaceC11780q
                        /* JADX INFO: renamed from: a */
                        public final void mo6331a() {
                            function1.invoke();
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z5);
                }
                aVar = aVar2;
                i11 = 0;
                C11565Q2.m13481c(C17059v.m19503a(strM19467f, str, c11795x0M13638a, (InterfaceC11780q) objMo18389z5), interfaceC7507eM8576a, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, C3375b.f10928k, c15688rMo18372i, 0, 0, 262140);
                c15688r2 = c15688rMo18372i;
                c15688r2.m18410W(false);
            } else {
                aVar = aVar2;
                i11 = 0;
                c15688rMo18372i.mo18363O(-1182432883);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59828Q0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10928k, c15688rMo18372i, 0, 0, 131070);
                c15688r2 = c15688rMo18372i;
                c15688r2.m18410W(false);
            }
            C1963W0.m2623a(C7482g.m8519d(aVar, 20), c15688r2);
            C15688r c15688r3 = c15688r2;
            C15456E0.m18110a(C7512c.m8578a(C7482g.m8529n(aVar, 400), c0173b), null, C16973X.m19466e((C16972W) C19278b3.f60022w.getValue(), c15688r2, i11), null, null, false, function0, false, false, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688r3, (i12 << 18) & 3670016, 0, 524218);
            c15688r = c15688r3;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, function1, i10) { // from class: Ve.i

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f18720c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f18721d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5689n.m6333b(this.f18719b, this.f18720c, this.f18721d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
