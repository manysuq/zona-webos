package com.google.ads.interactivemedia.p508v3.impl;

import android.content.Context;
import com.google.ads.interactivemedia.p508v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p508v3.api.AdError;
import com.google.ads.interactivemedia.p508v3.api.AdsRequest;
import com.google.ads.interactivemedia.p508v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p508v3.api.StreamRequest;
import com.google.ads.interactivemedia.p508v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.p508v3.impl.data.zzbu;
import com.google.ads.interactivemedia.p508v3.internal.zzahg;
import com.google.ads.interactivemedia.p508v3.internal.zzahh;
import com.google.ads.interactivemedia.p508v3.internal.zzahj;
import com.google.ads.interactivemedia.p508v3.internal.zzfk;
import com.google.ads.interactivemedia.p508v3.internal.zzuv;
import java.util.List;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzv implements zzbh {
    final /* synthetic */ zzy zza;

    public zzv(zzy zzyVar) {
        this.zza = zzyVar;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.zzbh
    public final void zza(JavaScriptMessage javaScriptMessage) {
        Object userRequestContext;
        Object userRequestContext2;
        String strZzd = javaScriptMessage.zzd();
        JavaScriptMessage.MsgType msgTypeZzb = javaScriptMessage.zzb();
        zzbu zzbuVar = (zzbu) javaScriptMessage.zzc();
        JavaScriptMessage.MsgType msgType = JavaScriptMessage.MsgType.activate;
        int iOrdinal = msgTypeZzb.ordinal();
        if (iOrdinal != 11) {
            if (iOrdinal == 31) {
                AdError.AdErrorType adErrorType = AdError.AdErrorType.LOAD;
                int i10 = zzbuVar.errorCode;
                String strZzf = zzba.zzf(zzbuVar.errorMessage, zzbuVar.innerError);
                if (this.zza.zzg.get(strZzd) != null) {
                    userRequestContext2 = ((AdsRequest) this.zza.zzg.get(strZzd)).getUserRequestContext();
                } else {
                    userRequestContext2 = this.zza.zzh.get(strZzd) != null ? ((StreamRequest) this.zza.zzh.get(strZzd)).getUserRequestContext() : new Object();
                }
                this.zza.zze.zzc(new zzd(new AdError(adErrorType, i10, strZzf), userRequestContext2));
                return;
            }
            if (iOrdinal != 71) {
                return;
            }
            String str = zzbuVar.streamId;
            boolean z10 = zzbuVar.monitorAppLifecycle;
            zzy zzyVar = this.zza;
            StreamDisplayContainer streamDisplayContainer = (StreamDisplayContainer) zzyVar.zzk;
            StreamRequest streamRequest = (StreamRequest) zzyVar.zzh.get(strZzd);
            if (streamRequest == null) {
                this.zza.zze.zzc(new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Request not found for session id: ".concat(String.valueOf(strZzd))), new Object()));
            } else {
                this.zza.zzi.zzc(streamRequest.getContentUrl());
                this.zza.zzi.zzd(true);
                zzy zzyVar2 = this.zza;
                zzba zzbaVar = zzyVar2.zzc;
                zzcd zzcdVar = new zzcd(zzyVar2.zzc.zzb(), streamDisplayContainer.getAdContainer());
                zzy zzyVar3 = this.zza;
                String manifestSuffix = streamRequest.getManifestSuffix();
                zzbt zzbtVar = zzyVar3.zzi;
                zzat zzatVar = new zzat(zzyVar3.zzp);
                zzy zzyVar4 = this.zza;
                zzuv zzuvVar = zzyVar4.zzo;
                Context context = zzyVar4.zza;
                zzy.zzn(zzyVar2, new zzaa(new zzby(strZzd, zzbaVar, streamDisplayContainer, new zzcb(strZzd, zzbaVar, zzatVar, streamDisplayContainer, manifestSuffix, new zzar(streamDisplayContainer.getVideoStreamPlayer(), 200L), zzcdVar, context), new zzb(strZzd, zzbaVar, streamDisplayContainer.getAdContainer()), zzbtVar, zzatVar, zzuvVar, context, str, z10), streamRequest.getUserRequestContext()));
                zzahj zzahjVarZzc = this.zza.zzp.zzc(strZzd);
                zzahg zzahgVar = (zzahg) zzahjVarZzc.zza().zzaz();
                zzahg zzahgVarZzc = zzahh.zzc();
                zzahgVarZzc.zza(System.currentTimeMillis());
                zzahgVar.zzaj((zzahh) zzahgVarZzc.zzal());
                zzahjVarZzc.zzg(zzahgVar);
                this.zza.zzp.zze(strZzd);
            }
            zzfk.zzc("Stream initialized with streamId: ".concat(String.valueOf(zzbuVar.streamId)));
            return;
        }
        if (zzbuVar == null) {
            zzy zzyVar5 = this.zza;
            AdError.AdErrorType adErrorType2 = AdError.AdErrorType.LOAD;
            AdError.AdErrorCode adErrorCode = AdError.AdErrorCode.INTERNAL_ERROR;
            if (zzyVar5.zzg.get(strZzd) != null) {
                userRequestContext = ((AdsRequest) this.zza.zzg.get(strZzd)).getUserRequestContext();
            } else {
                userRequestContext = this.zza.zzh.get(strZzd) != null ? ((StreamRequest) this.zza.zzh.get(strZzd)).getUserRequestContext() : new Object();
            }
            this.zza.zze.zzc(new zzd(new AdError(adErrorType2, adErrorCode, "adsLoaded message did not contain cue points."), userRequestContext));
            return;
        }
        zzy zzyVar6 = this.zza;
        List<Float> list = zzbuVar.adCuePoints;
        SortedSet<Float> sortedSet = zzbuVar.internalCuePoints;
        boolean z11 = zzbuVar.monitorAppLifecycle;
        AdDisplayContainer adDisplayContainer = (AdDisplayContainer) zzyVar6.zzk;
        AdsRequest adsRequest = (AdsRequest) zzyVar6.zzg.get(strZzd);
        if (adsRequest == null) {
            this.zza.zze.zzc(new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Request not found for session id: ".concat(String.valueOf(strZzd))), new Object()));
            return;
        }
        ContentProgressProvider contentProgressProvider = adsRequest.getContentProgressProvider();
        AdError adError = null;
        zzar zzarVar = contentProgressProvider != null ? new zzar(contentProgressProvider, 200L) : null;
        this.zza.zzi.zzc(adsRequest.getContentUrl());
        if (sortedSet != null && !sortedSet.isEmpty() && zzarVar == null) {
            adError = new AdError(AdError.AdErrorType.PLAY, AdError.AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING, "Unable to handle cue points, no content progress provider configured.");
        }
        if (adError != null) {
            this.zza.zze.zzc(new zzd(adError, adsRequest.getUserRequestContext()));
            return;
        }
        zzy zzyVar7 = this.zza;
        zzba zzbaVar2 = zzyVar7.zzc;
        zzcd zzcdVar2 = new zzcd(zzyVar7.zzc.zzb(), adDisplayContainer.getAdContainer());
        zzy zzyVar8 = this.zza;
        zzbt zzbtVar2 = zzyVar8.zzi;
        zzat zzatVar2 = new zzat(zzyVar8.zzp);
        zzy zzyVar9 = this.zza;
        zzy.zzn(this.zza, new zzaa(zzz.zza(strZzd, zzbaVar2, zzcdVar2, adDisplayContainer, zzarVar, list, sortedSet, zzbtVar2, zzatVar2, zzyVar9.zzo, zzyVar9.zza, z11), adsRequest.getUserRequestContext()));
        zzahj zzahjVarZzc2 = this.zza.zzp.zzc(strZzd);
        zzahg zzahgVar2 = (zzahg) zzahjVarZzc2.zza().zzaz();
        zzahg zzahgVarZzc2 = zzahh.zzc();
        zzahgVarZzc2.zza(System.currentTimeMillis());
        zzahgVar2.zzaj((zzahh) zzahgVarZzc2.zzal());
        zzahjVarZzc2.zzg(zzahgVar2);
        this.zza.zzp.zze(strZzd);
    }
}
