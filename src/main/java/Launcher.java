import Anagram.Anagram;
import FizzBuzz.FizzBuzz;
import Maths.Factorial.Factorial;
import Maths.Fibonacci.Fibonacci;
import Maths.Prime.Prime;
import Palindrome.Palindrome;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java -jar k-coding-practice.jar <problem> [args...]");
            System.out.println("Available: fizzbuzz, anagram, palindrome, fibonacci, prime, factorial");
            System.out.println("  fizzbuzz");
            System.out.println("  anagram <word1> <word2>");
            System.out.println("  palindrome <text>");
            System.out.println("  fibonacci <n>");
            System.out.println("  prime <number>");
            System.out.println("  factorial <n>");
            return;
        }

        String[] problemArgs = Arrays.copyOfRange(args, 1, args.length);

        switch (args[0].toLowerCase()) {
            case "fizzbuzz" -> FizzBuzz.main(new String[]{});
            case "anagram" -> Anagram.main(problemArgs);
            case "palindrome" -> Palindrome.main(problemArgs);
            case "fibonacci" -> Fibonacci.main(problemArgs);
            case "prime" -> Prime.main(problemArgs);
            case "factorial" -> Factorial.main(problemArgs);
            default -> System.out.println("Unknown problem: " + args[0]);
        }
    }
}