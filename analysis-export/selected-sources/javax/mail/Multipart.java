package javax.mail;

import java.io.OutputStream;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Multipart {
    protected Part parent;
    protected Vector<BodyPart> parts = new Vector<>();
    protected String contentType = "multipart/mixed";

    public synchronized void addBodyPart(BodyPart bodyPart) {
        try {
            if (this.parts == null) {
                this.parts = new Vector<>();
            }
            this.parts.addElement(bodyPart);
            bodyPart.setParent(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized BodyPart getBodyPart(int i10) {
        Vector<BodyPart> vector;
        vector = this.parts;
        if (vector == null) {
            throw new IndexOutOfBoundsException("No such BodyPart");
        }
        return vector.elementAt(i10);
    }

    public synchronized String getContentType() {
        return this.contentType;
    }

    public synchronized int getCount() {
        Vector<BodyPart> vector = this.parts;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public synchronized Part getParent() {
        return this.parent;
    }

    public synchronized boolean removeBodyPart(BodyPart bodyPart) {
        boolean zRemoveElement;
        Vector<BodyPart> vector = this.parts;
        if (vector == null) {
            throw new MessagingException("No such body part");
        }
        zRemoveElement = vector.removeElement(bodyPart);
        bodyPart.setParent(null);
        return zRemoveElement;
    }

    public synchronized void setMultipartDataSource(MultipartDataSource multipartDataSource) {
        this.contentType = multipartDataSource.getContentType();
        int count = multipartDataSource.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            addBodyPart(multipartDataSource.getBodyPart(i10));
        }
    }

    public synchronized void setParent(Part part) {
        this.parent = part;
    }

    public abstract void writeTo(OutputStream outputStream);

    public synchronized void addBodyPart(BodyPart bodyPart, int i10) {
        try {
            if (this.parts == null) {
                this.parts = new Vector<>();
            }
            this.parts.insertElementAt(bodyPart, i10);
            bodyPart.setParent(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void removeBodyPart(int i10) {
        Vector<BodyPart> vector = this.parts;
        if (vector != null) {
            BodyPart bodyPartElementAt = vector.elementAt(i10);
            this.parts.removeElementAt(i10);
            bodyPartElementAt.setParent(null);
        } else {
            throw new IndexOutOfBoundsException("No such BodyPart");
        }
    }
}
