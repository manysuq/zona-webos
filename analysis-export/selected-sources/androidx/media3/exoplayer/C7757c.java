package androidx.media3.exoplayer;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Iterator;
import p039C2.C0513S;
import p039C2.C0515a;
import p039C2.C0539y;
import p201L2.C3193c0;
import p517d3.InterfaceC10325q;
import p535e3.C10739e;

/* JADX INFO: renamed from: androidx.media3.exoplayer.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7757c implements InterfaceC7772f {

    /* JADX INFO: renamed from: a */
    public final C10739e f25731a;

    /* JADX INFO: renamed from: b */
    public final long f25732b;

    /* JADX INFO: renamed from: c */
    public final long f25733c;

    /* JADX INFO: renamed from: d */
    public final long f25734d;

    /* JADX INFO: renamed from: e */
    public final long f25735e;

    /* JADX INFO: renamed from: f */
    public final int f25736f;

    /* JADX INFO: renamed from: g */
    public final long f25737g;

    /* JADX INFO: renamed from: h */
    public final HashMap<C3193c0, a> f25738h;

    /* JADX INFO: renamed from: i */
    public long f25739i;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.c$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f25740a;

        /* JADX INFO: renamed from: b */
        public int f25741b;
    }

    public C7757c(C10739e c10739e, int i10, int i11, int i12, int i13) {
        m9241k(i12, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        m9241k(i13, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        m9241k(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        m9241k(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m9241k(i11, i10, "maxBufferMs", "minBufferMs");
        m9241k(0, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.f25731a = c10739e;
        this.f25732b = C0513S.m982T(i10);
        this.f25733c = C0513S.m982T(i11);
        this.f25734d = C0513S.m982T(i12);
        this.f25735e = C0513S.m982T(i13);
        this.f25736f = -1;
        this.f25737g = C0513S.m982T(0);
        this.f25738h = new HashMap<>();
        this.f25739i = -1L;
    }

    /* JADX INFO: renamed from: k */
    public static void m9241k(int i10, int i11, String str, String str2) {
        C0515a.m1026b(i10 >= i11, str + " cannot be less than " + str2);
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: a */
    public final boolean mo9242a(InterfaceC7772f.a aVar) {
        int i10;
        long jM969G = C0513S.m969G(aVar.f26024c, aVar.f26023b);
        long jMin = aVar.f26025d ? this.f25735e : this.f25734d;
        long j10 = aVar.f26026e;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jM969G >= jMin) {
            return true;
        }
        C10739e c10739e = this.f25731a;
        synchronized (c10739e) {
            i10 = c10739e.f33333d * c10739e.f33331b;
        }
        return i10 >= m9252l();
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: b */
    public final boolean mo9243b() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: c */
    public final void mo9244c(InterfaceC7772f.a aVar, InterfaceC10325q[] interfaceC10325qArr) {
        a aVar2 = this.f25738h.get(aVar.f26022a);
        aVar2.getClass();
        int iMax = this.f25736f;
        if (iMax == -1) {
            int length = interfaceC10325qArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    InterfaceC10325q interfaceC10325q = interfaceC10325qArr[i10];
                    if (interfaceC10325q != null) {
                        switch (interfaceC10325q.mo7450m().f70889c) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            case 1:
                                i11 += i12;
                                break;
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            case 4:
                                i12 = 26214400;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        aVar2.f25741b = iMax;
        m9253m();
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: d */
    public final long mo9245d() {
        return this.f25737g;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: e */
    public final void mo9246e(C3193c0 c3193c0) {
        HashMap<C3193c0, a> map = this.f25738h;
        if (map.remove(c3193c0) != null) {
            m9253m();
        }
        if (map.isEmpty()) {
            this.f25739i = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: f */
    public final C10739e mo9247f() {
        return this.f25731a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: g */
    public final boolean mo9248g(InterfaceC7772f.a aVar) {
        int i10;
        long j10 = this.f25733c;
        a aVar2 = this.f25738h.get(aVar.f26022a);
        aVar2.getClass();
        C10739e c10739e = this.f25731a;
        synchronized (c10739e) {
            i10 = c10739e.f33333d * c10739e.f33331b;
        }
        boolean z10 = i10 >= m9252l();
        long jMin = this.f25732b;
        float f10 = aVar.f26024c;
        if (f10 > 1.0f) {
            jMin = Math.min(C0513S.m966D(f10, jMin), j10);
        }
        long jMax = Math.max(jMin, 500000L);
        long j11 = aVar.f26023b;
        if (j11 < jMax) {
            aVar2.f25740a = !z10;
            if (z10 && j11 < 500000) {
                C0539y.m1074f("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || z10) {
            aVar2.f25740a = false;
        }
        return aVar2.f25740a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: h */
    public final boolean mo9249h() {
        Iterator<a> it = this.f25738h.values().iterator();
        while (it.hasNext()) {
            if (it.next().f25740a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: i */
    public final void mo9250i(C3193c0 c3193c0) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f25739i;
        C0515a.m1029e("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        this.f25739i = id2;
        HashMap<C3193c0, a> map = this.f25738h;
        if (!map.containsKey(c3193c0)) {
            map.put(c3193c0, new a());
        }
        a aVar = map.get(c3193c0);
        aVar.getClass();
        int i10 = this.f25736f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        aVar.f25741b = i10;
        aVar.f25740a = false;
    }

    @Override // androidx.media3.exoplayer.InterfaceC7772f
    /* JADX INFO: renamed from: j */
    public final void mo9251j(C3193c0 c3193c0) {
        if (this.f25738h.remove(c3193c0) != null) {
            m9253m();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m9252l() {
        Iterator<a> it = this.f25738h.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f25741b;
        }
        return i10;
    }

    /* JADX INFO: renamed from: m */
    public final void m9253m() {
        if (!this.f25738h.isEmpty()) {
            this.f25731a.m12809a(m9252l());
            return;
        }
        C10739e c10739e = this.f25731a;
        synchronized (c10739e) {
            if (c10739e.f33330a) {
                c10739e.m12809a(0);
            }
        }
    }
}
