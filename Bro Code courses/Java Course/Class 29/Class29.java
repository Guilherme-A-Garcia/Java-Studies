// Methods - Building a banking program

import java.util.Scanner;

public class Class29 {
    public static void main(String[] args){
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        double balance;
        boolean isRunning = true;
        int choice;

        // Display menu
        System.out.println("\n---------------");
        System.out.println("Banking Program");
        System.out.println("---------------");

        System.out.print("Enter your balance: $");
        balance = scanner.nextDouble();
        
        showMenu();

        while(isRunning){
            // Get and process user's input
            System.out.println("\n(4: Show options | 5: Exit)");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> deposit(scanner, balance);
                case 3 -> withdraw(scanner, balance);
                case 4 -> showMenu();
                case 5 -> {
                    System.out.println("---------------");
                    System.out.println("Thank you! Have a nice day!");
                    System.out.println("---------------");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        
        scanner.close();
    }

    // Make showBalance()
    static void showBalance(double balance){
        System.out.println("---------------");
        System.out.printf("Your Balance is: $%,.02f\n", balance);
    }

    // Make deposit()
    static void deposit(Scanner scanner, double balance){
        double newValue;
        System.out.println("---------------");
        System.out.print("Enter the amount of cash you'd like to deposit: ");
    
        newValue = scanner.nextDouble();
        
        if(newValue <= 0){
            System.out.println("Error: You can only deposit numbers above zero!");
        }
        else{
            balance += newValue;
            System.out.printf("Your new balance is: $%,.02f\n", balance);
        }
    }

    // Make withdraw()
    static void withdraw(Scanner scanner, double balance){
        double newValue;
        System.out.println("---------------");
        System.out.print("Enter the amount of cash you'd like to withdraw: ");
        
        newValue = scanner.nextDouble();

        if(newValue <= 0){
            System.out.println("Error: The withdrawal number needs to be bigger than zero!");
        }
        else if(newValue > balance){
            System.out.println("Error: Insufficient funds!");
        }
        else{
            balance -= newValue;
            System.out.printf("Your new balance is: $%,.02f\n", balance);
        }
    }
        
    // Make showMenu()
    static void showMenu(){
        System.out.println("---------------");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Show options");
        System.out.println("5. Exit");
    }

}
