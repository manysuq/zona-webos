package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p021B2.C0232h;
import p055D0.C0941K;
import p623j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.pal.p6 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C9656p6 {

    /* JADX INFO: renamed from: a */
    public static final Logger f30964a = Logger.getLogger(C9656p6.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f30965b = new AtomicReference(new C9436Y5());

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f30966c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f30967d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f30968e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f30969f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f30970g = new ConcurrentHashMap();

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static InterfaceC9260K5 m11930a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        Locale locale = Locale.US;
        InterfaceC9260K5 interfaceC9260K5 = (InterfaceC9260K5) f30968e.get(str.toLowerCase(locale));
        if (interfaceC9260K5 != null) {
            return interfaceC9260K5;
        }
        String strM1458b = C0941K.m1458b("no catalogue found for ", str, ". ");
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strM1458b = strM1458b.concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strM1458b = String.valueOf(strM1458b).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strM1458b = String.valueOf(strM1458b).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strM1458b = String.valueOf(strM1458b).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strM1458b = String.valueOf(strM1458b).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            strM1458b = String.valueOf(strM1458b).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            strM1458b = String.valueOf(strM1458b).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strM1458b);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized InterfaceC9216H0 m11931b(C9660pa c9660pa) {
        AbstractC9463a8 abstractC9463a8Mo11062a;
        InterfaceC9216H0 interfaceC9216H0Mo11058b;
        try {
            InterfaceC9363S5 interfaceC9363S5Zzb = ((C9436Y5) f30965b.get()).m11575e(c9660pa.m11952v()).zzb();
            if (!((Boolean) f30967d.get(c9660pa.m11952v())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c9660pa.m11952v())));
            }
            AbstractC9215H abstractC9215HM11951u = c9660pa.m11951u();
            C9376T5 c9376t5 = (C9376T5) interfaceC9363S5Zzb;
            c9376t5.getClass();
            try {
                abstractC9463a8Mo11062a = c9376t5.f30614a.mo11062a();
                interfaceC9216H0Mo11058b = abstractC9463a8Mo11062a.mo11058b(abstractC9215HM11951u);
                abstractC9463a8Mo11062a.mo11060d(interfaceC9216H0Mo11058b);
            } catch (C9637o0 e10) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(c9376t5.f30614a.mo11062a().f30718a.getName()), e10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC9463a8Mo11062a.mo11057a(interfaceC9216H0Mo11058b);
    }

    /* JADX INFO: renamed from: c */
    public static Object m11932c(String str, AbstractC9215H abstractC9215H, Class cls) throws GeneralSecurityException {
        C9376T5 c9376t5 = (C9376T5) ((C9436Y5) f30965b.get()).m11571a(cls, str);
        AbstractC9489c8 abstractC9489c8 = c9376t5.f30614a;
        try {
            InterfaceC9216H0 interfaceC9216H0Mo11064c = abstractC9489c8.mo11064c(abstractC9215H);
            AbstractC9489c8 abstractC9489c9 = c9376t5.f30614a;
            Class cls2 = c9376t5.f30615b;
            if (Void.class.equals(cls2)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            abstractC9489c9.mo11066e(interfaceC9216H0Mo11064c);
            return abstractC9489c9.m11713g(interfaceC9216H0Mo11064c, cls2);
        } catch (C9637o0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(abstractC9489c8.f30748a.getName()), e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m11933d(String str, AbstractC9520f0 abstractC9520f0, Class cls) throws GeneralSecurityException {
        C9376T5 c9376t5 = (C9376T5) ((C9436Y5) f30965b.get()).m11571a(cls, str);
        AbstractC9489c8 abstractC9489c8 = c9376t5.f30614a;
        String strConcat = "Expected proto of type ".concat(abstractC9489c8.f30748a.getName());
        if (!abstractC9489c8.f30748a.isInstance(abstractC9520f0)) {
            throw new GeneralSecurityException(strConcat);
        }
        AbstractC9489c8 abstractC9489c9 = c9376t5.f30614a;
        Class cls2 = c9376t5.f30615b;
        if (Void.class.equals(cls2)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        abstractC9489c9.mo11066e(abstractC9520f0);
        return abstractC9489c9.m11713g(abstractC9520f0, cls2);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m11934e(AbstractC9645o8 abstractC9645o8, AbstractC9489c8 abstractC9489c8) {
        try {
            AtomicReference atomicReference = f30965b;
            C9436Y5 c9436y5 = new C9436Y5((C9436Y5) atomicReference.get());
            c9436y5.m11572b(abstractC9645o8, abstractC9489c8);
            String strMo11065d = abstractC9645o8.mo11065d();
            String strMo11065d2 = abstractC9489c8.mo11065d();
            m11938i(strMo11065d, abstractC9645o8.mo11062a().mo11059c(), true);
            m11938i(strMo11065d2, Collections.EMPTY_MAP, false);
            if (!((C9436Y5) atomicReference.get()).f30670a.containsKey(strMo11065d)) {
                f30966c.put(strMo11065d, new C0232h());
                m11939j(abstractC9645o8.mo11065d(), abstractC9645o8.mo11062a().mo11059c());
            }
            ConcurrentHashMap concurrentHashMap = f30967d;
            concurrentHashMap.put(strMo11065d, Boolean.TRUE);
            concurrentHashMap.put(strMo11065d2, Boolean.FALSE);
            atomicReference.set(c9436y5);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m11935f(InterfaceC9363S5 interfaceC9363S5, boolean z10) {
        try {
            if (interfaceC9363S5 == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = f30965b;
            C9436Y5 c9436y5 = new C9436Y5((C9436Y5) atomicReference.get());
            c9436y5.m11573c(interfaceC9363S5);
            if (!C9553h7.m11793a(1)) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            String strMo11065d = ((C9376T5) interfaceC9363S5).f30614a.mo11065d();
            m11938i(strMo11065d, Collections.EMPTY_MAP, z10);
            f30967d.put(strMo11065d, Boolean.valueOf(z10));
            atomicReference.set(c9436y5);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m11936g(AbstractC9489c8 abstractC9489c8) {
        try {
            AtomicReference atomicReference = f30965b;
            C9436Y5 c9436y5 = new C9436Y5((C9436Y5) atomicReference.get());
            c9436y5.m11574d(abstractC9489c8);
            String strMo11065d = abstractC9489c8.mo11065d();
            m11938i(strMo11065d, abstractC9489c8.mo11062a().mo11059c(), true);
            if (!((C9436Y5) atomicReference.get()).f30670a.containsKey(strMo11065d)) {
                f30966c.put(strMo11065d, new C0232h());
                m11939j(strMo11065d, abstractC9489c8.mo11062a().mo11059c());
            }
            f30967d.put(strMo11065d, Boolean.TRUE);
            atomicReference.set(c9436y5);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m11937h(InterfaceC9630n6 interfaceC9630n6) {
        try {
            if (interfaceC9630n6 == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class clsZzb = interfaceC9630n6.zzb();
            ConcurrentHashMap concurrentHashMap = f30969f;
            if (concurrentHashMap.containsKey(clsZzb)) {
                InterfaceC9630n6 interfaceC9630n7 = (InterfaceC9630n6) concurrentHashMap.get(clsZzb);
                if (!interfaceC9630n6.getClass().getName().equals(interfaceC9630n7.getClass().getName())) {
                    f30964a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(clsZzb.toString()));
                    throw new GeneralSecurityException("PrimitiveWrapper for primitive (" + clsZzb.getName() + ") is already registered to be " + interfaceC9630n7.getClass().getName() + ", cannot be re-registered with " + interfaceC9630n6.getClass().getName());
                }
            }
            concurrentHashMap.put(clsZzb, interfaceC9630n6);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public static synchronized void m11938i(String str, Map map, boolean z10) {
        if (z10) {
            try {
                ConcurrentHashMap concurrentHashMap = f30967d;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((C9436Y5) f30965b.get()).f30670a.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f30970g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f30970g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.pal.H0, java.lang.Object] */
    /* JADX INFO: renamed from: j */
    public static void m11939j(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrMo11192e = ((C9450Z7) entry.getValue()).f30686a.mo11192e();
            int i10 = ((C9450Z7) entry.getValue()).f30687b;
            C9647oa c9647oaM11945r = C9660pa.m11945r();
            if (c9647oaM11945r.f30738d) {
                c9647oaM11945r.m11637k();
                c9647oaM11945r.f30738d = false;
            }
            C9660pa.m11948w((C9660pa) c9647oaM11945r.f30737c, str);
            C9202G c9202gM11187t = AbstractC9215H.m11187t(0, bArrMo11192e.length, bArrMo11192e);
            if (c9647oaM11945r.f30738d) {
                c9647oaM11945r.m11637k();
                c9647oaM11945r.f30738d = false;
            }
            ((C9660pa) c9647oaM11945r.f30737c).zzf = c9202gM11187t;
            int i11 = i10 - 1;
            int i12 = i11 != 0 ? i11 != 1 ? 5 : 4 : 3;
            if (c9647oaM11945r.f30738d) {
                c9647oaM11945r.m11637k();
                c9647oaM11945r.f30738d = false;
            }
            ((C9660pa) c9647oaM11945r.f30737c).zzg = C9252Ja.m11246a(i12);
            f30970g.put(str2, new C9461a6((C9660pa) c9647oaM11945r.m11635i()));
        }
    }
}
