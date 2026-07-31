package com.google.ads.interactivemedia.p508v3.impl;

import p470a1.C6989a;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_StreamVideoDisplay_TimedMetadataWithKeys extends zzca {
    private final String TXXX;

    public AutoValue_StreamVideoDisplay_TimedMetadataWithKeys(String str) {
        if (str == null) {
            throw new NullPointerException("Null TXXX");
        }
        this.TXXX = str;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.zzca
    public String TXXX() {
        return this.TXXX;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            return this.TXXX.equals(((zzca) obj).TXXX());
        }
        return false;
    }

    public int hashCode() {
        return this.TXXX.hashCode() ^ 1000003;
    }

    public String toString() {
        return C6989a.m7848b(this.TXXX, "}", new StringBuilder("TimedMetadataWithKeys{TXXX="));
    }
}
