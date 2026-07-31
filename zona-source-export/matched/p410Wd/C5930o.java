package p410Wd;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p125Gg.C1910r;
import p125Gg.EnumC1891B;
import p179Jg.InterfaceC2641t;
import p269Og.C3958B;
import p269Og.C3959C;
import p269Og.C3961E;
import p269Og.C3964H;
import p269Og.EnumC3994g;
import p269Og.InterfaceC4009p;
import p287Pg.C4243e;
import p287Pg.C4244f;
import p488b4.C8034N;
import p770rf.InterfaceC17978p;

/* JADX INFO: renamed from: Wd.o */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMovieUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MovieUI.kt\nru/zona/app/data/model/MovieUI\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1739#2:127\n1814#2,3:128\n1739#2:131\n1814#2,3:132\n1739#2:135\n1814#2,3:136\n1739#2:139\n1814#2,3:140\n1739#2:143\n1814#2,3:144\n*S KotlinDebug\n*F\n+ 1 MovieUI.kt\nru/zona/app/data/model/MovieUI\n*L\n73#1:127\n73#1:128,3\n74#1:131\n74#1:132,3\n100#1:135\n100#1:136,3\n101#1:139\n101#1:140,3\n102#1:143\n102#1:144,3\n*E\n"})
public final class C5930o implements InterfaceC5928m {

    /* JADX INFO: renamed from: A */
    public final List<String> f19610A;

    /* JADX INFO: renamed from: B */
    public final List<String> f19611B;

    /* JADX INFO: renamed from: C */
    public final List<C3964H> f19612C;

    /* JADX INFO: renamed from: D */
    public final EnumC3994g f19613D;

    /* JADX INFO: renamed from: b */
    public final String f19614b;

    /* JADX INFO: renamed from: c */
    public final Boolean f19615c;

    /* JADX INFO: renamed from: d */
    public final Boolean f19616d;

    /* JADX INFO: renamed from: e */
    public final Boolean f19617e;

    /* JADX INFO: renamed from: f */
    public final Boolean f19618f;

    /* JADX INFO: renamed from: g */
    public final String f19619g;

    /* JADX INFO: renamed from: h */
    public final String f19620h;

    /* JADX INFO: renamed from: i */
    public final String f19621i;

    /* JADX INFO: renamed from: j */
    public final String f19622j;

    /* JADX INFO: renamed from: k */
    public final List<C5921f> f19623k;

    /* JADX INFO: renamed from: l */
    public final List<C5925j> f19624l;

    /* JADX INFO: renamed from: m */
    public final String f19625m;

    /* JADX INFO: renamed from: n */
    public final String f19626n;

    /* JADX INFO: renamed from: o */
    public final boolean f19627o;

    /* JADX INFO: renamed from: p */
    public final String f19628p;

    /* JADX INFO: renamed from: q */
    public final String f19629q;

    /* JADX INFO: renamed from: r */
    public final String f19630r;

    /* JADX INFO: renamed from: s */
    public final String f19631s;

    /* JADX INFO: renamed from: t */
    public final String f19632t;

    /* JADX INFO: renamed from: u */
    public final C4243e f19633u;

    /* JADX INFO: renamed from: v */
    public final List<C5931p> f19634v;

    /* JADX INFO: renamed from: w */
    public final List<C5931p> f19635w;

    /* JADX INFO: renamed from: x */
    public final List<C5931p> f19636x;

    /* JADX INFO: renamed from: y */
    public final String f19637y;

    /* JADX INFO: renamed from: z */
    public final String f19638z;

    public C5930o(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, String str3, String str4, String str5, List<C5921f> list, List<C5925j> list2, String str6, String str7, boolean z10, String str8, String str9, String str10, String str11, String str12, C4243e c4243e, List<C5931p> list3, List<C5931p> list4, List<C5931p> list5, String str13, String str14, List<String> list6, List<String> list7, List<C3964H> list8) {
        this.f19614b = str;
        this.f19615c = bool;
        this.f19616d = bool2;
        this.f19617e = bool3;
        this.f19618f = bool4;
        this.f19619g = str2;
        this.f19620h = str3;
        this.f19621i = str4;
        this.f19622j = str5;
        this.f19623k = list;
        this.f19624l = list2;
        this.f19625m = str6;
        this.f19626n = str7;
        this.f19627o = z10;
        this.f19628p = str8;
        this.f19629q = str9;
        this.f19630r = str10;
        this.f19631s = str11;
        this.f19632t = str12;
        this.f19633u = c4243e;
        this.f19634v = list3;
        this.f19635w = list4;
        this.f19636x = list5;
        this.f19637y = str13;
        this.f19638z = str14;
        this.f19610A = list6;
        this.f19611B = list7;
        this.f19612C = list8;
        this.f19613D = EnumC3994g.MOVIE;
    }

    /* JADX INFO: renamed from: G */
    public static C5930o m6810G(C5930o c5930o, Boolean bool, Boolean bool2, int i10) {
        return new C5930o(c5930o.f19614b, c5930o.f19615c, (i10 & 4) != 0 ? c5930o.f19616d : bool, (i10 & 8) != 0 ? c5930o.f19617e : bool2, c5930o.f19618f, c5930o.f19619g, c5930o.f19620h, c5930o.f19621i, c5930o.f19622j, c5930o.f19623k, c5930o.f19624l, c5930o.f19625m, c5930o.f19626n, c5930o.f19627o, c5930o.f19628p, c5930o.f19629q, c5930o.f19630r, c5930o.f19631s, c5930o.f19632t, c5930o.f19633u, c5930o.f19634v, c5930o.f19635w, c5930o.f19636x, c5930o.f19637y, c5930o.f19638z, c5930o.f19610A, c5930o.f19611B, c5930o.f19612C);
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: A */
    public final String mo6786A() {
        return this.f19638z;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: B */
    public final boolean mo6787B() {
        return this.f19627o;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: C */
    public final Boolean mo6788C() {
        return this.f19615c;
    }

    @Override // p410Wd.InterfaceC5926k
    /* JADX INFO: renamed from: D */
    public final String mo6780D() {
        return this.f19637y;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: a */
    public final String mo6789a() {
        return this.f19621i;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: b */
    public final String mo6790b() {
        return this.f19631s;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: c */
    public final Boolean mo6791c() {
        return this.f19618f;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: d */
    public final List<C5931p> mo6792d() {
        return this.f19635w;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: e */
    public final List<C5931p> mo6793e() {
        return this.f19634v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5930o)) {
            return false;
        }
        C5930o c5930o = (C5930o) obj;
        return Intrinsics.areEqual(this.f19614b, c5930o.f19614b) && Intrinsics.areEqual(this.f19615c, c5930o.f19615c) && Intrinsics.areEqual(this.f19616d, c5930o.f19616d) && Intrinsics.areEqual(this.f19617e, c5930o.f19617e) && Intrinsics.areEqual(this.f19618f, c5930o.f19618f) && Intrinsics.areEqual(this.f19619g, c5930o.f19619g) && Intrinsics.areEqual(this.f19620h, c5930o.f19620h) && Intrinsics.areEqual(this.f19621i, c5930o.f19621i) && Intrinsics.areEqual(this.f19622j, c5930o.f19622j) && Intrinsics.areEqual(this.f19623k, c5930o.f19623k) && Intrinsics.areEqual(this.f19624l, c5930o.f19624l) && Intrinsics.areEqual(this.f19625m, c5930o.f19625m) && Intrinsics.areEqual(this.f19626n, c5930o.f19626n) && this.f19627o == c5930o.f19627o && Intrinsics.areEqual(this.f19628p, c5930o.f19628p) && Intrinsics.areEqual(this.f19629q, c5930o.f19629q) && Intrinsics.areEqual(this.f19630r, c5930o.f19630r) && Intrinsics.areEqual(this.f19631s, c5930o.f19631s) && Intrinsics.areEqual(this.f19632t, c5930o.f19632t) && Intrinsics.areEqual(this.f19633u, c5930o.f19633u) && Intrinsics.areEqual(this.f19634v, c5930o.f19634v) && Intrinsics.areEqual(this.f19635w, c5930o.f19635w) && Intrinsics.areEqual(this.f19636x, c5930o.f19636x) && Intrinsics.areEqual(this.f19637y, c5930o.f19637y) && Intrinsics.areEqual(this.f19638z, c5930o.f19638z) && Intrinsics.areEqual(this.f19610A, c5930o.f19610A) && Intrinsics.areEqual(this.f19611B, c5930o.f19611B) && Intrinsics.areEqual(this.f19612C, c5930o.f19612C);
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: f */
    public final List<C5931p> mo6794f() {
        return this.f19636x;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: g */
    public final String mo6795g() {
        return this.f19625m;
    }

    @Override // p410Wd.InterfaceC5928m
    public final String getDescription() {
        return this.f19632t;
    }

    @Override // p410Wd.InterfaceC5928m
    public final String getDuration() {
        return this.f19622j;
    }

    @Override // p269Og.InterfaceC4008o
    public final String getId() {
        return this.f19614b;
    }

    @Override // p410Wd.InterfaceC5926k
    public final String getName() {
        return this.f19619g;
    }

    @Override // p269Og.InterfaceC4008o
    public final EnumC3994g getType() {
        return this.f19613D;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: h */
    public final String mo6796h() {
        return this.f19630r;
    }

    public final int hashCode() {
        int iHashCode = this.f19614b.hashCode() * 31;
        Boolean bool = this.f19615c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f19616d;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f19617e;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f19618f;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.f19619g;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19620h;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19621i;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19622j;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<C5921f> list = this.f19623k;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<C5925j> list2 = this.f19624l;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.f19625m;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19626n;
        int iHashCode13 = (((iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31) + (this.f19627o ? 1231 : 1237)) * 31;
        String str7 = this.f19628p;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f19629q;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f19630r;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f19631s;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f19632t;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        C4243e c4243e = this.f19633u;
        int iHashCode19 = (iHashCode18 + (c4243e == null ? 0 : c4243e.hashCode())) * 31;
        List<C5931p> list3 = this.f19634v;
        int iHashCode20 = (iHashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<C5931p> list4 = this.f19635w;
        int iHashCode21 = (iHashCode20 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<C5931p> list5 = this.f19636x;
        int iHashCode22 = (iHashCode21 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str12 = this.f19637y;
        int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f19638z;
        int iHashCode24 = (iHashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<String> list6 = this.f19610A;
        int iHashCode25 = (iHashCode24 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.f19611B;
        int iHashCode26 = (iHashCode25 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<C3964H> list8 = this.f19612C;
        return iHashCode26 + (list8 != null ? list8.hashCode() : 0);
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: j */
    public final List<C5925j> mo6797j() {
        return this.f19624l;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: l */
    public final Boolean mo6798l() {
        return this.f19616d;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: o */
    public final String mo6799o() {
        return this.f19629q;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: p */
    public final String mo6800p() {
        return this.f19620h;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: r */
    public final List<C5921f> mo6801r() {
        return this.f19623k;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: s */
    public final /* bridge */ String mo6802s() {
        return C5927l.m6783a(this);
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: t */
    public final /* bridge */ String mo6803t() {
        return C5927l.m6784b(this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieUI(id=");
        sb2.append(this.f19614b);
        sb2.append(", isHasTrailer=");
        sb2.append(this.f19615c);
        sb2.append(", isFavorite=");
        sb2.append(this.f19616d);
        sb2.append(", isWatched=");
        sb2.append(this.f19617e);
        sb2.append(", isAvailable=");
        sb2.append(this.f19618f);
        sb2.append(", name=");
        sb2.append(this.f19619g);
        sb2.append(", originalName=");
        C8034N.m10004a(sb2, this.f19620h, ", year=", this.f19621i, ", duration=");
        sb2.append(this.f19622j);
        sb2.append(", countries=");
        sb2.append(this.f19623k);
        sb2.append(", genres=");
        sb2.append(this.f19624l);
        sb2.append(", minAge=");
        sb2.append(this.f19625m);
        sb2.append(", zonaRating=");
        sb2.append(this.f19626n);
        sb2.append(", fewVotes=");
        sb2.append(this.f19627o);
        sb2.append(", imdbRating=");
        C8034N.m10004a(sb2, this.f19628p, ", kinopoiskRating=", this.f19629q, ", releaseDateInt=");
        C8034N.m10004a(sb2, this.f19630r, ", releaseDateRus=", this.f19631s, ", description=");
        sb2.append(this.f19632t);
        sb2.append(", qualityRate=");
        sb2.append(this.f19633u);
        sb2.append(", directors=");
        sb2.append(this.f19634v);
        sb2.append(", writers=");
        sb2.append(this.f19635w);
        sb2.append(", actors=");
        sb2.append(this.f19636x);
        sb2.append(", coverUrl=");
        sb2.append(this.f19637y);
        sb2.append(", backdropUrl=");
        sb2.append(this.f19638z);
        sb2.append(", trailerSourceTypes=");
        sb2.append(this.f19610A);
        sb2.append(", movieSourceTypes=");
        sb2.append(this.f19611B);
        sb2.append(", rels=");
        sb2.append(this.f19612C);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // p125Gg.InterfaceC1900h
    /* JADX INFO: renamed from: u */
    public final String mo2252u() {
        return this.f19614b;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: v */
    public final String mo6804v() {
        return this.f19626n;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: w */
    public final String mo6805w() {
        return this.f19628p;
    }

    @Override // p410Wd.InterfaceC5928m
    /* JADX INFO: renamed from: x */
    public final Boolean mo6806x() {
        return this.f19617e;
    }

    public C5930o(InterfaceC4009p interfaceC4009p, InterfaceC17978p interfaceC17978p, InterfaceC2641t interfaceC2641t, List<String> list, Boolean bool, Boolean bool2) {
        Boolean boolValueOf;
        String strMo3386c;
        List<String> list2;
        String id2 = interfaceC4009p.getId();
        boolean z10 = interfaceC4009p instanceof C3958B;
        C3958B c3958b = z10 ? (C3958B) interfaceC4009p : null;
        boolean z11 = true;
        Boolean boolValueOf2 = (c3958b == null || (list2 = c3958b.f13007w) == null) ? null : Boolean.valueOf(!list2.isEmpty());
        if (list == null) {
            boolValueOf = null;
        } else if (z10) {
            List<String> list3 = ((C3958B) interfaceC4009p).f13008x;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    }
                } while (!list.contains((String) it.next()));
            } else {
                z11 = false;
                break;
            }
            boolValueOf = Boolean.valueOf(z11);
        } else {
            boolValueOf = Boolean.FALSE;
        }
        String strM2586a = C1910r.m2586a(interfaceC4009p.getName(), interfaceC17978p.mo20336j());
        String strM2586a2 = C1910r.m2586a(interfaceC4009p.getName(), EnumC1891B.ORIGINAL);
        String strValueOf = interfaceC4009p.mo4681a() == 0 ? null : String.valueOf(interfaceC4009p.mo4681a());
        String strMo20328b = interfaceC17978p.mo20328b(interfaceC4009p.mo4688k());
        List<String> listMo4689m = interfaceC4009p.mo4689m();
        String str = strValueOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo4689m, 10));
        for (String str2 : listMo4689m) {
            arrayList.add(new C5921f(str2, interfaceC17978p.mo20330d(str2)));
        }
        List<String> listMo4692y = interfaceC4009p.mo4692y();
        Boolean bool3 = boolValueOf2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo4692y, 10));
        Iterator<T> it2 = listMo4692y.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C5925j((String) it2.next(), interfaceC17978p));
        }
        String str3 = interfaceC4009p.mo4686g() + "+";
        String strM4695b = interfaceC4009p.mo4679E().f13020a.m4693a() ? C3961E.m4695b(interfaceC4009p.mo4679E().f13020a, EnumC1891B.EN) : null;
        boolean z12 = interfaceC4009p.mo4679E().f13020a.f13017b;
        Boolean bool4 = boolValueOf;
        String strReplace$default = interfaceC4009p.mo4679E().f13021b.m4693a() ? StringsKt__StringsJVMKt.replace$default(C3961E.m4695b(interfaceC4009p.mo4679E().f13021b, EnumC1891B.EN), StringUtils.COMMA, ".", false, 4, (Object) null) : null;
        String strReplace$default2 = interfaceC4009p.mo4679E().f13022c.m4693a() ? StringsKt__StringsJVMKt.replace$default(C3961E.m4695b(interfaceC4009p.mo4679E().f13022c, EnumC1891B.EN), StringUtils.COMMA, ".", false, 4, (Object) null) : null;
        String strMo20329c = interfaceC17978p.mo20329c(interfaceC4009p.mo4687h());
        String strMo20329c2 = interfaceC17978p.mo20329c(interfaceC4009p.mo4682b());
        String str4 = strReplace$default2;
        String strM2586a3 = C1910r.m2586a(interfaceC4009p.getDescription(), interfaceC17978p.mo20336j());
        C4243e c4243eM4957b = C4244f.f14192e.m4957b(Integer.valueOf(interfaceC4009p.mo4691q()));
        List<C3959C> listMo4684e = interfaceC4009p.mo4684e();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo4684e, 10));
        Iterator<T> it3 = listMo4684e.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new C5931p((C3959C) it3.next(), interfaceC17978p, interfaceC2641t));
        }
        List<C3959C> listMo4683d = interfaceC4009p.mo4683d();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo4683d, 10));
        Iterator<T> it4 = listMo4683d.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new C5931p((C3959C) it4.next(), interfaceC17978p, interfaceC2641t));
        }
        List<C3959C> listMo4685f = interfaceC4009p.mo4685f();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo4685f, 10));
        for (Iterator it5 = listMo4685f.iterator(); it5.hasNext(); it5 = it5) {
            arrayList5.add(new C5931p((C3959C) it5.next(), interfaceC17978p, interfaceC2641t));
        }
        if (interfaceC2641t != null) {
            Long longOrNull = StringsKt.toLongOrNull(interfaceC4009p.getId());
            strMo3386c = interfaceC2641t.mo3386c(longOrNull != null ? longOrNull.longValue() : 0L);
        } else {
            strMo3386c = null;
        }
        String str5 = strMo3386c;
        String strMo3385b = interfaceC2641t != null ? interfaceC2641t.mo3385b(interfaceC4009p.mo4690n()) : null;
        C3958B c3958b2 = z10 != 0 ? (C3958B) interfaceC4009p : null;
        List<String> list4 = c3958b2 != null ? c3958b2.f13007w : null;
        C3958B c3958b3 = z10 ? (C3958B) interfaceC4009p : null;
        this(id2, bool3, bool, bool2, bool4, strM2586a, strM2586a2, str, strMo20328b, arrayList, arrayList2, str3, strM4695b, z12, strReplace$default, str4, strMo20329c, strMo20329c2, strM2586a3, c4243eM4957b, arrayList3, arrayList4, arrayList5, str5, strMo3385b, list4, c3958b3 != null ? c3958b3.f13008x : null, interfaceC4009p.mo4680F());
    }
}
