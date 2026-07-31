package com.google.ads.interactivemedia.p508v3.internal;

import androidx.datastore.preferences.protobuf.C7653h;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import p450Z.C6619b;
import p470a1.C6989a;
import p644k0.C15584G0;
import p724p.C17490h;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzacw implements Iterable, Serializable {
    public static final zzacw zzb = new zzacv(zzaee.zzb);
    private int zza = 0;

    static {
        int i10 = zzack.zza;
    }

    private static zzacw zzc(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(C15584G0.m18245a(i10, "length (", ") must be >= 1"));
        }
        if (i10 == 1) {
            return (zzacw) it.next();
        }
        int i11 = i10 >>> 1;
        zzacw zzacwVarZzc = zzc(it, i11);
        zzacw zzacwVarZzc2 = zzc(it, i10 - i11);
        if (Integer.MAX_VALUE - zzacwVarZzc.zzd() >= zzacwVarZzc2.zzd()) {
            return zzafs.zzv(zzacwVarZzc, zzacwVarZzc2);
        }
        throw new IllegalArgumentException(C6619b.m7416a(zzacwVarZzc.zzd(), zzacwVarZzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    public static int zzm(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(C15584G0.m18245a(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(C6619b.m7416a(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(C6619b.m7416a(i11, i12, "End index: ", " >= "));
    }

    public static zzacw zzp(byte[] bArr, int i10, int i11) {
        zzm(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzacv(bArr2);
    }

    public static zzacw zzq(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = inputStream.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            zzacw zzacwVarZzp = i10 == 0 ? null : zzp(bArr, 0, i10);
            if (zzacwVarZzp == null) {
                break;
            }
            arrayList.add(zzacwVarZzp);
            iMin = Math.min(iMin + iMin, ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    public static void zzr(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(C6619b.m7416a(i10, i11, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(C17490h.m19873a(i10, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return C6989a.m7848b(zzd() <= 50 ? zzagf.zza(this) : zzagf.zza(zzj(0, 47)).concat("..."), "\">", C7653h.m8881a(zzd(), "<ByteString@", hexString, " size=", " contents=\""));
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i10, int i11, int i12);

    public abstract zzacw zzj(int i10, int i11);

    public abstract zzada zzk();

    public abstract void zzl(zzaco zzacoVar);

    public final int zzn() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public zzacs iterator() {
        return new zzacp(this);
    }

    @Deprecated
    public final void zzs(byte[] bArr, int i10, int i11, int i12) {
        zzm(0, i12, zzd());
        zzm(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }

    public final byte[] zzt() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzaee.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
