public class Friend {
    String name;

    // Instead of letting each object own their copy of numOfFriends, static means it's owned by the class Friend.
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends!");
    }
}
