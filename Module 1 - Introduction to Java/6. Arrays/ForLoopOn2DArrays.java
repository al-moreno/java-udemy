public class ForLoopOn2DArrays {
    public static void main(String[] args) {

        int[][] grades = {
                { 72, 73, 74, 75 },
                { 65, 63, 63, 62 },
                { 100, 99, 98, 97 }
        };

        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("\n\tHarry: ");
                    break;
                case 1:
                System.out.print("\tRon: ");
                break;
                case 2:
                System.out.print("\tHermione: ");
                break;
                default: System.out.println("");
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");

            }
            System.out.println("\n");

        }
        ;

    }
}
