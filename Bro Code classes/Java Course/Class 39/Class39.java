// OOP - Addressing Object Oriented Programming

public class Class39 {
    public static void main(String[] args){
        // Object = An entity that holds data (attributes)
        // and can perform actions (methods).
        // It is a reference data type.

        // See "Car.java" for context!

        Car car = new Car();

        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);

        car.drive();
        car.brake();
        System.out.println("\nInitial running state: " + car.isRunning + "\n");

        car.turnOn();
        car.drive();
        car.brake();
        System.out.println("Second running state: " + car.isRunning + "\n");

        car.turnOff();
        System.out.println("Third running state: " + car.isRunning);
        
    }
}
