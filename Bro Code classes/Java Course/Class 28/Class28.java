// Variables - Variable scopes

public class Class28 {

    static int x = 3; // This is a CLASS scope variable, similar to python globals, but for a class,
                      // which is, in this case, public class Class28.

    // Even if there are class variables with the same name as local variables, Java likes to prioritize
    // local ones.

    public static void main(String[] args){
        int x = 1;  // This is a local variable of main()
        System.out.println(x);
        doSomething();
    }

    static void doSomething(){
        int x = 2;  // This is a local variable of doSomething()
        System.out.println(x);
    }
}
