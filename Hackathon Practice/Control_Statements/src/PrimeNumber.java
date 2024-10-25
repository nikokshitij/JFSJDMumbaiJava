import java.util.Scanner;

public class PrimeNumber {

    // 2, 3, 5, 7, 11........
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a number");
        int num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("If is not a prime number");

        } else {
            int flag = 0; // 5
            for (int i = 2; i <= num; i++) { //2, 3, 4
                if (num % i == 0) { // 5

                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("it is prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        }
    }

}
