package kotlin;

import com.sun.mail.imap.IMAPStore;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\u0088\u0004b\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\u0088\u0004b\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0087\u0088\u0004b\u0002\b\u0003\u001a\u001c\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0087\u0080\u0004b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u001a(\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0087\u0080\u0004b\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016b\u0002\b\u0017\"%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00028FX\u0086\u0084\b¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019*\u00020\u00028FX\u0087\u0084\br\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¢\u0006\f\u0012\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m18688d2 = {"printStackTrace", "", "", "Lkotlin/internal/InlineOnly;", "writer", "Ljava/io/PrintWriter;", "stream", "Ljava/io/PrintStream;", "stackTrace", "", "Ljava/lang/StackTraceElement;", "getStackTrace$annotations", "(Ljava/lang/Throwable;)V", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "stackTraceToString", "", "Lkotlin/SinceKotlin;", IMAPStore.ID_VERSION, "1.4", "addSuppressed", "exception", "1.1", "Lkotlin/internal/HidesMembers;", "suppressedExceptions", "", "getSuppressedExceptions$annotations", "getSuppressedExceptions", "(Ljava/lang/Throwable;)Ljava/util/List;", "kotlin-stdlib"}, m18689k = 5, m18690mv = {2, 4, 0}, m18692xi = 49, m18693xs = "kotlin/ExceptionsKt")
public class ExceptionsKt__ExceptionsKt {
    @SinceKotlin(version = "1.1")
    @HidesMembers
    public static void addSuppressed(Throwable th, Throwable th2) {
        if (th != th2) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(th, th2);
        }
    }

    public static final StackTraceElement[] getStackTrace(Throwable th) {
        return th.getStackTrace();
    }

    public static List<Throwable> getSuppressedExceptions(Throwable th) {
        return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(th);
    }

    @InlineOnly
    private static final void printStackTrace(Throwable th) {
        th.printStackTrace();
    }

    @SinceKotlin(version = "1.4")
    public static String stackTraceToString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    @InlineOnly
    private static final void printStackTrace(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }

    @InlineOnly
    private static final void printStackTrace(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }
}
