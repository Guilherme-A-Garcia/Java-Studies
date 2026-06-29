public class Ride2 {
    private final String model;
    private final int year;
    private final Engine engine;

    Ride2(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    String getModel(){
        return this.model;
    }

    int getYear(){
        return this.year;
    }

    String getEngineType(){
        return this.engine.type;
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running!");
    }
}
