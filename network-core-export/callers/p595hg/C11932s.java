package p595hg;

import af.C7318k;
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
import p126H.C2032v;
import p126H.C2036x;
import p140Hd.InterfaceC2148h;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p288Q.C4286K0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p524da.InterfaceC10452u0;
import p579h0.C11565Q2;
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
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;

/* JADX INFO: renamed from: hg.s */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nWaitingPaymentScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitingPaymentScreenTv.kt\nru/zona/app/ui/tv/profile/premium/WaitingPaymentScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n1282#2,6:117\n1282#2,6:123\n1282#2,6:167\n1282#2,6:253\n1282#2,6:260\n113#3:129\n113#3:173\n113#3:174\n113#3:212\n113#3:213\n113#3:214\n113#3:259\n87#4:130\n84#4,9:131\n87#4:175\n84#4,9:176\n94#4:273\n94#4:277\n80#5,6:140\n87#5,3:155\n90#5,2:164\n80#5,6:185\n87#5,3:200\n90#5,2:209\n80#5,6:226\n87#5,3:241\n90#5,2:250\n94#5:268\n94#5:272\n94#5:276\n391#6,9:146\n400#6:166\n391#6,9:191\n400#6:211\n391#6,9:232\n400#6:252\n401#6,2:266\n401#6,2:270\n401#6,2:274\n4360#7,6:158\n4360#7,6:203\n4360#7,6:244\n99#8:215\n95#8,10:216\n106#8:269\n85#9:278\n85#9:279\n*S KotlinDebug\n*F\n+ 1 WaitingPaymentScreenTv.kt\nru/zona/app/ui/tv/profile/premium/WaitingPaymentScreenTvKt\n*L\n44#1:117,6\n46#1:123,6\n57#1:167,6\n86#1:253,6\n95#1:260,6\n54#1:129\n61#1:173\n65#1:174\n70#1:212\n77#1:213\n81#1:214\n91#1:259\n50#1:130\n50#1:131,9\n63#1:175\n63#1:176,9\n63#1:273\n50#1:277\n50#1:140,6\n50#1:155,3\n50#1:164,2\n63#1:185,6\n63#1:200,3\n63#1:209,2\n83#1:226,6\n83#1:241,3\n83#1:250,2\n83#1:268\n63#1:272\n50#1:276\n50#1:146,9\n50#1:166\n63#1:191,9\n63#1:211\n83#1:232,9\n83#1:252\n83#1:266,2\n63#1:270,2\n50#1:274,2\n50#1:158,6\n63#1:203,6\n83#1:244,6\n83#1:215\n83#1:216,10\n83#1:269\n43#1:278\n105#1:279\n*E\n"})
public final class C11932s {

    /* JADX INFO: renamed from: hg.s$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.premium.WaitingPaymentScreenTvKt$WaitingPaymentScreenTv$1$1", m18778f = "WaitingPaymentScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f37483j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37483j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f37483j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f37483j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: hg.s$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC2148h) this.receiver).mo2809a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: hg.s$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC2148h) this.receiver).mo2811c();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: hg.s$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC2148h) this.receiver).mo2813e();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m13788a(final InterfaceC10452u0<InterfaceC2148h.a> interfaceC10452u0, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        String strM19467f;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(22306663);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC10452u0) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC10452u0, c15688rMo18372i, i11 & 14);
            if (((InterfaceC2148h.a) interfaceC15701v0M18246a.getValue()).f7095b > 0) {
                c15688rMo18372i.mo18363O(-1181967843);
                strM19467f = C16973X.m19467f((C16972W) C19119E6.f59749N.getValue(), new Object[]{Long.valueOf(((InterfaceC2148h.a) interfaceC15701v0M18246a.getValue()).f7095b), Long.valueOf(((InterfaceC2148h.a) interfaceC15701v0M18246a.getValue()).f7096c)}, c15688rMo18372i);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1181868984);
                strM19467f = C16973X.m19467f((C16972W) C19119E6.f59750O.getValue(), new Object[]{Long.valueOf(((InterfaceC2148h.a) interfaceC15701v0M18246a.getValue()).f7096c)}, c15688rMo18372i);
                c15688rMo18372i.m18410W(false);
            }
            c15688r = c15688rMo18372i;
            C11565Q2.m13480b(strM19467f, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10927j, c15688r, 0, 0, 131070);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: hg.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11932s.m13788a(this.f37482b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0173  */
    /* JADX WARN: Code duplicated, block: B:42:0x0177  */
    /* JADX WARN: Code duplicated, block: B:47:0x0194  */
    /* JADX WARN: Code duplicated, block: B:50:0x0223  */
    /* JADX WARN: Code duplicated, block: B:51:0x0227  */
    /* JADX WARN: Code duplicated, block: B:56:0x0242  */
    /* JADX WARN: Code duplicated, block: B:59:0x0253  */
    /* JADX WARN: Code duplicated, block: B:60:0x0255  */
    /* JADX WARN: Code duplicated, block: B:64:0x0260  */
    /* JADX WARN: Code duplicated, block: B:69:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x02e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m13789b(InterfaceC2148h interfaceC2148h, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        int i12;
        boolean z10;
        Object objMo18389z;
        InterfaceC5799g.a.f fVar;
        int i13;
        C1982e.k kVar;
        C18863f.a aVar;
        int i14;
        int i15;
        int i16;
        boolean z11;
        Object objMo18389z2;
        InterfaceC7507e.a aVar2;
        int i17;
        boolean z12;
        Object objMo18389z3;
        boolean z13;
        int i18;
        final InterfaceC2148h interfaceC2148h2 = interfaceC2148h;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-18454617);
        int i19 = i10 | (c15688rMo18372i.mo18362N(interfaceC2148h2) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i19 & 1, (i19 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC2148h2.mo2814f(), c15688rMo18372i, 0);
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z4;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (objMo18389z5 == c21235a) {
                objMo18389z5 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z5);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z5);
            InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
            float f10 = 20;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(C7468a.m8487b(C7482g.m8517b(aVar3, 1.0f), C3376c.f10940a, C0946M0.f3382a), f10, 8, f10, 0.0f, 8);
            C1982e.k kVar2 = C1982e.f6639c;
            C18863f.a aVar4 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar2, aVar4, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i20 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar5 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar5);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar2);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                i11 = i19;
            } else {
                i11 = i19;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i20))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                i12 = i11 & 14;
                if (i12 != 4) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                objMo18389z = c15688rMo18372i.mo18389z();
                if (!z10 || objMo18389z == c21235a) {
                    fVar = fVar2;
                    i13 = i12;
                    kVar = kVar2;
                    aVar = aVar4;
                    b bVar = new b(0, interfaceC2148h2, InterfaceC2148h.class, "onBackClicked", "onBackClicked()V", 0);
                    c15688rMo18372i.mo18380q(bVar);
                    objMo18389z = bVar;
                } else {
                    i13 = i12;
                    kVar = kVar2;
                    aVar = aVar4;
                    fVar = fVar2;
                }
                C15518g1.m18129a(C16973X.m19466e((C16972W) C19119E6.f59746K.getValue(), c15688rMo18372i, 0), null, null, (Function0) ((KFunction) objMo18389z), null, c15688rMo18372i, 0, 54);
                float f11 = 16;
                C1963W0.m2623a(C7482g.m8519d(aVar3, f11), c15688rMo18372i);
                InterfaceC7507e interfaceC7507eMo2665S0 = C7481f.m8513f(aVar3, 56, 0.0f, 2).mo2665S0(C7482g.f24343b);
                C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar, c15688rMo18372i, 0);
                long j11 = c15688rMo18372i.f50813T;
                i14 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eMo2665S0, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar5);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
                InterfaceC5799g.a.f fVar3 = fVar;
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar3);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                    C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                C7318k.m8147a((String) interfaceC15701v0M18246a.getValue(), null, null, 0L, 0.0f, c15688rMo18372i, 0, 30);
                C1963W0.m2623a(C7482g.m8519d(aVar3, f11), c15688rMo18372i);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19119E6.f59748M.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10930m, c15688rMo18372i, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8519d(aVar3, f11), c15688rMo18372i);
                m13788a(interfaceC2148h.mo2812d(), c15688rMo18372i, 0);
                C1963W0.m2623a(C7482g.m8519d(aVar3, 24), c15688rMo18372i);
                C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6643g, InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
                long j12 = c15688rMo18372i.f50813T;
                i15 = (int) (j12 ^ (j12 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar3, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar5);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar3);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                    C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
                InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(aVar3, "test_tag_open_payment_page_button");
                i16 = i13;
                if (i16 != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                objMo18389z2 = c15688rMo18372i.mo18389z();
                if (!z11 || objMo18389z2 == c21235a) {
                    aVar2 = aVar3;
                    i17 = 0;
                    c cVar = new c(0, interfaceC2148h, InterfaceC2148h.class, "openPaymentPage", "openPaymentPage()V", 0);
                    c15688rMo18372i.mo18380q(cVar);
                    objMo18389z2 = cVar;
                } else {
                    aVar2 = aVar3;
                    i17 = 0;
                }
                InterfaceC7507e.a aVar6 = aVar2;
                C15456E0.m18110a(null, interfaceC7507eM8700a, C16973X.m19466e((C16972W) C19101C4.f59714p.getValue(), c15688rMo18372i, i17), null, null, false, (Function0) ((KFunction) objMo18389z2), false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 48, 6, 523193);
                C1963W0.m2623a(C7482g.m8529n(aVar6, f11), c15688rMo18372i);
                InterfaceC7507e interfaceC7507eM8700a2 = C7586d.m8700a(aVar6, "test_tag_cancel_payment_waiting_button");
                if (i16 != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                objMo18389z3 = c15688rMo18372i.mo18389z();
                if (!z12 || objMo18389z3 == c21235a) {
                    z13 = true;
                    i18 = 0;
                    interfaceC2148h2 = interfaceC2148h;
                    d dVar2 = new d(0, interfaceC2148h2, InterfaceC2148h.class, "refuseOrder", "refuseOrder()V", 0);
                    c15688rMo18372i.mo18380q(dVar2);
                    objMo18389z3 = dVar2;
                } else {
                    z13 = true;
                    i18 = 0;
                    interfaceC2148h2 = interfaceC2148h;
                }
                C15456E0.m18110a(null, interfaceC7507eM8700a2, C16973X.m19466e((C16972W) C19140H5.f59815K.getValue(), c15688rMo18372i, i18), null, null, false, (Function0) ((KFunction) objMo18389z3), false, false, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 48, 0, 524217);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(z13);
                c15688rMo18372i.m18410W(z13);
                c15688rMo18372i.m18410W(z13);
            }
            C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            i12 = i11 & 14;
            if (i12 != 4) {
                z10 = false;
            } else {
                z10 = true;
            }
            objMo18389z = c15688rMo18372i.mo18389z();
            if (z10) {
                fVar = fVar2;
                i13 = i12;
                kVar = kVar2;
                aVar = aVar4;
                b bVar2 = new b(0, interfaceC2148h2, InterfaceC2148h.class, "onBackClicked", "onBackClicked()V", 0);
                c15688rMo18372i.mo18380q(bVar2);
                objMo18389z = bVar2;
            } else {
                fVar = fVar2;
                i13 = i12;
                kVar = kVar2;
                aVar = aVar4;
                b bVar3 = new b(0, interfaceC2148h2, InterfaceC2148h.class, "onBackClicked", "onBackClicked()V", 0);
                c15688rMo18372i.mo18380q(bVar3);
                objMo18389z = bVar3;
            }
            C15518g1.m18129a(C16973X.m19466e((C16972W) C19119E6.f59746K.getValue(), c15688rMo18372i, 0), null, null, (Function0) ((KFunction) objMo18389z), null, c15688rMo18372i, 0, 54);
            float f12 = 16;
            C1963W0.m2623a(C7482g.m8519d(aVar3, f12), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eMo2665S1 = C7481f.m8513f(aVar3, 56, 0.0f, 2).mo2665S0(C7482g.f24343b);
            C2036x c2036xM2689a3 = C2032v.m2689a(kVar, aVar, c15688rMo18372i, 0);
            long j13 = c15688rMo18372i.f50813T;
            i14 = (int) (j13 ^ (j13 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R4 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(interfaceC7507eMo2665S1, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar5);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a3, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar4 = fVar;
            C15623T1.m18280a(interfaceC15608O0M18405R4, c15688rMo18372i, fVar4);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            } else {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c4, c15688rMo18372i, eVar2);
            C7318k.m8147a((String) interfaceC15701v0M18246a.getValue(), null, null, 0L, 0.0f, c15688rMo18372i, 0, 30);
            C1963W0.m2623a(C7482g.m8519d(aVar3, f12), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19119E6.f59748M.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10930m, c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar3, f12), c15688rMo18372i);
            m13788a(interfaceC2148h.mo2812d(), c15688rMo18372i, 0);
            C1963W0.m2623a(C7482g.m8519d(aVar3, 24), c15688rMo18372i);
            C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(C1982e.f6643g, InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j14 = c15688rMo18372i.f50813T;
            i15 = (int) (j14 ^ (j14 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R5 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c5 = C7503c.m8566c(aVar3, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar5);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R5, c15688rMo18372i, fVar4);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            } else {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c5, c15688rMo18372i, eVar2);
            InterfaceC7507e interfaceC7507eM8700a3 = C7586d.m8700a(aVar3, "test_tag_open_payment_page_button");
            i16 = i13;
            if (i16 != 4) {
                z11 = false;
            } else {
                z11 = true;
            }
            objMo18389z2 = c15688rMo18372i.mo18389z();
            if (z11) {
                aVar2 = aVar3;
                i17 = 0;
                c cVar2 = new c(0, interfaceC2148h, InterfaceC2148h.class, "openPaymentPage", "openPaymentPage()V", 0);
                c15688rMo18372i.mo18380q(cVar2);
                objMo18389z2 = cVar2;
            } else {
                aVar2 = aVar3;
                i17 = 0;
                c cVar3 = new c(0, interfaceC2148h, InterfaceC2148h.class, "openPaymentPage", "openPaymentPage()V", 0);
                c15688rMo18372i.mo18380q(cVar3);
                objMo18389z2 = cVar3;
            }
            InterfaceC7507e.a aVar7 = aVar2;
            C15456E0.m18110a(null, interfaceC7507eM8700a3, C16973X.m19466e((C16972W) C19101C4.f59714p.getValue(), c15688rMo18372i, i17), null, null, false, (Function0) ((KFunction) objMo18389z2), false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 48, 6, 523193);
            C1963W0.m2623a(C7482g.m8529n(aVar7, f12), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8700a4 = C7586d.m8700a(aVar7, "test_tag_cancel_payment_waiting_button");
            if (i16 != 4) {
                z12 = false;
            } else {
                z12 = true;
            }
            objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z12) {
                z13 = true;
                i18 = 0;
                interfaceC2148h2 = interfaceC2148h;
                d dVar3 = new d(0, interfaceC2148h2, InterfaceC2148h.class, "refuseOrder", "refuseOrder()V", 0);
                c15688rMo18372i.mo18380q(dVar3);
                objMo18389z3 = dVar3;
            } else {
                z13 = true;
                i18 = 0;
                interfaceC2148h2 = interfaceC2148h;
                d dVar4 = new d(0, interfaceC2148h2, InterfaceC2148h.class, "refuseOrder", "refuseOrder()V", 0);
                c15688rMo18372i.mo18380q(dVar4);
                objMo18389z3 = dVar4;
            }
            C15456E0.m18110a(null, interfaceC7507eM8700a4, C16973X.m19466e((C16972W) C19140H5.f59815K.getValue(), c15688rMo18372i, i18), null, null, false, (Function0) ((KFunction) objMo18389z3), false, false, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 48, 0, 524217);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(z13);
            c15688rMo18372i.m18410W(z13);
            c15688rMo18372i.m18410W(z13);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: hg.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11932s.m13789b(this.f37481b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
