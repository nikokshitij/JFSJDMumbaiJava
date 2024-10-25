import java.util.Scanner;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer Number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("INVALID INPUT");
        } else {
            int evenSum = 0;
            int oddSum = 0;

            while (number > 0) {
                int digit = number % 10;

                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }

                number /= 10;
            }

            System.out.println("Sum of even digits: " + evenSum);
            System.out.println("Sum of odd digits: " + oddSum);
        }

    }
}
