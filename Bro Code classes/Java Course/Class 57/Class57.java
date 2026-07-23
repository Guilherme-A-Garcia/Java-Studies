// Flow Management - Exception Handling

import java.util.InputMismatchException;
import java.util.Scanner;

public class Class57 {
    public static void main(String[] args){
        // Exception = An event that interrupts the normal flow of a program.
        //                           (Dividing by zero, file not found, mismatch input type)
        // Surround any dangerous code with a try{} block.
        // try{}, catch{}, finally{}

        // Scanner scanner = new Scanner(System.in); <- commented out because of try-with-resources
        
        // Try-with-resources goes like this:
        // try(Scanner scanner = new Scanner(System.in)){}, the finally{} block automatically closes
        // the scanner.
        
        // try{ <-- normal try{} block
        try(Scanner scanner = new Scanner(System.in)){
            // This is a dangerous piece of code, it can interrupt our program by causing
            // an exception:
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        // We can catch specific exceptions and name them something.
        // In this case, "e".
        catch(InputMismatchException e){
            System.out.println("That wasn't a number!");
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero!");
        }
        // You can also catch all exceptions, but you might want to specify in order
        // to let the user know what went wrong. 
        // It's a safety net, you should only do it at the end in case something you don't
        // anticipate happens.
        catch(Exception e){
            System.out.println("Oops, something broke!");
        }
        // finally{} will always execute, even when an exception occurs. 
        // This is where you clean up resources, such as the scanner.close() line.
        finally{
            // scanner.close();
            System.out.println("This always executes!!");
        }

    }
}
