package eg;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7471d;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8200f1;
import bf.C8203g1;
import ch.C8484c;
import ch.C8485d;
import ke.C15855h;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import ne.C17229w;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p016Af.C0136e;
import p016Af.InterfaceC0135d;
import p019B0.C0173B;
import p055D0.C0946M0;
import p055D0.C0998l0;
import p086Ed.C1329A;
import p086Ed.C1335D;
import p086Ed.C1337E;
import p086Ed.InterfaceC1380a;
import p087Ee.C1433b;
import p114G5.AbstractC1714b;
import p125Gg.EnumC1896d;
import p125Gg.EnumC1914v;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p140Hd.InterfaceC2141a;
import p144I.C2192a;
import p163J0.C2431d;
import p168J5.C2468d;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p250Nf.C3765d;
import p270P.C4024e;
import p270P.C4025f;
import p288Q.C4286K0;
import p294Q5.C4555a;
import p303Qe.C4599g;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p359Tg.C5167i;
import p359Tg.InterfaceC5166h;
import p361U0.InterfaceC5178F;
import p395Vg.C5704d;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p430Xf.C6329G;
import p446Yd.InterfaceC6570b;
import p478aa.InterfaceC7059L;
import p480ah.InterfaceC7359e;
import p480ah.InterfaceC7360f;
import p579h0.C11565Q2;
import p579h0.C11569S;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p640jf.C15451C;
import p640jf.C15456E0;
import p640jf.C15496Z;
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
import p689mb.C16999t;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19142I0;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20541F0;
import p881z.C20611t;

/* JADX INFO: renamed from: eg.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainProfileScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainProfileScreenTv.kt\nru/zona/app/ui/tv/profile/MainProfileScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,391:1\n1282#2,6:392\n1282#2,6:398\n1282#2,6:404\n1282#2,6:449\n1282#2,6:458\n1282#2,6:803\n1282#2,6:811\n1282#2,6:863\n1282#2,6:869\n1282#2,6:875\n1282#2,6:881\n113#3:410\n113#3:448\n113#3:455\n113#3:456\n113#3:457\n113#3:464\n113#3:465\n113#3:466\n113#3:512\n113#3:513\n113#3:584\n113#3:589\n113#3:594\n113#3:595\n113#3:629\n113#3:668\n113#3:669\n113#3:674\n113#3:679\n113#3:680\n113#3:756\n113#3:757\n113#3:762\n113#3:763\n113#3:802\n113#3:809\n113#3:810\n113#3:825\n87#4:411\n84#4,9:412\n94#4:511\n87#4:547\n84#4,9:548\n94#4:588\n87#4:630\n83#4,10:631\n94#4:673\n87#4:681\n84#4,9:682\n94#4:824\n87#4:826\n85#4,8:827\n94#4:890\n80#5,6:421\n87#5,3:436\n90#5,2:445\n80#5,6:477\n87#5,3:492\n90#5,2:501\n94#5:506\n94#5:510\n80#5,6:520\n87#5,3:535\n90#5,2:544\n80#5,6:557\n87#5,3:572\n90#5,2:581\n94#5:587\n94#5:592\n80#5,6:602\n87#5,3:617\n90#5,2:626\n80#5,6:641\n87#5,3:656\n90#5,2:665\n94#5:672\n94#5:677\n80#5,6:691\n87#5,3:706\n90#5,2:715\n80#5,6:729\n87#5,3:744\n90#5,2:753\n94#5:760\n80#5,6:775\n87#5,3:790\n90#5,2:799\n94#5:819\n94#5:823\n80#5,6:835\n87#5,3:850\n90#5,2:859\n94#5:889\n391#6,9:427\n400#6:447\n391#6,9:483\n400#6,3:503\n401#6,2:508\n391#6,9:526\n400#6:546\n391#6,9:563\n400#6:583\n401#6,2:585\n401#6,2:590\n391#6,9:608\n400#6:628\n391#6,9:647\n400#6:667\n401#6,2:670\n401#6,2:675\n391#6,9:697\n400#6:717\n391#6,9:735\n400#6:755\n401#6,2:758\n391#6,9:781\n400#6:801\n401#6,2:817\n401#6,2:821\n391#6,9:841\n400#6:861\n401#6,2:887\n4360#7,6:439\n4360#7,6:495\n4360#7,6:538\n4360#7,6:575\n4360#7,6:620\n4360#7,6:659\n4360#7,6:709\n4360#7,6:747\n4360#7,6:793\n4360#7,6:853\n70#8:467\n67#8,9:468\n77#8:507\n99#9,6:514\n106#9:593\n99#9,6:596\n106#9:678\n99#9:718\n95#9,10:719\n106#9:761\n99#9:764\n95#9,10:765\n106#9:820\n75#10:862\n85#11:891\n85#11:892\n85#11:893\n85#11:894\n117#11,2:895\n85#11:897\n85#11:898\n*S KotlinDebug\n*F\n+ 1 MainProfileScreenTv.kt\nru/zona/app/ui/tv/profile/MainProfileScreenTvKt\n*L\n94#1:392,6\n96#1:398,6\n98#1:404,6\n127#1:449,6\n150#1:458,6\n314#1:803,6\n323#1:811,6\n365#1:863,6\n372#1:869,6\n379#1:875,6\n386#1:881,6\n107#1:410\n123#1:448\n130#1:455\n135#1:456\n140#1:457\n155#1:464\n157#1:465\n159#1:466\n183#1:512\n185#1:513\n195#1:584\n203#1:589\n224#1:594\n226#1:595\n233#1:629\n239#1:668\n248#1:669\n259#1:674\n278#1:679\n280#1:680\n286#1:756\n292#1:757\n300#1:762\n307#1:763\n312#1:802\n318#1:809\n321#1:810\n337#1:825\n102#1:411\n102#1:412,9\n102#1:511\n189#1:547\n189#1:548,9\n189#1:588\n235#1:630\n235#1:631,10\n235#1:673\n276#1:681\n276#1:682,9\n276#1:824\n335#1:826\n335#1:827,8\n335#1:890\n102#1:421,6\n102#1:436,3\n102#1:445,2\n146#1:477,6\n146#1:492,3\n146#1:501,2\n146#1:506\n102#1:510\n180#1:520,6\n180#1:535,3\n180#1:544,2\n189#1:557,6\n189#1:572,3\n189#1:581,2\n189#1:587\n180#1:592\n221#1:602,6\n221#1:617,3\n221#1:626,2\n235#1:641,6\n235#1:656,3\n235#1:665,2\n235#1:672\n221#1:677\n276#1:691,6\n276#1:706,3\n276#1:715,2\n282#1:729,6\n282#1:744,3\n282#1:753,2\n282#1:760\n309#1:775,6\n309#1:790,3\n309#1:799,2\n309#1:819\n276#1:823\n335#1:835,6\n335#1:850,3\n335#1:859,2\n335#1:889\n102#1:427,9\n102#1:447\n146#1:483,9\n146#1:503,3\n102#1:508,2\n180#1:526,9\n180#1:546\n189#1:563,9\n189#1:583\n189#1:585,2\n180#1:590,2\n221#1:608,9\n221#1:628\n235#1:647,9\n235#1:667\n235#1:670,2\n221#1:675,2\n276#1:697,9\n276#1:717\n282#1:735,9\n282#1:755\n282#1:758,2\n309#1:781,9\n309#1:801\n309#1:817,2\n276#1:821,2\n335#1:841,9\n335#1:861\n335#1:887,2\n102#1:439,6\n146#1:495,6\n180#1:538,6\n189#1:575,6\n221#1:620,6\n235#1:659,6\n276#1:709,6\n282#1:747,6\n309#1:793,6\n335#1:853,6\n146#1:467\n146#1:468,9\n146#1:507\n180#1:514,6\n180#1:593\n221#1:596,6\n221#1:678\n282#1:718\n282#1:719,10\n282#1:761\n309#1:764\n309#1:765,10\n309#1:820\n344#1:862\n91#1:891\n92#1:892\n93#1:893\n94#1:894\n94#1:895,2\n169#1:897\n334#1:898\n*E\n"})
public final class C10886g {

    /* JADX INFO: renamed from: eg.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC0135d) this.receiver).mo199e();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: eg.g$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.MainProfileScreenTvKt$MainProfileScreenTv$1$1", m18778f = "MainProfileScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class b extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f33772j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0173B c0173b, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f33772j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f33772j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f33772j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m12914a(final C8484c c8484c, final boolean z10, final Function0<Unit> function0, final C0173B c0173b, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-589864139);
        int i11 = i10 | (c15688rMo18372i.mo18350B(c8484c) ? 4 : 2) | (c15688rMo18372i.mo18364a(z10) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 1171) != 1170)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 8;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7481f.m8512e(C7468a.m8487b(C0009h.m22a(C7482g.m8518c(aVar, 1.0f), C4025f.m4709b(f10)), C3376c.f10944e, C0946M0.f3382a), 24, 16), "test_tag_active_profile");
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6643g, InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
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
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            C6329G.m7122a(c8484c, z10, 0L, c15688rMo18372i, i11 & 126, 4);
            C1963W0.m2623a(C7482g.m8529n(aVar, 12), c15688rMo18372i);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            C11565Q2.m13480b(c8484c.f29037b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10924g, 0L, 0L, null, null, 0L, null, C18580v.m21028b(20), null, null, 16646143), c15688rMo18372i, 0, 0, 131070);
            C15688r c15688r = c15688rMo18372i;
            if (!c8484c.f29040e) {
                c15688r.mo18363O(-475496387);
                C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688r);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60091g0.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10934q, C3376c.f10955p, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r, 0, 0, 131070);
                c15688r = c15688r;
                c15688r.m18410W(false);
            } else if (z10) {
                c15688r.mo18363O(-475167973);
                C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688r);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59695f0.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10934q, C3376c.f10955p, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r, 0, 0, 131070);
                c15688r = c15688r;
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(-474868141);
                c15688r.m18410W(false);
            }
            c15688r.m18410W(true);
            C1963W0.m2623a(C7482g.m8529n(aVar, 43), c15688r);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            C1963W0.m2623a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), c15688r);
            C15688r c15688r2 = c15688r;
            C15456E0.m18110a(C7586d.m8700a(aVar, "test_tag_profile_management"), null, C16973X.m19466e((C16972W) C19101C4.f59721s0.getValue(), c15688r, 0), null, null, false, function0, false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688r2, (3670016 & (i11 << 12)) | 24582, 6, 523178);
            c15688rMo18372i = c15688r2;
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, function0, c0173b, i10) { // from class: eg.e

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f33768c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f33769d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0173B f33770e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(3073);
                    C10886g.m12914a(this.f33767b, this.f33768c, this.f33769d, this.f33770e, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m12915b(final InterfaceC1380a interfaceC1380a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        InterfaceC15676n.a.C21235a c21235a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-354133793);
        int i11 = i10 | (c15688rMo18372i.mo18362N(interfaceC1380a) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1380a.mo1976t().mo195a(), c15688rMo18372i, 0);
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(12), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C15496Z.m18124a(null, C16973X.m19466e((C16972W) C19285c2.f60124x.getValue(), c15688rMo18372i, 0), 0L, null, null, null, 0L, null, C4601b.m5206a(), interfaceC1380a.mo1975s(), false, c15688rMo18372i, 0, 0, 1277);
            C15688r c15688r2 = c15688rMo18372i;
            if (c15688r2.mo18383t(C3765d.f12328a) == EnumC1896d.Tv) {
                c15688r2.mo18363O(225541743);
                C15496Z.m18124a(null, C16973X.m19466e((C16972W) C19278b3.f59948J.getValue(), c15688r2, 0), 0L, null, null, null, 0L, null, C4601b.m5206a(), interfaceC1380a.mo1973q(), false, c15688r2, 0, 0, 1277);
                c15688r2 = c15688r2;
                c15688r2.m18410W(false);
            } else {
                c15688r2.mo18363O(225755085);
                c15688r2.m18410W(false);
            }
            C15688r c15688r3 = c15688r2;
            C15496Z.m18124a(null, C16973X.m19466e((C16972W) C19101C4.f59668Q.getValue(), c15688r2, 0), 0L, null, null, null, 0L, null, C4601b.m5206a(), interfaceC1380a.mo1972p(), false, c15688r3, 0, 0, 1277);
            C15496Z.m18124a(null, C16973X.m19466e((C16972W) C19101C4.f59675T0.getValue(), c15688r3, 0), 0L, null, null, null, 0L, null, C4601b.m5225t(), interfaceC1380a.mo1974r(), false, c15688r3, 0, 0, 1277);
            c15688r = c15688r3;
            boolean zIsBlank = StringsKt.isBlank(interfaceC1380a.mo1965h());
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (zIsBlank) {
                c21235a = c21235a2;
                c15688r.mo18363O(226407821);
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(226187752);
                String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59776h.getValue(), c15688r, 0);
                C4600a c4600aM5226u = C4601b.m5226u();
                boolean z10 = (i11 & 14) == 4;
                Object objMo18389z = c15688r.mo18389z();
                if (z10 || objMo18389z == c21235a2) {
                    objMo18389z = new C1433b(interfaceC1380a, 3);
                    c15688r.mo18380q(objMo18389z);
                }
                c21235a = c21235a2;
                C15496Z.m18124a(null, strM19466e, 0L, null, null, null, 0L, null, c4600aM5226u, (Function0) objMo18389z, false, c15688r, 0, 0, 1277);
                c15688r = c15688r;
                c15688r.m18410W(false);
            }
            if (StringsKt.isBlank(interfaceC1380a.mo1966i())) {
                c15688r.mo18363O(226711373);
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(226472084);
                String strM19466e2 = C16973X.m19466e((C16972W) C19119E6.f59760Y.getValue(), c15688r, 0);
                C4600a c4600aM5226u2 = C4601b.m5226u();
                boolean z11 = (i11 & 14) == 4;
                Object objMo18389z2 = c15688r.mo18389z();
                if (z11 || objMo18389z2 == c21235a) {
                    objMo18389z2 = new C8200f1(interfaceC1380a, 1);
                    c15688r.mo18380q(objMo18389z2);
                }
                C15688r c15688r4 = c15688r;
                C15496Z.m18124a(null, strM19466e2, 0L, null, null, null, 0L, null, c4600aM5226u2, (Function0) objMo18389z2, false, c15688r4, 0, 0, 1277);
                c15688r = c15688r4;
                c15688r.m18410W(false);
            }
            if (StringsKt.isBlank(interfaceC1380a.mo1970m())) {
                c15688r.mo18363O(227006989);
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(226767700);
                String strM19466e3 = C16973X.m19466e((C16972W) C19119E6.f59759X.getValue(), c15688r, 0);
                String strMo1970m = interfaceC1380a.mo1970m();
                boolean z12 = (i11 & 14) == 4;
                Object objMo18389z3 = c15688r.mo18389z();
                if (z12 || objMo18389z3 == c21235a) {
                    objMo18389z3 = new C8203g1(interfaceC1380a, 1);
                    c15688r.mo18380q(objMo18389z3);
                }
                C15688r c15688r5 = c15688r;
                C15496Z.m18124a(null, strM19466e3, 0L, null, null, strMo1970m, 0L, null, null, (Function0) objMo18389z3, false, c15688r5, 0, 0, 1501);
                c15688r = c15688r5;
                c15688r.m18410W(false);
            }
            if (Intrinsics.areEqual(interfaceC1380a.mo1976t(), C0136e.f468a)) {
                c15688r.mo18363O(227310541);
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(227086318);
                String strM19466e4 = C16973X.m19466e((C16972W) C19140H5.f59844a0.getValue(), c15688r, 0);
                boolean z13 = ((EnumC1914v) interfaceC15701v0M18246a.getValue()) == EnumC1914v.f6467c;
                InterfaceC0135d interfaceC0135dMo1976t = interfaceC1380a.mo1976t();
                boolean zMo18350B = c15688r.mo18350B(interfaceC0135dMo1976t);
                Object objMo18389z4 = c15688r.mo18389z();
                if (zMo18350B || objMo18389z4 == c21235a) {
                    a aVar2 = new a(0, interfaceC0135dMo1976t, InterfaceC0135d.class, "sendLog", "sendLog()V", 0);
                    c15688r.mo18380q(aVar2);
                    objMo18389z4 = aVar2;
                }
                C15688r c15688r6 = c15688r;
                C15496Z.m18124a(null, strM19466e4, 0L, null, null, null, 0L, null, null, (Function0) ((KFunction) objMo18389z4), z13, c15688r6, 0, 0, 509);
                c15688r = c15688r6;
                c15688r.m18410W(false);
            }
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: eg.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C10886g.m12915b(this.f33762b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0100  */
    /* JADX INFO: renamed from: c */
    public static final void m12916c(final Function0<Unit> function0, final C0173B c0173b, InterfaceC15676n interfaceC15676n, final int i10) {
        char c10;
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2002819752);
        int i12 = i10 | (c15688rMo18372i.mo18350B(function0) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 19) != 18)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 8;
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7468a.m8487b(C0009h.m22a(C7482g.m8518c(aVar, 1.0f), C4025f.m4709b(f10)), C3376c.f10944e, C0946M0.f3382a), 24, 16);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6643g, InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
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
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                c10 = ' ';
            } else {
                c10 = ' ';
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                if (1.0f <= 0.0d) {
                    C2192a.m2845a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true);
                C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
                long j11 = c15688rMo18372i.f50813T;
                i11 = (int) (j11 ^ (j11 >>> c10));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(layoutWeightElement, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                    C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59723t0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10924g, 0L, 0L, null, null, 0L, null, C18580v.m21028b(20), null, null, 16646143), c15688rMo18372i, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59717q0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10930m, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
                c15688rMo18372i.m18410W(true);
                C1963W0.m2623a(C7482g.m8529n(aVar, 43), c15688rMo18372i);
                C15456E0.m18110a(C7586d.m8700a(aVar, "test_tag_auth_button"), null, C16973X.m19466e((C16972W) C19278b3.f59976Y.getValue(), c15688rMo18372i, 0), null, null, false, function0, false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, ((i12 << 18) & 3670016) | 6, 6, 523194);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
            }
            C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true);
            C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j12 = c15688rMo18372i.f50813T;
            i11 = (int) (j12 ^ (j12 >>> c10));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(layoutWeightElement2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            } else {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar2);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59723t0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10924g, 0L, 0L, null, null, 0L, null, C18580v.m21028b(20), null, null, 16646143), c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59717q0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10930m, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i.m18410W(true);
            C1963W0.m2623a(C7482g.m8529n(aVar, 43), c15688rMo18372i);
            C15456E0.m18110a(C7586d.m8700a(aVar, "test_tag_auth_button"), null, C16973X.m19466e((C16972W) C19278b3.f59976Y.getValue(), c15688rMo18372i, 0), null, null, false, function0, false, false, false, c0173b, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, ((i12 << 18) & 3670016) | 6, 6, 523194);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(c0173b, i10) { // from class: eg.c

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0173B f33764c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(49);
                    C10886g.m12916c(this.f33763b, this.f33764c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0130  */
    /* JADX WARN: Code duplicated, block: B:39:0x0146  */
    /* JADX WARN: Code duplicated, block: B:42:0x018e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0199  */
    /* JADX WARN: Code duplicated, block: B:45:0x019b  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0214  */
    /* JADX WARN: Code duplicated, block: B:64:0x023a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0245  */
    /* JADX WARN: Code duplicated, block: B:68:0x0286  */
    /* JADX WARN: Code duplicated, block: B:69:0x028a  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0322  */
    /* JADX WARN: Code duplicated, block: B:80:0x0328  */
    /* JADX WARN: Code duplicated, block: B:82:0x032b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0335  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX INFO: renamed from: d */
    public static final void m12917d(final InterfaceC1380a interfaceC1380a, final InterfaceC6570b interfaceC6570b, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        InterfaceC15676n.a.C21235a c21235a;
        float f10;
        C5167i c5167i;
        Object objMo18389z;
        InterfaceC15701v0 interfaceC15701v0;
        int i12;
        AbstractC1714b.a<C, T> aVar;
        InterfaceC2141a interfaceC2141a;
        boolean z10;
        Object objMo18389z2;
        ?? r10;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-801045180);
        int i13 = i10 | (c15688rMo18372i.mo18362N(interfaceC1380a) ? 4 : 2) | (c15688rMo18372i.mo18362N(interfaceC6570b) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i13 & 1, (i13 & 19) != 18)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1380a.mo1963f().mo13180b().mo13172b().f23614b, c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC1380a.mo1963f().mo13180b().mo13171a(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a3 = C15585G1.m18246a(interfaceC1380a.mo1961d().getState(), c15688rMo18372i, 0);
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (objMo18389z3 == c21235a2) {
                objMo18389z3 = C17229w.m19683a(C3376c.f10944e, c15688rMo18372i);
            }
            InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objMo18389z3;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a2) {
                objMo18389z4 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z4;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (objMo18389z5 == c21235a2) {
                objMo18389z5 = new b(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z5);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z5);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8514g = C7481f.m8514g(C20541F0.m25139c(C7468a.m8487b(C7482g.m8517b(aVar2, 1.0f), C3376c.f10940a, C0946M0.f3382a), C20541F0.m25137a(c15688rMo18372i), 14), 16, 24, 40, 32);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i14 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8514g, c15688rMo18372i);
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
                i11 = i13;
            } else {
                i11 = i13;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                if (C8485d.m10355c(((InterfaceC7360f.a) interfaceC15701v0M18246a2.getValue()).f23598b)) {
                    c15688rMo18372i.mo18363O(-1300433953);
                    m12916c(interfaceC1380a.mo1977v(), c0173b, c15688rMo18372i, 48);
                    c15688rMo18372i.m18410W(false);
                    c21235a = c21235a2;
                } else {
                    c15688rMo18372i.mo18363O(-1300276318);
                    C8484c c8484c = ((InterfaceC7360f.a) interfaceC15701v0M18246a2.getValue()).f23598b;
                    C5167i c5167i2 = ((InterfaceC5166h.a) interfaceC15701v0M18246a3.getValue()).f16977a;
                    c21235a = c21235a2;
                    m12914a(c8484c, C5704d.m6337a(c5167i2.f16980a, c5167i2.f16981b), interfaceC1380a.mo1964g(), c0173b, c15688rMo18372i, 3072);
                    c15688rMo18372i.m18410W(false);
                }
                f10 = 12;
                C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
                if (((InterfaceC7359e.a) interfaceC15701v0M18246a.getValue()).f23595a) {
                    c15688rMo18372i.mo18363O(-1299909619);
                    if ((i11 & 14) != 4) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    objMo18389z2 = c15688rMo18372i.mo18389z();
                    if (!z10 || objMo18389z2 == c21235a) {
                        r10 = 0;
                        objMo18389z2 = new C10880a(interfaceC1380a, 0);
                        c15688rMo18372i.mo18380q(objMo18389z2);
                    } else {
                        r10 = 0;
                    }
                    m12918e((Function1) objMo18389z2, c15688rMo18372i, r10);
                    C15855h.m18664b(aVar2, f10, c15688rMo18372i, r10);
                } else {
                    c15688rMo18372i.mo18363O(-1299749132);
                    c15688rMo18372i.m18410W(false);
                }
                c5167i = ((InterfaceC5166h.a) interfaceC15701v0M18246a3.getValue()).f16977a;
                if (C5704d.m6337a(c5167i.f16980a, c5167i.f16981b)) {
                    c15688rMo18372i.mo18363O(-1299587436);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-1299698912);
                    C4599g.m5203a(interfaceC1380a.mo1960c(), c15688rMo18372i, 0);
                    C15855h.m18664b(aVar2, f10, c15688rMo18372i, false);
                }
                m12915b(interfaceC1380a, c15688rMo18372i, i11 & 14);
                C1963W0.m2623a(C7482g.m8519d(aVar2, 44), c15688rMo18372i);
                interfaceC6570b.mo7395a((i11 >> 3) & 14, c15688rMo18372i);
                if (1.0f <= 0.0d) {
                    C2192a.m2845a("invalid weight; must be greater than zero");
                }
                C1963W0.m2623a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), c15688rMo18372i);
                InterfaceC7507e interfaceC7507eM8533r = C7482g.m8533r(C7482g.m8518c(aVar2, 1.0f), InterfaceC18861d.a.f58761o, 2);
                objMo18389z = c15688rMo18372i.mo18389z();
                if (objMo18389z == c21235a) {
                    interfaceC15701v0 = interfaceC15701v1;
                    objMo18389z = new C1329A(interfaceC15701v0, 1);
                    c15688rMo18372i.mo18380q(objMo18389z);
                } else {
                    interfaceC15701v0 = interfaceC15701v1;
                }
                InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C20611t.m25195a(C7471d.m8495c(C7510a.m8576a(interfaceC7507eM8533r, (Function1) objMo18389z), false, null, 3), 2, ((C0998l0) interfaceC15701v0.getValue()).f3476a, C4025f.m4709b(8)), f10);
                InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
                long j11 = c15688rMo18372i.f50813T;
                i12 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar3);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                    C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                C11565Q2.m13480b(C16973X.m19467f((C16972W) C19285c2.f60118u.getValue(), new Object[]{interfaceC1380a.mo1962e().f8790b}, c15688rMo18372i), C7471d.m8495c(aVar2, false, null, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10933p, c15688rMo18372i, 48, 0, 131068);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
                c15688rMo18372i.m18410W(true);
                aVar = ((C4555a) C2468d.m3195a(interfaceC1380a.mo1959b(), c15688rMo18372i, 0).getValue()).f15383a;
                if (aVar != 0) {
                    interfaceC2141a = (InterfaceC2141a) aVar.f5802b;
                } else {
                    interfaceC2141a = null;
                }
                if (interfaceC2141a == null) {
                    c15688rMo18372i.mo18363O(-1095915815);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-1095915814);
                    C15451C.m18109c(interfaceC2141a, c15688rMo18372i, 0);
                    c15688rMo18372i.m18410W(false);
                }
            }
            C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            if (C8485d.m10355c(((InterfaceC7360f.a) interfaceC15701v0M18246a2.getValue()).f23598b)) {
                c15688rMo18372i.mo18363O(-1300433953);
                m12916c(interfaceC1380a.mo1977v(), c0173b, c15688rMo18372i, 48);
                c15688rMo18372i.m18410W(false);
                c21235a = c21235a2;
            } else {
                c15688rMo18372i.mo18363O(-1300276318);
                C8484c c8484c2 = ((InterfaceC7360f.a) interfaceC15701v0M18246a2.getValue()).f23598b;
                C5167i c5167i3 = ((InterfaceC5166h.a) interfaceC15701v0M18246a3.getValue()).f16977a;
                c21235a = c21235a2;
                m12914a(c8484c2, C5704d.m6337a(c5167i3.f16980a, c5167i3.f16981b), interfaceC1380a.mo1964g(), c0173b, c15688rMo18372i, 3072);
                c15688rMo18372i.m18410W(false);
            }
            f10 = 12;
            C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
            if (((InterfaceC7359e.a) interfaceC15701v0M18246a.getValue()).f23595a) {
                c15688rMo18372i.mo18363O(-1299909619);
                if ((i11 & 14) != 4) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                objMo18389z2 = c15688rMo18372i.mo18389z();
                if (z10) {
                    r10 = 0;
                    objMo18389z2 = new C10880a(interfaceC1380a, 0);
                    c15688rMo18372i.mo18380q(objMo18389z2);
                } else {
                    r10 = 0;
                    objMo18389z2 = new C10880a(interfaceC1380a, 0);
                    c15688rMo18372i.mo18380q(objMo18389z2);
                }
                m12918e((Function1) objMo18389z2, c15688rMo18372i, r10);
                C15855h.m18664b(aVar2, f10, c15688rMo18372i, r10);
            } else {
                c15688rMo18372i.mo18363O(-1299749132);
                c15688rMo18372i.m18410W(false);
            }
            c5167i = ((InterfaceC5166h.a) interfaceC15701v0M18246a3.getValue()).f16977a;
            if (C5704d.m6337a(c5167i.f16980a, c5167i.f16981b)) {
                c15688rMo18372i.mo18363O(-1299698912);
                C4599g.m5203a(interfaceC1380a.mo1960c(), c15688rMo18372i, 0);
                C15855h.m18664b(aVar2, f10, c15688rMo18372i, false);
            } else {
                c15688rMo18372i.mo18363O(-1299587436);
                c15688rMo18372i.m18410W(false);
            }
            m12915b(interfaceC1380a, c15688rMo18372i, i11 & 14);
            C1963W0.m2623a(C7482g.m8519d(aVar2, 44), c15688rMo18372i);
            interfaceC6570b.mo7395a((i11 >> 3) & 14, c15688rMo18372i);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            C1963W0.m2623a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8533r2 = C7482g.m8533r(C7482g.m8518c(aVar2, 1.0f), InterfaceC18861d.a.f58761o, 2);
            objMo18389z = c15688rMo18372i.mo18389z();
            if (objMo18389z == c21235a) {
                interfaceC15701v0 = interfaceC15701v1;
                objMo18389z = new C1329A(interfaceC15701v0, 1);
                c15688rMo18372i.mo18380q(objMo18389z);
            } else {
                interfaceC15701v0 = interfaceC15701v1;
            }
            InterfaceC7507e interfaceC7507eM8511d2 = C7481f.m8511d(C20611t.m25195a(C7471d.m8495c(C7510a.m8576a(interfaceC7507eM8533r2, (Function1) objMo18389z), false, null, 3), 2, ((C0998l0) interfaceC15701v0.getValue()).f3476a, C4025f.m4709b(8)), f10);
            InterfaceC5178F interfaceC5178FM2677d2 = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j12 = c15688rMo18372i.f50813T;
            i12 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8511d2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            } else {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar2);
            C11565Q2.m13480b(C16973X.m19467f((C16972W) C19285c2.f60118u.getValue(), new Object[]{interfaceC1380a.mo1962e().f8790b}, c15688rMo18372i), C7471d.m8495c(aVar2, false, null, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10933p, c15688rMo18372i, 48, 0, 131068);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
            aVar = ((C4555a) C2468d.m3195a(interfaceC1380a.mo1959b(), c15688rMo18372i, 0).getValue()).f15383a;
            if (aVar != 0) {
                interfaceC2141a = (InterfaceC2141a) aVar.f5802b;
            } else {
                interfaceC2141a = null;
            }
            if (interfaceC2141a == null) {
                c15688rMo18372i.mo18363O(-1095915815);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1095915814);
                C15451C.m18109c(interfaceC2141a, c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
            }
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(interfaceC6570b, i10) { // from class: eg.d

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC6570b f33766c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C10886g.m12917d(this.f33765b, this.f33766c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m12918e(Function1<? super Boolean, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        final Function1<? super Boolean, Unit> function2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(345839068);
        int i11 = i10 | (c15688rMo18372i.mo18350B(function1) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            C4024e c4024eM4709b = C4025f.m4709b(8);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 24;
            float f11 = 16;
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7468a.m8487b(C0009h.m22a(aVar, c4024eM4709b), C3376c.f10944e, C0946M0.f3382a), f10, f11);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
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
            C1982e.j jVar = C1982e.f6637a;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(jVar, InterfaceC18861d.a.f58757k, c15688rMo18372i, 48);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar, c15688rMo18372i);
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
            InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar, f10);
            C2431d c2431d = C4601b.f15461a;
            C16987h c16987h = (C16987h) C19142I0.f59917o.getValue();
            c15688rMo18372i.mo18363O(279895816);
            C2431d c2431dM19473b = C16999t.m19473b(c16987h, c15688rMo18372i, 0);
            c15688rMo18372i.mo18357I();
            C11569S.m13483b(c2431dM19473b, null, interfaceC7507eM8525j, C3376c.f10951l, c15688rMo18372i, 432, 0);
            C1963W0.m2623a(C7482g.m8529n(aVar, 4), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60111q0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i.m18410W(true);
            float f12 = 12;
            C1963W0.m2623a(C7482g.m8519d(aVar, f12), c15688rMo18372i);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19119E6.f59764b.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10926i, c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, f12), c15688rMo18372i);
            C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(jVar, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j12 = c15688rMo18372i.f50813T;
            int i14 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
            float f13 = 200;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7482g.m8530o(aVar, f13, 0.0f, 2), "test_tag_sync_my_button");
            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60092h.getValue(), c15688rMo18372i, 0);
            int i15 = i11 & 14;
            boolean z10 = i15 == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (z10 || objMo18389z == c21235a) {
                objMo18389z = new C1335D(function1, 2);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C15456E0.m18110a(interfaceC7507eM8700a, null, strM19466e, null, null, false, (Function0) objMo18389z, false, false, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 6, 0, 524218);
            C1963W0.m2623a(C7482g.m8529n(aVar, f11), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(aVar, f13, 0.0f, 2);
            long j13 = C3376c.f10945f;
            String strM19466e2 = C16973X.m19466e((C16972W) C19101C4.f59684a.getValue(), c15688rMo18372i, 0);
            boolean z11 = i15 == 4;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (z11 || objMo18389z2 == c21235a) {
                function2 = function1;
                objMo18389z2 = new C1337E(function2, 1);
                c15688rMo18372i.mo18380q(objMo18389z2);
            } else {
                function2 = function1;
            }
            C15456E0.m18110a(interfaceC7507eM8530o, null, strM19466e2, null, null, false, (Function0) objMo18389z2, false, false, false, null, j13, 0L, 0L, 0.0f, 0.0f, 0.0f, false, null, c15688rMo18372i, 6, 0, 522170);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            function2 = function1;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: eg.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C10886g.m12918e(this.f33771b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
