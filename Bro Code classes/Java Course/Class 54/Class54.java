// Object Oriented Programming - Composition

public class Class54 {
    public static void main(String[] args){
        // Composition = Represents a "part-of" relationship between objects.
        // For example, an engine is "part of" a car.
        // Allows for complex objects to be constructed from smaller objects.

        // Check "Ride2.java", "Engine.java" for context!
        
        // Deleting the composed object will also delete its components, like Engine!
        Ride2 ride = new Ride2("Corvette", 2025, "V8");

        System.out.println(ride.getModel());
        System.out.println(ride.getYear());
        System.out.println(ride.getEngineType());
        
        // This also calls Engine.start()
        ride.start();

    }
}
