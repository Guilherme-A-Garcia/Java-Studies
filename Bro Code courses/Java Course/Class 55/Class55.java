// Object Oriented Programming - Wrapper classes

public class Class55 {
    public static void main(String[] args){
        // Wrapper classes = Allow primitive values (e.g., int, char, double, bool)
        // to be used as objects. "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object.
        // Allows use of Collections Framework and static Utility Methods.

        // int a = 123;
        // (The commented ones below are deprecated)
        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(false);

        // This is called Autoboxing. We directly assign the primitives into objects.
        // Integer a = 123;
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = false;

        // Unboxing - Reverting a wrapper class back to its primitive. Simple and sweet.
        // Integer y = 23;
        // int x = y;

        // In case you're wondering 'Why would I use this?', wrapper classes
        // have many useful methods, like turning data into string:
        // String a = Integer.toString(123);
        // String b = Double.toString(3.14);
        // String c = Character.toString('!');
        // String d = Boolean.toString(false);

        // String x = a + b + c + d;

        // System.out.println(x);

        // You can also do the opposite:
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0); // Unrelated to wrapper classes
        boolean d = Boolean.parseBoolean("true");

        // Misc.
        char letter = 'B';
        System.out.println(Character.isLetter(letter));
        if(Character.isLetter(letter)){
            System.out.println(Character.isUpperCase(letter));
        }
    }
}
