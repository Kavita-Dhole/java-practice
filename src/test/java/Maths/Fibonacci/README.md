Fibonacci

Task Description

Write a Java program that returns the nth Fibonacci number.
The Fibonacci sequence starts with 0, 1, and each next value is the sum of the two previous values:

0, 1, 1, 2, 3, 5, 8, 13, ...

Function Signature

Your implementation must define the following method, which will be used in our test-suite:

public static long fibonacci(int n) {

// your code here

}


You are free to structure your code as you wish. You may define additional helper methods, classes, or abstractions if you
think they improve clarity or maintainability. The only requirement is that your code includes a fibonacci(int n)
method as shown above.

Algorithm (Current Implementation)

Iterative bottom-up approach:
1. Handle base cases: fibonacci(0) = 0, fibonacci(1) = 1.
2. Keep two variables for the previous two values.
3. Loop from 2 to n, updating the next value as the sum of the previous two.
4. Return the current value after the loop.

Big O Complexity

Let n = the requested index.

| Part | Time | Space | Notes |
|------|------|-------|-------|
| Iterative loop | O(n) | O(1) | One pass from 2 to n |
| Recursive (not used) | O(2^n) | O(n) | Exponential without memoization |

Overall: O(n) time and O(1) extra space.

How to Run

Build the jar:

> mvn clean package

Run Fibonacci:

> java -jar target/k-coding-practice.jar fibonacci 10

Example Output

Assuming your program is compiled and run, the output should look like:


> java -jar target/k-coding-practice.jar fibonacci 10

55

> java -jar target/k-coding-practice.jar fibonacci 0

0

> java -jar target/k-coding-practice.jar fibonacci 1

1

> java -jar target/k-coding-practice.jar fibonacci 6

8

> java -jar target/k-coding-practice.jar fibonacci 12

144

Examples

| n | fibonacci(n) | Calculation |
|---|--------------|-------------|
| 0 | 0 | Base case |
| 1 | 1 | Base case |
| 2 | 1 | 0 + 1 |
| 3 | 2 | 1 + 1 |
| 4 | 3 | 1 + 2 |
| 5 | 5 | 2 + 3 |
| 6 | 8 | 3 + 5 |
| 7 | 13 | 5 + 8 |
| 8 | 21 | 8 + 13 |
| 10 | 55 | 10th number in the sequence |
| 12 | 144 | 12th number in the sequence |

Sequence (first 11 values):

```
n:           0  1  2  3  4  5  6  7   8   9  10
fibonacci:   0  1  1  2  3  5  8  13  21  34  55
```
