package gg;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.platform.C7586d;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import p001A0.C0009h;
import p017Ag.C0154l;
import p017Ag.C0165w;
import p019B0.C0173B;
import p019B0.InterfaceC0179H;
import p069De.EnumC1163i;
import p069De.InterfaceC1155a;
import p122Gd.InterfaceC1827f;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p214Lf.C3377d;
import p270P.C4024e;
import p288Q.C4286K0;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6047N0;
import p450Z.C6625h;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p607i9.C12269M6;
import p640jf.C15456E0;
import p640jf.C15509d1;
import p640jf.C15536p0;
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
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p817v1.InterfaceC18562d;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20541F0;

/* JADX INFO: renamed from: gg.o */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEmailScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailScreenTv.kt\nru/zona/app/ui/tv/profile/login/EmailScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 13 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,164:1\n1282#2,6:165\n1282#2,6:171\n1282#2,6:177\n1282#2,6:183\n1282#2,6:189\n1282#2,6:195\n1282#2,6:201\n1282#2,6:329\n1282#2,6:374\n1282#2,6:393\n113#3:207\n113#3:254\n113#3:335\n113#3:336\n113#3:389\n113#3:392\n70#4:208\n68#4,8:209\n77#4:247\n80#5,6:217\n87#5,3:232\n90#5,2:241\n94#5:246\n80#5,6:264\n87#5,3:279\n90#5,2:288\n80#5,6:302\n87#5,3:317\n90#5,2:326\n80#5,6:346\n87#5,3:361\n90#5,2:370\n94#5:383\n94#5:387\n94#5:401\n391#6,9:223\n400#6,3:243\n391#6,9:270\n400#6:290\n391#6,9:308\n400#6:328\n391#6,9:352\n400#6:372\n401#6,2:381\n401#6,2:385\n401#6,2:399\n4360#7,6:235\n4360#7,6:282\n4360#7,6:320\n4360#7,6:364\n85#8:248\n85#8:249\n85#8:250\n85#8:251\n117#8,2:252\n87#9:255\n85#9,8:256\n87#9:291\n83#9,10:292\n94#9:388\n94#9:402\n99#10:337\n97#10,8:338\n106#10:384\n2068#11:373\n2069#11:380\n75#12:390\n66#13:391\n*S KotlinDebug\n*F\n+ 1 EmailScreenTv.kt\nru/zona/app/ui/tv/profile/login/EmailScreenTvKt\n*L\n65#1:165,6\n66#1:171,6\n68#1:177,6\n72#1:183,6\n144#1:189,6\n153#1:195,6\n154#1:201,6\n96#1:329,6\n118#1:374,6\n132#1:393,6\n155#1:207\n86#1:254\n110#1:335\n113#1:336\n127#1:389\n129#1:392\n148#1:208\n148#1:209,8\n148#1:247\n148#1:217,6\n148#1:232,3\n148#1:241,2\n148#1:246\n82#1:264,6\n82#1:279,3\n82#1:288,2\n93#1:302,6\n93#1:317,3\n93#1:326,2\n111#1:346,6\n111#1:361,3\n111#1:370,2\n111#1:383\n93#1:387\n82#1:401\n148#1:223,9\n148#1:243,3\n82#1:270,9\n82#1:290\n93#1:308,9\n93#1:328\n111#1:352,9\n111#1:372\n111#1:381,2\n93#1:385,2\n82#1:399,2\n148#1:235,6\n82#1:282,6\n93#1:320,6\n111#1:364,6\n61#1:248\n62#1:249\n63#1:250\n144#1:251\n144#1:252,2\n82#1:255\n82#1:256,8\n93#1:291\n93#1:292,10\n93#1:388\n82#1:402\n111#1:337\n111#1:338,8\n111#1:384\n115#1:373\n115#1:380\n127#1:390\n127#1:391\n*E\n"})
public final class C11426o {

    /* JADX INFO: renamed from: gg.o$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.login.EmailScreenTvKt$EmailScreenTv$1$1", m18778f = "EmailScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f35532j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35532j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f35532j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f35532j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: gg.o$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.login.EmailScreenTvKt$EmailScreenTv$2$1", m18778f = "EmailScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class b extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f35533j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ InterfaceC15701v0 f35534k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0173B c0173b, InterfaceC15701v0 interfaceC15701v0, Continuation continuation) {
            super(2, continuation);
            this.f35533j = c0173b;
            this.f35534k = interfaceC15701v0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f35533j, this.f35534k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (!((InterfaceC1827f.a) this.f35534k.getValue()).f6179a) {
                C0173B.m230b(this.f35533j);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: gg.o$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1827f) this.receiver).mo2536h();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m13428a(final InterfaceC1827f interfaceC1827f, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(882194296);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1827f) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1827f.getState(), c15688rMo18372i, 0);
            final InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC1827f.mo2534f(), c15688rMo18372i, 0);
            final InterfaceC15701v0 interfaceC15701v0M18246a3 = C15585G1.m18246a(interfaceC1827f.mo2530b().f562b, c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b = (C0173B) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b2 = (C0173B) objMo18389z2;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z3);
            Boolean boolValueOf = Boolean.valueOf(((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6179a);
            boolean zMo18362N = c15688rMo18372i.mo18362N(interfaceC15701v0M18246a);
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (zMo18362N || objMo18389z4 == c21235a) {
                objMo18389z4 = new b(c0173b, interfaceC15701v0M18246a, null);
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            C15631X.m18287e(boolValueOf, c15688rMo18372i, (Function2) objMo18389z4);
            c15688r = c15688rMo18372i;
            C15536p0.m18135a(C16973X.m19466e((C16972W) C19278b3.f59981b0.getValue(), c15688rMo18372i, 0), interfaceC1827f.mo2529a(), null, false, null, null, null, C18037u.m20404c(140299211, new Function2() { // from class: gg.h
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C5753J.a aVar;
                    InterfaceC5799g.a.C21098a c21098a;
                    InterfaceC15676n.a.C21235a c21235a2;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(C7482g.m8517b(aVar2, 1.0f), C20541F0.m25137a(interfaceC15676n2), 14);
                        float f10 = 24;
                        C1982e.i iVarM2645g = C1982e.m2645g(f10);
                        C18863f.a aVar3 = InterfaceC18861d.a.f58759m;
                        C2036x c2036xM2689a = C2032v.m2689a(iVarM2645g, aVar3, interfaceC15676n2, 6);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM25139c, interfaceC15676n2);
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
                        InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, dVar);
                        InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, fVar);
                        InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i12))) {
                            C1961V0.m2622a(i12, interfaceC15676n2, i12, c21098a2);
                        }
                        InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, eVar);
                        C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59979a0.getValue(), interfaceC15676n2, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, interfaceC15676n2, 0, 0, 131070);
                        C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.f6639c, aVar3, interfaceC15676n2, 0);
                        long jMo18375l2 = interfaceC15676n2.mo18375l();
                        int i13 = (int) (jMo18375l2 ^ (jMo18375l2 >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n2 = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar2, interfaceC15676n2);
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            aVar = aVar4;
                            interfaceC15676n2.mo18355G(aVar);
                        } else {
                            aVar = aVar4;
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c2036xM2689a2, interfaceC15676n2, dVar);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n2, interfaceC15676n2, fVar);
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i13))) {
                            c21098a = c21098a2;
                            C1961V0.m2622a(i13, interfaceC15676n2, i13, c21098a);
                        } else {
                            c21098a = c21098a2;
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c2, interfaceC15676n2, eVar);
                        InterfaceC1827f interfaceC1827f2 = interfaceC1827f;
                        C6625h c6625hMo2531c = interfaceC1827f2.mo2531c();
                        boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC1827f2);
                        Object objMo18389z5 = interfaceC15676n2.mo18389z();
                        InterfaceC15676n.a.C21235a c21235a3 = InterfaceC15676n.a.f50781a;
                        if (zMo18350B || objMo18389z5 == c21235a3) {
                            c21235a2 = c21235a3;
                            C11426o.c cVar = new C11426o.c(0, interfaceC1827f2, InterfaceC1827f.class, "warningCancel", "warningCancel()V", 0);
                            interfaceC15676n2.mo18380q(cVar);
                            objMo18389z5 = cVar;
                        } else {
                            c21235a2 = c21235a3;
                        }
                        String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60045H0.getValue(), interfaceC15676n2, 0);
                        InterfaceC1155a.b bVar = new InterfaceC1155a.b((EnumC1163i) null, InterfaceC1155a.a.LOWERCASE, 1);
                        InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7512c.m8578a(aVar2, c0173b), "test_tag_email_field");
                        InterfaceC15701v0 interfaceC15701v0 = interfaceC15701v0M18246a;
                        C5753J.a aVar5 = aVar;
                        InterfaceC5799g.a.C21098a c21098a3 = c21098a;
                        InterfaceC1827f interfaceC1827f3 = interfaceC1827f2;
                        C15509d1.m18128a(c6625hMo2531c, (Function0) ((KFunction) objMo18389z5), strM19466e, null, null, false, bVar, 6, null, interfaceC7507eM8700a, ((InterfaceC1827f.a) interfaceC15701v0.getValue()).f6179a, false, C16973X.m19466e((C16972W) C19278b3.f59936D.getValue(), interfaceC15676n2, 0), ((InterfaceC1827f.a) interfaceC15701v0.getValue()).f6180b, interfaceC15676n2, 12582912, 0, 2360);
                        float f11 = 8;
                        C1963W0.m2623a(C7482g.m8519d(aVar2, f11), interfaceC15676n2);
                        InterfaceC7507e interfaceC7507eM25138b = C20541F0.m25138b(aVar2, C20541F0.m25137a(interfaceC15676n2), true, false);
                        C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(f11), InterfaceC18861d.a.f58756j, interfaceC15676n2, 6);
                        long jMo18375l3 = interfaceC15676n2.mo18375l();
                        int i14 = (int) (jMo18375l3 ^ (jMo18375l3 >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n3 = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM25138b, interfaceC15676n2);
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar5);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c1952q0M2608a, interfaceC15676n2, dVar);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n3, interfaceC15676n2, fVar);
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i14))) {
                            C1961V0.m2622a(i14, interfaceC15676n2, i14, c21098a3);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c3, interfaceC15676n2, eVar);
                        interfaceC15676n2.mo18363O(-201403238);
                        for (final String str : (List) interfaceC15701v0M18246a2.getValue()) {
                            final InterfaceC1827f interfaceC1827f4 = interfaceC1827f3;
                            boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC1827f4) | interfaceC15676n2.mo18362N(str);
                            Object objMo18389z6 = interfaceC15676n2.mo18389z();
                            InterfaceC15676n.a.C21235a c21235a4 = c21235a2;
                            if (zMo18350B2 || objMo18389z6 == c21235a4) {
                                objMo18389z6 = new Function0() { // from class: gg.j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC1827f4.mo2535g(str);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z6);
                            }
                            C11426o.m13429b(0, str, interfaceC15676n2, (Function0) objMo18389z6);
                            interfaceC1827f3 = interfaceC1827f4;
                            c21235a2 = c21235a4;
                        }
                        InterfaceC15676n.a.C21235a c21235a5 = c21235a2;
                        final InterfaceC1827f interfaceC1827f5 = interfaceC1827f3;
                        interfaceC15676n2.mo18357I();
                        interfaceC15676n2.mo18381r();
                        interfaceC15676n2.mo18381r();
                        InterfaceC7507e interfaceC7507eM8700a2 = C7586d.m8700a(C7482g.m8529n(C7512c.m8578a(aVar2, c0173b2), ((InterfaceC18562d) interfaceC15676n2.mo18383t(C6047N0.f19924h)).mo19p1() * 400), "test_tag_continue_button");
                        InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar2, 0.0f, 0.0f, 0.0f, f10, 7);
                        String strM19466e2 = C16973X.m19466e((C16972W) C19101C4.f59713o0.getValue(), interfaceC15676n2, 0);
                        boolean zMo18350B3 = interfaceC15676n2.mo18350B(interfaceC1827f5);
                        Object objMo18389z7 = interfaceC15676n2.mo18389z();
                        if (zMo18350B3 || objMo18389z7 == c21235a5) {
                            objMo18389z7 = new Function0() { // from class: gg.k
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    interfaceC1827f5.mo2533e();
                                    return Unit.INSTANCE;
                                }
                            };
                            interfaceC15676n2.mo18380q(objMo18389z7);
                        }
                        Function0 function0 = (Function0) objMo18389z7;
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a3;
                        C15456E0.m18110a(interfaceC7507eM8700a2, interfaceC7507eM8515h, strM19466e2, null, null, false, function0, false, C0165w.m221c((C0154l) interfaceC15612P1.getValue()) && !StringsKt.isBlank(interfaceC1827f5.mo2531c().m7428c().f21694d), false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, C0165w.m220b((C0154l) interfaceC15612P1.getValue()), null, interfaceC15676n2, 24624, 0, 392872);
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688r, 100663296, 252);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: gg.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11426o.m13428a(this.f35524b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m13429b(final int i10, final String str, InterfaceC15676n interfaceC15676n, final Function0 function0) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-851802298);
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            long j10 = ((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10944e;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f);
            C4024e c4024e = C3377d.f10968c;
            InterfaceC7507e interfaceC7507eM8487b = C7468a.m8487b(C0009h.m22a(interfaceC7507eM8518c, c4024e), j10, c4024e);
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new Function1() { // from class: gg.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC15701v0.setValue(Boolean.valueOf(((InterfaceC0179H) obj).mo236b()));
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8487b, (Function1) objMo18389z2);
            boolean z10 = (i11 & 112) == 32;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == c21235a) {
                objMo18389z3 = new Function0() { // from class: gg.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7470c.m8490c(15, interfaceC7507eM8576a, null, (Function0) objMo18389z3, false), 16, 14);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58750d, false);
            long j11 = c15688rMo18372i.f50813T;
            int i12 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
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
            C11565Q2.m13480b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10928k, c15688rMo18372i, i11 & 14, 0, 131070);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, str, function0) { // from class: gg.n

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f35530b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f35531c;

                {
                    this.f35530b = str;
                    this.f35531c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C11426o.m13429b(C15636Z0.m18294a(1), this.f35530b, (InterfaceC15676n) obj, this.f35531c);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
