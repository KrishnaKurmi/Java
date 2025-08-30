import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int num = sc.nextInt();

        // Linear search
        int position = -1;  // to store index if found
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                position = i;  // store index
                break;         // stop after first match
            }
        }

        if (position == -1) {
            System.out.println("Element " + num + " not found in the array.");
        } else {
            System.out.println("Element " + num + " found at position " + (position + 1));
        }

    }
}
