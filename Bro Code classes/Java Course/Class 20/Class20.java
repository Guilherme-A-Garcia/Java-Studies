// Logical Operators - && (AND), || (OR), ! (NOT)

import java.util.Scanner;

public class Class20 {
    public static void main(String[] args){
        
        /*
        double temp = 30;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good :D");
            System.out.println("It is sunny outside!");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good :D");
            System.out.println("It is cloudy outside!");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad!");
        } */

        Scanner scanner = new Scanner(System.in);

        // Username must be between 4-12 characters
        // Username must not contain spaces or underscores
        
        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine().strip();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-14 characters.");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores.");
        }
        else{
            System.out.println("Welcome, " + username);
        }

        scanner.close();
    }
}
