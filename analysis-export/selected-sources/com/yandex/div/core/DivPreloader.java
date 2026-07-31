package com.yandex.div.core;

import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.impl.C13203A2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.mozilla.javascript.ES6Iterator;
import p607i9.AbstractC12482Z;
import p607i9.AbstractC12521b3;
import p607i9.C12378Se;
import p607i9.C12554d0;
import p607i9.C12603fd;
import p607i9.C12782pd;
import p607i9.C12835sc;
import p824v8.C18635f;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\b\u001d\u001c\u001e\u001f !\"#B3\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006$"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader;", "", "Lcom/yandex/div/core/view2/DivImagePreloader;", "imagePreloader", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "customContainerViewAdapter", "Lcom/yandex/div/core/extension/DivExtensionController;", "extensionController", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "videoPreloader", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "<init>", "(Lcom/yandex/div/core/view2/DivImagePreloader;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/player/DivPlayerPreloader;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "Li9/Z;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "Lcom/yandex/div/core/DivPreloader$Ticket;", "preload", "(Li9/Z;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/DivPreloader$Callback;)Lcom/yandex/div/core/DivPreloader$Ticket;", "Lcom/yandex/div/core/view2/DivImagePreloader;", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "Lcom/yandex/div/core/extension/DivExtensionController;", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "Companion", "Callback", "DownloadCallback", "PreloadFilter", "PreloadReference", "PreloadVisitor", "Ticket", "TicketImpl", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public class DivPreloader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Callback NO_CALLBACK = new C12554d0();
    private final DivCustomContainerViewAdapter customContainerViewAdapter;
    private final DivExtensionController extensionController;
    private final DivImagePreloader imagePreloader;
    private final PreloadFilter preloadFilter;
    private final DivPlayerPreloader videoPreloader;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$Callback;", "", "finish", "", "hasErrors", "", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public interface Callback {
        void finish(boolean hasErrors);
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$Companion;", "", "()V", "NO_CALLBACK", "Lcom/yandex/div/core/DivPreloader$Callback;", "getNO_CALLBACK$div_release", "()Lcom/yandex/div/core/DivPreloader$Callback;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Callback getNO_CALLBACK$div_release() {
            return DivPreloader.NO_CALLBACK;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "<init>", "(Lcom/yandex/div/core/DivPreloader$Callback;)V", "", ES6Iterator.DONE_PROPERTY, "()V", "onSingleLoadingStarted", "Lcom/yandex/div/core/images/CachedBitmap;", "cachedBitmap", "onSuccess", "(Lcom/yandex/div/core/images/CachedBitmap;)V", "Landroid/graphics/drawable/PictureDrawable;", "pictureDrawable", "(Landroid/graphics/drawable/PictureDrawable;)V", "onError", "onFullPreloadStarted", "Lcom/yandex/div/core/DivPreloader$Callback;", "", "downloadsLeftCount", "I", "failures", "", "started", "Z", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public static final class DownloadCallback extends DivImageDownloadCallback {
        private final Callback callback;
        private int downloadsLeftCount;
        private int failures;
        private boolean started;

        public DownloadCallback(Callback callback) {
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void done() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$done$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.downloadsLeftCount--;
                        if (this.this$0.downloadsLeftCount == 0 && this.this$0.started) {
                            this.this$0.callback.finish(this.this$0.failures != 0);
                        }
                    }
                });
                return;
            }
            this.downloadsLeftCount--;
            if (this.downloadsLeftCount == 0 && this.started) {
                this.callback.finish(this.failures != 0);
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onError() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onError$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.failures++;
                        this.this$0.done();
                    }
                });
            } else {
                this.failures++;
                done();
            }
        }

        public final void onFullPreloadStarted() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onFullPreloadStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.started = true;
                        if (this.this$0.downloadsLeftCount == 0) {
                            this.this$0.callback.finish(this.this$0.failures != 0);
                        }
                    }
                });
                return;
            }
            this.started = true;
            if (this.downloadsLeftCount == 0) {
                this.callback.finish(this.failures != 0);
            }
        }

        public final void onSingleLoadingStarted() {
            if (UiThreadHandler.isMainThread()) {
                this.downloadsLeftCount++;
            } else {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onSingleLoadingStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.downloadsLeftCount++;
                    }
                });
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(CachedBitmap cachedBitmap) {
            done();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(PictureDrawable pictureDrawable) {
            done();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "", "Li9/Z;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "shouldPreloadContent", "(Li9/Z;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Li9/b3;", C13203A2.f44391g, "shouldPreloadBackground", "(Li9/b3;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Companion", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public interface PreloadFilter {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @JvmField
        public static final PreloadFilter ONLY_PRELOAD_REQUIRED_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$ONLY_PRELOAD_REQUIRED_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(AbstractC12521b3 background, ExpressionResolver resolver) {
                if (background instanceof AbstractC12521b3.a) {
                    return ((AbstractC12521b3.a) background).f41113b.f39756f.evaluate(resolver).booleanValue();
                }
                return false;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(AbstractC12482Z div, ExpressionResolver resolver) {
                if (!(div instanceof AbstractC12482Z.p)) {
                    if (div instanceof AbstractC12482Z.q) {
                        return ((AbstractC12482Z.q) div).f40852c.f40006A.evaluate(resolver).booleanValue();
                    }
                    if (div instanceof AbstractC12482Z.f) {
                        return ((AbstractC12482Z.f) div).f40841c.f39666H.evaluate(resolver).booleanValue();
                    }
                    if (div instanceof AbstractC12482Z.d) {
                        return ((AbstractC12482Z.d) div).f40839c.f43477E.evaluate(resolver).booleanValue();
                    }
                    return false;
                }
                List<C12782pd.b> list = ((AbstractC12482Z.p) div).f40851c.f42748F;
                if (list != null) {
                    List<C12782pd.b> list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        return false;
                    }
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((C12782pd.b) it.next()).f42822e.evaluate(resolver).booleanValue()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };

        @JvmField
        public static final PreloadFilter PRELOAD_ALL_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$PRELOAD_ALL_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(AbstractC12521b3 background, ExpressionResolver resolver) {
                return true;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(AbstractC12482Z div, ExpressionResolver resolver) {
                return true;
            }
        };

        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @Metadata(m18687d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadFilter$Companion;", "", "()V", "ONLY_PRELOAD_REQUIRED_FILTER", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "PRELOAD_ALL_FILTER", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        boolean shouldPreloadBackground(AbstractC12521b3 background, ExpressionResolver resolver);

        boolean shouldPreloadContent(AbstractC12482Z div, ExpressionResolver resolver);
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0019J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u001bJ\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u001dJ\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u001fJ\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010!J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010#J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivVisitor;", "", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "downloadCallback", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "<init>", "(Lcom/yandex/div/core/DivPreloader;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Lcom/yandex/div/core/DivPreloader$Callback;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "Li9/Z;", "div", "Lcom/yandex/div/core/DivPreloader$Ticket;", "preload", "(Li9/Z;)Lcom/yandex/div/core/DivPreloader$Ticket;", "data", "defaultVisit", "(Li9/Z;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Li9/Z$a;", "visit", "(Li9/Z$a;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Li9/Z$e;", "(Li9/Z$e;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Li9/Z$c;", "(Li9/Z$c;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Li9/Z$i;", "(Li9/Z$i;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Li9/Z$o;", "(Li9/Z$o;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Li9/Z$m;", "(Li9/Z$m;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Li9/Z$b;", "(Li9/Z$b;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Li9/Z$q;", "(Li9/Z$q;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/core/DivPreloader$Callback;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "ticket", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public final class PreloadVisitor extends DivVisitor<Unit> {
        private final Callback callback;
        private final DownloadCallback downloadCallback;
        private final PreloadFilter preloadFilter;
        private final ExpressionResolver resolver;
        private final TicketImpl ticket = new TicketImpl();

        public PreloadVisitor(DownloadCallback downloadCallback, Callback callback, ExpressionResolver expressionResolver, PreloadFilter preloadFilter) {
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(AbstractC12482Z abstractC12482Z, ExpressionResolver expressionResolver) {
            defaultVisit2(abstractC12482Z, expressionResolver);
            return Unit.INSTANCE;
        }

        public final Ticket preload(AbstractC12482Z div) {
            visit(div, this.resolver);
            return this.ticket;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.a data, ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.f40836c, resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((AbstractC12482Z) data, resolver);
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(AbstractC12482Z data, ExpressionResolver resolver) {
            List<LoadReference> listPreloadImage;
            DivImagePreloader divImagePreloader = DivPreloader.this.imagePreloader;
            if (divImagePreloader != null && (listPreloadImage = divImagePreloader.preloadImage(data, resolver, this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = listPreloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivPreloader.this.extensionController.preprocessExtensions(data.m14353c(), resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.e data, ExpressionResolver resolver) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.f40840c).iterator();
            while (it.hasNext()) {
                visit((AbstractC12482Z) it.next(), resolver);
            }
            defaultVisit2((AbstractC12482Z) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.c data, ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.f40838c, resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((AbstractC12482Z) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.i data, ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.f40844c, resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((AbstractC12482Z) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.o data, ExpressionResolver resolver) {
            Iterator<T> it = data.f40850c.f41588q.iterator();
            while (it.hasNext()) {
                visit(((C12603fd.a) it.next()).f41598a, resolver);
            }
            defaultVisit2((AbstractC12482Z) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.m data, ExpressionResolver resolver) {
            Iterator<T> it = data.f40848c.f42999I.iterator();
            while (it.hasNext()) {
                AbstractC12482Z abstractC12482Z = ((C12835sc.a) it.next()).f43043c;
                if (abstractC12482Z != null) {
                    visit(abstractC12482Z, resolver);
                }
            }
            defaultVisit2((AbstractC12482Z) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.b data, ExpressionResolver resolver) {
            List<AbstractC12482Z> list = data.f40837c.f43366q;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    visit((AbstractC12482Z) it.next(), resolver);
                }
            }
            this.ticket.addReference(DivPreloader.this.customContainerViewAdapter.preload(data.f40837c, this.callback));
            defaultVisit2((AbstractC12482Z) data, resolver);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.a aVar, ExpressionResolver expressionResolver) {
            visit2(aVar, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.b bVar, ExpressionResolver expressionResolver) {
            visit2(bVar, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.i iVar, ExpressionResolver expressionResolver) {
            visit2(iVar, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.m mVar, ExpressionResolver expressionResolver) {
            visit2(mVar, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.o oVar, ExpressionResolver expressionResolver) {
            visit2(oVar, expressionResolver);
            return Unit.INSTANCE;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.q qVar, ExpressionResolver expressionResolver) {
            visit2(qVar, expressionResolver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.q data, ExpressionResolver resolver) {
            defaultVisit2((AbstractC12482Z) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = data.f40852c.f40022Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C12378Se) it.next()).f40252d.evaluate(resolver));
                }
                this.ticket.addReference(DivPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$Ticket;", "", "cancel", "", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public interface Ticket {
        void cancel();
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\f\u0010\f\u001a\u00020\u0005*\u00020\tH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$TicketImpl;", "Lcom/yandex/div/core/DivPreloader$Ticket;", "()V", "refs", "", "Lcom/yandex/div/core/DivPreloader$PreloadReference;", "addImageReference", "", "reference", "Lcom/yandex/div/core/images/LoadReference;", "addReference", "cancel", "toPreloadReference", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public static final class TicketImpl implements Ticket {
        private final List<PreloadReference> refs = new ArrayList();

        private final PreloadReference toPreloadReference(final LoadReference loadReference) {
            return new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$TicketImpl$toPreloadReference$1
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public void cancel() {
                    loadReference.cancel();
                }
            };
        }

        public final void addImageReference(LoadReference reference) {
            this.refs.add(toPreloadReference(reference));
        }

        public final void addReference(PreloadReference reference) {
            this.refs.add(reference);
        }

        @Override // com.yandex.div.core.DivPreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((PreloadReference) it.next()).cancel();
            }
        }
    }

    public DivPreloader(DivImagePreloader divImagePreloader, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController, DivPlayerPreloader divPlayerPreloader, PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    public Ticket preload(AbstractC12482Z div, ExpressionResolver resolver, Callback callback) {
        DownloadCallback downloadCallback = new DownloadCallback(callback);
        Ticket ticketPreload = new PreloadVisitor(downloadCallback, callback, resolver, this.preloadFilter).preload(div);
        downloadCallback.onFullPreloadStarted();
        return ticketPreload;
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadReference;", "", "cancel", "", "Companion", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public interface PreloadReference {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        void cancel();

        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @Metadata(m18687d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18688d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadReference$Companion;", "", "()V", "EMPTY", "Lcom/yandex/div/core/DivPreloader$PreloadReference;", "getEMPTY", "()Lcom/yandex/div/core/DivPreloader$PreloadReference;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PreloadReference EMPTY = new C18635f();

            private Companion() {
            }

            public final PreloadReference getEMPTY() {
                return EMPTY;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EMPTY$lambda$0() {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NO_CALLBACK$lambda$0(boolean z10) {
    }
}
