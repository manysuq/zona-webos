package ge;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.p481ui.InterfaceC7507e;
import kg.C15892o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p124Gf.InterfaceC1874b;
import p214Lf.C3375b;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p644k0.C15636Z0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19119E6;

/* JADX INFO: renamed from: ge.f */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11384f implements Function2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f35457b = 1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35458c;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35457b) {
            case 0:
                ((Integer) obj2).getClass();
                C11386h.m13418b((InterfaceC11379a) this.f35458c, (InterfaceC15676n) obj, C15636Z0.m18294a(1));
                break;
            default:
                InterfaceC1874b.a.c cVar = (InterfaceC1874b.a.c) this.f35458c;
                InterfaceC15676n interfaceC15676n = (InterfaceC15676n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (interfaceC15676n.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59739D.getValue(), interfaceC15676n, 0);
                    C11732N0 c11732n0 = C3375b.f10930m;
                    C11565Q2.m13480b(strM19466e, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c11732n0, interfaceC15676n, 0, 0, 131070);
                    C15892o.m18681a(C7481f.m8515h(InterfaceC7507e.a.f24548b, 0.0f, 10, 0.0f, 0.0f, 13), cVar, c11732n0, interfaceC15676n, 6);
                } else {
                    interfaceC15676n.mo18356H();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C11384f(InterfaceC11379a interfaceC11379a, int i10) {
        this.f35458c = interfaceC11379a;
    }
}
