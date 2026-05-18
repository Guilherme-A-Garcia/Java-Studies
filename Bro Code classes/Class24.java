// Loops - Break and continue

public class Class24{
    public static void main(String[] args){
        // break = Breaks out of the loop (STOP)
        // continue = Skips current iteration of the loop (SKIP)

        for(int i = 0; i <= 10; i++){
            if(i == 5){
                // break; <--- If i hits 5, it STOPS the loop
                continue; // <--- If i hits 5, it SKIPS 5, but continues the loop
            }

            System.out.print(i + " ");
            
        }
        System.out.println();

    }
}