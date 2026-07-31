package javax.mail.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import javax.mail.internet.SharedInputStream;
import kotlin.UByte;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class SharedFileInputStream extends BufferedInputStream implements SharedInputStream {
    private static int defaultBufferSize = 2048;
    protected long bufpos;
    protected int bufsize;
    protected long datalen;

    /* JADX INFO: renamed from: in */
    protected RandomAccessFile f50072in;
    private boolean master;

    /* JADX INFO: renamed from: sf */
    private SharedFile f50073sf;
    protected long start;

    public SharedFileInputStream(File file) {
        this(file, defaultBufferSize);
    }

    private void ensureOpen() throws IOException {
        if (this.f50072in == null) {
            throw new IOException("Stream closed");
        }
    }

    private void fill() {
        if (((BufferedInputStream) this).markpos < 0) {
            ((BufferedInputStream) this).pos = 0;
            this.bufpos += (long) ((BufferedInputStream) this).count;
        } else if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).buf.length) {
            int i10 = ((BufferedInputStream) this).markpos;
            if (i10 > 0) {
                int i11 = ((BufferedInputStream) this).pos - i10;
                System.arraycopy(((BufferedInputStream) this).buf, ((BufferedInputStream) this).markpos, ((BufferedInputStream) this).buf, 0, i11);
                ((BufferedInputStream) this).pos = i11;
                this.bufpos += (long) ((BufferedInputStream) this).markpos;
                ((BufferedInputStream) this).markpos = 0;
            } else {
                int length = ((BufferedInputStream) this).buf.length;
                int i12 = ((BufferedInputStream) this).marklimit;
                if (length >= i12) {
                    ((BufferedInputStream) this).markpos = -1;
                    ((BufferedInputStream) this).pos = 0;
                    this.bufpos += (long) ((BufferedInputStream) this).count;
                } else {
                    int i13 = ((BufferedInputStream) this).pos * 2;
                    if (i13 <= i12) {
                        i12 = i13;
                    }
                    byte[] bArr = new byte[i12];
                    System.arraycopy(((BufferedInputStream) this).buf, 0, bArr, 0, ((BufferedInputStream) this).pos);
                    ((BufferedInputStream) this).buf = bArr;
                }
            }
        }
        ((BufferedInputStream) this).count = ((BufferedInputStream) this).pos;
        int length2 = ((BufferedInputStream) this).buf.length;
        int i14 = ((BufferedInputStream) this).pos;
        int i15 = length2 - i14;
        long j10 = this.bufpos;
        long j11 = this.start;
        long j12 = (j10 - j11) + ((long) i14) + ((long) i15);
        long j13 = this.datalen;
        if (j12 > j13) {
            i15 = (int) (j13 - ((j10 - j11) + ((long) i14)));
        }
        synchronized (this.f50072in) {
            try {
                this.f50072in.seek(this.bufpos + ((long) ((BufferedInputStream) this).pos));
                int i16 = this.f50072in.read(((BufferedInputStream) this).buf, ((BufferedInputStream) this).pos, i15);
                if (i16 > 0) {
                    ((BufferedInputStream) this).count = i16 + ((BufferedInputStream) this).pos;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int in_available() {
        return (int) ((this.start + this.datalen) - (this.bufpos + ((long) ((BufferedInputStream) this).count)));
    }

    private void init(SharedFile sharedFile, int i10) {
        this.f50073sf = sharedFile;
        RandomAccessFile randomAccessFileOpen = sharedFile.open();
        this.f50072in = randomAccessFileOpen;
        this.start = 0L;
        this.datalen = randomAccessFileOpen.length();
        this.bufsize = i10;
        ((BufferedInputStream) this).buf = new byte[i10];
    }

    private int read1(byte[] bArr, int i10, int i11) {
        int i12 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
        if (i12 <= 0) {
            fill();
            i12 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
            if (i12 <= 0) {
                return -1;
            }
        }
        if (i12 < i11) {
            i11 = i12;
        }
        System.arraycopy(((BufferedInputStream) this).buf, ((BufferedInputStream) this).pos, bArr, i10, i11);
        ((BufferedInputStream) this).pos += i11;
        return i11;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        ensureOpen();
        return (((BufferedInputStream) this).count - ((BufferedInputStream) this).pos) + in_available();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f50072in == null) {
            return;
        }
        try {
            if (this.master) {
                this.f50073sf.forceClose();
            } else {
                this.f50073sf.close();
            }
        } finally {
            this.f50073sf = null;
            this.f50072in = null;
            ((BufferedInputStream) this).buf = null;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    @Override // javax.mail.internet.SharedInputStream
    public long getPosition() {
        if (this.f50072in != null) {
            return (this.bufpos + ((long) ((BufferedInputStream) this).pos)) - this.start;
        }
        throw new RuntimeException("Stream closed");
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        ((BufferedInputStream) this).marklimit = i10;
        ((BufferedInputStream) this).markpos = ((BufferedInputStream) this).pos;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // javax.mail.internet.SharedInputStream
    public synchronized InputStream newStream(long j10, long j11) {
        try {
            if (this.f50072in == null) {
                throw new RuntimeException("Stream closed");
            }
            if (j10 < 0) {
                throw new IllegalArgumentException("start < 0");
            }
            if (j11 == -1) {
                j11 = this.datalen;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new SharedFileInputStream(this.f50073sf, this.start + j10, j11 - j10, this.bufsize);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        ensureOpen();
        if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).count) {
            fill();
            if (((BufferedInputStream) this).pos >= ((BufferedInputStream) this).count) {
                return -1;
            }
        }
        byte[] bArr = ((BufferedInputStream) this).buf;
        int i10 = ((BufferedInputStream) this).pos;
        ((BufferedInputStream) this).pos = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        ensureOpen();
        int i10 = ((BufferedInputStream) this).markpos;
        if (i10 < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        ((BufferedInputStream) this).pos = i10;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        ensureOpen();
        if (j10 <= 0) {
            return 0L;
        }
        long j11 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
        if (j11 <= 0) {
            fill();
            j11 = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
            if (j11 <= 0) {
                return 0L;
            }
        }
        if (j11 < j10) {
            j10 = j11;
        }
        ((BufferedInputStream) this).pos = (int) (((long) ((BufferedInputStream) this).pos) + j10);
        return j10;
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class SharedFile {
        private int cnt;

        /* JADX INFO: renamed from: in */
        private RandomAccessFile f50074in;

        public SharedFile(String str) {
            this.f50074in = new RandomAccessFile(str, "r");
        }

        public synchronized void close() {
            int i10 = this.cnt;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.cnt = i11;
                if (i11 <= 0) {
                    this.f50074in.close();
                }
            }
        }

        public void finalize() throws Throwable {
            try {
                this.f50074in.close();
            } finally {
                super.finalize();
            }
        }

        public synchronized void forceClose() {
            if (this.cnt > 0) {
                this.cnt = 0;
                this.f50074in.close();
            } else {
                try {
                    this.f50074in.close();
                } catch (IOException unused) {
                }
            }
        }

        public synchronized RandomAccessFile open() {
            this.cnt++;
            return this.f50074in;
        }

        public SharedFile(File file) {
            this.f50074in = new RandomAccessFile(file, "r");
        }
    }

    public SharedFileInputStream(String str) {
        this(str, defaultBufferSize);
    }

    public SharedFileInputStream(File file, int i10) {
        super(null);
        this.start = 0L;
        this.master = true;
        if (i10 > 0) {
            init(new SharedFile(file), i10);
            return;
        }
        throw new IllegalArgumentException("Buffer size <= 0");
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        ensureOpen();
        int i12 = i10 + i11;
        if ((i10 | i11 | i12 | (bArr.length - i12)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int i13 = read1(bArr, i10, i11);
        if (i13 <= 0) {
            return i13;
        }
        while (i13 < i11) {
            int i14 = read1(bArr, i10 + i13, i11 - i13);
            if (i14 <= 0) {
                break;
            }
            i13 += i14;
        }
        return i13;
    }

    public SharedFileInputStream(String str, int i10) {
        super(null);
        this.start = 0L;
        this.master = true;
        if (i10 > 0) {
            init(new SharedFile(str), i10);
            return;
        }
        throw new IllegalArgumentException("Buffer size <= 0");
    }

    private SharedFileInputStream(SharedFile sharedFile, long j10, long j11, int i10) {
        super(null);
        this.start = 0L;
        this.master = false;
        this.f50073sf = sharedFile;
        this.f50072in = sharedFile.open();
        this.start = j10;
        this.bufpos = j10;
        this.datalen = j11;
        this.bufsize = i10;
        ((BufferedInputStream) this).buf = new byte[i10];
    }
}
