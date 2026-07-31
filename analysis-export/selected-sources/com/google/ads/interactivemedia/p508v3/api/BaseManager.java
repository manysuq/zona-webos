package com.google.ads.interactivemedia.p508v3.api;

import com.google.ads.interactivemedia.p508v3.api.player.AdProgressProvider;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface BaseManager extends AdProgressProvider {
    void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener);

    void addAdEventListener(AdEvent.AdEventListener adEventListener);

    void destroy();

    void focus();

    AdProgressInfo getAdProgressInfo();

    InterfaceC8501Ad getCurrentAd();

    void init();

    void init(AdsRenderingSettings adsRenderingSettings);

    @Deprecated
    boolean isCustomPlaybackUsed();

    void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener);

    void removeAdEventListener(AdEvent.AdEventListener adEventListener);
}
