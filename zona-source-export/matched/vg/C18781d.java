package vg;

import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import p011Aa.C0074A;
import p011Aa.C0113z;
import p064D9.C1084f;
import p064D9.C1086h;
import p064D9.C1092n;
import p064D9.InterfaceC1091m;
import p100F9.AbstractC1563d;
import p100F9.C1567h;
import p100F9.C1572m;
import p107Fg.C1634b;
import p154I9.C2299M;
import p154I9.C2316c;
import p154I9.C2327m;
import p154I9.C2335u;
import p154I9.C2336v;
import p280P9.C4189a;
import p734p9.C17564c;

/* JADX INFO: renamed from: vg.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nKinopoiskSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KinopoiskSearch.kt\nru/zona/client/api/search/impl/KinopoiskSearch\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,50:1\n599#2:51\n381#2:52\n600#2,3:53\n205#2,2:56\n43#2:58\n*S KotlinDebug\n*F\n+ 1 KinopoiskSearch.kt\nru/zona/client/api/search/impl/KinopoiskSearch\n*L\n31#1:51\n31#1:52\n31#1:53,3\n31#1:56,2\n31#1:58\n*E\n"})
public final class C18781d {

    /* JADX INFO: renamed from: b */
    public static final C1634b f58518b;

    /* JADX INFO: renamed from: c */
    public static final C0113z f58519c;

    /* JADX INFO: renamed from: a */
    public final C17564c f58520a;

    static {
        Reflection.getOrCreateKotlinClass(C18781d.class).getSimpleName();
        f58518b = new C1634b();
        f58519c = C0074A.m149a(new C18779b());
    }

    public C18781d(C17564c c17564c) {
        this.f58520a = c17564c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        if (r0 == r2) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m21140a(String str, long j10, ContinuationImpl continuationImpl) {
        C18780c c18780c;
        long j11;
        if (continuationImpl instanceof C18780c) {
            c18780c = (C18780c) continuationImpl;
            int i10 = c18780c.f58517u;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c18780c.f58517u = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c18780c = new C18780c(this, continuationImpl);
            }
        } else {
            c18780c = new C18780c(this, continuationImpl);
        }
        Object objM2177c = c18780c.f58515s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c18780c.f58517u;
        C1634b c1634b = f58518b;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    j11 = c18780c.f58514r;
                    str = (String) c18780c.f58506j;
                    ResultKt.throwOnFailure(objM2177c);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM2177c);
                }
                try {
                    return f58519c.mo163e((String) objM2177c, C18782e.Companion.serializer());
                } catch (Exception unused) {
                    c1634b.getClass();
                    return null;
                }
            }
            ResultKt.throwOnFailure(objM2177c);
            C17564c c17564c = this.f58520a;
            C1084f c1084f = new C1084f();
            C2327m c2327m = c1084f.f3942c;
            C4189a<InterfaceC1091m> c4189a = C1086h.f3953a;
            C2299M.m2976b(c1084f.f3940a, "https://www.kinopoisk.ru/api/suggest/v2/");
            C1092n.m1729b(c1084f, "query", str);
            C2316c c2316c = C2316c.a.f7581a;
            c2327m.mo2982c("Accept", c2316c.toString());
            C2335u.m3009d(c1084f, c2316c);
            c2327m.m4901g("User-Agent", "Mozilla/5.0 (Windows NT 10.0 Win64 x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36");
            C1092n.m1728a(c1084f, "X-Requested-With", "XMLHttpRequest");
            c1084f.f3941b = C2336v.f7604b;
            C1572m c1572m = new C1572m(c1084f, c17564c);
            c18780c.f58506j = SpillingKt.nullOutSpilledVariable(str);
            c18780c.f58507k = SpillingKt.nullOutSpilledVariable(c17564c);
            c18780c.f58508l = SpillingKt.nullOutSpilledVariable("https://www.kinopoisk.ru/api/suggest/v2/");
            c18780c.f58509m = SpillingKt.nullOutSpilledVariable(c17564c);
            c18780c.f58510n = SpillingKt.nullOutSpilledVariable(c17564c);
            c18780c.f58511o = SpillingKt.nullOutSpilledVariable(c1084f);
            c18780c.f58512p = SpillingKt.nullOutSpilledVariable(c17564c);
            c18780c.f58513q = SpillingKt.nullOutSpilledVariable(c1084f);
            c18780c.f58514r = j10;
            c18780c.f58517u = 1;
            objM2177c = c1572m.m2177c(c18780c);
            if (objM2177c != coroutine_suspended) {
                j11 = j10;
            }
            return coroutine_suspended;
            Charset charset = Charsets.UTF_8;
            c18780c.f58506j = SpillingKt.nullOutSpilledVariable(str);
            c18780c.f58507k = null;
            c18780c.f58508l = null;
            c18780c.f58509m = null;
            c18780c.f58510n = null;
            c18780c.f58511o = null;
            c18780c.f58512p = null;
            c18780c.f58513q = null;
            c18780c.f58514r = j11;
            c18780c.f58517u = 2;
            objM2177c = C1567h.m2174b((AbstractC1563d) objM2177c, charset, c18780c);
        } catch (Exception unused2) {
            c1634b.getClass();
            return null;
        }
    }
}
