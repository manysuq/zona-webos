package javax.activation;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
class DataHandlerDataSource implements DataSource {
    DataHandler dataHandler;

    public DataHandlerDataSource(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    @Override // javax.activation.DataSource
    public String getContentType() {
        return this.dataHandler.getContentType();
    }

    @Override // javax.activation.DataSource
    public InputStream getInputStream() {
        return this.dataHandler.getInputStream();
    }

    @Override // javax.activation.DataSource
    public String getName() {
        return this.dataHandler.getName();
    }

    @Override // javax.activation.DataSource
    public OutputStream getOutputStream() {
        return this.dataHandler.getOutputStream();
    }
}
