package Maths.Fibonacci;

public class Fibonacci {

    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long previous = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java -jar k-coding-practice.jar fibonacci <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.println(fibonacci(n));
    }
}
