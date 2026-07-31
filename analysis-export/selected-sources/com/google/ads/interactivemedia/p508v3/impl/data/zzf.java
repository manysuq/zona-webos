package com.google.ads.interactivemedia.p508v3.impl.data;

import com.google.ads.interactivemedia.p508v3.api.UiElement;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzf {
    public abstract zzg build();

    public abstract zzf setBitrate(int i10);

    public abstract zzf setDisableUi(boolean z10);

    public abstract zzf setEnableFocusSkipButton(boolean z10);

    public abstract zzf setEnablePreloading(boolean z10);

    public abstract zzf setLoadVideoTimeout(int i10);

    public abstract zzf setMimeTypes(@Nullable List<String> list);

    public abstract zzf setPlayAdsAfterTime(double d10);

    public abstract zzf setUiElements(@Nullable Set<UiElement> set);
}
