package Loops;
/* Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	... */

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter the number of Fibonacci numbers to display: ");
        int n = scanner.nextInt();  // Capture user input
        
        // Variables to hold the previous two Fibonacci numbers
        int a = 0, b = 1;
        int count = 0;
        
        // Display the Fibonacci sequence using a do-while loop
        System.out.println("n\tFibonacci(n)");
        
        do {
            // Print the current Fibonacci number
            System.out.println(count + "\t" + a);
            
            // Calculate the next Fibonacci number
            int nextFib = a + b;
            a = b;
            b = nextFib;
            
            // Increment the counter
            count++;
        } while (count < n);  // Loop until we've printed 'n' Fibonacci numbers

        
    }
    
}
