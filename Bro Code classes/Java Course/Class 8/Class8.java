// Random - Generating pseudo-random numbers

import java.util.Random;

public class Class8 {
    public static void main(String[] args){
        Random random = new Random();

        // int number;
        // number = random.nextInt(1, 7); Without params, sets a number between negative 2 billion and positive 2 bilion
        
        boolean isHeads;
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads!");
        }
        else{
            System.out.println("Tails!");
        }
    }
}
