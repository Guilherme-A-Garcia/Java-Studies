public class User {
    // Let's say these attributes are optional, we may or may not receive this data
    // when we create an User object, we can make multiple constructors for that.
    String username;
    String email;
    int age;

    User(){
        // In this case, we don't receive any data
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username){
        this.username = username;
        // In this type of scenario, you can pass default values for the rest:
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
