package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.yandex.div.core.player.DivVideoResolution;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import p607i9.C12328Pe;
import p607i9.C12378Se;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18688d2 = {"Li9/Pe;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "Lcom/yandex/div/core/player/DivVideoSource;", "createSource", "(Li9/Pe;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "div_release"}, m18689k = 2, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class DivVideoBinderKt {
    public static final List<DivVideoSource> createSource(C12328Pe c12328Pe, ExpressionResolver expressionResolver) {
        List<C12378Se> list = c12328Pe.f40022Q;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C12378Se c12378Se : list) {
            Uri uriEvaluate = c12378Se.f40252d.evaluate(expressionResolver);
            String strEvaluate = c12378Se.f40250b.evaluate(expressionResolver);
            C12378Se.a aVar = c12378Se.f40251c;
            Long lEvaluate = null;
            DivVideoResolution divVideoResolution = aVar != null ? new DivVideoResolution((int) aVar.f40255b.evaluate(expressionResolver).longValue(), (int) aVar.f40254a.evaluate(expressionResolver).longValue()) : null;
            Expression<Long> expression = c12378Se.f40249a;
            if (expression != null) {
                lEvaluate = expression.evaluate(expressionResolver);
            }
            arrayList.add(new DivVideoSource(uriEvaluate, strEvaluate, divVideoResolution, lEvaluate));
        }
        return arrayList;
    }
}
