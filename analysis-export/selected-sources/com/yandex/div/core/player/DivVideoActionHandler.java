package com.yandex.div.core.player;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p607i9.AbstractC12482Z;
import p607i9.C12116D6;
import p607i9.C12131E4;
import p607i9.C12328Pe;
import p607i9.C12418V3;
import p607i9.C12603fd;
import p607i9.C12757o6;
import p607i9.C12835sc;
import p607i9.C12866u9;
import p607i9.C12912x4;
import p607i9.InterfaceC12611g3;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001d"}, m18688d2 = {"Lcom/yandex/div/core/player/DivVideoActionHandler;", "", "Lcom/yandex/div/core/player/DivVideoViewMapper;", "videoViewMapper", "<init>", "(Lcom/yandex/div/core/player/DivVideoViewMapper;)V", "Li9/E4;", "divData", "", "id", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Li9/Pe;", "searchDivDataForVideo", "(Li9/E4;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Li9/Pe;", "Li9/g3;", "div", "findDivVideoWithId", "(Li9/g3;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Li9/Pe;", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "divId", "action", "expressionResolver", "", "handleAction", "(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lcom/yandex/div/core/player/DivVideoViewMapper;", "Companion", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class DivVideoActionHandler {
    private final DivVideoViewMapper videoViewMapper;

    public DivVideoActionHandler(DivVideoViewMapper divVideoViewMapper) {
        this.videoViewMapper = divVideoViewMapper;
    }

    private final C12328Pe findDivVideoWithId(InterfaceC12611g3 div, String id2, ExpressionResolver resolver) {
        InterfaceC12611g3 interfaceC12611g3M14353c;
        if (div instanceof C12328Pe) {
            C12328Pe c12328Pe = (C12328Pe) div;
            if (Intrinsics.areEqual(c12328Pe.f40047t, id2)) {
                return c12328Pe;
            }
            return null;
        }
        if (div instanceof C12757o6) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems((C12757o6) div, resolver)) {
                C12328Pe c12328PeFindDivVideoWithId = findDivVideoWithId(divItemBuilderResult.getDiv().m14353c(), id2, divItemBuilderResult.getExpressionResolver());
                if (c12328PeFindDivVideoWithId != null) {
                    return c12328PeFindDivVideoWithId;
                }
            }
            return null;
        }
        if (div instanceof C12418V3) {
            for (DivItemBuilderResult divItemBuilderResult2 : DivCollectionExtensionsKt.buildItems((C12418V3) div, resolver)) {
                C12328Pe c12328PeFindDivVideoWithId2 = findDivVideoWithId(divItemBuilderResult2.getDiv().m14353c(), id2, divItemBuilderResult2.getExpressionResolver());
                if (c12328PeFindDivVideoWithId2 != null) {
                    return c12328PeFindDivVideoWithId2;
                }
            }
            return null;
        }
        if (div instanceof C12116D6) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems((C12116D6) div).iterator();
            while (it.hasNext()) {
                C12328Pe c12328PeFindDivVideoWithId3 = findDivVideoWithId(((AbstractC12482Z) it.next()).m14353c(), id2, resolver);
                if (c12328PeFindDivVideoWithId3 != null) {
                    return c12328PeFindDivVideoWithId3;
                }
            }
            return null;
        }
        if (div instanceof C12866u9) {
            for (DivItemBuilderResult divItemBuilderResult3 : DivCollectionExtensionsKt.buildItems((C12866u9) div, resolver)) {
                C12328Pe c12328PeFindDivVideoWithId4 = findDivVideoWithId(divItemBuilderResult3.getDiv().m14353c(), id2, divItemBuilderResult3.getExpressionResolver());
                if (c12328PeFindDivVideoWithId4 != null) {
                    return c12328PeFindDivVideoWithId4;
                }
            }
            return null;
        }
        if (div instanceof C12603fd) {
            Iterator<T> it2 = ((C12603fd) div).f41588q.iterator();
            while (it2.hasNext()) {
                C12328Pe c12328PeFindDivVideoWithId5 = findDivVideoWithId(((C12603fd.a) it2.next()).f41598a.m14353c(), id2, resolver);
                if (c12328PeFindDivVideoWithId5 != null) {
                    return c12328PeFindDivVideoWithId5;
                }
            }
            return null;
        }
        if (div instanceof C12912x4) {
            List<AbstractC12482Z> list = ((C12912x4) div).f43366q;
            if (list != null) {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    C12328Pe c12328PeFindDivVideoWithId6 = findDivVideoWithId(((AbstractC12482Z) it3.next()).m14353c(), id2, resolver);
                    if (c12328PeFindDivVideoWithId6 != null) {
                        return c12328PeFindDivVideoWithId6;
                    }
                }
            }
            return null;
        }
        if (div instanceof C12835sc) {
            Iterator<T> it4 = ((C12835sc) div).f42999I.iterator();
            while (it4.hasNext()) {
                AbstractC12482Z abstractC12482Z = ((C12835sc.a) it4.next()).f43043c;
                if (abstractC12482Z != null && (interfaceC12611g3M14353c = abstractC12482Z.m14353c()) != null) {
                    C12328Pe c12328PeFindDivVideoWithId7 = findDivVideoWithId(interfaceC12611g3M14353c, id2, resolver);
                    if (c12328PeFindDivVideoWithId7 != null) {
                        return c12328PeFindDivVideoWithId7;
                    }
                }
            }
        }
        return null;
    }

    private final C12328Pe searchDivDataForVideo(C12131E4 divData, String id2, ExpressionResolver resolver) {
        Iterator<T> it = divData.f39325c.iterator();
        while (it.hasNext()) {
            C12328Pe c12328PeFindDivVideoWithId = findDivVideoWithId(((C12131E4.b) it.next()).f39332a.m14353c(), id2, resolver);
            if (c12328PeFindDivVideoWithId != null) {
                return c12328PeFindDivVideoWithId;
            }
        }
        return null;
    }

    public final boolean handleAction(Div2View div2View, String divId, String action, ExpressionResolver expressionResolver) {
        C12328Pe c12328PeSearchDivDataForVideo;
        DivPlayer player;
        C12131E4 divData = div2View.getDivData();
        if (divData == null || (c12328PeSearchDivDataForVideo = searchDivDataForVideo(divData, divId, expressionResolver)) == null || (player = this.videoViewMapper.getPlayer(c12328PeSearchDivDataForVideo)) == null) {
            return false;
        }
        if (Intrinsics.areEqual(action, "start")) {
            player.play();
            return true;
        }
        if (Intrinsics.areEqual(action, "pause")) {
            player.pause();
            return true;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("No such video action: " + action);
        }
        return false;
    }
}
