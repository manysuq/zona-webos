package com.yandex.mobile.ads.instream.media3;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import p039C2.C0513S;
import p093F2.C1493m;
import p472a3.C7001d;
import p472a3.InterfaceC6998a;
import p884z2.C20695a;
import p884z2.C20696b;
import p884z2.InterfaceC20697c;
import p884z2.InterfaceC20719y;
import yads.C19924f6;
import yads.C20038jc;
import yads.C20334vp;
import yads.cj2;
import yads.ef2;
import yads.f91;
import yads.ia1;
import yads.je3;
import yads.ke3;
import yads.kv3;
import yads.lu3;
import yads.m00;
import yads.mv0;
import yads.oj2;
import yads.r00;
import yads.un0;
import yads.us3;
import yads.vs3;
import yads.xo0;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\n2\n\u0010\u0015\u001a\u00020\u0013\"\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\"\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)J/\u0010,\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00142\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-¨\u0006/"}, m18688d2 = {"Lcom/yandex/mobile/ads/instream/media3/YandexAdsLoader;", "Lyads/cj2;", "Landroid/content/Context;", "context", "Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;", "requestConfiguration", "<init>", "(Landroid/content/Context;Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;)V", "Lcom/yandex/mobile/ads/video/playback/VideoAdPlaybackListener;", "listener", "", "setVideoAdPlaybackListener", "(Lcom/yandex/mobile/ads/video/playback/VideoAdPlaybackListener;)V", "Lz2/y;", "player", "setPlayer", "(Lz2/y;)V", "release", "()V", "", "", "contentTypes", "setSupportedContentTypes", "([I)V", "La3/d;", "adsMediaSource", "LF2/m;", "adTagDataSpec", "", "adPlaybackId", "Lz2/c;", "adViewProvider", "La3/a$a;", "eventListener", "start", "(La3/d;LF2/m;Ljava/lang/Object;Lz2/c;La3/a$a;)V", "stop", "(La3/d;La3/a$a;)V", "adGroupIndex", "adIndexInAdGroup", "handlePrepareComplete", "(La3/d;II)V", "Ljava/io/IOException;", "exception", "handlePrepareError", "(La3/d;IILjava/io/IOException;)V", "a", "mobileads_externalRelease"}, m18689k = 1, m18690mv = {1, 9, 0})
public final class YandexAdsLoader extends cj2 {

    /* JADX INFO: renamed from: b */
    private final f91 f31397b;

    /* JADX INFO: renamed from: c */
    private final vs3 f31398c = new vs3();

    public YandexAdsLoader(Context context, InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f31397b = new C20038jc(context, new lu3(context), new us3(instreamAdRequestConfiguration, ia1.f64107d)).m23116a();
    }

    @Override // p472a3.InterfaceC6998a
    public void handlePrepareComplete(C7001d adsMediaSource, int adGroupIndex, int adIndexInAdGroup) {
        un0 un0Var = this.f31397b.f63023e;
        un0Var.getClass();
        un0Var.m24430a(adGroupIndex, adIndexInAdGroup, SystemClock.elapsedRealtime());
    }

    @Override // p472a3.InterfaceC6998a
    public void handlePrepareError(C7001d adsMediaSource, int adGroupIndex, int adIndexInAdGroup, IOException exception) {
        un0 un0Var = this.f31397b.f63023e;
        if (un0Var.f68182c.f69236b == null || un0Var.f68180a.f69925a == null) {
            return;
        }
        try {
            un0Var.m24431a(adGroupIndex, adIndexInAdGroup, exception);
        } catch (RuntimeException e10) {
            un0Var.f68183d.reportError("Unexpected exception while handling prepare error", e10);
        }
    }

    @Override // p472a3.InterfaceC6998a
    public void release() {
        f91 f91Var = this.f31397b;
        f91Var.f63035q = false;
        f91Var.f63034p = false;
        f91Var.f63031m = null;
        f91Var.f63024f.f65522b = null;
        f91Var.f63027i.f67719b.clear();
        f91Var.f63027i.f67718a = null;
        f91Var.f63021c.m25070a();
        C19924f6 c19924f6 = f91Var.f63028j;
        c19924f6.f63003a = null;
        c19924f6.f63004b = C20696b.f70952f;
        f91Var.f63022d.f65859b.m22127a((r00) null);
        f91Var.f63026h.f69451a = null;
        C20334vp c20334vp = f91Var.f63021c.f69925a;
        if (c20334vp != null) {
            c20334vp.f68538d.m22825a();
        }
        C20334vp c20334vp2 = f91Var.f63021c.f69925a;
        if (c20334vp2 != null) {
            c20334vp2.f68538d.m22826b();
        }
    }

    public void setPlayer(InterfaceC20719y player) {
        this.f31397b.f63032n = player;
    }

    public final void setVideoAdPlaybackListener(VideoAdPlaybackListener listener) {
        this.f31397b.f63026h.f69451a = listener != null ? new kv3(listener, this.f31398c) : null;
    }

    @Override // p472a3.InterfaceC6998a
    public void start(C7001d adsMediaSource, C1493m adTagDataSpec, Object adPlaybackId, InterfaceC20697c adViewProvider, InterfaceC6998a.a eventListener) {
        je3 je3Var;
        f91 f91Var = this.f31397b;
        InterfaceC20719y interfaceC20719y = f91Var.f63032n;
        xo0 xo0Var = f91Var.f63029k;
        xo0Var.f69236b = interfaceC20719y;
        for (oj2 oj2Var : xo0Var.f69235a) {
            oj2Var.f66152c = interfaceC20719y == null ? new mv0(oj2Var.f66151b) : null;
        }
        f91Var.f63033o = adPlaybackId;
        if (interfaceC20719y != null) {
            interfaceC20719y.mo9282h(f91Var.f63025g);
            C19924f6 c19924f6 = f91Var.f63028j;
            c19924f6.f63003a = eventListener;
            f91Var.f63024f.f65522b = new ef2(interfaceC20719y, f91Var.f63030l);
            if (f91Var.f63034p) {
                c19924f6.m22597a(c19924f6.f63004b);
                C20334vp c20334vp = f91Var.f63021c.f69925a;
                if (c20334vp != null) {
                    c20334vp.m24564a();
                    return;
                }
                return;
            }
            m00 m00Var = f91Var.f63031m;
            if (m00Var != null) {
                f91Var.f63028j.m22597a(f91Var.f63019a.m22823a(m00Var, f91Var.f63033o));
                return;
            }
            if (adViewProvider != null) {
                ViewGroup adViewGroup = adViewProvider.getAdViewGroup();
                ArrayList arrayList = new ArrayList();
                for (C20695a c20695a : adViewProvider.getAdOverlayInfos()) {
                    View view = c20695a.f70949a;
                    int i10 = c20695a.f70950b;
                    if (i10 == 1) {
                        je3Var = je3.f64435b;
                    } else if (i10 != 2) {
                        je3Var = i10 != 4 ? je3.f64438e : je3.f64437d;
                    } else {
                        je3Var = je3.f64436c;
                    }
                    arrayList.add(new ke3(view, je3Var, c20695a.f70951c));
                }
                f91Var.m22600a(adViewGroup, arrayList);
            }
        }
    }

    @Override // p472a3.InterfaceC6998a
    public void stop(C7001d adsMediaSource, InterfaceC6998a.a eventListener) {
        f91 f91Var = this.f31397b;
        InterfaceC20719y interfaceC20719y = f91Var.f63029k.f69236b;
        if (interfaceC20719y != null) {
            if (f91Var.f63031m != null) {
                long jM982T = C0513S.m982T(interfaceC20719y.getCurrentPosition());
                if (!interfaceC20719y.isPlayingAd()) {
                    jM982T = 0;
                }
                f91Var.f63028j.m22597a(f91Var.f63028j.f63004b.m25258i(jM982T));
            }
            interfaceC20719y.mo9260F(f91Var.f63025g);
            f91Var.f63028j.f63003a = null;
            xo0 xo0Var = f91Var.f63029k;
            xo0Var.f69236b = null;
            for (oj2 oj2Var : xo0Var.f69235a) {
                oj2Var.f66152c = new mv0(oj2Var.f66151b);
            }
            f91Var.f63034p = true;
        }
    }

    @Override // p472a3.InterfaceC6998a
    public void setSupportedContentTypes(int... contentTypes) {
    }
}
