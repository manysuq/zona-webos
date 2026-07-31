package com.yandex.div.internal.viewpool;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import p623j$.lang.Iterable$CC;
import p623j$.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18687d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u000f\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u001aJ\u000f\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u001e2\u0010\u0010\"\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J)\u0010#\u001a\u00020\u001e2\u0010\u0010\"\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010!2\u0006\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00104\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010 ¨\u00068"}, m18688d2 = {"Lcom/yandex/div/internal/viewpool/BatchBlockingQueue;", "E", "Ljava/util/AbstractQueue;", "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/Queue;", "backingQueue", "<init>", "(Ljava/util/Queue;)V", "", "notSupported", "()Ljava/lang/Void;", "element", "", "add", "(Ljava/lang/Object;)Z", "offer", "", "put", "(Ljava/lang/Object;)V", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z", "poll", "()Ljava/lang/Object;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "take", "peek", "remove", "", "remainingCapacity", "()I", "", "c", "drainTo", "(Ljava/util/Collection;)I", "maxElements", "(Ljava/util/Collection;I)I", "", "iterator", "()Ljava/util/Iterator;", "j$/util/Spliterator", "spliterator", "()Lj$/util/Spliterator;", "queue", "Ljava/util/Queue;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "notEmpty", "Ljava/util/concurrent/locks/Condition;", "getSize", "size", "div_release"}, m18689k = 1, m18690mv = {1, 8, 0}, m18692xi = 48)
public final class BatchBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, Collection {
    private final ReentrantLock lock;
    private final Condition notEmpty;
    private final Queue<E> queue;

    public BatchBlockingQueue(Queue<E> queue) {
        this.queue = queue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
    }

    private final Void notSupported() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E element) {
        return offer(element);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> c10) {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.lang.Iterable, p623j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public int getSize() {
        this.lock.lock();
        try {
            return this.queue.size();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E element, long timeout, TimeUnit unit) {
        return offer(element);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return j$.util.stream.Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Queue
    public E peek() {
        this.lock.lock();
        try {
            return this.queue.peek();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Queue
    public E poll() {
        this.lock.lock();
        try {
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E element) {
        offer(element);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object element) {
        this.lock.lock();
        try {
            return this.queue.remove(element);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Collection, p623j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return j$.util.stream.Stream.Wrapper.convert(stream());
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.lock.lockInterruptibly();
        while (this.queue.isEmpty()) {
            try {
                this.notEmpty.await();
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        E ePoll = this.queue.poll();
        this.lock.unlock();
        return ePoll;
    }

    @Override // java.util.Collection, p623j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(java.util.Collection<? super E> c10, int maxElements) {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E element) {
        this.lock.lock();
        try {
            this.queue.offer(element);
            this.notEmpty.signal();
            Unit unit = Unit.INSTANCE;
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Collection, p623j$.util.Collection
    public /* synthetic */ p623j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, p623j$.util.Collection, p623j$.util.List
    public p623j$.util.Spliterator<E> spliterator() {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Collection, p623j$.util.Collection
    public /* synthetic */ p623j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        this.lock.lockInterruptibly();
        try {
            long nanos = unit.toNanos(timeout);
            while (this.queue.isEmpty() && nanos > 0) {
                nanos = this.notEmpty.awaitNanos(nanos);
            }
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }
}
