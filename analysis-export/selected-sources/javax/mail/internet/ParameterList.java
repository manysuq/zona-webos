package javax.mail.internet;

import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.PropUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.UByte;
import p020B1.C0223g;
import p397W0.C5751I;
import p450Z.C6628k;
import p622j.C15292t;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class ParameterList {
    private String lastName;
    private Map<String, Object> list;
    private Set<String> multisegmentNames;
    private Map<String, Object> slist;
    private static final boolean encodeParameters = PropUtil.getBooleanSystemProperty("mail.mime.encodeparameters", true);
    private static final boolean decodeParameters = PropUtil.getBooleanSystemProperty("mail.mime.decodeparameters", true);
    private static final boolean decodeParametersStrict = PropUtil.getBooleanSystemProperty("mail.mime.decodeparameters.strict", false);
    private static final boolean applehack = PropUtil.getBooleanSystemProperty("mail.mime.applefilenames", false);
    private static final boolean windowshack = PropUtil.getBooleanSystemProperty("mail.mime.windowsfilenames", false);
    private static final boolean parametersStrict = PropUtil.getBooleanSystemProperty("mail.mime.parameters.strict", true);
    private static final boolean splitLongParameters = PropUtil.getBooleanSystemProperty("mail.mime.splitlongparameters", true);
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class LiteralValue {
        String value;

        private LiteralValue() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class MultiValue extends ArrayList<Object> {
        private static final long serialVersionUID = 699561094618751023L;
        String value;

        private MultiValue() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class ParamEnum implements Enumeration<String> {

        /* JADX INFO: renamed from: it */
        private Iterator<String> f50063it;

        public ParamEnum(Iterator<String> it) {
            this.f50063it = it;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f50063it.hasNext();
        }

        @Override // java.util.Enumeration
        public String nextElement() {
            return this.f50063it.next();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class ToStringBuffer {

        /* JADX INFO: renamed from: sb */
        private StringBuilder f50064sb = new StringBuilder();
        private int used;

        public ToStringBuffer(int i10) {
            this.used = i10;
        }

        public void addNV(String str, String str2) {
            this.f50064sb.append("; ");
            this.used += 2;
            if (this.used + str2.length() + str.length() + 1 > 76) {
                this.f50064sb.append("\r\n\t");
                this.used = 8;
            }
            StringBuilder sb2 = this.f50064sb;
            sb2.append(str);
            sb2.append('=');
            int length = str.length() + 1 + this.used;
            this.used = length;
            if (str2.length() + length <= 76) {
                this.f50064sb.append(str2);
                this.used = str2.length() + this.used;
                return;
            }
            String strFold = MimeUtility.fold(this.used, str2);
            this.f50064sb.append(strFold);
            int iLastIndexOf = strFold.lastIndexOf(10);
            if (iLastIndexOf >= 0) {
                this.used = ((strFold.length() - iLastIndexOf) - 1) + this.used;
            } else {
                this.used = strFold.length() + this.used;
            }
        }

        public String toString() {
            return this.f50064sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class Value {
        String charset;
        String encodedValue;
        String value;

        private Value() {
        }
    }

    public ParameterList() {
        this.list = new LinkedHashMap();
        this.lastName = null;
        if (decodeParameters) {
            this.multisegmentNames = new HashSet();
            this.slist = new HashMap();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c A[Catch: all -> 0x0049, UnsupportedEncodingException -> 0x0062, TryCatch #2 {UnsupportedEncodingException -> 0x0062, blocks: (B:23:0x005d, B:27:0x0066, B:31:0x0072, B:32:0x0079, B:29:0x006c), top: B:89:0x005d, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x0049, UnsupportedEncodingException -> 0x0062, TryCatch #2 {UnsupportedEncodingException -> 0x0062, blocks: (B:23:0x005d, B:27:0x0066, B:31:0x0072, B:32:0x0079, B:29:0x006c), top: B:89:0x005d, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0049, UnsupportedEncodingException -> 0x0062, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x0062, blocks: (B:23:0x005d, B:27:0x0066, B:31:0x0072, B:32:0x0079, B:29:0x006c), top: B:89:0x005d, outer: #4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    private void combineMultisegmentNames(boolean z10) throws ParseException {
        try {
            for (String str : this.multisegmentNames) {
                String strJavaCharset = null;
                MultiValue multiValue = new MultiValue();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i10 = 0;
                while (true) {
                    String str2 = str + "*" + i10;
                    Object obj = this.slist.get(str2);
                    if (obj == null) {
                        break;
                    }
                    multiValue.add(obj);
                    try {
                        if (obj instanceof Value) {
                            Value value = (Value) obj;
                            if (i10 == 0) {
                                strJavaCharset = value.charset;
                            } else if (strJavaCharset == null) {
                                this.multisegmentNames.remove(str);
                                break;
                            }
                            decodeBytes(value.value, byteArrayOutputStream);
                        } else {
                            byteArrayOutputStream.write(ASCIIUtility.getBytes((String) obj));
                        }
                    } catch (IOException unused) {
                    }
                    this.slist.remove(str2);
                    i10++;
                }
                if (i10 == 0) {
                    this.list.remove(str);
                } else {
                    if (strJavaCharset != null) {
                        try {
                            strJavaCharset = MimeUtility.javaCharset(strJavaCharset);
                            if (strJavaCharset != null || strJavaCharset.length() == 0) {
                                strJavaCharset = MimeUtility.getDefaultJavaCharset();
                            }
                            if (strJavaCharset != null) {
                                multiValue.value = byteArrayOutputStream.toString(strJavaCharset);
                            } else {
                                multiValue.value = byteArrayOutputStream.toString();
                            }
                        } catch (UnsupportedEncodingException e10) {
                            if (decodeParametersStrict) {
                                throw new ParseException(e10.toString());
                            }
                            try {
                                multiValue.value = byteArrayOutputStream.toString("iso-8859-1");
                            } catch (UnsupportedEncodingException unused2) {
                            }
                        }
                    } else {
                        if (strJavaCharset != null) {
                            strJavaCharset = MimeUtility.getDefaultJavaCharset();
                        } else {
                            strJavaCharset = MimeUtility.getDefaultJavaCharset();
                        }
                        if (strJavaCharset != null) {
                            multiValue.value = byteArrayOutputStream.toString(strJavaCharset);
                        } else {
                            multiValue.value = byteArrayOutputStream.toString();
                        }
                    }
                    this.list.put(str, multiValue);
                }
            }
            if (this.slist.size() > 0) {
                for (Object obj2 : this.slist.values()) {
                    if (obj2 instanceof Value) {
                        Value value2 = (Value) obj2;
                        try {
                            value2.value = decodeBytes(value2.value, value2.charset);
                        } catch (UnsupportedEncodingException e11) {
                            if (decodeParametersStrict) {
                                throw new ParseException(e11.toString());
                            }
                        }
                    }
                }
                this.list.putAll(this.slist);
            }
            this.multisegmentNames.clear();
            this.slist.clear();
        } catch (Throwable th) {
            if (z10) {
                if (this.slist.size() > 0) {
                    for (Object obj3 : this.slist.values()) {
                        if (obj3 instanceof Value) {
                            Value value3 = (Value) obj3;
                            try {
                                value3.value = decodeBytes(value3.value, value3.charset);
                            } catch (UnsupportedEncodingException e12) {
                                if (decodeParametersStrict) {
                                    throw new ParseException(e12.toString());
                                }
                            }
                        }
                    }
                    this.list.putAll(this.slist);
                }
                this.multisegmentNames.clear();
                this.slist.clear();
            }
            throw th;
        }
    }

    private static String decodeBytes(String str, String str2) throws ParseException {
        byte[] bArr = new byte[str.length()];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                try {
                    cCharAt = (char) Integer.parseInt(str.substring(i10 + 1, i10 + 3), 16);
                    i10 += 2;
                } catch (NumberFormatException e10) {
                    if (decodeParametersStrict) {
                        throw new ParseException(e10.toString());
                    }
                } catch (StringIndexOutOfBoundsException e11) {
                    if (decodeParametersStrict) {
                        throw new ParseException(e11.toString());
                    }
                }
            }
            bArr[i11] = (byte) cCharAt;
            i10++;
            i11++;
        }
        if (str2 != null) {
            str2 = MimeUtility.javaCharset(str2);
        }
        if (str2 == null || str2.length() == 0) {
            str2 = MimeUtility.getDefaultJavaCharset();
        }
        return new String(bArr, 0, i11, str2);
    }

    private static Value encodeValue(String str, String str2) {
        if (MimeUtility.checkAscii(str) == 1) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes(MimeUtility.javaCharset(str2));
            StringBuffer stringBuffer = new StringBuffer(str2.length() + bytes.length + 2);
            stringBuffer.append(str2);
            stringBuffer.append("''");
            for (byte b10 : bytes) {
                char c10 = (char) (b10 & UByte.MAX_VALUE);
                if (c10 <= ' ' || c10 >= 127 || c10 == '*' || c10 == '\'' || c10 == '%' || HeaderTokenizer.MIME.indexOf(c10) >= 0) {
                    stringBuffer.append('%');
                    char[] cArr = hex;
                    stringBuffer.append(cArr[c10 >> 4]);
                    stringBuffer.append(cArr[c10 & 15]);
                } else {
                    stringBuffer.append(c10);
                }
            }
            Value value = new Value();
            value.charset = str2;
            value.value = str;
            value.encodedValue = stringBuffer.toString();
            return value;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static Value extractCharset(String str) throws ParseException {
        Value value = new Value();
        value.encodedValue = str;
        value.value = str;
        try {
            int iIndexOf = str.indexOf(39);
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(0, iIndexOf);
                int iIndexOf2 = str.indexOf(39, iIndexOf + 1);
                if (iIndexOf2 >= 0) {
                    value.value = str.substring(iIndexOf2 + 1);
                    value.charset = strSubstring;
                    return value;
                }
                if (decodeParametersStrict) {
                    throw new ParseException("Missing language in encoded value: ".concat(str));
                }
            } else if (decodeParametersStrict) {
                throw new ParseException("Missing charset in encoded value: ".concat(str));
            }
        } catch (NumberFormatException e10) {
            if (decodeParametersStrict) {
                throw new ParseException(e10.toString());
            }
        } catch (StringIndexOutOfBoundsException e11) {
            if (decodeParametersStrict) {
                throw new ParseException(e11.toString());
            }
        }
        return value;
    }

    private void putEncodedName(String str, String str2) throws ParseException {
        Object obj;
        Value valueExtractCharset;
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            this.list.put(str, str2);
            return;
        }
        if (iIndexOf == str.length() - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            Value valueExtractCharset2 = extractCharset(str2);
            try {
                valueExtractCharset2.value = decodeBytes(valueExtractCharset2.value, valueExtractCharset2.charset);
            } catch (UnsupportedEncodingException e10) {
                if (decodeParametersStrict) {
                    throw new ParseException(e10.toString());
                }
            }
            this.list.put(strSubstring, valueExtractCharset2);
            return;
        }
        String strSubstring2 = str.substring(0, iIndexOf);
        this.multisegmentNames.add(strSubstring2);
        this.list.put(strSubstring2, "");
        if (str.endsWith("*")) {
            if (str.endsWith("*0*")) {
                obj = str2;
                valueExtractCharset = extractCharset(str2);
            } else {
                obj = str2;
                Value value = new Value();
                value.encodedValue = str2;
                value.value = str2;
                valueExtractCharset = value;
            }
            str = C5751I.m6397a(1, 0, str);
            obj = valueExtractCharset;
        }
        obj = str2;
        this.slist.put(str, obj);
    }

    private static String quote(String str) {
        return MimeUtility.quote(str, HeaderTokenizer.MIME);
    }

    public void combineSegments() {
        if (!decodeParameters || this.multisegmentNames.size() <= 0) {
            return;
        }
        try {
            combineMultisegmentNames(true);
        } catch (ParseException unused) {
        }
    }

    public String get(String str) {
        Object obj = this.list.get(str.trim().toLowerCase(Locale.ENGLISH));
        if (obj instanceof MultiValue) {
            return ((MultiValue) obj).value;
        }
        if (obj instanceof LiteralValue) {
            return ((LiteralValue) obj).value;
        }
        return obj instanceof Value ? ((Value) obj).value : (String) obj;
    }

    public Enumeration<String> getNames() {
        return new ParamEnum(this.list.keySet().iterator());
    }

    public void remove(String str) {
        this.list.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public void set(String str, String str2) {
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        if (!decodeParameters) {
            this.list.put(lowerCase, str2);
            return;
        }
        try {
            putEncodedName(lowerCase, str2);
        } catch (ParseException unused) {
            this.list.put(lowerCase, str2);
        }
    }

    public void setLiteral(String str, String str2) {
        LiteralValue literalValue = new LiteralValue();
        literalValue.value = str2;
        this.list.put(str, literalValue);
    }

    public int size() {
        return this.list.size();
    }

    public String toString() {
        return toString(0);
    }

    public String toString(int i10) {
        String str;
        String str2;
        ToStringBuffer toStringBuffer = new ToStringBuffer(i10);
        for (Map.Entry<String, Object> entry : this.list.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof MultiValue) {
                MultiValue multiValue = (MultiValue) value;
                String strM7436a = C6628k.m7436a(key, "*");
                for (int i11 = 0; i11 < multiValue.size(); i11++) {
                    Object obj = multiValue.get(i11);
                    if (obj instanceof Value) {
                        str = strM7436a + i11 + "*";
                        str2 = ((Value) obj).encodedValue;
                    } else {
                        str = strM7436a + i11;
                        str2 = (String) obj;
                    }
                    toStringBuffer.addNV(str, quote(str2));
                }
            } else if (value instanceof LiteralValue) {
                toStringBuffer.addNV(key, quote(((LiteralValue) value).value));
            } else if (value instanceof Value) {
                toStringBuffer.addNV(C6628k.m7436a(key, "*"), quote(((Value) value).encodedValue));
            } else {
                String strSubstring = (String) value;
                if (strSubstring.length() > 60 && splitLongParameters && encodeParameters) {
                    String strM7436a2 = C6628k.m7436a(key, "*");
                    int i12 = 0;
                    while (strSubstring.length() > 60) {
                        toStringBuffer.addNV(strM7436a2 + i12, quote(strSubstring.substring(0, 60)));
                        strSubstring = strSubstring.substring(60);
                        i12++;
                    }
                    if (strSubstring.length() > 0) {
                        toStringBuffer.addNV(strM7436a2 + i12, quote(strSubstring));
                    }
                } else {
                    toStringBuffer.addNV(key, quote(strSubstring));
                }
            }
        }
        return toStringBuffer.toString();
    }

    public void set(String str, String str2, String str3) {
        if (encodeParameters) {
            Value valueEncodeValue = encodeValue(str2, str3);
            if (valueEncodeValue != null) {
                this.list.put(str.trim().toLowerCase(Locale.ENGLISH), valueEncodeValue);
                return;
            } else {
                set(str, str2);
                return;
            }
        }
        set(str, str2);
    }

    public ParameterList(String str) throws ParseException {
        HeaderTokenizer.Token next;
        String str2;
        this();
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(str, HeaderTokenizer.MIME);
        while (true) {
            HeaderTokenizer.Token next2 = headerTokenizer.next();
            int type = next2.getType();
            if (type == -4) {
                break;
            }
            if (((char) type) == ';') {
                HeaderTokenizer.Token next3 = headerTokenizer.next();
                if (next3.getType() == -4) {
                    break;
                }
                if (next3.getType() == -1) {
                    String lowerCase = next3.getValue().toLowerCase(Locale.ENGLISH);
                    HeaderTokenizer.Token next4 = headerTokenizer.next();
                    if (((char) next4.getType()) == '=') {
                        if (windowshack && (lowerCase.equals(IMAPStore.ID_NAME) || lowerCase.equals("filename"))) {
                            next = headerTokenizer.next(';', true);
                        } else if (parametersStrict) {
                            next = headerTokenizer.next();
                        } else {
                            next = headerTokenizer.next(';');
                        }
                        int type2 = next.getType();
                        if (type2 != -1 && type2 != -2) {
                            StringBuilder sbM18009a = C15292t.m18009a("In parameter list <", str, ">, expected parameter value, got \"");
                            sbM18009a.append(next.getValue());
                            sbM18009a.append("\"");
                            throw new ParseException(sbM18009a.toString());
                        }
                        String value = next.getValue();
                        this.lastName = lowerCase;
                        if (decodeParameters) {
                            putEncodedName(lowerCase, value);
                        } else {
                            this.list.put(lowerCase, value);
                        }
                    } else {
                        StringBuilder sbM18009a2 = C15292t.m18009a("In parameter list <", str, ">, expected '=', got \"");
                        sbM18009a2.append(next4.getValue());
                        sbM18009a2.append("\"");
                        throw new ParseException(sbM18009a2.toString());
                    }
                } else {
                    StringBuilder sbM18009a3 = C15292t.m18009a("In parameter list <", str, ">, expected parameter name, got \"");
                    sbM18009a3.append(next3.getValue());
                    sbM18009a3.append("\"");
                    throw new ParseException(sbM18009a3.toString());
                }
            } else if (type == -1 && (str2 = this.lastName) != null && ((applehack && (str2.equals(IMAPStore.ID_NAME) || this.lastName.equals("filename"))) || !parametersStrict)) {
                StringBuilder sbM351a = C0223g.m351a((String) this.list.get(this.lastName), " ");
                sbM351a.append(next2.getValue());
                this.list.put(this.lastName, sbM351a.toString());
            } else {
                StringBuilder sbM18009a4 = C15292t.m18009a("In parameter list <", str, ">, expected ';', got \"");
                sbM18009a4.append(next2.getValue());
                sbM18009a4.append("\"");
                throw new ParseException(sbM18009a4.toString());
            }
        }
        if (decodeParameters) {
            combineMultisegmentNames(false);
        }
    }

    private static void decodeBytes(String str, OutputStream outputStream) throws ParseException, IOException {
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%') {
                try {
                    cCharAt = (char) Integer.parseInt(str.substring(i10 + 1, i10 + 3), 16);
                    i10 += 2;
                } catch (NumberFormatException e10) {
                    if (decodeParametersStrict) {
                        throw new ParseException(e10.toString());
                    }
                } catch (StringIndexOutOfBoundsException e11) {
                    if (decodeParametersStrict) {
                        throw new ParseException(e11.toString());
                    }
                }
            }
            outputStream.write((byte) cCharAt);
            i10++;
        }
    }
}
