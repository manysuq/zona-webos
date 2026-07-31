package com.google.ads.interactivemedia.p508v3.api;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface StreamManager extends BaseManager {
    @Deprecated
    double getContentTimeForStreamTime(double d10);

    long getContentTimeMsForStreamTimeMs(long j10);

    List<CuePoint> getCuePoints();

    @Deprecated
    CuePoint getPreviousCuePointForStreamTime(double d10);

    CuePoint getPreviousCuePointForStreamTimeMs(long j10);

    String getStreamId();

    @Deprecated
    double getStreamTimeForContentTime(double d10);

    long getStreamTimeMsForContentTimeMs(long j10);

    void loadThirdPartyStream(String str, List<? extends Map<String, String>> list);

    void replaceAdTagParameters(Map<String, String> map);
}
