package p233Mg;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
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
import za.C20879i;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Mg.p */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C3578p {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a */
    public final String f11743a;

    /* JADX INFO: renamed from: b */
    public final boolean f11744b;

    /* JADX INFO: renamed from: c */
    public final boolean f11745c;

    /* JADX INFO: renamed from: d */
    public final boolean f11746d;

    /* JADX INFO: renamed from: e */
    public final boolean f11747e;

    /* JADX INFO: renamed from: f */
    public final boolean f11748f;

    /* JADX INFO: renamed from: Mg.p$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C3578p> {

        /* JADX INFO: renamed from: a */
        public static final a f11749a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f11749a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.metadata.GetMetadataParams", aVar, 6);
            c20807b0.m25417j("appType", false);
            c20807b0.m25417j("hasLeanbackFeature", false);
            c20807b0.m25417j("hasCamera", false);
            c20807b0.m25417j("hasTouchscreen", false);
            c20807b0.m25417j("isInTouchMode", false);
            c20807b0.m25417j("hasGps", false);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            C20879i c20879i = C20879i.f71698a;
            return new InterfaceC18718c[]{C20838R0.f71645a, c20879i, c20879i, c20879i, c20879i, c20879i};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            String strMo21680g = null;
            boolean z10 = true;
            int i10 = 0;
            boolean zMo21683m = false;
            boolean zMo21683m2 = false;
            boolean zMo21683m3 = false;
            boolean zMo21683m4 = false;
            boolean zMo21683m5 = false;
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
                        zMo21683m = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        zMo21683m2 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        zMo21683m3 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        zMo21683m4 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        zMo21683m5 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 5);
                        i10 |= 32;
                        break;
                    default:
                        throw new C18739x(iMo624x);
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C3578p(i10, strMo21680g, zMo21683m, zMo21683m2, zMo21683m3, zMo21683m4, zMo21683m5);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C3578p c3578p = (C3578p) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            interfaceC19797cMo681b.mo703x(interfaceC19639f, 0, c3578p.f11743a);
            interfaceC19797cMo681b.mo677B(interfaceC19639f, 1, c3578p.f11744b);
            interfaceC19797cMo681b.mo677B(interfaceC19639f, 2, c3578p.f11745c);
            interfaceC19797cMo681b.mo677B(interfaceC19639f, 3, c3578p.f11746d);
            interfaceC19797cMo681b.mo677B(interfaceC19639f, 4, c3578p.f11747e);
            interfaceC19797cMo681b.mo677B(interfaceC19639f, 5, c3578p.f11748f);
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Mg.p$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C3578p> serializer() {
            return a.f11749a;
        }
    }

    public /* synthetic */ C3578p(int i10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        if (63 != (i10 & 63)) {
            C20915z0.m25449a(i10, 63, a.f11749a.getDescriptor());
            throw null;
        }
        this.f11743a = str;
        this.f11744b = z10;
        this.f11745c = z11;
        this.f11746d = z12;
        this.f11747e = z13;
        this.f11748f = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3578p)) {
            return false;
        }
        C3578p c3578p = (C3578p) obj;
        return Intrinsics.areEqual(this.f11743a, c3578p.f11743a) && this.f11744b == c3578p.f11744b && this.f11745c == c3578p.f11745c && this.f11746d == c3578p.f11746d && this.f11747e == c3578p.f11747e && this.f11748f == c3578p.f11748f;
    }

    public final int hashCode() {
        return (((((((((this.f11743a.hashCode() * 31) + (this.f11744b ? 1231 : 1237)) * 31) + (this.f11745c ? 1231 : 1237)) * 31) + (this.f11746d ? 1231 : 1237)) * 31) + (this.f11747e ? 1231 : 1237)) * 31) + (this.f11748f ? 1231 : 1237);
    }

    public final String toString() {
        return "GetMetadataParams(appType=" + this.f11743a + ", hasLeanbackFeature=" + this.f11744b + ", hasCamera=" + this.f11745c + ", hasTouchscreen=" + this.f11746d + ", isInTouchMode=" + this.f11747e + ", hasGps=" + this.f11748f + ")";
    }

    public C3578p(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f11743a = "zona";
        this.f11744b = z10;
        this.f11745c = z11;
        this.f11746d = z12;
        this.f11747e = true;
        this.f11748f = z13;
    }
}
