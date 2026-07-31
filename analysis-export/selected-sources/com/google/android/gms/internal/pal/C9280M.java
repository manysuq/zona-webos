package com.google.android.gms.internal.pal;

import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.pal.M */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9280M extends AbstractC9306O {

    /* JADX INFO: renamed from: d */
    public final byte[] f30479d;

    /* JADX INFO: renamed from: e */
    public final int f30480e;

    /* JADX INFO: renamed from: f */
    public int f30481f;

    public C9280M(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.f30479d = bArr;
        this.f30481f = 0;
        this.f30480e = i10;
    }

    /* JADX INFO: renamed from: g */
    public final void m11301g(byte b10) throws C9293N {
        try {
            byte[] bArr = this.f30479d;
            int i10 = this.f30481f;
            this.f30481f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C9293N(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30481f), Integer.valueOf(this.f30480e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11302h(int i10, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f30479d, this.f30481f, i10);
            this.f30481f += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C9293N(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30481f), Integer.valueOf(this.f30480e), Integer.valueOf(i10)), e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11303i(int i10, boolean z10) throws C9293N {
        m11314t(i10 << 3);
        m11301g(z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: j */
    public final void m11304j(int i10, AbstractC9215H abstractC9215H) {
        m11314t((i10 << 3) | 2);
        m11314t(abstractC9215H.mo11119f());
        abstractC9215H.mo11155n(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m11305k(int i10, int i11) throws C9293N {
        m11314t((i10 << 3) | 5);
        m11306l(i11);
    }

    /* JADX INFO: renamed from: l */
    public final void m11306l(int i10) throws C9293N {
        try {
            byte[] bArr = this.f30479d;
            int i11 = this.f30481f;
            int i12 = i11 + 1;
            this.f30481f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f30481f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f30481f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f30481f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C9293N(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30481f), Integer.valueOf(this.f30480e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11307m(int i10, long j10) throws C9293N {
        m11314t((i10 << 3) | 1);
        m11308n(j10);
    }

    /* JADX INFO: renamed from: n */
    public final void m11308n(long j10) throws C9293N {
        try {
            byte[] bArr = this.f30479d;
            int i10 = this.f30481f;
            int i11 = i10 + 1;
            this.f30481f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f30481f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f30481f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f30481f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f30481f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f30481f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f30481f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f30481f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C9293N(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30481f), Integer.valueOf(this.f30480e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11309o(int i10, int i11) throws C9293N {
        m11314t(i10 << 3);
        m11310p(i11);
    }

    /* JADX INFO: renamed from: p */
    public final void m11310p(int i10) throws C9293N {
        if (i10 >= 0) {
            m11314t(i10);
        } else {
            m11316v(i10);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11311q(int i10, String str) throws C9293N {
        m11314t((i10 << 3) | 2);
        int i11 = this.f30481f;
        try {
            int iM11381a = AbstractC9306O.m11381a(str.length() * 3);
            int iM11381a2 = AbstractC9306O.m11381a(str.length());
            int i12 = this.f30480e;
            byte[] bArr = this.f30479d;
            if (iM11381a2 != iM11381a) {
                m11314t(C9755x1.m12081c(str));
                int i13 = this.f30481f;
                this.f30481f = C9755x1.m12080b(str, bArr, i13, i12 - i13);
            } else {
                int i14 = i11 + iM11381a2;
                this.f30481f = i14;
                int iM12080b = C9755x1.m12080b(str, bArr, i14, i12 - i14);
                this.f30481f = i11;
                m11314t((iM12080b - i11) - iM11381a2);
                this.f30481f = iM12080b;
            }
        } catch (C9742w1 e10) {
            this.f30481f = i11;
            AbstractC9306O.f30518b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(C9611m0.f30885a);
            try {
                int length = bytes.length;
                m11314t(length);
                m11302h(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new C9293N(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new C9293N(e12);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m11312r(int i10, int i11) {
        m11314t((i10 << 3) | i11);
    }

    /* JADX INFO: renamed from: s */
    public final void m11313s(int i10, int i11) {
        m11314t(i10 << 3);
        m11314t(i11);
    }

    /* JADX INFO: renamed from: t */
    public final void m11314t(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f30479d;
            if (i11 == 0) {
                int i12 = this.f30481f;
                this.f30481f = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f30481f;
                    this.f30481f = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C9293N(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30481f), Integer.valueOf(this.f30480e), 1), e10);
                }
            }
            throw new C9293N(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30481f), Integer.valueOf(this.f30480e), 1), e10);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11315u(int i10, long j10) {
        m11314t(i10 << 3);
        m11316v(j10);
    }

    /* JADX INFO: renamed from: v */
    public final void m11316v(long j10) throws C9293N {
        boolean z10 = AbstractC9306O.f30519c;
        int i10 = this.f30480e;
        byte[] bArr = this.f30479d;
        if (z10 && i10 - this.f30481f >= 10) {
            while ((j10 & (-128)) != 0) {
                int i11 = this.f30481f;
                this.f30481f = i11 + 1;
                C9703t1.f31038c.mo11968d(bArr, C9703t1.f31041f + ((long) i11), (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i12 = this.f30481f;
            this.f30481f = i12 + 1;
            C9703t1.f31038c.mo11968d(bArr, C9703t1.f31041f + ((long) i12), (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i13 = this.f30481f;
                this.f30481f = i13 + 1;
                bArr[i13] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C9293N(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f30481f), Integer.valueOf(i10), 1), e10);
            }
        }
        int i14 = this.f30481f;
        this.f30481f = i14 + 1;
        bArr[i14] = (byte) j10;
    }
}
