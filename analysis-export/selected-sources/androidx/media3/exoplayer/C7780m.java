package androidx.media3.exoplayer;

import android.os.Looper;
import p039C2.C0505J;
import p039C2.C0515a;
import p039C2.C0539y;
import p884z2.AbstractC20686A;

/* JADX INFO: renamed from: androidx.media3.exoplayer.m */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7780m {

    /* JADX INFO: renamed from: a */
    public final b f26130a;

    /* JADX INFO: renamed from: b */
    public final a f26131b;

    /* JADX INFO: renamed from: c */
    public int f26132c;

    /* JADX INFO: renamed from: d */
    public Object f26133d;

    /* JADX INFO: renamed from: e */
    public final Looper f26134e;

    /* JADX INFO: renamed from: f */
    public boolean f26135f;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.m$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface a {
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.m$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface b {
        void handleMessage(int i10, Object obj);
    }

    public C7780m(a aVar, b bVar, AbstractC20686A abstractC20686A, int i10, C0505J c0505j, Looper looper) {
        this.f26131b = aVar;
        this.f26130a = bVar;
        this.f26134e = looper;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9472a(boolean z10) {
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public final void m9473b() {
        C0515a.m1030f(!this.f26135f);
        this.f26135f = true;
        C7771e c7771e = (C7771e) this.f26131b;
        if (!c7771e.f25955J && c7771e.f25987k.getThread().isAlive()) {
            c7771e.f25985i.mo934f(14, this).m942b();
        } else {
            C0539y.m1074f("Ignoring messages sent after release.");
            m9472a(false);
        }
    }
}
