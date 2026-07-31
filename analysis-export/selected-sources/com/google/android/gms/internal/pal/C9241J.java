package com.google.android.gms.internal.pal;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.pal.J */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9241J extends AbstractC9254K {

    /* JADX INFO: renamed from: c */
    public final byte[] f30448c;

    /* JADX INFO: renamed from: d */
    public int f30449d;

    /* JADX INFO: renamed from: e */
    public int f30450e;

    /* JADX INFO: renamed from: g */
    public int f30452g;

    /* JADX INFO: renamed from: h */
    public int f30453h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public int f30451f = 0;

    public /* synthetic */ C9241J(byte[] bArr, int i10) {
        this.f30448c = bArr;
        this.f30449d = i10;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC9254K
    /* JADX INFO: renamed from: a */
    public final int mo11233a(int i10) {
        if (i10 < 0) {
            throw C9637o0.m11922c();
        }
        int i11 = i10 + this.f30451f;
        if (i11 < 0) {
            throw C9637o0.m11923d();
        }
        int i12 = this.f30453h;
        if (i11 > i12) {
            throw C9637o0.m11924e();
        }
        this.f30453h = i11;
        int i13 = this.f30449d + this.f30450e;
        this.f30449d = i13;
        if (i13 <= i11) {
            this.f30450e = 0;
            return i12;
        }
        int i14 = i13 - i11;
        this.f30450e = i14;
        this.f30449d = i13 - i14;
        return i12;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC9254K
    /* JADX INFO: renamed from: b */
    public final int mo11234b() throws C9637o0 {
        if (mo11235c()) {
            this.f30452g = 0;
            return 0;
        }
        int iM11238h = m11238h();
        this.f30452g = iM11238h;
        if ((iM11238h >>> 3) != 0) {
            return iM11238h;
        }
        throw new C9637o0("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.pal.AbstractC9254K
    /* JADX INFO: renamed from: c */
    public final boolean mo11235c() {
        return this.f30451f == this.f30449d;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC9254K
    /* JADX INFO: renamed from: d */
    public final boolean mo11236d() {
        return m11240j() != 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m11237g() throws C9637o0 {
        int i10 = this.f30451f;
        if (this.f30449d - i10 < 4) {
            throw C9637o0.m11924e();
        }
        this.f30451f = i10 + 4;
        byte[] bArr = this.f30448c;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    /* JADX INFO: renamed from: h */
    public final int m11238h() {
        int i10;
        int i11 = this.f30451f;
        int i12 = this.f30449d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f30448c;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f30451f = i13;
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
                this.f30451f = i14;
                return i10;
            }
        }
        return (int) m11241k();
    }

    /* JADX INFO: renamed from: i */
    public final long m11239i() throws C9637o0 {
        int i10 = this.f30451f;
        if (this.f30449d - i10 < 8) {
            throw C9637o0.m11924e();
        }
        this.f30451f = i10 + 8;
        byte[] bArr = this.f30448c;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: j */
    public final long m11240j() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f30451f;
        int i11 = this.f30449d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f30448c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f30451f = i12;
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
                            long j14 = (-2080896) ^ i18;
                            i13 = i17;
                            j11 = j14;
                        } else {
                            i15 = i10 + 5;
                            long j15 = (((long) bArr[i17]) << 28) ^ ((long) i18);
                            if (j15 >= 0) {
                                j13 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i15]) << 35);
                                if (j16 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i15 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i19]) << 42);
                                    if (j15 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i15]) << 49);
                                        if (j16 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i15 = i10 + 9;
                                            j10 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    j11 = j10;
                                                    i13 = i20;
                                                }
                                            } else {
                                                j11 = j10;
                                            }
                                        }
                                    }
                                }
                                j11 = j16 ^ j12;
                                i13 = i19;
                            }
                            j10 = j15 ^ j13;
                            j11 = j10;
                        }
                    }
                    i13 = i15;
                }
                this.f30451f = i13;
                return j11;
            }
        }
        return m11241k();
    }

    /* JADX INFO: renamed from: k */
    public final long m11241k() throws C9637o0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f30451f;
            if (i11 == this.f30449d) {
                throw C9637o0.m11924e();
            }
            this.f30451f = i11 + 1;
            byte b10 = this.f30448c[i11];
            j10 |= ((long) (b10 & ByteCompanionObject.MAX_VALUE)) << i10;
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j10;
            }
        }
        throw new C9637o0("CodedInputStream encountered a malformed varint.");
    }
}
