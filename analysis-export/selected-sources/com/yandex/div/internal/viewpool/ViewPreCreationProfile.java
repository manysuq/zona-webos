package com.yandex.div.internal.viewpool;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p857xa.InterfaceC19639f;
import p875ya.InterfaceC19797c;
import va.InterfaceC18718c;
import va.InterfaceC18729n;
import za.C20829M0;
import za.C20838R0;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018BÙ\u0001\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJÐ\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J(\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+HÇ\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b6\u00104R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b7\u00104R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b8\u00104R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b9\u00104R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b:\u00104R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b;\u00104R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b<\u00104R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b=\u00104R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b>\u00104R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b?\u00104R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b@\u00104R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\bA\u00104R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\bB\u00104R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\bC\u00104R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\bD\u00104R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\bE\u00104¨\u0006H"}, m18688d2 = {"Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "", "", "id", "Lcom/yandex/div/internal/viewpool/PreCreationModel;", "text", "image", "gifImage", "overlapContainer", "linearContainer", "wrapContainer", "grid", "gallery", "pager", "tab", "state", "custom", "indicator", "slider", "input", "select", "video", "switch", "<init>", "(Ljava/lang/String;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;)V", "", "seen1", "Lza/M0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lza/M0;)V", "copy", "(Ljava/lang/String;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;Lcom/yandex/div/internal/viewpool/PreCreationModel;)Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lya/c;", "output", "Lxa/f;", "serialDesc", "", "write$Self", "(Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;Lya/c;Lxa/f;)V", "Ljava/lang/String;", "getId", "Lcom/yandex/div/internal/viewpool/PreCreationModel;", "getText", "()Lcom/yandex/div/internal/viewpool/PreCreationModel;", "getImage", "getGifImage", "getOverlapContainer", "getLinearContainer", "getWrapContainer", "getGrid", "getGallery", "getPager", "getTab", "getState", "getCustom", "getIndicator", "getSlider", "getInput", "getSelect", "getVideo", "getSwitch", "Companion", "$serializer", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
@InterfaceC18729n
public final /* data */ class ViewPreCreationProfile {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PreCreationModel custom;
    private final PreCreationModel gallery;
    private final PreCreationModel gifImage;
    private final PreCreationModel grid;
    private final String id;
    private final PreCreationModel image;
    private final PreCreationModel indicator;
    private final PreCreationModel input;
    private final PreCreationModel linearContainer;
    private final PreCreationModel overlapContainer;
    private final PreCreationModel pager;
    private final PreCreationModel select;
    private final PreCreationModel slider;
    private final PreCreationModel state;
    private final PreCreationModel switch;
    private final PreCreationModel tab;
    private final PreCreationModel text;
    private final PreCreationModel video;
    private final PreCreationModel wrapContainer;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18688d2 = {"Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile$Companion;", "", "<init>", "()V", "Lva/c;", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "serializer", "()Lva/c;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC18718c<ViewPreCreationProfile> serializer() {
            return ViewPreCreationProfile$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ViewPreCreationProfile() {
        this((String) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, (PreCreationModel) null, 524287, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ViewPreCreationProfile copy$default(ViewPreCreationProfile viewPreCreationProfile, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i10, Object obj) {
        PreCreationModel preCreationModel19;
        PreCreationModel preCreationModel20;
        String str2 = (i10 & 1) != 0 ? viewPreCreationProfile.id : str;
        PreCreationModel preCreationModel21 = (i10 & 2) != 0 ? viewPreCreationProfile.text : preCreationModel;
        PreCreationModel preCreationModel22 = (i10 & 4) != 0 ? viewPreCreationProfile.image : preCreationModel2;
        PreCreationModel preCreationModel23 = (i10 & 8) != 0 ? viewPreCreationProfile.gifImage : preCreationModel3;
        PreCreationModel preCreationModel24 = (i10 & 16) != 0 ? viewPreCreationProfile.overlapContainer : preCreationModel4;
        PreCreationModel preCreationModel25 = (i10 & 32) != 0 ? viewPreCreationProfile.linearContainer : preCreationModel5;
        PreCreationModel preCreationModel26 = (i10 & 64) != 0 ? viewPreCreationProfile.wrapContainer : preCreationModel6;
        PreCreationModel preCreationModel27 = (i10 & 128) != 0 ? viewPreCreationProfile.grid : preCreationModel7;
        PreCreationModel preCreationModel28 = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? viewPreCreationProfile.gallery : preCreationModel8;
        PreCreationModel preCreationModel29 = (i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? viewPreCreationProfile.pager : preCreationModel9;
        PreCreationModel preCreationModel30 = (i10 & 1024) != 0 ? viewPreCreationProfile.tab : preCreationModel10;
        PreCreationModel preCreationModel31 = (i10 & 2048) != 0 ? viewPreCreationProfile.state : preCreationModel11;
        PreCreationModel preCreationModel32 = (i10 & 4096) != 0 ? viewPreCreationProfile.custom : preCreationModel12;
        PreCreationModel preCreationModel33 = (i10 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? viewPreCreationProfile.indicator : preCreationModel13;
        String str3 = str2;
        PreCreationModel preCreationModel34 = (i10 & 16384) != 0 ? viewPreCreationProfile.slider : preCreationModel14;
        PreCreationModel preCreationModel35 = (i10 & 32768) != 0 ? viewPreCreationProfile.input : preCreationModel15;
        PreCreationModel preCreationModel36 = (i10 & Parser.ARGC_LIMIT) != 0 ? viewPreCreationProfile.select : preCreationModel16;
        PreCreationModel preCreationModel37 = (i10 & 131072) != 0 ? viewPreCreationProfile.video : preCreationModel17;
        if ((i10 & 262144) != 0) {
            preCreationModel20 = preCreationModel37;
            preCreationModel19 = viewPreCreationProfile.switch;
        } else {
            preCreationModel19 = preCreationModel18;
            preCreationModel20 = preCreationModel37;
        }
        return viewPreCreationProfile.copy(str3, preCreationModel21, preCreationModel22, preCreationModel23, preCreationModel24, preCreationModel25, preCreationModel26, preCreationModel27, preCreationModel28, preCreationModel29, preCreationModel30, preCreationModel31, preCreationModel32, preCreationModel33, preCreationModel34, preCreationModel35, preCreationModel36, preCreationModel20, preCreationModel19);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ViewPreCreationProfile self, InterfaceC19797c output, InterfaceC19639f serialDesc) {
        if (output.mo676A() || self.id != null) {
            output.mo702w(serialDesc, 0, C20838R0.f71645a, self.id);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.text, new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 1, PreCreationModel$$serializer.INSTANCE, self.text);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.image, new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 2, PreCreationModel$$serializer.INSTANCE, self.image);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.gifImage, new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 3, PreCreationModel$$serializer.INSTANCE, self.gifImage);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.overlapContainer, new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 4, PreCreationModel$$serializer.INSTANCE, self.overlapContainer);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.linearContainer, new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 5, PreCreationModel$$serializer.INSTANCE, self.linearContainer);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.wrapContainer, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 6, PreCreationModel$$serializer.INSTANCE, self.wrapContainer);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.grid, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 7, PreCreationModel$$serializer.INSTANCE, self.grid);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.gallery, new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 8, PreCreationModel$$serializer.INSTANCE, self.gallery);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.pager, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 9, PreCreationModel$$serializer.INSTANCE, self.pager);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.tab, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 10, PreCreationModel$$serializer.INSTANCE, self.tab);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.state, new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 11, PreCreationModel$$serializer.INSTANCE, self.state);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.custom, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 12, PreCreationModel$$serializer.INSTANCE, self.custom);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.indicator, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 13, PreCreationModel$$serializer.INSTANCE, self.indicator);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.slider, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 14, PreCreationModel$$serializer.INSTANCE, self.slider);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.input, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 15, PreCreationModel$$serializer.INSTANCE, self.input);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.select, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 16, PreCreationModel$$serializer.INSTANCE, self.select);
        }
        if (output.mo676A() || !Intrinsics.areEqual(self.video, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            output.mo690k(serialDesc, 17, PreCreationModel$$serializer.INSTANCE, self.video);
        }
        if (!output.mo676A() && Intrinsics.areEqual(self.switch, new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null))) {
            return;
        }
        output.mo690k(serialDesc, 18, PreCreationModel$$serializer.INSTANCE, self.switch);
    }

    public final ViewPreCreationProfile copy(String id2, PreCreationModel text, PreCreationModel image, PreCreationModel gifImage, PreCreationModel overlapContainer, PreCreationModel linearContainer, PreCreationModel wrapContainer, PreCreationModel grid, PreCreationModel gallery, PreCreationModel pager, PreCreationModel tab, PreCreationModel state, PreCreationModel custom, PreCreationModel indicator, PreCreationModel slider, PreCreationModel input, PreCreationModel select, PreCreationModel video, PreCreationModel preCreationModel) {
        return new ViewPreCreationProfile(id2, text, image, gifImage, overlapContainer, linearContainer, wrapContainer, grid, gallery, pager, tab, state, custom, indicator, slider, input, select, video, preCreationModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewPreCreationProfile)) {
            return false;
        }
        ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) other;
        return Intrinsics.areEqual(this.id, viewPreCreationProfile.id) && Intrinsics.areEqual(this.text, viewPreCreationProfile.text) && Intrinsics.areEqual(this.image, viewPreCreationProfile.image) && Intrinsics.areEqual(this.gifImage, viewPreCreationProfile.gifImage) && Intrinsics.areEqual(this.overlapContainer, viewPreCreationProfile.overlapContainer) && Intrinsics.areEqual(this.linearContainer, viewPreCreationProfile.linearContainer) && Intrinsics.areEqual(this.wrapContainer, viewPreCreationProfile.wrapContainer) && Intrinsics.areEqual(this.grid, viewPreCreationProfile.grid) && Intrinsics.areEqual(this.gallery, viewPreCreationProfile.gallery) && Intrinsics.areEqual(this.pager, viewPreCreationProfile.pager) && Intrinsics.areEqual(this.tab, viewPreCreationProfile.tab) && Intrinsics.areEqual(this.state, viewPreCreationProfile.state) && Intrinsics.areEqual(this.custom, viewPreCreationProfile.custom) && Intrinsics.areEqual(this.indicator, viewPreCreationProfile.indicator) && Intrinsics.areEqual(this.slider, viewPreCreationProfile.slider) && Intrinsics.areEqual(this.input, viewPreCreationProfile.input) && Intrinsics.areEqual(this.select, viewPreCreationProfile.select) && Intrinsics.areEqual(this.video, viewPreCreationProfile.video) && Intrinsics.areEqual(this.switch, viewPreCreationProfile.switch);
    }

    public final PreCreationModel getCustom() {
        return this.custom;
    }

    public final PreCreationModel getGallery() {
        return this.gallery;
    }

    public final PreCreationModel getGifImage() {
        return this.gifImage;
    }

    public final PreCreationModel getGrid() {
        return this.grid;
    }

    public final String getId() {
        return this.id;
    }

    public final PreCreationModel getImage() {
        return this.image;
    }

    public final PreCreationModel getIndicator() {
        return this.indicator;
    }

    public final PreCreationModel getInput() {
        return this.input;
    }

    public final PreCreationModel getLinearContainer() {
        return this.linearContainer;
    }

    public final PreCreationModel getOverlapContainer() {
        return this.overlapContainer;
    }

    public final PreCreationModel getPager() {
        return this.pager;
    }

    public final PreCreationModel getSelect() {
        return this.select;
    }

    public final PreCreationModel getSlider() {
        return this.slider;
    }

    public final PreCreationModel getState() {
        return this.state;
    }

    public final PreCreationModel getSwitch() {
        return this.switch;
    }

    public final PreCreationModel getTab() {
        return this.tab;
    }

    public final PreCreationModel getText() {
        return this.text;
    }

    public final PreCreationModel getVideo() {
        return this.video;
    }

    public final PreCreationModel getWrapContainer() {
        return this.wrapContainer;
    }

    public int hashCode() {
        String str = this.id;
        return this.switch.hashCode() + ((this.video.hashCode() + ((this.select.hashCode() + ((this.input.hashCode() + ((this.slider.hashCode() + ((this.indicator.hashCode() + ((this.custom.hashCode() + ((this.state.hashCode() + ((this.tab.hashCode() + ((this.pager.hashCode() + ((this.gallery.hashCode() + ((this.grid.hashCode() + ((this.wrapContainer.hashCode() + ((this.linearContainer.hashCode() + ((this.overlapContainer.hashCode() + ((this.gifImage.hashCode() + ((this.image.hashCode() + ((this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ViewPreCreationProfile(id=" + this.id + ", text=" + this.text + ", image=" + this.image + ", gifImage=" + this.gifImage + ", overlapContainer=" + this.overlapContainer + ", linearContainer=" + this.linearContainer + ", wrapContainer=" + this.wrapContainer + ", grid=" + this.grid + ", gallery=" + this.gallery + ", pager=" + this.pager + ", tab=" + this.tab + ", state=" + this.state + ", custom=" + this.custom + ", indicator=" + this.indicator + ", slider=" + this.slider + ", input=" + this.input + ", select=" + this.select + ", video=" + this.video + ", switch=" + this.switch + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ViewPreCreationProfile(int i10, String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, C20829M0 c20829m0) {
        this.id = (i10 & 1) == 0 ? null : str;
        if ((i10 & 2) == 0) {
            this.text = new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.text = preCreationModel;
        }
        if ((i10 & 4) == 0) {
            this.image = new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.image = preCreationModel2;
        }
        if ((i10 & 8) == 0) {
            this.gifImage = new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.gifImage = preCreationModel3;
        }
        if ((i10 & 16) == 0) {
            this.overlapContainer = new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.overlapContainer = preCreationModel4;
        }
        if ((i10 & 32) == 0) {
            this.linearContainer = new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.linearContainer = preCreationModel5;
        }
        if ((i10 & 64) == 0) {
            this.wrapContainer = new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.wrapContainer = preCreationModel6;
        }
        if ((i10 & 128) == 0) {
            this.grid = new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.grid = preCreationModel7;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.gallery = new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.gallery = preCreationModel8;
        }
        if ((i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.pager = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.pager = preCreationModel9;
        }
        if ((i10 & 1024) == 0) {
            this.tab = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.tab = preCreationModel10;
        }
        if ((i10 & 2048) == 0) {
            this.state = new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.state = preCreationModel11;
        }
        if ((i10 & 4096) == 0) {
            this.custom = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.custom = preCreationModel12;
        }
        if ((i10 & ConstantsKt.DEFAULT_BUFFER_SIZE) == 0) {
            this.indicator = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.indicator = preCreationModel13;
        }
        if ((i10 & 16384) == 0) {
            this.slider = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.slider = preCreationModel14;
        }
        if ((32768 & i10) == 0) {
            this.input = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.input = preCreationModel15;
        }
        if ((65536 & i10) == 0) {
            this.select = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.select = preCreationModel16;
        }
        if ((131072 & i10) == 0) {
            this.video = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.video = preCreationModel17;
        }
        if ((i10 & 262144) == 0) {
            this.switch = new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null);
        } else {
            this.switch = preCreationModel18;
        }
    }

    public ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18) {
        this.id = str;
        this.text = preCreationModel;
        this.image = preCreationModel2;
        this.gifImage = preCreationModel3;
        this.overlapContainer = preCreationModel4;
        this.linearContainer = preCreationModel5;
        this.wrapContainer = preCreationModel6;
        this.grid = preCreationModel7;
        this.gallery = preCreationModel8;
        this.pager = preCreationModel9;
        this.tab = preCreationModel10;
        this.state = preCreationModel11;
        this.custom = preCreationModel12;
        this.indicator = preCreationModel13;
        this.slider = preCreationModel14;
        this.input = preCreationModel15;
        this.select = preCreationModel16;
        this.video = preCreationModel17;
        this.switch = preCreationModel18;
    }

    public /* synthetic */ ViewPreCreationProfile(String str, PreCreationModel preCreationModel, PreCreationModel preCreationModel2, PreCreationModel preCreationModel3, PreCreationModel preCreationModel4, PreCreationModel preCreationModel5, PreCreationModel preCreationModel6, PreCreationModel preCreationModel7, PreCreationModel preCreationModel8, PreCreationModel preCreationModel9, PreCreationModel preCreationModel10, PreCreationModel preCreationModel11, PreCreationModel preCreationModel12, PreCreationModel preCreationModel13, PreCreationModel preCreationModel14, PreCreationModel preCreationModel15, PreCreationModel preCreationModel16, PreCreationModel preCreationModel17, PreCreationModel preCreationModel18, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel, (i10 & 4) != 0 ? new PreCreationModel(20, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel2, (i10 & 8) != 0 ? new PreCreationModel(3, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel3, (i10 & 16) != 0 ? new PreCreationModel(8, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel4, (i10 & 32) != 0 ? new PreCreationModel(12, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel5, (i10 & 64) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel6, (i10 & 128) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel7, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? new PreCreationModel(6, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel8, (i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel9, (i10 & 1024) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel10, (i10 & 2048) != 0 ? new PreCreationModel(4, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel11, (i10 & 4096) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel12, (i10 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel13, (i10 & 16384) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel14, (i10 & 32768) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel15, (i10 & Parser.ARGC_LIMIT) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel16, (i10 & 131072) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel17, (i10 & 262144) != 0 ? new PreCreationModel(2, 0, 0, 6, (DefaultConstructorMarker) null) : preCreationModel18);
    }
}
