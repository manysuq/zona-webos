package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import p039C2.C0513S;
import p092F1.C1473c;
import p884z2.C20716v;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7788c {

    /* JADX INFO: renamed from: a */
    public final int f26159a;

    /* JADX INFO: renamed from: b */
    public final String f26160b;

    /* JADX INFO: renamed from: c */
    public final String f26161c;

    /* JADX INFO: renamed from: d */
    public final String f26162d;

    public C7788c(int i10, String str, String str2, String str3) {
        this.f26159a = i10;
        this.f26160b = str;
        this.f26161c = str2;
        this.f26162d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m9481a(C7793h.a aVar, Uri uri, int i10) throws C20716v {
        String str = this.f26162d;
        String str2 = this.f26160b;
        String str3 = this.f26161c;
        int i11 = this.f26159a;
        if (i11 == 1) {
            String strEncodeToString = Base64.encodeToString((aVar.f26255a + StringUtils.PROCESS_POSTFIX_DELIMITER + aVar.f26256b).getBytes(C7792g.f26230h), 0);
            String str4 = C0513S.f2002a;
            Locale locale = Locale.US;
            return C1473c.m2035a("Basic ", strEncodeToString);
        }
        if (i11 != 2) {
            throw new C20716v(null, new UnsupportedOperationException(), false, 4);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strM9516g = C7793h.m9516g(i10);
            String str5 = aVar.f26255a + StringUtils.PROCESS_POSTFIX_DELIMITER + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + aVar.f26256b;
            Charset charset = C7792g.f26230h;
            String strM1000f0 = C0513S.m1000f0(messageDigest.digest((C0513S.m1000f0(messageDigest.digest(str5.getBytes(charset))) + StringUtils.PROCESS_POSTFIX_DELIMITER + str3 + StringUtils.PROCESS_POSTFIX_DELIMITER + C0513S.m1000f0(messageDigest.digest((strM9516g + StringUtils.PROCESS_POSTFIX_DELIMITER + uri).getBytes(charset)))).getBytes(charset)));
            return str.isEmpty() ? String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f26255a, str2, str3, uri, strM1000f0) : String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f26255a, str2, str3, uri, strM1000f0, str);
        } catch (NoSuchAlgorithmException e10) {
            throw new C20716v(null, e10, false, 4);
        }
    }
}
