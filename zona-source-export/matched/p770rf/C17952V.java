package p770rf;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import p035Bg.C0452c;
import p035Bg.C0455f;
import p035Bg.C0457h;
import p107Fg.C1634b;
import p179Jg.C2621Q;
import p192Kb.C2951e0;
import p269Og.C4004l;
import p771rg.InterfaceC17996h;
import sg.C18202G;

/* JADX INFO: renamed from: rf.V */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C17952V implements InterfaceC17996h {

    /* JADX INFO: renamed from: d */
    public static final C1634b f55814d;

    /* JADX INFO: renamed from: a */
    public final C18202G f55815a;

    /* JADX INFO: renamed from: b */
    public final C17956Z f55816b;

    /* JADX INFO: renamed from: c */
    public final C0452c<a, List<C2951e0>> f55817c;

    /* JADX INFO: renamed from: rf.V$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f55818a;

        /* JADX INFO: renamed from: b */
        public final C4004l f55819b;

        /* JADX INFO: renamed from: c */
        public final Boolean f55820c;

        /* JADX INFO: renamed from: d */
        public final C2621Q f55821d;

        public a(long j10, C4004l c4004l, Boolean bool, C2621Q c2621q) {
            this.f55818a = j10;
            this.f55819b = c4004l;
            this.f55820c = bool;
            this.f55821d = c2621q;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f55818a == aVar.f55818a && Intrinsics.areEqual(this.f55819b, aVar.f55819b) && Intrinsics.areEqual(this.f55820c, aVar.f55820c) && Intrinsics.areEqual(this.f55821d, aVar.f55821d);
        }

        public final int hashCode() {
            long j10 = this.f55818a;
            int iHashCode = (this.f55819b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31;
            Boolean bool = this.f55820c;
            return this.f55821d.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
        }

        public final String toString() {
            return "Key(kinopoiskId=" + this.f55818a + ", episodeNum=" + this.f55819b + ", trailer=" + this.f55820c + ", userInfo=" + this.f55821d + ")";
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C17952V.class).getSimpleName();
        f55814d = new C1634b();
    }

    public C17952V(C18202G c18202g, C17956Z c17956z) {
        this.f55815a = c18202g;
        this.f55816b = c17956z;
        Duration.Companion companion = Duration.INSTANCE;
        this.f55817c = new C0452c<>(new C0457h.a(Duration.m26976getInWholeMillisecondsimpl(DurationKt.toDuration(1, DurationUnit.HOURS))), 1, new C17953W(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p771rg.InterfaceC17996h
    /* JADX INFO: renamed from: a */
    public final Object mo20323a(long j10, C4004l c4004l, Boolean bool, ContinuationImpl continuationImpl) throws Throwable {
        C17954X c17954x;
        if (continuationImpl instanceof C17954X) {
            c17954x = (C17954X) continuationImpl;
            int i10 = c17954x.f55829n;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c17954x.f55829n = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c17954x = new C17954X(this, continuationImpl);
            }
        } else {
            c17954x = new C17954X(this, continuationImpl);
        }
        Object objM811a = c17954x.f55827l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c17954x.f55829n;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM811a);
            a aVar = new a(j10, c4004l, bool, (C2621Q) this.f55816b.getValue());
            c17954x.f55825j = SpillingKt.nullOutSpilledVariable(c4004l);
            c17954x.f55826k = SpillingKt.nullOutSpilledVariable(bool);
            c17954x.f55829n = 1;
            objM811a = this.f55817c.m811a(aVar, c17954x);
            if (objM811a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM811a);
        }
        return ((C0455f) objM811a).f1830b.f1827a;
    }
}
