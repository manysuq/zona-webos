package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.time.DurationKt;
import org.mozilla.classfile.ByteCode;
import p039C2.C0513S;
import p039C2.C0515a;
import p170J7.AbstractC2481A;
import p170J7.AbstractC2517f0;
import p170J7.C2482B;
import p170J7.C2500U;
import p417X2.C6206r;
import p884z2.C20716v;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7793h {

    /* JADX INFO: renamed from: a */
    public static final Pattern f26247a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b */
    public static final Pattern f26248b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c */
    public static final Pattern f26249c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f26250d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e */
    public static final Pattern f26251e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f */
    public static final Pattern f26252f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g */
    public static final String f26253g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h */
    public static final String f26254h = new String(new byte[]{13, 10});

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.h$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f26255a;

        /* JADX INFO: renamed from: b */
        public final String f26256b;

        public a(String str, String str2) {
            this.f26255a = str;
            this.f26256b = str2;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.h$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f26257a;

        /* JADX INFO: renamed from: b */
        public final long f26258b;

        public b(String str, long j10) {
            this.f26257a = str;
            this.f26258b = j10;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static int m9510a(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    b10 = 0;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    b10 = 1;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    b10 = 2;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    b10 = 3;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    b10 = 4;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    b10 = 5;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    b10 = 6;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    b10 = 7;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    b10 = 8;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    b10 = 9;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    b10 = 10;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    b10 = ByteCode.T_LONG;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case 8:
                return 5;
            case 9:
                return 10;
            case 10:
                return 1;
            case 11:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2500U m9511b(String str) {
        if (str == null) {
            AbstractC2481A.b bVar = AbstractC2481A.f8293c;
            return C2500U.f8330f;
        }
        AbstractC2481A.a aVar = new AbstractC2481A.a();
        String str2 = C0513S.f2002a;
        for (String str3 : str.split(",\\s?", -1)) {
            int iM9510a = m9510a(str3);
            if (iM9510a != 0) {
                aVar.m3326c(Integer.valueOf(iM9510a));
            }
        }
        return aVar.m3216f();
    }

    /* JADX INFO: renamed from: c */
    public static b m9512c(String str) throws C20716v {
        long j10;
        Matcher matcher = f26250d.matcher(str);
        if (!matcher.matches()) {
            throw C20716v.m25337b(null, str);
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j10 = ((long) Integer.parseInt(strGroup2)) * 1000;
            } catch (NumberFormatException e10) {
                throw C20716v.m25337b(e10, str);
            }
        } else {
            j10 = DurationKt.MILLIS_IN_MINUTE;
        }
        return new b(strGroup, j10);
    }

    /* JADX INFO: renamed from: d */
    public static a m9513d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return null;
        }
        String str = C0513S.f2002a;
        String[] strArrSplit = userInfo.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
        return new a(strArrSplit[0], strArrSplit[1]);
    }

    /* JADX INFO: renamed from: e */
    public static C7788c m9514e(String str) throws C20716v {
        Matcher matcher = f26251e.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(3);
            strGroup2.getClass();
            String strGroup3 = matcher.group(4);
            return new C7788c(2, strGroup, strGroup2, strGroup3 != null ? strGroup3 : "");
        }
        Matcher matcher2 = f26252f.matcher(str);
        if (matcher2.matches()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            return new C7788c(1, strGroup4, "", "");
        }
        throw C20716v.m25337b(null, "Invalid WWW-Authenticate header " + str);
    }

    /* JADX INFO: renamed from: f */
    public static C2500U m9515f(C6206r c6206r) {
        C0515a.m1025a(c6206r.f20331c.m9493b("CSeq") != null);
        AbstractC2481A.a aVar = new AbstractC2481A.a();
        Object[] objArr = {m9516g(c6206r.f20330b), c6206r.f20329a, "RTSP/1.0"};
        String str = C0513S.f2002a;
        aVar.m3326c(String.format(Locale.US, "%s %s %s", objArr));
        C2482B<String, String> c2482b = c6206r.f20331c.f26191a;
        AbstractC2517f0<String> it = c2482b.f8307e.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC2481A abstractC2481AM3222d = c2482b.m3222d(next);
            for (int i10 = 0; i10 < abstractC2481AM3222d.size(); i10++) {
                aVar.m3326c(String.format(Locale.US, "%s: %s", next, abstractC2481AM3222d.get(i10)));
            }
        }
        aVar.m3326c("");
        aVar.m3326c(c6206r.f20332d);
        return aVar.m3216f();
    }

    /* JADX INFO: renamed from: g */
    public static String m9516g(int i10) {
        switch (i10) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
