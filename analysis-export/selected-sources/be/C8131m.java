package be;

import android.os.Build;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p107Fg.C1634b;
import p146I1.C2196b;
import p164J1.C2445a;
import ru.zona.app.android.MainActivity;

/* JADX INFO: renamed from: be.m */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStoragePermissionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoragePermissionManager.kt\nru/zona/app/permission/StoragePermissionManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,64:1\n14063#2,2:65\n*S KotlinDebug\n*F\n+ 1 StoragePermissionManager.kt\nru/zona/app/permission/StoragePermissionManager\n*L\n46#1:65,2\n*E\n"})
public final class C8131m implements InterfaceC8120b {

    /* JADX INFO: renamed from: d */
    public static final C1634b f28056d;

    /* JADX INFO: renamed from: a */
    public final MainActivity f28057a;

    /* JADX INFO: renamed from: b */
    public final C8129k f28058b;

    /* JADX INFO: renamed from: c */
    public final C8129k f28059c;

    static {
        Reflection.getOrCreateKotlinClass(C8131m.class).getSimpleName();
        f28056d = new C1634b();
    }

    public C8131m(MainActivity mainActivity) {
        this.f28057a = mainActivity;
        C8129k c8129k = new C8129k();
        this.f28058b = c8129k;
        this.f28059c = c8129k;
    }

    @Override // be.InterfaceC8120b
    /* JADX INFO: renamed from: a */
    public final void mo10109a(int i10) {
        if (i10 == 5) {
            boolean z10 = false;
            for (String str : Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}) {
                if (C2445a.m3153a(this.f28057a, str) != 0) {
                    C8129k.m10116b(this.f28058b, z10);
                }
            }
            z10 = true;
            C8129k.m10116b(this.f28058b, z10);
        }
    }

    @Override // be.InterfaceC8123e
    /* JADX INFO: renamed from: b */
    public final void mo10112b() {
        boolean z10 = false;
        for (String str : Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}) {
            if (C2445a.m3153a(this.f28057a, str) != 0) {
                this.f28058b.m10117a(0L, z10);
            }
        }
        z10 = true;
        this.f28058b.m10117a(0L, z10);
    }

    @Override // be.InterfaceC8121c
    /* JADX INFO: renamed from: c */
    public final C8129k mo10110c() {
        return this.f28059c;
    }

    @Override // be.InterfaceC8123e
    /* JADX INFO: renamed from: d */
    public final void mo10113d() {
        try {
            C2196b.m2848d(5, this.f28057a, Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        } catch (Exception unused) {
            f28056d.getClass();
        }
    }
}
