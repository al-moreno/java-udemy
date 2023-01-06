public class Calendar {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions (link in resources folder of
        // Udemy video).

        String day = "Monday"; // Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");

        System.out.println("Hmm, let me check my calendar.");

       

        // Check 'calendar' here:

        switch (day) {
            case "Monday":
                System.out.println("Its Monday, I work.");
                break;
            case "Tuesday":
                System.out.println("Its a work day");
                break;
            case "Wednesday":
                System.out.println("You know I work");
                break;
            case "Thursday":
                System.out.println("Its thursday...");
                break;
            case "Friday":
                System.out.println("Perhaps");
                break;
            case "Saturday":
                System.out.println("Sure!");
                break;
            case "Sunday":
                System.out.println("Lets do it");
                break;
        }

    }
}
