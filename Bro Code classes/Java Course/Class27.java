// Methods - Overloaded methods

public class Class27 {
    public static void main(String[] args){
        // overloaded methods = methods that share the same name with different params
        // signature = name + parameters

        String pizza = bakePizza("flat bread");
        System.out.println(pizza);
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";

    // Notice how you can stack multiple definitions of the same method with different parameters,
    // that's called overloading.

    }

}
