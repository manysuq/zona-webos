package com.yandex.div.core.view2;

import android.view.View;
import androidx.lifecycle.AbstractC7737l;
import androidx.lifecycle.C7724Y;
import androidx.lifecycle.InterfaceC7742q;
import androidx.lifecycle.InterfaceC7744s;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.internal.Log;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0012¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR<\u0010\u0013\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0010j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0011`\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00018\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m18688d2 = {"Lcom/yandex/div/core/view2/ReleaseManager;", "", "Lcom/yandex/div/core/expression/RuntimeStoreProvider;", "runtimeStoreProvider", "<init>", "(Lcom/yandex/div/core/expression/RuntimeStoreProvider;)V", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lcom/yandex/div/core/view2/Div2View;", "divView", "addLifecycleListener", "(Landroidx/lifecycle/s;Lcom/yandex/div/core/view2/Div2View;)Ljava/lang/Object;", "", "observeDivLifecycle", "(Lcom/yandex/div/core/view2/Div2View;)V", "Lcom/yandex/div/core/expression/RuntimeStoreProvider;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "divToRelease", "Ljava/util/HashMap;", "monitor", "Ljava/lang/Object;", "Landroidx/lifecycle/q;", "observer", "Landroidx/lifecycle/q;", "Companion", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public class ReleaseManager {
    private final HashMap<InterfaceC7744s, Set<Div2View>> divToRelease = new HashMap<>();
    private final Object monitor = new Object();
    private final InterfaceC7742q observer = new InterfaceC7742q() { // from class: H8.v
        @Override // androidx.lifecycle.InterfaceC7742q
        /* JADX INFO: renamed from: m */
        public final void mo2747m(InterfaceC7744s interfaceC7744s, AbstractC7737l.a aVar) {
            ReleaseManager.observer$lambda$2(this.f6980b, interfaceC7744s, aVar);
        }
    };
    private final RuntimeStoreProvider runtimeStoreProvider;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18689k = 3, m18690mv = {1, 8, 0}, m18692xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC7737l.a.values().length];
            try {
                iArr[AbstractC7737l.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReleaseManager(RuntimeStoreProvider runtimeStoreProvider) {
        this.runtimeStoreProvider = runtimeStoreProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object addLifecycleListener(InterfaceC7744s lifecycleOwner, Div2View divView) {
        Object objValueOf;
        synchronized (this.monitor) {
            try {
                if (this.divToRelease.containsKey(lifecycleOwner)) {
                    Set<Div2View> set = this.divToRelease.get(lifecycleOwner);
                    objValueOf = set != null ? Boolean.valueOf(set.add(divView)) : null;
                } else {
                    this.divToRelease.put(lifecycleOwner, SetsKt.mutableSetOf(divView));
                    lifecycleOwner.getLifecycle().addObserver(this.observer);
                    objValueOf = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$2(ReleaseManager releaseManager, InterfaceC7744s interfaceC7744s, AbstractC7737l.a aVar) {
        synchronized (releaseManager.monitor) {
            try {
                if (WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()] == 1) {
                    Set<Div2View> set = releaseManager.divToRelease.get(interfaceC7744s);
                    if (set != null) {
                        for (Div2View div2View : set) {
                            div2View.cleanup();
                            releaseManager.runtimeStoreProvider.cleanupRuntime$div_release(div2View);
                        }
                    }
                    releaseManager.divToRelease.remove(interfaceC7744s);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void observeDivLifecycle(final Div2View divView) {
        InterfaceC7744s lifecycleOwner$div_release = divView.getContext().getLifecycleOwner();
        if (lifecycleOwner$div_release != null) {
            addLifecycleListener(lifecycleOwner$div_release, divView);
            return;
        }
        if (!divView.isAttachedToWindow()) {
            divView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.ReleaseManager$observeDivLifecycle$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    divView.removeOnAttachStateChangeListener(this);
                    InterfaceC7744s interfaceC7744sM9187a = C7724Y.m9187a(divView);
                    if (interfaceC7744sM9187a != null) {
                        this.addLifecycleListener(interfaceC7744sM9187a, divView);
                    } else {
                        Log.m12278w("ReleaseManager", "Attempt to bind a Div2View, which has no LifecycleOwner. Release event will not be caught! If you're using some long-lived resources, like a video player, call cleanup explicitly when you don't need Div2View anymore");
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
            return;
        }
        InterfaceC7744s interfaceC7744sM9187a = C7724Y.m9187a(divView);
        if (interfaceC7744sM9187a != null) {
            addLifecycleListener(interfaceC7744sM9187a, divView);
        } else {
            Log.m12278w("ReleaseManager", "Attempt to bind a Div2View, which has no LifecycleOwner. Release event will not be caught! If you're using some long-lived resources, like a video player, call cleanup explicitly when you don't need Div2View anymore");
        }
    }
}
