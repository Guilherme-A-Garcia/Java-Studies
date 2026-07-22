// Resource Management - Threading

import java.util.Scanner;

public class Class69{
    public static void main(String[] args){
        // Threading = Allows a program to run multiple tasks simultaneously.
        // Helps improve performance with time-consuming operations.
        // (File I/O, network communications, or any background tasks)
        
        // How to create a Thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        // Check "Runnable69.java" for context.

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 10 seconds to enter your name.");

        Runnable69 runnable = new Runnable69();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true); // This means this Thread is going to end as soon as
                                // our main thread is finished
        thread.start();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}