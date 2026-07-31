package sg;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import p011Aa.C0113z;
import p017Ag.C0168z;
import p107Fg.C1634b;
import p107Fg.C1637e;
import p125Gg.C1917y;
import p233Mg.C3578p;
import p233Mg.C3582t;

/* JADX INFO: renamed from: sg.s */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C18221s {

    /* JADX INFO: renamed from: c */
    public static final C1634b f56734c;

    /* JADX INFO: renamed from: a */
    public final C18222t f56735a;

    /* JADX INFO: renamed from: b */
    public final C1917y f56736b;

    static {
        Reflection.getOrCreateKotlinClass(C18221s.class).getSimpleName();
        f56734c = new C1634b();
    }

    public C18221s(C18222t c18222t, C1917y c1917y) {
        this.f56735a = c18222t;
        this.f56736b = c1917y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m20542a(ContinuationImpl continuationImpl) {
        C18219q c18219q;
        if (continuationImpl instanceof C18219q) {
            c18219q = (C18219q) continuationImpl;
            int i10 = c18219q.f56728m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c18219q.f56728m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c18219q = new C18219q(this, continuationImpl);
            }
        } else {
            c18219q = new C18219q(this, continuationImpl);
        }
        Object obj = c18219q.f56726k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c18219q.f56728m;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return null;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return null;
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f56736b.getValue();
            if (!StringsKt.isBlank(str)) {
                C0113z c0113z = C0168z.f568a;
                return C0168z.f568a.mo163e(str, C3582t.Companion.serializer());
            }
            c18219q.f56725j = SpillingKt.nullOutSpilledVariable(str);
            c18219q.f56728m = 1;
            if (C1637e.m2266d(f56734c, "Cached value is empty", new Object[0], c18219q) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return null;
        } catch (Exception e10) {
            C1634b c1634b = f56734c;
            c18219q.f56725j = SpillingKt.nullOutSpilledVariable(e10);
            c18219q.f56728m = 2;
            if (C1637e.m2265c(c1634b, "Decode cached data is failed", e10, c18219q) != coroutine_suspended) {
                return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
    
        if (r12 == r7) goto L58;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20543b(C3578p c3578p, ContinuationImpl continuationImpl) {
        C18220r c18220r;
        C3578p c3578p2;
        Exception exc;
        C3582t c3582t;
        Object objM2265c;
        if (continuationImpl instanceof C18220r) {
            c18220r = (C18220r) continuationImpl;
            int i10 = c18220r.f56733n;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c18220r.f56733n = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c18220r = new C18220r(this, continuationImpl);
            }
        } else {
            c18220r = new C18220r(this, continuationImpl);
        }
        C18220r c18220r2 = c18220r;
        Object objM25471b = c18220r2.f56731l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c18220r2.f56733n;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objM25471b);
                try {
                    C18222t c18222t = this.f56735a;
                    c18220r2.f56729j = SpillingKt.nullOutSpilledVariable(c3578p);
                    c18220r2.f56733n = 1;
                    try {
                        try {
                            c3578p2 = c3578p;
                            try {
                                objM25471b = c18222t.f56737a.m25471b("/getMetadata", c3578p2, C3578p.Companion.serializer(), C3582t.Companion.serializer(), c18220r2);
                                if (objM25471b != coroutine_suspended) {
                                    c3578p = c3578p2;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                exc = e;
                                c3578p = c3578p2;
                                c18220r2.f56729j = SpillingKt.nullOutSpilledVariable(c3578p);
                                c18220r2.f56730k = SpillingKt.nullOutSpilledVariable(exc);
                                c18220r2.f56733n = 2;
                                objM25471b = m20542a(c18220r2);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            c3578p2 = c3578p;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        c3578p2 = c3578p;
                    }
                } catch (Exception e13) {
                    e = e13;
                    exc = e;
                    c18220r2.f56729j = SpillingKt.nullOutSpilledVariable(c3578p);
                    c18220r2.f56730k = SpillingKt.nullOutSpilledVariable(exc);
                    c18220r2.f56733n = 2;
                    objM25471b = m20542a(c18220r2);
                }
                return coroutine_suspended;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3582t c3582t2 = (C3582t) c18220r2.f56730k;
                    ResultKt.throwOnFailure(objM25471b);
                    return c3582t2;
                }
                ResultKt.throwOnFailure(objM25471b);
                C3582t c3582t3 = (C3582t) objM25471b;
                if (c3582t3 != null) {
                    return c3582t3;
                }
                C3582t.Companion.getClass();
                return C3582t.f11761e;
            }
            c3578p = (C3578p) c18220r2.f56729j;
            try {
                ResultKt.throwOnFailure(objM25471b);
            } catch (Exception e14) {
                e = e14;
                exc = e;
                c18220r2.f56729j = SpillingKt.nullOutSpilledVariable(c3578p);
                c18220r2.f56730k = SpillingKt.nullOutSpilledVariable(exc);
                c18220r2.f56733n = 2;
                objM25471b = m20542a(c18220r2);
            }
            C1917y c1917y = this.f56736b;
            C0113z c0113z = C0168z.f568a;
            c1917y.setValue(C0168z.f568a.mo162b(c3582t, C3582t.Companion.serializer()));
        } catch (Exception e15) {
            objM2265c = C1637e.m2265c(f56734c, "Save metadata to cache is failed", e15, c18220r2);
            if (objM2265c != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (objM2265c == coroutine_suspended) {
                return coroutine_suspended;
            }
            return c3582t;
        }
        c3582t = (C3582t) objM25471b;
        c18220r2.f56729j = SpillingKt.nullOutSpilledVariable(c3578p);
        c18220r2.f56730k = c3582t;
        c18220r2.f56733n = 3;
        objM2265c = Unit.INSTANCE;
        if (objM2265c == coroutine_suspended) {
            return coroutine_suspended;
        }
        return c3582t;
    }
}
