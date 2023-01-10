import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Timmy! Choose a number to count to: ");
        int input = scan.nextInt();


        // See Learn the Part for the instructions.



        System.out.println("treat, lets start!");
        for(int i = 0; i<= input; i++){
            System.out.print(i + " ");
        }

        scan.close();
    }
}
