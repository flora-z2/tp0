package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testPushAndPeek() {
        Stack stack = new Stack();
        stack.push(42);
        assertEquals(42, stack.peek());
    }

    @Test
    void testPushIncreasesSize() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.size());
    }

    @Test
    void testPopReturnsLastPushedElement() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(15);
        int popped = stack.pop();
        assertEquals(15, popped);
        assertEquals(1, stack.size());
    }

    @Test
    void testPeekDoesNotRemoveElement() {
        Stack stack = new Stack();
        stack.push(100);
        int peeked = stack.peek();
        assertEquals(100, peeked);
        assertEquals(1, stack.size());
    }

    @Test
    void testIsEmptyOnNewStack() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmptyAfterPushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPopOnEmptyStackThrowsException() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void testPeekOnEmptyStackThrowsException() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    void testAutomaticExpansion() {
        Stack stack = new Stack();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(15, stack.size());
        assertEquals(14, stack.peek());
    }
}
