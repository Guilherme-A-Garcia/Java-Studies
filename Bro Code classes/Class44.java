// Inheritance - Managing child/parent relationships

public class Class44{
    public static void main(String[] args) {
        
        // Inheritance = One class inherits the attributes and methods from another class.
        // Child <- Parent <- Organism (multi-level inheritance)

        // Check "Dog.java", "Cat.java", "Animal.java", "Organism.java" and "Plant.java" for context!

        // In this case, Dog and Cat inherit from their parent Animal, and Animal inherits
        // from its grandparent Organism.

        // In addition to that, Plant inherits from Organism.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println("Plant alive status: " + plant.isAlive);
        System.out.println("Dog alive status: " + dog.isAlive);
        System.out.println("Cat alive status: " + cat.isAlive);
        dog.eat();  // Since it's the same string, let's just go with dog.eat();
        plant.photosynthesize();

        System.out.println("Dog lives: " + dog.lives);
        System.out.println("Cat lives: " + cat.lives);

        dog.speak();
        cat.speak();

        /* 
        The family tree goes like this:
                    Organism
                   /        \
              Plant          Animal
                            /      \
                         Cat        Dog
        */
    }
}