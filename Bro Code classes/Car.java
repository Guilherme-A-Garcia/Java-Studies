// This is how you create a class. Pretty familiar, huh?
public class Car{
    
    // These are the class' attributes
    String make = "Ford"; 
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void turnOn(){
        isRunning = true;
        System.out.println("You have started the engine.");
    }

    void turnOff(){
        isRunning = false;
        System.out.println("You have stopped the engine.");
    }

    void drive(){
        if(isRunning){
            System.out.println("You are currently driving.");
        }
        else{
            System.out.println("The " + model + " must be turned on for you to drive!");
        }
    }

    void brake(){
        if(isRunning){
            System.out.println("You have braked successfully.");
        }
        else{
            System.out.println("The " + model + " must be turned on for you to brake!");
        }
    }

}