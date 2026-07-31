package kg;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8136C;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.conscrypt.PSKKeyManager;
import p124Gf.InterfaceC1874b;
import p126H.C1963W0;
import p214Lf.C3374a;
import p338Sd.InterfaceC4901a;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p644k0.C15585G1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p845wg.C19119E6;
import p845wg.C19285c2;

/* JADX INFO: renamed from: kg.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUpdateViewM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateViewM.kt\nru/zona/app/ui/update/UpdateViewMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,110:1\n1282#2,6:111\n1282#2,6:117\n85#3:123\n113#4:124\n113#4:125\n*S KotlinDebug\n*F\n+ 1 UpdateViewM.kt\nru/zona/app/ui/update/UpdateViewMKt\n*L\n32#1:111,6\n33#1:117,6\n26#1:123\n62#1:124\n72#1:125\n*E\n"})
public final class C15886i {

    /* JADX INFO: renamed from: kg.i$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC4901a) this.receiver).cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kg.i$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC4901a) this.receiver).mo5501a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m18677a(final InterfaceC1874b.a.c cVar, final Function0<Unit> function0, final Function0<Unit> function1, InterfaceC15676n interfaceC15676n, final int i10) {
        final Function0<Unit> function2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1232966348);
        int i11 = (c15688rMo18372i.mo18350B(cVar) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function0) ? 32 : 16) | (c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 147) != 146)) {
            function2 = function0;
            C8136C.m10120b(C16973X.m19466e((C16972W) C19285c2.f60037D0.getValue(), c15688rMo18372i, 0), C18037u.m20404c(-1691323740, new Function2() { // from class: kg.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59739D.getValue(), interfaceC15676n2, 0);
                        C11732N0 c11732n0 = C3374a.f10915j;
                        C11565Q2.m13480b(strM19466e, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, interfaceC15676n2, 0, 0, 131070);
                        C15892o.m18681a(C7481f.m8515h(InterfaceC7507e.a.f24548b, 0.0f, 10, 0.0f, 0.0f, 13), cVar, c11732n0, interfaceC15676n2, 6);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), C18037u.m20404c(-404841435, new Function2() { // from class: kg.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C8136C.m10119a(C16973X.m19466e((C16972W) C19285c2.f60056N.getValue(), interfaceC15676n2, 0), false, function0, interfaceC15676n2, 0, 2);
                        C1963W0.m2623a(C7482g.m8529n(InterfaceC7507e.a.f24548b, 8), interfaceC15676n2);
                        C8136C.m10119a(C16973X.m19466e((C16972W) C19119E6.f59781m.getValue(), interfaceC15676n2, 0), true, function1, interfaceC15676n2, 48, 0);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), function2, c15688rMo18372i, ((i11 << 6) & 7168) | 432);
        } else {
            function2 = function0;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function2, function1, i10) { // from class: kg.h

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f51484c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f51485d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C15886i.m18677a(this.f51483b, this.f51484c, this.f51485d, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m18678b(InterfaceC4901a interfaceC4901a, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC4901a interfaceC4901a2 = interfaceC4901a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1002311632);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC4901a2) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC4901a2.getState(), c15688rMo18372i, 0);
            InterfaceC4901a.a aVar = (InterfaceC4901a.a) interfaceC15701v0M18246a.getValue();
            if (aVar.f16386b) {
                InterfaceC1874b.a aVar2 = aVar.f16385a;
                if ((aVar2 instanceof InterfaceC1874b.a.c) || (aVar2 instanceof InterfaceC1874b.a.b)) {
                    c15688rMo18372i.mo18363O(-1253040953);
                    InterfaceC1874b.a aVar3 = ((InterfaceC4901a.a) interfaceC15701v0M18246a.getValue()).f16385a;
                    if (aVar3 instanceof InterfaceC1874b.a.c) {
                        c15688rMo18372i.mo18363O(-1252965437);
                        InterfaceC1874b.a.c cVar = (InterfaceC1874b.a.c) aVar3;
                        int i12 = i11 & 14;
                        boolean z10 = i12 == 4;
                        Object objMo18389z = c15688rMo18372i.mo18389z();
                        InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                        if (z10 || objMo18389z == c21235a) {
                            a aVar4 = new a(0, interfaceC4901a2, InterfaceC4901a.class, "cancel", "cancel()V", 0);
                            c15688rMo18372i.mo18380q(aVar4);
                            objMo18389z = aVar4;
                        }
                        Function0 function0 = (Function0) ((KFunction) objMo18389z);
                        boolean z11 = i12 == 4;
                        Object objMo18389z2 = c15688rMo18372i.mo18389z();
                        if (z11 || objMo18389z2 == c21235a) {
                            interfaceC4901a2 = interfaceC4901a;
                            objMo18389z2 = new b(0, interfaceC4901a2, InterfaceC4901a.class, "doDownloadUpdate", "doDownloadUpdate()V", 0);
                            c15688rMo18372i.mo18380q(objMo18389z2);
                        } else {
                            interfaceC4901a2 = interfaceC4901a;
                        }
                        m18677a(cVar, function0, (Function0) ((KFunction) objMo18389z2), c15688rMo18372i, 0);
                        c15688rMo18372i.m18410W(false);
                    } else if (aVar3 instanceof InterfaceC1874b.a.b) {
                        c15688rMo18372i.mo18363O(-1252705998);
                        c15688rMo18372i.m18410W(false);
                    } else {
                        c15688rMo18372i.mo18363O(-1252621306);
                        c15688rMo18372i.m18410W(false);
                    }
                    c15688rMo18372i.m18410W(false);
                } else {
                    c15688rMo18372i.mo18363O(-1252563150);
                    c15688rMo18372i.m18410W(false);
                }
            } else {
                c15688rMo18372i.mo18363O(-1252563150);
                c15688rMo18372i.m18410W(false);
            }
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: kg.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C15886i.m18678b(this.f51479b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
