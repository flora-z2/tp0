package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorialForZero() {
        assertEquals(1, Factorial.factorial(0)); // 0! = 1
    }

    @Test
    void testFactorialForPositiveNumber() {
        assertEquals(120, Factorial.factorial(5)); // 5! = 5 * 4 * 3 * 2 * 1 = 120
        assertEquals(720, Factorial.factorial(6)); // 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
    }

    @Test
    void testFactorialForLargeNumber() {
        assertEquals(2432902008176640000L, Factorial.factorial(20)); // 20! = 2432902008176640000
    }

    @Test
    void testFactorialForNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

}
