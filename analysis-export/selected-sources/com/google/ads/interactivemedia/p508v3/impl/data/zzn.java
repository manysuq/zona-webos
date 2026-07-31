package com.google.ads.interactivemedia.p508v3.impl.data;

import com.google.ads.interactivemedia.p508v3.api.UiElement;
import com.google.ads.interactivemedia.p508v3.internal.zzrm;
import com.google.ads.interactivemedia.p508v3.internal.zzrr;
import javax.annotation.Nullable;
import p644k0.C15637a;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzn extends zzg {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;

    @Nullable
    private final zzrm<String> mimeTypes;
    private final double playAdsAfterTime;

    @Nullable
    private final zzrr<UiElement> uiElements;

    private zzn(int i10, @Nullable zzrm<String> zzrmVar, @Nullable zzrr<UiElement> zzrrVar, boolean z10, boolean z11, double d10, boolean z12, int i11) {
        this.bitrate = i10;
        this.mimeTypes = zzrmVar;
        this.uiElements = zzrrVar;
        this.enablePreloading = z10;
        this.enableFocusSkipButton = z11;
        this.playAdsAfterTime = d10;
        this.disableUi = z12;
        this.loadVideoTimeout = i11;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        zzrm<String> zzrmVar;
        zzrr<UiElement> zzrrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzg) {
            zzg zzgVar = (zzg) obj;
            if (this.bitrate == zzgVar.bitrate() && ((zzrmVar = this.mimeTypes) != null ? zzrmVar.equals(zzgVar.mimeTypes()) : zzgVar.mimeTypes() == null) && ((zzrrVar = this.uiElements) != null ? zzrrVar.equals(zzgVar.uiElements()) : zzgVar.uiElements() == null) && this.enablePreloading == zzgVar.enablePreloading() && this.enableFocusSkipButton == zzgVar.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(zzgVar.playAdsAfterTime()) && this.disableUi == zzgVar.disableUi() && this.loadVideoTimeout == zzgVar.loadVideoTimeout()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        zzrm<String> zzrmVar = this.mimeTypes;
        int iHashCode = zzrmVar == null ? 0 : zzrmVar.hashCode();
        int i10 = this.bitrate;
        zzrr<UiElement> zzrrVar = this.uiElements;
        return ((((((((((((iHashCode ^ ((i10 ^ 1000003) * 1000003)) * 1000003) ^ (zzrrVar != null ? zzrrVar.hashCode() : 0)) * 1000003) ^ (true != this.enablePreloading ? 1237 : 1231)) * 1000003) ^ (true != this.enableFocusSkipButton ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003) ^ (true != this.disableUi ? 1237 : 1231)) * 1000003) ^ this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    @Nullable
    public zzrm<String> mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    public zzf toBuilder() {
        return new zzl(this);
    }

    public String toString() {
        zzrr<UiElement> zzrrVar = this.uiElements;
        String strValueOf = String.valueOf(this.mimeTypes);
        String strValueOf2 = String.valueOf(zzrrVar);
        StringBuilder sb2 = new StringBuilder("AdsRenderingSettingsData{bitrate=");
        sb2.append(this.bitrate);
        sb2.append(", mimeTypes=");
        sb2.append(strValueOf);
        sb2.append(", uiElements=");
        sb2.append(strValueOf2);
        sb2.append(", enablePreloading=");
        sb2.append(this.enablePreloading);
        sb2.append(", enableFocusSkipButton=");
        sb2.append(this.enableFocusSkipButton);
        sb2.append(", playAdsAfterTime=");
        sb2.append(this.playAdsAfterTime);
        sb2.append(", disableUi=");
        sb2.append(this.disableUi);
        sb2.append(", loadVideoTimeout=");
        return C15637a.m18295a("}", this.loadVideoTimeout, sb2);
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzg
    @Nullable
    public zzrr<UiElement> uiElements() {
        return this.uiElements;
    }
}
