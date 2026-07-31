package vg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p107Fg.C1634b;
import p179Jg.C2608D;
import p179Jg.C2610F;
import p179Jg.C2618N;
import p179Jg.C2637p;
import p179Jg.C2644w;
import p284Pd.C4228b;
import p814uf.C18534h;
import ug.InterfaceC18538a;

/* JADX INFO: renamed from: vg.m */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSearchService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchService.kt\nru/zona/client/api/search/impl/SearchService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1739#2:74\n1814#2,3:75\n1739#2:78\n1814#2,3:79\n*S KotlinDebug\n*F\n+ 1 SearchService.kt\nru/zona/client/api/search/impl/SearchService\n*L\n57#1:74\n57#1:75,3\n64#1:78\n64#1:79,3\n*E\n"})
public final class C18790m implements InterfaceC18538a {

    /* JADX INFO: renamed from: d */
    public static final C1634b f58544d;

    /* JADX INFO: renamed from: a */
    public final C18781d f58545a;

    /* JADX INFO: renamed from: b */
    public final C18534h f58546b;

    /* JADX INFO: renamed from: c */
    public final List<String> f58547c;

    static {
        Reflection.getOrCreateKotlinClass(C18790m.class).getSimpleName();
        f58544d = new C1634b();
    }

    public C18790m(C18781d c18781d, C18534h c18534h, List list) {
        this.f58545a = c18781d;
        this.f58546b = c18534h;
        this.f58547c = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m21144a(String str, ContinuationImpl continuationImpl) {
        C18789l c18789l;
        ArrayList arrayList;
        C18791n c18791n;
        C18797t c18797t;
        List<C18794q> list;
        C18791n c18791n2;
        C18797t c18797t2;
        List<C18793p> list2;
        Boolean boolBoxBoolean;
        C2618N c2618nM21143c;
        C18791n c18791n3;
        C18797t c18797t3;
        C18798u c18798u;
        InterfaceC18784g interfaceC18784g;
        boolean zAdd;
        if (continuationImpl instanceof C18789l) {
            c18789l = (C18789l) continuationImpl;
            int i10 = c18789l.f58543n;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c18789l.f58543n = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c18789l = new C18789l(this, continuationImpl);
            }
        } else {
            c18789l = new C18789l(this, continuationImpl);
        }
        Object obj = c18789l.f58541l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c18789l.f58543n;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList();
            c18789l.f58539j = SpillingKt.nullOutSpilledVariable(str);
            c18789l.f58540k = arrayList2;
            c18789l.f58543n = 1;
            Object objM21140a = this.f58545a.m21140a(str, 1000L, c18789l);
            if (objM21140a == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM21140a;
            arrayList = arrayList2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = c18789l.f58540k;
            ResultKt.throwOnFailure(obj);
        }
        C18782e c18782e = (C18782e) obj;
        if (c18782e != null && (c18791n3 = c18782e.f58521a) != null && (c18797t3 = c18791n3.f58548a) != null && (c18798u = c18797t3.f58559a) != null && (interfaceC18784g = c18798u.f58564a) != null) {
            if (interfaceC18784g instanceof C18785h) {
                zAdd = arrayList.add(C18783f.m21142b((C18785h) interfaceC18784g));
            } else if (interfaceC18784g instanceof C18778a) {
                zAdd = arrayList.add(C18783f.m21141a((C18778a) interfaceC18784g));
            } else {
                if (!(interfaceC18784g instanceof C18799v)) {
                    throw new NoWhenBranchMatchedException();
                }
                zAdd = arrayList.add(C18783f.m21143c((C18799v) interfaceC18784g));
            }
            Boxing.boxBoolean(zAdd);
        }
        if (c18782e != null && (c18791n2 = c18782e.f58521a) != null && (c18797t2 = c18791n2.f58548a) != null && (list2 = c18797t2.f58560b) != null) {
            List<C18793p> list3 = list2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                InterfaceC18784g interfaceC18784g2 = ((C18793p) it.next()).f58551a;
                if (interfaceC18784g2 != null) {
                    if (interfaceC18784g2 instanceof C18785h) {
                        c2618nM21143c = C18783f.m21142b((C18785h) interfaceC18784g2);
                    } else if (interfaceC18784g2 instanceof C18778a) {
                        c2618nM21143c = C18783f.m21141a((C18778a) interfaceC18784g2);
                    } else {
                        if (!(interfaceC18784g2 instanceof C18799v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c2618nM21143c = C18783f.m21143c((C18799v) interfaceC18784g2);
                    }
                    boolBoxBoolean = Boxing.boxBoolean(arrayList.add(c2618nM21143c));
                } else {
                    boolBoxBoolean = null;
                }
                arrayList3.add(boolBoxBoolean);
            }
        }
        if (c18782e != null && (c18791n = c18782e.f58521a) != null && (c18797t = c18791n.f58548a) != null && (list = c18797t.f58561c) != null) {
            List<C18794q> list4 = list;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                C18785h c18785h = ((C18794q) it2.next()).f58553a;
                arrayList4.add(c18785h != null ? Boxing.boxBoolean(arrayList.add(C18783f.m21142b(c18785h))) : null);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (p107Fg.C1637e.m2265c(r8, "Load suggests from kinopoisk is failed", r0, r6) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        if (p107Fg.C1637e.m2265c(r8, "Load suggests from zona is failed", r13, r6) == r7) goto L52;
     */
    @Override // ug.InterfaceC18538a
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo20317e(String str, ContinuationImpl continuationImpl) {
        C18788k c18788k;
        List listEmptyList;
        String str2;
        List list;
        String str3;
        Object objM25471b;
        if (continuationImpl instanceof C18788k) {
            c18788k = (C18788k) continuationImpl;
            int i10 = c18788k.f58538o;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c18788k.f58538o = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c18788k = new C18788k(this, continuationImpl);
            }
        } else {
            c18788k = new C18788k(this, continuationImpl);
        }
        C18788k c18788k2 = c18788k;
        Object objM21144a = c18788k2.f58536m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c18788k2.f58538o;
        C1634b c1634b = f58544d;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objM21144a);
                c18788k2.f58533j = str;
                c18788k2.f58538o = 1;
                objM21144a = m21144a(str, c18788k2);
                if (objM21144a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                str = (String) c18788k2.f58533j;
                ResultKt.throwOnFailure(objM21144a);
            } else if (i11 == 2) {
                str = (String) c18788k2.f58533j;
                ResultKt.throwOnFailure(objM21144a);
                listEmptyList = CollectionsKt.emptyList();
                List list2 = listEmptyList;
                str2 = str;
                list = list2;
                if (!list.isEmpty()) {
                    return new C2610F(list);
                }
                try {
                    C18534h c18534h = this.f58546b;
                    C2637p c2637p = new C2637p(str2);
                    c18788k2.f58533j = SpillingKt.nullOutSpilledVariable(str2);
                    c18788k2.f58534k = SpillingKt.nullOutSpilledVariable(list);
                    c18788k2.f58538o = 3;
                    objM25471b = c18534h.f57899a.f57883a.f56650a.m25471b("/getMovieOrSerialSuggests", c2637p, C2637p.Companion.serializer(), C2610F.Companion.serializer(), c18788k2);
                    if (objM25471b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objM25471b;
                } catch (Exception e10) {
                    e = e10;
                    str3 = str2;
                    Exception exc = e;
                    c18788k2.f58533j = SpillingKt.nullOutSpilledVariable(str3);
                    c18788k2.f58534k = SpillingKt.nullOutSpilledVariable(list);
                    c18788k2.f58535l = SpillingKt.nullOutSpilledVariable(exc);
                    c18788k2.f58538o = 4;
                }
            } else {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM21144a);
                    return new C2610F(CollectionsKt.emptyList());
                }
                list = (List) c18788k2.f58534k;
                str3 = (String) c18788k2.f58533j;
                try {
                    ResultKt.throwOnFailure(objM21144a);
                    return objM21144a;
                } catch (Exception e11) {
                    e = e11;
                }
            }
            Exception exc2 = e;
            c18788k2.f58533j = SpillingKt.nullOutSpilledVariable(str3);
            c18788k2.f58534k = SpillingKt.nullOutSpilledVariable(list);
            c18788k2.f58535l = SpillingKt.nullOutSpilledVariable(exc2);
            c18788k2.f58538o = 4;
            listEmptyList = (List) objM21144a;
        } catch (Exception e12) {
            c18788k2.f58533j = str;
            c18788k2.f58534k = SpillingKt.nullOutSpilledVariable(e12);
            c18788k2.f58538o = 2;
        }
        List list3 = listEmptyList;
        str2 = str;
        list = list3;
        if (!list.isEmpty()) {
            return new C2610F(list);
        }
        C18534h c18534h2 = this.f58546b;
        C2637p c2637p2 = new C2637p(str2);
        c18788k2.f58533j = SpillingKt.nullOutSpilledVariable(str2);
        c18788k2.f58534k = SpillingKt.nullOutSpilledVariable(list);
        c18788k2.f58538o = 3;
        objM25471b = c18534h2.f57899a.f57883a.f56650a.m25471b("/getMovieOrSerialSuggests", c2637p2, C2637p.Companion.serializer(), C2610F.Companion.serializer(), c18788k2);
        if (objM25471b == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM25471b;
    }

    @Override // ug.InterfaceC18538a
    /* JADX INFO: renamed from: f */
    public final Object mo20318f(String str, boolean z10, C4228b.a aVar) {
        return this.f58546b.f57899a.f57883a.f56650a.m25471b("/search", new C2644w(str, this.f58547c, z10), C2644w.Companion.serializer(), C2608D.Companion.serializer(), aVar);
    }
}
