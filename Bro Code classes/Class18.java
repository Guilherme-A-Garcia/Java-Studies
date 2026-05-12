// Switches - Using enhanced switches

import java.util.Scanner;

public class Class18{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /* 
        Instead of using multiple (5+) if-else-if statements for discrete values, 
        you can use switches for cleaner case handling.
        (Enhanced switches are a Java14 feature)

         switch(target){
            case condition -> doSomething();
            case condition1, condition2 -> doSomething();
            // default -> "default to a line or a block of code within {} as see below"
            default -> {
                doSomething();
            }
        }
        */

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().strip();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
            System.out.println("It's a weekday.");

            case "Saturday", "Sunday" -> 
            System.out.println("It's the weekend!!!");
            
            default -> System.out.println(day + " is not a day!");
        }

        scanner.close();
    }
}