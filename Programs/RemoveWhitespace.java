import java.util.Scanner;

public class RemoveWhitespace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Replace all whitespace characters using regex
        String noWhitespace = input.replaceAll("\\s+", "");

        System.out.println("String without whitespaces: " + noWhitespace);
    }
}
