package com.sun.mail.util.logging;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.ErrorManager;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import javax.activation.DataHandler;
import javax.activation.FileTypeMap;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessageContext;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.SendFailedException;
import javax.mail.Service;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.ContentType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimePart;
import javax.mail.internet.MimeUtility;
import javax.mail.util.ByteArrayDataSource;
import p288Q.C4279I1;
import p644k0.C15569B0;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class MailHandler extends Handler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MIN_HEADER_SIZE = 1024;
    private volatile Filter[] attachmentFilters;
    private Formatter[] attachmentFormatters;
    private Formatter[] attachmentNames;
    private Authenticator auth;
    private int capacity;
    private Comparator<? super LogRecord> comparator;
    private FileTypeMap contentTypes;
    private LogRecord[] data;
    private String encoding;
    private volatile Filter filter;
    private Formatter formatter;
    private boolean isWriting;
    private Properties mailProps;
    private int[] matched;
    private Filter pushFilter;
    private Level pushLevel;
    private volatile boolean sealed;
    private Session session;
    private int size;
    private Formatter subjectFormatter;
    private static final Filter[] EMPTY_FILTERS = new Filter[0];
    private static final Formatter[] EMPTY_FORMATTERS = new Formatter[0];
    private static final int offValue = Level.OFF.intValue();
    private static final PrivilegedAction<Object> MAILHANDLER_LOADER = new GetAndSetContext(MailHandler.class);
    private static final ThreadLocal<Integer> MUTEX = new ThreadLocal<>();
    private static final Integer MUTEX_PUBLISH = -2;
    private static final Integer MUTEX_REPORT = -4;
    private static final Integer MUTEX_LINKAGE = -8;
    private volatile Level logLevel = Level.ALL;
    private volatile ErrorManager errorManager = defaultErrorManager();

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class DefaultAuthenticator extends Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final String pass;

        private DefaultAuthenticator(String str) {
            this.pass = str;
        }

        /* JADX INFO: renamed from: of */
        public static Authenticator m12171of(String str) {
            return new DefaultAuthenticator(str);
        }

        @Override // javax.mail.Authenticator
        public final PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(getDefaultUserName(), this.pass);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class GetAndSetContext implements PrivilegedAction<Object> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final Object NOT_MODIFIED = GetAndSetContext.class;
        private final Object source;

        public GetAndSetContext(Object obj) {
            this.source = obj;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            ClassLoader contextClassLoader;
            Thread threadCurrentThread = Thread.currentThread();
            ClassLoader contextClassLoader2 = threadCurrentThread.getContextClassLoader();
            Object obj = this.source;
            if (obj == null) {
                contextClassLoader = null;
            } else if (obj instanceof ClassLoader) {
                contextClassLoader = (ClassLoader) obj;
            } else if (obj instanceof Class) {
                contextClassLoader = ((Class) obj).getClassLoader();
            } else {
                contextClassLoader = obj instanceof Thread ? ((Thread) obj).getContextClassLoader() : obj.getClass().getClassLoader();
            }
            if (contextClassLoader2 == contextClassLoader) {
                return NOT_MODIFIED;
            }
            threadCurrentThread.setContextClassLoader(contextClassLoader);
            return contextClassLoader2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class TailNameFormatter extends Formatter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final String name;

        private TailNameFormatter(String str) {
            this.name = str;
        }

        /* JADX INFO: renamed from: of */
        public static Formatter m12172of(String str) {
            return new TailNameFormatter(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof TailNameFormatter) {
                return this.name.equals(((TailNameFormatter) obj).name);
            }
            return false;
        }

        @Override // java.util.logging.Formatter
        public final String format(LogRecord logRecord) {
            return "";
        }

        @Override // java.util.logging.Formatter
        public final String getTail(Handler handler) {
            return this.name;
        }

        public final int hashCode() {
            return this.name.hashCode() + TailNameFormatter.class.hashCode();
        }

        public final String toString() {
            return this.name;
        }
    }

    public MailHandler() {
        init(null);
        this.sealed = true;
        checkAccess();
    }

    private boolean alignAttachmentFilters() {
        int length = this.attachmentFormatters.length;
        int length2 = this.attachmentFilters.length;
        boolean z10 = false;
        if (length2 != length) {
            this.attachmentFilters = (Filter[]) Arrays.copyOf(this.attachmentFilters, length, Filter[].class);
            clearMatches(length2);
            z10 = length2 != 0;
            Filter filter = this.filter;
            if (filter != null) {
                while (length2 < length) {
                    this.attachmentFilters[length2] = filter;
                    length2++;
                }
            }
        }
        if (length == 0) {
            this.attachmentFilters = emptyFilterArray();
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private boolean alignAttachmentNames() {
        boolean z10;
        int length = this.attachmentFormatters.length;
        Formatter[] formatterArr = this.attachmentNames;
        int length2 = formatterArr.length;
        if (length2 != length) {
            this.attachmentNames = (Formatter[]) Arrays.copyOf(formatterArr, length, Formatter[].class);
            if (length2 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (length == 0) {
            this.attachmentNames = emptyFormatterArray();
            return z10;
        }
        for (int i10 = 0; i10 < length; i10++) {
            Formatter[] formatterArr2 = this.attachmentNames;
            if (formatterArr2[i10] == null) {
                formatterArr2[i10] = TailNameFormatter.m12172of(toString(this.attachmentFormatters[i10]));
            }
        }
        return z10;
    }

    private boolean allowRestrictedHeaders() {
        return LogManagerProperties.hasLogManager();
    }

    private void appendContentLang(MimePart mimePart, Locale locale) {
        try {
            String languageTag = LogManagerProperties.toLanguageTag(locale);
            if (languageTag.length() != 0) {
                String header = mimePart.getHeader("Content-Language", null);
                if (isEmpty(header)) {
                    mimePart.setHeader("Content-Language", languageTag);
                    return;
                }
                if (header.equalsIgnoreCase(languageTag)) {
                    return;
                }
                String strConcat = StringUtils.COMMA.concat(languageTag);
                int iIndexOf = 0;
                do {
                    iIndexOf = header.indexOf(strConcat, iIndexOf);
                    if (iIndexOf <= -1 || (iIndexOf = iIndexOf + strConcat.length()) == header.length()) {
                        break;
                    }
                } while (header.charAt(iIndexOf) != ',');
                if (iIndexOf < 0) {
                    int iLastIndexOf = header.lastIndexOf("\r\n\t");
                    mimePart.setHeader("Content-Language", (iLastIndexOf < 0 ? header.length() + 20 : (header.length() - iLastIndexOf) + 8) + strConcat.length() > 76 ? header.concat("\r\n\t".concat(strConcat)) : header.concat(strConcat));
                }
            }
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private void appendFileName(Part part, String str) {
        if (str == null) {
            reportNullError(5);
        } else if (str.length() > 0) {
            appendFileName0(part, str);
        }
    }

    private void appendFileName0(Part part, String str) {
        try {
            String strReplaceAll = str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
            String fileName = part.getFileName();
            if (fileName != null) {
                strReplaceAll = fileName.concat(strReplaceAll);
            }
            part.setFileName(strReplaceAll);
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private void appendSubject(Message message, String str) {
        if (str == null) {
            reportNullError(5);
        } else if (str.length() > 0) {
            appendSubject0(message, str);
        }
    }

    private void appendSubject0(Message message, String str) {
        try {
            String strReplaceAll = str.replaceAll("[\\x00-\\x1F\\x7F]+", "");
            String encodingName = getEncodingName();
            String subject = message.getSubject();
            MimeMessage mimeMessage = (MimeMessage) message;
            if (subject != null) {
                strReplaceAll = subject.concat(strReplaceAll);
            }
            mimeMessage.setSubject(strReplaceAll, MimeUtility.mimeCharset(encodingName));
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private static String atIndexMsg(int i10) {
        return C4279I1.m4961a("At index: ", i10, '.');
    }

    private static MessagingException attach(MessagingException messagingException, Exception exc) {
        if (exc != null && !messagingException.setNextException(exc)) {
            if (exc instanceof MessagingException) {
                MessagingException messagingException2 = (MessagingException) exc;
                if (messagingException2.setNextException(messagingException)) {
                    return messagingException2;
                }
            }
            if (exc != messagingException) {
                messagingException.addSuppressed(exc);
            }
        }
        return messagingException;
    }

    private static RuntimeException attachmentMismatch(String str) {
        return new IndexOutOfBoundsException(str);
    }

    private void checkAccess() {
        if (this.sealed) {
            LogManagerProperties.checkLogManagerAccess();
        }
    }

    private void clearMatches(int i10) {
        for (int i11 = 0; i11 < this.size; i11++) {
            int[] iArr = this.matched;
            if (iArr[i11] >= i10) {
                iArr[i11] = MUTEX_PUBLISH.intValue();
            }
        }
    }

    private String contentWithEncoding(String str, String str2) {
        try {
            ContentType contentType = new ContentType(str);
            contentType.setParameter("charset", MimeUtility.mimeCharset(str2));
            String string = contentType.toString();
            return !isEmpty(string) ? string : str;
        } catch (MessagingException e10) {
            reportError(str, e10, 5);
            return str;
        }
    }

    private MimeBodyPart createBodyPart() throws MessagingException {
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setDisposition(Part.INLINE);
        mimeBodyPart.setDescription(descriptionFrom(getFormatter(), getFilter(), this.subjectFormatter));
        setAcceptLang(mimeBodyPart);
        return mimeBodyPart;
    }

    private static Formatter createSimpleFormatter() {
        return (Formatter) Formatter.class.cast(new SimpleFormatter());
    }

    private ErrorManager defaultErrorManager() {
        ErrorManager errorManager;
        try {
            errorManager = super.getErrorManager();
        } catch (LinkageError | RuntimeException unused) {
            errorManager = null;
        }
        return errorManager == null ? new ErrorManager() : errorManager;
    }

    private String descriptionFrom(Comparator<?> comparator, Level level, Filter filter) {
        StringBuilder sb2 = new StringBuilder("Sorted using ");
        sb2.append(comparator == null ? "no comparator" : comparator.getClass().getName());
        sb2.append(", pushed when ");
        sb2.append(level.getName());
        sb2.append(", and ");
        return C15569B0.m18232a(sb2, filter == null ? "no push filter" : filter.getClass().getName(), '.');
    }

    private static Filter[] emptyFilterArray() {
        return EMPTY_FILTERS;
    }

    private static Formatter[] emptyFormatterArray() {
        return EMPTY_FORMATTERS;
    }

    private void envelopeFor(Message message, boolean z10) {
        setAcceptLang(message);
        setFrom(message);
        Message.RecipientType recipientType = Message.RecipientType.f50056TO;
        if (!setRecipient(message, "mail.to", recipientType)) {
            setDefaultRecipient(message, recipientType);
        }
        setRecipient(message, "mail.cc", Message.RecipientType.f50055CC);
        setRecipient(message, "mail.bcc", Message.RecipientType.BCC);
        setReplyTo(message);
        setSender(message);
        setMailer(message);
        setAutoSubmitted(message);
        if (z10) {
            setPriority(message);
        }
        try {
            message.setSentDate(new Date());
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private String format(Formatter formatter, LogRecord logRecord) {
        try {
            return formatter.format(logRecord);
        } catch (RuntimeException e10) {
            reportError(e10.getMessage(), e10, 5);
            return "";
        }
    }

    private Object getAndSetContextClassLoader(Object obj) {
        if (obj != GetAndSetContext.NOT_MODIFIED) {
            try {
                return LogManagerProperties.runOrDoPrivileged(obj instanceof PrivilegedAction ? (PrivilegedAction) obj : new GetAndSetContext(obj));
            } catch (SecurityException unused) {
            }
        }
        return GetAndSetContext.NOT_MODIFIED;
    }

    private String getClassId(Formatter formatter) {
        return formatter instanceof TailNameFormatter ? String.class.getName() : formatter.getClass().getName();
    }

    private String getContentType(String str) {
        String contentType = this.contentTypes.getContentType(str);
        if ("application/octet-stream".equalsIgnoreCase(contentType)) {
            return null;
        }
        return contentType;
    }

    private String getEncodingName() {
        String encoding = getEncoding();
        return encoding == null ? MimeUtility.getDefaultJavaCharset() : encoding;
    }

    private String getLocalHost(Service service) {
        try {
            return LogManagerProperties.getLocalHost(service);
        } catch (Exception e10) {
            reportError(service.toString(), e10, 4);
            return null;
        } catch (LinkageError | NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    private int getMatchedPart() {
        Integer num = MUTEX.get();
        if (num == null || num.intValue() >= readOnlyAttachmentFilters().length) {
            num = MUTEX_PUBLISH;
        }
        return num.intValue();
    }

    private Session getSession(Message message) {
        message.getClass();
        return new MessageContext(message).getSession();
    }

    private void grow() {
        LogRecord[] logRecordArr = this.data;
        int length = logRecordArr.length;
        int i10 = (length >> 1) + length + 1;
        int i11 = this.capacity;
        if (i10 > i11 || i10 < length) {
            i10 = i11;
        }
        this.data = (LogRecord[]) Arrays.copyOf(logRecordArr, i10, LogRecord[].class);
        this.matched = Arrays.copyOf(this.matched, i10);
    }

    private static boolean hasValue(String str) {
        return (isEmpty(str) || "null".equalsIgnoreCase(str)) ? false : true;
    }

    private String head(Formatter formatter) {
        try {
            return formatter.getHead(this);
        } catch (RuntimeException e10) {
            reportError(e10.getMessage(), e10, 5);
            return "";
        }
    }

    private synchronized void init(Properties properties) {
        try {
            String name = getClass().getName();
            this.mailProps = new Properties();
            Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
            try {
                this.contentTypes = FileTypeMap.getDefaultFileTypeMap();
                getAndSetContextClassLoader(andSetContextClassLoader);
                initErrorManager(name);
                initLevel(name);
                initFilter(name);
                initCapacity(name);
                initAuthenticator(name);
                initEncoding(name);
                initFormatter(name);
                initComparator(name);
                initPushLevel(name);
                initPushFilter(name);
                initSubject(name);
                initAttachmentFormaters(name);
                initAttachmentFilters(name);
                initAttachmentNames(name);
                if (properties == null && LogManagerProperties.fromLogManager(name.concat(".verify")) != null) {
                    verifySettings(initSession());
                }
                intern();
            } catch (Throwable th) {
                getAndSetContextClassLoader(andSetContextClassLoader);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void initAttachmentFilters(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".attachment.filters"));
        if (isEmpty(strFromLogManager)) {
            this.attachmentFilters = emptyFilterArray();
            alignAttachmentFilters();
            return;
        }
        String[] strArrSplit = strFromLogManager.split(StringUtils.COMMA);
        int length = strArrSplit.length;
        Filter[] filterArr = new Filter[length];
        for (int i10 = 0; i10 < length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if (!"null".equalsIgnoreCase(strTrim)) {
                try {
                    filterArr[i10] = LogManagerProperties.newFilter(strArrSplit[i10]);
                } catch (SecurityException e10) {
                    throw e10;
                } catch (Exception e11) {
                    reportError(e11.getMessage(), e11, 4);
                }
            }
        }
        this.attachmentFilters = filterArr;
        if (alignAttachmentFilters()) {
            reportError("Attachment filters.", attachmentMismatch("Length mismatch."), 4);
        }
    }

    private void initAttachmentFormaters(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".attachment.formatters"));
        if (isEmpty(strFromLogManager)) {
            this.attachmentFormatters = emptyFormatterArray();
            return;
        }
        String[] strArrSplit = strFromLogManager.split(StringUtils.COMMA);
        Formatter[] formatterArrEmptyFormatterArray = strArrSplit.length == 0 ? emptyFormatterArray() : new Formatter[strArrSplit.length];
        for (int i10 = 0; i10 < formatterArrEmptyFormatterArray.length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if ("null".equalsIgnoreCase(strTrim)) {
                reportError("Attachment formatter.", new NullPointerException(atIndexMsg(i10)), 4);
                formatterArrEmptyFormatterArray[i10] = createSimpleFormatter();
            } else {
                try {
                    Formatter formatterNewFormatter = LogManagerProperties.newFormatter(strArrSplit[i10]);
                    formatterArrEmptyFormatterArray[i10] = formatterNewFormatter;
                    if (formatterNewFormatter instanceof TailNameFormatter) {
                        reportError("Attachment formatter.", new ClassNotFoundException(formatterArrEmptyFormatterArray[i10].toString()), 4);
                        formatterArrEmptyFormatterArray[i10] = createSimpleFormatter();
                    }
                } catch (SecurityException e10) {
                    throw e10;
                } catch (Exception e11) {
                    reportError(e11.getMessage(), e11, 4);
                    formatterArrEmptyFormatterArray[i10] = createSimpleFormatter();
                }
            }
        }
        this.attachmentFormatters = formatterArrEmptyFormatterArray;
    }

    private void initAttachmentNames(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".attachment.names"));
        if (isEmpty(strFromLogManager)) {
            this.attachmentNames = emptyFormatterArray();
            alignAttachmentNames();
            return;
        }
        String[] strArrSplit = strFromLogManager.split(StringUtils.COMMA);
        int length = strArrSplit.length;
        Formatter[] formatterArr = new Formatter[length];
        for (int i10 = 0; i10 < length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            strArrSplit[i10] = strTrim;
            if ("null".equalsIgnoreCase(strTrim)) {
                reportError("Attachment names.", new NullPointerException(atIndexMsg(i10)), 4);
            } else {
                try {
                    try {
                        formatterArr[i10] = LogManagerProperties.newFormatter(strArrSplit[i10]);
                    } catch (ClassCastException | ClassNotFoundException unused) {
                        formatterArr[i10] = TailNameFormatter.m12172of(strArrSplit[i10]);
                    }
                } catch (SecurityException e10) {
                    throw e10;
                } catch (Exception e11) {
                    reportError(e11.getMessage(), e11, 4);
                }
            }
        }
        this.attachmentNames = formatterArr;
        if (alignAttachmentNames()) {
            reportError("Attachment names.", attachmentMismatch("Length mismatch."), 4);
        }
    }

    private void initAuthenticator(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".authenticator"));
        if (strFromLogManager == null || "null".equalsIgnoreCase(strFromLogManager)) {
            return;
        }
        if (strFromLogManager.length() == 0) {
            this.auth = DefaultAuthenticator.m12171of(strFromLogManager);
            return;
        }
        try {
            this.auth = (Authenticator) LogManagerProperties.newObjectFrom(strFromLogManager, Authenticator.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
            this.auth = DefaultAuthenticator.m12171of(strFromLogManager);
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            reportError(e11.getMessage(), e11, 4);
        }
    }

    private void initCapacity(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".capacity"));
            if (strFromLogManager != null) {
                setCapacity0(Integer.parseInt(strFromLogManager));
            } else {
                setCapacity0(1000);
            }
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            reportError(e11.getMessage(), e11, 4);
        }
        if (this.capacity <= 0) {
            this.capacity = 1000;
        }
        LogRecord[] logRecordArr = new LogRecord[1];
        this.data = logRecordArr;
        this.matched = new int[logRecordArr.length];
    }

    private void initComparator(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".comparator"));
            String strFromLogManager2 = LogManagerProperties.fromLogManager(str.concat(".comparator.reverse"));
            if (!hasValue(strFromLogManager)) {
                if (!isEmpty(strFromLogManager2)) {
                    throw new IllegalArgumentException("No comparator to reverse.");
                }
            } else {
                this.comparator = LogManagerProperties.newComparator(strFromLogManager);
                if (Boolean.parseBoolean(strFromLogManager2)) {
                    this.comparator = LogManagerProperties.reverseOrder(this.comparator);
                }
            }
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            reportError(e11.getMessage(), e11, 4);
        }
    }

    private void initEncoding(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".encoding"));
            if (strFromLogManager != null) {
                setEncoding0(strFromLogManager);
            }
        } catch (UnsupportedEncodingException e10) {
            e = e10;
            reportError(e.getMessage(), e, 4);
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            reportError(e.getMessage(), e, 4);
        }
    }

    private void initErrorManager(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".errorManager"));
            if (strFromLogManager != null) {
                setErrorManager0(LogManagerProperties.newErrorManager(strFromLogManager));
            }
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            reportError(e11.getMessage(), e11, 4);
        }
    }

    private void initFilter(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".filter"));
            if (hasValue(strFromLogManager)) {
                this.filter = LogManagerProperties.newFilter(strFromLogManager);
            }
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            reportError(e11.getMessage(), e11, 4);
        }
    }

    private void initFormatter(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".formatter"));
            if (!hasValue(strFromLogManager)) {
                this.formatter = createSimpleFormatter();
                return;
            }
            Formatter formatterNewFormatter = LogManagerProperties.newFormatter(strFromLogManager);
            if (formatterNewFormatter instanceof TailNameFormatter) {
                this.formatter = createSimpleFormatter();
            } else {
                this.formatter = formatterNewFormatter;
            }
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            reportError(e11.getMessage(), e11, 4);
            this.formatter = createSimpleFormatter();
        }
    }

    private void initLevel(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".level"));
            if (strFromLogManager != null) {
                this.logLevel = Level.parse(strFromLogManager);
            } else {
                this.logLevel = Level.WARNING;
            }
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            reportError(e11.getMessage(), e11, 4);
            this.logLevel = Level.WARNING;
        }
    }

    private void initPushFilter(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".pushFilter"));
            if (hasValue(strFromLogManager)) {
                this.pushFilter = LogManagerProperties.newFilter(strFromLogManager);
            }
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            reportError(e11.getMessage(), e11, 4);
        }
    }

    private void initPushLevel(String str) {
        try {
            String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".pushLevel"));
            if (strFromLogManager != null) {
                this.pushLevel = Level.parse(strFromLogManager);
            }
        } catch (RuntimeException e10) {
            reportError(e10.getMessage(), e10, 4);
        }
        if (this.pushLevel == null) {
            this.pushLevel = Level.OFF;
        }
    }

    private Session initSession() {
        Session session = Session.getInstance(new LogManagerProperties(this.mailProps, getClass().getName()), this.auth);
        this.session = session;
        return session;
    }

    private void initSubject(String str) {
        String strFromLogManager = LogManagerProperties.fromLogManager(str.concat(".subject"));
        if (strFromLogManager == null) {
            strFromLogManager = "com.sun.mail.util.logging.CollectorFormatter";
        }
        if (!hasValue(strFromLogManager)) {
            this.subjectFormatter = TailNameFormatter.m12172of(strFromLogManager);
            return;
        }
        try {
            this.subjectFormatter = LogManagerProperties.newFormatter(strFromLogManager);
        } catch (ClassCastException | ClassNotFoundException unused) {
            this.subjectFormatter = TailNameFormatter.m12172of(strFromLogManager);
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            this.subjectFormatter = TailNameFormatter.m12172of(strFromLogManager);
            reportError(e11.getMessage(), e11, 4);
        }
    }

    private void intern() {
        int i10;
        try {
            HashMap map = new HashMap();
            try {
                intern(map, this.errorManager);
            } catch (SecurityException e10) {
                reportError(e10.getMessage(), e10, 4);
            }
            try {
                Filter filter = this.filter;
                Object objIntern = intern(map, filter);
                if (objIntern != filter && (objIntern instanceof Filter)) {
                    this.filter = (Filter) objIntern;
                }
                Formatter formatter = this.formatter;
                Object objIntern2 = intern(map, formatter);
                if (objIntern2 != formatter && (objIntern2 instanceof Formatter)) {
                    this.formatter = (Formatter) objIntern2;
                }
                while (true) {
                    Formatter[] formatterArr = this.attachmentFormatters;
                    if (i10 >= formatterArr.length) {
                        return;
                    }
                    Formatter formatter2 = formatterArr[i10];
                    Object objIntern3 = intern(map, formatter2);
                    if (objIntern3 != formatter2 && (objIntern3 instanceof Formatter)) {
                        this.attachmentFormatters[i10] = (Formatter) objIntern3;
                    }
                    Filter filter2 = this.attachmentFilters[i10];
                    Object objIntern4 = intern(map, filter2);
                    if (objIntern4 != filter2 && (objIntern4 instanceof Filter)) {
                        this.attachmentFilters[i10] = (Filter) objIntern4;
                    }
                    Formatter formatter3 = this.attachmentNames[i10];
                    Object objIntern5 = intern(map, formatter3);
                    if (objIntern5 != formatter3 && (objIntern5 instanceof Formatter)) {
                        this.attachmentNames[i10] = (Formatter) objIntern5;
                    }
                    i10++;
                }
            } catch (SecurityException e11) {
                reportError(e11.getMessage(), e11, 4);
            }
            Formatter formatter4 = this.subjectFormatter;
            Object objIntern6 = intern(map, formatter4);
            if (objIntern6 != formatter4 && (objIntern6 instanceof Formatter)) {
                this.subjectFormatter = (Formatter) objIntern6;
            }
            Filter filter3 = this.pushFilter;
            Object objIntern7 = intern(map, filter3);
            if (objIntern7 != filter3 && (objIntern7 instanceof Filter)) {
                this.pushFilter = (Filter) objIntern7;
            }
            i10 = 0;
        } catch (Exception e12) {
            reportError(e12.getMessage(), e12, 4);
        } catch (LinkageError e13) {
            reportError(e13.getMessage(), new InvocationTargetException(e13), 4);
        }
    }

    private boolean isAttachmentLoggable(LogRecord logRecord) {
        Filter[] onlyAttachmentFilters = readOnlyAttachmentFilters();
        for (int i10 = 0; i10 < onlyAttachmentFilters.length; i10++) {
            Filter filter = onlyAttachmentFilters[i10];
            if (filter == null || filter.isLoggable(logRecord)) {
                setMatchedPart(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private boolean isPushable(LogRecord logRecord) {
        int iIntValue = getPushLevel().intValue();
        if (iIntValue == offValue || logRecord.getLevel().intValue() < iIntValue) {
            return false;
        }
        Filter pushFilter = getPushFilter();
        if (pushFilter == null) {
            return true;
        }
        int matchedPart = getMatchedPart();
        if (!(matchedPart == -1 && getFilter() == pushFilter) && (matchedPart < 0 || this.attachmentFilters[matchedPart] != pushFilter)) {
            return pushFilter.isLoggable(logRecord);
        }
        return true;
    }

    private Locale localeFor(LogRecord logRecord) {
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        if (resourceBundle == null) {
            return null;
        }
        Locale locale = resourceBundle.getLocale();
        return (locale == null || isEmpty(locale.getLanguage())) ? Locale.getDefault() : locale;
    }

    private void publish0(LogRecord logRecord) {
        Message messageWriteLogRecords;
        boolean zIsPushable;
        synchronized (this) {
            try {
                int i10 = this.size;
                if (i10 == this.data.length && i10 < this.capacity) {
                    grow();
                }
                int i11 = this.size;
                messageWriteLogRecords = null;
                if (i11 < this.data.length) {
                    this.matched[i11] = getMatchedPart();
                    LogRecord[] logRecordArr = this.data;
                    int i12 = this.size;
                    logRecordArr[i12] = logRecord;
                    this.size = i12 + 1;
                    zIsPushable = isPushable(logRecord);
                    if (zIsPushable || this.size >= this.capacity) {
                        messageWriteLogRecords = writeLogRecords(1);
                    }
                } else {
                    zIsPushable = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (messageWriteLogRecords != null) {
            send(messageWriteLogRecords, zIsPushable, 1);
        }
    }

    private Filter[] readOnlyAttachmentFilters() {
        return this.attachmentFilters;
    }

    private void releaseMutex() {
        MUTEX.remove();
    }

    private void reportFilterError(LogRecord logRecord) {
        Formatter formatterCreateSimpleFormatter = createSimpleFormatter();
        reportError("Log record " + logRecord.getSequenceNumber() + " was filtered from all message parts.  " + head(formatterCreateSimpleFormatter) + format(formatterCreateSimpleFormatter, logRecord) + tail(formatterCreateSimpleFormatter, ""), new IllegalArgumentException(getFilter() + ", " + Arrays.asList(readOnlyAttachmentFilters())), 5);
    }

    private void reportLinkageError(Throwable th, int i10) {
        if (th == null) {
            throw new NullPointerException(String.valueOf(i10));
        }
        ThreadLocal<Integer> threadLocal = MUTEX;
        Integer num = threadLocal.get();
        if (num == null || num.intValue() > MUTEX_LINKAGE.intValue()) {
            threadLocal.set(MUTEX_LINKAGE);
            try {
                Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                if (num != null) {
                    threadLocal.set(num);
                } else {
                    threadLocal.remove();
                }
            } catch (LinkageError | RuntimeException unused) {
                if (num != null) {
                    MUTEX.set(num);
                } else {
                    MUTEX.remove();
                }
            } catch (Throwable th2) {
                if (num != null) {
                    MUTEX.set(num);
                } else {
                    MUTEX.remove();
                }
                throw th2;
            }
        }
    }

    private void reportNonDiscriminating(Object obj, Object obj2) {
        reportError("Non discriminating equals implementation.", new IllegalArgumentException(obj.getClass().getName() + " should not be equal to " + obj2.getClass().getName()), 4);
    }

    private void reportNonSymmetric(Object obj, Object obj2) {
        reportError("Non symmetric equals implementation.", new IllegalArgumentException(obj.getClass().getName() + " is not equal to " + obj2.getClass().getName()), 4);
    }

    private void reportNullError(int i10) {
        reportError("null", new NullPointerException(), i10);
    }

    private void reportUnPublishedError(LogRecord logRecord) {
        String str;
        ThreadLocal<Integer> threadLocal = MUTEX;
        Integer num = threadLocal.get();
        if (num == null || num.intValue() > MUTEX_REPORT.intValue()) {
            threadLocal.set(MUTEX_REPORT);
            if (logRecord != null) {
                try {
                    Formatter formatterCreateSimpleFormatter = createSimpleFormatter();
                    str = "Log record " + logRecord.getSequenceNumber() + " was not published. " + head(formatterCreateSimpleFormatter) + format(formatterCreateSimpleFormatter, logRecord) + tail(formatterCreateSimpleFormatter, "");
                } finally {
                    if (num != null) {
                        MUTEX.set(num);
                    } else {
                        MUTEX.remove();
                    }
                }
            } else {
                str = null;
            }
            reportError(str, new IllegalStateException("Recursive publish detected by thread " + Thread.currentThread()), 1);
            if (num != null) {
            }
        }
    }

    private void reportUnexpectedSend(MimeMessage mimeMessage, String str, Exception exc) {
        Exception messagingException = new MessagingException("An empty message was sent.", exc);
        setErrorContent(mimeMessage, str, messagingException);
        reportError(mimeMessage, messagingException, 4);
    }

    private void reset() {
        int i10 = this.size;
        LogRecord[] logRecordArr = this.data;
        if (i10 < logRecordArr.length) {
            Arrays.fill(logRecordArr, 0, i10, (Object) null);
        } else {
            Arrays.fill(logRecordArr, (Object) null);
        }
        this.size = 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0023 A[Catch: MessagingException -> 0x0006, RuntimeException | MessagingException -> 0x0008, TRY_ENTER, TryCatch #5 {RuntimeException | MessagingException -> 0x0008, blocks: (B:3:0x0002, B:19:0x0023, B:20:0x0026), top: B:23:0x0002 }] */
    private void saveChangesNoContent(Message message, String str) {
        if (message != null) {
            try {
                try {
                    message.saveChanges();
                } catch (NullPointerException e10) {
                    try {
                        if (message.getHeader("Content-Transfer-Encoding") != null) {
                            throw e10;
                        }
                        message.setHeader("Content-Transfer-Encoding", "base64");
                        message.saveChanges();
                    } catch (RuntimeException e11) {
                        e = e11;
                        if (e != e10) {
                            e.addSuppressed(e10);
                        }
                        throw e;
                    } catch (MessagingException e12) {
                        e = e12;
                        if (e != e10) {
                            e.addSuppressed(e10);
                        }
                        throw e;
                    }
                }
            } catch (RuntimeException | MessagingException e13) {
                reportError(str, e13, 5);
            }
        }
    }

    private void send(Message message, boolean z10, int i10) {
        try {
            envelopeFor(message, z10);
            Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
            try {
                Transport.send(message);
            } finally {
                getAndSetContextClassLoader(andSetContextClassLoader);
            }
        } catch (RuntimeException e10) {
            reportError(message, e10, i10);
        } catch (Exception e11) {
            reportError(message, e11, i10);
        }
    }

    private void setAcceptLang(Part part) {
        try {
            String languageTag = LogManagerProperties.toLanguageTag(Locale.getDefault());
            if (languageTag.length() != 0) {
                part.setHeader("Accept-Language", languageTag);
            }
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private void setAuthenticator0(Authenticator authenticator) throws Throwable {
        Session sessionUpdateSession;
        checkAccess();
        synchronized (this) {
            if (this.isWriting) {
                throw new IllegalStateException();
            }
            this.auth = authenticator;
            sessionUpdateSession = updateSession();
        }
        verifySettings(sessionUpdateSession);
    }

    private void setAutoSubmitted(Message message) {
        if (allowRestrictedHeaders()) {
            try {
                message.setHeader("auto-submitted", "auto-generated");
            } catch (MessagingException e10) {
                reportError(e10.getMessage(), e10, 5);
            }
        }
    }

    private synchronized void setCapacity0(int i10) {
        try {
            checkAccess();
            if (i10 <= 0) {
                throw new IllegalArgumentException("Capacity must be greater than zero.");
            }
            if (this.isWriting) {
                throw new IllegalStateException();
            }
            if (this.capacity < 0) {
                this.capacity = -i10;
            } else {
                this.capacity = i10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void setContent(MimePart mimePart, CharSequence charSequence, String str) {
        String encodingName = getEncodingName();
        if (str == null || "text/plain".equalsIgnoreCase(str)) {
            mimePart.setText(charSequence.toString(), MimeUtility.mimeCharset(encodingName));
            return;
        }
        try {
            mimePart.setDataHandler(new DataHandler(new ByteArrayDataSource(charSequence.toString(), contentWithEncoding(str, encodingName))));
        } catch (IOException e10) {
            reportError(e10.getMessage(), e10, 5);
            mimePart.setText(charSequence.toString(), encodingName);
        }
    }

    private void setDefaultFrom(Message message) {
        try {
            message.setFrom();
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private void setDefaultRecipient(Message message, Message.RecipientType recipientType) {
        try {
            InternetAddress localAddress = InternetAddress.getLocalAddress(getSession(message));
            if (localAddress != null) {
                message.setRecipient(recipientType, localAddress);
                return;
            }
            MimeMessage mimeMessage = new MimeMessage(getSession(message));
            mimeMessage.setFrom();
            Address[] from = mimeMessage.getFrom();
            if (from.length <= 0) {
                throw new MessagingException("No local address.");
            }
            message.setRecipients(recipientType, from);
        } catch (RuntimeException e10) {
            e = e10;
            reportError("Unable to compute a default recipient.", e, 5);
        } catch (MessagingException e11) {
            e = e11;
            reportError("Unable to compute a default recipient.", e, 5);
        }
    }

    private void setEncoding0(String str) throws UnsupportedEncodingException {
        if (str != null) {
            try {
                if (!Charset.isSupported(str)) {
                    throw new UnsupportedEncodingException(str);
                }
            } catch (IllegalCharsetNameException unused) {
                throw new UnsupportedEncodingException(str);
            }
        }
        synchronized (this) {
            this.encoding = str;
        }
    }

    private void setErrorContent(MimeMessage mimeMessage, String str, Throwable th) {
        MimeBodyPart mimeBodyPartCreateBodyPart;
        String strDescriptionFrom;
        String classId;
        try {
            synchronized (this) {
                mimeBodyPartCreateBodyPart = createBodyPart();
                strDescriptionFrom = descriptionFrom(this.comparator, this.pushLevel, this.pushFilter);
                classId = getClassId(this.subjectFormatter);
            }
            StringBuilder sb2 = new StringBuilder("Formatted using ");
            sb2.append(th == null ? Throwable.class.getName() : th.getClass().getName());
            sb2.append(", filtered with ");
            sb2.append(str);
            sb2.append(", and named by ");
            sb2.append(classId);
            sb2.append('.');
            mimeBodyPartCreateBodyPart.setDescription(sb2.toString());
            setContent(mimeBodyPartCreateBodyPart, toMsgString(th), "text/plain");
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(mimeBodyPartCreateBodyPart);
            mimeMessage.setContent(mimeMultipart);
            mimeMessage.setDescription(strDescriptionFrom);
            setAcceptLang(mimeMessage);
            mimeMessage.saveChanges();
        } catch (RuntimeException e10) {
            e = e10;
            reportError("Unable to create body.", e, 4);
        } catch (MessagingException e11) {
            e = e11;
            reportError("Unable to create body.", e, 4);
        }
    }

    private void setErrorManager0(ErrorManager errorManager) {
        errorManager.getClass();
        try {
            synchronized (this) {
                this.errorManager = errorManager;
                super.setErrorManager(errorManager);
            }
        } catch (LinkageError | RuntimeException unused) {
        }
    }

    private void setFrom(Message message) {
        String property = getSession(message).getProperty("mail.from");
        if (property == null) {
            setDefaultFrom(message);
            return;
        }
        try {
            InternetAddress[] internetAddressArr = InternetAddress.parse(property, false);
            if (internetAddressArr.length > 0) {
                if (internetAddressArr.length == 1) {
                    message.setFrom(internetAddressArr[0]);
                } else {
                    message.addFrom(internetAddressArr);
                }
            }
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
            setDefaultFrom(message);
        }
    }

    private void setIncompleteCopy(Message message) {
        try {
            message.setHeader("Incomplete-Copy", "");
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private void setMailProperties0(Properties properties) throws Throwable {
        Session sessionUpdateSession;
        checkAccess();
        Properties properties2 = (Properties) properties.clone();
        synchronized (this) {
            if (this.isWriting) {
                throw new IllegalStateException();
            }
            this.mailProps = properties2;
            sessionUpdateSession = updateSession();
        }
        verifySettings(sessionUpdateSession);
    }

    private void setMailer(Message message) {
        String strReplaceAll;
        String strFold;
        try {
            Class<?> cls = getClass();
            if (cls == MailHandler.class) {
                strFold = MailHandler.class.getName();
            } else {
                try {
                    strReplaceAll = MimeUtility.encodeText(cls.getName());
                } catch (UnsupportedEncodingException e10) {
                    reportError(e10.getMessage(), e10, 5);
                    strReplaceAll = cls.getName().replaceAll("[^\\x00-\\x7F]", "\u001a");
                }
                strFold = MimeUtility.fold(10, MailHandler.class.getName() + " using the " + strReplaceAll + " extension.");
            }
            message.setHeader("X-Mailer", strFold);
        } catch (MessagingException e11) {
            reportError(e11.getMessage(), e11, 5);
        }
    }

    private void setMatchedPart(int i10) {
        Integer num = MUTEX_PUBLISH;
        ThreadLocal<Integer> threadLocal = MUTEX;
        if (num.equals(threadLocal.get())) {
            threadLocal.set(Integer.valueOf(i10));
        }
    }

    private void setPriority(Message message) {
        try {
            message.setHeader("Importance", "High");
            message.setHeader("Priority", "urgent");
            message.setHeader("X-Priority", "2");
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private boolean setRecipient(Message message, String str, Message.RecipientType recipientType) {
        String property = getSession(message).getProperty(str);
        boolean z10 = property != null;
        if (!isEmpty(property)) {
            try {
                InternetAddress[] internetAddressArr = InternetAddress.parse(property, false);
                if (internetAddressArr.length > 0) {
                    message.setRecipients(recipientType, internetAddressArr);
                    return z10;
                }
            } catch (MessagingException e10) {
                reportError(e10.getMessage(), e10, 5);
            }
        }
        return z10;
    }

    private void setReplyTo(Message message) {
        String property = getSession(message).getProperty("mail.reply.to");
        if (isEmpty(property)) {
            return;
        }
        try {
            InternetAddress[] internetAddressArr = InternetAddress.parse(property, false);
            if (internetAddressArr.length > 0) {
                message.setReplyTo(internetAddressArr);
            }
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private void setSender(Message message) {
        String property = getSession(message).getProperty("mail.sender");
        if (isEmpty(property)) {
            return;
        }
        try {
            InternetAddress[] internetAddressArr = InternetAddress.parse(property, false);
            if (internetAddressArr.length > 0) {
                ((MimeMessage) message).setSender(internetAddressArr[0]);
                if (internetAddressArr.length > 1) {
                    reportError("Ignoring other senders.", tooManyAddresses(internetAddressArr, 1), 5);
                }
            }
        } catch (MessagingException e10) {
            reportError(e10.getMessage(), e10, 5);
        }
    }

    private void sort() {
        Comparator<? super LogRecord> comparator = this.comparator;
        if (comparator != null) {
            try {
                int i10 = this.size;
                if (i10 != 1) {
                    Arrays.sort(this.data, 0, i10, comparator);
                    return;
                }
                LogRecord logRecord = this.data[0];
                if (comparator.compare(logRecord, logRecord) != 0) {
                    throw new IllegalArgumentException(this.comparator.getClass().getName());
                }
            } catch (RuntimeException e10) {
                reportError(e10.getMessage(), e10, 5);
            }
        }
    }

    private String tail(Formatter formatter, String str) {
        try {
            return formatter.getTail(this);
        } catch (RuntimeException e10) {
            reportError(e10.getMessage(), e10, 5);
            return str;
        }
    }

    private String toMsgString(Throwable th) {
        if (th == null) {
            return "null";
        }
        String encodingName = getEncodingName();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(MIN_HEADER_SIZE);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, encodingName);
            try {
                PrintWriter printWriter = new PrintWriter(outputStreamWriter);
                try {
                    printWriter.println(th.getMessage());
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    printWriter.close();
                    outputStreamWriter.close();
                    return byteArrayOutputStream.toString(encodingName);
                } catch (Throwable th2) {
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (RuntimeException e10) {
            return th.toString() + ' ' + e10.toString();
        } catch (Exception e11) {
            return th.toString() + ' ' + e11.toString();
        }
    }

    private String toRawString(Message message) {
        if (message == null) {
            return null;
        }
        Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(message.getSize() + MIN_HEADER_SIZE, MIN_HEADER_SIZE));
            message.writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toString("UTF-8");
        } finally {
            getAndSetContextClassLoader(andSetContextClassLoader);
        }
    }

    private String toString(Formatter formatter) {
        String string = formatter.toString();
        return !isEmpty(string) ? string : getClassId(formatter);
    }

    private AddressException tooManyAddresses(Address[] addressArr, int i10) {
        return new AddressException(Arrays.asList(addressArr).subList(i10, addressArr.length).toString());
    }

    private boolean tryMutex() {
        ThreadLocal<Integer> threadLocal = MUTEX;
        if (threadLocal.get() != null) {
            return false;
        }
        threadLocal.set(MUTEX_PUBLISH);
        return true;
    }

    private Session updateSession() {
        if (this.mailProps.getProperty("verify") != null) {
            return initSession();
        }
        this.session = null;
        return null;
    }

    private static void verifyAddresses(Address[] addressArr) throws AddressException {
        if (addressArr != null) {
            for (Address address : addressArr) {
                if (address instanceof InternetAddress) {
                    ((InternetAddress) address).validate();
                }
            }
        }
    }

    private static InetAddress verifyHost(String str) throws UnknownHostException {
        InetAddress localHost = isEmpty(str) ? InetAddress.getLocalHost() : InetAddress.getByName(str);
        if (localHost.getCanonicalHostName().length() != 0) {
            return localHost;
        }
        throw new UnknownHostException();
    }

    private static void verifyProperties(Session session, String str) {
        session.getProperty("mail.from");
        session.getProperty("mail." + str + ".from");
        session.getProperty("mail.dsn.ret");
        session.getProperty("mail." + str + ".dsn.ret");
        session.getProperty("mail.dsn.notify");
        session.getProperty("mail." + str + ".dsn.notify");
        session.getProperty("mail." + str + ".port");
        session.getProperty("mail.user");
        session.getProperty("mail." + str + ".user");
        session.getProperty("mail." + str + ".localport");
    }

    private void verifySettings(Session session) throws Throwable {
        if (session != null) {
            try {
                Object objPut = session.getProperties().put("verify", "");
                if (!(objPut instanceof String)) {
                    if (objPut != null) {
                        verifySettings0(session, objPut.getClass().toString());
                    }
                } else {
                    String str = (String) objPut;
                    if (hasValue(str)) {
                        verifySettings0(session, str);
                    }
                }
            } catch (LinkageError e10) {
                reportLinkageError(e10, 4);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0397 */
    /* JADX WARN: Code duplicated, block: B:118:0x0243 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TryCatch #10 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:58:0x0120, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x0169, B:69:0x0189, B:71:0x01bd, B:134:0x0271, B:148:0x02a1, B:163:0x0309, B:171:0x0315, B:169:0x0311, B:170:0x0314, B:172:0x0320, B:174:0x0323, B:176:0x0332, B:177:0x0338, B:179:0x0342, B:181:0x0345, B:182:0x0349, B:184:0x034c, B:186:0x0354, B:187:0x0357, B:188:0x0377, B:190:0x037a, B:191:0x0382, B:192:0x038e, B:193:0x038f, B:194:0x0396, B:147:0x0296, B:84:0x01ea, B:70:0x01a4, B:66:0x0164, B:85:0x01f7, B:94:0x020e, B:98:0x0215, B:100:0x021d, B:132:0x0269, B:105:0x0225, B:116:0x023d, B:118:0x0243, B:121:0x024c, B:123:0x0252, B:125:0x0255, B:126:0x025b, B:128:0x0261, B:130:0x0264, B:109:0x0234, B:113:0x023a, B:53:0x0107, B:54:0x0111, B:45:0x00ee, B:55:0x0112, B:57:0x011c, B:200:0x039f, B:201:0x03a2), top: B:218:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0269 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TryCatch #10 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:58:0x0120, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x0169, B:69:0x0189, B:71:0x01bd, B:134:0x0271, B:148:0x02a1, B:163:0x0309, B:171:0x0315, B:169:0x0311, B:170:0x0314, B:172:0x0320, B:174:0x0323, B:176:0x0332, B:177:0x0338, B:179:0x0342, B:181:0x0345, B:182:0x0349, B:184:0x034c, B:186:0x0354, B:187:0x0357, B:188:0x0377, B:190:0x037a, B:191:0x0382, B:192:0x038e, B:193:0x038f, B:194:0x0396, B:147:0x0296, B:84:0x01ea, B:70:0x01a4, B:66:0x0164, B:85:0x01f7, B:94:0x020e, B:98:0x0215, B:100:0x021d, B:132:0x0269, B:105:0x0225, B:116:0x023d, B:118:0x0243, B:121:0x024c, B:123:0x0252, B:125:0x0255, B:126:0x025b, B:128:0x0261, B:130:0x0264, B:109:0x0234, B:113:0x023a, B:53:0x0107, B:54:0x0111, B:45:0x00ee, B:55:0x0112, B:57:0x011c, B:200:0x039f, B:201:0x03a2), top: B:218:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0281 A[Catch: Exception -> 0x00e2, IOException -> 0x028e, RuntimeException -> 0x0290, TryCatch #21 {Exception -> 0x00e2, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:58:0x0120, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x0169, B:69:0x0189, B:71:0x01bd, B:73:0x01c5, B:75:0x01d3, B:77:0x01dc, B:82:0x01e5, B:134:0x0271, B:136:0x0279, B:138:0x0281, B:140:0x0289, B:145:0x0292, B:148:0x02a1, B:163:0x0309, B:171:0x0315, B:169:0x0311, B:170:0x0314, B:172:0x0320, B:174:0x0323, B:176:0x0332, B:177:0x0338, B:179:0x0342, B:181:0x0345, B:182:0x0349, B:184:0x034c, B:186:0x0354, B:187:0x0357, B:188:0x0377, B:190:0x037a, B:191:0x0382, B:192:0x038e, B:193:0x038f, B:194:0x0396, B:147:0x0296, B:84:0x01ea, B:70:0x01a4, B:66:0x0164, B:85:0x01f7, B:94:0x020e, B:98:0x0215, B:100:0x021d, B:132:0x0269, B:105:0x0225, B:116:0x023d, B:118:0x0243, B:121:0x024c, B:123:0x0252, B:125:0x0255, B:126:0x025b, B:128:0x0261, B:130:0x0264, B:109:0x0234, B:113:0x023a, B:53:0x0107, B:54:0x0111, B:45:0x00ee, B:55:0x0112, B:57:0x011c, B:200:0x039f, B:201:0x03a2), top: B:218:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02be A[Catch: all -> 0x02d5, LOOP:2: B:152:0x02bc->B:153:0x02be, LOOP_END, TryCatch #13 {all -> 0x02d5, blocks: (B:151:0x02af, B:153:0x02be, B:156:0x02d7), top: B:221:0x02af, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02e6 A[Catch: all -> 0x02f7, LOOP:3: B:158:0x02e4->B:159:0x02e6, LOOP_END, TryCatch #16 {all -> 0x02f7, blocks: (B:149:0x02a7, B:150:0x02ae, B:157:0x02d8, B:159:0x02e6, B:162:0x02f9, B:168:0x0310, B:151:0x02af, B:153:0x02be, B:156:0x02d7), top: B:226:0x02a7, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0323 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TryCatch #10 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:58:0x0120, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x0169, B:69:0x0189, B:71:0x01bd, B:134:0x0271, B:148:0x02a1, B:163:0x0309, B:171:0x0315, B:169:0x0311, B:170:0x0314, B:172:0x0320, B:174:0x0323, B:176:0x0332, B:177:0x0338, B:179:0x0342, B:181:0x0345, B:182:0x0349, B:184:0x034c, B:186:0x0354, B:187:0x0357, B:188:0x0377, B:190:0x037a, B:191:0x0382, B:192:0x038e, B:193:0x038f, B:194:0x0396, B:147:0x0296, B:84:0x01ea, B:70:0x01a4, B:66:0x0164, B:85:0x01f7, B:94:0x020e, B:98:0x0215, B:100:0x021d, B:132:0x0269, B:105:0x0225, B:116:0x023d, B:118:0x0243, B:121:0x024c, B:123:0x0252, B:125:0x0255, B:126:0x025b, B:128:0x0261, B:130:0x0264, B:109:0x0234, B:113:0x023a, B:53:0x0107, B:54:0x0111, B:45:0x00ee, B:55:0x0112, B:57:0x011c, B:200:0x039f, B:201:0x03a2), top: B:218:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0332 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TryCatch #10 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:58:0x0120, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x0169, B:69:0x0189, B:71:0x01bd, B:134:0x0271, B:148:0x02a1, B:163:0x0309, B:171:0x0315, B:169:0x0311, B:170:0x0314, B:172:0x0320, B:174:0x0323, B:176:0x0332, B:177:0x0338, B:179:0x0342, B:181:0x0345, B:182:0x0349, B:184:0x034c, B:186:0x0354, B:187:0x0357, B:188:0x0377, B:190:0x037a, B:191:0x0382, B:192:0x038e, B:193:0x038f, B:194:0x0396, B:147:0x0296, B:84:0x01ea, B:70:0x01a4, B:66:0x0164, B:85:0x01f7, B:94:0x020e, B:98:0x0215, B:100:0x021d, B:132:0x0269, B:105:0x0225, B:116:0x023d, B:118:0x0243, B:121:0x024c, B:123:0x0252, B:125:0x0255, B:126:0x025b, B:128:0x0261, B:130:0x0264, B:109:0x0234, B:113:0x023a, B:53:0x0107, B:54:0x0111, B:45:0x00ee, B:55:0x0112, B:57:0x011c, B:200:0x039f, B:201:0x03a2), top: B:218:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0342 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TryCatch #10 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:58:0x0120, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x0169, B:69:0x0189, B:71:0x01bd, B:134:0x0271, B:148:0x02a1, B:163:0x0309, B:171:0x0315, B:169:0x0311, B:170:0x0314, B:172:0x0320, B:174:0x0323, B:176:0x0332, B:177:0x0338, B:179:0x0342, B:181:0x0345, B:182:0x0349, B:184:0x034c, B:186:0x0354, B:187:0x0357, B:188:0x0377, B:190:0x037a, B:191:0x0382, B:192:0x038e, B:193:0x038f, B:194:0x0396, B:147:0x0296, B:84:0x01ea, B:70:0x01a4, B:66:0x0164, B:85:0x01f7, B:94:0x020e, B:98:0x0215, B:100:0x021d, B:132:0x0269, B:105:0x0225, B:116:0x023d, B:118:0x0243, B:121:0x024c, B:123:0x0252, B:125:0x0255, B:126:0x025b, B:128:0x0261, B:130:0x0264, B:109:0x0234, B:113:0x023a, B:53:0x0107, B:54:0x0111, B:45:0x00ee, B:55:0x0112, B:57:0x011c, B:200:0x039f, B:201:0x03a2), top: B:218:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0378 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x0382 A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TryCatch #10 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:58:0x0120, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x0169, B:69:0x0189, B:71:0x01bd, B:134:0x0271, B:148:0x02a1, B:163:0x0309, B:171:0x0315, B:169:0x0311, B:170:0x0314, B:172:0x0320, B:174:0x0323, B:176:0x0332, B:177:0x0338, B:179:0x0342, B:181:0x0345, B:182:0x0349, B:184:0x034c, B:186:0x0354, B:187:0x0357, B:188:0x0377, B:190:0x037a, B:191:0x0382, B:192:0x038e, B:193:0x038f, B:194:0x0396, B:147:0x0296, B:84:0x01ea, B:70:0x01a4, B:66:0x0164, B:85:0x01f7, B:94:0x020e, B:98:0x0215, B:100:0x021d, B:132:0x0269, B:105:0x0225, B:116:0x023d, B:118:0x0243, B:121:0x024c, B:123:0x0252, B:125:0x0255, B:126:0x025b, B:128:0x0261, B:130:0x0264, B:109:0x0234, B:113:0x023a, B:53:0x0107, B:54:0x0111, B:45:0x00ee, B:55:0x0112, B:57:0x011c, B:200:0x039f, B:201:0x03a2), top: B:218:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x038f A[Catch: Exception -> 0x00e2, RuntimeException -> 0x00e5, TryCatch #10 {RuntimeException -> 0x00e5, blocks: (B:34:0x00d8, B:36:0x00de, B:42:0x00e9, B:47:0x00f4, B:49:0x00f7, B:58:0x0120, B:60:0x0128, B:63:0x0132, B:65:0x015d, B:67:0x0169, B:69:0x0189, B:71:0x01bd, B:134:0x0271, B:148:0x02a1, B:163:0x0309, B:171:0x0315, B:169:0x0311, B:170:0x0314, B:172:0x0320, B:174:0x0323, B:176:0x0332, B:177:0x0338, B:179:0x0342, B:181:0x0345, B:182:0x0349, B:184:0x034c, B:186:0x0354, B:187:0x0357, B:188:0x0377, B:190:0x037a, B:191:0x0382, B:192:0x038e, B:193:0x038f, B:194:0x0396, B:147:0x0296, B:84:0x01ea, B:70:0x01a4, B:66:0x0164, B:85:0x01f7, B:94:0x020e, B:98:0x0215, B:100:0x021d, B:132:0x0269, B:105:0x0225, B:116:0x023d, B:118:0x0243, B:121:0x024c, B:123:0x0252, B:125:0x0255, B:126:0x025b, B:128:0x0261, B:130:0x0264, B:109:0x0234, B:113:0x023a, B:53:0x0107, B:54:0x0111, B:45:0x00ee, B:55:0x0112, B:57:0x011c, B:200:0x039f, B:201:0x03a2), top: B:218:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void verifySettings0(Session session, String str) throws Throwable {
        String str2;
        int length;
        String[] strArr;
        Transport transport;
        Throwable th;
        String localHost;
        Exception exc;
        Address[] invalidAddresses;
        Address[] validSentAddresses;
        String localHost2;
        Object andSetContextClassLoader;
        MimePart[] mimePartArr;
        int i10;
        int i11;
        Object sender;
        if (!"local".equals(str) && !"remote".equals(str) && !"limited".equals(str) && !"resolve".equals(str) && !"login".equals(str)) {
            reportError("Verify must be 'limited', local', 'resolve', 'login', or 'remote'.", new IllegalArgumentException(str), 4);
            return;
        }
        MimeMessage mimeMessage = new MimeMessage(session);
        if ("limited".equals(str)) {
            str2 = "Skipping local address check.";
        } else {
            str2 = "Local address is " + InternetAddress.getLocalAddress(session) + '.';
            try {
                Charset.forName(getEncodingName());
            } catch (RuntimeException e10) {
                Exception unsupportedEncodingException = new UnsupportedEncodingException(e10.toString());
                unsupportedEncodingException.initCause(e10);
                reportError(str2, unsupportedEncodingException, 5);
            }
        }
        synchronized (this) {
            try {
                appendSubject(mimeMessage, head(this.subjectFormatter));
                appendSubject(mimeMessage, tail(this.subjectFormatter, ""));
                length = this.attachmentNames.length;
                strArr = new String[length];
                for (int i12 = 0; i12 < length; i12++) {
                    String strHead = head(this.attachmentNames[i12]);
                    strArr[i12] = strHead;
                    if (strHead.length() == 0) {
                        strArr[i12] = tail(this.attachmentNames[i12], "");
                    } else {
                        strArr[i12] = strArr[i12].concat(tail(this.attachmentNames[i12], ""));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        setIncompleteCopy(mimeMessage);
        envelopeFor(mimeMessage, true);
        saveChangesNoContent(mimeMessage, str2);
        try {
            try {
                Address[] allRecipients = mimeMessage.getAllRecipients();
                if (allRecipients == null) {
                    allRecipients = new InternetAddress[0];
                }
                Address[] addressArr = allRecipients;
                try {
                    Address[] from = addressArr.length != 0 ? addressArr : mimeMessage.getFrom();
                    if (from == null || from.length == 0) {
                        Exception messagingException = new MessagingException("No recipient or from address.");
                        reportError(str2, messagingException, 4);
                        throw messagingException;
                    }
                    transport = session.getTransport(from[0]);
                    session.getProperty("mail.transport.protocol");
                    Transport transport2 = transport;
                    if ("remote".equals(str) || "login".equals(str)) {
                        transport2.connect();
                        Exception exc2 = null;
                        try {
                            localHost = getLocalHost(transport2);
                            try {
                                if ("remote".equals(str)) {
                                    transport2.sendMessage(mimeMessage, addressArr);
                                }
                                try {
                                    transport2.close();
                                    exc = null;
                                } catch (MessagingException e11) {
                                    exc = e11;
                                }
                                try {
                                    if ("remote".equals(str)) {
                                        reportUnexpectedSend(mimeMessage, str, null);
                                    } else {
                                        verifyProperties(session, transport2.getURLName().getProtocol());
                                    }
                                } catch (SendFailedException e12) {
                                    e = e12;
                                    invalidAddresses = e.getInvalidAddresses();
                                    if (invalidAddresses != null && invalidAddresses.length != 0) {
                                        setErrorContent(mimeMessage, str, e);
                                        reportError(mimeMessage, e, 4);
                                    }
                                    validSentAddresses = e.getValidSentAddresses();
                                    if (validSentAddresses != null && validSentAddresses.length != 0) {
                                        reportUnexpectedSend(mimeMessage, str, e);
                                    }
                                } catch (MessagingException e13) {
                                    e = e13;
                                    if (!isMissingContent(mimeMessage, e)) {
                                        setErrorContent(mimeMessage, str, e);
                                        reportError(mimeMessage, e, 4);
                                    }
                                }
                                if (exc != null) {
                                    setErrorContent(mimeMessage, str, exc);
                                    reportError(mimeMessage, exc, 3);
                                }
                                localHost2 = localHost;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    transport2.close();
                                } catch (MessagingException e14) {
                                    exc2 = e14;
                                }
                                try {
                                    throw th;
                                } catch (SendFailedException e15) {
                                    e = e15;
                                    exc = exc2;
                                    invalidAddresses = e.getInvalidAddresses();
                                    if (invalidAddresses != null) {
                                        setErrorContent(mimeMessage, str, e);
                                        reportError(mimeMessage, e, 4);
                                    }
                                    validSentAddresses = e.getValidSentAddresses();
                                    if (validSentAddresses != null) {
                                        reportUnexpectedSend(mimeMessage, str, e);
                                    }
                                    if (exc != null) {
                                        setErrorContent(mimeMessage, str, exc);
                                        reportError(mimeMessage, exc, 3);
                                    }
                                    localHost2 = localHost;
                                    if (!"limited".equals(str)) {
                                        try {
                                            if (!"remote".equals(str)) {
                                                localHost2 = getLocalHost(transport2);
                                            }
                                            verifyHost(localHost2);
                                        } catch (IOException e16) {
                                            e = e16;
                                            Exception messagingException2 = new MessagingException(str2, e);
                                            setErrorContent(mimeMessage, str, messagingException2);
                                            reportError(mimeMessage, messagingException2, 4);
                                        } catch (RuntimeException e17) {
                                            e = e17;
                                            Exception messagingException3 = new MessagingException(str2, e);
                                            setErrorContent(mimeMessage, str, messagingException3);
                                            reportError(mimeMessage, messagingException3, 4);
                                        }
                                        try {
                                            andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
                                            try {
                                                Multipart mimeMultipart = new MimeMultipart();
                                                mimePartArr = new MimeBodyPart[length];
                                                synchronized (this) {
                                                    try {
                                                        String strContentTypeOf = contentTypeOf(getFormatter());
                                                        MimeBodyPart mimeBodyPartCreateBodyPart = createBodyPart();
                                                        for (i10 = 0; i10 < length; i10++) {
                                                            MimePart mimePartCreateBodyPart = createBodyPart(i10);
                                                            mimePartArr[i10] = mimePartCreateBodyPart;
                                                            mimePartCreateBodyPart.setFileName(strArr[i10]);
                                                            strArr[i10] = getContentType(strArr[i10]);
                                                        }
                                                        mimeBodyPartCreateBodyPart.setDescription(str);
                                                        setContent(mimeBodyPartCreateBodyPart, "", strContentTypeOf);
                                                        mimeMultipart.addBodyPart(mimeBodyPartCreateBodyPart);
                                                        for (i11 = 0; i11 < length; i11++) {
                                                            mimePartArr[i11].setDescription(str);
                                                            setContent(mimePartArr[i11], "", strArr[i11]);
                                                        }
                                                        mimeMessage.setContent(mimeMultipart);
                                                        mimeMessage.saveChanges();
                                                        mimeMessage.writeTo(new ByteArrayOutputStream(MIN_HEADER_SIZE));
                                                        getAndSetContextClassLoader(andSetContextClassLoader);
                                                    } catch (Throwable th4) {
                                                        throw th4;
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                getAndSetContextClassLoader(andSetContextClassLoader);
                                                throw th5;
                                            }
                                        } catch (IOException e18) {
                                            Exception messagingException4 = new MessagingException(str2, e18);
                                            setErrorContent(mimeMessage, str, messagingException4);
                                            reportError(mimeMessage, messagingException4, 5);
                                        }
                                    }
                                    if (addressArr.length == 0) {
                                        throw new MessagingException("No recipient addresses.");
                                    }
                                    verifyAddresses(addressArr);
                                    Address[] from2 = mimeMessage.getFrom();
                                    sender = mimeMessage.getSender();
                                    if (sender instanceof InternetAddress) {
                                        ((InternetAddress) sender).validate();
                                    }
                                    if (mimeMessage.getHeader("From", StringUtils.COMMA) == null) {
                                        if (sender == null) {
                                            throw new MessagingException(str2, new MessagingException("No from or sender address."));
                                        }
                                    } else if (sender == null) {
                                        throw new MessagingException(str2, new MessagingException("No from or sender address."));
                                    }
                                    verifyAddresses(mimeMessage.getReplyTo());
                                } catch (MessagingException e19) {
                                    e = e19;
                                    exc = exc2;
                                    if (!isMissingContent(mimeMessage, e)) {
                                        setErrorContent(mimeMessage, str, e);
                                        reportError(mimeMessage, e, 4);
                                    }
                                    if (exc != null) {
                                        setErrorContent(mimeMessage, str, exc);
                                        reportError(mimeMessage, exc, 3);
                                    }
                                    localHost2 = localHost;
                                    if (!"limited".equals(str)) {
                                        if (!"remote".equals(str)) {
                                            localHost2 = getLocalHost(transport2);
                                        }
                                        verifyHost(localHost2);
                                        andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
                                        Multipart mimeMultipart2 = new MimeMultipart();
                                        mimePartArr = new MimeBodyPart[length];
                                        synchronized (this) {
                                            String strContentTypeOf2 = contentTypeOf(getFormatter());
                                            MimeBodyPart mimeBodyPartCreateBodyPart2 = createBodyPart();
                                            while (i10 < length) {
                                                MimePart mimePartCreateBodyPart2 = createBodyPart(i10);
                                                mimePartArr[i10] = mimePartCreateBodyPart2;
                                                mimePartCreateBodyPart2.setFileName(strArr[i10]);
                                                strArr[i10] = getContentType(strArr[i10]);
                                            }
                                            mimeBodyPartCreateBodyPart2.setDescription(str);
                                            setContent(mimeBodyPartCreateBodyPart2, "", strContentTypeOf2);
                                            mimeMultipart2.addBodyPart(mimeBodyPartCreateBodyPart2);
                                            while (i11 < length) {
                                                mimePartArr[i11].setDescription(str);
                                                setContent(mimePartArr[i11], "", strArr[i11]);
                                            }
                                            mimeMessage.setContent(mimeMultipart2);
                                            mimeMessage.saveChanges();
                                            mimeMessage.writeTo(new ByteArrayOutputStream(MIN_HEADER_SIZE));
                                            getAndSetContextClassLoader(andSetContextClassLoader);
                                        }
                                    }
                                    if (addressArr.length == 0) {
                                        throw new MessagingException("No recipient addresses.");
                                    }
                                    verifyAddresses(addressArr);
                                    Address[] from3 = mimeMessage.getFrom();
                                    sender = mimeMessage.getSender();
                                    if (sender instanceof InternetAddress) {
                                        ((InternetAddress) sender).validate();
                                    }
                                    if (mimeMessage.getHeader("From", StringUtils.COMMA) == null) {
                                        if (sender == null) {
                                            throw new MessagingException(str2, new MessagingException("No from or sender address."));
                                        }
                                    } else if (sender == null) {
                                        throw new MessagingException(str2, new MessagingException("No from or sender address."));
                                    }
                                    verifyAddresses(mimeMessage.getReplyTo());
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            localHost = null;
                        }
                    } else {
                        String protocol = transport2.getURLName().getProtocol();
                        verifyProperties(session, protocol);
                        String property = session.getProperty("mail." + protocol + ".host");
                        if (isEmpty(property)) {
                            property = session.getProperty("mail.host");
                        } else {
                            session.getProperty("mail.host");
                        }
                        localHost2 = session.getProperty("mail." + protocol + ".localhost");
                        if (isEmpty(localHost2)) {
                            localHost2 = session.getProperty("mail." + protocol + ".localaddress");
                        } else {
                            session.getProperty("mail." + protocol + ".localaddress");
                        }
                        if ("resolve".equals(str)) {
                            try {
                                String host = transport2.getURLName().getHost();
                                if (isEmpty(host)) {
                                    verifyHost(property);
                                } else {
                                    verifyHost(host);
                                    if (!host.equalsIgnoreCase(property)) {
                                        verifyHost(property);
                                    }
                                }
                            } catch (IOException e20) {
                                e = e20;
                                Exception messagingException5 = new MessagingException(str2, e);
                                setErrorContent(mimeMessage, str, messagingException5);
                                reportError(mimeMessage, messagingException5, 4);
                            } catch (RuntimeException e21) {
                                e = e21;
                                Exception messagingException6 = new MessagingException(str2, e);
                                setErrorContent(mimeMessage, str, messagingException6);
                                reportError(mimeMessage, messagingException6, 4);
                            }
                        }
                    }
                    if (!"limited".equals(str)) {
                        if (!"remote".equals(str) && !"login".equals(str)) {
                            localHost2 = getLocalHost(transport2);
                        }
                        verifyHost(localHost2);
                        andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
                        Multipart mimeMultipart3 = new MimeMultipart();
                        mimePartArr = new MimeBodyPart[length];
                        synchronized (this) {
                            String strContentTypeOf3 = contentTypeOf(getFormatter());
                            MimeBodyPart mimeBodyPartCreateBodyPart3 = createBodyPart();
                            while (i10 < length) {
                                MimePart mimePartCreateBodyPart3 = createBodyPart(i10);
                                mimePartArr[i10] = mimePartCreateBodyPart3;
                                mimePartCreateBodyPart3.setFileName(strArr[i10]);
                                strArr[i10] = getContentType(strArr[i10]);
                            }
                        }
                        mimeBodyPartCreateBodyPart3.setDescription(str);
                        setContent(mimeBodyPartCreateBodyPart3, "", strContentTypeOf3);
                        mimeMultipart3.addBodyPart(mimeBodyPartCreateBodyPart3);
                        while (i11 < length) {
                            mimePartArr[i11].setDescription(str);
                            setContent(mimePartArr[i11], "", strArr[i11]);
                        }
                        mimeMessage.setContent(mimeMultipart3);
                        mimeMessage.saveChanges();
                        mimeMessage.writeTo(new ByteArrayOutputStream(MIN_HEADER_SIZE));
                        getAndSetContextClassLoader(andSetContextClassLoader);
                    }
                    if (addressArr.length == 0) {
                        throw new MessagingException("No recipient addresses.");
                    }
                    verifyAddresses(addressArr);
                    Address[] from4 = mimeMessage.getFrom();
                    sender = mimeMessage.getSender();
                    if (sender instanceof InternetAddress) {
                        ((InternetAddress) sender).validate();
                    }
                    if (mimeMessage.getHeader("From", StringUtils.COMMA) == null && from4.length != 0) {
                        verifyAddresses(from4);
                        for (Address address : from4) {
                            if (address.equals(sender)) {
                                throw new MessagingException(str2, new MessagingException("Sender address '" + sender + "' equals from address."));
                            }
                        }
                    } else if (sender == null) {
                        throw new MessagingException(str2, new MessagingException("No from or sender address."));
                    }
                    verifyAddresses(mimeMessage.getReplyTo());
                } catch (MessagingException e22) {
                    Object andSetContextClassLoader2 = getAndSetContextClassLoader(MAILHANDLER_LOADER);
                    try {
                        transport = session.getTransport();
                        getAndSetContextClassLoader(andSetContextClassLoader2);
                    } catch (MessagingException e23) {
                        throw attach(e22, e23);
                    }
                }
            } catch (RuntimeException e24) {
                setErrorContent(mimeMessage, str, e24);
                reportError(mimeMessage, e24, 4);
            }
        } catch (Exception e25) {
            setErrorContent(mimeMessage, str, e25);
            reportError(mimeMessage, e25, 4);
        }
    }

    private Message writeLogRecords(int i10) {
        try {
            synchronized (this) {
                try {
                    if (this.size <= 0 || this.isWriting) {
                        return null;
                    }
                    this.isWriting = true;
                    try {
                        Message messageWriteLogRecords0 = writeLogRecords0();
                        this.isWriting = false;
                        if (this.size > 0) {
                            reset();
                        }
                        return messageWriteLogRecords0;
                    } catch (Throwable th) {
                        this.isWriting = false;
                        if (this.size > 0) {
                            reset();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (RuntimeException e10) {
            reportError(e10.getMessage(), e10, i10);
            return null;
        } catch (Exception e11) {
            reportError(e11.getMessage(), e11, i10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.logging.LogRecord[]] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.Locale] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.logging.LogRecord] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.sun.mail.util.logging.MailHandler] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.logging.Filter[]] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.logging.Filter] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v3, types: [javax.mail.internet.MimePart] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.logging.Filter] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v9 */
    private Message writeLogRecords0() throws MessagingException {
        ?? CreateBodyPart;
        ?? r17;
        boolean z10;
        sort();
        if (this.session == null) {
            initSession();
        }
        MimeMessage mimeMessage = new MimeMessage(this.session);
        int length = this.attachmentFormatters.length;
        MimeBodyPart[] mimeBodyPartArr = new MimeBodyPart[length];
        StringBuilder[] sbArr = new StringBuilder[length];
        if (length == 0) {
            mimeMessage.setDescription(descriptionFrom(getFormatter(), getFilter(), this.subjectFormatter));
            CreateBodyPart = mimeMessage;
        } else {
            mimeMessage.setDescription(descriptionFrom(this.comparator, this.pushLevel, this.pushFilter));
            CreateBodyPart = createBodyPart();
        }
        appendSubject(mimeMessage, head(this.subjectFormatter));
        Formatter formatter = getFormatter();
        ?? filter = getFilter();
        MimeBodyPart mimeBodyPart = null;
        StringBuilder sb2 = null;
        ?? r12 = 0;
        int i10 = 0;
        while (i10 < this.size) {
            int i11 = this.matched[i10];
            ?? r14 = this.data;
            ?? r15 = r14[i10];
            r14[i10] = mimeBodyPart;
            ?? LocaleFor = localeFor(r15);
            MimeBodyPart mimeBodyPart2 = mimeBodyPart;
            appendSubject(mimeMessage, format(this.subjectFormatter, r15));
            if (filter == 0 || i11 == -1 || length == 0 || (i11 < -1 && filter.isLoggable(r15))) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                    sb2.append(head(formatter));
                }
                sb2.append(format(formatter, r15));
                if (LocaleFor != 0 && !LocaleFor.equals(r12)) {
                    appendContentLang(CreateBodyPart, LocaleFor);
                }
                r17 = filter;
                z10 = true;
            } else {
                r17 = mimeBodyPart2;
                z10 = false;
            }
            MimeBodyPart[] mimeBodyPartArr2 = mimeBodyPartArr;
            ?? r10 = r17;
            int i12 = 0;
            while (i12 < length) {
                StringBuilder[] sbArr2 = sbArr;
                ?? r11 = this.attachmentFilters[i12];
                if (r11 == 0 || r10 == r11 || i11 == i12 || (i11 < i12 && r11.isLoggable(r15))) {
                    if (r10 == 0 && r11 != 0) {
                        r10 = r11;
                    }
                    if (mimeBodyPartArr2[i12] == null) {
                        mimeBodyPartArr2[i12] = createBodyPart(i12);
                        StringBuilder sb3 = new StringBuilder();
                        sbArr2[i12] = sb3;
                        sb3.append(head(this.attachmentFormatters[i12]));
                        appendFileName(mimeBodyPartArr2[i12], head(this.attachmentNames[i12]));
                    }
                    appendFileName(mimeBodyPartArr2[i12], format(this.attachmentNames[i12], r15));
                    sbArr2[i12].append(format(this.attachmentFormatters[i12], r15));
                    if (LocaleFor != 0 && !LocaleFor.equals(r12)) {
                        appendContentLang(mimeBodyPartArr2[i12], LocaleFor);
                    }
                    z10 = true;
                }
                i12++;
                sbArr = sbArr2;
                r10 = r10;
            }
            StringBuilder[] sbArr3 = sbArr;
            if (!z10) {
                reportFilterError(r15);
            } else if (CreateBodyPart != mimeMessage && LocaleFor != 0 && !LocaleFor.equals(r12)) {
                appendContentLang(mimeMessage, LocaleFor);
            }
            i10++;
            r12 = LocaleFor;
            mimeBodyPart = mimeBodyPart2;
            mimeBodyPartArr = mimeBodyPartArr2;
            sbArr = sbArr3;
        }
        MimeBodyPart[] mimeBodyPartArr3 = mimeBodyPartArr;
        ?? r19 = sbArr;
        MimeBodyPart mimeBodyPart3 = mimeBodyPart;
        this.size = 0;
        for (int i13 = length - 1; i13 >= 0; i13--) {
            MimeBodyPart mimeBodyPart4 = mimeBodyPartArr3[i13];
            if (mimeBodyPart4 != null) {
                appendFileName(mimeBodyPart4, tail(this.attachmentNames[i13], "err"));
                r19[i13].append(tail(this.attachmentFormatters[i13], ""));
                if (r19[i13].length() > 0) {
                    String fileName = mimeBodyPartArr3[i13].getFileName();
                    if (isEmpty(fileName)) {
                        fileName = toString(this.attachmentFormatters[i13]);
                        mimeBodyPartArr3[i13].setFileName(fileName);
                    }
                    setContent(mimeBodyPartArr3[i13], r19[i13], getContentType(fileName));
                } else {
                    setIncompleteCopy(mimeMessage);
                    mimeBodyPartArr3[i13] = mimeBodyPart3;
                }
                r19[i13] = mimeBodyPart3;
            }
        }
        if (sb2 != null) {
            sb2.append(tail(formatter, ""));
        } else {
            sb2 = new StringBuilder(0);
        }
        appendSubject(mimeMessage, tail(this.subjectFormatter, ""));
        String strContentTypeOf = contentTypeOf(sb2);
        String strContentTypeOf2 = contentTypeOf(formatter);
        if (strContentTypeOf2 != null) {
            strContentTypeOf = strContentTypeOf2;
        }
        setContent(CreateBodyPart, sb2, strContentTypeOf);
        if (CreateBodyPart != mimeMessage) {
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart((BodyPart) CreateBodyPart);
            for (int i14 = 0; i14 < length; i14++) {
                MimeBodyPart mimeBodyPart5 = mimeBodyPartArr3[i14];
                if (mimeBodyPart5 != null) {
                    mimeMultipart.addBodyPart(mimeBodyPart5);
                }
            }
            mimeMessage.setContent(mimeMultipart);
        }
        return mimeMessage;
    }

    @Override // java.util.logging.Handler
    public void close() {
        Message messageWriteLogRecords;
        try {
            checkAccess();
            synchronized (this) {
                try {
                    try {
                        messageWriteLogRecords = writeLogRecords(3);
                        this.logLevel = Level.OFF;
                        int i10 = this.capacity;
                        if (i10 > 0) {
                            this.capacity = -i10;
                        }
                        if (this.size == 0 && this.data.length != 1) {
                            LogRecord[] logRecordArr = new LogRecord[1];
                            this.data = logRecordArr;
                            this.matched = new int[logRecordArr.length];
                        }
                    } catch (Throwable th) {
                        this.logLevel = Level.OFF;
                        if (this.capacity > 0) {
                            this.capacity = -this.capacity;
                        }
                        if (this.size == 0 && this.data.length != 1) {
                            LogRecord[] logRecordArr2 = new LogRecord[1];
                            this.data = logRecordArr2;
                            this.matched = new int[logRecordArr2.length];
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (messageWriteLogRecords != null) {
                send(messageWriteLogRecords, false, 3);
            }
        } catch (LinkageError e10) {
            reportLinkageError(e10, 3);
        }
    }

    public final String contentTypeOf(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return null;
        }
        if (charSequence.length() > 25) {
            charSequence = charSequence.subSequence(0, 25);
        }
        try {
            return URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(charSequence.toString().getBytes(getEncodingName())));
        } catch (IOException e10) {
            reportError(e10.getMessage(), e10, 5);
            return null;
        }
    }

    @Override // java.util.logging.Handler
    public void flush() {
        push(false, 2);
    }

    public final Filter[] getAttachmentFilters() {
        return (Filter[]) readOnlyAttachmentFilters().clone();
    }

    public final Formatter[] getAttachmentFormatters() {
        Formatter[] formatterArr;
        synchronized (this) {
            formatterArr = this.attachmentFormatters;
        }
        return (Formatter[]) formatterArr.clone();
    }

    public final Formatter[] getAttachmentNames() {
        Formatter[] formatterArr;
        synchronized (this) {
            formatterArr = this.attachmentNames;
        }
        return (Formatter[]) formatterArr.clone();
    }

    public final synchronized Authenticator getAuthenticator() {
        checkAccess();
        return this.auth;
    }

    public final synchronized int getCapacity() {
        return Math.abs(this.capacity);
    }

    public final synchronized Comparator<? super LogRecord> getComparator() {
        return this.comparator;
    }

    @Override // java.util.logging.Handler
    public synchronized String getEncoding() {
        return this.encoding;
    }

    @Override // java.util.logging.Handler
    public ErrorManager getErrorManager() {
        checkAccess();
        return this.errorManager;
    }

    @Override // java.util.logging.Handler
    public Filter getFilter() {
        return this.filter;
    }

    @Override // java.util.logging.Handler
    public synchronized Formatter getFormatter() {
        return this.formatter;
    }

    @Override // java.util.logging.Handler
    public Level getLevel() {
        return this.logLevel;
    }

    public final Properties getMailProperties() {
        Properties properties;
        checkAccess();
        synchronized (this) {
            properties = this.mailProps;
        }
        return (Properties) properties.clone();
    }

    public final synchronized Filter getPushFilter() {
        return this.pushFilter;
    }

    public final synchronized Level getPushLevel() {
        return this.pushLevel;
    }

    public final synchronized Formatter getSubject() {
        return this.subjectFormatter;
    }

    @Override // java.util.logging.Handler
    public boolean isLoggable(LogRecord logRecord) {
        int iIntValue;
        if (logRecord == null || logRecord.getLevel().intValue() < (iIntValue = getLevel().intValue()) || iIntValue == offValue) {
            return false;
        }
        Filter filter = getFilter();
        if (filter != null && !filter.isLoggable(logRecord)) {
            return isAttachmentLoggable(logRecord);
        }
        setMatchedPart(-1);
        return true;
    }

    public final boolean isMissingContent(Message message, Throwable th) {
        Object andSetContextClassLoader = getAndSetContextClassLoader(MAILHANDLER_LOADER);
        try {
            try {
                try {
                    message.writeTo(new ByteArrayOutputStream(MIN_HEADER_SIZE));
                } catch (Exception e10) {
                    String message2 = e10.getMessage();
                    if (!isEmpty(message2)) {
                        int i10 = 0;
                        while (th != null) {
                            if (e10.getClass() == th.getClass() && message2.equals(th.getMessage())) {
                                getAndSetContextClassLoader(andSetContextClassLoader);
                                return true;
                            }
                            Throwable cause = th.getCause();
                            th = (cause == null && (th instanceof MessagingException)) ? ((MessagingException) th).getNextException() : cause;
                            i10++;
                            if (i10 == 65536) {
                                break;
                            }
                        }
                    }
                }
                getAndSetContextClassLoader(andSetContextClassLoader);
                return false;
            } catch (RuntimeException e11) {
                throw e11;
            }
        } catch (Throwable th2) {
            getAndSetContextClassLoader(andSetContextClassLoader);
            throw th2;
        }
    }

    public void preDestroy() {
        push(false, 3);
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        if (!tryMutex()) {
            reportUnPublishedError(logRecord);
            return;
        }
        try {
            try {
                if (isLoggable(logRecord)) {
                    if (logRecord != null) {
                        logRecord.getSourceMethodName();
                        publish0(logRecord);
                    } else {
                        reportNullError(1);
                    }
                }
            } catch (LinkageError e10) {
                reportLinkageError(e10, 1);
            }
        } finally {
            releaseMutex();
        }
    }

    public void push() {
        push(true, 2);
    }

    @Override // java.util.logging.Handler
    public void reportError(String str, Exception exc, int i10) {
        try {
            if (str != null) {
                this.errorManager.error(Level.SEVERE.getName().concat(": ").concat(str), exc, i10);
            } else {
                this.errorManager.error(null, exc, i10);
            }
        } catch (LinkageError e10) {
            e = e10;
            reportLinkageError(e, i10);
        } catch (RuntimeException e11) {
            e = e11;
            reportLinkageError(e, i10);
        }
    }

    public final void setAttachmentFilters(Filter... filterArr) {
        checkAccess();
        Filter[] filterArrEmptyFilterArray = filterArr.length == 0 ? emptyFilterArray() : (Filter[]) Arrays.copyOf(filterArr, filterArr.length, Filter[].class);
        synchronized (this) {
            try {
                Formatter[] formatterArr = this.attachmentFormatters;
                if (formatterArr.length != filterArrEmptyFilterArray.length) {
                    throw attachmentMismatch(formatterArr.length, filterArrEmptyFilterArray.length);
                }
                if (this.isWriting) {
                    throw new IllegalStateException();
                }
                if (this.size != 0) {
                    for (int i10 = 0; i10 < filterArrEmptyFilterArray.length; i10++) {
                        if (filterArrEmptyFilterArray[i10] != this.attachmentFilters[i10]) {
                            clearMatches(i10);
                            break;
                        }
                    }
                }
                this.attachmentFilters = filterArrEmptyFilterArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setAttachmentFormatters(Formatter... formatterArr) {
        Formatter[] formatterArrEmptyFormatterArray;
        checkAccess();
        if (formatterArr.length == 0) {
            formatterArrEmptyFormatterArray = emptyFormatterArray();
        } else {
            formatterArrEmptyFormatterArray = (Formatter[]) Arrays.copyOf(formatterArr, formatterArr.length, Formatter[].class);
            for (int i10 = 0; i10 < formatterArrEmptyFormatterArray.length; i10++) {
                if (formatterArrEmptyFormatterArray[i10] == null) {
                    throw new NullPointerException(atIndexMsg(i10));
                }
            }
        }
        synchronized (this) {
            try {
                if (this.isWriting) {
                    throw new IllegalStateException();
                }
                this.attachmentFormatters = formatterArrEmptyFormatterArray;
                alignAttachmentFilters();
                alignAttachmentNames();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setAttachmentNames(String... strArr) {
        checkAccess();
        Formatter[] formatterArrEmptyFormatterArray = strArr.length == 0 ? emptyFormatterArray() : new Formatter[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str == null) {
                throw new NullPointerException(atIndexMsg(i10));
            }
            if (str.length() <= 0) {
                throw new IllegalArgumentException(atIndexMsg(i10));
            }
            formatterArrEmptyFormatterArray[i10] = TailNameFormatter.m12172of(str);
        }
        synchronized (this) {
            try {
                Formatter[] formatterArr = this.attachmentFormatters;
                if (formatterArr.length != strArr.length) {
                    throw attachmentMismatch(formatterArr.length, strArr.length);
                }
                if (this.isWriting) {
                    throw new IllegalStateException();
                }
                this.attachmentNames = formatterArrEmptyFormatterArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setAuthenticator(Authenticator authenticator) throws Throwable {
        setAuthenticator0(authenticator);
    }

    public final synchronized void setComparator(Comparator<? super LogRecord> comparator) {
        checkAccess();
        if (this.isWriting) {
            throw new IllegalStateException();
        }
        this.comparator = comparator;
    }

    @Override // java.util.logging.Handler
    public void setEncoding(String str) throws UnsupportedEncodingException {
        checkAccess();
        setEncoding0(str);
    }

    @Override // java.util.logging.Handler
    public void setErrorManager(ErrorManager errorManager) {
        checkAccess();
        setErrorManager0(errorManager);
    }

    @Override // java.util.logging.Handler
    public void setFilter(Filter filter) {
        checkAccess();
        synchronized (this) {
            try {
                if (filter != this.filter) {
                    clearMatches(-1);
                }
                this.filter = filter;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.logging.Handler
    public synchronized void setFormatter(Formatter formatter) {
        checkAccess();
        if (formatter == null) {
            throw new NullPointerException();
        }
        this.formatter = formatter;
    }

    @Override // java.util.logging.Handler
    public void setLevel(Level level) {
        level.getClass();
        checkAccess();
        synchronized (this) {
            try {
                if (this.capacity > 0) {
                    this.logLevel = level;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setMailProperties(Properties properties) throws Throwable {
        setMailProperties0(properties);
    }

    public final synchronized void setPushFilter(Filter filter) {
        checkAccess();
        if (this.isWriting) {
            throw new IllegalStateException();
        }
        this.pushFilter = filter;
    }

    public final synchronized void setPushLevel(Level level) {
        checkAccess();
        if (level == null) {
            throw new NullPointerException();
        }
        if (this.isWriting) {
            throw new IllegalStateException();
        }
        this.pushLevel = level;
    }

    public final void setSubject(String str) {
        if (str != null) {
            setSubject(TailNameFormatter.m12172of(str));
        } else {
            checkAccess();
            throw null;
        }
    }

    private static RuntimeException attachmentMismatch(int i10, int i11) {
        return attachmentMismatch("Attachments mismatched, expected " + i10 + " but given " + i11 + '.');
    }

    private void push(boolean z10, int i10) {
        try {
            if (!tryMutex()) {
                reportUnPublishedError(null);
                return;
            }
            try {
                Message messageWriteLogRecords = writeLogRecords(i10);
                if (messageWriteLogRecords != null) {
                    send(messageWriteLogRecords, z10, i10);
                }
            } catch (LinkageError e10) {
                reportLinkageError(e10, i10);
            }
        } finally {
            releaseMutex();
        }
    }

    public final void setAuthenticator(char... cArr) throws Throwable {
        if (cArr == null) {
            setAuthenticator0(null);
        } else {
            setAuthenticator0(DefaultAuthenticator.m12171of(new String(cArr)));
        }
    }

    public final void setSubject(Formatter formatter) {
        checkAccess();
        formatter.getClass();
        synchronized (this) {
            try {
                if (!this.isWriting) {
                    this.subjectFormatter = formatter;
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void reportError(Message message, Exception exc, int i10) {
        try {
            try {
                this.errorManager.error(toRawString(message), exc, i10);
            } catch (RuntimeException e10) {
                reportError(toMsgString(e10), exc, i10);
            } catch (Exception e11) {
                reportError(toMsgString(e11), exc, i10);
            }
        } catch (LinkageError e12) {
            reportLinkageError(e12, i10);
        }
    }

    public MailHandler(int i10) {
        init(null);
        this.sealed = true;
        setCapacity0(i10);
    }

    private MimeBodyPart createBodyPart(int i10) throws MessagingException {
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setDisposition(Part.ATTACHMENT);
        mimeBodyPart.setDescription(descriptionFrom(this.attachmentFormatters[i10], this.attachmentFilters[i10], this.attachmentNames[i10]));
        setAcceptLang(mimeBodyPart);
        return mimeBodyPart;
    }

    private String descriptionFrom(Formatter formatter, Filter filter, Formatter formatter2) {
        String name;
        StringBuilder sb2 = new StringBuilder("Formatted using ");
        sb2.append(getClassId(formatter));
        sb2.append(", filtered with ");
        if (filter == null) {
            name = "no filter";
        } else {
            name = filter.getClass().getName();
        }
        sb2.append(name);
        sb2.append(", and named by ");
        return C15569B0.m18232a(sb2, getClassId(formatter2), '.');
    }

    public final String contentTypeOf(Formatter formatter) {
        String name;
        String lowerCase;
        int iIndexOf;
        if (formatter == null) {
            return null;
        }
        String contentType = getContentType(formatter.getClass().getName());
        if (contentType != null) {
            return contentType;
        }
        for (Class<?> superclass = formatter.getClass(); superclass != Formatter.class; superclass = superclass.getSuperclass()) {
            try {
                name = superclass.getSimpleName();
                while (true) {
                    int iIndexOf2 = lowerCase.indexOf("ml", iIndexOf);
                    if (iIndexOf2 > -1) {
                        if (iIndexOf2 > 0) {
                            int i10 = iIndexOf2 - 1;
                            if (lowerCase.charAt(i10) == 'x') {
                                return "application/xml";
                            }
                            if (iIndexOf2 > 1 && lowerCase.charAt(iIndexOf2 - 2) == 'h' && lowerCase.charAt(i10) == 't') {
                                return "text/html";
                            }
                        }
                        iIndexOf = iIndexOf2 + 2;
                    }
                }
            } catch (InternalError unused) {
                name = superclass.getName();
            }
            lowerCase = name.toLowerCase(Locale.ENGLISH);
            iIndexOf = lowerCase.indexOf(36) + 1;
        }
        return null;
    }

    public MailHandler(Properties properties) throws Throwable {
        properties.getClass();
        init(properties);
        this.sealed = true;
        setMailProperties0(properties);
    }

    public void postConstruct() {
    }

    public final void setAttachmentNames(Formatter... formatterArr) {
        Formatter[] formatterArrEmptyFormatterArray;
        checkAccess();
        if (formatterArr.length == 0) {
            formatterArrEmptyFormatterArray = emptyFormatterArray();
        } else {
            formatterArrEmptyFormatterArray = (Formatter[]) Arrays.copyOf(formatterArr, formatterArr.length, Formatter[].class);
        }
        for (int i10 = 0; i10 < formatterArrEmptyFormatterArray.length; i10++) {
            if (formatterArrEmptyFormatterArray[i10] == null) {
                throw new NullPointerException(atIndexMsg(i10));
            }
        }
        synchronized (this) {
            try {
                Formatter[] formatterArr2 = this.attachmentFormatters;
                if (formatterArr2.length == formatterArrEmptyFormatterArray.length) {
                    if (!this.isWriting) {
                        this.attachmentNames = formatterArrEmptyFormatterArray;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw attachmentMismatch(formatterArr2.length, formatterArrEmptyFormatterArray.length);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Object intern(Map<Object, Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        Object objNewInstance = obj.getClass().getName().equals(TailNameFormatter.class.getName()) ? obj : obj.getClass().getConstructor(null).newInstance(null);
        if (objNewInstance.getClass() == obj.getClass()) {
            Object obj2 = map.get(objNewInstance);
            if (obj2 == null) {
                boolean zEquals = objNewInstance.equals(obj);
                boolean zEquals2 = obj.equals(objNewInstance);
                if (zEquals && zEquals2) {
                    Object objPut = map.put(obj, obj);
                    if (objPut != null) {
                        reportNonDiscriminating(objNewInstance, objPut);
                        Object objRemove = map.remove(objNewInstance);
                        if (objRemove != obj) {
                            reportNonDiscriminating(objNewInstance, objRemove);
                            map.clear();
                            return obj;
                        }
                    }
                } else if (zEquals != zEquals2) {
                    reportNonSymmetric(obj, objNewInstance);
                    return obj;
                }
            } else {
                if (obj.getClass() == obj2.getClass()) {
                    return obj2;
                }
                reportNonDiscriminating(obj, obj2);
            }
        }
        return obj;
    }
}
