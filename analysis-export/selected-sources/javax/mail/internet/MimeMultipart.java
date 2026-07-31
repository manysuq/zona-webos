package javax.mail.internet;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.PropUtil;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.MessageAware;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.MultipartDataSource;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class MimeMultipart extends Multipart {
    protected boolean allowEmpty;
    protected boolean complete;

    /* JADX INFO: renamed from: ds */
    protected DataSource f50062ds;
    protected boolean ignoreExistingBoundaryParameter;
    protected boolean ignoreMissingBoundaryParameter;
    protected boolean ignoreMissingEndBoundary;
    protected boolean parsed;
    protected String preamble;

    public MimeMultipart() {
        this("mixed");
    }

    private static boolean allDashes(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.charAt(i10) != '-') {
                return false;
            }
        }
        return true;
    }

    private MimeBodyPart createMimeBodyPartIs(InputStream inputStream) {
        try {
            return createMimeBodyPart(inputStream);
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int readFully(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i11 > 0) {
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 <= 0) {
                break;
            }
            i10 += i13;
            i12 += i13;
            i11 -= i13;
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }

    private void skipFully(InputStream inputStream, long j10) throws IOException {
        while (j10 > 0) {
            long jSkip = inputStream.skip(j10);
            if (jSkip <= 0) {
                throw new EOFException("can't skip");
            }
            j10 -= jSkip;
        }
    }

    @Override // javax.mail.Multipart
    public synchronized void addBodyPart(BodyPart bodyPart) {
        parse();
        super.addBodyPart(bodyPart);
    }

    public InternetHeaders createInternetHeaders(InputStream inputStream) {
        return new InternetHeaders(inputStream);
    }

    public MimeBodyPart createMimeBodyPart(InternetHeaders internetHeaders, byte[] bArr) {
        return new MimeBodyPart(internetHeaders, bArr);
    }

    @Override // javax.mail.Multipart
    public synchronized BodyPart getBodyPart(int i10) {
        parse();
        return super.getBodyPart(i10);
    }

    @Override // javax.mail.Multipart
    public synchronized int getCount() {
        parse();
        return super.getCount();
    }

    public synchronized String getPreamble() {
        parse();
        return this.preamble;
    }

    public void initializeProperties() {
        this.ignoreMissingEndBoundary = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoremissingendboundary", true);
        this.ignoreMissingBoundaryParameter = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoremissingboundaryparameter", true);
        this.ignoreExistingBoundaryParameter = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoreexistingboundaryparameter", false);
        this.allowEmpty = PropUtil.getBooleanSystemProperty("mail.mime.multipart.allowempty", false);
    }

    public synchronized boolean isComplete() {
        parse();
        return this.complete;
    }

    /* JADX WARN: Code duplicated, block: B:245:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00de A[Catch: all -> 0x0088, IOException -> 0x008b, TryCatch #6 {IOException -> 0x008b, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0075, B:44:0x007c, B:48:0x0085, B:53:0x008e, B:55:0x0096, B:58:0x009d, B:60:0x00a8, B:62:0x00ae, B:75:0x00d6, B:78:0x00de, B:79:0x00e8, B:65:0x00b8, B:67:0x00be, B:69:0x00c6, B:71:0x00cd, B:81:0x00f6, B:83:0x00fe, B:88:0x0107, B:89:0x010e, B:90:0x010f, B:92:0x011b, B:93:0x0124, B:95:0x0129, B:97:0x012d, B:99:0x0135, B:102:0x0145, B:101:0x0140, B:103:0x014a, B:106:0x0157, B:107:0x015b, B:109:0x0161, B:113:0x016a, B:115:0x016e, B:116:0x0172, B:117:0x0179, B:120:0x0183, B:123:0x018b, B:125:0x0199, B:126:0x01a0, B:128:0x01ae, B:131:0x01b4, B:132:0x01b8, B:184:0x026a, B:194:0x0299, B:185:0x0275, B:187:0x0278, B:189:0x0285, B:192:0x028b, B:193:0x028f, B:133:0x01c5, B:134:0x01cc, B:137:0x01d0, B:145:0x01ee, B:151:0x01fb, B:198:0x02c5, B:203:0x02dc, B:204:0x02e2, B:206:0x02ee, B:207:0x02fd, B:211:0x030b, B:213:0x0311, B:161:0x0215, B:162:0x021f, B:164:0x0227, B:166:0x022f, B:179:0x0257, B:181:0x0263, B:196:0x02b0, B:140:0x01db, B:124:0x0193, B:215:0x032c, B:216:0x0333, B:119:0x017d), top: B:242:0x0062, outer: #5 }] */
    public synchronized void parse() {
        String line;
        boolean z10;
        InternetHeaders internetHeadersCreateInternetHeaders;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int fully;
        int i10;
        LineInputStream lineInputStream;
        long j10;
        int i11;
        ByteArrayOutputStream byteArrayOutputStream2;
        MimeBodyPart mimeBodyPartCreateMimeBodyPart;
        ByteArrayOutputStream byteArrayOutputStream3;
        SharedInputStream sharedInputStream;
        InternetHeaders internetHeaders;
        byte b10;
        String line2;
        String parameter;
        if (this.parsed) {
            return;
        }
        initializeProperties();
        try {
            InputStream inputStream = this.f50062ds.getInputStream();
            if (!(inputStream instanceof ByteArrayInputStream) && !(inputStream instanceof BufferedInputStream) && !(inputStream instanceof SharedInputStream)) {
                inputStream = new BufferedInputStream(inputStream);
            }
            SharedInputStream sharedInputStream2 = inputStream instanceof SharedInputStream ? (SharedInputStream) inputStream : null;
            String strConcat = (this.ignoreExistingBoundaryParameter || (parameter = new ContentType(this.contentType).getParameter("boundary")) == null) ? null : "--".concat(parameter);
            if (strConcat == null && !this.ignoreMissingBoundaryParameter && !this.ignoreExistingBoundaryParameter) {
                throw new ParseException("Missing boundary parameter");
            }
            try {
                try {
                    LineInputStream lineInputStream2 = new LineInputStream(inputStream);
                    StringBuilder sb2 = null;
                    while (true) {
                        line = lineInputStream2.readLine();
                        z10 = false;
                        if (line == null) {
                            break;
                        }
                        int length = line.length() - 1;
                        while (length >= 0) {
                            char cCharAt = line.charAt(length);
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            } else {
                                length--;
                            }
                        }
                        line = line.substring(0, length + 1);
                        if (strConcat == null) {
                            if (line.length() > 2 && line.startsWith("--") && (line.length() <= 4 || !allDashes(line))) {
                                strConcat = line;
                                break;
                            }
                            if (line.length() <= 0) {
                                if (sb2 == null) {
                                    sb2 = new StringBuilder(line.length() + 2);
                                }
                                sb2.append(line);
                                sb2.append(System.lineSeparator());
                            }
                        } else {
                            if (line.equals(strConcat)) {
                                break;
                            }
                            if (line.length() == strConcat.length() + 2 && line.startsWith(strConcat) && line.endsWith("--")) {
                                line = null;
                                break;
                            }
                            if (line.length() <= 0) {
                                if (sb2 == null) {
                                    sb2 = new StringBuilder(line.length() + 2);
                                }
                                sb2.append(line);
                                sb2.append(System.lineSeparator());
                            }
                        }
                    }
                    if (sb2 != null) {
                        this.preamble = sb2.toString();
                    }
                    if (line == null) {
                        if (!this.allowEmpty) {
                            throw new ParseException("Missing start boundary");
                        }
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                        return;
                    }
                    byte[] bytes = ASCIIUtility.getBytes(strConcat);
                    int length2 = bytes.length;
                    int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                    int i12 = 0;
                    while (i12 < length2) {
                        int i13 = bytes[i12] & UByte.MAX_VALUE;
                        i12++;
                        iArr[i13] = i12;
                    }
                    int[] iArr2 = new int[length2];
                    for (int i14 = length2; i14 > 0; i14--) {
                        int i15 = length2 - 1;
                        while (true) {
                            if (i15 < i14) {
                                while (i15 > 0) {
                                    i15--;
                                    iArr2[i15] = i14;
                                }
                                break;
                            } else {
                                if (bytes[i15] != bytes[i15 - i14]) {
                                    break;
                                }
                                iArr2[i15 - 1] = i14;
                                i15--;
                            }
                        }
                    }
                    int i16 = length2 - 1;
                    iArr2[i16] = 1;
                    long position = 0;
                    long position2 = 0;
                    boolean z11 = false;
                    while (!z11) {
                        if (sharedInputStream2 != null) {
                            position = sharedInputStream2.getPosition();
                            do {
                                line2 = lineInputStream2.readLine();
                                if (line2 == null) {
                                    break;
                                }
                            } while (line2.length() > 0);
                            if (line2 == null) {
                                if (!this.ignoreMissingEndBoundary) {
                                    throw new ParseException("missing multipart end boundary");
                                }
                                this.complete = z10;
                                break;
                            }
                            internetHeadersCreateInternetHeaders = null;
                        } else {
                            internetHeadersCreateInternetHeaders = createInternetHeaders(inputStream);
                        }
                        if (!inputStream.markSupported()) {
                            throw new MessagingException("Stream doesn't support mark");
                        }
                        if (sharedInputStream2 == null) {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                        } else {
                            position2 = sharedInputStream2.getPosition();
                            byteArrayOutputStream = null;
                        }
                        byte[] bArr2 = new byte[length2];
                        byte[] bArr3 = new byte[length2];
                        int i17 = 0;
                        boolean z12 = true;
                        while (true) {
                            inputStream.mark(length2 + 1004);
                            bArr = bytes;
                            fully = readFully(inputStream, bArr2, 0, length2);
                            if (fully < length2) {
                                if (!this.ignoreMissingEndBoundary) {
                                    throw new ParseException("missing multipart end boundary");
                                }
                                if (sharedInputStream2 != null) {
                                    position2 = sharedInputStream2.getPosition();
                                }
                                this.complete = false;
                                i10 = i16;
                                lineInputStream = lineInputStream2;
                                j10 = position2;
                                z11 = true;
                                i11 = 0;
                                break;
                            }
                            int i18 = i16;
                            while (true) {
                                if (i18 < 0) {
                                    i10 = i16;
                                    lineInputStream = lineInputStream2;
                                    break;
                                }
                                i10 = i16;
                                lineInputStream = lineInputStream2;
                                if (bArr2[i18] != bArr[i18]) {
                                    break;
                                }
                                i18--;
                                i16 = i10;
                                lineInputStream2 = lineInputStream;
                            }
                            if (i18 < 0) {
                                i11 = (z12 || !((b10 = bArr3[i17 - 1]) == 13 || b10 == 10)) ? 0 : (b10 == 10 && i17 >= 2 && bArr3[i17 + (-2)] == 13) ? 2 : 1;
                                if (z12 || i11 > 0) {
                                    if (sharedInputStream2 != null) {
                                        position2 = (sharedInputStream2.getPosition() - ((long) length2)) - ((long) i11);
                                    }
                                    int i19 = inputStream.read();
                                    if (i19 != 45 || inputStream.read() != 45) {
                                        int i20 = i19;
                                        while (true) {
                                            if (i20 != 32 && i20 != 9) {
                                                break;
                                            }
                                            internetHeadersCreateInternetHeaders = internetHeadersCreateInternetHeaders;
                                            sharedInputStream2 = sharedInputStream2;
                                            byteArrayOutputStream = byteArrayOutputStream;
                                            i20 = inputStream.read();
                                        }
                                        if (i20 != 10) {
                                            if (i20 == 13) {
                                                inputStream.mark(1);
                                                if (inputStream.read() != 10) {
                                                    inputStream.reset();
                                                }
                                            }
                                        }
                                        j10 = position2;
                                        break;
                                    }
                                    this.complete = true;
                                    j10 = position2;
                                    z11 = true;
                                    break;
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
                                sharedInputStream = sharedInputStream2;
                                internetHeaders = internetHeadersCreateInternetHeaders;
                                byteArrayOutputStream3 = byteArrayOutputStream4;
                                i18 = 0;
                            } else {
                                byteArrayOutputStream3 = byteArrayOutputStream;
                                sharedInputStream = sharedInputStream2;
                                internetHeaders = internetHeadersCreateInternetHeaders;
                            }
                            int iMax = Math.max((i18 + 1) - iArr[bArr2[i18] & ByteCompanionObject.MAX_VALUE], iArr2[i18]);
                            if (iMax < 2) {
                                if (sharedInputStream == null && i17 > 1) {
                                    byteArrayOutputStream3.write(bArr3, 0, i17 - 1);
                                }
                                inputStream.reset();
                                byte[] bArr4 = bArr3;
                                skipFully(inputStream, 1L);
                                if (i17 >= 1) {
                                    bArr4[0] = bArr4[i17 - 1];
                                    bArr4[1] = bArr2[0];
                                    bArr3 = bArr4;
                                    i17 = 2;
                                } else {
                                    bArr4[0] = bArr2[0];
                                    bArr3 = bArr4;
                                    i17 = 1;
                                }
                            } else {
                                byte[] bArr5 = bArr3;
                                if (i17 > 0 && sharedInputStream == null) {
                                    byteArrayOutputStream3.write(bArr5, 0, i17);
                                }
                                inputStream.reset();
                                skipFully(inputStream, iMax);
                                i17 = iMax;
                                bArr3 = bArr2;
                                bArr2 = bArr5;
                            }
                            internetHeadersCreateInternetHeaders = internetHeaders;
                            sharedInputStream2 = sharedInputStream;
                            bytes = bArr;
                            lineInputStream2 = lineInputStream;
                            z12 = false;
                            byteArrayOutputStream = byteArrayOutputStream3;
                            i16 = i10;
                        }
                        if (sharedInputStream2 != null) {
                            mimeBodyPartCreateMimeBodyPart = createMimeBodyPartIs(sharedInputStream2.newStream(position, j10));
                            sharedInputStream2 = sharedInputStream2;
                        } else {
                            int i21 = i17 - i11;
                            if (i21 > 0) {
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                byteArrayOutputStream2.write(bArr3, 0, i21);
                            } else {
                                byteArrayOutputStream2 = byteArrayOutputStream;
                            }
                            if (!this.complete && fully > 0) {
                                byteArrayOutputStream2.write(bArr2, 0, fully);
                            }
                            mimeBodyPartCreateMimeBodyPart = createMimeBodyPart(internetHeadersCreateInternetHeaders, byteArrayOutputStream2.toByteArray());
                        }
                        super.addBodyPart(mimeBodyPartCreateMimeBodyPart);
                        position2 = j10;
                        sharedInputStream2 = sharedInputStream2;
                        bytes = bArr;
                        i16 = i10;
                        lineInputStream2 = lineInputStream;
                        z10 = false;
                    }
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                    this.parsed = true;
                } catch (IOException e10) {
                    throw new MessagingException("IO Error", e10);
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (Exception e11) {
            throw new MessagingException("No inputstream from datasource", e11);
        }
    }

    @Override // javax.mail.Multipart
    public boolean removeBodyPart(BodyPart bodyPart) {
        parse();
        return super.removeBodyPart(bodyPart);
    }

    public synchronized void setPreamble(String str) {
        this.preamble = str;
    }

    public synchronized void setSubType(String str) {
        ContentType contentType = new ContentType(this.contentType);
        contentType.setSubType(str);
        this.contentType = contentType.toString();
    }

    public synchronized void updateHeaders() {
        parse();
        for (int i10 = 0; i10 < this.parts.size(); i10++) {
            ((MimeBodyPart) this.parts.elementAt(i10)).updateHeaders();
        }
    }

    @Override // javax.mail.Multipart
    public synchronized void writeTo(OutputStream outputStream) {
        try {
            parse();
            String str = "--" + new ContentType(this.contentType).getParameter("boundary");
            LineOutputStream lineOutputStream = new LineOutputStream(outputStream);
            String str2 = this.preamble;
            if (str2 != null) {
                byte[] bytes = ASCIIUtility.getBytes(str2);
                lineOutputStream.write(bytes);
                if (bytes.length > 0 && bytes[bytes.length - 1] != 13 && bytes[bytes.length - 1] != 10) {
                    lineOutputStream.writeln();
                }
            }
            if (this.parts.size() != 0) {
                for (int i10 = 0; i10 < this.parts.size(); i10++) {
                    lineOutputStream.writeln(str);
                    ((MimeBodyPart) this.parts.elementAt(i10)).writeTo(outputStream);
                    lineOutputStream.writeln();
                }
            } else {
                if (!this.allowEmpty) {
                    throw new MessagingException("Empty multipart: " + this.contentType);
                }
                lineOutputStream.writeln(str);
                lineOutputStream.writeln();
            }
            lineOutputStream.writeln(str + "--");
        } catch (Throwable th) {
            throw th;
        }
    }

    public MimeMultipart(String str) {
        this.f50062ds = null;
        this.parsed = true;
        this.complete = true;
        this.preamble = null;
        this.ignoreMissingEndBoundary = true;
        this.ignoreMissingBoundaryParameter = true;
        this.ignoreExistingBoundaryParameter = false;
        this.allowEmpty = false;
        String uniqueBoundaryValue = UniqueValue.getUniqueBoundaryValue();
        ContentType contentType = new ContentType("multipart", str, null);
        contentType.setParameter("boundary", uniqueBoundaryValue);
        this.contentType = contentType.toString();
        initializeProperties();
    }

    public MimeBodyPart createMimeBodyPart(InputStream inputStream) {
        return new MimeBodyPart(inputStream);
    }

    public synchronized BodyPart getBodyPart(String str) {
        parse();
        int count = getCount();
        for (int i10 = 0; i10 < count; i10++) {
            MimeBodyPart mimeBodyPart = (MimeBodyPart) getBodyPart(i10);
            String contentID = mimeBodyPart.getContentID();
            if (contentID != null && contentID.equals(str)) {
                return mimeBodyPart;
            }
        }
        return null;
    }

    @Override // javax.mail.Multipart
    public void removeBodyPart(int i10) {
        parse();
        super.removeBodyPart(i10);
    }

    @Override // javax.mail.Multipart
    public synchronized void addBodyPart(BodyPart bodyPart, int i10) {
        parse();
        super.addBodyPart(bodyPart, i10);
    }

    public MimeMultipart(BodyPart... bodyPartArr) {
        this();
        for (BodyPart bodyPart : bodyPartArr) {
            super.addBodyPart(bodyPart);
        }
    }

    public MimeMultipart(String str, BodyPart... bodyPartArr) {
        this(str);
        for (BodyPart bodyPart : bodyPartArr) {
            super.addBodyPart(bodyPart);
        }
    }

    public MimeMultipart(DataSource dataSource) {
        this.f50062ds = null;
        this.parsed = true;
        this.complete = true;
        this.preamble = null;
        this.ignoreMissingEndBoundary = true;
        this.ignoreMissingBoundaryParameter = true;
        this.ignoreExistingBoundaryParameter = false;
        this.allowEmpty = false;
        if (dataSource instanceof MessageAware) {
            setParent(((MessageAware) dataSource).getMessageContext().getPart());
        }
        if (dataSource instanceof MultipartDataSource) {
            setMultipartDataSource((MultipartDataSource) dataSource);
            return;
        }
        this.parsed = false;
        this.f50062ds = dataSource;
        this.contentType = dataSource.getContentType();
    }
}
