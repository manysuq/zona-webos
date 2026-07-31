package ag;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8135B0;
import bf.C8194d1;
import bf.C8221m1;
import bf.C8245x0;
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
import mg.C17059v;
import p019B0.C0173B;
import p055D0.C0955R0;
import p122Gd.InterfaceC1831h;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p288Q.C4286K0;
import p288Q.C4421q1;
import p358Tf.C5129l;
import p358Tf.C5131m;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p580h1.C11795x0;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p664l1.AbstractC16308g;
import p664l1.C16316o;
import p664l1.C16317p;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p706o1.C17285d;
import p776s1.C18043a;
import p776s1.C18051i;
import p776s1.C18056n;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: ag.k */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLoginPasswordScreenM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginPasswordScreenM.kt\nru/zona/app/ui/profile/login/LoginPasswordScreenMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,115:1\n1282#2,6:116\n1282#2,6:122\n1282#2,6:168\n1282#2,6:174\n1282#2,6:181\n1282#2,6:188\n113#3:128\n113#3:166\n113#3:167\n113#3:180\n113#3:187\n87#4:129\n84#4,9:130\n94#4:197\n80#5,6:139\n87#5,3:154\n90#5,2:163\n94#5:196\n391#6,9:145\n400#6:165\n401#6,2:194\n4360#7,6:157\n85#8:198\n*S KotlinDebug\n*F\n+ 1 LoginPasswordScreenM.kt\nru/zona/app/ui/profile/login/LoginPasswordScreenMKt\n*L\n49#1:116,6\n51#1:122,6\n86#1:168,6\n92#1:174,6\n102#1:181,6\n110#1:188,6\n58#1:128\n66#1:166\n80#1:167\n98#1:180\n107#1:187\n55#1:129\n55#1:130,9\n55#1:197\n55#1:139,6\n55#1:154,3\n55#1:163,2\n55#1:196\n55#1:145,9\n55#1:165\n55#1:194,2\n55#1:157,6\n47#1:198\n*E\n"})
public final class C7344k {

    /* JADX INFO: renamed from: ag.k$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.profile.login.LoginPasswordScreenMKt$LoginPasswordScreenM$1$1", m18778f = "LoginPasswordScreenM.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f23581j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f23581j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f23581j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f23581j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ag.k$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            ((InterfaceC1831h) this.receiver).mo2554d(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ag.k$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1831h) this.receiver).mo2557g();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ag.k$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1831h) this.receiver).mo2558h();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m8157a(InterfaceC1831h interfaceC1831h, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        int i11;
        Object bVar;
        int i12;
        InterfaceC7507e.a aVar;
        InterfaceC15676n.a.C21235a c21235a;
        int i13;
        int i14;
        Object cVar;
        InterfaceC15676n.a.C21235a c21235a2;
        int i15;
        int i16;
        InterfaceC1831h interfaceC1831h2 = interfaceC1831h;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1001673762);
        int i17 = (c15688rMo18372i.mo18362N(interfaceC1831h2) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i17 & 1, (i17 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1831h2.getState(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a3 = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a3) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a3) {
                objMo18389z2 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z2);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8517b(aVar2, 1.0f), f10, 0.0f, 2);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i18 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i18))) {
                C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C8221m1.m10148a(0, C16973X.m19466e((C16972W) C19278b3.f60011q0.getValue(), c15688rMo18372i, 0), c15688rMo18372i, interfaceC1831h2.mo2552a());
            C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
            C11565Q2.m13481c(C17059v.m19504b(C16973X.m19467f((C16972W) C19278b3.f60009p0.getValue(), new Object[]{interfaceC1831h2.mo2553c()}, c15688rMo18372i), interfaceC1831h2.mo2553c(), new C11795x0(C3376c.f10951l, 0L, C16318q.f51785g, (C16316o) null, (C16317p) null, (AbstractC16308g) null, (String) null, 0L, (C18043a) null, (C18056n) null, (C17285d) null, 0L, (C18051i) null, (C0955R0) null, 65530), 8), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, C11732N0.m13585a(C3374a.f10912g, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 262142);
            C1963W0.m2623a(C7482g.m8519d(aVar2, f10), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7512c.m8578a(aVar2, c0173b), "test_tag_pass_field");
            int i19 = i17 & 14;
            boolean z10 = i19 == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z3 == c21235a3) {
                i12 = 4;
                aVar = aVar2;
                c21235a = c21235a3;
                i13 = 1;
                i14 = 0;
                bVar = new b(1, interfaceC1831h2, InterfaceC1831h.class, "setPassword", "setPassword(Ljava/lang/String;)V", 0);
                c15688rMo18372i.mo18380q(bVar);
            } else {
                aVar = aVar2;
                c21235a = c21235a3;
                bVar = objMo18389z3;
                i13 = 1;
                i12 = 4;
                i14 = 0;
            }
            Function1 function1 = (Function1) ((KFunction) bVar);
            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60061P0.getValue(), c15688rMo18372i, i14);
            String string = interfaceC1831h2.mo2556f().m7428c().f21694d.toString();
            boolean z11 = ((InterfaceC1831h.a) interfaceC15701v0M18246a.getValue()).f6214a.length() == 0;
            boolean z12 = i19 == i12;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (z12 || objMo18389z4 == c21235a) {
                objMo18389z4 = new C5129l(interfaceC1831h2, i13);
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            InterfaceC15676n.a.C21235a c21235a4 = c21235a;
            C8194d1.m10143a(null, interfaceC7507eM8700a, function1, strM19466e, string, z11, false, true, new C4421q1((Function1) objMo18389z4, null, null, null, 62), 7, C16973X.m19466e((C16972W) C19278b3.f59938E.getValue(), c15688rMo18372i, i14), null, null, c15688rMo18372i, 817889280, 6209);
            InterfaceC7507e.a aVar4 = aVar;
            C1963W0.m2623a(C7482g.m8519d(aVar4, 24), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8700a2 = C7586d.m8700a(aVar4, "test_tag_login_button");
            boolean z13 = i19 == 4;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (z13 || objMo18389z5 == c21235a4) {
                c21235a2 = c21235a4;
                i15 = 0;
                cVar = new c(0, interfaceC1831h2, InterfaceC1831h.class, "doLogin", "doLogin()V", 0);
                c15688rMo18372i.mo18380q(cVar);
            } else {
                c21235a2 = c21235a4;
                cVar = objMo18389z5;
                i15 = 0;
            }
            C8245x0.m10154a(interfaceC7507eM8700a2, (Function0) ((KFunction) cVar), C16973X.m19466e((C16972W) C19278b3.f60013r0.getValue(), c15688rMo18372i, i15), null, null, false, ((InterfaceC1831h.a) interfaceC15701v0M18246a.getValue()).f6215b, false, 0L, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, 6, 0, 16312);
            C1963W0.m2623a(C7482g.m8519d(aVar4, f10), c15688rMo18372i);
            boolean z14 = i19 == 4;
            Object objMo18389z6 = c15688rMo18372i.mo18389z();
            if (z14 || objMo18389z6 == c21235a2) {
                i16 = 0;
                interfaceC1831h2 = interfaceC1831h;
                objMo18389z6 = new d(0, interfaceC1831h2, InterfaceC1831h.class, "restorePassword", "restorePassword()V", 0);
                c15688rMo18372i.mo18380q(objMo18389z6);
            } else {
                i16 = 0;
                interfaceC1831h2 = interfaceC1831h;
            }
            i11 = 1;
            C8135B0.m10118a(null, false, (Function0) ((KFunction) objMo18389z6), C16973X.m19466e((C16972W) C19140H5.f59799C.getValue(), c15688rMo18372i, i16), null, 0L, 0L, 0.0f, 0.0f, false, c15688rMo18372i, 0, 1011);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            i11 = 1;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C5131m(interfaceC1831h2, i10, i11);
        }
    }
}
