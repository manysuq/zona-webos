package p319Rc;

import android.content.Context;
import java.io.EOFException;
import java.nio.charset.CharacterCodingException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationKt;
import p031Bc.C0392h;
import p064D9.C1084f;
import p064D9.C1086h;
import p064D9.InterfaceC1091m;
import p107Fg.C1634b;
import p107Fg.C1637e;
import p125Gg.InterfaceC1905m;
import p154I9.C2295I;
import p233Mg.C3564b;
import p280P9.C4189a;
import p431Xg.C6368g;

/* JADX INFO: renamed from: Rc.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C4740d {

    /* JADX INFO: renamed from: f */
    public static final C1634b f15912f;

    /* JADX INFO: renamed from: g */
    public static final C3564b f15913g;

    /* JADX INFO: renamed from: a */
    public final Context f15914a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1905m<C3564b> f15915b;

    /* JADX INFO: renamed from: c */
    public final C6368g f15916c;

    /* JADX INFO: renamed from: d */
    public String f15917d;

    /* JADX INFO: renamed from: e */
    public long f15918e;

    static {
        Reflection.getOrCreateKotlinClass(C4740d.class).getSimpleName();
        f15912f = new C1634b();
        f15913g = new C3564b(SetsKt.setOf((Object[]) new String[]{"/getMetadata", "/getVideoSources", "/getMovieIds", "/getSerialIds"}));
    }

    public C4740d(Context context, InterfaceC1905m interfaceC1905m, C6368g c6368g) {
        this.f15914a = context;
        this.f15915b = interfaceC1905m;
        this.f15916c = c6368g;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m5335a(ContinuationImpl continuationImpl) {
        C4738b c4738b;
        if (continuationImpl instanceof C4738b) {
            c4738b = (C4738b) continuationImpl;
            int i10 = c4738b.f15907m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c4738b.f15907m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c4738b = new C4738b(this, continuationImpl);
            }
        } else {
            c4738b = new C4738b(this, continuationImpl);
        }
        Object objMo817a = c4738b.f15905k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c4738b.f15907m;
        C3564b c3564b = f15913g;
        C1634b c1634b = f15912f;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objMo817a);
                InterfaceC1905m<C3564b> interfaceC1905m = this.f15915b;
                c4738b.f15907m = 1;
                objMo817a = interfaceC1905m.mo817a(c4738b);
                if (objMo817a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(objMo817a);
                    return c3564b;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMo817a);
                return c3564b;
            }
            ResultKt.throwOnFailure(objMo817a);
            C3564b c3564b2 = (C3564b) objMo817a;
            if (!c3564b2.f11713a.isEmpty()) {
                return c3564b2;
            }
            c4738b.f15904j = SpillingKt.nullOutSpilledVariable(c3564b2);
            c4738b.f15907m = 2;
            if (C1637e.m2263a(c1634b, "clientTimeUrls is null, using default value", new Object[0], c4738b) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return c3564b;
        } catch (Exception e10) {
            c4738b.f15904j = SpillingKt.nullOutSpilledVariable(e10);
            c4738b.f15907m = 3;
            if (C1637e.m2265c(c1634b, "Error while getting client time", e10, c4738b) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m5336b(C1084f c1084f, ContinuationImpl continuationImpl) throws CharacterCodingException, EOFException {
        C4739c c4739c;
        if (continuationImpl instanceof C4739c) {
            c4739c = (C4739c) continuationImpl;
            int i10 = c4739c.f15911m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c4739c.f15911m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c4739c = new C4739c(this, continuationImpl);
            }
        } else {
            c4739c = new C4739c(this, continuationImpl);
        }
        Object objM5335a = c4739c.f15909k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c4739c.f15911m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM5335a);
            c4739c.f15908j = c1084f;
            c4739c.f15911m = 1;
            objM5335a = m5335a(c4739c);
            if (objM5335a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1084f = c4739c.f15908j;
            ResultKt.throwOnFailure(objM5335a);
        }
        if (((C3564b) objM5335a).f11713a.contains(C2295I.m2973c(c1084f.f3940a))) {
            String strMo2193c = this.f15916c.mo2193c();
            c1084f.f3940a.f7535j.mo2982c("client_time", strMo2193c);
            Context context = this.f15914a;
            long j10 = Long.parseLong(StringsKt__StringsKt.substringBefore$default(strMo2193c, '.', (String) null, 2, (Object) null));
            if (this.f15918e != j10 / DurationKt.MILLIS_IN_DAY) {
                synchronized (context) {
                    if (this.f15918e != j10 / DurationKt.MILLIS_IN_DAY) {
                        try {
                            this.f15917d = C0392h.m789a(j10, context);
                            this.f15918e = j10 / DurationKt.MILLIS_IN_DAY;
                        } catch (Exception unused) {
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            String str = this.f15917d;
            if (str == null) {
                str = "";
            }
            C4189a<InterfaceC1091m> c4189a = C1086h.f3953a;
            c1084f.f3942c.mo2982c("Cookie", "s=".concat(str));
            Unit unit2 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
