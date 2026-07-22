// Project - Java slot machine

import java.util.Scanner;
import java.util.Random;

public class Class38{
    public static void main(String[] args){

        // Declare variables
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Welcome message
        System.out.println("\n ----  Welcome to Java Slots  ---- ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐\n");
        
        // Play if balance > 0
        while(balance > 0){
            System.out.println("Current balance: $" + balance);
            
            // Enter bet amount
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            
            if(bet > balance){
                // Verify if bet > balance
                System.out.println("Insufficient funds!");
                continue;
            }
            else if(bet <= 0){
                // Verify if bet > 0
                System.out.println("Bet must be greater than 0.");
                continue;
            }
            else{
                // Subtract bet from balance
                balance -= bet;
                
                // Spin row
                System.out.println("Spinning...");
                row = spinRow();
                
                // Print row
                printRow(row);
                
                // Get payout
                payout = getPayout(row, bet);
                
                if(payout > 0){
                    System.out.println("You won $" + payout);
                    balance += payout;
                }
                else{
                    System.out.println("You lost this round!");
                }
                
            }
            // Ask to play again
            System.out.print("Would you like to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
            
        }

        // Display exit message
        System.out.println("Game over. Your final balance is: $" + balance);

        scanner.close();
    }

    static String[] spinRow(){
        Random random = new Random();

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println("-------------------");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("-------------------");
    }

    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}