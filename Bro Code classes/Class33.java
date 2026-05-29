// Arrays - Searching through the elements of arrays

import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Class33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {6, 3, 8, 2, 9, 5};
        boolean isFound = false;
        
        String[] fruits = {"apple", "orange", "banana"};
        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();

        // for(int i = 0; i < numbers.length; i++){
        //     if(target == numbers[i]){
        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){ // Using "==" would compare memory addresses when it comes to strings
                System.out.println("Target found at index: "+ i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("The target was not found in the array!");
        }

        scanner.close();
    }
}
