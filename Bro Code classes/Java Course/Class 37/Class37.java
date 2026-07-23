// Project - Rock paper scissors

import java.util.Scanner;
import java.util.Random;

public class Class37 {
    public static void main(String[] args){
        
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "y";

        // Get input from user
        while(playAgain.equals("y")){
            System.out.print("Enter your move (rock/paper/scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            
            while(!playerChoice.equals("rock") && 
                        !playerChoice.equals("paper") &&
                        !playerChoice.equals("scissors")){
                System.out.print("Invalid choice! Please, pick between rock/paper/scissors: ");
                playerChoice = scanner.nextLine().toLowerCase();
            }

            // Get random choice from the computer
            computerChoice = choices[random.nextInt(3)];

            // Display the computer's choice
            System.out.println("The computer chose " + computerChoice);

            // Check win conditions
            if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
               (playerChoice.equals("scissors") && computerChoice.equals("paper")) || 
               (playerChoice.equals("paper") && computerChoice.equals("rock"))){
              System.out.println("You win!");
            }
            else if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else{
                System.out.println("You lose!");
            }

            // Ask to play again
            System.out.print("\nWould you like to play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();
        }
    
        // Goodbye message
        System.out.println("Closing application...");
        scanner.close();
    }
}
