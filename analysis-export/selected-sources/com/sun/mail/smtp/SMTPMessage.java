package com.sun.mail.smtp;

import java.io.InputStream;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class SMTPMessage extends MimeMessage {
    public static final int NOTIFY_DELAY = 4;
    public static final int NOTIFY_FAILURE = 2;
    public static final int NOTIFY_NEVER = -1;
    public static final int NOTIFY_SUCCESS = 1;
    public static final int RETURN_FULL = 1;
    public static final int RETURN_HDRS = 2;
    private static final String[] returnOptionString = {null, "FULL", "HDRS"};
    private boolean allow8bitMIME;
    private String envelopeFrom;
    private String extension;
    private int notifyOptions;
    private int returnOption;
    private boolean sendPartial;
    private String submitter;

    public SMTPMessage(Session session) {
        super(session);
        this.notifyOptions = 0;
        this.returnOption = 0;
        this.sendPartial = false;
        this.allow8bitMIME = false;
        this.submitter = null;
        this.extension = null;
    }

    public boolean getAllow8bitMIME() {
        return this.allow8bitMIME;
    }

    public String getDSNNotify() {
        int i10 = this.notifyOptions;
        if (i10 == 0) {
            return null;
        }
        if (i10 == -1) {
            return "NEVER";
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.notifyOptions & 1) != 0) {
            sb2.append("SUCCESS");
        }
        if ((this.notifyOptions & 2) != 0) {
            if (sb2.length() != 0) {
                sb2.append(',');
            }
            sb2.append("FAILURE");
        }
        if ((this.notifyOptions & 4) != 0) {
            if (sb2.length() != 0) {
                sb2.append(',');
            }
            sb2.append("DELAY");
        }
        return sb2.toString();
    }

    public String getDSNRet() {
        return returnOptionString[this.returnOption];
    }

    public String getEnvelopeFrom() {
        return this.envelopeFrom;
    }

    public String getMailExtension() {
        return this.extension;
    }

    public int getNotifyOptions() {
        return this.notifyOptions;
    }

    public int getReturnOption() {
        return this.returnOption;
    }

    public boolean getSendPartial() {
        return this.sendPartial;
    }

    public String getSubmitter() {
        return this.submitter;
    }

    public void setAllow8bitMIME(boolean z10) {
        this.allow8bitMIME = z10;
    }

    public void setEnvelopeFrom(String str) {
        this.envelopeFrom = str;
    }

    public void setMailExtension(String str) {
        this.extension = str;
    }

    public void setNotifyOptions(int i10) {
        if (i10 < -1 || i10 >= 8) {
            throw new IllegalArgumentException("Bad return option");
        }
        this.notifyOptions = i10;
    }

    public void setReturnOption(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Bad return option");
        }
        this.returnOption = i10;
    }

    public void setSendPartial(boolean z10) {
        this.sendPartial = z10;
    }

    public void setSubmitter(String str) {
        this.submitter = str;
    }

    public SMTPMessage(Session session, InputStream inputStream) {
        super(session, inputStream);
        this.notifyOptions = 0;
        this.returnOption = 0;
        this.sendPartial = false;
        this.allow8bitMIME = false;
        this.submitter = null;
        this.extension = null;
    }

    public SMTPMessage(MimeMessage mimeMessage) {
        super(mimeMessage);
        this.notifyOptions = 0;
        this.returnOption = 0;
        this.sendPartial = false;
        this.allow8bitMIME = false;
        this.submitter = null;
        this.extension = null;
    }
}
