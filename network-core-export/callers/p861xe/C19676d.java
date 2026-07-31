package p861xe;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8158N;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import md.InterfaceC17012f;
import p019B0.C0173B;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p180K.C2678c0;
import p180K.C2686g0;
import p269Og.EnumC3994g;
import p269Og.InterfaceC4008o;
import p288Q.C4286K0;
import p382V3.AbstractC5552D;
import p382V3.C5634s0;
import p392Vd.EnumC5670a;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p400W3.C5849c;
import p400W3.C5852f;
import p410Wd.C5931p;
import p410Wd.InterfaceC5928m;
import p478aa.InterfaceC7059L;
import p524da.InterfaceC10423g;
import p640jf.C15469L;
import p640jf.C15481R0;
import p640jf.C15536p0;
import p640jf.C15547v;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15658h;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p798te.C18342a;
import p830w0.InterfaceC18861d;
import p845wg.C19278b3;
import pf.C17609n;

/* JADX INFO: renamed from: xe.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFilmographyPageTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilmographyPageTv.kt\nru/zona/app/screens/filmography/FilmographyPageTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,77:1\n1282#2,6:78\n1282#2,6:84\n1282#2,6:130\n1282#2,6:137\n1282#2,6:143\n85#3:90\n85#3:91\n87#4:92\n84#4,9:93\n94#4:152\n80#5,6:102\n87#5,3:117\n90#5,2:126\n94#5:151\n391#6,9:108\n400#6:128\n401#6,2:149\n4360#7,6:120\n113#8:129\n113#8:136\n*S KotlinDebug\n*F\n+ 1 FilmographyPageTv.kt\nru/zona/app/screens/filmography/FilmographyPageTvKt\n*L\n39#1:78,6\n41#1:84,6\n55#1:130,6\n60#1:137,6\n70#1:143,6\n35#1:90\n36#1:91\n50#1:92\n50#1:93,9\n50#1:152\n50#1:102,6\n50#1:117,3\n50#1:126,2\n50#1:151\n50#1:108,9\n50#1:128\n50#1:149,2\n50#1:120,6\n51#1:129\n58#1:136\n*E\n"})
public final class C19676d {

    /* JADX INFO: renamed from: xe.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.filmography.FilmographyPageTvKt$FilmographyPageTv$1$1", m18778f = "FilmographyPageTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f60713j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f60713j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f60713j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f60713j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: xe.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC17012f) this.receiver).mo19481f();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: xe.d$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC17012f) this.receiver).mo19478c();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: xe.d$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function1<InterfaceC4008o, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC4008o interfaceC4008o) {
            ((InterfaceC17012f) this.receiver).mo19479d(interfaceC4008o);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m21568a(final InterfaceC17012f interfaceC17012f, InterfaceC15676n interfaceC15676n, int i10) {
        String str;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1101312085);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC17012f) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC17012f.mo19477b(), c15688rMo18372i, 0);
            final InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC17012f.getState(), c15688rMo18372i, 0);
            InterfaceC10423g<C5634s0<InterfaceC5928m>> entities = interfaceC17012f.getEntities();
            c15688rMo18372i.mo18388y(-42744368);
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            c15688rMo18372i.mo18388y(-1514954746);
            final C5849c c5849cM6693a = C5852f.m6693a(entities, emptyCoroutineContext, c15688rMo18372i, 0);
            c15688rMo18372i.mo18361M();
            c15688rMo18372i.mo18361M();
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b = (C0173B) objMo18389z;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z2);
            C5931p c5931p = ((InterfaceC17012f.a) interfaceC15701v0M18246a2.getValue()).f53352a;
            if (c5931p == null || (str = c5931p.f19640c) == null) {
                str = "";
            }
            C15536p0.m18135a(str, interfaceC17012f.mo19476a(), interfaceC17012f.mo19480e(), false, null, null, null, C18037u.m20404c(1757198184, new Function2() { // from class: xe.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(aVar, 1.0f);
                        C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, interfaceC15676n2);
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
                        C1963W0.m2623a(C7482g.m8519d(aVar, 8), interfaceC15676n2);
                        String strM19466e = C16973X.m19466e((C16972W) C19278b3.f60024x.getValue(), interfaceC15676n2, 0);
                        boolean z10 = ((InterfaceC17012f.a) interfaceC15701v0M18246a2.getValue()).f53354c;
                        InterfaceC17012f interfaceC17012f2 = interfaceC17012f;
                        boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC17012f2);
                        Object objMo18389z3 = interfaceC15676n2.mo18389z();
                        InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
                        if (zMo18350B || objMo18389z3 == c21235a2) {
                            C19676d.b bVar = new C19676d.b(0, interfaceC17012f2, InterfaceC17012f.class, "toggleIsHideInaccessible", "toggleIsHideInaccessible()V", 0);
                            interfaceC15676n2.mo18380q(bVar);
                            objMo18389z3 = bVar;
                        }
                        C15481R0.m18122a(strM19466e, z10, (Function0) ((KFunction) objMo18389z3), c0173b, interfaceC15676n2, 3072, 0);
                        C1963W0.m2623a(C7482g.m8519d(aVar, 24), interfaceC15676n2);
                        if (((EnumC5670a) interfaceC15701v0M18246a.getValue()) == EnumC5670a.f18684e) {
                            interfaceC15676n2.mo18363O(89552673);
                            boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC17012f2);
                            Object objMo18389z4 = interfaceC15676n2.mo18389z();
                            if (zMo18350B2 || objMo18389z4 == c21235a2) {
                                C19676d.c cVar = new C19676d.c(0, interfaceC17012f2, InterfaceC17012f.class, "updateData", "updateData()V", 0);
                                interfaceC15676n2.mo18380q(cVar);
                                objMo18389z4 = cVar;
                            }
                            C8158N.m10132a((Function0) ((KFunction) objMo18389z4), interfaceC15676n2, 0);
                            interfaceC15676n2.mo18357I();
                        } else {
                            C5849c c5849c = c5849cM6693a;
                            if (c5849c.m6692d().f18474a instanceof AbstractC5552D.b) {
                                interfaceC15676n2.mo18363O(89556370);
                                C17609n.m19974a(EnumC3994g.MOVIE, interfaceC15676n2, 6);
                                interfaceC15676n2.mo18357I();
                            } else if (c5849c.m6691c() == 0) {
                                interfaceC15676n2.mo18363O(89558828);
                                C15469L.m18114c(0, interfaceC15676n2);
                                interfaceC15676n2.mo18357I();
                            } else {
                                interfaceC15676n2.mo18363O(-1518585036);
                                C2678c0 c2678c0M3425a = C2686g0.m3425a(interfaceC15676n2);
                                boolean zMo18350B3 = interfaceC15676n2.mo18350B(interfaceC17012f2);
                                Object objMo18389z5 = interfaceC15676n2.mo18389z();
                                if (zMo18350B3 || objMo18389z5 == c21235a2) {
                                    C19676d.d dVar = new C19676d.d(1, interfaceC17012f2, InterfaceC17012f.class, "onContentClick", "onContentClick(Lru/zona/content/models/IEntityId;)V", 0);
                                    interfaceC15676n2.mo18380q(dVar);
                                    objMo18389z5 = dVar;
                                }
                                C15547v.m18136a(c5849c, null, c2678c0M3425a, (Function1) ((KFunction) objMo18389z5), null, interfaceC15676n2, 0, 18);
                                interfaceC15676n2 = interfaceC15676n2;
                                interfaceC15676n2.mo18357I();
                            }
                        }
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 100663296, 248);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C18342a(interfaceC17012f, i10, 1);
        }
    }
}
