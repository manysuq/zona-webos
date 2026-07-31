package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
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
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
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
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivTreeVisitorKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import p607i9.AbstractC12482Z;
import p607i9.InterfaceC12611g3;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0011\u0018\u00002\u00020\u0001B©\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J'\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0012¢\u0006\u0004\b3\u00104J'\u00106\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000205H\u0012¢\u0006\u0004\b6\u00107J'\u00109\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000208H\u0012¢\u0006\u0004\b9\u0010:J'\u0010<\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020;H\u0012¢\u0006\u0004\b<\u0010=J/\u0010A\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020>2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bA\u0010BJ/\u0010D\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020C2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bD\u0010EJ/\u0010G\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020F2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bG\u0010HJ/\u0010J\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020I2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bJ\u0010KJ/\u0010M\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020L2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bM\u0010NJ/\u0010P\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020O2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bP\u0010QJ/\u0010S\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020R2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bS\u0010TJ'\u0010V\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020UH\u0012¢\u0006\u0004\bV\u0010WJ/\u0010Y\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020X2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bY\u0010ZJ/\u0010\\\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020[2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\b\\\u0010]J/\u0010_\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020^2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\b_\u0010`J/\u0010b\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020a2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\bb\u0010cJ/\u0010e\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020d2\u0006\u0010@\u001a\u00020?H\u0012¢\u0006\u0004\be\u0010fJ'\u0010j\u001a\u0002022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u00020g2\u0006\u0010i\u001a\u00020hH\u0012¢\u0006\u0004\bj\u0010kJ/\u0010o\u001a\u0002022\u0006\u0010l\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010n\u001a\u00020m2\u0006\u0010@\u001a\u00020?H\u0017¢\u0006\u0004\bo\u0010pJ\u000f\u0010s\u001a\u000202H\u0011¢\u0006\u0004\bq\u0010rR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010tR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010uR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010vR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010wR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010xR\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010yR\u0014\u0010\u000f\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010zR\u0014\u0010\u0011\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010{R\u0014\u0010\u0013\u001a\u00020\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010|R\u0014\u0010\u0015\u001a\u00020\u00148\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010}R\u0014\u0010\u0017\u001a\u00020\u00168\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010~R\u0014\u0010\u0019\u001a\u00020\u00188\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u007fR\u0015\u0010\u001b\u001a\u00020\u001a8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0080\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0081\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0082\u0001R\u0015\u0010!\u001a\u00020 8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0083\u0001R\u0015\u0010#\u001a\u00020\"8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0084\u0001R\u0015\u0010%\u001a\u00020$8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0085\u0001R\u0015\u0010'\u001a\u00020&8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0086\u0001R\u0015\u0010)\u001a\u00020(8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0087\u0001¨\u0006\u0088\u0001"}, m18688d2 = {"Lcom/yandex/div/core/view2/DivBinder;", "", "Lcom/yandex/div/core/view2/DivValidator;", "validator", "Lcom/yandex/div/core/view2/divs/DivTextBinder;", "textBinder", "Lcom/yandex/div/core/view2/divs/DivContainerBinder;", "containerBinder", "Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;", "separatorBinder", "Lcom/yandex/div/core/view2/divs/DivImageBinder;", "imageBinder", "Lcom/yandex/div/core/view2/divs/DivGifImageBinder;", "gifImageBinder", "Lcom/yandex/div/core/view2/divs/DivGridBinder;", "gridBinder", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;", "galleryBinder", "Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;", "pagerBinder", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;", "tabsBinder", "Lcom/yandex/div/core/view2/divs/DivStateBinder;", "stateBinder", "Lcom/yandex/div/core/view2/divs/DivCustomBinder;", "customBinder", "Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;", "indicatorBinder", "Lcom/yandex/div/core/view2/divs/DivSliderBinder;", "sliderBinder", "Lcom/yandex/div/core/view2/divs/DivInputBinder;", "inputBinder", "Lcom/yandex/div/core/view2/divs/DivSelectBinder;", "selectBinder", "Lcom/yandex/div/core/view2/divs/DivVideoBinder;", "videoBinder", "Lcom/yandex/div/core/extension/DivExtensionController;", "extensionController", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "pagerIndicatorConnector", "Lcom/yandex/div/core/view2/divs/DivSwitchBinder;", "switchBinder", "<init>", "(Lcom/yandex/div/core/view2/DivValidator;Lcom/yandex/div/core/view2/divs/DivTextBinder;Lcom/yandex/div/core/view2/divs/DivContainerBinder;Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;Lcom/yandex/div/core/view2/divs/DivImageBinder;Lcom/yandex/div/core/view2/divs/DivGifImageBinder;Lcom/yandex/div/core/view2/divs/DivGridBinder;Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;Lcom/yandex/div/core/view2/divs/DivStateBinder;Lcom/yandex/div/core/view2/divs/DivCustomBinder;Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;Lcom/yandex/div/core/view2/divs/DivSliderBinder;Lcom/yandex/div/core/view2/divs/DivInputBinder;Lcom/yandex/div/core/view2/divs/DivSelectBinder;Lcom/yandex/div/core/view2/divs/DivVideoBinder;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;Lcom/yandex/div/core/view2/divs/DivSwitchBinder;)V", "Lcom/yandex/div/core/view2/BindingContext;", "context", "Landroid/view/View;", "view", "Li9/Z$p;", "data", "", "bindText", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$p;)V", "Li9/Z$f;", "bindImage", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$f;)V", "Li9/Z$d;", "bindGifImage", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$d;)V", "Li9/Z$k;", "bindSeparator", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$k;)V", "Li9/Z$a;", "Lcom/yandex/div/core/state/DivStatePath;", "path", "bindContainer", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$a;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$e;", "bindGrid", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$e;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$c;", "bindGallery", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$c;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$i;", "bindPager", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$i;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$o;", "bindTabs", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$o;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$m;", "bindState", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$m;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$b;", "bindCustom", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$b;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$g;", "bindIndicator", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$g;)V", "Li9/Z$l;", "bindSlider", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$l;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$h;", "bindInput", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$h;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$j;", "bindSelect", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$j;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$q;", "bindVideo", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$q;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$n;", "bindSwitch", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z$n;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/g3;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "bindLayoutParams", "(Landroid/view/View;Li9/g3;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "parentContext", "Li9/Z;", "div", "bind", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Li9/Z;Lcom/yandex/div/core/state/DivStatePath;)V", "attachIndicators$div_release", "()V", "attachIndicators", "Lcom/yandex/div/core/view2/DivValidator;", "Lcom/yandex/div/core/view2/divs/DivTextBinder;", "Lcom/yandex/div/core/view2/divs/DivContainerBinder;", "Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;", "Lcom/yandex/div/core/view2/divs/DivImageBinder;", "Lcom/yandex/div/core/view2/divs/DivGifImageBinder;", "Lcom/yandex/div/core/view2/divs/DivGridBinder;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerBinder;", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;", "Lcom/yandex/div/core/view2/divs/DivStateBinder;", "Lcom/yandex/div/core/view2/divs/DivCustomBinder;", "Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;", "Lcom/yandex/div/core/view2/divs/DivSliderBinder;", "Lcom/yandex/div/core/view2/divs/DivInputBinder;", "Lcom/yandex/div/core/view2/divs/DivSelectBinder;", "Lcom/yandex/div/core/view2/divs/DivVideoBinder;", "Lcom/yandex/div/core/extension/DivExtensionController;", "Lcom/yandex/div/core/view2/divs/pager/PagerIndicatorConnector;", "Lcom/yandex/div/core/view2/divs/DivSwitchBinder;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public class DivBinder {
    private final DivContainerBinder containerBinder;
    private final DivCustomBinder customBinder;
    private final DivExtensionController extensionController;
    private final DivGalleryBinder galleryBinder;
    private final DivGifImageBinder gifImageBinder;
    private final DivGridBinder gridBinder;
    private final DivImageBinder imageBinder;
    private final DivIndicatorBinder indicatorBinder;
    private final DivInputBinder inputBinder;
    private final DivPagerBinder pagerBinder;
    private final PagerIndicatorConnector pagerIndicatorConnector;
    private final DivSelectBinder selectBinder;
    private final DivSeparatorBinder separatorBinder;
    private final DivSliderBinder sliderBinder;
    private final DivStateBinder stateBinder;
    private final DivSwitchBinder switchBinder;
    private final DivTabsBinder tabsBinder;
    private final DivTextBinder textBinder;
    private final DivValidator validator;
    private final DivVideoBinder videoBinder;

    public DivBinder(DivValidator divValidator, DivTextBinder divTextBinder, DivContainerBinder divContainerBinder, DivSeparatorBinder divSeparatorBinder, DivImageBinder divImageBinder, DivGifImageBinder divGifImageBinder, DivGridBinder divGridBinder, DivGalleryBinder divGalleryBinder, DivPagerBinder divPagerBinder, DivTabsBinder divTabsBinder, DivStateBinder divStateBinder, DivCustomBinder divCustomBinder, DivIndicatorBinder divIndicatorBinder, DivSliderBinder divSliderBinder, DivInputBinder divInputBinder, DivSelectBinder divSelectBinder, DivVideoBinder divVideoBinder, DivExtensionController divExtensionController, PagerIndicatorConnector pagerIndicatorConnector, DivSwitchBinder divSwitchBinder) {
        this.validator = divValidator;
        this.textBinder = divTextBinder;
        this.containerBinder = divContainerBinder;
        this.separatorBinder = divSeparatorBinder;
        this.imageBinder = divImageBinder;
        this.gifImageBinder = divGifImageBinder;
        this.gridBinder = divGridBinder;
        this.galleryBinder = divGalleryBinder;
        this.pagerBinder = divPagerBinder;
        this.tabsBinder = divTabsBinder;
        this.stateBinder = divStateBinder;
        this.customBinder = divCustomBinder;
        this.indicatorBinder = divIndicatorBinder;
        this.sliderBinder = divSliderBinder;
        this.inputBinder = divInputBinder;
        this.selectBinder = divSelectBinder;
        this.videoBinder = divVideoBinder;
        this.extensionController = divExtensionController;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.switchBinder = divSwitchBinder;
    }

    private void bindContainer(BindingContext context, View view, AbstractC12482Z.a data, DivStatePath path) {
        this.containerBinder.bindView(context, (ViewGroup) view, data, path);
    }

    private void bindCustom(BindingContext context, View view, AbstractC12482Z.b data, DivStatePath path) {
        this.customBinder.bindView(context, (DivCustomWrapper) view, data, path);
    }

    private void bindGallery(BindingContext context, View view, AbstractC12482Z.c data, DivStatePath path) {
        this.galleryBinder.bindView(context, (DivRecyclerView) view, data, path);
    }

    private void bindGifImage(BindingContext context, View view, AbstractC12482Z.d data) {
        this.gifImageBinder.bindView(context, (DivGifImageView) view, data);
    }

    private void bindGrid(BindingContext context, View view, AbstractC12482Z.e data, DivStatePath path) {
        this.gridBinder.bindView(context, (DivGridLayout) view, data, path);
    }

    private void bindImage(BindingContext context, View view, AbstractC12482Z.f data) {
        this.imageBinder.bindView(context, (DivImageView) view, data);
    }

    private void bindIndicator(BindingContext context, View view, AbstractC12482Z.g data) {
        this.indicatorBinder.bindView(context, (DivPagerIndicatorView) view, data);
    }

    private void bindInput(BindingContext context, View view, AbstractC12482Z.h data, DivStatePath path) {
        this.inputBinder.bindView(context, (DivInputView) view, data, path);
    }

    private void bindLayoutParams(View view, InterfaceC12611g3 data, ExpressionResolver resolver) {
        BaseDivViewExtensionsKt.applyMargins(view, data.mo14027g(), resolver);
    }

    private void bindPager(BindingContext context, View view, AbstractC12482Z.i data, DivStatePath path) {
        this.pagerBinder.bindView(context, (DivPagerView) view, data, path);
    }

    private void bindSelect(BindingContext context, View view, AbstractC12482Z.j data, DivStatePath path) {
        this.selectBinder.bindView(context, (DivSelectView) view, data, path);
    }

    private void bindSeparator(BindingContext context, View view, AbstractC12482Z.k data) {
        this.separatorBinder.bindView(context, (DivSeparatorView) view, data);
    }

    private void bindSlider(BindingContext context, View view, AbstractC12482Z.l data, DivStatePath path) {
        this.sliderBinder.bindView(context, (DivSliderView) view, data, path);
    }

    private void bindState(BindingContext context, View view, AbstractC12482Z.m data, DivStatePath path) {
        this.stateBinder.bindView(context, (DivStateLayout) view, data, path);
    }

    private void bindSwitch(BindingContext context, View view, AbstractC12482Z.n data, DivStatePath path) {
        this.switchBinder.bindView(context, (DivSwitchView) view, data, path);
    }

    private void bindTabs(BindingContext context, View view, AbstractC12482Z.o data, DivStatePath path) {
        this.tabsBinder.bindView(context, (DivTabsLayout) view, data, path);
    }

    private void bindText(BindingContext context, View view, AbstractC12482Z.p data) {
        this.textBinder.bindView(context, (DivLineHeightTextView) view, data);
    }

    private void bindVideo(BindingContext context, View view, AbstractC12482Z.q data, DivStatePath path) {
        this.videoBinder.bindView(context, (DivVideoView) view, data, path);
    }

    public void attachIndicators$div_release() {
        this.pagerIndicatorConnector.attach$div_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bind(BindingContext parentContext, View view, AbstractC12482Z div, DivStatePath path) {
        AbstractC12482Z div2;
        try {
            BindingContext childContext = DivTreeVisitorKt.getChildContext(parentContext, div, path);
            Div2View divView = childContext.getDivView();
            ExpressionResolver expressionResolver = childContext.getExpressionResolver();
            ReusableTokenList currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release == null || currentRebindReusableList$div_release.pop(div) == null) {
                if (!this.validator.validate(div, expressionResolver)) {
                    bindLayoutParams(view, div.m14353c(), expressionResolver);
                    return;
                }
                this.extensionController.beforeBindView(divView, expressionResolver, view, div.m14353c());
                if (!(div instanceof AbstractC12482Z.b) && (div2 = ((DivHolderView) view).getDiv()) != null) {
                    this.extensionController.unbindView(divView, expressionResolver, view, div2.m14353c());
                }
                if (div instanceof AbstractC12482Z.p) {
                    bindText(childContext, view, (AbstractC12482Z.p) div);
                } else if (div instanceof AbstractC12482Z.f) {
                    bindImage(childContext, view, (AbstractC12482Z.f) div);
                } else if (div instanceof AbstractC12482Z.d) {
                    bindGifImage(childContext, view, (AbstractC12482Z.d) div);
                } else if (div instanceof AbstractC12482Z.k) {
                    bindSeparator(childContext, view, (AbstractC12482Z.k) div);
                } else if (div instanceof AbstractC12482Z.a) {
                    bindContainer(childContext, view, (AbstractC12482Z.a) div, path);
                } else if (div instanceof AbstractC12482Z.e) {
                    bindGrid(childContext, view, (AbstractC12482Z.e) div, path);
                } else if (div instanceof AbstractC12482Z.c) {
                    bindGallery(childContext, view, (AbstractC12482Z.c) div, path);
                } else if (div instanceof AbstractC12482Z.i) {
                    bindPager(childContext, view, (AbstractC12482Z.i) div, path);
                } else if (div instanceof AbstractC12482Z.o) {
                    bindTabs(childContext, view, (AbstractC12482Z.o) div, path);
                } else if (div instanceof AbstractC12482Z.m) {
                    bindState(childContext, view, (AbstractC12482Z.m) div, path);
                } else if (div instanceof AbstractC12482Z.b) {
                    bindCustom(childContext, view, (AbstractC12482Z.b) div, path);
                } else if (div instanceof AbstractC12482Z.g) {
                    bindIndicator(childContext, view, (AbstractC12482Z.g) div);
                } else if (div instanceof AbstractC12482Z.l) {
                    bindSlider(childContext, view, (AbstractC12482Z.l) div, path);
                } else if (div instanceof AbstractC12482Z.h) {
                    bindInput(childContext, view, (AbstractC12482Z.h) div, path);
                } else if (div instanceof AbstractC12482Z.j) {
                    bindSelect(childContext, view, (AbstractC12482Z.j) div, path);
                } else if (div instanceof AbstractC12482Z.q) {
                    bindVideo(childContext, view, (AbstractC12482Z.q) div, path);
                } else {
                    if (!(div instanceof AbstractC12482Z.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bindSwitch(childContext, view, (AbstractC12482Z.n) div, path);
                }
                Unit unit = Unit.INSTANCE;
                if (div instanceof AbstractC12482Z.b) {
                    return;
                }
                this.extensionController.bindView(divView, expressionResolver, view, div.m14353c());
            }
        } catch (ParsingException e10) {
            if (!ExpressionFallbacksHelperKt.isExpressionResolveFail(e10)) {
                throw e10;
            }
        }
    }
}
