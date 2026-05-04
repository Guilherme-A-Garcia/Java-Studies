// Printf - Formatting output

public class Class10 {
    public static void main(String[] args){
        // printf = method used to format outputs

        // %[flags][width][.precision][specifier-character]

        String name = "Johnny";
        char firstLetter = 'J';
        int age = 20;
        double height = 180;
        boolean isEmployed = true;

        // Keep in mind: When using printf, you need to manually add a new line at the end with \n
        System.out.printf("Hello %s\n", name);  // %s = string
        System.out.printf("Your name starts with %c\n", firstLetter);  // %c = char
        System.out.printf("You are %d years old!\n", age);  // %d (NOT %i) = int. d stands for decimal.

        // When dealing with doubles, set a precision with .<number> between % and letter to limit characters.
        System.out.printf("You are %.1f centimeters tall!\n", height);  // %f = float, so you're referring to double.
    
        System.out.printf("Employed: %b\n", isEmployed);

        // Using multiple variables in a single print statement
        System.out.printf("%s is %d years old\n", name, age);

        /* [Flags]

        + = output a plus before positive numbers
        , = comma grouping separator (useful for displaying prices, adds ','/'.' after three decimals)
        ( = negative numbers are enclosed in ()
        space = display a minus if negative, space if positive

        */

        System.out.println("\n---- Playing around with flags ----\n");

        double price1 = 9.20;
        double price2 = 1000.24;
        double price3 = -240.1;

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3);

        /* [Width]

        0 = zero padding
        number = right justified padding
        negative number = left justified padding
        
        Example: 04: zero becomes the padding character, 4 becomes the amount of padding.

        */

        System.out.println("\n---- Playing around with width ----\n");

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);  // Space as padding
        System.out.printf("%4d\n", id2);  // Space as padding
        System.out.printf("%04d\n", id3);  // Zero as padding
        System.out.printf("%04d\n", id4);  // Zero as padding

        // You can do just 4 without 0 to have a space as padding
    }    
}
