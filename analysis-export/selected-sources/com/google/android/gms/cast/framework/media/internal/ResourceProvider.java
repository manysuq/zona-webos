package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import mobi.zona.R;
import p039C2.C0526l;
import p623j$.util.DesugarCollections;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceProvider {

    /* JADX INFO: renamed from: a */
    public static final Map f29207a;

    static {
        HashMap map = new HashMap();
        C0526l.m1045b(R.drawable.cast_ic_notification_small_icon, map, "smallIconDrawableResId", R.drawable.cast_ic_notification_stop_live_stream, "stopLiveStreamDrawableResId");
        C0526l.m1045b(R.drawable.cast_ic_notification_pause, map, "pauseDrawableResId", R.drawable.cast_ic_notification_play, "playDrawableResId");
        C0526l.m1045b(R.drawable.cast_ic_notification_skip_next, map, "skipNextDrawableResId", R.drawable.cast_ic_notification_skip_prev, "skipPrevDrawableResId");
        C0526l.m1045b(R.drawable.cast_ic_notification_forward, map, "forwardDrawableResId", R.drawable.cast_ic_notification_forward10, "forward10DrawableResId");
        C0526l.m1045b(R.drawable.cast_ic_notification_forward30, map, "forward30DrawableResId", R.drawable.cast_ic_notification_rewind, "rewindDrawableResId");
        C0526l.m1045b(R.drawable.cast_ic_notification_rewind10, map, "rewind10DrawableResId", R.drawable.cast_ic_notification_rewind30, "rewind30DrawableResId");
        C0526l.m1045b(R.drawable.cast_ic_notification_disconnect, map, "disconnectDrawableResId", R.dimen.cast_notification_image_size, "notificationImageSizeDimenResId");
        C0526l.m1045b(R.string.cast_casting_to_device, map, "castingToDeviceStringResId", R.string.cast_stop_live_stream, "stopLiveStreamStringResId");
        C0526l.m1045b(R.string.cast_pause, map, "pauseStringResId", R.string.cast_play, "playStringResId");
        C0526l.m1045b(R.string.cast_skip_next, map, "skipNextStringResId", R.string.cast_skip_prev, "skipPrevStringResId");
        C0526l.m1045b(R.string.cast_forward, map, "forwardStringResId", R.string.cast_forward_10, "forward10StringResId");
        C0526l.m1045b(R.string.cast_forward_30, map, "forward30StringResId", R.string.cast_rewind, "rewindStringResId");
        C0526l.m1045b(R.string.cast_rewind_10, map, "rewind10StringResId", R.string.cast_rewind_30, "rewind30StringResId");
        map.put("disconnectStringResId", Integer.valueOf(R.string.cast_disconnect));
        f29207a = DesugarCollections.unmodifiableMap(map);
    }

    @Keep
    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f29207a.get(str);
    }
}
