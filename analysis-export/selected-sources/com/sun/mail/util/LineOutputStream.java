package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class LineOutputStream extends FilterOutputStream {
    private static byte[] newline = {13, 10};
    private boolean allowutf8;

    public LineOutputStream(OutputStream outputStream) {
        this(outputStream, false);
    }

    public void writeln(String str) throws IOException {
        ((FilterOutputStream) this).out.write(this.allowutf8 ? str.getBytes(StandardCharsets.UTF_8) : ASCIIUtility.getBytes(str));
        ((FilterOutputStream) this).out.write(newline);
    }

    public LineOutputStream(OutputStream outputStream, boolean z10) {
        super(outputStream);
        this.allowutf8 = z10;
    }

    public void writeln() throws IOException {
        ((FilterOutputStream) this).out.write(newline);
    }
}
