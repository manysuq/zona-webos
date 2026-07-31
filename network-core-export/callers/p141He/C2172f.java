package p141He;

import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import p019B0.C0173B;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1982e;
import p288Q.C4286K0;
import p304Qf.C4601b;
import p358Tf.C5128k0;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p478aa.InterfaceC7059L;
import p607i9.C12269M6;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p689mb.C16972W;
import p689mb.C16973X;
import p817v1.C18565g;
import p830w0.InterfaceC18861d;
import p843wd.InterfaceC19009W;
import p845wg.C19101C4;
import p845wg.C19278b3;
import p862xf.InterfaceC19677a;

/* JADX INFO: renamed from: He.f */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nChannelCenterControls.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCenterControls.kt\nru/zona/app/screens/player/controls/channel/ChannelCenterControlsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n1282#2,6:110\n1282#2,6:157\n1282#2,6:163\n1282#2,6:169\n113#3:116\n113#3:150\n113#3:151\n113#3:152\n113#3:175\n113#3:209\n113#3:210\n113#3:211\n99#4,6:117\n106#4:156\n99#4,6:176\n106#4:215\n80#5,6:123\n87#5,3:138\n90#5,2:147\n94#5:155\n80#5,6:182\n87#5,3:197\n90#5,2:206\n94#5:214\n391#6,9:129\n400#6:149\n401#6,2:153\n391#6,9:188\n400#6:208\n401#6,2:212\n4360#7,6:141\n4360#7,6:200\n85#8:216\n85#8:217\n*S KotlinDebug\n*F\n+ 1 ChannelCenterControls.kt\nru/zona/app/screens/player/controls/channel/ChannelCenterControlsKt\n*L\n36#1:110,6\n75#1:157,6\n78#1:163,6\n79#1:169,6\n41#1:116\n47#1:150\n53#1:151\n60#1:152\n84#1:175\n89#1:209\n96#1:210\n103#1:211\n39#1:117,6\n39#1:156\n82#1:176,6\n82#1:215\n39#1:123,6\n39#1:138,3\n39#1:147,2\n39#1:155\n82#1:182,6\n82#1:197,3\n82#1:206,2\n82#1:214\n39#1:129,9\n39#1:149\n39#1:153,2\n82#1:188,9\n82#1:208\n82#1:212,2\n39#1:141,6\n82#1:200,6\n36#1:216\n75#1:217\n*E\n"})
public final class C2172f {

    /* JADX INFO: renamed from: He.f$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.player.controls.channel.ChannelCenterControlsKt$ChannelCenterControlsTv$1$1", m18778f = "ChannelCenterControls.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f7168j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f7168j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f7168j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f7168j);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m2821a(final InterfaceC19009W.b bVar, final InterfaceC19677a.a aVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1962132061);
        int i11 = i10 | (c15688rMo18372i.mo18350B(bVar) ? 4 : 2) | (c15688rMo18372i.mo18350B(aVar) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 9363) != 9362)) {
            boolean z10 = (i11 & 14) == 4 || c15688rMo18372i.mo18362N(bVar);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            if (z10 || objMo18389z == InterfaceC15676n.a.f50781a) {
                objMo18389z = C15585G1.m18250e(Boolean.valueOf(bVar.f59292e instanceof InterfaceC19009W.c.C21257c));
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(InterfaceC7507e.a.f24548b, 1.0f);
            C1982e.j jVar = C1982e.f6637a;
            float f10 = 32;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2646h(f10, InterfaceC18861d.a.f58760n), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19101C4.f59701i0.getValue(), c15688rMo18372i, 0), C4601b.m5223r(), false, aVar.f60717d, 0L, f10, function1, c15688rMo18372i, ((i11 << 15) & 234881024) | 12582912, 83);
            C5128k0.m5617a(null, null, C16973X.m19466e(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? (C16972W) C19101C4.f59730x.getValue() : (C16972W) C19101C4.f59652I.getValue(), c15688rMo18372i, 0), ((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C4601b.m5219n() : C4601b.m5221p(), false, false, 0L, f10, function0, c15688rMo18372i, ((i11 << 18) & 234881024) | 12582912, 115);
            C5128k0.m5617a(null, null, C16973X.m19466e((C16972W) C19278b3.f59949J0.getValue(), c15688rMo18372i, 0), C4601b.m5217l(), false, aVar.f60718e, 0L, f10, function2, c15688rMo18372i, ((i11 << 12) & 234881024) | 12582912, 83);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(aVar, function0, function1, function2, i10) { // from class: He.e

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC19677a.a f7164c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f7165d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f7166e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f7167f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(9);
                    C2172f.m2821a(this.f7163b, this.f7164c, this.f7165d, this.f7166e, this.f7167f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m2822b(final InterfaceC19009W.b bVar, final InterfaceC19677a.a aVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, InterfaceC15676n interfaceC15676n, final int i10) {
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(1737513512);
        int i11 = i10 | (c15688rMo18372i.mo18350B(bVar) ? 4 : 2) | (c15688rMo18372i.mo18350B(aVar) ? 32 : 16) | (c15688rMo18372i.mo18350B(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c15688rMo18372i.mo18350B(function1) ? 2048 : 1024) | (c15688rMo18372i.mo18350B(function2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE);
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 9363) != 9362)) {
            boolean z10 = (i11 & 14) == 4 || c15688rMo18372i.mo18362N(bVar);
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (z10 || objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.valueOf(bVar.f59292e instanceof InterfaceC19009W.c.C21257c));
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            Object objMo18389z2 = c15688rMo18372i.mo18389z();
            if (objMo18389z2 == c21235a) {
                objMo18389z2 = C4286K0.m4969a(c15688rMo18372i);
            }
            C0173B c0173b = (C0173B) objMo18389z2;
            Unit unit = Unit.INSTANCE;
            Object objMo18389z3 = c15688rMo18372i.mo18389z();
            if (objMo18389z3 == c21235a) {
                objMo18389z3 = new a(c0173b, null);
                c15688rMo18372i.mo18380q(objMo18389z3);
            }
            C15631X.m18287e(unit, c15688rMo18372i, (Function2) objMo18389z3);
            InterfaceC7507e interfaceC7507eM8517b = C7482g.m8517b(InterfaceC7507e.a.f24548b, 1.0f);
            C1982e.j jVar = C1982e.f6637a;
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2646h(64, InterfaceC18861d.a.f58760n), InterfaceC18861d.a.f58757k, c15688rMo18372i, 54);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8517b, c15688rMo18372i);
            InterfaceC5799g.f19145s1.getClass();
            C5753J.a aVar2 = InterfaceC5799g.a.f19147b;
            c15688rMo18372i.mo18353E();
            if (c15688rMo18372i.f50812S) {
                c15688rMo18372i.mo18355G(aVar2);
            } else {
                c15688rMo18372i.mo18378o();
            }
            C15623T1.m18280a(c1952q0M2608a, c15688rMo18372i, InterfaceC5799g.a.f19152g);
            C15623T1.m18280a(interfaceC15608O0M18405R, c15688rMo18372i, InterfaceC5799g.a.f19151f);
            InterfaceC5799g.a.C21098a c21098a = InterfaceC5799g.a.f19154i;
            if (c15688rMo18372i.f50812S || !Intrinsics.areEqual(c15688rMo18372i.mo18389z(), Integer.valueOf(i12))) {
                C12269M6.m14188a(i12, c15688rMo18372i, i12, c21098a);
            }
            C15623T1.m18280a(interfaceC7507eM8566c, c15688rMo18372i, InterfaceC5799g.a.f19149d);
            float f10 = 48;
            C5128k0.m5618b(null, null, C16973X.m19466e((C16972W) C19101C4.f59701i0.getValue(), c15688rMo18372i, 0), C4601b.m5223r(), new C18565g(f10), null, false, aVar.f60717d, 0L, null, function1, c15688rMo18372i, 24576, (i11 >> 9) & 14, 867);
            C5128k0.m5618b(null, null, C16973X.m19466e(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? (C16972W) C19101C4.f59730x.getValue() : (C16972W) C19101C4.f59652I.getValue(), c15688rMo18372i, 0), ((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C4601b.m5219n() : C4601b.m5221p(), new C18565g(f10), null, false, false, 0L, c0173b, function0, c15688rMo18372i, 805330944, (i11 >> 6) & 14, 483);
            C5128k0.m5618b(null, null, C16973X.m19466e((C16972W) C19278b3.f59949J0.getValue(), c15688rMo18372i, 0), C4601b.m5217l(), new C18565g(f10), null, false, aVar.f60718e, 0L, null, function2, c15688rMo18372i, 24576, (i11 >> 12) & 14, 867);
            c15688rMo18372i.m18410W(true);
        } else {
            c15688rMo18372i.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(aVar, function0, function1, function2, i10) { // from class: He.d

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC19677a.a f7159c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f7160d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Function0 f7161e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Function0 f7162f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(9);
                    C2172f.m2822b(this.f7158b, this.f7159c, this.f7160d, this.f7161e, this.f7162f, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
