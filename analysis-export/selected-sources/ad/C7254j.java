package ad;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import p843wd.InterfaceC19014a0;
import za.C20818H;
import za.C20903t0;

/* JADX INFO: renamed from: ad.j */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7254j implements Function0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f23458b;

    public /* synthetic */ C7254j(int i10) {
        this.f23458b = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23458b) {
            case 0:
                return new C20903t0("ru.zona.app.components.IRootComponent.Config.AuthRoot", InterfaceC7248h.b.a.INSTANCE, new Annotation[0]);
            default:
                return new C20818H("ru.zona.app.components.player.IPlayerPrepareComponent.PrepareStage", InterfaceC19014a0.a.values());
        }
    }
}
