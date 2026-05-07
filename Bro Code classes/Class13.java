// Intermediary String Handling - String methods

public class Class13 {
    public static void main(String[] args){

        String name = "    John James    ";

        int length = name.length();  // Counts how many characters in a string
        char letter = name.charAt(1);  // Returns the character at an index of a string
        int index = name.indexOf('o');  // Returns the first index of a given letter in a string
        int lastIndex = name.lastIndexOf('J');  // Returns the last index of a given letter in a string

        // ... Do I really need to explain these?
        String nameUpperCase = name.toUpperCase();
        String nameLowerCase = name.toLowerCase();

        // You can trim white space and trailing with the .trim() method
        String trimmedName = name.trim();

        String replacedName = name.replace("J", "M");

        // You can verify whether the string is empty or not. isEmpty() returns a boolean.
        Boolean isNameEmpty = name.isEmpty();
        if(isNameEmpty){  // or if(name.isEmpty()){}
            System.out.println("Your name is empty.");
        }
        else{
            System.out.println("Your name is "+ name.trim() + "!");
        }

        if(name.contains(" ")){  // .contains() returns true if the string has the specified string in it.
            System.out.println("Your name contains a space!");
        }
        else{
            System.out.println("Your name contains no spaces!");
        }

        if(name.equalsIgnoreCase("password")){  // .equals() equates the string to a specified string, returns bool
            System.out.println("Your name can't be 'password'!");  // .equalsIgnoreCase(), ignores case sensitivity
        }
        else{
            System.out.println("Your name is valid!");
        }
    }
}
