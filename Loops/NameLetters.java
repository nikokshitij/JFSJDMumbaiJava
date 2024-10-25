package Loops;
import java.util.Scanner;

public class NameLetters  {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Hello"+name+"!");

        for ( int i=0; i<name.length(); i++)
        {
            System.out.println(name.charAt(i));
        } 
   
    }
    
}
