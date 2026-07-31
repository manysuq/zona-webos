package com.google.ads.interactivemedia.p508v3.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class zzol {
    public static boolean zza(int i10) {
        int i11 = i10 - 1;
        return i11 == 2 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140  */
    public static final int zzb(Context context, zznt zzntVar) {
        int i10;
        String str;
        String strZzc;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzta(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                zzntVar.zzb(5017, "No .so");
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                zzd(bArr, null, context, zzntVar);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s5 = ByteBuffer.wrap(bArr2).getShort();
                                if (s5 == 3) {
                                    fileInputStream.close();
                                    i10 = 5;
                                } else if (s5 == 40) {
                                    fileInputStream.close();
                                    i10 = 3;
                                } else if (s5 == 62) {
                                    fileInputStream.close();
                                    i10 = 7;
                                } else if (s5 == 183) {
                                    fileInputStream.close();
                                    i10 = 6;
                                } else if (s5 != 243) {
                                    zzd(bArr, null, context, zzntVar);
                                } else {
                                    fileInputStream.close();
                                    i10 = 8;
                                }
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    zzd(null, e10.toString(), context, zzntVar);
                }
                i10 = 1;
            }
            if (i10 == 1000) {
                strZzc = zzc(context, zzntVar);
                if (TextUtils.isEmpty(strZzc)) {
                    zzd(null, "Empty dev arch", context, zzntVar);
                } else if (!strZzc.equalsIgnoreCase("i686") || strZzc.equalsIgnoreCase("x86")) {
                    i10 = 5;
                } else if (strZzc.equalsIgnoreCase("x86_64")) {
                    i10 = 7;
                } else if (strZzc.equalsIgnoreCase("arm64-v8a")) {
                    i10 = 6;
                } else if (strZzc.equalsIgnoreCase("armeabi-v7a") || strZzc.equalsIgnoreCase("armv71")) {
                    i10 = 3;
                } else if (strZzc.equalsIgnoreCase("riscv64")) {
                    i10 = 8;
                } else {
                    zzd(null, strZzc, context, zzntVar);
                }
                i10 = 1;
            }
            if (i10 != 1) {
                str = "UNSUPPORTED";
            } else if (i10 != 3) {
                str = "ARM7";
            } else if (i10 != 5) {
                str = "X86";
            } else if (i10 != 6) {
                str = "ARM64";
            } else if (i10 != 7) {
                str = "X86_64";
            } else if (i10 != 8) {
                str = "null";
            } else {
                str = "RISCV64";
            }
            zzntVar.zzb(5018, str);
            return i10;
        }
        zzntVar.zzb(5017, "No lib/");
        i10 = 1000;
        if (i10 == 1000) {
            strZzc = zzc(context, zzntVar);
            if (TextUtils.isEmpty(strZzc)) {
                zzd(null, "Empty dev arch", context, zzntVar);
            } else if (strZzc.equalsIgnoreCase("i686")) {
                i10 = 5;
            } else {
                i10 = 5;
            }
            i10 = 1;
        }
        if (i10 != 1) {
            str = "UNSUPPORTED";
        } else if (i10 != 3) {
            str = "ARM7";
        } else if (i10 != 5) {
            str = "X86";
        } else if (i10 != 6) {
            str = "ARM64";
        } else if (i10 != 7) {
            str = "X86_64";
        } else if (i10 != 8) {
            str = "null";
        } else {
            str = "RISCV64";
        }
        zzntVar.zzb(5018, str);
        return i10;
    }

    private static final String zzc(Context context, zznt zzntVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzql.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e10) {
            zzntVar.zzc(2024, 0L, e10);
        } catch (NoSuchFieldException e11) {
            zzntVar.zzc(2024, 0L, e11);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zznt zzntVar) {
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(zzql.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        zzntVar.zzb(4007, sb2.toString());
    }
}
