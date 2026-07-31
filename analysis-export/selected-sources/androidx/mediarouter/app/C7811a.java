package androidx.mediarouter.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: renamed from: androidx.mediarouter.app.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7811a {

    /* JADX INFO: renamed from: a */
    public static Boolean f26523a;

    /* JADX INFO: renamed from: b */
    public static Boolean f26524b;

    /* JADX INFO: renamed from: c */
    public static Boolean f26525c;

    /* JADX INFO: renamed from: d */
    public static Boolean f26526d;

    /* JADX INFO: renamed from: e */
    public static Boolean f26527e;

    /* JADX INFO: renamed from: f */
    public static Boolean f26528f;

    /* JADX INFO: renamed from: g */
    public static Boolean f26529g;

    /* JADX INFO: renamed from: a */
    public static boolean m9590a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f26528f == null) {
            f26528f = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return f26528f.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9591b(Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (f26526d == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z10 = true;
            }
            f26526d = Boolean.valueOf(z10);
        }
        return f26526d.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9592c(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        if (f26524b == null) {
            f26524b = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || m9591b(resources));
        }
        return f26524b.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9593d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f26529g == null) {
            f26529g = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return f26529g.booleanValue();
    }
}
