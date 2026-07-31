package com.yandex.div.core.dagger;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.image.DivImageLoaderWrapper;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.util.bitmap.blur.HighApiBitmapEffectHelper;
import com.yandex.div.core.util.bitmap.blur.LowApiBitmapEffectHelper;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.viewpool.AdvanceViewPool;
import com.yandex.div.internal.viewpool.PseudoViewPool;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Div2Module {
    public static BitmapEffectHelper provideBitmapEffectHelper(Context context, boolean z10) {
        return (!z10 || Build.VERSION.SDK_INT < 31) ? new LowApiBitmapEffectHelper(context) : new HighApiBitmapEffectHelper();
    }

    public static DivImageLoader provideDivImageLoader(DivImageLoader divImageLoader, Context context) {
        return new DivImageLoaderWrapper(divImageLoader, context);
    }

    public static DivPreloader provideDivPreloader(DivImagePreloader divImagePreloader, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivPlayerPreloader divPlayerPreloader, DivExtensionController divExtensionController) {
        return new DivPreloader(divImagePreloader, divCustomContainerViewAdapter, divExtensionController, divPlayerPreloader, DivPreloader.PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER);
    }

    public static DivViewDataPreloader provideDivViewDataPreloader(DivImagePreloader divImagePreloader, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivPlayerPreloader divPlayerPreloader, DivExtensionController divExtensionController) {
        return new DivViewDataPreloader(divImagePreloader, divCustomContainerViewAdapter, divExtensionController, divPlayerPreloader, DivPreloader.PreloadFilter.ONLY_PRELOAD_REQUIRED_FILTER);
    }

    public static TabTextStyleProvider provideTabTextStyleProvider(DivTypefaceProvider divTypefaceProvider) {
        return new TabTextStyleProvider(divTypefaceProvider);
    }

    public static Context provideThemedContext(ContextThemeWrapper contextThemeWrapper, int i10, boolean z10) {
        return z10 ? new ContextThemeWrapperWithResourceCache(contextThemeWrapper, i10) : new ContextThemeWrapper(contextThemeWrapper, i10);
    }

    public static ViewPool provideViewPool(boolean z10, ExternalOptional<ViewPoolProfiler> externalOptional, PerformanceDependentSessionProfiler performanceDependentSessionProfiler, ViewCreator viewCreator) {
        return z10 ? new AdvanceViewPool(externalOptional.getOptional().f51358a, performanceDependentSessionProfiler, viewCreator) : new PseudoViewPool();
    }

    public static ExternalOptional<ViewPoolProfiler> provideViewPoolProfiler(boolean z10, ViewPoolProfiler.Reporter reporter) {
        return z10 ? ExternalOptional.m12183of(new ViewPoolProfiler(reporter)) : ExternalOptional.empty();
    }
}
