package androidx.media3.exoplayer.dash;

import android.support.v4.media.session.C7408e;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.C7773g;
import androidx.media3.exoplayer.dash.C7770d.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p039C2.C0513S;
import p039C2.C0515a;
import p093F2.InterfaceC1479C;
import p170J7.AbstractC2481A;
import p170J7.C2490J;
import p170J7.C2492L;
import p170J7.C2500U;
import p183K2.C2748T0;
import p201L2.C3193c0;
import p224M7.C3512b;
import p237N2.C3606b;
import p237N2.C3608d;
import p237N2.C3614j;
import p255O2.AbstractC3817j;
import p255O2.C3808a;
import p255O2.C3810c;
import p255O2.C3812e;
import p255O2.C3813f;
import p255O2.C3814g;
import p273P2.InterfaceC4049n;
import p273P2.InterfaceC4050o;
import p450Z.C6628k;
import p453Z2.C6656Y;
import p453Z2.C6674i;
import p453Z2.C6676j;
import p453Z2.C6677j0;
import p453Z2.C6687r;
import p453Z2.InterfaceC6640H;
import p453Z2.InterfaceC6657Z;
import p453Z2.InterfaceC6659a0;
import p453Z2.InterfaceC6694y;
import p487b3.AbstractC8006a;
import p487b3.C8013h;
import p517d3.InterfaceC10325q;
import p535e3.C10739e;
import p535e3.C10745k;
import p535e3.InterfaceC10743i;
import p535e3.InterfaceC10746l;
import p623j$.util.Objects;
import p724p.C17490h;
import p884z2.C20687B;
import p884z2.C20708n;
import p884z2.C20715u;

/* JADX INFO: renamed from: androidx.media3.exoplayer.dash.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7768b implements InterfaceC6694y, InterfaceC6659a0.a<C8013h<InterfaceC7767a>>, C8013h.b<InterfaceC7767a> {

    /* JADX INFO: renamed from: B */
    public static final Pattern f25869B = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: C */
    public static final Pattern f25870C = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: A */
    public long f25871A;

    /* JADX INFO: renamed from: b */
    public final int f25872b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7767a.a f25873c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1479C f25874d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4050o f25875e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10743i f25876f;

    /* JADX INFO: renamed from: g */
    public final C3606b f25877g;

    /* JADX INFO: renamed from: h */
    public final long f25878h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC10746l f25879i;

    /* JADX INFO: renamed from: j */
    public final C10739e f25880j;

    /* JADX INFO: renamed from: k */
    public final C6677j0 f25881k;

    /* JADX INFO: renamed from: l */
    public final a[] f25882l;

    /* JADX INFO: renamed from: m */
    public final C6676j f25883m;

    /* JADX INFO: renamed from: n */
    public final C7770d f25884n;

    /* JADX INFO: renamed from: p */
    public final InterfaceC6640H.a f25886p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC4049n.a f25887q;

    /* JADX INFO: renamed from: r */
    public final C3193c0 f25888r;

    /* JADX INFO: renamed from: s */
    public InterfaceC6694y.a f25889s;

    /* JADX INFO: renamed from: v */
    public C6674i f25892v;

    /* JADX INFO: renamed from: w */
    public C3810c f25893w;

    /* JADX INFO: renamed from: x */
    public int f25894x;

    /* JADX INFO: renamed from: y */
    public List<C3813f> f25895y;

    /* JADX INFO: renamed from: z */
    public boolean f25896z = true;

    /* JADX INFO: renamed from: t */
    public C8013h<InterfaceC7767a>[] f25890t = new C8013h[0];

    /* JADX INFO: renamed from: u */
    public C3614j[] f25891u = new C3614j[0];

    /* JADX INFO: renamed from: o */
    public final IdentityHashMap<C8013h<InterfaceC7767a>, C7770d.c> f25885o = new IdentityHashMap<>();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.b$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int[] f25897a;

        /* JADX INFO: renamed from: b */
        public final int f25898b;

        /* JADX INFO: renamed from: c */
        public final int f25899c;

        /* JADX INFO: renamed from: d */
        public final int f25900d;

        /* JADX INFO: renamed from: e */
        public final int f25901e;

        /* JADX INFO: renamed from: f */
        public final int f25902f;

        /* JADX INFO: renamed from: g */
        public final int f25903g;

        /* JADX INFO: renamed from: h */
        public final AbstractC2481A<C20708n> f25904h;

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, AbstractC2481A<C20708n> abstractC2481A) {
            this.f25898b = i10;
            this.f25897a = iArr;
            this.f25899c = i11;
            this.f25901e = i12;
            this.f25902f = i13;
            this.f25903g = i14;
            this.f25900d = i15;
            this.f25904h = abstractC2481A;
        }
    }

    public C7768b(int i10, C3810c c3810c, C3606b c3606b, int i11, InterfaceC7767a.a aVar, InterfaceC1479C interfaceC1479C, InterfaceC4050o interfaceC4050o, InterfaceC4049n.a aVar2, InterfaceC10743i interfaceC10743i, InterfaceC6640H.a aVar3, long j10, InterfaceC10746l interfaceC10746l, C10739e c10739e, C6676j c6676j, DashMediaSource.C7761c c7761c, C3193c0 c3193c0) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        C20708n[][] c20708nArr;
        C20708n[] c20708nArrM9339j;
        C3812e c3812eM9338h;
        Integer num;
        InterfaceC4050o interfaceC4050o2 = interfaceC4050o;
        this.f25872b = i10;
        this.f25893w = c3810c;
        this.f25877g = c3606b;
        this.f25894x = i11;
        this.f25873c = aVar;
        this.f25874d = interfaceC1479C;
        this.f25875e = interfaceC4050o2;
        this.f25887q = aVar2;
        this.f25876f = interfaceC10743i;
        this.f25886p = aVar3;
        this.f25878h = j10;
        this.f25879i = interfaceC10746l;
        this.f25880j = c10739e;
        this.f25883m = c6676j;
        this.f25888r = c3193c0;
        this.f25884n = new C7770d(c3810c, c7761c, c10739e);
        c6676j.getClass();
        AbstractC2481A.b bVar = AbstractC2481A.f8293c;
        C2500U c2500u = C2500U.f8330f;
        this.f25892v = new C6674i(c2500u, c2500u);
        C3814g c3814gM4525b = c3810c.m4525b(i11);
        List<C3813f> list = c3814gM4525b.f12454d;
        this.f25895y = list;
        List<C3808a> list2 = c3814gM4525b.f12453c;
        int size = list2.size();
        HashMap map = new HashMap(C2492L.m3247a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            map.put(Long.valueOf(list2.get(i14).f12407a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            C3808a c3808a = list2.get(i15);
            List<C3812e> list3 = c3808a.f12411e;
            List<C3812e> list4 = c3808a.f12412f;
            C3812e c3812eM9338h2 = m9338h("http://dashif.org/guidelines/trickmode", list3);
            c3812eM9338h2 = c3812eM9338h2 == null ? m9338h("http://dashif.org/guidelines/trickmode", list4) : c3812eM9338h2;
            int iIntValue = (c3812eM9338h2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(c3812eM9338h2.f12445b)))) == null || !m9337g(c3808a, list2.get(num.intValue()))) ? i15 : num.intValue();
            if (iIntValue == i15 && (c3812eM9338h = m9338h("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = c3812eM9338h.f12445b;
                String str2 = C0513S.f2002a;
                for (String str3 : str.split(StringUtils.COMMA, -1)) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(str3)));
                    if (num2 != null && m9337g(c3808a, list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i16 = 0; i16 < size2; i16++) {
            int[] iArrM4294f = C3512b.m4294f((Collection) arrayList.get(i16));
            iArr2[i16] = iArrM4294f;
            Arrays.sort(iArrM4294f);
        }
        boolean[] zArr2 = new boolean[size2];
        C20708n[][] c20708nArr2 = new C20708n[size2][];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr3 = iArr2[i17];
            int length = iArr3.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length) {
                    iArr = iArr2;
                    break;
                }
                List<AbstractC3817j> list7 = list2.get(iArr3[i19]).f12409c;
                iArr = iArr2;
                for (int i20 = 0; i20 < list7.size(); i20++) {
                    if (!list7.get(i20).f12467d.isEmpty()) {
                        zArr2[i17] = true;
                        i18++;
                        break;
                    }
                }
                i19++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i17];
            int length2 = iArr4.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length2) {
                    zArr = zArr2;
                    c20708nArr = c20708nArr2;
                    c20708nArrM9339j = new C20708n[0];
                    break;
                }
                int i22 = iArr4[i21];
                C3808a c3808a2 = list2.get(i22);
                List<C3812e> list8 = list2.get(i22).f12410d;
                int[] iArr5 = iArr4;
                int i23 = 0;
                while (i23 < list8.size()) {
                    C3812e c3812e = list8.get(i23);
                    zArr = zArr2;
                    c20708nArr = c20708nArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c3812e.f12444a)) {
                        C20708n.a aVar4 = new C20708n.a();
                        aVar4.f71072m = C20715u.m25334p("application/cea-608");
                        aVar4.f71060a = C7408e.m8322a(c3808a2.f12407a, ":cea608", new StringBuilder());
                        c20708nArrM9339j = m9339j(c3812e, f25869B, new C20708n(aVar4));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(c3812e.f12444a)) {
                        C20708n.a aVar5 = new C20708n.a();
                        aVar5.f71072m = C20715u.m25334p("application/cea-708");
                        aVar5.f71060a = C7408e.m8322a(c3808a2.f12407a, ":cea708", new StringBuilder());
                        c20708nArrM9339j = m9339j(c3812e, f25870C, new C20708n(aVar5));
                        break;
                    }
                    i23++;
                    c20708nArr2 = c20708nArr;
                    zArr2 = zArr;
                }
                i21++;
                iArr4 = iArr5;
            }
            c20708nArr[i17] = c20708nArrM9339j;
            if (c20708nArrM9339j.length != 0) {
                i18++;
            }
            i17++;
            c20708nArr2 = c20708nArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        C20708n[][] c20708nArr3 = c20708nArr2;
        int size3 = list.size() + i18 + size2;
        C20687B[] c20687bArr = new C20687B[size3];
        a[] aVarArr = new a[size3];
        int i24 = 0;
        int i25 = 0;
        while (i25 < size2) {
            int[] iArr7 = iArr6[i25];
            ArrayList arrayList3 = new ArrayList();
            for (int i26 : iArr7) {
                arrayList3.addAll(list2.get(i26).f12409c);
            }
            int size4 = arrayList3.size();
            C20708n[] c20708nArr4 = new C20708n[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size2;
                C20708n c20708n = ((AbstractC3817j) arrayList3.get(i27)).f12464a;
                int i29 = i24;
                C20708n.a aVarM25303a = c20708n.m25303a();
                aVarM25303a.f71059N = interfaceC4050o2.mo4734a(c20708n);
                c20708nArr4[i27] = new C20708n(aVarM25303a);
                i27++;
                size2 = i28;
                i24 = i29;
            }
            int i30 = size2;
            int i31 = i24;
            C3808a c3808a3 = list2.get(iArr7[0]);
            long j11 = c3808a3.f12407a;
            String string = j11 != -1 ? Long.toString(j11) : C17490h.m19873a(i25, "unset:");
            int i32 = i31 + 1;
            if (zArr3[i25]) {
                i12 = i31 + 2;
            } else {
                i12 = i32;
                i32 = -1;
            }
            if (c20708nArr3[i25].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            int i33 = 0;
            while (i33 < size4) {
                c20708nArr4[i33] = aVar.mo9336b(c20708nArr4[i33]);
                i33++;
                list2 = list2;
            }
            List<C3808a> list9 = list2;
            c20687bArr[i31] = new C20687B(string, c20708nArr4);
            int i34 = c3808a3.f12408b;
            AbstractC2481A.b bVar2 = AbstractC2481A.f8293c;
            C2500U c2500u2 = C2500U.f8330f;
            a aVar6 = new a(i34, 0, iArr7, i31, i32, i12, -1, c2500u2);
            int i35 = i31;
            aVarArr[i35] = aVar6;
            int i36 = -1;
            if (i32 != -1) {
                String strM7436a = C6628k.m7436a(string, ":emsg");
                C20708n.a aVar7 = new C20708n.a();
                aVar7.f71060a = strM7436a;
                aVar7.f71072m = C20715u.m25334p("application/x-emsg");
                c20687bArr[i32] = new C20687B(strM7436a, new C20708n(aVar7));
                aVarArr[i32] = new a(5, 1, iArr7, i35, -1, -1, -1, c2500u2);
                i36 = -1;
            }
            if (i12 != i36) {
                i35 = i35;
                String strM7436a2 = C6628k.m7436a(string, ":cc");
                aVarArr[i12] = new a(3, 1, iArr7, i35, -1, -1, -1, AbstractC2481A.m3205o(c20708nArr3[i25]));
                C20708n[] c20708nArr5 = c20708nArr3[i25];
                for (int i37 = 0; i37 < c20708nArr5.length; i37++) {
                    c20708nArr5[i37] = aVar.mo9336b(c20708nArr5[i37]);
                }
                c20687bArr[i12] = new C20687B(strM7436a2, c20708nArr3[i25]);
            } else {
                i35 = i35;
            }
            i25++;
            size2 = i30;
            interfaceC4050o2 = interfaceC4050o;
            i24 = i13;
            list2 = list9;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            C3813f c3813f = list.get(i38);
            C20708n.a aVar8 = new C20708n.a();
            aVar8.f71060a = c3813f.m4548a();
            aVar8.f71072m = C20715u.m25334p("application/x-emsg");
            c20687bArr[i24] = new C20687B(c3813f.m4548a() + StringUtils.PROCESS_POSTFIX_DELIMITER + i38, new C20708n(aVar8));
            AbstractC2481A.b bVar3 = AbstractC2481A.f8293c;
            aVarArr[i24] = new a(5, 2, new int[0], -1, -1, -1, i38, C2500U.f8330f);
            i38++;
            i24++;
        }
        Pair pairCreate = Pair.create(new C6677j0(c20687bArr), aVarArr);
        this.f25881k = (C6677j0) pairCreate.first;
        this.f25882l = (a[]) pairCreate.second;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9337g(C3808a c3808a, C3808a c3808a2) {
        int i10 = c3808a.f12408b;
        List<AbstractC3817j> list = c3808a.f12409c;
        int i11 = c3808a2.f12408b;
        List<AbstractC3817j> list2 = c3808a2.f12409c;
        if (i10 == i11) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            C20708n c20708n = list.get(0).f12464a;
            C20708n c20708n2 = list2.get(0).f12464a;
            int i12 = c20708n.f71025f & (-16385);
            int i13 = c20708n2.f71025f & (-16385);
            if (Objects.equals(c20708n.f71023d, c20708n2.f71023d) && i12 == i13) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static C3812e m9338h(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3812e c3812e = (C3812e) list.get(i10);
            if (str.equals(c3812e.f12444a)) {
                return c3812e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static C20708n[] m9339j(C3812e c3812e, Pattern pattern, C20708n c20708n) {
        String str = c3812e.f12445b;
        if (str == null) {
            return new C20708n[]{c20708n};
        }
        String str2 = C0513S.f2002a;
        String[] strArrSplit = str.split(";", -1);
        C20708n[] c20708nArr = new C20708n[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            Matcher matcher = pattern.matcher(strArrSplit[i10]);
            if (!matcher.matches()) {
                return new C20708n[]{c20708n};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            C20708n.a aVarM25303a = c20708n.m25303a();
            aVarM25303a.f71060a = c20708n.f71020a + StringUtils.PROCESS_POSTFIX_DELIMITER + i11;
            aVarM25303a.f71055J = i11;
            aVarM25303a.f71063d = matcher.group(2);
            c20708nArr[i10] = new C20708n(aVarM25303a);
        }
        return c20708nArr;
    }

    @Override // p453Z2.InterfaceC6659a0.a
    /* JADX INFO: renamed from: a */
    public final void mo5138a(InterfaceC6659a0 interfaceC6659a0) {
        this.f25889s.mo5138a(this);
    }

    @Override // p453Z2.InterfaceC6694y
    /* JADX INFO: renamed from: b */
    public final long mo5132b(long j10, C2748T0 c2748t0) {
        for (C8013h<InterfaceC7767a> c8013h : this.f25890t) {
            if (c8013h.f27608b == 2) {
                return c8013h.f27612f.mo9342b(j10, c2748t0);
            }
        }
        return j10;
    }

    @Override // p453Z2.InterfaceC6659a0
    /* JADX INFO: renamed from: c */
    public final boolean mo5133c(C7773g c7773g) {
        return this.f25892v.mo5133c(c7773g);
    }

    @Override // p453Z2.InterfaceC6694y
    /* JADX INFO: renamed from: d */
    public final void mo5134d(InterfaceC6694y.a aVar, long j10) {
        this.f25889s = aVar;
        aVar.mo7447e(this);
    }

    @Override // p453Z2.InterfaceC6694y
    public final void discardBuffer(long j10, boolean z10) throws Throwable {
        long j11;
        for (C8013h<InterfaceC7767a> c8013h : this.f25890t) {
            if (!c8013h.m9979p()) {
                C6656Y c6656y = c8013h.f27620n;
                int i10 = c6656y.f21886q;
                c6656y.m7497j(j10, z10, true);
                C6656Y c6656y2 = c8013h.f27620n;
                int i11 = c6656y2.f21886q;
                if (i11 > i10) {
                    synchronized (c6656y2) {
                        j11 = c6656y2.f21885p == 0 ? Long.MIN_VALUE : c6656y2.f21883n[c6656y2.f21887r];
                    }
                    int i12 = 0;
                    while (true) {
                        C6656Y[] c6656yArr = c8013h.f27621o;
                        if (i12 >= c6656yArr.length) {
                            break;
                        }
                        c6656yArr[i12].m7497j(j11, z10, c8013h.f27611e[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(c8013h.m9981r(i11, 0), c8013h.f27628v);
                if (iMin > 0) {
                    C0513S.m987Y(c8013h.f27618l, 0, iMin);
                    c8013h.f27628v -= iMin;
                }
            }
        }
    }

    @Override // p453Z2.InterfaceC6694y
    /* JADX INFO: renamed from: f */
    public final long mo5136f(InterfaceC10325q[] interfaceC10325qArr, boolean[] zArr, InterfaceC6657Z[] interfaceC6657ZArr, boolean[] zArr2, long j10) throws Throwable {
        int i10;
        boolean z10;
        int[] iArr;
        int i11;
        C20687B c20687bM7546a;
        int i12;
        AbstractC2481A<C20708n> abstractC2481A;
        int i13;
        C7770d.c cVar;
        boolean z11;
        int[] iArr2 = new int[interfaceC10325qArr.length];
        char c10 = 0;
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= interfaceC10325qArr.length) {
                break;
            }
            InterfaceC10325q interfaceC10325q = interfaceC10325qArr[i14];
            if (interfaceC10325q != null) {
                iArr2[i14] = this.f25881k.m7547b(interfaceC10325q.mo7450m());
            } else {
                iArr2[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < interfaceC10325qArr.length; i15++) {
            if (interfaceC10325qArr[i15] == null || !zArr[i15]) {
                InterfaceC6657Z interfaceC6657Z = interfaceC6657ZArr[i15];
                if (interfaceC6657Z instanceof C8013h) {
                    ((C8013h) interfaceC6657Z).m9982s(this);
                } else if (interfaceC6657Z instanceof C8013h.a) {
                    C8013h.a aVar = (C8013h.a) interfaceC6657Z;
                    C8013h c8013h = C8013h.this;
                    boolean[] zArr3 = c8013h.f27611e;
                    int i16 = aVar.f27635d;
                    C0515a.m1030f(zArr3[i16]);
                    c8013h.f27611e[i16] = false;
                }
                interfaceC6657ZArr[i15] = null;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            if (i17 >= interfaceC10325qArr.length) {
                break;
            }
            InterfaceC6657Z interfaceC6657Z2 = interfaceC6657ZArr[i17];
            if ((interfaceC6657Z2 instanceof C6687r) || (interfaceC6657Z2 instanceof C8013h.a)) {
                int iM9340i = m9340i(i17, iArr2);
                if (iM9340i == -1) {
                    z11 = interfaceC6657ZArr[i17] instanceof C6687r;
                } else {
                    InterfaceC6657Z interfaceC6657Z3 = interfaceC6657ZArr[i17];
                    z11 = (interfaceC6657Z3 instanceof C8013h.a) && ((C8013h.a) interfaceC6657Z3).f27633b == interfaceC6657ZArr[iM9340i];
                }
                if (!z11) {
                    InterfaceC6657Z interfaceC6657Z4 = interfaceC6657ZArr[i17];
                    if (interfaceC6657Z4 instanceof C8013h.a) {
                        C8013h.a aVar2 = (C8013h.a) interfaceC6657Z4;
                        C8013h c8013h2 = C8013h.this;
                        boolean[] zArr4 = c8013h2.f27611e;
                        int i18 = aVar2.f27635d;
                        C0515a.m1030f(zArr4[i18]);
                        c8013h2.f27611e[i18] = false;
                    }
                    interfaceC6657ZArr[i17] = null;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < interfaceC10325qArr.length) {
            InterfaceC10325q interfaceC10325q2 = interfaceC10325qArr[i19];
            if (interfaceC10325q2 == null) {
                iArr = iArr2;
                i11 = i19;
            } else {
                InterfaceC6657Z interfaceC6657Z5 = interfaceC6657ZArr[i19];
                if (interfaceC6657Z5 == null) {
                    zArr2[i19] = z10;
                    a aVar3 = this.f25882l[iArr2[i19]];
                    int i20 = aVar3.f25899c;
                    if (i20 == 0) {
                        int i21 = aVar3.f25902f;
                        boolean z12 = i21 != i10;
                        if (z12) {
                            c20687bM7546a = this.f25881k.m7546a(i21);
                            i12 = 1;
                        } else {
                            c20687bM7546a = null;
                            i12 = 0;
                        }
                        int i22 = aVar3.f25903g;
                        if (i22 != i10) {
                            abstractC2481A = this.f25882l[i22].f25904h;
                        } else {
                            AbstractC2481A.b bVar = AbstractC2481A.f8293c;
                            abstractC2481A = C2500U.f8330f;
                        }
                        int size = abstractC2481A.size() + i12;
                        C20708n[] c20708nArr = new C20708n[size];
                        int[] iArr3 = new int[size];
                        if (z12) {
                            c20708nArr[c10] = c20687bM7546a.f70890d[c10];
                            iArr3[c10] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i23 = 0; i23 < abstractC2481A.size(); i23++) {
                            C20708n c20708n = abstractC2481A.get(i23);
                            c20708nArr[i13] = c20708n;
                            iArr3[i13] = 3;
                            arrayList.add(c20708n);
                            i13 += z10 ? 1 : 0;
                        }
                        if (this.f25893w.f12420d && z12) {
                            C7770d c7770d = this.f25884n;
                            cVar = c7770d.new c(c7770d.f25929b);
                        } else {
                            cVar = null;
                        }
                        iArr = iArr2;
                        i11 = i19;
                        C7770d.c cVar2 = cVar;
                        C8013h<InterfaceC7767a> c8013h3 = new C8013h<>(aVar3.f25898b, iArr3, c20708nArr, this.f25873c.mo9335a(this.f25879i, this.f25893w, this.f25877g, this.f25894x, aVar3.f25897a, interfaceC10325q2, aVar3.f25898b, this.f25878h, z12, arrayList, cVar, this.f25874d, this.f25888r), this, this.f25880j, j10, this.f25875e, this.f25887q, this.f25876f, this.f25886p, this.f25896z);
                        synchronized (this) {
                            this.f25885o.put(c8013h3, cVar2);
                        }
                        interfaceC6657ZArr[i11] = c8013h3;
                    } else {
                        iArr = iArr2;
                        i11 = i19;
                        if (i20 == 2) {
                            interfaceC6657ZArr[i11] = new C3614j(this.f25895y.get(aVar3.f25900d), interfaceC10325q2.mo7450m().f70890d[0], this.f25893w.f12420d);
                        }
                    }
                } else {
                    iArr = iArr2;
                    i11 = i19;
                    if (interfaceC6657Z5 instanceof C8013h) {
                        ((InterfaceC7767a) ((C8013h) interfaceC6657Z5).f27612f).mo9334e(interfaceC10325q2);
                    }
                }
            }
            i19 = i11 + 1;
            iArr2 = iArr;
            c10 = 0;
            i10 = -1;
            z10 = true;
        }
        int[] iArr4 = iArr2;
        int i24 = 0;
        while (i24 < interfaceC10325qArr.length) {
            if (interfaceC6657ZArr[i24] == null && interfaceC10325qArr[i24] != null) {
                a aVar4 = this.f25882l[iArr4[i24]];
                if (aVar4.f25899c == 1) {
                    iArr4 = iArr4;
                    int iM9340i2 = m9340i(i24, iArr4);
                    if (iM9340i2 == -1) {
                        interfaceC6657ZArr[i24] = new C6687r();
                    } else {
                        C8013h c8013h4 = (C8013h) interfaceC6657ZArr[iM9340i2];
                        int i25 = aVar4.f25898b;
                        boolean[] zArr5 = c8013h4.f27611e;
                        C6656Y[] c6656yArr = c8013h4.f27621o;
                        int i26 = 0;
                        while (true) {
                            if (i26 >= c6656yArr.length) {
                                throw new IllegalStateException();
                            }
                            if (c8013h4.f27609c[i26] == i25) {
                                C0515a.m1030f(!zArr5[i26]);
                                zArr5[i26] = true;
                                c6656yArr[i26].m7492H(j10, true);
                                interfaceC6657ZArr[i24] = new C8013h.a(c8013h4, c6656yArr[i26], i26);
                                break;
                            }
                            i26++;
                        }
                    }
                }
                i24++;
                iArr4 = iArr4;
            }
            i24++;
            iArr4 = iArr4;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC6657Z interfaceC6657Z6 : interfaceC6657ZArr) {
            if (interfaceC6657Z6 instanceof C8013h) {
                arrayList2.add((C8013h) interfaceC6657Z6);
            } else if (interfaceC6657Z6 instanceof C3614j) {
                arrayList3.add((C3614j) interfaceC6657Z6);
            }
        }
        C8013h<InterfaceC7767a>[] c8013hArr = new C8013h[arrayList2.size()];
        this.f25890t = c8013hArr;
        arrayList2.toArray(c8013hArr);
        C3614j[] c3614jArr = new C3614j[arrayList3.size()];
        this.f25891u = c3614jArr;
        arrayList3.toArray(c3614jArr);
        C6676j c6676j = this.f25883m;
        AbstractList abstractListM3245b = C2490J.m3245b(arrayList2, new C3608d());
        c6676j.getClass();
        this.f25892v = new C6674i(arrayList2, abstractListM3245b);
        if (this.f25896z) {
            this.f25896z = false;
            this.f25871A = j10;
        }
        return j10;
    }

    @Override // p453Z2.InterfaceC6659a0
    public final long getBufferedPositionUs() {
        return this.f25892v.getBufferedPositionUs();
    }

    @Override // p453Z2.InterfaceC6659a0
    public final long getNextLoadPositionUs() {
        return this.f25892v.getNextLoadPositionUs();
    }

    @Override // p453Z2.InterfaceC6694y
    public final C6677j0 getTrackGroups() {
        return this.f25881k;
    }

    /* JADX INFO: renamed from: i */
    public final int m9340i(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.f25882l;
            int i12 = aVarArr[i11].f25901e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f25899c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override // p453Z2.InterfaceC6659a0
    public final boolean isLoading() {
        return this.f25892v.isLoading();
    }

    @Override // p453Z2.InterfaceC6694y
    public final void maybeThrowPrepareError() {
        this.f25879i.mo9332a();
    }

    @Override // p453Z2.InterfaceC6694y
    public final long readDiscontinuity() {
        for (C8013h<InterfaceC7767a> c8013h : this.f25890t) {
            c8013h.getClass();
            try {
                boolean z10 = c8013h.f27631y;
                c8013h.f27631y = false;
                if (z10) {
                    return this.f25871A;
                }
            } catch (Throwable th) {
                c8013h.f27631y = false;
                throw th;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    @Override // p453Z2.InterfaceC6659a0
    public final void reevaluateBuffer(long j10) {
        int i10;
        C8013h<InterfaceC7767a>[] c8013hArr = this.f25890t;
        int length = c8013hArr.length;
        int i11 = 0;
        while (i11 < length) {
            C8013h<InterfaceC7767a> c8013h = c8013hArr[i11];
            if (c8013h.f27616j.m12819d()) {
                i10 = i11;
            } else {
                long jM4527d = this.f25893w.m4527d(this.f25894x);
                C6656Y c6656y = c8013h.f27620n;
                C0515a.m1030f(!c8013h.f27616j.m12819d());
                if (c8013h.m9979p() || jM4527d == -9223372036854775807L || c8013h.f27618l.isEmpty()) {
                    i10 = i11;
                } else {
                    AbstractC8006a abstractC8006aM9977k = c8013h.m9977k();
                    long j11 = abstractC8006aM9977k.f27571l;
                    if (j11 == -9223372036854775807L) {
                        j11 = abstractC8006aM9977k.f27604h;
                    }
                    if (j11 <= jM4527d) {
                        i10 = i11;
                    } else {
                        long jM7503q = c6656y.m7503q();
                        if (jM7503q <= jM4527d) {
                            i10 = i11;
                        } else {
                            c6656y.m7499l(Math.max(jM4527d, c6656y.m7504r() + 1));
                            C6656Y[] c6656yArr = c8013h.f27621o;
                            int length2 = c6656yArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                C6656Y c6656y2 = c6656yArr[i12];
                                c6656y2.m7499l(Math.max(jM4527d, c6656y2.m7504r() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            c8013h.f27614h.m7446h(c8013h.f27608b, jM4527d, jM7503q);
                        }
                    }
                }
            }
            i11 = i10 + 1;
        }
        this.f25892v.reevaluateBuffer(j10);
    }

    @Override // p453Z2.InterfaceC6694y
    public final long seekToUs(long j10) throws Throwable {
        AbstractC8006a abstractC8006a;
        boolean zM7492H;
        for (C8013h<InterfaceC7767a> c8013h : this.f25890t) {
            C6656Y[] c6656yArr = c8013h.f27621o;
            C6656Y c6656y = c8013h.f27620n;
            C10745k c10745k = c8013h.f27616j;
            ArrayList<AbstractC8006a> arrayList = c8013h.f27618l;
            c8013h.f27627u = j10;
            c8013h.f27630x = false;
            if (c8013h.m9979p()) {
                c8013h.f27626t = j10;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        abstractC8006a = arrayList.get(i10);
                        long j11 = abstractC8006a.f27603g;
                        if (j11 == j10 && abstractC8006a.f27570k == -9223372036854775807L) {
                            break;
                        }
                        if (j11 <= j10) {
                            i10++;
                        }
                    }
                    abstractC8006a = null;
                    break;
                }
                if (abstractC8006a != null) {
                    zM7492H = c6656y.m7491G(abstractC8006a.m9969e(0));
                } else {
                    long nextLoadPositionUs = c8013h.getNextLoadPositionUs();
                    zM7492H = c6656y.m7492H(j10, nextLoadPositionUs == Long.MIN_VALUE || j10 < nextLoadPositionUs);
                }
                if (zM7492H) {
                    c8013h.f27628v = c8013h.m9981r(c6656y.m7506t(), 0);
                    for (C6656Y c6656y2 : c6656yArr) {
                        c6656y2.m7492H(j10, true);
                    }
                } else {
                    c8013h.f27626t = j10;
                    c8013h.f27632z = false;
                    arrayList.clear();
                    c8013h.f27628v = 0;
                    if (c10745k.m12819d()) {
                        c6656y.m7498k();
                        for (C6656Y c6656y3 : c6656yArr) {
                            c6656y3.m7498k();
                        }
                        c10745k.m12817b();
                    } else {
                        c10745k.f33372c = null;
                        c6656y.m7489E(false);
                        for (C6656Y c6656y4 : c8013h.f27621o) {
                            c6656y4.m7489E(false);
                        }
                    }
                }
            }
        }
        for (C3614j c3614j : this.f25891u) {
            int iM989a = C0513S.m989a(c3614j.f11862d, j10, true);
            c3614j.f11866h = iM989a;
            c3614j.f11867i = (c3614j.f11863e && iM989a == c3614j.f11862d.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }
}
