package com.sun.mail.util;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class BEncoderStream extends BASE64EncoderStream {
    public BEncoderStream(OutputStream outputStream) {
        super(outputStream, Integer.MAX_VALUE);
    }

    public static int encodedLength(byte[] bArr) {
        return ((bArr.length + 2) / 3) * 4;
    }
}
