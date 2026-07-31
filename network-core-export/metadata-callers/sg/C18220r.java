package sg;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: renamed from: sg.r */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.client.api.entity.impl.MetadataApiCached", m18778f = "MetadataApiCached.kt", m18779i = {0, 1, 1, 2, 2}, m18780l = {23, 25, 27}, m18781m = "getMetadata", m18782n = {"params", "params", "e", "params", "newMetadata"}, m18783nl = {24, 22, 28}, m18784s = {"L$0", "L$0", "L$1", "L$0", "L$1"}, m18785v = 2)
public final class C18220r extends ContinuationImpl {

    /* JADX INFO: renamed from: j */
    public Object f56729j;

    /* JADX INFO: renamed from: k */
    public Object f56730k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f56731l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C18221s f56732m;

    /* JADX INFO: renamed from: n */
    public int f56733n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18220r(C18221s c18221s, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f56732m = c18221s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56731l = obj;
        this.f56733n |= IntCompanionObject.MIN_VALUE;
        return this.f56732m.m20543b(null, this);
    }
}
