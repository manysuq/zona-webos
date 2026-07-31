package p358Tf;

import androidx.compose.foundation.C7468a;
import androidx.compose.foundation.layout.C7479d;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import bf.C8143F0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p055D0.C0946M0;
import p126H.C1956T;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2008m1;
import p126H.C2032v;
import p126H.C2036x;
import p126H.EnumC2007m0;
import p214Lf.C3374a;
import p214Lf.C3376c;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p579h0.C11565Q2;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p775s0.C18037u;
import p776s1.C18050h;
import p830w0.C18863f;
import p830w0.InterfaceC18861d;
import p843wd.InterfaceC19005S;
import p845wg.C19119E6;
import p845wg.C19278b3;
import p862xf.InterfaceC19677a;

/* JADX INFO: renamed from: Tf.Y */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPlayerErrorScreenM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerErrorScreenM.kt\nru/zona/app/ui/player/PlayerErrorScreenMKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,92:1\n70#2:93\n67#2,9:94\n70#2:137\n68#2,8:138\n77#2:221\n77#2:225\n80#3,6:103\n87#3,3:118\n90#3,2:127\n80#3,6:146\n87#3,3:161\n90#3,2:170\n80#3,6:184\n87#3,3:199\n90#3,2:208\n94#3:216\n94#3:220\n94#3:224\n391#4,9:109\n400#4:129\n391#4,9:152\n400#4:172\n391#4,9:190\n400#4:210\n401#4,2:214\n401#4,2:218\n401#4,2:222\n4360#5,6:121\n4360#5,6:164\n4360#5,6:202\n1282#6,6:130\n1282#6,6:227\n1282#6,6:233\n113#7:136\n113#7:211\n113#7:212\n113#7:213\n87#8:173\n83#8,10:174\n94#8:217\n85#9:226\n*S KotlinDebug\n*F\n+ 1 PlayerErrorScreenM.kt\nru/zona/app/ui/player/PlayerErrorScreenMKt\n*L\n40#1:93\n40#1:94,9\n52#1:137\n52#1:138,8\n52#1:221\n40#1:225\n40#1:103,6\n40#1:118,3\n40#1:127,2\n52#1:146,6\n52#1:161,3\n52#1:170,2\n58#1:184,6\n58#1:199,3\n58#1:208,2\n58#1:216\n52#1:220\n40#1:224\n40#1:109,9\n40#1:129\n52#1:152,9\n52#1:172\n58#1:190,9\n58#1:210\n58#1:214,2\n52#1:218,2\n40#1:222,2\n40#1:121,6\n52#1:164,6\n58#1:202,6\n50#1:130,6\n80#1:227,6\n85#1:233,6\n55#1:136\n67#1:211\n72#1:212\n75#1:213\n58#1:173\n58#1:174,10\n58#1:217\n39#1:226\n*E\n"})
public final class C5096Y {

    /* JADX INFO: renamed from: Tf.Y$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((InterfaceC19005S) this.receiver).close();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m5602a(final InterfaceC19005S interfaceC19005S, InterfaceC15676n interfaceC15676n, int i10) {
        C15688r c15688r;
        InterfaceC5799g.a.f fVar;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1065601800);
        int i11 = (c15688rMo18372i.mo18362N(interfaceC19005S) ? 4 : 2) | i10;
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC15701v0 interfaceC15701v0M18246a = C15585G1.m18246a(interfaceC19005S.mo21353c(), c15688rMo18372i, 0);
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(C2008m1.m2681a(C7468a.m8487b(C7482g.m8517b(aVar, 1.0f), C3376c.f10940a, C0946M0.f3382a)), "test_tag_error_loading");
            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, false);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8700a, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
            C15623T1.m18280a(interfaceC5178FM2677d, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, fVar2);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, eVar);
            String str = ((InterfaceC19677a.a) interfaceC15701v0M18246a.getValue()).f60715b;
            String str2 = ((InterfaceC19677a.a) interfaceC15701v0M18246a.getValue()).f60716c;
            boolean z10 = (i11 & 14) == 4;
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                fVar = fVar2;
                a aVar3 = new a(0, interfaceC19005S, InterfaceC19005S.class, "close", "close()V", 0);
                c15688rMo18372i.mo18380q(aVar3);
                objMo18389z = aVar3;
            } else {
                fVar = fVar2;
            }
            C5085S0.m5598b(str, str2, (Function0) ((KFunction) objMo18389z), null, c15688rMo18372i, 0, 8);
            InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C7482g.m8517b(aVar, 1.0f), 56, 0.0f, 2);
            InterfaceC5178F interfaceC5178FM2677d2 = C2000k.m2677d(InterfaceC18861d.a.f58751e, false);
            long j11 = c15688rMo18372i.f50813T;
            int i13 = (int) (j11 ^ (j11 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8513f, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(interfaceC5178FM2677d2, c15688rMo18372i, dVar);
            InterfaceC5799g.a.f fVar3 = fVar;
            C15623T1.m18280a(interfaceC15608O0M18405R2, c15688rMo18372i, fVar3);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c2, c15688rMo18372i, eVar);
            C1982e.k kVar = C1982e.f6639c;
            C18863f.a aVar4 = InterfaceC18861d.a.f58760n;
            C2036x c2036xM2689a = C2032v.m2689a(kVar, aVar4, c15688rMo18372i, 48);
            long j12 = c15688rMo18372i.f50813T;
            int i14 = (int) (j12 ^ (j12 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(aVar, c15688rMo18372i);
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c2036xM2689a, c15688rMo18372i, dVar);
            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688rMo18372i, fVar3);
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i14))) {
                C12269M6.m14188a(i14, c15688rMo18372i, i14, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c3, c15688rMo18372i, eVar);
            C11565Q2.m13480b(interfaceC19005S.getError(), null, 0L, 0L, null, 0L, new C18050h(3), 0L, 0, false, 0, 0, null, C3374a.f10912g, c15688rMo18372i, 0, 0, 130046);
            C1963W0.m2623a(C7482g.m8519d(aVar, 24), c15688rMo18372i);
            float f10 = 16;
            C1956T.m2617c(C7482g.m8518c(aVar, 1.0f), C1982e.m2646h(f10, aVar4), C1982e.m2645g(f10), null, 0, 0, C18037u.m20404c(-2119416191, new Function3() { // from class: Tf.W
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC15676n interfaceC15676n2 = (InterfaceC15676n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (interfaceC15676n2.mo18379p(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strM19466e = C16973X.m19466e((C16972W) C19119E6.f59786r.getValue(), interfaceC15676n2, 0);
                        EnumC2007m0 enumC2007m0 = EnumC2007m0.f6718b;
                        InterfaceC7507e.a aVar5 = InterfaceC7507e.a.f24548b;
                        InterfaceC7507e interfaceC7507eM8504b = C7479d.m8504b(aVar5);
                        final InterfaceC19005S interfaceC19005S2 = interfaceC19005S;
                        boolean zMo18350B = interfaceC15676n2.mo18350B(interfaceC19005S2);
                        Object objMo18389z2 = interfaceC15676n2.mo18389z();
                        InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
                        if (zMo18350B || objMo18389z2 == c21235a) {
                            objMo18389z2 = new Function0() { // from class: Tf.U
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    interfaceC19005S2.mo21352a();
                                    return Unit.INSTANCE;
                                }
                            };
                            interfaceC15676n2.mo18380q(objMo18389z2);
                        }
                        C8143F0.m10123a(interfaceC7507eM8504b, 0.0f, (Function0) objMo18389z2, strM19466e, 0L, 0.0f, 0.0f, interfaceC15676n2, 6);
                        String strM19466e2 = C16973X.m19466e((C16972W) C19278b3.f60018u.getValue(), interfaceC15676n2, 0);
                        InterfaceC7507e interfaceC7507eM8504b2 = C7479d.m8504b(aVar5);
                        boolean zMo18350B2 = interfaceC15676n2.mo18350B(interfaceC19005S2);
                        Object objMo18389z3 = interfaceC15676n2.mo18389z();
                        if (zMo18350B2 || objMo18389z3 == c21235a) {
                            objMo18389z3 = new Function0() { // from class: Tf.V
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    interfaceC19005S2.close();
                                    return Unit.INSTANCE;
                                }
                            };
                            interfaceC15676n2.mo18380q(objMo18389z3);
                        }
                        C8143F0.m10123a(interfaceC7507eM8504b2, 0.0f, (Function0) objMo18389z3, strM19466e2, 0L, 0.0f, 0.0f, interfaceC15676n2, 6);
                    } else {
                        interfaceC15676n2.mo18356H();
                    }
                    return Unit.INSTANCE;
                }
            }, c15688rMo18372i), c15688rMo18372i, 1573302, 56);
            c15688r = c15688rMo18372i;
            c15688r.m18410W(true);
            c15688r.m18410W(true);
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new C5094X(interfaceC19005S, i10, 0);
        }
    }
}
