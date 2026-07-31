package com.google.ads.interactivemedia.p508v3.impl;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.p508v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p508v3.api.player.VideoStreamPlayer;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzbx extends zzaf implements StreamDisplayContainer {
    private VideoStreamPlayer zza;

    public zzbx(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        super(viewGroup);
        this.zza = videoStreamPlayer;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.StreamDisplayContainer
    public final VideoStreamPlayer getVideoStreamPlayer() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.StreamDisplayContainer
    public final void setVideoStreamPlayer(VideoStreamPlayer videoStreamPlayer) {
        videoStreamPlayer.getClass();
        this.zza = videoStreamPlayer;
    }
}
