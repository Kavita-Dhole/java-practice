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
...
