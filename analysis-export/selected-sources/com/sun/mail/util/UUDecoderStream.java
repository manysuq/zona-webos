package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;
import org.mozilla.classfile.ByteCode;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class UUDecoderStream extends FilterInputStream {
    private byte[] buffer;
    private int bufsize;
    private boolean gotEnd;
    private boolean gotPrefix;
    private boolean ignoreErrors;
    private boolean ignoreMissingBeginEnd;
    private int index;
    private LineInputStream lin;
    private int mode;
    private String name;
    private String readAhead;

    public UUDecoderStream(InputStream inputStream) {
        super(inputStream);
        this.buffer = new byte[45];
        this.bufsize = 0;
        this.index = 0;
        this.gotPrefix = false;
        this.gotEnd = false;
        this.lin = new LineInputStream(inputStream);
        this.ignoreErrors = PropUtil.getBooleanSystemProperty("mail.mime.uudecode.ignoreerrors", false);
        this.ignoreMissingBeginEnd = PropUtil.getBooleanSystemProperty("mail.mime.uudecode.ignoremissingbeginend", false);
    }

    private boolean decode() throws DecodingException {
        if (this.gotEnd) {
            return false;
        }
        this.bufsize = 0;
        while (true) {
            String line = this.readAhead;
            if (line != null) {
                this.readAhead = null;
            } else {
                line = this.lin.readLine();
            }
            if (line == null) {
                if (!this.ignoreMissingBeginEnd) {
                    throw new DecodingException("UUDecoder: Missing end at EOF");
                }
                this.gotEnd = true;
                return false;
            }
            if (line.equals("end")) {
                this.gotEnd = true;
                return false;
            }
            if (line.length() != 0) {
                char cCharAt = line.charAt(0);
                if (cCharAt >= ' ') {
                    int i10 = (cCharAt - ' ') & 63;
                    if (i10 == 0) {
                        String line2 = this.lin.readLine();
                        if ((line2 == null || !line2.equals("end")) && !this.ignoreMissingBeginEnd) {
                            throw new DecodingException("UUDecoder: Missing End after count 0 line");
                        }
                        this.gotEnd = true;
                        return false;
                    }
                    if (line.length() >= (((i10 * 8) + 5) / 6) + 1) {
                        int i11 = 1;
                        while (this.bufsize < i10) {
                            byte bCharAt = (byte) ((line.charAt(i11) - ' ') & 63);
                            int i12 = i11 + 2;
                            byte bCharAt2 = (byte) ((line.charAt(i11 + 1) - ' ') & 63);
                            byte[] bArr = this.buffer;
                            int i13 = this.bufsize;
                            int i14 = i13 + 1;
                            this.bufsize = i14;
                            bArr[i13] = (byte) (((bCharAt << 2) & 252) | ((bCharAt2 >>> 4) & 3));
                            if (i14 < i10) {
                                i11 += 3;
                                byte bCharAt3 = (byte) ((line.charAt(i12) - ' ') & 63);
                                byte[] bArr2 = this.buffer;
                                int i15 = this.bufsize;
                                this.bufsize = i15 + 1;
                                bArr2[i15] = (byte) (((bCharAt2 << 4) & 240) | ((bCharAt3 >>> 2) & 15));
                                bCharAt2 = bCharAt3;
                            } else {
                                i11 = i12;
                            }
                            if (this.bufsize < i10) {
                                int i16 = i11 + 1;
                                byte bCharAt4 = (byte) ((line.charAt(i11) - ' ') & 63);
                                byte[] bArr3 = this.buffer;
                                int i17 = this.bufsize;
                                this.bufsize = i17 + 1;
                                bArr3[i17] = (byte) ((bCharAt4 & 63) | ((bCharAt2 << 6) & ByteCode.CHECKCAST));
                                i11 = i16;
                            }
                        }
                        return true;
                    }
                    if (!this.ignoreErrors) {
                        throw new DecodingException("UUDecoder: Short buffer error");
                    }
                } else if (!this.ignoreErrors) {
                    throw new DecodingException("UUDecoder: Buffer format error");
                }
            }
        }
    }

    private void readPrefix() throws DecodingException {
        String line;
        int iCharAt;
        if (this.gotPrefix) {
            return;
        }
        this.mode = 438;
        this.name = "encoder.buf";
        while (true) {
            line = this.lin.readLine();
            if (line != null) {
                if (!line.regionMatches(false, 0, "begin", 0, 5)) {
                    if (this.ignoreMissingBeginEnd && line.length() != 0 && ((iCharAt = ((((line.charAt(0) - ' ') & 63) * 8) + 5) / 6) == 0 || line.length() >= iCharAt + 1)) {
                        break;
                    }
                } else {
                    try {
                        this.mode = Integer.parseInt(line.substring(6, 9));
                    } catch (NumberFormatException e10) {
                        if (!this.ignoreErrors) {
                            throw new DecodingException("UUDecoder: Error in mode: " + e10.toString());
                        }
                    }
                    if (line.length() > 10) {
                        this.name = line.substring(10);
                    } else if (!this.ignoreErrors) {
                        throw new DecodingException("UUDecoder: Missing name: ".concat(line));
                    }
                    this.gotPrefix = true;
                    return;
                }
            } else {
                if (!this.ignoreMissingBeginEnd) {
                    throw new DecodingException("UUDecoder: Missing begin");
                }
                this.gotPrefix = true;
                this.gotEnd = true;
                return;
            }
        }
        this.readAhead = line;
        this.gotPrefix = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return (this.bufsize - this.index) + ((((FilterInputStream) this).in.available() * 3) / 4);
    }

    public int getMode() throws DecodingException {
        readPrefix();
        return this.mode;
    }

    public String getName() throws DecodingException {
        readPrefix();
        return this.name;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws DecodingException {
        if (this.index >= this.bufsize) {
            readPrefix();
            if (!decode()) {
                return -1;
            }
            this.index = 0;
        }
        byte[] bArr = this.buffer;
        int i10 = this.index;
        this.index = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws DecodingException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = read();
            if (i13 != -1) {
                bArr[i10 + i12] = (byte) i13;
                i12++;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    public UUDecoderStream(InputStream inputStream, boolean z10, boolean z11) {
        super(inputStream);
        this.buffer = new byte[45];
        this.bufsize = 0;
        this.index = 0;
        this.gotPrefix = false;
        this.gotEnd = false;
        this.lin = new LineInputStream(inputStream);
        this.ignoreErrors = z10;
        this.ignoreMissingBeginEnd = z11;
    }
}
