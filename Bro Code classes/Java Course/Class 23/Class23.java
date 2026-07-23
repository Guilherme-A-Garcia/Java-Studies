// For Loops - Managing iterations

import java.util.Scanner;

public class Class23{
    public static void main(String[] args) throws InterruptedException{
        // For loops execute a piece of code a certain amount of times

        /* 
        In for loops there are three statements, each separated by a ';'
        First statement: Initializer. You can keep track of each iteration with a loop control variable (int = var).
        Second statement: Condition. Think of this as "Execute the loop as long as x condition == y"
        Third statement: Update. You can do something with the loop update variable.
        */

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter how many times you want to loop: ");
        // int max = scanner.nextInt(); 

        // for(int i = 1; i <= max; i++){
        //     System.out.println(i);
        // }

        System.out.println("How many seconds to start from?");
        int start = scanner.nextInt();

        for(int i = start - 1; i > 0; i--){
            Thread.sleep(1000);  // Don't worry too much about this, it's intermediary Java anyways
            System.out.println(i);
        }
        System.out.println("Countdown finished successfully!");

        scanner.close();
    }
}