Prime

Task Description

Write a Java program that checks whether a given integer is a prime number.
A prime number is greater than 1 and divisible only by 1 and itself.

Function Signature

Your implementation must define the following method, which will be used in our test-suite:

public static boolean isPrime(int number) {

// your code here

}


You are free to structure your code as you wish. You may define additional helper methods, classes, or abstractions if you
think they improve clarity or maintainability. The only requirement is that your code includes an isPrime(int number)
method as shown above.

Algorithm (Current Implementation)

Trial division with optimizations:
1. Return false for numbers less than 2.
2. Return true for 2.
3. Return false for even numbers greater than 2.
4. Test odd divisors from 3 up to the square root of the number.
5. If any divisor divides evenly, return false; otherwise return true.

Big O Complexity

Let n = the input number.

| Part | Time | Space | Notes |
|------|------|-------|-------|
| Trial division to sqrt(n) | O(sqrt(n)) | O(1) | Only odd divisors checked after 2 |

Overall: O(sqrt(n)) time and O(1) extra space.

How to Run

Build the jar:

> mvn clean package

Run Prime:

> java -jar target/k-coding-practice.jar prime 17

Example Output

Assuming your program is compiled and run, the output should look like:


> java -jar target/k-coding-practice.jar prime 17

true

> java -jar target/k-coding-practice.jar prime 15

false

> java -jar target/k-coding-practice.jar prime 2

true

> java -jar target/k-coding-practice.jar prime 1

false

> java -jar target/k-coding-practice.jar prime 29

true

> java -jar target/k-coding-practice.jar prime 100

false

Examples

| Input | Result | Explanation |
|-------|--------|-------------|
| 2 | true | Smallest prime number |
| 3 | true | Divisible only by 1 and 3 |
| 5 | true | Divisible only by 1 and 5 |
| 7 | true | Divisible only by 1 and 7 |
| 11 | true | Divisible only by 1 and 11 |
| 17 | true | Divisible only by 1 and 17 |
| 29 | true | Divisible only by 1 and 29 |
| 0 | false | Less than 2 |
| 1 | false | Not prime by definition |
| 4 | false | Divisible by 2 |
| 9 | false | Divisible by 3 |
| 15 | false | Divisible by 3 and 5 |
| 100 | false | Divisible by 2, 4, 5, 10, ... |

Why 15 is not prime:

```
15 = 3 x 5
```

So 15 has divisors other than 1 and itself.

Why 17 is prime:

```
17 = 1 x 17
```

No whole-number divisor exists between 2 and 16.
