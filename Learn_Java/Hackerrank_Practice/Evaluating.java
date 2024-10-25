import java.util.Scanner;

public class Evaluating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
           
            double x = sc.nextDouble(); 
            System.out.println("Calculating e^" + x);  
            double result = Math.exp(x);
            System.out.printf("Result: %.4f%n", result);
        }
        
        sc.close();
    }

}