package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import p002A1.C0027g;
import p623j$.util.Objects;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7843d {

    /* JADX INFO: renamed from: a */
    public static final C0027g<c> f26835a = new C0027g<>();

    /* JADX INFO: renamed from: b */
    public static final Object f26836b = new Object();

    /* JADX INFO: renamed from: c */
    public static c f26837c = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static PackageInfo m9671a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f26838a;

        /* JADX INFO: renamed from: b */
        public final int f26839b;

        /* JADX INFO: renamed from: c */
        public final long f26840c;

        /* JADX INFO: renamed from: d */
        public final long f26841d;

        public b(int i10, int i11, long j10, long j11) {
            this.f26838a = i10;
            this.f26839b = i11;
            this.f26840c = j10;
            this.f26841d = j11;
        }

        /* JADX INFO: renamed from: a */
        public static b m9672a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m9673b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f26838a);
                dataOutputStream.writeInt(this.f26839b);
                dataOutputStream.writeLong(this.f26840c);
                dataOutputStream.writeLong(this.f26841d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f26839b == bVar.f26839b && this.f26840c == bVar.f26840c && this.f26838a == bVar.f26838a && this.f26841d == bVar.f26841d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f26839b), Long.valueOf(this.f26840c), Integer.valueOf(this.f26838a), Long.valueOf(this.f26841d));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.d$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class c {
    }

    /* JADX INFO: renamed from: a */
    public static long m9668a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m9671a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static c m9669b() {
        c cVar = new c();
        f26837c = cVar;
        f26835a.m53j(cVar);
        return f26837c;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX INFO: renamed from: c */
    public static void m9670c(Context context, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        b bVarM9672a;
        int i12;
        b bVar;
        int i13;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z10 || f26837c == null) {
            synchronized (f26836b) {
                if (z10) {
                    i10 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        long jM9668a = m9668a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            bVarM9672a = b.m9672a(file3);
                        } else {
                            bVarM9672a = null;
                        }
                        if (bVarM9672a == null) {
                            if (!z11) {
                                i10 = 327680;
                            } else if (z12) {
                                i10 = 1;
                            } else if (z13) {
                                i10 = 2;
                            }
                        } else if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        if (z10) {
                            i10 = 2;
                        }
                        if (bVarM9672a == null) {
                            i12 = i10;
                        } else {
                            i12 = i10;
                        }
                        bVar = new b(1, i12, jM9668a, length);
                        if (bVarM9672a != null) {
                            bVar.m9673b(file3);
                        } else {
                            bVar.m9673b(file3);
                        }
                        m9669b();
                        return;
                    }
                    m9669b();
                    return;
                }
                if (f26837c != null) {
                    return;
                }
                i10 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z11 = false;
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    try {
                        long jM9668a2 = m9668a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                bVarM9672a = b.m9672a(file3);
                            } catch (IOException unused2) {
                                m9669b();
                                return;
                            }
                        } else {
                            bVarM9672a = null;
                        }
                        if (bVarM9672a == null && bVarM9672a.f26840c == jM9668a2 && (i13 = bVarM9672a.f26839b) != 2) {
                            i10 = i13;
                        } else if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        if (z10 && z13 && i10 != 1) {
                            i10 = 2;
                        }
                        if (bVarM9672a == null && bVarM9672a.f26839b == 2 && i10 == 1 && length3 < bVarM9672a.f26841d) {
                            i12 = 3;
                        } else {
                            i12 = i10;
                        }
                        bVar = new b(1, i12, jM9668a2, length);
                        if (bVarM9672a != null || !bVarM9672a.equals(bVar)) {
                            try {
                                bVar.m9673b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        m9669b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m9669b();
                        return;
                    }
                }
                m9669b();
                return;
                throw th;
            }
        }
    }
}
