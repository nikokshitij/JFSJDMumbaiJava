import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println(solveMeFirst(a, b));
        
        scanner.close();
    }
    public static int solveMeFirst(int x, int y) 
    {
        return x + y;
    }
}
