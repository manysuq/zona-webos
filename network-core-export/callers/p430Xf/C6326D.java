package p430Xf;

import ag.C7346m;
import ag.C7352s;
import ag.C7354u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import p086Ed.InterfaceC1382b;
import p114G5.AbstractC1714b;
import p114G5.C1724l;
import p186K5.C2875g;
import p288Q.C4411o;
import p357Te.C5045b;
import p375Ue.C5436c;
import p446Yd.InterfaceC6570b;
import p448Yf.C6596b;
import p466Zf.C6832i;
import p466Zf.C6836m;
import p466Zf.C6842s;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p770rf.InterfaceC17978p;
import p775s0.C18037u;
import p845wg.C19119E6;
import p845wg.C19140H5;

/* JADX INFO: renamed from: Xf.D */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C6326D {
    /* JADX INFO: renamed from: a */
    public static final void m7121a(final InterfaceC1382b interfaceC1382b, final InterfaceC17978p interfaceC17978p, final InterfaceC6570b interfaceC6570b, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1668290845);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1382b) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(interfaceC17978p) ? 32 : 16) | (c15688rMo18372i.mo18362N(interfaceC6570b) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            C2875g.m3576a(interfaceC1382b.mo1947a(), null, C18037u.m20404c(855682976, new Function3() { // from class: Xf.v
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v17, types: [Ld.a, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    ((Integer) obj3).getClass();
                    final InterfaceC1382b.a aVar = (InterfaceC1382b.a) ((AbstractC1714b.a) obj).f5802b;
                    if (aVar instanceof InterfaceC1382b.a.d) {
                        interfaceC15676n2.mo18363O(1020734652);
                        C6346q.m7126d(((InterfaceC1382b.a.d) aVar).f4693a, interfaceC6570b, interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.c) {
                        interfaceC15676n2.mo18363O(1020953388);
                        C6596b.m7406a(C18037u.m20404c(1223766532, new Function2() { // from class: Xf.x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C7346m.m8158a(((InterfaceC1382b.a.c) aVar).f4692a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.g) {
                        interfaceC15676n2.mo18363O(1021196862);
                        final InterfaceC17978p interfaceC17978p2 = interfaceC17978p;
                        C6596b.m7406a(C18037u.m20404c(240773155, new Function2() { // from class: Xf.y
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C6836m.m7721a(((InterfaceC1382b.a.g) aVar).f4696a, interfaceC17978p2, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.f) {
                        interfaceC15676n2.mo18363O(1021478807);
                        C6596b.m7406a(C18037u.m20404c(-742220222, new Function2() { // from class: Xf.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C6842s.m7722a(((InterfaceC1382b.a.f) aVar).f4695a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.C20987a) {
                        interfaceC15676n2.mo18363O(1021680741);
                        C6596b.m7406a(C18037u.m20404c(-1725213599, new Function2() { // from class: Xf.A
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C6832i.m7718a(((InterfaceC1382b.a.C20987a) aVar).f4690a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.h) {
                        interfaceC15676n2.mo18363O(1972628563);
                        C7352s.m8160a(((InterfaceC1382b.a.h) aVar).f4697a, interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.i) {
                        interfaceC15676n2.mo18363O(1022054446);
                        C6596b.m7406a(C18037u.m20404c(603766943, new Function2() { // from class: Xf.B
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C1724l.m2448a(((InterfaceC1382b.a.i) aVar).f4698a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.j) {
                        interfaceC15676n2.mo18363O(1972639839);
                        C5436c.m6154a(((InterfaceC1382b.a.j) aVar).f4699a, interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.m) {
                        interfaceC15676n2.mo18363O(1022389990);
                        C6596b.m7406a(C18037u.m20404c(-1362219811, new Function2() { // from class: Xf.C
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C7354u.m8161a(((InterfaceC1382b.a.m) aVar).f4702a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.e) {
                        interfaceC15676n2.mo18363O(1022631914);
                        C6596b.m7406a(C18037u.m20404c(1949754108, new C4411o(aVar), interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.l) {
                        interfaceC15676n2.mo18363O(1972658861);
                        C5045b.m5583a(((InterfaceC1382b.a.l) aVar).f4701a, C16973X.m19466e((C16972W) C19119E6.f59776h.getValue(), interfaceC15676n2, 0), C16973X.m19466e((C16972W) C19119E6.f59777i.getValue(), interfaceC15676n2, 0), interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.k) {
                        interfaceC15676n2.mo18363O(1972668677);
                        C5045b.m5583a(((InterfaceC1382b.a.k) aVar).f4700a, C16973X.m19466e((C16972W) C19140H5.f59838V0.getValue(), interfaceC15676n2, 0), C16973X.m19466e((C16972W) C19119E6.f59777i.getValue(), interfaceC15676n2, 0), interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else {
                        if (!(aVar instanceof InterfaceC1382b.a.b)) {
                            interfaceC15676n2.mo18363O(1972589803);
                            interfaceC15676n2.mo18357I();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC15676n2.mo18363O(1972677926);
                        C5045b.m5583a(((InterfaceC1382b.a.b) aVar).f4691a, C16973X.m19466e((C16972W) C19119E6.f59759X.getValue(), interfaceC15676n2, 0), C16973X.m19466e((C16972W) C19119E6.f59758W.getValue(), interfaceC15676n2, 0), interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3072, 6);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(interfaceC17978p, interfaceC6570b, i10) { // from class: Xf.w

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC17978p f20792c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ InterfaceC6570b f20793d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C6326D.m7121a(this.f20791b, this.f20792c, this.f20793d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
