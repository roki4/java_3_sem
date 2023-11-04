package practice_14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}