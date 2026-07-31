package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import p063D8.C1077a;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18688d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivViewVisitor;", "Landroid/view/View;", "view", "", "visitViewTree", "(Lcom/yandex/div/core/view2/divs/widgets/DivViewVisitor;Landroid/view/View;)V", "div_release"}, m18689k = 2, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class DivViewVisitorKt {
    public static final void visitViewTree(DivViewVisitor divViewVisitor, View view) {
        if (view instanceof DivWrapLayout) {
            Iterator itM1720a = C1077a.m1720a((ViewGroup) view);
            while (itM1720a.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a.next());
            }
            divViewVisitor.visit((DivWrapLayout) view);
            return;
        }
        if (view instanceof DivFrameLayout) {
            Iterator itM1720a2 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a2.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a2.next());
            }
            divViewVisitor.visit((DivFrameLayout) view);
            return;
        }
        if (view instanceof DivGridLayout) {
            Iterator itM1720a3 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a3.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a3.next());
            }
            divViewVisitor.visit((DivGridLayout) view);
            return;
        }
        if (view instanceof DivLinearLayout) {
            Iterator itM1720a4 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a4.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a4.next());
            }
            divViewVisitor.visit((DivLinearLayout) view);
            return;
        }
        if (view instanceof DivPagerView) {
            Iterator itM1720a5 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a5.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a5.next());
            }
            divViewVisitor.visit((DivPagerView) view);
            return;
        }
        if (view instanceof DivRecyclerView) {
            Iterator itM1720a6 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a6.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a6.next());
            }
            divViewVisitor.visit((DivRecyclerView) view);
            return;
        }
        if (view instanceof DivStateLayout) {
            Iterator itM1720a7 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a7.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a7.next());
            }
            divViewVisitor.visit((DivStateLayout) view);
            return;
        }
        if (view instanceof DivTabsLayout) {
            Iterator itM1720a8 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a8.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a8.next());
            }
            divViewVisitor.visit((DivTabsLayout) view);
            return;
        }
        if (view instanceof DivCustomWrapper) {
            Iterator itM1720a9 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a9.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a9.next());
            }
            divViewVisitor.visit((DivCustomWrapper) view);
            return;
        }
        if (view instanceof DivSeparatorView) {
            divViewVisitor.visit((DivSeparatorView) view);
            return;
        }
        if (view instanceof DivGifImageView) {
            divViewVisitor.visit((DivGifImageView) view);
            return;
        }
        if (view instanceof DivImageView) {
            divViewVisitor.visit((DivImageView) view);
            return;
        }
        if (view instanceof DivLineHeightTextView) {
            divViewVisitor.visit((DivLineHeightTextView) view);
            return;
        }
        if (view instanceof DivPagerIndicatorView) {
            divViewVisitor.visit((DivPagerIndicatorView) view);
            return;
        }
        if (view instanceof DivSliderView) {
            divViewVisitor.visit((DivSliderView) view);
            return;
        }
        if (view instanceof DivSelectView) {
            divViewVisitor.visit((DivSelectView) view);
            return;
        }
        if (view instanceof DivVideoView) {
            divViewVisitor.visit((DivVideoView) view);
            return;
        }
        if (view instanceof DivSwitchView) {
            divViewVisitor.visit((DivSwitchView) view);
            return;
        }
        if (view instanceof ViewGroup) {
            Iterator itM1720a10 = C1077a.m1720a((ViewGroup) view);
            while (itM1720a10.hasNext()) {
                visitViewTree(divViewVisitor, (View) itM1720a10.next());
            }
        }
        divViewVisitor.visit(view);
    }
}
