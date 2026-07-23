// This class is a child of Person
public class Student2 extends Person{
    double gpa;

    Student2(String first, String last, double gpa){
        // Instead of referencing "this." object's attributes, you can reference the parent Person with "super()"
        super(first, last);
        this.gpa = gpa;
    }
}