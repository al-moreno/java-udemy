public class JoiningStrings {
    public static void main(String[] args) {
        int year = 2000;
        String winner = "Spain";
        System.out.println(year);
        System.out.println(winner);
        // System.err.printf("The winners of the %s world cup is %s", year, winner);
        String announcment = "The winner of the "+ year + " world cup is " + winner +".";
        System.out.println(announcment);
    }
}
