package je;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8199f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1955S0;
import p126H.C1982e;
import p233Mg.C3561B;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
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
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;
import p845wg.C19142I0;
import p845wg.C19278b3;

/* JADX INFO: renamed from: je.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFilterBarM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterBarM.kt\nru/zona/app/screens/catalog/compositions/FilterBarMKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,61:1\n113#2:62\n113#2:63\n99#3:64\n97#3,8:65\n106#3:121\n80#4,6:73\n87#4,3:88\n90#4,2:97\n94#4:120\n391#5,9:79\n400#5:99\n401#5,2:118\n4360#6,6:91\n1282#7,6:100\n1282#7,6:106\n1282#7,6:112\n*S KotlinDebug\n*F\n+ 1 FilterBarM.kt\nru/zona/app/screens/catalog/compositions/FilterBarMKt\n*L\n33#1:62\n34#1:63\n30#1:64\n30#1:65,8\n30#1:121\n30#1:73,6\n30#1:88,3\n30#1:97,2\n30#1:120\n30#1:79,9\n30#1:99\n30#1:118,2\n30#1:91,6\n41#1:100,6\n48#1:106,6\n57#1:112,6\n*E\n"})
public final class C15444e {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x018b  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:107:0x01df  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:113:0x0209  */
    /* JADX WARN: Code duplicated, block: B:116:0x0212  */
    /* JADX WARN: Code duplicated, block: B:118:0x0229  */
    /* JADX WARN: Code duplicated, block: B:121:0x0232  */
    /* JADX WARN: Code duplicated, block: B:122:0x0248  */
    /* JADX WARN: Code duplicated, block: B:125:0x0251  */
    /* JADX WARN: Code duplicated, block: B:126:0x0267  */
    /* JADX WARN: Code duplicated, block: B:128:0x026f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0279  */
    /* JADX WARN: Code duplicated, block: B:132:0x0294  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:154:0x031b  */
    /* JADX WARN: Code duplicated, block: B:155:0x031d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0326  */
    /* JADX WARN: Code duplicated, block: B:159:0x0328  */
    /* JADX WARN: Code duplicated, block: B:162:0x0330 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0332  */
    /* JADX WARN: Code duplicated, block: B:166:0x0363  */
    /* JADX WARN: Code duplicated, block: B:169:0x0372  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:86:0x0125  */
    /* JADX WARN: Code duplicated, block: B:89:0x0138  */
    /* JADX WARN: Code duplicated, block: B:91:0x0146  */
    /* JADX WARN: Code duplicated, block: B:94:0x016d  */
    /* JADX WARN: Code duplicated, block: B:95:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x017d  */
    /* JADX WARN: Code duplicated, block: B:99:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX INFO: renamed from: a */
    public static final void m18105a(final boolean z10, final boolean z11, C3561B c3561b, boolean z12, final Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        boolean z13;
        C3561B c3561b2;
        int i12;
        boolean z14;
        int i13;
        int i14;
        final Function0<Unit> function3;
        char c10;
        int i15;
        int i16;
        int i17;
        boolean z15;
        final Function0<Unit> function4;
        final C3561B c3561b3;
        final boolean z16;
        final Function0<Unit> function5;
        C15688r c15688r;
        C15634Y0 c15634y0M18412Y;
        boolean z17;
        Function0<Unit> function6;
        InterfaceC7507e.a aVar;
        int i18;
        C5753J.a aVar2;
        InterfaceC5799g.a.C21098a c21098a;
        C1955S0 c1955s0;
        int i19;
        boolean z18;
        int i20;
        boolean z19;
        boolean z20;
        Object objMo18389z;
        Object obj;
        C3561B c3561b4;
        final Function0<Unit> function7;
        C15688r c15688r2;
        String strM19466e;
        String str;
        boolean z21;
        boolean z22;
        boolean z23;
        Object objMo18389z2;
        Object obj2;
        InterfaceC7507e.a aVar3;
        float f10;
        ?? r12;
        C15688r c15688r3;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objMo18389z3;
        boolean z27;
        C15688r c15688r4;
        int i21;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(525781388);
        int i22 = (i10 & 6) == 0 ? (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            z13 = z11;
            i22 |= c15688rMo18372i.mo18364a(z13) ? 32 : 16;
        } else {
            z13 = z11;
        }
        int i23 = i11 & 4;
        if (i23 == 0) {
            if ((i10 & 384) == 0) {
                c3561b2 = c3561b;
                i22 |= c15688rMo18372i.mo18350B(c3561b2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i12 = i11 & 8;
            if (i12 != 0) {
                if ((i10 & 3072) == 0) {
                    z14 = z12;
                    if (c15688rMo18372i.mo18364a(z14)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i22 |= i13;
                }
                if ((i10 & 24576) == 0) {
                    if (c15688rMo18372i.mo18350B(function0)) {
                        i21 = 16384;
                    } else {
                        i21 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i22 |= i21;
                }
                i14 = i11 & 32;
                if (i14 != 0) {
                    i22 |= 196608;
                    function3 = function1;
                    c10 = ' ';
                } else {
                    function3 = function1;
                    c10 = ' ';
                    if ((i10 & 196608) == 0) {
                        if (c15688rMo18372i.mo18350B(function3)) {
                            i15 = 131072;
                        } else {
                            i15 = Parser.ARGC_LIMIT;
                        }
                        i22 |= i15;
                    }
                }
                i16 = i11 & 64;
                if (i16 != 0) {
                    i22 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c15688rMo18372i.mo18350B(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i22 |= i17;
                }
                if ((i22 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c15688rMo18372i.mo18379p(i22 & 1, z15)) {
                    if (i23 != 0) {
                        c3561b2 = null;
                    }
                    if (i12 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i14 != 0) {
                        function3 = null;
                    }
                    if (i16 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    aVar = InterfaceC7507e.a.f24548b;
                    InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(C7482g.m8518c(aVar, 1.0f), 24, 16);
                    C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(11), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
                    long j10 = c15688rMo18372i.f50813T;
                    i18 = (int) (j10 ^ (j10 >>> c10));
                    InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
                    InterfaceC5799g.f19145s1.getClass();
                    aVar2 = InterfaceC5799g.a.f19147b;
                    c15688rMo18372i.mo18353E();
                    if (c15688rMo18372i.f50812S) {
                        c15688rMo18372i.mo18355G(aVar2);
                    } else {
                        c15688rMo18372i.mo18378o();
                    }
                    C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
                    C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
                    c21098a = InterfaceC5799g.a.f19154i;
                    if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i18))) {
                        C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                    c1955s0 = C1955S0.f6575a;
                    InterfaceC7507e interfaceC7507eMo2614a = c1955s0.mo2614a(aVar, 0.42f);
                    String strM19466e2 = C16973X.m19466e((C16972W) C19278b3.f60004n.getValue(), c15688rMo18372i, 0);
                    C4600a c4600aM5212g = C4601b.m5212g();
                    i19 = i22 & 14;
                    if (i19 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    i20 = i22;
                    if ((i20 & 57344) == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z19 | z18;
                    objMo18389z = c15688rMo18372i.mo18389z();
                    obj = InterfaceC15676n.a.f50781a;
                    if (z20 || objMo18389z == obj) {
                        objMo18389z = new Function0() { // from class: je.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z10) {
                                    function0.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688rMo18372i.mo18380q(objMo18389z);
                    }
                    c3561b4 = c3561b2;
                    boolean z28 = z13;
                    function7 = function6;
                    C8199f0.m10144a(interfaceC7507eMo2614a, strM19466e2, 0L, 0L, c4600aM5212g, z28, (Function0) objMo18389z, c15688rMo18372i, (i20 << 12) & 458752, 12);
                    c15688r2 = c15688rMo18372i;
                    if (function3 == null) {
                        c15688r2.mo18363O(1475823976);
                        c15688r2.m18410W(false);
                        obj2 = obj;
                        aVar3 = aVar;
                        f10 = 0.53f;
                        r12 = 0;
                    } else {
                        c15688r2.mo18363O(1475823977);
                        InterfaceC7507e interfaceC7507eMo2614a2 = c1955s0.mo2614a(aVar, 0.53f);
                        if (c3561b4 == null) {
                            c15688r2.mo18363O(520633546);
                            c15688r2.m18410W(false);
                            str = null;
                        } else {
                            strM19466e = c3561b4.f11704a;
                            c15688r2.mo18363O(570983959);
                            switch (strM19466e) {
                                case "popularity":
                                    c15688r2.mo18363O(1635692051);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59888w0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                    break;
                                case "release_date":
                                    c15688r2.mo18363O(1635696341);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59894z0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                    break;
                                case "add_date":
                                    c15688r2.mo18363O(1635698673);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59884u0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                    break;
                                case "rating":
                                    c15688r2.mo18363O(1635694249);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59890x0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                    break;
                                default:
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                    break;
                            }
                            str = strM19466e;
                            c15688r2.m18410W(false);
                        }
                        if (str == null) {
                            str = "";
                        }
                        C4600a c4600a = new C4600a((C16987h) C19142I0.f59909g.getValue(), null);
                        if (i19 == 4) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if ((i20 & 458752) == 131072) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z22 | z21;
                        objMo18389z2 = c15688r2.mo18389z();
                        if (z23) {
                            obj2 = obj;
                        } else {
                            obj2 = obj;
                            if (objMo18389z2 == obj2) {
                            }
                            aVar3 = aVar;
                            f10 = 0.53f;
                            C8199f0.m10144a(interfaceC7507eMo2614a2, str, 0L, 0L, c4600a, false, (Function0) objMo18389z2, c15688r2, 0, 44);
                            C15688r c15688r5 = c15688r2;
                            Unit unit = Unit.INSTANCE;
                            r12 = 0;
                            c15688r5.m18410W(false);
                            c15688r3 = c15688r5;
                        }
                        objMo18389z2 = new Function0() { // from class: je.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z10) {
                                    function3.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r2.mo18380q(objMo18389z2);
                        aVar3 = aVar;
                        f10 = 0.53f;
                        C8199f0.m10144a(interfaceC7507eMo2614a2, str, 0L, 0L, c4600a, false, (Function0) objMo18389z2, c15688r2, 0, 44);
                        C15688r c15688r6 = c15688r2;
                        Unit unit2 = Unit.INSTANCE;
                        r12 = 0;
                        c15688r6.m18410W(false);
                        c15688r3 = c15688r6;
                    }
                    if (function7 == null) {
                        c15688r3 = c15688r2;
                        c15688r3.mo18363O(1476120367);
                        c15688r3.m18410W(r12);
                        z27 = z17;
                        c15688r4 = c15688r3;
                    } else {
                        c15688r3.mo18363O(1476120368);
                        InterfaceC7507e interfaceC7507eMo2614a3 = c1955s0.mo2614a(aVar3, f10);
                        String strM19466e3 = C16973X.m19466e((C16972W) C19278b3.f60000l.getValue(), c15688r3, r12);
                        C4600a c4600aM5214i = C4601b.m5214i();
                        if (i19 == 4) {
                            c15688r3 = c15688r2;
                            z24 = true;
                        } else {
                            c15688r3 = c15688r2;
                            z24 = false;
                        }
                        if ((i20 & 3670016) == 1048576) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z25 | z24;
                        objMo18389z3 = c15688r3.mo18389z();
                        if (z26 || objMo18389z3 == obj2) {
                            objMo18389z3 = new Function0() { // from class: je.c
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (z10) {
                                        function7.invoke();
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r3.mo18380q(objMo18389z3);
                        }
                        C15688r c15688r7 = c15688r3;
                        z27 = z17;
                        C8199f0.m10144a(interfaceC7507eMo2614a3, strM19466e3, 0L, 0L, c4600aM5214i, z27, (Function0) objMo18389z3, c15688r7, (i20 << 6) & 458752, 12);
                        C15688r c15688r8 = c15688r7;
                        Unit unit3 = Unit.INSTANCE;
                        c15688r8.m18410W(false);
                        c15688r4 = c15688r8;
                    }
                    c15688r4.m18410W(true);
                    c3561b3 = c3561b4;
                    function4 = function3;
                    function5 = function7;
                    z16 = z27;
                    c15688r = c15688r4;
                } else {
                    C15688r c15688r9 = c15688rMo18372i;
                    c15688r9.mo18356H();
                    function4 = function3;
                    c3561b3 = c3561b2;
                    z16 = z14;
                    function5 = function2;
                    c15688r = c15688r9;
                }
                c15634y0M18412Y = c15688r.m18412Y();
                if (c15634y0M18412Y != null) {
                    c15634y0M18412Y.f50634d = new Function2() { // from class: je.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            C15444e.m18105a(z10, z11, c3561b3, z16, function0, function4, function5, (InterfaceC15676n) obj3, C15636Z0.m18294a(i10 | 1), i11);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i22 |= 3072;
            z14 = z12;
            if ((i10 & 24576) == 0) {
                if (c15688rMo18372i.mo18350B(function0)) {
                    i21 = 16384;
                } else {
                    i21 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i22 |= i21;
            }
            i14 = i11 & 32;
            if (i14 != 0) {
                i22 |= 196608;
                function3 = function1;
                c10 = ' ';
            } else {
                function3 = function1;
                c10 = ' ';
                if ((i10 & 196608) == 0) {
                    if (c15688rMo18372i.mo18350B(function3)) {
                        i15 = 131072;
                    } else {
                        i15 = Parser.ARGC_LIMIT;
                    }
                    i22 |= i15;
                }
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i22 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c15688rMo18372i.mo18350B(function2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i22 |= i17;
            }
            if ((i22 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c15688rMo18372i.mo18379p(i22 & 1, z15)) {
                if (i23 != 0) {
                    c3561b2 = null;
                }
                if (i12 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    function3 = null;
                }
                if (i16 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                aVar = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8512e2 = C7481f.m8512e(C7482g.m8518c(aVar, 1.0f), 24, 16);
                C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(C1982e.m2645g(11), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
                long j11 = c15688rMo18372i.f50813T;
                i18 = (int) (j11 ^ (j11 >>> c10));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8512e2, c15688rMo18372i);
                InterfaceC5799g.f19145s1.getClass();
                aVar2 = InterfaceC5799g.a.f19147b;
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a2, c15688rMo18372i, InterfaceC5799g.a.f19152g);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, InterfaceC5799g.a.f19151f);
                c21098a = InterfaceC5799g.a.f19154i;
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
                } else {
                    C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                c1955s0 = C1955S0.f6575a;
                InterfaceC7507e interfaceC7507eMo2614a4 = c1955s0.mo2614a(aVar, 0.42f);
                String strM19466e4 = C16973X.m19466e((C16972W) C19278b3.f60004n.getValue(), c15688rMo18372i, 0);
                C4600a c4600aM5212g2 = C4601b.m5212g();
                i19 = i22 & 14;
                if (i19 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                i20 = i22;
                if ((i20 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z19 | z18;
                objMo18389z = c15688rMo18372i.mo18389z();
                obj = InterfaceC15676n.a.f50781a;
                if (z20) {
                    objMo18389z = new Function0() { // from class: je.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z10) {
                                function0.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                } else {
                    objMo18389z = new Function0() { // from class: je.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z10) {
                                function0.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                c3561b4 = c3561b2;
                boolean z29 = z13;
                function7 = function6;
                C8199f0.m10144a(interfaceC7507eMo2614a4, strM19466e4, 0L, 0L, c4600aM5212g2, z29, (Function0) objMo18389z, c15688rMo18372i, (i20 << 12) & 458752, 12);
                c15688r2 = c15688rMo18372i;
                if (function3 == null) {
                    c15688r2.mo18363O(1475823976);
                    c15688r2.m18410W(false);
                    obj2 = obj;
                    aVar3 = aVar;
                    f10 = 0.53f;
                    r12 = 0;
                } else {
                    c15688r2.mo18363O(1475823977);
                    InterfaceC7507e interfaceC7507eMo2614a5 = c1955s0.mo2614a(aVar, 0.53f);
                    if (c3561b4 == null) {
                        c15688r2.mo18363O(520633546);
                        c15688r2.m18410W(false);
                        str = null;
                    } else {
                        strM19466e = c3561b4.f11704a;
                        c15688r2.mo18363O(570983959);
                        switch (strM19466e) {
                            case -2023617739:
                                if (strM19466e.equals("popularity")) {
                                    c15688r2.mo18363O(1635692051);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59888w0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                } else {
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                }
                                break;
                            case -1965855514:
                                if (strM19466e.equals("release_date")) {
                                    c15688r2.mo18363O(1635696341);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59894z0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                } else {
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                }
                                break;
                            case -1236308852:
                                if (strM19466e.equals("add_date")) {
                                    c15688r2.mo18363O(1635698673);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59884u0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                } else {
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                }
                                break;
                            case -938102371:
                                if (strM19466e.equals("rating")) {
                                    c15688r2.mo18363O(1635694249);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59890x0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                } else {
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                }
                                break;
                            default:
                                c15688r2.mo18363O(1635700645);
                                c15688r2.m18410W(false);
                                break;
                        }
                        str = strM19466e;
                        c15688r2.m18410W(false);
                    }
                    if (str == null) {
                        str = "";
                    }
                    C4600a c4600a2 = new C4600a((C16987h) C19142I0.f59909g.getValue(), null);
                    if (i19 == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i20 & 458752) == 131072) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z22 | z21;
                    objMo18389z2 = c15688r2.mo18389z();
                    if (z23) {
                        obj2 = obj;
                        if (objMo18389z2 == obj2) {
                        }
                        aVar3 = aVar;
                        f10 = 0.53f;
                        C8199f0.m10144a(interfaceC7507eMo2614a5, str, 0L, 0L, c4600a2, false, (Function0) objMo18389z2, c15688r2, 0, 44);
                        C15688r c15688r10 = c15688r2;
                        Unit unit4 = Unit.INSTANCE;
                        r12 = 0;
                        c15688r10.m18410W(false);
                        c15688r3 = c15688r10;
                    } else {
                        obj2 = obj;
                    }
                    objMo18389z2 = new Function0() { // from class: je.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z10) {
                                function3.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(objMo18389z2);
                    aVar3 = aVar;
                    f10 = 0.53f;
                    C8199f0.m10144a(interfaceC7507eMo2614a5, str, 0L, 0L, c4600a2, false, (Function0) objMo18389z2, c15688r2, 0, 44);
                    C15688r c15688r11 = c15688r2;
                    Unit unit5 = Unit.INSTANCE;
                    r12 = 0;
                    c15688r11.m18410W(false);
                    c15688r3 = c15688r11;
                }
                if (function7 == null) {
                    c15688r3 = c15688r2;
                    c15688r3.mo18363O(1476120367);
                    c15688r3.m18410W(r12);
                    z27 = z17;
                    c15688r4 = c15688r3;
                } else {
                    c15688r3.mo18363O(1476120368);
                    InterfaceC7507e interfaceC7507eMo2614a6 = c1955s0.mo2614a(aVar3, f10);
                    String strM19466e5 = C16973X.m19466e((C16972W) C19278b3.f60000l.getValue(), c15688r3, r12);
                    C4600a c4600aM5214i2 = C4601b.m5214i();
                    if (i19 == 4) {
                        c15688r3 = c15688r2;
                        z24 = true;
                    } else {
                        c15688r3 = c15688r2;
                        z24 = false;
                    }
                    if ((i20 & 3670016) == 1048576) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objMo18389z3 = c15688r3.mo18389z();
                    if (z26) {
                        objMo18389z3 = new Function0() { // from class: je.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z10) {
                                    function7.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r3.mo18380q(objMo18389z3);
                    } else {
                        objMo18389z3 = new Function0() { // from class: je.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z10) {
                                    function7.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r3.mo18380q(objMo18389z3);
                    }
                    C15688r c15688r12 = c15688r3;
                    z27 = z17;
                    C8199f0.m10144a(interfaceC7507eMo2614a6, strM19466e5, 0L, 0L, c4600aM5214i2, z27, (Function0) objMo18389z3, c15688r12, (i20 << 6) & 458752, 12);
                    C15688r c15688r13 = c15688r12;
                    Unit unit6 = Unit.INSTANCE;
                    c15688r13.m18410W(false);
                    c15688r4 = c15688r13;
                }
                c15688r4.m18410W(true);
                c3561b3 = c3561b4;
                function4 = function3;
                function5 = function7;
                z16 = z27;
                c15688r = c15688r4;
            } else {
                C15688r c15688r14 = c15688rMo18372i;
                c15688r14.mo18356H();
                function4 = function3;
                c3561b3 = c3561b2;
                z16 = z14;
                function5 = function2;
                c15688r = c15688r14;
            }
            c15634y0M18412Y = c15688r.m18412Y();
            if (c15634y0M18412Y != null) {
                c15634y0M18412Y.f50634d = new Function2() { // from class: je.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        C15444e.m18105a(z10, z11, c3561b3, z16, function0, function4, function5, (InterfaceC15676n) obj3, C15636Z0.m18294a(i10 | 1), i11);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i22 |= 384;
        c3561b2 = c3561b;
        i12 = i11 & 8;
        if (i12 != 0) {
            if ((i10 & 3072) == 0) {
                z14 = z12;
                if (c15688rMo18372i.mo18364a(z14)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i22 |= i13;
            }
            if ((i10 & 24576) == 0) {
                if (c15688rMo18372i.mo18350B(function0)) {
                    i21 = 16384;
                } else {
                    i21 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i22 |= i21;
            }
            i14 = i11 & 32;
            if (i14 != 0) {
                i22 |= 196608;
                function3 = function1;
                c10 = ' ';
            } else {
                function3 = function1;
                c10 = ' ';
                if ((i10 & 196608) == 0) {
                    if (c15688rMo18372i.mo18350B(function3)) {
                        i15 = 131072;
                    } else {
                        i15 = Parser.ARGC_LIMIT;
                    }
                    i22 |= i15;
                }
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i22 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c15688rMo18372i.mo18350B(function2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i22 |= i17;
            }
            if ((i22 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c15688rMo18372i.mo18379p(i22 & 1, z15)) {
                if (i23 != 0) {
                    c3561b2 = null;
                }
                if (i12 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    function3 = null;
                }
                if (i16 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                aVar = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8512e3 = C7481f.m8512e(C7482g.m8518c(aVar, 1.0f), 24, 16);
                C1952Q0 c1952q0M2608a3 = C1948O0.m2608a(C1982e.m2645g(11), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
                long j12 = c15688rMo18372i.f50813T;
                i18 = (int) (j12 ^ (j12 >>> c10));
                InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
                InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8512e3, c15688rMo18372i);
                InterfaceC5799g.f19145s1.getClass();
                aVar2 = InterfaceC5799g.a.f19147b;
                c15688rMo18372i.mo18353E();
                if (c15688rMo18372i.f50812S) {
                    c15688rMo18372i.mo18355G(aVar2);
                } else {
                    c15688rMo18372i.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a3, c15688rMo18372i, InterfaceC5799g.a.f19152g);
                C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, InterfaceC5799g.a.f19151f);
                c21098a = InterfaceC5799g.a.f19154i;
                if (c15688rMo18372i.f50812S) {
                    C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
                } else {
                    C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, InterfaceC5799g.a.f19149d);
                c1955s0 = C1955S0.f6575a;
                InterfaceC7507e interfaceC7507eMo2614a7 = c1955s0.mo2614a(aVar, 0.42f);
                String strM19466e6 = C16973X.m19466e((C16972W) C19278b3.f60004n.getValue(), c15688rMo18372i, 0);
                C4600a c4600aM5212g3 = C4601b.m5212g();
                i19 = i22 & 14;
                if (i19 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                i20 = i22;
                if ((i20 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z19 | z18;
                objMo18389z = c15688rMo18372i.mo18389z();
                obj = InterfaceC15676n.a.f50781a;
                if (z20) {
                    objMo18389z = new Function0() { // from class: je.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z10) {
                                function0.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                } else {
                    objMo18389z = new Function0() { // from class: je.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z10) {
                                function0.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                c3561b4 = c3561b2;
                boolean z210 = z13;
                function7 = function6;
                C8199f0.m10144a(interfaceC7507eMo2614a7, strM19466e6, 0L, 0L, c4600aM5212g3, z210, (Function0) objMo18389z, c15688rMo18372i, (i20 << 12) & 458752, 12);
                c15688r2 = c15688rMo18372i;
                if (function3 == null) {
                    c15688r2.mo18363O(1475823976);
                    c15688r2.m18410W(false);
                    obj2 = obj;
                    aVar3 = aVar;
                    f10 = 0.53f;
                    r12 = 0;
                } else {
                    c15688r2.mo18363O(1475823977);
                    InterfaceC7507e interfaceC7507eMo2614a8 = c1955s0.mo2614a(aVar, 0.53f);
                    if (c3561b4 == null) {
                        c15688r2.mo18363O(520633546);
                        c15688r2.m18410W(false);
                        str = null;
                    } else {
                        strM19466e = c3561b4.f11704a;
                        c15688r2.mo18363O(570983959);
                        switch (strM19466e) {
                            case -2023617739:
                                if (strM19466e.equals("popularity")) {
                                    c15688r2.mo18363O(1635692051);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59888w0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                } else {
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                }
                                break;
                            case -1965855514:
                                if (strM19466e.equals("release_date")) {
                                    c15688r2.mo18363O(1635696341);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59894z0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                } else {
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                }
                                break;
                            case -1236308852:
                                if (strM19466e.equals("add_date")) {
                                    c15688r2.mo18363O(1635698673);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59884u0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                } else {
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                }
                                break;
                            case -938102371:
                                if (strM19466e.equals("rating")) {
                                    c15688r2.mo18363O(1635694249);
                                    strM19466e = C16973X.m19466e((C16972W) C19140H5.f59890x0.getValue(), c15688r2, 0);
                                    c15688r2.m18410W(false);
                                } else {
                                    c15688r2.mo18363O(1635700645);
                                    c15688r2.m18410W(false);
                                }
                                break;
                            default:
                                c15688r2.mo18363O(1635700645);
                                c15688r2.m18410W(false);
                                break;
                        }
                        str = strM19466e;
                        c15688r2.m18410W(false);
                    }
                    if (str == null) {
                        str = "";
                    }
                    C4600a c4600a3 = new C4600a((C16987h) C19142I0.f59909g.getValue(), null);
                    if (i19 == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i20 & 458752) == 131072) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z22 | z21;
                    objMo18389z2 = c15688r2.mo18389z();
                    if (z23) {
                        obj2 = obj;
                        if (objMo18389z2 == obj2) {
                        }
                        aVar3 = aVar;
                        f10 = 0.53f;
                        C8199f0.m10144a(interfaceC7507eMo2614a8, str, 0L, 0L, c4600a3, false, (Function0) objMo18389z2, c15688r2, 0, 44);
                        C15688r c15688r15 = c15688r2;
                        Unit unit7 = Unit.INSTANCE;
                        r12 = 0;
                        c15688r15.m18410W(false);
                        c15688r3 = c15688r15;
                    } else {
                        obj2 = obj;
                    }
                    objMo18389z2 = new Function0() { // from class: je.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z10) {
                                function3.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(objMo18389z2);
                    aVar3 = aVar;
                    f10 = 0.53f;
                    C8199f0.m10144a(interfaceC7507eMo2614a8, str, 0L, 0L, c4600a3, false, (Function0) objMo18389z2, c15688r2, 0, 44);
                    C15688r c15688r16 = c15688r2;
                    Unit unit8 = Unit.INSTANCE;
                    r12 = 0;
                    c15688r16.m18410W(false);
                    c15688r3 = c15688r16;
                }
                if (function7 == null) {
                    c15688r3 = c15688r2;
                    c15688r3.mo18363O(1476120367);
                    c15688r3.m18410W(r12);
                    z27 = z17;
                    c15688r4 = c15688r3;
                } else {
                    c15688r3.mo18363O(1476120368);
                    InterfaceC7507e interfaceC7507eMo2614a9 = c1955s0.mo2614a(aVar3, f10);
                    String strM19466e7 = C16973X.m19466e((C16972W) C19278b3.f60000l.getValue(), c15688r3, r12);
                    C4600a c4600aM5214i3 = C4601b.m5214i();
                    if (i19 == 4) {
                        c15688r3 = c15688r2;
                        z24 = true;
                    } else {
                        c15688r3 = c15688r2;
                        z24 = false;
                    }
                    if ((i20 & 3670016) == 1048576) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objMo18389z3 = c15688r3.mo18389z();
                    if (z26) {
                        objMo18389z3 = new Function0() { // from class: je.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z10) {
                                    function7.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r3.mo18380q(objMo18389z3);
                    } else {
                        objMo18389z3 = new Function0() { // from class: je.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (z10) {
                                    function7.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r3.mo18380q(objMo18389z3);
                    }
                    C15688r c15688r17 = c15688r3;
                    z27 = z17;
                    C8199f0.m10144a(interfaceC7507eMo2614a9, strM19466e7, 0L, 0L, c4600aM5214i3, z27, (Function0) objMo18389z3, c15688r17, (i20 << 6) & 458752, 12);
                    C15688r c15688r18 = c15688r17;
                    Unit unit9 = Unit.INSTANCE;
                    c15688r18.m18410W(false);
                    c15688r4 = c15688r18;
                }
                c15688r4.m18410W(true);
                c3561b3 = c3561b4;
                function4 = function3;
                function5 = function7;
                z16 = z27;
                c15688r = c15688r4;
            } else {
                C15688r c15688r19 = c15688rMo18372i;
                c15688r19.mo18356H();
                function4 = function3;
                c3561b3 = c3561b2;
                z16 = z14;
                function5 = function2;
                c15688r = c15688r19;
            }
            c15634y0M18412Y = c15688r.m18412Y();
            if (c15634y0M18412Y != null) {
                c15634y0M18412Y.f50634d = new Function2() { // from class: je.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        C15444e.m18105a(z10, z11, c3561b3, z16, function0, function4, function5, (InterfaceC15676n) obj3, C15636Z0.m18294a(i10 | 1), i11);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i22 |= 3072;
        z14 = z12;
        if ((i10 & 24576) == 0) {
            if (c15688rMo18372i.mo18350B(function0)) {
                i21 = 16384;
            } else {
                i21 = ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            i22 |= i21;
        }
        i14 = i11 & 32;
        if (i14 != 0) {
            i22 |= 196608;
            function3 = function1;
            c10 = ' ';
        } else {
            function3 = function1;
            c10 = ' ';
            if ((i10 & 196608) == 0) {
                if (c15688rMo18372i.mo18350B(function3)) {
                    i15 = 131072;
                } else {
                    i15 = Parser.ARGC_LIMIT;
                }
                i22 |= i15;
            }
        }
        i16 = i11 & 64;
        if (i16 != 0) {
            i22 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c15688rMo18372i.mo18350B(function2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i22 |= i17;
        }
        if ((i22 & 599187) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c15688rMo18372i.mo18379p(i22 & 1, z15)) {
            if (i23 != 0) {
                c3561b2 = null;
            }
            if (i12 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            if (i14 != 0) {
                function3 = null;
            }
            if (i16 != 0) {
                function6 = null;
            } else {
                function6 = function2;
            }
            aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8512e4 = C7481f.m8512e(C7482g.m8518c(aVar, 1.0f), 24, 16);
            C1952Q0 c1952q0M2608a4 = C1948O0.m2608a(C1982e.m2645g(11), InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j13 = c15688rMo18372i.f50813T;
            i18 = (int) (j13 ^ (j13 >>> c10));
            InterfaceC15608O0 interfaceC15608O0M18405R4 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(interfaceC7507eM8512e4, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a4, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R4, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S) {
                C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
            } else {
                C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c4, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            c1955s0 = C1955S0.f6575a;
            InterfaceC7507e interfaceC7507eMo2614a10 = c1955s0.mo2614a(aVar, 0.42f);
            String strM19466e8 = C16973X.m19466e((C16972W) C19278b3.f60004n.getValue(), c15688rMo18372i, 0);
            C4600a c4600aM5212g4 = C4601b.m5212g();
            i19 = i22 & 14;
            if (i19 == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            i20 = i22;
            if ((i20 & 57344) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = z19 | z18;
            objMo18389z = c15688rMo18372i.mo18389z();
            obj = InterfaceC15676n.a.f50781a;
            if (z20) {
                objMo18389z = new Function0() { // from class: je.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z10) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            } else {
                objMo18389z = new Function0() { // from class: je.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z10) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            c3561b4 = c3561b2;
            boolean z211 = z13;
            function7 = function6;
            C8199f0.m10144a(interfaceC7507eMo2614a10, strM19466e8, 0L, 0L, c4600aM5212g4, z211, (Function0) objMo18389z, c15688rMo18372i, (i20 << 12) & 458752, 12);
            c15688r2 = c15688rMo18372i;
            if (function3 == null) {
                c15688r2.mo18363O(1475823976);
                c15688r2.m18410W(false);
                obj2 = obj;
                aVar3 = aVar;
                f10 = 0.53f;
                r12 = 0;
            } else {
                c15688r2.mo18363O(1475823977);
                InterfaceC7507e interfaceC7507eMo2614a11 = c1955s0.mo2614a(aVar, 0.53f);
                if (c3561b4 == null) {
                    c15688r2.mo18363O(520633546);
                    c15688r2.m18410W(false);
                    str = null;
                } else {
                    strM19466e = c3561b4.f11704a;
                    c15688r2.mo18363O(570983959);
                    switch (strM19466e) {
                        case -2023617739:
                            if (strM19466e.equals("popularity")) {
                                c15688r2.mo18363O(1635692051);
                                strM19466e = C16973X.m19466e((C16972W) C19140H5.f59888w0.getValue(), c15688r2, 0);
                                c15688r2.m18410W(false);
                            } else {
                                c15688r2.mo18363O(1635700645);
                                c15688r2.m18410W(false);
                            }
                            break;
                        case -1965855514:
                            if (strM19466e.equals("release_date")) {
                                c15688r2.mo18363O(1635696341);
                                strM19466e = C16973X.m19466e((C16972W) C19140H5.f59894z0.getValue(), c15688r2, 0);
                                c15688r2.m18410W(false);
                            } else {
                                c15688r2.mo18363O(1635700645);
                                c15688r2.m18410W(false);
                            }
                            break;
                        case -1236308852:
                            if (strM19466e.equals("add_date")) {
                                c15688r2.mo18363O(1635698673);
                                strM19466e = C16973X.m19466e((C16972W) C19140H5.f59884u0.getValue(), c15688r2, 0);
                                c15688r2.m18410W(false);
                            } else {
                                c15688r2.mo18363O(1635700645);
                                c15688r2.m18410W(false);
                            }
                            break;
                        case -938102371:
                            if (strM19466e.equals("rating")) {
                                c15688r2.mo18363O(1635694249);
                                strM19466e = C16973X.m19466e((C16972W) C19140H5.f59890x0.getValue(), c15688r2, 0);
                                c15688r2.m18410W(false);
                            } else {
                                c15688r2.mo18363O(1635700645);
                                c15688r2.m18410W(false);
                            }
                            break;
                        default:
                            c15688r2.mo18363O(1635700645);
                            c15688r2.m18410W(false);
                            break;
                    }
                    str = strM19466e;
                    c15688r2.m18410W(false);
                }
                if (str == null) {
                    str = "";
                }
                C4600a c4600a4 = new C4600a((C16987h) C19142I0.f59909g.getValue(), null);
                if (i19 == 4) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if ((i20 & 458752) == 131072) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z22 | z21;
                objMo18389z2 = c15688r2.mo18389z();
                if (z23) {
                    obj2 = obj;
                    if (objMo18389z2 == obj2) {
                    }
                    aVar3 = aVar;
                    f10 = 0.53f;
                    C8199f0.m10144a(interfaceC7507eMo2614a11, str, 0L, 0L, c4600a4, false, (Function0) objMo18389z2, c15688r2, 0, 44);
                    C15688r c15688r110 = c15688r2;
                    Unit unit10 = Unit.INSTANCE;
                    r12 = 0;
                    c15688r110.m18410W(false);
                    c15688r3 = c15688r110;
                } else {
                    obj2 = obj;
                }
                objMo18389z2 = new Function0() { // from class: je.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z10) {
                            function3.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                c15688r2.mo18380q(objMo18389z2);
                aVar3 = aVar;
                f10 = 0.53f;
                C8199f0.m10144a(interfaceC7507eMo2614a11, str, 0L, 0L, c4600a4, false, (Function0) objMo18389z2, c15688r2, 0, 44);
                C15688r c15688r111 = c15688r2;
                Unit unit11 = Unit.INSTANCE;
                r12 = 0;
                c15688r111.m18410W(false);
                c15688r3 = c15688r111;
            }
            if (function7 == null) {
                c15688r3 = c15688r2;
                c15688r3.mo18363O(1476120367);
                c15688r3.m18410W(r12);
                z27 = z17;
                c15688r4 = c15688r3;
            } else {
                c15688r3.mo18363O(1476120368);
                InterfaceC7507e interfaceC7507eMo2614a12 = c1955s0.mo2614a(aVar3, f10);
                String strM19466e9 = C16973X.m19466e((C16972W) C19278b3.f60000l.getValue(), c15688r3, r12);
                C4600a c4600aM5214i4 = C4601b.m5214i();
                if (i19 == 4) {
                    c15688r3 = c15688r2;
                    z24 = true;
                } else {
                    c15688r3 = c15688r2;
                    z24 = false;
                }
                if ((i20 & 3670016) == 1048576) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z25 | z24;
                objMo18389z3 = c15688r3.mo18389z();
                if (z26) {
                    objMo18389z3 = new Function0() { // from class: je.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z10) {
                                function7.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r3.mo18380q(objMo18389z3);
                } else {
                    objMo18389z3 = new Function0() { // from class: je.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z10) {
                                function7.invoke();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r3.mo18380q(objMo18389z3);
                }
                C15688r c15688r112 = c15688r3;
                z27 = z17;
                C8199f0.m10144a(interfaceC7507eMo2614a12, strM19466e9, 0L, 0L, c4600aM5214i4, z27, (Function0) objMo18389z3, c15688r112, (i20 << 6) & 458752, 12);
                C15688r c15688r113 = c15688r112;
                Unit unit12 = Unit.INSTANCE;
                c15688r113.m18410W(false);
                c15688r4 = c15688r113;
            }
            c15688r4.m18410W(true);
            c3561b3 = c3561b4;
            function4 = function3;
            function5 = function7;
            z16 = z27;
            c15688r = c15688r4;
        } else {
            C15688r c15688r114 = c15688rMo18372i;
            c15688r114.mo18356H();
            function4 = function3;
            c3561b3 = c3561b2;
            z16 = z14;
            function5 = function2;
            c15688r = c15688r114;
        }
        c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: je.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    C15444e.m18105a(z10, z11, c3561b3, z16, function0, function4, function5, (InterfaceC15676n) obj3, C15636Z0.m18294a(i10 | 1), i11);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
