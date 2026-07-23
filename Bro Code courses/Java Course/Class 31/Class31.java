// Arrays - Managing collections of values

import java.util.Arrays;

public class Class31{
    public static void main(String[] args){

        // Array = A collection of values of the same data type
        //        *Think of it as a variable that can store more than one value*
        //         In layman's terms, it's basically a list of one data type.

        String[] fruits = {"apple", "banana", "orange", "coconut"}; 
        // Add a set of square brackets after the data type, and curly braces around the values

        // To change the value of an index:
        fruits[0] = "pineapple";
        
        System.out.println(fruits.length);

        // for(int i = 0; i < fruits.length; i++){
        //     System.out.print(fruits[i] + " ");
        // }

        // To organize arrays alphabetically, you need to import the array class
        Arrays.sort(fruits);
        
        // To fill an array with a value, use Arrays.fill():
        // Arrays.fill(fruits, "apple");

        // Enhanced for loops cycles once for each element in an array:
        // State the data type of the array elements, then unique identifier, then the array
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }

        System.out.println();
    }
}