// Object Oriented Programming - Method overriding

public class Class46{
    public static void main(String[] args){
        // Method overriding = When a subclass provides its own implementation of
        // a method that is already defined by its parent.
        // Allows for code reusability and give specific implementations.

        // Check "Animal2.java", "Dog2.java", "Cat2.java" and "Fish.java" for context...
        // ... Especially "Fish.java"!

        // Dog2, Cat2 and Fish are subclasses of the superclass Animal2.
        Dog2 dog2 = new Dog2();
        Cat2 cat2 = new Cat2();
        Fish fish = new Fish();

        dog2.move();
        cat2.move();
        fish.move();
    }
}