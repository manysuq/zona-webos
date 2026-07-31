package com.yandex.div.core.view2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.sun.mail.imap.IMAPStore;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKit;
import com.yandex.div.core.DivViewConfig;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.timer.DivTimerEventDispatcher;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.SingleTimeOnAttachCallback;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.logging.bind.BindingEventReporter;
import com.yandex.div.core.view2.logging.bind.BindingEventReporterProvider;
import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.logging.bind.SimpleRebindReporter;
import com.yandex.div.core.view2.logging.patch.PatchEventReporterProvider;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.histogram.Div2ViewHistogramReporter;
import com.yandex.div.histogram.RenderConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber$Listener;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.util.DivDataUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import mobi.zona.R;
import org.mozilla.javascript.ES6Iterator;
import p135H8.RunnableC2093b;
import p362U1.C5243I;
import p362U1.C5254U;
import p607i9.AbstractC12482Z;
import p607i9.C12131E4;
import p607i9.C12679k0;
import p607i9.EnumC12073Ae;
import p607i9.EnumC12090Be;
import p760r4.AbstractC17833h;
import p760r4.C17832g;
import p760r4.C17834i;
import p760r4.C17835j;
import p760r4.C17837l;
import p824v8.C18639j;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000Þ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0099\u0003B/\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB'\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J7\u0010)\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0017H\u0014¢\u0006\u0004\b3\u0010\u0019J\u000f\u00104\u001a\u00020\u0017H\u0014¢\u0006\u0004\b4\u0010\u0019J\u001f\u00109\u001a\u00020\u00172\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010\u0019J\u001f\u0010>\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010\u0019J\u001f\u0010>\u001a\u00020\u00172\u0006\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b>\u0010CJ\u0017\u0010H\u001a\u00020\u00172\u0006\u0010E\u001a\u00020DH\u0010¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00172\u0006\u0010E\u001a\u00020DH\u0010¢\u0006\u0004\bI\u0010GJ\u000f\u0010K\u001a\u00020\u0017H\u0016¢\u0006\u0004\bK\u0010\u0019J\u0011\u0010O\u001a\u0004\u0018\u00010LH\u0010¢\u0006\u0004\bM\u0010NJ+\u0010V\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020P2\b\b\u0002\u0010S\u001a\u00020R2\b\b\u0002\u0010U\u001a\u00020TH\u0017¢\u0006\u0004\bV\u0010WJ+\u0010X\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020P2\b\b\u0002\u0010S\u001a\u00020R2\b\b\u0002\u0010U\u001a\u00020TH\u0017¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00172\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020ZH\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0010H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020\u00172\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0017H\u0016¢\u0006\u0004\bf\u0010\u0019J\u000f\u0010g\u001a\u00020\tH\u0016¢\u0006\u0004\bg\u0010hJ\u0011\u0010j\u001a\u0004\u0018\u00010iH\u0016¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0000H\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020TH\u0016¢\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020\u00172\u0006\u0010p\u001a\u00020RH\u0016¢\u0006\u0004\bq\u0010rJ\u001f\u0010q\u001a\u00020\u00172\u0006\u0010p\u001a\u00020R2\u0006\u0010s\u001a\u00020\u0012H\u0016¢\u0006\u0004\bq\u0010tJ\u0017\u0010u\u001a\u00020\u00172\u0006\u0010p\u001a\u00020RH\u0016¢\u0006\u0004\bu\u0010rJ\u000f\u0010v\u001a\u00020\u0017H\u0016¢\u0006\u0004\bv\u0010\u0019J\u0017\u0010w\u001a\u00020\u00172\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\bw\u00102J)\u0010z\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\b\u0010x\u001a\u0004\u0018\u0001072\u0006\u0010y\u001a\u00020\tH\u0014¢\u0006\u0004\bz\u0010{J \u0010\u0080\u0001\u001a\u00020\u00172\u0006\u0010|\u001a\u0002072\u0006\u0010}\u001a\u00020LH\u0010¢\u0006\u0004\b~\u0010\u007fJ\u001c\u0010\u0083\u0001\u001a\u0004\u0018\u00010L2\u0006\u0010|\u001a\u000207H\u0010¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J'\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00012\u0007\u0010\u0084\u0001\u001a\u00020R2\u0007\u0010\u0085\u0001\u001a\u00020RH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J$\u0010\u008b\u0001\u001a\u00020\u00172\u0007\u0010\u0089\u0001\u001a\u00020R2\u0007\u0010\u008a\u0001\u001a\u00020RH\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J/\u0010\u008f\u0001\u001a\u00020\u00122\u0007\u0010\u008d\u0001\u001a\u00020R2\u0007\u0010\u008a\u0001\u001a\u00020R2\t\b\u0002\u0010\u008e\u0001\u001a\u00020TH\u0017¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001c\u0010\u0092\u0001\u001a\u0004\u0018\u00010L2\u0006\u0010|\u001a\u000207H\u0010¢\u0006\u0006\b\u0091\u0001\u0010\u0082\u0001J\u001e\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\"\u0010\u009b\u0001\u001a\u00020\u00172\u000e\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u0097\u0001H\u0010¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J(\u0010\u009c\u0001\u001a\u00020\u00172\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010\u009e\u0001\u001a\u00020\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0012¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020\u0017H\u0012¢\u0006\u0005\b \u0001\u0010\u0019J\u0011\u0010¡\u0001\u001a\u00020\u0017H\u0012¢\u0006\u0005\b¡\u0001\u0010\u0019J\u0011\u0010¢\u0001\u001a\u00020\u0017H\u0012¢\u0006\u0005\b¢\u0001\u0010\u0019J,\u0010¥\u0001\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010¤\u0001\u001a\u00030£\u0001H\u0012¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001c\u0010¨\u0001\u001a\u00020\u00172\b\u0010§\u0001\u001a\u00030\u0094\u0001H\u0012¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001c\u0010ª\u0001\u001a\u00020\u00172\b\u0010§\u0001\u001a\u00030\u0094\u0001H\u0012¢\u0006\u0006\bª\u0001\u0010©\u0001J\u0011\u0010«\u0001\u001a\u00020\u0017H\u0012¢\u0006\u0005\b«\u0001\u0010\u0019J\u0011\u0010¬\u0001\u001a\u00020\u0017H\u0012¢\u0006\u0005\b¬\u0001\u0010\u0019J\u0019\u0010;\u001a\u00020\u00172\u0007\u0010\u00ad\u0001\u001a\u00020\u0012H\u0012¢\u0006\u0005\b;\u0010®\u0001J\u0011\u0010¯\u0001\u001a\u00020\u0017H\u0012¢\u0006\u0005\b¯\u0001\u0010\u0019J\u0011\u0010°\u0001\u001a\u00020\u0017H\u0012¢\u0006\u0005\b°\u0001\u0010\u0019J0\u0010³\u0001\u001a\u00020\u00122\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010²\u0001\u001a\u00020\u000e2\b\u0010¤\u0001\u001a\u00030£\u0001H\u0012¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0014\u0010<\u001a\u00020\t*\u00020\u000eH\u0012¢\u0006\u0005\b<\u0010µ\u0001J\u0019\u0010§\u0001\u001a\u0005\u0018\u00010\u0094\u0001*\u00020\u000eH\u0012¢\u0006\u0006\b§\u0001\u0010\u0096\u0001J\"\u0010¶\u0001\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0012H\u0012¢\u0006\u0006\b¶\u0001\u0010·\u0001JV\u0010½\u0001\u001a\u00020\u00172\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010²\u0001\u001a\u00020\u000e2\t\u0010¸\u0001\u001a\u0004\u0018\u00010L2\b\u0010¹\u0001\u001a\u00030\u0094\u00012\u0007\u0010º\u0001\u001a\u0002072\u0007\u0010»\u0001\u001a\u00020\u00122\u0007\u0010¼\u0001\u001a\u00020\u0012H\u0012¢\u0006\u0006\b½\u0001\u0010¾\u0001J\"\u0010¿\u0001\u001a\u0002072\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0012H\u0012¢\u0006\u0006\b¿\u0001\u0010À\u0001J/\u0010Â\u0001\u001a\u0002072\b\u0010¹\u0001\u001a\u00030\u0094\u00012\u0006\u0010<\u001a\u00020\t2\t\b\u0002\u0010Á\u0001\u001a\u00020\u0012H\u0012¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J/\u0010Ä\u0001\u001a\u0002072\b\u0010¹\u0001\u001a\u00030\u0094\u00012\u0006\u0010<\u001a\u00020\t2\t\b\u0002\u0010Á\u0001\u001a\u00020\u0012H\u0012¢\u0006\u0006\bÄ\u0001\u0010Ã\u0001J?\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00012\t\u0010±\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010²\u0001\u001a\u00020\u000e2\t\u0010¸\u0001\u001a\u0004\u0018\u00010L2\t\u0010Å\u0001\u001a\u0004\u0018\u00010LH\u0012¢\u0006\u0006\bÇ\u0001\u0010È\u0001J5\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010É\u00012\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010}\u001a\u00020L2\u0006\u0010U\u001a\u00020TH\u0012¢\u0006\u0006\bË\u0001\u0010Ì\u0001J.\u0010Ï\u0001\u001a\u00020\u00172\u0007\u0010²\u0001\u001a\u00020\u000e2\u0007\u0010Í\u0001\u001a\u00020\u00122\b\u0010¤\u0001\u001a\u00030Î\u0001H\u0012¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J.\u0010Ò\u0001\u001a\u00020\u00122\u0007\u0010²\u0001\u001a\u00020\u000e2\u0007\u0010±\u0001\u001a\u00020\u000e2\b\u0010¤\u0001\u001a\u00030Ñ\u0001H\u0012¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001R\u001d\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010\n\u001a\u00020\t8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\n\u0010×\u0001R \u0010Ù\u0001\u001a\u00030Ø\u00018\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R \u0010Þ\u0001\u001a\u00030Ý\u00018\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u0017\u0010â\u0001\u001a\u00020\u00128\u0012X\u0092\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0017\u0010ä\u0001\u001a\u00020\u00128\u0012X\u0092\u0004¢\u0006\b\n\u0006\bä\u0001\u0010ã\u0001R\u0018\u0010æ\u0001\u001a\u00030å\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010é\u0001\u001a\u00030è\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ì\u0001\u001a\u00030ë\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0018\u0010ï\u0001\u001a\u00030î\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u001e\u0010ò\u0001\u001a\t\u0012\u0004\u0012\u0002050ñ\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u001e\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020b0ñ\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bô\u0001\u0010ó\u0001R\u001f\u0010ö\u0001\u001a\n\u0012\u0005\u0012\u00030õ\u00010ñ\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bö\u0001\u0010ó\u0001R\u001e\u0010ø\u0001\u001a\t\u0012\u0004\u0012\u00020D0÷\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R$\u0010û\u0001\u001a\u000f\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020L0ú\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R\u001c\u0010þ\u0001\u001a\u00070ý\u0001R\u00020\u00008\u0012X\u0092\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u001c\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R*\u0010\u0083\u0002\u001a\u00030\u0080\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010\u0082\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R)\u0010\u0088\u0002\u001a\u00020\u00128\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010ã\u0001\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010®\u0001R*\u0010\u008d\u0002\u001a\u00030\u008c\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R,\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u0093\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002\"\u0006\b\u0098\u0002\u0010\u0099\u0002R0\u0010\u009a\u0002\u001a\u00020\u00128\u0010@\u0010X\u0091\u000e¢\u0006\u001f\n\u0006\b\u009a\u0002\u0010ã\u0001\u0012\u0005\b\u009d\u0002\u0010\u0019\u001a\u0006\b\u009b\u0002\u0010\u008a\u0002\"\u0006\b\u009c\u0002\u0010®\u0001R\u0018\u0010\u009e\u0002\u001a\u00030õ\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R3\u0010¡\u0002\u001a\u0005\u0018\u00010 \u00028\u0010@\u0010X\u0091\u000e¢\u0006\u001f\n\u0006\b¡\u0002\u0010¢\u0002\u0012\u0005\b§\u0002\u0010\u0019\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R\u001c\u0010¨\u0002\u001a\u0005\u0018\u00010 \u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010¢\u0002R\u001c\u0010©\u0002\u001a\u0005\u0018\u00010 \u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b©\u0002\u0010¢\u0002R-\u0010<\u001a\u00020\t8\u0010@\u0010X\u0091\u000e¢\u0006\u001d\n\u0005\b<\u0010×\u0001\u0012\u0005\b\u00ad\u0002\u0010\u0019\u001a\u0005\bª\u0002\u0010h\"\u0006\b«\u0002\u0010¬\u0002R\"\u0010¯\u0002\u001a\u000b ®\u0002*\u0004\u0018\u00010Z0Z8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u001c\u0010²\u0002\u001a\u0005\u0018\u00010±\u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R)\u0010µ\u0002\u001a\u0014\u0012\u000f\u0012\r ®\u0002*\u0005\u0018\u00010´\u00020´\u00020\u0097\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R!\u0010¼\u0002\u001a\u00030·\u00028RX\u0092\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0002\u0010¹\u0002\u001a\u0006\bº\u0002\u0010»\u0002R\u0018\u0010¾\u0002\u001a\u00030½\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R \u0010Á\u0002\u001a\u00030À\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bÁ\u0002\u0010Â\u0002\u001a\u0006\bÃ\u0002\u0010Ä\u0002R9\u0010Æ\u0002\u001a\u001c\u0012\u0004\u0012\u00020T\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00070Å\u00020Å\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bÆ\u0002\u0010Ç\u0002\u001a\u0006\bÈ\u0002\u0010É\u0002R-\u0010Ë\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0005\u0012\u00030Ê\u00020Å\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bË\u0002\u0010Ç\u0002\u001a\u0006\bÌ\u0002\u0010É\u0002R,\u0010Î\u0002\u001a\u0005\u0018\u00010Í\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\bÎ\u0002\u0010Ï\u0002\u001a\u0006\bÐ\u0002\u0010Ñ\u0002\"\u0006\bÒ\u0002\u0010Ó\u0002R1\u0010Ô\u0002\u001a\u00020\u00102\u0007\u0010\u0085\u0001\u001a\u00020\u00108\u0016@PX\u0096\u000e¢\u0006\u0017\n\u0006\bÔ\u0002\u0010Õ\u0002\u001a\u0005\bÖ\u0002\u0010a\"\u0006\b×\u0002\u0010Ø\u0002R1\u0010Ú\u0002\u001a\u00020\u00102\u0007\u0010Ù\u0002\u001a\u00020\u00108\u0016@PX\u0096\u000e¢\u0006\u0017\n\u0006\bÚ\u0002\u0010Õ\u0002\u001a\u0005\bÛ\u0002\u0010a\"\u0006\bÜ\u0002\u0010Ø\u0002R6\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000e8\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010Ý\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002\"\u0006\bà\u0002\u0010\u009f\u0001R,\u0010â\u0002\u001a\u0005\u0018\u00010á\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bâ\u0002\u0010ã\u0002\u001a\u0006\bä\u0002\u0010å\u0002\"\u0006\bæ\u0002\u0010ç\u0002R\u0019\u0010è\u0002\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bè\u0002\u0010×\u0001R\u001e\u0010é\u0002\u001a\u00020R8\u0012X\u0093\u0004¢\u0006\u000f\n\u0006\bé\u0002\u0010ê\u0002\u0012\u0005\bë\u0002\u0010\u0019R\u0019\u0010ì\u0002\u001a\u00020\u00128\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bì\u0002\u0010ã\u0001R \u0010î\u0002\u001a\u00030í\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bî\u0002\u0010ï\u0002\u001a\u0006\bð\u0002\u0010ñ\u0002R\u0018\u0010õ\u0002\u001a\u00030ò\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\bó\u0002\u0010ô\u0002R\u0018\u0010ù\u0002\u001a\u00030ö\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\b÷\u0002\u0010ø\u0002R\u0016\u0010û\u0002\u001a\u00020T8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bú\u0002\u0010oR\u001a\u0010ÿ\u0002\u001a\u0005\u0018\u00010ü\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\bý\u0002\u0010þ\u0002R\u0017\u0010\u0081\u0003\u001a\u00020\u00128PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0080\u0003\u0010\u008a\u0002R\u0017\u0010\u0084\u0003\u001a\u00020R8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0003\u0010\u0083\u0003R-\u0010\u0087\u0003\u001a\u0004\u0018\u00010R2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010R8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0085\u0003\u0010\u0083\u0003\"\u0005\b\u0086\u0003\u0010rR\u0017\u0010\u008a\u0003\u001a\u00020A8PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0088\u0003\u0010\u0089\u0003R*\u0010\u008d\u0003\u001a\u00020\u00122\u0007\u0010\u0085\u0001\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u008b\u0003\u0010\u008a\u0002\"\u0006\b\u008c\u0003\u0010®\u0001R\u0018\u0010\u0091\u0003\u001a\u00030\u008e\u00038RX\u0092\u0004¢\u0006\b\u001a\u0006\b\u008f\u0003\u0010\u0090\u0003R\u0018\u0010\u0095\u0003\u001a\u00030\u0092\u00038RX\u0092\u0004¢\u0006\b\u001a\u0006\b\u0093\u0003\u0010\u0094\u0003R\u001d\u0010U\u001a\u00020T*\u0005\u0018\u00010\u0080\u00028RX\u0092\u0004¢\u0006\b\u001a\u0006\b\u0096\u0003\u0010\u0097\u0003R\u001e\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001*\u00020\u000e8RX\u0092\u0004¢\u0006\b\u001a\u0006\b\u0098\u0003\u0010\u0096\u0001¨\u0006\u009a\u0003"}, m18688d2 = {"Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/DivViewFacade;", "Lcom/yandex/div/core/Div2Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "constructorCallTime", "<init>", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;IJ)V", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;I)V", "Li9/E4;", "data", "Lcom/yandex/div/DivDataTag;", "tag", "", "setData", "(Li9/E4;Lcom/yandex/div/DivDataTag;)Z", "oldDivData", "(Li9/E4;Li9/E4;Lcom/yandex/div/DivDataTag;)Z", "", "tryLogVisibility", "()V", "discardVisibilityTracking", "trackChildrenVisibility", "Lcom/yandex/div/core/DivCustomContainerChildFactory;", "getCustomContainerChildFactory$div_release", "()Lcom/yandex/div/core/DivCustomContainerChildFactory;", "getCustomContainerChildFactory", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/yandex/div/core/images/LoadReference;", "loadReference", "Landroid/view/View;", "targetView", "addLoadReference", "(Lcom/yandex/div/core/images/LoadReference;Landroid/view/View;)V", "cleanup", "stateId", "temporary", "switchToState", "(JZ)V", "switchToInitialState", "Lcom/yandex/div/core/state/DivStatePath;", "path", "(Lcom/yandex/div/core/state/DivStatePath;Z)V", "Lcom/yandex/div/core/downloader/PersistentDivDataObserver;", "observer", "addPersistentDivDataObserver$div_release", "(Lcom/yandex/div/core/downloader/PersistentDivDataObserver;)V", "addPersistentDivDataObserver", "removePersistentDivDataObserver$div_release", "removePersistentDivDataObserver", "resetToInitialState", "Li9/Z;", "rootDiv$div_release", "()Li9/Z;", "rootDiv", "Li9/k0;", "action", "", "reason", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "handleAction", "(Li9/k0;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "handleActionWithResult", "(Li9/k0;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lcom/yandex/div/core/DivViewConfig;", "viewConfig", "setConfig", "(Lcom/yandex/div/core/DivViewConfig;)V", "getConfig", "()Lcom/yandex/div/core/DivViewConfig;", "getDivTag", "()Lcom/yandex/div/DivDataTag;", "Lcom/yandex/div/internal/widget/menu/OverflowMenuSubscriber$Listener;", "listener", "subscribe", "(Lcom/yandex/div/internal/widget/menu/OverflowMenuSubscriber$Listener;)V", "clearSubscriptions", "getCurrentStateId", "()J", "Lcom/yandex/div/core/state/DivViewState;", "getCurrentState", "()Lcom/yandex/div/core/state/DivViewState;", "getView", "()Lcom/yandex/div/core/view2/Div2View;", "getExpressionResolver", "()Lcom/yandex/div/json/expressions/ExpressionResolver;", "tooltipId", "showTooltip", "(Ljava/lang/String;)V", "multiple", "(Ljava/lang/String;Z)V", "hideTooltip", "cancelTooltips", "dispatchDraw", "child", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "div", "bindViewToDiv$div_release", "(Landroid/view/View;Li9/Z;)V", "bindViewToDiv", "takeBindingDiv$div_release", "(Landroid/view/View;)Li9/Z;", "takeBindingDiv", IMAPStore.ID_NAME, ES6Iterator.VALUE_PROPERTY, "Lcom/yandex/div/data/VariableMutationException;", "setVariable", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/data/VariableMutationException;", "id", IMAPStore.ID_COMMAND, "applyTimerCommand", "(Ljava/lang/String;Ljava/lang/String;)V", "divId", "expressionResolver", "applyVideoCommand", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "unbindViewFromDiv$div_release", "unbindViewFromDiv", "divData", "Li9/E4$b;", "stateToBind", "(Li9/E4;)Li9/E4$b;", "Lkotlin/Function0;", "function", "bulkActions$div_release", "(Lkotlin/jvm/functions/Function0;)V", "bulkActions", "updateRuntimeStore", "(Li9/E4;Lcom/yandex/div/DivDataTag;)V", "tryAttachVariableTriggers", "(Li9/E4;)V", "updateTimers", "notifyBindStarted", "notifyBindEnded", "Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;", "reporter", "updateNow", "(Li9/E4;Lcom/yandex/div/DivDataTag;Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;)Z", "state", "trackStateVisibility", "(Li9/E4$b;)V", "discardStateVisibility", "discardChildrenVisibility", "sendCreationHistograms", "removeChildren", "(Z)V", "stopLoadAndSubscriptions", "cancelImageLoads", "oldData", "newData", "switchToDivData", "(Li9/E4;Li9/E4;Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;)Z", "(Li9/E4;)J", "forceSwitchToState", "(JZ)Z", "oldDiv", "newState", "newStateView", "allowsTransition", "bindBeforeViewAdded", "addNewStateViewWithTransition", "(Li9/E4;Li9/E4;Li9/Z;Li9/E4$b;Landroid/view/View;ZZ)V", "updateState", "(JZ)Landroid/view/View;", "isUpdateTemporary", "buildViewAndUpdateState", "(Li9/E4$b;JZ)Landroid/view/View;", "buildViewAsyncAndUpdateState", "newDiv", "Lr4/h;", "prepareTransition", "(Li9/E4;Li9/E4;Li9/Z;Li9/Z;)Lr4/h;", "Lkotlin/sequences/Sequence;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "itemSequenceForTransition", "(Li9/E4;Li9/Z;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lkotlin/sequences/Sequence;", "isAutoanimations", "Lcom/yandex/div/core/view2/logging/bind/SimpleRebindReporter;", "rebind", "(Li9/E4;ZLcom/yandex/div/core/view2/logging/bind/SimpleRebindReporter;)V", "Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;", "complexRebind", "(Li9/E4;Li9/E4;Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;)Z", "Lcom/yandex/div/core/Div2Context;", "getContext$div_release", "()Lcom/yandex/div/core/Div2Context;", "J", "Lcom/yandex/div/core/dagger/Div2Component;", "div2Component", "Lcom/yandex/div/core/dagger/Div2Component;", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/Div2Component;", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "viewComponent", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "getViewComponent$div_release", "()Lcom/yandex/div/core/dagger/Div2ViewComponent;", "bindOnAttachEnabled", "Z", "complexRebindEnabled", "Lcom/yandex/div/core/view2/ViewBindingProvider;", "bindingProvider", "Lcom/yandex/div/core/view2/ViewBindingProvider;", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporterProvider;", "bindingReporterProvider", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporterProvider;", "Lcom/yandex/div/core/view2/logging/patch/PatchEventReporterProvider;", "patchReporterProvider", "Lcom/yandex/div/core/view2/logging/patch/PatchEventReporterProvider;", "Lcom/yandex/div/core/view2/Div2Builder;", "divBuilder", "Lcom/yandex/div/core/view2/Div2Builder;", "", "loadReferences", "Ljava/util/List;", "overflowMenuListeners", "", "divDataChangedObservers", "Lcom/yandex/div/core/ObserverList;", "persistentDivDataObservers", "Lcom/yandex/div/core/ObserverList;", "Ljava/util/WeakHashMap;", "viewToDivBindings", "Ljava/util/WeakHashMap;", "Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "bulkActionsHandler", "Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "oldRuntimeStore", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "runtimeStore", "getRuntimeStore$div_release", "()Lcom/yandex/div/core/expression/local/RuntimeStore;", "setRuntimeStore$div_release", "(Lcom/yandex/div/core/expression/local/RuntimeStore;)V", "inMiddleOfBind", "getInMiddleOfBind$div_release", "()Z", "setInMiddleOfBind$div_release", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext$div_release", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext$div_release", "(Lcom/yandex/div/core/view2/BindingContext;)V", "Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "divTimerEventDispatcher", "Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "getDivTimerEventDispatcher$div_release", "()Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "setDivTimerEventDispatcher$div_release", "(Lcom/yandex/div/core/timer/DivTimerEventDispatcher;)V", "forceCanvasClipping", "getForceCanvasClipping", "setForceCanvasClipping", "getForceCanvasClipping$annotations", "monitor", "Ljava/lang/Object;", "Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "bindOnAttachRunnable", "Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "getBindOnAttachRunnable$div_release", "()Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "setBindOnAttachRunnable$div_release", "(Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;)V", "getBindOnAttachRunnable$div_release$annotations", "reportBindingResumedRunnable", "reportBindingFinishedRunnable", "getStateId$div_release", "setStateId$div_release", "(J)V", "getStateId$div_release$annotations", "kotlin.jvm.PlatformType", "config", "Lcom/yandex/div/core/DivViewConfig;", "Lcom/yandex/div/core/view2/reuse/RebindTask;", "rebindTask", "Lcom/yandex/div/core/view2/reuse/RebindTask;", "Lcom/yandex/div/histogram/RenderConfiguration;", "renderConfig", "Lkotlin/jvm/functions/Function0;", "Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "histogramReporter$delegate", "Lkotlin/Lazy;", "getHistogramReporter", "()Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "histogramReporter", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "inputFocusTracker", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "getInputFocusTracker$div_release", "()Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "", "layoutSizes", "Ljava/util/Map;", "getLayoutSizes$div_release", "()Ljava/util/Map;", "Lcom/yandex/div/core/view2/divs/DivLayoutProviderVariablesHolder;", "variablesHolders", "getVariablesHolders$div_release", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "clearVariablesListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getClearVariablesListener$div_release", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setClearVariablesListener$div_release", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "dataTag", "Lcom/yandex/div/DivDataTag;", "getDataTag", "setDataTag$div_release", "(Lcom/yandex/div/DivDataTag;)V", "<set-?>", "prevDataTag", "getPrevDataTag", "setPrevDataTag$div_release", "Li9/E4;", "getDivData", "()Li9/E4;", "setDivData$div_release", "Lcom/yandex/div/core/DivActionHandler;", "actionHandler", "Lcom/yandex/div/core/DivActionHandler;", "getActionHandler", "()Lcom/yandex/div/core/DivActionHandler;", "setActionHandler", "(Lcom/yandex/div/core/DivActionHandler;)V", "timeCreated", "viewCreateCallType", "Ljava/lang/String;", "getViewCreateCallType$annotations", "drawWasSkipped", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "divTransitionHandler", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "getDivTransitionHandler$div_release", "()Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "getReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "releaseViewVisitor", "Lcom/yandex/div/core/view2/divs/widgets/MediaReleaseViewVisitor;", "getMediaReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/MediaReleaseViewVisitor;", "mediaReleaseViewVisitor", "getOldExpressionResolver$div_release", "oldExpressionResolver", "Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "getCurrentRebindReusableList$div_release", "()Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "currentRebindReusableList", "getComplexRebindInProgress$div_release", "complexRebindInProgress", "getLogId", "()Ljava/lang/String;", "logId", "getComponentName", "setComponentName", "componentName", "getCurrentRootPath$div_release", "()Lcom/yandex/div/core/state/DivStatePath;", "currentRootPath", "getVisualErrorsEnabled", "setVisualErrorsEnabled", "visualErrorsEnabled", "Lcom/yandex/div/core/player/DivVideoActionHandler;", "getDivVideoActionHandler", "()Lcom/yandex/div/core/player/DivVideoActionHandler;", "divVideoActionHandler", "Lcom/yandex/div/core/tooltip/DivTooltipController;", "getTooltipController", "()Lcom/yandex/div/core/tooltip/DivTooltipController;", "tooltipController", "getResolver", "(Lcom/yandex/div/core/expression/local/RuntimeStore;)Lcom/yandex/div/json/expressions/ExpressionResolver;", "getStateToBind", "BulkActionHandler", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
@SuppressLint({"ViewConstructor"})
public class Div2View extends FrameContainerLayout implements DivViewFacade {
    private DivActionHandler actionHandler;
    private final boolean bindOnAttachEnabled;
    private SingleTimeOnAttachCallback bindOnAttachRunnable;
    private BindingContext bindingContext;
    private final ViewBindingProvider bindingProvider;
    private final BindingEventReporterProvider bindingReporterProvider;
    private final BulkActionHandler bulkActionsHandler;
    private ViewTreeObserver.OnPreDrawListener clearVariablesListener;
    private final boolean complexRebindEnabled;
    private DivViewConfig config;
    private final long constructorCallTime;
    private final Div2Context context;
    private DivDataTag dataTag;
    private final Div2Component div2Component;
    private final Div2Builder divBuilder;
    private C12131E4 divData;
    private final List<Object> divDataChangedObservers;
    private DivTimerEventDispatcher divTimerEventDispatcher;
    private final DivTransitionHandler divTransitionHandler;
    private boolean drawWasSkipped;
    private boolean forceCanvasClipping;
    private final GestureDetector gestureDetector;

    /* JADX INFO: renamed from: histogramReporter$delegate, reason: from kotlin metadata */
    private final Lazy histogramReporter;
    private boolean inMiddleOfBind;
    private final InputFocusTracker inputFocusTracker;
    private final Map<ExpressionResolver, Map<String, Integer>> layoutSizes;
    private final List<LoadReference> loadReferences;
    private final Object monitor;
    private RuntimeStore oldRuntimeStore;
    private final List<OverflowMenuSubscriber$Listener> overflowMenuListeners;
    private final PatchEventReporterProvider patchReporterProvider;
    private final ObserverList<PersistentDivDataObserver> persistentDivDataObservers;
    private DivDataTag prevDataTag;
    private RebindTask rebindTask;
    private final Function0<RenderConfiguration> renderConfig;
    private SingleTimeOnAttachCallback reportBindingFinishedRunnable;
    private SingleTimeOnAttachCallback reportBindingResumedRunnable;
    private RuntimeStore runtimeStore;
    private long stateId;
    private long timeCreated;
    private final Map<C12131E4, DivLayoutProviderVariablesHolder> variablesHolders;
    private final Div2ViewComponent viewComponent;
    private final String viewCreateCallType;
    private final WeakHashMap<View, AbstractC12482Z> viewToDivBindings;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0015\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0006R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m18688d2 = {"Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "", "<init>", "(Lcom/yandex/div/core/view2/Div2View;)V", "", "reset", "()V", "Lkotlin/Function0;", "function", "bulkActions", "(Lkotlin/jvm/functions/Function0;)V", "Li9/E4$b;", "state", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "temporary", "switchState", "(Li9/E4$b;Lcom/yandex/div/core/state/DivStatePath;Z)V", "", "paths", "switchMultipleStates", "(Li9/E4$b;Ljava/util/List;Z)V", "runBulkActions", "", "bulkModeDepth", "I", "pendingState", "Li9/E4$b;", "isPendingStateTemporary", "Z", "", "pendingPaths", "Ljava/util/List;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public final class BulkActionHandler {
        private int bulkModeDepth;
        private boolean isPendingStateTemporary = true;
        private final List<DivStatePath> pendingPaths = new ArrayList();
        private C12131E4.b pendingState;

        public BulkActionHandler() {
        }

        private final void reset() {
            this.pendingState = null;
            this.isPendingStateTemporary = true;
            this.pendingPaths.clear();
        }

        public final void bulkActions(Function0<Unit> function) {
            this.bulkModeDepth++;
            function.invoke();
            int i10 = this.bulkModeDepth - 1;
            this.bulkModeDepth = i10;
            if (i10 == 0) {
                runBulkActions();
            }
        }

        public final void runBulkActions() {
            C12131E4.b bVar = this.pendingState;
            if (bVar == null) {
                return;
            }
            long j10 = bVar.f39333b;
            if (j10 != Div2View.this.getStateId()) {
                Div2View.this.switchToState(j10, this.isPendingStateTemporary);
            } else if (Div2View.this.getChildCount() > 0) {
                try {
                    Div2View.this.getViewComponent().getStateSwitcher().switchStates(bVar, CollectionsKt.immutableCopy(this.pendingPaths), Div2View.this.getExpressionResolver());
                } catch (StateConflictException e10) {
                    DivActionTypedUtilsKt.logError(Div2View.this, e10);
                    Div2View.this.resetToInitialState();
                }
            }
            reset();
        }

        public final void switchMultipleStates(C12131E4.b state, List<DivStatePath> paths, boolean temporary) {
            C12131E4.b bVar = this.pendingState;
            if (bVar != null && !Intrinsics.areEqual(state, bVar)) {
                reset();
            }
            this.pendingState = state;
            this.isPendingStateTemporary = this.isPendingStateTemporary && temporary;
            List<DivStatePath> list = paths;
            CollectionsKt__MutableCollectionsKt.addAll(this.pendingPaths, list);
            Div2View div2View = Div2View.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                div2View.getDiv2Component().getStateManager().updateStates(div2View.getDivTag().getId(), (DivStatePath) it.next(), temporary);
            }
            if (this.bulkModeDepth == 0) {
                runBulkActions();
            }
        }

        public final void switchState(C12131E4.b state, DivStatePath path, boolean temporary) {
            switchMultipleStates(state, kotlin.collections.CollectionsKt.listOf(path), temporary);
        }
    }

    private Div2View(Div2Context div2Context, AttributeSet attributeSet, int i10, long j10) {
        super(div2Context, attributeSet, i10);
        this.context = div2Context;
        this.constructorCallTime = j10;
        this.div2Component = getContext().getDiv2Component();
        this.viewComponent = getDiv2Component().viewComponent().divView(this).build();
        this.bindOnAttachEnabled = getDiv2Component().isBindOnAttachEnabled();
        this.complexRebindEnabled = getDiv2Component().isComplexRebindEnabled();
        this.bindingProvider = getViewComponent().getBindingProvider();
        this.bindingReporterProvider = new BindingEventReporterProvider(this);
        this.patchReporterProvider = new PatchEventReporterProvider(this);
        this.divBuilder = getContext().getDiv2Component().getDiv2Builder();
        this.loadReferences = new ArrayList();
        this.overflowMenuListeners = new ArrayList();
        this.divDataChangedObservers = new ArrayList();
        this.persistentDivDataObservers = new ObserverList<>();
        this.viewToDivBindings = new WeakHashMap<>();
        this.bulkActionsHandler = new BulkActionHandler();
        this.runtimeStore = RuntimeStore.INSTANCE.getEMPTY();
        this.bindingContext = new BindingContext(this, ExpressionResolver.EMPTY);
        this.monitor = new Object();
        this.stateId = DivDataUtilsKt.getINVALID_STATE_ID(C12131E4.f39322j);
        this.config = DivViewConfig.DEFAULT;
        this.renderConfig = new Function0<RenderConfiguration>() { // from class: com.yandex.div.core.view2.Div2View$renderConfig$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RenderConfiguration invoke() {
                return DivKit.INSTANCE.getInstance(this.this$0.getContext()).getComponent().getHistogramRecordConfiguration().getRenderConfiguration().get();
            }
        };
        this.histogramReporter = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Div2ViewHistogramReporter>() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Div2ViewHistogramReporter invoke() {
                final Div2View div2View = this.this$0;
                return new Div2ViewHistogramReporter(new Function0<HistogramReporter>() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final HistogramReporter invoke() {
                        return div2View.getDiv2Component().getHistogramReporter();
                    }
                }, this.this$0.renderConfig);
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.div.core.view2.Div2View$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e10) {
                Div2View div2View = this.this$0;
                BaseDivViewExtensionsKt.clearFocusOnClick(div2View, div2View.getInputFocusTracker());
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        this.inputFocusTracker = getViewComponent().getInputFocusTracker();
        this.layoutSizes = new LinkedHashMap();
        this.variablesHolders = new LinkedHashMap();
        DivDataTag divDataTag = DivDataTag.INVALID;
        this.dataTag = divDataTag;
        this.prevDataTag = divDataTag;
        this.timeCreated = -1L;
        this.viewCreateCallType = getDiv2Component().getDivCreationTracker().getViewCreateCallType();
        this.drawWasSkipped = true;
        this.divTransitionHandler = new DivTransitionHandler(this);
        this.timeCreated = DivCreationTracker.INSTANCE.getCurrentUptimeMillis();
        getDiv2Component().getReleaseManager().observeDivLifecycle(this);
    }

    private void addNewStateViewWithTransition(C12131E4 oldData, C12131E4 newData, AbstractC12482Z oldDiv, C12131E4.b newState, View newStateView, boolean allowsTransition, boolean bindBeforeViewAdded) {
        AbstractC17833h abstractC17833hPrepareTransition = allowsTransition ? prepareTransition(oldData, newData, oldDiv, newState.f39332a) : null;
        if (abstractC17833hPrepareTransition != null) {
            C17832g c17832g = (C17832g) getTag(R.id.transition_current_scene);
            if (c17832g != null) {
                c17832g.f55468c = new RunnableC2093b(this);
            }
        } else {
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this, this);
        }
        if (bindBeforeViewAdded) {
            getDiv2Component().getDivBinder().bind(getBindingContext(), newStateView, newState.f39332a, DivStatePath.INSTANCE.fromState$div_release(newState));
        }
        if (abstractC17833hPrepareTransition == null) {
            addView(newStateView);
            getViewComponent().getErrorMonitor().connect(this);
            return;
        }
        C17835j.m20234b(this);
        C17832g c17832g2 = new C17832g();
        c17832g2.f55466a = this;
        c17832g2.f55467b = newStateView;
        SceneRootWatcher.INSTANCE.watchFor(c17832g2, abstractC17833hPrepareTransition);
        ArrayList<ViewGroup> arrayList = C17835j.f55478b;
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
        AbstractC17833h abstractC17833hMo27122clone = abstractC17833hPrepareTransition.clone();
        C17835j.m20236d(this, abstractC17833hMo27122clone);
        if (newStateView != null) {
            removeAllViews();
            addView(newStateView);
        }
        setTag(R.id.transition_current_scene, c17832g2);
        if (abstractC17833hMo27122clone != null) {
            C17835j.a aVar = new C17835j.a();
            aVar.f55479b = abstractC17833hMo27122clone;
            aVar.f55480c = this;
            addOnAttachStateChangeListener(aVar);
            getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNewStateViewWithTransition$lambda$41(Div2View div2View) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(div2View, div2View);
    }

    private View buildViewAndUpdateState(C12131E4.b newState, long stateId, boolean isUpdateTemporary) {
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, isUpdateTemporary);
        View viewBuildView = this.divBuilder.buildView(newState.f39332a, getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(newState));
        getDiv2Component().getDivBinder().attachIndicators$div_release();
        return viewBuildView;
    }

    public static /* synthetic */ View buildViewAndUpdateState$default(Div2View div2View, C12131E4.b bVar, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAndUpdateState");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return div2View.buildViewAndUpdateState(bVar, j10, z10);
    }

    private View buildViewAsyncAndUpdateState(final C12131E4.b newState, long stateId, boolean isUpdateTemporary) {
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, isUpdateTemporary);
        final DivStatePath divStatePathFromState$div_release = DivStatePath.INSTANCE.fromState$div_release(newState);
        final View viewCreateView = this.divBuilder.createView(newState.f39332a, getBindingContext(), divStatePathFromState$div_release);
        if (this.bindOnAttachEnabled) {
            setBindOnAttachRunnable$div_release(new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View.buildViewAsyncAndUpdateState.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Div2View div2View = Div2View.this;
                    View view = viewCreateView;
                    C12131E4.b bVar = newState;
                    try {
                        div2View.getDiv2Component().getDivBinder().bind(div2View.getBindingContext(), view, bVar.f39332a, divStatePathFromState$div_release);
                    } catch (ParsingException e10) {
                        if (!ExpressionFallbacksHelperKt.isExpressionResolveFail(e10)) {
                            throw e10;
                        }
                    }
                    Div2View.this.getDiv2Component().getDivBinder().attachIndicators$div_release();
                }
            }));
            return viewCreateView;
        }
        getDiv2Component().getDivBinder().bind(getBindingContext(), viewCreateView, newState.f39332a, divStatePathFromState$div_release);
        if (isAttachedToWindow()) {
            getDiv2Component().getDivBinder().attachIndicators$div_release();
            return viewCreateView;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.removeOnAttachStateChangeListener(this);
                this.getDiv2Component().getDivBinder().attachIndicators$div_release();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
        return viewCreateView;
    }

    public static /* synthetic */ View buildViewAsyncAndUpdateState$default(Div2View div2View, C12131E4.b bVar, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAsyncAndUpdateState");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return div2View.buildViewAsyncAndUpdateState(bVar, j10, z10);
    }

    private void cancelImageLoads() {
        Iterator<T> it = this.loadReferences.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.loadReferences.clear();
    }

    private boolean complexRebind(C12131E4 newData, C12131E4 oldData, ComplexRebindReporter reporter) {
        C12131E4.b stateToBind = getStateToBind(newData);
        if (stateToBind == null) {
            reporter.onComplexRebindFatalNoState();
            return false;
        }
        getHistogramReporter().onRebindingStarted();
        setDivData$div_release(newData);
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask == null) {
            RebindTask rebindTask2 = new RebindTask(this, getDiv2Component().getDivBinder(), getOldExpressionResolver$div_release(), getExpressionResolver(), reporter);
            this.rebindTask = rebindTask2;
            rebindTask = rebindTask2;
        }
        getDiv2Component().getStateManager().updateState(getDataTag(), stateToBind.f39333b, false);
        if (!rebindTask.prepareAndRebind(oldData, newData, (ViewGroup) getView().getChildAt(0), DivStatePath.INSTANCE.fromState$div_release(stateToBind))) {
            return false;
        }
        requestLayout();
        getHistogramReporter().onRebindingFinished();
        return true;
    }

    private void discardChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component().getVisibilityActionTracker();
        for (Map.Entry<View, AbstractC12482Z> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            AbstractC12482Z value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
            }
        }
    }

    private void discardStateVisibility(C12131E4.b state) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component().getVisibilityActionTracker(), this, getExpressionResolver(), null, state.f39332a, null, null, 48, null);
    }

    private boolean forceSwitchToState(long stateId, boolean temporary) {
        Object next;
        Object next2;
        setStateId$div_release(stateId);
        DivViewState currentState = getCurrentState();
        Long lValueOf = currentState != null ? Long.valueOf(currentState.getCurrentDivStateId()) : null;
        C12131E4 divData = getDivData();
        if (divData == null) {
            return false;
        }
        List<C12131E4.b> list = divData.f39325c;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long j10 = ((C12131E4.b) next).f39333b;
            if (lValueOf != null && j10 == lValueOf.longValue()) {
                break;
            }
        }
        C12131E4.b bVar = (C12131E4.b) next;
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((C12131E4.b) next2).f39333b != stateId);
        C12131E4.b bVar2 = (C12131E4.b) next2;
        if (bVar2 == null) {
            return false;
        }
        if (bVar != null) {
            discardStateVisibility(bVar);
        }
        trackStateVisibility(bVar2);
        boolean zAreDivsReplaceable$default = DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, bVar != null ? bVar.f39332a : null, bVar2.f39332a, getExpressionResolver(), getExpressionResolver(), null, 16, null);
        addNewStateViewWithTransition(divData, divData, bVar != null ? bVar.f39332a : null, bVar2, zAreDivsReplaceable$default ? updateState(stateId, temporary) : buildViewAndUpdateState(bVar2, stateId, temporary), DivTransitionsKt.allowsTransitionsOnDataChange(divData, getExpressionResolver()), zAreDivsReplaceable$default);
        return true;
    }

    private DivVideoActionHandler getDivVideoActionHandler() {
        return getDiv2Component().getDivVideoActionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Div2ViewHistogramReporter getHistogramReporter() {
        return (Div2ViewHistogramReporter) this.histogramReporter.getValue();
    }

    private ExpressionResolver getResolver(RuntimeStore runtimeStore) {
        ExpressionsRuntime rootRuntime;
        ExpressionResolverImpl expressionResolver;
        RuntimeStoreImpl runtimeStoreImpl = runtimeStore instanceof RuntimeStoreImpl ? (RuntimeStoreImpl) runtimeStore : null;
        return (runtimeStoreImpl == null || (rootRuntime = runtimeStoreImpl.getRootRuntime()) == null || (expressionResolver = rootRuntime.getExpressionResolver()) == null) ? ExpressionResolver.EMPTY : expressionResolver;
    }

    private C12131E4.b getStateToBind(C12131E4 c12131e4) {
        Object next;
        Iterator<T> it = c12131e4.f39325c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C12131E4.b) next).f39333b != getStateId());
        C12131E4.b bVar = (C12131E4.b) next;
        return bVar == null ? (C12131E4.b) kotlin.collections.CollectionsKt.firstOrNull((List) c12131e4.f39325c) : bVar;
    }

    private DivTooltipController getTooltipController() {
        return getDiv2Component().getTooltipController();
    }

    private Sequence<DivItemBuilderResult> itemSequenceForTransition(C12131E4 divData, AbstractC12482Z div, final ExpressionResolver resolver) {
        EnumC12073Ae enumC12073AeEvaluate;
        Expression<EnumC12073Ae> expression;
        final ArrayDeque arrayDeque = new ArrayDeque();
        if (divData == null || (expression = divData.f39327e) == null || (enumC12073AeEvaluate = expression.evaluate(resolver)) == null) {
            enumC12073AeEvaluate = EnumC12073Ae.NONE;
        }
        arrayDeque.addLast(enumC12073AeEvaluate);
        return SequencesKt.filter(DivTreeWalkKt.walk(div, resolver).onEnter(new Function1<AbstractC12482Z, Boolean>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AbstractC12482Z abstractC12482Z) {
                if (abstractC12482Z instanceof AbstractC12482Z.m) {
                    arrayDeque.addLast(((AbstractC12482Z.m) abstractC12482Z).f40848c.f43002L.evaluate(resolver));
                }
                return Boolean.TRUE;
            }
        }).onLeave(new Function1<AbstractC12482Z, Unit>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC12482Z abstractC12482Z) {
                invoke2(abstractC12482Z);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AbstractC12482Z abstractC12482Z) {
                if (abstractC12482Z instanceof AbstractC12482Z.m) {
                    arrayDeque.removeLast();
                }
            }
        }), new Function1<DivItemBuilderResult, Boolean>() { // from class: com.yandex.div.core.view2.Div2View.itemSequenceForTransition.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DivItemBuilderResult divItemBuilderResult) {
                boolean zAllowsTransitionsOnDataChange;
                List<EnumC12090Be> listMo14029i = divItemBuilderResult.getDiv().m14353c().mo14029i();
                if (listMo14029i != null) {
                    zAllowsTransitionsOnDataChange = DivTransitionsKt.allowsTransitionsOnDataChange(listMo14029i);
                } else {
                    EnumC12073Ae enumC12073AeLastOrNull = arrayDeque.lastOrNull();
                    zAllowsTransitionsOnDataChange = enumC12073AeLastOrNull != null ? DivTransitionsKt.allowsTransitionsOnDataChange(enumC12073AeLastOrNull) : false;
                }
                return Boolean.valueOf(zAllowsTransitionsOnDataChange);
            }
        });
    }

    private void notifyBindEnded() {
        setInMiddleOfBind$div_release(false);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onAfterDivDataChanged();
        }
    }

    private void notifyBindStarted() {
        if (getInMiddleOfBind()) {
            DivActionTypedUtilsKt.logError(this, new RuntimeException("New binding started when previous not ended!"));
        }
        setInMiddleOfBind$div_release(true);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onBeforeDivDataChanged();
        }
    }

    private AbstractC17833h prepareTransition(C12131E4 oldData, final C12131E4 newData, AbstractC12482Z oldDiv, AbstractC12482Z newDiv) {
        if (oldDiv == newDiv) {
            return null;
        }
        final C17837l c17837lBuildTransitions = getViewComponent().getTransitionBuilder().buildTransitions(oldDiv != null ? itemSequenceForTransition(oldData, oldDiv, getOldExpressionResolver$div_release()) : null, newDiv != null ? itemSequenceForTransition(newData, newDiv, getExpressionResolver()) : null, getOldExpressionResolver$div_release(), getExpressionResolver());
        if (c17837lBuildTransitions.f55483b.size() == 0) {
            return null;
        }
        final DivDataChangeListener divDataChangeListener = getDiv2Component().getDivDataChangeListener();
        divDataChangeListener.beforeAnimatedDataChange(this, newData);
        c17837lBuildTransitions.addListener(new C17834i() { // from class: com.yandex.div.core.view2.Div2View$prepareTransition$$inlined$doOnEnd$1
            @Override // p760r4.AbstractC17833h.f
            public void onTransitionEnd(AbstractC17833h transition) {
                divDataChangeListener.afterAnimatedDataChange(this, newData);
                c17837lBuildTransitions.removeListener(this);
            }
        });
        return c17837lBuildTransitions;
    }

    private void rebind(C12131E4 newData, boolean isAutoanimations, SimpleRebindReporter reporter) {
        try {
            if (getChildCount() == 0) {
                reporter.onSimpleRebindNoChild();
                updateNow(newData, getDataTag(), reporter);
                return;
            }
            C12131E4.b stateToBind = getStateToBind(newData);
            if (stateToBind == null) {
                reporter.onSimpleRebindFatalNoState();
                return;
            }
            getHistogramReporter().onRebindingStarted();
            ErrorCollector orNull = getViewComponent().getErrorCollectors().getOrNull(getDataTag(), getDivData());
            if (orNull != null) {
                orNull.cleanRuntimeWarningsAndErrors();
            }
            setDivData$div_release(newData);
            getDiv2Component().getStateManager().updateState(getDataTag(), stateToBind.f39333b, true);
            getDiv2Component().getDivBinder().bind(getBindingContext(), getChildAt(0), stateToBind.f39332a, DivStatePath.INSTANCE.fromState$div_release(stateToBind));
            requestLayout();
            if (isAutoanimations) {
                getDiv2Component().getDivStateChangeListener().onDivAnimatedStateChanged(this);
            }
            tryAttachVariableTriggers(newData);
            getHistogramReporter().onRebindingFinished();
            reporter.onSimpleRebindSuccess();
        } catch (Exception e10) {
            reporter.onSimpleRebindException(e10);
            updateNow(newData, getDataTag(), reporter);
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("", e10);
            }
        }
    }

    private void sendCreationHistograms() {
        if (this.timeCreated < 0) {
            return;
        }
        getDiv2Component().getDivCreationTracker().sendHistograms(this.constructorCallTime, this.timeCreated, getDiv2Component().getHistogramReporter(), this.viewCreateCallType);
        this.timeCreated = -1L;
    }

    private C12131E4.b state(C12131E4 c12131e4) {
        Object next;
        long jStateId = stateId(c12131e4);
        Iterator<T> it = c12131e4.f39325c.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C12131E4.b) next).f39333b == jStateId) {
                return (C12131E4.b) next;
            }
        }
        next = null;
        return (C12131E4.b) next;
    }

    private long stateId(C12131E4 c12131e4) {
        DivViewState currentState = getCurrentState();
        return currentState != null ? currentState.getCurrentDivStateId() : DivDataUtilsKt.getInitialStateId(c12131e4);
    }

    private void stopLoadAndSubscriptions() {
        this.viewToDivBindings.clear();
        cancelTooltips();
        clearSubscriptions();
        this.divDataChangedObservers.clear();
    }

    private boolean switchToDivData(C12131E4 oldData, C12131E4 newData, ForceRebindReporter reporter) {
        Div2View div2View;
        View viewBuildViewAndUpdateState$default;
        C12131E4.b bVarState = oldData != null ? state(oldData) : null;
        C12131E4.b bVarState2 = state(newData);
        setStateId$div_release(stateId(newData));
        if (bVarState2 == null) {
            reporter.onForceRebindFatalNoState();
            return false;
        }
        if (oldData == null) {
            div2View = this;
            viewBuildViewAndUpdateState$default = buildViewAsyncAndUpdateState$default(div2View, bVarState2, getStateId(), false, 4, null);
        } else {
            div2View = this;
            viewBuildViewAndUpdateState$default = buildViewAndUpdateState$default(div2View, bVarState2, getStateId(), false, 4, null);
        }
        View view = viewBuildViewAndUpdateState$default;
        if (bVarState != null) {
            discardStateVisibility(bVarState);
        }
        trackStateVisibility(bVarState2);
        div2View.addNewStateViewWithTransition(oldData, newData, bVarState != null ? bVarState.f39332a : null, bVarState2, view, (oldData != null && DivTransitionsKt.allowsTransitionsOnDataChange(oldData, getOldExpressionResolver$div_release())) || DivTransitionsKt.allowsTransitionsOnDataChange(newData, getExpressionResolver()), false);
        if (oldData != null) {
            reporter.onForceRebindSuccess();
        } else {
            reporter.onFirstBindingCompleted();
        }
        return true;
    }

    private void trackStateVisibility(C12131E4.b state) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component().getVisibilityActionTracker(), this, getExpressionResolver(), getView(), state.f39332a, null, null, 48, null);
    }

    private void tryAttachVariableTriggers(C12131E4 data) {
        C12131E4.b bVarState;
        if ((this.bindOnAttachEnabled && !getView().isAttachedToWindow()) || data == null || (bVarState = state(data)) == null) {
            return;
        }
        getViewComponent().getRuntimeVisitor().createAndAttachRuntimes(bVarState.f39332a, DivStatePath.INSTANCE.fromState$div_release(bVarState), this);
    }

    private boolean updateNow(C12131E4 data, DivDataTag tag, ForceRebindReporter reporter) {
        C12131E4 divData = getDivData();
        if (divData == null) {
            getHistogramReporter().onBindingStarted();
        } else {
            getHistogramReporter().onRebindingStarted();
        }
        cleanup(false);
        setDataTag$div_release(tag);
        setDivData$div_release(data);
        boolean zSwitchToDivData = switchToDivData(divData, data, reporter);
        tryAttachVariableTriggers(data);
        if (divData != null) {
            getHistogramReporter().onRebindingFinished();
            return zSwitchToDivData;
        }
        if (!this.bindOnAttachEnabled) {
            getHistogramReporter().onBindingFinished();
            return zSwitchToDivData;
        }
        getHistogramReporter().onBindingPaused();
        this.reportBindingResumedRunnable = new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View.updateNow.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Div2View.this.getHistogramReporter().onBindingResumed();
            }
        });
        this.reportBindingFinishedRunnable = new SingleTimeOnAttachCallback(this, new Function0<Unit>() { // from class: com.yandex.div.core.view2.Div2View.updateNow.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Div2View.this.getHistogramReporter().onBindingFinished();
            }
        });
        return zSwitchToDivData;
    }

    private void updateRuntimeStore(C12131E4 data, DivDataTag tag) {
        RuntimeStore runtimeStore;
        if (data == null) {
            return;
        }
        this.oldRuntimeStore = getRuntimeStore();
        setRuntimeStore$div_release(getDiv2Component().getRuntimeStoreProvider().getOrCreate$div_release(tag, data, this));
        getRuntimeStore().updateSubscriptions();
        if (!Intrinsics.areEqual(this.oldRuntimeStore, getRuntimeStore()) && (runtimeStore = this.oldRuntimeStore) != null) {
            runtimeStore.clearBindings(this);
        }
        setBindingContext$div_release(new BindingContext(this, getExpressionResolver()));
    }

    public static /* synthetic */ void updateRuntimeStore$default(Div2View div2View, C12131E4 c12131e4, DivDataTag divDataTag, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRuntimeStore");
        }
        if ((i10 & 1) != 0) {
            c12131e4 = div2View.getDivData();
        }
        if ((i10 & 2) != 0) {
            divDataTag = div2View.getDataTag();
        }
        div2View.updateRuntimeStore(c12131e4, divDataTag);
    }

    private View updateState(long stateId, boolean temporary) {
        View childAt = getView().getChildAt(0);
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, temporary);
        getDiv2Component().getDivBinder().attachIndicators$div_release();
        return childAt;
    }

    private void updateTimers() {
        DivTimerEventDispatcher divTimerEventDispatcher;
        C12131E4 divData = getDivData();
        if (divData == null) {
            return;
        }
        DivTimerEventDispatcher orCreate$div_release = getDiv2Component().getDivTimersControllerProvider().getOrCreate$div_release(getDataTag(), divData, getExpressionResolver());
        if (!Intrinsics.areEqual(getDivTimerEventDispatcher(), orCreate$div_release) && (divTimerEventDispatcher = getDivTimerEventDispatcher()) != null) {
            divTimerEventDispatcher.onDetach(this);
        }
        setDivTimerEventDispatcher$div_release(orCreate$div_release);
        if (orCreate$div_release != null) {
            orCreate$div_release.onAttach(this);
        }
    }

    public void addLoadReference(LoadReference loadReference, View targetView) {
        synchronized (this.monitor) {
            this.loadReferences.add(loadReference);
        }
    }

    public void addPersistentDivDataObserver$div_release(PersistentDivDataObserver observer) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.addObserver(observer);
        }
    }

    public void applyTimerCommand(String id2, String command) {
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.changeState(id2, command);
        }
    }

    @JvmOverloads
    public boolean applyVideoCommand(String divId, String command, ExpressionResolver expressionResolver) {
        return getDivVideoActionHandler().handleAction(this, divId, command, expressionResolver);
    }

    public void bindViewToDiv$div_release(View view, AbstractC12482Z div) {
        this.viewToDivBindings.put(view, div);
    }

    public void bulkActions$div_release(Function0<Unit> function) {
        this.bulkActionsHandler.bulkActions(function);
    }

    public void cancelTooltips() {
        getTooltipController().cancelTooltips(this);
    }

    public void cleanup() {
        synchronized (this.monitor) {
            cleanup(true);
            Unit unit = Unit.INSTANCE;
        }
    }

    public void clearSubscriptions() {
        synchronized (this.monitor) {
            this.overflowMenuListeners.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void discardVisibilityTracking() {
        List<C12131E4.b> list;
        C12131E4 divData = getDivData();
        C12131E4.b bVar = null;
        Object obj = null;
        bVar = null;
        if (divData != null && (list = divData.f39325c) != null) {
            for (Object obj2 : list) {
                if (((C12131E4.b) obj2).f39333b == getStateId()) {
                    obj = obj2;
                    break;
                }
            }
            bVar = (C12131E4.b) obj;
        }
        if (bVar != null) {
            discardStateVisibility(bVar);
        }
        discardChildrenVisibility();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawStarted();
        }
        super.dispatchDraw(canvas);
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawFinished();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.drawWasSkipped = false;
        getHistogramReporter().onDrawStarted();
        super.draw(canvas);
        getHistogramReporter().onDrawFinished();
        this.drawWasSkipped = true;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    public DivActionHandler getActionHandler() {
        return this.actionHandler;
    }

    /* JADX INFO: renamed from: getBindOnAttachRunnable$div_release, reason: from getter */
    public SingleTimeOnAttachCallback getBindOnAttachRunnable() {
        return this.bindOnAttachRunnable;
    }

    /* JADX INFO: renamed from: getBindingContext$div_release, reason: from getter */
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    /* JADX INFO: renamed from: getClearVariablesListener$div_release, reason: from getter */
    public ViewTreeObserver.OnPreDrawListener getClearVariablesListener() {
        return this.clearVariablesListener;
    }

    public boolean getComplexRebindInProgress$div_release() {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            return rebindTask.getRebindInProgress();
        }
        return false;
    }

    public String getComponentName() {
        return getHistogramReporter().getComponent();
    }

    public DivViewConfig getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: getContext$div_release, reason: from getter */
    public Div2Context getContext() {
        return this.context;
    }

    public ReusableTokenList getCurrentRebindReusableList$div_release() {
        RebindTask rebindTask;
        if (getComplexRebindInProgress$div_release() && (rebindTask = this.rebindTask) != null) {
            return rebindTask.getReusableList();
        }
        return null;
    }

    public DivStatePath getCurrentRootPath$div_release() {
        List<C12131E4.b> list;
        Object next;
        DivStatePath divStatePathFromState$div_release;
        C12131E4 divData = getDivData();
        if (divData != null && (list = divData.f39325c) != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C12131E4.b) next).f39333b != getStateId());
            C12131E4.b bVar = (C12131E4.b) next;
            if (bVar != null && (divStatePathFromState$div_release = DivStatePath.INSTANCE.fromState$div_release(bVar)) != null) {
                return divStatePathFromState$div_release;
            }
        }
        return DivStatePath.INSTANCE.fromState(getStateId());
    }

    public DivViewState getCurrentState() {
        C12131E4 divData = getDivData();
        if (divData == null) {
            return null;
        }
        DivViewState state = getDiv2Component().getStateManager().getState(getDataTag());
        List<C12131E4.b> list = divData.f39325c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C12131E4.b bVar : list) {
                if (state != null && bVar.f39333b == state.getCurrentDivStateId()) {
                    return state;
                }
            }
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId();
    }

    public DivCustomContainerChildFactory getCustomContainerChildFactory$div_release() {
        return getDiv2Component().getDivCustomContainerChildFactory();
    }

    public DivDataTag getDataTag() {
        return this.dataTag;
    }

    /* JADX INFO: renamed from: getDiv2Component$div_release, reason: from getter */
    public Div2Component getDiv2Component() {
        return this.div2Component;
    }

    public C12131E4 getDivData() {
        return this.divData;
    }

    public DivDataTag getDivTag() {
        return getDataTag();
    }

    /* JADX INFO: renamed from: getDivTimerEventDispatcher$div_release, reason: from getter */
    public DivTimerEventDispatcher getDivTimerEventDispatcher() {
        return this.divTimerEventDispatcher;
    }

    /* JADX INFO: renamed from: getDivTransitionHandler$div_release, reason: from getter */
    public DivTransitionHandler getDivTransitionHandler() {
        return this.divTransitionHandler;
    }

    public ExpressionResolver getExpressionResolver() {
        return getResolver(getRuntimeStore());
    }

    public boolean getForceCanvasClipping() {
        return this.forceCanvasClipping;
    }

    /* JADX INFO: renamed from: getInMiddleOfBind$div_release, reason: from getter */
    public boolean getInMiddleOfBind() {
        return this.inMiddleOfBind;
    }

    /* JADX INFO: renamed from: getInputFocusTracker$div_release, reason: from getter */
    public InputFocusTracker getInputFocusTracker() {
        return this.inputFocusTracker;
    }

    public Map<ExpressionResolver, Map<String, Integer>> getLayoutSizes$div_release() {
        return this.layoutSizes;
    }

    public String getLogId() {
        String str;
        C12131E4 divData = getDivData();
        return (divData == null || (str = divData.f39324b) == null) ? "" : str;
    }

    public MediaReleaseViewVisitor getMediaReleaseViewVisitor$div_release() {
        return getViewComponent().getMediaReleaseViewVisitor();
    }

    public ExpressionResolver getOldExpressionResolver$div_release() {
        return getResolver(this.oldRuntimeStore);
    }

    public DivDataTag getPrevDataTag() {
        return this.prevDataTag;
    }

    public ReleaseViewVisitor getReleaseViewVisitor$div_release() {
        return getViewComponent().getReleaseViewVisitor();
    }

    /* JADX INFO: renamed from: getRuntimeStore$div_release, reason: from getter */
    public RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    /* JADX INFO: renamed from: getStateId$div_release, reason: from getter */
    public long getStateId() {
        return this.stateId;
    }

    public Map<C12131E4, DivLayoutProviderVariablesHolder> getVariablesHolders$div_release() {
        return this.variablesHolders;
    }

    @Override // com.yandex.div.core.DivViewFacade
    public Div2View getView() {
        return this;
    }

    /* JADX INFO: renamed from: getViewComponent$div_release, reason: from getter */
    public Div2ViewComponent getViewComponent() {
        return this.viewComponent;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent().getErrorMonitor().getEnabled();
    }

    @JvmOverloads
    public void handleAction(C12679k0 action, String reason, ExpressionResolver resolver) {
        handleActionWithResult(action, reason, resolver);
    }

    @JvmOverloads
    public boolean handleActionWithResult(C12679k0 action, String reason, ExpressionResolver resolver) {
        return getDiv2Component().getActionBinder().handleAction$div_release(this, resolver, action, reason, null, getActionHandler());
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void hideTooltip(String tooltipId) {
        getTooltipController().hideTooltip(tooltipId, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        SingleTimeOnAttachCallback singleTimeOnAttachCallback = this.reportBindingResumedRunnable;
        if (singleTimeOnAttachCallback != null) {
            singleTimeOnAttachCallback.onAttach();
        }
        tryAttachVariableTriggers(getDivData());
        SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
        if (bindOnAttachRunnable != null) {
            bindOnAttachRunnable.onAttach();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback2 = this.reportBindingFinishedRunnable;
        if (singleTimeOnAttachCallback2 != null) {
            singleTimeOnAttachCallback2.onAttach();
        }
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.onAttach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        discardVisibilityTracking();
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.onDetach(this);
        }
        getViewComponent().getAnimatorController().onDetachedFromWindow();
        getRuntimeStore().onDetachedFromWindow(this);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        getHistogramReporter().onLayoutStarted();
        super.onLayout(changed, left, top, right, bottom);
        tryLogVisibility();
        getHistogramReporter().onLayoutFinished();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getHistogramReporter().onMeasureStarted();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        getHistogramReporter().onMeasureFinished();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        if (getInputFocusTracker().isFocusedOnInput()) {
            this.gestureDetector.onTouchEvent(event);
            if (event.getAction() == 0) {
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public void removePersistentDivDataObserver$div_release(PersistentDivDataObserver observer) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.removeObserver(observer);
        }
    }

    public void resetToInitialState() {
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            currentState.reset();
        }
        getDiv2Component().getTemporaryDivStateCache().resetCard(getDivTag().getId());
        switchToInitialState();
    }

    public AbstractC12482Z rootDiv$div_release() {
        C12131E4.b bVarState;
        C12131E4 divData = getDivData();
        if (divData == null || (bVarState = state(divData)) == null) {
            return null;
        }
        return bVarState.f39332a;
    }

    public void setActionHandler(DivActionHandler divActionHandler) {
        this.actionHandler = divActionHandler;
    }

    public void setBindOnAttachRunnable$div_release(SingleTimeOnAttachCallback singleTimeOnAttachCallback) {
        this.bindOnAttachRunnable = singleTimeOnAttachCallback;
    }

    public void setBindingContext$div_release(BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    public void setClearVariablesListener$div_release(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.clearVariablesListener = onPreDrawListener;
    }

    public void setComponentName(String str) {
        getHistogramReporter().setComponent(str);
    }

    public void setConfig(DivViewConfig viewConfig) {
        this.config = viewConfig;
    }

    public boolean setData(C12131E4 data, DivDataTag tag) {
        return setData(data, getDivData(), tag);
    }

    public void setDataTag$div_release(DivDataTag divDataTag) {
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = divDataTag;
        this.bindingProvider.update(divDataTag, getDivData());
    }

    public void setDivData$div_release(C12131E4 c12131e4) {
        this.divData = c12131e4;
        updateRuntimeStore$default(this, null, null, 3, null);
        updateTimers();
        this.bindingProvider.update(getDataTag(), this.divData);
    }

    public void setDivTimerEventDispatcher$div_release(DivTimerEventDispatcher divTimerEventDispatcher) {
        this.divTimerEventDispatcher = divTimerEventDispatcher;
    }

    public void setForceCanvasClipping(boolean z10) {
        this.forceCanvasClipping = z10;
    }

    public void setInMiddleOfBind$div_release(boolean z10) {
        this.inMiddleOfBind = z10;
    }

    public void setPrevDataTag$div_release(DivDataTag divDataTag) {
        this.prevDataTag = divDataTag;
    }

    public void setRuntimeStore$div_release(RuntimeStore runtimeStore) {
        this.runtimeStore = runtimeStore;
    }

    public void setStateId$div_release(long j10) {
        this.stateId = j10;
    }

    public VariableMutationException setVariable(String name, String value) {
        return VariableMutationHandler.INSTANCE.setVariable(this, name, value, getExpressionResolver());
    }

    public void setVisualErrorsEnabled(boolean z10) {
        getViewComponent().getErrorMonitor().setEnabled$div_release(z10);
    }

    public void showTooltip(String tooltipId) {
        DivTooltipController.showTooltip$default(getTooltipController(), tooltipId, getBindingContext(), false, 4, null);
    }

    public C12131E4.b stateToBind(C12131E4 divData) {
        return getStateToBind(divData);
    }

    public void subscribe(OverflowMenuSubscriber$Listener listener) {
        synchronized (this.monitor) {
            this.overflowMenuListeners.add(listener);
        }
    }

    public void switchToInitialState() {
        C12131E4 divData = getDivData();
        if (divData == null) {
            return;
        }
        long initialStateId = DivDataUtilsKt.getInitialStateId(divData);
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            initialStateId = currentState.getCurrentDivStateId();
        }
        C18639j.m21105a(this, initialStateId);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(long stateId, boolean temporary) {
        synchronized (this.monitor) {
            try {
                if (stateId != DivDataUtilsKt.getINVALID_STATE_ID(C12131E4.f39322j)) {
                    SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
                    if (bindOnAttachRunnable != null) {
                        bindOnAttachRunnable.cancel();
                    }
                    forceSwitchToState(stateId, temporary);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC12482Z takeBindingDiv$div_release(View view) {
        return this.viewToDivBindings.get(view);
    }

    public void trackChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component().getVisibilityActionTracker();
        for (Map.Entry<View, AbstractC12482Z> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            AbstractC12482Z value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                WeakHashMap<View, C5254U> weakHashMap = C5243I.f17079a;
                if (key.isAttachedToWindow()) {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, key, value, null, null, 48, null);
                } else {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
                }
            }
        }
    }

    public void tryLogVisibility() {
        List<C12131E4.b> list;
        C12131E4 divData = getDivData();
        C12131E4.b bVar = null;
        Object obj = null;
        bVar = null;
        if (divData != null && (list = divData.f39325c) != null) {
            for (Object obj2 : list) {
                if (((C12131E4.b) obj2).f39333b == getStateId()) {
                    obj = obj2;
                    break;
                }
            }
            bVar = (C12131E4.b) obj;
        }
        if (bVar != null) {
            trackStateVisibility(bVar);
        }
        trackChildrenVisibility();
    }

    public AbstractC12482Z unbindViewFromDiv$div_release(View view) {
        return this.viewToDivBindings.remove(view);
    }

    public boolean setData(C12131E4 data, C12131E4 oldDivData, DivDataTag tag) {
        synchronized (this.monitor) {
            C12131E4 c12131e4 = oldDivData;
            BindingEventReporter bindingEventReporter = this.bindingReporterProvider.get(c12131e4, data);
            boolean zUpdateNow = false;
            if (data == null) {
                bindingEventReporter.onBindingFatalNoData();
                return false;
            }
            if (getDivData() == data) {
                bindingEventReporter.onBindingFatalSameData();
                return false;
            }
            notifyBindStarted();
            SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
            if (bindOnAttachRunnable != null) {
                bindOnAttachRunnable.cancel();
            }
            getHistogramReporter().onRenderStarted();
            C12131E4 divData = getDivData();
            if (divData != null) {
                c12131e4 = divData;
            }
            updateRuntimeStore(data, tag);
            setDataTag$div_release(tag);
            for (C12131E4.b bVar : data.f39325c) {
                DivViewDataPreloader.preload$default(getDiv2Component().getDivViewDataPreloader(), bVar.f39332a, getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(bVar), null, 8, null);
            }
            boolean zIsDivDataReplaceable = DivComparator.INSTANCE.isDivDataReplaceable(c12131e4, data, getStateId(), getOldExpressionResolver$div_release(), getExpressionResolver(), bindingEventReporter);
            if (c12131e4 == null || DivTransitionsKt.allowsTransitionsOnDataChange(data, getExpressionResolver())) {
                zUpdateNow = updateNow(data, tag, bindingEventReporter);
            } else if (zIsDivDataReplaceable || !this.complexRebindEnabled || !(getView().getChildAt(0) instanceof ViewGroup) || !complexRebind(data, c12131e4, bindingEventReporter)) {
                if (zIsDivDataReplaceable) {
                    rebind(data, false, bindingEventReporter);
                } else {
                    zUpdateNow = updateNow(data, tag, bindingEventReporter);
                }
            }
            getDiv2Component().getDivBinder().attachIndicators$div_release();
            sendCreationHistograms();
            notifyBindEnded();
            return zUpdateNow;
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(String tooltipId, boolean multiple) {
        getTooltipController().showTooltip(tooltipId, getBindingContext(), multiple);
    }

    private void cleanup(boolean removeChildren) {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            rebindTask.clear();
            Unit unit = Unit.INSTANCE;
            this.rebindTask = null;
        }
        discardVisibilityTracking();
        cancelImageLoads();
        ReleaseUtils releaseUtils = ReleaseUtils.INSTANCE;
        releaseUtils.releaseMedia$div_release(this, this);
        stopLoadAndSubscriptions();
        getDiv2Component().getBitmapEffectHelper().release();
        if (removeChildren) {
            releaseUtils.releaseAndRemoveChildren$div_release(this, this);
        }
        ErrorCollector orNull = getViewComponent().getErrorCollectors().getOrNull(getDataTag(), getDivData());
        if (orNull != null) {
            orNull.cleanRuntimeWarningsAndErrors();
        }
        setDivData$div_release(null);
        setDataTag$div_release(DivDataTag.INVALID);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(DivStatePath path, boolean temporary) {
        List<C12131E4.b> list;
        synchronized (this.monitor) {
            try {
                C12131E4 divData = getDivData();
                C12131E4.b bVar = null;
                Object obj = null;
                bVar = null;
                if (divData != null && (list = divData.f39325c) != null) {
                    for (Object obj2 : list) {
                        if (((C12131E4.b) obj2).f39333b == path.getTopLevelStateId()) {
                            obj = obj2;
                            break;
                        }
                    }
                    bVar = (C12131E4.b) obj;
                }
                this.bulkActionsHandler.switchState(bVar, path, temporary);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    public /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @JvmOverloads
    public Div2View(Div2Context div2Context, AttributeSet attributeSet, int i10) {
        this(div2Context, attributeSet, i10, SystemClock.uptimeMillis());
    }
}
