package p033Be;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.C7470c;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8136C;
import bf.C8245x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import mg.C17055r;
import org.conscrypt.PSKKeyManager;
import p055D0.C0955R0;
import p055D0.C0998l0;
import p090F.InterfaceC1457j;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p270P.C4025f;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p415X0.C6138n1;
import p579h0.C11547M0;
import p579h0.C11565Q2;
import p579h0.C11590X0;
import p579h0.C11653n;
import p579h0.C11667q1;
import p579h0.C11677t;
import p579h0.C11681u;
import p579h0.C11685v;
import p580h1.C11732N0;
import p580h1.C11752c;
import p580h1.C11795x0;
import p607i9.C12269M6;
import p607i9.C12664j3;
import p607i9.C12736n3;
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
import p769rd.InterfaceC17888a;
import p775s0.C18037u;
import p776s1.C18043a;
import p776s1.C18050h;
import p776s1.C18051i;
import p776s1.C18056n;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20541F0;
import p881z.C20611t;

/* JADX INFO: renamed from: Be.r */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainFilterPageM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainFilterPageM.kt\nru/zona/app/screens/filters/main/MainFilterPageMKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n113#2:365\n113#2:366\n113#2:403\n113#2:444\n113#2:445\n113#2:446\n113#2:487\n113#2:501\n113#2:502\n113#2:507\n113#2:508\n113#2:509\n113#2:587\n113#2:588\n113#2:599\n113#2:633\n113#2:634\n113#2:635\n113#2:636\n113#2:637\n113#2:687\n87#3:367\n85#3,8:368\n94#3:431\n87#3:510\n84#3,9:511\n94#3:598\n87#3,6:638\n94#3:674\n80#4,6:376\n87#4,3:391\n90#4,2:400\n94#4:430\n80#4,6:460\n87#4,3:475\n90#4,2:484\n94#4:505\n80#4,6:520\n87#4,3:535\n90#4,2:544\n80#4,6:556\n87#4,3:571\n90#4,2:580\n94#4:585\n94#4:597\n80#4,6:606\n87#4,3:621\n90#4,2:630\n80#4,6:644\n87#4,3:659\n90#4,2:668\n94#4:673\n94#4:677\n391#5,9:382\n400#5:402\n401#5,2:428\n391#5,9:466\n400#5:486\n401#5,2:503\n391#5,9:526\n400#5:546\n391#5,9:562\n400#5,3:582\n401#5,2:595\n391#5,9:612\n400#5:632\n391#5,9:650\n400#5,3:670\n401#5,2:675\n4360#6,6:394\n4360#6,6:478\n4360#6,6:538\n4360#6,6:574\n4360#6,6:624\n4360#6,6:662\n1282#7,6:404\n1282#7,6:410\n1282#7,6:416\n1282#7,6:422\n1282#7,6:432\n1282#7,6:438\n1282#7,6:495\n1282#7,6:589\n15#8,7:447\n15#8,7:680\n99#9,6:454\n106#9:506\n99#9:547\n97#9,8:548\n106#9:586\n99#9,6:600\n106#9:678\n1574#10:488\n1394#10,6:489\n85#11:679\n*S KotlinDebug\n*F\n+ 1 MainFilterPageM.kt\nru/zona/app/screens/filters/main/MainFilterPageMKt\n*L\n74#1:365\n75#1:366\n86#1:403\n160#1:444\n162#1:445\n164#1:446\n173#1:487\n219#1:501\n220#1:502\n242#1:507\n244#1:508\n246#1:509\n268#1:587\n270#1:588\n295#1:599\n310#1:633\n315#1:634\n317#1:635\n318#1:636\n319#1:637\n354#1:687\n70#1:367\n70#1:368,8\n70#1:431\n238#1:510\n238#1:511,9\n238#1:598\n311#1:638,6\n311#1:674\n70#1:376,6\n70#1:391,3\n70#1:400,2\n70#1:430\n156#1:460,6\n156#1:475,3\n156#1:484,2\n156#1:505\n238#1:520,6\n238#1:535,3\n238#1:544,2\n248#1:556,6\n248#1:571,3\n248#1:580,2\n248#1:585\n238#1:597\n292#1:606,6\n292#1:621,3\n292#1:630,2\n311#1:644,6\n311#1:659,3\n311#1:668,2\n311#1:673\n292#1:677\n70#1:382,9\n70#1:402\n70#1:428,2\n156#1:466,9\n156#1:486\n156#1:503,2\n238#1:526,9\n238#1:546\n248#1:562,9\n248#1:582,3\n238#1:595,2\n292#1:612,9\n292#1:632\n311#1:650,9\n311#1:670,3\n292#1:675,2\n70#1:394,6\n156#1:478,6\n238#1:538,6\n248#1:574,6\n292#1:624,6\n311#1:662,6\n110#1:404,6\n116#1:410,6\n121#1:416,6\n130#1:422,6\n140#1:432,6\n144#1:438,6\n217#1:495,6\n272#1:589,6\n165#1:447,7\n297#1:680,7\n156#1:454,6\n156#1:506\n248#1:547\n248#1:548,8\n248#1:586\n292#1:600,6\n292#1:678\n189#1:488\n194#1:489,6\n68#1:679\n*E\n"})
public final class C0439r {

    /* JADX INFO: renamed from: Be.r$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class a implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f1776b;

        public a(Function0 function0) {
            this.f1776b = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C0438q(this.f1776b), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX INFO: renamed from: Be.r$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function1<ClosedFloatingPointRange<Float>, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
            ((InterfaceC17888a) this.receiver).mo20271k(closedFloatingPointRange);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Be.r$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC17888a) this.receiver).mo20268h();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Be.r$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC17888a) this.receiver).mo20267e();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Be.r$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n1282#2,6:32\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nru/zona/app/utils/ExtensionsKt$noRippleClickable$1\n*L\n18#1:32,6\n*E\n"})
    public static final class e implements Function3<InterfaceC7507e, InterfaceC15676n, Integer, InterfaceC7507e> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f1777b;

        public e(Function0 function0) {
            this.f1777b = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final InterfaceC7507e invoke(InterfaceC7507e interfaceC7507e, InterfaceC15676n interfaceC15676n, Integer num) {
            InterfaceC7507e interfaceC7507e2 = interfaceC7507e;
            InterfaceC15676n interfaceC15676n2 = interfaceC15676n;
            Object objM14529a = C12736n3.m14529a(num, interfaceC15676n2, -226307480);
            if (objM14529a == InterfaceC15676n.a.f50781a) {
                objM14529a = C12664j3.m14481a(interfaceC15676n2);
            }
            InterfaceC7507e interfaceC7507eM8489b = C7470c.m8489b(interfaceC7507e2, (InterfaceC1457j) objM14529a, null, false, null, new C0440s(this.f1777b), 28);
            interfaceC15676n2.mo18357I();
            return interfaceC7507eM8489b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m806a(final String str, final Object obj, String str2, final Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        String str3;
        int i12;
        final String str4;
        boolean z10;
        String strM19466e;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(412084402);
        int i13 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18350B(obj) ? 32 : 16);
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 = i13 | 384;
            str3 = str2;
        } else {
            str3 = str2;
            i12 = i13 | (c15688rMo18372i.mo18362N(str3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i15 = i12 | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024);
        if (c15688rMo18372i.mo18379p(i15 & 1, (i15 & 1171) != 1170)) {
            str4 = i14 != 0 ? null : str3;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a(C7481f.m8511d(C20611t.m25195a(C7482g.m8518c(aVar, 1.0f), 1, C3376c.f10944e, C4025f.m4709b(8)), f10), C6138n1.f20157a, new a(function0));
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6643g, InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i16 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8564a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i16))) {
                C12269M6.m14188a(i16, c15688rMo18372i, i16, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11732N0 c11732n0 = C3374a.f10914i;
            C11565Q2.m13480b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, i15 & 14, 0, 131070);
            c15688rMo18372i = c15688rMo18372i;
            C1963W0.m2623a(C7482g.m8529n(aVar, f10), c15688rMo18372i);
            if (obj == null ? true : obj instanceof String) {
                c15688rMo18372i.mo18363O(159112394);
                if (str4 == null || StringsKt.isBlank(str4)) {
                    c15688rMo18372i.mo18363O(159133629);
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence == null || StringsKt.isBlank(charSequence)) {
                        c15688rMo18372i.mo18363O(-1934527572);
                        strM19466e = C16973X.m19466e((C16972W) C19285c2.f60104n.getValue(), c15688rMo18372i, 0);
                        c15688rMo18372i.m18410W(false);
                    } else {
                        c15688rMo18372i.mo18363O(-1934525795);
                        c15688rMo18372i.m18410W(false);
                        strM19466e = (String) obj;
                    }
                    C11565Q2.m13480b(strM19466e, null, 0L, 0L, null, 0L, new C18050h(6), 0L, 2, false, 1, 0, null, C11732N0.m13585a(c11732n0, C3376c.f10957r, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 24960, 109566);
                    c15688rMo18372i = c15688rMo18372i;
                    z10 = false;
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(159684716);
                    C11752c.b bVar = new C11752c.b();
                    CharSequence charSequence2 = (CharSequence) obj;
                    bVar.m13608d(charSequence2);
                    if (!(charSequence2 == null || StringsKt.isBlank(charSequence2))) {
                        bVar.m13609e(", ");
                    }
                    int iM13613i = bVar.m13613i(new C11795x0(C3376c.f10954o, 0L, (C16318q) null, (C16316o) null, (C16317p) null, (AbstractC16308g) null, (String) null, 0L, (C18043a) null, (C18056n) null, (C17285d) null, 0L, C18051i.f56285d, (C0955R0) null, 61438));
                    try {
                        bVar.m13609e(str4);
                        Unit unit = Unit.INSTANCE;
                        bVar.m13611g(iM13613i);
                        C11565Q2.m13481c(bVar.m13614j(), null, 0L, 0L, 0L, new C18050h(6), 0L, 2, false, 1, 0, null, null, C11732N0.m13585a(c11732n0, C3376c.f10957r, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 24960, 240638);
                        c15688rMo18372i = c15688rMo18372i;
                        z10 = false;
                        c15688rMo18372i.m18410W(false);
                    } catch (Throwable th) {
                        bVar.m13611g(iM13613i);
                        throw th;
                    }
                }
                c15688rMo18372i.m18410W(z10);
            } else if (obj instanceof Boolean) {
                c15688rMo18372i.mo18363O(160702787);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z11 = (i15 & 7168) == 2048;
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (z11 || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new Function1() { // from class: Be.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ((Boolean) obj2).booleanValue();
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                Function1 function1 = (Function1) objMo18389z;
                InterfaceC7507e interfaceC7507eM8525j = C7482g.m8525j(C7481f.m8511d(aVar, 3), 18);
                float f11 = C11653n.f36610a;
                long j11 = C3376c.f10957r;
                c15688rMo18372i = c15688rMo18372i;
                C11677t.m13534a(zBooleanValue, function1, interfaceC7507eM8525j, false, C11653n.m13515a(j11, j11, C3376c.f10940a, 0L, 0L, 0L, c15688rMo18372i, 56), c15688rMo18372i, ((i15 >> 3) & 14) | 384);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(161221076);
                c15688rMo18372i.m18410W(false);
            }
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
            str4 = str3;
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, obj, str4, function0, i10, i11) { // from class: Be.p

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f1770b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f1771c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f1772d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f1773e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f1774f;

                {
                    this.f1774f = i11;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C0439r.m806a(this.f1770b, this.f1771c, this.f1772d, this.f1773e, (InterfaceC15676n) obj2, iM18294a, this.f1774f);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX INFO: renamed from: b */
    public static final void m807b(InterfaceC17888a interfaceC17888a, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        int i11;
        ?? r13;
        Object cVar;
        int i12;
        int i13;
        boolean z10;
        final InterfaceC17888a interfaceC17888a2 = interfaceC17888a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1595670838);
        int i14 = i10 | (c15688rMo18372i.mo18362N(interfaceC17888a2) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC17888a2.mo20266c(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C20541F0.m25139c(C7482g.m8517b(aVar, 1.0f), C20541F0.m25137a(c15688rMo18372i), 14), 16);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(4), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i15 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f60004n.getValue(), c15688rMo18372i, 0), C7482g.m8518c(aVar, 1.0f), 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10907b, C3376c.f10942c, 0L, new C16318q(900), null, 0L, null, 0L, null, null, 16777210), c15688rMo18372i, 48, 0, 130044);
            C1963W0.m2623a(C7482g.m8519d(aVar, 12), c15688rMo18372i);
            m806a(C16973X.m19466e((C16972W) C19278b3.f60016t.getValue(), c15688rMo18372i, 0), ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55612a, ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55613b, interfaceC17888a2.mo20275p(), c15688rMo18372i, 0, 0);
            m806a(C16973X.m19466e((C16972W) C19285c2.f60097j0.getValue(), c15688rMo18372i, 0), ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55614c, ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55615d, interfaceC17888a2.mo20272l(), c15688rMo18372i, 0, 0);
            m806a(C16973X.m19466e((C16972W) C19119E6.f59769d0.getValue(), c15688rMo18372i, 0), ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55616e, null, interfaceC17888a2.mo20269i(), c15688rMo18372i, 0, 4);
            Float f10 = ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55617f;
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (f10 == null || ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55618g == null) {
                i11 = 4;
                r13 = 0;
                c15688rMo18372i.mo18363O(878162690);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(877760031);
                String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59655J0.getValue(), c15688rMo18372i, 0);
                Float f11 = ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55617f;
                Integer numValueOf = f11 != null ? Integer.valueOf((int) f11.floatValue()) : null;
                String strM19466e2 = C16973X.m19466e((C16972W) C19101C4.f59657K0.getValue(), c15688rMo18372i, 0);
                Float f12 = ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55618g;
                String str = strM19466e + " " + numValueOf + " " + strM19466e2 + " " + (f12 != null ? Integer.valueOf((int) f12.floatValue()) : null);
                ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55617f.floatValue(), ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55618g.floatValue());
                boolean z11 = (i14 & 14) == 4;
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (z11 || objMo18389z == c21235a) {
                    i11 = 4;
                    z10 = false;
                    b bVar = new b(1, interfaceC17888a2, InterfaceC17888a.class, "setRating", "setRating(Lkotlin/ranges/ClosedFloatingPointRange;)V", 0);
                    c15688rMo18372i.mo18380q(bVar);
                    objMo18389z = bVar;
                } else {
                    i11 = 4;
                    z10 = false;
                }
                m808c(str, closedFloatingPointRangeRangeTo, (Function1) ((KFunction) objMo18389z), c15688rMo18372i, z10 ? 1 : 0);
                c15688rMo18372i.m18410W(z10);
                r13 = z10;
            }
            String strM19466e3 = C16973X.m19466e((C16972W) C19285c2.f60098k.getValue(), c15688rMo18372i, r13);
            Boolean boolValueOf = Boolean.valueOf(((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55619h);
            int i16 = i14 & 14;
            boolean z12 = i16 == i11;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            Object obj = objMo18389z2;
            if (z12 || objMo18389z2 == c21235a) {
                Function0 function0 = new Function0() { // from class: Be.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        interfaceC17888a2.mo20273m();
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(function0);
                obj = function0;
            }
            m806a(strM19466e3, boolValueOf, null, (Function0) obj, c15688rMo18372i, 0, 4);
            String strM19466e4 = C16973X.m19466e((C16972W) C19278b3.f60026y.getValue(), c15688rMo18372i, 0);
            Boolean boolValueOf2 = Boolean.valueOf(((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55621j);
            boolean z13 = i16 == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z13 || objMo18389z3 == c21235a) {
                i12 = i16;
                cVar = new c(0, interfaceC17888a2, InterfaceC17888a.class, "hideWatched", "hideWatched()V", 0);
                c15688rMo18372i.mo18380q(cVar);
            } else {
                i12 = i16;
                cVar = objMo18389z3;
            }
            int i17 = i12;
            m806a(strM19466e4, boolValueOf2, null, (Function0) ((KFunction) cVar), c15688rMo18372i, 0, 4);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            C1963W0.m2623a(new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true), c15688rMo18372i);
            boolean z14 = i17 == 4;
            Object objMo18389z4 = c15688rMo18372i.mo18389z();
            if (z14 || objMo18389z4 == c21235a) {
                i13 = i17;
                interfaceC17888a2 = interfaceC17888a;
                d dVar = new d(0, interfaceC17888a2, InterfaceC17888a.class, "resetAll", "resetAll()V", 0);
                c15688rMo18372i.mo18380q(dVar);
                objMo18389z4 = dVar;
            } else {
                interfaceC17888a2 = interfaceC17888a;
                i13 = i17;
            }
            m810e((Function0) ((KFunction) objMo18389z4), ((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55622k, c15688rMo18372i, 0);
            int i18 = i13;
            C8245x0.m10154a(null, interfaceC17888a2.mo20265a(), C16973X.m19466e((C16972W) C19140H5.f59862j0.getValue(), c15688rMo18372i, 0), null, null, false, false, false, 0L, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, 0, 0, 16377);
            C15688r c15688r2 = c15688rMo18372i;
            c15688r2.m18410W(true);
            if (((InterfaceC17888a.a) interfaceC15701v0M18246a.getValue()).f55620i) {
                c15688r2.mo18363O(-65367470);
                boolean z15 = i18 == 4;
                Object objMo18389z5 = c15688r2.mo18389z();
                Object obj2 = objMo18389z5;
                if (z15 || objMo18389z5 == c21235a) {
                    Function0 function1 = new Function0() { // from class: Be.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC17888a interfaceC17888a3 = interfaceC17888a2;
                            interfaceC17888a3.mo20276q();
                            interfaceC17888a3.mo20273m();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(function1);
                    obj2 = function1;
                }
                Function0 function2 = (Function0) obj2;
                boolean z16 = i18 == 4;
                Object objMo18389z6 = c15688r2.mo18389z();
                Object obj3 = objMo18389z6;
                if (z16 || objMo18389z6 == c21235a) {
                    Function0 function3 = new Function0() { // from class: Be.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            interfaceC17888a2.mo20274o();
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r2.mo18380q(function3);
                    obj3 = function3;
                }
                m809d(function2, (Function0) obj3, c15688r2, 0);
                c15688r2.m18410W(false);
                c15688r = c15688r2;
            } else {
                c15688r2.mo18363O(-65127220);
                c15688r2.m18410W(false);
                c15688r = c15688r2;
            }
        } else {
            c15688rMo18372i.mo18356H();
            c15688r = c15688rMo18372i;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C0431j(interfaceC17888a2, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m808c(final String str, ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        final ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        final Function1<? super ClosedFloatingPointRange<Float>, Unit> function2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-504204179);
        int i11 = i10 | (c15688rMo18372i.mo18362N(str) ? 4 : 2) | (c15688rMo18372i.mo18362N(closedFloatingPointRange) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8511d = C7481f.m8511d(C20611t.m25195a(C7482g.m8518c(aVar, 1.0f), 1, C3376c.f10944e, C4025f.m4709b(8)), 16);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8511d, c15688rMo18372i);
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6643g, InterfaceC18861d.a.f58756j, c15688rMo18372i, 6);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59653I0.getValue(), c15688rMo18372i, 0);
            C11732N0 c11732n0 = C3374a.f10914i;
            C11565Q2.m13480b(strM19466e, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, c15688rMo18372i, 0, 0, 131070);
            if (0.6f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(RangesKt.coerceAtMost(0.6f, Float.MAX_VALUE), true);
            long j12 = C3376c.f10957r;
            C11565Q2.m13480b(str, layoutWeightElement, 0L, 0L, null, 0L, new C18050h(6), 0L, 2, false, 1, 0, null, C11732N0.m13585a(c11732n0, j12, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, i11 & 14, 24960, 109564);
            c15688rMo18372i = c15688rMo18372i;
            c15688rMo18372i.m18410W(true);
            C1963W0.m2623a(C7482g.m8525j(aVar, 32), c15688rMo18372i);
            InterfaceC7507e interfaceC7507eM8519d = C7482g.m8519d(aVar, 44);
            ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 10.0f);
            C11590X0 c11590x0 = C11590X0.f36314a;
            long j13 = C3376c.f10945f;
            long j14 = C3376c.f10965z;
            long j15 = C0998l0.f3474g;
            C11547M0 c11547m0M13492g = C11590X0.m13492g((C11681u) c15688rMo18372i.mo18383t(C11685v.f36793a));
            long j16 = j12 != 16 ? j12 : c11547m0M13492g.f36106a;
            long j17 = j12 != 16 ? j12 : c11547m0M13492g.f36107b;
            long j18 = j14 != r13 ? j14 : c11547m0M13492g.f36108c;
            if (j13 == r13) {
                j13 = c11547m0M13492g.f36109d;
            }
            long j19 = j13;
            if (j14 == r13) {
                j14 = c11547m0M13492g.f36110e;
            }
            long j20 = j14;
            long j21 = j15 != 16 ? j15 : c11547m0M13492g.f36111f;
            long j22 = j15 != 16 ? j15 : c11547m0M13492g.f36112g;
            long j23 = j15 != 16 ? j15 : c11547m0M13492g.f36113h;
            long j24 = j15 != 16 ? j15 : c11547m0M13492g.f36114i;
            if (j15 == 16) {
                j15 = c11547m0M13492g.f36115j;
            }
            C11547M0 c11547m0 = new C11547M0(j16, j17, j18, j19, j20, j21, j22, j23, j24, j15);
            boolean z10 = (i11 & 896) == 256;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                function2 = function1;
                objMo18389z = new Function1() { // from class: Be.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        function2.invoke((ClosedFloatingPointRange) obj);
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z);
            } else {
                function2 = function1;
            }
            closedFloatingPointRange2 = closedFloatingPointRange;
            C11667q1.m13522b(closedFloatingPointRange2, (Function1) objMo18389z, interfaceC7507eM8519d, false, closedFloatingPointRangeRangeTo, 9, c11547m0, c15688rMo18372i, ((i11 >> 3) & 14) | 196992);
            c15688rMo18372i.m18410W(true);
        } else {
            closedFloatingPointRange2 = closedFloatingPointRange;
            function2 = function1;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(str, closedFloatingPointRange2, function2, i10) { // from class: Be.n

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f1766b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ClosedFloatingPointRange f1767c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function1 f1768d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C0439r.m808c(this.f1766b, this.f1767c, this.f1768d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m809d(final Function0<Unit> function0, final Function0<Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        final Function0<Unit> function2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1673875131);
        int i11 = (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            function2 = function1;
            C8136C.m10120b(C16973X.m19466e((C16972W) C19140H5.f59795A.getValue(), c15688rMo18372i, 0), C0423b.f1751a, C18037u.m20404c(-9561452, new Function2() { // from class: Be.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C8136C.m10119a(C16973X.m19466e((C16972W) C19285c2.f60056N.getValue(), interfaceC15676n2, 0), false, function1, interfaceC15676n2, 48, 0);
                        C1963W0.m2623a(C7482g.m8529n(InterfaceC7507e.a.f24548b, 8), interfaceC15676n2);
                        C8136C.m10119a(C16973X.m19466e((C16972W) C19140H5.f59893z.getValue(), interfaceC15676n2, 0), true, function0, interfaceC15676n2, 48, 0);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), function2, c15688rMo18372i, ((i11 << 6) & 7168) | 432);
        } else {
            function2 = function1;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function2, i10) { // from class: Be.l

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f1764c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C0439r.m809d(this.f1763b, this.f1764c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m810e(final Function0<Unit> function0, final int i10, InterfaceC15676n interfaceC15676n, final int i11) {
        C15688r c15688r;
        boolean z10;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-603924568);
        int i12 = i11 | (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | (c15688rMo18372i.mo18368e(i10) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = i10 > 0;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM19499a = C17055r.m19499a(C7482g.m8519d(C7482g.m8518c(aVar, 1.0f), 56), z11, new Function3() { // from class: Be.f
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    ((Integer) obj3).getClass();
                    interfaceC15676n2.mo18363O(-1505106733);
                    InterfaceC7507e interfaceC7507eM8564a = C7503c.m8564a((InterfaceC7507e) obj, C6138n1.f20157a, new C0439r.e(function0));
                    interfaceC15676n2.mo18357I();
                    return interfaceC7507eM8564a;
                }
            }, c15688rMo18372i, 6);
            C1982e.c cVar = C1982e.f6641e;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(cVar, InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM19499a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            boolean z12 = z11;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19278b3.f60002m.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10914i, z11 ? C3376c.f10947h : C3376c.f10945f, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688rMo18372i, 0, 0, 130046);
            c15688r = c15688rMo18372i;
            if (z12) {
                c15688r.mo18363O(1398583488);
                float f10 = 8;
                C1963W0.m2623a(C7482g.m8525j(aVar, f10), c15688r);
                float f11 = 24;
                InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8530o(C7482g.m8519d(C7468a.m8487b(aVar, C3376c.f10945f, C4025f.m4709b(16)), f11), f11, 0.0f, 2), f10, 0.0f, 2);
                C2036x c2036xM2689a = C2032v.m2689a(cVar, InterfaceC18861d.a.f58760n, c15688r, 54);
                long j11 = c15688r.f50813T;
                int i14 = (int) (j11 ^ (j11 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688r.m18405R();
                InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8513f, c15688r);
                c15688r.mo18353E();
                if (c15688r.f50812S) {
                    c15688r.mo18355G(aVar2);
                } else {
                    c15688r.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a, c15688r, dVar);
                C15623T1.m18280a(interfaceC15608O0M18405R2, c15688r, fVar);
                if (c15688r.f50812S || !Intrinsics.areEqual(c15688r.mo18389z(), Integer.valueOf(i14))) {
                    C12269M6.m14188a(i14, c15688r, i14, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c2, c15688r, eVar);
                C11565Q2.m13480b(String.valueOf(i10), null, 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C11732N0.m13585a(C3374a.f10912g, C3376c.f10957r, 0L, null, null, 0L, null, 0L, null, null, 16777214), c15688r, 0, 0, 130046);
                c15688r = c15688r;
                z10 = true;
                c15688r.m18410W(true);
                c15688r.m18410W(false);
            } else {
                z10 = true;
                c15688r.mo18363O(1399373430);
                c15688r.m18410W(false);
            }
            c15688r.m18410W(z10);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, i11, function0) { // from class: Be.g

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Function0 f1755b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f1756c;

                {
                    this.f1755b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C0439r.m810e(this.f1755b, this.f1756c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
