package p897zg;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p017Ag.C0160r;
import p055D0.C0941K;
import p107Fg.C1634b;
import p125Gg.EnumC1908p;
import p183K2.C2756Y;
import p524da.C10427i;
import p524da.C10428i0;
import p524da.C10454v0;
import p524da.C10456w0;
import p524da.InterfaceC10452u0;

/* JADX INFO: renamed from: zg.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nHostProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostProviderImpl.kt\nru/zona/commons/api/http/HostProvider\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,46:1\n230#2,5:47\n*S KotlinDebug\n*F\n+ 1 HostProviderImpl.kt\nru/zona/commons/api/http/HostProvider\n*L\n42#1:47,5\n*E\n"})
public final class C20963h implements InterfaceC20965j {

    /* JADX INFO: renamed from: d */
    public static final C1634b f72017d;

    /* JADX INFO: renamed from: a */
    public final String f72018a;

    /* JADX INFO: renamed from: b */
    public final C10454v0 f72019b;

    /* JADX INFO: renamed from: c */
    public final C10428i0 f72020c;

    static {
        Reflection.getOrCreateKotlinClass(C20963h.class).getSimpleName();
        f72017d = new C1634b();
        new AtomicInteger(0);
    }

    public C20963h(InterfaceC20965j.a aVar, String str) {
        this.f72018a = str;
        C10454v0 c10454v0M12580a = C10456w0.m12580a(aVar);
        this.f72019b = c10454v0M12580a;
        this.f72020c = C10427i.m12535a(c10454v0M12580a);
    }

    /* JADX INFO: renamed from: a */
    public final void m25477a(String str) {
        C10454v0 c10454v0;
        Object value;
        f72017d.mo2258d(C2756Y.m3477a("setHost to ", str, " (", this.f72018a, ")"), new Object[0]);
        do {
            c10454v0 = this.f72019b;
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, new InterfaceC20965j.a(str, EnumC1908p.f6449d)));
    }

    @Override // p897zg.InterfaceC20965j
    /* JADX INFO: renamed from: b */
    public final Object mo25478b(ContinuationImpl continuationImpl) {
        InterfaceC20965j.a aVar = (InterfaceC20965j.a) this.f72020c.f32389b.getValue();
        return aVar.f72024b == EnumC1908p.f6449d ? aVar.f72023a : C0160r.m216c(C0941K.m1458b("Wait for init host value (", this.f72018a, ")"), null, null, new C20962g(this, null), continuationImpl, 30);
    }

    @Override // p125Gg.InterfaceC1906n
    public final InterfaceC10452u0<InterfaceC20965j.a> getState() {
        return this.f72020c;
    }
}
