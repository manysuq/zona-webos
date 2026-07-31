package com.sun.mail.pop3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.mail.util.SharedFileInputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
class WritableSharedFile extends SharedFileInputStream {

    /* JADX INFO: renamed from: af */
    private AppendStream f31281af;
    private RandomAccessFile raf;

    public WritableSharedFile(File file) {
        super(file);
        try {
            this.raf = new RandomAccessFile(file, "rw");
        } catch (IOException unused) {
            super.close();
        }
    }

    @Override // javax.mail.util.SharedFileInputStream, java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.raf.close();
        }
    }

    public synchronized AppendStream getAppendStream() {
        AppendStream appendStream;
        if (this.f31281af != null) {
            throw new IOException("POP3 file cache only supports single threaded access");
        }
        appendStream = new AppendStream(this);
        this.f31281af = appendStream;
        return appendStream;
    }

    public RandomAccessFile getWritableFile() {
        return this.raf;
    }

    public synchronized long updateLength() {
        long length;
        length = this.f50072in.length();
        this.datalen = length;
        this.f31281af = null;
        return length;
    }
}
