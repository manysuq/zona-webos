package kg;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p055D0.AbstractC0984e0;
import p055D0.C0946M0;
import p124Gf.InterfaceC1874b;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3376c;
import p269Og.C3996h;
import p269Og.C4013t;
import p338Sd.InterfaceC4901a;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
import p579h0.C11658o0;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p776s1.C18050h;
import p830w0.InterfaceC18861d;
import p845wg.C19285c2;

/* JADX INFO: renamed from: kg.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUpdateProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateProgress.kt\nru/zona/app/ui/update/UpdateProgressKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,89:1\n87#2:90\n84#2,9:91\n94#2:143\n80#3,6:100\n87#3,3:115\n90#3,2:124\n94#3:142\n391#4,9:106\n400#4:126\n401#4,2:140\n4360#5,6:118\n113#6:127\n1282#7,6:128\n1282#7,6:134\n*S KotlinDebug\n*F\n+ 1 UpdateProgress.kt\nru/zona/app/ui/update/UpdateProgressKt\n*L\n48#1:90\n48#1:91,9\n48#1:143\n48#1:100,6\n48#1:115,3\n48#1:124,2\n48#1:142\n48#1:106,9\n48#1:126\n48#1:140,2\n48#1:118,6\n55#1:127\n50#1:128,6\n56#1:134,6\n*E\n"})
public final class C15881d {

    /* JADX INFO: renamed from: a */
    public static final Lazy f51478a = LazyKt.lazy(new C4013t(1));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m18675a(final InterfaceC4901a interfaceC4901a, C16972W c16972w, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        int i12;
        C16972W c16972w2;
        final C16972W c16972w3;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1908467581);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c15688rMo18372i.mo18362N(interfaceC4901a) : c15688rMo18372i.mo18350B(interfaceC4901a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                c16972w2 = c16972w;
                int i13 = c15688rMo18372i.mo18362N(c16972w2) ? 32 : 16;
                i12 |= i13;
            } else {
                c16972w2 = c16972w;
            }
            i12 |= i13;
        } else {
            c16972w2 = c16972w;
        }
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 19) != 18)) {
            c15688rMo18372i.m18436z0();
            if ((i10 & 1) != 0 && !c15688rMo18372i.m18420g0()) {
                c15688rMo18372i.mo18356H();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                c16972w2 = (C16972W) C19285c2.f60041F0.getValue();
                i12 &= -113;
            }
            int i14 = i12;
            c16972w3 = c16972w2;
            c15688rMo18372i.m18411X();
            final InterfaceC1874b.a aVar = ((InterfaceC4901a.a) C15585G1.m18246a(interfaceC4901a.getState(), c15688rMo18372i, 0).getValue()).f16385a;
            if (aVar instanceof InterfaceC1874b.a.b) {
                c15688rMo18372i.mo18363O(-966936239);
                InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar2, 1.0f);
                C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
                long j10 = c15688rMo18372i.f50813T;
                int i15 = (int) (j10 ^ (j10 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
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
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                    C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                long j11 = C3376c.f10957r;
                long j12 = C3376c.f10942c;
                InterfaceC7507e interfaceC7507eM8487b = C7468a.m8487b(C7482g.m8518c(aVar2, 1.0f), j12, C0946M0.f3382a);
                float f10 = 0;
                boolean zMo18350B = c15688rMo18372i.mo18350B(aVar);
                Object objMo18389z = c15688rMo18372i.mo18389z();
                InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                if (zMo18350B || objMo18389z == c21235a) {
                    objMo18389z = new Function0() { // from class: kg.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(((InterfaceC1874b.a.b) aVar).f6345b * 0.01f);
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                Function0 function0 = (Function0) objMo18389z;
                Object objMo18389z2 = c15688rMo18372i.mo18389z();
                if (objMo18389z2 == c21235a) {
                    objMo18389z2 = new C3996h(1);
                    c15688rMo18372i.mo18380q(objMo18389z2);
                }
                C11658o0.m13517b(function0, interfaceC7507eM8487b, j11, j12, 0, f10, (Function1) objMo18389z2, c15688rMo18372i, 1769472);
                C11565Q2.m13480b(C16973X.m19466e(c16972w3, c15688rMo18372i, (i14 >> 3) & 14) + " " + ((InterfaceC1874b.a.b) aVar).f6345b + "%...", C7468a.m8486a(C7482g.m8518c(aVar2, 1.0f), (AbstractC0984e0) f51478a.getValue(), null, 6), C3376c.f10951l, 0L, null, 0L, new C18050h(3), 0L, 0, false, 1, 0, null, null, c15688rMo18372i, 0, 24576, 244728);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-966051158);
                c15688rMo18372i.m18410W(false);
            }
        } else {
            c15688rMo18372i.mo18356H();
            c16972w3 = c16972w2;
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: kg.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C15881d.m18675a(interfaceC4901a, c16972w3, (InterfaceC15676n) obj, iM18294a, i11);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m18676b(final InterfaceC4901a interfaceC4901a, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-2083409756);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c15688rMo18372i.mo18362N(interfaceC4901a) : c15688rMo18372i.mo18350B(interfaceC4901a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC1874b.a aVar = ((InterfaceC4901a.a) C15585G1.m18246a(interfaceC4901a.getState(), c15688rMo18372i, 0).getValue()).f16385a;
            if (aVar instanceof InterfaceC1874b.a.b) {
                c15688rMo18372i.mo18363O(-1591818777);
                C11565Q2.m13480b(((InterfaceC1874b.a.b) aVar).f6345b + "%", C7468a.m8486a(C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f), (AbstractC0984e0) f51478a.getValue(), null, 6), C3376c.f10951l, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, null, c15688rMo18372i, 0, 0, 261112);
                c15688r = c15688rMo18372i;
                c15688r.m18410W(false);
            } else {
                c15688r = c15688rMo18372i;
                c15688r.mo18363O(-1591520557);
                c15688r.m18410W(false);
            }
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: kg.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    C15881d.m18676b(interfaceC4901a, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
