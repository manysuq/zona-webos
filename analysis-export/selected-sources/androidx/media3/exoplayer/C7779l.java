package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p039C2.C0506K;
import p039C2.C0515a;
import p039C2.InterfaceC0535u;
import p170J7.AbstractC2481A;
import p183K2.C2723G0;
import p183K2.C2725H0;
import p183K2.RunnableC2727I0;
import p201L2.C3193c0;
import p242N7.AbstractC3636a;
import p242N7.C3646k;
import p242N7.C3648m;
import p242N7.C3652q;
import p242N7.EnumC3644i;
import p453Z2.AbstractC6658a;
import p453Z2.C6677j0;
import p453Z2.InterfaceC6641I;
import p453Z2.InterfaceC6659a0;
import p453Z2.InterfaceC6694y;
import p453Z2.InterfaceC6695z;
import p535e3.C10739e;
import p884z2.AbstractC20686A;
import p884z2.C20711q;

/* JADX INFO: renamed from: androidx.media3.exoplayer.l */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7779l implements AutoCloseable {

    /* JADX INFO: renamed from: b */
    public final C20711q f26100b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6641I f26101c;

    /* JADX INFO: renamed from: d */
    public final Object f26102d = new Object();

    /* JADX INFO: renamed from: e */
    public final ArrayList f26103e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public C3652q<a> f26104f;

    /* JADX INFO: renamed from: g */
    public b f26105g;

    /* JADX INFO: renamed from: h */
    public boolean f26106h;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.l$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C6677j0 f26107a;

        /* JADX INFO: renamed from: b */
        public final AbstractC20686A f26108b;

        public a(C6677j0 c6677j0, AbstractC20686A abstractC20686A) {
            this.f26107a = c6677j0;
            this.f26108b = abstractC20686A;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.l$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class b {

        /* JADX INFO: renamed from: f */
        public static final c f26109f = new c();

        /* JADX INFO: renamed from: a */
        public final InterfaceC6641I f26110a;

        /* JADX INFO: renamed from: b */
        public final C20711q f26111b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0535u f26112c;

        /* JADX INFO: renamed from: d */
        public final C2723G0 f26113d;

        /* JADX INFO: renamed from: e */
        public final C2725H0 f26114e;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.l$b$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public final class a implements Handler.Callback {

            /* JADX INFO: renamed from: b */
            public final C21136a f26115b = new C21136a();

            /* JADX INFO: renamed from: c */
            public InterfaceC6695z f26116c;

            /* JADX INFO: renamed from: d */
            public InterfaceC6694y f26117d;

            /* JADX INFO: renamed from: e */
            public AbstractC20686A f26118e;

            /* JADX INFO: renamed from: f */
            public boolean f26119f;

            /* JADX INFO: renamed from: androidx.media3.exoplayer.l$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public final class C21136a implements InterfaceC6695z.c {

                /* JADX INFO: renamed from: a */
                public final C21137a f26121a = new C21137a();

                /* JADX INFO: renamed from: b */
                public final C10739e f26122b = new C10739e();

                /* JADX INFO: renamed from: c */
                public boolean f26123c;

                /* JADX INFO: renamed from: androidx.media3.exoplayer.l$b$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
                public final class C21137a implements InterfaceC6694y.a {
                    public C21137a() {
                    }

                    @Override // p453Z2.InterfaceC6659a0.a
                    /* JADX INFO: renamed from: a */
                    public final void mo5138a(InterfaceC6659a0 interfaceC6659a0) {
                        b.this.f26112c.mo932d(3).m942b();
                    }

                    @Override // p453Z2.InterfaceC6694y.a
                    /* JADX INFO: renamed from: e */
                    public final void mo7447e(InterfaceC6694y interfaceC6694y) {
                        C2723G0 c2723g0 = b.this.f26113d;
                        C6677j0 trackGroups = interfaceC6694y.getTrackGroups();
                        AbstractC20686A abstractC20686A = a.this.f26118e;
                        abstractC20686A.getClass();
                        C7779l c7779l = c2723g0.f9117a;
                        synchronized (c7779l.f26102d) {
                            C3652q<a> c3652q = c7779l.f26104f;
                            c3652q.getClass();
                            c3652q.m4405n(new a(trackGroups, abstractC20686A));
                        }
                        b.this.f26112c.mo932d(4).m942b();
                    }
                }

                public C21136a() {
                }

                @Override // p453Z2.InterfaceC6695z.c
                /* JADX INFO: renamed from: a */
                public final void mo3512a(AbstractC6658a abstractC6658a, AbstractC20686A abstractC20686A) {
                    a aVar = a.this;
                    aVar.f26118e = abstractC20686A;
                    if (this.f26123c) {
                        return;
                    }
                    this.f26123c = true;
                    InterfaceC6694y interfaceC6694yMo7454f = abstractC6658a.mo7454f(new InterfaceC6695z.b(abstractC20686A.mo3484l(0)), this.f26122b, 0L);
                    aVar.f26117d = interfaceC6694yMo7454f;
                    interfaceC6694yMo7454f.mo5134d(this.f26121a, 0L);
                }
            }

            public a() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (this.f26119f) {
                    return true;
                }
                int i10 = message.what;
                if (i10 == 1) {
                    InterfaceC6695z interfaceC6695zMo7475a = b.this.f26110a.mo7475a((C20711q) message.obj);
                    this.f26116c = interfaceC6695zMo7475a;
                    interfaceC6695zMo7475a.mo7516g(this.f26115b, null, C3193c0.f10366d);
                    b.this.f26112c.mo939k(2);
                    return true;
                }
                if (i10 == 2) {
                    try {
                        InterfaceC6694y interfaceC6694y = this.f26117d;
                        if (interfaceC6694y == null) {
                            InterfaceC6695z interfaceC6695z = this.f26116c;
                            interfaceC6695z.getClass();
                            interfaceC6695z.mo7456l();
                        } else {
                            interfaceC6694y.maybeThrowPrepareError();
                        }
                        b.this.f26112c.mo938j();
                        return true;
                    } catch (IOException e10) {
                        b.this.f26114e.m3435a(e10);
                        b.this.f26112c.mo932d(4).m942b();
                        return true;
                    }
                }
                if (i10 == 3) {
                    InterfaceC6694y interfaceC6694y2 = this.f26117d;
                    interfaceC6694y2.getClass();
                    C7773g.a aVar = new C7773g.a();
                    aVar.f26030a = 0L;
                    interfaceC6694y2.mo5133c(new C7773g(aVar));
                    return true;
                }
                if (i10 != 4) {
                    return false;
                }
                if (this.f26117d != null) {
                    InterfaceC6695z interfaceC6695z2 = this.f26116c;
                    interfaceC6695z2.getClass();
                    interfaceC6695z2.mo7455i(this.f26117d);
                }
                InterfaceC6695z interfaceC6695z3 = this.f26116c;
                if (interfaceC6695z3 != null) {
                    interfaceC6695z3.mo7514b(this.f26115b);
                }
                b.this.f26112c.mo933e();
                c cVar = b.f26109f;
                synchronized (cVar) {
                    try {
                        int i11 = cVar.f26129c - 1;
                        cVar.f26129c = i11;
                        if (i11 == 0) {
                            HandlerThread handlerThread = cVar.f26128b;
                            handlerThread.getClass();
                            handlerThread.quit();
                            cVar.f26128b = null;
                            cVar.f26127a.clear();
                        } else {
                            cVar.m9471a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f26119f = true;
                return true;
            }
        }

        public b(InterfaceC6641I interfaceC6641I, C20711q c20711q, C2723G0 c2723g0, C2725H0 c2725h0) {
            Looper looper;
            this.f26110a = interfaceC6641I;
            this.f26111b = c20711q;
            this.f26113d = c2723g0;
            this.f26114e = c2725h0;
            c cVar = f26109f;
            synchronized (cVar) {
                try {
                    if (cVar.f26128b == null) {
                        C0515a.m1030f(cVar.f26129c == 0);
                        HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
                        cVar.f26128b = handlerThread;
                        handlerThread.start();
                    }
                    cVar.f26129c++;
                    HandlerThread handlerThread2 = cVar.f26128b;
                    handlerThread2.getClass();
                    looper = handlerThread2.getLooper();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f26112c = new C0506K(new Handler(looper, new a()));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.l$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c {

        /* JADX INFO: renamed from: d */
        public static final AtomicInteger f26126d = new AtomicInteger(5);

        /* JADX INFO: renamed from: a */
        public final ArrayDeque f26127a = new ArrayDeque();

        /* JADX INFO: renamed from: b */
        public HandlerThread f26128b;

        /* JADX INFO: renamed from: c */
        public int f26129c;

        /* JADX INFO: renamed from: a */
        public final void m9471a() {
            ArrayDeque arrayDeque = this.f26127a;
            if (!arrayDeque.isEmpty() && this.f26129c - arrayDeque.size() < f26126d.get()) {
                b bVar = (b) arrayDeque.removeFirst();
                bVar.f26112c.mo934f(1, bVar.f26111b).m942b();
            }
        }
    }

    public C7779l(C20711q c20711q, InterfaceC6641I interfaceC6641I) {
        this.f26100b = c20711q;
        this.f26101c = interfaceC6641I;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC3636a.i m9468a() {
        synchronized (this.f26102d) {
            try {
                if (this.f26106h) {
                    IllegalStateException illegalStateException = new IllegalStateException("Retriever is released.");
                    C3648m c3648m = new C3648m();
                    c3648m.m4383m(illegalStateException);
                    return c3648m;
                }
                m9470c();
                C3652q c3652q = new C3652q();
                this.f26103e.add(c3652q);
                C3652q<a> c3652q2 = this.f26104f;
                c3652q2.getClass();
                C7778k c7778k = new C7778k(c3652q);
                c3652q2.mo49b(new C3646k.a(c3652q2, c7778k), EnumC3644i.f11985b);
                return c3652q;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC3636a.i m9469b() {
        synchronized (this.f26102d) {
            try {
                if (this.f26106h) {
                    IllegalStateException illegalStateException = new IllegalStateException("Retriever is released.");
                    C3648m c3648m = new C3648m();
                    c3648m.m4383m(illegalStateException);
                    return c3648m;
                }
                m9470c();
                C3652q c3652q = new C3652q();
                this.f26103e.add(c3652q);
                C3652q<a> c3652q2 = this.f26104f;
                c3652q2.getClass();
                C7777j c7777j = new C7777j(c3652q);
                c3652q2.mo49b(new C3646k.a(c3652q2, c7777j), EnumC3644i.f11985b);
                return c3652q;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9470c() {
        if (this.f26104f == null) {
            this.f26104f = new C3652q<>();
            b bVar = new b(this.f26101c, this.f26100b, new C2723G0(this), new C2725H0(this));
            this.f26105g = bVar;
            c cVar = b.f26109f;
            synchronized (cVar) {
                cVar.f26127a.addLast(bVar);
                cVar.m9471a();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f26102d) {
            try {
                if (this.f26106h) {
                    return;
                }
                this.f26106h = true;
                ArrayList arrayList = this.f26103e;
                AbstractC2481A.b bVar = AbstractC2481A.f8293c;
                arrayList.getClass();
                new C3646k.b(AbstractC2481A.m3204n(arrayList)).m4401a(new RunnableC2727I0(this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
