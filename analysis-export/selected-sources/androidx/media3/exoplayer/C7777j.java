package androidx.media3.exoplayer;

import p242N7.C3652q;
import p242N7.InterfaceC3645j;

/* JADX INFO: renamed from: androidx.media3.exoplayer.j */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7777j implements InterfaceC3645j<C7779l.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3652q f26098a;

    public C7777j(C3652q c3652q) {
        this.f26098a = c3652q;
    }

    @Override // p242N7.InterfaceC3645j
    public final void onFailure(Throwable th) {
        this.f26098a.m4383m(th);
    }

    @Override // p242N7.InterfaceC3645j
    public final void onSuccess(C7779l.a aVar) {
        this.f26098a.m4405n(aVar.f26107a);
    }
}
