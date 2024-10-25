import java.util.Scanner;

public class linearSearchEx1 {

    Scanner sc=new Scanner(System.in);
    int index;

    void Linear(){
        System.out.println("Enter a number for array size");
        int num = sc.nextInt();
        System.out.println("Enter a value to find in array");
        int key=sc.nextInt();
        int[] arr=new int[num];

        for(int i=0;i<num;i++){
            System.out.println("Enter a %d no array element: ".formatted(i+1));
            arr[i]=sc.nextInt();
        }

        //for(int);

    }
}