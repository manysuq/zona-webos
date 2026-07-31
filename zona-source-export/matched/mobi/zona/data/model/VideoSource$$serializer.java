package mobi.zona.data.model;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.mozilla.javascript.ES6Iterator;
import p840wa.C18973a;
import p857xa.InterfaceC19639f;
import p875ya.InterfaceC19796b;
import p875ya.InterfaceC19797c;
import p875ya.InterfaceC19798d;
import p875ya.InterfaceC19799e;
import va.C18739x;
import va.InterfaceC18718c;
import za.C20807B0;
import za.C20813E0;
import za.C20829M0;
import za.C20838R0;
import za.C20849X;
import za.C20877h0;
import za.InterfaceC20826L;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0086\u0080\u0004¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0080\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0086\u0080\u0004R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0018\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\b\u0019\u0012\u0006\b\n0\u001a8\u001b¨\u0006\u0015"}, m18688d2 = {"mobi/zona/data/model/VideoSource.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmobi/zona/data/model/VideoSource;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", ES6Iterator.VALUE_PROPERTY, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ru.zona:ru.zona.content.models_release", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class VideoSource$$serializer implements InterfaceC20826L<VideoSource> {
    public static final VideoSource$$serializer INSTANCE;
    private static final InterfaceC19639f descriptor;

    static {
        VideoSource$$serializer videoSource$$serializer = new VideoSource$$serializer();
        INSTANCE = videoSource$$serializer;
        C20807B0 c20807b0 = new C20807B0("mobi.zona.data.model.VideoSource", videoSource$$serializer, 7);
        c20807b0.m25417j("id", false);
        c20807b0.m25417j("episode_key", true);
        c20807b0.m25417j("download_link_key", false);
        c20807b0.m25417j("kinopoisk_id", false);
        c20807b0.m25417j("video_source_type_id", false);
        c20807b0.m25417j("video_content_type_id", false);
        c20807b0.m25417j("info", true);
        descriptor = c20807b0;
    }

    private VideoSource$$serializer() {
    }

    @Override // za.InterfaceC20826L
    public final InterfaceC18718c<?>[] childSerializers() {
        C20838R0 c20838r0 = C20838R0.f71645a;
        InterfaceC18718c<?> interfaceC18718cM21290a = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a2 = C18973a.m21290a(c20838r0);
        C20849X c20849x = C20849X.f71662a;
        return new InterfaceC18718c[]{c20838r0, interfaceC18718cM21290a, c20838r0, C20877h0.f71694a, c20849x, c20849x, interfaceC18718cM21290a2};
    }

    @Override // va.InterfaceC18731p, va.InterfaceC18717b
    public final InterfaceC19639f getDescriptor() {
        return descriptor;
    }

    @Override // za.InterfaceC20826L
    public /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
        return C20813E0.f71615a;
    }

    @Override // va.InterfaceC18717b
    public final VideoSource deserialize(InterfaceC19798d interfaceC19798d) {
        InterfaceC19639f interfaceC19639f = descriptor;
        InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
        String str = null;
        String strMo21680g = null;
        String str2 = null;
        String strMo21680g2 = null;
        long jMo21676C = 0;
        boolean z10 = true;
        int i10 = 0;
        int iMo21679d = 0;
        int iMo21679d2 = 0;
        while (z10) {
            int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
            switch (iMo624x) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    strMo21680g = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 1, C20838R0.f71645a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    strMo21680g2 = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 2);
                    i10 |= 4;
                    break;
                case 3:
                    jMo21676C = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 3);
                    i10 |= 8;
                    break;
                case 4:
                    iMo21679d = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 4);
                    i10 |= 16;
                    break;
                case 5:
                    iMo21679d2 = interfaceC19796bMo641b.mo21679d(interfaceC19639f, 5);
                    i10 |= 32;
                    break;
                case 6:
                    str = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 6, C20838R0.f71645a, str);
                    i10 |= 64;
                    break;
                default:
                    throw new C18739x(iMo624x);
            }
        }
        interfaceC19796bMo641b.mo642n(interfaceC19639f);
        return new VideoSource(i10, strMo21680g, str2, strMo21680g2, jMo21676C, iMo21679d, iMo21679d2, str, (C20829M0) null);
    }

    @Override // va.InterfaceC18731p
    public final void serialize(InterfaceC19799e interfaceC19799e, VideoSource videoSource) {
        InterfaceC19639f interfaceC19639f = descriptor;
        InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
        VideoSource.write$Self$ru_zona_ru_zona_content_models_release(videoSource, interfaceC19797cMo681b, interfaceC19639f);
        interfaceC19797cMo681b.mo682c();
    }
}
