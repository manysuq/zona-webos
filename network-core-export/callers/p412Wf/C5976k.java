package p412Wf;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p050Cd.InterfaceC0746g;
import p125Gg.EnumC1908p;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p126H.InterfaceC2015p;
import p192Kb.InterfaceC2930N;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p392Vd.C5672c;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p579h0.C11579U1;
import p579h0.C11658o0;
import p579h0.EnumC11532I1;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p640jf.C15472M0;
import p640jf.C15497Z0;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15658h;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20541F0;

/* JADX INFO: renamed from: Wf.k */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nChoiceStreamViewTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChoiceStreamViewTv.kt\nru/zona/app/ui/player/settings/ChoiceStreamViewTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1282#2,6:126\n1282#2,6:132\n1282#2,6:138\n1282#2,6:229\n1282#2,6:275\n1282#2,6:281\n113#3:144\n113#3:145\n113#3:179\n113#3:180\n113#3:235\n113#3:236\n99#4,6:146\n106#4:184\n80#5,6:152\n87#5,3:167\n90#5,2:176\n94#5:183\n80#5,6:198\n87#5,3:213\n90#5,2:222\n80#5,6:246\n87#5,3:261\n90#5,2:270\n94#5:290\n94#5:294\n391#6,9:158\n400#6:178\n401#6,2:181\n391#6,9:204\n400#6:224\n391#6,9:252\n400#6:272\n401#6,2:288\n401#6,2:292\n4360#7,6:170\n4360#7,6:216\n4360#7,6:264\n85#8:185\n85#8:186\n87#9:187\n83#9,10:188\n87#9:237\n85#9,8:238\n94#9:291\n94#9:295\n1739#10:225\n1814#10,3:226\n2077#10,2:273\n2079#10:287\n*S KotlinDebug\n*F\n+ 1 ChoiceStreamViewTv.kt\nru/zona/app/ui/player/settings/ChoiceStreamViewTvKt\n*L\n48#1:126,6\n49#1:132,6\n62#1:138,6\n69#1:229,6\n90#1:275,6\n91#1:281,6\n107#1:144\n108#1:145\n112#1:179\n114#1:180\n75#1:235\n84#1:236\n106#1:146,6\n106#1:184\n106#1:152,6\n106#1:167,3\n106#1:176,2\n106#1:183\n64#1:198,6\n64#1:213,3\n64#1:222,2\n80#1:246,6\n80#1:261,3\n80#1:270,2\n80#1:290\n64#1:294\n106#1:158,9\n106#1:178\n106#1:181,2\n64#1:204,9\n64#1:224\n80#1:252,9\n80#1:272\n80#1:288,2\n64#1:292,2\n106#1:170,6\n64#1:216,6\n80#1:264,6\n46#1:185\n47#1:186\n64#1:187\n64#1:188,10\n80#1:237\n80#1:238,8\n80#1:291\n64#1:295\n67#1:225\n67#1:226,3\n86#1:273,2\n86#1:287\n*E\n"})
public final class C5976k {

    /* JADX INFO: renamed from: Wf.k$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.player.settings.ChoiceStreamViewTvKt$ChoiceStreamViewTv$1$1", m18778f = "ChoiceStreamViewTv.kt", m18779i = {}, m18780l = {52, 51}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {51, 56}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public C11579U1 f19786j;

        /* JADX INFO: renamed from: k */
        public int f19787k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C11579U1 f19788l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC15701v0 f19789m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11579U1 c11579u1, InterfaceC15701v0 interfaceC15701v0, Continuation continuation) {
            super(2, continuation);
            this.f19788l = c11579u1;
            this.f19789m = interfaceC15701v0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f19788l, this.f19789m, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.m13486a(new p579h0.C11579U1.b((java.lang.String) r7, null, false, r3), r6) == r0) goto L17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C11579U1 c11579u1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f19787k;
            if (i10 != 0) {
                if (i10 == 1) {
                    c11579u1 = this.f19786j;
                    ResultKt.throwOnFailure(obj);
                    EnumC11532I1 enumC11532I1 = EnumC11532I1.f36053b;
                    this.f19786j = null;
                    this.f19787k = 2;
                    c11579u1.getClass();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (((InterfaceC0746g.a) this.f19789m.getValue()).f2734h) {
                C16972W c16972w = (C16972W) C19278b3.f60019u0.getValue();
                c11579u1 = this.f19788l;
                this.f19786j = c11579u1;
                this.f19787k = 1;
                obj = C16973X.m19462a(c16972w, this);
                if (obj != coroutine_suspended) {
                    EnumC11532I1 enumC11532I2 = EnumC11532I1.f36053b;
                    this.f19786j = null;
                    this.f19787k = 2;
                    c11579u1.getClass();
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Wf.k$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC0746g) this.receiver).close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Wf.k$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            ((InterfaceC0746g) this.receiver).mo1281d(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Wf.k$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function1<InterfaceC2930N, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2930N interfaceC2930N) {
            ((InterfaceC0746g) this.receiver).mo1278a(interfaceC2930N);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Wf.k$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements Function1<InterfaceC2930N, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC2930N interfaceC2930N) {
            ((InterfaceC0746g) this.receiver).mo1280c(interfaceC2930N);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m6830a(final InterfaceC0746g interfaceC0746g, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-393866489);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0746g) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0746g.getState(), c15688rMo18372i, 0);
            final InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC0746g.mo1282e(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = new C11579U1();
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final C11579U1 c11579u1 = (C11579U1) objMo18389z;
            Boolean boolValueOf = Boolean.valueOf(((InterfaceC0746g.a) interfaceC15701v0M18246a.getValue()).f2734h);
            boolean zMo18362N = c15688rMo18372i.mo18362N(interfaceC15701v0M18246a);
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18362N || objMo18389z2 == c21235a) {
                objMo18389z2 = new a(c11579u1, interfaceC15701v0M18246a, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(boolValueOf, c15688rMo18372i, (Function2) objMo18389z2);
            C5972g.m6829c(((InterfaceC0746g.a) interfaceC15701v0M18246a.getValue()).f2729c, c15688rMo18372i, 0);
            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60076Y.getValue(), c15688rMo18372i, 0);
            boolean z10 = (i11 & 14) == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == c21235a) {
                objMo18389z3 = new b(0, interfaceC0746g, InterfaceC0746g.class, "close", "close()V", 0);
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            C5951B.m6821a(strM19466e, null, (Function0) ((KFunction) objMo18389z3), null, C18037u.m20404c(1124591066, new Function3() { // from class: Wf.h
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC0746g interfaceC0746g2;
                    KFunction kFunction;
                    InterfaceC2015p interfaceC2015p = (InterfaceC2015p) obj;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= interfaceC15676n2.mo18362N(interfaceC2015p) ? 4 : 2;
                    }
                    int i12 = iIntValue;
                    int i13 = 0;
                    if (interfaceC15676n2.mo18379p(i12 & 1, (i12 & 19) != 18)) {
                        C1982e.k kVar = C1982e.f6639c;
                        C18863f.a aVar = InterfaceC18861d.a.f58759m;
                        C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i14 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar2, interfaceC15676n2);
                        InterfaceC5799g.f19145s1.getClass();
                        C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar3);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                        InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i14))) {
                            C1961V0.m2622a(i14, interfaceC15676n2, i14, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                        InterfaceC15701v0 interfaceC15701v0 = interfaceC15701v0M18246a;
                        List<InterfaceC0746g.b> list = ((InterfaceC0746g.a) interfaceC15701v0.getValue()).f2729c;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C5672c.m6329c(((InterfaceC0746g.b) it.next()).f2736a.f7262b).f18691b);
                        }
                        Integer num = ((InterfaceC0746g.a) interfaceC15701v0.getValue()).f2732f;
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        InterfaceC0746g interfaceC0746g3 = interfaceC0746g;
                        boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC0746g3);
                        Object objMo18389z4 = interfaceC15676n2.mo18389z();
                        InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
                        if (zMo18350B || objMo18389z4 == c21235a2) {
                            C5976k.c cVar = new C5976k.c(1, interfaceC0746g3, InterfaceC0746g.class, "selectQualityTub", "selectQualityTub(I)V", 0);
                            interfaceC15676n2.mo18380q(cVar);
                            objMo18389z4 = cVar;
                        }
                        C15497Z0.m18125a(arrayList, iIntValue2, (Function1) ((KFunction) objMo18389z4), interfaceC15676n2, 0);
                        if (((InterfaceC0746g.a) interfaceC15701v0.getValue()).f2731e == EnumC1908p.f6448c) {
                            interfaceC15676n2.mo18363O(-1222378246);
                            C5976k.m6831b(((InterfaceC0746g.a) interfaceC15701v0.getValue()).f2730d, interfaceC15676n2, 0);
                            interfaceC15676n2.mo18357I();
                        } else {
                            interfaceC15676n2.mo18363O(-1222304683);
                            C1963W0.m2623a(C7482g.m8519d(aVar2, 24), interfaceC15676n2);
                            interfaceC15676n2.mo18357I();
                        }
                        Integer num2 = ((InterfaceC0746g.a) interfaceC15701v0.getValue()).f2732f;
                        if (num2 == null) {
                            interfaceC15676n2.mo18363O(-1222168594);
                            interfaceC15676n2.mo18357I();
                        } else {
                            interfaceC15676n2.mo18363O(-1222168593);
                            InterfaceC0746g.b bVar = (InterfaceC0746g.b) CollectionsKt.getOrNull(((InterfaceC0746g.a) interfaceC15701v0.getValue()).f2729c, num2.intValue());
                            if (bVar == null) {
                                interfaceC15676n2.mo18363O(-340458043);
                                interfaceC15676n2.mo18357I();
                            } else {
                                interfaceC15676n2.mo18363O(-340458042);
                                InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(C7586d.m8700a(aVar2, "test_tag_scrollable_container"), C20541F0.m25137a(interfaceC15676n2), 14);
                                C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.m2645g(8), aVar, interfaceC15676n2, 6);
                                long jMo18375l2 = interfaceC15676n2.mo18375l();
                                int i15 = (int) (jMo18375l2 ^ (jMo18375l2 >>> 32));
                                InterfaceC15608O0 interfaceC15608O0Mo18377n2 = interfaceC15676n2.mo18377n();
                                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM25139c, interfaceC15676n2);
                                InterfaceC5799g.f19145s1.getClass();
                                C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
                                if (interfaceC15676n2.mo18374k() == null) {
                                    C15658h.m18343a();
                                    throw null;
                                }
                                interfaceC15676n2.mo18353E();
                                if (interfaceC15676n2.mo18370g()) {
                                    interfaceC15676n2.mo18355G(aVar4);
                                } else {
                                    interfaceC15676n2.mo18378o();
                                }
                                C15623T1.m18280a(c2036xM2689a2, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                                C15623T1.m18280a(interfaceC15608O0Mo18377n2, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                                InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                                if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i15))) {
                                    C1961V0.m2622a(i15, interfaceC15676n2, i15, c21098a2);
                                }
                                C15623T1.m18280a(interfaceC7507eM8566c2, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                                interfaceC15676n2.mo18363O(370470942);
                                for (Object obj4 : bVar.f2737b) {
                                    int i16 = i13 + 1;
                                    if (i13 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    InterfaceC2930N interfaceC2930N = (InterfaceC2930N) obj4;
                                    boolean zAreEqual = Intrinsics.areEqual(interfaceC2930N, ((InterfaceC0746g.a) interfaceC15701v0.getValue()).f2728b);
                                    boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC0746g3);
                                    Object objMo18389z5 = interfaceC15676n2.mo18389z();
                                    if (zMo18350B2 || objMo18389z5 == c21235a2) {
                                        C5976k.d dVar = new C5976k.d(1, interfaceC0746g3, InterfaceC0746g.class, "chooseStream", "chooseStream(Lru/zona/api/stream/StreamInfoProvider;)V", 0);
                                        interfaceC15676n2.mo18380q(dVar);
                                        objMo18389z5 = dVar;
                                    }
                                    Function1 function1 = (Function1) ((KFunction) objMo18389z5);
                                    if (((Boolean) interfaceC15701v0M18246a2.getValue()).booleanValue()) {
                                        interfaceC15676n2.mo18363O(-217878858);
                                        boolean zMo18350B3 = interfaceC15676n2.mo18350B(interfaceC0746g3);
                                        Object objMo18389z6 = interfaceC15676n2.mo18389z();
                                        if (zMo18350B3 || objMo18389z6 == c21235a2) {
                                            interfaceC0746g2 = interfaceC0746g3;
                                            C5976k.e eVar = new C5976k.e(1, interfaceC0746g2, InterfaceC0746g.class, "onDownloadClick", "onDownloadClick(Lru/zona/api/stream/StreamInfoProvider;)V", 0);
                                            interfaceC15676n2.mo18380q(eVar);
                                            objMo18389z6 = eVar;
                                        } else {
                                            interfaceC0746g2 = interfaceC0746g3;
                                        }
                                        kFunction = (KFunction) objMo18389z6;
                                        interfaceC15676n2.mo18357I();
                                    } else {
                                        interfaceC0746g2 = interfaceC0746g3;
                                        interfaceC15676n2.mo18363O(-217847797);
                                        interfaceC15676n2.mo18357I();
                                        kFunction = null;
                                    }
                                    C5965P.m6826b(null, interfaceC2930N, zAreEqual, function1, (Function1) kFunction, interfaceC15676n2, 0);
                                    i13 = i16;
                                    interfaceC0746g3 = interfaceC0746g2;
                                }
                                interfaceC15676n2.mo18357I();
                                interfaceC15676n2.mo18381r();
                                Unit unit = Unit.INSTANCE;
                                interfaceC15676n2.mo18357I();
                            }
                            Unit unit2 = Unit.INSTANCE;
                            interfaceC15676n2.mo18357I();
                        }
                        interfaceC15676n2.mo18381r();
                        C15472M0.m18119a(interfaceC2015p, c11579u1, interfaceC15676n2, (i12 & 14) | 48);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 196608, 22);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Wf.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5976k.m6830a(this.f19784b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6831b(final int i10, InterfaceC15676n interfaceC15676n, final int i11) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1413611044);
        int i12 = (c15688rMo18372i.mo18368e(i10) ? 4 : 2) | i11;
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7481f.m8511d(C7482g.m8518c(aVar, 1.0f), 7), "test_tag_loading");
            C1982e.j jVar = C1982e.f6637a;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2646h(8, InterfaceC18861d.a.f58760n), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
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
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar, 24);
            long j11 = C3376c.f10947h;
            C11658o0.m13516a(interfaceC7507eM8525j, j11, 2, 0L, 0, 0.0f, c15688rMo18372i, 390, 56);
            C11565Q2.m13480b(C16973X.m19467f((C16972W) C19101C4.f59698h.getValue(), new Object[]{Integer.valueOf(i10)}, c15688rMo18372i), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3375b.f10934q, j11, 0L, new C16318q(900), null, 0L, null, 0L, null, null, 16777210), c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, i11) { // from class: Wf.j

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f19785b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5976k.m6831b(this.f19785b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
