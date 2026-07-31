package sg;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import p055D0.C0941K;
import p179Jg.C2606B;
import p179Jg.C2617M;
import p179Jg.C2631j;
import p179Jg.C2636o;
import p179Jg.InterfaceC2640s;
import p179Jg.InterfaceC2645x;
import p269Og.C3986c;
import p770rf.C17944M;
import p897zg.C20958c;
import va.InterfaceC18717b;
import va.InterfaceC18718c;

/* JADX INFO: renamed from: sg.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C18204b implements InterfaceC2640s {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f56649b = 0;

    /* JADX INFO: renamed from: a */
    public final C20958c f56650a;

    static {
        Reflection.getOrCreateKotlinClass(C18204b.class).getSimpleName();
    }

    public C18204b(C20958c c20958c) {
        this.f56650a = c20958c;
    }

    @Override // p179Jg.InterfaceC2640s
    /* JADX INFO: renamed from: a */
    public final Object mo3381a(C2636o c2636o, Continuation<? super C2606B> continuation) {
        return this.f56650a.m25471b("/getMovieIds", c2636o, C2636o.Companion.serializer(), C2606B.Companion.serializer(), continuation);
    }

    @Override // p179Jg.InterfaceC2640s
    /* JADX INFO: renamed from: b */
    public final Object mo3382b(C2636o c2636o, Continuation<? super C2606B> continuation) {
        return this.f56650a.m25471b("/getSerialIds", c2636o, C2636o.Companion.serializer(), C2606B.Companion.serializer(), continuation);
    }

    @Override // p179Jg.InterfaceC2640s
    /* JADX INFO: renamed from: c */
    public final Object mo3383c(C3986c c3986c, C17944M.a.C21245a c21245a) {
        return this.f56650a.m25471b("/getEntityShareUrl", c3986c, C3986c.Companion.serializer(), C2617M.Companion.serializer(), c21245a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m20535d(String str, C2631j c2631j, InterfaceC18717b interfaceC18717b, ContinuationImpl continuationImpl) throws Exception {
        C18203a c18203a;
        C2631j c2631j2;
        if (continuationImpl instanceof C18203a) {
            c18203a = (C18203a) continuationImpl;
            int i10 = c18203a.f56648o;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c18203a.f56648o = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c18203a = new C18203a(this, continuationImpl);
            }
        } else {
            c18203a = new C18203a(this, continuationImpl);
        }
        C18203a c18203a2 = c18203a;
        Object objM25471b = c18203a2.f56646m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c18203a2.f56648o;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM25471b);
            InterfaceC18718c<C2631j> interfaceC18718cSerializer = C2631j.Companion.serializer();
            c18203a2.f56643j = SpillingKt.nullOutSpilledVariable(str);
            c18203a2.f56644k = c2631j;
            c18203a2.f56645l = SpillingKt.nullOutSpilledVariable(interfaceC18717b);
            c18203a2.f56648o = 1;
            objM25471b = this.f56650a.m25471b(str, c2631j, interfaceC18718cSerializer, interfaceC18717b, c18203a2);
            if (objM25471b == coroutine_suspended) {
                return coroutine_suspended;
            }
            c2631j2 = c2631j;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2631j2 = c18203a2.f56644k;
            ResultKt.throwOnFailure(objM25471b);
        }
        InterfaceC2645x interfaceC2645x = (InterfaceC2645x) objM25471b;
        if (interfaceC2645x.getData().isEmpty()) {
            throw new Exception(C0941K.m1458b("response is empty, entityId:", c2631j2.f8837a, " "));
        }
        return interfaceC2645x;
    }
}
