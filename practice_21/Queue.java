package practice_21;

public interface Queue<E> {
    void enqueue(E element);
    E dequeue();
    E element();
    int size();
    boolean isEmpty();
    void clear();
}