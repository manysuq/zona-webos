package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.C */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public class C7616C extends IOException {

    /* JADX INFO: renamed from: b */
    public boolean f25315b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.C$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static class a extends C7616C {
    }

    /* JADX INFO: renamed from: a */
    public static C7616C m8792a() {
        return new C7616C("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static a m8793b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: c */
    public static C7616C m8794c() {
        return new C7616C("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static C7616C m8795d() {
        return new C7616C("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static C7616C m8796e() {
        return new C7616C("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
