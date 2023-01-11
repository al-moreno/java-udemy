public class BreakAndContinue {
    public static void main(String[] args) {
        
        // // continue skips a run in the loop and continues to the next one.
        // for (int i = 0; i <=10; i++){
        //     if (i % 2 !=0){
        //         continue;
        //     } 
        //     // break ends the loop exectuiton once the condition is meet
        //     if (i == 8){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        for (int i=9; i > 0; i--) {
            if (i%2 == 0) {
                continue;
            } else if (i == 3) {
                break;
            }
            System.out.println(i);
         }


    }
}
