package androidx.media3.exoplayer.rtsp;

import android.os.Handler;
import androidx.media3.exoplayer.rtsp.C7791f;
import androidx.media3.exoplayer.rtsp.C7792g;
import androidx.media3.exoplayer.rtsp.InterfaceC7786a;
import p039C2.C0513S;
import p093F2.C1492l;
import p417X2.C6191c;
import p417X2.C6201m;
import p417X2.C6203o;
import p535e3.C10745k;
import p601i3.C12004F;
import p601i3.C12024j;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7787b implements C10745k.d {

    /* JADX INFO: renamed from: a */
    public final int f26147a;

    /* JADX INFO: renamed from: b */
    public final C6203o f26148b;

    /* JADX INFO: renamed from: c */
    public final C6201m f26149c;

    /* JADX INFO: renamed from: d */
    public final C7791f.a f26150d;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7786a.a f26152f;

    /* JADX INFO: renamed from: g */
    public InterfaceC7786a f26153g;

    /* JADX INFO: renamed from: h */
    public C6191c f26154h;

    /* JADX INFO: renamed from: i */
    public C12024j f26155i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f26156j;

    /* JADX INFO: renamed from: l */
    public volatile long f26158l;

    /* JADX INFO: renamed from: e */
    public final Handler f26151e = C0513S.m1011p(null);

    /* JADX INFO: renamed from: k */
    public volatile long f26157k = -9223372036854775807L;

    public C7787b(int i10, C6203o c6203o, C6201m c6201m, C7791f.a aVar, InterfaceC7786a.a aVar2) {
        this.f26147a = i10;
        this.f26148b = c6203o;
        this.f26149c = c6201m;
        this.f26150d = aVar;
        this.f26152f = aVar2;
    }

    @Override // p535e3.C10745k.d
    /* JADX INFO: renamed from: a */
    public final void mo5122a() {
        if (this.f26156j) {
            this.f26156j = false;
        }
        try {
            if (this.f26153g == null) {
                InterfaceC7786a interfaceC7786aMo9479a = this.f26152f.mo9479a(this.f26147a);
                this.f26153g = interfaceC7786aMo9479a;
                final String strMo9475c = interfaceC7786aMo9479a.mo9475c();
                final InterfaceC7786a interfaceC7786a = this.f26153g;
                this.f26151e.post(new Runnable() { // from class: X2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7791f.c cVar = this.f20272b.f26149c.f20322a;
                        C7791f c7791f = C7791f.this;
                        cVar.f26220c = strMo9475c;
                        InterfaceC7786a interfaceC7786a2 = interfaceC7786a;
                        C7792g.a aVarMo9478m = interfaceC7786a2.mo9478m();
                        if (aVarMo9478m != null) {
                            c7791f.f26196e.f26171j.f26233d.put(Integer.valueOf(interfaceC7786a2.mo9476d()), aVarMo9478m);
                            c7791f.f26214w = true;
                        }
                        c7791f.m9500i();
                    }
                });
                InterfaceC7786a interfaceC7786a2 = this.f26153g;
                interfaceC7786a2.getClass();
                this.f26155i = new C12024j(interfaceC7786a2, 0L, -1L);
                C6191c c6191c = new C6191c(this.f26148b.f20323a, this.f26147a);
                this.f26154h = c6191c;
                c6191c.mo93c(this.f26150d);
            }
            while (!this.f26156j) {
                if (this.f26157k != -9223372036854775807L) {
                    C6191c c6191c2 = this.f26154h;
                    c6191c2.getClass();
                    c6191c2.seek(this.f26158l, this.f26157k);
                    this.f26157k = -9223372036854775807L;
                }
                C6191c c6191c3 = this.f26154h;
                c6191c3.getClass();
                C12024j c12024j = this.f26155i;
                c12024j.getClass();
                if (c6191c3.mo96f(c12024j, new C12004F()) == -1) {
                    break;
                }
            }
            this.f26156j = false;
        } finally {
            InterfaceC7786a interfaceC7786a3 = this.f26153g;
            interfaceC7786a3.getClass();
            if (interfaceC7786a3.mo9477j()) {
                C1492l.m2056a(this.f26153g);
                this.f26153g = null;
            }
        }
    }

    @Override // p535e3.C10745k.d
    /* JADX INFO: renamed from: b */
    public final void mo5123b() {
        this.f26156j = true;
    }
}
