package p445Yc;

import ad.C7188H;
import ad.InterfaceC7242f;
import android.app.Application;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mobi.zona.utils.CppUtil;
import p102Fb.C1583c;
import p107Fg.C1634b;
import p107Fg.C1637e;
import p125Gg.C1910r;
import p125Gg.C1917y;
import p125Gg.C1918z;
import p125Gg.EnumC1908p;
import p125Gg.InterfaceC1905m;
import p161Ig.C2379d;
import p179Jg.C2610F;
import p179Jg.C2618N;
import p179Jg.C2642u;
import p269Og.C3961E;
import p269Og.C3986c;
import p269Og.C3988d;
import p288Q.C4456z0;
import p301Qc.C4582a;
import p301Qc.C4583b;
import p319Rc.C4740d;
import p319Rc.C4748l;
import p319Rc.C4749m;
import p374Ud.C5419l;
import p374Ud.C5429v;
import p410Wd.C5935t;
import p410Wd.C5941z;
import p431Xg.C6365d;
import p431Xg.C6368g;
import p431Xg.C6378q;
import p431Xg.C6387z;
import p431Xg.InterfaceC6379r;
import p449Yg.C6614h;
import p449Yg.C6617k;
import p467Zg.C6844b;
import p478aa.InterfaceC7059L;
import p488b4.C8060q;
import p734p9.C17564c;
import p770rf.C17934C;
import p770rf.C17957a;
import p770rf.C17959b;
import p770rf.C17963d;
import p770rf.C17976n;
import p795t9.C18305a;
import p814uf.C18530d;
import p814uf.C18534h;
import p839w9.C18958e;
import p897zg.C20958c;
import p897zg.C20963h;
import p897zg.InterfaceC20965j;
import ru.zona.app.android.data.cache.ZonaDataBase;
import sg.C18204b;
import sg.C18221s;
import sg.C18222t;
import vg.C18781d;
import vg.C18790m;

/* JADX INFO: renamed from: Yc.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C6568g {

    /* JADX INFO: renamed from: j */
    public static final C1634b f21543j;

    /* JADX INFO: renamed from: a */
    public final Application f21544a;

    /* JADX INFO: renamed from: b */
    public final C6617k f21545b;

    /* JADX INFO: renamed from: c */
    public final C17957a f21546c;

    /* JADX INFO: renamed from: d */
    public final C17959b f21547d;

    /* JADX INFO: renamed from: e */
    public final C7188H f21548e;

    /* JADX INFO: renamed from: f */
    public final List<String> f21549f;

    /* JADX INFO: renamed from: g */
    public final C17963d f21550g;

    /* JADX INFO: renamed from: h */
    public final C2642u f21551h;

    /* JADX INFO: renamed from: i */
    public final C18790m f21552i;

    /* JADX INFO: renamed from: Yc.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a<T> implements InterfaceC1905m {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // p125Gg.InterfaceC1905m
        /* JADX INFO: renamed from: a */
        public final Object mo817a(ContinuationImpl continuationImpl) {
            C6567f c6567f;
            C7188H c7188h = C6568g.this.f21548e;
            if (continuationImpl instanceof C6567f) {
                c6567f = (C6567f) continuationImpl;
                int i10 = c6567f.f21542l;
                if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                    c6567f.f21542l = i10 - IntCompanionObject.MIN_VALUE;
                } else {
                    c6567f = new C6567f(this, continuationImpl);
                }
            } else {
                c6567f = new C6567f(this, continuationImpl);
            }
            Object obj = c6567f.f21540j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = c6567f.f21542l;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((InterfaceC7242f.a) c7188h.f23335d.f32389b.getValue()).f23387a != EnumC1908p.f6449d) {
                    c6567f.f21542l = 1;
                    if (C1637e.m2263a(C6568g.f21543j, "Metadata is not loaded yet", new Object[0], c6567f) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((InterfaceC7242f.a) c7188h.f23335d.f32389b.getValue()).f23388b.f11762a.f11774B;
        }
    }

    /* JADX INFO: renamed from: Yc.g$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b implements InterfaceC6379r {
        public b() {
        }

        @Override // p431Xg.InterfaceC6379r
        /* JADX INFO: renamed from: a */
        public final String mo7143a() {
            return C4583b.m5194b();
        }

        @Override // p431Xg.InterfaceC6379r
        /* JADX INFO: renamed from: b */
        public final String mo7144b(long j10, String str) {
            C6568g c6568g = C6568g.this;
            c6568g.f21546c.m20325b(j10);
            return CppUtil.INSTANCE.checkTimeNative2(c6568g.f21544a, j10, str);
        }
    }

    /* JADX INFO: renamed from: Yc.g$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.android.tv.search.TvSearchService$search$1", m18778f = "TvSearchService.kt", m18779i = {}, m18780l = {233, 234}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {234, 246}, m18784s = {}, m18785v = 2)
    public final class c extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super List<? extends String[]>>, Object> {

        /* JADX INFO: renamed from: j */
        public int f21555j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ String f21557l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f21557l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6568g.this.new c(this.f21557l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super List<? extends String[]>> continuation) {
            return ((c) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            if (r2 == r1) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo20317e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f21555j;
            C6568g c6568g = C6568g.this;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C17959b c17959b = c6568g.f21547d;
                    this.f21555j = 1;
                    if (c17959b.m20326a(this) == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objMo20317e = obj;
                }
                List<C2618N> list = ((C2610F) objMo20317e).f8760a;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (C2618N c2618n : list) {
                    C17963d c17963d = c6568g.f21550g;
                    C2642u c2642u = c6568g.f21551h;
                    String str = c2618n.f8773b;
                    String strM2586a = C1910r.m2586a(c2618n.f8775d, c17963d.mo20336j());
                    String strName = c2618n.f8774c.name();
                    String strM6811a = C5935t.m6811a(c2618n, c2642u);
                    String strM4695b = C3961E.m4695b(c2618n.f8778g, c17963d.mo20336j());
                    int i11 = c2618n.f8776e;
                    String strValueOf = i11 == 0 ? "" : String.valueOf(i11);
                    C3986c c3986cM4700a = C3988d.m4700a(c2618n);
                    String[] strArr = {str, strM2586a, strName, strM6811a, strM4695b, strValueOf, "", Uri.parse("https://mobi.zona/" + c3986cM4700a.f13106c.f13137b + "/" + c3986cM4700a.f13105b).toString()};
                    C6568g.f21543j.mo2258d("suggestion to TvSearchEntity: " + ArraysKt___ArraysKt.joinToString$default(strArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null), new Object[0]);
                    arrayList.add(strArr);
                }
                return arrayList;
                C18790m c18790m = c6568g.f21552i;
                String str2 = this.f21557l;
                this.f21555j = 2;
                objMo20317e = c18790m.mo20317e(str2, this);
            } catch (Exception unused) {
                C6568g.f21543j.getClass();
                return CollectionsKt.emptyList();
            }
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C6568g.class).getSimpleName();
        f21543j = new C1634b();
    }

    public C6568g(Application application) {
        this.f21544a = application;
        C6617k c6617k = new C6617k();
        this.f21545b = c6617k;
        this.f21546c = new C17957a();
        int i10 = 0;
        C4582a c4582a = new C4582a(application.getSharedPreferences("streamStorage", 0));
        C4456z0 c4456z0 = new C4456z0(this);
        C6368g c6368g = new C6368g(new b(), new C6387z(application, new Function1() { // from class: Yc.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Boolean) obj).getClass();
                return C6614h.m7413a(false, false, this.f21535b.f21545b);
            }
        }), c4582a, new C6378q(), c4456z0, c6617k, new C6365d(), new C6844b(application));
        C17564c c17564cM6814a = C5941z.m6814a(C18305a.f56977a, new C4749m(C18958e.m21289a("client_time plugin", new C4748l(new C4740d(application, new a(), c6368g), new C1918z(new C6563b(this, i10)))), application));
        C20963h c20963h = new C20963h(InterfaceC20965j.a.f72022c, "sync_from_metadata");
        C17959b c17959b = new C17959b(C1583c.f5189e, c6368g, c20963h);
        this.f21547d = c17959b;
        C20958c c20958c = new C20958c(c17564cM6814a, c17959b.f55842d);
        this.f21548e = new C7188H(new C18221s(new C18222t(c20958c), new C1917y(new File(application.getCacheDir(), "metadataCache.json"))), c20963h);
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(1, DurationUnit.DAYS);
        C18204b c18204b = new C18204b(c20958c);
        ZonaDataBase zonaDataBase = (ZonaDataBase) C8060q.m10030a(application, ZonaDataBase.class, "zonadb").m10050b();
        C5429v c5429v = new C5429v(zonaDataBase.mo20352x(), new C6564c());
        C5419l c5419l = new C5419l(zonaDataBase.mo20351w(), new C6565d());
        List<String> listSplit$default = StringsKt__StringsKt.split$default("1,2,3,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53", new String[]{StringUtils.COMMA}, false, 0, 6, (Object) null);
        this.f21549f = listSplit$default;
        C18534h c18534h = new C18534h(new C18530d(c18204b, c5429v, c5419l, duration), new C1917y(new File(application.getCacheDir(), "collectionCache.json")), listSplit$default);
        this.f21550g = new C17963d(new C17976n(new C2379d(new C17934C())));
        this.f21551h = new C2642u(new C1918z(new C6566e(this, i10)));
        this.f21552i = new C18790m(new C18781d(c17564cM6814a), c18534h, listSplit$default);
    }
}
