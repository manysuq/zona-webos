package com.google.ads.interactivemedia.p508v3.internal;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzacm {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zzacl zzaclVar) throws zzaeg {
        int iZzh = zzh(bArr, i10, zzaclVar);
        int i11 = zzaclVar.zza;
        if (i11 < 0) {
            throw new zzaeg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzh) {
            throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzaclVar.zzc = zzacw.zzb;
            return iZzh;
        }
        zzaclVar.zzc = zzacw.zzp(bArr, iZzh, i11);
        return iZzh + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
        int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzaft zzaftVar, byte[] bArr, int i10, int i11, int i12, zzacl zzaclVar) throws zzaeg {
        Object objZze = zzaftVar.zze();
        int iZzl = zzl(objZze, zzaftVar, bArr, i10, i11, i12, zzaclVar);
        zzaftVar.zzf(objZze);
        zzaclVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzaft zzaftVar, byte[] bArr, int i10, int i11, zzacl zzaclVar) throws zzaeg {
        Object objZze = zzaftVar.zze();
        int iZzm = zzm(objZze, zzaftVar, bArr, i10, i11, zzaclVar);
        zzaftVar.zzf(objZze);
        zzaclVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzaft zzaftVar, int i10, byte[] bArr, int i11, int i12, zzaed zzaedVar, zzacl zzaclVar) throws zzaeg {
        int iZzd = zzd(zzaftVar, bArr, i11, i12, zzaclVar);
        zzaedVar.add(zzaclVar.zzc);
        while (iZzd < i12) {
            int iZzh = zzh(bArr, iZzd, zzaclVar);
            if (i10 != zzaclVar.zza) {
                break;
            }
            iZzd = zzd(zzaftVar, bArr, iZzh, i12, zzaclVar);
            zzaedVar.add(zzaclVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzaed zzaedVar, zzacl zzaclVar) throws zzaeg {
        zzadz zzadzVar = (zzadz) zzaedVar;
        int iZzh = zzh(bArr, i10, zzaclVar);
        int i11 = zzaclVar.zza + iZzh;
        while (iZzh < i11) {
            iZzh = zzh(bArr, iZzh, zzaclVar);
            zzadzVar.zzg(zzaclVar.zza);
        }
        if (iZzh == i11) {
            return iZzh;
        }
        throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzagi zzagiVar, zzacl zzaclVar) throws zzaeg {
        if ((i10 >>> 3) == 0) {
            throw new zzaeg("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzk = zzk(bArr, i11, zzaclVar);
            zzagiVar.zzj(i10, Long.valueOf(zzaclVar.zzb));
            return iZzk;
        }
        if (i13 == 1) {
            zzagiVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzh = zzh(bArr, i11, zzaclVar);
            int i14 = zzaclVar.zza;
            if (i14 < 0) {
                throw new zzaeg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZzh) {
                throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzagiVar.zzj(i10, zzacw.zzb);
            } else {
                zzagiVar.zzj(i10, zzacw.zzp(bArr, iZzh, i14));
            }
            return iZzh + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzaeg("Protocol message contained an invalid tag (zero).");
            }
            zzagiVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzagi zzagiVarZzf = zzagi.zzf();
        int i16 = zzaclVar.zze + 1;
        zzaclVar.zze = i16;
        zzo(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iZzh2 = zzh(bArr, i11, zzaclVar);
            int i18 = zzaclVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = iZzh2;
                break;
            }
            i11 = zzg(i18, bArr, iZzh2, i12, zzagiVarZzf, zzaclVar);
            i17 = i18;
        }
        zzaclVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzaeg("Failed to parse the message.");
        }
        zzagiVar.zzj(i10, zzagiVarZzf);
        return i11;
    }

    public static int zzh(byte[] bArr, int i10, zzacl zzaclVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzaclVar);
        }
        zzaclVar.zza = b10;
        return i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, zzacl zzaclVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzaclVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & ByteCompanionObject.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzaclVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & ByteCompanionObject.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzaclVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & ByteCompanionObject.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzaclVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzaclVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzaed zzaedVar, zzacl zzaclVar) {
        zzadz zzadzVar = (zzadz) zzaedVar;
        int iZzh = zzh(bArr, i11, zzaclVar);
        zzadzVar.zzg(zzaclVar.zza);
        while (iZzh < i12) {
            int iZzh2 = zzh(bArr, iZzh, zzaclVar);
            if (i10 != zzaclVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzaclVar);
            zzadzVar.zzg(zzaclVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i10, zzacl zzaclVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzaclVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & ByteCompanionObject.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & ByteCompanionObject.MAX_VALUE)) << i13;
            b10 = b11;
            i12 = i14;
        }
        zzaclVar.zzb = j11;
        return i12;
    }

    public static int zzl(Object obj, zzaft zzaftVar, byte[] bArr, int i10, int i11, int i12, zzacl zzaclVar) throws zzaeg {
        int i13 = zzaclVar.zze + 1;
        zzaclVar.zze = i13;
        zzo(i13);
        int iZzc = ((zzafe) zzaftVar).zzc(obj, bArr, i10, i11, i12, zzaclVar);
        zzaclVar.zze--;
        zzaclVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzaft zzaftVar, byte[] bArr, int i10, int i11, zzacl zzaclVar) throws zzaeg {
        int iZzi = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzi = zzi(i12, bArr, iZzi, zzaclVar);
            i12 = zzaclVar.zza;
        }
        int i13 = iZzi;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzaclVar.zze + 1;
        zzaclVar.zze = i14;
        zzo(i14);
        int i15 = i13 + i12;
        zzaftVar.zzi(obj, bArr, i13, i15, zzaclVar);
        zzaclVar.zze--;
        zzaclVar.zzc = obj;
        return i15;
    }

    public static long zzn(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void zzo(int i10) throws zzaeg {
        if (i10 >= zzb) {
            throw new zzaeg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
