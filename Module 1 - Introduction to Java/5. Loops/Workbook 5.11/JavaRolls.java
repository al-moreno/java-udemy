import java.util.Scanner;

public class JavaRolls {

    public static int rollDice() {
        double randomNumber = (Math.random() * 6) + 1;
        return (int) randomNumber;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println(
                " Great, here are the rules:\n - If you roll a 6, the game stops.\n - If you roll a 4, nothing happens. \n - Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        int score = 0;
        while (true) {

            scan.nextLine();
            int diceRoll = rollDice();
            System.out.print("You Rolled a " + diceRoll);
            if (diceRoll == 6) {
                System.out.print(" End of game. Your score is: "+ score);
                break;
            } else if (diceRoll == 4) {
                System.out.print(" Zero points. Keep Rolling. Your score is: "+ score);
            
            } else {
                score++;
                System.out.println(" One Point. Keep Rolling. Your score is: "+ score);

            }
        }
        if (score >= 3){
            System.out.println("\nWow, that's lucky. You win!");
        } else {
         System.out.println("   Tough luck, you lose :(");

        }

    }

}
