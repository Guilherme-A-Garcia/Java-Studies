// Resource Management - Multithreading

public class Class70{
    public static void main(String[] args){
        // Multithreading - Enables a program to run multiple threads concurrently.
        // (Thread = A set of instructions that run intependently)
        // Useful for multiple background tasks or time-consuming operations.

        // Check "Runnable70.java" for context!
        // Runnable70 runnable = new Runnable70();

        System.out.println("Game start");

        Thread thread1 = new Thread(new Runnable70("ping"));
        Thread thread2 = new Thread(new Runnable70("pong"));
        
        thread1.start();
        thread2.start();

        try{
            // .join() pauses the executing thread to wait for a target thread to finish its execution.
            thread1.join();
            thread2.join(); 
        }
        catch(InterruptedException e){
            System.out.println("Main thread was interrupted!");
        }

        System.out.println("Game over");

    }
}