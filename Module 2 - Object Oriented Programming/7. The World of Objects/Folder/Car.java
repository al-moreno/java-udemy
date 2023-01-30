public class Car {
    // object blueprint
    String make;
    double price;
    int year;
    String color;

     // creating a constructor to create a car object and update its fields all in one line. A constructor runs as soon as I create an object. The purpose is to update an objects fields

     public Car(String make, double price, int year, String color){
        //matching objects to the fields
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
     }
}
