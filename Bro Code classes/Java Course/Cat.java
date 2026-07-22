// In order to inherit from a class, use the keyword "extends" before the
// name of the class you wish to inherit from.
public class Cat extends Animal {
    // Here, Cat inherits from Animal, meaning it's a child of Animal.

    int lives = 9;

    void speak(){
        System.out.println("*Meow*");
    }
}