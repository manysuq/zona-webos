package com.sun.mail.imap;

import com.sun.mail.iap.ByteArray;
import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.MessageRemovedIOException;
import java.io.IOException;
import java.io.InputStream;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.MessagingException;
import kotlin.UByte;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class IMAPInputStream extends InputStream {
    private static final int slop = 64;
    private int blksize;
    private byte[] buf;
    private int bufcount;
    private int bufpos;
    private boolean lastBuffer;
    private int max;
    private IMAPMessage msg;
    private boolean peek;
    private int pos = 0;
    private ByteArray readbuf;
    private String section;

    public IMAPInputStream(IMAPMessage iMAPMessage, String str, int i10, boolean z10) {
        this.msg = iMAPMessage;
        this.section = str;
        this.max = i10;
        this.peek = z10;
        this.blksize = iMAPMessage.getFetchBlockSize();
    }

    private void checkSeen() {
        if (this.peek) {
            return;
        }
        try {
            Folder folder = this.msg.getFolder();
            if (folder == null || folder.getMode() == 1) {
                return;
            }
            IMAPMessage iMAPMessage = this.msg;
            Flags.Flag flag = Flags.Flag.SEEN;
            if (iMAPMessage.isSet(flag)) {
                return;
            }
            this.msg.setFlag(flag, true);
        } catch (MessagingException unused) {
        }
    }

    private void fill() {
        int i10;
        int i11;
        BODY bodyPeekBody;
        int i12;
        ByteArray byteArray;
        if (this.lastBuffer || ((i10 = this.max) != -1 && this.pos >= i10)) {
            if (this.pos == 0) {
                checkSeen();
            }
            this.readbuf = null;
            return;
        }
        if (this.readbuf == null) {
            this.readbuf = new ByteArray(this.blksize + 64);
        }
        synchronized (this.msg.getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = this.msg.getProtocol();
                    if (this.msg.isExpunged()) {
                        throw new MessageRemovedIOException("No content for expunged message");
                    }
                    int sequenceNumber = this.msg.getSequenceNumber();
                    int i13 = this.blksize;
                    int i14 = this.max;
                    if (i14 != -1) {
                        int i15 = this.pos;
                        if (i15 + i13 > i14) {
                            i13 = i14 - i15;
                        }
                    }
                    i11 = i13;
                    bodyPeekBody = this.peek ? protocol.peekBody(sequenceNumber, this.section, this.pos, i11, this.readbuf) : protocol.fetchBody(sequenceNumber, this.section, this.pos, i11, this.readbuf);
                    i12 = 0;
                    i12 = 0;
                    if (bodyPeekBody == null || (byteArray = bodyPeekBody.getByteArray()) == null) {
                        forceCheckExpunged();
                        byteArray = new ByteArray(0);
                    }
                } catch (ProtocolException e10) {
                    forceCheckExpunged();
                    throw new IOException(e10.getMessage());
                } catch (FolderClosedException e11) {
                    throw new FolderClosedIOException(e11.getFolder(), e11.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.pos == 0) {
            checkSeen();
        }
        this.buf = byteArray.getBytes();
        this.bufpos = byteArray.getStart();
        int count = byteArray.getCount();
        int origin = bodyPeekBody != null ? bodyPeekBody.getOrigin() : this.pos;
        if (origin < 0) {
            if (this.pos == 0) {
                this.lastBuffer = count != i11;
                i12 = count;
            } else {
                this.lastBuffer = true;
            }
        } else if (origin == this.pos) {
            this.lastBuffer = count < i11;
            i12 = count;
        } else {
            this.lastBuffer = true;
        }
        this.bufcount = this.bufpos + i12;
        this.pos += i12;
    }

    private void forceCheckExpunged() throws MessageRemovedIOException {
        synchronized (this.msg.getMessageCacheLock()) {
            try {
                try {
                    this.msg.getProtocol().noop();
                } catch (ConnectionException e10) {
                    throw new FolderClosedIOException(this.msg.getFolder(), e10.getMessage());
                }
            } catch (ProtocolException unused) {
            } catch (FolderClosedException e11) {
                throw new FolderClosedIOException(e11.getFolder(), e11.getMessage());
            }
        }
        if (this.msg.isExpunged()) {
            throw new MessageRemovedIOException();
        }
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        return this.bufcount - this.bufpos;
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        if (this.bufpos >= this.bufcount) {
            fill();
            if (this.bufpos >= this.bufcount) {
                return -1;
            }
        }
        byte[] bArr = this.buf;
        int i10 = this.bufpos;
        this.bufpos = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12 = this.bufcount - this.bufpos;
        if (i12 <= 0) {
            fill();
            i12 = this.bufcount - this.bufpos;
            if (i12 <= 0) {
                return -1;
            }
        }
        if (i12 < i11) {
            i11 = i12;
        }
        System.arraycopy(this.buf, this.bufpos, bArr, i10, i11);
        this.bufpos += i11;
        return i11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
