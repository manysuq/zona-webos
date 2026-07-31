package p689mb;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import p065Da.C1110n;
import p478aa.C7106g;
import p644k0.C15585G1;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;

/* JADX INFO: renamed from: mb.X */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStringResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringResources.kt\norg/jetbrains/compose/resources/StringResourcesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,131:1\n1282#2,6:132\n1282#2,6:142\n11158#3:138\n11493#3,3:139\n11158#3:148\n11493#3,3:149\n11158#3:152\n11493#3,3:153\n85#4:156\n85#4:157\n*S KotlinDebug\n*F\n+ 1 StringResources.kt\norg/jetbrains/compose/resources/StringResourcesKt\n*L\n27#1:132,6\n79#1:142,6\n78#1:138\n78#1:139,3\n96#1:148\n96#1:149,3\n117#1:152\n117#1:153,3\n27#1:156\n79#1:157\n*E\n"})
public final class C16973X {

    /* JADX INFO: renamed from: mb.X$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "org.jetbrains.compose.resources.StringResourcesKt", m18778f = "StringResources.kt", m18779i = {}, m18780l = {62}, m18781m = "loadString", m18782n = {}, m18784s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: j */
        public /* synthetic */ Object f53223j;

        /* JADX INFO: renamed from: k */
        public int f53224k;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53223j = obj;
            this.f53224k |= IntCompanionObject.MIN_VALUE;
            return C16973X.m19465d(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mb.X$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "org.jetbrains.compose.resources.StringResourcesKt$stringResource$str$3$1", m18778f = "StringResources.kt", m18779i = {}, m18780l = {28}, m18781m = "invokeSuspend", m18782n = {}, m18784s = {})
    public static final class b extends SuspendLambda implements Function2<C16955E, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: j */
        public int f53225j;

        /* JADX INFO: renamed from: k */
        public /* synthetic */ Object f53226k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C16972W f53227l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC16962L f53228m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C16972W c16972w, InterfaceC16962L interfaceC16962L, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f53227l = c16972w;
            this.f53228m = interfaceC16962L;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f53227l, this.f53228m, continuation);
            bVar.f53226k = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C16955E c16955e, Continuation<? super String> continuation) {
            return ((b) create(c16955e, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f53225j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            C16955E c16955e = (C16955E) this.f53226k;
            this.f53225j = 1;
            Object objM19465d = C16973X.m19465d(this.f53227l, this.f53228m, c16955e, this);
            return objM19465d == coroutine_suspended ? coroutine_suspended : objM19465d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m19462a(C16972W c16972w, Continuation<? super String> continuation) {
        return m19465d(c16972w, C16963M.f53209a, (C16955E) C16957G.f53203c.invoke(), continuation);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m19463b(C16972W c16972w, Object[] objArr, SuspendLambda suspendLambda) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        return m19464c(c16972w, arrayList, C16963M.f53209a, (C16955E) C16957G.f53203c.invoke(), suspendLambda);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m19464c(C16972W c16972w, final ArrayList arrayList, InterfaceC16962L interfaceC16962L, C16955E c16955e, ContinuationImpl continuationImpl) {
        C16974Y c16974y;
        if (continuationImpl instanceof C16974Y) {
            c16974y = (C16974Y) continuationImpl;
            int i10 = c16974y.f53231l;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c16974y.f53231l = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c16974y = new C16974Y(continuationImpl);
            }
        } else {
            c16974y = new C16974Y(continuationImpl);
        }
        Object objM19465d = c16974y.f53230k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c16974y.f53231l;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM19465d);
            c16974y.f53229j = arrayList;
            c16974y.f53231l = 1;
            objM19465d = m19465d(c16972w, interfaceC16962L, c16955e, c16974y);
            if (objM19465d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = c16974y.f53229j;
            ResultKt.throwOnFailure(objM19465d);
        }
        return C16981c0.f53252a.replace((String) objM19465d, new Function1() { // from class: mb.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (CharSequence) arrayList.get(Integer.parseInt(((MatchResult) obj).getGroupValues().get(1)) - 1);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m19465d(C16972W c16972w, InterfaceC16962L interfaceC16962L, C16955E c16955e, Continuation<? super String> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f53224k;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                aVar.f53224k = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objM19470a = aVar.f53223j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f53224k;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM19470a);
            C16961K c16961kM19455a = C16957G.m19455a(c16972w, c16955e);
            aVar.f53224k = 1;
            objM19470a = C16981c0.m19470a(c16961kM19455a, interfaceC16962L, aVar);
            if (objM19470a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM19470a);
        }
        return ((C16971V) objM19470a).f53222a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final String m19466e(C16972W c16972w, InterfaceC15676n interfaceC15676n, int i10) {
        interfaceC15676n.mo18363O(-1520244580);
        InterfaceC16962L interfaceC16962LM19459a = C16964N.m19459a(C16963M.f53210b, interfaceC15676n);
        interfaceC15676n.mo18363O(1773673164);
        Object objMo18389z = interfaceC15676n.mo18389z();
        Object obj = InterfaceC15676n.a.f50781a;
        if (objMo18389z == obj) {
            objMo18389z = new C1110n(1);
            interfaceC15676n.mo18380q(objMo18389z);
        }
        interfaceC15676n.mo18357I();
        interfaceC15676n.mo18363O(1773673478);
        boolean zMo18350B = ((((i10 & 14) ^ 6) > 4 && interfaceC15676n.mo18362N(c16972w)) || (i10 & 6) == 4) | interfaceC15676n.mo18350B(interfaceC16962LM19459a);
        Object objMo18389z2 = interfaceC15676n.mo18389z();
        if (zMo18350B || objMo18389z2 == obj) {
            objMo18389z2 = new b(c16972w, interfaceC16962LM19459a, null);
            interfaceC15676n.mo18380q(objMo18389z2);
        }
        Function2 function2 = (Function2) objMo18389z2;
        interfaceC15676n.mo18357I();
        interfaceC15676n.mo18363O(-2043354779);
        C16955E c16955eMo19456a = ((InterfaceC16984e) interfaceC15676n.mo18383t(C16957G.f53202b)).mo19456a(interfaceC15676n);
        interfaceC15676n.mo18363O(406036355);
        boolean zMo18362N = interfaceC15676n.mo18362N(c16972w) | interfaceC15676n.mo18362N(c16955eMo19456a);
        Object objMo18389z3 = interfaceC15676n.mo18389z();
        if (zMo18362N || objMo18389z3 == obj) {
            objMo18389z3 = C15585G1.m18250e(C7106g.m8046d(EmptyCoroutineContext.INSTANCE, new C16965O(function2, c16955eMo19456a, null)));
            interfaceC15676n.mo18380q(objMo18389z3);
        }
        interfaceC15676n.mo18357I();
        interfaceC15676n.mo18357I();
        String str = (String) ((InterfaceC15701v0) objMo18389z3).getValue();
        interfaceC15676n.mo18357I();
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final String m19467f(C16972W c16972w, Object[] objArr, InterfaceC15676n interfaceC15676n) {
        interfaceC15676n.mo18363O(-217376913);
        InterfaceC16962L interfaceC16962LM19459a = C16964N.m19459a(C16963M.f53210b, interfaceC15676n);
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        interfaceC15676n.mo18363O(1773732844);
        Object objMo18389z = interfaceC15676n.mo18389z();
        Object obj2 = InterfaceC15676n.a.f50781a;
        if (objMo18389z == obj2) {
            objMo18389z = new C1110n(1);
            interfaceC15676n.mo18380q(objMo18389z);
        }
        interfaceC15676n.mo18357I();
        interfaceC15676n.mo18363O(1773733164);
        boolean zMo18362N = interfaceC15676n.mo18362N(c16972w) | interfaceC15676n.mo18350B(arrayList) | interfaceC15676n.mo18350B(interfaceC16962LM19459a);
        Object objMo18389z2 = interfaceC15676n.mo18389z();
        if (zMo18362N || objMo18389z2 == obj2) {
            objMo18389z2 = new C16975Z(c16972w, arrayList, interfaceC16962LM19459a, null);
            interfaceC15676n.mo18380q(objMo18389z2);
        }
        interfaceC15676n.mo18357I();
        String str = (String) C16968S.m19461b(c16972w, arrayList, (Function2) objMo18389z2, interfaceC15676n).getValue();
        interfaceC15676n.mo18357I();
        return str;
    }
}
