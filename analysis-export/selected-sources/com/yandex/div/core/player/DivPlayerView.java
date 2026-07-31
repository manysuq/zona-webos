package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.div.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045C8.C0676c;
import p607i9.EnumC12361Re;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, m18688d2 = {"Lcom/yandex/div/core/player/DivPlayerView;", "Landroid/widget/FrameLayout;", "Lcom/yandex/div/core/player/DivVideoAttachable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divImageStyle : i10);
    }

    public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
        return C0676c.m1206c(this);
    }

    public /* bridge */ /* synthetic */ void setScale(EnumC12361Re enumC12361Re) {
        C0676c.m1207d(this, enumC12361Re);
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z10) {
        C0676c.m1208e(this, z10);
    }

    public DivPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
