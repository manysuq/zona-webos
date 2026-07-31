package com.sun.mail.pop3;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
class TempFile {
    private File file;

    /* JADX INFO: renamed from: sf */
    private WritableSharedFile f31280sf;

    public TempFile(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("pop3.", ".mbox", file);
        this.file = fileCreateTempFile;
        fileCreateTempFile.deleteOnExit();
        this.f31280sf = new WritableSharedFile(this.file);
    }

    public void close() {
        try {
            this.f31280sf.close();
        } catch (IOException unused) {
        }
        this.file.delete();
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public AppendStream getAppendStream() {
        return this.f31280sf.getAppendStream();
    }
}
