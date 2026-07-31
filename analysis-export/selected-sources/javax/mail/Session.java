package javax.mail;

import com.sun.mail.util.DefaultProvider;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailLogger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ServiceLoader;
import java.util.StringTokenizer;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import p092F1.C1473c;
import p183K2.C2794s;
import p450Z.C6628k;
import p470a1.C6989a;
import p847x0.C19604w;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class Session {
    private static final String confDir;
    private static Session defaultSession;
    private final Authenticator authenticator;
    private boolean debug;
    private MailLogger logger;
    private PrintStream out;
    private final Properties props;

    /* JADX INFO: renamed from: q */
    private final EventQueue f50058q;
    private final Hashtable<URLName, PasswordAuthentication> authTable = new Hashtable<>();
    private final List<Provider> providers = new ArrayList();
    private final Map<String, Provider> providersByProtocol = new HashMap();
    private final Map<String, Provider> providersByClassName = new HashMap();
    private final Properties addressMap = new Properties();

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: javax.mail.Session.1
                @Override // java.security.PrivilegedAction
                public String run() {
                    String property = System.getProperty("java.home");
                    StringBuilder sbM21517a = C19604w.m21517a(property);
                    String str2 = File.separator;
                    String strM7848b = C6989a.m7848b(str2, "conf", sbM21517a);
                    return new File(strM7848b).exists() ? C6628k.m7436a(strM7848b, str2) : C2794s.m3510a(property, str2, "lib", str2);
                }
            });
        } catch (Exception unused) {
            str = null;
        }
        confDir = str;
    }

    private Session(Properties properties, Authenticator authenticator) throws Throwable {
        this.debug = false;
        this.props = properties;
        this.authenticator = authenticator;
        if (Boolean.valueOf(properties.getProperty("mail.debug")).booleanValue()) {
            this.debug = true;
        }
        initLogger();
        this.logger.log(Level.CONFIG, "Jakarta Mail version {0}", Version.version);
        Class<?> cls = authenticator != null ? authenticator.getClass() : Session.class;
        loadProviders(cls);
        loadAddressMap(cls);
        this.f50058q = new EventQueue((Executor) properties.get("mail.event.executor"));
    }

    public static ClassLoader getContextClassLoader() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: javax.mail.Session.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused) {
                    return null;
                }
            }
        });
    }

    public static synchronized Session getDefaultInstance(Properties properties, Authenticator authenticator) {
        try {
            Session session = defaultSession;
            if (session == null) {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    securityManager.checkSetFactory();
                }
                defaultSession = new Session(properties, authenticator);
            } else {
                Authenticator authenticator2 = session.authenticator;
                if (authenticator2 != authenticator && (authenticator2 == null || authenticator == null || authenticator2.getClass().getClassLoader() != authenticator.getClass().getClassLoader())) {
                    throw new SecurityException("Access to default session denied");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return defaultSession;
    }

    public static Session getInstance(Properties properties, Authenticator authenticator) {
        return new Session(properties, authenticator);
    }

    private static InputStream getResourceAsStream(final Class<?> cls, final String str) throws IOException {
        try {
            return (InputStream) AccessController.doPrivileged(new PrivilegedExceptionAction<InputStream>() { // from class: javax.mail.Session.5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedExceptionAction
                public InputStream run() throws IOException {
                    try {
                        return cls.getResourceAsStream(str);
                    } catch (RuntimeException e10) {
                        IOException iOException = new IOException("ClassLoader.getResourceAsStream failed");
                        iOException.initCause(e10);
                        throw iOException;
                    }
                }
            });
        } catch (PrivilegedActionException e10) {
            throw ((IOException) e10.getException());
        }
    }

    private static URL[] getResources(final ClassLoader classLoader, final String str) {
        return (URL[]) AccessController.doPrivileged(new PrivilegedAction<URL[]>() { // from class: javax.mail.Session.6
            @Override // java.security.PrivilegedAction
            public URL[] run() {
                URL[] urlArr = null;
                try {
                    ArrayList list = Collections.list(classLoader.getResources(str));
                    if (list.isEmpty()) {
                        return null;
                    }
                    urlArr = new URL[list.size()];
                    list.toArray(urlArr);
                    return urlArr;
                } catch (IOException | SecurityException unused) {
                    return urlArr;
                }
            }
        });
    }

    private <T extends Service> T getService(Provider provider, URLName uRLName, Class<T> cls) throws NoSuchProviderException {
        Class<?> cls2;
        if (provider == null) {
            throw new NoSuchProviderException("null");
        }
        if (uRLName == null) {
            uRLName = new URLName(provider.getProtocol(), null, -1, null, null, null);
        }
        Authenticator authenticator = this.authenticator;
        ClassLoader classLoader = authenticator != null ? authenticator.getClass().getClassLoader() : Session.class.getClassLoader();
        try {
            try {
                ClassLoader contextClassLoader = getContextClassLoader();
                if (contextClassLoader != null) {
                    try {
                        cls2 = Class.forName(provider.getClassName(), false, contextClassLoader);
                    } catch (ClassNotFoundException unused) {
                        cls2 = null;
                    }
                } else {
                    cls2 = null;
                }
                if (cls2 == null || !cls.isAssignableFrom(cls2)) {
                    cls2 = Class.forName(provider.getClassName(), false, classLoader);
                }
                if (!cls.isAssignableFrom(cls2)) {
                    throw new ClassCastException(cls.getName() + " " + cls2.getName());
                }
            } catch (Exception e10) {
                this.logger.log(Level.FINE, "Exception loading provider", (Throwable) e10);
                throw new NoSuchProviderException(provider.getProtocol());
            }
        } catch (Exception unused2) {
            cls2 = Class.forName(provider.getClassName());
            if (!cls.isAssignableFrom(cls2)) {
                throw new ClassCastException(cls.getName() + " " + cls2.getName());
            }
        }
        try {
            return cls.cast(cls2.getConstructor(Session.class, URLName.class).newInstance(this, uRLName));
        } catch (Exception e11) {
            this.logger.log(Level.FINE, "Exception loading provider", (Throwable) e11);
            throw new NoSuchProviderException(provider.getProtocol());
        }
    }

    private static URL[] getSystemResources(final String str) {
        return (URL[]) AccessController.doPrivileged(new PrivilegedAction<URL[]>() { // from class: javax.mail.Session.7
            @Override // java.security.PrivilegedAction
            public URL[] run() {
                URL[] urlArr = null;
                try {
                    ArrayList list = Collections.list(ClassLoader.getSystemResources(str));
                    if (list.isEmpty()) {
                        return null;
                    }
                    urlArr = new URL[list.size()];
                    list.toArray(urlArr);
                    return urlArr;
                } catch (IOException | SecurityException unused) {
                    return urlArr;
                }
            }
        });
    }

    private final synchronized void initLogger() {
        this.logger = new MailLogger((Class<?>) Session.class, "DEBUG", this.debug, getDebugOut());
    }

    private void loadAddressMap(Class<?> cls) throws Throwable {
        StreamLoader streamLoader = new StreamLoader() { // from class: javax.mail.Session.3
            @Override // javax.mail.StreamLoader
            public void load(InputStream inputStream) throws IOException {
                Session.this.addressMap.load(inputStream);
            }
        };
        loadResource("/META-INF/javamail.default.address.map", cls, streamLoader, true);
        loadAllResources("META-INF/javamail.address.map", cls, streamLoader);
        try {
            String str = confDir;
            if (str != null) {
                loadFile(str + "javamail.address.map", streamLoader);
            }
        } catch (SecurityException unused) {
        }
        if (this.addressMap.isEmpty()) {
            this.logger.config("failed to load address map, using defaults");
            this.addressMap.put("rfc822", "smtp");
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062 A[PHI: r6
      0x0062: PHI (r6v4 java.io.InputStream) = (r6v2 java.io.InputStream), (r6v5 java.io.InputStream) binds: [B:34:0x0060, B:37:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    private void loadAllResources(String str, Class<?> cls, StreamLoader streamLoader) {
        boolean z10;
        try {
            ClassLoader contextClassLoader = getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = cls.getClassLoader();
            }
            URL[] resources = contextClassLoader != null ? getResources(contextClassLoader, str) : getSystemResources(str);
            if (resources != null) {
                z10 = false;
                for (URL url : resources) {
                    try {
                        MailLogger mailLogger = this.logger;
                        Level level = Level.CONFIG;
                        mailLogger.log(level, "URL {0}", url);
                        InputStream inputStreamOpenStream = null;
                        try {
                            try {
                                try {
                                    inputStreamOpenStream = openStream(url);
                                    if (inputStreamOpenStream != null) {
                                        streamLoader.load(inputStreamOpenStream);
                                        z10 = true;
                                        this.logger.log(level, "successfully loaded resource: {0}", url);
                                    } else {
                                        this.logger.log(level, "not loading resource: {0}", url);
                                    }
                                    if (inputStreamOpenStream != null) {
                                        try {
                                            inputStreamOpenStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (inputStreamOpenStream != null) {
                                        try {
                                            inputStreamOpenStream.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e10) {
                                this.logger.log(Level.CONFIG, "Exception loading resource", (Throwable) e10);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            }
                        } catch (FileNotFoundException unused3) {
                            if (inputStreamOpenStream != null) {
                            }
                        } catch (SecurityException e11) {
                            this.logger.log(Level.CONFIG, "Exception loading resource", (Throwable) e11);
                            if (inputStreamOpenStream != null) {
                                inputStreamOpenStream.close();
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        this.logger.log(Level.CONFIG, "Exception loading resource", (Throwable) e);
                        if (z10) {
                        }
                        loadResource(C1473c.m2035a("/", str), cls, streamLoader, false);
                    }
                }
            } else {
                z10 = false;
            }
        } catch (Exception e13) {
            e = e13;
            z10 = false;
        }
        if (z10) {
            loadResource(C1473c.m2035a("/", str), cls, streamLoader, false);
        }
    }

    private void loadFile(String str, StreamLoader streamLoader) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
                    try {
                        streamLoader.load(bufferedInputStream2);
                        this.logger.log(Level.CONFIG, "successfully loaded file: {0}", str);
                        bufferedInputStream2.close();
                    } catch (FileNotFoundException unused) {
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream == null) {
                            return;
                        }
                        bufferedInputStream.close();
                    } catch (IOException e10) {
                        e = e10;
                        bufferedInputStream = bufferedInputStream2;
                        MailLogger mailLogger = this.logger;
                        Level level = Level.CONFIG;
                        if (mailLogger.isLoggable(level)) {
                            this.logger.log(level, "not loading file: " + str, (Throwable) e);
                        }
                        if (bufferedInputStream == null) {
                            return;
                        }
                        bufferedInputStream.close();
                    } catch (SecurityException e11) {
                        e = e11;
                        bufferedInputStream = bufferedInputStream2;
                        MailLogger mailLogger2 = this.logger;
                        Level level2 = Level.CONFIG;
                        if (mailLogger2.isLoggable(level2)) {
                            this.logger.log(level2, "not loading file: " + str, (Throwable) e);
                        }
                        if (bufferedInputStream == null) {
                            return;
                        }
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (FileNotFoundException unused4) {
            } catch (IOException e12) {
                e = e12;
            } catch (SecurityException e13) {
                e = e13;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void loadProviders(Class<?> cls) throws Throwable {
        StreamLoader streamLoader = new StreamLoader() { // from class: javax.mail.Session.2
            @Override // javax.mail.StreamLoader
            public void load(InputStream inputStream) {
                Session.this.loadProvidersFromStream(inputStream);
            }
        };
        try {
            String str = confDir;
            if (str != null) {
                loadFile(str + "javamail.providers", streamLoader);
            }
        } catch (SecurityException unused) {
        }
        for (Provider provider : ServiceLoader.load(Provider.class)) {
            if (!provider.getClass().isAnnotationPresent(DefaultProvider.class)) {
                addProvider(provider);
            }
        }
        loadAllResources("META-INF/javamail.providers", cls, streamLoader);
        loadResource("/META-INF/javamail.default.providers", cls, streamLoader, false);
        for (Provider provider2 : ServiceLoader.load(Provider.class)) {
            if (provider2.getClass().isAnnotationPresent(DefaultProvider.class)) {
                addProvider(provider2);
            }
        }
        if (this.providers.size() == 0) {
            this.logger.config("failed to load any providers, using defaults");
            Provider.Type type = Provider.Type.STORE;
            addProvider(new Provider(type, "imap", "com.sun.mail.imap.IMAPStore", "Oracle", Version.version));
            addProvider(new Provider(type, "imaps", "com.sun.mail.imap.IMAPSSLStore", "Oracle", Version.version));
            addProvider(new Provider(type, "pop3", "com.sun.mail.pop3.POP3Store", "Oracle", Version.version));
            addProvider(new Provider(type, "pop3s", "com.sun.mail.pop3.POP3SSLStore", "Oracle", Version.version));
            Provider.Type type2 = Provider.Type.TRANSPORT;
            addProvider(new Provider(type2, "smtp", "com.sun.mail.smtp.SMTPTransport", "Oracle", Version.version));
            addProvider(new Provider(type2, "smtps", "com.sun.mail.smtp.SMTPSSLTransport", "Oracle", Version.version));
        }
        if (this.logger.isLoggable(Level.CONFIG)) {
            this.logger.config("Tables of loaded providers");
            this.logger.config("Providers Listed By Class Name: " + this.providersByClassName.toString());
            this.logger.config("Providers Listed By Protocol: " + this.providersByProtocol.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadProvidersFromStream(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        LineInputStream lineInputStream = new LineInputStream(inputStream);
        while (true) {
            String line = lineInputStream.readLine();
            if (line == null) {
                return;
            }
            if (!line.startsWith("#") && line.trim().length() != 0) {
                StringTokenizer stringTokenizer = new StringTokenizer(line, ";");
                Provider.Type type = null;
                String strSubstring = null;
                String strSubstring2 = null;
                String strSubstring3 = null;
                String strSubstring4 = null;
                while (stringTokenizer.hasMoreTokens()) {
                    String strTrim = stringTokenizer.nextToken().trim();
                    int iIndexOf = strTrim.indexOf("=");
                    if (strTrim.startsWith("protocol=")) {
                        strSubstring = strTrim.substring(iIndexOf + 1);
                    } else if (strTrim.startsWith("type=")) {
                        String strSubstring5 = strTrim.substring(iIndexOf + 1);
                        if (strSubstring5.equalsIgnoreCase("store")) {
                            type = Provider.Type.STORE;
                        } else if (strSubstring5.equalsIgnoreCase("transport")) {
                            type = Provider.Type.TRANSPORT;
                        }
                    } else if (strTrim.startsWith("class=")) {
                        strSubstring2 = strTrim.substring(iIndexOf + 1);
                    } else if (strTrim.startsWith("vendor=")) {
                        strSubstring3 = strTrim.substring(iIndexOf + 1);
                    } else if (strTrim.startsWith("version=")) {
                        strSubstring4 = strTrim.substring(iIndexOf + 1);
                    }
                }
                if (type == null || strSubstring == null || strSubstring2 == null || strSubstring.length() <= 0 || strSubstring2.length() <= 0) {
                    this.logger.log(Level.CONFIG, "Bad provider entry: {0}", line);
                } else {
                    addProvider(new Provider(type, strSubstring, strSubstring2, strSubstring3, strSubstring4));
                }
            }
        }
    }

    private void loadResource(String str, Class<?> cls, StreamLoader streamLoader, boolean z10) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    InputStream resourceAsStream = getResourceAsStream(cls, str);
                    if (resourceAsStream != null) {
                        streamLoader.load(resourceAsStream);
                        this.logger.log(Level.CONFIG, "successfully loaded resource: {0}", str);
                    } else if (z10) {
                        this.logger.log(Level.WARNING, "expected resource not found: {0}", str);
                    }
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.logger.log(Level.CONFIG, "Exception loading resource", (Throwable) e10);
                if (0 == 0) {
                    return;
                }
                inputStream.close();
            } catch (SecurityException e11) {
                this.logger.log(Level.CONFIG, "Exception loading resource", (Throwable) e11);
                if (0 == 0) {
                    return;
                }
                inputStream.close();
            }
        } catch (IOException unused2) {
        }
    }

    private static InputStream openStream(final URL url) throws IOException {
        try {
            return (InputStream) AccessController.doPrivileged(new PrivilegedExceptionAction<InputStream>() { // from class: javax.mail.Session.8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.security.PrivilegedExceptionAction
                public InputStream run() {
                    return url.openStream();
                }
            });
        } catch (PrivilegedActionException e10) {
            throw ((IOException) e10.getException());
        }
    }

    public synchronized void addProvider(Provider provider) {
        this.providers.add(provider);
        this.providersByClassName.put(provider.getClassName(), provider);
        if (!this.providersByProtocol.containsKey(provider.getProtocol())) {
            this.providersByProtocol.put(provider.getProtocol(), provider);
        }
    }

    public synchronized boolean getDebug() {
        return this.debug;
    }

    public synchronized PrintStream getDebugOut() {
        PrintStream printStream = this.out;
        if (printStream != null) {
            return printStream;
        }
        return System.out;
    }

    public EventQueue getEventQueue() {
        return this.f50058q;
    }

    public Folder getFolder(URLName uRLName) {
        Store store = getStore(uRLName);
        store.connect();
        return store.getFolder(uRLName);
    }

    public PasswordAuthentication getPasswordAuthentication(URLName uRLName) {
        return this.authTable.get(uRLName);
    }

    public Properties getProperties() {
        return this.props;
    }

    public String getProperty(String str) {
        return this.props.getProperty(str);
    }

    public synchronized Provider getProvider(String str) {
        Provider provider;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    String property = this.props.getProperty("mail." + str + ".class");
                    if (property != null) {
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("mail." + str + ".class property exists and points to " + property);
                        }
                        provider = this.providersByClassName.get(property);
                    } else {
                        provider = null;
                    }
                    if (provider != null) {
                        return provider;
                    }
                    Provider provider2 = this.providersByProtocol.get(str);
                    if (provider2 == null) {
                        throw new NoSuchProviderException("No provider for ".concat(str));
                    }
                    if (this.logger.isLoggable(Level.FINE)) {
                        this.logger.fine("getProvider() returning " + provider2.toString());
                    }
                    return provider2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new NoSuchProviderException("Invalid protocol: null");
    }

    public synchronized Provider[] getProviders() {
        Provider[] providerArr;
        providerArr = new Provider[this.providers.size()];
        this.providers.toArray(providerArr);
        return providerArr;
    }

    public Store getStore() {
        return getStore(getProperty("mail.store.protocol"));
    }

    public Transport getTransport() {
        String property = getProperty("mail.transport.protocol");
        if (property != null) {
            return getTransport(property);
        }
        String str = (String) this.addressMap.get("rfc822");
        return str != null ? getTransport(str) : getTransport("smtp");
    }

    public PasswordAuthentication requestPasswordAuthentication(InetAddress inetAddress, int i10, String str, String str2, String str3) {
        Authenticator authenticator = this.authenticator;
        if (authenticator != null) {
            return authenticator.requestPasswordAuthentication(inetAddress, i10, str, str2, str3);
        }
        return null;
    }

    public synchronized void setDebug(boolean z10) {
        this.debug = z10;
        initLogger();
        this.logger.log(Level.CONFIG, "setDebug: Jakarta Mail version {0}", Version.version);
    }

    public synchronized void setDebugOut(PrintStream printStream) {
        this.out = printStream;
        initLogger();
    }

    public void setPasswordAuthentication(URLName uRLName, PasswordAuthentication passwordAuthentication) {
        if (passwordAuthentication == null) {
            this.authTable.remove(uRLName);
        } else {
            this.authTable.put(uRLName, passwordAuthentication);
        }
    }

    public synchronized void setProtocolForAddress(String str, String str2) {
        try {
            if (str2 == null) {
                this.addressMap.remove(str);
            } else {
                this.addressMap.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setProvider(Provider provider) {
        try {
            if (provider == null) {
                throw new NoSuchProviderException("Can't set null provider");
            }
            this.providersByProtocol.put(provider.getProtocol(), provider);
            this.providersByClassName.put(provider.getClassName(), provider);
            this.props.put("mail." + provider.getProtocol() + ".class", provider.getClassName());
        } catch (Throwable th) {
            throw th;
        }
    }

    public static Session getInstance(Properties properties) {
        return new Session(properties, null);
    }

    public Store getStore(String str) {
        return getStore(new URLName(str, null, -1, null, null, null));
    }

    public Store getStore(URLName uRLName) {
        return getStore(getProvider(uRLName.getProtocol()), uRLName);
    }

    public Store getStore(Provider provider) {
        return getStore(provider, null);
    }

    public Transport getTransport(String str) {
        return getTransport(new URLName(str, null, -1, null, null, null));
    }

    private Store getStore(Provider provider, URLName uRLName) throws NoSuchProviderException {
        if (provider != null && provider.getType() == Provider.Type.STORE) {
            return (Store) getService(provider, uRLName, Store.class);
        }
        throw new NoSuchProviderException("invalid provider");
    }

    public Transport getTransport(URLName uRLName) {
        return getTransport(getProvider(uRLName.getProtocol()), uRLName);
    }

    public static Session getDefaultInstance(Properties properties) {
        return getDefaultInstance(properties, null);
    }

    public Transport getTransport(Provider provider) {
        return getTransport(provider, null);
    }

    public Transport getTransport(Address address) throws NoSuchProviderException {
        String property = getProperty("mail.transport.protocol." + address.getType());
        if (property != null) {
            return getTransport(property);
        }
        String str = (String) this.addressMap.get(address.getType());
        if (str != null) {
            return getTransport(str);
        }
        throw new NoSuchProviderException("No provider for Address type: " + address.getType());
    }

    private Transport getTransport(Provider provider, URLName uRLName) throws NoSuchProviderException {
        if (provider != null && provider.getType() == Provider.Type.TRANSPORT) {
            return (Transport) getService(provider, uRLName, Transport.class);
        }
        throw new NoSuchProviderException("invalid provider");
    }
}
