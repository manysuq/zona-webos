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
import p125Gg.C1911s;
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
import za.C20838R0;
import za.C20879i;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Jg.w */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C2644w {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: e */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f8863e = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C2643v()), null, null};

    /* JADX INFO: renamed from: a */
    public final String f8864a;

    /* JADX INFO: renamed from: b */
    public final List<String> f8865b;

    /* JADX INFO: renamed from: c */
    public final C1911s f8866c;

    /* JADX INFO: renamed from: d */
    public final boolean f8867d;

    /* JADX INFO: renamed from: Jg.w$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C2644w> {

        /* JADX INFO: renamed from: a */
        public static final a f8868a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f8868a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.SearchParams", aVar, 4);
            c20807b0.m25417j("query", false);
            c20807b0.m25417j("movieSourceTypes", true);
            c20807b0.m25417j("pageParams", true);
            c20807b0.m25417j("hideUnavailable", true);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            return new InterfaceC18718c[]{C20838R0.f71645a, C2644w.f8863e[1].getValue(), C1911s.a.f6461a, C20879i.f71698a};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2644w.f8863e;
            String strMo21680g = null;
            List list = null;
            C1911s c1911s = null;
            boolean z10 = true;
            int i10 = 0;
            boolean zMo21683m = false;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else if (iMo624x == 0) {
                    strMo21680g = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 0);
                    i10 |= 1;
                } else if (iMo624x == 1) {
                    list = (List) interfaceC19796bMo641b.mo667l(interfaceC19639f, 1, lazyArr[1].getValue(), list);
                    i10 |= 2;
                } else if (iMo624x == 2) {
                    c1911s = (C1911s) interfaceC19796bMo641b.mo667l(interfaceC19639f, 2, C1911s.a.f6461a, c1911s);
                    i10 |= 4;
                } else {
                    if (iMo624x != 3) {
                        throw new C18739x(iMo624x);
                    }
                    zMo21683m = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 3);
                    i10 |= 8;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C2644w(i10, strMo21680g, list, c1911s, zMo21683m);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0047  */
        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C2644w c2644w = (C2644w) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2644w.f8863e;
            String str = c2644w.f8864a;
            boolean z10 = c2644w.f8867d;
            C1911s c1911s = c2644w.f8866c;
            List<String> list = c2644w.f8865b;
            interfaceC19797cMo681b.mo703x(interfaceC19639f, 0, str);
            if (interfaceC19797cMo681b.mo676A() || !Intrinsics.areEqual(list, CollectionsKt.emptyList())) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, lazyArr[1].getValue(), list);
            }
            if (interfaceC19797cMo681b.mo676A()) {
                interfaceC19797cMo681b.mo690k(interfaceC19639f, 2, C1911s.a.f6461a, c1911s);
            } else {
                C1911s.Companion.getClass();
                if (!Intrinsics.areEqual(c1911s, C1911s.f6458c)) {
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 2, C1911s.a.f6461a, c1911s);
                }
            }
            if (interfaceC19797cMo681b.mo676A() || !z10) {
                interfaceC19797cMo681b.mo677B(interfaceC19639f, 3, z10);
            }
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Jg.w$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C2644w> serializer() {
            return a.f8868a;
        }
    }

    public C2644w() {
        throw null;
    }

    public C2644w(int i10, String str, List list, C1911s c1911s, boolean z10) {
        if (1 != (i10 & 1)) {
            C20915z0.m25449a(i10, 1, a.f8868a.getDescriptor());
            throw null;
        }
        this.f8864a = str;
        if ((i10 & 2) == 0) {
            this.f8865b = CollectionsKt.emptyList();
        } else {
            this.f8865b = list;
        }
        if ((i10 & 4) == 0) {
            C1911s.Companion.getClass();
            this.f8866c = C1911s.f6458c;
        } else {
            this.f8866c = c1911s;
        }
        if ((i10 & 8) == 0) {
            this.f8867d = true;
        } else {
            this.f8867d = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2644w)) {
            return false;
        }
        C2644w c2644w = (C2644w) obj;
        return Intrinsics.areEqual(this.f8864a, c2644w.f8864a) && Intrinsics.areEqual(this.f8865b, c2644w.f8865b) && Intrinsics.areEqual(this.f8866c, c2644w.f8866c) && this.f8867d == c2644w.f8867d;
    }

    public final int hashCode() {
        return ((this.f8866c.hashCode() + C2438k.m3149b(this.f8864a.hashCode() * 31, this.f8865b, 31)) * 31) + (this.f8867d ? 1231 : 1237);
    }

    public final String toString() {
        return "SearchParams(query=" + this.f8864a + ", movieSourceTypes=" + this.f8865b + ", pageParams=" + this.f8866c + ", hideUnavailable=" + this.f8867d + ")";
    }

    public C2644w(String str, List list, boolean z10) {
        C1911s.Companion.getClass();
        C1911s c1911s = C1911s.f6458c;
        this.f8864a = str;
        this.f8865b = list;
        this.f8866c = c1911s;
        this.f8867d = z10;
    }
}
