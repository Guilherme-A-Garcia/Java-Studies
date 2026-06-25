// Object Oriented Programming - Runtime polymorphism (Dynamic polymorphism)

import java.util.Scanner;

public class Class51 {
    public static void main(String[] args){
        // Runtime polymorphism = When the method that gets executed is decided at runtime
        // based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);
        Animal3 animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat) R: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            // Instantiate the declared 'animal' variable at runtime as 
            animal = new Dog3();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat3();
            animal.speak();
        }
        else{
            System.out.println("Invalid input.");
        }

        scanner.close();
    }   
}

abstract class Animal3{
    abstract void speak();
}

class Dog3 extends Animal3{
    @Override
    void speak(){
        System.out.println("*Woof*");
    }
}

class Cat3 extends Animal3{
    @Override
    void speak(){
        System.out.println("*Meow*");
    }
}
