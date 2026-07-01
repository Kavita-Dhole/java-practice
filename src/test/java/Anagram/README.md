Anagram

Task Description

Write a Java program that checks whether two strings are anagrams of each other.
Two strings are anagrams if they contain the same characters with the same frequency,
ignoring letter case.

Function Signature

Your implementation must define the following method, which will be used in our test-suite:

public static boolean isAnagram(String first, String second) {

// your code here

}


You are free to structure your code as you wish. You may define additional helper methods, classes, or abstractions if you
think they improve clarity or maintainability. The only requirement is that your code includes an isAnagram(String first, String second)
method as shown above.

Algorithm (Current Implementation)

1. Return false if either input is null.
2. Convert both strings to lowercase and copy each into a char array.
3. Sort both char arrays.
4. Compare the sorted arrays with Arrays.equals — if they match, the strings are anagrams.

Sorting makes character order identical when the same letters appear the same number of times.

Big O Complexity

Let m = length of first string, n = length of second string.

| Part | Time | Space | Notes |
|------|------|-------|-------|
| toLowerCase + toCharArray | O(m) + O(n) | O(m) + O(n) | Creates new char arrays |
| Arrays.sort | O(m log m) + O(n log n) | O(1) extra | In-place sort on each array |
| Arrays.equals | O(m) | O(1) | Assumes equal length after sort would differ |

Overall: O(m log m + n log n) time and O(m + n) space.

A frequency-count approach (counting each letter in one pass) can improve time to O(m + n) with the same O(m + n) space — worth considering when optimizing for Big O.

How to Run

Build the jar:

> mvn clean package

Run Anagram:

> java -jar target/k-coding-practice.jar anagram listen silent

Example Output

Assuming your program is compiled and run, the output should look like:


> java -jar target/k-coding-practice.jar anagram listen silent

true

> java -jar target/k-coding-practice.jar anagram hello world

false
