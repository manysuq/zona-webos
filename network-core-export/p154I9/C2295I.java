package p154I9;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: I9.I */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nURLBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,372:1\n1391#2:373\n1480#2,5:374\n1586#2:379\n1661#2,3:380\n11693#3:383\n12040#3,3:384\n*S KotlinDebug\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilderKt\n*L\n244#1:373\n244#1:374,5\n245#1:379\n245#1:380,3\n273#1:383\n273#1:384,3\n*E\n"})
public final class C2295I {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static final void m2971a(C2294H c2294h, StringBuilder sb2) {
        List listListOf;
        sb2.append(c2294h.m2969d().f7542b);
        String str = c2294h.m2969d().f7542b;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = c2294h.f7530e;
                    String str3 = c2294h.f7531f;
                    if (str2 != null) {
                        sb3.append(str2);
                        if (str3 != null) {
                            sb3.append(':');
                            sb3.append(str3);
                        }
                        sb3.append("@");
                    }
                    CharSequence string = sb3.toString();
                    CharSequence charSequence = c2294h.f7526a;
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb2.append(string);
                    sb2.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = c2294h.f7526a;
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb2.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    CharSequence charSequence3 = c2294h.f7526a;
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb2.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    CharSequence charSequence4 = c2294h.f7526a;
                    String strM2973c = m2973c(c2294h);
                    sb2.append("://");
                    sb2.append(charSequence4);
                    if (!StringsKt__StringsKt.startsWith$default((CharSequence) strM2973c, '/', false, 2, (Object) null)) {
                        sb2.append('/');
                    }
                    sb2.append((CharSequence) strM2973c);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = c2294h.f7526a;
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb2.append(charSequence5);
                    return;
                }
                break;
        }
        sb2.append("://");
        sb2.append(m2972b(c2294h));
        String strM2973c2 = m2973c(c2294h);
        C2290D c2290d = c2294h.f7534i;
        boolean z10 = c2294h.f7527b;
        if (!StringsKt.isBlank(strM2973c2) && !StringsKt__StringsJVMKt.startsWith$default(strM2973c2, "/", false, 2, null)) {
            sb2.append('/');
        }
        sb2.append((CharSequence) strM2973c2);
        if (!c2290d.f13941b.isEmpty() || z10) {
            sb2.append("?");
        }
        Set<Map.Entry<String, List<String>>> setMo2980a = c2290d.mo2980a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setMo2980a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = CollectionsKt.listOf(TuplesKt.m18695to(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(TuplesKt.m18695to(str4, (String) it2.next()));
                }
                listListOf = arrayList2;
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listListOf);
        }
        CollectionsKt___CollectionsKt.joinTo(arrayList, sb2, (124 & 2) != 0 ? ", " : "&", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new C2301O());
        if (c2294h.f7532g.length() > 0) {
            sb2.append('#');
            sb2.append(c2294h.f7532g);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m2972b(C2294H c2294h) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str = c2294h.f7530e;
        String str2 = c2294h.f7531f;
        if (str != null) {
            sb3.append(str);
            if (str2 != null) {
                sb3.append(':');
                sb3.append(str2);
            }
            sb3.append("@");
        }
        sb2.append(sb3.toString());
        sb2.append(c2294h.f7526a);
        int i10 = c2294h.f7528c;
        if (i10 != 0 && i10 != c2294h.m2969d().f7543c) {
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(String.valueOf(c2294h.f7528c));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final String m2973c(C2294H c2294h) {
        List<String> list = c2294h.f7533h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) CollectionsKt.first((List) list)).length() == 0 ? "/" : (String) CollectionsKt.first((List) list);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m2974d(C2294H c2294h, String str) {
        List<String> mutableList;
        if (StringsKt.isBlank(str)) {
            mutableList = CollectionsKt.emptyList();
        } else {
            mutableList = Intrinsics.areEqual(str, "/") ? C2299M.f7537a : CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default(str, new char[]{'/'}, false, 0, 6, (Object) null));
        }
        c2294h.f7533h = mutableList;
    }
}
