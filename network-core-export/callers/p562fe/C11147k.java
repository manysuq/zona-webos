package p562fe;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p448Yf.C6601g;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19140H5;
import p845wg.C19278b3;
import p845wg.C19285c2;

/* JADX INFO: renamed from: fe.k */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C11147k {
    /* JADX INFO: renamed from: a */
    public static final void m13159a(Function0<Unit> function0, InterfaceC15676n interfaceC15676n, final int i10) {
        final Function0<Unit> function1;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-121464687);
        int i11 = (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            function1 = function0;
            C6601g.m7409c(null, C16973X.m19466e((C16972W) C19278b3.f59978a.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19278b3.f59980b.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19285c2.f60083c0.getValue(), c15688rMo18372i, 0), "", function1, function0, c15688rMo18372i, ((i11 << 15) & 458752) | 24576 | ((i11 << 18) & 3670016), 1);
        } else {
            function1 = function0;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: fe.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C11147k.m13159a(this.f34678b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13160b(final int i10, final String str, InterfaceC15676n interfaceC15676n, Function0 function0) {
        final Function0 function1;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1769469755);
        int i11 = (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | i10 | (c15688rMo18372i.mo18362N(str) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            function1 = function0;
            C6601g.m7409c(null, C16973X.m19466e((C16972W) C19140H5.f59824O0.getValue(), c15688rMo18372i, 0), C16973X.m19467f((C16972W) C19140H5.f59826P0.getValue(), new Object[]{str}, c15688rMo18372i), C16973X.m19466e((C16972W) C19285c2.f60083c0.getValue(), c15688rMo18372i, 0), "", function1, function0, c15688rMo18372i, ((i11 << 15) & 458752) | 24576 | ((i11 << 18) & 3670016), 1);
        } else {
            function1 = function0;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, str, function1) { // from class: fe.i

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Function0 f34676b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f34677c;

                {
                    this.f34676b = function1;
                    this.f34677c = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C11147k.m13160b(C15636Z0.m18294a(1), this.f34677c, (InterfaceC15676n) obj, this.f34676b);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
