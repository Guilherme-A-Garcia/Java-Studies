
// Methods - Learning the basics

public class Class26 {
    public static void main(String[] args){
        // method = a block of reusable code that is executed when called with ()

        // String name = "John";
        // int age = 18;

        // Obviously, you can call methods as many times as you want as seen below
        // for(int i = 0; i <= 3; i++){
        //     typeOutStrings(name, age);
        // }

        // double result = squareNumber(3);
        // System.out.println(result);

        // Or:
        System.out.println(squareNumber(8));

        System.out.println(cube(5));

        String fullName = getFullName("Jane", "Doe");
        System.out.println(fullName);

        int age = 18;

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You must be 18+ to sign up.");
        }

    }
    
    // IMPORTANT: When not returning a value, the keyword void is necessary.
    static void typeOutStrings(String name, int age){

        // You could repeat this block of code, but it's better to follow the DRY principle, Don't Repeat Yourself.
        System.out.println("This is a string.");
        System.out.println("This is another string.");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
    }

    // Static methods are associated with the class itself (In this case, public class Class24), 
    // not with individual objects. They can be called using the class name, without creating an instance.
    static double squareNumber(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        // if(age >= 18){
        //     return true;
        // }
        // else{
        //     return false;
        // }

        // Or:

        return age >= 18;
    }
}

