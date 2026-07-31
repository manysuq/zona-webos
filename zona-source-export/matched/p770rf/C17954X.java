package p770rf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: renamed from: rf.X */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.services.VideoSourcesServiceWithCache", m18778f = "VideoSourcesServiceWithCache.kt", m18779i = {0, 0, 0}, m18780l = {44}, m18781m = "getVideoSources", m18782n = {"episodeNum", "trailer", "kinopoiskId"}, m18783nl = {51}, m18784s = {"L$0", "L$1", "J$0"}, m18785v = 2)
public final class C17954X extends ContinuationImpl {

    /* JADX INFO: renamed from: j */
    public Object f55825j;

    /* JADX INFO: renamed from: k */
    public Object f55826k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f55827l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C17952V f55828m;

    /* JADX INFO: renamed from: n */
    public int f55829n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17954X(C17952V c17952v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f55828m = c17952v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55827l = obj;
        this.f55829n |= IntCompanionObject.MIN_VALUE;
        return this.f55828m.mo20323a(0L, null, null, this);
    }
}
