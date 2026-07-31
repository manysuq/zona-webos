package p064D9;

import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import p280P9.C4189a;
import p370U9.C5393a;

/* JADX INFO: renamed from: D9.h */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequest.kt\nio/ktor/client/request/HttpRequestKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,440:1\n1#2:441\n21#3:442\n69#4:443\n84#4,8:444\n*S KotlinDebug\n*F\n+ 1 HttpRequest.kt\nio/ktor/client/request/HttpRequestKt\n*L\n400#1:442\n400#1:443\n400#1:444,8\n*E\n"})
public final class C1086h {

    /* JADX INFO: renamed from: a */
    public static final C4189a<InterfaceC1091m> f3953a;

    static {
        KType kTypeTypeOf;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InterfaceC1091m.class);
        try {
            kTypeTypeOf = Reflection.typeOf(InterfaceC1091m.class);
        } catch (Throwable unused) {
            kTypeTypeOf = null;
        }
        f3953a = new C4189a<>("ResponseAdapterAttributeKey", new C5393a(orCreateKotlinClass, kTypeTypeOf));
    }
}
