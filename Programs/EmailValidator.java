import java.util.Scanner;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        StringBuilder sb = new StringBuilder(email);

        int atIndex = -1;
        int dotAfterAt = -1;
        int atCount = 0;

        // Count '@' and find its index
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '@') {
                atCount++;
                atIndex = i;
            }
        }

        // Rule 1: Must contain exactly one '@'
        if (atCount != 1) return false;

        // Rule 2: '@' must not be at the start or end
        if (atIndex == 0 || atIndex == sb.length() - 1) return false;

        // Rule 3: '.' must appear after '@'
        for (int i = atIndex + 1; i < sb.length(); i++) {
            if (sb.charAt(i) == '.') {
                dotAfterAt = i;
                break;
            }
        }

        if (dotAfterAt == -1) return false;

        // Rule 4: '.' must not be at the end
        if (sb.charAt(sb.length() - 1) == '.') return false;

        // Rule 5: At least 2 characters after the last dot
        if (sb.length() - dotAfterAt - 1 < 2) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email address to validate: ");
        String email = sc.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid Email Address.");
        } else {
            System.out.println("Invalid Email Address.");
        }

        sc.close();
    }
}
