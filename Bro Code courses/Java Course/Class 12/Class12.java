// Conditional Statements - Nested If statements

import java.util.Scanner;

public class Class12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price = 9.99;
        
        System.out.print("\nAre you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a senior? (true/false):");
        isSenior = scanner.nextBoolean();

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
        }
        System.out.printf("The price of a ticket is: %.2f\n", price);

        System.out.print("");


        scanner.close();
    }
}
