// Mathematics - Expanding on the Math class

import java.util.Scanner;

public class Class9 {
    public static void main(String[] args){
        // Useful Methods:

        // System.out.println("Pi: " + Math.PI);  // Math.PI returns the closest approximation to pi as a double.
        // System.out.println("Euler's Number: " + Math.E);  // Math.PI returns the exponential constant, AKA Euler's number. Also double.
        
        // double result;

        // result = Math.abs(-5); Math.abs(x) returns the absolute value of x.
        // result = Math.pow(2, 3); Math.pow(x, y) raises x to the power of y.
        // result = Math.sqrt(9); Math.sqrt(x) returns the square root of x.

        // result = Math.round(5.50); Math.round(x) returns x rounded (either up or down).
        // result = Math.ceil(5.56); Math.ceil(x) returns x rounded UP.
        // result = Math.floor(5.9); Math.floor(x) returns x rounded DOWN.

        // result = Math.max(10, 20); Math.max(x, y) returns the smallest value between x and y.
        // result = Math.min(10, 20); Math.max(x, y) returns the biggest value between x and y.

        // System.out.println("\n" + result);



        // Exercises:

        // 1. Find the hypotenuse (c = Math.sqrt(a² + b²))
        System.out.println("\n---- Finding the hypotenuse ----\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A's length: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side B's length: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypothenuse is: " + c + "cm");

        // 2. Find the circumference, area and volume of a circle

        // circumference = 2 * PI * radius
        // area = PI * radius²
        // volume = (4/3) * PI * radius³

        System.out.println("\n---- Finding area, volume and circumference ----\n");

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;

        double area = Math.PI * Math.pow(radius, 2);

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("According to the radius,\nCircumference: " + circumference + "cm.");
        System.out.println("Area: " + area + "cm²");
        System.out.println("Volume: " + volume + "cm³");
        
        scanner.close();

    }
}
