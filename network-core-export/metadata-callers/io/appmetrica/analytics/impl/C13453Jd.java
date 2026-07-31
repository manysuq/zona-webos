package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.Jd */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13453Jd implements NativeCrashHandler {

    /* JADX INFO: renamed from: a */
    public final Function1 f44875a;

    /* JADX INFO: renamed from: b */
    public final IHandlerExecutor f44876b = C14269oa.m16596k().m16623w().m16406d();

    /* JADX INFO: renamed from: c */
    public final C13531Md f44877c;

    public C13453Jd(Context context, C13663Rg c13663Rg, Function1<? super String, Unit> function1, InterfaceC13660Rd interfaceC13660Rd, EnumC13946cb enumC13946cb, String str) {
        this.f44875a = function1;
        this.f44877c = new C13531Md(context, c13663Rg, interfaceC13660Rd, enumC13946cb);
    }

    /* JADX INFO: renamed from: a */
    public static final void m15292a(C13453Jd c13453Jd, NativeCrash nativeCrash, File file) {
        c13453Jd.f44875a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(final NativeCrash nativeCrash) {
        C13362G0 c13362g0;
        try {
            c13362g0 = new C13362G0(nativeCrash.getIo.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY java.lang.String(), nativeCrash.getHandlerVersion(), nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String(), nativeCrash.getDumpFile(), nativeCrash.getCreationTime(), C13414I0.m15226a(nativeCrash.getMetadata()));
        } catch (Throwable unused) {
            c13362g0 = null;
        }
        if (c13362g0 == null) {
            this.f44875a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(c13362g0.f44715f.f44752a).info("Detected native crash with uuid = " + c13362g0.f44712c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f44876b;
        C13531Md c13531Md = this.f44877c;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.Oo
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C13453Jd.m15292a(this.f45179a, nativeCrash, (File) obj);
            }
        };
        c13531Md.getClass();
        C13349Fd c13349Fd = new C13349Fd(new C13401Hd(c13362g0.f44710a, c13362g0.f44711b), c13531Md.f45046f);
        C13268Cd c13268Cd = new C13268Cd(c13531Md.f45042b, c13362g0.f44715f, new C13505Ld(c13362g0, c13531Md.f45044d));
        C13918ba c13918ba = c13531Md.f45045e;
        String str = c13362g0.f44713d;
        c13918ba.getClass();
        File file = new File(str);
        Context context = c13531Md.f45041a;
        if (C13891aa.f45819c == null) {
            synchronized (Reflection.getOrCreateKotlinClass(C13891aa.class)) {
                try {
                    if (C13891aa.f45819c == null) {
                        C13891aa.f45819c = new C13891aa(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C13891aa c13891aa = C13891aa.f45819c;
        iHandlerExecutor.execute(new RunnableC13688Sf(file, c13349Fd, consumer, c13268Cd, c13891aa == null ? null : c13891aa, c13531Md.f45043c.mo9180a(c13362g0)));
    }
}
