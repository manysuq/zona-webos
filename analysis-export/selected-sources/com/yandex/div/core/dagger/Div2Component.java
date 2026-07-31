package com.yandex.div.core.dagger;

import android.view.ContextThemeWrapper;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.actions.DivActionTypedHandlerCombiner;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.histogram.reporter.HistogramReporter;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public interface Div2Component {

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface Builder {
        Builder baseContext(ContextThemeWrapper contextThemeWrapper);

        Div2Component build();

        Builder configuration(DivConfiguration divConfiguration);

        Builder divCreationTracker(DivCreationTracker divCreationTracker);

        Builder divVariableController(DivVariableController divVariableController);

        Builder themeId(int i10);
    }

    DivActionBinder getActionBinder();

    DivActionHandler getActionHandler();

    DivActionTypedHandlerCombiner getActionTypedHandlerCombiner();

    BitmapEffectHelper getBitmapEffectHelper();

    Div2Builder getDiv2Builder();

    Div2Logger getDiv2Logger();

    DivBinder getDivBinder();

    DivCreationTracker getDivCreationTracker();

    DivCustomContainerChildFactory getDivCustomContainerChildFactory();

    DivDataChangeListener getDivDataChangeListener();

    DivDownloader getDivDownloader();

    DivStateChangeListener getDivStateChangeListener();

    DivTimerEventDispatcherProvider getDivTimersControllerProvider();

    DivVariableController getDivVariableController();

    DivVideoActionHandler getDivVideoActionHandler();

    DivViewDataPreloader getDivViewDataPreloader();

    HistogramReporter getHistogramReporter();

    ReleaseManager getReleaseManager();

    RuntimeStoreProvider getRuntimeStoreProvider();

    DivStateManager getStateManager();

    StoredValuesController getStoredValuesController();

    TemporaryDivStateCache getTemporaryDivStateCache();

    DivTooltipController getTooltipController();

    DivVisibilityActionTracker getVisibilityActionTracker();

    boolean isBindOnAttachEnabled();

    boolean isComplexRebindEnabled();

    boolean isPagerPageClipEnabled();

    Div2ViewComponent.Builder viewComponent();
}
