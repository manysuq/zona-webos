package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mobi.zona.R;
import p164J1.C2445a;
import p236N1.C3598a;
import p364U3.AbstractC5338j;
import p364U3.C5330b;
import p364U3.C5342n;
import p364U3.C5343o;
import p418X3.C6213b;
import p622j.DialogC15291s;
import p623j$.util.DesugarCollections;
import p623j$.util.Objects;
import p643k.C15564a;
import p799u.C18379a;

/* JADX INFO: renamed from: androidx.mediarouter.app.q */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC7827q extends DialogC15291s {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f26712U = 0;

    /* JADX INFO: renamed from: A */
    public boolean f26713A;

    /* JADX INFO: renamed from: B */
    public boolean f26714B;

    /* JADX INFO: renamed from: C */
    public ImageButton f26715C;

    /* JADX INFO: renamed from: D */
    public Button f26716D;

    /* JADX INFO: renamed from: E */
    public ImageView f26717E;

    /* JADX INFO: renamed from: F */
    public View f26718F;

    /* JADX INFO: renamed from: G */
    public ImageView f26719G;

    /* JADX INFO: renamed from: H */
    public TextView f26720H;

    /* JADX INFO: renamed from: I */
    public TextView f26721I;

    /* JADX INFO: renamed from: J */
    public String f26722J;

    /* JADX INFO: renamed from: K */
    public MediaControllerCompat f26723K;

    /* JADX INFO: renamed from: L */
    public final e f26724L;

    /* JADX INFO: renamed from: M */
    public MediaDescriptionCompat f26725M;

    /* JADX INFO: renamed from: N */
    public d f26726N;

    /* JADX INFO: renamed from: O */
    public Bitmap f26727O;

    /* JADX INFO: renamed from: P */
    public Uri f26728P;

    /* JADX INFO: renamed from: Q */
    public boolean f26729Q;

    /* JADX INFO: renamed from: R */
    public Bitmap f26730R;

    /* JADX INFO: renamed from: S */
    public int f26731S;

    /* JADX INFO: renamed from: T */
    public final boolean f26732T;

    /* JADX INFO: renamed from: g */
    public final C5343o f26733g;

    /* JADX INFO: renamed from: h */
    public final g f26734h;

    /* JADX INFO: renamed from: i */
    public C5342n f26735i;

    /* JADX INFO: renamed from: j */
    public C5343o.g f26736j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f26737k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f26738l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f26739m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f26740n;

    /* JADX INFO: renamed from: o */
    public final Context f26741o;

    /* JADX INFO: renamed from: p */
    public boolean f26742p;

    /* JADX INFO: renamed from: q */
    public boolean f26743q;

    /* JADX INFO: renamed from: r */
    public long f26744r;

    /* JADX INFO: renamed from: s */
    public final a f26745s;

    /* JADX INFO: renamed from: t */
    public RecyclerView f26746t;

    /* JADX INFO: renamed from: u */
    public h f26747u;

    /* JADX INFO: renamed from: v */
    public j f26748v;

    /* JADX INFO: renamed from: w */
    public HashMap f26749w;

    /* JADX INFO: renamed from: x */
    public C5343o.g f26750x;

    /* JADX INFO: renamed from: y */
    public HashMap f26751y;

    /* JADX INFO: renamed from: z */
    public boolean f26752z;

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            DialogC7827q dialogC7827q = DialogC7827q.this;
            if (i10 == 1) {
                dialogC7827q.m9632m();
            } else if (i10 == 2 && dialogC7827q.f26750x != null) {
                dialogC7827q.f26750x = null;
                dialogC7827q.m9633n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogC7827q.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogC7827q dialogC7827q = DialogC7827q.this;
            if (dialogC7827q.f26736j.m6077g()) {
                dialogC7827q.f26733g.getClass();
                C5343o.m6054j(2);
            }
            dialogC7827q.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class d extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: a */
        public final Bitmap f26756a;

        /* JADX INFO: renamed from: b */
        public final Uri f26757b;

        /* JADX INFO: renamed from: c */
        public int f26758c;

        public d() {
            MediaDescriptionCompat mediaDescriptionCompat = DialogC7827q.this.f26725M;
            Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f23633f;
            if (bitmap != null && bitmap.isRecycled()) {
                bitmap = null;
            }
            this.f26756a = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = DialogC7827q.this.f26725M;
            this.f26757b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f23634g : null;
        }

        /* JADX INFO: renamed from: a */
        public final BufferedInputStream m9634a(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStreamOpenInputStream = DialogC7827q.this.f26741o.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(30000);
                uRLConnectionOpenConnection.setReadTimeout(30000);
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
            BufferedInputStream bufferedInputStreamM9634a;
            InputStream inputStream2 = null;
            Bitmap bitmapDecodeStream = this.f26756a;
            if (bitmapDecodeStream == null) {
                Uri uri = this.f26757b;
                try {
                    if (uri != null) {
                        try {
                            bufferedInputStreamM9634a = m9634a(uri);
                            try {
                                try {
                                    if (bufferedInputStreamM9634a == null) {
                                        Objects.toString(uri);
                                        if (bufferedInputStreamM9634a != null) {
                                        }
                                        return null;
                                    }
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(bufferedInputStreamM9634a, null, options);
                                    if (options.outWidth != 0 && options.outHeight != 0) {
                                        try {
                                            bufferedInputStreamM9634a.reset();
                                        } catch (IOException unused) {
                                            bufferedInputStreamM9634a.close();
                                            bufferedInputStreamM9634a = m9634a(uri);
                                            if (bufferedInputStreamM9634a == null) {
                                                Objects.toString(uri);
                                                if (bufferedInputStreamM9634a == null) {
                                                    return null;
                                                }
                                            }
                                            bufferedInputStreamM9634a.close();
                                            return null;
                                        }
                                        options.inJustDecodeBounds = false;
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / DialogC7827q.this.f26741o.getResources().getDimensionPixelSize(R.dimen.mr_cast_meta_art_size)));
                                        if (isCancelled()) {
                                            bufferedInputStreamM9634a.close();
                                            return null;
                                        }
                                        bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamM9634a, null, options);
                                        try {
                                            bufferedInputStreamM9634a.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    bufferedInputStreamM9634a.close();
                                    return null;
                                } catch (IOException unused3) {
                                    return null;
                                }
                            } catch (IOException unused4) {
                                Objects.toString(uri);
                                if (bufferedInputStreamM9634a != null) {
                                    try {
                                        bufferedInputStreamM9634a.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                bitmapDecodeStream = null;
                            }
                        } catch (IOException unused6) {
                            bufferedInputStreamM9634a = null;
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
                this.f26758c = DesugarCollections.unmodifiableList(list).isEmpty() ? 0 : ((C6213b.d) DesugarCollections.unmodifiableList(list).get(0)).f20402d;
            }
            return bitmapDecodeStream;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            DialogC7827q dialogC7827q = DialogC7827q.this;
            dialogC7827q.f26726N = null;
            Bitmap bitmap3 = dialogC7827q.f26727O;
            Bitmap bitmap4 = this.f26756a;
            boolean zEquals = Objects.equals(bitmap3, bitmap4);
            Uri uri = this.f26757b;
            if (zEquals && Objects.equals(dialogC7827q.f26728P, uri)) {
                return;
            }
            dialogC7827q.f26727O = bitmap4;
            dialogC7827q.f26730R = bitmap2;
            dialogC7827q.f26728P = uri;
            dialogC7827q.f26731S = this.f26758c;
            dialogC7827q.f26729Q = true;
            dialogC7827q.m9630k();
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            DialogC7827q dialogC7827q = DialogC7827q.this;
            dialogC7827q.f26729Q = false;
            dialogC7827q.f26730R = null;
            dialogC7827q.f26731S = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class e extends MediaControllerCompat.AbstractC7379a {
        public e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC7379a
        /* JADX INFO: renamed from: a */
        public final void mo8224a(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat mediaDescriptionCompatM8200c = mediaMetadataCompat == null ? null : mediaMetadataCompat.m8200c();
            DialogC7827q dialogC7827q = DialogC7827q.this;
            dialogC7827q.f26725M = mediaDescriptionCompatM8200c;
            dialogC7827q.m9626g();
            dialogC7827q.m9630k();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC7379a
        /* JADX INFO: renamed from: c */
        public final void mo8226c() {
            DialogC7827q dialogC7827q = DialogC7827q.this;
            MediaControllerCompat mediaControllerCompat = dialogC7827q.f26723K;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.m8215c(dialogC7827q.f26724L);
                dialogC7827q.f26723K = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public abstract class f extends RecyclerView.AbstractC7862E {

        /* JADX INFO: renamed from: l */
        public C5343o.g f26761l;

        /* JADX INFO: renamed from: m */
        public final ImageButton f26762m;

        /* JADX INFO: renamed from: n */
        public final MediaRouteVolumeSlider f26763n;

        /* JADX INFO: renamed from: androidx.mediarouter.app.q$f$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int iMax;
                f fVar = f.this;
                DialogC7827q dialogC7827q = DialogC7827q.this;
                if (dialogC7827q.f26750x != null) {
                    dialogC7827q.f26745s.removeMessages(2);
                }
                dialogC7827q.f26750x = fVar.f26761l;
                boolean zIsActivated = view.isActivated();
                boolean z10 = !zIsActivated;
                if (zIsActivated) {
                    Integer num = (Integer) dialogC7827q.f26751y.get(fVar.f26761l.f17555c);
                    iMax = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    iMax = 0;
                }
                fVar.m9636b(z10);
                fVar.f26763n.setProgress(iMax);
                fVar.f26761l.m6080j(iMax);
                dialogC7827q.f26745s.sendEmptyMessageDelayed(2, 500L);
            }
        }

        public f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            int iM3154b;
            int iM3154b2;
            super(view);
            this.f26762m = imageButton;
            this.f26763n = mediaRouteVolumeSlider;
            Context context = DialogC7827q.this.f26741o;
            Drawable drawableM4336f = C3598a.m4336f(C15564a.m18145b(context, R.drawable.mr_cast_mute_button));
            if (C7832v.m9650h(context)) {
                drawableM4336f.setTint(C2445a.m3154b(context, R.color.mr_dynamic_dialog_icon_light));
            }
            imageButton.setImageDrawable(drawableM4336f);
            if (C7832v.m9650h(context)) {
                iM3154b = C2445a.m3154b(context, R.color.mr_cast_progressbar_progress_and_thumb_light);
                iM3154b2 = C2445a.m3154b(context, R.color.mr_cast_progressbar_background_light);
            } else {
                iM3154b = C2445a.m3154b(context, R.color.mr_cast_progressbar_progress_and_thumb_dark);
                iM3154b2 = C2445a.m3154b(context, R.color.mr_cast_progressbar_background_dark);
            }
            mediaRouteVolumeSlider.m9588a(iM3154b, iM3154b2);
        }

        /* JADX INFO: renamed from: a */
        public final void m9635a(C5343o.g gVar) {
            this.f26761l = gVar;
            int i10 = gVar.f17568p;
            boolean z10 = i10 == 0;
            ImageButton imageButton = this.f26762m;
            imageButton.setActivated(z10);
            imageButton.setOnClickListener(new a());
            C5343o.g gVar2 = this.f26761l;
            MediaRouteVolumeSlider mediaRouteVolumeSlider = this.f26763n;
            mediaRouteVolumeSlider.setTag(gVar2);
            mediaRouteVolumeSlider.setMax(gVar.f17569q);
            mediaRouteVolumeSlider.setProgress(i10);
            mediaRouteVolumeSlider.setOnSeekBarChangeListener(DialogC7827q.this.f26748v);
        }

        /* JADX INFO: renamed from: b */
        public final void m9636b(boolean z10) {
            ImageButton imageButton = this.f26762m;
            if (imageButton.isActivated() == z10) {
                return;
            }
            imageButton.setActivated(z10);
            DialogC7827q dialogC7827q = DialogC7827q.this;
            if (z10) {
                dialogC7827q.f26751y.put(this.f26761l.f17555c, Integer.valueOf(this.f26763n.getProgress()));
            } else {
                dialogC7827q.f26751y.remove(this.f26761l.f17555c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class g extends C5343o.a {
        public g() {
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: d */
        public final void mo5612d(C5343o.g gVar) {
            DialogC7827q.this.m9632m();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: e */
        public final void mo5613e(C5343o.g gVar) {
            C5343o.d dVarM6072a;
            DialogC7827q dialogC7827q = DialogC7827q.this;
            if (gVar == dialogC7827q.f26736j && C5343o.g.m6071b() != null) {
                C5343o.f fVar = gVar.f17553a;
                fVar.getClass();
                C5343o.m6047b();
                for (C5343o.g gVar2 : DesugarCollections.unmodifiableList(fVar.f17549b)) {
                    if (!DesugarCollections.unmodifiableList(dialogC7827q.f26736j.f17574v).contains(gVar2) && (dVarM6072a = dialogC7827q.f26736j.m6072a()) != null && dVarM6072a.m6067o(gVar2) && !dialogC7827q.f26738l.contains(gVar2)) {
                        dialogC7827q.m9633n();
                        dialogC7827q.m9631l();
                        return;
                    }
                }
            }
            dialogC7827q.m9632m();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: f */
        public final void mo5614f(C5343o.g gVar) {
            DialogC7827q.this.m9632m();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: g */
        public final void mo6060g(C5343o.g gVar) {
            DialogC7827q dialogC7827q = DialogC7827q.this;
            dialogC7827q.f26736j = gVar;
            dialogC7827q.m9633n();
            dialogC7827q.m9631l();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: i */
        public final void mo6061i() {
            DialogC7827q.this.m9632m();
        }

        @Override // p364U3.C5343o.a
        /* JADX INFO: renamed from: k */
        public final void mo6062k(C5343o.g gVar) {
            f fVar;
            int i10 = DialogC7827q.f26712U;
            DialogC7827q dialogC7827q = DialogC7827q.this;
            if (dialogC7827q.f26750x == gVar || (fVar = (f) dialogC7827q.f26749w.get(gVar.f17555c)) == null) {
                return;
            }
            int i11 = fVar.f26761l.f17568p;
            fVar.m9636b(i11 == 0);
            fVar.f26763n.setProgress(i11);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$h */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public final class h extends RecyclerView.AbstractC7869g<RecyclerView.AbstractC7862E> {

        /* JADX INFO: renamed from: c */
        public final ArrayList<d> f26767c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final LayoutInflater f26768d;

        /* JADX INFO: renamed from: e */
        public final Drawable f26769e;

        /* JADX INFO: renamed from: f */
        public final Drawable f26770f;

        /* JADX INFO: renamed from: g */
        public final Drawable f26771g;

        /* JADX INFO: renamed from: h */
        public final Drawable f26772h;

        /* JADX INFO: renamed from: i */
        public d f26773i;

        /* JADX INFO: renamed from: j */
        public final int f26774j;

        /* JADX INFO: renamed from: k */
        public final AccelerateDecelerateInterpolator f26775k;

        /* JADX INFO: renamed from: androidx.mediarouter.app.q$h$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class a extends RecyclerView.AbstractC7862E {

            /* JADX INFO: renamed from: l */
            public final View f26777l;

            /* JADX INFO: renamed from: m */
            public final ImageView f26778m;

            /* JADX INFO: renamed from: n */
            public final ProgressBar f26779n;

            /* JADX INFO: renamed from: o */
            public final TextView f26780o;

            /* JADX INFO: renamed from: p */
            public final float f26781p;

            /* JADX INFO: renamed from: q */
            public C5343o.g f26782q;

            public a(View view) {
                super(view);
                this.f26777l = view;
                this.f26778m = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
                this.f26779n = progressBar;
                this.f26780o = (TextView) view.findViewById(R.id.mr_cast_group_name);
                DialogC7827q dialogC7827q = DialogC7827q.this;
                this.f26781p = C7832v.m9645c(dialogC7827q.f26741o);
                C7832v.m9651i(dialogC7827q.f26741o, progressBar);
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.q$h$b */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class b extends f {

            /* JADX INFO: renamed from: p */
            public final TextView f26784p;

            /* JADX INFO: renamed from: q */
            public final int f26785q;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(View view) {
                DialogC7827q dialogC7827q = DialogC7827q.this;
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.f26784p = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
                Resources resources = dialogC7827q.f26741o.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.f26785q = (int) typedValue.getDimension(displayMetrics);
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.q$h$c */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class c extends RecyclerView.AbstractC7862E {

            /* JADX INFO: renamed from: l */
            public final TextView f26787l;

            public c(View view) {
                super(view);
                this.f26787l = (TextView) view.findViewById(R.id.mr_cast_header_name);
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.q$h$d */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class d {

            /* JADX INFO: renamed from: a */
            public final Object f26788a;

            /* JADX INFO: renamed from: b */
            public final int f26789b;

            public d(Object obj, int i10) {
                this.f26788a = obj;
                this.f26789b = i10;
            }
        }

        /* JADX INFO: renamed from: androidx.mediarouter.app.q$h$e */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public class e extends f {

            /* JADX INFO: renamed from: p */
            public final View f26790p;

            /* JADX INFO: renamed from: q */
            public final ImageView f26791q;

            /* JADX INFO: renamed from: r */
            public final ProgressBar f26792r;

            /* JADX INFO: renamed from: s */
            public final TextView f26793s;

            /* JADX INFO: renamed from: t */
            public final RelativeLayout f26794t;

            /* JADX INFO: renamed from: u */
            public final CheckBox f26795u;

            /* JADX INFO: renamed from: v */
            public final float f26796v;

            /* JADX INFO: renamed from: w */
            public final int f26797w;

            /* JADX INFO: renamed from: x */
            public final a f26798x;

            /* JADX INFO: renamed from: androidx.mediarouter.app.q$h$e$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public class a implements View.OnClickListener {
                public a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e eVar = e.this;
                    h hVar = h.this;
                    boolean zM9641c = eVar.m9641c(eVar.f26761l);
                    boolean z10 = !zM9641c;
                    boolean zM6075e = eVar.f26761l.m6075e();
                    if (zM9641c) {
                        C5343o c5343o = DialogC7827q.this.f26733g;
                        C5343o.g gVar = eVar.f26761l;
                        c5343o.getClass();
                        if (gVar == null) {
                            throw new NullPointerException("route must not be null");
                        }
                        C5343o.m6047b();
                        C5330b c5330bM6048c = C5343o.m6048c();
                        C5343o.d dVarM6072a = c5330bM6048c.f17415d.m6072a();
                        if (dVarM6072a != null) {
                            AbstractC5338j.b.a aVar = (AbstractC5338j.b.a) dVarM6072a.f17536x.get(gVar.f17555c);
                            if (aVar == null || !aVar.f17506c || !DesugarCollections.unmodifiableList(dVarM6072a.f17574v).contains(gVar)) {
                                gVar.toString();
                            } else if (DesugarCollections.unmodifiableList(dVarM6072a.f17574v).size() > 1) {
                                if (dVarM6072a.m6077g()) {
                                    AbstractC5338j.e eVar2 = c5330bM6048c.f17416e;
                                    if (!(eVar2 instanceof AbstractC5338j.b)) {
                                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                                    }
                                    ((AbstractC5338j.b) eVar2).mo6017n(gVar.f17554b);
                                } else if (dVarM6072a.m6066n()) {
                                    c5330bM6048c.m5986e(dVarM6072a);
                                    dVarM6072a.toString();
                                } else {
                                    dVarM6072a.toString();
                                }
                            }
                        }
                    } else {
                        C5343o c5343o2 = DialogC7827q.this.f26733g;
                        C5343o.g gVar2 = eVar.f26761l;
                        c5343o2.getClass();
                        if (gVar2 == null) {
                            throw new NullPointerException("route must not be null");
                        }
                        C5343o.m6047b();
                        C5330b c5330bM6048c2 = C5343o.m6048c();
                        C5343o.d dVarM6072a2 = c5330bM6048c2.f17415d.m6072a();
                        if (dVarM6072a2 != null) {
                            if (!dVarM6072a2.m6067o(gVar2) || DesugarCollections.unmodifiableList(dVarM6072a2.f17574v).contains(gVar2)) {
                                gVar2.toString();
                            } else if (dVarM6072a2.m6077g()) {
                                AbstractC5338j.e eVar3 = c5330bM6048c2.f17416e;
                                if (!(eVar3 instanceof AbstractC5338j.b)) {
                                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                                }
                                ((AbstractC5338j.b) eVar3).mo6016m(gVar2.f17554b);
                            } else if (dVarM6072a2.m6066n()) {
                                c5330bM6048c2.m5986e(dVarM6072a2);
                                dVarM6072a2.toString();
                            } else {
                                dVarM6072a2.toString();
                            }
                        }
                    }
                    eVar.m9642d(z10, !zM6075e);
                    if (zM6075e) {
                        List listUnmodifiableList = DesugarCollections.unmodifiableList(DialogC7827q.this.f26736j.f17574v);
                        for (C5343o.g gVar3 : DesugarCollections.unmodifiableList(eVar.f26761l.f17574v)) {
                            if (listUnmodifiableList.contains(gVar3) != z10) {
                                f fVar = (f) DialogC7827q.this.f26749w.get(gVar3.f17555c);
                                if (fVar instanceof e) {
                                    ((e) fVar).m9642d(z10, true);
                                }
                            }
                        }
                    }
                    DialogC7827q dialogC7827q = DialogC7827q.this;
                    C5343o.g gVar4 = eVar.f26761l;
                    List listUnmodifiableList2 = DesugarCollections.unmodifiableList(dialogC7827q.f26736j.f17574v);
                    int iMax = Math.max(1, listUnmodifiableList2.size());
                    if (gVar4.m6075e()) {
                        Iterator it = DesugarCollections.unmodifiableList(gVar4.f17574v).iterator();
                        while (it.hasNext()) {
                            if (listUnmodifiableList2.contains((C5343o.g) it.next()) != z10) {
                                iMax += !zM9641c ? 1 : -1;
                            }
                        }
                    } else {
                        iMax += zM9641c ? -1 : 1;
                    }
                    boolean z11 = dialogC7827q.f26732T && DesugarCollections.unmodifiableList(dialogC7827q.f26736j.f17574v).size() > 1;
                    boolean z12 = dialogC7827q.f26732T && iMax >= 2;
                    if (z11 != z12) {
                        RecyclerView.AbstractC7862E abstractC7862EFindViewHolderForAdapterPosition = dialogC7827q.f26746t.findViewHolderForAdapterPosition(0);
                        if (abstractC7862EFindViewHolderForAdapterPosition instanceof b) {
                            b bVar = (b) abstractC7862EFindViewHolderForAdapterPosition;
                            hVar.m9637a(z12 ? bVar.f26785q : 0, bVar.itemView);
                        }
                    }
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public e(View view) {
                DialogC7827q dialogC7827q = DialogC7827q.this;
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.f26798x = new a();
                this.f26790p = view;
                this.f26791q = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
                this.f26792r = progressBar;
                this.f26793s = (TextView) view.findViewById(R.id.mr_cast_route_name);
                this.f26794t = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
                this.f26795u = checkBox;
                Context context = dialogC7827q.f26741o;
                Drawable drawableM4336f = C3598a.m4336f(C15564a.m18145b(context, R.drawable.mr_cast_checkbox));
                if (C7832v.m9650h(context)) {
                    drawableM4336f.setTint(C2445a.m3154b(context, R.color.mr_dynamic_dialog_icon_light));
                }
                checkBox.setButtonDrawable(drawableM4336f);
                C7832v.m9651i(context, progressBar);
                this.f26796v = C7832v.m9645c(context);
                Resources resources = context.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.f26797w = (int) typedValue.getDimension(displayMetrics);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: c */
            public final boolean m9641c(C5343o.g gVar) {
                if (gVar.m6077g()) {
                    return true;
                }
                C5343o.d dVarM6072a = DialogC7827q.this.f26736j.m6072a();
                if (dVarM6072a == null) {
                    return false;
                }
                AbstractC5338j.b.a aVar = (AbstractC5338j.b.a) dVarM6072a.f17536x.get(gVar.f17555c);
                return (aVar != null ? aVar.f17505b : 4) == 3;
            }

            /* JADX INFO: renamed from: d */
            public final void m9642d(boolean z10, boolean z11) {
                CheckBox checkBox = this.f26795u;
                checkBox.setEnabled(false);
                this.f26790p.setEnabled(false);
                checkBox.setChecked(z10);
                if (z10) {
                    this.f26791q.setVisibility(4);
                    this.f26792r.setVisibility(0);
                }
                if (z11) {
                    h.this.m9637a(z10 ? this.f26797w : 0, this.f26794t);
                }
            }
        }

        public h() {
            Context context = DialogC7827q.this.f26741o;
            this.f26768d = LayoutInflater.from(context);
            this.f26769e = C7832v.m9646d(context, R.attr.mediaRouteDefaultIconDrawable);
            this.f26770f = C7832v.m9646d(context, R.attr.mediaRouteTvIconDrawable);
            this.f26771g = C7832v.m9646d(context, R.attr.mediaRouteSpeakerIconDrawable);
            this.f26772h = C7832v.m9646d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
            this.f26774j = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            this.f26775k = new AccelerateDecelerateInterpolator();
            m9640d();
        }

        /* JADX INFO: renamed from: a */
        public final void m9637a(int i10, View view) {
            C7828r c7828r = new C7828r(view, i10, view.getLayoutParams().height);
            c7828r.setAnimationListener(new AnimationAnimationListenerC7829s(this));
            c7828r.setDuration(this.f26774j);
            c7828r.setInterpolator(this.f26775k);
            view.startAnimation(c7828r);
        }

        /* JADX INFO: renamed from: b */
        public final Drawable m9638b(C5343o.g gVar) {
            Uri uri = gVar.f17558f;
            if (uri != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(DialogC7827q.this.f26741o.getContentResolver().openInputStream(uri), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException unused) {
                    uri.toString();
                }
            }
            int i10 = gVar.f17566n;
            if (i10 == 1) {
                return this.f26770f;
            }
            if (i10 != 2) {
                return gVar.m6075e() ? this.f26772h : this.f26769e;
            }
            return this.f26771g;
        }

        /* JADX INFO: renamed from: c */
        public final void m9639c() {
            DialogC7827q dialogC7827q = DialogC7827q.this;
            ArrayList arrayList = dialogC7827q.f26740n;
            arrayList.clear();
            ArrayList arrayList2 = dialogC7827q.f26738l;
            ArrayList arrayList3 = new ArrayList();
            C5343o.d dVarM6072a = dialogC7827q.f26736j.m6072a();
            if (dVarM6072a != null) {
                C5343o.f fVar = dialogC7827q.f26736j.f17553a;
                fVar.getClass();
                C5343o.m6047b();
                for (C5343o.g gVar : DesugarCollections.unmodifiableList(fVar.f17549b)) {
                    if (dVarM6072a.m6067o(gVar)) {
                        arrayList3.add(gVar);
                    }
                }
            }
            HashSet hashSet = new HashSet(arrayList2);
            hashSet.removeAll(arrayList3);
            arrayList.addAll(hashSet);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: d */
        public final void m9640d() {
            ArrayList<d> arrayList = this.f26767c;
            arrayList.clear();
            DialogC7827q dialogC7827q = DialogC7827q.this;
            ArrayList<C5343o.g> arrayList2 = dialogC7827q.f26739m;
            Context context = dialogC7827q.f26741o;
            ArrayList<C5343o.g> arrayList3 = dialogC7827q.f26738l;
            this.f26773i = new d(dialogC7827q.f26736j, 1);
            ArrayList arrayList4 = dialogC7827q.f26737k;
            if (arrayList4.isEmpty()) {
                arrayList.add(new d(dialogC7827q.f26736j, 3));
            } else {
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList.add(new d((C5343o.g) it.next(), 3));
                }
            }
            boolean z10 = false;
            if (!arrayList3.isEmpty()) {
                boolean z11 = false;
                for (C5343o.g gVar : arrayList3) {
                    if (!arrayList4.contains(gVar)) {
                        if (!z11) {
                            dialogC7827q.f26736j.getClass();
                            AbstractC5338j.b bVarM6071b = C5343o.g.m6071b();
                            String strMo6035j = bVarM6071b != null ? bVarM6071b.mo6035j() : null;
                            if (TextUtils.isEmpty(strMo6035j)) {
                                strMo6035j = context.getString(R.string.mr_dialog_groupable_header);
                            }
                            arrayList.add(new d(strMo6035j, 2));
                            z11 = true;
                        }
                        arrayList.add(new d(gVar, 3));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                for (C5343o.g gVar2 : arrayList2) {
                    C5343o.g gVar3 = dialogC7827q.f26736j;
                    if (gVar3 != gVar2) {
                        if (!z10) {
                            gVar3.getClass();
                            AbstractC5338j.b bVarM6071b2 = C5343o.g.m6071b();
                            String strMo6036k = bVarM6071b2 != null ? bVarM6071b2.mo6036k() : null;
                            if (TextUtils.isEmpty(strMo6036k)) {
                                strMo6036k = context.getString(R.string.mr_dialog_transferable_header);
                            }
                            arrayList.add(new d(strMo6036k, 2));
                            z10 = true;
                        }
                        arrayList.add(new d(gVar2, 4));
                    }
                }
            }
            m9639c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final int getItemCount() {
            return this.f26767c.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final int getItemViewType(int i10) {
            d dVar;
            if (i10 == 0) {
                dVar = this.f26773i;
            } else {
                dVar = this.f26767c.get(i10 - 1);
            }
            return dVar.f26789b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final void onBindViewHolder(RecyclerView.AbstractC7862E abstractC7862E, int i10) {
            C5343o.d dVarM6072a;
            AbstractC5338j.b.a aVar;
            ArrayList<d> arrayList = this.f26767c;
            int i11 = (i10 == 0 ? this.f26773i : arrayList.get(i10 - 1)).f26789b;
            d dVar = i10 == 0 ? this.f26773i : arrayList.get(i10 - 1);
            DialogC7827q dialogC7827q = DialogC7827q.this;
            int i12 = 0;
            if (i11 == 1) {
                dialogC7827q.f26749w.put(((C5343o.g) dVar.f26788a).f17555c, (f) abstractC7862E);
                b bVar = (b) abstractC7862E;
                View view = bVar.itemView;
                DialogC7827q dialogC7827q2 = DialogC7827q.this;
                if (dialogC7827q2.f26732T && DesugarCollections.unmodifiableList(dialogC7827q2.f26736j.f17574v).size() > 1) {
                    i12 = bVar.f26785q;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i12;
                view.setLayoutParams(layoutParams);
                C5343o.g gVar = (C5343o.g) dVar.f26788a;
                bVar.m9635a(gVar);
                bVar.f26784p.setText(gVar.f17556d);
                return;
            }
            if (i11 == 2) {
                c cVar = (c) abstractC7862E;
                cVar.getClass();
                cVar.f26787l.setText(dVar.f26788a.toString());
                return;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                a aVar2 = (a) abstractC7862E;
                View view2 = aVar2.f26777l;
                C5343o.g gVar2 = (C5343o.g) dVar.f26788a;
                aVar2.f26782q = gVar2;
                ImageView imageView = aVar2.f26778m;
                imageView.setVisibility(0);
                aVar2.f26779n.setVisibility(4);
                h hVar = h.this;
                List listUnmodifiableList = DesugarCollections.unmodifiableList(DialogC7827q.this.f26736j.f17574v);
                view2.setAlpha((listUnmodifiableList.size() == 1 && listUnmodifiableList.get(0) == gVar2) ? aVar2.f26781p : 1.0f);
                view2.setOnClickListener(new ViewOnClickListenerC7830t(aVar2));
                imageView.setImageDrawable(hVar.m9638b(gVar2));
                aVar2.f26780o.setText(gVar2.f17556d);
                return;
            }
            dialogC7827q.f26749w.put(((C5343o.g) dVar.f26788a).f17555c, (f) abstractC7862E);
            e eVar = (e) abstractC7862E;
            float f10 = eVar.f26796v;
            e.a aVar3 = eVar.f26798x;
            ImageView imageView2 = eVar.f26791q;
            View view3 = eVar.f26790p;
            CheckBox checkBox = eVar.f26795u;
            C5343o.g gVar3 = (C5343o.g) dVar.f26788a;
            h hVar2 = h.this;
            DialogC7827q dialogC7827q3 = DialogC7827q.this;
            if (gVar3 == dialogC7827q3.f26736j && DesugarCollections.unmodifiableList(gVar3.f17574v).size() > 0) {
                for (C5343o.g gVar4 : DesugarCollections.unmodifiableList(gVar3.f17574v)) {
                    if (!dialogC7827q3.f26738l.contains(gVar4)) {
                        gVar3 = gVar4;
                        break;
                    }
                }
            }
            eVar.m9635a(gVar3);
            imageView2.setImageDrawable(hVar2.m9638b(gVar3));
            eVar.f26793s.setText(gVar3.f17556d);
            checkBox.setVisibility(0);
            boolean zM9641c = eVar.m9641c(gVar3);
            boolean z10 = !dialogC7827q3.f26740n.contains(gVar3) && (!eVar.m9641c(gVar3) || DesugarCollections.unmodifiableList(dialogC7827q3.f26736j.f17574v).size() >= 2) && !(eVar.m9641c(gVar3) && ((dVarM6072a = dialogC7827q3.f26736j.m6072a()) == null || (aVar = (AbstractC5338j.b.a) dVarM6072a.f17536x.get(gVar3.f17555c)) == null || !aVar.f17506c));
            checkBox.setChecked(zM9641c);
            eVar.f26792r.setVisibility(4);
            imageView2.setVisibility(0);
            view3.setEnabled(z10);
            checkBox.setEnabled(z10);
            eVar.f26762m.setEnabled(z10 || zM9641c);
            eVar.f26763n.setEnabled(z10 || zM9641c);
            view3.setOnClickListener(aVar3);
            checkBox.setOnClickListener(aVar3);
            RelativeLayout relativeLayout = eVar.f26794t;
            if (zM9641c && !eVar.f26761l.m6075e()) {
                i12 = eVar.f26797w;
            }
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            layoutParams2.height = i12;
            relativeLayout.setLayoutParams(layoutParams2);
            view3.setAlpha((z10 || zM9641c) ? 1.0f : f10);
            checkBox.setAlpha((z10 || !zM9641c) ? 1.0f : f10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final RecyclerView.AbstractC7862E onCreateViewHolder(ViewGroup viewGroup, int i10) {
            LayoutInflater layoutInflater = this.f26768d;
            if (i10 == 1) {
                return new b(layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i10 == 2) {
                return new c(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
            }
            if (i10 == 3) {
                return new e(layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
            }
            if (i10 == 4) {
                return new a(layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7869g
        public final void onViewRecycled(RecyclerView.AbstractC7862E abstractC7862E) {
            super.onViewRecycled(abstractC7862E);
            DialogC7827q.this.f26749w.values().remove(abstractC7862E);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$i */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class i implements Comparator<C5343o.g> {

        /* JADX INFO: renamed from: b */
        public static final i f26801b = new i();

        @Override // java.util.Comparator
        public final int compare(C5343o.g gVar, C5343o.g gVar2) {
            return gVar.f17556d.compareToIgnoreCase(gVar2.f17556d);
        }
    }

    /* JADX INFO: renamed from: androidx.mediarouter.app.q$j */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class j implements SeekBar.OnSeekBarChangeListener {
        public j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                C5343o.g gVar = (C5343o.g) seekBar.getTag();
                f fVar = (f) DialogC7827q.this.f26749w.get(gVar.f17555c);
                if (fVar != null) {
                    fVar.m9636b(i10 == 0);
                }
                gVar.m6080j(i10);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            DialogC7827q dialogC7827q = DialogC7827q.this;
            if (dialogC7827q.f26750x != null) {
                dialogC7827q.f26745s.removeMessages(2);
            }
            dialogC7827q.f26750x = (C5343o.g) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            DialogC7827q.this.f26745s.sendEmptyMessageDelayed(2, 500L);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC7827q(Context context) {
        ContextThemeWrapper contextThemeWrapperM9643a = C7832v.m9643a(context, false);
        int iM9649g = C7832v.m9649g(contextThemeWrapperM9643a, R.attr.mediaRouteTheme);
        super(contextThemeWrapperM9643a, iM9649g == 0 ? C7832v.m9647e(contextThemeWrapperM9643a) : iM9649g);
        this.f26735i = C5342n.f17523c;
        this.f26737k = new ArrayList();
        this.f26738l = new ArrayList();
        this.f26739m = new ArrayList();
        this.f26740n = new ArrayList();
        this.f26745s = new a();
        Context context2 = getContext();
        this.f26741o = context2;
        this.f26733g = C5343o.m6049d(context2);
        this.f26732T = C5343o.m6053h();
        this.f26734h = new g();
        this.f26736j = C5343o.m6052g();
        this.f26724L = new e();
        m9627h(C5343o.m6050e());
    }

    /* JADX INFO: renamed from: f */
    public final void m9625f(List<C5343o.g> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C5343o.g gVar = list.get(size);
            if (gVar.m6074d() || !gVar.f17559g || !gVar.m6078h(this.f26735i) || this.f26736j == gVar) {
                list.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9626g() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f26725M;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f23633f;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f23634g : null;
        d dVar = this.f26726N;
        Bitmap bitmap2 = dVar == null ? this.f26727O : dVar.f26756a;
        Uri uri2 = dVar == null ? this.f26728P : dVar.f26757b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            d dVar2 = this.f26726N;
            if (dVar2 != null) {
                dVar2.cancel(true);
            }
            d dVar3 = new d();
            this.f26726N = dVar3;
            dVar3.execute(new Void[0]);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m9627h(MediaSessionCompat.Token token) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        MediaControllerCompat mediaControllerCompat = this.f26723K;
        e eVar = this.f26724L;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.m8215c(eVar);
            this.f26723K = null;
        }
        if (token != null && this.f26743q) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.f26741o, token);
            this.f26723K = mediaControllerCompat2;
            mediaControllerCompat2.m8214b(eVar);
            MediaMetadata metadata = this.f26723K.f23648a.f23650a.getMetadata();
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
            this.f26725M = mediaMetadataCompatCreateFromParcel != null ? mediaMetadataCompatCreateFromParcel.m8200c() : null;
            m9626g();
            m9630k();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9628i(C5342n c5342n) {
        if (c5342n == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f26735i.equals(c5342n)) {
            return;
        }
        this.f26735i = c5342n;
        if (this.f26743q) {
            C5343o c5343o = this.f26733g;
            g gVar = this.f26734h;
            c5343o.m6056i(gVar);
            c5343o.m6055a(c5342n, gVar, 1);
            m9631l();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9629j() {
        Context context = this.f26741o;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : C7824n.m9621a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.f26727O = null;
        this.f26728P = null;
        m9626g();
        m9630k();
        m9632m();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX INFO: renamed from: k */
    public final void m9630k() {
        Bitmap bitmap;
        if ((this.f26750x != null || this.f26752z) ? true : !this.f26742p) {
            this.f26714B = true;
            return;
        }
        this.f26714B = false;
        if (!this.f26736j.m6077g() || this.f26736j.m6074d()) {
            dismiss();
        }
        if (this.f26729Q) {
            Bitmap bitmap2 = this.f26730R;
            if ((bitmap2 != null && bitmap2.isRecycled()) || this.f26730R == null) {
                bitmap = this.f26730R;
                if (bitmap == null && bitmap.isRecycled()) {
                    Objects.toString(this.f26730R);
                }
                this.f26719G.setVisibility(8);
                this.f26718F.setVisibility(8);
                this.f26717E.setImageBitmap(null);
            } else {
                this.f26719G.setVisibility(0);
                this.f26719G.setImageBitmap(this.f26730R);
                this.f26719G.setBackgroundColor(this.f26731S);
                this.f26718F.setVisibility(0);
                Bitmap bitmap3 = this.f26730R;
                RenderScript renderScriptCreate = RenderScript.create(this.f26741o);
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap3);
                Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                scriptIntrinsicBlurCreate.setRadius(10.0f);
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                Bitmap bitmapCopy = bitmap3.copy(bitmap3.getConfig(), true);
                allocationCreateTyped.copyTo(bitmapCopy);
                allocationCreateFromBitmap.destroy();
                allocationCreateTyped.destroy();
                scriptIntrinsicBlurCreate.destroy();
                renderScriptCreate.destroy();
                this.f26717E.setImageBitmap(bitmapCopy);
            }
        } else {
            bitmap = this.f26730R;
            if (bitmap == null && bitmap.isRecycled()) {
                Objects.toString(this.f26730R);
            }
            this.f26719G.setVisibility(8);
            this.f26718F.setVisibility(8);
            this.f26717E.setImageBitmap(null);
        }
        this.f26729Q = false;
        this.f26730R = null;
        this.f26731S = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.f26725M;
        CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f23630c;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.f26725M;
        CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f23631d : null;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
        if (zIsEmpty) {
            this.f26720H.setText(this.f26722J);
        } else {
            this.f26720H.setText(charSequence);
        }
        if (zIsEmpty2) {
            this.f26721I.setVisibility(8);
        } else {
            this.f26721I.setText(charSequence2);
            this.f26721I.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m9631l() {
        ArrayList arrayList = this.f26737k;
        arrayList.clear();
        ArrayList arrayList2 = this.f26738l;
        arrayList2.clear();
        ArrayList arrayList3 = this.f26739m;
        arrayList3.clear();
        arrayList.addAll(DesugarCollections.unmodifiableList(this.f26736j.f17574v));
        C5343o.d dVarM6072a = this.f26736j.m6072a();
        if (dVarM6072a != null) {
            C5343o.f fVar = this.f26736j.f17553a;
            fVar.getClass();
            C5343o.m6047b();
            for (C5343o.g gVar : DesugarCollections.unmodifiableList(fVar.f17549b)) {
                if (dVarM6072a.m6067o(gVar)) {
                    arrayList2.add(gVar);
                }
                AbstractC5338j.b.a aVar = (AbstractC5338j.b.a) dVarM6072a.f17536x.get(gVar.f17555c);
                if (aVar != null && aVar.f17508e) {
                    arrayList3.add(gVar);
                }
            }
        }
        m9625f(arrayList2);
        m9625f(arrayList3);
        i iVar = i.f26801b;
        Collections.sort(arrayList, iVar);
        Collections.sort(arrayList2, iVar);
        Collections.sort(arrayList3, iVar);
        this.f26747u.m9640d();
    }

    /* JADX INFO: renamed from: m */
    public final void m9632m() {
        if (this.f26743q) {
            if (SystemClock.uptimeMillis() - this.f26744r < 300) {
                a aVar = this.f26745s;
                aVar.removeMessages(1);
                aVar.sendEmptyMessageAtTime(1, this.f26744r + 300);
                return;
            }
            if ((this.f26750x != null || this.f26752z) ? true : !this.f26742p) {
                this.f26713A = true;
                return;
            }
            this.f26713A = false;
            if (!this.f26736j.m6077g() || this.f26736j.m6074d()) {
                dismiss();
            }
            this.f26744r = SystemClock.uptimeMillis();
            this.f26747u.m9639c();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9633n() {
        if (this.f26713A) {
            m9632m();
        }
        if (this.f26714B) {
            m9630k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26743q = true;
        this.f26733g.m6055a(this.f26735i, this.f26734h, 1);
        m9631l();
        m9627h(C5343o.m6050e());
    }

    @Override // p622j.DialogC15291s, p513d.DialogC10194w, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.f26741o;
        decorView.setBackgroundColor(C2445a.m3154b(context, C7832v.m9650h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.f26715C = imageButton;
        imageButton.setColorFilter(-1);
        this.f26715C.setOnClickListener(new b());
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.f26716D = button;
        button.setTextColor(-1);
        this.f26716D.setOnClickListener(new c());
        this.f26747u = new h();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.f26746t = recyclerView;
        recyclerView.setAdapter(this.f26747u);
        this.f26746t.setLayoutManager(new LinearLayoutManager(1));
        this.f26748v = new j();
        this.f26749w = new HashMap();
        this.f26751y = new HashMap();
        this.f26717E = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.f26718F = findViewById(R.id.mr_cast_meta_black_scrim);
        this.f26719G = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.f26720H = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.f26721I = textView2;
        textView2.setTextColor(-1);
        this.f26722J = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.f26742p = true;
        m9629j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26743q = false;
        this.f26733g.m6056i(this.f26734h);
        this.f26745s.removeCallbacksAndMessages(null);
        m9627h(null);
    }
}
