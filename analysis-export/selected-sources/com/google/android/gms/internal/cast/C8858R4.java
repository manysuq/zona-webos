package com.google.android.gms.internal.cast;

import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.R4 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C8858R4 extends AbstractC8879U4 {

    /* JADX INFO: renamed from: d */
    public final byte[] f29792d;

    /* JADX INFO: renamed from: e */
    public final int f29793e;

    /* JADX INFO: renamed from: f */
    public int f29794f;

    public C8858R4(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.f29792d = bArr;
        this.f29794f = 0;
        this.f29793e = i10;
    }

    /* JADX INFO: renamed from: e */
    public final void m10780e(byte b10) throws C8872T4 {
        try {
            byte[] bArr = this.f29792d;
            int i10 = this.f29794f;
            this.f29794f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C8872T4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29794f), Integer.valueOf(this.f29793e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10781f(int i10, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f29792d, this.f29794f, i10);
            this.f29794f += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C8872T4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29794f), Integer.valueOf(this.f29793e), Integer.valueOf(i10)), e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10782g(int i10, boolean z10) throws C8872T4 {
        m10793r(i10 << 3);
        m10780e(z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: h */
    public final void m10783h(int i10, AbstractC8852Q4 abstractC8852Q4) {
        m10793r((i10 << 3) | 2);
        m10793r(abstractC8852Q4.mo10769f());
        abstractC8852Q4.mo10774j(this);
    }

    /* JADX INFO: renamed from: i */
    public final void m10784i(int i10, int i11) throws C8872T4 {
        m10793r((i10 << 3) | 5);
        m10785j(i11);
    }

    /* JADX INFO: renamed from: j */
    public final void m10785j(int i10) throws C8872T4 {
        try {
            byte[] bArr = this.f29792d;
            int i11 = this.f29794f;
            int i12 = i11 + 1;
            this.f29794f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f29794f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f29794f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f29794f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C8872T4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29794f), Integer.valueOf(this.f29793e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10786k(int i10, long j10) throws C8872T4 {
        m10793r((i10 << 3) | 1);
        m10787l(j10);
    }

    /* JADX INFO: renamed from: l */
    public final void m10787l(long j10) throws C8872T4 {
        try {
            byte[] bArr = this.f29792d;
            int i10 = this.f29794f;
            int i11 = i10 + 1;
            this.f29794f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f29794f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f29794f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f29794f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f29794f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f29794f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f29794f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f29794f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C8872T4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29794f), Integer.valueOf(this.f29793e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m10788m(int i10, int i11) throws C8872T4 {
        m10793r(i10 << 3);
        m10789n(i11);
    }

    /* JADX INFO: renamed from: n */
    public final void m10789n(int i10) throws C8872T4 {
        if (i10 >= 0) {
            m10793r(i10);
        } else {
            m10795t(i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10790o(int i10, String str) throws C8872T4 {
        m10793r((i10 << 3) | 2);
        int i11 = this.f29794f;
        try {
            int iM10828c = AbstractC8879U4.m10828c(str.length() * 3);
            int iM10828c2 = AbstractC8879U4.m10828c(str.length());
            int i12 = this.f29793e;
            byte[] bArr = this.f29792d;
            if (iM10828c2 != iM10828c) {
                m10793r(C9075t6.m11020c(str));
                int i13 = this.f29794f;
                this.f29794f = C9075t6.m11019b(str, bArr, i13, i12 - i13);
            } else {
                int i14 = i11 + iM10828c2;
                this.f29794f = i14;
                int iM11019b = C9075t6.m11019b(str, bArr, i14, i12 - i14);
                this.f29794f = i11;
                m10793r((iM11019b - i11) - iM10828c2);
                this.f29794f = iM11019b;
            }
        } catch (C9067s6 e10) {
            this.f29794f = i11;
            AbstractC8879U4.f29804b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(C9010l5.f29928a);
            try {
                int length = bytes.length;
                m10793r(length);
                m10781f(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new C8872T4(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new C8872T4(e12);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m10791p(int i10, int i11) {
        m10793r((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: q */
    public final void m10792q(int i10, int i11) {
        m10793r(i10 << 3);
        m10793r(i11);
    }

    /* JADX INFO: renamed from: r */
    public final void m10793r(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f29792d;
            if (i11 == 0) {
                int i12 = this.f29794f;
                this.f29794f = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f29794f;
                    this.f29794f = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C8872T4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29794f), Integer.valueOf(this.f29793e), 1), e10);
                }
            }
            throw new C8872T4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29794f), Integer.valueOf(this.f29793e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m10794s(int i10, long j10) throws C8872T4 {
        m10793r(i10 << 3);
        m10795t(j10);
    }

    /* JADX INFO: renamed from: t */
    public final void m10795t(long j10) throws C8872T4 {
        boolean z10 = AbstractC8879U4.f29805c;
        int i10 = this.f29793e;
        byte[] bArr = this.f29792d;
        if (!z10 || i10 - this.f29794f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i11 = this.f29794f;
                    this.f29794f = i11 + 1;
                    bArr[i11] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C8872T4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29794f), Integer.valueOf(i10), 1), e10);
                }
            }
            int i12 = this.f29794f;
            this.f29794f = i12 + 1;
            bArr[i12] = (byte) j10;
            return;
        }
        while (true) {
            int i13 = (int) j10;
            if ((j10 & (-128)) == 0) {
                int i14 = this.f29794f;
                this.f29794f = i14 + 1;
                C9043p6.f29986c.mo10949d(bArr, C9043p6.f29989f + ((long) i14), (byte) i13);
                return;
            } else {
                int i15 = this.f29794f;
                this.f29794f = i15 + 1;
                C9043p6.f29986c.mo10949d(bArr, C9043p6.f29989f + ((long) i15), (byte) ((i13 & 127) | 128));
                j10 >>>= 7;
            }
        }
    }
}
