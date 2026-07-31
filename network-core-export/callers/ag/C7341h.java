package ag;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8180Y0;
import bf.C8221m1;
import bf.C8245x0;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.mozilla.javascript.ES6Iterator;
import p001A0.C0009h;
import p017Ag.C0154l;
import p017Ag.C0165w;
import p019B0.C0173B;
import p122Gd.InterfaceC1827f;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p214Lf.C3377d;
import p270P.C4024e;
import p288Q.C4286K0;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p644k0.C15578E0;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15698u0;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18580v;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20541F0;

/* JADX INFO: renamed from: ag.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEmailScreenM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailScreenM.kt\nru/zona/app/ui/profile/login/EmailScreenMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,181:1\n1282#2,6:182\n1282#2,6:188\n1282#2,6:194\n1282#2,6:277\n1282#2,6:290\n1282#2,6:340\n1282#2,6:356\n87#3:200\n84#3,9:201\n87#3:238\n84#3,9:239\n94#3:299\n94#3:354\n80#4,6:210\n87#4,3:225\n90#4,2:234\n80#4,6:248\n87#4,3:263\n90#4,2:272\n94#4:298\n80#4,6:312\n87#4,3:327\n90#4,2:336\n94#4:349\n94#4:353\n80#4,6:372\n87#4,3:387\n90#4,2:396\n94#4:401\n391#5,9:216\n400#5:236\n391#5,9:254\n400#5:274\n401#5,2:296\n391#5,9:318\n400#5:338\n401#5,2:347\n401#5,2:351\n391#5,9:378\n400#5,3:398\n4360#6,6:228\n4360#6,6:266\n4360#6,6:330\n4360#6,6:390\n113#7:237\n113#7:275\n113#7:276\n113#7:283\n113#7:284\n113#7:285\n113#7:286\n113#7:287\n113#7:288\n113#7:289\n113#7:300\n113#7:301\n113#7:302\n113#7:355\n99#8:303\n97#8,8:304\n106#8:350\n2068#9:339\n2069#9:346\n70#10:362\n67#10,9:363\n77#10:402\n85#11:403\n85#11:404\n85#11:405\n78#12:406\n111#12,2:407\n*S KotlinDebug\n*F\n+ 1 EmailScreenM.kt\nru/zona/app/ui/profile/login/EmailScreenMKt\n*L\n58#1:182,6\n59#1:188,6\n61#1:194,6\n92#1:277,6\n132#1:290,6\n150#1:340,6\n173#1:356,6\n65#1:200\n65#1:201,9\n70#1:238\n70#1:239,9\n70#1:299\n65#1:354\n65#1:210,6\n65#1:225,3\n65#1:234,2\n70#1:248,6\n70#1:263,3\n70#1:272,2\n70#1:298\n141#1:312,6\n141#1:327,3\n141#1:336,2\n141#1:349\n65#1:353\n165#1:372,6\n165#1:387,3\n165#1:396,2\n165#1:401\n65#1:216,9\n65#1:236\n70#1:254,9\n70#1:274\n70#1:296,2\n141#1:318,9\n141#1:338\n141#1:347,2\n65#1:351,2\n165#1:378,9\n165#1:398,3\n65#1:228,6\n70#1:266,6\n141#1:330,6\n165#1:390,6\n72#1:237\n79#1:275\n86#1:276\n102#1:283\n105#1:284\n112#1:285\n114#1:286\n117#1:287\n124#1:288\n126#1:289\n139#1:300\n144#1:301\n145#1:302\n172#1:355\n141#1:303\n141#1:304,8\n141#1:350\n147#1:339\n147#1:346\n165#1:362\n165#1:363,9\n165#1:402\n54#1:403\n55#1:404\n56#1:405\n59#1:406\n59#1:407,2\n*E\n"})
public final class C7341h {

    /* JADX INFO: renamed from: ag.h$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.profile.login.EmailScreenMKt$EmailScreenM$1$1", m18778f = "EmailScreenM.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f23579j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f23579j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f23579j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f23579j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ag.h$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1827f) this.receiver).mo2533e();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m8154a(final InterfaceC1827f interfaceC1827f, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        final InterfaceC1827f interfaceC1827f2;
        int i11;
        Object bVar;
        InterfaceC7507e.a aVar;
        final InterfaceC15698u0 interfaceC15698u0;
        String str;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1762482502);
        int i12 = i10 | (c15688rMo18372i.mo18362N(interfaceC1827f) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1827f.getState(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC1827f.mo2534f(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a3 = C15585G1.m18246a(interfaceC1827f.mo2530b().f562b, c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new C15578E0(0);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            InterfaceC15698u0 interfaceC15698u1 = (InterfaceC15698u0) objMo18389z2;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z3);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(C7482g.m8517b(aVar2, 1.0f), C20541F0.m25137a(c15688rMo18372i), 14);
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar3 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar3, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM25139c, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(aVar2, f10, 0.0f, 2);
            C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar3, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i14 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            C8221m1.m10148a(0, C16973X.m19466e((C16972W) C19278b3.f59976Y.getValue(), c15688rMo18372i, 0), c15688rMo18372i, interfaceC1827f.mo2529a());
            C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
            InterfaceC15698u0 interfaceC15698u2 = interfaceC15698u1;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59977Z.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10912g, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7512c.m8578a(aVar2, c0173b), "test_tag_email_field");
            int i15 = i12 & 14;
            boolean z10 = i15 == 4;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z4 == c21235a) {
                objMo18389z4 = new Function1() { // from class: ag.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC1827f.mo2532d((String) obj);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            Function1 function1 = (Function1) objMo18389z4;
            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60045H0.getValue(), c15688rMo18372i, 0);
            String string = interfaceC1827f.mo2531c().m7428c().f21694d.toString();
            boolean z11 = ((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6179a;
            String str2 = ((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6180b;
            C8180Y0.m10138a(null, interfaceC7507eM8700a, function1, strM19466e, string, z11, false, !(str2 == null || StringsKt.isBlank(str2)), null, null, interfaceC15698u2.mo18238i(), c15688rMo18372i, 0);
            C15688r c15688r2 = c15688rMo18372i;
            if (((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6179a && ((str = ((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6180b) == null || StringsKt.isBlank(str))) {
                c15688r2.mo18363O(1464850058);
                C15855h.m18664b(aVar2, 24, c15688r2, false);
                i11 = 0;
            } else if (((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6179a) {
                String str3 = ((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6180b;
                if (str3 == null || StringsKt.isBlank(str3)) {
                    i11 = 0;
                    c15688r2.mo18363O(1465997616);
                    c15688r2.m18410W(false);
                } else {
                    c15688r2.mo18363O(1465523409);
                    C1963W0.m2623a(C7482g.m8519d(aVar2, 2), c15688r2);
                    C11565Q2.m13480b(((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6180b, C7481f.m8513f(aVar2, f10, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10917l, C3376c.f10955p, C18580v.m21028b(12), null, null, 0L, null, 0L, null, null, 16777212), c15688r2, 48, 0, 131068);
                    c15688r2 = c15688r2;
                    i11 = 0;
                    C15855h.m18664b(aVar2, 6, c15688r2, false);
                }
            } else {
                c15688r2.mo18363O(1464972663);
                C1963W0.m2623a(C7482g.m8519d(aVar2, 2), c15688r2);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59936D.getValue(), c15688r2, 0), C7481f.m8513f(aVar2, f10, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10917l, C3376c.f10958s, C18580v.m21028b(12), null, null, 0L, null, 0L, null, null, 16777212), c15688r2, 48, 0, 131068);
                c15688r2 = c15688r2;
                i11 = 0;
                C15855h.m18664b(aVar2, 6, c15688r2, false);
            }
            InterfaceC7507e interfaceC7507eM8700a2 = C7586d.m8700a(aVar2, "test_tag_continue_button");
            boolean z12 = i15 == 4;
            Object objMo18389z5 = c15688r2.mo18389z();
            if (z12 || objMo18389z5 == c21235a) {
                aVar = aVar2;
                bVar = new b(0, interfaceC1827f, InterfaceC1827f.class, ES6Iterator.DONE_PROPERTY, "done()V", 0);
                c15688r2.mo18380q(bVar);
            } else {
                aVar = aVar2;
                bVar = objMo18389z5;
            }
            C15688r c15688r3 = c15688r2;
            C8245x0.m10154a(interfaceC7507eM8700a2, (Function0) ((KFunction) bVar), C16973X.m19466e((C16972W) C19101C4.f59713o0.getValue(), c15688r2, i11), null, null, false, ((InterfaceC1827f.a) interfaceC15701v0M18246a.getValue()).f6179a && C0165w.m221c((C0154l) interfaceC15701v0M18246a3.getValue()) && !StringsKt.isBlank(interfaceC1827f.mo2531c().m7428c().f21694d), false, 0L, 0L, null, 0.0f, 0.0f, C0165w.m220b((C0154l) interfaceC15701v0M18246a3.getValue()), c15688r3, 6, 0, 8120);
            c15688r = c15688r3;
            c15688r.m18410W(true);
            InterfaceC7507e.a aVar5 = aVar;
            C1963W0.m2623a(C7482g.m8519d(aVar5, 24), c15688r);
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C20541F0.m25138b(aVar5, C20541F0.m25137a(c15688r), true, false), f10, 10);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(f10), InterfaceC18861d.a.f58756j, c15688r, 6);
            long j12 = c15688r.f50813T;
            int i16 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688r.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8512e, c15688r);
            c15688r.mo18353E();
            if (c15688r.f50812S) {
                c15688r.mo18355G(aVar4);
            } else {
                c15688r.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688r, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688r, fVar);
            if (c15688r.f50812S || !Intrinsics.areEqual(c15688r.mo18389z(), Integer.valueOf(i16))) {
                C12269M6.m14188a(i16, c15688r, i16, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688r, eVar);
            c15688r.mo18363O(-334393429);
            for (final String str4 : (List) interfaceC15701v0M18246a2.getValue()) {
                boolean zMo18362N = (i15 == 4) | c15688r.mo18362N(str4);
                Object objMo18389z6 = c15688r.mo18389z();
                if (zMo18362N || objMo18389z6 == c21235a) {
                    interfaceC15698u0 = interfaceC15698u2;
                    objMo18389z6 = new Function0() { // from class: ag.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            interfaceC1827f.mo2535g(str4);
                            InterfaceC15698u0 interfaceC15698u3 = interfaceC15698u0;
                            interfaceC15698u3.mo18237a(interfaceC15698u3.mo18238i() + 1);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r.mo18380q(objMo18389z6);
                } else {
                    interfaceC15698u0 = interfaceC15698u2;
                }
                m8155b(0, str4, c15688r, (Function0) objMo18389z6);
                interfaceC15698u2 = interfaceC15698u0;
            }
            interfaceC1827f2 = interfaceC1827f;
            c15688r.m18410W(false);
            c15688r.m18410W(true);
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            interfaceC1827f2 = interfaceC1827f;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: ag.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C7341h.m8154a(this.f23575b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8155b(final int i10, final String str, InterfaceC15676n interfaceC15676n, final Function0 function0) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(835298411);
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18350B(function0) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            C4024e c4024e = C3377d.f10967b;
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7468a.m8487b(C0009h.m22a(InterfaceC7507e.a.f24548b, c4024e), C3376c.f10944e, c4024e), 8, 6);
            boolean z10 = (i11 & 112) == 32;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new Function0() { // from class: ag.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC7507e interfaceC7507eM8490c = C7470c.m8490c(15, interfaceC7507eM8512e, null, (Function0) objMo18389z, false);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8490c, c15688rMo18372i);
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
            C11565Q2.m13480b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10916k, c15688rMo18372i, i11 & 14, 0, 131070);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, str, function0) { // from class: ag.g

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f23577b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f23578c;

                {
                    this.f23577b = str;
                    this.f23578c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C7341h.m8155b(C15636Z0.m18294a(1), this.f23577b, (InterfaceC15676n) obj, this.f23578c);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
