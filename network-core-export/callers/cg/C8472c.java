package cg;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8221m1;
import cf.C8469r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.mozilla.classfile.ByteCode;
import p055D0.C0946M0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p194Kd.C2983a;
import p194Kd.C2993k;
import p214Lf.C3376c;
import p250Nf.C3767f;
import p250Nf.C3769h;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5929n;
import p410Wd.C5933r;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p830w0.InterfaceC18861d;
import p845wg.C19285c2;

/* JADX INFO: renamed from: cg.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAgeRatingScreenM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgeRatingScreenM.kt\nru/zona/app/ui/profile/settings/AgeRatingScreenMKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,71:1\n113#2:72\n113#2:110\n113#2:121\n113#2:159\n87#3:73\n84#3,9:74\n94#3:120\n87#3:122\n85#3,8:123\n94#3:170\n80#4,6:83\n87#4,3:98\n90#4,2:107\n94#4:119\n80#4,6:131\n87#4,3:146\n90#4,2:155\n94#4:169\n391#5,9:89\n400#5:109\n401#5,2:117\n391#5,9:137\n400#5:157\n401#5,2:167\n4360#6,6:101\n4360#6,6:149\n1282#7,6:111\n1282#7,6:160\n2068#8:158\n2069#8:166\n85#9:171\n*S KotlinDebug\n*F\n+ 1 AgeRatingScreenM.kt\nru/zona/app/ui/profile/settings/AgeRatingScreenMKt\n*L\n36#1:72\n43#1:110\n58#1:121\n63#1:159\n32#1:73\n32#1:74,9\n32#1:120\n56#1:122\n56#1:123,8\n56#1:170\n32#1:83,6\n32#1:98,3\n32#1:107,2\n32#1:119\n56#1:131,6\n56#1:146,3\n56#1:155,2\n56#1:169\n32#1:89,9\n32#1:109\n32#1:117,2\n56#1:137,9\n56#1:157\n56#1:167,2\n32#1:101,6\n56#1:149,6\n47#1:111,6\n66#1:160,6\n60#1:158\n60#1:166\n30#1:171\n*E\n"})
public final class C8472c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m10346a(C2983a c2983a, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-216772600);
        int i11 = (c15688rMo18372i.mo18362N(c2983a) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(c2983a.m3705b().getSettings(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7468a.m8487b(C7482g.m8517b(aVar, 1.0f), C3376c.f10940a, C0946M0.f3382a), f10, 0.0f, 2);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C8221m1.m10148a(0, C16973X.m19466e((C16972W) C19285c2.f60100l.getValue(), c15688rMo18372i, 0), c15688rMo18372i, c2983a.m3704a());
            C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688rMo18372i);
            String str = ((C2993k) interfaceC15701v0M18246a.getValue()).f9881a;
            boolean z10 = (i11 & 14) == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new C8470a(c2983a, 0);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            m10347b(str, (Function1) objMo18389z, c15688rMo18372i, 0);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C3767f(c2983a, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10347b(String str, final Function1<? super String, Unit> function1, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1152932449);
        int i11 = 32;
        int i12 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 19) != 18)) {
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(InterfaceC7507e.a.f24548b, 1.0f);
            float f10 = 8;
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(f10), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
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
            c15688rMo18372i.mo18363O(-643114405);
            for (final C5933r c5933r : C5933r.f19655b) {
                String strM6807a = C5929n.m6807a(c5933r, c15688rMo18372i);
                String str2 = c5933r.f19656a;
                boolean zAreEqual = Intrinsics.areEqual(str2, str);
                boolean zMo18350B = ((i12 & 112) == i11) | c15688rMo18372i.mo18350B(c5933r);
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new Function0() { // from class: cg.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(c5933r.f19656a);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C8469r.m10345b(strM6807a, null, f10, zAreEqual, 0L, 0L, str2, false, (Function0) objMo18389z, c15688rMo18372i, 384, ByteCode.GETSTATIC);
                i12 = i12;
                i11 = 32;
            }
            c15688rMo18372i.m18410W(false);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C3769h(str, function1, i10, 1);
        }
    }
}
