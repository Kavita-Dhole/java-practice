import Anagram.Anagram;
import FizzBuzz.FizzBuzz;
import Palindrome.Palindrome;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java -jar k-coding-practice.jar <problem> [args...]");
            System.out.println("Available: fizzbuzz, anagram, palindrome");
            System.out.println("  fizzbuzz");
            System.out.println("  anagram <word1> <word2>");
            System.out.println("  palindrome <text>");
            return;
        }

        String[] problemArgs = Arrays.copyOfRange(args, 1, args.length);

        switch (args[0].toLowerCase()) {
            case "fizzbuzz" -> FizzBuzz.main(new String[]{});
            case "anagram" -> Anagram.main(problemArgs);
            case "palindrome" -> Palindrome.main(problemArgs);
            default -> System.out.println("Unknown problem: " + args[0]);
        }
    }
}