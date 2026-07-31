package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p573g6.InterfaceC11282b;
import p685m6.C16873r;

/* JADX INFO: renamed from: com.bumptech.glide.load.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C8499a {
    /* JADX INFO: renamed from: a */
    public static int m10386a(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC11282b interfaceC11282b) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C16873r(inputStream, interfaceC11282b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int iMo10383a = list.get(i10).mo10383a(inputStream, interfaceC11282b);
                inputStream.reset();
                if (iMo10383a != -1) {
                    return iMo10383a;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static ImageHeaderParser.ImageType m10387b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC11282b interfaceC11282b) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C16873r(inputStream, interfaceC11282b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType imageTypeMo10385c = list.get(i10).mo10385c(inputStream);
                inputStream.reset();
                if (imageTypeMo10385c != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeMo10385c;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
