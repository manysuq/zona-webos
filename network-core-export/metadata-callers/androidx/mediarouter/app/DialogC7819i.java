package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC7414b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mobi.zona.R;
import p218M1.C3450a;
import p364U3.C5342n;
import p364U3.C5343o;
import p418X3.C6213b;
import p623j$.util.DesugarCollections;
import p623j$.util.Objects;
import p799u.C18379a;

/* JADX INFO: renamed from: androidx.mediarouter.app.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC7819i extends DialogInterfaceC7414b {

    /* JADX INFO: renamed from: q0 */
    public static final int f26587q0 = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: A */
    public final boolean f26588A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f26589B;

    /* JADX INFO: renamed from: C */
    public RelativeLayout f26590C;

    /* JADX INFO: renamed from: D */
    public LinearLayout f26591D;

    /* JADX INFO: renamed from: E */
    public View f26592E;

    /* JADX INFO: renamed from: F */
    public OverlayListView f26593F;

    /* JADX INFO: renamed from: G */
    public m f26594G;

    /* JADX INFO: renamed from: H */
    public ArrayList f26595H;

    /* JADX INFO: renamed from: I */
    public HashSet f26596I;

    /* JADX INFO: renamed from: J */
    public HashSet f26597J;

    /* JADX INFO: renamed from: K */
    public HashSet f26598K;

    /* JADX INFO: renamed from: L */
    public SeekBar f26599L;

    /* JADX INFO: renamed from: M */
    public l f26600M;

    /* JADX INFO: renamed from: N */
    public C5343o.g f26601N;

    /* JADX INFO: renamed from: O */
    public int f26602O;

    /* JADX INFO: renamed from: P */
    public int f26603P;

    /* JADX INFO: renamed from: Q */
    public int f26604Q;

    /* JADX INFO: renamed from: R */
    public final int f26605R;

    /* JADX INFO: renamed from: S */
    public HashMap f26606S;

    /* JADX INFO: renamed from: T */
    public MediaControllerCompat f26607T;

    /* JADX INFO: renamed from: U */
    public final j f26608U;

    /* JADX INFO: renamed from: V */
    public PlaybackStateCompat f26609V;

    /* JADX INFO: renamed from: W */
    public MediaDescriptionCompat f26610W;

    /* JADX INFO: renamed from: X */
    public i f26611X;

    /* JADX INFO: renamed from: Y */
    public Bitmap f26612Y;

    /* JADX INFO: renamed from: Z */
    public Uri f26613Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f26614a0;

    /* JADX INFO: renamed from: b0 */
    public Bitmap f26615b0;

    /* JADX INFO: renamed from: c0 */
    public int f26616c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f26617d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f26618e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f26619f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f26620g0;

    /* JADX INFO: renamed from: h */
    public final C5343o f26621h;

    /* JADX INFO: renamed from: h0 */
    public boolean f26622h0;

    /* JADX INFO: renamed from: i */
    public final k f26623i;

    /* JADX INFO: renamed from: i0 */
    public int f26624i0;

    /* JADX INFO: renamed from: j */
    public final C5343o.g f26625j;

    /* JADX INFO: renamed from: j0 */
    public int f26626j0;

    /* JADX INFO: renamed from: k */
    public final Context f26627k;

    /* JADX INFO: renamed from: k0 */
    public int f26628k0;

    /* JADX INFO: renamed from: l */
    public boolean f26629l;

    /* JADX INFO: renamed from: l0 */
    public Interpolator f26630l0;

    /* JADX INFO: renamed from: m */
    public boolean f26631m;

    /* JADX INFO: renamed from: m0 */
    public final Interpolator f26632m0;

    /* JADX INFO: renamed from: n */
    public int f26633n;

    /* JADX INFO: renamed from: n0 */
    public final Interpolator f26634n0;

    /* JADX INFO: renamed from: o */
    public Button f26635o;

    /* JADX INFO: renamed from: o0 */
    public final AccessibilityManager f26636o0;

    /* JADX INFO: renamed from: p */
    public Button f26637p;

    /* JADX INFO: renamed from: p0 */
    public final a f26638p0;

    /* JADX INFO: renamed from: q */
    public ImageButton f26639q;

    /* JADX INFO: renamed from: r */
    public MediaRouteExpandCollapseButton f26640r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f26641s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f26642t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f26643u;

    /* JADX INFO: renamed from: v */
    public ImageView f26644v;

    /* JADX INFO: renamed from: w */
    public TextView f26645w;

    /* JADX INFO: renamed from: x */
    public TextView f26646x;

    /* JADX INFO: renamed from: y */
    public TextView f26647y;

    /* JADX INFO: renamed from: z */
    public final boolean f26648z;

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DialogC7819i dialogC7819i = DialogC7819i.this;
            dialogC7819i.m9608i(true);
            dialogC7819i.f26593F.requestLayout();
            dialogC7819i.f26593F.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC7817g(dialogC7819i));
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogC7819i.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PendingIntent sessionActivity;
            DialogC7819i dialogC7819i = DialogC7819i.this;
            MediaControllerCompat mediaControllerCompat = dialogC7819i.f26607T;
            if (mediaControllerCompat == null || (sessionActivity = mediaControllerCompat.f23648a.f23650a.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                dialogC7819i.dismiss();
            } catch (PendingIntent.CanceledException unused) {
                sessionActivity.toString();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogC7819i dialogC7819i = DialogC7819i.this;
            boolean z10 = dialogC7819i.f26619f0;
            dialogC7819i.f26619f0 = !z10;
            if (!z10) {
                dialogC7819i.f26593F.setVisibility(0);
            }
            dialogC7819i.f26630l0 = dialogC7819i.f26619f0 ? dialogC7819i.f26632m0 : dialogC7819i.f26634n0;
            dialogC7819i.m9617s(true);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f26653b;

        public f(boolean z10) {
            this.f26653b = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int iM9610k;
            HashMap map;
            HashMap map2;
            Bitmap bitmap;
            DialogC7819i dialogC7819i = DialogC7819i.this;
            dialogC7819i.f26643u.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (dialogC7819i.f26620g0) {
                dialogC7819i.f26622h0 = true;
                return;
            }
            C5343o.g gVar = dialogC7819i.f26625j;
            int i10 = dialogC7819i.f26589B.getLayoutParams().height;
            DialogC7819i.m9605n(-1, dialogC7819i.f26589B);
            dialogC7819i.m9618t(dialogC7819i.m9607h());
            View decorView = dialogC7819i.getWindow().getDecorView();
            decorView.measure(View.MeasureSpec.makeMeasureSpec(dialogC7819i.getWindow().getAttributes().width, 1073741824), 0);
            DialogC7819i.m9605n(i10, dialogC7819i.f26589B);
            if (!(dialogC7819i.f26644v.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dialogC7819i.f26644v.getDrawable()).getBitmap()) == null) {
                iM9610k = 0;
            } else {
                iM9610k = dialogC7819i.m9610k(bitmap.getWidth(), bitmap.getHeight());
                dialogC7819i.f26644v.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
            }
            int iM9611l = dialogC7819i.m9611l(dialogC7819i.m9607h());
            int size = dialogC7819i.f26595H.size();
            int size2 = dialogC7819i.m9612m() ? DesugarCollections.unmodifiableList(gVar.f17574v).size() * dialogC7819i.f26603P : 0;
            if (size > 0) {
                size2 += dialogC7819i.f26605R;
            }
            int iMin = Math.min(size2, dialogC7819i.f26604Q);
            if (!dialogC7819i.f26619f0) {
                iMin = 0;
            }
            int iMax = Math.max(iM9610k, iMin) + iM9611l;
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int iHeight = rect.height() - (dialogC7819i.f26642t.getMeasuredHeight() - dialogC7819i.f26643u.getMeasuredHeight());
            if (iM9610k <= 0 || iMax > iHeight) {
                if (dialogC7819i.f26589B.getMeasuredHeight() + dialogC7819i.f26593F.getLayoutParams().height >= dialogC7819i.f26643u.getMeasuredHeight()) {
                    dialogC7819i.f26644v.setVisibility(8);
                }
                iMax = iMin + iM9611l;
                iM9610k = 0;
            } else {
                dialogC7819i.f26644v.setVisibility(0);
                DialogC7819i.m9605n(iM9610k, dialogC7819i.f26644v);
            }
            if (!dialogC7819i.m9607h() || iMax > iHeight) {
                dialogC7819i.f26590C.setVisibility(8);
            } else {
                dialogC7819i.f26590C.setVisibility(0);
            }
            dialogC7819i.m9618t(dialogC7819i.f26590C.getVisibility() == 0);
            int iM9611l2 = dialogC7819i.m9611l(dialogC7819i.f26590C.getVisibility() == 0);
            int iMax2 = Math.max(iM9610k, iMin) + iM9611l2;
            if (iMax2 > iHeight) {
                iMin -= iMax2 - iHeight;
            } else {
                iHeight = iMax2;
            }
            dialogC7819i.f26589B.clearAnimation();
            dialogC7819i.f26593F.clearAnimation();
            dialogC7819i.f26643u.clearAnimation();
            boolean z10 = this.f26653b;
            if (z10) {
                dialogC7819i.m9606g(iM9611l2, dialogC7819i.f26589B);
                dialogC7819i.m9606g(iMin, dialogC7819i.f26593F);
                dialogC7819i.m9606g(iHeight, dialogC7819i.f26643u);
            } else {
                DialogC7819i.m9605n(iM9611l2, dialogC7819i.f26589B);
                DialogC7819i.m9605n(iMin, dialogC7819i.f26593F);
                DialogC7819i.m9605n(iHeight, dialogC7819i.f26643u);
            }
            DialogC7819i.m9605n(rect.height(), dialogC7819i.f26641s);
            List listUnmodifiableList = DesugarCollections.unmodifiableList(gVar.f17574v);
            if (listUnmodifiableList.isEmpty()) {
                dialogC7819i.f26595H.clear();
                dialogC7819i.f26594G.notifyDataSetChanged();
                return;
            }
            if (new HashSet(dialogC7819i.f26595H).equals(new HashSet(listUnmodifiableList))) {
                dialogC7819i.f26594G.notifyDataSetChanged();
                return;
            }
            if (z10) {
                OverlayListView overlayListView = dialogC7819i.f26593F;
                m mVar = dialogC7819i.f26594G;
                map = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i11 = 0; i11 < overlayListView.getChildCount(); i11++) {
                    C5343o.g item = mVar.getItem(firstVisiblePosition + i11);
                    View childAt = overlayListView.getChildAt(i11);
                    map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                map = null;
            }
            if (z10) {
                Context context = dialogC7819i.f26627k;
                OverlayListView overlayListView2 = dialogC7819i.f26593F;
                m mVar2 = dialogC7819i.f26594G;
                map2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i12 = 0; i12 < overlayListView2.getChildCount(); i12++) {
                    C5343o.g item2 = mVar2.getItem(firstVisiblePosition2 + i12);
                    View childAt2 = overlayListView2.getChildAt(i12);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(bitmapCreateBitmap));
                    map2.put(item2, new BitmapDrawable(context.getResources(), bitmapCreateBitmap));
                }
            } else {
                map2 = null;
            }
            ArrayList arrayList = dialogC7819i.f26595H;
            HashSet hashSet = new HashSet(listUnmodifiableList);
            hashSet.removeAll(arrayList);
            dialogC7819i.f26596I = hashSet;
            HashSet hashSet2 = new HashSet(dialogC7819i.f26595H);
            hashSet2.removeAll(listUnmodifiableList);
            dialogC7819i.f26597J = hashSet2;
            dialogC7819i.f26595H.addAll(0, dialogC7819i.f26596I);
            dialogC7819i.f26595H.removeAll(dialogC7819i.f26597J);
            dialogC7819i.f26594G.notifyDataSetChanged();
            if (z10 && dialogC7819i.f26619f0) {
                if (dialogC7819i.f26597J.size() + dialogC7819i.f26596I.size() > 0) {
                    dialogC7819i.f26593F.setEnabled(false);
                    dialogC7819i.f26593F.requestLayout();
                    dialogC7819i.f26620g0 = true;
                    dialogC7819i.f26593F.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC7820j(dialogC7819i, map, map2));
                    return;
                }
            }
            dialogC7819i.f26596I = null;
            dialogC7819i.f26597J = null;
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class g extends Animation {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f26655b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f26656c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f26657d;

        public g(View view, int i10, int i11) {
            this.f26655b = i10;
            this.f26656c = i11;
            this.f26657d = view;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            int i10 = this.f26656c;
            int i11 = this.f26655b;
            DialogC7819i.m9605n(i11 - ((int) ((i11 - i10) * f10)), this.f26657d);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$h */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i10;
            PlaybackStateCompat playbackStateCompat;
            DialogC7819i dialogC7819i = DialogC7819i.this;
            Context context = dialogC7819i.f26627k;
            AccessibilityManager accessibilityManager = dialogC7819i.f26636o0;
            int id2 = view.getId();
            if (id2 == 16908313 || id2 == 16908314) {
                if (dialogC7819i.f26625j.m6077g()) {
                    C5343o c5343o = dialogC7819i.f26621h;
                    i10 = id2 == 16908313 ? 2 : 1;
                    c5343o.getClass();
                    C5343o.m6054j(i10);
                }
                dialogC7819i.dismiss();
                return;
            }
            if (id2 != R.id.mr_control_playback_ctrl) {
                if (id2 == R.id.mr_close) {
                    dialogC7819i.dismiss();
                    return;
                }
                return;
            }
            MediaControllerCompat mediaControllerCompat = dialogC7819i.f26607T;
            if (mediaControllerCompat == null || (playbackStateCompat = dialogC7819i.f26609V) == null) {
                return;
            }
            int i11 = 0;
            i10 = playbackStateCompat.f23697b != 3 ? 0 : 1;
            if (i10 != 0 && (playbackStateCompat.f23701f & 514) != 0) {
                mediaControllerCompat.m8213a().f23663a.pause();
                i11 = R.string.mr_controller_pause;
            } else if (i10 != 0 && (playbackStateCompat.f23701f & 1) != 0) {
                mediaControllerCompat.m8213a().f23663a.stop();
                i11 = R.string.mr_controller_stop;
            } else if (i10 == 0 && (playbackStateCompat.f23701f & 516) != 0) {
                mediaControllerCompat.m8213a().f23663a.play();
                i11 = R.string.mr_controller_play;
            }
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || i11 == 0) {
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.setPackageName(context.getPackageName());
            accessibilityEventObtain.setClassName(h.class.getName());
            accessibilityEventObtain.getText().add(context.getString(i11));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$i */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class i extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final Bitmap f26659a;

        /* JADX INFO: renamed from: b */
        public final Uri f26660b;

        /* JADX INFO: renamed from: c */
        public int f26661c;

        /* JADX INFO: renamed from: d */
        public long f26662d;

        public i() {
            MediaDescriptionCompat mediaDescriptionCompat = DialogC7819i.this.f26610W;
            Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f23633f;
            if (bitmap != null && bitmap.isRecycled()) {
                bitmap = null;
            }
            this.f26659a = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = DialogC7819i.this.f26610W;
            this.f26660b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f23634g : null;
        }

        /* JADX INFO: renamed from: a */
        public final BufferedInputStream m9619a(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStreamOpenInputStream = DialogC7819i.this.f26627k.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                int i10 = DialogC7819i.f26587q0;
                uRLConnectionOpenConnection.setConnectTimeout(i10);
                uRLConnectionOpenConnection.setReadTimeout(i10);
                inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x001f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:32), block:B:14:0x001f */
        @Override // android.os.AsyncTask
        public final Bitmap doInBackground(Void[] voidArr) throws Throwable {
            InputStream inputStream;
            BufferedInputStream bufferedInputStreamM9619a;
            InputStream inputStream2 = null;
            Bitmap bitmapDecodeStream = this.f26659a;
            if (bitmapDecodeStream == null) {
                Uri uri = this.f26660b;
                try {
                    if (uri != null) {
                        try {
                            bufferedInputStreamM9619a = m9619a(uri);
                            try {
                                try {
                                    if (bufferedInputStreamM9619a == null) {
                                        Objects.toString(uri);
                                        if (bufferedInputStreamM9619a != null) {
                                        }
                                        return null;
                                    }
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(bufferedInputStreamM9619a, null, options);
                                    if (options.outWidth != 0 && options.outHeight != 0) {
                                        try {
                                            bufferedInputStreamM9619a.reset();
                                        } catch (IOException unused) {
                                            bufferedInputStreamM9619a.close();
                                            bufferedInputStreamM9619a = m9619a(uri);
                                            if (bufferedInputStreamM9619a == null) {
                                                Objects.toString(uri);
                                                if (bufferedInputStreamM9619a == null) {
                                                    return null;
                                                }
                                            }
                                            bufferedInputStreamM9619a.close();
                                            return null;
                                        }
                                        options.inJustDecodeBounds = false;
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / DialogC7819i.this.m9610k(options.outWidth, options.outHeight)));
                                        if (isCancelled()) {
                                            bufferedInputStreamM9619a.close();
                                            return null;
                                        }
                                        bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamM9619a, null, options);
                                        try {
                                            bufferedInputStreamM9619a.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    bufferedInputStreamM9619a.close();
                                    return null;
                                } catch (IOException unused3) {
                                    return null;
                                }
                            } catch (IOException unused4) {
                                Objects.toString(uri);
                                if (bufferedInputStreamM9619a != null) {
                                    try {
                                        bufferedInputStreamM9619a.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                bitmapDecodeStream = null;
                            }
                        } catch (IOException unused6) {
                            bufferedInputStreamM9619a = null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException unused7) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        bitmapDecodeStream = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                }
            }
            if (bitmapDecodeStream != null && bitmapDecodeStream.isRecycled()) {
                Objects.toString(bitmapDecodeStream);
                return null;
            }
            if (bitmapDecodeStream != null && bitmapDecodeStream.getWidth() < bitmapDecodeStream.getHeight()) {
                C6213b.b bVar = new C6213b.b(bitmapDecodeStream);
                bVar.f20395c = 1;
                List<C6213b.d> list = bVar.m7023a().f20388a;
                this.f26661c = DesugarCollections.unmodifiableList(list).isEmpty() ? 0 : ((C6213b.d) DesugarCollections.unmodifiableList(list).get(0)).f20402d;
            }
            return bitmapDecodeStream;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            DialogC7819i dialogC7819i = DialogC7819i.this;
            dialogC7819i.f26611X = null;
            Bitmap bitmap3 = dialogC7819i.f26612Y;
            Bitmap bitmap4 = this.f26659a;
            boolean zEquals = Objects.equals(bitmap3, bitmap4);
            Uri uri = this.f26660b;
            if (zEquals && Objects.equals(dialogC7819i.f26613Z, uri)) {
                return;
            }
            dialogC7819i.f26612Y = bitmap4;
            dialogC7819i.f26615b0 = bitmap2;
            dialogC7819i.f26613Z = uri;
            dialogC7819i.f26616c0 = this.f26661c;
            dialogC7819i.f26614a0 = true;
            dialogC7819i.m9614p(SystemClock.uptimeMillis() - this.f26662d > 120);
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            this.f26662d = SystemClock.uptimeMillis();
            DialogC7819i dialogC7819i = DialogC7819i.this;
            dialogC7819i.f26614a0 = false;
            dialogC7819i.f26615b0 = null;
            dialogC7819i.f26616c0 = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$j */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class j extends MediaControllerCompat.AbstractC7379a {
        public j() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC7379a
        /* JADX INFO: renamed from: a */
        public final void mo8224a(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat mediaDescriptionCompatM8200c = mediaMetadataCompat == null ? null : mediaMetadataCompat.m8200c();
            DialogC7819i dialogC7819i = DialogC7819i.this;
            dialogC7819i.f26610W = mediaDescriptionCompatM8200c;
            dialogC7819i.m9615q();
            dialogC7819i.m9614p(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC7379a
        /* JADX INFO: renamed from: b */
        public final void mo8225b(PlaybackStateCompat playbackStateCompat) {
            DialogC7819i dialogC7819i = DialogC7819i.this;
            dialogC7819i.f26609V = playbackStateCompat;
            dialogC7819i.m9614p(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC7379a
        /* JADX INFO: renamed from: c */
        public final void mo8226c() {
            DialogC7819i dialogC7819i = DialogC7819i.this;
            MediaControllerCompat mediaControllerCompat = dialogC7819i.f26607T;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.m8215c(dialogC7819i.f26608U);
                dialogC7819i.f26607T = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$k */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class k extends C5343o.a {
        public k() {
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: e */
        public final void mo5613e(C5343o.g gVar) {
            DialogC7819i.this.m9614p(true);
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: i */
        public final void mo6061i() {
            DialogC7819i.this.m9614p(false);
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: k */
        public final void mo6062k(C5343o.g gVar) {
            DialogC7819i dialogC7819i = DialogC7819i.this;
            SeekBar seekBar = (SeekBar) dialogC7819i.f26606S.get(gVar);
            int i10 = gVar.f17568p;
            int i11 = DialogC7819i.f26587q0;
            if (seekBar == null || dialogC7819i.f26601N == gVar) {
                return;
            }
            seekBar.setProgress(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$l */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class l implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final a f26666a = new a();

        /* JADX INFO: renamed from: androidx.mediarouter.app.i$l$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                DialogC7819i dialogC7819i = DialogC7819i.this;
                if (dialogC7819i.f26601N != null) {
                    dialogC7819i.f26601N = null;
                    if (dialogC7819i.f26617d0) {
                        dialogC7819i.m9614p(dialogC7819i.f26618e0);
                    }
                }
            }
        }

        public l() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                C5343o.g gVar = (C5343o.g) seekBar.getTag();
                int i11 = DialogC7819i.f26587q0;
                gVar.m6080j(i10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            DialogC7819i dialogC7819i = DialogC7819i.this;
            if (dialogC7819i.f26601N != null) {
                dialogC7819i.f26599L.removeCallbacks(this.f26666a);
            }
            dialogC7819i.f26601N = (C5343o.g) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            DialogC7819i.this.f26599L.postDelayed(this.f26666a, 500L);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$m */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class m extends ArrayAdapter<C5343o.g> {

        /* JADX INFO: renamed from: b */
        public final float f26669b;

        public m(Context context, ArrayList arrayList) {
            super(context, 0, arrayList);
            this.f26669b = C7832v.m9645c(context);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            boolean z10;
            DialogC7819i dialogC7819i = DialogC7819i.this;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                DialogC7819i.m9605n(dialogC7819i.f26603P, (LinearLayout) view.findViewById(R.id.volume_item_container));
                View viewFindViewById = view.findViewById(R.id.mr_volume_item_icon);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                int i11 = dialogC7819i.f26602O;
                layoutParams.width = i11;
                layoutParams.height = i11;
                viewFindViewById.setLayoutParams(layoutParams);
            }
            C5343o.g item = getItem(i10);
            if (item != null) {
                boolean z11 = item.f17559g;
                TextView textView = (TextView) view.findViewById(R.id.mr_name);
                textView.setEnabled(z11);
                textView.setText(item.f17556d);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
                Context context = viewGroup.getContext();
                OverlayListView overlayListView = dialogC7819i.f26593F;
                int iM9644b = C7832v.m9644b(context);
                if (Color.alpha(iM9644b) != 255) {
                    iM9644b = C3450a.m4132f(iM9644b, ((Integer) overlayListView.getTag()).intValue());
                }
                mediaRouteVolumeSlider.m9588a(iM9644b, iM9644b);
                mediaRouteVolumeSlider.setTag(item);
                dialogC7819i.f26606S.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.m9589b(!z11);
                mediaRouteVolumeSlider.setEnabled(z11);
                if (z11) {
                    if (dialogC7819i.f26648z) {
                        if (((!item.m6075e() || C5343o.m6053h()) ? item.f17567o : 0) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        mediaRouteVolumeSlider.setMax(item.f17569q);
                        mediaRouteVolumeSlider.setProgress(item.f17568p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(dialogC7819i.f26600M);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z11 ? 255 : (int) (this.f26669b * 255.0f));
                ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(dialogC7819i.f26598K.contains(item) ? 4 : 0);
                HashSet hashSet = dialogC7819i.f26596I;
                if (hashSet != null && hashSet.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC7819i(Context context) {
        ContextThemeWrapper contextThemeWrapperM9643a = C7832v.m9643a(context, true);
        int iM9649g = C7832v.m9649g(contextThemeWrapperM9643a, R.attr.mediaRouteTheme);
        super(contextThemeWrapperM9643a, iM9649g == 0 ? C7832v.m9647e(contextThemeWrapperM9643a) : iM9649g);
        this.f26648z = true;
        this.f26638p0 = new a();
        Context context2 = getContext();
        this.f26627k = context2;
        this.f26608U = new j();
        this.f26621h = C5343o.m6049d(context2);
        this.f26588A = C5343o.m6053h();
        this.f26623i = new k();
        this.f26625j = C5343o.m6052g();
        m9613o(C5343o.m6050e());
        this.f26605R = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.f26636o0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.f26632m0 = AnimationUtils.loadInterpolator(contextThemeWrapperM9643a, R.interpolator.mr_linear_out_slow_in);
        this.f26634n0 = AnimationUtils.loadInterpolator(contextThemeWrapperM9643a, R.interpolator.mr_fast_out_slow_in);
    }

    /* JADX INFO: renamed from: n */
    public static void m9605n(int i10, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: g */
    public final void m9606g(int i10, View view) {
        g gVar = new g(view, view.getLayoutParams().height, i10);
        gVar.setDuration(this.f26624i0);
        gVar.setInterpolator(this.f26630l0);
        view.startAnimation(gVar);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m9607h() {
        return (this.f26610W == null && this.f26609V == null) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final void m9608i(boolean z10) {
        HashSet hashSet;
        int firstVisiblePosition = this.f26593F.getFirstVisiblePosition();
        for (int i10 = 0; i10 < this.f26593F.getChildCount(); i10++) {
            View childAt = this.f26593F.getChildAt(i10);
            C5343o.g item = this.f26594G.getItem(firstVisiblePosition + i10);
            if (!z10 || (hashSet = this.f26596I) == null || !hashSet.contains(item)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        for (OverlayListView.C7810a c7810a : this.f26593F.f26510b) {
            c7810a.f26520j = true;
            c7810a.f26521k = true;
            C7816f c7816f = c7810a.f26522l;
            if (c7816f != null) {
                DialogC7819i dialogC7819i = c7816f.f26584b;
                dialogC7819i.f26598K.remove(c7816f.f26583a);
                dialogC7819i.f26594G.notifyDataSetChanged();
            }
        }
        if (z10) {
            return;
        }
        m9609j(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m9609j(boolean z10) {
        this.f26596I = null;
        this.f26597J = null;
        this.f26620g0 = false;
        if (this.f26622h0) {
            this.f26622h0 = false;
            m9617s(z10);
        }
        this.f26593F.setEnabled(true);
    }

    /* JADX INFO: renamed from: k */
    public final int m9610k(int i10, int i11) {
        return i10 >= i11 ? (int) (((this.f26633n * i11) / i10) + 0.5f) : (int) (((this.f26633n * 9.0f) / 16.0f) + 0.5f);
    }

    /* JADX INFO: renamed from: l */
    public final int m9611l(boolean z10) {
        if (!z10 && this.f26591D.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.f26589B.getPaddingBottom() + this.f26589B.getPaddingTop();
        if (z10) {
            paddingBottom += this.f26590C.getMeasuredHeight();
        }
        if (this.f26591D.getVisibility() == 0) {
            paddingBottom += this.f26591D.getMeasuredHeight();
        }
        return (z10 && this.f26591D.getVisibility() == 0) ? this.f26592E.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m9612m() {
        C5343o.g gVar = this.f26625j;
        return gVar.m6075e() && DesugarCollections.unmodifiableList(gVar.f17574v).size() > 1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX INFO: renamed from: o */
    public final void m9613o(MediaSessionCompat.Token token) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        PlaybackStateCompat playbackStateCompatMo8274f;
        MediaControllerCompat mediaControllerCompat = this.f26607T;
        j jVar = this.f26608U;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.m8215c(jVar);
            this.f26607T = null;
        }
        if (token != null && this.f26631m) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f26627k, token);
            this.f26607T = mediaControllerCompat2;
            mediaControllerCompat2.m8214b(jVar);
            MediaMetadata metadata = this.f26607T.f23648a.f23650a.getMetadata();
            if (metadata != null) {
                C18379a<String, Integer> c18379a = MediaMetadataCompat.f23638e;
                Parcel parcelObtain = Parcel.obtain();
                metadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                mediaMetadataCompatCreateFromParcel.f23643c = metadata;
            } else {
                mediaMetadataCompatCreateFromParcel = null;
            }
            this.f26610W = mediaMetadataCompatCreateFromParcel == null ? null : mediaMetadataCompatCreateFromParcel.m8200c();
            MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = this.f26607T.f23648a;
            MediaSessionCompat.Token token2 = mediaControllerImplApi21.f23654e;
            if (token2.m8237c() != null) {
                try {
                    playbackStateCompatMo8274f = token2.m8237c().mo8274f();
                } catch (RemoteException unused) {
                    PlaybackState playbackState = mediaControllerImplApi21.f23650a.getPlaybackState();
                    playbackStateCompatMo8274f = playbackState != null ? PlaybackStateCompat.m8293a(playbackState) : null;
                }
            } else {
                PlaybackState playbackState2 = mediaControllerImplApi21.f23650a.getPlaybackState();
                playbackStateCompatMo8274f = playbackState2 != null ? PlaybackStateCompat.m8293a(playbackState2) : null;
            }
            this.f26609V = playbackStateCompatMo8274f;
            m9615q();
            m9614p(false);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26631m = true;
        this.f26621h.m6055a(C5342n.f17523c, this.f26623i, 2);
        m9613o(C5343o.m6050e());
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7414b, p622j.DialogC15291s, p513d.DialogC10194w, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        h hVar = new h();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.f26641s = frameLayout;
        frameLayout.setOnClickListener(new b());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.f26642t = linearLayout;
        linearLayout.setOnClickListener(new c());
        Context context = this.f26627k;
        int iM9648f = C7832v.m9648f(context, R.attr.colorPrimary);
        if (C3450a.m4129c(iM9648f, C7832v.m9648f(context, android.R.attr.colorBackground)) < 3.0d) {
            iM9648f = C7832v.m9648f(context, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.f26635o = button;
        button.setText(R.string.mr_controller_disconnect);
        this.f26635o.setTextColor(iM9648f);
        this.f26635o.setOnClickListener(hVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.f26637p = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.f26637p.setTextColor(iM9648f);
        this.f26637p.setOnClickListener(hVar);
        this.f26647y = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(hVar);
        this.f26643u = (FrameLayout) findViewById(R.id.mr_default_control);
        d dVar = new d();
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.f26644v = imageView;
        imageView.setOnClickListener(dVar);
        findViewById(R.id.mr_control_title_container).setOnClickListener(dVar);
        this.f26589B = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.f26592E = findViewById(R.id.mr_control_divider);
        this.f26590C = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.f26645w = (TextView) findViewById(R.id.mr_control_title);
        this.f26646x = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.f26639q = imageButton;
        imageButton.setOnClickListener(hVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.f26591D = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.f26599L = seekBar;
        C5343o.g gVar = this.f26625j;
        seekBar.setTag(gVar);
        l lVar = new l();
        this.f26600M = lVar;
        this.f26599L.setOnSeekBarChangeListener(lVar);
        this.f26593F = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.f26595H = new ArrayList();
        m mVar = new m(this.f26593F.getContext(), this.f26595H);
        this.f26594G = mVar;
        this.f26593F.setAdapter((ListAdapter) mVar);
        this.f26598K = new HashSet();
        LinearLayout linearLayout3 = this.f26589B;
        OverlayListView overlayListView = this.f26593F;
        boolean zM9612m = m9612m();
        int iM9648f2 = C7832v.m9648f(context, R.attr.colorPrimary);
        int iM9648f3 = C7832v.m9648f(context, R.attr.colorPrimaryDark);
        if (zM9612m && C7832v.m9644b(context) == -570425344) {
            iM9648f3 = iM9648f2;
            iM9648f2 = -1;
        }
        linearLayout3.setBackgroundColor(iM9648f2);
        overlayListView.setBackgroundColor(iM9648f3);
        linearLayout3.setTag(Integer.valueOf(iM9648f2));
        overlayListView.setTag(Integer.valueOf(iM9648f3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.f26599L;
        LinearLayout linearLayout4 = this.f26589B;
        int iM9644b = C7832v.m9644b(context);
        if (Color.alpha(iM9644b) != 255) {
            iM9644b = C3450a.m4132f(iM9644b, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.m9588a(iM9644b, iM9644b);
        HashMap map = new HashMap();
        this.f26606S = map;
        map.put(gVar, this.f26599L);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.f26640r = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.f26504j = new e();
        this.f26630l0 = this.f26619f0 ? this.f26632m0 : this.f26634n0;
        this.f26624i0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.f26626j0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.f26628k0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.f26629l = true;
        m9616r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f26621h.m6056i(this.f26623i);
        m9613o(null);
        this.f26631m = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7414b, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 25 && i10 != 24) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f26588A || !this.f26619f0) {
            this.f26625j.m6081k(i10 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC7414b, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 25 || i10 == 24) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0160  */
    /* JADX WARN: Code duplicated, block: B:107:0x016b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0176  */
    /* JADX WARN: Code duplicated, block: B:110:0x0178  */
    /* JADX WARN: Code duplicated, block: B:112:0x017b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0182  */
    /* JADX WARN: Code duplicated, block: B:114:0x0184  */
    /* JADX WARN: Code duplicated, block: B:116:0x018f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0191  */
    /* JADX WARN: Code duplicated, block: B:119:0x0194  */
    /* JADX WARN: Code duplicated, block: B:120:0x019b  */
    /* JADX WARN: Code duplicated, block: B:121:0x019d  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0141  */
    /* JADX WARN: Code duplicated, block: B:94:0x014a  */
    /* JADX WARN: Code duplicated, block: B:95:0x014c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0155  */
    /* JADX INFO: renamed from: p */
    public final void m9614p(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        PlaybackStateCompat playbackStateCompat;
        int i12;
        boolean z14;
        Context context;
        int i13;
        int i14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = true;
        if (this.f26601N != null) {
            this.f26617d0 = true;
            this.f26618e0 = z10 | this.f26618e0;
            return;
        }
        this.f26617d0 = false;
        this.f26618e0 = false;
        C5343o.g gVar = this.f26625j;
        if (!gVar.m6077g() || gVar.m6074d()) {
            dismiss();
            return;
        }
        if (this.f26629l) {
            this.f26647y.setText(gVar.f17556d);
            this.f26635o.setVisibility(gVar.f17562j ? 0 : 8);
            if (this.f26614a0) {
                Bitmap bitmap = this.f26615b0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.f26644v.setImageBitmap(this.f26615b0);
                    this.f26644v.setBackgroundColor(this.f26616c0);
                } else {
                    Objects.toString(this.f26615b0);
                }
                this.f26614a0 = false;
                this.f26615b0 = null;
                this.f26616c0 = 0;
            }
            boolean z19 = this.f26588A;
            if (!z19 && m9612m()) {
                this.f26591D.setVisibility(8);
                this.f26619f0 = true;
                this.f26593F.setVisibility(0);
                this.f26630l0 = this.f26619f0 ? this.f26632m0 : this.f26634n0;
                m9617s(false);
            } else if (!this.f26619f0 || z19) {
                if (this.f26648z) {
                    if (((!gVar.m6075e() || C5343o.m6053h()) ? gVar.f17567o : 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!z11) {
                    this.f26591D.setVisibility(8);
                } else if (this.f26591D.getVisibility() == 8) {
                    this.f26591D.setVisibility(0);
                    this.f26599L.setMax(gVar.f17569q);
                    this.f26599L.setProgress(gVar.f17568p);
                    this.f26640r.setVisibility(m9612m() ? 0 : 8);
                }
            } else {
                this.f26591D.setVisibility(8);
            }
            if (m9607h()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.f26610W;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f23630c;
                boolean zIsEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.f26610W;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f23631d : null;
                boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
                if (gVar.f17570r != -1) {
                    this.f26645w.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.f26609V;
                    if (playbackStateCompat2 == null || playbackStateCompat2.f23697b == 0) {
                        this.f26645w.setText(R.string.mr_controller_no_media_selected);
                    } else {
                        if (zIsEmpty && zIsEmpty2) {
                            this.f26645w.setText(R.string.mr_controller_no_info_available);
                        } else {
                            if (zIsEmpty) {
                                z12 = false;
                            } else {
                                this.f26645w.setText(charSequence);
                                z12 = true;
                            }
                            if (zIsEmpty2) {
                                z13 = false;
                            } else {
                                this.f26646x.setText(charSequence2);
                                z13 = true;
                            }
                        }
                        TextView textView = this.f26645w;
                        if (z12) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        textView.setVisibility(i10);
                        TextView textView2 = this.f26646x;
                        if (z13) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        textView2.setVisibility(i11);
                        playbackStateCompat = this.f26609V;
                        if (playbackStateCompat != null) {
                            i12 = playbackStateCompat.f23697b;
                            if (i12 != 6 || i12 == 3) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            context = this.f26639q.getContext();
                            if (!z14) {
                                if ((this.f26609V.f23701f & 514) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    i13 = R.attr.mediaRoutePauseDrawable;
                                    i14 = R.string.mr_controller_pause;
                                } else if (!z14) {
                                    if ((this.f26609V.f23701f & 1) != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        i13 = R.attr.mediaRouteStopDrawable;
                                        i14 = R.string.mr_controller_stop;
                                    } else if (z14) {
                                        z18 = false;
                                        i13 = 0;
                                        i14 = 0;
                                    } else {
                                        if ((this.f26609V.f23701f & 516) != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            i13 = R.attr.mediaRoutePlayDrawable;
                                            i14 = R.string.mr_controller_play;
                                        } else {
                                            z18 = false;
                                            i13 = 0;
                                            i14 = 0;
                                        }
                                    }
                                } else if (z14) {
                                    z18 = false;
                                    i13 = 0;
                                    i14 = 0;
                                } else {
                                    if ((this.f26609V.f23701f & 516) != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        i13 = R.attr.mediaRoutePlayDrawable;
                                        i14 = R.string.mr_controller_play;
                                    } else {
                                        z18 = false;
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                }
                            } else if (!z14) {
                                if ((this.f26609V.f23701f & 1) != 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    i13 = R.attr.mediaRouteStopDrawable;
                                    i14 = R.string.mr_controller_stop;
                                } else if (z14) {
                                    z18 = false;
                                    i13 = 0;
                                    i14 = 0;
                                } else {
                                    if ((this.f26609V.f23701f & 516) != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        i13 = R.attr.mediaRoutePlayDrawable;
                                        i14 = R.string.mr_controller_play;
                                    } else {
                                        z18 = false;
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                }
                            } else if (z14) {
                                z18 = false;
                                i13 = 0;
                                i14 = 0;
                            } else {
                                if ((this.f26609V.f23701f & 516) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    i13 = R.attr.mediaRoutePlayDrawable;
                                    i14 = R.string.mr_controller_play;
                                } else {
                                    z18 = false;
                                    i13 = 0;
                                    i14 = 0;
                                }
                            }
                            this.f26639q.setVisibility(z18 ? 0 : 8);
                            if (z18) {
                                this.f26639q.setImageResource(C7832v.m9649g(context, i13));
                                this.f26639q.setContentDescription(context.getResources().getText(i14));
                            }
                        }
                    }
                }
                z12 = true;
                z13 = false;
                TextView textView3 = this.f26645w;
                if (z12) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView3.setVisibility(i10);
                TextView textView4 = this.f26646x;
                if (z13) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView4.setVisibility(i11);
                playbackStateCompat = this.f26609V;
                if (playbackStateCompat != null) {
                    i12 = playbackStateCompat.f23697b;
                    if (i12 != 6) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    context = this.f26639q.getContext();
                    if (!z14) {
                        if ((this.f26609V.f23701f & 514) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i13 = R.attr.mediaRoutePauseDrawable;
                            i14 = R.string.mr_controller_pause;
                        } else if (!z14) {
                            if ((this.f26609V.f23701f & 1) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                i13 = R.attr.mediaRouteStopDrawable;
                                i14 = R.string.mr_controller_stop;
                            } else if (z14) {
                                z18 = false;
                                i13 = 0;
                                i14 = 0;
                            } else {
                                if ((this.f26609V.f23701f & 516) != 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    i13 = R.attr.mediaRoutePlayDrawable;
                                    i14 = R.string.mr_controller_play;
                                } else {
                                    z18 = false;
                                    i13 = 0;
                                    i14 = 0;
                                }
                            }
                        } else if (z14) {
                            z18 = false;
                            i13 = 0;
                            i14 = 0;
                        } else {
                            if ((this.f26609V.f23701f & 516) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i13 = R.attr.mediaRoutePlayDrawable;
                                i14 = R.string.mr_controller_play;
                            } else {
                                z18 = false;
                                i13 = 0;
                                i14 = 0;
                            }
                        }
                    } else if (!z14) {
                        if ((this.f26609V.f23701f & 1) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            i13 = R.attr.mediaRouteStopDrawable;
                            i14 = R.string.mr_controller_stop;
                        } else if (z14) {
                            z18 = false;
                            i13 = 0;
                            i14 = 0;
                        } else {
                            if ((this.f26609V.f23701f & 516) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i13 = R.attr.mediaRoutePlayDrawable;
                                i14 = R.string.mr_controller_play;
                            } else {
                                z18 = false;
                                i13 = 0;
                                i14 = 0;
                            }
                        }
                    } else if (z14) {
                        z18 = false;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        if ((this.f26609V.f23701f & 516) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z15) {
                            i13 = R.attr.mediaRoutePlayDrawable;
                            i14 = R.string.mr_controller_play;
                        } else {
                            z18 = false;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                    this.f26639q.setVisibility(z18 ? 0 : 8);
                    if (z18) {
                        this.f26639q.setImageResource(C7832v.m9649g(context, i13));
                        this.f26639q.setContentDescription(context.getResources().getText(i14));
                    }
                }
            }
            m9617s(z10);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m9615q() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f26610W;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f23633f;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f23634g : null;
        i iVar = this.f26611X;
        Bitmap bitmap2 = iVar == null ? this.f26612Y : iVar.f26659a;
        Uri uri2 = iVar == null ? this.f26613Z : iVar.f26660b;
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!m9612m() || this.f26588A) {
            i iVar2 = this.f26611X;
            if (iVar2 != null) {
                iVar2.cancel(true);
            }
            i iVar3 = new i();
            this.f26611X = iVar3;
            iVar3.execute(new Void[0]);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m9616r() {
        Context context = this.f26627k;
        int iM9621a = C7824n.m9621a(context);
        getWindow().setLayout(iM9621a, -2);
        View decorView = getWindow().getDecorView();
        this.f26633n = (iM9621a - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.f26602O = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.f26603P = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.f26604Q = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.f26612Y = null;
        this.f26613Z = null;
        m9615q();
        m9614p(false);
    }

    /* JADX INFO: renamed from: s */
    public final void m9617s(boolean z10) {
        this.f26643u.requestLayout();
        this.f26643u.getViewTreeObserver().addOnGlobalLayoutListener(new f(z10));
    }

    /* JADX INFO: renamed from: t */
    public final void m9618t(boolean z10) {
        int i10 = 0;
        this.f26592E.setVisibility((this.f26591D.getVisibility() == 0 && z10) ? 0 : 8);
        LinearLayout linearLayout = this.f26589B;
        if (this.f26591D.getVisibility() == 8 && !z10) {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.i$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }
}
