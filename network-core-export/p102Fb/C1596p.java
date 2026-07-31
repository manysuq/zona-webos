package p102Fb;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p053Cg.C0794f;
import p341Sg.C4938a;
import p341Sg.C4941d;
import p341Sg.C4942e;
import p341Sg.C4943f;
import p341Sg.C4944g;
import p341Sg.C4946i;
import p431Xg.C6368g;

/* JADX INFO: renamed from: Fb.p */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C1596p {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f5214a = new SimpleDateFormat(C4944g.m5525a(16, 16, 16, 121, 117, 49, 85, 49, 117, 24, 24, 24, 117, 44, 44, 44, 44, 117, 29, 29, 111, 56, 56, 111, 38, 38, 117, 47, 47, 47), Locale.US);

    /* JADX INFO: renamed from: b */
    public static long f5215b = 0;

    /* JADX INFO: renamed from: c */
    public static long f5216c = 0;

    /* JADX INFO: renamed from: d */
    public static boolean f5217d;

    /* JADX INFO: renamed from: a */
    public static long m2211a(C6368g c6368g) {
        if (System.currentTimeMillis() - f5215b > 300000) {
            synchronized (C1596p.class) {
                try {
                    if (!f5217d) {
                        f5217d = true;
                        long j10 = 0;
                        for (int i10 = 0; i10 < 3; i10++) {
                            if (j10 > 0) {
                                try {
                                    Thread.sleep(j10);
                                } catch (Exception unused) {
                                }
                            }
                            j10 += 100;
                            HashMap mapM2212b = m2212b(c6368g, C1583c.f5189e.m2183a(c6368g));
                            List list = (List) mapM2212b.get(C4941d.m5522a(-77, -74, -41, -93, -78));
                            if (list == null) {
                                list = (List) mapM2212b.get(C4938a.m5519a(-101, -33, -6, -17, -2));
                            }
                            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                            SimpleDateFormat simpleDateFormat = f5214a;
                            synchronized (simpleDateFormat) {
                                try {
                                    continue;
                                    Date date = simpleDateFormat.parse(str);
                                    f5215b = System.currentTimeMillis();
                                    f5216c = date.getTime() - f5215b;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        f5217d = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return System.currentTimeMillis() + f5216c;
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m2212b(C6368g c6368g, String str) {
        URL url = new URL(new URL(str), C4942e.m5523a(-99, -97, -114, -6, -82, -109, -105, -97));
        HashMap map = new HashMap();
        c6368g.mo2199i(url.toExternalForm(), Collections.singletonMap(C4943f.m5524a(19, 53, 35, 52, 70, 107, 7, 33, 35, 40, 50), c6368g.mo2192b(C0794f.m1295a(-44, -30, -11, -15, -30, -121, -11, -45, -18, -22, -30))), map);
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static void m2213c(String str, InterfaceC1590j interfaceC1590j, C1584d.a aVar) {
        interfaceC1590j.mo2196f(new URL(new URL(str), C4942e.m5523a(32, 34, 51, 71, 19, 46, 42, 34)).toExternalForm(), Collections.singletonMap(C4941d.m5522a(-23, -49, -68, -39, -50, -111, -3, -37, -39, -46, -56), interfaceC1590j.mo2192b(C4946i.m5528a(-111, -89, -80, -76, -89, -80, -106, -85, -62, -81, -89))), new C1595o(aVar));
    }
}
