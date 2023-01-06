import java.util.Scanner;

public class Delership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to our dealership");
        System.out.println("\nEnter A if you are looking to buy a car \nor B if you are looking to sell a car.");

        String userInput = scan.nextLine();

        switch (userInput) {
            case "A":
                System.out.println("\nWhat is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("\nGreat, how about a Kia?");
                    System.out.println("\nDo you have insurance?[y/n]");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a driverslicnece [y/n]");
                    String dr = scan.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("y") && dr.equals("y") && creditScore >= 650) {
                        System.out.println("Sold!");
                    } else {
                        System.err.println("Sorry, can't sell");
                    }

                } else {
                    System.out.println("We don't have a car in that range, sorry");
                }

                break;
            case "B":
                System.out.println("How much is your car valued at?");
                int value = scan.nextInt();
                System.out.println("what is your selling price?");
                int sellingPrice = scan.nextInt();
                if (sellingPrice < value && sellingPrice < 30000) {
                    System.err.println("We will buy your car. Great doing business with you.");
                    break;
                } else {
                    System.out.println("Not intrested.");
                }
                break;
            default:
                System.out.println("Invalid input");
        }

        scan.close();
    }
}
