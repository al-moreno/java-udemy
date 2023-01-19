import java.beans.ExceptionListener;

public class ReturnValues {
    public static void main(String[] args) {

        double area1 = calculateArea(2.6, 3.2);
        printArea(2.6, 3.2, area1);
        // double area2 = calculateArea(2.6, 3.2);
        // double area3 = calculateArea(2.6, 3.2);

        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);
        // String frenchExplanation = explainArea("French");
        // String spanishExplanation = explainArea("Spanish");
        // String otherExplanation = explainArea("Italian");

    }
    

    public static double calculateArea(double length, double width) {

        if (length < 0 || width < 0) {
            System.out.println("Invalid Dementions");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {

        switch (language) {
            case "English":
                return "Area is length * width\n";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "Area es isual a largo * ancho";
            default:
                return "Language not available";
        }
    }

    public static void printArea(double length, double width, double area){
        System.out.println("\nA rectable with a lenght of " + length + " length and a width of " + width+ ", has an area of "+ area+ ".");
    }

}
