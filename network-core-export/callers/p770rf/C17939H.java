package p770rf;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.IntCompanionObject;
import p269Og.InterfaceC4009p;

/* JADX INFO: renamed from: rf.H */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.services.ServiceMediator", m18778f = "ServiceMediator.kt", m18779i = {0, 0, 1, 1, 1}, m18780l = {40, 42}, m18781m = "getMovieOrSerialById", m18782n = {"id", "occupancy", "id", "occupancy", "result"}, m18783nl = {41, 44}, m18784s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, m18785v = 2)
public final class C17939H extends ContinuationImpl {

    /* JADX INFO: renamed from: j */
    public Object f55746j;

    /* JADX INFO: renamed from: k */
    public Object f55747k;

    /* JADX INFO: renamed from: l */
    public InterfaceC4009p f55748l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f55749m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C17942K f55750n;

    /* JADX INFO: renamed from: o */
    public int f55751o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17939H(C17942K c17942k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f55750n = c17942k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55749m = obj;
        this.f55751o |= IntCompanionObject.MIN_VALUE;
        return this.f55750n.mo20313a(null, null, this);
    }
}
