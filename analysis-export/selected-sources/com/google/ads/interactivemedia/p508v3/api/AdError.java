package com.google.ads.interactivemedia.p508v3.api;

import p470a1.C6989a;
import p607i9.C12948z6;
import p622j.C15292t;
import p644k0.C15637a;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class AdError extends Exception {
    private final AdErrorCode zza;
    private final AdErrorType zzb;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(1010),
        VAST_TRAFFICKING_ERROR(200),
        VAST_LOAD_TIMEOUT(301),
        VAST_TOO_MANY_REDIRECTS(302),
        VAST_NO_ADS_AFTER_WRAPPER(303),
        VIDEO_PLAY_ERROR(400),
        VAST_MEDIA_LOAD_TIMEOUT(402),
        VAST_LINEAR_ASSET_MISMATCH(403),
        OVERLAY_AD_PLAYING_FAILED(500),
        OVERLAY_AD_LOADING_FAILED(502),
        VAST_NONLINEAR_ASSET_MISMATCH(503),
        COMPANION_AD_LOADING_FAILED(603),
        UNKNOWN_ERROR(900),
        VAST_EMPTY_RESPONSE(1009),
        FAILED_TO_REQUEST_ADS(1005),
        VAST_ASSET_NOT_FOUND(1007),
        ADS_REQUEST_NETWORK_ERROR(1012),
        INVALID_ARGUMENTS(1101),
        PLAYLIST_NO_CONTENT_TRACKING(1205),
        UNEXPECTED_ADS_LOADED_EVENT(1206),
        ADS_PLAYER_NOT_PROVIDED(1207);

        private final int zzb;

        AdErrorCode(int i10) {
            this.zzb = i10;
        }

        public static AdErrorCode getErrorCodeByNumber(int i10) {
            for (AdErrorCode adErrorCode : values()) {
                if (adErrorCode.getErrorNumber() == i10) {
                    return adErrorCode;
                }
            }
            return i10 == 1204 ? INTERNAL_ERROR : UNKNOWN_ERROR;
        }

        public int getErrorNumber() {
            return this.zzb;
        }

        @Override // java.lang.Enum
        public String toString() {
            return C15637a.m18295a("]", this.zzb, C15292t.m18009a("AdErrorCode [name: ", name(), ", number: "));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public enum AdErrorType {
        LOAD,
        PLAY
    }

    public AdError(AdErrorType adErrorType, int i10, String str) {
        this(adErrorType, AdErrorCode.getErrorCodeByNumber(i10), str);
    }

    public AdErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeNumber() {
        return this.zza.getErrorNumber();
    }

    public AdErrorType getErrorType() {
        return this.zzb;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        AdErrorCode adErrorCode = this.zza;
        return C6989a.m7848b(getMessage(), "]", C12948z6.m14696a("AdError [errorType: ", String.valueOf(this.zzb), ", errorCode: ", String.valueOf(adErrorCode), ", message: "));
    }

    public AdError(AdErrorType adErrorType, AdErrorCode adErrorCode, String str) {
        super(str);
        this.zzb = adErrorType;
        this.zza = adErrorCode;
    }
}
