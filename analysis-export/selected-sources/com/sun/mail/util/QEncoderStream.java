package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.UByte;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class QEncoderStream extends QPEncoderStream {
    private static String TEXT_SPECIALS = "=_?";
    private static String WORD_SPECIALS = "=_?\"#$%&'(),.:;<>@[\\]^`{|}~";
    private String specials;

    public QEncoderStream(OutputStream outputStream, boolean z10) {
        super(outputStream, Integer.MAX_VALUE);
        this.specials = z10 ? WORD_SPECIALS : TEXT_SPECIALS;
    }

    public static int encodedLength(byte[] bArr, boolean z10) {
        String str = z10 ? WORD_SPECIALS : TEXT_SPECIALS;
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & UByte.MAX_VALUE;
            i10 = (i11 < 32 || i11 >= 127 || str.indexOf(i11) >= 0) ? i10 + 3 : i10 + 1;
        }
        return i10;
    }

    @Override // com.sun.mail.util.QPEncoderStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = i10 & 255;
        if (i11 == 32) {
            output(95, false);
        } else if (i11 < 32 || i11 >= 127 || this.specials.indexOf(i11) >= 0) {
            output(i11, true);
        } else {
            output(i11, false);
        }
    }
}
