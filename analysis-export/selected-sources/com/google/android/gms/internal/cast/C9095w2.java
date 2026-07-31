package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.time.DurationKt;
import p092F1.C1473c;
import p503c7.C8362b;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.w2 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9095w2 {

    /* JADX INFO: renamed from: i */
    public static final C8362b f30063i = new C8362b("FeatureUsageAnalytics", null);

    /* JADX INFO: renamed from: j */
    public static final String f30064j = "21.4.0";

    /* JADX INFO: renamed from: k */
    public static C9095w2 f30065k;

    /* JADX INFO: renamed from: a */
    public final C9053r0 f30066a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f30067b;

    /* JADX INFO: renamed from: c */
    public final String f30068c;

    /* JADX INFO: renamed from: h */
    public long f30073h;

    /* JADX INFO: renamed from: f */
    public final HashSet f30071f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final HashSet f30072g = new HashSet();

    /* JADX INFO: renamed from: e */
    public final HandlerC8881V f30070e = new HandlerC8881V(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final RunnableC8883V1 f30069d = new Runnable() { // from class: com.google.android.gms.internal.cast.V1
        @Override // java.lang.Runnable
        public final void run() {
            C9095w2 c9095w2 = this.f29808b;
            HashSet hashSet = c9095w2.f30071f;
            SharedPreferences sharedPreferences = c9095w2.f30067b;
            HashSet hashSet2 = c9095w2.f30072g;
            if (hashSet.isEmpty()) {
                return;
            }
            long j10 = true != hashSet2.equals(hashSet) ? DurationKt.MILLIS_IN_DAY : 172800000L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = c9095w2.f30073h;
            if (j11 == 0 || jCurrentTimeMillis - j11 >= j10) {
                C9095w2.f30063i.m10228a("Upload the feature usage report.", new Object[0]);
                C8911Z1 c8911z1M10846m = C8919a2.m10846m();
                String str = C9095w2.f30064j;
                c8911z1M10846m.m10875e();
                C8919a2.m10849q((C8919a2) c8911z1M10846m.f29866c, str);
                String str2 = c9095w2.f30068c;
                c8911z1M10846m.m10875e();
                C8919a2.m10848p((C8919a2) c8911z1M10846m.f29866c, str2);
                C8919a2 c8919a2 = (C8919a2) c8911z1M10846m.m10873c();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(hashSet);
                C8862S1 c8862s1M10821m = C8869T1.m10821m();
                c8862s1M10821m.m10875e();
                C8869T1.m10824q((C8869T1) c8862s1M10821m.f29866c, arrayList);
                c8862s1M10821m.m10875e();
                C8869T1.m10823p((C8869T1) c8862s1M10821m.f29866c, c8919a2);
                C8869T1 c8869t1 = (C8869T1) c8862s1M10821m.m10873c();
                C8991j2 c8991j2M10922o = C8999k2.m10922o();
                c8991j2M10922o.m10875e();
                C8999k2.m10929v((C8999k2) c8991j2M10922o.f29866c, c8869t1);
                c9095w2.f30066a.m11007a((C8999k2) c8991j2M10922o.m10873c(), 243);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!hashSet2.equals(hashSet)) {
                    hashSet2.clear();
                    hashSet2.addAll(hashSet);
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        String string = Integer.toString(((EnumC8828N1) it.next()).f29758b);
                        String strM2035a = C1473c.m2035a("feature_usage_timestamp_reported_feature_", string);
                        if (!sharedPreferences.contains(strM2035a)) {
                            strM2035a = C1473c.m2035a("feature_usage_timestamp_detected_feature_", string);
                        }
                        String strM2035a2 = C1473c.m2035a("feature_usage_timestamp_reported_feature_", string);
                        if (!TextUtils.equals(strM2035a, strM2035a2)) {
                            long j12 = sharedPreferences.getLong(strM2035a, 0L);
                            editorEdit.remove(strM2035a);
                            if (j12 != 0) {
                                editorEdit.putLong(strM2035a2, j12);
                            }
                        }
                    }
                }
                c9095w2.f30073h = jCurrentTimeMillis;
                editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.cast.V1] */
    public C9095w2(SharedPreferences sharedPreferences, C9053r0 c9053r0, String str) {
        this.f30067b = sharedPreferences;
        this.f30066a = c9053r0;
        this.f30068c = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m11030a(EnumC8828N1 enumC8828N1) {
        C9095w2 c9095w2;
        if (!C9053r0.f29998j || (c9095w2 = f30065k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = c9095w2.f30067b;
        String string = Integer.toString(enumC8828N1.f29758b);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String strM2035a = C1473c.m2035a("feature_usage_timestamp_reported_feature_", string);
        if (!sharedPreferences.contains(strM2035a)) {
            strM2035a = C1473c.m2035a("feature_usage_timestamp_detected_feature_", string);
        }
        editorEdit.putLong(strM2035a, System.currentTimeMillis()).apply();
        c9095w2.f30071f.add(enumC8828N1);
        c9095w2.f30070e.post(c9095w2.f30069d);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC8828N1 m11031b(String str) {
        EnumC8828N1 enumC8828N1 = EnumC8828N1.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        try {
            switch (Integer.parseInt(str)) {
                case 0:
                    return enumC8828N1;
                case 1:
                    return EnumC8828N1.CAF_CAST_BUTTON;
                case 2:
                    return EnumC8828N1.CAF_EXPANDED_CONTROLLER;
                case 3:
                    return EnumC8828N1.CAF_MINI_CONTROLLER;
                case 4:
                    return EnumC8828N1.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return EnumC8828N1.CAST_CONTEXT;
                case 6:
                    return EnumC8828N1.IMAGE_CACHE;
                case 7:
                    return EnumC8828N1.IMAGE_PICKER;
                case 8:
                    return EnumC8828N1.AD_BREAK_PARSER;
                case 9:
                    return EnumC8828N1.UI_STYLE;
                case 10:
                    return EnumC8828N1.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return EnumC8828N1.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return EnumC8828N1.PAUSE_CONTROLLER;
                case 13:
                    return EnumC8828N1.SEEK_CONTROLLER;
                case 14:
                    return EnumC8828N1.STREAM_VOLUME;
                case 15:
                    return EnumC8828N1.UI_MEDIA_CONTROLLER;
                case 16:
                    return EnumC8828N1.PLAYBACK_RATE_CONTROLLER;
                case 17:
                    return EnumC8828N1.PRECACHE;
                case 18:
                    return EnumC8828N1.INSTRUCTIONS_VIEW;
                case 19:
                    return EnumC8828N1.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return EnumC8828N1.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return EnumC8828N1.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return EnumC8828N1.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return EnumC8828N1.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case 24:
                    return EnumC8828N1.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case 25:
                    return EnumC8828N1.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case 26:
                    return EnumC8828N1.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case 27:
                    return EnumC8828N1.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case 28:
                    return EnumC8828N1.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case 29:
                    return EnumC8828N1.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return EnumC8828N1.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return EnumC8828N1.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return EnumC8828N1.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case 33:
                    return EnumC8828N1.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case 34:
                    return EnumC8828N1.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case 35:
                    return EnumC8828N1.CAST_OUTPUT_SWITCHER_ENABLED;
                case 36:
                    return EnumC8828N1.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case 37:
                    return EnumC8828N1.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case 38:
                    return EnumC8828N1.CAST_BUTTON_DELEGATE;
                case 39:
                    return EnumC8828N1.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case 40:
                    return EnumC8828N1.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case 41:
                    return EnumC8828N1.CAST_TRANSFER_TO_LOCAL_USED;
                case 42:
                    return EnumC8828N1.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 43:
                    return EnumC8828N1.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 44:
                    return EnumC8828N1.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 45:
                    return EnumC8828N1.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 46:
                    return EnumC8828N1.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case 47:
                    return EnumC8828N1.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 48:
                    return EnumC8828N1.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case 49:
                    return EnumC8828N1.CAF_NOTIFICATION_SERVICE;
                case 50:
                    return EnumC8828N1.HARDWARE_VOLUME_BUTTON_PRESS;
                case 51:
                    return EnumC8828N1.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case 52:
                    return EnumC8828N1.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return EnumC8828N1.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return EnumC8828N1.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return EnumC8828N1.CAF_MEDIA_NOTIFICATION_PROXY;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11032c(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f30067b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }
}
