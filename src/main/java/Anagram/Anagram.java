package Anagram;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        char[] firstChars = first.toLowerCase().toCharArray();
        char[] secondChars = second.toLowerCase().toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);
        return Arrays.equals(firstChars, secondChars);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java -jar k-coding-practice.jar anagram <word1> <word2>");
            return;
        }

        System.out.println(isAnagram(args[0], args[1]));
    }
}
