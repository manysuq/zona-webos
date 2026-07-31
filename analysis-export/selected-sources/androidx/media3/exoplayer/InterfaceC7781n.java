package androidx.media3.exoplayer;

import p039C2.InterfaceC0522h;
import p183K2.C2741P0;
import p183K2.InterfaceC2789p0;
import p201L2.C3193c0;
import p453Z2.InterfaceC6657Z;
import p453Z2.InterfaceC6695z;
import p884z2.AbstractC20686A;
import p884z2.C20708n;

/* JADX INFO: renamed from: androidx.media3.exoplayer.n */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7781n extends C7780m.b {

    /* JADX INFO: renamed from: androidx.media3.exoplayer.n$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo9434a();

        /* JADX INFO: renamed from: b */
        void mo9435b();
    }

    void disable();

    /* JADX INFO: renamed from: f */
    void mo5544f(long j10, long j11);

    /* JADX INFO: renamed from: g */
    boolean mo9226g();

    String getName();

    int getState();

    /* JADX INFO: renamed from: h */
    void mo9227h();

    /* JADX INFO: renamed from: i */
    void mo9228i();

    boolean isEnded();

    boolean isReady();

    /* JADX INFO: renamed from: j */
    void mo9229j(AbstractC20686A abstractC20686A);

    /* JADX INFO: renamed from: k */
    void mo9230k();

    /* JADX INFO: renamed from: l */
    boolean mo9231l();

    /* JADX INFO: renamed from: m */
    int mo9232m();

    /* JADX INFO: renamed from: n */
    void mo9233n(int i10, C3193c0 c3193c0, InterfaceC0522h interfaceC0522h);

    /* JADX INFO: renamed from: o */
    void mo9234o(C2741P0 c2741p0, C20708n[] c20708nArr, InterfaceC6657Z interfaceC6657Z, boolean z10, boolean z11, long j10, long j11, InterfaceC6695z.b bVar);

    /* JADX INFO: renamed from: p */
    long mo5954p(long j10, long j11);

    /* JADX INFO: renamed from: q */
    void mo9235q(C20708n[] c20708nArr, InterfaceC6657Z interfaceC6657Z, long j10, long j11, InterfaceC6695z.b bVar);

    /* JADX INFO: renamed from: r */
    AbstractC7756b mo9236r();

    void release();

    void reset();

    /* JADX INFO: renamed from: s */
    void mo5957s(float f10, float f11);

    void start();

    void stop();

    /* JADX INFO: renamed from: t */
    InterfaceC6657Z mo9237t();

    /* JADX INFO: renamed from: u */
    long mo9238u();

    /* JADX INFO: renamed from: v */
    void mo9239v(long j10);

    /* JADX INFO: renamed from: w */
    InterfaceC2789p0 mo4240w();
}
