package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.p619io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import kotlin.p659io.ByteStreamsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.Fd */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13349Fd implements Function {

    /* JADX INFO: renamed from: a */
    public final C13401Hd f44677a;

    /* JADX INFO: renamed from: b */
    public final C13322Ed f44678b;

    public C13349Fd(C13401Hd c13401Hd, C13322Ed c13322Ed) {
        this.f44677a = c13401Hd;
        this.f44678b = c13322Ed;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String apply(File file) {
        byte[] bytes;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                    try {
                        bytes = ByteStreamsKt.readBytes(fileInputStream);
                        AbstractC14175ko.m16471a((Closeable) fileInputStream);
                    } catch (Throwable unused) {
                        AbstractC14175ko.m16471a((Closeable) fileInputStream);
                        bytes = null;
                    }
                } catch (Throwable unused2) {
                    fileInputStream = null;
                }
            } else {
                bytes = null;
            }
            if (bytes == null) {
                return null;
            }
            if (bytes.length == 0) {
                bytes = null;
            }
            if (bytes != null) {
                return Base64Utils.compressBase64(MessageNano.toByteArray(this.f44678b.fromModel(new C13479Kd(bytes, this.f44677a))));
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
