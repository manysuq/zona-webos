package p159Ie;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7512c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ne.C17229w;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p019B0.C0173B;
import p055D0.C0998l0;
import p126H.C2000k;
import p192Kb.EnumC2966r;
import p214Lf.C3374a;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p270P.C4024e;
import p270P.C4025f;
import p288Q.C4286K0;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p579h0.C11565Q2;
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
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;
import p881z.C20611t;

/* JADX INFO: renamed from: Ie.j */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSkipButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipButton.kt\nru/zona/app/screens/player/controls/movie/SkipButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,117:1\n113#2:118\n113#2:161\n113#2:162\n113#2:185\n113#2:246\n113#2:247\n70#3:119\n68#3,8:120\n77#3:166\n70#3:198\n68#3,8:199\n77#3:251\n80#4,6:128\n87#4,3:143\n90#4,2:152\n94#4:165\n80#4,6:207\n87#4,3:222\n90#4,2:231\n94#4:250\n391#5,9:134\n400#5:154\n401#5,2:163\n391#5,9:213\n400#5:233\n401#5,2:248\n4360#6,6:146\n4360#6,6:225\n1282#7,6:155\n1282#7,6:167\n1282#7,6:173\n1282#7,6:179\n1282#7,6:186\n1282#7,6:192\n1282#7,6:234\n1282#7,6:240\n1282#7,6:252\n85#8:258\n117#8,2:259\n85#8:261\n85#8:262\n*S KotlinDebug\n*F\n+ 1 SkipButton.kt\nru/zona/app/screens/player/controls/movie/SkipButtonKt\n*L\n41#1:118\n51#1:161\n52#1:162\n72#1:185\n92#1:246\n93#1:247\n42#1:119\n42#1:120,8\n42#1:166\n81#1:198\n81#1:199,8\n81#1:251\n42#1:128,6\n42#1:143,3\n42#1:152,2\n42#1:165\n81#1:207,6\n81#1:222,3\n81#1:231,2\n81#1:250\n42#1:134,9\n42#1:154\n42#1:163,2\n81#1:213,9\n81#1:233\n81#1:248,2\n42#1:146,6\n81#1:225,6\n48#1:155,6\n65#1:167,6\n66#1:173,6\n69#1:179,6\n74#1:186,6\n76#1:192,6\n90#1:234,6\n91#1:240,6\n105#1:252,6\n65#1:258\n65#1:259,2\n66#1:261\n69#1:262\n*E\n"})
public final class C2372j {

    /* JADX INFO: renamed from: Ie.j$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.player.controls.movie.SkipButtonKt$SkipButtonTv$1$1", m18778f = "SkipButton.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f7778j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7778j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f7778j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f7778j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m3058a(final EnumC2966r enumC2966r, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(881413008);
        int i11 = (c15688rMo18372i.mo18368e(enumC2966r.ordinal()) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function0) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            C4024e c4024eM4709b = C4025f.m4709b(8);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58752f, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
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
            boolean z10 = (i11 & 112) == 32;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new Function0() { // from class: Ie.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C11565Q2.m13480b(m3060c(enumC2966r, c15688rMo18372i), C7481f.m8512e(C20611t.m25195a(C7468a.m8487b(C0009h.m22a(C7470c.m8490c(15, aVar, null, (Function0) objMo18389z, false), c4024eM4709b), C3376c.f10961v, c4024eM4709b), 1, C3376c.f10951l, c4024eM4709b), 16, 12), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10914i, c15688rMo18372i, 0, 0, 131068);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function0, i10) { // from class: Ie.f

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f7768c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C2372j.m3058a(this.f7767b, this.f7768c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m3059b(boolean z10, EnumC2966r enumC2966r, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        boolean z11;
        int i12;
        final EnumC2966r enumC2966r2;
        C15688r c15688r;
        final boolean z12;
        char c10;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1208121119);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            z11 = z10;
        } else if ((i10 & 6) == 0) {
            z11 = z10;
            i12 = i10 | (c15688rMo18372i.mo18364a(z11) ? 4 : 2);
        } else {
            z11 = z10;
            i12 = i10;
        }
        int i14 = i12 | (c15688rMo18372i.mo18368e(enumC2966r.ordinal()) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i14 & 1, (i14 & 147) != 146)) {
            z12 = i13 != 0 ? false : z11;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            boolean zMo18364a = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18364a || objMo18389z2 == c21235a) {
                objMo18389z2 = C17229w.m19683a(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10962w, c15688rMo18372i);
            }
            InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
            boolean zMo18364a2 = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (zMo18364a2 || objMo18389z3 == c21235a) {
                objMo18389z3 = C17229w.m19683a(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10951l, c15688rMo18372i);
            }
            InterfaceC15701v0 interfaceC15701v2 = (InterfaceC15701v0) objMo18389z3;
            C4024e c4024eM4709b = C4025f.m4709b(8);
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z4;
            if (z12) {
                c10 = ' ';
                c15688rMo18372i.mo18363O(690223815);
                Unit unit = Unit.INSTANCE;
                Object objMo18389z5 = c15688rMo18372i.mo18389z();
                if (objMo18389z5 == c21235a) {
                    objMo18389z5 = new a(c0173b, null);
                    c15688rMo18372i.mo18380q(objMo18389z5);
                }
                C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z5);
                c15688rMo18372i.m18410W(false);
            } else {
                c10 = ' ';
                c15688rMo18372i.mo18363O(690310305);
                c15688rMo18372i.m18410W(false);
            }
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58752f, false);
            long j10 = c15688rMo18372i.f50813T;
            int i15 = (int) (j10 ^ (j10 >>> c10));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(C7468a.m8487b(C0009h.m22a(aVar, c4024eM4709b), ((C0998l0) interfaceC15701v1.getValue()).f3476a, c4024eM4709b), c0173b);
            Object objMo18389z6 = c15688rMo18372i.mo18389z();
            if (objMo18389z6 == c21235a) {
                objMo18389z6 = new C2369g(interfaceC15701v0, 0);
                c15688rMo18372i.mo18380q(objMo18389z6);
            }
            InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8578a, (Function1) objMo18389z6);
            boolean z13 = (i14 & 896) == 256;
            Object objMo18389z7 = c15688rMo18372i.mo18389z();
            if (z13 || objMo18389z7 == c21235a) {
                objMo18389z7 = new C2370h(function0, 0);
                c15688rMo18372i.mo18380q(objMo18389z7);
            }
            enumC2966r2 = enumC2966r;
            C11565Q2.m13480b(m3060c(enumC2966r2, c15688rMo18372i), C7481f.m8512e(C20611t.m25195a(C7470c.m8490c(15, interfaceC7507eM8576a, null, (Function0) objMo18389z7, false), 2, ((C0998l0) interfaceC15701v2.getValue()).f3476a, c4024eM4709b), 24, 14), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3375b.f10928k, c15688rMo18372i, 0, 0, 131068);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
        } else {
            enumC2966r2 = enumC2966r;
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
            z12 = z11;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: Ie.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C2372j.m3059b(z12, enumC2966r2, function0, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1), i11);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m3060c(EnumC2966r enumC2966r, InterfaceC15676n interfaceC15676n) {
        C16972W c16972w;
        int iOrdinal = enumC2966r.ordinal();
        if (iOrdinal != 1) {
            c16972w = iOrdinal != 3 ? (C16972W) C19140H5.f59874p0.getValue() : (C16972W) C19140H5.f59876q0.getValue();
        } else {
            c16972w = (C16972W) C19140H5.f59878r0.getValue();
        }
        return C16973X.m19466e(c16972w, interfaceC15676n, 0);
    }
}
