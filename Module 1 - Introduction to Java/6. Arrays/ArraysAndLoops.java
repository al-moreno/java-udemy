import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        // Old array where I cannot change the length but I can replace an element
        String[] menu = { "Expresso ", "Iced Coffee", "Macchiato" };
        System.out.println(Arrays.toString(menu));
        menu[2] = "latte";
        System.out.println(Arrays.toString(menu));
        // to add an additonal item, I will need to create a new array like below:
        String[] menu2023 = new String[4];
        for (int i = 0; i < menu.length; i++) {
            menu2023[i] = menu[i];

        }
        System.out.println(Arrays.toString(menu2023));
        menu2023[3]= "Macchiato";
        System.out.println(Arrays.toString(menu2023));
    }
}
