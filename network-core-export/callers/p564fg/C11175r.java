package p564fg;

import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7476a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7512c;
import ch.C8483b;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C17040c;
import mg.C17055r;
import p001A0.C0009h;
import p019B0.C0173B;
import p019B0.InterfaceC0179H;
import p055D0.C0998l0;
import p104Fd.InterfaceC1611f;
import p126H.C1982e;
import p180K.C2687h;
import p180K.InterfaceC2660M;
import p180K.InterfaceC2675b;
import p180K.InterfaceC2700t;
import p214Lf.C3376c;
import p214Lf.C3377d;
import p288Q.C4286K0;
import p340Sf.C4937d;
import p361U0.InterfaceC5208f;
import p450Z.C6628k;
import p478aa.InterfaceC7059L;
import p480ah.InterfaceC7360f;
import p640jf.C15536p0;
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
import p775s0.C18037u;
import p845wg.C19285c2;
import p881z.C20611t;

/* JADX INFO: renamed from: fg.r */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nProfileAvaScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileAvaScreenTv.kt\nru/zona/app/ui/tv/profile/config/ProfileAvaScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,97:1\n1282#2,6:98\n1282#2,6:104\n1282#2,6:137\n85#3:110\n117#3,2:111\n85#3:113\n85#3:114\n85#3:115\n524#4,18:116\n113#5:134\n113#5:135\n113#5:136\n*S KotlinDebug\n*F\n+ 1 ProfileAvaScreenTv.kt\nru/zona/app/ui/tv/profile/config/ProfileAvaScreenTvKt\n*L\n43#1:98,6\n45#1:104,6\n66#1:137,6\n68#1:110\n68#1:111,2\n69#1:113\n41#1:114\n42#1:115\n67#1:116,18\n61#1:134\n63#1:135\n64#1:136\n*E\n"})
public final class C11175r {

    /* JADX INFO: renamed from: fg.r$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.config.ProfileAvaScreenTvKt$ProfileAvaScreenTv$1$1", m18778f = "ProfileAvaScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f34772j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34772j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f34772j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f34772j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fg.r$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b implements Function1<InterfaceC0179H, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC15701v0<Boolean> f34773b;

        public b(InterfaceC15701v0<Boolean> interfaceC15701v0) {
            this.f34773b = interfaceC15701v0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC0179H interfaceC0179H) {
            this.f34773b.setValue(Boolean.valueOf(interfaceC0179H.mo236b()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fg.r$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC1611f f34774b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f34775c;

        public c(InterfaceC1611f interfaceC1611f, String str) {
            this.f34774b = interfaceC1611f;
            this.f34775c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f34774b.mo2241d(this.f34775c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fg.r$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nProfileAvaScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileAvaScreenTv.kt\nru/zona/app/ui/tv/profile/config/ProfileAvaScreenTvKt$ProfileAvaScreenTv$2$1$1$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,97:1\n113#2:98\n*S KotlinDebug\n*F\n+ 1 ProfileAvaScreenTv.kt\nru/zona/app/ui/tv/profile/config/ProfileAvaScreenTvKt$ProfileAvaScreenTv$2$1$1$1$3\n*L\n84#1:98\n*E\n"})
    public static final class d implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC15701v0<C0998l0> f34776b;

        public d(InterfaceC15701v0<C0998l0> interfaceC15701v0) {
            this.f34776b = interfaceC15701v0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            num.intValue();
            interfaceC15676n2.mo18363O(-986481494);
            InterfaceC7507e interfaceC7507eM25195a = C20611t.m25195a(interfaceC7507e, 4, this.f34776b.getValue().f3476a, C3377d.f10968c);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM25195a;
        }
    }

    /* JADX INFO: renamed from: fg.r$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4\n*L\n1#1,538:1\n*E\n"})
    public static final class e implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f34777b;

        public e(List list) {
            this.f34777b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.f34777b.get(num.intValue());
            return null;
        }
    }

    /* JADX INFO: renamed from: fg.r$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 ProfileAvaScreenTv.kt\nru/zona/app/ui/tv/profile/config/ProfileAvaScreenTvKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,541:1\n68#2:542\n69#2:549\n71#2,2:553\n70#2,4:555\n77#2,2:562\n79#2:570\n80#2,11:577\n76#2:588\n91#2,2:589\n1282#3,6:543\n1282#3,3:550\n1285#3,3:559\n1282#3,6:564\n1282#3,6:571\n*S KotlinDebug\n*F\n+ 1 ProfileAvaScreenTv.kt\nru/zona/app/ui/tv/profile/config/ProfileAvaScreenTvKt\n*L\n68#1:543,6\n69#1:550,3\n69#1:559,3\n78#1:564,6\n79#1:571,6\n*E\n"})
    public static final class f implements Function4<InterfaceC2700t, Integer, InterfaceC15676n, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f34778b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC1611f f34779c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC15612P1 f34780d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC15612P1 f34781e;

        public f(List list, InterfaceC1611f interfaceC1611f, InterfaceC15612P1 interfaceC15612P1, InterfaceC15612P1 interfaceC15612P2) {
            this.f34778b = list;
            this.f34779c = interfaceC1611f;
            this.f34780d = interfaceC15612P1;
            this.f34781e = interfaceC15612P2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(InterfaceC2700t interfaceC2700t, Integer num, InterfaceC15676n interfaceC15676n, Integer num2) {
            int i10;
            InterfaceC2700t interfaceC2700t2 = interfaceC2700t;
            int iIntValue = num.intValue();
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i10 = (interfaceC15676n2.mo18362N(interfaceC2700t2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= interfaceC15676n2.mo18368e(iIntValue) ? 32 : 16;
            }
            boolean z10 = true;
            if (interfaceC15676n2.mo18379p(i10 & 1, (i10 & 147) != 146)) {
                String str = (String) this.f34778b.get(iIntValue);
                interfaceC15676n2.mo18363O(-340476830);
                Object objMo18389z = interfaceC15676n2.mo18389z();
                InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                if (objMo18389z == c21235a) {
                    objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                    interfaceC15676n2.mo18380q(objMo18389z);
                }
                InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
                boolean zMo18364a = interfaceC15676n2.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
                Object objMo18389z2 = interfaceC15676n2.mo18389z();
                if (zMo18364a || objMo18389z2 == c21235a) {
                    objMo18389z2 = C15585G1.m18250e(new C0998l0(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10955p));
                    interfaceC15676n2.mo18380q(objMo18389z2);
                }
                InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
                Object objMo18389z3 = interfaceC15676n2.mo18389z();
                if (objMo18389z3 == c21235a) {
                    objMo18389z3 = new b(interfaceC15701v0);
                    interfaceC15676n2.mo18380q(objMo18389z3);
                }
                InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(InterfaceC7507e.a.f24548b, (Function1) objMo18389z3);
                InterfaceC1611f interfaceC1611f = this.f34779c;
                boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC1611f) | interfaceC15676n2.mo18362N(str);
                Object objMo18389z4 = interfaceC15676n2.mo18389z();
                if (zMo18350B || objMo18389z4 == c21235a) {
                    objMo18389z4 = new c(interfaceC1611f, str);
                    interfaceC15676n2.mo18380q(objMo18389z4);
                }
                InterfaceC7507e interfaceC7507eM22a = C0009h.m22a(C7476a.m8501a(C7470c.m8490c(15, interfaceC7507eM8576a, null, (Function0) objMo18389z4, false), 1.0f), C3377d.f10968c);
                if (!((Boolean) interfaceC15701v0.getValue()).booleanValue() && !Intrinsics.areEqual(((InterfaceC7360f.a) this.f34780d.getValue()).f23598b.f29039d, str)) {
                    z10 = false;
                }
                C17040c.m19494a(C17055r.m19499a(interfaceC7507eM22a, z10, new d(interfaceC15701v1), interfaceC15676n2, 0), C6628k.m7436a(((C8483b) this.f34781e.getValue()).f29032a, str), null, InterfaceC5208f.a.f17030a, false, 0.0f, null, interfaceC15676n2, 3072, 116);
                interfaceC15676n2.mo18357I();
            } else {
                interfaceC15676n2.mo18356H();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13169a(final InterfaceC1611f interfaceC1611f, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-580713626);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1611f) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1611f.mo2239b(), c15688rMo18372i, 0);
            final InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC1611f.mo2240c(), c15688rMo18372i, 0);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z2);
            C15536p0.m18135a(C16973X.m19466e((C16972W) C19285c2.f60066S.getValue(), c15688rMo18372i, 0), interfaceC1611f.mo2238a(), null, false, C7512c.m8578a(InterfaceC7507e.a.f24548b, c0173b), null, null, C18037u.m20404c(-1634364999, new Function2() { // from class: fg.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        if (((C8483b) interfaceC15612P1.getValue()).f29033b.isEmpty()) {
                            interfaceC15676n2.mo18363O(-1618377792);
                            C4937d.m5518a(null, 0L, interfaceC15676n2, 0, 3);
                            interfaceC15676n2.mo18357I();
                        } else {
                            interfaceC15676n2.mo18363O(-1618338391);
                            interfaceC15676n2.mo18357I();
                        }
                        InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(C7482g.m8517b(InterfaceC7507e.a.f24548b, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13);
                        InterfaceC2675b.a aVar = new InterfaceC2675b.a(5);
                        float f10 = 16;
                        C1982e.i iVarM2645g = C1982e.m2645g(f10);
                        C1982e.i iVarM2645g2 = C1982e.m2645g(f10);
                        boolean zMo18362N = interfaceC15676n2.mo18362N(interfaceC15612P1);
                        final InterfaceC1611f interfaceC1611f2 = interfaceC1611f;
                        boolean zMo18350B = zMo18362N | interfaceC15676n2.mo18350B(interfaceC1611f2);
                        final InterfaceC15612P1 interfaceC15612P2 = interfaceC15701v0M18246a2;
                        boolean zMo18362N2 = zMo18350B | interfaceC15676n2.mo18362N(interfaceC15612P2);
                        Object objMo18389z3 = interfaceC15676n2.mo18389z();
                        if (zMo18362N2 || objMo18389z3 == InterfaceC15676n.a.f50781a) {
                            objMo18389z3 = new Function1() { // from class: fg.q
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    InterfaceC2660M interfaceC2660M = (InterfaceC2660M) obj3;
                                    InterfaceC15612P1 interfaceC15612P3 = interfaceC15612P1;
                                    List<String> list = ((C8483b) interfaceC15612P3.getValue()).f29033b;
                                    interfaceC2660M.mo3410a(list.size(), new C11175r.e(list), new C18036t(-1117249557, new C11175r.f(list, interfaceC1611f2, interfaceC15612P2, interfaceC15612P3), true));
                                    interfaceC2660M.mo3411d(C11166i.f34756a);
                                    return Unit.INSTANCE;
                                }
                            };
                            interfaceC15676n2.mo18380q(objMo18389z3);
                        }
                        C2687h.m3426a(aVar, interfaceC7507eM8515h, null, null, iVarM2645g, iVarM2645g2, null, true, null, (Function1) objMo18389z3, interfaceC15676n2, 102432816, 668);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 100663296, 220);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: fg.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11175r.m13169a(this.f34768b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
