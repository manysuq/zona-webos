package p249Ne;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import p068Dd.InterfaceC1139a;
import p213Le.C3334B;
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
import p845wg.C19140H5;

/* JADX INFO: renamed from: Ne.l */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSpeedSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeedSettings.kt\nru/zona/app/screens/player/modals/settings/SpeedSettingsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,53:1\n85#2:54\n85#2:55\n2068#3:56\n2069#3:63\n2068#3:64\n2069#3:71\n1282#4,6:57\n1282#4,6:65\n*S KotlinDebug\n*F\n+ 1 SpeedSettings.kt\nru/zona/app/screens/player/modals/settings/SpeedSettingsKt\n*L\n20#1:54\n39#1:55\n25#1:56\n25#1:63\n45#1:64\n45#1:71\n29#1:57,6\n49#1:65,6\n*E\n"})
public final class C3750l {
    /* JADX INFO: renamed from: a */
    public static final void m4502a(final InterfaceC1139a interfaceC1139a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(170420641);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1139a) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC1139a.mo1747a(), c15688rMo18372i, 0);
            C3356i.m4085b(C16973X.m19466e((C16972W) C19140H5.f59800C0.getValue(), c15688rMo18372i, 0), interfaceC1139a.mo1748b(), 0.0f, C18037u.m20404c(-1934155724, new Function3() { // from class: Ne.h
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final InterfaceC1139a interfaceC1139a2 = interfaceC1139a;
                        Iterator<T> it = interfaceC1139a2.mo1751e().iterator();
                        while (it.hasNext()) {
                            final float fFloatValue = ((Number) it.next()).floatValue();
                            String strM4506c = C3751m.m4506c(fFloatValue, interfaceC15676n2);
                            boolean z10 = fFloatValue == ((Number) interfaceC15701v0M18246a.getValue()).floatValue();
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC1139a2) | interfaceC15676n2.mo18366c(fFloatValue);
                            Object objMo18389z = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z == InterfaceC15676n.a.f50781a) {
                                objMo18389z = new Function0() { // from class: Ne.j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC1139a2.mo1750d(fFloatValue);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z);
                            }
                            C3334B.m4072a(strM4506c, null, null, z10, (Function0) objMo18389z, interfaceC15676n2, 0, 6);
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
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ne.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C3750l.m4502a(this.f12304b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4503b(final InterfaceC1139a interfaceC1139a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1257712692);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC1139a) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            C3360m.m4087b(C16973X.m19466e((C16972W) C19140H5.f59800C0.getValue(), c15688rMo18372i, 0), interfaceC1139a.mo1749c(), C18037u.m20404c(-1555793626, new C3744f(interfaceC1139a, C15585G1.m18246a(interfaceC1139a.mo1747a(), c15688rMo18372i, 0)), c15688rMo18372i), c15688rMo18372i, 3456);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ne.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C3750l.m4503b(this.f12301b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
