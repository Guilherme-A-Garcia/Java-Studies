// Object Oriented Programming - Abstraction

public class Class48{
    public static void main(String[] args){
        // abstract = Used to define abstract classes and methods.
        // Abstraction is the process of hiding implementation details and
        // showing only the essential features.
        // Abstract classes CANNOT be instantiated directly.
        // Can contain 'abstract' methods (which must be implemented)
        // Can contain 'concrete' methods (which are inherited)

        // Check 'Shape.java' (superclass), 'Circle.java', 
        // 'Triangle.java', 'Rectangle.java' (all subclasses) for context!

        // Since Shape is abstract, you can't make an object with it:
        // Shape shape = new Shape();

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7 );

        circle.display();
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}