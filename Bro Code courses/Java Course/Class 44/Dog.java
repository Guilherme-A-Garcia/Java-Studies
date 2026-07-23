// In order to inherit from a class, use the keyword "extends" before the
// name of the class you wish to inherit from.
public class Dog extends Animal {
    // Just like Cat, Dog inherits from Animal, meaning it's a child of Animal.

    int lives = 1;

    void speak(){
        System.out.println("*Woof*");
    }
}
