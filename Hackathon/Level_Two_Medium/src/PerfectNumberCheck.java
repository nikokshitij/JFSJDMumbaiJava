import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer Number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("NOT PERFECT");
        } else {
            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.println("PERFECT");
            } else {
                System.out.println("NOT PERFECT");
            }
        }

    }
}
