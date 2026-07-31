package javax.activation;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
class DataSourceDataContentHandler implements DataContentHandler {
    private DataContentHandler dch;

    /* JADX INFO: renamed from: ds */
    private DataSource f50050ds;
    private ActivationDataFlavor[] transferFlavors = null;

    public DataSourceDataContentHandler(DataContentHandler dataContentHandler, DataSource dataSource) {
        this.f50050ds = dataSource;
        this.dch = dataContentHandler;
    }

    @Override // javax.activation.DataContentHandler
    public Object getContent(DataSource dataSource) {
        DataContentHandler dataContentHandler = this.dch;
        return dataContentHandler != null ? dataContentHandler.getContent(dataSource) : dataSource.getInputStream();
    }

    @Override // javax.activation.DataContentHandler
    public Object getTransferData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        DataContentHandler dataContentHandler = this.dch;
        if (dataContentHandler != null) {
            return dataContentHandler.getTransferData(activationDataFlavor, dataSource);
        }
        if (activationDataFlavor.equals(getTransferDataFlavors()[0])) {
            return dataSource.getInputStream();
        }
        throw new IOException("Unsupported DataFlavor: " + activationDataFlavor);
    }

    @Override // javax.activation.DataContentHandler
    public ActivationDataFlavor[] getTransferDataFlavors() {
        if (this.transferFlavors == null) {
            DataContentHandler dataContentHandler = this.dch;
            if (dataContentHandler != null) {
                this.transferFlavors = dataContentHandler.getTransferDataFlavors();
            } else {
                this.transferFlavors = new ActivationDataFlavor[]{new ActivationDataFlavor(this.f50050ds.getContentType(), this.f50050ds.getContentType())};
            }
        }
        return this.transferFlavors;
    }

    @Override // javax.activation.DataContentHandler
    public void writeTo(Object obj, String str, OutputStream outputStream) throws UnsupportedDataTypeException {
        DataContentHandler dataContentHandler = this.dch;
        if (dataContentHandler != null) {
            dataContentHandler.writeTo(obj, str, outputStream);
        } else {
            throw new UnsupportedDataTypeException("no DCH for content type " + this.f50050ds.getContentType());
        }
    }
}
