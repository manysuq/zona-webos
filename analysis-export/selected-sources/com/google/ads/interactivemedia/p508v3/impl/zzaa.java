package com.google.ads.interactivemedia.p508v3.impl;

import com.google.ads.interactivemedia.p508v3.api.AdsManager;
import com.google.ads.interactivemedia.p508v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.p508v3.api.StreamManager;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzaa implements AdsManagerLoadedEvent {
    private final AdsManager zza;
    private final StreamManager zzb;
    private final Object zzc;

    public zzaa(AdsManager adsManager, Object obj) {
        this.zza = adsManager;
        this.zzb = null;
        this.zzc = obj;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.AdsManagerLoadedEvent
    public final AdsManager getAdsManager() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.AdsManagerLoadedEvent
    public final StreamManager getStreamManager() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.AdsManagerLoadedEvent
    public final Object getUserRequestContext() {
        return this.zzc;
    }

    public zzaa(StreamManager streamManager, Object obj) {
        this.zza = null;
        this.zzb = streamManager;
        this.zzc = obj;
    }
}
