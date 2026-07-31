package p031Bc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.UStringsKt;
import kotlin.time.DurationKt;
import org.conscrypt.PSKKeyManager;
import p156Ib.C2350h;
import p323Rg.C4787a;
import p323Rg.C4788b;
import p323Rg.C4789c;
import p323Rg.C4790d;
import p323Rg.C4791e;
import p323Rg.C4792f;
import p323Rg.C4793g;
import p323Rg.C4795i;
import p323Rg.C4796j;
import p323Rg.C4797k;

/* JADX INFO: renamed from: Bc.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
public final class C0392h {
    /* JADX WARN: Code duplicated, block: B:26:0x0831  */
    /* JADX WARN: Code duplicated, block: B:30:0x0895  */
    /* JADX WARN: Code duplicated, block: B:32:0x0898 A[LOOP:1: B:31:0x0896->B:32:0x0898, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0930  */
    /* JADX WARN: Code duplicated, block: B:37:0x0934  */
    /* JADX WARN: Code duplicated, block: B:40:0x093d  */
    /* JADX WARN: Code duplicated, block: B:43:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x09fe A[LOOP:3: B:49:0x09fc->B:50:0x09fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0a1a A[LOOP:0: B:28:0x0843->B:53:0x0a1a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x08af A[EDGE_INSN: B:61:0x08af->B:34:0x08af BREAK  A[LOOP:0: B:28:0x0843->B:53:0x0a1a], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static String m789a(long j10, Object obj) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        String str;
        Integer num;
        Integer num2;
        long j11;
        boolean z10;
        boolean z11;
        Object objNewInstance;
        byte[] bArr;
        long j12;
        long j13;
        byte[] bArr2;
        int iIntValue;
        Object objInvoke;
        Boolean bool;
        int i10;
        long jNextLong;
        int i11;
        int i12;
        StringBuilder sb2;
        int i13;
        long j14 = j10 / DurationKt.MILLIS_IN_DAY;
        Object objInvoke2 = obj.getClass().getMethod(C4796j.m5374a(-30, -32, -15, -43, -28, -26, -18, -28, -123, -30, -32, -56, -28, -21, -28, -30, -32, -9), null).invoke(obj, null);
        Object objInvoke3 = objInvoke2.getClass().getMethod(C4788b.m5364a(82, 80, 65, 116, 69, 69, 89, 92, 86, 84, 53, 65, 92, 90, 91, 124, 91, 83, 90), String.class, Integer.TYPE).invoke(objInvoke2, obj.getClass().getMethod(C4793g.m5370b(83, 81, 64, 100, 85, 52, 87, 95, 85, 83, 81, 122, 85, 89, 81), null).invoke(obj, null), 0);
        String string = objInvoke3.getClass().getField(C4791e.m5368b(83, 79, 85, 32, 82, 67, 69, 100, 73, 82)).get(objInvoke3).toString();
        Object objInvoke4 = obj.getClass().getMethod(C4792f.m5369b(79, 77, 92, 107, 40, 73, 75, 64, 77, 108, 65, 90), null).invoke(obj, null);
        Class<?> cls = Class.forName(C4795i.m5372a(-24, -29, -12, -29, -84, -21, -19, -126, -84, -60, -21, -18, -25));
        Object objNewInstance2 = cls.getConstructor(cls, String.class).newInstance(objInvoke4, C2350h.m3029d());
        String str2 = string;
        String string2 = cls.getDeclaredMethod(C4791e.m5368b(70, 68, 85, 33, 96, 67, 82, 78, 77, 84, 85, 68, 113, 64, 85, 73), null).invoke(objNewInstance2, null).toString();
        try {
            str = string2;
            num = 47;
            try {
                num2 = -69;
                try {
                    j11 = j14;
                    try {
                        if (Class.forName(C4797k.m5378a(-110, -99, -105, -127, -100, -102, -105, -35, -100, -13, -128, -35, -79, -122, -102, -97, -105) + "$" + C4793g.m5370b(-101, -120, -97, -98, -124, -51, -126, -125)).getDeclaredField(C4791e.m5368b(53, 34, 45, 102, 57, 47, 40, 50)).getInt(null) >= Class.forName(C4791e.m5368b(-109, -100, -106, -14, -128, -99, -101, -106, -36, -99, -127, -36, -80, -121, -101, -98, -106) + "$" + C4788b.m5364a(19, 0, 23, 22, 12, 10, 11, 26, 6, 10, 69, 1, 0, 22)).getDeclaredField(C4789c.m5365b(-101, -41, -104, -101, -101, -98, -121, -104, -121)).getInt(null)) {
                            Class.forName(C4791e.m5368b(74, 69, 79, 43, 89, 68, 66, 79, 5, 88, 82, 88, 95, 78, 70, 5, 100, 88)).getMethod(C4789c.m5365b(-56, -69, -62, -42, -41, -46, -43, -48), String.class, String.class).invoke(null, str2, str);
                        } else {
                            Field declaredField = Class.forName(C4793g.m5370b(-83, -88, -93, -94, -82, -63, -77, -92, -17, -88, -82, -17, -115, -88, -93, -94, -82, -77, -92)).getDeclaredField(C4787a.m5363a(125, 18, 14));
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(null);
                            obj2.getClass().getMethod(C4790d.m5367b(-54, -64, -71, -44, -43, -48, -41, -46), String.class, String.class).invoke(obj2, str2, str);
                        }
                        z10 = true;
                        while (true) {
                            bArr2 = bArr;
                            iIntValue = ((Integer) objNewInstance.getClass().getMethod(C4791e.m5368b(108, 123, 127, 30, 122), bArr2.getClass()).invoke(objNewInstance, bArr2)).intValue();
                            if (iIntValue > 0) {
                                i13 = 0;
                                while (i13 < iIntValue) {
                                    long j15 = ((((long) bArr2[i13]) + j11) % ((long) PSKKeyManager.MAX_KEY_LENGTH_BYTES)) + j13;
                                    long j16 = 65521;
                                    long j17 = j15 % j16;
                                    j12 = (j12 + j17) % j16;
                                    i13++;
                                    j13 = j17;
                                }
                            }
                            if (iIntValue <= 0) {
                                break;
                            }
                            bArr = bArr2;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        z10 = false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j11 = j14;
                    e.printStackTrace();
                    z10 = false;
                    z11 = z10;
                    Constructor<?> constructor = Class.forName(C4788b.m5364a(44, 39, 48, 39, 104, num, 41, 104, 0, num, 70, 42, 35, 15, 40, 54, 51, 50, 21, 50, 52, 35, 39, 43)).getConstructor(String.class);
                    if (z11) {
                        str2 = str;
                    }
                    objNewInstance = constructor.newInstance(str2);
                    bArr = new byte[2048];
                    j12 = 0;
                    j13 = 1;
                    while (true) {
                        bArr2 = bArr;
                        iIntValue = ((Integer) objNewInstance.getClass().getMethod(C4791e.m5368b(108, 123, 127, 30, 122), bArr2.getClass()).invoke(objNewInstance, bArr2)).intValue();
                        if (iIntValue > 0) {
                            i13 = 0;
                            while (i13 < iIntValue) {
                                long j18 = ((((long) bArr2[i13]) + j11) % ((long) PSKKeyManager.MAX_KEY_LENGTH_BYTES)) + j13;
                                long j19 = 65521;
                                long j110 = j18 % j19;
                                j12 = (j12 + j110) % j19;
                                i13++;
                                j13 = j110;
                            }
                        }
                        if (iIntValue <= 0) {
                            break;
                            break;
                        }
                        bArr = bArr2;
                    }
                    objNewInstance.getClass().getMethod(C4790d.m5367b(-99, -110, -2, -111, -115, -101), null).invoke(objNewInstance, null);
                    objInvoke = cls.getMethod(C4791e.m5368b(-20, -19, -28, -120, -19, -4, -19), null).invoke(objNewInstance2, null);
                    if (objInvoke instanceof Boolean) {
                        bool = (Boolean) objInvoke;
                    } else {
                        bool = null;
                    }
                    if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
                        cls.getMethod(C4795i.m5372a(-70, num2, -78, num2, -86, num2, -111, -34, -80, -101, -90, -73, -86), null).invoke(objNewInstance2, null);
                    }
                    long j20 = (j12 << 16) + j13;
                    i10 = (int) (j10 / ((long) 1000));
                    jNextLong = Random.INSTANCE.nextLong();
                    for (i11 = 0; i11 < 32; i11++) {
                        if (((1 << i11) & i10) == 0) {
                            jNextLong &= ~(1 << ((i11 * 2) + 1));
                        } else {
                            jNextLong |= 1 << ((i11 * 2) + 1);
                        }
                    }
                    long j21 = (-257) & jNextLong;
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    byteBufferAllocate.putLong(0, j21);
                    byteBufferAllocate.putLong(8, j20 ^ j21);
                    sb2 = new StringBuilder();
                    for (byte b10 : byteBufferAllocate.array()) {
                        sb2.append(StringsKt__StringsKt.padStart(UStringsKt.m26950toStringLxnNnR4(UByte.m25614constructorimpl(b10), 16), 2, '0'));
                    }
                    return sb2.toString();
                }
            } catch (Exception e12) {
                e = e12;
                num2 = -69;
                j11 = j14;
                e.printStackTrace();
                z10 = false;
                z11 = z10;
                Constructor<?> constructor2 = Class.forName(C4788b.m5364a(44, 39, 48, 39, 104, num, 41, 104, 0, num, 70, 42, 35, 15, 40, 54, 51, 50, 21, 50, 52, 35, 39, 43)).getConstructor(String.class);
                if (z11) {
                    str2 = str;
                }
                objNewInstance = constructor2.newInstance(str2);
                bArr = new byte[2048];
                j12 = 0;
                j13 = 1;
                while (true) {
                    bArr2 = bArr;
                    iIntValue = ((Integer) objNewInstance.getClass().getMethod(C4791e.m5368b(108, 123, 127, 30, 122), bArr2.getClass()).invoke(objNewInstance, bArr2)).intValue();
                    if (iIntValue > 0) {
                        i13 = 0;
                        while (i13 < iIntValue) {
                            long j111 = ((((long) bArr2[i13]) + j11) % ((long) PSKKeyManager.MAX_KEY_LENGTH_BYTES)) + j13;
                            long j112 = 65521;
                            long j113 = j111 % j112;
                            j12 = (j12 + j113) % j112;
                            i13++;
                            j13 = j113;
                        }
                    }
                    if (iIntValue <= 0) {
                        break;
                        break;
                    }
                    bArr = bArr2;
                }
                objNewInstance.getClass().getMethod(C4790d.m5367b(-99, -110, -2, -111, -115, -101), null).invoke(objNewInstance, null);
                objInvoke = cls.getMethod(C4791e.m5368b(-20, -19, -28, -120, -19, -4, -19), null).invoke(objNewInstance2, null);
                if (objInvoke instanceof Boolean) {
                    bool = (Boolean) objInvoke;
                } else {
                    bool = null;
                }
                if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    cls.getMethod(C4795i.m5372a(-70, num2, -78, num2, -86, num2, -111, -34, -80, -101, -90, -73, -86), null).invoke(objNewInstance2, null);
                }
                long j22 = (j12 << 16) + j13;
                i10 = (int) (j10 / ((long) 1000));
                jNextLong = Random.INSTANCE.nextLong();
                while (i11 < 32) {
                    if (((1 << i11) & i10) == 0) {
                        jNextLong &= ~(1 << ((i11 * 2) + 1));
                    } else {
                        jNextLong |= 1 << ((i11 * 2) + 1);
                    }
                }
                long j23 = (-257) & jNextLong;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
                byteBufferAllocate2.putLong(0, j23);
                byteBufferAllocate2.putLong(8, j22 ^ j23);
                sb2 = new StringBuilder();
                while (i12 < r2) {
                    sb2.append(StringsKt__StringsKt.padStart(UStringsKt.m26950toStringLxnNnR4(UByte.m25614constructorimpl(b10), 16), 2, '0'));
                }
                return sb2.toString();
            }
        } catch (Exception e13) {
            e = e13;
            str = string2;
            num = 47;
        }
        z11 = z10;
        Constructor<?> constructor3 = Class.forName(C4788b.m5364a(44, 39, 48, 39, 104, num, 41, 104, 0, num, 70, 42, 35, 15, 40, 54, 51, 50, 21, 50, 52, 35, 39, 43)).getConstructor(String.class);
        if (z11) {
            str2 = str;
        }
        objNewInstance = constructor3.newInstance(str2);
        bArr = new byte[2048];
        j12 = 0;
        j13 = 1;
        objNewInstance.getClass().getMethod(C4790d.m5367b(-99, -110, -2, -111, -115, -101), null).invoke(objNewInstance, null);
        objInvoke = cls.getMethod(C4791e.m5368b(-20, -19, -28, -120, -19, -4, -19), null).invoke(objNewInstance2, null);
        if (objInvoke instanceof Boolean) {
            bool = (Boolean) objInvoke;
        } else {
            bool = null;
        }
        if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
            cls.getMethod(C4795i.m5372a(-70, num2, -78, num2, -86, num2, -111, -34, -80, -101, -90, -73, -86), null).invoke(objNewInstance2, null);
        }
        long j24 = (j12 << 16) + j13;
        i10 = (int) (j10 / ((long) 1000));
        jNextLong = Random.INSTANCE.nextLong();
        while (i11 < 32) {
            if (((1 << i11) & i10) == 0) {
                jNextLong &= ~(1 << ((i11 * 2) + 1));
            } else {
                jNextLong |= 1 << ((i11 * 2) + 1);
            }
        }
        long j25 = (-257) & jNextLong;
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(16);
        byteBufferAllocate3.putLong(0, j25);
        byteBufferAllocate3.putLong(8, j24 ^ j25);
        sb2 = new StringBuilder();
        while (i12 < r2) {
            sb2.append(StringsKt__StringsKt.padStart(UStringsKt.m26950toStringLxnNnR4(UByte.m25614constructorimpl(b10), 16), 2, '0'));
        }
        return sb2.toString();
    }
}
