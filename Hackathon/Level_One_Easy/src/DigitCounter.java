import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if input is valid
        if (number <= 0) {
            System.out.println("INVALID INPUT");
        } else {
            int count = 0;
            int temp = number;
            
            // Count the digits
            while (temp > 0) {
                temp /= 10; // Remove the last digit
                count++;    // Increment the count for each digit
            }
            
            // Print the number of digits
            System.out.println(count);
        }
        
        scanner.close();
    }
}
