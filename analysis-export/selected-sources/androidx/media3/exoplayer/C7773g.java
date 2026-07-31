package androidx.media3.exoplayer;

import p623j$.util.Objects;

/* JADX INFO: renamed from: androidx.media3.exoplayer.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7773g {

    /* JADX INFO: renamed from: a */
    public final long f26027a;

    /* JADX INFO: renamed from: b */
    public final float f26028b;

    /* JADX INFO: renamed from: c */
    public final long f26029c;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f26030a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public float f26031b = -3.4028235E38f;

        /* JADX INFO: renamed from: c */
        public long f26032c = -9223372036854775807L;
    }

    public C7773g(a aVar) {
        this.f26027a = aVar.f26030a;
        this.f26028b = aVar.f26031b;
        this.f26029c = aVar.f26032c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7773g)) {
            return false;
        }
        C7773g c7773g = (C7773g) obj;
        return this.f26027a == c7773g.f26027a && this.f26028b == c7773g.f26028b && this.f26029c == c7773g.f26029c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26027a), Float.valueOf(this.f26028b), Long.valueOf(this.f26029c));
    }
}
