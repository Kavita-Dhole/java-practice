package Palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("racecar"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testPhrasePalindrome() {
        assertTrue(Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
