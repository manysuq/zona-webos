package p689mb;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p514d0.C10219v;

/* JADX INFO: renamed from: mb.K */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C16961K {

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC16951A> f53205a;

    /* JADX INFO: renamed from: b */
    public final String f53206b;

    /* JADX INFO: renamed from: c */
    public final long f53207c;

    /* JADX INFO: renamed from: d */
    public final long f53208d;

    /* JADX WARN: Multi-variable type inference failed */
    public C16961K(Set<? extends InterfaceC16951A> set, String str, long j10, long j11) {
        this.f53205a = set;
        this.f53206b = str;
        this.f53207c = j10;
        this.f53208d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16961K)) {
            return false;
        }
        C16961K c16961k = (C16961K) obj;
        return Intrinsics.areEqual(this.f53205a, c16961k.f53205a) && Intrinsics.areEqual(this.f53206b, c16961k.f53206b) && this.f53207c == c16961k.f53207c && this.f53208d == c16961k.f53208d;
    }

    public final int hashCode() {
        int iM12391a = C10219v.m12391a(this.f53205a.hashCode() * 31, 31, this.f53206b);
        long j10 = this.f53207c;
        long j11 = this.f53208d;
        return ((iM12391a + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "ResourceItem(qualifiers=" + this.f53205a + ", path=" + this.f53206b + ", offset=" + this.f53207c + ", size=" + this.f53208d + ")";
    }
}
