// Loops - Nested loops

import java.util.Scanner;

public class Class25 {
    public static void main(String[] args){
        // Nested loops are simply loops within loops.
        //          Often used with matrices and DS&A


        // for(int i = 1; i <=3; i++){
        //     // To run this loop three times, you could copy paste, but that's not optimal.
        //     for(int j = 1; j <= 9; j++){
        //         System.out.print(j + " ");
        //     }
        // System.out.println();
        // }

        int rows;
        int columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol you'd like to use: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
