package p179Jg;

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
import za.C20838R0;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: Jg.j */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC18729n
public final class C2631j {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c */
    @JvmField
    public static final Lazy<InterfaceC18718c<Object>>[] f8836c = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C2630i())};

    /* JADX INFO: renamed from: a */
    public final String f8837a;

    /* JADX INFO: renamed from: b */
    public final EnumC2623b f8838b;

    /* JADX INFO: renamed from: Jg.j$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements InterfaceC20826L<C2631j> {

        /* JADX INFO: renamed from: a */
        public static final a f8839a;
        private static final InterfaceC19639f descriptor;

        static {
            a aVar = new a();
            f8839a = aVar;
            C20807B0 c20807b0 = new C20807B0("ru.zona.content.api.GetEntityByIdParams", aVar, 2);
            c20807b0.m25417j("id", false);
            c20807b0.m25417j("occupancy", false);
            descriptor = c20807b0;
        }

        @Override // za.InterfaceC20826L
        public final InterfaceC18718c<?>[] childSerializers() {
            return new InterfaceC18718c[]{C20838R0.f71645a, C2631j.f8836c[1].getValue()};
        }

        @Override // va.InterfaceC18717b
        public final Object deserialize(InterfaceC19798d interfaceC19798d) {
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2631j.f8836c;
            String strMo21680g = null;
            EnumC2623b enumC2623b = null;
            boolean z10 = true;
            int i10 = 0;
            while (z10) {
                int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                if (iMo624x == -1) {
                    z10 = false;
                } else if (iMo624x == 0) {
                    strMo21680g = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 0);
                    i10 |= 1;
                } else {
                    if (iMo624x != 1) {
                        throw new C18739x(iMo624x);
                    }
                    enumC2623b = (EnumC2623b) interfaceC19796bMo641b.mo667l(interfaceC19639f, 1, lazyArr[1].getValue(), enumC2623b);
                    i10 |= 2;
                }
            }
            interfaceC19796bMo641b.mo642n(interfaceC19639f);
            return new C2631j(i10, strMo21680g, enumC2623b);
        }

        @Override // va.InterfaceC18731p, va.InterfaceC18717b
        public final InterfaceC19639f getDescriptor() {
            return descriptor;
        }

        @Override // va.InterfaceC18731p
        public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
            C2631j c2631j = (C2631j) obj;
            InterfaceC19639f interfaceC19639f = descriptor;
            InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
            Lazy<InterfaceC18718c<Object>>[] lazyArr = C2631j.f8836c;
            interfaceC19797cMo681b.mo703x(interfaceC19639f, 0, c2631j.f8837a);
            interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, lazyArr[1].getValue(), c2631j.f8838b);
            interfaceC19797cMo681b.mo682c();
        }

        @Override // za.InterfaceC20826L
        public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
            return C20813E0.f71615a;
        }
    }

    /* JADX INFO: renamed from: Jg.j$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {
        public final InterfaceC18718c<C2631j> serializer() {
            return a.f8839a;
        }
    }

    public /* synthetic */ C2631j(int i10, String str, EnumC2623b enumC2623b) {
        if (3 != (i10 & 3)) {
            C20915z0.m25449a(i10, 3, a.f8839a.getDescriptor());
            throw null;
        }
        this.f8837a = str;
        this.f8838b = enumC2623b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2631j)) {
            return false;
        }
        C2631j c2631j = (C2631j) obj;
        return Intrinsics.areEqual(this.f8837a, c2631j.f8837a) && this.f8838b == c2631j.f8838b;
    }

    public final int hashCode() {
        return this.f8838b.hashCode() + (this.f8837a.hashCode() * 31);
    }

    public final String toString() {
        return "GetEntityByIdParams(id=" + this.f8837a + ", occupancy=" + this.f8838b + ")";
    }

    public C2631j(String str, EnumC2623b enumC2623b) {
        this.f8837a = str;
        this.f8838b = enumC2623b;
    }
}
