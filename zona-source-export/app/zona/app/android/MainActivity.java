package ru.zona.app.android;

import ad.C7188H;
import ad.C7225Z;
import ad.C7227a;
import ad.C7233c;
import ad.C7236d;
import ad.C7277q1;
import ae.C7305a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C7740o;
import androidx.lifecycle.C7745t;
import be.C8119a;
import be.C8125g;
import be.C8126h;
import be.C8128j;
import be.C8129k;
import be.C8130l;
import be.C8131m;
import be.InterfaceC8120b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Function;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mg.C17061x;
import mg.InterfaceC17049l;
import org.mozilla.classfile.ByteCode;
import org.telegram.login.TelegramLogin;
import p016Af.C0133b;
import p016Af.C0136e;
import p017Ag.C0141D;
import p055D0.C0998l0;
import p055D0.C1002n0;
import p070Df.C1183c;
import p086Ed.C1412q;
import p086Ed.C1418t;
import p106Ff.C1627f;
import p107Fg.C1634b;
import p114G5.C1720h;
import p114G5.C1721i;
import p124Gf.C1883k;
import p124Gf.C1884l;
import p124Gf.C1886n;
import p125Gg.C1915w;
import p125Gg.C1916x;
import p125Gg.EnumC1896d;
import p125Gg.EnumC1908p;
import p142Hf.InterfaceC2180h;
import p154I9.C2302P;
import p154I9.C2311Z;
import p179Jg.C2632k;
import p194Kd.C2981D;
import p197Kg.C3046m;
import p214Lf.C3376c;
import p214Lf.C3380g;
import p229Mc.C3540k;
import p229Mc.C3541l;
import p265Oc.C3928a;
import p269Og.C3986c;
import p269Og.C3988d;
import p269Og.EnumC3994g;
import p269Og.InterfaceC4008o;
import p275P4.C4116s;
import p283Pc.C4220b;
import p283Pc.C4221c;
import p283Pc.C4222d;
import p283Pc.C4226h;
import p319Rc.C4727C;
import p319Rc.C4735K;
import p319Rc.C4737a;
import p337Sc.C4896b;
import p337Sc.C4899e;
import p337Sc.C4900f;
import p366U5.C5374h;
import p366U5.C5375i;
import p373Uc.C5402b;
import p373Uc.C5403c;
import p373Uc.C5405e;
import p384V5.C5653a;
import p384V5.C5654b;
import p384V5.C5657e;
import p402W5.C5861c;
import p428Xd.InterfaceC6311a;
import p438Y5.C6447c;
import p438Y5.C6448d;
import p438Y5.C6453i;
import p438Y5.C6454j;
import p446Yd.C6569a;
import p446Yd.C6573e;
import p464Zd.C6810h;
import p464Zd.InterfaceC6803a;
import p478aa.C7106g;
import p488b4.C8033M;
import p513d.C10149A;
import p513d.C10151C;
import p513d.C10152D;
import p513d.C10153E;
import p513d.C10165Q;
import p513d.C10170W;
import p513d.C10195x;
import p513d.C10196y;
import p513d.C10197z;
import p513d.InterfaceC10155G;
import p524da.C10407W;
import p524da.C10427i;
import p524da.C10430j0;
import p524da.C10454v0;
import p529dg.C10506b;
import p531e.C10517g;
import p565fh.C11195t;
import p566g.InterfaceC11197b;
import p602i4.C12043c;
import p622j.ActivityC15279g;
import p644k0.C15585G1;
import p644k0.InterfaceC15676n;
import p676lg.C16438e;
import p676lg.C16440g;
import p721og.C17360d;
import p770rf.C17942K;
import p770rf.C17944M;
import p770rf.C17946O;
import p770rf.C17949S;
import p770rf.C17950T;
import p770rf.C17951U;
import p770rf.C17952V;
import p770rf.C17957a;
import p770rf.C17967f;
import p770rf.C17968f0;
import p770rf.C17970h;
import p770rf.C17973k;
import p770rf.C17975m;
import p770rf.InterfaceC17977o;
import p770rf.InterfaceC17978p;
import p775s0.C18036t;
import p775s0.C18037u;
import p777s2.AbstractC18059a;
import p777s2.C18061c;
import p784sf.C18195j;
import p814uf.C18534h;
import p828vf.C18762e;
import p828vf.C18772o;
import p828vf.C18773p;
import p828vf.InterfaceC18777t;
import p878yd.C20462e;
import pg.C17614e;
import ru.zona.app.android.MainActivity;
import sd.C18143a;
import sd.C18157o;
import sd.C18167y;
import va.InterfaceC18718c;
import va.InterfaceC18731p;
import za.C20838R0;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001aH\u0014J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J\u0012\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rÊ\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0000¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m18688d2 = {"Lru/zona/app/android/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "permissions", "Lru/zona/app/permission/AndroidPermissions;", "deeplinkIntentFlow", "Lru/zona/app/components/DeeplinkIntentFlowImpl;", "tgLoginService", "Lru/zona/app/android/services/auth/TgLoginServiceAndroid;", "getTgLoginService", "()Lru/zona/app/android/services/auth/TgLoginServiceAndroid;", "setTgLoginService", "(Lru/zona/app/android/services/auth/TgLoginServiceAndroid;)V", "onRequestPermissionsResult", "", "requestCode", "", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onNewIntent", "intent", "handleIntent", "openLink", "url", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ru.zona:android_zonaRelease", "servicesInitializerState", "Lru/zona/app/init/IServicesInitializer$State;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
public final class MainActivity extends ActivityC15279g {

    /* JADX INFO: renamed from: m */
    public static final C1634b f55967m;

    /* JADX INFO: renamed from: j */
    public final C8119a f55968j = new C8119a();

    /* JADX INFO: renamed from: k */
    public final C7233c f55969k = new C7233c(new C3540k(this, 0));

    /* JADX INFO: renamed from: l */
    public C4222d f55970l;

    /* JADX INFO: renamed from: ru.zona.app.android.MainActivity$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.android.MainActivity$onCreate$1", m18778f = "MainActivity.kt", m18779i = {0}, m18780l = {ByteCode.INSTANCEOF}, m18781m = "invokeSuspend", m18782n = {"it"}, m18783nl = {ByteCode.MONITORENTER}, m18784s = {"L$0"}, m18785v = 2)
    public static final class C18000a extends SuspendLambda implements Function2<String, Continuation<? super C3986c>, Object> {

        /* JADX INFO: renamed from: j */
        public int f55971j;

        /* JADX INFO: renamed from: k */
        public /* synthetic */ Object f55972k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ InterfaceC6803a f55973l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18000a(InterfaceC6803a interfaceC6803a, Continuation<? super C18000a> continuation) {
            super(2, continuation);
            this.f55973l = interfaceC6803a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C18000a c18000a = new C18000a(this.f55973l, continuation);
            c18000a.f55972k = obj;
            return c18000a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super C3986c> continuation) {
            return ((C18000a) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.f55972k;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55971j;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C17942K c17942k = this.f55973l.mo7710g().f55908o;
                C2632k c2632k = new C2632k(str);
                this.f55972k = SpillingKt.nullOutSpilledVariable(str);
                this.f55971j = 1;
                obj = c17942k.f55761a.m20536e(c2632k, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return C3988d.m4700a((InterfaceC4008o) obj);
        }
    }

    /* JADX INFO: renamed from: ru.zona.app.android.MainActivity$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class C18001b extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            MainActivity mainActivity = (MainActivity) this.receiver;
            C1634b c1634b = MainActivity.f55967m;
            mainActivity.getClass();
            try {
                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ru.zona.app.android.MainActivity$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class C18002c implements InterfaceC11197b, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f55974b;

        public C18002c(Function1 function1) {
            this.f55974b = function1;
        }

        @Override // p566g.InterfaceC11197b
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo12173a(Object obj) {
            this.f55974b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC11197b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f55974b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(MainActivity.class).getSimpleName();
        f55967m = new C1634b();
    }

    @Override // p681m2.ActivityC16816s, p513d.ActivityC10189r, android.app.Activity
    public final void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.f55968j.m10108b(requestCode);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fe A[Catch: all -> 0x0308, LOOP:2: B:98:0x02f8->B:100:0x02fe, LOOP_END, TryCatch #2 {all -> 0x0308, blocks: (B:97:0x02f4, B:98:0x02f8, B:100:0x02fe, B:103:0x030a), top: B:122:0x02f4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x031d  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x0212  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code duplicated, block: B:89:0x022f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0234  */
    /* JADX WARN: Code duplicated, block: B:92:0x0237  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    @Override // p681m2.ActivityC16816s, p513d.ActivityC10189r, p146I1.ActivityC2204j, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) {
        C4900f c4900f;
        InterfaceC6311a.a aVar;
        C6569a c6569a;
        C6448d c6448d;
        final C6447c c6447c;
        String str;
        C5861c c5861c;
        boolean z10;
        boolean z11;
        C18061c c18061c;
        KClass kotlinClass;
        String qualifiedName;
        C5657e c5657e;
        ReentrantReadWriteLock.ReadLock lock;
        Iterator<T> it;
        Object objM7218a;
        Resources resources;
        Configuration configuration;
        EnumC1896d enumC1896d;
        super.onCreate(savedInstanceState);
        C8119a c8119a = this.f55968j;
        ReentrantReadWriteLock reentrantReadWriteLock = c8119a.f28011a;
        LinkedList<InterfaceC8120b> linkedList = c8119a.f28012b;
        ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i10 = 0; i10 < readHoldCount; i10++) {
            lock2.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            linkedList.clear();
            Unit unit = Unit.INSTANCE;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.lock();
            }
            writeLock.unlock();
            InterfaceC6311a.a aVar2 = ((App) getApplication()).f55955d;
            InterfaceC6311a.a aVar3 = aVar2 != null ? aVar2 : null;
            C6810h c6810h = ((App) getApplication()).f55956e;
            final C6810h c6810h2 = c6810h != null ? c6810h : null;
            C4900f c4900f2 = ((App) getApplication()).f55957f;
            C4900f c4900f3 = c4900f2 != null ? c4900f2 : null;
            C6569a c6569a2 = ((App) getApplication()).f55953b;
            MainActivity mainActivity = c4900f3.f16368b;
            c4900f3.f16368b = this;
            if (mainActivity == null && ((enumC1896d = c4900f3.f16367a) == EnumC1896d.Phone || enumC1896d == EnumC1896d.Tablet)) {
                c4900f3.mo5497c();
            }
            new C4899e(this, c4900f3).enable();
            MainActivity mainActivity2 = c4900f3.f16368b;
            c4900f3.m5500f((mainActivity2 == null || (resources = mainActivity2.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation));
            C1883k c1883k = ((App) getApplication()).f55958g;
            if (c1883k == null) {
                c1883k = null;
            }
            C8129k c8129k = ((App) getApplication()).f55960i;
            C8128j c8128j = ((App) getApplication()).f55959h;
            final C7305a c7305a = ((App) getApplication()).f55954c;
            EnumC1896d enumC1896d2 = c6810h2.f22399b;
            C17968f0 c17968f0 = c6810h2.f22411n;
            this.f55970l = new C4222d(enumC1896d2, this, c17968f0.f55916w.f34818d);
            final C4226h c4226h = new C4226h(this, c6810h2.f22399b, new C3541l(this), c17968f0.f55916w.f34818d);
            int iM1555i = C1002n0.m1555i(C0998l0.f3473f);
            C10170W c10170w = new C10170W(iM1555i, iM1555i, new C3046m(1));
            int iM1555i2 = C1002n0.m1555i(C3376c.f10945f);
            C10170W c10170w2 = new C10170W(iM1555i2, iM1555i2, new C3046m(1));
            C10196y c10196y = C10195x.f31493a;
            View decorView = getWindow().getDecorView();
            decorView.getResources();
            Boolean bool = Boolean.TRUE;
            boolean zBooleanValue = bool.booleanValue();
            decorView.getResources();
            boolean zBooleanValue2 = bool.booleanValue();
            C10196y c10196y2 = C10195x.f31493a;
            InterfaceC10155G c10197z = c10196y2;
            if (c10196y2 == null) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    c10197z = new C10153E();
                } else if (i12 >= 29) {
                    c10197z = new C10152D();
                } else if (i12 >= 28) {
                    c10197z = new C10151C();
                } else if (i12 >= 26) {
                    c10197z = new C10149A();
                } else if (i12 >= 23) {
                    c10197z = new C10197z();
                } else {
                    C10196y c10196y3 = new C10196y();
                    C10195x.f31493a = c10196y3;
                    c10197z = c10196y3;
                }
            }
            InterfaceC10155G interfaceC10155G = c10197z;
            interfaceC10155G.mo12329a(c10170w, c10170w2, getWindow(), decorView, zBooleanValue, zBooleanValue2);
            interfaceC10155G.mo12331b(getWindow());
            final C8033M c8033m = new C8033M(0);
            C10165Q onBackPressedDispatcher = getOnBackPressedDispatcher();
            C5374h c5374h = new C5374h();
            onBackPressedDispatcher.m12337b(new C5375i(c5374h));
            C12043c savedStateRegistry = getSavedStateRegistry();
            Bundle bundleM13924a = savedStateRegistry.m13924a("STATE_KEEPER_STATE");
            if (bundleM13924a != null) {
                c4900f = c4900f3;
                InterfaceC18718c<C6448d> interfaceC18718cSerializer = C6448d.Companion.serializer();
                aVar = aVar3;
                ClassLoader classLoader = bundleM13924a.getClassLoader();
                try {
                    c6569a = c6569a2;
                    bundleM13924a.setClassLoader(C6454j.class.getClassLoader());
                    C6454j c6454j = (C6454j) bundleM13924a.getParcelable("STATE_KEEPER_STATE");
                    bundleM13924a.setClassLoader(classLoader);
                    if (c6454j == null) {
                        objM7218a = null;
                    } else {
                        objM7218a = c6454j.f21298b;
                        if (objM7218a == null) {
                            byte[] value = c6454j.f21299c.getValue();
                            if (value != null) {
                                objM7218a = C6453i.m7218a(value, interfaceC18718cSerializer);
                            } else {
                                objM7218a = null;
                            }
                        }
                    }
                    c6448d = (C6448d) objM7218a;
                    if (c6448d == null) {
                    }
                    c6447c = new C6447c(c6448d);
                    savedStateRegistry.m13926c("STATE_KEEPER_STATE", new C12043c.b(c8033m, c6447c) { // from class: Y5.a

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ C6447c f21281a;

                        {
                            this.f21281a = c6447c;
                        }

                        @Override // p602i4.C12043c.b
                        /* JADX INFO: renamed from: a */
                        public final Bundle mo6922a() {
                            Bundle bundle = new Bundle();
                            if (Boolean.TRUE.booleanValue()) {
                                final C6448d c6448dMo7212a = this.f21281a.mo7212a();
                                final InterfaceC18718c<C6448d> interfaceC18718cSerializer2 = C6448d.Companion.serializer();
                                bundle.putParcelable("STATE_KEEPER_STATE", new C6454j(c6448dMo7212a, LazyKt.lazy(new Function0() { // from class: Y5.b
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Object obj = c6448dMo7212a;
                                        if (obj != null) {
                                            return C6453i.m7219b(obj, interfaceC18718cSerializer2);
                                        }
                                        return null;
                                    }
                                })));
                            }
                            return bundle;
                        }
                    });
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    C20838R0 c20838r0 = C20838R0.f71645a;
                    str = (String) c6447c.mo7215d("DefaultComponentContext_state_marker", c20838r0);
                    c6447c.mo7214c("DefaultComponentContext_state_marker", c20838r0, new C1721i(0));
                    c5861c = new C5861c(getLifecycle());
                    if (str == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10;
                    c18061c = new C18061c(getViewModelStore(), new C5653a(), AbstractC18059a.a.f56301b);
                    kotlinClass = JvmClassMappingKt.getKotlinClass(C5657e.class);
                    if (kotlinClass != null) {
                        qualifiedName = kotlinClass.getQualifiedName();
                    } else {
                        qualifiedName = null;
                    }
                    if (qualifiedName != null) {
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                    }
                    c5657e = (C5657e) c18061c.m20422a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), kotlinClass);
                    if (z11) {
                        c5657e.f18657b.destroy();
                        c5657e.f18657b = new C5654b();
                    }
                    final C1720h c1720h = new C1720h(c5861c, c6447c, c5657e.f18657b, c5374h);
                    final C8131m c8131m = new C8131m(this);
                    c8119a.m10107a(c8131m);
                    C8130l c8130l = new C8130l(this);
                    c8119a.m10107a(c8130l);
                    final C4735K c4735k = new C4735K(getApplicationContext(), c8130l);
                    C8125g c8125g = new C8125g(this, c8129k);
                    c8128j.f28049a.set(c8125g);
                    c8119a.m10107a(c8125g);
                    C8126h c8126h = new C8126h(this);
                    c8119a.m10107a(c8126h);
                    c1883k.getClass();
                    Duration.Companion companion = Duration.INSTANCE;
                    C10427i.m12549o(new C10407W(new C10430j0(new C0141D(Duration.INSTANCE.m27060getZEROUwyO8pc(), DurationKt.toDuration(3, DurationUnit.HOURS), null)), new C1884l(c1883k, null)), c1883k.f6386j);
                    final C1886n c1886n = new C1886n(c1883k);
                    final C4896b c4896b = new C4896b(this);
                    this.f55969k.f23380d = new C18000a(c6810h2, null);
                    m20350p(getIntent());
                    final InterfaceC6311a.a aVar4 = aVar;
                    final C4900f c4900f4 = c4900f;
                    final C6569a c6569a3 = c6569a;
                    C10517g.m12612a(this, new C18036t(-1209550959, new Function2() { // from class: Mc.m
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            InterfaceC15676n interfaceC15676n = (InterfaceC15676n) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            C1634b c1634b = MainActivity.f55967m;
                            int i13 = 1;
                            if (interfaceC15676n.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final MainActivity mainActivity3 = this;
                                boolean zMo18350B = interfaceC15676n.mo18350B(mainActivity3);
                                Object objMo18389z = interfaceC15676n.mo18389z();
                                if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                                    objMo18389z = new C1412q(mainActivity3, i13);
                                    interfaceC15676n.mo18380q(objMo18389z);
                                }
                                C4116s.m4835a((Function1) objMo18389z, interfaceC15676n, 0);
                                final C1720h c1720h2 = c1720h;
                                final C1886n c1886n2 = c1886n;
                                final C4226h c4226h2 = c4226h;
                                final C4735K c4735k2 = c4735k;
                                final C4896b c4896b2 = c4896b;
                                final C4900f c4900f5 = c4900f4;
                                final InterfaceC6311a interfaceC6311a = aVar4;
                                final C6569a c6569a4 = c6569a3;
                                final InterfaceC6803a interfaceC6803a = c6810h2;
                                final C7305a c7305a2 = c7305a;
                                final C8131m c8131m2 = c8131m;
                                C3380g.m4088a(C18037u.m20404c(259411579, new Function2(c1720h2, c1886n2, c4226h2, c4735k2, c4896b2, c4900f5, interfaceC6311a, c6569a4, interfaceC6803a, c7305a2, c8131m2, mainActivity3) { // from class: Mc.n

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ InterfaceC6803a f11633b;

                                    /* JADX INFO: renamed from: c */
                                    public final /* synthetic */ MainActivity f11634c;

                                    /* JADX INFO: renamed from: d */
                                    public final /* synthetic */ InterfaceC6311a f11635d;

                                    /* JADX INFO: renamed from: e */
                                    public final /* synthetic */ C8131m f11636e;

                                    /* JADX INFO: renamed from: f */
                                    public final /* synthetic */ C4900f f11637f;

                                    /* JADX INFO: renamed from: g */
                                    public final /* synthetic */ C4896b f11638g;

                                    /* JADX INFO: renamed from: h */
                                    public final /* synthetic */ C7305a f11639h;

                                    /* JADX INFO: renamed from: i */
                                    public final /* synthetic */ C1720h f11640i;

                                    /* JADX INFO: renamed from: j */
                                    public final /* synthetic */ C4226h f11641j;

                                    /* JADX INFO: renamed from: k */
                                    public final /* synthetic */ C4735K f11642k;

                                    /* JADX INFO: renamed from: l */
                                    public final /* synthetic */ C1886n f11643l;

                                    {
                                        this.f11633b = interfaceC6803a;
                                        this.f11634c = mainActivity3;
                                        this.f11636e = c8131m2;
                                        this.f11639h = c7305a2;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        InterfaceC6803a interfaceC6803a2;
                                        InterfaceC18777t c18772o;
                                        C8131m c8131m3 = this.f11636e;
                                        InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        C1634b c1634b2 = MainActivity.f55967m;
                                        int i14 = 1;
                                        if (interfaceC15676n2.mo18379p(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            InterfaceC6803a interfaceC6803a3 = this.f11633b;
                                            if (((InterfaceC6803a.a) C15585G1.m18246a(interfaceC6803a3.getState(), interfaceC15676n2, 0).getValue()).f22379a == EnumC1908p.f6449d) {
                                                interfaceC15676n2.mo18363O(1484606552);
                                                Object objMo18389z2 = interfaceC15676n2.mo18389z();
                                                MainActivity mainActivity4 = this.f11634c;
                                                InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                                                if (objMo18389z2 == c21235a) {
                                                    C17968f0 c17968f0Mo7710g = interfaceC6803a3.mo7710g();
                                                    Context applicationContext = mainActivity4.getApplicationContext();
                                                    C7740o c7740oM9198a = C7745t.m9198a(mainActivity4);
                                                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("filters", 0);
                                                    EnumC3994g.a aVar5 = EnumC3994g.Companion;
                                                    C1915w c1915w = new C1915w(sharedPreferences, "movie");
                                                    C1915w c1915w2 = new C1915w(sharedPreferences, "serial");
                                                    C1634b c1634b3 = C18157o.f56498b;
                                                    List<String> list = c17968f0Mo7710g.f55897d;
                                                    C7188H c7188h = c17968f0Mo7710g.f55911r;
                                                    C18167y c18167y = new C18167y(C18157o.a.m20522a(c1915w, list, c7188h, c7740oM9198a), C18157o.a.m20522a(c1915w2, c17968f0Mo7710g.f55897d, c7188h, c7740oM9198a), new C18143a(c7188h), C18157o.a.m20522a(new C1916x(), CollectionsKt.emptyList(), c7188h, c7740oM9198a));
                                                    C18143a c18143a = new C18143a(c7188h);
                                                    C18534h c18534h = interfaceC6803a3.mo7710g().f55907n;
                                                    InterfaceC6311a interfaceC6311a2 = this.f11635d;
                                                    C17944M c17944m = new C17944M(mainActivity4, c18534h, interfaceC6311a2.mo7118e(), C7745t.m9198a(mainActivity4), c17968f0Mo7710g.f55911r);
                                                    C17949S c17949s = new C17949S(mainActivity4, C7745t.m9198a(mainActivity4));
                                                    C17946O c17946o = new C17946O(interfaceC6803a3.mo7708e(), c7188h, new C1418t(c17968f0Mo7710g, i14));
                                                    C17970h c17970h = new C17970h(mainActivity4, c17968f0Mo7710g.f55895b, Build.VERSION.SDK_INT, C7745t.m9198a(mainActivity4));
                                                    C4737a c4737a = new C4737a(mainActivity4);
                                                    try {
                                                        interfaceC6803a2 = interfaceC6803a3;
                                                        try {
                                                            c18772o = new C18772o(new C18762e(mainActivity4, interfaceC6311a2.mo7118e()), c17968f0Mo7710g.f55908o, c8131m3, interfaceC6311a2.mo7118e());
                                                        } catch (Exception unused) {
                                                            MainActivity.f55967m.getClass();
                                                            c18772o = C18773p.f58490a;
                                                        }
                                                    } catch (Exception unused2) {
                                                        interfaceC6803a2 = interfaceC6803a3;
                                                    }
                                                    InterfaceC18777t interfaceC18777t = c18772o;
                                                    InterfaceC2180h interfaceC2180hMo7709f = interfaceC6803a2.mo7709f();
                                                    C17942K c17942k = c17968f0Mo7710g.f55908o;
                                                    C1627f c1627f = c17968f0Mo7710g.f55914u;
                                                    C0133b c0133b = c17968f0Mo7710g.f55899f;
                                                    C3928a c3928a = c17968f0Mo7710g.f55898e;
                                                    C1183c c1183c = interfaceC6803a2.mo7706c().f9851a.f4249b;
                                                    C17973k c17973k = c17968f0Mo7710g.f55912s;
                                                    C17952V c17952v = c17968f0Mo7710g.f55905l;
                                                    InterfaceC17978p interfaceC17978pMo7117d = interfaceC6311a2.mo7117d();
                                                    EnumC1896d enumC1896dMo7705b = interfaceC6803a2.mo7705b();
                                                    C18195j c18195j = c17968f0Mo7710g.f55886A;
                                                    InterfaceC17049l interfaceC17049lMo7118e = interfaceC6311a2.mo7118e();
                                                    C17951U c17951u = c17968f0Mo7710g.f55889D;
                                                    C16440g c16440g = c17951u.f55811a;
                                                    C16438e c16438e = c17951u.f55812b;
                                                    C17975m c17975m = c17968f0Mo7710g.f55900g;
                                                    C5403c c5403c = c17975m.f55946d;
                                                    C5405e c5405e = c17975m.f55947e;
                                                    C5402b c5402b = c17975m.f55945c;
                                                    InterfaceC17977o interfaceC17977o = c17968f0Mo7710g.f55891F;
                                                    C7188H c7188h2 = c17968f0Mo7710g.f55911r;
                                                    C17061x c17061x = c17968f0Mo7710g.f55906m;
                                                    C20462e c20462e = c17968f0Mo7710g.f55893H;
                                                    C11195t c11195t = c17968f0Mo7710g.f55916w.f34815a;
                                                    C17967f c17967f = C17967f.f55883a;
                                                    C4900f c4900f6 = this.f11637f;
                                                    C4727C c4727c = new C4727C(interfaceC2180hMo7709f, c17942k, c1627f, c0133b, c17970h, c3928a, c1183c, c17973k, c17952v, interfaceC17978pMo7117d, enumC1896dMo7705b, c18195j, c17944m, interfaceC17049lMo7118e, c16440g, c16438e, c5403c, c5405e, c5402b, c4900f6, c4900f6, this.f11638g, interfaceC17977o, c7188h2, c17061x, c20462e, c11195t, interfaceC18777t);
                                                    C4222d c4222d = mainActivity4.f55970l;
                                                    if (c4222d == null) {
                                                        c4222d = null;
                                                    }
                                                    int i15 = interfaceC6803a2.mo7705b() == EnumC1896d.Phone ? 20 : 60;
                                                    C2981D c2981dMo7706c = interfaceC6803a2.mo7706c();
                                                    EnumC1896d enumC1896dMo7705b2 = interfaceC6803a2.mo7705b();
                                                    C17957a c17957a = c17968f0Mo7710g.f55902i;
                                                    MainActivity.C18001b c18001b = new MainActivity.C18001b(1, mainActivity4, MainActivity.class, "openLink", "openLink(Ljava/lang/String;)V", 0);
                                                    mainActivity4 = mainActivity4;
                                                    C7277q1 c7277q1 = new C7277q1(this.f11640i, interfaceC6311a2, i15, c4222d, this.f11641j, c17968f0Mo7710g, c2981dMo7706c, c18167y, c18143a, enumC1896dMo7705b2, c4900f6, c4727c, c17957a, c18001b, this.f11642k, interfaceC6311a2.mo7118e(), interfaceC6803a2.mo7707d(), c17944m, c17949s, c17970h, this.f11643l, c4900f6, interfaceC6803a2.mo7710g().f55888C, Intrinsics.areEqual(this.f11639h, C7305a.f23515a) ? C0136e.f468a : interfaceC6803a2.mo7710g().f55899f, new C17950T(mainActivity4), c4737a, c17946o);
                                                    C10427i.m12549o(new C10407W(mainActivity4.f55969k.f23379c, new C7225Z(c7277q1, null)), c7277q1.f23462A);
                                                    interfaceC15676n2.mo18380q(c7277q1);
                                                    objMo18389z2 = c7277q1;
                                                }
                                                C7277q1 c7277q2 = (C7277q1) objMo18389z2;
                                                Object objMo18389z3 = interfaceC15676n2.mo18389z();
                                                if (objMo18389z3 == c21235a) {
                                                    objMo18389z3 = new C6573e();
                                                    interfaceC15676n2.mo18380q(objMo18389z3);
                                                }
                                                C6573e c6573e = (C6573e) objMo18389z3;
                                                boolean zMo18350B2 = interfaceC15676n2.mo18350B(mainActivity4);
                                                Object objMo18389z4 = interfaceC15676n2.mo18389z();
                                                if (zMo18350B2 || objMo18389z4 == c21235a) {
                                                    objMo18389z4 = new C3544o(mainActivity4, 0);
                                                    interfaceC15676n2.mo18380q(objMo18389z4);
                                                }
                                                C1634b c1634b4 = C7277q1.f23461K;
                                                C3546q.m4308a(c7277q2, c6573e, (Function0) objMo18389z4, interfaceC15676n2, 3080);
                                                interfaceC15676n2.mo18357I();
                                            } else {
                                                interfaceC15676n2.mo18363O(1492316593);
                                                C10506b.m12607a(0, interfaceC15676n2);
                                                interfaceC15676n2.mo18357I();
                                            }
                                        } else {
                                            interfaceC15676n2.mo18356H();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, interfaceC15676n), interfaceC15676n, 6);
                            } else {
                                interfaceC15676n.mo18356H();
                            }
                            return Unit.INSTANCE;
                        }
                    }, true));
                    try {
                        lock = c8119a.f28011a.readLock();
                        lock.lock();
                        try {
                            it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC8120b) it.next()).mo10112b();
                            }
                            Unit unit2 = Unit.INSTANCE;
                            lock.unlock();
                        } catch (Throwable th) {
                            lock.unlock();
                            throw th;
                        }
                    } catch (Exception unused) {
                        C8119a.f28010c.getClass();
                    }
                    c8126h.mo10113d();
                } catch (Throwable th2) {
                    bundleM13924a.setClassLoader(classLoader);
                    throw th2;
                }
            }
            c4900f = c4900f3;
            aVar = aVar3;
            c6569a = c6569a2;
            c6448d = null;
            c6447c = new C6447c(c6448d);
            savedStateRegistry.m13926c("STATE_KEEPER_STATE", new C12043c.b(c8033m, c6447c) { // from class: Y5.a

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C6447c f21281a;

                {
                    this.f21281a = c6447c;
                }

                @Override // p602i4.C12043c.b
                /* JADX INFO: renamed from: a */
                public final Bundle mo6922a() {
                    Bundle bundle = new Bundle();
                    if (Boolean.TRUE.booleanValue()) {
                        final C6448d c6448dMo7212a = this.f21281a.mo7212a();
                        final InterfaceC18731p interfaceC18718cSerializer2 = C6448d.Companion.serializer();
                        bundle.putParcelable("STATE_KEEPER_STATE", new C6454j(c6448dMo7212a, LazyKt.lazy(new Function0() { // from class: Y5.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Object obj = c6448dMo7212a;
                                if (obj != null) {
                                    return C6453i.m7219b(obj, interfaceC18718cSerializer2);
                                }
                                return null;
                            }
                        })));
                    }
                    return bundle;
                }
            });
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            C20838R0 c20838r1 = C20838R0.f71645a;
            str = (String) c6447c.mo7215d("DefaultComponentContext_state_marker", c20838r1);
            c6447c.mo7214c("DefaultComponentContext_state_marker", c20838r1, new C1721i(0));
            c5861c = new C5861c(getLifecycle());
            if (str == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z10;
            c18061c = new C18061c(getViewModelStore(), new C5653a(), AbstractC18059a.a.f56301b);
            kotlinClass = JvmClassMappingKt.getKotlinClass(C5657e.class);
            if (kotlinClass != null) {
                qualifiedName = kotlinClass.getQualifiedName();
            } else {
                qualifiedName = null;
            }
            if (qualifiedName != null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            c5657e = (C5657e) c18061c.m20422a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), kotlinClass);
            if (z11) {
                c5657e.f18657b.destroy();
                c5657e.f18657b = new C5654b();
            }
            final C1720h c1720h2 = new C1720h(c5861c, c6447c, c5657e.f18657b, c5374h);
            final C8131m c8131m2 = new C8131m(this);
            c8119a.m10107a(c8131m2);
            C8130l c8130l2 = new C8130l(this);
            c8119a.m10107a(c8130l2);
            final C4735K c4735k2 = new C4735K(getApplicationContext(), c8130l2);
            C8125g c8125g2 = new C8125g(this, c8129k);
            c8128j.f28049a.set(c8125g2);
            c8119a.m10107a(c8125g2);
            C8126h c8126h2 = new C8126h(this);
            c8119a.m10107a(c8126h2);
            c1883k.getClass();
            Duration.Companion companion2 = Duration.INSTANCE;
            C10427i.m12549o(new C10407W(new C10430j0(new C0141D(Duration.INSTANCE.m27060getZEROUwyO8pc(), DurationKt.toDuration(3, DurationUnit.HOURS), null)), new C1884l(c1883k, null)), c1883k.f6386j);
            final C1886n c1886n2 = new C1886n(c1883k);
            final C4896b c4896b2 = new C4896b(this);
            this.f55969k.f23380d = new C18000a(c6810h2, null);
            m20350p(getIntent());
            final InterfaceC6311a aVar5 = aVar;
            final C4900f c4900f5 = c4900f;
            final C6569a c6569a4 = c6569a;
            C10517g.m12612a(this, new C18036t(-1209550959, new Function2() { // from class: Mc.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C1634b c1634b = MainActivity.f55967m;
                    int i13 = 1;
                    if (interfaceC15676n.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final MainActivity mainActivity3 = this;
                        boolean zMo18350B = interfaceC15676n.mo18350B(mainActivity3);
                        Object objMo18389z = interfaceC15676n.mo18389z();
                        if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                            objMo18389z = new C1412q(mainActivity3, i13);
                            interfaceC15676n.mo18380q(objMo18389z);
                        }
                        C4116s.m4835a((Function1) objMo18389z, interfaceC15676n, 0);
                        final C1720h c1720h3 = c1720h2;
                        final C1886n c1886n3 = c1886n2;
                        final C4226h c4226h2 = c4226h;
                        final C4735K c4735k3 = c4735k2;
                        final C4896b c4896b3 = c4896b2;
                        final C4900f c4900f6 = c4900f5;
                        final InterfaceC6311a interfaceC6311a = aVar5;
                        final C6569a c6569a5 = c6569a4;
                        final InterfaceC6803a interfaceC6803a = c6810h2;
                        final C7305a c7305a2 = c7305a;
                        final C8131m c8131m3 = c8131m2;
                        C3380g.m4088a(C18037u.m20404c(259411579, new Function2(c1720h3, c1886n3, c4226h2, c4735k3, c4896b3, c4900f6, interfaceC6311a, c6569a5, interfaceC6803a, c7305a2, c8131m3, mainActivity3) { // from class: Mc.n

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ InterfaceC6803a f11633b;

                            /* JADX INFO: renamed from: c */
                            public final /* synthetic */ MainActivity f11634c;

                            /* JADX INFO: renamed from: d */
                            public final /* synthetic */ InterfaceC6311a f11635d;

                            /* JADX INFO: renamed from: e */
                            public final /* synthetic */ C8131m f11636e;

                            /* JADX INFO: renamed from: f */
                            public final /* synthetic */ C4900f f11637f;

                            /* JADX INFO: renamed from: g */
                            public final /* synthetic */ C4896b f11638g;

                            /* JADX INFO: renamed from: h */
                            public final /* synthetic */ C7305a f11639h;

                            /* JADX INFO: renamed from: i */
                            public final /* synthetic */ C1720h f11640i;

                            /* JADX INFO: renamed from: j */
                            public final /* synthetic */ C4226h f11641j;

                            /* JADX INFO: renamed from: k */
                            public final /* synthetic */ C4735K f11642k;

                            /* JADX INFO: renamed from: l */
                            public final /* synthetic */ C1886n f11643l;

                            {
                                this.f11633b = interfaceC6803a;
                                this.f11634c = mainActivity3;
                                this.f11636e = c8131m3;
                                this.f11639h = c7305a2;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                InterfaceC6803a interfaceC6803a2;
                                InterfaceC18777t c18772o;
                                C8131m c8131m4 = this.f11636e;
                                InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                C1634b c1634b2 = MainActivity.f55967m;
                                int i14 = 1;
                                if (interfaceC15676n2.mo18379p(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    InterfaceC6803a interfaceC6803a3 = this.f11633b;
                                    if (((InterfaceC6803a.a) C15585G1.m18246a(interfaceC6803a3.getState(), interfaceC15676n2, 0).getValue()).f22379a == EnumC1908p.f6449d) {
                                        interfaceC15676n2.mo18363O(1484606552);
                                        Object objMo18389z2 = interfaceC15676n2.mo18389z();
                                        MainActivity mainActivity4 = this.f11634c;
                                        InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                                        if (objMo18389z2 == c21235a) {
                                            C17968f0 c17968f0Mo7710g = interfaceC6803a3.mo7710g();
                                            Context applicationContext = mainActivity4.getApplicationContext();
                                            C7740o c7740oM9198a = C7745t.m9198a(mainActivity4);
                                            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("filters", 0);
                                            EnumC3994g.a aVar6 = EnumC3994g.Companion;
                                            C1915w c1915w = new C1915w(sharedPreferences, "movie");
                                            C1915w c1915w2 = new C1915w(sharedPreferences, "serial");
                                            C1634b c1634b3 = C18157o.f56498b;
                                            List<String> list = c17968f0Mo7710g.f55897d;
                                            C7188H c7188h = c17968f0Mo7710g.f55911r;
                                            C18167y c18167y = new C18167y(C18157o.a.m20522a(c1915w, list, c7188h, c7740oM9198a), C18157o.a.m20522a(c1915w2, c17968f0Mo7710g.f55897d, c7188h, c7740oM9198a), new C18143a(c7188h), C18157o.a.m20522a(new C1916x(), CollectionsKt.emptyList(), c7188h, c7740oM9198a));
                                            C18143a c18143a = new C18143a(c7188h);
                                            C18534h c18534h = interfaceC6803a3.mo7710g().f55907n;
                                            InterfaceC6311a interfaceC6311a2 = this.f11635d;
                                            C17944M c17944m = new C17944M(mainActivity4, c18534h, interfaceC6311a2.mo7118e(), C7745t.m9198a(mainActivity4), c17968f0Mo7710g.f55911r);
                                            C17949S c17949s = new C17949S(mainActivity4, C7745t.m9198a(mainActivity4));
                                            C17946O c17946o = new C17946O(interfaceC6803a3.mo7708e(), c7188h, new C1418t(c17968f0Mo7710g, i14));
                                            C17970h c17970h = new C17970h(mainActivity4, c17968f0Mo7710g.f55895b, Build.VERSION.SDK_INT, C7745t.m9198a(mainActivity4));
                                            C4737a c4737a = new C4737a(mainActivity4);
                                            try {
                                                interfaceC6803a2 = interfaceC6803a3;
                                                try {
                                                    c18772o = new C18772o(new C18762e(mainActivity4, interfaceC6311a2.mo7118e()), c17968f0Mo7710g.f55908o, c8131m4, interfaceC6311a2.mo7118e());
                                                } catch (Exception unused2) {
                                                    MainActivity.f55967m.getClass();
                                                    c18772o = C18773p.f58490a;
                                                }
                                            } catch (Exception unused3) {
                                                interfaceC6803a2 = interfaceC6803a3;
                                            }
                                            InterfaceC18777t interfaceC18777t = c18772o;
                                            InterfaceC2180h interfaceC2180hMo7709f = interfaceC6803a2.mo7709f();
                                            C17942K c17942k = c17968f0Mo7710g.f55908o;
                                            C1627f c1627f = c17968f0Mo7710g.f55914u;
                                            C0133b c0133b = c17968f0Mo7710g.f55899f;
                                            C3928a c3928a = c17968f0Mo7710g.f55898e;
                                            C1183c c1183c = interfaceC6803a2.mo7706c().f9851a.f4249b;
                                            C17973k c17973k = c17968f0Mo7710g.f55912s;
                                            C17952V c17952v = c17968f0Mo7710g.f55905l;
                                            InterfaceC17978p interfaceC17978pMo7117d = interfaceC6311a2.mo7117d();
                                            EnumC1896d enumC1896dMo7705b = interfaceC6803a2.mo7705b();
                                            C18195j c18195j = c17968f0Mo7710g.f55886A;
                                            InterfaceC17049l interfaceC17049lMo7118e = interfaceC6311a2.mo7118e();
                                            C17951U c17951u = c17968f0Mo7710g.f55889D;
                                            C16440g c16440g = c17951u.f55811a;
                                            C16438e c16438e = c17951u.f55812b;
                                            C17975m c17975m = c17968f0Mo7710g.f55900g;
                                            C5403c c5403c = c17975m.f55946d;
                                            C5405e c5405e = c17975m.f55947e;
                                            C5402b c5402b = c17975m.f55945c;
                                            InterfaceC17977o interfaceC17977o = c17968f0Mo7710g.f55891F;
                                            C7188H c7188h2 = c17968f0Mo7710g.f55911r;
                                            C17061x c17061x = c17968f0Mo7710g.f55906m;
                                            C20462e c20462e = c17968f0Mo7710g.f55893H;
                                            C11195t c11195t = c17968f0Mo7710g.f55916w.f34815a;
                                            C17967f c17967f = C17967f.f55883a;
                                            C4900f c4900f7 = this.f11637f;
                                            C4727C c4727c = new C4727C(interfaceC2180hMo7709f, c17942k, c1627f, c0133b, c17970h, c3928a, c1183c, c17973k, c17952v, interfaceC17978pMo7117d, enumC1896dMo7705b, c18195j, c17944m, interfaceC17049lMo7118e, c16440g, c16438e, c5403c, c5405e, c5402b, c4900f7, c4900f7, this.f11638g, interfaceC17977o, c7188h2, c17061x, c20462e, c11195t, interfaceC18777t);
                                            C4222d c4222d = mainActivity4.f55970l;
                                            if (c4222d == null) {
                                                c4222d = null;
                                            }
                                            int i15 = interfaceC6803a2.mo7705b() == EnumC1896d.Phone ? 20 : 60;
                                            C2981D c2981dMo7706c = interfaceC6803a2.mo7706c();
                                            EnumC1896d enumC1896dMo7705b2 = interfaceC6803a2.mo7705b();
                                            C17957a c17957a = c17968f0Mo7710g.f55902i;
                                            MainActivity.C18001b c18001b = new MainActivity.C18001b(1, mainActivity4, MainActivity.class, "openLink", "openLink(Ljava/lang/String;)V", 0);
                                            mainActivity4 = mainActivity4;
                                            C7277q1 c7277q1 = new C7277q1(this.f11640i, interfaceC6311a2, i15, c4222d, this.f11641j, c17968f0Mo7710g, c2981dMo7706c, c18167y, c18143a, enumC1896dMo7705b2, c4900f7, c4727c, c17957a, c18001b, this.f11642k, interfaceC6311a2.mo7118e(), interfaceC6803a2.mo7707d(), c17944m, c17949s, c17970h, this.f11643l, c4900f7, interfaceC6803a2.mo7710g().f55888C, Intrinsics.areEqual(this.f11639h, C7305a.f23515a) ? C0136e.f468a : interfaceC6803a2.mo7710g().f55899f, new C17950T(mainActivity4), c4737a, c17946o);
                                            C10427i.m12549o(new C10407W(mainActivity4.f55969k.f23379c, new C7225Z(c7277q1, null)), c7277q1.f23462A);
                                            interfaceC15676n2.mo18380q(c7277q1);
                                            objMo18389z2 = c7277q1;
                                        }
                                        C7277q1 c7277q2 = (C7277q1) objMo18389z2;
                                        Object objMo18389z3 = interfaceC15676n2.mo18389z();
                                        if (objMo18389z3 == c21235a) {
                                            objMo18389z3 = new C6573e();
                                            interfaceC15676n2.mo18380q(objMo18389z3);
                                        }
                                        C6573e c6573e = (C6573e) objMo18389z3;
                                        boolean zMo18350B2 = interfaceC15676n2.mo18350B(mainActivity4);
                                        Object objMo18389z4 = interfaceC15676n2.mo18389z();
                                        if (zMo18350B2 || objMo18389z4 == c21235a) {
                                            objMo18389z4 = new C3544o(mainActivity4, 0);
                                            interfaceC15676n2.mo18380q(objMo18389z4);
                                        }
                                        C1634b c1634b4 = C7277q1.f23461K;
                                        C3546q.m4308a(c7277q2, c6573e, (Function0) objMo18389z4, interfaceC15676n2, 3080);
                                        interfaceC15676n2.mo18357I();
                                    } else {
                                        interfaceC15676n2.mo18363O(1492316593);
                                        C10506b.m12607a(0, interfaceC15676n2);
                                        interfaceC15676n2.mo18357I();
                                    }
                                } else {
                                    interfaceC15676n2.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n), interfaceC15676n, 6);
                    } else {
                        interfaceC15676n.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, true));
            lock = c8119a.f28011a.readLock();
            lock.lock();
            it = linkedList.iterator();
            while (it.hasNext()) {
                ((InterfaceC8120b) it.next()).mo10112b();
            }
            Unit unit3 = Unit.INSTANCE;
            lock.unlock();
            c8126h2.mo10113d();
        } catch (Throwable th3) {
            for (int i13 = 0; i13 < readHoldCount; i13++) {
                lock2.lock();
            }
            writeLock.unlock();
            throw th3;
        }
    }

    @Override // p513d.ActivityC10189r, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m20350p(intent);
    }

    @Override // p681m2.ActivityC16816s, p513d.ActivityC10189r, android.app.Activity
    public final void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.f55968j.m10108b(requestCode);
    }

    /* JADX INFO: renamed from: p */
    public final void m20350p(Intent intent) {
        EnumC3994g enumC3994g;
        Object next;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        C2311Z c2311zM2967b = C2302P.m2978a("https://az1.zona.pub/v1/auth").m2967b();
        Uri data = intent.getData();
        C7233c c7233c = this.f55969k;
        if (data != null) {
            if (Intrinsics.areEqual(data.getHost(), "app521295504-login.tg.dev")) {
                C4222d c4222d = this.f55970l;
                C4222d c4222d2 = c4222d != null ? c4222d : null;
                c4222d2.getClass();
                C1634b c1634b = C4222d.f14100i;
                try {
                    c1634b.mo2258d("trying to handle LoginResponse", new Object[0]);
                    C10454v0 c10454v0 = c4222d2.f14104d;
                    do {
                        value4 = c10454v0.getValue();
                    } while (!c10454v0.mo12533d(value4, EnumC1908p.f6448c));
                    TelegramLogin.handleLoginResponse(data, new C4220b(1, c4222d2, C4222d.class, "onSuccess", "onSuccess(Lorg/telegram/login/LoginData;)V", 0), new C4221c(1, c4222d2, C4222d.class, "onError", "onError(Lorg/telegram/login/LoginError;)V", 0));
                    return;
                } catch (Exception unused) {
                    c1634b.getClass();
                    C10454v0 c10454v1 = c4222d2.f14106f;
                    do {
                        value3 = c10454v1.getValue();
                        ((Boolean) value3).getClass();
                    } while (!c10454v1.mo12533d(value3, Boolean.TRUE));
                    return;
                }
            }
            if (Intrinsics.areEqual(data.getHost(), c2311zM2967b.f7554b) && Intrinsics.areEqual(data.getPath(), (String) c2311zM2967b.f7564l.getValue())) {
                String string = data.toString();
                C10454v0 c10454v2 = c7233c.f23378b;
                do {
                    try {
                        value = c10454v2.getValue();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                } while (!c10454v2.mo12533d(value, new C7236d(null, null, 1)));
                C17614e.f54825a.getClass();
                C17360d c17360dM19976a = C17614e.m19976a(string);
                do {
                    value2 = c10454v2.getValue();
                } while (!c10454v2.mo12533d(value2, new C7236d(null, c17360dM19976a, 1)));
                return;
            }
        }
        Uri data2 = intent.getData();
        String string2 = data2 != null ? data2.toString() : null;
        c7233c.getClass();
        if (string2 != null && !StringsKt.isBlank(string2)) {
            try {
                c7233c.f23377a.invoke(string2);
            } catch (Exception unused2) {
                C7233c.f23376f.getClass();
            }
            C7106g.m8045c(c7233c.f23381e, null, null, new C7227a(c7233c, string2, null), 3);
        }
        if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.VIEW") || Intrinsics.areEqual(intent.getAction(), "android.intent.action.SEARCH")) {
            Uri data3 = intent.getData();
            if (data3 == null) {
                data3 = Uri.EMPTY;
            }
            EnumC3994g.a aVar = EnumC3994g.Companion;
            String str = (String) CollectionsKt.firstOrNull((List) data3.getPathSegments());
            aVar.getClass();
            if (str != null) {
                Iterator<E> it = EnumC3994g.f13136q.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((EnumC3994g) next).f13137b, str));
                enumC3994g = (EnumC3994g) next;
            } else {
                enumC3994g = null;
            }
            if (enumC3994g == null) {
                enumC3994g = EnumC3994g.UNKNOWN;
            }
            String lastPathSegment = data3.getLastPathSegment();
            C3986c c3986c = lastPathSegment != null ? new C3986c(lastPathSegment, enumC3994g) : null;
            if (c3986c != null) {
                c7233c.m8130a(c3986c);
            }
        }
    }
}
