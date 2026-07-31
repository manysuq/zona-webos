package com.yandex.mobile.ads.instream;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m18688d2 = {"Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;", "", "", "a", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "categoryId", "b", "getPageId", "pageId", "", "c", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "parameters", "Builder", "mobileads_externalRelease"}, m18689k = 1, m18690mv = {1, 9, 0})
public final class InstreamAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String categoryId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String pageId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map parameters;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18688d2 = {"Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration$Builder;", "", "", "pageId", "<init>", "(Ljava/lang/String;)V", "Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;", "build", "()Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;", "", "parameters", "setParameters", "(Ljava/util/Map;)Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration$Builder;", "mobileads_externalRelease"}, m18689k = 1, m18690mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final String f31393a;

        /* JADX INFO: renamed from: b */
        private String f31394b = CommonUrlParts.Values.FALSE_INTEGER;

        /* JADX INFO: renamed from: c */
        private Map f31395c;

        public Builder(String str) {
            this.f31393a = str;
        }

        public final InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this.f31394b, this.f31393a, this.f31395c, null);
        }

        public final Builder setParameters(Map<String, String> parameters) {
            if (parameters == null) {
                parameters = MapsKt.emptyMap();
            }
            this.f31395c = parameters;
            return this;
        }
    }

    public /* synthetic */ InstreamAdRequestConfiguration(String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    private InstreamAdRequestConfiguration(String str, String str2, Map map) {
        this.categoryId = str;
        this.pageId = str2;
        this.parameters = map;
    }
}
