package com.sun.mail.imap;

import com.sun.mail.iap.Literal;
import com.sun.mail.util.CRLFOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.mail.Message;
import javax.mail.MessagingException;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
class MessageLiteral implements Literal {
    private byte[] buf;
    private Message msg;
    private int msgSize;

    public MessageLiteral(Message message, int i10) throws IOException {
        this.msgSize = -1;
        this.msg = message;
        LengthCounter lengthCounter = new LengthCounter(i10);
        CRLFOutputStream cRLFOutputStream = new CRLFOutputStream(lengthCounter);
        message.writeTo(cRLFOutputStream);
        cRLFOutputStream.flush();
        this.msgSize = lengthCounter.getSize();
        this.buf = lengthCounter.getBytes();
    }

    @Override // com.sun.mail.iap.Literal
    public int size() {
        return this.msgSize;
    }

    @Override // com.sun.mail.iap.Literal
    public void writeTo(OutputStream outputStream) throws IOException {
        try {
            byte[] bArr = this.buf;
            if (bArr != null) {
                outputStream.write(bArr, 0, this.msgSize);
            } else {
                this.msg.writeTo(new CRLFOutputStream(outputStream));
            }
        } catch (MessagingException e10) {
            throw new IOException("MessagingException while appending message: " + e10);
        }
    }
}
