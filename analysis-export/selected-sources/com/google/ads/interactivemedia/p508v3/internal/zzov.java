package com.google.ads.interactivemedia.p508v3.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import p670l7.C16342d;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzov {
    private final zzlf zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzov(zzlf zzlfVar, File file, File file2, File file3) {
        this.zza = zzlfVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzlf zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j10) {
        return this.zza.zzb() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] zze() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzt;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    bArrZzt = zzacw.zzq(fileInputStream).zzt();
                    C16342d.m19039a(fileInputStream);
                } catch (IOException unused) {
                    C16342d.m19039a(fileInputStream);
                    bArrZzt = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C16342d.m19039a(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.zze = bArrZzt;
        }
        byte[] bArr = this.zze;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
