package p595hg;

import androidx.compose.foundation.C7471d;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.input.key.C7515a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C17055r;
import p019B0.C0173B;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p140Hd.InterfaceC2143c;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p253O0.C3798b;
import p253O0.C3799c;
import p253O0.C3800d;
import p288Q.C4286K0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p640jf.C15456E0;
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
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C17002w;
import p689mb.C17005z;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19156K0;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20541F0;
import p881z.C20557N0;

/* JADX INFO: renamed from: hg.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPremiumInfoScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumInfoScreenTv.kt\nru/zona/app/ui/tv/profile/premium/PremiumInfoScreenTvKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,193:1\n607#2:194\n604#2,6:195\n1282#3,3:201\n1285#3,3:205\n1282#3,6:208\n1282#3,6:214\n1282#3,6:220\n1282#3,6:320\n605#4:204\n113#5:226\n113#5:264\n113#5:265\n113#5:303\n113#5:304\n113#5:305\n113#5:306\n113#5:307\n113#5:308\n113#5:309\n113#5:310\n87#6:227\n84#6,9:228\n87#6:266\n84#6,9:267\n94#6:314\n94#6:318\n80#7,6:237\n87#7,3:252\n90#7,2:261\n80#7,6:276\n87#7,3:291\n90#7,2:300\n94#7:313\n94#7:317\n391#8,9:243\n400#8:263\n391#8,9:282\n400#8:302\n401#8,2:311\n401#8,2:315\n4360#9,6:255\n4360#9,6:294\n85#10:319\n*S KotlinDebug\n*F\n+ 1 PremiumInfoScreenTv.kt\nru/zona/app/ui/tv/profile/premium/PremiumInfoScreenTvKt\n*L\n55#1:194\n55#1:195,6\n55#1:201,3\n55#1:205,3\n58#1:208,6\n59#1:214,6\n61#1:220,6\n71#1:320,6\n55#1:204\n96#1:226\n104#1:264\n107#1:265\n123#1:303\n130#1:304\n151#1:305\n158#1:306\n165#1:307\n168#1:308\n174#1:309\n183#1:310\n67#1:227\n67#1:228,9\n106#1:266\n106#1:267,9\n106#1:314\n67#1:318\n67#1:237,6\n67#1:252,3\n67#1:261,2\n106#1:276,6\n106#1:291,3\n106#1:300,2\n106#1:313\n67#1:317\n67#1:243,9\n67#1:263\n106#1:282,9\n106#1:302\n106#1:311,2\n67#1:315,2\n67#1:255,6\n106#1:294,6\n53#1:319\n*E\n"})
public final class C11921h {

    /* JADX INFO: renamed from: hg.h$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.premium.PremiumInfoScreenTvKt$PremiumInfoScreenTv$1$1", m18778f = "PremiumInfoScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public /* synthetic */ Object f37464j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C0173B f37465k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37465k = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f37465k, continuation);
            aVar.f37464j = obj;
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
            C0173B c0173b = this.f37465k;
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

    /* JADX INFO: renamed from: hg.h$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b implements Function1<C3799c, Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7059L f37466b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C20557N0 f37467c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0173B f37468d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0173B f37469e;

        public b(InterfaceC7059L interfaceC7059L, C20557N0 c20557n0, C0173B c0173b, C0173B c0173b2) {
            this.f37466b = interfaceC7059L;
            this.f37467c = c20557n0;
            this.f37468d = c0173b;
            this.f37469e = c0173b2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C3799c c3799c) {
            long jM4517a = C3800d.m4517a(c3799c.f12404a);
            boolean zM4516a = C3798b.m4516a(jM4517a, C3798b.f12384d);
            InterfaceC7059L interfaceC7059L = this.f37466b;
            boolean z10 = true;
            C20557N0 c20557n0 = this.f37467c;
            if (zM4516a) {
                C7106g.m8045c(interfaceC7059L, null, null, new C11922i(this.f37468d, null, c20557n0), 3);
            } else if (C3798b.m4516a(jM4517a, C3798b.f12385e)) {
                C7106g.m8045c(interfaceC7059L, null, null, new C11923j(this.f37469e, null, c20557n0), 3);
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0170  */
    /* JADX WARN: Code duplicated, block: B:38:0x0174  */
    /* JADX WARN: Code duplicated, block: B:45:0x0193  */
    /* JADX WARN: Code duplicated, block: B:48:0x027a  */
    /* JADX WARN: Code duplicated, block: B:49:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x02de  */
    /* JADX WARN: Code duplicated, block: B:54:0x03af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m13784a(final InterfaceC2143c interfaceC2143c, InterfaceC15676n interfaceC15676n, final int i10) {
        InterfaceC15701v0 interfaceC15701v0;
        float f10;
        int i11;
        C11732N0 c11732n0;
        C11732N0 c11732n1;
        float f11;
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(721590365);
        int i12 = i10 | (c15688rMo18372i.mo18362N(interfaceC2143c) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC2143c.getState(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15631X.m18288f(EmptyCoroutineContext.INSTANCE, c15688rMo18372i);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final InterfaceC7059L interfaceC7059L = (InterfaceC7059L) objMo18389z;
            final C20557N0 c20557n0M25137a = C20541F0.m25137a(c15688rMo18372i);
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
            Unit unit = Unit.INSTANCE;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z4);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM19499a = C17055r.m19499a(C20541F0.m25139c(aVar, c20557n0M25137a, 14), ((InterfaceC2143c.a) interfaceC15701v0M18246a.getValue()).f7077b, new Function3() { // from class: hg.f
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC7507e interfaceC7507e = (InterfaceC7507e) obj;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    ((Integer) obj3).getClass();
                    interfaceC15676n2.mo18363O(2055408434);
                    InterfaceC7059L interfaceC7059L2 = interfaceC7059L;
                    boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC7059L2);
                    C20557N0 c20557n0 = c20557n0M25137a;
                    boolean zMo18362N = zMo18350B | interfaceC15676n2.mo18362N(c20557n0);
                    Object objMo18389z5 = interfaceC15676n2.mo18389z();
                    if (zMo18362N || objMo18389z5 == InterfaceC15676n.a.f50781a) {
                        objMo18389z5 = new C11921h.b(interfaceC7059L2, c20557n0, c0173b, c0173b2);
                        interfaceC15676n2.mo18380q(objMo18389z5);
                    }
                    InterfaceC7507e interfaceC7507eM8585a = C7515a.m8585a(interfaceC7507e, (Function1) objMo18389z5);
                    interfaceC15676n2.mo18357I();
                    return interfaceC7507eM8585a;
                }
            }, c15688rMo18372i, 0);
            float f12 = 20;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(interfaceC7507eM19499a, f12, 0.0f, f12, 0.0f, 10);
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar2 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
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
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                interfaceC15701v0 = interfaceC15701v0M18246a;
            } else {
                interfaceC15701v0 = interfaceC15701v0M18246a;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                C15518g1.m18129a(C16973X.m19466e((C16972W) C19101C4.f59695f0.getValue(), c15688rMo18372i, 0), null, c0173b, interfaceC2143c.mo2818b(), null, c15688rMo18372i, 384, 50);
                f10 = 16;
                C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
                InterfaceC7507e interfaceC7507eM8495c = C7471d.m8495c(C7512c.m8578a(C7481f.m8515h(aVar, 56, 0.0f, 40, 49, 2), c0173b2), false, null, 3);
                C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
                long j11 = c15688rMo18372i.f50813T;
                i11 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8495c, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar3);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                    C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                String strM19467f = C16973X.m19467f((C16972W) C19285c2.f60086e.getValue(), new Object[]{Integer.valueOf(((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7079d), C17005z.m19475b((C17002w) C19156K0.f59929a.getValue(), ((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7079d, c15688rMo18372i)}, c15688rMo18372i);
                c11732n0 = C3375b.f10931n;
                C11565Q2.m13480b(strM19467f, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
                String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60084d.getValue(), c15688rMo18372i, 0);
                c11732n1 = C3375b.f10924g;
                C11565Q2.m13480b(strM19466e, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
                f11 = 4;
                C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688rMo18372i);
                C11565Q2.m13480b(C16973X.m19467f((C16972W) C19278b3.f59958O.getValue(), new Object[]{((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7078c}, c15688rMo18372i), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
                c15688r = c15688rMo18372i;
                if (((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7076a) {
                    c15688r.mo18363O(-1197138633);
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59683Z.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10955p, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r, 0, 0, 131070);
                    c15688r = c15688r;
                    c15688r.m18410W(false);
                } else {
                    c15688r.mo18363O(1543567569);
                    c15688r.m18410W(false);
                }
                if (((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7077b) {
                    c15688r.mo18363O(1544617601);
                    float f13 = 36;
                    C1963W0.m2623a(C7482g.m8519d(aVar, f13), c15688r);
                    C15688r c15688r2 = c15688r;
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59934C.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10920c, c15688r2, 0, 0, 131070);
                    C11918e.m13782b(0, c15688r2);
                    C1963W0.m2623a(C7482g.m8519d(aVar, f13), c15688r2);
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59734z.getValue(), c15688r2, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10951l, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r2, 0, 0, 131070);
                    c15688rMo18372i = c15688r2;
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688r.mo18363O(1543640047);
                    C15688r c15688r3 = c15688r;
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59687b0.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10958s, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r3, 0, 0, 131070);
                    C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688r3);
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59873p.getValue(), c15688r3, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688r3, 0, 0, 131070);
                    C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688r3);
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59875q.getValue(), c15688r3, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688r3, 0, 0, 131070);
                    C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688r3);
                    C15456E0.m18110a(C7482g.m8529n(aVar, 400), null, C16973X.m19466e((C16972W) C19140H5.f59868m0.getValue(), c15688r3, 0), null, null, false, interfaceC2143c.mo2817a(), false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688r3, 6, 6, 523194);
                    c15688rMo18372i = c15688r3;
                    c15688rMo18372i.m18410W(false);
                }
                c15688rMo18372i.m18410W(true);
                c15688rMo18372i.m18410W(true);
            }
            C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            C15518g1.m18129a(C16973X.m19466e((C16972W) C19101C4.f59695f0.getValue(), c15688rMo18372i, 0), null, c0173b, interfaceC2143c.mo2818b(), null, c15688rMo18372i, 384, 50);
            f10 = 16;
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8495c2 = C7471d.m8495c(C7512c.m8578a(C7481f.m8515h(aVar, 56, 0.0f, 40, 49, 2), c0173b2), false, null, 3);
            C2036x c2036xM2689a3 = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
            long j12 = c15688rMo18372i.f50813T;
            i11 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8495c2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a3, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            } else {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar2);
            String strM19467f2 = C16973X.m19467f((C16972W) C19285c2.f60086e.getValue(), new Object[]{Integer.valueOf(((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7079d), C17005z.m19475b((C17002w) C19156K0.f59929a.getValue(), ((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7079d, c15688rMo18372i)}, c15688rMo18372i);
            c11732n0 = C3375b.f10931n;
            C11565Q2.m13480b(strM19467f2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            String strM19466e2 = C16973X.m19466e((C16972W) C19285c2.f60084d.getValue(), c15688rMo18372i, 0);
            c11732n1 = C3375b.f10924g;
            C11565Q2.m13480b(strM19466e2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688rMo18372i, 0, 0, 131070);
            f11 = 4;
            C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19467f((C16972W) C19278b3.f59958O.getValue(), new Object[]{((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7078c}, c15688rMo18372i), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
            c15688r = c15688rMo18372i;
            if (((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7076a) {
                c15688r.mo18363O(-1197138633);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59683Z.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10955p, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r, 0, 0, 131070);
                c15688r = c15688r;
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(1543567569);
                c15688r.m18410W(false);
            }
            if (((InterfaceC2143c.a) interfaceC15701v0.getValue()).f7077b) {
                c15688r.mo18363O(1543640047);
                C15688r c15688r4 = c15688r;
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59687b0.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10958s, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r4, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688r4);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59873p.getValue(), c15688r4, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n1, c15688r4, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8519d(aVar, f11), c15688r4);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59875q.getValue(), c15688r4, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688r4, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688r4);
                C15456E0.m18110a(C7482g.m8529n(aVar, 400), null, C16973X.m19466e((C16972W) C19140H5.f59868m0.getValue(), c15688r4, 0), null, null, false, interfaceC2143c.mo2817a(), false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688r4, 6, 6, 523194);
                c15688rMo18372i = c15688r4;
                c15688rMo18372i.m18410W(false);
            } else {
                c15688r.mo18363O(1544617601);
                float f14 = 36;
                C1963W0.m2623a(C7482g.m8519d(aVar, f14), c15688r);
                C15688r c15688r5 = c15688r;
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59934C.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10920c, c15688r5, 0, 0, 131070);
                C11918e.m13782b(0, c15688r5);
                C1963W0.m2623a(C7482g.m8519d(aVar, f14), c15688r5);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59734z.getValue(), c15688r5, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10951l, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r5, 0, 0, 131070);
                c15688rMo18372i = c15688r5;
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: hg.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11921h.m13784a(this.f37463b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
