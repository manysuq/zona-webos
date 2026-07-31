package ye;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p033Be.C0431j;
import p055D0.C0946M0;
import p114G5.AbstractC1714b;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p168J5.C2468d;
import p214Lf.C3376c;
import p233Mg.C3561B;
import p294Q5.C4555a;
import p320Rd.InterfaceC4763a;
import p320Rd.InterfaceC4765c;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p607i9.C12269M6;
import p640jf.C15518g1;
import p640jf.C15548v0;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;
import p883z1.C20647J;
import p883z1.C20671l;

/* JADX INFO: renamed from: ye.v */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSortDialogTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortDialogTv.kt\nru/zona/app/screens/filters/SortDialogTvKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,80:1\n1282#2,6:81\n1282#2,6:125\n1282#2,6:172\n113#3:87\n113#3:131\n113#3:132\n113#3:178\n87#4:88\n84#4,9:89\n87#4:133\n84#4,9:134\n94#4:183\n94#4:187\n80#5,6:98\n87#5,3:113\n90#5,2:122\n80#5,6:143\n87#5,3:158\n90#5,2:167\n94#5:182\n94#5:186\n391#6,9:104\n400#6:124\n391#6,9:149\n400#6:169\n401#6,2:180\n401#6,2:184\n4360#7,6:116\n4360#7,6:161\n2077#8,2:170\n2079#8:179\n85#9:188\n85#9:189\n*S KotlinDebug\n*F\n+ 1 SortDialogTv.kt\nru/zona/app/screens/filters/SortDialogTvKt\n*L\n33#1:81,6\n57#1:125,6\n69#1:172,6\n53#1:87\n60#1:131\n62#1:132\n75#1:178\n49#1:88\n49#1:89,9\n62#1:133\n62#1:134,9\n62#1:183\n49#1:187\n49#1:98,6\n49#1:113,3\n49#1:122,2\n62#1:143,6\n62#1:158,3\n62#1:167,2\n62#1:182\n49#1:186\n49#1:104,9\n49#1:124\n62#1:149,9\n62#1:169\n62#1:180,2\n49#1:184,2\n49#1:116,6\n62#1:161,6\n64#1:170,2\n64#1:179\n30#1:188\n48#1:189\n*E\n"})
public final class C20504v {

    /* JADX INFO: renamed from: ye.v$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC4763a) this.receiver).dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m25112a(final InterfaceC4765c interfaceC4765c, InterfaceC15676n interfaceC15676n, final int i10) {
        InterfaceC15676n.a.C21235a c21235a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(412668555);
        int i11 = i10 | (c15688rMo18372i.mo18362N(interfaceC4765c) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC4765c.getState(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 20;
            float f11 = 8;
            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(C7468a.m8487b(C7482g.m8517b(aVar, 1.0f), C3376c.f10940a, C0946M0.f3382a), f10, f11, f10, 0.0f, 8);
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar2 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8515h, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59796A0.getValue(), c15688rMo18372i, 0);
            int i13 = i11 & 14;
            boolean z10 = i13 == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (z10 || objMo18389z == c21235a2) {
                objMo18389z = new Function0() { // from class: ye.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        interfaceC4765c.mo5354c();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            int i14 = i13;
            InterfaceC15676n.a.C21235a c21235a3 = c21235a2;
            C15518g1.m18129a(strM19466e, null, null, (Function0) objMo18389z, null, c15688rMo18372i, 0, 54);
            C1963W0.m2623a(C7482g.m8519d(aVar, 16), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(aVar, 56, 0.0f, 2);
            C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i15 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            c15688rMo18372i.mo18363O(1549944110);
            int i16 = 0;
            for (Iterator it = interfaceC4765c.getConfig().f15955b.iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final C3561B c3561b = (C3561B) next;
                String strM25107a = C20490h.m25107a(c3561b, c15688rMo18372i);
                boolean zAreEqual = Intrinsics.areEqual(((InterfaceC4765c.b) interfaceC15701v0M18246a.getValue()).f15957a.f11704a, c3561b.f11704a);
                int i18 = i14;
                boolean zMo18350B = (i18 == 4) | c15688rMo18372i.mo18350B(c3561b);
                Object objMo18389z2 = c15688rMo18372i.mo18389z();
                if (zMo18350B) {
                    c21235a = c21235a3;
                } else {
                    c21235a = c21235a3;
                    if (objMo18389z2 == c21235a) {
                    }
                    i14 = i18;
                    C15688r c15688r = c15688rMo18372i;
                    c21235a3 = c21235a;
                    InterfaceC7507e.a aVar4 = aVar;
                    float f12 = f11;
                    C15548v0.m18138a(null, strM25107a, zAreEqual, (Function0) objMo18389z2, false, 0.0f, 0.0f, 0L, 0L, null, 0.0f, c15688r, 24576, 4065);
                    c15688rMo18372i = c15688r;
                    C1963W0.m2623a(C7482g.m8519d(aVar4, f12), c15688rMo18372i);
                    aVar = aVar4;
                    f11 = f12;
                    i16 = i17;
                }
                objMo18389z2 = new Function0() { // from class: ye.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C3561B c3561b2 = c3561b;
                        InterfaceC4765c interfaceC4765c2 = interfaceC4765c;
                        interfaceC4765c2.mo5353b(c3561b2);
                        interfaceC4765c2.mo5352a();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
                i14 = i18;
                C15688r c15688r2 = c15688rMo18372i;
                c21235a3 = c21235a;
                InterfaceC7507e.a aVar5 = aVar;
                float f13 = f11;
                C15548v0.m18138a(null, strM25107a, zAreEqual, (Function0) objMo18389z2, false, 0.0f, 0.0f, 0L, 0L, null, 0.0f, c15688r2, 24576, 4065);
                c15688rMo18372i = c15688r2;
                C1963W0.m2623a(C7482g.m8519d(aVar5, f13), c15688rMo18372i);
                aVar = aVar5;
                f11 = f13;
                i16 = i17;
            }
            c15688rMo18372i.m18410W(false);
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: ye.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C20504v.m25112a(this.f70214b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m25113b(final InterfaceC4763a interfaceC4763a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-162782166);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC4763a) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            AbstractC1714b.a<C, T> aVar = ((C4555a) C2468d.m3195a(interfaceC4763a.mo5351b(), c15688rMo18372i, 0).getValue()).f15383a;
            InterfaceC4765c interfaceC4765c = aVar != 0 ? (InterfaceC4765c) aVar.f5802b : null;
            if (interfaceC4765c == null) {
                c15688rMo18372i.mo18363O(-425282871);
                c15688rMo18372i.m18410W(false);
                c15688r = c15688rMo18372i;
            } else {
                c15688rMo18372i.mo18363O(-425282870);
                boolean z10 = (i11 & 14) == 4;
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new a(0, interfaceC4763a, InterfaceC4763a.class, "dismiss", "dismiss()V", 0);
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                c15688r = c15688rMo18372i;
                C20671l.m25216a((Function0) ((KFunction) objMo18389z), new C20647J(3), C18037u.m20404c(-1519316990, new C0431j(interfaceC4765c), c15688rMo18372i), c15688r, 432, 0);
                c15688r.m18410W(false);
            }
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: ye.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C20504v.m25113b(this.f70215b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
