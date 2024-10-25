import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            // Input the year
            System.out.print("Enter the year: ");
            int year = sc.nextInt();

            // Checking for valid year

            if (year <= 0) {
                System.out.println("INVALID YEAR");
            } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("LEAP YEAR");
                System.out.println("NOT A LEAP YEAR");
            }

        }
    }
}
