// While Loops - Building a number guessing game

import java.util.Scanner;
import java.util.Random;

public class Class22 {
    public static void main(String[] args){
        int max = 100;
        int min = 1;
        int number;
        int guess;
        int attempts = 1;

        // Welcome message
        System.out.println("\n---- Number Guessing Game ----\n");

        // Generate number
        Random random = new Random();
        number = random.nextInt(min, max);

        // Input for user's guess
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your guess (Between %d-%d): ", min, max);
        guess = scanner.nextInt();

        // Loop goes back if the number is wrong
        while(guess != number){
            attempts ++;
            while(guess < min || guess > max){
                attempts ++;
                System.out.printf("Input outside the boundaries. Please, enter a guess between %d-%d: ", min, max);
                guess = scanner.nextInt();
            }

            if(guess < number){
                System.out.print("Your guess is lower than the number! Try again: ");
                guess = scanner.nextInt();
            }
            else{
                System.out.print("Your guess is higher than the number! Try again: ");
                guess = scanner.nextInt();
            }
        }

        // Else, congratulate user.
        System.out.printf("\nGood job, you guessed it correctly! The number was %d!\nIt took %d attempts!\n", number, attempts);

        scanner.close();
    }
}


/* Could've used do while, but oh well... It goes like this:
do{
    System.out.println("Enter a guess: ");
    guess = scanner.nextInt();
    attempts++;

    if(guess < number){
        System.out.println("Too low, try again!");
    }
    else if(guess > number){
        System.out.println("Too high, try again!");
    }
    else{
        System.out.println("Correct! The number was " + number + "!");
        System.out.println("Number of attempts: " + attempts);
    }
}while(guess != number);

*/