public class Ride{
    
    // These attributes are publicly accessible, anyone can change them.
    // String model;
    // String color;
    // int price;

    // This is how you make them safer when working in a team:
    private final String model; // If you want extra security on unwritable attributes, use 'final'
    private String color;
    private int price;

    Ride(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Creating getter methods:
    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$" + this.price;
    }
    // I expected it to be more mind-bending, they're just plain
    // methods that return a value from inside the class...

    // Creating setter methods:
    // (Model is purposefully read-only)
    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(this.price < 0){
            System.out.println("The price cannot be less than 0.");
        }
        else{
            this.price = price;
        }
    }
}