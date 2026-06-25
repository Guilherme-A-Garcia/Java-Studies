// Object Oriented Programming - Getter and setter methods

public class Class52 {
    public static void main(String[] args){
        // Getters and setters help object protect data and add rules for accessing or modifying them.
        // Getters = Methods that make a field READABLE.
        // Setters = Methods that make a field WRITABLE.

        // See "Ride.java" for context.

        Ride car = new Ride("Charger", "Yellow", 10000);

        // Example of how easily you can change a public attribute:
        // car.color = "Red";

        // Setting private values with the defined setter methods:
        car.setColor("Red");
        car.setPrice(20000);
        
        // You can't access private attributes like this:
        // System.out.println(car.color + " " + car.model + " " + car.price);
        
        // But there is a way around it, which is with getter and setter methods.
        // Check Ride.java for that.
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());


    }
}
