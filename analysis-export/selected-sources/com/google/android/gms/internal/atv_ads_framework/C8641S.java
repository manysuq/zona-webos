package com.google.android.gms.internal.atv_ads_framework;

import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.atv_ads_framework.S */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C8641S extends AbstractC8645U {

    /* JADX INFO: renamed from: d */
    public final byte[] f29468d;

    /* JADX INFO: renamed from: e */
    public final int f29469e;

    /* JADX INFO: renamed from: f */
    public int f29470f;

    public C8641S(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.f29468d = bArr;
        this.f29470f = 0;
        this.f29469e = i10;
    }

    /* JADX INFO: renamed from: f */
    public final void m10551f(byte b10) throws C8643T {
        try {
            byte[] bArr = this.f29468d;
            int i10 = this.f29470f;
            this.f29470f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C8643T(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29470f), Integer.valueOf(this.f29469e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10552g(int i10, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f29468d, this.f29470f, i10);
            this.f29470f += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C8643T(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29470f), Integer.valueOf(this.f29469e), Integer.valueOf(i10)), e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10553h(int i10, boolean z10) throws C8643T {
        m10564s(i10 << 3);
        m10551f(z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m10554i(int i10, AbstractC8638Q abstractC8638Q) {
        m10564s((i10 << 3) | 2);
        m10564s(abstractC8638Q.mo10543f());
        abstractC8638Q.mo10547j(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m10555j(int i10, int i11) throws C8643T {
        m10564s((i10 << 3) | 5);
        m10556k(i11);
    }

    /* JADX INFO: renamed from: k */
    public final void m10556k(int i10) throws C8643T {
        try {
            byte[] bArr = this.f29468d;
            int i11 = this.f29470f;
            int i12 = i11 + 1;
            this.f29470f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f29470f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f29470f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f29470f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C8643T(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29470f), Integer.valueOf(this.f29469e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10557l(int i10, long j10) throws C8643T {
        m10564s((i10 << 3) | 1);
        m10558m(j10);
    }

    /* JADX INFO: renamed from: m */
    public final void m10558m(long j10) throws C8643T {
        try {
            byte[] bArr = this.f29468d;
            int i10 = this.f29470f;
            int i11 = i10 + 1;
            this.f29470f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f29470f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f29470f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f29470f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f29470f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f29470f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f29470f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f29470f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C8643T(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29470f), Integer.valueOf(this.f29469e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m10559n(int i10, int i11) throws C8643T {
        m10564s(i10 << 3);
        m10560o(i11);
    }

    /* JADX INFO: renamed from: o */
    public final void m10560o(int i10) throws C8643T {
        if (i10 >= 0) {
            m10564s(i10);
        } else {
            m10566u(i10);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m10561p(int i10, String str) throws C8643T {
        m10564s((i10 << 3) | 2);
        int i11 = this.f29470f;
        try {
            int iM10605d = AbstractC8645U.m10605d(str.length() * 3);
            int iM10605d2 = AbstractC8645U.m10605d(str.length());
            int i12 = this.f29469e;
            byte[] bArr = this.f29468d;
            if (iM10605d2 != iM10605d) {
                m10564s(C8716t1.m10711c(str));
                int i13 = this.f29470f;
                this.f29470f = C8716t1.m10710b(str, bArr, i13, i12 - i13);
            } else {
                int i14 = i11 + iM10605d2;
                this.f29470f = i14;
                int iM10710b = C8716t1.m10710b(str, bArr, i14, i12 - i14);
                this.f29470f = i11;
                m10564s((iM10710b - i11) - iM10605d2);
                this.f29470f = iM10710b;
            }
        } catch (C8713s1 e10) {
            this.f29470f = i11;
            AbstractC8645U.f29477b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(C8694m0.f29529a);
            try {
                int length = bytes.length;
                m10564s(length);
                m10552g(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new C8643T(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new C8643T(e12);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10562q(int i10, int i11) {
        m10564s((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: r */
    public final void m10563r(int i10, int i11) {
        m10564s(i10 << 3);
        m10564s(i11);
    }

    /* JADX INFO: renamed from: s */
    public final void m10564s(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f29468d;
            if (i11 == 0) {
                int i12 = this.f29470f;
                this.f29470f = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f29470f;
                    this.f29470f = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C8643T(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29470f), Integer.valueOf(this.f29469e), 1), e10);
                }
            }
            throw new C8643T(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29470f), Integer.valueOf(this.f29469e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m10565t(int i10, long j10) {
        m10564s(i10 << 3);
        m10566u(j10);
    }

    /* JADX INFO: renamed from: u */
    public final void m10566u(long j10) throws C8643T {
        boolean z10 = AbstractC8645U.f29478c;
        int i10 = this.f29469e;
        byte[] bArr = this.f29468d;
        if (z10 && i10 - this.f29470f >= 10) {
            while ((j10 & (-128)) != 0) {
                int i11 = this.f29470f;
                this.f29470f = i11 + 1;
                C8704p1.f29554c.mo10676d(bArr, C8704p1.f29557f + ((long) i11), (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i12 = this.f29470f;
            this.f29470f = i12 + 1;
            C8704p1.f29554c.mo10676d(bArr, C8704p1.f29557f + ((long) i12), (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i13 = this.f29470f;
                this.f29470f = i13 + 1;
                bArr[i13] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C8643T(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29470f), Integer.valueOf(i10), 1), e10);
            }
        }
        int i14 = this.f29470f;
        this.f29470f = i14 + 1;
        bArr[i14] = (byte) j10;
    }
}
