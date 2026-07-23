// Project - Building a dice rolling program

import java.util.Scanner;
import java.util.Random;

public class Class30{
    public static void main(String[] args){
        // Set variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dice;  // for loop
        int result = 0;

        // Ask for how many dice to roll
        System.out.print("Enter how many dice you would like to roll: ");
        dice = scanner.nextInt();

        while(dice <= 0){
            System.out.println("Invalid amount! You can only choose positive numbers.");
            System.out.print("Enter how many dice you would like to roll: ");
            dice = scanner.nextInt();
        }

        // Display results of each dice with ascii art
        for(int i = 0; i < dice; i++){
            int roll = random.nextInt(1, 7);
            System.out.println("You rolled a " + roll + ".");
            printDie(roll);
            result += roll;
        }

        // Display total result
        System.out.println("The total result of all dice rolled is: " + result);

        scanner.close();
    }

    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
            """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
            """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
            """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
            """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
            """;

        String dice6 = """
                 -------
                | ● ● ● |
                |       |
                | ● ● ● |
                 -------
            """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll!");
        }
    }

}