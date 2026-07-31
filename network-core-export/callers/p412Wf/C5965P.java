package p412Wf;

import af.C7310c;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import ne.C17229w;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p001A0.C0009h;
import p019B0.InterfaceC0179H;
import p055D0.C0955R0;
import p055D0.C0998l0;
import p090F.C1458k;
import p090F.InterfaceC1457j;
import p125Gg.EnumC1896d;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p144I.C2192a;
import p163J0.C2431d;
import p192Kb.C2926J;
import p192Kb.InterfaceC2930N;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p250Nf.C3765d;
import p270P.C4025f;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
import p579h0.C11569S;
import p579h0.C11662p0;
import p579h0.C11666q0;
import p579h0.C11678t0;
import p580h1.C11732N0;
import p580h1.C11752c;
import p580h1.C11795x0;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
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
import p689mb.C16987h;
import p689mb.C16999t;
import p706o1.C17285d;
import p776s1.C18043a;
import p776s1.C18051i;
import p776s1.C18056n;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19097C0;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p881z.C20576b0;

/* JADX INFO: renamed from: Wf.P */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStreamViewTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamViewTv.kt\nru/zona/app/ui/player/settings/StreamViewTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,161:1\n1282#2,6:162\n1282#2,6:168\n1282#2,6:174\n1282#2,6:180\n1282#2,6:186\n1282#2,6:228\n1282#2,6:244\n113#3:192\n113#3:193\n113#3:227\n113#3:242\n113#3:243\n113#3:254\n113#3:255\n113#3:256\n99#4,6:194\n106#4:253\n80#5,6:200\n87#5,3:215\n90#5,2:224\n94#5:252\n391#6,9:206\n400#6:226\n401#6,2:250\n4360#7,6:218\n1574#8:234\n1394#8,6:235\n75#9:241\n85#10:257\n117#10,2:258\n85#10:260\n*S KotlinDebug\n*F\n+ 1 StreamViewTv.kt\nru/zona/app/ui/player/settings/StreamViewTvKt\n*L\n63#1:162,6\n64#1:168,6\n79#1:174,6\n85#1:180,6\n83#1:186,6\n97#1:228,6\n139#1:244,6\n87#1:192\n92#1:193\n95#1:227\n137#1:242\n138#1:243\n154#1:254\n155#1:255\n156#1:256\n74#1:194,6\n74#1:253\n74#1:200,6\n74#1:215,3\n74#1:224,2\n74#1:252\n74#1:206,9\n74#1:226\n74#1:250,2\n74#1:218,6\n105#1:234\n107#1:235,6\n134#1:241\n63#1:257\n63#1:258,2\n64#1:260\n*E\n"})
public final class C5965P {
    /* JADX INFO: renamed from: a */
    public static final void m6825a(final String str, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2005222359);
        int i11 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            C16987h c16987hM8145a = C7310c.m8145a(str);
            if (c16987hM8145a == null) {
                c15688rMo18372i.mo18363O(1120889746);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1120889747);
                C20576b0.m25171b(C16999t.m19473b(c16987hM8145a, c15688rMo18372i, 0), C0009h.m22a(C7482g.m8529n(C7482g.m8519d(InterfaceC7507e.a.f24548b, 18), 24), C4025f.m4709b(4)), null, c15688rMo18372i, 48, 120);
                c15688rMo18372i.m18410W(false);
            }
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, i10) { // from class: Wf.O

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f19756b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5965P.m6825a(this.f19756b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m6826b(InterfaceC7507e interfaceC7507e, final InterfaceC2930N interfaceC2930N, final boolean z10, final Function1 function1, final Function1 function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        InterfaceC7507e interfaceC7507e2;
        long j10;
        Object objM19683a;
        boolean z11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1681548736);
        int i11 = i10 | 6 | (c15688rMo18372i.mo18362N(interfaceC2930N) ? 32 : 16) | (c15688rMo18372i.mo18364a(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 3072 | (c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT);
        if (c15688rMo18372i.mo18379p(i11 & 1, (74899 & i11) != 74898)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            boolean zMo18364a = ((i11 & 896) == 256) | c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18364a || objMo18389z2 == c21235a) {
                if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                    j10 = C3376c.f10957r;
                } else {
                    j10 = z10 ? C3376c.f10951l : C3376c.f10942c;
                }
                objM19683a = C17229w.m19683a(j10, c15688rMo18372i);
            } else {
                objM19683a = objMo18389z2;
            }
            InterfaceC15701v0 interfaceC15701v1 = (InterfaceC15701v0) objM19683a;
            c15688rMo18372i.mo18363O(552068856);
            c15688rMo18372i.m18410W(false);
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new Function1() { // from class: Wf.J
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC15701v0.setValue(Boolean.valueOf(((InterfaceC0179H) obj).mo236b()));
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8576a = C7510a.m8576a(aVar, (Function1) objMo18389z3);
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (objMo18389z4 == c21235a) {
                objMo18389z4 = new C1458k();
                c15688rMo18372i.mo18380q(objMo18389z4);
            }
            InterfaceC1457j interfaceC1457j = (InterfaceC1457j) objMo18389z4;
            int i12 = 57344 & i11;
            int i13 = i11 & 112;
            boolean z12 = (i12 == 16384) | (i13 == 32);
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (z12 || objMo18389z5 == c21235a) {
                objMo18389z5 = new Function0() { // from class: Wf.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(interfaceC2930N);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z5);
            }
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7470c.m8489b(interfaceC7507eM8576a, interfaceC1457j, null, false, null, (Function0) objMo18389z5, 28), 8);
            if (interfaceC2930N.mo3655a().f9661g.isEmpty()) {
                c15688rMo18372i.mo18363O(552068856);
            } else {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(2085914809);
                interfaceC7507eM8511d = C7586d.m8700a(interfaceC7507eM8511d, "test_tag_stream_with_subtitle_title");
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(false);
            float f10 = 12;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(f10), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j11 = c15688rMo18372i.f50813T;
            int i14 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC7507e interfaceC7507eM8511d2 = C7481f.m8511d(C7482g.m8525j(aVar, 16), 2);
            C11662p0 c11662p0M13520a = C11666q0.m13520a(((C0998l0) interfaceC15701v1.getValue()).f3476a, ((C0998l0) interfaceC15701v1.getValue()).f3476a, c15688rMo18372i);
            boolean z13 = (i12 == 16384) | (i13 == 32);
            Object objMo18389z6 = c15688rMo18372i.mo18389z();
            if (z13 || objMo18389z6 == c21235a) {
                objMo18389z6 = new Function0() { // from class: Wf.L
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(interfaceC2930N);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z6);
            }
            C11678t0.m13537a(z10, (Function0) objMo18389z6, interfaceC7507eM8511d2, false, c11662p0M13520a, c15688rMo18372i, ((i11 >> 6) & 14) | 384);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), false);
            c15688rMo18372i.mo18363O(972996593);
            C11752c.b bVar = new C11752c.b();
            C2926J c2926jMo3655a = interfaceC2930N.mo3655a();
            String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59798B0.getValue(), c15688rMo18372i, 0);
            String str = c2926jMo3655a.f9657c;
            if (StringsKt.isBlank(str)) {
                str = c2926jMo3655a.f9658d;
            }
            if (!StringsKt.isBlank(str)) {
                strM19466e = str;
            }
            bVar.m13609e(strM19466e);
            int iM13613i = bVar.m13613i(new C11795x0(((C0998l0) interfaceC15701v1.getValue()).f3476a, C18580v.m21028b(10), (C16318q) null, (C16316o) null, (C16317p) null, (AbstractC16308g) null, (String) null, 0L, new C18043a(0.5f), (C18056n) null, (C17285d) null, 0L, (C18051i) null, (C0955R0) null, 65276));
            try {
                bVar.m13609e(" ");
                bVar.m13609e(String.valueOf(interfaceC2930N.mo3655a().f9655a.f9785b));
                Unit unit = Unit.INSTANCE;
                bVar.m13611g(iM13613i);
                C11752c c11752cM13614j = bVar.m13614j();
                c15688rMo18372i.m18410W(false);
                C11732N0 c11732n0 = C3375b.f10927j;
                interfaceC7507e2 = aVar;
                C11565Q2.m13481c(c11752cM13614j, layoutWeightElement, 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, C11732N0.m13585a(c11732n0, ((C0998l0) interfaceC15701v1.getValue()).f3476a, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 24960, 241660);
                c15688r = c15688rMo18372i;
                m6825a(interfaceC2930N.mo3655a().f9658d, c15688r, 0);
                if (interfaceC2930N.mo3655a().f9661g.isEmpty()) {
                    c15688r.mo18363O(99185094);
                    c15688r.m18410W(false);
                } else {
                    c15688r.mo18363O(98923702);
                    C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59664O.getValue(), c15688r, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, ((C0998l0) interfaceC15701v1.getValue()).f3476a, 0L, new C16318q(700), null, 0L, null, 0L, null, null, 16777210), c15688r, 0, 0, 131070);
                    c15688r.m18410W(false);
                }
                if (function2 == null) {
                    c15688r = c15688r;
                    c15688r.mo18363O(99221208);
                    c15688r.m18410W(false);
                } else {
                    c15688r.mo18363O(99221209);
                    if (interfaceC2930N.mo3655a().f9668n.length() > 0) {
                        c15688r.mo18363O(1594156816);
                        if (c15688r.mo18383t(C3765d.f12328a) != EnumC1896d.Tv) {
                            c15688r = c15688r;
                            z11 = true;
                        } else {
                            c15688r = c15688r;
                            z11 = false;
                        }
                        c15688r.m18410W(false);
                    } else {
                        c15688r.mo18363O(-2120745019);
                        c15688r.m18410W(false);
                        z11 = false;
                    }
                    if (z11) {
                        c15688r = c15688r;
                        c15688r.mo18363O(-2120676659);
                        InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(C7481f.m8515h(interfaceC7507e2, f10, 0.0f, 0.0f, 0.0f, 14), 20);
                        boolean z14 = (i13 == 32) | ((i11 & 458752) == 131072);
                        Object objMo18389z7 = c15688r.mo18389z();
                        if (z14 || objMo18389z7 == c21235a) {
                            objMo18389z7 = new Function0() { // from class: Wf.M
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function2.invoke(interfaceC2930N);
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r.mo18380q(objMo18389z7);
                        }
                        InterfaceC7507e interfaceC7507eM8490c = C7470c.m8490c(15, interfaceC7507eM8525j, null, (Function0) objMo18389z7, false);
                        C2431d c2431d = C4601b.f15461a;
                        C16987h c16987h = (C16987h) C19097C0.f59568Q.getValue();
                        c15688r.mo18363O(279895816);
                        C2431d c2431dM19473b = C16999t.m19473b(c16987h, c15688r, 0);
                        c15688r.mo18357I();
                        C15688r c15688r2 = c15688r;
                        C11569S.m13483b(c2431dM19473b, null, interfaceC7507eM8490c, C3376c.f10951l, c15688r2, 48, 0);
                        c15688r = c15688r2;
                        c15688r.m18410W(false);
                    } else {
                        c15688r = c15688r;
                        c15688r.mo18363O(-2120312006);
                        c15688r.m18410W(false);
                    }
                    c15688r.m18410W(false);
                }
                c15688r.m18410W(true);
            } catch (Throwable th) {
                bVar.m13611g(iM13613i);
                throw th;
            }
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
            interfaceC7507e2 = interfaceC7507e;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            final InterfaceC7507e interfaceC7507e3 = interfaceC7507e2;
            c15634y0M18412Y.f50634d = new Function2(interfaceC2930N, z10, function1, function2, i10) { // from class: Wf.N

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC2930N f19752c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f19753d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function1 f19754e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function1 f19755f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C5965P.m6826b(this.f19751b, this.f19752c, this.f19753d, this.f19754e, this.f19755f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
