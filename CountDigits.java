import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        // If number is 0, digit count is 1
        if (number == 0) {
            count = 1;
        } else {
            // Count digits
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("Total digits: " + count);
    }
}
