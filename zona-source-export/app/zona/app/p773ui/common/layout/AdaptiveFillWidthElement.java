package ru.zona.app.p773ui.common.layout;

import androidx.compose.p481ui.InterfaceC7507e;
import kotlin.Metadata;
import p322Rf.C4786b;
import p397W0.AbstractC5798f0;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\f\u0010\r\u001a\u00020\u000b*\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m18688d2 = {"Lru/zona/app/ui/common/layout/AdaptiveFillWidthElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lru/zona/app/ui/common/layout/AdaptiveFillWidthNode;", "fraction", "", "inspectorName", "", "<init>", "(FLjava/lang/String;)V", "create", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "equals", "", "other", "", "hashCode", "", "ru.zona:common_release"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
final class AdaptiveFillWidthElement extends AbstractC5798f0<C4786b> {

    /* JADX INFO: renamed from: b */
    public final float f56002b = 0.4f;

    @Override // p397W0.AbstractC5798f0
    /* JADX INFO: renamed from: a */
    public final InterfaceC7507e.c mo6575a() {
        C4786b c4786b = new C4786b();
        c4786b.f16006p = this.f56002b;
        return c4786b;
    }

    @Override // p397W0.AbstractC5798f0
    /* JADX INFO: renamed from: b */
    public final void mo6576b(InterfaceC7507e.c cVar) {
        ((C4786b) cVar).f16006p = this.f56002b;
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AdaptiveFillWidthElement) {
            return this.f56002b == ((AdaptiveFillWidthElement) other).f56002b;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f56002b);
    }
}
