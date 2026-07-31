package com.yandex.div.core.view2.divs.widgets;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016¨\u0006\t"}, m18688d2 = {"Lcom/yandex/div/core/view2/divs/widgets/MediaReleaseViewVisitor;", "Lcom/yandex/div/core/view2/divs/widgets/DivViewVisitor;", "()V", "visit", "", "view", "Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", "Lcom/yandex/div/core/view2/divs/widgets/DivImageView;", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public class MediaReleaseViewVisitor extends DivViewVisitor {
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivVideoView view) {
        view.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivImageView view) {
        view.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivGifImageView view) {
        view.release();
    }
}
