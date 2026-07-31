package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import p039C2.C0503H;
import p039C2.C0513S;
import p183K2.C2785n0;
import p255O2.C3810c;
import p453Z2.C6654W;
import p453Z2.C6656Y;
import p535e3.C10739e;
import p601i3.InterfaceC12011M;
import p759r3.C17824a;
import p789t3.C18264a;
import p789t3.C18265b;
import p884z2.C20708n;
import p884z2.C20714t;
import p884z2.C20716v;
import p884z2.InterfaceC20703i;

/* JADX INFO: renamed from: androidx.media3.exoplayer.dash.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7770d implements Handler.Callback {

    /* JADX INFO: renamed from: b */
    public final C10739e f25929b;

    /* JADX INFO: renamed from: c */
    public final b f25930c;

    /* JADX INFO: renamed from: g */
    public C3810c f25934g;

    /* JADX INFO: renamed from: h */
    public boolean f25935h;

    /* JADX INFO: renamed from: i */
    public boolean f25936i;

    /* JADX INFO: renamed from: j */
    public boolean f25937j;

    /* JADX INFO: renamed from: f */
    public final TreeMap<Long, Long> f25933f = new TreeMap<>();

    /* JADX INFO: renamed from: e */
    public final Handler f25932e = C0513S.m1011p(this);

    /* JADX INFO: renamed from: d */
    public final C18265b f25931d = new C18265b();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f25938a;

        /* JADX INFO: renamed from: b */
        public final long f25939b;

        public a(long j10, long j11) {
            this.f25938a = j10;
            this.f25939b = j11;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface b {
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.d$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class c implements InterfaceC12011M {

        /* JADX INFO: renamed from: a */
        public final C6656Y f25940a;

        /* JADX INFO: renamed from: b */
        public final C2785n0 f25941b = new C2785n0();

        /* JADX INFO: renamed from: c */
        public final C17824a f25942c = new C17824a(1);

        /* JADX INFO: renamed from: d */
        public long f25943d = -9223372036854775807L;

        public c(C10739e c10739e) {
            this.f25940a = new C6656Y(c10739e, null, null);
        }

        @Override // p601i3.InterfaceC12011M
        /* JADX INFO: renamed from: a */
        public final int mo2092a(InterfaceC20703i interfaceC20703i, int i10, boolean z10) {
            return mo2096e(interfaceC20703i, i10, z10);
        }

        @Override // p601i3.InterfaceC12011M
        /* JADX INFO: renamed from: b */
        public final void mo2093b(int i10, C0503H c0503h) {
            mo2095d(c0503h, i10, 0);
        }

        @Override // p601i3.InterfaceC12011M
        /* JADX INFO: renamed from: c */
        public final void mo2094c(long j10, int i10, int i11, int i12, InterfaceC12011M.a aVar) {
            long jM7496i;
            long jM985W;
            this.f25940a.mo2094c(j10, i10, i11, i12, aVar);
            while (this.f25940a.m7510x(false)) {
                C17824a c17824a = this.f25942c;
                c17824a.mo3171g();
                if (this.f25940a.m7487C(this.f25941b, c17824a, 0, false) == -4) {
                    c17824a.m3174j();
                } else {
                    c17824a = null;
                }
                if (c17824a != null) {
                    long j11 = c17824a.f8196g;
                    C20714t c20714tM20229a = C7770d.this.f25931d.m20229a(c17824a);
                    if (c20714tM20229a != null) {
                        C18264a c18264a = (C18264a) c20714tM20229a.f71211a[0];
                        String str = c18264a.f56845a;
                        String str2 = c18264a.f56846b;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            try {
                                jM985W = C0513S.m985W(C0513S.m1012q(c18264a.f56849e));
                            } catch (C20716v unused) {
                                jM985W = -9223372036854775807L;
                            }
                            if (jM985W != -9223372036854775807L) {
                                a aVar2 = new a(j11, jM985W);
                                Handler handler = C7770d.this.f25932e;
                                handler.sendMessage(handler.obtainMessage(1, aVar2));
                            }
                        }
                    }
                }
            }
            C6656Y c6656y = this.f25940a;
            C6654W c6654w = c6656y.f21870a;
            synchronized (c6656y) {
                int i13 = c6656y.f21888s;
                jM7496i = i13 == 0 ? -1L : c6656y.m7496i(i13);
            }
            c6654w.m7483b(jM7496i);
        }

        @Override // p601i3.InterfaceC12011M
        /* JADX INFO: renamed from: d */
        public final void mo2095d(C0503H c0503h, int i10, int i11) {
            C6656Y c6656y = this.f25940a;
            c6656y.getClass();
            c6656y.mo2095d(c0503h, i10, 0);
        }

        @Override // p601i3.InterfaceC12011M
        /* JADX INFO: renamed from: e */
        public final int mo2096e(InterfaceC20703i interfaceC20703i, int i10, boolean z10) {
            C6656Y c6656y = this.f25940a;
            c6656y.getClass();
            return c6656y.mo2096e(interfaceC20703i, i10, z10);
        }

        @Override // p601i3.InterfaceC12011M
        /* JADX INFO: renamed from: f */
        public final void mo2097f(C20708n c20708n) {
            this.f25940a.mo2097f(c20708n);
        }
    }

    public C7770d(C3810c c3810c, b bVar, C10739e c10739e) {
        this.f25934g = c3810c;
        this.f25930c = bVar;
        this.f25929b = c10739e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.f25937j) {
            if (message.what != 1) {
                return false;
            }
            a aVar = (a) message.obj;
            long j10 = aVar.f25938a;
            long j11 = aVar.f25939b;
            Long lValueOf = Long.valueOf(j11);
            TreeMap<Long, Long> treeMap = this.f25933f;
            Long l10 = treeMap.get(lValueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
