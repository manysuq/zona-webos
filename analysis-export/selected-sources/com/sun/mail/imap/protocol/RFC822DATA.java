package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ByteArray;
import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class RFC822DATA implements Item {
    static final char[] name = {'R', 'F', 'C', '8', '2', '2'};
    private final ByteArray data;
    private final boolean isHeader;
    private final int msgno;

    public RFC822DATA(FetchResponse fetchResponse) {
        this(fetchResponse, false);
    }

    public ByteArray getByteArray() {
        return this.data;
    }

    public ByteArrayInputStream getByteArrayInputStream() {
        ByteArray byteArray = this.data;
        if (byteArray != null) {
            return byteArray.toByteArrayInputStream();
        }
        return null;
    }

    public boolean isHeader() {
        return this.isHeader;
    }

    public RFC822DATA(FetchResponse fetchResponse, boolean z10) {
        this.isHeader = z10;
        this.msgno = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        this.data = fetchResponse.readByteArray();
    }
}
