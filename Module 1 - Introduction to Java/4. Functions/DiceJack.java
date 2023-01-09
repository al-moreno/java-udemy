import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("enter three numbers betwee 1 - 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        int sumOfNumers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;

        System.out.println("dice sum: " + sumOfDiceRolls + ". num sum: " + sumOfNumers);

        if (checkWinner(sumOfDiceRolls, sumOfNumers)) {
            System.out.println(" User Wins!!! ");
        } else if (checkTied(sumOfDiceRolls, sumOfNumers)) {
            System.out.println("We are tied");
        } else {
            System.out.println("computer wins. ");
        }
        scan.close();
    }

    public static int rollDice() {
        // 0-0.9999999999999
        double randomNumber = Math.random() * 6; // 0 - 5.999999999999
        randomNumber += 1; // 1 - 6.9999999999999

        return (int) randomNumber; // 1 - 6
    }

    public static boolean checkWinner(int sumOfDiceRolls, int sumOfNumers) {
        return (sumOfNumers > sumOfDiceRolls && sumOfNumers - sumOfDiceRolls < 3);

    }

    public static boolean checkTied(int sumOfDiceRolls, int sumOfNumers) {
        return (sumOfNumers == sumOfDiceRolls);
    }

}
