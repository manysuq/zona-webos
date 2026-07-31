package p179Jg;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
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
import za.C20849X;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Jg.B */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C2606B implements InterfaceC2645x<String> {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f8749c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C2605A()), null};

    /* JADX INFO: renamed from: a */
    public final List<String> f8750a;

    /* JADX INFO: renamed from: b */
    public final int f8751b;

    /* JADX INFO: renamed from: Jg.B$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C2606B> {

        /* JADX INFO: renamed from: a */
        public static final a f8752a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f8752a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.ServerResponseIdsList", aVar, 2);
            c20807b0.m25417j("data", false);
            c20807b0.m25417j("total", true);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            return new InterfaceC18718c[]{C2606B.f8749c[0].getValue(), C20849X.f71662a};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2606B.f8749c;
            List list = null;
            boolean z10 = true;
            int i10 = 0;
            int iMo21679d = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else if (iMo624x == 0) {
                    list = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, lazyArr[0].getValue(), list);
                    i10 |= 1;
                } else {
                    if (iMo624x != 1) {
                        throw new C18739x(iMo624x);
                    }
                    iMo21679d = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 1);
                    i10 |= 2;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C2606B(i10, list, iMo21679d);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C2606B c2606b = (C2606B) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            InterfaceC18718c<Object> value = C2606B.f8749c[0].getValue();
            List<String> list = c2606b.f8750a;
            int i10 = c2606b.f8751b;
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, value, list);
            if (interfaceC19797cMo681b.mo676A() || i10 != 0) {
                interfaceC19797cMo681b.mo693n(1, i10, interfaceC19639f);
            }
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Jg.B$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C2606B> serializer() {
            return a.f8752a;
        }
    }

    public C2606B() {
        throw null;
    }

    public /* synthetic */ C2606B(int i10, List list, int i11) {
        if (1 != (i10 & 1)) {
            C20915z0.m25449a(i10, 1, a.f8752a.getDescriptor());
            throw null;
        }
        this.f8750a = list;
        if ((i10 & 2) == 0) {
            this.f8751b = 0;
        } else {
            this.f8751b = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2606B)) {
            return false;
        }
        C2606B c2606b = (C2606B) obj;
        return Intrinsics.areEqual(this.f8750a, c2606b.f8750a) && this.f8751b == c2606b.f8751b;
    }

    @Override // p179Jg.InterfaceC2645x
    public final List<String> getData() {
        return this.f8750a;
    }

    public final int hashCode() {
        return (this.f8750a.hashCode() * 31) + this.f8751b;
    }

    public final String toString() {
        return "ServerResponseIdsList(data=" + this.f8750a + ", total=" + this.f8751b + ")";
    }

    public C2606B(List list) {
        this.f8750a = list;
        this.f8751b = 0;
    }
}
