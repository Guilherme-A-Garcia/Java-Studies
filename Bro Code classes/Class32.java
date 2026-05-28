// Arrays - Entering user input into arrays

import java.util.Scanner;

public class Class32{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Define an EMPTY array first
        // String[] foods = new String[4];
        String[] foods;
        int num;

        System.out.print("Enter the amount of food you want: ");
        num = scanner.nextInt();

        foods = new String[num];

        // Since we're accepting an int as input, and then a string, we need to clear the
        // buffer from the "\n" character, otherwise \n is used in the next input:
        scanner.nextLine();

        for(int i = 0; i < foods.length; i++){
            System.out.print("Input a food of your choosing: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}