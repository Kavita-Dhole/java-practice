package Maths.Prime;

public class Prime {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int divisor = 3; divisor * divisor <= number; divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java -jar k-coding-practice.jar prime <number>");
            return;
        }

        int number = Integer.parseInt(args[0]);
        System.out.println(isPrime(number));
    }
}
