package Loops;
import java.util.Scanner;
public class While_loops {

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num, time=1, multi=0;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
       //TODO implement While loop to get print result

       while (time<=10) 
       {
        multi=num*time;
        System.out.println(num+"X"+time+"="+multi);
        time++;
       }
    }

    
}
