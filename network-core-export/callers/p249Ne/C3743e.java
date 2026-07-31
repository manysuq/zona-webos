package p249Ne;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import p050Cd.InterfaceC0767r;
import p125Gg.EnumC1896d;
import p213Le.C3334B;
import p213Le.C3347O;
import p213Le.C3356i;
import p213Le.C3360m;
import p250Nf.C3765d;
import p644k0.C15585G1;
import p644k0.C15634Y0;
import p644k0.C15688r;
import p644k0.InterfaceC15612P1;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p843wd.InterfaceC19009W;
import p845wg.C19101C4;
import p845wg.C19140H5;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Ne.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPlayerSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerSettings.kt\nru/zona/app/screens/player/modals/settings/PlayerSettingsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n75#2:101\n113#3:102\n85#4:103\n85#4:104\n*S KotlinDebug\n*F\n+ 1 PlayerSettings.kt\nru/zona/app/screens/player/modals/settings/PlayerSettingsKt\n*L\n33#1:101\n37#1:102\n32#1:103\n70#1:104\n*E\n"})
public final class C3743e {
    /* JADX INFO: renamed from: a */
    public static final void m4500a(final InterfaceC0767r interfaceC0767r, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1079639837);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0767r) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0767r.mo1271a(), c15688rMo18372i, 0);
            C3356i.m4085b(C16973X.m19466e(c15688rMo18372i.mo18383t(C3765d.f12328a) == EnumC1896d.Tablet ? (C16972W) C19140H5.f59852e0.getValue() : (C16972W) C19101C4.f59662N.getValue(), c15688rMo18372i, 0), interfaceC0767r.mo1272b(), 412, C18037u.m20404c(522089136, new Function3() { // from class: Ne.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59800C0.getValue(), interfaceC15676n2, 0);
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        String strM4504a = C3751m.m4504a(((InterfaceC19009W.b) interfaceC15612P1.getValue()).f59295h, interfaceC15676n2);
                        InterfaceC0767r interfaceC0767r2 = interfaceC0767r;
                        C3334B.m4077f(strM19466e, strM4504a, interfaceC0767r2.mo1276f(), interfaceC15676n2, 0);
                        C3334B.m4076e(0, C16973X.m19466e((C16972W) C19285c2.f60042G.getValue(), interfaceC15676n2, 0), interfaceC15676n2, interfaceC0767r2.mo1275e(), ((InterfaceC19009W.b) interfaceC15612P1.getValue()).f59296i);
                        C3334B.m4073b(0, C16973X.m19466e((C16972W) C19140H5.f59858h0.getValue(), interfaceC15676n2, 0), interfaceC15676n2, interfaceC0767r2.mo1274d());
                        C3334B.m4073b(0, C16973X.m19466e((C16972W) C19140H5.f59842Z.getValue(), interfaceC15676n2, 0), interfaceC15676n2, interfaceC0767r2.mo1273c());
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3456, 0);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C3742d(interfaceC0767r, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4501b(final InterfaceC0767r interfaceC0767r, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1559940694);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0767r) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0767r.mo1271a(), c15688rMo18372i, 0);
            C3360m.m4087b(C16973X.m19466e((C16972W) C19140H5.f59852e0.getValue(), c15688rMo18372i, 0), interfaceC0767r.mo1272b(), C18037u.m20404c(-1846736568, new Function2() { // from class: Ne.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59800C0.getValue(), interfaceC15676n2, 0);
                        InterfaceC15612P1 interfaceC15612P1 = interfaceC15701v0M18246a;
                        String strM4504a = C3751m.m4504a(((InterfaceC19009W.b) interfaceC15612P1.getValue()).f59295h, interfaceC15676n2);
                        InterfaceC0767r interfaceC0767r2 = interfaceC0767r;
                        C3347O.m4083f(strM19466e, strM4504a, interfaceC0767r2.mo1276f(), interfaceC15676n2, 0);
                        C3347O.m4082e(0, C16973X.m19466e((C16972W) C19285c2.f60042G.getValue(), interfaceC15676n2, 0), interfaceC15676n2, interfaceC0767r2.mo1275e(), ((InterfaceC19009W.b) interfaceC15612P1.getValue()).f59296i);
                        C3347O.m4079b(0, C16973X.m19466e((C16972W) C19140H5.f59858h0.getValue(), interfaceC15676n2, 0), interfaceC15676n2, interfaceC0767r2.mo1274d());
                        C3347O.m4079b(0, C16973X.m19466e((C16972W) C19140H5.f59842Z.getValue(), interfaceC15676n2, 0), interfaceC15676n2, interfaceC0767r2.mo1273c());
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
            c15634y0M18412Y.f50634d = new C3740b(interfaceC0767r, i10, 0);
        }
    }
}
