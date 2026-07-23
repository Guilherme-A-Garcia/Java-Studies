// Object Oriented Programming - Constructors

public class Class40{
    public static void main(String[] args){
        // Constructors are special methods that initialize objects.
        // You can pass arguments to a constructor and set up initial values.

        // Check "Student.java" for context!

        // Student student1 = new Student();
        // Student student2 = new Student();

        Student student1 = new Student("John", 20, 4.0);
        Student student2 = new Student("Adam", 19, 3.4);
        System.out.println("----- Student 1 ----");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println("Enrollment status: " + student1.isEnrolled);
        student1.study();
        System.out.println("----- Student 1 ----\n");

        System.out.println("----- Student 2 ----");
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println("Enrollment status: " + student1.isEnrolled);
        student2.study();
        System.out.println("----- Student 2 ----");
    }
}