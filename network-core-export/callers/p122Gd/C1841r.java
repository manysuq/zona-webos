package p122Gd;

import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import p114G5.C1719g;
import p114G5.InterfaceC1715c;
import p366U5.InterfaceC5372f;
import p384V5.InterfaceC5655c;
import p402W5.InterfaceC5862d;
import p420X5.C6224b;
import p438Y5.InterfaceC6450f;
import p478aa.C7106g;
import p524da.C10427i;
import p524da.C10428i0;
import p524da.C10454v0;
import p524da.C10456w0;
import p524da.InterfaceC10452u0;
import p558fa.C11095d;
import p689mb.C16972W;
import p689mb.C16973X;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Gd.r */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C1841r implements InterfaceC1829g, InterfaceC1715c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1715c f6265b;

    /* JADX INFO: renamed from: c */
    public final C1792A f6266c;

    /* JADX INFO: renamed from: d */
    public final C1793B f6267d;

    /* JADX INFO: renamed from: e */
    public final C10454v0 f6268e;

    /* JADX INFO: renamed from: f */
    public final C10428i0 f6269f;

    /* JADX INFO: renamed from: g */
    public final C11095d f6270g;

    public C1841r(C1792A c1792a, C1793B c1793b, InterfaceC1715c interfaceC1715c) {
        this.f6265b = interfaceC1715c;
        this.f6266c = c1792a;
        this.f6267d = c1793b;
        C10454v0 c10454v0M12580a = C10456w0.m12580a(InterfaceC1829g.a.c.f6187a);
        this.f6268e = c10454v0M12580a;
        this.f6269f = C10427i.m12535a(c10454v0M12580a);
        C11095d c11095dM7048b = C6224b.m7048b(this);
        this.f6270g = c11095dM7048b;
        C7106g.m8045c(c11095dM7048b, null, null, new C1838o(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m2560b(C1841r c1841r, int i10, ContinuationImpl continuationImpl) {
        C1840q c1840q;
        String str;
        c1841r.getClass();
        if (continuationImpl instanceof C1840q) {
            c1840q = (C1840q) continuationImpl;
            int i11 = c1840q.f6264m;
            if ((i11 & IntCompanionObject.MIN_VALUE) != 0) {
                c1840q.f6264m = i11 - IntCompanionObject.MIN_VALUE;
            } else {
                c1840q = new C1840q(c1841r, continuationImpl);
            }
        } else {
            c1840q = new C1840q(c1841r, continuationImpl);
        }
        Object objM19462a = c1840q.f6262k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1840q.f6264m;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM19462a);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Boxing.boxInt(i10 / 60), Boxing.boxInt(i10 % 60)}, 2));
            C16972W c16972w = (C16972W) C19285c2.f60087e0.getValue();
            c1840q.f6261j = str;
            c1840q.f6264m = 1;
            objM19462a = C16973X.m19462a(c16972w, c1840q);
            if (objM19462a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c1840q.f6261j;
            ResultKt.throwOnFailure(objM19462a);
        }
        return objM19462a + " " + str;
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: K */
    public final InterfaceC5372f mo793K() {
        return this.f6265b.mo793K();
    }

    @Override // p122Gd.InterfaceC1829g
    /* JADX INFO: renamed from: a */
    public final Function0<Unit> mo2543a() {
        return this.f6266c;
    }

    @Override // p114G5.InterfaceC1715c
    public final InterfaceC5862d getLifecycle() {
        return this.f6265b.getLifecycle();
    }

    @Override // p122Gd.InterfaceC1829g
    public final InterfaceC10452u0<InterfaceC1829g.a> getState() {
        return this.f6269f;
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: n */
    public final InterfaceC5655c mo795n() {
        return this.f6265b.mo795n();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: u */
    public final C1719g mo796u() {
        return this.f6265b.mo796u();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: x */
    public final InterfaceC6450f mo797x() {
        return this.f6265b.mo797x();
    }
}
