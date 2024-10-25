
import java.util.Random;
import java.util.Scanner;

public class mindGameController {
	
	public static void main(String[] args) {
		
		
		
		Random r =new Random();
		int u_scr = 0 ;
		int c_scr = 0 ;
		int c_pre ;
		int input ;
		int prediction;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Please Enter iteration of game :=");
		int iteration = sc.nextInt();
		
		
		for(int i =0 ;i<iteration;i++) {
			
			System.out.println("Enter your input 0 or 1");
			input = sc.nextInt();
			
			
			prediction=(int)r.nextInt(2);
			c_pre =  (int)r.nextInt(2);
			
			if(c_pre==prediction) {
				c_scr++;
			}
			
			if(input==prediction) u_scr++;

			
		}
		
		if(u_scr>c_scr) System.out.println("Congratulation you win");
		
		else if(c_scr>u_scr) System.err.println("Best luck next time");
		else System.out.println("There is tie between you...!");
		
	}

}