package kg;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import p124Gf.InterfaceC1874b;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19278b3;

/* JADX INFO: renamed from: kg.o */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVersionTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionTable.kt\nru/zona/app/ui/update/VersionTableKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,64:1\n113#2:65\n113#2:103\n99#3:66\n96#3,9:67\n106#3:190\n80#4,6:76\n87#4,3:91\n90#4,2:100\n80#4,6:114\n87#4,3:129\n90#4,2:138\n94#4:143\n80#4,6:156\n87#4,3:171\n90#4,2:180\n94#4:185\n94#4:189\n391#5,9:82\n400#5:102\n391#5,9:120\n400#5,3:140\n391#5,9:162\n400#5,3:182\n401#5,2:187\n4360#6,6:94\n4360#6,6:132\n4360#6,6:174\n87#7:104\n84#7,9:105\n94#7:144\n87#7:145\n83#7,10:146\n94#7:186\n*S KotlinDebug\n*F\n+ 1 VersionTable.kt\nru/zona/app/ui/update/VersionTableKt\n*L\n24#1:65\n42#1:103\n41#1:66\n41#1:67,9\n41#1:190\n41#1:76,6\n41#1:91,3\n41#1:100,2\n42#1:114,6\n42#1:129,3\n42#1:138,2\n42#1:143\n52#1:156,6\n52#1:171,3\n52#1:180,2\n52#1:185\n41#1:189\n41#1:82,9\n41#1:102\n42#1:120,9\n42#1:140,3\n52#1:162,9\n52#1:182,3\n41#1:187,2\n41#1:94,6\n42#1:132,6\n52#1:174,6\n42#1:104\n42#1:105,9\n42#1:144\n52#1:145\n52#1:146,10\n52#1:186\n*E\n"})
public final class C15892o {
    /* JADX INFO: renamed from: a */
    public static final void m18681a(final InterfaceC7507e interfaceC7507e, final InterfaceC1874b.a.c cVar, C11732N0 c11732n0, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        InterfaceC5799g.a.C21098a c21098a;
        final C11732N0 c11732n1 = c11732n0;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(417876337);
        int i11 = i10 | (c15688rMo18372i.mo18350B(cVar) ? 32 : 16) | (c15688rMo18372i.mo18362N(c11732n1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            cVar.getClass();
            String str = cVar.f6346a;
            if (str.length() > 0) {
                c15688rMo18372i.mo18363O(2138893705);
                C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
                long j10 = c15688rMo18372i.f50813T;
                int i12 = (int) (j10 ^ (j10 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507e, c15688rMo18372i);
                InterfaceC5799g.f19145s1.getClass();
                C5753J.a aVar = InterfaceC5799g.a.f19147b;
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
                C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
                InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
                C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
                InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                    C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a2);
                }
                InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar2, 0.0f, 0.0f, 10, 0.0f, 11);
                C1982e.k kVar = C1982e.f6639c;
                C18863f.a aVar3 = InterfaceC18861d.a.f58759m;
                C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar3, c15688rMo18372i, 0);
                long j11 = c15688rMo18372i.f50813T;
                int i13 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                    c21098a = c21098a2;
                    C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
                } else {
                    c21098a = c21098a2;
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                int i14 = (i11 << 15) & 29360128;
                InterfaceC5799g.a.C21098a c21098a3 = c21098a;
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59704k.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, i14, 131070);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59945H0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, i14, 131070);
                c15688rMo18372i.m18410W(true);
                C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar3, c15688rMo18372i, 0);
                long j12 = c15688rMo18372i.f50813T;
                int i15 = (int) (j12 ^ (j12 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar2, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                    C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a3);
                }
                C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
                C11565Q2.m13480b("3.0.65", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, i14, 131070);
                C11565Q2.m13480b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, i14, 131070);
                c11732n1 = c11732n0;
                c15688r = c15688rMo18372i;
                c15688r.m18410W(true);
                c15688r.m18410W(true);
                c15688r.m18410W(false);
            } else {
                c15688r = c15688rMo18372i;
                c15688r.mo18363O(2139577937);
                c15688r.m18410W(false);
            }
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(cVar, c11732n1, i10) { // from class: kg.n

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC1874b.a.c f51493c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C11732N0 f51494d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(7);
                    C15892o.m18681a(this.f51492b, this.f51493c, this.f51494d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
