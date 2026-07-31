package p064D9;

import java.util.Map;
import p118G9.C1747c;
import p154I9.C2294H;
import p154I9.C2302P;
import p154I9.C2327m;
import p154I9.C2336v;
import p154I9.InterfaceC2334t;
import p280P9.C4188M;
import p280P9.C4189a;
import p280P9.C4197i;
import p370U9.C5393a;
import p478aa.C7081W0;
import p478aa.C7083X0;
import p783s9.C18108j;
import p783s9.InterfaceC18107i;

/* JADX INFO: renamed from: D9.f */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1084f implements InterfaceC2334t {

    /* JADX INFO: renamed from: a */
    public final C2294H f3940a = new C2294H(null);

    /* JADX INFO: renamed from: b */
    public C2336v f3941b = C2336v.f7604b;

    /* JADX INFO: renamed from: c */
    public final C2327m f3942c = new C2327m(true);

    /* JADX INFO: renamed from: d */
    public Object f3943d = C1747c.f5879a;

    /* JADX INFO: renamed from: e */
    public C7081W0 f3944e = C7083X0.m8017a();

    /* JADX INFO: renamed from: f */
    public final C4197i f3945f = new C4197i();

    @Override // p154I9.InterfaceC2334t
    /* JADX INFO: renamed from: a */
    public final C2327m mo1722a() {
        return this.f3942c;
    }

    /* JADX INFO: renamed from: b */
    public final void m1723b(C5393a c5393a) {
        C4197i c4197i = this.f3945f;
        if (c5393a != null) {
            c4197i.mo4909b(C1090l.f3973a, c5393a);
        } else {
            c4197i.mo4914g(C1090l.f3973a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final <T> void m1724c(InterfaceC18107i<T> interfaceC18107i, T t10) {
        ((Map) this.f3945f.mo4910c(C18108j.f56400a, new C1083e(0))).put(interfaceC18107i, t10);
    }

    /* JADX INFO: renamed from: d */
    public final void m1725d(C1084f c1084f) {
        this.f3941b = c1084f.f3941b;
        this.f3943d = c1084f.f3943d;
        C4197i c4197i = c1084f.f3945f;
        m1723b((C5393a) c4197i.mo4913f(C1090l.f3973a));
        C2294H c2294h = c1084f.f3940a;
        C2294H c2294h2 = this.f3940a;
        C2302P.m2979b(c2294h2, c2294h);
        c2294h2.f7533h = c2294h2.f7533h;
        C4188M.m4905a(this.f3942c, c1084f.f3942c);
        for (C4189a c4189a : c4197i.mo4912e()) {
            this.f3945f.mo4909b(c4189a, c4197i.mo4908a(c4189a));
        }
    }
}
