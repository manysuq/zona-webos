package ch;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v4 ch.e[], still in use, count: 1, list:
  (r9v4 ch.e[]) from 0x00ab: INVOKE (r9v4 ch.e[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:172)
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
/* JADX INFO: renamed from: ch.e */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC8486e {
    FAVORITE_GAME("favorite-game"),
    FOLLOW_SPORT("follow-sport"),
    FAVORITE_TV("favorite-tv"),
    FAVORITE_RADIO("favorite-radio"),
    WATCHED_VIDEO("watched-video"),
    FOLLOW_VIDEO("follow-video"),
    FAVORITE_VIDEO("favorite-video"),
    /* JADX INFO: Fake field, exist only in values array */
    CURRENT_PLAY("current-play"),
    /* JADX INFO: Fake field, exist only in values array */
    LOCALE(CommonUrlParts.LOCALE),
    /* JADX INFO: Fake field, exist only in values array */
    PREFER_LANGUAGE("prefer-language"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumEntries f29052k;

    /* JADX INFO: renamed from: b */
    public final String f29053b;

    static {
        f29052k = EnumEntriesKt.enumEntries(enumC8486eArr);
    }

    public EnumC8486e(String str) {
        super(str, i);
        this.f29053b = str;
    }

    public static EnumC8486e valueOf(String str) {
        return (EnumC8486e) Enum.valueOf(EnumC8486e.class, str);
    }

    public static EnumC8486e[] values() {
        return (EnumC8486e[]) f29051j.clone();
    }
}
