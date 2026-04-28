// Scanner - Building a shopping cart program

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What product would you like to buy?\nR: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?\nR: ");
        price = scanner.nextDouble();

        System.out.print("How many units of '" + item + "' are you buying?\nR: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have successfully added " + quantity + " " + item + "(s) to the cart!");
        System.out.println("Total: " + currency + total );

        scanner.close();
    }
}
