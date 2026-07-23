// Static Keyword - Managing class variables and methods

public class Class43 {
    public static void main(String[] args){
        // static = Makes a variable or method belong to the class
        // rather than to any specific object.
        // Generally used for utility methods or shared resources.

        // See "Friend.java" for context!

        Friend friend1 = new Friend("Tom");
        Friend friend2 = new Friend("Dick");
        Friend friend3 = new Friend("Harry");

        // If Friends.numOfFriends is not static, each object get their copy of the variable.
        // System.out.println(friend1.numOfFriends);
        // System.out.println(friend2.numOfFriends);
        // System.out.println(friend3.numOfFriends);

        // It's better to access the static variable directly from the class than from an object
        System.out.println(Friend.numOfFriends);

        // To call a static method, you don't need to create an instance of a class
        Friend.showFriends();

        // Notice how the same logic is applied to Math.round() is the same:
        System.out.println(Math.round(5.90));
        // That's because Math.round() is a static utility method too.
    }
}
