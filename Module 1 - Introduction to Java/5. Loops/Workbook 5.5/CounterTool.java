import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

       // See detailed instructions on Learn the Part.
        System.out.println("1. Pick a number to count by:");
        int numberToCountBy = scan.nextInt();

        System.out.println("2. Pick a number to start counting from:");
        int numToCountFrom = scan.nextInt();

        System.out.println("3. Pick a number to count to:");
        int numToCountTo = scan.nextInt();

        for(int i = numToCountFrom; i<= numToCountTo; i+=numberToCountBy){
            System.out.print(i + " ");

        }

        scan.close();
    }

    
}
