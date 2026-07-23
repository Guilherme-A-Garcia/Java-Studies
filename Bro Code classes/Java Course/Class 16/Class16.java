// Ternary Operator - One-liner conditionals, cool stuff

public class Class16 {
    public static void main(String[] args){
        // Ternary operator = (condition) ? ifTrue : ifFalse;

        // Variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        /* How this would be done without a ternary operator:

        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }  */

        // How it's done WITH a ternary operator:

        String failOrPass = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(failOrPass);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfTheDay = (hours >= 12) ? "P.M." : "A.M.";
        System.out.println(hours + timeOfTheDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
