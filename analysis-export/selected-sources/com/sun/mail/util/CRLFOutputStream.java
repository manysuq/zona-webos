package com.sun.mail.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class CRLFOutputStream extends FilterOutputStream {
    private static final byte[] newline = {13, 10};
    protected boolean atBOL;
    protected int lastb;

    public CRLFOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.lastb = -1;
        this.atBOL = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        if (i10 == 13) {
            writeln();
        } else if (i10 != 10) {
            ((FilterOutputStream) this).out.write(i10);
            this.atBOL = false;
        } else if (this.lastb != 13) {
            writeln();
        }
        this.lastb = i10;
    }

    public void writeln() throws IOException {
        ((FilterOutputStream) this).out.write(newline);
        this.atBOL = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (b10 == 13) {
                ((FilterOutputStream) this).out.write(bArr, i13, i10 - i13);
                writeln();
            } else {
                if (b10 == 10) {
                    if (this.lastb != 13) {
                        ((FilterOutputStream) this).out.write(bArr, i13, i10 - i13);
                        writeln();
                    }
                }
                this.lastb = bArr[i10];
                i10++;
            }
            i13 = i10 + 1;
            this.lastb = bArr[i10];
            i10++;
        }
        int i14 = i12 - i13;
        if (i14 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i13, i14);
            this.atBOL = false;
        }
    }
}
