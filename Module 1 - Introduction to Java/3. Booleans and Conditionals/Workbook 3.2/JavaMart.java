public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        double toyCar = 5.99;
        System.out.println("\nCan I get this car?");

        // if you have enough money
        // print: Sure!
        // pay for the toy car

        // else: Sorry, I only have <wallet> left.
        if (wallet > toyCar) {
            System.out.println("Sure!Pay for the toy car.");
        } else {
            System.out.printf("Sorry, I only have %s left.", wallet);
        }
        wallet -= toyCar;
        double nike = 95.99;
        System.out.println("\nCan I get these nike shoes?");
        // if you have enough money
        // print: Sure!
        // pay for the nike shoes

        // else: Sorry, I only have <wallet> left.
        if (wallet > nike) {
            System.out.println("Sure!Pay for the nike shoes.");
        } else {
            System.out.printf("Sorry, I only have %s left.\n\n", wallet);
        }

    }
}
