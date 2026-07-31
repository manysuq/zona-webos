package me;

import af.C7324q;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8158N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ke.C15855h;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import ne.C17173I;
import ne.C17187X;
import ne.C17201f0;
import ne.C17202g;
import ne.C17223q0;
import ne.C17224r;
import org.mozilla.classfile.ByteCode;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p269Og.C3986c;
import p269Og.C4004l;
import p269Og.EnumC3994g;
import p304Qf.C4601b;
import p305Qg.C4605d;
import p392Vd.EnumC5670a;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5921f;
import p410Wd.C5925j;
import p410Wd.C5929n;
import p410Wd.C5931p;
import p410Wd.InterfaceC5928m;
import p561fd.InterfaceC11131h;
import p563ff.C11154g;
import p579h0.C11565Q2;
import p607i9.C12269M6;
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
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;
import p881z.C20541F0;
import p881z.C20557N0;

/* JADX INFO: renamed from: me.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nContentPageM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPageM.kt\nru/zona/app/screens/content/ContentPageMKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,279:1\n87#2:280\n84#2,9:281\n94#2:410\n87#2:425\n85#2,8:426\n94#2:601\n87#2:603\n85#2,8:604\n94#2:651\n80#3,6:290\n87#3,3:305\n90#3,2:314\n94#3:409\n80#3,6:434\n87#3,3:449\n90#3,2:458\n80#3,6:472\n87#3,3:487\n90#3,2:496\n94#3:506\n80#3,6:519\n87#3,3:534\n90#3,2:543\n94#3:552\n80#3,6:565\n87#3,3:580\n90#3,2:589\n94#3:596\n94#3:600\n80#3,6:612\n87#3,3:627\n90#3,2:636\n94#3:650\n391#4,9:296\n400#4:316\n401#4,2:407\n391#4,9:440\n400#4:460\n391#4,9:478\n400#4:498\n401#4,2:504\n391#4,9:525\n400#4:545\n401#4,2:550\n391#4,9:571\n400#4:591\n401#4,2:594\n401#4,2:598\n391#4,9:618\n400#4:638\n401#4,2:648\n4360#5,6:308\n4360#5,6:452\n4360#5,6:490\n4360#5,6:537\n4360#5,6:583\n4360#5,6:630\n113#6:317\n113#6:378\n113#6:385\n113#6:392\n113#6:399\n113#6:406\n113#6:423\n113#6:424\n113#6:461\n113#6:462\n113#6:499\n113#6:500\n113#6:501\n113#6:502\n113#6:503\n113#6:508\n113#6:509\n113#6:546\n113#6:547\n113#6:548\n113#6:549\n113#6:554\n113#6:555\n113#6:592\n113#6:593\n113#6:602\n113#6:647\n1282#7,6:318\n1282#7,6:324\n1282#7,6:330\n1282#7,6:336\n1282#7,6:342\n1282#7,6:348\n1282#7,6:354\n1282#7,6:360\n1282#7,6:366\n1282#7,6:372\n1282#7,6:379\n1282#7,6:386\n1282#7,6:393\n1282#7,6:400\n1282#7,6:411\n1282#7,6:417\n99#8:463\n97#8,8:464\n106#8:507\n99#8:510\n97#8,8:511\n106#8:553\n99#8:556\n97#8,8:557\n106#8:597\n1739#9:639\n1814#9,3:640\n1739#9:643\n1814#9,3:644\n85#10:652\n85#10:653\n*S KotlinDebug\n*F\n+ 1 ContentPageM.kt\nru/zona/app/screens/content/ContentPageMKt\n*L\n70#1:280\n70#1:281,9\n70#1:410\n200#1:425\n200#1:426,8\n200#1:601\n240#1:603\n240#1:604,8\n240#1:651\n70#1:290,6\n70#1:305,3\n70#1:314,2\n70#1:409\n200#1:434,6\n200#1:449,3\n200#1:458,2\n204#1:472,6\n204#1:487,3\n204#1:496,2\n204#1:506\n215#1:519,6\n215#1:534,3\n215#1:543,2\n215#1:552\n225#1:565,6\n225#1:580,3\n225#1:589,2\n225#1:596\n200#1:600\n240#1:612,6\n240#1:627,3\n240#1:636,2\n240#1:650\n70#1:296,9\n70#1:316\n70#1:407,2\n200#1:440,9\n200#1:460\n204#1:478,9\n204#1:498\n204#1:504,2\n215#1:525,9\n215#1:545\n215#1:550,2\n225#1:571,9\n225#1:591\n225#1:594,2\n200#1:598,2\n240#1:618,9\n240#1:638\n240#1:648,2\n70#1:308,6\n200#1:452,6\n204#1:490,6\n215#1:537,6\n225#1:583,6\n240#1:630,6\n81#1:317\n144#1:378\n159#1:385\n169#1:392\n179#1:399\n188#1:406\n201#1:423\n202#1:424\n205#1:461\n206#1:462\n208#1:499\n209#1:500\n210#1:501\n211#1:502\n212#1:503\n216#1:508\n217#1:509\n219#1:546\n220#1:547\n221#1:548\n222#1:549\n226#1:554\n227#1:555\n229#1:592\n230#1:593\n242#1:602\n270#1:647\n82#1:318,6\n90#1:324,6\n91#1:330,6\n100#1:336,6\n102#1:342,6\n103#1:348,6\n104#1:354,6\n127#1:360,6\n128#1:366,6\n139#1:372,6\n153#1:379,6\n163#1:386,6\n173#1:393,6\n183#1:400,6\n192#1:411,6\n193#1:417,6\n204#1:463\n204#1:464,8\n204#1:507\n215#1:510\n215#1:511,8\n215#1:553\n225#1:556\n225#1:557,8\n225#1:597\n244#1:639\n244#1:640,3\n250#1:643\n250#1:644,3\n61#1:652\n62#1:653\n*E\n"})
public final class C17017e {

    /* JADX INFO: renamed from: me.e$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13137c();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13146r();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13143o();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            ((InterfaceC11131h) this.receiver).mo13140k(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            ((InterfaceC11131h) this.receiver).mo13140k(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements Function1<C3986c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3986c c3986c) {
            ((InterfaceC11131h) this.receiver).mo13135a(c3986c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements Function1<C3986c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3986c c3986c) {
            ((InterfaceC11131h) this.receiver).mo13135a(c3986c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$h */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements Function1<C3986c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3986c c3986c) {
            ((InterfaceC11131h) this.receiver).mo13135a(c3986c);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$i */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).onBackClick();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$j */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13141l();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$k */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13144p();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$l */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13139j();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$m */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13145q();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$n */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13147s();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$o */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13142m();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: me.e$p */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC11131h) this.receiver).mo13149v();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: a */
    public static final void m19484a(final InterfaceC5928m interfaceC5928m, Function1<? super String, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        ArrayList arrayList;
        boolean z10;
        ?? r11;
        final Function1<? super String, Unit> function2 = function1;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(622513227);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC5928m) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function2) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(8), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
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
            List<C5925j> listMo6797j = interfaceC5928m.mo6797j();
            ArrayList arrayList2 = null;
            if (listMo6797j != null) {
                List<C5925j> list = listMo6797j;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C5925j) it.next()).f19607b.toLowerCase(Locale.ROOT));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                c15688rMo18372i.mo18363O(-1713781317);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1713781316);
                C17187X.m19667a(C16973X.m19466e((C16972W) C19278b3.f60016t.getValue(), c15688rMo18372i, 0), CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null), null, 0.0f, c15688rMo18372i, 0, 12);
                c15688rMo18372i.m18410W(false);
            }
            List<C5921f> listMo6801r = interfaceC5928m.mo6801r();
            if (listMo6801r != null) {
                List<C5921f> list2 = listMo6801r;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C5921f) it2.next()).f19599b);
                }
            }
            ArrayList arrayList4 = arrayList2;
            if (arrayList4 == null) {
                c15688rMo18372i.mo18363O(-1713572904);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1713572903);
                C17187X.m19667a(C16973X.m19466e((C16972W) C19285c2.f60097j0.getValue(), c15688rMo18372i, 0), CollectionsKt___CollectionsKt.joinToString$default(arrayList4, ", ", null, null, 0, null, null, 62, null), null, 0.0f, c15688rMo18372i, 0, 12);
                c15688rMo18372i.m18410W(false);
            }
            String strM6808b = C5929n.m6808b(interfaceC5928m, "\n", c15688rMo18372i);
            if (StringsKt.isBlank(strM6808b)) {
                c15688rMo18372i.mo18363O(-1713175359);
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(-1713318548);
                C17187X.m19667a(C16973X.m19466e((C16972W) C19101C4.f59676U.getValue(), c15688rMo18372i, 0), strM6808b, null, 0.0f, c15688rMo18372i, 0, 12);
                c15688rMo18372i.m18410W(false);
            }
            List<C5931p> listMo6793e = interfaceC5928m.mo6793e();
            if (listMo6793e == null) {
                c15688rMo18372i.mo18363O(-1713141725);
                c15688rMo18372i.m18410W(false);
                z10 = true;
                r11 = 0;
            } else {
                c15688rMo18372i.mo18363O(-1713141724);
                z10 = true;
                r11 = 0;
                C17187X.m19667a(C16973X.m19466e((C16972W) C19285c2.f60129z0.getValue(), c15688rMo18372i, 0), listMo6793e, function2, 0.0f, c15688rMo18372i, (i11 << 3) & 896, 8);
                c15688rMo18372i.m18410W(false);
            }
            C1963W0.m2623a(C7482g.m8525j(aVar, (float) r11), c15688rMo18372i);
            List<C5931p> listMo6792d = interfaceC5928m.mo6792d();
            if (listMo6792d == null) {
                c15688rMo18372i.mo18363O(-1712892764);
                c15688rMo18372i.m18410W(r11);
                function2 = function1;
            } else {
                c15688rMo18372i.mo18363O(-1712892763);
                function2 = function1;
                C17187X.m19667a(C16973X.m19466e((C16972W) C19119E6.f59763a0.getValue(), c15688rMo18372i, r11), listMo6792d, function2, 0.0f, c15688rMo18372i, (i11 << 3) & 896, 8);
                c15688rMo18372i.m18410W(r11);
            }
            c15688rMo18372i.m18410W(z10);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function2, i10) { // from class: me.c

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f53358c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17017e.m19484a(this.f53357b, this.f53358c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19485b(int i10, InterfaceC15676n interfaceC15676n) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1440317037);
        if (c15688rMo18372i.mo18379p(i10 & 1, i10 != 0)) {
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            float f10 = 16;
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8518c(aVar, 1.0f), f10, 0.0f, 2);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.m2645g(12), InterfaceC18861d.a.f58759m, c15688rMo18372i, 6);
            long j10 = c15688rMo18372i.f50813T;
            int i11 = (int) (j10 ^ (j10 >>> 32));
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
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i11))) {
                C12269M6.m14188a(i11, c15688rMo18372i, i11, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            InterfaceC7507e interfaceC7507eM8519d = C7482g.m8519d(C7482g.m8518c(aVar, 1.0f), f10);
            float f11 = 8;
            C1982e.i iVarM2645g = C1982e.m2645g(f11);
            C18863f.b bVar = InterfaceC18861d.a.f58756j;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(iVarM2645g, bVar, c15688rMo18372i, 6);
            long j11 = c15688rMo18372i.f50813T;
            int i12 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8519d, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            FillElement fillElement = C7482g.f24343b;
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, 54), true), c15688rMo18372i, 0);
            C1963W0.m2623a(C7482g.m8529n(aVar, 13), c15688rMo18372i);
            float f12 = 66;
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, f12), true), c15688rMo18372i, 0);
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, f12), true), c15688rMo18372i, 0);
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, f12), true), c15688rMo18372i, 0);
            c15688rMo18372i.m18410W(true);
            InterfaceC7507e interfaceC7507eM8519d2 = C7482g.m8519d(C7482g.m8518c(aVar, 1.0f), f10);
            C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(C1982e.m2645g(f11), bVar, c15688rMo18372i, 6);
            long j12 = c15688rMo18372i.f50813T;
            int i13 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8519d2, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a2, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
            float f13 = 58;
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, f13), true), c15688rMo18372i, 0);
            C1963W0.m2623a(C7482g.m8529n(aVar, 9), c15688rMo18372i);
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, f13), true), c15688rMo18372i, 0);
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, 104), true), c15688rMo18372i, 0);
            c15688rMo18372i.m18410W(true);
            InterfaceC7507e interfaceC7507eM8519d3 = C7482g.m8519d(C7482g.m8518c(aVar, 1.0f), f10);
            C1952Q0 c1952q0M2608a3 = C1948O0.m2608a(C1982e.m2645g(7), bVar, c15688rMo18372i, 6);
            long j13 = c15688rMo18372i.f50813T;
            int i14 = (int) (j13 ^ (j13 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R4 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(interfaceC7507eM8519d3, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a3, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R4, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c4, c15688rMo18372i, eVar);
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, 76), true), c15688rMo18372i, 0);
            C2000k.m2674a(C7324q.m8149a(C7482g.m8529n(fillElement, ByteCode.INVOKEVIRTUAL), true), c15688rMo18372i, 0);
            c15688rMo18372i.m18410W(true);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C17016d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: c */
    public static final void m19486c(InterfaceC11131h interfaceC11131h, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15634Y0 c15634y0M18412Y;
        Function2<? super InterfaceC15676n, ? super Integer, Unit> function2;
        InterfaceC7507e.a aVar;
        int i11;
        Object obj;
        ?? r10;
        KFunction kFunction;
        String strM19466e;
        int i12;
        Object obj2;
        KFunction kFunction2;
        Object obj3;
        int i13;
        InterfaceC7507e.a aVar2;
        InterfaceC5928m interfaceC5928m;
        C15688r c15688r2;
        C15688r c15688r3;
        int i14;
        C15688r c15688r4;
        InterfaceC7507e.a aVar3;
        InterfaceC5928m interfaceC5928m2;
        int i15;
        int i16;
        InterfaceC7507e.a aVar4;
        InterfaceC7507e.a aVar5;
        C15688r c15688r5;
        String strMo6803t;
        String name;
        Object kVar;
        boolean z10;
        Boolean boolMo6798l;
        Boolean boolMo6806x;
        final InterfaceC11131h interfaceC11131h2 = interfaceC11131h;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1881874111);
        int iM18418e0 = c15688rMo18372i.m18418e0();
        int i17 = (c15688rMo18372i.mo18362N(interfaceC11131h2) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i17 & 1, (i17 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC11131h2.mo13136b(), c15688rMo18372i, 0);
            InterfaceC15701v0 interfaceC15701v0M18246a2 = C15585G1.m18246a(interfaceC11131h2.getState(), c15688rMo18372i, 0);
            InterfaceC5928m interfaceC5928m3 = ((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34622a;
            InterfaceC5928m interfaceC5928m4 = ((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34622a;
            KFunction kFunction3 = null;
            boolean z11 = (interfaceC5928m4 != null ? interfaceC5928m4.getType() : null) == EnumC3994g.SERIAL;
            C20557N0 c20557n0M25137a = C20541F0.m25137a(c15688rMo18372i);
            boolean z12 = ((EnumC5670a) interfaceC15701v0M18246a.getValue()) == EnumC5670a.f18682c;
            InterfaceC7507e.a aVar6 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(aVar6, 1.0f);
            if (z12) {
                c15688rMo18372i.mo18363O(552068856);
            } else {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(1439217340);
                interfaceC7507eM8517b = C20541F0.m25139c(interfaceC7507eM8517b, c20557n0M25137a, 14);
                c15688rMo18372i.mo18357I();
            }
            c15688rMo18372i.mo18357I();
            if (z12) {
                c15688rMo18372i.mo18363O(552068350);
                c15688rMo18372i.mo18363O(1933022970);
                interfaceC7507eM8517b = C7586d.m8700a(interfaceC7507eM8517b, "test_tag_loading");
                c15688rMo18372i.m18410W(false);
            } else {
                c15688rMo18372i.mo18363O(552068856);
            }
            c15688rMo18372i.m18410W(false);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i18 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar7 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar7);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i18))) {
                C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            c15688rMo18372i.mo18363O(253047390);
            EnumC5670a enumC5670a = (EnumC5670a) interfaceC15701v0M18246a.getValue();
            EnumC5670a enumC5670a2 = EnumC5670a.f18684e;
            Object obj4 = InterfaceC15676n.a.f50781a;
            if (enumC5670a == enumC5670a2) {
                c15688rMo18372i.mo18363O(252960465);
                C1963W0.m2623a(C7482g.m8519d(aVar6, 200), c15688rMo18372i);
                boolean z13 = (i17 & 14) == 4;
                Object objMo18389z = c15688rMo18372i.mo18389z();
                if (z13 || objMo18389z == obj4) {
                    objMo18389z = new a(0, interfaceC11131h2, InterfaceC11131h.class, "updateData", "updateData()V", 0);
                    c15688rMo18372i.mo18380q(objMo18389z);
                }
                C8158N.m10132a((Function0) ((KFunction) objMo18389z), c15688rMo18372i, 0);
                c15688rMo18372i.m18415b0(iM18418e0);
                c15634y0M18412Y = c15688rMo18372i.m18412Y();
                if (c15634y0M18412Y == null) {
                    return;
                } else {
                    function2 = new Function2(i10) { // from class: me.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            int iM18294a = C15636Z0.m18294a(1);
                            C17017e.m19486c(this.f53355b, (InterfaceC15676n) obj5, iM18294a);
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                c15688rMo18372i.mo18363O(253089239);
                c15688rMo18372i.m18410W(false);
                String strMo6786A = interfaceC5928m3 != null ? interfaceC5928m3.mo6786A() : null;
                String strMo6780D = interfaceC5928m3 != null ? interfaceC5928m3.mo6780D() : null;
                int i19 = i17 & 14;
                boolean z14 = i19 == 4;
                Object objMo18389z2 = c15688rMo18372i.mo18389z();
                if (z14 || objMo18389z2 == obj4) {
                    aVar = aVar6;
                    i iVar = new i(0, interfaceC11131h2, InterfaceC11131h.class, "onBackClick", "onBackClick()V", 0);
                    c15688rMo18372i.mo18380q(iVar);
                    objMo18389z2 = iVar;
                } else {
                    aVar = aVar6;
                }
                Function0 function0 = (Function0) ((KFunction) objMo18389z2);
                boolean z15 = i19 == 4;
                Object objMo18389z3 = c15688rMo18372i.mo18389z();
                if (z15 || objMo18389z3 == obj4) {
                    j jVar = new j(0, interfaceC11131h, InterfaceC11131h.class, "onSupportClick", "onSupportClick()V", 0);
                    c15688rMo18372i.mo18380q(jVar);
                    objMo18389z3 = jVar;
                }
                InterfaceC5928m interfaceC5928m5 = interfaceC5928m3;
                String str = strMo6786A;
                boolean z16 = z12;
                C17223q0.m19680a(z16, str, strMo6780D, function0, (Function0) ((KFunction) objMo18389z3), C4601b.m5229x(), C16973X.m19466e((C16972W) C19140H5.f59842Z.getValue(), c15688rMo18372i, 0), null, c15688rMo18372i, 0, 128);
                boolean zBooleanValue = (interfaceC5928m5 == null || (boolMo6806x = interfaceC5928m5.mo6806x()) == null) ? false : boolMo6806x.booleanValue();
                boolean zBooleanValue2 = (interfaceC5928m5 == null || (boolMo6798l = interfaceC5928m5.mo6798l()) == null) ? false : boolMo6798l.booleanValue();
                Boolean bool = ((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34629h;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool, bool2)) {
                    c15688rMo18372i.mo18363O(253752670);
                    boolean z17 = i19 == 4;
                    Object objMo18389z4 = c15688rMo18372i.mo18389z();
                    if (z17 || objMo18389z4 == obj4) {
                        z10 = false;
                        i11 = i19;
                        obj = obj4;
                        kVar = new k(0, interfaceC11131h, InterfaceC11131h.class, "onTrailerClick", "onTrailerClick()V", 0);
                        c15688rMo18372i.mo18380q(kVar);
                    } else {
                        obj = obj4;
                        kVar = objMo18389z4;
                        z10 = false;
                        i11 = i19;
                    }
                    kFunction = (KFunction) kVar;
                    c15688rMo18372i.m18410W(z10);
                    r10 = z10;
                } else {
                    interfaceC5928m5 = interfaceC5928m5;
                    i11 = i19;
                    obj = obj4;
                    r10 = 0;
                    c15688rMo18372i.mo18363O(253798642);
                    c15688rMo18372i.m18410W(false);
                    kFunction = null;
                }
                Function0 function1 = (Function0) kFunction;
                boolean z18 = i11 == 4;
                Object objMo18389z5 = c15688rMo18372i.mo18389z();
                if (z18 || objMo18389z5 == obj) {
                    l lVar = new l(0, interfaceC11131h, InterfaceC11131h.class, "toggleFavorite", "toggleFavorite()V", 0);
                    c15688rMo18372i.mo18380q(lVar);
                    objMo18389z5 = lVar;
                }
                Function0 function3 = (Function0) ((KFunction) objMo18389z5);
                boolean z19 = i11 == 4;
                Object objMo18389z6 = c15688rMo18372i.mo18389z();
                if (z19 || objMo18389z6 == obj) {
                    m mVar = new m(0, interfaceC11131h, InterfaceC11131h.class, "toggleWatched", "toggleWatched()V", 0);
                    c15688rMo18372i.mo18380q(mVar);
                    objMo18389z6 = mVar;
                }
                Function0 function4 = (Function0) ((KFunction) objMo18389z6);
                boolean z20 = i11 == 4;
                Object objMo18389z7 = c15688rMo18372i.mo18389z();
                if (z20 || objMo18389z7 == obj) {
                    n nVar = new n(0, interfaceC11131h, InterfaceC11131h.class, "shareEntity", "shareEntity()V", 0);
                    c15688rMo18372i.mo18380q(nVar);
                    objMo18389z7 = nVar;
                }
                Function0 function5 = (Function0) ((KFunction) objMo18389z7);
                InterfaceC5928m interfaceC5928m6 = interfaceC5928m5;
                Boolean bool3 = bool2;
                Object obj5 = obj;
                int i20 = i11;
                C17224r.m19681a(z16, zBooleanValue, zBooleanValue2, function1, function3, function4, function5, c15688rMo18372i, 0);
                C17173I.m19664b(z16, (interfaceC5928m6 == null || (name = interfaceC5928m6.getName()) == null) ? "" : name, (Intrinsics.areEqual(interfaceC5928m6 != null ? interfaceC5928m6.getName() : null, interfaceC5928m6 != null ? interfaceC5928m6.mo6800p() : null) || interfaceC5928m6 == null) ? null : interfaceC5928m6.mo6800p(), (interfaceC5928m6 == null || (strMo6803t = interfaceC5928m6.mo6803t()) == null) ? "" : strMo6803t, interfaceC5928m6 != null ? interfaceC5928m6.mo6804v() : null, interfaceC5928m6 != null ? interfaceC5928m6.mo6787B() : false, interfaceC5928m6 != null ? interfaceC5928m6.mo6805w() : null, interfaceC5928m6 != null ? interfaceC5928m6.mo6799o() : null, c15688rMo18372i, 0);
                if (z11) {
                    c15688rMo18372i.mo18363O(254523175);
                    C4004l c4004lM13151b = ((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).m13151b();
                    C16972W c16972w = (C16972W) C19140H5.f59827Q.getValue();
                    Integer numValueOf = Integer.valueOf(c4004lM13151b.f13165a);
                    Integer numValueOf2 = Integer.valueOf(c4004lM13151b.f13166b);
                    Object[] objArr = new Object[2];
                    objArr[r10] = numValueOf;
                    objArr[1] = numValueOf2;
                    strM19466e = C16973X.m19467f(c16972w, objArr, c15688rMo18372i);
                    c15688rMo18372i.m18410W(r10);
                } else {
                    c15688rMo18372i.mo18363O(254700247);
                    strM19466e = C16973X.m19466e((C16972W) C19119E6.f59752Q.getValue(), c15688rMo18372i, r10);
                    c15688rMo18372i.m18410W(r10);
                }
                String str2 = strM19466e;
                if (Intrinsics.areEqual(((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34627f, bool3)) {
                    c15688rMo18372i.mo18363O(254903297);
                    boolean z21 = i20 == 4;
                    Object objMo18389z8 = c15688rMo18372i.mo18389z();
                    if (z21 || objMo18389z8 == obj5) {
                        i12 = i20;
                        obj2 = obj5;
                        b bVar = new b(0, interfaceC11131h, InterfaceC11131h.class, "onPlayClick", "onPlayClick()V", 0);
                        c15688rMo18372i.mo18380q(bVar);
                        objMo18389z8 = bVar;
                    } else {
                        i12 = i20;
                        obj2 = obj5;
                    }
                    kFunction2 = (KFunction) objMo18389z8;
                    c15688rMo18372i.m18410W(r10);
                } else {
                    interfaceC5928m6 = interfaceC5928m6;
                    i12 = i20;
                    bool3 = bool3;
                    obj2 = obj5;
                    c15688rMo18372i.mo18363O(254930514);
                    c15688rMo18372i.m18410W(r10);
                    kFunction2 = null;
                }
                Function0 function6 = (Function0) kFunction2;
                if (Intrinsics.areEqual(((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34628g, bool3)) {
                    c15688rMo18372i.mo18363O(255006558);
                    boolean z22 = i12 == 4;
                    Object objMo18389z9 = c15688rMo18372i.mo18389z();
                    if (z22 || objMo18389z9 == obj2) {
                        c cVar = new c(0, interfaceC11131h, InterfaceC11131h.class, "onSeasonsClick", "onSeasonsClick()V", 0);
                        c15688rMo18372i.mo18380q(cVar);
                        objMo18389z9 = cVar;
                    }
                    kFunction3 = (KFunction) objMo18389z9;
                } else {
                    c15688rMo18372i.mo18363O(255036658);
                }
                c15688rMo18372i.m18410W(r10);
                int i21 = i12;
                Object obj6 = obj2;
                InterfaceC5928m interfaceC5928m7 = interfaceC5928m6;
                C17201f0.m19673a(str2, z11, z16, function6, (Function0) kFunction3, c15688rMo18372i, 0);
                if (z16) {
                    c15688rMo18372i.mo18363O(255082477);
                    m19485b(r10, c15688rMo18372i);
                    c15688rMo18372i.m18410W(r10);
                    c15688rMo18372i.m18410W(r10);
                    obj3 = obj6;
                    c15688r5 = c15688rMo18372i;
                } else {
                    c15688rMo18372i.mo18363O(255153591);
                    c15688rMo18372i.m18410W(r10);
                    if (interfaceC5928m7 == null) {
                        c15688rMo18372i.mo18363O(255193456);
                        c15688rMo18372i.m18410W(r10);
                        i14 = i21;
                        obj3 = obj6;
                        aVar2 = aVar;
                        interfaceC5928m = interfaceC5928m7;
                        c15688r4 = c15688rMo18372i;
                    } else {
                        c15688rMo18372i.mo18363O(255193457);
                        boolean z23 = i21 == 4;
                        Object objMo18389z10 = c15688rMo18372i.mo18389z();
                        if (z23 || objMo18389z10 == obj6) {
                            obj3 = obj6;
                            d dVar = new d(1, interfaceC11131h, InterfaceC11131h.class, "onPersonClick", "onPersonClick(Ljava/lang/String;)V", 0);
                            c15688rMo18372i.mo18380q(dVar);
                            objMo18389z10 = dVar;
                        } else {
                            obj3 = obj6;
                        }
                        m19484a(interfaceC5928m7, (Function1) ((KFunction) objMo18389z10), c15688rMo18372i, r10);
                        String description = interfaceC5928m7.getDescription();
                        if (description == null) {
                            c15688rMo18372i.mo18363O(-760744813);
                            c15688rMo18372i.m18410W(r10);
                            obj3 = obj3;
                            i13 = i21;
                            aVar2 = aVar;
                            interfaceC5928m = interfaceC5928m7;
                            c15688r3 = c15688rMo18372i;
                        } else {
                            c15688rMo18372i.mo18363O(-760744812);
                            if (description.length() > 0) {
                                c15688rMo18372i.mo18363O(-1569649429);
                                aVar2 = aVar;
                                i13 = i21;
                                interfaceC5928m = interfaceC5928m7;
                                C11565Q2.m13480b(description, C7481f.m8511d(aVar2, 16), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10912g, c15688rMo18372i, 48, 0, 131068);
                                C15688r c15688r6 = c15688rMo18372i;
                                c15688r6.m18410W(r10);
                                c15688r2 = c15688r6;
                            } else {
                                i13 = i21;
                                aVar2 = aVar;
                                interfaceC5928m = interfaceC5928m7;
                                C15688r c15688r7 = c15688rMo18372i;
                                c15688r7.mo18363O(-1569448022);
                                c15688r7.m18410W(r10);
                                c15688r2 = c15688r7;
                            }
                            Unit unit = Unit.INSTANCE;
                            c15688r2.m18410W(r10);
                            c15688r3 = c15688r2;
                        }
                        List<C5931p> listMo6794f = interfaceC5928m.mo6794f();
                        if (listMo6794f == null) {
                            c15688r3.mo18363O(-760415934);
                            c15688r3.m18410W(r10);
                            i14 = i13;
                            aVar2 = aVar2;
                            obj3 = obj3;
                        } else {
                            c15688r3.mo18363O(-760415933);
                            boolean z24 = i13 == 4;
                            Object objMo18389z11 = c15688r3.mo18389z();
                            if (z24 || objMo18389z11 == obj3) {
                                i14 = i13;
                                e eVar = new e(1, interfaceC11131h, InterfaceC11131h.class, "onPersonClick", "onPersonClick(Ljava/lang/String;)V", 0);
                                c15688r3.mo18380q(eVar);
                                objMo18389z11 = eVar;
                            } else {
                                i14 = i13;
                            }
                            C17202g.m19674a(listMo6794f, (Function1) ((KFunction) objMo18389z11), c15688r3, r10);
                            Unit unit2 = Unit.INSTANCE;
                            c15688r3.m18410W(r10);
                        }
                        c15688r3.m18410W(r10);
                        c15688r4 = c15688r3;
                    }
                    if (((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34624c.isEmpty()) {
                        i21 = i14;
                        aVar3 = aVar2;
                        interfaceC5928m2 = interfaceC5928m;
                        i15 = 16;
                        i16 = 8;
                        c15688r4.mo18363O(256178327);
                        c15688r4.m18410W(r10);
                    } else {
                        c15688r4.mo18363O(255896754);
                        C1963W0.m2623a(C7482g.m8519d(aVar2, 8), c15688r4);
                        String strM19466e2 = C16973X.m19466e((C16972W) C19119E6.f59742G.getValue(), c15688r4, r10);
                        List<InterfaceC5928m> list = ((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34624c;
                        boolean z25 = i14 == 4;
                        Object objMo18389z12 = c15688r4.mo18389z();
                        if (z25 || objMo18389z12 == obj3) {
                            f fVar = new f(1, interfaceC11131h, InterfaceC11131h.class, "onContentClick", "onContentClick(Lru/zona/content/models/EntityId;)V", 0);
                            c15688r4.mo18380q(fVar);
                            objMo18389z12 = fVar;
                        }
                        Function1 function7 = (Function1) ((KFunction) objMo18389z12);
                        i21 = i14;
                        aVar3 = aVar2;
                        interfaceC5928m2 = interfaceC5928m;
                        i15 = 16;
                        i16 = 8;
                        C11154g.m13162b(strM19466e2, list, function7, interfaceC5928m2, null, null, false, c15688r4, 0, 112);
                        c15688r4.m18410W(r10);
                    }
                    if (((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34625d.isEmpty()) {
                        aVar4 = aVar3;
                        c15688r4.mo18363O(256530487);
                        c15688r4.m18410W(r10);
                    } else {
                        c15688r4.mo18363O(256240265);
                        C1963W0.m2623a(C7482g.m8519d(aVar3, i16), c15688r4);
                        String strM19466e3 = C16973X.m19466e((C16972W) C19140H5.f59846b0.getValue(), c15688r4, r10);
                        List<InterfaceC5928m> list2 = ((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34625d;
                        boolean z26 = i21 == 4;
                        Object objMo18389z13 = c15688r4.mo18389z();
                        if (z26 || objMo18389z13 == obj3) {
                            aVar4 = aVar3;
                            g gVar = new g(1, interfaceC11131h, InterfaceC11131h.class, "onContentClick", "onContentClick(Lru/zona/content/models/EntityId;)V", 0);
                            c15688r4.mo18380q(gVar);
                            objMo18389z13 = gVar;
                        } else {
                            aVar4 = aVar3;
                        }
                        i21 = i21;
                        obj3 = obj3;
                        i15 = 16;
                        i16 = 8;
                        C11154g.m13162b(strM19466e3, list2, (Function1) ((KFunction) objMo18389z13), interfaceC5928m2, null, null, false, c15688r4, 0, 112);
                        c15688r4.m18410W(r10);
                    }
                    if (((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34626e.isEmpty()) {
                        aVar5 = aVar4;
                        c15688r4.mo18363O(256876695);
                        c15688r4.m18410W(r10);
                    } else {
                        c15688r4.mo18363O(256588395);
                        InterfaceC7507e.a aVar8 = aVar4;
                        C1963W0.m2623a(C7482g.m8519d(aVar8, i16), c15688r4);
                        String strM19466e4 = C16973X.m19466e((C16972W) C19101C4.f59673S0.getValue(), c15688r4, r10);
                        List<InterfaceC5928m> list3 = ((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34626e;
                        boolean z27 = i21 == 4;
                        Object objMo18389z14 = c15688r4.mo18389z();
                        if (z27 || objMo18389z14 == obj3) {
                            h hVar = new h(1, interfaceC11131h, InterfaceC11131h.class, "onContentClick", "onContentClick(Lru/zona/content/models/EntityId;)V", 0);
                            c15688r4.mo18380q(hVar);
                            objMo18389z14 = hVar;
                        }
                        Function1 function8 = (Function1) ((KFunction) objMo18389z14);
                        i15 = 16;
                        i21 = i21;
                        aVar5 = aVar8;
                        obj3 = obj3;
                        C11154g.m13162b(strM19466e4, list3, function8, interfaceC5928m2, null, null, false, c15688r4, 0, 112);
                        c15688r4.m18410W(r10);
                    }
                    C15855h.m18664b(aVar5, i15, c15688r4, r10);
                    c15688r5 = c15688r4;
                }
                c15688r5.m18410W(true);
                if (((InterfaceC11131h.a) interfaceC15701v0M18246a2.getValue()).f34630i) {
                    c15688r5.mo18363O(-698851962);
                    boolean z28 = i21 == 4;
                    Object objMo18389z15 = c15688r5.mo18389z();
                    if (z28 || objMo18389z15 == obj3) {
                        o oVar = new o(0, interfaceC11131h, InterfaceC11131h.class, "removeWatched", "removeWatched()V", 0);
                        c15688r5.mo18380q(oVar);
                        objMo18389z15 = oVar;
                    }
                    Function0 function9 = (Function0) ((KFunction) objMo18389z15);
                    boolean z29 = i21 == 4;
                    Object objMo18389z16 = c15688r5.mo18389z();
                    if (z29 || objMo18389z16 == obj3) {
                        interfaceC11131h2 = interfaceC11131h;
                        objMo18389z16 = new p(0, interfaceC11131h2, InterfaceC11131h.class, "deleteEpisodesDialogDismiss", "deleteEpisodesDialogDismiss()V", 0);
                        c15688r5.mo18380q(objMo18389z16);
                    } else {
                        interfaceC11131h2 = interfaceC11131h;
                    }
                    C4605d.m5233a(function9, (Function0) ((KFunction) objMo18389z16), c15688r5, r10);
                    c15688r5.m18410W(r10);
                    c15688r = c15688r5;
                } else {
                    interfaceC11131h2 = interfaceC11131h;
                    c15688r5.mo18363O(-698703007);
                    c15688r5.m18410W(r10);
                    c15688r = c15688r5;
                }
            }
            c15634y0M18412Y.f50634d = function2;
        }
        c15688rMo18372i.mo18356H();
        c15688r = c15688rMo18372i;
        c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            function2 = new Function2(i10) { // from class: me.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17017e.m19486c(this.f53356b, (InterfaceC15676n) obj7, iM18294a);
                    return Unit.INSTANCE;
                }
            };
            c15634y0M18412Y.f50634d = function2;
        }
    }
}
