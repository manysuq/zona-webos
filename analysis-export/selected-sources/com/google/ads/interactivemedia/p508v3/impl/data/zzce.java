package com.google.ads.interactivemedia.p508v3.impl.data;

import com.google.ads.interactivemedia.p508v3.internal.zzps;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
@zzps(zza = zzan.class)
public abstract class zzce {
    public static zzce create(Integer num, Integer num2, Integer num3, Integer num4) {
        return new zzan(num, num2, num3, num4);
    }

    public abstract Integer height();

    public final String toString() {
        return "ResizeAndPositionVideoMsgData [x=" + mo10391x() + ", y=" + mo10392y() + ", width=" + width() + ", height=" + height() + "]";
    }

    public abstract Integer width();

    /* JADX INFO: renamed from: x */
    public abstract Integer mo10391x();

    /* JADX INFO: renamed from: y */
    public abstract Integer mo10392y();
}
