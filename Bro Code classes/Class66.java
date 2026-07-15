// Object Oriented Programming - Generics

import java.util.ArrayList;

public class Class66{
    public static void main(String[] args){
        // Generics = A concept where you can write a class, interface or method that
        // is compatible with different data types.
        // <T> type parameter (placeholder that gets replaced with a real type)
        // <String> type argument (specifies the type)

        // See "Box.java" and "Product.java" for context!

        // ArrayList<String> fruits = new ArrayList<>();
        // fruits.add("apple");
        // fruits.add("banana");
        // fruits.add("orange");

        // ArrayList<Boolean> values = new ArrayList<>();
        // values.add(true);
        // values.add(false);
        // values.add(true);

        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(150);
        System.out.println(box2.getItem());

        Product<String, Double> product = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
        
        System.out.println();

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}