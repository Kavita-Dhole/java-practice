Palindrome

Task Description

Write a Java program that checks whether a string is a palindrome.
A palindrome reads the same forwards and backwards.
For this exercise, ignore letter case and non-alphanumeric characters when checking.

Function Signature

Your implementation must define the following method, which will be used in our test-suite:

public static boolean isPalindrome(String text) {

// your code here

}


You are free to structure your code as you wish. You may define additional helper methods, classes, or abstractions if you
think they improve clarity or maintainability. The only requirement is that your code includes an isPalindrome(String text)
method as shown above.

Algorithm (Current Implementation)

Two-pointer approach from both ends of the string:

1. Return false if the input is null.
2. Set left = 0 and right = length - 1.
3. While left < right:
   - Skip non-alphanumeric characters at left and right.
   - Compare characters at left and right (case-insensitive).
   - If they differ, return false.
   - Move left forward and right backward.
4. If all pairs match, return true.

This compares the first meaningful character with the last, then moves inward until the pointers meet in the middle.

Big O Complexity

Let n = length of the string.

| Part | Time | Space | Notes |
|------|------|-------|-------|
| Main loop | O(n) | O(1) | Each index visited at most once |
| Skip / compare per step | O(1) | O(1) | Constant work per character |

Overall: O(n) time and O(1) extra space.

This is already an efficient approach — no extra string or array is needed.

How to Run

Build the jar:

> mvn clean package

Run Palindrome:

> java -jar target/k-coding-practice.jar palindrome racecar

Example Output

Assuming your program is compiled and run, the output should look like:


> java -jar target/k-coding-practice.jar palindrome racecar

true

> java -jar target/k-coding-practice.jar palindrome hello

false

> java -jar target/k-coding-practice.jar palindrome "A man, a plan, a canal: Panama"

true
