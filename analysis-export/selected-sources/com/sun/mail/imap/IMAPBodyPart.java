package com.sun.mail.imap;

import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.ReadableMime;
import com.sun.mail.util.SharedByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import javax.activation.DataHandler;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.ParameterList;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class IMAPBodyPart extends MimeBodyPart implements ReadableMime {
    private static final boolean decodeFileName = PropUtil.getBooleanSystemProperty("mail.mime.decodefilename", false);

    /* JADX INFO: renamed from: bs */
    private BODYSTRUCTURE f31268bs;
    private String description;
    private boolean headersLoaded = false;
    private IMAPMessage message;
    private String sectionId;
    private String type;

    public IMAPBodyPart(BODYSTRUCTURE bodystructure, String str, IMAPMessage iMAPMessage) {
        this.f31268bs = bodystructure;
        this.sectionId = str;
        this.message = iMAPMessage;
        this.type = new ContentType(bodystructure.type, bodystructure.subtype, bodystructure.cParams).toString();
    }

    private InputStream getHeaderStream() {
        if (!this.message.isREV1()) {
            loadHeaders();
        }
        synchronized (this.message.getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = this.message.getProtocol();
                this.message.checkExpunged();
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = protocol.peekBody(this.message.getSequenceNumber(), this.sectionId + ".MIME");
                    if (bodyPeekBody == null) {
                        throw new MessagingException("Failed to fetch headers");
                    }
                    ByteArrayInputStream byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                    if (byteArrayInputStream != null) {
                        return byteArrayInputStream;
                    }
                    throw new MessagingException("Failed to fetch headers");
                }
                SharedByteArrayOutputStream sharedByteArrayOutputStream = new SharedByteArrayOutputStream(0);
                LineOutputStream lineOutputStream = new LineOutputStream(sharedByteArrayOutputStream);
                try {
                    Enumeration<String> allHeaderLines = super.getAllHeaderLines();
                    while (allHeaderLines.hasMoreElements()) {
                        lineOutputStream.writeln(allHeaderLines.nextElement());
                    }
                    lineOutputStream.writeln();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    try {
                        lineOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
                try {
                    lineOutputStream.close();
                } catch (IOException unused3) {
                }
                return sharedByteArrayOutputStream.toStream();
            } catch (ConnectionException e10) {
                throw new FolderClosedException(this.message.getFolder(), e10.getMessage());
            } catch (ProtocolException e11) {
                throw new MessagingException(e11.getMessage(), e11);
            }
        }
    }

    private synchronized void loadHeaders() {
        try {
            if (this.headersLoaded) {
                return;
            }
            if (this.headers == null) {
                this.headers = new InternetHeaders();
            }
            synchronized (this.message.getMessageCacheLock()) {
                try {
                    try {
                        IMAPProtocol protocol = this.message.getProtocol();
                        this.message.checkExpunged();
                        if (protocol.isREV1()) {
                            BODY bodyPeekBody = protocol.peekBody(this.message.getSequenceNumber(), this.sectionId + ".MIME");
                            if (bodyPeekBody == null) {
                                throw new MessagingException("Failed to fetch headers");
                            }
                            ByteArrayInputStream byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                            if (byteArrayInputStream == null) {
                                throw new MessagingException("Failed to fetch headers");
                            }
                            this.headers.load(byteArrayInputStream);
                        } else {
                            this.headers.addHeader("Content-Type", this.type);
                            this.headers.addHeader("Content-Transfer-Encoding", this.f31268bs.encoding);
                            String str = this.f31268bs.description;
                            if (str != null) {
                                this.headers.addHeader("Content-Description", str);
                            }
                            String str2 = this.f31268bs.f31273id;
                            if (str2 != null) {
                                this.headers.addHeader("Content-ID", str2);
                            }
                            String str3 = this.f31268bs.md5;
                            if (str3 != null) {
                                this.headers.addHeader("Content-MD5", str3);
                            }
                        }
                    } catch (ConnectionException e10) {
                        throw new FolderClosedException(this.message.getFolder(), e10.getMessage());
                    } catch (ProtocolException e11) {
                        throw new MessagingException(e11.getMessage(), e11);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.headersLoaded = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void addHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public void addHeaderLine(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public Enumeration<String> getAllHeaderLines() {
        loadHeaders();
        return super.getAllHeaderLines();
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public Enumeration<Header> getAllHeaders() {
        loadHeaders();
        return super.getAllHeaders();
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public String getContentID() {
        return this.f31268bs.f31273id;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public String getContentMD5() {
        return this.f31268bs.md5;
    }

    @Override // javax.mail.internet.MimeBodyPart
    public InputStream getContentStream() throws MessageRemovedException {
        boolean peek = this.message.getPeek();
        synchronized (this.message.getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = this.message.getProtocol();
                this.message.checkExpunged();
                if (protocol.isREV1()) {
                    int i10 = -1;
                    if (this.message.getFetchBlockSize() != -1) {
                        IMAPMessage iMAPMessage = this.message;
                        String str = this.sectionId;
                        if (!iMAPMessage.ignoreBodyStructureSize()) {
                            i10 = this.f31268bs.size;
                        }
                        return new IMAPInputStream(iMAPMessage, str, i10, peek);
                    }
                }
                int sequenceNumber = this.message.getSequenceNumber();
                BODY bodyPeekBody = peek ? protocol.peekBody(sequenceNumber, this.sectionId) : protocol.fetchBody(sequenceNumber, this.sectionId);
                ByteArrayInputStream byteArrayInputStream = bodyPeekBody != null ? bodyPeekBody.getByteArrayInputStream() : null;
                if (byteArrayInputStream != null) {
                    return byteArrayInputStream;
                }
                this.message.forceCheckExpunged();
                return new ByteArrayInputStream(new byte[0]);
            } catch (ConnectionException e10) {
                throw new FolderClosedException(this.message.getFolder(), e10.getMessage());
            } catch (ProtocolException e11) {
                throw new MessagingException(e11.getMessage(), e11);
            }
        }
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String getContentType() {
        return this.type;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public synchronized DataHandler getDataHandler() {
        try {
            if (this.f50060dh == null) {
                if (this.f31268bs.isMulti()) {
                    this.f50060dh = new DataHandler(new IMAPMultipartDataSource(this, this.f31268bs.bodies, this.sectionId, this.message));
                } else if (this.f31268bs.isNested() && this.message.isREV1() && this.f31268bs.envelope != null) {
                    IMAPMessage iMAPMessage = this.message;
                    BODYSTRUCTURE bodystructure = this.f31268bs;
                    this.f50060dh = new DataHandler(new IMAPNestedMessage(iMAPMessage, bodystructure.bodies[0], bodystructure.envelope, this.sectionId), this.type);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.getDataHandler();
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
        }
        String str2 = this.f31268bs.description;
        if (str2 == null) {
            return null;
        }
        try {
            this.description = MimeUtility.decodeText(str2);
        } catch (UnsupportedEncodingException unused) {
            this.description = this.f31268bs.description;
        }
        return this.description;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String getDisposition() {
        return this.f31268bs.disposition;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public String getEncoding() {
        return this.f31268bs.encoding;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String getFileName() throws MessagingException {
        ParameterList parameterList;
        ParameterList parameterList2 = this.f31268bs.dParams;
        String str = parameterList2 != null ? parameterList2.get("filename") : null;
        if ((str == null || str.isEmpty()) && (parameterList = this.f31268bs.cParams) != null) {
            str = parameterList.get(IMAPStore.ID_NAME);
        }
        if (!decodeFileName || str == null) {
            return str;
        }
        try {
            return MimeUtility.decodeText(str);
        } catch (UnsupportedEncodingException e10) {
            throw new MessagingException("Can't decode filename", e10);
        }
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public String[] getHeader(String str) {
        loadHeaders();
        return super.getHeader(str);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public int getLineCount() {
        return this.f31268bs.lines;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) {
        loadHeaders();
        return super.getMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public Enumeration<Header> getMatchingHeaders(String[] strArr) {
        loadHeaders();
        return super.getMatchingHeaders(strArr);
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() {
        return new SequenceInputStream(getHeaderStream(), getContentStream());
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) {
        loadHeaders();
        return super.getNonMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) {
        loadHeaders();
        return super.getNonMatchingHeaders(strArr);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public int getSize() {
        return this.f31268bs.size;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void removeHeader(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setContent(Object obj, String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public void setContentMD5(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setDataHandler(DataHandler dataHandler) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart
    public void setDescription(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setDisposition(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setFileName(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void setContent(Multipart multipart) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPBodyPart is read-only");
    }

    @Override // javax.mail.internet.MimeBodyPart
    public void updateHeaders() {
    }
}
