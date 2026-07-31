package p179Jg;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import p125Gg.C1911s;
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
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Jg.o */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C2636o {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a */
    public final C1911s f8847a;

    /* JADX INFO: renamed from: b */
    public final C2627f f8848b;

    /* JADX INFO: renamed from: Jg.o$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C2636o> {

        /* JADX INFO: renamed from: a */
        public static final a f8849a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f8849a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.GetPageParams", aVar, 2);
            c20807b0.m25417j("page", false);
            c20807b0.m25417j("filter", false);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            return new InterfaceC18718c[]{C1911s.a.f6461a, C2627f.a.f8830a};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            C1911s c1911s = null;
            C2627f c2627f = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else if (iMo624x == 0) {
                    c1911s = (C1911s) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C1911s.a.f6461a, c1911s);
                    i10 |= 1;
                } else {
                    if (iMo624x != 1) {
                        throw new C18739x(iMo624x);
                    }
                    c2627f = (C2627f) interfaceC19796bMo641b.mo667l(interfaceC19639f, 1, C2627f.a.f8830a, c2627f);
                    i10 |= 2;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C2636o(i10, c1911s, c2627f);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C2636o c2636o = (C2636o) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            b bVar = C2636o.Companion;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C1911s.a.f6461a, c2636o.f8847a);
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, C2627f.a.f8830a, c2636o.f8848b);
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Jg.o$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C2636o> serializer() {
            return a.f8849a;
        }
    }

    public /* synthetic */ C2636o(int i10, C1911s c1911s, C2627f c2627f) {
        if (3 != (i10 & 3)) {
            C20915z0.m25449a(i10, 3, a.f8849a.getDescriptor());
            throw null;
        }
        this.f8847a = c1911s;
        this.f8848b = c2627f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2636o)) {
            return false;
        }
        C2636o c2636o = (C2636o) obj;
        return Intrinsics.areEqual(this.f8847a, c2636o.f8847a) && Intrinsics.areEqual(this.f8848b, c2636o.f8848b);
    }

    public final int hashCode() {
        return this.f8848b.hashCode() + (this.f8847a.hashCode() * 31);
    }

    public final String toString() {
        return "GetPageParams(page=" + this.f8847a + ", filter=" + this.f8848b + ")";
    }

    public C2636o(C1911s c1911s, C2627f c2627f) {
        this.f8847a = c1911s;
        this.f8848b = c2627f;
    }
}
