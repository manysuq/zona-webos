package com.google.android.gms.internal.pal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.ads.interactivemedia.p508v3.internal.C8504c;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UByte;

/* JADX INFO: renamed from: com.google.android.gms.internal.pal.o3 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9640o3 extends AbstractCallableC9297N3 {

    /* JADX INFO: renamed from: j */
    public static final C9310O3 f30919j = new C9310O3();

    /* JADX INFO: renamed from: h */
    public final Context f30920h;

    /* JADX INFO: renamed from: i */
    public final C9387U4 f30921i;

    public C9640o3(C9458a3 c9458a3, C9302N8 c9302n8, int i10, Context context, C9387U4 c9387u4) {
        super(c9458a3, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", c9302n8, i10, 27);
        this.f30920h = context;
        this.f30921i = c9387u4;
    }

    @Override // com.google.android.gms.internal.pal.AbstractCallableC9297N3
    /* JADX INFO: renamed from: a */
    public final void mo11050a() {
        Boolean boolValueOf;
        int i10;
        C9600l2 c9600l2;
        AtomicReference atomicReferenceM11387a = f30919j.m11387a(this.f30920h.getPackageName());
        synchronized (atomicReferenceM11387a) {
            try {
                C9600l2 c9600l3 = (C9600l2) atomicReferenceM11387a.get();
                if (c9600l3 == null || C9484c3.m11707c(c9600l3.f30870b) || c9600l3.f30870b.equals("E") || c9600l3.f30870b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    C9387U4 c9387u4 = this.f30921i;
                    if (C9484c3.m11707c((c9387u4 == null || !c9387u4.m11483v() || C9484c3.m11707c(c9387u4.m11481t().m11629s())) ? null : c9387u4.m11481t().m11629s())) {
                        C9387U4 c9387u5 = this.f30921i;
                        if (C9484c3.m11707c((c9387u5 == null || !c9387u5.m11483v() || C9484c3.m11707c(c9387u5.m11481t().m11629s())) ? null : c9387u5.m11481t().m11629s())) {
                            boolValueOf = Boolean.valueOf(c9387u5 != null && c9387u5.m11482u() && c9387u5.m11480s().m11429s() == 4);
                        } else {
                            boolValueOf = Boolean.FALSE;
                        }
                        i10 = (boolValueOf.booleanValue() && this.f30507a.f30709n) ? 4 : 3;
                    } else {
                        i10 = 5;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(i10 == 3);
                    C9498d4 c9498d4 = C9641o4.f30923b;
                    C9485c4 c9485c4 = C9485c4.f30740d;
                    Boolean bool = (Boolean) c9485c4.f30743c.m11892a(c9498d4);
                    String strM11927c = ((Boolean) c9485c4.f30743c.m11892a(C9641o4.f30922a)).booleanValue() ? m11927c() : null;
                    if (bool.booleanValue() && this.f30507a.f30709n && C9484c3.m11707c(strM11927c)) {
                        strM11927c = m11928d();
                    }
                    C9600l2 c9600l4 = new C9600l2((String) this.f30511e.invoke(null, this.f30920h, boolValueOf2, strM11927c));
                    if (C9484c3.m11707c(c9600l4.f30870b) || c9600l4.f30870b.equals("E")) {
                        int i11 = i10 - 1;
                        if (i11 == 3) {
                            String strM11928d = m11928d();
                            if (!C9484c3.m11707c(strM11928d)) {
                                c9600l4.f30870b = strM11928d;
                            }
                        } else if (i11 == 4) {
                            c9600l4.f30870b = this.f30921i.m11481t().m11629s();
                        }
                    }
                    atomicReferenceM11387a.set(c9600l4);
                }
                c9600l2 = (C9600l2) atomicReferenceM11387a.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f30510d) {
            if (c9600l2 != null) {
                try {
                    C9302N8 c9302n8 = this.f30510d;
                    String str = c9600l2.f30870b;
                    if (c9302n8.f30738d) {
                        c9302n8.m11637k();
                        c9302n8.f30738d = false;
                    }
                    C9482c1.m11699z0((C9482c1) c9302n8.f30737c, str);
                    C9302N8 c9302n9 = this.f30510d;
                    long j10 = c9600l2.f30871c;
                    if (c9302n9.f30738d) {
                        c9302n9.m11637k();
                        c9302n9.f30738d = false;
                    }
                    C9482c1.m11682r((C9482c1) c9302n9.f30737c, j10);
                    C9302N8 c9302n10 = this.f30510d;
                    String str2 = c9600l2.f30872d;
                    if (c9302n10.f30738d) {
                        c9302n10.m11637k();
                        c9302n10.f30738d = false;
                    }
                    C9482c1.m11647E0((C9482c1) c9302n10.f30737c, str2);
                    C9302N8 c9302n11 = this.f30510d;
                    String str3 = c9600l2.f30873e;
                    if (c9302n11.f30738d) {
                        c9302n11.m11637k();
                        c9302n11.f30738d = false;
                    }
                    C9482c1.m11638A((C9482c1) c9302n11.f30737c, str3);
                    C9302N8 c9302n12 = this.f30510d;
                    String str4 = c9600l2.f30874f;
                    if (c9302n12.f30738d) {
                        c9302n12.m11637k();
                        c9302n12.f30738d = false;
                    }
                    C9482c1.m11640B((C9482c1) c9302n12.f30737c, str4);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m11927c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            C9550h4 c9550h4 = C9641o4.f30924c;
            C9485c4 c9485c4 = C9485c4.f30740d;
            byte[] bArrM11708d = C9484c3.m11708d((String) c9485c4.f30743c.m11892a(c9550h4));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM11708d)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(C9484c3.m11708d((String) c9485c4.f30743c.m11892a(C9641o4.f30925d)))));
            }
            Context context = this.f30920h;
            String packageName = context.getPackageName();
            this.f30507a.getClass();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final C9221H5 c9221h5 = new C9221H5();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.pal.P3
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    C9221H5 c9221h6 = c9221h5;
                    if (list == null) {
                        c9221h6.m11193j(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksumM10395a = C8504c.m10395a(list.get(i10));
                            if (apkChecksumM10395a.getType() == 8) {
                                byte[] value = apkChecksumM10395a.getValue();
                                char[] cArr = C9484c3.f30739a;
                                int length = value.length;
                                char[] cArr2 = new char[length + length];
                                for (int i11 = 0; i11 < value.length; i11++) {
                                    byte b10 = value[i11];
                                    int i12 = b10 & UByte.MAX_VALUE;
                                    int i13 = i11 + i11;
                                    char[] cArr3 = C9484c3.f30739a;
                                    cArr2[i13] = cArr3[i12 >>> 4];
                                    cArr2[i13 + 1] = cArr3[b10 & 15];
                                }
                                c9221h6.m11193j(new String(cArr2));
                                return;
                            }
                        }
                        c9221h6.m11193j(null);
                    } catch (Throwable unused) {
                        c9221h6.m11193j(null);
                    }
                }
            });
            return (String) c9221h5.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m11928d() {
        try {
            Future future = this.f30507a.f30706k;
            if (future != null) {
                future.get();
            }
            C9482c1 c9482c1 = this.f30507a.f30705j;
            if (c9482c1 == null || !c9482c1.m11700Z()) {
                return null;
            }
            return c9482c1.m11703k0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
