package p023B4;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p023B4.C0249G;
import p448Yf.C6606l;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19285c2;

/* JADX INFO: renamed from: B4.G */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C0249G implements InterfaceC0261b {
    /* JADX INFO: renamed from: a */
    public static final void m376a(Function0 function0, Function0 function1, InterfaceC15676n interfaceC15676n, final int i10) {
        final Function0 function2;
        final Function0 function3;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(682677171);
        int i11 = (c15688rMo18372i.mo18350B(function0) ? 4 : 2) | i10 | (c15688rMo18372i.mo18350B(function1) ? 32 : 16);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 19) != 18)) {
            function2 = function0;
            function3 = function1;
            C6606l.m7412c(null, C16973X.m19466e((C16972W) C19285c2.f60121v0.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19285c2.f60119u0.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19285c2.f60117t0.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) C19285c2.f60056N.getValue(), c15688rMo18372i, 0), function2, function3, c15688rMo18372i, (i11 << 15) & 4128768, 1);
        } else {
            function2 = function0;
            function3 = function1;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function3, i10) { // from class: ue.b

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function0 f57866c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C0249G.m376a(this.f57865b, this.f57866c, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m377b(Number... numberArr) {
        if (numberArr.length < 2) {
            return "";
        }
        byte bByteValue = numberArr[4].byteValue();
        byte[] bArr = new byte[numberArr.length - 1];
        int i10 = -1;
        for (int i11 = 0; i11 < numberArr.length; i11++) {
            if (i11 != 4) {
                i10++;
                bArr[i10] = (byte) (numberArr[i11].byteValue() ^ bByteValue);
            }
        }
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @Override // p023B4.InterfaceC0261b
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
