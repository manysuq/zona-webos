package com.google.ads.interactivemedia.pal;

import android.util.Log;
import com.google.android.gms.common.internal.C8567h;
import com.google.android.gms.common.internal.C8570k;
import com.google.android.gms.common.internal.C8573n;
import com.google.android.gms.internal.pal.C9165D1;
import com.sun.mail.imap.IMAPStore;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p623j$.util.concurrent.ConcurrentHashMap;
import p670l7.C16342d;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzat {
    static final String zza;
    public static final int zzb;
    public static final int zzc;
    public static final C9165D1 zzd;

    static {
        String str;
        InputStream resourceAsStream;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C8570k c8570k = C8570k.f29352c;
        c8570k.getClass();
        C8567h c8567h = C8570k.f29351b;
        C8573n.m10452e("play-services-pal", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = c8570k.f29353a;
        if (concurrentHashMap.containsKey("play-services-pal")) {
            str3 = (String) concurrentHashMap.get("play-services-pal");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            property = null;
            property = null;
            String property = null;
            InputStream inputStream2 = null;
            try {
                try {
                    resourceAsStream = C8570k.class.getResourceAsStream("/play-services-pal.properties");
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty(IMAPStore.ID_VERSION, null);
                            String str7 = "play-services-pal version is " + property;
                            if (Log.isLoggable(c8567h.f29348a, 2) && (str6 = c8567h.f29349b) != null) {
                                str6.concat(str7);
                            }
                        } else if (Log.isLoggable(c8567h.f29348a, 5) && (str5 = c8567h.f29349b) != null) {
                            str5.concat("Failed to get app version for libraryName: play-services-pal");
                        }
                    } catch (IOException unused) {
                        str = property;
                        inputStream = resourceAsStream;
                        if (Log.isLoggable(c8567h.f29348a, 6) && (str2 = c8567h.f29349b) != null) {
                            str2.concat("Failed to get app version for libraryName: play-services-pal");
                        }
                        resourceAsStream = inputStream;
                        property = str;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = resourceAsStream;
                        if (inputStream2 != null) {
                            C16342d.m19039a(inputStream2);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused2) {
                str = null;
            }
            if (resourceAsStream != null) {
                C16342d.m19039a(resourceAsStream);
            }
            if (property == null) {
                if (Log.isLoggable(c8567h.f29348a, 3) && (str4 = c8567h.f29349b) != null) {
                    str4.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str3 = "UNKNOWN";
            } else {
                str3 = property;
            }
            concurrentHashMap.put("play-services-pal", str3);
        }
        zza = str3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zzb = (int) timeUnit.toMillis(20L);
        zzc = (int) timeUnit.toMillis(20L);
        zzd = C9165D1.m11111a(150L);
    }
}
