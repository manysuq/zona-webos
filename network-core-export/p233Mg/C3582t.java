package p233Mg;

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
import kotlin.jvm.internal.Reflection;
import p163J0.C2438k;
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

/* JADX INFO: renamed from: Mg.t */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C3582t {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: d */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f11760d = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C3581s(0)), null};

    /* JADX INFO: renamed from: e */
    public static final C3582t f11761e;

    /* JADX INFO: renamed from: a */
    public final C3588z f11762a;

    /* JADX INFO: renamed from: b */
    public final List<C3561B> f11763b;

    /* JADX INFO: renamed from: c */
    public final C3577o f11764c;

    /* JADX INFO: renamed from: Mg.t$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C3582t> {

        /* JADX INFO: renamed from: a */
        public static final a f11765a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f11765a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.metadata.Metadata", aVar, 3);
            c20807b0.m25417j("settings", false);
            c20807b0.m25417j("sorting", false);
            c20807b0.m25417j("filters", false);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            return new InterfaceC18718c[]{C3588z.a.f11805a, C3582t.f11760d[1].getValue(), C3577o.a.f11742a};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C3582t.f11760d;
            C3588z c3588z = null;
            List list = null;
            C3577o c3577o = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else if (iMo624x == 0) {
                    c3588z = (C3588z) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C3588z.a.f11805a, c3588z);
                    i10 |= 1;
                } else if (iMo624x == 1) {
                    list = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 1, lazyArr[1].getValue(), list);
                    i10 |= 2;
                } else {
                    if (iMo624x != 2) {
                        throw new C18739x(iMo624x);
                    }
                    c3577o = (C3577o) interfaceC19796bMo641b.mo667l(interfaceC19639f, 2, C3577o.a.f11742a, c3577o);
                    i10 |= 4;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C3582t(i10, c3588z, list, c3577o);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C3582t c3582t = (C3582t) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C3582t.f11760d;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3588z.a.f11805a, c3582t.f11762a);
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, lazyArr[1].getValue(), c3582t.f11763b);
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 2, C3577o.a.f11742a, c3582t.f11764c);
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Mg.t$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C3582t> serializer() {
            return a.f11765a;
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C3582t.class).getSimpleName();
        C3588z.Companion.getClass();
        f11761e = new C3582t(C3588z.f11772H, CollectionsKt.emptyList(), new C3577o(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList()));
    }

    public /* synthetic */ C3582t(int i10, C3588z c3588z, List list, C3577o c3577o) {
        if (7 != (i10 & 7)) {
            C20915z0.m25449a(i10, 7, a.f11765a.getDescriptor());
            throw null;
        }
        this.f11762a = c3588z;
        this.f11763b = list;
        this.f11764c = c3577o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3582t)) {
            return false;
        }
        C3582t c3582t = (C3582t) obj;
        return Intrinsics.areEqual(this.f11762a, c3582t.f11762a) && Intrinsics.areEqual(this.f11763b, c3582t.f11763b) && Intrinsics.areEqual(this.f11764c, c3582t.f11764c);
    }

    public final int hashCode() {
        return this.f11764c.hashCode() + C2438k.m3149b(this.f11762a.hashCode() * 31, this.f11763b, 31);
    }

    public final String toString() {
        return "Metadata(settings=" + this.f11762a + ", sorting=" + this.f11763b + ", filters=" + this.f11764c + ")";
    }

    public C3582t(C3588z c3588z, List<C3561B> list, C3577o c3577o) {
        this.f11762a = c3588z;
        this.f11763b = list;
        this.f11764c = c3577o;
    }
}
