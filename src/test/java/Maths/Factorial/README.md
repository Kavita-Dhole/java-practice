Factorial

Task Description

Write a Java program that returns the factorial of a non-negative integer n.
Factorial is defined as:

n! = n x (n - 1) x (n - 2) x ... x 1

By convention, 0! = 1.

Function Signature

Your implementation must define the following method, which will be used in our test-suite:

public static long factorial(int n) {

// your code here

}


You are free to structure your code as you wish. You may define additional helper methods, classes, or abstractions if you
think they improve clarity or maintainability. The only requirement is that your code includes a factorial(int n)
method as shown above.

Algorithm (Current Implementation)

Iterative multiplication:
1. Return 1 for n = 0.
2. Start with result = 1.
3. Multiply result by each integer from 2 to n.
4. Return the final result.

Big O Complexity

Let n = the input number.

| Part | Time | Space | Notes |
|------|------|-------|-------|
| Iterative loop | O(n) | O(1) | One multiplication per step |
| Recursive (alternative) | O(n) | O(n) | Call stack depth equals n |

Overall: O(n) time and O(1) extra space with the iterative approach.

How to Run

Build the jar:

> mvn clean package

Run Factorial:

> java -jar target/k-coding-practice.jar factorial 5

Example Output

Assuming your program is compiled and run, the output should look like:


> java -jar target/k-coding-practice.jar factorial 5

120

> java -jar target/k-coding-practice.jar factorial 0

1

> java -jar target/k-coding-practice.jar factorial 1

1

> java -jar target/k-coding-practice.jar factorial 6

720

> java -jar target/k-coding-practice.jar factorial 10

3628800

Examples

| n | factorial(n) | Calculation |
|---|--------------|-------------|
| 0 | 1 | By definition |
| 1 | 1 | 1 |
| 2 | 2 | 2 x 1 |
| 3 | 6 | 3 x 2 x 1 |
| 4 | 24 | 4 x 3 x 2 x 1 |
| 5 | 120 | 5 x 4 x 3 x 2 x 1 |
| 6 | 720 | 6 x 5 x 4 x 3 x 2 x 1 |
| 7 | 5040 | 7 x 6 x 5 x 4 x 3 x 2 x 1 |
| 10 | 3628800 | 10 x 9 x ... x 1 |

Worked example for 5!:

```
5! = 5 x 4 x 3 x 2 x 1
   = 20 x 3 x 2 x 1
   = 60 x 2 x 1
   = 120 x 1
   = 120
```

Worked example for 0!:

```
0! = 1
```

This is the standard mathematical convention.
