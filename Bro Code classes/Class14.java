// Strings - Managing substrings, building an e-mail slicer program

import java.util.Scanner;

public class Class14{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String email;
        String domain;
        String username;

        System.out.print("\nEnter your e-mail: ");
        email = scanner.nextLine();
        
        if(email.contains("@")){
            domain = email.substring(email.indexOf('@') + 1);
            username = email.substring(0, email.indexOf('@'));

            System.out.println("\nEmail: " + email);
            System.out.println("Domain: " + domain);
            System.out.println("Username: " + username + "\n");
        }
        else{
            System.out.println("\nThe entered e-mail is invalid!\n");
        }

        scanner.close();
    }
}