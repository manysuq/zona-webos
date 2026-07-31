package com.yandex.div.svg;

import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p025B6.C0316g;
import p025B6.C0318i;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m18688d2 = {"Lcom/yandex/div/svg/SvgDecoder;", "", "useViewBoundsAsIntrinsicSize", "", "(Z)V", "decode", "Landroid/graphics/drawable/PictureDrawable;", AdRevenueConstants.SOURCE_KEY, "Ljava/io/InputStream;", "div-svg_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class SvgDecoder {
    private final boolean useViewBoundsAsIntrinsicSize;

    public SvgDecoder(boolean z10) {
        this.useViewBoundsAsIntrinsicSize = z10;
    }

    public final PictureDrawable decode(InputStream source) {
        float fWidth;
        float fHeight;
        try {
            C0316g c0316gM466d = C0316g.m466d(source);
            RectF rectFM468b = c0316gM466d.m468b();
            if (this.useViewBoundsAsIntrinsicSize && rectFM468b != null) {
                fWidth = rectFM468b.width();
                fHeight = rectFM468b.height();
            } else {
                if (c0316gM466d.f1261a == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                fWidth = c0316gM466d.m467a().f1391c;
                if (c0316gM466d.f1261a == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                fHeight = c0316gM466d.m467a().f1392d;
            }
            if (rectFM468b == null && fWidth > 0.0f && fHeight > 0.0f) {
                C0316g.E e10 = c0316gM466d.f1261a;
                if (e10 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                e10.f1377o = new C0316g.C21281a(0.0f, 0.0f, fWidth, fHeight);
            }
            return new PictureDrawable(c0316gM466d.m469e());
        } catch (C0318i unused) {
            return null;
        }
    }

    public /* synthetic */ SvgDecoder(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
