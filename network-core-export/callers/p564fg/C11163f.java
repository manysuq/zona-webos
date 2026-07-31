package p564fg;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
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
import kotlin.p659io.ConstantsKt;
import kotlin.reflect.KFunction;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p017Ag.C0154l;
import p017Ag.C0165w;
import p019B0.C0173B;
import p069De.EnumC1163i;
import p069De.InterfaceC1155a;
import p104Fd.InterfaceC1610e;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1961V0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3375b;
import p252O.C3794d;
import p288Q.C4286K0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
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
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: fg.f */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nChangePasswordTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangePasswordTv.kt\nru/zona/app/ui/tv/profile/config/ChangePasswordTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,229:1\n1282#2,6:230\n1282#2,6:236\n1282#2,6:242\n1282#2,6:248\n1282#2,6:344\n1282#2,6:481\n1282#2,6:487\n1282#2,6:493\n1282#2,6:499\n87#3:254\n83#3,10:255\n94#3:343\n87#3:350\n83#3,10:351\n94#3:439\n87#3:442\n83#3,10:443\n94#3:508\n80#4,6:265\n87#4,3:280\n90#4,2:289\n80#4,6:306\n87#4,3:321\n90#4,2:330\n94#4:338\n94#4:342\n80#4,6:361\n87#4,3:376\n90#4,2:385\n80#4,6:400\n87#4,3:415\n90#4,2:424\n94#4:432\n94#4:438\n80#4,6:453\n87#4,3:468\n90#4,2:477\n94#4:507\n391#5,9:271\n400#5:291\n391#5,9:312\n400#5:332\n401#5,2:336\n401#5,2:340\n391#5,9:367\n400#5:387\n391#5,9:406\n400#5:426\n401#5,2:430\n401#5,2:436\n391#5,9:459\n400#5:479\n401#5,2:505\n4360#6,6:283\n4360#6,6:324\n4360#6,6:379\n4360#6,6:418\n4360#6,6:471\n113#7:292\n113#7:293\n113#7:294\n113#7:333\n113#7:334\n113#7:335\n113#7:388\n113#7:427\n113#7:428\n113#7:429\n113#7:434\n113#7:435\n113#7:480\n99#8:295\n95#8,10:296\n106#8:339\n99#8:389\n95#8,10:390\n106#8:433\n85#9:440\n85#9:441\n*S KotlinDebug\n*F\n+ 1 ChangePasswordTv.kt\nru/zona/app/ui/tv/profile/config/ChangePasswordTvKt\n*L\n49#1:230,6\n50#1:236,6\n51#1:242,6\n53#1:248,6\n174#1:344,6\n66#1:481,6\n73#1:487,6\n79#1:493,6\n84#1:499,6\n116#1:254\n116#1:255,10\n116#1:343\n178#1:350\n178#1:351,10\n178#1:439\n61#1:442\n61#1:443,10\n61#1:508\n116#1:265,6\n116#1:280,3\n116#1:289,2\n139#1:306,6\n139#1:321,3\n139#1:330,2\n139#1:338\n116#1:342\n178#1:361,6\n178#1:376,3\n178#1:385,2\n186#1:400,6\n186#1:415,3\n186#1:424,2\n186#1:432\n178#1:438\n61#1:453,6\n61#1:468,3\n61#1:477,2\n61#1:507\n116#1:271,9\n116#1:291\n139#1:312,9\n139#1:332\n139#1:336,2\n116#1:340,2\n178#1:367,9\n178#1:387\n186#1:406,9\n186#1:426\n186#1:430,2\n178#1:436,2\n61#1:459,9\n61#1:479\n61#1:505,2\n116#1:283,6\n139#1:324,6\n178#1:379,6\n186#1:418,6\n61#1:471,6\n122#1:292\n130#1:293\n137#1:294\n141#1:333\n147#1:334\n149#1:335\n184#1:388\n193#1:427\n200#1:428\n208#1:429\n216#1:434\n220#1:435\n62#1:480\n139#1:295\n139#1:296,10\n139#1:339\n186#1:389\n186#1:390,10\n186#1:433\n46#1:440\n47#1:441\n*E\n"})
public final class C11163f {

    /* JADX INFO: renamed from: fg.f$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.config.ChangePasswordTvKt$ChangePasswordTv$1$1", m18778f = "ChangePasswordTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f34754j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34754j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f34754j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f34754j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fg.f$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1610e) this.receiver).mo2235m();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fg.f$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1610e) this.receiver).mo2236o();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m13164a(final InterfaceC1610e interfaceC1610e, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1461904750);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1610e) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1610e.getState(), c15688rMo18372i, 0);
            final InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC1610e.mo2224b().f562b, c15688rMo18372i, 0);
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
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b3 = (C0173B) objMo18389z3;
            Unit unit = Unit.INSTANCE;
            Boolean boolValueOf = Boolean.valueOf(((InterfaceC1610e.a) interfaceC15701v0M18246a.getValue()).f5277b.length() > 0);
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            C15631X.m18286d(unit, boolValueOf, (Function2) objMo18389z4, c15688rMo18372i);
            c15688r = c15688rMo18372i;
            C15536p0.m18135a(C16973X.m19466e((C16972W) C19285c2.f60068T.getValue(), c15688rMo18372i, 0), interfaceC1610e.mo2230h(), null, false, null, null, null, C18037u.m20404c(408253377, new Function2() { // from class: fg.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z10;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i12 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, interfaceC15676n2);
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
                        InterfaceC15701v0 interfaceC15701v0 = interfaceC15701v0M18246a;
                        boolean z11 = ((InterfaceC1610e.a) interfaceC15701v0.getValue()).f5276a;
                        final InterfaceC1610e interfaceC1610e2 = interfaceC1610e;
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a2;
                        InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
                        if (z11) {
                            interfaceC15676n2.mo18363O(-1639669354);
                            C6625h c6625hMo2227e = interfaceC1610e2.mo2227e();
                            C6625h c6625hMo2225c = interfaceC1610e2.mo2225c();
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC1610e2);
                            Object objMo18389z5 = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z5 == c21235a2) {
                                C11163f.c cVar = new C11163f.c(0, interfaceC1610e2, InterfaceC1610e.class, "cancelNewPassError", "cancelNewPassError()V", 0);
                                interfaceC15676n2.mo18380q(cVar);
                                objMo18389z5 = cVar;
                            }
                            Function0 function0 = (Function0) ((KFunction) objMo18389z5);
                            z10 = ((InterfaceC1610e.a) interfaceC15701v0.getValue()).f5278c.length() == 0;
                            boolean z12 = ((InterfaceC1610e.a) interfaceC15701v0.getValue()).f5279d.length() == 0;
                            boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC1610e2);
                            Object objMo18389z6 = interfaceC15676n2.mo18389z();
                            if (zMo18350B2 || objMo18389z6 == c21235a2) {
                                objMo18389z6 = new C3794d(interfaceC1610e2, 1);
                                interfaceC15676n2.mo18380q(objMo18389z6);
                            }
                            C11163f.m13166c(c6625hMo2227e, c6625hMo2225c, function0, z10, z12, c0173b2, c0173b3, (Function0) objMo18389z6, C0165w.m221c((C0154l) interfaceC15612P1.getValue()), C0165w.m220b((C0154l) interfaceC15612P1.getValue()), C11163f.m13167d(((InterfaceC1610e.a) interfaceC15701v0.getValue()).f5278c, interfaceC15676n2), C11163f.m13167d(((InterfaceC1610e.a) interfaceC15701v0.getValue()).f5279d, interfaceC15676n2), interfaceC15676n2, 1769472);
                            interfaceC15676n2.mo18357I();
                        } else {
                            interfaceC15676n2.mo18363O(709189995);
                            C6625h c6625hMo2228f = interfaceC1610e2.mo2228f();
                            boolean zMo18350B3 = interfaceC15676n2.mo18350B(interfaceC1610e2);
                            Object objMo18389z7 = interfaceC15676n2.mo18389z();
                            if (zMo18350B3 || objMo18389z7 == c21235a2) {
                                C11163f.b bVar = new C11163f.b(0, interfaceC1610e2, InterfaceC1610e.class, "cancelOldPassError", "cancelOldPassError()V", 0);
                                interfaceC15676n2.mo18380q(bVar);
                                objMo18389z7 = bVar;
                            }
                            KFunction kFunction = (KFunction) objMo18389z7;
                            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60105n0.getValue(), interfaceC15676n2, 0);
                            z10 = ((InterfaceC1610e.a) interfaceC15701v0.getValue()).f5277b.length() == 0;
                            String strM13167d = C11163f.m13167d(((InterfaceC1610e.a) interfaceC15701v0.getValue()).f5277b, interfaceC15676n2);
                            boolean zM221c = C0165w.m221c((C0154l) interfaceC15612P1.getValue());
                            boolean zM220b = C0165w.m220b((C0154l) interfaceC15612P1.getValue());
                            Function0<Unit> function0Mo2229g = interfaceC1610e2.mo2229g();
                            Function0 function1 = (Function0) kFunction;
                            boolean zMo18350B4 = interfaceC15676n2.mo18350B(interfaceC1610e2);
                            Object objMo18389z8 = interfaceC15676n2.mo18389z();
                            if (zMo18350B4 || objMo18389z8 == c21235a2) {
                                objMo18389z8 = new Function0() { // from class: fg.c
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC1610e2.mo2233k();
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z8);
                            }
                            C11163f.m13165b(c6625hMo2228f, function1, strM19466e, z10, (Function0) objMo18389z8, function0Mo2229g, c0173b, strM13167d, zM221c, zM220b, interfaceC15676n2, 1572864);
                            interfaceC15676n2.mo18357I();
                        }
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
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: fg.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11163f.m13164a(this.f34730b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX INFO: renamed from: b */
    public static final void m13165b(final C6625h c6625h, final Function0<Unit> function0, final String str, final boolean z10, final Function0<Unit> function1, final Function0<Unit> function2, final C0173B c0173b, final String str2, final boolean z11, final boolean z12, InterfaceC15676n interfaceC15676n, final int i10) {
        C5753J.a aVar;
        C5753J.a aVar2;
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-192337409);
        int i12 = i10 | (c15688rMo18372i.mo18362N(c6625h) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16) | (c15688rMo18372i.mo18362N(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18364a(z10) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT) | (c15688rMo18372i.mo18362N(str2) ? 8388608 : 4194304) | (c15688rMo18372i.mo18364a(z11) ? 67108864 : 33554432) | (c15688rMo18372i.mo18364a(z12) ? 536870912 : 268435456);
        if (c15688rMo18372i.mo18379p(i12 & 1, (306783379 & i12) != 306783378)) {
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar3, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                aVar = aVar4;
            } else {
                aVar = aVar4;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                aVar2 = aVar;
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60057N0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, c15688rMo18372i, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8519d(aVar3, 24), c15688rMo18372i);
                C15509d1.m18128a(c6625h, function0, str, null, null, false, new InterfaceC1155a.b((EnumC1163i) null, InterfaceC1155a.a.LOWERCASE, 5), 0, C7482g.m8529n(aVar3, 400), C7512c.m8578a(aVar3, c0173b), z10, true, str2, null, c15688rMo18372i, (i12 & 14) | 100663296 | (i12 & 112) | (i12 & 896), ((i12 >> 9) & 14) | 48 | ((i12 >> 15) & 896), 8376);
                C1963W0.m2623a(C7482g.m8519d(aVar3, 8), c15688rMo18372i);
                C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
                long j11 = c15688rMo18372i.f50813T;
                i11 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar3, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                    C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                float f10 = 252;
                int i14 = i12 & 234881024;
                int i15 = (i12 >> 6) & 29360128;
                C15456E0.m18110a(C7482g.m8529n(aVar3, f10), null, C16973X.m19466e((C16972W) C19278b3.f59947I0.getValue(), c15688rMo18372i, 0), null, null, false, function1, false, z11, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, z12, null, c15688rMo18372i, ((i12 << 6) & 3670016) | 6 | i14, i15, 392890);
                C1963W0.m2623a(C7482g.m8529n(aVar3, 12), c15688rMo18372i);
                C15456E0.m18110a(C7482g.m8529n(aVar3, f10), null, C16973X.m19466e((C16972W) C19140H5.f59799C.getValue(), c15688rMo18372i, 0), null, null, false, function2, false, z11, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, z12, null, c15688rMo18372i, ((i12 << 3) & 3670016) | 6 | i14, i15, 392890);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
                c15688rMo18372i.m18410W(true);
            }
            C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            aVar2 = aVar;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60057N0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar3, 24), c15688rMo18372i);
            C15509d1.m18128a(c6625h, function0, str, null, null, false, new InterfaceC1155a.b((EnumC1163i) null, InterfaceC1155a.a.LOWERCASE, 5), 0, C7482g.m8529n(aVar3, 400), C7512c.m8578a(aVar3, c0173b), z10, true, str2, null, c15688rMo18372i, (i12 & 14) | 100663296 | (i12 & 112) | (i12 & 896), ((i12 >> 9) & 14) | 48 | ((i12 >> 15) & 896), 8376);
            C1963W0.m2623a(C7482g.m8519d(aVar3, 8), c15688rMo18372i);
            C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j12 = c15688rMo18372i.f50813T;
            i11 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar3, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            } else {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar2);
            float f11 = 252;
            int i16 = i12 & 234881024;
            int i17 = (i12 >> 6) & 29360128;
            C15456E0.m18110a(C7482g.m8529n(aVar3, f11), null, C16973X.m19466e((C16972W) C19278b3.f59947I0.getValue(), c15688rMo18372i, 0), null, null, false, function1, false, z11, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, z12, null, c15688rMo18372i, ((i12 << 6) & 3670016) | 6 | i16, i17, 392890);
            C1963W0.m2623a(C7482g.m8529n(aVar3, 12), c15688rMo18372i);
            C15456E0.m18110a(C7482g.m8529n(aVar3, f11), null, C16973X.m19466e((C16972W) C19140H5.f59799C.getValue(), c15688rMo18372i, 0), null, null, false, function2, false, z11, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, z12, null, c15688rMo18372i, ((i12 << 3) & 3670016) | 6 | i16, i17, 392890);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function0, str, z10, function1, function2, c0173b, str2, z11, z12, i10) { // from class: fg.d

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f34733c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f34734d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f34735e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f34736f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function0 f34737g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0173B f34738h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ String f34739i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ boolean f34740j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ boolean f34741k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1572865);
                    C11163f.m13165b(this.f34732b, this.f34733c, this.f34734d, this.f34735e, this.f34736f, this.f34737g, this.f34738h, this.f34739i, this.f34740j, this.f34741k, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX INFO: renamed from: c */
    public static final void m13166c(final C6625h c6625h, final C6625h c6625h2, final Function0 function0, final boolean z10, final boolean z11, final C0173B c0173b, final C0173B c0173b2, final Function0 function1, final boolean z12, final boolean z13, final String str, final String str2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        int i11;
        int i12;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(836935288);
        int i13 = i10 | (c15688rMo18372i.mo18362N(c6625h) ? 4 : 2) | (c15688rMo18372i.mo18362N(c6625h2) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18364a(z10) ? 2048 : 1024) | (c15688rMo18372i.mo18364a(z11) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function1) ? 8388608 : 4194304) | (c15688rMo18372i.mo18364a(z12) ? 67108864 : 33554432) | (c15688rMo18372i.mo18364a(z13) ? 536870912 : 268435456);
        int i14 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18362N(str2) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i13 & 1, ((306783379 & i13) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            Unit unit = Unit.INSTANCE;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new C11164g(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i15 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S) {
                i11 = i14;
            } else {
                i11 = i14;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60101l0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, c15688rMo18372i, 0, 0, 131070);
                C1963W0.m2623a(C7482g.m8519d(aVar, 24), c15688rMo18372i);
                C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
                long j11 = c15688rMo18372i.f50813T;
                i12 = (int) (j11 ^ (j11 >>> 32));
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
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                    C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60061P0.getValue(), c15688rMo18372i, 0);
                InterfaceC1155a.a aVar3 = InterfaceC1155a.a.LOWERCASE;
                float f10 = 336;
                int i16 = i13 >> 3;
                int i17 = i16 & 112;
                C15509d1.m18128a(c6625h, function0, strM19466e, null, null, false, new InterfaceC1155a.b((EnumC1163i) null, aVar3, 5), 0, C7482g.m8529n(aVar, f10), C7512c.m8578a(aVar, c0173b), z10, true, str, null, c15688rMo18372i, (i13 & 14) | 100663296 | i17, ((i13 >> 9) & 14) | 48 | ((i11 << 6) & 896), 8376);
                C1963W0.m2623a(C7482g.m8529n(aVar, 16), c15688rMo18372i);
                C15509d1.m18128a(c6625h2, function0, C16973X.m19466e((C16972W) C19140H5.f59871o.getValue(), c15688rMo18372i, 0), null, null, false, new InterfaceC1155a.b((EnumC1163i) null, aVar3, 5), 0, C7482g.m8529n(aVar, f10), C7512c.m8578a(aVar, c0173b2), z11, true, str2, null, c15688rMo18372i, (i16 & 14) | 100663296 | i17, ((i13 >> 12) & 14) | 48 | ((i11 << 3) & 896), 8376);
                c15688rMo18372i.m18410W(true);
                C1963W0.m2623a(C7482g.m8519d(aVar, 8), c15688rMo18372i);
                C15456E0.m18110a(C7482g.m8529n(aVar, 400), null, C16973X.m19466e((C16972W) C19285c2.f60068T.getValue(), c15688rMo18372i, 0), null, null, false, function1, false, z12, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, z13, null, c15688rMo18372i, (i16 & 3670016) | 24582 | (i13 & 234881024), (i13 >> 6) & 29360128, 392874);
                c15688r = c15688rMo18372i;
                c15688r.m18410W(true);
            }
            C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60101l0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10924g, c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar, 24), c15688rMo18372i);
            C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j12 = c15688rMo18372i.f50813T;
            i12 = (int) (j12 ^ (j12 >>> 32));
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
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            } else {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar2);
            String strM19466e2 = C16973X.m19466e((C16972W) C19285c2.f60061P0.getValue(), c15688rMo18372i, 0);
            InterfaceC1155a.a aVar4 = InterfaceC1155a.a.LOWERCASE;
            float f11 = 336;
            int i18 = i13 >> 3;
            int i19 = i18 & 112;
            C15509d1.m18128a(c6625h, function0, strM19466e2, null, null, false, new InterfaceC1155a.b((EnumC1163i) null, aVar4, 5), 0, C7482g.m8529n(aVar, f11), C7512c.m8578a(aVar, c0173b), z10, true, str, null, c15688rMo18372i, (i13 & 14) | 100663296 | i19, ((i13 >> 9) & 14) | 48 | ((i11 << 6) & 896), 8376);
            C1963W0.m2623a(C7482g.m8529n(aVar, 16), c15688rMo18372i);
            C15509d1.m18128a(c6625h2, function0, C16973X.m19466e((C16972W) C19140H5.f59871o.getValue(), c15688rMo18372i, 0), null, null, false, new InterfaceC1155a.b((EnumC1163i) null, aVar4, 5), 0, C7482g.m8529n(aVar, f11), C7512c.m8578a(aVar, c0173b2), z11, true, str2, null, c15688rMo18372i, (i18 & 14) | 100663296 | i19, ((i13 >> 12) & 14) | 48 | ((i11 << 3) & 896), 8376);
            c15688rMo18372i.m18410W(true);
            C1963W0.m2623a(C7482g.m8519d(aVar, 8), c15688rMo18372i);
            C15456E0.m18110a(C7482g.m8529n(aVar, 400), null, C16973X.m19466e((C16972W) C19285c2.f60068T.getValue(), c15688rMo18372i, 0), null, null, false, function1, false, z12, false, null, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, z13, null, c15688rMo18372i, (i18 & 3670016) | 24582 | (i13 & 234881024), (i13 >> 6) & 29360128, 392874);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(c6625h2, function0, z10, z11, c0173b, c0173b2, function1, z12, z13, str, str2, i10) { // from class: fg.e

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C6625h f34743c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f34744d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f34745e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ boolean f34746f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ C0173B f34747g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C0173B f34748h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Function0 f34749i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ boolean f34750j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ boolean f34751k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ String f34752l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ String f34753m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C11163f.m13166c(this.f34742b, this.f34743c, this.f34744d, this.f34745e, this.f34746f, this.f34747g, this.f34748h, this.f34749i, this.f34750j, this.f34751k, this.f34752l, this.f34753m, (InterfaceC15676n) obj, C15636Z0.m18294a(1769473));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m13167d(String str, InterfaceC15676n interfaceC15676n) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1339324927) {
            if (iHashCode != -964704832) {
                if (iHashCode == -756535850 && str.equals("passwordIsNotMatched")) {
                    interfaceC15676n.mo18363O(58041411);
                    String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59728w.getValue(), interfaceC15676n, 0);
                    interfaceC15676n.mo18357I();
                    return strM19466e;
                }
            } else if (str.equals("badPassword")) {
                interfaceC15676n.mo18363O(58047193);
                String strM19466e2 = C16973X.m19466e((C16972W) C19285c2.f60046I.getValue(), interfaceC15676n, 0);
                interfaceC15676n.mo18357I();
                return strM19466e2;
            }
        } else if (str.equals("passwordMustBeNotEmpty")) {
            interfaceC15676n.mo18363O(58044423);
            String strM19466e3 = C16973X.m19466e((C16972W) C19101C4.f59726v.getValue(), interfaceC15676n, 0);
            interfaceC15676n.mo18357I();
            return strM19466e3;
        }
        interfaceC15676n.mo18363O(58048822);
        interfaceC15676n.mo18357I();
        return str;
    }
}
