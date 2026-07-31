package androidx.media3.exoplayer.rtsp;

import java.io.IOException;
import p093F2.C1492l;
import p417X2.C6196h;

/* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.l */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7797l implements InterfaceC7786a.a {
    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a.a
    /* JADX INFO: renamed from: a */
    public final InterfaceC7786a mo9479a(int i10) throws IOException {
        C7796k c7796k = new C7796k();
        C7796k c7796k2 = new C7796k();
        try {
            c7796k.f26263a.mo2049a(C6196h.m7010a(0));
            int iMo9476d = c7796k.mo9476d();
            boolean z10 = iMo9476d % 2 == 0;
            c7796k2.f26263a.mo2049a(C6196h.m7010a(z10 ? iMo9476d + 1 : iMo9476d - 1));
            if (z10) {
                c7796k.f26264b = c7796k2;
                return c7796k;
            }
            c7796k2.f26264b = c7796k;
            return c7796k2;
        } catch (IOException e10) {
            C1492l.m2056a(c7796k);
            C1492l.m2056a(c7796k2);
            throw e10;
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.InterfaceC7786a.a
    /* JADX INFO: renamed from: b */
    public final InterfaceC7786a.a mo9480b() {
        return new C7795j();
    }
}
