import java.util.Scanner;

public class ArrayOfNElement {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter a length of array :- ");
        int length = sc.nextInt();
        
        int[] array = new int[length];
        
       
        for (int i = 0; i < array.length; i++) {
            array[i] = i; 
        }
        
        
        System.out.print("["); 
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); 
            if (i < array.length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.print("]");
    }
}
