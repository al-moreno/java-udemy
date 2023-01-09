import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String ready = scan.nextLine();

        if (ready.equals("yes")) {
            System.out.println("Great! ");
            System.out.println("rock - paper - scissors, shoot!");
            String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);

        } else {
            System.out.println("Darn, some other time...!");

        }

        scan.close();
    }

    public static String computerChoice() {
        double randomNumer = Math.random() * 3;
        int integer = (int) randomNumer;

        switch (integer) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";

        }

    }

    // Task 4 – Write a function that compares the choices and returns the result.
    // public static String compareChoices(int randomNumer, int userChoice) {

    // }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            result = "You loose";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose";
        } else if (yourChoice.equals(computerChoice)) {
            result = "its a tie";
        } else {
            System.out.println("invalid choice");
            System.exit(0);
        }

        return result;
    }

    // Task 5 – Write a function that prints your choice, the computer's, and the
    // result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice,
     * result)
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     * 
     *                       Inside the function:
     * 
     *                       1. prints everything:
     *                       – prints: You chose: <your choice>
     *                       – prints: The computer chose: <computer choice>
     *                       – prints: <result>
     */

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose: \t \t" + yourChoice);
        System.out.println("\nComputer chose: \t" + computerChoice +"\n");
        System.out.println(result);

    }
}
