// Project - Building a compound interest calculator

/* Formula: A = P(1+r/n)^nt
A = Final amount.
P = Principal (Initial amount of money).
r = Annual interest rate.
n = Compounding frequency. The number of times interest is applied per year (12 for monthly, 4 for quarterly)
t = Time. The total number of years the money is invested or borrowed.
*/

import java.util.Scanner;

public class Class11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the initial amount of money: ");
        principal = scanner.nextDouble();
        if(principal <= 0){
            System.out.println("The amount must be higher than zero.");
            System.exit(0);
        }

        System.out.print("Enter the interest rate (in decimal numbers): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();
        if(years <= 0){
            System.out.println("The number of years must be higher than zero.");
            System.exit(0);
        }

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        if(years > 1){
            System.out.printf("After %d years, the amount you've entered is worth: $%,.2f\n", years, amount);
        }
        else{
            System.out.printf("After a year, the amount you've entered is worth: $%,.2f\n", amount);
        }

        scanner.close();
    }
}