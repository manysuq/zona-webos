package p752qe;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import gg.C11437z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.conscrypt.PSKKeyManager;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p162J.C2399T;
import p162J.C2405d;
import p162J.InterfaceC2388H;
import p162J.InterfaceC2406e;
import p269Og.C4004l;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5922g;
import p410Wd.C5936u;
import p478aa.InterfaceC7059L;
import p592hd.InterfaceC11879c;
import p607i9.C12269M6;
import p640jf.C15497Z0;
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
import p786t0.C18233c;
import p786t0.C18248r;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;

/* JADX INFO: renamed from: qe.q */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSeasonsAndEpisodesListTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeasonsAndEpisodesListTv.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListTvKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,90:1\n87#2:91\n84#2,9:92\n94#2:141\n80#3,6:101\n87#3,3:116\n90#3,2:125\n94#3:140\n391#4,9:107\n400#4:127\n401#4,2:138\n4360#5,6:119\n1739#6:128\n1814#6,3:129\n1282#7,6:132\n1282#7,6:142\n1282#7,6:148\n1282#7,6:155\n113#8:154\n85#9:161\n85#9:162\n168#10,13:163\n*S KotlinDebug\n*F\n+ 1 SeasonsAndEpisodesListTv.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListTvKt\n*L\n32#1:91\n32#1:92,9\n32#1:141\n32#1:101,6\n32#1:116,3\n32#1:125,2\n32#1:140\n32#1:107,9\n32#1:127\n32#1:138,2\n32#1:119,6\n35#1:128\n35#1:129,3\n42#1:132,6\n64#1:142,6\n67#1:148,6\n76#1:155,6\n75#1:154\n30#1:161\n63#1:162\n78#1:163,13\n*E\n"})
public final class C17805q {

    /* JADX INFO: renamed from: qe.q$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.content.episodes.compositions.SeasonsAndEpisodesListTvKt$EpisodeList$1$1", m18778f = "SeasonsAndEpisodesListTv.kt", m18779i = {0}, m18780l = {70}, m18781m = "invokeSuspend", m18782n = {"index"}, m18783nl = {72}, m18784s = {"I$0"}, m18785v = 2)
    @SourceDebugExtension({"SMAP\nSeasonsAndEpisodesListTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeasonsAndEpisodesListTv.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListTvKt$EpisodeList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n363#2,7:91\n*S KotlinDebug\n*F\n+ 1 SeasonsAndEpisodesListTv.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListTvKt$EpisodeList$1$1\n*L\n68#1:91,7\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f55388j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ List<C5922g> f55389k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C2399T f55390l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C4004l f55391m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<C5922g> list, C2399T c2399t, C4004l c4004l, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f55389k = list;
            this.f55390l = c2399t;
            this.f55391m = c4004l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f55389k, this.f55390l, this.f55391m, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55388j;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Iterator<C5922g> it = this.f55389k.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(it.next().f19602d, this.f55391m)) {
                        break;
                    }
                    i11++;
                }
                if (i11 >= 0) {
                    this.f55388j = 1;
                    if (C2399T.m3100i(this.f55390l, i11, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: qe.q$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC11879c f55392b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C5922g f55393c;

        public b(InterfaceC11879c interfaceC11879c, C5922g c5922g) {
            this.f55392b = interfaceC11879c;
            this.f55393c = c5922g;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55392b.mo13754e(this.f55393c.f19602d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: qe.q$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC11879c f55394b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C5922g f55395c;

        public c(InterfaceC11879c interfaceC11879c, C5922g c5922g) {
            this.f55394b = interfaceC11879c;
            this.f55395c = c5922g;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55394b.mo13755f(this.f55395c.f19602d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: qe.q$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,177:1\n*E\n"})
    public static final class d implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f55396b;

        public d(List list) {
            this.f55396b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.f55396b.get(num.intValue());
            return null;
        }
    }

    /* JADX INFO: renamed from: qe.q$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 SeasonsAndEpisodesListTv.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListTvKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n79#2,4:181\n83#2:191\n84#2,3:198\n1282#3,6:185\n1282#3,6:192\n*S KotlinDebug\n*F\n+ 1 SeasonsAndEpisodesListTv.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListTvKt\n*L\n82#1:185,6\n83#1:192,6\n*E\n"})
    public static final class e implements Function4<InterfaceC2406e, Integer, InterfaceC15676n, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f55397b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC11879c f55398c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC15612P1 f55399d;

        public e(List list, InterfaceC11879c interfaceC11879c, InterfaceC15612P1 interfaceC15612P1) {
            this.f55397b = list;
            this.f55398c = interfaceC11879c;
            this.f55399d = interfaceC15612P1;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(InterfaceC2406e interfaceC2406e, Integer num, InterfaceC15676n interfaceC15676n, Integer num2) {
            int i10;
            InterfaceC2406e interfaceC2406e2 = interfaceC2406e;
            int iIntValue = num.intValue();
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i10 = (interfaceC15676n2.mo18362N(interfaceC2406e2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= interfaceC15676n2.mo18368e(iIntValue) ? 32 : 16;
            }
            if (interfaceC15676n2.mo18379p(i10 & 1, (i10 & 147) != 146)) {
                C5922g c5922g = (C5922g) this.f55397b.get(iIntValue);
                interfaceC15676n2.mo18363O(-538990653);
                InterfaceC15612P1 interfaceC15612P1 = this.f55399d;
                boolean zAreEqual = Intrinsics.areEqual(((InterfaceC11879c.a) interfaceC15612P1.getValue()).f37400c, c5922g.f19602d);
                InterfaceC11879c interfaceC11879c = this.f55398c;
                boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC11879c) | interfaceC15676n2.mo18350B(c5922g);
                Object objMo18389z = interfaceC15676n2.mo18389z();
                InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                if (zMo18350B || objMo18389z == c21235a) {
                    objMo18389z = new b(interfaceC11879c, c5922g);
                    interfaceC15676n2.mo18380q(objMo18389z);
                }
                Function0 function0 = (Function0) objMo18389z;
                boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC11879c) | interfaceC15676n2.mo18350B(c5922g);
                Object objMo18389z2 = interfaceC15676n2.mo18389z();
                if (zMo18350B2 || objMo18389z2 == c21235a) {
                    objMo18389z2 = new c(interfaceC11879c, c5922g);
                    interfaceC15676n2.mo18380q(objMo18389z2);
                }
                C17796h.m20214b(c5922g, zAreEqual, function0, (Function0) objMo18389z2, ((InterfaceC11879c.a) interfaceC15612P1.getValue()).f37403f.contains(c5922g.f19600b), interfaceC15676n2, 0);
                interfaceC15676n2.mo18357I();
            } else {
                interfaceC15676n2.mo18356H();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: qe.q$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            ((InterfaceC11879c) this.receiver).mo13753d(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m20217a(final Integer num, final List<C5922g> list, final C4004l c4004l, final InterfaceC11879c interfaceC11879c, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1862684601);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18362N(num) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c15688rMo18372i.mo18362N(list) : c15688rMo18372i.mo18350B(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c15688rMo18372i.mo18350B(c4004l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c15688rMo18372i.mo18362N(interfaceC11879c) : c15688rMo18372i.mo18350B(interfaceC11879c) ? 2048 : 1024;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 1171) != 1170)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC11879c.getState(), c15688rMo18372i, 0);
            C18248r c18248r = C2399T.f7869x;
            Object[] objArr = {num};
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = new C17802n(0);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C2399T c2399t = (C2399T) C18233c.m20552d(objArr, c18248r, (Function0) objMo18389z, c15688rMo18372i, 384);
            int i12 = i11 & 112;
            boolean zMo18350B = (i12 == 32 || ((i11 & 64) != 0 && c15688rMo18372i.mo18350B(list))) | c15688rMo18372i.mo18350B(c4004l) | c15688rMo18372i.mo18362N(c2399t);
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18350B || objMo18389z2 == c21235a) {
                objMo18389z2 = new a(list, c2399t, c4004l, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(null, c15688rMo18372i, (Function2) objMo18389z2);
            C1982e.i iVarM2645g = C1982e.m2645g(8);
            boolean zMo18362N = (i12 == 32 || ((i11 & 64) != 0 && c15688rMo18372i.mo18350B(list))) | c15688rMo18372i.mo18362N(interfaceC15701v0M18246a) | ((i11 & 7168) == 2048 || ((i11 & 4096) != 0 && c15688rMo18372i.mo18350B(interfaceC11879c)));
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (zMo18362N || objMo18389z3 == c21235a) {
                objMo18389z3 = new Function1() { // from class: qe.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        InterfaceC2388H interfaceC2388H = (InterfaceC2388H) obj;
                        interfaceC2388H.mo3095b(C17791c.f55341a);
                        List list2 = list;
                        interfaceC2388H.mo3096c(list2.size(), new C17805q.d(list2), new C18036t(802480018, new C17805q.e(list2, interfaceC11879c, interfaceC15701v0M18246a), true));
                        interfaceC2388H.mo3095b(C17791c.f55342b);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            C2405d.m3106a(null, c2399t, null, iVarM2645g, null, null, false, null, (Function1) objMo18389z3, c15688rMo18372i, 24576, 493);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: qe.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C17805q.m20217a(num, list, c4004l, interfaceC11879c, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m20218b(InterfaceC11879c interfaceC11879c, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        List<C5922g> listEmptyList;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1199116779);
        int i11 = i10 | (c15688rMo18372i.mo18362N(interfaceC11879c) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC11879c.getState(), c15688rMo18372i, 0);
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
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
            Integer num = ((InterfaceC11879c.a) interfaceC15701v0M18246a.getValue()).f37402e;
            if (num == null) {
                c15688rMo18372i.mo18363O(278343135);
                c15688rMo18372i.m18410W(false);
                c15688r = c15688rMo18372i;
            } else {
                c15688rMo18372i.mo18363O(278343136);
                int iIntValue = num.intValue();
                c15688rMo18372i.mo18363O(-822302673);
                List<C5936u> list = ((InterfaceC11879c.a) interfaceC15701v0M18246a.getValue()).f37404g.f51909a;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C16973X.m19467f((C16972W) C19140H5.f59829R.getValue(), new Object[]{Integer.valueOf(((C5936u) it.next()).f19662a)}, c15688rMo18372i));
                }
                c15688rMo18372i.m18410W(false);
                boolean z10 = (i11 & 14) == 4;
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                    f fVar = new f(1, interfaceC11879c, InterfaceC11879c.class, "selectSeasonTub", "selectSeasonTub(I)V", 0);
                    c15688rMo18372i.mo18380q(fVar);
                    objMo18389z = fVar;
                }
                C15497Z0.m18125a(arrayList, iIntValue, (Function1) ((KFunction) objMo18389z), c15688rMo18372i, 0);
                C5936u c5936u = (C5936u) CollectionsKt.getOrNull(((InterfaceC11879c.a) interfaceC15701v0M18246a.getValue()).f37404g.f51909a, iIntValue);
                Integer numValueOf = c5936u != null ? Integer.valueOf(c5936u.f19662a) : null;
                if (c5936u == null || (listEmptyList = c5936u.f19663b) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                c15688r = c15688rMo18372i;
                m20217a(numValueOf, listEmptyList, ((InterfaceC11879c.a) interfaceC15701v0M18246a.getValue()).f37400c, interfaceC11879c, c15688r, (i11 << 9) & 7168);
                c15688r.m18410W(false);
            }
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C11437z(interfaceC11879c, i10, 1);
        }
    }
}
