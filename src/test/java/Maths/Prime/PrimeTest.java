package Maths.Prime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    public void testPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(17));
        assertTrue(Prime.isPrime(29));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(15));
    }
}
