package sg;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;
import p179Jg.C2631j;
import p179Jg.InterfaceC2645x;

/* JADX INFO: renamed from: sg.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.client.api.entity.impl.ContentApiClient", m18778f = "ContentApiClient.kt", m18779i = {0, 0, 0}, m18780l = {125}, m18781m = "loadMovieOrSerialEntityById", m18782n = {"urlPath", "params", "deserializer"}, m18783nl = {126}, m18784s = {"L$0", "L$1", "L$2"}, m18785v = 2)
public final class C18203a<T, S extends InterfaceC2645x<T>> extends ContinuationImpl {

    /* JADX INFO: renamed from: j */
    public Object f56643j;

    /* JADX INFO: renamed from: k */
    public C2631j f56644k;

    /* JADX INFO: renamed from: l */
    public Object f56645l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f56646m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C18204b f56647n;

    /* JADX INFO: renamed from: o */
    public int f56648o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18203a(C18204b c18204b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f56647n = c18204b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56646m = obj;
        this.f56648o |= IntCompanionObject.MIN_VALUE;
        int i10 = C18204b.f56649b;
        return this.f56647n.m20535d(null, null, null, this);
    }
}
