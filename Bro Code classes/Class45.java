// Super - Managing the parent class when using inheritance

public class Class45 {
    public static void main(String[] args){
        // super = Refers to the parent class (subclass <- superclass)
        // Used in constructors and method overriding.
        // Calls the parent constructor to initialize attributes.

        // See "Person.java", "Student2.java" and "Employee.java" for context!

        // Person person = new Person("John", "Doe");
        // person.showName();

        Student2 student = new Student2("Average", "Joe", 3.8);
        student.showName();
        System.out.println(student.gpa);

        Employee employee = new Employee("John", "Doe", 8000);
        employee.showSalary();
    }
}
