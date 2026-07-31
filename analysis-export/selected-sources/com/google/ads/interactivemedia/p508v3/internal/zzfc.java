package com.google.ads.interactivemedia.p508v3.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.ads.interactivemedia.p508v3.impl.data.zzbo;
import com.google.android.gms.tasks.Task;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p080E7.C1303j;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzfc {
    private final zzuv zza;
    private final float zzb;

    public zzfc(ExecutorService executorService, float f10) {
        this.zzb = f10;
        this.zza = zzvb.zza(executorService);
    }

    public final /* synthetic */ Bitmap zza(String str, zzbo zzboVar) {
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        if (bitmapDecodeStream == null) {
            return null;
        }
        if (zzboVar.width != bitmapDecodeStream.getWidth() || zzboVar.height != bitmapDecodeStream.getHeight()) {
            return bitmapDecodeStream;
        }
        double d10 = this.zzb;
        if (Math.copySign(1.0d - d10, 1.0d) <= 0.1d || d10 == 1.0d) {
            return bitmapDecodeStream;
        }
        if (Double.isNaN(1.0d) && Double.isNaN(d10)) {
            return bitmapDecodeStream;
        }
        return Bitmap.createScaledBitmap(bitmapDecodeStream, (int) (this.zzb * bitmapDecodeStream.getWidth()), (int) (this.zzb * bitmapDecodeStream.getHeight()), true);
    }

    public final Task zzb(final String str, final zzbo zzboVar) {
        C1303j c1303j = new C1303j();
        zzuk.zze(this.zza.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzfa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(str, zzboVar);
            }
        }), new zzfb(this, c1303j, str), this.zza);
        return c1303j.f4549a;
    }
}
