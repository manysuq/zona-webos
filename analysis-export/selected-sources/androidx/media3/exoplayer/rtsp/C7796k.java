package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import p039C2.C0513S;
import p039C2.C0515a;
import p093F2.C1480D;
import p093F2.C1493m;
import p093F2.InterfaceC1479C;
import p224M7.C3512b;
import p450Z.C6619b;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.k */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7796k implements InterfaceC7786a {

    /* JADX INFO: renamed from: a */
    public final C1480D f26263a = new C1480D(C3512b.m4290b(8000));

    /* JADX INFO: renamed from: b */
    public C7796k f26264b;

    @Override // p093F2.InterfaceC1489i
    /* JADX INFO: renamed from: a */
    public final long mo2049a(C1493m c1493m) throws C1480D.a {
        this.f26263a.mo2049a(c1493m);
        return -1L;
    }

    @Override // p093F2.InterfaceC1489i
    public final void addTransferListener(InterfaceC1479C interfaceC1479C) {
        this.f26263a.addTransferListener(interfaceC1479C);
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a
    /* JADX INFO: renamed from: c */
    public final String mo9475c() {
        int iMo9476d = mo9476d();
        C0515a.m1030f(iMo9476d != -1);
        String str = C0513S.f2002a;
        Locale locale = Locale.US;
        return C6619b.m7416a(iMo9476d, iMo9476d + 1, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // p093F2.InterfaceC1489i
    public final void close() {
        this.f26263a.close();
        C7796k c7796k = this.f26264b;
        if (c7796k != null) {
            c7796k.close();
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a
    /* JADX INFO: renamed from: d */
    public final int mo9476d() {
        DatagramSocket datagramSocket = this.f26263a.f4913e;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // p093F2.InterfaceC1489i
    public final Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // p093F2.InterfaceC1489i
    public final Uri getUri() {
        return this.f26263a.f4912d;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a
    /* JADX INFO: renamed from: j */
    public final boolean mo9477j() {
        return true;
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a
    /* JADX INFO: renamed from: m */
    public final C7792g.a mo9478m() {
        return null;
    }

    @Override // p884z2.InterfaceC20703i
    public final int read(byte[] bArr, int i10, int i11) throws C1480D.a {
        try {
            return this.f26263a.read(bArr, i10, i11);
        } catch (C1480D.a e10) {
            if (e10.f4941b == 2002) {
                return -1;
            }
            throw e10;
        }
    }
}
