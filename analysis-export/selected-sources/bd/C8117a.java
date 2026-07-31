package bd;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.mozilla.classfile.ByteCode;
import org.mozilla.javascript.ES6Iterator;
import p002A1.C0021a;
import p092F1.C1473c;
import p106Ff.C1627f;
import p106Ff.C1629h;
import p106Ff.C1630i;
import p114G5.C1716d;
import p114G5.C1719g;
import p114G5.InterfaceC1715c;
import p179Jg.C2627f;
import p269Og.C3986c;
import p269Og.C3988d;
import p269Og.EnumC3994g;
import p269Og.InterfaceC4008o;
import p302Qd.C4586c;
import p320Rd.C4767e;
import p366U5.InterfaceC5372f;
import p382V3.C5581S;
import p382V3.C5609g;
import p382V3.C5628p0;
import p382V3.C5630q0;
import p382V3.C5634s0;
import p384V5.InterfaceC5655c;
import p402W5.InterfaceC5862d;
import p410Wd.InterfaceC5926k;
import p420X5.C6224b;
import p438Y5.InterfaceC6450f;
import p478aa.C7101e0;
import p524da.C10416c0;
import p524da.C10426h0;
import p524da.C10427i;
import p524da.C10428i0;
import p524da.C10430j0;
import p524da.C10454v0;
import p524da.C10456w0;
import p524da.InterfaceC10423g;
import p524da.InterfaceC10425h;
import p524da.InterfaceC10444q0;
import p524da.InterfaceC10452u0;
import p546eh.C10897b;
import p558fa.C11095d;
import p580h1.C11731N;
import p589ha.C11865c;
import p589ha.ExecutorC11864b;
import p676lg.C16436c;
import p676lg.C16437d;
import p770rf.InterfaceC17978p;
import p771rg.InterfaceC17990b;
import p784sf.C18187b;
import p784sf.C18187b.a;
import p784sf.C18189d;
import p784sf.C18189d.a;
import sd.C18155m;
import sd.C18164v;
import sd.C18165w;
import sd.InterfaceC18168z;
import sg.C18208f;
import wf.C19076g;

/* JADX INFO: renamed from: bd.a */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCatalogComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogComponent.kt\nru/zona/app/components/catalog/CatalogComponent\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,92:1\n49#2:93\n51#2:97\n45#3:94\n49#3:96\n105#4:95\n189#5:98\n230#6,5:99\n*S KotlinDebug\n*F\n+ 1 CatalogComponent.kt\nru/zona/app/components/catalog/CatalogComponent\n*L\n39#1:93\n39#1:97\n39#1:94\n39#1:96\n39#1:95\n51#1:98\n69#1:99,5\n*E\n"})
public final class C8117a implements InterfaceC8118b, InterfaceC1715c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1715c f27970b;

    /* JADX INFO: renamed from: c */
    public final EnumC3994g f27971c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17978p f27972d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC18168z f27973e;

    /* JADX INFO: renamed from: f */
    public final C16437d f27974f;

    /* JADX INFO: renamed from: g */
    public final FunctionReferenceImpl f27975g;

    /* JADX INFO: renamed from: h */
    public final FunctionReferenceImpl f27976h;

    /* JADX INFO: renamed from: i */
    public final C11095d f27977i;

    /* JADX INFO: renamed from: j */
    public final C10428i0 f27978j;

    /* JADX INFO: renamed from: k */
    public final C10454v0 f27979k;

    /* JADX INFO: renamed from: l */
    public final C10426h0 f27980l;

    /* JADX INFO: renamed from: m */
    public final C4767e f27981m;

    /* JADX INFO: renamed from: bd.a$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.catalog.CatalogComponent$entities$1", m18778f = "CatalogComponent.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function3<C18164v, Boolean, Continuation<? super Pair<? extends C18164v, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: j */
        public /* synthetic */ C18164v f27982j;

        /* JADX INFO: renamed from: k */
        public /* synthetic */ boolean f27983k;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(C18164v c18164v, Boolean bool, Continuation<? super Pair<? extends C18164v, ? extends Boolean>> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, continuation);
            aVar.f27982j = c18164v;
            aVar.f27983k = zBooleanValue;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C18164v c18164v = this.f27982j;
            boolean z10 = this.f27983k;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return new Pair(c18164v, Boxing.boxBoolean(z10));
        }
    }

    /* JADX INFO: renamed from: bd.a$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.catalog.CatalogComponent$special$$inlined$flatMapLatest$1", m18778f = "CatalogComponent.kt", m18779i = {0, 0}, m18780l = {ByteCode.ANEWARRAY}, m18781m = "invokeSuspend", m18782n = {"$this$transformLatest", "it"}, m18783nl = {-1}, m18784s = {"L$0", "L$1"}, m18785v = 2)
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 CatalogComponent.kt\nru/zona/app/components/catalog/CatalogComponent\n*L\n1#1,214:1\n52#2,5:215\n*E\n"})
    public static final class b extends SuspendLambda implements Function3<InterfaceC10425h<? super C5634s0<InterfaceC5926k>>, Pair<? extends C18164v, ? extends Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f27984j;

        /* JADX INFO: renamed from: k */
        public /* synthetic */ Object f27985k;

        /* JADX INFO: renamed from: l */
        public /* synthetic */ Object f27986l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C8117a f27987m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, C8117a c8117a) {
            super(3, continuation);
            this.f27987m = c8117a;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC10425h<? super C5634s0<InterfaceC5926k>> interfaceC10425h, Pair<? extends C18164v, ? extends Boolean> pair, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation, this.f27987m);
            bVar.f27985k = interfaceC10425h;
            bVar.f27986l = pair;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v17, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v20, types: [java.util.HashSet] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final InterfaceC17990b interfaceC17990bMo20316d;
            final ?? EmptySet;
            Object value;
            InterfaceC10425h interfaceC10425h = (InterfaceC10425h) this.f27985k;
            Object obj2 = this.f27986l;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f27984j;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) obj2;
                C18164v c18164v = (C18164v) pair.component1();
                boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
                C8117a c8117a = this.f27987m;
                final C16437d c16437d = c8117a.f27974f;
                C11095d c11095d = c8117a.f27977i;
                EnumC3994g enumC3994g = c8117a.f27971c;
                LinkedHashMap linkedHashMap = c16437d.f52042k;
                C18208f c18208f = c16437d.f52033b.f55761a;
                Set<String> set = c18164v.f56507f;
                boolean z10 = c18164v.f56519r;
                boolean z11 = c18164v.f56518q;
                String strM43a = C0021a.m43a(CollectionsKt___CollectionsKt.joinToString$default(set, " ", null, null, 0, null, null, 62, null), " ", CollectionsKt___CollectionsKt.joinToString$default(c18164v.f56508g, " ", null, null, 0, null, new C11731N(1), 30, null));
                String strM43a2 = C0021a.m43a(CollectionsKt___CollectionsKt.joinToString$default(c18164v.f56510i, " ", null, null, 0, null, null, 62, null), " ", CollectionsKt___CollectionsKt.joinToString$default(c18164v.f56511j, " ", null, null, 0, null, new C18165w(), 30, null));
                String str = c18164v.f56502a.f11704a;
                int i11 = c18164v.f56503b;
                int i12 = i11 == 1900 ? 0 : i11;
                int i13 = c18164v.f56504c;
                int i14 = i13 == C18155m.f56490g ? 0 : i13;
                float f10 = c18164v.f56505d;
                float f11 = f10 == 0.0f ? 0.0f : f10;
                float f12 = c18164v.f56506e;
                float f13 = f12 == 10.0f ? 0.0f : f12;
                if (c18164v.f56509h && z11) {
                    strM43a = C1473c.m2035a("& ", strM43a);
                }
                String str2 = strM43a;
                if (c18164v.f56512k && z11) {
                    strM43a2 = C1473c.m2035a("& ", strM43a2);
                }
                C2627f c2627f = new C2627f(str, i12, i14, f11, f13, str2, strM43a2, c18164v.f56513l, c18164v.f56515n, c18164v.f56516o, c18164v.f56517p, 768);
                int iHashCode = c2627f.hashCode();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iHashCode);
                sb2.append(z10);
                String string = sb2.toString();
                InterfaceC10423g c10416c0 = (InterfaceC10423g) linkedHashMap.get(enumC3994g);
                if (!Intrinsics.areEqual(string, c16437d.f52041j) || c16437d.f52040i != enumC3994g || c10416c0 == null || zBooleanValue) {
                    c16437d.f52040i = enumC3994g;
                    c16437d.f52041j = string;
                    int iOrdinal = enumC3994g.ordinal();
                    if (iOrdinal == 1) {
                        interfaceC17990bMo20316d = c18208f.mo20316d(c2627f);
                    } else if (iOrdinal == 2) {
                        interfaceC17990bMo20316d = c18208f.mo20314b(c2627f);
                    } else if (iOrdinal != 4) {
                        interfaceC17990bMo20316d = c18208f.mo20316d(c2627f);
                    } else {
                        C1627f c1627f = c16437d.f52034c;
                        C1629h c1629h = new C1629h(1, c1627f, C1627f.class, "getSportIds", "getSportIds(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        C1630i c1630i = new C1630i(2, c1627f, C1627f.class, "getSportById", "getSportById(Lru/zona/content/models/EntityId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        C11865c c11865c = C7101e0.f23142a;
                        interfaceC17990bMo20316d = new C19076g(c1629h, c1630i, ExecutorC11864b.f37309c);
                    }
                    if (z10) {
                        Set<C10897b> value2 = c16437d.f52035d.f34833a.f34831g.getState().getValue();
                        EmptySet = new HashSet();
                        for (C10897b c10897b : value2) {
                            C3986c.b bVar = C3986c.Companion;
                            String str3 = c10897b.f33793a;
                            bVar.getClass();
                            EmptySet.add(C3986c.b.m4699a(str3));
                        }
                    } else {
                        EmptySet = SetsKt.emptySet();
                    }
                    int i15 = c16437d.f52032a;
                    C10426h0 c10426h0M6291a = C5609g.m6291a(new C5581S(new C5628p0(new Function0() { // from class: lg.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return new C4586c(new C16435b(c16437d, interfaceC17990bMo20316d, EmptySet, null));
                        }
                    }, null), new C5630q0(i15, i15)).f18269e, c11095d);
                    C18189d c18189d = c16437d.f52039h;
                    C18187b c18187b = c18189d.f56590a;
                    c18187b.getClass();
                    c10416c0 = new C10416c0(c10426h0M6291a, C10427i.m12542h(new C10416c0(C10427i.m12542h(new C10430j0(c18187b.new a(null))), c18189d.f56591b.getState(), c18189d.new a(null))), new C16436c(enumC3994g, null));
                    linkedHashMap.put(enumC3994g, c10416c0);
                    if (zBooleanValue) {
                        C10454v0 c10454v0 = c8117a.f27979k;
                        do {
                            value = c10454v0.getValue();
                            ((Boolean) value).getClass();
                        } while (!c10454v0.mo12533d(value, Boolean.FALSE));
                    }
                    Unit unit = Unit.INSTANCE;
                }
                this.f27985k = SpillingKt.nullOutSpilledVariable(interfaceC10425h);
                this.f27986l = SpillingKt.nullOutSpilledVariable(obj2);
                this.f27984j = 1;
                if (C10427i.m12544j(interfaceC10425h, c10416c0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: bd.a$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,111:1\n46#2,4:112\n*E\n"})
    public static final class c implements InterfaceC10423g<InterfaceC8118b.a> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC10423g f27988b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C8117a f27989c;

        /* JADX INFO: renamed from: bd.a$c$a */
        @DebugMetadata(m18777c = "ru.zona.app.components.catalog.CatalogComponent$special$$inlined$map$1", m18778f = "CatalogComponent.kt", m18779i = {0, 0, 0}, m18780l = {112}, m18781m = "collect", m18782n = {"collector", "$completion", "$this$unsafeTransform_u24lambda_u240"}, m18783nl = {115}, m18784s = {"L$0", "L$1", "L$2"}, m18785v = 2)
        public static final class a extends ContinuationImpl {

            /* JADX INFO: renamed from: j */
            public /* synthetic */ Object f27990j;

            /* JADX INFO: renamed from: k */
            public int f27991k;

            /* JADX INFO: renamed from: m */
            public Object f27993m;

            /* JADX INFO: renamed from: n */
            public Object f27994n;

            /* JADX INFO: renamed from: o */
            public Object f27995o;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f27990j = obj;
                this.f27991k |= IntCompanionObject.MIN_VALUE;
                return c.this.mo207e(null, this);
            }
        }

        /* JADX INFO: renamed from: bd.a$c$b */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CatalogComponent.kt\nru/zona/app/components/catalog/CatalogComponent\n*L\n1#1,216:1\n50#2:217\n39#3:218\n*E\n"})
        public static final class b<T> implements InterfaceC10425h {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC10425h f27996b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C8117a f27997c;

            /* JADX INFO: renamed from: bd.a$c$b$a */
            @DebugMetadata(m18777c = "ru.zona.app.components.catalog.CatalogComponent$special$$inlined$map$1$2", m18778f = "CatalogComponent.kt", m18779i = {0, 0, 0, 0}, m18780l = {217}, m18781m = "emit", m18782n = {ES6Iterator.VALUE_PROPERTY, "$completion", ES6Iterator.VALUE_PROPERTY, "$this$map_u24lambda_u240"}, m18783nl = {47}, m18784s = {"L$0", "L$1", "L$2", "L$3"}, m18785v = 2)
            public static final class a extends ContinuationImpl {

                /* JADX INFO: renamed from: j */
                public Object f27998j;

                /* JADX INFO: renamed from: k */
                public /* synthetic */ Object f27999k;

                /* JADX INFO: renamed from: l */
                public int f28000l;

                /* JADX INFO: renamed from: m */
                public Object f28001m;

                /* JADX INFO: renamed from: n */
                public Object f28002n;

                /* JADX INFO: renamed from: o */
                public Object f28003o;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f27999k = obj;
                    this.f28000l |= IntCompanionObject.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(InterfaceC10425h interfaceC10425h, C8117a c8117a) {
                this.f27996b = interfaceC10425h;
                this.f27997c = c8117a;
            }

            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
                */
            @Override // p524da.InterfaceC10425h
            public final java.lang.Object emit(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r42v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
                	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
                	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
                */
        }

        public c(InterfaceC10452u0 interfaceC10452u0, C8117a c8117a) {
            this.f27988b = interfaceC10452u0;
            this.f27989c = c8117a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p524da.InterfaceC10423g
        /* JADX INFO: renamed from: e */
        public final Object mo207e(InterfaceC10425h<? super InterfaceC8118b.a> interfaceC10425h, Continuation continuation) {
            a aVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i10 = aVar.f27991k;
                if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                    aVar.f27991k = i10 - IntCompanionObject.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object obj = aVar.f27990j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = aVar.f27991k;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = new b(interfaceC10425h, this.f27989c);
                aVar.f27993m = SpillingKt.nullOutSpilledVariable(interfaceC10425h);
                aVar.f27994n = SpillingKt.nullOutSpilledVariable(aVar);
                aVar.f27995o = SpillingKt.nullOutSpilledVariable(interfaceC10425h);
                aVar.f27991k = 1;
                if (this.f27988b.mo207e(bVar, aVar) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public C8117a(InterfaceC1715c interfaceC1715c, EnumC3994g enumC3994g, InterfaceC17978p interfaceC17978p, InterfaceC18168z interfaceC18168z, C16437d c16437d, Function1<? super InterfaceC4008o, Unit> function1, Function1<? super EnumC3994g, Unit> function2) {
        this.f27970b = interfaceC1715c;
        this.f27971c = enumC3994g;
        this.f27972d = interfaceC17978p;
        this.f27973e = interfaceC18168z;
        this.f27974f = c16437d;
        this.f27975g = (FunctionReferenceImpl) function1;
        this.f27976h = (FunctionReferenceImpl) function2;
        C11095d c11095dM7048b = C6224b.m7048b(this);
        this.f27977i = c11095dM7048b;
        this.f27978j = C10427i.m12550p(new c(interfaceC18168z.getState(), this), c11095dM7048b, InterfaceC10444q0.a.f32465b, new InterfaceC8118b.a(0));
        C10454v0 c10454v0M12580a = C10456w0.m12580a(Boolean.FALSE);
        this.f27979k = c10454v0M12580a;
        this.f27980l = C5609g.m6291a(C10427i.m12551q(new C10416c0(interfaceC18168z.getState(), c10454v0M12580a, new a(3, null)), new b(null, this)), c11095dM7048b);
        int iOrdinal = enumC3994g.ordinal();
        this.f27981m = new C4767e(C1716d.m2446a(this, iOrdinal != 1 ? iOrdinal != 2 ? "unknownSortComponent" : "serialSortComponent" : "moviesSortComponent"), interfaceC18168z);
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: K */
    public final InterfaceC5372f mo793K() {
        return this.f27970b.mo793K();
    }

    @Override // bd.InterfaceC8118b
    /* JADX INFO: renamed from: a */
    public final void mo10101a() {
        this.f27973e.mo20503e();
    }

    @Override // bd.InterfaceC8118b
    /* JADX INFO: renamed from: b */
    public final EnumC3994g mo10102b() {
        return this.f27971c;
    }

    @Override // bd.InterfaceC8118b
    /* JADX INFO: renamed from: c */
    public final void mo10103c() {
        C10454v0 c10454v0;
        Object value;
        do {
            c10454v0 = this.f27979k;
            value = c10454v0.getValue();
            ((Boolean) value).getClass();
        } while (!c10454v0.mo12533d(value, Boolean.TRUE));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // bd.InterfaceC8118b
    /* JADX INFO: renamed from: d */
    public final void mo10104d(InterfaceC4008o interfaceC4008o) {
        this.f27975g.invoke(C3988d.m4700a(interfaceC4008o));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // bd.InterfaceC8118b
    /* JADX INFO: renamed from: e */
    public final void mo10105e() {
        this.f27976h.invoke(this.f27971c);
    }

    @Override // bd.InterfaceC8118b
    /* JADX INFO: renamed from: f */
    public final C4767e mo10106f() {
        return this.f27981m;
    }

    @Override // bd.InterfaceC8118b
    public final InterfaceC10423g<C5634s0<InterfaceC5926k>> getEntities() {
        return this.f27980l;
    }

    @Override // p114G5.InterfaceC1715c
    public final InterfaceC5862d getLifecycle() {
        return this.f27970b.getLifecycle();
    }

    @Override // bd.InterfaceC8118b
    public final InterfaceC10452u0<InterfaceC8118b.a> getState() {
        return this.f27978j;
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: n */
    public final InterfaceC5655c mo795n() {
        return this.f27970b.mo795n();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: u */
    public final C1719g mo796u() {
        return this.f27970b.mo796u();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: x */
    public final InterfaceC6450f mo797x() {
        return this.f27970b.mo797x();
    }
}
