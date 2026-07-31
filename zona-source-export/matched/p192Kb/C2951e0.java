package p192Kb;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import p488b4.C8034N;
import p514d0.C10219v;
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
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Kb.e0 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C2951e0 {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: h */
    public static final C2951e0 f9783h;

    /* JADX INFO: renamed from: a */
    public final long f9784a;

    /* JADX INFO: renamed from: b */
    public final int f9785b;

    /* JADX INFO: renamed from: c */
    public final int f9786c;

    /* JADX INFO: renamed from: d */
    public final long f9787d;

    /* JADX INFO: renamed from: e */
    public final String f9788e;

    /* JADX INFO: renamed from: f */
    public final String f9789f;

    /* JADX INFO: renamed from: g */
    public final String f9790g;

    /* JADX INFO: renamed from: Kb.e0$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C2951e0> {

        /* JADX INFO: renamed from: a */
        public static final a f9791a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f9791a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.api.stream.VideoSource", aVar, 7);
            c20807b0.m25417j("id", true);
            c20807b0.m25417j("video_source_type_id", true);
            c20807b0.m25417j("video_content_type_id", true);
            c20807b0.m25417j("kinopoisk_id", true);
            c20807b0.m25417j("download_link_key", true);
            c20807b0.m25417j("episode_key", true);
            c20807b0.m25417j("info", true);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            C20877h0 c20877h0 = C20877h0.f71694a;
            C20849X c20849x = C20849X.f71662a;
            C20838R0 c20838r0 = C20838R0.f71645a;
            return new InterfaceC18718c[]{c20877h0, c20849x, c20849x, c20877h0, c20838r0, c20838r0, c20838r0};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            long jMo21676C = 0;
            long jMo21676C2 = 0;
            String strMo21680g = null;
            String strMo21680g2 = null;
            String strMo21680g3 = null;
            boolean z10 = true;
            int i10 = 0;
            int iMo21679d = 0;
            int iMo21679d2 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                switch (iMo624x) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        jMo21676C = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 0);
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
                        jMo21676C2 = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        strMo21680g = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 4);
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
                    default:
                        throw new C18739x(iMo624x);
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C2951e0(i10, jMo21676C, iMo21679d, iMo21679d2, jMo21676C2, strMo21680g, strMo21680g2, strMo21680g3);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C2951e0 c2951e0 = (C2951e0) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            b bVar = C2951e0.Companion;
            if (interfaceC19797cMo681b.mo676A() || c2951e0.f9784a != 0) {
                interfaceC19797cMo681b.mo699t(interfaceC19639f, 0, c2951e0.f9784a);
            }
            if (interfaceC19797cMo681b.mo676A() || c2951e0.f9785b != 0) {
                interfaceC19797cMo681b.mo693n(1, c2951e0.f9785b, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || c2951e0.f9786c != 0) {
                interfaceC19797cMo681b.mo693n(2, c2951e0.f9786c, interfaceC19639f);
            }
            if (interfaceC19797cMo681b.mo676A() || c2951e0.f9787d != 0) {
                interfaceC19797cMo681b.mo699t(interfaceC19639f, 3, c2951e0.f9787d);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c2951e0.f9788e, "")) {
                interfaceC19797cMo681b.mo703x(interfaceC19639f, 4, c2951e0.f9788e);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c2951e0.f9789f, "")) {
                interfaceC19797cMo681b.mo703x(interfaceC19639f, 5, c2951e0.f9789f);
            }
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(c2951e0.f9790g, "")) {
                interfaceC19797cMo681b.mo703x(interfaceC19639f, 6, c2951e0.f9790g);
            }
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Kb.e0$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C2951e0> serializer() {
            return a.f9791a;
        }
    }

    static {
        String str = null;
        f9783h = new C2951e0(0, 127, str, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2951e0() {
        String str = null;
        this(0, 127, str, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2951e0)) {
            return false;
        }
        C2951e0 c2951e0 = (C2951e0) obj;
        return this.f9784a == c2951e0.f9784a && this.f9785b == c2951e0.f9785b && this.f9786c == c2951e0.f9786c && this.f9787d == c2951e0.f9787d && Intrinsics.areEqual(this.f9788e, c2951e0.f9788e) && Intrinsics.areEqual(this.f9789f, c2951e0.f9789f) && Intrinsics.areEqual(this.f9790g, c2951e0.f9790g);
    }

    public final int hashCode() {
        long j10 = this.f9784a;
        int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f9785b) * 31) + this.f9786c) * 31;
        long j11 = this.f9787d;
        return this.f9790g.hashCode() + C10219v.m12391a(C10219v.m12391a((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31, this.f9788e), 31, this.f9789f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoSource(id=");
        sb2.append(this.f9784a);
        sb2.append(", videoSourceTypeId=");
        sb2.append(this.f9785b);
        sb2.append(", videoContentTypeId=");
        sb2.append(this.f9786c);
        sb2.append(", kinopoiskId=");
        sb2.append(this.f9787d);
        sb2.append(", downloadLinkKey=");
        sb2.append(this.f9788e);
        C8034N.m10004a(sb2, ", episodeKey=", this.f9789f, ", info=", this.f9790g);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ C2951e0(int i10, long j10, int i11, int i12, long j11, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f9784a = 0L;
        } else {
            this.f9784a = j10;
        }
        if ((i10 & 2) == 0) {
            this.f9785b = 0;
        } else {
            this.f9785b = i11;
        }
        if ((i10 & 4) == 0) {
            this.f9786c = 0;
        } else {
            this.f9786c = i12;
        }
        if ((i10 & 8) == 0) {
            this.f9787d = 0L;
        } else {
            this.f9787d = j11;
        }
        if ((i10 & 16) == 0) {
            this.f9788e = "";
        } else {
            this.f9788e = str;
        }
        if ((i10 & 32) == 0) {
            this.f9789f = "";
        } else {
            this.f9789f = str2;
        }
        if ((i10 & 64) == 0) {
            this.f9790g = "";
        } else {
            this.f9790g = str3;
        }
    }

    public C2951e0(long j10, int i10, int i11, long j11, String str, String str2, String str3) {
        this.f9784a = j10;
        this.f9785b = i10;
        this.f9786c = i11;
        this.f9787d = j11;
        this.f9788e = str;
        this.f9789f = str2;
        this.f9790g = str3;
    }

    public /* synthetic */ C2951e0(int i10, int i11, String str, String str2) {
        this(0L, (i11 & 2) != 0 ? 0 : i10, 0, 0L, (i11 & 16) != 0 ? "" : str, (i11 & 32) != 0 ? "" : str2, "");
    }
}
