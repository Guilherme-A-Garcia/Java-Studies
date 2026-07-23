// If Statements - Performing conditional statements

import java.util.Scanner;

public class Class7{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;
        
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you enrolled as a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        // Group 1
        // if(name == ""){}; Instead of this, just use the following method:
        if(name.isEmpty()){
            System.out.println("You did not enter your name!");
        }
        else{
            System.out.println("Hello, " + name + "!");
        }

        // Group 2
        if(age >= 18 && age < 65){
            System.out.println("You are an adult!");
        }
        else if(age >= 65 && age < 120){
            System.out.println("You are a senior!");
        }
        else if(age >= 120 && age < 200){
            System.out.println("You are pretty damn old!");
        }
        else if(age >=200){
            System.out.println("You are an ancient creature!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else if(age <=0){
            System.out.println("You haven't been born yet!");
        }
        else{
            System.out.println("You are a child!");
        }

        // Group 3
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        scanner.close();
    }
}