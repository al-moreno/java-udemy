import java.util.Scanner;

public class NewDice {

    public static Scanner scanner = new Scanner(System.in);

    public static int rollDice() {
        double randomNumber = (Math.random() * 6 + 1);
        return (int) randomNumber;
    }

    public static boolean checkWin(int sumOfRolls, int sumOfNumbers) {

        return (sumOfRolls < sumOfNumbers && sumOfNumbers - sumOfRolls < 3);
    }

    public static void checkValid(int num1, int num2, int num3) {

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Invalid range");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Invalid range");
            System.exit(0);
        }
    }

    public static void printStatement(int num1, int num2, int num3, int sumOfNumbers, int roll1, int roll2, int roll3,
            int sumOfRolls) {
        System.out.println(
                "\nYour numbers were: " + num1 + "   " + num2 + "   " + num3 + ". The sum is: " + sumOfNumbers);
        System.out.println("The computer generated numbers were: " + roll1 + "   " + roll2 + "   " + roll3
                + ". The sum is: " + sumOfRolls);
    }

    public static void main(String[] args) {

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 - 6: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        checkValid(num1, num2, num3);

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfRolls = roll1 + roll2 + roll3;

        printStatement(num1, num2, num3, sumOfNumbers, roll1, roll2, roll3, sumOfRolls);

        if (checkWin(sumOfRolls, sumOfNumbers)) {
            System.out.println("\nYou win!\n");
        } else {
            System.out.println("\n Sorry, you lose. \n");
        }
        scanner.close();
    }
}
