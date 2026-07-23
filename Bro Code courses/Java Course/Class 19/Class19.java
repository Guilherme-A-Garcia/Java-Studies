// Project - Building a calculator program with switches

import java.util.Scanner;

public class Class19{
    public static void main(String[] args){
        // Setting variables
        double number1;
        double number2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        Scanner scanner = new Scanner(System.in);
        
        // Welcome text
        System.out.println("\n---- Calculator ----\n");

        // Input for the first number
        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        // Input for the operator
        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().trim().charAt(0);

        // Input for the second number
        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        // Calculate
        switch(operator){
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if(number2 == 0){
                    System.out.println("You cannot divide by zero!");
                    validOperation = false;
                    // System.exit(0); I could use this line, but it's better to exercise creating flag variables
                }
                else{
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default -> {
                System.out.println("'" + operator + "' is not a valid operator");
                validOperation = false;
            }
        }

        // Show result
        if(validOperation){
            System.out.printf("The final result is: %.02f\n", result);
        }

        scanner.close();
    }
}