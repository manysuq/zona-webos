package p752qe;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8166R0;
import gg.C11433v;
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
import p055D0.C0946M0;
import p126H.C1963W0;
import p162J.C2399T;
import p162J.C2405d;
import p162J.InterfaceC2388H;
import p162J.InterfaceC2406e;
import p214Lf.C3376c;
import p269Og.C3974S;
import p269Og.C4004l;
import p410Wd.C5922g;
import p410Wd.C5936u;
import p478aa.InterfaceC7059L;
import p592hd.InterfaceC11879c;
import p644k0.C15585G1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15612P1;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18036t;
import p786t0.C18233c;
import p786t0.C18248r;
import p845wg.C19140H5;

/* JADX INFO: renamed from: qe.m */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSeasonsAndEpisodesListM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeasonsAndEpisodesListM.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListMKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,94:1\n1739#2:95\n1814#2,3:96\n1282#3,6:99\n1282#3,6:105\n1282#3,6:111\n1282#3,6:117\n85#4:123\n85#4:124\n168#5,13:125\n*S KotlinDebug\n*F\n+ 1 SeasonsAndEpisodesListM.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListMKt\n*L\n37#1:95\n37#1:96,3\n44#1:99,6\n64#1:105,6\n67#1:111,6\n75#1:117,6\n32#1:123\n62#1:124\n76#1:125,13\n*E\n"})
public final class C17801m {

    /* JADX INFO: renamed from: qe.m$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.content.episodes.compositions.SeasonsAndEpisodesListMKt$EpisodeList$1$1", m18778f = "SeasonsAndEpisodesListM.kt", m18779i = {0}, m18780l = {70}, m18781m = "invokeSuspend", m18782n = {"index"}, m18783nl = {72}, m18784s = {"I$0"}, m18785v = 2)
    @SourceDebugExtension({"SMAP\nSeasonsAndEpisodesListM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeasonsAndEpisodesListM.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListMKt$EpisodeList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n363#2,7:95\n*S KotlinDebug\n*F\n+ 1 SeasonsAndEpisodesListM.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListMKt$EpisodeList$1$1\n*L\n68#1:95,7\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f55367j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ List<C5922g> f55368k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C2399T f55369l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C4004l f55370m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<C5922g> list, C2399T c2399t, C4004l c4004l, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f55368k = list;
            this.f55369l = c2399t;
            this.f55370m = c4004l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f55368k, this.f55369l, this.f55370m, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55367j;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Iterator<C5922g> it = this.f55368k.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(it.next().f19602d, this.f55370m)) {
                        break;
                    }
                    i11++;
                }
                if (i11 >= 0) {
                    this.f55367j = 1;
                    if (C2399T.m3100i(this.f55369l, i11, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: qe.m$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC11879c f55371b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C5922g f55372c;

        public b(InterfaceC11879c interfaceC11879c, C5922g c5922g) {
            this.f55371b = interfaceC11879c;
            this.f55372c = c5922g;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55371b.mo13754e(this.f55372c.f19602d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: qe.m$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC11879c f55373b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C5922g f55374c;

        public c(InterfaceC11879c interfaceC11879c, C5922g c5922g) {
            this.f55373b = interfaceC11879c;
            this.f55374c = c5922g;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f55373b.mo13755f(this.f55374c.f19602d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: qe.m$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,177:1\n*E\n"})
    public static final class d implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f55375b;

        public d(List list) {
            this.f55375b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.f55375b.get(num.intValue());
            return null;
        }
    }

    /* JADX INFO: renamed from: qe.m$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 SeasonsAndEpisodesListM.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListMKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,180:1\n77#2,4:181\n81#2:191\n82#2,5:198\n87#2,2:204\n89#2:207\n84#2,8:208\n1282#3,6:185\n1282#3,6:192\n113#4:203\n113#4:206\n*S KotlinDebug\n*F\n+ 1 SeasonsAndEpisodesListM.kt\nru/zona/app/screens/content/episodes/compositions/SeasonsAndEpisodesListMKt\n*L\n80#1:185,6\n81#1:192,6\n86#1:203\n88#1:206\n*E\n"})
    public static final class e implements Function4<InterfaceC2406e, Integer, InterfaceC15676n, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f55376b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC11879c f55377c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC15612P1 f55378d;

        public e(List list, InterfaceC11879c interfaceC11879c, InterfaceC15612P1 interfaceC15612P1) {
            this.f55376b = list;
            this.f55377c = interfaceC11879c;
            this.f55378d = interfaceC15612P1;
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
                C5922g c5922g = (C5922g) this.f55376b.get(iIntValue);
                interfaceC15676n2.mo18363O(-337480036);
                InterfaceC15612P1 interfaceC15612P1 = this.f55378d;
                boolean zAreEqual = Intrinsics.areEqual(C3974S.m4698a(((InterfaceC11879c.a) interfaceC15612P1.getValue()).f37400c), c5922g.f19600b);
                InterfaceC11879c interfaceC11879c = this.f55377c;
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
                C17796h.m20213a(c5922g, zAreEqual, function0, (Function0) objMo18389z2, ((InterfaceC11879c.a) interfaceC15612P1.getValue()).f37403f.contains(c5922g.f19600b), interfaceC15676n2, 0);
                C1963W0.m2623a(C7468a.m8487b(C7482g.m8519d(C7482g.m8518c(C7481f.m8513f(InterfaceC7507e.a.f24548b, 16, 0.0f, 2), 1.0f), 1), C3376c.f10944e, C0946M0.f3382a), interfaceC15676n2);
                interfaceC15676n2.mo18357I();
            } else {
                interfaceC15676n2.mo18356H();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: qe.m$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            ((InterfaceC11879c) this.receiver).mo13753d(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m20215a(final Integer num, final List<C5922g> list, final C4004l c4004l, final InterfaceC11879c interfaceC11879c, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(770921560);
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
                objMo18389z = new C17798j(0);
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
            boolean zMo18362N = (i12 == 32 || ((i11 & 64) != 0 && c15688rMo18372i.mo18350B(list))) | c15688rMo18372i.mo18362N(interfaceC15701v0M18246a) | ((i11 & 7168) == 2048 || ((i11 & 4096) != 0 && c15688rMo18372i.mo18350B(interfaceC11879c)));
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (zMo18362N || objMo18389z3 == c21235a) {
                objMo18389z3 = new Function1() { // from class: qe.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list2 = list;
                        ((InterfaceC2388H) obj).mo3096c(list2.size(), new C17801m.d(list2), new C18036t(802480018, new C17801m.e(list2, interfaceC11879c, interfaceC15701v0M18246a), true));
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            C2405d.m3106a(null, c2399t, null, null, null, null, false, null, (Function1) objMo18389z3, c15688rMo18372i, 0, 509);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: qe.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C17801m.m20215a(num, list, c4004l, interfaceC11879c, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m20216b(InterfaceC11879c interfaceC11879c, InterfaceC15676n interfaceC15676n, int i10) {
        int i11;
        List<C5922g> listEmptyList;
        InterfaceC11879c interfaceC11879c2 = interfaceC11879c;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-595729025);
        int i12 = i10 | (c15688rMo18372i.mo18362N(interfaceC11879c2) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC11879c2.getState(), c15688rMo18372i, 0);
            Integer num = ((InterfaceC11879c.a) interfaceC15701v0M18246a.getValue()).f37402e;
            if (num == null) {
                c15688rMo18372i.mo18363O(-558351627);
                c15688rMo18372i.m18410W(false);
                i11 = 1;
            } else {
                c15688rMo18372i.mo18363O(-558351626);
                int iIntValue = num.intValue();
                C5936u c5936u = (C5936u) CollectionsKt.getOrNull(((InterfaceC11879c.a) interfaceC15701v0M18246a.getValue()).f37404g.f51909a, iIntValue);
                c15688rMo18372i.mo18363O(-1264932625);
                List<C5936u> list = ((InterfaceC11879c.a) interfaceC15701v0M18246a.getValue()).f37404g.f51909a;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C16973X.m19467f((C16972W) C19140H5.f59829R.getValue(), new Object[]{Integer.valueOf(((C5936u) it.next()).f19662a)}, c15688rMo18372i));
                }
                c15688rMo18372i.m18410W(false);
                boolean z10 = (i12 & 14) == 4;
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                    f fVar = new f(1, interfaceC11879c2, InterfaceC11879c.class, "selectSeasonTub", "selectSeasonTub(I)V", 0);
                    c15688rMo18372i.mo18380q(fVar);
                    objMo18389z = fVar;
                }
                C8166R0.m10136b(arrayList, iIntValue, (Function1) ((KFunction) objMo18389z), false, 0.0f, null, c15688rMo18372i, 0, 56);
                Integer numValueOf = c5936u != null ? Integer.valueOf(c5936u.f19662a) : null;
                if (c5936u == null || (listEmptyList = c5936u.f19663b) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                i11 = 1;
                m20215a(numValueOf, listEmptyList, ((InterfaceC11879c.a) interfaceC15701v0M18246a.getValue()).f37400c, interfaceC11879c, c15688rMo18372i, (i12 << 9) & 7168);
                interfaceC11879c2 = interfaceC11879c;
                c15688rMo18372i.m18410W(false);
            }
        } else {
            i11 = 1;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C11433v(interfaceC11879c2, i10, i11);
        }
    }
}
