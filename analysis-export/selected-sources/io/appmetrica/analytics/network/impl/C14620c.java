package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p659io.CloseableKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.network.impl.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14620c implements Call {

    /* JADX INFO: renamed from: a */
    public final NetworkClient f47767a;

    /* JADX INFO: renamed from: b */
    public final Request f47768b;

    /* JADX INFO: renamed from: c */
    public final C14621d f47769c;

    public C14620c(NetworkClient networkClient, Request request, C14621d c14621d) {
        this.f47767a = networkClient;
        this.f47768b = request;
        this.f47769c = c14621d;
    }

    /* JADX INFO: renamed from: a */
    public final void m17152a(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        Iterator<T> it = this.f47768b.getHeaders().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Integer readTimeout = this.f47767a.getReadTimeout();
        if (readTimeout != null) {
            httpsURLConnection.setReadTimeout(readTimeout.intValue());
        }
        Integer connectTimeout = this.f47767a.getConnectTimeout();
        if (connectTimeout != null) {
            httpsURLConnection.setConnectTimeout(connectTimeout.intValue());
        }
        Boolean useCaches = this.f47767a.getUseCaches();
        if (useCaches != null) {
            httpsURLConnection.setUseCaches(useCaches.booleanValue());
        }
        Boolean instanceFollowRedirects = this.f47767a.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            httpsURLConnection.setInstanceFollowRedirects(instanceFollowRedirects.booleanValue());
        }
        httpsURLConnection.setRequestMethod(this.f47768b.getMethod());
        SSLSocketFactory sslSocketFactory = this.f47767a.getSslSocketFactory();
        if (sslSocketFactory != null) {
            httpsURLConnection.setSSLSocketFactory(sslSocketFactory);
        }
    }

    @Override // io.appmetrica.analytics.network.internal.Call
    public final Response execute() {
        Map<String, List<String>> headerFields;
        int responseCode;
        Throwable th;
        String string;
        boolean z10;
        try {
            C14621d c14621d = this.f47769c;
            String url = this.f47768b.getUrl();
            c14621d.getClass();
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
            if (httpsURLConnection == null) {
                return new Response(new IllegalArgumentException("Connection created for " + this.f47768b.getUrl() + " does not represent https connection"));
            }
            byte[] bArrM17154a = new byte[0];
            byte[] bArrM17154a2 = new byte[0];
            try {
                m17152a(httpsURLConnection);
                if (Intrinsics.areEqual(this.f47768b.getMethod(), "POST")) {
                    httpsURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                    if (outputStream != null) {
                        try {
                            outputStream.write(this.f47768b.getBody());
                            outputStream.flush();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(outputStream, th2);
                                throw th3;
                            }
                        }
                    }
                }
                responseCode = httpsURLConnection.getResponseCode();
                try {
                    headerFields = httpsURLConnection.getHeaderFields();
                    try {
                        bArrM17154a = AbstractC14622e.m17154a(this.f47767a.getMaxResponseSize(), new C14618a(httpsURLConnection));
                        bArrM17154a2 = AbstractC14622e.m17154a(this.f47767a.getMaxResponseSize(), new C14619b(httpsURLConnection));
                        string = httpsURLConnection.getURL().toString();
                        th = null;
                        z10 = true;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        string = null;
                        z10 = false;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    headerFields = null;
                }
            } catch (Throwable th6) {
                th = th6;
                headerFields = null;
                responseCode = 0;
            }
            byte[] bArr = bArrM17154a;
            byte[] bArr2 = bArrM17154a2;
            int i10 = responseCode;
            Map<String, List<String>> map = headerFields;
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            return new Response(z10, i10, bArr, bArr2, map, th, string);
        } catch (Throwable th7) {
            return new Response(th7);
        }
    }

    public C14620c(NetworkClient networkClient, Request request) {
        this(networkClient, request, new C14621d());
    }
}
