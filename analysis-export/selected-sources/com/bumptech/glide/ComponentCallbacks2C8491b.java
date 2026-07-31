package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p017Ag.C0146d;
import p136H9.C2115a;
import p490b6.InterfaceC8080a;
import p520d6.C10375k;
import p520d6.C10377m;
import p554f6.C11039m;
import p573g6.C11285e;
import p573g6.C11289i;
import p573g6.C11290j;
import p573g6.InterfaceC11282b;
import p573g6.InterfaceC11284d;
import p585h6.C11848f;
import p585h6.C11849g;
import p585h6.C11850h;
import p604i6.ExecutorServiceC12053b;
import p623j$.util.Objects;
import p632j6.C15369A;
import p632j6.C15370a;
import p632j6.C15371b;
import p632j6.C15372c;
import p632j6.C15373d;
import p632j6.C15374e;
import p632j6.C15375f;
import p632j6.C15376g;
import p632j6.C15377h;
import p632j6.C15378i;
import p632j6.C15382m;
import p632j6.C15391v;
import p632j6.C15392w;
import p632j6.C15393x;
import p632j6.C15394y;
import p632j6.C15395z;
import p650k6.C15764a;
import p650k6.C15765b;
import p650k6.C15766c;
import p650k6.C15767d;
import p650k6.C15768e;
import p650k6.C15769f;
import p685m6.C16856a;
import p685m6.C16857b;
import p685m6.C16858c;
import p685m6.C16861f;
import p685m6.C16862g;
import p685m6.C16864i;
import p685m6.C16867l;
import p685m6.C16872q;
import p685m6.C16874s;
import p685m6.C16875t;
import p685m6.C16877v;
import p685m6.C16878w;
import p698n6.C17114a;
import p711o6.C17299d;
import p711o6.C17300e;
import p731p6.C17550a;
import p745q6.C17717a;
import p745q6.C17719c;
import p745q6.C17720d;
import p745q6.C17724h;
import p745q6.C17726j;
import p762r6.C17850a;
import p762r6.C17851b;
import p762r6.C17852c;
import p780s6.C18077e;
import p780s6.C18083k;
import p792t6.C18281d;
import p792t6.InterfaceC18279b;
import p799u.C18379a;
import p806u6.C18491b;
import p888z6.C20751k;

/* JADX INFO: renamed from: com.bumptech.glide.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C8491b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: j */
    public static volatile ComponentCallbacks2C8491b f29055j;

    /* JADX INFO: renamed from: k */
    public static volatile boolean f29056k;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11284d f29057b;

    /* JADX INFO: renamed from: c */
    public final C11849g f29058c;

    /* JADX INFO: renamed from: d */
    public final C8493d f29059d;

    /* JADX INFO: renamed from: e */
    public final C8495f f29060e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC11282b f29061f;

    /* JADX INFO: renamed from: g */
    public final C18083k f29062g;

    /* JADX INFO: renamed from: h */
    public final C18077e f29063h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f29064i = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.b$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public interface a {
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x032c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ComponentCallbacks2C8491b(Context context, C11039m c11039m, C11849g c11849g, InterfaceC11284d interfaceC11284d, InterfaceC11282b interfaceC11282b, C18083k c18083k, C18077e c18077e, int i10, a aVar, Map map, List list) throws Throwable {
        this.f29057b = interfaceC11284d;
        this.f29061f = interfaceC11282b;
        this.f29058c = c11849g;
        this.f29062g = c18083k;
        this.f29063h = c18077e;
        Resources resources = context.getResources();
        C8495f c8495f = new C8495f();
        this.f29060e = c8495f;
        C16862g c16862g = new C16862g();
        C18491b c18491b = c8495f.f29083g;
        synchronized (c18491b) {
            try {
                c18491b.f57748a.add(c16862g);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    throw th;
                }
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            c8495f.m10368h(new C16867l());
        }
        ArrayList arrayListM10366f = c8495f.m10366f();
        C17717a c17717a = new C17717a(context, arrayListM10366f, interfaceC11284d, interfaceC11282b);
        C16878w c16878w = new C16878w(interfaceC11284d, new C16878w.g());
        C16864i c16864i = new C16864i(c8495f.m10366f(), resources.getDisplayMetrics(), interfaceC11284d, interfaceC11282b);
        C16861f c16861f = new C16861f(c16864i);
        C16875t c16875t = new C16875t(c16864i, interfaceC11282b);
        C17299d c17299d = new C17299d(context);
        C15391v.c cVar = new C15391v.c(resources);
        C15391v.d dVar = new C15391v.d(resources);
        C15391v.b bVar = new C15391v.b(resources);
        C15391v.a aVar2 = new C15391v.a(resources);
        C16858c c16858c = new C16858c(interfaceC11282b);
        C17850a c17850a = new C17850a();
        C2115a c2115a = new C2115a();
        ContentResolver contentResolver = context.getContentResolver();
        c8495f.m10361a(ByteBuffer.class, new C15372c());
        c8495f.m10361a(InputStream.class, new C15392w(interfaceC11282b));
        c8495f.m10364d("Bitmap", ByteBuffer.class, Bitmap.class, c16861f);
        c8495f.m10364d("Bitmap", InputStream.class, Bitmap.class, c16875t);
        c8495f.m10364d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C16872q(c16864i));
        c8495f.m10364d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c16878w);
        c8495f.m10364d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C16878w(interfaceC11284d, new C16878w.c()));
        C15394y.a<?> aVar3 = C15394y.a.f50035a;
        c8495f.m10363c(Bitmap.class, Bitmap.class, aVar3);
        c8495f.m10364d("Bitmap", Bitmap.class, Bitmap.class, new C16877v());
        c8495f.m10362b(Bitmap.class, c16858c);
        c8495f.m10364d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C16856a(resources, c16861f));
        c8495f.m10364d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C16856a(resources, c16875t));
        c8495f.m10364d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C16856a(resources, c16878w));
        c8495f.m10362b(BitmapDrawable.class, new C16857b(interfaceC11284d, c16858c));
        c8495f.m10364d("Gif", InputStream.class, C17719c.class, new C17726j(arrayListM10366f, c17717a, interfaceC11282b));
        c8495f.m10364d("Gif", ByteBuffer.class, C17719c.class, c17717a);
        c8495f.m10362b(C17719c.class, new C17720d());
        c8495f.m10363c(InterfaceC8080a.class, InterfaceC8080a.class, aVar3);
        c8495f.m10364d("Bitmap", InterfaceC8080a.class, Bitmap.class, new C17724h(interfaceC11284d));
        c8495f.m10364d("legacy_append", Uri.class, Drawable.class, c17299d);
        c8495f.m10364d("legacy_append", Uri.class, Bitmap.class, new C16874s(c17299d, interfaceC11284d));
        c8495f.m10369i(new C17114a.a());
        c8495f.m10363c(File.class, ByteBuffer.class, new C15373d.b());
        c8495f.m10363c(File.class, InputStream.class, new C15375f.e(new C15377h()));
        c8495f.m10364d("legacy_append", File.class, File.class, new C17550a());
        c8495f.m10363c(File.class, ParcelFileDescriptor.class, new C15375f.b(new C15376g()));
        c8495f.m10363c(File.class, File.class, aVar3);
        c8495f.m10369i(new C10375k.a(interfaceC11282b));
        c8495f.m10369i(new C10377m.a());
        Class cls = Integer.TYPE;
        c8495f.m10363c(cls, InputStream.class, cVar);
        c8495f.m10363c(cls, ParcelFileDescriptor.class, bVar);
        c8495f.m10363c(Integer.class, InputStream.class, cVar);
        c8495f.m10363c(Integer.class, ParcelFileDescriptor.class, bVar);
        c8495f.m10363c(Integer.class, Uri.class, dVar);
        c8495f.m10363c(cls, AssetFileDescriptor.class, aVar2);
        c8495f.m10363c(Integer.class, AssetFileDescriptor.class, aVar2);
        c8495f.m10363c(cls, Uri.class, dVar);
        c8495f.m10363c(String.class, InputStream.class, new C15374e.b());
        c8495f.m10363c(Uri.class, InputStream.class, new C15374e.b());
        c8495f.m10363c(String.class, InputStream.class, new C15393x.c());
        c8495f.m10363c(String.class, ParcelFileDescriptor.class, new C15393x.b());
        c8495f.m10363c(String.class, AssetFileDescriptor.class, new C15393x.a());
        c8495f.m10363c(Uri.class, InputStream.class, new C15765b.a());
        c8495f.m10363c(Uri.class, InputStream.class, new C15370a.c(context.getAssets()));
        c8495f.m10363c(Uri.class, ParcelFileDescriptor.class, new C15370a.b(context.getAssets()));
        c8495f.m10363c(Uri.class, InputStream.class, new C15766c.a(context));
        c8495f.m10363c(Uri.class, InputStream.class, new C15767d.a(context));
        if (i11 >= 29) {
            c8495f.m10363c(Uri.class, InputStream.class, new C15768e.c(context, InputStream.class));
            c8495f.m10363c(Uri.class, ParcelFileDescriptor.class, new C15768e.b(context, ParcelFileDescriptor.class));
        }
        c8495f.m10363c(Uri.class, InputStream.class, new C15395z.d(contentResolver));
        c8495f.m10363c(Uri.class, ParcelFileDescriptor.class, new C15395z.b(contentResolver));
        c8495f.m10363c(Uri.class, AssetFileDescriptor.class, new C15395z.a(contentResolver));
        c8495f.m10363c(Uri.class, InputStream.class, new C15369A.a());
        c8495f.m10363c(URL.class, InputStream.class, new C15769f.a());
        c8495f.m10363c(Uri.class, File.class, new C15382m.a(context));
        c8495f.m10363c(C15378i.class, InputStream.class, new C15764a.a());
        c8495f.m10363c(byte[].class, ByteBuffer.class, new C15371b.a());
        c8495f.m10363c(byte[].class, InputStream.class, new C15371b.d());
        c8495f.m10363c(Uri.class, Uri.class, aVar3);
        c8495f.m10363c(Drawable.class, Drawable.class, aVar3);
        c8495f.m10364d("legacy_append", Drawable.class, Drawable.class, new C17300e());
        c8495f.m10370j(Bitmap.class, BitmapDrawable.class, new C17851b(resources));
        c8495f.m10370j(Bitmap.class, byte[].class, c17850a);
        c8495f.m10370j(Drawable.class, byte[].class, new C17852c(interfaceC11284d, c17850a, c2115a));
        c8495f.m10370j(C17719c.class, byte[].class, c2115a);
        if (i11 >= 23) {
            C16878w c16878w2 = new C16878w(interfaceC11284d, new C16878w.d());
            c8495f.m10364d("legacy_append", ByteBuffer.class, Bitmap.class, c16878w2);
            c8495f.m10364d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C16856a(resources, c16878w2));
        }
        this.f29059d = new C8493d(context, interfaceC11282b, c8495f, aVar, map, list, c11039m, i10);
    }

    /* JADX INFO: renamed from: a */
    public static void m10357a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f29056k) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f29056k = true;
        C18379a c18379a = new C18379a();
        C8492c c8492c = new C8492c();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        ArrayList<InterfaceC18279b> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(C18281d.m20584a(str));
                    }
                }
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.m10356a().isEmpty()) {
                Set<Class<?>> setM10356a = generatedAppGlideModule.m10356a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC18279b interfaceC18279b = (InterfaceC18279b) it.next();
                    if (setM10356a.contains(interfaceC18279b.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            interfaceC18279b.toString();
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC18279b) it2.next()).getClass().toString();
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC18279b) it3.next()).m20583b();
            }
            if (ExecutorServiceC12053b.f37871d == 0) {
                ExecutorServiceC12053b.f37871d = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i10 = ExecutorServiceC12053b.f37871d;
            if (TextUtils.isEmpty(AdRevenueConstants.SOURCE_KEY)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            ExecutorServiceC12053b executorServiceC12053b = new ExecutorServiceC12053b(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC12053b.a(AdRevenueConstants.SOURCE_KEY, false)));
            int i11 = ExecutorServiceC12053b.f37871d;
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            ExecutorServiceC12053b executorServiceC12053b2 = new ExecutorServiceC12053b(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC12053b.a("disk-cache", true)));
            if (ExecutorServiceC12053b.f37871d == 0) {
                ExecutorServiceC12053b.f37871d = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i12 = ExecutorServiceC12053b.f37871d >= 4 ? 2 : 1;
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            ExecutorServiceC12053b executorServiceC12053b3 = new ExecutorServiceC12053b(new ThreadPoolExecutor(i12, i12, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC12053b.a("animation", true)));
            C11850h c11850h = new C11850h(new C11850h.a(applicationContext));
            C18077e c18077e = new C18077e();
            int i13 = c11850h.f37233a;
            InterfaceC11284d c11290j = i13 > 0 ? new C11290j(i13) : new C11285e();
            C11289i c11289i = new C11289i(c11850h.f37235c);
            C11849g c11849g = new C11849g(c11850h.f37234b);
            ComponentCallbacks2C8491b componentCallbacks2C8491b = new ComponentCallbacks2C8491b(applicationContext, new C11039m(c11849g, new C11848f(new C0146d(applicationContext)), executorServiceC12053b2, executorServiceC12053b, new ExecutorServiceC12053b(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC12053b.f37870c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ExecutorServiceC12053b.a("source-unlimited", false))), executorServiceC12053b3), c11849g, c11290j, c11289i, new C18083k(), c18077e, 4, c8492c, c18379a, Collections.EMPTY_LIST);
            for (InterfaceC18279b interfaceC18279b2 : arrayList) {
                try {
                    interfaceC18279b2.m20582a();
                } catch (AbstractMethodError e10) {
                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(interfaceC18279b2.getClass().getName()), e10);
                }
            }
            applicationContext.registerComponentCallbacks(componentCallbacks2C8491b);
            f29055j = componentCallbacks2C8491b;
            f29056k = false;
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ComponentCallbacks2C8491b m10358b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f29055j == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (ComponentCallbacks2C8491b.class) {
                try {
                    if (f29055j == null) {
                        m10357a(context, generatedAppGlideModule);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29055j;
    }

    /* JADX INFO: renamed from: c */
    public final void m10359c(ComponentCallbacks2C8497h componentCallbacks2C8497h) {
        synchronized (this.f29064i) {
            try {
                if (this.f29064i.contains(componentCallbacks2C8497h)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f29064i.add(componentCallbacks2C8497h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10360d(ComponentCallbacks2C8497h componentCallbacks2C8497h) {
        synchronized (this.f29064i) {
            try {
                if (!this.f29064i.contains(componentCallbacks2C8497h)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f29064i.remove(componentCallbacks2C8497h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        char[] cArr = C20751k.f71350a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        this.f29058c.m25371e(0L);
        this.f29057b.mo13319b();
        this.f29061f.mo13314b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j10;
        char[] cArr = C20751k.f71350a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        Iterator it = this.f29064i.iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C8497h) it.next()).getClass();
        }
        C11849g c11849g = this.f29058c;
        c11849g.getClass();
        if (i10 >= 40) {
            c11849g.m25371e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (c11849g) {
                j10 = c11849g.f71344b;
            }
            c11849g.m25371e(j10 / 2);
        }
        this.f29057b.mo13318a(i10);
        this.f29061f.mo13313a(i10);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
