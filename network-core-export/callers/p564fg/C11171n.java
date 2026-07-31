package p564fg;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.platform.C7586d;
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
import kotlin.reflect.KFunction;
import p019B0.C0173B;
import p104Fd.InterfaceC1612g;
import p122Gd.C1848y;
import p126H.C1961V0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p288Q.C4286K0;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p448Yf.C6606l;
import p478aa.InterfaceC7059L;
import p640jf.C15496Z;
import p640jf.C15536p0;
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
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p770rf.InterfaceC17978p;
import p775s0.C18036t;
import p775s0.C18037u;
import p830w0.InterfaceC18861d;
import p845wg.C19097C0;
import p845wg.C19101C4;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: fg.n */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nConfigScreenTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigScreenTv.kt\nru/zona/app/ui/tv/profile/config/ConfigScreenTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,118:1\n1282#2,6:119\n1282#2,6:125\n1282#2,6:131\n1282#2,6:137\n1282#2,6:143\n1282#2,6:149\n1282#2,6:155\n1282#2,6:199\n113#3:161\n113#3:162\n87#4:163\n85#4,8:164\n94#4:208\n80#5,6:172\n87#5,3:187\n90#5,2:196\n94#5:207\n391#6,9:178\n400#6:198\n401#6,2:205\n4360#7,6:190\n*S KotlinDebug\n*F\n+ 1 ConfigScreenTv.kt\nru/zona/app/ui/tv/profile/config/ConfigScreenTvKt\n*L\n41#1:119,6\n42#1:125,6\n44#1:131,6\n49#1:137,6\n51#1:143,6\n98#1:149,6\n113#1:155,6\n90#1:199,6\n62#1:161\n64#1:162\n60#1:163\n60#1:164,8\n60#1:208\n60#1:172,6\n60#1:187,3\n60#1:196,2\n60#1:207\n60#1:178,9\n60#1:198\n60#1:205,2\n60#1:190,6\n*E\n"})
public final class C11171n {

    /* JADX INFO: renamed from: fg.n$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.ui.tv.profile.config.ConfigScreenTvKt$ConfigScreenTv$1$1", m18778f = "ConfigScreenTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f34764j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34764j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f34764j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f34764j);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: fg.n$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC1612g) this.receiver).mo2245d();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m13168a(final InterfaceC1612g interfaceC1612g, final InterfaceC17978p interfaceC17978p, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        InterfaceC15676n.a.C21235a c21235a;
        Function0 function0;
        InterfaceC15676n.a.C21235a c21235a2;
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2131634156);
        int i12 = (c15688rMo18372i.mo18362N(interfaceC1612g) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(interfaceC17978p) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 19) != 18)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a3 = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a3) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a3) {
                objMo18389z2 = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            final InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a3) {
                objMo18389z3 = new Function0() { // from class: fg.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Boolean bool = Boolean.FALSE;
                        interfaceC15701v0.setValue(bool);
                        interfaceC15701v1.setValue(bool);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            Function0 function1 = (Function0) objMo18389z3;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a3) {
                objMo18389z4 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z4;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (objMo18389z5 == c21235a3) {
                objMo18389z5 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z5);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z5);
            String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59719r0.getValue(), c15688rMo18372i, 0);
            Function0<Unit> function0Mo2242a = interfaceC1612g.mo2242a();
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(aVar, c0173b);
            C18036t c18036tM20404c = C18037u.m20404c(-265872345, new Function2() { // from class: fg.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1612g interfaceC1612g2;
                    InterfaceC7507e.a aVar2;
                    int i13;
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7481f.m8515h(aVar3, 0.0f, 8, 0.0f, 0.0f, 13), "test_tag_profile_config");
                        C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(12), InterfaceC18861d.a.f58759m, interfaceC15676n2, 6);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i14 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, interfaceC15676n2);
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
                        C15623T1.m18280a(c2036xM2689a, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                        InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i14))) {
                            C1961V0.m2622a(i14, interfaceC15676n2, i14, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                        InterfaceC1612g interfaceC1612g3 = interfaceC1612g;
                        if (interfaceC1612g3.mo2248g()) {
                            interfaceC15676n2.mo18363O(-884518126);
                            interfaceC1612g2 = interfaceC1612g3;
                            aVar2 = aVar3;
                            i13 = 0;
                            C15496Z.m18124a(null, C16973X.m19466e((C16972W) C19101C4.f59695f0.getValue(), interfaceC15676n2, 0), 0L, null, null, null, 0L, null, C4601b.m5206a(), interfaceC1612g3.mo2244c(), false, interfaceC15676n2, 0, 0, 1277);
                            interfaceC15676n2.mo18357I();
                        } else {
                            interfaceC1612g2 = interfaceC1612g3;
                            aVar2 = aVar3;
                            i13 = 0;
                            interfaceC15676n2.mo18363O(-884273071);
                            interfaceC15676n2.mo18357I();
                        }
                        C15496Z.m18124a(null, C16973X.m19466e((C16972W) C19285c2.f60066S.getValue(), interfaceC15676n2, i13), 0L, null, null, null, 0L, null, C4601b.m5220o(), interfaceC1612g2.mo2246e(), false, interfaceC15676n2, 0, 0, 1277);
                        C15496Z.m18124a(null, C16973X.m19466e((C16972W) C19285c2.f60068T.getValue(), interfaceC15676n2, i13), 0L, null, null, null, 0L, null, C4601b.m5220o(), interfaceC1612g2.mo2243b(), false, interfaceC15676n2, 0, 0, 1277);
                        InterfaceC7507e interfaceC7507eM8700a2 = C7586d.m8700a(aVar2, "test_tag_log_out");
                        String strM19466e2 = C16973X.m19466e((C16972W) C19278b3.f59970U.getValue(), interfaceC15676n2, i13);
                        C4600a c4600a = new C4600a((C16987h) C19097C0.f59631x0.getValue(), null);
                        Object objMo18389z6 = interfaceC15676n2.mo18389z();
                        if (objMo18389z6 == InterfaceC15676n.a.f50781a) {
                            objMo18389z6 = new C1848y(interfaceC15701v0, 2);
                            interfaceC15676n2.mo18380q(objMo18389z6);
                        }
                        C15496Z.m18124a(interfaceC7507eM8700a2, strM19466e2, 0L, null, null, null, 0L, null, c4600a, (Function0) objMo18389z6, false, interfaceC15676n2, 805306374, 0, 1276);
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i);
            boolean z10 = false;
            C15536p0.m18135a(strM19466e, function0Mo2242a, null, false, interfaceC7507eM8578a, null, null, c18036tM20404c, c15688rMo18372i, 100663296, 220);
            c15688r = c15688rMo18372i;
            if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                c15688r.mo18363O(1875232809);
                InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(aVar, "test_tag_dialog_log_out");
                boolean z11 = (i12 & 14) == 4;
                Object objMo18389z6 = c15688r.mo18389z();
                if (z11 || objMo18389z6 == c21235a3) {
                    c21235a2 = c21235a3;
                    i11 = 0;
                    b bVar = new b(0, interfaceC1612g, InterfaceC1612g.class, "logout", "logout()V", 0);
                    c15688r.mo18380q(bVar);
                    objMo18389z6 = bVar;
                } else {
                    c21235a2 = c21235a3;
                    i11 = 0;
                }
                Function0 function2 = (Function0) ((KFunction) objMo18389z6);
                c21235a = c21235a2;
                function0 = function1;
                z10 = false;
                C6606l.m7412c(interfaceC7507eM8700a, C16973X.m19466e((C16972W) C19278b3.f59975X.getValue(), c15688r, i11), C16973X.m19466e((C16972W) C19278b3.f59974W.getValue(), c15688r, i11), C16973X.m19466e((C16972W) C19278b3.f59968T.getValue(), c15688r, i11), C16973X.m19466e((C16972W) C19285c2.f60056N.getValue(), c15688r, i11), function2, function0, c15688r, 1572870, 0);
                c15688r = c15688r;
                c15688r.m18410W(false);
            } else {
                c21235a = c21235a3;
                function0 = function1;
                c15688r.mo18363O(1875643342);
                c15688r.m18410W(false);
            }
            if (((Boolean) interfaceC15701v1.getValue()).booleanValue()) {
                c15688r.mo18363O(1875694864);
                String strMo20332f = interfaceC17978p.mo20332f("deleteProfileDialogTitle");
                String strMo20332f2 = interfaceC17978p.mo20332f("deleteProfileDialogDescription");
                String strMo20332f3 = interfaceC17978p.mo20332f("delete");
                String strMo20332f4 = interfaceC17978p.mo20332f("cancel");
                Object objMo18389z7 = c15688r.mo18389z();
                if (objMo18389z7 == c21235a) {
                    objMo18389z7 = new C11169l(0);
                    c15688r.mo18380q(objMo18389z7);
                }
                C15688r c15688r2 = c15688r;
                C6606l.m7412c(null, strMo20332f, strMo20332f2, strMo20332f3, strMo20332f4, (Function0) objMo18389z7, function0, c15688r2, 1769472, 1);
                c15688r = c15688r2;
                c15688r.m18410W(z10);
            } else {
                c15688r.mo18363O(1876031214);
                c15688r.m18410W(z10);
            }
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(interfaceC17978p, i10) { // from class: fg.m

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC17978p f34763c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11171n.m13168a(this.f34762b, this.f34763c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
