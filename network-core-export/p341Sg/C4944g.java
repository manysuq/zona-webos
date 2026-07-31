package p341Sg;

import androidx.media3.exoplayer.C7758d;
import java.nio.charset.Charset;
import p107Fg.C1635c;
import p107Fg.C1636d;
import p107Fg.InterfaceC1633a;
import p644k0.C15584G0;

/* JADX INFO: renamed from: Sg.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C4944g {
    /* JADX INFO: renamed from: a */
    public static String m5525a(Number... numberArr) {
        if (numberArr.length < 2) {
            return "";
        }
        byte bByteValue = numberArr[6].byteValue();
        byte[] bArr = new byte[numberArr.length - 1];
        int i10 = -1;
        for (int i11 = 0; i11 < numberArr.length; i11++) {
            if (i11 != 6) {
                i10++;
                bArr[i10] = (byte) (numberArr[i11].byteValue() ^ bByteValue);
            }
        }
        return new String(bArr, Charset.forName("UTF-8"));
    }

    /* JADX INFO: renamed from: b */
    public static final C1635c m5526b(InterfaceC1633a interfaceC1633a, C7758d c7758d) {
        return new C1635c(interfaceC1633a, new C1636d(C15584G0.m18245a(c7758d.hashCode(), "(ExoPlayer:", ") ")));
    }
}
