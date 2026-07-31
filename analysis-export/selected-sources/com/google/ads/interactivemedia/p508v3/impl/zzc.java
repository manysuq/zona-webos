package com.google.ads.interactivemedia.p508v3.impl;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.p508v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p508v3.api.player.VideoAdPlayer;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class zzc extends zzaf implements AdDisplayContainer {
    private VideoAdPlayer zza;

    public zzc(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        super(viewGroup);
        this.zza = videoAdPlayer;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.AdDisplayContainer
    public final VideoAdPlayer getPlayer() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.p508v3.api.AdDisplayContainer
    public final void setPlayer(VideoAdPlayer videoAdPlayer) {
        videoAdPlayer.getClass();
        this.zza = videoAdPlayer;
    }
}
