// Object Oriented Programming - toString method

public class Class47 {
    public static void main(String[] args) {
        // .toString() = A method inherited from the object class.
        // Used to return a string representation of an object.
        // By default, it returns a hash code as an unique identifier.
        // It can be overriden to provide meaningful details. 

        Car3 car1 = new Car3("Ford", "Mustang", 2025, "Red");

        Car3 car2 = new Car3("Chevrolet", "Corvette", 2026, "Blue");

        // There's no need to manually identify your object like this:
        // System.out.println(car3.color + " " + car3.year + " " + car3.make + " " + car3.model);

        // Instead, you can go to the class and override the .toString() with the previous println string.
        System.out.println(car1);
        System.out.println(car2);
    }
}

class Car3{
    String make;
    String model;
    int year;
    String color;

    Car3(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
