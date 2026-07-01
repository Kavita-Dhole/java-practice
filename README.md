# k-coding-practice

Practice coding examples in Java. Each problem lives in its own package with tests and a README.

## Problems

### Strings & Logic
1. [FizzBuzz](src/test/java/FizzBuzz/README.md)
2. [Anagram](src/test/java/Anagram/README.md)
3. [Palindrome](src/test/java/Palindrome/README.md)

### Maths
4. [Maths](src/test/java/Maths/README.md)
   - [Fibonacci](src/test/java/Maths/Fibonacci/README.md)
   - [Prime](src/test/java/Maths/Prime/README.md)
   - [Factorial](src/test/java/Maths/Factorial/README.md)

## How to Build and Run

```bash
mvn clean package
java -jar target/k-coding-practice.jar <problem> [args...]
```

Examples:

```bash
# FizzBuzz
java -jar target/k-coding-practice.jar fizzbuzz

# Anagram
java -jar target/k-coding-practice.jar anagram listen silent   # true
java -jar target/k-coding-practice.jar anagram evil vile       # true
java -jar target/k-coding-practice.jar anagram hello world       # false

# Palindrome
java -jar target/k-coding-practice.jar palindrome racecar       # true
java -jar target/k-coding-practice.jar palindrome hello         # false
java -jar target/k-coding-practice.jar palindrome "A man, a plan, a canal: Panama"  # true

# Maths
java -jar target/k-coding-practice.jar fibonacci 10             # 55
java -jar target/k-coding-practice.jar fibonacci 6              # 8
java -jar target/k-coding-practice.jar prime 17                 # true
java -jar target/k-coding-practice.jar prime 15                 # false
java -jar target/k-coding-practice.jar factorial 5              # 120
java -jar target/k-coding-practice.jar factorial 10             # 3628800
```

## Guidelines

First, get a correct and working version.

If time permits, refactor your code to improve readability and structure.

**Optimize your solution for Big O notation** — prefer approaches with better time and space complexity when possible, and be able to explain the complexity of your implementation.

Your submission will be reviewed even if incomplete — do your best with the time given.

Focus on clear and maintainable code over clever or overly optimized solutions.
