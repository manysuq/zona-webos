package vg;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
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
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: vg.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C18786i {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a */
    public final C18787j f58528a;

    /* JADX INFO: renamed from: vg.i$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C18786i> {

        /* JADX INFO: renamed from: a */
        public static final a f58529a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f58529a = aVar;
            C20807B0 c20807b0 = new C20807B0("Rating", aVar, 1);
            c20807b0.m25417j("kinopoisk", false);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            return new InterfaceC18718c[]{C18973a.m21290a(C18787j.a.f58532a)};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            C18787j c18787j = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else {
                    if (iMo624x != 0) {
                        throw new C18739x(iMo624x);
                    }
                    c18787j = (C18787j) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 0, C18787j.a.f58532a, c18787j);
                    i10 = 1;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C18786i(i10, c18787j);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            b bVar = C18786i.Companion;
            interfaceC19797cMo681b.mo702w(interfaceC19639f, 0, C18787j.a.f58532a, ((C18786i) obj).f58528a);
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: vg.i$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C18786i> serializer() {
            return a.f58529a;
        }
    }

    public /* synthetic */ C18786i(int i10, C18787j c18787j) {
        if (1 == (i10 & 1)) {
            this.f58528a = c18787j;
        } else {
            C20915z0.m25449a(i10, 1, a.f58529a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18786i) && Intrinsics.areEqual(this.f58528a, ((C18786i) obj).f58528a);
    }

    public final int hashCode() {
        C18787j c18787j = this.f58528a;
        if (c18787j == null) {
            return 0;
        }
        return c18787j.hashCode();
    }

    public final String toString() {
        return "Rating(kinopoisk=" + this.f58528a + ")";
    }
}
