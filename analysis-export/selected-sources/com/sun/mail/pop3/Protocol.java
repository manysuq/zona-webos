package com.sun.mail.pop3;

import com.sun.mail.auth.Ntlm;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.MailLogger;
import com.sun.mail.util.PropUtil;
import com.sun.mail.util.SharedByteArrayOutputStream;
import com.sun.mail.util.SocketFetcher;
import com.sun.mail.util.TraceInputStream;
import com.sun.mail.util.TraceOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import kotlin.UByte;
import p002A1.C0021a;
import p020B1.C0223g;
import p183K2.C2756Y;
import p450Z.C6628k;
import p470a1.C6989a;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
class Protocol {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String CRLF = "\r\n";
    private static final int POP3_PORT = 110;
    private static final int SLOP = 128;
    private static char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private String apopChallenge;
    private String defaultAuthenticationMechanisms;
    private String host;
    private BufferedReader input;
    private String localHostName;
    private MailLogger logger;
    private boolean noauthdebug;
    private PrintWriter output;
    private boolean pipelining;
    private String prefix;
    private Properties props;
    private Socket socket;
    private TraceInputStream traceInput;
    private MailLogger traceLogger;
    private TraceOutputStream traceOutput;
    private boolean traceSuspended;
    private Map<String, String> capabilities = null;
    private Map<String, Authenticator> authenticators = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public abstract class Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean enabled;
        private final String mech;
        protected Response resp;

        public Authenticator(Protocol protocol, String str) {
            this(str, true);
        }

        public boolean authenticate(String str, String str2, String str3, String str4) throws EOFException {
            String str5 = "failed";
            try {
                try {
                    String initialResponse = getInitialResponse(str, str2, str3, str4);
                    if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                        Protocol.this.logger.fine("AUTH " + this.mech + " command trace suppressed");
                        Protocol.this.suspendTracing();
                    }
                    runAuthenticationCommand("AUTH " + this.mech, initialResponse);
                    if (this.resp.cont) {
                        doAuth(str, str2, str3, str4);
                    }
                    if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                        MailLogger mailLogger = Protocol.this.logger;
                        StringBuilder sb2 = new StringBuilder("AUTH ");
                        sb2.append(this.mech);
                        sb2.append(" ");
                        sb2.append(this.resp.f31279ok ? "succeeded" : "failed");
                        mailLogger.fine(sb2.toString());
                    }
                    Protocol.this.resumeTracing();
                    if (this.resp.f31279ok) {
                        return true;
                    }
                    Protocol.this.close();
                    String str6 = this.resp.data;
                    throw new EOFException(str6 != null ? str6 : "authentication failed");
                } catch (Throwable th) {
                    if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                        MailLogger mailLogger2 = Protocol.this.logger;
                        StringBuilder sb3 = new StringBuilder("AUTH ");
                        sb3.append(this.mech);
                        sb3.append(" ");
                        if (this.resp.f31279ok) {
                            str5 = "succeeded";
                        }
                        sb3.append(str5);
                        mailLogger2.fine(sb3.toString());
                    }
                    Protocol.this.resumeTracing();
                    if (this.resp.f31279ok) {
                        throw th;
                    }
                    Protocol.this.close();
                    String str7 = this.resp.data;
                    throw new EOFException(str7 != null ? str7 : "authentication failed");
                }
            } catch (IOException e10) {
                Protocol.this.logger.log(Level.FINE, "AUTH " + this.mech + " failed", (Throwable) e10);
                if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                    MailLogger mailLogger3 = Protocol.this.logger;
                    StringBuilder sb4 = new StringBuilder("AUTH ");
                    sb4.append(this.mech);
                    sb4.append(" ");
                    str5 = this.resp.f31279ok ? "succeeded" : "failed";
                    sb4.append(str5);
                    mailLogger3.fine(sb4.toString());
                }
                Protocol.this.resumeTracing();
                if (!this.resp.f31279ok) {
                    Protocol.this.close();
                    String str8 = this.resp.data;
                    throw new EOFException(str8 != null ? str8 : "authentication failed");
                }
                return true;
            } catch (Throwable th2) {
                Protocol.this.logger.log(Level.FINE, "AUTH " + this.mech + " failed", (Throwable) th2);
                if (Protocol.this.noauthdebug && Protocol.this.isTracing()) {
                    MailLogger mailLogger4 = Protocol.this.logger;
                    StringBuilder sb5 = new StringBuilder("AUTH ");
                    sb5.append(this.mech);
                    sb5.append(" ");
                    str5 = this.resp.f31279ok ? "succeeded" : "failed";
                    sb5.append(str5);
                    mailLogger4.fine(sb5.toString());
                }
                Protocol.this.resumeTracing();
                if (!this.resp.f31279ok) {
                    Protocol.this.close();
                    if (th2 instanceof Error) {
                        throw th2;
                    }
                    if (!(th2 instanceof Exception)) {
                        String str9 = this.resp.data;
                        throw new EOFException(str9 != null ? str9 : "authentication failed");
                    }
                    String str10 = this.resp.data;
                    EOFException eOFException = new EOFException(str10 != null ? str10 : "authentication failed");
                    eOFException.initCause(th2);
                    throw eOFException;
                }
                return true;
            }
        }

        public abstract void doAuth(String str, String str2, String str3, String str4);

        public boolean enabled() {
            return this.enabled;
        }

        public String getInitialResponse(String str, String str2, String str3, String str4) {
            return null;
        }

        public String getMechanism() {
            return this.mech;
        }

        public void runAuthenticationCommand(String str, String str2) {
            if (Protocol.this.logger.isLoggable(Level.FINE)) {
                Protocol.this.logger.fine(str + " using one line authentication format");
            }
            if (str2 == null) {
                this.resp = Protocol.this.simpleCommand(str);
                return;
            }
            Protocol protocol = Protocol.this;
            StringBuilder sbM351a = C0223g.m351a(str, " ");
            if (str2.length() == 0) {
                str2 = "=";
            }
            sbM351a.append(str2);
            this.resp = protocol.simpleCommand(sbM351a.toString());
        }

        public Authenticator(String str, boolean z10) {
            this.mech = str.toUpperCase(Locale.ENGLISH);
            this.enabled = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class LoginAuthenticator extends Authenticator {
        public LoginAuthenticator() {
            super(Protocol.this, "LOGIN");
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public boolean authenticate(String str, String str2, String str3, String str4) throws EOFException {
            String strLogin = Protocol.this.login(str3, str4);
            if (strLogin == null) {
                return true;
            }
            throw new EOFException(strLogin);
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws EOFException {
            throw new EOFException("LOGIN asked for more");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class NtlmAuthenticator extends Authenticator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Ntlm ntlm;

        public NtlmAuthenticator() {
            super(Protocol.this, "NTLM");
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) {
            this.resp = Protocol.this.simpleCommand(this.ntlm.generateType3Msg(this.resp.data.substring(4).trim()));
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) {
            this.ntlm = new Ntlm(Protocol.this.props.getProperty(Protocol.this.prefix + ".auth.ntlm.domain"), Protocol.this.getLocalHost(), str3, str4, Protocol.this.logger);
            return this.ntlm.generateType1Msg(PropUtil.getIntProperty(Protocol.this.props, Protocol.this.prefix + ".auth.ntlm.flags", 0), PropUtil.getBooleanProperty(Protocol.this.props, Protocol.this.prefix + ".auth.ntlm.v2", true));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class OAuth2Authenticator extends Authenticator {
        public OAuth2Authenticator() {
            super("XOAUTH2", false);
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws EOFException {
            String str5;
            String str6 = this.resp.data;
            if (str6 != null) {
                Charset charset = StandardCharsets.UTF_8;
                str5 = new String(BASE64DecoderStream.decode(str6.getBytes(charset)), charset);
            } else {
                str5 = "";
            }
            throw new EOFException("OAUTH2 authentication failed: ".concat(str5));
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) {
            return ASCIIUtility.toString(BASE64EncoderStream.encode(C2756Y.m3477a("user=", str3, "\u0001auth=Bearer ", str4, "\u0001\u0001").getBytes(StandardCharsets.UTF_8)));
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void runAuthenticationCommand(String str, String str2) {
            Protocol protocol = Protocol.this;
            if (!protocol.getBoolProp(protocol.props, C6989a.m7848b(Protocol.this.prefix, ".auth.xoauth2.two.line.authentication.format", new StringBuilder()))) {
                super.runAuthenticationCommand(str, str2);
                return;
            }
            if (Protocol.this.logger.isLoggable(Level.FINE)) {
                Protocol.this.logger.fine(str + " using two line authentication format");
            }
            Protocol protocol2 = Protocol.this;
            if (str2.length() == 0) {
                str2 = "=";
            }
            this.resp = protocol2.twoLinesCommand(str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class PlainAuthenticator extends Authenticator {
        public PlainAuthenticator() {
            super(Protocol.this, "PLAIN");
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public void doAuth(String str, String str2, String str3, String str4) throws EOFException {
            throw new EOFException("PLAIN asked for more");
        }

        @Override // com.sun.mail.pop3.Protocol.Authenticator
        public String getInitialResponse(String str, String str2, String str3, String str4) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
            if (str2 != null) {
                bASE64EncoderStream.write(str2.getBytes(StandardCharsets.UTF_8));
            }
            bASE64EncoderStream.write(0);
            Charset charset = StandardCharsets.UTF_8;
            bASE64EncoderStream.write(str3.getBytes(charset));
            bASE64EncoderStream.write(0);
            bASE64EncoderStream.write(str4.getBytes(charset));
            bASE64EncoderStream.flush();
            return ASCIIUtility.toString(byteArrayOutputStream.toByteArray());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d6  */
    public Protocol(String str, int i10, MailLogger mailLogger, Properties properties, String str2, boolean z10) throws IOException {
        boolean z11;
        String str3;
        this.apopChallenge = null;
        this.noauthdebug = true;
        this.host = str;
        this.props = properties;
        this.prefix = str2;
        this.logger = mailLogger;
        this.traceLogger = mailLogger.getSubLogger("protocol", null);
        this.noauthdebug = !PropUtil.getBooleanProperty(properties, "mail.debug.auth", false);
        boolean boolProp = getBoolProp(properties, C6628k.m7436a(str2, ".apop.enable"));
        boolean boolProp2 = getBoolProp(properties, C6628k.m7436a(str2, ".disablecapa"));
        i10 = i10 == -1 ? 110 : i10;
        try {
            Level level = Level.FINE;
            if (mailLogger.isLoggable(level)) {
                mailLogger.fine("connecting to host \"" + str + "\", port " + i10 + ", isSSL " + z10);
            }
            this.socket = SocketFetcher.getSocket(str, i10, properties, str2, z10);
            initStreams();
            Response responseSimpleCommand = simpleCommand(null);
            if (!responseSimpleCommand.f31279ok) {
                throw cleanupAndThrow(this.socket, new IOException("Connect failed"));
            }
            if (boolProp && (str3 = responseSimpleCommand.data) != null) {
                int iIndexOf = str3.indexOf(60);
                int iIndexOf2 = responseSimpleCommand.data.indexOf(62, iIndexOf);
                if (iIndexOf != -1 && iIndexOf2 != -1) {
                    this.apopChallenge = responseSimpleCommand.data.substring(iIndexOf, iIndexOf2 + 1);
                }
                mailLogger.log(level, "APOP challenge: {0}", this.apopChallenge);
            }
            if (!boolProp2) {
                setCapabilities(capa());
            }
            if (hasCapability("PIPELINING")) {
                z11 = true;
            } else {
                if (PropUtil.getBooleanProperty(properties, str2 + ".pipelining", false)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.pipelining = z11;
            if (z11) {
                mailLogger.config("PIPELINING enabled");
            }
            Authenticator[] authenticatorArr = {new LoginAuthenticator(), new PlainAuthenticator(), new NtlmAuthenticator(), new OAuth2Authenticator()};
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 4; i11++) {
                this.authenticators.put(authenticatorArr[i11].getMechanism(), authenticatorArr[i11]);
                sb2.append(authenticatorArr[i11].getMechanism());
                sb2.append(' ');
            }
            this.defaultAuthenticationMechanisms = sb2.toString();
        } catch (IOException e10) {
            throw cleanupAndThrow(this.socket, e10);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean getBoolProp(Properties properties, String str) {
        boolean booleanProperty;
        booleanProperty = PropUtil.getBooleanProperty(properties, str, false);
        if (this.logger.isLoggable(Level.CONFIG)) {
            this.logger.config(str + ": " + booleanProperty);
        }
        return booleanProperty;
    }

    private String getDigest(String str) {
        try {
            return toHex(MessageDigest.getInstance("MD5").digest(C6989a.m7848b(this.apopChallenge, str, new StringBuilder()).getBytes("iso-8859-1")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String getLocalHost() {
        Socket socket;
        try {
            try {
                String str = this.localHostName;
                if (str == null || str.length() == 0) {
                    InetAddress localHost = InetAddress.getLocalHost();
                    String canonicalHostName = localHost.getCanonicalHostName();
                    this.localHostName = canonicalHostName;
                    if (canonicalHostName == null) {
                        this.localHostName = "[" + localHost.getHostAddress() + "]";
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (UnknownHostException unused) {
        }
        String str2 = this.localHostName;
        if ((str2 == null || str2.length() <= 0) && (socket = this.socket) != null && socket.isBound()) {
            InetAddress localAddress = this.socket.getLocalAddress();
            String canonicalHostName2 = localAddress.getCanonicalHostName();
            this.localHostName = canonicalHostName2;
            if (canonicalHostName2 == null) {
                this.localHostName = "[" + localAddress.getHostAddress() + "]";
            }
        }
        return this.localHostName;
    }

    private void initStreams() {
        boolean booleanProperty = PropUtil.getBooleanProperty(this.props, "mail.debug.quote", false);
        TraceInputStream traceInputStream = new TraceInputStream(this.socket.getInputStream(), this.traceLogger);
        this.traceInput = traceInputStream;
        traceInputStream.setQuote(booleanProperty);
        TraceOutputStream traceOutputStream = new TraceOutputStream(this.socket.getOutputStream(), this.traceLogger);
        this.traceOutput = traceOutputStream;
        traceOutputStream.setQuote(booleanProperty);
        this.input = new BufferedReader(new InputStreamReader(this.traceInput, "iso-8859-1"));
        this.output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.traceOutput, "iso-8859-1")));
    }

    private static boolean isRecoverable(Throwable th) {
        return (th instanceof Exception) || (th instanceof LinkageError);
    }

    private void issueCommand(String str) throws IOException {
        if (this.socket == null) {
            throw new IOException("Folder is closed");
        }
        if (str != null) {
            this.output.print(str.concat(CRLF));
            this.output.flush();
        }
    }

    private Response multilineCommand(String str, int i10) throws IOException {
        multilineCommandStart(str);
        issueCommand(str);
        Response response = readResponse();
        if (!response.f31279ok) {
            multilineCommandEnd();
            return response;
        }
        response.bytes = readMultilineResponse(i10);
        multilineCommandEnd();
        return response;
    }

    private InputStream readMultilineResponse(int i10) throws IOException {
        int i11;
        SharedByteArrayOutputStream sharedByteArrayOutputStream = new SharedByteArrayOutputStream(i10);
        int i12 = 10;
        while (true) {
            try {
                i11 = this.input.read();
                if (i11 < 0) {
                    break;
                }
                if (i12 == 10 && i11 == 46) {
                    i12 = this.input.read();
                    if (i12 == 13) {
                        i11 = this.input.read();
                        break;
                    }
                } else {
                    i12 = i11;
                }
                sharedByteArrayOutputStream.write(i12);
            } catch (InterruptedIOException e10) {
                try {
                    this.socket.close();
                } catch (IOException unused) {
                }
                throw e10;
            }
        }
        if (i11 >= 0) {
            return sharedByteArrayOutputStream.toStream();
        }
        throw new EOFException("EOF on socket");
    }

    private Response readResponse() throws IOException {
        try {
            String line = this.input.readLine();
            if (line == null) {
                this.traceLogger.finest("<EOF>");
                throw new EOFException("EOF on socket");
            }
            Response response = new Response();
            if (line.startsWith("+OK")) {
                response.f31279ok = true;
            } else if (line.startsWith("+ ")) {
                response.f31279ok = true;
                response.cont = true;
            } else {
                if (!line.startsWith("-ERR")) {
                    throw new IOException("Unexpected response: ".concat(line));
                }
                response.f31279ok = false;
            }
            int iIndexOf = line.indexOf(32);
            if (iIndexOf >= 0) {
                response.data = line.substring(iIndexOf + 1);
            }
            return response;
        } catch (InterruptedIOException e10) {
            try {
                this.socket.close();
            } catch (IOException unused) {
            }
            throw new EOFException(e10.getMessage());
        } catch (SocketException e11) {
            try {
                this.socket.close();
            } catch (IOException unused2) {
            }
            throw new EOFException(e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(true);
            this.traceOutput.setTrace(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response simpleCommand(String str) throws IOException {
        simpleCommandStart(str);
        issueCommand(str);
        Response response = readResponse();
        simpleCommandEnd();
        return response;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void suspendTracing() {
        if (this.traceLogger.isLoggable(Level.FINEST)) {
            this.traceInput.setTrace(false);
            this.traceOutput.setTrace(false);
        }
    }

    private static String toHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & UByte.MAX_VALUE;
            int i12 = i10 + 1;
            char[] cArr2 = digits;
            cArr[i10] = cArr2[i11 >> 4];
            i10 += 2;
            cArr[i12] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response twoLinesCommand(String str, String str2) throws IOException {
        String strM43a = C0021a.m43a(str, " ", str2);
        batchCommandStart(strM43a);
        simpleCommand(str);
        batchCommandContinue(strM43a);
        Response responseSimpleCommand = simpleCommand(str2);
        batchCommandEnd();
        return responseSimpleCommand;
    }

    public synchronized String authenticate(String str, String str2, String str3, String str4, String str5) {
        Authenticator authenticator = this.authenticators.get(str.toUpperCase(Locale.ENGLISH));
        if (authenticator == null) {
            return "No such authentication mechanism: ".concat(str);
        }
        try {
            if (authenticator.authenticate(str2, str3, str4, str5)) {
                return null;
            }
            return "login failed";
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    public synchronized InputStream capa() {
        Response responseMultilineCommand = multilineCommand("CAPA", 128);
        if (!responseMultilineCommand.f31279ok) {
            return null;
        }
        return responseMultilineCommand.bytes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void close() {
        try {
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException unused) {
        } finally {
            this.socket = null;
            this.input = null;
            this.output = null;
        }
    }

    public synchronized boolean dele(int i10) {
        return simpleCommand("DELE " + i10).f31279ok;
    }

    public void finalize() throws Throwable {
        try {
            if (this.socket != null) {
                quit();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized Map<String, String> getCapabilities() {
        return this.capabilities;
    }

    public String getDefaultMechanisms() {
        return this.defaultAuthenticationMechanisms;
    }

    public synchronized boolean hasCapability(String str) {
        Map<String, String> map;
        map = this.capabilities;
        return map != null && map.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    public boolean isMechanismEnabled(String str) {
        Authenticator authenticator = this.authenticators.get(str.toUpperCase(Locale.ENGLISH));
        return authenticator != null && authenticator.enabled();
    }

    public synchronized boolean isSSL() {
        return this.socket instanceof SSLSocket;
    }

    public boolean isTracing() {
        return this.traceLogger.isLoggable(Level.FINEST);
    }

    public synchronized int list(int i10) {
        int i11;
        Response responseSimpleCommand = simpleCommand("LIST " + i10);
        if (!responseSimpleCommand.f31279ok || responseSimpleCommand.data == null) {
            i11 = -1;
        } else {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(responseSimpleCommand.data);
                stringTokenizer.nextToken();
                i11 = Integer.parseInt(stringTokenizer.nextToken());
            } catch (RuntimeException unused) {
                i11 = -1;
            }
        }
        return i11;
    }

    public synchronized String login(String str, String str2) {
        Response responseSimpleCommand;
        boolean z10 = this.pipelining && (this.socket instanceof SSLSocket);
        try {
            if (this.noauthdebug && isTracing()) {
                this.logger.fine("authentication command trace suppressed");
                suspendTracing();
            }
            String digest = this.apopChallenge != null ? getDigest(str2) : null;
            if (this.apopChallenge != null && digest != null) {
                responseSimpleCommand = simpleCommand("APOP " + str + " " + digest);
            } else if (z10) {
                String str3 = "USER " + str;
                batchCommandStart(str3);
                issueCommand(str3);
                String str4 = "PASS " + str2;
                batchCommandContinue(str4);
                issueCommand(str4);
                Response response = readResponse();
                if (!response.f31279ok) {
                    String str5 = response.data;
                    if (str5 == null) {
                        str5 = "USER command failed";
                    }
                    readResponse();
                    batchCommandEnd();
                    resumeTracing();
                    return str5;
                }
                responseSimpleCommand = readResponse();
                batchCommandEnd();
            } else {
                Response responseSimpleCommand2 = simpleCommand("USER " + str);
                if (!responseSimpleCommand2.f31279ok) {
                    String str6 = responseSimpleCommand2.data;
                    if (str6 == null) {
                        str6 = "USER command failed";
                    }
                    resumeTracing();
                    return str6;
                }
                responseSimpleCommand = simpleCommand("PASS " + str2);
            }
            if (this.noauthdebug && isTracing()) {
                this.logger.log(Level.FINE, "authentication command {0}", responseSimpleCommand.f31279ok ? "succeeded" : "failed");
            }
            if (responseSimpleCommand.f31279ok) {
                resumeTracing();
                return null;
            }
            String str7 = responseSimpleCommand.data;
            if (str7 == null) {
                str7 = "login failed";
            }
            resumeTracing();
            return str7;
        } catch (Throwable th) {
            resumeTracing();
            throw th;
        }
    }

    public synchronized boolean noop() {
        return simpleCommand("NOOP").f31279ok;
    }

    public synchronized boolean quit() {
        boolean z10;
        try {
            z10 = simpleCommand("QUIT").f31279ok;
            close();
        } catch (Throwable th) {
            close();
            throw th;
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x0042, B:12:0x0046, B:16:0x005d, B:18:0x0067, B:24:0x0080, B:26:0x0088, B:27:0x0090, B:49:0x0102, B:52:0x0108, B:54:0x0112, B:55:0x0129, B:28:0x0094, B:30:0x00ae, B:35:0x00b6, B:37:0x00ba, B:39:0x00d1, B:43:0x00da, B:45:0x00e4, B:48:0x00f9), top: B:62:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x0042, B:12:0x0046, B:16:0x005d, B:18:0x0067, B:24:0x0080, B:26:0x0088, B:27:0x0090, B:49:0x0102, B:52:0x0108, B:54:0x0112, B:55:0x0129, B:28:0x0094, B:30:0x00ae, B:35:0x00b6, B:37:0x00ba, B:39:0x00d1, B:43:0x00da, B:45:0x00e4, B:48:0x00f9), top: B:62:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[Catch: all -> 0x0079, RuntimeException -> 0x00f9, TryCatch #0 {, blocks: (B:6:0x0012, B:8:0x0016, B:10:0x0042, B:12:0x0046, B:16:0x005d, B:18:0x0067, B:24:0x0080, B:26:0x0088, B:27:0x0090, B:49:0x0102, B:52:0x0108, B:54:0x0112, B:55:0x0129, B:28:0x0094, B:30:0x00ae, B:35:0x00b6, B:37:0x00ba, B:39:0x00d1, B:43:0x00da, B:45:0x00e4, B:48:0x00f9), top: B:62:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0094, please report this as an issue */
    public synchronized InputStream retr(int i10, int i11) {
        Response response;
        StringTokenizer stringTokenizer;
        String strNextToken;
        if (i11 != 0) {
            String str = "RETR " + i10;
            multilineCommandStart(str);
            issueCommand(str);
            response = readResponse();
            if (!response.f31279ok) {
                multilineCommandEnd();
                return null;
            }
            if (i11 <= 0) {
                stringTokenizer = new StringTokenizer(response.data);
                strNextToken = stringTokenizer.nextToken();
                if (stringTokenizer.nextToken().equals("octets")) {
                    i11 = Integer.parseInt(strNextToken);
                    if (i11 <= 1073741824) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                    }
                }
            }
            response.bytes = readMultilineResponse(i11);
            multilineCommandEnd();
        } else if (this.pipelining) {
            String str2 = "LIST " + i10;
            batchCommandStart(str2);
            issueCommand(str2);
            String str3 = "RETR " + i10;
            batchCommandContinue(str3);
            issueCommand(str3);
            Response response2 = readResponse();
            if (response2.f31279ok && response2.data != null) {
                try {
                    StringTokenizer stringTokenizer2 = new StringTokenizer(response2.data);
                    stringTokenizer2.nextToken();
                    i11 = Integer.parseInt(stringTokenizer2.nextToken());
                    if (i11 > 1073741824 || i11 < 0) {
                        i11 = 0;
                    } else {
                        if (this.logger.isLoggable(Level.FINE)) {
                            this.logger.fine("pipeline message size " + i11);
                        }
                        i11 += 128;
                    }
                } catch (RuntimeException unused) {
                }
            }
            response = readResponse();
            if (response.f31279ok) {
                response.bytes = readMultilineResponse(i11 + 128);
            }
            batchCommandEnd();
        } else {
            String str4 = "RETR " + i10;
            multilineCommandStart(str4);
            issueCommand(str4);
            response = readResponse();
            if (!response.f31279ok) {
                multilineCommandEnd();
                return null;
            }
            if (i11 <= 0 && response.data != null) {
                try {
                    stringTokenizer = new StringTokenizer(response.data);
                    strNextToken = stringTokenizer.nextToken();
                    if (stringTokenizer.nextToken().equals("octets")) {
                        i11 = Integer.parseInt(strNextToken);
                        if (i11 <= 1073741824 || i11 < 0) {
                            i11 = 0;
                        } else {
                            if (this.logger.isLoggable(Level.FINE)) {
                                this.logger.fine("guessing message size: " + i11);
                            }
                            i11 += 128;
                        }
                    }
                } catch (RuntimeException unused2) {
                }
            }
            response.bytes = readMultilineResponse(i11);
            multilineCommandEnd();
        }
        if (response.f31279ok && i11 > 0 && this.logger.isLoggable(Level.FINE)) {
            this.logger.fine("got message size " + response.bytes.available());
        }
        return response.bytes;
    }

    public synchronized boolean rset() {
        return simpleCommand("RSET").f31279ok;
    }

    public synchronized void setCapabilities(InputStream inputStream) {
        BufferedReader bufferedReader = null;
        if (inputStream == null) {
            this.capabilities = null;
            return;
        }
        this.capabilities = new HashMap(10);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "us-ascii"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    int iIndexOf = line.indexOf(32);
                    this.capabilities.put((iIndexOf > 0 ? line.substring(0, iIndexOf) : line).toUpperCase(Locale.ENGLISH), line);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
        } catch (UnsupportedEncodingException unused3) {
        }
        inputStream.close();
        try {
            inputStream.close();
        } catch (IOException unused4) {
        }
    }

    public synchronized Status stat() {
        Status status;
        Response responseSimpleCommand = simpleCommand("STAT");
        status = new Status();
        if (!responseSimpleCommand.f31279ok) {
            throw new IOException("STAT command failed: " + responseSimpleCommand.data);
        }
        if (responseSimpleCommand.data != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(responseSimpleCommand.data);
                status.total = Integer.parseInt(stringTokenizer.nextToken());
                status.size = Integer.parseInt(stringTokenizer.nextToken());
            } catch (RuntimeException unused) {
            }
        }
        return status;
    }

    public synchronized boolean stls() {
        if (this.socket instanceof SSLSocket) {
            return true;
        }
        Response responseSimpleCommand = simpleCommand("STLS");
        if (responseSimpleCommand.f31279ok) {
            try {
                this.socket = SocketFetcher.startTLS(this.socket, this.host, this.props, this.prefix);
                initStreams();
            } catch (IOException e10) {
                try {
                    this.socket.close();
                    this.socket = null;
                    this.input = null;
                    this.output = null;
                    IOException iOException = new IOException("Could not convert socket to TLS");
                    iOException.initCause(e10);
                    throw iOException;
                } catch (Throwable th) {
                    this.socket = null;
                    this.input = null;
                    this.output = null;
                    throw th;
                }
            }
        }
        return responseSimpleCommand.f31279ok;
    }

    public synchronized boolean supportsAuthentication(String str) {
        if (str.equals("LOGIN")) {
            return true;
        }
        Map<String, String> map = this.capabilities;
        if (map == null) {
            return false;
        }
        String str2 = map.get("SASL");
        if (str2 == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str2);
        while (stringTokenizer.hasMoreTokens()) {
            if (stringTokenizer.nextToken().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean supportsMechanism(String str) {
        return this.authenticators.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    public synchronized InputStream top(int i10, int i11) {
        return multilineCommand("TOP " + i10 + " " + i11, 0).bytes;
    }

    public synchronized String uidl(int i10) {
        Response responseSimpleCommand = simpleCommand("UIDL " + i10);
        if (!responseSimpleCommand.f31279ok) {
            return null;
        }
        int iIndexOf = responseSimpleCommand.data.indexOf(32);
        if (iIndexOf <= 0) {
            return null;
        }
        return responseSimpleCommand.data.substring(iIndexOf + 1);
    }

    public synchronized InputStream list() {
        return multilineCommand("LIST", 128).bytes;
    }

    public synchronized boolean uidl(String[] strArr) {
        int i10;
        Response responseMultilineCommand = multilineCommand("UIDL", strArr.length * 15);
        if (!responseMultilineCommand.f31279ok) {
            return false;
        }
        LineInputStream lineInputStream = new LineInputStream(responseMultilineCommand.bytes);
        while (true) {
            String line = lineInputStream.readLine();
            if (line != null) {
                int iIndexOf = line.indexOf(32);
                if (iIndexOf >= 1 && iIndexOf < line.length() && (i10 = Integer.parseInt(line.substring(0, iIndexOf))) > 0 && i10 <= strArr.length) {
                    strArr[i10 - 1] = line.substring(iIndexOf + 1);
                }
            } else {
                try {
                    break;
                } catch (IOException unused) {
                }
            }
        }
        responseMultilineCommand.bytes.close();
        return true;
    }

    private void batchCommandEnd() {
    }

    private void multilineCommandEnd() {
    }

    private void simpleCommandEnd() {
    }

    private void batchCommandContinue(String str) {
    }

    private void batchCommandStart(String str) {
    }

    private void multilineCommandStart(String str) {
    }

    private void simpleCommandStart(String str) {
    }

    public synchronized boolean retr(int i10, OutputStream outputStream) {
        int i11;
        String str = "RETR " + i10;
        multilineCommandStart(str);
        issueCommand(str);
        if (!readResponse().f31279ok) {
            multilineCommandEnd();
            return false;
        }
        Throwable e10 = null;
        int i12 = 10;
        while (true) {
            try {
                i11 = this.input.read();
                if (i11 < 0) {
                    break;
                }
                if (i12 == 10 && i11 == 46) {
                    i12 = this.input.read();
                    if (i12 == 13) {
                        i11 = this.input.read();
                        break;
                    }
                } else {
                    i12 = i11;
                }
                if (e10 == null) {
                    try {
                        outputStream.write(i12);
                    } catch (IOException e11) {
                        e10 = e11;
                        this.logger.log(Level.FINE, "exception while streaming", e10);
                    } catch (RuntimeException e12) {
                        e10 = e12;
                        this.logger.log(Level.FINE, "exception while streaming", e10);
                    }
                }
            } catch (InterruptedIOException e13) {
                try {
                    this.socket.close();
                } catch (IOException unused) {
                }
                throw e13;
            }
        }
        if (i11 >= 0) {
            if (e10 != null) {
                if (!(e10 instanceof IOException)) {
                    if (e10 instanceof RuntimeException) {
                        throw ((RuntimeException) e10);
                    }
                } else {
                    throw ((IOException) e10);
                }
            }
            multilineCommandEnd();
            return true;
        }
        throw new EOFException("EOF on socket");
    }
}
