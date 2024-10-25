import java.util.Scanner;

public class ProductOfDigit {

    public static void main(String[] args) {
        
        //123     = 6 output
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int num = sc.nextInt();

        int product = 1;
        while (num!=0) {
            int rem = num%10;
            product = product*rem;

            num = num/10;

            
        }
        System.out.println("Product of Digits is:"+product);
    }
}