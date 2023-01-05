import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.5 to access the link).

        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nWelcome to JavaGram! Let's sign you up.\n");
    
        
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        
        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();


        System.out.println("\nHow old are you?");
        int age = scan.nextInt();

        System.out.println("\nMake a username");  
        String throwAway = scan.nextLine();
        String userName = scan.nextLine();
        // If you experience trouble picking up the username, please carefully read the instructions on Learn the Part.
        
        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();

        System.out.println("\nWhat country is that?");
        String country = scan.nextLine();

        System.out.println("\nThank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.printf("\tFirst Name: %s", firstName);
        System.out.printf("\tLast Name: %s", lastName);
        System.out.printf("\tAge: %s", age);
        System.out.printf("\tUsername: %s", userName);
        System.out.printf("\tCity: %s", city);
        System.out.printf("\tCountry: %s", country);

        //close scanner. It's good practice :D ! 
        scan.close();
    }
}
