package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p039C2.C0513S;
import p039C2.C0515a;
import p093F2.AbstractC1482b;
import p093F2.C1493m;
import p450Z.C6619b;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7794i extends AbstractC1482b implements InterfaceC7786a, C7792g.a {

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue<byte[]> f26259a;

    /* JADX INFO: renamed from: b */
    public final long f26260b;

    /* JADX INFO: renamed from: c */
    public byte[] f26261c;

    /* JADX INFO: renamed from: d */
    public int f26262d;

    public C7794i() {
        super(true);
        this.f26260b = 8000L;
        this.f26259a = new LinkedBlockingQueue<>();
        this.f26261c = new byte[0];
        this.f26262d = -1;
    }

    @Override // p093F2.InterfaceC1489i
    /* JADX INFO: renamed from: a */
    public final long mo2049a(C1493m c1493m) {
        this.f26262d = c1493m.f4947a.getPort();
        return -1L;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a
    /* JADX INFO: renamed from: c */
    public final String mo9475c() {
        C0515a.m1030f(this.f26262d != -1);
        int i10 = this.f26262d;
        int i11 = this.f26262d + 1;
        String str = C0513S.f2002a;
        Locale locale = Locale.US;
        return C6619b.m7416a(i10, i11, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a
    /* JADX INFO: renamed from: d */
    public final int mo9476d() {
        return this.f26262d;
    }

    @Override // p093F2.InterfaceC1489i
    public final Uri getUri() {
        return null;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a
    /* JADX INFO: renamed from: j */
    public final boolean mo9477j() {
        return false;
    }

    @Override // androidx.media3.exoplayer.rtsp.C7792g.a
    /* JADX INFO: renamed from: k */
    public final void mo9507k(byte[] bArr) {
        this.f26259a.add(bArr);
    }

    @Override // p884z2.InterfaceC20703i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.f26261c.length);
        System.arraycopy(this.f26261c, 0, bArr, i10, iMin);
        byte[] bArr2 = this.f26261c;
        this.f26261c = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i11) {
            return iMin;
        }
        try {
            byte[] bArrPoll = this.f26259a.poll(this.f26260b, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(i11 - iMin, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i10 + iMin, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.f26261c = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // p093F2.InterfaceC1489i
    public final void close() {
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a
    /* JADX INFO: renamed from: m */
    public final C7792g.a mo9478m() {
        return this;
    }
}
