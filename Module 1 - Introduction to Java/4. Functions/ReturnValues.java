
public class ReturnValues {
    public static void main(String[] args) {

        double area1 = calculateArea(2.6, 3.2);
        printArea(2.3, 3.2, area1);

        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);

    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("invalid");
            System.exit(0);
        }
        double area = length * width;
        return area;

    }

    public static String explainArea(String language) {

        switch (language) {
            case "English":
                return "Area is length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "Area es isual a largo * ancho";
            default:
                return "language not available";

        }

    }

    public static void printArea(double length, double width, double area) {
        System.out.println(
                "A rectable with a length of " + length + " and a width of " + width + " has an area of " + area);

    }

}
