package androidx.work;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p659io.CloseableKt;
import kotlin.reflect.KClass;
import p020B1.C0223g;
import p023B4.AbstractC0282w;
import p023B4.C0266g;
import p470a1.C6989a;
import p623j$.util.Objects;
import p724p.C17490h;

/* JADX INFO: renamed from: androidx.work.c */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nData_.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Data_.kt\nandroidx/work/Data\n*L\n1#1,841:1\n55#1,2:842\n63#1,4:844\n55#1,2:848\n63#1,4:850\n55#1,2:854\n63#1,4:856\n55#1,2:860\n63#1,4:862\n55#1,2:866\n63#1,4:868\n55#1,2:872\n63#1,4:874\n63#1,4:878\n*S KotlinDebug\n*F\n+ 1 Data_.kt\nandroidx/work/Data\n*L\n76#1:842,2\n84#1:844,4\n93#1:848,2\n101#1:850,4\n110#1:854,2\n118#1:856,4\n127#1:860,2\n135#1:862,4\n144#1:866,2\n152#1:868,4\n161#1:872,2\n169#1:874,4\n185#1:878,4\n*E\n"})
public final class C7934c {

    /* JADX INFO: renamed from: b */
    @JvmField
    public static final C7934c f27266b = new a().m9876a();

    /* JADX INFO: renamed from: a */
    public final HashMap f27267a;

    /* JADX INFO: renamed from: androidx.work.c$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nData_.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Data_.kt\nandroidx/work/Data$Builder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,841:1\n215#2,2:842\n*S KotlinDebug\n*F\n+ 1 Data_.kt\nandroidx/work/Data$Builder\n*L\n469#1:842,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap f27268a = new LinkedHashMap();

        /* JADX INFO: renamed from: a */
        public final C7934c m9876a() {
            C7934c c7934c = new C7934c(this.f27268a);
            b.m9880b(c7934c);
            return c7934c;
        }

        /* JADX INFO: renamed from: b */
        public final void m9877b(Object obj, String str) {
            Object[] objArr;
            if (obj == null) {
                obj = null;
            } else {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
                if (!(Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class)) ? true : Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class)))) {
                    int i10 = 0;
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(boolean[].class))) {
                        boolean[] zArr = (boolean[]) obj;
                        int i11 = C0266g.f890a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i10 < length) {
                            objArr[i10] = Boolean.valueOf(zArr[i10]);
                            i10++;
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
                        byte[] bArr = (byte[]) obj;
                        int i12 = C0266g.f890a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i10 < length2) {
                            objArr[i10] = Byte.valueOf(bArr[i10]);
                            i10++;
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(int[].class))) {
                        int[] iArr = (int[]) obj;
                        int i13 = C0266g.f890a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i10 < length3) {
                            objArr[i10] = Integer.valueOf(iArr[i10]);
                            i10++;
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(long[].class))) {
                        long[] jArr = (long[]) obj;
                        int i14 = C0266g.f890a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i10 < length4) {
                            objArr[i10] = Long.valueOf(jArr[i10]);
                            i10++;
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(float[].class))) {
                        float[] fArr = (float[]) obj;
                        int i15 = C0266g.f890a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i10 < length5) {
                            objArr[i10] = Float.valueOf(fArr[i10]);
                            i10++;
                        }
                    } else {
                        if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + orCreateKotlinClass);
                        }
                        double[] dArr = (double[]) obj;
                        int i16 = C0266g.f890a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i10 < length6) {
                            objArr[i10] = Double.valueOf(dArr[i10]);
                            i10++;
                        }
                    }
                    obj = objArr;
                }
            }
            this.f27268a.put(str, obj);
        }

        /* JADX INFO: renamed from: c */
        public final void m9878c(HashMap map) {
            for (Map.Entry entry : map.entrySet()) {
                m9877b(entry.getValue(), (String) entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$b */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nData_.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Data_.kt\nandroidx/work/Data$Companion\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,841:1\n32#2:842\n32#2:843\n32#2:845\n32#2:846\n1#3:844\n*S KotlinDebug\n*F\n+ 1 Data_.kt\nandroidx/work/Data$Companion\n*L\n599#1:842\n710#1:843\n814#1:845\n816#1:846\n*E\n"})
    public static final class b {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX INFO: renamed from: a */
        public static final Serializable m9879a(byte b10, DataInputStream dataInputStream) throws IOException {
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b10 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b10 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b10 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b10 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b10 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b10 == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b10 == 8) {
                int i11 = dataInputStream.readInt();
                ?? r10 = new Boolean[i11];
                while (i10 < i11) {
                    r10[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return r10;
            }
            if (b10 == 9) {
                int i12 = dataInputStream.readInt();
                ?? r11 = new Byte[i12];
                while (i10 < i12) {
                    r11[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return r11;
            }
            if (b10 == 10) {
                int i13 = dataInputStream.readInt();
                ?? r12 = new Integer[i13];
                while (i10 < i13) {
                    r12[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return r12;
            }
            if (b10 == 11) {
                int i14 = dataInputStream.readInt();
                ?? r13 = new Long[i14];
                while (i10 < i14) {
                    r13[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return r13;
            }
            if (b10 == 12) {
                int i15 = dataInputStream.readInt();
                ?? r14 = new Float[i15];
                while (i10 < i15) {
                    r14[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return r14;
            }
            if (b10 == 13) {
                int i16 = dataInputStream.readInt();
                ?? r15 = new Double[i16];
                while (i10 < i16) {
                    r15[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return r15;
            }
            if (b10 != 14) {
                throw new IllegalStateException(C17490h.m19873a(b10, "Unsupported type "));
            }
            int i17 = dataInputStream.readInt();
            ?? r16 = new String[i17];
            while (i10 < i17) {
                String utf = dataInputStream.readUTF();
                if (Intrinsics.areEqual(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                r16[i10] = utf;
                i10++;
            }
            return r16;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public static byte[] m9880b(C7934c c7934c) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    dataOutputStream.writeInt(c7934c.f27267a.size());
                    for (Map.Entry entry : c7934c.f27267a.entrySet()) {
                        m9881c(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(dataOutputStream, null);
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(dataOutputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                int i10 = C0266g.f890a;
                AbstractC0282w.m386a().getClass();
                return new byte[0];
            }
        }

        /* JADX INFO: renamed from: c */
        public static final void m9881c(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            int i10;
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
                }
                Object[] objArr = (Object[]) obj;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(objArr.getClass());
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class))) {
                    i10 = 8;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class))) {
                    i10 = 9;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class))) {
                    i10 = 10;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class))) {
                    i10 = 11;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class))) {
                    i10 = 12;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class))) {
                    i10 = 13;
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class))) {
                        throw new IllegalArgumentException("Unsupported value type " + Reflection.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName());
                    }
                    i10 = 14;
                }
                dataOutputStream.writeByte(i10);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i10 == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i10 == 9) {
                        Byte b10 = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                    } else if (i10 == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i10 == 11) {
                        Long l10 = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                    } else if (i10 == 12) {
                        Float f10 = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
                    } else if (i10 == 13) {
                        Double d10 = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                    } else if (i10 == 14) {
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                }
            }
            dataOutputStream.writeUTF(str);
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$c */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static final class c extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

        /* JADX INFO: renamed from: g */
        public static final c f27269g = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
            Map.Entry<? extends String, ? extends Object> entry2 = entry;
            String key = entry2.getKey();
            Object value = entry2.getValue();
            StringBuilder sbM351a = C0223g.m351a(key, " : ");
            if (value instanceof Object[]) {
                value = Arrays.toString((Object[]) value);
            }
            sbM351a.append(value);
            return sbM351a.toString();
        }
    }

    public C7934c(C7934c c7934c) {
        this.f27267a = new HashMap(c7934c.f27267a);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final C7934c m9873a(byte[] bArr) {
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bArr.length == 0) {
            return f27266b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i10 = 0;
            boolean z10 = bArr2[0] == ((byte) 16777132) && bArr2[1] == ((byte) (-21267));
            byteArrayInputStream.reset();
            if (z10) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i11 = objectInputStream.readInt();
                    while (i10 < i11) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i10++;
                    }
                    CloseableKt.closeFinally(objectInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s5 = dataInputStream.readShort();
                    if (s5 != -21521) {
                        throw new IllegalStateException(C17490h.m19873a(s5, "Magic number doesn't match: ").toString());
                    }
                    short s10 = dataInputStream.readShort();
                    if (s10 != 1) {
                        throw new IllegalStateException(C17490h.m19873a(s10, "Unsupported version number: ").toString());
                    }
                    int i12 = dataInputStream.readInt();
                    while (i10 < i12) {
                        linkedHashMap.put(dataInputStream.readUTF(), b.m9879a(dataInputStream.readByte(), dataInputStream));
                        i10++;
                    }
                    CloseableKt.closeFinally(dataInputStream, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException unused) {
            int i13 = C0266g.f890a;
            AbstractC0282w.m386a().getClass();
        } catch (ClassNotFoundException unused2) {
            int i14 = C0266g.f890a;
            AbstractC0282w.m386a().getClass();
        }
        return new C7934c(linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final String m9874b(String str) {
        Object obj = this.f27267a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9875c(String str) {
        Object obj = this.f27267a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    public final boolean equals(Object obj) {
        boolean zAreEqual;
        if (this != obj) {
            if (obj != null && Intrinsics.areEqual(C7934c.class, obj.getClass())) {
                HashMap map = ((C7934c) obj).f27267a;
                HashMap map2 = this.f27267a;
                Set<String> setKeySet = map2.keySet();
                if (Intrinsics.areEqual(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zAreEqual = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zAreEqual = ArraysKt.contentDeepEquals(objArr, (Object[]) obj3);
                            } else {
                                zAreEqual = Intrinsics.areEqual(obj2, obj3);
                            }
                        } else {
                            zAreEqual = Intrinsics.areEqual(obj2, obj3);
                        }
                        if (!zAreEqual) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f27267a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ ArraysKt.contentDeepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return C6989a.m7848b(CollectionsKt___CollectionsKt.joinToString$default(this.f27267a.entrySet(), null, null, null, 0, null, c.f27269g, 31, null), "}", new StringBuilder("Data {"));
    }

    public C7934c(LinkedHashMap linkedHashMap) {
        this.f27267a = new HashMap(linkedHashMap);
    }
}
