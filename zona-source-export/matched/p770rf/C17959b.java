package p770rf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;
import p017Ag.C0160r;
import p017Ag.C0161s;
import p102Fb.C1583c;
import p107Fg.C1634b;
import p431Xg.C6368g;
import p478aa.C7061M;
import p478aa.C7077U0;
import p478aa.C7081W0;
import p478aa.C7083X0;
import p478aa.C7101e0;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p558fa.C11095d;
import p589ha.C11865c;
import p589ha.ExecutorC11864b;
import p897zg.C20963h;
import p897zg.InterfaceC20965j;

/* JADX INFO: renamed from: rf.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C17959b {

    /* JADX INFO: renamed from: i */
    public static final C1634b f55838i;

    /* JADX INFO: renamed from: a */
    public final C1583c f55839a;

    /* JADX INFO: renamed from: b */
    public final C6368g f55840b;

    /* JADX INFO: renamed from: c */
    public final C20963h f55841c;

    /* JADX INFO: renamed from: d */
    public final C20963h f55842d;

    /* JADX INFO: renamed from: e */
    public final C20963h f55843e;

    /* JADX INFO: renamed from: f */
    public final C20963h f55844f;

    /* JADX INFO: renamed from: g */
    public final C20963h f55845g;

    /* JADX INFO: renamed from: h */
    public final C11095d f55846h;

    /* JADX INFO: renamed from: rf.b$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager", m18778f = "ApiHostManager.kt", m18779i = {0, 0}, m18780l = {72}, m18781m = "init", m18782n = {"recognizingApiJob", "recognizingImageJob"}, m18783nl = {76}, m18784s = {"L$0", "L$1"}, m18785v = 2)
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: j */
        public Object f55847j;

        /* JADX INFO: renamed from: k */
        public Object f55848k;

        /* JADX INFO: renamed from: l */
        public /* synthetic */ Object f55849l;

        /* JADX INFO: renamed from: n */
        public int f55851n;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f55849l = obj;
            this.f55851n |= IntCompanionObject.MIN_VALUE;
            return C17959b.this.m20326a(this);
        }
    }

    /* JADX INFO: renamed from: rf.b$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$2", m18778f = "ApiHostManager.kt", m18779i = {1}, m18780l = {53, 58}, m18781m = "invokeSuspend", m18782n = {"e"}, m18783nl = {56, 59}, m18784s = {"L$0"}, m18785v = 2)
    public static final class b extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f55852j;

        /* JADX INFO: renamed from: k */
        public int f55853k;

        /* JADX INFO: renamed from: rf.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$2$host$1", m18778f = "ApiHostManager.kt", m18779i = {}, m18780l = {54}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {-1}, m18784s = {}, m18785v = 2)
        public static final class a extends SuspendLambda implements Function2<C0161s, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: j */
            public int f55855j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ C17959b f55856k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C17959b c17959b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f55856k = c17959b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f55856k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C0161s c0161s, Continuation<? super String> continuation) {
                return ((a) create(c0161s, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f55855j;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                C20963h c20963h = this.f55856k.f55841c;
                this.f55855j = 1;
                Object objMo25478b = c20963h.mo25478b(this);
                return objMo25478b == coroutine_suspended ? coroutine_suspended : objMo25478b;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17959b.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            if (p107Fg.C1637e.m2265c(r0, "SYNC-server host recognize is failed", r12, r11) == r2) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Exception exc;
            C17959b c17959b = C17959b.this;
            C20963h c20963h = c17959b.f55843e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55853k;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    a aVar = new a(c17959b, null);
                    this.f55853k = 1;
                    bVar = this;
                    try {
                        obj = C0160r.m216c("Recognizing SYNC-server host", null, null, aVar, bVar, 30);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        exc = e;
                        C1634b c1634b = C17959b.f55838i;
                        bVar.f55852j = SpillingKt.nullOutSpilledVariable(exc);
                        bVar.f55853k = 2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    bVar = this;
                    exc = e;
                    C1634b c1634b2 = C17959b.f55838i;
                    bVar.f55852j = SpillingKt.nullOutSpilledVariable(exc);
                    bVar.f55853k = 2;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c20963h.m25477a("https://sync.zonasearch.com");
                    return Unit.INSTANCE;
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = this;
                } catch (Exception e12) {
                    exc = e12;
                    bVar = this;
                    C1634b c1634b3 = C17959b.f55838i;
                    bVar.f55852j = SpillingKt.nullOutSpilledVariable(exc);
                    bVar.f55853k = 2;
                }
            }
            c20963h.m25477a((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: rf.b$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$3", m18778f = "ApiHostManager.kt", m18779i = {1}, m18780l = {64, 69}, m18781m = "invokeSuspend", m18782n = {"e"}, m18783nl = {67, 71}, m18784s = {"L$0"}, m18785v = 2)
    public static final class c extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f55857j;

        /* JADX INFO: renamed from: k */
        public int f55858k;

        /* JADX INFO: renamed from: rf.b$c$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$3$host$1", m18778f = "ApiHostManager.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
        public static final class a extends SuspendLambda implements Function2<C0161s, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ C17959b f55860j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C17959b c17959b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f55860j = c17959b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f55860j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C0161s c0161s, Continuation<? super String> continuation) {
                return ((a) create(c0161s, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                C17959b c17959b = this.f55860j;
                C1583c c1583c = c17959b.f55839a;
                String strMo2186b = c1583c.f5191b.mo2186b(c17959b.f55840b);
                return strMo2186b != null ? strMo2186b : c1583c.f5191b.mo2188a();
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17959b.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            if (p107Fg.C1637e.m2265c(r0, "UPDATE-server host recognize is failed", r11, r10) == r1) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Exception exc;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55858k;
            C17959b c17959b = C17959b.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    try {
                        ResultKt.throwOnFailure(obj);
                        cVar = this;
                    } catch (Exception e10) {
                        exc = e10;
                        cVar = this;
                        C1634b c1634b = C17959b.f55838i;
                        cVar.f55857j = SpillingKt.nullOutSpilledVariable(exc);
                        cVar.f55858k = 2;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            try {
                a aVar = new a(c17959b, null);
                this.f55858k = 1;
                cVar = this;
                try {
                    obj = C0160r.m216c("Recognizing update host", null, null, aVar, cVar, 30);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    C1634b c1634b2 = C17959b.f55838i;
                    cVar.f55857j = SpillingKt.nullOutSpilledVariable(exc);
                    cVar.f55858k = 2;
                }
            } catch (Exception e12) {
                e = e12;
                cVar = this;
                exc = e;
                C1634b c1634b3 = C17959b.f55838i;
                cVar.f55857j = SpillingKt.nullOutSpilledVariable(exc);
                cVar.f55858k = 2;
            }
            c17959b.f55844f.m25477a((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: rf.b$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$4", m18778f = "ApiHostManager.kt", m18779i = {}, m18780l = {73, 74}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {74, 75}, m18784s = {}, m18785v = 2)
    public static final class d extends SuspendLambda implements Function2<C0161s, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f55861j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C7077U0 f55862k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C7077U0 f55863l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C7077U0 c7077u0, C7077U0 c7077u1, Continuation continuation) {
            super(2, continuation);
            this.f55862k = c7077u0;
            this.f55863l = c7077u1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f55862k, this.f55863l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C0161s c0161s, Continuation<? super Unit> continuation) {
            return ((d) create(c0161s, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r4.f55863l.mo7934x(r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55861j;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f55861j = 1;
                if (this.f55862k.mo7934x(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
            this.f55861j = 2;
        }
    }

    /* JADX INFO: renamed from: rf.b$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$recognizingApiJob$1", m18778f = "ApiHostManager.kt", m18779i = {1}, m18780l = {33, 38}, m18781m = "invokeSuspend", m18782n = {"e"}, m18783nl = {36, 40}, m18784s = {"L$0"}, m18785v = 2)
    public static final class e extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f55864j;

        /* JADX INFO: renamed from: k */
        public int f55865k;

        /* JADX INFO: renamed from: rf.b$e$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$recognizingApiJob$1$host$1", m18778f = "ApiHostManager.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
        public static final class a extends SuspendLambda implements Function2<C0161s, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ C17959b f55867j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C17959b c17959b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f55867j = c17959b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f55867j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C0161s c0161s, Continuation<? super String> continuation) {
                return ((a) create(c0161s, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                C17959b c17959b = this.f55867j;
                return c17959b.f55839a.m2183a(c17959b.f55840b);
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17959b.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            if (p107Fg.C1637e.m2265c(r0, "API host recognize is failed", r11, r10) == r1) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Exception exc;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55865k;
            C17959b c17959b = C17959b.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    try {
                        ResultKt.throwOnFailure(obj);
                        eVar = this;
                    } catch (Exception e10) {
                        exc = e10;
                        eVar = this;
                        C1634b c1634b = C17959b.f55838i;
                        eVar.f55864j = SpillingKt.nullOutSpilledVariable(exc);
                        eVar.f55865k = 2;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            try {
                a aVar = new a(c17959b, null);
                this.f55865k = 1;
                eVar = this;
                try {
                    obj = C0160r.m216c("Recognizing API host", null, null, aVar, eVar, 30);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    C1634b c1634b2 = C17959b.f55838i;
                    eVar.f55864j = SpillingKt.nullOutSpilledVariable(exc);
                    eVar.f55865k = 2;
                }
            } catch (Exception e12) {
                e = e12;
                eVar = this;
                exc = e;
                C1634b c1634b3 = C17959b.f55838i;
                eVar.f55864j = SpillingKt.nullOutSpilledVariable(exc);
                eVar.f55865k = 2;
            }
            c17959b.f55842d.m25477a((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: rf.b$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$recognizingImageJob$1", m18778f = "ApiHostManager.kt", m18779i = {1}, m18780l = {43, 48}, m18781m = "invokeSuspend", m18782n = {"e"}, m18783nl = {46, 50}, m18784s = {"L$0"}, m18785v = 2)
    public static final class f extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f55868j;

        /* JADX INFO: renamed from: k */
        public int f55869k;

        /* JADX INFO: renamed from: rf.b$f$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @DebugMetadata(m18777c = "ru.zona.app.services.ApiHostManager$init$recognizingImageJob$1$host$1", m18778f = "ApiHostManager.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
        public static final class a extends SuspendLambda implements Function2<C0161s, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ C17959b f55871j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C17959b c17959b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f55871j = c17959b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f55871j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C0161s c0161s, Continuation<? super String> continuation) {
                return ((a) create(c0161s, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                C17959b c17959b = this.f55871j;
                C1583c c1583c = c17959b.f55839a;
                String strMo2186b = c1583c.f5193d.mo2186b(c17959b.f55840b);
                return strMo2186b != null ? strMo2186b : c1583c.f5193d.mo2188a();
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17959b.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            if (p107Fg.C1637e.m2265c(r0, "IMAGE host recognize is failed", r11, r10) == r1) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            f fVar;
            Exception exc;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55869k;
            C17959b c17959b = C17959b.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    try {
                        ResultKt.throwOnFailure(obj);
                        fVar = this;
                    } catch (Exception e10) {
                        exc = e10;
                        fVar = this;
                        C1634b c1634b = C17959b.f55838i;
                        fVar.f55868j = SpillingKt.nullOutSpilledVariable(exc);
                        fVar.f55869k = 2;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            try {
                a aVar = new a(c17959b, null);
                this.f55869k = 1;
                fVar = this;
                try {
                    obj = C0160r.m216c("Recognizing IMAGE host", null, null, aVar, fVar, 30);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    C1634b c1634b2 = C17959b.f55838i;
                    fVar.f55868j = SpillingKt.nullOutSpilledVariable(exc);
                    fVar.f55869k = 2;
                }
            } catch (Exception e12) {
                e = e12;
                fVar = this;
                exc = e;
                C1634b c1634b3 = C17959b.f55838i;
                fVar.f55868j = SpillingKt.nullOutSpilledVariable(exc);
                fVar.f55869k = 2;
            }
            c17959b.f55845g.m25477a((String) obj);
            return Unit.INSTANCE;
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C17959b.class).getSimpleName();
        f55838i = new C1634b();
    }

    public C17959b(C1583c c1583c, C6368g c6368g, C20963h c20963h) {
        this.f55839a = c1583c;
        this.f55840b = c6368g;
        this.f55841c = c20963h;
        InterfaceC20965j.a aVar = InterfaceC20965j.a.f72022c;
        this.f55842d = new C20963h(aVar, "api");
        this.f55843e = new C20963h(aVar, "sync");
        this.f55844f = new C20963h(aVar, "update");
        this.f55845g = new C20963h(aVar, "image");
        C7081W0 c7081w0M8017a = C7083X0.m8017a();
        C11865c c11865c = C7101e0.f23142a;
        this.f55846h = C7061M.m7996a(CoroutineContext.Element.DefaultImpls.plus(c7081w0M8017a, ExecutorC11864b.f37309c));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m20326a(Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f55851n;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                aVar.f55851n = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                aVar = new a((ContinuationImpl) continuation);
            }
        } else {
            aVar = new a((ContinuationImpl) continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f55849l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = aVar2.f55851n;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            e eVar = new e(null);
            C11095d c11095d = this.f55846h;
            C7077U0 c7077u0M8045c = C7106g.m8045c(c11095d, null, null, eVar, 3);
            C7077U0 c7077u0M8045c2 = C7106g.m8045c(c11095d, null, null, new f(null), 3);
            C7106g.m8045c(c11095d, null, null, new b(null), 3);
            C7106g.m8045c(c11095d, null, null, new c(null), 3);
            d dVar = new d(c7077u0M8045c, c7077u0M8045c2, null);
            aVar2.f55847j = SpillingKt.nullOutSpilledVariable(c7077u0M8045c);
            aVar2.f55848k = SpillingKt.nullOutSpilledVariable(c7077u0M8045c2);
            aVar2.f55851n = 1;
            if (C0160r.m216c("Waiting for recognize mandatory hosts", null, null, dVar, aVar2, 30) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
