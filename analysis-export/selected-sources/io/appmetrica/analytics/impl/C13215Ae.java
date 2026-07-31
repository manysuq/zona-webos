package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p619io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.Ae */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13215Ae {

    /* JADX INFO: renamed from: a */
    public final Context f44405a;

    /* JADX INFO: renamed from: b */
    public final C14256no f44406b;

    /* JADX INFO: renamed from: c */
    public final C14283oo f44407c;

    public C13215Ae(Context context) {
        this(context, new C14256no(), new C14283oo());
    }

    /* JADX INFO: renamed from: a */
    public final String m14976a(String str) {
        try {
            this.f44407c.getClass();
            if (!C14283oo.m16644a(str)) {
                this.f44406b.getClass();
                str = StringsKt__StringsJVMKt.replace$default(UUID.randomUUID().toString(), "-", "", false, 4, (Object) null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f44405a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC13476Ka.m15330a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C13215Ae(Context context, C14256no c14256no, C14283oo c14283oo) {
        this.f44405a = context;
        this.f44406b = c14256no;
        this.f44407c = c14283oo;
    }

    /* JADX INFO: renamed from: a */
    public final void m14977a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f44405a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f44405a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
