public class Main {
    public static void main(String[] args) {
        //utilizing class of car
        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.price = 10000;
        nissan.year = 2020;
        nissan.color = "Green";
        // same results usilizing a constructor
         Car dodge = new Car ();
        dodge.make = "Dodge";
        dodge.price = 29999;
        dodge.year = 2018;
        dodge.color = "blue";

        System.out.println("This " + nissan.make + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price +
                ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
    }

}