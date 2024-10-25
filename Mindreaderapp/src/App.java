import java.util.*;  // Import Scanner for user input
    class Player_A
    {
        int p_scr=0;
        String name;
        int p_input;
        public Player_A(String namepassed)
        {
            this .name=namepassed;
        }
    }

public class App
{
    public static void main(String[] args) throws Exception 
    {
        int p_scr = 0, c_scr = 0;  // Initialize player and computer scores to 0
        int c_pred = 0;  // Computer's predicted coin reading, set to 0 initially
        int p_input;  // Variable to store the player's input
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read user input

        // Infinite loop for continuous game play
        for(;;) {
            // Asking the player for their coin reading
            System.out.println("Enter your coin reading");
            p_input = sc.nextInt();  // Store the player's input

            // Display what the player entered
            System.out.println("You Entered");

            // Compare player's input with computer's prediction
            if(p_input == c_pred) {
                c_scr++;  // If it matches, the computer gets a point
            }
            else {
                p_scr++;  // If it doesn't match, the player gets a point
            }

            // Display current scores
            System.out.println("Computer Scores: " + c_scr);
            System.out.println("Player Scores: " + p_scr);

            // Stopping conditions - if someone reaches 2 points, the game ends
            if(c_scr == 2) {  // If the computer scores 2 points
                System.out.println("Computer is winner, player wish you luck next time");
                break;  // Exit the loop, game over
            }   
            else if(p_scr == 2) {  // If the player scores 2 points
                System.out.println("Player is winner, computer wish you luck next time");
                break;  // Exit the loop, game over
            }   
            else {
                System.out.println("Computer playing");  // Continue the game
            }  
        }  
    }  
}
 