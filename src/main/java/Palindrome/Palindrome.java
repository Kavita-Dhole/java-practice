package Palindrome;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java -jar k-coding-practice.jar palindrome <text>");
            return;
        }

        System.out.println(isPalindrome(args[0]));
    }
}
