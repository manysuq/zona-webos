package mobi.zona.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0005"}, m18688d2 = {"Lmobi/zona/utils/CppUtil;", "", "<init>", "()V", "Companion", "ru.zona:android_zonaRelease", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
public final class CppUtil {

    @JvmField
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0086 J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0086 J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0086 J\t\u0010\u000f\u001a\u00020\u0005H\u0086 J\t\u0010\u0010\u001a\u00020\u0005H\u0086 ¨\u0006\u0011"}, m18688d2 = {"Lmobi/zona/utils/CppUtil$Companion;", "", "<init>", "()V", "checkTimeNative", "", "context", "Landroid/content/Context;", "time", "", "userAgent", "checkTimeNative2", "lof", "", "filter", "eso", "d", "ru.zona:android_zonaRelease"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final native String checkTimeNative(Context context, long time, String userAgent);

        public final native String checkTimeNative2(Context context, long time, String userAgent);

        /* JADX INFO: renamed from: d */
        public final native String m19547d();

        public final native String eso();

        public final native int lof(String filter);

        private Companion() {
        }
    }
}
