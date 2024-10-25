package Controlflow;
/* Q.1)  Using IntelliJ, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5000  - 9999$	20%
1000 - 4999$	10%
below 1000$	N/A
Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.*/
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Commission {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sales amount for which we have to calculate commission");
        int sales_amount=sc.nextInt();
        int commission_per =  0;
        float com;

        if (sales_amount<=1000) 
        {
            System.out.println("Sorry batter luck next time your sales is not fit");
        }
         if (sales_amount>=1001 && sales_amount <=4999) 
        {   
            commission_per = 10;
            com=Calc_comm(commission_per, sales_amount);
            System.out.println("**********************************************");
            System.out.println("Your commission is calculated 10%");
            System.out.println("Commission amount is" +com);
            System.out.println("**********************************************"); 
        }
        else if (sales_amount>=5000 && sales_amount <=9999) 
        {
            commission_per = 20;
            com=Calc_comm(commission_per, sales_amount);
            System.out.println("**********************************************");
            System.out.println("Your commission is calculated 20%");
            System.out.println("Commission amount is" +com);
            System.out.println("**********************************************");     
        }
        else if (sales_amount>=10000) 
        {
            commission_per = 30;
            com=Calc_comm(commission_per, sales_amount);
            System.out.println("**********************************************");
            System.out.println("Your commission is calculated 30%");
            System.out.println("Commission amount is" +com);
            System.out.println("**********************************************");      
        }
        else
        {
            System.out.println("Invalid input");
        }
         
        
    }//end of main
    //Fuction for commission calculation 
    public static float Calc_comm(int com, int sales_amount)
    {
        return (sales_amount*com)/100;
    }

     
}

/*Import Statements:
Scanner is imported to take input from the user.

2)Class Definition:
The class Commission contains the entire program logic.

3)Main Method:
-The main method is where the program starts.
-A Scanner object (sc) is created to capture input from the user.
-The user is prompted to enter a sales amount.
-The sales amount is stored in the variable sales_amount (an integer).
-The variable commission_per is used to store the percentage of commission (default is 0).
-The variable com will store the calculated commission.

4)Conditional Logic:
-The program uses if-else statements to decide the commission based on the sales range:
-If sales are below or equal to $1000, the program displays a message stating no commission ("Sorry better luck next time").
-If sales are between $1001 and $4999, the commission is set to 10%. The Calc_comm() method is called to calculate the commission, and the result is displayed.
-If sales are between $5000 and $9999, the commission is set to 20%, and the calculation is done similarly.
-If sales are $10000 or above, the commission is set to 30%, and the result is displayed.
-An additional else block handles invalid inputs, though it doesn't trigger due to the structure of the conditions.

5)Commission Calculation Method (Calc_comm):
-This method calculates the commission by multiplying the sales amount by the commission percentage, then dividing by 100 to get the percentage amount.

6)Key Notes:
-Sales Range Check: The code checks which range the sales_amount falls into to decide the commission.
-Commission Calculation: The commission is calculated using the method Calc_comm(), which takes the percentage and sales amount as arguments and returns the calculated amount. */