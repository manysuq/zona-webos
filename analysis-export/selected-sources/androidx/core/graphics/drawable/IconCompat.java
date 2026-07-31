package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import p623j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f25264k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f25265a;

    /* JADX INFO: renamed from: b */
    public Object f25266b;

    /* JADX INFO: renamed from: c */
    public byte[] f25267c;

    /* JADX INFO: renamed from: d */
    public Parcelable f25268d;

    /* JADX INFO: renamed from: e */
    public int f25269e;

    /* JADX INFO: renamed from: f */
    public int f25270f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f25271g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f25272h;

    /* JADX INFO: renamed from: i */
    public String f25273i;

    /* JADX INFO: renamed from: j */
    public String f25274j;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class C7605a {
        /* JADX INFO: renamed from: a */
        public static Icon m8756a(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            String strM8759b;
            int i10;
            InputStream inputStreamOpenInputStream;
            switch (iconCompat.f25265a) {
                case -1:
                    return (Icon) iconCompat.f25266b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f25266b);
                    break;
                case 2:
                    int i11 = iconCompat.f25265a;
                    if (i11 == -1 && (i10 = Build.VERSION.SDK_INT) >= 23) {
                        Object obj = iconCompat.f25266b;
                        if (i10 >= 28) {
                            strM8759b = C7607c.m8759b(obj);
                        } else {
                            try {
                                strM8759b = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                                strM8759b = null;
                            }
                        }
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("called getResPackage() on " + iconCompat);
                        }
                        String str = iconCompat.f25274j;
                        strM8759b = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f25266b).split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0] : iconCompat.f25274j;
                    }
                    iconCreateWithBitmap = Icon.createWithResource(strM8759b, iconCompat.f25269e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f25266b, iconCompat.f25269e, iconCompat.f25270f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f25266b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.m8749a((Bitmap) iconCompat.f25266b, false)) : C7606b.m8757a((Bitmap) iconCompat.f25266b);
                    break;
                case 6:
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 30) {
                        iconCreateWithBitmap = C7608d.m8762a(iconCompat.m8754f());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m8754f());
                        }
                        Uri uriM8754f = iconCompat.m8754f();
                        String scheme = uriM8754f.getScheme();
                        if ("content".equals(scheme) || "file".equals(scheme)) {
                            try {
                                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM8754f);
                            } catch (Exception unused2) {
                                uriM8754f.toString();
                                inputStreamOpenInputStream = null;
                            }
                        } else {
                            try {
                                inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f25266b));
                            } catch (FileNotFoundException unused3) {
                                uriM8754f.toString();
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m8754f());
                        }
                        if (i12 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m8749a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                        } else {
                            iconCreateWithBitmap = C7606b.m8757a(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f25271g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f25272h;
            if (mode != IconCompat.f25264k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class C7606b {
        /* JADX INFO: renamed from: a */
        public static Icon m8757a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class C7607c {
        /* JADX INFO: renamed from: a */
        public static int m8758a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* JADX INFO: renamed from: b */
        public static String m8759b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* JADX INFO: renamed from: c */
        public static int m8760c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* JADX INFO: renamed from: d */
        public static Uri m8761d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class C7608d {
        /* JADX INFO: renamed from: a */
        public static Icon m8762a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f25265a = -1;
        this.f25267c = null;
        this.f25268d = null;
        this.f25269e = 0;
        this.f25270f = 0;
        this.f25271g = null;
        this.f25272h = f25264k;
        this.f25273i = null;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m8749a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m8750b(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f25269e = i10;
        if (resources != null) {
            try {
                iconCompat.f25266b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f25266b = str;
        }
        iconCompat.f25274j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m8751c() {
        int i10 = this.f25265a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f25266b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f25266b;
        }
        if (i10 == 5) {
            return m8749a((Bitmap) this.f25266b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* JADX INFO: renamed from: d */
    public final int m8752d() {
        int i10;
        int i11 = this.f25265a;
        if (i11 != -1 || (i10 = Build.VERSION.SDK_INT) < 23) {
            if (i11 == 2) {
                return this.f25269e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f25266b;
        if (i10 >= 28) {
            return C7607c.m8758a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m8753e() {
        int i10;
        int i11 = this.f25265a;
        if (i11 != -1 || (i10 = Build.VERSION.SDK_INT) < 23) {
            return i11;
        }
        Object obj = this.f25266b;
        if (i10 >= 28) {
            return C7607c.m8760c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Uri m8754f() {
        int i10;
        int i11 = this.f25265a;
        if (i11 == -1 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Object obj = this.f25266b;
            if (i10 >= 28) {
                return C7607c.m8761d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i11 == 4 || i11 == 6) {
            return Uri.parse((String) this.f25266b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX INFO: renamed from: g */
    public final Icon m8755g(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C7605a.m8756a(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f25265a == -1) {
            return String.valueOf(this.f25266b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f25265a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f25265a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f25266b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f25266b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f25274j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m8752d())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f25269e);
                if (this.f25270f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f25270f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f25266b);
                break;
        }
        if (this.f25271g != null) {
            sb2.append(" tint=");
            sb2.append(this.f25271g);
        }
        if (this.f25272h != f25264k) {
            sb2.append(" mode=");
            sb2.append(this.f25272h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f25267c = null;
        this.f25268d = null;
        this.f25269e = 0;
        this.f25270f = 0;
        this.f25271g = null;
        this.f25272h = f25264k;
        this.f25273i = null;
        this.f25265a = i10;
    }
}
