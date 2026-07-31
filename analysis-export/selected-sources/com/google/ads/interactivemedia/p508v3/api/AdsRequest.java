package com.google.ads.interactivemedia.p508v3.api;

import com.google.ads.interactivemedia.p508v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface AdsRequest extends BaseRequest {
    String getAdTagUrl();

    String getAdsResponse();

    ContentProgressProvider getContentProgressProvider();

    @Deprecated
    String getExtraParameter(String str);

    @Deprecated
    Map<String, String> getExtraParameters();

    void setAdTagUrl(String str);

    void setAdWillAutoPlay(boolean z10);

    void setAdWillPlayMuted(boolean z10);

    void setAdsResponse(String str);

    void setContentDuration(float f10);

    void setContentKeywords(List<String> list);

    void setContentProgressProvider(ContentProgressProvider contentProgressProvider);

    void setContentTitle(String str);

    void setContinuousPlayback(boolean z10);

    @Deprecated
    void setExtraParameter(String str, String str2);

    void setLiveStreamPrefetchSeconds(float f10);

    void setVastLoadTimeout(float f10);
}
