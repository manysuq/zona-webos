package com.sun.mail.iap;

import com.sun.mail.util.ASCIIUtility;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class ResponseInputStream {
    private static final int incrementSlop = 16;
    private static final int maxIncrement = 262144;
    private static final int minIncrement = 256;
    private BufferedInputStream bin;

    public ResponseInputStream(InputStream inputStream) {
        this.bin = new BufferedInputStream(inputStream, 2048);
    }

    public int available() {
        return this.bin.available();
    }

    public ByteArray readResponse() {
        return readResponse(null);
    }

    public ByteArray readResponse(ByteArray byteArray) throws IOException {
        if (byteArray == null) {
            byteArray = new ByteArray(new byte[128], 0, 128);
        }
        byte[] bytes = byteArray.getBytes();
        int i10 = 0;
        while (true) {
            boolean z10 = false;
            int i11 = 0;
            while (!z10 && (i11 = this.bin.read()) != -1) {
                if (i11 == 10 && i10 > 0 && bytes[i10 - 1] == 13) {
                    z10 = true;
                }
                if (i10 >= bytes.length) {
                    int length = bytes.length;
                    if (length > maxIncrement) {
                        length = maxIncrement;
                    }
                    byteArray.grow(length);
                    bytes = byteArray.getBytes();
                }
                bytes[i10] = (byte) i11;
                i10++;
            }
            if (i11 == -1) {
                throw new IOException("Connection dropped by server?");
            }
            if (i10 >= 5) {
                int i12 = i10 - 3;
                if (bytes[i12] == 125) {
                    int i13 = i10 - 4;
                    while (i13 >= 0 && bytes[i13] != 123) {
                        i13--;
                    }
                    if (i13 >= 0) {
                        try {
                            int i14 = ASCIIUtility.parseInt(bytes, i13 + 1, i12);
                            if (i14 > 0) {
                                int length2 = bytes.length - i10;
                                int i15 = i14 + 16;
                                if (i15 > length2) {
                                    int i16 = i15 - length2;
                                    if (256 > i16) {
                                        i16 = 256;
                                    }
                                    byteArray.grow(i16);
                                    bytes = byteArray.getBytes();
                                }
                                while (i14 > 0) {
                                    int i17 = this.bin.read(bytes, i10, i14);
                                    if (i17 == -1) {
                                        throw new IOException("Connection dropped by server?");
                                    }
                                    i14 -= i17;
                                    i10 += i17;
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
            byteArray.setCount(i10);
            return byteArray;
        }
    }
}
