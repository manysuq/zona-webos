package ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p448Yf.C6601g;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15676n;
import p657kd.InterfaceC15846a;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19101C4;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: ve.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPremiumExpiredDialogM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumExpiredDialogM.kt\nru/zona/app/screens/dialog/premium/PremiumExpiredDialogMKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,26:1\n1282#2,6:27\n1282#2,6:33\n*S KotlinDebug\n*F\n+ 1 PremiumExpiredDialogM.kt\nru/zona/app/screens/dialog/premium/PremiumExpiredDialogMKt\n*L\n22#1:27,6\n23#1:33,6\n*E\n"})
public final class C18755b {

    /* JADX INFO: renamed from: ve.b$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC15846a) this.receiver).mo18662a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ve.b$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC15846a) this.receiver).onDismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m21134a(InterfaceC15846a interfaceC15846a, InterfaceC15676n interfaceC15676n, final int i10) {
        int i11;
        InterfaceC15676n.a.C21235a c21235a;
        final InterfaceC15846a interfaceC15846a2 = interfaceC15846a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1085983358);
        int i12 = (c15688rMo18372i.mo18362N(interfaceC15846a2) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 3) != 2)) {
            String strM19466e = C16973X.m19466e((C16972W) C19101C4.f59685a0.getValue(), c15688rMo18372i, 0);
            String strM19466e2 = C16973X.m19466e((C16972W) C19285c2.f60052L.getValue(), c15688rMo18372i, 0);
            String strM19466e3 = C16973X.m19466e((C16972W) C19101C4.f59718r.getValue(), c15688rMo18372i, 0);
            String strM19466e4 = C16973X.m19466e((C16972W) C19278b3.f59962Q.getValue(), c15688rMo18372i, 0);
            int i13 = i12 & 14;
            boolean z10 = i13 == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a2 = InterfaceC15676n.a.f50781a;
            if (z10 || objMo18389z == c21235a2) {
                i11 = i13;
                c21235a = c21235a2;
                a aVar = new a(0, interfaceC15846a2, InterfaceC15846a.class, "openPremiumProfile", "openPremiumProfile()V", 0);
                c15688rMo18372i.mo18380q(aVar);
                objMo18389z = aVar;
            } else {
                i11 = i13;
                c21235a = c21235a2;
            }
            Function0 function0 = (Function0) ((KFunction) objMo18389z);
            boolean z11 = i11 == 4;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (z11 || objMo18389z2 == c21235a) {
                interfaceC15846a2 = interfaceC15846a;
                objMo18389z2 = new b(0, interfaceC15846a2, InterfaceC15846a.class, "onDismiss", "onDismiss()V", 0);
                c15688rMo18372i.mo18380q(objMo18389z2);
            } else {
                interfaceC15846a2 = interfaceC15846a;
            }
            C6601g.m7409c(null, strM19466e, strM19466e2, strM19466e3, strM19466e4, function0, (Function0) ((KFunction) objMo18389z2), c15688rMo18372i, 0, 1);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: ve.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C18755b.m21134a(this.f58425b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
