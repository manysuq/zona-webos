package mobi.zona.data.model;

import com.sun.mail.imap.IMAPStore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p659io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.mozilla.javascript.Parser;
import p065Da.C1112p;
import p065Da.C1113q;
import p065Da.C1114r;
import p065Da.C1115s;
import p065Da.C1116t;
import p065Da.C1117u;
import p219M2.C3500w;
import p488b4.C8034N;
import p840wa.C18973a;
import p857xa.InterfaceC19639f;
import p875ya.InterfaceC19797c;
import va.C18719d;
import va.InterfaceC18718c;
import va.InterfaceC18729n;
import za.C20829M0;
import za.C20838R0;
import za.C20870f;
import za.C20879i;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "Use ru.zona.content.models.Movie/Serial")
@Metadata(m18687d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0091\u0001\u0092\u0001Bÿ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020 \u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020 \u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010'\u001a\u00020 \u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0004\b*\u0010+B\u008d\u0003\b\u0010\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020 \u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010'\u001a\u00020 \u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010/\u001a\u0004\u0018\u000100¢\u0006\u0004\b*\u00101J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000bHÆ\u0003J\u0013\u0010g\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000bHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000bHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000bHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010w\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000bHÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010NJ\t\u0010y\u001a\u00020 HÆ\u0003J\t\u0010z\u001a\u00020 HÆ\u0003J\t\u0010{\u001a\u00020 HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020 HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020 HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J¼\u0003\u0010\u0081\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020 2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010'\u001a\u00020 2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0003\u0010\u0082\u0001J\u0017\u0010\u0083\u0001\u001a\u00020 2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001HÖ\u0083\u0004J\u000b\u0010\u0086\u0001\u001a\u00020-HÖ\u0081\u0004J\u000b\u0010\u0087\u0001\u001a\u00020\u0005HÖ\u0081\u0004J2\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u00002\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0001b\u0003\b\u0090\u0001¢\u0006\u0003\b\u008f\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u001b\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001b\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u00105R\u001b\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010;R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u001b\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010;R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u00105R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u00105R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010;R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u00105R\u001b\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010;R\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010!\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010R\"\u0004\bS\u0010TR\u001a\u0010\"\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010R\"\u0004\bU\u0010TR\u001a\u0010#\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010R\"\u0004\bV\u0010TR\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00103\"\u0004\bX\u0010YR\u001a\u0010%\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010R\"\u0004\b[\u0010TR\u0013\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u00105R\u0011\u0010'\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b]\u0010RR\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_Ê\u0001\u000f\b\u0094\u0001\u0012\n\b\u0095\u0001\u0012\u0005\b\b(\u0096\u0001Ê\u0001\u0003\b\u0097\u0001¨\u0006\u0093\u0001"}, m18688d2 = {"Lmobi/zona/data/model/Movie;", "Ljava/io/Serializable;", "id", "", IMAPStore.ID_NAME, "", "coverUrl", "year", "description", "quality", "trailerSourceTypes", "", "movieSourceTypes", "genres", "countries", "zonaRating", "imdbRating", "ksRating", "director", "directors", "Lmobi/zona/data/model/Actor;", "scenario", "strid", "writers", "releaseDateInt", "releaseDateRus", "actors", "originalName", "duration", "rels", "Lmobi/zona/data/model/Rel;", "serial", "", "isLiked", "isWatched", "isHasEpisodeKeys", "updatedAt", "short", "posterTemplate", "vast", "adsModel", "Lmobi/zona/data/model/Ads;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZZZJZLjava/lang/String;ZLmobi/zona/data/model/Ads;)V", "seen0", "", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZZZJZLjava/lang/String;ZLmobi/zona/data/model/Ads;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getCoverUrl", "getYear", "getDescription", "getQuality", "getTrailerSourceTypes", "()Ljava/util/List;", "getMovieSourceTypes", "getGenres", "getCountries", "getZonaRating", "getImdbRating", "getKsRating", "getDirector", "getDirectors", "getScenario", "getStrid", "getWriters", "getReleaseDateInt", "getReleaseDateRus", "getActors", "getOriginalName", "getDuration", "getRels", "getSerial", "()Ljava/lang/Boolean;", "setSerial", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setLiked", "(Z)V", "setWatched", "setHasEpisodeKeys", "getUpdatedAt", "setUpdatedAt", "(J)V", "getShort", "setShort", "getPosterTemplate", "getVast", "getAdsModel", "()Lmobi/zona/data/model/Ads;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZZZJZLjava/lang/String;ZLmobi/zona/data/model/Ads;)Lmobi/zona/data/model/Movie;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ru_zona_ru_zona_content_models_release", "Lkotlin/jvm/JvmStatic;", "$serializer", "Companion", "ru.zona:ru.zona.content.models_release", "Lkotlin/Deprecated;", "message", "Use ru.zona.content.models.Movie/Serial", "Lkotlinx/serialization/Serializable;"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
@InterfaceC18729n
public final /* data */ class Movie implements Serializable {

    @JvmField
    private static final Lazy<InterfaceC18718c<Object>>[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Actor> actors;
    private final Ads adsModel;
    private final String countries;
    private final String coverUrl;
    private final String description;
    private final String director;
    private final List<Actor> directors;
    private final String duration;
    private final String genres;
    private final long id;
    private final String imdbRating;
    private boolean isHasEpisodeKeys;
    private boolean isLiked;
    private boolean isWatched;
    private final String ksRating;
    private final List<String> movieSourceTypes;
    private final String name;
    private final String originalName;
    private final String posterTemplate;
    private final String quality;
    private final String releaseDateInt;
    private final String releaseDateRus;
    private final List<Rel> rels;
    private final String scenario;
    private Boolean serial;
    private boolean short;
    private final String strid;
    private final List<String> trailerSourceTypes;
    private long updatedAt;
    private final boolean vast;
    private final List<Actor> writers;
    private final String year;
    private final String zonaRating;

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @Metadata(m18687d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m18688d2 = {"Lmobi/zona/data/model/Movie$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmobi/zona/data/model/Movie;", "ru.zona:ru.zona.content.models_release"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC18718c<Movie> serializer() {
            return Movie$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        int i10 = 0;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C1112p(i10)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C1113q(i10)), null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C1114r(i10)), null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C1115s(i10)), null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C1116t(i10)), null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C1117u(i10)), null, null, null, null, null, null, null, null, null};
    }

    public Movie(int i10, int i11, long j10, String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, String str7, String str8, String str9, String str10, String str11, List list3, String str12, String str13, List list4, String str14, String str15, List list5, String str16, String str17, List list6, Boolean bool, boolean z10, boolean z11, boolean z12, long j11, boolean z13, String str18, boolean z14, Ads ads, C20829M0 c20829m0) {
        if (1107296255 != (i10 & 1107296255)) {
            int[] iArr = {i10, i11};
            int[] iArr2 = {1107296255, 0};
            InterfaceC19639f descriptor = Movie$$serializer.INSTANCE.getDescriptor();
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = iArr2[i12] & (~iArr[i12]);
                if (i13 != 0) {
                    for (int i14 = 0; i14 < 32; i14++) {
                        if ((i13 & 1) != 0) {
                            arrayList.add(descriptor.mo155e((i12 * 32) + i14));
                        }
                        i13 >>>= 1;
                    }
                }
            }
            throw new C18719d(descriptor.mo158h(), arrayList);
        }
        this.id = j10;
        this.name = str;
        this.coverUrl = str2;
        this.year = str3;
        this.description = str4;
        this.quality = str5;
        this.trailerSourceTypes = list;
        this.movieSourceTypes = list2;
        this.genres = str6;
        this.countries = str7;
        this.zonaRating = str8;
        this.imdbRating = str9;
        this.ksRating = str10;
        this.director = str11;
        this.directors = list3;
        this.scenario = str12;
        this.strid = str13;
        this.writers = list4;
        this.releaseDateInt = str14;
        this.releaseDateRus = str15;
        this.actors = list5;
        this.originalName = str16;
        this.duration = str17;
        this.rels = list6;
        this.serial = bool;
        if ((33554432 & i10) == 0) {
            this.isLiked = false;
        } else {
            this.isLiked = z10;
        }
        if ((67108864 & i10) == 0) {
            this.isWatched = false;
        } else {
            this.isWatched = z11;
        }
        if ((134217728 & i10) == 0) {
            this.isHasEpisodeKeys = true;
        } else {
            this.isHasEpisodeKeys = z12;
        }
        this.updatedAt = (268435456 & i10) == 0 ? 0L : j11;
        if ((536870912 & i10) == 0) {
            this.short = false;
        } else {
            this.short = z13;
        }
        this.posterTemplate = str18;
        if ((i10 & IntCompanionObject.MIN_VALUE) == 0) {
            this.vast = true;
        } else {
            this.vast = z14;
        }
        this.adsModel = (i11 & 1) == 0 ? null : ads;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC18718c _childSerializers$_anonymous_() {
        return new C20870f(C18973a.m21290a(C20838R0.f71645a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC18718c _childSerializers$_anonymous_$0() {
        return new C20870f(C18973a.m21290a(C20838R0.f71645a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC18718c _childSerializers$_anonymous_$1() {
        return new C20870f(C18973a.m21290a(Actor$$serializer.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC18718c _childSerializers$_anonymous_$2() {
        return new C20870f(C18973a.m21290a(Actor$$serializer.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC18718c _childSerializers$_anonymous_$3() {
        return new C20870f(Actor$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC18718c _childSerializers$_anonymous_$4() {
        return new C20870f(C18973a.m21290a(Rel$$serializer.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Movie copy$default(Movie movie, long j10, String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, String str7, String str8, String str9, String str10, String str11, List list3, String str12, String str13, List list4, String str14, String str15, List list5, String str16, String str17, List list6, Boolean bool, boolean z10, boolean z11, boolean z12, long j11, boolean z13, String str18, boolean z14, Ads ads, int i10, int i11, Object obj) {
        Ads ads2;
        boolean z15;
        long j12 = (i10 & 1) != 0 ? movie.id : j10;
        String str19 = (i10 & 2) != 0 ? movie.name : str;
        String str20 = (i10 & 4) != 0 ? movie.coverUrl : str2;
        String str21 = (i10 & 8) != 0 ? movie.year : str3;
        String str22 = (i10 & 16) != 0 ? movie.description : str4;
        String str23 = (i10 & 32) != 0 ? movie.quality : str5;
        List list7 = (i10 & 64) != 0 ? movie.trailerSourceTypes : list;
        List list8 = (i10 & 128) != 0 ? movie.movieSourceTypes : list2;
        String str24 = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? movie.genres : str6;
        String str25 = (i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? movie.countries : str7;
        String str26 = (i10 & 1024) != 0 ? movie.zonaRating : str8;
        String str27 = (i10 & 2048) != 0 ? movie.imdbRating : str9;
        String str28 = (i10 & 4096) != 0 ? movie.ksRating : str10;
        long j13 = j12;
        String str29 = (i10 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? movie.director : str11;
        List list9 = (i10 & 16384) != 0 ? movie.directors : list3;
        String str30 = (i10 & 32768) != 0 ? movie.scenario : str12;
        String str31 = (i10 & Parser.ARGC_LIMIT) != 0 ? movie.strid : str13;
        List list10 = (i10 & 131072) != 0 ? movie.writers : list4;
        String str32 = (i10 & 262144) != 0 ? movie.releaseDateInt : str14;
        String str33 = (i10 & 524288) != 0 ? movie.releaseDateRus : str15;
        List list11 = (i10 & 1048576) != 0 ? movie.actors : list5;
        String str34 = (i10 & 2097152) != 0 ? movie.originalName : str16;
        String str35 = (i10 & 4194304) != 0 ? movie.duration : str17;
        List list12 = (i10 & 8388608) != 0 ? movie.rels : list6;
        Boolean bool2 = (i10 & 16777216) != 0 ? movie.serial : bool;
        boolean z16 = (i10 & 33554432) != 0 ? movie.isLiked : z10;
        boolean z17 = (i10 & 67108864) != 0 ? movie.isWatched : z11;
        boolean z18 = (i10 & 134217728) != 0 ? movie.isHasEpisodeKeys : z12;
        String str36 = str29;
        long j14 = (i10 & 268435456) != 0 ? movie.updatedAt : j11;
        boolean z19 = (i10 & 536870912) != 0 ? movie.short : z13;
        String str37 = (i10 & 1073741824) != 0 ? movie.posterTemplate : str18;
        boolean z20 = z19;
        boolean z21 = (i10 & IntCompanionObject.MIN_VALUE) != 0 ? movie.vast : z14;
        if ((i11 & 1) != 0) {
            z15 = z21;
            ads2 = movie.adsModel;
        } else {
            ads2 = ads;
            z15 = z21;
        }
        return movie.copy(j13, str19, str20, str21, str22, str23, list7, list8, str24, str25, str26, str27, str28, str36, list9, str30, str31, list10, str32, str33, list11, str34, str35, list12, bool2, z16, z17, z18, j14, z20, str37, z15, ads2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ru_zona_ru_zona_content_models_release(Movie movie, InterfaceC19797c interfaceC19797c, InterfaceC19639f interfaceC19639f) {
        Lazy<InterfaceC18718c<Object>>[] lazyArr = $childSerializers;
        interfaceC19797c.mo699t(interfaceC19639f, 0, movie.id);
        C20838R0 c20838r0 = C20838R0.f71645a;
        interfaceC19797c.mo702w(interfaceC19639f, 1, c20838r0, movie.name);
        interfaceC19797c.mo702w(interfaceC19639f, 2, c20838r0, movie.coverUrl);
        interfaceC19797c.mo702w(interfaceC19639f, 3, c20838r0, movie.year);
        interfaceC19797c.mo702w(interfaceC19639f, 4, c20838r0, movie.description);
        interfaceC19797c.mo702w(interfaceC19639f, 5, c20838r0, movie.quality);
        interfaceC19797c.mo702w(interfaceC19639f, 6, lazyArr[6].getValue(), movie.trailerSourceTypes);
        interfaceC19797c.mo702w(interfaceC19639f, 7, lazyArr[7].getValue(), movie.movieSourceTypes);
        interfaceC19797c.mo702w(interfaceC19639f, 8, c20838r0, movie.genres);
        interfaceC19797c.mo702w(interfaceC19639f, 9, c20838r0, movie.countries);
        interfaceC19797c.mo702w(interfaceC19639f, 10, c20838r0, movie.zonaRating);
        interfaceC19797c.mo702w(interfaceC19639f, 11, c20838r0, movie.imdbRating);
        interfaceC19797c.mo702w(interfaceC19639f, 12, c20838r0, movie.ksRating);
        interfaceC19797c.mo702w(interfaceC19639f, 13, c20838r0, movie.director);
        interfaceC19797c.mo702w(interfaceC19639f, 14, lazyArr[14].getValue(), movie.directors);
        interfaceC19797c.mo702w(interfaceC19639f, 15, c20838r0, movie.scenario);
        interfaceC19797c.mo702w(interfaceC19639f, 16, c20838r0, movie.strid);
        interfaceC19797c.mo702w(interfaceC19639f, 17, lazyArr[17].getValue(), movie.writers);
        interfaceC19797c.mo702w(interfaceC19639f, 18, c20838r0, movie.releaseDateInt);
        interfaceC19797c.mo702w(interfaceC19639f, 19, c20838r0, movie.releaseDateRus);
        interfaceC19797c.mo702w(interfaceC19639f, 20, lazyArr[20].getValue(), movie.actors);
        interfaceC19797c.mo702w(interfaceC19639f, 21, c20838r0, movie.originalName);
        interfaceC19797c.mo702w(interfaceC19639f, 22, c20838r0, movie.duration);
        interfaceC19797c.mo702w(interfaceC19639f, 23, lazyArr[23].getValue(), movie.rels);
        interfaceC19797c.mo702w(interfaceC19639f, 24, C20879i.f71698a, movie.serial);
        if (interfaceC19797c.mo676A() || movie.isLiked) {
            interfaceC19797c.mo677B(interfaceC19639f, 25, movie.isLiked);
        }
        if (interfaceC19797c.mo676A() || movie.isWatched) {
            interfaceC19797c.mo677B(interfaceC19639f, 26, movie.isWatched);
        }
        if (interfaceC19797c.mo676A() || !movie.isHasEpisodeKeys) {
            interfaceC19797c.mo677B(interfaceC19639f, 27, movie.isHasEpisodeKeys);
        }
        if (interfaceC19797c.mo676A() || movie.updatedAt != 0) {
            interfaceC19797c.mo699t(interfaceC19639f, 28, movie.updatedAt);
        }
        if (interfaceC19797c.mo676A() || movie.short) {
            interfaceC19797c.mo677B(interfaceC19639f, 29, movie.short);
        }
        interfaceC19797c.mo702w(interfaceC19639f, 30, c20838r0, movie.posterTemplate);
        if (interfaceC19797c.mo676A() || !movie.vast) {
            interfaceC19797c.mo677B(interfaceC19639f, 31, movie.vast);
        }
        if (!interfaceC19797c.mo676A() && movie.adsModel == null) {
            return;
        }
        interfaceC19797c.mo702w(interfaceC19639f, 32, Ads$$serializer.INSTANCE, movie.adsModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCountries() {
        return this.countries;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getZonaRating() {
        return this.zonaRating;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getImdbRating() {
        return this.imdbRating;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getKsRating() {
        return this.ksRating;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDirector() {
        return this.director;
    }

    public final List<Actor> component15() {
        return this.directors;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getStrid() {
        return this.strid;
    }

    public final List<Actor> component18() {
        return this.writers;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getReleaseDateInt() {
        return this.releaseDateInt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getReleaseDateRus() {
        return this.releaseDateRus;
    }

    public final List<Actor> component21() {
        return this.actors;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getOriginalName() {
        return this.originalName;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final List<Rel> component24() {
        return this.rels;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getSerial() {
        return this.serial;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsLiked() {
        return this.isLiked;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getIsWatched() {
        return this.isWatched;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getIsHasEpisodeKeys() {
        return this.isHasEpisodeKeys;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getShort() {
        return this.short;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getPosterTemplate() {
        return this.posterTemplate;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getVast() {
        return this.vast;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Ads getAdsModel() {
        return this.adsModel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQuality() {
        return this.quality;
    }

    public final List<String> component7() {
        return this.trailerSourceTypes;
    }

    public final List<String> component8() {
        return this.movieSourceTypes;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGenres() {
        return this.genres;
    }

    public final Movie copy(long id2, String name, String coverUrl, String year, String description, String quality, List<String> trailerSourceTypes, List<String> movieSourceTypes, String genres, String countries, String zonaRating, String imdbRating, String ksRating, String director, List<Actor> directors, String scenario, String strid, List<Actor> writers, String releaseDateInt, String releaseDateRus, List<Actor> actors, String originalName, String duration, List<Rel> rels, Boolean serial, boolean isLiked, boolean isWatched, boolean isHasEpisodeKeys, long updatedAt, boolean z10, String posterTemplate, boolean vast, Ads adsModel) {
        return new Movie(id2, name, coverUrl, year, description, quality, trailerSourceTypes, movieSourceTypes, genres, countries, zonaRating, imdbRating, ksRating, director, directors, scenario, strid, writers, releaseDateInt, releaseDateRus, actors, originalName, duration, rels, serial, isLiked, isWatched, isHasEpisodeKeys, updatedAt, z10, posterTemplate, vast, adsModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) other;
        return this.id == movie.id && Intrinsics.areEqual(this.name, movie.name) && Intrinsics.areEqual(this.coverUrl, movie.coverUrl) && Intrinsics.areEqual(this.year, movie.year) && Intrinsics.areEqual(this.description, movie.description) && Intrinsics.areEqual(this.quality, movie.quality) && Intrinsics.areEqual(this.trailerSourceTypes, movie.trailerSourceTypes) && Intrinsics.areEqual(this.movieSourceTypes, movie.movieSourceTypes) && Intrinsics.areEqual(this.genres, movie.genres) && Intrinsics.areEqual(this.countries, movie.countries) && Intrinsics.areEqual(this.zonaRating, movie.zonaRating) && Intrinsics.areEqual(this.imdbRating, movie.imdbRating) && Intrinsics.areEqual(this.ksRating, movie.ksRating) && Intrinsics.areEqual(this.director, movie.director) && Intrinsics.areEqual(this.directors, movie.directors) && Intrinsics.areEqual(this.scenario, movie.scenario) && Intrinsics.areEqual(this.strid, movie.strid) && Intrinsics.areEqual(this.writers, movie.writers) && Intrinsics.areEqual(this.releaseDateInt, movie.releaseDateInt) && Intrinsics.areEqual(this.releaseDateRus, movie.releaseDateRus) && Intrinsics.areEqual(this.actors, movie.actors) && Intrinsics.areEqual(this.originalName, movie.originalName) && Intrinsics.areEqual(this.duration, movie.duration) && Intrinsics.areEqual(this.rels, movie.rels) && Intrinsics.areEqual(this.serial, movie.serial) && this.isLiked == movie.isLiked && this.isWatched == movie.isWatched && this.isHasEpisodeKeys == movie.isHasEpisodeKeys && this.updatedAt == movie.updatedAt && this.short == movie.short && Intrinsics.areEqual(this.posterTemplate, movie.posterTemplate) && this.vast == movie.vast && Intrinsics.areEqual(this.adsModel, movie.adsModel);
    }

    public final List<Actor> getActors() {
        return this.actors;
    }

    public final Ads getAdsModel() {
        return this.adsModel;
    }

    public final String getCountries() {
        return this.countries;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDirector() {
        return this.director;
    }

    public final List<Actor> getDirectors() {
        return this.directors;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getGenres() {
        return this.genres;
    }

    public final long getId() {
        return this.id;
    }

    public final String getImdbRating() {
        return this.imdbRating;
    }

    public final String getKsRating() {
        return this.ksRating;
    }

    public final List<String> getMovieSourceTypes() {
        return this.movieSourceTypes;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginalName() {
        return this.originalName;
    }

    public final String getPosterTemplate() {
        return this.posterTemplate;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getReleaseDateInt() {
        return this.releaseDateInt;
    }

    public final String getReleaseDateRus() {
        return this.releaseDateRus;
    }

    public final List<Rel> getRels() {
        return this.rels;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final Boolean getSerial() {
        return this.serial;
    }

    public final boolean getShort() {
        return this.short;
    }

    public final String getStrid() {
        return this.strid;
    }

    public final List<String> getTrailerSourceTypes() {
        return this.trailerSourceTypes;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean getVast() {
        return this.vast;
    }

    public final List<Actor> getWriters() {
        return this.writers;
    }

    public final String getYear() {
        return this.year;
    }

    public final String getZonaRating() {
        return this.zonaRating;
    }

    public int hashCode() {
        long j10 = this.id;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.name;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.year;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.quality;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.trailerSourceTypes;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.movieSourceTypes;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.genres;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.countries;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.zonaRating;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.imdbRating;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ksRating;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.director;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<Actor> list3 = this.directors;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str12 = this.scenario;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.strid;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<Actor> list4 = this.writers;
        int iHashCode17 = (iHashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str14 = this.releaseDateInt;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.releaseDateRus;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<Actor> list5 = this.actors;
        int iHashCode20 = (iHashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str16 = this.originalName;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.duration;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<Rel> list6 = this.rels;
        int iHashCode23 = (iHashCode22 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Boolean bool = this.serial;
        int iHashCode24 = (((((iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31) + (this.isLiked ? 1231 : 1237)) * 31) + (this.isWatched ? 1231 : 1237)) * 31;
        int i11 = this.isHasEpisodeKeys ? 1231 : 1237;
        long j11 = this.updatedAt;
        int i12 = (((((iHashCode24 + i11) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.short ? 1231 : 1237)) * 31;
        String str18 = this.posterTemplate;
        int iHashCode25 = (((i12 + (str18 == null ? 0 : str18.hashCode())) * 31) + (this.vast ? 1231 : 1237)) * 31;
        Ads ads = this.adsModel;
        return iHashCode25 + (ads != null ? ads.hashCode() : 0);
    }

    public final boolean isHasEpisodeKeys() {
        return this.isHasEpisodeKeys;
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public final boolean isWatched() {
        return this.isWatched;
    }

    public final void setHasEpisodeKeys(boolean z10) {
        this.isHasEpisodeKeys = z10;
    }

    public final void setLiked(boolean z10) {
        this.isLiked = z10;
    }

    public final void setSerial(Boolean bool) {
        this.serial = bool;
    }

    public final void setShort(boolean z10) {
        this.short = z10;
    }

    public final void setUpdatedAt(long j10) {
        this.updatedAt = j10;
    }

    public final void setWatched(boolean z10) {
        this.isWatched = z10;
    }

    public String toString() {
        long j10 = this.id;
        String str = this.name;
        String str2 = this.coverUrl;
        String str3 = this.year;
        String str4 = this.description;
        String str5 = this.quality;
        List<String> list = this.trailerSourceTypes;
        List<String> list2 = this.movieSourceTypes;
        String str6 = this.genres;
        String str7 = this.countries;
        String str8 = this.zonaRating;
        String str9 = this.imdbRating;
        String str10 = this.ksRating;
        String str11 = this.director;
        List<Actor> list3 = this.directors;
        String str12 = this.scenario;
        String str13 = this.strid;
        List<Actor> list4 = this.writers;
        String str14 = this.releaseDateInt;
        String str15 = this.releaseDateRus;
        List<Actor> list5 = this.actors;
        String str16 = this.originalName;
        String str17 = this.duration;
        List<Rel> list6 = this.rels;
        Boolean bool = this.serial;
        boolean z10 = this.isLiked;
        boolean z11 = this.isWatched;
        boolean z12 = this.isHasEpisodeKeys;
        long j11 = this.updatedAt;
        boolean z13 = this.short;
        String str18 = this.posterTemplate;
        boolean z14 = this.vast;
        Ads ads = this.adsModel;
        StringBuilder sb2 = new StringBuilder("Movie(id=");
        sb2.append(j10);
        sb2.append(", name=");
        sb2.append(str);
        C8034N.m10004a(sb2, ", coverUrl=", str2, ", year=", str3);
        C8034N.m10004a(sb2, ", description=", str4, ", quality=", str5);
        sb2.append(", trailerSourceTypes=");
        sb2.append(list);
        sb2.append(", movieSourceTypes=");
        sb2.append(list2);
        C8034N.m10004a(sb2, ", genres=", str6, ", countries=", str7);
        C8034N.m10004a(sb2, ", zonaRating=", str8, ", imdbRating=", str9);
        C8034N.m10004a(sb2, ", ksRating=", str10, ", director=", str11);
        sb2.append(", directors=");
        sb2.append(list3);
        sb2.append(", scenario=");
        sb2.append(str12);
        sb2.append(", strid=");
        sb2.append(str13);
        sb2.append(", writers=");
        sb2.append(list4);
        C8034N.m10004a(sb2, ", releaseDateInt=", str14, ", releaseDateRus=", str15);
        sb2.append(", actors=");
        sb2.append(list5);
        sb2.append(", originalName=");
        sb2.append(str16);
        sb2.append(", duration=");
        sb2.append(str17);
        sb2.append(", rels=");
        sb2.append(list6);
        sb2.append(", serial=");
        sb2.append(bool);
        sb2.append(", isLiked=");
        sb2.append(z10);
        sb2.append(", isWatched=");
        sb2.append(z11);
        sb2.append(", isHasEpisodeKeys=");
        sb2.append(z12);
        C3500w.m4269a(sb2, ", updatedAt=", j11, ", short=");
        sb2.append(z13);
        sb2.append(", posterTemplate=");
        sb2.append(str18);
        sb2.append(", vast=");
        sb2.append(z14);
        sb2.append(", adsModel=");
        sb2.append(ads);
        sb2.append(")");
        return sb2.toString();
    }

    public Movie(long j10, String str, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, String str6, String str7, String str8, String str9, String str10, String str11, List<Actor> list3, String str12, String str13, List<Actor> list4, String str14, String str15, List<Actor> list5, String str16, String str17, List<Rel> list6, Boolean bool, boolean z10, boolean z11, boolean z12, long j11, boolean z13, String str18, boolean z14, Ads ads) {
        this.id = j10;
        this.name = str;
        this.coverUrl = str2;
        this.year = str3;
        this.description = str4;
        this.quality = str5;
        this.trailerSourceTypes = list;
        this.movieSourceTypes = list2;
        this.genres = str6;
        this.countries = str7;
        this.zonaRating = str8;
        this.imdbRating = str9;
        this.ksRating = str10;
        this.director = str11;
        this.directors = list3;
        this.scenario = str12;
        this.strid = str13;
        this.writers = list4;
        this.releaseDateInt = str14;
        this.releaseDateRus = str15;
        this.actors = list5;
        this.originalName = str16;
        this.duration = str17;
        this.rels = list6;
        this.serial = bool;
        this.isLiked = z10;
        this.isWatched = z11;
        this.isHasEpisodeKeys = z12;
        this.updatedAt = j11;
        this.short = z13;
        this.posterTemplate = str18;
        this.vast = z14;
        this.adsModel = ads;
    }

    public /* synthetic */ Movie(long j10, String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, String str7, String str8, String str9, String str10, String str11, List list3, String str12, String str13, List list4, String str14, String str15, List list5, String str16, String str17, List list6, Boolean bool, boolean z10, boolean z11, boolean z12, long j11, boolean z13, String str18, boolean z14, Ads ads, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, str3, str4, str5, list, list2, str6, str7, str8, str9, str10, str11, list3, str12, str13, list4, str14, str15, list5, str16, str17, list6, bool, (i10 & 33554432) != 0 ? false : z10, (i10 & 67108864) != 0 ? false : z11, (i10 & 134217728) != 0 ? true : z12, (i10 & 268435456) != 0 ? 0L : j11, (i10 & 536870912) != 0 ? false : z13, str18, (i10 & IntCompanionObject.MIN_VALUE) != 0 ? true : z14, (i11 & 1) != 0 ? null : ads);
    }
}
