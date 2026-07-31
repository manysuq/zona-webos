package com.google.ads.interactivemedia.p508v3.internal;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzadd extends IOException {
    public zzadd() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzadd(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzadd(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
