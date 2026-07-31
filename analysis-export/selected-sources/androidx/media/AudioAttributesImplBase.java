package androidx.media;

import java.util.Arrays;
import p724p.C17490h;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f25676a = 0;

    /* JADX INFO: renamed from: b */
    public int f25677b = 0;

    /* JADX INFO: renamed from: c */
    public int f25678c = 0;

    /* JADX INFO: renamed from: d */
    public int f25679d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f25677b == audioAttributesImplBase.f25677b) {
            int i11 = this.f25678c;
            int i12 = audioAttributesImplBase.f25678c;
            int i13 = audioAttributesImplBase.f25679d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.f25676a;
                int i15 = AudioAttributesCompat.f25672b;
                if ((i12 & 1) != 1) {
                    i10 = 4;
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                            default:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.f25676a == audioAttributesImplBase.f25676a && this.f25679d == i13) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25677b), Integer.valueOf(this.f25678c), Integer.valueOf(this.f25676a), Integer.valueOf(this.f25679d)});
    }

    public final String toString() {
        String strM19873a;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f25679d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f25679d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f25676a;
        int i11 = AudioAttributesCompat.f25672b;
        switch (i10) {
            case 0:
                strM19873a = "USAGE_UNKNOWN";
                break;
            case 1:
                strM19873a = "USAGE_MEDIA";
                break;
            case 2:
                strM19873a = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM19873a = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM19873a = "USAGE_ALARM";
                break;
            case 5:
                strM19873a = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM19873a = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM19873a = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM19873a = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM19873a = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM19873a = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM19873a = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM19873a = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM19873a = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM19873a = "USAGE_GAME";
                break;
            case 15:
            default:
                strM19873a = C17490h.m19873a(i10, "unknown usage ");
                break;
            case 16:
                strM19873a = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strM19873a);
        sb2.append(" content=");
        sb2.append(this.f25677b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f25678c).toUpperCase());
        return sb2.toString();
    }
}
