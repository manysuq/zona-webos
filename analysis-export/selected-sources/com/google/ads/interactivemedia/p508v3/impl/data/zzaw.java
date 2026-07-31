package com.google.ads.interactivemedia.p508v3.impl.data;

import p622j.C15284l;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzaw extends zzcn {
    private final Integer downloadBandwidthKbps;
    private final boolean rendersUiNatively;

    public zzaw(Integer num, boolean z10) {
        this.downloadBandwidthKbps = num;
        this.rendersUiNatively = z10;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzcn
    public Integer downloadBandwidthKbps() {
        return this.downloadBandwidthKbps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcn) {
            zzcn zzcnVar = (zzcn) obj;
            Integer num = this.downloadBandwidthKbps;
            if (num != null ? num.equals(zzcnVar.downloadBandwidthKbps()) : zzcnVar.downloadBandwidthKbps() == null) {
                if (this.rendersUiNatively == zzcnVar.rendersUiNatively()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.downloadBandwidthKbps;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ (true != this.rendersUiNatively ? 1237 : 1231);
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzcn
    public boolean rendersUiNatively() {
        return this.rendersUiNatively;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEnvironmentData{downloadBandwidthKbps=");
        sb2.append(this.downloadBandwidthKbps);
        sb2.append(", rendersUiNatively=");
        return C15284l.m17964a(sb2, this.rendersUiNatively, "}");
    }
}
