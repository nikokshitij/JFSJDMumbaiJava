import java.util.*;
public class App
{
    public static void main(String[] args) throws Exception 
    {
        int p_scr=0, c_scr=0;
        int c_pred=0;
        int p_input;
        Scanner sc=new Scanner(System.in);
        for(;;){

            System.out.println("Enter your coin reading");
            p_input=sc.nextInt();
    
            System.out.println("You Entered");
    
            if(p_input==c_pred) {
                c_scr++;
            }
            else
            {
                p_scr++;
            }
            System.out.println("Computer Scores"+c_scr);
            System.out.println("player Scores"+p_scr);
    
        //stopping condition
            if(c_scr==2)//2 time terminal values pass
            {
                System.out.println("Computer is winner ,player wish you luck next time");
                break;
            }   
            else if(p_scr==2)
            {
                System.out.println("player is winner ,computer wish you luck next time");
                break;
            }   
            else
            {
                System.out.println("computer playing");
            }  

        }  

    }  
}
