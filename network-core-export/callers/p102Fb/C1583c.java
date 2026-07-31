package p102Fb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p053Cg.C0794f;
import p138Hb.C2129a;
import p156Ib.C2344b;
import p156Ib.C2345c;
import p156Ib.C2350h;
import p341Sg.C4938a;
import p341Sg.C4939b;
import p341Sg.C4940c;
import p341Sg.C4941d;
import p341Sg.C4942e;
import p341Sg.C4943f;
import p341Sg.C4944g;
import p341Sg.C4945h;
import p341Sg.C4947j;
import p431Xg.C6368g;
import p450Z.C6628k;
import p623j$.util.DesugarCollections;

/* JADX INFO: renamed from: Fb.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C1583c {

    /* JADX INFO: renamed from: e */
    public static final C1583c f5189e;

    /* JADX INFO: renamed from: a */
    public C1584d f5190a;

    /* JADX INFO: renamed from: b */
    public C1584d f5191b;

    /* JADX INFO: renamed from: c */
    public C1584d f5192c;

    /* JADX INFO: renamed from: d */
    public C1584d f5193d;

    static {
        C4939b.m5520a(53, 125, 127, 110, 76, 123, 105, 110, 37, 106, 26, 118, 123, 121, 127, 83, 126, 39);
        C1583c c1583c = new C1583c();
        c1583c.f5190a = new C1584d(Arrays.asList(C4938a.m5519a(24, 112, 108, 108, 104, 107, 34, 55, 55, 121, 104, 113, 106, 41, 54, 117, 98, 119, 118, 121, 54, 118, 125, 108), C4941d.m5522a(117, 105, 29, 105, 109, 110, 39, 50, 50, 124, 109, 116, 106, 44, 51, 112, 103, 114, 115, 124, 51, 115, 120, 105)));
        c1583c.f5191b = new C1584d(Arrays.asList(C4947j.m5529a(6, 26, 26, 30, 29, 84, 65, 65, 15, 110, 30, 7, 28, 94, 64, 3, 20, 1, 0, 15, 64, 0, 11, 26), C4947j.m5529a(-127, -99, -99, -103, -102, -45, -58, -58, -120, -23, -103, -128, -98, -39, -57, -124, -109, -122, -121, -120, -57, -121, -116, -99)));
        new C1584d(Arrays.asList(C4947j.m5529a(22, 10, 10, 14, 13, 68, 81, 81, 8, 126, 31, 13, 10, 12, 80, 31, 26, 19, 11, 18, 10, 23, 80, 29, 17, 19), C4945h.m5527a(58, 38, 38, 34, 33, 104, 125, 82, 125, 36, 51, 33, 38, 37, 124, 51, 54, 63, 39, 62, 38, 59, 124, 49, 61, 63)));
        c1583c.f5192c = new C1584d(Arrays.asList(C4941d.m5522a(29, 1, 117, 1, 5, 6, 79, 90, 90, 3, 6, 7, 69, 68, 91, 15, 26, 27, 20, 6, 16, 20, 7, 22, 29, 91, 22, 26, 24), C4942e.m5523a(-113, -109, -109, -25, -105, -108, -35, -56, -56, -111, -108, -112, -41, -42, -55, -99, -120, -119, -122, -108, -126, -122, -107, -124, -113, -55, -124, -120, -118)));
        c1583c.f5193d = new C1584d(Arrays.asList(C4942e.m5523a(46, 50, 50, 70, 54, 53, 124, 105, 105, 47, 43, 33, 52, 119, 104, 47, 43, 33, 60, 41, 40, 39, 104, 48, 47, 34, 35, 41), C4943f.m5524a(-96, -68, -68, -72, -56, -69, -14, -25, -25, -95, -91, -81, -65, -7, -26, -95, -91, -81, -78, -89, -90, -87, -26, -66, -95, -84, -83, -89)));
        f5189e = c1583c;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m2182c(String str, Map map) {
        ArrayList arrayList = new ArrayList();
        Object[] objArr = (Object[]) map.get(str);
        if (objArr != null) {
            for (Object obj : objArr) {
                arrayList.add(obj.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m2183a(InterfaceC1590j interfaceC1590j) {
        String strMo2186b = this.f5190a.mo2186b(interfaceC1590j);
        return strMo2186b != null ? strMo2186b : this.f5190a.mo2188a();
    }

    /* JADX INFO: renamed from: b */
    public final String m2184b(InterfaceC1590j interfaceC1590j) {
        String strMo2186b = this.f5192c.mo2186b(interfaceC1590j);
        return strMo2186b != null ? strMo2186b : this.f5192c.mo2188a();
    }

    /* JADX INFO: renamed from: d */
    public final String m2185d(String str, C6368g c6368g, HashSet hashSet, ArrayList arrayList) throws Exception {
        String str2 = str;
        Integer num = 101;
        List<Character> list = C2344b.f7629a;
        char c10 = 1;
        if (str2 == null) {
            throw new RuntimeException(C4943f.m5524a(103, 64, 94, 91, 46, 90, 14, 93, 90, 92, 71, 64, 73, 14, 71, 93, 14, 64, 91, 66, 66));
        }
        if (str2.length() % 6 != 0) {
            throw new RuntimeException(C4939b.m5520a(num, 66, 90, 77, 64, 69, 72, 12, 69, 66, 44, 92, 89, 88, 12, 95, 88, 94, 69, 66, 75));
        }
        StringBuilder sb2 = new StringBuilder();
        Map<Character, Integer> mapM3014a = C2344b.m3014a(((int) C2344b.m3015b(str2.substring(0, 6), C2344b.m3014a(0))) % C2344b.f7629a.size());
        int i10 = 1;
        while (i10 < str2.length() / 6) {
            int i11 = i10;
            Number[] numberArr = new Number[5];
            numberArr[0] = -58;
            numberArr[c10] = -45;
            numberArr[2] = -37;
            numberArr[3] = -101;
            numberArr[4] = -29;
            int i12 = i11 + 1;
            c10 = 1;
            sb2.append(String.format(C4943f.m5524a(numberArr), Long.valueOf(C2344b.m3015b(str2.substring(i11 * 6, i12 * 6), mapM3014a))));
            str2 = str;
            i10 = i12;
            num = num;
        }
        Integer num2 = num;
        char[] charArray = sb2.substring(0, sb2.length() - Integer.parseInt(sb2.substring(sb2.length() - 1))).toCharArray();
        int length = charArray.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException(C4940c.m5521a(-91, -22, -114, -114, -54, -124, -97, -121, -120, -113, -104, -54, -123, -116, -54, -119, -126, -117, -104, -117, -119, -98, -113, -104, -103, -60));
        }
        byte[] bArr = new byte[length >> 1];
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            char[] cArr = charArray;
            int iM3016a = C2345c.m3016a(cArr[i13], i13) << 4;
            int i15 = i13 + 1;
            i13 += 2;
            bArr[i14] = (byte) ((iM3016a | C2345c.m3016a(cArr[i15], i15)) & 255);
            i14++;
            charArray = cArr;
            length = length;
        }
        Map map = (Map) C2129a.m2792g(new String(bArr));
        HashMap map2 = new HashMap();
        try {
            Map map3 = (Map) map.get(C4944g.m5525a(-117, -128, -115, -117, -125, -81, -24, -121, -121, -116, -96, -121, -101, -100, -84, -115, -124, -119, -111));
            for (Object obj : map3.keySet()) {
                try {
                    map2.put(Integer.valueOf(String.valueOf(obj)), Long.valueOf(String.valueOf(map3.get(obj))));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map2);
        ArrayList arrayListM2182c = m2182c(C4940c.m5521a(39, 70, 54, 47), map);
        if (!arrayListM2182c.isEmpty()) {
            this.f5190a = new C1584d(arrayListM2182c, mapUnmodifiableMap);
        }
        ArrayList arrayListM2182c2 = m2182c(C0794f.m1295a(-61, -58, -46, -41, -62, -74, -45), map);
        if (!arrayListM2182c2.isEmpty()) {
            this.f5191b = new C1584d(arrayListM2182c2, mapUnmodifiableMap);
        }
        ArrayList arrayListM2182c3 = m2182c(C4942e.m5523a(93, 74, 88, 43, 95), map);
        if (!arrayListM2182c3.isEmpty()) {
            new C1584d(arrayListM2182c3, mapUnmodifiableMap);
        }
        ArrayList arrayListM2182c4 = m2182c(C4941d.m5522a(115, 116, 0, 114, num2, 97, 109), map);
        if (!arrayListM2182c4.isEmpty()) {
            this.f5192c = new C1584d(arrayListM2182c4, mapUnmodifiableMap);
        }
        ArrayList arrayListM2182c5 = m2182c(C4942e.m5523a(72, 76, 64, 33, 70, 68), map);
        if (!arrayListM2182c5.isEmpty()) {
            this.f5193d = new C1584d(arrayListM2182c5, mapUnmodifiableMap);
        }
        List listAsList = Arrays.asList(this.f5190a, this.f5191b);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(listAsList.size());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new CallableC1582b((InterfaceC1587g) it.next(), c6368g));
        }
        try {
            Iterator it2 = executorServiceNewFixedThreadPool.invokeAll(arrayList2).iterator();
            do {
                if (it2.hasNext()) {
                }
                executorServiceNewFixedThreadPool.shutdown();
                return str;
            } while (((Boolean) ((Future) it2.next()).get()).booleanValue());
        } catch (InterruptedException unused) {
        } catch (ExecutionException unused2) {
        } catch (Throwable th) {
            executorServiceNewFixedThreadPool.shutdown();
            throw th;
        }
        executorServiceNewFixedThreadPool.shutdown();
        ArrayList arrayListM2182c6 = m2182c(C4944g.m5525a(45, 38, 43, 45, 37, 96, 78, 59, 60, 34, 61), map);
        if (!arrayListM2182c6.isEmpty()) {
            Iterator it3 = arrayListM2182c6.iterator();
            while (it3.hasNext()) {
                try {
                    c6368g.m2181q((String) it3.next());
                } catch (IOException unused3) {
                }
            }
            return str;
        }
        for (String str3 : m2182c(C4942e.m5523a(-72, -76, -75, -37, -67, -78, -68), map)) {
            if (!hashSet.contains(str3)) {
                try {
                    String strTrim = c6368g.m2181q(str3).m2190a().trim();
                    hashSet.add(str3);
                    return m2185d(strTrim, c6368g, hashSet, arrayList);
                } catch (IOException e12) {
                    arrayList.add(e12.toString());
                }
            }
        }
        throw new Exception(C6628k.m7436a(C4947j.m5529a(-120, -86, -91, -20, -65, -21, -89, -92, -86, -53, -81, -21, -88, -92, -91, -83, -94, -84, -15, -21), C2350h.m3026a(arrayList, C4940c.m5521a(-127, -3))));
    }
}
