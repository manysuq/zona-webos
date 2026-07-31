package p195Ke;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p032Bd.InterfaceC0399c;
import p213Le.C3334B;
import p213Le.C3347O;
import p213Le.C3356i;
import p213Le.C3360m;
import p392Vd.EnumC5671b;
import p644k0.C15585G1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15612P1;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p845wg.C19101C4;

/* JADX INFO: renamed from: Ke.n */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nQuality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quality.kt\nru/zona/app/screens/player/modals/QualityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1282#2,6:55\n1282#2,6:61\n1282#2,6:70\n1282#2,6:78\n85#3:67\n85#3:68\n2068#4:69\n2069#4:76\n2068#4:77\n2069#4:84\n*S KotlinDebug\n*F\n+ 1 Quality.kt\nru/zona/app/screens/player/modals/QualityKt\n*L\n24#1:55,6\n43#1:61,6\n30#1:70,6\n50#1:78,6\n21#1:67\n40#1:68\n26#1:69\n26#1:76\n46#1:77\n46#1:84\n*E\n"})
public final class C3022n {

    /* JADX INFO: renamed from: Ke.n$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC0399c) this.receiver).close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ke.n$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC0399c) this.receiver).close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m3715a(InterfaceC0399c interfaceC0399c, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC0399c interfaceC0399c2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-665871489);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0399c) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0399c.getState(), c15688rMo18372i, 0);
            String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59731x0.getValue(), c15688rMo18372i, 0);
            boolean z10 = (i11 & 14) == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                interfaceC0399c2 = interfaceC0399c;
                a aVar = new a(0, interfaceC0399c2, InterfaceC0399c.class, "close", "close()V", 0);
                c15688rMo18372i.mo18380q(aVar);
                objMo18389z = aVar;
            } else {
                interfaceC0399c2 = interfaceC0399c;
            }
            C3356i.m4085b(strM19466e, (Function0) ((KFunction) objMo18389z), 0.0f, C18037u.m20404c(-936437358, new Function3() { // from class: Ke.h
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        for (final EnumC5671b enumC5671b : ((InterfaceC0399c.a) interfaceC15612P1.getValue()).f1703b) {
                            String str = enumC5671b.f18691b;
                            boolean z11 = ((InterfaceC0399c.a) interfaceC15612P1.getValue()).f1702a == enumC5671b;
                            final InterfaceC0399c interfaceC0399c3 = interfaceC0399c2;
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC0399c3) | interfaceC15676n2.mo18368e(enumC5671b.ordinal());
                            Object objMo18389z2 = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z2 == InterfaceC15676n.a.f50781a) {
                                objMo18389z2 = new Function0() { // from class: Ke.m
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC0399c3.mo794a(enumC5671b);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z2);
                            }
                            C3334B.m4072a(str, null, null, z11, (Function0) objMo18389z2, interfaceC15676n2, 0, 6);
                        }
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3072, 4);
        } else {
            interfaceC0399c2 = interfaceC0399c;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ke.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C3022n.m3715a(this.f9904b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3716b(InterfaceC0399c interfaceC0399c, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC0399c interfaceC0399c2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-186128120);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0399c) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0399c.getState(), c15688rMo18372i, 0);
            String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59731x0.getValue(), c15688rMo18372i, 0);
            boolean z10 = (i11 & 14) == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                interfaceC0399c2 = interfaceC0399c;
                b bVar = new b(0, interfaceC0399c2, InterfaceC0399c.class, "close", "close()V", 0);
                c15688rMo18372i.mo18380q(bVar);
                objMo18389z = bVar;
            } else {
                interfaceC0399c2 = interfaceC0399c;
            }
            C3360m.m4087b(strM19466e, (Function0) ((KFunction) objMo18389z), C18037u.m20404c(-1363959046, new Function2() { // from class: Ke.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        for (final EnumC5671b enumC5671b : ((InterfaceC0399c.a) interfaceC15612P1.getValue()).f1703b) {
                            String str = enumC5671b.f18691b;
                            boolean z11 = ((InterfaceC0399c.a) interfaceC15612P1.getValue()).f1702a == enumC5671b;
                            final InterfaceC0399c interfaceC0399c3 = interfaceC0399c2;
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC0399c3) | interfaceC15676n2.mo18368e(r1.ordinal());
                            Object objMo18389z2 = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z2 == InterfaceC15676n.a.f50781a) {
                                objMo18389z2 = new Function0() { // from class: Ke.l
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC0399c3.mo794a(enumC5671b);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z2);
                            }
                            C3347O.m4078a(str, z11, null, (Function0) objMo18389z2, interfaceC15676n2, 0, 4);
                        }
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3456);
        } else {
            interfaceC0399c2 = interfaceC0399c;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ke.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C3022n.m3716b(this.f9907b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
