package nf;

import af.C7309b;
import androidx.compose.animation.C7466a;
import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
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
import mg.C17040c;
import mg.C17055r;
import ne.C17229w;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p001A0.C0009h;
import p019B0.InterfaceC0179H;
import p055D0.C0998l0;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1961V0;
import p126H.C1982e;
import p126H.C2000k;
import p144I.C2192a;
import p163J0.C2431d;
import p214Lf.C3375b;
import p214Lf.C3376c;
import p214Lf.C3377d;
import p270P.C4025f;
import p304Qf.C4600a;
import p361U0.InterfaceC5178F;
import p361U0.InterfaceC5208f;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11565Q2;
import p579h0.C11569S;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15658h;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p829w.C18854w;
import p830w0.InterfaceC18861d;
import p845wg.C19278b3;
import p846x.C19558o;

/* JADX INFO: renamed from: nf.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainMenuButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMenuButton.kt\nru/zona/app/screens/ui/tv/menu/MainMenuButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,168:1\n1282#2,6:169\n1282#2,6:175\n1282#2,6:181\n1282#2,6:225\n1282#2,6:364\n70#3:187\n66#3,10:188\n70#3:273\n66#3,10:274\n77#3:316\n77#3:324\n80#4,6:198\n87#4,3:213\n90#4,2:222\n80#4,6:246\n87#4,3:261\n90#4,2:270\n80#4,6:284\n87#4,3:299\n90#4,2:308\n94#4:315\n94#4:319\n94#4:323\n80#4,6:337\n87#4,3:352\n90#4,2:361\n94#4:372\n80#4,6:390\n87#4,3:405\n90#4,2:414\n94#4:420\n391#5,9:204\n400#5:224\n391#5,9:252\n400#5:272\n391#5,9:290\n400#5:310\n401#5,2:313\n401#5,2:317\n401#5,2:321\n391#5,9:343\n400#5:363\n401#5,2:370\n391#5,9:396\n400#5:416\n401#5,2:418\n4360#6,6:216\n4360#6,6:264\n4360#6,6:302\n4360#6,6:355\n4360#6,6:408\n15#7,7:231\n113#8:238\n113#8:239\n113#8:311\n113#8:312\n113#8:325\n113#8:326\n113#8:417\n113#8:422\n99#9,6:240\n106#9:320\n99#9:379\n95#9,10:380\n106#9:421\n87#10:327\n84#10,9:328\n94#10:373\n85#11:374\n117#11,2:375\n85#11:377\n85#11:378\n*S KotlinDebug\n*F\n+ 1 MainMenuButton.kt\nru/zona/app/screens/ui/tv/menu/MainMenuButtonKt\n*L\n60#1:169,6\n61#1:175,6\n65#1:181,6\n77#1:225,6\n164#1:364,6\n73#1:187\n73#1:188,10\n87#1:273\n87#1:274,10\n87#1:316\n73#1:324\n73#1:198,6\n73#1:213,3\n73#1:222,2\n74#1:246,6\n74#1:261,3\n74#1:270,2\n87#1:284,6\n87#1:299,3\n87#1:308,2\n87#1:315\n74#1:319\n73#1:323\n154#1:337,6\n154#1:352,3\n154#1:361,2\n154#1:372\n111#1:390,6\n111#1:405,3\n111#1:414,2\n111#1:420\n73#1:204,9\n73#1:224\n74#1:252,9\n74#1:272\n87#1:290,9\n87#1:310\n87#1:313,2\n74#1:317,2\n73#1:321,2\n154#1:343,9\n154#1:363\n154#1:370,2\n111#1:396,9\n111#1:416\n111#1:418,2\n73#1:216,6\n74#1:264,6\n87#1:302,6\n154#1:355,6\n111#1:408,6\n78#1:231,7\n83#1:238\n85#1:239\n89#1:311\n99#1:312\n143#1:325\n157#1:326\n114#1:417\n126#1:422\n74#1:240,6\n74#1:320\n111#1:379\n111#1:380,10\n111#1:421\n154#1:327\n154#1:328,9\n154#1:373\n60#1:374\n60#1:375,2\n61#1:377\n65#1:378\n*E\n"})
public final class C17241i {
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x015a  */
    /* JADX WARN: Code duplicated, block: B:108:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x016a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0176  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0182  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:138:0x0255  */
    /* JADX WARN: Code duplicated, block: B:139:0x0259  */
    /* JADX WARN: Code duplicated, block: B:142:0x0266  */
    /* JADX WARN: Code duplicated, block: B:144:0x0274  */
    /* JADX WARN: Code duplicated, block: B:147:0x0298  */
    /* JADX WARN: Code duplicated, block: B:148:0x029c  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x0304  */
    /* JADX WARN: Code duplicated, block: B:165:0x030d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0310  */
    /* JADX WARN: Code duplicated, block: B:169:0x0343  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m19686a(final Function0 function0, final C4600a c4600a, String str, final String str2, final boolean z10, final boolean z11, String str3, boolean z12, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        int i12;
        String str4;
        int i13;
        String str5;
        int i14;
        int i15;
        boolean z13;
        int i16;
        int i17;
        boolean z14;
        final String str6;
        final boolean z15;
        final String str7;
        C15634Y0 c15634y0M18412Y;
        String str8;
        Object objMo18389z;
        InterfaceC15676n.a.C21235a c21235a;
        final InterfaceC15701v0 interfaceC15701v0;
        int i18;
        boolean z16;
        boolean z17;
        long j10;
        Object objM19683a;
        boolean z18;
        boolean z19;
        Object objMo18389z2;
        long j11;
        InterfaceC15701v0 interfaceC15701v1;
        int i19;
        InterfaceC7507e.a aVar;
        C5753J.a aVar2;
        InterfaceC5799g.a.C21098a c21098a;
        InterfaceC15701v0 interfaceC15701v2;
        Object objMo18389z3;
        int i20;
        int i21;
        boolean z20;
        C2431d c2431dM5205b;
        C15688r c15688r;
        boolean z21;
        String str9;
        int i22;
        int i23;
        int i24;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(704215565);
        if ((i10 & 6) == 0) {
            i12 = (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? c15688rMo18372i.mo18362N(c4600a) : c15688rMo18372i.mo18350B(c4600a) ? 32 : 16;
        }
        int i25 = i11 & 4;
        if (i25 == 0) {
            if ((i10 & 384) == 0) {
                str4 = str;
                i12 |= c15688rMo18372i.mo18362N(str4) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i10 & 3072) == 0) {
                if (c15688rMo18372i.mo18362N(str2)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i12 |= i24;
            }
            if ((i10 & 24576) == 0) {
                if (c15688rMo18372i.mo18364a(z10)) {
                    i23 = 16384;
                } else {
                    i23 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i12 |= i23;
            }
            if ((196608 & i10) == 0) {
                if (c15688rMo18372i.mo18364a(z11)) {
                    i22 = 131072;
                } else {
                    i22 = Parser.ARGC_LIMIT;
                }
                i12 |= i22;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                str5 = str3;
            } else {
                str5 = str3;
                if ((i10 & 1572864) == 0) {
                    if (c15688rMo18372i.mo18362N(str5)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
                z13 = z12;
            } else {
                z13 = z12;
                if ((i10 & 12582912) == 0) {
                    if (c15688rMo18372i.mo18364a(z13)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
            }
            i17 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c15688rMo18372i.mo18379p(i17 & 1, z14)) {
                if (i25 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                if (i13 != 0) {
                    str5 = null;
                }
                if (i15 != 0) {
                    z13 = false;
                }
                objMo18389z = c15688rMo18372i.mo18389z();
                c21235a = InterfaceC15676n.a.f50781a;
                if (objMo18389z == c21235a) {
                    objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
                boolean zMo18364a = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
                i18 = i17 & 57344;
                if (i18 == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zMo18364a;
                Object objMo18389z4 = c15688rMo18372i.mo18389z();
                if (!z17 || objMo18389z4 == c21235a) {
                    if (!z10 || ((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                        j10 = C3376c.f10951l;
                    } else {
                        j10 = C3376c.f10942c;
                    }
                    objM19683a = C17229w.m19683a(j10, c15688rMo18372i);
                } else {
                    objM19683a = objMo18389z4;
                }
                final InterfaceC15701v0 interfaceC15701v3 = (InterfaceC15701v0) objM19683a;
                boolean zMo18364a2 = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
                if (i18 == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | zMo18364a2;
                objMo18389z2 = c15688rMo18372i.mo18389z();
                if (z19 || objMo18389z2 == c21235a) {
                    if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                        j11 = C3376c.f10957r;
                    } else if (z10) {
                        j11 = C3376c.f10944e;
                    } else {
                        j11 = C3376c.f10965z;
                    }
                    objMo18389z2 = C17229w.m19683a(j11, c15688rMo18372i);
                }
                interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
                InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58749c, false);
                long j12 = c15688rMo18372i.f50813T;
                i19 = (int) (j12 ^ (j12 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                aVar = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(aVar, c15688rMo18372i);
                InterfaceC5799g.f19145s1.getClass();
                aVar2 = InterfaceC5799g.a.f19147b;
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
                C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
                InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
                C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
                c21098a = InterfaceC5799g.a.f19154i;
                if (c15688rMo18372i.f50812S) {
                    interfaceC15701v2 = interfaceC15701v1;
                } else {
                    interfaceC15701v2 = interfaceC15701v1;
                    if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i19))) {
                    }
                    InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                    C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
                    InterfaceC7507e interfaceC7507eM19502d = C17055r.m19502d(aVar, str5, new C17233a(), c15688rMo18372i, ((i17 >> 15) & 112) | 6);
                    objMo18389z3 = c15688rMo18372i.mo18389z();
                    if (objMo18389z3 == c21235a) {
                        objMo18389z3 = new Function1() { // from class: nf.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                interfaceC15701v0.setValue(Boolean.valueOf(((InterfaceC0179H) obj).mo236b()));
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z3);
                    }
                    String str10 = str5;
                    InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7468a.m8487b(C7503c.m8564a(C7510a.m8576a(interfaceC7507eM19502d, (Function1) objMo18389z3), C6138n1.f20157a, new C17240h(function0)), ((C0998l0) interfaceC15701v2.getValue()).f3476a, C4025f.m4708a()), 16, 8);
                    C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(12), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
                    long j13 = c15688rMo18372i.f50813T;
                    i20 = (int) (j13 ^ (j13 >>> 32));
                    InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
                    c15688rMo18372i.mo18353E();
                    if (c15688rMo18372i.f50812S) {
                        c15688rMo18372i.mo18355G(aVar2);
                    } else {
                        c15688rMo18372i.mo18378o();
                    }
                    C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
                    C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
                    if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i20))) {
                        C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
                    InterfaceC5178F interfaceC5178FM2677d2 = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
                    long j14 = c15688rMo18372i.f50813T;
                    i21 = (int) (j14 ^ (j14 >>> 32));
                    InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar, c15688rMo18372i);
                    c15688rMo18372i.mo18353E();
                    if (c15688rMo18372i.f50812S) {
                        c15688rMo18372i.mo18355G(aVar2);
                    } else {
                        c15688rMo18372i.mo18378o();
                    }
                    C15623T1.m18280a(interfaceC5178FM2677d2, c15688rMo18372i, dVar);
                    C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
                    if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i21))) {
                        C12269M6.m14188a(i21, c15688rMo18372i, i21, c21098a);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
                    InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(aVar, 24);
                    if (z10) {
                        c15688rMo18372i.mo18363O(-1253910879);
                        c2431dM5205b = c4600a.m5204a(c15688rMo18372i);
                        z20 = false;
                    } else {
                        z20 = false;
                        c15688rMo18372i.mo18363O(-1253910398);
                        c2431dM5205b = c4600a.m5205b((i17 >> 3) & 14, c15688rMo18372i);
                    }
                    c15688rMo18372i.m18410W(z20);
                    C2431d c2431d = c2431dM5205b;
                    final boolean z22 = z13;
                    C11569S.m13483b(c2431d, null, interfaceC7507eM8525j, ((C0998l0) interfaceC15701v3.getValue()).f3476a, c15688rMo18372i, 432, 0);
                    c15688r = c15688rMo18372i;
                    if (str8 != null || StringsKt.isBlank(str8)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (z21) {
                        str9 = str8;
                        c15688r.mo18363O(-216055547);
                        c15688r.m18410W(false);
                    } else {
                        c15688r.mo18363O(-216330951);
                        String str11 = str8;
                        C17040c.m19494a(C0009h.m22a(C7482g.m8525j(aVar, 18), C3377d.f10966a), str11, null, InterfaceC5208f.a.f17030a, false, 0.0f, null, c15688r, ((i17 >> 3) & 112) | 3072, 116);
                        str9 = str11;
                        c15688r = c15688r;
                        c15688r.m18410W(false);
                    }
                    c15688r.m18410W(true);
                    C7466a.m8482d(z11, null, null, C18854w.m21159e(C19558o.m21435b(0.0f, 700.0f, null, 5), 2).m21149b(C18854w.m21160f(15)), null, C18037u.m20404c(-1470893813, new Function3() { // from class: nf.c
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                                C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, interfaceC15676n2, 0);
                                long jMo18375l = interfaceC15676n2.mo18375l();
                                int i26 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                                InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                                InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
                                InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(aVar3, interfaceC15676n2);
                                InterfaceC5799g.f19145s1.getClass();
                                C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
                                if (interfaceC15676n2.mo18374k() == null) {
                                    C15658h.m18343a();
                                    throw null;
                                }
                                interfaceC15676n2.mo18353E();
                                if (interfaceC15676n2.mo18370g()) {
                                    interfaceC15676n2.mo18355G(aVar4);
                                } else {
                                    interfaceC15676n2.mo18378o();
                                }
                                C15623T1.m18280a(c1952q0M2608a2, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                                C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                                InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                                if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i26))) {
                                    C1961V0.m2622a(i26, interfaceC15676n2, i26, c21098a2);
                                }
                                C15623T1.m18280a(interfaceC7507eM8566c4, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                                InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar3, 0.0f, 0.0f, 16, 0.0f, 11);
                                if (1.0f <= 0.0d) {
                                    C2192a.m2845a("invalid weight; must be greater than zero");
                                }
                                C11565Q2.m13480b(str2, interfaceC7507eM8515h.mo2665S0(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true)), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, C11732N0.m13585a(C3375b.f10931n, ((C0998l0) interfaceC15701v3.getValue()).f3476a, 0L, null, null, 0L, null, 0L, null, null, 16777214), interfaceC15676n2, 0, 24960, 110588);
                                if (z22) {
                                    interfaceC15676n2.mo18363O(1821535644);
                                    C17241i.m19687b(((Boolean) interfaceC15701v0.getValue()).booleanValue(), interfaceC15676n2, 0);
                                } else {
                                    interfaceC15676n2.mo18363O(633050299);
                                }
                                interfaceC15676n2.mo18357I();
                                interfaceC15676n2.mo18381r();
                            } else {
                                interfaceC15676n2.mo18356H();
                            }
                            return Unit.INSTANCE;
                        }
                    }, c15688r), c15688r, 1597446 | ((i17 >> 12) & 112), 22);
                    c15688r.m18410W(true);
                    C15688r c15688r2 = c15688r;
                    C7466a.m8481c(!z11, null, null, null, null, C18037u.m20404c(92129263, new Function3() { // from class: nf.d
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                                if (z22) {
                                    interfaceC15676n2.mo18363O(-1658090409);
                                    C7309b.m8144a(7, 4, interfaceC15676n2, 54, 0);
                                } else {
                                    interfaceC15676n2.mo18363O(138843315);
                                }
                                interfaceC15676n2.mo18357I();
                            } else {
                                interfaceC15676n2.mo18356H();
                            }
                            return Unit.INSTANCE;
                        }
                    }, c15688r), c15688r2, 196608, 30);
                    c15688rMo18372i = c15688r2;
                    c15688rMo18372i.m18410W(true);
                    z15 = z22;
                    str6 = str10;
                    str7 = str9;
                }
                C12269M6.m14188a(i19, c15688rMo18372i, i19, c21098a);
                InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar2);
                InterfaceC7507e interfaceC7507eM19502d2 = C17055r.m19502d(aVar, str5, new C17233a(), c15688rMo18372i, ((i17 >> 15) & 112) | 6);
                objMo18389z3 = c15688rMo18372i.mo18389z();
                if (objMo18389z3 == c21235a) {
                    objMo18389z3 = new Function1() { // from class: nf.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            interfaceC15701v0.setValue(Boolean.valueOf(((InterfaceC0179H) obj).mo236b()));
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z3);
                }
                String str12 = str5;
                InterfaceC7507e interfaceC7507eM8512e2 = C7481f.m8512e(C7468a.m8487b(C7503c.m8564a(C7510a.m8576a(interfaceC7507eM19502d2, (Function1) objMo18389z3), C6138n1.f20157a, new C17240h(function0)), ((C0998l0) interfaceC15701v2.getValue()).f3476a, C4025f.m4708a()), 16, 8);
                C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(C1982e.m2645g(12), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
                long j15 = c15688rMo18372i.f50813T;
                i20 = (int) (j15 ^ (j15 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R4 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(interfaceC7507eM8512e2, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a2, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R4, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
                } else {
                    C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c4, c15688rMo18372i, eVar2);
                InterfaceC5178F interfaceC5178FM2677d3 = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
                long j16 = c15688rMo18372i.f50813T;
                i21 = (int) (j16 ^ (j16 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R5 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c5 = C7503c.m8566c(aVar, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d3, c15688rMo18372i, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R5, c15688rMo18372i, fVar);
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i21, c15688rMo18372i, i21, c21098a);
                } else {
                    C12269M6.m14188a(i21, c15688rMo18372i, i21, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c5, c15688rMo18372i, eVar2);
                InterfaceC7507e interfaceC7507eM8525j2 = C7482g.m8525j(aVar, 24);
                if (z10) {
                    c15688rMo18372i.mo18363O(-1253910879);
                    c2431dM5205b = c4600a.m5204a(c15688rMo18372i);
                    z20 = false;
                } else {
                    z20 = false;
                    c15688rMo18372i.mo18363O(-1253910398);
                    c2431dM5205b = c4600a.m5205b((i17 >> 3) & 14, c15688rMo18372i);
                }
                c15688rMo18372i.m18410W(z20);
                C2431d c2431d2 = c2431dM5205b;
                final boolean z23 = z13;
                C11569S.m13483b(c2431d2, null, interfaceC7507eM8525j2, ((C0998l0) interfaceC15701v3.getValue()).f3476a, c15688rMo18372i, 432, 0);
                c15688r = c15688rMo18372i;
                if (str8 != null) {
                    z21 = true;
                } else {
                    z21 = true;
                }
                if (z21) {
                    c15688r.mo18363O(-216330951);
                    String str13 = str8;
                    C17040c.m19494a(C0009h.m22a(C7482g.m8525j(aVar, 18), C3377d.f10966a), str13, null, InterfaceC5208f.a.f17030a, false, 0.0f, null, c15688r, ((i17 >> 3) & 112) | 3072, 116);
                    str9 = str13;
                    c15688r = c15688r;
                    c15688r.m18410W(false);
                } else {
                    str9 = str8;
                    c15688r.mo18363O(-216055547);
                    c15688r.m18410W(false);
                }
                c15688r.m18410W(true);
                C7466a.m8482d(z11, null, null, C18854w.m21159e(C19558o.m21435b(0.0f, 700.0f, null, 5), 2).m21149b(C18854w.m21160f(15)), null, C18037u.m20404c(-1470893813, new Function3() { // from class: nf.c
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                            C1952Q0 c1952q0M2608a3 = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, interfaceC15676n2, 0);
                            long jMo18375l = interfaceC15676n2.mo18375l();
                            int i26 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                            InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                            InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
                            InterfaceC7507e interfaceC7507eM8566c6 = C7503c.m8566c(aVar3, interfaceC15676n2);
                            InterfaceC5799g.f19145s1.getClass();
                            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
                            if (interfaceC15676n2.mo18374k() == null) {
                                C15658h.m18343a();
                                throw null;
                            }
                            interfaceC15676n2.mo18353E();
                            if (interfaceC15676n2.mo18370g()) {
                                interfaceC15676n2.mo18355G(aVar4);
                            } else {
                                interfaceC15676n2.mo18378o();
                            }
                            C15623T1.m18280a(c1952q0M2608a3, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                            C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                            InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                            if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i26))) {
                                C1961V0.m2622a(i26, interfaceC15676n2, i26, c21098a2);
                            }
                            C15623T1.m18280a(interfaceC7507eM8566c6, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar3, 0.0f, 0.0f, 16, 0.0f, 11);
                            if (1.0f <= 0.0d) {
                                C2192a.m2845a("invalid weight; must be greater than zero");
                            }
                            C11565Q2.m13480b(str2, interfaceC7507eM8515h.mo2665S0(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true)), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, C11732N0.m13585a(C3375b.f10931n, ((C0998l0) interfaceC15701v3.getValue()).f3476a, 0L, null, null, 0L, null, 0L, null, null, 16777214), interfaceC15676n2, 0, 24960, 110588);
                            if (z23) {
                                interfaceC15676n2.mo18363O(1821535644);
                                C17241i.m19687b(((Boolean) interfaceC15701v0.getValue()).booleanValue(), interfaceC15676n2, 0);
                            } else {
                                interfaceC15676n2.mo18363O(633050299);
                            }
                            interfaceC15676n2.mo18357I();
                            interfaceC15676n2.mo18381r();
                        } else {
                            interfaceC15676n2.mo18356H();
                        }
                        return Unit.INSTANCE;
                    }
                }, c15688r), c15688r, 1597446 | ((i17 >> 12) & 112), 22);
                c15688r.m18410W(true);
                C15688r c15688r3 = c15688r;
                C7466a.m8481c(!z11, null, null, null, null, C18037u.m20404c(92129263, new Function3() { // from class: nf.d
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                            if (z23) {
                                interfaceC15676n2.mo18363O(-1658090409);
                                C7309b.m8144a(7, 4, interfaceC15676n2, 54, 0);
                            } else {
                                interfaceC15676n2.mo18363O(138843315);
                            }
                            interfaceC15676n2.mo18357I();
                        } else {
                            interfaceC15676n2.mo18356H();
                        }
                        return Unit.INSTANCE;
                    }
                }, c15688r), c15688r3, 196608, 30);
                c15688rMo18372i = c15688r3;
                c15688rMo18372i.m18410W(true);
                z15 = z23;
                str6 = str12;
                str7 = str9;
            } else {
                c15688rMo18372i.mo18356H();
                str6 = str5;
                z15 = z13;
                str7 = str4;
            }
            c15634y0M18412Y = c15688rMo18372i.m18412Y();
            if (c15634y0M18412Y != null) {
                c15634y0M18412Y.f50634d = new Function2() { // from class: nf.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        C17241i.m19686a(function0, c4600a, str7, str2, z10, z11, str6, z15, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1), i11);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i12 |= 384;
        str4 = str;
        if ((i10 & 3072) == 0) {
            if (c15688rMo18372i.mo18362N(str2)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i12 |= i24;
        }
        if ((i10 & 24576) == 0) {
            if (c15688rMo18372i.mo18364a(z10)) {
                i23 = 16384;
            } else {
                i23 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i12 |= i23;
        }
        if ((196608 & i10) == 0) {
            if (c15688rMo18372i.mo18364a(z11)) {
                i22 = 131072;
            } else {
                i22 = Parser.ARGC_LIMIT;
            }
            i12 |= i22;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            str5 = str3;
        } else {
            str5 = str3;
            if ((i10 & 1572864) == 0) {
                if (c15688rMo18372i.mo18362N(str5)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
            z13 = z12;
        } else {
            z13 = z12;
            if ((i10 & 12582912) == 0) {
                if (c15688rMo18372i.mo18364a(z13)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
        }
        i17 = i12;
        if ((i12 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c15688rMo18372i.mo18379p(i17 & 1, z14)) {
            if (i25 != 0) {
                str8 = null;
            } else {
                str8 = str4;
            }
            if (i13 != 0) {
                str5 = null;
            }
            if (i15 != 0) {
                z13 = false;
            }
            objMo18389z = c15688rMo18372i.mo18389z();
            c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            boolean zMo18364a3 = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
            i18 = i17 & 57344;
            if (i18 == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | zMo18364a3;
            Object objMo18389z5 = c15688rMo18372i.mo18389z();
            if (z17) {
                if (z10) {
                    j10 = C3376c.f10951l;
                } else {
                    j10 = C3376c.f10951l;
                }
                objM19683a = C17229w.m19683a(j10, c15688rMo18372i);
            } else {
                if (z10) {
                    j10 = C3376c.f10951l;
                } else {
                    j10 = C3376c.f10951l;
                }
                objM19683a = C17229w.m19683a(j10, c15688rMo18372i);
            }
            final InterfaceC15701v0 interfaceC15701v4 = (InterfaceC15701v0) objM19683a;
            boolean zMo18364a4 = c15688rMo18372i.mo18364a(((Boolean) interfaceC15701v0.getValue()).booleanValue());
            if (i18 == 16384) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | zMo18364a4;
            objMo18389z2 = c15688rMo18372i.mo18389z();
            if (z19) {
                if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                    j11 = C3376c.f10957r;
                } else if (z10) {
                    j11 = C3376c.f10944e;
                } else {
                    j11 = C3376c.f10965z;
                }
                objMo18389z2 = C17229w.m19683a(j11, c15688rMo18372i);
            } else {
                if (((Boolean) interfaceC15701v0.getValue()).booleanValue()) {
                    j11 = C3376c.f10957r;
                } else if (z10) {
                    j11 = C3376c.f10944e;
                } else {
                    j11 = C3376c.f10965z;
                }
                objMo18389z2 = C17229w.m19683a(j11, c15688rMo18372i);
            }
            interfaceC15701v1 = (InterfaceC15701v0) objMo18389z2;
            InterfaceC5178F interfaceC5178FM2677d4 = C2000k.m2677d(InterfaceC18861d.a.f58749c, false);
            long j17 = c15688rMo18372i.f50813T;
            i19 = (int) (j17 ^ (j17 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R6 = c15688rMo18372i.m18405R();
            aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8566c6 = C7503c.m8566c(aVar, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar2 = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(interfaceC5178FM2677d4, c15688rMo18372i, dVar2);
            InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R6, c15688rMo18372i, fVar2);
            c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                interfaceC15701v2 = interfaceC15701v1;
                if (!Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i19))) {
                }
                InterfaceC5799g.a.e eVar3 = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c6, c15688rMo18372i, eVar3);
                InterfaceC7507e interfaceC7507eM19502d3 = C17055r.m19502d(aVar, str5, new C17233a(), c15688rMo18372i, ((i17 >> 15) & 112) | 6);
                objMo18389z3 = c15688rMo18372i.mo18389z();
                if (objMo18389z3 == c21235a) {
                    objMo18389z3 = new Function1() { // from class: nf.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            interfaceC15701v0.setValue(Boolean.valueOf(((InterfaceC0179H) obj).mo236b()));
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z3);
                }
                String str14 = str5;
                InterfaceC7507e interfaceC7507eM8512e3 = C7481f.m8512e(C7468a.m8487b(C7503c.m8564a(C7510a.m8576a(interfaceC7507eM19502d3, (Function1) objMo18389z3), C6138n1.f20157a, new C17240h(function0)), ((C0998l0) interfaceC15701v2.getValue()).f3476a, C4025f.m4708a()), 16, 8);
                C1952Q0 c1952q0M2608a3 = C1948O0.m2608a(C1982e.m2645g(12), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
                long j18 = c15688rMo18372i.f50813T;
                i20 = (int) (j18 ^ (j18 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R7 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c7 = C7503c.m8566c(interfaceC7507eM8512e3, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a3, c15688rMo18372i, dVar2);
                C15623T1.m18280a(interfaceC15608O0M18405R7, c15688rMo18372i, fVar2);
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
                } else {
                    C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c7, c15688rMo18372i, eVar3);
                InterfaceC5178F interfaceC5178FM2677d5 = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
                long j19 = c15688rMo18372i.f50813T;
                i21 = (int) (j19 ^ (j19 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R8 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c8 = C7503c.m8566c(aVar, c15688rMo18372i);
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(interfaceC5178FM2677d5, c15688rMo18372i, dVar2);
                C15623T1.m18280a(interfaceC15608O0M18405R8, c15688rMo18372i, fVar2);
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i21, c15688rMo18372i, i21, c21098a);
                } else {
                    C12269M6.m14188a(i21, c15688rMo18372i, i21, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c8, c15688rMo18372i, eVar3);
                InterfaceC7507e interfaceC7507eM8525j3 = C7482g.m8525j(aVar, 24);
                if (z10) {
                    c15688rMo18372i.mo18363O(-1253910879);
                    c2431dM5205b = c4600a.m5204a(c15688rMo18372i);
                    z20 = false;
                } else {
                    z20 = false;
                    c15688rMo18372i.mo18363O(-1253910398);
                    c2431dM5205b = c4600a.m5205b((i17 >> 3) & 14, c15688rMo18372i);
                }
                c15688rMo18372i.m18410W(z20);
                C2431d c2431d3 = c2431dM5205b;
                final boolean z24 = z13;
                C11569S.m13483b(c2431d3, null, interfaceC7507eM8525j3, ((C0998l0) interfaceC15701v4.getValue()).f3476a, c15688rMo18372i, 432, 0);
                c15688r = c15688rMo18372i;
                if (str8 != null) {
                    z21 = true;
                } else {
                    z21 = true;
                }
                if (z21) {
                    c15688r.mo18363O(-216330951);
                    String str15 = str8;
                    C17040c.m19494a(C0009h.m22a(C7482g.m8525j(aVar, 18), C3377d.f10966a), str15, null, InterfaceC5208f.a.f17030a, false, 0.0f, null, c15688r, ((i17 >> 3) & 112) | 3072, 116);
                    str9 = str15;
                    c15688r = c15688r;
                    c15688r.m18410W(false);
                } else {
                    str9 = str8;
                    c15688r.mo18363O(-216055547);
                    c15688r.m18410W(false);
                }
                c15688r.m18410W(true);
                C7466a.m8482d(z11, null, null, C18854w.m21159e(C19558o.m21435b(0.0f, 700.0f, null, 5), 2).m21149b(C18854w.m21160f(15)), null, C18037u.m20404c(-1470893813, new Function3() { // from class: nf.c
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                            C1952Q0 c1952q0M2608a4 = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, interfaceC15676n2, 0);
                            long jMo18375l = interfaceC15676n2.mo18375l();
                            int i26 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                            InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                            InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
                            InterfaceC7507e interfaceC7507eM8566c9 = C7503c.m8566c(aVar3, interfaceC15676n2);
                            InterfaceC5799g.f19145s1.getClass();
                            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
                            if (interfaceC15676n2.mo18374k() == null) {
                                C15658h.m18343a();
                                throw null;
                            }
                            interfaceC15676n2.mo18353E();
                            if (interfaceC15676n2.mo18370g()) {
                                interfaceC15676n2.mo18355G(aVar4);
                            } else {
                                interfaceC15676n2.mo18378o();
                            }
                            C15623T1.m18280a(c1952q0M2608a4, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                            C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                            InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                            if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i26))) {
                                C1961V0.m2622a(i26, interfaceC15676n2, i26, c21098a2);
                            }
                            C15623T1.m18280a(interfaceC7507eM8566c9, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                            InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar3, 0.0f, 0.0f, 16, 0.0f, 11);
                            if (1.0f <= 0.0d) {
                                C2192a.m2845a("invalid weight; must be greater than zero");
                            }
                            C11565Q2.m13480b(str2, interfaceC7507eM8515h.mo2665S0(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true)), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, C11732N0.m13585a(C3375b.f10931n, ((C0998l0) interfaceC15701v4.getValue()).f3476a, 0L, null, null, 0L, null, 0L, null, null, 16777214), interfaceC15676n2, 0, 24960, 110588);
                            if (z24) {
                                interfaceC15676n2.mo18363O(1821535644);
                                C17241i.m19687b(((Boolean) interfaceC15701v0.getValue()).booleanValue(), interfaceC15676n2, 0);
                            } else {
                                interfaceC15676n2.mo18363O(633050299);
                            }
                            interfaceC15676n2.mo18357I();
                            interfaceC15676n2.mo18381r();
                        } else {
                            interfaceC15676n2.mo18356H();
                        }
                        return Unit.INSTANCE;
                    }
                }, c15688r), c15688r, 1597446 | ((i17 >> 12) & 112), 22);
                c15688r.m18410W(true);
                C15688r c15688r4 = c15688r;
                C7466a.m8481c(!z11, null, null, null, null, C18037u.m20404c(92129263, new Function3() { // from class: nf.d
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                            if (z24) {
                                interfaceC15676n2.mo18363O(-1658090409);
                                C7309b.m8144a(7, 4, interfaceC15676n2, 54, 0);
                            } else {
                                interfaceC15676n2.mo18363O(138843315);
                            }
                            interfaceC15676n2.mo18357I();
                        } else {
                            interfaceC15676n2.mo18356H();
                        }
                        return Unit.INSTANCE;
                    }
                }, c15688r), c15688r4, 196608, 30);
                c15688rMo18372i = c15688r4;
                c15688rMo18372i.m18410W(true);
                z15 = z24;
                str6 = str14;
                str7 = str9;
            } else {
                interfaceC15701v2 = interfaceC15701v1;
            }
            C12269M6.m14188a(i19, c15688rMo18372i, i19, c21098a);
            InterfaceC5799g.a.e eVar4 = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c6, c15688rMo18372i, eVar4);
            InterfaceC7507e interfaceC7507eM19502d4 = C17055r.m19502d(aVar, str5, new C17233a(), c15688rMo18372i, ((i17 >> 15) & 112) | 6);
            objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new Function1() { // from class: nf.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        interfaceC15701v0.setValue(Boolean.valueOf(((InterfaceC0179H) obj).mo236b()));
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            String str16 = str5;
            InterfaceC7507e interfaceC7507eM8512e4 = C7481f.m8512e(C7468a.m8487b(C7503c.m8564a(C7510a.m8576a(interfaceC7507eM19502d4, (Function1) objMo18389z3), C6138n1.f20157a, new C17240h(function0)), ((C0998l0) interfaceC15701v2.getValue()).f3476a, C4025f.m4708a()), 16, 8);
            C1952Q0 c1952q0M2608a4 = C1948O0.m2608a(C1982e.m2645g(12), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j110 = c15688rMo18372i.f50813T;
            i20 = (int) (j110 ^ (j110 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R9 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c9 = C7503c.m8566c(interfaceC7507eM8512e4, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a4, c15688rMo18372i, dVar2);
            C15623T1.m18280a(interfaceC15608O0M18405R9, c15688rMo18372i, fVar2);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
            } else {
                C12269M6.m14188a(i20, c15688rMo18372i, i20, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c9, c15688rMo18372i, eVar4);
            InterfaceC5178F interfaceC5178FM2677d6 = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
            long j111 = c15688rMo18372i.f50813T;
            i21 = (int) (j111 ^ (j111 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R10 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c10 = C7503c.m8566c(aVar, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d6, c15688rMo18372i, dVar2);
            C15623T1.m18280a(interfaceC15608O0M18405R10, c15688rMo18372i, fVar2);
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i21, c15688rMo18372i, i21, c21098a);
            } else {
                C12269M6.m14188a(i21, c15688rMo18372i, i21, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c10, c15688rMo18372i, eVar4);
            InterfaceC7507e interfaceC7507eM8525j4 = C7482g.m8525j(aVar, 24);
            if (z10) {
                c15688rMo18372i.mo18363O(-1253910879);
                c2431dM5205b = c4600a.m5204a(c15688rMo18372i);
                z20 = false;
            } else {
                z20 = false;
                c15688rMo18372i.mo18363O(-1253910398);
                c2431dM5205b = c4600a.m5205b((i17 >> 3) & 14, c15688rMo18372i);
            }
            c15688rMo18372i.m18410W(z20);
            C2431d c2431d4 = c2431dM5205b;
            final boolean z25 = z13;
            C11569S.m13483b(c2431d4, null, interfaceC7507eM8525j4, ((C0998l0) interfaceC15701v4.getValue()).f3476a, c15688rMo18372i, 432, 0);
            c15688r = c15688rMo18372i;
            if (str8 != null) {
                z21 = true;
            } else {
                z21 = true;
            }
            if (z21) {
                c15688r.mo18363O(-216330951);
                String str17 = str8;
                C17040c.m19494a(C0009h.m22a(C7482g.m8525j(aVar, 18), C3377d.f10966a), str17, null, InterfaceC5208f.a.f17030a, false, 0.0f, null, c15688r, ((i17 >> 3) & 112) | 3072, 116);
                str9 = str17;
                c15688r = c15688r;
                c15688r.m18410W(false);
            } else {
                str9 = str8;
                c15688r.mo18363O(-216055547);
                c15688r.m18410W(false);
            }
            c15688r.m18410W(true);
            C7466a.m8482d(z11, null, null, C18854w.m21159e(C19558o.m21435b(0.0f, 700.0f, null, 5), 2).m21149b(C18854w.m21160f(15)), null, C18037u.m20404c(-1470893813, new Function3() { // from class: nf.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        C1952Q0 c1952q0M2608a5 = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, interfaceC15676n2, 0);
                        long jMo18375l = interfaceC15676n2.mo18375l();
                        int i26 = (int) (jMo18375l ^ (jMo18375l >>> 32));
                        InterfaceC15608O0 interfaceC15608O0Mo18377n = interfaceC15676n2.mo18377n();
                        InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8566c11 = C7503c.m8566c(aVar3, interfaceC15676n2);
                        InterfaceC5799g.f19145s1.getClass();
                        C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
                        if (interfaceC15676n2.mo18374k() == null) {
                            C15658h.m18343a();
                            throw null;
                        }
                        interfaceC15676n2.mo18353E();
                        if (interfaceC15676n2.mo18370g()) {
                            interfaceC15676n2.mo18355G(aVar4);
                        } else {
                            interfaceC15676n2.mo18378o();
                        }
                        C15623T1.m18280a(c1952q0M2608a5, interfaceC15676n2, InterfaceC5799g.a.f19152g);
                        C15623T1.m18280a(interfaceC15608O0Mo18377n, interfaceC15676n2, InterfaceC5799g.a.f19151f);
                        InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                        if (interfaceC15676n2.mo18370g() || !Intrinsics.areEqual(interfaceC15676n2.mo18389z(), Integer.valueOf(i26))) {
                            C1961V0.m2622a(i26, interfaceC15676n2, i26, c21098a2);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c11, interfaceC15676n2, InterfaceC5799g.a.f19149d);
                        InterfaceC7507e interfaceC7507eM8515h = C7481f.m8515h(aVar3, 0.0f, 0.0f, 16, 0.0f, 11);
                        if (1.0f <= 0.0d) {
                            C2192a.m2845a("invalid weight; must be greater than zero");
                        }
                        C11565Q2.m13480b(str2, interfaceC7507eM8515h.mo2665S0(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true)), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, C11732N0.m13585a(C3375b.f10931n, ((C0998l0) interfaceC15701v4.getValue()).f3476a, 0L, null, null, 0L, null, 0L, null, null, 16777214), interfaceC15676n2, 0, 24960, 110588);
                        if (z25) {
                            interfaceC15676n2.mo18363O(1821535644);
                            C17241i.m19687b(((Boolean) interfaceC15701v0.getValue()).booleanValue(), interfaceC15676n2, 0);
                        } else {
                            interfaceC15676n2.mo18363O(633050299);
                        }
                        interfaceC15676n2.mo18357I();
                        interfaceC15676n2.mo18381r();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688r), c15688r, 1597446 | ((i17 >> 12) & 112), 22);
            c15688r.m18410W(true);
            C15688r c15688r5 = c15688r;
            C7466a.m8481c(!z11, null, null, null, null, C18037u.m20404c(92129263, new Function3() { // from class: nf.d
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        if (z25) {
                            interfaceC15676n2.mo18363O(-1658090409);
                            C7309b.m8144a(7, 4, interfaceC15676n2, 54, 0);
                        } else {
                            interfaceC15676n2.mo18363O(138843315);
                        }
                        interfaceC15676n2.mo18357I();
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688r), c15688r5, 196608, 30);
            c15688rMo18372i = c15688r5;
            c15688rMo18372i.m18410W(true);
            z15 = z25;
            str6 = str16;
            str7 = str9;
        } else {
            c15688rMo18372i.mo18356H();
            str6 = str5;
            z15 = z13;
            str7 = str4;
        }
        c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: nf.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C17241i.m19686a(function0, c4600a, str7, str2, z10, z11, str6, z15, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1), i11);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19687b(final boolean z10, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1986757899);
        int i11 = (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            c15688r = c15688rMo18372i;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f59943G0.getValue(), c15688rMo18372i, 0), C7481f.m8512e(C7468a.m8487b(InterfaceC7507e.a.f24548b, z10 ? C3376c.f10951l : C3376c.f10944e, C4025f.m4708a()), 8, 4), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, C11732N0.m13585a(C3375b.f10936s, z10 ? C3376c.f10957r : C3376c.f10942c, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r, 0, 24960, 110588);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(z10, i10) { // from class: nf.f

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f54059b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17241i.m19687b(this.f54059b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
