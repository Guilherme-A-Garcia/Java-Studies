public class Employee extends Person{
    int salary;

    Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }
    
    void showSalary(){
        if(this.first.endsWith("s")){
            System.out.println(this.first + "' salary is $" + this.salary + ".");
        }
        else{
            System.out.println(this.first + "'s salary is $" + this.salary + ".");
        }
    }
}