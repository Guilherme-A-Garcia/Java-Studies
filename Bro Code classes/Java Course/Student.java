public class Student{
    // String name = "John"; // There's a problem with this approach:
                             // In all instances of this class, this variable will store "John".
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Instead of that, we can make a constructor and set it up
    // so it accepts parameters, like this:
    Student(String name, int age, double gpa){
        // 'this' is the same as self. in Python. Refers to the instance itSELF, or... just 'this'... 
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying!");
    }
}