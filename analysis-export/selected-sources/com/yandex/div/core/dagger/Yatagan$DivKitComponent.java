package com.yandex.div.core.dagger;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.actions.DivActionTypedArrayMutationHandler;
import com.yandex.div.core.actions.DivActionTypedClearFocusHandler;
import com.yandex.div.core.actions.DivActionTypedCopyToClipboardHandler;
import com.yandex.div.core.actions.DivActionTypedDictSetValueHandler;
import com.yandex.div.core.actions.DivActionTypedFocusElementHandler;
import com.yandex.div.core.actions.DivActionTypedHandler;
import com.yandex.div.core.actions.DivActionTypedHandlerCombiner;
import com.yandex.div.core.actions.DivActionTypedHideTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedScrollHandler;
import com.yandex.div.core.actions.DivActionTypedSetStateHandler;
import com.yandex.div.core.actions.DivActionTypedSetStoredValueHandler;
import com.yandex.div.core.actions.DivActionTypedSetVariableHandler;
import com.yandex.div.core.actions.DivActionTypedShowTooltipHandler;
import com.yandex.div.core.actions.DivActionTypedSubmitHandler;
import com.yandex.div.core.actions.DivActionTypedTimerHandler;
import com.yandex.div.core.actions.DivActionTypedUpdateStructureHandler;
import com.yandex.div.core.actions.DivActionTypedVideoHandler;
import com.yandex.div.core.actions.DivAnimatorTypedActionHandler;
import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStateChangeListener;
import com.yandex.div.core.state.DivStateManager;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.timer.DivTimerEventDispatcherProvider;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.tooltip.DivTooltipViewBuilder;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ReportingSafeDrawingPassOverrideStrategy;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivValidator;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.DivVisibilityActionDispatcher;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.ViewVisibilityCalculator;
import com.yandex.div.core.view2.animations.DivAnimatorController;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivLayoutParamsBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.viewpool.ViewCreator;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.storage.DivStorageComponent;
import java.util.HashSet;
import java.util.Set;
import p653k9.InterfaceC15828a;
import p764r8.C17865d;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {
    final Context mApplicationContext;
    private volatile Object mDivActionTypedHandlerCombinerInstance;
    final DivKitConfiguration mDivKitConfiguration;
    private volatile Object mDivParsingHistogramReporterInstance;
    private volatile Object mDivStorageComponentInstance;
    private volatile Object mHistogramColdTypeCheckerInstance;
    private volatile Object mHistogramRecorderInstance;
    private volatile Object mSendBeaconManagerInstance;
    private volatile Object mViewCreatorInstance;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class ComponentFactoryImpl implements DivKitComponent.Builder {
        private Context mApplicationContext;
        private DivKitConfiguration mConfiguration;

        private ComponentFactoryImpl() {
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder applicationContext(Context context) {
            this.mApplicationContext = context;
            return this;
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent build() {
            return new Yatagan$DivKitComponent(this.mApplicationContext, this.mConfiguration);
        }

        @Override // com.yandex.div.core.dagger.DivKitComponent.Builder
        public DivKitComponent.Builder configuration(DivKitConfiguration divKitConfiguration) {
            this.mConfiguration = divKitConfiguration;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class Div2ComponentImpl implements Div2Component {
        private Object mAccessibilityStateProviderInstance;
        final ContextThemeWrapper mBaseContext;
        private Object mBitmapEffectHelperInstance;
        private Object mDiv2BuilderInstance;
        private Object mDivActionBeaconSenderInstance;
        private Object mDivActionBinderInstance;
        private Object mDivBaseBinderInstance;
        private Object mDivBinderInstance;
        final DivConfiguration mDivConfiguration;
        final DivCreationTracker mDivCreationTracker;
        private Object mDivExtensionControllerInstance;
        private Object mDivImageLoaderInstance;
        private Object mDivImagePreloaderInstance;
        final Yatagan$DivKitComponent mDivKitComponent;
        private Object mDivPatchCacheInstance;
        private Object mDivPatchManagerInstance;
        private Object mDivPlaceholderLoaderInstance;
        private Object mDivPreloaderInstance;
        private Object mDivRuntimeVisitorInstance;
        private Object mDivStateManagerInstance;
        private Object mDivTimerEventDispatcherProviderInstance;
        private Object mDivTooltipControllerInstance;
        private Object mDivTypefaceResolverInstance;
        private Object mDivValidatorInstance;
        final DivVariableController mDivVariableController;
        private Object mDivVideoActionHandlerInstance;
        private Object mDivVideoViewMapperInstance;
        private Object mDivViewCreatorInstance;
        private Object mDivViewDataPreloaderInstance;
        private Object mDivViewIdProviderInstance;
        private Object mDivVisibilityActionDispatcherInstance;
        private Object mDivVisibilityActionTrackerInstance;
        private Object mErrorCollectorsInstance;
        private Object mHistogramReporterInstance;
        private Object mJavaxInjectNamedValueThemedContextContextInstance;
        private Object mPagerIndicatorConnectorInstance;
        private Object mPerformanceDependentSessionProfilerInstance;
        private Object mReleaseManagerInstance;
        private Object mRuntimeStoreProviderInstance;
        private Object mStoredValuesControllerInstance;
        private Object mTabsStateCacheInstance;
        private Object mTemporaryDivStateCacheInstance;
        final Integer mThemeId;
        private Object mTwoWayIntegerVariableBinderInstance;
        private Object mTwoWayStringVariableBinderInstance;
        private Object mViewPoolInstance;
        private Object mViewPreCreationProfileRepositoryInstance;

        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class ComponentFactoryImpl implements Div2Component.Builder {
            Yatagan$DivKitComponent fDivKitComponent;
            private ContextThemeWrapper mBaseContext;
            private DivConfiguration mConfiguration;
            private DivCreationTracker mDivCreationTracker;
            private DivVariableController mDivVariableController;
            private Integer mThemeId;

            public ComponentFactoryImpl(Yatagan$DivKitComponent yatagan$DivKitComponent) {
                this.fDivKitComponent = yatagan$DivKitComponent;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder baseContext(ContextThemeWrapper contextThemeWrapper) {
                this.mBaseContext = contextThemeWrapper;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component build() {
                return new Div2ComponentImpl(this.fDivKitComponent, this.mBaseContext, this.mConfiguration, this.mThemeId, this.mDivCreationTracker, this.mDivVariableController);
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder configuration(DivConfiguration divConfiguration) {
                this.mConfiguration = divConfiguration;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divCreationTracker(DivCreationTracker divCreationTracker) {
                this.mDivCreationTracker = divCreationTracker;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder divVariableController(DivVariableController divVariableController) {
                this.mDivVariableController = divVariableController;
                return this;
            }

            @Override // com.yandex.div.core.dagger.Div2Component.Builder
            public Div2Component.Builder themeId(int i10) {
                this.mThemeId = Integer.valueOf(i10);
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class Div2ViewComponentImpl implements Div2ViewComponent {
            final Div2ComponentImpl mDiv2Component;
            private Object mDivAnimatorControllerInstance;
            private Object mDivStateSwitcherInstance;
            private Object mDivStateTransitionHolderInstance;
            private Object mDivTransitionBuilderInstance;
            final Div2View mDivView;
            private Object mErrorVisualMonitorInstance;
            private Object mInputFocusTrackerInstance;
            private Object mMediaReleaseViewVisitorInstance;
            private Object mReleaseViewVisitorInstance;
            private Object mReportingSafeDrawingPassOverrideStrategyInstance;
            private Object mViewBindingProviderInstance;

            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class CachingProviderImpl implements InterfaceC15828a {
                private final Div2ViewComponentImpl mDelegate;
                private final int mIndex;
                private Object mValue;

                public CachingProviderImpl(Div2ViewComponentImpl div2ViewComponentImpl, int i10) {
                    this.mDelegate = div2ViewComponentImpl;
                    this.mIndex = i10;
                }

                @Override // p460Z9.InterfaceC6773a
                public Object get() {
                    Object obj = this.mValue;
                    if (obj != null) {
                        return obj;
                    }
                    Object objSwitch$$access = this.mDelegate.switch$$access(this.mIndex);
                    this.mValue = objSwitch$$access;
                    return objSwitch$$access;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {
                Div2ComponentImpl fDiv2Component;
                private Div2View mDivView;

                public ComponentFactoryImpl(Div2ComponentImpl div2ComponentImpl) {
                    this.fDiv2Component = div2ComponentImpl;
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent build() {
                    return new Div2ViewComponentImpl(this.fDiv2Component, this.mDivView);
                }

                @Override // com.yandex.div.core.dagger.Div2ViewComponent.Builder
                public Div2ViewComponent.Builder divView(Div2View div2View) {
                    this.mDivView = div2View;
                    return this;
                }
            }

            public Div2ViewComponentImpl(Div2ComponentImpl div2ComponentImpl, Div2View div2View) {
                this.mDiv2Component = div2ComponentImpl;
                this.mDivView = div2View;
            }

            public DivAnimatorController cacheDivAnimatorController() {
                Object divAnimatorController = this.mDivAnimatorControllerInstance;
                if (divAnimatorController == null) {
                    divAnimatorController = new DivAnimatorController(this.mDivView);
                    this.mDivAnimatorControllerInstance = divAnimatorController;
                }
                return (DivAnimatorController) divAnimatorController;
            }

            public DivStateSwitcher cacheDivStateSwitcher() {
                Object objM12185a = this.mDivStateSwitcherInstance;
                if (objM12185a == null) {
                    objM12185a = C9870a.m12185a(this.mDiv2Component.mDivConfiguration.isMultipleStateChangeEnabled(), new CachingProviderImpl(this, 0), new CachingProviderImpl(this, 1));
                    this.mDivStateSwitcherInstance = objM12185a;
                }
                return (DivStateSwitcher) objM12185a;
            }

            public DivStateTransitionHolder cacheDivStateTransitionHolder() {
                Object divStateTransitionHolder = this.mDivStateTransitionHolderInstance;
                if (divStateTransitionHolder == null) {
                    divStateTransitionHolder = new DivStateTransitionHolder(this.mDivView);
                    this.mDivStateTransitionHolderInstance = divStateTransitionHolder;
                }
                return (DivStateTransitionHolder) divStateTransitionHolder;
            }

            public DivTransitionBuilder cacheDivTransitionBuilder() {
                Object divTransitionBuilder = this.mDivTransitionBuilderInstance;
                if (divTransitionBuilder == null) {
                    Div2ComponentImpl div2ComponentImpl = this.mDiv2Component;
                    divTransitionBuilder = new DivTransitionBuilder(div2ComponentImpl.mBaseContext, div2ComponentImpl.cacheDivViewIdProvider());
                    this.mDivTransitionBuilderInstance = divTransitionBuilder;
                }
                return (DivTransitionBuilder) divTransitionBuilder;
            }

            public ErrorVisualMonitor cacheErrorVisualMonitor() {
                Object obj = this.mErrorVisualMonitorInstance;
                if (obj == null) {
                    ErrorVisualMonitor errorVisualMonitor = new ErrorVisualMonitor(this.mDiv2Component.cacheErrorCollectors(), this.mDivView, Boolean.valueOf(this.mDiv2Component.mDivConfiguration.getAreVisualErrorsEnabled()).booleanValue(), Boolean.valueOf(this.mDiv2Component.mDivConfiguration.isPermanentDebugPanelEnabled()).booleanValue(), cacheViewBindingProvider(), this.mDiv2Component.mDivConfiguration.getTypefaceProvider());
                    this.mErrorVisualMonitorInstance = errorVisualMonitor;
                    obj = errorVisualMonitor;
                }
                return (ErrorVisualMonitor) obj;
            }

            public InputFocusTracker cacheInputFocusTracker() {
                Object inputFocusTracker = this.mInputFocusTrackerInstance;
                if (inputFocusTracker == null) {
                    inputFocusTracker = new InputFocusTracker(this.mDivView);
                    this.mInputFocusTrackerInstance = inputFocusTracker;
                }
                return (InputFocusTracker) inputFocusTracker;
            }

            public MediaReleaseViewVisitor cacheMediaReleaseViewVisitor() {
                Object mediaReleaseViewVisitor = this.mMediaReleaseViewVisitorInstance;
                if (mediaReleaseViewVisitor == null) {
                    mediaReleaseViewVisitor = new MediaReleaseViewVisitor();
                    this.mMediaReleaseViewVisitorInstance = mediaReleaseViewVisitor;
                }
                return (MediaReleaseViewVisitor) mediaReleaseViewVisitor;
            }

            public ReleaseViewVisitor cacheReleaseViewVisitor() {
                Object releaseViewVisitor = this.mReleaseViewVisitorInstance;
                if (releaseViewVisitor == null) {
                    releaseViewVisitor = new ReleaseViewVisitor(this.mDivView, this.mDiv2Component.mDivConfiguration.getDivCustomContainerViewAdapter(), this.mDiv2Component.cacheDivExtensionController());
                    this.mReleaseViewVisitorInstance = releaseViewVisitor;
                }
                return (ReleaseViewVisitor) releaseViewVisitor;
            }

            public ReportingSafeDrawingPassOverrideStrategy cacheReportingSafeDrawingPassOverrideStrategy() {
                Object reportingSafeDrawingPassOverrideStrategy = this.mReportingSafeDrawingPassOverrideStrategyInstance;
                if (reportingSafeDrawingPassOverrideStrategy == null) {
                    reportingSafeDrawingPassOverrideStrategy = new ReportingSafeDrawingPassOverrideStrategy(this.mDivView, this.mDiv2Component.mDivConfiguration.getDiv2Logger());
                    this.mReportingSafeDrawingPassOverrideStrategyInstance = reportingSafeDrawingPassOverrideStrategy;
                }
                return (ReportingSafeDrawingPassOverrideStrategy) reportingSafeDrawingPassOverrideStrategy;
            }

            public ViewBindingProvider cacheViewBindingProvider() {
                Object viewBindingProvider = this.mViewBindingProviderInstance;
                if (viewBindingProvider == null) {
                    viewBindingProvider = new ViewBindingProvider();
                    this.mViewBindingProviderInstance = viewBindingProvider;
                }
                return (ViewBindingProvider) viewBindingProvider;
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivAnimatorController getAnimatorController() {
                return cacheDivAnimatorController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ViewBindingProvider getBindingProvider() {
                return cacheViewBindingProvider();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTooltipController getDivTooltipController() {
                return this.mDiv2Component.cacheDivTooltipController();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DrawingPassOverrideStrategy getDrawingPassOverrideStrategy() {
                return cacheReportingSafeDrawingPassOverrideStrategy();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorCollectors getErrorCollectors() {
                return this.mDiv2Component.cacheErrorCollectors();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ErrorVisualMonitor getErrorMonitor() {
                return cacheErrorVisualMonitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public InputFocusTracker getInputFocusTracker() {
                return cacheInputFocusTracker();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public MediaReleaseViewVisitor getMediaReleaseViewVisitor() {
                return cacheMediaReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public ReleaseViewVisitor getReleaseViewVisitor() {
                return cacheReleaseViewVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivRuntimeVisitor getRuntimeVisitor() {
                return this.mDiv2Component.cacheDivRuntimeVisitor();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateSwitcher getStateSwitcher() {
                return cacheDivStateSwitcher();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivStateTransitionHolder getStateTransitionHolder() {
                return cacheDivStateTransitionHolder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivTransitionBuilder getTransitionBuilder() {
                return cacheDivTransitionBuilder();
            }

            @Override // com.yandex.div.core.dagger.Div2ViewComponent
            public DivViewIdProvider getViewIdProvider() {
                return this.mDiv2Component.cacheDivViewIdProvider();
            }

            public Object switch$$access(int i10) {
                if (i10 == 0) {
                    return new DivJoinedStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                if (i10 == 1) {
                    return new DivMultipleStateSwitcher(this.mDivView, this.mDiv2Component.cacheDivBinder());
                }
                throw new AssertionError();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class ProviderImpl implements InterfaceC15828a {
            private final Div2ComponentImpl mDelegate;
            private final int mIndex;

            public ProviderImpl(Div2ComponentImpl div2ComponentImpl, int i10) {
                this.mDelegate = div2ComponentImpl;
                this.mIndex = i10;
            }

            @Override // p460Z9.InterfaceC6773a
            public Object get() {
                return this.mDelegate.switch$$access(this.mIndex);
            }
        }

        public Div2ComponentImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, Integer num, DivCreationTracker divCreationTracker, DivVariableController divVariableController) {
            this.mDivKitComponent = yatagan$DivKitComponent;
            this.mBaseContext = contextThemeWrapper;
            this.mDivConfiguration = divConfiguration;
            this.mThemeId = num;
            this.mDivCreationTracker = divCreationTracker;
            this.mDivVariableController = divVariableController;
        }

        public AccessibilityStateProvider cacheAccessibilityStateProvider() {
            Object accessibilityStateProvider = this.mAccessibilityStateProviderInstance;
            if (accessibilityStateProvider == null) {
                accessibilityStateProvider = new AccessibilityStateProvider(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()).booleanValue());
                this.mAccessibilityStateProviderInstance = accessibilityStateProvider;
            }
            return (AccessibilityStateProvider) accessibilityStateProvider;
        }

        public BitmapEffectHelper cacheBitmapEffectHelper() {
            Object objProvideBitmapEffectHelper = this.mBitmapEffectHelperInstance;
            if (objProvideBitmapEffectHelper == null) {
                objProvideBitmapEffectHelper = Div2Module.provideBitmapEffectHelper(this.mBaseContext, Boolean.valueOf(this.mDivConfiguration.isRenderEffectEnabled()).booleanValue());
                this.mBitmapEffectHelperInstance = objProvideBitmapEffectHelper;
            }
            return (BitmapEffectHelper) objProvideBitmapEffectHelper;
        }

        public Div2Builder cacheDiv2Builder() {
            Object div2Builder = this.mDiv2BuilderInstance;
            if (div2Builder == null) {
                div2Builder = new Div2Builder(cacheDivViewCreator(), cacheDivBinder(), cacheDivRuntimeVisitor());
                this.mDiv2BuilderInstance = div2Builder;
            }
            return (Div2Builder) div2Builder;
        }

        public DivActionBeaconSender cacheDivActionBeaconSender() {
            Object divActionBeaconSender = this.mDivActionBeaconSenderInstance;
            if (divActionBeaconSender == null) {
                divActionBeaconSender = new DivActionBeaconSender(new ProviderImpl(this.mDivKitComponent, 3), this.mDivConfiguration.isTapBeaconsEnabled(), this.mDivConfiguration.isVisibilityBeaconsEnabled(), this.mDivConfiguration.isSwipeOutBeaconsEnabled());
                this.mDivActionBeaconSenderInstance = divActionBeaconSender;
            }
            return (DivActionBeaconSender) divActionBeaconSender;
        }

        public DivActionBinder cacheDivActionBinder() {
            Object obj = this.mDivActionBinderInstance;
            if (obj == null) {
                DivActionBinder divActionBinder = new DivActionBinder(this.mDivConfiguration.getActionHandler(), this.mDivConfiguration.getDiv2Logger(), cacheDivActionBeaconSender(), Boolean.valueOf(this.mDivConfiguration.isLongtapActionsPassToChild()).booleanValue(), Boolean.valueOf(this.mDivConfiguration.isContextMenuHandlerOverridden()).booleanValue());
                this.mDivActionBinderInstance = divActionBinder;
                obj = divActionBinder;
            }
            return (DivActionBinder) obj;
        }

        public DivBaseBinder cacheDivBaseBinder() {
            Object obj = this.mDivBaseBinderInstance;
            if (obj == null) {
                DivBaseBinder divBaseBinder = new DivBaseBinder(new DivBackgroundBinder(cacheDivImageLoader()), cacheDivTooltipController(), new DivFocusBinder(cacheDivActionBinder()), new DivAccessibilityBinder(Boolean.valueOf(this.mDivConfiguration.isAccessibilityEnabled()).booleanValue(), cacheAccessibilityStateProvider()), new DivLayoutParamsBinder(cacheErrorCollectors()));
                this.mDivBaseBinderInstance = divBaseBinder;
                obj = divBaseBinder;
            }
            return (DivBaseBinder) obj;
        }

        public DivBinder cacheDivBinder() {
            Object obj = this.mDivBinderInstance;
            if (obj == null) {
                DivBinder divBinder = new DivBinder(cacheDivValidator(), new DivTextBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), new SpannedTextBuilder(cacheDivTypefaceResolver(), cacheDivImageLoader()), Boolean.valueOf(this.mDivConfiguration.isHyphenationSupported()).booleanValue()), new DivContainerBinder(cacheDivBaseBinder(), new ProviderImpl(this, 2), cacheDivPatchManager(), new ProviderImpl(this, 0), cacheErrorCollectors()), new DivSeparatorBinder(cacheDivBaseBinder()), new DivImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGifImageBinder(cacheDivBaseBinder(), cacheDivImageLoader(), cacheDivPlaceholderLoader(), cacheErrorCollectors()), new DivGridBinder(cacheDivBaseBinder(), cacheDivPatchManager(), new ProviderImpl(this, 0), new ProviderImpl(this, 2)), new DivGalleryBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()).floatValue()), new DivPagerBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheDivPatchCache(), cacheDivActionBinder(), cachePagerIndicatorConnector(), cacheAccessibilityStateProvider()), new DivTabsBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), cacheViewPool(), Div2Module.provideTabTextStyleProvider(this.mDivConfiguration.getTypefaceProvider()), cacheDivActionBinder(), this.mDivConfiguration.getDiv2Logger(), cacheDivImageLoader(), cacheDivVisibilityActionTracker(), cacheDivPatchCache(), cacheJavaxInjectNamedValueThemedContextContext(), cacheDivRuntimeVisitor(), cacheTabsStateCache()), new DivStateBinder(cacheDivBaseBinder(), cacheDivViewCreator(), new ProviderImpl(this, 0), this.mDivConfiguration.getDivStateCache(), cacheTemporaryDivStateCache(), cacheDivActionBinder(), cacheDivActionBeaconSender(), cacheDivPatchManager(), cacheDivPatchCache(), this.mDivConfiguration.getDiv2Logger(), cacheDivVisibilityActionTracker(), cacheErrorCollectors(), cacheTwoWayStringVariableBinder(), cacheDivRuntimeVisitor()), new DivCustomBinder(cacheDivBaseBinder(), this.mDivConfiguration.getDivCustomContainerViewAdapter(), cacheDivExtensionController(), new ProviderImpl(this, 0)), new DivIndicatorBinder(cacheDivBaseBinder(), cachePagerIndicatorConnector()), new DivSliderBinder(cacheDivBaseBinder(), this.mDivConfiguration.getDiv2Logger(), cacheDivTypefaceResolver(), cacheTwoWayIntegerVariableBinder(), cacheErrorCollectors(), Float.valueOf(this.mDivConfiguration.getRecyclerScrollInterceptionAngle()).floatValue(), Boolean.valueOf(this.mDivConfiguration.getAreVisualErrorsEnabled()).booleanValue()), new DivInputBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheDivActionBinder(), cacheAccessibilityStateProvider(), cacheErrorCollectors()), new DivSelectBinder(cacheDivBaseBinder(), cacheDivTypefaceResolver(), cacheTwoWayStringVariableBinder(), cacheErrorCollectors()), new DivVideoBinder(cacheDivBaseBinder(), cacheTwoWayIntegerVariableBinder(), cacheDivActionBinder(), cacheDivVideoViewMapper(), this.mDivKitComponent.mDivKitConfiguration.getExecutorService(), this.mDivConfiguration.getDivPlayerFactory()), cacheDivExtensionController(), cachePagerIndicatorConnector(), new DivSwitchBinder(cacheDivBaseBinder(), new TwoWayBooleanVariableBinder(cacheErrorCollectors())));
                this.mDivBinderInstance = divBinder;
                obj = divBinder;
            }
            return (DivBinder) obj;
        }

        public DivExtensionController cacheDivExtensionController() {
            Object divExtensionController = this.mDivExtensionControllerInstance;
            if (divExtensionController == null) {
                divExtensionController = new DivExtensionController(this.mDivConfiguration.getExtensionHandlers());
                this.mDivExtensionControllerInstance = divExtensionController;
            }
            return (DivExtensionController) divExtensionController;
        }

        public DivImageLoader cacheDivImageLoader() {
            Object objProvideDivImageLoader = this.mDivImageLoaderInstance;
            if (objProvideDivImageLoader == null) {
                objProvideDivImageLoader = Div2Module.provideDivImageLoader(this.mDivConfiguration.getImageLoader(), this.mBaseContext);
                this.mDivImageLoaderInstance = objProvideDivImageLoader;
            }
            return (DivImageLoader) objProvideDivImageLoader;
        }

        public DivImagePreloader cacheDivImagePreloader() {
            Object divImagePreloader = this.mDivImagePreloaderInstance;
            if (divImagePreloader == null) {
                divImagePreloader = new DivImagePreloader(cacheDivImageLoader());
                this.mDivImagePreloaderInstance = divImagePreloader;
            }
            return (DivImagePreloader) divImagePreloader;
        }

        public DivPatchCache cacheDivPatchCache() {
            Object divPatchCache = this.mDivPatchCacheInstance;
            if (divPatchCache == null) {
                divPatchCache = new DivPatchCache();
                this.mDivPatchCacheInstance = divPatchCache;
            }
            return (DivPatchCache) divPatchCache;
        }

        public DivPatchManager cacheDivPatchManager() {
            Object divPatchManager = this.mDivPatchManagerInstance;
            if (divPatchManager == null) {
                divPatchManager = new DivPatchManager(cacheDivPatchCache(), new ProviderImpl(this, 1));
                this.mDivPatchManagerInstance = divPatchManager;
            }
            return (DivPatchManager) divPatchManager;
        }

        public DivPlaceholderLoader cacheDivPlaceholderLoader() {
            Object divPlaceholderLoader = this.mDivPlaceholderLoaderInstance;
            if (divPlaceholderLoader == null) {
                divPlaceholderLoader = new DivPlaceholderLoader(this.mDivConfiguration.getDiv2ImageStubProvider(), this.mDivKitComponent.mDivKitConfiguration.getExecutorService());
                this.mDivPlaceholderLoaderInstance = divPlaceholderLoader;
            }
            return (DivPlaceholderLoader) divPlaceholderLoader;
        }

        public DivPreloader cacheDivPreloader() {
            Object objProvideDivPreloader = this.mDivPreloaderInstance;
            if (objProvideDivPreloader == null) {
                objProvideDivPreloader = Div2Module.provideDivPreloader(cacheDivImagePreloader(), this.mDivConfiguration.getDivCustomContainerViewAdapter(), this.mDivConfiguration.getDivPlayerPreloader(), cacheDivExtensionController());
                this.mDivPreloaderInstance = objProvideDivPreloader;
            }
            return (DivPreloader) objProvideDivPreloader;
        }

        public DivRuntimeVisitor cacheDivRuntimeVisitor() {
            Object divRuntimeVisitor = this.mDivRuntimeVisitorInstance;
            if (divRuntimeVisitor == null) {
                divRuntimeVisitor = new DivRuntimeVisitor(this.mDivConfiguration.getDivStateCache(), cacheTemporaryDivStateCache(), cacheTabsStateCache());
                this.mDivRuntimeVisitorInstance = divRuntimeVisitor;
            }
            return (DivRuntimeVisitor) divRuntimeVisitor;
        }

        public DivStateManager cacheDivStateManager() {
            Object divStateManager = this.mDivStateManagerInstance;
            if (divStateManager == null) {
                divStateManager = new DivStateManager(this.mDivConfiguration.getDivStateCache(), cacheTemporaryDivStateCache());
                this.mDivStateManagerInstance = divStateManager;
            }
            return (DivStateManager) divStateManager;
        }

        public DivTimerEventDispatcherProvider cacheDivTimerEventDispatcherProvider() {
            Object divTimerEventDispatcherProvider = this.mDivTimerEventDispatcherProviderInstance;
            if (divTimerEventDispatcherProvider == null) {
                divTimerEventDispatcherProvider = new DivTimerEventDispatcherProvider(cacheDivActionBinder(), cacheErrorCollectors());
                this.mDivTimerEventDispatcherProviderInstance = divTimerEventDispatcherProvider;
            }
            return (DivTimerEventDispatcherProvider) divTimerEventDispatcherProvider;
        }

        public DivTooltipController cacheDivTooltipController() {
            Object obj = this.mDivTooltipControllerInstance;
            if (obj == null) {
                DivTooltipController divTooltipController = new DivTooltipController(this.mDivConfiguration.getTooltipRestrictor(), cacheDivVisibilityActionTracker(), cacheDivPreloader(), new DivTooltipViewBuilder(new ProviderImpl(this, 1)), cacheAccessibilityStateProvider(), cacheErrorCollectors());
                this.mDivTooltipControllerInstance = divTooltipController;
                obj = divTooltipController;
            }
            return (DivTooltipController) obj;
        }

        public DivTypefaceResolver cacheDivTypefaceResolver() {
            Object divTypefaceResolver = this.mDivTypefaceResolverInstance;
            if (divTypefaceResolver == null) {
                divTypefaceResolver = new DivTypefaceResolver(this.mDivConfiguration.getAdditionalTypefaceProviders(), this.mDivConfiguration.getTypefaceProvider());
                this.mDivTypefaceResolverInstance = divTypefaceResolver;
            }
            return (DivTypefaceResolver) divTypefaceResolver;
        }

        public DivValidator cacheDivValidator() {
            Object divValidator = this.mDivValidatorInstance;
            if (divValidator == null) {
                divValidator = new DivValidator();
                this.mDivValidatorInstance = divValidator;
            }
            return (DivValidator) divValidator;
        }

        public DivVideoActionHandler cacheDivVideoActionHandler() {
            Object divVideoActionHandler = this.mDivVideoActionHandlerInstance;
            if (divVideoActionHandler == null) {
                divVideoActionHandler = new DivVideoActionHandler(cacheDivVideoViewMapper());
                this.mDivVideoActionHandlerInstance = divVideoActionHandler;
            }
            return (DivVideoActionHandler) divVideoActionHandler;
        }

        public DivVideoViewMapper cacheDivVideoViewMapper() {
            Object divVideoViewMapper = this.mDivVideoViewMapperInstance;
            if (divVideoViewMapper == null) {
                divVideoViewMapper = new DivVideoViewMapper();
                this.mDivVideoViewMapperInstance = divVideoViewMapper;
            }
            return (DivVideoViewMapper) divVideoViewMapper;
        }

        public DivViewCreator cacheDivViewCreator() {
            Object obj = this.mDivViewCreatorInstance;
            if (obj == null) {
                DivViewCreator divViewCreator = new DivViewCreator(cacheJavaxInjectNamedValueThemedContextContext(), cacheViewPool(), cacheDivValidator(), this.mDivConfiguration.getViewPreCreationProfile(), cacheViewPreCreationProfileRepository());
                this.mDivViewCreatorInstance = divViewCreator;
                obj = divViewCreator;
            }
            return (DivViewCreator) obj;
        }

        public DivViewDataPreloader cacheDivViewDataPreloader() {
            Object objProvideDivViewDataPreloader = this.mDivViewDataPreloaderInstance;
            if (objProvideDivViewDataPreloader == null) {
                objProvideDivViewDataPreloader = Div2Module.provideDivViewDataPreloader(cacheDivImagePreloader(), this.mDivConfiguration.getDivCustomContainerViewAdapter(), this.mDivConfiguration.getDivPlayerPreloader(), cacheDivExtensionController());
                this.mDivViewDataPreloaderInstance = objProvideDivViewDataPreloader;
            }
            return (DivViewDataPreloader) objProvideDivViewDataPreloader;
        }

        public DivViewIdProvider cacheDivViewIdProvider() {
            Object divViewIdProvider = this.mDivViewIdProviderInstance;
            if (divViewIdProvider == null) {
                divViewIdProvider = new DivViewIdProvider();
                this.mDivViewIdProviderInstance = divViewIdProvider;
            }
            return (DivViewIdProvider) divViewIdProvider;
        }

        public DivVisibilityActionDispatcher cacheDivVisibilityActionDispatcher() {
            Object divVisibilityActionDispatcher = this.mDivVisibilityActionDispatcherInstance;
            if (divVisibilityActionDispatcher == null) {
                divVisibilityActionDispatcher = new DivVisibilityActionDispatcher(this.mDivConfiguration.getDiv2Logger(), this.mDivConfiguration.getDivVisibilityChangeListeners(), this.mDivConfiguration.getActionHandler(), cacheDivActionBeaconSender());
                this.mDivVisibilityActionDispatcherInstance = divVisibilityActionDispatcher;
            }
            return (DivVisibilityActionDispatcher) divVisibilityActionDispatcher;
        }

        public DivVisibilityActionTracker cacheDivVisibilityActionTracker() {
            Object divVisibilityActionTracker = this.mDivVisibilityActionTrackerInstance;
            if (divVisibilityActionTracker == null) {
                divVisibilityActionTracker = new DivVisibilityActionTracker(new ViewVisibilityCalculator(), cacheDivVisibilityActionDispatcher());
                this.mDivVisibilityActionTrackerInstance = divVisibilityActionTracker;
            }
            return (DivVisibilityActionTracker) divVisibilityActionTracker;
        }

        public ErrorCollectors cacheErrorCollectors() {
            Object errorCollectors = this.mErrorCollectorsInstance;
            if (errorCollectors == null) {
                errorCollectors = new ErrorCollectors();
                this.mErrorCollectorsInstance = errorCollectors;
            }
            return (ErrorCollectors) errorCollectors;
        }

        public HistogramReporter cacheHistogramReporter() {
            Object objProvideHistogramReporter = this.mHistogramReporterInstance;
            if (objProvideHistogramReporter == null) {
                objProvideHistogramReporter = DivHistogramsModule.INSTANCE.provideHistogramReporter(this.mDivKitComponent.accessHistogramReporterDelegate());
                this.mHistogramReporterInstance = objProvideHistogramReporter;
            }
            return (HistogramReporter) objProvideHistogramReporter;
        }

        public Context cacheJavaxInjectNamedValueThemedContextContext() {
            Object objProvideThemedContext = this.mJavaxInjectNamedValueThemedContextContextInstance;
            if (objProvideThemedContext == null) {
                objProvideThemedContext = Div2Module.provideThemedContext(this.mBaseContext, this.mThemeId.intValue(), Boolean.valueOf(this.mDivConfiguration.isResourceCacheEnabled()).booleanValue());
                this.mJavaxInjectNamedValueThemedContextContextInstance = objProvideThemedContext;
            }
            return (Context) objProvideThemedContext;
        }

        public PagerIndicatorConnector cachePagerIndicatorConnector() {
            Object pagerIndicatorConnector = this.mPagerIndicatorConnectorInstance;
            if (pagerIndicatorConnector == null) {
                pagerIndicatorConnector = new PagerIndicatorConnector();
                this.mPagerIndicatorConnectorInstance = pagerIndicatorConnector;
            }
            return (PagerIndicatorConnector) pagerIndicatorConnector;
        }

        public PerformanceDependentSessionProfiler cachePerformanceDependentSessionProfiler() {
            Object performanceDependentSessionProfiler = this.mPerformanceDependentSessionProfilerInstance;
            if (performanceDependentSessionProfiler == null) {
                performanceDependentSessionProfiler = new PerformanceDependentSessionProfiler(Boolean.valueOf(this.mDivConfiguration.isDebuggingViewPoolOptimization()).booleanValue());
                this.mPerformanceDependentSessionProfilerInstance = performanceDependentSessionProfiler;
            }
            return (PerformanceDependentSessionProfiler) performanceDependentSessionProfiler;
        }

        public ReleaseManager cacheReleaseManager() {
            Object releaseManager = this.mReleaseManagerInstance;
            if (releaseManager == null) {
                releaseManager = new ReleaseManager(cacheRuntimeStoreProvider());
                this.mReleaseManagerInstance = releaseManager;
            }
            return (ReleaseManager) releaseManager;
        }

        public RuntimeStoreProvider cacheRuntimeStoreProvider() {
            Object runtimeStoreProvider = this.mRuntimeStoreProviderInstance;
            if (runtimeStoreProvider == null) {
                runtimeStoreProvider = new RuntimeStoreProvider(new ExpressionsRuntimeProvider(this.mDivVariableController, cacheDivActionBinder(), this.mDivConfiguration.getDiv2Logger(), cacheStoredValuesController()), cacheErrorCollectors());
                this.mRuntimeStoreProviderInstance = runtimeStoreProvider;
            }
            return (RuntimeStoreProvider) runtimeStoreProvider;
        }

        public StoredValuesController cacheStoredValuesController() {
            Object storedValuesController = this.mStoredValuesControllerInstance;
            if (storedValuesController == null) {
                storedValuesController = new StoredValuesController(new ProviderImpl(this.mDivKitComponent, 1));
                this.mStoredValuesControllerInstance = storedValuesController;
            }
            return (StoredValuesController) storedValuesController;
        }

        public TabsStateCache cacheTabsStateCache() {
            Object tabsStateCache = this.mTabsStateCacheInstance;
            if (tabsStateCache == null) {
                tabsStateCache = new TabsStateCache();
                this.mTabsStateCacheInstance = tabsStateCache;
            }
            return (TabsStateCache) tabsStateCache;
        }

        public TemporaryDivStateCache cacheTemporaryDivStateCache() {
            Object temporaryDivStateCache = this.mTemporaryDivStateCacheInstance;
            if (temporaryDivStateCache == null) {
                temporaryDivStateCache = new TemporaryDivStateCache();
                this.mTemporaryDivStateCacheInstance = temporaryDivStateCache;
            }
            return (TemporaryDivStateCache) temporaryDivStateCache;
        }

        public TwoWayIntegerVariableBinder cacheTwoWayIntegerVariableBinder() {
            Object twoWayIntegerVariableBinder = this.mTwoWayIntegerVariableBinderInstance;
            if (twoWayIntegerVariableBinder == null) {
                twoWayIntegerVariableBinder = new TwoWayIntegerVariableBinder(cacheErrorCollectors());
                this.mTwoWayIntegerVariableBinderInstance = twoWayIntegerVariableBinder;
            }
            return (TwoWayIntegerVariableBinder) twoWayIntegerVariableBinder;
        }

        public TwoWayStringVariableBinder cacheTwoWayStringVariableBinder() {
            Object twoWayStringVariableBinder = this.mTwoWayStringVariableBinderInstance;
            if (twoWayStringVariableBinder == null) {
                twoWayStringVariableBinder = new TwoWayStringVariableBinder(cacheErrorCollectors());
                this.mTwoWayStringVariableBinderInstance = twoWayStringVariableBinder;
            }
            return (TwoWayStringVariableBinder) twoWayStringVariableBinder;
        }

        public ViewPool cacheViewPool() {
            Object objProvideViewPool = this.mViewPoolInstance;
            if (objProvideViewPool == null) {
                objProvideViewPool = Div2Module.provideViewPool(Boolean.valueOf(this.mDivConfiguration.isViewPoolEnabled()).booleanValue(), Div2Module.provideViewPoolProfiler(Boolean.valueOf(this.mDivConfiguration.isViewPoolProfilingEnabled()).booleanValue(), this.mDivConfiguration.getViewPoolReporter()), cachePerformanceDependentSessionProfiler(), this.mDivKitComponent.cacheViewCreator());
                this.mViewPoolInstance = objProvideViewPool;
            }
            return (ViewPool) objProvideViewPool;
        }

        public ViewPreCreationProfileRepository cacheViewPreCreationProfileRepository() {
            Object viewPreCreationProfileRepository = this.mViewPreCreationProfileRepositoryInstance;
            if (viewPreCreationProfileRepository == null) {
                viewPreCreationProfileRepository = new ViewPreCreationProfileRepository(this.mDivKitComponent.mApplicationContext, this.mDivConfiguration.getViewPreCreationProfile());
                this.mViewPreCreationProfileRepositoryInstance = viewPreCreationProfileRepository;
            }
            return (ViewPreCreationProfileRepository) viewPreCreationProfileRepository;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionBinder getActionBinder() {
            return cacheDivActionBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionHandler getActionHandler() {
            return this.mDivConfiguration.getActionHandler();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivActionTypedHandlerCombiner getActionTypedHandlerCombiner() {
            return this.mDivKitComponent.cacheDivActionTypedHandlerCombiner();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public BitmapEffectHelper getBitmapEffectHelper() {
            return cacheBitmapEffectHelper();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Builder getDiv2Builder() {
            return cacheDiv2Builder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2Logger getDiv2Logger() {
            return this.mDivConfiguration.getDiv2Logger();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivBinder getDivBinder() {
            return cacheDivBinder();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCreationTracker getDivCreationTracker() {
            return this.mDivCreationTracker;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivCustomContainerChildFactory getDivCustomContainerChildFactory() {
            return new DivCustomContainerChildFactory();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDataChangeListener getDivDataChangeListener() {
            return this.mDivConfiguration.getDivDataChangeListener();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivDownloader getDivDownloader() {
            return this.mDivConfiguration.getDivDownloader();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateChangeListener getDivStateChangeListener() {
            return this.mDivConfiguration.getDivStateChangeListener();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTimerEventDispatcherProvider getDivTimersControllerProvider() {
            return cacheDivTimerEventDispatcherProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVariableController getDivVariableController() {
            return this.mDivVariableController;
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVideoActionHandler getDivVideoActionHandler() {
            return cacheDivVideoActionHandler();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivViewDataPreloader getDivViewDataPreloader() {
            return cacheDivViewDataPreloader();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public HistogramReporter getHistogramReporter() {
            return cacheHistogramReporter();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public ReleaseManager getReleaseManager() {
            return cacheReleaseManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public RuntimeStoreProvider getRuntimeStoreProvider() {
            return cacheRuntimeStoreProvider();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivStateManager getStateManager() {
            return cacheDivStateManager();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public StoredValuesController getStoredValuesController() {
            return cacheStoredValuesController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public TemporaryDivStateCache getTemporaryDivStateCache() {
            return cacheTemporaryDivStateCache();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivTooltipController getTooltipController() {
            return cacheDivTooltipController();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public DivVisibilityActionTracker getVisibilityActionTracker() {
            return cacheDivVisibilityActionTracker();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isBindOnAttachEnabled() {
            return Boolean.valueOf(this.mDivConfiguration.isBindOnAttachEnabled()).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isComplexRebindEnabled() {
            return Boolean.valueOf(this.mDivConfiguration.isComplexRebindEnabled()).booleanValue();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public boolean isPagerPageClipEnabled() {
            return Boolean.valueOf(this.mDivConfiguration.isPagerPageClipEnabled()).booleanValue();
        }

        public Object switch$$access(int i10) {
            if (i10 == 0) {
                return cacheDivBinder();
            }
            if (i10 == 1) {
                return cacheDiv2Builder();
            }
            if (i10 == 2) {
                return cacheDivViewCreator();
            }
            throw new AssertionError();
        }

        @Override // com.yandex.div.core.dagger.Div2Component
        public Div2ViewComponent.Builder viewComponent() {
            return new Div2ViewComponentImpl.ComponentFactoryImpl(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class ProviderImpl implements InterfaceC15828a {
        private final Yatagan$DivKitComponent mDelegate;
        private final int mIndex;

        public ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i10) {
            this.mDelegate = yatagan$DivKitComponent;
            this.mIndex = i10;
        }

        @Override // p460Z9.InterfaceC6773a
        public Object get() {
            return this.mDelegate.switch$$access(this.mIndex);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class UninitializedLock {
        private UninitializedLock() {
        }
    }

    public Yatagan$DivKitComponent(Context context, DivKitConfiguration divKitConfiguration) {
        this.mDivActionTypedHandlerCombinerInstance = new UninitializedLock();
        this.mDivStorageComponentInstance = new UninitializedLock();
        this.mViewCreatorInstance = new UninitializedLock();
        this.mSendBeaconManagerInstance = new UninitializedLock();
        this.mHistogramRecorderInstance = new UninitializedLock();
        this.mDivParsingHistogramReporterInstance = new UninitializedLock();
        this.mHistogramColdTypeCheckerInstance = new UninitializedLock();
        this.mApplicationContext = context;
        this.mDivKitConfiguration = divKitConfiguration;
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    public HistogramReporterDelegate accessHistogramReporterDelegate() {
        return DivKitHistogramsModule.INSTANCE.provideHistogramReporterDelegate(this.mDivKitConfiguration.histogramConfiguration(), new ProviderImpl(this, 4), new ProviderImpl(this, 5));
    }

    public DivActionTypedHandlerCombiner cacheDivActionTypedHandlerCombiner() {
        Object divActionTypedHandlerCombiner;
        Object obj = this.mDivActionTypedHandlerCombinerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    divActionTypedHandlerCombiner = this.mDivActionTypedHandlerCombinerInstance;
                    if (divActionTypedHandlerCombiner instanceof UninitializedLock) {
                        divActionTypedHandlerCombiner = new DivActionTypedHandlerCombiner(manyOfSetDivActionTypedHandler());
                        this.mDivActionTypedHandlerCombinerInstance = divActionTypedHandlerCombiner;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj = divActionTypedHandlerCombiner;
        }
        return (DivActionTypedHandlerCombiner) obj;
    }

    public DivParsingHistogramReporter cacheDivParsingHistogramReporter() {
        Object objProvideDivParsingHistogramReporter;
        Object obj = this.mDivParsingHistogramReporterInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objProvideDivParsingHistogramReporter = this.mDivParsingHistogramReporterInstance;
                    if (objProvideDivParsingHistogramReporter instanceof UninitializedLock) {
                        objProvideDivParsingHistogramReporter = DivKitHistogramsModule.INSTANCE.provideDivParsingHistogramReporter(this.mDivKitConfiguration.histogramConfiguration(), new ProviderImpl(this, 0), new ProviderImpl(this, 2));
                        this.mDivParsingHistogramReporterInstance = objProvideDivParsingHistogramReporter;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj = objProvideDivParsingHistogramReporter;
        }
        return (DivParsingHistogramReporter) obj;
    }

    public DivStorageComponent cacheDivStorageComponent() {
        Object objProvideDivStorageComponent;
        Object obj = this.mDivStorageComponentInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objProvideDivStorageComponent = this.mDivStorageComponentInstance;
                    if (objProvideDivStorageComponent instanceof UninitializedLock) {
                        objProvideDivStorageComponent = DivStorageModule.INSTANCE.provideDivStorageComponent(this.mDivKitConfiguration.externalDivStorageComponent(), this.mApplicationContext, accessHistogramReporterDelegate(), cacheDivParsingHistogramReporter());
                        this.mDivStorageComponentInstance = objProvideDivStorageComponent;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj = objProvideDivStorageComponent;
        }
        return (DivStorageComponent) obj;
    }

    public HistogramColdTypeChecker cacheHistogramColdTypeChecker() {
        Object histogramColdTypeChecker;
        Object obj = this.mHistogramColdTypeCheckerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    histogramColdTypeChecker = this.mHistogramColdTypeCheckerInstance;
                    if (histogramColdTypeChecker instanceof UninitializedLock) {
                        histogramColdTypeChecker = new HistogramColdTypeChecker();
                        this.mHistogramColdTypeCheckerInstance = histogramColdTypeChecker;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj = histogramColdTypeChecker;
        }
        return (HistogramColdTypeChecker) obj;
    }

    public HistogramRecorder cacheHistogramRecorder() {
        Object objHistogramRecorder;
        Object obj = this.mHistogramRecorderInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objHistogramRecorder = this.mHistogramRecorderInstance;
                    if (objHistogramRecorder instanceof UninitializedLock) {
                        objHistogramRecorder = this.mDivKitConfiguration.histogramRecorder();
                        this.mHistogramRecorderInstance = objHistogramRecorder;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj = objHistogramRecorder;
        }
        return (HistogramRecorder) obj;
    }

    public C17865d cacheSendBeaconManager() {
        Object objProvideSendBeaconManager;
        Object obj = this.mSendBeaconManagerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objProvideSendBeaconManager = this.mSendBeaconManagerInstance;
                    if (objProvideSendBeaconManager instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        objProvideSendBeaconManager = DivKitModule.provideSendBeaconManager(this.mApplicationContext, this.mDivKitConfiguration.sendBeaconConfiguration());
                        this.mSendBeaconManagerInstance = objProvideSendBeaconManager;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj = objProvideSendBeaconManager;
        }
        return (C17865d) obj;
    }

    public ViewCreator cacheViewCreator() {
        Object objProvideViewCreator;
        Object obj = this.mViewCreatorInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objProvideViewCreator = this.mViewCreatorInstance;
                    if (objProvideViewCreator instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        objProvideViewCreator = DivKitModule.provideViewCreator(this.mDivKitConfiguration.cpuUsageHistogramReporter());
                        this.mViewCreatorInstance = objProvideViewCreator;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            obj = objProvideViewCreator;
        }
        return (ViewCreator) obj;
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public Div2Component.Builder div2Component() {
        return new Div2ComponentImpl.ComponentFactoryImpl(this);
    }

    @Override // com.yandex.div.core.dagger.DivKitComponent
    public HistogramRecordConfiguration getHistogramRecordConfiguration() {
        return this.mDivKitConfiguration.histogramRecordConfiguration();
    }

    public Set<DivActionTypedHandler> manyOfSetDivActionTypedHandler() {
        HashSet hashSet = new HashSet(16);
        hashSet.add(new DivAnimatorTypedActionHandler());
        hashSet.add(new DivActionTypedArrayMutationHandler());
        hashSet.add(new DivActionTypedClearFocusHandler());
        hashSet.add(new DivActionTypedCopyToClipboardHandler());
        hashSet.add(new DivActionTypedDictSetValueHandler());
        hashSet.add(new DivActionTypedFocusElementHandler());
        hashSet.add(new DivActionTypedHideTooltipHandler());
        hashSet.add(new DivActionTypedScrollHandler());
        hashSet.add(new DivActionTypedSetStateHandler());
        hashSet.add(new DivActionTypedSetVariableHandler());
        hashSet.add(new DivActionTypedSetStoredValueHandler());
        hashSet.add(new DivActionTypedShowTooltipHandler());
        hashSet.add(new DivActionTypedSubmitHandler(this.mDivKitConfiguration.divRequestExecutor()));
        hashSet.add(new DivActionTypedTimerHandler());
        hashSet.add(new DivActionTypedVideoHandler());
        hashSet.add(new DivActionTypedUpdateStructureHandler());
        return hashSet;
    }

    public Object switch$$access(int i10) {
        if (i10 == 0) {
            return accessHistogramReporterDelegate();
        }
        if (i10 == 1) {
            return cacheDivStorageComponent();
        }
        if (i10 == 2) {
            return this.mDivKitConfiguration.getExecutorService();
        }
        if (i10 == 3) {
            return cacheSendBeaconManager();
        }
        if (i10 == 4) {
            return cacheHistogramRecorder();
        }
        if (i10 == 5) {
            return cacheHistogramColdTypeChecker();
        }
        throw new AssertionError();
    }
}
