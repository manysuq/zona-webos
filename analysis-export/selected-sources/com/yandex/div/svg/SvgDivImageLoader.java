package com.yandex.div.svg;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.p659io.ByteStreamsKt;
import kotlin.p659io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.C17372e;
import p027B8.C0327a;
import p119Ga.AbstractC1750A;
import p119Ga.C1776u;
import p119Ga.InterfaceC1757b;
import p478aa.C7061M;
import p478aa.C7101e0;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p588h9.C11860a;
import p589ha.C11865c;
import p589ha.ExecutorC11864b;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m18688d2 = {"Lcom/yandex/div/svg/SvgDivImageLoader;", "Lcom/yandex/div/core/images/DivImageLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "imageUrl", "LGa/b;", "createCallOrNull", "(Ljava/lang/String;)LGa/b;", "call", "", "downloadImage", "(LGa/b;)[B", "getImageData", "(Ljava/lang/String;)[B", "", "hasSvgSupport", "()Ljava/lang/Boolean;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "callback", "Lcom/yandex/div/core/images/LoadReference;", "loadImage", "(Ljava/lang/String;Lcom/yandex/div/core/images/DivImageDownloadCallback;)Lcom/yandex/div/core/images/LoadReference;", "loadImageBytes", "Landroid/content/Context;", "LGa/u;", "httpClient", "LGa/u;", "Laa/L;", "coroutineScope", "Laa/L;", "Lcom/yandex/div/svg/SvgDecoder;", "svgDecoder", "Lcom/yandex/div/svg/SvgDecoder;", "Lcom/yandex/div/svg/SvgCacheManager;", "svgCacheManager", "Lcom/yandex/div/svg/SvgCacheManager;", "div-svg_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class SvgDivImageLoader implements DivImageLoader {
    private final Context context;
    private final C1776u httpClient = new C1776u(new C1776u.a());
    private final InterfaceC7059L coroutineScope = C7061M.m7997b();
    private final SvgDecoder svgDecoder = new SvgDecoder(false, 1, null);
    private final SvgCacheManager svgCacheManager = new SvgCacheManager();

    /* JADX INFO: renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2 */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18688d2 = {"Laa/L;", "", "<anonymous>", "(Laa/L;)V"}, m18689k = 3, m18690mv = {1, 8, 0})
    @DebugMetadata(m18777c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", m18778f = "SvgDivImageLoader.kt", m18779i = {}, m18780l = {36}, m18781m = "invokeSuspend", m18782n = {}, m18784s = {})
    public static final class C101322 extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC1757b $call;
        final /* synthetic */ DivImageDownloadCallback $callback;
        final /* synthetic */ String $imageUrl;
        int label;
        final /* synthetic */ SvgDivImageLoader this$0;

        /* JADX INFO: renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @Metadata(m18687d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18688d2 = {"Laa/L;", "Landroid/graphics/drawable/PictureDrawable;", "<anonymous>", "(Laa/L;)Landroid/graphics/drawable/PictureDrawable;"}, m18689k = 3, m18690mv = {1, 8, 0})
        @DebugMetadata(m18777c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1", m18778f = "SvgDivImageLoader.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18784s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super PictureDrawable>, Object> {
            final /* synthetic */ InterfaceC1757b $call;
            final /* synthetic */ String $imageUrl;
            int label;
            final /* synthetic */ SvgDivImageLoader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC1757b interfaceC1757b, SvgDivImageLoader svgDivImageLoader, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$call = interfaceC1757b;
                this.this$0 = svgDivImageLoader;
                this.$imageUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super PictureDrawable> continuation) {
                return ((AnonymousClass1) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                PictureDrawable pictureDrawableDecode;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC1757b interfaceC1757b = this.$call;
                byte[] imageData = interfaceC1757b == null ? this.this$0.getImageData(this.$imageUrl) : this.this$0.downloadImage(interfaceC1757b);
                if (imageData == null || (pictureDrawableDecode = this.this$0.svgDecoder.decode(new ByteArrayInputStream(imageData))) == null) {
                    return null;
                }
                this.this$0.svgCacheManager.set(this.$imageUrl, pictureDrawableDecode);
                return pictureDrawableDecode;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101322(DivImageDownloadCallback divImageDownloadCallback, InterfaceC1757b interfaceC1757b, SvgDivImageLoader svgDivImageLoader, String str, Continuation<? super C101322> continuation) {
            super(2, continuation);
            this.$callback = divImageDownloadCallback;
            this.$call = interfaceC1757b;
            this.this$0 = svgDivImageLoader;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C101322(this.$callback, this.$call, this.this$0, this.$imageUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((C101322) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            Unit unit = null;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C11865c c11865c = C7101e0.f23142a;
                ExecutorC11864b executorC11864b = ExecutorC11864b.f37309c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, null);
                this.label = 1;
                obj = C7106g.m8048f(executorC11864b, anonymousClass1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PictureDrawable pictureDrawable = (PictureDrawable) obj;
            if (pictureDrawable != null) {
                this.$callback.onSuccess(pictureDrawable);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.$callback.onError();
            }
            return Unit.INSTANCE;
        }
    }

    public SvgDivImageLoader(Context context) {
        this.context = context;
    }

    private final InterfaceC1757b createCallOrNull(String imageUrl) {
        if (!StringsKt__StringsJVMKt.startsWith$default(imageUrl, "http://", false, 2, null) && !StringsKt__StringsJVMKt.startsWith$default(imageUrl, "https://", false, 2, null)) {
            return null;
        }
        C17372e.a aVar = new C17372e.a();
        aVar.m19828c(imageUrl);
        return this.httpClient.mo2488b(new C17372e(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] downloadImage(InterfaceC1757b call) {
        Object objM25596constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AbstractC1750A abstractC1750ABody = call.execute().body();
            objM25596constructorimpl = Result.m25596constructorimpl(abstractC1750ABody != null ? abstractC1750ABody.m2471a() : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM25596constructorimpl = Result.m25596constructorimpl(ResultKt.createFailure(th));
        }
        return (byte[]) (Result.m25602isFailureimpl(objM25596constructorimpl) ? null : objM25596constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getImageData(String imageUrl) {
        AssetManager assets;
        InputStream inputStreamOpen;
        String strRemovePrefix = StringsKt__StringsKt.removePrefix(imageUrl, (CharSequence) "file:///android_asset/");
        Context applicationContext = this.context.getApplicationContext();
        if (applicationContext == null || (assets = applicationContext.getAssets()) == null || (inputStreamOpen = assets.open(strRemovePrefix)) == null) {
            return null;
        }
        try {
            byte[] bytes = ByteStreamsKt.readBytes(inputStreamOpen);
            CloseableKt.closeFinally(inputStreamOpen, null);
            return bytes;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$1(InterfaceC1757b interfaceC1757b) {
        if (interfaceC1757b != null) {
            interfaceC1757b.cancel();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final /* synthetic */ LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return C0327a.m613b(this, str, divImageDownloadCallback, i10);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final /* synthetic */ LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return C0327a.m614c(this, str, divImageDownloadCallback, i10);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImage(String imageUrl, DivImageDownloadCallback callback) {
        final InterfaceC1757b interfaceC1757bCreateCallOrNull = createCallOrNull(imageUrl);
        PictureDrawable pictureDrawable = this.svgCacheManager.get(imageUrl);
        if (pictureDrawable != null) {
            callback.onSuccess(pictureDrawable);
            return new C11860a();
        }
        C7106g.m8045c(this.coroutineScope, null, null, new C101322(callback, interfaceC1757bCreateCallOrNull, this, imageUrl, null), 3);
        return new LoadReference() { // from class: h9.b
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImage$lambda$1(interfaceC1757bCreateCallOrNull);
            }
        };
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImageBytes(final String imageUrl, final DivImageDownloadCallback callback) {
        return new LoadReference() { // from class: h9.c
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                this.f37279a.loadImage(imageUrl, callback);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$0() {
    }
}
