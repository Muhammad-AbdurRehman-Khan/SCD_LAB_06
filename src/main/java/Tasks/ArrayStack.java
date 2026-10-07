package Lab06;

import java.util.EmptyStackException;

/**
 * Concrete, array-backed implementation of the Stack ADT.
 * Client code only needs to know it fulfils the Stack contract,
 * not that an array is used underneath.
 */
public class ArrayStack<T> implements Stack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        data = new Object[10];
        top = -1;
    }

    @Override
    public void push(T item) {
        if (top + 1 == data.length) {
            grow();
        }
        data[++top] = item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) data[top];
        data[top--] = null;
        return item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }

    private void grow() {
        Object[] bigger = new Object[data.length * 2];
        System.arraycopy(data, 0, bigger, 0, data.length);
        data = bigger;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size after 3 pushes: " + stack.size());

        int popped = stack.pop();
        System.out.println("pop() returned: " + popped);

        System.out.println("Is (10, 20) == LIFO order after pop? "
                + "next pop() should be 20 -> " + stack.pop());
        System.out.println("Remaining size: " + stack.size());
    }
}
