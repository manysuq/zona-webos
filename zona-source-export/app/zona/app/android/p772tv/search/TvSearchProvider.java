package ru.zona.app.android.p772tv.search;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Reflection;
import p055D0.C0941K;
import p107Fg.C1634b;
import p445Yc.C6568g;
import p445Yc.C6568g.c;
import p478aa.C7106g;
import p569g2.C11232c;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016JS\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0012J3\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001bH\u0016J=\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u001d\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u001eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, m18688d2 = {"Lru/zona/app/android/tv/search/TvSearchProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "tvSearchService", "Lru/zona/app/android/tv/search/TvSearchService;", "onCreate", "", "query", "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", "", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "delete", "", "p0", "p1", "p2", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "Landroid/content/ContentValues;", "update", "p3", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "ru.zona:android_zonaRelease", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
public final class TvSearchProvider extends ContentProvider {

    /* JADX INFO: renamed from: c */
    public static final C1634b f55983c;

    /* JADX INFO: renamed from: d */
    public static final String[] f55984d;

    /* JADX INFO: renamed from: b */
    public C6568g f55985b;

    static {
        Reflection.getOrCreateKotlinClass(TvSearchProvider.class).getSimpleName();
        f55983c = new C1634b();
        f55984d = new String[]{"_id", "suggest_text_1", "suggest_text_2", "suggest_result_card_image", "suggest_rating_score", "suggest_production_year", "suggest_duration", "suggest_intent_data"};
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri p10, String p11, String[] p12) {
        f55983c.mo2258d("delete(p0 = " + p10 + ", p1 = " + p11 + ", p3 = " + p12 + ")", new Object[0]);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri p10) {
        f55983c.mo2258d("getType(p0 = " + p10 + ")", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri p10, ContentValues p11) {
        f55983c.mo2258d("insert(p0 = " + p10 + ", p1 = " + p11 + ")", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        f55983c.mo2258d("onCreate()", new Object[0]);
        Application application = (Application) getContext();
        if (application == null) {
            return true;
        }
        this.f55985b = new C6568g(application);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x003b  */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        String str;
        StringBuilder sb2 = new StringBuilder("query(uri: ");
        sb2.append(uri);
        sb2.append(", projection: ");
        sb2.append(projection);
        sb2.append(", selection: ");
        sb2.append(selection);
        sb2.append(", selectionArgs: ");
        sb2.append(selectionArgs);
        C1634b c1634b = f55983c;
        c1634b.mo2258d(C11232c.m13228a(", sortOrder: ", sortOrder, ")", sb2), new Object[0]);
        if (selectionArgs != null) {
            try {
                str = selectionArgs[0];
                if (str == null) {
                    str = "";
                }
            } catch (Exception unused) {
                c1634b.getClass();
                return null;
            }
        } else {
            str = "";
        }
        c1634b.mo2258d("query = ".concat(str), new Object[0]);
        MatrixCursor matrixCursor = new MatrixCursor(f55984d);
        C6568g c6568g = this.f55985b;
        if (c6568g == null) {
            c1634b.mo2258d("tvSearchService is null", new Object[0]);
            return null;
        }
        c6568g.getClass();
        C6568g.f21543j.mo2258d(C0941K.m1458b("search(query: ", str, ")"), new Object[0]);
        Iterator it = ((List) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, c6568g.new c(str, null))).iterator();
        while (it.hasNext()) {
            matrixCursor.addRow((String[]) it.next());
        }
        c1634b.mo2258d("return cursor = " + matrixCursor, new Object[0]);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri p10, ContentValues p11, String p12, String[] p13) {
        f55983c.mo2258d("update(p0 = " + p10 + ", p1 = " + p11 + ", p3 = " + p12 + ", p3 = " + p13 + ")", new Object[0]);
        return 0;
    }
}
