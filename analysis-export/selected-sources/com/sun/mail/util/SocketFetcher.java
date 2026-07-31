package com.sun.mail.util;

import androidx.datastore.preferences.protobuf.C7653h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessController;
import java.security.GeneralSecurityException;
import java.security.PrivilegedAction;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p092F1.C1473c;
import p183K2.C2770g;
import p607i9.C12948z6;
import p622j.C15292t;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class SocketFetcher {
    private static MailLogger logger = new MailLogger(SocketFetcher.class, "socket", "DEBUG SocketFetcher", PropUtil.getBooleanSystemProperty("mail.socket.debug", false), System.out);

    private SocketFetcher() {
    }

    private static void checkServerIdentity(String str, SSLSocket sSLSocket) throws IOException {
        try {
            Certificate[] peerCertificates = sSLSocket.getSession().getPeerCertificates();
            if (peerCertificates != null && peerCertificates.length > 0) {
                Certificate certificate = peerCertificates[0];
                if ((certificate instanceof X509Certificate) && matchCert(str, (X509Certificate) certificate)) {
                    return;
                }
            }
            sSLSocket.close();
            throw new IOException(C1473c.m2035a("Can't verify identity of server: ", str));
        } catch (SSLPeerUnverifiedException e10) {
            sSLSocket.close();
            IOException iOException = new IOException(C1473c.m2035a("Can't verify identity of server: ", str));
            iOException.initCause(e10);
            throw iOException;
        }
    }

    private static IOException cleanupAndThrow(Socket socket, IOException iOException) {
        try {
            socket.close();
            return iOException;
        } catch (Throwable th) {
            if (isRecoverable(th)) {
                iOException.addSuppressed(th);
                return iOException;
            }
            th.addSuppressed(iOException);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new RuntimeException("unexpected exception", th);
        }
    }

    private static void configureSSLSocket(Socket socket, String str, Properties properties, String str2, SocketFactory socketFactory) throws IOException {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String property = properties.getProperty(str2 + ".ssl.protocols", null);
            if (property != null) {
                sSLSocket.setEnabledProtocols(stringArray(property));
            } else {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                if (logger.isLoggable(Level.FINER)) {
                    logger.finer("SSL enabled protocols before " + Arrays.asList(enabledProtocols));
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < enabledProtocols.length; i10++) {
                    String str3 = enabledProtocols[i10];
                    if (str3 != null && !str3.startsWith("SSL")) {
                        arrayList.add(enabledProtocols[i10]);
                    }
                }
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            String property2 = properties.getProperty(str2 + ".ssl.ciphersuites", null);
            if (property2 != null) {
                sSLSocket.setEnabledCipherSuites(stringArray(property2));
            }
            if (logger.isLoggable(Level.FINER)) {
                logger.finer("SSL enabled protocols after " + Arrays.asList(sSLSocket.getEnabledProtocols()));
                logger.finer("SSL enabled ciphers after " + Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            }
            sSLSocket.startHandshake();
            if (PropUtil.getBooleanProperty(properties, str2 + ".ssl.checkserveridentity", false)) {
                checkServerIdentity(str, sSLSocket);
            }
            if ((socketFactory instanceof MailSSLSocketFactory) && !((MailSSLSocketFactory) socketFactory).isServerTrusted(str, sSLSocket)) {
                throw cleanupAndThrow(sSLSocket, new IOException(C1473c.m2035a("Server is not trusted: ", str)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [javax.net.SocketFactory] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [javax.net.ssl.SSLSocketFactory] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static Socket createSocket(InetAddress inetAddress, int i10, String str, int i11, int i12, int i13, Properties properties, String str2, SocketFactory socketFactory, boolean z10) throws IOException {
        ?? r10;
        String property;
        int i14;
        String str3;
        int i15;
        String str4;
        Socket socket;
        ?? r11;
        String str5;
        Socket socket2;
        ?? r12;
        ?? r13;
        ?? r14;
        Socket socket3;
        ?? r15;
        ?? r16;
        Socket socketCreateSocket;
        Socket socket4;
        Socket socket5;
        Socket socketCreateSocket2;
        int i16;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        SocketFactory socketFactory2 = socketFactory;
        if (logger.isLoggable(Level.FINEST)) {
            MailLogger mailLogger = logger;
            StringBuilder sb2 = new StringBuilder("create socket: prefix ");
            sb2.append(str2);
            sb2.append(", localaddr ");
            sb2.append(inetAddress);
            sb2.append(", localport ");
            sb2.append(i10);
            sb2.append(", host ");
            sb2.append(str);
            sb2.append(", port ");
            C2770g.m3491a(sb2, i11, ", connection timeout ", i12, ", timeout ");
            sb2.append(i13);
            sb2.append(", socket factory ");
            sb2.append(socketFactory2);
            sb2.append(", useSSL ");
            sb2.append(z10);
            mailLogger.finest(sb2.toString());
        }
        String property2 = properties.getProperty(str2 + ".proxy.host", null);
        String property3 = properties.getProperty(str2 + ".proxy.user", null);
        String property4 = properties.getProperty(str2 + ".proxy.password", null);
        int i17 = 80;
        int i18 = 1080;
        if (property2 != null) {
            int iIndexOf = property2.indexOf(58);
            if (iIndexOf >= 0) {
                try {
                    i17 = Integer.parseInt(property2.substring(iIndexOf + 1));
                } catch (NumberFormatException unused) {
                }
                property2 = property2.substring(0, iIndexOf);
                i16 = i17;
            } else {
                i16 = 80;
            }
            int intProperty = PropUtil.getIntProperty(properties, str2 + ".proxy.port", i16);
            String str11 = "Using web proxy host, port: " + property2 + ", " + intProperty;
            if (logger.isLoggable(Level.FINER)) {
                str8 = str11;
                str9 = "web proxy host ";
                logger.finer("web proxy host " + property2 + ", port " + intProperty);
                if (property3 != null) {
                    MailLogger mailLogger2 = logger;
                    StringBuilder sbM18009a = C15292t.m18009a("web proxy user ", property3, ", password ");
                    if (property4 == null) {
                        str7 = str9;
                        str6 = str8;
                        str10 = "<null>";
                    } else {
                        str7 = str9;
                        str6 = str8;
                        str10 = "<non-null>";
                    }
                    sbM18009a.append(str10);
                    String string = sbM18009a.toString();
                    mailLogger2.finer(string);
                    str7 = string;
                    str6 = str8;
                }
            } else {
                str6 = str11;
                str7 = str11;
            }
            str7 = str9;
            str6 = str8;
            i17 = intProperty;
            property = null;
            i14 = 1080;
            r10 = str7;
            str3 = str6;
        } else {
            r10 = 0;
            property = properties.getProperty(str2 + ".socks.host", null);
            if (property != null) {
                int iIndexOf2 = property.indexOf(58);
                if (iIndexOf2 >= 0) {
                    try {
                        i18 = Integer.parseInt(property.substring(iIndexOf2 + 1));
                    } catch (NumberFormatException unused2) {
                    }
                    property = property.substring(0, iIndexOf2);
                    i15 = i18;
                } else {
                    i15 = 1080;
                }
                int intProperty2 = PropUtil.getIntProperty(properties, str2 + ".socks.port", i15);
                String str12 = "Using SOCKS host, port: " + property + ", " + intProperty2;
                if (logger.isLoggable(Level.FINER)) {
                    logger.finer("socks host " + property + ", port " + intProperty2);
                    str4 = "socks host ";
                } else {
                    str4 = str12;
                }
                i14 = intProperty2;
                property2 = property2;
                str3 = str12;
                r10 = str4;
            } else {
                i14 = 1080;
                str3 = null;
            }
        }
        if (socketFactory2 == null || (r10 = socketFactory2 instanceof SSLSocketFactory) != 0) {
            socket = null;
            r11 = r10;
        } else {
            socketCreateSocket2 = socketFactory2.createSocket();
        }
        if (socket != null) {
            str5 = property2;
        } else if (property != null) {
            str5 = property2;
            Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(property, i14));
            Socket socket6 = new Socket(proxy);
            r12 = proxy;
            socket2 = socket6;
        } else {
            str5 = property2;
            r12 = 0;
            r12 = 0;
            if (PropUtil.getBooleanProperty(properties, str2 + ".usesocketchannels", false)) {
                logger.finer("using SocketChannels");
                socket5 = SocketChannel.open().socket();
            } else {
                socket4 = new Socket();
            }
        }
        if (i13 >= 0) {
            r11 = r10;
            socket = socketCreateSocket2;
            r12 = r11;
            socket2 = socket;
            socket2 = socket4;
            socket2 = socket5;
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("set socket read timeout " + i13);
            }
            socket2.setSoTimeout(i13);
        }
        r11 = r10;
        socket = socketCreateSocket2;
        r12 = r11;
        socket2 = socket;
        socket2 = socket4;
        socket2 = socket5;
        ?? r17 = -1;
        int intProperty3 = PropUtil.getIntProperty(properties, str2 + ".writetimeout", -1);
        Socket socket7 = socket2;
        if (intProperty3 != -1) {
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("set socket write timeout " + intProperty3);
            }
            WriteTimeoutSocket writeTimeoutSocket = new WriteTimeoutSocket(socket2, intProperty3);
            socket7 = writeTimeoutSocket;
            r17 = writeTimeoutSocket;
        }
        if (inetAddress != null) {
            socket7.bind(new InetSocketAddress(inetAddress, i10));
        }
        try {
            logger.finest("connecting...");
            try {
                if (str5 != null) {
                    int i19 = i11;
                    Socket socket8 = socket7;
                    try {
                        proxyConnect(socket8, str5, i17, property3, property4, str, i19 == true ? 1 : 0, i12);
                        r17 = str;
                        socket3 = socket8;
                        r12 = i19;
                    } catch (IOException e10) {
                        e = e10;
                        r13 = str;
                        r14 = i19;
                        IOException iOException = e;
                        logger.log(Level.FINEST, "connection failed", (Throwable) iOException);
                        throw new SocketConnectException(str3, iOException, r13, r14 == true ? 1 : 0, i12);
                    }
                } else {
                    String str13 = str;
                    int i20 = i11;
                    Socket socket9 = socket7;
                    if (i12 >= 0) {
                        socket9.connect(new InetSocketAddress(str13, i20 == true ? 1 : 0), i12);
                        socket3 = socket9;
                        r17 = str13;
                        r12 = i20;
                    } else {
                        socket9.connect(new InetSocketAddress(str13, i20 == true ? 1 : 0));
                        socket3 = socket9;
                        r17 = str13;
                        r12 = i20;
                    }
                }
                logger.finest("success!");
                if ((z10 || (socketFactory2 instanceof SSLSocketFactory)) && !(socket3 instanceof SSLSocket)) {
                    String property5 = properties.getProperty(str2 + ".ssl.trust");
                    if (property5 != null) {
                        try {
                            MailSSLSocketFactory mailSSLSocketFactory = new MailSSLSocketFactory();
                            if (property5.equals("*")) {
                                mailSSLSocketFactory.setTrustAllHosts(true);
                            } else {
                                mailSSLSocketFactory.setTrustedHosts(property5.split("\\s+"));
                            }
                            r15 = mailSSLSocketFactory;
                        } catch (GeneralSecurityException e11) {
                            IOException iOException2 = new IOException("Can't create MailSSLSocketFactory");
                            iOException2.initCause(e11);
                            throw iOException2;
                        }
                    } else {
                        r15 = socketFactory2 instanceof SSLSocketFactory ? (SSLSocketFactory) socketFactory2 : (SSLSocketFactory) SSLSocketFactory.getDefault();
                    }
                    r16 = r15;
                    socketCreateSocket = r15.createSocket(socket3, r17, r12 == true ? 1 : 0, true);
                } else {
                    socketCreateSocket = socket3;
                    r16 = socketFactory2;
                }
                configureSSLSocket(socketCreateSocket, r17, properties, str2, r16);
                return socketCreateSocket;
            } catch (IOException e12) {
                e = e12;
                r13 = r17;
                r14 = r12;
            }
        } catch (IOException e13) {
            e = e13;
            r13 = str;
            r14 = i11;
        }
    }

    private static ClassLoader getContextClassLoader() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: com.sun.mail.util.SocketFetcher.1
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

    /* JADX WARN: Code duplicated, block: B:55:0x0176  */
    /* JADX WARN: Code duplicated, block: B:57:0x017a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:62:0x018c  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01be  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01c8, please report this as an issue */
    public static Socket getSocket(String str, int i10, Properties properties, String str2, boolean z10) {
        String str3;
        int i11;
        SocketFactory socketFactory;
        String str4;
        Socket socketCreateSocket;
        int i12;
        Exception e10;
        Throwable targetException;
        String str5 = str2;
        if (logger.isLoggable(Level.FINER)) {
            MailLogger mailLogger = logger;
            str3 = str;
            i11 = i10;
            StringBuilder sbM8881a = C7653h.m8881a(i11, "getSocket, host ", str3, ", port ", ", prefix ");
            sbM8881a.append(str5);
            sbM8881a.append(", useSSL ");
            sbM8881a.append(z10);
            mailLogger.finer(sbM8881a.toString());
        } else {
            str3 = str;
            i11 = i10;
        }
        if (str5 == null) {
            str5 = "socket";
        }
        String str6 = str5;
        Properties properties2 = properties == null ? new Properties() : properties;
        int intProperty = PropUtil.getIntProperty(properties2, str6.concat(".connectiontimeout"), -1);
        String property = properties2.getProperty(str6.concat(".localaddress"), null);
        InetAddress byName = property != null ? InetAddress.getByName(property) : null;
        int intProperty2 = PropUtil.getIntProperty(properties2, str6.concat(".localport"), 0);
        boolean booleanProperty = PropUtil.getBooleanProperty(properties2, str6.concat(".socketFactory.fallback"), true);
        int intProperty3 = PropUtil.getIntProperty(properties2, str6.concat(".timeout"), -1);
        String str7 = "unknown socket factory";
        if (z10) {
            try {
                try {
                    Object obj = properties2.get(str6.concat(".ssl.socketFactory"));
                    if (obj instanceof SocketFactory) {
                        socketFactory = (SocketFactory) obj;
                        str7 = "SSL socket factory instance " + socketFactory;
                    } else {
                        socketFactory = null;
                    }
                    if (socketFactory == null) {
                        String property2 = properties2.getProperty(str6.concat(".ssl.socketFactory.class"));
                        str7 = "SSL socket factory class " + property2;
                        socketFactory = getSocketFactory(property2);
                    }
                    str4 = ".ssl.socketFactory.port";
                } catch (SocketTimeoutException e11) {
                    throw e11;
                }
            } catch (Exception e12) {
                e10 = e12;
                str6 = str6;
                properties2 = properties2;
                intProperty2 = intProperty2;
                byName = byName;
                intProperty3 = intProperty3;
                intProperty = intProperty;
                i12 = -1;
                if (!booleanProperty) {
                    if (e10 instanceof InvocationTargetException) {
                        targetException = ((InvocationTargetException) e10).getTargetException();
                        if (targetException instanceof Exception) {
                            e10 = (Exception) targetException;
                        }
                    }
                    if (e10 instanceof IOException) {
                        throw ((IOException) e10);
                    }
                    throw new SocketConnectException(C1473c.m2035a("Using ", str7), e10, str, i12, intProperty);
                }
                socketCreateSocket = null;
                if (socketCreateSocket == null) {
                    return createSocket(byName, intProperty2, str, i11, intProperty, intProperty3, properties2, str6, null, z10);
                }
                if (intProperty3 < 0) {
                    return socketCreateSocket;
                }
                if (logger.isLoggable(Level.FINEST)) {
                    logger.finest("set socket read timeout " + intProperty3);
                }
                socketCreateSocket.setSoTimeout(intProperty3);
                return socketCreateSocket;
            }
        } else {
            socketFactory = null;
            str4 = null;
        }
        if (socketFactory == null) {
            Object obj2 = properties2.get(str6.concat(".socketFactory"));
            if (obj2 instanceof SocketFactory) {
                socketFactory = (SocketFactory) obj2;
                str7 = "socket factory instance " + socketFactory;
            }
            if (socketFactory == null) {
                String property3 = properties2.getProperty(str6.concat(".socketFactory.class"));
                str7 = "socket factory class " + property3;
                socketFactory = getSocketFactory(property3);
            }
            str4 = ".socketFactory.port";
        }
        String str8 = str7;
        if (socketFactory != null) {
            try {
                try {
                    int intProperty4 = PropUtil.getIntProperty(properties2, str6 + str4, -1);
                    int i13 = intProperty4 == -1 ? i11 : intProperty4;
                    str6 = str6;
                    properties2 = properties2;
                    intProperty2 = intProperty2;
                    byName = byName;
                    intProperty3 = intProperty3;
                    intProperty = intProperty;
                    try {
                        socketCreateSocket = createSocket(byName, intProperty2, str3, i13, intProperty, intProperty3, properties2, str6, socketFactory, z10);
                    } catch (Exception e13) {
                        e10 = e13;
                        str7 = str8;
                        i12 = i13;
                        if (!booleanProperty) {
                            if (e10 instanceof InvocationTargetException) {
                                targetException = ((InvocationTargetException) e10).getTargetException();
                                if (targetException instanceof Exception) {
                                    e10 = (Exception) targetException;
                                }
                            }
                            if (e10 instanceof IOException) {
                                throw ((IOException) e10);
                            }
                            throw new SocketConnectException(C1473c.m2035a("Using ", str7), e10, str, i12, intProperty);
                        }
                        socketCreateSocket = null;
                    }
                } catch (Exception e14) {
                    e10 = e14;
                    str7 = str8;
                    i12 = -1;
                    if (!booleanProperty) {
                        if (e10 instanceof InvocationTargetException) {
                            targetException = ((InvocationTargetException) e10).getTargetException();
                            if (targetException instanceof Exception) {
                                e10 = (Exception) targetException;
                            }
                        }
                        if (e10 instanceof IOException) {
                            throw ((IOException) e10);
                        }
                        throw new SocketConnectException(C1473c.m2035a("Using ", str7), e10, str, i12, intProperty);
                    }
                    socketCreateSocket = null;
                    if (socketCreateSocket == null) {
                        return createSocket(byName, intProperty2, str, i11, intProperty, intProperty3, properties2, str6, null, z10);
                    }
                    if (intProperty3 < 0) {
                        return socketCreateSocket;
                    }
                    if (logger.isLoggable(Level.FINEST)) {
                        logger.finest("set socket read timeout " + intProperty3);
                    }
                    socketCreateSocket.setSoTimeout(intProperty3);
                    return socketCreateSocket;
                }
            } catch (Exception e15) {
                e10 = e15;
            }
        } else {
            str6 = str6;
            properties2 = properties2;
            intProperty2 = intProperty2;
            byName = byName;
            intProperty3 = intProperty3;
            intProperty = intProperty;
            socketCreateSocket = null;
        }
        if (socketCreateSocket == null) {
            return createSocket(byName, intProperty2, str, i11, intProperty, intProperty3, properties2, str6, null, z10);
        }
        if (intProperty3 < 0) {
            return socketCreateSocket;
        }
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("set socket read timeout " + intProperty3);
        }
        socketCreateSocket.setSoTimeout(intProperty3);
        return socketCreateSocket;
    }

    private static SocketFactory getSocketFactory(String str) throws ClassNotFoundException {
        Class<?> cls;
        if (str == null || str.length() == 0) {
            return null;
        }
        ClassLoader contextClassLoader = getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                cls = Class.forName(str, false, contextClassLoader);
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
        } else {
            cls = null;
        }
        if (cls == null) {
            cls = Class.forName(str);
        }
        return (SocketFactory) cls.getMethod("getDefault", null).invoke(new Object(), null);
    }

    private static boolean isRecoverable(Throwable th) {
        return (th instanceof Exception) || (th instanceof LinkageError);
    }

    private static boolean matchCert(String str, X509Certificate x509Certificate) {
        MailLogger mailLogger = logger;
        Level level = Level.FINER;
        if (mailLogger.isLoggable(level)) {
            logger.finer("matchCert server " + str + ", cert " + x509Certificate);
        }
        try {
            Class<?> cls = Class.forName("sun.security.util.HostnameChecker");
            Object objInvoke = cls.getMethod("getInstance", Byte.TYPE).invoke(new Object(), (byte) 2);
            if (logger.isLoggable(level)) {
                logger.finer("using sun.security.util.HostnameChecker");
            }
            try {
                cls.getMethod("match", String.class, X509Certificate.class).invoke(objInvoke, str, x509Certificate);
                return true;
            } catch (InvocationTargetException e10) {
                logger.log(Level.FINER, "HostnameChecker FAIL", (Throwable) e10);
                return false;
            }
        } catch (Exception e11) {
            logger.log(Level.FINER, "NO sun.security.util.HostnameChecker", (Throwable) e11);
            try {
                Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                if (subjectAlternativeNames != null) {
                    boolean z10 = false;
                    for (List<?> list : subjectAlternativeNames) {
                        if (((Integer) list.get(0)).intValue() == 2) {
                            String str2 = (String) list.get(1);
                            if (logger.isLoggable(Level.FINER)) {
                                logger.finer("found name: " + str2);
                            }
                            if (matchServer(str, str2)) {
                                return true;
                            }
                            z10 = true;
                        }
                    }
                    if (z10) {
                        return false;
                    }
                }
            } catch (CertificateParsingException unused) {
            }
            Matcher matcher = Pattern.compile("CN=([^,]*)").matcher(x509Certificate.getSubjectX500Principal().getName());
            return matcher.find() && matchServer(str, matcher.group(1).trim());
        }
    }

    private static boolean matchServer(String str, String str2) {
        int length;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("match server " + str + " with " + str2);
        }
        if (!str2.startsWith("*.")) {
            return str.equalsIgnoreCase(str2);
        }
        String strSubstring = str2.substring(2);
        return strSubstring.length() != 0 && (length = str.length() - strSubstring.length()) >= 1 && str.charAt(length + (-1)) == '.' && str.regionMatches(true, length, strSubstring, 0, strSubstring.length());
    }

    private static void proxyConnect(Socket socket, String str, int i10, String str2, String str3, String str4, int i11, int i12) throws IOException {
        if (logger.isLoggable(Level.FINE)) {
            MailLogger mailLogger = logger;
            StringBuilder sbM8881a = C7653h.m8881a(i10, "connecting through proxy ", str, StringUtils.PROCESS_POSTFIX_DELIMITER, " to ");
            sbM8881a.append(str4);
            sbM8881a.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sbM8881a.append(i11);
            mailLogger.fine(sbM8881a.toString());
        }
        if (i12 >= 0) {
            socket.connect(new InetSocketAddress(str, i10), i12);
        } else {
            socket.connect(new InetSocketAddress(str, i10));
        }
        OutputStream outputStream = socket.getOutputStream();
        Charset charset = StandardCharsets.UTF_8;
        PrintStream printStream = new PrintStream(outputStream, false, charset.name());
        StringBuilder sbM8881a2 = C7653h.m8881a(i11, "CONNECT ", str4, StringUtils.PROCESS_POSTFIX_DELIMITER, " HTTP/1.1\r\nHost: ");
        sbM8881a2.append(str4);
        sbM8881a2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sbM8881a2.append(i11);
        sbM8881a2.append("\r\n");
        if (str2 != null && str3 != null) {
            String str5 = new String(BASE64EncoderStream.encode((str2 + ':' + str3).getBytes(charset)), StandardCharsets.US_ASCII);
            sbM8881a2.append("Proxy-Authorization: Basic ");
            sbM8881a2.append(str5);
            sbM8881a2.append("\r\n");
        }
        sbM8881a2.append("Proxy-Connection: keep-alive\r\n\r\n");
        printStream.print(sbM8881a2.toString());
        printStream.flush();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), charset));
        boolean z10 = true;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.length() == 0) {
                return;
            }
            logger.finest(line);
            if (z10) {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                stringTokenizer.nextToken();
                if (!stringTokenizer.nextToken().equals("200")) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                    StringBuilder sbM8881a3 = C7653h.m8881a(i10, "connection through proxy ", str, StringUtils.PROCESS_POSTFIX_DELIMITER, " to ");
                    sbM8881a3.append(str4);
                    sbM8881a3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sbM8881a3.append(i11);
                    sbM8881a3.append(" failed: ");
                    sbM8881a3.append(line);
                    ConnectException connectException = new ConnectException(sbM8881a3.toString());
                    logger.log(Level.FINE, "connect failed", (Throwable) connectException);
                    throw connectException;
                }
                z10 = false;
            }
        }
    }

    @Deprecated
    public static Socket startTLS(Socket socket) {
        return startTLS(socket, new Properties(), "socket");
    }

    private static String[] stringArray(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Deprecated
    public static Socket startTLS(Socket socket, Properties properties, String str) {
        return startTLS(socket, socket.getInetAddress().getHostName(), properties, str);
    }

    public static Socket startTLS(Socket socket, String str, Properties properties, String str2) throws IOException {
        SocketFactory socketFactory;
        String str3;
        SSLSocketFactory sSLSocketFactory;
        int port = socket.getPort();
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("startTLS host " + str + ", port " + port);
        }
        String str4 = "unknown socket factory";
        try {
            Object obj = properties.get(str2 + ".ssl.socketFactory");
            SSLSocketFactory sSLSocketFactory2 = null;
            sSLSocketFactory2 = null;
            if (obj instanceof SocketFactory) {
                socketFactory = (SocketFactory) obj;
                str4 = "SSL socket factory instance " + socketFactory;
            } else {
                socketFactory = null;
            }
            if (socketFactory == null) {
                String property = properties.getProperty(str2 + ".ssl.socketFactory.class");
                socketFactory = getSocketFactory(property);
                str4 = "SSL socket factory class " + property;
            }
            if (socketFactory != null && (socketFactory instanceof SSLSocketFactory)) {
                sSLSocketFactory2 = (SSLSocketFactory) socketFactory;
            }
            if (sSLSocketFactory2 == null) {
                Object obj2 = properties.get(str2 + ".socketFactory");
                if (obj2 instanceof SocketFactory) {
                    socketFactory = (SocketFactory) obj2;
                    str4 = "socket factory instance " + socketFactory;
                }
                if (socketFactory == null) {
                    String property2 = properties.getProperty(str2 + ".socketFactory.class");
                    socketFactory = getSocketFactory(property2);
                    str4 = "socket factory class " + property2;
                }
                if (socketFactory != null && (socketFactory instanceof SSLSocketFactory)) {
                    sSLSocketFactory2 = (SSLSocketFactory) socketFactory;
                }
            }
            SSLSocketFactory sSLSocketFactory3 = sSLSocketFactory2;
            if (sSLSocketFactory2 == null) {
                String property3 = properties.getProperty(str2 + ".ssl.trust");
                if (property3 != null) {
                    try {
                        MailSSLSocketFactory mailSSLSocketFactory = new MailSSLSocketFactory();
                        if (property3.equals("*")) {
                            mailSSLSocketFactory.setTrustAllHosts(true);
                        } else {
                            mailSSLSocketFactory.setTrustedHosts(property3.split("\\s+"));
                        }
                        str3 = "mail SSL socket factory";
                        sSLSocketFactory = mailSSLSocketFactory;
                    } catch (GeneralSecurityException e10) {
                        IOException iOException = new IOException("Can't create MailSSLSocketFactory");
                        iOException.initCause(e10);
                        throw iOException;
                    }
                } else {
                    str3 = "default SSL socket factory";
                    sSLSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                }
                sSLSocketFactory3 = sSLSocketFactory;
            }
            Socket socketCreateSocket = sSLSocketFactory3.createSocket(socket, str, port, true);
            configureSSLSocket(socketCreateSocket, str, properties, str2, sSLSocketFactory3);
            return socketCreateSocket;
        } catch (Exception e11) {
            e = e11;
            if (e instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) e).getTargetException();
                if (targetException instanceof Exception) {
                    e = (Exception) targetException;
                }
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            StringBuilder sbM14696a = C12948z6.m14696a("Exception in startTLS using ", str4, ": host, port: ", str, ", ");
            sbM14696a.append(port);
            sbM14696a.append("; Exception: ");
            sbM14696a.append(e);
            IOException iOException2 = new IOException(sbM14696a.toString());
            iOException2.initCause(e);
            throw iOException2;
        }
    }

    public static Socket getSocket(String str, int i10, Properties properties, String str2) {
        return getSocket(str, i10, properties, str2, false);
    }
}
