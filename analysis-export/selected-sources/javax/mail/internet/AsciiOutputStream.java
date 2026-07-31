package javax.mail.internet;

import java.io.EOFException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
class AsciiOutputStream extends OutputStream {
    private boolean breakOnNonAscii;
    private boolean checkEOL;
    private int ascii = 0;
    private int non_ascii = 0;
    private int linelen = 0;
    private boolean longLine = false;
    private boolean badEOL = false;
    private int lastb = 0;
    private int ret = 0;

    public AsciiOutputStream(boolean z10, boolean z11) {
        boolean z12 = false;
        this.checkEOL = false;
        this.breakOnNonAscii = z10;
        if (z11 && z10) {
            z12 = true;
        }
        this.checkEOL = z12;
    }

    private final void check(int i10) throws EOFException {
        int i11;
        int i12 = i10 & 255;
        if (this.checkEOL && (((i11 = this.lastb) == 13 && i12 != 10) || (i11 != 13 && i12 == 10))) {
            this.badEOL = true;
        }
        if (i12 == 13 || i12 == 10) {
            this.linelen = 0;
        } else {
            int i13 = this.linelen + 1;
            this.linelen = i13;
            if (i13 > 998) {
                this.longLine = true;
            }
        }
        if (MimeUtility.nonascii(i12)) {
            this.non_ascii++;
            if (this.breakOnNonAscii) {
                this.ret = 3;
                throw new EOFException();
            }
        } else {
            this.ascii++;
        }
        this.lastb = i12;
    }

    public int getAscii() {
        int i10 = this.ret;
        if (i10 != 0) {
            return i10;
        }
        if (this.badEOL) {
            return 3;
        }
        int i11 = this.non_ascii;
        if (i11 == 0) {
            return this.longLine ? 2 : 1;
        }
        return this.ascii > i11 ? 2 : 3;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws EOFException {
        check(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws EOFException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws EOFException {
        int i12 = i11 + i10;
        while (i10 < i12) {
            check(bArr[i10]);
            i10++;
        }
    }
}
