Maths

Math-related coding exercises grouped under the Maths package.

## Problems

1. [Fibonacci](Fibonacci/README.md) — compute the nth Fibonacci number
2. [Prime](Prime/README.md) — check whether a number is prime
3. [Factorial](Factorial/README.md) — compute n!

## How to Run

```bash
mvn clean package
java -jar target/k-coding-practice.jar fibonacci 10
java -jar target/k-coding-practice.jar prime 17
java -jar target/k-coding-practice.jar factorial 5
```

## Examples

| Problem | Command | Output |
|---------|---------|--------|
| Fibonacci | `java -jar target/k-coding-practice.jar fibonacci 6` | `8` |
| Fibonacci | `java -jar target/k-coding-practice.jar fibonacci 10` | `55` |
| Prime | `java -jar target/k-coding-practice.jar prime 2` | `true` |
| Prime | `java -jar target/k-coding-practice.jar prime 15` | `false` |
| Factorial | `java -jar target/k-coding-practice.jar factorial 5` | `120` |
| Factorial | `java -jar target/k-coding-practice.jar factorial 10` | `3628800` |

## Package Structure

```
src/main/java/Maths/
  Fibonacci/Fibonacci.java
  Prime/Prime.java
  Factorial/Factorial.java

src/test/java/Maths/
  Fibonacci/
  Prime/
  Factorial/
```
