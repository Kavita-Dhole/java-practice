# k-coding-practice

Practice coding examples in Java. Each problem lives in its own package with tests and a README.

## Problems

1. [FizzBuzz](src/test/java/FizzBuzz/README.md)
2. [Anagram](src/test/java/Anagram/README.md)
3. [Palindrome](src/test/java/Palindrome/README.md)

## How to Build and Run

```bash
mvn clean package
java -jar target/k-coding-practice.jar <problem> [args...]
```

Examples:

```bash
java -jar target/k-coding-practice.jar fizzbuzz
java -jar target/k-coding-practice.jar anagram listen silent
java -jar target/k-coding-practice.jar palindrome racecar
```

## Guidelines

First, get a correct and working version.

If time permits, refactor your code to improve readability and structure.

**Optimize your solution for Big O notation** — prefer approaches with better time and space complexity when possible, and be able to explain the complexity of your implementation.

Your submission will be reviewed even if incomplete — do your best with the time given.

Focus on clear and maintainable code over clever or overly optimized solutions.
