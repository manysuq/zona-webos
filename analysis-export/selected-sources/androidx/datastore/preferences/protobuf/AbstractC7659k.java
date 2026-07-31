package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import p644k0.C15584G0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7659k {

    /* JADX INFO: renamed from: a */
    public int f25397a;

    /* JADX INFO: renamed from: b */
    public final int f25398b = 100;

    /* JADX INFO: renamed from: c */
    public final int f25399c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public C7661l f25400d;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a extends AbstractC7659k {

        /* JADX INFO: renamed from: e */
        public final byte[] f25401e;

        /* JADX INFO: renamed from: f */
        public int f25402f;

        /* JADX INFO: renamed from: g */
        public int f25403g;

        /* JADX INFO: renamed from: h */
        public int f25404h;

        /* JADX INFO: renamed from: i */
        public final int f25405i;

        /* JADX INFO: renamed from: j */
        public int f25406j;

        /* JADX INFO: renamed from: k */
        public int f25407k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f25401e = bArr;
            this.f25402f = i11 + i10;
            this.f25404h = i10;
            this.f25405i = i10;
        }

        /* JADX INFO: renamed from: A */
        public final long m8917A() throws C7616C {
            int i10 = this.f25404h;
            if (this.f25402f - i10 < 8) {
                throw C7616C.m8796e();
            }
            this.f25404h = i10 + 8;
            byte[] bArr = this.f25401e;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: B */
        public final int m8918B() {
            int i10;
            int i11 = this.f25404h;
            int i12 = this.f25402f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f25401e;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f25404h = i13;
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
                    this.f25404h = i14;
                    return i10;
                }
            }
            return (int) m8920D();
        }

        /* JADX INFO: renamed from: C */
        public final long m8919C() {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f25404h;
            int i11 = this.f25402f;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f25401e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f25404h = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f25404h = i13;
                    return j10;
                }
            }
            return m8920D();
        }

        /* JADX INFO: renamed from: D */
        public final long m8920D() throws C7616C {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f25404h;
                if (i11 == this.f25402f) {
                    throw C7616C.m8796e();
                }
                this.f25404h = i11 + 1;
                byte b10 = this.f25401e[i11];
                j10 |= ((long) (b10 & ByteCompanionObject.MAX_VALUE)) << i10;
                if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j10;
                }
            }
            throw C7616C.m8794c();
        }

        /* JADX INFO: renamed from: E */
        public final void m8921E() {
            int i10 = this.f25402f + this.f25403g;
            this.f25402f = i10;
            int i11 = i10 - this.f25405i;
            int i12 = this.f25407k;
            if (i11 <= i12) {
                this.f25403g = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f25403g = i13;
            this.f25402f = i10 - i13;
        }

        /* JADX INFO: renamed from: F */
        public final void m8922F(int i10) throws C7616C {
            if (i10 >= 0) {
                int i11 = this.f25402f;
                int i12 = this.f25404h;
                if (i10 <= i11 - i12) {
                    this.f25404h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C7616C.m8796e();
            }
            throw C7616C.m8795d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: a */
        public final void mo8892a(int i10) throws C7616C {
            if (this.f25406j != i10) {
                throw new C7616C("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: b */
        public final int mo8893b() {
            return this.f25404h - this.f25405i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: c */
        public final boolean mo8894c() {
            return this.f25404h == this.f25402f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: d */
        public final void mo8895d(int i10) {
            this.f25407k = i10;
            m8921E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: e */
        public final int mo8896e(int i10) {
            if (i10 < 0) {
                throw C7616C.m8795d();
            }
            int iMo8893b = mo8893b() + i10;
            if (iMo8893b < 0) {
                throw new C7616C("Failed to parse the message.");
            }
            int i11 = this.f25407k;
            if (iMo8893b > i11) {
                throw C7616C.m8796e();
            }
            this.f25407k = iMo8893b;
            m8921E();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: f */
        public final boolean mo8897f() {
            return m8919C() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: g */
        public final AbstractC7657j.f mo8898g() throws C7616C {
            byte[] bArrCopyOfRange;
            int iM8918B = m8918B();
            byte[] bArr = this.f25401e;
            if (iM8918B > 0) {
                int i10 = this.f25402f;
                int i11 = this.f25404h;
                if (iM8918B <= i10 - i11) {
                    AbstractC7657j.f fVarM8883f = AbstractC7657j.m8883f(i11, iM8918B, bArr);
                    this.f25404h += iM8918B;
                    return fVarM8883f;
                }
            }
            if (iM8918B == 0) {
                return AbstractC7657j.f25391c;
            }
            if (iM8918B > 0) {
                int i12 = this.f25402f;
                int i13 = this.f25404h;
                if (iM8918B <= i12 - i13) {
                    int i14 = iM8918B + i13;
                    this.f25404h = i14;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                } else {
                    if (iM8918B <= 0) {
                        throw C7616C.m8796e();
                    }
                    if (iM8918B == 0) {
                        throw C7616C.m8795d();
                    }
                    bArrCopyOfRange = C7615B.f25314b;
                }
            } else {
                if (iM8918B <= 0) {
                    throw C7616C.m8796e();
                }
                if (iM8918B == 0) {
                    throw C7616C.m8795d();
                }
                bArrCopyOfRange = C7615B.f25314b;
            }
            AbstractC7657j.f fVar = AbstractC7657j.f25391c;
            return new AbstractC7657j.f(bArrCopyOfRange);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: h */
        public final double mo8899h() {
            return Double.longBitsToDouble(m8917A());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: i */
        public final int mo8900i() {
            return m8918B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: j */
        public final int mo8901j() {
            return m8923z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: k */
        public final long mo8902k() {
            return m8917A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: l */
        public final float mo8903l() {
            return Float.intBitsToFloat(m8923z());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: m */
        public final int mo8904m() {
            return m8918B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: n */
        public final long mo8905n() {
            return m8919C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: o */
        public final int mo8906o() {
            return m8923z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: p */
        public final long mo8907p() {
            return m8917A();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: q */
        public final int mo8908q() {
            int iM8918B = m8918B();
            return (-(iM8918B & 1)) ^ (iM8918B >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: r */
        public final long mo8909r() {
            long jM8919C = m8919C();
            return (-(jM8919C & 1)) ^ (jM8919C >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: s */
        public final String mo8910s() throws C7616C {
            int iM8918B = m8918B();
            if (iM8918B > 0) {
                int i10 = this.f25402f;
                int i11 = this.f25404h;
                if (iM8918B <= i10 - i11) {
                    String str = new String(this.f25401e, i11, iM8918B, C7615B.f25313a);
                    this.f25404h += iM8918B;
                    return str;
                }
            }
            if (iM8918B == 0) {
                return "";
            }
            if (iM8918B < 0) {
                throw C7616C.m8795d();
            }
            throw C7616C.m8796e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: t */
        public final String mo8911t() throws C7616C {
            int iM8918B = m8918B();
            if (iM8918B > 0) {
                int i10 = this.f25402f;
                int i11 = this.f25404h;
                if (iM8918B <= i10 - i11) {
                    String strMo9122a = C7680u0.f25474a.mo9122a(i11, iM8918B, this.f25401e);
                    this.f25404h += iM8918B;
                    return strMo9122a;
                }
            }
            if (iM8918B == 0) {
                return "";
            }
            if (iM8918B <= 0) {
                throw C7616C.m8795d();
            }
            throw C7616C.m8796e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: u */
        public final int mo8912u() throws C7616C {
            if (mo8894c()) {
                this.f25406j = 0;
                return 0;
            }
            int iM8918B = m8918B();
            this.f25406j = iM8918B;
            if ((iM8918B >>> 3) != 0) {
                return iM8918B;
            }
            throw new C7616C("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: v */
        public final int mo8913v() {
            return m8918B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: w */
        public final long mo8914w() {
            return m8919C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: x */
        public final boolean mo8915x(int i10) throws C7616C {
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 != 0) {
                if (i11 == 1) {
                    m8922F(8);
                    return true;
                }
                if (i11 == 2) {
                    m8922F(m8918B());
                    return true;
                }
                if (i11 == 3) {
                    m8916y();
                    mo8892a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw C7616C.m8793b();
                }
                m8922F(4);
                return true;
            }
            int i13 = this.f25402f - this.f25404h;
            byte[] bArr = this.f25401e;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f25404h;
                    this.f25404h = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw C7616C.m8794c();
            }
            while (i12 < 10) {
                int i15 = this.f25404h;
                if (i15 == this.f25402f) {
                    throw C7616C.m8796e();
                }
                this.f25404h = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw C7616C.m8794c();
            return true;
        }

        /* JADX INFO: renamed from: z */
        public final int m8923z() throws C7616C {
            int i10 = this.f25404h;
            if (this.f25402f - i10 < 4) {
                throw C7616C.m8796e();
            }
            this.f25404h = i10 + 4;
            byte[] bArr = this.f25401e;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b extends AbstractC7659k {

        /* JADX INFO: renamed from: e */
        public final FileInputStream f25408e;

        /* JADX INFO: renamed from: f */
        public final byte[] f25409f;

        /* JADX INFO: renamed from: g */
        public int f25410g;

        /* JADX INFO: renamed from: h */
        public int f25411h;

        /* JADX INFO: renamed from: i */
        public int f25412i;

        /* JADX INFO: renamed from: j */
        public int f25413j;

        /* JADX INFO: renamed from: k */
        public int f25414k;

        /* JADX INFO: renamed from: l */
        public int f25415l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = C7615B.f25313a;
            this.f25408e = fileInputStream;
            this.f25409f = new byte[4096];
            this.f25410g = 0;
            this.f25412i = 0;
            this.f25414k = 0;
        }

        /* JADX INFO: renamed from: A */
        public final byte[] m8924A(int i10) throws IOException {
            if (i10 == 0) {
                return C7615B.f25314b;
            }
            if (i10 < 0) {
                throw C7616C.m8795d();
            }
            int i11 = this.f25414k;
            int i12 = this.f25412i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f25399c > 0) {
                throw new C7616C("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f25415l;
            if (i13 > i14) {
                m8933J((i14 - i11) - i12);
                throw C7616C.m8796e();
            }
            int i15 = this.f25410g - i12;
            int i16 = i10 - i15;
            FileInputStream fileInputStream = this.f25408e;
            if (i16 >= 4096) {
                try {
                    if (i16 > fileInputStream.available()) {
                        return null;
                    }
                } catch (C7616C e10) {
                    e10.f25315b = true;
                    throw e10;
                }
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f25409f, this.f25412i, bArr, 0, i15);
            this.f25414k += this.f25410g;
            this.f25412i = 0;
            this.f25410g = 0;
            while (i15 < i10) {
                try {
                    int i17 = fileInputStream.read(bArr, i15, i10 - i15);
                    if (i17 == -1) {
                        throw C7616C.m8796e();
                    }
                    this.f25414k += i17;
                    i15 += i17;
                } catch (C7616C e11) {
                    e11.f25315b = true;
                    throw e11;
                }
            }
            return bArr;
        }

        /* JADX INFO: renamed from: B */
        public final ArrayList m8925B(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f25408e.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw C7616C.m8796e();
                    }
                    this.f25414k += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: C */
        public final int m8926C() throws C7616C {
            int i10 = this.f25412i;
            if (this.f25410g - i10 < 4) {
                m8932I(4);
                i10 = this.f25412i;
            }
            this.f25412i = i10 + 4;
            byte[] bArr = this.f25409f;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }

        /* JADX INFO: renamed from: D */
        public final long m8927D() throws C7616C {
            int i10 = this.f25412i;
            if (this.f25410g - i10 < 8) {
                m8932I(8);
                i10 = this.f25412i;
            }
            this.f25412i = i10 + 8;
            byte[] bArr = this.f25409f;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: E */
        public final int m8928E() {
            int i10;
            int i11 = this.f25412i;
            int i12 = this.f25410g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f25409f;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f25412i = i13;
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
                    this.f25412i = i14;
                    return i10;
                }
            }
            return (int) m8930G();
        }

        /* JADX INFO: renamed from: F */
        public final long m8929F() {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f25412i;
            int i11 = this.f25410g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f25409f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f25412i = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f25412i = i13;
                    return j10;
                }
            }
            return m8930G();
        }

        /* JADX INFO: renamed from: G */
        public final long m8930G() throws C7616C {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f25412i == this.f25410g) {
                    m8932I(1);
                }
                int i11 = this.f25412i;
                this.f25412i = i11 + 1;
                byte b10 = this.f25409f[i11];
                j10 |= ((long) (b10 & ByteCompanionObject.MAX_VALUE)) << i10;
                if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j10;
                }
            }
            throw C7616C.m8794c();
        }

        /* JADX INFO: renamed from: H */
        public final void m8931H() {
            int i10 = this.f25410g + this.f25411h;
            this.f25410g = i10;
            int i11 = this.f25414k + i10;
            int i12 = this.f25415l;
            if (i11 <= i12) {
                this.f25411h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f25411h = i13;
            this.f25410g = i10 - i13;
        }

        /* JADX INFO: renamed from: I */
        public final void m8932I(int i10) throws C7616C {
            if (m8934K(i10)) {
                return;
            }
            if (i10 <= (this.f25399c - this.f25414k) - this.f25412i) {
                throw C7616C.m8796e();
            }
            throw new C7616C("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        /* JADX INFO: renamed from: J */
        public final void m8933J(int i10) throws C7616C {
            int i11 = this.f25410g;
            int i12 = this.f25412i;
            int i13 = i11 - i12;
            if (i10 <= i13 && i10 >= 0) {
                this.f25412i = i12 + i10;
                return;
            }
            FileInputStream fileInputStream = this.f25408e;
            if (i10 < 0) {
                throw C7616C.m8795d();
            }
            int i14 = this.f25414k;
            int i15 = i14 + i12;
            int i16 = i15 + i10;
            int i17 = this.f25415l;
            if (i16 > i17) {
                m8933J((i17 - i14) - i12);
                throw C7616C.m8796e();
            }
            this.f25414k = i15;
            this.f25410g = 0;
            this.f25412i = 0;
            while (i13 < i10) {
                long j10 = i10 - i13;
                try {
                    try {
                        long jSkip = fileInputStream.skip(j10);
                        if (jSkip < 0 || jSkip > j10) {
                            throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i13 += (int) jSkip;
                        }
                    } catch (C7616C e10) {
                        e10.f25315b = true;
                        throw e10;
                    }
                } catch (Throwable th) {
                    this.f25414k += i13;
                    m8931H();
                    throw th;
                }
            }
            this.f25414k += i13;
            m8931H();
            if (i13 >= i10) {
                return;
            }
            int i18 = this.f25410g;
            int i19 = i18 - this.f25412i;
            this.f25412i = i18;
            m8932I(1);
            while (true) {
                int i20 = i10 - i19;
                int i21 = this.f25410g;
                if (i20 <= i21) {
                    this.f25412i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f25412i = i21;
                    m8932I(1);
                }
            }
        }

        /* JADX INFO: renamed from: K */
        public final boolean m8934K(int i10) throws IOException {
            FileInputStream fileInputStream = this.f25408e;
            int i11 = this.f25412i;
            int i12 = i11 + i10;
            int i13 = this.f25410g;
            if (i12 <= i13) {
                throw new IllegalStateException(C15584G0.m18245a(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i14 = this.f25414k;
            int i15 = this.f25399c;
            if (i10 <= (i15 - i14) - i11 && i14 + i11 + i10 <= this.f25415l) {
                byte[] bArr = this.f25409f;
                if (i11 > 0) {
                    if (i13 > i11) {
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f25414k += i11;
                    this.f25410g -= i11;
                    this.f25412i = 0;
                }
                int i16 = this.f25410g;
                try {
                    int i17 = fileInputStream.read(bArr, i16, Math.min(bArr.length - i16, (i15 - this.f25414k) - i16));
                    if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i17 > 0) {
                        this.f25410g += i17;
                        m8931H();
                        if (this.f25410g >= i10) {
                            return true;
                        }
                        return m8934K(i10);
                    }
                } catch (C7616C e10) {
                    e10.f25315b = true;
                    throw e10;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: a */
        public final void mo8892a(int i10) throws C7616C {
            if (this.f25413j != i10) {
                throw new C7616C("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: b */
        public final int mo8893b() {
            return this.f25414k + this.f25412i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: c */
        public final boolean mo8894c() {
            return this.f25412i == this.f25410g && !m8934K(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: d */
        public final void mo8895d(int i10) {
            this.f25415l = i10;
            m8931H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: e */
        public final int mo8896e(int i10) throws C7616C {
            if (i10 < 0) {
                throw C7616C.m8795d();
            }
            int i11 = this.f25414k + this.f25412i + i10;
            if (i11 < 0) {
                throw new C7616C("Failed to parse the message.");
            }
            int i12 = this.f25415l;
            if (i11 > i12) {
                throw C7616C.m8796e();
            }
            this.f25415l = i11;
            m8931H();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: f */
        public final boolean mo8897f() {
            return m8929F() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: g */
        public final AbstractC7657j.f mo8898g() throws IOException {
            int iM8928E = m8928E();
            int i10 = this.f25410g;
            int i11 = this.f25412i;
            int i12 = i10 - i11;
            byte[] bArr = this.f25409f;
            if (iM8928E <= i12 && iM8928E > 0) {
                AbstractC7657j.f fVarM8883f = AbstractC7657j.m8883f(i11, iM8928E, bArr);
                this.f25412i += iM8928E;
                return fVarM8883f;
            }
            if (iM8928E == 0) {
                return AbstractC7657j.f25391c;
            }
            if (iM8928E < 0) {
                throw C7616C.m8795d();
            }
            byte[] bArrM8924A = m8924A(iM8928E);
            if (bArrM8924A != null) {
                return AbstractC7657j.m8883f(0, bArrM8924A.length, bArrM8924A);
            }
            int i13 = this.f25412i;
            int i14 = this.f25410g;
            int length = i14 - i13;
            this.f25414k += i14;
            this.f25412i = 0;
            this.f25410g = 0;
            ArrayList<byte[]> arrayListM8925B = m8925B(iM8928E - length);
            byte[] bArr2 = new byte[iM8928E];
            System.arraycopy(bArr, i13, bArr2, 0, length);
            for (byte[] bArr3 : arrayListM8925B) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            AbstractC7657j.f fVar = AbstractC7657j.f25391c;
            return new AbstractC7657j.f(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: h */
        public final double mo8899h() {
            return Double.longBitsToDouble(m8927D());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: i */
        public final int mo8900i() {
            return m8928E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: j */
        public final int mo8901j() {
            return m8926C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: k */
        public final long mo8902k() {
            return m8927D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: l */
        public final float mo8903l() {
            return Float.intBitsToFloat(m8926C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: m */
        public final int mo8904m() {
            return m8928E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: n */
        public final long mo8905n() {
            return m8929F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: o */
        public final int mo8906o() {
            return m8926C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: p */
        public final long mo8907p() {
            return m8927D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: q */
        public final int mo8908q() {
            int iM8928E = m8928E();
            return (-(iM8928E & 1)) ^ (iM8928E >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: r */
        public final long mo8909r() {
            long jM8929F = m8929F();
            return (-(jM8929F & 1)) ^ (jM8929F >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: s */
        public final String mo8910s() throws C7616C {
            int iM8928E = m8928E();
            byte[] bArr = this.f25409f;
            if (iM8928E > 0) {
                int i10 = this.f25410g;
                int i11 = this.f25412i;
                if (iM8928E <= i10 - i11) {
                    String str = new String(bArr, i11, iM8928E, C7615B.f25313a);
                    this.f25412i += iM8928E;
                    return str;
                }
            }
            if (iM8928E == 0) {
                return "";
            }
            if (iM8928E < 0) {
                throw C7616C.m8795d();
            }
            if (iM8928E > this.f25410g) {
                return new String(m8935z(iM8928E), C7615B.f25313a);
            }
            m8932I(iM8928E);
            String str2 = new String(bArr, this.f25412i, iM8928E, C7615B.f25313a);
            this.f25412i += iM8928E;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: t */
        public final String mo8911t() throws IOException {
            int iM8928E = m8928E();
            int i10 = this.f25412i;
            int i11 = this.f25410g;
            int i12 = i11 - i10;
            byte[] bArrM8935z = this.f25409f;
            if (iM8928E <= i12 && iM8928E > 0) {
                this.f25412i = i10 + iM8928E;
            } else {
                if (iM8928E == 0) {
                    return "";
                }
                if (iM8928E < 0) {
                    throw C7616C.m8795d();
                }
                i10 = 0;
                if (iM8928E <= i11) {
                    m8932I(iM8928E);
                    this.f25412i = iM8928E;
                } else {
                    bArrM8935z = m8935z(iM8928E);
                }
            }
            return C7680u0.f25474a.mo9122a(i10, iM8928E, bArrM8935z);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: u */
        public final int mo8912u() throws C7616C {
            if (mo8894c()) {
                this.f25413j = 0;
                return 0;
            }
            int iM8928E = m8928E();
            this.f25413j = iM8928E;
            if ((iM8928E >>> 3) != 0) {
                return iM8928E;
            }
            throw new C7616C("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: v */
        public final int mo8913v() {
            return m8928E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: w */
        public final long mo8914w() {
            return m8929F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC7659k
        /* JADX INFO: renamed from: x */
        public final boolean mo8915x(int i10) throws C7616C {
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 != 0) {
                if (i11 == 1) {
                    m8933J(8);
                    return true;
                }
                if (i11 == 2) {
                    m8933J(m8928E());
                    return true;
                }
                if (i11 == 3) {
                    m8916y();
                    mo8892a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw C7616C.m8793b();
                }
                m8933J(4);
                return true;
            }
            int i13 = this.f25410g - this.f25412i;
            byte[] bArr = this.f25409f;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f25412i;
                    this.f25412i = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw C7616C.m8794c();
            }
            while (i12 < 10) {
                if (this.f25412i == this.f25410g) {
                    m8932I(1);
                }
                int i15 = this.f25412i;
                this.f25412i = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw C7616C.m8794c();
            return true;
        }

        /* JADX INFO: renamed from: z */
        public final byte[] m8935z(int i10) throws IOException {
            byte[] bArrM8924A = m8924A(i10);
            if (bArrM8924A != null) {
                return bArrM8924A;
            }
            int i11 = this.f25412i;
            int i12 = this.f25410g;
            int length = i12 - i11;
            this.f25414k += i12;
            this.f25412i = 0;
            this.f25410g = 0;
            ArrayList<byte[]> arrayListM8925B = m8925B(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f25409f, i11, bArr, 0, length);
            for (byte[] bArr2 : arrayListM8925B) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8892a(int i10);

    /* JADX INFO: renamed from: b */
    public abstract int mo8893b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo8894c();

    /* JADX INFO: renamed from: d */
    public abstract void mo8895d(int i10);

    /* JADX INFO: renamed from: e */
    public abstract int mo8896e(int i10);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo8897f();

    /* JADX INFO: renamed from: g */
    public abstract AbstractC7657j.f mo8898g();

    /* JADX INFO: renamed from: h */
    public abstract double mo8899h();

    /* JADX INFO: renamed from: i */
    public abstract int mo8900i();

    /* JADX INFO: renamed from: j */
    public abstract int mo8901j();

    /* JADX INFO: renamed from: k */
    public abstract long mo8902k();

    /* JADX INFO: renamed from: l */
    public abstract float mo8903l();

    /* JADX INFO: renamed from: m */
    public abstract int mo8904m();

    /* JADX INFO: renamed from: n */
    public abstract long mo8905n();

    /* JADX INFO: renamed from: o */
    public abstract int mo8906o();

    /* JADX INFO: renamed from: p */
    public abstract long mo8907p();

    /* JADX INFO: renamed from: q */
    public abstract int mo8908q();

    /* JADX INFO: renamed from: r */
    public abstract long mo8909r();

    /* JADX INFO: renamed from: s */
    public abstract String mo8910s();

    /* JADX INFO: renamed from: t */
    public abstract String mo8911t();

    /* JADX INFO: renamed from: u */
    public abstract int mo8912u();

    /* JADX INFO: renamed from: v */
    public abstract int mo8913v();

    /* JADX INFO: renamed from: w */
    public abstract long mo8914w();

    /* JADX INFO: renamed from: x */
    public abstract boolean mo8915x(int i10);

    /* JADX INFO: renamed from: y */
    public final void m8916y() throws C7616C {
        boolean zMo8915x;
        do {
            int iMo8912u = mo8912u();
            if (iMo8912u == 0) {
                return;
            }
            int i10 = this.f25397a;
            if (i10 >= this.f25398b) {
                throw new C7616C("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f25397a = i10 + 1;
            zMo8915x = mo8915x(iMo8912u);
            this.f25397a--;
        } while (zMo8915x);
    }
}
