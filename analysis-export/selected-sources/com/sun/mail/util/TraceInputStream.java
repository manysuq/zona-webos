package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class TraceInputStream extends FilterInputStream {
    private boolean quote;
    private boolean trace;
    private OutputStream traceOut;

    public TraceInputStream(InputStream inputStream, MailLogger mailLogger) {
        super(inputStream);
        this.trace = false;
        this.quote = false;
        this.trace = mailLogger.isLoggable(Level.FINEST);
        this.traceOut = new LogOutputStream(mailLogger);
    }

    private final void writeByte(int i10) throws IOException {
        int i11 = i10 & 255;
        if (i11 > 127) {
            this.traceOut.write(77);
            this.traceOut.write(45);
            i11 = i10 & 127;
        }
        if (i11 == 13) {
            this.traceOut.write(92);
            this.traceOut.write(114);
            return;
        }
        if (i11 == 10) {
            this.traceOut.write(92);
            this.traceOut.write(110);
            this.traceOut.write(10);
        } else if (i11 == 9) {
            this.traceOut.write(92);
            this.traceOut.write(116);
        } else if (i11 >= 32) {
            this.traceOut.write(i11);
        } else {
            this.traceOut.write(94);
            this.traceOut.write(i11 + 64);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (this.trace && i10 != -1) {
            if (this.quote) {
                writeByte(i10);
                return i10;
            }
            this.traceOut.write(i10);
        }
        return i10;
    }

    public void setQuote(boolean z10) {
        this.quote = z10;
    }

    public void setTrace(boolean z10) {
        this.trace = z10;
    }

    public TraceInputStream(InputStream inputStream, OutputStream outputStream) {
        super(inputStream);
        this.trace = false;
        this.quote = false;
        this.traceOut = outputStream;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (this.trace && i12 != -1) {
            if (this.quote) {
                for (int i13 = 0; i13 < i12; i13++) {
                    writeByte(bArr[i10 + i13]);
                }
            } else {
                this.traceOut.write(bArr, i10, i12);
            }
        }
        return i12;
    }
}
