package p430Xf;

import androidx.compose.foundation.layout.C7480e;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import ch.C8484c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mg.C17040c;
import org.conscrypt.PSKKeyManager;
import p001A0.C0009h;
import p126H.C2000k;
import p214Lf.C3376c;
import p270P.C4025f;
import p304Qf.C4601b;
import p361U0.InterfaceC5178F;
import p361U0.InterfaceC5208f;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11569S;
import p607i9.C12269M6;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p689mb.C16999t;
import p817v1.C18566h;
import p817v1.C18568j;
import p830w0.InterfaceC18861d;
import p845wg.C19097C0;
import p845wg.C19101C4;
import p881z.C20576b0;

/* JADX INFO: renamed from: Xf.G */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserAva.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAva.kt\nru/zona/app/ui/profile/UserAvaKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,74:1\n113#2:75\n113#2:112\n113#2:113\n113#2:114\n70#3:76\n68#3,8:77\n77#3:118\n80#4,6:85\n87#4,3:100\n90#4,2:109\n94#4:117\n391#5,9:91\n400#5:111\n401#5,2:115\n4360#6,6:103\n*S KotlinDebug\n*F\n+ 1 UserAva.kt\nru/zona/app/ui/profile/UserAvaKt\n*L\n34#1:75\n54#1:112\n67#1:113\n68#1:114\n36#1:76\n36#1:77,8\n36#1:118\n36#1:85,6\n36#1:100,3\n36#1:109,2\n36#1:117\n36#1:91,9\n36#1:111\n36#1:115,2\n36#1:103,6\n*E\n"})
public final class C6329G {
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x016f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0180  */
    /* JADX WARN: Code duplicated, block: B:53:0x018b  */
    /* JADX WARN: Code duplicated, block: B:54:0x019a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m7122a(final C8484c c8484c, final boolean z10, long j10, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        long jM20999a;
        boolean z11;
        final long j11;
        C15634Y0 c15634y0M18412Y;
        Function2<? super InterfaceC15676n, ? super Integer, Unit> function2;
        final long j12;
        InterfaceC7507e.a aVar;
        int i12;
        C5753J.a aVar2;
        InterfaceC5799g.a.C21098a c21098a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-190411436);
        int iM18418e0 = c15688rMo18372i.m18418e0();
        int i13 = (c15688rMo18372i.mo18350B(c8484c) ? 4 : 2) | i10 | (c15688rMo18372i.mo18364a(z10) ? 32 : 16);
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 384) == 0) {
                jM20999a = j10;
                i13 |= c15688rMo18372i.mo18369f(jM20999a) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i13 & 147) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c15688rMo18372i.mo18379p(i13 & 1, z11)) {
                if (i14 != 0) {
                    float f10 = 64;
                    jM20999a = C18566h.m20999a(f10, f10);
                }
                j12 = jM20999a;
                FillElement fillElement = C7482g.f24342a;
                float fM21001b = C18568j.m21001b(j12);
                float fM21000a = C18568j.m21000a(j12);
                aVar = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8526k = C7482g.m8526k(aVar, fM21001b, fM21000a);
                InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58749c, false);
                long j13 = c15688rMo18372i.f50813T;
                i12 = (int) (j13 ^ (j13 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8526k, c15688rMo18372i);
                InterfaceC5799g.f19145s1.getClass();
                aVar2 = InterfaceC5799g.a.f19147b;
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, InterfaceC5799g.a.f19152g);
                C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
                c21098a = InterfaceC5799g.a.f19154i;
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                    C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                c15688rMo18372i.mo18363O(227886067);
                if (StringsKt.isBlank(c8484c.f29037b)) {
                    c15688rMo18372i.mo18363O(227882315);
                    C11569S.m13483b(C4601b.m5226u().m5204a(c15688rMo18372i), null, C7482g.m8517b(aVar, 1.0f), C3376c.f10951l, c15688rMo18372i, 432, 0);
                    c15688rMo18372i.m18415b0(iM18418e0);
                    c15634y0M18412Y = c15688rMo18372i.m18412Y();
                    if (c15634y0M18412Y != null) {
                        return;
                    } else {
                        function2 = new Function2() { // from class: Xf.E
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                C6329G.m7122a(c8484c, z10, j12, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1), i11);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                } else {
                    c15688rMo18372i.mo18363O(228125448);
                    c15688rMo18372i.m18410W(false);
                    C17040c.m19494a(C0009h.m22a(C7482g.m8517b(aVar, 1.0f), C4025f.m4709b(4)), c8484c.f29038c, null, InterfaceC5208f.a.f17030a, false, 0.0f, C6331b.f20762a, c15688rMo18372i, 1575936, 52);
                    if (z10) {
                        c15688rMo18372i.mo18363O(228693957);
                        C20576b0.m25170a(C16999t.m19472a((C16987h) C19097C0.f59571R0.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19101C4.f59695f0.getValue(), c15688rMo18372i, 0), C7480e.m8506b(C7482g.m8525j(aVar, 24), 12, -12), null, null, 0.0f, null, c15688rMo18372i, 384, 120);
                        c15688rMo18372i.m18410W(false);
                    } else {
                        c15688rMo18372i.mo18363O(228983528);
                        c15688rMo18372i.m18410W(false);
                    }
                    c15688rMo18372i.m18410W(false);
                    c15688rMo18372i.m18410W(true);
                    j11 = j12;
                }
                c15634y0M18412Y.f50634d = function2;
            }
            c15688rMo18372i.mo18356H();
            j11 = jM20999a;
            c15634y0M18412Y = c15688rMo18372i.m18412Y();
            if (c15634y0M18412Y != null) {
                function2 = new Function2() { // from class: Xf.F
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        C6329G.m7122a(c8484c, z10, j11, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1), i11);
                        return Unit.INSTANCE;
                    }
                };
                c15634y0M18412Y.f50634d = function2;
            }
        }
        i13 |= 384;
        jM20999a = j10;
        if ((i13 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c15688rMo18372i.mo18379p(i13 & 1, z11)) {
            if (i14 != 0) {
                float f11 = 64;
                jM20999a = C18566h.m20999a(f11, f11);
            }
            j12 = jM20999a;
            FillElement fillElement2 = C7482g.f24342a;
            float fM21001b2 = C18568j.m21001b(j12);
            float fM21000a2 = C18568j.m21000a(j12);
            aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8526k2 = C7482g.m8526k(aVar, fM21001b2, fM21000a2);
            InterfaceC5178F interfaceC5178FM2677d2 = C2000k.m2677d(InterfaceC18861d.a.f58749c, false);
            long j14 = c15688rMo18372i.f50813T;
            i12 = (int) (j14 ^ (j14 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8526k2, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d2, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            } else {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            c15688rMo18372i.mo18363O(227886067);
            if (StringsKt.isBlank(c8484c.f29037b)) {
                c15688rMo18372i.mo18363O(227882315);
                C11569S.m13483b(C4601b.m5226u().m5204a(c15688rMo18372i), null, C7482g.m8517b(aVar, 1.0f), C3376c.f10951l, c15688rMo18372i, 432, 0);
                c15688rMo18372i.m18415b0(iM18418e0);
                c15634y0M18412Y = c15688rMo18372i.m18412Y();
                if (c15634y0M18412Y != null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: Xf.E
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            C6329G.m7122a(c8484c, z10, j12, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1), i11);
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                c15688rMo18372i.mo18363O(228125448);
                c15688rMo18372i.m18410W(false);
                C17040c.m19494a(C0009h.m22a(C7482g.m8517b(aVar, 1.0f), C4025f.m4709b(4)), c8484c.f29038c, null, InterfaceC5208f.a.f17030a, false, 0.0f, C6331b.f20762a, c15688rMo18372i, 1575936, 52);
                if (z10) {
                    c15688rMo18372i.mo18363O(228693957);
                    C20576b0.m25170a(C16999t.m19472a((C16987h) C19097C0.f59571R0.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19101C4.f59695f0.getValue(), c15688rMo18372i, 0), C7480e.m8506b(C7482g.m8525j(aVar, 24), 12, -12), null, null, 0.0f, null, c15688rMo18372i, 384, 120);
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(228983528);
                    c15688rMo18372i.m18410W(false);
                }
                c15688rMo18372i.m18410W(false);
                c15688rMo18372i.m18410W(true);
                j11 = j12;
            }
            c15634y0M18412Y.f50634d = function2;
        }
        c15688rMo18372i.mo18356H();
        j11 = jM20999a;
        c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            function2 = new Function2() { // from class: Xf.F
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C6329G.m7122a(c8484c, z10, j11, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1), i11);
                    return Unit.INSTANCE;
                }
            };
            c15634y0M18412Y.f50634d = function2;
        }
    }
}
