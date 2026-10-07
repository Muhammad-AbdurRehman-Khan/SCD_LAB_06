package Lab06;

/**
 * Stack ADT (the "contract").
 * Declares WHAT a stack can do (LIFO behaviour), not HOW it is done.
 */
public interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
