package javax.mail.internet;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.BEncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.QDecoderStream;
import com.sun.mail.util.QEncoderStream;
import com.sun.mail.util.QPDecoderStream;
import com.sun.mail.util.QPEncoderStream;
import com.sun.mail.util.UUDecoderStream;
import com.sun.mail.util.UUEncoderStream;
import io.appmetrica.analytics.BuildConfig;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.EncodingAware;
import javax.mail.MessagingException;
import kotlin.UByte;
import kotlin.text.Typography;
import p183K2.C2756Y;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class MimeUtility {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ALL = -1;
    static final int ALL_ASCII = 1;
    static final int MOSTLY_ASCII = 2;
    static final int MOSTLY_NONASCII = 3;
    private static String defaultJavaCharset;
    private static String defaultMIMECharset;
    private static final Map<String, Boolean> nonAsciiCharsetMap = new HashMap();
    private static final boolean decodeStrict = PropUtil.getBooleanSystemProperty("mail.mime.decodetext.strict", true);
    private static final boolean encodeEolStrict = PropUtil.getBooleanSystemProperty("mail.mime.encodeeol.strict", false);
    private static final boolean ignoreUnknownEncoding = PropUtil.getBooleanSystemProperty("mail.mime.ignoreunknownencoding", false);
    private static final boolean allowUtf8 = PropUtil.getBooleanSystemProperty("mail.mime.allowutf8", false);
    private static final boolean foldEncodedWords = PropUtil.getBooleanSystemProperty("mail.mime.foldencodedwords", false);
    private static final boolean foldText = PropUtil.getBooleanSystemProperty("mail.mime.foldtext", true);
    private static Map<String, String> java2mime = new HashMap(40);
    private static Map<String, String> mime2java = new HashMap(14);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.sun.mail.util.LineInputStream, java.io.InputStream] */
    static {
        ?? lineInputStream;
        Throwable th;
        try {
            InputStream resourceAsStream = MimeUtility.class.getResourceAsStream("/META-INF/javamail.charset.map");
            if (resourceAsStream != null) {
                try {
                    lineInputStream = new LineInputStream(resourceAsStream);
                    try {
                        loadMappings(lineInputStream, java2mime);
                        loadMappings(lineInputStream, mime2java);
                        lineInputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            lineInputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    lineInputStream = resourceAsStream;
                    th = th3;
                }
            }
        } catch (Exception unused2) {
        }
        if (java2mime.isEmpty()) {
            java2mime.put("8859_1", "ISO-8859-1");
            java2mime.put("iso8859_1", "ISO-8859-1");
            java2mime.put("iso8859-1", "ISO-8859-1");
            java2mime.put("8859_2", "ISO-8859-2");
            java2mime.put("iso8859_2", "ISO-8859-2");
            java2mime.put("iso8859-2", "ISO-8859-2");
            java2mime.put("8859_3", "ISO-8859-3");
            java2mime.put("iso8859_3", "ISO-8859-3");
            java2mime.put("iso8859-3", "ISO-8859-3");
            java2mime.put("8859_4", "ISO-8859-4");
            java2mime.put("iso8859_4", "ISO-8859-4");
            java2mime.put("iso8859-4", "ISO-8859-4");
            java2mime.put("8859_5", "ISO-8859-5");
            java2mime.put("iso8859_5", "ISO-8859-5");
            java2mime.put("iso8859-5", "ISO-8859-5");
            java2mime.put("8859_6", "ISO-8859-6");
            java2mime.put("iso8859_6", "ISO-8859-6");
            java2mime.put("iso8859-6", "ISO-8859-6");
            java2mime.put("8859_7", "ISO-8859-7");
            java2mime.put("iso8859_7", "ISO-8859-7");
            java2mime.put("iso8859-7", "ISO-8859-7");
            java2mime.put("8859_8", "ISO-8859-8");
            java2mime.put("iso8859_8", "ISO-8859-8");
            java2mime.put("iso8859-8", "ISO-8859-8");
            java2mime.put("8859_9", "ISO-8859-9");
            java2mime.put("iso8859_9", "ISO-8859-9");
            java2mime.put("iso8859-9", "ISO-8859-9");
            java2mime.put("sjis", "Shift_JIS");
            java2mime.put("jis", "ISO-2022-JP");
            java2mime.put("iso2022jp", "ISO-2022-JP");
            java2mime.put("euc_jp", "euc-jp");
            java2mime.put("koi8_r", "koi8-r");
            java2mime.put("euc_cn", "euc-cn");
            java2mime.put("euc_tw", "euc-tw");
            java2mime.put("euc_kr", "euc-kr");
        }
        if (mime2java.isEmpty()) {
            mime2java.put("iso-2022-cn", "ISO2022CN");
            mime2java.put("iso-2022-kr", "ISO2022KR");
            mime2java.put("utf-8", "UTF8");
            mime2java.put("utf8", "UTF8");
            mime2java.put("ja_jp.iso2022-7", "ISO2022JP");
            mime2java.put("ja_jp.eucjp", "EUCJIS");
            mime2java.put("euc-kr", "KSC5601");
            mime2java.put("euckr", "KSC5601");
            mime2java.put("us-ascii", "ISO-8859-1");
            mime2java.put("x-us-ascii", "ISO-8859-1");
            mime2java.put("gb2312", "GB18030");
            mime2java.put("cp936", "GB18030");
            mime2java.put("ms936", "GB18030");
            mime2java.put("gbk", "GB18030");
        }
    }

    private MimeUtility() {
    }

    public static int checkAscii(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (nonascii(str.charAt(i12))) {
                i10++;
            } else {
                i11++;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i11 > i10 ? 2 : 3;
    }

    public static InputStream decode(InputStream inputStream, String str) throws MessagingException {
        if (str.equalsIgnoreCase("base64")) {
            return new BASE64DecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("quoted-printable")) {
            return new QPDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
            return new UUDecoderStream(inputStream);
        }
        if (str.equalsIgnoreCase(BuildConfig.SDK_DEPENDENCY) || str.equalsIgnoreCase("7bit") || str.equalsIgnoreCase("8bit") || ignoreUnknownEncoding) {
            return inputStream;
        }
        throw new MessagingException("Unknown encoding: ".concat(str));
    }

    private static String decodeInnerWords(String str) throws UnsupportedEncodingException {
        int iIndexOf;
        int iIndexOf2;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int iIndexOf3 = str.indexOf("=?", i10);
            if (iIndexOf3 < 0) {
                break;
            }
            sb2.append(str.substring(i10, iIndexOf3));
            int iIndexOf4 = str.indexOf(63, iIndexOf3 + 2);
            if (iIndexOf4 < 0 || (iIndexOf = str.indexOf(63, iIndexOf4 + 1)) < 0 || (iIndexOf2 = str.indexOf("?=", iIndexOf + 1)) < 0) {
                break;
            }
            i10 = iIndexOf2 + 2;
            String strSubstring = str.substring(iIndexOf3, i10);
            try {
                strSubstring = decodeWord(strSubstring);
            } catch (ParseException unused) {
            }
            sb2.append(strSubstring);
        }
        if (i10 == 0) {
            return str;
        }
        if (i10 < str.length()) {
            sb2.append(str.substring(i10));
        }
        return sb2.toString();
    }

    public static String decodeText(String str) throws UnsupportedEncodingException {
        if (str.indexOf("=?") == -1) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " \t\n\r", true);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean zEndsWith = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            char cCharAt = strNextToken.charAt(0);
            if (cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n') {
                sb3.append(cCharAt);
            } else {
                try {
                    String strDecodeWord = decodeWord(strNextToken);
                    if (!zEndsWith && sb3.length() > 0) {
                        sb2.append((CharSequence) sb3);
                    }
                    strNextToken = strDecodeWord;
                    zEndsWith = true;
                } catch (ParseException unused) {
                    if (!decodeStrict) {
                        String strDecodeInnerWords = decodeInnerWords(strNextToken);
                        if (strDecodeInnerWords != strNextToken) {
                            if ((!zEndsWith || !strNextToken.startsWith("=?")) && sb3.length() > 0) {
                                sb2.append((CharSequence) sb3);
                            }
                            zEndsWith = strNextToken.endsWith("?=");
                            strNextToken = strDecodeInnerWords;
                        } else if (sb3.length() > 0) {
                            sb2.append((CharSequence) sb3);
                        }
                    } else if (sb3.length() > 0) {
                        sb2.append((CharSequence) sb3);
                    }
                    zEndsWith = false;
                }
                sb2.append(strNextToken);
                sb3.setLength(0);
            }
        }
        sb2.append((CharSequence) sb3);
        return sb2.toString();
    }

    public static String decodeWord(String str) throws ParseException, UnsupportedEncodingException {
        InputStream qDecoderStream;
        if (!str.startsWith("=?")) {
            throw new ParseException("encoded word does not start with \"=?\": ".concat(str));
        }
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == -1) {
            throw new ParseException("encoded word does not include charset: ".concat(str));
        }
        String strSubstring = str.substring(2, iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(42);
        if (iIndexOf2 >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        String strJavaCharset = javaCharset(strSubstring);
        int i10 = iIndexOf + 1;
        int iIndexOf3 = str.indexOf(63, i10);
        if (iIndexOf3 == -1) {
            throw new ParseException("encoded word does not include encoding: ".concat(str));
        }
        String strSubstring2 = str.substring(i10, iIndexOf3);
        int i11 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf("?=", i11);
        if (iIndexOf4 == -1) {
            throw new ParseException("encoded word does not end with \"?=\": ".concat(str));
        }
        String strSubstring3 = str.substring(i11, iIndexOf4);
        try {
            String str2 = "";
            if (strSubstring3.length() > 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ASCIIUtility.getBytes(strSubstring3));
                if (strSubstring2.equalsIgnoreCase("B")) {
                    qDecoderStream = new BASE64DecoderStream(byteArrayInputStream);
                } else {
                    if (!strSubstring2.equalsIgnoreCase("Q")) {
                        throw new UnsupportedEncodingException("unknown encoding: ".concat(strSubstring2));
                    }
                    qDecoderStream = new QDecoderStream(byteArrayInputStream);
                }
                int iAvailable = byteArrayInputStream.available();
                byte[] bArr = new byte[iAvailable];
                int i12 = qDecoderStream.read(bArr, 0, iAvailable);
                if (i12 > 0) {
                    str2 = new String(bArr, 0, i12, strJavaCharset);
                }
            }
            int i13 = iIndexOf4 + 2;
            if (i13 >= str.length()) {
                return str2;
            }
            String strSubstring4 = str.substring(i13);
            if (!decodeStrict) {
                strSubstring4 = decodeInnerWords(strSubstring4);
            }
            return str2 + strSubstring4;
        } catch (UnsupportedEncodingException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ParseException(e11.toString());
        } catch (IllegalArgumentException unused) {
            throw new UnsupportedEncodingException(strJavaCharset);
        }
    }

    private static void doEncode(String str, boolean z10, String str2, int i10, String str3, boolean z11, boolean z12, StringBuilder sb2) throws UnsupportedEncodingException {
        int length;
        byte[] bytes = str.getBytes(str2);
        if ((z10 ? BEncoderStream.encodedLength(bytes) : QEncoderStream.encodedLength(bytes, z12)) > i10 && (length = str.length()) > 1) {
            int i11 = length / 2;
            if (Character.isHighSurrogate(str.charAt(i11 - 1))) {
                i11--;
            }
            int i12 = i11;
            if (i12 > 0) {
                doEncode(str.substring(0, i12), z10, str2, i10, str3, z11, z12, sb2);
            }
            doEncode(str.substring(i12, length), z10, str2, i10, str3, false, z12, sb2);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream bEncoderStream = z10 ? new BEncoderStream(byteArrayOutputStream) : new QEncoderStream(byteArrayOutputStream, z12);
        try {
            bEncoderStream.write(bytes);
            bEncoderStream.close();
        } catch (IOException unused) {
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (!z11) {
            if (foldEncodedWords) {
                sb2.append("\r\n ");
            } else {
                sb2.append(" ");
            }
        }
        sb2.append(str3);
        for (byte b10 : byteArray) {
            sb2.append((char) b10);
        }
        sb2.append("?=");
    }

    public static OutputStream encode(OutputStream outputStream, String str) throws MessagingException {
        if (str != null) {
            if (str.equalsIgnoreCase("base64")) {
                return new BASE64EncoderStream(outputStream);
            }
            if (str.equalsIgnoreCase("quoted-printable")) {
                return new QPEncoderStream(outputStream);
            }
            if (str.equalsIgnoreCase("uuencode") || str.equalsIgnoreCase("x-uuencode") || str.equalsIgnoreCase("x-uue")) {
                return new UUEncoderStream(outputStream);
            }
            if (!str.equalsIgnoreCase(BuildConfig.SDK_DEPENDENCY) && !str.equalsIgnoreCase("7bit") && !str.equalsIgnoreCase("8bit")) {
                throw new MessagingException("Unknown encoding: ".concat(str));
            }
        }
        return outputStream;
    }

    public static String encodeText(String str) {
        return encodeText(str, null, null);
    }

    public static String encodeWord(String str) {
        return encodeWord(str, null, null);
    }

    public static String fold(int i10, String str) {
        char cCharAt;
        if (!foldText) {
            return str;
        }
        int length = str.length() - 1;
        while (length >= 0 && ((cCharAt = str.charAt(length)) == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
            length--;
        }
        if (length != str.length() - 1) {
            str = str.substring(0, length + 1);
        }
        if (str.length() + i10 <= 76) {
            return makesafe(str);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 4);
        char cCharAt2 = 0;
        while (str.length() + i10 > 76) {
            int i11 = 0;
            int i12 = -1;
            while (i11 < str.length() && (i12 == -1 || i10 + i11 <= 76)) {
                char cCharAt3 = str.charAt(i11);
                if ((cCharAt3 == ' ' || cCharAt3 == '\t') && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    i12 = i11;
                }
                i11++;
                cCharAt2 = cCharAt3;
            }
            if (i12 == -1) {
                sb2.append(str);
                str = "";
                break;
            }
            sb2.append(str.substring(0, i12));
            sb2.append("\r\n");
            cCharAt2 = str.charAt(i12);
            sb2.append(cCharAt2);
            str = str.substring(i12 + 1);
            i10 = 1;
        }
        sb2.append(str);
        return makesafe(sb2);
    }

    public static String getDefaultJavaCharset() {
        String property;
        if (defaultJavaCharset == null) {
            try {
                property = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
                property = null;
            }
            if (property != null && property.length() > 0) {
                String strJavaCharset = javaCharset(property);
                defaultJavaCharset = strJavaCharset;
                return strJavaCharset;
            }
            try {
                defaultJavaCharset = System.getProperty("file.encoding", "8859_1");
            } catch (SecurityException unused2) {
                String encoding = new InputStreamReader(new InputStream() { // from class: javax.mail.internet.MimeUtility.1NullInputStream
                    @Override // java.io.InputStream
                    public int read() {
                        return 0;
                    }
                }).getEncoding();
                defaultJavaCharset = encoding;
                if (encoding == null) {
                    defaultJavaCharset = "8859_1";
                }
            }
        }
        return defaultJavaCharset;
    }

    public static String getDefaultMIMECharset() {
        if (defaultMIMECharset == null) {
            try {
                defaultMIMECharset = System.getProperty("mail.mime.charset");
            } catch (SecurityException unused) {
            }
        }
        if (defaultMIMECharset == null) {
            defaultMIMECharset = mimeCharset(getDefaultJavaCharset());
        }
        return defaultMIMECharset;
    }

    public static String getEncoding(DataSource dataSource) {
        String encoding;
        String str = "base64";
        if ((dataSource instanceof EncodingAware) && (encoding = ((EncodingAware) dataSource).getEncoding()) != null) {
            return encoding;
        }
        InputStream inputStream = null;
        try {
            ContentType contentType = new ContentType(dataSource.getContentType());
            inputStream = dataSource.getInputStream();
            boolean zMatch = contentType.match("text/*");
            int iCheckAscii = checkAscii(inputStream, -1, !zMatch);
            if (iCheckAscii == 1) {
                str = "7bit";
            } else if (iCheckAscii == 2 && (!zMatch || !nonAsciiCharset(contentType))) {
                str = "quoted-printable";
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return str;
        } catch (Exception unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return "base64";
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    private static int indexOfAny(String str, String str2) {
        return indexOfAny(str, str2, 0);
    }

    public static String javaCharset(String str) {
        Map<String, String> map = mime2java;
        if (map == null || str == null) {
            return str;
        }
        String str2 = map.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 != null) {
            try {
                Charset.forName(str2);
            } catch (Exception unused) {
                str2 = null;
            }
        }
        return str2 == null ? str : str2;
    }

    private static void loadMappings(LineInputStream lineInputStream, Map<String, String> map) {
        while (true) {
            try {
                String line = lineInputStream.readLine();
                if (line == null) {
                    return;
                }
                if (line.startsWith("--") && line.endsWith("--")) {
                    return;
                }
                if (line.trim().length() != 0 && !line.startsWith("#")) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line, " \t");
                    try {
                        String strNextToken = stringTokenizer.nextToken();
                        map.put(strNextToken.toLowerCase(Locale.ENGLISH), stringTokenizer.nextToken());
                    } catch (NoSuchElementException unused) {
                    }
                }
            } catch (IOException unused2) {
                return;
            }
        }
    }

    private static String makesafe(CharSequence charSequence) {
        char cCharAt;
        int i10 = 0;
        while (i10 < charSequence.length() && (cCharAt = charSequence.charAt(i10)) != '\r' && cCharAt != '\n') {
            i10++;
        }
        if (i10 == charSequence.length()) {
            return charSequence.toString();
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() + 1);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(charSequence.toString()));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                if (line.trim().length() != 0) {
                    if (sb2.length() > 0) {
                        sb2.append("\r\n");
                        char cCharAt2 = line.charAt(0);
                        if (cCharAt2 != ' ' && cCharAt2 != '\t') {
                            sb2.append(' ');
                        }
                    }
                    sb2.append(line);
                }
            } catch (IOException unused) {
                return charSequence.toString();
            }
        }
    }

    public static String mimeCharset(String str) {
        String str2;
        Map<String, String> map = java2mime;
        return (map == null || str == null || (str2 = map.get(str.toLowerCase(Locale.ENGLISH))) == null) ? str : str2;
    }

    private static boolean nonAsciiCharset(ContentType contentType) {
        Boolean bool;
        Boolean boolValueOf;
        String parameter = contentType.getParameter("charset");
        if (parameter == null) {
            return false;
        }
        String lowerCase = parameter.toLowerCase(Locale.ENGLISH);
        Map<String, Boolean> map = nonAsciiCharsetMap;
        synchronized (map) {
            bool = map.get(lowerCase);
        }
        if (bool == null) {
            try {
                byte[] bytes = "\r\n".getBytes(lowerCase);
                boolValueOf = Boolean.valueOf((bytes.length == 2 && bytes[0] == 13 && bytes[1] == 10) ? false : true);
            } catch (UnsupportedEncodingException unused) {
                boolValueOf = Boolean.FALSE;
            } catch (RuntimeException unused2) {
                boolValueOf = Boolean.TRUE;
            }
            bool = boolValueOf;
            Map<String, Boolean> map2 = nonAsciiCharsetMap;
            synchronized (map2) {
                map2.put(lowerCase, bool);
            }
        }
        return bool.booleanValue();
    }

    public static final boolean nonascii(int i10) {
        if (i10 < 127) {
            return (i10 >= 32 || i10 == 13 || i10 == 10 || i10 == 9) ? false : true;
        }
        return true;
    }

    public static String quote(String str, String str2) {
        char c10 = 0;
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' || cCharAt == '\\' || cCharAt == '\r' || cCharAt == '\n') {
                StringBuilder sb2 = new StringBuilder(length + 3);
                sb2.append(Typography.quote);
                sb2.append(str.substring(0, i10));
                while (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if ((cCharAt2 == '\"' || cCharAt2 == '\\' || cCharAt2 == '\r' || cCharAt2 == '\n') && (cCharAt2 != '\n' || c10 != '\r')) {
                        sb2.append('\\');
                    }
                    sb2.append(cCharAt2);
                    i10++;
                    c10 = cCharAt2;
                }
                sb2.append(Typography.quote);
                return sb2.toString();
            }
            if (cCharAt < ' ' || ((cCharAt >= 127 && !allowUtf8) || str2.indexOf(cCharAt) >= 0)) {
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(length + 2);
        sb3.append(Typography.quote);
        sb3.append(str);
        sb3.append(Typography.quote);
        return sb3.toString();
    }

    public static String unfold(String str) {
        char cCharAt;
        if (!foldText) {
            return str;
        }
        StringBuilder sb2 = null;
        while (true) {
            int iIndexOfAny = indexOfAny(str, "\r\n");
            if (iIndexOfAny < 0) {
                break;
            }
            int length = str.length();
            int i10 = iIndexOfAny + 1;
            if (i10 < length && str.charAt(iIndexOfAny) == '\r' && str.charAt(i10) == '\n') {
                i10 = iIndexOfAny + 2;
            }
            if (iIndexOfAny > 0) {
                int i11 = iIndexOfAny - 1;
                if (str.charAt(i11) == '\\') {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(str.length());
                    }
                    sb2.append(str.substring(0, i11));
                    sb2.append(str.substring(iIndexOfAny, i10));
                    str = str.substring(i10);
                }
            }
            if (i10 >= length || (cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\t') {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length());
                }
                sb2.append(str.substring(0, iIndexOfAny));
                str = str.substring(i10);
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length());
                }
                sb2.append(str.substring(0, i10));
                str = str.substring(i10);
            }
        }
        if (sb2 == null) {
            return str;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String encodeText(String str, String str2, String str3) {
        return encodeWord(str, str2, str3, false);
    }

    public static String encodeWord(String str, String str2, String str3) {
        return encodeWord(str, str2, str3, true);
    }

    private static int indexOfAny(String str, String str2, int i10) {
        try {
            int length = str.length();
            while (i10 < length) {
                if (str2.indexOf(str.charAt(i10)) >= 0) {
                    return i10;
                }
                i10++;
            }
        } catch (StringIndexOutOfBoundsException unused) {
        }
        return -1;
    }

    public static int checkAscii(byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (byte b10 : bArr) {
            if (nonascii(b10 & UByte.MAX_VALUE)) {
                i10++;
            } else {
                i11++;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i11 > i10 ? 2 : 3;
    }

    private static String encodeWord(String str, String str2, String str3, boolean z10) throws UnsupportedEncodingException {
        String strJavaCharset;
        boolean z11;
        int iCheckAscii = checkAscii(str);
        if (iCheckAscii == 1) {
            return str;
        }
        if (str2 == null) {
            strJavaCharset = getDefaultJavaCharset();
            str2 = getDefaultMIMECharset();
        } else {
            strJavaCharset = javaCharset(str2);
        }
        if (str3 == null) {
            str3 = iCheckAscii != 3 ? "Q" : "B";
        }
        if (str3.equalsIgnoreCase("B")) {
            z11 = true;
        } else {
            if (!str3.equalsIgnoreCase("Q")) {
                throw new UnsupportedEncodingException("Unknown transfer encoding: ".concat(str3));
            }
            z11 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        doEncode(str, z11, strJavaCharset, 68 - str2.length(), C2756Y.m3477a("=?", str2, "?", str3, "?"), true, z10, sb2);
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0091 A[RETURN] */
    public static int checkAscii(InputStream inputStream, int i10, boolean z10) {
        byte[] bArr;
        int i11;
        int i12;
        int i13 = i10;
        int i14 = 0;
        boolean z11 = encodeEolStrict && z10;
        int i15 = -1;
        int iMin = 4096;
        if (i13 != 0) {
            iMin = i13 != -1 ? Math.min(i13, 4096) : 4096;
            bArr = new byte[iMin];
        } else {
            bArr = null;
        }
        int i16 = 0;
        int i17 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i18 = 0;
        while (i13 != 0) {
            try {
                int i19 = inputStream.read(bArr, i14, iMin);
                if (i19 == i15) {
                    break;
                }
                int i20 = 0;
                int i21 = 0;
                i12 = 1;
                while (i21 < i19) {
                    try {
                        int i22 = bArr[i21] & UByte.MAX_VALUE;
                        i11 = 3;
                        if (z11 && ((i20 == 13 && i22 != 10) || (i20 != 13 && i22 == 10))) {
                            z12 = true;
                        }
                        if (i22 == 13 || i22 == 10) {
                            i18 = 0;
                        } else {
                            i18++;
                            if (i18 > 998) {
                                z13 = true;
                            }
                        }
                        try {
                            if (!nonascii(i22)) {
                                i16++;
                            } else {
                                if (z10) {
                                    return 3;
                                }
                                i17++;
                            }
                            i21++;
                            i20 = i22;
                        } catch (IOException unused) {
                            if (i13 != 0) {
                            }
                            if (i17 == 0) {
                                if (i16 > i17) {
                                    return 2;
                                }
                                return i11;
                            }
                            if (z12) {
                                return i11;
                            }
                            if (z13) {
                                return 2;
                            }
                            return i12;
                        }
                    } catch (IOException unused2) {
                        i11 = 3;
                    }
                }
                if (i13 != -1) {
                    i13 -= i19;
                }
                i14 = 0;
                i15 = -1;
            } catch (IOException unused3) {
                i11 = 3;
                i12 = 1;
            }
        }
        i11 = 3;
        i12 = 1;
        if (i13 != 0 && z10) {
            return i11;
        }
        if (i17 == 0) {
            if (i16 > i17) {
                return 2;
            }
            return i11;
        }
        if (z12) {
            return i11;
        }
        if (z13) {
            return 2;
        }
        return i12;
    }

    public static OutputStream encode(OutputStream outputStream, String str, String str2) throws MessagingException {
        if (str != null) {
            if (str.equalsIgnoreCase("base64")) {
                return new BASE64EncoderStream(outputStream);
            }
            if (str.equalsIgnoreCase("quoted-printable")) {
                return new QPEncoderStream(outputStream);
            }
            if (!str.equalsIgnoreCase("uuencode") && !str.equalsIgnoreCase("x-uuencode") && !str.equalsIgnoreCase("x-uue")) {
                if (!str.equalsIgnoreCase(BuildConfig.SDK_DEPENDENCY) && !str.equalsIgnoreCase("7bit") && !str.equalsIgnoreCase("8bit")) {
                    throw new MessagingException("Unknown encoding: ".concat(str));
                }
            } else {
                return new UUEncoderStream(outputStream, str2);
            }
        }
        return outputStream;
    }

    public static String getEncoding(DataHandler dataHandler) {
        if (dataHandler.getName() != null) {
            return getEncoding(dataHandler.getDataSource());
        }
        try {
            if (new ContentType(dataHandler.getContentType()).match("text/*")) {
                AsciiOutputStream asciiOutputStream = new AsciiOutputStream(false, false);
                try {
                    dataHandler.writeTo(asciiOutputStream);
                } catch (IOException unused) {
                }
                int ascii = asciiOutputStream.getAscii();
                if (ascii != 1) {
                    if (ascii != 2) {
                        return "base64";
                    }
                    return "quoted-printable";
                }
            } else {
                AsciiOutputStream asciiOutputStream2 = new AsciiOutputStream(true, encodeEolStrict);
                try {
                    dataHandler.writeTo(asciiOutputStream2);
                } catch (IOException unused2) {
                }
                if (asciiOutputStream2.getAscii() != 1) {
                    return "base64";
                }
            }
            return "7bit";
        } catch (Exception unused3) {
            return "base64";
        }
    }
}
