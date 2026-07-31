package p412Wf;

import af.C7310c;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.ranges.RangesKt;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p125Gg.EnumC1896d;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p144I.C2192a;
import p163J0.C2431d;
import p192Kb.InterfaceC2930N;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p214Lf.C3378e;
import p250Nf.C3765d;
import p270P.C4025f;
import p304Qf.C4601b;
import p358Tf.C5077O;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11565Q2;
import p579h0.C11569S;
import p579h0.C11662p0;
import p579h0.C11666q0;
import p579h0.C11678t0;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p664l1.C16318q;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p689mb.C16999t;
import p830w0.InterfaceC18861d;
import p845wg.C19097C0;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p881z.C20576b0;

/* JADX INFO: renamed from: Wf.I */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStreamViewM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamViewM.kt\nru/zona/app/ui/player/settings/StreamViewMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,141:1\n1282#2,6:142\n1282#2,6:191\n1282#2,6:200\n113#3:148\n113#3:156\n113#3:190\n113#3:198\n113#3:199\n113#3:210\n113#3:211\n113#3:212\n15#4,7:149\n99#5,6:157\n106#5:209\n80#6,6:163\n87#6,3:178\n90#6,2:187\n94#6:208\n391#7,9:169\n400#7:189\n401#7,2:206\n4360#8,6:181\n75#9:197\n*S KotlinDebug\n*F\n+ 1 StreamViewM.kt\nru/zona/app/ui/player/settings/StreamViewMKt\n*L\n66#1:142,6\n92#1:191,6\n119#1:200,6\n81#1:148\n87#1:156\n90#1:190\n117#1:198\n118#1:199\n134#1:210\n135#1:211\n136#1:212\n82#1:149,7\n78#1:157,6\n78#1:209\n78#1:163,6\n78#1:178,3\n78#1:187,2\n78#1:208\n78#1:169,9\n78#1:189\n78#1:206,2\n78#1:181,6\n114#1:197\n*E\n"})
public final class C5958I {
    /* JADX INFO: renamed from: a */
    public static final void m6823a(final String str, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1452167503);
        int i11 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            C16987h c16987hM8145a = C7310c.m8145a(str);
            if (c16987hM8145a == null) {
                c15688rMo18372i.mo18363O(1683556394);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1683556395);
                C20576b0.m25171b(C16999t.m19473b(c16987hM8145a, c15688rMo18372i, 0), C0009h.m22a(C7482g.m8529n(C7482g.m8519d(InterfaceC7507e.a.f24548b, 15), 20), C4025f.m4709b(2)), null, c15688rMo18372i, 48, 120);
                c15688rMo18372i.m18410W(false);
            }
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, i10) { // from class: Wf.F

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f19739b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5958I.m6823a(this.f19739b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6824b(InterfaceC7507e interfaceC7507e, final InterfaceC2930N interfaceC2930N, final boolean z10, final Function1 function1, final Function1 function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        InterfaceC7507e interfaceC7507e2;
        boolean z11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1070082222);
        int i11 = i10 | 6 | (c15688rMo18372i.mo18362N(interfaceC2930N) ? 32 : 16) | (c15688rMo18372i.mo18364a(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 9363) != 9362)) {
            long j10 = z10 ? C3376c.f10957r : C3376c.f10951l;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(C7481f.m8513f(C7482g.m8518c(aVar, 1.0f), 0.0f, 16, 1), C6138n1.f20157a, new C5957H(function1, interfaceC2930N));
            if (interfaceC2930N.mo3655a().f9661g.isEmpty()) {
                c15688rMo18372i.mo18363O(552068856);
            } else {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(-768721577);
                interfaceC7507eM8564a = C7586d.m8700a(interfaceC7507eM8564a, "test_tag_stream_with_subtitle_title");
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(false);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(8), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j11 = c15688rMo18372i.f50813T;
            int i12 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8564a, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            float f10 = 20;
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7482g.m8525j(aVar, f10), 2);
            long j12 = C3376c.f10957r;
            long j13 = C3376c.f10951l;
            C11662p0 c11662p0M13520a = C11666q0.m13520a(j12, j13, c15688rMo18372i);
            int i13 = i11 & 112;
            boolean z12 = ((i11 & 7168) == 2048) | (i13 == 32);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (z12 || objMo18389z == c21235a) {
                objMo18389z = new Function0() { // from class: Wf.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(interfaceC2930N);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            C11678t0.m13537a(z10, (Function0) objMo18389z, interfaceC7507eM8511d, false, c11662p0M13520a, c15688rMo18372i, ((i11 >> 6) & 14) | 384);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            C11565Q2.m13481c(C5077O.m5594b(interfaceC2930N.mo3655a(), j10, C16973X.m19466e((C16972W) C19140H5.f59798B0.getValue(), c15688rMo18372i, 0)), new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), false), 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, C11732N0.m13585a(C3374a.f10912g, j10, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 24960, 241660);
            c15688r = c15688rMo18372i;
            m6823a(interfaceC2930N.mo3655a().f9658d, c15688r, 0);
            if (interfaceC2930N.mo3655a().f9661g.isEmpty()) {
                c15688r.mo18363O(936144112);
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(935850046);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59664O.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3378e.f10971a, z10 ? j12 : C3376c.f10947h, 0L, new C16318q(700), null, 0L, null, 0L, null, null, 16777210), c15688r, 0, 0, 131070);
                c15688r = c15688r;
                c15688r.m18410W(false);
            }
            if (function2 == null) {
                c15688r.mo18363O(936179234);
                c15688r.m18410W(false);
                interfaceC7507e2 = aVar;
            } else {
                c15688r.mo18363O(936179235);
                if (interfaceC2930N.mo3655a().f9668n.length() > 0) {
                    c15688r.mo18363O(-1611472594);
                    z11 = c15688r.mo18383t(C3765d.f12328a) != EnumC1896d.Tv;
                    c15688r.m18410W(false);
                } else {
                    c15688r.mo18363O(1583958375);
                    c15688r.m18410W(false);
                    z11 = false;
                }
                if (z11) {
                    c15688r.mo18363O(1584026735);
                    interfaceC7507e2 = aVar;
                    InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(C7481f.m8515h(interfaceC7507e2, 12, 0.0f, 0.0f, 0.0f, 14), f10);
                    boolean z13 = (i13 == 32) | ((i11 & 57344) == 16384);
                    Object objMo18389z2 = c15688r.mo18389z();
                    if (z13 || objMo18389z2 == c21235a) {
                        objMo18389z2 = new Function0() { // from class: Wf.D
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function2.invoke(interfaceC2930N);
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r.mo18380q(objMo18389z2);
                    }
                    InterfaceC7507e interfaceC7507eM8490c = C7470c.m8490c(15, interfaceC7507eM8525j, null, (Function0) objMo18389z2, false);
                    C2431d c2431d = C4601b.f15461a;
                    C16987h c16987h = (C16987h) C19097C0.f59568Q.getValue();
                    c15688r.mo18363O(279895816);
                    C2431d c2431dM19473b = C16999t.m19473b(c16987h, c15688r, 0);
                    c15688r.mo18357I();
                    C15688r c15688r2 = c15688r;
                    C11569S.m13483b(c2431dM19473b, null, interfaceC7507eM8490c, j13, c15688r2, 48, 0);
                    c15688r = c15688r2;
                    c15688r.m18410W(false);
                } else {
                    interfaceC7507e2 = aVar;
                    c15688r.mo18363O(1584391388);
                    c15688r.m18410W(false);
                }
                Unit unit = Unit.INSTANCE;
                c15688r.m18410W(false);
            }
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
            interfaceC7507e2 = interfaceC7507e;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            final InterfaceC7507e interfaceC7507e3 = interfaceC7507e2;
            c15634y0M18412Y.f50634d = new Function2(interfaceC2930N, z10, function1, function2, i10) { // from class: Wf.E

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC2930N f19735c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f19736d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function1 f19737e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function1 f19738f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5958I.m6824b(this.f19734b, this.f19735c, this.f19736d, this.f19737e, this.f19738f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
