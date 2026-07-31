package com.google.ads.interactivemedia.p508v3.impl;

import com.google.ads.interactivemedia.p508v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.p508v3.api.player.VideoProgressUpdate;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzar extends zzbw {
    protected final ContentProgressProvider zza;

    public zzar(ContentProgressProvider contentProgressProvider, long j10) {
        super(200L);
        this.zza = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.zzbw
    public final VideoProgressUpdate zza() {
        VideoProgressUpdate contentProgress = this.zza.getContentProgress();
        return contentProgress == null ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : contentProgress;
    }
}
