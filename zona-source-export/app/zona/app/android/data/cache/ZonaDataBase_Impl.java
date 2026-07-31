package ru.zona.app.android.data.cache;

import androidx.room.C7925c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p106Ff.C1624c;
import p247Nc.C3716u;
import p247Nc.C3717v;
import p247Nc.C3718w;
import p247Nc.InterfaceC3696a;
import p247Nc.InterfaceC3700e;
import p247Nc.InterfaceC3708m;
import p488b4.InterfaceC8069z;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m18687d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00140\u0012H\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00130\u0016H\u0016J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u001a\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0013\u0012\u0004\u0012\u00020\u00170\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001e"}, m18688d2 = {"Lru/zona/app/android/data/cache/ZonaDataBase_Impl;", "Lru/zona/app/android/data/cache/ZonaDataBase;", "<init>", "()V", "_roomMovieCacheDao", "Lkotlin/Lazy;", "Lru/zona/app/android/data/cache/RoomMovieCacheDao;", "_roomIdsCacheDao", "Lru/zona/app/android/data/cache/RoomIdsCacheDao;", "_iParamsDao", "Lru/zona/app/android/data/cache/IParamsDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "movieCacheDao", "idsCacheDao", "paramsDao", "ru.zona:android_zonaRelease", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, m18689k = 1, m18690mv = {2, 4, 0}, m18692xi = 48)
public final class ZonaDataBase_Impl extends ZonaDataBase {

    /* JADX INFO: renamed from: l */
    public final Lazy<InterfaceC3708m> f55978l = LazyKt.lazy(new C3716u(this, 0));

    /* JADX INFO: renamed from: m */
    public final Lazy<InterfaceC3700e> f55979m = LazyKt.lazy(new C3717v(this, 0));

    /* JADX INFO: renamed from: n */
    public final Lazy<InterfaceC3696a> f55980n = LazyKt.lazy(new C1624c(1));

    @Override // p488b4.AbstractC8067x
    /* JADX INFO: renamed from: d */
    public final List mo10035d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // p488b4.AbstractC8067x
    /* JADX INFO: renamed from: e */
    public final C7925c mo9890e() {
        return new C7925c(this, new LinkedHashMap(), new LinkedHashMap(), "movie_cache", "ids_cache", "params");
    }

    @Override // p488b4.AbstractC8067x
    /* JADX INFO: renamed from: f */
    public final InterfaceC8069z mo10036f() {
        return new C3718w(this);
    }

    @Override // p488b4.AbstractC8067x
    /* JADX INFO: renamed from: j */
    public final Set<KClass<Object>> mo10038j() {
        return new LinkedHashSet();
    }

    @Override // p488b4.AbstractC8067x
    /* JADX INFO: renamed from: l */
    public final LinkedHashMap mo10039l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InterfaceC3708m.class), CollectionsKt.emptyList());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InterfaceC3700e.class), CollectionsKt.emptyList());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(InterfaceC3696a.class), CollectionsKt.emptyList());
        return linkedHashMap;
    }

    @Override // ru.zona.app.android.data.cache.ZonaDataBase
    /* JADX INFO: renamed from: w */
    public final InterfaceC3700e mo20351w() {
        return this.f55979m.getValue();
    }

    @Override // ru.zona.app.android.data.cache.ZonaDataBase
    /* JADX INFO: renamed from: x */
    public final InterfaceC3708m mo20352x() {
        return this.f55978l.getValue();
    }
}
