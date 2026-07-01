package Maths.Factorial;

public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java -jar k-coding-practice.jar factorial <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }
}
