// Loops - Managing while loops

import java.util.Scanner;

public class Class21{
    public static void main(String[] args){
        // While loop = repeat a piece of code forever
        //              while a condition remains true

        // The syntax is the exact same as the if statement one

        Scanner scanner = new Scanner(System.in);

        // String name = "";

        // while(name.isEmpty()){
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello, " + name + "!");

        // String response = "";

        // while(!response.contains("Q")){
        //     System.out.println("You are currently playing a game.");
        //     System.out.print("Press 'Q' to quit: ");
        //     response = scanner.next().toUpperCase();
        //     System.out.println("");
        // }

        // System.out.println("You have exited the game!");

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // while(age <0){
        //     System.out.println("Your age cannot be a negative number.");
        //     System.out.print("Enter your age: ");
        //     age = scanner.nextInt();
        // }

        // You can also execute a loop and THEN verify the condition with a "do while" loop:

        int number = 0;

        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);
        
        System.out.println("You picked "+ number + ".");

        scanner.close();
    }
}