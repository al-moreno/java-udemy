public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;

        int[] randomNumArray = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber() };

        System.out.print("Here are the scores: ");
        
        for (int i = 0; i < randomNumArray.length; i++) {
            System.out.print(randomNumArray[i] + " ");
            
            if (randomNumArray[i] > highScore) {
                highScore = randomNumArray[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    public static int randomNumber() {
        double randomNumber = Math.random() * 50000;
        return (int) randomNumber;
    }

}
