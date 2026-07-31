package p447Ye;

import af.C7328u;
import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8245x0;
import gf.C11397k;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p019B0.C0173B;
import p055D0.C0946M0;
import p055D0.C0963V0;
import p125Gg.EnumC1914v;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2027t;
import p126H.C2032v;
import p126H.C2036x;
import p126H.InterfaceC2030u;
import p144I.C2192a;
import p163J0.C2431d;
import p180K.C2687h;
import p180K.InterfaceC2660M;
import p180K.InterfaceC2675b;
import p180K.InterfaceC2700t;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p266Od.InterfaceC3933a;
import p269Og.C3986c;
import p288Q.C4286K0;
import p288Q.C4328V;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5920e;
import p410Wd.C5934s;
import p410Wd.InterfaceC5926k;
import p410Wd.InterfaceC5928m;
import p429Xe.C6322j;
import p450Z.C6625h;
import p450Z.InterfaceC6623f;
import p450Z.InterfaceC6624g;
import p478aa.InterfaceC7059L;
import p563ff.C11154g;
import p579h0.C11565Q2;
import p580h1.C11732N0;
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
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p775s0.C18036t;
import p775s0.C18037u;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19142I0;
import p845wg.C19285c2;
import p881z.C20541F0;
import p881z.C20557N0;

/* JADX INFO: renamed from: Ye.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainSearchPageM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchPageM.kt\nru/zona/app/screens/search/main/MainSearchPageMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n1#1,244:1\n1282#2,6:245\n1282#2,6:251\n1282#2,6:294\n1282#2,6:300\n1282#2,6:306\n1282#2,6:312\n1282#2,6:318\n1282#2,6:324\n1282#2,6:330\n1282#2,6:336\n1282#2,6:342\n1282#2,6:348\n1282#2,6:358\n1282#2,6:400\n1282#2,6:474\n87#3:257\n84#3,9:258\n94#3:357\n87#3:412\n85#3,8:413\n94#3:452\n80#4,6:267\n87#4,3:282\n90#4,2:291\n94#4:356\n80#4,6:373\n87#4,3:388\n90#4,2:397\n94#4:408\n80#4,6:421\n87#4,3:436\n90#4,2:445\n94#4:451\n391#5,9:273\n400#5:293\n401#5,2:354\n391#5,9:379\n400#5:399\n401#5,2:406\n391#5,9:427\n400#5:447\n401#5,2:449\n4360#6,6:285\n4360#6,6:391\n4360#6,6:439\n113#7:364\n113#7:365\n113#7:366\n113#7:410\n113#7:411\n113#7:448\n113#7:473\n99#8,6:367\n106#8:409\n85#9:453\n85#9:454\n524#10,18:455\n*S KotlinDebug\n*F\n+ 1 MainSearchPageM.kt\nru/zona/app/screens/search/main/MainSearchPageMKt\n*L\n65#1:245,6\n67#1:251,6\n75#1:294,6\n76#1:300,6\n78#1:306,6\n80#1:312,6\n87#1:318,6\n96#1:324,6\n97#1:330,6\n98#1:336,6\n99#1:342,6\n108#1:348,6\n117#1:358,6\n187#1:400,6\n136#1:474,6\n71#1:257\n71#1:258,9\n71#1:357\n223#1:412\n223#1:413,8\n223#1:452\n71#1:267,6\n71#1:282,3\n71#1:291,2\n71#1:356\n157#1:373,6\n157#1:388,3\n157#1:397,2\n157#1:408\n223#1:421,6\n223#1:436,3\n223#1:445,2\n223#1:451\n71#1:273,9\n71#1:293\n71#1:354,2\n157#1:379,9\n157#1:399\n157#1:406,2\n223#1:427,9\n223#1:447\n223#1:449,2\n71#1:285,6\n157#1:391,6\n223#1:439,6\n118#1:364\n160#1:365\n162#1:366\n211#1:410\n225#1:411\n242#1:448\n134#1:473\n157#1:367,6\n157#1:409\n62#1:453\n63#1:454\n137#1:455,18\n*E\n"})
public final class C6584h {

    /* JADX INFO: renamed from: Ye.h$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.search.main.MainSearchPageMKt$MainSearchPageM$1$1", m18778f = "MainSearchPageM.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f21590j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21590j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f21590j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f21590j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3933a) this.receiver).mo4670j();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function1<C3986c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3986c c3986c) {
            ((InterfaceC3933a) this.receiver).mo4661a(c3986c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3933a) this.receiver).mo4662b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3933a) this.receiver).mo4671k();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3933a) this.receiver).mo4663c();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements Function1<C3986c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3986c c3986c) {
            ((InterfaceC3933a) this.receiver).mo4661a(c3986c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$h */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            ((InterfaceC3933a) this.receiver).mo4669i(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$i */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            ((InterfaceC3933a) this.receiver).mo4672l(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$j */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements Function1<C3986c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3986c c3986c) {
            ((InterfaceC3933a) this.receiver).mo4661a(c3986c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$k */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements Function1<C3986c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3986c c3986c) {
            ((InterfaceC3933a) this.receiver).mo4668h(c3986c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$l */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC3933a) this.receiver).mo4664d();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ye.h$m */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class m implements InterfaceC6623f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6625h f21591a;

        public m(C6625h c6625h) {
            this.f21591a = c6625h;
        }

        @Override // p450Z.InterfaceC6623f
        /* JADX INFO: renamed from: a */
        public final void mo1777a(final C18036t c18036t, InterfaceC15676n interfaceC15676n, final int i10) {
            C15688r c15688r;
            C15688r c15688rMo18372i = interfaceC15676n.mo18372i(371275207);
            int i11 = (c15688rMo18372i.mo18362N(this) ? 32 : 16) | i10;
            if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
                if (this.f21591a.m7428c().f21694d.length() == 0) {
                    c15688rMo18372i.mo18363O(313191285);
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59821N.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10909d, C3376c.f10942c, 0L, new C16318q(400), null, 0L, null, 0L, null, null, 16777210), c15688rMo18372i, 0, 0, 131070);
                    c15688r = c15688rMo18372i;
                    c15688r.m18410W(false);
                } else {
                    c15688r = c15688rMo18372i;
                    c15688r.mo18363O(1119285467);
                    c15688r.m18410W(false);
                }
                c18036t.invoke(c15688r, 6);
            } else {
                c15688r = c15688rMo18372i;
                c15688r.mo18356H();
            }
            C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
            if (c15634y0M18412Y != null) {
                c15634y0M18412Y.f50634d = new Function2(c18036t, i10) { // from class: Ye.i

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ C18036t f21597c;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM18294a = C15636Z0.m18294a(7);
                        this.f21596b.mo1777a(this.f21597c, (InterfaceC15676n) obj, iM18294a);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
    }

    /* JADX INFO: renamed from: Ye.h$n */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4\n*L\n1#1,538:1\n*E\n"})
    public static final class n implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f21592b;

        public n(List list) {
            this.f21592b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.f21592b.get(num.intValue());
            return null;
        }
    }

    /* JADX INFO: renamed from: Ye.h$o */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 MainSearchPageM.kt\nru/zona/app/screens/search/main/MainSearchPageMKt\n*L\n1#1,541:1\n138#2,6:542\n*E\n"})
    public static final class o implements Function4<InterfaceC2700t, Integer, InterfaceC15676n, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f21593b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1 f21594c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f21595d;

        public o(List list, Function1 function1, String str) {
            this.f21593b = list;
            this.f21594c = function1;
            this.f21595d = str;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(InterfaceC2700t interfaceC2700t, Integer num, InterfaceC15676n interfaceC15676n, Integer num2) {
            int i10;
            InterfaceC2700t interfaceC2700t2 = interfaceC2700t;
            int iIntValue = num.intValue();
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i10 = (interfaceC15676n2.mo18362N(interfaceC2700t2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= interfaceC15676n2.mo18368e(iIntValue) ? 32 : 16;
            }
            if (interfaceC15676n2.mo18379p(i10 & 1, (i10 & 147) != 146)) {
                C5934s c5934s = (C5934s) this.f21593b.get(iIntValue);
                interfaceC15676n2.mo18363O(-1578808794);
                C11397k.m13421a(c5934s, this.f21594c, this.f21595d, interfaceC15676n2, 0);
                interfaceC15676n2.mo18357I();
            } else {
                interfaceC15676n2.mo18356H();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m7397a(final List<String> list, final List<? extends InterfaceC5926k> list2, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final Function1<? super C3986c, Unit> function3, final Function1<? super C3986c, Unit> function4, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2115934542);
        int i11 = i10 | (c15688rMo18372i.mo18362N(list) ? 4 : 2) | (c15688rMo18372i.mo18362N(list2) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function2) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function3) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function4) ? 131072 : Parser.ARGC_LIMIT);
        if (c15688rMo18372i.mo18379p(i11 & 1, (74899 & i11) != 74898)) {
            C20557N0 c20557n0M25137a = C20541F0.m25137a(c15688rMo18372i);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(aVar, c20557n0M25137a, 14);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(16), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM25139c, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            if (list == null || !(!list.isEmpty())) {
                c15688rMo18372i.mo18363O(1051405146);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1051234088);
                int i13 = i11 >> 3;
                C6322j.m7119a(list, function1, function2, c15688rMo18372i, (i11 & 14) | (i13 & 112) | (i13 & 896));
                c15688rMo18372i.m18410W(false);
            }
            if (list2 == null || !(!list2.isEmpty())) {
                c15688rMo18372i.mo18363O(1051703738);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1051462527);
                C11154g.m13162b(C16973X.m19466e((C16972W) C19101C4.f59671R0.getValue(), c15688rMo18372i, 0), list2, function3, null, null, function4, false, c15688rMo18372i, (i11 & 112) | ((i11 >> 6) & 896) | (i11 & 458752), 88);
                c15688rMo18372i.m18410W(false);
            }
            C15855h.m18664b(aVar, 8, c15688rMo18372i, true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(list, list2, function1, function2, function3, function4, i10) { // from class: Ye.d

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f21574b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ List f21575c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function1 f21576d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function1 f21577e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function1 f21578f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function1 f21579g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6584h.m7397a(this.f21574b, this.f21575c, this.f21576d, this.f21577e, this.f21578f, this.f21579g, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX INFO: renamed from: b */
    public static final void m7398b(InterfaceC3933a interfaceC3933a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        int i11;
        List<InterfaceC5928m> list;
        int i12;
        Object obj;
        boolean z10;
        boolean z11;
        int i13;
        C15688r c15688r2;
        C15688r c15688r3;
        boolean z12;
        Object obj2;
        int i14;
        ?? r11;
        final InterfaceC3933a interfaceC3933a2 = interfaceC3933a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-373659683);
        int i15 = (c15688rMo18372i.mo18362N(interfaceC3933a2) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i15 & 1, (i15 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC3933a2.getState(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC3933a2.mo4665e(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            Object obj3 = InterfaceC15676n.a.f50781a;
            if (objMo18389z == obj3) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            KFunction kFunction = null;
            if (objMo18389z2 == obj3) {
                objMo18389z2 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z2);
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(InterfaceC7507e.a.f24548b, 1.0f);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i16 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i16))) {
                C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C6625h c6625hMo4666f = interfaceC3933a2.mo4666f();
            int i17 = i15 & 14;
            boolean z13 = i17 == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z13 || objMo18389z3 == obj3) {
                i11 = i17;
                Object bVar = new b(0, interfaceC3933a2, InterfaceC3933a.class, "updateSuggestions", "updateSuggestions()V", 0);
                c15688rMo18372i.mo18380q(bVar);
                objMo18389z3 = bVar;
            } else {
                i11 = i17;
            }
            Function0 function0 = (Function0) ((KFunction) objMo18389z3);
            boolean z14 = i11 == 4;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (z14 || objMo18389z4 == obj3) {
                Object dVar = new d(0, interfaceC3933a, InterfaceC3933a.class, "clearQuery", "clearQuery()V", 0);
                c15688rMo18372i.mo18380q(dVar);
                objMo18389z4 = dVar;
            }
            Function0 function1 = (Function0) ((KFunction) objMo18389z4);
            if (((InterfaceC3933a.a) interfaceC15701v0M18246a.getValue()).f12887a) {
                c15688rMo18372i.mo18363O(59116178);
                boolean z15 = i11 == 4;
                Object objMo18389z5 = c15688rMo18372i.mo18389z();
                if (z15 || objMo18389z5 == obj3) {
                    Object eVar = new e(0, interfaceC3933a, InterfaceC3933a.class, "onVoiceSearchClick", "onVoiceSearchClick()V", 0);
                    c15688rMo18372i.mo18380q(eVar);
                    objMo18389z5 = eVar;
                }
                kFunction = (KFunction) objMo18389z5;
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(59165994);
                c15688rMo18372i.m18410W(false);
            }
            Function0 function2 = (Function0) kFunction;
            boolean z16 = i11 == 4;
            Object objMo18389z6 = c15688rMo18372i.mo18389z();
            if (z16 || objMo18389z6 == obj3) {
                Object fVar = new f(0, interfaceC3933a, InterfaceC3933a.class, "onSearchClick", "onSearchClick()V", 0);
                c15688rMo18372i.mo18380q(fVar);
                objMo18389z6 = fVar;
            }
            int i18 = i11;
            m7399c(c6625hMo4666f, c0173b, function0, function1, function2, (Function0) ((KFunction) objMo18389z6), c15688rMo18372i, 48);
            if (StringsKt.isBlank(interfaceC3933a.mo4666f().m7428c().f21694d)) {
                List<String> list2 = ((InterfaceC3933a.a) interfaceC15701v0M18246a.getValue()).f12890d;
                if ((list2 == null || !(!list2.isEmpty())) && ((list = ((InterfaceC3933a.a) interfaceC15701v0M18246a.getValue()).f12891e) == null || !(!list.isEmpty()))) {
                    i12 = i18;
                    obj = obj3;
                    z10 = true;
                    c15688rMo18372i.mo18363O(60168008);
                    C5920e c5920e = ((InterfaceC3933a.a) interfaceC15701v0M18246a.getValue()).f12892f;
                    if (c5920e == null) {
                        c15688rMo18372i.mo18363O(60168007);
                        c15688rMo18372i.m18410W(false);
                        z11 = false;
                        i13 = 4;
                        c15688r2 = c15688rMo18372i;
                    } else {
                        c15688rMo18372i.mo18363O(60168008);
                        String str = c5920e.f19594c;
                        ArrayList arrayList = c5920e.f19596e;
                        boolean z17 = i12 == 4;
                        Object objMo18389z7 = c15688rMo18372i.mo18389z();
                        if (z17 || objMo18389z7 == obj) {
                            Object cVar = new c(1, interfaceC3933a, InterfaceC3933a.class, "onContentClick", "onContentClick(Lru/zona/content/models/EntityId;)V", 0);
                            c15688rMo18372i.mo18380q(cVar);
                            objMo18389z7 = cVar;
                        }
                        z11 = false;
                        z10 = true;
                        obj = obj;
                        i13 = 4;
                        C11154g.m13162b(str, arrayList, (Function1) ((KFunction) objMo18389z7), null, null, null, false, c15688rMo18372i, 0, 120);
                        C15688r c15688r4 = c15688rMo18372i;
                        c15688r4.m18410W(false);
                        c15688r2 = c15688r4;
                    }
                    c15688r2.m18410W(z11);
                    c15688r3 = c15688r2;
                } else {
                    c15688rMo18372i.mo18363O(59676627);
                    List<String> list3 = ((InterfaceC3933a.a) interfaceC15701v0M18246a.getValue()).f12890d;
                    List<InterfaceC5928m> list4 = ((InterfaceC3933a.a) interfaceC15701v0M18246a.getValue()).f12891e;
                    boolean z18 = i18 == 4;
                    Object objMo18389z8 = c15688rMo18372i.mo18389z();
                    if (z18 || objMo18389z8 == obj3) {
                        Object hVar = new h(1, interfaceC3933a, InterfaceC3933a.class, "onQueryClick", "onQueryClick(Ljava/lang/String;)V", 0);
                        c15688rMo18372i.mo18380q(hVar);
                        objMo18389z8 = hVar;
                    }
                    Function1 function3 = (Function1) ((KFunction) objMo18389z8);
                    boolean z19 = i18 == 4;
                    Object objMo18389z9 = c15688rMo18372i.mo18389z();
                    if (z19 || objMo18389z9 == obj3) {
                        Object iVar = new i(1, interfaceC3933a, InterfaceC3933a.class, "deleteQueryFromHistory", "deleteQueryFromHistory(Ljava/lang/String;)V", 0);
                        c15688rMo18372i.mo18380q(iVar);
                        objMo18389z9 = iVar;
                    }
                    Function1 function4 = (Function1) ((KFunction) objMo18389z9);
                    boolean z20 = i18 == 4;
                    Object objMo18389z10 = c15688rMo18372i.mo18389z();
                    if (z20 || objMo18389z10 == obj3) {
                        Object jVar = new j(1, interfaceC3933a, InterfaceC3933a.class, "onContentClick", "onContentClick(Lru/zona/content/models/EntityId;)V", 0);
                        c15688rMo18372i.mo18380q(jVar);
                        objMo18389z10 = jVar;
                    }
                    Function1 function5 = (Function1) ((KFunction) objMo18389z10);
                    boolean z21 = i18 == 4;
                    Object objMo18389z11 = c15688rMo18372i.mo18389z();
                    if (z21 || objMo18389z11 == obj3) {
                        Object kVar = new k(1, interfaceC3933a, InterfaceC3933a.class, "deleteContentFromHistory", "deleteContentFromHistory(Lru/zona/content/models/EntityId;)V", 0);
                        c15688rMo18372i.mo18380q(kVar);
                        objMo18389z11 = kVar;
                    }
                    obj = obj3;
                    z10 = true;
                    m7397a(list3, list4, function3, function4, function5, (Function1) ((KFunction) objMo18389z11), c15688rMo18372i, 0);
                    c15688rMo18372i.m18410W(false);
                    i12 = i18;
                    i13 = 4;
                    c15688r3 = c15688rMo18372i;
                }
            } else {
                c15688rMo18372i.mo18363O(59318515);
                List<C5934s> list5 = ((InterfaceC3933a.a) interfaceC15701v0M18246a.getValue()).f12888b;
                boolean z22 = i18 == 4;
                Object objMo18389z12 = c15688rMo18372i.mo18389z();
                if (z22 || objMo18389z12 == obj3) {
                    obj2 = obj3;
                    i14 = i18;
                    r11 = 0;
                    Object gVar = new g(1, interfaceC3933a, InterfaceC3933a.class, "onContentClick", "onContentClick(Lru/zona/content/models/EntityId;)V", 0);
                    c15688rMo18372i.mo18380q(gVar);
                    objMo18389z12 = gVar;
                } else {
                    i14 = i18;
                    obj2 = obj3;
                    r11 = 0;
                }
                m7400d(list5, (Function1) ((KFunction) objMo18389z12), interfaceC3933a.mo4666f().m7428c().f21694d.toString(), c15688rMo18372i, r11);
                c15688rMo18372i.m18410W(r11);
                i12 = i14;
                obj = obj2;
                i13 = 4;
                z10 = true;
                c15688r3 = c15688rMo18372i;
            }
            c15688r3.m18410W(z10);
            if (((EnumC1914v) interfaceC15701v0M18246a2.getValue()) == EnumC1914v.f6467c) {
                c15688r3.mo18363O(861646256);
                boolean z23 = i12 == i13;
                Object objMo18389z13 = c15688r3.mo18389z();
                if (z23 || objMo18389z13 == obj) {
                    z12 = false;
                    interfaceC3933a2 = interfaceC3933a;
                    Object lVar = new l(0, interfaceC3933a2, InterfaceC3933a.class, "onStopVoiceSearchClick", "onStopVoiceSearchClick()V", 0);
                    c15688r3.mo18380q(lVar);
                    objMo18389z13 = lVar;
                } else {
                    z12 = false;
                    interfaceC3933a2 = interfaceC3933a;
                }
                C7328u.m8150a((Function0) ((KFunction) objMo18389z13), 180, c15688r3, 48);
                c15688r3.m18410W(z12);
                c15688r = c15688r3;
            } else {
                interfaceC3933a2 = interfaceC3933a;
                c15688r3.mo18363O(861789445);
                c15688r3.m18410W(false);
                c15688r = c15688r3;
            }
        } else {
            c15688rMo18372i.mo18356H();
            c15688r = c15688rMo18372i;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ye.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6584h.m7398b(this.f21567b, (InterfaceC15676n) obj4, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7399c(final C6625h c6625h, final C0173B c0173b, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1427721423);
        int i12 = i10 | (c15688rMo18372i.mo18362N(c6625h) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function3) ? 131072 : Parser.ARGC_LIMIT);
        if (c15688rMo18372i.mo18379p(i12 & 1, (74899 & i12) != 74898)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7482g.m8518c(aVar, 1.0f), 16);
            C1982e.i iVarM2645g = C1982e.m2645g(24);
            C18863f.b bVar = InterfaceC18861d.a.f58757k;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(iVarM2645g, bVar, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7512c.m8578a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), c0173b).mo2665S0(new VerticalAlignElement(bVar)), "test_tag_search_field");
            C0963V0 c0963v0 = new C0963V0(C3376c.f10957r);
            C11732N0 c11732n0M13585a = C11732N0.m13585a(C3374a.f10909d, 0L, 0L, new C16318q(400), null, 0L, null, 0L, null, null, 16777211);
            m mVar = new m(c6625h);
            boolean z10 = (i12 & 896) == 256;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new Function2() { // from class: Ye.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C4328V.m4976a(c6625h, interfaceC7507eM8700a, false, null, c11732n0M13585a, null, InterfaceC6624g.b.f21700a, (Function2) objMo18389z, c0963v0, mVar, null, c15688rMo18372i, (i12 & 14) | 100663296, 21724);
            if (c6625h.m7428c().f21694d.length() != 0 || function2 == null) {
                c15688rMo18372i.mo18363O(-20488169);
                i11 = 0;
                C8245x0.m10155b(null, function1, C16973X.m19466e((C16972W) C19285c2.f60081b0.getValue(), c15688rMo18372i, 0), C4601b.m5210e(), false, false, 0L, C3376c.f10942c, 0.0f, c15688rMo18372i, (i12 >> 6) & 112, 753);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-20707649);
                String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59745J.getValue(), c15688rMo18372i, 0);
                C2431d c2431d = C4601b.f15461a;
                C8245x0.m10155b(null, function2, strM19466e, new C4600a((C16987h) C19142I0.f59927y.getValue(), null), false, false, 0L, 0L, 0.0f, c15688rMo18372i, (i12 >> 9) & 112, 1009);
                c15688rMo18372i.m18410W(false);
                i11 = 0;
            }
            C8245x0.m10155b(C7586d.m8700a(aVar, "test_tag_search_button"), function3, C16973X.m19466e((C16972W) C19140H5.f59821N.getValue(), c15688rMo18372i, i11), C4601b.m5224s(), false, false, 0L, 0L, 0.0f, c15688rMo18372i, ((i12 >> 12) & 112) | 24582, 992);
            c15688rMo18372i.m18410W(true);
            C1963W0.m2623a(C7468a.m8487b(C7482g.m8519d(C7482g.m8518c(aVar, 1.0f), 1), C3376c.f10945f, C0946M0.f3382a), c15688rMo18372i);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(c0173b, function0, function1, function2, function3, i10) { // from class: Ye.f

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0173B f21582c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f21583d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f21584e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f21585f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function0 f21586g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(49);
                    C6584h.m7399c(this.f21581b, this.f21582c, this.f21583d, this.f21584e, this.f21585f, this.f21586g, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m7400d(final List<C5934s> list, final Function1<? super C3986c, Unit> function1, final String str, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(780474622);
        int i11 = (c15688rMo18372i.mo18362N(list) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16) | (c15688rMo18372i.mo18362N(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            C2027t.m2686a(null, null, C18037u.m20404c(354739560, new Function3() { // from class: Ye.b
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC2030u interfaceC2030u = (InterfaceC2030u) obj;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= interfaceC15676n2.mo18362N(interfaceC2030u) ? 4 : 2;
                    }
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 19) != 18)) {
                        int iCoerceIn = RangesKt.coerceIn((int) (interfaceC2030u.mo2687a() / 360), 1, 2);
                        InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(InterfaceC7507e.a.f24548b, "test_tag_search_suggestions");
                        InterfaceC2675b.a aVar = new InterfaceC2675b.a(iCoerceIn);
                        C1982e.i iVarM2645g = C1982e.m2645g(4);
                        final List list2 = list;
                        boolean zMo18350B = interfaceC15676n2.mo18350B(list2);
                        final Function1 function2 = function1;
                        boolean zMo18362N = zMo18350B | interfaceC15676n2.mo18362N(function2);
                        final String str2 = str;
                        boolean zMo18362N2 = zMo18362N | interfaceC15676n2.mo18362N(str2);
                        Object objMo18389z = interfaceC15676n2.mo18389z();
                        if (zMo18362N2 || objMo18389z == InterfaceC15676n.a.f50781a) {
                            objMo18389z = new Function1() { // from class: Ye.g
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    List list3 = list2;
                                    ((InterfaceC2660M) obj4).mo3410a(list3.size(), new C6584h.n(list3), new C18036t(-1117249557, new C6584h.o(list3, function2, str2), true));
                                    return Unit.INSTANCE;
                                }
                            };
                            interfaceC15676n2.mo18380q(objMo18389z);
                        }
                        C2687h.m3426a(aVar, interfaceC7507eM8700a, null, null, null, iVarM2645g, null, false, null, (Function1) objMo18389z, interfaceC15676n2, 102236208, 700);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3072, 7);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(list, function1, str, i10) { // from class: Ye.c

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f21571b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f21572c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f21573d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6584h.m7400d(this.f21571b, this.f21572c, this.f21573d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
