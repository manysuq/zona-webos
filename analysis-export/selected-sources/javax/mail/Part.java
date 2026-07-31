package javax.mail;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.activation.DataHandler;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public interface Part {
    public static final String ATTACHMENT = "attachment";
    public static final String INLINE = "inline";

    void addHeader(String str, String str2);

    Enumeration<Header> getAllHeaders();

    Object getContent();

    String getContentType();

    DataHandler getDataHandler();

    String getDescription();

    String getDisposition();

    String getFileName();

    String[] getHeader(String str);

    InputStream getInputStream();

    int getLineCount();

    Enumeration<Header> getMatchingHeaders(String[] strArr);

    Enumeration<Header> getNonMatchingHeaders(String[] strArr);

    int getSize();

    boolean isMimeType(String str);

    void removeHeader(String str);

    void setContent(Object obj, String str);

    void setContent(Multipart multipart);

    void setDataHandler(DataHandler dataHandler);

    void setDescription(String str);

    void setDisposition(String str);

    void setFileName(String str);

    void setHeader(String str, String str2);

    void setText(String str);

    void writeTo(OutputStream outputStream);
}
