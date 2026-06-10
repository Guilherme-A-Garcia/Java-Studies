// Object Oriented Programming - Overloaded constructors

public class Class41 {
    public static void main(String[] args){
        // Overloaded constructors allow a class to have multiple constructors with
        // different parameter lists. This lets you initialize an object in many different ways.

        // ... (By the way, if this seems smelly, it's because it CAN be, it's bad practice
        // to have too many constructors, so if there is a better way of accepting a dynamic
        // number of args, I'd like to avoid this!)

        // See "User.java" for context!

        User user1 = new User("JaneDoe");
        System.out.println("User 1's Username: " + user1.username);
        System.out.println("User 1's Email: " + user1.email);
        System.out.println("User 1's Age: " + user1.age + "\n");
        
        User user2 = new User("JohnDoe", "john.doe@gmail.com");
        System.out.println("User 2's Username: " + user2.username);
        System.out.println("User 2's Email: " + user2.email);
        System.out.println("User 2's Age: " + user2.age + "\n");

        User user3 = new User("JoeShmoe", "joe.shmoe@gmail.com", 23);
        System.out.println("User 3's Username: " + user3.username);
        System.out.println("User 3's Email: " + user3.email);
        System.out.println("User 3's Age: " + user3.age + "\n");

        User user4 = new User();
        System.out.println("User 4's Username: " + user4.username);
        System.out.println("User 4's Email: " + user4.email);
        System.out.println("User 4's Age: " + user4.age);
    }
}
