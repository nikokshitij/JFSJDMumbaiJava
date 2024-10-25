import java.util.*;

class Player_A
{
    int p_scr=0;
    int p_input;


}
class Computer{
    int c_scr=0;
    int c_pred;
    public int Prediction() {
        Random r = new Random();
        return r.nextInt(2);

    }
}
public class App
{
    public static void main(String[] args) {
        
        Player_A P = new Player_A();
        Computer C = new Computer();

        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            System.out.println("Enter your Input");
            P.p_input = sc.nextInt();
            System.out.println("You Entered"+P.p_input);
            C.c_pred = C.Prediction();

            if(P.p_input == C.c_pred)
            {
                C.c_scr++;
            }
            else{
                P.p_scr++;
            }

            System.out.println("Computer Score"+C.c_scr);
            System.out.println("Player Score"+P.p_scr);

            if(C.c_scr == 4){
                System.out.println("Computer Is winner, Player Wish You Luck");
                break;
            }
            else if(P.p_scr == 4){
                System.out.println("Player Is winner, Computer Wish You Luck");
                break;
    
            }
        }
        sc.close();
    }
}