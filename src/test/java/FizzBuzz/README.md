FizzBuzz

Task Description

Write a Java program that prints the numbers from 1 to n, following these rules:
If a number is divisible by 3, print "Fizz" instead of the number.
If a number is divisible by 5, print "Buzz" instead of the number.
If a number is divisible by both 3 and 5, print "FizzBuzz" instead of the number.
Otherwise, print the number itself.
Each result should be printed on a new line.

Function Signature

Your implementation must define the following method, which will be used in our test-suite:

public static String fizzbuzz(int number) {

// your code here

}


You are free to structure your code as you wish. You may define additional helper methods, classes, or abstractions if you
think they improve clarity or maintainability. The only requirement is that your code includes a fizzbuzz(int number)
method as shown above.
Your main method should print the results for numbers 1 through 100.

Algorithm (Current Implementation)

For each number, check divisibility in order:
1. If divisible by 15 (both 3 and 5), return "FizzBuzz".
2. Else if divisible by 3, return "Fizz".
3. Else if divisible by 5, return "Buzz".
4. Otherwise, return the number as a string.

The main method loops from 1 to 100 and prints the result of fizzbuzz(i) on each line.

Big O Complexity

| Part | Time | Space | Notes |
|------|------|-------|-------|
| fizzbuzz(number) | O(1) | O(1) | Fixed number of modulo checks |
| main (1 to n) | O(n) | O(1) | One call per number; n = 100 in the current main |

Overall: O(n) time and O(1) extra space for printing n results.

How to Run

Build the jar:

> mvn clean package

Run FizzBuzz:

> java -jar target/k-coding-practice.jar fizzbuzz

Example Output

Assuming your program is compiled and run, the output should look like:


> java -jar target/k-coding-practice.jar fizzbuzz

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
15
16
...

Examples (single number behaviour)

| Input | Output | Reason |
|-------|--------|--------|
| 1 | 1 | Not divisible by 3 or 5 |
| 3 | Fizz | Divisible by 3 |
| 5 | Buzz | Divisible by 5 |
| 15 | FizzBuzz | Divisible by both 3 and 5 |
| 30 | FizzBuzz | Divisible by both 3 and 5 |
| 7 | 7 | Not divisible by 3 or 5 |

More sample output (numbers 1 to 20):

> java -jar target/k-coding-practice.jar fizzbuzz

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
