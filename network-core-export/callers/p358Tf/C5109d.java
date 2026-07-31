package p358Tf;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.platform.C7586d;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.classfile.ByteCode;
import org.mozilla.javascript.Parser;
import p050Cd.InterfaceC0744f;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p304Qf.C4600a;
import p304Qf.C4601b;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p607i9.C12269M6;
import p644k0.C15623T1;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p689mb.C16972W;
import p689mb.C16973X;
import p689mb.C16987h;
import p830w0.InterfaceC18861d;
import p845wg.C19140H5;
import p845wg.C19142I0;
import p845wg.C19285c2;

/* JADX INFO: renamed from: Tf.d */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nBottomControlsM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomControlsM.kt\nru/zona/app/ui/player/BottomControlsMKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,70:1\n113#2:71\n99#3,6:72\n106#3:108\n80#4,6:78\n87#4,3:93\n90#4,2:102\n94#4:107\n391#5,9:84\n400#5,3:104\n4360#6,6:96\n*S KotlinDebug\n*F\n+ 1 BottomControlsM.kt\nru/zona/app/ui/player/BottomControlsMKt\n*L\n37#1:71\n35#1:72,6\n35#1:108\n35#1:78,6\n35#1:93,3\n35#1:102,2\n35#1:107\n35#1:84,9\n35#1:104,3\n35#1:96,6\n*E\n"})
public final class C5109d {
    /* JADX INFO: renamed from: a */
    public static final void m5607a(final int i10, final InterfaceC0744f.a aVar, InterfaceC15676n interfaceC15676n, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final boolean z10, final boolean z11) {
        InterfaceC7507e.a aVar2;
        boolean z12;
        int i11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1675450380);
        int i12 = i10 | (c15688rMo18372i.mo18364a(z10) ? 4 : 2) | (c15688rMo18372i.mo18364a(z11) ? 32 : 16) | (c15688rMo18372i.mo18368e(aVar.ordinal()) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function1) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE) | (c15688rMo18372i.mo18350B(function2) ? 131072 : Parser.ARGC_LIMIT) | (c15688rMo18372i.mo18350B(function3) ? 1048576 : 524288);
        if (c15688rMo18372i.mo18379p(i12 & 1, (i12 & 599187) != 599186)) {
            InterfaceC7507e.a aVar3 = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(aVar3, 1.0f);
            C1982e.j jVar = C1982e.f6637a;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2646h(16, InterfaceC18861d.a.f58760n), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i13 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar4 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar4);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i13))) {
                C12269M6.m14188a(i13, c15688rMo18372i, i13, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            InterfaceC7507e interfaceC7507eM8700a = C7586d.m8700a(aVar3, "test_tag_streams_button");
            C4600a c4600aM5228w = C4601b.m5228w();
            Lazy lazy = C19285c2.f60076Y;
            int i14 = i12 << 9;
            C5128k0.m5617a(interfaceC7507eM8700a, C16973X.m19466e((C16972W) lazy.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) lazy.getValue(), c15688rMo18372i, 0), c4600aM5228w, false, false, 0L, 0.0f, function2, c15688rMo18372i, (i14 & 234881024) | 6, 240);
            c15688rMo18372i = c15688rMo18372i;
            if (function3 != null) {
                c15688rMo18372i.mo18363O(1384419633);
                C4600a c4600aM5216k = C4601b.m5216k();
                Lazy lazy2 = C19140H5.f59831S;
                z12 = true;
                aVar2 = aVar3;
                i11 = 0;
                C5128k0.m5617a(null, C16973X.m19466e((C16972W) lazy2.getValue(), c15688rMo18372i, 0), C16973X.m19466e((C16972W) lazy2.getValue(), c15688rMo18372i, 0), c4600aM5216k, false, false, 0L, 0.0f, function3, c15688rMo18372i, (i12 << 6) & 234881024, 241);
                c15688rMo18372i = c15688rMo18372i;
                c15688rMo18372i.m18410W(false);
            } else {
                aVar2 = aVar3;
                z12 = true;
                i11 = 0;
                c15688rMo18372i.mo18363O(1384684218);
                c15688rMo18372i.m18410W(false);
            }
            InterfaceC7507e interfaceC7507eM8700a2 = C7586d.m8700a(aVar2, "test_tag_subtitles_button");
            C4600a c4600a = new C4600a((C16987h) C19142I0.f59916n.getValue(), (C16987h) C19142I0.f59915m.getValue());
            Lazy lazy3 = C19140H5.f59818L0;
            int i15 = i12 << 15;
            C5128k0.m5617a(interfaceC7507eM8700a2, C16973X.m19466e((C16972W) lazy3.getValue(), c15688rMo18372i, i11), C16973X.m19466e((C16972W) lazy3.getValue(), c15688rMo18372i, i11), c4600a, z11, z10, 0L, 0.0f, function0, c15688rMo18372i, (i14 & 57344) | 6 | (458752 & i15) | (i15 & 234881024), ByteCode.CHECKCAST);
            C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19285c2.f60036D.getValue(), c15688rMo18372i, i11), aVar.f2725c, false, false, 0L, 0.0f, function1, c15688rMo18372i, (i12 << 12) & 234881024, 243);
            c15688rMo18372i.m18410W(z12);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(i10, aVar, function0, function1, function2, function3, z10, z11) { // from class: Tf.c

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f16867b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f16868c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ InterfaceC0744f.a f16869d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f16870e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f16871f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ Function0 f16872g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ Function0 f16873h;

                {
                    this.f16867b = z10;
                    this.f16868c = z11;
                    this.f16869d = aVar;
                    this.f16870e = function0;
                    this.f16871f = function1;
                    this.f16872g = function2;
                    this.f16873h = function3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C5109d.m5607a(C15636Z0.m18294a(1), this.f16869d, (InterfaceC15676n) obj, this.f16870e, this.f16871f, this.f16872g, this.f16873h, this.f16867b, this.f16868c);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
