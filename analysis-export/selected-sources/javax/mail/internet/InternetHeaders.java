package javax.mail.internet;

import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.PropUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.mail.Header;
import javax.mail.MessagingException;
import p002A1.C0021a;
import p219M2.C3480c;
import p470a1.C6989a;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class InternetHeaders {
    private static final boolean ignoreWhitespaceLines = PropUtil.getBooleanSystemProperty("mail.mime.ignorewhitespacelines", false);
    protected List<InternetHeader> headers;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class MatchEnum {

        /* JADX INFO: renamed from: e */
        private Iterator<InternetHeader> f50059e;
        private boolean match;
        private String[] names;
        private InternetHeader next_header = null;
        private boolean want_line;

        public MatchEnum(List<InternetHeader> list, String[] strArr, boolean z10, boolean z11) {
            this.f50059e = list.iterator();
            this.names = strArr;
            this.match = z10;
            this.want_line = z11;
        }

        private InternetHeader nextMatch() {
            while (this.f50059e.hasNext()) {
                InternetHeader next = this.f50059e.next();
                if (next.line != null) {
                    if (this.names != null) {
                        int i10 = 0;
                        while (true) {
                            String[] strArr = this.names;
                            if (i10 >= strArr.length) {
                                if (this.match) {
                                    break;
                                }
                            } else if (!strArr[i10].equalsIgnoreCase(next.getName())) {
                                i10++;
                            } else if (!this.match) {
                                break;
                            }
                        }
                    } else if (this.match) {
                        return null;
                    }
                    return next;
                }
            }
            return null;
        }

        public boolean hasMoreElements() {
            if (this.next_header == null) {
                this.next_header = nextMatch();
            }
            return this.next_header != null;
        }

        public Object nextElement() {
            if (this.next_header == null) {
                this.next_header = nextMatch();
            }
            InternetHeader internetHeader = this.next_header;
            if (internetHeader == null) {
                throw new NoSuchElementException("No more headers");
            }
            this.next_header = null;
            return this.want_line ? internetHeader.line : new Header(internetHeader.getName(), internetHeader.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class MatchHeaderEnum extends MatchEnum implements Enumeration<Header> {
        public MatchHeaderEnum(List<InternetHeader> list, String[] strArr, boolean z10) {
            super(list, strArr, z10, false);
        }

        @Override // javax.mail.internet.InternetHeaders.MatchEnum, java.util.Enumeration
        public Header nextElement() {
            return (Header) super.nextElement();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class MatchStringEnum extends MatchEnum implements Enumeration<String> {
        public MatchStringEnum(List<InternetHeader> list, String[] strArr, boolean z10) {
            super(list, strArr, z10, true);
        }

        @Override // javax.mail.internet.InternetHeaders.MatchEnum, java.util.Enumeration
        public String nextElement() {
            return (String) super.nextElement();
        }
    }

    public InternetHeaders() {
        ArrayList arrayList = new ArrayList(40);
        this.headers = arrayList;
        arrayList.add(new InternetHeader("Return-Path", null));
        C3480c.m4261a("Received", null, this.headers);
        C3480c.m4261a("Resent-Date", null, this.headers);
        C3480c.m4261a("Resent-From", null, this.headers);
        C3480c.m4261a("Resent-Sender", null, this.headers);
        C3480c.m4261a("Resent-To", null, this.headers);
        C3480c.m4261a("Resent-Cc", null, this.headers);
        C3480c.m4261a("Resent-Bcc", null, this.headers);
        C3480c.m4261a("Resent-Message-Id", null, this.headers);
        C3480c.m4261a("Date", null, this.headers);
        C3480c.m4261a("From", null, this.headers);
        C3480c.m4261a("Sender", null, this.headers);
        C3480c.m4261a("Reply-To", null, this.headers);
        C3480c.m4261a("To", null, this.headers);
        C3480c.m4261a("Cc", null, this.headers);
        C3480c.m4261a("Bcc", null, this.headers);
        C3480c.m4261a("Message-Id", null, this.headers);
        C3480c.m4261a("In-Reply-To", null, this.headers);
        C3480c.m4261a("References", null, this.headers);
        C3480c.m4261a("Subject", null, this.headers);
        C3480c.m4261a("Comments", null, this.headers);
        C3480c.m4261a("Keywords", null, this.headers);
        C3480c.m4261a("Errors-To", null, this.headers);
        C3480c.m4261a("MIME-Version", null, this.headers);
        C3480c.m4261a("Content-Type", null, this.headers);
        C3480c.m4261a("Content-Transfer-Encoding", null, this.headers);
        C3480c.m4261a("Content-MD5", null, this.headers);
        C3480c.m4261a(StringUtils.PROCESS_POSTFIX_DELIMITER, null, this.headers);
        C3480c.m4261a("Content-Length", null, this.headers);
        C3480c.m4261a("Status", null, this.headers);
    }

    private static final boolean isEmpty(String str) {
        if (str.length() != 0) {
            return ignoreWhitespaceLines && str.trim().length() == 0;
        }
        return true;
    }

    public void addHeader(String str, String str2) {
        int size = this.headers.size();
        boolean z10 = str.equalsIgnoreCase("Received") || str.equalsIgnoreCase("Return-Path");
        if (z10) {
            size = 0;
        }
        for (int size2 = this.headers.size() - 1; size2 >= 0; size2--) {
            InternetHeader internetHeader = this.headers.get(size2);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                if (!z10) {
                    this.headers.add(size2 + 1, new InternetHeader(str, str2));
                    return;
                }
                size = size2;
            }
            if (!z10 && internetHeader.getName().equals(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                size = size2;
            }
        }
        this.headers.add(size, new InternetHeader(str, str2));
    }

    public void addHeaderLine(String str) {
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt != ' ' && cCharAt != '\t') {
                this.headers.add(new InternetHeader(str));
                return;
            }
            List<InternetHeader> list = this.headers;
            list.get(list.size() - 1).line += "\r\n" + str;
        } catch (StringIndexOutOfBoundsException | NoSuchElementException unused) {
        }
    }

    public Enumeration<String> getAllHeaderLines() {
        return getNonMatchingHeaderLines(null);
    }

    public Enumeration<Header> getAllHeaders() {
        return new MatchHeaderEnum(this.headers, null, false);
    }

    public String[] getHeader(String str) {
        ArrayList arrayList = new ArrayList();
        for (InternetHeader internetHeader : this.headers) {
            if (str.equalsIgnoreCase(internetHeader.getName()) && internetHeader.line != null) {
                arrayList.add(internetHeader.getValue());
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Enumeration<String> getMatchingHeaderLines(String[] strArr) {
        return new MatchStringEnum(this.headers, strArr, true);
    }

    public Enumeration<Header> getMatchingHeaders(String[] strArr) {
        return new MatchHeaderEnum(this.headers, strArr, true);
    }

    public Enumeration<String> getNonMatchingHeaderLines(String[] strArr) {
        return new MatchStringEnum(this.headers, strArr, false);
    }

    public Enumeration<Header> getNonMatchingHeaders(String[] strArr) {
        return new MatchHeaderEnum(this.headers, strArr, false);
    }

    public void load(InputStream inputStream) throws MessagingException {
        load(inputStream, false);
    }

    public void removeHeader(String str) {
        for (int i10 = 0; i10 < this.headers.size(); i10++) {
            InternetHeader internetHeader = this.headers.get(i10);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                internetHeader.line = null;
            }
        }
    }

    public void setHeader(String str, String str2) {
        int iIndexOf;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this.headers.size()) {
            InternetHeader internetHeader = this.headers.get(i10);
            if (str.equalsIgnoreCase(internetHeader.getName())) {
                if (z10) {
                    this.headers.remove(i10);
                    i10--;
                } else {
                    String str3 = internetHeader.line;
                    if (str3 == null || (iIndexOf = str3.indexOf(58)) < 0) {
                        internetHeader.line = C0021a.m43a(str, ": ", str2);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(internetHeader.line.substring(0, iIndexOf + 1));
                        internetHeader.line = C6989a.m7848b(" ", str2, sb2);
                    }
                    z10 = true;
                }
            }
            i10++;
        }
        if (z10) {
            return;
        }
        addHeader(str, str2);
    }

    public void load(InputStream inputStream, boolean z10) throws MessagingException {
        LineInputStream lineInputStream = new LineInputStream(inputStream, z10);
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        String str = null;
        while (true) {
            try {
                String line = lineInputStream.readLine();
                if (line == null || !(line.startsWith(" ") || line.startsWith("\t"))) {
                    if (str != null) {
                        addHeaderLine(str);
                    } else if (sb2.length() > 0) {
                        addHeaderLine(sb2.toString());
                        sb2.setLength(0);
                    }
                    str = line;
                } else {
                    if (str != null) {
                        sb2.append(str);
                        str = null;
                    }
                    if (z11) {
                        String strTrim = line.trim();
                        if (strTrim.length() > 0) {
                            sb2.append(strTrim);
                        }
                    } else {
                        if (sb2.length() > 0) {
                            sb2.append("\r\n");
                        }
                        sb2.append(line);
                    }
                }
                if (line == null || isEmpty(line)) {
                    return;
                } else {
                    z11 = false;
                }
            } catch (IOException e10) {
                throw new MessagingException("Error in input stream", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class InternetHeader extends Header {
        String line;

        public InternetHeader(String str) {
            super("", "");
            int iIndexOf = str.indexOf(58);
            if (iIndexOf < 0) {
                this.name = str.trim();
            } else {
                this.name = str.substring(0, iIndexOf).trim();
            }
            this.line = str;
        }

        @Override // javax.mail.Header
        public String getValue() {
            char cCharAt;
            int iIndexOf = this.line.indexOf(58);
            if (iIndexOf < 0) {
                return this.line;
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= this.line.length() || ((cCharAt = this.line.charAt(iIndexOf)) != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n')) {
                    break;
                }
            }
            return this.line.substring(iIndexOf);
        }

        public InternetHeader(String str, String str2) {
            super(str, "");
            if (str2 != null) {
                this.line = C0021a.m43a(str, ": ", str2);
            } else {
                this.line = null;
            }
        }
    }

    public String getHeader(String str, String str2) {
        String[] header = getHeader(str);
        if (header == null) {
            return null;
        }
        if (header.length != 1 && str2 != null) {
            StringBuilder sb2 = new StringBuilder(header[0]);
            for (int i10 = 1; i10 < header.length; i10++) {
                sb2.append(str2);
                sb2.append(header[i10]);
            }
            return sb2.toString();
        }
        return header[0];
    }

    public InternetHeaders(InputStream inputStream) {
        this(inputStream, false);
    }

    public InternetHeaders(InputStream inputStream, boolean z10) throws MessagingException {
        this.headers = new ArrayList(40);
        load(inputStream, z10);
    }
}
