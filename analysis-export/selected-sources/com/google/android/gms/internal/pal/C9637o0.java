package com.google.android.gms.internal.pal;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.pal.o0 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class C9637o0 extends IOException {
    /* JADX INFO: renamed from: a */
    public static C9624n0 m11920a() {
        return new C9624n0("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: b */
    public static C9637o0 m11921b() {
        return new C9637o0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: c */
    public static C9637o0 m11922c() {
        return new C9637o0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: d */
    public static C9637o0 m11923d() {
        return new C9637o0("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: e */
    public static C9637o0 m11924e() {
        return new C9637o0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
