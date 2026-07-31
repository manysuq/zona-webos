package io.ktor.utils.p621io;

import java.io.EOFException;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p190K9.C2889d;
import p289Q0.C4501s;
import p388V9.C5663c;
import p406W9.C5877a;
import p796ta.C18330a;
import sa.C18117a;
import sa.C18129m;
import sa.C18130n;
import sa.InterfaceC18127k;
import sa.InterfaceC18128l;

/* JADX INFO: renamed from: io.ktor.utils.io.E */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nByteReadChannelOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,930:1\n1#2:931\n1#2:936\n21#3,3:932\n99#4:935\n100#4,8:937\n*S KotlinDebug\n*F\n+ 1 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt\n*L\n812#1:936\n222#1:932,3\n812#1:935\n812#1:937,8\n*E\n"})
public final class C14720E {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m17280a(InterfaceC14757l interfaceC14757l, int i10, ContinuationImpl continuationImpl) throws EOFException {
        C14759n c14759n;
        if (continuationImpl instanceof C14759n) {
            c14759n = (C14759n) continuationImpl;
            int i11 = c14759n.f48164l;
            if ((i11 & IntCompanionObject.MIN_VALUE) != 0) {
                c14759n.f48164l = i11 - IntCompanionObject.MIN_VALUE;
            } else {
                c14759n = new C14759n(continuationImpl);
            }
        } else {
            c14759n = new C14759n(continuationImpl);
        }
        Object objMo7109h = c14759n.f48163k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c14759n.f48164l;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo7109h);
            c14759n.f48162j = SpillingKt.nullOutSpilledVariable(interfaceC14757l);
            c14759n.f48164l = 1;
            objMo7109h = interfaceC14757l.mo7109h(i10, c14759n);
            if (objMo7109h == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo7109h);
        }
        if (((Boolean) objMo7109h).booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new EOFException("Not enough data available");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (r1.mo7109h(1, r12) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00eb, code lost:
    
        if (r0 == r2) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00eb -> B:20:0x0067). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17281b(InterfaceC14757l interfaceC14757l, InterfaceC14723H interfaceC14723H, long j10, ContinuationImpl continuationImpl) throws Throwable {
        C14760o c14760o;
        InterfaceC14757l interfaceC14757l2;
        long j11;
        long j12;
        C14760o c14760o2;
        InterfaceC14757l interfaceC14757l3;
        long j13;
        long j14;
        ?? r10;
        if (continuationImpl instanceof C14760o) {
            c14760o = (C14760o) continuationImpl;
            int i10 = c14760o.f48171p;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14760o.f48171p = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14760o = new C14760o(continuationImpl);
            }
        } else {
            c14760o = new C14760o(continuationImpl);
        }
        Object obj = c14760o.f48170o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r11 = c14760o.f48171p;
        try {
            if (r11 == 0) {
                ResultKt.throwOnFailure(obj);
                r11 = interfaceC14723H;
                j12 = j10;
                j11 = j12;
                c14760o2 = c14760o;
                interfaceC14757l3 = interfaceC14757l;
                if (interfaceC14757l3.mo7110i()) {
                    c14760o2.f48165j = SpillingKt.nullOutSpilledVariable(interfaceC14757l3);
                    c14760o2.f48166k = SpillingKt.nullOutSpilledVariable(r11);
                    c14760o2.f48168m = j11;
                    c14760o2.f48169n = j12;
                    c14760o2.f48171p = 3;
                    if (r11.mo17298b(c14760o2) != coroutine_suspended) {
                        j13 = j12;
                        j14 = j11;
                    }
                } else {
                    c14760o2.f48165j = SpillingKt.nullOutSpilledVariable(interfaceC14757l3);
                    c14760o2.f48166k = SpillingKt.nullOutSpilledVariable(r11);
                    c14760o2.f48168m = j11;
                    c14760o2.f48169n = j12;
                    c14760o2.f48171p = 3;
                    if (r11.mo17298b(c14760o2) != coroutine_suspended) {
                        j13 = j12;
                        j14 = j11;
                    }
                }
                return coroutine_suspended;
            }
            if (r11 == 1) {
                j12 = c14760o.f48169n;
                j11 = c14760o.f48168m;
                InterfaceC14723H interfaceC14723H2 = (InterfaceC14723H) c14760o.f48166k;
                interfaceC14757l2 = (InterfaceC14757l) c14760o.f48165j;
                ResultKt.throwOnFailure(obj);
                r11 = interfaceC14723H2;
                C18117a c18117aMo7108g = interfaceC14757l2.mo7108g();
                int i11 = C5877a.f19338a;
                c18117aMo7108g.getClass();
                long jMin = Math.min(j12, c18117aMo7108g.f56413d);
                interfaceC14757l2.mo7108g().m20456c(r11.mo17301e(), jMin);
                j12 -= jMin;
                c14760o.f48165j = interfaceC14757l2;
                c14760o.f48166k = r11;
                c14760o.f48168m = j11;
                c14760o.f48169n = j12;
                c14760o.f48171p = 2;
                Object objMo17298b = r11.mo17298b(c14760o);
                r10 = r11;
            } else if (r11 == 2) {
                j12 = c14760o.f48169n;
                j11 = c14760o.f48168m;
                InterfaceC14723H interfaceC14723H3 = (InterfaceC14723H) c14760o.f48166k;
                interfaceC14757l2 = (InterfaceC14757l) c14760o.f48165j;
                ResultKt.throwOnFailure(obj);
                r10 = interfaceC14723H3;
                try {
                    InterfaceC14757l interfaceC14757l4 = interfaceC14757l2;
                    c14760o2 = c14760o;
                    interfaceC14757l3 = interfaceC14757l4;
                    r11 = r10;
                    if (interfaceC14757l3.mo7110i() || j12 <= 0) {
                        c14760o2.f48165j = SpillingKt.nullOutSpilledVariable(interfaceC14757l3);
                        c14760o2.f48166k = SpillingKt.nullOutSpilledVariable(r11);
                        c14760o2.f48168m = j11;
                        c14760o2.f48169n = j12;
                        c14760o2.f48171p = 3;
                        if (r11.mo17298b(c14760o2) != coroutine_suspended) {
                            j13 = j12;
                            j14 = j11;
                        }
                    } else {
                        if (interfaceC14757l3.mo7108g().mo20460i()) {
                            c14760o2.f48165j = interfaceC14757l3;
                            c14760o2.f48166k = r11;
                            c14760o2.f48168m = j11;
                            c14760o2.f48169n = j12;
                            c14760o2.f48171p = 1;
                            int i12 = C14756k.f48157a;
                        }
                        C14760o c14760o3 = c14760o2;
                        interfaceC14757l2 = interfaceC14757l3;
                        c14760o = c14760o3;
                        r11 = r11;
                        C18117a c18117aMo7108g2 = interfaceC14757l2.mo7108g();
                        int i13 = C5877a.f19338a;
                        c18117aMo7108g2.getClass();
                        long jMin2 = Math.min(j12, c18117aMo7108g2.f56413d);
                        interfaceC14757l2.mo7108g().m20456c(r11.mo17301e(), jMin2);
                        j12 -= jMin2;
                        c14760o.f48165j = interfaceC14757l2;
                        c14760o.f48166k = r11;
                        c14760o.f48168m = j11;
                        c14760o.f48169n = j12;
                        c14760o.f48171p = 2;
                        Object objMo17298b2 = r11.mo17298b(c14760o);
                        r10 = r11;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    th = th;
                    C14760o c14760o4 = c14760o2;
                    interfaceC14757l2 = interfaceC14757l3;
                    c14760o = c14760o4;
                    try {
                        interfaceC14757l2.mo7107f(th);
                        C14726K.a aVar = C14726K.f48066a;
                        r11.mo17302f(th);
                        throw th;
                    } catch (Throwable th2) {
                        c14760o.f48165j = SpillingKt.nullOutSpilledVariable(interfaceC14757l2);
                        c14760o.f48166k = SpillingKt.nullOutSpilledVariable(r11);
                        c14760o.f48167l = th2;
                        c14760o.f48168m = j11;
                        c14760o.f48169n = j12;
                        c14760o.f48171p = 4;
                        if (r11.mo17298b(c14760o) != coroutine_suspended) {
                            throw th2;
                        }
                    }
                }
            } else {
                if (r11 != 3) {
                    if (r11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = c14760o.f48167l;
                    ResultKt.throwOnFailure(obj);
                    throw th3;
                }
                j13 = c14760o.f48169n;
                j14 = c14760o.f48168m;
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxLong(j14 - j13);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0051 -> B:26:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    public static final Object m17282c(InterfaceC14757l interfaceC14757l, long j10, ContinuationImpl continuationImpl) throws EOFException {
        C14761p c14761p;
        long j11;
        InterfaceC14757l interfaceC14757l2;
        long j12;
        if (continuationImpl instanceof C14761p) {
            c14761p = (C14761p) continuationImpl;
            int i10 = c14761p.f48176n;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14761p.f48176n = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14761p = new C14761p(continuationImpl);
            }
        } else {
            c14761p = new C14761p(continuationImpl);
        }
        Object obj = c14761p.f48175m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14761p.f48176n;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            j11 = j10;
            if (j10 > 0 || interfaceC14757l.mo7110i()) {
                return Boxing.boxLong(j11 - j10);
            }
            C18117a c18117aMo7108g = interfaceC14757l.mo7108g();
            c18117aMo7108g.getClass();
            if (((int) c18117aMo7108g.f56413d) == 0) {
                c14761p.f48172j = interfaceC14757l;
                c14761p.f48173k = j11;
                c14761p.f48174l = j10;
                c14761p.f48176n = 1;
                int i12 = C14756k.f48157a;
                if (interfaceC14757l.mo7109h(1, c14761p) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC14757l2 = interfaceC14757l;
                j12 = j10;
            }
            C18117a c18117aMo7108g2 = interfaceC14757l.mo7108g();
            int i13 = C5877a.f19338a;
            c18117aMo7108g2.getClass();
            long jMin = Math.min(j10, c18117aMo7108g2.f56413d);
            C5877a.m6712a(interfaceC14757l.mo7108g(), jMin);
            j10 -= jMin;
            if (j10 > 0) {
            }
            return Boxing.boxLong(j11 - j10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j12 = c14761p.f48174l;
        j11 = c14761p.f48173k;
        interfaceC14757l2 = c14761p.f48172j;
        ResultKt.throwOnFailure(obj);
        long j13 = j12;
        interfaceC14757l = interfaceC14757l2;
        j10 = j13;
        C18117a c18117aMo7108g3 = interfaceC14757l.mo7108g();
        int i14 = C5877a.f19338a;
        c18117aMo7108g3.getClass();
        long jMin2 = Math.min(j10, c18117aMo7108g3.f56413d);
        C5877a.m6712a(interfaceC14757l.mo7108g(), jMin2);
        j10 -= jMin2;
        if (j10 > 0) {
        }
        return Boxing.boxLong(j11 - j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m17283d(InterfaceC14757l interfaceC14757l, long j10, ContinuationImpl continuationImpl) throws EOFException {
        C14762q c14762q;
        if (continuationImpl instanceof C14762q) {
            c14762q = (C14762q) continuationImpl;
            int i10 = c14762q.f48180m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14762q.f48180m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14762q = new C14762q(continuationImpl);
            }
        } else {
            c14762q = new C14762q(continuationImpl);
        }
        Object objM17282c = c14762q.f48179l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14762q.f48180m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM17282c);
            c14762q.f48177j = SpillingKt.nullOutSpilledVariable(interfaceC14757l);
            c14762q.f48178k = j10;
            c14762q.f48180m = 1;
            objM17282c = m17282c(interfaceC14757l, j10, c14762q);
            if (objM17282c == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = c14762q.f48178k;
            ResultKt.throwOnFailure(objM17282c);
        }
        if (((Number) objM17282c).longValue() >= j10) {
            return Unit.INSTANCE;
        }
        throw new EOFException(C4501s.m5086a(j10, "Unable to discard ", " bytes"));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x032e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0330  */
    /* JADX WARN: Code duplicated, block: B:104:0x0339  */
    /* JADX WARN: Code duplicated, block: B:106:0x0345  */
    /* JADX WARN: Code duplicated, block: B:109:0x0364  */
    /* JADX WARN: Code duplicated, block: B:112:0x036e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0373  */
    /* JADX WARN: Code duplicated, block: B:115:0x0383  */
    /* JADX WARN: Code duplicated, block: B:118:0x0397  */
    /* JADX WARN: Code duplicated, block: B:120:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:122:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:127:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:135:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:137:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0403  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0267  */
    /* JADX WARN: Code duplicated, block: B:75:0x026e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:88:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:89:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x031d  */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ef, code lost:
    
        r5 = r3;
        r3 = r2;
        r2 = r5;
        r6 = r4;
        r5 = r9;
        r7 = r10;
        r8 = r11;
        r11 = r14;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:139:0x0403, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x02d6 -> B:86:0x02da). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17284e(InterfaceC14757l interfaceC14757l, C2889d c2889d, long j10, boolean z10, boolean z11, ContinuationImpl continuationImpl) throws IOException {
        C14763r c14763r;
        String str;
        String str2;
        long j11;
        InterfaceC18128l interfaceC18128lMo7108g;
        Appendable appendable;
        long j12;
        boolean z12;
        boolean z13;
        boolean z14;
        Ref.LongRef longRef;
        C14763r c14763r2;
        InterfaceC14757l interfaceC14757l2;
        Appendable appendable2;
        long j13;
        long j14;
        long j15;
        String str3;
        boolean z15;
        long j16;
        long jM20479a;
        Appendable appendable3;
        InterfaceC18128l interfaceC18128l;
        InterfaceC14757l interfaceC14757l3;
        Object obj;
        long j17;
        long j18;
        C14763r c14763r3;
        boolean z16;
        Object objMo7109h;
        InterfaceC14757l interfaceC14757l4;
        long j19;
        Object obj2;
        long j20;
        long j21;
        InterfaceC14757l interfaceC14757l5;
        InterfaceC18128l interfaceC18128l2;
        InterfaceC14757l interfaceC14757l6;
        boolean z17;
        Ref.LongRef longRef2;
        InterfaceC18128l interfaceC18128l3;
        long j22;
        boolean z18;
        Appendable appendable4;
        Appendable appendable5;
        long jMin;
        long jM20479a2;
        long j23;
        String str4;
        String str5;
        Appendable appendable6;
        String str6;
        boolean z19;
        Ref.LongRef longRef3;
        byte bM20454a;
        InterfaceC14757l interfaceC14757l7 = interfaceC14757l;
        if (continuationImpl instanceof C14763r) {
            c14763r = (C14763r) continuationImpl;
            int i10 = c14763r.f48193v;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14763r.f48193v = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14763r = new C14763r(continuationImpl);
            }
        } else {
            c14763r = new C14763r(continuationImpl);
        }
        Object objMo7109h2 = c14763r.f48192u;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14763r.f48193v;
        if (i11 != 0) {
            if (i11 == 1) {
                str = "Unexpected end of stream after reading ";
                str2 = " characters";
                j11 = 1;
                boolean z20 = c14763r.f48191t;
                boolean z21 = c14763r.f48190s;
                j12 = c14763r.f48185n;
                interfaceC18128lMo7108g = (InterfaceC18128l) c14763r.f48183l;
                Appendable appendable7 = (Appendable) c14763r.f48182k;
                InterfaceC14757l interfaceC14757l8 = (InterfaceC14757l) c14763r.f48181j;
                ResultKt.throwOnFailure(objMo7109h2);
                z13 = z20;
                interfaceC14757l7 = interfaceC14757l8;
                z12 = z21;
                appendable = appendable7;
            } else {
                if (i11 == 2) {
                    long j24 = c14763r.f48189r;
                    long j25 = c14763r.f48188q;
                    long j26 = c14763r.f48187p;
                    long j27 = c14763r.f48186o;
                    boolean z22 = c14763r.f48191t;
                    boolean z23 = c14763r.f48190s;
                    obj2 = objMo7109h2;
                    long j28 = c14763r.f48185n;
                    longRef = c14763r.f48184m;
                    InterfaceC18128l interfaceC18128l4 = (InterfaceC18128l) c14763r.f48183l;
                    Appendable appendable8 = (Appendable) c14763r.f48182k;
                    InterfaceC14757l interfaceC14757l9 = (InterfaceC14757l) c14763r.f48181j;
                    ResultKt.throwOnFailure(obj2);
                    str3 = " characters";
                    j19 = j25;
                    str = "Unexpected end of stream after reading ";
                    j16 = j27;
                    z15 = z23;
                    jM20479a = j26;
                    j20 = j24;
                    z13 = z22;
                    appendable3 = appendable8;
                    c14763r2 = c14763r;
                    obj = coroutine_suspended;
                    j21 = j28;
                    interfaceC14757l5 = interfaceC14757l9;
                    interfaceC18128l2 = interfaceC18128l4;
                    if (((Boolean) obj2).booleanValue()) {
                        return Boxing.boxLong(longRef.element);
                    }
                    long j29 = j21;
                    m17286g(interfaceC18128l2, appendable3, longRef, 1L);
                    interfaceC18128l = interfaceC18128l2;
                    interfaceC14757l3 = interfaceC14757l5;
                    j13 = j29;
                    j14 = j19;
                    j15 = j20;
                    j17 = j16;
                    j18 = jM20479a;
                    c14763r3 = c14763r2;
                    z16 = z13;
                    if (longRef.element < j13) {
                        int i12 = C5877a.f19338a;
                        if (interfaceC18128l.mo20457d().f56413d == 0) {
                            c14763r3.f48181j = interfaceC14757l3;
                            c14763r3.f48182k = appendable3;
                            c14763r3.f48183l = interfaceC18128l;
                            c14763r3.f48184m = longRef;
                            c14763r3.f48185n = j13;
                            c14763r3.f48190s = z15;
                            c14763r3.f48191t = z16;
                            c14763r3.f48186o = j17;
                            c14763r3.f48187p = j18;
                            c14763r3.f48188q = j14;
                            c14763r3.f48189r = j15;
                            c14763r3.f48193v = 3;
                            int i13 = C14756k.f48157a;
                            objMo7109h = interfaceC14757l3.mo7109h(1, c14763r3);
                            if (objMo7109h == obj) {
                                return obj;
                            }
                            interfaceC14757l4 = interfaceC14757l3;
                            interfaceC18128lMo7108g = interfaceC18128l;
                            z13 = z16;
                            z14 = z15;
                            if (((Boolean) objMo7109h).booleanValue()) {
                                coroutine_suspended = obj;
                                appendable2 = appendable3;
                                c14763r2 = c14763r3;
                                interfaceC14757l2 = interfaceC14757l4;
                            } else {
                                z17 = z14;
                                interfaceC14757l6 = interfaceC14757l4;
                                longRef2 = longRef;
                                interfaceC18128l3 = interfaceC18128lMo7108g;
                                j22 = j13;
                                appendable4 = appendable3;
                                z18 = z13;
                            }
                            if (longRef2.element != 0) {
                            }
                            j23 = longRef2.element;
                            if (j23 <= j22) {
                                throw new IllegalStateException(("Consumed bytes exceed the limit: " + longRef2.element + " > " + j22 + ". It's an implementation bug, please report it.").toString());
                            }
                            if (j23 == j22) {
                                str4 = str3;
                                str5 = str;
                                if (z18) {
                                    throw new EOFException(C4501s.m5086a(j23, str5, str4));
                                }
                                return Boxing.boxLong(j23);
                            }
                            if (j22 != LongCompanionObject.MAX_VALUE) {
                                throw new C5663c("Max line length exceeded");
                            }
                            int i14 = C5877a.f19338a;
                            if (interfaceC18128l3.mo20457d().f56413d == 0) {
                                c14763r3.f48181j = interfaceC14757l6;
                                c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable4);
                                c14763r3.f48183l = interfaceC18128l3;
                                c14763r3.f48184m = longRef2;
                                c14763r3.f48185n = j22;
                                c14763r3.f48190s = z17;
                                c14763r3.f48191t = z18;
                                c14763r3.f48193v = 4;
                                int i15 = C14756k.f48157a;
                                objMo7109h2 = interfaceC14757l6.mo7109h(1, c14763r3);
                                if (objMo7109h2 == obj) {
                                    return obj;
                                }
                                appendable6 = appendable4;
                                if (!((Boolean) objMo7109h2).booleanValue()) {
                                    throw new EOFException(C4501s.m5086a(longRef2.element, str, str3));
                                }
                                z19 = z18;
                                longRef3 = longRef2;
                                str6 = str3;
                            } else {
                                appendable6 = appendable4;
                                str6 = str3;
                                z19 = z18;
                                longRef3 = longRef2;
                            }
                            bM20454a = interfaceC18128l3.mo20457d().m20454a(0L);
                            if (bM20454a == 10) {
                                C5877a.m6712a(interfaceC18128l3, 1L);
                                return Boxing.boxLong(longRef3.element);
                            }
                            if (bM20454a == 13) {
                                c14763r3.f48181j = SpillingKt.nullOutSpilledVariable(interfaceC14757l6);
                                c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable6);
                                c14763r3.f48183l = SpillingKt.nullOutSpilledVariable(interfaceC18128l3);
                                c14763r3.f48184m = longRef3;
                                c14763r3.f48185n = j22;
                                c14763r3.f48190s = z17;
                                c14763r3.f48191t = z19;
                                c14763r3.f48193v = 5;
                                objMo7109h2 = m17285f(interfaceC18128l3, interfaceC14757l6, z17, c14763r3);
                                if (objMo7109h2 == obj) {
                                    return obj;
                                }
                            }
                            throw new C5663c(C4501s.m5086a(j22, "Line exceeds limit of ", str6));
                        }
                        InterfaceC14757l interfaceC14757l10 = interfaceC14757l3;
                        coroutine_suspended = obj;
                        interfaceC14757l2 = interfaceC14757l10;
                        interfaceC18128lMo7108g = interfaceC18128l;
                        appendable2 = appendable3;
                        c14763r2 = c14763r3;
                        z13 = z16;
                        z14 = z15;
                    } else {
                        InterfaceC14757l interfaceC14757l11 = interfaceC14757l3;
                        coroutine_suspended = obj;
                        interfaceC14757l2 = interfaceC14757l11;
                        interfaceC18128lMo7108g = interfaceC18128l;
                        appendable2 = appendable3;
                        c14763r2 = c14763r3;
                        z13 = z16;
                        z14 = z15;
                    }
                    str2 = str3;
                    str = str;
                    j11 = 1;
                    if (longRef.element < j13) {
                    }
                    InterfaceC14757l interfaceC14757l12 = interfaceC14757l2;
                    obj = coroutine_suspended;
                    Appendable appendable9 = appendable2;
                    str3 = str2;
                    str = str;
                    interfaceC14757l6 = interfaceC14757l12;
                    z17 = z14;
                    c14763r3 = c14763r2;
                    longRef2 = longRef;
                    interfaceC18128l3 = interfaceC18128lMo7108g;
                    j22 = j13;
                    z18 = z13;
                    appendable4 = appendable9;
                    if (longRef2.element != 0) {
                    }
                    j23 = longRef2.element;
                    if (j23 <= j22) {
                        throw new IllegalStateException(("Consumed bytes exceed the limit: " + longRef2.element + " > " + j22 + ". It's an implementation bug, please report it.").toString());
                    }
                    if (j23 == j22) {
                        str4 = str3;
                        str5 = str;
                        if (z18) {
                            return Boxing.boxLong(j23);
                        }
                        throw new EOFException(C4501s.m5086a(j23, str5, str4));
                    }
                    if (j22 != LongCompanionObject.MAX_VALUE) {
                        throw new C5663c("Max line length exceeded");
                    }
                    int i16 = C5877a.f19338a;
                    if (interfaceC18128l3.mo20457d().f56413d == 0) {
                        c14763r3.f48181j = interfaceC14757l6;
                        c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable4);
                        c14763r3.f48183l = interfaceC18128l3;
                        c14763r3.f48184m = longRef2;
                        c14763r3.f48185n = j22;
                        c14763r3.f48190s = z17;
                        c14763r3.f48191t = z18;
                        c14763r3.f48193v = 4;
                        int i17 = C14756k.f48157a;
                        objMo7109h2 = interfaceC14757l6.mo7109h(1, c14763r3);
                        if (objMo7109h2 == obj) {
                            return obj;
                        }
                        appendable6 = appendable4;
                        if (!((Boolean) objMo7109h2).booleanValue()) {
                            throw new EOFException(C4501s.m5086a(longRef2.element, str, str3));
                        }
                        z19 = z18;
                        longRef3 = longRef2;
                        str6 = str3;
                    } else {
                        appendable6 = appendable4;
                        str6 = str3;
                        z19 = z18;
                        longRef3 = longRef2;
                    }
                    bM20454a = interfaceC18128l3.mo20457d().m20454a(0L);
                    if (bM20454a == 10) {
                        C5877a.m6712a(interfaceC18128l3, 1L);
                        return Boxing.boxLong(longRef3.element);
                    }
                    if (bM20454a == 13) {
                        c14763r3.f48181j = SpillingKt.nullOutSpilledVariable(interfaceC14757l6);
                        c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable6);
                        c14763r3.f48183l = SpillingKt.nullOutSpilledVariable(interfaceC18128l3);
                        c14763r3.f48184m = longRef3;
                        c14763r3.f48185n = j22;
                        c14763r3.f48190s = z17;
                        c14763r3.f48191t = z19;
                        c14763r3.f48193v = 5;
                        objMo7109h2 = m17285f(interfaceC18128l3, interfaceC14757l6, z17, c14763r3);
                        if (objMo7109h2 == obj) {
                            return obj;
                        }
                    }
                    throw new C5663c(C4501s.m5086a(j22, "Line exceeds limit of ", str6));
                }
                if (i11 == 3) {
                    boolean z24 = c14763r.f48191t;
                    boolean z25 = c14763r.f48190s;
                    long j30 = c14763r.f48185n;
                    Ref.LongRef longRef4 = c14763r.f48184m;
                    InterfaceC18128l interfaceC18128l5 = (InterfaceC18128l) c14763r.f48183l;
                    Appendable appendable10 = (Appendable) c14763r.f48182k;
                    interfaceC14757l4 = (InterfaceC14757l) c14763r.f48181j;
                    ResultKt.throwOnFailure(objMo7109h2);
                    z14 = z25;
                    str = "Unexpected end of stream after reading ";
                    str3 = " characters";
                    longRef = longRef4;
                    interfaceC18128lMo7108g = interfaceC18128l5;
                    appendable3 = appendable10;
                    z13 = z24;
                    objMo7109h = objMo7109h2;
                    c14763r3 = c14763r;
                    obj = coroutine_suspended;
                    j13 = j30;
                    if (((Boolean) objMo7109h).booleanValue()) {
                        z17 = z14;
                        interfaceC14757l6 = interfaceC14757l4;
                        longRef2 = longRef;
                        interfaceC18128l3 = interfaceC18128lMo7108g;
                        j22 = j13;
                        appendable4 = appendable3;
                        z18 = z13;
                    } else {
                        coroutine_suspended = obj;
                        appendable2 = appendable3;
                        c14763r2 = c14763r3;
                        interfaceC14757l2 = interfaceC14757l4;
                        str2 = str3;
                        str = str;
                        j11 = 1;
                        if (longRef.element < j13 || interfaceC14757l2.mo7110i()) {
                            InterfaceC14757l interfaceC14757l13 = interfaceC14757l2;
                            obj = coroutine_suspended;
                            Appendable appendable11 = appendable2;
                            str3 = str2;
                            str = str;
                            interfaceC14757l6 = interfaceC14757l13;
                            z17 = z14;
                            c14763r3 = c14763r2;
                            longRef2 = longRef;
                            interfaceC18128l3 = interfaceC18128lMo7108g;
                            j22 = j13;
                            z18 = z13;
                            appendable4 = appendable11;
                        } else {
                            j16 = j13 - longRef.element;
                            str3 = str2;
                            boolean z26 = z14;
                            jM20479a = C18129m.m20479a(interfaceC18128lMo7108g, (byte) 10, j16, 2);
                            if (z26) {
                                if (jM20479a == -1) {
                                    int i18 = C5877a.f19338a;
                                    appendable5 = appendable2;
                                    jMin = Math.min(j16, interfaceC18128lMo7108g.mo20457d().f56413d - j11);
                                } else {
                                    appendable5 = appendable2;
                                    if (jM20479a == 0) {
                                        jMin = 0;
                                        jM20479a2 = C18129m.m20479a(interfaceC18128lMo7108g, (byte) 13, jMin, 2);
                                    } else {
                                        jMin = jM20479a - j11;
                                    }
                                }
                                jM20479a2 = C18129m.m20479a(interfaceC18128lMo7108g, (byte) 13, jMin, 2);
                            } else {
                                appendable5 = appendable2;
                                str = str;
                                jM20479a2 = -1;
                            }
                            if (jM20479a2 >= 0) {
                                m17286g(interfaceC18128lMo7108g, appendable5, longRef, jM20479a2);
                                C5877a.m6712a(interfaceC18128lMo7108g, j11);
                                return Boxing.boxLong(longRef.element);
                            }
                            Object obj3 = coroutine_suspended;
                            long j31 = jM20479a2;
                            long j32 = j11;
                            appendable3 = appendable5;
                            if (jM20479a == 0) {
                                C5877a.m6712a(interfaceC18128lMo7108g, j32);
                                return Boxing.boxLong(longRef.element);
                            }
                            if (jM20479a > 0) {
                                long j33 = interfaceC18128lMo7108g.mo20457d().m20454a(jM20479a - j32) == 13 ? j32 : 0L;
                                m17286g(interfaceC18128lMo7108g, appendable3, longRef, jM20479a - j33);
                                C5877a.m6712a(interfaceC18128lMo7108g, j33 + j32);
                                return Boxing.boxLong(longRef.element);
                            }
                            int i19 = C5877a.f19338a;
                            long jMin2 = Math.min(j16, interfaceC18128lMo7108g.mo20457d().f56413d);
                            long j34 = jMin2 - j32;
                            if (interfaceC18128lMo7108g.mo20457d().m20454a(j34) == 13) {
                                m17286g(interfaceC18128lMo7108g, appendable3, longRef, j34);
                                c14763r2.f48181j = interfaceC14757l2;
                                c14763r2.f48182k = appendable3;
                                c14763r2.f48183l = interfaceC18128lMo7108g;
                                c14763r2.f48184m = longRef;
                                c14763r2.f48185n = j13;
                                c14763r2.f48190s = z26;
                                c14763r2.f48191t = z13;
                                c14763r2.f48186o = j16;
                                c14763r2.f48187p = jM20479a;
                                c14763r2.f48188q = j31;
                                long j35 = j13;
                                c14763r2.f48189r = jMin2;
                                c14763r2.f48193v = 2;
                                Object objM17285f = m17285f(interfaceC18128lMo7108g, interfaceC14757l2, z26, c14763r2);
                                InterfaceC14757l interfaceC14757l14 = interfaceC14757l2;
                                obj = obj3;
                                if (objM17285f == obj) {
                                    return obj;
                                }
                                j19 = j31;
                                obj2 = objM17285f;
                                z15 = z26;
                                j21 = j35;
                                interfaceC14757l5 = interfaceC14757l14;
                                interfaceC18128l2 = interfaceC18128lMo7108g;
                                j20 = jMin2;
                                if (((Boolean) obj2).booleanValue()) {
                                    return Boxing.boxLong(longRef.element);
                                }
                                long j210 = j21;
                                m17286g(interfaceC18128l2, appendable3, longRef, 1L);
                                interfaceC18128l = interfaceC18128l2;
                                interfaceC14757l3 = interfaceC14757l5;
                                j13 = j210;
                                j14 = j19;
                                j15 = j20;
                            } else {
                                InterfaceC14757l interfaceC14757l15 = interfaceC14757l2;
                                obj = obj3;
                                m17286g(interfaceC18128lMo7108g, appendable3, longRef, jMin2);
                                j15 = jMin2;
                                z15 = z26;
                                interfaceC14757l3 = interfaceC14757l15;
                                j13 = j13;
                                j14 = j31;
                                interfaceC18128l = interfaceC18128lMo7108g;
                            }
                            j17 = j16;
                            j18 = jM20479a;
                            c14763r3 = c14763r2;
                            z16 = z13;
                            if (longRef.element < j13) {
                                int i110 = C5877a.f19338a;
                                if (interfaceC18128l.mo20457d().f56413d == 0) {
                                    c14763r3.f48181j = interfaceC14757l3;
                                    c14763r3.f48182k = appendable3;
                                    c14763r3.f48183l = interfaceC18128l;
                                    c14763r3.f48184m = longRef;
                                    c14763r3.f48185n = j13;
                                    c14763r3.f48190s = z15;
                                    c14763r3.f48191t = z16;
                                    c14763r3.f48186o = j17;
                                    c14763r3.f48187p = j18;
                                    c14763r3.f48188q = j14;
                                    c14763r3.f48189r = j15;
                                    c14763r3.f48193v = 3;
                                    int i111 = C14756k.f48157a;
                                    objMo7109h = interfaceC14757l3.mo7109h(1, c14763r3);
                                    if (objMo7109h == obj) {
                                        return obj;
                                    }
                                    interfaceC14757l4 = interfaceC14757l3;
                                    interfaceC18128lMo7108g = interfaceC18128l;
                                    z13 = z16;
                                    z14 = z15;
                                    if (((Boolean) objMo7109h).booleanValue()) {
                                        z17 = z14;
                                        interfaceC14757l6 = interfaceC14757l4;
                                        longRef2 = longRef;
                                        interfaceC18128l3 = interfaceC18128lMo7108g;
                                        j22 = j13;
                                        appendable4 = appendable3;
                                        z18 = z13;
                                    } else {
                                        coroutine_suspended = obj;
                                        appendable2 = appendable3;
                                        c14763r2 = c14763r3;
                                        interfaceC14757l2 = interfaceC14757l4;
                                    }
                                } else {
                                    InterfaceC14757l interfaceC14757l16 = interfaceC14757l3;
                                    coroutine_suspended = obj;
                                    interfaceC14757l2 = interfaceC14757l16;
                                    interfaceC18128lMo7108g = interfaceC18128l;
                                    appendable2 = appendable3;
                                    c14763r2 = c14763r3;
                                    z13 = z16;
                                    z14 = z15;
                                }
                            } else {
                                InterfaceC14757l interfaceC14757l17 = interfaceC14757l3;
                                coroutine_suspended = obj;
                                interfaceC14757l2 = interfaceC14757l17;
                                interfaceC18128lMo7108g = interfaceC18128l;
                                appendable2 = appendable3;
                                c14763r2 = c14763r3;
                                z13 = z16;
                                z14 = z15;
                            }
                            str2 = str3;
                            str = str;
                            j11 = 1;
                            if (longRef.element < j13) {
                            }
                            InterfaceC14757l interfaceC14757l18 = interfaceC14757l2;
                            obj = coroutine_suspended;
                            Appendable appendable12 = appendable2;
                            str3 = str2;
                            str = str;
                            interfaceC14757l6 = interfaceC14757l18;
                            z17 = z14;
                            c14763r3 = c14763r2;
                            longRef2 = longRef;
                            interfaceC18128l3 = interfaceC18128lMo7108g;
                            j22 = j13;
                            z18 = z13;
                            appendable4 = appendable12;
                        }
                    }
                    if (longRef2.element != 0 && interfaceC14757l6.mo7110i()) {
                        return Boxing.boxLong(-1L);
                    }
                    j23 = longRef2.element;
                    if (j23 <= j22) {
                        throw new IllegalStateException(("Consumed bytes exceed the limit: " + longRef2.element + " > " + j22 + ". It's an implementation bug, please report it.").toString());
                    }
                    if (j23 == j22) {
                        str4 = str3;
                        str5 = str;
                        if (z18) {
                            return Boxing.boxLong(j23);
                        }
                        throw new EOFException(C4501s.m5086a(j23, str5, str4));
                    }
                    if (j22 != LongCompanionObject.MAX_VALUE) {
                        throw new C5663c("Max line length exceeded");
                    }
                    int i112 = C5877a.f19338a;
                    if (interfaceC18128l3.mo20457d().f56413d == 0) {
                        c14763r3.f48181j = interfaceC14757l6;
                        c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable4);
                        c14763r3.f48183l = interfaceC18128l3;
                        c14763r3.f48184m = longRef2;
                        c14763r3.f48185n = j22;
                        c14763r3.f48190s = z17;
                        c14763r3.f48191t = z18;
                        c14763r3.f48193v = 4;
                        int i113 = C14756k.f48157a;
                        objMo7109h2 = interfaceC14757l6.mo7109h(1, c14763r3);
                        if (objMo7109h2 == obj) {
                            return obj;
                        }
                        appendable6 = appendable4;
                        if (!((Boolean) objMo7109h2).booleanValue()) {
                            throw new EOFException(C4501s.m5086a(longRef2.element, str, str3));
                        }
                        z19 = z18;
                        longRef3 = longRef2;
                        str6 = str3;
                    } else {
                        appendable6 = appendable4;
                        str6 = str3;
                        z19 = z18;
                        longRef3 = longRef2;
                    }
                    bM20454a = interfaceC18128l3.mo20457d().m20454a(0L);
                    if (bM20454a == 10) {
                        C5877a.m6712a(interfaceC18128l3, 1L);
                        return Boxing.boxLong(longRef3.element);
                    }
                    if (bM20454a == 13) {
                        c14763r3.f48181j = SpillingKt.nullOutSpilledVariable(interfaceC14757l6);
                        c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable6);
                        c14763r3.f48183l = SpillingKt.nullOutSpilledVariable(interfaceC18128l3);
                        c14763r3.f48184m = longRef3;
                        c14763r3.f48185n = j22;
                        c14763r3.f48190s = z17;
                        c14763r3.f48191t = z19;
                        c14763r3.f48193v = 5;
                        objMo7109h2 = m17285f(interfaceC18128l3, interfaceC14757l6, z17, c14763r3);
                        if (objMo7109h2 == obj) {
                            return obj;
                        }
                    }
                    throw new C5663c(C4501s.m5086a(j22, "Line exceeds limit of ", str6));
                }
                if (i11 == 4) {
                    z18 = c14763r.f48191t;
                    z17 = c14763r.f48190s;
                    long j36 = c14763r.f48185n;
                    longRef2 = c14763r.f48184m;
                    interfaceC18128l3 = (InterfaceC18128l) c14763r.f48183l;
                    appendable6 = (Appendable) c14763r.f48182k;
                    interfaceC14757l6 = (InterfaceC14757l) c14763r.f48181j;
                    ResultKt.throwOnFailure(objMo7109h2);
                    str = "Unexpected end of stream after reading ";
                    str3 = " characters";
                    j22 = j36;
                    c14763r3 = c14763r;
                    obj = coroutine_suspended;
                    if (!((Boolean) objMo7109h2).booleanValue()) {
                        throw new EOFException(C4501s.m5086a(longRef2.element, str, str3));
                    }
                    z19 = z18;
                    longRef3 = longRef2;
                    str6 = str3;
                    bM20454a = interfaceC18128l3.mo20457d().m20454a(0L);
                    if (bM20454a == 10) {
                        C5877a.m6712a(interfaceC18128l3, 1L);
                        return Boxing.boxLong(longRef3.element);
                    }
                    if (bM20454a == 13) {
                        c14763r3.f48181j = SpillingKt.nullOutSpilledVariable(interfaceC14757l6);
                        c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable6);
                        c14763r3.f48183l = SpillingKt.nullOutSpilledVariable(interfaceC18128l3);
                        c14763r3.f48184m = longRef3;
                        c14763r3.f48185n = j22;
                        c14763r3.f48190s = z17;
                        c14763r3.f48191t = z19;
                        c14763r3.f48193v = 5;
                        objMo7109h2 = m17285f(interfaceC18128l3, interfaceC14757l6, z17, c14763r3);
                        if (objMo7109h2 == obj) {
                            return obj;
                        }
                    }
                    throw new C5663c(C4501s.m5086a(j22, "Line exceeds limit of ", str6));
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j37 = c14763r.f48185n;
                longRef3 = c14763r.f48184m;
                ResultKt.throwOnFailure(objMo7109h2);
                j22 = j37;
                str6 = " characters";
            }
            if (((Boolean) objMo7109h2).booleanValue()) {
                return Boxing.boxLong(longRef3.element);
            }
            throw new C5663c(C4501s.m5086a(j22, "Line exceeds limit of ", str6));
        }
        str = "Unexpected end of stream after reading ";
        str2 = " characters";
        j11 = 1;
        ResultKt.throwOnFailure(objMo7109h2);
        interfaceC18128lMo7108g = interfaceC14757l7.mo7108g();
        if (interfaceC18128lMo7108g.mo20460i()) {
            c14763r.f48181j = interfaceC14757l7;
            appendable = c2889d;
            c14763r.f48182k = appendable;
            c14763r.f48183l = interfaceC18128lMo7108g;
            j12 = j10;
            c14763r.f48185n = j12;
            z12 = z10;
            c14763r.f48190s = z12;
            z13 = z11;
            c14763r.f48191t = z13;
            c14763r.f48193v = 1;
            int i20 = C14756k.f48157a;
            if (interfaceC14757l7.mo7109h(1, c14763r) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            appendable = c2889d;
            j12 = j10;
            z12 = z10;
            z13 = z11;
        }
        if (interfaceC14757l7.mo7110i()) {
            return Boxing.boxLong(-1L);
        }
        z14 = z12;
        longRef = new Ref.LongRef();
        c14763r2 = c14763r;
        interfaceC14757l2 = interfaceC14757l7;
        appendable2 = appendable;
        j13 = j12;
        if (longRef.element < j13) {
        }
        InterfaceC14757l interfaceC14757l19 = interfaceC14757l2;
        obj = coroutine_suspended;
        Appendable appendable13 = appendable2;
        str3 = str2;
        str = str;
        interfaceC14757l6 = interfaceC14757l19;
        z17 = z14;
        c14763r3 = c14763r2;
        longRef2 = longRef;
        interfaceC18128l3 = interfaceC18128lMo7108g;
        j22 = j13;
        z18 = z13;
        appendable4 = appendable13;
        if (longRef2.element != 0) {
        }
        j23 = longRef2.element;
        if (j23 <= j22) {
            throw new IllegalStateException(("Consumed bytes exceed the limit: " + longRef2.element + " > " + j22 + ". It's an implementation bug, please report it.").toString());
        }
        if (j23 == j22) {
            str4 = str3;
            str5 = str;
            if (z18) {
                return Boxing.boxLong(j23);
            }
            throw new EOFException(C4501s.m5086a(j23, str5, str4));
        }
        if (j22 != LongCompanionObject.MAX_VALUE) {
            throw new C5663c("Max line length exceeded");
        }
        int i114 = C5877a.f19338a;
        if (interfaceC18128l3.mo20457d().f56413d == 0) {
            c14763r3.f48181j = interfaceC14757l6;
            c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable4);
            c14763r3.f48183l = interfaceC18128l3;
            c14763r3.f48184m = longRef2;
            c14763r3.f48185n = j22;
            c14763r3.f48190s = z17;
            c14763r3.f48191t = z18;
            c14763r3.f48193v = 4;
            int i115 = C14756k.f48157a;
            objMo7109h2 = interfaceC14757l6.mo7109h(1, c14763r3);
            if (objMo7109h2 == obj) {
                return obj;
            }
            appendable6 = appendable4;
            if (!((Boolean) objMo7109h2).booleanValue()) {
                throw new EOFException(C4501s.m5086a(longRef2.element, str, str3));
            }
            z19 = z18;
            longRef3 = longRef2;
            str6 = str3;
        } else {
            appendable6 = appendable4;
            str6 = str3;
            z19 = z18;
            longRef3 = longRef2;
        }
        bM20454a = interfaceC18128l3.mo20457d().m20454a(0L);
        if (bM20454a == 10) {
            C5877a.m6712a(interfaceC18128l3, 1L);
            return Boxing.boxLong(longRef3.element);
        }
        if (bM20454a == 13) {
            c14763r3.f48181j = SpillingKt.nullOutSpilledVariable(interfaceC14757l6);
            c14763r3.f48182k = SpillingKt.nullOutSpilledVariable(appendable6);
            c14763r3.f48183l = SpillingKt.nullOutSpilledVariable(interfaceC18128l3);
            c14763r3.f48184m = longRef3;
            c14763r3.f48185n = j22;
            c14763r3.f48190s = z17;
            c14763r3.f48191t = z19;
            c14763r3.f48193v = 5;
            objMo7109h2 = m17285f(interfaceC18128l3, interfaceC14757l6, z17, c14763r3);
            if (objMo7109h2 == obj) {
                return obj;
            }
            if (((Boolean) objMo7109h2).booleanValue()) {
                return Boxing.boxLong(longRef3.element);
            }
        }
        throw new C5663c(C4501s.m5086a(j22, "Line exceeds limit of ", str6));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[PHI: r10 r12
      0x0068: PHI (r10v5 sa.l) = (r10v0 sa.l), (r10v7 sa.l) binds: [B:15:0x004a, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r12v2 boolean) = (r12v0 boolean), (r12v3 boolean) binds: [B:15:0x004a, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m17285f(InterfaceC18128l interfaceC18128l, InterfaceC14757l interfaceC14757l, boolean z10, ContinuationImpl continuationImpl) throws EOFException {
        C14764s c14764s;
        if (continuationImpl instanceof C14764s) {
            c14764s = (C14764s) continuationImpl;
            int i10 = c14764s.f48198n;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14764s.f48198n = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14764s = new C14764s(continuationImpl);
            }
        } else {
            c14764s = new C14764s(continuationImpl);
        }
        Object objMo7109h = c14764s.f48197m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14764s.f48198n;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objMo7109h);
            int i12 = C5877a.f19338a;
            if (interfaceC18128l.mo20457d().f56413d < 2) {
                c14764s.f48194j = interfaceC18128l;
                c14764s.f48195k = SpillingKt.nullOutSpilledVariable(interfaceC14757l);
                c14764s.f48196l = z10;
                c14764s.f48198n = 1;
                objMo7109h = interfaceC14757l.mo7109h(2, c14764s);
                if (objMo7109h == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC18128l.mo20457d().m20454a(1L) == 10) {
                C5877a.m6712a(interfaceC18128l, 2L);
                return Boxing.boxBoolean(true);
            }
            if (z10) {
                return Boxing.boxBoolean(false);
            }
            C5877a.m6712a(interfaceC18128l, 1L);
            return Boxing.boxBoolean(true);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z10 = c14764s.f48196l;
        interfaceC18128l = c14764s.f48194j;
        ResultKt.throwOnFailure(objMo7109h);
        if (((Boolean) objMo7109h).booleanValue()) {
            if (interfaceC18128l.mo20457d().m20454a(1L) == 10) {
                C5877a.m6712a(interfaceC18128l, 2L);
                return Boxing.boxBoolean(true);
            }
        }
        if (z10) {
            return Boxing.boxBoolean(false);
        }
        C5877a.m6712a(interfaceC18128l, 1L);
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: renamed from: g */
    public static final void m17286g(InterfaceC18128l interfaceC18128l, Appendable appendable, Ref.LongRef longRef, long j10) throws IOException {
        if (j10 > 0) {
            interfaceC18128l.mo20458h(j10);
            String strM20482a = C18130n.m20482a(interfaceC18128l.mo20457d(), j10);
            appendable.append(strM20482a);
            longRef.element += (long) strM20482a.length();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m17287h(InterfaceC14757l interfaceC14757l, int i10, ContinuationImpl continuationImpl) {
        C14765t c14765t;
        if (continuationImpl instanceof C14765t) {
            c14765t = (C14765t) continuationImpl;
            int i11 = c14765t.f48202m;
            if ((i11 & IntCompanionObject.MIN_VALUE) != 0) {
                c14765t.f48202m = i11 - IntCompanionObject.MIN_VALUE;
            } else {
                c14765t = new C14765t(continuationImpl);
            }
        } else {
            c14765t = new C14765t(continuationImpl);
        }
        Object objMo7109h = c14765t.f48201l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c14765t.f48202m;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo7109h);
            if (interfaceC14757l.mo7110i()) {
                return null;
            }
            c14765t.f48199j = interfaceC14757l;
            c14765t.f48200k = i10;
            c14765t.f48202m = 1;
            objMo7109h = interfaceC14757l.mo7109h(i10, c14765t);
            if (objMo7109h == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c14765t.f48200k;
            interfaceC14757l = c14765t.f48199j;
            ResultKt.throwOnFailure(objMo7109h);
        }
        if (((Boolean) objMo7109h).booleanValue()) {
            return new C18330a(C18129m.m20480b(interfaceC14757l.mo7108g().peek(), i10));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m17288i(InterfaceC14757l interfaceC14757l, byte[] bArr, int i10, ContinuationImpl continuationImpl) {
        C14766u c14766u;
        if (continuationImpl instanceof C14766u) {
            c14766u = (C14766u) continuationImpl;
            int i11 = c14766u.f48207n;
            if ((i11 & IntCompanionObject.MIN_VALUE) != 0) {
                c14766u.f48207n = i11 - IntCompanionObject.MIN_VALUE;
            } else {
                c14766u = new C14766u(continuationImpl);
            }
        } else {
            c14766u = new C14766u(continuationImpl);
        }
        Object obj = c14766u.f48206m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c14766u.f48207n;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC14757l.mo7110i()) {
                return Boxing.boxInt(-1);
            }
            if (interfaceC14757l.mo7108g().mo20460i()) {
                c14766u.f48203j = interfaceC14757l;
                c14766u.f48204k = bArr;
                c14766u.f48205l = i10;
                c14766u.f48207n = 1;
                int i13 = C14756k.f48157a;
                if (interfaceC14757l.mo7109h(1, c14766u) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c14766u.f48205l;
            bArr = c14766u.f48204k;
            interfaceC14757l = c14766u.f48203j;
            ResultKt.throwOnFailure(obj);
        }
        if (interfaceC14757l.mo7110i()) {
            return Boxing.boxInt(-1);
        }
        int iM20455b = interfaceC14757l.mo7108g().m20455b(0, i10, bArr);
        return Boxing.boxInt(iM20455b != -1 ? iM20455b : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public static final Object m17289j(InterfaceC14757l interfaceC14757l, ContinuationImpl continuationImpl) {
        C14767v c14767v;
        C18117a c18117a;
        if (continuationImpl instanceof C14767v) {
            c14767v = (C14767v) continuationImpl;
            int i10 = c14767v.f48211m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14767v.f48211m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14767v = new C14767v(continuationImpl);
            }
        } else {
            c14767v = new C14767v(continuationImpl);
        }
        Object obj = c14767v.f48210l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14767v.f48211m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            c18117a = new C18117a();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C18117a c18117a2 = c14767v.f48209k;
            InterfaceC14757l interfaceC14757l2 = c14767v.f48208j;
            ResultKt.throwOnFailure(obj);
            c18117a = c18117a2;
            interfaceC14757l = interfaceC14757l2;
        }
        while (!interfaceC14757l.mo7110i()) {
            c18117a.mo20453W(interfaceC14757l.mo7108g());
            c14767v.f48208j = interfaceC14757l;
            c14767v.f48209k = c18117a;
            c14767v.f48211m = 1;
            int i12 = C14756k.f48157a;
            if (interfaceC14757l.mo7109h(1, c14767v) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable thMo7106a = interfaceC14757l.mo7106a();
        if (thMo7106a == null) {
            return c18117a;
        }
        throw thMo7106a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[PHI: r11 r12 r13
      0x0068: PHI (r11v5 io.ktor.utils.io.l) = (r11v3 io.ktor.utils.io.l), (r11v7 io.ktor.utils.io.l) binds: [B:18:0x0051, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r12v6 sa.a) = (r12v5 sa.a), (r12v7 sa.a) binds: [B:18:0x0051, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r13v7 int) = (r13v6 int), (r13v8 int) binds: [B:18:0x0051, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:24:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0064 -> B:23:0x0066). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: k */
    public static final java.lang.Object m17290k(io.ktor.utils.p621io.InterfaceC14757l r11, int r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.p621io.C14768w
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.w r0 = (io.ktor.utils.p621io.C14768w) r0
            int r1 = r0.f48216n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48216n = r1
            goto L18
        L13:
            io.ktor.utils.io.w r0 = new io.ktor.utils.io.w
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f48215m
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f48216n
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r11 = r0.f48214l
            sa.a r12 = r0.f48213k
            io.ktor.utils.io.l r2 = r0.f48212j
            kotlin.ResultKt.throwOnFailure(r13)
            goto L66
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.throwOnFailure(r13)
            sa.a r13 = new sa.a
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L42:
            long r4 = r12.f56413d
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L99
            sa.a r2 = r11.mo7108g()
            boolean r2 = r2.mo20460i()
            if (r2 == 0) goto L68
            r0.f48212j = r11
            r0.f48213k = r12
            r0.f48214l = r13
            r0.f48216n = r3
            int r2 = io.ktor.utils.p621io.C14756k.f48157a
            java.lang.Object r2 = r11.mo7109h(r3, r0)
            if (r2 != r1) goto L64
            return r1
        L64:
            r2 = r11
            r11 = r13
        L66:
            r13 = r11
            r11 = r2
        L68:
            boolean r2 = r11.mo7110i()
            if (r2 != 0) goto L99
            sa.a r2 = r11.mo7108g()
            int r4 = p406W9.C5877a.f19338a
            r2.getClass()
            long r4 = r2.f56413d
            long r6 = (long) r13
            long r8 = r12.f56413d
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L8d
            sa.a r2 = r11.mo7108g()
            long r4 = r12.f56413d
            long r6 = r6 - r4
            r2.m20456c(r12, r6)
            goto L42
        L8d:
            sa.a r2 = r11.mo7108g()
            long r4 = r2.m20467q(r12)
            kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            goto L42
        L99:
            long r0 = r12.f56413d
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto La1
            return r12
        La1:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = p799u.C18367N.m20672a(r13, r0, r1)
            long r0 = r12.f56413d
            java.lang.String r12 = " available"
            java.lang.String r12 = android.support.v4.media.session.C7408e.m8322a(r0, r12, r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p621io.C14720E.m17290k(io.ktor.utils.io.l, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public static final Object m17291l(InterfaceC14757l interfaceC14757l, long j10, ContinuationImpl continuationImpl) throws EOFException {
        C14770y c14770y;
        InterfaceC18127k c18117a;
        long j11;
        if (continuationImpl instanceof C14770y) {
            c14770y = (C14770y) continuationImpl;
            int i10 = c14770y.f48226o;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14770y.f48226o = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14770y = new C14770y(continuationImpl);
            }
        } else {
            c14770y = new C14770y(continuationImpl);
        }
        Object obj = c14770y.f48225n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14770y.f48226o;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            c18117a = new C18117a();
            j11 = j10;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j12 = c14770y.f48224m;
            j11 = c14770y.f48223l;
            InterfaceC18127k interfaceC18127k = c14770y.f48222k;
            InterfaceC14757l interfaceC14757l2 = c14770y.f48221j;
            ResultKt.throwOnFailure(obj);
            c18117a = interfaceC18127k;
            j10 = j12;
            interfaceC14757l = interfaceC14757l2;
        }
        while (!interfaceC14757l.mo7110i()) {
            long j13 = 0;
            if (j10 <= 0) {
                break;
            }
            C18117a c18117aMo7108g = interfaceC14757l.mo7108g();
            int i12 = C5877a.f19338a;
            c18117aMo7108g.getClass();
            if (j10 >= c18117aMo7108g.f56413d) {
                C18117a c18117aMo7108g2 = interfaceC14757l.mo7108g();
                c18117aMo7108g2.getClass();
                j13 = j10 - c18117aMo7108g2.f56413d;
                Boxing.boxLong(interfaceC14757l.mo7108g().m20467q(c18117a));
            } else {
                interfaceC14757l.mo7108g().m20456c(c18117a, j10);
            }
            c14770y.f48221j = interfaceC14757l;
            c14770y.f48222k = c18117a;
            c14770y.f48223l = j11;
            c14770y.f48224m = j13;
            c14770y.f48226o = 1;
            int i13 = C14756k.f48157a;
            if (interfaceC14757l.mo7109h(1, c14770y) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j10 = j13;
        }
        return c18117a.mo20457d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static final Object m17292m(InterfaceC14757l interfaceC14757l, ContinuationImpl continuationImpl) throws Throwable {
        C14769x c14769x;
        InterfaceC18127k c18117a;
        if (continuationImpl instanceof C14769x) {
            c14769x = (C14769x) continuationImpl;
            int i10 = c14769x.f48220m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14769x.f48220m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14769x = new C14769x(continuationImpl);
            }
        } else {
            c14769x = new C14769x(continuationImpl);
        }
        Object obj = c14769x.f48219l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14769x.f48220m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            c18117a = new C18117a();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC18127k interfaceC18127k = c14769x.f48218k;
            InterfaceC14757l interfaceC14757l2 = c14769x.f48217j;
            ResultKt.throwOnFailure(obj);
            c18117a = interfaceC18127k;
            interfaceC14757l = interfaceC14757l2;
        }
        while (!interfaceC14757l.mo7110i()) {
            c18117a.mo20453W(interfaceC14757l.mo7108g());
            c14769x.f48217j = interfaceC14757l;
            c14769x.f48218k = c18117a;
            c14769x.f48220m = 1;
            int i12 = C14756k.f48157a;
            if (interfaceC14757l.mo7109h(1, c14769x) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable thMo7106a = interfaceC14757l.mo7106a();
        if (thMo7106a == null) {
            return c18117a.mo20457d();
        }
        throw thMo7106a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public static final Object m17293n(InterfaceC14757l interfaceC14757l, ContinuationImpl continuationImpl) {
        C14771z c14771z;
        if (continuationImpl instanceof C14771z) {
            c14771z = (C14771z) continuationImpl;
            int i10 = c14771z.f48229l;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14771z.f48229l = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14771z = new C14771z(continuationImpl);
            }
        } else {
            c14771z = new C14771z(continuationImpl);
        }
        Object obj = c14771z.f48228k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14771z.f48229l;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            c14771z.f48227j = interfaceC14757l;
            c14771z.f48229l = 1;
            if (m17280a(interfaceC14757l, 2, c14771z) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC14757l = c14771z.f48227j;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxShort(interfaceC14757l.mo7108g().readShort());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (m17282c(r7, r5, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17294o(InterfaceC14757l interfaceC14757l, C18330a c18330a, ContinuationImpl continuationImpl) {
        C14718C c14718c;
        if (continuationImpl instanceof C14718C) {
            c14718c = (C14718C) continuationImpl;
            int i10 = c14718c.f48058m;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14718c.f48058m = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14718c = new C14718C(continuationImpl);
            }
        } else {
            c14718c = new C14718C(continuationImpl);
        }
        Object objM17287h = c14718c.f48057l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14718c.f48058m;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM17287h);
            int length = c18330a.f57065b.length;
            c14718c.f48055j = interfaceC14757l;
            c14718c.f48056k = c18330a;
            c14718c.f48058m = 1;
            objM17287h = m17287h(interfaceC14757l, length, c14718c);
            if (objM17287h != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            c18330a = (C18330a) c14718c.f48056k;
            interfaceC14757l = (InterfaceC14757l) c14718c.f48055j;
            ResultKt.throwOnFailure(objM17287h);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM17287h);
        }
        return Boxing.boxBoolean(true);
        if (!Intrinsics.areEqual(objM17287h, c18330a)) {
            return Boxing.boxBoolean(false);
        }
        long length2 = c18330a.f57065b.length;
        c14718c.f48055j = SpillingKt.nullOutSpilledVariable(interfaceC14757l);
        c14718c.f48056k = SpillingKt.nullOutSpilledVariable(c18330a);
        c14718c.f48058m = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public static final Object m17295p(InterfaceC14757l interfaceC14757l, ContinuationImpl continuationImpl) {
        C14719D c14719d;
        if (continuationImpl instanceof C14719D) {
            c14719d = (C14719D) continuationImpl;
            int i10 = c14719d.f48061l;
            if ((i10 & IntCompanionObject.MIN_VALUE) != 0) {
                c14719d.f48061l = i10 - IntCompanionObject.MIN_VALUE;
            } else {
                c14719d = new C14719D(continuationImpl);
            }
        } else {
            c14719d = new C14719D(continuationImpl);
        }
        Object objM17289j = c14719d.f48060k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c14719d.f48061l;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objM17289j);
            c14719d.f48059j = SpillingKt.nullOutSpilledVariable(interfaceC14757l);
            c14719d.f48061l = 1;
            objM17289j = m17289j(interfaceC14757l, c14719d);
            if (objM17289j == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM17289j);
        }
        C18117a c18117a = (C18117a) objM17289j;
        return C18129m.m20480b(c18117a, (int) c18117a.f56413d);
    }
}
