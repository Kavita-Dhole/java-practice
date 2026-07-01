package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    public void testAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    public void testNotAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    @Test
    public void testCaseInsensitive() {
        assertTrue(Anagram.isAnagram("Listen", "Silent"));
    }
}
