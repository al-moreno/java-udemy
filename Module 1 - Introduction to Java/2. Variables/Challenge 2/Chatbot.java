//import Scanner
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        Scanner scanner = new Scanner(System.in);
        //set up scanner. 

        System.out.println("\nHello. What is your name?");
        //Pick up user's name and store it. 
        String name = scanner.nextLine();
                           
        //add new a line before asking next question. 
        System.out.printf("\nHi %s! I'm Javabot. Where are you from?", name);
        //Pick up user's home and store it. 
        String home = scanner.nextLine();           

        //add new a line before asking next question.
        System.out.printf("\nI hear it's beautiful at %s! I'm from a place called Oracle", home);
        System.out.println("How old are you?");
        //Pick up age and store it.
        int age = scanner.nextInt();


        //add new a line before asking next question.
        System.out.printf("So you're %s, cool! I'm 400 years old.", age);
        System.out.println("\nThis means I'm "+ ((double)400/age) + " times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        String throwOut = scanner.nextLine();
        String language = scanner.nextLine();

        //add new a line here.
        System.out.printf("\n%s, that's great! Nice chatting with you %s. I have to log off now. See ya!", language, name);
        
        //close scanner. 
        scanner.close();
        
    }
}
