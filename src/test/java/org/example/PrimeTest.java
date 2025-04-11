package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrimeForPrimeNumber() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
    }

    @Test
    void testIsPrimeForNonPrimeNumber() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
    }

    @Test
    void testIsPrimeForEdgeCases() {
        assertFalse(Prime.isPrime(0)); // 0 is not prime
        assertFalse(Prime.isPrime(1)); // 1 is not prime
    }

    @Test
    void testIsPrimeForNegativeNumbers() {
        assertFalse(Prime.isPrime(-1)); // Negative numbers are not prime
        assertFalse(Prime.isPrime(-5));
    }
}
