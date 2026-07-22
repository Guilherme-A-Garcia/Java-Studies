// Scanner - Accepting and managing user inputs
import java.util.Scanner;

public class Class3 {
    public static void main(String[] args){
        double gpa = 0;
        Scanner scanner = new Scanner(System.in);  // Creating a new Scanner object called "scanner".
        
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false) R: ");
        boolean isStudent = scanner.nextBoolean();

        if(isStudent){
            System.out.print("What is your GPA? R: ");
            gpa = scanner.nextDouble();
        }

        System.out.println("\n---- Inputted Values ----\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student status: " + isStudent);

        if(isStudent){
            System.out.println("GPA: " + gpa);
        }
        
        scanner.close();  // Always good practice to close the scanner after you're done using it.

        /* If you accept a string with newLine(), and then accept an integer or a double,
        you need to clean up the buffer, otherwise the next input will take '\n' as the value!
        (... I think...) 
        
        To clean up the buffer, simply write 'scanner_obj.nextLine()' without assigning it to anything.*/
    }
}
