// Object Oriented Programming - Interfaces

public class Class49{
    public static void main(String[] args){
        // Interface = A blueprint for a class that specifies a set of abstract methods
        // that implementing classes MUST define.
        // Supports multiple inheritance-like behavior.
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish2 fish2 = new Fish2();

        rabbit.flee();
        hawk.hunt();
        fish2.flee();
        fish2.hunt();
    }
}

// If a class inherits from Prey, they'll have to finish defining flee()
interface Prey{
    void flee();
}

interface Predator{
    void hunt();
}

// Use the keyword 'implements' before the interface
class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("The rabbit is running away");
    }
}


// Better way to understand this concept is this:
// It's kinda like signing a contract: If Hawk is gonna implement the Predator interface,
// you have to finish defining the interface's methods by overriding them.
class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("The hawk is hunting.");
    }
}

// This is a special case.
// Fish can be considered both prey AND predators, which means we're gonna have to
// implement Prey and Predator and finish their respective methods
class Fish2 implements Prey, Predator{
    @Override
    public void flee(){
        System.out.println("The fish is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }
}