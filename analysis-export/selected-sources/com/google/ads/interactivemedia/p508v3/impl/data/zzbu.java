package com.google.ads.interactivemedia.p508v3.impl.data;

import com.google.ads.interactivemedia.p508v3.internal.zzaho;
import com.google.ads.interactivemedia.p508v3.internal.zzahr;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzbu {
    public double adBreakDuration;
    public String adBreakTime;
    public List<Float> adCuePoints;
    public zzc adData;
    public double adPeriodDuration;
    public zzd adPodInfo;
    public int adPosition;
    public long adTimeUpdateMs;
    public List<Long> adsDurationsMs;
    public long appSetIdTimeoutMs;
    public double bufferedTime;
    public Map<String, zzbe> companions;
    public zzbs consentSettingsConfig;
    public List<zzbf> cuepoints;
    public double currentTime;
    public boolean disableAppSetId;
    public boolean disableJsIdLessEvaluation;
    public double duration;
    public boolean enableGks;
    public boolean enableInstrumentation;
    public int errorCode;
    public String errorMessage;
    public Integer espAdapterTimeoutMs;
    public List<String> espAdapters;
    public String eventId;
    public List<String> gksDaiNativeXhrApps;
    public List<String> gksFirstPartyAdServers;
    public int gksTimeoutMs;
    public List<zzbk> iconClickFallbackImages;
    public zzbm iconsView;
    public String innerError;
    public SortedSet<Float> internalCuePoints;
    public Set<String> jsConsentCheckRequiredParameters;

    /* JADX INFO: renamed from: ln */
    public String f29117ln;
    public zzbt logData;

    /* JADX INFO: renamed from: m */
    public String f29118m;
    public boolean monitorAppLifecycle;
    public Integer msParameterTimeoutMs;

    /* JADX INFO: renamed from: n */
    public String f29119n;
    public zzby networkRequest;
    public Integer platformSignalCollectorTimeoutMs;
    public String queryId;
    public zzce resizeAndPositionVideo;
    public double seekTime;
    public zzci skipView;
    public String streamId;
    public String streamUrl;
    public List<HashMap<String, String>> subtitles;
    public int totalAds;
    public String url;
    public String vastEvent;
    public String videoUrl;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaho.zzf(this, obj, false, null, false, new String[0]);
    }

    public int hashCode() {
        return zzahr.zza(this, new String[0]);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JavaScriptMsgData[");
        for (Field field : zzbu.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb2.append(field.getName());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(obj);
                sb2.append(StringUtils.COMMA);
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
