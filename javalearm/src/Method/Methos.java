package Method;

public class Methos {
    public static void main(String[] args) {
        multiplication(5,2);
        additionNumber(5,6);
          
    }

    public static void additionNumber(int a,int b){
        int c = a+b;
        System.out.println(c);
        noArgumentMethod();
    }  

    public static void multiplication(int a,int b){
        int c=a*b;
        System.out.println(c);
        int d= returnTypeNoArguments();
        System.out.println(d);
    }

    public static void noArgumentMethod(){
        System.out.println("NO argument Method");
    }
    public static int returnTypeNoArguments(){
        return 5;

    }

}
