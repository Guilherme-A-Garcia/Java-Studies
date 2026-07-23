// Object Oriented Programming - Enums

import java.util.Scanner;

public class Class68 {
    public static void main(String[] args){
        // Enums = (Enumerations) A special kind of class that
        // represents a fixed set of constants.
        // They improve code readability and are easy to maintain.
        // More efficient than switches rather than comparing strings.

        // Check "Day.java" for context.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();
        // Day day = new Day(1);
        // Day day = Day.SUNDAY;
        try{
            Day day = Day.valueOf(response);

            System.out.println(day);
            System.out.println(day.getDayNumber());

            /* This is where enums shine. Instead of doing this ugly mess of magic numbers:
            case 1,
                 2,
                 3,
                 4,
                 5 -> System.out.println("It is a weekday.");
            case 6,
                 7,
                 8 -> System.out.println("It is the weekend!");

            ... you can use enums for better clarity and safety:
             */
            switch(day){
                case MONDAY, 
                TUESDAY, 
                WEDNESDAY,
                THURSDAY, 
                FRIDAY -> System.out.println("It is a weekday.");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend!");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day.");
        }

        scanner.close();
    }
}
