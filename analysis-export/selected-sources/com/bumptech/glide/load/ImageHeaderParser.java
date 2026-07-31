package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p573g6.InterfaceC11282b;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* JADX INFO: renamed from: b */
        public final boolean f29110b;

        ImageType(boolean z10) {
            this.f29110b = z10;
        }

        public boolean hasAlpha() {
            return this.f29110b;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo10383a(InputStream inputStream, InterfaceC11282b interfaceC11282b);

    /* JADX INFO: renamed from: b */
    ImageType mo10384b(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: c */
    ImageType mo10385c(InputStream inputStream);
}
