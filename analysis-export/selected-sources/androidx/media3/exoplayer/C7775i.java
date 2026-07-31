package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.C7775i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import p039C2.C0513S;
import p039C2.InterfaceC0535u;
import p093F2.InterfaceC1479C;
import p183K2.AbstractC2758a;
import p183K2.C2737N0;
import p183K2.C2799u0;
import p183K2.InterfaceC2797t0;
import p201L2.C3193c0;
import p201L2.InterfaceC3188a;
import p273P2.InterfaceC4049n;
import p453Z2.AbstractC6658a;
import p453Z2.C6690u;
import p453Z2.C6691v;
import p453Z2.C6692w;
import p453Z2.C6693x;
import p453Z2.InterfaceC6640H;
import p453Z2.InterfaceC6661b0;
import p453Z2.InterfaceC6694y;
import p453Z2.InterfaceC6695z;
import p884z2.AbstractC20686A;

/* JADX INFO: renamed from: androidx.media3.exoplayer.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7775i {

    /* JADX INFO: renamed from: a */
    public final C3193c0 f26075a;

    /* JADX INFO: renamed from: e */
    public final C7771e f26079e;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3188a f26082h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0535u f26083i;

    /* JADX INFO: renamed from: k */
    public boolean f26085k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1479C f26086l;

    /* JADX INFO: renamed from: j */
    public InterfaceC6661b0 f26084j = new InterfaceC6661b0.a();

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap<InterfaceC6694y, c> f26077c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d */
    public final HashMap f26078d = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f26076b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final HashMap<c, b> f26080f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public final HashSet f26081g = new HashSet();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.i$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class a implements InterfaceC6640H, InterfaceC4049n {

        /* JADX INFO: renamed from: b */
        public final c f26087b;

        public a(c cVar) {
            this.f26087b = cVar;
        }

        @Override // p453Z2.InterfaceC6640H
        /* JADX INFO: renamed from: F */
        public final void mo3827F(int i10, InterfaceC6695z.b bVar, final C6690u c6690u, final C6693x c6693x, final IOException iOException, final boolean z10) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.E0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3827F(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second, c6690u, c6693x, iOException, z10);
                    }
                });
            }
        }

        @Override // p273P2.InterfaceC4049n
        /* JADX INFO: renamed from: H */
        public final void mo3829H(int i10, InterfaceC6695z.b bVar, final int i11) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.C0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3829H(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // p273P2.InterfaceC4049n
        /* JADX INFO: renamed from: K */
        public final void mo3832K(int i10, InterfaceC6695z.b bVar) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.A0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3832K(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second);
                    }
                });
            }
        }

        @Override // p273P2.InterfaceC4049n
        /* JADX INFO: renamed from: M */
        public final void mo3834M(int i10, InterfaceC6695z.b bVar, final Exception exc) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3834M(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // p273P2.InterfaceC4049n
        /* JADX INFO: renamed from: Q */
        public final void mo3838Q(int i10, InterfaceC6695z.b bVar) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.F0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3838Q(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: a */
        public final Pair<Integer, InterfaceC6695z.b> m9466a(int i10, InterfaceC6695z.b bVar) {
            InterfaceC6695z.b bVarM7558a;
            c cVar = this.f26087b;
            InterfaceC6695z.b bVar2 = null;
            if (bVar != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f26094c.size()) {
                        bVarM7558a = null;
                        break;
                    }
                    if (((InterfaceC6695z.b) cVar.f26094c.get(i11)).f22083d == bVar.f22083d) {
                        Object obj = bVar.f22080a;
                        Object obj2 = cVar.f26093b;
                        int i12 = AbstractC2758a.f9198d;
                        bVarM7558a = bVar.m7558a(Pair.create(obj2, obj));
                        break;
                    }
                    i11++;
                }
                if (bVarM7558a == null) {
                    return null;
                }
                bVar2 = bVarM7558a;
            }
            return Pair.create(Integer.valueOf(i10 + cVar.f26095d), bVar2);
        }

        @Override // p453Z2.InterfaceC6640H
        /* JADX INFO: renamed from: d */
        public final void mo3854d(int i10, InterfaceC6695z.b bVar, final C6690u c6690u, final C6693x c6693x) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.B0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3854d(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second, c6690u, c6693x);
                    }
                });
            }
        }

        @Override // p453Z2.InterfaceC6640H
        /* JADX INFO: renamed from: e */
        public final void mo3856e(int i10, InterfaceC6695z.b bVar, final C6690u c6690u, final C6693x c6693x, final int i11) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.D0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3856e(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second, c6690u, c6693x, i11);
                    }
                });
            }
        }

        @Override // p453Z2.InterfaceC6640H
        /* JADX INFO: renamed from: g */
        public final void mo3860g(int i10, InterfaceC6695z.b bVar, final C6690u c6690u, final C6693x c6693x) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3860g(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second, c6690u, c6693x);
                    }
                });
            }
        }

        @Override // p453Z2.InterfaceC6640H
        /* JADX INFO: renamed from: i */
        public final void mo3862i(int i10, InterfaceC6695z.b bVar, final C6693x c6693x) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3862i(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second, c6693x);
                    }
                });
            }
        }

        @Override // p273P2.InterfaceC4049n
        /* JADX INFO: renamed from: u */
        public final void mo3874u(int i10, InterfaceC6695z.b bVar) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        interfaceC3188a.mo3874u(((Integer) pair.first).intValue(), (InterfaceC6695z.b) pair.second);
                    }
                });
            }
        }

        @Override // p453Z2.InterfaceC6640H
        /* JADX INFO: renamed from: x */
        public final void mo3877x(int i10, InterfaceC6695z.b bVar, final C6693x c6693x) {
            final Pair<Integer, InterfaceC6695z.b> pairM9466a = m9466a(i10, bVar);
            if (pairM9466a != null) {
                C7775i.this.f26083i.mo936h(new Runnable() { // from class: K2.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3188a interfaceC3188a = C7775i.this.f26082h;
                        Pair pair = pairM9466a;
                        int iIntValue = ((Integer) pair.first).intValue();
                        InterfaceC6695z.b bVar2 = (InterfaceC6695z.b) pair.second;
                        bVar2.getClass();
                        interfaceC3188a.mo3877x(iIntValue, bVar2, c6693x);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.i$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6695z f26089a;

        /* JADX INFO: renamed from: b */
        public final C2799u0 f26090b;

        /* JADX INFO: renamed from: c */
        public final a f26091c;

        public b(InterfaceC6695z interfaceC6695z, C2799u0 c2799u0, a aVar) {
            this.f26089a = interfaceC6695z;
            this.f26090b = c2799u0;
            this.f26091c = aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.i$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c implements InterfaceC2797t0 {

        /* JADX INFO: renamed from: a */
        public final C6692w f26092a;

        /* JADX INFO: renamed from: d */
        public int f26095d;

        /* JADX INFO: renamed from: e */
        public boolean f26096e;

        /* JADX INFO: renamed from: c */
        public final ArrayList f26094c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f26093b = new Object();

        public c(InterfaceC6695z interfaceC6695z, boolean z10) {
            this.f26092a = new C6692w(interfaceC6695z, z10);
        }

        @Override // p183K2.InterfaceC2797t0
        /* JADX INFO: renamed from: a */
        public final AbstractC20686A mo3511a() {
            return this.f26092a.f22064o;
        }

        @Override // p183K2.InterfaceC2797t0
        public final Object getUid() {
            return this.f26093b;
        }
    }

    public C7775i(C7771e c7771e, InterfaceC3188a interfaceC3188a, InterfaceC0535u interfaceC0535u, C3193c0 c3193c0) {
        this.f26075a = c3193c0;
        this.f26079e = c7771e;
        this.f26082h = interfaceC3188a;
        this.f26083i = interfaceC0535u;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC20686A m9459a(int i10, ArrayList arrayList, InterfaceC6661b0 interfaceC6661b0) {
        if (!arrayList.isEmpty()) {
            this.f26084j = interfaceC6661b0;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                c cVar = (c) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f26076b;
                if (i11 > 0) {
                    c cVar2 = (c) arrayList2.get(i11 - 1);
                    cVar.f26095d = cVar2.f26092a.f22064o.f22042b.mo3453o() + cVar2.f26095d;
                    cVar.f26096e = false;
                    cVar.f26094c.clear();
                } else {
                    cVar.f26095d = 0;
                    cVar.f26096e = false;
                    cVar.f26094c.clear();
                }
                int iMo3453o = cVar.f26092a.f22064o.f22042b.mo3453o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((c) arrayList2.get(i12)).f26095d += iMo3453o;
                }
                arrayList2.add(i11, cVar);
                this.f26078d.put(cVar.f26093b, cVar);
                if (this.f26085k) {
                    m9463e(cVar);
                    if (this.f26077c.isEmpty()) {
                        this.f26081g.add(cVar);
                    } else {
                        b bVar = this.f26080f.get(cVar);
                        if (bVar != null) {
                            bVar.f26089a.mo7520m(bVar.f26090b);
                        }
                    }
                }
            }
        }
        return m9460b();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC20686A m9460b() {
        ArrayList arrayList = this.f26076b;
        if (arrayList.isEmpty()) {
            return AbstractC20686A.f70861a;
        }
        int iMo3453o = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f26095d = iMo3453o;
            iMo3453o += cVar.f26092a.f22064o.f22042b.mo3453o();
        }
        return new C2737N0(arrayList, this.f26084j);
    }

    /* JADX INFO: renamed from: c */
    public final void m9461c() {
        Iterator it = this.f26081g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f26094c.isEmpty()) {
                b bVar = this.f26080f.get(cVar);
                if (bVar != null) {
                    bVar.f26089a.mo7520m(bVar.f26090b);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9462d(c cVar) {
        if (cVar.f26096e && cVar.f26094c.isEmpty()) {
            b bVarRemove = this.f26080f.remove(cVar);
            bVarRemove.getClass();
            a aVar = bVarRemove.f26091c;
            InterfaceC6695z interfaceC6695z = bVarRemove.f26089a;
            interfaceC6695z.mo7514b(bVarRemove.f26090b);
            interfaceC6695z.mo7518j(aVar);
            interfaceC6695z.mo7519k(aVar);
            this.f26081g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [K2.u0, Z2.z$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public final void m9463e(c cVar) {
        C6692w c6692w = cVar.f26092a;
        ?? r10 = new InterfaceC6695z.c() { // from class: K2.u0
            @Override // p453Z2.InterfaceC6695z.c
            /* JADX INFO: renamed from: a */
            public final void mo3512a(AbstractC6658a abstractC6658a, AbstractC20686A abstractC20686A) {
                InterfaceC0535u interfaceC0535u = this.f9310a.f26079e.f25985i;
                interfaceC0535u.mo940l(2);
                interfaceC0535u.mo939k(22);
            }
        };
        a aVar = new a(cVar);
        this.f26080f.put(cVar, new b(c6692w, r10, aVar));
        String str = C0513S.f2002a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        c6692w.mo7517h(new Handler(looperMyLooper, null), aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        c6692w.mo7515d(new Handler(looperMyLooper2, null), aVar);
        c6692w.mo7516g(r10, this.f26086l, this.f26075a);
    }

    /* JADX INFO: renamed from: f */
    public final void m9464f(InterfaceC6694y interfaceC6694y) {
        IdentityHashMap<InterfaceC6694y, c> identityHashMap = this.f26077c;
        c cVarRemove = identityHashMap.remove(interfaceC6694y);
        cVarRemove.getClass();
        cVarRemove.f26092a.mo7455i(interfaceC6694y);
        cVarRemove.f26094c.remove(((C6691v) interfaceC6694y).f22052b);
        if (!identityHashMap.isEmpty()) {
            m9461c();
        }
        m9462d(cVarRemove);
    }

    /* JADX INFO: renamed from: g */
    public final void m9465g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f26076b;
            c cVar = (c) arrayList.remove(i12);
            this.f26078d.remove(cVar.f26093b);
            int i13 = -cVar.f26092a.f22064o.f22042b.mo3453o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f26095d += i13;
            }
            cVar.f26096e = true;
            if (this.f26085k) {
                m9462d(cVar);
            }
        }
    }
}
