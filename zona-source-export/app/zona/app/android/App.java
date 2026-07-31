package ru.zona.app.android;

import ad.InterfaceC7242f;
import ae.C7305a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import be.C8127i;
import be.C8128j;
import be.C8129k;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.uuid.Uuid;
import mg.C17058u;
import mg.InterfaceC17049l;
import mobi.zona.utils.CppUtil;
import org.mozilla.javascript.ES6Iterator;
import p011Aa.C0113z;
import p017Ag.C0168z;
import p034Bf.C0449b;
import p035Bg.C0457h;
import p035Bg.C0465p;
import p035Bg.C0467r;
import p047Ca.C0697e;
import p052Cf.C0788b;
import p070Df.C1182b;
import p092F1.C1473c;
import p107Fg.C1634b;
import p107Fg.C1637e;
import p124Gf.C1873a;
import p124Gf.C1883k;
import p124Gf.C1889q;
import p125Gg.C1915w;
import p125Gg.C1917y;
import p125Gg.C1918z;
import p125Gg.EnumC1896d;
import p125Gg.EnumC1908p;
import p125Gg.InterfaceC1905m;
import p161Ig.C2379d;
import p179Jg.C2622a;
import p179Jg.C2642u;
import p197Kg.AbstractC3039f;
import p197Kg.C3043j;
import p197Kg.C3045l;
import p197Kg.C3046m;
import p197Kg.C3047n;
import p197Kg.InterfaceC3049p;
import p215Lg.C3381a;
import p215Lg.C3383c;
import p229Mc.C3531b;
import p229Mc.C3534e;
import p229Mc.C3535f;
import p229Mc.C3537h;
import p233Mg.C3578p;
import p265Oc.C3928a;
import p269Og.AbstractC3981Z;
import p269Og.AbstractC4005l0;
import p269Og.C3958B;
import p269Og.C3973Q;
import p269Og.C3982a;
import p269Og.C3984b;
import p269Og.C3989d0;
import p269Og.C3990e;
import p269Og.C3992f;
import p269Og.C3993f0;
import p301Qc.C4582a;
import p301Qc.C4583b;
import p319Rc.C4729E;
import p319Rc.C4736L;
import p319Rc.C4740d;
import p319Rc.C4746j;
import p319Rc.C4747k;
import p319Rc.C4748l;
import p319Rc.C4749m;
import p319Rc.C4757u;
import p319Rc.C4759w;
import p319Rc.C4760x;
import p319Rc.C4761y;
import p319Rc.C4762z;
import p337Sc.C4900f;
import p355Tc.C5033a;
import p374Ud.C5419l;
import p374Ud.C5429v;
import p391Vc.C5668a;
import p391Vc.C5669b;
import p409Wc.C5912c;
import p410Wd.C5941z;
import p428Xd.InterfaceC6311a;
import p431Xg.C6365d;
import p431Xg.C6368g;
import p431Xg.C6378q;
import p431Xg.C6387z;
import p431Xg.InterfaceC6379r;
import p446Yd.C6569a;
import p449Yg.C6614h;
import p449Yg.C6617k;
import p463Zc.C6802a;
import p464Zd.C6809g;
import p464Zd.C6810h;
import p467Zg.C6844b;
import p478aa.C7061M;
import p478aa.C7081W0;
import p478aa.C7083X0;
import p478aa.C7101e0;
import p478aa.C7106g;
import p480ah.InterfaceC7360f;
import p488b4.C8060q;
import p558fa.C11095d;
import p589ha.C11865c;
import p589ha.ExecutorC11864b;
import p622j.AbstractC15282j;
import p689mb.C16972W;
import p689mb.C16973X;
import p734p9.C17564c;
import p738q.C17679s0;
import p770rf.C17934C;
import p770rf.C17942K;
import p770rf.C17957a;
import p770rf.C17965e;
import p770rf.C17975m;
import p770rf.InterfaceC17977o;
import p770rf.InterfaceC17978p;
import p795t9.C18305a;
import p839w9.C18958e;
import p845wg.C19140H5;
import p878yd.C20482y;
import ru.zona.app.android.App;
import ru.zona.app.android.data.cache.ZonaDataBase;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u000201H\u0016J\u0016\u00105\u001a\u000201H\u0003b\f\b6\u0012\b\b7\u0012\u0004\b\u0003\u00104J\b\u00108\u001a\u000201H\u0002J\b\u00109\u001a\u000201H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\u0010\b<\u0012\f\b7\u0012\b\b\fJ\u0004\b\b(=Ê\u0001\f\b>\u0012\b\b?\u0012\u0004\b\u0003\u0010\u0000¨\u0006;"}, m18688d2 = {"Lru/zona/app/android/App;", "Landroid/app/Application;", "<init>", "()V", "extensions", "Lru/zona/app/extension/Extensions;", "getExtensions", "()Lru/zona/app/extension/Extensions;", "logDumper", "Lru/zona/app/log/ILogDumper;", "getLogDumper", "()Lru/zona/app/log/ILogDumper;", "setLogDumper", "(Lru/zona/app/log/ILogDumper;)V", "graph", "Lru/zona/app/di/AndroidAppGraph;", "getGraph", "()Lru/zona/app/di/AndroidAppGraph;", "setGraph", "(Lru/zona/app/di/AndroidAppGraph;)V", "servicesInitializer", "Lru/zona/app/init/IServicesInitializer;", "getServicesInitializer", "()Lru/zona/app/init/IServicesInitializer;", "setServicesInitializer", "(Lru/zona/app/init/IServicesInitializer;)V", "screenOrientationService", "Lru/zona/app/android/system/display/ScreenOrientationService;", "getScreenOrientationService", "()Lru/zona/app/android/system/display/ScreenOrientationService;", "setScreenOrientationService", "(Lru/zona/app/android/system/display/ScreenOrientationService;)V", "updateService", "Lru/zona/app/services/update/IUpdateService;", "getUpdateService", "()Lru/zona/app/services/update/IUpdateService;", "setUpdateService", "(Lru/zona/app/services/update/IUpdateService;)V", "installApkPermissionRequesterProxy", "Lru/zona/app/permission/PermissionRequesterProxy;", "getInstallApkPermissionRequesterProxy", "()Lru/zona/app/permission/PermissionRequesterProxy;", "installApkPermissionState", "Lru/zona/app/permission/PermissionState;", "getInstallApkPermissionState", "()Lru/zona/app/permission/PermissionState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "createNotificationChannels", "Landroidx/annotation/RequiresApi;", ES6Iterator.VALUE_PROPERTY, "activateYandexAnalytics", "createHomeScreenChannelService", "Companion", "ru.zona:android_zonaRelease", "Landroid/annotation/SuppressLint;", "ServiceCast", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
@SuppressLint({"ServiceCast"})
public final class App extends Application {

    /* JADX INFO: renamed from: k */
    public static final C1634b f55952k;

    /* JADX INFO: renamed from: b */
    public final C6569a f55953b;

    /* JADX INFO: renamed from: c */
    public C7305a f55954c;

    /* JADX INFO: renamed from: d */
    public InterfaceC6311a.a f55955d;

    /* JADX INFO: renamed from: e */
    public C6810h f55956e;

    /* JADX INFO: renamed from: f */
    public C4900f f55957f;

    /* JADX INFO: renamed from: g */
    public C1883k f55958g;

    /* JADX INFO: renamed from: h */
    public final C8128j f55959h;

    /* JADX INFO: renamed from: i */
    public final C8129k f55960i;

    /* JADX INFO: renamed from: j */
    public final C11095d f55961j;

    /* JADX INFO: renamed from: ru.zona.app.android.App$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.android.App$onCreate$2", m18778f = "App.kt", m18779i = {}, m18780l = {370}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {-1}, m18784s = {}, m18785v = 2)
    public static final class C17997a extends SuspendLambda implements Function1<Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: j */
        public int f55962j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C17997a(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((C17997a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55962j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            C16972W c16972w = (C16972W) C19140H5.f59854f0.getValue();
            this.f55962j = 1;
            Object objM19462a = C16973X.m19462a(c16972w, this);
            return objM19462a == coroutine_suspended ? coroutine_suspended : objM19462a;
        }
    }

    /* JADX INFO: renamed from: ru.zona.app.android.App$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class C17998b<T> implements InterfaceC1905m {
        public C17998b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p125Gg.InterfaceC1905m
        /* JADX INFO: renamed from: a */
        public final Object mo817a(ContinuationImpl continuationImpl) {
            C18003a c18003a;
            if (continuationImpl instanceof C18003a) {
                c18003a = (C18003a) continuationImpl;
                int i10 = c18003a.f55977l;
                if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                    c18003a.f55977l = i10 - IntCompanionObject.MIN_VALUE;
                } else {
                    c18003a = new C18003a(this, continuationImpl);
                }
            } else {
                c18003a = new C18003a(this, continuationImpl);
            }
            Object obj = c18003a.f55975j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = c18003a.f55977l;
            App app = App.this;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                C6810h c6810h = app.f55956e;
                if (c6810h == null) {
                    c6810h = null;
                }
                if (((InterfaceC7242f.a) c6810h.f22411n.f55911r.f23335d.f32389b.getValue()).f23387a != EnumC1908p.f6449d) {
                    c18003a.f55977l = 1;
                    if (C1637e.m2263a(App.f55952k, "Metadata is not loaded yet", new Object[0], c18003a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C6810h c6810h2 = app.f55956e;
            return ((InterfaceC7242f.a) (c6810h2 != null ? c6810h2 : null).f22411n.f55911r.f23335d.f32389b.getValue()).f23388b.f11762a.f11774B;
        }
    }

    /* JADX INFO: renamed from: ru.zona.app.android.App$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class C17999c implements InterfaceC6379r {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C17957a f55964a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1918z<Boolean> f55965b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ App f55966c;

        public C17999c(C17957a c17957a, C1918z c1918z, App app) {
            this.f55964a = c17957a;
            this.f55965b = c1918z;
            this.f55966c = app;
        }

        @Override // p431Xg.InterfaceC6379r
        /* JADX INFO: renamed from: a */
        public final String mo7143a() {
            return C4583b.m5194b();
        }

        @Override // p431Xg.InterfaceC6379r
        /* JADX INFO: renamed from: b */
        public final String mo7144b(long j10, String str) {
            this.f55964a.m20325b(j10);
            boolean zBooleanValue = this.f55965b.f6477a.invoke().booleanValue();
            App app = this.f55966c;
            return zBooleanValue ? CppUtil.INSTANCE.checkTimeNative2(app.getApplicationContext(), j10, str) : CppUtil.INSTANCE.checkTimeNative(app.getApplicationContext(), j10, str);
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(App.class).getSimpleName();
        f55952k = new C1634b();
    }

    public App() {
        System.loadLibrary("zona");
        C0113z c0113z = C0168z.f568a;
        if (C3992f.f13116a.compareAndSet(false, true)) {
            C0697e c0697e = new C0697e();
            c0697e.mo625a(Reflection.getOrCreateKotlinClass(AbstractC4005l0.class), new C3990e());
            c0697e.mo628d(Reflection.getOrCreateKotlinClass(AbstractC4005l0.class), Reflection.getOrCreateKotlinClass(C3958B.class), C3958B.Companion.serializer());
            c0697e.mo628d(Reflection.getOrCreateKotlinClass(AbstractC4005l0.class), Reflection.getOrCreateKotlinClass(C3973Q.class), C3973Q.Companion.serializer());
            C0168z.m227a(c0697e.m1229f());
        }
        if (C3984b.f13100a.compareAndSet(false, true)) {
            C0697e c0697e2 = new C0697e();
            c0697e2.mo625a(Reflection.getOrCreateKotlinClass(AbstractC3981Z.class), new C3982a());
            c0697e2.mo628d(Reflection.getOrCreateKotlinClass(AbstractC3981Z.class), Reflection.getOrCreateKotlinClass(C3989d0.class), C3989d0.Companion.serializer());
            c0697e2.mo628d(Reflection.getOrCreateKotlinClass(AbstractC3981Z.class), Reflection.getOrCreateKotlinClass(C3993f0.class), C3993f0.Companion.serializer());
            C0168z.m227a(c0697e2.m1229f());
        }
        if (C3047n.f9961a.compareAndSet(false, true)) {
            C0697e c0697e3 = new C0697e();
            c0697e3.mo625a(Reflection.getOrCreateKotlinClass(InterfaceC3049p.class), new C3045l());
            c0697e3.mo625a(Reflection.getOrCreateKotlinClass(AbstractC3039f.class), new C3046m(0));
            c0697e3.mo628d(Reflection.getOrCreateKotlinClass(AbstractC3039f.class), Reflection.getOrCreateKotlinClass(C3043j.class), C3043j.Companion.serializer());
            c0697e3.mo628d(Reflection.getOrCreateKotlinClass(InterfaceC3049p.class), Reflection.getOrCreateKotlinClass(C3381a.class), C3381a.Companion.serializer());
            c0697e3.mo628d(Reflection.getOrCreateKotlinClass(AbstractC3039f.class), Reflection.getOrCreateKotlinClass(C3383c.class), C3383c.Companion.serializer());
            C0168z.m227a(c0697e3.m1229f());
        }
        this.f55953b = new C6569a();
        this.f55954c = C7305a.f23515a;
        C8127i c8127i = C8127i.f28046a;
        C8128j c8128j = new C8128j();
        c8128j.f28049a = new AtomicReference<>(c8127i);
        this.f55959h = c8128j;
        this.f55960i = new C8129k();
        C7081W0 c7081w0M8017a = C7083X0.m8017a();
        C11865c c11865c = C7101e0.f23142a;
        this.f55961j = C7061M.m7996a(CoroutineContext.Element.DefaultImpls.plus(c7081w0M8017a, ExecutorC11864b.f37309c));
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override // android.app.Application
    public final void onCreate() {
        String strM5339a;
        EnumC1896d enumC1896d;
        super.onCreate();
        this.f55955d = new InterfaceC6311a.a(this, new C2379d(new C17934C()));
        C1634b c1634b = C4747k.f15926a;
        Context applicationContext = getApplicationContext();
        try {
            Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
        } catch (Exception unused) {
            C4747k.f15926a.getClass();
        }
        try {
            strM5339a = Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
        } catch (Exception unused2) {
            C4747k.f15926a.getClass();
            strM5339a = null;
        }
        if (strM5339a == null) {
            strM5339a = C4747k.a.m5339a(applicationContext);
        }
        int i10 = 0;
        String string = UUID.fromString("00000000-0000-0000-" + strM5339a.substring(0, 4) + "-" + strM5339a.substring(4)).toString();
        C4747k.a.m5339a(applicationContext);
        Context applicationContext2 = getApplicationContext();
        if (((UiModeManager) applicationContext2.getSystemService("uimode")).getCurrentModeType() == 4) {
            enumC1896d = EnumC1896d.Tv;
        } else {
            enumC1896d = (applicationContext2.getResources().getConfiguration().screenLayout & 15) >= 3 ? EnumC1896d.Tablet : EnumC1896d.Phone;
        }
        EnumC1896d enumC1896d2 = enumC1896d;
        C2622a c2622a = new C2622a("zona", "3.0.65", Build.MANUFACTURER, Build.MODEL, string, enumC1896d2.f6445b, C1473c.m2035a("Android ", Build.VERSION.RELEASE), Uuid.INSTANCE.random().toString());
        C1634b c1634b2 = f55952k;
        C0113z c0113z = C0168z.f568a;
        c1634b2.mo2260f("Start application, deviceType:" + enumC1896d2 + ", appInfo:" + C0168z.f568a.mo162b(c2622a, C2622a.Companion.serializer()), new Object[0]);
        C6802a c6802a = new C6802a();
        registerActivityLifecycleCallbacks(c6802a);
        char[] charArray = "784d27e5-e722-2514-5a0b-3e8ace85bc59".toCharArray();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = charArray.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                char c10 = charArray[length];
                if (c10 == '-') {
                    arrayList.add(Integer.valueOf(length));
                } else {
                    sb2.append(Integer.toHexString(15 - Integer.parseInt(String.valueOf(c10), CharsKt.checkRadix(16))));
                }
                if (i11 < 0) {
                    break;
                } else {
                    length = i11;
                }
            }
        }
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i12 = size - 1;
                sb2.insert(((Number) arrayList.get(size)).intValue(), '-');
                if (i12 < 0) {
                    break;
                } else {
                    size = i12;
                }
            }
        }
        AppMetrica.activate(getApplicationContext(), AppMetricaConfig.newConfigBuilder(sb2.toString()).build());
        AppMetrica.enableActivityAutoTracking(this);
        AbstractC15282j.c cVar = AbstractC15282j.f49244b;
        int i13 = C17679s0.f55095a;
        C17058u c17058u = new C17058u(getApplicationContext());
        this.f55954c = C7305a.f23515a;
        C17957a c17957a = new C17957a();
        C4582a c4582a = new C4582a(getApplicationContext().getSharedPreferences("streamStorage", 0));
        final C6617k c6617k = new C6617k();
        C3531b c3531b = new C3531b(c6617k, i10);
        C1918z c1918z = new C1918z(new Function0() { // from class: Mc.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                App app = this.f11612b;
                C1634b c1634b3 = App.f55952k;
                try {
                    C6810h c6810h = app.f55956e;
                    if (c6810h == null) {
                        c6810h = null;
                    }
                    z10 = true;
                    if (((InterfaceC7242f.a) c6810h.f22411n.f55911r.f23335d.f32389b.getValue()).f23387a == EnumC1908p.f6449d) {
                        C6810h c6810h2 = app.f55956e;
                        if (((InterfaceC7242f.a) (c6810h2 != null ? c6810h2 : null).f22411n.f55911r.f23335d.f32389b.getValue()).f23388b.f11762a.f11804z != 1) {
                            z10 = false;
                        }
                    }
                } catch (Exception unused3) {
                }
                return Boolean.valueOf(z10);
            }
        });
        C17999c c17999c = new C17999c(c17957a, c1918z, this);
        Context applicationContext3 = getApplicationContext();
        this.f55953b.getClass();
        C6368g c6368g = new C6368g(c17999c, new C6387z(applicationContext3, new Function1() { // from class: Mc.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Boolean) obj).getClass();
                C1634b c1634b3 = App.f55952k;
                return C6614h.m7413a(false, false, c6617k);
            }
        }), c4582a, new C6378q(), c3531b, c6617k, new C6365d(), new C6844b(getApplicationContext()));
        ZonaDataBase zonaDataBase = (ZonaDataBase) C8060q.m10030a(getApplicationContext(), ZonaDataBase.class, "zonadb").m10050b();
        C5429v c5429v = new C5429v(zonaDataBase.mo20352x(), new C3534e());
        C5419l c5419l = new C5419l(zonaDataBase.mo20351w(), new C3535f());
        C6569a c6569a = this.f55953b;
        Context applicationContext4 = getApplicationContext();
        C3928a c3928a = new C3928a(applicationContext4, new C4761y(applicationContext4));
        c6569a.getClass();
        C17564c c17564cM6814a = C5941z.m6814a(C18305a.f56977a, new C4749m(C18958e.m21289a("client_time plugin", new C4748l(new C4740d(getApplicationContext(), new C17998b(), c6368g), c1918z)), getApplicationContext()));
        C4736L c4736l = new C4736L(getApplicationContext().getSharedPreferences("test", 0));
        C17975m c17975m = new C17975m(getApplicationContext());
        C0788b c0788b = new C0788b(new C4762z(getApplicationContext().getSharedPreferences("feature_indicators", 0)));
        C4729E c4729e = new C4729E(getApplicationContext());
        C0449b c0449b = new C0449b(enumC1896d2, new C4762z(getApplicationContext().getSharedPreferences("application_type", 0)));
        C1182b c1182b = new C1182b(new C4762z(getApplicationContext().getSharedPreferences("zona_local_settings", 0)));
        C5033a c5033a = new C5033a(this);
        SharedPreferences sharedPreferences = getSharedPreferences("settings", 0);
        C1918z c1918z2 = new C1918z(new Function0() { // from class: Mc.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C6810h c6810h = this.f11614b.f55956e;
                if (c6810h == null) {
                    c6810h = null;
                }
                return ((InterfaceC7360f.a) c6810h.f22411n.f55916w.f34818d.f35621k.getValue()).f23598b;
            }
        });
        C4760x c4760x = new C4760x(this);
        C4759w.f15941a.getClass();
        C20482y c20482y = new C20482y(this, enumC1896d2, c1918z2, c4760x, new C0465p(C0457h.f1834a, new C0467r(new C4757u(this, null))));
        C6569a c6569a2 = this.f55953b;
        List listSplit$default = StringsKt__StringsKt.split$default("1,2,3,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53", new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null);
        InterfaceC6311a.a aVar = this.f55955d;
        if (aVar == null) {
            aVar = null;
        }
        InterfaceC17049l interfaceC17049lMo7118e = aVar.mo7118e();
        InterfaceC6311a.a aVar2 = this.f55955d;
        if (aVar2 == null) {
            aVar2 = null;
        }
        InterfaceC17978p interfaceC17978pMo7117d = aVar2.mo7117d();
        C1917y c1917y = new C1917y(new File(getCacheDir(), "metadataCache.json"));
        C1917y c1917y2 = new C1917y(new File(getCacheDir(), "collectionCache.json"));
        C1915w c1915w = new C1915w(sharedPreferences, "config");
        C7305a c7305a = this.f55954c;
        C17965e c17965e = new C17965e(getApplicationContext());
        C5668a c5668a = new C5668a();
        C5669b c5669b = new C5669b();
        c5669b.f37484a = c5668a;
        C6810h c6810h = new C6810h(c2622a, listSplit$default, enumC1896d2, c6368g, c17564cM6814a, interfaceC17049lMo7118e, c17058u, interfaceC17978pMo7117d, c3928a, c5429v, c5419l, c4736l, c17975m, c0788b, c4729e, c0449b, c1182b, c17957a, c5033a, c1917y, c1917y2, c1915w, c7305a, new C3537h(this), c6802a, c17965e, c5669b, new C4746j(4), c20482y, new C17997a(1, null));
        c6569a2.getClass();
        this.f55956e = c6810h;
        C7106g.m8045c(c6810h.f22406i, null, null, new C6809g(c6810h, new C3578p(getPackageManager().hasSystemFeature("android.software.leanback"), getPackageManager().hasSystemFeature("android.hardware.camera"), getPackageManager().hasSystemFeature("android.hardware.touchscreen"), getPackageManager().hasSystemFeature("android.hardware.location.gps")), null), 3);
        Context applicationContext5 = getApplicationContext();
        C6810h c6810h2 = this.f55956e;
        C17564c c17564c = (c6810h2 != null ? c6810h2 : null).f22401d;
        C1889q c1889q = new C1889q((c6810h2 != null ? c6810h2 : null).f22401d, (c6810h2 != null ? c6810h2 : null).f22410m.f55874a.f55844f);
        C8129k c8129k = this.f55960i;
        C8128j c8128j = this.f55959h;
        if (c6810h2 == null) {
            c6810h2 = null;
        }
        InterfaceC17977o interfaceC17977o = c6810h2.f22411n.f55891F;
        InterfaceC6311a.a aVar3 = this.f55955d;
        if (aVar3 == null) {
            aVar3 = null;
        }
        InterfaceC17049l interfaceC17049lMo7118e2 = aVar3.mo7118e();
        C6810h c6810h3 = this.f55956e;
        if (c6810h3 == null) {
            c6810h3 = null;
        }
        this.f55958g = new C1883k(applicationContext5, c17564c, c1889q, c8129k, c8128j, interfaceC17977o, interfaceC17049lMo7118e2, new C1873a(c6810h3.f22411n.f55911r.f23335d));
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("important_channel", "Важное", 4);
            NotificationChannel notificationChannel2 = new NotificationChannel("new_version_channel", "Выход новой версии приложения", 4);
            NotificationChannel notificationChannel3 = new NotificationChannel("download_channel", "File download", 4);
            Object systemService = getSystemService("notification");
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel2);
            }
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel3);
            }
        }
        C6810h c6810h4 = this.f55956e;
        if (c6810h4 == null) {
            c6810h4 = null;
        }
        if (c6810h4.f22399b == EnumC1896d.Tv) {
            Context applicationContext6 = getApplicationContext();
            C6810h c6810h5 = this.f55956e;
            if (c6810h5 == null) {
                c6810h5 = null;
            }
            C17942K c17942k = c6810h5.f22411n.f55908o;
            InterfaceC6311a.a aVar4 = this.f55955d;
            if (aVar4 == null) {
                aVar4 = null;
            }
            InterfaceC17978p interfaceC17978pMo7117d2 = aVar4.mo7117d();
            C6810h c6810h6 = this.f55956e;
            if (c6810h6 == null) {
                c6810h6 = null;
            }
            C2642u c2642u = c6810h6.f22411n.f55903j;
            C6810h c6810h7 = this.f55956e;
            if (c6810h7 == null) {
                c6810h7 = null;
            }
            new C5912c(applicationContext6, c17942k, interfaceC17978pMo7117d2, c2642u, c6810h7.f22408k);
        }
        C6810h c6810h8 = this.f55956e;
        this.f55957f = new C4900f((c6810h8 != null ? c6810h8 : null).f22399b);
    }
}
