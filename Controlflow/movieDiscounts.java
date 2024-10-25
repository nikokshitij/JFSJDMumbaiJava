
/*Part 2: Movie Discounts
    A movie cinema does price discounting depending on a customer's age.
    The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
    Age range	   Ticket Price
    Normal ticket	7 Euros
    Below 5	        60% Discount
    Over 60	        55% Discount
    Write the app so that the conditions above are met and the correct ticket price is returned.
    Extra features
    If done with the first part of the exercise with time to spare add the following feature.
    
    Have the app prompt normal ticket buyers for the number of tickets they wish to buy.
    For every two or more tickets sold, give a 30% discount. */

package Controlflow;

import java.util.*;
public class movieDiscounts 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();
        int discount = 0;
        float ticket_fare = 7.0f;
        float amountpayable;

        if (age >= 0 && age < 5) {
            discount = 60;
            amountpayable = ticket_fare - calcCharges(discount, ticket_fare);
            System.out.println("The ticket fare is: " + ticket_fare);
            System.out.println("Discount of " + discount + "% and the amount payable is: " + amountpayable);

        } else if (age > 60 && age <= 100) {
            discount = 55;
            amountpayable = ticket_fare - calcCharges(discount, ticket_fare);
            System.out.println("The ticket fare is: " + ticket_fare);
            System.out.println("Discount of " + discount + "% and the amount payable is: " + amountpayable);

        } else if (age >= 5 && age <= 60) {
            discount = 0;
            amountpayable = ticket_fare - calcCharges(discount, ticket_fare);
            System.out.println("The ticket fare is: " + ticket_fare);
            System.out.println("Discount of " + discount + "% and the amount payable is: " + amountpayable);

        } else {
            System.out.println("Invalid age entered. Please enter a valid age.");
        }

        sc.close();
    }

    // Function for discount calculation
    public static float calcCharges(int discount, float ticket_fare) {
        return (discount * ticket_fare) / 100;
    }


    
}
/* 
This Java program, named movieDiscounts, calculates the amount a person needs to pay for a movie ticket based on their age and any applicable discount. Here’s a simple breakdown of how the program works:

1)User Input:

The program asks the user to input their age using a Scanner to read the input from the console.

2)Ticket Fare and Discounts:
-The ticket fare is set at $7.00.
-The discount depends on the user's age:
-If the person is below 5 years old, they receive a 60% discount.
-If the person is above 60 years old, they receive a 55% discount.
-If the person is between 5 and 60 years old, no discount is applied.

3)Discount Calculation:
-The method calcCharges(int discount, -float ticket_fare) calculates the discount amount by taking the discount percentage and the ticket price. It returns the discount, which is then subtracted from the original ticket fare to get the final amount to be paid.

4)Invalid Age Check:
-If the user enters an age less than 0 or greater than 100, the program will display a message saying the age is invalid.

5)Output:
-The program displays the ticket price, the discount percentage, and the final amount the user needs to pay after applying the discount (if any).

-The structure helps determine the right discount based on age and calculates the final payable amount accordingly.
*/