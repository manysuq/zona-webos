package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.p659io.CloseableKt;
import kotlin.p659io.ConstantsKt;
import p623j$.util.DesugarCollections;

/* JADX INFO: renamed from: io.appmetrica.analytics.network.impl.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14622e {
    /* JADX INFO: renamed from: a */
    public static byte[] m17154a(int i10, Function0 function0) {
        try {
            InputStream inputStream = (InputStream) function0.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                            int i11 = 0;
                            while (true) {
                                int i12 = inputStream.read(bArr);
                                if (-1 == i12 || i11 > i10) {
                                    break;
                                    break;
                                }
                                if (i12 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i12);
                                    i11 += i12;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                            return byteArray;
                        } catch (Throwable unused) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                            return new byte[0];
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(inputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    /* JADX INFO: renamed from: a */
    public static final Map m17153a(Map map) {
        return DesugarCollections.unmodifiableMap(new HashMap(map));
    }
}
