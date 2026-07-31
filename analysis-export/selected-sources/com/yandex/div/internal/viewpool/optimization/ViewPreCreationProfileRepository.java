package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.logging.Severity;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import p011Aa.AbstractC0090c;
import p011Aa.C0074A;
import p011Aa.C0087N;
import p011Aa.C0094g;
import p029Ba.C0337G;
import p029Ba.C0338H;
import p029Ba.C0363g;
import p029Ba.C0365i;
import p047Ca.AbstractC0696d;
import p478aa.C7061M;
import p478aa.C7083X0;
import p478aa.C7101e0;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p516d2.C10253S;
import p516d2.C10273g;
import p516d2.C10289o;
import p516d2.InterfaceC10274g0;
import p516d2.InterfaceC10281k;
import p524da.C10427i;
import p524da.InterfaceC10423g;
import p534e2.C10734a;
import p558fa.C11095d;
import p589ha.C11865c;
import p589ha.ExecutorC11864b;
import va.C18737v;
import va.InterfaceC18718c;
import za.C20913y0;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m18688d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;", "", "Landroid/content/Context;", "context", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "defaultProfile", "<init>", "(Landroid/content/Context;Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;)V", "", "id", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "Companion", "ViewPreCreationProfileSerializer", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public class ViewPreCreationProfileRepository {
    private static final Companion Companion = new Companion(null);
    private static final WeakHashMap<String, InterfaceC10281k<ViewPreCreationProfile>> stores = new WeakHashMap<>();
    private final Context context;
    private final ViewPreCreationProfile defaultProfile;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m18688d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "", "id", "Ld2/k;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "getStoreForId", "(Landroid/content/Context;Ljava/lang/String;)Ld2/k;", "Ljava/util/WeakHashMap;", "stores", "Ljava/util/WeakHashMap;", "getStores", "()Ljava/util/WeakHashMap;", "STORE_PATH", "Ljava/lang/String;", "TAG", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC10281k<ViewPreCreationProfile> getStoreForId(final Context context, final String str) {
            WeakHashMap<String, InterfaceC10281k<ViewPreCreationProfile>> stores = getStores();
            InterfaceC10281k<ViewPreCreationProfile> interfaceC10281k = stores.get(str);
            if (interfaceC10281k == null) {
                ViewPreCreationProfileSerializer viewPreCreationProfileSerializer = ViewPreCreationProfileSerializer.INSTANCE;
                Function0<File> function0 = new Function0<File>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$Companion$getStoreForId$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final File invoke() {
                        return new File(context.getFilesDir(), String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{str}, 1)));
                    }
                };
                List listEmptyList = CollectionsKt.emptyList();
                C11865c c11865c = C7101e0.f23142a;
                C11095d c11095dM7996a = C7061M.m7996a(ExecutorC11864b.f37309c.plus(C7083X0.m8017a()));
                C10289o c10289o = new C10289o(new C10253S(viewPreCreationProfileSerializer, function0), CollectionsKt.listOf(new C10273g(listEmptyList, null)), new C10734a(), c11095dM7996a);
                stores.put(str, c10289o);
                interfaceC10281k = c10289o;
            }
            return interfaceC10281k;
        }

        public final WeakHashMap<String, InterfaceC10281k<ViewPreCreationProfile>> getStores() {
            return ViewPreCreationProfileRepository.stores;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m18688d2 = {"Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer;", "Ld2/g0;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "writeTo", "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAa/c;", "json", "LAa/c;", "defaultValue", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "getDefaultValue", "()Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public static final class ViewPreCreationProfileSerializer implements InterfaceC10274g0<ViewPreCreationProfile> {
        private static final ViewPreCreationProfile defaultValue = null;
        public static final ViewPreCreationProfileSerializer INSTANCE = new ViewPreCreationProfileSerializer();
        private static final AbstractC0090c json = C0074A.m149a(new Function1<C0094g, Unit>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C0094g c0094g) {
                invoke2(c0094g);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C0094g c0094g) {
                c0094g.f374a = false;
            }
        });

        private ViewPreCreationProfileSerializer() {
        }

        @Override // p516d2.InterfaceC10274g0
        public Object readFrom(InputStream inputStream, Continuation<? super ViewPreCreationProfile> continuation) {
            Object objM25596constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                AbstractC0090c abstractC0090c = json;
                AbstractC0696d abstractC0696d = abstractC0090c.f365b;
                KType kTypeNullableTypeOf = Reflection.nullableTypeOf(ViewPreCreationProfile.class);
                InterfaceC18718c<Object> interfaceC18718cM21121a = C18737v.m21121a(abstractC0696d, kTypeNullableTypeOf, true);
                if (interfaceC18718cM21121a == null) {
                    C20913y0.m25448d(C20913y0.m25447c(kTypeNullableTypeOf));
                    throw null;
                }
                objM25596constructorimpl = Result.m25596constructorimpl((ViewPreCreationProfile) C0087N.m160a(abstractC0090c, interfaceC18718cM21121a, inputStream));
                if (Result.m25599exceptionOrNullimpl(objM25596constructorimpl) != null) {
                    KLog.INSTANCE.isAtLeast(Severity.ERROR);
                }
                if (Result.m25602isFailureimpl(objM25596constructorimpl)) {
                    return null;
                }
                return objM25596constructorimpl;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM25596constructorimpl = Result.m25596constructorimpl(ResultKt.createFailure(th));
            }
        }

        @Override // p516d2.InterfaceC10274g0
        public /* bridge */ /* synthetic */ Object writeTo(ViewPreCreationProfile viewPreCreationProfile, OutputStream outputStream, Continuation continuation) {
            return writeTo2(viewPreCreationProfile, outputStream, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p516d2.InterfaceC10274g0
        public ViewPreCreationProfile getDefaultValue() {
            return defaultValue;
        }

        /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
        public Object writeTo2(ViewPreCreationProfile viewPreCreationProfile, OutputStream outputStream, Continuation<? super Unit> continuation) {
            Object objM25596constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                AbstractC0090c abstractC0090c = json;
                AbstractC0696d abstractC0696d = abstractC0090c.f365b;
                KType kTypeNullableTypeOf = Reflection.nullableTypeOf(ViewPreCreationProfile.class);
                InterfaceC18718c<Object> interfaceC18718cM21121a = C18737v.m21121a(abstractC0696d, kTypeNullableTypeOf, true);
                if (interfaceC18718cM21121a == null) {
                    C20913y0.m25448d(C20913y0.m25447c(kTypeNullableTypeOf));
                    throw null;
                }
                InterfaceC18718c<Object> interfaceC18718c = interfaceC18718cM21121a;
                C0338H c0338h = new C0338H(outputStream);
                byte[] bArr = c0338h.f1563b;
                try {
                    C0337G.m630a(abstractC0090c, c0338h, interfaceC18718c, viewPreCreationProfile);
                    c0338h.m635e();
                    C0365i.f1642c.m752a(c0338h.f1564c);
                    C0363g.f1639c.m750a(bArr);
                    objM25596constructorimpl = Result.m25596constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    c0338h.m635e();
                    C0365i.f1642c.m752a(c0338h.f1564c);
                    C0363g.f1639c.m750a(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM25596constructorimpl = Result.m25596constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m25599exceptionOrNullimpl(objM25596constructorimpl) != null) {
                KLog.INSTANCE.isAtLeast(Severity.ERROR);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2 */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18688d2 = {"Laa/L;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "<anonymous>", "(Laa/L;)Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;"}, m18689k = 3, m18690mv = {1, 8, 0})
    @DebugMetadata(m18777c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", m18778f = "ViewPreCreationProfileRepository.kt", m18779i = {}, m18780l = {33}, m18781m = "invokeSuspend", m18782n = {}, m18784s = {})
    public static final class C101002 extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super ViewPreCreationProfile>, Object> {
        final /* synthetic */ String $id;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101002(String str, Continuation<? super C101002> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C101002 c101002 = ViewPreCreationProfileRepository.this.new C101002(this.$id, continuation);
            c101002.L$0 = obj;
            return c101002;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super ViewPreCreationProfile> continuation) {
            return ((C101002) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM25596constructorimpl;
            Object objM12545k;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ViewPreCreationProfileRepository viewPreCreationProfileRepository = ViewPreCreationProfileRepository.this;
                    String str = this.$id;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC10423g<ViewPreCreationProfile> data = ViewPreCreationProfileRepository.Companion.getStoreForId(viewPreCreationProfileRepository.context, str).getData();
                    this.label = 1;
                    objM12545k = C10427i.m12545k(data, this);
                    if (objM12545k == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objM12545k = obj;
                }
                objM25596constructorimpl = Result.m25596constructorimpl((ViewPreCreationProfile) objM12545k);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM25596constructorimpl = Result.m25596constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m25599exceptionOrNullimpl(objM25596constructorimpl) != null) {
                KLog.INSTANCE.isAtLeast(Severity.ERROR);
            }
            if (Result.m25602isFailureimpl(objM25596constructorimpl)) {
                objM25596constructorimpl = null;
            }
            ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) objM25596constructorimpl;
            return viewPreCreationProfile == null ? ViewPreCreationProfile.copy$default(ViewPreCreationProfileRepository.this.defaultProfile, this.$id, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null) : viewPreCreationProfile;
        }
    }

    public ViewPreCreationProfileRepository(Context context, ViewPreCreationProfile viewPreCreationProfile) {
        this.context = context;
        this.defaultProfile = viewPreCreationProfile;
    }

    public static Object get$suspendImpl(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, Continuation<? super ViewPreCreationProfile> continuation) {
        C11865c c11865c = C7101e0.f23142a;
        return C7106g.m8048f(ExecutorC11864b.f37309c, viewPreCreationProfileRepository.new C101002(str, null), continuation);
    }

    public Object get(String str, Continuation<? super ViewPreCreationProfile> continuation) {
        return get$suspendImpl(this, str, continuation);
    }
}
