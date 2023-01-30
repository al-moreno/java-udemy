public class Main {
    public static void main(String[] args) {
        // Creating two object contstructors from my Car class blueprint
        // Car nissan = new Car();
        // nissan.make = "Nissan";
        // nissan.price = 10000;
        // nissan.year = 2020;
        // nissan.color = "Green";

        // Car dodge = new Car();
        // dodge.make = "Dodge";
        // dodge.price = 20000;
        // dodge.year = 2019;
        // dodge.color = "Blue";

    //   With use of cunstructor in the car class we create objects
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
  
        Car dodge = new Car("Dodge", 10000, 2019, "Blue");

        // updating value using setter
        // nissan.setColor("Jet Black");
        // dodge.setColor("Midnight Blue");

        // nissan.setPrice(nissan.getPrice() / 2);
        // dodge.setPrice(dodge.getPrice() / 2);

        // calling copy constructor that takes the sources values and creates a new object rather than pointing to a reference of a pre-exising variable. 
        Car nissan2 = new Car(nissan);

        nissan2.setColor("Yellow");
        // nissan.setColor("Orange");
        // nissan2.setColor("Blue");
        // nissan.setColor("Purple");
        // nissan2.setColor("Fuchsia");
        // nissan.setColor("Beige");




        // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        // ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        // ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
        nissan.drive();
    }
}
