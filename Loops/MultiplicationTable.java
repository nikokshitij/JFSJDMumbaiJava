package Loops;
import java.util.Scanner;
//Open your IDE and create a new Java class named Table
//Copy the following code into your Java class Table and verify it works
//Implement a while loop that prints out the multiplication table of the given input number.

	public class MultiplicationTable
	{
	    public static void main(String[] args) 
	    {
			System.out.println("Hello World");
	        Scanner console = new Scanner(System.in);
	        int Multiplicand=1,multiplier=1,product;
			int limit;
	        
	        System.out.print("Enter any limit for as table: ");
	        limit = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + Multiplicand);
	        
	       //TODO implement While loop to get print result

		   while (Multiplicand<=limit) 
		   {
				multiplier=1;
				System.out.println("The Multiplication table for ------->"+Multiplicand);
				while (multiplier<=10) 
		  	 	{
					product=Multiplicand*multiplier;
					System.out.println(""+Multiplicand+"X"+multiplier+"="+product);
					multiplier++;
		  	 	}
		   			Multiplicand++;
		   	}	
		   
	    }
	}

	/* 1)Class and main method:
  		The program starts by declaring the class MultiplicationTable and the main method inside it.
  		The main method is the entry point of your program.line no 7/9

		2)Print a simple message:
		System.out.println("Hello World"); prints "Hello World" as a basic test to ensure the program runs.
		You can remove this line later if you want.line no 11

		3)Initialize variables and get input:
		A Scanner object (console) is created to read input from the user.
		The variables Multiplicand, multiplier, and product are declared. These will be used to calculate the multiplication tables.
		The program then asks the user to enter a limit for how many tables to generate. For example, if the user enters 3, it will print tables for 1, 2, and 3.
		line no 12,13,14,16,17

		4)Print a message for the user:
		The program tells the user which multiplication table is being generated.
		It starts with Multiplicand = 1.
		line no 19

		5)Main loop (outer while loop):
		The outer loop runs from the Multiplicand = 1 to the limit entered by the user.
		For example, if the user enters 3, this loop will generate tables for 1, 2, and 3.
		Each time the loop runs, it prints a message like "The Multiplication table for ------->1", then it starts calculating and printing the multiplication results.
		line no 23/26

		6)Inner loop (for multiplying):
		The inner loop calculates and prints each multiplication for the current Multiplicand.
		The multiplier starts at 1 and goes up to 10, multiplying the Multiplicand by each value of multiplier.
		Example output for Multiplicand = 2:
		2 X 1 = 2
		2 X 2 = 4
		And so on, until 2 X 10 = 20.
		line no 27/32

		7)Move to the next table:
		After the inner loop finishes, the program increases Multiplicand by 1 and moves to the next multiplication table (e.g., from table 1 to table 2).
		This process repeats until the Multiplicand reaches the limit.
		line no 33

	*/
