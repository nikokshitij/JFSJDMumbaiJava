import java.util.Scanner;

public class HelloWorld1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Corrected System.in
        System.out.print("Enter the number of times to print 'Hello World': ");
        int n = sc.nextInt();  // Take input for n
        for (int i = 0; i < n; i++) {  // Corrected the for loop condition
            System.out.println("Hello World");
        }
    }
}
