package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import p039C2.C0513S;
import p093F2.InterfaceC1479C;
import p094F3.C1514h;
import p152I7.C2268b;
import p417X2.C6202n;
import p453Z2.AbstractC6658a;
import p453Z2.C6663c0;
import p453Z2.InterfaceC6641I;
import p453Z2.InterfaceC6694y;
import p453Z2.InterfaceC6695z;
import p535e3.C10739e;
import p884z2.AbstractC20686A;
import p884z2.C20711q;
import p884z2.C20712r;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class RtspMediaSource extends AbstractC6658a {

    /* JADX INFO: renamed from: h */
    public final InterfaceC7786a.a f26136h;

    /* JADX INFO: renamed from: i */
    public final String f26137i = "AndroidXMedia3/1.8.0";

    /* JADX INFO: renamed from: j */
    public final Uri f26138j;

    /* JADX INFO: renamed from: k */
    public final SocketFactory f26139k;

    /* JADX INFO: renamed from: l */
    public long f26140l;

    /* JADX INFO: renamed from: m */
    public boolean f26141m;

    /* JADX INFO: renamed from: n */
    public boolean f26142n;

    /* JADX INFO: renamed from: o */
    public boolean f26143o;

    /* JADX INFO: renamed from: p */
    public C20711q f26144p;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.RtspMediaSource$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class C7783a {
        public C7783a() {
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.RtspMediaSource$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class C7784b extends IOException {
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.RtspMediaSource$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class C7785c extends C7784b {
    }

    static {
        C20712r.m25314a("media3.exoplayer.rtsp");
    }

    public RtspMediaSource(C20711q c20711q, InterfaceC7786a.a aVar, SocketFactory socketFactory) {
        this.f26144p = c20711q;
        this.f26136h = aVar;
        C20711q.g gVar = c20711q.f71090b;
        gVar.getClass();
        Uri uri = gVar.f71133a;
        String scheme = uri.getScheme();
        if (scheme != null && C2268b.m2936a("rtspt", scheme)) {
            uri = Uri.parse("rtsp" + uri.toString().substring(5));
        }
        this.f26138j = uri;
        this.f26139k = socketFactory;
        this.f26140l = -9223372036854775807L;
        this.f26143o = true;
    }

    @Override // p453Z2.AbstractC6658a, p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7452c(C20711q c20711q) {
        this.f26144p = c20711q;
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: e */
    public final synchronized C20711q mo7453e() {
        return this.f26144p;
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: f */
    public final InterfaceC6694y mo7454f(InterfaceC6695z.b bVar, C10739e c10739e, long j10) {
        return new C7791f(c10739e, this.f26136h, this.f26138j, new C7783a(), this.f26137i, this.f26139k);
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: i */
    public final void mo7455i(InterfaceC6694y interfaceC6694y) {
        C7791f c7791f = (C7791f) interfaceC6694y;
        ArrayList arrayList = c7791f.f26197f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C7791f.d dVar = (C7791f.d) arrayList.get(i10);
            if (!dVar.f26226e) {
                dVar.f26223b.m12820e(null);
                dVar.f26224c.m7488D();
                dVar.f26226e = true;
            }
        }
        C0513S.m1001g(c7791f.f26196e);
        c7791f.f26210s = true;
    }

    @Override // p453Z2.AbstractC6658a
    /* JADX INFO: renamed from: s */
    public final void mo7457s(InterfaceC1479C interfaceC1479C) {
        m9474v();
    }

    /* JADX INFO: renamed from: v */
    public final void m9474v() {
        AbstractC20686A c6663c0 = new C6663c0(this.f26140l, this.f26141m, this.f26142n, mo7453e());
        if (this.f26143o) {
            c6663c0 = new C6202n(c6663c0);
        }
        m7526t(c6663c0);
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class Factory implements InterfaceC6641I {

        /* JADX INFO: renamed from: a */
        public final SocketFactory f26145a = SocketFactory.getDefault();

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6695z mo7475a(C20711q c20711q) {
            c20711q.f71090b.getClass();
            C20711q.g gVar = c20711q.f71090b;
            gVar.getClass();
            String scheme = gVar.f71133a.getScheme();
            return new RtspMediaSource(c20711q, (scheme == null || !C2268b.m2936a("rtspt", scheme)) ? new C7797l() : new C7795j(), this.f26145a);
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: d */
        public final InterfaceC6695z.a mo7478d() {
            return this;
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC6695z.a mo7476b(C1514h c1514h) {
            return this;
        }

        @Override // p453Z2.InterfaceC6695z.a
        /* JADX INFO: renamed from: c */
        public final InterfaceC6695z.a mo7477c(boolean z10) {
            return this;
        }
    }

    @Override // p453Z2.InterfaceC6695z
    /* JADX INFO: renamed from: l */
    public final void mo7456l() {
    }

    @Override // p453Z2.AbstractC6658a
    /* JADX INFO: renamed from: u */
    public final void mo7458u() {
    }
}
