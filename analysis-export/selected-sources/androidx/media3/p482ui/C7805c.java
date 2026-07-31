package androidx.media3.p482ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p482ui.C7805c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import mobi.zona.R;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p021B2.C0227c;
import p039C2.C0513S;
import p039C2.C0515a;
import p039C2.C0539y;
import p170J7.AbstractC2481A;
import p170J7.C2500U;
import p200L1.C3158h;
import p328S3.C4825d;
import p328S3.C4847z;
import p328S3.RunnableC4826e;
import p328S3.ViewOnClickListenerC4831j;
import p884z2.AbstractC20686A;
import p884z2.C20687B;
import p884z2.C20688C;
import p884z2.C20689D;
import p884z2.C20690E;
import p884z2.C20694I;
import p884z2.C20696b;
import p884z2.C20708n;
import p884z2.C20711q;
import p884z2.C20712r;
import p884z2.C20713s;
import p884z2.C20714t;
import p884z2.C20717w;
import p884z2.C20718x;
import p884z2.InterfaceC20719y;

/* JADX INFO: renamed from: androidx.media3.ui.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7805c extends FrameLayout {

    /* JADX INFO: renamed from: H0 */
    public static final float[] f26341H0;

    /* JADX INFO: renamed from: A */
    public final ImageView f26342A;

    /* JADX INFO: renamed from: A0 */
    public int f26343A0;

    /* JADX INFO: renamed from: B */
    public final ImageView f26344B;

    /* JADX INFO: renamed from: B0 */
    public long[] f26345B0;

    /* JADX INFO: renamed from: C */
    public final ImageView f26346C;

    /* JADX INFO: renamed from: C0 */
    public boolean[] f26347C0;

    /* JADX INFO: renamed from: D */
    public final ImageView f26348D;

    /* JADX INFO: renamed from: D0 */
    public final long[] f26349D0;

    /* JADX INFO: renamed from: E */
    public final ImageView f26350E;

    /* JADX INFO: renamed from: E0 */
    public final boolean[] f26351E0;

    /* JADX INFO: renamed from: F */
    public final ImageView f26352F;

    /* JADX INFO: renamed from: F0 */
    public long f26353F0;

    /* JADX INFO: renamed from: G */
    public final View f26354G;

    /* JADX INFO: renamed from: G0 */
    public boolean f26355G0;

    /* JADX INFO: renamed from: H */
    public final View f26356H;

    /* JADX INFO: renamed from: I */
    public final View f26357I;

    /* JADX INFO: renamed from: J */
    public final TextView f26358J;

    /* JADX INFO: renamed from: K */
    public final TextView f26359K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC7808f f26360L;

    /* JADX INFO: renamed from: M */
    public final StringBuilder f26361M;

    /* JADX INFO: renamed from: N */
    public final Formatter f26362N;

    /* JADX INFO: renamed from: O */
    public final AbstractC20686A.b f26363O;

    /* JADX INFO: renamed from: P */
    public final AbstractC20686A.c f26364P;

    /* JADX INFO: renamed from: Q */
    public final RunnableC4826e f26365Q;

    /* JADX INFO: renamed from: R */
    public final Drawable f26366R;

    /* JADX INFO: renamed from: S */
    public final Drawable f26367S;

    /* JADX INFO: renamed from: T */
    public final Drawable f26368T;

    /* JADX INFO: renamed from: U */
    public final Drawable f26369U;

    /* JADX INFO: renamed from: V */
    public final Drawable f26370V;

    /* JADX INFO: renamed from: W */
    public final String f26371W;

    /* JADX INFO: renamed from: a0 */
    public final String f26372a0;

    /* JADX INFO: renamed from: b */
    public final C4847z f26373b;

    /* JADX INFO: renamed from: b0 */
    public final String f26374b0;

    /* JADX INFO: renamed from: c */
    public final Resources f26375c;

    /* JADX INFO: renamed from: c0 */
    public final Drawable f26376c0;

    /* JADX INFO: renamed from: d */
    public final b f26377d;

    /* JADX INFO: renamed from: d0 */
    public final Drawable f26378d0;

    /* JADX INFO: renamed from: e */
    public final Class<?> f26379e;

    /* JADX INFO: renamed from: e0 */
    public final float f26380e0;

    /* JADX INFO: renamed from: f */
    public final Method f26381f;

    /* JADX INFO: renamed from: f0 */
    public final float f26382f0;

    /* JADX INFO: renamed from: g */
    public final Method f26383g;

    /* JADX INFO: renamed from: g0 */
    public final String f26384g0;

    /* JADX INFO: renamed from: h */
    public final Class<?> f26385h;

    /* JADX INFO: renamed from: h0 */
    public final String f26386h0;

    /* JADX INFO: renamed from: i */
    public final Method f26387i;

    /* JADX INFO: renamed from: i0 */
    public final Drawable f26388i0;

    /* JADX INFO: renamed from: j */
    public final Method f26389j;

    /* JADX INFO: renamed from: j0 */
    public final Drawable f26390j0;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList<l> f26391k;

    /* JADX INFO: renamed from: k0 */
    public final String f26392k0;

    /* JADX INFO: renamed from: l */
    public final RecyclerView f26393l;

    /* JADX INFO: renamed from: l0 */
    public final String f26394l0;

    /* JADX INFO: renamed from: m */
    public final g f26395m;

    /* JADX INFO: renamed from: m0 */
    public final Drawable f26396m0;

    /* JADX INFO: renamed from: n */
    public final d f26397n;

    /* JADX INFO: renamed from: n0 */
    public final Drawable f26398n0;

    /* JADX INFO: renamed from: o */
    public final i f26399o;

    /* JADX INFO: renamed from: o0 */
    public final String f26400o0;

    /* JADX INFO: renamed from: p */
    public final a f26401p;

    /* JADX INFO: renamed from: p0 */
    public final String f26402p0;

    /* JADX INFO: renamed from: q */
    public final C4825d f26403q;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC20719y f26404q0;

    /* JADX INFO: renamed from: r */
    public final PopupWindow f26405r;

    /* JADX INFO: renamed from: r0 */
    public boolean f26406r0;

    /* JADX INFO: renamed from: s */
    public final int f26407s;

    /* JADX INFO: renamed from: s0 */
    public boolean f26408s0;

    /* JADX INFO: renamed from: t */
    public final ImageView f26409t;

    /* JADX INFO: renamed from: t0 */
    public boolean f26410t0;

    /* JADX INFO: renamed from: u */
    public final ImageView f26411u;

    /* JADX INFO: renamed from: u0 */
    public boolean f26412u0;

    /* JADX INFO: renamed from: v */
    public final ImageView f26413v;

    /* JADX INFO: renamed from: v0 */
    public boolean f26414v0;

    /* JADX INFO: renamed from: w */
    public final View f26415w;

    /* JADX INFO: renamed from: w0 */
    public boolean f26416w0;

    /* JADX INFO: renamed from: x */
    public final View f26417x;

    /* JADX INFO: renamed from: x0 */
    public int f26418x0;

    /* JADX INFO: renamed from: y */
    public final TextView f26419y;

    /* JADX INFO: renamed from: y0 */
    public boolean f26420y0;

    /* JADX INFO: renamed from: z */
    public final TextView f26421z;

    /* JADX INFO: renamed from: z0 */
    public int f26422z0;

    /* JADX INFO: renamed from: androidx.media3.ui.c$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class a extends k {
        public a() {
            super();
        }

        @Override // androidx.media3.p482ui.C7805c.k
        /* JADX INFO: renamed from: b */
        public final void mo9555b(h hVar) {
            hVar.f26437l.setText(R.string.exo_track_selection_auto);
            InterfaceC20719y interfaceC20719y = C7805c.this.f26404q0;
            interfaceC20719y.getClass();
            hVar.f26438m.setVisibility(m9557d(interfaceC20719y.mo9303u()) ? 4 : 0);
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: S3.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7805c c7805c = C7805c.this;
                    InterfaceC20719y interfaceC20719y2 = c7805c.f26404q0;
                    if (interfaceC20719y2 == null || !interfaceC20719y2.mo25286q(29)) {
                        return;
                    }
                    C20689D c20689dMo9303u = c7805c.f26404q0.mo9303u();
                    InterfaceC20719y interfaceC20719y3 = c7805c.f26404q0;
                    String str = C0513S.f2002a;
                    interfaceC20719y3.mo9267M(c20689dMo9303u.mo12459a().mo12462c(1).mo12469k(1, false).mo12461b());
                    C7805c.g gVar = c7805c.f26395m;
                    gVar.f26434d[1] = c7805c.getResources().getString(R.string.exo_track_selection_auto);
                    c7805c.f26405r.dismiss();
                }
            });
        }

        @Override // androidx.media3.p482ui.C7805c.k
        /* JADX INFO: renamed from: c */
        public final void mo9556c(String str) {
            C7805c.this.f26395m.f26434d[1] = str;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m9557d(C20689D c20689d) {
            for (int i10 = 0; i10 < this.f26443c.size(); i10++) {
                if (c20689d.f70913s.containsKey(this.f26443c.get(i10).f26440a.f70939b)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated
    public interface c {
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class d extends RecyclerView.AbstractC7869g<h> {

        /* JADX INFO: renamed from: c */
        public final String[] f26425c;

        /* JADX INFO: renamed from: d */
        public final float[] f26426d;

        /* JADX INFO: renamed from: e */
        public int f26427e;

        public d(String[] strArr, float[] fArr) {
            this.f26425c = strArr;
            this.f26426d = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final int getItemCount() {
            return this.f26425c.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final void onBindViewHolder(RecyclerView.AbstractC7862E abstractC7862E, final int i10) {
            h hVar = (h) abstractC7862E;
            String[] strArr = this.f26425c;
            if (i10 < strArr.length) {
                hVar.f26437l.setText(strArr[i10]);
            }
            if (i10 == this.f26427e) {
                hVar.itemView.setSelected(true);
                hVar.f26438m.setVisibility(0);
            } else {
                hVar.itemView.setSelected(false);
                hVar.f26438m.setVisibility(4);
            }
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: S3.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7805c.d dVar = this.f16146b;
                    C7805c c7805c = C7805c.this;
                    int i11 = dVar.f26427e;
                    int i12 = i10;
                    if (i12 != i11) {
                        c7805c.setPlaybackSpeed(dVar.f26426d[i12]);
                    }
                    c7805c.f26405r.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final RecyclerView.AbstractC7862E onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new h(LayoutInflater.from(C7805c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface e {
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class f extends RecyclerView.AbstractC7862E {

        /* JADX INFO: renamed from: l */
        public final TextView f26429l;

        /* JADX INFO: renamed from: m */
        public final TextView f26430m;

        /* JADX INFO: renamed from: n */
        public final ImageView f26431n;

        public f(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f26429l = (TextView) view.findViewById(R.id.exo_main_text);
            this.f26430m = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f26431n = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new ViewOnClickListenerC4831j(this, 0));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class g extends RecyclerView.AbstractC7869g<f> {

        /* JADX INFO: renamed from: c */
        public final String[] f26433c;

        /* JADX INFO: renamed from: d */
        public final String[] f26434d;

        /* JADX INFO: renamed from: e */
        public final Drawable[] f26435e;

        public g(String[] strArr, Drawable[] drawableArr) {
            this.f26433c = strArr;
            this.f26434d = new String[strArr.length];
            this.f26435e = drawableArr;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9561a(int i10) {
            C7805c c7805c = C7805c.this;
            InterfaceC20719y interfaceC20719y = c7805c.f26404q0;
            if (interfaceC20719y == null) {
                return false;
            }
            if (i10 == 0) {
                return interfaceC20719y.mo25286q(13);
            }
            if (i10 != 1) {
                return true;
            }
            return interfaceC20719y.mo25286q(30) && c7805c.f26404q0.mo25286q(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final int getItemCount() {
            return this.f26433c.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final void onBindViewHolder(RecyclerView.AbstractC7862E abstractC7862E, int i10) {
            f fVar = (f) abstractC7862E;
            if (m9561a(i10)) {
                fVar.itemView.setLayoutParams(new RecyclerView.C7878p(-1, -2));
            } else {
                fVar.itemView.setLayoutParams(new RecyclerView.C7878p(0, 0));
            }
            TextView textView = fVar.f26429l;
            ImageView imageView = fVar.f26431n;
            TextView textView2 = fVar.f26430m;
            textView.setText(this.f26433c[i10]);
            String str = this.f26434d[i10];
            if (str == null) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str);
            }
            Drawable drawable = this.f26435e[i10];
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final RecyclerView.AbstractC7862E onCreateViewHolder(ViewGroup viewGroup, int i10) {
            C7805c c7805c = C7805c.this;
            return c7805c.new f(LayoutInflater.from(c7805c.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$h */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class h extends RecyclerView.AbstractC7862E {

        /* JADX INFO: renamed from: l */
        public final TextView f26437l;

        /* JADX INFO: renamed from: m */
        public final View f26438m;

        public h(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f26437l = (TextView) view.findViewById(R.id.exo_text);
            this.f26438m = view.findViewById(R.id.exo_check);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$j */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class j {

        /* JADX INFO: renamed from: a */
        public final C20690E.a f26440a;

        /* JADX INFO: renamed from: b */
        public final int f26441b;

        /* JADX INFO: renamed from: c */
        public final String f26442c;

        public j(C20690E c20690e, int i10, int i11, String str) {
            this.f26440a = c20690e.f70937a.get(i10);
            this.f26441b = i11;
            this.f26442c = str;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$k */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public abstract class k extends RecyclerView.AbstractC7869g<h> {

        /* JADX INFO: renamed from: c */
        public List<j> f26443c = new ArrayList();

        public k() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        /* JADX INFO: renamed from: a */
        public void onBindViewHolder(h hVar, int i10) {
            boolean z10;
            final InterfaceC20719y interfaceC20719y = C7805c.this.f26404q0;
            if (interfaceC20719y == null) {
                return;
            }
            if (i10 == 0) {
                mo9555b(hVar);
                return;
            }
            final j jVar = this.f26443c.get(i10 - 1);
            final C20687B c20687b = jVar.f26440a.f70939b;
            if (interfaceC20719y.mo9303u().f70913s.get(c20687b) != null) {
                z10 = jVar.f26440a.f70942e[jVar.f26441b];
            }
            hVar.f26437l.setText(jVar.f26442c);
            hVar.f26438m.setVisibility(z10 ? 0 : 4);
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: S3.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC20719y interfaceC20719y2 = interfaceC20719y;
                    if (interfaceC20719y2.mo25286q(29)) {
                        C20689D.b bVarMo12459a = interfaceC20719y2.mo9303u().mo12459a();
                        C7805c.j jVar2 = jVar;
                        interfaceC20719y2.mo9267M(bVarMo12459a.mo12465g(new C20688C(c20687b, AbstractC2481A.m3207u(Integer.valueOf(jVar2.f26441b)))).mo12469k(jVar2.f26440a.f70939b.f70889c, false).mo12461b());
                        String str = jVar2.f26442c;
                        C7805c.k kVar = this.f16151b;
                        kVar.mo9556c(str);
                        C7805c.this.f26405r.dismiss();
                    }
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo9555b(h hVar);

        /* JADX INFO: renamed from: c */
        public abstract void mo9556c(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final int getItemCount() {
            if (this.f26443c.isEmpty()) {
                return 0;
            }
            return this.f26443c.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final RecyclerView.AbstractC7862E onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new h(LayoutInflater.from(C7805c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$l */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Deprecated
    public interface l {
        /* JADX INFO: renamed from: d */
        void mo9564d(int i10);
    }

    static {
        C20712r.m25314a("media3.ui");
        f26341H0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v13, types: [S3.e] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public C7805c(Context context) {
        Method method;
        Method method2;
        Method method3;
        Class<?> cls;
        Method method4;
        super(context, null, 0);
        Class<?> cls2 = Boolean.TYPE;
        this.f26412u0 = true;
        this.f26418x0 = 5000;
        this.f26343A0 = 0;
        this.f26422z0 = 200;
        LayoutInflater.from(context).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        this.f26377d = new b();
        this.f26391k = new CopyOnWriteArrayList<>();
        this.f26363O = new AbstractC20686A.b();
        this.f26364P = new AbstractC20686A.c();
        StringBuilder sb2 = new StringBuilder();
        this.f26361M = sb2;
        this.f26362N = new Formatter(sb2, Locale.getDefault());
        this.f26345B0 = new long[0];
        this.f26347C0 = new boolean[0];
        this.f26349D0 = new long[0];
        this.f26351E0 = new boolean[0];
        this.f26365Q = new Runnable() { // from class: S3.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f16142b.m9549s();
            }
        };
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls2);
            try {
                method2 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.f26379e = ExoPlayer.class;
        this.f26381f = method;
        this.f26383g = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls.getMethod("setScrubbingModeEnabled", cls2);
                try {
                    method4 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method4 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method3 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            method3 = null;
            cls = null;
        }
        this.f26385h = cls;
        this.f26387i = method3;
        this.f26389j = method4;
        this.f26358J = (TextView) findViewById(R.id.exo_duration);
        this.f26359K = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f26348D = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.f26377d);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f26350E = imageView2;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: S3.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7805c c7805c = this.f16143b;
                c7805c.m9545o(!c7805c.f26406r0);
            }
        };
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(onClickListener);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f26352F = imageView3;
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: S3.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7805c c7805c = this.f16143b;
                c7805c.m9545o(!c7805c.f26406r0);
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(onClickListener2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f26354G = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.f26377d);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f26356H = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.f26377d);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f26357I = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.f26377d);
        }
        InterfaceC7808f interfaceC7808f = (InterfaceC7808f) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC7808f != null) {
            this.f26360L = interfaceC7808f;
        } else if (viewFindViewById4 != null) {
            C7804b c7804b = new C7804b(context);
            c7804b.setId(R.id.exo_progress);
            c7804b.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c7804b, iIndexOfChild);
            this.f26360L = c7804b;
        } else {
            this.f26360L = null;
        }
        InterfaceC7808f interfaceC7808f2 = this.f26360L;
        if (interfaceC7808f2 != null) {
            interfaceC7808f2.mo9524a(this.f26377d);
        }
        Resources resources = context.getResources();
        this.f26375c = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f26413v = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.f26377d);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.f26409t = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_previous, context.getTheme()));
            imageView5.setOnClickListener(this.f26377d);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.f26411u = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_next, context.getTheme()));
            imageView6.setOnClickListener(this.f26377d);
        }
        Typeface typefaceM3807b = C3158h.m3807b(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_rewind, context.getTheme()));
            this.f26417x = imageView7;
            this.f26421z = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceM3807b);
            this.f26421z = textView;
            this.f26417x = textView;
        } else {
            this.f26421z = null;
            this.f26417x = null;
        }
        View view = this.f26417x;
        if (view != null) {
            view.setOnClickListener(this.f26377d);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_fastforward, context.getTheme()));
            this.f26415w = imageView8;
            this.f26419y = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM3807b);
            this.f26419y = textView2;
            this.f26415w = textView2;
        } else {
            this.f26419y = null;
            this.f26415w = null;
        }
        View view2 = this.f26415w;
        if (view2 != null) {
            view2.setOnClickListener(this.f26377d);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f26342A = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.f26377d);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f26344B = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.f26377d);
        }
        this.f26380e0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f26382f0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.f26346C = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_vr, context.getTheme()));
            m9544n(imageView11, false);
        }
        C4847z c4847z = new C4847z(this);
        this.f26373b = c4847z;
        c4847z.f16173C = true;
        g gVar = new g(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f26395m = gVar;
        this.f26407s = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f26393l = recyclerView;
        recyclerView.setAdapter(gVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f26405r = popupWindow;
        if (Build.VERSION.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(this.f26377d);
        this.f26355G0 = true;
        this.f26403q = new C4825d(getResources());
        this.f26388i0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on, context.getTheme());
        this.f26390j0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off, context.getTheme());
        this.f26392k0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f26394l0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f26399o = new i();
        this.f26401p = new a();
        this.f26397n = new d(resources.getStringArray(R.array.exo_controls_playback_speeds), f26341H0);
        this.f26366R = resources.getDrawable(R.drawable.exo_styled_controls_play, context.getTheme());
        this.f26367S = resources.getDrawable(R.drawable.exo_styled_controls_pause, context.getTheme());
        this.f26396m0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit, context.getTheme());
        this.f26398n0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter, context.getTheme());
        this.f26368T = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off, context.getTheme());
        this.f26369U = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one, context.getTheme());
        this.f26370V = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all, context.getTheme());
        this.f26376c0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on, context.getTheme());
        this.f26378d0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off, context.getTheme());
        this.f26400o0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f26402p0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f26371W = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f26372a0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f26374b0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f26384g0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f26386h0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        c4847z.m5428h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        c4847z.m5428h(this.f26415w, true);
        c4847z.m5428h(this.f26417x, true);
        c4847z.m5428h(imageView5, true);
        c4847z.m5428h(imageView6, true);
        c4847z.m5428h(imageView10, false);
        c4847z.m5428h(imageView, false);
        c4847z.m5428h(imageView11, false);
        c4847z.m5428h(imageView9, this.f26343A0 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: S3.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                C7805c c7805c = this.f16144b;
                int i18 = c7805c.f26407s;
                PopupWindow popupWindow2 = c7805c.f26405r;
                int i19 = i13 - i11;
                int i20 = i17 - i15;
                if (!(i12 - i10 == i16 - i14 && i19 == i20) && popupWindow2.isShowing()) {
                    c7805c.m9551u();
                    popupWindow2.update(view3, (c7805c.getWidth() - popupWindow2.getWidth()) - i18, (-popupWindow2.getHeight()) - i18, -1, -1);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m9531a(C7805c c7805c, InterfaceC20719y interfaceC20719y, long j10) {
        if (c7805c.f26414v0) {
            if (interfaceC20719y.mo25286q(17) && interfaceC20719y.mo25286q(10)) {
                AbstractC20686A abstractC20686AMo9299s = interfaceC20719y.mo9299s();
                int iMo3453o = abstractC20686AMo9299s.mo3453o();
                int i10 = 0;
                while (true) {
                    long jM1002g0 = C0513S.m1002g0(abstractC20686AMo9299s.mo3485m(i10, c7805c.f26364P, 0L).f70883m);
                    if (j10 < jM1002g0) {
                        break;
                    }
                    if (i10 == iMo3453o - 1) {
                        j10 = jM1002g0;
                        break;
                    } else {
                        j10 -= jM1002g0;
                        i10++;
                    }
                }
                interfaceC20719y.mo25288x(i10, j10);
            }
        } else if (interfaceC20719y.mo25286q(5)) {
            interfaceC20719y.mo25281d(j10);
        }
        c7805c.m9549s();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9533c(InterfaceC20719y interfaceC20719y, AbstractC20686A.c cVar) {
        AbstractC20686A abstractC20686AMo9299s;
        int iMo3453o;
        if (!interfaceC20719y.mo25286q(17) || (iMo3453o = (abstractC20686AMo9299s = interfaceC20719y.mo9299s()).mo3453o()) <= 1 || iMo3453o > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iMo3453o; i10++) {
            if (abstractC20686AMo9299s.mo3485m(i10, cVar, 0L).f70883m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        InterfaceC20719y interfaceC20719y = this.f26404q0;
        if (interfaceC20719y == null || !interfaceC20719y.mo25286q(13)) {
            return;
        }
        InterfaceC20719y interfaceC20719y2 = this.f26404q0;
        interfaceC20719y2.mo9275b(new C20718x(f10, interfaceC20719y2.getPlaybackParameters().f71223b));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9534d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC20719y interfaceC20719y = this.f26404q0;
        if (interfaceC20719y == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (interfaceC20719y.mo9279f() != 4 && interfaceC20719y.mo25286q(12)) {
                    interfaceC20719y.mo25282e();
                }
            } else if (keyCode == 89 && interfaceC20719y.mo25286q(11)) {
                interfaceC20719y.mo25283g();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (C0513S.m996d0(interfaceC20719y, this.f26412u0)) {
                        C0513S.m974L(interfaceC20719y);
                    } else if (interfaceC20719y.mo25286q(1)) {
                        interfaceC20719y.pause();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            C0513S.m974L(interfaceC20719y);
                        } else if (keyCode == 127) {
                            String str = C0513S.f2002a;
                            if (interfaceC20719y.mo25286q(1)) {
                                interfaceC20719y.pause();
                            }
                        }
                    } else if (interfaceC20719y.mo25286q(7)) {
                        interfaceC20719y.mo25285j();
                    }
                } else if (interfaceC20719y.mo25286q(9)) {
                    interfaceC20719y.mo25287v();
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m9534d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public final void m9535e(RecyclerView.AbstractC7869g<?> abstractC7869g, View view) {
        this.f26393l.setAdapter(abstractC7869g);
        m9551u();
        this.f26355G0 = false;
        PopupWindow popupWindow = this.f26405r;
        popupWindow.dismiss();
        this.f26355G0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i10 = this.f26407s;
        popupWindow.showAsDropDown(view, width - i10, (-popupWindow.getHeight()) - i10);
    }

    /* JADX INFO: renamed from: f */
    public final C2500U m9536f(C20690E c20690e, int i10) {
        AbstractC2481A.a aVar = new AbstractC2481A.a();
        AbstractC2481A<C20690E.a> abstractC2481A = c20690e.f70937a;
        for (int i11 = 0; i11 < abstractC2481A.size(); i11++) {
            C20690E.a aVar2 = abstractC2481A.get(i11);
            if (aVar2.f70939b.f70889c == i10) {
                for (int i12 = 0; i12 < aVar2.f70938a; i12++) {
                    if (aVar2.m25239b(i12)) {
                        C20708n c20708nM25238a = aVar2.m25238a(i12);
                        if ((c20708nM25238a.f71024e & 2) == 0) {
                            aVar.m3326c(new j(c20690e, i11, i12, this.f26403q.mo5416a(c20708nM25238a)));
                        }
                    }
                }
            }
        }
        return aVar.m3216f();
    }

    /* JADX INFO: renamed from: g */
    public final void m9537g() {
        C4847z c4847z = this.f26373b;
        int i10 = c4847z.f16199z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        c4847z.m5426f();
        if (!c4847z.f16173C) {
            c4847z.m5429i(2);
        } else if (c4847z.f16199z == 1) {
            c4847z.f16186m.start();
        } else {
            c4847z.f16187n.start();
        }
    }

    public InterfaceC20719y getPlayer() {
        return this.f26404q0;
    }

    public int getRepeatToggleModes() {
        return this.f26343A0;
    }

    public boolean getShowShuffleButton() {
        return this.f26373b.m5424b(this.f26344B);
    }

    public boolean getShowSubtitleButton() {
        return this.f26373b.m5424b(this.f26348D);
    }

    public int getShowTimeoutMs() {
        return this.f26418x0;
    }

    public boolean getShowVrButton() {
        return this.f26373b.m5424b(this.f26346C);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: h */
    public final boolean m9538h(InterfaceC20719y interfaceC20719y) {
        Class<?> cls;
        return (interfaceC20719y == null || (cls = this.f26385h) == null || !cls.isAssignableFrom(interfaceC20719y.getClass())) ? false : true;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: i */
    public final boolean m9539i(InterfaceC20719y interfaceC20719y) {
        Class<?> cls;
        return (interfaceC20719y == null || (cls = this.f26379e) == null || !cls.isAssignableFrom(interfaceC20719y.getClass())) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m9540j() {
        C4847z c4847z = this.f26373b;
        return c4847z.f16199z == 0 && c4847z.f16174a.m9542l();
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: k */
    public final boolean m9541k(InterfaceC20719y interfaceC20719y) {
        try {
            if (m9539i(interfaceC20719y)) {
                Method method = this.f26383g;
                method.getClass();
                Object objInvoke = method.invoke(interfaceC20719y, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (!m9538h(interfaceC20719y)) {
                return false;
            }
            Method method2 = this.f26389j;
            method2.getClass();
            Object objInvoke2 = method2.invoke(interfaceC20719y, null);
            objInvoke2.getClass();
            return ((Boolean) objInvoke2).booleanValue();
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m9542l() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m9543m() {
        m9547q();
        m9546p();
        m9550t();
        m9552v();
        m9554x();
        m9548r();
        m9553w();
    }

    /* JADX INFO: renamed from: n */
    public final void m9544n(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f26380e0 : this.f26382f0);
    }

    /* JADX INFO: renamed from: o */
    public final void m9545o(boolean z10) {
        if (this.f26406r0 == z10) {
            return;
        }
        this.f26406r0 = z10;
        String str = this.f26402p0;
        Drawable drawable = this.f26398n0;
        String str2 = this.f26400o0;
        Drawable drawable2 = this.f26396m0;
        ImageView imageView = this.f26350E;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f26352F;
        if (imageView2 == null) {
            return;
        }
        if (z10) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4847z c4847z = this.f26373b;
        c4847z.f16174a.addOnLayoutChangeListener(c4847z.f16197x);
        this.f26408s0 = true;
        if (m9540j()) {
            c4847z.m5427g();
        }
        m9543m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4847z c4847z = this.f26373b;
        c4847z.f16174a.removeOnLayoutChangeListener(c4847z.f16197x);
        this.f26408s0 = false;
        removeCallbacks(this.f26365Q);
        c4847z.m5426f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f26373b.f16175b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m9546p() {
        boolean zMo25286q;
        boolean zMo25286q2;
        boolean zMo25286q3;
        boolean zMo25286q4;
        boolean zMo25286q5;
        if (m9542l() && this.f26408s0) {
            InterfaceC20719y interfaceC20719y = this.f26404q0;
            if (interfaceC20719y != null) {
                zMo25286q2 = (this.f26410t0 && m9533c(interfaceC20719y, this.f26364P)) ? interfaceC20719y.mo25286q(10) : interfaceC20719y.mo25286q(5);
                zMo25286q3 = interfaceC20719y.mo25286q(7);
                zMo25286q4 = interfaceC20719y.mo25286q(11);
                zMo25286q5 = interfaceC20719y.mo25286q(12);
                zMo25286q = interfaceC20719y.mo25286q(9);
            } else {
                zMo25286q = false;
                zMo25286q2 = false;
                zMo25286q3 = false;
                zMo25286q4 = false;
                zMo25286q5 = false;
            }
            Resources resources = this.f26375c;
            View view = this.f26417x;
            if (zMo25286q4) {
                InterfaceC20719y interfaceC20719y2 = this.f26404q0;
                int iMo9272S = (int) ((interfaceC20719y2 != null ? interfaceC20719y2.mo9272S() : 5000L) / 1000);
                TextView textView = this.f26421z;
                if (textView != null) {
                    textView.setText(String.valueOf(iMo9272S));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iMo9272S, Integer.valueOf(iMo9272S)));
                }
            }
            View view2 = this.f26415w;
            if (zMo25286q5) {
                InterfaceC20719y interfaceC20719y3 = this.f26404q0;
                int iMo9264J = (int) ((interfaceC20719y3 != null ? interfaceC20719y3.mo9264J() : 15000L) / 1000);
                TextView textView2 = this.f26419y;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iMo9264J));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iMo9264J, Integer.valueOf(iMo9264J)));
                }
            }
            m9544n(this.f26409t, zMo25286q3);
            m9544n(view, zMo25286q4);
            m9544n(view2, zMo25286q5);
            m9544n(this.f26411u, zMo25286q);
            InterfaceC7808f interfaceC7808f = this.f26360L;
            if (interfaceC7808f != null) {
                interfaceC7808f.setEnabled(zMo25286q2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX INFO: renamed from: q */
    public final void m9547q() {
        ImageView imageView;
        boolean z10;
        if (m9542l() && this.f26408s0 && (imageView = this.f26413v) != null) {
            boolean zM996d0 = C0513S.m996d0(this.f26404q0, this.f26412u0);
            Drawable drawable = zM996d0 ? this.f26366R : this.f26367S;
            int i10 = zM996d0 ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f26375c.getString(i10));
            InterfaceC20719y interfaceC20719y = this.f26404q0;
            if (interfaceC20719y != null) {
                z10 = true;
                if (!interfaceC20719y.mo25286q(1) || (interfaceC20719y.mo25286q(17) && interfaceC20719y.mo9299s().m25225p())) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            m9544n(imageView, z10);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m9548r() {
        d dVar;
        InterfaceC20719y interfaceC20719y = this.f26404q0;
        if (interfaceC20719y == null) {
            return;
        }
        float f10 = interfaceC20719y.getPlaybackParameters().f71222a;
        float f11 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            dVar = this.f26397n;
            float[] fArr = dVar.f26426d;
            if (i10 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f10 - fArr[i10]);
            if (fAbs < f11) {
                i11 = i10;
                f11 = fAbs;
            }
            i10++;
        }
        dVar.f26427e = i11;
        String str = dVar.f26425c[i11];
        g gVar = this.f26395m;
        gVar.f26434d[0] = str;
        m9544n(this.f26354G, gVar.m9561a(1) || gVar.m9561a(0));
    }

    /* JADX INFO: renamed from: s */
    public final void m9549s() {
        long jMo9265K;
        long jMo9270P;
        if (m9542l() && this.f26408s0) {
            InterfaceC20719y interfaceC20719y = this.f26404q0;
            if (interfaceC20719y == null || !interfaceC20719y.mo25286q(16)) {
                jMo9265K = 0;
                jMo9270P = 0;
            } else {
                jMo9265K = interfaceC20719y.mo9265K() + this.f26353F0;
                jMo9270P = interfaceC20719y.mo9270P() + this.f26353F0;
            }
            TextView textView = this.f26359K;
            if (textView != null && !this.f26416w0) {
                textView.setText(C0513S.m970H(this.f26361M, this.f26362N, jMo9265K));
            }
            InterfaceC7808f interfaceC7808f = this.f26360L;
            if (interfaceC7808f != null) {
                interfaceC7808f.setPosition(jMo9265K);
                if (m9541k(interfaceC20719y)) {
                    jMo9270P = jMo9265K;
                }
                interfaceC7808f.setBufferedPosition(jMo9270P);
            }
            RunnableC4826e runnableC4826e = this.f26365Q;
            removeCallbacks(runnableC4826e);
            int iMo9279f = interfaceC20719y == null ? 1 : interfaceC20719y.mo9279f();
            if (interfaceC20719y != null && interfaceC20719y.isPlaying()) {
                long jMin = Math.min(interfaceC7808f != null ? interfaceC7808f.getPreferredUpdateDelay() : 1000L, 1000 - (jMo9265K % 1000));
                float f10 = interfaceC20719y.getPlaybackParameters().f71222a;
                postDelayed(runnableC4826e, C0513S.m1005j(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f26422z0, 1000L));
            } else {
                if (iMo9279f == 4 || iMo9279f == 1) {
                    return;
                }
                postDelayed(runnableC4826e, 1000L);
            }
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f26373b.f16173C = z10;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(c cVar) {
        boolean z10 = cVar != null;
        ImageView imageView = this.f26350E;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z11 = cVar != null;
        ImageView imageView2 = this.f26352F;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(InterfaceC20719y interfaceC20719y) {
        C0515a.m1030f(Looper.myLooper() == Looper.getMainLooper());
        C0515a.m1025a(interfaceC20719y == null || interfaceC20719y.mo9301t() == Looper.getMainLooper());
        InterfaceC20719y interfaceC20719y2 = this.f26404q0;
        if (interfaceC20719y2 == interfaceC20719y) {
            return;
        }
        b bVar = this.f26377d;
        if (interfaceC20719y2 != null) {
            interfaceC20719y2.mo9260F(bVar);
        }
        this.f26404q0 = interfaceC20719y;
        if (interfaceC20719y != null) {
            interfaceC20719y.mo9282h(bVar);
        }
        m9543m();
    }

    public void setRepeatToggleModes(int i10) {
        this.f26343A0 = i10;
        InterfaceC20719y interfaceC20719y = this.f26404q0;
        if (interfaceC20719y != null && interfaceC20719y.mo25286q(15)) {
            int iMo9288m = this.f26404q0.mo9288m();
            if (i10 == 0 && iMo9288m != 0) {
                this.f26404q0.mo9284k(0);
            } else if (i10 == 1 && iMo9288m == 2) {
                this.f26404q0.mo9284k(1);
            } else if (i10 == 2 && iMo9288m == 1) {
                this.f26404q0.mo9284k(2);
            }
        }
        this.f26373b.m5428h(this.f26342A, i10 != 0);
        m9550t();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f26373b.m5428h(this.f26415w, z10);
        m9546p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f26410t0 = z10;
        m9553w();
    }

    public void setShowNextButton(boolean z10) {
        this.f26373b.m5428h(this.f26411u, z10);
        m9546p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f26412u0 = z10;
        m9547q();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f26373b.m5428h(this.f26409t, z10);
        m9546p();
    }

    public void setShowRewindButton(boolean z10) {
        this.f26373b.m5428h(this.f26417x, z10);
        m9546p();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f26373b.m5428h(this.f26344B, z10);
        m9552v();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f26373b.m5428h(this.f26348D, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f26418x0 = i10;
        if (m9540j()) {
            this.f26373b.m5427g();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f26373b.m5428h(this.f26346C, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f26422z0 = C0513S.m1004i(i10, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        this.f26420y0 = z10;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f26346C;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            m9544n(imageView, onClickListener != null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m9550t() {
        ImageView imageView;
        if (m9542l() && this.f26408s0 && (imageView = this.f26342A) != null) {
            if (this.f26343A0 == 0) {
                m9544n(imageView, false);
                return;
            }
            InterfaceC20719y interfaceC20719y = this.f26404q0;
            String str = this.f26371W;
            Drawable drawable = this.f26368T;
            if (interfaceC20719y == null || !interfaceC20719y.mo25286q(15)) {
                m9544n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m9544n(imageView, true);
            int iMo9288m = interfaceC20719y.mo9288m();
            if (iMo9288m == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iMo9288m == 1) {
                imageView.setImageDrawable(this.f26369U);
                imageView.setContentDescription(this.f26372a0);
            } else {
                if (iMo9288m != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f26370V);
                imageView.setContentDescription(this.f26374b0);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9551u() {
        RecyclerView recyclerView = this.f26393l;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i10 = this.f26407s;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i10 * 2));
        PopupWindow popupWindow = this.f26405r;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i10 * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: v */
    public final void m9552v() {
        ImageView imageView;
        if (m9542l() && this.f26408s0 && (imageView = this.f26344B) != null) {
            InterfaceC20719y interfaceC20719y = this.f26404q0;
            if (!this.f26373b.m5424b(imageView)) {
                m9544n(imageView, false);
                return;
            }
            String str = this.f26386h0;
            Drawable drawable = this.f26378d0;
            if (interfaceC20719y == null || !interfaceC20719y.mo25286q(14)) {
                m9544n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m9544n(imageView, true);
            if (interfaceC20719y.mo9269O()) {
                drawable = this.f26376c0;
            }
            imageView.setImageDrawable(drawable);
            if (interfaceC20719y.mo9269O()) {
                str = this.f26384g0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x0147  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public final void m9553w() {
        long jM982T;
        int i10;
        long j10;
        long[] jArr;
        C20696b.a aVarM25251b;
        int i11;
        int i12;
        AbstractC20686A abstractC20686A;
        boolean z10;
        int i13;
        int i14;
        int length;
        InterfaceC20719y interfaceC20719y = this.f26404q0;
        if (interfaceC20719y == null) {
            return;
        }
        boolean z11 = this.f26410t0;
        AbstractC20686A.c cVar = this.f26364P;
        boolean z12 = false;
        boolean z13 = true;
        this.f26414v0 = z11 && m9533c(interfaceC20719y, cVar);
        long j11 = 0;
        this.f26353F0 = 0L;
        AbstractC20686A abstractC20686AMo9299s = interfaceC20719y.mo25286q(17) ? interfaceC20719y.mo9299s() : AbstractC20686A.f70861a;
        long j12 = -9223372036854775807L;
        if (abstractC20686AMo9299s.m25225p()) {
            if (interfaceC20719y.mo25286q(16)) {
                long jMo25271D = interfaceC20719y.mo25271D();
                if (jMo25271D != -9223372036854775807L) {
                    jM982T = C0513S.m982T(jMo25271D);
                } else {
                    jM982T = 0;
                }
            } else {
                jM982T = 0;
            }
            i10 = 0;
        } else {
            int iMo9268N = interfaceC20719y.mo9268N();
            boolean z14 = this.f26414v0;
            int i15 = z14 ? 0 : iMo9268N;
            int iMo3453o = z14 ? abstractC20686AMo9299s.mo3453o() - 1 : iMo9268N;
            long j13 = 0;
            i10 = 0;
            while (i15 <= iMo3453o) {
                long j14 = j11;
                if (i15 == iMo9268N) {
                    this.f26353F0 = C0513S.m1002g0(j13);
                }
                abstractC20686AMo9299s.m25224n(i15, cVar);
                if (cVar.f70883m == j12) {
                    C0515a.m1030f(this.f26414v0 ^ z13);
                    break;
                }
                int i16 = cVar.f70884n;
                while (i16 <= cVar.f70885o) {
                    AbstractC20686A.b bVar = this.f26363O;
                    abstractC20686AMo9299s.mo3451f(i16, bVar, z12);
                    long j15 = j12;
                    C20696b c20696b = bVar.f70868g;
                    c20696b.getClass();
                    int i17 = c20696b.f70955b;
                    int i18 = 0;
                    while (i18 < i17) {
                        long jM25227b = bVar.m25227b(i18);
                        if (jM25227b == Long.MIN_VALUE) {
                            long j16 = bVar.f70865d;
                            if (j16 == j15) {
                                abstractC20686A = abstractC20686AMo9299s;
                            } else {
                                jM25227b = j16;
                                j10 = jM25227b + bVar.f70866e;
                                if (j10 >= j14) {
                                    jArr = this.f26345B0;
                                    if (i10 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.f26345B0 = Arrays.copyOf(jArr, length);
                                        this.f26347C0 = Arrays.copyOf(this.f26347C0, length);
                                    }
                                    this.f26345B0[i10] = C0513S.m1002g0(j13 + j10);
                                    boolean[] zArr = this.f26347C0;
                                    aVarM25251b = bVar.f70868g.m25251b(i18);
                                    i11 = aVarM25251b.f70960b;
                                    if (i11 == -1) {
                                        abstractC20686A = abstractC20686AMo9299s;
                                    } else {
                                        i12 = 0;
                                        while (true) {
                                            if (i12 < i11) {
                                                abstractC20686A = abstractC20686AMo9299s;
                                                z10 = false;
                                                break;
                                            }
                                            i13 = i12;
                                            i14 = aVarM25251b.f70964f[i13];
                                            abstractC20686A = abstractC20686AMo9299s;
                                            if (i14 == 0 && i14 != 1) {
                                                i12 = i13 + 1;
                                                abstractC20686AMo9299s = abstractC20686A;
                                            }
                                        }
                                        zArr[i10] = !z10;
                                        i10++;
                                    }
                                    z10 = true;
                                    zArr[i10] = !z10;
                                    i10++;
                                } else {
                                    abstractC20686A = abstractC20686AMo9299s;
                                }
                            }
                        } else {
                            j10 = jM25227b + bVar.f70866e;
                            if (j10 >= j14) {
                                jArr = this.f26345B0;
                                if (i10 == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.f26345B0 = Arrays.copyOf(jArr, length);
                                    this.f26347C0 = Arrays.copyOf(this.f26347C0, length);
                                }
                                this.f26345B0[i10] = C0513S.m1002g0(j13 + j10);
                                boolean[] zArr2 = this.f26347C0;
                                aVarM25251b = bVar.f70868g.m25251b(i18);
                                i11 = aVarM25251b.f70960b;
                                if (i11 == -1) {
                                    abstractC20686A = abstractC20686AMo9299s;
                                } else {
                                    i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            abstractC20686A = abstractC20686AMo9299s;
                                            z10 = false;
                                            break;
                                        } else {
                                            i13 = i12;
                                            i14 = aVarM25251b.f70964f[i13];
                                            abstractC20686A = abstractC20686AMo9299s;
                                            if (i14 == 0) {
                                            }
                                        }
                                        i12 = i13 + 1;
                                        abstractC20686AMo9299s = abstractC20686A;
                                    }
                                    zArr2[i10] = !z10;
                                    i10++;
                                }
                                z10 = true;
                                zArr2[i10] = !z10;
                                i10++;
                            } else {
                                abstractC20686A = abstractC20686AMo9299s;
                            }
                        }
                        i18++;
                        iMo9268N = iMo9268N;
                        abstractC20686AMo9299s = abstractC20686A;
                        j14 = 0;
                    }
                    i16++;
                    j12 = j15;
                    abstractC20686AMo9299s = abstractC20686AMo9299s;
                    z12 = false;
                    j14 = 0;
                }
                j13 += cVar.f70883m;
                i15++;
                abstractC20686AMo9299s = abstractC20686AMo9299s;
                z12 = false;
                z13 = true;
                j11 = 0;
            }
            jM982T = j13;
        }
        long jM1002g0 = C0513S.m1002g0(jM982T);
        TextView textView = this.f26358J;
        if (textView != null) {
            textView.setText(C0513S.m970H(this.f26361M, this.f26362N, jM1002g0));
        }
        InterfaceC7808f interfaceC7808f = this.f26360L;
        if (interfaceC7808f != null) {
            interfaceC7808f.setDuration(jM1002g0);
            long[] jArr2 = this.f26349D0;
            int length2 = jArr2.length;
            int i19 = i10 + length2;
            long[] jArr3 = this.f26345B0;
            if (i19 > jArr3.length) {
                this.f26345B0 = Arrays.copyOf(jArr3, i19);
                this.f26347C0 = Arrays.copyOf(this.f26347C0, i19);
            }
            System.arraycopy(jArr2, 0, this.f26345B0, i10, length2);
            System.arraycopy(this.f26351E0, 0, this.f26347C0, i10, length2);
            interfaceC7808f.mo9525b(this.f26345B0, this.f26347C0, i19);
        }
        m9549s();
    }

    /* JADX INFO: renamed from: x */
    public final void m9554x() {
        i iVar = this.f26399o;
        iVar.getClass();
        List<j> list = Collections.EMPTY_LIST;
        iVar.f26443c = list;
        a aVar = this.f26401p;
        aVar.getClass();
        aVar.f26443c = list;
        InterfaceC20719y interfaceC20719y = this.f26404q0;
        ImageView imageView = this.f26348D;
        if (interfaceC20719y != null && interfaceC20719y.mo25286q(30) && this.f26404q0.mo25286q(29)) {
            C20690E c20690eMo9290n = this.f26404q0.mo9290n();
            C2500U c2500uM9536f = m9536f(c20690eMo9290n, 1);
            aVar.f26443c = c2500uM9536f;
            C7805c c7805c = C7805c.this;
            InterfaceC20719y interfaceC20719y2 = c7805c.f26404q0;
            g gVar = c7805c.f26395m;
            interfaceC20719y2.getClass();
            C20689D c20689dMo9303u = interfaceC20719y2.mo9303u();
            if (c2500uM9536f.isEmpty()) {
                gVar.f26434d[1] = c7805c.getResources().getString(R.string.exo_track_selection_none);
            } else if (aVar.m9557d(c20689dMo9303u)) {
                for (int i10 = 0; i10 < c2500uM9536f.f8332e; i10++) {
                    j jVar = (j) c2500uM9536f.get(i10);
                    if (jVar.f26440a.f70942e[jVar.f26441b]) {
                        gVar.f26434d[1] = jVar.f26442c;
                        break;
                    }
                }
            } else {
                gVar.f26434d[1] = c7805c.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f26373b.m5424b(imageView)) {
                iVar.m9563d(m9536f(c20690eMo9290n, 3));
            } else {
                iVar.m9563d(C2500U.f8330f);
            }
        }
        m9544n(imageView, iVar.getItemCount() > 0);
        g gVar2 = this.f26395m;
        m9544n(this.f26354G, gVar2.m9561a(1) || gVar2.m9561a(0));
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class b implements InterfaceC20719y.c, InterfaceC7808f.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: D */
        public final void mo3825D(InterfaceC20719y interfaceC20719y, InterfaceC20719y.b bVar) {
            boolean zM25340a = bVar.m25340a(4, 5, 13);
            C7805c c7805c = C7805c.this;
            if (zM25340a) {
                c7805c.m9547q();
            }
            if (bVar.m25340a(4, 5, 7, 13)) {
                c7805c.m9549s();
            }
            if (bVar.m25340a(8, 13)) {
                c7805c.m9550t();
            }
            if (bVar.m25340a(9, 13)) {
                c7805c.m9552v();
            }
            if (bVar.m25340a(8, 9, 11, 0, 16, 17, 13)) {
                c7805c.m9546p();
            }
            if (bVar.m25340a(11, 0, 13)) {
                c7805c.m9553w();
            }
            if (bVar.m25340a(12, 13)) {
                c7805c.m9548r();
            }
            if (bVar.m25340a(2, 13)) {
                c7805c.m9554x();
            }
        }

        @Override // androidx.media3.p482ui.InterfaceC7808f.a
        /* JADX INFO: renamed from: d */
        public final void mo9558d(long j10) {
            C7805c c7805c = C7805c.this;
            c7805c.f26416w0 = true;
            TextView textView = c7805c.f26359K;
            if (textView != null) {
                textView.setText(C0513S.m970H(c7805c.f26361M, c7805c.f26362N, j10));
            }
            c7805c.f26373b.m5426f();
            InterfaceC20719y interfaceC20719y = c7805c.f26404q0;
            if (interfaceC20719y == null || !c7805c.f26420y0) {
                return;
            }
            if (c7805c.m9539i(interfaceC20719y)) {
                try {
                    Method method = c7805c.f26381f;
                    method.getClass();
                    method.invoke(c7805c.f26404q0, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
            if (c7805c.m9538h(c7805c.f26404q0)) {
                try {
                    Method method2 = c7805c.f26387i;
                    method2.getClass();
                    method2.invoke(c7805c.f26404q0, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            }
            StringBuilder sb2 = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
            InterfaceC20719y interfaceC20719y2 = c7805c.f26404q0;
            interfaceC20719y2.getClass();
            sb2.append(interfaceC20719y2.getClass());
            C0539y.m1074f(sb2.toString());
        }

        @Override // androidx.media3.p482ui.InterfaceC7808f.a
        /* JADX INFO: renamed from: e */
        public final void mo9559e(long j10) {
            C7805c c7805c = C7805c.this;
            TextView textView = c7805c.f26359K;
            if (textView != null) {
                textView.setText(C0513S.m970H(c7805c.f26361M, c7805c.f26362N, j10));
            }
            if (c7805c.m9541k(c7805c.f26404q0)) {
                C7805c.m9531a(c7805c, c7805c.f26404q0, j10);
            }
        }

        @Override // androidx.media3.p482ui.InterfaceC7808f.a
        /* JADX INFO: renamed from: f */
        public final void mo9560f(long j10, boolean z10) {
            C7805c c7805c = C7805c.this;
            c7805c.f26416w0 = false;
            InterfaceC20719y interfaceC20719y = c7805c.f26404q0;
            if (interfaceC20719y != null) {
                if (!z10) {
                    C7805c.m9531a(c7805c, interfaceC20719y, j10);
                }
                if (c7805c.m9539i(c7805c.f26404q0)) {
                    try {
                        Method method = c7805c.f26381f;
                        method.getClass();
                        method.invoke(c7805c.f26404q0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else if (c7805c.m9538h(c7805c.f26404q0)) {
                    try {
                        Method method2 = c7805c.f26387i;
                        method2.getClass();
                        method2.invoke(c7805c.f26404q0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
            c7805c.f26373b.m5427g();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C7805c c7805c = C7805c.this;
            ImageView imageView = c7805c.f26348D;
            View view2 = c7805c.f26357I;
            View view3 = c7805c.f26356H;
            View view4 = c7805c.f26354G;
            C4847z c4847z = c7805c.f26373b;
            InterfaceC20719y interfaceC20719y = c7805c.f26404q0;
            if (interfaceC20719y == null) {
                return;
            }
            c4847z.m5427g();
            if (c7805c.f26411u == view) {
                if (interfaceC20719y.mo25286q(9)) {
                    interfaceC20719y.mo25287v();
                    return;
                }
                return;
            }
            if (c7805c.f26409t == view) {
                if (interfaceC20719y.mo25286q(7)) {
                    interfaceC20719y.mo25285j();
                    return;
                }
                return;
            }
            if (c7805c.f26415w == view) {
                if (interfaceC20719y.mo9279f() == 4 || !interfaceC20719y.mo25286q(12)) {
                    return;
                }
                interfaceC20719y.mo25282e();
                return;
            }
            if (c7805c.f26417x == view) {
                if (interfaceC20719y.mo25286q(11)) {
                    interfaceC20719y.mo25283g();
                    return;
                }
                return;
            }
            if (c7805c.f26413v == view) {
                if (C0513S.m996d0(interfaceC20719y, c7805c.f26412u0)) {
                    C0513S.m974L(interfaceC20719y);
                    return;
                } else {
                    if (interfaceC20719y.mo25286q(1)) {
                        interfaceC20719y.pause();
                        return;
                    }
                    return;
                }
            }
            if (c7805c.f26342A == view) {
                if (interfaceC20719y.mo25286q(15)) {
                    int iMo9288m = interfaceC20719y.mo9288m();
                    int i10 = c7805c.f26343A0;
                    for (int i11 = 1; i11 <= 2; i11++) {
                        int i12 = (iMo9288m + i11) % 3;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2 || (i10 & 2) == 0) {
                                }
                            } else if ((i10 & 1) == 0) {
                            }
                        }
                        iMo9288m = i12;
                    }
                    interfaceC20719y.mo9284k(iMo9288m);
                    return;
                }
                return;
            }
            if (c7805c.f26344B == view) {
                if (interfaceC20719y.mo25286q(14)) {
                    interfaceC20719y.mo9256A(!interfaceC20719y.mo9269O());
                    return;
                }
                return;
            }
            if (view4 == view) {
                c4847z.m5426f();
                c7805c.m9535e(c7805c.f26395m, view4);
                return;
            }
            if (view3 == view) {
                c4847z.m5426f();
                c7805c.m9535e(c7805c.f26397n, view3);
            } else if (view2 == view) {
                c4847z.m5426f();
                c7805c.m9535e(c7805c.f26401p, view2);
            } else if (imageView == view) {
                c4847z.m5426f();
                c7805c.m9535e(c7805c.f26399o, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            C7805c c7805c = C7805c.this;
            if (c7805c.f26355G0) {
                c7805c.f26373b.m5427g();
            }
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void mo3822A(boolean z10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: B */
        public final /* synthetic */ void mo3823B(C20717w c20717w) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void mo3826E(C20714t c20714t) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void mo3835N(C20718x c20718x) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void mo3836O(C20689D c20689d) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: T */
        public final /* synthetic */ void mo3841T(InterfaceC20719y.a aVar) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: V */
        public final /* synthetic */ void mo3843V(C20690E c20690e) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo3848a(C20694I c20694i) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: a0 */
        public final /* synthetic */ void mo3849a0(int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onCues(List list) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onPlaybackStateChanged(int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onPlayerError(C20717w c20717w) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onVolumeChanged(float f10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: s */
        public final /* synthetic */ void mo3872s(C0227c c0227c) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void mo3873t(C20713s c20713s) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void mo3875v(int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void mo3824C(int i10, boolean z10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void mo3833L(C20711q c20711q, int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onTimelineChanged(AbstractC20686A abstractC20686A, int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onPositionDiscontinuity(InterfaceC20719y.d dVar, InterfaceC20719y.d dVar2, int i10) {
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$i */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class i extends k {
        public i() {
            super();
        }

        @Override // androidx.media3.p482ui.C7805c.k, androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(h hVar, int i10) {
            super.onBindViewHolder(hVar, i10);
            if (i10 > 0) {
                j jVar = this.f26443c.get(i10 - 1);
                hVar.f26438m.setVisibility(jVar.f26440a.f70942e[jVar.f26441b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.p482ui.C7805c.k
        /* JADX INFO: renamed from: b */
        public final void mo9555b(h hVar) {
            boolean z10;
            hVar.f26437l.setText(R.string.exo_track_selection_none);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f26443c.size()) {
                    z10 = true;
                    break;
                }
                j jVar = this.f26443c.get(i10);
                if (jVar.f26440a.f70942e[jVar.f26441b]) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            hVar.f26438m.setVisibility(z10 ? 0 : 4);
            hVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: S3.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7805c c7805c = C7805c.this;
                    InterfaceC20719y interfaceC20719y = c7805c.f26404q0;
                    if (interfaceC20719y == null || !interfaceC20719y.mo25286q(29)) {
                        return;
                    }
                    c7805c.f26404q0.mo9267M(c7805c.f26404q0.mo9303u().mo12459a().mo12462c(3).mo12464f().mo12466h().mo12468j().mo12461b());
                    c7805c.f26405r.dismiss();
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public final void m9563d(List<j> list) {
            C7805c c7805c = C7805c.this;
            ImageView imageView = c7805c.f26348D;
            boolean z10 = false;
            for (int i10 = 0; i10 < ((C2500U) list).f8332e; i10++) {
                j jVar = (j) ((C2500U) list).get(i10);
                if (jVar.f26440a.f70942e[jVar.f26441b]) {
                    z10 = true;
                    break;
                }
            }
            if (imageView != null) {
                imageView.setImageDrawable(z10 ? c7805c.f26388i0 : c7805c.f26390j0);
                imageView.setContentDescription(z10 ? c7805c.f26392k0 : c7805c.f26394l0);
            }
            this.f26443c = list;
        }

        @Override // androidx.media3.p482ui.C7805c.k
        /* JADX INFO: renamed from: c */
        public final void mo9556c(String str) {
        }
    }

    public void setProgressUpdateListener(e eVar) {
    }
}
