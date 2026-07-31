package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;
import p039C2.C0513S;
import p039C2.C0515a;
import p039C2.C0539y;
import p093F2.C1477A;
import p093F2.C1491k;
import p093F2.C1493m;
import p093F2.InterfaceC1479C;
import p093F2.InterfaceC1489i;
import p094F3.C1514h;
import p201L2.C3193c0;
import p206L7.C3272e;
import p237N2.C3606b;
import p237N2.C3607c;
import p237N2.C3614j;
import p237N2.InterfaceC3611g;
import p237N2.RunnableC3609e;
import p237N2.RunnableC3610f;
import p255O2.AbstractC3817j;
import p255O2.C3808a;
import p255O2.C3810c;
import p255O2.C3811d;
import p255O2.C3813f;
import p255O2.C3814g;
import p255O2.C3819l;
import p255O2.C3822o;
import p273P2.C4042g;
import p273P2.InterfaceC4049n;
import p273P2.InterfaceC4050o;
import p399W2.C5846b;
import p453Z2.AbstractC6658a;
import p453Z2.C6676j;
import p453Z2.C6690u;
import p453Z2.InterfaceC6640H;
import p453Z2.InterfaceC6641I;
import p453Z2.InterfaceC6694y;
import p453Z2.InterfaceC6695z;
import p487b3.C8009d;
import p487b3.C8013h;
import p535e3.C10738d;
import p535e3.C10739e;
import p535e3.C10742h;
import p535e3.C10745k;
import p535e3.C10747m;
import p535e3.InterfaceC10743i;
import p535e3.InterfaceC10746l;
import p551f3.C11019b;
import p623j$.util.DesugarTimeZone;
import p623j$.util.Objects;
import p884z2.AbstractC20686A;
import p884z2.C20696b;
import p884z2.C20711q;
import p884z2.C20712r;
import p884z2.C20716v;
import p884z2.C20720z;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource extends AbstractC6658a {

    /* JADX INFO: renamed from: A */
    public C10745k f25811A;

    /* JADX INFO: renamed from: B */
    public InterfaceC1479C f25812B;

    /* JADX INFO: renamed from: C */
    public C3607c f25813C;

    /* JADX INFO: renamed from: D */
    public Handler f25814D;

    /* JADX INFO: renamed from: E */
    public C20711q.f f25815E;

    /* JADX INFO: renamed from: F */
    public Uri f25816F;

    /* JADX INFO: renamed from: G */
    public final Uri f25817G;

    /* JADX INFO: renamed from: H */
    public C3810c f25818H;

    /* JADX INFO: renamed from: I */
    public boolean f25819I;

    /* JADX INFO: renamed from: J */
    public long f25820J;

    /* JADX INFO: renamed from: K */
    public long f25821K;

    /* JADX INFO: renamed from: L */
    public long f25822L;

    /* JADX INFO: renamed from: M */
    public int f25823M;

    /* JADX INFO: renamed from: N */
    public long f25824N;

    /* JADX INFO: renamed from: O */
    public int f25825O;

    /* JADX INFO: renamed from: P */
    public C20711q f25826P;

    /* JADX INFO: renamed from: h */
    public final boolean f25827h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1489i.a f25828i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC7767a.a f25829j;

    /* JADX INFO: renamed from: k */
    public final C6676j f25830k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC4050o f25831l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC10743i f25832m;

    /* JADX INFO: renamed from: n */
    public final C3606b f25833n;

    /* JADX INFO: renamed from: o */
    public final long f25834o;

    /* JADX INFO: renamed from: p */
    public final long f25835p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC6640H.a f25836q;

    /* JADX INFO: renamed from: r */
    public final C10747m.a<? extends C3810c> f25837r;

    /* JADX INFO: renamed from: s */
    public final C7763e f25838s;

    /* JADX INFO: renamed from: t */
    public final Object f25839t;

    /* JADX INFO: renamed from: u */
    public final SparseArray<C7768b> f25840u;

    /* JADX INFO: renamed from: v */
    public final RunnableC3609e f25841v;

    /* JADX INFO: renamed from: w */
    public final RunnableC3610f f25842w;

    /* JADX INFO: renamed from: x */
    public final C7761c f25843x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC10746l f25844y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1489i f25845z;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class Factory implements InterfaceC6641I {

        /* JADX INFO: renamed from: a */
        public final C7769c.a f25846a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1489i.a f25847b;

        /* JADX INFO: renamed from: c */
        public final C4042g f25848c;

        /* JADX INFO: renamed from: d */
        public final C6676j f25849d;

        /* JADX INFO: renamed from: e */
        public final C10742h f25850e;

        /* JADX INFO: renamed from: f */
        public final long f25851f;

        /* JADX INFO: renamed from: g */
        public final long f25852g;

        public Factory(InterfaceC1489i.a aVar) {
            C7769c.a aVar2 = new C7769c.a(aVar);
            this.f25846a = aVar2;
            this.f25847b = aVar;
            this.f25848c = new C4042g();
            this.f25850e = new C10742h();
            this.f25851f = 30000L;
            this.f25852g = 5000000L;
            this.f25849d = new C6676j();
            aVar2.f25921c.f27596b = true;
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6695z mo7475a(C20711q c20711q) {
            c20711q.f71090b.getClass();
            C3811d c3811d = new C3811d();
            List<C20720z> list = c20711q.f71090b.f71137e;
            return new DashMediaSource(c20711q, this.f25847b, !list.isEmpty() ? new C5846b(c3811d, list) : c3811d, this.f25846a, this.f25849d, this.f25848c.m4746b(c20711q), this.f25850e, this.f25851f, this.f25852g);
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC6695z.a mo7476b(C1514h c1514h) {
            C8009d.b bVar = this.f25846a.f25921c;
            bVar.getClass();
            bVar.f27595a = c1514h;
            return this;
        }

        @Override // p453Z2.InterfaceC6695z.a
        @Deprecated
        /* JADX INFO: renamed from: c */
        public final InterfaceC6695z.a mo7477c(boolean z10) {
            this.f25846a.f25921c.f27596b = z10;
            return this;
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: d */
        public final InterfaceC6695z.a mo7478d() {
            this.f25846a.f25921c.getClass();
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.DashMediaSource$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class C7759a {
        public C7759a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m9331a() {
            long j10;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            synchronized (C11019b.f34239b) {
                try {
                    j10 = C11019b.f34240c ? C11019b.f34241d : -9223372036854775807L;
                } catch (Throwable th) {
                    throw th;
                }
            }
            dashMediaSource.f25822L = j10;
            dashMediaSource.m9330z(true);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.DashMediaSource$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class C7760b extends AbstractC20686A {

        /* JADX INFO: renamed from: b */
        public final long f25854b;

        /* JADX INFO: renamed from: c */
        public final long f25855c;

        /* JADX INFO: renamed from: d */
        public final long f25856d;

        /* JADX INFO: renamed from: e */
        public final int f25857e;

        /* JADX INFO: renamed from: f */
        public final long f25858f;

        /* JADX INFO: renamed from: g */
        public final long f25859g;

        /* JADX INFO: renamed from: h */
        public final long f25860h;

        /* JADX INFO: renamed from: i */
        public final C3810c f25861i;

        /* JADX INFO: renamed from: j */
        public final C20711q f25862j;

        /* JADX INFO: renamed from: k */
        public final C20711q.f f25863k;

        public C7760b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, C3810c c3810c, C20711q c20711q, C20711q.f fVar) {
            C0515a.m1030f(c3810c.f12420d == (fVar != null));
            this.f25854b = j10;
            this.f25855c = j11;
            this.f25856d = j12;
            this.f25857e = i10;
            this.f25858f = j13;
            this.f25859g = j14;
            this.f25860h = j15;
            this.f25861i = c3810c;
            this.f25862j = c20711q;
            this.f25863k = fVar;
        }

        @Override // p884z2.AbstractC20686A
        /* JADX INFO: renamed from: b */
        public final int mo3479b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f25857e) >= 0 && iIntValue < mo3452h()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // p884z2.AbstractC20686A
        /* JADX INFO: renamed from: f */
        public final AbstractC20686A.b mo3451f(int i10, AbstractC20686A.b bVar, boolean z10) {
            C0515a.m1027c(i10, mo3452h());
            C3810c c3810c = this.f25861i;
            String str = z10 ? c3810c.m4525b(i10).f12451a : null;
            Integer numValueOf = z10 ? Integer.valueOf(this.f25857e + i10) : null;
            long jM4527d = c3810c.m4527d(i10);
            long jM982T = C0513S.m982T(c3810c.m4525b(i10).f12452b - c3810c.m4525b(0).f12452b) - this.f25858f;
            bVar.getClass();
            bVar.m25231f(str, numValueOf, 0, jM4527d, jM982T, C20696b.f70952f, false);
            return bVar;
        }

        @Override // p884z2.AbstractC20686A
        /* JADX INFO: renamed from: h */
        public final int mo3452h() {
            return this.f25861i.f12429m.size();
        }

        @Override // p884z2.AbstractC20686A
        /* JADX INFO: renamed from: l */
        public final Object mo3484l(int i10) {
            C0515a.m1027c(i10, mo3452h());
            return Integer.valueOf(this.f25857e + i10);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
        @Override // p884z2.AbstractC20686A
        /* JADX INFO: renamed from: m */
        public final AbstractC20686A.c mo3485m(int i10, AbstractC20686A.c cVar, long j10) {
            long j11;
            boolean z10;
            long j12;
            InterfaceC3611g interfaceC3611gMo4551l;
            C0515a.m1027c(i10, 1);
            C3810c c3810c = this.f25861i;
            boolean z11 = c3810c.f12420d;
            long jMo4348a = this.f25860h;
            if (z11 && c3810c.f12421e != -9223372036854775807L && c3810c.f12418b == -9223372036854775807L) {
                long j13 = 0;
                if (j10 > 0) {
                    jMo4348a += j10;
                    if (jMo4348a > this.f25859g) {
                        jMo4348a = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                    }
                    Object obj = AbstractC20686A.c.f70869q;
                    if (c3810c.f12420d || c3810c.f12421e == j11 || c3810c.f12418b != j11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    cVar.m25233b(obj, this.f25862j, c3810c, this.f25854b, this.f25855c, this.f25856d, true, z10, this.f25863k, jMo4348a, this.f25859g, 0, mo3452h() - 1, this.f25858f);
                    return cVar;
                }
                long j14 = this.f25858f + jMo4348a;
                long jM4527d = c3810c.m4527d(0);
                int i11 = 0;
                while (i11 < c3810c.f12429m.size() - 1 && j14 >= jM4527d) {
                    j14 -= jM4527d;
                    i11++;
                    jM4527d = c3810c.m4527d(i11);
                }
                C3814g c3814gM4525b = c3810c.m4525b(i11);
                List<C3808a> list = c3814gM4525b.f12453c;
                int size = list.size();
                j11 = -9223372036854775807L;
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        j12 = j13;
                        i12 = -1;
                        break;
                    }
                    j12 = j13;
                    if (list.get(i12).f12408b == 2) {
                        break;
                    }
                    i12++;
                    j13 = j12;
                }
                if (i12 != -1 && (interfaceC3611gMo4551l = c3814gM4525b.f12453c.get(i12).f12409c.get(0).mo4551l()) != null && interfaceC3611gMo4551l.mo4354g(jM4527d) != j12) {
                    jMo4348a = (interfaceC3611gMo4551l.mo4348a(interfaceC3611gMo4551l.mo4353f(j14, jM4527d)) + jMo4348a) - j14;
                }
            } else {
                j11 = -9223372036854775807L;
            }
            Object obj2 = AbstractC20686A.c.f70869q;
            if (c3810c.f12420d) {
                z10 = false;
            } else {
                z10 = false;
            }
            cVar.m25233b(obj2, this.f25862j, c3810c, this.f25854b, this.f25855c, this.f25856d, true, z10, this.f25863k, jMo4348a, this.f25859g, 0, mo3452h() - 1, this.f25858f);
            return cVar;
        }

        @Override // p884z2.AbstractC20686A
        /* JADX INFO: renamed from: o */
        public final int mo3453o() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.DashMediaSource$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class C7761c implements C7770d.b {
        public C7761c() {
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.DashMediaSource$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class C7762d implements C10747m.a<Long> {

        /* JADX INFO: renamed from: b */
        public static final Pattern f25865b = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // p535e3.C10747m.a
        /* JADX INFO: renamed from: a */
        public final Object mo4547a(Uri uri, C1491k c1491k) throws IOException {
            String line = new BufferedReader(new InputStreamReader(c1491k, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = f25865b.matcher(line);
                if (!matcher.matches()) {
                    throw C20716v.m25337b(null, "Couldn't parse timestamp: " + line);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * DurationKt.MILLIS_IN_MINUTE) * j10;
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw C20716v.m25337b(e10, null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.DashMediaSource$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class C7763e implements C10745k.a<C10747m<C3810c>> {
        public C7763e() {
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: j */
        public final void mo5148j(C10745k.d dVar, long j10, long j11, int i10) {
            C6690u c6690u;
            C10747m c10747m = (C10747m) dVar;
            if (i10 == 0) {
                long j12 = c10747m.f33386a;
                c6690u = new C6690u(c10747m.f33387b);
            } else {
                long j13 = c10747m.f33386a;
                C1477A c1477a = c10747m.f33389d;
                c6690u = new C6690u(c1477a.f4903c, c1477a.f4904d, j11, c1477a.f4902b);
            }
            DashMediaSource.this.f25836q.m7445g(c6690u, c10747m.f33388c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: l */
        public final void mo5150l(C10745k.d dVar, long j10, long j11) {
            C10747m c10747m = (C10747m) dVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long j12 = c10747m.f33386a;
            C1477A c1477a = c10747m.f33389d;
            C6690u c6690u = new C6690u(c1477a.f4903c, c1477a.f4904d, j11, c1477a.f4902b);
            dashMediaSource.f25832m.getClass();
            dashMediaSource.f25836q.m7442d(c6690u, c10747m.f33388c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            C3810c c3810c = (C3810c) c10747m.f33391f;
            C3810c c3810c2 = dashMediaSource.f25818H;
            int size = c3810c2 == null ? 0 : c3810c2.f12429m.size();
            long j13 = c3810c.m4525b(0).f12452b;
            int i10 = 0;
            while (i10 < size && dashMediaSource.f25818H.m4525b(i10).f12452b < j13) {
                i10++;
            }
            if (c3810c.f12420d) {
                if (size - i10 > c3810c.f12429m.size()) {
                    C0539y.m1074f("Loaded out of sync manifest");
                } else {
                    long j14 = dashMediaSource.f25824N;
                    if (j14 == -9223372036854775807L || c3810c.f12424h * 1000 > j14) {
                        dashMediaSource.f25823M = 0;
                    } else {
                        C0539y.m1074f("Loaded stale dynamic manifest: " + c3810c.f12424h + ", " + dashMediaSource.f25824N);
                    }
                }
                int i11 = dashMediaSource.f25823M;
                dashMediaSource.f25823M = i11 + 1;
                if (i11 < dashMediaSource.f25832m.mo12813a(c10747m.f33388c)) {
                    dashMediaSource.f25814D.postDelayed(dashMediaSource.f25841v, Math.min((dashMediaSource.f25823M - 1) * 1000, 5000));
                    return;
                } else {
                    dashMediaSource.f25813C = new C3607c();
                    return;
                }
            }
            dashMediaSource.f25818H = c3810c;
            dashMediaSource.f25819I = c3810c.f12420d & dashMediaSource.f25819I;
            dashMediaSource.f25820J = j10 - j11;
            dashMediaSource.f25821K = j10;
            dashMediaSource.f25825O += i10;
            synchronized (dashMediaSource.f25839t) {
                if (c10747m.f33387b.f4947a.equals(dashMediaSource.f25816F)) {
                    Uri uriM12808a = dashMediaSource.f25818H.f12427k;
                    if (uriM12808a == null) {
                        uriM12808a = C10738d.m12808a(c10747m.f33389d.f4903c);
                    }
                    dashMediaSource.f25816F = uriM12808a;
                }
            }
            C3810c c3810c3 = dashMediaSource.f25818H;
            if (!c3810c3.f12420d || dashMediaSource.f25822L != -9223372036854775807) {
                dashMediaSource.m9330z(true);
                return;
            }
            C3822o c3822o = c3810c3.f12425i;
            if (c3822o == null) {
                dashMediaSource.m9327w();
                return;
            }
            String str = c3822o.f12500a;
            if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    dashMediaSource.f25822L = C0513S.m985W(c3822o.f12501b) - dashMediaSource.f25821K;
                    dashMediaSource.m9330z(true);
                    return;
                } catch (C20716v e10) {
                    dashMediaSource.m9329y(e10);
                    return;
                }
            }
            if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                dashMediaSource.m9325A(c3822o, new C7762d());
                return;
            }
            if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                dashMediaSource.m9325A(c3822o, new C7766h());
            } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                dashMediaSource.m9327w();
            } else {
                dashMediaSource.m9329y(new IOException("Unsupported UTC timing scheme"));
            }
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: n */
        public final C10745k.b mo5152n(C10745k.d dVar, long j10, long j11, IOException iOException, int i10) {
            C10747m c10747m = (C10747m) dVar;
            long j12 = c10747m.f33386a;
            C1477A c1477a = c10747m.f33389d;
            C6690u c6690u = new C6690u(c1477a.f4903c, c1477a.f4904d, j11, c1477a.f4902b);
            int i11 = c10747m.f33388c;
            InterfaceC10743i.c cVar = new InterfaceC10743i.c(iOException, i10);
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long jMo12814b = dashMediaSource.f25832m.mo12814b(cVar);
            C10745k.b bVar = jMo12814b == -9223372036854775807L ? C10745k.f33369f : new C10745k.b(0, jMo12814b);
            dashMediaSource.f25836q.m7444f(c6690u, i11, iOException, !bVar.m12822a());
            return bVar;
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: o */
        public final void mo5153o(C10745k.d dVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.m9328x((C10747m) dVar, j11);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.DashMediaSource$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class C7764f implements InterfaceC10746l {
        public C7764f() {
        }

        @Override // p535e3.InterfaceC10746l
        /* JADX INFO: renamed from: a */
        public final void mo9332a() throws IOException {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.f25811A.mo9332a();
            C3607c c3607c = dashMediaSource.f25813C;
            if (c3607c != null) {
                throw c3607c;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.DashMediaSource$h */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class C7766h implements C10747m.a<Long> {
        @Override // p535e3.C10747m.a
        /* JADX INFO: renamed from: a */
        public final Object mo4547a(Uri uri, C1491k c1491k) {
            return Long.valueOf(C0513S.m985W(new BufferedReader(new InputStreamReader(c1491k)).readLine()));
        }
    }

    static {
        C20712r.m25314a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [N2.e] */
    /* JADX WARN: Type inference failed for: r2v12, types: [N2.f] */
    public DashMediaSource(C20711q c20711q, InterfaceC1489i.a aVar, C10747m.a aVar2, C7769c.a aVar3, C6676j c6676j, InterfaceC4050o interfaceC4050o, C10742h c10742h, long j10, long j11) {
        this.f25826P = c20711q;
        this.f25815E = c20711q.f71091c;
        C20711q.g gVar = c20711q.f71090b;
        gVar.getClass();
        Uri uri = gVar.f71133a;
        this.f25816F = uri;
        this.f25817G = uri;
        this.f25818H = null;
        this.f25828i = aVar;
        this.f25837r = aVar2;
        this.f25829j = aVar3;
        this.f25831l = interfaceC4050o;
        this.f25832m = c10742h;
        this.f25834o = j10;
        this.f25835p = j11;
        this.f25830k = c6676j;
        this.f25833n = new C3606b();
        this.f25827h = false;
        this.f25836q = m7523p(null);
        this.f25839t = new Object();
        this.f25840u = new SparseArray<>();
        this.f25843x = new C7761c();
        this.f25824N = -9223372036854775807L;
        this.f25822L = -9223372036854775807L;
        this.f25838s = new C7763e();
        this.f25844y = new C7764f();
        this.f25841v = new Runnable() { // from class: N2.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f11856b.m9326B();
            }
        };
        this.f25842w = new Runnable() { // from class: N2.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f11857b.m9330z(false);
            }
        };
    }

    /* JADX INFO: renamed from: v */
    public static boolean m9324v(C3814g c3814g) {
        List<C3808a> list = c3814g.f12453c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = list.get(i10).f12408b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m9325A(C3822o c3822o, C10747m.a<Long> aVar) {
        InterfaceC1489i interfaceC1489i = this.f25845z;
        Uri uri = Uri.parse(c3822o.f12501b);
        Map map = Collections.EMPTY_MAP;
        C0515a.m1032h(uri, "The uri must be set.");
        this.f25811A.m12821f(new C10747m(interfaceC1489i, new C1493m(uri, 0L, 1, null, map, 0L, -1L, null, 1), 5, aVar), new C7765g(), 1);
    }

    /* JADX INFO: renamed from: B */
    public final void m9326B() {
        Uri uri;
        this.f25814D.removeCallbacks(this.f25841v);
        if (this.f25811A.m12818c()) {
            return;
        }
        if (this.f25811A.m12819d()) {
            this.f25819I = true;
            return;
        }
        synchronized (this.f25839t) {
            uri = this.f25816F;
        }
        this.f25819I = false;
        Map map = Collections.EMPTY_MAP;
        C0515a.m1032h(uri, "The uri must be set.");
        this.f25811A.m12821f(new C10747m(this.f25845z, new C1493m(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.f25837r), this.f25838s, this.f25832m.mo12813a(4));
    }

    @Override // p453Z2.AbstractC6658a, p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7452c(C20711q c20711q) {
        this.f25826P = c20711q;
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: e */
    public final synchronized C20711q mo7453e() {
        return this.f25826P;
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: f */
    public final InterfaceC6694y mo7454f(InterfaceC6695z.b bVar, C10739e c10739e, long j10) {
        int iIntValue = ((Integer) bVar.f22080a).intValue() - this.f25825O;
        InterfaceC6640H.a aVarM7523p = m7523p(bVar);
        InterfaceC4049n.a aVar = new InterfaceC4049n.a(this.f21904d.f13298c, 0, bVar);
        int i10 = this.f25825O + iIntValue;
        C3810c c3810c = this.f25818H;
        InterfaceC1479C interfaceC1479C = this.f25812B;
        long j11 = this.f25822L;
        C3193c0 c3193c0 = this.f21907g;
        C0515a.m1031g(c3193c0);
        C7768b c7768b = new C7768b(i10, c3810c, this.f25833n, iIntValue, this.f25829j, interfaceC1479C, this.f25831l, aVar, this.f25832m, aVarM7523p, j11, this.f25844y, c10739e, this.f25830k, this.f25843x, c3193c0);
        this.f25840u.put(i10, c7768b);
        return c7768b;
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: i */
    public final void mo7455i(InterfaceC6694y interfaceC6694y) {
        C7768b c7768b = (C7768b) interfaceC6694y;
        C7770d c7770d = c7768b.f25884n;
        c7770d.f25937j = true;
        c7770d.f25932e.removeCallbacksAndMessages(null);
        for (C8013h<InterfaceC7767a> c8013h : c7768b.f25890t) {
            c8013h.m9982s(c7768b);
        }
        c7768b.f25889s = null;
        this.f25840u.remove(c7768b.f25872b);
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: l */
    public final void mo7456l() {
        this.f25844y.mo9332a();
    }

    @Override // p453Z2.AbstractC6658a
    /* JADX INFO: renamed from: s */
    public final void mo7457s(InterfaceC1479C interfaceC1479C) {
        this.f25812B = interfaceC1479C;
        Looper looperMyLooper = Looper.myLooper();
        C3193c0 c3193c0 = this.f21907g;
        C0515a.m1031g(c3193c0);
        InterfaceC4050o interfaceC4050o = this.f25831l;
        interfaceC4050o.mo4735b(looperMyLooper, c3193c0);
        interfaceC4050o.prepare();
        if (this.f25827h) {
            m9330z(false);
            return;
        }
        this.f25845z = this.f25828i.createDataSource();
        this.f25811A = new C10745k("DashMediaSource");
        this.f25814D = C0513S.m1011p(null);
        m9326B();
    }

    @Override // p453Z2.AbstractC6658a
    /* JADX INFO: renamed from: u */
    public final void mo7458u() {
        this.f25819I = false;
        this.f25845z = null;
        C10745k c10745k = this.f25811A;
        if (c10745k != null) {
            c10745k.m12820e(null);
            this.f25811A = null;
        }
        this.f25820J = 0L;
        this.f25821K = 0L;
        this.f25816F = this.f25817G;
        this.f25813C = null;
        Handler handler = this.f25814D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f25814D = null;
        }
        this.f25822L = -9223372036854775807L;
        this.f25823M = 0;
        this.f25824N = -9223372036854775807L;
        this.f25840u.clear();
        C3606b c3606b = this.f25833n;
        c3606b.f11852a.clear();
        c3606b.f11853b.clear();
        c3606b.f11854c.clear();
        this.f25831l.release();
    }

    /* JADX INFO: renamed from: w */
    public final void m9327w() {
        boolean z10;
        C10745k c10745k = this.f25811A;
        C7759a c7759a = new C7759a();
        synchronized (C11019b.f34239b) {
            z10 = C11019b.f34240c;
        }
        if (z10) {
            c7759a.m9331a();
            return;
        }
        if (c10745k == null) {
            c10745k = new C10745k("SntpClient");
        }
        c10745k.m12821f(new C11019b.b(), new C11019b.a(c7759a), 1);
    }

    /* JADX INFO: renamed from: x */
    public final void m9328x(C10747m c10747m, long j10) {
        long j11 = c10747m.f33386a;
        C1477A c1477a = c10747m.f33389d;
        C6690u c6690u = new C6690u(c1477a.f4903c, c1477a.f4904d, j10, c1477a.f4902b);
        this.f25832m.getClass();
        this.f25836q.m7441c(c6690u, c10747m.f33388c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX INFO: renamed from: y */
    public final void m9329y(IOException iOException) {
        C0539y.m1072d("Failed to resolve time offset.", iOException);
        this.f25822L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        m9330z(true);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0260  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:146:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:180:0x0376  */
    /* JADX WARN: Code duplicated, block: B:181:0x037b  */
    /* JADX INFO: renamed from: z */
    public final void m9330z(boolean z10) {
        long j10;
        long j11;
        long j12;
        boolean z11;
        long j13;
        boolean z12;
        long j14;
        long j15;
        int i10;
        long jMin;
        long j16;
        float f10;
        long jM1002g0;
        long jM982T;
        long jMin2;
        long j17;
        long j18;
        int i11 = 0;
        while (true) {
            SparseArray<C7768b> sparseArray = this.f25840u;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i11);
            if (iKeyAt >= this.f25825O) {
                C7768b c7768bValueAt = sparseArray.valueAt(i11);
                C3810c c3810c = this.f25818H;
                int i12 = iKeyAt - this.f25825O;
                c7768bValueAt.f25893w = c3810c;
                c7768bValueAt.f25894x = i12;
                C7770d c7770d = c7768bValueAt.f25884n;
                c7770d.f25936i = false;
                c7770d.f25934g = c3810c;
                Iterator<Map.Entry<Long, Long>> it = c7770d.f25933f.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getKey().longValue() < c7770d.f25934g.f12424h) {
                        it.remove();
                    }
                }
                C8013h<InterfaceC7767a>[] c8013hArr = c7768bValueAt.f25890t;
                if (c8013hArr != null) {
                    for (C8013h<InterfaceC7767a> c8013h : c8013hArr) {
                        ((InterfaceC7767a) c8013h.f27612f).mo9333d(c3810c, i12);
                    }
                    c7768bValueAt.f25889s.mo5138a(c7768bValueAt);
                }
                c7768bValueAt.f25895y = c3810c.m4525b(i12).f12454d;
                for (C3614j c3614j : c7768bValueAt.f25891u) {
                    for (C3813f c3813f : c7768bValueAt.f25895y) {
                        if (c3813f.m4548a().equals(c3614j.f11864f.m4548a())) {
                            c3614j.m4360b(c3813f, c3810c.f12420d && i12 == c3810c.f12429m.size() - 1);
                            break;
                        }
                    }
                }
            }
            i11++;
        }
        C3814g c3814gM4525b = this.f25818H.m4525b(0);
        int size = this.f25818H.f12429m.size() - 1;
        C3814g c3814gM4525b2 = this.f25818H.m4525b(size);
        long jM4527d = this.f25818H.m4527d(size);
        long jM982T2 = C0513S.m982T(C0513S.m967E(this.f25822L));
        long jM4527d2 = this.f25818H.m4527d(0);
        long j19 = c3814gM4525b.f12452b;
        List<C3808a> list = c3814gM4525b.f12453c;
        long jM982T3 = C0513S.m982T(j19);
        boolean zM9324v = m9324v(c3814gM4525b);
        long jMax = jM982T3;
        int i13 = 0;
        while (true) {
            j10 = jM4527d;
            if (i13 >= list.size()) {
                j11 = 0;
                jM982T3 = jMax;
                break;
            }
            C3808a c3808a = list.get(i13);
            List<AbstractC3817j> list2 = c3808a.f12409c;
            int i14 = c3808a.f12408b;
            j11 = 0;
            boolean z13 = (i14 == 1 || i14 == 2) ? false : true;
            if ((!zM9324v || !z13) && !list2.isEmpty()) {
                InterfaceC3611g interfaceC3611gMo4551l = list2.get(0).mo4551l();
                if (interfaceC3611gMo4551l == null || interfaceC3611gMo4551l.mo4357j(jM4527d2, jM982T2) == 0) {
                    break;
                } else {
                    jMax = Math.max(jMax, interfaceC3611gMo4551l.mo4348a(interfaceC3611gMo4551l.mo4350c(jM4527d2, jM982T2)) + jM982T3);
                }
            }
            i13++;
            jM4527d = j10;
            jM4527d2 = jM4527d2;
        }
        long j20 = c3814gM4525b2.f12452b;
        List<C3808a> list3 = c3814gM4525b2.f12453c;
        long jM982T4 = C0513S.m982T(j20);
        boolean zM9324v2 = m9324v(c3814gM4525b2);
        long jMin3 = LongCompanionObject.MAX_VALUE;
        int i15 = 0;
        while (true) {
            if (i15 >= list3.size()) {
                j12 = jMin3;
                break;
            }
            C3808a c3808a2 = list3.get(i15);
            List<AbstractC3817j> list4 = c3808a2.f12409c;
            int i16 = c3808a2.f12408b;
            boolean z14 = (i16 == 1 || i16 == 2) ? false : true;
            if ((zM9324v2 && z14) || list4.isEmpty()) {
                j17 = jM982T4;
                j18 = j10;
            } else {
                InterfaceC3611g interfaceC3611gMo4551l2 = list4.get(0).mo4551l();
                if (interfaceC3611gMo4551l2 == null) {
                    j12 = jM982T4 + j10;
                    break;
                }
                j17 = jM982T4;
                j18 = j10;
                long jMo4357j = interfaceC3611gMo4551l2.mo4357j(j18, jM982T2);
                if (jMo4357j == j11) {
                    j12 = j17;
                    break;
                } else {
                    long jMo4350c = (interfaceC3611gMo4551l2.mo4350c(j18, jM982T2) + jMo4357j) - 1;
                    jMin3 = Math.min(jMin3, interfaceC3611gMo4551l2.mo4349b(jMo4350c, j18) + interfaceC3611gMo4551l2.mo4348a(jMo4350c) + j17);
                }
            }
            i15++;
            j10 = j18;
            zM9324v2 = zM9324v2;
            jM982T4 = j17;
        }
        if (!this.f25818H.f12420d) {
            z11 = false;
            break;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= list3.size()) {
                z11 = true;
                break;
            }
            InterfaceC3611g interfaceC3611gMo4551l3 = list3.get(i17).f12409c.get(0).mo4551l();
            if (interfaceC3611gMo4551l3 == null || interfaceC3611gMo4551l3.mo4355h()) {
                z11 = false;
                break;
            }
            i17++;
        }
        if (z11) {
            long j21 = this.f25818H.f12422f;
            if (j21 != -9223372036854775807L) {
                jM982T3 = Math.max(jM982T3, j12 - C0513S.m982T(j21));
            }
        }
        long j22 = j12 - jM982T3;
        C3810c c3810c2 = this.f25818H;
        if (c3810c2.f12420d) {
            C0515a.m1030f(c3810c2.f12417a != -9223372036854775807L);
            long jM982T5 = (jM982T2 - C0513S.m982T(this.f25818H.f12417a)) - jM982T3;
            C20711q.f fVar = mo7453e().f71091c;
            long jM1002g1 = C0513S.m1002g0(jM982T5);
            long j23 = fVar.f71125c;
            if (j23 != -9223372036854775807L) {
                jMin = Math.min(jM1002g1, j23);
            } else {
                C3819l c3819l = this.f25818H.f12426j;
                if (c3819l != null) {
                    long j24 = c3819l.f12493c;
                    if (j24 != -9223372036854775807L) {
                        jMin = Math.min(jM1002g1, j24);
                    } else {
                        jMin = jM1002g1;
                    }
                } else {
                    jMin = jM1002g1;
                }
            }
            long jM1002g2 = C0513S.m1002g0(jM982T5 - j22);
            if (jM1002g2 < j11 && jMin > j11) {
                jM1002g2 = j11;
            }
            j13 = -9223372036854775807L;
            long j25 = this.f25818H.f12419c;
            if (j25 != -9223372036854775807L) {
                jM1002g2 = Math.min(jM1002g2 + j25, jM1002g1);
            }
            long jM1005j = jM1002g2;
            long j26 = fVar.f71124b;
            if (j26 != -9223372036854775807L) {
                jM1005j = C0513S.m1005j(j26, jM1005j, jM1002g1);
            } else {
                C3819l c3819l2 = this.f25818H.f12426j;
                if (c3819l2 != null) {
                    long j27 = c3819l2.f12492b;
                    if (j27 != -9223372036854775807L) {
                        jM1005j = C0513S.m1005j(j27, jM1005j, jM1002g1);
                    }
                }
            }
            long j28 = jM1005j;
            long j29 = j28 > jMin ? j28 : jMin;
            long jM1005j2 = this.f25815E.f71123a;
            if (jM1005j2 == -9223372036854775807L) {
                C3810c c3810c3 = this.f25818H;
                C3819l c3819l3 = c3810c3.f12426j;
                if (c3819l3 != null) {
                    long j30 = c3819l3.f12491a;
                    if (j30 != -9223372036854775807L) {
                        jM1005j2 = j30;
                    } else {
                        jM1005j2 = c3810c3.f12423g;
                        if (jM1005j2 == -9223372036854775807L) {
                            jM1005j2 = this.f25834o;
                        }
                    }
                } else {
                    jM1005j2 = c3810c3.f12423g;
                    if (jM1005j2 == -9223372036854775807L) {
                        jM1005j2 = this.f25834o;
                    }
                }
            }
            if (jM1005j2 < j28) {
                jM1005j2 = j28;
            }
            long j31 = this.f25835p;
            if (jM1005j2 > j29) {
                jM1005j2 = C0513S.m1005j(C0513S.m1002g0(jM982T5 - Math.min(j31, j22 / 2)), j28, j29);
            }
            long j32 = j29;
            z12 = z11;
            float f11 = fVar.f71126d;
            if (f11 == -3.4028235E38f) {
                C3819l c3819l4 = this.f25818H.f12426j;
                f11 = c3819l4 != null ? c3819l4.f12494d : -3.4028235E38f;
            }
            float f12 = fVar.f71127e;
            if (f12 == -3.4028235E38f) {
                C3819l c3819l5 = this.f25818H.f12426j;
                f12 = c3819l5 != null ? c3819l5.f12495e : -3.4028235E38f;
            }
            if (f11 == -3.4028235E38f && f12 == -3.4028235E38f) {
                C3819l c3819l6 = this.f25818H.f12426j;
                j16 = jM982T5;
                if (c3819l6 == null || c3819l6.f12491a == -9223372036854775807L) {
                    f11 = 1.0f;
                    f10 = 1.0f;
                }
                C20711q.f.a aVar = new C20711q.f.a();
                aVar.f71128a = jM1005j2;
                aVar.f71129b = j28;
                aVar.f71130c = j32;
                aVar.f71131d = f11;
                aVar.f71132e = f10;
                this.f25815E = new C20711q.f(aVar);
                jM1002g0 = C0513S.m1002g0(jM982T3) + this.f25818H.f12417a;
                jM982T = j16 - C0513S.m982T(this.f25815E.f71123a);
                jMin2 = Math.min(j31, j22 / 2);
                if (jM982T < jMin2) {
                    j15 = jMin2;
                    j14 = jM1002g0;
                } else {
                    j14 = jM1002g0;
                    j15 = jM982T;
                }
            } else {
                j16 = jM982T5;
            }
            f10 = f12;
            C20711q.f.a aVar2 = new C20711q.f.a();
            aVar2.f71128a = jM1005j2;
            aVar2.f71129b = j28;
            aVar2.f71130c = j32;
            aVar2.f71131d = f11;
            aVar2.f71132e = f10;
            this.f25815E = new C20711q.f(aVar2);
            jM1002g0 = C0513S.m1002g0(jM982T3) + this.f25818H.f12417a;
            jM982T = j16 - C0513S.m982T(this.f25815E.f71123a);
            jMin2 = Math.min(j31, j22 / 2);
            if (jM982T < jMin2) {
                j15 = jMin2;
                j14 = jM1002g0;
            } else {
                j14 = jM1002g0;
                j15 = jM982T;
            }
        } else {
            j13 = -9223372036854775807L;
            z12 = z11;
            j14 = -9223372036854775807L;
            j15 = j11;
        }
        long jM982T6 = jM982T3 - C0513S.m982T(c3814gM4525b.f12452b);
        C3810c c3810c4 = this.f25818H;
        m7526t(new C7760b(c3810c4.f12417a, j14, this.f25822L, this.f25825O, jM982T6, j22, j15, c3810c4, mo7453e(), this.f25818H.f12420d ? this.f25815E : null));
        if (this.f25827h) {
            return;
        }
        Handler handler = this.f25814D;
        RunnableC3610f runnableC3610f = this.f25842w;
        handler.removeCallbacks(runnableC3610f);
        if (z12) {
            Handler handler2 = this.f25814D;
            C3810c c3810c5 = this.f25818H;
            long jM967E = C0513S.m967E(this.f25822L);
            int size2 = c3810c5.f12429m.size() - 1;
            C3814g c3814gM4525b3 = c3810c5.m4525b(size2);
            long j33 = c3814gM4525b3.f12452b;
            List<C3808a> list5 = c3814gM4525b3.f12453c;
            long jM982T7 = C0513S.m982T(j33);
            long jM4527d3 = c3810c5.m4527d(size2);
            long jM982T8 = C0513S.m982T(jM967E);
            long jM982T9 = C0513S.m982T(c3810c5.f12417a);
            long jM982T10 = C0513S.m982T(c3810c5.f12421e);
            if (jM982T10 == j13 || jM982T10 >= 5000000) {
                jM982T10 = 5000000;
            }
            int i18 = 0;
            while (i18 < list5.size()) {
                List<AbstractC3817j> list6 = list5.get(i18).f12409c;
                if (list6.isEmpty()) {
                    i10 = i18;
                } else {
                    i10 = i18;
                    InterfaceC3611g interfaceC3611gMo4551l4 = list6.get(0).mo4551l();
                    if (interfaceC3611gMo4551l4 != null) {
                        long jMo4351d = (interfaceC3611gMo4551l4.mo4351d(jM4527d3, jM982T8) + (jM982T9 + jM982T7)) - jM982T8;
                        if (jMo4351d > j11 && (jMo4351d < jM982T10 - 100000 || (jMo4351d > jM982T10 && jMo4351d < jM982T10 + 100000))) {
                            jM982T10 = jMo4351d;
                        }
                    }
                }
                i18 = i10 + 1;
            }
            handler2.postDelayed(runnableC3610f, C3272e.m3975b(jM982T10, 1000L, RoundingMode.CEILING));
        }
        if (this.f25819I) {
            m9326B();
            return;
        }
        if (z10) {
            C3810c c3810c6 = this.f25818H;
            if (c3810c6.f12420d) {
                long j34 = c3810c6.f12421e;
                if (j34 != j13) {
                    if (j34 == j11) {
                        j34 = 5000;
                    }
                    this.f25814D.postDelayed(this.f25841v, Math.max(j11, (this.f25820J + j34) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.DashMediaSource$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class C7765g implements C10745k.a<C10747m<Long>> {
        public C7765g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: l */
        public final void mo5150l(C10745k.d dVar, long j10, long j11) {
            C10747m c10747m = (C10747m) dVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long j12 = c10747m.f33386a;
            C1477A c1477a = c10747m.f33389d;
            C6690u c6690u = new C6690u(c1477a.f4903c, c1477a.f4904d, j11, c1477a.f4902b);
            dashMediaSource.f25832m.getClass();
            dashMediaSource.f25836q.m7442d(c6690u, c10747m.f33388c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            dashMediaSource.f25822L = ((Long) c10747m.f33391f).longValue() - j10;
            dashMediaSource.m9330z(true);
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: n */
        public final C10745k.b mo5152n(C10745k.d dVar, long j10, long j11, IOException iOException, int i10) {
            C10747m c10747m = (C10747m) dVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            InterfaceC6640H.a aVar = dashMediaSource.f25836q;
            long j12 = c10747m.f33386a;
            C1477A c1477a = c10747m.f33389d;
            aVar.m7444f(new C6690u(c1477a.f4903c, c1477a.f4904d, j11, c1477a.f4902b), c10747m.f33388c, iOException, true);
            dashMediaSource.f25832m.getClass();
            dashMediaSource.m9329y(iOException);
            return C10745k.f33368e;
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: o */
        public final void mo5153o(C10745k.d dVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.m9328x((C10747m) dVar, j11);
        }

        @Override // p535e3.C10745k.a
        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void mo5148j(C10745k.d dVar, long j10, long j11, int i10) {
        }
    }
}
