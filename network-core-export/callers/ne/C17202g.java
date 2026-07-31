package ne;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2032v;
import p126H.C2036x;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5931p;
import p528df.C10499u;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p664l1.C16318q;
import p675lf.C16433z;
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18580v;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p845wg.C19285c2;
import p881z.C20541F0;

/* JADX INFO: renamed from: ne.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nActorsSection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActorsSection.kt\nru/zona/app/screens/content/compositions/ActorsSectionKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,90:1\n87#2:91\n84#2,9:92\n87#2:169\n83#2,10:170\n94#2:216\n94#2:225\n87#2:226\n84#2,9:227\n94#2:317\n80#3,6:101\n87#3,3:116\n90#3,2:125\n80#3,6:140\n87#3,3:155\n90#3,2:164\n80#3,6:180\n87#3,3:195\n90#3,2:204\n94#3:215\n94#3:220\n94#3:224\n80#3,6:236\n87#3,3:251\n90#3,2:260\n80#3,6:274\n87#3,3:289\n90#3,2:298\n94#3:312\n94#3:316\n391#4,9:107\n400#4:127\n391#4,9:146\n400#4:166\n391#4,9:186\n400#4:206\n401#4,2:213\n401#4,2:218\n401#4,2:222\n391#4,9:242\n400#4:262\n391#4,9:280\n400#4:300\n401#4,2:310\n401#4,2:314\n4360#5,6:119\n4360#5,6:158\n4360#5,6:198\n4360#5,6:254\n4360#5,6:292\n113#6:128\n113#6:129\n113#6:130\n113#6:168\n113#6:263\n113#6:308\n99#7:131\n97#7,8:132\n106#7:221\n99#7:264\n96#7,9:265\n106#7:313\n2068#8:167\n2069#8:217\n2068#8:301\n2069#8:309\n1282#9,6:207\n1282#9,6:302\n*S KotlinDebug\n*F\n+ 1 ActorsSection.kt\nru/zona/app/screens/content/compositions/ActorsSectionKt\n*L\n36#1:91\n36#1:92,9\n50#1:169\n50#1:170,10\n50#1:216\n36#1:225\n69#1:226\n69#1:227,9\n69#1:317\n36#1:101,6\n36#1:116,3\n36#1:125,2\n42#1:140,6\n42#1:155,3\n42#1:164,2\n50#1:180,6\n50#1:195,3\n50#1:204,2\n50#1:215\n42#1:220\n36#1:224\n69#1:236,6\n69#1:251,3\n69#1:260,2\n80#1:274,6\n80#1:289,3\n80#1:298,2\n80#1:312\n69#1:316\n36#1:107,9\n36#1:127\n42#1:146,9\n42#1:166\n50#1:186,9\n50#1:206\n50#1:213,2\n42#1:218,2\n36#1:222,2\n69#1:242,9\n69#1:262\n80#1:280,9\n80#1:300\n80#1:310,2\n69#1:314,2\n36#1:119,6\n42#1:158,6\n50#1:198,6\n69#1:254,6\n80#1:292,6\n38#1:128\n46#1:129\n47#1:130\n50#1:168\n79#1:263\n86#1:308\n42#1:131\n42#1:132,8\n42#1:221\n80#1:264\n80#1:265,9\n80#1:313\n49#1:167\n49#1:217\n81#1:301\n81#1:309\n54#1:207,6\n84#1:302,6\n*E\n"})
public final class C17202g {
    /* JADX INFO: renamed from: a */
    public static final void m19674a(final List<C5931p> list, final Function1<? super String, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1503180319);
        int i11 = (c15688rMo18372i.mo18362N(list) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        if (!c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        } else {
            if (list.isEmpty()) {
                C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
                if (c15634y0M18412Y != null) {
                    c15634y0M18412Y.f50634d = new Function2(list, i10, function1) { // from class: ne.a

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ List f53945b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ Function1 f53946c;

                        {
                            this.f53946c = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM18294a = C15636Z0.m18294a(1);
                            C17202g.m19674a(this.f53945b, this.f53946c, (InterfaceC15676n) obj, iM18294a);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar2 = InterfaceC18861d.a.f58759m;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar2, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
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
            float f10 = 16;
            C18863f.a aVar4 = aVar2;
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60090g.getValue(), c15688rMo18372i, 0), C7481f.m8511d(aVar, f10), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10908c, c15688rMo18372i, 48, 0, 131068);
            c15688r = c15688rMo18372i;
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8517b(C20541F0.m25138b(aVar, C20541F0.m25137a(c15688r), true, false), 1.0f), f10, 0.0f, 2);
            int i13 = 6;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(f10), InterfaceC18861d.a.f58756j, c15688r, 6);
            long j11 = c15688r.f50813T;
            int i14 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688r.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8513f, c15688r);
            c15688r.mo18353E();
            if (c15688r.f50812S) {
                c15688r.mo18355G(aVar3);
            } else {
                c15688r.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688r, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688r, fVar);
            if (c15688r.f50812S || !Intrinsics.areEqual(c15688r.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688r, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688r, eVar);
            c15688r.mo18363O(1221116001);
            for (List<C5931p> list2 : CollectionsKt.chunked(list, 4)) {
                C18863f.a aVar5 = aVar4;
                C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.m2645g(f10), aVar5, c15688r, i13);
                long j12 = c15688r.f50813T;
                int i15 = (int) (j12 ^ (j12 >>> 32));
                InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688r.m18405R();
                InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar, c15688r);
                InterfaceC5799g.f19145s1.getClass();
                C5753J.a aVar6 = InterfaceC5799g.a.f19147b;
                c15688r.mo18353E();
                if (c15688r.f50812S) {
                    c15688r.mo18355G(aVar6);
                } else {
                    c15688r.mo18378o();
                }
                C15623T1.m18280a(c2036xM2689a2, c15688r, InterfaceC5799g.a.f19152g);
                C15623T1.m18280a(interfaceC15608O0M18405R3, c15688r, InterfaceC5799g.a.f19151f);
                InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
                if (c15688r.f50812S || !Intrinsics.areEqual(c15688r.mo18389z(), Integer.valueOf(i15))) {
                    C12269M6.m14188a(i15, c15688r, i15, c21098a2);
                }
                C15623T1.m18280a(interfaceC7507eM8566c3, c15688r, InterfaceC5799g.a.f19149d);
                c15688r.mo18363O(-325734987);
                for (final C5931p c5931p : list2) {
                    boolean zMo18350B = ((i11 & 112) == 32) | c15688r.mo18350B(c5931p);
                    Object objMo18389z = c15688r.mo18389z();
                    if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                        objMo18389z = new Function0() { // from class: ne.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(c5931p.f19639b);
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r.mo18380q(objMo18389z);
                    }
                    C10499u.m12605a(c5931p, (Function0) objMo18389z, c15688r, 0);
                }
                c15688r.m18410W(false);
                c15688r.m18410W(true);
                aVar4 = aVar5;
                i13 = 6;
            }
            c15688r.m18410W(false);
            c15688r.m18410W(true);
            c15688r.m18410W(true);
        }
        C15634Y0 c15634y0M18412Y2 = c15688r.m18412Y();
        if (c15634y0M18412Y2 != null) {
            c15634y0M18412Y2.f50634d = new Function2(list, i10, function1) { // from class: ne.c

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f53949b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f53950c;

                {
                    this.f53950c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17202g.m19674a(this.f53949b, this.f53950c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19675b(final List<C5931p> list, final Function1<? super String, Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-814256870);
        int i11 = (c15688rMo18372i.mo18362N(list) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        if (!c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        } else {
            if (list.isEmpty()) {
                C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
                if (c15634y0M18412Y != null) {
                    c15634y0M18412Y.f50634d = new Function2(list, i10, function1) { // from class: ne.d

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ List f53952b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ Function1 f53953c;

                        {
                            this.f53953c = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM18294a = C15636Z0.m18294a(1);
                            C17202g.m19675b(this.f53952b, this.f53953c, (InterfaceC15676n) obj, iM18294a);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar, 1.0f);
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
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
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19285c2.f60090g.getValue(), c15688rMo18372i, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, new C11732N0(C3376c.f10951l, C18580v.m21028b(24), new C16318q(900), 0L, 0, 0, C18580v.m21028b(32), 16646136), c15688rMo18372i, 0, 0, 131070);
            c15688r = c15688rMo18372i;
            C1963W0.m2623a(C7482g.m8519d(aVar, 12), c15688r);
            InterfaceC7507e interfaceC7507eM25138b = C20541F0.m25138b(aVar, C20541F0.m25137a(c15688r), true, false);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58756j, c15688r, 0);
            long j11 = c15688r.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688r.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM25138b, c15688r);
            c15688r.mo18353E();
            if (c15688r.f50812S) {
                c15688r.mo18355G(aVar2);
            } else {
                c15688r.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688r, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688r, fVar);
            if (c15688r.f50812S || !Intrinsics.areEqual(c15688r.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688r, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688r, eVar);
            c15688r.mo18363O(298899431);
            for (final C5931p c5931p : list) {
                boolean zMo18350B = ((i11 & 112) == 32) | c15688r.mo18350B(c5931p);
                Object objMo18389z = c15688r.mo18389z();
                if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                    objMo18389z = new Function0() { // from class: ne.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(c5931p.f19639b);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r.mo18380q(objMo18389z);
                }
                C16433z.m19071a(c5931p, (Function0) objMo18389z, c15688r, 0);
                C1963W0.m2623a(C7482g.m8529n(aVar, 16), c15688r);
            }
            c15688r.m18410W(false);
            c15688r.m18410W(true);
            c15688r.m18410W(true);
        }
        C15634Y0 c15634y0M18412Y2 = c15688r.m18412Y();
        if (c15634y0M18412Y2 != null) {
            c15634y0M18412Y2.f50634d = new Function2(list, i10, function1) { // from class: ne.f

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f53966b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f53967c;

                {
                    this.f53967c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17202g.m19675b(this.f53966b, this.f53967c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
