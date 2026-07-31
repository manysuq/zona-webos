package sg;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import p179Jg.C2614J;
import p179Jg.C2621Q;
import p179Jg.C2639r;
import p269Og.C3974S;
import p269Og.C4004l;
import p770rf.C17956Z;
import p771rg.InterfaceC17996h;

/* JADX INFO: renamed from: sg.G */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C18202G implements InterfaceC17996h {

    /* JADX INFO: renamed from: a */
    public final C18200E f56640a;

    /* JADX INFO: renamed from: b */
    public final List<String> f56641b;

    /* JADX INFO: renamed from: c */
    public final C17956Z f56642c;

    public C18202G(C18200E c18200e, List list, C17956Z c17956z) {
        this.f56640a = c18200e;
        this.f56641b = list;
        this.f56642c = c17956z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // p771rg.InterfaceC17996h
    /* JADX INFO: renamed from: a */
    public final Object mo20323a(long j10, C4004l c4004l, Boolean bool, ContinuationImpl continuationImpl) {
        C18201F c18201f;
        if (continuationImpl instanceof C18201F) {
            c18201f = (C18201F) continuationImpl;
            int i10 = c18201f.f56639n;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c18201f.f56639n = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c18201f = new C18201F(this, continuationImpl);
            }
        } else {
            c18201f = new C18201F(this, continuationImpl);
        }
        C18201F c18201f2 = c18201f;
        Object objM25471b = c18201f2.f56637l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c18201f2.f56639n;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM25471b);
            C2639r c2639r = new C2639r(j10, C3974S.m4698a(c4004l), this.f56641b, bool, (C2621Q) this.f56642c.getValue());
            c18201f2.f56635j = SpillingKt.nullOutSpilledVariable(c4004l);
            c18201f2.f56636k = SpillingKt.nullOutSpilledVariable(bool);
            c18201f2.f56639n = 1;
            objM25471b = this.f56640a.f56634a.m25471b("/getVideoSources", c2639r, C2639r.Companion.serializer(), C2614J.Companion.serializer(), c18201f2);
            if (objM25471b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM25471b);
        }
        return ((C2614J) objM25471b).f8766a;
    }
}
