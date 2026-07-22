// Object Oriented Programming - ArrayLists

// import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Class56{
    public static void main(String[] args){
        // ArrayList = A resizeable array that stores objects (autoboxing).
        // Arrays are fixed in a size, but ArrayLists are mutable.

        // We need to use the <> diamond operator, which we'll talk about in the future
        // ArrayList<Double> list = new ArrayList<>();

        // list.add(3.14);
        // list.add(1.99);
        // list.add(2.01);

        // System.out.println(list);

        // ArrayList<String> fruits = new ArrayList<>();

        // fruits.add("Apple");
        // fruits.add("Orange");
        // fruits.add("Banana");
        // fruits.add("Coconut");
        
        // fruits.remove(1);
        // fruits.set(1, "Pineapple");
        
        // To sort your ArrayList, you need the java.util.Collections.
        // Collections.sort(fruits);

        // System.out.println(fruits);
        
        // System.out.println(fruits.get(3));
        // System.out.println(fruits.size());

        // for(String fruit : fruits){
        //     System.out.println(fruit);
        // }
        
        // Exercise:
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you'd like to store: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); // Clearing the buffer

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food n°" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}