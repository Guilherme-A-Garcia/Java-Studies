// Data Structures - HashMaps

import java.util.HashMap;

public class Class67{
    public static void main(String[] args){
        // HashMap = A data structure that stores Key-Value pairs.
        // Keys are unique, but Values can be duplicated.
        // Does not maintain any order, but it's memory efficient.
        // HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        // Adding a Key-Value pair to a HashMap:
        map.put("Apple", 0.50);
        map.put("Orange", 0.75);
        map.put("Banana", 0.25);
        map.put("Coconut", 1.00);

        // Removing a Key-Value pair from a HashMap:
        map.remove("Banana");

        // Getting the Value associated with a Key:
        System.out.printf("Price of the apple: $%.02f%n", map.get("Apple"));
        
        // Checking if a Key or a Value exists:
        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsValue(1.00));
        
        if(map.containsKey("Banana")){
            System.out.println(map.get("Banana"));
        }
        else{
            System.out.println("Key not found!");
        }

        // Returning the size of a HashMap:
        System.out.println(map.size());

        // map.put("Orange", 100000.00); Duplicates get overwritten

        // System.out.println(map);
        for(String key : map.keySet()){
            System.out.printf("%s: $%.02f%n", key, map.get(key));
        }

    }
}