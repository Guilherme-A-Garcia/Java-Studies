// Variables - Managing primitive and reference values

public class Class2 {
    public static void main(String[] args) {
        /*
        Variable = A reusable container for a value;
        a variable behaves as the value it stores.

        Primitive = Simple value stored directly in memory (stack)
        Example: The same as me handing you $10.

        Reference = Memory address (stack) that points to the heap
        Example: The same as me giving you an IOU that says I owe you $10, but the money
        is at the bank.

        Primitive   vs  Reference
        ---------       ---------
        int             string
        double          array
        char            object
        boolean

        How to declare them:
        1. declaration
        2. assignment
        */

        int age; // declaration
        age = 21; // assignment
        // You can also do both in one line: "int age = 21;"

        int quantity = 1;
        int year = 2015;

        // System.out.println("The year is " + year + "."); This is how you concatenate strings with variables.
        
        double price = 19999.99;  // If the assigned number is an int, it adds a decimal to it. In this case, it'd be 19.0
        double GPA = 23.0;
        double temperature = -26.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;

        // if statements:
        // if (isStudent) { (if isStudent == True but shortened)
        //     System.out.println("You are a student!");
        // }
        // else{
        //     System.out.println("You are NOT a student!");
        // }

        String name = "John Doe";
        String food = "Pizza";
        String email = "johndoesnothing123@gmail.com";

        String color = "red";
        String car = "Mustang";

        System.out.println("Your choice is a " + color + " " + year + " " + car + ".");

        if (forSale) {
            System.out.println("There is a " + car + " for sale!");
            System.out.println("The price is: " + currency + price);
        }
        else{
            System.out.println("The " + car + " is not for sale!");
        }

    }
}
