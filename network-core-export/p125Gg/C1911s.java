package p125Gg;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import p607i9.C12122Dc;
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
import za.C20849X;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Gg.s */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C1911s {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c */
    public static final C1911s f6458c = new C1911s(200, 0);

    /* JADX INFO: renamed from: a */
    public final int f6459a;

    /* JADX INFO: renamed from: b */
    public final int f6460b;

    /* JADX INFO: renamed from: Gg.s$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C1911s> {

        /* JADX INFO: renamed from: a */
        public static final a f6461a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f6461a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.commons.base.type.PageParams", aVar, 2);
            c20807b0.m25417j("limit", false);
            c20807b0.m25417j("offset", false);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            C20849X c20849x = C20849X.f71662a;
            return new InterfaceC18718c[]{c20849x, c20849x};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            boolean z10 = true;
            int i10 = 0;
            int iMo21679d = 0;
            int iMo21679d2 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else if (iMo624x == 0) {
                    iMo21679d = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 0);
                    i10 |= 1;
                } else {
                    if (iMo624x != 1) {
                        throw new C18739x(iMo624x);
                    }
                    iMo21679d2 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 1);
                    i10 |= 2;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C1911s(i10, iMo21679d, iMo21679d2);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C1911s c1911s = (C1911s) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            interfaceC19797cMo681b.mo693n(0, c1911s.f6459a, interfaceC19639f);
            interfaceC19797cMo681b.mo693n(1, c1911s.f6460b, interfaceC19639f);
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Gg.s$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C1911s> serializer() {
            return a.f6461a;
        }
    }

    public C1911s(int i10, int i11) {
        this.f6459a = i10;
        this.f6460b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1911s)) {
            return false;
        }
        C1911s c1911s = (C1911s) obj;
        return this.f6459a == c1911s.f6459a && this.f6460b == c1911s.f6460b;
    }

    public final int hashCode() {
        return (this.f6459a * 31) + this.f6460b;
    }

    public final String toString() {
        return C12122Dc.m14056a(this.f6459a, this.f6460b, "PageParams(limit=", ", offset=", ")");
    }

    public /* synthetic */ C1911s(int i10, int i11, int i12) {
        if (3 != (i10 & 3)) {
            C20915z0.m25449a(i10, 3, a.f6461a.getDescriptor());
            throw null;
        }
        this.f6459a = i11;
        this.f6460b = i12;
    }
}
