import java.util.Arrays;

public class TdArrays {
    public static void main(String[] args) {
        
    // int [][] grades = new int[3][4];

    // grades[0][0]=72;
    // grades[0][1]=74;
    // grades[0][2]=78;
    // grades[0][3]=76;

    // grades[1][0]=65;
    // grades[1][1]=64;
    // grades[1][2]=61;
    // grades[1][3]=67;

    // grades[2][0]=100;
    // grades[2][1]=99;
    // grades[2][2]=98;
    // grades[2][3]=97;

    // -- or --

    int[][] grades = {
        {72,73,74,75},
        {65,63,63,62},
        {100,99,98,97}
    };



    System.out.println("\n\tHarry: " +Arrays.toString(grades[0]));
    System.out.println("\tRon: " +Arrays.toString(grades[1]));
    System.out.println("\tHermione: " +Arrays.toString(grades[2]) + " \n");
    System.out.println("The hiest grade is: " + grades [2][0]);

    







    }
}
