import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        // Check if the number starts with 0
        if (number.charAt(0) == '0') {
            System.out.println(number + " is NOT a Duck number (starts with 0).");
        } else {
            boolean hasZero = false;
            // Check for zero in the rest of the digits
            for (int i = 1; i < number.length(); i++) {
                if (number.charAt(i) == '0') {
                    hasZero = true;
                    break;
                }
            }

            if (hasZero)
                System.out.println(number + " is a Duck number.");
            else
                System.out.println(number + " is NOT a Duck number.");
        }

        sc.close();
    }
}
