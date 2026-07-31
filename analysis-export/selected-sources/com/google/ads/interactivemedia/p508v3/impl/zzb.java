package com.google.ads.interactivemedia.p508v3.impl;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.ads.interactivemedia.p508v3.impl.data.zza;
import com.google.ads.interactivemedia.p508v3.impl.data.zzba;
import com.google.ads.interactivemedia.p508v3.impl.data.zzbb;
import com.google.ads.interactivemedia.p508v3.internal.zzel;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements zzaz {
    private final zzbi zza;
    private final String zzb;
    private final View zzc;
    private Activity zze = null;
    private zza zzd = null;
    private boolean zzf = false;

    public zzb(String str, zzbi zzbiVar, View view) {
        this.zzb = str;
        this.zza = zzbiVar;
        this.zzc = view;
    }

    private final DisplayMetrics zzj() {
        return this.zzc.getContext().getResources().getDisplayMetrics();
    }

    private static zzbb zzk(zzbb zzbbVar, float f10) {
        zzba zzbaVarBuilder = zzbb.builder();
        zzbaVarBuilder.left((int) Math.ceil(zzbbVar.left() / f10));
        zzbaVarBuilder.top((int) Math.ceil(zzbbVar.top() / f10));
        zzbaVarBuilder.height((int) Math.ceil(zzbbVar.height() / f10));
        zzbaVarBuilder.width((int) Math.ceil(zzbbVar.width() / f10));
        return zzbaVarBuilder.build();
    }

    public final com.google.ads.interactivemedia.p508v3.impl.data.zzb zzc(String str, String str2, String str3) {
        zzbb zzbbVarZzk = zzk(zzbb.builder().locationOnScreenOfView(this.zzc).build(), zzj().density);
        Rect rect = new Rect();
        boolean globalVisibleRect = this.zzc.getGlobalVisibleRect(rect);
        IBinder windowToken = this.zzc.getWindowToken();
        if (!globalVisibleRect || windowToken == null || !this.zzc.isShown()) {
            rect.set(0, 0, 0, 0);
        }
        zzba zzbaVarBuilder = zzbb.builder();
        zzbaVarBuilder.left(rect.left);
        zzbaVarBuilder.top(rect.top);
        zzbaVarBuilder.height(rect.height());
        zzbaVarBuilder.width(rect.width());
        zzbb zzbbVarZzk2 = zzk(zzbaVarBuilder.build(), zzj().density);
        boolean z10 = (this.zzc.getGlobalVisibleRect(new Rect()) && this.zzc.isShown()) ? false : true;
        AudioManager audioManager = (AudioManager) this.zzc.getContext().getSystemService("audio");
        double streamVolume = audioManager != null ? ((double) audioManager.getStreamVolume(3)) / ((double) audioManager.getStreamMaxVolume(3)) : 0.0d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zza zzaVarBuilder = com.google.ads.interactivemedia.p508v3.impl.data.zzb.builder();
        zzaVarBuilder.queryId(str);
        zzaVarBuilder.eventId(str2);
        zzaVarBuilder.appState(str3);
        zzaVarBuilder.nativeTime(jCurrentTimeMillis);
        zzaVarBuilder.nativeVolume(streamVolume);
        zzaVarBuilder.nativeViewHidden(z10);
        zzaVarBuilder.nativeViewBounds(zzbbVarZzk);
        zzaVarBuilder.nativeViewVisibleBounds(zzbbVarZzk2);
        return zzaVarBuilder.build();
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.zzaz
    public final void zzf(String str, String str2) {
        this.zza.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.activityMonitor, JavaScriptMessage.MsgType.viewability, this.zzb, zzc(str, str2, "")));
    }

    public final void zzg() {
        Application applicationZzb;
        if (!this.zzf || (applicationZzb = zzel.zzb(this.zzc.getContext())) == null) {
            return;
        }
        zza zzaVar = new zza(this);
        this.zzd = zzaVar;
        applicationZzb.registerActivityLifecycleCallbacks(zzaVar);
    }

    public final void zzh(boolean z10) {
        this.zzf = z10;
    }

    public final void zzi() {
        zza zzaVar;
        Application applicationZzb = zzel.zzb(this.zzc.getContext());
        if (applicationZzb == null || (zzaVar = this.zzd) == null) {
            return;
        }
        applicationZzb.unregisterActivityLifecycleCallbacks(zzaVar);
    }
}
