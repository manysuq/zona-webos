package p249Ne;

import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19140H5;

/* JADX INFO: renamed from: Ne.m */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C3751m {
    /* JADX INFO: renamed from: a */
    public static final String m4504a(float f10, InterfaceC15676n interfaceC15676n) {
        return C16973X.m19467f(f10 == 1.0f ? (C16972W) C19140H5.f59806F0.getValue() : (C16972W) C19140H5.f59804E0.getValue(), new Object[]{m4505b(f10)}, interfaceC15676n);
    }

    /* JADX INFO: renamed from: b */
    public static final String m4505b(float f10) {
        return StringsKt.trimEnd(StringsKt.trimEnd(StringsKt__StringsJVMKt.replace$default(String.valueOf(f10), '.', ',', false, 4, (Object) null), '0'), ',');
    }

    /* JADX INFO: renamed from: c */
    public static final String m4506c(float f10, InterfaceC15676n interfaceC15676n) {
        if (f10 != 1.0f) {
            interfaceC15676n.mo18363O(-1658579903);
            interfaceC15676n.mo18357I();
            return m4505b(f10);
        }
        interfaceC15676n.mo18363O(-1658581638);
        String strM19466e = C16973X.m19466e((C16972W) C19140H5.f59802D0.getValue(), interfaceC15676n, 0);
        interfaceC15676n.mo18357I();
        return strM19466e;
    }
}
