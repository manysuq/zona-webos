package javax.mail.internet;

import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.FolderClosedIOException;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.MessageRemovedIOException;
import com.sun.mail.util.MimeUtil;
import com.sun.mail.util.PropUtil;
import io.appmetrica.analytics.BuildConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.EncodingAware;
import javax.mail.FolderClosedException;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import kotlin.p659io.ConstantsKt;
import p622j.C15292t;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class MimeBodyPart extends BodyPart implements MimePart {
    protected Object cachedContent;
    protected byte[] content;
    protected InputStream contentStream;

    /* JADX INFO: renamed from: dh */
    protected DataHandler f50060dh;
    protected InternetHeaders headers;
    private static final boolean setDefaultTextCharset = PropUtil.getBooleanSystemProperty("mail.mime.setdefaulttextcharset", true);
    private static final boolean setContentTypeFileName = PropUtil.getBooleanSystemProperty("mail.mime.setcontenttypefilename", true);
    private static final boolean encodeFileName = PropUtil.getBooleanSystemProperty("mail.mime.encodefilename", false);
    private static final boolean decodeFileName = PropUtil.getBooleanSystemProperty("mail.mime.decodefilename", false);
    private static final boolean ignoreMultipartEncoding = PropUtil.getBooleanSystemProperty("mail.mime.ignoremultipartencoding", true);
    private static final boolean allowutf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", true);
    static final boolean cacheMultipart = PropUtil.getBooleanSystemProperty("mail.mime.cachemultipart", true);

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class EncodedFileDataSource extends FileDataSource implements EncodingAware {
        private String contentType;
        private String encoding;

        public EncodedFileDataSource(File file, String str, String str2) {
            super(file);
            this.contentType = str;
            this.encoding = str2;
        }

        @Override // javax.activation.FileDataSource, javax.activation.DataSource
        public String getContentType() {
            String str = this.contentType;
            return str != null ? str : super.getContentType();
        }

        @Override // javax.mail.EncodingAware
        public String getEncoding() {
            return this.encoding;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class MimePartDataHandler extends DataHandler {
        MimePart part;

        public MimePartDataHandler(MimePart mimePart) {
            super(new MimePartDataSource(mimePart));
            this.part = mimePart;
        }

        public InputStream getContentStream() {
            MimePart mimePart = this.part;
            if (mimePart instanceof MimeBodyPart) {
                return ((MimeBodyPart) mimePart).getContentStream();
            }
            if (mimePart instanceof MimeMessage) {
                return ((MimeMessage) mimePart).getContentStream();
            }
            return null;
        }

        public MimePart getPart() {
            return this.part;
        }
    }

    public MimeBodyPart() {
        this.headers = new InternetHeaders();
    }

    public static void invalidateContentHeaders(MimePart mimePart) {
        mimePart.removeHeader("Content-Type");
        mimePart.removeHeader("Content-Transfer-Encoding");
    }

    public static String restrictEncoding(MimePart mimePart, String str) {
        String contentType;
        if (ignoreMultipartEncoding && str != null && !str.equalsIgnoreCase("7bit") && !str.equalsIgnoreCase("8bit") && !str.equalsIgnoreCase(BuildConfig.SDK_DEPENDENCY) && (contentType = mimePart.getContentType()) != null) {
            try {
                ContentType contentType2 = new ContentType(contentType);
                if (contentType2.match("multipart/*")) {
                    return null;
                }
                if (contentType2.match("message/*") && !PropUtil.getBooleanSystemProperty("mail.mime.allowencodedmessages", false)) {
                    return null;
                }
            } catch (ParseException unused) {
            }
        }
        return str;
    }

    public static void setEncoding(MimePart mimePart, String str) {
        mimePart.setHeader("Content-Transfer-Encoding", str);
    }

    @Override // javax.mail.Part
    public void addHeader(String str, String str2) {
        this.headers.addHeader(str, str2);
    }

    public void addHeaderLine(String str) {
        this.headers.addHeaderLine(str);
    }

    public void attachFile(File file) throws MessagingException {
        FileDataSource fileDataSource = new FileDataSource(file);
        setDataHandler(new DataHandler(fileDataSource));
        setFileName(fileDataSource.getName());
        setDisposition(Part.ATTACHMENT);
    }

    public Enumeration<String> getAllHeaderLines() {
        return this.headers.getAllHeaderLines();
    }

    @Override // javax.mail.Part
    public Enumeration<Header> getAllHeaders() {
        return this.headers.getAllHeaders();
    }

    @Override // javax.mail.Part
    public Object getContent() throws FolderClosedException, MessageRemovedException {
        Object obj = this.cachedContent;
        if (obj != null) {
            return obj;
        }
        try {
            Object content = getDataHandler().getContent();
            if (cacheMultipart && (((content instanceof Multipart) || (content instanceof Message)) && (this.content != null || this.contentStream != null))) {
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

    @Override // javax.mail.internet.MimePart
    public String[] getContentLanguage() {
        return getContentLanguage(this);
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
            return new ByteArrayInputStream(this.content);
        }
        throw new MessagingException("No MimeBodyPart content");
    }

    @Override // javax.mail.Part
    public String getContentType() {
        String strCleanContentType = MimeUtil.cleanContentType(this, getHeader("Content-Type", null));
        return strCleanContentType == null ? "text/plain" : strCleanContentType;
    }

    @Override // javax.mail.Part
    public DataHandler getDataHandler() {
        if (this.f50060dh == null) {
            this.f50060dh = new MimePartDataHandler(this);
        }
        return this.f50060dh;
    }

    @Override // javax.mail.Part
    public String getDescription() {
        return getDescription(this);
    }

    @Override // javax.mail.Part
    public String getDisposition() {
        return getDisposition(this);
    }

    public String getEncoding() {
        return getEncoding(this);
    }

    @Override // javax.mail.Part
    public String getFileName() {
        return getFileName(this);
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

    @Override // javax.mail.Part
    public boolean isMimeType(String str) {
        return isMimeType(this, str);
    }

    @Override // javax.mail.Part
    public void removeHeader(String str) {
        this.headers.removeHeader(str);
    }

    public void saveFile(File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        InputStream inputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                inputStream = getInputStream();
                byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 > 0) {
                        bufferedOutputStream.write(bArr, 0, i10);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                inputStream.close();
                try {
                    bufferedOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (bufferedOutputStream == null) {
                    throw th;
                }
                try {
                    bufferedOutputStream.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
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

    @Override // javax.mail.internet.MimePart
    public void setContentLanguage(String[] strArr) {
        setContentLanguage(this, strArr);
    }

    public void setContentMD5(String str) {
        setHeader("Content-MD5", str);
    }

    @Override // javax.mail.Part
    public void setDataHandler(DataHandler dataHandler) {
        this.f50060dh = dataHandler;
        this.cachedContent = null;
        invalidateContentHeaders(this);
    }

    @Override // javax.mail.Part
    public void setDescription(String str) throws MessagingException {
        setDescription(str, null);
    }

    @Override // javax.mail.Part
    public void setDisposition(String str) {
        setDisposition(this, str);
    }

    @Override // javax.mail.Part
    public void setFileName(String str) throws MessagingException {
        setFileName(this, str);
    }

    @Override // javax.mail.Part
    public void setHeader(String str, String str2) {
        this.headers.setHeader(str, str2);
    }

    @Override // javax.mail.Part, javax.mail.internet.MimePart
    public void setText(String str) {
        setText(str, null);
    }

    public void updateHeaders() throws MessagingException {
        updateHeaders(this);
        Object obj = this.cachedContent;
        if (obj != null) {
            this.f50060dh = new DataHandler(obj, getContentType());
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
    }

    @Override // javax.mail.Part
    public void writeTo(OutputStream outputStream) throws IOException {
        writeTo(this, outputStream, null);
    }

    public static String[] getContentLanguage(MimePart mimePart) {
        String header = mimePart.getHeader("Content-Language", null);
        if (header == null) {
            return null;
        }
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(header, HeaderTokenizer.MIME);
        ArrayList arrayList = new ArrayList();
        while (true) {
            HeaderTokenizer.Token next = headerTokenizer.next();
            int type = next.getType();
            if (type == -4) {
                break;
            }
            if (type == -1) {
                arrayList.add(next.getValue());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String getDescription(MimePart mimePart) {
        String header = mimePart.getHeader("Content-Description", null);
        if (header == null) {
            return null;
        }
        try {
            return MimeUtility.decodeText(MimeUtility.unfold(header));
        } catch (UnsupportedEncodingException unused) {
            return header;
        }
    }

    public static String getDisposition(MimePart mimePart) {
        String header = mimePart.getHeader("Content-Disposition", null);
        if (header == null) {
            return null;
        }
        return new ContentDisposition(header).getDisposition();
    }

    public static String getEncoding(MimePart mimePart) {
        HeaderTokenizer.Token next;
        int type;
        String header = mimePart.getHeader("Content-Transfer-Encoding", null);
        if (header == null) {
            return null;
        }
        String strTrim = header.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        if (strTrim.equalsIgnoreCase("7bit") || strTrim.equalsIgnoreCase("8bit") || strTrim.equalsIgnoreCase("quoted-printable") || strTrim.equalsIgnoreCase(BuildConfig.SDK_DEPENDENCY) || strTrim.equalsIgnoreCase("base64")) {
            return strTrim;
        }
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(strTrim, HeaderTokenizer.MIME);
        do {
            next = headerTokenizer.next();
            type = next.getType();
            if (type == -4) {
                return strTrim;
            }
        } while (type != -1);
        return next.getValue();
    }

    public static String getFileName(MimePart mimePart) throws MessagingException {
        String strCleanContentType;
        String header = mimePart.getHeader("Content-Disposition", null);
        String parameter = header != null ? new ContentDisposition(header).getParameter("filename") : null;
        if (parameter == null && (strCleanContentType = MimeUtil.cleanContentType(mimePart, mimePart.getHeader("Content-Type", null))) != null) {
            try {
                parameter = new ContentType(strCleanContentType).getParameter(IMAPStore.ID_NAME);
            } catch (ParseException unused) {
            }
        }
        if (!decodeFileName || parameter == null) {
            return parameter;
        }
        try {
            return MimeUtility.decodeText(parameter);
        } catch (UnsupportedEncodingException e10) {
            throw new MessagingException("Can't decode filename", e10);
        }
    }

    public static boolean isMimeType(MimePart mimePart, String str) {
        String contentType = mimePart.getContentType();
        try {
            return new ContentType(contentType).match(str);
        } catch (ParseException unused) {
            try {
                int iIndexOf = contentType.indexOf(59);
                if (iIndexOf > 0) {
                    return new ContentType(contentType.substring(0, iIndexOf)).match(str);
                }
            } catch (ParseException unused2) {
            }
            return contentType.equalsIgnoreCase(str);
        }
    }

    public static void setContentLanguage(MimePart mimePart, String[] strArr) {
        StringBuilder sb2 = new StringBuilder(strArr[0]);
        int length = strArr[0].length() + 18;
        for (int i10 = 1; i10 < strArr.length; i10++) {
            sb2.append(',');
            int i11 = length + 1;
            if (i11 > 76) {
                sb2.append("\r\n\t");
                i11 = 8;
            }
            sb2.append(strArr[i10]);
            length = i11 + strArr[i10].length();
        }
        mimePart.setHeader("Content-Language", sb2.toString());
    }

    public static void setDisposition(MimePart mimePart, String str) {
        if (str == null) {
            mimePart.removeHeader("Content-Disposition");
            return;
        }
        String header = mimePart.getHeader("Content-Disposition", null);
        if (header != null) {
            ContentDisposition contentDisposition = new ContentDisposition(header);
            contentDisposition.setDisposition(str);
            str = contentDisposition.toString();
        }
        mimePart.setHeader("Content-Disposition", str);
    }

    public static void setFileName(MimePart mimePart, String str) throws MessagingException {
        String strCleanContentType;
        boolean z10 = encodeFileName;
        if (z10 && str != null) {
            try {
                str = MimeUtility.encodeText(str);
            } catch (UnsupportedEncodingException e10) {
                throw new MessagingException("Can't encode filename", e10);
            }
        }
        String header = mimePart.getHeader("Content-Disposition", null);
        if (header == null) {
            header = Part.ATTACHMENT;
        }
        ContentDisposition contentDisposition = new ContentDisposition(header);
        String defaultMIMECharset = MimeUtility.getDefaultMIMECharset();
        ParameterList parameterList = contentDisposition.getParameterList();
        if (parameterList == null) {
            parameterList = new ParameterList();
            contentDisposition.setParameterList(parameterList);
        }
        if (z10) {
            parameterList.setLiteral("filename", str);
        } else {
            parameterList.set("filename", str, defaultMIMECharset);
        }
        mimePart.setHeader("Content-Disposition", contentDisposition.toString());
        if (!setContentTypeFileName || (strCleanContentType = MimeUtil.cleanContentType(mimePart, mimePart.getHeader("Content-Type", null))) == null) {
            return;
        }
        try {
            ContentType contentType = new ContentType(strCleanContentType);
            ParameterList parameterList2 = contentType.getParameterList();
            if (parameterList2 == null) {
                parameterList2 = new ParameterList();
                contentType.setParameterList(parameterList2);
            }
            if (z10) {
                parameterList2.setLiteral(IMAPStore.ID_NAME, str);
            } else {
                parameterList2.set(IMAPStore.ID_NAME, str, defaultMIMECharset);
            }
            mimePart.setHeader("Content-Type", contentType.toString());
        } catch (ParseException unused) {
        }
    }

    public static void writeTo(MimePart mimePart, OutputStream outputStream, String[] strArr) throws IOException {
        LineOutputStream lineOutputStream = outputStream instanceof LineOutputStream ? (LineOutputStream) outputStream : new LineOutputStream(outputStream, allowutf8);
        Enumeration<String> nonMatchingHeaderLines = mimePart.getNonMatchingHeaderLines(strArr);
        while (nonMatchingHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln(nonMatchingHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        InputStream contentStream = null;
        try {
            DataHandler dataHandler = mimePart.getDataHandler();
            if (dataHandler instanceof MimePartDataHandler) {
                MimePartDataHandler mimePartDataHandler = (MimePartDataHandler) dataHandler;
                if (mimePartDataHandler.getPart().getEncoding() != null) {
                    contentStream = mimePartDataHandler.getContentStream();
                }
            }
            if (contentStream != null) {
                byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                while (true) {
                    int i10 = contentStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, i10);
                    }
                }
            } else {
                outputStream = MimeUtility.encode(outputStream, restrictEncoding(mimePart, mimePart.getEncoding()));
                mimePart.getDataHandler().writeTo(outputStream);
            }
            if (contentStream != null) {
                contentStream.close();
            }
            outputStream.flush();
        } catch (Throwable th) {
            if (0 != 0) {
                contentStream.close();
            }
            throw th;
        }
    }

    @Override // javax.mail.internet.MimePart
    public String getHeader(String str, String str2) {
        return this.headers.getHeader(str, str2);
    }

    public void setDescription(String str, String str2) throws MessagingException {
        setDescription(this, str, str2);
    }

    @Override // javax.mail.internet.MimePart
    public void setText(String str, String str2) {
        setText(this, str, str2, "plain");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MimeBodyPart(InputStream inputStream) throws MessagingException {
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
        this.headers = new InternetHeaders(bufferedInputStream);
        if (bufferedInputStream instanceof SharedInputStream) {
            SharedInputStream sharedInputStream = (SharedInputStream) bufferedInputStream;
            this.contentStream = sharedInputStream.newStream(sharedInputStream.getPosition(), -1L);
        } else {
            try {
                this.content = ASCIIUtility.getBytes(bufferedInputStream);
            } catch (IOException e10) {
                throw new MessagingException("Error reading input stream", e10);
            }
        }
    }

    public static void setDescription(MimePart mimePart, String str, String str2) throws MessagingException {
        if (str != null) {
            try {
                mimePart.setHeader("Content-Description", MimeUtility.fold(21, MimeUtility.encodeText(str, str2, null)));
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new MessagingException("Encoding error", e10);
            }
        }
        mimePart.removeHeader("Content-Description");
    }

    @Override // javax.mail.internet.MimePart
    public void setText(String str, String str2, String str3) {
        setText(this, str, str2, str3);
    }

    public static void setText(MimePart mimePart, String str, String str2, String str3) {
        if (str2 == null) {
            if (MimeUtility.checkAscii(str) != 1) {
                str2 = MimeUtility.getDefaultMIMECharset();
            } else {
                str2 = "us-ascii";
            }
        }
        StringBuilder sbM18009a = C15292t.m18009a("text/", str3, "; charset=");
        sbM18009a.append(MimeUtility.quote(str2, HeaderTokenizer.MIME));
        mimePart.setContent(str, sbM18009a.toString());
    }

    @Override // javax.mail.Part
    public void setContent(Multipart multipart) {
        setDataHandler(new DataHandler(multipart, multipart.getContentType()));
        multipart.setParent(this);
    }

    public void attachFile(String str) throws MessagingException {
        attachFile(new File(str));
    }

    public void attachFile(File file, String str, String str2) throws MessagingException {
        EncodedFileDataSource encodedFileDataSource = new EncodedFileDataSource(file, str, str2);
        setDataHandler(new DataHandler(encodedFileDataSource));
        setFileName(encodedFileDataSource.getName());
        setDisposition(Part.ATTACHMENT);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008f A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5 A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1 A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x010e A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x011c A[Catch: IOException -> 0x0133, TRY_ENTER, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0124 A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:5:0x000e, B:9:0x001d, B:11:0x002a, B:13:0x002e, B:24:0x0050, B:26:0x0054, B:33:0x008b, B:35:0x008f, B:38:0x009a, B:39:0x00a1, B:41:0x00a7, B:44:0x00ad, B:46:0x00b5, B:48:0x00be, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:56:0x00d6, B:60:0x00e5, B:59:0x00e1, B:62:0x00ee, B:64:0x00f2, B:66:0x00fb, B:68:0x0108, B:70:0x010e, B:71:0x0116, B:74:0x011c, B:76:0x012b, B:75:0x0124, B:77:0x012f, B:28:0x005b, B:29:0x0081, B:16:0x0036, B:17:0x003b, B:19:0x003f, B:22:0x0047, B:23:0x004c, B:30:0x0082), top: B:82:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static void updateHeaders(MimePart mimePart) throws MessagingException {
        String header;
        String parameter;
        ParameterList parameterList;
        String encoding;
        String defaultMIMECharset;
        MimePart part;
        String encoding2;
        Object content;
        DataHandler dataHandler = mimePart.getDataHandler();
        if (dataHandler == null) {
            return;
        }
        try {
            String contentType = dataHandler.getContentType();
            boolean z10 = false;
            boolean z11 = mimePart.getHeader("Content-Type") == null;
            ContentType contentType2 = new ContentType(contentType);
            if (contentType2.match("multipart/*")) {
                if (mimePart instanceof MimeBodyPart) {
                    content = ((MimeBodyPart) mimePart).cachedContent;
                    if (content == null) {
                        content = dataHandler.getContent();
                    }
                } else if (!(mimePart instanceof MimeMessage) || (content = ((MimeMessage) mimePart).cachedContent) == null) {
                    content = dataHandler.getContent();
                }
                if (content instanceof MimeMultipart) {
                    ((MimeMultipart) content).updateHeaders();
                } else {
                    throw new MessagingException("MIME part of type \"" + contentType + "\" contains object of type " + content.getClass().getName() + " instead of MimeMultipart");
                }
            } else {
                if (contentType2.match("message/rfc822")) {
                }
                if (dataHandler instanceof MimePartDataHandler) {
                    part = ((MimePartDataHandler) dataHandler).getPart();
                    if (part != mimePart) {
                        return;
                    }
                    if (z11) {
                        mimePart.setHeader("Content-Type", part.getContentType());
                    }
                    encoding2 = part.getEncoding();
                    if (encoding2 != null) {
                        setEncoding(mimePart, encoding2);
                        return;
                    }
                }
                if (!z10) {
                    if (mimePart.getHeader("Content-Transfer-Encoding") == null) {
                        setEncoding(mimePart, MimeUtility.getEncoding(dataHandler));
                    }
                    if (z11 && setDefaultTextCharset && contentType2.match("text/*") && contentType2.getParameter("charset") == null) {
                        encoding = mimePart.getEncoding();
                        if (encoding == null && encoding.equalsIgnoreCase("7bit")) {
                            defaultMIMECharset = "us-ascii";
                        } else {
                            defaultMIMECharset = MimeUtility.getDefaultMIMECharset();
                        }
                        contentType2.setParameter("charset", defaultMIMECharset);
                        contentType = contentType2.toString();
                    }
                }
                if (z11) {
                    if (setContentTypeFileName && (header = mimePart.getHeader("Content-Disposition", null)) != null && (parameter = new ContentDisposition(header).getParameter("filename")) != null) {
                        parameterList = contentType2.getParameterList();
                        if (parameterList == null) {
                            parameterList = new ParameterList();
                            contentType2.setParameterList(parameterList);
                        }
                        if (encodeFileName) {
                            parameterList.setLiteral(IMAPStore.ID_NAME, MimeUtility.encodeText(parameter));
                        } else {
                            parameterList.set(IMAPStore.ID_NAME, parameter, MimeUtility.getDefaultMIMECharset());
                        }
                        contentType = contentType2.toString();
                    }
                    mimePart.setHeader("Content-Type", contentType);
                }
            }
            z10 = true;
            if (dataHandler instanceof MimePartDataHandler) {
                part = ((MimePartDataHandler) dataHandler).getPart();
                if (part != mimePart) {
                    return;
                }
                if (z11) {
                    mimePart.setHeader("Content-Type", part.getContentType());
                }
                encoding2 = part.getEncoding();
                if (encoding2 != null) {
                    setEncoding(mimePart, encoding2);
                    return;
                }
            }
            if (!z10) {
                if (mimePart.getHeader("Content-Transfer-Encoding") == null) {
                    setEncoding(mimePart, MimeUtility.getEncoding(dataHandler));
                }
                if (z11) {
                    encoding = mimePart.getEncoding();
                    if (encoding == null) {
                        defaultMIMECharset = MimeUtility.getDefaultMIMECharset();
                    } else {
                        defaultMIMECharset = MimeUtility.getDefaultMIMECharset();
                    }
                    contentType2.setParameter("charset", defaultMIMECharset);
                    contentType = contentType2.toString();
                }
            }
            if (z11) {
                if (setContentTypeFileName) {
                    parameterList = contentType2.getParameterList();
                    if (parameterList == null) {
                        parameterList = new ParameterList();
                        contentType2.setParameterList(parameterList);
                    }
                    if (encodeFileName) {
                        parameterList.setLiteral(IMAPStore.ID_NAME, MimeUtility.encodeText(parameter));
                    } else {
                        parameterList.set(IMAPStore.ID_NAME, parameter, MimeUtility.getDefaultMIMECharset());
                    }
                    contentType = contentType2.toString();
                }
                mimePart.setHeader("Content-Type", contentType);
            }
        } catch (IOException e10) {
            throw new MessagingException("IOException updating headers", e10);
        }
    }

    public void attachFile(String str, String str2, String str3) throws MessagingException {
        attachFile(new File(str), str2, str3);
    }

    public void saveFile(String str) throws Throwable {
        saveFile(new File(str));
    }

    public MimeBodyPart(InternetHeaders internetHeaders, byte[] bArr) {
        this.headers = internetHeaders;
        this.content = bArr;
    }
}
