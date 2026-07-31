package com.google.ads.interactivemedia.p508v3.api;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface AdsRenderingSettings {
    int getBitrateKbps();

    boolean getDisableUi();

    boolean getEnableCustomTabs();

    boolean getEnablePreloading();

    boolean getFocusSkipButtonWhenAvailable();

    List<String> getMimeTypes();

    void setBitrateKbps(int i10);

    void setDisableUi(boolean z10);

    void setEnableCustomTabs(boolean z10);

    void setEnablePreloading(boolean z10);

    void setFocusSkipButtonWhenAvailable(boolean z10);

    void setLoadVideoTimeout(int i10);

    void setMimeTypes(List<String> list);

    void setPlayAdsAfterTime(double d10);

    void setUiElements(Set<UiElement> set);
}
