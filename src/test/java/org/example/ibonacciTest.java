package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacciOf0() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void testFibonacciOf1() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void testFibonacciOf5() {
        assertEquals(5, Fibonacci.fibonacci(5)); // 0 1 1 2 3 5
    }

    @Test
    void testFibonacciOf10() {
        assertEquals(55, Fibonacci.fibonacci(10)); // 0 1 1 2 3 5 8 13 21 34 55
    }

    @Test
    void testFibonacciNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-3));
    }
}
