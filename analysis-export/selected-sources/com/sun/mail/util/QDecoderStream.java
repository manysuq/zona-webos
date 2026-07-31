package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class QDecoderStream extends QPDecoderStream {
    public QDecoderStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // com.sun.mail.util.QPDecoderStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 == 95) {
            return 32;
        }
        if (i10 != 61) {
            return i10;
        }
        this.f31286ba[0] = (byte) ((FilterInputStream) this).in.read();
        this.f31286ba[1] = (byte) ((FilterInputStream) this).in.read();
        try {
            return ASCIIUtility.parseInt(this.f31286ba, 0, 2, 16);
        } catch (NumberFormatException e10) {
            throw new DecodingException("QDecoder: Error in QP stream " + e10.getMessage());
        }
    }
}
