package p179Jg;

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
import p163J0.C2438k;
import p514d0.C10219v;
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
import za.C20877h0;
import za.C20879i;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Jg.r */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C2639r {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: f */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f8853f = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C2638q()), null, null};

    /* JADX INFO: renamed from: a */
    public final long f8854a;

    /* JADX INFO: renamed from: b */
    public final String f8855b;

    /* JADX INFO: renamed from: c */
    public final List<String> f8856c;

    /* JADX INFO: renamed from: d */
    public final Boolean f8857d;

    /* JADX INFO: renamed from: e */
    public final C2621Q f8858e;

    /* JADX INFO: renamed from: Jg.r$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C2639r> {

        /* JADX INFO: renamed from: a */
        public static final a f8859a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f8859a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.GetVideoSourcesParams", aVar, 5);
            c20807b0.m25417j("kinopoiskId", false);
            c20807b0.m25417j("episodeKey", false);
            c20807b0.m25417j("movieSourceTypes", true);
            c20807b0.m25417j("trailer", true);
            c20807b0.m25417j("userInfo", true);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            return new InterfaceC18718c[]{C20877h0.f71694a, C20838R0.f71645a, C2639r.f8853f[2].getValue(), C18973a.m21290a(C20879i.f71698a), C2621Q.a.f8787a};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2639r.f8853f;
            long jMo21676C = 0;
            String strMo21680g = null;
            List list = null;
            Boolean bool = null;
            C2621Q c2621q = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else if (iMo624x == 0) {
                    jMo21676C = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 0);
                    i10 |= 1;
                } else if (iMo624x == 1) {
                    strMo21680g = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 1);
                    i10 |= 2;
                } else if (iMo624x == 2) {
                    list = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 2, lazyArr[2].getValue(), list);
                    i10 |= 4;
                } else if (iMo624x == 3) {
                    bool = (Boolean) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 3, C20879i.f71698a, bool);
                    i10 |= 8;
                } else {
                    if (iMo624x != 4) {
                        throw new C18739x(iMo624x);
                    }
                    c2621q = (C2621Q) interfaceC19796bMo641b.mo667l(interfaceC19639f, 4, C2621Q.a.f8787a, c2621q);
                    i10 |= 16;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C2639r(i10, jMo21676C, strMo21680g, list, bool, c2621q);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005c  */
        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C2639r c2639r = (C2639r) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2639r.f8853f;
            long j10 = c2639r.f8854a;
            C2621Q c2621q = c2639r.f8858e;
            Boolean bool = c2639r.f8857d;
            List<String> list = c2639r.f8856c;
            interfaceC19797cMo681b.mo699t(interfaceC19639f, 0, j10);
            interfaceC19797cMo681b.mo703x(interfaceC19639f, 1, c2639r.f8855b);
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(list, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 2, lazyArr[2].getValue(), list);
            }
            if (interfaceC19797cMo681b.mo676A() || bool != null) {
                interfaceC19797cMo681b.mo702w(interfaceC19639f, 3, C20879i.f71698a, bool);
            }
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 4, C2621Q.a.f8787a, c2621q);
            } else {
                C2621Q.Companion.getClass();
                if (!Intrinsics.areEqual(c2621q, C2621Q.f8784c)) {
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 4, C2621Q.a.f8787a, c2621q);
                }
            }
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Jg.r$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C2639r> serializer() {
            return a.f8859a;
        }
    }

    public C2639r(int i10, long j10, String str, List list, Boolean bool, C2621Q c2621q) {
        if (3 != (i10 & 3)) {
            C20915z0.m25449a(i10, 3, a.f8859a.getDescriptor());
            throw null;
        }
        this.f8854a = j10;
        this.f8855b = str;
        if ((i10 & 4) == 0) {
            this.f8856c = CollectionsKt.emptyList();
        } else {
            this.f8856c = list;
        }
        if ((i10 & 8) == 0) {
            this.f8857d = null;
        } else {
            this.f8857d = bool;
        }
        if ((i10 & 16) != 0) {
            this.f8858e = c2621q;
        } else {
            C2621Q.Companion.getClass();
            this.f8858e = C2621Q.f8784c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2639r)) {
            return false;
        }
        C2639r c2639r = (C2639r) obj;
        return this.f8854a == c2639r.f8854a && Intrinsics.areEqual(this.f8855b, c2639r.f8855b) && Intrinsics.areEqual(this.f8856c, c2639r.f8856c) && Intrinsics.areEqual(this.f8857d, c2639r.f8857d) && Intrinsics.areEqual(this.f8858e, c2639r.f8858e);
    }

    public final int hashCode() {
        long j10 = this.f8854a;
        int iM3149b = C2438k.m3149b(C10219v.m12391a(((int) (j10 ^ (j10 >>> 32))) * 31, 31, this.f8855b), this.f8856c, 31);
        Boolean bool = this.f8857d;
        return this.f8858e.hashCode() + ((iM3149b + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        return "GetVideoSourcesParams(kinopoiskId=" + this.f8854a + ", episodeKey=" + this.f8855b + ", movieSourceTypes=" + this.f8856c + ", trailer=" + this.f8857d + ", userInfo=" + this.f8858e + ")";
    }

    public C2639r(long j10, String str, List<String> list, Boolean bool, C2621Q c2621q) {
        this.f8854a = j10;
        this.f8855b = str;
        this.f8856c = list;
        this.f8857d = bool;
        this.f8858e = c2621q;
    }
}
