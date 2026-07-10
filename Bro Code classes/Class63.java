// Object Oriented Programming - Anonymous classes

public class Class63{
    public static void main(String[] args){
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        // Add custom behavior without having to create a new class.
        // Often used for one time uses (TimerTask, Runnable, callbacks, etc)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Ayo man, what's up?");
            }
        };

        // Instead of creating a whole new "TalkingDog" class to override the Dog.speak() method,
        // you can simply create an anonymous class  

        dog1.speak();
        dog2.speak();
    }
}