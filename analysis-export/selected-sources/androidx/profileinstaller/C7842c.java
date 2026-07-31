package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.p659io.ConstantsKt;
import p454Z3.C6697b;
import p454Z3.C6698c;
import p454Z3.C6704i;

/* JADX INFO: renamed from: androidx.profileinstaller.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7842c {

    /* JADX INFO: renamed from: a */
    public static final a f26834a = new a();

    /* JADX INFO: renamed from: androidx.profileinstaller.c$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class b implements c {
        @Override // androidx.profileinstaller.C7842c.c
        /* JADX INFO: renamed from: a */
        public final void mo9660a(int i10, Object obj) {
            if (i10 == 6 || i10 == 7 || i10 == 8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo9660a(int i10, Object obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m9666a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x016d A[Catch: all -> 0x016a, TRY_ENTER, TryCatch #4 {all -> 0x016a, blocks: (B:97:0x0148, B:99:0x0154, B:110:0x016d, B:111:0x0172), top: B:263:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x017e A[Catch: IllegalStateException -> 0x0163, IOException -> 0x0165, FileNotFoundException -> 0x0168, TRY_LEAVE, TryCatch #33 {FileNotFoundException -> 0x0168, IOException -> 0x0165, IllegalStateException -> 0x0163, blocks: (B:95:0x0140, B:100:0x015e, B:118:0x017e, B:116:0x017b, B:115:0x0178), top: B:301:0x0140 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b7 A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #22 {all -> 0x01c6, blocks: (B:133:0x01ab, B:135:0x01b7, B:144:0x01c9), top: B:280:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:144:0x01c9 A[Catch: all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x01c6, blocks: (B:133:0x01ab, B:135:0x01b7, B:144:0x01c9), top: B:280:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:155:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0214 A[Catch: all -> 0x0253, TryCatch #31 {all -> 0x0253, blocks: (B:167:0x020e, B:169:0x0214, B:170:0x0218, B:172:0x021e), top: B:288:0x020e }] */
    /* JADX WARN: Code duplicated, block: B:172:0x021e A[Catch: all -> 0x0253, TRY_LEAVE, TryCatch #31 {all -> 0x0253, blocks: (B:167:0x020e, B:169:0x0214, B:170:0x0218, B:172:0x021e), top: B:288:0x020e }] */
    /* JADX WARN: Code duplicated, block: B:238:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:242:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:249:0x02be  */
    /* JADX WARN: Code duplicated, block: B:263:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0223 A[EDGE_INSN: B:302:0x0223->B:174:0x0223 BREAK  A[LOOP:0: B:170:0x0218->B:303:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb A[Catch: all -> 0x00fe, IllegalStateException -> 0x0101, IOException -> 0x0103, TRY_LEAVE, TryCatch #35 {IOException -> 0x0103, IllegalStateException -> 0x0101, blocks: (B:54:0x00e1, B:56:0x00eb, B:67:0x0105, B:68:0x010a), top: B:300:0x00e1, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0105 A[Catch: all -> 0x00fe, IllegalStateException -> 0x0101, IOException -> 0x0103, TRY_ENTER, TryCatch #35 {IOException -> 0x0103, IllegalStateException -> 0x0101, blocks: (B:54:0x00e1, B:56:0x00eb, B:67:0x0105, B:68:0x010a), top: B:300:0x00e1, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0154 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #4 {all -> 0x016a, blocks: (B:97:0x0148, B:99:0x0154, B:110:0x016d, B:111:0x0172), top: B:263:0x0148 }] */
    /* JADX INFO: renamed from: b */
    public static void m9667b(Context context, Executor executor, c cVar, boolean z10) {
        FileInputStream fileInputStreamM9664a;
        byte[] bArr;
        C6697b[] c6697bArrM7574g;
        C6697b[] c6697bArr;
        c cVar2;
        C6697b[] c6697bArr2;
        byte[] bArr2;
        byte[] bArr3;
        boolean z11;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i10;
        boolean z12;
        ByteArrayOutputStream byteArrayOutputStream;
        int i11;
        C7841b c7841b;
        FileInputStream fileInputStreamM9664a2;
        boolean z13;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = j10 == packageInfo.lastUpdateTime;
                            if (z14) {
                                cVar.mo9660a(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    context.getPackageName();
                    C7843d.m9670c(context, false);
                    return;
                }
            }
            context.getPackageName();
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C7841b c7841b2 = new C7841b(assets, executor, cVar, name, file2);
            byte[] bArr5 = c7841b2.f26828c;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            c7841b2.f26831f = true;
                            fileInputStreamM9664a = c7841b2.m9664a(assets, "dexopt/baseline.prof");
                            bArr = C6704i.f22100a;
                            if (fileInputStreamM9664a != null) {
                                if (Arrays.equals(bArr, C6698c.m7562c(fileInputStreamM9664a, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c6697bArrM7574g = C6704i.m7574g(fileInputStreamM9664a, C6698c.m7562c(fileInputStreamM9664a, 4), c7841b2.f26830e);
                                fileInputStreamM9664a.close();
                                c7841b2.f26832g = c6697bArrM7574g;
                            }
                            c6697bArr = c7841b2.f26832g;
                            if (c6697bArr != null) {
                                fileInputStreamM9664a2 = c7841b2.m9664a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamM9664a2 == null) {
                                    if (fileInputStreamM9664a2 != null) {
                                        fileInputStreamM9664a2.close();
                                    }
                                    c7841b = null;
                                } else {
                                    if (Arrays.equals(C6704i.f22101b, C6698c.m7562c(fileInputStreamM9664a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c7841b2.f26832g = C6704i.m7571d(fileInputStreamM9664a2, C6698c.m7562c(fileInputStreamM9664a2, 4), bArr5, c6697bArr);
                                    fileInputStreamM9664a2.close();
                                    c7841b = c7841b2;
                                }
                                if (c7841b != null) {
                                    c7841b2 = c7841b;
                                }
                            }
                            cVar2 = c7841b2.f26827b;
                            c6697bArr2 = c7841b2.f26832g;
                            bArr2 = c7841b2.f26828c;
                            if (c6697bArr2 != null) {
                                if (c7841b2.f26831f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (C6704i.m7576i(byteArrayOutputStream, bArr2, c6697bArr2)) {
                                    c7841b2.f26833h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    c7841b2.f26832g = null;
                                } else {
                                    cVar2.mo9660a(5, null);
                                    c7841b2.f26832g = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr3 = c7841b2.f26833h;
                            if (bArr3 != null) {
                                if (c7841b2.f26831f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream(c7841b2.f26829d);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
                                        while (true) {
                                            i10 = byteArrayInputStream.read(bArr4);
                                            if (i10 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i10);
                                        }
                                        c7841b2.m9665b(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        c7841b2.f26833h = null;
                                        c7841b2.f26832g = null;
                                        z11 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z11 = false;
                            if (z11) {
                                m9666a(packageInfo, filesDir);
                            }
                            z12 = z11;
                        } else {
                            c7841b2.m9665b(4, null);
                        }
                    } catch (IOException unused2) {
                        c7841b2.m9665b(4, null);
                    }
                } else if (file2.canWrite()) {
                    c7841b2.f26831f = true;
                    try {
                        fileInputStreamM9664a = c7841b2.m9664a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        cVar.mo9660a(6, e10);
                        fileInputStreamM9664a = null;
                    } catch (IOException e11) {
                        cVar.mo9660a(7, e11);
                        fileInputStreamM9664a = null;
                    }
                    bArr = C6704i.f22100a;
                    try {
                        if (fileInputStreamM9664a != null) {
                            try {
                                if (Arrays.equals(bArr, C6698c.m7562c(fileInputStreamM9664a, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c6697bArrM7574g = C6704i.m7574g(fileInputStreamM9664a, C6698c.m7562c(fileInputStreamM9664a, 4), c7841b2.f26830e);
                                try {
                                    fileInputStreamM9664a.close();
                                } catch (IOException e12) {
                                    cVar.mo9660a(7, e12);
                                }
                                c7841b2.f26832g = c6697bArrM7574g;
                            } catch (IOException e13) {
                                cVar.mo9660a(7, e13);
                                try {
                                    fileInputStreamM9664a.close();
                                } catch (IOException e14) {
                                    cVar.mo9660a(7, e14);
                                }
                                c6697bArrM7574g = null;
                            } catch (IllegalStateException e15) {
                                cVar.mo9660a(8, e15);
                                fileInputStreamM9664a.close();
                                c6697bArrM7574g = null;
                            }
                        }
                        c6697bArr = c7841b2.f26832g;
                        if (c6697bArr != null && (i11 = Build.VERSION.SDK_INT) >= 24 && (i11 >= 31 || i11 == 24 || i11 == 25)) {
                            try {
                                fileInputStreamM9664a2 = c7841b2.m9664a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamM9664a2 == null) {
                                    try {
                                        if (Arrays.equals(C6704i.f22101b, C6698c.m7562c(fileInputStreamM9664a2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c7841b2.f26832g = C6704i.m7571d(fileInputStreamM9664a2, C6698c.m7562c(fileInputStreamM9664a2, 4), bArr5, c6697bArr);
                                        fileInputStreamM9664a2.close();
                                        c7841b = c7841b2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamM9664a2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamM9664a2 != null) {
                                        fileInputStreamM9664a2.close();
                                    }
                                    c7841b = null;
                                }
                            } catch (FileNotFoundException e16) {
                                cVar.mo9660a(9, e16);
                            } catch (IOException e17) {
                                cVar.mo9660a(7, e17);
                            } catch (IllegalStateException e18) {
                                c7841b2.f26832g = null;
                                cVar.mo9660a(8, e18);
                            }
                            if (c7841b != null) {
                                c7841b2 = c7841b;
                            }
                        }
                        cVar2 = c7841b2.f26827b;
                        c6697bArr2 = c7841b2.f26832g;
                        bArr2 = c7841b2.f26828c;
                        if (c6697bArr2 != null && bArr2 != null) {
                            if (c7841b2.f26831f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (C6704i.m7576i(byteArrayOutputStream, bArr2, c6697bArr2)) {
                                        cVar2.mo9660a(5, null);
                                        c7841b2.f26832g = null;
                                        byteArrayOutputStream.close();
                                    } else {
                                        c7841b2.f26833h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        c7841b2.f26832g = null;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e19) {
                                cVar2.mo9660a(7, e19);
                            } catch (IllegalStateException e20) {
                                cVar2.mo9660a(8, e20);
                            }
                        }
                        bArr3 = c7841b2.f26833h;
                        if (bArr3 != null) {
                            z11 = false;
                        } else {
                            try {
                                if (c7841b2.f26831f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream(c7841b2.f26829d);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
                                                                                while (true) {
                                                                                    i10 = byteArrayInputStream.read(bArr4);
                                                                                    if (i10 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i10);
                                                                                    }
                                                                                }
                                                                                c7841b2.m9665b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c7841b2.f26833h = null;
                                                                                c7841b2.f26832g = null;
                                                                                z11 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e21) {
                                        e = e21;
                                        c7841b2.m9665b(6, e);
                                        c7841b2.f26833h = null;
                                        c7841b2.f26832g = null;
                                        z11 = false;
                                    } catch (IOException e22) {
                                        e = e22;
                                        c7841b2.m9665b(7, e);
                                        c7841b2.f26833h = null;
                                        c7841b2.f26832g = null;
                                        z11 = false;
                                    }
                                } catch (FileNotFoundException e23) {
                                    e = e23;
                                    c7841b2.m9665b(6, e);
                                    c7841b2.f26833h = null;
                                    c7841b2.f26832g = null;
                                    z11 = false;
                                } catch (IOException e24) {
                                    e = e24;
                                    c7841b2.m9665b(7, e);
                                    c7841b2.f26833h = null;
                                    c7841b2.f26832g = null;
                                    z11 = false;
                                }
                            } catch (Throwable th23) {
                                c7841b2.f26833h = null;
                                c7841b2.f26832g = null;
                                throw th23;
                            }
                        }
                        if (z11) {
                            m9666a(packageInfo, filesDir);
                        }
                        z12 = z11;
                    } catch (Throwable th24) {
                        try {
                            fileInputStreamM9664a.close();
                            throw th24;
                        } catch (IOException e25) {
                            cVar.mo9660a(7, e25);
                            throw th24;
                        }
                    }
                } else {
                    c7841b2.m9665b(4, null);
                }
                if (z12 || !z10) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                C7843d.m9670c(context, z13);
            }
            c7841b2.m9665b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z12 = false;
            if (z12) {
                z13 = false;
            } else {
                z13 = false;
            }
            C7843d.m9670c(context, z13);
        } catch (PackageManager.NameNotFoundException e26) {
            cVar.mo9660a(7, e26);
            C7843d.m9670c(context, false);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class a implements c {
        @Override // androidx.profileinstaller.C7842c.c
        /* JADX INFO: renamed from: a */
        public final void mo9660a(int i10, Object obj) {
        }
    }
}
