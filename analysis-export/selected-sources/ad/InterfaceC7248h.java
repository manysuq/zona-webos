package ad;

import android.support.v4.media.session.C7408e;
import bd.C8117a;
import cd.C8432c;
import ee.C10860b;
import gd.C11377b;
import id.C12975b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import md.C17011e;
import mobi.zona.data.model.Ads;
import mobi.zona.data.model.Ads$$serializer;
import p016Af.EnumC0137f;
import p053Cg.C0792d;
import p054D.C0900s;
import p055D0.C0941K;
import p069De.C1162h;
import p086Ed.C1373W0;
import p086Ed.InterfaceC1382b;
import p091F0.AbstractC1467g;
import p125Gg.EnumC1896d;
import p142Hf.C2182j;
import p176Jd.C2574a;
import p194Kd.InterfaceC2991i;
import p230Md.C3550d;
import p248Nd.C3738t;
import p269Og.C3986c;
import p302Qd.C4592i;
import p338Sd.C4904d;
import p392Vd.EnumC5674e;
import p527dd.C10471e;
import p544ed.C10857c;
import p561fd.C11130g;
import p561fd.C11136m;
import p592hd.C11877a;
import p639jd.C15438j;
import p703nd.C17134B;
import p718od.C17349b;
import p770rf.InterfaceC17978p;
import p800u0.C18449y;
import p812ud.C18523e;
import p827vd.C18749g;
import p840wa.C18973a;
import p843wd.InterfaceC19010X;
import p857xa.InterfaceC19639f;
import p875ya.InterfaceC19796b;
import p875ya.InterfaceC19797c;
import p875ya.InterfaceC19798d;
import p875ya.InterfaceC19799e;
import va.C18739x;
import va.InterfaceC18718c;
import va.InterfaceC18729n;
import za.C20807B0;
import za.C20813E0;
import za.C20838R0;
import za.C20877h0;
import za.C20915z0;
import za.InterfaceC20826L;

/* JADX INFO: renamed from: ad.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7248h {

    /* JADX INFO: renamed from: ad.h$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static abstract class a {

        /* JADX INFO: renamed from: ad.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class C21116a extends a {

            /* JADX INFO: renamed from: a */
            public final C10860b f23390a;

            public C21116a(C10860b c10860b) {
                this.f23390a = c10860b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C21116a) && Intrinsics.areEqual(this.f23390a, ((C21116a) obj).f23390a);
            }

            public final int hashCode() {
                return this.f23390a.hashCode();
            }

            public final String toString() {
                return "AuthRoot(component=" + this.f23390a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public final C8117a f23391a;

            public b(C8117a c8117a) {
                this.f23391a = c8117a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f23391a, ((b) obj).f23391a);
            }

            public final int hashCode() {
                return this.f23391a.hashCode();
            }

            public final String toString() {
                return "Catalog(component=" + this.f23391a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$c */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public final C17349b f23392a;

            public c(C17349b c17349b) {
                this.f23392a = c17349b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f23392a, ((c) obj).f23392a);
            }

            public final int hashCode() {
                return this.f23392a.hashCode();
            }

            public final String toString() {
                return "ChannelFilter(component=" + this.f23392a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$d */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class d extends a {

            /* JADX INFO: renamed from: a */
            public final C8432c f23393a;

            public d(C8432c c8432c) {
                this.f23393a = c8432c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f23393a, ((d) obj).f23393a);
            }

            public final int hashCode() {
                return this.f23393a.hashCode();
            }

            public final String toString() {
                return "Collection(component=" + this.f23393a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$e */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class e extends a {

            /* JADX INFO: renamed from: a */
            public final C11130g f23394a;

            public e(C11130g c11130g) {
                this.f23394a = c11130g;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f23394a, ((e) obj).f23394a);
            }

            public final int hashCode() {
                return this.f23394a.hashCode();
            }

            public final String toString() {
                return "ContentPage(component=" + this.f23394a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$f */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class f extends a {

            /* JADX INFO: renamed from: a */
            public final C11377b f23395a;

            public f(C11377b c11377b) {
                this.f23395a = c11377b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && Intrinsics.areEqual(this.f23395a, ((f) obj).f23395a);
            }

            public final int hashCode() {
                return this.f23395a.hashCode();
            }

            public final String toString() {
                return "DescriptionContentPage(component=" + this.f23395a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$g */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class g extends a {

            /* JADX INFO: renamed from: a */
            public final C11877a f23396a;

            public g(C11877a c11877a) {
                this.f23396a = c11877a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.areEqual(this.f23396a, ((g) obj).f23396a);
            }

            public final int hashCode() {
                return this.f23396a.hashCode();
            }

            public final String toString() {
                return "EpisodesPage(component=" + this.f23396a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$h */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class h extends a {

            /* JADX INFO: renamed from: a */
            public final C17011e f23397a;

            public h(C17011e c17011e) {
                this.f23397a = c17011e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && Intrinsics.areEqual(this.f23397a, ((h) obj).f23397a);
            }

            public final int hashCode() {
                return this.f23397a.hashCode();
            }

            public final String toString() {
                return "FilmographyPage(component=" + this.f23397a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$i */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class i extends a {

            /* JADX INFO: renamed from: a */
            public final C18523e f23398a;

            public i(C18523e c18523e) {
                this.f23398a = c18523e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && Intrinsics.areEqual(this.f23398a, ((i) obj).f23398a);
            }

            public final int hashCode() {
                return this.f23398a.hashCode();
            }

            public final String toString() {
                return "Main(component=" + this.f23398a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$j */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class j extends a {

            /* JADX INFO: renamed from: a */
            public final C17134B f23399a;

            public j(C17134B c17134b) {
                this.f23399a = c17134b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && Intrinsics.areEqual(this.f23399a, ((j) obj).f23399a);
            }

            public final int hashCode() {
                return this.f23399a.hashCode();
            }

            public final String toString() {
                return "MovieFilter(component=" + this.f23399a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$k */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class k extends a {

            /* JADX INFO: renamed from: a */
            public final C18749g f23400a;

            public k(C18749g c18749g) {
                this.f23400a = c18749g;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && Intrinsics.areEqual(this.f23400a, ((k) obj).f23400a);
            }

            public final int hashCode() {
                return this.f23400a.hashCode();
            }

            public final String toString() {
                return "My(component=" + this.f23400a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$l */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class l extends a {

            /* JADX INFO: renamed from: a */
            public final InterfaceC19010X f23401a;

            public l(InterfaceC19010X interfaceC19010X) {
                this.f23401a = interfaceC19010X;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && Intrinsics.areEqual(this.f23401a, ((l) obj).f23401a);
            }

            public final int hashCode() {
                return this.f23401a.hashCode();
            }

            public final String toString() {
                return "Player(component=" + this.f23401a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$m */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class m extends a {

            /* JADX INFO: renamed from: a */
            public final C1373W0 f23402a;

            public m(C1373W0 c1373w0) {
                this.f23402a = c1373w0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && Intrinsics.areEqual(this.f23402a, ((m) obj).f23402a);
            }

            public final int hashCode() {
                return this.f23402a.hashCode();
            }

            public final String toString() {
                return "Profile(component=" + this.f23402a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$n */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class n extends a {

            /* JADX INFO: renamed from: a */
            public final C11136m f23403a;

            public n(C11136m c11136m) {
                this.f23403a = c11136m;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && Intrinsics.areEqual(this.f23403a, ((n) obj).f23403a);
            }

            public final int hashCode() {
                return this.f23403a.hashCode();
            }

            public final String toString() {
                return "PromoDetails(component=" + this.f23403a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$o */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class o extends a {

            /* JADX INFO: renamed from: a */
            public final C3550d f23404a;

            public o(C3550d c3550d) {
                this.f23404a = c3550d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && Intrinsics.areEqual(this.f23404a, ((o) obj).f23404a);
            }

            public final int hashCode() {
                return this.f23404a.hashCode();
            }

            public final String toString() {
                return "Report(component=" + this.f23404a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$p */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class p extends a {

            /* JADX INFO: renamed from: a */
            public final C3738t f23405a;

            public p(C3738t c3738t) {
                this.f23405a = c3738t;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && Intrinsics.areEqual(this.f23405a, ((p) obj).f23405a);
            }

            public final int hashCode() {
                return this.f23405a.hashCode();
            }

            public final String toString() {
                return "Search(component=" + this.f23405a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$q */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class q extends a {

            /* JADX INFO: renamed from: a */
            public final C17134B f23406a;

            public q(C17134B c17134b) {
                this.f23406a = c17134b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q) && Intrinsics.areEqual(this.f23406a, ((q) obj).f23406a);
            }

            public final int hashCode() {
                return this.f23406a.hashCode();
            }

            public final String toString() {
                return "SerialFilter(component=" + this.f23406a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$r */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class r extends a {

            /* JADX INFO: renamed from: a */
            public final C12975b f23407a;

            public r(C12975b c12975b) {
                this.f23407a = c12975b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r) && Intrinsics.areEqual(this.f23407a, ((r) obj).f23407a);
            }

            public final int hashCode() {
                return this.f23407a.hashCode();
            }

            public final String toString() {
                return "SportBroadcast(component=" + this.f23407a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$s */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class s extends a {

            /* JADX INFO: renamed from: a */
            public final C2574a f23408a;

            public s(C2574a c2574a) {
                this.f23408a = c2574a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof s) && Intrinsics.areEqual(this.f23408a, ((s) obj).f23408a);
            }

            public final int hashCode() {
                return this.f23408a.hashCode();
            }

            public final String toString() {
                return "TelegramQrCode(component=" + this.f23408a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$t */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class t extends a {

            /* JADX INFO: renamed from: a */
            public final C4592i f23409a;

            public t(C4592i c4592i) {
                this.f23409a = c4592i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && Intrinsics.areEqual(this.f23409a, ((t) obj).f23409a);
            }

            public final int hashCode() {
                return this.f23409a.hashCode();
            }

            public final String toString() {
                return "TvChannels(component=" + this.f23409a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$u */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class u extends a {

            /* JADX INFO: renamed from: a */
            public final C10471e f23410a;

            public u(C10471e c10471e) {
                this.f23410a = c10471e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && Intrinsics.areEqual(this.f23410a, ((u) obj).f23410a);
            }

            public final int hashCode() {
                return this.f23410a.hashCode();
            }

            public final String toString() {
                return "UserCollection(component=" + this.f23410a + ")";
            }
        }

        /* JADX INFO: renamed from: ad.h$a$v */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class v extends a {

            /* JADX INFO: renamed from: a */
            public final C10857c f23411a;

            public v(C10857c c10857c) {
                this.f23411a = c10857c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof v) && Intrinsics.areEqual(this.f23411a, ((v) obj).f23411a);
            }

            public final int hashCode() {
                return this.f23411a.hashCode();
            }

            public final String toString() {
                return "UserCollectionEditor(component=" + this.f23411a + ")";
            }
        }
    }

    /* JADX INFO: renamed from: ad.h$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @InterfaceC18729n
    public static abstract class b {
        public static final d Companion = new d();

        /* JADX INFO: renamed from: a */
        public static final Lazy<InterfaceC18718c<Object>> f23412a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7251i(0));

        /* JADX INFO: renamed from: ad.h$b$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class a extends b {
            public static final a INSTANCE = new a();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23413b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7254j(0));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1829135766;
            }

            public final InterfaceC18718c<a> serializer() {
                return (InterfaceC18718c) f23413b.getValue();
            }

            public final String toString() {
                return "AuthRoot";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class C21117b extends b {
            public static final C21117b INSTANCE = new C21117b();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23414b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7257k());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C21117b);
            }

            public final int hashCode() {
                return 1192338075;
            }

            public final InterfaceC18718c<C21117b> serializer() {
                return (InterfaceC18718c) f23414b.getValue();
            }

            public final String toString() {
                return "ChannelFilter";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$d */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        public static final class d {
            public final InterfaceC18718c<b> serializer() {
                return (InterfaceC18718c) b.f23412a.getValue();
            }
        }

        /* JADX INFO: renamed from: ad.h$b$i */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class i extends b {
            public static final i INSTANCE = new i();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23428b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7260l());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -1349336711;
            }

            public final InterfaceC18718c<i> serializer() {
                return (InterfaceC18718c) f23428b.getValue();
            }

            public final String toString() {
                return "Main";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$j */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class j extends b {
            public static final j INSTANCE = new j();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23429b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7263m());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return 483090184;
            }

            public final InterfaceC18718c<j> serializer() {
                return (InterfaceC18718c) f23429b.getValue();
            }

            public final String toString() {
                return "MovieFilter";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$k */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class k extends b {
            public static final k INSTANCE = new k();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23430b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7266n());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 380859139;
            }

            public final InterfaceC18718c<k> serializer() {
                return (InterfaceC18718c) f23430b.getValue();
            }

            public final String toString() {
                return "Movies";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$l */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class l extends b {
            public static final l INSTANCE = new l();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23431b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7269o());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return 664516972;
            }

            public final InterfaceC18718c<l> serializer() {
                return (InterfaceC18718c) f23431b.getValue();
            }

            public final String toString() {
                return "My";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$q */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class q extends b {
            public static final q INSTANCE = new q();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23443b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7275q());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return 542781800;
            }

            public final InterfaceC18718c<q> serializer() {
                return (InterfaceC18718c) f23443b.getValue();
            }

            public final String toString() {
                return "Search";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$r */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class r extends b {
            public static final r INSTANCE = new r();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23444b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7278r());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof r);
            }

            public final int hashCode() {
                return 125200972;
            }

            public final InterfaceC18718c<r> serializer() {
                return (InterfaceC18718c) f23444b.getValue();
            }

            public final String toString() {
                return "SerialFilter";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$s */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class s extends b {
            public static final s INSTANCE = new s();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23445b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7281s());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public final int hashCode() {
                return -338203329;
            }

            public final InterfaceC18718c<s> serializer() {
                return (InterfaceC18718c) f23445b.getValue();
            }

            public final String toString() {
                return "Serials";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$u */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class u extends b {
            public static final u INSTANCE = new u();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23448b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7284t());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof u);
            }

            public final int hashCode() {
                return 844448197;
            }

            public final InterfaceC18718c<u> serializer() {
                return (InterfaceC18718c) f23448b.getValue();
            }

            public final String toString() {
                return "SportCatalog";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$v */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class v extends b {
            public static final v INSTANCE = new v();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23449b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7287u());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof v);
            }

            public final int hashCode() {
                return 823366607;
            }

            public final InterfaceC18718c<v> serializer() {
                return (InterfaceC18718c) f23449b.getValue();
            }

            public final String toString() {
                return "TelegramQrCode";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$w */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class w extends b {
            public static final w INSTANCE = new w();

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ Lazy<InterfaceC18718c<Object>> f23450b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7290v());

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof w);
            }

            public final int hashCode() {
                return -1473978318;
            }

            public final InterfaceC18718c<w> serializer() {
                return (InterfaceC18718c) f23450b.getValue();
            }

            public final String toString() {
                return "TvChannels";
            }
        }

        /* JADX INFO: renamed from: ad.h$b$c */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class c extends b {
            public static final C21118b Companion = new C21118b();

            /* JADX INFO: renamed from: b */
            public final String f23415b;

            /* JADX INFO: renamed from: ad.h$b$c$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<c> {

                /* JADX INFO: renamed from: a */
                public static final a f23416a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23416a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.Collection", aVar, 1);
                    c20807b0.m25417j("collectionId", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{C20838R0.f71645a};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    String strMo21680g = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else {
                            if (iMo624x != 0) {
                                throw new C18739x(iMo624x);
                            }
                            strMo21680g = interfaceC19796bMo641b.mo21680g(interfaceC19639f, 0);
                            i10 = 1;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new c(i10, strMo21680g);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    interfaceC19797cMo681b.mo703x(interfaceC19639f, 0, ((c) obj).f23415b);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$c$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21118b {
                public final InterfaceC18718c<c> serializer() {
                    return a.f23416a;
                }
            }

            public c(String str) {
                this.f23415b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f23415b, ((c) obj).f23415b);
            }

            public final int hashCode() {
                return this.f23415b.hashCode();
            }

            public final String toString() {
                return C0941K.m1458b("Collection(collectionId=", this.f23415b, ")");
            }

            public /* synthetic */ c(int i10, String str) {
                if (1 == (i10 & 1)) {
                    this.f23415b = str;
                } else {
                    C20915z0.m25449a(i10, 1, a.f23416a.getDescriptor());
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: ad.h$b$e */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class e extends b {
            public static final C21119b Companion = new C21119b();

            /* JADX INFO: renamed from: b */
            public final C3986c f23417b;

            /* JADX INFO: renamed from: c */
            public final long f23418c;

            /* JADX INFO: renamed from: ad.h$b$e$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<e> {

                /* JADX INFO: renamed from: a */
                public static final a f23419a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23419a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.ContentPage", aVar, 2);
                    c20807b0.m25417j("contentId", false);
                    c20807b0.m25417j("uk", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{C3986c.a.f13107a, C20877h0.f71694a};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    C3986c c3986c = null;
                    long jMo21676C = 0;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else if (iMo624x == 0) {
                            c3986c = (C3986c) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C3986c.a.f13107a, c3986c);
                            i10 |= 1;
                        } else {
                            if (iMo624x != 1) {
                                throw new C18739x(iMo624x);
                            }
                            jMo21676C = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 1);
                            i10 |= 2;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new e(i10, c3986c, jMo21676C);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    e eVar = (e) obj;
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    C21119b c21119b = e.Companion;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3986c.a.f13107a, eVar.f23417b);
                    interfaceC19797cMo681b.mo699t(interfaceC19639f, 1, eVar.f23418c);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$e$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21119b {
                public final InterfaceC18718c<e> serializer() {
                    return a.f23419a;
                }
            }

            public e(C3986c c3986c, long j10) {
                this.f23417b = c3986c;
                this.f23418c = j10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f23417b, eVar.f23417b) && this.f23418c == eVar.f23418c;
            }

            public final int hashCode() {
                int iHashCode = this.f23417b.hashCode() * 31;
                long j10 = this.f23418c;
                return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
            }

            public final String toString() {
                return "ContentPage(contentId=" + this.f23417b + ", uk=" + this.f23418c + ")";
            }

            public /* synthetic */ e(int i10, C3986c c3986c, long j10) {
                if (3 != (i10 & 3)) {
                    C20915z0.m25449a(i10, 3, a.f23419a.getDescriptor());
                    throw null;
                }
                this.f23417b = c3986c;
                this.f23418c = j10;
            }
        }

        /* JADX INFO: renamed from: ad.h$b$f */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class f extends b {
            public static final C21120b Companion = new C21120b();

            /* JADX INFO: renamed from: b */
            public final C3986c f23420b;

            /* JADX INFO: renamed from: ad.h$b$f$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<f> {

                /* JADX INFO: renamed from: a */
                public static final a f23421a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23421a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.DescriptionContentPage", aVar, 1);
                    c20807b0.m25417j("contentId", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{C3986c.a.f13107a};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    C3986c c3986c = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else {
                            if (iMo624x != 0) {
                                throw new C18739x(iMo624x);
                            }
                            c3986c = (C3986c) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C3986c.a.f13107a, c3986c);
                            i10 = 1;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new f(i10, c3986c);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    C21120b c21120b = f.Companion;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3986c.a.f13107a, ((f) obj).f23420b);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$f$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21120b {
                public final InterfaceC18718c<f> serializer() {
                    return a.f23421a;
                }
            }

            public f(C3986c c3986c) {
                this.f23420b = c3986c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && Intrinsics.areEqual(this.f23420b, ((f) obj).f23420b);
            }

            public final int hashCode() {
                return this.f23420b.hashCode();
            }

            public final String toString() {
                return "DescriptionContentPage(contentId=" + this.f23420b + ")";
            }

            public /* synthetic */ f(int i10, C3986c c3986c) {
                if (1 == (i10 & 1)) {
                    this.f23420b = c3986c;
                } else {
                    C20915z0.m25449a(i10, 1, a.f23421a.getDescriptor());
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: ad.h$b$g */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class g extends b {
            public static final C21121b Companion = new C21121b();

            /* JADX INFO: renamed from: b */
            public final C3986c f23422b;

            /* JADX INFO: renamed from: c */
            public final long f23423c;

            /* JADX INFO: renamed from: ad.h$b$g$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<g> {

                /* JADX INFO: renamed from: a */
                public static final a f23424a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23424a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.EpisodesPage", aVar, 2);
                    c20807b0.m25417j("serialId", false);
                    c20807b0.m25417j("uk", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{C3986c.a.f13107a, C20877h0.f71694a};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    C3986c c3986c = null;
                    long jMo21676C = 0;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else if (iMo624x == 0) {
                            c3986c = (C3986c) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C3986c.a.f13107a, c3986c);
                            i10 |= 1;
                        } else {
                            if (iMo624x != 1) {
                                throw new C18739x(iMo624x);
                            }
                            jMo21676C = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 1);
                            i10 |= 2;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new g(i10, c3986c, jMo21676C);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    g gVar = (g) obj;
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    C21121b c21121b = g.Companion;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3986c.a.f13107a, gVar.f23422b);
                    interfaceC19797cMo681b.mo699t(interfaceC19639f, 1, gVar.f23423c);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$g$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21121b {
                public final InterfaceC18718c<g> serializer() {
                    return a.f23424a;
                }
            }

            public g(C3986c c3986c, long j10) {
                this.f23422b = c3986c;
                this.f23423c = j10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.areEqual(this.f23422b, gVar.f23422b) && this.f23423c == gVar.f23423c;
            }

            public final int hashCode() {
                int iHashCode = this.f23422b.hashCode() * 31;
                long j10 = this.f23423c;
                return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
            }

            public final String toString() {
                return "EpisodesPage(serialId=" + this.f23422b + ", uk=" + this.f23423c + ")";
            }

            public /* synthetic */ g(int i10, C3986c c3986c, long j10) {
                if (3 != (i10 & 3)) {
                    C20915z0.m25449a(i10, 3, a.f23424a.getDescriptor());
                    throw null;
                }
                this.f23422b = c3986c;
                this.f23423c = j10;
            }
        }

        /* JADX INFO: renamed from: ad.h$b$h */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class h extends b {
            public static final C21122b Companion = new C21122b();

            /* JADX INFO: renamed from: b */
            public final long f23425b;

            /* JADX INFO: renamed from: c */
            public final long f23426c;

            /* JADX INFO: renamed from: ad.h$b$h$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<h> {

                /* JADX INFO: renamed from: a */
                public static final a f23427a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23427a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.Filmography", aVar, 2);
                    c20807b0.m25417j("personId", false);
                    c20807b0.m25417j("uk", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    C20877h0 c20877h0 = C20877h0.f71694a;
                    return new InterfaceC18718c[]{c20877h0, c20877h0};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    long jMo21676C = 0;
                    long jMo21676C2 = 0;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else if (iMo624x == 0) {
                            jMo21676C = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 0);
                            i10 |= 1;
                        } else {
                            if (iMo624x != 1) {
                                throw new C18739x(iMo624x);
                            }
                            jMo21676C2 = interfaceC19796bMo641b.mo21676C(interfaceC19639f, 1);
                            i10 |= 2;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new h(i10, jMo21676C, jMo21676C2);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    h hVar = (h) obj;
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    interfaceC19797cMo681b.mo699t(interfaceC19639f, 0, hVar.f23425b);
                    interfaceC19797cMo681b.mo699t(interfaceC19639f, 1, hVar.f23426c);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$h$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21122b {
                public final InterfaceC18718c<h> serializer() {
                    return a.f23427a;
                }
            }

            public h(long j10, long j11) {
                this.f23425b = j10;
                this.f23426c = j11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.f23425b == hVar.f23425b && this.f23426c == hVar.f23426c;
            }

            public final int hashCode() {
                long j10 = this.f23425b;
                int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
                long j11 = this.f23426c;
                return i10 + ((int) (j11 ^ (j11 >>> 32)));
            }

            public final String toString() {
                return C7408e.m8322a(this.f23426c, ")", C18449y.m20854a(this.f23425b, "Filmography(personId=", ", uk="));
            }

            public /* synthetic */ h(int i10, long j10, long j11) {
                if (3 != (i10 & 3)) {
                    C20915z0.m25449a(i10, 3, a.f23427a.getDescriptor());
                    throw null;
                }
                this.f23425b = j10;
                this.f23426c = j11;
            }
        }

        /* JADX INFO: renamed from: ad.h$b$m */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class m extends b {
            public static final C21123b Companion = new C21123b();

            /* JADX INFO: renamed from: b */
            public final C2182j f23432b;

            /* JADX INFO: renamed from: ad.h$b$m$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<m> {

                /* JADX INFO: renamed from: a */
                public static final a f23433a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23433a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.Player", aVar, 1);
                    c20807b0.m25417j("playbackParams", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{C2182j.a.f7220a};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    C2182j c2182j = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else {
                            if (iMo624x != 0) {
                                throw new C18739x(iMo624x);
                            }
                            c2182j = (C2182j) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C2182j.a.f7220a, c2182j);
                            i10 = 1;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new m(i10, c2182j);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    C21123b c21123b = m.Companion;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C2182j.a.f7220a, ((m) obj).f23432b);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$m$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21123b {
                public final InterfaceC18718c<m> serializer() {
                    return a.f23433a;
                }
            }

            public m(C2182j c2182j) {
                this.f23432b = c2182j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && Intrinsics.areEqual(this.f23432b, ((m) obj).f23432b);
            }

            public final int hashCode() {
                return this.f23432b.hashCode();
            }

            public final String toString() {
                return "Player(playbackParams=" + this.f23432b + ")";
            }

            public /* synthetic */ m(int i10, C2182j c2182j) {
                if (1 == (i10 & 1)) {
                    this.f23432b = c2182j;
                } else {
                    C20915z0.m25449a(i10, 1, a.f23433a.getDescriptor());
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: ad.h$b$n */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class n extends b {
            public static final C21124b Companion = new C21124b();

            /* JADX INFO: renamed from: c */
            @JvmField
            public static final Lazy<InterfaceC18718c<Object>>[] f23434c;

            /* JADX INFO: renamed from: b */
            public final InterfaceC1382b.b f23435b;

            /* JADX INFO: renamed from: ad.h$b$n$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<n> {

                /* JADX INFO: renamed from: a */
                public static final a f23436a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23436a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.Profile", aVar, 1);
                    c20807b0.m25417j("page", true);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{C18973a.m21290a(n.f23434c[0].getValue())};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    Lazy<InterfaceC18718c<Object>>[] lazyArr = n.f23434c;
                    InterfaceC1382b.b bVar = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else {
                            if (iMo624x != 0) {
                                throw new C18739x(iMo624x);
                            }
                            bVar = (InterfaceC1382b.b) interfaceC19796bMo641b.mo21682k(interfaceC19639f, 0, lazyArr[0].getValue(), bVar);
                            i10 = 1;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new n(i10, bVar);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    n nVar = (n) obj;
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    Lazy<InterfaceC18718c<Object>>[] lazyArr = n.f23434c;
                    if (interfaceC19797cMo681b.mo676A() || nVar.f23435b != null) {
                        interfaceC19797cMo681b.mo702w(interfaceC19639f, 0, lazyArr[0].getValue(), nVar.f23435b);
                    }
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$n$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21124b {
                public final InterfaceC18718c<n> serializer() {
                    return a.f23436a;
                }
            }

            static {
                InterfaceC1382b.b.C20988b c20988b = InterfaceC1382b.b.Companion;
                f23434c = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C0792d(1))};
            }

            public n(InterfaceC1382b.b bVar) {
                this.f23435b = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && Intrinsics.areEqual(this.f23435b, ((n) obj).f23435b);
            }

            public final int hashCode() {
                InterfaceC1382b.b bVar = this.f23435b;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            public final String toString() {
                return "Profile(page=" + this.f23435b + ")";
            }

            public /* synthetic */ n(int i10, InterfaceC1382b.b bVar) {
                if ((i10 & 1) == 0) {
                    this.f23435b = null;
                } else {
                    this.f23435b = bVar;
                }
            }

            public n() {
                this(null);
            }
        }

        /* JADX INFO: renamed from: ad.h$b$o */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class o extends b {
            public static final C21125b Companion = new C21125b();

            /* JADX INFO: renamed from: b */
            public final Ads f23437b;

            /* JADX INFO: renamed from: ad.h$b$o$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<o> {

                /* JADX INFO: renamed from: a */
                public static final a f23438a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23438a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.PromoDetails", aVar, 1);
                    c20807b0.m25417j("ads", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{Ads$$serializer.INSTANCE};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    Ads ads = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else {
                            if (iMo624x != 0) {
                                throw new C18739x(iMo624x);
                            }
                            ads = (Ads) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, Ads$$serializer.INSTANCE, ads);
                            i10 = 1;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new o(i10, ads);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    C21125b c21125b = o.Companion;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, Ads$$serializer.INSTANCE, ((o) obj).f23437b);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$o$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21125b {
                public final InterfaceC18718c<o> serializer() {
                    return a.f23438a;
                }
            }

            public o(Ads ads) {
                this.f23437b = ads;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && Intrinsics.areEqual(this.f23437b, ((o) obj).f23437b);
            }

            public final int hashCode() {
                return this.f23437b.hashCode();
            }

            public final String toString() {
                return "PromoDetails(ads=" + this.f23437b + ")";
            }

            public /* synthetic */ o(int i10, Ads ads) {
                if (1 == (i10 & 1)) {
                    this.f23437b = ads;
                } else {
                    C20915z0.m25449a(i10, 1, a.f23438a.getDescriptor());
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: ad.h$b$p */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class p extends b {
            public static final C21126b Companion = new C21126b();

            /* JADX INFO: renamed from: d */
            @JvmField
            public static final Lazy<InterfaceC18718c<Object>>[] f23439d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7272p()), null};

            /* JADX INFO: renamed from: b */
            public final EnumC0137f f23440b;

            /* JADX INFO: renamed from: c */
            public final C3986c f23441c;

            /* JADX INFO: renamed from: ad.h$b$p$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<p> {

                /* JADX INFO: renamed from: a */
                public static final a f23442a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23442a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.Report", aVar, 2);
                    c20807b0.m25417j("reportType", false);
                    c20807b0.m25417j("entityId", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{p.f23439d[0].getValue(), C3986c.a.f13107a};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    Lazy<InterfaceC18718c<Object>>[] lazyArr = p.f23439d;
                    EnumC0137f enumC0137f = null;
                    C3986c c3986c = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else if (iMo624x == 0) {
                            enumC0137f = (EnumC0137f) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, lazyArr[0].getValue(), enumC0137f);
                            i10 |= 1;
                        } else {
                            if (iMo624x != 1) {
                                throw new C18739x(iMo624x);
                            }
                            c3986c = (C3986c) interfaceC19796bMo641b.mo667l(interfaceC19639f, 1, C3986c.a.f13107a, c3986c);
                            i10 |= 2;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new p(i10, enumC0137f, c3986c);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    p pVar = (p) obj;
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, p.f23439d[0].getValue(), pVar.f23440b);
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 1, C3986c.a.f13107a, pVar.f23441c);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$p$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21126b {
                public final InterfaceC18718c<p> serializer() {
                    return a.f23442a;
                }
            }

            public p(EnumC0137f enumC0137f, C3986c c3986c) {
                this.f23440b = enumC0137f;
                this.f23441c = c3986c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p)) {
                    return false;
                }
                p pVar = (p) obj;
                return this.f23440b == pVar.f23440b && Intrinsics.areEqual(this.f23441c, pVar.f23441c);
            }

            public final int hashCode() {
                return this.f23441c.hashCode() + (this.f23440b.hashCode() * 31);
            }

            public final String toString() {
                return "Report(reportType=" + this.f23440b + ", entityId=" + this.f23441c + ")";
            }

            public /* synthetic */ p(int i10, EnumC0137f enumC0137f, C3986c c3986c) {
                if (3 != (i10 & 3)) {
                    C20915z0.m25449a(i10, 3, a.f23442a.getDescriptor());
                    throw null;
                }
                this.f23440b = enumC0137f;
                this.f23441c = c3986c;
            }
        }

        /* JADX INFO: renamed from: ad.h$b$t */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class t extends b {
            public static final C21127b Companion = new C21127b();

            /* JADX INFO: renamed from: b */
            public final C3986c f23446b;

            /* JADX INFO: renamed from: ad.h$b$t$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<t> {

                /* JADX INFO: renamed from: a */
                public static final a f23447a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23447a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.SportBroadcast", aVar, 1);
                    c20807b0.m25417j("entityId", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{C3986c.a.f13107a};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    C3986c c3986c = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else {
                            if (iMo624x != 0) {
                                throw new C18739x(iMo624x);
                            }
                            c3986c = (C3986c) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, C3986c.a.f13107a, c3986c);
                            i10 = 1;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new t(i10, c3986c);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    C21127b c21127b = t.Companion;
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, C3986c.a.f13107a, ((t) obj).f23446b);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$t$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21127b {
                public final InterfaceC18718c<t> serializer() {
                    return a.f23447a;
                }
            }

            public t(C3986c c3986c) {
                this.f23446b = c3986c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && Intrinsics.areEqual(this.f23446b, ((t) obj).f23446b);
            }

            public final int hashCode() {
                return this.f23446b.hashCode();
            }

            public final String toString() {
                return "SportBroadcast(entityId=" + this.f23446b + ")";
            }

            public /* synthetic */ t(int i10, C3986c c3986c) {
                if (1 == (i10 & 1)) {
                    this.f23446b = c3986c;
                } else {
                    C20915z0.m25449a(i10, 1, a.f23447a.getDescriptor());
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: ad.h$b$x */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class x extends b {
            public static final C21128b Companion = new C21128b();

            /* JADX INFO: renamed from: c */
            @JvmField
            public static final Lazy<InterfaceC18718c<Object>>[] f23451c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C7293w(0))};

            /* JADX INFO: renamed from: b */
            public final EnumC5674e f23452b;

            /* JADX INFO: renamed from: ad.h$b$x$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<x> {

                /* JADX INFO: renamed from: a */
                public static final a f23453a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23453a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.UserCollection", aVar, 1);
                    c20807b0.m25417j("userCollection", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{x.f23451c[0].getValue()};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    Lazy<InterfaceC18718c<Object>>[] lazyArr = x.f23451c;
                    EnumC5674e enumC5674e = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else {
                            if (iMo624x != 0) {
                                throw new C18739x(iMo624x);
                            }
                            enumC5674e = (EnumC5674e) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, lazyArr[0].getValue(), enumC5674e);
                            i10 = 1;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new x(i10, enumC5674e);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, x.f23451c[0].getValue(), ((x) obj).f23452b);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$x$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21128b {
                public final InterfaceC18718c<x> serializer() {
                    return a.f23453a;
                }
            }

            public x(EnumC5674e enumC5674e) {
                this.f23452b = enumC5674e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof x) && this.f23452b == ((x) obj).f23452b;
            }

            public final int hashCode() {
                return this.f23452b.hashCode();
            }

            public final String toString() {
                return "UserCollection(userCollection=" + this.f23452b + ")";
            }

            public /* synthetic */ x(int i10, EnumC5674e enumC5674e) {
                if (1 == (i10 & 1)) {
                    this.f23452b = enumC5674e;
                } else {
                    C20915z0.m25449a(i10, 1, a.f23453a.getDescriptor());
                    throw null;
                }
            }
        }

        /* JADX INFO: renamed from: ad.h$b$y */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @InterfaceC18729n
        public static final class y extends b {
            public static final C21129b Companion = new C21129b();

            /* JADX INFO: renamed from: c */
            @JvmField
            public static final Lazy<InterfaceC18718c<Object>>[] f23454c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C0900s(1))};

            /* JADX INFO: renamed from: b */
            public final EnumC5674e f23455b;

            /* JADX INFO: renamed from: ad.h$b$y$a */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
            public static final /* synthetic */ class a implements InterfaceC20826L<y> {

                /* JADX INFO: renamed from: a */
                public static final a f23456a;
                private static final InterfaceC19639f descriptor;

                static {
                    a aVar = new a();
                    f23456a = aVar;
                    C20807B0 c20807b0 = new C20807B0("ru.zona.app.components.IRootComponent.Config.UserCollectionEditor", aVar, 1);
                    c20807b0.m25417j("userCollection", false);
                    descriptor = c20807b0;
                }

                @Override // za.InterfaceC20826L
                public final InterfaceC18718c<?>[] childSerializers() {
                    return new InterfaceC18718c[]{y.f23454c[0].getValue()};
                }

                @Override // va.InterfaceC18717b
                public final Object deserialize(InterfaceC19798d interfaceC19798d) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19796b interfaceC19796bMo641b = interfaceC19798d.mo641b(interfaceC19639f);
                    Lazy<InterfaceC18718c<Object>>[] lazyArr = y.f23454c;
                    EnumC5674e enumC5674e = null;
                    boolean z10 = true;
                    int i10 = 0;
                    while (z10) {
                        int iMo624x = interfaceC19796bMo641b.mo624x(interfaceC19639f);
                        if (iMo624x == -1) {
                            z10 = false;
                        } else {
                            if (iMo624x != 0) {
                                throw new C18739x(iMo624x);
                            }
                            enumC5674e = (EnumC5674e) interfaceC19796bMo641b.mo667l(interfaceC19639f, 0, lazyArr[0].getValue(), enumC5674e);
                            i10 = 1;
                        }
                    }
                    interfaceC19796bMo641b.mo642n(interfaceC19639f);
                    return new y(i10, enumC5674e);
                }

                @Override // va.InterfaceC18731p, va.InterfaceC18717b
                public final InterfaceC19639f getDescriptor() {
                    return descriptor;
                }

                @Override // va.InterfaceC18731p
                public final void serialize(InterfaceC19799e interfaceC19799e, Object obj) {
                    InterfaceC19639f interfaceC19639f = descriptor;
                    InterfaceC19797c interfaceC19797cMo681b = interfaceC19799e.mo681b(interfaceC19639f);
                    interfaceC19797cMo681b.mo690k(interfaceC19639f, 0, y.f23454c[0].getValue(), ((y) obj).f23455b);
                    interfaceC19797cMo681b.mo682c();
                }

                @Override // za.InterfaceC20826L
                public final /* bridge */ InterfaceC18718c<?>[] typeParametersSerializers() {
                    return C20813E0.f71615a;
                }
            }

            /* JADX INFO: renamed from: ad.h$b$y$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
            public static final class C21129b {
                public final InterfaceC18718c<y> serializer() {
                    return a.f23456a;
                }
            }

            public y(EnumC5674e enumC5674e) {
                this.f23455b = enumC5674e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof y) && this.f23455b == ((y) obj).f23455b;
            }

            public final int hashCode() {
                return this.f23455b.hashCode();
            }

            public final String toString() {
                return "UserCollectionEditor(userCollection=" + this.f23455b + ")";
            }

            public /* synthetic */ y(int i10, EnumC5674e enumC5674e) {
                if (1 == (i10 & 1)) {
                    this.f23455b = enumC5674e;
                } else {
                    C20915z0.m25449a(i10, 1, a.f23456a.getDescriptor());
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    AbstractC1467g mo8131a();

    /* JADX INFO: renamed from: b */
    EnumC1896d mo8132b();

    /* JADX INFO: renamed from: c */
    InterfaceC2991i mo8133c();

    /* JADX INFO: renamed from: d */
    InterfaceC17978p mo8134d();

    /* JADX INFO: renamed from: e */
    C4904d mo8135e();

    /* JADX INFO: renamed from: f */
    C7167A mo8136f();

    /* JADX INFO: renamed from: g */
    C1162h mo8137g();

    /* JADX INFO: renamed from: h */
    void mo8138h(C2182j c2182j);

    /* JADX INFO: renamed from: i */
    C15438j mo8139i();
}
