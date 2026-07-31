package sd;

import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p163J0.C2438k;
import p233Mg.C3561B;
import p607i9.C12202I7;
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
import za.C20824K;
import za.C20849X;
import za.C20879i;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: sd.v */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C18164v {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: s */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f56501s;

    /* JADX INFO: renamed from: a */
    public final C3561B f56502a;

    /* JADX INFO: renamed from: b */
    public final int f56503b;

    /* JADX INFO: renamed from: c */
    public final int f56504c;

    /* JADX INFO: renamed from: d */
    public final float f56505d;

    /* JADX INFO: renamed from: e */
    public final float f56506e;

    /* JADX INFO: renamed from: f */
    public final Set<String> f56507f;

    /* JADX INFO: renamed from: g */
    public final Set<String> f56508g;

    /* JADX INFO: renamed from: h */
    public final boolean f56509h;

    /* JADX INFO: renamed from: i */
    public final Set<String> f56510i;

    /* JADX INFO: renamed from: j */
    public final Set<String> f56511j;

    /* JADX INFO: renamed from: k */
    public final boolean f56512k;

    /* JADX INFO: renamed from: l */
    public final boolean f56513l;

    /* JADX INFO: renamed from: m */
    public final boolean f56514m;

    /* JADX INFO: renamed from: n */
    public final int f56515n;

    /* JADX INFO: renamed from: o */
    public final List<Pair<String, String>> f56516o;

    /* JADX INFO: renamed from: p */
    public final List<String> f56517p;

    /* JADX INFO: renamed from: q */
    public final boolean f56518q;

    /* JADX INFO: renamed from: r */
    public final boolean f56519r;

    /* JADX INFO: renamed from: sd.v$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C18164v> {

        /* JADX INFO: renamed from: a */
        public static final a f56520a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f56520a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.filter.model.FilterState", aVar, 18);
            c20807b0.m25417j("sortBy", true);
            c20807b0.m25417j("yearFrom", true);
            c20807b0.m25417j("yearTo", true);
            c20807b0.m25417j("ratingFrom", true);
            c20807b0.m25417j("ratingTo", true);
            c20807b0.m25417j("genres", true);
            c20807b0.m25417j("genresExcluded", true);
            c20807b0.m25417j("genresCooperative", true);
            c20807b0.m25417j("countries", true);
            c20807b0.m25417j("countriesExcluded", true);
            c20807b0.m25417j("countriesCooperative", true);
            c20807b0.m25417j("showAdult", true);
            c20807b0.m25417j("showFavorites", true);
            c20807b0.m25417j("index", true);
            c20807b0.m25417j("languagesAndSubtitles", true);
            c20807b0.m25417j("movieSourceTypes", false);
            c20807b0.m25417j("advancedFilters", true);
            c20807b0.m25417j("hideWatched", true);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C18164v.f56501s;
            C20849X c20849x = C20849X.f71662a;
            C20824K c20824k = C20824K.f71630a;
            C20879i c20879i = C20879i.f71698a;
            return new InterfaceC18718c[]{C3561B.a.f11705a, c20849x, c20849x, c20824k, c20824k, lazyArr[5].getValue(), lazyArr[6].getValue(), c20879i, lazyArr[8].getValue(), lazyArr[9].getValue(), c20879i, c20879i, c20879i, c20849x, lazyArr[14].getValue(), lazyArr[15].getValue(), c20879i, c20879i};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            int i10;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C18164v.f56501s;
            Set set = null;
            Set set2 = null;
            List list = null;
            List list2 = null;
            C3561B c3561b = null;
            Set set3 = null;
            Set set4 = null;
            boolean z10 = true;
            int i11 = 0;
            float fMo21677D = 0.0f;
            float fMo21677D2 = 0.0f;
            int iMo21679d = 0;
            int iMo21679d2 = 0;
            boolean zMo21683m = false;
            boolean zMo21683m2 = false;
            boolean zMo21683m3 = false;
            boolean zMo21683m4 = false;
            int iMo21679d3 = 0;
            boolean zMo21683m5 = false;
            boolean zMo21683m6 = false;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                switch (iMo624x) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        c3561b = (C3561B) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C3561B.a.f11705a, c3561b);
                        i11 |= 1;
                        continue;
                    case 1:
                        iMo21679d = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        iMo21679d2 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 2);
                        i11 |= 4;
                        continue;
                    case 3:
                        fMo21677D = interfaceC19796bMo641b.mo21677D(interfaceC19639f, 3);
                        i11 |= 8;
                        continue;
                    case 4:
                        fMo21677D2 = interfaceC19796bMo641b.mo21677D(interfaceC19639f, 4);
                        i11 |= 16;
                        continue;
                    case 5:
                        set3 = (Set) interfaceC19796bMo641b.mo667l(interfaceC19639f, 5, lazyArr[5].getValue(), set3);
                        i11 |= 32;
                        continue;
                    case 6:
                        set4 = (Set) interfaceC19796bMo641b.mo667l(interfaceC19639f, 6, lazyArr[6].getValue(), set4);
                        i11 |= 64;
                        continue;
                    case 7:
                        zMo21683m = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 7);
                        i11 |= 128;
                        continue;
                    case 8:
                        set = (Set) interfaceC19796bMo641b.mo667l(interfaceC19639f, 8, lazyArr[8].getValue(), set);
                        i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        continue;
                    case 9:
                        set2 = (Set) interfaceC19796bMo641b.mo667l(interfaceC19639f, 9, lazyArr[9].getValue(), set2);
                        i11 |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                        continue;
                    case 10:
                        zMo21683m2 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 10);
                        i11 |= 1024;
                        continue;
                    case 11:
                        zMo21683m3 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 11);
                        i11 |= 2048;
                        continue;
                    case 12:
                        zMo21683m4 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 12);
                        i11 |= 4096;
                        continue;
                    case 13:
                        iMo21679d3 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 13);
                        i11 |= ConstantsKt.DEFAULT_BUFFER_SIZE;
                        continue;
                    case 14:
                        list = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 14, lazyArr[14].getValue(), list);
                        i11 |= 16384;
                        continue;
                    case 15:
                        list2 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 15, lazyArr[15].getValue(), list2);
                        i11 |= 32768;
                        continue;
                    case 16:
                        zMo21683m5 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 16);
                        i10 = Parser.ARGC_LIMIT;
                        break;
                    case 17:
                        zMo21683m6 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 17);
                        i10 = 131072;
                        break;
                    default:
                        throw new C18739x(iMo624x);
                }
                i11 |= i10;
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C18164v(i11, c3561b, iMo21679d, iMo21679d2, fMo21677D, fMo21677D2, set3, set4, zMo21683m, set, set2, zMo21683m2, zMo21683m3, zMo21683m4, iMo21679d3, list, list2, zMo21683m5, zMo21683m6);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C18164v c18164v = (C18164v) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C18164v.f56501s;
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3561B.a.f11705a, c18164v.f56502a);
            } else {
                C3561B c3561b = c18164v.f56502a;
                C3561B.Companion.getClass();
                if (!Intrinsics.areEqual(c3561b, C3561B.f11703b)) {
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3561B.a.f11705a, c18164v.f56502a);
                }
            }
            if (interfaceC19797cMo681b.mo676A() || c18164v.f56503b != 1900) {
                interfaceC19797cMo681b.mo693n(1, c18164v.f56503b, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || c18164v.f56504c != C18155m.f56490g) {
                interfaceC19797cMo681b.mo693n(2, c18164v.f56504c, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || Float.compare(c18164v.f56505d, 0.0f) != 0) {
                interfaceC19797cMo681b.mo692m(interfaceC19639f, 3, c18164v.f56505d);
            }
            if (interfaceC19797cMo681b.mo676A() || Float.compare(c18164v.f56506e, 10.0f) != 0) {
                interfaceC19797cMo681b.mo692m(interfaceC19639f, 4, c18164v.f56506e);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c18164v.f56507f, SetsKt.emptySet())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 5, lazyArr[5].getValue(), c18164v.f56507f);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c18164v.f56508g, SetsKt.emptySet())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 6, lazyArr[6].getValue(), c18164v.f56508g);
            }
            if (interfaceC19797cMo681b.mo676A() || !c18164v.f56509h) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 7, c18164v.f56509h);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c18164v.f56510i, SetsKt.emptySet())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 8, lazyArr[8].getValue(), c18164v.f56510i);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c18164v.f56511j, SetsKt.emptySet())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 9, lazyArr[9].getValue(), c18164v.f56511j);
            }
            if (interfaceC19797cMo681b.mo676A() || c18164v.f56512k) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 10, c18164v.f56512k);
            }
            if (interfaceC19797cMo681b.mo676A() || c18164v.f56513l) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 11, c18164v.f56513l);
            }
            if (interfaceC19797cMo681b.mo676A() || c18164v.f56514m) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 12, c18164v.f56514m);
            }
            if (interfaceC19797cMo681b.mo676A() || c18164v.f56515n != 0) {
                interfaceC19797cMo681b.mo693n(13, c18164v.f56515n, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c18164v.f56516o, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 14, lazyArr[14].getValue(), c18164v.f56516o);
            }
            InterfaceC18718c<Object> value = lazyArr[15].getValue();
            List<String> list = c18164v.f56517p;
            boolean z10 = c18164v.f56519r;
            boolean z11 = c18164v.f56518q;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 15, value, list);
            if (interfaceC19797cMo681b.mo676A() || z11) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 16, z11);
            }
            if (interfaceC19797cMo681b.mo676A() || z10) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 17, z10);
            }
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: sd.v$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C18164v> serializer() {
            return a.f56520a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f56501s = new Lazy[]{null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C18158p()), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C18159q()), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C18160r()), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C18161s()), null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C18162t(0)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C18163u()), null, null};
    }

    public C18164v(int i10, C3561B c3561b, int i11, int i12, float f10, float f11, Set set, Set set2, boolean z10, Set set3, Set set4, boolean z11, boolean z12, boolean z13, int i13, List list, List list2, boolean z14, boolean z15) {
        if (32768 != (i10 & 32768)) {
            C20915z0.m25449a(i10, 32768, a.f56520a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            C3561B.Companion.getClass();
            c3561b = C3561B.f11703b;
        }
        this.f56502a = c3561b;
        if ((i10 & 2) == 0) {
            this.f56503b = 1900;
        } else {
            this.f56503b = i11;
        }
        if ((i10 & 4) == 0) {
            this.f56504c = C18155m.f56490g;
        } else {
            this.f56504c = i12;
        }
        if ((i10 & 8) == 0) {
            this.f56505d = 0.0f;
        } else {
            this.f56505d = f10;
        }
        if ((i10 & 16) == 0) {
            this.f56506e = 10.0f;
        } else {
            this.f56506e = f11;
        }
        if ((i10 & 32) == 0) {
            this.f56507f = SetsKt.emptySet();
        } else {
            this.f56507f = set;
        }
        if ((i10 & 64) == 0) {
            this.f56508g = SetsKt.emptySet();
        } else {
            this.f56508g = set2;
        }
        if ((i10 & 128) == 0) {
            this.f56509h = true;
        } else {
            this.f56509h = z10;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f56510i = SetsKt.emptySet();
        } else {
            this.f56510i = set3;
        }
        if ((i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.f56511j = SetsKt.emptySet();
        } else {
            this.f56511j = set4;
        }
        if ((i10 & 1024) == 0) {
            this.f56512k = false;
        } else {
            this.f56512k = z11;
        }
        if ((i10 & 2048) == 0) {
            this.f56513l = false;
        } else {
            this.f56513l = z12;
        }
        if ((i10 & 4096) == 0) {
            this.f56514m = false;
        } else {
            this.f56514m = z13;
        }
        if ((i10 & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
            this.f56515n = 0;
        } else {
            this.f56515n = i13;
        }
        this.f56516o = (i10 & 16384) == 0 ? CollectionsKt.emptyList() : list;
        this.f56517p = list2;
        if ((65536 & i10) == 0) {
            this.f56518q = false;
        } else {
            this.f56518q = z14;
        }
        if ((i10 & 131072) == 0) {
            this.f56519r = false;
        } else {
            this.f56519r = z15;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18164v m20523a(C18164v c18164v, C3561B c3561b, int i10, int i11, float f10, float f11, Set set, Set set2, boolean z10, Set set3, Set set4, boolean z11, boolean z12, boolean z13, int i12) {
        C3561B c3561b2 = (i12 & 1) != 0 ? c18164v.f56502a : c3561b;
        int i13 = (i12 & 2) != 0 ? c18164v.f56503b : i10;
        int i14 = (i12 & 4) != 0 ? c18164v.f56504c : i11;
        float f12 = (i12 & 8) != 0 ? c18164v.f56505d : f10;
        float f13 = (i12 & 16) != 0 ? c18164v.f56506e : f11;
        Set set5 = (i12 & 32) != 0 ? c18164v.f56507f : set;
        Set set6 = (i12 & 64) != 0 ? c18164v.f56508g : set2;
        boolean z14 = (i12 & 128) != 0 ? c18164v.f56509h : z10;
        Set set7 = (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c18164v.f56510i : set3;
        Set set8 = (i12 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? c18164v.f56511j : set4;
        boolean z15 = (i12 & 1024) != 0 ? c18164v.f56512k : z11;
        boolean z16 = c18164v.f56513l;
        boolean z17 = c18164v.f56514m;
        int i15 = c18164v.f56515n;
        List<Pair<String, String>> list = c18164v.f56516o;
        List<String> list2 = c18164v.f56517p;
        boolean z18 = (i12 & Parser.ARGC_LIMIT) != 0 ? c18164v.f56518q : z12;
        boolean z19 = (i12 & 131072) != 0 ? c18164v.f56519r : z13;
        c18164v.getClass();
        return new C18164v(c3561b2, i13, i14, f12, f13, set5, set6, z14, set7, set8, z15, z16, z17, i15, list, list2, z18, z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18164v)) {
            return false;
        }
        C18164v c18164v = (C18164v) obj;
        return Intrinsics.areEqual(this.f56502a, c18164v.f56502a) && this.f56503b == c18164v.f56503b && this.f56504c == c18164v.f56504c && Float.compare(this.f56505d, c18164v.f56505d) == 0 && Float.compare(this.f56506e, c18164v.f56506e) == 0 && Intrinsics.areEqual(this.f56507f, c18164v.f56507f) && Intrinsics.areEqual(this.f56508g, c18164v.f56508g) && this.f56509h == c18164v.f56509h && Intrinsics.areEqual(this.f56510i, c18164v.f56510i) && Intrinsics.areEqual(this.f56511j, c18164v.f56511j) && this.f56512k == c18164v.f56512k && this.f56513l == c18164v.f56513l && this.f56514m == c18164v.f56514m && this.f56515n == c18164v.f56515n && Intrinsics.areEqual(this.f56516o, c18164v.f56516o) && Intrinsics.areEqual(this.f56517p, c18164v.f56517p) && this.f56518q == c18164v.f56518q && this.f56519r == c18164v.f56519r;
    }

    public final int hashCode() {
        return ((C2438k.m3149b(C2438k.m3149b((((((((((this.f56511j.hashCode() + ((this.f56510i.hashCode() + ((((this.f56508g.hashCode() + ((this.f56507f.hashCode() + C12202I7.m14123a(this.f56506e, C12202I7.m14123a(this.f56505d, ((((this.f56502a.f11704a.hashCode() * 31) + this.f56503b) * 31) + this.f56504c) * 31, 31), 31)) * 31)) * 31) + (this.f56509h ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.f56512k ? 1231 : 1237)) * 31) + (this.f56513l ? 1231 : 1237)) * 31) + (this.f56514m ? 1231 : 1237)) * 31) + this.f56515n) * 31, this.f56516o, 31), this.f56517p, 31) + (this.f56518q ? 1231 : 1237)) * 31) + (this.f56519r ? 1231 : 1237);
    }

    public final String toString() {
        return "FilterState(sortBy=" + this.f56502a + ", yearFrom=" + this.f56503b + ", yearTo=" + this.f56504c + ", ratingFrom=" + this.f56505d + ", ratingTo=" + this.f56506e + ", genres=" + this.f56507f + ", genresExcluded=" + this.f56508g + ", genresCooperative=" + this.f56509h + ", countries=" + this.f56510i + ", countriesExcluded=" + this.f56511j + ", countriesCooperative=" + this.f56512k + ", showAdult=" + this.f56513l + ", showFavorites=" + this.f56514m + ", index=" + this.f56515n + ", languagesAndSubtitles=" + this.f56516o + ", movieSourceTypes=" + this.f56517p + ", advancedFilters=" + this.f56518q + ", hideWatched=" + this.f56519r + ")";
    }

    public C18164v(C3561B c3561b, int i10, int i11, float f10, float f11, Set<String> set, Set<String> set2, boolean z10, Set<String> set3, Set<String> set4, boolean z11, boolean z12, boolean z13, int i12, List<Pair<String, String>> list, List<String> list2, boolean z14, boolean z15) {
        this.f56502a = c3561b;
        this.f56503b = i10;
        this.f56504c = i11;
        this.f56505d = f10;
        this.f56506e = f11;
        this.f56507f = set;
        this.f56508g = set2;
        this.f56509h = z10;
        this.f56510i = set3;
        this.f56511j = set4;
        this.f56512k = z11;
        this.f56513l = z12;
        this.f56514m = z13;
        this.f56515n = i12;
        this.f56516o = list;
        this.f56517p = list2;
        this.f56518q = z14;
        this.f56519r = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18164v(C3561B c3561b, boolean z10, boolean z11, List list, boolean z12, int i10) {
        C3561B c3561b2;
        if ((i10 & 1) != 0) {
            C3561B.Companion.getClass();
            c3561b2 = C3561B.f11703b;
        } else {
            c3561b2 = c3561b;
        }
        int i11 = C18155m.f56489f;
        this(c3561b2, 1900, C18155m.f56490g, 0.0f, 10.0f, SetsKt.emptySet(), SetsKt.emptySet(), (i10 & 128) != 0 ? true : z10, SetsKt.emptySet(), SetsKt.emptySet(), (i10 & 1024) != 0 ? false : z11, false, false, 0, CollectionsKt.emptyList(), list, (i10 & Parser.ARGC_LIMIT) != 0 ? false : z12, false);
    }
}
