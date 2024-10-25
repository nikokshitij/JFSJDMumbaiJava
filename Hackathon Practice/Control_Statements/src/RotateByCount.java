import java.util.Scanner;

public class RotateByCount {
    public static void main(String[] args) {
        //1234    ----------->   2341

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();

        System.out.println("Enter number how many digit you have to Shift:");

        int rem;
        int count=0;
        int temp = num;

        while (num!=0) {
            count++;
            temp/=10;
            
        }
        rem = temp%10;
        int div = 1;
        int mul = 1;

        for(int i=1; i<=count; i++) {
            if (i<=rem) {
              div*=10;  
            }
            else {
                mul*=10;
            }
        }
        int q = num/div;
        int r = num%div;

        rem = r*mul +q;

        System.out.println("Answer is "+rem);

    }
    
}
