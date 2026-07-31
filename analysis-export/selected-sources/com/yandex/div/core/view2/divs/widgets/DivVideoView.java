package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.FrameContainerLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045C8.C0676c;
import p207L8.C3275b;
import p351T8.C5016a;
import p607i9.AbstractC12482Z;
import p607i9.C12718m3;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0014J \u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0014J*\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J/\u0010-\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u0010\u0014J\u000f\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u00108R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010A\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001c\u0010H\u001a\u00020B8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bE\u0010D\"\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000e0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, m18688d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Li9/Z$q;", "", "Lcom/yandex/div/core/view2/Releasable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/div/core/Disposable;", "subscription", "", "addSubscription", "(Lcom/yandex/div/core/Disposable;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Li9/m3;", "border", "Landroid/view/View;", "view", "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Li9/m3;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "release", "Lcom/yandex/div/core/player/DivPlayerView;", "getPlayerView", "()Lcom/yandex/div/core/player/DivPlayerView;", "getBaseline", "()I", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "getDiv", "()Li9/Z$q;", "setDiv", "(Li9/Z$q;)V", "div", "", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class DivVideoView extends FrameContainerLayout implements DivHolderView<AbstractC12482Z.q>, Releasable {
    private final /* synthetic */ DivHolderViewMixin<AbstractC12482Z.q> $$delegate_0;

    public /* synthetic */ DivVideoView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divImageStyle : i10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(Disposable subscription) {
        DivHolderViewMixin<AbstractC12482Z.q> divHolderViewMixin = this.$$delegate_0;
        divHolderViewMixin.getClass();
        C5016a.m5552a(divHolderViewMixin, subscription);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        DivHolderViewMixin<AbstractC12482Z.q> divHolderViewMixin = this.$$delegate_0;
        divHolderViewMixin.getClass();
        C5016a.m5553b(divHolderViewMixin);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public AbstractC12482Z.q getDiv() {
        return (AbstractC12482Z.q) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    public final DivPlayerView getPlayerView() {
        if (getChildCount() > 2) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Too many children in DivVideo");
            }
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        if (childAt instanceof DivPlayerView) {
            return (DivPlayerView) childAt;
        }
        KAssert kAssert2 = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Wrong view type inside DivVideo");
        }
        return null;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.onBoundsChanged(width, height);
    }

    @Override // android.view.View
    public void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        onBoundsChanged(w10, h10);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        C3275b.m3982a(this);
        DivPlayerView playerView = getPlayerView();
        if (playerView != null) {
            DivPlayer attachedPlayer = playerView.getAttachedPlayer();
            C0676c.m1205b(playerView);
            if (attachedPlayer != null) {
                attachedPlayer.release();
            }
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, C12718m3 border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(AbstractC12482Z.q qVar) {
        this.$$delegate_0.setDiv(qVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    @JvmOverloads
    public DivVideoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
    }
}
