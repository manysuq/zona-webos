package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import p454Z3.C6697b;
import p454Z3.C6705j;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public final class C7841b {

    /* JADX INFO: renamed from: a */
    public final Executor f26826a;

    /* JADX INFO: renamed from: b */
    public final C7842c.c f26827b;

    /* JADX INFO: renamed from: c */
    public final byte[] f26828c;

    /* JADX INFO: renamed from: d */
    public final File f26829d;

    /* JADX INFO: renamed from: e */
    public final String f26830e;

    /* JADX INFO: renamed from: f */
    public boolean f26831f = false;

    /* JADX INFO: renamed from: g */
    public C6697b[] f26832g;

    /* JADX INFO: renamed from: h */
    public byte[] f26833h;

    public C7841b(AssetManager assetManager, Executor executor, C7842c.c cVar, String str, File file) {
        this.f26826a = executor;
        this.f26827b = cVar;
        this.f26830e = str;
        this.f26829d = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24) {
            if (i10 < 31) {
                switch (i10) {
                    case 24:
                    case 25:
                        bArr = C6705j.f22106e;
                        break;
                    case 26:
                        bArr = C6705j.f22105d;
                        break;
                    case 27:
                        bArr = C6705j.f22104c;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = C6705j.f22103b;
                        break;
                }
            } else {
                bArr = C6705j.f22102a;
            }
        }
        this.f26828c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m9664a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9665b(final int i10, final Serializable serializable) {
        this.f26826a.execute(new Runnable() { // from class: Z3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f22085b.f26827b.mo9660a(i10, serializable);
            }
        });
    }
}
