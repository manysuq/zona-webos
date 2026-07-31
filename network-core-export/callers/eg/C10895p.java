package eg;

import ad.InterfaceC7239e;
import gg.C11406E;
import gg.C11411J;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.p659io.ConstantsKt;
import nf.C17250r;
import org.conscrypt.PSKKeyManager;
import p055D0.C0922A0;
import p086Ed.InterfaceC1382b;
import p114G5.AbstractC1714b;
import p186K5.C2875g;
import p338Sd.InterfaceC4901a;
import p357Te.C5048e;
import p375Ue.C5440g;
import p415X0.C6158s1;
import p446Yd.InterfaceC6570b;
import p448Yf.C6596b;
import p564fg.C11163f;
import p564fg.C11171n;
import p564fg.C11175r;
import p595hg.C11929p;
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

/* JADX INFO: renamed from: eg.p */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C10895p {
    /* JADX INFO: renamed from: a */
    public static final void m12919a(final InterfaceC1382b interfaceC1382b, final InterfaceC7239e interfaceC7239e, final InterfaceC4901a interfaceC4901a, final InterfaceC17978p interfaceC17978p, final InterfaceC6570b interfaceC6570b, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-486320266);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1382b) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(interfaceC7239e) ? 32 : 16) | (c15688rMo18372i.mo18362N(interfaceC4901a) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18362N(interfaceC17978p) ? 2048 : 1024) | (c15688rMo18372i.mo18362N(interfaceC6570b) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 9363) != 9362)) {
            C2875g.m3576a(interfaceC1382b.mo1947a(), null, C18037u.m20404c(1043000595, new Function3() { // from class: eg.h
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v17, types: [Ld.a, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    ((Integer) obj3).getClass();
                    final InterfaceC1382b.a aVar = (InterfaceC1382b.a) ((AbstractC1714b.a) obj).f5802b;
                    if (aVar instanceof InterfaceC1382b.a.d) {
                        interfaceC15676n2.mo18363O(-2057556629);
                        final InterfaceC6570b interfaceC6570b2 = interfaceC6570b;
                        C17250r.m19691d(interfaceC7239e, interfaceC4901a, C18037u.m20404c(804219851, new Function2() { // from class: eg.j
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C10886g.m12917d(((InterfaceC1382b.a.d) aVar).f4693a, interfaceC6570b2, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 384);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.c) {
                        interfaceC15676n2.mo18363O(-2057155272);
                        C6596b.m7406a(C18037u.m20404c(68572207, new Function2() { // from class: eg.k
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C6158s1.m6981a(((InterfaceC1382b.a.c) aVar).f4692a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.g) {
                        interfaceC15676n2.mo18363O(-2056910806);
                        final InterfaceC17978p interfaceC17978p2 = interfaceC17978p;
                        C6596b.m7406a(C18037u.m20404c(-1690787664, new Function2() { // from class: eg.l
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C11171n.m13168a(((InterfaceC1382b.a.g) aVar).f4696a, interfaceC17978p2, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.f) {
                        interfaceC15676n2.mo18363O(-2056629760);
                        C11175r.m13169a(((InterfaceC1382b.a.f) aVar).f4695a, interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.C20987a) {
                        interfaceC15676n2.mo18363O(-2056487780);
                        C11163f.m13164a(((InterfaceC1382b.a.C20987a) aVar).f4690a, interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.h) {
                        interfaceC15676n2.mo18363O(1596235847);
                        C11406E.m13424a(((InterfaceC1382b.a.h) aVar).f4697a, interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.i) {
                        interfaceC15676n2.mo18363O(-2056184135);
                        C6596b.m7406a(C18037u.m20404c(-138292556, new Function2() { // from class: eg.m
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C0922A0.m1400b(((InterfaceC1382b.a.i) aVar).f4698a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.j) {
                        interfaceC15676n2.mo18363O(1596247219);
                        C5440g.m6155a(((InterfaceC1382b.a.j) aVar).f4699a, interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.m) {
                        interfaceC15676n2.mo18363O(-2055845646);
                        C6596b.m7406a(C18037u.m20404c(637954998, new Function2() { // from class: eg.n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C11411J.m13425a(((InterfaceC1382b.a.m) aVar).f4702a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.e) {
                        interfaceC15676n2.mo18363O(-2055602730);
                        C6596b.m7406a(C18037u.m20404c(-1121404873, new Function2() { // from class: eg.o
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                InterfaceC15676n interfaceC15676n3 = (InterfaceC15676n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (interfaceC15676n3.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C11929p.m13787a(((InterfaceC1382b.a.e) aVar).f4694a, interfaceC15676n3, 0);
                                } else {
                                    interfaceC15676n3.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, interfaceC15676n2), interfaceC15676n2, 6);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.l) {
                        interfaceC15676n2.mo18363O(1596266321);
                        C5048e.m5584a(((InterfaceC1382b.a.l) aVar).f4701a, C16973X.m19466e((C16972W) C19119E6.f59776h.getValue(), interfaceC15676n2, 0), C16973X.m19466e((C16972W) C19119E6.f59777i.getValue(), interfaceC15676n2, 0), interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else if (aVar instanceof InterfaceC1382b.a.k) {
                        interfaceC15676n2.mo18363O(1596275673);
                        C5048e.m5584a(((InterfaceC1382b.a.k) aVar).f4700a, C16973X.m19466e((C16972W) C19140H5.f59838V0.getValue(), interfaceC15676n2, 0), C16973X.m19466e((C16972W) C19119E6.f59777i.getValue(), interfaceC15676n2, 0), interfaceC15676n2, 0);
                        interfaceC15676n2.mo18357I();
                    } else {
                        if (!(aVar instanceof InterfaceC1382b.a.b)) {
                            interfaceC15676n2.mo18363O(1596195281);
                            interfaceC15676n2.mo18357I();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC15676n2.mo18363O(1596284954);
                        C5048e.m5584a(((InterfaceC1382b.a.b) aVar).f4691a, C16973X.m19466e((C16972W) C19119E6.f59759X.getValue(), interfaceC15676n2, 0), C16973X.m19466e((C16972W) C19119E6.f59758W.getValue(), interfaceC15676n2, 0), interfaceC15676n2, 0);
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
            c15634y0M18412Y.f50634d = new Function2(interfaceC7239e, interfaceC4901a, interfaceC17978p, interfaceC6570b, i10) { // from class: eg.i

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC7239e f33778c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ InterfaceC4901a f33779d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC17978p f33780e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ InterfaceC6570b f33781f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C10895p.m12919a(this.f33777b, this.f33778c, this.f33779d, this.f33780e, this.f33781f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
