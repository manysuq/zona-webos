package p341Sg;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: Sg.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C4938a {
    /* JADX INFO: renamed from: a */
    public static String m5519a(Number... numberArr) {
        if (numberArr.length < 2) {
            return "";
        }
        byte bByteValue = numberArr[0].byteValue();
        byte[] bArr = new byte[numberArr.length - 1];
        int i10 = -1;
        for (int i11 = 0; i11 < numberArr.length; i11++) {
            if (i11 != 0) {
                i10++;
                bArr[i10] = (byte) (numberArr[i11].byteValue() ^ bByteValue);
            }
        }
        return new String(bArr, Charset.forName("UTF-8"));
    }
}
