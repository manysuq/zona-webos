package ne;

import af.C7324q;
import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7511b;
import androidx.compose.p481ui.focus.C7512c;
import androidx.compose.p481ui.platform.C7586d;
import cf.C8465n;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.ranges.RangesKt;
import mg.C17055r;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p019B0.C0173B;
import p019B0.InterfaceC0210t;
import p055D0.C0946M0;
import p055D0.C0998l0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p163J0.C2431d;
import p214Lf.C3376c;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p607i9.C12269M6;
import p640jf.C15469L;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p658kf.C15873k;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p830w0.InterfaceC18861d;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19142I0;
import p845wg.C19278b3;
import p881z.C20541F0;

/* JADX INFO: renamed from: ne.r */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nContentActionsButtonGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentActionsButtonGroup.kt\nru/zona/app/screens/content/compositions/ContentActionsButtonGroupKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,210:1\n113#2:211\n113#2:291\n113#2:292\n113#2:297\n113#2:298\n113#2:341\n87#3:212\n84#3,9:213\n94#3:296\n80#4,6:222\n87#4,3:237\n90#4,2:246\n80#4,6:260\n87#4,3:275\n90#4,2:284\n94#4:289\n94#4:295\n80#4,6:308\n87#4,3:323\n90#4,2:332\n94#4:368\n391#5,9:228\n400#5:248\n391#5,9:266\n400#5,3:286\n401#5,2:293\n391#5,9:314\n400#5:334\n401#5,2:366\n4360#6,6:240\n4360#6,6:278\n4360#6,6:326\n99#7:249\n95#7,10:250\n106#7:290\n99#7:299\n97#7,8:300\n106#7:369\n1282#8,6:335\n1282#8,6:342\n1282#8,6:348\n1282#8,6:354\n1282#8,6:360\n*S KotlinDebug\n*F\n+ 1 ContentActionsButtonGroup.kt\nru/zona/app/screens/content/compositions/ContentActionsButtonGroupKt\n*L\n57#1:211\n95#1:291\n98#1:292\n128#1:297\n130#1:298\n138#1:341\n54#1:212\n54#1:213,9\n54#1:296\n54#1:222,6\n54#1:237,3\n54#1:246,2\n61#1:260,6\n61#1:275,3\n61#1:284,2\n61#1:289\n54#1:295\n126#1:308,6\n126#1:323,3\n126#1:332,2\n126#1:368\n54#1:228,9\n54#1:248\n61#1:266,9\n61#1:286,3\n54#1:293,2\n126#1:314,9\n126#1:334\n126#1:366,2\n54#1:240,6\n61#1:278,6\n126#1:326,6\n61#1:249\n61#1:250,10\n61#1:290\n126#1:299\n126#1:300,8\n126#1:369\n136#1:335,6\n139#1:342,6\n152#1:348,6\n160#1:354,6\n171#1:360,6\n*E\n"})
public final class C17224r {
    /* JADX INFO: renamed from: a */
    public static final void m19681a(final boolean z10, final boolean z11, final boolean z12, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, InterfaceC15676n interfaceC15676n, final int i10) {
        LayoutWeightElement layoutWeightElement;
        int i11;
        int i12;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1883713318);
        int i13 = i10 | (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | (c15688rMo18372i.mo18364a(z11) ? 32 : 16) | (c15688rMo18372i.mo18364a(z12) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT) | (c15688rMo18372i.mo18350B(function3) ? 1048576 : 524288);
        if (c15688rMo18372i.mo18379p(i13 & 1, (599187 & i13) != 599186)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8518c(aVar, 1.0f), 16, 0.0f, 2);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58760n, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i14 = (int) (j10 ^ (j10 >>> 32));
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
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            if (0.23f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(RangesKt.coerceAtMost(0.23f, Float.MAX_VALUE), true);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j11 = c15688rMo18372i.f50813T;
            int i15 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            if (function0 == null) {
                c15688rMo18372i.mo18363O(-698478306);
                c15688rMo18372i.m18410W(false);
                layoutWeightElement = layoutWeightElement2;
                i11 = 29360128;
                i12 = 0;
            } else {
                c15688rMo18372i.mo18363O(-698478305);
                String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59785q.getValue(), c15688rMo18372i, 0);
                C2431d c2431d = C4601b.f15461a;
                int i16 = (i13 & 7168) | ((i13 << 21) & 29360128);
                layoutWeightElement = layoutWeightElement2;
                i11 = 29360128;
                i12 = 0;
                C8465n.m10343a(layoutWeightElement, strM19466e, new C4600a((C16987h) C19142I0.f59919q.getValue(), null), function0, 0L, false, false, z10, false, c15688rMo18372i, i16, 368);
                c15688rMo18372i = c15688rMo18372i;
                Unit unit = Unit.INSTANCE;
                c15688rMo18372i.m18410W(false);
            }
            int i17 = (i13 << 21) & i11;
            C8465n.m10343a(C7586d.m8700a(layoutWeightElement, "test_tag_add_to_favorite_button"), C16973X.m19466e((C16972W) C19278b3.f59986e.getValue(), c15688rMo18372i, i12), C4601b.m5214i(), function1, 0L, z12, false, z10, false, c15688rMo18372i, ((i13 >> 3) & 7168) | ((i13 << 9) & 458752) | i17, 336);
            C8465n.m10343a(C7586d.m8700a(layoutWeightElement, "test_tag_add_to_watched_button"), C16973X.m19466e((C16972W) C19278b3.f59930A.getValue(), c15688rMo18372i, 0), C4601b.m5211f(), function2, 0L, z11, false, z10, false, c15688rMo18372i, ((i13 >> 6) & 7168) | ((i13 << 12) & 458752) | i17, 336);
            C8465n.m10343a(layoutWeightElement, C16973X.m19466e((C16972W) C19140H5.f59856g0.getValue(), c15688rMo18372i, 0), C4601b.m5225t(), function3, 0L, false, false, z10, false, c15688rMo18372i, ((i13 >> 9) & 7168) | i17, 368);
            c15688rMo18372i.m18410W(true);
            C1963W0.m2623a(C7482g.m8519d(aVar, 8), c15688rMo18372i);
            C2000k.m2674a(C7468a.m8487b(C7482g.m8519d(C7482g.m8518c(aVar, 1.0f), 1), C3376c.f10945f, C0946M0.f3382a), c15688rMo18372i, 0);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, z11, z12, function0, function1, function2, function3, i10) { // from class: ne.q

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f54025b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f54026c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f54027d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f54028e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f54029f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function0 f54030g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ Function0 f54031h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17224r.m19681a(this.f54025b, this.f54026c, this.f54027d, this.f54028e, this.f54029f, this.f54030g, this.f54031h, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [int] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX INFO: renamed from: b */
    public static final void m19682b(final boolean z10, final boolean z11, final boolean z12, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, final Function0<Unit> function4, final Function0<Unit> function5, final Function0<Unit> function6, final Function0<Unit> function7, final C0173B c0173b, final C0173B c0173b2, final C0173B c0173b3, final String str, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        int i12;
        int i13;
        ?? r10;
        Function0<Unit> function8;
        InterfaceC7507e.a aVar;
        InterfaceC15676n.a.C21235a c21235a;
        int i14;
        boolean z13;
        boolean z14;
        Object obj;
        Object obj2;
        int i15;
        InterfaceC7507e.a aVar2;
        InterfaceC15676n.a.C21235a c21235a2;
        boolean z15;
        boolean z16;
        Object obj3;
        ?? r11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-861603966);
        if ((i10 & 6) == 0) {
            i12 = (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c15688rMo18372i.mo18364a(z11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c15688rMo18372i.mo18364a(z12) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i16 = i12;
        if ((i10 & 3072) == 0) {
            i16 |= c15688rMo18372i.mo18350B(function0) ? 2048 : 1024;
        }
        int i17 = i10 & 24576;
        int i18 = ConstantsKt.DEFAULT_BUFFER_SIZE;
        if (i17 == 0) {
            i16 |= c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i10) == 0) {
            i16 |= c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i10 & 1572864) == 0) {
            i16 |= c15688rMo18372i.mo18350B(function3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i16 |= c15688rMo18372i.mo18350B(function4) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i16 |= c15688rMo18372i.mo18350B(function5) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i16 |= c15688rMo18372i.mo18350B(function6) ? 536870912 : 268435456;
        }
        if ((i11 & 48) == 0) {
            i13 = i11 | (c15688rMo18372i.mo18362N(c0173b) ? 32 : 16);
        } else {
            i13 = i11;
        }
        if ((i11 & 384) == 0) {
            i13 |= c15688rMo18372i.mo18362N(c0173b2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c15688rMo18372i.mo18362N(c0173b3) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            if (c15688rMo18372i.mo18362N(str)) {
                i18 = 16384;
            }
            i13 |= i18;
        }
        int i19 = i13;
        if (c15688rMo18372i.mo18379p(i16 & 1, ((i16 & 306783379) == 306783378 && (i19 & 9361) == 9360) ? false : true)) {
            InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM25138b = C20541F0.m25138b(C7481f.m8515h(aVar3, 0.0f, 40, 0.0f, 0.0f, 13), C20541F0.m25137a(c15688rMo18372i), true, false);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(8), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i20 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM25138b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i20))) {
                C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC15676n.a.C21235a c21235a3 = InterfaceC15676n.a.f50781a;
            if (function0 != null || z10) {
                c15688rMo18372i.mo18363O(-780264388);
                InterfaceC7507e interfaceC7507eM8578a = C7512c.m8578a(aVar3, c0173b);
                boolean z17 = (i19 & 7168) == 2048;
                Object objMo18389z = c15688rMo18372i.mo18389z();
                Object obj4 = objMo18389z;
                if (z17 || objMo18389z == c21235a3) {
                    Function1 function9 = new Function1() { // from class: ne.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ((InterfaceC0210t) obj5).mo300a(c0173b3);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(function9);
                    obj4 = function9;
                }
                InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(C7586d.m8700a(C7511b.m8577a(interfaceC7507eM8578a, (Function1) obj4), "test_tag_watch_content_button"), 160, 0.0f, 2);
                if (function0 == null) {
                    c15688rMo18372i.mo18363O(-779942918);
                    Object objMo18389z2 = c15688rMo18372i.mo18389z();
                    if (objMo18389z2 == c21235a3) {
                        z14 = false;
                        C17210k c17210k = new C17210k(0);
                        c15688rMo18372i.mo18380q(c17210k);
                        obj = c17210k;
                    } else {
                        z14 = false;
                        obj = objMo18389z2;
                    }
                    function8 = (Function0) obj;
                    c15688rMo18372i.m18410W(z14);
                    r10 = z14;
                } else {
                    r10 = 0;
                    c15688rMo18372i.mo18363O(1083218743);
                    c15688rMo18372i.m18410W(false);
                    function8 = function0;
                }
                aVar = aVar3;
                c21235a = c21235a3;
                i14 = i19;
                C15873k.m18672a(interfaceC7507eM8530o, function8, C4601b.m5222q(), C16973X.m19466e((C16972W) C19119E6.f59752Q.getValue(), c15688rMo18372i, r10), str, false, false, false, z10, null, CollectionsKt.listOf((Object[]) new C0998l0[]{new C0998l0(C3376c.f10956q), new C0998l0(C3376c.f10957r)}), 0L, c15688rMo18372i, ((i19 << 3) & 458752) | 1572864 | ((i16 << 27) & 1879048192), 5520);
                z13 = false;
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-779596183);
                InterfaceC7507e interfaceC7507eM8578a2 = C7512c.m8578a(aVar3, c0173b);
                boolean z18 = (i19 & 7168) == 2048;
                Object objMo18389z3 = c15688rMo18372i.mo18389z();
                Object obj5 = objMo18389z3;
                if (z18 || objMo18389z3 == c21235a3) {
                    Function1 function10 = new Function1() { // from class: ne.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            ((InterfaceC0210t) obj6).mo300a(c0173b3);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(function10);
                    obj5 = function10;
                }
                C15469L.m18112a(C7324q.m8149a(C7511b.m8577a(interfaceC7507eM8578a2, (Function1) obj5), z10), c15688rMo18372i, 0);
                c15688rMo18372i.m18410W(false);
                c21235a = c21235a3;
                i14 = i19;
                aVar = aVar3;
                z13 = false;
            }
            if (function1 == null) {
                c15688rMo18372i.mo18363O(-779293748);
                c15688rMo18372i.m18410W(z13);
                i15 = i14;
                c21235a2 = c21235a;
                aVar2 = aVar;
            } else {
                c15688rMo18372i.mo18363O(-779293747);
                int i21 = i14;
                boolean z19 = (i21 & 7168) == 2048;
                Object objMo18389z4 = c15688rMo18372i.mo18389z();
                InterfaceC15676n.a.C21235a c21235a4 = c21235a;
                if (z19 || objMo18389z4 == c21235a4) {
                    Function1 function11 = new Function1() { // from class: ne.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            ((InterfaceC0210t) obj6).mo300a(c0173b3);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(function11);
                    obj2 = function11;
                } else {
                    obj2 = objMo18389z4;
                }
                InterfaceC7507e.a aVar5 = aVar;
                i15 = i21;
                aVar2 = aVar5;
                c21235a2 = c21235a4;
                C15873k.m18672a(C7324q.m8149a(C7511b.m8577a(aVar5, (Function1) obj2), z10), function1, C4601b.m5216k(), C16973X.m19466e((C16972W) C19140H5.f59831S.getValue(), c15688rMo18372i, z13 ? 1 : 0), null, false, false, false, z10, null, null, 0L, c15688rMo18372i, (i16 << 27) & 1879048192, 7664);
                Unit unit = Unit.INSTANCE;
                z15 = false;
                c15688rMo18372i.m18410W(false);
            }
            if (function2 == null) {
                z15 = z13;
                c15688rMo18372i.mo18363O(-778870877);
                c15688rMo18372i.m18410W(z15);
                r11 = z15;
            } else {
                c15688rMo18372i.mo18363O(-778870876);
                int i22 = i15;
                if ((i22 & 7168) == 2048) {
                    z15 = z13;
                    z16 = true;
                } else {
                    z15 = z13;
                    z16 = false;
                }
                Object objMo18389z5 = c15688rMo18372i.mo18389z();
                if (z16 || objMo18389z5 == c21235a2) {
                    Function1 function12 = new Function1() { // from class: ne.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            ((InterfaceC0210t) obj6).mo300a(c0173b3);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(function12);
                    obj3 = function12;
                } else {
                    obj3 = objMo18389z5;
                }
                InterfaceC7507e interfaceC7507eM19502d = C17055r.m19502d(C7511b.m8577a(aVar2, (Function1) obj3), c0173b2, new C17218o(), c15688rMo18372i, (i22 >> 3) & 112);
                C2431d c2431d = C4601b.f15461a;
                C15873k.m18672a(interfaceC7507eM19502d, function2, new C4600a((C16987h) C19142I0.f59919q.getValue(), null), C16973X.m19466e((C16972W) C19119E6.f59785q.getValue(), c15688rMo18372i, z15 ? 1 : 0), null, false, false, false, z10, null, null, 0L, c15688rMo18372i, (i16 << 27) & 1879048192, 7664);
                Unit unit2 = Unit.INSTANCE;
                r11 = 0;
                c15688rMo18372i.m18410W(false);
            }
            int i23 = (i16 << 27) & 1879048192;
            C15873k.m18672a(null, function3, C4601b.m5214i(), C16973X.m19466e((C16972W) C19278b3.f59986e.getValue(), c15688rMo18372i, r11), null, false, true, z12, z10, null, null, 0L, c15688rMo18372i, ((i16 >> 15) & 112) | 12582912 | ((i16 << 18) & 234881024) | i23, 7281);
            C15873k.m18672a(null, function4, C4601b.m5211f(), C16973X.m19466e((C16972W) C19119E6.f59753R.getValue(), c15688rMo18372i, 0), null, false, true, z11, z10, null, null, 0L, c15688rMo18372i, ((i16 >> 18) & 112) | 12582912 | ((i16 << 21) & 234881024) | i23, 7281);
            C15873k.m18672a(null, function5, C4601b.m5225t(), C16973X.m19466e((C16972W) C19140H5.f59856g0.getValue(), c15688rMo18372i, 0), null, false, false, false, z10, null, null, 0L, c15688rMo18372i, ((i16 >> 21) & 112) | i23, 7665);
            C15873k.m18672a(null, function6, C4601b.m5229x(), C16973X.m19466e((C16972W) C19140H5.f59834T0.getValue(), c15688rMo18372i, 0), null, false, false, false, z10, null, null, 0L, c15688rMo18372i, ((i16 >> 24) & 112) | i23, 7665);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: ne.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).intValue();
                    int iM18294a = C15636Z0.m18294a(i10 | 1);
                    int iM18294a2 = C15636Z0.m18294a(i11);
                    C17224r.m19682b(z10, z11, z12, function0, function1, function2, function3, function4, function5, function6, function7, c0173b, c0173b2, c0173b3, str, (InterfaceC15676n) obj6, iM18294a, iM18294a2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
