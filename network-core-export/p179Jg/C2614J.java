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
import p192Kb.C2951e0;
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

/* JADX INFO: renamed from: Jg.J */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C2614J implements InterfaceC2645x<C2951e0> {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f8765b = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C2613I())};

    /* JADX INFO: renamed from: a */
    public final List<C2951e0> f8766a;

    /* JADX INFO: renamed from: Jg.J$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C2614J> {

        /* JADX INFO: renamed from: a */
        public static final a f8767a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f8767a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.ServerResponseVideoSources", aVar, 1);
            c20807b0.m25417j("data", false);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            return new InterfaceC18718c[]{C2614J.f8765b[0].getValue()};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2614J.f8765b;
            List list = null;
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
                    list = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, lazyArr[0].getValue(), list);
                    i10 = 1;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C2614J(i10, list);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C2614J.f8765b[0].getValue(), ((C2614J) obj).f8766a);
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Jg.J$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C2614J> serializer() {
            return a.f8767a;
        }
    }

    static {
        CollectionsKt.emptyList();
    }

    public C2614J() {
        throw null;
    }

    public /* synthetic */ C2614J(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f8766a = list;
        } else {
            C20915z0.m25449a(i10, 1, a.f8767a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2614J) && Intrinsics.areEqual(this.f8766a, ((C2614J) obj).f8766a);
    }

    @Override // p179Jg.InterfaceC2645x
    public final List<C2951e0> getData() {
        return this.f8766a;
    }

    public final int hashCode() {
        return this.f8766a.hashCode();
    }

    public final String toString() {
        return "ServerResponseVideoSources(data=" + this.f8766a + ")";
    }
}
