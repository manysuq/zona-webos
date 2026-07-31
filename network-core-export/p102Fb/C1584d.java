package p102Fb;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p341Sg.C4939b;

/* JADX INFO: renamed from: Fb.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C1584d extends C1585e implements InterfaceC1587g {

    /* JADX INFO: renamed from: f */
    public static final Boolean f5194f = Boolean.valueOf(Boolean.getBoolean(C4939b.m5520a(70, 72, 65, 64, 93, 74, 123, 70, 66, 74, 47, 103, 74, 78, 75, 74, 93, 92)));

    /* JADX INFO: renamed from: d */
    public String f5195d;

    /* JADX INFO: renamed from: e */
    public final Map<Integer, Long> f5196e;

    /* JADX INFO: renamed from: Fb.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5197a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5198b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicInteger f5199c;

        public a(int i10, String str, AtomicInteger atomicInteger) {
            this.f5197a = i10;
            this.f5198b = str;
            this.f5199c = atomicInteger;
        }

        /* JADX INFO: renamed from: a */
        public final void m2187a(Map map) {
            Map map2 = map;
            try {
                Long l10 = C1584d.this.f5196e.get(Integer.valueOf(this.f5197a));
                if (l10 != null && l10.longValue() > 0) {
                    Thread.sleep(l10.longValue());
                }
            } catch (Exception unused) {
            }
            synchronized (C1584d.this) {
                if (map2 != null) {
                    try {
                        C1584d c1584d = C1584d.this;
                        if (c1584d.f5195d == null) {
                            c1584d.f5195d = this.f5198b;
                            c1584d.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f5199c.decrementAndGet();
                if (this.f5199c.get() == 0) {
                    C1584d.this.notifyAll();
                }
            }
        }
    }

    public C1584d(List<String> list) {
        this(list, Collections.EMPTY_MAP);
    }

    @Override // p102Fb.InterfaceC1587g
    /* JADX INFO: renamed from: b */
    public final String mo2186b(InterfaceC1590j interfaceC1590j) {
        if (f5194f.booleanValue()) {
            return this.f5202a.get(0);
        }
        if (this.f5195d == null) {
            synchronized (this) {
                if (this.f5195d == null) {
                    AtomicInteger atomicInteger = new AtomicInteger(this.f5202a.size());
                    for (int i10 = 0; i10 < this.f5202a.size(); i10++) {
                        String str = this.f5202a.get(i10);
                        try {
                            C1596p.m2213c(str, interfaceC1590j, new a(i10, str, atomicInteger));
                        } catch (IOException unused) {
                            atomicInteger.decrementAndGet();
                        }
                    }
                    try {
                        if (this.f5195d == null && atomicInteger.get() > 0) {
                            wait();
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return this.f5195d;
    }

    public C1584d(List<String> list, Map<Integer, Long> map) {
        if (list != null) {
            this.f5202a = list;
            list.size();
            this.f5203b = 0;
        }
        this.f5196e = map;
    }
}
