package com.google.ads.interactivemedia.p508v3.impl.data;

import com.google.ads.interactivemedia.p508v3.api.UiElement;
import com.google.ads.interactivemedia.p508v3.internal.zzrm;
import com.google.ads.interactivemedia.p508v3.internal.zzrr;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzl extends zzf {
    private int bitrate;
    private boolean disableUi;
    private boolean enableFocusSkipButton;
    private boolean enablePreloading;
    private int loadVideoTimeout;
    private zzrm<String> mimeTypes;
    private double playAdsAfterTime;
    private byte set$0;
    private zzrr<UiElement> uiElements;

    public zzl() {
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzg build() {
        if (this.set$0 == 63) {
            return new zzn(this.bitrate, this.mimeTypes, this.uiElements, this.enablePreloading, this.enableFocusSkipButton, this.playAdsAfterTime, this.disableUi, this.loadVideoTimeout);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb2.append(" bitrate");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" enablePreloading");
        }
        if ((this.set$0 & 4) == 0) {
            sb2.append(" enableFocusSkipButton");
        }
        if ((this.set$0 & 8) == 0) {
            sb2.append(" playAdsAfterTime");
        }
        if ((this.set$0 & 16) == 0) {
            sb2.append(" disableUi");
        }
        if ((this.set$0 & 32) == 0) {
            sb2.append(" loadVideoTimeout");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzf setBitrate(int i10) {
        this.bitrate = i10;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzf setDisableUi(boolean z10) {
        this.disableUi = z10;
        this.set$0 = (byte) (this.set$0 | 16);
        return this;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzf setEnableFocusSkipButton(boolean z10) {
        this.enableFocusSkipButton = z10;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzf setEnablePreloading(boolean z10) {
        this.enablePreloading = z10;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzf setLoadVideoTimeout(int i10) {
        this.loadVideoTimeout = i10;
        this.set$0 = (byte) (this.set$0 | 32);
        return this;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzf setMimeTypes(@Nullable List<String> list) {
        this.mimeTypes = list == null ? null : zzrm.zzk(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzf setPlayAdsAfterTime(double d10) {
        this.playAdsAfterTime = d10;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }

    @Override // com.google.ads.interactivemedia.p508v3.impl.data.zzf
    public zzf setUiElements(@Nullable Set<UiElement> set) {
        this.uiElements = set == null ? null : zzrr.zzl(set);
        return this;
    }

    public zzl(zzg zzgVar) {
        this.bitrate = zzgVar.bitrate();
        this.mimeTypes = zzgVar.mimeTypes();
        this.uiElements = zzgVar.uiElements();
        this.enablePreloading = zzgVar.enablePreloading();
        this.enableFocusSkipButton = zzgVar.enableFocusSkipButton();
        this.playAdsAfterTime = zzgVar.playAdsAfterTime();
        this.disableUi = zzgVar.disableUi();
        this.loadVideoTimeout = zzgVar.loadVideoTimeout();
        this.set$0 = (byte) 63;
    }
}
