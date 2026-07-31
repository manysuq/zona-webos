package com.sun.mail.smtp;

import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.MailLogger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import kotlin.UByte;
import p092F1.C1473c;
import p470a1.C6989a;
import p488b4.C8034N;
import p622j.C15292t;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class DigestMD5 {
    private static char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private String clientResponse;
    private MailLogger logger;
    private MessageDigest md5;
    private String uri;

    public DigestMD5(MailLogger mailLogger) {
        this.logger = mailLogger.getLogger(getClass(), "DEBUG DIGEST-MD5");
        mailLogger.config("DIGEST-MD5 Loaded");
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

    private Map<String, String> tokenize(String str) throws IOException {
        HashMap map = new HashMap();
        byte[] bytes = str.getBytes("iso-8859-1");
        StreamTokenizer streamTokenizer = new StreamTokenizer(new InputStreamReader(new BASE64DecoderStream(new ByteArrayInputStream(bytes, 4, bytes.length - 4)), "iso-8859-1"));
        streamTokenizer.ordinaryChars(48, 57);
        streamTokenizer.wordChars(48, 57);
        while (true) {
            String str2 = null;
            while (true) {
                int iNextToken = streamTokenizer.nextToken();
                if (iNextToken == -1) {
                    return map;
                }
                if (iNextToken == -3) {
                    if (str2 != null) {
                        break;
                    }
                    str2 = streamTokenizer.sval;
                } else if (iNextToken == 34) {
                    break;
                }
            }
            if (this.logger.isLoggable(Level.FINE)) {
                MailLogger mailLogger = this.logger;
                StringBuilder sbM18009a = C15292t.m18009a("Received => ", str2, "='");
                sbM18009a.append(streamTokenizer.sval);
                sbM18009a.append("'");
                mailLogger.fine(sbM18009a.toString());
            }
            if (map.containsKey(str2)) {
                map.put(str2, ((String) map.get(str2)) + StringUtils.COMMA + streamTokenizer.sval);
            } else {
                map.put(str2, streamTokenizer.sval);
            }
        }
    }

    public byte[] authClient(String str, String str2, String str3, String str4, String str5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
        try {
            SecureRandom secureRandom = new SecureRandom();
            this.md5 = MessageDigest.getInstance("MD5");
            StringBuilder sb2 = new StringBuilder();
            this.uri = C1473c.m2035a("smtp/", str);
            byte[] bArr = new byte[32];
            this.logger.fine("Begin authentication ...");
            Map<String, String> map = tokenize(str5);
            if (str4 == null) {
                String str6 = map.get("realm");
                if (str6 != null) {
                    str = new StringTokenizer(str6, StringUtils.COMMA).nextToken();
                }
                str4 = str;
            }
            String str7 = map.get("nonce");
            String str8 = map.get("charset");
            boolean z10 = str8 != null && str8.equalsIgnoreCase("utf-8");
            secureRandom.nextBytes(bArr);
            bASE64EncoderStream.write(bArr);
            bASE64EncoderStream.flush();
            String string = byteArrayOutputStream.toString("iso-8859-1");
            byteArrayOutputStream.reset();
            if (z10) {
                String str9 = str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + str4 + StringUtils.PROCESS_POSTFIX_DELIMITER + str3;
                MessageDigest messageDigest = this.md5;
                messageDigest.update(messageDigest.digest(str9.getBytes(StandardCharsets.UTF_8)));
            } else {
                MessageDigest messageDigest2 = this.md5;
                messageDigest2.update(messageDigest2.digest(ASCIIUtility.getBytes(str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + str4 + StringUtils.PROCESS_POSTFIX_DELIMITER + str3)));
            }
            this.md5.update(ASCIIUtility.getBytes(StringUtils.PROCESS_POSTFIX_DELIMITER + str7 + StringUtils.PROCESS_POSTFIX_DELIMITER + string));
            StringBuilder sb3 = new StringBuilder();
            C8034N.m10004a(sb3, toHex(this.md5.digest()), StringUtils.PROCESS_POSTFIX_DELIMITER, str7, ":00000001:");
            this.clientResponse = C6989a.m7848b(string, ":auth:", sb3);
            this.md5.update(ASCIIUtility.getBytes("AUTHENTICATE:" + this.uri));
            this.md5.update(ASCIIUtility.getBytes(this.clientResponse + toHex(this.md5.digest())));
            sb2.append("username=\"" + str2 + "\"");
            sb2.append(",realm=\"" + str4 + "\"");
            sb2.append(",qop=auth,nc=00000001");
            sb2.append(",nonce=\"" + str7 + "\"");
            sb2.append(",cnonce=\"" + string + "\"");
            sb2.append(",digest-uri=\"" + this.uri + "\"");
            if (z10) {
                sb2.append(",charset=\"utf-8\"");
            }
            sb2.append(",response=" + toHex(this.md5.digest()));
            if (this.logger.isLoggable(Level.FINE)) {
                this.logger.fine("Response => " + sb2.toString());
            }
            bASE64EncoderStream.write(ASCIIUtility.getBytes(sb2.toString()));
            bASE64EncoderStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (NoSuchAlgorithmException e10) {
            this.logger.log(Level.FINE, "NoSuchAlgorithmException", (Throwable) e10);
            throw new IOException(e10.toString());
        }
    }

    public boolean authServer(String str) throws IOException {
        Map<String, String> map = tokenize(str);
        this.md5.update(ASCIIUtility.getBytes(StringUtils.PROCESS_POSTFIX_DELIMITER + this.uri));
        this.md5.update(ASCIIUtility.getBytes(this.clientResponse + toHex(this.md5.digest())));
        String hex = toHex(this.md5.digest());
        if (hex.equals(map.get("rspauth"))) {
            return true;
        }
        if (!this.logger.isLoggable(Level.FINE)) {
            return false;
        }
        this.logger.fine("Expected => rspauth=".concat(hex));
        return false;
    }
}
