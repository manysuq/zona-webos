package androidx.media3.exoplayer;

import p242N7.C3652q;
import p242N7.InterfaceC3645j;

/* JADX INFO: renamed from: androidx.media3.exoplayer.k */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7778k implements InterfaceC3645j<C7779l.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3652q f26099a;

    public C7778k(C3652q c3652q) {
        this.f26099a = c3652q;
    }

    @Override // p242N7.InterfaceC3645j
    public final void onFailure(Throwable th) {
        this.f26099a.m4383m(th);
    }

    @Override // p242N7.InterfaceC3645j
    public final void onSuccess(C7779l.a aVar) {
        this.f26099a.m4405n(aVar.f26108b);
    }
}
