import java.util.Scanner;

public class DiceJack1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 - 6. ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("numbers cannot be less then 1");
            System.exit(0);
        }
        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("numbers cannot be less then 1");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumRandomrolls = roll1 + roll2 + roll3;

        System.out.println("The dice sum is: " + sumRandomrolls);
        System.out.println("Your number sum is " + sumOfNumbers);

        checkWinner(sumOfNumbers, sumRandomrolls);
        scan.close();
    }

    public static int rollDice() {
        int randomNumber = (int) (Math.random() * 6) + 1;
        return randomNumber;
    }

    public static void checkWinner(int sumOfNumbers, int sumRandomrolls) {

        if (sumRandomrolls < sumOfNumbers && sumOfNumbers - sumRandomrolls < 3) {
            System.out.println("Contrats, you win");
        } else {
            System.out.println("Sorry you loose");
        }
    }

}
