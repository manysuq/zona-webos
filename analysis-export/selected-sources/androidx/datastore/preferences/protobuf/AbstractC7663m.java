package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p516d2.C10298s0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7663m extends AbstractC7651g {

    /* JADX INFO: renamed from: c */
    public static final Logger f25423c = Logger.getLogger(AbstractC7663m.class.getName());

    /* JADX INFO: renamed from: d */
    public static final boolean f25424d = C7678t0.f25466e;

    /* JADX INFO: renamed from: b */
    public C7665n f25425b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static abstract class a extends AbstractC7663m {

        /* JADX INFO: renamed from: e */
        public final byte[] f25426e;

        /* JADX INFO: renamed from: f */
        public final int f25427f;

        /* JADX INFO: renamed from: g */
        public int f25428g;

        public a(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f25426e = bArr;
            this.f25427f = bArr.length;
        }

        /* JADX INFO: renamed from: H */
        public final void m9021H(int i10) {
            int i11 = this.f25428g;
            int i12 = i11 + 1;
            this.f25428g = i12;
            byte[] bArr = this.f25426e;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f25428g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f25428g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f25428g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        /* JADX INFO: renamed from: I */
        public final void m9022I(long j10) {
            int i10 = this.f25428g;
            int i11 = i10 + 1;
            this.f25428g = i11;
            byte[] bArr = this.f25426e;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f25428g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f25428g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f25428g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f25428g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f25428g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f25428g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f25428g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        }

        /* JADX INFO: renamed from: J */
        public final void m9023J(int i10, int i11) {
            m9024K((i10 << 3) | i11);
        }

        /* JADX INFO: renamed from: K */
        public final void m9024K(int i10) {
            boolean z10 = AbstractC7663m.f25424d;
            byte[] bArr = this.f25426e;
            if (z10) {
                while ((i10 & (-128)) != 0) {
                    int i11 = this.f25428g;
                    this.f25428g = i11 + 1;
                    C7678t0.m9084j(bArr, i11, (byte) ((i10 | 128) & 255));
                    i10 >>>= 7;
                }
                int i12 = this.f25428g;
                this.f25428g = i12 + 1;
                C7678t0.m9084j(bArr, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                int i13 = this.f25428g;
                this.f25428g = i13 + 1;
                bArr[i13] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            }
            int i14 = this.f25428g;
            this.f25428g = i14 + 1;
            bArr[i14] = (byte) i10;
        }

        /* JADX INFO: renamed from: L */
        public final void m9025L(long j10) {
            boolean z10 = AbstractC7663m.f25424d;
            byte[] bArr = this.f25426e;
            if (z10) {
                while ((j10 & (-128)) != 0) {
                    int i10 = this.f25428g;
                    this.f25428g = i10 + 1;
                    C7678t0.m9084j(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                int i11 = this.f25428g;
                this.f25428g = i11 + 1;
                C7678t0.m9084j(bArr, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                int i12 = this.f25428g;
                this.f25428g = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) | 128) & 255);
                j10 >>>= 7;
            }
            int i13 = this.f25428g;
            this.f25428g = i13 + 1;
            bArr[i13] = (byte) j10;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class b extends AbstractC7663m {

        /* JADX INFO: renamed from: e */
        public final byte[] f25429e;

        /* JADX INFO: renamed from: f */
        public final int f25430f;

        /* JADX INFO: renamed from: g */
        public int f25431g;

        public b(byte[] bArr, int i10) {
            if (((bArr.length - i10) | i10) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.f25429e = bArr;
            this.f25431g = 0;
            this.f25430f = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: A */
        public final void mo8998A(int i10, String str) throws c {
            mo9000C(i10, 2);
            mo8999B(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: B */
        public final void mo8999B(String str) throws c {
            int i10 = this.f25431g;
            try {
                int iM8996i = AbstractC7663m.m8996i(str.length() * 3);
                int iM8996i2 = AbstractC7663m.m8996i(str.length());
                int i11 = this.f25430f;
                byte[] bArr = this.f25429e;
                if (iM8996i2 != iM8996i) {
                    mo9002E(C7680u0.m9120a(str));
                    int i12 = this.f25431g;
                    this.f25431g = C7680u0.f25474a.mo9123b(str, bArr, i12, i11 - i12);
                    return;
                }
                int i13 = i10 + iM8996i2;
                this.f25431g = i13;
                int iMo9123b = C7680u0.f25474a.mo9123b(str, bArr, i13, i11 - i13);
                this.f25431g = i10;
                mo9002E((iMo9123b - i10) - iM8996i2);
                this.f25431g = iMo9123b;
            } catch (C7680u0.d e10) {
                this.f25431g = i10;
                m9005k(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: C */
        public final void mo9000C(int i10, int i11) throws c {
            mo9002E((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: D */
        public final void mo9001D(int i10, int i11) throws c {
            mo9000C(i10, 0);
            mo9002E(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: E */
        public final void mo9002E(int i10) throws c {
            while (true) {
                int i11 = i10 & (-128);
                byte[] bArr = this.f25429e;
                if (i11 == 0) {
                    int i12 = this.f25431g;
                    this.f25431g = i12 + 1;
                    bArr[i12] = (byte) i10;
                    return;
                } else {
                    try {
                        int i13 = this.f25431g;
                        this.f25431g = i13 + 1;
                        bArr[i13] = (byte) ((i10 | 128) & 255);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25431g), Integer.valueOf(this.f25430f), 1), e10);
                    }
                }
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25431g), Integer.valueOf(this.f25430f), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: F */
        public final void mo9003F(int i10, long j10) throws c {
            mo9000C(i10, 0);
            mo9004G(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: G */
        public final void mo9004G(long j10) throws c {
            boolean z10 = AbstractC7663m.f25424d;
            int i10 = this.f25430f;
            byte[] bArr = this.f25429e;
            if (z10 && i10 - this.f25431g >= 10) {
                while ((j10 & (-128)) != 0) {
                    int i11 = this.f25431g;
                    this.f25431g = i11 + 1;
                    C7678t0.m9084j(bArr, i11, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                int i12 = this.f25431g;
                this.f25431g = i12 + 1;
                C7678t0.m9084j(bArr, i12, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    int i13 = this.f25431g;
                    this.f25431g = i13 + 1;
                    bArr[i13] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25431g), Integer.valueOf(i10), 1), e10);
                }
            }
            int i14 = this.f25431g;
            this.f25431g = i14 + 1;
            bArr[i14] = (byte) j10;
        }

        /* JADX INFO: renamed from: H */
        public final void m9026H(byte[] bArr, int i10, int i11) throws c {
            try {
                System.arraycopy(bArr, i10, this.f25429e, this.f25431g, i11);
                this.f25431g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25431g), Integer.valueOf(this.f25430f), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7651g
        /* JADX INFO: renamed from: a */
        public final void mo8879a(int i10, int i11, byte[] bArr) throws c {
            m9026H(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: l */
        public final void mo9006l(byte b10) throws c {
            try {
                byte[] bArr = this.f25429e;
                int i10 = this.f25431g;
                this.f25431g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25431g), Integer.valueOf(this.f25430f), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: m */
        public final void mo9007m(int i10, boolean z10) throws c {
            mo9000C(i10, 0);
            mo9006l(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: n */
        public final void mo9008n(int i10, byte[] bArr) throws c {
            mo9002E(i10);
            m9026H(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: o */
        public final void mo9009o(int i10, AbstractC7657j abstractC7657j) throws c {
            mo9000C(i10, 2);
            mo9010p(abstractC7657j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: p */
        public final void mo9010p(AbstractC7657j abstractC7657j) throws c {
            mo9002E(abstractC7657j.size());
            abstractC7657j.mo8889k(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: q */
        public final void mo9011q(int i10, int i11) throws c {
            mo9000C(i10, 5);
            mo9012r(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: r */
        public final void mo9012r(int i10) throws c {
            try {
                byte[] bArr = this.f25429e;
                int i11 = this.f25431g;
                int i12 = i11 + 1;
                this.f25431g = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f25431g = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f25431g = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f25431g = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25431g), Integer.valueOf(this.f25430f), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: s */
        public final void mo9013s(int i10, long j10) throws c {
            mo9000C(i10, 1);
            mo9014t(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: t */
        public final void mo9014t(long j10) throws c {
            try {
                byte[] bArr = this.f25429e;
                int i10 = this.f25431g;
                int i11 = i10 + 1;
                this.f25431g = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f25431g = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f25431g = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f25431g = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f25431g = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f25431g = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f25431g = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f25431g = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f25431g), Integer.valueOf(this.f25430f), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: u */
        public final void mo9015u(int i10, int i11) throws c {
            mo9000C(i10, 0);
            mo9016v(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: v */
        public final void mo9016v(int i10) throws c {
            if (i10 >= 0) {
                mo9002E(i10);
            } else {
                mo9004G(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: w */
        public final void mo9017w(int i10, InterfaceC7633U interfaceC7633U, InterfaceC7658j0 interfaceC7658j0) throws c {
            mo9000C(i10, 2);
            mo9002E(((AbstractC7639a) interfaceC7633U).mo8871d(interfaceC7658j0));
            interfaceC7658j0.mo8853h(interfaceC7633U, this.f25425b);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: x */
        public final void mo9018x(InterfaceC7633U interfaceC7633U) throws c {
            mo9002E(interfaceC7633U.getSerializedSize());
            interfaceC7633U.mo8824b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: y */
        public final void mo9019y(int i10, InterfaceC7633U interfaceC7633U) throws c {
            mo9000C(1, 3);
            mo9001D(2, i10);
            mo9000C(3, 2);
            mo9018x(interfaceC7633U);
            mo9000C(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: z */
        public final void mo9020z(int i10, AbstractC7657j abstractC7657j) throws c {
            mo9000C(1, 3);
            mo9001D(2, i10);
            mo9009o(3, abstractC7657j);
            mo9000C(1, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class c extends IOException {
        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class d extends a {

        /* JADX INFO: renamed from: h */
        public final C10298s0 f25432h;

        public d(C10298s0 c10298s0, int i10) {
            super(i10);
            this.f25432h = c10298s0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: A */
        public final void mo8998A(int i10, String str) throws IOException {
            mo9000C(i10, 2);
            mo8999B(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: B */
        public final void mo8999B(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iM8996i = AbstractC7663m.m8996i(length);
                int i10 = iM8996i + length;
                int i11 = this.f25427f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iMo9123b = C7680u0.f25474a.mo9123b(str, bArr, 0, length);
                    mo9002E(iMo9123b);
                    m9029O(bArr, 0, iMo9123b);
                    return;
                }
                if (i10 > i11 - this.f25428g) {
                    m9027M();
                }
                int iM8996i2 = AbstractC7663m.m8996i(str.length());
                int i12 = this.f25428g;
                byte[] bArr2 = this.f25426e;
                try {
                    try {
                        if (iM8996i2 == iM8996i) {
                            int i13 = i12 + iM8996i2;
                            this.f25428g = i13;
                            int iMo9123b2 = C7680u0.f25474a.mo9123b(str, bArr2, i13, i11 - i13);
                            this.f25428g = i12;
                            m9024K((iMo9123b2 - i12) - iM8996i2);
                            this.f25428g = iMo9123b2;
                        } else {
                            int iM9120a = C7680u0.m9120a(str);
                            m9024K(iM9120a);
                            this.f25428g = C7680u0.f25474a.mo9123b(str, bArr2, this.f25428g, iM9120a);
                        }
                    } catch (C7680u0.d e10) {
                        this.f25428g = i12;
                        throw e10;
                    }
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new c(e11);
                }
            } catch (C7680u0.d e12) {
                m9005k(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: C */
        public final void mo9000C(int i10, int i11) throws IOException {
            mo9002E((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: D */
        public final void mo9001D(int i10, int i11) throws IOException {
            m9028N(20);
            m9023J(i10, 0);
            m9024K(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: E */
        public final void mo9002E(int i10) throws IOException {
            m9028N(5);
            m9024K(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: F */
        public final void mo9003F(int i10, long j10) throws IOException {
            m9028N(20);
            m9023J(i10, 0);
            m9025L(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: G */
        public final void mo9004G(long j10) throws IOException {
            m9028N(10);
            m9025L(j10);
        }

        /* JADX INFO: renamed from: M */
        public final void m9027M() throws IOException {
            this.f25432h.write(this.f25426e, 0, this.f25428g);
            this.f25428g = 0;
        }

        /* JADX INFO: renamed from: N */
        public final void m9028N(int i10) throws IOException {
            if (this.f25427f - this.f25428g < i10) {
                m9027M();
            }
        }

        /* JADX INFO: renamed from: O */
        public final void m9029O(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f25428g;
            int i13 = this.f25427f;
            int i14 = i13 - i12;
            byte[] bArr2 = this.f25426e;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f25428g += i11;
                return;
            }
            System.arraycopy(bArr, i10, bArr2, i12, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f25428g = i13;
            m9027M();
            if (i16 > i13) {
                this.f25432h.write(bArr, i15, i16);
            } else {
                System.arraycopy(bArr, i15, bArr2, 0, i16);
                this.f25428g = i16;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7651g
        /* JADX INFO: renamed from: a */
        public final void mo8879a(int i10, int i11, byte[] bArr) throws IOException {
            m9029O(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: l */
        public final void mo9006l(byte b10) throws IOException {
            if (this.f25428g == this.f25427f) {
                m9027M();
            }
            int i10 = this.f25428g;
            this.f25428g = i10 + 1;
            this.f25426e[i10] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: m */
        public final void mo9007m(int i10, boolean z10) throws IOException {
            m9028N(11);
            m9023J(i10, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            int i11 = this.f25428g;
            this.f25428g = i11 + 1;
            this.f25426e[i11] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: n */
        public final void mo9008n(int i10, byte[] bArr) throws IOException {
            mo9002E(i10);
            m9029O(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: o */
        public final void mo9009o(int i10, AbstractC7657j abstractC7657j) throws IOException {
            mo9000C(i10, 2);
            mo9010p(abstractC7657j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: p */
        public final void mo9010p(AbstractC7657j abstractC7657j) throws IOException {
            mo9002E(abstractC7657j.size());
            abstractC7657j.mo8889k(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: q */
        public final void mo9011q(int i10, int i11) throws IOException {
            m9028N(14);
            m9023J(i10, 5);
            m9021H(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: r */
        public final void mo9012r(int i10) throws IOException {
            m9028N(4);
            m9021H(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: s */
        public final void mo9013s(int i10, long j10) throws IOException {
            m9028N(18);
            m9023J(i10, 1);
            m9022I(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: t */
        public final void mo9014t(long j10) throws IOException {
            m9028N(8);
            m9022I(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: u */
        public final void mo9015u(int i10, int i11) throws IOException {
            m9028N(20);
            m9023J(i10, 0);
            if (i11 >= 0) {
                m9024K(i11);
            } else {
                m9025L(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: v */
        public final void mo9016v(int i10) throws IOException {
            if (i10 >= 0) {
                mo9002E(i10);
            } else {
                mo9004G(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: w */
        public final void mo9017w(int i10, InterfaceC7633U interfaceC7633U, InterfaceC7658j0 interfaceC7658j0) throws IOException {
            mo9000C(i10, 2);
            mo9002E(((AbstractC7639a) interfaceC7633U).mo8871d(interfaceC7658j0));
            interfaceC7658j0.mo8853h(interfaceC7633U, this.f25425b);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: x */
        public final void mo9018x(InterfaceC7633U interfaceC7633U) throws IOException {
            mo9002E(interfaceC7633U.getSerializedSize());
            interfaceC7633U.mo8824b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: y */
        public final void mo9019y(int i10, InterfaceC7633U interfaceC7633U) throws IOException {
            mo9000C(1, 3);
            mo9001D(2, i10);
            mo9000C(3, 2);
            mo9018x(interfaceC7633U);
            mo9000C(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7663m
        /* JADX INFO: renamed from: z */
        public final void mo9020z(int i10, AbstractC7657j abstractC7657j) throws IOException {
            mo9000C(1, 3);
            mo9001D(2, i10);
            mo9009o(3, abstractC7657j);
            mo9000C(1, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m8990c(int i10, AbstractC7657j abstractC7657j) {
        int iM8995h = m8995h(i10);
        int size = abstractC7657j.size();
        return m8996i(size) + size + iM8995h;
    }

    /* JADX INFO: renamed from: d */
    public static int m8991d(C7619F c7619f) {
        int serializedSize;
        if (c7619f.f25331b != null) {
            serializedSize = c7619f.f25331b.size();
        } else {
            serializedSize = c7619f.f25330a != null ? c7619f.f25330a.getSerializedSize() : 0;
        }
        return m8996i(serializedSize) + serializedSize;
    }

    /* JADX INFO: renamed from: e */
    public static int m8992e(int i10) {
        return m8996i((i10 >> 31) ^ (i10 << 1));
    }

    /* JADX INFO: renamed from: f */
    public static int m8993f(long j10) {
        return m8997j((j10 >> 63) ^ (j10 << 1));
    }

    /* JADX INFO: renamed from: g */
    public static int m8994g(String str) {
        int length;
        try {
            length = C7680u0.m9120a(str);
        } catch (C7680u0.d unused) {
            length = str.getBytes(C7615B.f25313a).length;
        }
        return m8996i(length) + length;
    }

    /* JADX INFO: renamed from: h */
    public static int m8995h(int i10) {
        return m8996i(i10 << 3);
    }

    /* JADX INFO: renamed from: i */
    public static int m8996i(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: j */
    public static int m8997j(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo8998A(int i10, String str);

    /* JADX INFO: renamed from: B */
    public abstract void mo8999B(String str);

    /* JADX INFO: renamed from: C */
    public abstract void mo9000C(int i10, int i11);

    /* JADX INFO: renamed from: D */
    public abstract void mo9001D(int i10, int i11);

    /* JADX INFO: renamed from: E */
    public abstract void mo9002E(int i10);

    /* JADX INFO: renamed from: F */
    public abstract void mo9003F(int i10, long j10);

    /* JADX INFO: renamed from: G */
    public abstract void mo9004G(long j10);

    /* JADX INFO: renamed from: k */
    public final void m9005k(String str, C7680u0.d dVar) throws c {
        f25423c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C7615B.f25313a);
        try {
            mo9002E(bytes.length);
            mo8879a(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo9006l(byte b10);

    /* JADX INFO: renamed from: m */
    public abstract void mo9007m(int i10, boolean z10);

    /* JADX INFO: renamed from: n */
    public abstract void mo9008n(int i10, byte[] bArr);

    /* JADX INFO: renamed from: o */
    public abstract void mo9009o(int i10, AbstractC7657j abstractC7657j);

    /* JADX INFO: renamed from: p */
    public abstract void mo9010p(AbstractC7657j abstractC7657j);

    /* JADX INFO: renamed from: q */
    public abstract void mo9011q(int i10, int i11);

    /* JADX INFO: renamed from: r */
    public abstract void mo9012r(int i10);

    /* JADX INFO: renamed from: s */
    public abstract void mo9013s(int i10, long j10);

    /* JADX INFO: renamed from: t */
    public abstract void mo9014t(long j10);

    /* JADX INFO: renamed from: u */
    public abstract void mo9015u(int i10, int i11);

    /* JADX INFO: renamed from: v */
    public abstract void mo9016v(int i10);

    /* JADX INFO: renamed from: w */
    public abstract void mo9017w(int i10, InterfaceC7633U interfaceC7633U, InterfaceC7658j0 interfaceC7658j0);

    /* JADX INFO: renamed from: x */
    public abstract void mo9018x(InterfaceC7633U interfaceC7633U);

    /* JADX INFO: renamed from: y */
    public abstract void mo9019y(int i10, InterfaceC7633U interfaceC7633U);

    /* JADX INFO: renamed from: z */
    public abstract void mo9020z(int i10, AbstractC7657j abstractC7657j);
}
