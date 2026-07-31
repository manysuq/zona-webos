package p475a7;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.InterfaceC7404a;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.common.internal.C8573n;
import com.google.android.gms.internal.cast.BinderC8749C;
import com.google.android.gms.internal.cast.C8867T;
import com.google.android.gms.internal.cast.HandlerC8881V;
import java.util.List;
import mobi.zona.R;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p055D0.C0941K;
import p421X6.C6271k;
import p421X6.C6277n;
import p421X6.C6281p;
import p439Y6.C6480b;
import p439Y6.C6481c;
import p439Y6.C6487i;
import p457Z6.AbstractC6742f;
import p457Z6.C6737a;
import p457Z6.C6739c;
import p457Z6.C6741e;
import p457Z6.C6743g;
import p457Z6.C6744h;
import p457Z6.InterfaceC6728P;
import p503c7.C8361a;
import p503c7.C8362b;
import p586h7.C11852a;
import p799u.C18379a;

/* JADX INFO: renamed from: a7.q */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7028q {

    /* JADX INFO: renamed from: v */
    public static final C8362b f23044v = new C8362b("MediaSessionManager", null);

    /* JADX INFO: renamed from: a */
    public final Context f23045a;

    /* JADX INFO: renamed from: b */
    public final C6481c f23046b;

    /* JADX INFO: renamed from: c */
    public final BinderC8749C f23047c;

    /* JADX INFO: renamed from: d */
    public final C6487i f23048d;

    /* JADX INFO: renamed from: e */
    public final C6743g f23049e;

    /* JADX INFO: renamed from: f */
    public final ComponentName f23050f;

    /* JADX INFO: renamed from: g */
    public final ComponentName f23051g;

    /* JADX INFO: renamed from: h */
    public final C7013b f23052h;

    /* JADX INFO: renamed from: i */
    public final C7013b f23053i;

    /* JADX INFO: renamed from: j */
    public final C7022k f23054j;

    /* JADX INFO: renamed from: k */
    public final HandlerC8881V f23055k;

    /* JADX INFO: renamed from: l */
    public final RunnableC7023l f23056l;

    /* JADX INFO: renamed from: m */
    public final C7027p f23057m;

    /* JADX INFO: renamed from: n */
    public C6744h f23058n;

    /* JADX INFO: renamed from: o */
    public CastDevice f23059o;

    /* JADX INFO: renamed from: p */
    public MediaSessionCompat f23060p;

    /* JADX INFO: renamed from: q */
    public boolean f23061q;

    /* JADX INFO: renamed from: r */
    public PlaybackStateCompat.CustomAction f23062r;

    /* JADX INFO: renamed from: s */
    public PlaybackStateCompat.CustomAction f23063s;

    /* JADX INFO: renamed from: t */
    public PlaybackStateCompat.CustomAction f23064t;

    /* JADX INFO: renamed from: u */
    public PlaybackStateCompat.CustomAction f23065u;

    /* JADX WARN: Type inference failed for: r8v1, types: [a7.l] */
    public C7028q(Context context, C6481c c6481c, BinderC8749C binderC8749C) {
        C6487i c6487i;
        C6743g c6743g;
        int[] iArrZzg;
        this.f23045a = context;
        this.f23046b = c6481c;
        this.f23047c = binderC8749C;
        C8362b c8362b = C6480b.f21316l;
        C8573n.m10450c();
        C6480b c6480b = C6480b.f21318n;
        C7022k c7022k = null;
        if (c6480b != null) {
            C8573n.m10450c();
            c6487i = c6480b.f21321c;
        } else {
            c6487i = null;
        }
        this.f23048d = c6487i;
        C6737a c6737a = c6481c.f21338g;
        this.f23049e = c6737a == null ? null : c6737a.f22153e;
        this.f23057m = new C7027p(this);
        String str = c6737a == null ? null : c6737a.f22151c;
        this.f23050f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = c6737a == null ? null : c6737a.f22150b;
        this.f23051g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        C7013b c7013b = new C7013b(context);
        this.f23052h = c7013b;
        c7013b.f22999e = new C7024m(this);
        C7013b c7013b2 = new C7013b(context);
        this.f23053i = c7013b2;
        c7013b2.f22999e = new C7025n(this);
        this.f23055k = new HandlerC8881V(Looper.getMainLooper());
        C8362b c8362b2 = C7022k.f23016w;
        C6737a c6737a2 = c6481c.f21338g;
        if (c6737a2 != null && (c6743g = c6737a2.f22153e) != null) {
            InterfaceC6728P interfaceC6728P = c6743g.f22183G;
            if (interfaceC6728P == null) {
                c7022k = new C7022k(context);
            } else {
                List listM7921a = C7029r.m7921a(interfaceC6728P);
                try {
                    iArrZzg = interfaceC6728P.zzg();
                } catch (RemoteException unused) {
                    C7029r.f23066a.m10230c("Unable to call %s on %s.", "getCompactViewActionIndices", InterfaceC6728P.class.getSimpleName());
                    iArrZzg = null;
                }
                int size = listM7921a == null ? 0 : listM7921a.size();
                if (listM7921a == null || listM7921a.isEmpty()) {
                    c8362b2.m10230c(AbstractC6742f.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
                } else if (listM7921a.size() > 5) {
                    c8362b2.m10230c(AbstractC6742f.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
                } else if (iArrZzg == null || (iArrZzg.length) == 0) {
                    c8362b2.m10230c(AbstractC6742f.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
                } else {
                    for (int i10 : iArrZzg) {
                        if (i10 < 0 || i10 >= size) {
                            c8362b2.m10230c(AbstractC6742f.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                        }
                    }
                    c7022k = new C7022k(context);
                }
            }
        }
        this.f23054j = c7022k;
        this.f23056l = new Runnable() { // from class: a7.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f23039b.m7917g(false);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final void m7911a(C6744h c6744h, CastDevice castDevice) {
        ComponentName componentName;
        C6481c c6481c = this.f23046b;
        C6737a c6737a = c6481c == null ? null : c6481c.f21338g;
        if (this.f23061q || c6481c == null || c6737a == null || this.f23049e == null || c6744h == null || castDevice == null || (componentName = this.f23051g) == null) {
            f23044v.m10228a("skip attaching media session", new Object[0]);
            return;
        }
        this.f23058n = c6744h;
        c6744h.m7645o(this.f23057m);
        this.f23059o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        int i10 = C8867T.f29800a;
        Context context = this.f23045a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i10);
        if (c6737a.f22155g) {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, componentName, broadcast);
            this.f23060p = mediaSessionCompat;
            m7920j(0, null);
            CastDevice castDevice2 = this.f23059o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.f29150e)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.f23059o.f29150e);
                C18379a<String, Integer> c18379a = MediaMetadataCompat.f23638e;
                if (c18379a.containsKey("android.media.metadata.ALBUM_ARTIST") && c18379a.get("android.media.metadata.ALBUM_ARTIST").intValue() != 1) {
                    throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                }
                bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                mediaSessionCompat.m8233d(new MediaMetadataCompat(bundle));
            }
            mediaSessionCompat.m8232c(new C7026o(this), null);
            mediaSessionCompat.m8231b(true);
            this.f23047c.m10716S0(mediaSessionCompat);
        }
        this.f23061q = true;
        m7912b();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    /* JADX INFO: renamed from: b */
    public final void m7912b() {
        MediaInfo mediaInfoM7634d;
        C6271k c6271k;
        boolean z10;
        boolean z11;
        C11852a c11852aM7598a;
        C6277n c6277nM7633c;
        MediaInfo mediaInfo;
        C6744h c6744h = this.f23058n;
        if (c6744h == null) {
            return;
        }
        int iM7647q = c6744h.m7647q();
        MediaInfo mediaInfoM7634d2 = c6744h.m7634d();
        if (c6744h.m7641k() && (c6277nM7633c = c6744h.m7633c()) != null && (mediaInfo = c6277nM7633c.f20599b) != null) {
            mediaInfoM7634d2 = mediaInfo;
        }
        m7920j(iM7647q, mediaInfoM7634d2);
        if (!c6744h.m7638h()) {
            m7918h();
            m7919i();
            return;
        }
        if (iM7647q != 0) {
            C7022k c7022k = this.f23054j;
            if (c7022k != null) {
                f23044v.m10228a("Update media notification.", new Object[0]);
                CastDevice castDevice = this.f23059o;
                C6744h c6744h2 = this.f23058n;
                MediaSessionCompat mediaSessionCompat = this.f23060p;
                if (castDevice != null && c6744h2 != null && mediaSessionCompat != null && (mediaInfoM7634d = c6744h2.m7634d()) != null && (c6271k = mediaInfoM7634d.f29175e) != null) {
                    List list = c6271k.f20581b;
                    C6281p c6281pM7635e = c6744h2.m7635e();
                    if (c6281pM7635e == null) {
                        z10 = false;
                        z11 = false;
                    } else {
                        int i10 = c6281pM7635e.f20625q;
                        if (i10 == 1 || i10 == 2 || i10 == 3) {
                            z10 = true;
                            z11 = true;
                        } else {
                            Integer num = (Integer) c6281pM7635e.f20633y.get(c6281pM7635e.f20612d);
                            if (num != null) {
                                boolean z12 = num.intValue() > 0;
                                if (num.intValue() < c6281pM7635e.f20626r.size() - 1) {
                                    z11 = z12;
                                    z10 = true;
                                } else {
                                    z11 = z12;
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                                z11 = false;
                            }
                        }
                    }
                    boolean z13 = c6744h2.m7636f() == 2;
                    int i11 = mediaInfoM7634d.f29173c;
                    String strM7083a = c6271k.m7083a("com.google.android.gms.cast.metadata.TITLE");
                    String str = castDevice.f29150e;
                    C7020i c7020i = new C7020i(z13, i11, strM7083a, str, mediaSessionCompat.f23665a.f23683b, z10, z11);
                    boolean z14 = z13;
                    boolean z15 = z10;
                    boolean z16 = z11;
                    C7020i c7020i2 = c7022k.f23029m;
                    if (c7020i2 == null || z14 != c7020i2.f23008b || i11 != c7020i2.f23009c || !C8361a.m10226d(strM7083a, c7020i2.f23010d) || !C8361a.m10226d(str, c7020i2.f23011e) || z15 != c7020i2.f23012f || z16 != c7020i2.f23013g) {
                        c7022k.f23029m = c7020i;
                        c7022k.m7903b();
                    }
                    if (c7022k.f23020d != null) {
                        int i12 = c7022k.f23027k.f22156b;
                        c11852aM7598a = C6739c.m7598a(c6271k);
                    } else {
                        c11852aM7598a = (list == null || list.isEmpty()) ? null : (C11852a) list.get(0);
                    }
                    C7021j c7021j = new C7021j(c11852aM7598a);
                    C7021j c7021j2 = c7022k.f23030n;
                    Uri uri = c7021j.f23014a;
                    if (c7021j2 == null || !C8361a.m10226d(uri, c7021j2.f23014a)) {
                        C7013b c7013b = c7022k.f23026j;
                        c7013b.f22999e = new C7019h(c7022k, c7021j);
                        c7013b.m7898a(uri);
                    }
                }
            }
            if (c6744h.m7641k()) {
                return;
            }
            m7917g(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m7913c(String str, int i10, Bundle bundle) {
        long j10;
        int iHashCode = str.hashCode();
        if (iHashCode != -945151566) {
            if (iHashCode != -945080078) {
                if (iHashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i10 == 3) {
                        j10 = 514;
                        i10 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i10 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                C6744h c6744h = this.f23058n;
                if (c6744h != null && c6744h.m7638h()) {
                    C6281p c6281pM7635e = c6744h.m7635e();
                    C8573n.m10455h(c6281pM7635e);
                    if ((128 & c6281pM7635e.f20617i) != 0 || c6281pM7635e.f20625q != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) c6281pM7635e.f20633y.get(c6281pM7635e.f20612d);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            C6744h c6744h2 = this.f23058n;
            if (c6744h2 != null && c6744h2.m7638h()) {
                C6281p c6281pM7635e2 = c6744h2.m7635e();
                C8573n.m10455h(c6281pM7635e2);
                if ((64 & c6281pM7635e2.f20617i) != 0 || c6281pM7635e2.f20625q != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) c6281pM7635e2.f20633y.get(c6281pM7635e2.f20612d);
                if (num2 != null && num2.intValue() < c6281pM7635e2.f20626r.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public final Uri m7914d(C6271k c6271k) {
        C11852a c11852aM7598a;
        C6737a c6737a = this.f23046b.f21338g;
        if ((c6737a == null ? null : c6737a.m7597g()) != null) {
            c11852aM7598a = C6739c.m7598a(c6271k);
        } else {
            List list = c6271k.f20581b;
            c11852aM7598a = (list == null || list.isEmpty()) ? null : (C11852a) c6271k.f20581b.get(0);
        }
        if (c11852aM7598a == null) {
            return null;
        }
        return c11852aM7598a.f37247c;
    }

    /* JADX INFO: renamed from: e */
    public final void m7915e(Bitmap bitmap, int i10) {
        MediaMetadata metadata;
        MediaSessionCompat mediaSessionCompat = this.f23060p;
        if (mediaSessionCompat == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        MediaSessionCompat mediaSessionCompat2 = this.f23060p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (mediaSessionCompat2 != null && (metadata = mediaSessionCompat2.f23666b.f23648a.f23650a.getMetadata()) != null) {
            C18379a<String, Integer> c18379a = MediaMetadataCompat.f23638e;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            MediaMetadataCompat mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.f23643c = metadata;
            mediaMetadataCompat = mediaMetadataCompatCreateFromParcel;
        }
        MediaMetadataCompat.C7375b c7375b = mediaMetadataCompat == null ? new MediaMetadataCompat.C7375b() : new MediaMetadataCompat.C7375b(mediaMetadataCompat);
        String str = i10 == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART";
        C18379a<String, Integer> c18379a2 = MediaMetadataCompat.f23638e;
        if (c18379a2.containsKey(str) && c18379a2.get(str).intValue() != 2) {
            throw new IllegalArgumentException(C0941K.m1458b("The ", str, " key cannot be used to put a Bitmap"));
        }
        Bundle bundle = c7375b.f23645a;
        bundle.putParcelable(str, bitmap);
        mediaSessionCompat.m8233d(new MediaMetadataCompat(bundle));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x016d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0177  */
    /* JADX WARN: Code duplicated, block: B:110:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x017f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0186  */
    /* JADX WARN: Code duplicated, block: B:114:0x018c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0192  */
    /* JADX WARN: Code duplicated, block: B:119:0x019a  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public final void m7916f(PlaybackStateCompat.C7403d c7403d, String str, C6741e c6741e) {
        String str2;
        int i10;
        int iHashCode = str.hashCode();
        Context context = this.f23045a;
        PlaybackStateCompat.CustomAction customAction = null;
        C6743g c6743g = this.f23049e;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.f23063s == null && c6743g != null) {
                        long j10 = c6743g.f22188d;
                        C8362b c8362b = C7029r.f23066a;
                        int i11 = c6743g.f22179C;
                        if (j10 == 10000) {
                            i11 = c6743g.f22180D;
                        } else if (j10 == 30000) {
                            i11 = c6743g.f22181E;
                        }
                        int i12 = c6743g.f22199o;
                        if (j10 == 10000) {
                            i12 = c6743g.f22200p;
                        } else if (j10 == 30000) {
                            i12 = c6743g.f22201q;
                        }
                        String string = context.getResources().getString(i11);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i12 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.f23063s = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i12, null);
                    }
                    customAction = this.f23063s;
                } else if (c6741e != null) {
                    str2 = c6741e.f22174d;
                    i10 = c6741e.f22173c;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    c7403d.f23714a.add(customAction);
                    return;
                }
                return;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.f23064t == null && c6743g != null) {
                        String string2 = context.getResources().getString(c6743g.f22182F);
                        int i13 = c6743g.f22202r;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string2)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.f23064t = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i13, null);
                    }
                    customAction = this.f23064t;
                } else if (c6741e != null) {
                    str2 = c6741e.f22174d;
                    i10 = c6741e.f22173c;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    c7403d.f23714a.add(customAction);
                    return;
                }
                return;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.f23065u == null && c6743g != null) {
                        String string3 = context.getResources().getString(c6743g.f22182F);
                        int i14 = c6743g.f22202r;
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.f23065u = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i14, null);
                    }
                    customAction = this.f23065u;
                } else if (c6741e != null) {
                    str2 = c6741e.f22174d;
                    i10 = c6741e.f22173c;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    c7403d.f23714a.add(customAction);
                    return;
                }
                return;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.f23062r == null && c6743g != null) {
                        long j11 = c6743g.f22188d;
                        C8362b c8362b2 = C7029r.f23066a;
                        int i15 = c6743g.f22210z;
                        if (j11 == 10000) {
                            i15 = c6743g.f22177A;
                        } else if (j11 == 30000) {
                            i15 = c6743g.f22178B;
                        }
                        int i16 = c6743g.f22196l;
                        if (j11 == 10000) {
                            i16 = c6743g.f22197m;
                        } else if (j11 == 30000) {
                            i16 = c6743g.f22198n;
                        }
                        String string4 = context.getResources().getString(i15);
                        if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string4)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i16 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.f23062r = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i16, null);
                    }
                    customAction = this.f23062r;
                } else if (c6741e != null) {
                    str2 = c6741e.f22174d;
                    i10 = c6741e.f22173c;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    c7403d.f23714a.add(customAction);
                    return;
                }
                return;
            default:
                if (c6741e != null) {
                    str2 = c6741e.f22174d;
                    i10 = c6741e.f22173c;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    c7403d.f23714a.add(customAction);
                    return;
                }
                return;
        }
    }

    @RequiresNonNull({"appContext", "handler", "options"})
    /* JADX INFO: renamed from: g */
    public final void m7917g(boolean z10) {
        if (this.f23046b.f21339h) {
            HandlerC8881V handlerC8881V = this.f23055k;
            RunnableC7023l runnableC7023l = this.f23056l;
            if (runnableC7023l != null) {
                handlerC8881V.removeCallbacks(runnableC7023l);
            }
            Context context = this.f23045a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    handlerC8881V.postDelayed(runnableC7023l, 1000L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7918h() {
        C7022k c7022k = this.f23054j;
        if (c7022k != null) {
            f23044v.m10228a("Stopping media notification.", new Object[0]);
            C7013b c7013b = c7022k.f23026j;
            c7013b.m7899b();
            c7013b.f22999e = null;
            NotificationManager notificationManager = c7022k.f23018b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7919i() {
        if (this.f23046b.f21339h) {
            this.f23055k.removeCallbacks(this.f23056l);
            Context context = this.f23045a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7920j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompatM8320a;
        MediaSessionCompat mediaSessionCompat;
        C6271k c6271k;
        MediaMetadata metadata;
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        PendingIntent activity;
        MediaSessionCompat mediaSessionCompat2 = this.f23060p;
        if (mediaSessionCompat2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        PlaybackStateCompat.C7403d c7403d = new PlaybackStateCompat.C7403d();
        C6744h c6744h = this.f23058n;
        if (c6744h == null || this.f23054j == null) {
            playbackStateCompatM8320a = c7403d.m8320a();
        } else {
            long jM7632b = (c6744h.m7647q() == 0 || c6744h.m7640j()) ? 0L : c6744h.m7632b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c7403d.f23715b = i10;
            c7403d.f23716c = jM7632b;
            c7403d.f23719f = jElapsedRealtime;
            c7403d.f23717d = 1.0f;
            if (i10 == 0) {
                playbackStateCompatM8320a = c7403d.m8320a();
            } else {
                C6743g c6743g = this.f23049e;
                InterfaceC6728P interfaceC6728P = c6743g != null ? c6743g.f22183G : null;
                C6744h c6744h2 = this.f23058n;
                long jM7913c = (c6744h2 == null || c6744h2.m7640j() || this.f23058n.m7644n()) ? 0L : 256L;
                if (interfaceC6728P != null) {
                    List<C6741e> listM7921a = C7029r.m7921a(interfaceC6728P);
                    if (listM7921a != null) {
                        for (C6741e c6741e : listM7921a) {
                            String str = c6741e.f22172b;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                jM7913c |= m7913c(str, i10, bundle);
                            } else {
                                m7916f(c7403d, str, c6741e);
                            }
                        }
                    }
                } else {
                    C6743g c6743g2 = this.f23049e;
                    if (c6743g2 != null) {
                        for (String str2 : c6743g2.f22186b) {
                            if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                jM7913c |= m7913c(str2, i10, bundle);
                            } else {
                                m7916f(c7403d, str2, null);
                            }
                        }
                    }
                }
                c7403d.f23718e = jM7913c;
                playbackStateCompatM8320a = c7403d.m8320a();
            }
        }
        MediaSessionCompat.C7393c c7393c = mediaSessionCompat2.f23665a;
        c7393c.f23687f = playbackStateCompatM8320a;
        synchronized (c7393c.f23684c) {
            for (int iBeginBroadcast = c7393c.f23686e.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC7404a) c7393c.f23686e.getBroadcastItem(iBeginBroadcast)).mo8229P0(playbackStateCompatM8320a);
                } catch (RemoteException unused) {
                }
            }
            c7393c.f23686e.finishBroadcast();
        }
        MediaSession mediaSession = c7393c.f23682a;
        if (playbackStateCompatM8320a.f23708m == null) {
            PlaybackState.Builder builderM8297d = PlaybackStateCompat.C7401b.m8297d();
            PlaybackStateCompat.C7401b.m8317x(builderM8297d, playbackStateCompatM8320a.f23697b, playbackStateCompatM8320a.f23698c, playbackStateCompatM8320a.f23700e, playbackStateCompatM8320a.f23704i);
            PlaybackStateCompat.C7401b.m8314u(builderM8297d, playbackStateCompatM8320a.f23699d);
            PlaybackStateCompat.C7401b.m8312s(builderM8297d, playbackStateCompatM8320a.f23701f);
            PlaybackStateCompat.C7401b.m8315v(builderM8297d, playbackStateCompatM8320a.f23703h);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompatM8320a.f23705j) {
                PlaybackState.CustomAction customActionM8295b = customAction.f23713f;
                if (customActionM8295b == null) {
                    PlaybackState.CustomAction.Builder builderM8298e = PlaybackStateCompat.C7401b.m8298e(customAction.f23709b, customAction.f23710c, customAction.f23711d);
                    PlaybackStateCompat.C7401b.m8316w(builderM8298e, customAction.f23712e);
                    customActionM8295b = PlaybackStateCompat.C7401b.m8295b(builderM8298e);
                }
                PlaybackStateCompat.C7401b.m8294a(builderM8297d, customActionM8295b);
            }
            PlaybackStateCompat.C7401b.m8313t(builderM8297d, playbackStateCompatM8320a.f23706k);
            if (Build.VERSION.SDK_INT >= 22) {
                PlaybackStateCompat.C7402c.m8319b(builderM8297d, playbackStateCompatM8320a.f23707l);
            }
            playbackStateCompatM8320a.f23708m = PlaybackStateCompat.C7401b.m8296c(builderM8297d);
        }
        mediaSession.setPlaybackState(playbackStateCompatM8320a.f23708m);
        C6743g c6743g3 = this.f23049e;
        if (c6743g3 != null && c6743g3.f22184H) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        C6743g c6743g4 = this.f23049e;
        if (c6743g4 != null && c6743g4.f22185I) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            mediaSessionCompat2.f23665a.f23682a.setExtras(bundle);
        }
        if (i10 == 0) {
            mediaSessionCompat2.m8233d(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.f23058n != null) {
            if (this.f23050f == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.f23050f);
                activity = PendingIntent.getActivity(this.f23045a, 0, intent, C8867T.f29800a | 134217728);
            }
            if (activity != null) {
                mediaSessionCompat2.f23665a.f23682a.setSessionActivity(activity);
            }
        }
        C6744h c6744h3 = this.f23058n;
        if (c6744h3 == null || (mediaSessionCompat = this.f23060p) == null || mediaInfo == null || (c6271k = mediaInfo.f29175e) == null) {
            return;
        }
        long j10 = c6744h3.m7640j() ? 0L : mediaInfo.f29176f;
        String strM7083a = c6271k.m7083a("com.google.android.gms.cast.metadata.TITLE");
        String strM7083a2 = c6271k.m7083a("com.google.android.gms.cast.metadata.SUBTITLE");
        MediaSessionCompat mediaSessionCompat3 = this.f23060p;
        if (mediaSessionCompat3 == null || (metadata = mediaSessionCompat3.f23666b.f23648a.f23650a.getMetadata()) == null) {
            mediaMetadataCompatCreateFromParcel = null;
        } else {
            C18379a<String, Integer> c18379a = MediaMetadataCompat.f23638e;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.f23643c = metadata;
        }
        MediaMetadataCompat.C7375b c7375b = mediaMetadataCompatCreateFromParcel == null ? new MediaMetadataCompat.C7375b() : new MediaMetadataCompat.C7375b(mediaMetadataCompatCreateFromParcel);
        C18379a<String, Integer> c18379a2 = MediaMetadataCompat.f23638e;
        if (c18379a2.containsKey("android.media.metadata.DURATION") && c18379a2.get("android.media.metadata.DURATION").intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        c7375b.f23645a.putLong("android.media.metadata.DURATION", j10);
        if (strM7083a != null) {
            c7375b.m8201a("android.media.metadata.TITLE", strM7083a);
            c7375b.m8201a("android.media.metadata.DISPLAY_TITLE", strM7083a);
        }
        if (strM7083a2 != null) {
            c7375b.m8201a("android.media.metadata.DISPLAY_SUBTITLE", strM7083a2);
        }
        mediaSessionCompat.m8233d(new MediaMetadataCompat(c7375b.f23645a));
        Uri uriM7914d = m7914d(c6271k);
        if (uriM7914d != null) {
            this.f23052h.m7898a(uriM7914d);
        } else {
            m7915e(null, 0);
        }
        Uri uriM7914d2 = m7914d(c6271k);
        if (uriM7914d2 != null) {
            this.f23053i.m7898a(uriM7914d2);
        } else {
            m7915e(null, 3);
        }
    }
}
