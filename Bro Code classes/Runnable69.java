// When implementing an interface, it's like signing a contract,
// we need to override required methods.

public class Runnable69 implements Runnable {
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            try{
                Thread.sleep(1000); // When using Thread, that refers to the current
                                    // thread we're working with, in this case, the "main" thread.
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i == 5){
                System.out.println("\nTime's up!");
                System.exit(0);
            }
        }
    }
}
