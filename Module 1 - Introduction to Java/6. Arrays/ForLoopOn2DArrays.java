public class ForLoopOn2DArrays {
    public static void main(String[] args) {
        

        int[][] grades = {
            {72,73,74,75},
            {65,63,63,62},
            {100,99,98,97}
        };

        for (int i = 0; i <grades.length; i++){
            for(int j=0; j<grades[i].length; j++){
                System.out.print( grades[i][j] + " ");

                if (i==0){
                    System.out.println("\n Harry's grades are: " + grades[0][j] + " ");
                }
                if (i==1){
                    System.out.println("\n Ron's grades are: " + grades[1][j] + " ");
                }
                if (i==2){
                    System.out.println("\n Her's grades are: " + grades[2][j] + " ");
                }
            }
            
           
        };




    }
}
