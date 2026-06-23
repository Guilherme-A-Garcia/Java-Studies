// Object Oriented Programming - Tackling Polymorphism

public class Class50{
    public static void main(String[] args){
        // "Poly" = "Many"
        // "Morph" = "Shape"
        // Objects can identify as other objects.
        // Objects can be treated as objects of a common superclass.
        // (Dog can identify as a dog, animal, organism and object)

        // Polymorphism can be achieved with interfaces

        Car2 car = new Car2();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // car.go();
        // bike.go();
        // boat.go();

        // Instead of specifying either car, bike or boat in an array with them,
        // use what they have in common; the vehicle superclass. 
        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}

// Can't create instances of Vehicle, forces subclasses to implement its abstract methods.
// abstract class Vehicle{
interface Vehicle{
    // abstract void go();
    void go();
}

// class Car2 extends Vehicle{
class Car2 implements Vehicle{
    @Override
    // void go(){
    public void go(){
        System.out.println("You drive the car.");
    }
}

// class Bike extends Vehicle{
class Bike implements Vehicle{
    @Override
    // void go(){
    public void go(){
        System.out.println("You ride the bike.");
    }
}

// class Boat extends Vehicle{
class Boat implements Vehicle{
    @Override
    // void go(){
    public void go(){
        System.out.println("You sail the boat.");
    }
}