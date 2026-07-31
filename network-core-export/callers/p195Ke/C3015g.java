package p195Ke;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p050Cd.InterfaceC0744f;
import p163J0.C2431d;
import p213Le.C3334B;
import p213Le.C3347O;
import p213Le.C3356i;
import p213Le.C3360m;
import p644k0.C15585G1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p843wd.InterfaceC19009W;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Ke.g */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nru/zona/app/screens/player/modals/AspectRatioKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1282#2,6:59\n1282#2,6:65\n1282#2,6:74\n1282#2,6:82\n85#3:71\n85#3:72\n2068#4:73\n2069#4:80\n2068#4:81\n2069#4:88\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nru/zona/app/screens/player/modals/AspectRatioKt\n*L\n26#1:59,6\n46#1:65,6\n33#1:74,6\n54#1:82,6\n23#1:71\n43#1:72\n28#1:73\n28#1:80\n49#1:81\n49#1:88\n*E\n"})
public final class C3015g {

    /* JADX INFO: renamed from: Ke.g$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC0744f) this.receiver).close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Ke.g$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC0744f) this.receiver).close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m3713a(InterfaceC0744f interfaceC0744f, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC0744f interfaceC0744f2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(34346259);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0744f) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0744f.mo1269a(), c15688rMo18372i, 0);
            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60036D.getValue(), c15688rMo18372i, 0);
            boolean z10 = (i11 & 14) == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                interfaceC0744f2 = interfaceC0744f;
                a aVar = new a(0, interfaceC0744f2, InterfaceC0744f.class, "close", "close()V", 0);
                c15688rMo18372i.mo18380q(aVar);
                objMo18389z = aVar;
            } else {
                interfaceC0744f2 = interfaceC0744f;
            }
            C3356i.m4085b(strM19466e, (Function0) ((KFunction) objMo18389z), 0.0f, C18037u.m20404c(1280839334, new Function3() { // from class: Ke.a
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        for (final InterfaceC0744f.a aVar2 : InterfaceC0744f.a.f2723f) {
                            String strM19466e2 = C16973X.m19466e(aVar2.f2724b, interfaceC15676n2, 0);
                            boolean z11 = ((InterfaceC19009W.b) interfaceC15701v0M18246a.getValue()).f59294g == aVar2;
                            C2431d c2431dM5204a = aVar2.f2725c.m5204a(interfaceC15676n2);
                            final InterfaceC0744f interfaceC0744f3 = interfaceC0744f2;
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC0744f3) | interfaceC15676n2.mo18368e(aVar2.ordinal());
                            Object objMo18389z2 = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z2 == InterfaceC15676n.a.f50781a) {
                                objMo18389z2 = new Function0() { // from class: Ke.e
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC0744f3.mo1270b().invoke(aVar2);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z2);
                            }
                            C3334B.m4072a(strM19466e2, c2431dM5204a, null, z11, (Function0) objMo18389z2, interfaceC15676n2, 0, 4);
                        }
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3072, 4);
        } else {
            interfaceC0744f2 = interfaceC0744f;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ke.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C3015g.m3713a(this.f9894b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3714b(InterfaceC0744f interfaceC0744f, InterfaceC15676n interfaceC15676n, final int i10) {
        final InterfaceC0744f interfaceC0744f2;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(243095284);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC0744f) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC0744f.mo1269a(), c15688rMo18372i, 0);
            String strM19466e = C16973X.m19466e((C16972W) C19285c2.f60036D.getValue(), c15688rMo18372i, 0);
            boolean z10 = (i11 & 14) == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                interfaceC0744f2 = interfaceC0744f;
                b bVar = new b(0, interfaceC0744f2, InterfaceC0744f.class, "close", "close()V", 0);
                c15688rMo18372i.mo18380q(bVar);
                objMo18389z = bVar;
            } else {
                interfaceC0744f2 = interfaceC0744f;
            }
            C3360m.m4087b(strM19466e, (Function0) ((KFunction) objMo18389z), C18037u.m20404c(-1755859482, new Function2() { // from class: Ke.c
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 3) != 2)) {
                        for (final InterfaceC0744f.a aVar : InterfaceC0744f.a.f2723f) {
                            String strM19466e2 = C16973X.m19466e(aVar.f2724b, interfaceC15676n2, 0);
                            boolean z11 = ((InterfaceC19009W.b) interfaceC15701v0M18246a.getValue()).f59294g == aVar;
                            C2431d c2431dM5204a = aVar.f2725c.m5204a(interfaceC15676n2);
                            final InterfaceC0744f interfaceC0744f3 = interfaceC0744f2;
                            boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC0744f3) | interfaceC15676n2.mo18368e(aVar.ordinal());
                            Object objMo18389z2 = interfaceC15676n2.mo18389z();
                            if (zMo18350B || objMo18389z2 == InterfaceC15676n.a.f50781a) {
                                objMo18389z2 = new Function0() { // from class: Ke.f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        interfaceC0744f3.mo1270b().invoke(aVar);
                                        return Unit.INSTANCE;
                                    }
                                };
                                interfaceC15676n2.mo18380q(objMo18389z2);
                            }
                            C3347O.m4078a(strM19466e2, z11, c2431dM5204a, (Function0) objMo18389z2, interfaceC15676n2, 0, 0);
                        }
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 3456);
        } else {
            interfaceC0744f2 = interfaceC0744f;
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: Ke.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C3015g.m3714b(this.f9897b, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
