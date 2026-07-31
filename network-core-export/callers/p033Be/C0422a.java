package p033Be;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p214Lf.C3374a;
import p579h0.C11565Q2;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19140H5;

/* JADX INFO: renamed from: Be.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0422a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC15676n interfaceC15676n = (InterfaceC15676n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (interfaceC15676n.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C11565Q2.m13480b(C16973X.m19466e((C16972W) C19140H5.f59797B.getValue(), interfaceC15676n, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, C3374a.f10915j, interfaceC15676n, 0, 0, 131070);
        } else {
            interfaceC15676n.mo18356H();
        }
        return Unit.INSTANCE;
    }
}
