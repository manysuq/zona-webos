package ru.zona.app.pip;

import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p055D0.C0944L0;
import p107Fg.C1634b;
import p247Nc.C3716u;
import p247Nc.C3717v;
import p361U0.C5225q;
import p361U0.InterfaceC5224p;
import p393Ve.C5691p;
import p478aa.InterfaceC7042C0;
import p478aa.InterfaceC7059L;
import p507ce.C8438a;
import p507ce.C8439b;
import p507ce.C8440c;
import p507ce.C8441d;
import p507ce.C8451n;
import p507ce.EnumC8448k;
import p507ce.RunnableC8444g;
import p513d.ActivityC10189r;
import p524da.C10407W;
import p524da.C10427i;
import p524da.C10454v0;
import p524da.C10456w0;
import p843wd.C19021e;
import ru.zona.app.pip.C18005b;

/* JADX INFO: renamed from: ru.zona.app.pip.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPicInPicService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicInPicService.kt\nru/zona/app/pip/PicInPicService\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n278#2,3:230\n1#3:233\n*S KotlinDebug\n*F\n+ 1 PicInPicService.kt\nru/zona/app/pip/PicInPicService\n*L\n211#1:230,3\n*E\n"})
public final class C18005b {

    /* JADX INFO: renamed from: e */
    public static final C1634b f55989e;

    /* JADX INFO: renamed from: f */
    public static Function0<Unit> f55990f;

    /* JADX INFO: renamed from: g */
    public static Function0<Unit> f55991g;

    /* JADX INFO: renamed from: h */
    public static Function0<Unit> f55992h;

    /* JADX INFO: renamed from: i */
    public static Function0<Unit> f55993i;

    /* JADX INFO: renamed from: a */
    public final Context f55994a;

    /* JADX INFO: renamed from: b */
    public final C19021e f55995b;

    /* JADX INFO: renamed from: c */
    public final C10454v0 f55996c = C10456w0.m12580a(null);

    /* JADX INFO: renamed from: d */
    public RunnableC8444g f55997d;

    /* JADX INFO: renamed from: ru.zona.app.pip.b$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static ActivityC10189r m20361a(Context context) {
            while (context instanceof ContextWrapper) {
                try {
                    if (context instanceof ActivityC10189r) {
                        return (ActivityC10189r) context;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } catch (Exception unused) {
                    C18005b.f55989e.getClass();
                    return null;
                }
            }
            C18005b.f55989e.mo2257c("Picture in picture should be called in the context of an Activity", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: ru.zona.app.pip.b$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final boolean f55998a;

        /* JADX INFO: renamed from: b */
        public final boolean f55999b;

        /* JADX INFO: renamed from: c */
        public final boolean f56000c;

        /* JADX INFO: renamed from: d */
        public final boolean f56001d;

        public b(boolean z10, boolean z11, boolean z12, boolean z13) {
            this.f55998a = z10;
            this.f55999b = z11;
            this.f56000c = z12;
            this.f56001d = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f55998a == bVar.f55998a && this.f55999b == bVar.f55999b && this.f56000c == bVar.f56000c && this.f56001d == bVar.f56001d;
        }

        public final int hashCode() {
            return ((((((this.f55998a ? 1231 : 1237) * 31) + (this.f55999b ? 1231 : 1237)) * 31) + (this.f56000c ? 1231 : 1237)) * 31) + (this.f56001d ? 1231 : 1237);
        }

        public final String toString() {
            return "PiPState(isPlaying=" + this.f55998a + ", isSerial=" + this.f55999b + ", hasNext=" + this.f56000c + ", hasPrevious=" + this.f56001d + ")";
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C18005b.class).getSimpleName();
        f55989e = new C1634b();
        int i10 = 0;
        f55990f = new C8438a(i10);
        f55991g = new C8439b(i10);
        f55992h = new C8440c(i10);
        f55993i = new C8441d(i10);
    }

    public C18005b(Context context, C19021e c19021e, InterfaceC7059L interfaceC7059L) {
        this.f55994a = context;
        this.f55995b = c19021e;
        f55989e.mo2258d("init", new Object[0]);
        int i10 = 1;
        f55990f = new C3716u(this, i10);
        f55991g = new C3717v(this, i10);
        f55992h = new Function0() { // from class: ce.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C18005b c18005b = this.f28940b;
                Context context2 = c18005b.f55994a;
                C19021e c19021e2 = c18005b.f55995b;
                C1634b c1634b = C18005b.f55989e;
                c1634b.mo2258d("onPrevious(context = " + context2 + ")", new Object[0]);
                C18005b.b bVar = (C18005b.b) c18005b.f55996c.getValue();
                if (bVar == null || !bVar.f56001d) {
                    c1634b.mo2258d("has not previous", new Object[0]);
                } else {
                    c19021e2.mo21301I();
                    if (!c19021e2.f59357c.mo21311U()) {
                        C18005b.m20359e(context2);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        f55993i = new Function0() { // from class: ce.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C18005b c18005b = this.f28941b;
                Context context2 = c18005b.f55994a;
                C1634b c1634b = C18005b.f55989e;
                c1634b.mo2258d("enterPictureInPictureMode(context = " + context2 + ")", new Object[0]);
                C18005b.b bVar = (C18005b.b) c18005b.f55996c.getValue();
                if (bVar != null) {
                    ActivityC10189r activityC10189rM20361a = C18005b.a.m20361a(context2);
                    if (activityC10189rM20361a != null) {
                        try {
                            C18005b.m20356b(context2, bVar, activityC10189rM20361a);
                        } catch (Exception unused) {
                            c1634b.getClass();
                        }
                    }
                } else {
                    c1634b.mo2258d("state is null", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        };
        C10427i.m12549o(new C10407W(c19021e.f59357c.mo21316a(), new C18004a(this, null)), interfaceC7059L);
        InterfaceC7042C0 interfaceC7042C0 = (InterfaceC7042C0) interfaceC7059L.getCoroutineContext().get(InterfaceC7042C0.a.f23072b);
        if (interfaceC7042C0 != null) {
            interfaceC7042C0.mo7931M(new C5691p(this, 1));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Unit m20355a(Context context, b bVar, InterfaceC5224p interfaceC5224p, ActivityC10189r activityC10189r) {
        activityC10189r.setPictureInPictureParams(m20360f(context, bVar, interfaceC5224p).build());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m20356b(Context context, b bVar, ActivityC10189r activityC10189r) {
        activityC10189r.enterPictureInPictureMode(m20360f(context, bVar, null).build());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m20357c(C18005b c18005b, ActivityC10189r activityC10189r) {
        activityC10189r.setPictureInPictureParams(m20360f(c18005b.f55994a, null, null).build());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m20358d(Context context, b bVar, ActivityC10189r activityC10189r) {
        activityC10189r.enterPictureInPictureMode(m20360f(context, bVar, null).build());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m20359e(Context context) {
        C1634b c1634b = f55989e;
        c1634b.mo2258d("exitPictureInPictureMode(context = " + context + ")", new Object[0]);
        ActivityC10189r activityC10189rM20361a = a.m20361a(context);
        if (activityC10189rM20361a != null) {
            try {
                Intent intent = new Intent(context, activityC10189rM20361a.getClass());
                intent.setFlags(131072);
                context.startActivity(intent);
                Unit unit = Unit.INSTANCE;
            } catch (Exception unused) {
                c1634b.getClass();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static PictureInPictureParams.Builder m20360f(Context context, b bVar, InterfaceC5224p interfaceC5224p) {
        f55989e.mo2258d("getBuilder(context = " + context + ", state: " + bVar + ")", new Object[0]);
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAutoEnterEnabled(bVar != null ? bVar.f55998a : false);
        }
        if (interfaceC5224p != null) {
            RectF rectFM1462c = C0944L0.m1462c(C5225q.m5677b(interfaceC5224p));
            Rect rect = new Rect();
            rectFM1462c.roundOut(rect);
            builder.setSourceRectHint(rect);
        }
        if (bVar != null) {
            RemoteAction[] remoteActionArr = new RemoteAction[1];
            remoteActionArr[0] = bVar.f55998a ? C8451n.m10339a(EnumC8448k.ACTION_PAUSE, context, true) : C8451n.m10339a(EnumC8448k.ACTION_PLAY, context, true);
            List<RemoteAction> listMutableListOf = CollectionsKt.mutableListOf(remoteActionArr);
            if (bVar.f55999b) {
                listMutableListOf.add(0, C8451n.m10339a(EnumC8448k.ACTION_PREVIOUS, context, bVar.f56001d));
                listMutableListOf.add(C8451n.m10339a(EnumC8448k.ACTION_NEXT, context, bVar.f56000c));
            }
            builder.setActions(listMutableListOf);
        }
        return builder;
    }
}
