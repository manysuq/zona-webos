package mobi.zona.data.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.mozilla.javascript.ES6Iterator;
import p514d0.C10219v;
import p569g2.C11232c;
import p607i9.C12948z6;
import p857xa.InterfaceC19639f;
import p875ya.InterfaceC19797c;
import va.InterfaceC18718c;
import va.InterfaceC18729n;
import za.C20829M0;
import za.C20838R0;
import za.C20915z0;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002@ABG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0083\u0004J\n\u00105\u001a\u00020\tHÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004J)\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001b\u0002\b?¢\u0006\u0002\b>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R,\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004r\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R*\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004r\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0013R*\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004r\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( ¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR*\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004r\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010#R*\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004r\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b('¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0013Ê\u0001\u0002\bC¨\u0006B"}, m18688d2 = {"Lmobi/zona/data/model/VideoSource;", "Ljava/io/Serializable;", "id", "", "episodeKey", "downloadLinkKey", "kinopoiskId", "", "videoSourceTypeId", "", "videoContentTypeId", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getEpisodeKey$annotations", "()V", "getEpisodeKey", "Lkotlinx/serialization/SerialName;", ES6Iterator.VALUE_PROPERTY, "episode_key", "getDownloadLinkKey$annotations", "getDownloadLinkKey", "download_link_key", "getKinopoiskId$annotations", "getKinopoiskId", "()J", "kinopoisk_id", "getVideoSourceTypeId$annotations", "getVideoSourceTypeId", "()I", "video_source_type_id", "getVideoContentTypeId$annotations", "getVideoContentTypeId", "video_content_type_id", "getInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ru_zona_ru_zona_content_models_release", "Lkotlin/jvm/JvmStatic;", "$serializer", "Companion", "ru.zona:ru.zona.content.models_release", "Lkotlinx/serialization/Serializable;"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
@InterfaceC18729n
public final /* data */ class VideoSource implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String downloadLinkKey;
    private final String episodeKey;
    private final String id;
    private final String info;
    private final long kinopoiskId;
    private final int videoContentTypeId;
    private final int videoSourceTypeId;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m18688d2 = {"Lmobi/zona/data/model/VideoSource$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmobi/zona/data/model/VideoSource;", "ru.zona:ru.zona.content.models_release"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC18718c<VideoSource> serializer() {
            return VideoSource$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoSource(int i10, String str, String str2, String str3, long j10, int i11, int i12, String str4, C20829M0 c20829m0) {
        if (61 != (i10 & 61)) {
            C20915z0.m25449a(i10, 61, VideoSource$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i10 & 2) == 0) {
            this.episodeKey = null;
        } else {
            this.episodeKey = str2;
        }
        this.downloadLinkKey = str3;
        this.kinopoiskId = j10;
        this.videoSourceTypeId = i11;
        this.videoContentTypeId = i12;
        if ((i10 & 64) == 0) {
            this.info = null;
        } else {
            this.info = str4;
        }
    }

    public static /* synthetic */ VideoSource copy$default(VideoSource videoSource, String str, String str2, String str3, long j10, int i10, int i11, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = videoSource.id;
        }
        if ((i12 & 2) != 0) {
            str2 = videoSource.episodeKey;
        }
        if ((i12 & 4) != 0) {
            str3 = videoSource.downloadLinkKey;
        }
        if ((i12 & 8) != 0) {
            j10 = videoSource.kinopoiskId;
        }
        if ((i12 & 16) != 0) {
            i10 = videoSource.videoSourceTypeId;
        }
        if ((i12 & 32) != 0) {
            i11 = videoSource.videoContentTypeId;
        }
        if ((i12 & 64) != 0) {
            str4 = videoSource.info;
        }
        String str5 = str4;
        int i13 = i10;
        long j11 = j10;
        String str6 = str3;
        return videoSource.copy(str, str2, str6, j11, i13, i11, str5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ru_zona_ru_zona_content_models_release(VideoSource videoSource, InterfaceC19797c interfaceC19797c, InterfaceC19639f interfaceC19639f) {
        interfaceC19797c.mo703x(interfaceC19639f, 0, videoSource.id);
        if (interfaceC19797c.mo676A() || videoSource.episodeKey != null) {
            interfaceC19797c.mo702w(interfaceC19639f, 1, C20838R0.f71645a, videoSource.episodeKey);
        }
        interfaceC19797c.mo703x(interfaceC19639f, 2, videoSource.downloadLinkKey);
        interfaceC19797c.mo699t(interfaceC19639f, 3, videoSource.kinopoiskId);
        interfaceC19797c.mo693n(4, videoSource.videoSourceTypeId, interfaceC19639f);
        interfaceC19797c.mo693n(5, videoSource.videoContentTypeId, interfaceC19639f);
        if (!interfaceC19797c.mo676A() && videoSource.info == null) {
            return;
        }
        interfaceC19797c.mo702w(interfaceC19639f, 6, C20838R0.f71645a, videoSource.info);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEpisodeKey() {
        return this.episodeKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDownloadLinkKey() {
        return this.downloadLinkKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getKinopoiskId() {
        return this.kinopoiskId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVideoSourceTypeId() {
        return this.videoSourceTypeId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVideoContentTypeId() {
        return this.videoContentTypeId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    public final VideoSource copy(String id2, String episodeKey, String downloadLinkKey, long kinopoiskId, int videoSourceTypeId, int videoContentTypeId, String info) {
        return new VideoSource(id2, episodeKey, downloadLinkKey, kinopoiskId, videoSourceTypeId, videoContentTypeId, info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSource)) {
            return false;
        }
        VideoSource videoSource = (VideoSource) other;
        return Intrinsics.areEqual(this.id, videoSource.id) && Intrinsics.areEqual(this.episodeKey, videoSource.episodeKey) && Intrinsics.areEqual(this.downloadLinkKey, videoSource.downloadLinkKey) && this.kinopoiskId == videoSource.kinopoiskId && this.videoSourceTypeId == videoSource.videoSourceTypeId && this.videoContentTypeId == videoSource.videoContentTypeId && Intrinsics.areEqual(this.info, videoSource.info);
    }

    public final String getDownloadLinkKey() {
        return this.downloadLinkKey;
    }

    public final String getEpisodeKey() {
        return this.episodeKey;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInfo() {
        return this.info;
    }

    public final long getKinopoiskId() {
        return this.kinopoiskId;
    }

    public final int getVideoContentTypeId() {
        return this.videoContentTypeId;
    }

    public final int getVideoSourceTypeId() {
        return this.videoSourceTypeId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.episodeKey;
        int iM12391a = C10219v.m12391a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.downloadLinkKey);
        long j10 = this.kinopoiskId;
        int i10 = (((((iM12391a + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.videoSourceTypeId) * 31) + this.videoContentTypeId) * 31;
        String str2 = this.info;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.episodeKey;
        String str3 = this.downloadLinkKey;
        long j10 = this.kinopoiskId;
        int i10 = this.videoSourceTypeId;
        int i11 = this.videoContentTypeId;
        String str4 = this.info;
        StringBuilder sbM14696a = C12948z6.m14696a("VideoSource(id=", str, ", episodeKey=", str2, ", downloadLinkKey=");
        sbM14696a.append(str3);
        sbM14696a.append(", kinopoiskId=");
        sbM14696a.append(j10);
        sbM14696a.append(", videoSourceTypeId=");
        sbM14696a.append(i10);
        sbM14696a.append(", videoContentTypeId=");
        sbM14696a.append(i11);
        return C11232c.m13228a(", info=", str4, ")", sbM14696a);
    }

    public VideoSource(String str, String str2, String str3, long j10, int i10, int i11, String str4) {
        this.id = str;
        this.episodeKey = str2;
        this.downloadLinkKey = str3;
        this.kinopoiskId = j10;
        this.videoSourceTypeId = i10;
        this.videoContentTypeId = i11;
        this.info = str4;
    }

    public /* synthetic */ VideoSource(String str, String str2, String str3, long j10, int i10, int i11, String str4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : str2, str3, j10, i10, i11, (i12 & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ void getDownloadLinkKey$annotations() {
    }

    public static /* synthetic */ void getEpisodeKey$annotations() {
    }

    public static /* synthetic */ void getKinopoiskId$annotations() {
    }

    public static /* synthetic */ void getVideoContentTypeId$annotations() {
    }

    public static /* synthetic */ void getVideoSourceTypeId$annotations() {
    }
}
