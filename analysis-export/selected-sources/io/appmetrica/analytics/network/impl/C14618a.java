package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.network.impl.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14618a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HttpsURLConnection f47765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14618a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f47765a = httpsURLConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f47765a.getInputStream();
    }
}
