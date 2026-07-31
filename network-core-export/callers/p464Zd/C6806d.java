package p464Zd;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: renamed from: Zd.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.init.ServicesInitializer", m18778f = "ServicesInitializer.kt", m18779i = {0}, m18780l = {210}, m18781m = "initApiConfig", m18782n = {"configCache"}, m18783nl = {234}, m18784s = {"L$0"}, m18785v = 2)
public final class C6806d extends ContinuationImpl {

    /* JADX INFO: renamed from: j */
    public Object f22382j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f22383k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C6810h f22384l;

    /* JADX INFO: renamed from: m */
    public int f22385m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6806d(C6810h c6810h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22384l = c6810h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22383k = obj;
        this.f22385m |= IntCompanionObject.MIN_VALUE;
        return C6810h.m7711a(this.f22384l, null, this);
    }
}
