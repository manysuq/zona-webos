package com.yandex.div.core.player;

import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p607i9.C12328Pe;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m18688d2 = {"Lcom/yandex/div/core/player/DivVideoViewMapper;", "", "<init>", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "view", "Li9/Pe;", "div", "", "addView", "(Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;Li9/Pe;)V", "Lcom/yandex/div/core/player/DivPlayer;", "getPlayer", "(Li9/Pe;)Lcom/yandex/div/core/player/DivPlayer;", "Ljava/util/WeakHashMap;", "currentViews", "Ljava/util/WeakHashMap;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class DivVideoViewMapper {
    private final WeakHashMap<DivVideoView, C12328Pe> currentViews = new WeakHashMap<>();

    public final void addView(DivVideoView view, C12328Pe div) {
        this.currentViews.put(view, div);
    }

    public final DivPlayer getPlayer(C12328Pe div) {
        Set<Map.Entry<DivVideoView, C12328Pe>> setEntrySet = this.currentViews.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getValue(), div) || Intrinsics.areEqual(((C12328Pe) entry.getValue()).f40047t, div.f40047t)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DivPlayerView playerView = ((DivVideoView) ((Map.Entry) it.next()).getKey()).getPlayerView();
            DivPlayer attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        return (DivPlayer) CollectionsKt.firstOrNull((List) arrayList2);
    }
}
