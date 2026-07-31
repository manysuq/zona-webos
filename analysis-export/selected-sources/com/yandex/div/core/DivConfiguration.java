package com.yandex.div.core;

import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.internal.viewpool.ViewPoolProfiler;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.state.DivStateCache;
import com.yandex.div.state.InMemoryDivStateCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class DivConfiguration {
    private final boolean mAccessibilityEnabled;
    private final DivActionHandler mActionHandler;
    private boolean mBindOnAttachEnabled;
    private boolean mComplexRebindEnabled;
    private final Div2ImageStubProvider mDiv2ImageStubProvider;
    private final Div2Logger mDiv2Logger;
    private final DivCustomContainerViewAdapter mDivCustomContainerViewAdapter;
    private final DivDataChangeListener mDivDataChangeListener;
    private final DivDownloader mDivDownloader;
    private final DivPlayerFactory mDivPlayerFactory;
    private final DivPlayerPreloader mDivPlayerPreloader;
    private final DivStateCache mDivStateCache;
    private final DivStateChangeListener mDivStateChangeListener;
    private final DivVariableController mDivVariableController;
    private final List<DivVisibilityChangeListener> mDivVisibilityChangeListeners;
    private final List<DivExtensionHandler> mExtensionHandlers;
    private final DivImageLoader mImageLoader;
    private final boolean mLongtapActionsPassToChild;
    private boolean mMultipleStateChangeEnabled;
    private boolean mPagerPageClipEnabled;
    private boolean mPermanentDebugPanelEnabled;
    private float mRecyclerScrollInterceptionAngle;
    private boolean mRenderEffectEnabled;
    private boolean mResourceCacheEnabled;
    private final boolean mShouldIgnoreMenuItemsInActions;
    private final boolean mSupportHyphenation;
    private final boolean mSwipeOutBeaconsEnabled;
    private final boolean mTapBeaconsEnabled;
    private final DivTooltipRestrictor mTooltipRestrictor;
    private final DivTypefaceProvider mTypefaceProvider;
    private final Map<String, DivTypefaceProvider> mTypefaceProviders;
    private boolean mViewPoolEnabled;
    private boolean mViewPoolOptimizationDebug;
    private boolean mViewPoolProfilingEnabled;
    private final ViewPoolProfiler.Reporter mViewPoolReporter;
    private final ViewPreCreationProfile mViewPreCreationProfile;
    private final boolean mVisibilityBeaconsEnabled;
    private final boolean mVisualErrors;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class Builder {
        private DivActionHandler mActionHandler;
        private Map<String, DivTypefaceProvider> mAdditionalTypefaceProviders;
        private Div2ImageStubProvider mDiv2ImageStubProvider;
        private Div2Logger mDiv2Logger;
        private DivCustomContainerViewAdapter mDivCustomContainerViewAdapter;
        private DivDataChangeListener mDivDataChangeListener;
        private DivDownloader mDivDownloader;
        private DivPlayerFactory mDivPlayerFactory;
        private DivPlayerPreloader mDivPlayerPreloader;
        private DivStateCache mDivStateCache;
        private DivStateChangeListener mDivStateChangeListener;
        private DivVariableController mDivVariableController;
        private final DivImageLoader mImageLoader;
        private DivTooltipRestrictor mTooltipRestrictor;
        private DivTypefaceProvider mTypefaceProvider;
        private ViewPoolProfiler.Reporter mViewPoolReporter;
        private ViewPreCreationProfile mViewPreCreationProfile;
        private final List<DivVisibilityChangeListener> mDivVisibilityChangeListeners = new ArrayList();
        private final List<DivExtensionHandler> mExtensionHandlers = new ArrayList();
        private boolean mTapBeaconsEnabled = Experiment.TAP_BEACONS_ENABLED.getDefaultValue();
        private boolean mVisibilityBeaconsEnabled = Experiment.VISIBILITY_BEACONS_ENABLED.getDefaultValue();
        private boolean mSwipeOutBeaconsEnabled = Experiment.SWIPE_OUT_BEACONS_ENABLED.getDefaultValue();
        private boolean mLongtapActionsPassToChild = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.getDefaultValue();
        private boolean mShouldIgnoreMenuItemsInActions = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED.getDefaultValue();
        private boolean mSupportHyphenation = Experiment.HYPHENATION_SUPPORT_ENABLED.getDefaultValue();
        private boolean mVisualErrors = Experiment.VISUAL_ERRORS_ENABLED.getDefaultValue();
        private boolean mAccessibilityEnabled = Experiment.ACCESSIBILITY_ENABLED.getDefaultValue();
        private boolean mViewPoolEnabled = Experiment.VIEW_POOL_ENABLED.getDefaultValue();
        private boolean mViewPoolProfilingEnabled = Experiment.VIEW_POOL_PROFILING_ENABLED.getDefaultValue();
        private boolean mViewPoolOptimizationDebug = Experiment.VIEW_POOL_OPTIMIZATION_DEBUG.getDefaultValue();
        private boolean mResourceCacheEnabled = Experiment.RESOURCE_CACHE_ENABLED.getDefaultValue();
        private boolean mMultipleStateChangeEnabled = Experiment.MULTIPLE_STATE_CHANGE_ENABLED.getDefaultValue();
        private boolean mBindOnAttachEnabled = false;
        private boolean mComplexRebindEnabled = Experiment.COMPLEX_REBIND_ENABLED.getDefaultValue();
        private boolean mPagerPageClipEnabled = Experiment.PAGER_PAGE_CLIP_ENABLED.getDefaultValue();
        private boolean mPermanentDebugPanelEnabled = Experiment.PERMANENT_DEBUG_PANEL_ENABLED.getDefaultValue();
        private float mRecyclerScrollInterceptionAngle = 0.0f;
        private boolean mRenderEffectEnabled = Experiment.RENDER_EFFECT_ENABLED.getDefaultValue();

        public Builder(DivImageLoader divImageLoader) {
            this.mImageLoader = divImageLoader;
        }

        public Builder actionHandler(DivActionHandler divActionHandler) {
            this.mActionHandler = divActionHandler;
            return this;
        }

        public DivConfiguration build() {
            DivTypefaceProvider divTypefaceProvider = this.mTypefaceProvider;
            if (divTypefaceProvider == null) {
                divTypefaceProvider = DivTypefaceProvider.DEFAULT;
            }
            DivTypefaceProvider divTypefaceProvider2 = divTypefaceProvider;
            DivPlayerFactory divPlayerFactory = this.mDivPlayerFactory;
            if (divPlayerFactory == null) {
                divPlayerFactory = DivPlayerFactory.STUB;
            }
            DivPlayerFactory divPlayerFactory2 = divPlayerFactory;
            DivPlayerPreloader divPlayerPreloaderMakePreloader = this.mDivPlayerPreloader;
            if (divPlayerPreloaderMakePreloader == null) {
                divPlayerPreloaderMakePreloader = divPlayerFactory2.makePreloader();
            }
            DivPlayerPreloader divPlayerPreloader = divPlayerPreloaderMakePreloader;
            DivImageLoader divImageLoader = this.mImageLoader;
            DivActionHandler divActionHandler = this.mActionHandler;
            if (divActionHandler == null) {
                divActionHandler = new DivActionHandler();
            }
            DivActionHandler divActionHandler2 = divActionHandler;
            Div2Logger div2Logger = this.mDiv2Logger;
            if (div2Logger == null) {
                div2Logger = Div2Logger.STUB;
            }
            Div2Logger div2Logger2 = div2Logger;
            DivDataChangeListener divDataChangeListener = this.mDivDataChangeListener;
            if (divDataChangeListener == null) {
                divDataChangeListener = DivDataChangeListener.STUB;
            }
            DivDataChangeListener divDataChangeListener2 = divDataChangeListener;
            DivStateChangeListener divStateChangeListener = this.mDivStateChangeListener;
            if (divStateChangeListener == null) {
                divStateChangeListener = DivStateChangeListener.STUB;
            }
            DivStateChangeListener divStateChangeListener2 = divStateChangeListener;
            DivStateCache inMemoryDivStateCache = this.mDivStateCache;
            if (inMemoryDivStateCache == null) {
                inMemoryDivStateCache = new InMemoryDivStateCache();
            }
            DivStateCache divStateCache = inMemoryDivStateCache;
            Div2ImageStubProvider div2ImageStubProvider = this.mDiv2ImageStubProvider;
            if (div2ImageStubProvider == null) {
                div2ImageStubProvider = Div2ImageStubProvider.STUB;
            }
            Div2ImageStubProvider div2ImageStubProvider2 = div2ImageStubProvider;
            List<DivVisibilityChangeListener> list = this.mDivVisibilityChangeListeners;
            DivCustomContainerViewAdapter divCustomContainerViewAdapter = this.mDivCustomContainerViewAdapter;
            if (divCustomContainerViewAdapter == null) {
                divCustomContainerViewAdapter = DivCustomContainerViewAdapter.STUB;
            }
            DivCustomContainerViewAdapter divCustomContainerViewAdapter2 = divCustomContainerViewAdapter;
            DivTooltipRestrictor divTooltipRestrictor = this.mTooltipRestrictor;
            if (divTooltipRestrictor == null) {
                divTooltipRestrictor = DivTooltipRestrictor.STUB;
            }
            DivTooltipRestrictor divTooltipRestrictor2 = divTooltipRestrictor;
            List<DivExtensionHandler> list2 = this.mExtensionHandlers;
            DivDownloader divDownloader = this.mDivDownloader;
            if (divDownloader == null) {
                divDownloader = DivDownloader.STUB;
            }
            DivDownloader divDownloader2 = divDownloader;
            Map map = this.mAdditionalTypefaceProviders;
            if (map == null) {
                map = new HashMap();
            }
            Map map2 = map;
            ViewPreCreationProfile viewPreCreationProfile = this.mViewPreCreationProfile;
            if (viewPreCreationProfile == null) {
                viewPreCreationProfile = new ViewPreCreationProfile();
            }
            ViewPreCreationProfile viewPreCreationProfile2 = viewPreCreationProfile;
            ViewPoolProfiler.Reporter reporter = this.mViewPoolReporter;
            if (reporter == null) {
                reporter = ViewPoolProfiler.Reporter.NO_OP;
            }
            ViewPoolProfiler.Reporter reporter2 = reporter;
            DivVariableController divVariableController = this.mDivVariableController;
            if (divVariableController == null) {
                divVariableController = new DivVariableController();
            }
            return new DivConfiguration(divImageLoader, divActionHandler2, div2Logger2, divDataChangeListener2, divStateChangeListener2, divStateCache, div2ImageStubProvider2, list, divCustomContainerViewAdapter2, divPlayerFactory2, divPlayerPreloader, divTooltipRestrictor2, list2, divDownloader2, divTypefaceProvider2, map2, viewPreCreationProfile2, reporter2, divVariableController, this.mTapBeaconsEnabled, this.mVisibilityBeaconsEnabled, this.mSwipeOutBeaconsEnabled, this.mLongtapActionsPassToChild, this.mShouldIgnoreMenuItemsInActions, this.mVisualErrors, this.mSupportHyphenation, this.mAccessibilityEnabled, this.mViewPoolEnabled, this.mViewPoolProfilingEnabled, this.mViewPoolOptimizationDebug, this.mResourceCacheEnabled, this.mMultipleStateChangeEnabled, this.mBindOnAttachEnabled, this.mComplexRebindEnabled, this.mPagerPageClipEnabled, this.mPermanentDebugPanelEnabled, this.mRecyclerScrollInterceptionAngle, this.mRenderEffectEnabled);
        }

        public Builder typefaceProvider(DivTypefaceProvider divTypefaceProvider) {
            this.mTypefaceProvider = divTypefaceProvider;
            return this;
        }
    }

    public DivActionHandler getActionHandler() {
        return this.mActionHandler;
    }

    public Map<String, ? extends DivTypefaceProvider> getAdditionalTypefaceProviders() {
        return this.mTypefaceProviders;
    }

    public boolean getAreVisualErrorsEnabled() {
        return this.mVisualErrors;
    }

    public Div2ImageStubProvider getDiv2ImageStubProvider() {
        return this.mDiv2ImageStubProvider;
    }

    public Div2Logger getDiv2Logger() {
        return this.mDiv2Logger;
    }

    public DivCustomContainerViewAdapter getDivCustomContainerViewAdapter() {
        return this.mDivCustomContainerViewAdapter;
    }

    public DivDataChangeListener getDivDataChangeListener() {
        return this.mDivDataChangeListener;
    }

    public DivDownloader getDivDownloader() {
        return this.mDivDownloader;
    }

    public DivPlayerFactory getDivPlayerFactory() {
        return this.mDivPlayerFactory;
    }

    public DivPlayerPreloader getDivPlayerPreloader() {
        return this.mDivPlayerPreloader;
    }

    public DivStateCache getDivStateCache() {
        return this.mDivStateCache;
    }

    public DivStateChangeListener getDivStateChangeListener() {
        return this.mDivStateChangeListener;
    }

    public DivVariableController getDivVariableController() {
        return this.mDivVariableController;
    }

    public List<? extends DivVisibilityChangeListener> getDivVisibilityChangeListeners() {
        return this.mDivVisibilityChangeListeners;
    }

    public List<? extends DivExtensionHandler> getExtensionHandlers() {
        return this.mExtensionHandlers;
    }

    public DivImageLoader getImageLoader() {
        return this.mImageLoader;
    }

    public float getRecyclerScrollInterceptionAngle() {
        return this.mRecyclerScrollInterceptionAngle;
    }

    public DivTooltipRestrictor getTooltipRestrictor() {
        return this.mTooltipRestrictor;
    }

    public DivTypefaceProvider getTypefaceProvider() {
        return this.mTypefaceProvider;
    }

    public ViewPoolProfiler.Reporter getViewPoolReporter() {
        return this.mViewPoolReporter;
    }

    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.mViewPreCreationProfile;
    }

    @Deprecated(message = "Accessibility is always enabled")
    public boolean isAccessibilityEnabled() {
        return this.mAccessibilityEnabled;
    }

    public boolean isBindOnAttachEnabled() {
        return this.mBindOnAttachEnabled;
    }

    public boolean isComplexRebindEnabled() {
        return this.mComplexRebindEnabled;
    }

    public boolean isContextMenuHandlerOverridden() {
        return this.mShouldIgnoreMenuItemsInActions;
    }

    public boolean isDebuggingViewPoolOptimization() {
        return this.mViewPoolOptimizationDebug;
    }

    public boolean isHyphenationSupported() {
        return this.mSupportHyphenation;
    }

    public boolean isLongtapActionsPassToChild() {
        return this.mLongtapActionsPassToChild;
    }

    public boolean isMultipleStateChangeEnabled() {
        return this.mMultipleStateChangeEnabled;
    }

    public boolean isPagerPageClipEnabled() {
        return this.mPagerPageClipEnabled;
    }

    public boolean isPermanentDebugPanelEnabled() {
        return this.mPermanentDebugPanelEnabled;
    }

    public boolean isRenderEffectEnabled() {
        return this.mRenderEffectEnabled;
    }

    public boolean isResourceCacheEnabled() {
        return this.mResourceCacheEnabled;
    }

    public boolean isSwipeOutBeaconsEnabled() {
        return this.mSwipeOutBeaconsEnabled;
    }

    public boolean isTapBeaconsEnabled() {
        return this.mTapBeaconsEnabled;
    }

    public boolean isViewPoolEnabled() {
        return this.mViewPoolEnabled;
    }

    public boolean isViewPoolProfilingEnabled() {
        return this.mViewPoolProfilingEnabled;
    }

    public boolean isVisibilityBeaconsEnabled() {
        return this.mVisibilityBeaconsEnabled;
    }

    private DivConfiguration(DivImageLoader divImageLoader, DivActionHandler divActionHandler, Div2Logger div2Logger, DivDataChangeListener divDataChangeListener, DivStateChangeListener divStateChangeListener, DivStateCache divStateCache, Div2ImageStubProvider div2ImageStubProvider, List<DivVisibilityChangeListener> list, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivPlayerFactory divPlayerFactory, DivPlayerPreloader divPlayerPreloader, DivTooltipRestrictor divTooltipRestrictor, List<DivExtensionHandler> list2, DivDownloader divDownloader, DivTypefaceProvider divTypefaceProvider, Map<String, DivTypefaceProvider> map, ViewPreCreationProfile viewPreCreationProfile, ViewPoolProfiler.Reporter reporter, DivVariableController divVariableController, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, float f10, boolean z27) {
        this.mImageLoader = divImageLoader;
        this.mActionHandler = divActionHandler;
        this.mDiv2Logger = div2Logger;
        this.mDivDataChangeListener = divDataChangeListener;
        this.mDivStateChangeListener = divStateChangeListener;
        this.mDivStateCache = divStateCache;
        this.mDiv2ImageStubProvider = div2ImageStubProvider;
        this.mDivVisibilityChangeListeners = list;
        this.mDivCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.mDivPlayerFactory = divPlayerFactory;
        this.mDivPlayerPreloader = divPlayerPreloader;
        this.mTooltipRestrictor = divTooltipRestrictor;
        this.mExtensionHandlers = list2;
        this.mDivDownloader = divDownloader;
        this.mTypefaceProvider = divTypefaceProvider;
        this.mTypefaceProviders = map;
        this.mViewPoolReporter = reporter;
        this.mTapBeaconsEnabled = z10;
        this.mVisibilityBeaconsEnabled = z11;
        this.mSwipeOutBeaconsEnabled = z12;
        this.mLongtapActionsPassToChild = z13;
        this.mShouldIgnoreMenuItemsInActions = z14;
        this.mVisualErrors = z15;
        this.mSupportHyphenation = z16;
        this.mAccessibilityEnabled = z17;
        this.mViewPoolEnabled = z18;
        this.mViewPreCreationProfile = viewPreCreationProfile;
        this.mViewPoolProfilingEnabled = z19;
        this.mViewPoolOptimizationDebug = z20;
        this.mResourceCacheEnabled = z21;
        this.mMultipleStateChangeEnabled = z22;
        this.mBindOnAttachEnabled = z23;
        this.mComplexRebindEnabled = z24;
        this.mPermanentDebugPanelEnabled = z26;
        this.mDivVariableController = divVariableController;
        this.mRecyclerScrollInterceptionAngle = f10;
        this.mPagerPageClipEnabled = z25;
        this.mRenderEffectEnabled = z27;
    }
}
