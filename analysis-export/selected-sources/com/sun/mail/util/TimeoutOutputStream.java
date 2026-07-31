package com.sun.mail.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
class TimeoutOutputStream extends OutputStream {

    /* JADX INFO: renamed from: b1 */
    private byte[] f31287b1;

    /* JADX INFO: renamed from: os */
    private final OutputStream f31288os;
    private final ScheduledExecutorService ses;
    private final int timeout;
    private final Callable<Object> timeoutTask = new Callable<Object>() { // from class: com.sun.mail.util.TimeoutOutputStream.1
        @Override // java.util.concurrent.Callable
        public Object call() throws IOException {
            TimeoutOutputStream.this.f31288os.close();
            return null;
        }
    };

    public TimeoutOutputStream(OutputStream outputStream, ScheduledExecutorService scheduledExecutorService, int i10) {
        this.f31288os = outputStream;
        this.ses = scheduledExecutorService;
        this.timeout = i10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31288os.close();
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) {
        try {
            if (this.f31287b1 == null) {
                this.f31287b1 = new byte[1];
            }
            byte[] bArr = this.f31287b1;
            bArr[0] = (byte) i10;
            write(bArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0) {
            if (i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
                if (i11 == 0) {
                    return;
                }
                ScheduledFuture scheduledFutureSchedule = null;
                try {
                    try {
                        int i13 = this.timeout;
                        if (i13 > 0) {
                            scheduledFutureSchedule = this.ses.schedule(this.timeoutTask, i13, TimeUnit.MILLISECONDS);
                        }
                    } catch (Throwable th) {
                        if (scheduledFutureSchedule != null) {
                            scheduledFutureSchedule.cancel(true);
                        }
                        throw th;
                    }
                } catch (RejectedExecutionException unused) {
                }
                this.f31288os.write(bArr, i10, i11);
                if (scheduledFutureSchedule != null) {
                    scheduledFutureSchedule.cancel(true);
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
