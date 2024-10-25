import java.util.Scanner;

public class ClassGrader {

    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the grade of students");
        int grade=sc.nextInt();
        if (grade>0 && grade<=10) 
        {
            if (grade<3) 
            {
                System.out.println("Failed");    
            }
            else if (grade>3 && grade<=5) 
            {
                System.out.println("Insufficient");    
            }
            else if (grade>5 && grade<=9) 
            {
                System.out.println("good");    
            }
            else if (grade == 10) 
            {
                System.out.println("Excellent Grade");
            }
        }

    }
}