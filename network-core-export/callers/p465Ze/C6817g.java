package p465Ze;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8153K0;
import bf.C8158N;
import bf.C8192d;
import bf.C8215k1;
import gf.C11388b;
import java.util.List;
import ke.C15855h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt__StringsJVMKt;
import org.conscrypt.PSKKeyManager;
import p055D0.C0955R0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p269Og.InterfaceC4008o;
import p284Pd.InterfaceC4227a;
import p392Vd.EnumC5670a;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.InterfaceC5928m;
import p563ff.C11154g;
import p579h0.C11565Q2;
import p580h1.AbstractC11778p;
import p580h1.C11722I0;
import p580h1.C11732N0;
import p580h1.C11752c;
import p580h1.C11795x0;
import p580h1.InterfaceC11780q;
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
import p706o1.C17285d;
import p776s1.C18043a;
import p776s1.C18051i;
import p776s1.C18056n;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p881z.C20541F0;

/* JADX INFO: renamed from: Ze.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nResultSearchPageM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResultSearchPageM.kt\nru/zona/app/screens/search/result/ResultSearchPageMKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,196:1\n87#2:197\n84#2,9:198\n87#2:240\n84#2,9:241\n94#2:316\n94#2:320\n87#2:321\n84#2,9:322\n94#2:369\n87#2:372\n85#2,8:373\n94#2:411\n87#2:427\n85#2,8:428\n94#2:467\n80#3,6:207\n87#3,3:222\n90#3,2:231\n80#3,6:250\n87#3,3:265\n90#3,2:274\n94#3:315\n94#3:319\n80#3,6:331\n87#3,3:346\n90#3,2:355\n94#3:368\n80#3,6:381\n87#3,3:396\n90#3,2:405\n94#3:410\n80#3,6:436\n87#3,3:451\n90#3,2:460\n94#3:466\n391#4,9:213\n400#4:233\n391#4,9:256\n400#4:276\n401#4,2:313\n401#4,2:317\n391#4,9:337\n400#4:357\n401#4,2:366\n391#4,9:387\n400#4,3:407\n391#4,9:442\n400#4:462\n401#4,2:464\n4360#5,6:225\n4360#5,6:268\n4360#5,6:349\n4360#5,6:399\n4360#5,6:454\n1282#6,6:234\n1282#6,6:277\n1282#6,6:283\n1282#6,6:289\n1282#6,6:295\n1282#6,6:301\n1282#6,6:307\n1282#6,6:359\n1282#6,6:413\n2068#7:358\n2069#7:365\n113#8:370\n113#8:371\n113#8:425\n113#8:426\n113#8:463\n1574#9:412\n1508#9,6:419\n85#10:468\n85#10:469\n*S KotlinDebug\n*F\n+ 1 ResultSearchPageM.kt\nru/zona/app/screens/search/result/ResultSearchPageMKt\n*L\n56#1:197\n56#1:198,9\n68#1:240\n68#1:241,9\n68#1:316\n56#1:320\n121#1:321\n121#1:322,9\n121#1:369\n139#1:372\n139#1:373,8\n139#1:411\n180#1:427\n180#1:428,8\n180#1:467\n56#1:207,6\n56#1:222,3\n56#1:231,2\n68#1:250,6\n68#1:265,3\n68#1:274,2\n68#1:315\n56#1:319\n121#1:331,6\n121#1:346,3\n121#1:355,2\n121#1:368\n139#1:381,6\n139#1:396,3\n139#1:405,2\n139#1:410\n180#1:436,6\n180#1:451,3\n180#1:460,2\n180#1:466\n56#1:213,9\n56#1:233\n68#1:256,9\n68#1:276\n68#1:313,2\n56#1:317,2\n121#1:337,9\n121#1:357\n121#1:366,2\n139#1:387,9\n139#1:407,3\n180#1:442,9\n180#1:462\n180#1:464,2\n56#1:225,6\n68#1:268,6\n121#1:349,6\n139#1:399,6\n180#1:454,6\n65#1:234,6\n78#1:277,6\n84#1:283,6\n94#1:289,6\n95#1:295,6\n106#1:301,6\n107#1:307,6\n125#1:359,6\n166#1:413,6\n122#1:358\n122#1:365\n141#1:370\n143#1:371\n182#1:425\n184#1:426\n194#1:463\n155#1:412\n157#1:419,6\n53#1:468\n54#1:469\n*E\n"})
public final class C6817g {

    /* JADX INFO: renamed from: Ze.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC4227a) this.receiver).mo4950g();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ze.g$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC4227a) this.receiver).mo4946c();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ze.g$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function1<InterfaceC4008o, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC4008o interfaceC4008o) {
            ((InterfaceC4227a) this.receiver).mo4947d(interfaceC4008o);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ze.g$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC4227a) this.receiver).mo4948e();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ze.g$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements Function1<InterfaceC4008o, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC4008o interfaceC4008o) {
            ((InterfaceC4227a) this.receiver).mo4947d(interfaceC4008o);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ze.g$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements Function1<InterfaceC4008o, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC4008o interfaceC4008o) {
            ((InterfaceC4227a) this.receiver).mo4947d(interfaceC4008o);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ze.g$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements Function1<InterfaceC4008o, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC4008o interfaceC4008o) {
            ((InterfaceC4227a) this.receiver).mo4949f(interfaceC4008o);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m7712a(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-591495515);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            float f10 = 16;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7481f.m8511d(aVar, f10), "test_tag_search_empty_results");
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(f10), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i11 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59690d.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10908c, c15688rMo18372i, 0, 0, 131070);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f60017t0.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10912g, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            c15688r = c15688rMo18372i;
            C15855h.m18664b(aVar, f10, c15688r, true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C6816f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean, int] */
    /* JADX INFO: renamed from: b */
    public static final void m7713b(InterfaceC4227a interfaceC4227a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        Object aVar;
        C1982e.k kVar;
        InterfaceC5799g.a.e eVar;
        C18863f.a aVar2;
        float f10;
        ?? r11;
        InterfaceC15676n.a.C21235a c21235a;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        C15688r c15688r2;
        InterfaceC15676n.a.C21235a c21235a2;
        int i13;
        List list;
        C15688r c15688r3;
        final InterfaceC4227a interfaceC4227a2 = interfaceC4227a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(183353317);
        int i14 = (c15688rMo18372i.mo18362N(interfaceC4227a2) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC4227a2.mo4945b(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC4227a2.getState(), c15688rMo18372i, 0);
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(InterfaceC7507e.a.f24548b, 1.0f);
            C1982e.k kVar2 = C1982e.f6639c;
            C18863f.a aVar3 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar2, aVar3, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i15 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            }
            InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
            C8215k1.m10147a(C16973X.m19467f((C16972W) C19140H5.f59823O.getValue(), new Object[]{((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14124a.f14122a}, c15688rMo18372i), interfaceC4227a2.mo4944a(), null, null, null, false, null, 0L, 0L, c15688rMo18372i, 0, 1020);
            C15688r c15688r4 = c15688rMo18372i;
            String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59864k0.getValue(), c15688r4, 0);
            boolean z12 = ((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14127d;
            int i16 = i14 & 14;
            boolean z13 = i16 == 4;
            Object objMo18389z = c15688r4.mo18389z();
            InterfaceC15676n.a.C21235a c21235a3 = InterfaceC15676n.a.f50781a;
            if (z13 || objMo18389z == c21235a3) {
                kVar = kVar2;
                eVar = eVar2;
                aVar2 = aVar3;
                f10 = 1.0f;
                r11 = 0;
                aVar = new a(0, interfaceC4227a2, InterfaceC4227a.class, "toggleIsShowInaccessible", "toggleIsShowInaccessible()V", 0);
                c15688r4.mo18380q(aVar);
            } else {
                eVar = eVar2;
                aVar2 = aVar3;
                aVar = objMo18389z;
                f10 = 1.0f;
                r11 = 0;
                kVar = kVar2;
            }
            C8153K0.m10131a(r11, strM19466e, c15688r4, (Function0) ((KFunction) aVar), z12);
            if (f10 <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            InterfaceC7507e interfaceC7507eM25139c = C20541F0.m25139c(new LayoutWeightElement(RangesKt.coerceAtMost(f10, Float.MAX_VALUE), true), C20541F0.m25137a(c15688r4), 14);
            C2036x c2036xM2689a2 = C2032v.m2689a(kVar, aVar2, c15688r4, r11);
            long j11 = c15688r4.f50813T;
            int i17 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688r4.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM25139c, c15688r4);
            c15688r4.mo18353E();
            if (c15688r4.f50812S) {
                c15688r4.mo18355G(aVar4);
            } else {
                c15688r4.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a2, c15688r4, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688r4, fVar);
            if (c15688r4.f50812S || !Intrinsics.areEqual(c15688r4.mo18389z(), Integer.valueOf(i17))) {
                C12269M6.m14188a(i17, c15688r4, i17, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688r4, eVar);
            if (((EnumC5670a) interfaceC15701v0M18246a.getValue()) == EnumC5670a.f18682c) {
                c15688r4.mo18363O(1284873709);
                C8192d.m10142a(r11, c15688r4);
                c15688r4.m18410W(r11);
            } else if (((EnumC5670a) interfaceC15701v0M18246a.getValue()) == EnumC5670a.f18684e) {
                c15688r4.mo18363O(1284991354);
                boolean z14 = i16 == 4;
                Object objMo18389z2 = c15688r4.mo18389z();
                if (z14 || objMo18389z2 == c21235a3) {
                    objMo18389z2 = new b(0, interfaceC4227a, InterfaceC4227a.class, "updateData", "updateData()V", 0);
                    c15688r4.mo18380q(objMo18389z2);
                }
                C8158N.m10132a((Function0) ((KFunction) objMo18389z2), c15688r4, r11);
                c15688r4.m18410W(r11);
            } else {
                if (((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14124a.f14123b.f51909a.isEmpty()) {
                    c15688r4.mo18363O(1285408924);
                    if (((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14125b.f14123b.f51909a.isEmpty()) {
                        c21235a = c21235a3;
                        i11 = 4;
                        i12 = 0;
                        c15688r4.mo18363O(1285930964);
                        m7712a(0, c15688r4);
                        c15688r4.m18410W(false);
                    } else {
                        c15688r4.mo18363O(1285463143);
                        String str = ((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14124a.f14122a;
                        String str2 = ((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14125b.f14122a;
                        List list2 = ((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14125b.f14123b.f51909a;
                        boolean z15 = i16 == 4;
                        Object objMo18389z3 = c15688r4.mo18389z();
                        if (z15 || objMo18389z3 == c21235a3) {
                            list = list2;
                            d dVar2 = new d(0, interfaceC4227a, InterfaceC4227a.class, "onSimilarQueryClick", "onSimilarQueryClick()V", 0);
                            c15688r4.mo18380q(dVar2);
                            objMo18389z3 = dVar2;
                        } else {
                            list = list2;
                        }
                        Function0 function0 = (Function0) ((KFunction) objMo18389z3);
                        boolean z16 = i16 == 4;
                        Object objMo18389z4 = c15688r4.mo18389z();
                        if (z16 || objMo18389z4 == c21235a3) {
                            objMo18389z4 = new e(1, interfaceC4227a, InterfaceC4227a.class, "onContentClick", "onContentClick(Lru/zona/content/models/IEntityId;)V", 0);
                            c15688r4.mo18380q(objMo18389z4);
                        }
                        Function1 function1 = (Function1) ((KFunction) objMo18389z4);
                        i12 = 0;
                        c21235a = c21235a3;
                        i11 = 4;
                        m7714c(str, str2, list, function0, function1, c15688r4, 0);
                        c15688r4.m18410W(false);
                    }
                    List<InterfaceC5928m> list3 = ((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14126c;
                    if (list3 == null || list3.isEmpty()) {
                        z10 = true;
                        z11 = false;
                        interfaceC4227a2 = interfaceC4227a;
                        c15688r4.mo18363O(1286426065);
                        c15688r4.m18410W(false);
                        c15688r2 = c15688r4;
                    } else {
                        c15688r4.mo18363O(1286064729);
                        String strM19466e2 = C16973X.m19466e((C16972W) C19101C4.f59671R0.getValue(), c15688r4, i12);
                        List<InterfaceC5928m> list4 = ((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14126c;
                        boolean z17 = i16 == i11;
                        Object objMo18389z5 = c15688r4.mo18389z();
                        if (z17 || objMo18389z5 == c21235a) {
                            c21235a2 = c21235a;
                            i13 = 4;
                            f fVar2 = new f(1, interfaceC4227a, InterfaceC4227a.class, "onContentClick", "onContentClick(Lru/zona/content/models/IEntityId;)V", 0);
                            c15688r4.mo18380q(fVar2);
                            objMo18389z5 = fVar2;
                        } else {
                            c21235a2 = c21235a;
                            i13 = 4;
                        }
                        Function1 function2 = (Function1) ((KFunction) objMo18389z5);
                        boolean z18 = i16 == i13;
                        Object objMo18389z6 = c15688r4.mo18389z();
                        if (z18 || objMo18389z6 == c21235a2) {
                            interfaceC4227a2 = interfaceC4227a;
                            objMo18389z6 = new g(1, interfaceC4227a2, InterfaceC4227a.class, "deleteContentFromHistory", "deleteContentFromHistory(Lru/zona/content/models/IEntityId;)V", 0);
                            c15688r4.mo18380q(objMo18389z6);
                        } else {
                            interfaceC4227a2 = interfaceC4227a;
                        }
                        z10 = true;
                        z11 = false;
                        C11154g.m13162b(strM19466e2, list4, function2, null, null, (Function1) ((KFunction) objMo18389z6), false, c15688r4, 0, 88);
                        C15688r c15688r5 = c15688r4;
                        c15688r5.m18410W(false);
                        c15688r2 = c15688r5;
                    }
                    c15688r2.m18410W(z11);
                    c15688r3 = c15688r2;
                } else {
                    c15688r4.mo18363O(1285147935);
                    List<T> list5 = ((InterfaceC4227a.b) interfaceC15701v0M18246a2.getValue()).f14124a.f14123b.f51909a;
                    boolean z19 = i16 == 4;
                    Object objMo18389z7 = c15688r4.mo18389z();
                    if (z19 || objMo18389z7 == c21235a3) {
                        objMo18389z7 = new c(1, interfaceC4227a, InterfaceC4227a.class, "onContentClick", "onContentClick(Lru/zona/content/models/IEntityId;)V", 0);
                        c15688r4.mo18380q(objMo18389z7);
                    }
                    m7715d(list5, (Function1) ((KFunction) objMo18389z7), c15688r4, r11);
                    c15688r4.m18410W(r11);
                }
                c15688r3.m18410W(z10);
                c15688r3.m18410W(z10);
                c15688r = c15688r3;
            }
            z10 = true;
            interfaceC4227a2 = interfaceC4227a;
            c15688r3 = c15688r4;
            c15688r3.m18410W(z10);
            c15688r3.m18410W(z10);
            c15688r = c15688r3;
        } else {
            c15688rMo18372i.mo18356H();
            c15688r = c15688rMo18372i;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ze.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6817g.m7713b(this.f22413b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7714c(final String str, final String str2, final List<? extends InterfaceC5928m> list, final Function0<Unit> function0, final Function1<? super InterfaceC4008o, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1319811884);
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18362N(str2) ? 32 : 16) | (c15688rMo18372i.mo18362N(list) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 9363) != 9362)) {
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C7481f.m8511d(InterfaceC7507e.a.f24548b, f10), "test_tag_search_similar_result");
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(f10), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19101C4.f59690d.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10908c, c15688rMo18372i, 0, 0, 131070);
            C11565Q2.m13480b(C16973X.m19467f((C16972W) C19140H5.f59870n0.getValue(), new Object[]{str, str2}, c15688rMo18372i), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10912g, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 131070);
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.mo18363O(1323892140);
            C11752c.b bVar = new C11752c.b();
            bVar.m13609e(C16973X.m19466e((C16972W) C19140H5.f59872o0.getValue(), c15688rMo18372i, 0) + " ");
            C11722I0 c11722i0 = new C11722I0(new C11795x0(C3376c.f10957r, 0L, (C16318q) null, (C16316o) null, (C16317p) null, (AbstractC16308g) null, (String) null, 0L, (C18043a) null, (C18056n) null, (C17285d) null, 0L, C18051i.f56284c, (C0955R0) null, 61438), 14);
            boolean z10 = (i11 & 7168) == 2048;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = new InterfaceC11780q() { // from class: Ze.d
                    @Override // p580h1.InterfaceC11780q
                    /* JADX INFO: renamed from: a */
                    public final void mo6331a() {
                        function0.invoke();
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            int iM13612h = bVar.m13612h(new AbstractC11778p.a(str2, c11722i0, (InterfaceC11780q) objMo18389z));
            try {
                bVar.m13609e(StringsKt__StringsJVMKt.replace$default(str2, " ", " ", false, 4, (Object) null));
                Unit unit = Unit.INSTANCE;
                bVar.m13611g(iM13612h);
                C11752c c11752cM13614j = bVar.m13614j();
                c15688rMo18372i.m18410W(false);
                C11154g.m13162b(c11752cM13614j, list, function1, null, null, null, false, c15688rMo18372i, ((i11 >> 3) & 112) | ((i11 >> 6) & 896), 120);
                c15688r = c15688rMo18372i;
            } catch (Throwable th) {
                bVar.m13611g(iM13612h);
                throw th;
            }
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, str2, list, function0, function1, i10) { // from class: Ze.e

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f22419b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f22420c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ List f22421d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f22422e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function1 f22423f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6817g.m7714c(this.f22419b, this.f22420c, this.f22421d, this.f22422e, this.f22423f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m7715d(final List<? extends InterfaceC5928m> list, final Function1<? super InterfaceC4008o, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-113671824);
        int i11 = (c15688rMo18372i.mo18362N(list) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(InterfaceC7507e.a.f24548b, "test_tag_search_success_result");
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            c15688rMo18372i.mo18363O(-1945392369);
            for (final InterfaceC5928m interfaceC5928m : list) {
                boolean zMo18350B = ((i11 & 112) == 32) | c15688rMo18372i.mo18350B(interfaceC5928m);
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new Function0() { // from class: Ze.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(interfaceC5928m);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C11388b.m13419a(interfaceC5928m, (Function0) objMo18389z, null, false, false, c15688rMo18372i, 0, 28);
            }
            c15688rMo18372i.m18410W(false);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(list, i10, function1) { // from class: Ze.c

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f22416b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f22417c;

                {
                    this.f22417c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6817g.m7715d(this.f22416b, this.f22417c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
