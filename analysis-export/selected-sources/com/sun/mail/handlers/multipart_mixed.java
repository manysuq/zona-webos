package com.sun.mail.handlers;

import java.io.IOException;
import java.io.OutputStream;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeMultipart;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class multipart_mixed extends handler_base {
    private static ActivationDataFlavor[] myDF = {new ActivationDataFlavor(Multipart.class, "multipart/mixed", "Multipart")};

    @Override // javax.activation.DataContentHandler
    public Object getContent(DataSource dataSource) throws IOException {
        try {
            return new MimeMultipart(dataSource);
        } catch (MessagingException e10) {
            IOException iOException = new IOException("Exception while constructing MimeMultipart");
            iOException.initCause(e10);
            throw iOException;
        }
    }

    @Override // com.sun.mail.handlers.handler_base
    public ActivationDataFlavor[] getDataFlavors() {
        return myDF;
    }

    @Override // javax.activation.DataContentHandler
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        if (obj instanceof Multipart) {
            try {
                ((Multipart) obj).writeTo(outputStream);
                return;
            } catch (MessagingException e10) {
                IOException iOException = new IOException("Exception writing Multipart");
                iOException.initCause(e10);
                throw iOException;
            }
        }
        throw new IOException("\"" + getDataFlavors()[0].getMimeType() + "\" DataContentHandler requires Multipart object, was given object of type " + obj.getClass().toString() + "; obj.cl " + obj.getClass().getClassLoader() + ", Multipart.cl " + Multipart.class.getClassLoader());
    }
}
