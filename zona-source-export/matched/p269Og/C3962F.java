package p269Og;

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
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Og.F */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C3962F {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: d */
    public static final C3962F f13019d = new C3962F(0);

    /* JADX INFO: renamed from: a */
    public final C3960D f13020a;

    /* JADX INFO: renamed from: b */
    public final C3960D f13021b;

    /* JADX INFO: renamed from: c */
    public final C3960D f13022c;

    /* JADX INFO: renamed from: Og.F$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C3962F> {

        /* JADX INFO: renamed from: a */
        public static final a f13023a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f13023a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.models.Ratings", aVar, 3);
            c20807b0.m25417j("zona", true);
            c20807b0.m25417j("imdb", true);
            c20807b0.m25417j("kinopoisk", true);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            C3960D.a aVar = C3960D.a.f13018a;
            return new InterfaceC18718c[]{aVar, aVar, aVar};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            C3960D c3960d = null;
            C3960D c3960d2 = null;
            C3960D c3960d3 = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else if (iMo624x == 0) {
                    c3960d = (C3960D) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C3960D.a.f13018a, c3960d);
                    i10 |= 1;
                } else if (iMo624x == 1) {
                    c3960d2 = (C3960D) interfaceC19796bMo641b.mo667l(interfaceC19639f, 1, C3960D.a.f13018a, c3960d2);
                    i10 |= 2;
                } else {
                    if (iMo624x != 2) {
                        throw new C18739x(iMo624x);
                    }
                    c3960d3 = (C3960D) interfaceC19796bMo641b.mo667l(interfaceC19639f, 2, C3960D.a.f13018a, c3960d3);
                    i10 |= 4;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C3962F(i10, c3960d, c3960d2, c3960d3);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x003e  */
        /* JADX WARN: Code duplicated, block: B:19:0x005c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C3962F c3962f = (C3962F) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            b bVar = C3962F.Companion;
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3960D.a.f13018a, c3962f.f13020a);
            } else {
                C3960D c3960d = c3962f.f13020a;
                C3960D.Companion.getClass();
                if (!Intrinsics.areEqual(c3960d, C3960D.f13015c)) {
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3960D.a.f13018a, c3962f.f13020a);
                }
            }
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, C3960D.a.f13018a, c3962f.f13021b);
            } else {
                C3960D c3960d2 = c3962f.f13021b;
                C3960D.Companion.getClass();
                if (!Intrinsics.areEqual(c3960d2, C3960D.f13015c)) {
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, C3960D.a.f13018a, c3962f.f13021b);
                }
            }
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 2, C3960D.a.f13018a, c3962f.f13022c);
            } else {
                C3960D c3960d3 = c3962f.f13022c;
                C3960D.Companion.getClass();
                if (!Intrinsics.areEqual(c3960d3, C3960D.f13015c)) {
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 2, C3960D.a.f13018a, c3962f.f13022c);
                }
            }
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Og.F$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C3962F> serializer() {
            return a.f13023a;
        }
    }

    public C3962F() {
        this(0);
    }

    public C3962F(int i10, C3960D c3960d, C3960D c3960d2, C3960D c3960d3) {
        if ((i10 & 1) == 0) {
            C3960D.Companion.getClass();
            c3960d = C3960D.f13015c;
        }
        this.f13020a = c3960d;
        if ((i10 & 2) == 0) {
            C3960D.Companion.getClass();
            this.f13021b = C3960D.f13015c;
        } else {
            this.f13021b = c3960d2;
        }
        if ((i10 & 4) != 0) {
            this.f13022c = c3960d3;
        } else {
            C3960D.Companion.getClass();
            this.f13022c = C3960D.f13015c;
        }
    }

    public C3962F(int i10) {
        C3960D.b bVar = C3960D.Companion;
        bVar.getClass();
        C3960D c3960d = C3960D.f13015c;
        bVar.getClass();
        bVar.getClass();
        this.f13020a = c3960d;
        this.f13021b = c3960d;
        this.f13022c = c3960d;
    }
}
