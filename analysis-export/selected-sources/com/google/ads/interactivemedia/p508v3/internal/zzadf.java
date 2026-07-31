package com.google.ads.interactivemedia.p508v3.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzadf extends zzaco {
    private static final Logger zzb = Logger.getLogger(zzadf.class.getName());
    private static final boolean zzc = zzago.zzx();
    zzadg zza;

    private zzadf() {
        throw null;
    }

    public static int zzA(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i10, zzafb zzafbVar, zzaft zzaftVar) {
        int iZzz = zzz(i10 << 3);
        return ((zzach) zzafbVar).zzat(zzaftVar) + iZzz + iZzz;
    }

    public static int zzx(zzafb zzafbVar, zzaft zzaftVar) {
        int iZzat = ((zzach) zzafbVar).zzat(zzaftVar);
        return zzz(iZzat) + iZzat;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzagr.zzc(str);
        } catch (zzagq unused) {
            length = str.getBytes(zzaee.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzagq zzagqVar) throws zzadd {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzagqVar);
        byte[] bytes = str.getBytes(zzaee.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzadd(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    public abstract void zze(int i10, zzacw zzacwVar);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, zzafb zzafbVar, zzaft zzaftVar);

    public abstract void zzn(int i10, zzafb zzafbVar);

    public abstract void zzo(int i10, zzacw zzacwVar);

    public abstract void zzp(int i10, String str);

    public abstract void zzr(int i10, int i11);

    public abstract void zzs(int i10, int i11);

    public abstract void zzt(int i10);

    public abstract void zzu(int i10, long j10);

    public abstract void zzv(long j10);

    public /* synthetic */ zzadf(zzade zzadeVar) {
    }
}
