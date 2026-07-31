package com.yandex.div.core.player;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p514d0.C10219v;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m18688d2 = {"Lcom/yandex/div/core/player/DivVideoSource;", "", "Landroid/net/Uri;", "url", "", "mimeType", "Lcom/yandex/div/core/player/DivVideoResolution;", "resolution", "", "bitrate", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Lcom/yandex/div/core/player/DivVideoResolution;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "Ljava/lang/String;", "getMimeType", "Lcom/yandex/div/core/player/DivVideoResolution;", "getResolution", "()Lcom/yandex/div/core/player/DivVideoResolution;", "Ljava/lang/Long;", "getBitrate", "()Ljava/lang/Long;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public final /* data */ class DivVideoSource {
    private final Long bitrate;
    private final String mimeType;
    private final DivVideoResolution resolution;
    private final Uri url;

    public DivVideoSource(Uri uri, String str, DivVideoResolution divVideoResolution, Long l10) {
        this.url = uri;
        this.mimeType = str;
        this.resolution = divVideoResolution;
        this.bitrate = l10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivVideoSource)) {
            return false;
        }
        DivVideoSource divVideoSource = (DivVideoSource) other;
        return Intrinsics.areEqual(this.url, divVideoSource.url) && Intrinsics.areEqual(this.mimeType, divVideoSource.mimeType) && Intrinsics.areEqual(this.resolution, divVideoSource.resolution) && Intrinsics.areEqual(this.bitrate, divVideoSource.bitrate);
    }

    public int hashCode() {
        int iM12391a = C10219v.m12391a(this.url.hashCode() * 31, 31, this.mimeType);
        DivVideoResolution divVideoResolution = this.resolution;
        int iHashCode = (iM12391a + (divVideoResolution == null ? 0 : divVideoResolution.hashCode())) * 31;
        Long l10 = this.bitrate;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "DivVideoSource(url=" + this.url + ", mimeType=" + this.mimeType + ", resolution=" + this.resolution + ", bitrate=" + this.bitrate + ')';
    }
}
