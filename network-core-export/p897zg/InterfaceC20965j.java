package p897zg;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import p125Gg.EnumC1908p;
import p125Gg.InterfaceC1906n;

/* JADX INFO: renamed from: zg.j */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC20965j extends InterfaceC1906n<a> {

    /* JADX INFO: renamed from: zg.j$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {

        /* JADX INFO: renamed from: c */
        public static final a f72022c = new a("", EnumC1908p.f6447b);

        /* JADX INFO: renamed from: a */
        public final String f72023a;

        /* JADX INFO: renamed from: b */
        public final EnumC1908p f72024b;

        public a(String str, EnumC1908p enumC1908p) {
            this.f72023a = str;
            this.f72024b = enumC1908p;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f72023a, aVar.f72023a) && this.f72024b == aVar.f72024b;
        }

        public final int hashCode() {
            return this.f72024b.hashCode() + (this.f72023a.hashCode() * 31);
        }

        public final String toString() {
            return "State(host=" + this.f72023a + ", loadingState=" + this.f72024b + ")";
        }
    }

    /* JADX INFO: renamed from: b */
    Object mo25478b(ContinuationImpl continuationImpl);
}
