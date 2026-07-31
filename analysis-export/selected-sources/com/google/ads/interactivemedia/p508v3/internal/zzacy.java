package com.google.ads.interactivemedia.p508v3.internal;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
final class zzacy extends zzada {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzacy(byte[] bArr, int i10, int i11, boolean z10, zzacx zzacxVar) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
    }

    private final void zzF() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 <= i12) {
            this.zzg = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzg = i13;
        this.zzf = i10 - i13;
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final boolean zzA() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final boolean zzB() {
        return zzq() != 0;
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final double zza() {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final float zzb() {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zzc() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zzd(int i10) {
        if (i10 < 0) {
            throw new zzaeg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = (this.zzh - this.zzi) + i10;
        if (i11 < 0) {
            throw new zzaeg("Failed to parse the message.");
        }
        int i12 = this.zzk;
        if (i11 > i12) {
            throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i11;
        zzF();
        return i12;
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zze() {
        return zzi();
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zzf() {
        return zzh();
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zzg() {
        return zzi();
    }

    public final int zzh() throws zzaeg {
        int i10 = this.zzh;
        if (this.zzf - i10 < 4) {
            throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 4;
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
        int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int zzi() {
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzh = i14;
                return i10;
            }
        }
        return (int) zzr();
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zzj() {
        return zzh();
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zzk() {
        return zzada.zzC(zzi());
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zzl() throws zzaeg {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int iZzi = zzi();
        this.zzj = iZzi;
        if ((iZzi >>> 3) != 0) {
            return iZzi;
        }
        throw new zzaeg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final int zzm() {
        return zzi();
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final long zzn() {
        return zzp();
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final long zzo() {
        return zzq();
    }

    public final long zzp() throws zzaeg {
        int i10 = this.zzh;
        if (this.zzf - i10 < 8) {
            throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzq() {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzh = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j11 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j11 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j11 = j13;
                        } else {
                            i15 = i10 + 5;
                            long j14 = (((long) bArr[i17]) << 28) ^ ((long) i18);
                            if (j14 >= 0) {
                                j11 = j14 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j15 = (((long) bArr[i15]) << 35) ^ j14;
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 42);
                                    if (j16 >= 0) {
                                        j11 = 4363953127296L ^ j16;
                                    } else {
                                        i13 = i10 + 8;
                                        j15 = j16 ^ (((long) bArr[i19]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            j10 = (j15 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i13 = i10 + 10;
                                            } else {
                                                j11 = j10;
                                            }
                                        }
                                        j11 = j10;
                                    }
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                                j11 = j10;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.zzh = i13;
                return j11;
            }
        }
        return zzr();
    }

    public final long zzr() throws zzaeg {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.zzh;
            if (i11 == this.zzf) {
                throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.zze;
            this.zzh = i11 + 1;
            byte b10 = bArr[i11];
            j10 |= ((long) (b10 & ByteCompanionObject.MAX_VALUE)) << i10;
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j10;
            }
        }
        throw new zzaeg("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final long zzs() {
        return zzp();
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final long zzt() {
        return zzada.zzD(zzq());
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final long zzu() {
        return zzq();
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final zzacw zzv() throws zzaeg {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzi <= i10 - i11) {
                zzacw zzacwVarZzp = zzacw.zzp(this.zze, i11, iZzi);
                this.zzh += iZzi;
                return zzacwVarZzp;
            }
        }
        if (iZzi == 0) {
            return zzacw.zzb;
        }
        if (iZzi > 0) {
            int i12 = this.zzf;
            int i13 = this.zzh;
            if (iZzi <= i12 - i13) {
                int i14 = iZzi + i13;
                this.zzh = i14;
                return new zzacv(Arrays.copyOfRange(this.zze, i13, i14));
            }
        }
        if (iZzi <= 0) {
            throw new zzaeg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final String zzw() throws zzaeg {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzi <= i10 - i11) {
                String str = new String(this.zze, i11, iZzi, zzaee.zza);
                this.zzh += iZzi;
                return str;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi < 0) {
            throw new zzaeg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final String zzx() throws zzaeg {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzi <= i10 - i11) {
                String strZzd = zzagr.zzd(this.zze, i11, iZzi);
                this.zzh += iZzi;
                return strZzd;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi <= 0) {
            throw new zzaeg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final void zzy(int i10) throws zzaeg {
        if (this.zzj != 0) {
            throw new zzaeg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.ads.interactivemedia.p508v3.internal.zzada
    public final void zzz(int i10) {
        this.zzk = i10;
        zzF();
    }
}
