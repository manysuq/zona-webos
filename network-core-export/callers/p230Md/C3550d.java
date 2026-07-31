package p230Md;

import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import mg.C17048k;
import mg.C17057t;
import mg.InterfaceC17049l;
import p016Af.EnumC0137f;
import p016Af.InterfaceC0134c;
import p086Ed.C1428y;
import p114G5.C1719g;
import p114G5.InterfaceC1715c;
import p179Jg.EnumC2623b;
import p192Kb.C2926J;
import p233Mg.C3573k;
import p269Og.C3974S;
import p269Og.C3986c;
import p269Og.C4004l;
import p269Og.InterfaceC4011r;
import p366U5.InterfaceC5372f;
import p384V5.InterfaceC5655c;
import p402W5.InterfaceC5862d;
import p410Wd.C5941z;
import p410Wd.InterfaceC5928m;
import p420X5.C6224b;
import p438Y5.InterfaceC6450f;
import p450Z.C6625h;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p524da.C10427i;
import p524da.C10428i0;
import p524da.C10454v0;
import p524da.C10456w0;
import p524da.InterfaceC10452u0;
import p558fa.C11095d;
import p689mb.C16972W;
import p689mb.C16973X;
import p770rf.InterfaceC17978p;
import p770rf.InterfaceC17981s;
import p771rg.InterfaceC17991c;
import p845wg.C19140H5;

/* JADX INFO: renamed from: Md.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nReportComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportComponent.kt\nru/zona/app/components/report/ReportComponent\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,193:1\n230#2,5:194\n230#2,5:199\n230#2,5:204\n230#2,5:209\n230#2,5:214\n230#2,5:219\n230#2,5:224\n230#2,5:229\n*S KotlinDebug\n*F\n+ 1 ReportComponent.kt\nru/zona/app/components/report/ReportComponent\n*L\n87#1:194,5\n95#1:199,5\n140#1:204,5\n170#1:209,5\n151#1:214,5\n152#1:219,5\n155#1:224,5\n156#1:229,5\n*E\n"})
public final class C3550d implements InterfaceC3547a, InterfaceC1715c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1715c f11657b;

    /* JADX INFO: renamed from: c */
    public final Function0<Unit> f11658c;

    /* JADX INFO: renamed from: d */
    public final EnumC0137f f11659d;

    /* JADX INFO: renamed from: e */
    public final C3986c f11660e;

    /* JADX INFO: renamed from: f */
    public final C4004l f11661f;

    /* JADX INFO: renamed from: g */
    public final C2926J f11662g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0134c f11663h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC17981s f11664i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC17991c f11665j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC17978p f11666k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17049l f11667l;

    /* JADX INFO: renamed from: m */
    public final C11095d f11668m;

    /* JADX INFO: renamed from: n */
    public final C10454v0 f11669n;

    /* JADX INFO: renamed from: o */
    public final C10428i0 f11670o;

    /* JADX INFO: renamed from: p */
    public final C10454v0 f11671p;

    /* JADX INFO: renamed from: q */
    public final C10428i0 f11672q;

    /* JADX INFO: renamed from: r */
    public final C3573k f11673r;

    /* JADX INFO: renamed from: s */
    public final C6625h f11674s;

    /* JADX INFO: renamed from: t */
    public final C6625h f11675t;

    /* JADX INFO: renamed from: u */
    public long f11676u;

    /* JADX INFO: renamed from: Md.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.report.ReportComponent$1", m18778f = "ReportComponent.kt", m18779i = {1, 2, 3}, m18780l = {68, 71, 72, 73}, m18781m = "invokeSuspend", m18782n = {"content", "content", "content"}, m18783nl = {69, 72, 73, 74}, m18784s = {"L$0", "L$0", "L$0"}, m18785v = 2)
    @SourceDebugExtension({"SMAP\nReportComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportComponent.kt\nru/zona/app/components/report/ReportComponent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,193:1\n230#2,5:194\n*S KotlinDebug\n*F\n+ 1 ReportComponent.kt\nru/zona/app/components/report/ReportComponent$1\n*L\n76#1:194,5\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f11677j;

        /* JADX INFO: renamed from: k */
        public int f11678k;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C3550d.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        
            if (r11 == r2) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
        
            if (r11 == r2) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
        
            if (r11 == r2) goto L52;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            String name;
            String strMo6789a;
            String name2;
            String strMo6789a2;
            String str2;
            C10454v0 c10454v0;
            Object value;
            C3550d c3550d = C3550d.this;
            C3986c c3986c = c3550d.f11660e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11678k;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC17991c interfaceC17991c = c3550d.f11665j;
                String str3 = c3986c.f13105b;
                EnumC2623b enumC2623b = EnumC2623b.Lite;
                this.f11678k = 1;
                obj = interfaceC17991c.mo20313a(str3, enumC2623b, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    str = (String) obj;
                    str2 = str;
                    c10454v0 = c3550d.f11669n;
                    do {
                        value = c10454v0.getValue();
                    } while (!c10454v0.mo12533d(value, InterfaceC3547a.a.m4319a((InterfaceC3547a.a) value, str2, c3550d.f11663h.mo196b(c3550d.f11659d), null, false, null, 28)));
                    return Unit.INSTANCE;
                }
                if (i10 == 3) {
                    ResultKt.throwOnFailure(obj);
                    str = (String) obj;
                    str2 = str;
                    c10454v0 = c3550d.f11669n;
                    do {
                        value = c10454v0.getValue();
                    } while (!c10454v0.mo12533d(value, InterfaceC3547a.a.m4319a((InterfaceC3547a.a) value, str2, c3550d.f11663h.mo196b(c3550d.f11659d), null, false, null, 28)));
                    return Unit.INSTANCE;
                }
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                str = (String) obj;
                str2 = str;
                c10454v0 = c3550d.f11669n;
                do {
                    value = c10454v0.getValue();
                } while (!c10454v0.mo12533d(value, InterfaceC3547a.a.m4319a((InterfaceC3547a.a) value, str2, c3550d.f11663h.mo196b(c3550d.f11659d), null, false, null, 28)));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            str = null;
            InterfaceC5928m interfaceC5928mM6817d = C5941z.m6817d((InterfaceC4011r) obj, c3550d.f11666k, (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, null, null);
            int iOrdinal = c3986c.f13106c.ordinal();
            String str4 = "";
            if (iOrdinal == 1) {
                C16972W c16972w = (C16972W) C19140H5.f59887w.getValue();
                if (interfaceC5928mM6817d == null || (name = interfaceC5928mM6817d.getName()) == null) {
                    name = "";
                }
                if (interfaceC5928mM6817d != null && (strMo6789a = interfaceC5928mM6817d.mo6789a()) != null) {
                    str4 = strMo6789a;
                }
                this.f11677j = SpillingKt.nullOutSpilledVariable(interfaceC5928mM6817d);
                this.f11678k = 2;
                obj = C16973X.m19463b(c16972w, new Object[]{name, str4}, this);
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 4) {
                        C16972W c16972w2 = (C16972W) C19140H5.f59881t.getValue();
                        this.f11677j = SpillingKt.nullOutSpilledVariable(interfaceC5928mM6817d);
                        this.f11678k = 4;
                        obj = C16973X.m19462a(c16972w2, this);
                    }
                    str2 = str;
                    c10454v0 = c3550d.f11669n;
                    do {
                        value = c10454v0.getValue();
                    } while (!c10454v0.mo12533d(value, InterfaceC3547a.a.m4319a((InterfaceC3547a.a) value, str2, c3550d.f11663h.mo196b(c3550d.f11659d), null, false, null, 28)));
                    return Unit.INSTANCE;
                }
                C16972W c16972w3 = (C16972W) C19140H5.f59889x.getValue();
                if (interfaceC5928mM6817d == null || (name2 = interfaceC5928mM6817d.getName()) == null) {
                    name2 = "";
                }
                if (interfaceC5928mM6817d != null && (strMo6789a2 = interfaceC5928mM6817d.mo6789a()) != null) {
                    str4 = strMo6789a2;
                }
                this.f11677j = SpillingKt.nullOutSpilledVariable(interfaceC5928mM6817d);
                this.f11678k = 3;
                obj = C16973X.m19463b(c16972w3, new Object[]{name2, str4}, this);
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: Md.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.report.ReportComponent$sendReport$1", m18778f = "ReportComponent.kt", m18779i = {}, m18780l = {130}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {129}, m18784s = {}, m18785v = 2)
    public static final class b extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public InterfaceC17049l f11680j;

        /* JADX INFO: renamed from: k */
        public int f11681k;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C3550d.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC17049l interfaceC17049l;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11681k;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC17049l interfaceC17049l2 = C3550d.this.f11667l;
                C16972W c16972w = (C16972W) C19140H5.f59883u.getValue();
                Object[] objArr = {Boxing.boxInt(20), Boxing.boxInt(200)};
                this.f11680j = interfaceC17049l2;
                this.f11681k = 1;
                Object objM19463b = C16973X.m19463b(c16972w, objArr, this);
                if (objM19463b == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC17049l = interfaceC17049l2;
                obj = objM19463b;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC17049l = this.f11680j;
                ResultKt.throwOnFailure(obj);
            }
            interfaceC17049l.mo19497b((String) obj);
            return Unit.INSTANCE;
        }
    }

    public C3550d(InterfaceC1715c interfaceC1715c, Function0<Unit> function0, EnumC0137f enumC0137f, C3986c c3986c, C4004l c4004l, C2926J c2926j, InterfaceC0134c interfaceC0134c, InterfaceC17981s interfaceC17981s, InterfaceC17991c interfaceC17991c, InterfaceC17978p interfaceC17978p, InterfaceC17049l interfaceC17049l) {
        this.f11657b = interfaceC1715c;
        this.f11658c = function0;
        this.f11659d = enumC0137f;
        this.f11660e = c3986c;
        this.f11661f = c4004l;
        this.f11662g = c2926j;
        this.f11663h = interfaceC0134c;
        this.f11664i = interfaceC17981s;
        this.f11665j = interfaceC17991c;
        this.f11666k = interfaceC17978p;
        this.f11667l = interfaceC17049l;
        C11095d c11095dM7048b = C6224b.m7048b(this);
        this.f11668m = c11095dM7048b;
        C10454v0 c10454v0M12580a = C10456w0.m12580a(new InterfaceC3547a.a(0));
        this.f11669n = c10454v0M12580a;
        this.f11670o = C10427i.m12535a(c10454v0M12580a);
        C10454v0 c10454v0M12580a2 = C10456w0.m12580a(Boolean.FALSE);
        this.f11671p = c10454v0M12580a2;
        this.f11672q = C10427i.m12535a(c10454v0M12580a2);
        this.f11673r = interfaceC0134c.mo198d();
        this.f11674s = new C6625h(null, 3);
        this.f11675t = new C6625h(null, 3);
        C7106g.m8045c(c11095dM7048b, null, null, new a(null), 3);
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: K */
    public final InterfaceC5372f mo793K() {
        return this.f11657b.mo793K();
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: a */
    public final Function0<Unit> mo4309a() {
        return this.f11658c;
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: b */
    public final void mo4310b() {
        if (StringsKt__StringsJVMKt.replace$default(C17048k.m19495a(this.f11674s), " ", "", false, 4, (Object) null).length() < 200) {
            m4320k();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f11676u >= 2000) {
            this.f11676u = jCurrentTimeMillis;
        }
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: c */
    public final C6625h mo4311c() {
        return this.f11675t;
    }

    @Override // p230Md.InterfaceC3547a
    public final void close() {
        this.f11658c.invoke();
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: d */
    public final void mo4312d(String str) {
        C17048k.m19496b(this.f11675t, str);
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: e */
    public final C10428i0 mo4313e() {
        return this.f11672q;
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: f */
    public final void mo4314f(C3573k c3573k) {
        while (true) {
            C10454v0 c10454v0 = this.f11669n;
            Object value = c10454v0.getValue();
            C3573k c3573k2 = c3573k;
            if (c10454v0.mo12533d(value, InterfaceC3547a.a.m4319a((InterfaceC3547a.a) value, null, null, c3573k2, false, null, 59))) {
                m4320k();
                return;
            }
            c3573k = c3573k2;
        }
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: g */
    public final C3573k mo4315g() {
        return this.f11673r;
    }

    @Override // p230Md.InterfaceC3547a
    public final C6625h getDescription() {
        return this.f11674s;
    }

    @Override // p114G5.InterfaceC1715c
    public final InterfaceC5862d getLifecycle() {
        return this.f11657b.getLifecycle();
    }

    @Override // p230Md.InterfaceC3547a
    public final InterfaceC10452u0<InterfaceC3547a.a> getState() {
        return this.f11670o;
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: h */
    public final void mo4316h() {
        C10454v0 c10454v0;
        Object value;
        if (((InterfaceC3547a.a) this.f11670o.f32389b.getValue()).f11651c == null) {
            do {
                c10454v0 = this.f11669n;
                value = c10454v0.getValue();
            } while (!c10454v0.mo12533d(value, InterfaceC3547a.a.m4319a((InterfaceC3547a.a) value, null, null, this.f11673r, false, null, 59)));
        }
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: i */
    public final void mo4317i() {
        this.f11664i.mo20338a(C17048k.m19495a(this.f11675t));
    }

    @Override // p230Md.InterfaceC3547a
    /* JADX INFO: renamed from: j */
    public final void mo4318j() {
        C10454v0 c10454v0;
        Object value;
        String str;
        int length;
        C10428i0 c10428i0 = this.f11670o;
        boolean zAreEqual = Intrinsics.areEqual(((InterfaceC3547a.a) c10428i0.f32389b.getValue()).f11651c, this.f11673r);
        C6625h c6625h = this.f11674s;
        if (zAreEqual && (20 > (length = StringsKt__StringsJVMKt.replace$default(C17048k.m19495a(c6625h), " ", "", false, 4, (Object) null).length()) || length >= 201)) {
            C7106g.m8045c(this.f11668m, null, null, new b(null), 3);
            return;
        }
        do {
            c10454v0 = this.f11671p;
            value = c10454v0.getValue();
            ((Boolean) value).getClass();
        } while (!c10454v0.mo12533d(value, Boolean.TRUE));
        C3573k c3573k = ((InterfaceC3547a.a) c10428i0.f32389b.getValue()).f11651c;
        if (c3573k == null || (str = c3573k.f11732a) == null) {
            return;
        }
        String lowerCase = this.f11659d.name().toLowerCase(Locale.ROOT);
        Long longOrNull = StringsKt.toLongOrNull(this.f11660e.f13105b);
        String strM19495a = C17048k.m19495a(c6625h);
        String strM19495a2 = C17048k.m19495a(this.f11675t);
        this.f11663h.mo197c(lowerCase, str, longOrNull, this.f11662g, strM19495a, (!StringsKt.isBlank(strM19495a2) && C17057t.f53478a.matches(strM19495a2)) ? strM19495a2 : "", C3974S.m4698a(this.f11661f), new C1428y(this, 1), new C3549c(this));
    }

    /* JADX INFO: renamed from: k */
    public final void m4320k() {
        C10454v0 c10454v0;
        Object value;
        C3573k c3573k = ((InterfaceC3547a.a) this.f11670o.f32389b.getValue()).f11651c;
        boolean z10 = (c3573k == null || (Intrinsics.areEqual(c3573k, this.f11673r) && StringsKt.isBlank(C17048k.m19495a(this.f11674s)))) ? false : true;
        do {
            c10454v0 = this.f11669n;
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, InterfaceC3547a.a.m4319a((InterfaceC3547a.a) value, null, null, null, z10, null, 55)));
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: n */
    public final InterfaceC5655c mo795n() {
        return this.f11657b.mo795n();
    }

    @Override // p230Md.InterfaceC3547a
    public final void setDescription(String str) {
        C6625h c6625h = this.f11674s;
        if (StringsKt__StringsJVMKt.replace$default(C17048k.m19495a(c6625h), " ", "", false, 4, (Object) null).length() < 200) {
            C17048k.m19496b(c6625h, str);
            Unit unit = Unit.INSTANCE;
            m4320k();
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f11676u >= 2000) {
                this.f11676u = jCurrentTimeMillis;
            }
        }
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: u */
    public final C1719g mo796u() {
        return this.f11657b.mo796u();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: x */
    public final InterfaceC6450f mo797x() {
        return this.f11657b.mo797x();
    }
}
