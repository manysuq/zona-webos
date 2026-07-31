package io.appmetrica.analytics.impl;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.Ka */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13476Ka {
    /* JADX INFO: renamed from: a */
    public static String m15329a(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        if (file == null || !file.exists()) {
            bArr = null;
        } else {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    fileLockLock = channel.lock(0L, LongCompanionObject.MAX_VALUE, true);
                    try {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) file.length());
                        channel.read(byteBufferAllocate);
                        byteBufferAllocate.flip();
                        byte[] bArrArray = byteBufferAllocate.array();
                        file.getAbsolutePath();
                        m15331a(fileLockLock);
                        AbstractC14175ko.m16471a((Closeable) randomAccessFile);
                        bArr = bArrArray;
                    } catch (IOException | SecurityException unused) {
                        file.getAbsolutePath();
                        m15331a(fileLockLock);
                        AbstractC14175ko.m16471a((Closeable) randomAccessFile);
                        bArr = null;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C13615Pj c13615Pj = AbstractC14251nj.f46907a;
                            c13615Pj.getClass();
                            c13615Pj.m15497a(new C14278oj("error_during_file_reading", th));
                            file.getAbsolutePath();
                            m15331a(fileLockLock);
                            AbstractC14175ko.m16471a((Closeable) randomAccessFile);
                            bArr = null;
                        } catch (Throwable th2) {
                            file.getAbsolutePath();
                            m15331a(fileLockLock);
                            AbstractC14175ko.m16471a((Closeable) randomAccessFile);
                            throw th2;
                        }
                    }
                } catch (IOException | SecurityException unused2) {
                    fileLockLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLockLock = null;
                }
            } catch (IOException | SecurityException unused3) {
                randomAccessFile = null;
                fileLockLock = null;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
                fileLockLock = null;
            }
        }
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            String str = new String(bArr);
            C13615Pj c13615Pj2 = AbstractC14251nj.f46907a;
            c13615Pj2.getClass();
            c13615Pj2.m15497a(new C14278oj("read_share_file_with_unsupported_encoding", e10));
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15331a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15330a(String str, FileOutputStream fileOutputStream) {
        FileLock fileLockLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLockLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
            byteBufferAllocate.put(bytes);
            byteBufferAllocate.flip();
            channel.write(byteBufferAllocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            m15331a(fileLockLock);
            AbstractC14175ko.m16471a((Closeable) fileOutputStream);
        }
    }
}
