package p195Ke;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p050Cd.InterfaceC0748h;
import p213Le.C3334B;
import p213Le.C3347O;
import p213Le.C3356i;
import p213Le.C3360m;
import p644k0.C15585G1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p843wd.C19040n0;
import p843wd.InterfaceC19009W;
import p845wg.C19140H5;

/* JADX INFO: renamed from: Ke.u */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSubtitles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Subtitles.kt\nru/zona/app/screens/player/modals/SubtitlesKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n85#2:56\n85#2:57\n2068#3:58\n2069#3:65\n2068#3:66\n2069#3:73\n1282#4,6:59\n1282#4,6:67\n*S KotlinDebug\n*F\n+ 1 Subtitles.kt\nru/zona/app/screens/player/modals/SubtitlesKt\n*L\n21#1:56\n41#1:57\n26#1:58\n26#1:65\n47#1:66\n47#1:73\n31#1:59,6\n51#1:67,6\n*E\n"})
public final class C3029u {
    /* JADX INFO: renamed from: a */
    public static final void m3717a(final InterfaceC0748h interfaceC0748h, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(916293787);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0748h) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0748h.mo1283a(), c15688rMo18372i, 0);
            C3356i.m4085b(C16973X.m19466e((C16972W) C19140H5.f59818L0.getValue(), c15688rMo18372i, 0), interfaceC0748h.mo1284b(), 0.0f, C18037u.m20404c(-1048777618, new Function3() { // from class: Ke.q
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final InterfaceC0748h interfaceC0748h2 = interfaceC0748h;
                        for (final C19040n0 c19040n0 : interfaceC0748h2.mo1285f()) {
                            String str = c19040n0.f59422b;
                            boolean zAreEqual = Intrinsics.areEqual(c19040n0, ((InterfaceC19009W.b) interfaceC15701v0M18246a.getValue()).f59293f);
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC0748h2) | interfaceC15676n2.mo18350B(c19040n0);
                            Object objMo18389z = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                                objMo18389z = new Function0() { // from class: Ke.t
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC0748h2.mo1286g().invoke(c19040n0);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z);
                            }
                            C3334B.m4072a(str, null, "test_tag_subtitle_item", zAreEqual, (Function0) objMo18389z, interfaceC15676n2, 384, 2);
                        }
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3072, 4);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ke.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C3029u.m3717a(this.f9917b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3718b(final InterfaceC0748h interfaceC0748h, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1579198100);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0748h) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0748h.mo1283a(), c15688rMo18372i, 0);
            C3360m.m4087b(C16973X.m19466e((C16972W) C19140H5.f59818L0.getValue(), c15688rMo18372i, 0), interfaceC0748h.mo1284b(), C18037u.m20404c(-102738466, new Function2() { // from class: Ke.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final InterfaceC0748h interfaceC0748h2 = interfaceC0748h;
                        for (final C19040n0 c19040n0 : interfaceC0748h2.mo1285f()) {
                            String str = c19040n0.f59422b;
                            boolean zAreEqual = Intrinsics.areEqual(c19040n0, ((InterfaceC19009W.b) interfaceC15701v0M18246a.getValue()).f59293f);
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC0748h2) | interfaceC15676n2.mo18350B(c19040n0);
                            Object objMo18389z = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                                objMo18389z = new Function0() { // from class: Ke.s
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC0748h2.mo1286g().invoke(c19040n0);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z);
                            }
                            C3347O.m4078a(str, zAreEqual, null, (Function0) objMo18389z, interfaceC15676n2, 0, 4);
                        }
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3456);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ke.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C3029u.m3718b(this.f9914b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
