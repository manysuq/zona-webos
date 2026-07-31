package ke;

import cd.InterfaceC8436g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt;
import p392Vd.EnumC5674e;
import p544ed.InterfaceC10855a;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19140H5;
import p845wg.C19278b3;

/* JADX INFO: renamed from: ke.o */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C15862o {
    /* JADX INFO: renamed from: a */
    public static final String m18667a(InterfaceC8436g.a aVar, InterfaceC15676n interfaceC15676n) {
        interfaceC15676n.mo18363O(-1359582537);
        String str = aVar.f28932a;
        EnumC5674e enumC5674e = aVar.f28933b;
        if (str != null && !StringsKt.isBlank(str)) {
            String str2 = aVar.f28932a;
            interfaceC15676n.mo18357I();
            return str2;
        }
        if (enumC5674e == null) {
            interfaceC15676n.mo18363O(-1781536277);
            interfaceC15676n.mo18357I();
            interfaceC15676n.mo18357I();
            return null;
        }
        interfaceC15676n.mo18363O(-1781603547);
        String strM19466e = C16973X.m19466e(m18669c(enumC5674e), interfaceC15676n, 0);
        interfaceC15676n.mo18357I();
        interfaceC15676n.mo18357I();
        return strM19466e;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18668b(InterfaceC10855a.a aVar, InterfaceC15676n interfaceC15676n) {
        C16972W c16972wM18669c;
        EnumC5674e enumC5674e = aVar.f33686a;
        int iOrdinal = enumC5674e.ordinal();
        if (iOrdinal == 0) {
            c16972wM18669c = (C16972W) C19140H5.f59857h.getValue();
        } else if (iOrdinal != 1) {
            c16972wM18669c = iOrdinal != 2 ? m18669c(enumC5674e) : (C16972W) C19140H5.f59861j.getValue();
        } else {
            c16972wM18669c = (C16972W) C19140H5.f59849d.getValue();
        }
        return C16973X.m19466e(c16972wM18669c, interfaceC15676n, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final C16972W m18669c(EnumC5674e enumC5674e) {
        int iOrdinal = enumC5674e.ordinal();
        if (iOrdinal == 0) {
            return (C16972W) C19278b3.f60010q.getValue();
        }
        if (iOrdinal == 1) {
            return (C16972W) C19278b3.f59986e.getValue();
        }
        if (iOrdinal == 2) {
            return (C16972W) C19119E6.f59753R.getValue();
        }
        if (iOrdinal == 3) {
            return (C16972W) C19278b3.f59998k.getValue();
        }
        if (iOrdinal == 4) {
            return (C16972W) C19101C4.f59671R0.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
