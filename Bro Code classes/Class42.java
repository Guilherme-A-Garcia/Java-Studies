// Object Oriented Programming & Arrays - Arrays of objects

public class Class42{
    public static void main(String[] args){
        // Car1 car1 = new Car1("red", "Mustang");
        // Car1 car2 = new Car1("blue", "Corvette");
        // Car1 car3 = new Car1("yellow", "Charger");
        // ^^^ You don't need to instantiate objects to loop through them in an array;
        // You can create anonymous objects
        
        // Car1[] cars = new Car1[3];
        Car1[] cars = {new Car1("red", "Mustang"), 
        new Car1("blue", "Corvette"),
        new Car1("yellow", "Charger")};

        // for(int i = 0; i < cars.length; i++){
        //     cars[i].drive();
        for(Car1 car : cars){
            car.color = "black";
        }

        for(Car1 car : cars){
            car.drive();
        }

    }
}

// Instead of creating a new file every time, I'll simply stick with this:
class Car1{
    String color;
    String model;

    Car1(String color, String model){
        this.color = color;
        this.model = model;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model + ".");
    }
}