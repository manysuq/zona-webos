package com.sun.mail.handlers;

import java.io.IOException;
import java.io.OutputStream;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataSource;
import javax.mail.internet.ContentType;
import javax.mail.internet.ParseException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import p055D0.C0941K;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class text_xml extends text_plain {
    private static final ActivationDataFlavor[] flavors = {new ActivationDataFlavor(String.class, "text/xml", "XML String"), new ActivationDataFlavor(String.class, "application/xml", "XML String"), new ActivationDataFlavor(StreamSource.class, "text/xml", "XML"), new ActivationDataFlavor(StreamSource.class, "application/xml", "XML")};

    private boolean isXmlType(String str) {
        try {
            ContentType contentType = new ContentType(str);
            return contentType.getSubType().equals("xml") && (contentType.getPrimaryType().equals("text") || contentType.getPrimaryType().equals("application"));
        } catch (RuntimeException | ParseException unused) {
        }
    }

    @Override // com.sun.mail.handlers.handler_base
    public Object getData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) {
        if (activationDataFlavor.getRepresentationClass() == String.class) {
            return super.getContent(dataSource);
        }
        if (activationDataFlavor.getRepresentationClass() == StreamSource.class) {
            return new StreamSource(dataSource.getInputStream());
        }
        return null;
    }

    @Override // com.sun.mail.handlers.text_plain, com.sun.mail.handlers.handler_base
    public ActivationDataFlavor[] getDataFlavors() {
        return flavors;
    }

    @Override // com.sun.mail.handlers.text_plain, javax.activation.DataContentHandler
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        if (!isXmlType(str)) {
            throw new IOException(C0941K.m1458b("Invalid content type \"", str, "\" for text/xml DCH"));
        }
        if (obj instanceof String) {
            super.writeTo(obj, str, outputStream);
            return;
        }
        if (!(obj instanceof DataSource) && !(obj instanceof Source)) {
            throw new IOException("Invalid Object type = " + obj.getClass() + ". XmlDCH can only convert DataSource or Source to XML.");
        }
        try {
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            StreamResult streamResult = new StreamResult(outputStream);
            if (obj instanceof DataSource) {
                transformerNewTransformer.transform(new StreamSource(((DataSource) obj).getInputStream()), streamResult);
            } else {
                transformerNewTransformer.transform((Source) obj, streamResult);
            }
        } catch (RuntimeException e10) {
            IOException iOException = new IOException("Unable to run the JAXP transformer on a stream " + e10.getMessage());
            iOException.initCause(e10);
            throw iOException;
        } catch (TransformerException e11) {
            IOException iOException2 = new IOException("Unable to run the JAXP transformer on a stream " + e11.getMessage());
            iOException2.initCause(e11);
            throw iOException2;
        }
    }
}
