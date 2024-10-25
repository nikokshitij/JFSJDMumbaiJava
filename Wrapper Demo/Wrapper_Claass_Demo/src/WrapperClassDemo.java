import java.lang.Integer;
import java.util.ArrayList;


public class WrapperClassDemo {
    public static void main(String[] args) {
        int num = 5;
        Integer num1 =  Integer.valueOf(num);//Boxing
        System.out.println(num1);

        // int num2 = num1.intValue();//UnBoxing
        // System.out.println(num2);

        // Integer num3 = num;//Auto-Boxing
        // System.out.println(num3);

        // int num4 = num3;//Auto-UnBoxing
        // System.out.println(num4);

    }
    
}

