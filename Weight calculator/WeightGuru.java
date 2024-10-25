import java.util.Scanner;

public class WeightGuru {

    public static void main(String[] args) throws Exception
    {
        System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        float weight, height;

        System.out.println("Enter weight in Kg");
        weight=sc.nextInt();
        System.out.println("Enter Height in feet");
        height=0.3048f*(sc.nextFloat());

        float BMI=calcBMI(weight,height);
        String Result=AnalyseBMI(BMI);
        
        
        System.out.println("BIM is --------------------- "+BMI);
        System.out.println("RESULT is --------------------- "+Result);
            
    }
    public static float calcBMI(float weight,float h)
    {
        return weight/(h*h);
    }

    public static String AnalyseBMI(float BMI)
    {
        if (BMI<18.5) 
        {
                return "UnderWeight";
        }
        else if (BMI>=18.5 && BMI < 24.9) 
        {
            return "Normal Weight";    
        }
        else if (BMI>=25 && BMI < 29.9) 
        {
            return "Over Weight";    
        }
        else
        {
            return "OBESE red red alert";
        }
    }
      
}