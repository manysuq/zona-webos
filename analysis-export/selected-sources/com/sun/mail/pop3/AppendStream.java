package com.sun.mail.pop3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
class AppendStream extends OutputStream {
    private long end;
    private RandomAccessFile raf;
    private final long start;

    /* JADX INFO: renamed from: tf */
    private final WritableSharedFile f31278tf;

    public AppendStream(WritableSharedFile writableSharedFile) throws IOException {
        this.f31278tf = writableSharedFile;
        RandomAccessFile writableFile = writableSharedFile.getWritableFile();
        this.raf = writableFile;
        long length = writableFile.length();
        this.start = length;
        this.raf.seek(length);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.end = this.f31278tf.updateLength();
        this.raf = null;
    }

    public synchronized InputStream getInputStream() {
        return this.f31278tf.newStream(this.start, this.end);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.raf.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.raf.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.raf.write(bArr, i10, i11);
    }
}
