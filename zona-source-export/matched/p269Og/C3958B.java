package p269Og;

import com.sun.mail.imap.IMAPStore;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p125Gg.C1909q;
import p163J0.C2438k;
import p183K2.C2770g;
import p219M2.C3500w;
import p840wa.C18973a;
import p857xa.InterfaceC19639f;
import p875ya.InterfaceC19796b;
import p875ya.InterfaceC19797c;
import p875ya.InterfaceC19798d;
import p875ya.InterfaceC19799e;
import va.C18739x;
import va.InterfaceC18718c;
import va.InterfaceC18729n;
import za.C20807B0;
import za.C20813E0;
import za.C20838R0;
import za.C20849X;
import za.C20877h0;
import za.C20879i;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Og.B */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C3958B extends AbstractC4005l0 implements InterfaceC4009p {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: z */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f12986z;

    /* JADX INFO: renamed from: c */
    public final String f12987c;

    /* JADX INFO: renamed from: d */
    public final C1909q f12988d;

    /* JADX INFO: renamed from: e */
    public final int f12989e;

    /* JADX INFO: renamed from: f */
    public final int f12990f;

    /* JADX INFO: renamed from: g */
    public final List<String> f12991g;

    /* JADX INFO: renamed from: h */
    public final List<String> f12992h;

    /* JADX INFO: renamed from: i */
    public final long f12993i;

    /* JADX INFO: renamed from: j */
    public final boolean f12994j;

    /* JADX INFO: renamed from: k */
    public final C3962F f12995k;

    /* JADX INFO: renamed from: l */
    public final List<C3959C> f12996l;

    /* JADX INFO: renamed from: m */
    public final List<C3959C> f12997m;

    /* JADX INFO: renamed from: n */
    public final List<C3959C> f12998n;

    /* JADX INFO: renamed from: o */
    public final long f12999o;

    /* JADX INFO: renamed from: p */
    public final long f13000p;

    /* JADX INFO: renamed from: q */
    public final int f13001q;

    /* JADX INFO: renamed from: r */
    public final int f13002r;

    /* JADX INFO: renamed from: s */
    public final int f13003s;

    /* JADX INFO: renamed from: t */
    public final C1909q f13004t;

    /* JADX INFO: renamed from: u */
    public final List<C3964H> f13005u;

    /* JADX INFO: renamed from: v */
    public final Integer f13006v;

    /* JADX INFO: renamed from: w */
    public final List<String> f13007w;

    /* JADX INFO: renamed from: x */
    public final List<String> f13008x;

    /* JADX INFO: renamed from: y */
    public final EnumC3994g f13009y;

    /* JADX INFO: renamed from: Og.B$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C3958B> {

        /* JADX INFO: renamed from: a */
        public static final a f13010a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f13010a = aVar;
            C20807B0 c20807b0 = new C20807B0("Movie", aVar, 23);
            c20807b0.m25417j("id", false);
            c20807b0.m25417j(IMAPStore.ID_NAME, true);
            c20807b0.m25417j("year", true);
            c20807b0.m25417j("quality", true);
            c20807b0.m25417j("genreIds", true);
            c20807b0.m25417j("countryIds", true);
            c20807b0.m25417j("backdropId", true);
            c20807b0.m25417j("trailer", true);
            c20807b0.m25417j("ratings", true);
            c20807b0.m25417j("directors", true);
            c20807b0.m25417j("writers", true);
            c20807b0.m25417j("actors", true);
            c20807b0.m25417j("releaseDateInt", true);
            c20807b0.m25417j("releaseDateRus", true);
            c20807b0.m25417j("budget", true);
            c20807b0.m25417j("gross", true);
            c20807b0.m25417j("runtime", true);
            c20807b0.m25417j("description", true);
            c20807b0.m25417j("rels", true);
            c20807b0.m25417j("minAge", true);
            c20807b0.m25417j("trailerSourceTypes", true);
            c20807b0.m25417j("movieSourceTypes", true);
            c20807b0.m25417j("type", true);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C3958B.f12986z;
            C1909q.a aVar = C1909q.a.f6457a;
            C20849X c20849x = C20849X.f71662a;
            C20877h0 c20877h0 = C20877h0.f71694a;
            return new InterfaceC18718c[]{C20838R0.f71645a, aVar, c20849x, c20849x, lazyArr[4].getValue(), lazyArr[5].getValue(), c20877h0, C20879i.f71698a, C3962F.a.f13023a, lazyArr[9].getValue(), lazyArr[10].getValue(), lazyArr[11].getValue(), c20877h0, c20877h0, c20849x, c20849x, c20849x, aVar, lazyArr[18].getValue(), C18973a.m21290a(c20849x), lazyArr[20].getValue(), lazyArr[21].getValue(), C3998i.f13145a};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            int i10;
            List list;
            int i11;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C3958B.f12986z;
            C3962F c3962f = null;
            EnumC3994g enumC3994g = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
            C1909q c1909q = null;
            C1909q c1909q2 = null;
            List list5 = null;
            Integer num = null;
            List list6 = null;
            List list7 = null;
            String strMo21680g = null;
            long jMo21676C = 0;
            long jMo21676C2 = 0;
            long jMo21676C3 = 0;
            int i12 = 0;
            boolean z10 = true;
            int iMo21679d = 0;
            int iMo21679d2 = 0;
            boolean zMo21683m = false;
            int iMo21679d3 = 0;
            int iMo21679d4 = 0;
            int iMo21679d5 = 0;
            List list8 = null;
            List list9 = null;
            while (z10) {
                C1909q c1909q3 = c1909q2;
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                switch (iMo624x) {
                    case -1:
                        c1909q2 = c1909q3;
                        list6 = list6;
                        z10 = false;
                        break;
                    case 0:
                        list = list6;
                        strMo21680g = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 0);
                        i12 |= 1;
                        c1909q2 = c1909q3;
                        list6 = list;
                        enumC3994g = enumC3994g;
                        break;
                    case 1:
                        list = list6;
                        c1909q2 = (C1909q) interfaceC19796bMo641b.mo667l(interfaceC19639f, 1, C1909q.a.f6457a, c1909q3);
                        i12 |= 2;
                        list6 = list;
                        enumC3994g = enumC3994g;
                        break;
                    case 2:
                        iMo21679d = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 2);
                        i12 |= 4;
                        c1909q2 = c1909q3;
                        enumC3994g = enumC3994g;
                        break;
                    case 3:
                        iMo21679d2 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 3);
                        i12 |= 8;
                        c1909q2 = c1909q3;
                        enumC3994g = enumC3994g;
                        break;
                    case 4:
                        list6 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 4, lazyArr[4].getValue(), list6);
                        i12 |= 16;
                        c1909q2 = c1909q3;
                        enumC3994g = enumC3994g;
                        break;
                    case 5:
                        list6 = list6;
                        list7 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 5, lazyArr[5].getValue(), list7);
                        i12 |= 32;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 6:
                        jMo21676C = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 6);
                        i12 |= 64;
                        c1909q2 = c1909q3;
                        break;
                    case 7:
                        zMo21683m = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 7);
                        i12 |= 128;
                        c1909q2 = c1909q3;
                        break;
                    case 8:
                        list6 = list6;
                        c3962f = (C3962F) interfaceC19796bMo641b.mo667l(interfaceC19639f, 8, C3962F.a.f13023a, c3962f);
                        i12 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 9:
                        list6 = list6;
                        list8 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 9, lazyArr[9].getValue(), list8);
                        i12 |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 10:
                        list6 = list6;
                        list9 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 10, lazyArr[10].getValue(), list9);
                        i12 |= 1024;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 11:
                        list6 = list6;
                        list4 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 11, lazyArr[11].getValue(), list4);
                        i12 |= 2048;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 12:
                        jMo21676C2 = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 12);
                        i12 |= 4096;
                        c1909q2 = c1909q3;
                        break;
                    case 13:
                        jMo21676C3 = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 13);
                        i12 |= ConstantsKt.DEFAULT_BUFFER_SIZE;
                        c1909q2 = c1909q3;
                        break;
                    case 14:
                        iMo21679d3 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 14);
                        i12 |= 16384;
                        c1909q2 = c1909q3;
                        break;
                    case 15:
                        iMo21679d4 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 15);
                        i11 = 32768;
                        i12 |= i11;
                        c1909q2 = c1909q3;
                        break;
                    case 16:
                        iMo21679d5 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 16);
                        i11 = Parser.ARGC_LIMIT;
                        i12 |= i11;
                        c1909q2 = c1909q3;
                        break;
                    case 17:
                        c1909q = (C1909q) interfaceC19796bMo641b.mo667l(interfaceC19639f, 17, C1909q.a.f6457a, c1909q);
                        i10 = 131072;
                        i12 |= i10;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 18:
                        list5 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 18, lazyArr[18].getValue(), list5);
                        i10 = 262144;
                        i12 |= i10;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 19:
                        num = (Integer) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 19, C20849X.f71662a, num);
                        i10 = 524288;
                        i12 |= i10;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 20:
                        list3 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 20, lazyArr[20].getValue(), list3);
                        i10 = 1048576;
                        i12 |= i10;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 21:
                        list2 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 21, lazyArr[21].getValue(), list2);
                        i10 = 2097152;
                        i12 |= i10;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    case 22:
                        enumC3994g = (EnumC3994g) interfaceC19796bMo641b.mo667l(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                        i10 = 4194304;
                        i12 |= i10;
                        c1909q2 = c1909q3;
                        list6 = list6;
                        break;
                    default:
                        throw new C18739x(iMo624x);
                }
            }
            List list10 = list6;
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            Integer num2 = num;
            return new C3958B(i12, strMo21680g, c1909q2, iMo21679d, iMo21679d2, list10, list7, jMo21676C, zMo21683m, c3962f, list8, list9, list4, jMo21676C2, jMo21676C3, iMo21679d3, iMo21679d4, iMo21679d5, c1909q, list5, num2, list3, list2, enumC3994g);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:102:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:108:0x01f6 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:109:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:112:0x0207  */
        /* JADX WARN: Code duplicated, block: B:113:0x020a  */
        /* JADX WARN: Code duplicated, block: B:118:0x0229  */
        /* JADX WARN: Code duplicated, block: B:119:0x022c  */
        /* JADX WARN: Code duplicated, block: B:124:0x024b  */
        /* JADX WARN: Code duplicated, block: B:125:0x024e  */
        /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:7:0x006c  */
        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C1909q c1909q;
            List<C3964H> list;
            List<String> list2;
            List<String> list3;
            EnumC3994g enumC3994g;
            C3958B c3958b = (C3958B) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C3958B.f12986z;
            String str = c3958b.f12987c;
            EnumC3994g enumC3994g2 = c3958b.f13009y;
            List<String> list4 = c3958b.f13008x;
            List<String> list5 = c3958b.f13007w;
            Integer num = c3958b.f13006v;
            List<C3964H> list6 = c3958b.f13005u;
            C1909q c1909q2 = c3958b.f13004t;
            int i10 = c3958b.f13003s;
            int i11 = c3958b.f13002r;
            int i12 = c3958b.f13001q;
            long j10 = c3958b.f13000p;
            long j11 = c3958b.f12999o;
            List<C3959C> list7 = c3958b.f12998n;
            List<C3959C> list8 = c3958b.f12997m;
            List<C3959C> list9 = c3958b.f12996l;
            C3962F c3962f = c3958b.f12995k;
            boolean z10 = c3958b.f12994j;
            long j12 = c3958b.f12993i;
            List<String> list10 = c3958b.f12992h;
            List<String> list11 = c3958b.f12991g;
            int i13 = c3958b.f12990f;
            int i14 = c3958b.f12989e;
            C1909q c1909q3 = c3958b.f12988d;
            interfaceC19797cMo681b.mo703x(interfaceC19639f, 0, str);
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, C1909q.a.f6457a, c1909q3);
            } else {
                C1909q.Companion.getClass();
                if (!Intrinsics.areEqual(c1909q3, C1909q.f6452e)) {
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, C1909q.a.f6457a, c1909q3);
                }
            }
            if (interfaceC19797cMo681b.mo676A() || i14 != 0) {
                interfaceC19797cMo681b.mo693n(2, i14, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || i13 != 15) {
                interfaceC19797cMo681b.mo693n(3, i13, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(list11, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 4, lazyArr[4].getValue(), list11);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(list10, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 5, lazyArr[5].getValue(), list10);
            }
            if (interfaceC19797cMo681b.mo676A() || j12 != 0) {
                interfaceC19797cMo681b.mo699t(interfaceC19639f, 6, j12);
            }
            if (interfaceC19797cMo681b.mo676A() || z10) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 7, z10);
            }
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 8, C3962F.a.f13023a, c3962f);
            } else {
                C3962F.Companion.getClass();
                if (!Intrinsics.areEqual(c3962f, C3962F.f13019d)) {
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 8, C3962F.a.f13023a, c3962f);
                }
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(list9, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 9, lazyArr[9].getValue(), list9);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(list8, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 10, lazyArr[10].getValue(), list8);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(list7, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 11, lazyArr[11].getValue(), list7);
            }
            if (interfaceC19797cMo681b.mo676A() || j11 != 0) {
                interfaceC19797cMo681b.mo699t(interfaceC19639f, 12, j11);
            }
            if (interfaceC19797cMo681b.mo676A() || j10 != 0) {
                interfaceC19797cMo681b.mo699t(interfaceC19639f, 13, j10);
            }
            if (interfaceC19797cMo681b.mo676A() || i12 != 0) {
                interfaceC19797cMo681b.mo693n(14, i12, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || i11 != 0) {
                interfaceC19797cMo681b.mo693n(15, i11, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || i10 != 0) {
                interfaceC19797cMo681b.mo693n(16, i10, interfaceC19639f);
            }
            if (!interfaceC19797cMo681b.mo676A()) {
                C1909q.Companion.getClass();
                c1909q = c1909q2;
                if (!Intrinsics.areEqual(c1909q, C1909q.f6452e)) {
                }
                if (interfaceC19797cMo681b.mo676A()) {
                    list = list6;
                    if (!Intrinsics.areEqual(list, CollectionsKt.emptyList())) {
                    }
                    if (interfaceC19797cMo681b.mo676A() || num != null) {
                        interfaceC19797cMo681b.mo702w(interfaceC19639f, 19, C20849X.f71662a, num);
                    }
                    if (interfaceC19797cMo681b.mo676A()) {
                        list2 = list5;
                        if (!Intrinsics.areEqual(list2, CollectionsKt.emptyList())) {
                        }
                        if (interfaceC19797cMo681b.mo676A()) {
                            list3 = list4;
                            if (!Intrinsics.areEqual(list3, CollectionsKt.emptyList())) {
                            }
                            if (interfaceC19797cMo681b.mo676A()) {
                                enumC3994g = enumC3994g2;
                                if (enumC3994g != EnumC3994g.MOVIE) {
                                }
                                interfaceC19797cMo681b.mo682c();
                            }
                            enumC3994g = enumC3994g2;
                            interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                            interfaceC19797cMo681b.mo682c();
                        }
                        list3 = list4;
                        interfaceC19797cMo681b.mo690k(interfaceC19639f, 21, lazyArr[21].getValue(), list3);
                        if (interfaceC19797cMo681b.mo676A()) {
                            enumC3994g = enumC3994g2;
                            if (enumC3994g != EnumC3994g.MOVIE) {
                            }
                            interfaceC19797cMo681b.mo682c();
                        }
                        enumC3994g = enumC3994g2;
                        interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                        interfaceC19797cMo681b.mo682c();
                    }
                    list2 = list5;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 20, lazyArr[20].getValue(), list2);
                    if (interfaceC19797cMo681b.mo676A()) {
                        list3 = list4;
                        if (!Intrinsics.areEqual(list3, CollectionsKt.emptyList())) {
                        }
                        if (interfaceC19797cMo681b.mo676A()) {
                            enumC3994g = enumC3994g2;
                            if (enumC3994g != EnumC3994g.MOVIE) {
                            }
                            interfaceC19797cMo681b.mo682c();
                        }
                        enumC3994g = enumC3994g2;
                        interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                        interfaceC19797cMo681b.mo682c();
                    }
                    list3 = list4;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 21, lazyArr[21].getValue(), list3);
                    if (interfaceC19797cMo681b.mo676A()) {
                        enumC3994g = enumC3994g2;
                        if (enumC3994g != EnumC3994g.MOVIE) {
                        }
                        interfaceC19797cMo681b.mo682c();
                    }
                    enumC3994g = enumC3994g2;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                    interfaceC19797cMo681b.mo682c();
                }
                list = list6;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 18, lazyArr[18].getValue(), list);
                if (interfaceC19797cMo681b.mo676A()) {
                    interfaceC19797cMo681b.mo702w(interfaceC19639f, 19, C20849X.f71662a, num);
                } else {
                    interfaceC19797cMo681b.mo702w(interfaceC19639f, 19, C20849X.f71662a, num);
                }
                if (interfaceC19797cMo681b.mo676A()) {
                    list2 = list5;
                    if (!Intrinsics.areEqual(list2, CollectionsKt.emptyList())) {
                    }
                    if (interfaceC19797cMo681b.mo676A()) {
                        list3 = list4;
                        if (!Intrinsics.areEqual(list3, CollectionsKt.emptyList())) {
                        }
                        if (interfaceC19797cMo681b.mo676A()) {
                            enumC3994g = enumC3994g2;
                            if (enumC3994g != EnumC3994g.MOVIE) {
                            }
                            interfaceC19797cMo681b.mo682c();
                        }
                        enumC3994g = enumC3994g2;
                        interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                        interfaceC19797cMo681b.mo682c();
                    }
                    list3 = list4;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 21, lazyArr[21].getValue(), list3);
                    if (interfaceC19797cMo681b.mo676A()) {
                        enumC3994g = enumC3994g2;
                        if (enumC3994g != EnumC3994g.MOVIE) {
                        }
                        interfaceC19797cMo681b.mo682c();
                    }
                    enumC3994g = enumC3994g2;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                    interfaceC19797cMo681b.mo682c();
                }
                list2 = list5;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 20, lazyArr[20].getValue(), list2);
                if (interfaceC19797cMo681b.mo676A()) {
                    list3 = list4;
                    if (!Intrinsics.areEqual(list3, CollectionsKt.emptyList())) {
                    }
                    if (interfaceC19797cMo681b.mo676A()) {
                        enumC3994g = enumC3994g2;
                        if (enumC3994g != EnumC3994g.MOVIE) {
                        }
                        interfaceC19797cMo681b.mo682c();
                    }
                    enumC3994g = enumC3994g2;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                    interfaceC19797cMo681b.mo682c();
                }
                list3 = list4;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 21, lazyArr[21].getValue(), list3);
                if (interfaceC19797cMo681b.mo676A()) {
                    enumC3994g = enumC3994g2;
                    if (enumC3994g != EnumC3994g.MOVIE) {
                    }
                    interfaceC19797cMo681b.mo682c();
                }
                enumC3994g = enumC3994g2;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                interfaceC19797cMo681b.mo682c();
            }
            c1909q = c1909q2;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 17, C1909q.a.f6457a, c1909q);
            if (interfaceC19797cMo681b.mo676A()) {
                list = list6;
                if (!Intrinsics.areEqual(list, CollectionsKt.emptyList())) {
                }
                if (interfaceC19797cMo681b.mo676A()) {
                    interfaceC19797cMo681b.mo702w(interfaceC19639f, 19, C20849X.f71662a, num);
                } else {
                    interfaceC19797cMo681b.mo702w(interfaceC19639f, 19, C20849X.f71662a, num);
                }
                if (interfaceC19797cMo681b.mo676A()) {
                    list2 = list5;
                    if (!Intrinsics.areEqual(list2, CollectionsKt.emptyList())) {
                    }
                    if (interfaceC19797cMo681b.mo676A()) {
                        list3 = list4;
                        if (!Intrinsics.areEqual(list3, CollectionsKt.emptyList())) {
                        }
                        if (interfaceC19797cMo681b.mo676A()) {
                            enumC3994g = enumC3994g2;
                            if (enumC3994g != EnumC3994g.MOVIE) {
                            }
                            interfaceC19797cMo681b.mo682c();
                        }
                        enumC3994g = enumC3994g2;
                        interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                        interfaceC19797cMo681b.mo682c();
                    }
                    list3 = list4;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 21, lazyArr[21].getValue(), list3);
                    if (interfaceC19797cMo681b.mo676A()) {
                        enumC3994g = enumC3994g2;
                        if (enumC3994g != EnumC3994g.MOVIE) {
                        }
                        interfaceC19797cMo681b.mo682c();
                    }
                    enumC3994g = enumC3994g2;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                    interfaceC19797cMo681b.mo682c();
                }
                list2 = list5;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 20, lazyArr[20].getValue(), list2);
                if (interfaceC19797cMo681b.mo676A()) {
                    list3 = list4;
                    if (!Intrinsics.areEqual(list3, CollectionsKt.emptyList())) {
                    }
                    if (interfaceC19797cMo681b.mo676A()) {
                        enumC3994g = enumC3994g2;
                        if (enumC3994g != EnumC3994g.MOVIE) {
                        }
                        interfaceC19797cMo681b.mo682c();
                    }
                    enumC3994g = enumC3994g2;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                    interfaceC19797cMo681b.mo682c();
                }
                list3 = list4;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 21, lazyArr[21].getValue(), list3);
                if (interfaceC19797cMo681b.mo676A()) {
                    enumC3994g = enumC3994g2;
                    if (enumC3994g != EnumC3994g.MOVIE) {
                    }
                    interfaceC19797cMo681b.mo682c();
                }
                enumC3994g = enumC3994g2;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                interfaceC19797cMo681b.mo682c();
            }
            list = list6;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 18, lazyArr[18].getValue(), list);
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo702w(interfaceC19639f, 19, C20849X.f71662a, num);
            } else {
                interfaceC19797cMo681b.mo702w(interfaceC19639f, 19, C20849X.f71662a, num);
            }
            if (interfaceC19797cMo681b.mo676A()) {
                list2 = list5;
                if (!Intrinsics.areEqual(list2, CollectionsKt.emptyList())) {
                }
                if (interfaceC19797cMo681b.mo676A()) {
                    list3 = list4;
                    if (!Intrinsics.areEqual(list3, CollectionsKt.emptyList())) {
                    }
                    if (interfaceC19797cMo681b.mo676A()) {
                        enumC3994g = enumC3994g2;
                        if (enumC3994g != EnumC3994g.MOVIE) {
                        }
                        interfaceC19797cMo681b.mo682c();
                    }
                    enumC3994g = enumC3994g2;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                    interfaceC19797cMo681b.mo682c();
                }
                list3 = list4;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 21, lazyArr[21].getValue(), list3);
                if (interfaceC19797cMo681b.mo676A()) {
                    enumC3994g = enumC3994g2;
                    if (enumC3994g != EnumC3994g.MOVIE) {
                    }
                    interfaceC19797cMo681b.mo682c();
                }
                enumC3994g = enumC3994g2;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                interfaceC19797cMo681b.mo682c();
            }
            list2 = list5;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 20, lazyArr[20].getValue(), list2);
            if (interfaceC19797cMo681b.mo676A()) {
                list3 = list4;
                if (!Intrinsics.areEqual(list3, CollectionsKt.emptyList())) {
                }
                if (interfaceC19797cMo681b.mo676A()) {
                    enumC3994g = enumC3994g2;
                    if (enumC3994g != EnumC3994g.MOVIE) {
                    }
                    interfaceC19797cMo681b.mo682c();
                }
                enumC3994g = enumC3994g2;
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
                interfaceC19797cMo681b.mo682c();
            }
            list3 = list4;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 21, lazyArr[21].getValue(), list3);
            if (interfaceC19797cMo681b.mo676A()) {
                enumC3994g = enumC3994g2;
                if (enumC3994g != EnumC3994g.MOVIE) {
                }
                interfaceC19797cMo681b.mo682c();
            }
            enumC3994g = enumC3994g2;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 22, C3998i.f13145a, enumC3994g);
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Og.B$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C3958B> serializer() {
            return a.f13010a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        int i10 = 0;
        f12986z = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C4013t(i10)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C4014u(0)), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C4015v(i10)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C4016w(i10)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C4017x(i10)), null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C4018y(i10)), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C4019z(0)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C3957A(0)), null};
    }

    public C3958B(int i10, String str, C1909q c1909q, int i11, int i12, List list, List list2, long j10, boolean z10, C3962F c3962f, List list3, List list4, List list5, long j11, long j12, int i13, int i14, int i15, C1909q c1909q2, List list6, Integer num, List list7, List list8, EnumC3994g enumC3994g) {
        C1909q c1909q3;
        if (1 != (i10 & 1)) {
            C20915z0.m25449a(i10, 1, a.f13010a.getDescriptor());
            throw null;
        }
        this.f12987c = str;
        if ((i10 & 2) == 0) {
            C1909q.Companion.getClass();
            this.f12988d = C1909q.f6452e;
        } else {
            this.f12988d = c1909q;
        }
        if ((i10 & 4) == 0) {
            this.f12989e = 0;
        } else {
            this.f12989e = i11;
        }
        if ((i10 & 8) == 0) {
            this.f12990f = 15;
        } else {
            this.f12990f = i12;
        }
        if ((i10 & 16) == 0) {
            this.f12991g = CollectionsKt.emptyList();
        } else {
            this.f12991g = list;
        }
        if ((i10 & 32) == 0) {
            this.f12992h = CollectionsKt.emptyList();
        } else {
            this.f12992h = list2;
        }
        if ((i10 & 64) == 0) {
            this.f12993i = 0L;
        } else {
            this.f12993i = j10;
        }
        if ((i10 & 128) == 0) {
            this.f12994j = false;
        } else {
            this.f12994j = z10;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            C3962F.Companion.getClass();
            this.f12995k = C3962F.f13019d;
        } else {
            this.f12995k = c3962f;
        }
        if ((i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.f12996l = CollectionsKt.emptyList();
        } else {
            this.f12996l = list3;
        }
        this.f12997m = (i10 & 1024) == 0 ? CollectionsKt.emptyList() : list4;
        this.f12998n = (i10 & 2048) == 0 ? CollectionsKt.emptyList() : list5;
        if ((i10 & 4096) == 0) {
            this.f12999o = 0L;
        } else {
            this.f12999o = j11;
        }
        this.f13000p = (i10 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? j12 : 0L;
        if ((i10 & 16384) == 0) {
            this.f13001q = 0;
        } else {
            this.f13001q = i13;
        }
        if ((32768 & i10) == 0) {
            this.f13002r = 0;
        } else {
            this.f13002r = i14;
        }
        if ((65536 & i10) == 0) {
            this.f13003s = 0;
        } else {
            this.f13003s = i15;
        }
        if ((131072 & i10) == 0) {
            C1909q.Companion.getClass();
            c1909q3 = C1909q.f6452e;
        } else {
            c1909q3 = c1909q2;
        }
        this.f13004t = c1909q3;
        this.f13005u = (262144 & i10) == 0 ? CollectionsKt.emptyList() : list6;
        if ((524288 & i10) == 0) {
            this.f13006v = null;
        } else {
            this.f13006v = num;
        }
        this.f13007w = (1048576 & i10) == 0 ? CollectionsKt.emptyList() : list7;
        this.f13008x = (2097152 & i10) == 0 ? CollectionsKt.emptyList() : list8;
        this.f13009y = (i10 & 4194304) == 0 ? EnumC3994g.MOVIE : enumC3994g;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: E */
    public final C3962F mo4679E() {
        return this.f12995k;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: F */
    public final List<C3964H> mo4680F() {
        return this.f13005u;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: a */
    public final int mo4681a() {
        return this.f12989e;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: b */
    public final long mo4682b() {
        return this.f13000p;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: d */
    public final List<C3959C> mo4683d() {
        return this.f12997m;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: e */
    public final List<C3959C> mo4684e() {
        return this.f12996l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3958B)) {
            return false;
        }
        C3958B c3958b = (C3958B) obj;
        return Intrinsics.areEqual(this.f12987c, c3958b.f12987c) && Intrinsics.areEqual(this.f12988d, c3958b.f12988d) && this.f12989e == c3958b.f12989e && this.f12990f == c3958b.f12990f && Intrinsics.areEqual(this.f12991g, c3958b.f12991g) && Intrinsics.areEqual(this.f12992h, c3958b.f12992h) && this.f12993i == c3958b.f12993i && this.f12994j == c3958b.f12994j && Intrinsics.areEqual(this.f12995k, c3958b.f12995k) && Intrinsics.areEqual(this.f12996l, c3958b.f12996l) && Intrinsics.areEqual(this.f12997m, c3958b.f12997m) && Intrinsics.areEqual(this.f12998n, c3958b.f12998n) && this.f12999o == c3958b.f12999o && this.f13000p == c3958b.f13000p && this.f13001q == c3958b.f13001q && this.f13002r == c3958b.f13002r && this.f13003s == c3958b.f13003s && Intrinsics.areEqual(this.f13004t, c3958b.f13004t) && Intrinsics.areEqual(this.f13005u, c3958b.f13005u) && Intrinsics.areEqual(this.f13006v, c3958b.f13006v) && Intrinsics.areEqual(this.f13007w, c3958b.f13007w) && Intrinsics.areEqual(this.f13008x, c3958b.f13008x);
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: f */
    public final List<C3959C> mo4685f() {
        return this.f12998n;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: g */
    public final Integer mo4686g() {
        return this.f13006v;
    }

    @Override // p269Og.InterfaceC4009p
    public final C1909q getDescription() {
        return this.f13004t;
    }

    @Override // p269Og.InterfaceC4008o
    public final String getId() {
        return this.f12987c;
    }

    @Override // p269Og.InterfaceC4007n
    public final C1909q getName() {
        return this.f12988d;
    }

    @Override // p269Og.InterfaceC4008o
    public final EnumC3994g getType() {
        return this.f13009y;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: h */
    public final long mo4687h() {
        return this.f12999o;
    }

    public final int hashCode() {
        int iM3149b = C2438k.m3149b(C2438k.m3149b((((((this.f12988d.hashCode() + (this.f12987c.hashCode() * 31)) * 31) + this.f12989e) * 31) + this.f12990f) * 31, this.f12991g, 31), this.f12992h, 31);
        long j10 = this.f12993i;
        int iM3149b2 = C2438k.m3149b(C2438k.m3149b(C2438k.m3149b((this.f12995k.hashCode() + ((((iM3149b + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f12994j ? 1231 : 1237)) * 31)) * 31, this.f12996l, 31), this.f12997m, 31), this.f12998n, 31);
        long j11 = this.f12999o;
        int i10 = (iM3149b2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f13000p;
        int iM3149b3 = C2438k.m3149b((this.f13004t.hashCode() + ((((((((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f13001q) * 31) + this.f13002r) * 31) + this.f13003s) * 31)) * 31, this.f13005u, 31);
        Integer num = this.f13006v;
        return this.f13008x.hashCode() + C2438k.m3149b((iM3149b3 + (num == null ? 0 : num.hashCode())) * 31, this.f13007w, 31);
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: k */
    public final int mo4688k() {
        return this.f13003s;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: m */
    public final List<String> mo4689m() {
        return this.f12992h;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: n */
    public final long mo4690n() {
        return this.f12993i;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: q */
    public final int mo4691q() {
        return this.f12990f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Movie(id=");
        sb2.append(this.f12987c);
        sb2.append(", name=");
        sb2.append(this.f12988d);
        sb2.append(", year=");
        C2770g.m3491a(sb2, this.f12989e, ", quality=", this.f12990f, ", genreIds=");
        sb2.append(this.f12991g);
        sb2.append(", countryIds=");
        sb2.append(this.f12992h);
        sb2.append(", backdropId=");
        sb2.append(this.f12993i);
        sb2.append(", trailer=");
        sb2.append(this.f12994j);
        sb2.append(", ratings=");
        sb2.append(this.f12995k);
        sb2.append(", directors=");
        sb2.append(this.f12996l);
        sb2.append(", writers=");
        sb2.append(this.f12997m);
        sb2.append(", actors=");
        sb2.append(this.f12998n);
        C3500w.m4269a(sb2, ", releaseDateInt=", this.f12999o, ", releaseDateRus=");
        sb2.append(this.f13000p);
        sb2.append(", budget=");
        sb2.append(this.f13001q);
        sb2.append(", gross=");
        sb2.append(this.f13002r);
        sb2.append(", runtime=");
        sb2.append(this.f13003s);
        sb2.append(", description=");
        sb2.append(this.f13004t);
        sb2.append(", rels=");
        sb2.append(this.f13005u);
        sb2.append(", minAge=");
        sb2.append(this.f13006v);
        sb2.append(", trailerSourceTypes=");
        sb2.append(this.f13007w);
        sb2.append(", movieSourceTypes=");
        sb2.append(this.f13008x);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // p269Og.AbstractC4005l0, p125Gg.InterfaceC1900h
    /* JADX INFO: renamed from: u */
    public final String mo2252u() {
        return this.f12987c;
    }

    @Override // p269Og.InterfaceC4009p
    /* JADX INFO: renamed from: y */
    public final List<String> mo4692y() {
        return this.f12991g;
    }

    public C3958B(String str, C1909q c1909q, int i10, int i11, List<String> list, List<String> list2, long j10, boolean z10, C3962F c3962f, List<C3959C> list3, List<C3959C> list4, List<C3959C> list5, long j11, long j12, int i12, int i13, int i14, C1909q c1909q2, List<C3964H> list6, Integer num, List<String> list7, List<String> list8) {
        this.f12987c = str;
        this.f12988d = c1909q;
        this.f12989e = i10;
        this.f12990f = i11;
        this.f12991g = list;
        this.f12992h = list2;
        this.f12993i = j10;
        this.f12994j = z10;
        this.f12995k = c3962f;
        this.f12996l = list3;
        this.f12997m = list4;
        this.f12998n = list5;
        this.f12999o = j11;
        this.f13000p = j12;
        this.f13001q = i12;
        this.f13002r = i13;
        this.f13003s = i14;
        this.f13004t = c1909q2;
        this.f13005u = list6;
        this.f13006v = num;
        this.f13007w = list7;
        this.f13008x = list8;
        this.f13009y = EnumC3994g.MOVIE;
    }
}
