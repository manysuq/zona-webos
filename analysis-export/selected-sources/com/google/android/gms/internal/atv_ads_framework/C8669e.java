package com.google.android.gms.internal.atv_ads_framework;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.C7681v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p182K1.C2709a;
import p623j$.util.DesugarCollections;

/* JADX INFO: renamed from: com.google.android.gms.internal.atv_ads_framework.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C8669e {
    /* JADX INFO: renamed from: a */
    public static int m10637a(Context context) {
        if (context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE")) {
            return 2;
        }
        if (context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return 5;
        }
        if (context.getPackageManager().hasSystemFeature("com.google.android.tv.custom_launcher") && m10642f(context, "com.google.android.tvrecommendations")) {
            return 3;
        }
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") && m10642f(context, "com.google.android.tvlauncher")) {
            return 1;
        }
        return (context.getPackageManager().hasSystemFeature("android.software.leanback") && m10642f(context, "com.google.android.leanbacklauncher")) ? 4 : 6;
    }

    /* JADX INFO: renamed from: b */
    public static C8663c m10638b(Context context) {
        String strM10641e;
        String strM10641e2;
        C8620J1 c8620j1M10537k = C8623K1.m10537k();
        String packageName = context.getApplicationContext().getPackageName();
        c8620j1M10537k.m10645c();
        C8623K1.m10539m((C8623K1) c8620j1M10537k.f29512c, packageName);
        String strM10641e3 = m10641e(context, context.getApplicationContext().getPackageName());
        if (!strM10641e3.isEmpty()) {
            c8620j1M10537k.m10645c();
            C8623K1.m10540n((C8623K1) c8620j1M10537k.f29512c, strM10641e3);
        }
        C8734z1 c8734z1M10478k = C8593A1.m10478k();
        String strM10640d = m10640d();
        c8734z1M10478k.m10645c();
        C8593A1.m10480m((C8593A1) c8734z1M10478k.f29512c, strM10640d);
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("com.google.android.tv.operator_tier");
        c8734z1M10478k.m10645c();
        C8593A1.m10481n((C8593A1) c8734z1M10478k.f29512c, zHasSystemFeature);
        C8593A1 c8593a1 = (C8593A1) c8734z1M10478k.m10643a();
        C8614H1 c8614h1M10510k = C8617I1.m10510k();
        c8614h1M10510k.m10645c();
        C8617I1.m10512m((C8617I1) c8614h1M10510k.f29512c);
        C8617I1 c8617i1 = (C8617I1) c8614h1M10510k.m10643a();
        int iM10637a = m10637a(context);
        C8605E1 c8605e1M10500k = C8608F1.m10500k();
        int iM9125b = C7681v.m9125b(iM10637a);
        if (iM9125b != 0) {
            strM10641e = "";
            if (iM9125b == 1) {
                c8605e1M10500k.m10499d(3);
                strM10641e = m10641e(context, "com.google.android.apps.tv.launcherx");
                strM10641e2 = "";
            } else if (iM9125b != 2) {
                if (iM9125b == 3) {
                    c8605e1M10500k.m10499d(5);
                } else if (iM9125b == 4) {
                    c8605e1M10500k.m10499d(6);
                } else if (iM9125b == 5) {
                    c8605e1M10500k.m10499d(1);
                }
                strM10641e2 = "";
            } else {
                c8605e1M10500k.m10499d(4);
                strM10641e2 = m10641e(context, "com.google.android.tvrecommendations");
            }
        } else {
            c8605e1M10500k.m10499d(2);
            strM10641e = m10641e(context, "com.google.android.tvlauncher");
            strM10641e2 = m10641e(context, "com.google.android.tvrecommendations");
        }
        if (!strM10641e.isEmpty()) {
            c8605e1M10500k.m10645c();
            C8608F1.m10502m((C8608F1) c8605e1M10500k.f29512c, strM10641e);
        }
        if (!strM10641e2.isEmpty()) {
            c8605e1M10500k.m10645c();
            C8608F1.m10503n((C8608F1) c8605e1M10500k.f29512c, strM10641e2);
        }
        C8663c c8663cM10628k = C8666d.m10628k();
        c8663cM10628k.m10645c();
        C8666d.m10633p((C8666d) c8663cM10628k.f29512c, (C8623K1) c8620j1M10537k.m10643a());
        c8663cM10628k.m10645c();
        C8666d.m10634q((C8666d) c8663cM10628k.f29512c, c8593a1);
        c8663cM10628k.m10645c();
        C8666d.m10635r((C8666d) c8663cM10628k.f29512c, c8617i1);
        c8663cM10628k.m10645c();
        C8666d.m10630m((C8666d) c8663cM10628k.f29512c, (C8608F1) c8605e1M10500k.m10643a());
        return c8663cM10628k;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[Catch: l -> 0x0160, TryCatch #2 {l -> 0x0160, blocks: (B:36:0x00a9, B:50:0x00d4, B:52:0x00e6, B:61:0x011c, B:62:0x0131, B:64:0x0137, B:53:0x00eb, B:60:0x0115, B:70:0x015f, B:47:0x00c9, B:48:0x00ce, B:49:0x00d1, B:54:0x00fa, B:56:0x0100), top: B:79:0x00a9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[Catch: l -> 0x0160, TryCatch #2 {l -> 0x0160, blocks: (B:36:0x00a9, B:50:0x00d4, B:52:0x00e6, B:61:0x011c, B:62:0x0131, B:64:0x0137, B:53:0x00eb, B:60:0x0115, B:70:0x015f, B:47:0x00c9, B:48:0x00ce, B:49:0x00d1, B:54:0x00fa, B:56:0x0100), top: B:79:0x00a9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6 A[Catch: l -> 0x0160, TryCatch #2 {l -> 0x0160, blocks: (B:36:0x00a9, B:50:0x00d4, B:52:0x00e6, B:61:0x011c, B:62:0x0131, B:64:0x0137, B:53:0x00eb, B:60:0x0115, B:70:0x015f, B:47:0x00c9, B:48:0x00ce, B:49:0x00d1, B:54:0x00fa, B:56:0x0100), top: B:79:0x00a9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb A[Catch: l -> 0x0160, TRY_LEAVE, TryCatch #2 {l -> 0x0160, blocks: (B:36:0x00a9, B:50:0x00d4, B:52:0x00e6, B:61:0x011c, B:62:0x0131, B:64:0x0137, B:53:0x00eb, B:60:0x0115, B:70:0x015f, B:47:0x00c9, B:48:0x00ce, B:49:0x00d1, B:54:0x00fa, B:56:0x0100), top: B:79:0x00a9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0100 A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #1 {all -> 0x0112, blocks: (B:54:0x00fa, B:56:0x0100), top: B:77:0x00fa, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: l -> 0x0160, LOOP:0: B:62:0x0131->B:64:0x0137, LOOP_END, TRY_LEAVE, TryCatch #2 {l -> 0x0160, blocks: (B:36:0x00a9, B:50:0x00d4, B:52:0x00e6, B:61:0x011c, B:62:0x0131, B:64:0x0137, B:53:0x00eb, B:60:0x0115, B:70:0x015f, B:47:0x00c9, B:48:0x00ce, B:49:0x00d1, B:54:0x00fa, B:56:0x0100), top: B:79:0x00a9, inners: #1 }] */
    /* JADX INFO: renamed from: c */
    public static C8594B m10639c(Context context) {
        String str;
        C8711s c8711s;
        Uri uri;
        int iM9125b;
        C8594B c8594bM10706b;
        Uri uri2;
        PackageManager packageManager;
        String authority;
        Cursor cursorQuery;
        HashSet hashSet = new HashSet();
        C8711s c8711s2 = new C8711s();
        String strM10640d = m10640d();
        if (strM10640d.isEmpty()) {
            hashSet.add(EnumC8629M1.SIGNAL_COLLECTION_ERROR_BUILD_FINGERPRINT_PREFIX);
        } else {
            c8711s2.m10705a("atv_bfp", strM10640d);
        }
        int iM10637a = m10637a(context);
        switch (iM10637a) {
            case 1:
                str = "watson";
                break;
            case 2:
                str = "launcher_x";
                break;
            case 3:
                str = "custom";
                break;
            case 4:
                str = "leanback";
                break;
            case 5:
                str = "fire_tv";
                break;
            case 6:
                str = "unknown";
                break;
            default:
                throw null;
        }
        c8711s2.m10705a("atv_lt", str);
        if (context.getPackageManager().hasSystemFeature("com.google.android.tv.operator_tier")) {
            c8711s2.m10705a("atv_ot", "1");
        }
        c8711s2.m10705a("atv_asv", "1.0.0");
        int iM9125b2 = C7681v.m9125b(iM10637a);
        EnumC8629M1 enumC8629M1 = EnumC8629M1.SIGNAL_COLLECTION_ERROR_NAME_NOT_FOUND;
        try {
            if (iM9125b2 != 0) {
                if (iM9125b2 == 1) {
                    String strM10641e = m10641e(context, "com.google.android.apps.tv.launcherx");
                    if (strM10641e.isEmpty()) {
                        hashSet.add(enumC8629M1);
                    } else {
                        c8711s2.m10705a("atv_lxvc", strM10641e);
                    }
                } else if (iM9125b2 == 2) {
                }
                c8711s = new C8711s();
                uri = Uri.EMPTY;
                iM9125b = C7681v.m9125b(m10637a(context));
                if (iM9125b == 0) {
                    uri = C8653Y.f29484b;
                    uri2 = uri;
                    packageManager = context.getPackageManager();
                    authority = uri2.getAuthority();
                    C8687k.m10670a(authority);
                    if (packageManager.resolveContentProvider(authority, 0) == null) {
                        c8594bM10706b = c8711s.m10706b();
                    } else {
                        cursorQuery = context.getContentResolver().query(uri2, null, null, null, null);
                        C8687k.m10670a(cursorQuery);
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(0);
                                C8687k.m10670a(string);
                                String string2 = cursorQuery.getString(1);
                                C8687k.m10670a(string2);
                                c8711s.m10705a(string, string2);
                            } catch (Throwable th) {
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        throw th;
                                    } catch (Exception unused) {
                                        throw th;
                                    }
                                }
                            }
                        }
                        cursorQuery.close();
                        c8594bM10706b = c8711s.m10706b();
                    }
                } else {
                    if (iM9125b != 1) {
                        uri = C8653Y.f29483a;
                    } else if (iM9125b == 2) {
                        uri = C8653Y.f29484b;
                    } else if (iM9125b != 3 || iM9125b == 4 || iM9125b == 5) {
                        c8594bM10706b = c8711s.m10706b();
                    }
                    uri2 = uri;
                    packageManager = context.getPackageManager();
                    authority = uri2.getAuthority();
                    C8687k.m10670a(authority);
                    if (packageManager.resolveContentProvider(authority, 0) == null) {
                        c8594bM10706b = c8711s.m10706b();
                    } else {
                        cursorQuery = context.getContentResolver().query(uri2, null, null, null, null);
                        C8687k.m10670a(cursorQuery);
                        while (cursorQuery.moveToNext()) {
                            String string3 = cursorQuery.getString(0);
                            C8687k.m10670a(string3);
                            String string4 = cursorQuery.getString(1);
                            C8687k.m10670a(string4);
                            c8711s.m10705a(string3, string4);
                        }
                        cursorQuery.close();
                        c8594bM10706b = c8711s.m10706b();
                    }
                }
                AbstractC8717u abstractC8717uEntrySet = c8594bM10706b.entrySet();
                c8711s2.m10707c(((C8729y) abstractC8717uEntrySet).f29600f + c8711s2.f29565b);
                for (Map.Entry entry : (C8729y) abstractC8717uEntrySet) {
                    c8711s2.m10705a(entry.getKey(), entry.getValue());
                }
                C8594B c8594bM10706b2 = c8711s2.m10706b();
                C8642S0 c8642s0M10567a = C8642S0.m10567a(context);
                C8635O1 c8635o1M10616k = C8660b.m10616k();
                c8635o1M10616k.m10645c();
                C8660b.m10619n((C8660b) c8635o1M10616k.f29512c, hashSet);
                C8660b c8660b = (C8660b) c8635o1M10616k.m10643a();
                C8663c c8663cM10638b = m10638b(c8642s0M10567a.f29473b);
                c8663cM10638b.m10645c();
                C8666d.m10631n((C8666d) c8663cM10638b.f29512c, c8660b);
                c8642s0M10567a.m10569c((C8666d) c8663cM10638b.m10643a());
                return c8594bM10706b2;
            }
            String strM10641e2 = m10641e(context, "com.google.android.tvlauncher");
            if (strM10641e2.isEmpty()) {
                hashSet.add(enumC8629M1);
            } else {
                c8711s2.m10705a("atv_tlvc", strM10641e2);
            }
            c8711s = new C8711s();
            uri = Uri.EMPTY;
            iM9125b = C7681v.m9125b(m10637a(context));
            if (iM9125b == 0) {
                uri = C8653Y.f29484b;
                uri2 = uri;
                packageManager = context.getPackageManager();
                authority = uri2.getAuthority();
                C8687k.m10670a(authority);
                if (packageManager.resolveContentProvider(authority, 0) == null) {
                    c8594bM10706b = c8711s.m10706b();
                } else {
                    cursorQuery = context.getContentResolver().query(uri2, null, null, null, null);
                    C8687k.m10670a(cursorQuery);
                    while (cursorQuery.moveToNext()) {
                        String string5 = cursorQuery.getString(0);
                        C8687k.m10670a(string5);
                        String string6 = cursorQuery.getString(1);
                        C8687k.m10670a(string6);
                        c8711s.m10705a(string5, string6);
                    }
                    cursorQuery.close();
                    c8594bM10706b = c8711s.m10706b();
                }
            } else {
                if (iM9125b != 1) {
                    uri = C8653Y.f29483a;
                } else if (iM9125b == 2) {
                    if (iM9125b != 3) {
                    }
                    c8594bM10706b = c8711s.m10706b();
                } else {
                    uri = C8653Y.f29484b;
                }
                uri2 = uri;
                packageManager = context.getPackageManager();
                authority = uri2.getAuthority();
                C8687k.m10670a(authority);
                if (packageManager.resolveContentProvider(authority, 0) == null) {
                    c8594bM10706b = c8711s.m10706b();
                } else {
                    cursorQuery = context.getContentResolver().query(uri2, null, null, null, null);
                    C8687k.m10670a(cursorQuery);
                    while (cursorQuery.moveToNext()) {
                        String string7 = cursorQuery.getString(0);
                        C8687k.m10670a(string7);
                        String string8 = cursorQuery.getString(1);
                        C8687k.m10670a(string8);
                        c8711s.m10705a(string7, string8);
                    }
                    cursorQuery.close();
                    c8594bM10706b = c8711s.m10706b();
                }
            }
            AbstractC8717u abstractC8717uEntrySet2 = c8594bM10706b.entrySet();
            c8711s2.m10707c(((C8729y) abstractC8717uEntrySet2).f29600f + c8711s2.f29565b);
            while (r0.hasNext()) {
                c8711s2.m10705a(entry.getKey(), entry.getValue());
            }
        } catch (C8690l unused2) {
            hashSet.add(EnumC8629M1.SIGNAL_COLLECTION_ERROR_NULL_CONTENT_PROVIDER_DATA);
        }
        String strM10641e3 = m10641e(context, "com.google.android.tvrecommendations");
        if (strM10641e3.isEmpty()) {
            hashSet.add(enumC8629M1);
        } else {
            c8711s2.m10705a("atv_csvc", strM10641e3);
        }
        C8594B c8594bM10706b3 = c8711s2.m10706b();
        C8642S0 c8642s0M10567a2 = C8642S0.m10567a(context);
        C8635O1 c8635o1M10616k2 = C8660b.m10616k();
        c8635o1M10616k2.m10645c();
        C8660b.m10619n((C8660b) c8635o1M10616k2.f29512c, hashSet);
        C8660b c8660b2 = (C8660b) c8635o1M10616k2.m10643a();
        C8663c c8663cM10638b2 = m10638b(c8642s0M10567a2.f29473b);
        c8663cM10638b2.m10645c();
        C8666d.m10631n((C8666d) c8663cM10638b2.f29512c, c8660b2);
        c8642s0M10567a2.m10569c((C8666d) c8663cM10638b2.m10643a());
        return c8594bM10706b3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX INFO: renamed from: d */
    public static String m10640d() {
        String str;
        String str2 = Build.FINGERPRINT;
        if (TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str2.getClass();
            C8681i c8681i = new C8681i();
            c8681i.f29523c = 2;
            c8681i.f29524d = 0;
            c8681i.f29525e = Integer.MAX_VALUE;
            ArrayList arrayList = new ArrayList();
            while (c8681i.hasNext()) {
                arrayList.add((String) c8681i.next());
            }
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            if (listUnmodifiableList.size() == 3) {
                str = (String) listUnmodifiableList.get(0);
            } else {
                str = "";
            }
        }
        return C8672f.m10646c(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m10641e(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return Long.toString(Build.VERSION.SDK_INT >= 28 ? C2709a.m3434a(packageInfo) : packageInfo.versionCode);
            }
            return "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m10642f(Context context, String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
