package com.sun.mail.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class ASCIIUtility {
    private ASCIIUtility() {
    }

    public static byte[] getBytes(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) charArray[i10];
        }
        return bArr;
    }

    public static int parseInt(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        boolean z10;
        if (bArr == null) {
            throw new NumberFormatException("null");
        }
        if (i11 <= i10) {
            throw new NumberFormatException("illegal number");
        }
        int i15 = 0;
        if (bArr[i10] == 45) {
            i14 = i10 + 1;
            i13 = IntCompanionObject.MIN_VALUE;
            z10 = true;
        } else {
            i13 = -2147483647;
            i14 = i10;
            z10 = false;
        }
        int i16 = i13 / i12;
        if (i14 < i11) {
            int i17 = i14 + 1;
            int iDigit = Character.digit((char) bArr[i14], i12);
            if (iDigit < 0) {
                throw new NumberFormatException("illegal number: " + toString(bArr, i10, i11));
            }
            i15 = -iDigit;
            i14 = i17;
        }
        while (i14 < i11) {
            int i18 = i14 + 1;
            int iDigit2 = Character.digit((char) bArr[i14], i12);
            if (iDigit2 < 0) {
                throw new NumberFormatException("illegal number");
            }
            if (i15 < i16) {
                throw new NumberFormatException("illegal number");
            }
            int i19 = i15 * i12;
            if (i19 < i13 + iDigit2) {
                throw new NumberFormatException("illegal number");
            }
            i15 = i19 - iDigit2;
            i14 = i18;
        }
        if (!z10) {
            return -i15;
        }
        if (i14 > i10 + 1) {
            return i15;
        }
        throw new NumberFormatException("illegal number");
    }

    public static long parseLong(byte[] bArr, int i10, int i11, int i12) {
        long j10;
        int i13;
        boolean z10;
        long j11;
        if (bArr == null) {
            throw new NumberFormatException("null");
        }
        if (i11 <= i10) {
            throw new NumberFormatException("illegal number");
        }
        if (bArr[i10] == 45) {
            i13 = i10 + 1;
            j10 = Long.MIN_VALUE;
            z10 = true;
        } else {
            j10 = -9223372036854775807L;
            i13 = i10;
            z10 = false;
        }
        long j12 = i12;
        long j13 = j10 / j12;
        if (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit = Character.digit((char) bArr[i13], i12);
            if (iDigit < 0) {
                throw new NumberFormatException("illegal number: " + toString(bArr, i10, i11));
            }
            j11 = -iDigit;
            i13 = i14;
        } else {
            j11 = 0;
        }
        while (i13 < i11) {
            int i15 = i13 + 1;
            int iDigit2 = Character.digit((char) bArr[i13], i12);
            if (iDigit2 < 0) {
                throw new NumberFormatException("illegal number");
            }
            if (j11 < j13) {
                throw new NumberFormatException("illegal number");
            }
            long j14 = j11 * j12;
            long j15 = j10;
            long j16 = iDigit2;
            if (j14 < j15 + j16) {
                throw new NumberFormatException("illegal number");
            }
            j11 = j14 - j16;
            i13 = i15;
            j10 = j15;
        }
        if (!z10) {
            return -j11;
        }
        if (i13 > i10 + 1) {
            return j11;
        }
        throw new NumberFormatException("illegal number");
    }

    public static String toString(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        char[] cArr = new char[i12];
        int i13 = 0;
        while (i13 < i12) {
            cArr[i13] = (char) (bArr[i10] & UByte.MAX_VALUE);
            i13++;
            i10++;
        }
        return new String(cArr);
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, 0, bArr.length);
    }

    public static byte[] getBytes(InputStream inputStream) throws IOException {
        if (inputStream instanceof ByteArrayInputStream) {
            int iAvailable = inputStream.available();
            byte[] bArr = new byte[iAvailable];
            inputStream.read(bArr, 0, iAvailable);
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr2, 0, 1024);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String toString(ByteArrayInputStream byteArrayInputStream) {
        int iAvailable = byteArrayInputStream.available();
        char[] cArr = new char[iAvailable];
        byte[] bArr = new byte[iAvailable];
        byteArrayInputStream.read(bArr, 0, iAvailable);
        for (int i10 = 0; i10 < iAvailable; i10++) {
            cArr[i10] = (char) (bArr[i10] & UByte.MAX_VALUE);
        }
        return new String(cArr);
    }

    public static int parseInt(byte[] bArr, int i10, int i11) {
        return parseInt(bArr, i10, i11, 10);
    }

    public static long parseLong(byte[] bArr, int i10, int i11) {
        return parseLong(bArr, i10, i11, 10);
    }
}
