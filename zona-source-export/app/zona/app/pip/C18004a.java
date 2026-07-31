package ru.zona.app.pip;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p107Fg.C1634b;
import p269Og.EnumC3994g;
import p513d.ActivityC10189r;
import p524da.C10454v0;
import p644k0.C15664j;
import p843wd.C19021e;
import p843wd.InterfaceC19009W;

/* JADX INFO: renamed from: ru.zona.app.pip.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(m18777c = "ru.zona.app.pip.PicInPicService$5", m18778f = "PicInPicService.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
@SourceDebugExtension({"SMAP\nPicInPicService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicInPicService.kt\nru/zona/app/pip/PicInPicService$5\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,229:1\n230#2,5:230\n*S KotlinDebug\n*F\n+ 1 PicInPicService.kt\nru/zona/app/pip/PicInPicService$5\n*L\n101#1:230,5\n*E\n"})
public final class C18004a extends SuspendLambda implements Function2<InterfaceC19009W.b, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f55987j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C18005b f55988k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18004a(C18005b c18005b, Continuation<? super C18004a> continuation) {
        super(2, continuation);
        this.f55988k = c18005b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C18004a c18004a = new C18004a(this.f55988k, continuation);
        c18004a.f55987j = obj;
        return c18004a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC19009W.b bVar, Continuation<? super Unit> continuation) {
        return ((C18004a) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        C18005b c18005b = this.f55988k;
        C10454v0 c10454v0 = c18005b.f55996c;
        C19021e c19021e = c18005b.f55995b;
        InterfaceC19009W.b bVar = (InterfaceC19009W.b) this.f55987j;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C18005b.b bVar2 = new C18005b.b(bVar.f59292e instanceof InterfaceC19009W.c.C21257c, bVar.f59288a.f7215a.f13106c == EnumC3994g.SERIAL, c19021e.f59357c.mo21319c().getValue().f60718e, c19021e.f59357c.mo21319c().getValue().f60717d);
        do {
            value = c10454v0.getValue();
        } while (!c10454v0.mo12533d(value, bVar2));
        C1634b c1634b = C18005b.f55989e;
        ActivityC10189r activityC10189rM20361a = C18005b.a.m20361a(c18005b.f55994a);
        if (activityC10189rM20361a != null) {
            try {
                activityC10189rM20361a.setPictureInPictureParams(C18005b.m20360f(c18005b.f55994a, bVar2, null).build());
                Unit unit = Unit.INSTANCE;
            } catch (Exception unused) {
                C18005b.f55989e.getClass();
            }
        }
        C18005b.f55989e.mo2258d(C15664j.m18345a(c10454v0.getValue(), "state updated: "), new Object[0]);
        return Unit.INSTANCE;
    }
}
