import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array (binary search needs sorted array)
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter element to search: ");
        int num = sc.nextInt();

        // Binary Search
        int low = 0, high = n - 1, mid;
        int position = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == num) {
                position = mid; // element found
                break;
            } else if (arr[mid] < num) {
                low = mid + 1; // search in right half
            } else {
                high = mid - 1; // search in left half
            }
        }

        if (position == -1) {
            System.out.println("Element " + num + " not found in the array.");
        } else {
            System.out.println("Element " + num + " found at position " + (position + 1));
        }
    }
}
