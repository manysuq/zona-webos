package com.google.ads.interactivemedia.p508v3.api.player;

import com.google.ads.interactivemedia.p508v3.api.AdPodInfo;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface VideoAdPlayer extends AdProgressProvider, VolumeProvider {

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface VideoAdPlayerCallback {
        void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate);

        void onBuffering(AdMediaInfo adMediaInfo);

        void onContentComplete();

        void onEnded(AdMediaInfo adMediaInfo);

        void onError(AdMediaInfo adMediaInfo);

        void onLoaded(AdMediaInfo adMediaInfo);

        void onPause(AdMediaInfo adMediaInfo);

        void onPlay(AdMediaInfo adMediaInfo);

        void onResume(AdMediaInfo adMediaInfo);

        void onVolumeChanged(AdMediaInfo adMediaInfo, int i10);
    }

    void addCallback(VideoAdPlayerCallback videoAdPlayerCallback);

    void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo);

    void pauseAd(AdMediaInfo adMediaInfo);

    void playAd(AdMediaInfo adMediaInfo);

    void release();

    void removeCallback(VideoAdPlayerCallback videoAdPlayerCallback);

    void stopAd(AdMediaInfo adMediaInfo);
}
