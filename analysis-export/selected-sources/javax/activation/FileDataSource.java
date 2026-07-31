package javax.activation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class FileDataSource implements DataSource {
    private File _file;
    private FileTypeMap typeMap;

    public FileDataSource(File file) {
        this.typeMap = null;
        this._file = file;
    }

    @Override // javax.activation.DataSource
    public String getContentType() {
        FileTypeMap fileTypeMap = this.typeMap;
        return fileTypeMap == null ? FileTypeMap.getDefaultFileTypeMap().getContentType(this._file) : fileTypeMap.getContentType(this._file);
    }

    public File getFile() {
        return this._file;
    }

    @Override // javax.activation.DataSource
    public InputStream getInputStream() {
        return new FileInputStream(this._file);
    }

    @Override // javax.activation.DataSource
    public String getName() {
        return this._file.getName();
    }

    @Override // javax.activation.DataSource
    public OutputStream getOutputStream() {
        return new FileOutputStream(this._file);
    }

    public void setFileTypeMap(FileTypeMap fileTypeMap) {
        this.typeMap = fileTypeMap;
    }

    public FileDataSource(String str) {
        this(new File(str));
    }
}
