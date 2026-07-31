package ad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mg.C17058u;
import mg.InterfaceC17049l;
import mobi.zona.data.model.Ads;
import p016Af.InterfaceC0135d;
import p017Ag.C0144b;
import p069De.C1162h;
import p091F0.AbstractC1467g;
import p107Fg.C1634b;
import p114G5.C1716d;
import p114G5.C1719g;
import p114G5.InterfaceC1715c;
import p124Gf.InterfaceC1875c;
import p125Gg.EnumC1896d;
import p125Gg.InterfaceC1904l;
import p142Hf.C2182j;
import p179Jg.InterfaceC2641t;
import p194Kd.InterfaceC2991i;
import p211Lc.C3324a;
import p211Lc.C3326c;
import p211Lc.C3327d;
import p269Og.C3974S;
import p269Og.C3986c;
import p269Og.C3988d;
import p269Og.C4004l;
import p269Og.EnumC3994g;
import p269Og.InterfaceC4008o;
import p283Pc.C4222d;
import p312R5.C4677b;
import p312R5.C4689n;
import p319Rc.C4727C;
import p319Rc.C4737a;
import p338Sd.C4904d;
import p348T5.C4989b;
import p366U5.InterfaceC5372f;
import p384V5.InterfaceC5655c;
import p402W5.InterfaceC5862d;
import p420X5.C6224b;
import p428Xd.InterfaceC6312b;
import p438Y5.InterfaceC6450f;
import p478aa.C7101e0;
import p478aa.C7106g;
import p478aa.InterfaceC7059L;
import p558fa.C11095d;
import p558fa.C11109r;
import p589ha.C11865c;
import p639jd.C15438j;
import p770rf.C17944M;
import p770rf.C17946O;
import p770rf.C17949S;
import p770rf.C17950T;
import p770rf.C17970h;
import p770rf.InterfaceC17932A;
import p770rf.InterfaceC17977o;
import p770rf.InterfaceC17978p;
import p770rf.InterfaceC17986x;
import p770rf.InterfaceC17988z;
import p784sf.InterfaceC18190e;
import p843wd.InterfaceC19003P;
import ru.zona.app.android.MainActivity;
import sd.C18143a;
import sd.C18167y;
import tf.InterfaceC18350e;
import tf.InterfaceC18351f;

/* JADX INFO: renamed from: ad.q1 */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRootComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootComponent.kt\nru/zona/app/components/RootComponent\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,706:1\n62#2,5:707\n79#2:712\n62#2,5:713\n79#2:718\n62#2,5:719\n79#2:724\n62#2,5:725\n79#2:730\n62#2,5:731\n79#2:736\n62#2,5:737\n79#2:742\n62#2,5:743\n79#2:748\n88#2,6:749\n62#2,5:755\n79#2:760\n180#2,6:761\n180#2,6:767\n62#2,5:773\n79#2:778\n62#2,5:779\n79#2:784\n62#2,5:785\n79#2:790\n62#2,5:801\n79#2:806\n88#2,6:807\n88#2,6:813\n101#2:819\n116#2,5:820\n102#2:825\n88#2,6:826\n43#2,9:832\n832#3:791\n862#3,2:792\n975#3,7:794\n*S KotlinDebug\n*F\n+ 1 RootComponent.kt\nru/zona/app/components/RootComponent\n*L\n152#1:707,5\n152#1:712\n160#1:713,5\n160#1:718\n171#1:719,5\n171#1:724\n180#1:725,5\n180#1:730\n189#1:731,5\n189#1:736\n203#1:737,5\n203#1:742\n213#1:743,5\n213#1:748\n223#1:749,6\n250#1:755,5\n250#1:760\n254#1:761,6\n258#1:767,6\n282#1:773,5\n282#1:778\n304#1:779,5\n304#1:784\n307#1:785,5\n307#1:790\n376#1:801,5\n376#1:806\n676#1:807,6\n691#1:813,6\n693#1:819\n693#1:820,5\n693#1:825\n694#1:826,6\n695#1:832,9\n273#1:791\n273#1:792,2\n274#1:794,7\n*E\n"})
public final class C7277q1 implements InterfaceC7248h, InterfaceC1715c {

    /* JADX INFO: renamed from: K */
    public static final C1634b f23461K;

    /* JADX INFO: renamed from: A */
    public final C11095d f23462A = C6224b.m7048b(this);

    /* JADX INFO: renamed from: B */
    public final InterfaceC17978p f23463B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC2641t f23464C;

    /* JADX INFO: renamed from: D */
    public final C3326c f23465D;

    /* JADX INFO: renamed from: E */
    public final C4989b f23466E;

    /* JADX INFO: renamed from: F */
    public final C7193I1 f23467F;

    /* JADX INFO: renamed from: G */
    public final C7167A f23468G;

    /* JADX INFO: renamed from: H */
    public final C15438j f23469H;

    /* JADX INFO: renamed from: I */
    public final C1162h f23470I;

    /* JADX INFO: renamed from: J */
    public final C4904d f23471J;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1715c f23472b;

    /* JADX INFO: renamed from: c */
    public final int f23473c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC18350e f23474d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC18351f f23475e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC17932A f23476f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2991i f23477g;

    /* JADX INFO: renamed from: h */
    public final C18167y f23478h;

    /* JADX INFO: renamed from: i */
    public final C18143a f23479i;

    /* JADX INFO: renamed from: j */
    public final EnumC1896d f23480j;

    /* JADX INFO: renamed from: k */
    public final C4727C f23481k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1904l<Long> f23482l;

    /* JADX INFO: renamed from: m */
    public final MainActivity.C18001b f23483m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC17988z f23484n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC17049l f23485o;

    /* JADX INFO: renamed from: p */
    public final C17058u f23486p;

    /* JADX INFO: renamed from: q */
    public final C17944M f23487q;

    /* JADX INFO: renamed from: r */
    public final C17949S f23488r;

    /* JADX INFO: renamed from: s */
    public final C17970h f23489s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC1875c f23490t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC19003P f23491u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC18190e f23492v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC0135d f23493w;

    /* JADX INFO: renamed from: x */
    public final C17950T f23494x;

    /* JADX INFO: renamed from: y */
    public final C4737a f23495y;

    /* JADX INFO: renamed from: z */
    public final C17946O f23496z;

    /* JADX INFO: renamed from: ad.q1$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pop$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
    public static final class a implements Function1<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>> {

        /* JADX INFO: renamed from: b */
        public static final a f23497b = new a();

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends InterfaceC7248h.b> invoke(List<? extends InterfaceC7248h.b> list) {
            List<? extends InterfaceC7248h.b> listDropLast;
            List<? extends InterfaceC7248h.b> list2 = list;
            List<? extends InterfaceC7248h.b> list3 = list2.size() > 1 ? list2 : null;
            return (list3 == null || (listDropLast = CollectionsKt.dropLast(list3, 1)) == null) ? list2 : listDropLast;
        }
    }

    /* JADX INFO: renamed from: ad.q1$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pop$3\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pop$1\n*L\n1#1,91:1\n88#2:92\n*E\n"})
    public static final class b implements Function2<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(List<? extends InterfaceC7248h.b> list, List<? extends InterfaceC7248h.b> list2) {
            list.size();
            list2.size();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ad.q1$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$2\n*L\n1#1,75:1\n*E\n"})
    public static final class c implements Function1<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7248h.b.e f23498b;

        public c(InterfaceC7248h.b.e eVar) {
            this.f23498b = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends InterfaceC7248h.b> invoke(List<? extends InterfaceC7248h.b> list) {
            List<? extends InterfaceC7248h.b> mutableList = CollectionsKt.toMutableList((Collection) list);
            InterfaceC7248h.b.e eVar = this.f23498b;
            int iLastIndexOf = mutableList.lastIndexOf(eVar);
            if (iLastIndexOf >= 0) {
                mutableList.remove(iLastIndexOf);
            }
            mutableList.add(eVar);
            return mutableList;
        }
    }

    /* JADX INFO: renamed from: ad.q1$d */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$3\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$1\n*L\n1#1,77:1\n64#2:78\n*E\n"})
    public static final class d implements Function2<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC7248h.b> list, List<? extends InterfaceC7248h.b> list2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ad.q1$e */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$2\n*L\n1#1,75:1\n*E\n"})
    public static final class e implements Function1<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7248h.b.c f23499b;

        public e(InterfaceC7248h.b.c cVar) {
            this.f23499b = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends InterfaceC7248h.b> invoke(List<? extends InterfaceC7248h.b> list) {
            List<? extends InterfaceC7248h.b> mutableList = CollectionsKt.toMutableList((Collection) list);
            InterfaceC7248h.b.c cVar = this.f23499b;
            int iLastIndexOf = mutableList.lastIndexOf(cVar);
            if (iLastIndexOf >= 0) {
                mutableList.remove(iLastIndexOf);
            }
            mutableList.add(cVar);
            return mutableList;
        }
    }

    /* JADX INFO: renamed from: ad.q1$f */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$3\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$1\n*L\n1#1,77:1\n64#2:78\n*E\n"})
    public static final class f implements Function2<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC7248h.b> list, List<? extends InterfaceC7248h.b> list2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ad.q1$g */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$2\n*L\n1#1,75:1\n*E\n"})
    public static final class g implements Function1<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7248h.b.t f23500b;

        public g(InterfaceC7248h.b.t tVar) {
            this.f23500b = tVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends InterfaceC7248h.b> invoke(List<? extends InterfaceC7248h.b> list) {
            List<? extends InterfaceC7248h.b> mutableList = CollectionsKt.toMutableList((Collection) list);
            InterfaceC7248h.b.t tVar = this.f23500b;
            int iLastIndexOf = mutableList.lastIndexOf(tVar);
            if (iLastIndexOf >= 0) {
                mutableList.remove(iLastIndexOf);
            }
            mutableList.add(tVar);
            return mutableList;
        }
    }

    /* JADX INFO: renamed from: ad.q1$h */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$3\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$1\n*L\n1#1,77:1\n64#2:78\n*E\n"})
    public static final class h implements Function2<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC7248h.b> list, List<? extends InterfaceC7248h.b> list2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ad.q1$i */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$2\n*L\n1#1,75:1\n*E\n"})
    public static final class i implements Function1<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7248h.b.h f23501b;

        public i(InterfaceC7248h.b.h hVar) {
            this.f23501b = hVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends InterfaceC7248h.b> invoke(List<? extends InterfaceC7248h.b> list) {
            List<? extends InterfaceC7248h.b> mutableList = CollectionsKt.toMutableList((Collection) list);
            InterfaceC7248h.b.h hVar = this.f23501b;
            int iLastIndexOf = mutableList.lastIndexOf(hVar);
            if (iLastIndexOf >= 0) {
                mutableList.remove(iLastIndexOf);
            }
            mutableList.add(hVar);
            return mutableList;
        }
    }

    /* JADX INFO: renamed from: ad.q1$j */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$3\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$1\n*L\n1#1,77:1\n64#2:78\n*E\n"})
    public static final class j implements Function2<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC7248h.b> list, List<? extends InterfaceC7248h.b> list2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ad.q1$k */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$2\n*L\n1#1,75:1\n*E\n"})
    public static final class k implements Function1<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7248h.b.o f23502b;

        public k(InterfaceC7248h.b.o oVar) {
            this.f23502b = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends InterfaceC7248h.b> invoke(List<? extends InterfaceC7248h.b> list) {
            List<? extends InterfaceC7248h.b> mutableList = CollectionsKt.toMutableList((Collection) list);
            InterfaceC7248h.b.o oVar = this.f23502b;
            int iLastIndexOf = mutableList.lastIndexOf(oVar);
            if (iLastIndexOf >= 0) {
                mutableList.remove(iLastIndexOf);
            }
            mutableList.add(oVar);
            return mutableList;
        }
    }

    /* JADX INFO: renamed from: ad.q1$l */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$3\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$pushToFront$1\n*L\n1#1,77:1\n64#2:78\n*E\n"})
    public static final class l implements Function2<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC7248h.b> list, List<? extends InterfaceC7248h.b> list2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ad.q1$m */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @DebugMetadata(m18777c = "ru.zona.app.components.RootComponent$openPlayer$1", m18778f = "RootComponent.kt", m18779i = {}, m18780l = {}, m18781m = "invokeSuspend", m18782n = {}, m18783nl = {}, m18784s = {}, m18785v = 2)
    @SourceDebugExtension({"SMAP\nRootComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootComponent.kt\nru/zona/app/components/RootComponent$openPlayer$1\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt\n*L\n1#1,706:1\n180#2,6:707\n*S KotlinDebug\n*F\n+ 1 RootComponent.kt\nru/zona/app/components/RootComponent$openPlayer$1\n*L\n236#1:707,6\n*E\n"})
    public static final class m extends SuspendLambda implements Function2<InterfaceC7059L, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C2182j f23504k;

        /* JADX INFO: renamed from: ad.q1$m$a */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$bringToFront$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n827#2:187\n855#2,2:188\n*S KotlinDebug\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$bringToFront$2\n*L\n182#1:187\n182#1:188,2\n*E\n"})
        public static final class a implements Function1<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>> {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC7248h.b.m f23505b;

            public a(InterfaceC7248h.b.m mVar) {
                this.f23505b = mVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<? extends InterfaceC7248h.b> invoke(List<? extends InterfaceC7248h.b> list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj.getClass() != InterfaceC7248h.b.m.class) {
                        arrayList.add(obj);
                    }
                }
                return CollectionsKt.plus((Collection<? extends InterfaceC7248h.b.m>) arrayList, this.f23505b);
            }
        }

        /* JADX INFO: renamed from: ad.q1$m$b */
        /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
        @SourceDebugExtension({"SMAP\nStackNavigatorExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$bringToFront$3\n+ 2 StackNavigatorExt.kt\ncom/arkivanov/decompose/router/stack/StackNavigatorExtKt$bringToFront$1\n*L\n1#1,183:1\n180#2:184\n*E\n"})
        public static final class b implements Function2<List<? extends InterfaceC7248h.b>, List<? extends InterfaceC7248h.b>, Unit> {
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC7248h.b> list, List<? extends InterfaceC7248h.b> list2) {
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C2182j c2182j, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f23504k = c2182j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7277q1.this.new m(this.f23504k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7059L interfaceC7059L, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC7059L, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C7277q1.this.f23465D.mo4063a(new a(new InterfaceC7248h.b.m(this.f23504k)), new b());
            return Unit.INSTANCE;
        }
    }

    static {
        Reflection.getOrCreateKotlinClass(C7277q1.class).getSimpleName();
        f23461K = new C1634b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7277q1(InterfaceC1715c interfaceC1715c, InterfaceC6312b interfaceC6312b, int i10, C4222d c4222d, InterfaceC18351f interfaceC18351f, InterfaceC17932A interfaceC17932A, InterfaceC2991i interfaceC2991i, C18167y c18167y, C18143a c18143a, EnumC1896d enumC1896d, InterfaceC17986x interfaceC17986x, C4727C c4727c, InterfaceC1904l interfaceC1904l, MainActivity.C18001b c18001b, InterfaceC17988z interfaceC17988z, InterfaceC17049l interfaceC17049l, C17058u c17058u, C17944M c17944m, C17949S c17949s, C17970h c17970h, InterfaceC1875c interfaceC1875c, InterfaceC19003P interfaceC19003P, InterfaceC18190e interfaceC18190e, InterfaceC0135d interfaceC0135d, C17950T c17950t, C4737a c4737a, C17946O c17946o) {
        this.f23472b = interfaceC1715c;
        this.f23473c = i10;
        this.f23474d = c4222d;
        this.f23475e = interfaceC18351f;
        this.f23476f = interfaceC17932A;
        this.f23477g = interfaceC2991i;
        this.f23478h = c18167y;
        this.f23479i = c18143a;
        this.f23480j = enumC1896d;
        this.f23481k = c4727c;
        this.f23482l = interfaceC1904l;
        this.f23483m = c18001b;
        this.f23484n = interfaceC17988z;
        this.f23485o = interfaceC17049l;
        this.f23486p = c17058u;
        this.f23487q = c17944m;
        this.f23488r = c17949s;
        this.f23489s = c17970h;
        this.f23490t = interfaceC1875c;
        this.f23491u = interfaceC19003P;
        this.f23492v = interfaceC18190e;
        this.f23493w = interfaceC0135d;
        this.f23494x = c17950t;
        this.f23495y = c4737a;
        this.f23496z = c17946o;
        this.f23463B = interfaceC6312b.mo7117d();
        this.f23464C = interfaceC17932A.mo20303q();
        InterfaceC17977o interfaceC17977oMo20297k = interfaceC17932A.mo20297k();
        InterfaceC7248h.b.d dVar = InterfaceC7248h.b.Companion;
        C3326c c3326cM4065a = C3327d.m4065a(interfaceC17977oMo20297k, dVar.serializer());
        this.f23465D = c3326cM4065a;
        C4989b c4989bM5311a = C4689n.m5311a(this, c3326cM4065a, dVar.serializer(), new C7194J(0), new C7228a0(2, this, C7277q1.class, "createChild", "createChild(Lru/zona/app/components/IRootComponent$Config;Lcom/arkivanov/decompose/ComponentContext;)Lru/zona/app/components/IRootComponent$Child;", 0));
        this.f23466E = c4989bM5311a;
        this.f23467F = new C7193I1(interfaceC19003P, (InterfaceC7248h.b) ((C4677b) c4989bM5311a.mo2032a()).f15811a.f5801a);
        this.f23468G = new C7167A(c3326cM4065a, c4989bM5311a, interfaceC17932A.mo20299m(), interfaceC17932A.mo20298l().f5341c, interfaceC17932A.mo20296f().mo13180b().mo13171a(), interfaceC1715c);
        this.f23469H = new C15438j(interfaceC1715c, interfaceC17932A.mo20311y(), new C7190H1(0, this, C7277q1.class, "gotoPremium", "gotoPremium()V", 0));
        this.f23470I = new C1162h(interfaceC2991i.mo3697a().m1780a());
        this.f23471J = new C4904d(C1716d.m2446a(this, "UpdateComponent"), interfaceC1875c.mo2575b(), c4989bM5311a);
        c4989bM5311a.mo2033b(new Function1() { // from class: ad.Q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C4677b c4677b = (C4677b) obj;
                C7277q1 c7277q1 = this.f23361b;
                C7193I1 c7193i1 = c7277q1.f23467F;
                InterfaceC7248h.b bVar = (InterfaceC7248h.b) c4677b.f15811a.f5801a;
                InterfaceC7248h.b bVar2 = c7193i1.f23353b;
                c7193i1.f23353b = bVar;
                if ((bVar2 instanceof InterfaceC7248h.b.m) && !(bVar instanceof InterfaceC7248h.b.m)) {
                    C7193I1.f23351c.mo2258d("Detection: player screen is closed", new Object[0]);
                    c7193i1.f23352a.mo5495a();
                }
                c7277q1.f23490t.mo2574a(c4677b.f15811a.f5801a instanceof InterfaceC7248h.b.m);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final void m8140j(C7277q1 c7277q1, EnumC3994g enumC3994g) {
        C7167A c7167a = c7277q1.f23468G;
        int iOrdinal = enumC3994g.ordinal();
        if (iOrdinal == 1) {
            c7167a.f23301c.mo4063a(new C7170B(InterfaceC7248h.b.j.INSTANCE), new C7173C());
            c7167a.mo8119f(false);
        } else if (iOrdinal == 2) {
            c7167a.f23301c.mo4063a(new C7176D(InterfaceC7248h.b.r.INSTANCE), new C7179E());
            c7167a.mo8119f(false);
        } else {
            if (iOrdinal != 6) {
                return;
            }
            c7167a.m8128p();
        }
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: K */
    public final InterfaceC5372f mo793K() {
        return this.f23472b.mo793K();
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: a */
    public final AbstractC1467g mo8131a() {
        return this.f23466E;
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: b */
    public final EnumC1896d mo8132b() {
        return this.f23480j;
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: c */
    public final InterfaceC2991i mo8133c() {
        return this.f23477g;
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: d */
    public final InterfaceC17978p mo8134d() {
        return this.f23463B;
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: e */
    public final C4904d mo8135e() {
        return this.f23471J;
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: f */
    public final C7167A mo8136f() {
        return this.f23468G;
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: g */
    public final C1162h mo8137g() {
        return this.f23470I;
    }

    @Override // p114G5.InterfaceC1715c
    public final InterfaceC5862d getLifecycle() {
        return this.f23472b.getLifecycle();
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: h */
    public final void mo8138h(C2182j c2182j) {
        this.f23476f.mo20297k().mo1256v(C3324a.m4062b(c2182j), C3974S.m4698a(c2182j.f7216b));
        C11865c c11865c = C7101e0.f23142a;
        C7106g.m8045c(this.f23462A, C11109r.f34545a.mo10090S0(), null, new m(c2182j, null), 2);
    }

    @Override // ad.InterfaceC7248h
    /* JADX INFO: renamed from: i */
    public final C15438j mo8139i() {
        return this.f23469H;
    }

    /* JADX INFO: renamed from: k */
    public final void m8141k() {
        this.f23465D.mo4063a(a.f23497b, new b());
    }

    /* JADX INFO: renamed from: l */
    public final void m8142l(InterfaceC4008o interfaceC4008o) {
        int iOrdinal = interfaceC4008o.getType().ordinal();
        InterfaceC17932A interfaceC17932A = this.f23476f;
        C3326c c3326c = this.f23465D;
        if (iOrdinal == 1 || iOrdinal == 2) {
            C3986c c3986cM4700a = C3988d.m4700a(interfaceC4008o);
            C0144b.f484a.getClass();
            c3326c.mo4063a(new c(new InterfaceC7248h.b.e(c3986cM4700a, System.currentTimeMillis())), new d());
            interfaceC17932A.mo20292E().m20345b().m20343d(interfaceC4008o.getId());
            return;
        }
        if (iOrdinal == 4) {
            c3326c.mo4063a(new g(new InterfaceC7248h.b.t(C3988d.m4700a(interfaceC4008o))), new h());
            return;
        }
        if (iOrdinal == 6) {
            C3986c c3986cM4700a2 = C3988d.m4700a(interfaceC4008o);
            C4004l.Companion.getClass();
            mo8138h(new C2182j(c3986cM4700a2, C4004l.f13162d, false));
            return;
        }
        if (iOrdinal == 11) {
            Long longOrNull = StringsKt.toLongOrNull(interfaceC4008o.getId());
            if (longOrNull != null) {
                long jLongValue = longOrNull.longValue();
                C0144b.f484a.getClass();
                c3326c.mo4063a(new i(new InterfaceC7248h.b.h(jLongValue, System.currentTimeMillis())), new j());
                return;
            }
            return;
        }
        if (iOrdinal == 13) {
            Ads adsMo20532b = this.f23492v.mo20532b(interfaceC4008o.getId());
            if (adsMo20532b != null) {
                interfaceC17932A.mo20297k().mo1243i();
                c3326c.mo4063a(new k(new InterfaceC7248h.b.o(adsMo20532b)), new l());
                return;
            }
            return;
        }
        if (iOrdinal == 14) {
            c3326c.mo4063a(new e(new InterfaceC7248h.b.c(interfaceC4008o.getId())), new f());
            return;
        }
        f23461K.mo2257c("Page for " + interfaceC4008o + " is not implemented", new Object[0]);
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: n */
    public final InterfaceC5655c mo795n() {
        return this.f23472b.mo795n();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: u */
    public final C1719g mo796u() {
        return this.f23472b.mo796u();
    }

    @Override // p114G5.InterfaceC1715c
    /* JADX INFO: renamed from: x */
    public final InterfaceC6450f mo797x() {
        return this.f23472b.mo797x();
    }
}
