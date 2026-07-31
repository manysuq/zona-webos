package androidx.media3.p482ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.p482ui.C7806d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mobi.zona.R;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p021B2.C0227c;
import p039C2.C0515a;
import p170J7.AbstractC2481A;
import p328S3.C4847z;
import p328S3.RunnableC4812C;
import p328S3.RunnableC4814E;
import p884z2.AbstractC20686A;
import p884z2.C20689D;
import p884z2.C20690E;
import p884z2.C20694I;
import p884z2.C20695a;
import p884z2.C20711q;
import p884z2.C20713s;
import p884z2.C20714t;
import p884z2.C20717w;
import p884z2.C20718x;
import p884z2.InterfaceC20697c;
import p884z2.InterfaceC20706l;
import p884z2.InterfaceC20719y;

/* JADX INFO: renamed from: androidx.media3.ui.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7806d extends FrameLayout implements InterfaceC20697c {

    /* JADX INFO: renamed from: A */
    public boolean f26445A;

    /* JADX INFO: renamed from: B */
    public CharSequence f26446B;

    /* JADX INFO: renamed from: C */
    public int f26447C;

    /* JADX INFO: renamed from: D */
    public boolean f26448D;

    /* JADX INFO: renamed from: E */
    public boolean f26449E;

    /* JADX INFO: renamed from: F */
    public boolean f26450F;

    /* JADX INFO: renamed from: G */
    public boolean f26451G;

    /* JADX INFO: renamed from: b */
    public final b f26452b;

    /* JADX INFO: renamed from: c */
    public final AspectRatioFrameLayout f26453c;

    /* JADX INFO: renamed from: d */
    public final View f26454d;

    /* JADX INFO: renamed from: e */
    public final View f26455e;

    /* JADX INFO: renamed from: f */
    public final boolean f26456f;

    /* JADX INFO: renamed from: g */
    public final e f26457g;

    /* JADX INFO: renamed from: h */
    public final ImageView f26458h;

    /* JADX INFO: renamed from: i */
    public final ImageView f26459i;

    /* JADX INFO: renamed from: j */
    public final SubtitleView f26460j;

    /* JADX INFO: renamed from: k */
    public final View f26461k;

    /* JADX INFO: renamed from: l */
    public final TextView f26462l;

    /* JADX INFO: renamed from: m */
    public final C7805c f26463m;

    /* JADX INFO: renamed from: n */
    public final FrameLayout f26464n;

    /* JADX INFO: renamed from: o */
    public final FrameLayout f26465o;

    /* JADX INFO: renamed from: p */
    public final Handler f26466p;

    /* JADX INFO: renamed from: q */
    public final Class<?> f26467q;

    /* JADX INFO: renamed from: r */
    public final Method f26468r;

    /* JADX INFO: renamed from: s */
    public final Object f26469s;

    /* JADX INFO: renamed from: t */
    public InterfaceC20719y f26470t;

    /* JADX INFO: renamed from: u */
    public boolean f26471u;

    /* JADX INFO: renamed from: v */
    public C7805c.l f26472v;

    /* JADX INFO: renamed from: w */
    public int f26473w;

    /* JADX INFO: renamed from: x */
    public int f26474x;

    /* JADX INFO: renamed from: y */
    public Drawable f26475y;

    /* JADX INFO: renamed from: z */
    public int f26476z;

    /* JADX INFO: renamed from: androidx.media3.ui.d$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m9581a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface c {
        /* JADX INFO: renamed from: a */
        void m9582a();
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface d {
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public SurfaceSyncGroup f26480a;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m9583a(e eVar, SurfaceView surfaceView, RunnableC4812C runnableC4812C) {
            eVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            eVar.f26480a = surfaceSyncGroup;
            C0515a.m1030f(surfaceSyncGroup.add(rootSurfaceControl, new RunnableC4814E()));
            runnableC4812C.run();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }

        /* JADX INFO: renamed from: b */
        public final void m9584b() {
            SurfaceSyncGroup surfaceSyncGroup = this.f26480a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f26480a = null;
            }
        }
    }

    public C7806d(Context context) {
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, null, 0);
        b bVar = new b();
        this.f26452b = bVar;
        this.f26466p = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f26453c = null;
            this.f26454d = null;
            this.f26455e = null;
            this.f26456f = false;
            this.f26457g = null;
            this.f26458h = null;
            this.f26459i = null;
            this.f26460j = null;
            this.f26461k = null;
            this.f26462l = null;
            this.f26463m = null;
            this.f26464n = null;
            this.f26465o = null;
            this.f26467q = null;
            this.f26468r = null;
            this.f26469s = null;
            ImageView imageView = new ImageView(context);
            if (Build.VERSION.SDK_INT >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f26453c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f26454d = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (Build.VERSION.SDK_INT >= 34) {
                a.m9581a(surfaceView);
            }
            this.f26455e = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(bVar);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f26455e = null;
        }
        this.f26456f = false;
        this.f26457g = Build.VERSION.SDK_INT == 34 ? new e() : null;
        this.f26464n = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f26465o = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f26458h = (ImageView) findViewById(R.id.exo_image);
        this.f26474x = 0;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: S3.A
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    final Bitmap bitmap = (Bitmap) objArr[1];
                    final C7806d c7806d = this.f16087a;
                    c7806d.f26466p.post(new Runnable() { // from class: S3.B
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7806d.m9565a(c7806d, bitmap);
                        }
                    });
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f26467q = cls;
        this.f26468r = method;
        this.f26469s = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f26459i = imageView2;
        this.f26473w = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f26460j = subtitleView;
        if (subtitleView != null) {
            subtitleView.m9517a();
            subtitleView.m9518b();
        }
        View viewFindViewById = findViewById(R.id.exo_buffering);
        this.f26461k = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.f26476z = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f26462l = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C7805c c7805c = (C7805c) findViewById(R.id.exo_controller);
        View viewFindViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (c7805c != null) {
            this.f26463m = c7805c;
        } else if (viewFindViewById2 != null) {
            C7805c c7805c2 = new C7805c(context);
            this.f26463m = c7805c2;
            c7805c2.setId(R.id.exo_controller);
            c7805c2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(c7805c2, iIndexOfChild);
        } else {
            this.f26463m = null;
        }
        C7805c c7805c3 = this.f26463m;
        this.f26447C = c7805c3 != null ? 5000 : 0;
        this.f26450F = true;
        this.f26448D = true;
        this.f26449E = true;
        this.f26471u = c7805c3 != null;
        if (c7805c3 != null) {
            C4847z c4847z = c7805c3.f26373b;
            int i10 = c4847z.f16199z;
            if (i10 != 3 && i10 != 2) {
                c4847z.m5426f();
                c4847z.m5429i(2);
            }
            C7805c c7805c4 = this.f26463m;
            b bVar2 = this.f26452b;
            c7805c4.getClass();
            bVar2.getClass();
            c7805c4.f26391k.add(bVar2);
        }
        setClickable(true);
        m9576l();
    }

    /* JADX INFO: renamed from: a */
    public static void m9565a(C7806d c7806d, Bitmap bitmap) {
        c7806d.setImage(new BitmapDrawable(c7806d.getResources(), bitmap));
        InterfaceC20719y interfaceC20719y = c7806d.f26470t;
        if (interfaceC20719y != null && interfaceC20719y.mo25286q(30) && interfaceC20719y.mo9290n().m25237a(2)) {
            return;
        }
        ImageView imageView = c7806d.f26458h;
        if (imageView != null) {
            imageView.setVisibility(0);
            c7806d.m9579o();
        }
        View view = c7806d.f26454d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f26458h;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        m9579o();
    }

    private void setImageOutput(InterfaceC20719y interfaceC20719y) {
        Class<?> cls = this.f26467q;
        if (cls == null || !cls.isAssignableFrom(interfaceC20719y.getClass())) {
            return;
        }
        try {
            Method method = this.f26468r;
            method.getClass();
            Object obj = this.f26469s;
            obj.getClass();
            method.invoke(interfaceC20719y, obj);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9566b() {
        InterfaceC20719y interfaceC20719y = this.f26470t;
        return interfaceC20719y != null && this.f26469s != null && interfaceC20719y.mo25286q(30) && interfaceC20719y.mo9290n().m25237a(4);
    }

    /* JADX INFO: renamed from: c */
    public final void m9567c() {
        ImageView imageView = this.f26458h;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9568d() {
        InterfaceC20719y interfaceC20719y = this.f26470t;
        return interfaceC20719y != null && interfaceC20719y.mo25286q(16) && this.f26470t.isPlayingAd() && this.f26470t.mo9311z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e eVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (eVar = this.f26457g) != null && this.f26451G) {
            eVar.m9584b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC20719y interfaceC20719y = this.f26470t;
        if (interfaceC20719y != null && interfaceC20719y.mo25286q(16) && this.f26470t.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C7805c c7805c = this.f26463m;
        if (z10 && m9580p() && !c7805c.m9540j()) {
            m9569e(true);
            return true;
        }
        if ((m9580p() && c7805c.m9534d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m9569e(true);
            return true;
        }
        if (z10 && m9580p()) {
            m9569e(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m9569e(boolean z10) {
        if (!(m9568d() && this.f26449E) && m9580p()) {
            C7805c c7805c = this.f26463m;
            boolean z11 = c7805c.m9540j() && c7805c.getShowTimeoutMs() <= 0;
            boolean zM9571g = m9571g();
            if (z10 || z11 || zM9571g) {
                m9572h(zM9571g);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9570f(Drawable drawable) {
        ImageView imageView = this.f26459i;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f26473w == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f26453c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9571g() {
        InterfaceC20719y interfaceC20719y = this.f26470t;
        if (interfaceC20719y == null) {
            return true;
        }
        int iMo9279f = interfaceC20719y.mo9279f();
        if (!this.f26448D) {
            return false;
        }
        if (this.f26470t.mo25286q(17) && this.f26470t.mo9299s().m25225p()) {
            return false;
        }
        if (iMo9279f != 1 && iMo9279f != 4) {
            InterfaceC20719y interfaceC20719y2 = this.f26470t;
            interfaceC20719y2.getClass();
            if (interfaceC20719y2.mo9311z()) {
                return false;
            }
        }
        return true;
    }

    @Override // p884z2.InterfaceC20697c
    public List<C20695a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f26465o;
        if (frameLayout != null) {
            arrayList.add(new C20695a(frameLayout, "Transparent overlay does not impact viewability", 4));
        }
        C7805c c7805c = this.f26463m;
        if (c7805c != null) {
            arrayList.add(new C20695a(c7805c, null, 1));
        }
        return AbstractC2481A.m3204n(arrayList);
    }

    @Override // p884z2.InterfaceC20697c
    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f26464n;
        C0515a.m1032h(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f26473w;
    }

    public boolean getControllerAutoShow() {
        return this.f26448D;
    }

    public boolean getControllerHideOnTouch() {
        return this.f26450F;
    }

    public int getControllerShowTimeoutMs() {
        return this.f26447C;
    }

    public Drawable getDefaultArtwork() {
        return this.f26475y;
    }

    public int getImageDisplayMode() {
        return this.f26474x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f26465o;
    }

    public InterfaceC20719y getPlayer() {
        return this.f26470t;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f26453c;
        C0515a.m1031g(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f26460j;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f26473w != 0;
    }

    public boolean getUseController() {
        return this.f26471u;
    }

    public View getVideoSurfaceView() {
        return this.f26455e;
    }

    /* JADX INFO: renamed from: h */
    public final void m9572h(boolean z10) {
        if (m9580p()) {
            int i10 = z10 ? 0 : this.f26447C;
            C7805c c7805c = this.f26463m;
            c7805c.setShowTimeoutMs(i10);
            C4847z c4847z = c7805c.f26373b;
            C7805c c7805c2 = c4847z.f16174a;
            if (!c7805c2.m9542l()) {
                c7805c2.setVisibility(0);
                c7805c2.m9543m();
                ImageView imageView = c7805c2.f26413v;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            c4847z.m5430k();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9573i() {
        if (!m9580p() || this.f26470t == null) {
            return;
        }
        C7805c c7805c = this.f26463m;
        if (!c7805c.m9540j()) {
            m9569e(true);
        } else if (this.f26450F) {
            c7805c.m9537g();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9574j() {
        InterfaceC20719y interfaceC20719y = this.f26470t;
        C20694I c20694iMo9262H = interfaceC20719y != null ? interfaceC20719y.mo9262H() : C20694I.f70945d;
        int i10 = c20694iMo9262H.f70946a;
        int i11 = c20694iMo9262H.f70947b;
        float f10 = this.f26456f ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * c20694iMo9262H.f70948c) / i11;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f26453c;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: k */
    public final void m9575k() {
        boolean z10;
        View view = this.f26461k;
        if (view != null) {
            InterfaceC20719y interfaceC20719y = this.f26470t;
            if (interfaceC20719y == null || interfaceC20719y.mo9279f() != 2) {
                z10 = false;
            } else {
                int i10 = this.f26476z;
                z10 = true;
                if (i10 != 2 && (i10 != 1 || !this.f26470t.mo9311z())) {
                    z10 = false;
                }
            }
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9576l() {
        C7805c c7805c = this.f26463m;
        if (c7805c == null || !this.f26471u) {
            setContentDescription(null);
        } else if (c7805c.m9540j()) {
            setContentDescription(this.f26450F ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m9577m() {
        TextView textView = this.f26462l;
        if (textView != null) {
            CharSequence charSequence = this.f26446B;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                InterfaceC20719y interfaceC20719y = this.f26470t;
                if (interfaceC20719y != null) {
                    interfaceC20719y.mo9286l();
                }
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9578n(boolean z10) {
        byte[] bArr;
        Drawable drawable;
        InterfaceC20719y interfaceC20719y = this.f26470t;
        boolean zM9570f = false;
        boolean z11 = (interfaceC20719y == null || !interfaceC20719y.mo25286q(30) || interfaceC20719y.mo9290n().f70937a.isEmpty()) ? false : true;
        boolean z12 = this.f26445A;
        ImageView imageView = this.f26459i;
        View view = this.f26454d;
        if (!z12 && (!z11 || z10)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m9567c();
        }
        if (z11) {
            InterfaceC20719y interfaceC20719y2 = this.f26470t;
            boolean z13 = interfaceC20719y2 != null && interfaceC20719y2.mo25286q(30) && interfaceC20719y2.mo9290n().m25237a(2);
            boolean zM9566b = m9566b();
            if (!z13 && !zM9566b) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m9567c();
            }
            ImageView imageView2 = this.f26458h;
            boolean z14 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM9566b && !z13 && z14) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m9579o();
                }
            } else if (z13 && !zM9566b && z14) {
                m9567c();
            }
            if (!z13 && !zM9566b && this.f26473w != 0) {
                C0515a.m1031g(imageView);
                if (interfaceC20719y != null && interfaceC20719y.mo25286q(18) && (bArr = interfaceC20719y.mo9271Q().f71163g) != null) {
                    zM9570f = m9570f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zM9570f || m9570f(this.f26475y)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m9579o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f26458h;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f26474x == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f26453c) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m9580p() || this.f26470t == null) {
            return false;
        }
        m9569e(true);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* JADX INFO: renamed from: p */
    public final boolean m9580p() {
        if (!this.f26471u) {
            return false;
        }
        C0515a.m1031g(this.f26463m);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m9573i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        C0515a.m1030f(i10 == 0 || this.f26459i != null);
        if (this.f26473w != i10) {
            this.f26473w = i10;
            m9578n(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.InterfaceC7798a interfaceC7798a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f26453c;
        C0515a.m1031g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC7798a);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f26448D = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f26449E = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        C0515a.m1031g(this.f26463m);
        this.f26450F = z10;
        m9576l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(C7805c.c cVar) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setOnFullScreenModeChangedListener(cVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        this.f26447C = i10;
        if (c7805c.m9540j()) {
            m9572h(m9571g());
        }
    }

    public void setControllerVisibilityListener(c cVar) {
        if (cVar != null) {
            setControllerVisibilityListener((C7805c.l) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C0515a.m1030f(this.f26462l != null);
        this.f26446B = charSequence;
        m9577m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f26475y != drawable) {
            this.f26475y = drawable;
            m9578n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f26451G = z10;
    }

    public void setErrorMessageProvider(InterfaceC20706l<? super C20717w> interfaceC20706l) {
        if (interfaceC20706l != null) {
            m9577m();
        }
    }

    public void setFullscreenButtonClickListener(d dVar) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setOnFullScreenModeChangedListener(this.f26452b);
    }

    public void setFullscreenButtonState(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.m9545o(z10);
    }

    public void setImageDisplayMode(int i10) {
        C0515a.m1030f(this.f26458h != null);
        if (this.f26474x != i10) {
            this.f26474x = i10;
            m9579o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f26445A != z10) {
            this.f26445A = z10;
            m9578n(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00ec  */
    public void setPlayer(InterfaceC20719y interfaceC20719y) {
        boolean z10 = true;
        C0515a.m1030f(Looper.myLooper() == Looper.getMainLooper());
        C0515a.m1025a(interfaceC20719y == null || interfaceC20719y.mo9301t() == Looper.getMainLooper());
        InterfaceC20719y interfaceC20719y2 = this.f26470t;
        if (interfaceC20719y2 == interfaceC20719y) {
            return;
        }
        View view = this.f26455e;
        b bVar = this.f26452b;
        if (interfaceC20719y2 != null) {
            interfaceC20719y2.mo9260F(bVar);
            if (interfaceC20719y2.mo25286q(27)) {
                if (view instanceof TextureView) {
                    interfaceC20719y2.mo9261G((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC20719y2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
            Class<?> cls = this.f26467q;
            if (cls != null && cls.isAssignableFrom(interfaceC20719y2.getClass())) {
                try {
                    Method method = this.f26468r;
                    method.getClass();
                    method.invoke(interfaceC20719y2, null);
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        SubtitleView subtitleView = this.f26460j;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f26470t = interfaceC20719y;
        boolean zM9580p = m9580p();
        C7805c c7805c = this.f26463m;
        if (zM9580p) {
            c7805c.setPlayer(interfaceC20719y);
        }
        m9575k();
        m9577m();
        m9578n(true);
        if (interfaceC20719y == null) {
            if (c7805c != null) {
                c7805c.m9537g();
                return;
            }
            return;
        }
        if (interfaceC20719y.mo25286q(27)) {
            if (view instanceof TextureView) {
                interfaceC20719y.mo9306w((TextureView) view);
            } else if (view instanceof SurfaceView) {
                interfaceC20719y.setVideoSurfaceView((SurfaceView) view);
            }
            if (interfaceC20719y.mo25286q(30)) {
                AbstractC2481A<C20690E.a> abstractC2481A = interfaceC20719y.mo9290n().f70937a;
                int i10 = 0;
                loop0: while (true) {
                    if (i10 >= abstractC2481A.size()) {
                        z10 = false;
                        break;
                    }
                    if (abstractC2481A.get(i10).f70939b.f70889c == 2) {
                        C20690E.a aVar = abstractC2481A.get(i10);
                        for (int i11 = 0; i11 < aVar.f70941d.length; i11++) {
                            if (aVar.m25239b(i11)) {
                                break loop0;
                            }
                        }
                    }
                    i10++;
                }
                if (z10) {
                    m9574j();
                }
            } else {
                m9574j();
            }
        }
        if (subtitleView != null && interfaceC20719y.mo25286q(28)) {
            subtitleView.setCues(interfaceC20719y.mo9292o().f762a);
        }
        interfaceC20719y.mo9282h(bVar);
        setImageOutput(interfaceC20719y);
        m9569e(false);
    }

    public void setRepeatToggleModes(int i10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f26453c;
        C0515a.m1031g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f26476z != i10) {
            this.f26476z = i10;
            m9575k();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f26454d;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        c7805c.setTimeBarScrubbingEnabled(z10);
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        C7805c c7805c = this.f26463m;
        C0515a.m1030f((z10 && c7805c == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f26471u == z10) {
            return;
        }
        this.f26471u = z10;
        if (m9580p()) {
            c7805c.setPlayer(this.f26470t);
        } else if (c7805c != null) {
            c7805c.m9537g();
            c7805c.setPlayer(null);
        }
        m9576l();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f26455e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(C7805c.l lVar) {
        C7805c c7805c = this.f26463m;
        C0515a.m1031g(c7805c);
        CopyOnWriteArrayList<C7805c.l> copyOnWriteArrayList = c7805c.f26391k;
        C7805c.l lVar2 = this.f26472v;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            copyOnWriteArrayList.remove(lVar2);
        }
        this.f26472v = lVar;
        if (lVar != null) {
            copyOnWriteArrayList.add(lVar);
            setControllerVisibilityListener((c) null);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class b implements InterfaceC20719y.c, View.OnClickListener, C7805c.l, C7805c.c {

        /* JADX INFO: renamed from: b */
        public final AbstractC20686A.b f26477b = new AbstractC20686A.b();

        /* JADX INFO: renamed from: c */
        public Object f26478c;

        public b() {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: V */
        public final void mo3843V(C20690E c20690e) {
            C7806d c7806d = C7806d.this;
            InterfaceC20719y interfaceC20719y = c7806d.f26470t;
            interfaceC20719y.getClass();
            AbstractC20686A abstractC20686AMo9299s = interfaceC20719y.mo25286q(17) ? interfaceC20719y.mo9299s() : AbstractC20686A.f70861a;
            if (abstractC20686AMo9299s.m25225p()) {
                this.f26478c = null;
            } else {
                boolean zMo25286q = interfaceC20719y.mo25286q(30);
                AbstractC20686A.b bVar = this.f26477b;
                if (!zMo25286q || interfaceC20719y.mo9290n().f70937a.isEmpty()) {
                    Object obj = this.f26478c;
                    if (obj != null) {
                        int iMo3479b = abstractC20686AMo9299s.mo3479b(obj);
                        if (iMo3479b != -1) {
                            if (interfaceC20719y.mo9268N() == abstractC20686AMo9299s.mo3451f(iMo3479b, bVar, false).f70864c) {
                                return;
                            }
                        }
                        this.f26478c = null;
                    }
                } else {
                    this.f26478c = abstractC20686AMo9299s.mo3451f(interfaceC20719y.mo9259E(), bVar, true).f70863b;
                }
            }
            c7806d.m9578n(false);
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: a */
        public final void mo3848a(C20694I c20694i) {
            C7806d c7806d;
            InterfaceC20719y interfaceC20719y;
            if (c20694i.equals(C20694I.f70945d) || (interfaceC20719y = (c7806d = C7806d.this).f26470t) == null || interfaceC20719y.mo9279f() == 1) {
                return;
            }
            c7806d.m9574j();
        }

        @Override // androidx.media3.p482ui.C7805c.l
        /* JADX INFO: renamed from: d */
        public final void mo9564d(int i10) {
            C7806d.this.m9576l();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C7806d.this.m9573i();
        }

        @Override // p884z2.InterfaceC20719y.c
        public final void onPlayWhenReadyChanged(boolean z10, int i10) {
            C7806d c7806d = C7806d.this;
            c7806d.m9575k();
            if (!c7806d.m9568d() || !c7806d.f26449E) {
                c7806d.m9569e(false);
                return;
            }
            C7805c c7805c = c7806d.f26463m;
            if (c7805c != null) {
                c7805c.m9537g();
            }
        }

        @Override // p884z2.InterfaceC20719y.c
        public final void onPlaybackStateChanged(int i10) {
            C7806d c7806d = C7806d.this;
            c7806d.m9575k();
            c7806d.m9577m();
            if (!c7806d.m9568d() || !c7806d.f26449E) {
                c7806d.m9569e(false);
                return;
            }
            C7805c c7805c = c7806d.f26463m;
            if (c7805c != null) {
                c7805c.m9537g();
            }
        }

        @Override // p884z2.InterfaceC20719y.c
        public final void onPositionDiscontinuity(InterfaceC20719y.d dVar, InterfaceC20719y.d dVar2, int i10) {
            C7805c c7805c;
            C7806d c7806d = C7806d.this;
            if (c7806d.m9568d() && c7806d.f26449E && (c7805c = c7806d.f26463m) != null) {
                c7805c.m9537g();
            }
        }

        @Override // p884z2.InterfaceC20719y.c
        public final void onRenderedFirstFrame() {
            C7806d c7806d = C7806d.this;
            View view = c7806d.f26454d;
            if (view != null) {
                view.setVisibility(4);
                if (!c7806d.m9566b()) {
                    c7806d.m9567c();
                    return;
                }
                ImageView imageView = c7806d.f26458h;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // p884z2.InterfaceC20719y.c
        public final void onSurfaceSizeChanged(int i10, int i11) {
            C7806d c7806d = C7806d.this;
            View view = c7806d.f26455e;
            if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && c7806d.f26451G) {
                final e eVar = c7806d.f26457g;
                eVar.getClass();
                Handler handler = c7806d.f26466p;
                final SurfaceView surfaceView = (SurfaceView) view;
                final RunnableC4812C runnableC4812C = new RunnableC4812C(c7806d, 0);
                handler.post(new Runnable() { // from class: S3.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7806d.e.m9583a(eVar, surfaceView, runnableC4812C);
                    }
                });
            }
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: s */
        public final void mo3872s(C0227c c0227c) {
            SubtitleView subtitleView = C7806d.this.f26460j;
            if (subtitleView != null) {
                subtitleView.setCues(c0227c.f762a);
            }
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
        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void mo3825D(InterfaceC20719y interfaceC20719y, InterfaceC20719y.b bVar) {
        }

        @Override // p884z2.InterfaceC20719y.c
        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void mo3833L(C20711q c20711q, int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        }

        @Override // p884z2.InterfaceC20719y.c
        public final /* synthetic */ void onTimelineChanged(AbstractC20686A abstractC20686A, int i10) {
        }
    }
}
