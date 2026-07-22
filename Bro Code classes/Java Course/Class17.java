// Project - Building a temperature converter

import java.util.Scanner;

public class Class17 {
    public static void main(String[] args){
        double temp;
        char unit;
        double newTemp;
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("\n---- Temperature Conversion ----\n");

        // Ask for the temperature to be converted
        System.out.print("Enter the temperature to be converted: ");
        temp = scanner.nextDouble();

        // Ask for a char, C to convert to celsius or F for fahrenheit
        System.out.print("\nEnter the unit you wish to convert the temperature to (F for Fahrenheit, C for Celsius): ");
        unit = scanner.next().trim().toUpperCase().charAt(0);

        if("CF".indexOf(unit) == -1){
            System.out.println("Invalid unit! You can only convert to Fahrenheit or Celsius.");
            System.exit(0);
        }
        
        // Convert the temperature
        newTemp = (String.valueOf(unit).equals("C")) ? (temp - 32) / 1.8 : (temp * 1.8) + 32;

        // Display the converted temperature 
        System.out.printf("\nThe converted temperature is: %.2f°%c\n", newTemp, unit);  // could use %s for char but it's vulnerable.

        scanner.close();
    }
}
