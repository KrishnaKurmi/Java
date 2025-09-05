import java.util.Scanner;

public class PrintNameStyles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Normal
        System.out.println("Normal: " + name);

        // Upper case
        System.out.println("Upper case: " + name.toUpperCase());

        // Lower case
        System.out.println("Lower case: " + name.toLowerCase());

        // With spaces between characters
        System.out.print("With spaces: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        // Reverse name
        System.out.print("Reversed: ");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

    }
}
