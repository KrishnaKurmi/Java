import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input elements and calculate sum
        System.out.println("Enter " + n + " element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];  // Add directly while taking input
        }

        // Calculate average
        double average = (double) sum / n;

        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);

    }
}
