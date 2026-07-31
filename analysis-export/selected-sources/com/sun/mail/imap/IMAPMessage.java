package com.sun.mail.imap;

import com.sun.mail.iap.ConnectionException;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.imap.protocol.BODY;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import com.sun.mail.imap.protocol.ENVELOPE;
import com.sun.mail.imap.protocol.FetchItem;
import com.sun.mail.imap.protocol.FetchResponse;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.INTERNALDATE;
import com.sun.mail.imap.protocol.Item;
import com.sun.mail.imap.protocol.MODSEQ;
import com.sun.mail.imap.protocol.RFC822DATA;
import com.sun.mail.imap.protocol.RFC822SIZE;
import com.sun.mail.imap.protocol.UID;
import com.sun.mail.util.ReadableMime;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.IllegalWriteException;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.UIDFolder;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.InternetHeaders;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import javax.mail.internet.ParameterList;
import p569g2.C11232c;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class IMAPMessage extends MimeMessage implements ReadableMime {
    static final String EnvelopeCmd = "ENVELOPE INTERNALDATE RFC822.SIZE";
    private volatile boolean bodyLoaded;

    /* JADX INFO: renamed from: bs */
    protected BODYSTRUCTURE f31269bs;
    private String description;
    protected ENVELOPE envelope;
    private volatile boolean headersLoaded;
    protected Map<String, Object> items;
    private Hashtable<String, String> loadedHeaders;
    private volatile long modseq;
    private Boolean peek;
    private Date receivedDate;
    protected String sectionId;
    private long size;
    private String subject;
    private String type;
    private volatile long uid;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class FetchProfileCondition implements Utility.Condition {
        private String[] hdrs;
        private Set<FetchItem> need = new HashSet();
        private boolean needBodyStructure;
        private boolean needEnvelope;
        private boolean needFlags;
        private boolean needHeaders;
        private boolean needMessage;
        private boolean needRDate;
        private boolean needSize;
        private boolean needUID;

        public FetchProfileCondition(FetchProfile fetchProfile, FetchItem[] fetchItemArr) {
            this.needEnvelope = false;
            this.needFlags = false;
            this.needBodyStructure = false;
            this.needUID = false;
            this.needHeaders = false;
            this.needSize = false;
            this.needMessage = false;
            this.needRDate = false;
            this.hdrs = null;
            if (fetchProfile.contains(FetchProfile.Item.ENVELOPE)) {
                this.needEnvelope = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.FLAGS)) {
                this.needFlags = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.CONTENT_INFO)) {
                this.needBodyStructure = true;
            }
            if (fetchProfile.contains(FetchProfile.Item.SIZE)) {
                this.needSize = true;
            }
            if (fetchProfile.contains(UIDFolder.FetchProfileItem.UID)) {
                this.needUID = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.HEADERS)) {
                this.needHeaders = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.SIZE)) {
                this.needSize = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.MESSAGE)) {
                this.needMessage = true;
            }
            if (fetchProfile.contains(IMAPFolder.FetchProfileItem.INTERNALDATE)) {
                this.needRDate = true;
            }
            this.hdrs = fetchProfile.getHeaderNames();
            for (int i10 = 0; i10 < fetchItemArr.length; i10++) {
                if (fetchProfile.contains(fetchItemArr[i10].getFetchProfileItem())) {
                    this.need.add(fetchItemArr[i10]);
                }
            }
        }

        @Override // com.sun.mail.imap.Utility.Condition
        public boolean test(IMAPMessage iMAPMessage) {
            if (this.needEnvelope && iMAPMessage._getEnvelope() == null && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needFlags && iMAPMessage._getFlags() == null) {
                return true;
            }
            if (this.needBodyStructure && iMAPMessage._getBodyStructure() == null && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needUID && iMAPMessage.getUID() == -1) {
                return true;
            }
            if (this.needHeaders && !iMAPMessage.areHeadersLoaded()) {
                return true;
            }
            if (this.needSize && iMAPMessage.size == -1 && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needMessage && !iMAPMessage.bodyLoaded) {
                return true;
            }
            if (this.needRDate && iMAPMessage.receivedDate == null) {
                return true;
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.hdrs;
                if (i10 >= strArr.length) {
                    for (FetchItem fetchItem : this.need) {
                        Map<String, Object> map = iMAPMessage.items;
                        if (map == null || map.get(fetchItem.getName()) == null) {
                            return true;
                        }
                    }
                    return false;
                }
                if (!iMAPMessage.isHeaderLoaded(strArr[i10])) {
                    return true;
                }
                i10++;
            }
        }
    }

    public IMAPMessage(IMAPFolder iMAPFolder, int i10) {
        super(iMAPFolder, i10);
        this.size = -1L;
        this.uid = -1L;
        this.modseq = -1L;
        this.headersLoaded = false;
        this.bodyLoaded = false;
        this.loadedHeaders = new Hashtable<>(1);
        this.flags = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BODYSTRUCTURE _getBodyStructure() {
        return this.f31269bs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ENVELOPE _getEnvelope() {
        return this.envelope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Flags _getFlags() {
        return this.flags;
    }

    private InternetAddress[] aaclone(InternetAddress[] internetAddressArr) {
        if (internetAddressArr == null) {
            return null;
        }
        return (InternetAddress[]) internetAddressArr.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean areHeadersLoaded() {
        return this.headersLoaded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isHeaderLoaded(String str) {
        if (this.headersLoaded) {
            return true;
        }
        return this.loadedHeaders.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    private synchronized void loadBODYSTRUCTURE() {
        if (this.f31269bs != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    BODYSTRUCTURE bodystructureFetchBodyStructure = protocol.fetchBodyStructure(getSequenceNumber());
                    this.f31269bs = bodystructureFetchBodyStructure;
                    if (bodystructureFetchBodyStructure == null) {
                        forceCheckExpunged();
                        throw new MessagingException("Unable to load BODYSTRUCTURE");
                    }
                } catch (ConnectionException e10) {
                    throw new FolderClosedException(this.folder, e10.getMessage());
                }
            } catch (ProtocolException e11) {
                forceCheckExpunged();
                throw new MessagingException(e11.getMessage(), e11);
            }
        }
    }

    private synchronized void loadEnvelope() {
        if (this.envelope != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    int sequenceNumber = getSequenceNumber();
                    Response[] responseArrFetch = protocol.fetch(sequenceNumber, EnvelopeCmd);
                    for (int i10 = 0; i10 < responseArrFetch.length; i10++) {
                        Response response = responseArrFetch[i10];
                        if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == sequenceNumber) {
                            FetchResponse fetchResponse = (FetchResponse) responseArrFetch[i10];
                            int itemCount = fetchResponse.getItemCount();
                            for (int i11 = 0; i11 < itemCount; i11++) {
                                Item item = fetchResponse.getItem(i11);
                                if (item instanceof ENVELOPE) {
                                    this.envelope = (ENVELOPE) item;
                                } else if (item instanceof INTERNALDATE) {
                                    this.receivedDate = ((INTERNALDATE) item).getDate();
                                } else if (item instanceof RFC822SIZE) {
                                    this.size = ((RFC822SIZE) item).size;
                                }
                            }
                        }
                    }
                    protocol.notifyResponseHandlers(responseArrFetch);
                    protocol.handleResult(responseArrFetch[responseArrFetch.length - 1]);
                } catch (ConnectionException e10) {
                    throw new FolderClosedException(this.folder, e10.getMessage());
                } catch (ProtocolException e11) {
                    forceCheckExpunged();
                    throw new MessagingException(e11.getMessage(), e11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.envelope == null) {
            throw new MessagingException("Failed to load IMAP envelope");
        }
    }

    private synchronized void loadFlags() {
        if (this.flags != null) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                Flags flagsFetchFlags = protocol.fetchFlags(getSequenceNumber());
                this.flags = flagsFetchFlags;
                if (flagsFetchFlags == null) {
                    this.flags = new Flags();
                }
            } catch (ConnectionException e10) {
                throw new FolderClosedException(this.folder, e10.getMessage());
            } catch (ProtocolException e11) {
                forceCheckExpunged();
                throw new MessagingException(e11.getMessage(), e11);
            }
        }
    }

    private synchronized void loadHeaders() {
        ByteArrayInputStream byteArrayInputStream;
        if (this.headersLoaded) {
            return;
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    byteArrayInputStream = null;
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = protocol.peekBody(getSequenceNumber(), toSection("HEADER"));
                        if (bodyPeekBody != null) {
                            byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        }
                    } else {
                        RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "HEADER");
                        if (rfc822dataFetchRFC822 != null) {
                            byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                        }
                    }
                } catch (ConnectionException e10) {
                    throw new FolderClosedException(this.folder, e10.getMessage());
                } catch (ProtocolException e11) {
                    forceCheckExpunged();
                    throw new MessagingException(e11.getMessage(), e11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (byteArrayInputStream == null) {
            throw new MessagingException("Cannot load header");
        }
        this.headers = new InternetHeaders(byteArrayInputStream);
        this.headersLoaded = true;
    }

    private void setHeaderLoaded(String str) {
        this.loadedHeaders.put(str.toUpperCase(Locale.ENGLISH), str);
    }

    private void setHeadersLoaded(boolean z10) {
        this.headersLoaded = z10;
    }

    private String toSection(String str) {
        if (this.sectionId == null) {
            return str;
        }
        return C11232c.m13228a(this.sectionId, ".", str, new StringBuilder());
    }

    public long _getModSeq() {
        return this.modseq;
    }

    public Session _getSession() {
        return this.session;
    }

    public void _setFlags(Flags flags) {
        this.flags = flags;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void addFrom(Address[] addressArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void addHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void addHeaderLine(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void addRecipients(Message.RecipientType recipientType, Address[] addressArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void checkExpunged() {
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    public Object fetchItem(FetchItem fetchItem) {
        Object obj;
        Object obj2;
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    int sequenceNumber = getSequenceNumber();
                    Response[] responseArrFetch = protocol.fetch(sequenceNumber, fetchItem.getName());
                    obj = null;
                    for (int i10 = 0; i10 < responseArrFetch.length; i10++) {
                        Response response = responseArrFetch[i10];
                        if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == sequenceNumber) {
                            handleExtensionFetchItems(((FetchResponse) responseArrFetch[i10]).getExtensionItems());
                            Map<String, Object> map = this.items;
                            if (map != null && (obj2 = map.get(fetchItem.getName())) != null) {
                                obj = obj2;
                            }
                        }
                    }
                    protocol.notifyResponseHandlers(responseArrFetch);
                    protocol.handleResult(responseArrFetch[responseArrFetch.length - 1]);
                } catch (ConnectionException e10) {
                    throw new FolderClosedException(this.folder, e10.getMessage());
                } catch (ProtocolException e11) {
                    forceCheckExpunged();
                    throw new MessagingException(e11.getMessage(), e11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void forceCheckExpunged() throws MessageRemovedException {
        synchronized (getMessageCacheLock()) {
            try {
                getProtocol().noop();
            } catch (ConnectionException e10) {
                throw new FolderClosedException(this.folder, e10.getMessage());
            } catch (ProtocolException unused) {
            }
        }
        if (this.expunged) {
            throw new MessageRemovedException();
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getAllHeaderLines() {
        checkExpunged();
        loadHeaders();
        return super.getAllHeaderLines();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getAllHeaders() {
        checkExpunged();
        loadHeaders();
        return super.getAllHeaders();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getContentID() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentID();
        }
        loadBODYSTRUCTURE();
        return this.f31269bs.f31273id;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String[] getContentLanguage() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentLanguage();
        }
        loadBODYSTRUCTURE();
        String[] strArr = this.f31269bs.language;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        return null;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getContentMD5() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentMD5();
        }
        loadBODYSTRUCTURE();
        return this.f31269bs.md5;
    }

    @Override // javax.mail.internet.MimeMessage
    public InputStream getContentStream() throws MessageRemovedException {
        if (this.bodyLoaded) {
            return super.getContentStream();
        }
        boolean peek = getPeek();
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    if (protocol.isREV1()) {
                        int i10 = -1;
                        if (getFetchBlockSize() != -1) {
                            String section = toSection("TEXT");
                            if (this.f31269bs != null && !ignoreBodyStructureSize()) {
                                i10 = this.f31269bs.size;
                            }
                            return new IMAPInputStream(this, section, i10, peek);
                        }
                    }
                    ByteArrayInputStream byteArrayInputStream = null;
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = peek ? protocol.peekBody(getSequenceNumber(), toSection("TEXT")) : protocol.fetchBody(getSequenceNumber(), toSection("TEXT"));
                        if (bodyPeekBody != null) {
                            byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        }
                    } else {
                        RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "TEXT");
                        if (rfc822dataFetchRFC822 != null) {
                            byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                        }
                    }
                    if (byteArrayInputStream != null) {
                        return byteArrayInputStream;
                    }
                    forceCheckExpunged();
                    return new ByteArrayInputStream(new byte[0]);
                } catch (ConnectionException e10) {
                    throw new FolderClosedException(this.folder, e10.getMessage());
                } catch (ProtocolException e11) {
                    forceCheckExpunged();
                    throw new MessagingException(e11.getMessage(), e11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public synchronized String getContentType() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getContentType();
        }
        if (this.type == null) {
            loadBODYSTRUCTURE();
            BODYSTRUCTURE bodystructure = this.f31269bs;
            this.type = new ContentType(bodystructure.type, bodystructure.subtype, bodystructure.cParams).toString();
        }
        return this.type;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public synchronized DataHandler getDataHandler() {
        BODYSTRUCTURE bodystructure;
        ENVELOPE envelope;
        String str;
        try {
            checkExpunged();
            if (this.f50061dh == null && !this.bodyLoaded) {
                loadBODYSTRUCTURE();
                if (this.type == null) {
                    BODYSTRUCTURE bodystructure2 = this.f31269bs;
                    this.type = new ContentType(bodystructure2.type, bodystructure2.subtype, bodystructure2.cParams).toString();
                }
                if (this.f31269bs.isMulti()) {
                    this.f50061dh = new DataHandler(new IMAPMultipartDataSource(this, this.f31269bs.bodies, this.sectionId, this));
                } else if (this.f31269bs.isNested() && isREV1() && (envelope = (bodystructure = this.f31269bs).envelope) != null) {
                    BODYSTRUCTURE bodystructure3 = bodystructure.bodies[0];
                    if (this.sectionId == null) {
                        str = "1";
                    } else {
                        str = this.sectionId + ".1";
                    }
                    this.f50061dh = new DataHandler(new IMAPNestedMessage(this, bodystructure3, envelope, str), this.type);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.getDataHandler();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getDescription() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getDescription();
        }
        String str = this.description;
        if (str != null) {
            return str;
        }
        loadBODYSTRUCTURE();
        String str2 = this.f31269bs.description;
        if (str2 == null) {
            return null;
        }
        try {
            this.description = MimeUtility.decodeText(str2);
        } catch (UnsupportedEncodingException unused) {
            this.description = this.f31269bs.description;
        }
        return this.description;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getDisposition() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getDisposition();
        }
        loadBODYSTRUCTURE();
        return this.f31269bs.disposition;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getEncoding() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getEncoding();
        }
        loadBODYSTRUCTURE();
        return this.f31269bs.encoding;
    }

    public int getFetchBlockSize() {
        return ((IMAPStore) this.folder.getStore()).getFetchBlockSize();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String getFileName() {
        ParameterList parameterList;
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getFileName();
        }
        loadBODYSTRUCTURE();
        ParameterList parameterList2 = this.f31269bs.dParams;
        String str = parameterList2 != null ? parameterList2.get("filename") : null;
        return (str != null || (parameterList = this.f31269bs.cParams) == null) ? str : parameterList.get(IMAPStore.ID_NAME);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized Flags getFlags() {
        checkExpunged();
        loadFlags();
        return super.getFlags();
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getFrom() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getFrom();
        }
        loadEnvelope();
        ENVELOPE envelope = this.envelope;
        InternetAddress[] internetAddressArr = envelope.from;
        if (internetAddressArr == null || internetAddressArr.length == 0) {
            internetAddressArr = envelope.sender;
        }
        return aaclone(internetAddressArr);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public String[] getHeader(String str) throws MessagingException {
        ByteArrayInputStream byteArrayInputStream;
        checkExpunged();
        if (isHeaderLoaded(str)) {
            return this.headers.getHeader(str);
        }
        synchronized (getMessageCacheLock()) {
            try {
                try {
                    IMAPProtocol protocol = getProtocol();
                    checkExpunged();
                    if (protocol.isREV1()) {
                        BODY bodyPeekBody = protocol.peekBody(getSequenceNumber(), toSection("HEADER.FIELDS (" + str + ")"));
                        if (bodyPeekBody != null) {
                            byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                        } else {
                            byteArrayInputStream = null;
                        }
                    } else {
                        RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), "HEADER.LINES (" + str + ")");
                        if (rfc822dataFetchRFC822 != null) {
                            byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                        } else {
                            byteArrayInputStream = null;
                        }
                    }
                } catch (ConnectionException e10) {
                    throw new FolderClosedException(this.folder, e10.getMessage());
                } catch (ProtocolException e11) {
                    forceCheckExpunged();
                    throw new MessagingException(e11.getMessage(), e11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (byteArrayInputStream == null) {
            return null;
        }
        if (this.headers == null) {
            this.headers = new InternetHeaders();
        }
        this.headers.load(byteArrayInputStream);
        setHeaderLoaded(str);
        return this.headers.getHeader(str);
    }

    public String getInReplyTo() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getHeader("In-Reply-To", " ");
        }
        loadEnvelope();
        return this.envelope.inReplyTo;
    }

    public synchronized Object getItem(FetchItem fetchItem) {
        Object objFetchItem;
        Map<String, Object> map = this.items;
        objFetchItem = map == null ? null : map.get(fetchItem.getName());
        if (objFetchItem == null) {
            objFetchItem = fetchItem(fetchItem);
        }
        return objFetchItem;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public int getLineCount() {
        checkExpunged();
        loadBODYSTRUCTURE();
        return this.f31269bs.lines;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getMatchingHeaderLines(String[] strArr) {
        checkExpunged();
        loadHeaders();
        return super.getMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getMatchingHeaders(String[] strArr) {
        checkExpunged();
        loadHeaders();
        return super.getMatchingHeaders(strArr);
    }

    public Object getMessageCacheLock() {
        return ((IMAPFolder) this.folder).messageCacheLock;
    }

    @Override // javax.mail.internet.MimeMessage
    public String getMessageID() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getMessageID();
        }
        loadEnvelope();
        return this.envelope.messageId;
    }

    @Override // com.sun.mail.util.ReadableMime
    public InputStream getMimeStream() throws MessageRemovedException {
        boolean peek = getPeek();
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                if (protocol.isREV1() && getFetchBlockSize() != -1) {
                    return new IMAPInputStream(this, this.sectionId, -1, peek);
                }
                ByteArrayInputStream byteArrayInputStream = null;
                if (protocol.isREV1()) {
                    BODY bodyPeekBody = peek ? protocol.peekBody(getSequenceNumber(), this.sectionId) : protocol.fetchBody(getSequenceNumber(), this.sectionId);
                    if (bodyPeekBody != null) {
                        byteArrayInputStream = bodyPeekBody.getByteArrayInputStream();
                    }
                } else {
                    RFC822DATA rfc822dataFetchRFC822 = protocol.fetchRFC822(getSequenceNumber(), null);
                    if (rfc822dataFetchRFC822 != null) {
                        byteArrayInputStream = rfc822dataFetchRFC822.getByteArrayInputStream();
                    }
                }
                if (byteArrayInputStream != null) {
                    return byteArrayInputStream;
                }
                forceCheckExpunged();
                return new ByteArrayInputStream(new byte[0]);
            } catch (ConnectionException e10) {
                throw new FolderClosedException(this.folder, e10.getMessage());
            } catch (ProtocolException e11) {
                forceCheckExpunged();
                throw new MessagingException(e11.getMessage(), e11);
            }
        }
    }

    public synchronized long getModSeq() {
        if (this.modseq != -1) {
            return this.modseq;
        }
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                MODSEQ modseqFetchMODSEQ = protocol.fetchMODSEQ(getSequenceNumber());
                if (modseqFetchMODSEQ != null) {
                    this.modseq = modseqFetchMODSEQ.modseq;
                }
            } catch (ConnectionException e10) {
                throw new FolderClosedException(this.folder, e10.getMessage());
            } catch (ProtocolException e11) {
                throw new MessagingException(e11.getMessage(), e11);
            }
        }
        return this.modseq;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) {
        checkExpunged();
        loadHeaders();
        return super.getNonMatchingHeaderLines(strArr);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) {
        checkExpunged();
        loadHeaders();
        return super.getNonMatchingHeaders(strArr);
    }

    public synchronized boolean getPeek() {
        Boolean bool = this.peek;
        if (bool == null) {
            return ((IMAPStore) this.folder.getStore()).getPeek();
        }
        return bool.booleanValue();
    }

    public IMAPProtocol getProtocol() throws ProtocolException, FolderClosedException {
        ((IMAPFolder) this.folder).waitIfIdle();
        IMAPProtocol iMAPProtocol = ((IMAPFolder) this.folder).protocol;
        if (iMAPProtocol != null) {
            return iMAPProtocol;
        }
        throw new FolderClosedException(this.folder);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Date getReceivedDate() {
        checkExpunged();
        if (this.receivedDate == null) {
            loadEnvelope();
        }
        if (this.receivedDate == null) {
            return null;
        }
        return new Date(this.receivedDate.getTime());
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getRecipients(Message.RecipientType recipientType) {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getRecipients(recipientType);
        }
        loadEnvelope();
        if (recipientType == Message.RecipientType.f50056TO) {
            return aaclone(this.envelope.f31275to);
        }
        if (recipientType == Message.RecipientType.f50055CC) {
            return aaclone(this.envelope.f31274cc);
        }
        return recipientType == Message.RecipientType.BCC ? aaclone(this.envelope.bcc) : super.getRecipients(recipientType);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Address[] getReplyTo() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getReplyTo();
        }
        loadEnvelope();
        InternetAddress[] internetAddressArr = this.envelope.replyTo;
        return (internetAddressArr == null || internetAddressArr.length == 0) ? getFrom() : aaclone(internetAddressArr);
    }

    @Override // javax.mail.internet.MimeMessage
    public Address getSender() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSender();
        }
        loadEnvelope();
        InternetAddress[] internetAddressArr = this.envelope.sender;
        if (internetAddressArr == null || internetAddressArr.length <= 0) {
            return null;
        }
        return internetAddressArr[0];
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public Date getSentDate() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSentDate();
        }
        loadEnvelope();
        if (this.envelope.date == null) {
            return null;
        }
        return new Date(this.envelope.date.getTime());
    }

    public int getSequenceNumber() {
        return ((IMAPFolder) this.folder).messageCache.seqnumOf(getMessageNumber());
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public int getSize() {
        checkExpunged();
        if (this.size == -1) {
            loadEnvelope();
        }
        long j10 = this.size;
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public long getSizeLong() {
        checkExpunged();
        if (this.size == -1) {
            loadEnvelope();
        }
        return this.size;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public String getSubject() {
        checkExpunged();
        if (this.bodyLoaded) {
            return super.getSubject();
        }
        String str = this.subject;
        if (str != null) {
            return str;
        }
        loadEnvelope();
        String str2 = this.envelope.subject;
        if (str2 == null) {
            return null;
        }
        try {
            this.subject = MimeUtility.decodeText(MimeUtility.unfold(str2));
        } catch (UnsupportedEncodingException unused) {
            this.subject = this.envelope.subject;
        }
        return this.subject;
    }

    public long getUID() {
        return this.uid;
    }

    public void handleExtensionFetchItems(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.items == null) {
            this.items = new HashMap();
        }
        this.items.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleFetchItem(Item item, String[] strArr, boolean z10) throws MessagingException {
        ByteArrayInputStream byteArrayInputStream;
        boolean zIsHeader;
        if (item instanceof Flags) {
            this.flags = (Flags) item;
        } else if (item instanceof ENVELOPE) {
            this.envelope = (ENVELOPE) item;
        } else if (item instanceof INTERNALDATE) {
            this.receivedDate = ((INTERNALDATE) item).getDate();
        } else if (item instanceof RFC822SIZE) {
            this.size = ((RFC822SIZE) item).size;
        } else if (item instanceof MODSEQ) {
            this.modseq = ((MODSEQ) item).modseq;
        } else if (item instanceof BODYSTRUCTURE) {
            this.f31269bs = (BODYSTRUCTURE) item;
        } else if (item instanceof UID) {
            UID uid = (UID) item;
            this.uid = uid.uid;
            Folder folder = this.folder;
            if (((IMAPFolder) folder).uidTable == null) {
                ((IMAPFolder) folder).uidTable = new Hashtable<>();
            }
            ((IMAPFolder) this.folder).uidTable.put(Long.valueOf(uid.uid), this);
        } else {
            boolean z11 = item instanceof RFC822DATA;
            if (!z11 && !(item instanceof BODY)) {
                return false;
            }
            if (z11) {
                RFC822DATA rfc822data = (RFC822DATA) item;
                byteArrayInputStream = rfc822data.getByteArrayInputStream();
                zIsHeader = rfc822data.isHeader();
            } else {
                BODY body = (BODY) item;
                byteArrayInputStream = body.getByteArrayInputStream();
                zIsHeader = body.isHeader();
            }
            if (zIsHeader) {
                InternetHeaders internetHeaders = new InternetHeaders();
                if (byteArrayInputStream != null) {
                    internetHeaders.load(byteArrayInputStream);
                }
                if (this.headers == null || z10) {
                    this.headers = internetHeaders;
                } else {
                    Enumeration<Header> allHeaders = internetHeaders.getAllHeaders();
                    while (allHeaders.hasMoreElements()) {
                        Header headerNextElement = allHeaders.nextElement();
                        if (!isHeaderLoaded(headerNextElement.getName())) {
                            this.headers.addHeader(headerNextElement.getName(), headerNextElement.getValue());
                        }
                    }
                }
                if (z10) {
                    setHeadersLoaded(true);
                } else {
                    for (String str : strArr) {
                        setHeaderLoaded(str);
                    }
                }
            } else {
                try {
                    this.size = byteArrayInputStream.available();
                } catch (IOException unused) {
                }
                parse(byteArrayInputStream);
                this.bodyLoaded = true;
                setHeadersLoaded(true);
            }
        }
        return true;
    }

    public boolean ignoreBodyStructureSize() {
        return ((IMAPStore) this.folder.getStore()).ignoreBodyStructureSize();
    }

    public synchronized void invalidateHeaders() {
        this.headersLoaded = false;
        this.loadedHeaders.clear();
        this.headers = null;
        this.envelope = null;
        this.f31269bs = null;
        this.receivedDate = null;
        this.size = -1L;
        this.type = null;
        this.subject = null;
        this.description = null;
        this.flags = null;
        this.content = null;
        this.contentStream = null;
        this.bodyLoaded = false;
    }

    public boolean isREV1() throws FolderClosedException {
        IMAPProtocol iMAPProtocol = ((IMAPFolder) this.folder).protocol;
        if (iMAPProtocol != null) {
            return iMAPProtocol.isREV1();
        }
        throw new FolderClosedException(this.folder);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized boolean isSet(Flags.Flag flag) {
        checkExpunged();
        loadFlags();
        return super.isSet(flag);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void removeHeader(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setContentID(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void setContentLanguage(String[] strArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public void setContentMD5(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setDataHandler(DataHandler dataHandler) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setDescription(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setDisposition(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.Message
    public void setExpunged(boolean z10) {
        super.setExpunged(z10);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setFileName(String str) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public synchronized void setFlags(Flags flags, boolean z10) {
        synchronized (getMessageCacheLock()) {
            try {
                IMAPProtocol protocol = getProtocol();
                checkExpunged();
                protocol.storeFlags(getSequenceNumber(), flags, z10);
            } catch (ConnectionException e10) {
                throw new FolderClosedException(this.folder, e10.getMessage());
            } catch (ProtocolException e11) {
                throw new MessagingException(e11.getMessage(), e11);
            }
        }
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setFrom(Address address) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void setHeader(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.Message
    public void setMessageNumber(int i10) {
        super.setMessageNumber(i10);
    }

    public void setModSeq(long j10) {
        this.modseq = j10;
    }

    public synchronized void setPeek(boolean z10) {
        this.peek = Boolean.valueOf(z10);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setRecipients(Message.RecipientType recipientType, Address[] addressArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setReplyTo(Address[] addressArr) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setSender(Address address) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Message
    public void setSentDate(Date date) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    @Override // javax.mail.internet.MimeMessage
    public void setSubject(String str, String str2) throws IllegalWriteException {
        throw new IllegalWriteException("IMAPMessage is read-only");
    }

    public void setUID(long j10) {
        this.uid = j10;
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.Part
    public void writeTo(OutputStream outputStream) throws Throwable {
        if (this.bodyLoaded) {
            super.writeTo(outputStream);
            return;
        }
        InputStream mimeStream = getMimeStream();
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = mimeStream.read(bArr);
                if (i10 == -1) {
                    mimeStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            mimeStream.close();
            throw th;
        }
    }

    public IMAPMessage(Session session) {
        super(session);
        this.size = -1L;
        this.uid = -1L;
        this.modseq = -1L;
        this.headersLoaded = false;
        this.bodyLoaded = false;
        this.loadedHeaders = new Hashtable<>(1);
    }

    @Override // javax.mail.internet.MimeMessage, javax.mail.internet.MimePart
    public String getHeader(String str, String str2) {
        checkExpunged();
        if (getHeader(str) == null) {
            return null;
        }
        return this.headers.getHeader(str, str2);
    }
}
