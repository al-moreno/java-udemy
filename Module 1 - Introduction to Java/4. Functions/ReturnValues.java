import java.io.Externalizable;
import java.util.Scanner;

public class ReturnValues {
    
    private static Scanner scan = new Scanner(System.in);


    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid Dimensions");
            System.out.println(0);
        }

        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {

        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
                return "Language not available";
        }

    }

    public static void printArea(double length, double width, double area) {
        System.out.println("The room's length was: " + length + ". The room's width was: " + width
                + ". This resulted in an area of: " + area);

    }

    public static void main(String[] args) {

        double area1 = calculateArea(1, 2);
        printArea(1, 2, area1);
    
        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);
      
    }

}
