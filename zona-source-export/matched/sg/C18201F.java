package sg;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: renamed from: sg.F */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.client.api.entity.impl.VideoSourcesService", m18778f = "VideoSourcesService.kt", m18779i = {0, 0, 0}, m18780l = {22}, m18781m = "getVideoSources", m18782n = {"episodeNum", "trailer", "kinopoiskId"}, m18783nl = {30}, m18784s = {"L$0", "L$1", "J$0"}, m18785v = 2)
public final class C18201F extends ContinuationImpl {

    /* JADX INFO: renamed from: j */
    public Object f56635j;

    /* JADX INFO: renamed from: k */
    public Object f56636k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f56637l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C18202G f56638m;

    /* JADX INFO: renamed from: n */
    public int f56639n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18201F(C18202G c18202g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f56638m = c18202g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56637l = obj;
        this.f56639n |= IntCompanionObject.MIN_VALUE;
        return this.f56638m.mo20323a(0L, null, null, this);
    }
}
