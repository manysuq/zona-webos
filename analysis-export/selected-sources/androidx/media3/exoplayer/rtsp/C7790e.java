package androidx.media3.exoplayer.rtsp;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p039C2.C0513S;
import p152I7.C2268b;
import p170J7.AbstractC2481A;
import p170J7.AbstractC2483C;
import p170J7.AbstractC2536y;
import p170J7.C2482B;
import p170J7.C2486F;
import p170J7.C2500U;
import p170J7.C2521j;
import p170J7.C2526o;
import p170J7.C2531t;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7790e {

    /* JADX INFO: renamed from: a */
    public final C2482B<String, String> f26191a;

    static {
        new C7790e(new a());
    }

    public C7790e(a aVar) {
        C2482B<String, String> c2482b;
        C2526o c2526o = aVar.f26192a.f8308a;
        if (c2526o == null) {
            c2482b = C2531t.f8439f;
        } else {
            Collection collectionEntrySet = c2526o.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                c2482b = C2531t.f8439f;
            } else {
                C2526o.a<Map.Entry> aVar2 = (C2526o.a) collectionEntrySet;
                AbstractC2483C.a aVar3 = new AbstractC2483C.a(C2526o.this.size());
                int i10 = 0;
                for (Map.Entry entry : aVar2) {
                    Object key = entry.getKey();
                    C2500U c2500uM3216f = ((AbstractC2481A.a) entry.getValue()).m3216f();
                    aVar3.m3229b(key, c2500uM3216f);
                    i10 += c2500uM3216f.f8332e;
                }
                c2482b = new C2482B<>(aVar3.m3228a(), i10);
            }
        }
        this.f26191a = c2482b;
    }

    /* JADX INFO: renamed from: a */
    public static String m9492a(String str) {
        if (C2268b.m2936a(str, "Accept")) {
            return "Accept";
        }
        if (C2268b.m2936a(str, "Allow")) {
            return "Allow";
        }
        if (C2268b.m2936a(str, "Authorization")) {
            return "Authorization";
        }
        if (C2268b.m2936a(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (C2268b.m2936a(str, "Blocksize")) {
            return "Blocksize";
        }
        if (C2268b.m2936a(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (C2268b.m2936a(str, "Connection")) {
            return "Connection";
        }
        if (C2268b.m2936a(str, "Content-Base")) {
            return "Content-Base";
        }
        if (C2268b.m2936a(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (C2268b.m2936a(str, "Content-Language")) {
            return "Content-Language";
        }
        if (C2268b.m2936a(str, "Content-Length")) {
            return "Content-Length";
        }
        if (C2268b.m2936a(str, "Content-Location")) {
            return "Content-Location";
        }
        if (C2268b.m2936a(str, "Content-Type")) {
            return "Content-Type";
        }
        if (C2268b.m2936a(str, "CSeq")) {
            return "CSeq";
        }
        if (C2268b.m2936a(str, "Date")) {
            return "Date";
        }
        if (C2268b.m2936a(str, "Expires")) {
            return "Expires";
        }
        if (C2268b.m2936a(str, "Location")) {
            return "Location";
        }
        if (C2268b.m2936a(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (C2268b.m2936a(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (C2268b.m2936a(str, "Public")) {
            return "Public";
        }
        if (C2268b.m2936a(str, "Range")) {
            return "Range";
        }
        if (C2268b.m2936a(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (C2268b.m2936a(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (C2268b.m2936a(str, "Scale")) {
            return "Scale";
        }
        if (C2268b.m2936a(str, "Session")) {
            return "Session";
        }
        if (C2268b.m2936a(str, "Speed")) {
            return "Speed";
        }
        if (C2268b.m2936a(str, "Supported")) {
            return "Supported";
        }
        if (C2268b.m2936a(str, "Timestamp")) {
            return "Timestamp";
        }
        if (C2268b.m2936a(str, "Transport")) {
            return "Transport";
        }
        if (C2268b.m2936a(str, "User-Agent")) {
            return "User-Agent";
        }
        if (C2268b.m2936a(str, "Via")) {
            return "Via";
        }
        return C2268b.m2936a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    /* JADX INFO: renamed from: b */
    public final String m9493b(String str) {
        AbstractC2481A abstractC2481AM3222d = this.f26191a.m3222d(m9492a(str));
        if (abstractC2481AM3222d.isEmpty()) {
            return null;
        }
        return (String) C2486F.m3240b(abstractC2481AM3222d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7790e) {
            return this.f26191a.equals(((C7790e) obj).f26191a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26191a.hashCode();
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.e$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C2482B.a<String, String> f26192a;

        public a() {
            this.f26192a = new C2482B.a<>();
        }

        /* JADX INFO: renamed from: a */
        public final void m9494a(String str, String str2) {
            String strM9492a = C7790e.m9492a(str.trim());
            String strTrim = str2.trim();
            C2482B.a<String, String> aVar = this.f26192a;
            aVar.getClass();
            C2521j.m3275a(strM9492a, strTrim);
            C2526o c2526oM3278a = aVar.f8308a;
            if (c2526oM3278a == null) {
                c2526oM3278a = C2526o.m3278a();
                aVar.f8308a = c2526oM3278a;
            }
            AbstractC2536y.b aVar2 = (AbstractC2536y.b) c2526oM3278a.get(strM9492a);
            if (aVar2 == null) {
                AbstractC2481A.b bVar = AbstractC2481A.f8293c;
                C2521j.m3276b(4, "expectedSize");
                aVar2 = new AbstractC2481A.a(4);
                C2526o c2526oM3278a2 = aVar.f8308a;
                if (c2526oM3278a2 == null) {
                    c2526oM3278a2 = C2526o.m3278a();
                    aVar.f8308a = c2526oM3278a2;
                }
                c2526oM3278a2.put(strM9492a, aVar2);
            }
            aVar2.mo3215a(strTrim);
        }

        /* JADX INFO: renamed from: b */
        public final void m9495b(List list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str = (String) list.get(i10);
                String str2 = C0513S.f2002a;
                String[] strArrSplit = str.split(":\\s?", 2);
                if (strArrSplit.length == 2) {
                    m9494a(strArrSplit[0], strArrSplit[1]);
                }
            }
        }

        public a(String str, String str2, int i10) {
            this();
            m9494a("User-Agent", str);
            m9494a("CSeq", String.valueOf(i10));
            if (str2 != null) {
                m9494a("Session", str2);
            }
        }
    }
}
