package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p619io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o6 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14265o6 {

    /* JADX INFO: renamed from: a */
    public final C13918ba f46925a;

    /* JADX INFO: renamed from: b */
    public final C14049g6 f46926b;

    /* JADX INFO: renamed from: c */
    public final Context f46927c;

    /* JADX INFO: renamed from: d */
    public final C13891aa f46928d;

    public C14265o6(Context context) {
        this(context, new C13918ba(), new C14049g6(), C13891aa.m15976a(context));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m16579a(C14438uh c14438uh) {
        boolean zMkdir;
        String str;
        C14538y9 c14538y9M15978b;
        PrintWriter printWriter;
        C13891aa c13891aa;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f46927c);
        this.f46926b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            try {
                if (crashesDirectory.exists()) {
                    if (!crashesDirectory.isDirectory()) {
                        if (!crashesDirectory.delete()) {
                            return;
                        } else {
                            zMkdir = crashesDirectory.mkdir();
                        }
                    }
                    C13216Af c13216Af = c14438uh.f47332e.f44785a;
                    str = c13216Af.f44409a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c13216Af.f44409a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                    c14538y9M15978b = this.f46928d.m15978b(str);
                    c14538y9M15978b.f47589a.lock();
                    c14538y9M15978b.f47590b.m15951a();
                    this.f46925a.getClass();
                    printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                    printWriter.write(new C14162kb(c14438uh.f47328a, c14438uh.f47332e, c14438uh.f47331d).m16444k());
                    AbstractC14175ko.m16471a((Closeable) printWriter);
                    c14538y9M15978b.m17069c();
                    c13891aa = this.f46928d;
                    synchronized (c13891aa) {
                        c13891aa.f45821b.remove(str);
                    }
                    return;
                }
                zMkdir = crashesDirectory.mkdir();
                printWriter.write(new C14162kb(c14438uh.f47328a, c14438uh.f47332e, c14438uh.f47331d).m16444k());
                AbstractC14175ko.m16471a((Closeable) printWriter);
                c14538y9M15978b.m17069c();
                c13891aa = this.f46928d;
                synchronized (c13891aa) {
                    c13891aa.f45821b.remove(str);
                    return;
                }
            } catch (Throwable unused) {
                AbstractC14175ko.m16471a((Closeable) printWriter);
                c14538y9M15978b.m17069c();
                this.f46928d.m15977a(str);
                return;
            }
            c14538y9M15978b.f47589a.lock();
            c14538y9M15978b.f47590b.m15951a();
            this.f46925a.getClass();
            printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
        } catch (Throwable unused2) {
            printWriter = null;
        }
        if (!zMkdir) {
            return;
        }
        C13216Af c13216Af2 = c14438uh.f47332e.f44785a;
        str = c13216Af2.f44409a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c13216Af2.f44409a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        c14538y9M15978b = this.f46928d.m15978b(str);
    }

    public C14265o6(Context context, C13918ba c13918ba, C14049g6 c14049g6, C13891aa c13891aa) {
        this.f46927c = context;
        this.f46925a = c13918ba;
        this.f46926b = c14049g6;
        this.f46928d = c13891aa;
    }
}
