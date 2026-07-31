package com.google.android.gms.internal.pal;

import com.google.ads.interactivemedia.pal.NonceLoaderException;
import com.google.ads.interactivemedia.pal.zzat;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import org.mozilla.classfile.ByteCode;

/* JADX INFO: renamed from: com.google.android.gms.internal.pal.e2 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9509e2 extends AbstractC9561i2 {
    /* JADX INFO: renamed from: d */
    public static C9487c6 m11727d() throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://imasdk.googleapis.com/pal/key/public.json").openConnection();
                try {
                    try {
                        httpURLConnection2.setConnectTimeout(zzat.zzb);
                        httpURLConnection2.setReadTimeout(zzat.zzc);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.setUseCaches(false);
                        httpURLConnection2.connect();
                        if (httpURLConnection2.getResponseCode() != 200) {
                            httpURLConnection2.getResponseCode();
                            throw NonceLoaderException.zzb(ByteCode.BREAKPOINT);
                        }
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        try {
                            C9487c6 c9487c6M11710a = C9487c6.m11710a(new C9325P5(inputStream));
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            httpURLConnection2.disconnect();
                            return c9487c6M11710a;
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException | GeneralSecurityException e10) {
                    e = e10;
                    e.toString();
                    throw new NonceLoaderException(203, e);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (GeneralSecurityException e12) {
            e = e12;
        }
    }

    @Override // com.google.android.gms.internal.pal.AbstractC9561i2
    /* JADX INFO: renamed from: a */
    public final AbstractC9447Z4 mo11539a() throws NonceLoaderException {
        try {
            C9722u7.m12041a();
            return new C9473b5(new C9496d2((InterfaceC9312O5) m11727d().m11711b()));
        } catch (GeneralSecurityException e10) {
            throw new NonceLoaderException(ByteCode.JSR_W, e10);
        }
    }
}
