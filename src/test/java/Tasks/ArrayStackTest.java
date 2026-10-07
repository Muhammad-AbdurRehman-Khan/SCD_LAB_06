package Lab06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {

    @Test
    @DisplayName("push(10), push(20), push(30) then pop() returns 30 (LIFO)")
    void testPushThenPopReturnsLastPushed() {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
    }

    @Test
    @DisplayName("Stack size grows correctly with each push")
    void testSizeAfterPushes() {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(3, stack.size());
    }

    @Test
    @DisplayName("popping an empty stack throws EmptyStackException")
    void testPopEmptyStackThrows() {
        Stack<Integer> stack = new ArrayStack<>();
        assertThrows(java.util.EmptyStackException.class, stack::pop);
    }
}
