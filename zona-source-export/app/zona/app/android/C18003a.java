package ru.zona.app.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: renamed from: ru.zona.app.android.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.android.App$onCreate$clientTimeInterceptor$1", m18778f = "App.kt", m18779i = {}, m18780l = {292}, m18781m = "getValue", m18782n = {}, m18783nl = {294}, m18784s = {}, m18785v = 2)
public final class C18003a extends ContinuationImpl {

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f55975j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ App.C17998b<Object> f55976k;

    /* JADX INFO: renamed from: l */
    public int f55977l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18003a(App.C17998b c17998b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f55976k = c17998b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55975j = obj;
        this.f55977l |= IntCompanionObject.MIN_VALUE;
        return this.f55976k.mo817a(this);
    }
}
