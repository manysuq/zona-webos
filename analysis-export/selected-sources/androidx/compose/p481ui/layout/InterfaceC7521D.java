package androidx.compose.p481ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import p623j$.lang.Iterable$CC;
import p799u.C18368O;
import p799u.C18369P;
import p799u.C18378Z;

/* JADX INFO: renamed from: androidx.compose.ui.layout.D */
/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7521D {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.D$a */
    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n+ 4 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1351:1\n1863#2,2:1352\n938#3,2:1354\n941#3,4:1370\n945#3:1380\n1009#3,3:1381\n1013#3,4:1398\n1017#3:1408\n269#4,7:1356\n280#4,3:1364\n283#4,2:1368\n286#4,6:1374\n269#4,7:1384\n280#4,3:1392\n283#4,2:1396\n286#4,6:1402\n301#4,7:1409\n308#4,4:1417\n301#4,7:1421\n308#4,4:1429\n1399#5:1363\n1270#5:1367\n1399#5:1391\n1270#5:1395\n1123#6:1416\n1123#6:1428\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n*L\n406#1:1352,2\n441#1:1354,2\n441#1:1370,4\n441#1:1380\n457#1:1381,3\n457#1:1398,4\n457#1:1408\n441#1:1356,7\n441#1:1364,3\n441#1:1368,2\n441#1:1374,6\n457#1:1384,7\n457#1:1392,3\n457#1:1396,2\n457#1:1402,6\n478#1:1409,7\n478#1:1417,4\n489#1:1421,7\n489#1:1429,4\n441#1:1363\n441#1:1367\n457#1:1391\n457#1:1395\n478#1:1416\n489#1:1428\n*E\n"})
    public static final class a implements Collection<Object>, KMappedMarker, p623j$.util.Collection {

        /* JADX INFO: renamed from: b */
        public final C18368O<Object> f24631b;

        public a(int i10) {
            int i11 = C18378Z.f57196a;
            this.f24631b = new C18368O<>(6);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.f24631b.m20673b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f24631b.m20674c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.f24631b.m20709a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f24631b.m20709a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Iterable, p623j$.util.Collection
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f24631b.f57194g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            C18368O<Object> c18368o = this.f24631b;
            c18368o.getClass();
            return new C18369P.a(new C18369P(c18368o));
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream<Object> parallelStream() {
            return j$.util.stream.Stream.Wrapper.convert(parallelStream());
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f24631b.m20678g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return this.f24631b.m20678g(collection);
        }

        @Override // java.util.Collection, p623j$.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return this.f24631b.m20680i(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f24631b.f57194g;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return j$.util.Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream<Object> stream() {
            return j$.util.stream.Stream.Wrapper.convert(stream());
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Collection, p623j$.util.Collection
        public /* synthetic */ p623j$.util.stream.Stream parallelStream() {
            return p623j$.util.Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection, java.lang.Iterable, p623j$.util.Collection, p623j$.util.List
        public /* synthetic */ p623j$.util.Spliterator spliterator() {
            return p623j$.util.Collection.CC.$default$spliterator(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Collection, p623j$.util.Collection
        public /* synthetic */ p623j$.util.stream.Stream stream() {
            return p623j$.util.Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, p623j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo3749a(a aVar);

    /* JADX INFO: renamed from: b */
    boolean mo3750b(Object obj, Object obj2);
}
