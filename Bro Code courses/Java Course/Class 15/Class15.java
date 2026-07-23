// If Statements - Building a weight conversion program

import java.util.Scanner;

public class Class15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Pseudocode (Programatic instructions/algorithm)

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("---- Weight Conversion Program ----");
        System.out.println("Type 1 to convert lbs to kgs.");
        System.out.println("Type 2 to convert kgs to lbs.\n");

        // Prompt for user choice
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        
        // option 1 for converting lbs to kgs
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The converted weight in kgs is: %.2f\n", newWeight);
        }

        // option 2 for converting kgs to lbs
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The converted weight in lbs is: %.2f\n", newWeight);
        }

        // else print "invalid choice"
        else{
            System.out.println("Invalid choice!");
            System.out.println("Valid options:\n1 - lbs to kgs\n2 - kgs to lbs");
        }

        scanner.close();
    }
}
