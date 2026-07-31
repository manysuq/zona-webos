package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import yads.ViewOnAttachStateChangeListenerC19990hk;
import yads.b03;
import yads.lv2;
import yads.nj3;
import yads.oj3;
import yads.ov2;
import yads.x20;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18687d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@DX\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\f\u0010\u0010R$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR(\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, m18688d2 = {"Lcom/monetization/ads/nativeads/CustomizableMediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "a", "I", "getVideoControlsLayoutId", "()I", "(I)V", "videoControlsLayoutId", "b", "getWidthMeasureSpec", "widthMeasureSpec", "c", "getHeightMeasureSpec", "heightMeasureSpec", "Lyads/nj3;", "d", "Lyads/nj3;", "getVideoScaleType", "()Lyads/nj3;", "videoScaleType", "Lyads/x20;", "e", "Lyads/x20;", "getOnSizeChangedListener$mobileads_externalRelease", "()Lyads/x20;", "setOnSizeChangedListener$mobileads_externalRelease", "(Lyads/x20;)V", "onSizeChangedListener", "mobileads_externalRelease"}, m18689k = 1, m18690mv = {1, 9, 0})
public class CustomizableMediaView extends FrameLayout {

    /* JADX INFO: renamed from: f */
    private static final int f31252f = R$layout.monetization_ads_internal_outstream_controls_default;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int videoControlsLayoutId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int widthMeasureSpec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int heightMeasureSpec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final nj3 videoScaleType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private x20 onSizeChangedListener;

    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalMediaView);
            this.videoControlsLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f31379x71af5829, f31252f);
            this.videoScaleType = oj3.m23813a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.videoControlsLayoutId = f31252f;
            this.videoScaleType = null;
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC19990hk(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: p8.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.m12161a(this.f54734b);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m12161a(CustomizableMediaView customizableMediaView) {
        x20 x20Var = customizableMediaView.onSizeChangedListener;
        if (x20Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            ov2 ov2Var = (ov2) ((lv2) x20Var).f65301a.get();
            if (ov2Var != null) {
                b03 b03Var = ov2Var.f66384f;
                if (width < b03Var.f61564b || height < b03Var.f61565c) {
                    KProperty kProperty = ov2.f66383j[2];
                    throw null;
                }
            }
        }
    }

    public final int getHeightMeasureSpec() {
        return this.heightMeasureSpec;
    }

    /* JADX INFO: renamed from: getOnSizeChangedListener$mobileads_externalRelease, reason: from getter */
    public final x20 getOnSizeChangedListener() {
        return this.onSizeChangedListener;
    }

    public final int getVideoControlsLayoutId() {
        return this.videoControlsLayoutId;
    }

    public final nj3 getVideoScaleType() {
        return this.videoScaleType;
    }

    public final int getWidthMeasureSpec() {
        return this.widthMeasureSpec;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.widthMeasureSpec = i10;
        this.heightMeasureSpec = i11;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        ov2 ov2Var;
        super.onSizeChanged(i10, i11, i12, i13);
        x20 x20Var = this.onSizeChangedListener;
        if (x20Var == null || (ov2Var = (ov2) ((lv2) x20Var).f65301a.get()) == null) {
            return;
        }
        b03 b03Var = ov2Var.f66384f;
        if (i10 < b03Var.f61564b || i11 < b03Var.f61565c) {
            KProperty kProperty = ov2.f66383j[2];
            throw null;
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(x20 x20Var) {
        this.onSizeChangedListener = x20Var;
    }

    public CustomizableMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
