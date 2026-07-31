package p086Ed;

import java.lang.annotation.Annotation;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import mobi.zona.utils.CppUtil;
import p107Fg.C1634b;
import p689mb.C16961K;
import p689mb.C16972W;
import ru.zona.app.android.App;
import za.C20903t0;

/* JADX INFO: renamed from: Ed.i */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1396i implements Function0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4733b;

    public /* synthetic */ C1396i(int i10) {
        this.f4733b = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4733b) {
            case 0:
                return new C20903t0("ru.zona.app.components.profile.IProfileRootComponent.Config.Premium", InterfaceC1382b.b.h.INSTANCE, new Annotation[0]);
            case 1:
                C1634b c1634b = App.f55952k;
                return CppUtil.INSTANCE.eso();
            default:
                return new C16972W("string:entryCountry", SetsKt.setOf(new C16961K(SetsKt.emptySet(), "composeResources/ru.zona.common.generated.resources/values/strings.commonMain.cvr", 9158L, 56L)));
        }
    }
}
