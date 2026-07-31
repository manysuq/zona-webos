package p674le;

import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import bf.C8215k1;
import bf.C8245x0;
import gf.C11388b;
import ke.C15862o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2008m1;
import p126H.C2032v;
import p126H.C2036x;
import p144I.C2192a;
import p162J.C2387G;
import p162J.C2405d;
import p162J.InterfaceC2388H;
import p214Lf.C3376c;
import p269Og.C3988d;
import p269Og.InterfaceC4011r;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p305Qg.C4605d;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p400W3.C5849c;
import p400W3.C5852f;
import p544ed.InterfaceC10855a;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18036t;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;

/* JADX INFO: renamed from: le.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserCollectionEditorPageM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCollectionEditorPageM.kt\nru/zona/app/screens/collection/edit/UserCollectionEditorPageMKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,117:1\n87#2:118\n84#2,9:119\n94#2:218\n80#3,6:128\n87#3,3:143\n90#3,2:152\n80#3,6:178\n87#3,3:193\n90#3,2:202\n94#3:213\n94#3:217\n80#3,6:250\n87#3,3:265\n90#3,2:274\n94#3:286\n391#4,9:134\n400#4:154\n391#4,9:184\n400#4:204\n401#4,2:211\n401#4,2:215\n391#4,9:256\n400#4:276\n401#4,2:284\n4360#5,6:146\n4360#5,6:196\n4360#5,6:268\n1282#6,6:155\n1282#6,6:161\n1282#6,6:205\n1282#6,6:219\n1282#6,6:225\n1282#6,6:277\n1282#6,6:289\n113#7:167\n113#7:238\n113#7:239\n113#7:283\n70#8:168\n67#8,9:169\n77#8:214\n15#9,7:231\n99#10:240\n96#10,9:241\n106#10:287\n85#11:288\n*S KotlinDebug\n*F\n+ 1 UserCollectionEditorPageM.kt\nru/zona/app/screens/collection/edit/UserCollectionEditorPageMKt\n*L\n47#1:118\n47#1:119,9\n47#1:218\n47#1:128,6\n47#1:143,3\n47#1:152,2\n77#1:178,6\n77#1:193,3\n77#1:202,2\n77#1:213\n47#1:217\n98#1:250,6\n98#1:265,3\n98#1:274,2\n98#1:286\n47#1:134,9\n47#1:154\n77#1:184,9\n77#1:204\n77#1:211,2\n47#1:215,2\n98#1:256,9\n98#1:276\n98#1:284,2\n47#1:146,6\n77#1:196,6\n98#1:268,6\n58#1:155,6\n62#1:161,6\n79#1:205,6\n87#1:219,6\n88#1:225,6\n108#1:277,6\n67#1:289,6\n77#1:167\n102#1:238\n103#1:239\n110#1:283\n77#1:168\n77#1:169,9\n77#1:214\n101#1:231,7\n98#1:240\n98#1:241,9\n98#1:287\n43#1:288\n*E\n"})
public final class C16387e {

    /* JADX INFO: renamed from: le.e$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC10855a) this.receiver).reset();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: le.e$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC10855a) this.receiver).mo12905c();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: le.e$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC10855a) this.receiver).mo12907e();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: le.e$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC10855a) this.receiver).mo12906d();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX INFO: renamed from: a */
    public static final void m19058a(InterfaceC10855a interfaceC10855a, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688r;
        C5753J.a aVar;
        int i11;
        InterfaceC5799g.a.f fVar;
        InterfaceC5799g.a.C21098a c21098a;
        InterfaceC15701v0 interfaceC15701v0;
        int i12;
        ?? r11;
        Object obj;
        int i13;
        final InterfaceC10855a interfaceC10855a2 = interfaceC10855a;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-583352083);
        int i14 = i10 | (c15688rMo18372i.mo18362N(interfaceC10855a2) ? 4 : 2);
        if (c15688rMo18372i.mo18379p(i14 & 1, (i14 & 3) != 2)) {
            final InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC10855a2.getState(), c15688rMo18372i, 0);
            final C5849c c5849cM6693a = C5852f.m6693a(interfaceC10855a2.getEntities(), null, c15688rMo18372i, 1);
            InterfaceC7507e.a aVar2 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM2682b = C2008m1.m2682b(C2008m1.m2681a(C7482g.m8517b(aVar2, 1.0f)));
            C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, c15688rMo18372i, 0);
            long j10 = c15688rMo18372i.f50813T;
            int i15 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM2682b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar3 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar3);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar2);
            InterfaceC5799g.a.C21098a c21098a2 = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i15))) {
                C12269M6.m14188a(i15, c15688rMo18372i, i15, c21098a2);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            String strM18668b = C15862o.m18668b((InterfaceC10855a.a) interfaceC15701v0M18246a.getValue(), c15688rMo18372i);
            Function0<Unit> function0Mo12903a = interfaceC10855a2.mo12903a();
            C4600a c4600aM5210e = C4601b.m5210e();
            boolean z10 = !((InterfaceC10855a.a) interfaceC15701v0M18246a.getValue()).f33687b.isEmpty();
            int i16 = i14 & 14;
            boolean z11 = i16 == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            Object obj2 = InterfaceC15676n.a.f50781a;
            if (z11 || objMo18389z == obj2) {
                aVar = aVar3;
                i11 = i16;
                fVar = fVar2;
                c21098a = c21098a2;
                Object aVar4 = new a(0, interfaceC10855a2, InterfaceC10855a.class, "reset", "reset()V", 0);
                c15688rMo18372i.mo18380q(aVar4);
                objMo18389z = aVar4;
            } else {
                i11 = i16;
                fVar = fVar2;
                c21098a = c21098a2;
                aVar = aVar3;
            }
            C8215k1.m10147a(strM18668b, function0Mo12903a, c4600aM5210e, null, null, z10, (Function0) ((KFunction) objMo18389z), C3376c.f10951l, C3376c.f10965z, c15688rMo18372i, 0, 152);
            if (1.0f <= 0.0d) {
                C2192a.m2845a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(RangesKt.coerceAtMost(1.0f, Float.MAX_VALUE), true);
            int i17 = i11;
            boolean zMo18350B = c15688rMo18372i.mo18350B(c5849cM6693a) | (i17 == 4) | c15688rMo18372i.mo18362N(interfaceC15701v0M18246a);
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (zMo18350B || objMo18389z2 == obj2) {
                objMo18389z2 = new Function1() { // from class: le.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        final C5849c c5849c = c5849cM6693a;
                        int iM6691c = c5849c.m6691c();
                        final InterfaceC10855a interfaceC10855a3 = interfaceC10855a2;
                        final InterfaceC15701v0 interfaceC15701v1 = interfaceC15701v0M18246a;
                        ((InterfaceC2388H) obj3).mo3096c(iM6691c, C2387G.f7851b, new C18036t(1945874305, new Function4() { // from class: le.d
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                int iIntValue = ((Integer) obj5).intValue();
                                InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= interfaceC15676n2.mo18368e(iIntValue) ? 32 : 16;
                                }
                                if (interfaceC15676n2.mo18379p(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    final InterfaceC4011r interfaceC4011r = (InterfaceC4011r) c5849c.m6690b(iIntValue);
                                    if (interfaceC4011r == null) {
                                        return Unit.INSTANCE;
                                    }
                                    final InterfaceC10855a interfaceC10855a4 = interfaceC10855a3;
                                    boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC10855a4) | interfaceC15676n2.mo18350B(interfaceC4011r);
                                    Object objMo18389z3 = interfaceC15676n2.mo18389z();
                                    if (zMo18350B2 || objMo18389z3 == InterfaceC15676n.a.f50781a) {
                                        objMo18389z3 = new Function0() { // from class: le.a
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                interfaceC10855a4.mo12904b(C3988d.m4700a(interfaceC4011r));
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        interfaceC15676n2.mo18380q(objMo18389z3);
                                    }
                                    C11388b.m13419a(interfaceC4011r, (Function0) objMo18389z3, null, true, ((InterfaceC10855a.a) interfaceC15701v1.getValue()).f33687b.contains(C3988d.m4700a(interfaceC4011r)), interfaceC15676n2, 3072, 4);
                                } else {
                                    interfaceC15676n2.mo18356H();
                                }
                                return Unit.INSTANCE;
                            }
                        }, true));
                        return Unit.INSTANCE;
                    }
                };
                c15688rMo18372i.mo18380q(objMo18389z2);
            }
            C2405d.m3106a(layoutWeightElement, null, null, null, null, null, false, null, (Function1) objMo18389z2, c15688rMo18372i, 0, 510);
            InterfaceC7507e interfaceC7507eM8512e = C7481f.m8512e(aVar2, 16, 24);
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j11 = c15688rMo18372i.f50813T;
            int i18 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8512e, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i18))) {
                C12269M6.m14188a(i18, c15688rMo18372i, i18, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            boolean z12 = i17 == 4;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (z12 || objMo18389z3 == obj2) {
                interfaceC15701v0 = interfaceC15701v0M18246a;
                i12 = 0;
                Object bVar = new b(0, interfaceC10855a2, InterfaceC10855a.class, "onDeleteSelectedClick", "onDeleteSelectedClick()V", 0);
                c15688rMo18372i.mo18380q(bVar);
                objMo18389z3 = bVar;
            } else {
                interfaceC15701v0 = interfaceC15701v0M18246a;
                i12 = 0;
            }
            C8245x0.m10154a(null, (Function0) ((KFunction) objMo18389z3), C16973X.m19466e((C16972W) C19140H5.f59847c.getValue(), c15688rMo18372i, i12), null, null, false, !((InterfaceC10855a.a) interfaceC15701v0.getValue()).f33687b.isEmpty(), false, 0L, 0L, null, 0.0f, 0.0f, false, c15688rMo18372i, 0, 0, 16313);
            C15688r c15688r2 = c15688rMo18372i;
            c15688r2.m18410W(true);
            c15688r2.m18410W(true);
            if (((InterfaceC10855a.a) interfaceC15701v0.getValue()).f33689d) {
                c15688r2.mo18363O(-1202514021);
                boolean z13 = i17 == 4;
                Object objMo18389z4 = c15688r2.mo18389z();
                if (z13 || objMo18389z4 == obj2) {
                    r11 = 0;
                    obj = obj2;
                    i13 = i17;
                    Object cVar = new c(0, interfaceC10855a, InterfaceC10855a.class, "deleteSelected", "deleteSelected()V", 0);
                    c15688r2.mo18380q(cVar);
                    objMo18389z4 = cVar;
                } else {
                    i13 = i17;
                    obj = obj2;
                    r11 = 0;
                }
                Function0 function0 = (Function0) ((KFunction) objMo18389z4);
                boolean z14 = i13 == 4;
                Object objMo18389z5 = c15688r2.mo18389z();
                if (z14 || objMo18389z5 == obj) {
                    interfaceC10855a2 = interfaceC10855a;
                    objMo18389z5 = new d(0, interfaceC10855a2, InterfaceC10855a.class, "removeSerialsFromSelected", "removeSerialsFromSelected()V", 0);
                    c15688r2.mo18380q(objMo18389z5);
                } else {
                    interfaceC10855a2 = interfaceC10855a;
                }
                C4605d.m5233a(function0, (Function0) ((KFunction) objMo18389z5), c15688r2, r11);
                c15688r2.m18410W(r11);
                c15688r = c15688r2;
            } else {
                interfaceC10855a2 = interfaceC10855a;
                c15688r2.mo18363O(-1202366027);
                c15688r2.m18410W(false);
                c15688r = c15688r2;
            }
        } else {
            c15688rMo18372i.mo18356H();
            c15688r = c15688rMo18372i;
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10) { // from class: le.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C16387e.m19058a(this.f51917b, (InterfaceC15676n) obj3, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
