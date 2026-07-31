package ru.zona.app.pip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.mozilla.javascript.ES6Iterator;
import p092F1.C1473c;
import p107Fg.C1634b;
import p507ce.EnumC8448k;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017b\f\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u00104Ê\u0001\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\r"}, m18688d2 = {"Lru/zona/app/pip/PlayerActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Landroidx/annotation/RequiresApi;", ES6Iterator.VALUE_PROPERTY, "Companion", "ru.zona:common_release", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
public final class PlayerActionReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final C1634b f55986a;

    static {
        Reflection.getOrCreateKotlinClass(PlayerActionReceiver.class).getSimpleName();
        f55986a = new C1634b();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1634b c1634b = f55986a;
        c1634b.mo2258d("onReceive(context = " + context + ", intent = " + intent, new Object[0]);
        c1634b.mo2258d(C1473c.m2035a("intent?.action = ", intent != null ? intent.getAction() : null), new Object[0]);
        String action = intent != null ? intent.getAction() : null;
        EnumC8448k enumC8448k = EnumC8448k.ACTION_PAUSE;
        if (Intrinsics.areEqual(action, "player.action.PAUSE") || Intrinsics.areEqual(action, "player.action.PLAY")) {
            C18005b.f55990f.invoke();
        } else if (Intrinsics.areEqual(action, "player.action.NEXT")) {
            C18005b.f55991g.invoke();
        } else if (Intrinsics.areEqual(action, "player.action.PREVIOUS")) {
            C18005b.f55992h.invoke();
        }
    }
}
