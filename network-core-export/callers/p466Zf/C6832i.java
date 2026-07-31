package p466Zf;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
import bf.C8135B0;
import bf.C8194d1;
import bf.C8221m1;
import bf.C8245x0;
import ke.C15855h;
import kotlin.Lazy;
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
import mg.C17048k;
import p019B0.C0173B;
import p104Fd.InterfaceC1610e;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p288Q.C4286K0;
import p288Q.C4421q1;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
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
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Zf.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nChangePasswordScreenM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangePasswordScreenM.kt\nru/zona/app/ui/profile/config/ChangePasswordScreenMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,168:1\n1282#2,6:169\n1282#2,6:175\n1282#2,6:181\n1282#2,6:187\n1282#2,6:232\n1282#2,6:238\n1282#2,6:244\n1282#2,6:250\n1282#2,6:256\n1282#2,6:262\n1282#2,6:268\n113#3:193\n113#3:231\n113#3:274\n113#3:279\n113#3:280\n113#3:281\n113#3:318\n113#3:323\n87#4:194\n84#4,9:195\n94#4:278\n80#5,6:204\n87#5,3:219\n90#5,2:228\n94#5:277\n80#5,6:291\n87#5,3:306\n90#5,2:315\n94#5:321\n391#6,9:210\n400#6:230\n401#6,2:275\n391#6,9:297\n400#6:317\n401#6,2:319\n4360#7,6:222\n4360#7,6:309\n70#8:282\n68#8,8:283\n77#8:322\n85#9:324\n*S KotlinDebug\n*F\n+ 1 ChangePasswordScreenM.kt\nru/zona/app/ui/profile/config/ChangePasswordScreenMKt\n*L\n49#1:169,6\n50#1:175,6\n51#1:181,6\n53#1:187,6\n71#1:232,6\n77#1:238,6\n88#1:244,6\n94#1:250,6\n105#1:256,6\n111#1:262,6\n121#1:268,6\n60#1:193\n67#1:231\n126#1:274\n139#1:279\n141#1:280\n144#1:281\n153#1:318\n157#1:323\n57#1:194\n57#1:195,9\n57#1:278\n57#1:204,6\n57#1:219,3\n57#1:228,2\n57#1:277\n143#1:291,6\n143#1:306,3\n143#1:315,2\n143#1:321\n57#1:210,9\n57#1:230\n57#1:275,2\n143#1:297,9\n143#1:317\n143#1:319,2\n57#1:222,6\n143#1:309,6\n143#1:282\n143#1:283,8\n143#1:322\n47#1:324\n*E\n"})
public final class C6832i {

    /* JADX INFO: renamed from: Zf.i$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.profile.config.ChangePasswordScreenMKt$ChangePasswordScreenM$1$1", m18778f = "ChangePasswordScreenM.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f22442j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f22442j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f22442j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f22442j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Zf.i$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1610e) this.receiver).mo2234l();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m7718a(final InterfaceC1610e interfaceC1610e, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1932826384);
        int i12 = (c15688rMo18372i.mo18362N(interfaceC1610e) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1610e.getState(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = C4286K0.m4969a(c15688rMo18372i);
            }
            final C0173B c0173b2 = (C0173B) objMo18389z2;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b3 = (C0173B) objMo18389z3;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z4);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8517b(aVar, 1.0f), f10, 0.0f, 2);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            Lazy lazy = C19285c2.f60068T;
            C8221m1.m10148a(0, C16973X.m19466e((C16972W) lazy.getValue(), c15688rMo18372i, 0), c15688rMo18372i, interfaceC1610e.mo2223a());
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(aVar, c0173b);
            int i14 = i12 & 14;
            boolean z10 = i14 == 4;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z5 == c21235a) {
                objMo18389z5 = new Function1() { // from class: Zf.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC1610e.mo2226d((String) obj);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z5);
            }
            Function1 function1 = (Function1) objMo18389z5;
            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60105n0.getValue(), c15688rMo18372i, 0);
            String strM19495a = C17048k.m19495a(interfaceC1610e.mo2228f());
            boolean z11 = ((InterfaceC1610e.a) interfaceC15701v0M18246a.getValue()).f5277b.length() == 0;
            Object objMo18389z6 = c15688rMo18372i.mo18389z();
            if (objMo18389z6 == c21235a) {
                objMo18389z6 = new Function1() { // from class: Zf.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C0173B.m230b(c0173b2);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z6);
            }
            C8194d1.m10143a(null, interfaceC7507eM8578a, function1, strM19466e, strM19495a, z11, false, true, new C4421q1(null, null, (Function1) objMo18389z6, null, 59), 6, null, null, null, c15688rMo18372i, 817889280, 7233);
            m7719b(m7720c(((InterfaceC1610e.a) interfaceC15701v0M18246a.getValue()).f5277b, c15688rMo18372i), c15688rMo18372i, 0);
            InterfaceC7507e interfaceC7507eM8578a2 = C7512c.m8578a(aVar, c0173b2);
            boolean z12 = i14 == 4;
            Object objMo18389z7 = c15688rMo18372i.mo18389z();
            if (z12 || objMo18389z7 == c21235a) {
                objMo18389z7 = new Function1() { // from class: Zf.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC1610e.mo2231i((String) obj);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z7);
            }
            Function1 function2 = (Function1) objMo18389z7;
            String strM19466e2 = C16973X.m19466e((C16972W) C19278b3.f59939E0.getValue(), c15688rMo18372i, 0);
            String strM19495a2 = C17048k.m19495a(interfaceC1610e.mo2227e());
            boolean z13 = ((InterfaceC1610e.a) interfaceC15701v0M18246a.getValue()).f5278c.length() == 0;
            Object objMo18389z8 = c15688rMo18372i.mo18389z();
            if (objMo18389z8 == c21235a) {
                objMo18389z8 = new C6827d(c0173b3, 0);
                c15688rMo18372i.mo18380q(objMo18389z8);
            }
            C8194d1.m10143a(null, interfaceC7507eM8578a2, function2, strM19466e2, strM19495a2, z13, false, true, new C4421q1(null, null, (Function1) objMo18389z8, null, 59), 6, null, null, null, c15688rMo18372i, 817889280, 7233);
            m7719b(m7720c(((InterfaceC1610e.a) interfaceC15701v0M18246a.getValue()).f5278c, c15688rMo18372i), c15688rMo18372i, 0);
            InterfaceC7507e interfaceC7507eM8578a3 = C7512c.m8578a(aVar, c0173b3);
            boolean z14 = i14 == 4;
            Object objMo18389z9 = c15688rMo18372i.mo18389z();
            if (z14 || objMo18389z9 == c21235a) {
                objMo18389z9 = new Function1() { // from class: Zf.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC1610e.mo2232j((String) obj);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z9);
            }
            Function1 function3 = (Function1) objMo18389z9;
            String strM19466e3 = C16973X.m19466e((C16972W) C19278b3.f59941F0.getValue(), c15688rMo18372i, 0);
            String strM19495a3 = C17048k.m19495a(interfaceC1610e.mo2225c());
            boolean z15 = ((InterfaceC1610e.a) interfaceC15701v0M18246a.getValue()).f5279d.length() == 0;
            boolean z16 = i14 == 4;
            Object objMo18389z10 = c15688rMo18372i.mo18389z();
            if (z16 || objMo18389z10 == c21235a) {
                objMo18389z10 = new Function1() { // from class: Zf.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC1610e.mo2234l();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z10);
            }
            C8194d1.m10143a(null, interfaceC7507eM8578a3, function3, strM19466e3, strM19495a3, z15, false, true, new C4421q1((Function1) objMo18389z10, null, null, null, 62), 7, null, null, null, c15688rMo18372i, 817889280, 7233);
            m7719b(m7720c(((InterfaceC1610e.a) interfaceC15701v0M18246a.getValue()).f5279d, c15688rMo18372i), c15688rMo18372i, 0);
            boolean z17 = i14 == 4;
            Object objMo18389z11 = c15688rMo18372i.mo18389z();
            if (z17 || objMo18389z11 == c21235a) {
                i11 = 0;
                b bVar = new b(0, interfaceC1610e, InterfaceC1610e.class, "change", "change()V", 0);
                c15688rMo18372i.mo18380q(bVar);
                objMo18389z11 = bVar;
            } else {
                i11 = 0;
            }
            C8245x0.m10154a(null, (Function0) ((KFunction) objMo18389z11), C16973X.m19466e((C16972W) lazy.getValue(), c15688rMo18372i, i11), null, null, false, true, false, 0L, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, 1572864, 0, 16313);
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            C8135B0.m10118a(null, false, interfaceC1610e.mo2229g(), C16973X.m19466e((C16972W) C19140H5.f59799C.getValue(), c15688rMo18372i, 0), null, 0L, 0L, 0.0f, 0.0f, false, c15688rMo18372i, 0, 1011);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Zf.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6832i.m7718a(this.f22440b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7719b(final String str, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(123102586);
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            int length = str.length();
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            if (length == 0) {
                c15688rMo18372i.mo18363O(-552853105);
                C15855h.m18664b(aVar, 24, c15688rMo18372i, false);
            } else {
                c15688rMo18372i.mo18363O(-552776504);
                C1963W0.m2623a(C7482g.m8519d(aVar, 2), c15688rMo18372i);
                float f10 = 16;
                InterfaceC7507e interfaceC7507eM8519d = C7482g.m8519d(aVar, f10);
                InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58750d, false);
                long j10 = c15688rMo18372i.f50813T;
                int i12 = (int) (j10 ^ (j10 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8519d, c15688rMo18372i);
                InterfaceC5799g.f19145s1.getClass();
                C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
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
                C11565Q2.m13480b(str, C7481f.m8513f(aVar, f10, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10917l, C3376c.f10958s, C18580v.m21028b(12), null, null, 0L, null, 0L, null, null, 16777212), c15688rMo18372i, (i11 & 14) | 48, 0, 131068);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
                C15855h.m18664b(aVar, 6, c15688rMo18372i, false);
            }
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, i10) { // from class: Zf.h

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f22441b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6832i.m7719b(this.f22441b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m7720c(String str, InterfaceC15676n interfaceC15676n) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1339324927) {
            if (iHashCode != -964704832) {
                if (iHashCode == -756535850 && str.equals("passwordIsNotMatched")) {
                    interfaceC15676n.mo18363O(-501355816);
                    String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59728w.getValue(), interfaceC15676n, 0);
                    interfaceC15676n.mo18357I();
                    return strM19466e;
                }
            } else if (str.equals("badPassword")) {
                interfaceC15676n.mo18363O(-501350034);
                String strM19466e2 = C16973X.m19466e((C16972W) C19285c2.f60046I.getValue(), interfaceC15676n, 0);
                interfaceC15676n.mo18357I();
                return strM19466e2;
            }
        } else if (str.equals("passwordMustBeNotEmpty")) {
            interfaceC15676n.mo18363O(-501352804);
            String strM19466e3 = C16973X.m19466e((C16972W) C19101C4.f59726v.getValue(), interfaceC15676n, 0);
            interfaceC15676n.mo18357I();
            return strM19466e3;
        }
        interfaceC15676n.mo18363O(-501348405);
        interfaceC15676n.mo18357I();
        return str;
    }
}
