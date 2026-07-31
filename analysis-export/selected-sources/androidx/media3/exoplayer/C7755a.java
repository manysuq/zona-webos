package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.media3.exoplayer.C7755a;
import androidx.media3.exoplayer.C7758d;
import p039C2.C0505J;
import p039C2.InterfaceC0535u;

/* JADX INFO: renamed from: androidx.media3.exoplayer.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7755a {

    /* JADX INFO: renamed from: a */
    public final Context f25706a;

    /* JADX INFO: renamed from: b */
    public final a f25707b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0535u f25708c;

    /* JADX INFO: renamed from: d */
    public boolean f25709d;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.a$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final b f25710a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0535u f25711b;

        public a(InterfaceC0535u interfaceC0535u, b bVar) {
            this.f25711b = interfaceC0535u;
            this.f25710a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f25711b.mo936h(new Runnable() { // from class: K2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7755a.a aVar = this.f9204b;
                        if (C7755a.this.f25709d) {
                            C7758d.this.m9305v0(3, false);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.a$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface b {
    }

    public C7755a(Context context, Looper looper, Looper looper2, b bVar, C0505J c0505j) {
        this.f25706a = context.getApplicationContext();
        this.f25708c = c0505j.mo926a(looper, null);
        this.f25707b = new a(c0505j.mo926a(looper2, null), bVar);
    }

    @SuppressLint({"UnprotectedReceiver"})
    /* JADX INFO: renamed from: a */
    public final void m9224a() {
        if (this.f25709d) {
            this.f25708c.mo936h(new Runnable() { // from class: K2.b
                @Override // java.lang.Runnable
                public final void run() {
                    C7755a c7755a = this.f9202b;
                    c7755a.f25706a.unregisterReceiver(c7755a.f25707b);
                }
            });
            this.f25709d = false;
        }
    }
}
