// Varargs - Accepting a varying number of arguments in a method

public class Class34 {
    public static void main(String[] args){
        // Instead of overloading methods, you can simply use varargs and
        // deal with the dynamic arguments using an enhanced for loop or managing it other ways!
        // Java packs the arguments into an array.
        
        // System.out.println(add(1,2,3,4));
        System.out.println(average(52, 33, 20));
    }

    // Instead of doing this ugly thing:
    // static double add(int a, int b){
    //     double result = a + b;
    //     return result;
    // }

    // static double add(int a, int b, int c){
    //     double result = a + b + c;
    //     return result;
    // }

    // static double add(int a, int b, int c, int d){
    //     double result = a + b + c + d;
    //     return result;
    // }

    // Just do this:
    // static int add(int... numbers){
    //     int sum = 0;

    //     for(int number : numbers){
    //         sum += number;
    //     }
    //     return sum;
    // }

    static double average(double... numbers){
        if(numbers.length == 0){
            return 0;
        }

        double sum = 0;
        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}
