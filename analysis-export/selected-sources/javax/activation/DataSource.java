package javax.activation;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public interface DataSource {
    String getContentType();

    InputStream getInputStream();

    String getName();

    OutputStream getOutputStream();
}
