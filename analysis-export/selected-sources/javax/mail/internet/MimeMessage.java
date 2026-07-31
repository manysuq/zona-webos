package javax.mail.internet;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.MessageRemovedIOException;
import com.sun.mail.util.MimeUtil;
import com.sun.mail.util.PropUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.util.SharedByteArrayInputStream;
import kotlin.p659io.ConstantsKt;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class MimeMessage extends Message implements MimePart {
    private boolean allowutf8;
    protected Object cachedContent;
    protected byte[] content;
    protected InputStream contentStream;

    /* JADX INFO: renamed from: dh */
    protected DataHandler f50061dh;
    protected Flags flags;
    protected InternetHeaders headers;
    protected boolean modified;
    protected boolean saved;
    private boolean strict;
    private static final MailDateFormat mailDateFormat = new MailDateFormat();
    private static final Flags answeredFlag = new Flags(Flags.Flag.ANSWERED);

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class RecipientType extends Message.RecipientType {
        public static final RecipientType NEWSGROUPS = new RecipientType("Newsgroups");
        private static final long serialVersionUID = -5468290701714395543L;

        public RecipientType(String str) {
            super(str);
        }

        @Override // javax.mail.Message.RecipientType
        public Object readResolve() {
            return this.type.equals("Newsgroups") ? NEWSGROUPS : super.readResolve();
        }
    }

    public MimeMessage(Session session) {
        super(session);
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        this.modified = true;
        this.headers = new InternetHeaders();
        this.flags = new Flags();
        initStrict();
    }

    private void addAddressHeader(String str, Address[] addressArr) {
        if (addressArr == null || addressArr.length == 0) {
            return;
        }
        Address[] addressHeader = getAddressHeader(str);
        if (addressHeader != null && addressHeader.length != 0) {
            Address[] addressArr2 = new Address[addressHeader.length + addressArr.length];
            System.arraycopy(addressHeader, 0, addressArr2, 0, addressHeader.length);
            System.arraycopy(addressArr, 0, addressArr2, addressHeader.length, addressArr.length);
            addressArr = addressArr2;
        }
        String unicodeString = this.allowutf8 ? InternetAddress.toUnicodeString(addressArr, str.length() + 2) : InternetAddress.toString(addressArr, str.length() + 2);
        if (unicodeString == null) {
            return;
        }
        setHeader(str, unicodeString);
    }

    private Address[] eliminateDuplicates(List<Address> list, Address[] addressArr) {
        boolean z10;
        if (addressArr == null) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < addressArr.length; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= list.size()) {
                    z10 = false;
                    break;
                }
                if (((InternetAddress) list.get(i12)).equals(addressArr[i11])) {
                    i10++;
                    addressArr[i11] = null;
                    z10 = true;
                    break;
                }
                i12++;
            }
            if (!z10) {
                list.add(addressArr[i11]);
            }
        }
        if (i10 == 0) {
            return addressArr;
        }
        Address[] addressArr2 = addressArr instanceof InternetAddress[] ? new InternetAddress[addressArr.length - i10] : new Address[addressArr.length - i10];
        int i13 = 0;
        for (Address address : addressArr) {
            if (address != null) {
                addressArr2[i13] = address;
                i13++;
            }
        }
        return addressArr2;
    }

    private Address[] getAddressHeader(String str) {
        String header = getHeader(str, StringUtils.COMMA);
        if (header == null) {
            return null;
        }
        return InternetAddress.parseHeader(header, this.strict);
    }

    private String getHeaderName(Message.RecipientType recipientType) throws MessagingException {
        if (recipientType == Message.RecipientType.f50056TO) {
            return "To";
        }
        if (recipientType == Message.RecipientType.f50055CC) {
            return "Cc";
        }
        if (recipientType == Message.RecipientType.BCC) {
            return "Bcc";
        }
        if (recipientType == RecipientType.NEWSGROUPS) {
            return "Newsgroups";
        }
        throw new MessagingException("Invalid Recipient Type");
    }

    private void initStrict() {
        Session session = this.session;
        if (session != null) {
            Properties properties = session.getProperties();
            this.strict = PropUtil.getBooleanProperty(properties, "mail.mime.address.strict", true);
            this.allowutf8 = PropUtil.getBooleanProperty(properties, "mail.mime.allowutf8", false);
        }
    }

    private void setAddressHeader(String str, Address[] addressArr) {
        String unicodeString = this.allowutf8 ? InternetAddress.toUnicodeString(addressArr, str.length() + 2) : InternetAddress.toString(addressArr, str.length() + 2);
        if (unicodeString == null) {
            removeHeader(str);
        } else {
            setHeader(str, unicodeString);
        }
    }

    @Override // javax.mail.Message
    public void addFrom(Address[] addressArr) {
        addAddressHeader("From", addressArr);
    }

    @Override // javax.mail.Part
    public void addHeader(String str, String str2) {
        this.headers.addHeader(str, str2);
    }

    public void addHeaderLine(String str) {
        this.headers.addHeaderLine(str);
    }

    @Override // javax.mail.Message
    public void addRecipients(Message.RecipientType recipientType, Address[] addressArr) {
        if (recipientType != RecipientType.NEWSGROUPS) {
            addAddressHeader(getHeaderName(recipientType), addressArr);
            return;
        }
        String string = NewsAddress.toString(addressArr);
        if (string != null) {
            addHeader("Newsgroups", string);
        }
    }

    public InternetHeaders createInternetHeaders(InputStream inputStream) {
        return new InternetHeaders(inputStream, this.allowutf8);
    }

    public MimeMessage createMimeMessage(Session session) {
        return new MimeMessage(session);
    }

    public Enumeration<String> getAllHeaderLines() {
        return this.headers.getAllHeaderLines();
    }

    @Override // javax.mail.Part
    public Enumeration<Header> getAllHeaders() {
        return this.headers.getAllHeaders();
    }

    @Override // javax.mail.Message
    public Address[] getAllRecipients() {
        Address[] allRecipients = super.getAllRecipients();
        Address[] recipients = getRecipients(RecipientType.NEWSGROUPS);
        if (recipients == null) {
            return allRecipients;
        }
        if (allRecipients == null) {
            return recipients;
        }
        Address[] addressArr = new Address[allRecipients.length + recipients.length];
        System.arraycopy(allRecipients, 0, addressArr, 0, allRecipients.length);
        System.arraycopy(recipients, 0, addressArr, allRecipients.length, recipients.length);
        return addressArr;
    }

    @Override // javax.mail.Part
    public Object getContent() throws FolderClosedException, MessageRemovedException {
        Object obj = this.cachedContent;
        if (obj != null) {
            return obj;
        }
        try {
            Object content = getDataHandler().getContent();
            if (MimeBodyPart.cacheMultipart && (((content instanceof Multipart) || (content instanceof Message)) && (this.content != null || this.contentStream != null))) {
                this.cachedContent = content;
                if (content instanceof MimeMultipart) {
                    ((MimeMultipart) content).parse();
                }
            }
            return content;
        } catch (FolderClosedIOException e10) {
            throw new FolderClosedException(e10.getFolder(), e10.getMessage());
        } catch (MessageRemovedIOException e11) {
            throw new MessageRemovedException(e11.getMessage());
        }
    }

    public String getContentID() {
        return getHeader("Content-Id", null);
    }

    public String[] getContentLanguage() {
        return MimeBodyPart.getContentLanguage(this);
    }

    public String getContentMD5() {
        return getHeader("Content-MD5", null);
    }

    public InputStream getContentStream() throws MessagingException {
        Closeable closeable = this.contentStream;
        if (closeable != null) {
            return ((SharedInputStream) closeable).newStream(0L, -1L);
        }
        if (this.content != null) {
            return new SharedByteArrayInputStream(this.content);
        }
        throw new MessagingException("No MimeMessage content");
    }

    @Override // javax.mail.Part
    public String getContentType() {
        String strCleanContentType = MimeUtil.cleanContentType(this, getHeader("Content-Type", null));
        return strCleanContentType == null ? "text/plain" : strCleanContentType;
    }

    @Override // javax.mail.Part
    public synchronized DataHandler getDataHandler() {
        try {
            if (this.f50061dh == null) {
                this.f50061dh = new MimeBodyPart.MimePartDataHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f50061dh;
    }

    @Override // javax.mail.Part
    public String getDescription() {
        return MimeBodyPart.getDescription(this);
    }

    @Override // javax.mail.Part
    public String getDisposition() {
        return MimeBodyPart.getDisposition(this);
    }

    public String getEncoding() {
        return MimeBodyPart.getEncoding(this);
    }

    @Override // javax.mail.Part
    public String getFileName() {
        return MimeBodyPart.getFileName(this);
    }

    @Override // javax.mail.Message
    public synchronized Flags getFlags() {
        return (Flags) this.flags.clone();
    }

    @Override // javax.mail.Message
    public Address[] getFrom() {
        Address[] addressHeader = getAddressHeader("From");
        return addressHeader == null ? getAddressHeader("Sender") : addressHeader;
    }

    @Override // javax.mail.Part
    public String[] getHeader(String str) {
        return this.headers.getHeader(str);
    }

    @Override // javax.mail.Part
    public InputStream getInputStream() {
        return getDataHandler().getInputStream();
    }

    @Override // javax.mail.Part
    public int getLineCount() {
        return -1;
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) {
        return this.headers.getMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.Part
    public Enumeration<Header> getMatchingHeaders(String[] strArr) {
        return this.headers.getMatchingHeaders(strArr);
    }

    public String getMessageID() {
        return getHeader("Message-ID", null);
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) {
        return this.headers.getNonMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.Part
    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) {
        return this.headers.getNonMatchingHeaders(strArr);
    }

    public InputStream getRawInputStream() {
        return getContentStream();
    }

    @Override // javax.mail.Message
    public Date getReceivedDate() {
        return null;
    }

    @Override // javax.mail.Message
    public Address[] getRecipients(Message.RecipientType recipientType) {
        if (recipientType != RecipientType.NEWSGROUPS) {
            return getAddressHeader(getHeaderName(recipientType));
        }
        String header = getHeader("Newsgroups", StringUtils.COMMA);
        if (header == null) {
            return null;
        }
        return NewsAddress.parse(header);
    }

    @Override // javax.mail.Message
    public Address[] getReplyTo() {
        Address[] addressHeader = getAddressHeader("Reply-To");
        return (addressHeader == null || addressHeader.length == 0) ? getFrom() : addressHeader;
    }

    public Address getSender() {
        Address[] addressHeader = getAddressHeader("Sender");
        if (addressHeader == null || addressHeader.length == 0) {
            return null;
        }
        return addressHeader[0];
    }

    @Override // javax.mail.Message
    public Date getSentDate() {
        Date date;
        String header = getHeader("Date", null);
        if (header != null) {
            try {
                MailDateFormat mailDateFormat2 = mailDateFormat;
                synchronized (mailDateFormat2) {
                    date = mailDateFormat2.parse(header);
                }
                return date;
            } catch (java.text.ParseException unused) {
            }
        }
        return null;
    }

    @Override // javax.mail.Part
    public int getSize() {
        byte[] bArr = this.content;
        if (bArr != null) {
            return bArr.length;
        }
        InputStream inputStream = this.contentStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            int iAvailable = inputStream.available();
            if (iAvailable > 0) {
                return iAvailable;
            }
            return -1;
        } catch (IOException unused) {
            return -1;
        }
    }

    @Override // javax.mail.Message
    public String getSubject() {
        String header = getHeader("Subject", null);
        if (header == null) {
            return null;
        }
        try {
            return MimeUtility.decodeText(MimeUtility.unfold(header));
        } catch (UnsupportedEncodingException unused) {
            return header;
        }
    }

    @Override // javax.mail.Part
    public boolean isMimeType(String str) {
        return MimeBodyPart.isMimeType(this, str);
    }

    @Override // javax.mail.Message
    public synchronized boolean isSet(Flags.Flag flag) {
        return this.flags.contains(flag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parse(InputStream inputStream) throws MessagingException {
        boolean z10 = inputStream instanceof ByteArrayInputStream;
        InputStream bufferedInputStream = inputStream;
        if (!z10 && !(inputStream instanceof BufferedInputStream) && !(inputStream instanceof SharedInputStream)) {
            bufferedInputStream = inputStream;
            bufferedInputStream = inputStream;
            bufferedInputStream = new BufferedInputStream(inputStream);
        }
        bufferedInputStream = inputStream;
        bufferedInputStream = inputStream;
        bufferedInputStream = inputStream;
        this.headers = createInternetHeaders(bufferedInputStream);
        if (bufferedInputStream instanceof SharedInputStream) {
            SharedInputStream sharedInputStream = (SharedInputStream) bufferedInputStream;
            this.contentStream = sharedInputStream.newStream(sharedInputStream.getPosition(), -1L);
        } else {
            try {
                this.content = ASCIIUtility.getBytes(bufferedInputStream);
            } catch (IOException e10) {
                throw new MessagingException("IOException", e10);
            }
        }
        this.modified = false;
    }

    @Override // javax.mail.Part
    public void removeHeader(String str) {
        this.headers.removeHeader(str);
    }

    @Override // javax.mail.Message
    public Message reply(boolean z10) {
        return reply(z10, true);
    }

    @Override // javax.mail.Message
    public void saveChanges() {
        this.modified = true;
        this.saved = true;
        updateHeaders();
    }

    @Override // javax.mail.Part
    public void setContent(Object obj, String str) {
        if (obj instanceof Multipart) {
            setContent((Multipart) obj);
        } else {
            setDataHandler(new DataHandler(obj, str));
        }
    }

    public void setContentID(String str) {
        if (str == null) {
            removeHeader("Content-ID");
        } else {
            setHeader("Content-ID", str);
        }
    }

    public void setContentLanguage(String[] strArr) {
        MimeBodyPart.setContentLanguage(this, strArr);
    }

    public void setContentMD5(String str) {
        setHeader("Content-MD5", str);
    }

    @Override // javax.mail.Part
    public synchronized void setDataHandler(DataHandler dataHandler) {
        this.f50061dh = dataHandler;
        this.cachedContent = null;
        MimeBodyPart.invalidateContentHeaders(this);
    }

    @Override // javax.mail.Part
    public void setDescription(String str) throws MessagingException {
        setDescription(str, null);
    }

    @Override // javax.mail.Part
    public void setDisposition(String str) {
        MimeBodyPart.setDisposition(this, str);
    }

    @Override // javax.mail.Part
    public void setFileName(String str) throws MessagingException {
        MimeBodyPart.setFileName(this, str);
    }

    @Override // javax.mail.Message
    public synchronized void setFlags(Flags flags, boolean z10) {
        try {
            if (z10) {
                this.flags.add(flags);
            } else {
                this.flags.remove(flags);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.mail.Message
    public void setFrom(Address address) {
        if (address == null) {
            removeHeader("From");
        } else {
            setAddressHeader("From", new Address[]{address});
        }
    }

    @Override // javax.mail.Part
    public void setHeader(String str, String str2) {
        this.headers.setHeader(str, str2);
    }

    @Override // javax.mail.Message
    public void setRecipients(Message.RecipientType recipientType, Address[] addressArr) {
        if (recipientType != RecipientType.NEWSGROUPS) {
            setAddressHeader(getHeaderName(recipientType), addressArr);
        } else if (addressArr == null || addressArr.length == 0) {
            removeHeader("Newsgroups");
        } else {
            setHeader("Newsgroups", NewsAddress.toString(addressArr));
        }
    }

    @Override // javax.mail.Message
    public void setReplyTo(Address[] addressArr) {
        setAddressHeader("Reply-To", addressArr);
    }

    public void setSender(Address address) {
        if (address == null) {
            removeHeader("Sender");
        } else {
            setAddressHeader("Sender", new Address[]{address});
        }
    }

    @Override // javax.mail.Message
    public void setSentDate(Date date) {
        if (date == null) {
            removeHeader("Date");
            return;
        }
        MailDateFormat mailDateFormat2 = mailDateFormat;
        synchronized (mailDateFormat2) {
            setHeader("Date", mailDateFormat2.format(date));
        }
    }

    @Override // javax.mail.Message
    public void setSubject(String str) throws MessagingException {
        setSubject(str, null);
    }

    @Override // javax.mail.Part, javax.mail.internet.MimePart
    public void setText(String str) {
        setText(str, null);
    }

    public synchronized void updateHeaders() {
        try {
            MimeBodyPart.updateHeaders(this);
            setHeader("MIME-Version", "1.0");
            if (getHeader("Date") == null) {
                setSentDate(new Date());
            }
            updateMessageID();
            Object obj = this.cachedContent;
            if (obj != null) {
                this.f50061dh = new DataHandler(obj, getContentType());
                this.cachedContent = null;
                this.content = null;
                InputStream inputStream = this.contentStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.contentStream = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void updateMessageID() {
        setHeader("Message-ID", "<" + UniqueValue.getUniqueMessageIDValue(this.session) + ">");
    }

    @Override // javax.mail.Part
    public void writeTo(OutputStream outputStream) throws Throwable {
        writeTo(outputStream, null);
    }

    public String getHeader(String str, String str2) {
        return this.headers.getHeader(str, str2);
    }

    public Message reply(boolean z10, boolean z11) {
        MimeMessage mimeMessageCreateMimeMessage = createMimeMessage(this.session);
        String header = getHeader("Subject", null);
        if (header != null) {
            if (!header.regionMatches(true, 0, "Re: ", 0, 4)) {
                header = "Re: ".concat(header);
            }
            mimeMessageCreateMimeMessage.setHeader("Subject", header);
        }
        Address[] replyTo = getReplyTo();
        Message.RecipientType recipientType = Message.RecipientType.f50056TO;
        mimeMessageCreateMimeMessage.setRecipients(recipientType, replyTo);
        if (z10) {
            ArrayList arrayList = new ArrayList();
            InternetAddress localAddress = InternetAddress.getLocalAddress(this.session);
            if (localAddress != null) {
                arrayList.add(localAddress);
            }
            Session session = this.session;
            String property = session != null ? session.getProperty("mail.alternates") : null;
            if (property != null) {
                eliminateDuplicates(arrayList, InternetAddress.parse(property, false));
            }
            Session session2 = this.session;
            boolean booleanProperty = session2 != null ? PropUtil.getBooleanProperty(session2.getProperties(), "mail.replyallcc", false) : false;
            eliminateDuplicates(arrayList, replyTo);
            Address[] addressArrEliminateDuplicates = eliminateDuplicates(arrayList, getRecipients(recipientType));
            if (addressArrEliminateDuplicates != null && addressArrEliminateDuplicates.length > 0) {
                if (booleanProperty) {
                    mimeMessageCreateMimeMessage.addRecipients(Message.RecipientType.f50055CC, addressArrEliminateDuplicates);
                } else {
                    mimeMessageCreateMimeMessage.addRecipients(recipientType, addressArrEliminateDuplicates);
                }
            }
            Message.RecipientType recipientType2 = Message.RecipientType.f50055CC;
            Address[] addressArrEliminateDuplicates2 = eliminateDuplicates(arrayList, getRecipients(recipientType2));
            if (addressArrEliminateDuplicates2 != null && addressArrEliminateDuplicates2.length > 0) {
                mimeMessageCreateMimeMessage.addRecipients(recipientType2, addressArrEliminateDuplicates2);
            }
            Message.RecipientType recipientType3 = RecipientType.NEWSGROUPS;
            Address[] recipients = getRecipients(recipientType3);
            if (recipients != null && recipients.length > 0) {
                mimeMessageCreateMimeMessage.setRecipients(recipientType3, recipients);
            }
        }
        String header2 = getHeader("Message-Id", null);
        if (header2 != null) {
            mimeMessageCreateMimeMessage.setHeader("In-Reply-To", header2);
        }
        String header3 = getHeader("References", " ");
        if (header3 == null) {
            header3 = getHeader("In-Reply-To", " ");
        }
        if (header2 == null) {
            header2 = header3;
        } else if (header3 != null) {
            header2 = MimeUtility.unfold(header3) + " " + header2;
        }
        if (header2 != null) {
            mimeMessageCreateMimeMessage.setHeader("References", MimeUtility.fold(12, header2));
        }
        if (z11) {
            try {
                setFlags(answeredFlag, true);
            } catch (MessagingException unused) {
            }
        }
        return mimeMessageCreateMimeMessage;
    }

    public void setDescription(String str, String str2) throws MessagingException {
        MimeBodyPart.setDescription(this, str, str2);
    }

    public void setSubject(String str, String str2) throws MessagingException {
        if (str == null) {
            removeHeader("Subject");
            return;
        }
        try {
            setHeader("Subject", MimeUtility.fold(9, MimeUtility.encodeText(str, str2, null)));
        } catch (UnsupportedEncodingException e10) {
            throw new MessagingException("Encoding error", e10);
        }
    }

    @Override // javax.mail.internet.MimePart
    public void setText(String str, String str2) {
        MimeBodyPart.setText(this, str, str2, "plain");
    }

    public void writeTo(OutputStream outputStream, String[] strArr) throws Throwable {
        InputStream contentStream;
        if (!this.saved) {
            saveChanges();
        }
        if (this.modified) {
            MimeBodyPart.writeTo(this, outputStream, strArr);
            return;
        }
        Enumeration<String> nonMatchingHeaderLines = getNonMatchingHeaderLines(strArr);
        LineOutputStream lineOutputStream = new LineOutputStream(outputStream, this.allowutf8);
        while (nonMatchingHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln(nonMatchingHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        byte[] bArr = this.content;
        if (bArr == null) {
            byte[] bArr2 = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
            try {
                contentStream = getContentStream();
                while (true) {
                    try {
                        int i10 = contentStream.read(bArr2);
                        if (i10 <= 0) {
                            break;
                        } else {
                            outputStream.write(bArr2, 0, i10);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (contentStream != null) {
                            contentStream.close();
                        }
                        throw th;
                    }
                }
                contentStream.close();
            } catch (Throwable th2) {
                th = th2;
                contentStream = null;
            }
        } else {
            outputStream.write(bArr);
        }
        outputStream.flush();
    }

    @Override // javax.mail.internet.MimePart
    public void setText(String str, String str2, String str3) {
        MimeBodyPart.setText(this, str, str2, str3);
    }

    @Override // javax.mail.Part
    public void setContent(Multipart multipart) {
        setDataHandler(new DataHandler(multipart, multipart.getContentType()));
        multipart.setParent(this);
    }

    public void setFrom(String str) {
        if (str != null) {
            setAddressHeader("From", InternetAddress.parse(str));
        } else {
            removeHeader("From");
        }
    }

    public void addRecipients(Message.RecipientType recipientType, String str) {
        if (recipientType == RecipientType.NEWSGROUPS) {
            if (str == null || str.length() == 0) {
                return;
            }
            addHeader("Newsgroups", str);
            return;
        }
        addAddressHeader(getHeaderName(recipientType), InternetAddress.parse(str));
    }

    public void setRecipients(Message.RecipientType recipientType, String str) {
        if (recipientType != RecipientType.NEWSGROUPS) {
            setAddressHeader(getHeaderName(recipientType), str == null ? null : InternetAddress.parse(str));
        } else if (str != null && str.length() != 0) {
            setHeader("Newsgroups", str);
        } else {
            removeHeader("Newsgroups");
        }
    }

    @Override // javax.mail.Message
    public void setFrom() throws MessagingException {
        try {
            InternetAddress internetAddress_getLocalAddress = InternetAddress._getLocalAddress(this.session);
            if (internetAddress_getLocalAddress != null) {
                setFrom(internetAddress_getLocalAddress);
                return;
            }
            throw new MessagingException("No From address");
        } catch (Exception e10) {
            throw new MessagingException("No From address", e10);
        }
    }

    public MimeMessage(Session session, InputStream inputStream) throws MessagingException {
        super(session);
        this.modified = false;
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        this.flags = new Flags();
        initStrict();
        parse(inputStream);
        this.saved = true;
    }

    public MimeMessage(MimeMessage mimeMessage) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        super(mimeMessage.session);
        this.modified = false;
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        Flags flags = mimeMessage.getFlags();
        this.flags = flags;
        if (flags == null) {
            this.flags = new Flags();
        }
        int size = mimeMessage.getSize();
        if (size > 0) {
            byteArrayOutputStream = new ByteArrayOutputStream(size);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        try {
            this.strict = mimeMessage.strict;
            mimeMessage.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.close();
            SharedByteArrayInputStream sharedByteArrayInputStream = new SharedByteArrayInputStream(byteArrayOutputStream.toByteArray());
            parse(sharedByteArrayInputStream);
            sharedByteArrayInputStream.close();
            this.saved = true;
        } catch (IOException e10) {
            throw new MessagingException("IOException while copying message", e10);
        }
    }

    public MimeMessage(Folder folder, int i10) {
        super(folder, i10);
        this.modified = false;
        this.saved = false;
        this.strict = true;
        this.allowutf8 = false;
        this.flags = new Flags();
        this.saved = true;
        initStrict();
    }

    public MimeMessage(Folder folder, InputStream inputStream, int i10) throws MessagingException {
        this(folder, i10);
        initStrict();
        parse(inputStream);
    }

    public MimeMessage(Folder folder, InternetHeaders internetHeaders, byte[] bArr, int i10) {
        this(folder, i10);
        this.headers = internetHeaders;
        this.content = bArr;
        initStrict();
    }
}
