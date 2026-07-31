package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import p607i9.AbstractC12735n2;
import p607i9.C12893w2;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m18688d2 = {"Lcom/yandex/div/core/actions/DivActionTypedVideoHandler;", "Lcom/yandex/div/core/actions/DivActionTypedHandler;", "<init>", "()V", "Li9/w2;", "action", "Lcom/yandex/div/core/view2/Div2View;", "view", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "handleVideoAction", "(Li9/w2;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "scopeId", "Li9/n2;", "", "handleAction", "(Ljava/lang/String;Li9/n2;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class DivActionTypedVideoHandler implements DivActionTypedHandler {
    private final void handleVideoAction(C12893w2 action, Div2View view, ExpressionResolver resolver) {
        String strEvaluate = action.f43244b.evaluate(resolver);
        C12893w2.a.b bVar = C12893w2.a.f43246c;
        view.applyVideoCommand(strEvaluate, action.f43243a.evaluate(resolver).f43251b, resolver);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String scopeId, AbstractC12735n2 action, Div2View view, ExpressionResolver resolver) {
        if (!(action instanceof AbstractC12735n2.u)) {
            return false;
        }
        handleVideoAction(((AbstractC12735n2.u) action).f42250b, view, resolver);
        return true;
    }
}
