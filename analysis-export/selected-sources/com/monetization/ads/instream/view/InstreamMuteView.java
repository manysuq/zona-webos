package com.monetization.ads.instream.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yads.vm3;
import yads.wx1;
import yads.zx1;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18687d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m18688d2 = {"Lcom/monetization/ads/instream/view/InstreamMuteView;", "Landroid/widget/ImageView;", "Lyads/wx1;", "", "muted", "", "setMuted", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobileads_externalRelease"}, m18689k = 1, m18690mv = {1, 9, 0})
public final class InstreamMuteView extends ImageView implements wx1 {

    /* JADX INFO: renamed from: a */
    private final vm3 f31236a;

    /* JADX INFO: renamed from: b */
    private boolean f31237b;

    @JvmOverloads
    public InstreamMuteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: renamed from: a */
    private static vm3 m12158a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalInstreamMuteView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f31378xeb95fd33, R$drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f31377x8729a89b, R$drawable.monetization_ads_internal_ic_sound_off_default);
        int i10 = R$string.monetization_ads_internal_instream_muted;
        int i11 = R$string.monetization_ads_internal_instream_unmuted;
        typedArrayObtainStyledAttributes.recycle();
        return new vm3(new zx1(resourceId2, resourceId, i10, i11));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        Resources resources = getResources();
        setMeasuredDimension(resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_width_v2), resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_height_v2));
    }

    @Override // yads.wx1
    public void setMuted(boolean muted) {
        this.f31237b = muted;
        this.f31236a.m24555a(this, muted);
    }

    public /* synthetic */ InstreamMuteView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @JvmOverloads
    public InstreamMuteView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f31236a = m12158a(context, attributeSet);
        m12159a();
    }

    /* JADX INFO: renamed from: a */
    private final void m12159a() {
        setMuted(this.f31237b);
    }
}
