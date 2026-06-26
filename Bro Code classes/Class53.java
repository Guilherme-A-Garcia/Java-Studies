// Object Oriented Programming - Aggregation

public class Class53{
    public static void main(String[] args){
        // Aggregation = Represents a 'has-a' relationship between objects.
        // One object contains another object as part of its structure, but
        // the contained object(s) can exist independently.

        // See "Book.java" and "Library.java" for context!

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);
        
        // This object exists independently of its aggregator.
        Book[] books = {book1, book2, book3};

        // This is where aggregation comes in.
        Library library = new Library("NYC Public Library", 1897, books);
        library.displayInfo();
    }
}