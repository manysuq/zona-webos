package com.google.ads.interactivemedia.p508v3.internal;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import p623j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzev implements zzex {
    private final String zza;

    public zzev(String str) {
        this.zza = str;
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzex
    public final boolean zza(zzew zzewVar, Context context, boolean z10, boolean z11) {
        String str;
        String host;
        if (z10 || !z11 || (str = this.zza) == null || !str.contains("GOOGLE_INSTREAM_VIDEO_NONCE")) {
            return false;
        }
        String str2 = this.zza;
        List list = zzewVar.zzc;
        if (str2 == null || list == null || (host = Uri.parse(str2).getHost()) == null) {
            return true;
        }
        if (host.startsWith("www.")) {
            host = host.substring(4);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Objects.equals(host, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
