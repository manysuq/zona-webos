package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045C8.C0674a;
import p045C8.C0675b;
import p045C8.C0676c;
import p607i9.EnumC12361Re;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m18688d2 = {"Lcom/yandex/div/core/player/DivPlayerFactory;", "", "makePlayer", "Lcom/yandex/div/core/player/DivPlayer;", "src", "", "Lcom/yandex/div/core/player/DivVideoSource;", "config", "Lcom/yandex/div/core/player/DivPlayerPlaybackConfig;", "makePlayerView", "Lcom/yandex/div/core/player/DivPlayerView;", "context", "Landroid/content/Context;", "makePreloader", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "Companion", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public interface DivPlayerFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmField
    public static final DivPlayerFactory STUB = new DivPlayerFactory() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public /* bridge */ /* synthetic */ DivPlayer makePlayer(List list, DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return makePlayer((List<DivVideoSource>) list, divPlayerPlaybackConfig);
        }

        @Override // com.yandex.div.core.player.DivPlayerFactory
        public final /* synthetic */ DivPlayerPreloader makePreloader() {
            return C0675b.m1203a(this);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public DivPlayerFactory$Companion$STUB$1$makePlayer$1 makePlayer(List<DivVideoSource> src, DivPlayerPlaybackConfig config) {
            return new DivPlayer() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1
                @Override // com.yandex.div.core.player.DivPlayer
                public final /* synthetic */ void addObserver(DivPlayer.Observer observer) {
                    C0674a.m1197a(this, observer);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public final /* synthetic */ void pause() {
                    C0674a.m1198b(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public final /* synthetic */ void play() {
                    C0674a.m1199c(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public final /* synthetic */ void release() {
                    C0674a.m1200d(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public final /* synthetic */ void seek(long j10) {
                    C0674a.m1201e(this, j10);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public final /* synthetic */ void setMuted(boolean z10) {
                    C0674a.m1202f(this, z10);
                }
            };
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public DivPlayerFactory$Companion$STUB$1$makePlayerView$1 makePlayerView(final Context context) {
            return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
                {
                    int i10 = 6;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    AttributeSet attributeSet = null;
                    int i11 = 0;
                }

                @Override // com.yandex.div.core.player.DivPlayerView
                public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
                    return C0676c.m1206c(this);
                }

                @Override // com.yandex.div.core.player.DivPlayerView
                public /* bridge */ /* synthetic */ void setScale(EnumC12361Re enumC12361Re) {
                    C0676c.m1207d(this, enumC12361Re);
                }

                @Override // com.yandex.div.core.player.DivPlayerView
                public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z10) {
                    C0676c.m1208e(this, z10);
                }
            };
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, m18688d2 = {"Lcom/yandex/div/core/player/DivPlayerFactory$Companion;", "", "()V", "STUB", "Lcom/yandex/div/core/player/DivPlayerFactory;", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    DivPlayer makePlayer(List<DivVideoSource> src, DivPlayerPlaybackConfig config);

    DivPlayerView makePlayerView(Context context);

    DivPlayerPreloader makePreloader();
}
