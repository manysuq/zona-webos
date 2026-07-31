package com.google.ads.interactivemedia.p508v3.impl;

import com.google.ads.interactivemedia.p508v3.api.AdEvent;
import com.google.ads.interactivemedia.p508v3.impl.data.zzbu;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzai implements zzbh {
    final /* synthetic */ zzak zza;

    public zzai(zzak zzakVar) {
        this.zza = zzakVar;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.zzbh
    public final void zza(JavaScriptMessage javaScriptMessage) {
        JavaScriptMessage.MsgType msgTypeZzb = javaScriptMessage.zzb();
        zzbu zzbuVar = (zzbu) javaScriptMessage.zzc();
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        JavaScriptMessage.MsgType msgType = JavaScriptMessage.MsgType.activate;
        int iOrdinal = msgTypeZzb.ordinal();
        if (iOrdinal == 28) {
            this.zza.zzi.zza(zzbuVar);
        } else if (iOrdinal == 62) {
            this.zza.zzh.zzf(zzbuVar.resizeAndPositionVideo);
        } else {
            if (iOrdinal != 63) {
                return;
            }
            this.zza.zzh.zzg();
        }
    }
}
