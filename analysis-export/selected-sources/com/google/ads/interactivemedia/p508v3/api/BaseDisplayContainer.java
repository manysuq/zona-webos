package com.google.ads.interactivemedia.p508v3.api;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface BaseDisplayContainer {
    void claim();

    @Deprecated
    void destroy();

    ViewGroup getAdContainer();

    Collection<CompanionAdSlot> getCompanionSlots();

    void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction);

    @Deprecated
    void registerVideoControlsOverlay(View view);

    @Deprecated
    void setAdContainer(ViewGroup viewGroup);

    void setCompanionSlots(Collection<CompanionAdSlot> collection);

    void unregisterAllFriendlyObstructions();

    @Deprecated
    void unregisterAllVideoControlsOverlays();
}
