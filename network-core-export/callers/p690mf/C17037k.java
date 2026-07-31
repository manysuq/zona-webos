package p690mf;

import af.C7329v;
import androidx.compose.foundation.layout.C7481f;
import androidx.compose.foundation.layout.C7482g;
import androidx.compose.p481ui.C7503c;
import androidx.compose.p481ui.InterfaceC7507e;
import androidx.compose.p481ui.focus.C7510a;
import androidx.compose.p481ui.focus.C7511b;
import androidx.compose.p481ui.focus.C7512c;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.ConstantsKt;
import mg.C17055r;
import ne.C17213l0;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p019B0.C0173B;
import p019B0.InterfaceC0179H;
import p034Bf.EnumC0448a;
import p125Gg.EnumC1896d;
import p126H.C1948O0;
import p126H.C1952Q0;
import p126H.C1963W0;
import p126H.C1982e;
import p126H.C2000k;
import p126H.C2032v;
import p126H.C2036x;
import p213Le.C3367t;
import p214Lf.C3376c;
import p250Nf.C3765d;
import p269Og.C3986c;
import p269Og.C3988d;
import p269Og.EnumC3994g;
import p269Og.InterfaceC4011r;
import p288Q.C4286K0;
import p361U0.InterfaceC5178F;
import p397W0.C5753J;
import p397W0.InterfaceC5799g;
import p410Wd.C5917b;
import p410Wd.InterfaceC5926k;
import p478aa.InterfaceC7059L;
import p488b4.C8065v;
import p579h0.C11565Q2;
import p580h1.C11732N0;
import p607i9.C12269M6;
import p640jf.C15456E0;
import p644k0.C15585G1;
import p644k0.C15623T1;
import p644k0.C15631X;
import p644k0.C15634Y0;
import p644k0.C15636Z0;
import p644k0.C15688r;
import p644k0.InterfaceC15608O0;
import p644k0.InterfaceC15676n;
import p644k0.InterfaceC15701v0;
import p664l1.C16318q;
import p675lf.C16407N;
import p675lf.C16409b;
import p689mb.C16972W;
import p689mb.C16973X;
import p786t0.C18233c;
import p817v1.C18580v;
import p830w0.InterfaceC18861d;
import p845wg.C19285c2;
import p881z.C20541F0;

/* JADX INFO: renamed from: mf.k */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCarouselTv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselTv.kt\nru/zona/app/screens/ui/tv/containers/CarouselTvKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 Extensions.kt\nru/zona/app/utils/ExtensionsKt\n*L\n1#1,181:1\n113#2:182\n113#2:239\n113#2:240\n113#2:278\n113#2:347\n113#2:391\n113#2:398\n113#2:399\n1282#3,6:183\n1282#3,6:189\n1282#3,6:196\n1282#3,6:279\n1282#3,6:322\n1282#3,6:332\n1282#3,6:348\n1282#3,6:392\n75#4:195\n87#5:202\n84#5,9:203\n94#5:346\n80#6,6:212\n87#6,3:227\n90#6,2:236\n80#6,6:250\n87#6,3:265\n90#6,2:274\n80#6,6:295\n87#6,3:310\n90#6,2:319\n94#6:330\n94#6:341\n94#6:345\n80#6,6:364\n87#6,3:379\n90#6,2:388\n94#6:402\n391#7,9:218\n400#7:238\n391#7,9:256\n400#7:276\n391#7,9:301\n400#7:321\n401#7,2:328\n401#7,2:339\n401#7,2:343\n391#7,9:370\n400#7:390\n401#7,2:400\n4360#8,6:230\n4360#8,6:268\n4360#8,6:313\n4360#8,6:382\n99#9:241\n97#9,8:242\n106#9:342\n99#9:354\n96#9,9:355\n106#9:403\n2068#10:277\n2069#10:338\n70#11:285\n67#11,9:286\n77#11:331\n85#12:404\n117#12,2:405\n85#12:407\n117#12,2:408\n15#13,7:410\n*S KotlinDebug\n*F\n+ 1 CarouselTv.kt\nru/zona/app/screens/ui/tv/containers/CarouselTvKt\n*L\n61#1:182\n81#1:239\n88#1:240\n93#1:278\n128#1:347\n167#1:391\n176#1:398\n177#1:399\n64#1:183,6\n65#1:189,6\n69#1:196,6\n94#1:279,6\n101#1:322,6\n106#1:332,6\n149#1:348,6\n170#1:392,6\n66#1:195\n67#1:202\n67#1:203,9\n67#1:346\n67#1:212,6\n67#1:227,3\n67#1:236,2\n83#1:250,6\n83#1:265,3\n83#1:274,2\n91#1:295,6\n91#1:310,3\n91#1:319,2\n91#1:330\n83#1:341\n67#1:345\n150#1:364,6\n150#1:379,3\n150#1:388,2\n150#1:402\n67#1:218,9\n67#1:238\n83#1:256,9\n83#1:276\n91#1:301,9\n91#1:321\n91#1:328,2\n83#1:339,2\n67#1:343,2\n150#1:370,9\n150#1:390\n150#1:400,2\n67#1:230,6\n83#1:268,6\n91#1:313,6\n150#1:382,6\n83#1:241\n83#1:242,8\n83#1:342\n150#1:354\n150#1:355,9\n150#1:403\n90#1:277\n90#1:338\n91#1:285\n91#1:286,9\n91#1:331\n64#1:404\n64#1:405,2\n149#1:407\n149#1:408,2\n154#1:410,7\n*E\n"})
public final class C17037k {

    /* JADX INFO: renamed from: mf.k$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.screens.ui.tv.containers.CarouselTvKt$CarouselTv$3$2$1$4$1", m18778f = "CarouselTv.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    public static final class a extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0173B f53434j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0173B c0173b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f53434j = c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f53434j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C0173B.m230b(this.f53434j);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m19491a(final String str, final Function0 function0, final Function0 function1, final float f10, InterfaceC15676n interfaceC15676n, final int i10) {
        String str2;
        int i11;
        C15688r c15688r;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(-1577794580);
        if ((i10 & 6) == 0) {
            str2 = str;
            i11 = (c15688rMo18372i.mo18362N(str2) ? 4 : 2) | i10;
        } else {
            str2 = str;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c15688rMo18372i.mo18350B(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c15688rMo18372i.mo18366c(f10) ? 2048 : 1024;
        }
        if (c15688rMo18372i.mo18379p(i11 & 1, (i11 & 1171) != 1170)) {
            Object objMo18389z = c15688rMo18372i.mo18389z();
            InterfaceC15676n.a.C21235a c21235a = InterfaceC15676n.a.f50781a;
            if (objMo18389z == c21235a) {
                objMo18389z = C15585G1.m18250e(Boolean.FALSE);
                c15688rMo18372i.mo18380q(objMo18389z);
            }
            final InterfaceC15701v0 interfaceC15701v0 = (InterfaceC15701v0) objMo18389z;
            InterfaceC7507e.a aVar = InterfaceC7507e.a.f24548b;
            InterfaceC7507e interfaceC7507eM19499a = C17055r.m19499a(C7481f.m8513f(aVar, f10, 0.0f, 2), function1 != null, new C3367t(function1, 1), c15688rMo18372i, 0);
            C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.f6637a, InterfaceC18861d.a.f58757k, c15688rMo18372i, 48);
            long j10 = c15688rMo18372i.f50813T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            InterfaceC15608O0 interfaceC15608O0M18405R = c15688rMo18372i.m18405R();
            InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM19499a, c15688rMo18372i);
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
            int i13 = i11;
            C11565Q2.m13480b(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, new C11732N0(((Boolean) interfaceC15701v0.getValue()).booleanValue() ? C3376c.f10957r : C3376c.f10951l, C18580v.m21028b(24), new C16318q(900), 0L, 0, 0, C18580v.m21028b(32), 16646136), c15688rMo18372i, i11 & 14, 0, 131070);
            c15688r = c15688rMo18372i;
            C1963W0.m2623a(C7482g.m8529n(aVar, 24), c15688r);
            if (function0 == null) {
                c15688r.mo18363O(-1851014754);
                c15688r.m18410W(false);
            } else {
                c15688r.mo18363O(-1851014753);
                Object objMo18389z2 = c15688r.mo18389z();
                if (objMo18389z2 == c21235a) {
                    objMo18389z2 = new Function1() { // from class: mf.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            C17213l0.m19676a((InterfaceC0179H) obj, interfaceC15701v0);
                            return Unit.INSTANCE;
                        }
                    };
                    c15688r.mo18380q(objMo18389z2);
                }
                float f11 = 8;
                C15456E0.m18110a(C7510a.m8576a(aVar, (Function1) objMo18389z2), null, C16973X.m19466e((C16972W) C19285c2.f60043G0.getValue(), c15688r, 0), null, null, false, function0, false, false, false, null, C3376c.f10965z, 0L, 0L, 0.0f, f11, f11, false, null, c15688r, (i13 << 15) & 3670016, 1769472, 423866);
                c15688r = c15688r;
                c15688r.m18410W(false);
            }
            c15688r.m18410W(true);
        } else {
            c15688r = c15688rMo18372i;
            c15688r.mo18356H();
        }
        C15634Y0 c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2() { // from class: mf.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C17037k.m19491a(str, function0, function1, f10, (InterfaceC15676n) obj, C15636Z0.m18294a(i10 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19492b(final C5917b c5917b, final Function1 function1, final Function0 function0, float f10, InterfaceC15676n interfaceC15676n, final int i10) {
        final float f11;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(2127107582);
        int i11 = i10 | (c15688rMo18372i.mo18350B(c5917b) ? 4 : 2) | (c15688rMo18372i.mo18350B(function1) ? 32 : 16) | 384 | (c15688rMo18372i.mo18350B(function0) ? 2048 : 1024) | 221184;
        if (c15688rMo18372i.mo18379p(i11 & 1, (74899 & i11) != 74898)) {
            float f12 = 16;
            String str = c5917b.f19575b;
            List<InterfaceC5926k> list = c5917b.f19577d;
            if (str == null) {
                str = c5917b.f19576c;
            }
            m19493c(str, list == null ? CollectionsKt.emptyList() : list, function1, null, function0, null, !Intrinsics.areEqual(c5917b.f19578e, list != null ? Integer.valueOf(list.size()) : null), f12, c15688rMo18372i, ((i11 << 3) & 524160) | 12582912, 0);
            f11 = f12;
        } else {
            c15688rMo18372i.mo18356H();
            f11 = f10;
        }
        C15634Y0 c15634y0M18412Y = c15688rMo18372i.m18412Y();
        if (c15634y0M18412Y != null) {
            c15634y0M18412Y.f50634d = new Function2(function1, function0, f11, i10) { // from class: mf.a

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Function1 f53398c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f53399d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ float f53400e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM18294a = C15636Z0.m18294a(1);
                    C17037k.m19492b(this.f53397b, this.f53398c, this.f53399d, this.f53400e, (InterfaceC15676n) obj, iM18294a);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175  */
    /* JADX WARN: Code duplicated, block: B:124:0x0182  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:140:0x020b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:147:0x0282  */
    /* JADX WARN: Code duplicated, block: B:148:0x0286  */
    /* JADX WARN: Code duplicated, block: B:151:0x0293  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:168:0x030b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0323  */
    /* JADX WARN: Code duplicated, block: B:173:0x034e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0352  */
    /* JADX WARN: Code duplicated, block: B:177:0x0365  */
    /* JADX WARN: Code duplicated, block: B:179:0x0373  */
    /* JADX WARN: Code duplicated, block: B:182:0x0381  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    /* JADX WARN: Code duplicated, block: B:186:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x0395  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:193:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:196:0x03db  */
    /* JADX WARN: Code duplicated, block: B:198:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:201:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:205:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x043c  */
    /* JADX WARN: Code duplicated, block: B:213:0x0457  */
    /* JADX WARN: Code duplicated, block: B:216:0x0469  */
    /* JADX WARN: Code duplicated, block: B:217:0x0478 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092 A[PHI: r18
      0x0092: PHI (r18v10 int) = (r18v0 int), (r18v6 int), (r18v7 int) binds: [B:50:0x0090, B:60:0x00ad, B:59:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m19493c(final String str, final List<? extends InterfaceC5926k> list, final Function1<? super C3986c, Unit> function1, Function0<Unit> function0, Function0<Unit> function2, InterfaceC4011r interfaceC4011r, boolean z10, float f10, InterfaceC15676n interfaceC15676n, final int i10, final int i11) {
        Function0<Unit> function3;
        int i12;
        char c10;
        Function0<Unit> function4;
        int i13;
        int i14;
        int i15;
        boolean zMo18350B;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        boolean z12;
        final InterfaceC4011r interfaceC4011r2;
        C15688r c15688r;
        final Function0<Unit> function5;
        final Function0<Unit> function6;
        final boolean z13;
        final float f11;
        C15634Y0 c15634y0M18412Y;
        Function2<? super InterfaceC15676n, ? super Integer, Unit> function7;
        final Function0<Unit> function8;
        int i20;
        final Function0<Unit> function9;
        final InterfaceC4011r interfaceC4011r3;
        final boolean z14;
        final float f12;
        Function0<Unit> function10;
        InterfaceC4011r interfaceC4011r4;
        boolean z15;
        Object objMo18389z;
        Object obj;
        final InterfaceC15701v0 interfaceC15701v0;
        Object objMo18389z2;
        C0173B c0173b;
        boolean z16;
        boolean zMo18362N;
        Object objMo18389z3;
        InterfaceC7507e.a aVar;
        boolean z17;
        float f13;
        int i21;
        C5753J.a aVar2;
        InterfaceC5799g.a.C21098a c21098a;
        Function0<Unit> function11;
        boolean z18;
        Function0<Unit> function12;
        C15688r c15688r2;
        int i22;
        InterfaceC5926k interfaceC5926k;
        EnumC3994g type;
        boolean zMo18362N2;
        Object objMo18389z4;
        InterfaceC7507e interfaceC7507eM8576a;
        boolean z19;
        int i23;
        C5753J.a aVar3;
        InterfaceC5799g.a.C21098a c21098a2;
        boolean z20;
        boolean zMo18350B2;
        Object objMo18389z5;
        String id2;
        Object obj2;
        C0173B c0173b2;
        Object objMo18389z6;
        final Function1<? super C3986c, Unit> function13 = function1;
        C15688r c15688rMo18372i = interfaceC15676n.mo18372i(683325935);
        int i24 = (i10 & 6) == 0 ? (c15688rMo18372i.mo18362N(str) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i24 |= (i10 & 64) == 0 ? c15688rMo18372i.mo18362N(list) : c15688rMo18372i.mo18350B(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i24 |= c15688rMo18372i.mo18350B(function13) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i25 = i11 & 8;
        if (i25 == 0) {
            if ((i10 & 3072) == 0) {
                function3 = function0;
                i24 |= c15688rMo18372i.mo18350B(function3) ? 2048 : 1024;
            }
            i12 = i11 & 16;
            if (i12 != 0) {
                i24 |= 24576;
                function4 = function2;
                c10 = ' ';
            } else {
                c10 = ' ';
                if ((i10 & 24576) == 0) {
                    function4 = function2;
                    if (c15688rMo18372i.mo18350B(function4)) {
                        i13 = 16384;
                    } else {
                        i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i24 |= i13;
                } else {
                    function4 = function2;
                }
            }
            i14 = i11 & 32;
            i15 = 196608;
            if (i14 == 0) {
                i24 |= i15;
            } else if ((i10 & 196608) == 0) {
                if ((i10 & 262144) == 0) {
                    zMo18350B = c15688rMo18372i.mo18362N(interfaceC4011r);
                } else {
                    zMo18350B = c15688rMo18372i.mo18350B(interfaceC4011r);
                }
                if (zMo18350B) {
                    i15 = 131072;
                } else {
                    i15 = Parser.ARGC_LIMIT;
                }
                i24 |= i15;
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                i24 |= 1572864;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i10 & 1572864) == 0) {
                    if (c15688rMo18372i.mo18364a(z11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i24 |= i17;
                }
            }
            i18 = i11 & 128;
            if (i18 != 0) {
                i24 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c15688rMo18372i.mo18366c(f10)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i24 |= i19;
            }
            if ((i24 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c15688rMo18372i.mo18379p(i24 & 1, z12)) {
                if (i25 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                i20 = i24;
                if (i12 != 0) {
                    function9 = null;
                } else {
                    function9 = function4;
                }
                if (i14 != 0) {
                    interfaceC4011r3 = null;
                } else {
                    interfaceC4011r3 = interfaceC4011r;
                }
                z14 = i16 == 0 ? z11 : false;
                if (i18 != 0) {
                    f12 = 16;
                } else {
                    f12 = f10;
                }
                if (list.isEmpty()) {
                    c15634y0M18412Y = c15688rMo18372i.m18412Y();
                    if (c15634y0M18412Y != null) {
                        return;
                    } else {
                        function7 = new Function2() { // from class: mf.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                C17037k.m19493c(str, list, function13, function8, function9, interfaceC4011r3, z14, f12, (InterfaceC15676n) obj3, C15636Z0.m18294a(i10 | 1), i11);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                } else {
                    function10 = function9;
                    interfaceC4011r4 = interfaceC4011r3;
                    z15 = z14;
                    Object[] objArr = new Object[0];
                    objMo18389z = r8.mo18389z();
                    obj = InterfaceC15676n.a.f50781a;
                    if (objMo18389z == obj) {
                        objMo18389z = new C17031e(0);
                        r8.mo18380q(objMo18389z);
                    }
                    interfaceC15701v0 = (InterfaceC15701v0) C18233c.m20550b(objArr, (Function0) objMo18389z, r8, 48);
                    objMo18389z2 = r8.mo18389z();
                    if (objMo18389z2 == obj) {
                        objMo18389z2 = C4286K0.m4969a(r8);
                    }
                    c0173b = (C0173B) objMo18389z2;
                    if (r8.mo18383t(C3765d.f12328a) != EnumC1896d.Tv) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zMo18362N = r8.mo18362N(interfaceC15701v0);
                    objMo18389z3 = r8.mo18389z();
                    if (zMo18362N || objMo18389z3 == obj) {
                        objMo18389z3 = new C8065v(interfaceC15701v0, 1);
                        r8.mo18380q(objMo18389z3);
                    }
                    aVar = InterfaceC7507e.a.f24548b;
                    InterfaceC7507e interfaceC7507eM8518c = C7482g.m8518c(C7511b.m8577a(aVar, (Function1) objMo18389z3), 1.0f);
                    C2036x c2036xM2689a = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, r8, 0);
                    z17 = z16;
                    f13 = f12;
                    long j10 = r8.f50813T;
                    i21 = (int) (j10 ^ (j10 >>> c10));
                    InterfaceC15608O0 interfaceC15608O0M18405R = r8.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c = C7503c.m8566c(interfaceC7507eM8518c, r8);
                    InterfaceC5799g.f19145s1.getClass();
                    aVar2 = InterfaceC5799g.a.f19147b;
                    r8.mo18353E();
                    if (r8.f50812S) {
                        r8.mo18355G(aVar2);
                    } else {
                        r8.mo18378o();
                    }
                    InterfaceC5799g.a.d dVar = InterfaceC5799g.a.f19152g;
                    C15623T1.m18280a(c2036xM2689a, r8, dVar);
                    InterfaceC5799g.a.f fVar = InterfaceC5799g.a.f19151f;
                    C15623T1.m18280a(interfaceC15608O0M18405R, r8, fVar);
                    c21098a = InterfaceC5799g.a.f19154i;
                    function11 = function8;
                    if (r8.f50812S) {
                        z18 = z15;
                    } else {
                        z18 = z15;
                        if (!Intrinsics.areEqual(r8.mo18389z(), Integer.valueOf(i21))) {
                        }
                        InterfaceC5799g.a.e eVar = InterfaceC5799g.a.f19149d;
                        C15623T1.m18280a(interfaceC7507eM8566c, r8, eVar);
                        if (str == null) {
                            r8.mo18363O(211311828);
                            r8.m18410W(false);
                            c15688r2 = r8;
                        } else {
                            r8.mo18363O(211311829);
                            if (z17) {
                                function12 = function10;
                            } else {
                                function12 = null;
                            }
                            m19491a(str, function11, function12, f13, r8, (i20 & 14) | ((i20 >> 6) & 112) | ((i20 >> 12) & 7168));
                            c15688r2 = r8;
                            C1963W0.m2623a(C7482g.m8519d(aVar, 12), c15688r2);
                            Unit unit = Unit.INSTANCE;
                            c15688r2.m18410W(false);
                        }
                        InterfaceC7507e interfaceC7507eM8513f = C7481f.m8513f(C20541F0.m25138b(C7482g.m8518c(aVar, 1.0f), C20541F0.m25137a(c15688r2), true, false), f13, 0.0f, 2);
                        C1952Q0 c1952q0M2608a = C1948O0.m2608a(C1982e.m2645g(16), InterfaceC18861d.a.f58756j, c15688r2, 6);
                        long j11 = c15688r2.f50813T;
                        i22 = (int) (j11 ^ (j11 >>> c10));
                        InterfaceC15608O0 interfaceC15608O0M18405R2 = c15688r2.m18405R();
                        InterfaceC7507e interfaceC7507eM8566c2 = C7503c.m8566c(interfaceC7507eM8513f, c15688r2);
                        c15688r2.mo18353E();
                        if (c15688r2.f50812S) {
                            c15688r2.mo18355G(aVar2);
                        } else {
                            c15688r2.mo18378o();
                        }
                        C15623T1.m18280a(c1952q0M2608a, c15688r2, dVar);
                        C15623T1.m18280a(interfaceC15608O0M18405R2, c15688r2, fVar);
                        if (c15688r2.f50812S || !Intrinsics.areEqual(c15688r2.mo18389z(), Integer.valueOf(i22))) {
                            C12269M6.m14188a(i22, c15688r2, i22, c21098a);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c2, c15688r2, eVar);
                        c15688r2.mo18363O(553036275);
                        for (final InterfaceC5926k interfaceC5926k2 : list) {
                            EnumC0448a enumC0448a = EnumC0448a.f1796c;
                            interfaceC5926k = (InterfaceC5926k) CollectionsKt.firstOrNull((List) list);
                            if (interfaceC5926k != null) {
                                type = interfaceC5926k.getType();
                            } else {
                                type = null;
                            }
                            InterfaceC7507e interfaceC7507eM8529n = C7482g.m8529n(aVar, C7329v.m8152b(enumC0448a, type, c15688r2, 4));
                            zMo18362N2 = c15688r2.mo18362N(interfaceC15701v0) | c15688r2.mo18350B(interfaceC5926k2);
                            objMo18389z4 = c15688r2.mo18389z();
                            if (zMo18362N2 || objMo18389z4 == obj) {
                                objMo18389z4 = new Function1() { // from class: mf.f
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        if (((InterfaceC0179H) obj3).mo235a()) {
                                            interfaceC15701v0.setValue(interfaceC5926k2.getId());
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                c15688r2.mo18380q(objMo18389z4);
                            }
                            interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8529n, (Function1) objMo18389z4);
                            if (Intrinsics.areEqual(interfaceC5926k2.getId(), (String) interfaceC15701v0.getValue())) {
                                c15688r2.mo18363O(552068350);
                                c15688r2.mo18363O(-111352285);
                                interfaceC7507eM8576a = C7512c.m8578a(interfaceC7507eM8576a, c0173b);
                                z19 = false;
                                c15688r2.m18410W(false);
                            } else {
                                z19 = false;
                                c15688r2.mo18363O(552068856);
                            }
                            c15688r2.m18410W(z19);
                            InterfaceC5178F interfaceC5178FM2677d = C2000k.m2677d(InterfaceC18861d.a.f58747a, z19);
                            long j12 = c15688r2.f50813T;
                            i23 = (int) (j12 ^ (j12 >>> c10));
                            InterfaceC15608O0 interfaceC15608O0M18405R3 = c15688r2.m18405R();
                            InterfaceC7507e interfaceC7507eM8566c3 = C7503c.m8566c(interfaceC7507eM8576a, c15688r2);
                            InterfaceC5799g.f19145s1.getClass();
                            aVar3 = InterfaceC5799g.a.f19147b;
                            c15688r2.mo18353E();
                            if (c15688r2.f50812S) {
                                c15688r2.mo18355G(aVar3);
                            } else {
                                c15688r2.mo18378o();
                            }
                            C15623T1.m18280a(interfaceC5178FM2677d, c15688r2, InterfaceC5799g.a.f19152g);
                            C15623T1.m18280a(interfaceC15608O0M18405R3, c15688r2, InterfaceC5799g.a.f19151f);
                            c21098a2 = InterfaceC5799g.a.f19154i;
                            if (c15688r2.f50812S || !Intrinsics.areEqual(c15688r2.mo18389z(), Integer.valueOf(i23))) {
                                C12269M6.m14188a(i23, c15688r2, i23, c21098a2);
                            }
                            C15623T1.m18280a(interfaceC7507eM8566c3, c15688r2, InterfaceC5799g.a.f19149d);
                            if ((i20 & 896) == 256) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            zMo18350B2 = z20 | c15688r2.mo18350B(interfaceC5926k2);
                            objMo18389z5 = c15688r2.mo18389z();
                            if (zMo18350B2 || objMo18389z5 == obj) {
                                objMo18389z5 = new Function0() { // from class: mf.g
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function1.invoke(C3988d.m4700a(interfaceC5926k2));
                                        return Unit.INSTANCE;
                                    }
                                };
                                c15688r2.mo18380q(objMo18389z5);
                            }
                            Function0 function14 = (Function0) objMo18389z5;
                            if (interfaceC4011r4 != null) {
                                id2 = interfaceC4011r4.getId();
                            } else {
                                id2 = null;
                            }
                            int i26 = i20;
                            obj2 = obj;
                            InterfaceC7507e.a aVar4 = aVar;
                            C15688r c15688r3 = c15688r2;
                            c0173b2 = c0173b;
                            C16409b.m19064a(interfaceC5926k2, function14, null, Intrinsics.areEqual(id2, interfaceC5926k2.getId()), false, c15688r3, 0, 20);
                            c15688r2 = c15688r3;
                            c15688r2.m18410W(true);
                            if (Intrinsics.areEqual(interfaceC5926k2.getId(), (String) interfaceC15701v0.getValue())) {
                                c15688r2.mo18363O(105497497);
                                Unit unit2 = Unit.INSTANCE;
                                objMo18389z6 = c15688r2.mo18389z();
                                if (objMo18389z6 == obj2) {
                                    objMo18389z6 = new a(c0173b2, null);
                                    c15688r2.mo18380q(objMo18389z6);
                                }
                                C15631X.m18287e(unit2, c15688r2, (Function2) objMo18389z6);
                                c15688r2.m18410W(false);
                            } else {
                                c15688r2.mo18363O(105630115);
                                c15688r2.m18410W(false);
                            }
                            c0173b = c0173b2;
                            i20 = i26;
                            obj = obj2;
                            aVar = aVar4;
                        }
                        function13 = function1;
                        int i27 = i20;
                        c15688r2.m18410W(false);
                        if (z18 || function10 == null) {
                            function6 = function10;
                            c15688r2.mo18363O(-34654387);
                            c15688r2.m18410W(false);
                        } else {
                            c15688r2.mo18363O(-34816796);
                            InterfaceC5926k interfaceC5926k3 = (InterfaceC5926k) CollectionsKt.firstOrNull((List) list);
                            function6 = function10;
                            C16407N.m19063a(interfaceC5926k3 != null ? interfaceC5926k3.getType() : null, function6, c15688r2, (i27 >> 9) & 112);
                            c15688r2.m18410W(false);
                        }
                        c15688r2.m18410W(true);
                        c15688r2.m18410W(true);
                        function5 = function11;
                        c15688r = c15688r2;
                        interfaceC4011r2 = interfaceC4011r4;
                        z13 = z18;
                        f11 = f13;
                    }
                    C12269M6.m14188a(i21, r8, i21, c21098a);
                    InterfaceC5799g.a.e eVar2 = InterfaceC5799g.a.f19149d;
                    C15623T1.m18280a(interfaceC7507eM8566c, r8, eVar2);
                    if (str == null) {
                        r8.mo18363O(211311828);
                        r8.m18410W(false);
                        c15688r2 = r8;
                    } else {
                        r8.mo18363O(211311829);
                        if (z17) {
                            function12 = function10;
                        } else {
                            function12 = null;
                        }
                        m19491a(str, function11, function12, f13, r8, (i20 & 14) | ((i20 >> 6) & 112) | ((i20 >> 12) & 7168));
                        c15688r2 = r8;
                        C1963W0.m2623a(C7482g.m8519d(aVar, 12), c15688r2);
                        Unit unit3 = Unit.INSTANCE;
                        c15688r2.m18410W(false);
                    }
                    InterfaceC7507e interfaceC7507eM8513f2 = C7481f.m8513f(C20541F0.m25138b(C7482g.m8518c(aVar, 1.0f), C20541F0.m25137a(c15688r2), true, false), f13, 0.0f, 2);
                    C1952Q0 c1952q0M2608a2 = C1948O0.m2608a(C1982e.m2645g(16), InterfaceC18861d.a.f58756j, c15688r2, 6);
                    long j13 = c15688r2.f50813T;
                    i22 = (int) (j13 ^ (j13 >>> c10));
                    InterfaceC15608O0 interfaceC15608O0M18405R4 = c15688r2.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c4 = C7503c.m8566c(interfaceC7507eM8513f2, c15688r2);
                    c15688r2.mo18353E();
                    if (c15688r2.f50812S) {
                        c15688r2.mo18355G(aVar2);
                    } else {
                        c15688r2.mo18378o();
                    }
                    C15623T1.m18280a(c1952q0M2608a2, c15688r2, dVar);
                    C15623T1.m18280a(interfaceC15608O0M18405R4, c15688r2, fVar);
                    if (c15688r2.f50812S) {
                        C12269M6.m14188a(i22, c15688r2, i22, c21098a);
                    } else {
                        C12269M6.m14188a(i22, c15688r2, i22, c21098a);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c4, c15688r2, eVar2);
                    c15688r2.mo18363O(553036275);
                    while (r0.hasNext()) {
                        EnumC0448a enumC0448a2 = EnumC0448a.f1796c;
                        interfaceC5926k = (InterfaceC5926k) CollectionsKt.firstOrNull((List) list);
                        if (interfaceC5926k != null) {
                            type = interfaceC5926k.getType();
                        } else {
                            type = null;
                        }
                        InterfaceC7507e interfaceC7507eM8529n2 = C7482g.m8529n(aVar, C7329v.m8152b(enumC0448a2, type, c15688r2, 4));
                        zMo18362N2 = c15688r2.mo18362N(interfaceC15701v0) | c15688r2.mo18350B(interfaceC5926k2);
                        objMo18389z4 = c15688r2.mo18389z();
                        if (zMo18362N2) {
                            objMo18389z4 = new Function1() { // from class: mf.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    if (((InterfaceC0179H) obj3).mo235a()) {
                                        interfaceC15701v0.setValue(interfaceC5926k2.getId());
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r2.mo18380q(objMo18389z4);
                        } else {
                            objMo18389z4 = new Function1() { // from class: mf.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    if (((InterfaceC0179H) obj3).mo235a()) {
                                        interfaceC15701v0.setValue(interfaceC5926k2.getId());
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r2.mo18380q(objMo18389z4);
                        }
                        interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8529n2, (Function1) objMo18389z4);
                        if (Intrinsics.areEqual(interfaceC5926k2.getId(), (String) interfaceC15701v0.getValue())) {
                            c15688r2.mo18363O(552068350);
                            c15688r2.mo18363O(-111352285);
                            interfaceC7507eM8576a = C7512c.m8578a(interfaceC7507eM8576a, c0173b);
                            z19 = false;
                            c15688r2.m18410W(false);
                        } else {
                            z19 = false;
                            c15688r2.mo18363O(552068856);
                        }
                        c15688r2.m18410W(z19);
                        InterfaceC5178F interfaceC5178FM2677d2 = C2000k.m2677d(InterfaceC18861d.a.f58747a, z19);
                        long j14 = c15688r2.f50813T;
                        i23 = (int) (j14 ^ (j14 >>> c10));
                        InterfaceC15608O0 interfaceC15608O0M18405R5 = c15688r2.m18405R();
                        InterfaceC7507e interfaceC7507eM8566c5 = C7503c.m8566c(interfaceC7507eM8576a, c15688r2);
                        InterfaceC5799g.f19145s1.getClass();
                        aVar3 = InterfaceC5799g.a.f19147b;
                        c15688r2.mo18353E();
                        if (c15688r2.f50812S) {
                            c15688r2.mo18355G(aVar3);
                        } else {
                            c15688r2.mo18378o();
                        }
                        C15623T1.m18280a(interfaceC5178FM2677d2, c15688r2, InterfaceC5799g.a.f19152g);
                        C15623T1.m18280a(interfaceC15608O0M18405R5, c15688r2, InterfaceC5799g.a.f19151f);
                        c21098a2 = InterfaceC5799g.a.f19154i;
                        if (c15688r2.f50812S) {
                            C12269M6.m14188a(i23, c15688r2, i23, c21098a2);
                        } else {
                            C12269M6.m14188a(i23, c15688r2, i23, c21098a2);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c5, c15688r2, InterfaceC5799g.a.f19149d);
                        if ((i20 & 896) == 256) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zMo18350B2 = z20 | c15688r2.mo18350B(interfaceC5926k2);
                        objMo18389z5 = c15688r2.mo18389z();
                        if (zMo18350B2) {
                            objMo18389z5 = new Function0() { // from class: mf.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(C3988d.m4700a(interfaceC5926k2));
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r2.mo18380q(objMo18389z5);
                        } else {
                            objMo18389z5 = new Function0() { // from class: mf.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(C3988d.m4700a(interfaceC5926k2));
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r2.mo18380q(objMo18389z5);
                        }
                        Function0 function15 = (Function0) objMo18389z5;
                        if (interfaceC4011r4 != null) {
                            id2 = interfaceC4011r4.getId();
                        } else {
                            id2 = null;
                        }
                        int i28 = i20;
                        obj2 = obj;
                        InterfaceC7507e.a aVar5 = aVar;
                        C15688r c15688r4 = c15688r2;
                        c0173b2 = c0173b;
                        C16409b.m19064a(interfaceC5926k2, function15, null, Intrinsics.areEqual(id2, interfaceC5926k2.getId()), false, c15688r4, 0, 20);
                        c15688r2 = c15688r4;
                        c15688r2.m18410W(true);
                        if (Intrinsics.areEqual(interfaceC5926k2.getId(), (String) interfaceC15701v0.getValue())) {
                            c15688r2.mo18363O(105497497);
                            Unit unit4 = Unit.INSTANCE;
                            objMo18389z6 = c15688r2.mo18389z();
                            if (objMo18389z6 == obj2) {
                                objMo18389z6 = new a(c0173b2, null);
                                c15688r2.mo18380q(objMo18389z6);
                            }
                            C15631X.m18287e(unit4, c15688r2, (Function2) objMo18389z6);
                            c15688r2.m18410W(false);
                        } else {
                            c15688r2.mo18363O(105630115);
                            c15688r2.m18410W(false);
                        }
                        c0173b = c0173b2;
                        i20 = i28;
                        obj = obj2;
                        aVar = aVar5;
                    }
                    function13 = function1;
                    int i29 = i20;
                    c15688r2.m18410W(false);
                    if (z18) {
                        function6 = function10;
                        c15688r2.mo18363O(-34654387);
                        c15688r2.m18410W(false);
                    } else {
                        function6 = function10;
                        c15688r2.mo18363O(-34654387);
                        c15688r2.m18410W(false);
                    }
                    c15688r2.m18410W(true);
                    c15688r2.m18410W(true);
                    function5 = function11;
                    c15688r = c15688r2;
                    interfaceC4011r2 = interfaceC4011r4;
                    z13 = z18;
                    f11 = f13;
                }
                c15634y0M18412Y.f50634d = function7;
            }
            c15688rMo18372i.mo18356H();
            interfaceC4011r2 = interfaceC4011r;
            c15688r = c15688rMo18372i;
            function5 = function3;
            function6 = function4;
            z13 = z11;
            f11 = f10;
            c15634y0M18412Y = c15688r.m18412Y();
            if (c15634y0M18412Y != null) {
                function7 = new Function2() { // from class: mf.h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        C17037k.m19493c(str, list, function13, function5, function6, interfaceC4011r2, z13, f11, (InterfaceC15676n) obj3, C15636Z0.m18294a(i10 | 1), i11);
                        return Unit.INSTANCE;
                    }
                };
                c15634y0M18412Y.f50634d = function7;
            }
        }
        i24 |= 3072;
        function3 = function0;
        i12 = i11 & 16;
        if (i12 != 0) {
            i24 |= 24576;
            function4 = function2;
            c10 = ' ';
        } else {
            c10 = ' ';
            if ((i10 & 24576) == 0) {
                function4 = function2;
                if (c15688rMo18372i.mo18350B(function4)) {
                    i13 = 16384;
                } else {
                    i13 = ConstantsKt.DEFAULT_BUFFER_SIZE;
                }
                i24 |= i13;
            } else {
                function4 = function2;
            }
        }
        i14 = i11 & 32;
        i15 = 196608;
        if (i14 == 0) {
            i24 |= i15;
        } else if ((i10 & 196608) == 0) {
            if ((i10 & 262144) == 0) {
                zMo18350B = c15688rMo18372i.mo18362N(interfaceC4011r);
            } else {
                zMo18350B = c15688rMo18372i.mo18350B(interfaceC4011r);
            }
            if (zMo18350B) {
                i15 = 131072;
            } else {
                i15 = Parser.ARGC_LIMIT;
            }
            i24 |= i15;
        }
        i16 = i11 & 64;
        if (i16 != 0) {
            i24 |= 1572864;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 1572864) == 0) {
                if (c15688rMo18372i.mo18364a(z11)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i24 |= i17;
            }
        }
        i18 = i11 & 128;
        if (i18 != 0) {
            i24 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c15688rMo18372i.mo18366c(f10)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i24 |= i19;
        }
        if ((i24 & 4793491) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c15688rMo18372i.mo18379p(i24 & 1, z12)) {
            if (i25 != 0) {
                function8 = null;
            } else {
                function8 = function3;
            }
            i20 = i24;
            if (i12 != 0) {
                function9 = null;
            } else {
                function9 = function4;
            }
            if (i14 != 0) {
                interfaceC4011r3 = null;
            } else {
                interfaceC4011r3 = interfaceC4011r;
            }
            if (i16 == 0) {
            }
            if (i18 != 0) {
                f12 = 16;
            } else {
                f12 = f10;
            }
            if (list.isEmpty()) {
                c15634y0M18412Y = c15688rMo18372i.m18412Y();
                if (c15634y0M18412Y != null) {
                    return;
                } else {
                    function7 = new Function2() { // from class: mf.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            C17037k.m19493c(str, list, function13, function8, function9, interfaceC4011r3, z14, f12, (InterfaceC15676n) obj3, C15636Z0.m18294a(i10 | 1), i11);
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                function10 = function9;
                interfaceC4011r4 = interfaceC4011r3;
                z15 = z14;
                Object[] objArr2 = new Object[0];
                objMo18389z = r8.mo18389z();
                obj = InterfaceC15676n.a.f50781a;
                if (objMo18389z == obj) {
                    objMo18389z = new C17031e(0);
                    r8.mo18380q(objMo18389z);
                }
                interfaceC15701v0 = (InterfaceC15701v0) C18233c.m20550b(objArr2, (Function0) objMo18389z, r8, 48);
                objMo18389z2 = r8.mo18389z();
                if (objMo18389z2 == obj) {
                    objMo18389z2 = C4286K0.m4969a(r8);
                }
                c0173b = (C0173B) objMo18389z2;
                if (r8.mo18383t(C3765d.f12328a) != EnumC1896d.Tv) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zMo18362N = r8.mo18362N(interfaceC15701v0);
                objMo18389z3 = r8.mo18389z();
                if (zMo18362N) {
                    objMo18389z3 = new C8065v(interfaceC15701v0, 1);
                    r8.mo18380q(objMo18389z3);
                } else {
                    objMo18389z3 = new C8065v(interfaceC15701v0, 1);
                    r8.mo18380q(objMo18389z3);
                }
                aVar = InterfaceC7507e.a.f24548b;
                InterfaceC7507e interfaceC7507eM8518c2 = C7482g.m8518c(C7511b.m8577a(aVar, (Function1) objMo18389z3), 1.0f);
                C2036x c2036xM2689a2 = C2032v.m2689a(C1982e.f6639c, InterfaceC18861d.a.f58759m, r8, 0);
                z17 = z16;
                f13 = f12;
                long j15 = r8.f50813T;
                i21 = (int) (j15 ^ (j15 >>> c10));
                InterfaceC15608O0 interfaceC15608O0M18405R6 = r8.m18405R();
                InterfaceC7507e interfaceC7507eM8566c6 = C7503c.m8566c(interfaceC7507eM8518c2, r8);
                InterfaceC5799g.f19145s1.getClass();
                aVar2 = InterfaceC5799g.a.f19147b;
                r8.mo18353E();
                if (r8.f50812S) {
                    r8.mo18355G(aVar2);
                } else {
                    r8.mo18378o();
                }
                InterfaceC5799g.a.d dVar2 = InterfaceC5799g.a.f19152g;
                C15623T1.m18280a(c2036xM2689a2, r8, dVar2);
                InterfaceC5799g.a.f fVar2 = InterfaceC5799g.a.f19151f;
                C15623T1.m18280a(interfaceC15608O0M18405R6, r8, fVar2);
                c21098a = InterfaceC5799g.a.f19154i;
                function11 = function8;
                if (r8.f50812S) {
                    z18 = z15;
                    if (!Intrinsics.areEqual(r8.mo18389z(), Integer.valueOf(i21))) {
                    }
                    InterfaceC5799g.a.e eVar3 = InterfaceC5799g.a.f19149d;
                    C15623T1.m18280a(interfaceC7507eM8566c6, r8, eVar3);
                    if (str == null) {
                        r8.mo18363O(211311828);
                        r8.m18410W(false);
                        c15688r2 = r8;
                    } else {
                        r8.mo18363O(211311829);
                        if (z17) {
                            function12 = function10;
                        } else {
                            function12 = null;
                        }
                        m19491a(str, function11, function12, f13, r8, (i20 & 14) | ((i20 >> 6) & 112) | ((i20 >> 12) & 7168));
                        c15688r2 = r8;
                        C1963W0.m2623a(C7482g.m8519d(aVar, 12), c15688r2);
                        Unit unit5 = Unit.INSTANCE;
                        c15688r2.m18410W(false);
                    }
                    InterfaceC7507e interfaceC7507eM8513f3 = C7481f.m8513f(C20541F0.m25138b(C7482g.m8518c(aVar, 1.0f), C20541F0.m25137a(c15688r2), true, false), f13, 0.0f, 2);
                    C1952Q0 c1952q0M2608a3 = C1948O0.m2608a(C1982e.m2645g(16), InterfaceC18861d.a.f58756j, c15688r2, 6);
                    long j16 = c15688r2.f50813T;
                    i22 = (int) (j16 ^ (j16 >>> c10));
                    InterfaceC15608O0 interfaceC15608O0M18405R7 = c15688r2.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c7 = C7503c.m8566c(interfaceC7507eM8513f3, c15688r2);
                    c15688r2.mo18353E();
                    if (c15688r2.f50812S) {
                        c15688r2.mo18355G(aVar2);
                    } else {
                        c15688r2.mo18378o();
                    }
                    C15623T1.m18280a(c1952q0M2608a3, c15688r2, dVar2);
                    C15623T1.m18280a(interfaceC15608O0M18405R7, c15688r2, fVar2);
                    if (c15688r2.f50812S) {
                        C12269M6.m14188a(i22, c15688r2, i22, c21098a);
                    } else {
                        C12269M6.m14188a(i22, c15688r2, i22, c21098a);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c7, c15688r2, eVar3);
                    c15688r2.mo18363O(553036275);
                    while (r0.hasNext()) {
                        EnumC0448a enumC0448a3 = EnumC0448a.f1796c;
                        interfaceC5926k = (InterfaceC5926k) CollectionsKt.firstOrNull((List) list);
                        if (interfaceC5926k != null) {
                            type = interfaceC5926k.getType();
                        } else {
                            type = null;
                        }
                        InterfaceC7507e interfaceC7507eM8529n3 = C7482g.m8529n(aVar, C7329v.m8152b(enumC0448a3, type, c15688r2, 4));
                        zMo18362N2 = c15688r2.mo18362N(interfaceC15701v0) | c15688r2.mo18350B(interfaceC5926k2);
                        objMo18389z4 = c15688r2.mo18389z();
                        if (zMo18362N2) {
                            objMo18389z4 = new Function1() { // from class: mf.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    if (((InterfaceC0179H) obj3).mo235a()) {
                                        interfaceC15701v0.setValue(interfaceC5926k2.getId());
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r2.mo18380q(objMo18389z4);
                        } else {
                            objMo18389z4 = new Function1() { // from class: mf.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    if (((InterfaceC0179H) obj3).mo235a()) {
                                        interfaceC15701v0.setValue(interfaceC5926k2.getId());
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r2.mo18380q(objMo18389z4);
                        }
                        interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8529n3, (Function1) objMo18389z4);
                        if (Intrinsics.areEqual(interfaceC5926k2.getId(), (String) interfaceC15701v0.getValue())) {
                            c15688r2.mo18363O(552068350);
                            c15688r2.mo18363O(-111352285);
                            interfaceC7507eM8576a = C7512c.m8578a(interfaceC7507eM8576a, c0173b);
                            z19 = false;
                            c15688r2.m18410W(false);
                        } else {
                            z19 = false;
                            c15688r2.mo18363O(552068856);
                        }
                        c15688r2.m18410W(z19);
                        InterfaceC5178F interfaceC5178FM2677d3 = C2000k.m2677d(InterfaceC18861d.a.f58747a, z19);
                        long j17 = c15688r2.f50813T;
                        i23 = (int) (j17 ^ (j17 >>> c10));
                        InterfaceC15608O0 interfaceC15608O0M18405R8 = c15688r2.m18405R();
                        InterfaceC7507e interfaceC7507eM8566c8 = C7503c.m8566c(interfaceC7507eM8576a, c15688r2);
                        InterfaceC5799g.f19145s1.getClass();
                        aVar3 = InterfaceC5799g.a.f19147b;
                        c15688r2.mo18353E();
                        if (c15688r2.f50812S) {
                            c15688r2.mo18355G(aVar3);
                        } else {
                            c15688r2.mo18378o();
                        }
                        C15623T1.m18280a(interfaceC5178FM2677d3, c15688r2, InterfaceC5799g.a.f19152g);
                        C15623T1.m18280a(interfaceC15608O0M18405R8, c15688r2, InterfaceC5799g.a.f19151f);
                        c21098a2 = InterfaceC5799g.a.f19154i;
                        if (c15688r2.f50812S) {
                            C12269M6.m14188a(i23, c15688r2, i23, c21098a2);
                        } else {
                            C12269M6.m14188a(i23, c15688r2, i23, c21098a2);
                        }
                        C15623T1.m18280a(interfaceC7507eM8566c8, c15688r2, InterfaceC5799g.a.f19149d);
                        if ((i20 & 896) == 256) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        zMo18350B2 = z20 | c15688r2.mo18350B(interfaceC5926k2);
                        objMo18389z5 = c15688r2.mo18389z();
                        if (zMo18350B2) {
                            objMo18389z5 = new Function0() { // from class: mf.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(C3988d.m4700a(interfaceC5926k2));
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r2.mo18380q(objMo18389z5);
                        } else {
                            objMo18389z5 = new Function0() { // from class: mf.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(C3988d.m4700a(interfaceC5926k2));
                                    return Unit.INSTANCE;
                                }
                            };
                            c15688r2.mo18380q(objMo18389z5);
                        }
                        Function0 function16 = (Function0) objMo18389z5;
                        if (interfaceC4011r4 != null) {
                            id2 = interfaceC4011r4.getId();
                        } else {
                            id2 = null;
                        }
                        int i210 = i20;
                        obj2 = obj;
                        InterfaceC7507e.a aVar6 = aVar;
                        C15688r c15688r5 = c15688r2;
                        c0173b2 = c0173b;
                        C16409b.m19064a(interfaceC5926k2, function16, null, Intrinsics.areEqual(id2, interfaceC5926k2.getId()), false, c15688r5, 0, 20);
                        c15688r2 = c15688r5;
                        c15688r2.m18410W(true);
                        if (Intrinsics.areEqual(interfaceC5926k2.getId(), (String) interfaceC15701v0.getValue())) {
                            c15688r2.mo18363O(105497497);
                            Unit unit6 = Unit.INSTANCE;
                            objMo18389z6 = c15688r2.mo18389z();
                            if (objMo18389z6 == obj2) {
                                objMo18389z6 = new a(c0173b2, null);
                                c15688r2.mo18380q(objMo18389z6);
                            }
                            C15631X.m18287e(unit6, c15688r2, (Function2) objMo18389z6);
                            c15688r2.m18410W(false);
                        } else {
                            c15688r2.mo18363O(105630115);
                            c15688r2.m18410W(false);
                        }
                        c0173b = c0173b2;
                        i20 = i210;
                        obj = obj2;
                        aVar = aVar6;
                    }
                    function13 = function1;
                    int i211 = i20;
                    c15688r2.m18410W(false);
                    if (z18) {
                        function6 = function10;
                        c15688r2.mo18363O(-34654387);
                        c15688r2.m18410W(false);
                    } else {
                        function6 = function10;
                        c15688r2.mo18363O(-34654387);
                        c15688r2.m18410W(false);
                    }
                    c15688r2.m18410W(true);
                    c15688r2.m18410W(true);
                    function5 = function11;
                    c15688r = c15688r2;
                    interfaceC4011r2 = interfaceC4011r4;
                    z13 = z18;
                    f11 = f13;
                } else {
                    z18 = z15;
                }
                C12269M6.m14188a(i21, r8, i21, c21098a);
                InterfaceC5799g.a.e eVar4 = InterfaceC5799g.a.f19149d;
                C15623T1.m18280a(interfaceC7507eM8566c6, r8, eVar4);
                if (str == null) {
                    r8.mo18363O(211311828);
                    r8.m18410W(false);
                    c15688r2 = r8;
                } else {
                    r8.mo18363O(211311829);
                    if (z17) {
                        function12 = function10;
                    } else {
                        function12 = null;
                    }
                    m19491a(str, function11, function12, f13, r8, (i20 & 14) | ((i20 >> 6) & 112) | ((i20 >> 12) & 7168));
                    c15688r2 = r8;
                    C1963W0.m2623a(C7482g.m8519d(aVar, 12), c15688r2);
                    Unit unit7 = Unit.INSTANCE;
                    c15688r2.m18410W(false);
                }
                InterfaceC7507e interfaceC7507eM8513f4 = C7481f.m8513f(C20541F0.m25138b(C7482g.m8518c(aVar, 1.0f), C20541F0.m25137a(c15688r2), true, false), f13, 0.0f, 2);
                C1952Q0 c1952q0M2608a4 = C1948O0.m2608a(C1982e.m2645g(16), InterfaceC18861d.a.f58756j, c15688r2, 6);
                long j18 = c15688r2.f50813T;
                i22 = (int) (j18 ^ (j18 >>> c10));
                InterfaceC15608O0 interfaceC15608O0M18405R9 = c15688r2.m18405R();
                InterfaceC7507e interfaceC7507eM8566c9 = C7503c.m8566c(interfaceC7507eM8513f4, c15688r2);
                c15688r2.mo18353E();
                if (c15688r2.f50812S) {
                    c15688r2.mo18355G(aVar2);
                } else {
                    c15688r2.mo18378o();
                }
                C15623T1.m18280a(c1952q0M2608a4, c15688r2, dVar2);
                C15623T1.m18280a(interfaceC15608O0M18405R9, c15688r2, fVar2);
                if (c15688r2.f50812S) {
                    C12269M6.m14188a(i22, c15688r2, i22, c21098a);
                } else {
                    C12269M6.m14188a(i22, c15688r2, i22, c21098a);
                }
                C15623T1.m18280a(interfaceC7507eM8566c9, c15688r2, eVar4);
                c15688r2.mo18363O(553036275);
                while (r0.hasNext()) {
                    EnumC0448a enumC0448a4 = EnumC0448a.f1796c;
                    interfaceC5926k = (InterfaceC5926k) CollectionsKt.firstOrNull((List) list);
                    if (interfaceC5926k != null) {
                        type = interfaceC5926k.getType();
                    } else {
                        type = null;
                    }
                    InterfaceC7507e interfaceC7507eM8529n4 = C7482g.m8529n(aVar, C7329v.m8152b(enumC0448a4, type, c15688r2, 4));
                    zMo18362N2 = c15688r2.mo18362N(interfaceC15701v0) | c15688r2.mo18350B(interfaceC5926k2);
                    objMo18389z4 = c15688r2.mo18389z();
                    if (zMo18362N2) {
                        objMo18389z4 = new Function1() { // from class: mf.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                if (((InterfaceC0179H) obj3).mo235a()) {
                                    interfaceC15701v0.setValue(interfaceC5926k2.getId());
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r2.mo18380q(objMo18389z4);
                    } else {
                        objMo18389z4 = new Function1() { // from class: mf.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                if (((InterfaceC0179H) obj3).mo235a()) {
                                    interfaceC15701v0.setValue(interfaceC5926k2.getId());
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r2.mo18380q(objMo18389z4);
                    }
                    interfaceC7507eM8576a = C7510a.m8576a(interfaceC7507eM8529n4, (Function1) objMo18389z4);
                    if (Intrinsics.areEqual(interfaceC5926k2.getId(), (String) interfaceC15701v0.getValue())) {
                        c15688r2.mo18363O(552068350);
                        c15688r2.mo18363O(-111352285);
                        interfaceC7507eM8576a = C7512c.m8578a(interfaceC7507eM8576a, c0173b);
                        z19 = false;
                        c15688r2.m18410W(false);
                    } else {
                        z19 = false;
                        c15688r2.mo18363O(552068856);
                    }
                    c15688r2.m18410W(z19);
                    InterfaceC5178F interfaceC5178FM2677d4 = C2000k.m2677d(InterfaceC18861d.a.f58747a, z19);
                    long j19 = c15688r2.f50813T;
                    i23 = (int) (j19 ^ (j19 >>> c10));
                    InterfaceC15608O0 interfaceC15608O0M18405R10 = c15688r2.m18405R();
                    InterfaceC7507e interfaceC7507eM8566c10 = C7503c.m8566c(interfaceC7507eM8576a, c15688r2);
                    InterfaceC5799g.f19145s1.getClass();
                    aVar3 = InterfaceC5799g.a.f19147b;
                    c15688r2.mo18353E();
                    if (c15688r2.f50812S) {
                        c15688r2.mo18355G(aVar3);
                    } else {
                        c15688r2.mo18378o();
                    }
                    C15623T1.m18280a(interfaceC5178FM2677d4, c15688r2, InterfaceC5799g.a.f19152g);
                    C15623T1.m18280a(interfaceC15608O0M18405R10, c15688r2, InterfaceC5799g.a.f19151f);
                    c21098a2 = InterfaceC5799g.a.f19154i;
                    if (c15688r2.f50812S) {
                        C12269M6.m14188a(i23, c15688r2, i23, c21098a2);
                    } else {
                        C12269M6.m14188a(i23, c15688r2, i23, c21098a2);
                    }
                    C15623T1.m18280a(interfaceC7507eM8566c10, c15688r2, InterfaceC5799g.a.f19149d);
                    if ((i20 & 896) == 256) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    zMo18350B2 = z20 | c15688r2.mo18350B(interfaceC5926k2);
                    objMo18389z5 = c15688r2.mo18389z();
                    if (zMo18350B2) {
                        objMo18389z5 = new Function0() { // from class: mf.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(C3988d.m4700a(interfaceC5926k2));
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r2.mo18380q(objMo18389z5);
                    } else {
                        objMo18389z5 = new Function0() { // from class: mf.g
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(C3988d.m4700a(interfaceC5926k2));
                                return Unit.INSTANCE;
                            }
                        };
                        c15688r2.mo18380q(objMo18389z5);
                    }
                    Function0 function17 = (Function0) objMo18389z5;
                    if (interfaceC4011r4 != null) {
                        id2 = interfaceC4011r4.getId();
                    } else {
                        id2 = null;
                    }
                    int i212 = i20;
                    obj2 = obj;
                    InterfaceC7507e.a aVar7 = aVar;
                    C15688r c15688r6 = c15688r2;
                    c0173b2 = c0173b;
                    C16409b.m19064a(interfaceC5926k2, function17, null, Intrinsics.areEqual(id2, interfaceC5926k2.getId()), false, c15688r6, 0, 20);
                    c15688r2 = c15688r6;
                    c15688r2.m18410W(true);
                    if (Intrinsics.areEqual(interfaceC5926k2.getId(), (String) interfaceC15701v0.getValue())) {
                        c15688r2.mo18363O(105497497);
                        Unit unit8 = Unit.INSTANCE;
                        objMo18389z6 = c15688r2.mo18389z();
                        if (objMo18389z6 == obj2) {
                            objMo18389z6 = new a(c0173b2, null);
                            c15688r2.mo18380q(objMo18389z6);
                        }
                        C15631X.m18287e(unit8, c15688r2, (Function2) objMo18389z6);
                        c15688r2.m18410W(false);
                    } else {
                        c15688r2.mo18363O(105630115);
                        c15688r2.m18410W(false);
                    }
                    c0173b = c0173b2;
                    i20 = i212;
                    obj = obj2;
                    aVar = aVar7;
                }
                function13 = function1;
                int i213 = i20;
                c15688r2.m18410W(false);
                if (z18) {
                    function6 = function10;
                    c15688r2.mo18363O(-34654387);
                    c15688r2.m18410W(false);
                } else {
                    function6 = function10;
                    c15688r2.mo18363O(-34654387);
                    c15688r2.m18410W(false);
                }
                c15688r2.m18410W(true);
                c15688r2.m18410W(true);
                function5 = function11;
                c15688r = c15688r2;
                interfaceC4011r2 = interfaceC4011r4;
                z13 = z18;
                f11 = f13;
            }
            c15634y0M18412Y.f50634d = function7;
        }
        c15688rMo18372i.mo18356H();
        interfaceC4011r2 = interfaceC4011r;
        c15688r = c15688rMo18372i;
        function5 = function3;
        function6 = function4;
        z13 = z11;
        f11 = f10;
        c15634y0M18412Y = c15688r.m18412Y();
        if (c15634y0M18412Y != null) {
            function7 = new Function2() { // from class: mf.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    C17037k.m19493c(str, list, function13, function5, function6, interfaceC4011r2, z13, f11, (InterfaceC15676n) obj3, C15636Z0.m18294a(i10 | 1), i11);
                    return Unit.INSTANCE;
                }
            };
            c15634y0M18412Y.f50634d = function7;
        }
    }
}
