package ru.zona.app.android.system;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import kotlin.Metadata;
import mobi.zona.R;
import p146I1.C2211q;
import p146I1.C2215u;
import p164J1.C2445a;
import p652k8.C15777G;
import p652k8.C15782L;
import ru.zona.app.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002Ê\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000f"}, m18688d2 = {"Lru/zona/app/android/system/ZonaMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "onNewToken", "", "token", "", "onMessageReceived", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "generateNotification", "title", "description", "channelId", "ru.zona:android_zonaRelease", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
public final class ZonaMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: d */
    public final void mo12127d(C15782L c15782l) {
        Bundle bundle = c15782l.f51225b;
        if (c15782l.f51226c == null && C15777G.m18594m(bundle)) {
            c15782l.f51226c = new C15782L.a(new C15777G(bundle));
        }
        C15782L.a aVar = c15782l.f51226c;
        if (aVar != null) {
            String str = aVar.f51227a;
            if (str == null) {
                str = "";
            }
            String str2 = aVar.f51228b;
            String str3 = str2 != null ? str2 : "";
            String str4 = aVar.f51229c;
            if (str4 == null) {
                str4 = "important_channel";
            }
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            PendingIntent activity = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(this, 0, intent, 67108864) : PendingIntent.getActivity(this, 0, intent, 134217728);
            C2211q c2211q = new C2211q(this, str4);
            c2211q.f7346u.icon = R.drawable.zona;
            c2211q.f7330e = C2211q.m2871b(str);
            c2211q.f7331f = C2211q.m2871b(str3);
            c2211q.f7335j = 0;
            c2211q.f7332g = activity;
            c2211q.m2873c(16, true);
            Notification notificationM2872a = c2211q.m2872a();
            if (C2445a.m3153a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
                new C2215u(this).m2900b(0, notificationM2872a);
            }
        }
    }
}
