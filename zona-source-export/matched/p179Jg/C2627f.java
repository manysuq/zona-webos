package p179Jg;

import androidx.datastore.preferences.protobuf.C7653h;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import p163J0.C2438k;
import p183K2.C2770g;
import p514d0.C10219v;
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
import za.C20838R0;
import za.C20849X;
import za.C20879i;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Jg.f */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C2627f {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: n */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f8815n;

    /* JADX INFO: renamed from: o */
    public static final C2627f f8816o;

    /* JADX INFO: renamed from: a */
    public final String f8817a;

    /* JADX INFO: renamed from: b */
    public final int f8818b;

    /* JADX INFO: renamed from: c */
    public final int f8819c;

    /* JADX INFO: renamed from: d */
    public final float f8820d;

    /* JADX INFO: renamed from: e */
    public final float f8821e;

    /* JADX INFO: renamed from: f */
    public final String f8822f;

    /* JADX INFO: renamed from: g */
    public final String f8823g;

    /* JADX INFO: renamed from: h */
    public final boolean f8824h;

    /* JADX INFO: renamed from: i */
    public final int f8825i;

    /* JADX INFO: renamed from: j */
    public final int f8826j;

    /* JADX INFO: renamed from: k */
    public final int f8827k;

    /* JADX INFO: renamed from: l */
    public final List<Pair<String, String>> f8828l;

    /* JADX INFO: renamed from: m */
    public final List<String> f8829m;

    /* JADX INFO: renamed from: Jg.f$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C2627f> {

        /* JADX INFO: renamed from: a */
        public static final a f8830a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f8830a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.Filter", aVar, 13);
            c20807b0.m25417j("sortBy", true);
            c20807b0.m25417j("yearFrom", true);
            c20807b0.m25417j("yearTo", true);
            c20807b0.m25417j("ratingFrom", true);
            c20807b0.m25417j("ratingTo", true);
            c20807b0.m25417j("genres", true);
            c20807b0.m25417j("countries", true);
            c20807b0.m25417j("showAdult", true);
            c20807b0.m25417j("minAge", true);
            c20807b0.m25417j("maxAge", true);
            c20807b0.m25417j("index", true);
            c20807b0.m25417j("languagesAndSubtitles", true);
            c20807b0.m25417j("movieSourceTypes", true);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2627f.f8815n;
            C20838R0 c20838r0 = C20838R0.f71645a;
            C20849X c20849x = C20849X.f71662a;
            C20824K c20824k = C20824K.f71630a;
            return new InterfaceC18718c[]{c20838r0, c20849x, c20849x, c20824k, c20824k, c20838r0, c20838r0, C20879i.f71698a, c20849x, c20849x, c20849x, lazyArr[11].getValue(), lazyArr[12].getValue()};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2627f.f8815n;
            List list = null;
            List list2 = null;
            String strMo21680g = null;
            String strMo21680g2 = null;
            String strMo21680g3 = null;
            boolean z10 = true;
            int i10 = 0;
            int iMo21679d = 0;
            int iMo21679d2 = 0;
            float fMo21677D = 0.0f;
            float fMo21677D2 = 0.0f;
            boolean zMo21683m = false;
            int iMo21679d3 = 0;
            int iMo21679d4 = 0;
            int iMo21679d5 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                switch (iMo624x) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        strMo21680g = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 0);
                        i10 |= 1;
                        break;
                    case 1:
                        iMo21679d = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        iMo21679d2 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        fMo21677D = interfaceC19796bMo641b.mo21677D(interfaceC19639f, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        fMo21677D2 = interfaceC19796bMo641b.mo21677D(interfaceC19639f, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        strMo21680g2 = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 5);
                        i10 |= 32;
                        break;
                    case 6:
                        strMo21680g3 = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 6);
                        i10 |= 64;
                        break;
                    case 7:
                        zMo21683m = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 7);
                        i10 |= 128;
                        break;
                    case 8:
                        iMo21679d3 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 8);
                        i10 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        break;
                    case 9:
                        iMo21679d4 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 9);
                        i10 |= ConstantsKt.MINIMUM_BLOCK_SIZE;
                        break;
                    case 10:
                        iMo21679d5 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 10);
                        i10 |= 1024;
                        break;
                    case 11:
                        list = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 11, lazyArr[11].getValue(), list);
                        i10 |= 2048;
                        break;
                    case 12:
                        list2 = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 12, lazyArr[12].getValue(), list2);
                        i10 |= 4096;
                        break;
                    default:
                        throw new C18739x(iMo624x);
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C2627f(i10, strMo21680g, iMo21679d, iMo21679d2, fMo21677D, fMo21677D2, strMo21680g2, strMo21680g3, zMo21683m, iMo21679d3, iMo21679d4, iMo21679d5, list, list2);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C2627f c2627f = (C2627f) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2627f.f8815n;
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c2627f.f8817a, "popularity")) {
                interfaceC19797cMo681b.mo703x(interfaceC19639f, 0, c2627f.f8817a);
            }
            if (interfaceC19797cMo681b.mo676A() || c2627f.f8818b != 0) {
                interfaceC19797cMo681b.mo693n(1, c2627f.f8818b, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || c2627f.f8819c != 0) {
                interfaceC19797cMo681b.mo693n(2, c2627f.f8819c, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || Float.compare(c2627f.f8820d, 0.0f) != 0) {
                interfaceC19797cMo681b.mo692m(interfaceC19639f, 3, c2627f.f8820d);
            }
            if (interfaceC19797cMo681b.mo676A() || Float.compare(c2627f.f8821e, 0.0f) != 0) {
                interfaceC19797cMo681b.mo692m(interfaceC19639f, 4, c2627f.f8821e);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c2627f.f8822f, "")) {
                interfaceC19797cMo681b.mo703x(interfaceC19639f, 5, c2627f.f8822f);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c2627f.f8823g, "")) {
                interfaceC19797cMo681b.mo703x(interfaceC19639f, 6, c2627f.f8823g);
            }
            if (interfaceC19797cMo681b.mo676A() || c2627f.f8824h) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 7, c2627f.f8824h);
            }
            if (interfaceC19797cMo681b.mo676A() || c2627f.f8825i != 0) {
                interfaceC19797cMo681b.mo693n(8, c2627f.f8825i, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || c2627f.f8826j != 18) {
                interfaceC19797cMo681b.mo693n(9, c2627f.f8826j, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || c2627f.f8827k != 0) {
                interfaceC19797cMo681b.mo693n(10, c2627f.f8827k, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c2627f.f8828l, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 11, lazyArr[11].getValue(), c2627f.f8828l);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c2627f.f8829m, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 12, lazyArr[12].getValue(), c2627f.f8829m);
            }
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Jg.f$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C2627f> serializer() {
            return a.f8830a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f8815n = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C2625d()), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C2626e(0))};
        f8816o = new C2627f(null, 0, 0, 0.0f, 0.0f, null, null, false, 0, null, null, 8191);
    }

    public C2627f() {
        this(null, 0, 0, 0.0f, 0.0f, null, null, false, 0, null, null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2627f)) {
            return false;
        }
        C2627f c2627f = (C2627f) obj;
        return Intrinsics.areEqual(this.f8817a, c2627f.f8817a) && this.f8818b == c2627f.f8818b && this.f8819c == c2627f.f8819c && Float.compare(this.f8820d, c2627f.f8820d) == 0 && Float.compare(this.f8821e, c2627f.f8821e) == 0 && Intrinsics.areEqual(this.f8822f, c2627f.f8822f) && Intrinsics.areEqual(this.f8823g, c2627f.f8823g) && this.f8824h == c2627f.f8824h && this.f8825i == c2627f.f8825i && this.f8826j == c2627f.f8826j && this.f8827k == c2627f.f8827k && Intrinsics.areEqual(this.f8828l, c2627f.f8828l) && Intrinsics.areEqual(this.f8829m, c2627f.f8829m);
    }

    public final int hashCode() {
        return this.f8829m.hashCode() + C2438k.m3149b((((((((C10219v.m12391a(C10219v.m12391a(C12202I7.m14123a(this.f8821e, C12202I7.m14123a(this.f8820d, ((((this.f8817a.hashCode() * 31) + this.f8818b) * 31) + this.f8819c) * 31, 31), 31), 31, this.f8822f), 31, this.f8823g) + (this.f8824h ? 1231 : 1237)) * 31) + this.f8825i) * 31) + this.f8826j) * 31) + this.f8827k) * 31, this.f8828l, 31);
    }

    public final String toString() {
        StringBuilder sbM8881a = C7653h.m8881a(this.f8818b, "Filter(sortBy=", this.f8817a, ", yearFrom=", ", yearTo=");
        sbM8881a.append(this.f8819c);
        sbM8881a.append(", ratingFrom=");
        sbM8881a.append(this.f8820d);
        sbM8881a.append(", ratingTo=");
        sbM8881a.append(this.f8821e);
        sbM8881a.append(", genres=");
        sbM8881a.append(this.f8822f);
        sbM8881a.append(", countries=");
        sbM8881a.append(this.f8823g);
        sbM8881a.append(", showAdult=");
        sbM8881a.append(this.f8824h);
        sbM8881a.append(", minAge=");
        C2770g.m3491a(sbM8881a, this.f8825i, ", maxAge=", this.f8826j, ", index=");
        sbM8881a.append(this.f8827k);
        sbM8881a.append(", languagesAndSubtitles=");
        sbM8881a.append(this.f8828l);
        sbM8881a.append(", movieSourceTypes=");
        sbM8881a.append(this.f8829m);
        sbM8881a.append(")");
        return sbM8881a.toString();
    }

    public /* synthetic */ C2627f(int i10, String str, int i11, int i12, float f10, float f11, String str2, String str3, boolean z10, int i13, int i14, int i15, List list, List list2) {
        this.f8817a = (i10 & 1) == 0 ? "popularity" : str;
        if ((i10 & 2) == 0) {
            this.f8818b = 0;
        } else {
            this.f8818b = i11;
        }
        if ((i10 & 4) == 0) {
            this.f8819c = 0;
        } else {
            this.f8819c = i12;
        }
        if ((i10 & 8) == 0) {
            this.f8820d = 0.0f;
        } else {
            this.f8820d = f10;
        }
        if ((i10 & 16) == 0) {
            this.f8821e = 0.0f;
        } else {
            this.f8821e = f11;
        }
        if ((i10 & 32) == 0) {
            this.f8822f = "";
        } else {
            this.f8822f = str2;
        }
        if ((i10 & 64) == 0) {
            this.f8823g = "";
        } else {
            this.f8823g = str3;
        }
        if ((i10 & 128) == 0) {
            this.f8824h = false;
        } else {
            this.f8824h = z10;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f8825i = 0;
        } else {
            this.f8825i = i13;
        }
        if ((i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.f8826j = 18;
        } else {
            this.f8826j = i14;
        }
        if ((i10 & 1024) == 0) {
            this.f8827k = 0;
        } else {
            this.f8827k = i15;
        }
        if ((i10 & 2048) == 0) {
            this.f8828l = CollectionsKt.emptyList();
        } else {
            this.f8828l = list;
        }
        if ((i10 & 4096) == 0) {
            this.f8829m = CollectionsKt.emptyList();
        } else {
            this.f8829m = list2;
        }
    }

    public C2627f(String str, int i10, int i11, float f10, float f11, String str2, String str3, boolean z10, int i12, List list, List list2, int i13) {
        str = (i13 & 1) != 0 ? "popularity" : str;
        i10 = (i13 & 2) != 0 ? 0 : i10;
        i11 = (i13 & 4) != 0 ? 0 : i11;
        f10 = (i13 & 8) != 0 ? 0.0f : f10;
        f11 = (i13 & 16) != 0 ? 0.0f : f11;
        str2 = (i13 & 32) != 0 ? "" : str2;
        str3 = (i13 & 64) != 0 ? "" : str3;
        z10 = (i13 & 128) != 0 ? false : z10;
        i12 = (i13 & 1024) != 0 ? 0 : i12;
        list = (i13 & 2048) != 0 ? CollectionsKt.emptyList() : list;
        list2 = (i13 & 4096) != 0 ? CollectionsKt.emptyList() : list2;
        this.f8817a = str;
        this.f8818b = i10;
        this.f8819c = i11;
        this.f8820d = f10;
        this.f8821e = f11;
        this.f8822f = str2;
        this.f8823g = str3;
        this.f8824h = z10;
        this.f8825i = 0;
        this.f8826j = 18;
        this.f8827k = i12;
        this.f8828l = list;
        this.f8829m = list2;
    }
}
