import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

    //    System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int secret = 3;
       System.out.println("Guess the number.");
        int input = scan.nextInt();
        while(input != secret){
            System.out.println("Guess again");
           input = scan.nextInt();

        }
    }

 
}
