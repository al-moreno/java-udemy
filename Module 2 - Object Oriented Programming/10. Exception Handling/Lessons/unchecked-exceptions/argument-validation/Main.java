import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        // user.setUsername(user.getUsername());
        String username = scanner.nextLine();
        if (username.isBlank()) {
            System.out.println("Invalid username");
        } else {
            user.setUsername(username);
        }

        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
        // user.setAge(scanner.nextInt());
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age < 1) {
                System.out.println("Invalid age");
            } else {
                user.setAge(age);
            }
        } else {
            scanner.nextLine();
        }

        scanner.close();
    }
}