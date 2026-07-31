package com.yandex.div.core.view2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.mozilla.javascript.ES6Iterator;
import p478aa.C7106g;
import p607i9.AbstractC12482Z;
import p607i9.C12418V3;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0011\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR*\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, m18688d2 = {"Lcom/yandex/div/core/view2/DivViewCreator;", "Lcom/yandex/div/internal/core/DivVisitor;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lcom/yandex/div/internal/viewpool/ViewPool;", "viewPool", "Lcom/yandex/div/core/view2/DivValidator;", "validator", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "viewPreCreationProfile", "Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;", "repository", "<init>", "(Landroid/content/Context;Lcom/yandex/div/internal/viewpool/ViewPool;Lcom/yandex/div/core/view2/DivValidator;Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;Lcom/yandex/div/internal/viewpool/optimization/ViewPreCreationProfileRepository;)V", "Li9/Z;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "create", "(Li9/Z;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/view/View;", "data", "defaultVisit", "Li9/Z$k;", "visit", "(Li9/Z$k;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/view/View;", "Li9/Z$e;", "(Li9/Z$e;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/view/View;", "Landroid/content/Context;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "Lcom/yandex/div/core/view2/DivValidator;", ES6Iterator.VALUE_PROPERTY, "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "getViewPreCreationProfile", "()Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "setViewPreCreationProfile", "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;)V", "Companion", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public class DivViewCreator extends DivVisitor<View> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] TAGS = {"DIV2.TEXT_VIEW", "DIV2.IMAGE_VIEW", "DIV2.IMAGE_GIF_VIEW", "DIV2.OVERLAP_CONTAINER_VIEW", "DIV2.LINEAR_CONTAINER_VIEW", "DIV2.WRAP_CONTAINER_VIEW", "DIV2.GRID_VIEW", "DIV2.GALLERY_VIEW", "DIV2.PAGER_VIEW", "DIV2.TAB_VIEW", "DIV2.STATE", "DIV2.CUSTOM", "DIV2.INDICATOR", "DIV2.SLIDER", "DIV2.INPUT", "DIV2.SELECT", "DIV2.VIDEO", "DIV2.SWITCH"};
    private final Context context;
    private final DivValidator validator;
    private final ViewPool viewPool;
    private ViewPreCreationProfile viewPreCreationProfile;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, m18688d2 = {"Lcom/yandex/div/core/view2/DivViewCreator$Companion;", "", "<init>", "()V", "Li9/Z;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "getTag", "(Li9/Z;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/lang/String;", "TAG_CUSTOM", "Ljava/lang/String;", "TAG_GALLERY", "TAG_GIF_IMAGE", "TAG_GRID", "TAG_IMAGE", "TAG_INDICATOR", "TAG_INPUT", "TAG_LINEAR_CONTAINER", "TAG_OVERLAP_CONTAINER", "TAG_PAGER", "TAG_SELECT", "TAG_SLIDER", "TAG_STATE", "TAG_SWITCH", "TAG_TABS", "TAG_TEXT", "TAG_VIDEO", "TAG_WRAP_CONTAINER", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTag(AbstractC12482Z abstractC12482Z, ExpressionResolver expressionResolver) {
            if (abstractC12482Z instanceof AbstractC12482Z.a) {
                C12418V3 c12418v3 = ((AbstractC12482Z.a) abstractC12482Z).f40836c;
                if (DivUtilKt.isWrapContainer(c12418v3, expressionResolver)) {
                    return "DIV2.WRAP_CONTAINER_VIEW";
                }
                return c12418v3.f40434I.evaluate(expressionResolver) == C12418V3.b.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.b) {
                return "DIV2.CUSTOM";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.c) {
                return "DIV2.GALLERY_VIEW";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.d) {
                return "DIV2.IMAGE_GIF_VIEW";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.e) {
                return "DIV2.GRID_VIEW";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.f) {
                return "DIV2.IMAGE_VIEW";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.g) {
                return "DIV2.INDICATOR";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.h) {
                return "DIV2.INPUT";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.i) {
                return "DIV2.PAGER_VIEW";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.j) {
                return "DIV2.SELECT";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.l) {
                return "DIV2.SLIDER";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.n) {
                return "DIV2.SWITCH";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.m) {
                return "DIV2.STATE";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.o) {
                return "DIV2.TAB_VIEW";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.p) {
                return "DIV2.TEXT_VIEW";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.q) {
                return "DIV2.VIDEO";
            }
            if (abstractC12482Z instanceof AbstractC12482Z.k) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    public DivViewCreator(Context context, ViewPool viewPool, DivValidator divValidator, ViewPreCreationProfile viewPreCreationProfile, ViewPreCreationProfileRepository viewPreCreationProfileRepository) {
        this.context = context;
        this.viewPool = viewPool;
        this.validator = divValidator;
        String id2 = viewPreCreationProfile.getId();
        if (id2 != null) {
            ViewPreCreationProfile viewPreCreationProfile2 = (ViewPreCreationProfile) C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new DivViewCreator$viewPreCreationProfile$1$1(viewPreCreationProfileRepository, id2, null));
            if (viewPreCreationProfile2 != null) {
                viewPreCreationProfile = viewPreCreationProfile2;
            }
        }
        this.viewPreCreationProfile = viewPreCreationProfile;
        ViewPreCreationProfile viewPreCreationProfile3 = getViewPreCreationProfile();
        viewPool.register("DIV2.TEXT_VIEW", new ViewFactory() { // from class: H8.c
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$3(this.f6961a);
            }
        }, viewPreCreationProfile3.getText().getCapacity());
        viewPool.register("DIV2.IMAGE_VIEW", new ViewFactory() { // from class: H8.t
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$4(this.f6978a);
            }
        }, viewPreCreationProfile3.getImage().getCapacity());
        viewPool.register("DIV2.IMAGE_GIF_VIEW", new ViewFactory() { // from class: H8.d
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$5(this.f6962a);
            }
        }, viewPreCreationProfile3.getGifImage().getCapacity());
        viewPool.register("DIV2.OVERLAP_CONTAINER_VIEW", new ViewFactory() { // from class: H8.e
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$6(this.f6963a);
            }
        }, viewPreCreationProfile3.getOverlapContainer().getCapacity());
        viewPool.register("DIV2.LINEAR_CONTAINER_VIEW", new ViewFactory() { // from class: H8.f
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$7(this.f6964a);
            }
        }, viewPreCreationProfile3.getLinearContainer().getCapacity());
        viewPool.register("DIV2.WRAP_CONTAINER_VIEW", new ViewFactory() { // from class: H8.g
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$8(this.f6965a);
            }
        }, viewPreCreationProfile3.getWrapContainer().getCapacity());
        viewPool.register("DIV2.GRID_VIEW", new ViewFactory() { // from class: H8.h
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$9(this.f6966a);
            }
        }, viewPreCreationProfile3.getGrid().getCapacity());
        viewPool.register("DIV2.GALLERY_VIEW", new ViewFactory() { // from class: H8.i
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$10(this.f6967a);
            }
        }, viewPreCreationProfile3.getGallery().getCapacity());
        viewPool.register("DIV2.PAGER_VIEW", new ViewFactory() { // from class: H8.j
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$11(this.f6968a);
            }
        }, viewPreCreationProfile3.getPager().getCapacity());
        viewPool.register("DIV2.TAB_VIEW", new ViewFactory() { // from class: H8.k
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$12(this.f6969a);
            }
        }, viewPreCreationProfile3.getTab().getCapacity());
        viewPool.register("DIV2.STATE", new ViewFactory() { // from class: H8.l
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$13(this.f6970a);
            }
        }, viewPreCreationProfile3.getState().getCapacity());
        viewPool.register("DIV2.CUSTOM", new ViewFactory() { // from class: H8.m
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$14(this.f6971a);
            }
        }, viewPreCreationProfile3.getCustom().getCapacity());
        viewPool.register("DIV2.INDICATOR", new ViewFactory() { // from class: H8.n
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$15(this.f6972a);
            }
        }, viewPreCreationProfile3.getIndicator().getCapacity());
        viewPool.register("DIV2.SLIDER", new ViewFactory() { // from class: H8.o
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$16(this.f6973a);
            }
        }, viewPreCreationProfile3.getSlider().getCapacity());
        viewPool.register("DIV2.INPUT", new ViewFactory() { // from class: H8.p
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$17(this.f6974a);
            }
        }, viewPreCreationProfile3.getInput().getCapacity());
        viewPool.register("DIV2.SELECT", new ViewFactory() { // from class: H8.q
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$18(this.f6975a);
            }
        }, viewPreCreationProfile3.getSelect().getCapacity());
        viewPool.register("DIV2.VIDEO", new ViewFactory() { // from class: H8.r
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$19(this.f6976a);
            }
        }, viewPreCreationProfile3.getVideo().getCapacity());
        viewPool.register("DIV2.SWITCH", new ViewFactory() { // from class: H8.s
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.lambda$22$lambda$21$lambda$20(this.f6977a);
            }
        }, viewPreCreationProfile3.getSwitch().getCapacity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivRecyclerView lambda$22$lambda$21$lambda$10(DivViewCreator divViewCreator) {
        return new DivRecyclerView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivPagerView lambda$22$lambda$21$lambda$11(DivViewCreator divViewCreator) {
        return new DivPagerView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DivTabsLayout lambda$22$lambda$21$lambda$12(DivViewCreator divViewCreator) {
        return new DivTabsLayout(divViewCreator.context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivStateLayout lambda$22$lambda$21$lambda$13(DivViewCreator divViewCreator) {
        return new DivStateLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivCustomWrapper lambda$22$lambda$21$lambda$14(DivViewCreator divViewCreator) {
        return new DivCustomWrapper(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivPagerIndicatorView lambda$22$lambda$21$lambda$15(DivViewCreator divViewCreator) {
        return new DivPagerIndicatorView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSliderView lambda$22$lambda$21$lambda$16(DivViewCreator divViewCreator) {
        return new DivSliderView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivInputView lambda$22$lambda$21$lambda$17(DivViewCreator divViewCreator) {
        return new DivInputView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSelectView lambda$22$lambda$21$lambda$18(DivViewCreator divViewCreator) {
        return new DivSelectView(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivVideoView lambda$22$lambda$21$lambda$19(DivViewCreator divViewCreator) {
        return new DivVideoView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivSwitchView lambda$22$lambda$21$lambda$20(DivViewCreator divViewCreator) {
        return new DivSwitchView(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivLineHeightTextView lambda$22$lambda$21$lambda$3(DivViewCreator divViewCreator) {
        return new DivLineHeightTextView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivImageView lambda$22$lambda$21$lambda$4(DivViewCreator divViewCreator) {
        return new DivImageView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivGifImageView lambda$22$lambda$21$lambda$5(DivViewCreator divViewCreator) {
        return new DivGifImageView(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivFrameLayout lambda$22$lambda$21$lambda$6(DivViewCreator divViewCreator) {
        return new DivFrameLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivLinearLayout lambda$22$lambda$21$lambda$7(DivViewCreator divViewCreator) {
        return new DivLinearLayout(divViewCreator.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivWrapLayout lambda$22$lambda$21$lambda$8(DivViewCreator divViewCreator) {
        return new DivWrapLayout(divViewCreator.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivGridLayout lambda$22$lambda$21$lambda$9(DivViewCreator divViewCreator) {
        return new DivGridLayout(divViewCreator.context, null, 0, 6, null);
    }

    public View create(AbstractC12482Z div, ExpressionResolver resolver) {
        if (!this.validator.validate(div, resolver)) {
            return new Space(this.context);
        }
        View viewVisit = visit(div, resolver);
        viewVisit.setBackground(NoOpDrawable.INSTANCE);
        return viewVisit;
    }

    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.viewPreCreationProfile;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    public View defaultVisit(AbstractC12482Z data, ExpressionResolver resolver) {
        return this.viewPool.obtain(INSTANCE.getTag(data, resolver));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    public View visit(AbstractC12482Z.k data, ExpressionResolver resolver) {
        return new DivSeparatorView(this.context, null, 0, 6, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    public View visit(AbstractC12482Z.e data, ExpressionResolver resolver) {
        ViewGroup viewGroup = (ViewGroup) defaultVisit((AbstractC12482Z) data, resolver);
        Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.f40840c).iterator();
        while (it.hasNext()) {
            viewGroup.addView(create((AbstractC12482Z) it.next(), resolver));
        }
        return viewGroup;
    }
}
