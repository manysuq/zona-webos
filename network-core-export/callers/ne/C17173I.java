package ne;

import af.C7307B;
import af.C7324q;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import ke.C15855h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import mg.C17046i;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p125Gg.EnumC1896d;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1956T;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p214Lf.C3374a;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p250Nf.C3765d;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11565Q2;
import p580h1.C11720H0;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p664l1.C16318q;
import p675lf.C16429v;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p776s1.C18050h;
import p776s1.C18051i;
import p817v1.C18580v;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19119E6;
import p845wg.C19278b3;

/* JADX INFO: renamed from: ne.I */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nContentHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentHeader.kt\nru/zona/app/screens/content/compositions/ContentHeaderKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,296:1\n113#2:297\n113#2:335\n113#2:336\n113#2:337\n113#2:338\n113#2:339\n113#2:340\n113#2:387\n113#2:426\n113#2:468\n113#2:545\n113#2:546\n113#2:551\n113#2:552\n113#2:553\n113#2:563\n113#2:570\n113#2:628\n113#2:629\n113#2:630\n113#2:631\n113#2:632\n87#3:298\n84#3,9:299\n94#3:386\n87#3:469\n83#3,10:470\n87#3:507\n83#3,10:508\n94#3:550\n94#3:557\n80#4,6:308\n87#4,3:323\n90#4,2:332\n80#4,6:352\n87#4,3:367\n90#4,2:376\n94#4:381\n94#4:385\n80#4,6:399\n87#4,3:414\n90#4,2:423\n80#4,6:437\n87#4,3:452\n90#4,2:461\n94#4:466\n80#4,6:480\n87#4,3:495\n90#4,2:504\n80#4,6:518\n87#4,3:533\n90#4,2:542\n94#4:549\n94#4:556\n94#4:560\n80#4,6:588\n87#4,3:603\n90#4,2:612\n94#4:623\n391#5,9:314\n400#5:334\n391#5,9:358\n400#5,3:378\n401#5,2:383\n391#5,9:405\n400#5:425\n391#5,9:443\n400#5,3:463\n391#5,9:486\n400#5:506\n391#5,9:524\n400#5:544\n401#5,2:547\n401#5,2:554\n401#5,2:558\n391#5,9:594\n400#5:614\n401#5,2:621\n4360#6,6:326\n4360#6,6:370\n4360#6,6:417\n4360#6,6:455\n4360#6,6:498\n4360#6,6:536\n4360#6,6:606\n99#7:341\n95#7,10:342\n106#7:382\n99#7:388\n95#7,10:389\n106#7:561\n99#7:578\n96#7,9:579\n106#7:624\n70#8:427\n67#8,9:428\n77#8:467\n75#9:562\n1282#10,6:564\n1282#10,6:615\n15#11,7:571\n85#12:625\n117#12,2:626\n*S KotlinDebug\n*F\n+ 1 ContentHeader.kt\nru/zona/app/screens/content/compositions/ContentHeaderKt\n*L\n61#1:297\n77#1:335\n82#1:336\n89#1:337\n95#1:338\n104#1:339\n105#1:340\n145#1:387\n149#1:426\n157#1:468\n181#1:545\n185#1:546\n197#1:551\n213#1:552\n214#1:553\n257#1:563\n277#1:570\n68#1:628\n167#1:629\n217#1:630\n224#1:631\n230#1:632\n58#1:298\n58#1:299,9\n58#1:386\n159#1:469\n159#1:470,10\n162#1:507\n162#1:508,10\n162#1:550\n159#1:557\n58#1:308,6\n58#1:323,3\n58#1:332,2\n105#1:352,6\n105#1:367,3\n105#1:376,2\n105#1:381\n58#1:385\n147#1:399,6\n147#1:414,3\n147#1:423,2\n149#1:437,6\n149#1:452,3\n149#1:461,2\n149#1:466\n159#1:480,6\n159#1:495,3\n159#1:504,2\n162#1:518,6\n162#1:533,3\n162#1:542,2\n162#1:549\n159#1:556\n147#1:560\n274#1:588,6\n274#1:603,3\n274#1:612,2\n274#1:623\n58#1:314,9\n58#1:334\n105#1:358,9\n105#1:378,3\n58#1:383,2\n147#1:405,9\n147#1:425\n149#1:443,9\n149#1:463,3\n159#1:486,9\n159#1:506\n162#1:524,9\n162#1:544\n162#1:547,2\n159#1:554,2\n147#1:558,2\n274#1:594,9\n274#1:614\n274#1:621,2\n58#1:326,6\n105#1:370,6\n147#1:417,6\n149#1:455,6\n159#1:498,6\n162#1:536,6\n274#1:606,6\n105#1:341\n105#1:342,10\n105#1:382\n147#1:388\n147#1:389,10\n147#1:561\n274#1:578\n274#1:579,9\n274#1:624\n149#1:427\n149#1:428,9\n149#1:467\n246#1:562\n273#1:564,6\n286#1:615,6\n278#1:571,7\n273#1:625\n273#1:626,2\n*E\n"})
public final class C17173I {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m19663a(final int i10, final String str, InterfaceC15676n interfaceC15676n, final Function0 function0, final boolean z10) {
        int i11;
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(398502458);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18364a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(C7482g.m8529n(C7324q.m8149a(InterfaceC7507e.a.f24548b, z10), 600), C6138n1.f20157a, new C17046i(function0));
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8564a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
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
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), false);
            C11732N0 c11732n0 = C3375b.f10930m;
            C11732N0 c11732n0M13585a = C11732N0.m13585a(c11732n0, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214);
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = new Function1() { // from class: ne.E
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC15701v0.setValue(Boolean.valueOf(((C11720H0) obj).m13564d()));
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C11565Q2.m13480b(str, layoutWeightElement, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, (Function1) objMo18389z2, c11732n0M13585a, c15688rMo18372i, i11 & 14, 1597824, 45052);
            c15688r = c15688rMo18372i;
            if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                c15688r.mo18363O(-1481147907);
                C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f60025x0.getValue(), c15688r, 0), new VerticalAlignElement(InterfaceC18861d.a.f58758l), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10946g, 0L, null, null, 0L, C18051i.f56284c, 0L, null, null, 16773118), c15688r, 0, 0, 131068);
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(-1480885244);
                c15688r.m18410W(false);
            }
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: ne.F
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C17173I.m19663a(C15636Z0.m18294a(i10 | 1), str, (InterfaceC15676n) obj, function0, z10);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean, int] */
    /* JADX INFO: renamed from: b */
    public static final void m19664b(final boolean z10, final String str, final String str2, final String str3, final String str4, final boolean z11, final String str5, final String str6, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        float f10;
        InterfaceC7507e.a aVar;
        InterfaceC5799g.a.C21098a c21098a;
        ?? r10;
        C15688r c15688r2;
        C15688r c15688r3;
        boolean z12;
        C15688r c15688r4;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1501927924);
        int i11 = i10 | (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | (c15688rMo18372i.mo18362N(str) ? 32 : 16) | (c15688rMo18372i.mo18362N(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18362N(str3) ? 2048 : 1024) | (c15688rMo18372i.mo18362N(str4) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18364a(z11) ? 131072 : Parser.ARGC_LIMIT) | (c15688rMo18372i.mo18362N(str5) ? 1048576 : 524288) | (c15688rMo18372i.mo18362N(str6) ? 8388608 : 4194304);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 4793491) != 4793490)) {
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            float f11 = 16;
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C7482g.m8518c(aVar2, 1.0f), f11);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58760n, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a2);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            C7307B.m8143a(C18037u.m20404c(-1311963820, new Function2() { // from class: ne.G
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C11565Q2.m13480b(str, C7586d.m8700a(C7482g.m8530o(C7324q.m8149a(InterfaceC7507e.a.f24548b, z10), 229, 0.0f, 2), "test_tag_content_name_title"), 0L, 0L, null, 0L, new C18050h(3), 0L, 2, false, 5, 0, null, C3374a.f10906a, interfaceC15676n2, 0, 24960, 109564);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 6);
            C1963W0.m2623a(C7482g.m8519d(aVar2, f11), c15688rMo18372i);
            if (z10 || (str2 != null && str2.length() > 0)) {
                c15688rMo18372i.mo18363O(175792432);
                InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(C7324q.m8149a(aVar2, z10), 144, 0.0f, 2);
                f10 = f11;
                aVar = aVar2;
                c21098a = c21098a2;
                r10 = 0;
                C11565Q2.m13480b(str2 == null ? "" : str2, interfaceC7507eM8530o, 0L, 0L, null, 0L, new C18050h(3), 0L, 2, false, 5, 0, null, C11732N0.m13585a(C3374a.f10916k, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 24960, 109564);
                C15688r c15688r5 = c15688rMo18372i;
                C15855h.m18664b(aVar, 4, c15688r5, false);
                c15688r2 = c15688r5;
            } else {
                c15688rMo18372i.mo18363O(176242180);
                r10 = 0;
                c15688rMo18372i.m18410W(false);
                c15688r2 = c15688rMo18372i;
                f10 = f11;
                aVar = aVar2;
                c21098a = c21098a2;
            }
            if (z10 || str3.length() > 0) {
                c15688r2.mo18363O(176328980);
                C15688r c15688r6 = c15688r2;
                C11565Q2.m13480b(str3, C7482g.m8530o(C7324q.m8149a(aVar, z10), 204, 0.0f, 2), 0L, 0L, null, 0L, new C18050h(3), 0L, 2, false, 3, 0, null, C11732N0.m13585a(C3374a.f10916k, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r6, (i11 >> 9) & 14, 24960, 109564);
                C15688r c15688r7 = c15688r6;
                c15688r7.m18410W(r10);
                c15688r3 = c15688r7;
            } else {
                c15688r2.mo18363O(176723300);
                c15688r2.m18410W(r10);
            }
            if ((str4 == null || StringsKt.isBlank(str4)) && ((str6 == null || StringsKt.isBlank(str6)) && (str5 == null || StringsKt.isBlank(str5)))) {
                C15688r c15688r8 = c15688r3;
                z12 = true;
                c15688r8.mo18363O(177676612);
                c15688r8.m18410W(r10);
                c15688r4 = c15688r8;
            } else {
                c15688r3 = c15688r2;
                c15688r3.mo18363O(176857840);
                C1963W0.m2623a(C7482g.m8519d(aVar, f10), c15688r3);
                C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(f10), InterfaceC18861d.a.f58756j, c15688r3, 6);
                long j11 = c15688r3.f50813T;
                int i13 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688r3.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(aVar, c15688r3);
                c15688r3.mo18353E();
                if (c15688r3.f50812S) {
                    c15688r3.mo18355G(aVar3);
                } else {
                    c15688r3.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a, c15688r3, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688r3, fVar);
                if (c15688r3.f50812S || !Intrinsics.areEqual(c15688r3.mo18389z(), Integer.valueOf(i13))) {
                    C12269M6.m14188a(i13, c15688r3, i13, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688r3, eVar);
                int i14 = i11 & 14;
                C15688r c15688r9 = c15688r3;
                C17215m0.m19677a(z10, str4, C16973X.m19466e((C16972W) C19119E6.f59771e0.getValue(), c15688r3, r10), !z11, c15688r9, i14 | ((i11 >> 9) & 112));
                int i15 = i14 | 3072;
                C17215m0.m19677a(z10, str6, C16973X.m19466e((C16972W) C19278b3.f59956N.getValue(), c15688r9, r10), false, c15688r9, i15 | ((i11 >> 18) & 112));
                C17215m0.m19677a(z10, str5, C16973X.m19466e((C16972W) C19278b3.f59932B.getValue(), c15688r9, r10), false, c15688r9, i15 | ((i11 >> 15) & 112));
                z12 = true;
                c15688r9.m18410W(true);
                c15688r9.m18410W(r10);
                c15688r4 = c15688r9;
            }
            c15688r4.m18410W(z12);
            c15688r = c15688r4;
        } else {
            c15688rMo18372i.mo18356H();
            c15688r = c15688rMo18372i;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, str, str2, str3, str4, z11, str5, str6, i10) { // from class: ne.H

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f53879b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f53880c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f53881d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f53882e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ String f53883f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ boolean f53884g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ String f53885h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ String f53886i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17173I.m19664b(this.f53879b, this.f53880c, this.f53881d, this.f53882e, this.f53883f, this.f53884g, this.f53885h, this.f53886i, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX INFO: renamed from: c */
    public static final void m19665c(final boolean z10, final String str, final String str2, final String str3, final String str4, final Function0 function0, final String str5, final boolean z11, final boolean z12, final String str6, final String str7, final String str8, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        C5753J.a aVar;
        InterfaceC7507e.a aVar2;
        InterfaceC5799g.a.C21098a c21098a;
        C5753J.a aVar3;
        float f10;
        boolean z13;
        ?? r11;
        float f11;
        int i12;
        boolean z14;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(795791825);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18362N(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c15688rMo18372i.mo18362N(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c15688rMo18372i.mo18362N(str3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c15688rMo18372i.mo18362N(str4) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i10) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c15688rMo18372i.mo18362N(str5) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c15688rMo18372i.mo18364a(z11) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c15688rMo18372i.mo18364a(z12) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c15688rMo18372i.mo18362N(str6) ? 536870912 : 268435456;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, ((i11 & 306783379) == 306783378 && (((c15688rMo18372i.mo18362N(str7) ? (char) 4 : (char) 2) | (c15688rMo18372i.mo18362N(str8) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            int i13 = str5 != null ? 1 : 2;
            float f12 = str5 != null ? 12 : 20;
            C18863f.b bVar = InterfaceC18861d.a.f58756j;
            C18863f.b bVar2 = str5 != null ? bVar : InterfaceC18861d.a.f58758l;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, bVar, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i14 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            float f13 = f12;
            InterfaceC7507e.a aVar4 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar4, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar5 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            int i15 = i11;
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar5);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a2);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            if (str5 == null) {
                c15688rMo18372i.mo18363O(2005537058);
                r11 = 0;
                c15688rMo18372i.m18410W(false);
                c21098a = c21098a2;
                aVar2 = aVar4;
                aVar3 = aVar5;
                f10 = f13;
                z13 = true;
            } else {
                c15688rMo18372i.mo18363O(2005537059);
                InterfaceC7507e interfaceC7507eM8530o = C7482g.m8530o(aVar4, 0.0f, 130, 1);
                InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
                long j11 = c15688rMo18372i.f50813T;
                int i16 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8530o, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    aVar = aVar5;
                    c15688rMo18372i.mo18355G(aVar);
                } else {
                    aVar = aVar5;
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i16))) {
                    C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a2);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                aVar2 = aVar4;
                c21098a = c21098a2;
                aVar3 = aVar;
                f10 = f13;
                z13 = true;
                C16429v.m19068b(null, str5, null, null, 0.6632653f, null, null, false, false, false, false, false, c15688rMo18372i, ((i15 >> 15) & 112) | 905994240, 0, 3309);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(true);
                C1963W0.m2623a(C7482g.m8529n(aVar2, 20), c15688rMo18372i);
                Unit unit = Unit.INSTANCE;
                r11 = 0;
                c15688rMo18372i.m18410W(false);
            }
            final C18863f.b bVar3 = bVar2;
            C1982e.i iVar = new C1982e.i(f10, r11, new Function2() { // from class: H.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(bVar3.mo21165a(0, ((Integer) obj).intValue()));
                }
            });
            C18863f.a aVar6 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(iVar, aVar6, c15688rMo18372i, r11);
            long j12 = c15688rMo18372i.f50813T;
            int i17 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i17))) {
                C12269M6.m14188a(i17, c15688rMo18372i, i17, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
            C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.f6639c, aVar6, c15688rMo18372i, 0);
            long j13 = c15688rMo18372i.f50813T;
            int i18 = (int) (j13 ^ (j13 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R4 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(aVar2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R4, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i18))) {
                C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c4, c15688rMo18372i, eVar);
            final int i19 = i13;
            C7307B.m8143a(C18037u.m20404c(-2012831029, new Function2() { // from class: ne.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C11565Q2.m13480b(str, C7586d.m8700a(C7482g.m8530o(C7324q.m8149a(InterfaceC7507e.a.f24548b, z10), 500, 0.0f, 2), "test_tag_content_name_title"), 0L, 0L, null, 0L, null, 0L, 2, false, i19, 0, null, new C11732N0(C3376c.f10951l, C18580v.m21028b(40), new C16318q(600), 0L, 0, 0, C18580v.m21028b(40), 16646136), interfaceC15676n2, 0, 384, 110588);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 6);
            if (str2 == null) {
                c15688rMo18372i.mo18363O(1360040908);
                z14 = false;
                c15688rMo18372i.m18410W(false);
                f11 = 0.0f;
                i12 = 2;
            } else {
                c15688rMo18372i.mo18363O(1360040909);
                C1963W0.m2623a(C7482g.m8519d(aVar2, str5 != null ? 8 : 12), c15688rMo18372i);
                f11 = 0.0f;
                i12 = 2;
                C15688r c15688r = c15688rMo18372i;
                C11565Q2.m13480b(str2, C7482g.m8530o(C7324q.m8149a(aVar2, z10), 210, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, C3375b.f10932o, c15688r, (i15 >> 6) & 14, 24960, 110588);
                c15688rMo18372i = c15688r;
                Unit unit2 = Unit.INSTANCE;
                z14 = false;
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(z13);
            if (z10 || !StringsKt.isBlank(str3)) {
                c15688rMo18372i.mo18363O(1975789058);
                C15688r c15688r2 = c15688rMo18372i;
                C11565Q2.m13480b(str3, C7482g.m8530o(C7324q.m8149a(aVar2, z10), 350, f11, i12), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, C3375b.f10930m, c15688r2, (i15 >> 9) & 14, 24960, 110588);
                c15688rMo18372i = c15688r2;
                z14 = false;
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1976130647);
                c15688rMo18372i.m18410W(z14);
            }
            if (z10 || !StringsKt.isBlank(str4)) {
                c15688rMo18372i.mo18363O(1976196863);
                m19666d(((i15 >> 12) & 14) | ((i15 << 3) & 112) | ((i15 >> 9) & 896), str4, c15688rMo18372i, function0, z10);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(1976404439);
                c15688rMo18372i.m18410W(z14);
            }
            float f14 = 4;
            C1956T.m2617c(null, C1982e.m2645g(f14), C1982e.m2645g(f14), null, 0, 0, C18037u.m20404c(-188888752, new Function3() { // from class: ne.B
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        InterfaceC7507e.a aVar7 = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8530o2 = C7482g.m8530o(aVar7, 87, 0.0f, 2);
                        String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59771e0.getValue(), interfaceC15676n2, 0);
                        long j14 = (z12 || !z11) ? C3376c.f10942c : C3376c.f10957r;
                        boolean z15 = z10;
                        C17215m0.m19678b(interfaceC7507eM8530o2, z15, str6, strM19466e, j14, interfaceC15676n2, 6, 96);
                        C17215m0.m19678b(C7482g.m8530o(aVar7, 123, 0.0f, 2), z15, str8, C16973X.m19466e((C16972W) C19278b3.f59956N.getValue(), interfaceC15676n2, 0), 0L, interfaceC15676n2, 6, 112);
                        C17215m0.m19678b(C7482g.m8530o(aVar7, 88, 0.0f, 2), z15, str7, C16973X.m19466e((C16972W) C19278b3.f59932B.getValue(), interfaceC15676n2, 0), 0L, interfaceC15676n2, 6, 112);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 1573296, 57);
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: ne.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C17173I.m19665c(z10, str, str2, str3, str4, function0, str5, z11, z12, str6, str7, str8, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m19666d(final int i10, final String str, InterfaceC15676n interfaceC15676n, final Function0 function0, final boolean z10) {
        int i11;
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(131916089);
        if ((i10 & 6) == 0) {
            i11 = (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18364a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (!c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        } else if (c15688rMo18372i.mo18383t(C3765d.f12328a) == EnumC1896d.Tablet) {
            c15688rMo18372i.mo18363O(17294280);
            m19663a(i11 & 1022, str, c15688rMo18372i, function0, z10);
            c15688rMo18372i.m18410W(false);
            c15688r = c15688rMo18372i;
        } else {
            c15688rMo18372i.mo18363O(17478947);
            C11565Q2.m13480b(str, C7482g.m8529n(C7324q.m8149a(InterfaceC7507e.a.f24548b, z10), 600), 0L, 0L, null, 0L, null, 0L, 2, false, 2, 2, null, C11732N0.m13585a(C3375b.f10930m, C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, i11 & 14, 221568, 77820);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(false);
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: ne.D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C17173I.m19666d(C15636Z0.m18294a(i10 | 1), str, (InterfaceC15676n) obj, function0, z10);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
