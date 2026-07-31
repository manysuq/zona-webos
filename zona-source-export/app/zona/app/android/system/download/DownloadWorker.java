package ru.zona.app.android.system.download;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C7933b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import mobi.zona.R;
import org.mozilla.javascript.ES6Iterator;
import p146I1.C2211q;
import p146I1.C2215u;
import p164J1.C2445a;
import p355Tc.C5042j;
import p478aa.C7101e0;
import p478aa.C7106g;
import p589ha.C11865c;
import p589ha.ExecutorC11864b;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u00020\tH\u0097@b\u0010\b\u000b\u0012\f\b\f\u0012\b\b\fJ\u0004\b\b(\r¢\u0006\u0002\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000fH\u0003b\u0010\b\u000b\u0012\f\b\f\u0012\b\b\fJ\u0004\b\b(\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, m18688d2 = {"Lru/zona/app/android/system/download/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/annotation/SuppressLint;", ES6Iterator.VALUE_PROPERTY, "RestrictedApi", "workDataBuilder", "Landroidx/work/Data$Builder;", "createHttpClient", "Lio/ktor/client/HttpClient;", "showStopNotification", "", "showProgressNotification", "progress", "", "Companion", "ru.zona:android_zonaRelease", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
public final class DownloadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h */
    public static final List<String> f55981h = CollectionsKt.listOf((Object[]) new String[]{"file_uri", "package_name", "progress", "download_url"});

    /* JADX INFO: renamed from: g */
    public final Context f55982g;

    public DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f55982g = context;
    }

    /* JADX INFO: renamed from: e */
    public static final void m20353e(DownloadWorker downloadWorker, int i10) {
        Context context = downloadWorker.f55982g;
        C2211q c2211q = new C2211q(context, "download_channel");
        c2211q.f7330e = C2211q.m2871b("Загрузка");
        c2211q.f7331f = C2211q.m2871b("Идет загрузка приложения...");
        c2211q.f7346u.icon = R.drawable.ic_splash_logo;
        c2211q.m2873c(16, true);
        c2211q.f7347v = true;
        c2211q.f7335j = -1;
        C2215u c2215u = new C2215u(context);
        if (i10 >= 100) {
            c2215u.f7361b.cancel(null, 1);
            c2211q.f7331f = C2211q.m2871b("Загрузка успешно завершена");
            c2211q.f7338m = 0;
            c2211q.f7339n = 0;
            c2215u.m2900b(2, c2211q.m2872a());
            return;
        }
        c2211q.f7338m = 100;
        c2211q.f7339n = i10;
        c2211q.m2873c(2, true);
        if (C2445a.m3153a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        c2215u.m2900b(1, c2211q.m2872a());
    }

    /* JADX INFO: renamed from: f */
    public static final void m20354f(DownloadWorker downloadWorker) {
        Context context = downloadWorker.f55982g;
        C2211q c2211q = new C2211q(context, "download_channel");
        c2211q.f7331f = C2211q.m2871b("Загрузка отменена");
        c2211q.f7330e = C2211q.m2871b("Загрузка");
        c2211q.f7346u.icon = R.drawable.ic_splash_logo;
        c2211q.m2873c(16, true);
        c2211q.f7347v = true;
        c2211q.f7335j = -1;
        C2215u c2215u = new C2215u(context);
        c2211q.f7338m = 0;
        c2211q.f7339n = 0;
        c2215u.f7361b.cancel(null, 1);
        if (C2445a.m3153a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        c2215u.m2900b(3, c2211q.m2872a());
    }

    @Override // androidx.work.CoroutineWorker
    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: d */
    public final Object mo9870d(C7933b c7933b) {
        C11865c c11865c = C7101e0.f23142a;
        return C7106g.m8048f(ExecutorC11864b.f37309c, new C5042j(this, null), c7933b);
    }
}
