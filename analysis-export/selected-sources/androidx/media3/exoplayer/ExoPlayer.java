package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import p039C2.C0505J;
import p039C2.C0513S;
import p039C2.C0515a;
import p039C2.InterfaceC0522h;
import p152I7.InterfaceC2281o;
import p183K2.C2746S0;
import p183K2.C2748T0;
import p183K2.C2776j;
import p183K2.C2780l;
import p183K2.C2788p;
import p183K2.C2790q;
import p183K2.C2792r;
import p183K2.C2794s;
import p183K2.C2798u;
import p183K2.InterfaceC2744R0;
import p453Z2.InterfaceC6695z;
import p884z2.C20698d;
import p884z2.InterfaceC20719y;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends InterfaceC20719y {

    /* JADX INFO: renamed from: androidx.media3.exoplayer.ExoPlayer$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface InterfaceC7752a {
        /* JADX INFO: renamed from: e */
        void mo9219e();
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.ExoPlayer$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class C7753b {

        /* JADX INFO: renamed from: a */
        public final Context f25680a;

        /* JADX INFO: renamed from: b */
        public final C0505J f25681b;

        /* JADX INFO: renamed from: c */
        public InterfaceC2281o<InterfaceC2744R0> f25682c;

        /* JADX INFO: renamed from: d */
        public final C2798u f25683d;

        /* JADX INFO: renamed from: e */
        public final C2788p f25684e;

        /* JADX INFO: renamed from: f */
        public InterfaceC2281o<InterfaceC7772f> f25685f;

        /* JADX INFO: renamed from: g */
        public final C2792r f25686g;

        /* JADX INFO: renamed from: h */
        public final C2794s f25687h;

        /* JADX INFO: renamed from: i */
        public final Looper f25688i;

        /* JADX INFO: renamed from: j */
        public final int f25689j;

        /* JADX INFO: renamed from: k */
        public C20698d f25690k;

        /* JADX INFO: renamed from: l */
        public boolean f25691l;

        /* JADX INFO: renamed from: m */
        public final int f25692m;

        /* JADX INFO: renamed from: n */
        public final boolean f25693n;

        /* JADX INFO: renamed from: o */
        public final C2748T0 f25694o;

        /* JADX INFO: renamed from: p */
        public final C2746S0 f25695p;

        /* JADX INFO: renamed from: q */
        public long f25696q;

        /* JADX INFO: renamed from: r */
        public long f25697r;

        /* JADX INFO: renamed from: s */
        public final long f25698s;

        /* JADX INFO: renamed from: t */
        public final C2776j f25699t;

        /* JADX INFO: renamed from: u */
        public final long f25700u;

        /* JADX INFO: renamed from: v */
        public final long f25701v;

        /* JADX INFO: renamed from: w */
        public final boolean f25702w;

        /* JADX INFO: renamed from: x */
        public boolean f25703x;

        /* JADX INFO: renamed from: y */
        public final String f25704y;

        public C7753b(final Context context) {
            InterfaceC2281o<InterfaceC2744R0> interfaceC2281o = new InterfaceC2281o() { // from class: K2.t
                @Override // p152I7.InterfaceC2281o
                public final Object get() {
                    return new C2780l(context);
                }
            };
            C2798u c2798u = new C2798u(context);
            C2788p c2788p = new C2788p(context);
            C2790q c2790q = new C2790q();
            C2792r c2792r = new C2792r(context);
            C2794s c2794s = new C2794s();
            context.getClass();
            this.f25680a = context;
            this.f25682c = interfaceC2281o;
            this.f25683d = c2798u;
            this.f25684e = c2788p;
            this.f25685f = c2790q;
            this.f25686g = c2792r;
            this.f25687h = c2794s;
            String str = C0513S.f2002a;
            Looper looperMyLooper = Looper.myLooper();
            this.f25688i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f25690k = C20698d.f70967c;
            this.f25692m = 1;
            this.f25693n = true;
            this.f25694o = C2748T0.f9178c;
            this.f25696q = 5000L;
            this.f25697r = 15000L;
            this.f25698s = 3000L;
            this.f25695p = C2746S0.f9174b;
            this.f25699t = new C2776j(C0513S.m982T(20L), C0513S.m982T(500L));
            this.f25681b = InterfaceC0522h.f2032a;
            this.f25700u = 500L;
            this.f25701v = 2000L;
            this.f25702w = true;
            this.f25704y = "";
            this.f25689j = -1000;
            if (Build.VERSION.SDK_INT >= 35) {
            }
        }

        /* JADX INFO: renamed from: a */
        public final C7758d m9220a() {
            C0515a.m1030f(!this.f25703x);
            this.f25703x = true;
            return new C7758d(this);
        }

        /* JADX INFO: renamed from: b */
        public final void m9221b(final C2780l c2780l) {
            C0515a.m1030f(!this.f25703x);
            this.f25682c = new InterfaceC2281o() { // from class: K2.v
                @Override // p152I7.InterfaceC2281o
                public final Object get() {
                    return c2780l;
                }
            };
        }

        /* JADX INFO: renamed from: c */
        public final void m9222c() {
            C0515a.m1030f(!this.f25703x);
            this.f25696q = 10000L;
        }

        /* JADX INFO: renamed from: d */
        public final void m9223d() {
            C0515a.m1030f(!this.f25703x);
            this.f25697r = 10000L;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.ExoPlayer$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class C7754c {

        /* JADX INFO: renamed from: a */
        public static final C7754c f25705a = new C7754c();
    }

    /* JADX INFO: renamed from: R */
    void mo9218R(InterfaceC6695z interfaceC6695z);

    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z10);
}
