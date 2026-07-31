package p179Jg;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v1 Jg.b[], still in use, count: 1, list:
  (r6v1 Jg.b[]) from 0x0029: INVOKE (r6v1 Jg.b[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Jg.b */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2623b {
    Stub(1),
    Lite(2),
    Full(3);


    /* JADX INFO: renamed from: c */
    public static final a f8798c = new a();

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumEntries f8803h;

    /* JADX INFO: renamed from: b */
    public final int f8804b;

    /* JADX INFO: renamed from: Jg.b$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class a {
    }

    static {
        f8803h = EnumEntriesKt.enumEntries(new EnumC2623b[]{r0, r1, r4});
    }

    public EnumC2623b(int i10) {
        super(str, i);
        this.f8804b = i10;
    }

    public static EnumC2623b valueOf(String str) {
        return (EnumC2623b) Enum.valueOf(EnumC2623b.class, str);
    }

    public static EnumC2623b[] values() {
        return (EnumC2623b[]) f8802g.clone();
    }
}
