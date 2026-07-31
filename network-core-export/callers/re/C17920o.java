package re;

import androidx.compose.animation.C7466a;
import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8245x0;
import java.util.Iterator;
import java.util.List;
import ke.C15855h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import mg.C17040c;
import mobi.zona.data.model.AdsType;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p055D0.C0946M0;
import p055D0.C0998l0;
import p073E0.AbstractC1222c;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2008m1;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p270P.C4025f;
import p340Sf.C4935b;
import p361U0.InterfaceC5178F;
import p361U0.InterfaceC5208f;
import p362U1.C5256W;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p561fd.InterfaceC11132i;
import p579h0.C11550N;
import p579h0.C11565Q2;
import p579h0.C11576T2;
import p579h0.C11580U2;
import p579h0.C11592X2;
import p579h0.C11600Z2;
import p579h0.C11625g;
import p579h0.C11681u;
import p579h0.C11685v;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p626j0.C15308f;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15612P1;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18036t;
import p775s0.C18037u;
import p800u0.AbstractC18431g;
import p829w.C18817Q;
import p829w.C18819T;
import p829w.C18851t;
import p829w.C18854w;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p846x.C19487G0;
import p846x.C19491I0;
import p846x.C19523Z;
import p846x.C19558o;
import p846x.C19577x0;
import p846x.InterfaceC19493J0;
import p881z.C20541F0;
import p881z.C20557N0;

/* JADX INFO: renamed from: re.o */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPromoDetailsPageM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoDetailsPageM.kt\nru/zona/app/screens/content/promo/PromoDetailsPageMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 12 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,274:1\n1282#2,6:275\n1282#2,6:281\n1282#2,6:365\n1282#2,6:380\n1282#2,6:527\n70#3:287\n68#3,8:288\n77#3:389\n70#3:390\n68#3,8:391\n77#3:429\n80#4,6:296\n87#4,3:311\n90#4,2:320\n80#4,6:333\n87#4,3:348\n90#4,2:357\n94#4:378\n94#4:388\n80#4,6:399\n87#4,3:414\n90#4,2:423\n94#4:428\n80#4,6:440\n87#4,3:455\n90#4,2:464\n80#4,6:480\n87#4,3:495\n90#4,2:504\n94#4:517\n94#4:522\n391#5,9:302\n400#5:322\n391#5,9:339\n400#5:359\n401#5,2:376\n401#5,2:386\n391#5,9:405\n400#5,3:425\n391#5,9:446\n400#5:466\n391#5,9:486\n400#5:506\n401#5,2:515\n401#5,2:520\n4360#6,6:314\n4360#6,6:351\n4360#6,6:417\n4360#6,6:458\n4360#6,6:498\n87#7:323\n84#7,9:324\n94#7:379\n87#7:430\n84#7,9:431\n94#7:523\n113#8:360\n113#8:361\n113#8:362\n113#8:363\n113#8:364\n113#8:371\n113#8:372\n113#8:373\n113#8:374\n113#8:375\n113#8:467\n113#8:468\n113#8:469\n113#8:507\n113#8:509\n113#8:510\n113#8:511\n113#8:512\n113#8:514\n113#8:519\n99#9:470\n96#9,9:471\n106#9:518\n2068#10:508\n2069#10:513\n67#11,3:524\n71#11:533\n1839#12,7:534\n1846#12,14:548\n604#13,7:541\n85#14:562\n85#14:563\n117#14,2:564\n85#14:566\n*S KotlinDebug\n*F\n+ 1 PromoDetailsPageM.kt\nru/zona/app/screens/content/promo/PromoDetailsPageMKt\n*L\n73#1:275,6\n79#1:281,6\n133#1:365,6\n157#1:380,6\n232#1:527,6\n83#1:287\n83#1:288,8\n83#1:389\n168#1:390\n168#1:391,8\n168#1:429\n83#1:296,6\n83#1:311,3\n83#1:320,2\n89#1:333,6\n89#1:348,3\n89#1:357,2\n89#1:378\n83#1:388\n168#1:399,6\n168#1:414,3\n168#1:423,2\n168#1:428\n182#1:440,6\n182#1:455,3\n182#1:464,2\n194#1:480,6\n194#1:495,3\n194#1:504,2\n194#1:517\n182#1:522\n83#1:302,9\n83#1:322\n89#1:339,9\n89#1:359\n89#1:376,2\n83#1:386,2\n168#1:405,9\n168#1:425,3\n182#1:446,9\n182#1:466\n194#1:486,9\n194#1:506\n194#1:515,2\n182#1:520,2\n83#1:314,6\n89#1:351,6\n168#1:417,6\n182#1:458,6\n194#1:498,6\n89#1:323\n89#1:324,9\n89#1:379\n182#1:430\n182#1:431,9\n182#1:523\n98#1:360\n103#1:361\n106#1:362\n111#1:363\n114#1:364\n135#1:371\n138#1:372\n144#1:373\n150#1:374\n154#1:375\n184#1:467\n188#1:468\n192#1:469\n199#1:507\n204#1:509\n205#1:510\n206#1:511\n211#1:512\n213#1:514\n215#1:519\n194#1:470\n194#1:471,9\n194#1:518\n201#1:508\n201#1:513\n232#1:524,3\n232#1:533\n232#1:534,7\n232#1:548,14\n232#1:541,7\n71#1:562\n73#1:563\n73#1:564,2\n232#1:566\n*E\n"})
public final class C17920o {

    /* JADX INFO: renamed from: re.o$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt$animateColor$$inlined$animateValue$1\n*L\n1#1,1856:1\n*E\n"})
    public static final class a implements Function0<Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C19577x0 f55693b;

        public a(C19577x0 c19577x0) {
            this.f55693b = c19577x0;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.f55693b.f60415d.getValue();
        }
    }

    /* JADX INFO: renamed from: re.o$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt$animateColor$$inlined$animateValue$2\n*L\n1#1,1857:1\n*E\n"})
    public static final class b implements Function0<C19577x0.b<Boolean>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C19577x0 f55694b;

        public b(C19577x0 c19577x0) {
            this.f55694b = c19577x0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C19577x0.b<Boolean> invoke() {
            return this.f55694b.m21458e();
        }
    }

    /* JADX INFO: renamed from: re.o$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.content.promo.PromoDetailsPageMKt$PromoDetailsPageM$1$1", m18778f = "PromoDetailsPageM.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class c extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C20557N0 f55695j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC15701v0<Boolean> f55696k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC15701v0 interfaceC15701v0, Continuation continuation, C20557N0 c20557n0) {
            super(2, continuation);
            this.f55695j = c20557n0;
            this.f55696k = interfaceC15701v0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f55696k, continuation, this.f55695j);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f55696k.setValue(Boolean.valueOf(this.f55695j.f70451a.mo18238i() <= 250));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: re.o$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11132i) this.receiver).mo13152a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m20284a(final int i10, final String str, InterfaceC15676n interfaceC15676n, final Function0 function0, final boolean z10) {
        Object value;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1073556528);
        int i11 = (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(str) ? 32 : 16) | (c15688rMo18372i.mo18364a(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            C19577x0 c19577x0M21390d = C19487G0.m21390d(Boolean.valueOf(z10), "BackgroundTransition", c15688rMo18372i, ((i11 >> 6) & 14) | 48, 0);
            C19523Z c19523z = c19577x0M21390d.f60412a;
            boolean zBooleanValue = ((Boolean) c19577x0M21390d.f60415d.getValue()).booleanValue();
            c15688rMo18372i.mo18363O(-1370859685);
            long j10 = zBooleanValue ? C3376c.f10965z : C3376c.f10941b;
            c15688rMo18372i.m18410W(false);
            AbstractC1222c abstractC1222cM1542e = C0998l0.m1542e(j10);
            boolean zMo18362N = c15688rMo18372i.mo18362N(abstractC1222cM1542e);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (zMo18362N || objMo18389z == c21235a) {
                objMo18389z = (InterfaceC19493J0) C18851t.f58720a.invoke(abstractC1222cM1542e);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC19493J0 interfaceC19493J0 = (InterfaceC19493J0) objMo18389z;
            if (c19577x0M21390d.m21459f()) {
                c15688rMo18372i.mo18363O(1666853325);
                c15688rMo18372i.m18410W(false);
                value = c19523z.f60245b.getValue();
            } else {
                c15688rMo18372i.mo18363O(1666599280);
                boolean zMo18362N2 = c15688rMo18372i.mo18362N(c19577x0M21390d);
                value = c15688rMo18372i.mo18389z();
                if (zMo18362N2 || value == c21235a) {
                    AbstractC18431g.f57391e.getClass();
                    AbstractC18431g abstractC18431gM20809a = AbstractC18431g.a.m20809a();
                    Function1<Object, Unit> function1Mo20781e = abstractC18431gM20809a != null ? abstractC18431gM20809a.mo20781e() : null;
                    AbstractC18431g abstractC18431gM20810b = AbstractC18431g.a.m20810b(abstractC18431gM20809a);
                    try {
                        Object value2 = c19523z.f60245b.getValue();
                        AbstractC18431g.a.m20813e(abstractC18431gM20809a, abstractC18431gM20810b, function1Mo20781e);
                        c15688rMo18372i.mo18380q(value2);
                        value = value2;
                    } catch (Throwable th) {
                        AbstractC18431g.a.m20813e(abstractC18431gM20809a, abstractC18431gM20810b, function1Mo20781e);
                        throw th;
                    }
                }
                c15688rMo18372i.m18410W(false);
            }
            boolean zBooleanValue2 = ((Boolean) value).booleanValue();
            c15688rMo18372i.mo18363O(-1370859685);
            long j11 = zBooleanValue2 ? C3376c.f10965z : C3376c.f10941b;
            c15688rMo18372i.m18410W(false);
            C0998l0 c0998l0 = new C0998l0(j11);
            boolean zMo18362N3 = c15688rMo18372i.mo18362N(c19577x0M21390d);
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18362N3 || objMo18389z2 == c21235a) {
                objMo18389z2 = C15585G1.m18249d(new a(c19577x0M21390d));
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            boolean zBooleanValue3 = ((Boolean) ((InterfaceC15612P1) objMo18389z2).getValue()).booleanValue();
            c15688rMo18372i.mo18363O(-1370859685);
            long j12 = zBooleanValue3 ? C3376c.f10965z : C3376c.f10941b;
            c15688rMo18372i.m18410W(false);
            C0998l0 c0998l1 = new C0998l0(j12);
            boolean zMo18362N4 = c15688rMo18372i.mo18362N(c19577x0M21390d);
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (zMo18362N4 || objMo18389z3 == c21235a) {
                objMo18389z3 = C15585G1.m18249d(new b(c19577x0M21390d));
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            c15688rMo18372i.mo18363O(1967309767);
            C19491I0 c19491i0M21436c = C19558o.m21436c(500, 6, null);
            c15688rMo18372i.m18410W(false);
            C19577x0.d dVarM21389c = C19487G0.m21389c(c19577x0M21390d, c0998l0, c0998l1, c19491i0M21436c, interfaceC19493J0, c15688rMo18372i, 196608);
            C18036t c18036tM20404c = C18037u.m20404c(474774764, new Function2() { // from class: re.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean z11 = !z10;
                        C18817Q c18817qM21158d = C18854w.m21158d();
                        C18819T c18819tM21159e = C18854w.m21159e(null, 3);
                        final String str2 = str;
                        C7466a.m8481c(z11, null, c18817qM21158d, c18819tM21159e, null, C18037u.m20404c(-15265516, new Function3() { // from class: re.g
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    C11565Q2.m13480b(str2, C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((C11592X2) interfaceC15676n3.mo18383t(C11600Z2.f36380a)).f36334g, interfaceC15676n3, 48, 24960, 110588);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 200064, 18);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM2681a = C2008m1.m2681a(C7468a.m8487b(C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), ((C0998l0) dVarM21389c.f60439i.getValue()).f3476a, C0946M0.f3382a));
            C18036t c18036tM20404c2 = C18037u.m20404c(1149934890, new Function2() { // from class: re.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C11550N.m13477a(function0, null, false, null, null, C17909d.f55680c, interfaceC15676n2, 1572864, 62);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i);
            float f10 = C11580U2.f36270a;
            long j13 = C0998l0.f3473f;
            long j14 = C0998l0.f3474g;
            C11681u c11681u = (C11681u) c15688rMo18372i.mo18383t(C11685v.f36793a);
            C11576T2 c11576t2 = c11681u.f36741W;
            if (c11576t2 == null) {
                C11576T2 c11576t3 = new C11576T2(C11685v.m13538a(c11681u, C15308f.f49468a), C11685v.m13538a(c11681u, C15308f.f49470c), C11685v.m13538a(c11681u, C15308f.f49469b), C11685v.m13538a(c11681u, C15308f.f49472e), C11685v.m13538a(c11681u, C15308f.f49473f), C11685v.m13538a(c11681u, C15308f.f49471d));
                c11681u.f36741W = c11576t3;
                c11576t2 = c11576t3;
            }
            if (j13 == 16) {
                j13 = c11576t2.f36254a;
            }
            long j15 = j13;
            long j16 = j14 != 16 ? j14 : c11576t2.f36255b;
            long j17 = j14 != 16 ? j14 : c11576t2.f36256c;
            long j18 = j14 != 16 ? j14 : c11576t2.f36257d;
            long j19 = j14 != 16 ? j14 : c11576t2.f36258e;
            if (j14 == 16) {
                j14 = c11576t2.f36259f;
            }
            C11625g.m13508b(c18036tM20404c, interfaceC7507eM2681a, c18036tM20404c2, null, 0.0f, null, new C11576T2(j15, j16, j17, j18, j19, j14), c15688rMo18372i, 390);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, str, function0, z10) { // from class: re.n

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Function0 f55690b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f55691c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f55692d;

                {
                    this.f55690b = function0;
                    this.f55691c = str;
                    this.f55692d = z10;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C17920o.m20284a(C15636Z0.m18294a(1), this.f55691c, (InterfaceC15676n) obj, this.f55690b, this.f55692d);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m20285b(InterfaceC11132i interfaceC11132i, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        String strM19466e;
        InterfaceC7507e.a aVar;
        InterfaceC15676n.a.C21235a c21235a;
        float f10;
        int i11;
        final InterfaceC11132i interfaceC11132i2 = interfaceC11132i;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1332782358);
        int i12 = i10 | (c15688rMo18372i.mo18362N(interfaceC11132i2) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC11132i2.getState(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a2) {
                objMo18389z = C15585G1.m18250e(Boolean.TRUE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            C20557N0 c20557n0M25137a = C20541F0.m25137a(c15688rMo18372i);
            Boolean boolValueOf = Boolean.valueOf(c20557n0M25137a.f70451a.mo18238i() > 250);
            boolean zMo18362N = c15688rMo18372i.mo18362N(c20557n0M25137a);
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18362N || objMo18389z2 == c21235a2) {
                objMo18389z2 = new c(interfaceC15701v0, null, c20557n0M25137a);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(boolValueOf, c15688rMo18372i, (Function2) objMo18389z2);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8487b = C7468a.m8487b(C7482g.m8517b(aVar2, 1.0f), C3376c.f10940a, C0946M0.f3382a);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58748b, false);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8487b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(C7482g.m8517b(aVar2, 1.0f), c20557n0M25137a, 14);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i14 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM25139c, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            m20287d(interfaceC11132i.mo13153b().getBackdrop(), c15688rMo18372i, 0);
            float f11 = 24;
            C1963W0.m2623a(C7482g.m8519d(aVar2, f11), c15688rMo18372i);
            float f12 = 16;
            C11565Q2.m13480b(interfaceC11132i.mo13153b().getName(), C7481f.m8513f(aVar2, f12, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10906a, c15688rMo18372i, 48, 0, 131068);
            C1963W0.m2623a(C7482g.m8519d(aVar2, f12), c15688rMo18372i);
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(interfaceC11132i.mo13153b().getGenres(), ", ", null, null, 0, null, null, 62, null);
            C11732N0 c11732n0 = C3374a.f10914i;
            long j12 = C3376c.f10942c;
            C11565Q2.m13480b(strJoinToString$default, C7481f.m8513f(aVar2, f12, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, j12, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 48, 0, 131068);
            C1963W0.m2623a(C7482g.m8519d(aVar2, f11), c15688rMo18372i);
            InterfaceC11132i.a aVar4 = (InterfaceC11132i.a) interfaceC15701v0M18246a.getValue();
            if (aVar4 instanceof InterfaceC11132i.a.f) {
                c15688rMo18372i.mo18363O(1881166605);
                if (interfaceC11132i.mo13153b().getType() == AdsType.APK_PAGE) {
                    c15688rMo18372i.mo18363O(-1813337490);
                    strM19466e = C16973X.m19466e((C16972W) C19119E6.f59781m.getValue(), c15688rMo18372i, 0);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-1813254379);
                    strM19466e = C16973X.m19466e((C16972W) C19101C4.f59712o.getValue(), c15688rMo18372i, 0);
                    c15688rMo18372i.m18410W(false);
                }
                c15688rMo18372i.m18410W(false);
            } else if (aVar4 instanceof InterfaceC11132i.a.b) {
                c15688rMo18372i.mo18363O(-1813115592);
                strM19466e = C16973X.m19466e((C16972W) C19285c2.f60058O.getValue(), c15688rMo18372i, 0) + " " + ((InterfaceC11132i.a.b) aVar4).f34632a + "%";
                c15688rMo18372i.m18410W(false);
            } else if (aVar4 instanceof InterfaceC11132i.a.C21173a) {
                c15688rMo18372i.mo18363O(1881180584);
                strM19466e = C16973X.m19466e((C16972W) C19278b3.f59940F.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            } else if (aVar4 instanceof InterfaceC11132i.a.c) {
                c15688rMo18372i.mo18363O(1881183750);
                strM19466e = C16973X.m19466e((C16972W) C19140H5.f59814J0.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            } else if (aVar4 instanceof InterfaceC11132i.a.e) {
                c15688rMo18372i.mo18363O(1881186793);
                strM19466e = C16973X.m19466e((C16972W) C19140H5.f59816K0.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            } else if (aVar4 instanceof InterfaceC11132i.a.d) {
                c15688rMo18372i.mo18363O(1881190027);
                strM19466e = C16973X.m19466e((C16972W) C19278b3.f59942G.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            } else {
                if (!(aVar4 instanceof InterfaceC11132i.a.g)) {
                    c15688rMo18372i.mo18363O(1881164684);
                    c15688rMo18372i.m18410W(false);
                    throw new NoWhenBranchMatchedException();
                }
                c15688rMo18372i.mo18363O(1881193221);
                strM19466e = C16973X.m19466e((C16972W) C19101C4.f59712o.getValue(), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            }
            String str = strM19466e;
            int i15 = i12 & 14;
            boolean z10 = i15 == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == c21235a2) {
                aVar = aVar2;
                c21235a = c21235a2;
                f10 = 0.0f;
                i11 = 2;
                interfaceC11132i2 = interfaceC11132i;
                d dVar2 = new d(0, interfaceC11132i2, InterfaceC11132i.class, "onClick", "onClick()V", 0);
                c15688rMo18372i.mo18380q(dVar2);
                objMo18389z3 = dVar2;
            } else {
                c21235a = c21235a2;
                aVar = aVar2;
                f10 = 0.0f;
                i11 = 2;
                interfaceC11132i2 = interfaceC11132i;
            }
            InterfaceC15676n.a.C21235a c21235a3 = c21235a;
            InterfaceC7507e.a aVar5 = aVar;
            C8245x0.m10154a(C7481f.m8513f(aVar, f12, f10, i11), (Function0) ((KFunction) objMo18389z3), str, null, null, false, false, false, 0L, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, 6, 0, 16376);
            C1963W0.m2623a(C7482g.m8519d(aVar5, f12), c15688rMo18372i);
            c15688rMo18372i.mo18363O(1881203710);
            m20286c(interfaceC11132i2.mo13153b().getScreenshots(), c15688rMo18372i, 0);
            Unit unit = Unit.INSTANCE;
            c15688rMo18372i.m18410W(false);
            C1963W0.m2623a(C7482g.m8519d(aVar5, 10), c15688rMo18372i);
            c15688rMo18372i.mo18363O(1881209366);
            C11565Q2.m13481c(C5256W.m5765d(interfaceC11132i2.mo13153b().getOverview()), C7481f.m8513f(aVar5, f12, 0.0f, 2), j12, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, null, c15688rMo18372i, 48, 0, 524280);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(false);
            C15855h.m18664b(aVar5, 38, c15688r, true);
            boolean z11 = i15 == 4;
            Object objMo18389z4 = c15688r.mo18389z();
            if (z11 || objMo18389z4 == c21235a3) {
                objMo18389z4 = new Function0() { // from class: re.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        interfaceC11132i2.onBackClick();
                        return Unit.INSTANCE;
                    }
                };
                c15688r.mo18380q(objMo18389z4);
            }
            m20284a(0, interfaceC11132i2.mo13153b().getName(), c15688r, (Function0) objMo18389z4, ((Boolean) interfaceC15701v0.getValue()).booleanValue());
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: re.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17920o.m20285b(this.f55684b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20286c(final List<String> list, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(189957307);
        int i11 = i10 | (c15688rMo18372i.mo18362N(list) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
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
            float f10 = 16;
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59648G.getValue(), c15688rMo18372i, 0), C7481f.m8513f(aVar, f10, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10908c, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 48, 0, 131068);
            c15688rMo18372i = c15688rMo18372i;
            C1963W0.m2623a(C7482g.m8519d(aVar, 24), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM25138b = C20541F0.m25138b(C7482g.m8518c(aVar, 1.0f), C20541F0.m25137a(c15688rMo18372i), true, false);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM25138b, c15688rMo18372i);
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
            C1963W0.m2623a(C7482g.m8529n(aVar, f10), c15688rMo18372i);
            c15688rMo18372i.mo18363O(-2143175449);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                float f11 = 8;
                C17040c.m19494a(C0009h.m22a(C7482g.m8529n(C7482g.m8519d(aVar, 306), 144), C4025f.m4709b(f11)), (String) it.next(), null, InterfaceC5208f.a.f17034e, false, 0.0f, C17909d.f55679b, c15688rMo18372i, 1575936, 52);
                C1963W0.m2623a(C7482g.m8529n(aVar, f11), c15688rMo18372i);
            }
            c15688rMo18372i.m18410W(false);
            C1963W0.m2623a(C7482g.m8529n(aVar, 8), c15688rMo18372i);
            c15688rMo18372i.m18410W(true);
            C15855h.m18664b(aVar, f10, c15688rMo18372i, true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(list, i10) { // from class: re.k

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f55686b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17920o.m20286c(this.f55686b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20287d(String str, InterfaceC15676n interfaceC15676n, final int i10) {
        final String str2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(451196145);
        int i11 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58748b, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
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
            str2 = str;
            C4935b.m5517a(C7482g.m8518c(aVar, 1.0f), C3376c.f10940a, str2, c15688rMo18372i, ((i11 << 6) & 896) | 199686);
            c15688rMo18372i.m18410W(true);
        } else {
            str2 = str;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str2, i10) { // from class: re.j

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f55685b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17920o.m20287d(this.f55685b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
