// Our Shape class is going to be abstract; we can't create objects with it.
public abstract class Shape {
    
    abstract double area(); // ABSTRACT (Has to be implemented by the children classes)

    void display(){  // CONCRETE (No need to implement, it's inherited)
        System.out.println("This is a shape.");
    }
}
