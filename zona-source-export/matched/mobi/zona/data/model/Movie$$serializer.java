package mobi.zona.data.model;

import com.sun.mail.imap.IMAPStore;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import p840wa.C18973a;
import p857xa.InterfaceC19639f;
import p875ya.InterfaceC19796b;
import p875ya.InterfaceC19797c;
import p875ya.InterfaceC19798d;
import p875ya.InterfaceC19799e;
import va.C18739x;
import va.InterfaceC18717b;
import va.InterfaceC18718c;
import za.C20807B0;
import za.C20813E0;
import za.C20829M0;
import za.C20838R0;
import za.C20877h0;
import za.C20879i;
import za.InterfaceC20826L;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0086\u0080\u0004¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0080\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0086\u0080\u0004R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0018\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\n\b\u0019\u0012\u0006\b\n0\u001a8\u001b¨\u0006\u0015"}, m18688d2 = {"mobi/zona/data/model/Movie.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmobi/zona/data/model/Movie;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", ES6Iterator.VALUE_PROPERTY, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ru.zona:ru.zona.content.models_release", "Lkotlin/Deprecated;", "message", "This synthesized declaration should not be used directly", "level", "Lkotlin/DeprecationLevel;", "HIDDEN"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class Movie$$serializer implements InterfaceC20826L<Movie> {
    public static final Movie$$serializer INSTANCE;
    private static final InterfaceC19639f descriptor;

    static {
        Movie$$serializer movie$$serializer = new Movie$$serializer();
        INSTANCE = movie$$serializer;
        C20807B0 c20807b0 = new C20807B0("mobi.zona.data.model.Movie", movie$$serializer, 33);
        c20807b0.m25417j("id", false);
        c20807b0.m25417j(IMAPStore.ID_NAME, false);
        c20807b0.m25417j("coverUrl", false);
        c20807b0.m25417j("year", false);
        c20807b0.m25417j("description", false);
        c20807b0.m25417j("quality", false);
        c20807b0.m25417j("trailerSourceTypes", false);
        c20807b0.m25417j("movieSourceTypes", false);
        c20807b0.m25417j("genres", false);
        c20807b0.m25417j("countries", false);
        c20807b0.m25417j("zonaRating", false);
        c20807b0.m25417j("imdbRating", false);
        c20807b0.m25417j("ksRating", false);
        c20807b0.m25417j("director", false);
        c20807b0.m25417j("directors", false);
        c20807b0.m25417j("scenario", false);
        c20807b0.m25417j("strid", false);
        c20807b0.m25417j("writers", false);
        c20807b0.m25417j("releaseDateInt", false);
        c20807b0.m25417j("releaseDateRus", false);
        c20807b0.m25417j("actors", false);
        c20807b0.m25417j("originalName", false);
        c20807b0.m25417j("duration", false);
        c20807b0.m25417j("rels", false);
        c20807b0.m25417j("serial", false);
        c20807b0.m25417j("isLiked", true);
        c20807b0.m25417j("isWatched", true);
        c20807b0.m25417j("isHasEpisodeKeys", true);
        c20807b0.m25417j("updatedAt", true);
        c20807b0.m25417j("short", true);
        c20807b0.m25417j("posterTemplate", false);
        c20807b0.m25417j("vast", true);
        c20807b0.m25417j("adsModel", true);
        descriptor = c20807b0;
    }

    private Movie$$serializer() {
    }

    @Override // za.InterfaceC20826L
    public final InterfaceC18718c<?>[] childSerializers() {
        Lazy[] lazyArr = Movie.$childSerializers;
        C20838R0 c20838r0 = C20838R0.f71645a;
        InterfaceC18718c<?> interfaceC18718cM21290a = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a2 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a3 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a4 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a5 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a6 = C18973a.m21290a((InterfaceC18718c) lazyArr[6].getValue());
        InterfaceC18718c<?> interfaceC18718cM21290a7 = C18973a.m21290a((InterfaceC18718c) lazyArr[7].getValue());
        InterfaceC18718c<?> interfaceC18718cM21290a8 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a9 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a10 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a11 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a12 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a13 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a14 = C18973a.m21290a((InterfaceC18718c) lazyArr[14].getValue());
        InterfaceC18718c<?> interfaceC18718cM21290a15 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a16 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a17 = C18973a.m21290a((InterfaceC18718c) lazyArr[17].getValue());
        InterfaceC18718c<?> interfaceC18718cM21290a18 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a19 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a20 = C18973a.m21290a((InterfaceC18718c) lazyArr[20].getValue());
        InterfaceC18718c<?> interfaceC18718cM21290a21 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a22 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a23 = C18973a.m21290a((InterfaceC18718c) lazyArr[23].getValue());
        C20879i c20879i = C20879i.f71698a;
        InterfaceC18718c<?> interfaceC18718cM21290a24 = C18973a.m21290a(c20879i);
        InterfaceC18718c<?> interfaceC18718cM21290a25 = C18973a.m21290a(c20838r0);
        InterfaceC18718c<?> interfaceC18718cM21290a26 = C18973a.m21290a(Ads$$serializer.INSTANCE);
        C20877h0 c20877h0 = C20877h0.f71694a;
        return new InterfaceC18718c[]{c20877h0, interfaceC18718cM21290a, interfaceC18718cM21290a2, interfaceC18718cM21290a3, interfaceC18718cM21290a4, interfaceC18718cM21290a5, interfaceC18718cM21290a6, interfaceC18718cM21290a7, interfaceC18718cM21290a8, interfaceC18718cM21290a9, interfaceC18718cM21290a10, interfaceC18718cM21290a11, interfaceC18718cM21290a12, interfaceC18718cM21290a13, interfaceC18718cM21290a14, interfaceC18718cM21290a15, interfaceC18718cM21290a16, interfaceC18718cM21290a17, interfaceC18718cM21290a18, interfaceC18718cM21290a19, interfaceC18718cM21290a20, interfaceC18718cM21290a21, interfaceC18718cM21290a22, interfaceC18718cM21290a23, interfaceC18718cM21290a24, c20879i, c20879i, c20879i, c20877h0, c20879i, interfaceC18718cM21290a25, c20879i, interfaceC18718cM21290a26};
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
    public final Movie deserialize(InterfaceC19798d interfaceC19798d) {
        int i10;
        int i11;
        InterfaceC19639f interfaceC19639f = descriptor;
        InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
        Lazy[] lazyArr = Movie.$childSerializers;
        String str = null;
        long jMo21676C = 0;
        long j10 = 0;
        Ads ads = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        String str5 = null;
        List list2 = null;
        List list3 = null;
        String str6 = null;
        String str7 = null;
        List list4 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        List list5 = null;
        List list6 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        int i12 = 0;
        boolean z10 = true;
        int i13 = 0;
        boolean zMo21683m = false;
        boolean zMo21683m2 = false;
        boolean zMo21683m3 = false;
        boolean zMo21683m4 = false;
        boolean zMo21683m5 = false;
        while (z10) {
            int i14 = i12;
            int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
            switch (iMo624x) {
                case -1:
                    ads = ads;
                    str2 = str2;
                    List list7 = list3;
                    String str19 = str8;
                    i12 = i14;
                    Unit unit = Unit.INSTANCE;
                    str8 = str19;
                    list3 = list7;
                    z10 = false;
                    str2 = str2;
                    ads = ads;
                    break;
                case 0:
                    ads = ads;
                    str2 = str2;
                    List list8 = list3;
                    String str20 = str8;
                    jMo21676C = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 0);
                    i12 = i14 | 1;
                    Unit unit2 = Unit.INSTANCE;
                    str8 = str20;
                    list3 = list8;
                    str2 = str2;
                    ads = ads;
                    break;
                case 1:
                    ads = ads;
                    str2 = str2;
                    List list9 = list3;
                    String str21 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 1, C20838R0.f71645a, str8);
                    i12 = i14 | 2;
                    Unit unit3 = Unit.INSTANCE;
                    str8 = str21;
                    str9 = str9;
                    list3 = list9;
                    str2 = str2;
                    ads = ads;
                    break;
                case 2:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str22 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 2, C20838R0.f71645a, str9);
                    i12 = i14 | 4;
                    Unit unit4 = Unit.INSTANCE;
                    str9 = str22;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 3:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str23 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 3, C20838R0.f71645a, str10);
                    i12 = i14 | 8;
                    Unit unit5 = Unit.INSTANCE;
                    str10 = str23;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 4:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str24 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 4, C20838R0.f71645a, str11);
                    i12 = i14 | 16;
                    Unit unit6 = Unit.INSTANCE;
                    str11 = str24;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 5:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str25 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 5, C20838R0.f71645a, str12);
                    i12 = i14 | 32;
                    Unit unit7 = Unit.INSTANCE;
                    str12 = str25;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 6:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    List list10 = (List) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 6, (InterfaceC18717b) lazyArr[6].getValue(), list5);
                    i12 = i14 | 64;
                    Unit unit8 = Unit.INSTANCE;
                    list5 = list10;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 7:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    List list11 = (List) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 7, (InterfaceC18717b) lazyArr[7].getValue(), list6);
                    i12 = i14 | 128;
                    Unit unit9 = Unit.INSTANCE;
                    list6 = list11;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 8:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str26 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 8, C20838R0.f71645a, str13);
                    i12 = i14 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Unit unit10 = Unit.INSTANCE;
                    str13 = str26;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 9:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str27 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 9, C20838R0.f71645a, str14);
                    i12 = i14 | ConstantsKt.MINIMUM_BLOCK_SIZE;
                    Unit unit11 = Unit.INSTANCE;
                    str14 = str27;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 10:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str28 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 10, C20838R0.f71645a, str15);
                    i12 = i14 | 1024;
                    Unit unit12 = Unit.INSTANCE;
                    str15 = str28;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 11:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str29 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 11, C20838R0.f71645a, str16);
                    i12 = i14 | 2048;
                    Unit unit13 = Unit.INSTANCE;
                    str16 = str29;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 12:
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    String str30 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 12, C20838R0.f71645a, str17);
                    i12 = i14 | 4096;
                    Unit unit14 = Unit.INSTANCE;
                    str17 = str30;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 13:
                    ads = ads;
                    list3 = list3;
                    str2 = str2;
                    String str31 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 13, C20838R0.f71645a, str18);
                    i12 = i14 | ConstantsKt.DEFAULT_BUFFER_SIZE;
                    Unit unit15 = Unit.INSTANCE;
                    str18 = str31;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 14:
                    ads = ads;
                    List list12 = (List) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 14, (InterfaceC18717b) lazyArr[14].getValue(), list3);
                    i12 = i14 | 16384;
                    Unit unit16 = Unit.INSTANCE;
                    list3 = list12;
                    str2 = str2;
                    str2 = str2;
                    ads = ads;
                    break;
                case 15:
                    String str32 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 15, C20838R0.f71645a, str6);
                    i10 = i14 | 32768;
                    Unit unit17 = Unit.INSTANCE;
                    str6 = str32;
                    i12 = i10;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 16:
                    String str33 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 16, C20838R0.f71645a, str7);
                    i10 = i14 | Parser.ARGC_LIMIT;
                    Unit unit18 = Unit.INSTANCE;
                    str7 = str33;
                    i12 = i10;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 17:
                    List list13 = (List) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 17, (InterfaceC18717b) lazyArr[17].getValue(), list4);
                    i10 = i14 | 131072;
                    Unit unit19 = Unit.INSTANCE;
                    list4 = list13;
                    i12 = i10;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 18:
                    str = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 18, C20838R0.f71645a, str);
                    i11 = 262144;
                    i12 = i14 | i11;
                    Unit unit20 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 19:
                    str3 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 19, C20838R0.f71645a, str3);
                    i11 = 524288;
                    i12 = i14 | i11;
                    Unit unit21 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 20:
                    list = (List) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 20, (InterfaceC18717b) lazyArr[20].getValue(), list);
                    i11 = 1048576;
                    i12 = i14 | i11;
                    Unit unit22 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 21:
                    str4 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 21, C20838R0.f71645a, str4);
                    i11 = 2097152;
                    i12 = i14 | i11;
                    Unit unit23 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 22:
                    str5 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 22, C20838R0.f71645a, str5);
                    i11 = 4194304;
                    i12 = i14 | i11;
                    Unit unit24 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 23:
                    list2 = (List) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 23, (InterfaceC18717b) lazyArr[23].getValue(), list2);
                    i11 = 8388608;
                    i12 = i14 | i11;
                    Unit unit25 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 24:
                    bool = (Boolean) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 24, C20879i.f71698a, bool);
                    i11 = 16777216;
                    i12 = i14 | i11;
                    Unit unit26 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 25:
                    zMo21683m = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 25);
                    i11 = 33554432;
                    i12 = i14 | i11;
                    Unit unit27 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 26:
                    zMo21683m2 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 26);
                    i11 = 67108864;
                    i12 = i14 | i11;
                    Unit unit28 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 27:
                    zMo21683m3 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 27);
                    i11 = 134217728;
                    i12 = i14 | i11;
                    Unit unit29 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 28:
                    list3 = list3;
                    long jMo21676C2 = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 28);
                    Unit unit30 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    j10 = jMo21676C2;
                    i12 = i14 | 268435456;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 29:
                    zMo21683m4 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 29);
                    i11 = 536870912;
                    i12 = i14 | i11;
                    Unit unit210 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 30:
                    str2 = (String) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 30, C20838R0.f71645a, str2);
                    i11 = 1073741824;
                    i12 = i14 | i11;
                    Unit unit211 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 31:
                    zMo21683m5 = interfaceC19796bMo641b.mo21683m(interfaceC19639f, 31);
                    i11 = IntCompanionObject.MIN_VALUE;
                    i12 = i14 | i11;
                    Unit unit212 = Unit.INSTANCE;
                    ads = ads;
                    str2 = str2;
                    list3 = list3;
                    str2 = str2;
                    ads = ads;
                    break;
                case 32:
                    Ads ads2 = (Ads) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 32, Ads$$serializer.INSTANCE, ads);
                    Unit unit31 = Unit.INSTANCE;
                    ads = ads2;
                    str2 = str2;
                    i12 = i14;
                    list3 = list3;
                    i13 = 1;
                    str2 = str2;
                    ads = ads;
                    break;
                default:
                    throw new C18739x(iMo624x);
            }
        }
        String str34 = str2;
        List list14 = list3;
        String str35 = str8;
        String str36 = str9;
        interfaceC19796bMo641b.mo642n(interfaceC19639f);
        List list15 = list2;
        return new Movie(i12, i13, jMo21676C, str35, str36, str10, str11, str12, list5, list6, str13, str14, str15, str16, str17, str18, list14, str6, str7, list4, str, str3, list, str4, str5, list15, bool, zMo21683m, zMo21683m2, zMo21683m3, j10, zMo21683m4, str34, zMo21683m5, ads, (C20829M0) null);
    }

    @Override // va.InterfaceC18731p
    public final void serialize(InterfaceC19799e interfaceC19799e, Movie movie) {
        InterfaceC19639f interfaceC19639f = descriptor;
        InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
        Movie.write$Self$ru_zona_ru_zona_content_models_release(movie, interfaceC19797cMo681b, interfaceC19639f);
        interfaceC19797cMo681b.mo682c();
    }
}
