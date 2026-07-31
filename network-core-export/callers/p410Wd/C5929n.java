package p410Wd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p269Og.C4004l;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19101C4;
import p845wg.C19119E6;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Wd.n */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C5929n {
    /* JADX INFO: renamed from: a */
    public static final String m6807a(C5933r c5933r, InterfaceC15676n interfaceC15676n) {
        String str = c5933r.f19656a;
        List<C5933r> list = C5933r.f19655b;
        if (Intrinsics.areEqual(str, "0+")) {
            interfaceC15676n.mo18363O(1924604908);
            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60075X.getValue(), interfaceC15676n, 0);
            interfaceC15676n.mo18357I();
            return strM19466e;
        }
        if (Intrinsics.areEqual(str, "6+")) {
            interfaceC15676n.mo18363O(1924607437);
            String strM19466e2 = C16973X.m19466e((C16972W) C19285c2.f60072V.getValue(), interfaceC15676n, 0);
            interfaceC15676n.mo18357I();
            return strM19466e2;
        }
        if (Intrinsics.areEqual(str, "12+")) {
            interfaceC15676n.mo18363O(1924610029);
            String strM19466e3 = C16973X.m19466e((C16972W) C19285c2.f60074W.getValue(), interfaceC15676n, 0);
            interfaceC15676n.mo18357I();
            return strM19466e3;
        }
        if (Intrinsics.areEqual(str, "16+")) {
            interfaceC15676n.mo18363O(1924612622);
            String strM19466e4 = C16973X.m19466e((C16972W) C19119E6.f59774g.getValue(), interfaceC15676n, 0);
            interfaceC15676n.mo18357I();
            return strM19466e4;
        }
        if (!Intrinsics.areEqual(str, "18+")) {
            interfaceC15676n.mo18363O(-466421251);
            interfaceC15676n.mo18357I();
            return "";
        }
        interfaceC15676n.mo18363O(1924615234);
        String strM19466e5 = C16973X.m19466e((C16972W) C19285c2.f60096j.getValue(), interfaceC15676n, 0);
        interfaceC15676n.mo18357I();
        return strM19466e5;
    }

    /* JADX INFO: renamed from: b */
    public static final String m6808b(InterfaceC5928m interfaceC5928m, String str, InterfaceC15676n interfaceC15676n) {
        String strMo6790b;
        StringBuilder sb2 = new StringBuilder();
        String strMo6796h = interfaceC5928m.mo6796h();
        if (strMo6796h == null || StringsKt.isBlank(strMo6796h)) {
            interfaceC15676n.mo18363O(-1568875325);
            interfaceC15676n.mo18357I();
        } else {
            interfaceC15676n.mo18363O(-1568959893);
            sb2.append(C16973X.m19467f((C16972W) C19101C4.f59674T.getValue(), new Object[]{interfaceC5928m.mo6796h()}, interfaceC15676n));
            interfaceC15676n.mo18357I();
        }
        String strMo6796h2 = interfaceC5928m.mo6796h();
        if (strMo6796h2 != null && !StringsKt.isBlank(strMo6796h2) && (strMo6790b = interfaceC5928m.mo6790b()) != null && !StringsKt.isBlank(strMo6790b)) {
            sb2.append(str);
        }
        String strMo6790b2 = interfaceC5928m.mo6790b();
        if (strMo6790b2 == null || StringsKt.isBlank(strMo6790b2)) {
            interfaceC15676n.mo18363O(-1568648157);
            interfaceC15676n.mo18357I();
        } else {
            interfaceC15676n.mo18363O(-1568730803);
            sb2.append(C16973X.m19467f((C16972W) C19101C4.f59672S.getValue(), new Object[]{interfaceC5928m.mo6790b()}, interfaceC15676n));
            interfaceC15676n.mo18357I();
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final String m6809c(C5922g c5922g, InterfaceC15676n interfaceC15676n) {
        String str = c5922g.f19601c;
        C4004l c4004l = c5922g.f19602d;
        if (str == null || StringsKt.isBlank(str)) {
            interfaceC15676n.mo18363O(-1457451424);
            String strM19467f = C16973X.m19467f((C16972W) C19285c2.f60067S0.getValue(), new Object[]{Integer.valueOf(c4004l.f13166b)}, interfaceC15676n);
            interfaceC15676n.mo18357I();
            return strM19467f;
        }
        interfaceC15676n.mo18363O(-1457372777);
        interfaceC15676n.mo18357I();
        return c4004l.f13166b + ". " + str;
    }
}
