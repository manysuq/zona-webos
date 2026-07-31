package com.yandex.div.core;

import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivTreeVisitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import p607i9.AbstractC12482Z;
import p607i9.C12378Se;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001eB3\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, m18688d2 = {"Lcom/yandex/div/core/DivViewDataPreloader;", "", "Lcom/yandex/div/core/view2/DivImagePreloader;", "imagePreloader", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "customContainerViewAdapter", "Lcom/yandex/div/core/extension/DivExtensionController;", "extensionController", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "videoPreloader", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "<init>", "(Lcom/yandex/div/core/view2/DivImagePreloader;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/player/DivPlayerPreloader;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "Li9/Z;", "div", "Lcom/yandex/div/core/view2/BindingContext;", "context", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "Lcom/yandex/div/core/DivPreloader$Ticket;", "preload", "(Li9/Z;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/DivPreloader$Callback;)Lcom/yandex/div/core/DivPreloader$Ticket;", "Lcom/yandex/div/core/view2/DivImagePreloader;", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "Lcom/yandex/div/core/extension/DivExtensionController;", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "PreloadVisitor", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public class DivViewDataPreloader {
    private final DivCustomContainerViewAdapter customContainerViewAdapter;
    private final DivExtensionController extensionController;
    private final DivImagePreloader imagePreloader;
    private final DivPreloader.PreloadFilter preloadFilter;
    private final DivPlayerPreloader videoPreloader;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m18688d2 = {"Lcom/yandex/div/core/DivViewDataPreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivTreeVisitor;", "", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "downloadCallback", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "<init>", "(Lcom/yandex/div/core/DivViewDataPreloader;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Lcom/yandex/div/core/DivPreloader$Callback;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "Li9/Z;", "div", "Lcom/yandex/div/core/view2/BindingContext;", "context", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/DivPreloader$Ticket;", "preload", "(Li9/Z;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Lcom/yandex/div/core/DivPreloader$Ticket;", "data", "defaultVisit", "(Li9/Z;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$b;", "visit", "(Li9/Z$b;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "Li9/Z$q;", "(Li9/Z$q;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/core/DivPreloader$Callback;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "ticket", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public final class PreloadVisitor extends DivTreeVisitor<Unit> {
        private final DivPreloader.Callback callback;
        private final DivPreloader.DownloadCallback downloadCallback;
        private final DivPreloader.PreloadFilter preloadFilter;
        private final DivPreloader.TicketImpl ticket;

        /* JADX WARN: Multi-variable type inference failed */
        public PreloadVisitor(DivPreloader.DownloadCallback downloadCallback, DivPreloader.Callback callback, DivPreloader.PreloadFilter preloadFilter) {
            super(null, 1, 0 == true ? 1 : 0);
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.preloadFilter = preloadFilter;
            this.ticket = new DivPreloader.TicketImpl();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(AbstractC12482Z abstractC12482Z, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(abstractC12482Z, bindingContext, divStatePath);
            return Unit.INSTANCE;
        }

        public final DivPreloader.Ticket preload(AbstractC12482Z div, BindingContext context, DivStatePath path) {
            visit(div, context, path);
            return this.ticket;
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.b bVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(bVar, bindingContext, divStatePath);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(AbstractC12482Z data, BindingContext context, DivStatePath path) {
            List<LoadReference> listPreloadImage;
            DivImagePreloader divImagePreloader = DivViewDataPreloader.this.imagePreloader;
            if (divImagePreloader != null && (listPreloadImage = divImagePreloader.preloadImage(data, context.getExpressionResolver(), this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = listPreloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivViewDataPreloader.this.extensionController.preprocessExtensions(data.m14353c(), context.getExpressionResolver());
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit visit(AbstractC12482Z.q qVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(qVar, bindingContext, divStatePath);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.b data, BindingContext context, DivStatePath path) {
            super.visit(data, context, path);
            this.ticket.addReference(DivViewDataPreloader.this.customContainerViewAdapter.preload(data.f40837c, this.callback));
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        public void visit2(AbstractC12482Z.q data, BindingContext context, DivStatePath path) {
            defaultVisit2((AbstractC12482Z) data, context, path);
            if (this.preloadFilter.shouldPreloadContent(data, context.getExpressionResolver())) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = data.f40852c.f40022Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C12378Se) it.next()).f40252d.evaluate(context.getExpressionResolver()));
                }
                this.ticket.addReference(DivViewDataPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    public DivViewDataPreloader(DivImagePreloader divImagePreloader, DivCustomContainerViewAdapter divCustomContainerViewAdapter, DivExtensionController divExtensionController, DivPlayerPreloader divPlayerPreloader, DivPreloader.PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    public static /* synthetic */ DivPreloader.Ticket preload$default(DivViewDataPreloader divViewDataPreloader, AbstractC12482Z abstractC12482Z, BindingContext bindingContext, DivStatePath divStatePath, DivPreloader.Callback callback, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i10 & 8) != 0) {
            callback = DivPreloader.INSTANCE.getNO_CALLBACK$div_release();
        }
        return divViewDataPreloader.preload(abstractC12482Z, bindingContext, divStatePath, callback);
    }

    public DivPreloader.Ticket preload(AbstractC12482Z div, BindingContext context, DivStatePath path, DivPreloader.Callback callback) {
        DivPreloader.DownloadCallback downloadCallback = new DivPreloader.DownloadCallback(callback);
        DivPreloader.Ticket ticketPreload = new PreloadVisitor(downloadCallback, callback, this.preloadFilter).preload(div, context, path);
        downloadCallback.onFullPreloadStarted();
        return ticketPreload;
    }
}
