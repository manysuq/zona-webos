package com.yandex.mobile.ads.video.playback;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, m18688d2 = {"Lcom/yandex/mobile/ads/video/playback/VideoAdPlaybackListener;", "", "onAdClicked", "", "videoAd", "Lcom/yandex/mobile/ads/video/playback/model/VideoAd;", "onAdCompleted", "onAdError", "onAdPaused", "onAdPrepared", "onAdResumed", "onAdSkipped", "onAdStarted", "onAdStopped", "onImpression", "onVolumeChanged", "volume", "", "mobileads_externalRelease"}, m18689k = 1, m18690mv = {1, 9, 0}, m18692xi = 48)
public interface VideoAdPlaybackListener {
    void onAdClicked(VideoAd videoAd);

    void onAdCompleted(VideoAd videoAd);

    void onAdError(VideoAd videoAd);

    void onAdPaused(VideoAd videoAd);

    void onAdPrepared(VideoAd videoAd);

    void onAdResumed(VideoAd videoAd);

    void onAdSkipped(VideoAd videoAd);

    void onAdStarted(VideoAd videoAd);

    void onAdStopped(VideoAd videoAd);

    void onImpression(VideoAd videoAd);

    void onVolumeChanged(VideoAd videoAd, float volume);
}
